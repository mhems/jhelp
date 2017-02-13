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
    import java.util.List;

    import com.binghamton.jhelp.*;
    import com.binghamton.jhelp.ast.*;
}

@parser::members {
    private String toName(MyPair<String, Integer> pair) {
        String name = pair.first;
        int num = pair.second;
        if (num > 0) {
            name += "[" + num + "]";
        }
        return name;
    }
}

/*
 * Productions from §3 (Lexical Structure)
 */

literal returns [LiteralExpression ret]
	:	i = IntegerLiteral
        {$ret = new LiteralExpression($i.getText(), PrimitiveType.INT);}
	|	f = FloatingPointLiteral
        {$ret = new LiteralExpression($f.getText(), PrimitiveType.FLOAT);}
	|	b = BooleanLiteral
        {$ret = new LiteralExpression($b.getText(), PrimitiveType.BOOLEAN);}
	|	c = CharacterLiteral
        {$ret = new LiteralExpression($c.getText(), PrimitiveType.CHAR);}
	|	s = StringLiteral
        {$ret = new LiteralExpression($s.getText(), null);} // TODO String
	|	NullLiteral
        {$ret = new NullLiteral();}
	;

/*
 * Productions from §4 (Types, Values, and Variables)
 */

type_ returns [Type ret]
	:	p = primitiveType {$ret = $p.ret;}
	|	r = referenceType {$ret = $r.ret;}
	;

primitiveType returns [PrimitiveType ret]
    locals [List<Annotation> anns = new ArrayList<>()]
	:	(a = annotation {$anns.add($a.ret);})* n = numericType
        {$ret = new PrimitiveType($n.ret, $anns);}
	|	(a = annotation {$anns.add($a.ret);})* 'boolean'
        {$ret = new PrimitiveType(PrimitiveType.Primitive.BOOLEAN, $anns);}
	;

numericType returns [PrimitiveType.Primitive ret]
	:	i = integralType {$ret = $i.ret;}
	|	f = floatingPointType {$ret = $f.ret;}
	;

integralType returns [PrimitiveType.Primitive ret]
	:	'byte' {$ret = PrimitiveType.Primitive.BYTE;}
	|	'short' {$ret = PrimitiveType.Primitive.SHORT;}
	|	'int' {$ret = PrimitiveType.Primitive.INT;}
	|	'long' {$ret = PrimitiveType.Primitive.LONG;}
	|	'char' {$ret = PrimitiveType.Primitive.CHAR;}
	;

floatingPointType returns [PrimitiveType.Primitive ret]
	:	'float' {$ret = PrimitiveType.Primitive.FLOAT;}
	|	'double' {$ret = PrimitiveType.Primitive.DOUBLE;}
	;

referenceType returns [ReferenceType ret]
	:	c = classOrInterfaceType {$ret = $c.ret;}
	|	v = typeVariable {$ret = $v.ret;}
	|	a = arrayType {$ret = $a.ret;}
	;

classOrInterfaceType returns [ClassInterfaceType ret]
	:	(	cno = classType_lfno_classOrInterfaceType {$ret = $cno.ret;}
		|	ino = interfaceType_lfno_classOrInterfaceType {$ret = $ino.ret;}
		)
		(	c = classType_lf_classOrInterfaceType
            {$ret = new ClassInterfaceType($ret, $c.ret);}
		|	i = interfaceType_lf_classOrInterfaceType
            {$ret = new ClassInterfaceType($ret, $i.ret);}
		)*
	;

classType returns [ClassInterfaceType ret]
    locals [List<Annotation> anns = new ArrayList<>(),
            List<TypeArgument> ls = null]
	:	(a = annotation {$anns.add($a.ret);})*
        id = Identifier
        (targs = typeArguments {$ls = $targs.ret;})?
        {$ret = new ClassInterfaceType($id.getText(), $anns, $ls);}
	|	st = classOrInterfaceType '.'
        (a = annotation {$anns.add($a.ret);})*
        id = Identifier
        (targs = typeArguments {$ls = $targs.ret;})?
        {$ret = new ClassInterfaceType($id.getText(), $anns, $ls, $st.ret);}
	;

classType_lf_classOrInterfaceType returns [ClassInterfaceType ret]
    locals [List<Annotation> ans = new ArrayList<>(),
            List<TypeArgument> ls = null]
	:	'.' (a = annotation {$ans.add($a.ret);})*
        id = Identifier (targs = typeArguments {$ls = $targs.ret;})?
        {$ret = new ClassInterfaceType($id.getText(), $ans, $ls);}
	;

classType_lfno_classOrInterfaceType returns [ClassInterfaceType ret]
    locals [List<Annotation> ans = new ArrayList<>(),
            List<TypeArgument> ls = null]
	:	(a = annotation {$ans.add($a.ret);})*
        id = Identifier (targs = typeArguments {$ls = $targs.ret;})?
        {$ret = new ClassInterfaceType($id.getText(), $ans, $ls);}
	;

interfaceType returns [ClassInterfaceType ret]
	:	c = classType {$ret = $c.ret;}
	;

interfaceType_lf_classOrInterfaceType returns [ClassInterfaceType ret]
	:	c = classType_lf_classOrInterfaceType {$ret = $c.ret;}
	;

interfaceType_lfno_classOrInterfaceType returns [ClassInterfaceType ret]
	:	c = classType_lfno_classOrInterfaceType {$ret = $c.ret;}
	;

typeVariable returns [TypeVariable ret]
    locals [List<Annotation> ans = new ArrayList<>()]
	:	(a = annotation {$ans.add($a.ret);})* id = Identifier
        {$ret = new TypeVariable($id.getText(), $ans);}
	;

arrayType returns [ArrayType ret]
	:	p = primitiveType d = dims
        {$ret = new ArrayType($p.ret, $d.ret);}
	|	c = classOrInterfaceType d = dims
        {$ret = new ArrayType($c.ret, $d.ret);}
	|	v = typeVariable d = dims
        {$ret = new ArrayType($v.ret, $d.ret);}
	;

dims returns [int ret]
	:	annotation* '[' ']' {$ret = 1;}
        (annotation* '[' ']' {++$ret;})*
	;

typeParameter returns [TypeParameter ret]
    locals [List<Annotation> ans = new ArrayList<>(),
            List<ReferenceType> ls = null]
	:	(a = typeParameterModifier {$ans.add($a.ret);})*
        id = Identifier (b = typeBound {$ls = $b.ret;})?
        {$ret = new TypeParameter($id.getText(), $ans, $ls);}
	;

typeParameterModifier returns [Annotation ret]
	:	a = annotation {$ret = $a.ret;}
	;

typeBound returns [List<ReferenceType> ret]
    locals [List<ReferenceType> ls = new ArrayList<>()]
	:	'extends' v = typeVariable {$ls.add($v.ret); $ret = $ls;}
	|	'extends' c = classOrInterfaceType {$ls.add($c.ret);}
        (a = additionalBound {$ls.add($a.ret);})*
        {$ret = $ls;}
	;

additionalBound returns [ClassInterfaceType ret]
	:	'&' i = interfaceType {$ret = $i.ret;}
	;

typeArguments returns [List<TypeArgument> ret]
	:	'<' ls = typeArgumentList '>' {$ret = $ls.ret;}
	;

typeArgumentList returns [List<TypeArgument> ret]
   locals [List<TypeArgument> ls = new ArrayList<>()]
	:	a1 = typeArgument {$ls.add($a1.ret);}
        (',' a = typeArgument {$ls.add($a.ret);})*
        {$ret = $ls;}
	;

typeArgument returns [TypeArgument ret]
	:	r = referenceType {$ret = new TypeArgument($r.ret);}
	|	w = wildcard {$ret = $w.ret;}
	;

wildcard returns [TypeArgument ret]
    locals [List<Annotation> ans = new ArrayList<>()]
	:	(a = annotation {$ans.add($a.ret);})* '?'
        {$ret = new TypeArgument($ans);}
        (wildcardBounds[$ret])?
	;

wildcardBounds [TypeArgument ret]
	:	'extends' r = referenceType
        {$ret.setBoundType($r.ret); $ret.setIsUpperBounded(true);}
	|	'super' r = referenceType
        {$ret.setBoundType($r.ret); $ret.setIsUpperBounded(false);}
	;

/*
 * Productions from §6 (Names)
 */

packageName returns [String ret]
	:	id = Identifier { $ret = $id.getText(); }
	|	p = packageName '.' id = Identifier
        {$ret = $p.ret + "." + $id.getText();}
	;

typeName returns [String ret]
	:	id = Identifier { $ret = $id.getText(); }
	|	p = packageOrTypeName '.' id = Identifier
        { $ret = $p.ret + "." + $id.getText(); }
	;

packageOrTypeName returns [String ret]
	:	id = Identifier { $ret = $id.getText(); }
	|	p = packageOrTypeName '.' id = Identifier
        { $ret = $p.ret + "." + $id.getText(); }
	;

expressionName returns [String ret]
	:	id = Identifier { $ret = $id.getText(); }
	|	a = ambiguousName '.' id = Identifier
        { $ret = $a.ret + "." + $id.getText(); }
	;

methodName returns [String ret]
	:	id = Identifier { $ret = $id.getText(); }
	;

ambiguousName returns [String ret]
	:	id = Identifier { $ret = $id.getText(); }
	|	a = ambiguousName '.' id = Identifier
        { $ret = $a.ret + "." + $id.getText(); }
	;

/*
 * Productions from §7 (Packages)
 */

compilationUnit returns [CompilationUnit ret]
    locals [List<ImportStatement> imports = new ArrayList<>(),
            List<BodyDeclaration> bodies = new ArrayList<>(),
            PackageStatement stmt = null]
	:	(p = packageDeclaration {$stmt = $p.ret;})?
        (i = importDeclaration {$imports.add($i.ret);})*
        (t = typeDeclaration {$bodies.add($t.ret);})*
        EOF
        {$ret = new CompilationUnit($stmt, $imports, $bodies);}
	;

packageDeclaration returns [PackageStatement ret]
    locals [ List<Annotation> anns = new ArrayList<>(),
             List<String> ids = new ArrayList<>()]
	:	(a = packageModifier {$anns.add($a.ret);})* 'package'
        (id = Identifier {$ids.add($id.getText());})
        ('.' id = Identifier {$ids.add($id.getText());})* ';'
        { $ret = new PackageStatement($ids, $anns);}
	;

packageModifier returns [Annotation ret]
	:	an = annotation {$ret = $an.ret;}
	;

importDeclaration returns [ImportStatement ret]
	:   s = singleTypeImportDeclaration {$ret = $s.ret;}
	|	t = typeImportOnDemandDeclaration {$ret = $t.ret;}
	|	ss = singleStaticImportDeclaration {$ret = $ss.ret;}
	|	si = staticImportOnDemandDeclaration {$ret = $si.ret;}
	;

singleTypeImportDeclaration returns [ImportStatement ret]
	:	'import' t = typeName ';'
        { $ret = new ImportStatement($t.ret, false, false); }
	;

