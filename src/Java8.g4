/*
 * [The "BSD license"]
 *  Copyright (c) 2014 Terence Parr
 *  Copyright (c) 2014 Sam Harwell
 *  All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions
 *  are met:
 *
 *  1. Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *  2. Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *  3. The name of the author may not be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 *  IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 *  OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 *  IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 *  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 *  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 *  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 *  THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 *  THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/**
 * A Java 8 grammar for ANTLR 4 derived from the Java Language Specification
 * chapter 19.
 *
 * NOTE: This grammar results in a generated parser that is much slower
 *       than the Java 7 grammar in the grammars-v4/java directory. This
 *     one is, however, extremely close to the spec.
 *
 * You can test with
 *
 *  $ antlr4 Java8.g4
 *  $ javac *.java
 *  $ grun Java8 compilationUnit *.java
 *
 * Or,
~/antlr/code/grammars-v4/java8 $ java Test .
/Users/parrt/antlr/code/grammars-v4/java8/./Java8BaseListener.java
/Users/parrt/antlr/code/grammars-v4/java8/./Java8Lexer.java
/Users/parrt/antlr/code/grammars-v4/java8/./Java8Listener.java
/Users/parrt/antlr/code/grammars-v4/java8/./Java8Parser.java
/Users/parrt/antlr/code/grammars-v4/java8/./Test.java
Total lexer+parser time 30844ms.
 */
grammar Java8;

@header {
    import java.util.ArrayList;
    import java.util.HashSet;
    import java.util.List;
    import java.util.Set;

    import com.binghamton.jhelp.*;
    import com.binghamton.jhelp.ast.*;
}

@parser::members {
    private void checkModifiers(List<Modifier> modifiers) {
        Set<Modifier> modSet = new HashSet<>();
        for (Modifier mod : modifiers) {
            if (!modSet.add(mod)) {
                // TODO throw error (notifyErrorListeners)
            }
        }
    }
}

/*
 * Productions from §3 (Lexical Structure)
 */

literal returns [Expression ret]
    locals [char last]
    :   i = IntegerLiteral
        {
            $last = $i.getText().charAt($i.getText().length()-1);
            if ($last == 'l' || $last == 'L') {
                $ret = new LiteralExpression($i, PrimitiveType.LONG);
            } else {
                $ret = new LiteralExpression($i, PrimitiveType.INT);
            }
        }
    |   f = FloatingPointLiteral
        {
            $last = $f.getText().charAt($f.getText().length()-1);
            if ($last == 'd' || $last == 'D') {
                $ret = new LiteralExpression($f, PrimitiveType.DOUBLE);
            } else {
                $ret = new LiteralExpression($f, PrimitiveType.FLOAT);
            }
        }
    |   b = BooleanLiteral
        {$ret = new LiteralExpression($b, PrimitiveType.BOOLEAN);}
    |   c = CharacterLiteral
        {$ret = new LiteralExpression($c, PrimitiveType.CHAR);}
    |   s = StringLiteral
        {$ret = new LiteralExpression($s, null);}
    |   n = NullLiteral
        {$ret = new LiteralExpression($n, null);}
    ;

/*
 * Productions from §4 (Types, Values, and Variables)
 */

type_ returns [Expression ret]
    :   p = primitiveType {$ret = $p.ret;}
    |   r = referenceType {$ret = $r.ret;}
    ;

primitiveType returns [IdentifierExpression ret]
    locals [List<Annotation> anns = new ArrayList<>()]
    :   (a = annotation {$anns.add($a.ret);})* n = numericType
        {$ret = new KeywordExpression($n.ret, $anns);}
    |   (a = annotation {$anns.add($a.ret);})* b = 'boolean'
        {$ret = new KeywordExpression($b, $anns);}
    ;

numericType returns [Token ret]
    :   i = integralType {$ret = $i.ret;}
    |   f = floatingPointType {$ret = $f.ret;}
    ;

integralType returns [Token ret]
    :   b = 'byte' {$ret = $b;}
    |   s = 'short' {$ret = $s;}
    |   i = 'int' {$ret = $i;}
    |   l = 'long' {$ret = $l;}
    |   c = 'char' {$ret = $c;}
    ;

floatingPointType returns [Token ret]
    :   f = 'float' {$ret = $f;}
    |   d = 'double' {$ret = $d;}
    ;

referenceType returns [Expression ret]
    :   c = classOrInterfaceType {$ret = $c.ret;}
    |   v = typeVariable {$ret = $v.ret;}
    |   a = arrayType {$ret = $a.ret;}
    ;

classOrInterfaceType returns [Expression ret]
    :   co = classType_lfno_classOrInterfaceType {$ret = $co.ret;}
        (   '.'
            c = classType_lfno_classOrInterfaceType
            {$ret = new AccessExpression($ret, $c.ret);}
        )*
    ;

classType returns [Expression ret]
    locals [List<Annotation> anns = new ArrayList<>(),
            List<TypeArgument> ls = new ArrayList<>()]
    :   (a = annotation {$anns.add($a.ret);})*
        id = Identifier
        {$ret = new IdentifierExpression($id, $anns);}
        (targs = typeArguments {$ret = new TypeExpression($ret, $targs.ret);})?
    |   st = classOrInterfaceType '.'
        (a = annotation {$anns.add($a.ret);})*
        id = Identifier
        {$ret = new AccessExpression($st.ret, new IdentifierExpression($id, $anns));}
        (targs = typeArguments {$ret = new TypeExpression($ret, $targs.ret);})?
    ;

classType_lfno_classOrInterfaceType returns [Expression ret]
    locals [List<Annotation> ans = new ArrayList<>()]
    :   (a = annotation {$ans.add($a.ret);})*
        id = Identifier
        {$ret = new IdentifierExpression($id, $ans);}
        (
            targs = typeArguments
            {$ret = new TypeExpression($ret, $targs.ret);}
        )?
    ;

typeVariable returns [Expression ret]
    locals [List<Annotation> ans = new ArrayList<>()]
    :   (a = annotation {$ans.add($a.ret);})* id = Identifier
        {$ret = new IdentifierExpression($id, $ans);}
    ;

arrayType returns [ArrayTypeExpression ret]
    :   p = primitiveType d = dims
        {$ret = new ArrayTypeExpression($p.ret, $d.ret);}
    |   c = classOrInterfaceType d = dims
        {$ret = new ArrayTypeExpression($c.ret, $d.ret);}
    |   v = typeVariable d = dims
        {$ret = new ArrayTypeExpression($v.ret, $d.ret);}
    ;

dims returns [List<Dimension> ret]
    locals [List<Annotation> ans = new ArrayList<>(),
            List<Dimension> ls = new ArrayList<>()]
    :   (a1 = annotation {$ans.add($a1.ret);})* first = '[' last = ']'
        {$ls.add(new Dimension($first, $last, $ans));}
        (
            {$ans.clear();}
            (a = annotation {$ans.add($a.ret);})* f = '[' l = ']'
            {$ls.add(new Dimension($f, $l, $ans));}
        )*
        {$ret = $ls;}
    ;

typeParameter returns [TypeParameter ret]
    locals [List<Annotation> ans = new ArrayList<>(),
            List<Expression> ls = new ArrayList<>()]
    :   (a = typeParameterModifier {$ans.add($a.ret);})*
        id = Identifier (b = typeBound {$ls = $b.ret;})?
        {$ret = new TypeParameter($id, $ans, $ls);}
    ;

typeParameterModifier returns [Annotation ret]
    :   a = annotation {$ret = $a.ret;}
    ;

typeBound returns [List<Expression> ret]
    locals [List<Expression> ls = new ArrayList<>()]
    :   'extends' v = typeVariable {$ls.add($v.ret); $ret = $ls;}
    |   'extends' c = classOrInterfaceType {$ls.add($c.ret);}
        (a = additionalBound {$ls.add($a.ret);})*
        {$ret = $ls;}
    ;

additionalBound returns [Expression ret]
    :   '&' i = classType {$ret = $i.ret;}
    ;

typeArguments returns [List<TypeArgument> ret]
    :   '<' ls = typeArgumentList '>' {$ret = $ls.ret;}
    ;

typeArgumentList returns [List<TypeArgument> ret]
   locals [List<TypeArgument> ls = new ArrayList<>()]
    :   a1 = typeArgument {$ls.add($a1.ret);}
        (',' a = typeArgument {$ls.add($a.ret);})*
        {$ret = $ls;}
    ;

typeArgument returns [TypeArgument ret]
    :   r = referenceType {$ret = new TypeArgument($r.ret);}
    |   w = wildcard {$ret = $w.ret;}
    ;

wildcard returns [TypeArgument ret]
    locals [List<Annotation> ans = new ArrayList<>()]
    :   (a = annotation {$ans.add($a.ret);})* w = '?'
        {$ret = new TypeArgument($w, $ans);}
        (wildcardBounds[$ret])?
    ;

wildcardBounds [TypeArgument ret]
    :   'extends' r = referenceType
        {$ret.setBoundType($r.ret); $ret.setIsUpperBounded(true);}
    |   'super' r = referenceType
        {$ret.setBoundType($r.ret); $ret.setIsUpperBounded(false);}
    ;

/*
 * Productions from §6 (Names)
 */
typeName returns [Expression ret]
    :   id = Identifier { $ret = new IdentifierExpression($id); }
    |   p = packageOrTypeName '.' id = Identifier
        { $ret = new AccessExpression($p.ret, $id); }
    ;

packageOrTypeName returns [Expression ret]
    :   id = Identifier { $ret = new IdentifierExpression($id); }
    |   p = packageOrTypeName '.' id = Identifier
        { $ret = new AccessExpression($p.ret, $id); }
    ;

expressionName returns [Expression ret]
    :   id = Identifier { $ret = new IdentifierExpression($id); }
    |   a = ambiguousName '.' id = Identifier
        { $ret = new AccessExpression($a.ret, $id); }
    ;

ambiguousName returns [Expression ret]
    :   id = Identifier { $ret = new IdentifierExpression($id); }
    |   a = ambiguousName '.' id = Identifier
        { $ret = new AccessExpression($a.ret, $id); }
    ;

/*
 * Productions from §7 (Packages)
 */

compilationUnit returns [CompilationUnit ret]
    locals [List<ImportStatement> imports = new ArrayList<>(),
            List<BodyDeclaration> bodies = new ArrayList<>(),
            PackageStatement stmt = null]
    :   (p = packageDeclaration {$stmt = $p.ret;})?
        (i = importDeclaration {$imports.add($i.ret);})*
        (t = typeDeclaration {$bodies.add($t.ret);})*
        EOF
        {$ret = new CompilationUnit($stmt, $imports, $bodies);}
    ;

packageDeclaration returns [PackageStatement ret]
    locals [ List<Annotation> anns = new ArrayList<>(),
             List<Token> ids = new ArrayList<>()]
    :   (a = packageModifier {$anns.add($a.ret);})* kw = 'package'
        (id = Identifier {$ids.add($id);})
        ('.' id = Identifier {$ids.add($id);})* last = ';'
        { $ret = new PackageStatement($ids, $kw, $last, $anns);}
    ;

packageModifier returns [Annotation ret]
    :   an = annotation {$ret = $an.ret;}
    ;

importDeclaration returns [ImportStatement ret]
    :   s = singleTypeImportDeclaration {$ret = $s.ret;}
    |   t = typeImportOnDemandDeclaration {$ret = $t.ret;}
    |   ss = singleStaticImportDeclaration {$ret = $ss.ret;}
    |   si = staticImportOnDemandDeclaration {$ret = $si.ret;}
    ;

singleTypeImportDeclaration returns [ImportStatement ret]
    :   kw = 'import' t = typeName last = ';'
        { $ret = new ImportStatement($kw, $last, $t.ret, false, false); }
    ;

typeImportOnDemandDeclaration returns [ImportStatement ret]
    :   kw = 'import' p = packageOrTypeName '.' '*' last = ';'
        {$ret = new ImportStatement($kw, $last, $p.ret, false, true);}
    ;

singleStaticImportDeclaration returns [ImportStatement ret]
    :   kw = 'import' 'static' t = typeName '.' id = Identifier last = ';'
        {$ret = new ImportStatement($kw,
                                    $last,
                                    new AccessExpression($t.ret, $id),
                                    true,
                                    false);}
    ;