typeImportOnDemandDeclaration returns [ImportStatement ret]
	:	'import' p = packageOrTypeName '.' '*' ';'
        {$ret = new ImportStatement($p.ret, false, true);}
	;

singleStaticImportDeclaration returns [ImportStatement ret]
	:	'import' 'static' t = typeName '.' id = Identifier ';'
        {$ret = new ImportStatement($t.ret + '.' + $id.getText(), true, false);}
	;

staticImportOnDemandDeclaration returns [ImportStatement ret]
	:	'import' 'static' t = typeName '.' '*' ';'
        {$ret = new ImportStatement($t.ret, true, true);}
	;

typeDeclaration returns [BodyDeclaration ret]
	:	c = classDeclaration {$ret = $c.ret;}
	|	i = interfaceDeclaration {$ret = $i.ret;}
	|	';'
	;

/*
 * Productions from §8 (Classes)
 */

classDeclaration returns [ConcreteBodyDeclaration ret]
	:	n = normalClassDeclaration {$ret = $n.ret;}
	|	e = enumDeclaration {$ret = $e.ret;}
	;

normalClassDeclaration returns [ClassDeclaration ret]
    locals [List<Modifier> mods = new ArrayList<>(),
            List<TypeParameter> tpars = null,
            ClassInterfaceType scls = null,
            List<ClassInterfaceType> sis = null]
	:	(m = classModifier {$mods.add($m.ret);})* 'class' n = Identifier
        (p = typeParameters {$tpars = $p.ret;})?
        (sc = superclass {$scls = $sc.ret;})?
        (si = superinterfaces {$sis = $si.ret;})?
        {$ret = new ClassDeclaration($n.getText(), $mods, $sis, $tpars, $scls);}
        classBody[$ret]
	;

classModifier returns [Modifier ret]
	:	a = annotation {$ret = $a.ret;}
	|	'public' {$ret = Modifier.PUBLIC;}
	|	'protected' {$ret = Modifier.PROTECTED;}
	|	'private' {$ret = Modifier.PRIVATE;}
	|	'abstract' {$ret = Modifier.ABSTRACT;}
	|	'static' {$ret = Modifier.STATIC;}
	|	'final' {$ret = Modifier.FINAL;}
	|	'strictfp' {$ret = Modifier.STRICT_FP;}
	;

typeParameters returns [List<TypeParameter> ret]
	:	'<' t = typeParameterList '>' {$ret = $t.ret;}
	;

typeParameterList returns [List<TypeParameter> ret]
    locals [List<TypeParameter> ls = new ArrayList<>()]
	:	(t1 = typeParameter {$ls.add($t1.ret);})
        (',' t = typeParameter {$ls.add($t.ret);})*
        {$ret = $ls;}
	;

superclass returns [ClassInterfaceType ret]
	:	'extends' c = classType {$ret = $c.ret;}
	;

superinterfaces returns [List<ClassInterfaceType> ret]
	:	'implements' i = interfaceTypeList {$ret = $i.ret;}
	;

interfaceTypeList returns [List<ClassInterfaceType> ret]
    locals [List<ClassInterfaceType> ls = new ArrayList<>()]
	:	(i1 = interfaceType {$ls.add($i1.ret);})
        (',' i = interfaceType {$ls.add($i.ret);})*
        {$ret = $ls;}
	;

classBody [ConcreteBodyDeclaration ret]
	:	'{' (classBodyDeclaration[$ret])* '}'
	;

classBodyDeclaration [ConcreteBodyDeclaration ret]
	:	classMemberDeclaration[$ret]
	|	i = instanceInitializer {$ret.addInstanceInitializer($i.ret);}
	|	s = staticInitializer {$ret.addStaticInitializer($s.ret);}
	|	ct = constructorDeclaration {$ret.addConstructor($ct.ret);}
	;

classMemberDeclaration [ConcreteBodyDeclaration ret]
	:	f = fieldDeclaration {$ret.addField($f.ret);}
	|	m = methodDeclaration {$ret.addMethod($m.ret);}
	|	c = classDeclaration {$ret.addInnerBody($c.ret);}
	|	i = interfaceDeclaration {$ret.addInnerInterface($i.ret);}
	|	';'
	;

fieldDeclaration returns [VariableDeclaration ret]
    locals [List<Modifier> mods = new ArrayList<>()]
	:	(m = fieldModifier {$mods.add($m.ret);})*
        t = unannType
        l = variableDeclaratorList ';'
        {$ret = new VariableDeclaration($l.ret, $t.ret, $mods);}
	;

fieldModifier returns [Modifier ret]
	:	a = annotation {$ret = $a.ret;}
	|	'public' {$ret = Modifier.PUBLIC;}
	|	'protected' {$ret = Modifier.PROTECTED;}
	|	'private' {$ret = Modifier.PRIVATE;}
	|	'static' {$ret = Modifier.STATIC;}
	|	'final' {$ret = Modifier.FINAL;}
	|	'transient' {$ret = Modifier.TRANSIENT;}
	|	'volatile' {$ret = Modifier.VOLATILE;}
	;

variableDeclaratorList returns [List<MyPair<String, Expression>> ret]
    locals [List<MyPair<String, Expression>> ls = new ArrayList<>()]
	:	(d1 = variableDeclarator {$ls.add($d1.ret);})
        (',' d = variableDeclarator {$ls.add($d.ret);})*
        {$ret = $ls;}
	;

variableDeclarator returns [MyPair<String, Expression> ret]
    locals [Expression expr = null]
	:	id = variableDeclaratorId
        ('=' in = variableInitializer {$expr = $in.ret;})?
        {$ret = new MyPair<>(toName($id.ret), $expr);}
	;

variableDeclaratorId returns [MyPair<String, Integer> ret]
    locals [int dim = 0]
	:	id = Identifier (d = dims {$dim = $d.ret;})?
        {$ret = new MyPair<>($id.getText(), $dim);}
	;

variableInitializer returns [Expression ret]
	:	ex = expression {$ret = $ex.ret;}
	|	a = arrayInitializer {$ret = $a.ret;}
	;

unannType returns [Type ret]
	:	p = unannPrimitiveType {$ret = $p.ret;}
	|	r = unannReferenceType {$ret = $r.ret;}
	;

unannPrimitiveType returns [PrimitiveType ret]
	:	n = numericType {$ret = new PrimitiveType($n.ret);}
	|	'boolean' {$ret = PrimitiveType.BOOLEAN;}
	;

unannReferenceType returns [ReferenceType ret]
	:	c = unannClassOrInterfaceType {$ret = $c.ret;}
	|	v = unannTypeVariable {$ret = $v.ret;}
	|	a = unannArrayType {$ret = $a.ret;}
	;

unannClassOrInterfaceType returns [ClassInterfaceType ret]
	:	(	cno = unannClassType_lfno_unannClassOrInterfaceType
            {$ret = $cno.ret;}
		|	ino = unannInterfaceType_lfno_unannClassOrInterfaceType
            {$ret = $ino.ret;}
		)
		(	c = unannClassType_lf_unannClassOrInterfaceType
            {$ret = new ClassInterfaceType($ret, $c.ret);}
		|	i = unannInterfaceType_lf_unannClassOrInterfaceType
            {$ret = new ClassInterfaceType($ret, $i.ret);}
		)*
	;

unannClassType returns [ClassInterfaceType ret]
    locals [List<Annotation> ans = new ArrayList<>(),
            List<TypeArgument> targs = null]
	:	id = Identifier (ta = typeArguments {$targs = $ta.ret;})?
        {$ret = new ClassInterfaceType($id.getText(), null, $targs);}
	|	ci = unannClassOrInterfaceType '.' (a = annotation {$ans.add($a.ret);})*
        id2 = Identifier (ta2 = typeArguments {$targs = $ta2.ret;})?
        {$ret = new ClassInterfaceType($id2.getText(), $ans,
                                       $targs, $ci.ret);}
	;

unannClassType_lf_unannClassOrInterfaceType returns [ClassInterfaceType ret]
    locals [List<Annotation> ans = new ArrayList<>(),
            List<TypeArgument> targs = null]
	:	'.' (a = annotation {$ans.add($a.ret);})*
        id = Identifier (ta = typeArguments {$targs = $ta.ret;})?
        {$ret = new ClassInterfaceType($id.getText(), $ans, $targs);}
	;

unannClassType_lfno_unannClassOrInterfaceType returns [ClassInterfaceType ret]
    locals [List<TypeArgument> targs = null]
	:	id = Identifier (ta = typeArguments {$targs = $ta.ret;})?
        {$ret = new ClassInterfaceType($id.getText(), null, $targs);}
	;

unannInterfaceType returns [ClassInterfaceType ret]
	:	c = unannClassType {$ret = $c.ret;}
	;

unannInterfaceType_lf_unannClassOrInterfaceType returns [ClassInterfaceType ret]
	:	ci = unannClassType_lf_unannClassOrInterfaceType {$ret = $ci.ret;}
	;

unannInterfaceType_lfno_unannClassOrInterfaceType returns [ClassInterfaceType ret]
	:	ci = unannClassType_lfno_unannClassOrInterfaceType {$ret = $ci.ret;}
	;

unannTypeVariable returns [TypeVariable ret]
	:	i = Identifier {$ret = new TypeVariable($i.getText());}
	;

unannArrayType returns [ArrayType ret]
	:	p = unannPrimitiveType d = dims {$ret = new ArrayType($p.ret, $d.ret);}
	|	c = unannClassOrInterfaceType d = dims
        {$ret = new ArrayType($c.ret, $d.ret);}
	|	v = unannTypeVariable d = dims {$ret = new ArrayType($v.ret, $d.ret);}
	;

methodDeclaration returns [MethodDeclaration ret]
    locals [List<Modifier> mods = new ArrayList<>()]
	:	(m = methodModifier {$mods.add($m.ret);})*
        {$ret = new MethodDeclaration($mods);}
        methodHeader[$ret]
        b = methodBody {$ret.setBody($b.ret);}
	;

methodModifier returns [Modifier ret]
	:	a = annotation {$ret = $a.ret;}
	|	'public' {$ret = Modifier.PUBLIC;}
	|	'protected' {$ret = Modifier.PROTECTED;}
	|	'private' {$ret = Modifier.PRIVATE;}
	|	'abstract' {$ret = Modifier.ABSTRACT;}
	|	'static' {$ret = Modifier.STATIC;}
	|	'final' {$ret = Modifier.FINAL;}
	|	'synchronized' {$ret = Modifier.SYNCHRONIZED;}
	|	'native' {$ret = Modifier.NATIVE;}
	|	'strictfp' {$ret = Modifier.STRICT_FP;}
	;

methodHeader [MethodDeclaration ret]
    locals [List<Annotation> ans = new ArrayList<>()]
	:	rt = result {$ret.setReturnType($rt.ret);} methodDeclarator[$ret]
        (th = throws_ {$ret.setExceptions($th.ret);})?
	|	tp = typeParameters {$ret.setTypeParameters($tp.ret);}
        (a = annotation {$ans.add($a.ret);})*
        {
            if ($ans.size() > 0) {
                $rt.ret.setAnnotations($ans);
            }
        }
        rt = result {$ret.setReturnType($rt.ret);}
        methodDeclarator[$ret]
        (th = throws_ {$ret.setExceptions($th.ret);})?
	;

result returns [Type ret]
	:	u = unannType {$ret = $u.ret;}
	|	'void' {$ret = PrimitiveType.VOID;}
	;

methodDeclarator [MethodDeclaration ret]
	:	n = Identifier {$ret.setName($n.getText());}
        '(' (p = formalParameterList {$ret.setParameters($p.ret);})? ')'
        (d = dims
        {
            if ($d.ret > 0) {
                $ret.setReturnType($ret.getReturnType().augment($d.ret));
            }
        })?
	;

formalParameterList returns [List<VariableDeclaration> ret]
    locals [List<VariableDeclaration> ls = new ArrayList<>()]
	:	(p = formalParameters {$ls.addAll($p.ret);}) ','
        (p2 = lastFormalParameter {$ls.add($p2.ret);})
        {$ret = $ls;}
	|   (f = lastFormalParameter {$ls.add($f.ret);})
        {$ret = $ls;}
	;

formalParameters returns [List<VariableDeclaration> ret]
    locals [List<VariableDeclaration> ls = new ArrayList<>()]
	:	(p = formalParameter {$ls.add($p.ret);})
        (',' f = formalParameter {$ls.add($f.ret);})* {$ret = $ls;}
	|	(r = receiverParameter {$ls.add($r.ret);})
        (',' f = formalParameter {$ls.add($f.ret);})* {$ret = $ls;}
	;

formalParameter returns [VariableDeclaration ret]
    locals [List<Modifier> mods = new ArrayList<>()]
	:	(m = variableModifier {$mods.add($m.ret);})*
        t = unannType n = variableDeclaratorId
        {$ret = new VariableDeclaration(toName($n.ret), $t.ret, $mods);}
	;

variableModifier returns [Modifier ret]
	:	a = annotation {$ret = $a.ret;}
	|	'final' {$ret = Modifier.FINAL;}
	;

lastFormalParameter returns [VariableDeclaration ret]
    locals [List<Modifier> mods = new ArrayList<>()]
	:	(m = variableModifier {$mods.add($m.ret);})*
        t = unannType
        (a = annotation {$mods.add($a.ret);})*
        '...'
        n = variableDeclaratorId
        {$ret = new VariableDeclaration(toName($n.ret), $t.ret, $mods, true);}
	|	f = formalParameter {$ret = $f.ret;}
	;

receiverParameter returns [VariableDeclaration ret]
    locals [List<Modifier> ans = new ArrayList<>(),
            String id = "this"]
	:	(a = annotation {$ans.add($a.ret);})*
        t = unannType
        (i = Identifier '.' {$id = $i.getText() + "." + $id;})?
        'this'
        {$ret = new VariableDeclaration($id, $t.ret, $ans);}
	;

throws_ returns [List<Type> ret]
	:	'throws' e = exceptionTypeList {$ret = $e.ret;}
	;

exceptionTypeList returns [List<Type> ret]
    locals [List<Type> ls = new ArrayList<>()]
	:	(e = exceptionType {$ls.add($e.ret);})
        (',' e = exceptionType {$ls.add($e.ret);})*
        {$ret = $ls;}
	;

exceptionType returns [ReferenceType ret]
	:	c = classType {$ret = $c.ret;}
	|	v = typeVariable {$ret = $v.ret;}
	;

methodBody returns [Block ret]
	:	body = block {$ret = $body.ret;}
	|	';'
	;

instanceInitializer returns [Block ret]
	:	body = block {$ret = $body.ret;}
	;

staticInitializer returns [Block ret]
	:	'static' body = block {$ret = $body.ret;}
	;

constructorDeclaration returns [MethodDeclaration ret]
    locals [List<Modifier> mods = new ArrayList<>()]
	:	(m = constructorModifier {$mods.add($m.ret);})*
        {$ret = new MethodDeclaration($mods);}
        constructorDeclarator[$ret]
        (t = throws_ {$ret.setExceptions($t.ret);})?
        b = constructorBody {$ret.setBody($b.ret);}
	;

constructorModifier returns [Modifier ret]
	:	a = annotation {$ret = $a.ret;}
	|	'public' {$ret = Modifier.PUBLIC;}
	|	'protected' {$ret = Modifier.PROTECTED;}
	|	'private' {$ret = Modifier.PRIVATE;}
	;

constructorDeclarator [MethodDeclaration ret]
	:	(t = typeParameters {$ret.setTypeParameters($t.ret);})?
        n = simpleTypeName {$ret.setName($n.ret);}
        '(' (l = formalParameterList {$ret.setParameters($l.ret);})? ')'
	;

simpleTypeName returns [String ret]
	:	id = Identifier {$ret = $id.getText();}
	;

constructorBody returns [Block ret]
	:    {$ret = new Block();}
        '{' (s = explicitConstructorInvocation {$ret.addStatement($s.ret);})?
            (st = blockStatements {$ret.addStatements($st.ret);})? '}'
	;

explicitConstructorInvocation returns [Expression ret]
    locals [List<TypeArgument> targs = null,
            List<Expression> args = null]
	:	(t = typeArguments {$targs = $t.ret;})? 'this'
        '(' (a = argumentList {$args = $a.ret;})? ')' ';'
        {$ret = new CallExpression(new ThisLiteral(), $args, $targs);}
	|	(t = typeArguments {$targs = $t.ret;})? 'super'
        '(' (a = argumentList {$args = $a.ret;})? ')' ';'
        {$ret = new CallExpression(new SuperLiteral(), $args, $targs);}
	|	en = expressionName '.' (t = typeArguments {$targs = $t.ret;})? 'super'
        '(' (a = argumentList {$args = $a.ret;})? ')' ';'
        {$ret = new CallExpression(new SuperLiteral(), $args, $targs);
         $ret = new AccessExpression($en.ret, $ret);}
	|	p = primary '.' (t = typeArguments {$targs = $t.ret;})? 'super'
        '(' (a = argumentList {$args = $a.ret;})? ')' ';'
        {$ret = new CallExpression(new SuperLiteral(), $args, $targs);
         $ret = new AccessExpression($p.ret, $ret);}
	;

enumDeclaration returns [EnumDeclaration ret]
    locals [List<Modifier> mods = new ArrayList<>(),
            List<ClassInterfaceType> sis = null]
	:	(m = classModifier {$mods.add($m.ret);})*
        'enum' id = Identifier (il = superinterfaces {$sis = $il.ret;})?
        {$ret = new EnumDeclaration($id.getText(), $mods, $sis);}
        enumBody[$ret]
	;

enumBody [EnumDeclaration ret]
	:	'{' (enumConstantList[$ret])? ','? (enumBodyDeclarations[$ret])? '}'
	;

enumConstantList [EnumDeclaration ret]
	:	enumConstant[$ret] (',' enumConstant[$ret])*
	;

enumConstant [EnumDeclaration ret]
    locals [List<Modifier> ans = new ArrayList<>(),
            EnumConstant cons,
            List<Expression> args = null]
	:	(an = enumConstantModifier {$ans.add($an.ret);})*
        id = Identifier
        ('(' (a = argumentList {$args = $a.ret;})? ')')?
        {
            $cons = new EnumConstant($id.getText(), $ans, $args);
            $ret.addConstant($cons);
        }
        (classBody[$cons])?
	;

enumConstantModifier returns [Modifier ret]
	:	a = annotation {$ret = $a.ret;}
	;

enumBodyDeclarations [EnumDeclaration ret]
	:	';' (classBodyDeclaration[$ret])*
	;

/*
 * Productions from §9 (Interfaces)
 */

interfaceDeclaration returns [AbstractBodyDeclaration ret]
	:	n = normalInterfaceDeclaration {$ret = $n.ret;}
	|	a = annotationTypeDeclaration {$ret = $a.ret;}
	;

normalInterfaceDeclaration returns [InterfaceDeclaration ret]
    locals [List<Modifier> mods = new ArrayList<>(),
            List<TypeParameter> tpars = null,
            List<ClassInterfaceType> eis = null]
	:	(m = interfaceModifier {$mods.add($m.ret);})*
        'interface' id = Identifier
        (t = typeParameters {$tpars = $t.ret;})?
        (e = extendsInterfaces {$eis = $e.ret;})?
        {$ret = new InterfaceDeclaration($id.getText(), $mods, $eis, $tpars);}
        interfaceBody[$ret]
	;

interfaceModifier returns [Modifier ret]
	:	a = annotation {$ret = $a.ret;}
	|	'public' {$ret = Modifier.PUBLIC;}
	|	'protected' {$ret = Modifier.PROTECTED;}
	|	'private' {$ret = Modifier.PRIVATE;}
	|	'abstract' {$ret = Modifier.ABSTRACT;}
	|	'static' {$ret = Modifier.STATIC;}
	|	'strictfp' {$ret = Modifier.STRICT_FP;}
	;

extendsInterfaces returns [List<ClassInterfaceType> ret]
	:	'extends' i = interfaceTypeList {$ret = $i.ret;}
	;

interfaceBody [InterfaceDeclaration ret]
	:	'{' (interfaceMemberDeclaration[$ret])* '}'
	;

interfaceMemberDeclaration [InterfaceDeclaration ret]
	:	c = constantDeclaration {$ret.addField($c.ret);}
	|	im = interfaceMethodDeclaration {$ret.addMethod($im.ret);}
	|	cl = classDeclaration {$ret.addInnerBody($cl.ret);}
	|	id = interfaceDeclaration {$ret.addInnerInterface($id.ret);}
	|	';'
	;

constantDeclaration returns [VariableDeclaration ret]
    locals [List<Modifier> mods = new ArrayList<>()]
	:	(m =constantModifier {$mods.add($m.ret);})*
        t = unannType
        l = variableDeclaratorList ';'
        {$ret = new VariableDeclaration($l.ret, $t.ret, $mods);}
	;

constantModifier returns [Modifier ret]
	:	a = annotation {$ret = $a.ret;}
	|	'public' {$ret = Modifier.PUBLIC;}
	|	'static' {$ret = Modifier.STATIC;}
	|	'final' {$ret = Modifier.FINAL;}
	;

interfaceMethodDeclaration returns [MethodDeclaration ret]
    locals [List<Modifier> mods = new ArrayList<>()]
	:	(m = interfaceMethodModifier {$mods.add($m.ret);})*
        {$ret = new MethodDeclaration($mods);}
        (methodHeader[$ret])
        (b = methodBody {$ret.setBody($b.ret);})
	;

interfaceMethodModifier returns [Modifier ret]
	:	a = annotation {$ret = $a.ret;}
	|	'public' {$ret = Modifier.PUBLIC;}
	|	'abstract' {$ret = Modifier.ABSTRACT;}
	|	'default' {$ret = Modifier.DEFAULT;}
	|	'static' {$ret = Modifier.STATIC;}
	|	'strictfp' {$ret = Modifier.STRICT_FP;}
	;