staticImportOnDemandDeclaration returns [ImportStatement ret]
    :   kw = 'import' 'static' t = typeName '.' '*' last = ';'
        {$ret = new ImportStatement($kw, $last, $t.ret, true, true);}
    ;

typeDeclaration returns [BodyDeclaration ret]
    :   c = classDeclaration {$ret = $c.ret;}
    |   i = interfaceDeclaration {$ret = $i.ret;}
    |   ';'
    ;

/*
 * Productions from §8 (Classes)
 */

classDeclaration returns [ConcreteBodyDeclaration ret]
    :   n = normalClassDeclaration {$ret = $n.ret;}
    |   e = enumDeclaration {$ret = $e.ret;}
    ;

normalClassDeclaration returns [ClassDeclaration ret]
    locals [List<Modifier> mods = new ArrayList<>(),
            List<Annotation> ans = new ArrayList<>(),
            List<TypeParameter> tpars = new ArrayList<>(),
            Expression scls = new NilExpression(),
            List<Expression> sis = new ArrayList<>()]
    :   (
            (m = classModifier {$mods.add($m.ret);}) |
            (a = annotation {$ans.add($a.ret);})
        )*
        {checkModifiers($mods);}
        kw = 'class' n = Identifier
        (p = typeParameters {$tpars = $p.ret;})?
        (sc = superclass {$scls = $sc.ret;})?
        (si = superinterfaces {$sis = $si.ret;})?
        {$ret = new ClassDeclaration($n,
                                     $kw,
                                     $mods,
                                     $ans,
                                     $sis,
                                     $tpars,
                                     $scls);}
        classBody[$ret]
    ;

classModifier returns [Modifier ret]
    :   pu = 'public' {$ret = new Modifier($pu);}
    |   pro = 'protected' {$ret = new Modifier($pro);}
    |   pri = 'private' {$ret = new Modifier($pri);}
    |   ab = 'abstract' {$ret = new Modifier($ab);}
    |   st = 'static' {$ret = new Modifier($st);}
    |   f = 'final' {$ret = new Modifier($f);}
    |   fp = 'strictfp' {$ret = new Modifier($fp);}
    ;

typeParameters returns [List<TypeParameter> ret]
    :   '<' t = typeParameterList '>' {$ret = $t.ret;}
    ;

typeParameterList returns [List<TypeParameter> ret]
    locals [List<TypeParameter> ls = new ArrayList<>()]
    :   (t1 = typeParameter {$ls.add($t1.ret);})
        (',' t = typeParameter {$ls.add($t.ret);})*
        {$ret = $ls;}
    ;

superclass returns [Expression ret]
    :   'extends' c = classType {$ret = $c.ret;}
    ;

superinterfaces returns [List<Expression> ret]
    :   'implements' i = interfaceTypeList {$ret = $i.ret;}
    ;

interfaceTypeList returns [List<Expression> ret]
    locals [List<Expression> ls = new ArrayList<>()]
    :   (i1 = classType {$ls.add($i1.ret);})
        (',' i = classType {$ls.add($i.ret);})*
        {$ret = $ls;}
    ;

classBody [ConcreteBodyDeclaration ret]
    :   first = '{' (classBodyDeclaration[$ret])* last = '}'
        {$ret.setFirstToken($first); $ret.setLastToken($last);}
    ;

classBodyDeclaration [ConcreteBodyDeclaration ret]
    :   classMemberDeclaration[$ret]
    |   i = instanceInitializer {$ret.addInstanceInitializer($i.ret);}
    |   s = staticInitializer {$ret.addStaticInitializer($s.ret);}
    |   ct = constructorDeclaration {$ret.addConstructor($ct.ret);}
    ;

classMemberDeclaration [ConcreteBodyDeclaration ret]
    :   f = fieldDeclaration[ret]
    |   m = methodDeclaration {$ret.addMethod($m.ret);}
    |   c = classDeclaration {$ret.addInnerBody($c.ret);}
    |   i = interfaceDeclaration {$ret.addInnerInterface($i.ret);}
    |   ';'
    ;

fieldDeclaration [BodyDeclaration decl]
    locals [List<Modifier> mods = new ArrayList<>(),
            List<Annotation> ans = new ArrayList<>()]
    :   (
            (m = fieldModifier {$mods.add($m.ret);}) |
            (a = annotation {$ans.add($a.ret);})
        )*
        {checkModifiers($mods);}
        t = unannType
        variableDeclaratorList[$decl, $mods, $ans, $t.ret] ';'
    ;

fieldModifier returns [Modifier ret]
    :   pu = 'public' {$ret = new Modifier($pu);}
    |   pro = 'protected' {$ret = new Modifier($pro);}
    |   pri = 'private' {$ret = new Modifier($pri);}
    |   st = 'static' {$ret = new Modifier($st);}
    |   f = 'final' {$ret = new Modifier($f);}
    |   t = 'transient' {$ret = new Modifier($t);}
    |   v = 'volatile' {$ret = new Modifier($v);}
    ;

variableDeclaratorList [BodyDeclaration decl, List<Modifier> mods,
                        List<Annotation> ans, Expression t]
            returns [List<VariableDeclaration> ret]
    locals [List<VariableDeclaration> ls = new ArrayList<>()]
    :   (d1 = variableDeclarator[$decl, $mods, $ans, $t] {$ls.add($d1.ret);})
        (',' d = variableDeclarator[$decl, $mods, $ans, $t] {$ls.add($d.ret);})*
        {$ret = $ls;}
    ;

variableDeclarator [BodyDeclaration decl, List<Modifier> mods,
                    List<Annotation> ans, Expression t]
            returns [VariableDeclaration ret]
    locals [Expression type,
            VariableDeclaration var]
    :   id = variableDeclaratorId
        {
            $type = $t;
            if ($id.d.size() > 0) {
                $type = new ArrayTypeExpression($type, $id.d);
            }
            $var = new VariableDeclaration($id.ret, $type, $mods, $ans);
            if ($decl != null) {
                $decl.addField($var);
            }
        }
        ('=' in = variableInitializer {$var.setInitializer($in.ret);})?
        {$ret = $var;}
    ;

variableDeclaratorId returns [Token ret, List<Dimension> d]
    :   {$d = new ArrayList<Dimension>();}
        id = Identifier (ls = dims {$d = $ls.ret;})?
        {$ret = $id;}
    ;

typedVariableDeclaratorId [List<Modifier> mods,
                           List<Annotation> ans]
                          returns [VariableDeclaration ret]
    locals [Expression expr]
    :   t = unannType id = variableDeclaratorId
        {
            $expr = $t.ret;
            if ($id.d.size() > 0) {
                $expr = new ArrayTypeExpression($expr, $id.d);
            }
            $ret = new VariableDeclaration($id.ret, $expr, $mods, $ans);
        }
    ;

variableInitializer returns [Expression ret]
    :   ex = expression {$ret = $ex.ret;}
    |   a = arrayInitializer {$ret = $a.ret;}
    ;

unannType returns [Expression ret]
    :   p = unannPrimitiveType {$ret = new IdentifierExpression($p.ret);}
    |   r = unannReferenceType {$ret = $r.ret;}
    ;

unannPrimitiveType returns [Token ret]
    :   n = numericType {$ret = $n.ret;}
    |   b = 'boolean' {$ret = $b;}
    ;

unannReferenceType returns [Expression ret]
    :   c = unannClassOrInterfaceType {$ret = $c.ret;}
    |   v = unannTypeVariable {$ret = $v.ret;}
    |   a = unannArrayType {$ret = $a.ret;}
    ;

unannClassOrInterfaceType returns [Expression ret]
    :   (   cno = unannClassType_lfno_unannClassOrInterfaceType
            {$ret = $cno.ret;}
        )
        (   '.' c = classType_lfno_classOrInterfaceType
            {$ret = new AccessExpression($ret, $c.ret);}
        )*
    ;

unannClassType returns [Expression ret]
    :   u = unannClassType_lfno_unannClassOrInterfaceType {$ret = $u.ret;}
    |   a = unannClassOrInterfaceType '.'
        b = classType_lfno_classOrInterfaceType
        {$ret = new AccessExpression($a.ret, $b.ret);}
    ;

unannClassType_lfno_unannClassOrInterfaceType returns [Expression ret]
    :   id = Identifier
        {$ret = new IdentifierExpression($id);}
        (
            targs = typeArguments
            {$ret = new TypeExpression($ret, $targs.ret);}
        )?
    ;

unannTypeVariable returns [Expression ret]
    :   i = Identifier {$ret = new IdentifierExpression($i);}
    ;

unannArrayType returns [ArrayTypeExpression ret]
    :   p = unannPrimitiveType d = dims
        {$ret = new ArrayTypeExpression(new KeywordExpression($p.ret), $d.ret);}
    |   c = unannClassOrInterfaceType d = dims
        {$ret = new ArrayTypeExpression($c.ret, $d.ret);}
    |   v = unannTypeVariable d = dims
        {$ret = new ArrayTypeExpression($v.ret, $d.ret);}
    ;

methodDeclaration returns [MethodDeclaration ret]
    locals [List<Modifier> mods = new ArrayList<>(),
            List<Annotation> ans = new ArrayList<>()]
    :   (
            (m = methodModifier {$mods.add($m.ret);}) |
            (a = annotation {$ans.add($a.ret);})
        )*
        {checkModifiers($mods);}
        {$ret = new MethodDeclaration($mods, $ans);}
        methodHeader[$ret]
        b = methodBody {$ret.setBody($b.ret);}
    ;

methodModifier returns [Modifier ret]
    :   pu = 'public' {$ret = new Modifier($pu);}
    |   pro = 'protected' {$ret = new Modifier($pro);}
    |   pri = 'private' {$ret = new Modifier($pri);}
    |   ab = 'abstract' {$ret = new Modifier($ab);}
    |   st = 'static' {$ret = new Modifier($st);}
    |   f = 'final' {$ret = new Modifier($f);}
    |   s = 'synchronized' {$ret = new Modifier($s);}
    |   n = 'native' {$ret = new Modifier($n);}
    |   fp = 'strictfp' {$ret = new Modifier($fp);}
    ;

methodHeader [MethodDeclaration ret]
    locals [List<Annotation> ans = new ArrayList<>()]
    :   rt = result {$ret.setReturnType($rt.ret);} methodDeclarator[$ret]
        (th = throws_ {$ret.setExceptions($th.ret);})?
    |   tp = typeParameters {$ret.setTypeParameters($tp.ret);}
        (a = annotation {$ans.add($a.ret);})*
        {
            if ($ans.size() > 0) {
                $ret.setReturnTypeAnnotations($ans);
            }
        }
        rt = result {$ret.setReturnType($rt.ret);}
        methodDeclarator[$ret]
        (th = throws_ {$ret.setExceptions($th.ret);})?
    ;

result returns [Expression ret]
    :   u = unannType {$ret = $u.ret;}
    |   v = 'void' {$ret = new KeywordExpression($v);}
    ;

methodDeclarator [MethodDeclaration ret]
    :   n = Identifier {$ret.setName($n);}
        '(' (p = formalParameterList {$ret.setParameters($p.ret);})? ')'
        (d = dims
        {
            if ($d.ret.size() > 0) {
                $ret.setReturnType(new ArrayTypeExpression($ret.getReturnTypeExpression(),
                                                           $d.ret));
            }
        })?
    ;

formalParameterList returns [List<VariableDeclaration> ret]
    locals [List<VariableDeclaration> ls = new ArrayList<>()]
    :   (p = formalParameters {$ls.addAll($p.ret);}) ','
        (p2 = lastFormalParameter {$ls.add($p2.ret);})
        {$ret = $ls;}
    |   (f = lastFormalParameter {$ls.add($f.ret);})
        {$ret = $ls;}
    ;

formalParameters returns [List<VariableDeclaration> ret]
    locals [List<VariableDeclaration> ls = new ArrayList<>()]
    :   (p = formalParameter {$ls.add($p.ret);})
        (',' f = formalParameter {$ls.add($f.ret);})* {$ret = $ls;}
    |   (r = receiverParameter {$ls.add($r.ret);})
        (',' f = formalParameter {$ls.add($f.ret);})* {$ret = $ls;}
    ;

formalParameter returns [VariableDeclaration ret]
    locals [List<Modifier> mods = new ArrayList<>(),
            List<Annotation> ans = new ArrayList<>()]
    :   (
            (m = variableModifier {$mods.add($m.ret);}) |
            (a = annotation {$ans.add($a.ret);})
        )*
        {checkModifiers($mods);}
        v = typedVariableDeclaratorId[$mods, $ans] {$ret = $v.ret;}
    ;