annotationTypeDeclaration returns [AnnotationDeclaration ret]
    locals [List<Modifier> mods = new ArrayList<>()]
    :	(m = interfaceModifier {$mods.add($m.ret);})*
		'@' 'interface' id = Identifier
        {$ret = new AnnotationDeclaration($id.getText(), $mods);}
        annotationTypeBody[$ret]
	;

annotationTypeBody [AnnotationDeclaration ret]
	:	'{' (annotationTypeMemberDeclaration[$ret])* '}'
	;

annotationTypeMemberDeclaration [AnnotationDeclaration ret]
	:	a = annotationTypeElementDeclaration {$ret.addField($a.ret);}
	|	co = constantDeclaration {$ret.addField($co.ret);}
	|	cl = classDeclaration {$ret.addInnerBody($cl.ret);}
	|	i = interfaceDeclaration {$ret.addInnerInterface($i.ret);}
	|	';'
	;

annotationTypeElementDeclaration returns [VariableDeclaration ret]
    locals [List<Modifier> mods = new ArrayList<>(),
            int dim = 0,
            Expression expr = null]
	:	(m = annotationTypeElementModifier {$mods.add($m.ret);})*
        t = unannType id = Identifier '(' ')'
        (ds = dims {$dim = $ds.ret;})?
        (dv = defaultValue {$expr = $dv.ret;})? ';'
        {
            if ($dim > 0) {
                $ret = new VariableDeclaration($id.getText(),
                                               $t.ret.augment($dim),
                                               $mods,
                                               $expr,
                                               false);
            } else {
                $ret = new VariableDeclaration($id.getText(), $t.ret,
                                               $mods, $expr, false);
            }
        }
	;

annotationTypeElementModifier returns [Modifier ret]
	:	a = annotation {$ret = $a.ret;}
	|	'public' {$ret = Modifier.PUBLIC;}
	|	'abstract' {$ret = Modifier.ABSTRACT;}
	;

defaultValue returns [Expression ret]
	:	'default' v = elementValue {$ret = $v.ret;}
	;

annotation returns [Annotation ret]
	:	n = normalAnnotation {$ret = $n.ret;}
	|	m = markerAnnotation {$ret = $m.ret;}
	|	e = singleElementAnnotation {$ret = $e.ret;}
	;

normalAnnotation returns [Annotation ret]
	:	'@' t = typeName
        {$ret = new Annotation($t.ret);}
        '(' elementValuePairList[$ret]? ')'
	;

elementValuePairList [Annotation ret]
	:	(elementValuePair[$ret])
        (',' elementValuePair[$ret])*
	;

elementValuePair [Annotation ret]
	:	id = Identifier '=' v = elementValue
        {$ret.addArgument($id.getText(), $v.ret);}
	;

elementValue returns [Expression ret]
	:	c = conditionalExpression {$ret = $c.ret;}
	|	i = elementValueArrayInitializer {$ret = $i.ret;}
	|	a = annotation {$ret = $a.ret;}
	;

elementValueArrayInitializer returns [ArrayInitializer ret]
    locals [List<Expression> ls = null]
	:	'{' (l = elementValueList {$ls = $l.ret;})? ','? '}'
        {$ret = new ArrayInitializer($ls);}
	;

elementValueList returns [List<Expression> ret]
    locals [List<Expression> ls = new ArrayList<>()]
	:	(v1 = elementValue {$ls.add($v1.ret);})
        (',' v = elementValue {$ls.add($v.ret);})*
        {$ret = $ls;}
	;

markerAnnotation returns [Annotation ret]
	:	'@' t = typeName {$ret = new Annotation($t.ret);}
	;

singleElementAnnotation returns [Annotation ret]
	:	'@' t = typeName '(' v = elementValue ')'
        {$ret = new Annotation($t.ret, $v.ret);}
	;

/*
 * Productions from §10 (Arrays)
 */

arrayInitializer returns [ArrayInitializer ret]
    locals [List<Expression> ls = null]
	:	'{' (l = variableInitializerList {$ls = $l.ret;})? ','? '}'
        {$ret = new ArrayInitializer($ls);}
	;

variableInitializerList returns [List<Expression> ret]
    locals [List<Expression> ls = new ArrayList<>()]
	:	(i = variableInitializer {$ls.add($i.ret);})
        (',' v = variableInitializer {$ls.add($v.ret);})*
        {$ret = $ls;}
	;

/*
 * Productions from §14 (Blocks and Statements)
 */

block returns [Block ret]
	:    {$ret = new Block();}
        '{' (s = blockStatements {$ret.addStatements($s.ret);})? '}'
	;

blockStatements returns [List<Statement> ret]
    locals [List<Statement> ls = new ArrayList<>()]
	:	(s = blockStatement {$ls.add($s.ret);})
        (b = blockStatement {$ls.add($b.ret);})*
        {$ret = $ls;}
	;

blockStatement returns [Statement ret]
	:	d = localVariableDeclarationStatement {$ret = $d.ret;}
	|	c = classDeclaration {$ret = $c.ret;}
	|	st = statement {$ret = $st.ret;}
	;

localVariableDeclarationStatement returns [VariableDeclaration ret]
	:	d = localVariableDeclaration ';' {$ret = $d.ret;}
	;

localVariableDeclaration returns [VariableDeclaration ret]
    locals [List<Modifier> mods = new ArrayList<>()]
	:	(m = variableModifier {$mods.add($m.ret);})*
        t = unannType
        vl = variableDeclaratorList
        {$ret = new VariableDeclaration($vl.ret, $t.ret, $mods);}
	;

statement returns [Statement ret]
	:	a = statementWithoutTrailingSubstatement {$ret = $a.ret;}
	|	b = labeledStatement {$ret = $b.ret;}
	|	c = ifThenStatement {$ret = $c.ret;}
	|	d = ifThenElseStatement {$ret = $d.ret;}
	|	e = whileStatement {$ret = $e.ret;}
	|	f = forStatement {$ret = $f.ret;}
	;

statementNoShortIf returns [Statement ret]
	:	a = statementWithoutTrailingSubstatement {$ret = $a.ret;}
	|	b = labeledStatementNoShortIf {$ret = $b.ret;}
	|	c = ifThenElseStatementNoShortIf {$ret = $c.ret;}
	|	d = whileStatementNoShortIf {$ret = $d.ret;}
	|	e = forStatementNoShortIf {$ret = $e.ret;}
	;

statementWithoutTrailingSubstatement returns [Statement ret]
	:	a = block {$ret = $a.ret;}
	|	b = emptyStatement// {$ret = $b.ret;}
	|	c = expressionStatement {$ret = $c.ret;}
	|	d = assertStatement {$ret = $d.ret;}
	|	e = switchStatement {$ret = $e.ret;}
	|	f = doStatement {$ret = $f.ret;}
	|	g = breakStatement {$ret = $g.ret;}
	|	h = continueStatement {$ret = $h.ret;}
	|	i = returnStatement {$ret = $i.ret;}
	|	j = synchronizedStatement {$ret = $j.ret;}
	|	k = throwStatement {$ret = $k.ret;}
	|	l = tryStatement {$ret = $l.ret;}
	;

emptyStatement returns [Statement ret]
	:	';' //{$ret = new Statement();}
	;

labeledStatement returns [LabelStatement ret]
	:	id = Identifier ':' s = statement
        {$ret = new LabelStatement($id.getText(), $s.ret);}
	;

labeledStatementNoShortIf returns [LabelStatement ret]
	:	id = Identifier ':' s = statementNoShortIf
        {$ret = new LabelStatement($id.getText(), $s.ret);}
	;

expressionStatement returns [Expression ret]
	:	s = statementExpression ';' {$ret = $s.ret;}
	;

statementExpression returns [Expression ret]
	:	a = assignment {$ret = $a.ret;}
	|	b = preIncrementExpression {$ret = $b.ret;}
	|	c = preDecrementExpression {$ret = $c.ret;}
	|	d = postIncrementExpression {$ret = $d.ret;}
	|	f = postDecrementExpression {$ret = $f.ret;}
	|	g = methodInvocation {$ret = $g.ret;}
	|	h = classInstanceCreationExpression {$ret = $h.ret;}
	;

ifThenStatement returns [IfElseStatement ret]
	:	'if' '(' e = expression ')' s = statement
        {$ret = new IfElseStatement($e.ret, new Block($s.ret));}
	;

ifThenElseStatement returns [IfElseStatement ret]
	:	'if' '(' e = expression ')' t = statementNoShortIf 'else' el = statement
        {$ret = new IfElseStatement($e.ret,
                                    new Block($t.ret),
                                    new Block($el.ret));}
	;

ifThenElseStatementNoShortIf returns [IfElseStatement ret]
	:	'if' '(' e = expression ')' t = statementNoShortIf
        'else' el = statementNoShortIf
        {$ret = new IfElseStatement($e.ret,
                                    new Block($t.ret),
                                    new Block($el.ret));}
	;

assertStatement returns [AssertStatement ret]
	:	'assert' e = expression ';' {$ret = new AssertStatement($e.ret);}
	|	'assert' e = expression ':' msg = expression ';'
        {$ret = new AssertStatement($e.ret, $msg.ret);}
	;

switchStatement returns [SwitchStatement ret]
	:	'switch' '(' e = expression ')' b = switchBlock
        {$ret = new SwitchStatement($e.ret, $b.ret);}
	;

switchBlock returns [List<CaseBlock> ret]
    locals [List<CaseBlock> blocks = new ArrayList<>()]
	:	'{' (m = switchBlockStatementGroup {$blocks.add($m.ret);})*
            (l = switchLabel {$blocks.add(new CaseBlock($l.ret));})* '}'
        {$ret = $blocks;}
	;

switchBlockStatementGroup returns [CaseBlock ret]
	:	l = switchLabels s = blockStatements
        {$ret = new CaseBlock($l.ret, new Block($s.ret));}
	;

switchLabels returns [List<Expression> ret]
    locals [List<Expression> lbls = new ArrayList<>()]
	:	(s = switchLabel {$lbls.add($s.ret);})
        (l = switchLabel {$lbls.add($l.ret);})*
        {$ret = $lbls;}
	;

switchLabel returns [Expression ret]
	:	'case' c = constantExpression ':' {$ret = $c.ret;}
	|	'case' en = enumConstantName ':'
        {$ret = new IdentifierExpression($en.ret);}
	|	'default' ':' {$ret = new IdentifierExpression("default");}
	;

enumConstantName returns [String ret]
	:	id = Identifier {$ret = $id.getText();}
	;

whileStatement returns [WhileStatement ret]
	:	'while' '(' c = expression ')' s = statement
        {$ret = new WhileStatement($c.ret, new Block($s.ret));}
	;

whileStatementNoShortIf returns [WhileStatement ret]
	:	'while' '(' c = expression ')' s = statementNoShortIf
        {$ret = new WhileStatement($c.ret, new Block($s.ret));}
	;