variableModifier returns [Modifier ret]
    :   f = 'final' {$ret = new Modifier($f);}
    ;

lastFormalParameter returns [VariableDeclaration ret]
    locals [List<Modifier> mods = new ArrayList<>(),
            List<Annotation> ans = new ArrayList<>(),
            List<Annotation> ans2 = new ArrayList<>(),
            Expression type]
    :   (
            (m = variableModifier {$mods.add($m.ret);}) |
            (a = annotation {$ans.add($a.ret);})
        )*
        t = unannType
        (a = annotation {$ans2.add($a.ret);})*
        e = '...'
        n = variableDeclaratorId
        {
            $type = $t.ret;
            if ($n.d.size() > 0) {
                $type = new ArrayTypeExpression($type, $n.d);
            }
            $ret = new VariableDeclaration($n.ret, $type, $mods, $ans, $e, $ans2);
        }
    |   f = formalParameter {$ret = $f.ret;}
    ;

receiverParameter returns [VariableDeclaration ret]
    locals [List<Annotation> ans = new ArrayList<>()]
    :   (a = annotation {$ans.add($a.ret);})*
        t = unannType
        id = Identifier '.' 'this'
        {$ret = new VariableDeclaration($id, $t.ret,
                                        new ArrayList<Modifier>(), $ans);
         $ret.setReceiverParameter(true);}
    ;

throws_ returns [List<Expression> ret]
    :   'throws' e = exceptionTypeList {$ret = $e.ret;}
    ;

exceptionTypeList returns [List<Expression> ret]
    locals [List<Expression> ls = new ArrayList<>()]
    :   (e = exceptionType {$ls.add($e.ret);})
        (',' e = exceptionType {$ls.add($e.ret);})*
        {$ret = $ls;}
    ;

exceptionType returns [Expression ret]
    :   c = classType {$ret = $c.ret;}
    |   v = typeVariable {$ret = $v.ret;}
    ;

methodBody returns [Block ret]
    :   body = block {$ret = $body.ret;}
    |   ';' {$ret = new NilBlock();}
    ;

instanceInitializer returns [Block ret]
    :   body = block {$ret = $body.ret;}
    ;

staticInitializer returns [Block ret]
    :   kw = 'static' body = block
        {
            $ret = $body.ret;
            $body.ret.setFirstToken($kw);
        }
    ;

constructorDeclaration returns [MethodDeclaration ret]
    locals [List<Modifier> mods = new ArrayList<>(),
            List<Annotation> ans = new ArrayList<>()]
    :   (
            (m = constructorModifier {$mods.add($m.ret);}) |
            (a = annotation {$ans.add($a.ret);})
        )*
        {checkModifiers($mods);}
        {$ret = new MethodDeclaration($mods, $ans);}
        constructorDeclarator[$ret]
        (t = throws_ {$ret.setExceptions($t.ret);})?
        b = constructorBody {$ret.setBody($b.ret);}
    ;

constructorModifier returns [Modifier ret]
    :   pu = 'public' {$ret = new Modifier($pu);}
    |   pro = 'protected' {$ret = new Modifier($pro);}
    |   pri = 'private' {$ret = new Modifier($pri);}
    ;

constructorDeclarator [MethodDeclaration ret]
    :   (t = typeParameters {$ret.setTypeParameters($t.ret);})?
        n = Identifier {$ret.setName($n);}
        '(' (l = formalParameterList {$ret.setParameters($l.ret);})? ')'
    ;

constructorBody returns [Block ret]
    :    {$ret = new Block();}
        first = '{'
        (s = explicitConstructorInvocation {$ret.addStatement($s.ret);})?
        (st = blockStatements {$ret.addStatements($st.ret);})? last = '}'
        {$ret.setFirstToken($first);
         $ret.setLastToken($last);}
    ;

explicitConstructorInvocation returns [Expression ret]
    locals [List<TypeArgument> targs = new ArrayList<>(),
            List<Expression> args = new ArrayList<>(),
            Expression tmp]
    :   (t = typeArguments {$targs = $t.ret;})? kw = 'this'
        '(' (a = argumentList {$args = $a.ret;})? ')' last = ';'
        {$ret = new CallExpression($last, new KeywordExpression($kw),
                                   $args, $targs);}
    |   (t = typeArguments {$targs = $t.ret;})? kw = 'super'
        '(' (a = argumentList {$args = $a.ret;})? ')' last = ';'
        {$ret = new CallExpression($last, new KeywordExpression($kw),
                                   $args, $targs);}
    |   en = expressionName '.'
        (t = typeArguments {$targs = $t.ret;})? kw = 'super'
        '(' (a = argumentList {$args = $a.ret;})? ')' last = ';'
        {$ret = new CallExpression($last, new KeywordExpression($kw),
                                   $args, $targs);
         $ret = new AccessExpression($en.ret, $ret);}
    |   p = primary '.'
        (t = typeArguments {$targs = $t.ret;})? kw = 'super'
        '(' (a = argumentList {$args = $a.ret;})? ')' last = ';'
        {$ret = new CallExpression($last, new KeywordExpression($kw),
                                   $args, $targs);
         $ret = new AccessExpression($p.ret, $ret);}
    ;

enumDeclaration returns [EnumDeclaration ret]
    locals [List<Modifier> mods = new ArrayList<>(),
            List<Annotation> ans = new ArrayList<>(),
            List<Expression> sis = new ArrayList<>()]
    :   (
            (m = classModifier {$mods.add($m.ret);}) |
            (a = annotation {$ans.add($a.ret);})
        )*
        kw = 'enum' id = Identifier (il = superinterfaces {$sis = $il.ret;})?
        {$ret = new EnumDeclaration($id, $kw, $mods, $ans, $sis);}
        enumBody[$ret]
    ;

enumBody [EnumDeclaration ret]
    :   '{' (enumConstantList[$ret])? ','? (enumBodyDeclarations[$ret])?
        last = '}' {$ret.setLastToken($last);}
    ;

enumConstantList [EnumDeclaration ret]
    :   enumConstant[$ret] (',' enumConstant[$ret])*
    ;

enumConstant [EnumDeclaration ret]
    locals [List<Annotation> ans = new ArrayList<>(),
            EnumConstant cons,
            List<Expression> args = new ArrayList<>()]
    :   (an = annotation {$ans.add($an.ret);})*
        id = Identifier
        ('(' (a = argumentList {$args = $a.ret;})? ')')?
        {
            $cons = new EnumConstant($id, $ans, $args);
            $ret.addConstant($cons);
        }
        (classBody[$cons])?
    ;

enumBodyDeclarations [EnumDeclaration ret]
    :   ';' (classBodyDeclaration[$ret])*
    ;

/*
 * Productions from §9 (Interfaces)
 */

interfaceDeclaration returns [AbstractBodyDeclaration ret]
    :   n = normalInterfaceDeclaration {$ret = $n.ret;}
    |   a = annotationTypeDeclaration {$ret = $a.ret;}
    ;

normalInterfaceDeclaration returns [InterfaceDeclaration ret]
    locals [List<Modifier> mods = new ArrayList<>(),
            List<TypeParameter> tpars = new ArrayList<>(),
            List<Expression> eis = new ArrayList<>(),
            List<Annotation> ans = new ArrayList<>()]
    :   (
            (m = interfaceModifier {$mods.add($m.ret);}) |
            (a = annotation {$ans.add($a.ret);})
        )*
        {checkModifiers($mods);}
        kw = 'interface' id = Identifier
        (t = typeParameters {$tpars = $t.ret;})?
        (e = extendsInterfaces {$eis = $e.ret;})?
        {$ret = new InterfaceDeclaration($id, $kw, $mods, $ans, $eis, $tpars);}
        interfaceBody[$ret]
    ;

interfaceModifier returns [Modifier ret]
    :   pu = 'public' {$ret = new Modifier($pu);}
    |   pro = 'protected' {$ret = new Modifier($pro);}
    |   pri = 'private' {$ret = new Modifier($pri);}
    |   ab = 'abstract' {$ret = new Modifier($ab);}
    |   st = 'static' {$ret = new Modifier($st);}
    |   fp = 'strictfp' {$ret = new Modifier($fp);}
    ;

extendsInterfaces returns [List<Expression> ret]
    :   'extends' i = interfaceTypeList {$ret = $i.ret;}
    ;

interfaceBody [InterfaceDeclaration ret]
    :   '{' (interfaceMemberDeclaration[$ret])*
        last = '}' {$ret.setLastToken($last);}
    ;

interfaceMemberDeclaration [InterfaceDeclaration ret]
    :   constantDeclaration[$ret]
    |   im = interfaceMethodDeclaration {$ret.addMethod($im.ret);}
    |   cl = classDeclaration {$ret.addInnerBody($cl.ret);}
    |   id = interfaceDeclaration {$ret.addInnerInterface($id.ret);}
    |   ';'
    ;

constantDeclaration [BodyDeclaration decl]
    locals [List<Modifier> mods = new ArrayList<>(),
            List<Annotation> ans = new ArrayList<>()]
    :   (
            (m = constantModifier {$mods.add($m.ret);}) |
            (a = annotation {$ans.add($a.ret);})
        )*
        {checkModifiers($mods);}
        t = unannType
        variableDeclaratorList[$decl, $mods, $ans, $t.ret] ';'
    ;

constantModifier returns [Modifier ret]
    :   pu = 'public' {$ret = new Modifier($pu);}
    |   st = 'static' {$ret = new Modifier($st);}
    |   f = 'final' {$ret = new Modifier($f);}
    ;

interfaceMethodDeclaration returns [MethodDeclaration ret]
    locals [List<Modifier> mods = new ArrayList<>(),
            List<Annotation> ans = new ArrayList<>()]
    :   (
            (m = interfaceMethodModifier {$mods.add($m.ret);}) |
            (a = annotation {$ans.add($a.ret);})
        )*
        {checkModifiers($mods);}
        {$ret = new MethodDeclaration($mods, $ans);}
        (methodHeader[$ret])
        (b = methodBody {$ret.setBody($b.ret);})
    ;

interfaceMethodModifier returns [Modifier ret]
    :   pu = 'public' {$ret = new Modifier($pu);}
    |   ab = 'abstract' {$ret = new Modifier($ab);}
    |   d = 'default' {$ret = new Modifier($d);}
    |   st = 'static' {$ret = new Modifier($st);}
    |   fp = 'strictfp' {$ret = new Modifier($fp);}
    ;

annotationTypeDeclaration returns [AnnotationDeclaration ret]
    locals [List<Modifier> mods = new ArrayList<>(),
            List<Annotation> ans = new ArrayList<>()]
    :   (
            (m = interfaceModifier {$mods.add($m.ret);}) |
            (a = annotation {$ans.add($a.ret);})
        )*
        at = '@' 'interface' id = Identifier
        {$ret = new AnnotationDeclaration($id, $at, $mods, $ans);}
        annotationTypeBody[$ret]
    ;

annotationTypeBody [AnnotationDeclaration ret]
    :   '{' (annotationTypeMemberDeclaration[$ret])*
        last = '}' {$ret.setLastToken($last);}
    ;

annotationTypeMemberDeclaration [AnnotationDeclaration ret]
    :   a = annotationTypeElementDeclaration {$ret.addField($a.ret);}
    |   constantDeclaration[$ret]
    |   cl = classDeclaration {$ret.addInnerBody($cl.ret);}
    |   i = interfaceDeclaration {$ret.addInnerInterface($i.ret);}
    |   ';'
    ;

annotationTypeElementDeclaration returns [VariableDeclaration ret]
    locals [List<Modifier> mods = new ArrayList<>(),
            List<Dimension> ls = new ArrayList<>(),
            Expression expr = new NilExpression(),
            Expression type,
            List<Annotation> ans = new ArrayList<>()]
    :   (
            (m = annotationTypeElementModifier {$mods.add($m.ret);}) |
            (a = annotation {$ans.add($a.ret);})
        )*
        {checkModifiers($mods);}
        t = unannType id = Identifier '(' ')'
        (ds = dims {$ls = $ds.ret;})?
        (dv = defaultValue {$expr = $dv.ret;})? ';'
        {
            $type = $t.ret;
            if ($ls.size() > 0) {
                $type = new ArrayTypeExpression($type, $ls);
            }
            $ret = new VariableDeclaration($id, $type,
                                           $mods, $ans, $expr);
        }
    ;

annotationTypeElementModifier returns [Modifier ret]
    :   pu = 'public' {$ret = new Modifier($pu);}
    |   ab = 'abstract' {$ret = new Modifier($ab);}
    ;

defaultValue returns [Expression ret]
    :   'default' v = elementValue {$ret = $v.ret;}
    ;

annotation returns [Annotation ret]
    :   n = normalAnnotation {$ret = $n.ret;}
    |   m = markerAnnotation {$ret = $m.ret;}
    |   e = singleElementAnnotation {$ret = $e.ret;}
    ;

normalAnnotation returns [Annotation ret]
    :   at = '@' t = typeName
        {$ret = new Annotation($at, $t.ret);}
        '(' elementValuePairList[$ret]? last = ')'
        {$ret.setLastToken($last);}
    ;

elementValuePairList [Annotation ret]
    :   (elementValuePair[$ret])
        (',' elementValuePair[$ret])*
    ;

elementValuePair [Annotation ret]
    :   id = Identifier '=' v = elementValue
        {$ret.addArgument($id, $v.ret);}
    ;

elementValue returns [Expression ret]
    :   c = conditionalExpression {$ret = $c.ret;}
    |   i = elementValueArrayInitializer {$ret = $i.ret;}
    |   a = annotation {$ret = $a.ret;}
    ;

elementValueArrayInitializer returns [ArrayInitializer ret]
    locals [List<Expression> ls = new ArrayList<>()]
    :   first = '{' (l = elementValueList {$ls = $l.ret;})? ','? last = '}'
        {$ret = new ArrayInitializer($first, $last, $ls);}
    ;

elementValueList returns [List<Expression> ret]
    locals [List<Expression> ls = new ArrayList<>()]
    :   (v1 = elementValue {$ls.add($v1.ret);})
        (',' v = elementValue {$ls.add($v.ret);})*
        {$ret = $ls;}
    ;

markerAnnotation returns [Annotation ret]
    :   at = '@' t = typeName {$ret = new Annotation($at, $t.ret);}
    ;

singleElementAnnotation returns [Annotation ret]
    :   at = '@' t = typeName '(' v = elementValue last = ')'
        {$ret = new Annotation($at, $last, $t.ret, $v.ret);}
    ;

/*
 * Productions from §10 (Arrays)
 */

arrayInitializer returns [ArrayInitializer ret]
    locals [List<Expression> ls = new ArrayList<>()]
    :   first = '{' (l = variableInitializerList {$ls = $l.ret;})? ','?
        last = '}'
        {$ret = new ArrayInitializer($first, $last, $ls);}
    ;

variableInitializerList returns [List<Expression> ret]
    locals [List<Expression> ls = new ArrayList<>()]
    :   (i = variableInitializer {$ls.add($i.ret);})
        (',' v = variableInitializer {$ls.add($v.ret);})*
        {$ret = $ls;}
    ;

/*
 * Productions from §14 (Blocks and Statements)
 */

block returns [Block ret]
    :    {$ret = new Block();}
        first = '{' (s = blockStatements {$ret.addStatements($s.ret);})?
        last = '}'
        {$ret.setFirstToken($first);
         $ret.setLastToken($last);}
    ;

blockStatements returns [List<Statement> ret]
    locals [List<Statement> ls = new ArrayList<>()]
    :   (s = blockStatement {$ls.add($s.ret);})
        (b = blockStatement {$ls.add($b.ret);})*
        {$ret = $ls;}
    ;

blockStatement returns [Statement ret]
    :   d = localVariableDeclarationStatement {$ret = $d.ret;}
    |   c = classDeclaration {$ret = $c.ret;}
    |   st = statement {$ret = $st.ret;}
    ;

localVariableDeclarationStatement returns [LocalVariableStatement ret]
    :   d = localVariableDeclaration last = ';'
        {$ret = new LocalVariableStatement($last, $d.ret);}
    ;

localVariableDeclaration returns [List<VariableDeclaration> ret]
    locals [List<Modifier> mods = new ArrayList<>(),
            List<Annotation> ans = new ArrayList<>()]
    :   (
            (m = variableModifier {$mods.add($m.ret);}) |
            (a = annotation {$ans.add($a.ret);})
        )*
        t = unannType
        l = variableDeclaratorList[null, $mods, $ans, $t.ret]
        {$ret = $l.ret;}
    ;

statement returns [Statement ret]
    :   a = statementWithoutTrailingSubstatement {$ret = $a.ret;}
    |   b = labeledStatement {$ret = $b.ret;}
    |   c = ifThenStatement {$ret = $c.ret;}
    |   d = ifThenElseStatement {$ret = $d.ret;}
    |   e = whileStatement {$ret = $e.ret;}
    |   f = forStatement {$ret = $f.ret;}
    ;

statementNoShortIf returns [Statement ret]
    :   a = statementWithoutTrailingSubstatement {$ret = $a.ret;}
    |   b = labeledStatementNoShortIf {$ret = $b.ret;}
    |   c = ifThenElseStatementNoShortIf {$ret = $c.ret;}
    |   d = whileStatementNoShortIf {$ret = $d.ret;}
    |   e = forStatementNoShortIf {$ret = $e.ret;}
    ;

statementWithoutTrailingSubstatement returns [Statement ret]
    :   a = block {$ret = $a.ret;}
    |   b = emptyStatement {$ret = $b.ret;}
    |   c = expressionStatement {$ret = $c.ret;}
    |   d = assertStatement {$ret = $d.ret;}
    |   e = switchStatement {$ret = $e.ret;}
    |   f = doStatement {$ret = $f.ret;}
    |   g = breakStatement {$ret = $g.ret;}
    |   h = continueStatement {$ret = $h.ret;}
    |   i = returnStatement {$ret = $i.ret;}
    |   j = synchronizedStatement {$ret = $j.ret;}
    |   k = throwStatement {$ret = $k.ret;}
    |   l = tryStatement {$ret = $l.ret;}
    ;

emptyStatement returns [EmptyStatement ret]
    :   t = ';' {$ret = new EmptyStatement($t);}
    ;

labeledStatement returns [LabelStatement ret]
    :   id = Identifier ':' s = statement
        {$ret = new LabelStatement($id, $s.ret);}
    ;

labeledStatementNoShortIf returns [LabelStatement ret]
    :   id = Identifier ':' s = statementNoShortIf
        {$ret = new LabelStatement($id, $s.ret);}
    ;

expressionStatement returns [Statement ret]
    :   s = statementExpression last = ';'
        {$ret = $s.ret; $ret.setLastToken($last);}
    ;

statementExpression returns [Expression ret]
    :   a = assignment {$ret = $a.ret;}
    |   b = preIncrementExpression {$ret = $b.ret;}
    |   c = preDecrementExpression {$ret = $c.ret;}
    |   d = postIncrementExpression {$ret = $d.ret;}
    |   f = postDecrementExpression {$ret = $f.ret;}
    |   g = methodInvocation {$ret = $g.ret;}
    |   h = classInstanceCreationExpression {$ret = $h.ret;}
    ;

ifThenStatement returns [IfElseStatement ret]
    :   kw = 'if' '(' e = expression ')' s = statement
        {$ret = new IfElseStatement($kw, $e.ret, new Block($s.ret));}
    ;

ifThenElseStatement returns [IfElseStatement ret]
    :   kw = 'if' '(' e = expression ')' t = statementNoShortIf
        'else' el = statement
        {$ret = new IfElseStatement($kw,
                                    $e.ret,
                                    new Block($t.ret),
                                    new Block($el.ret));}
    ;

ifThenElseStatementNoShortIf returns [IfElseStatement ret]
    :   kw = 'if' '(' e = expression ')' t = statementNoShortIf
        'else' el = statementNoShortIf
        {$ret = new IfElseStatement($kw,
                                    $e.ret,
                                    new Block($t.ret),
                                    new Block($el.ret));}
    ;

assertStatement returns [AssertStatement ret]
    :   kw = 'assert' e = expression last = ';'
        {$ret = new AssertStatement($kw, $last, $e.ret);}
    |   kw = 'assert' e = expression ':' msg = expression last = ';'
        {$ret = new AssertStatement($kw, $last, $e.ret, $msg.ret);}
    ;

switchStatement returns [SwitchStatement ret]
    :   kw = 'switch' '(' e = expression ')' b = switchBlock
        {$ret = new SwitchStatement($kw, $b.last, $e.ret, $b.ret);}
    ;

switchBlock returns [List<CaseBlock> ret, Token last]
    locals [List<CaseBlock> blocks = new ArrayList<>()]
    :   '{' (m = switchBlockStatementGroup {$blocks.add($m.ret);})*
            (l = switchLabel {$blocks.add(new CaseBlock($l.ret));})*
        fin = '}' {$last = $fin;}
        {$ret = $blocks;}
    ;

switchBlockStatementGroup returns [CaseBlock ret]
    :   l = switchLabels s = blockStatements
        {$ret = new CaseBlock($l.ret, new Block($s.ret));}
    ;

switchLabels returns [List<Expression> ret]
    locals [List<Expression> lbls = new ArrayList<>()]
    :   (s = switchLabel {$lbls.add($s.ret);})
        (l = switchLabel {$lbls.add($l.ret);})*
        {$ret = $lbls;}
    ;

switchLabel returns [Expression ret]
    :   'case' c = constantExpression ':' {$ret = $c.ret;}
    |   'case' id = Identifier ':' {$ret = new IdentifierExpression($id);}
    |   kw = 'default' ':' {$ret = new IdentifierExpression($kw);}
    ;

whileStatement returns [WhileStatement ret]
    :   kw = 'while' '(' c = expression ')' s = statement
        {$ret = new WhileStatement($kw, $c.ret, new Block($s.ret));}
    ;

whileStatementNoShortIf returns [WhileStatement ret]
    :   kw = 'while' '(' c = expression ')' s = statementNoShortIf
        {$ret = new WhileStatement($kw, $c.ret, new Block($s.ret));}
    ;

doStatement returns [WhileStatement ret]
    :   kw = 'do' s = statement 'while' '(' c = expression ')' last = ';'
        {$ret = new WhileStatement($kw, $last, $c.ret, new Block($s.ret));}
    ;

forStatement returns [Statement ret]
    :   b = basicForStatement {$ret = $b.ret;}
    |   e = enhancedForStatement {$ret = $e.ret;}
    ;

forStatementNoShortIf returns [Statement ret]
    :   b = basicForStatementNoShortIf {$ret = $b.ret;}
    |   e = enhancedForStatementNoShortIf {$ret = $e.ret;}
    ;

basicForStatement returns [ForStatement ret]
    locals [List<Statement> forIn = new ArrayList<>(),
            List<Statement> forUp = new ArrayList<>(),
            Expression expr = new NilExpression()]
    :   kw = 'for' '(' (i = forInit {$forIn = $i.ret;})? ';'
                       (e = expression {$expr = $e.ret;})? ';'
                       (u = forUpdate {$forUp = $u.ret;})? ')'
        s = statement
        {$ret = new ForStatement($kw, $forIn, $expr, $forUp, new Block($s.ret));}
    ;

basicForStatementNoShortIf returns [ForStatement ret]
    locals [List<Statement> forIn = new ArrayList<>(),
            List<Statement> forUp = new ArrayList<>(),
            Expression expr = new NilExpression()]
    :   kw = 'for' '(' (i = forInit {$forIn = $i.ret;})? ';'
                       (e = expression {$expr = $e.ret;})? ';'
                       (u = forUpdate {$forUp = $u.ret;})? ')'
        s = statementNoShortIf
        {$ret = new ForStatement($kw, $forIn, $expr, $forUp, new Block($s.ret));}
    ;

forInit returns [List<Statement> ret]
    :   ls = statementExpressionList {$ret = $ls.ret;}
    |   d = localVariableDeclaration
        {
            $ret = new ArrayList<>();
            for (VariableDeclaration var : $d.ret) {
                $ret.add(var);
            }
        }
    ;

forUpdate returns [List<Statement> ret]
    :   ls = statementExpressionList {$ret = $ls.ret;}
    ;