doStatement returns [WhileStatement ret]
	:	'do' s = statement 'while' '(' c = expression ')' ';'
        {$ret = new WhileStatement($c.ret, new Block($s.ret));}
	;

forStatement returns [Statement ret]
	:	b = basicForStatement {$ret = $b.ret;}
	|	e = enhancedForStatement {$ret = $e.ret;}
	;

forStatementNoShortIf returns [Statement ret]
	:	b = basicForStatementNoShortIf {$ret = $b.ret;}
	|	e = enhancedForStatementNoShortIf {$ret = $e.ret;}
	;

basicForStatement returns [ForStatement ret]
    locals [List<Statement> forIn,
            List<Statement> forUp,
            Expression expr]
	:	'for' '(' (i = forInit {$forIn = $i.ret;})? ';'
                  (e = expression {$expr = $e.ret;})? ';'
                  (u = forUpdate {$forUp = $u.ret;})? ')'
        s = statement
        {$ret = new ForStatement($forIn, $expr, $forUp, new Block($s.ret));}
	;

basicForStatementNoShortIf returns [ForStatement ret]
    locals [List<Statement> forIn,
            List<Statement> forUp,
            Expression expr]
	:	'for' '(' (i = forInit {$forIn = $i.ret;})? ';'
                  (e = expression {$expr = $e.ret;})? ';'
                  (u = forUpdate {$forUp = $u.ret;})? ')'
        s = statementNoShortIf
        {$ret = new ForStatement($forIn, $expr, $forUp, new Block($s.ret));}
	;

forInit returns [List<Statement> ret]
	:	ls = statementExpressionList {$ret = $ls.ret;}
	|	d = localVariableDeclaration
        {$ret = new ArrayList<Statement>();
         $ret.add($d.ret);}
	;

forUpdate returns [List<Statement> ret]
	:	ls = statementExpressionList {$ret = $ls.ret;}
	;

statementExpressionList returns [List<Statement> ret]
    locals [List<Statement> ups = new ArrayList<>()]
	:	(s = statementExpression {$ups.add($s.ret);})
        (',' e = statementExpression {$ups.add($e.ret);})*
        { $ret = $ups;}
	;

enhancedForStatement returns [ForEachStatement ret]
    locals [List<Modifier> mods = new ArrayList<>(),
            VariableDeclaration v]
	:	'for' '(' (m = variableModifier {$mods.add($m.ret);})*
                   t = unannType
                   n = variableDeclaratorId ':'
                   e = expression ')'
                   s = statement
        {$v = new VariableDeclaration(toName($n.ret), $t.ret, $mods);
         $ret = new ForEachStatement($v, $e.ret, new Block($s.ret));}
	;

enhancedForStatementNoShortIf returns [ForEachStatement ret]
    locals [List<Modifier> mods = new ArrayList<>(),
            VariableDeclaration v]
	:	'for' '(' (m = variableModifier {$mods.add($m.ret);})*
                   t = unannType
                   n = variableDeclaratorId ':'
                   e = expression ')'
                   s = statementNoShortIf
        {$v = new VariableDeclaration(toName($n.ret), $t.ret, $mods);
         $ret = new ForEachStatement($v, $e.ret, new Block($s.ret));}
	;

breakStatement returns [JumpStatement ret]
    locals [String name = null]
	:	'break' (id = Identifier {$name = $id.getText();})? ';'
        {$ret = new JumpStatement(true, $name);}
	;

continueStatement returns [JumpStatement ret]
    locals [String name = null]
	:	'continue' (id = Identifier {$name = $id.getText();})? ';'
        {$ret = new JumpStatement(false, $name);}
	;

returnStatement returns [ReturnStatement ret]
    locals [Expression expr = null]
	:	'return' (e = expression {$expr = $e.ret;})? ';'
        {$ret = new ReturnStatement($expr);}
	;

throwStatement returns [ThrowStatement ret]
	:	'throw' e = expression ';' {$ret = new ThrowStatement($e.ret);}
	;

synchronizedStatement returns [SynchronizedBlock ret]
	:	'synchronized' '(' e = expression ')' b = block
        {$ret = new SynchronizedBlock($e.ret, $b.ret);}
	;

tryStatement returns [TryCatchBlock ret]
    locals [List<CatchBlock> ls = null]
	:	'try' t = block cs = catches
        {$ret = new TryCatchBlock($t.ret, $cs.ret);}
	|	'try' t = block (cs = catches {$ls = $cs.ret;})? f = finally_
        {$ret = new TryCatchBlock($t.ret, $ls, $f.ret);}
	|	r = tryWithResourcesStatement {$ret = $r.ret;}
	;

catches returns [List<CatchBlock> ret]
    locals [List<CatchBlock> ls = new ArrayList<>()]
	:	f = catchClause {$ls.add($f.ret);} (c = catchClause {$ls.add($c.ret);})*
        {$ret = $ls;}
	;

catchClause returns [CatchBlock ret]
	:   {$ret = new CatchBlock();}
        'catch' '(' catchFormalParameter[$ret] ')'
        b = block {$ret.setStatements($b.ret.getStatements());}
	;

catchFormalParameter [CatchBlock ret]
    locals [List<Modifier> mods = new ArrayList<>()]
	:	(m = variableModifier {$mods.add($m.ret);})*
        catchType[$ret]
        n = variableDeclaratorId
        {$ret.setVariable(new VariableDeclaration(toName($n.ret), $mods));}
	;

catchType [CatchBlock ret]
	:	(u = unannClassType {$ret.addExceptionType($u.ret);})
        ('|' c = classType {$ret.addExceptionType($c.ret);})*
	;

finally_ returns [Block ret]
	:	'finally' body = block {$ret = $body.ret;}
	;

tryWithResourcesStatement returns [TryCatchBlock ret]
    locals [List<CatchBlock> ls = null,
            Block fin = null]
	:	'try' r = resourceSpecification b = block (c = catches {$ls = $c.ret;})?
        (f = finally_ {$fin = $f.ret;})?
        {$ret = new TryCatchBlock($r.ret, $b.ret, $ls, $fin);}
	;

resourceSpecification returns [List<VariableDeclaration> ret]
	:	{$ret = new ArrayList<>();}
        '(' (l = resourceList ';' {$ret = $l.ret;})? ')'
	;

resourceList returns [List<VariableDeclaration> ret]
    locals [List<VariableDeclaration> vars = new ArrayList<>()]
	:	r = resource {$vars.add($r.ret);}
        (';' re = resource {$vars.add($re.ret);})*
        {$ret = $vars;}
	;

resource returns [VariableDeclaration ret]
    locals [List<Modifier> mods = new ArrayList<>()]
	:	(m = variableModifier {$mods.add($m.ret);})*
        t = unannType
        n = variableDeclaratorId '='
        e = expression
    {$ret = new VariableDeclaration(toName($n.ret),
                                    $t.ret,
                                    $mods,
                                    $e.ret,
                                    false);}
	;

/*
 * Productions from §15 (Expressions)
 */

primary returns [Expression ret]
	:	(	pno = primaryNoNewArray_lfno_primary {$ret = $pno.ret;}
		|	a = arrayCreationExpression {$ret = $a.ret;}
		)
		(	p = primaryNoNewArray_lf_primary
            {
                if ($p.isAccess) {
                    $ret = new AccessExpression($ret, $p.ret);
                } else {
                    ((MethodReferenceExpression) $p.ret).setLHS($ret);
                    $ret = $p.ret;
                }
            }
		)*
	;

primaryNoNewArray returns [Expression ret]
	:	a1 = literal {$ret = $a1.ret;}
    |   a2 = primaryNoNewArray_typeAccess {$ret = $a2.ret;}
	|	'this' {$ret = new ThisLiteral();}
	|	'(' p = expression ')' {$ret = $p.ret;}
	|	a7 = classInstanceCreationExpression {$ret = $a7.ret;}
	|	a8 = fieldAccess {$ret = $a8.ret;}
	|	a9 = arrayAccess {$ret = $a9.ret;}
	|	a10 = methodInvocation {$ret = $a10.ret;}
	|	a11 = methodReference {$ret = $a11.ret;}
	;

primaryNoNewArray_typeAccess returns [Expression ret]
    locals [int cnt = 0,
            Type type]
	:	a2 = typeName
        ('[' ']' {++$cnt;})* '.' 'class'
        {
            $type = new ClassInterfaceType($a2.ret);
            if ($cnt > 0) {
                $type = new ArrayType($type, $cnt);
            }
            $ret = new AccessExpression(new TypeExpression($type),
                                        new ClassLiteral());
        }
	|	'void' '.' 'class'
        {$ret = new AccessExpression(new VoidLiteral(), new ClassLiteral());}
	|	a5 = typeName '.' 'this'
        {
            $ret = new AccessExpression(new TypeExpression(new ClassInterfaceType($a5.ret)),
                                        new ThisLiteral());
        }
    ;

primaryNoNewArray_lf_arrayAccess
	:
	;

primaryNoNewArray_lfno_arrayAccess returns [Expression ret]
	:	a1 = literal {$ret = $a1.ret;}
    |   a2 = primaryNoNewArray_typeAccess {$ret = $a2.ret;}
	|	'this' {$ret = new ThisLiteral();}
	|	'(' p = expression ')' {$ret = $p.ret;}
	|	a5 = classInstanceCreationExpression {$ret = $a5.ret;}
	|   a6 = fieldAccess {$ret = $a6.ret;}
	|	a7 = methodInvocation {$ret = $a7.ret;}
	|	a8 = methodReference {$ret = $a8.ret;}
	;

primaryNoNewArray_lf_primary returns [Expression ret, boolean isAccess]
	:	a1 = classInstanceCreationExpression_lf_primary {$ret = $a1.ret;
                                                         $isAccess = true;}
	|	a2 = fieldAccess_lf_primary {$ret = $a2.ret; $isAccess = true;}
	|	a3 = arrayAccess_lf_primary {$ret = $a3.ret; $isAccess = $a3.isAccess;}
	|	a4 = methodInvocation_lf_primary {$ret = $a4.ret; $isAccess = true;}
	|	a5 = methodReference_lf_primary {$ret = $a5.ret; $isAccess = false;}
	;

primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary
	:
	;

primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary returns [Expression ret,
                                                                  boolean isAccess]
	:	a1 = classInstanceCreationExpression_lf_primary {$ret = $a1.ret;
                                                         $isAccess = true;}
	|	a2 = fieldAccess_lf_primary {$ret = $a2.ret; $isAccess = true;}
	|	a3 = methodInvocation_lf_primary {$ret = $a3.ret; $isAccess = true;}
	|	a4 = methodReference_lf_primary {$ret = $a4.ret; $isAccess = false;}
	;

primaryNoNewArray_lfno_primary returns [Expression ret]
    locals [int cnt = 0,
            Type type]
	:	a1 = literal {$ret = $a1.ret;}
    |   a2 = primaryNoNewArray_typeAccess {$ret = $a2.ret;}
	|	a3 = unannPrimitiveType
        ('[' ']' {++$cnt;})* '.' 'class'
        {
            $type = $a3.ret;
            if ($cnt > 0) {
                $type = new ArrayType($type, $cnt);
            }
            $ret = new AccessExpression(new TypeExpression($type),
                                        new ClassLiteral());
        }
	|	'this' {$ret = new ThisLiteral();}
	|	'(' p = expression ')' {$ret = $p.ret;}
	|	a7 = classInstanceCreationExpression_lfno_primary {$ret = $a7.ret;}
	|	a8 = fieldAccess_lfno_primary {$ret = $a8.ret;}
	|	a9 = arrayAccess_lfno_primary {$ret = $a9.ret;}
	|	a10 = methodInvocation_lfno_primary {$ret = $a10.ret;}
	|	a11 = methodReference_lfno_primary {$ret = $a11.ret;}
	;

primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary
	:
	;

primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary returns [Expression ret]
    locals [int cnt = 0,
            Type type]
	:	a1 = literal {$ret = $a1.ret;}
    |   a2 = primaryNoNewArray_typeAccess {$ret = $a2.ret;}
	|	a3 = unannPrimitiveType
        ('[' ']' {++$cnt;})* '.' 'class'
        {
            $type = $a3.ret;
            if ($cnt > 0) {
                $type = new ArrayType($type, $cnt);
            }
            $ret = new AccessExpression(new TypeExpression($type),
                                        new ClassLiteral());
        }
	|	'this' {$ret = new ThisLiteral();}
	|	'(' p = expression ')' {$ret = $p.ret;}
	|	a7 = classInstanceCreationExpression_lfno_primary {$ret = $a7.ret;}
	|	a8 = fieldAccess_lfno_primary {$ret = $a8.ret;}
	|	a9 = methodInvocation_lfno_primary {$ret = $a9.ret;}
	|	a10 = methodReference_lfno_primary {$ret = $a10.ret;}
	;

classInstanceCreationExpression returns [Expression ret]
    locals [Expression methodExpr,
            List<Annotation> ans = new ArrayList<>(),
            List<Annotation> ans2 = new ArrayList<>(),
            ConcreteBodyDeclaration anon,
            InstantiationExpression inst,
            List<TypeArgument> targs = null,
            List<TypeArgument> targsd = null,
            List<Expression> args = null]
	:	'new' (t = typeArguments {$targs = $t.ret;})?
        (a = annotation {$ans.add($a.ret);})*
        id = Identifier
        {
            $methodExpr = new IdentifierExpression($id.getText(), $ans);
        }
        ('.' (a2 = annotation {$ans2.add($a2.ret);})* id2 = Identifier
            {
                $methodExpr = new AccessExpression($methodExpr,
                                                   new IdentifierExpression($id2.getText(),
                                                                            $ans2));
                $ans2.clear();
            }
        )*
        (ta = typeArgumentsOrDiamond {$targsd = $ta.ret;})?
        '(' (l = argumentList {$args = $l.ret;})? ')'
        {
            $inst = new InstantiationExpression($targs, $methodExpr,
                                                $targsd, $args);
            $anon = $inst.getAnonymousClass();
            $ret = $inst;
        }
        (classBody[$anon])?
	|	name = expressionName '.' 'new' (t = typeArguments {$targs = $t.ret;})?
        (a = annotation {$ans.add($a.ret);})*
        id = Identifier (ta = typeArgumentsOrDiamond {$targsd = $ta.ret;})?
        '(' (l = argumentList {$args = $l.ret;})? ')'
        {
            $inst = new InstantiationExpression($targs, $ans, $id.getText(),
                                                $targsd, $args);
            $anon = $inst.getAnonymousClass();
            $ret = new AccessExpression($name.ret, $inst);
        }
        (classBody[$anon])?
	|	p = primary '.' 'new' (t = typeArguments {$targs = $t.ret;})?
        (a = annotation {$ans.add($a.ret);})*
        id = Identifier (ta = typeArgumentsOrDiamond {$targsd = $ta.ret;})?
        '(' (l = argumentList {$args = $l.ret;})? ')'
        {
            $inst = new InstantiationExpression($targs, $ans, $id.getText(),
                                                $targsd, $args);
            $anon = $inst.getAnonymousClass();
            $ret = new AccessExpression($p.ret, $inst);
        }
        (classBody[$anon])?
	;

classInstanceCreationExpression_lf_primary returns [InstantiationExpression ret]
    locals [List<Annotation> ans = new ArrayList<>(),
            ConcreteBodyDeclaration anon,
            InstantiationExpression inst,
            List<TypeArgument> targs = null,
            List<TypeArgument> targsd = null,
            List<Expression> args = null]
	:	'.' 'new' (t = typeArguments {$targs = $t.ret;})?
        (a = annotation {$ans.add($a.ret);})*
        id = Identifier
        (ta = typeArgumentsOrDiamond {$targsd = $ta.ret;})?
        '(' (l = argumentList {$args = $l.ret;})? ')'
        {
            $inst = new InstantiationExpression($targs, $ans, $id.getText(),
                                                $targsd, $args);
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
            List<TypeArgument> targs = null,
            List<TypeArgument> targsd = null,
            List<Expression> args = null]
	:	'new' (t = typeArguments {$targs = $t.ret;})?
        (a = annotation {$ans.add($a.ret);})*
        id = Identifier
        {
            $methodExpr = new IdentifierExpression($id.getText(), $ans);
        }
        ('.' (a2 = annotation {$ans2.add($a2.ret);})* id2 = Identifier
            {
                $methodExpr = new AccessExpression($methodExpr,
                                                   new IdentifierExpression($id2.getText(),
                                                                            $ans2));
                $ans2.clear();
            }
        )*
        (ta = typeArgumentsOrDiamond {$targsd = $ta.ret;})?
        '(' (l = argumentList {$args = $l.ret;})? ')'
        {
            $inst = new InstantiationExpression($targs, $methodExpr,
                                                $targsd, $args);
            $anon = $inst.getAnonymousClass();
            $ret = $inst;
        }
        (classBody[$anon])?
	|	name = expressionName '.' 'new' (t = typeArguments {$targs = $t.ret;})?
        (a = annotation {$ans.add($a.ret);})*
        id = Identifier (ta = typeArgumentsOrDiamond {$targsd = $ta.ret;})?
        '(' (l = argumentList {$args = $l.ret;})? ')'
        {
            $inst = new InstantiationExpression($targs, $ans, $id.getText(),
                                                $targsd, $args);
            $anon = $inst.getAnonymousClass();
            $ret = new AccessExpression($name.ret, $inst);
        }
        (classBody[$anon])?
    ;

typeArgumentsOrDiamond returns [List<TypeArgument> ret]
	:	ta = typeArguments {$ret = $ta.ret;}
	|	'<' '>' {$ret = new ArrayList<>(); $ret.add(TypeArgument.DIAMOND);}
	;

fieldAccess returns [AccessExpression ret]
	:	p = primary '.' id = Identifier
        {$ret = new AccessExpression($p.ret, $id.getText());}
	|	'super' '.' id = Identifier
        {$ret = new AccessExpression(new SuperLiteral(), $id.getText());}
	|	t = typeName '.' 'super' '.' id = Identifier
        {$ret = new AccessExpression(new IdentifierExpression($t.ret),
                                     new AccessExpression(new SuperLiteral(),
                                                          $id.getText()));}
	;

fieldAccess_lf_primary returns [IdentifierExpression ret]
	:	'.' id = Identifier {$ret = new IdentifierExpression($id.getText());}
	;

fieldAccess_lfno_primary returns [AccessExpression ret]
	:	'super' '.' id = Identifier
        {$ret = new AccessExpression(new SuperLiteral(), $id.getText());}
	|	t = typeName '.' 'super' '.' id = Identifier
        {
            $ret = new AccessExpression(new SuperLiteral(), $id.getText());
            $ret = new AccessExpression(new IdentifierExpression($t.ret), $ret);
        }
	;

arrayAccess returns [ArrayAccessExpression ret]
	:	(	(n = expressionName '[' i = expression ']'
                {$ret = new ArrayAccessExpression($n.ret, $i.ret);})
		|	(pno = primaryNoNewArray_lfno_arrayAccess '[' i = expression ']'
                {$ret = new ArrayAccessExpression($pno.ret, $i.ret);})
		)
		(	primaryNoNewArray_lf_arrayAccess '[' i = expression ']'
                {$ret = new ArrayAccessExpression($ret, $i.ret);}
		)*
	;

arrayAccess_lf_primary returns [ArrayAccessExpression ret, boolean isAccess]
	:	(	(pno = primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary
           '[' i = expression ']'
                {$ret = new ArrayAccessExpression($pno.ret, $i.ret);
                 $isAccess = $pno.isAccess;})
		)
		(	primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary
            '[' i2 = expression ']'
            {$ret = new ArrayAccessExpression($ret, $i2.ret);}
		)*
	;

arrayAccess_lfno_primary returns [ArrayAccessExpression ret]
	:	(	(name = expressionName '[' i = expression ']'
                {$ret = new ArrayAccessExpression($name.ret, $i.ret);})
		|	(pno = primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary
                '[' i = expression ']'
                {$ret = new ArrayAccessExpression($pno.ret, $i.ret);})
		)
		(	primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary
            '[' i2 = expression ']'
            {$ret = new ArrayAccessExpression($ret, $i2.ret);}
		)*
	;

methodInvocation returns [Expression ret]
    locals [List<Expression> args = null,
            List<TypeArgument> targs = null]
    :	mn = methodName '(' (a = argumentList {$args = $a.ret;})? ')'
        {$ret = new CallExpression($mn.ret, $args);}
	|	tn = typeName '.' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier '(' (a = argumentList {$args = $a.ret;})? ')'
        {$ret = new CallExpression($id.getText(), $args, $targs);
         $ret = new AccessExpression($tn.ret, $ret);}
	|	en = expressionName '.' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier '(' (a = argumentList {$args = $a.ret;})? ')'
        {$ret = new CallExpression($id.getText(), $args, $targs);
         $ret = new AccessExpression($en.ret, $ret);}
	|	p = primary '.' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier '(' (a = argumentList {$args = $a.ret;})? ')'
        {$ret = new CallExpression($id.getText(), $args, $targs);
         $ret = new AccessExpression($p.ret, $ret);}
	|	'super' '.' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier '(' (a = argumentList {$args = $a.ret;})? ')'
        {$ret = new CallExpression($id.getText(), $args, $targs);
         $ret = new AccessExpression(new SuperLiteral(), $ret);}
	|	tn = typeName '.' 'super' '.' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier '(' (a = argumentList {$args = $a.ret;})? ')'
        {$ret = new CallExpression($id.getText(), $args, $targs);
         $ret = new AccessExpression(new SuperLiteral(), $ret);
         $ret = new AccessExpression($tn.ret, $ret);}
	;