statementExpressionList returns [List<Statement> ret]
    locals [List<Statement> ups = new ArrayList<>()]
    :   (s = statementExpression {$ups.add($s.ret);})
        (',' e = statementExpression {$ups.add($e.ret);})*
        { $ret = $ups;}
    ;

enhancedForStatement returns [ForEachStatement ret]
    locals [List<Modifier> mods = new ArrayList<>(),
            List<Annotation> ans = new ArrayList<>()]
    :   kw = 'for' '('
            (
                (m = variableModifier {$mods.add($m.ret);}) |
                (a = annotation {$ans.add($a.ret);})
            )*
                        v = typedVariableDeclaratorId[$mods, $ans] ':'
                        e = expression ')'
                        s = statement
        {$ret = new ForEachStatement($kw, $v.ret, $e.ret, new Block($s.ret));}
    ;

enhancedForStatementNoShortIf returns [ForEachStatement ret]
    locals [List<Modifier> mods = new ArrayList<>(),
            List<Annotation> ans = new ArrayList<>()]
    :   kw = 'for' '('
            (
                (m = variableModifier {$mods.add($m.ret);}) |
                (a = annotation {$ans.add($a.ret);})
            )*
                        v = typedVariableDeclaratorId[$mods, $ans] ':'
                        e = expression ')'
                        s = statementNoShortIf
        {$ret = new ForEachStatement($kw, $v.ret, $e.ret, new Block($s.ret));}
    ;

breakStatement returns [JumpStatement ret]
    locals [Token name = null]
    :   kw = 'break' (id = Identifier {$name = $id;})? last = ';'
        {$ret = new JumpStatement($kw, $last, $name);}
    ;

continueStatement returns [JumpStatement ret]
    locals [Token name = null]
    :   kw = 'continue' (id = Identifier {$name = $id;})? last = ';'
        {$ret = new JumpStatement($kw, $last, $name);}
    ;

returnStatement returns [ReturnStatement ret]
    :   kw = 'return' last = ';' {$ret = new ReturnStatement($kw, $last);}
    |   kw = 'return' e = expression last = ';'
        {$ret = new ReturnStatement($kw, $last, $e.ret);}
    ;

throwStatement returns [ThrowStatement ret]
    :   kw = 'throw' e = expression last = ';'
        {$ret = new ThrowStatement($kw, $last, $e.ret);}
    ;

synchronizedStatement returns [SynchronizedBlock ret]
    :   kw = 'synchronized' '(' e = expression ')' b = block
        {$ret = new SynchronizedBlock($kw, $e.ret, $b.ret);}
    ;

tryStatement returns [TryCatchBlock ret]
    locals [List<CatchBlock> ls = new ArrayList<>()]
    :   kw = 'try' t = block cs = catches
        {$ret = new TryCatchBlock($kw, $t.ret, $cs.ret);}
    |   kw = 'try' t = block (cs = catches {$ls = $cs.ret;})? f = finally_
        {$ret = new TryCatchBlock($kw, $t.ret, $ls, $f.ret);}
    |   r = tryWithResourcesStatement {$ret = $r.ret;}
    ;

catches returns [List<CatchBlock> ret]
    locals [List<CatchBlock> ls = new ArrayList<>()]
    :   f = catchClause {$ls.add($f.ret);} (c = catchClause {$ls.add($c.ret);})*
        {$ret = $ls;}
    ;

catchClause returns [CatchBlock ret]
    :   kw = 'catch'
        {$ret = new CatchBlock($kw);}
        '(' catchFormalParameter[$ret] ')'
        b = block
        {
            $ret.setStatements($b.ret.getStatements());
            $ret.setLastToken($b.ret.getLastToken());
        }
    ;

catchFormalParameter [CatchBlock ret]
    locals [List<Modifier> mods = new ArrayList<>(),
            List<Annotation> ans = new ArrayList<>()]
    :   (
            (m = variableModifier {$mods.add($m.ret);}) |
            (a = annotation {$ans.add($a.ret);})
        )*
        catchType[$ret]
        n = variableDeclaratorId
        {$ret.setVariable(new VariableDeclaration($n.ret, $mods, $ans));}
    ;

catchType [CatchBlock ret]
    :   (u = unannClassType {$ret.addExceptionType($u.ret);})
        ('|' c = classType {$ret.addExceptionType($c.ret);})*
    ;

finally_ returns [Block ret]
    :   'finally' body = block {$ret = $body.ret;}
    ;

tryWithResourcesStatement returns [TryCatchBlock ret]
    locals [List<CatchBlock> ls = new ArrayList<>(),
            Block fin = new NilBlock()]
    :   kw = 'try' r = resourceSpecification b = block
        (c = catches {$ls = $c.ret;})?
        (f = finally_ {$fin = $f.ret;})?
        {$ret = new TryCatchBlock($kw, $r.ret, $b.ret, $ls, $fin);}
    ;

resourceSpecification returns [List<VariableDeclaration> ret]
    :   {$ret = new ArrayList<>();}
        '(' (l = resourceList ';' {$ret = $l.ret;})? ')'
    ;

resourceList returns [List<VariableDeclaration> ret]
    locals [List<VariableDeclaration> vars = new ArrayList<>()]
    :   r = resource {$vars.add($r.ret);}
        (';' re = resource {$vars.add($re.ret);})*
        {$ret = $vars;}
    ;

resource returns [VariableDeclaration ret]
    locals [List<Modifier> mods = new ArrayList<>(),
            List<Annotation> ans = new ArrayList<>()]
    :    (
             (m = variableModifier {$mods.add($m.ret);}) |
             (a = annotation {$ans.add($a.ret);})
         )*
        v = typedVariableDeclaratorId[$mods, $ans] '='
        e = expression
        {
            $v.ret.setInitializer($e.ret);
            $ret = $v.ret;
        }
    ;

/*
 * Productions from §15 (Expressions)
 */

primary returns [Expression ret]
    :   (   pno = primaryNoNewArray_lfno_primary {$ret = $pno.ret;}
        |   a = arrayCreationExpression {$ret = $a.ret;}
        )
        (   p = primaryNoNewArray_lf_primary
            {
                if ($p.isAccess) {
                    $ret = new AccessExpression($ret, $p.ret);
                } else {
                    $ret = new MethodReferenceExpression($ret, $p.ret);
                }
            }
        )*
    ;

primaryNoNewArray returns [Expression ret]
    :   a1 = literal {$ret = $a1.ret;}
    |   a2 = primaryNoNewArray_typeAccess {$ret = $a2.ret;}
    |   kw = 'this' {$ret = new KeywordExpression($kw);}
    |   first = '(' p = expression last = ')'
        {$ret = $p.ret; $ret.setFirstToken($first); $ret.setLastToken($last);}
    |   a7 = classInstanceCreationExpression {$ret = $a7.ret;}
    |   a8 = fieldAccess {$ret = $a8.ret;}
    |   a9 = arrayAccess {$ret = $a9.ret;}
    |   a10 = methodInvocation {$ret = $a10.ret;}
    |   a11 = methodReference {$ret = $a11.ret;}
    ;

primaryNoNewArray_typeAccess returns [Expression ret]
    locals [List<Dimension> ls = new ArrayList<>(),
            Expression expr]
    :   id = Identifier
        (first = '[' last = ']' {$ls.add(new Dimension($first, $last));})*
        '.' kw = 'class'
        {
            $expr = new IdentifierExpression($id);
            if ($ls.size() > 0) {
                $expr = new ArrayTypeExpression($expr, $ls);
            }
            $ret = new AccessExpression($expr, new KeywordExpression($kw));
        }
    |   p = packageOrTypeName '.' id = Identifier
        (first = '[' last = ']' {$ls.add(new Dimension($first, $last));})*
        '.' kw = 'class'
        {
            $expr = new IdentifierExpression($id);
            if ($ls.size() > 0) {
                $expr = new ArrayTypeExpression($expr, $ls);
            }
            $ret = new AccessExpression(new AccessExpression($p.ret, $expr),
                                        new KeywordExpression($kw));
        }
    |   kv = 'void' '.' kc = 'class'
        {$ret = new AccessExpression(new KeywordExpression($kv),
                                     new KeywordExpression($kc));}
    |   a5 = typeName '.' kw = 'this'
        {
            $ret = new AccessExpression($a5.ret, new KeywordExpression($kw));
        }
    ;

primaryNoNewArray_lf_arrayAccess
    :
    ;

primaryNoNewArray_lfno_arrayAccess returns [Expression ret]
    :   a1 = literal {$ret = $a1.ret;}
    |   a2 = primaryNoNewArray_typeAccess {$ret = $a2.ret;}
    |   kw = 'this' {$ret = new KeywordExpression($kw);}
    |   first = '(' p = expression last = ')'
        {$ret = $p.ret; $ret.setFirstToken($first); $ret.setLastToken($last);}
    |   a5 = classInstanceCreationExpression {$ret = $a5.ret;}
    |   a6 = fieldAccess {$ret = $a6.ret;}
    |   a7 = methodInvocation {$ret = $a7.ret;}
    |   a8 = methodReference {$ret = $a8.ret;}
    ;

primaryNoNewArray_lf_primary returns [Expression ret, boolean isAccess]
    :   a1 = classInstanceCreationExpression_lf_primary {$ret = $a1.ret;
                                                         $isAccess = true;}
    |   a2 = fieldAccess_lf_primary {$ret = $a2.ret; $isAccess = true;}
    |   a3 = arrayAccess_lf_primary {$ret = $a3.ret; $isAccess = $a3.isAccess;}
    |   a4 = methodInvocation_lf_primary {$ret = $a4.ret; $isAccess = true;}
    |   a5 = methodReference_lf_primary {$ret = $a5.ret; $isAccess = false;}
    ;

primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary
    :
    ;

primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary returns [Expression ret,
                                                                  boolean isAccess]
    :   a1 = classInstanceCreationExpression_lf_primary {$ret = $a1.ret;
                                                         $isAccess = true;}
    |   a2 = fieldAccess_lf_primary {$ret = $a2.ret; $isAccess = true;}
    |   a3 = methodInvocation_lf_primary {$ret = $a3.ret; $isAccess = true;}
    |   a4 = methodReference_lf_primary {$ret = $a4.ret; $isAccess = false;}
    ;

primaryNoNewArray_lfno_primary returns [Expression ret]
    locals [List<Dimension> ls = new ArrayList<>(),
            Expression lhs]
    :   a1 = literal {$ret = $a1.ret;}
    |   a2 = primaryNoNewArray_typeAccess {$ret = $a2.ret;}
    |   a3 = unannPrimitiveType
        (first = '[' last = ']' {$ls.add(new Dimension($first, $last));})*
        '.' kw = 'class'
        {
            $lhs = new KeywordExpression($a3.ret);
            if ($ls.size() > 0) {
                $lhs = new ArrayTypeExpression($lhs, $ls);
            }
            $ret = new AccessExpression($lhs, new KeywordExpression($kw));
        }
    |   kw = 'this' {$ret = new KeywordExpression($kw);}
    |   first = '(' p = expression last = ')' {$ret = $p.ret;}
    |   a7 = classInstanceCreationExpression_lfno_primary {$ret = $a7.ret;}
    |   a8 = fieldAccess_lfno_primary {$ret = $a8.ret;}
    |   a9 = arrayAccess_lfno_primary {$ret = $a9.ret;}
    |   a10 = methodInvocation_lfno_primary {$ret = $a10.ret;}
    |   a11 = methodReference_lfno_primary {$ret = $a11.ret;}
    ;

primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary
    :
    ;

primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary returns [Expression ret]
    locals [List<Dimension> ls = new ArrayList<>(),
            Expression lhs]
    :   a1 = literal {$ret = $a1.ret;}
    |   a2 = primaryNoNewArray_typeAccess {$ret = $a2.ret;}
    |   a3 = unannPrimitiveType
        (first = '[' last = ']' {$ls.add(new Dimension($first, $last));})*
        '.' kw = 'class'
        {
            $lhs = new KeywordExpression($a3.ret);
            if ($ls.size() > 0) {
                $lhs = new ArrayTypeExpression($lhs, $ls);
            }
            $ret = new AccessExpression($lhs, new KeywordExpression($kw));
        }
    |   kw = 'this' {$ret = new KeywordExpression($kw);}
    |   first = '(' p = expression last = ')' {$ret = $p.ret;}
    |   a7 = classInstanceCreationExpression_lfno_primary {$ret = $a7.ret;}
    |   a8 = fieldAccess_lfno_primary {$ret = $a8.ret;}
    |   a9 = methodInvocation_lfno_primary {$ret = $a9.ret;}
    |   a10 = methodReference_lfno_primary {$ret = $a10.ret;}
    ;