methodInvocation_lf_primary returns [CallExpression ret]
    locals [List<Expression> args = null,
            List<TypeArgument> targs = null]
	:	'.' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier '(' (a = argumentList {$args = $a.ret;})? ')'
        {$ret = new CallExpression($id.getText(), $args, $targs);}
	;

methodInvocation_lfno_primary returns [Expression ret]
    locals [List<Expression> args = null,
            List<TypeArgument> targs = null]
	:	mn = methodName '(' (a = argumentList {$args = $a.ret;})? ')'
        {$ret = new CallExpression($mn.ret, $args);}
	|	tn = typeName '.' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier '(' (a = argumentList {$args = $a.ret;})? ')'
        {$ret = new CallExpression($id.getText(), $args, $targs);
         $ret = new AccessExpression($tn.ret, $ret);}
	|	en = expressionName '.' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier '(' (a = argumentList {$args = $a.ret;})? ')'
        {$ret = new CallExpression($id.getText(), $args, $targs);
         $ret = new AccessExpression($en.ret, $ret);}
	|	'super' '.' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier '(' (a = argumentList {$args = $a.ret;})? ')'
        {$ret = new CallExpression($id.getText(), $args, $targs);
         $ret = new AccessExpression(new SuperLiteral(), $ret);}
	|	tn = typeName '.' 'super' '.' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier '(' (a = argumentList {$args = $a.ret;})? ')'
        {$ret = new CallExpression($id.getText(), $args, $targs);
         $ret = new AccessExpression(new SuperLiteral(), $ret);
         $ret = new AccessExpression($tn.ret, $ret);}
	;

argumentList returns [List<Expression> ret]
    locals [List<Expression> ls = new ArrayList<>()]
	:	(e = expression {$ls.add($e.ret);})
        (',' ex = expression {$ls.add($ex.ret);})* {$ret = $ls;}
	;

methodReference returns [Expression ret]
    locals [List<TypeArgument> targs = null]
	:	en = expressionName '::' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier
        {$ret = new MethodReferenceExpression($en.ret, $id.getText(), $targs);}
	|	r = referenceType '::' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier
        {$ret = new MethodReferenceExpression(new TypeExpression($r.ret),
                                              $id.getText(),
                                              $targs);}
	|	p = primary '::' (t = typeArguments {$targs = $t.ret;})? id = Identifier
        {$ret = new MethodReferenceExpression($p.ret, $id.getText(), $targs);}
	|	'super' '::' (t = typeArguments {$targs = $t.ret;})? id = Identifier
        {$ret = new MethodReferenceExpression(new SuperLiteral(),
                                              $id.getText(),
                                              $targs);}
	|	tn = typeName '.' 'super' '::' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier
        {
            $ret = new MethodReferenceExpression(new SuperLiteral(),
                                                 $id.getText(),
                                                 $targs);
            $ret = new AccessExpression(new IdentifierExpression($tn.ret),
                                        $ret);
        }
	|	c = classType '::' (t = typeArguments {$targs = $t.ret;})? 'new'
        {$ret = new MethodReferenceExpression(new TypeExpression($c.ret),
                                              "new",
                                              $targs);}
	|	a = arrayType '::' 'new'
        {$ret = new MethodReferenceExpression(new TypeExpression($a.ret),
                                              "new");}
	;

methodReference_lf_primary returns [MethodReferenceExpression ret]
    locals [List<TypeArgument> targs = null]
	:	'::' (t = typeArguments {$targs = $t.ret;})? id = Identifier
        {$ret = new MethodReferenceExpression($id.getText(), $targs);}
	;

methodReference_lfno_primary returns [Expression ret]
    locals [List<TypeArgument> targs = null]
	:	en = expressionName '::' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier
        {$ret = new MethodReferenceExpression($en.ret, $id.getText(), $targs);}
	|	r = referenceType '::' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier
        {$ret = new MethodReferenceExpression(new TypeExpression($r.ret),
                                              $id.getText(),
                                              $targs);}
	|	'super' '::' (t = typeArguments {$targs = $t.ret;})? id = Identifier
        {$ret = new MethodReferenceExpression(new SuperLiteral(),
                                              $id.getText(),
                                              $targs);}
	|	tn = typeName '.' 'super' '::' (t = typeArguments {$targs = $t.ret;})?
        id = Identifier
        {
            $ret = new MethodReferenceExpression(new SuperLiteral(),
                                                 $id.getText(),
                                                 $targs);
            $ret = new AccessExpression(new IdentifierExpression($tn.ret),
                                        $ret);
        }
	|	c = classType '::' (t = typeArguments {$targs = $t.ret;})? 'new'
        {$ret = new MethodReferenceExpression(new TypeExpression($c.ret),
                                              "new",
                                              $targs);}
	|	a = arrayType '::' 'new'
        {$ret = new MethodReferenceExpression(new TypeExpression($a.ret),
                                              "new");}
	;

arrayCreationExpression returns [ArrayConstruction ret]
    locals [int dim = 0]
	:	'new' p = primitiveType de = dimExprs (d = dims {$dim = $d.ret;})?
        {$ret = new ArrayConstruction($p.ret, $de.ret, $dim);}
	|	'new' c = classOrInterfaceType de = dimExprs
        (d = dims {$dim = $d.ret;})?
        {$ret = new ArrayConstruction($c.ret, $de.ret, $dim);}
	|	'new' p = primitiveType d = dims i = arrayInitializer
        {$ret = new ArrayConstruction($p.ret, $d.ret, $i.ret);}
	|	'new' c = classOrInterfaceType d = dims i = arrayInitializer
        {$ret = new ArrayConstruction($c.ret, $d.ret, $i.ret);}
	;

dimExprs returns [List<DimensionExpression> ret]
	:	d1 = dimExpr {$ret = new ArrayList<>(); $ret.add($d1.ret);}
        (d = dimExpr {$ret.add($d.ret);})*
	;

dimExpr returns [DimensionExpression ret]
    locals [List<Annotation> ans = new ArrayList<>()]
	:	(a = annotation {$ans.add($a.ret);})*
        '[' ex = expression ']'
        {$ret = new DimensionExpression($ans, $ex.ret);}
	;

constantExpression returns [Expression ret]
	:	ex = expression {$ret = $ex.ret;}
	;

expression returns [Expression ret]
	:	l = lambdaExpression {$ret = $l.ret;}
	|	a = assignmentExpression {$ret = $a.ret;}
	;

lambdaExpression returns [LambdaExpression ret]
	:	p = lambdaParameters '->' b = lambdaBody
        {$ret = new LambdaExpression($p.ret, $b.ret);}
	;

lambdaParameters returns [List<VariableDeclaration> ret]
    locals [List<VariableDeclaration> vars = new ArrayList<>()]
	:	id = Identifier
        {$vars.add(new VariableDeclaration($id.getText()));
         $ret = $vars;}
	|    {$ret = $vars;}
        '(' (p = formalParameterList {$ret = $p.ret;})? ')'
	|	'(' i = inferredFormalParameterList ')' {$ret = $i.ret;}
	;

inferredFormalParameterList returns [List<VariableDeclaration> ret]
    locals [List<VariableDeclaration> vars = new ArrayList<>()]
	:	(id = Identifier {$vars.add(new VariableDeclaration($id.getText()));})
        (',' i = Identifier
            {$vars.add(new VariableDeclaration($i.getText()));})*
        {$ret = $vars;}
	;

lambdaBody returns [Block ret]
	:	e = expression {$ret = new Block($e.ret);}
	|	body = block {$ret = $body.ret;}
	;

assignmentExpression returns [Expression ret]
	:	c = conditionalExpression {$ret = $c.ret;}
	|	a = assignment {$ret = $a.ret;}
	;

assignment returns [AssignmentExpression ret]
	:	l = leftHandSide op = assignmentOperator r = expression
        {$ret = new AssignmentExpression($l.ret, $op.ret, $r.ret);}
	;

leftHandSide returns [Expression ret]
	:	n = expressionName {$ret = new IdentifierExpression($n.ret);}
	|	f = fieldAccess {$ret = $f.ret;}
	|	a = arrayAccess {$ret = $a.ret;}
	;

assignmentOperator returns [AssignmentOperator ret]
	:	'=' {$ret = AssignmentOperator.EQUALS;}
	|	'*=' {$ret = AssignmentOperator.MULTIPLICATION;}
	|	'/=' {$ret = AssignmentOperator.DIVISION;}
	|	'%=' {$ret = AssignmentOperator.MODULUS;}
	|	'+=' {$ret = AssignmentOperator.ADDITION;}
	|	'-=' {$ret = AssignmentOperator.SUBTRACTION;}
	|	'<<=' {$ret = AssignmentOperator.LEFT_SHIFT;}
	|	'>>=' {$ret = AssignmentOperator.RIGHT_SHIFT;}
	|	'>>>=' {$ret = AssignmentOperator.RIGHT_LOGICAL_SHIFT;}
	|	'&=' {$ret = AssignmentOperator.BITWISE_AND;}
	|	'^=' {$ret = AssignmentOperator.BITWISE_XOR;}
	|	'|=' {$ret = AssignmentOperator.BITWISE_OR;}
	;

conditionalExpression returns [Expression ret]
	:	c = conditionalOrExpression {$ret = $c.ret;}
	|	c = conditionalOrExpression '?'
        i = expression ':' el = conditionalExpression
        {$ret = new TernaryExpression($c.ret, $i.ret, $el.ret);}
	;

conditionalOrExpression returns [Expression ret]
	:	c = conditionalAndExpression {$ret = $c.ret;}
	|	c1 = conditionalOrExpression '||' c2 = conditionalAndExpression
        {$ret = new BinaryExpression($c1.ret, BinaryOperator.OR, $c2.ret);}
	;

conditionalAndExpression returns [Expression ret]
	:	i = inclusiveOrExpression {$ret = $i.ret;}
	|	l = conditionalAndExpression '&&' r = inclusiveOrExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.AND, $r.ret);}
	;

inclusiveOrExpression returns [Expression ret]
	:	ex = exclusiveOrExpression {$ret = $ex.ret;}
	|	l = inclusiveOrExpression '|' r = exclusiveOrExpression
        {$ret = new BinaryExpression($l.ret,BinaryOperator.BITWISE_OR, $r.ret);}
	;

exclusiveOrExpression returns [Expression ret]
	:	ex = andExpression {$ret = $ex.ret;}
	|	l = exclusiveOrExpression '^' r = andExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.BITWISE_XOR, $r.ret);}
	;

andExpression returns [Expression ret]
	:	ex = equalityExpression {$ret = $ex.ret;}
	|	l = andExpression '&' r = equalityExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.BITWISE_AND, $r.ret);}
	;

equalityExpression returns [Expression ret]
	:	ex = relationalExpression {$ret = $ex.ret;}
	|	l = equalityExpression '==' r = relationalExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.EQUALITY, $r.ret);}
	|	l = equalityExpression '!=' r = relationalExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.INEQUALITY, $r.ret);}
	;