classInstanceCreationExpression returns [Expression ret]
    locals [Expression methodExpr,
            List<Annotation> ans = new ArrayList<>(),
            List<Annotation> ans2 = new ArrayList<>(),
            ConcreteBodyDeclaration anon,
            InstantiationExpression inst,
            List<TypeArgument> targs = new ArrayList<>(),
            List<Expression> args = new ArrayList<>()]
    :   kw = 'new'
        (t = typeArguments {$targs = $t.ret;})?
        (a = annotation {$ans.add($a.ret);})*
        id = Identifier
        {
            $methodExpr = new IdentifierExpression($id, $ans);
        }

        ('.' (a2 = annotation {$ans2.add($a2.ret);})* id2 = Identifier
            {
                $methodExpr = new AccessExpression($methodExpr,
                                                   new IdentifierExpression($id2,
                                                                            $ans2));
                $ans2.clear();
            }
        )*
        (
            ta = typeArgumentsOrDiamond
            {
                $methodExpr = new TypeExpression($methodExpr, $ta.ret);
            }
        )?
        '(' (l = argumentList {$args = $l.ret;})? last = ')'
        {
            $inst = new InstantiationExpression($kw, $last,
                                                $methodExpr,
                                                $args, $targs);
            $anon = $inst.getAnonymousClass();
            $ret = $inst;
        }

        (classBody[$anon])?

    |   name = expressionName '.'
        kw = 'new' (t = typeArguments {$targs = $t.ret;})?
        (a = annotation {$ans.add($a.ret);})*
        id = Identifier
        {
            $methodExpr = new IdentifierExpression($id, $ans);
        }
        (
            ta = typeArgumentsOrDiamond
            {
                $methodExpr = new TypeExpression($methodExpr, $ta.ret);
            }
        )?
        '(' (l = argumentList {$args = $l.ret;})? last = ')'
        {
            $inst = new InstantiationExpression($kw, $last,
                                                $methodExpr,
                                                $args, $targs);
            $anon = $inst.getAnonymousClass();
            $ret = new AccessExpression($name.ret, $inst);
        }
        (classBody[$anon])?
    |   p = primary '.'
        kw = 'new' (t = typeArguments {$targs = $t.ret;})?
        (a = annotation {$ans.add($a.ret);})*
        id = Identifier
        {
            $methodExpr = new IdentifierExpression($id, $ans);
        }
        (
            ta = typeArgumentsOrDiamond
            {
                $methodExpr = new TypeExpression($methodExpr, $ta.ret);
            }
        )?
        '(' (l = argumentList {$args = $l.ret;})? last = ')'
        {
            $inst = new InstantiationExpression($kw, $last,
                                                $methodExpr,
                                                $args, $targs);
            $anon = $inst.getAnonymousClass();
            $ret = new AccessExpression($p.ret, $inst);
        }
        (classBody[$anon])?
    ;

classInstanceCreationExpression_lf_primary returns [InstantiationExpression ret]
    locals [List<Annotation> ans = new ArrayList<>(),
            ConcreteBodyDeclaration anon,
            InstantiationExpression inst,
            List<TypeArgument> targs = new ArrayList<>(),
            List<Expression> args = new ArrayList<>(),
            Expression methodExpr]
    :   '.'
        kw = 'new' (t = typeArguments {$targs = $t.ret;})?
        (a = annotation {$ans.add($a.ret);})*
        id = Identifier
        {
            $methodExpr = new IdentifierExpression($id, $ans);
        }
        (
            ta = typeArgumentsOrDiamond
            {
                $methodExpr = new TypeExpression($methodExpr, $ta.ret);
            }
        )?
        '(' (l = argumentList {$args = $l.ret;})? last = ')'
        {
            $inst = new InstantiationExpression($kw, $last,
                                                $methodExpr,
                                                $args, $targs);
            $anon = $inst.getAnonymousClass();
            $ret = $inst;
        }
        (classBody[$anon])?
    ;

classInstanceCreationExpression_lfno_primary returns [Expression ret]
    locals [Expression methodExpr,
            List<Annotation> ans = new ArrayList<>(),
            List<Annotation> ans2 = new ArrayList<>(),
            ConcreteBodyDeclaration anon,
            InstantiationExpression inst,
            List<TypeArgument> targs = new ArrayList<>(),
            List<Expression> args = new ArrayList<>()]
    :   kw = 'new' (t = typeArguments {$targs = $t.ret;})?
        (a = annotation {$ans.add($a.ret);})*
        id = Identifier
        {
            $methodExpr = new IdentifierExpression($id, $ans);
        }
        ('.' (a2 = annotation {$ans2.add($a2.ret);})* id2 = Identifier
            {
                $methodExpr = new AccessExpression($methodExpr,
                                                   new IdentifierExpression($id2,
                                                                            $ans2));
                $ans2.clear();
            }
        )*
        (
            ta = typeArgumentsOrDiamond
            {
                $methodExpr = new TypeExpression($methodExpr, $ta.ret);
            }
        )?
        '(' (l = argumentList {$args = $l.ret;})? last = ')'
        {
            $inst = new InstantiationExpression($kw, $last,
                                                $methodExpr,
                                                $args, $targs);
            $anon = $inst.getAnonymousClass();
            $ret = $inst;
        }
        (classBody[$anon])?
    |   name = expressionName '.'
        kw = 'new' (t = typeArguments {$targs = $t.ret;})?
        (a = annotation {$ans.add($a.ret);})*
        id = Identifier
        {
            $methodExpr = new IdentifierExpression($id, $ans);
        }
        (
            ta = typeArgumentsOrDiamond
            {
                $methodExpr = new TypeExpression($methodExpr, $ta.ret);
            }
        )?
        '(' (l = argumentList {$args = $l.ret;})? last = ')'
        {
            $inst = new InstantiationExpression($kw, $last,
                                                $methodExpr,
                                                $args, $targs);
            $anon = $inst.getAnonymousClass();
            $ret = new AccessExpression($name.ret, $inst);
        }
        (classBody[$anon])?
    ;

typeArgumentsOrDiamond returns [List<TypeArgument> ret]
    :   ta = typeArguments {$ret = $ta.ret;}
    |   '<' '>' {$ret = new ArrayList<>(); $ret.add(new TypeArgument());}
    ;

fieldAccess returns [AccessExpression ret]
    :   p = primary '.' id = Identifier
        {$ret = new AccessExpression($p.ret, $id);}
    |   kw = 'super' '.' id = Identifier
        {$ret = new AccessExpression(new KeywordExpression($kw), $id);}
    |   t = typeName '.' kw = 'super' '.' id = Identifier
        {$ret = new AccessExpression($t.ret,
                                     new AccessExpression(new KeywordExpression($kw),
                                                          $id));}
    ;

fieldAccess_lf_primary returns [IdentifierExpression ret]
    :   '.' id = Identifier {$ret = new IdentifierExpression($id);}
    ;

fieldAccess_lfno_primary returns [AccessExpression ret]
    :   kw = 'super' '.' id = Identifier
        {$ret = new AccessExpression(new KeywordExpression($kw), $id);}
    |   t = typeName '.' kw = 'super' '.' id = Identifier
        {
            $ret = new AccessExpression(new KeywordExpression($kw), $id);
            $ret = new AccessExpression($t.ret, $ret);
        }
    ;

arrayAccess returns [ArrayAccessExpression ret]
    :   (   (n = expressionName '[' i = expression last = ']'
                {$ret = new ArrayAccessExpression($last, $n.ret, $i.ret);})
        |   (pno = primaryNoNewArray_lfno_arrayAccess '[' i = expression last = ']'
                {$ret = new ArrayAccessExpression($last, $pno.ret, $i.ret);})
        )
        (   primaryNoNewArray_lf_arrayAccess '[' i = expression last = ']'
                {$ret = new ArrayAccessExpression($last, $ret, $i.ret);}
        )*
    ;

arrayAccess_lf_primary returns [ArrayAccessExpression ret, boolean isAccess]
    :   (   (pno = primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary
           '[' i = expression last = ']'
                {$ret = new ArrayAccessExpression($last, $pno.ret, $i.ret);
                 $isAccess = $pno.isAccess;})
        )
        (   primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary
            '[' i2 = expression last = ']'
            {$ret = new ArrayAccessExpression($last, $ret, $i2.ret);}
        )*
    ;

arrayAccess_lfno_primary returns [ArrayAccessExpression ret]
    :   (   (name = expressionName '[' i = expression last = ']'
                {$ret = new ArrayAccessExpression($last, $name.ret, $i.ret);})
        |   (pno = primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary
                '[' i = expression last = ']'
                {$ret = new ArrayAccessExpression($last, $pno.ret, $i.ret);})
        )
        (   primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary
            '[' i2 = expression last = ']'
            {$ret = new ArrayAccessExpression($last, $ret, $i2.ret);}
        )*
    ;

methodInvocation returns [Expression ret]
    locals [List<Expression> args = new ArrayList<>(),
            List<TypeArgument> targs = new ArrayList<>()]
    :   mn = Identifier '(' (a = argumentList {$args = $a.ret;})? last = ')'
        {$ret = new CallExpression($last, $mn, $args);}
    |   tn = typeName '.' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier '(' (a = argumentList {$args = $a.ret;})? last = ')'
        {$ret = new CallExpression($last, $id, $args, $targs);
         $ret = new AccessExpression($tn.ret, $ret);}
    |   en = expressionName '.' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier '(' (a = argumentList {$args = $a.ret;})? last = ')'
        {$ret = new CallExpression($last, $id, $args, $targs);
         $ret = new AccessExpression($en.ret, $ret);}
    |   p = primary '.' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier '(' (a = argumentList {$args = $a.ret;})? last = ')'
        {$ret = new CallExpression($last, $id, $args, $targs);
         $ret = new AccessExpression($p.ret, $ret);}
    |   kw = 'super' '.' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier '(' (a = argumentList {$args = $a.ret;})? last = ')'
        {$ret = new CallExpression($last, $id, $args, $targs);
         $ret = new AccessExpression(new KeywordExpression($kw), $ret);}
    |   tn = typeName '.' kw = 'super' '.' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier '(' (a = argumentList {$args = $a.ret;})? last = ')'
        {$ret = new CallExpression($last, $id, $args, $targs);
         $ret = new AccessExpression(new KeywordExpression($kw), $ret);
         $ret = new AccessExpression($tn.ret, $ret);}
    ;

methodInvocation_lf_primary returns [CallExpression ret]
    locals [List<Expression> args = new ArrayList<>(),
            List<TypeArgument> targs = new ArrayList<>()]
    :   '.' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier '(' (a = argumentList {$args = $a.ret;})? last = ')'
        {$ret = new CallExpression($last, $id, $args, $targs);}
    ;

methodInvocation_lfno_primary returns [Expression ret]
    locals [List<Expression> args = new ArrayList<>(),
            List<TypeArgument> targs = new ArrayList<>()]
    :   mn = Identifier '(' (a = argumentList {$args = $a.ret;})? last = ')'
        {$ret = new CallExpression($last, $mn, $args);}
    |   tn = typeName '.' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier '(' (a = argumentList {$args = $a.ret;})? last = ')'
        {$ret = new CallExpression($last, $id, $args, $targs);
         $ret = new AccessExpression($tn.ret, $ret);}
    |   en = expressionName '.' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier '(' (a = argumentList {$args = $a.ret;})? last = ')'
        {$ret = new CallExpression($last, $id, $args, $targs);
         $ret = new AccessExpression($en.ret, $ret);}
    |   kw = 'super' '.' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier '(' (a = argumentList {$args = $a.ret;})? last = ')'
        {$ret = new CallExpression($last, $id, $args, $targs);
         $ret = new AccessExpression(new KeywordExpression($kw), $ret);}
    |   tn = typeName '.' kw = 'super' '.' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier '(' (a = argumentList {$args = $a.ret;})? last = ')'
        {$ret = new CallExpression($last, $id, $args, $targs);
         $ret = new AccessExpression(new KeywordExpression($kw), $ret);
         $ret = new AccessExpression($tn.ret, $ret);}
    ;

argumentList returns [List<Expression> ret]
    locals [List<Expression> ls = new ArrayList<>()]
    :   (e = expression {$ls.add($e.ret);})
        (',' ex = expression {$ls.add($ex.ret);})* {$ret = $ls;}
    ;

methodReference returns [Expression ret]
    locals [Expression tmp,
            List<TypeArgument> targs = new ArrayList<>()]
    :   en = expressionName '::' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier
        {
            $ret = new IdentifierExpression($id);
            if ($targs.size() > 0) {
                $ret = new TypeExpression($ret, $targs);
            }
            $ret = new MethodReferenceExpression($en.ret, $ret);
        }
    |   r = referenceType '::' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier
        {
            $ret = new IdentifierExpression($id);
            if ($targs.size() > 0) {
                $ret = new TypeExpression($ret, $targs);
            }
            $ret = new MethodReferenceExpression($r.ret, $ret);
        }
    |   p = primary '::' (t = typeArguments {$targs = $t.ret;})? id = Identifier
        {
            $ret = new IdentifierExpression($id);
            if ($targs.size() > 0) {
                $ret = new TypeExpression($ret, $targs);
            }
            $ret = new MethodReferenceExpression($p.ret, $ret);
        }
    |   kw = 'super' '::' (t = typeArguments {$targs = $t.ret;})? id = Identifier
        {
            $ret = new IdentifierExpression($id);
            if ($targs.size() > 0) {
                $ret = new TypeExpression($ret, $targs);
            }
            $ret = new MethodReferenceExpression(new KeywordExpression($kw),
                                                 $ret);
        }
    |   tn = typeName '.' kw = 'super' '::'
        (t = typeArguments {$targs = $t.ret;})? id = Identifier
        {
            $ret = new IdentifierExpression($id);
            if ($targs.size() > 0) {
                $ret = new TypeExpression($ret, $targs);
            }
            $tmp = new AccessExpression($tn.ret, new KeywordExpression($kw));
            $ret = new MethodReferenceExpression($tmp, $ret);
        }
    |   c = classType '::' (t = typeArguments {$targs = $t.ret;})? kw = 'new'
        {
            $ret = new KeywordExpression($kw);
            if ($targs.size() > 0) {
                $ret = new TypeExpression($ret, $targs);
            }
            $ret = new MethodReferenceExpression($c.ret, $ret);
        }
    |   a = arrayType '::' kw = 'new'
        {$ret = new MethodReferenceExpression($a.ret,
                                              new KeywordExpression($kw));}
    ;

methodReference_lf_primary returns [Expression ret]
    locals [List<TypeArgument> targs = new ArrayList<>()]
    :   '::' (t = typeArguments {$targs = $t.ret;})? id = Identifier
        {
            $ret = new IdentifierExpression($id);
            if ($targs.size() > 0) {
                $ret = new TypeExpression($ret, $targs);
            }
        }
    ;

methodReference_lfno_primary returns [Expression ret]
    locals [Expression tmp,
            List<TypeArgument> targs = new ArrayList<>()]
    :   en = expressionName '::' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier
        {
            $ret = new IdentifierExpression($id);
            if ($targs.size() > 0) {
                $ret = new TypeExpression($ret, $targs);
            }
            $ret = new MethodReferenceExpression($en.ret, $ret);
        }
    |   r = referenceType '::' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier
        {
            $ret = new IdentifierExpression($id);
            if ($targs.size() > 0) {
                $ret = new TypeExpression($ret, $targs);
            }
            $ret = new MethodReferenceExpression($r.ret, $ret);
        }
    |   kw = 'super' '::' (t = typeArguments {$targs = $t.ret;})? id = Identifier
        {
            $ret = new IdentifierExpression($id);
            if ($targs.size() > 0) {
                $ret = new TypeExpression($ret, $targs);
            }
            $ret = new MethodReferenceExpression(new KeywordExpression($kw),
                                                 $ret);
        }
    |   tn = typeName '.' kw = 'super' '::'
        (t = typeArguments {$targs = $t.ret;})? id = Identifier
        {
            $ret = new IdentifierExpression($id);
            if ($targs.size() > 0) {
                $ret = new TypeExpression($ret, $targs);
            }
            $tmp = new AccessExpression($tn.ret, new KeywordExpression($kw));
            $ret = new MethodReferenceExpression($tmp, $ret);
        }
    |   c = classType '::' (t = typeArguments {$targs = $t.ret;})? kw = 'new'
        {
            $ret = new KeywordExpression($kw);
            if ($targs.size() > 0) {
                $ret = new TypeExpression($ret, $targs);
            }
            $ret = new MethodReferenceExpression($c.ret, $ret);
        }
    |   a = arrayType '::' kw = 'new'
        {$ret = new MethodReferenceExpression($a.ret,
                                              new KeywordExpression($kw));}
    ;

arrayCreationExpression returns [ArrayConstruction ret]
    locals [List<Dimension> ls = new ArrayList<>()]
    :   kw = 'new' p = primitiveType de = dimExprs (d = dims {$ls = $d.ret;})?
        {$ret = new ArrayConstruction($kw, $p.ret, $de.ret, $ls);}
    |   kw = 'new' c = classOrInterfaceType de = dimExprs
        (d = dims {$ls = $d.ret;})?
        {$ret = new ArrayConstruction($kw, $c.ret, $de.ret, $ls);}
    |   kw = 'new' p = primitiveType d = dims i = arrayInitializer
        {$ret = new ArrayConstruction($kw, $p.ret, $d.ret, $i.ret);}
    |   kw = 'new' c = classOrInterfaceType d = dims i = arrayInitializer
        {$ret = new ArrayConstruction($kw, $c.ret, $d.ret, $i.ret);}
    ;

dimExprs returns [List<DimensionExpression> ret]
    :   d1 = dimExpr {$ret = new ArrayList<>(); $ret.add($d1.ret);}
        (d = dimExpr {$ret.add($d.ret);})*
    ;

dimExpr returns [DimensionExpression ret]
    locals [List<Annotation> ans = new ArrayList<>()]
    :   (a = annotation {$ans.add($a.ret);})*
        first = '[' ex = expression last = ']'
        {$ret = new DimensionExpression($first, $last, $ans, $ex.ret);}
    ;

constantExpression returns [Expression ret]
    :   ex = expression {$ret = $ex.ret;}
    ;

expression returns [Expression ret]
    :   l = lambdaExpression {$ret = $l.ret;}
    |   a = assignmentExpression {$ret = $a.ret;}
    ;

lambdaExpression returns [LambdaExpression ret]
    :   p = lambdaParameters '->' b = lambdaBody
        {$ret = new LambdaExpression($p.first, $p.ret, $b.ret);}
    ;

lambdaParameters returns [List<VariableDeclaration> ret, Token first]
    locals [List<VariableDeclaration> vars = new ArrayList<>()]
    :   id = Identifier
        {
            $vars.add(new VariableDeclaration($id));
            $ret = $vars;
            $first = $id;
        }
    |   f = '(' (p = formalParameterList {$ret = $p.ret;})? ')' {$first = $f;}
    |   f = '(' i = inferredFormalParameterList ')' {$ret = $i.ret; $first = $f;}
    ;

inferredFormalParameterList returns [List<VariableDeclaration> ret]
    locals [List<VariableDeclaration> vars = new ArrayList<>()]
    :   (id = Identifier {$vars.add(new VariableDeclaration($id));})
        (',' i = Identifier
            {$vars.add(new VariableDeclaration($i));})*
        {$ret = $vars;}
    ;

lambdaBody returns [Block ret]
    :   e = expression {$ret = new Block($e.ret);}
    |   body = block {$ret = $body.ret;}
    ;

assignmentExpression returns [Expression ret]
    :   c = conditionalExpression {$ret = $c.ret;}
    |   a = assignment {$ret = $a.ret;}
    ;

assignment returns [AssignmentExpression ret]
    :   l = leftHandSide op = assignmentOperator r = expression
        {$ret = new AssignmentExpression($l.ret, $op.ret, $r.ret);}
    ;

leftHandSide returns [Expression ret]
    :   n = expressionName {$ret = $n.ret;}
    |   f = fieldAccess {$ret = $f.ret;}
    |   a = arrayAccess {$ret = $a.ret;}
    ;

assignmentOperator returns [AssignmentOperator ret]
    :   '=' {$ret = AssignmentOperator.EQUALS;}
    |   '*=' {$ret = AssignmentOperator.MULTIPLICATION;}
    |   '/=' {$ret = AssignmentOperator.DIVISION;}
    |   '%=' {$ret = AssignmentOperator.MODULUS;}
    |   '+=' {$ret = AssignmentOperator.ADDITION;}
    |   '-=' {$ret = AssignmentOperator.SUBTRACTION;}
    |   '<<=' {$ret = AssignmentOperator.LEFT_SHIFT;}
    |   '>>=' {$ret = AssignmentOperator.RIGHT_SHIFT;}
    |   '>>>=' {$ret = AssignmentOperator.RIGHT_LOGICAL_SHIFT;}
    |   '&=' {$ret = AssignmentOperator.BITWISE_AND;}
    |   '^=' {$ret = AssignmentOperator.BITWISE_XOR;}
    |   '|=' {$ret = AssignmentOperator.BITWISE_OR;}
    ;

conditionalExpression returns [Expression ret]
    :   c = conditionalOrExpression {$ret = $c.ret;}
    |   c = conditionalOrExpression '?'
        i = expression ':' el = conditionalExpression
        {$ret = new TernaryExpression($c.ret, $i.ret, $el.ret);}
    ;

conditionalOrExpression returns [Expression ret]
    :   c = conditionalAndExpression {$ret = $c.ret;}
    |   c1 = conditionalOrExpression '||' c2 = conditionalAndExpression
        {$ret = new BinaryExpression($c1.ret, BinaryOperator.OR, $c2.ret);}
    ;

conditionalAndExpression returns [Expression ret]
    :   i = inclusiveOrExpression {$ret = $i.ret;}
    |   l = conditionalAndExpression '&&' r = inclusiveOrExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.AND, $r.ret);}
    ;

inclusiveOrExpression returns [Expression ret]
    :   ex = exclusiveOrExpression {$ret = $ex.ret;}
    |   l = inclusiveOrExpression '|' r = exclusiveOrExpression
        {$ret = new BinaryExpression($l.ret,BinaryOperator.BITWISE_OR, $r.ret);}
    ;

exclusiveOrExpression returns [Expression ret]
    :   ex = andExpression {$ret = $ex.ret;}
    |   l = exclusiveOrExpression '^' r = andExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.BITWISE_XOR, $r.ret);}
    ;

andExpression returns [Expression ret]
    :   ex = equalityExpression {$ret = $ex.ret;}
    |   l = andExpression '&' r = equalityExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.BITWISE_AND, $r.ret);}
    ;

equalityExpression returns [Expression ret]
    :   ex = relationalExpression {$ret = $ex.ret;}
    |   l = equalityExpression '==' r = relationalExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.EQUALITY, $r.ret);}
    |   l = equalityExpression '!=' r = relationalExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.INEQUALITY, $r.ret);}
    ;

relationalExpression returns [Expression ret]
    :   ex = shiftExpression {$ret = $ex.ret;}
    |   l = relationalExpression '<' r = shiftExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.LESS_THAN, $r.ret);}
    |   l = relationalExpression '>' r = shiftExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.GREATER_THAN, $r.ret);}
    |   l = relationalExpression '<=' r = shiftExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.LESS_THAN_OR_EQUAL, $r.ret);}
    |   l = relationalExpression '>=' r = shiftExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.GREATER_THAN_OR_EQUAL, $r.ret);}
    |   l = relationalExpression 'instanceof' rt = referenceType
        {$ret = new BinaryExpression($l.ret, BinaryOperator.INSTANCE_OF, $rt.ret);}
    ;

shiftExpression returns [Expression ret]
    :   ex = additiveExpression {$ret = $ex.ret;}
    |   l = shiftExpression '<' '<' r = additiveExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.LEFT_SHIFT, $r.ret);}
    |   l = shiftExpression '>' '>' r = additiveExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.RIGHT_SHIFT, $r.ret);}
    |   l = shiftExpression '>' '>' '>' r = additiveExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.RIGHT_LOGICAL_SHIFT, $r.ret);}
    ;