relationalExpression returns [Expression ret]
	:	ex = shiftExpression {$ret = $ex.ret;}
	|	l = relationalExpression '<' r = shiftExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.LESS_THAN, $r.ret);}
	|	l = relationalExpression '>' r = shiftExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.GREATER_THAN, $r.ret);}
	|	l = relationalExpression '<=' r = shiftExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.LESS_THAN_OR_EQUAL, $r.ret);}
	|	l = relationalExpression '>=' r = shiftExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.GREATER_THAN_OR_EQUAL, $r.ret);}
	|	l = relationalExpression 'instanceof' rt = referenceType
        {$ret = new BinaryExpression($l.ret,
                                     BinaryOperator.INSTANCE_OF,
                                     new TypeExpression($rt.ret));}
	;

shiftExpression returns [Expression ret]
	:	ex = additiveExpression {$ret = $ex.ret;}
	|	l = shiftExpression '<' '<' r = additiveExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.LEFT_SHIFT, $r.ret);}
	|	l = shiftExpression '>' '>' r = additiveExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.RIGHT_SHIFT, $r.ret);}
	|	l = shiftExpression '>' '>' '>' r = additiveExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.RIGHT_LOGICAL_SHIFT, $r.ret);}
	;

additiveExpression returns [Expression ret]
	:	ex = multiplicativeExpression {$ret = $ex.ret;}
	|	l = additiveExpression '+' r = multiplicativeExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.ADDITION, $r.ret);}
	|	l = additiveExpression '-' r = multiplicativeExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.SUBTRACTION, $r.ret);}
	;

multiplicativeExpression returns [Expression ret]
	:	ex = unaryExpression {$ret = $ex.ret;}
	|	l = multiplicativeExpression '*' r = unaryExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.MULTIPLICATION, $r.ret);}
	|	l = multiplicativeExpression '/' r = unaryExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.DIVISION, $r.ret);}
	|	l = multiplicativeExpression '%' r = unaryExpression
        {$ret = new BinaryExpression($l.ret, BinaryOperator.MODULUS, $r.ret);}
	;

unaryExpression returns [Expression ret]
	:	pi = preIncrementExpression {$ret = $pi.ret;}
	|	pd = preDecrementExpression {$ret = $pd.ret;}
	|	'+' ex = unaryExpression {$ret = $ex.ret;}
	|	'-' ex = unaryExpression
        {$ret = new UnaryExpression($ex.ret, UnaryOperator.NEGATION);}
	|	npm = unaryExpressionNotPlusMinus {$ret = $npm.ret;}
	;

preIncrementExpression returns [UnaryExpression ret]
	:	'++' ex = unaryExpression
        {$ret = new UnaryExpression($ex.ret, UnaryOperator.PRE_INCREMENT);}
	;

preDecrementExpression returns [UnaryExpression ret]
	:	'--' ex = unaryExpression
        {$ret = new UnaryExpression($ex.ret, UnaryOperator.PRE_DECREMENT);}
	;

unaryExpressionNotPlusMinus returns [Expression ret]
	:	pf = postfixExpression {$ret = $pf.ret;}
	|	'~' ex = unaryExpression
        {$ret = new UnaryExpression($ex.ret, UnaryOperator.BITWISE_NEGATION);}
	|	'!' ex = unaryExpression
        {$ret = new UnaryExpression($ex.ret, UnaryOperator.NEGATION);}
	|	cex = castExpression {$ret = $cex.ret;}
	;

postfixExpression returns [Expression ret]
	:	(	p = primary {$ret = $p.ret;}
		|	n = expressionName {$ret = new IdentifierExpression($n.ret);}
		)
		(	op1 = postIncrementExpression_lf_postfixExpression
            {$ret = new UnaryExpression($ret, $op1.ret);}
		|	op2 = postDecrementExpression_lf_postfixExpression
            {$ret = new UnaryExpression($ret, $op2.ret);}
		)*
	;

postIncrementExpression returns [UnaryExpression ret]
	:	ex = postfixExpression '++'
        {$ret = new UnaryExpression($ex.ret, UnaryOperator.INCREMENT);}
	;

postIncrementExpression_lf_postfixExpression returns [UnaryOperator ret]
	:	'++' {$ret = UnaryOperator.INCREMENT;}
	;

postDecrementExpression returns [UnaryExpression ret]
	:	ex = postfixExpression '--'
        {$ret = new UnaryExpression($ex.ret, UnaryOperator.DECREMENT);}
	;

postDecrementExpression_lf_postfixExpression returns [UnaryOperator ret]
	:	'--' {$ret = UnaryOperator.DECREMENT;}
	;

castExpression returns [CastExpression ret]
    locals [List<ReferenceType> ls = new ArrayList<>()]
	:	'(' pt = primitiveType ')' uex = unaryExpression
        {$ret = new CastExpression($uex.ret, $pt.ret);}
	|	'(' rt = referenceType {$ls.add($rt.ret);}
        (b = additionalBound {$ls.add($b.ret);})* ')'
        npm = unaryExpressionNotPlusMinus
        {$ret = new CastExpression($npm.ret, $ls);}
	|	'(' rt = referenceType {$ls.add($rt.ret);}
        (b = additionalBound {$ls.add($b.ret);})* ')'
        lam = lambdaExpression
        {$ret = new CastExpression($lam.ret, $ls);}
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
	:	DecimalIntegerLiteral
	|	HexIntegerLiteral
	|	OctalIntegerLiteral
	|	BinaryIntegerLiteral
	;

fragment
DecimalIntegerLiteral
	:	DecimalNumeral IntegerTypeSuffix?
	;

fragment
HexIntegerLiteral
	:	HexNumeral IntegerTypeSuffix?
	;

fragment
OctalIntegerLiteral
	:	OctalNumeral IntegerTypeSuffix?
	;

fragment
BinaryIntegerLiteral
	:	BinaryNumeral IntegerTypeSuffix?
	;

fragment
IntegerTypeSuffix
	:	[lL]
	;

fragment
DecimalNumeral
	:	'0'
	|	NonZeroDigit (Digits? | Underscores Digits)
	;

fragment
Digits
	:	Digit (DigitsAndUnderscores? Digit)?
	;

fragment
Digit
	:	'0'
	|	NonZeroDigit
	;

fragment
NonZeroDigit
	:	[1-9]
	;

fragment
DigitsAndUnderscores
	:	DigitOrUnderscore+
	;

fragment
DigitOrUnderscore
	:	Digit
	|	'_'
	;

fragment
Underscores
	:	'_'+
	;

fragment
HexNumeral
	:	'0' [xX] HexDigits
	;

fragment
HexDigits
	:	HexDigit (HexDigitsAndUnderscores? HexDigit)?
	;

fragment
HexDigit
	:	[0-9a-fA-F]
	;

fragment
HexDigitsAndUnderscores
	:	HexDigitOrUnderscore+
	;

fragment
HexDigitOrUnderscore
	:	HexDigit
	|	'_'
	;

fragment
OctalNumeral
	:	'0' Underscores? OctalDigits
	;

fragment
OctalDigits
	:	OctalDigit (OctalDigitsAndUnderscores? OctalDigit)?
	;

fragment
OctalDigit
	:	[0-7]
	;

fragment
OctalDigitsAndUnderscores
	:	OctalDigitOrUnderscore+
	;

fragment
OctalDigitOrUnderscore
	:	OctalDigit
	|	'_'
	;

fragment
BinaryNumeral
	:	'0' [bB] BinaryDigits
	;

fragment
BinaryDigits
	:	BinaryDigit (BinaryDigitsAndUnderscores? BinaryDigit)?
	;

fragment
BinaryDigit
	:	[01]
	;

fragment
BinaryDigitsAndUnderscores
	:	BinaryDigitOrUnderscore+
	;

fragment
BinaryDigitOrUnderscore
	:	BinaryDigit
	|	'_'
	;

// §3.10.2 Floating-Point Literals

FloatingPointLiteral
	:	DecimalFloatingPointLiteral
	|	HexadecimalFloatingPointLiteral
	;

fragment
DecimalFloatingPointLiteral
	:	Digits '.' Digits? ExponentPart? FloatTypeSuffix?
	|	'.' Digits ExponentPart? FloatTypeSuffix?
	|	Digits ExponentPart FloatTypeSuffix?
	|	Digits FloatTypeSuffix
	;

fragment
ExponentPart
	:	ExponentIndicator SignedInteger
	;

fragment
ExponentIndicator
	:	[eE]
	;

fragment
SignedInteger
	:	Sign? Digits
	;

fragment
Sign
	:	[+-]
	;

fragment
FloatTypeSuffix
	:	[fFdD]
	;

fragment
HexadecimalFloatingPointLiteral
	:	HexSignificand BinaryExponent FloatTypeSuffix?
	;

fragment
HexSignificand
	:	HexNumeral '.'?
	|	'0' [xX] HexDigits? '.' HexDigits
	;

fragment
BinaryExponent
	:	BinaryExponentIndicator SignedInteger
	;

fragment
BinaryExponentIndicator
	:	[pP]
	;

// §3.10.3 Boolean Literals

BooleanLiteral
	:	'true'
	|	'false'
	;

// §3.10.4 Character Literals

CharacterLiteral
	:	'\'' SingleCharacter '\''
	|	'\'' EscapeSequence '\''
	;

fragment
SingleCharacter
	:	~['\\]
	;

// §3.10.5 String Literals

StringLiteral
	:	'"' StringCharacters? '"'
	;

fragment
StringCharacters
	:	StringCharacter+
	;

fragment
StringCharacter
	:	~["\\]
	|	EscapeSequence
	;

// §3.10.6 Escape Sequences for Character and String Literals

fragment
EscapeSequence
	:	'\\' [btnfr"'\\]
	|	OctalEscape
    |   UnicodeEscape // This is not in the spec but prevents having to preprocess the input
	;

fragment
OctalEscape
	:	'\\' OctalDigit
	|	'\\' OctalDigit OctalDigit
	|	'\\' ZeroToThree OctalDigit OctalDigit
	;

fragment
ZeroToThree
	:	[0-3]
	;

// This is not in the spec but prevents having to preprocess the input
fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

// §3.10.7 The Null Literal

NullLiteral
	:	'null'
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
	:	JavaLetter (JavaLetterOrDigit)*
	;

fragment
JavaLetter
	:	[a-zA-Z$_] // these are the "java letters" below 0x7F
/*	|	// covers all characters above 0x7F which are not a surrogate
		~[\u0000-\u007F\uD800-\uDBFF]
		{Character.isJavaIdentifierStart(_input.LA(-1))}?
	|	// covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
		[\uD800-\uDBFF] [\uDC00-\uDFFF]
		{Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
*/
	;

fragment
JavaLetterOrDigit
	:	[a-zA-Z0-9$_] // these are the "java letters or digits" below 0x7F
/*
	|	// covers all characters above 0x7F which are not a surrogate
		~[\u0000-\u007F\uD800-\uDBFF]
		{Character.isJavaIdentifierPart(_input.LA(-1))}?
	|	// covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
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