additiveExpression returns [Expression ret]
    :   ex = multiplicativeExpression {$ret = $ex.ret;}
    |   l = additiveExpression '+' r = multiplicativeExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.ADDITION, $r.ret);}
    |   l = additiveExpression '-' r = multiplicativeExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.SUBTRACTION, $r.ret);}
    ;

multiplicativeExpression returns [Expression ret]
    :   ex = unaryExpression {$ret = $ex.ret;}
    |   l = multiplicativeExpression '*' r = unaryExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.MULTIPLICATION, $r.ret);}
    |   l = multiplicativeExpression '/' r = unaryExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.DIVISION, $r.ret);}
    |   l = multiplicativeExpression '%' r = unaryExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.MODULUS, $r.ret);}
    ;

unaryExpression returns [Expression ret]
    :   pi = preIncrementExpression {$ret = $pi.ret;}
    |   pd = preDecrementExpression {$ret = $pd.ret;}
    |   first = '+' ex = unaryExpression
        {$ret = new UnaryExpression($first, $ex.ret, UnaryOperator.PLUS);}
    |   first = '-' ex = unaryExpression
        {$ret = new UnaryExpression($first, $ex.ret, UnaryOperator.NEGATION);}
    |   npm = unaryExpressionNotPlusMinus {$ret = $npm.ret;}
    ;

preIncrementExpression returns [UnaryExpression ret]
    :   first = '++' ex = unaryExpression
        {$ret = new UnaryExpression($first, $ex.ret,
                                    UnaryOperator.PRE_INCREMENT);}
    ;

preDecrementExpression returns [UnaryExpression ret]
    :   first = '--' ex = unaryExpression
        {$ret = new UnaryExpression($first, $ex.ret,
                                    UnaryOperator.PRE_DECREMENT);}
    ;

unaryExpressionNotPlusMinus returns [Expression ret]
    :   pf = postfixExpression {$ret = $pf.ret;}
    |   first = '~' ex = unaryExpression
        {$ret = new UnaryExpression($first,
                                    $ex.ret,
                                    UnaryOperator.BITWISE_NEGATION);}
    |   first = '!' ex = unaryExpression
        {$ret = new UnaryExpression($first, $ex.ret, UnaryOperator.NEGATION);}
    |   cex = castExpression {$ret = $cex.ret;}
    ;

postfixExpression returns [Expression ret]
    :   (   p = primary {$ret = $p.ret;}
        |   n = expressionName {$ret = $n.ret;}
        )
        (   op1 = '++'
            {$ret = new UnaryExpression($op1, $ret, UnaryOperator.INCREMENT);}
        |   op2 = '--'
            {$ret = new UnaryExpression($op2, $ret, UnaryOperator.DECREMENT);}
        )*
    ;

postIncrementExpression returns [UnaryExpression ret]
    :   ex = postfixExpression last = '++'
        {$ret = new UnaryExpression($last, $ex.ret, UnaryOperator.INCREMENT);}
    ;

postDecrementExpression returns [UnaryExpression ret]
    :   ex = postfixExpression last = '--'
        {$ret = new UnaryExpression($last, $ex.ret, UnaryOperator.DECREMENT);}
    ;

castExpression returns [CastExpression ret]
    locals [List<Expression> ls = new ArrayList<>()]
    :   first = '(' pt = primitiveType ')' uex = unaryExpression
        {$ret = new CastExpression($first, $uex.ret, $pt.ret);}
    |   first = '(' rt = referenceType {$ls.add($rt.ret);}
        (b = additionalBound {$ls.add($b.ret);})* ')'
        npm = unaryExpressionNotPlusMinus
        {$ret = new CastExpression($first, $npm.ret, $ls);}
    |   first = '(' rt = referenceType {$ls.add($rt.ret);}
        (b = additionalBound {$ls.add($b.ret);})* ')'
        lam = lambdaExpression
        {$ret = new CastExpression($first, $lam.ret, $ls);}
    ;

// LEXER

// §3.9 Keywords

ABSTRACT : 'abstract';
ASSERT : 'assert';
BOOLEAN : 'boolean';
BREAK : 'break';
BYTE : 'byte';
CASE : 'case';
CATCH : 'catch';
CHAR : 'char';
CLASS : 'class';
CONST : 'const';
CONTINUE : 'continue';
DEFAULT : 'default';
DO : 'do';
DOUBLE : 'double';
ELSE : 'else';
ENUM : 'enum';
EXTENDS : 'extends';
FINAL : 'final';
FINALLY : 'finally';
FLOAT : 'float';
FOR : 'for';
IF : 'if';
GOTO : 'goto';
IMPLEMENTS : 'implements';
IMPORT : 'import';
INSTANCEOF : 'instanceof';
INT : 'int';
INTERFACE : 'interface';
LONG : 'long';
NATIVE : 'native';
NEW : 'new';
PACKAGE : 'package';
PRIVATE : 'private';
PROTECTED : 'protected';
PUBLIC : 'public';
RETURN : 'return';
SHORT : 'short';
STATIC : 'static';
STRICTFP : 'strictfp';
SUPER : 'super';
SWITCH : 'switch';
SYNCHRONIZED : 'synchronized';
THIS : 'this';
THROW : 'throw';
THROWS : 'throws';
TRANSIENT : 'transient';
TRY : 'try';
VOID : 'void';
VOLATILE : 'volatile';
WHILE : 'while';

// §3.10.1 Integer Literals

IntegerLiteral
    :   DecimalIntegerLiteral
    |   HexIntegerLiteral
    |   OctalIntegerLiteral
    |   BinaryIntegerLiteral
    ;

fragment
DecimalIntegerLiteral
    :   DecimalNumeral IntegerTypeSuffix?
    ;

fragment
HexIntegerLiteral
    :   HexNumeral IntegerTypeSuffix?
    ;

fragment
OctalIntegerLiteral
    :   OctalNumeral IntegerTypeSuffix?
    ;

fragment
BinaryIntegerLiteral
    :   BinaryNumeral IntegerTypeSuffix?
    ;

fragment
IntegerTypeSuffix
    :   [lL]
    ;

fragment
DecimalNumeral
    :   '0'
    |   NonZeroDigit (Digits? | Underscores Digits)
    ;

fragment
Digits
    :   Digit (DigitsAndUnderscores? Digit)?
    ;

fragment
Digit
    :   '0'
    |   NonZeroDigit
    ;

fragment
NonZeroDigit
    :   [1-9]
    ;

fragment
DigitsAndUnderscores
    :   DigitOrUnderscore+
    ;

fragment
DigitOrUnderscore
    :   Digit
    |   '_'
    ;

fragment
Underscores
    :   '_'+
    ;

fragment
HexNumeral
    :   '0' [xX] HexDigits
    ;

fragment
HexDigits
    :   HexDigit (HexDigitsAndUnderscores? HexDigit)?
    ;

fragment
HexDigit
    :   [0-9a-fA-F]
    ;

fragment
HexDigitsAndUnderscores
    :   HexDigitOrUnderscore+
    ;

fragment
HexDigitOrUnderscore
    :   HexDigit
    |   '_'
    ;

fragment
OctalNumeral
    :   '0' Underscores? OctalDigits
    ;

fragment
OctalDigits
    :   OctalDigit (OctalDigitsAndUnderscores? OctalDigit)?
    ;

fragment
OctalDigit
    :   [0-7]
    ;

fragment
OctalDigitsAndUnderscores
    :   OctalDigitOrUnderscore+
    ;

fragment
OctalDigitOrUnderscore
    :   OctalDigit
    |   '_'
    ;

fragment
BinaryNumeral
    :   '0' [bB] BinaryDigits
    ;

fragment
BinaryDigits
    :   BinaryDigit (BinaryDigitsAndUnderscores? BinaryDigit)?
    ;

fragment
BinaryDigit
    :   [01]
    ;

fragment
BinaryDigitsAndUnderscores
    :   BinaryDigitOrUnderscore+
    ;

fragment
BinaryDigitOrUnderscore
    :   BinaryDigit
    |   '_'
    ;

// §3.10.2 Floating-Point Literals

FloatingPointLiteral
    :   DecimalFloatingPointLiteral
    |   HexadecimalFloatingPointLiteral
    ;

fragment
DecimalFloatingPointLiteral
    :   Digits '.' Digits? ExponentPart? FloatTypeSuffix?
    |   '.' Digits ExponentPart? FloatTypeSuffix?
    |   Digits ExponentPart FloatTypeSuffix?
    |   Digits FloatTypeSuffix
    ;

fragment
ExponentPart
    :   ExponentIndicator SignedInteger
    ;

fragment
ExponentIndicator
    :   [eE]
    ;

fragment
SignedInteger
    :   Sign? Digits
    ;

fragment
Sign
    :   [+-]
    ;

fragment
FloatTypeSuffix
    :   [fFdD]
    ;

fragment
HexadecimalFloatingPointLiteral
    :   HexSignificand BinaryExponent FloatTypeSuffix?
    ;

fragment
HexSignificand
    :   HexNumeral '.'?
    |   '0' [xX] HexDigits? '.' HexDigits
    ;

fragment
BinaryExponent
    :   BinaryExponentIndicator SignedInteger
    ;

fragment
BinaryExponentIndicator
    :   [pP]
    ;

// §3.10.3 Boolean Literals

BooleanLiteral
    :   'true'
    |   'false'
    ;

// §3.10.4 Character Literals

CharacterLiteral
    :   '\'' SingleCharacter '\''
    |   '\'' EscapeSequence '\''
    ;

fragment
SingleCharacter
    :   ~['\\]
    ;

// §3.10.5 String Literals

StringLiteral
    :   '"' StringCharacters? '"'
    ;

fragment
StringCharacters
    :   StringCharacter+
    ;

fragment
StringCharacter
    :   ~["\\]
    |   EscapeSequence
    ;

// §3.10.6 Escape Sequences for Character and String Literals

fragment
EscapeSequence
    :   '\\' [btnfr"'\\]
    |   OctalEscape
    |   UnicodeEscape // This is not in the spec but prevents having to preprocess the input
    ;

fragment
OctalEscape
    :   '\\' OctalDigit
    |   '\\' OctalDigit OctalDigit
    |   '\\' ZeroToThree OctalDigit OctalDigit
    ;

fragment
ZeroToThree
    :   [0-3]
    ;

// This is not in the spec but prevents having to preprocess the input
fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

// §3.10.7 The Null Literal

NullLiteral
    :   'null'
    ;

// §3.11 Separators

LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';
SEMI : ';';
COMMA : ',';
DOT : '.';

// §3.12 Operators

ASSIGN : '=';
GT : '>';
LT : '<';
BANG : '!';
TILDE : '~';
QUESTION : '?';
COLON : ':';
EQUAL : '==';
LE : '<=';
GE : '>=';
NOTEQUAL : '!=';
AND : '&&';
OR : '||';
INC : '++';
DEC : '--';
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
BITAND : '&';
BITOR : '|';
CARET : '^';
MOD : '%';
ARROW : '->';
COLONCOLON : '::';

ADD_ASSIGN : '+=';
SUB_ASSIGN : '-=';
MUL_ASSIGN : '*=';
DIV_ASSIGN : '/=';
AND_ASSIGN : '&=';
OR_ASSIGN : '|=';
XOR_ASSIGN : '^=';
MOD_ASSIGN : '%=';
LSHIFT_ASSIGN : '<<=';
RSHIFT_ASSIGN : '>>=';
URSHIFT_ASSIGN : '>>>=';

// §3.8 Identifiers (must appear after all keywords in the grammar)

Identifier
    :   JavaLetter (JavaLetterOrDigit)*
    ;

fragment
JavaLetter
    :   [a-zA-Z$_] // these are the "java letters" below 0x7F
/*  |   // covers all characters above 0x7F which are not a surrogate
        ~[\u0000-\u007F\uD800-\uDBFF]
        {Character.isJavaIdentifierStart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
*/
    ;

fragment
JavaLetterOrDigit
    :   [a-zA-Z0-9$_] // these are the "java letters or digits" below 0x7F
/*
    |   // covers all characters above 0x7F which are not a surrogate
        ~[\u0000-\u007F\uD800-\uDBFF]
        {Character.isJavaIdentifierPart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
*/
    ;

//
// Additional symbols not defined in the lexical specification
//

AT : '@';
ELLIPSIS : '...';

//
// Whitespace and comments
//

WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;
