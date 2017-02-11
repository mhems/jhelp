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

    import com.binghamton.ast.*;
}

/*
 * Productions from §3 (Lexical Structure)
 */

literal returns [LiteralExpression e]
	:	i = IntegerLiteral
        {$e = new LiteralExpression($i.getText(), PrimitiveType.INT);}
	|	f = FloatingPointLiteral
        {$e = new LiteralExpression($f.getText(), PrimitiveType.FLOAT);}
	|	b = BooleanLiteral
        {$e = new LiteralExpression($b.getText(), PrimitiveType.BOOLEAN);}
	|	c = CharacterLiteral
        {$e = new LiteralExpression($c.getText(), PrimitiveType.CHAR);}
	|	s = StringLiteral
        {$e = new LiteralExpression($s.getText(), String);}
	|	n = NullLiteral
        {$e = LiteralExpression.NULL;}
	;

/*
 * Productions from §4 (Types, Values, and Variables)
 */

type_ returns [Type t]
	:	p = primitiveType {$t = $p;}
	|	r = referenceType {$t = $r;}
	;

primitiveType returns [PrimitiveType t]
    locals [List<Annotation> anns = new ArrayList<>();]
	:	(a = annotation {$anns.add($a);})* n = numericType
        {$t = n;}
	|	(a = annotation {$anns.add($a);})* 'boolean'
        {$t = PrimitiveType.BOOLEAN;}
	;

numericType returns [PrimitiveType p]
	:	i = integralType {$p = $i;}
	|	f = floatingPointType {$p = $f;}
	;

integralType returns [PrimitiveType p]
	:	'byte' {$p = PrimitiveType.BYTE;}
	|	'short' {$p = PrimitiveType.SHORT;}
	|	'int' {$p = PrimitiveType.INT;}
	|	'long' {$p = PrimitiveType.LONG;}
	|	'char' {$p = PrimitiveType.CHAR;}
	;

floatingPointType returns [PrimitiveType p]
	:	'float' {$p = PrimitiveType.FLOAT;}
	|	'double' {$p = PrimitiveType.DOUBLE;}
	;

referenceType returns [ReferenceType t]
	:	c = classOrInterfaceType {$t = $c;}
	|	v = typeVariable {$t = $v;}
	|	a = arrayType {$t = $a;}
	;

// TODO
classOrInterfaceType returns [ClassInterfaceType t]
	:	(	cno = classType_lfno_classOrInterfaceType
		|	ino = interfaceType_lfno_classOrInterfaceType
		)
		(	c = classType_lf_classOrInterfaceType
		|	i = interfaceType_lf_classOrInterfaceType
		)*
	;

classType returns [ClassInterfaceType t]
    locals [List<Annotation> anns = new ArrayList<>();]
	:	(a = annotation {$anns.add($a);})*
        id = Identifier
        targs = typeArguments?
        {$t = new ClassInterfaceType($id.getText(), $anns, $targs);}
	|	st = classOrInterfaceType '.'
        (a = annotation {$anns.add($a);})*
        id Identifier
        targs = typeArguments?
        {$t = new ClassInterfaceType($id.getText(), $anns, $targs, $st);}
	;

classType_lf_classOrInterfaceType returns [ClassInterfaceType t]
    locals [List<Annotation> ans = new ArrayList<>();]
	:	'.' (a = annotation {$ans.add($a);})*
        id = Identifier targs = typeArguments?
        {$t = new ClassInterfaceType($id.getText(), $ans, $targs);}
	;

classType_lfno_classOrInterfaceType returns [ClassInterfaceType t]
    locals [List<Annotation> ans = new ArrayList<>();]
	:	(a = annotation {$ans.add($a);})*
        id = Identifier targs = typeArguments?
        {$t = new ClassInterfaceType($id.getText(), $ans, $targs);}
	;

interfaceType returns [ClassInterfaceType t]
	:	c = classType {$t = $c;}
	;

interfaceType_lf_classOrInterfaceType returns [ClassInterfaceType t]
	:	c = classType_lf_classOrInterfaceType {$t = $c;}
	;

interfaceType_lfno_classOrInterfaceType returns [ClassInterfaceType t]
	:	c = classType_lfno_classOrInterfaceType {$t = $c;}
	;

typeVariable returns [TypeVariable t]
    locals [List<Annotation> ans = new ArrayList<>();]
	:	(a = annotation {$ans.add($a);})* id = Identifier
        {$t = new TypeVariable($id.getText(), $ans);}
	;

arrayType returns [ArrayType t]
	:	p = primitiveType d = dims
        {$t = new ArrayType($p, $d);}
	|	c = classOrInterfaceType d = dims
        {$t = new ArrayType($c, $d);}
	|	v = typeVariable d = dims
        {$t = new ArrayType($v, $d);}
	;

dims returns [int n]
	:	annotation* '[' ']' {$n = 1;}
        (annotation* '[' ']' {++$n;})*
	;

typeParameter returns [TypeParameter p]
    locals [List<Modifier> mods = new ArrayList<>();]
	:	(m = typeParameterModifier {$mods.add($m);})*
        id = Identifier b = typeBound?
        {$p = new TypeParameter($id.getText(), $mods, $b);}
	;

typeParameterModifier returns [Modifier m]
	:	a = annotation {$m = $a;}
	;

typeBound returns [List<ReferenceType> l]
    locals [List<ReferenceType> ls = new ArrayList<>();]
	:	'extends' v = typeVariable {$ls.add($v); $l = $ls;}
	|	'extends' c = classOrInterfaceType {$ls.add($c)}
        (a = additionalBound {$ls.add($a);})*
        {$l = $ls;}
	;

additionalBound returns [ClassInterfaceType t]
	:	'&' i = interfaceType {$t = $i;}
	;

typeArguments returns [List<TypeArgument> l]
	:	'<' ls = typeArgumentList '>' {$l = $ls;}
	;

typeArgumentList returns [List<TypeArgument> l]
   locals [List<TypeArgument> ls = new ArrayList<>();]
	:	a1 = typeArgument {$ls.add($a1);}
        (',' a = typeArgument {$ls.add($a);})*
        {$l = $ls;}
	;

typeArgument returns [TypeArgument t]
	:	r = referenceType {$t = $r;}
	|	w = wildcard {$t = $w;}
	;

wildcard returns [TypeArgument t]
    locals [List<Annotation> ans = new ArrayList<>();]
	:	(a = annotation {$ans.add($a);})* '?'
        {$t = new TypeArgument($ans);}
        (wildcardBounds[t])?
	;

// TODO true vs. false correct?
wildcardBounds [TypeArgument t]
	:	'extends' r = referenceType
        {$t.setBoundType($r); $t.setIsUpperBounded(true);}
	|	'super' r = referenceType
        {$t.setBoundType($r); $t.setIsUpperBounded(false);}
	;

/*
 * Productions from §6 (Names)
 */

packageName returns [String name]
	:	id = Identifier { $name = $id.getText(); }
	|	p = packageName '.' id = Identifier { $name = p + "." + $id.getText(); }
	;

typeName returns [String name]
	:	id = Identifier { $name = $id.getText(); }
	|	p = packageOrTypeName '.' id = Identifier
        { $name = p + "." + $id.getText(); }
	;

packageOrTypeName returns [String name]
	:	id = Identifier { $name = $id.getText(); }
	|	p = packageOrTypeName '.' id = Identifier
        { $name = p + "." + $id.getText(); }
	;

expressionName returns [String name]
	:	id = Identifier { $name = $id.getText(); }
	|	a = ambiguousName '.' id = Identifier
        { $name = a + "." + $id.getText(); }
	;

methodName returns [String name]
	:	id = Identifier { $name = $id.getText(); }
	;

ambiguousName returns [String name]
	:	id = Identifier { $name = $id.getText(); }
	|	a = ambiguousName '.' id = Identifier
        { $name = a + "." + $id.getText(); }
	;

/*
 * Productions from §7 (Packages)
 */

compilationUnit returns [CompilationUnit u]
    locals [List<ImportStatement> imports = new ArrayList<>(),
            List<ReferenceType> types = new ArrayList<>()]
	:	p = packageDeclaration?
        (i = importDeclaration {$imports.add($i);})*
        (t = typeDeclaration {$types.add($t);})*
        EOF
        {$u = new CompilationUnit($p, $imports, $types);}
	;

packageDeclaration returns [PackageStatement p]
    locals [ List<Annotation> anns = new ArrayList<>(),
             List<String> ids = new ArrayList<>()]
	:	(a = packageModifier { $anns.add($a); })* 'package'
        (id = Identifier {$ids.add($id.getText());})
        ('.' id = Identifier {$ids.add($id.getText());})* ';'
        { $p = new PackageStatement($ids, $mods)}
	;

packageModifier returns [AnnotationStatement a]
	:	an = annotation {$a = $an;}
	;

importDeclaration returns [ImportStatement i]
	:   s = singleTypeImportDeclaration {$i = $s;}
	|	t = typeImportOnDemandDeclaration {$i = $t;}
	|	ss = singleStaticImportDeclaration {$i = $ss;}
	|	si = staticImportOnDemandDeclaration {$i = $si;}
	;

singleTypeImportDeclaration returns [ImportStatement imp]
	:	'import' t = typeName ';'
        { $imp = new ImportStatement($t, false, false); }
	;

typeImportOnDemandDeclaration returns [ImportStatement imp]
	:	'import' p = packageOrTypeName '.' '*' ';'
        {$imp = new ImportStatement($p, false, true);}
	;

singleStaticImportDeclaration returns [ImportStatement imp]
	:	'import' 'static' t = typeName '.' id = Identifier ';'
        {$imp = new ImportStatement($t + '.' + $id.getText(), true, false);}
	;

staticImportOnDemandDeclaration returns [ImportStatement imp]
	:	'import' 'static' t = typeName '.' '*' ';'
        {$imp = new ImportStatement($t, true, true);}
	;

typeDeclaration returns [BodyDeclaraction d]
	:	c = classDeclaration {$d = $c;}
	|	i = interfaceDeclaration {$d = $i;}
	|	';'
	;

/*
 * Productions from §8 (Classes)
 */

classDeclaration returns [ClassDeclaration d]
	:	n = normalClassDeclaration {$d = $n;}
	|	e = enumDeclaration {$d = $e;}
	;

normalClassDeclaration returns [ClassDeclaration d]
    locals [List<Modifier> mods = new ArrayList<>();]
	:	(m = classModifier {$mods.add($m);})* 'class' n = Identifier
        (p = typeParameters)?
        (sc = superclass)?
        (si = superinterfaces)?
        {$d = new ClassDeclaration($n.getText(), $mods, $si, $p, $sc);}
        classBody[d]
	;

classModifier returns [Modifier m]
	:	a = annotation {$m = $a;}
	|	'public' {$m = Modifier.PUBLIC;}
	|	'protected' {$m = Modifier.PROTECTED;}
	|	'private' {$m = Modifier.PRIVATE;}
	|	'abstract' {$m = Modifier.ABSTRACT;}
	|	'static' {$m = Modifier.STATIC;}
	|	'final' {$m = Modifier.FINAL;}
	|	'strictfp' {$m = Modifier.STRICT_FP;}
	;

typeParameters returns [List<TypeParameter> l]
	:	'<' t = typeParameterList '>' {$l = $t;}
	;

typeParameterList returns [List<TypeParameter> l]
    locals [List<TypeParameter> ls = new ArrayList<>();]
	:	(t1 = typeParameter {$ls.add($t1);})
        (',' t = typeParameter {$ls.add($t);})*
        {$l = $ls;}
	;

superclass returns [ClassInterfaceType t]
	:	'extends' c = classType {$t = $c;}
	;

superinterfaces returns [List<ClassInterfaceType> l]
	:	'implements' i = interfaceTypeList {$l = $i;}
	;

interfaceTypeList returns [List<ClassInterfaceType> l]
    locals [List<ClassInterfaceType> ls = new ArrayList<>();]
	:	(i1 = interfaceType {$ls.add($i1);})
        (',' i = interfaceType {$ls.add($i);})*
        {$l = $ls;}
	;

classBody [ConcreteBodyDeclaration d]
	:	'{' (classBodyDeclaration[d])* '}'
	;

classBodyDeclaration [ConcreteBodyDeclaration d]
	:	classMemberDeclaration[d]
	|	i = instanceInitializer {$d.addInstanceInitializer($i);}
	|	s = staticInitializer {$d.addStaticInitializer($s);}
	|	ct = constructorDeclaration {$d.addMethod($ct);}
	;

classMemberDeclaration [ConcreteBodyDeclaration d]
	:	f = fieldDeclaration {$d.addField($f);}
	|	m = methodDeclaration {$d.addMethod($d);}
	|	c = classDeclaration {$d.addInnerClass($c);}
	|	i = interfaceDeclaration {$d.addInnerInterface($i);}
	|	';'
	;

fieldDeclaration returns [VariableDeclaration d]
    locals [List<Modifier> mods = new ArrayList<>();]
	:	(m = fieldModifier {$mods.add($m);})*
        t = unannType
        l = variableDeclaratorList ';'
        {$d = new VariableDeclaration($l, $t, $mods);}
	;

fieldModifier returns [Modifier m]
	:	a = annotation {$m = $a;}
	|	'public' {$m = Modifier.PUBLIC;}
	|	'protected' {$m = Modifier.PROTECTED;}
	|	'private' {$m = Modifier.PRIVATE;}
	|	'static' {$m = Modifier.STATIC;}
	|	'final' {$m = Modifier.FINAL;}
	|	'transient' {$m = Modifier.TRANSIENT;}
	|	'volatile' {$m = Modifier.VOLATILE;}
	;

variableDeclaratorList returns [List<Pair<String, Expression>> l]
    locals [List<Pair<String, Expression>> ls = new ArrayList<>();]
	:	(d1 = variableDeclarator {$ls.add($d1);})
        (',' d = variableDeclarator {$ls.add($d);})*
        {$l = $ls;}
	;

variableDeclarator returns [Pair<String, Expression> p]
	:	id = variableDeclaratorId ('=' in = variableInitializer)?
        {$p = new Pair($id.text, $in);} // TODO add dims
	;

variableDeclaratorId returns [Pair<String, Integer> p]
	:	id = Identifier d = dims? {$p = new Pair($id.getText(), $d);}
	;

variableInitializer returns [Expression e]
	:	ex = expression {$e = $ex;}
	|	a = arrayInitializer {$e = $a;}
	;

unannType returns [Type t]
	:	p = unannPrimitiveType {$t = $p;}
	|	r = unannReferenceType {$t = $r;}
	;

unannPrimitiveType returns [PrimitiveType t]
	:	n = numericType {$t = $n;}
	|	'boolean' {$t = PrimitiveType.BOOLEAN;}
	;

unannReferenceType returns [ReferenceType t]
	:	c = unannClassOrInterfaceType {$t = $c;}
	|	v = unannTypeVariable {$t = $v;}
	|	a = unannArrayType {$t = $a;}
	;

unannClassOrInterfaceType returns [ReferenceType t]
	:	(	cno = unannClassType_lfno_unannClassOrInterfaceType
		|	ino = unannInterfaceType_lfno_unannClassOrInterfaceType
		)
		(	c = unannClassType_lf_unannClassOrInterfaceType
		|	i = unannInterfaceType_lf_unannClassOrInterfaceType
		)*
	;

unannClassType returns [ClassInterfaceType t]
    locals [List<Annotation> ans = new ArrayList<>();]
	:	id = Identifier ta = typeArguments?
        {$t = new ClassInterfaceType($id.getText(), $ta);}
	|	ci = unannClassOrInterfaceType '.' (a = annotation {$ans.add($a);})*
        id2 = Identifier ta2 = typeArguments?
        {$t = new ClassInterfaceType($id2.getText(), $ans, $ta, $ci);}
	;

unannClassType_lf_unannClassOrInterfaceType returns [ClassInterfaceType t]
    locals [List<Annotation> ans = new ArrayList<>();]
	:	'.' (a = annotation {$ans.add($a);})*
        id = Identifier ta = typeArguments?
        {$t = new ClassInterfaceType($id.getText(), $ans, $ta);}
	;

unannClassType_lfno_unannClassOrInterfaceType returns [ClassInterfaceType t]
	:	id = Identifier ta = typeArguments?
        {$t = new ClassInterfaceType($id.getText(), $ta);}
	;

unannInterfaceType returns [ClassInterfaceType t]
	:	c = unannClassType {$t = $c;}
	;

unannInterfaceType_lf_unannClassOrInterfaceType returns [ClassInterfaceType t]
	:	ci = unannClassType_lf_unannClassOrInterfaceType {$t = $ci;}
	;

unannInterfaceType_lfno_unannClassOrInterfaceType returns [ClassInterfaceType t]
	:	ci = unannClassType_lfno_unannClassOrInterfaceType {$t = $ci;}
	;

unannTypeVariable returns [TypeVariable t]
	:	i = Identifier {$t = new TypeVariable($i.getText());}
	;

unannArrayType returns [ArrayType t]
	:	p = unannPrimitiveType d = dims {$t = new ArrayType($p, $d);}
	|	c = unannClassOrInterfaceType d = dims {$t = new ArrayType($c, $d);}
	|	v = unannTypeVariable d = dims {$t = new ArrayType($c, $d);}
	;

methodDeclaration returns [MethodDeclaration d]
    locals [List<Modifier> mods = new ArrayList<>(),
            MethodDeclaration md]
	:	(m = methodModifier {$mods.add($m);})*
        {$md = new MethodDeclaration($mods);}
        h = methodHeader[d]
        b = methodBody {$md.setBody($b);}
        {$d = $md;}
	;

methodModifier returns [Modifier m]
	:	a = annotation {$m = $a;}
	|	'public' {$m = $Modifier.PUBLIC;}
	|	'protected' {$m = $Modifier.PROTECTED;}
	|	'private' {$m = Modifier.PRIVATE;}
	|	'abstract' {$m = Modifier.ABSTRACT;}
	|	'static' {$m = Modifier.STATIC;}
	|	'final' {$m = Modifier.FINAL;}
	|	'synchronized' {$m = Modifier.SYNCHRONIZED;}
	|	'native' {$m = Modifier.NATIVE;}
	|	'strictfp' {$m = Modifier.STRICT_FP;}
	;

methodHeader [MethodDeclaration m]
    locals [List<Annotation> ans = new ArrayList<>();]
	:	rt = result methodDeclarator[m] th = throws_?
        {
            $m.setReturnType($rt);
            $m.setExceptions($th);
        }
	|	tp = typeParameters (a = annotation {$ans.add($a);})*
        rt = result methodDeclarator[m] th = throws_?
        {
            $m.setTypeParameters($tp);
            $m.setAnnotations($ans)
            $m.setReturnType($rt);
            $m.setExceptions($th);
        }
	;

result returns [Type t]
	:	u = unannType {$t = $u;}
	|	'void' {$t = null;}
	;

methodDeclarator [MethodDeclaration m]
	:	n = Identifier
        '(' p = formalParameterList? ')'
        d = dims?
        {
            $m.setName($n);
            $m.setParameters($p);
            if ($d > 0) {
                $m.setReturnType($m.getReturnType().augment($d));
            }
        }

	;

formalParameterList returns [List<VariableDeclaration> l]
    locals [List<VariableDeclaration> ls = new ArrayList<>();]
	:	(p = formalParameters {$ls.addAll($p);}) ','
        (p2 = lastFormalParameter {$ls.add($p2);})
        {$l = $ls;}
	|   (f = lastFormalParameter {$ls.add($f);})
        {$l = $ls;}
	;

formalParameters returns [List<VariableDeclaration> l]
    locals [List<VariableDeclaration> ls = new ArrayList<>();]
	:	(p = formalParameter {$ls.add($p);})
        (',' f = formalParameter {$ls.add($f);})* {$l = $ls;}
	|	(r = receiverParameter {$ls.add($r);})
        (',' f = formalParameter {$ls.add($f);})* {$l = $ls;}
	;

formalParameter returns [VariableDeclaration v]
    locals [List<Modifier> mods = new ArrayList<>();]
	:	(m = variableModifier {$mods.add($m);})*
        t = unannType n = variableDeclaratorId
        {$v = new VariableDeclaration($n, $t, $mods);}
	;

variableModifier returns [Modifier m]
	:	a = annotation {$m = $a;}
	|	'final' {$m = Modifier.FINAL;}
	;

lastFormalParameter returns [VariableDeclaration v]
    locals [List<Modifier> mods = new ArrayList<>();]
	:	(m = variableModifier {$mods.add($m);})*
        t = unannType
        (a = annotation {$mods.add($a);})*
        '...'
        n = variableDeclaratorId
        {$v = new VariableDeclaration($n, $t, $mods, true);}
	|	f = formalParameter {$v = $f;}
	;

receiverParameter returns [VariableDeclaration v]
    locals [List<Modifier> mods = new ArrayList<>();]
	:	(m = annotation {$mods.add($m);})*
        t = unannType
        (i = Identifier '.')?
        'this'
        {
            $v = new VariableDeclaration(
                $i.text.equals("") ? "this" : $i.getText() + "." + "this",
                $t,
                $mods)
        }
	;

throws_ returns [List<Type> l]
	:	'throws' e = exceptionTypeList {$l = $e;}
	;

exceptionTypeList returns [List<Type> l]
    locals [List<Type> ls = new ArrayList<>();]
	:	(e = exceptionType {$ls.add($e);})
        (',' e = exceptionType {$ls.add($e);})*
        {$l = $ls;}
	;

exceptionType returns [ReferenceType t]
	:	c = classType {$t = $c;}
	|	v = typeVariable {$t = $v;}
	;

methodBody returns [Block b]
	:	body = block {$b = $body;}
	|	';'
	;

instanceInitializer returns [Block b]
	:	body = block {$b = $body;}
	;

staticInitializer returns [Block b]
	:	'static' body = block {$b = $body;}
	;

// TODO separate
constructorDeclaration returns [MethodDeclaration d]
    locals [List<Modifier> mods = new ArrayList<>();]
	:	(m = constructorModifier {$mods.add($m);})*
        {$d = new MethodDeclaration($mods);}
        constructorDeclarator[d]
        t = throws_?
        b = constructorBody
        {
            $d.setExceptions($t);
            $d.setBody($b);
        }
	;

constructorModifier returns [Modifier m]
	:	a = annotation {$m = $a;}
	|	'public' {$m = Modifier.PUBLIC;}
	|	'protected' {$m = Modifier.PROTECTED;}
	|	'private' {$m = Modifier.PRIVATE;}
	;

// TODO
constructorDeclarator [MethodDeclaration d]
	:	t = typeParameters? n = simpleTypeName '(' l = formalParameterList? ')'
        {
            $d.addTypeParams($t);
            $d.setName($n);
            $d.setParameters($l);
        }
	;

simpleTypeName returns [String s]
	:	id = Identifier {$s = $id.getText();}
	;

constructorBody returns [Block b]
	:	'{' s = explicitConstructorInvocation? st = blockStatements? '}'
        {$b = new Block(st);
         $b.addStatement(0, $s);}
	;

// TODO
explicitConstructorInvocation returns [Statement s]
	:	typeArguments? 'this' '(' argumentList? ')' ';'
	|	typeArguments? 'super' '(' argumentList? ')' ';'
	|	expressionName '.' typeArguments? 'super' '(' argumentList? ')' ';'
	|	primary '.' typeArguments? 'super' '(' argumentList? ')' ';'
	;

enumDeclaration returns [EnumDeclaration d]
    locals [List<Modifier> mods = new ArrayList<>();]
	:	(m = classModifier {$mods.add($m);})*
        'enum' id = Identifier il = superinterfaces?
        {$d = new EnumDeclaration($id.getText(), $il, $mods);}
        enumBody[d]
	;

enumBody [EnumDeclaration d]
	:	'{' (enumConstantList[d])? ','? (enumBodyDeclarations[d])? '}'
	;

enumConstantList [EnumDeclaration d]
	:	enumConstant[d] (',' enumConstant[d])*
	;

enumConstant [EnumDeclaration d]
    locals [List<Modifier> mods = new ArrayList<>();]
	:	(enumConstantModifier {$mods.add($m);})*
        id = Identifier ('(' a = argumentList? ')')?
        {$d.addConstant(new EnumConstant($id.getText(), $mods, $a));}
        (classBody[d])?
	;

enumConstantModifier returns [Modifier m]
	:	a = annotation {$m = $a;}
	;

enumBodyDeclarations [EnumDeclaration d]
	:	';' (classBodyDeclaration[d])*
	;

/*
 * Productions from §9 (Interfaces)
 */

interfaceDeclaration returns [InterfaceDeclaration d]
	:	n = normalInterfaceDeclaration {$d = $n;}
	|	a = annotationTypeDeclaration {$d = $a;}
	;

normalInterfaceDeclaration returns [InterfaceDeclaration d]
    locals [List<Modifier> mods = new ArrayList<>();]
	:	(m = interfaceModifier {$mods.add($m);})*
        'interface' id = Identifier
        t = typeParameters? e = extendsInterfaces?
        {$d = new InterfaceDeclaration($id.getText(), $mods, $e, $t);}
        interfaceBody[d]
	;

interfaceModifier returns [Modifier m]
	:	a = annotation {$m = $a;}
	|	'public' {$m = Modifier.PUBLIC;}
	|	'protected' {$m = Modifier.PROTECTED;}
	|	'private' {$m = Modifier.PRIVATE;}
	|	'abstract' {$m = Modifier.ABSTRACT;}
	|	'static' {$m = Modifier.STATIC;}
	|	'strictfp' {$m = Modifier.STRICT_FP;}
	;

extendsInterfaces returns [List<ClassInterfaceType> l]
	:	'extends' i = interfaceTypeList {$l = $i;}
	;

interfaceBody [InterfaceDeclaration d]
	:	'{' (interfaceMemberDeclaration[d])* '}'
	;

interfaceMemberDeclaration [InterfaceDeclaration d]
	:	c = constantDeclaration {$d.addField($c);}
	|	im = interfaceMethodDeclaration {$d.addMethod($im);}
	|	cl = classDeclaration {$d.addInnerClass($cl);}
	|	id = interfaceDeclaration {$d.addInnerInterface($id);}
	|	';'
	;

constantDeclaration returns [VariableDeclaration v]
    locals [List<Modifier> mods = new ArrayList<>();]
	:	(m =constantModifier {$mods.add($m);})*
        t = unannType
        l = variableDeclaratorList ';'
        {$v = new VariableDeclaration($l, $t, $mods);}
	;

constantModifier returns [Modifier m]
	:	a = annotation {$m = $a;}
	|	'public' {$m = Modifier.PUBLIC;}
	|	'static' {$m = Modifier.STATIC;}
	|	'final' {$m = Modifier.FINAL;}
	;

interfaceMethodDeclaration returns [MethodDeclaration d]
    locals [List<Modifier> mods = new ArrayList<>();]
	:	(m = interfaceMethodModifier {$mods.add($m);})*
        {$d = new MethodDeclaration($mods);}
        (methodHeader[d])
        (b = methodBody {$d.setBody($b);})
	;

interfaceMethodModifier returns [Modifier m]
	:	a = annotation {$m = $a;}
	|	'public' {$m = Modifier.PUBLIC;}
	|	'abstract' {$m = Modifier.ABSTRACT;}
	|	'default' {$m = Modifier.DEFAULT;}
	|	'static' {$m = Modifier.STATIC;}
	|	'strictfp' {$m = Modifier.STRICT_FP;}
	;

// TODO
annotationTypeDeclaration
    locals [List<Modifier> mods = new ArrayList<>();]
    :	(m = interfaceModifier {$mods.add($m);})*
		'@' 'interface' id = Identifier b = annotationTypeBody
	;

// TODO
annotationTypeBody
	:	'{' annotationTypeMemberDeclaration* '}'
	;

// TODO
annotationTypeMemberDeclaration
	:	annotationTypeElementDeclaration
	|	constantDeclaration
	|	classDeclaration
	|	interfaceDeclaration
	|	';'
	;

// TODO
annotationTypeElementDeclaration
    locals [List<Modifier> mods = new ArrayList<>();]
	:	(m = annotationTypeElementModifier {$mods.add($m);})*
        t = unannType id = Identifier '(' ')'
        ds = dims?
        dv = defaultValue? ';'
	;

// TODO
annotationTypeElementModifier returns [Modifier m]
	:	a = annotation {$m = $a;}
	|	'public' {$m = Modifier.PUBLIC;}
	|	'abstract' {$m = Modifier.ABSTRACT;}
	;

defaultValue returns [Expression e]
	:	'default' v = elementValue {$e = $v;}
	;

// TODO
annotation returns [AnnotationStatement s]
	:	n = normalAnnotation {$s = $n;}
	|	m = markerAnnotation {$s = $m;}
	|	e = singleElementAnnotation {$s = $e;}
	;

// TODO
normalAnnotation returns [AnnotationStatement s]
	:	'@' t = typeName '(' l = elementValuePairList? ')'
        {$s = new AnnotationStatement($t, $l);}
	;

elementValuePairList returns [List<Pair<String, Expression>> l]
    locals [List<Pair<String, Expression>> pairs = new ArrayList<>();]
	:	(p1 = elementValuePair) {$pairs.add($p1);}
        (',' p = elementValuePair {$pairs.add($p);})*
        {$l = $pairs;}
	;

elementValuePair returns [Pair<String,Expression> p]
	:	id = Identifier '=' v = elementValue
        {$p = new Pair($id.getText(), $v);}
	;

elementValue returns [Expression e]
	:	c = conditionalExpression {$e = $c;}
	|	i = elementValueArrayInitializer {$e = $i;}
	|	a = annotation {$e = $a;}
	;

// TODO
elementValueArrayInitializer returns [ArrayDeclaration d]
	:	'{' l = elementValueList? ','? '}'
        {$d = new ArrayDeclaration($l);}
	;

elementValueList returns [List<Expression> l]
    locals [List<Expression> ls = new ArrayList<>();]
	:	(v1 = elementValue {$ls.add($v1);})
        (',' v = elementValue {$ls.add($v);})*
        {$l = $ls;}
	;

// TODO
markerAnnotation returns [AnnotationStatement s]
	:	'@' t = typeName {$s = new AnnotationStatement($t);}
	;

// TODO
singleElementAnnotation returns [AnnotationStatement s]
	:	'@' t = typeName '(' v = elementValue ')'
        {$s = new AnnotationStatement($t, $v);}
	;

/*
 * Productions from §10 (Arrays)
 */

// TODO
arrayInitializer returns [ArrayDeclaration d]
	:	'{' l = variableInitializerList? ','? '}'
        {$d = new ArrayDeclaration($l);}
	;

variableInitializerList returns [List<Expression> l]
    locals [List<Expression> ls = new ArrayList<>();]
	:	(i = variableInitializer {$ls.add($i);})
        (',' v = variableInitializer {$ls.add($v);})*
        {$l = $ls;}
	;

/*
 * Productions from §14 (Blocks and Statements)
 */

block returns [Block b]
	:	'{' s = blockStatements? '}' {$b = new  Block($s);}
	;

blockStatements returns [List<Statement> l]
    locals [List<Statement> ls = new ArrayList<>();]
	:	(s = blockStatement {$ls.add($s);})
        (b = blockStatement {$ls.add($b);})*
        {$l = $ls;}
	;

blockStatement returns [Statement s]
	:	d = localVariableDeclarationStatement {$s = $d;}
	|	c = classDeclaration {$s = $c;}
	|	st = statement {$s = $st;}
	;

localVariableDeclarationStatement returns [VariableDeclaration v]
	:	d = localVariableDeclaration ';' {$v = $d;}
	;

localVariableDeclaration returns [VariableDeclaration v]
    locals [List<Modifier> mods = new ArrayList<>();)]
	:	(m = variableModifier {$mods.add($m);})*
        t = unannType
        vl = variableDeclaratorList
        {$v = new VariableDeclaration();}
	;

statement returns [Statement s]
	:	a = statementWithoutTrailingSubstatement {$s = $a;}
	|	b = labeledStatement {$s = $b;}
	|	c = ifThenStatement {$s = $c;}
	|	d = ifThenElseStatement {$s = $d;}
	|	e = whileStatement {$s = $e;}
	|	f = forStatement {$s = $f;}
	;

statementNoShortIf returns [Statement s]
	:	a = statementWithoutTrailingSubstatement {$s = $a;}
	|	b = labeledStatementNoShortIf {$s = $b;}
	|	c = ifThenElseStatementNoShortIf {$s = $c;}
	|	d = whileStatementNoShortIf {$s = $d;}
	|	e = forStatementNoShortIf {$s = $e;}
	;

statementWithoutTrailingSubstatement returns [Statement s]
	:	a = block {$s = $a;}
	|	b = emptyStatement {$s = $b;}
	|	c = expressionStatement {$s = $c;}
	|	d = assertStatement {$s = $d;}
	|	e = switchStatement {$s = $e;}
	|	f = doStatement {$s = $f;}
	|	g = breakStatement {$s = $g;}
	|	h = continueStatement {$s = $h;}
	|	i = returnStatement {$s = $i;}
	|	j = synchronizedStatement {$s = $j;}
	|	k = throwStatement {$s = $k;}
	|	l = tryStatement {$s = $l;}
	;

emptyStatement returns [Statement s]
	:	';' {$s = new Statement();}
	;

labeledStatement returns [LabelStatement ls]
	:	id = Identifier ':' s = statement
        {$ls = new LabelStatement($id.getText(), $s);}
	;

labeledStatementNoShortIf returns [LabelStatement ls]
	:	id = Identifier ':' s = statementNoShortIf
        {$ls = new LabelStatement($id.getText(), $s);}
	;

expressionStatement returns [Expression e]
	:	s = statementExpression ';' {$e = $s;}
	;

statementExpression returns [Expression e]
	:	a = assignment {$e = $a;}
	|	b = preIncrementExpression {$e = $b;}
	|	c = preDecrementExpression {$e = $c;}
	|	d = postIncrementExpression {$e = $d;}
	|	f = postDecrementExpression {$e = $f;}
	|	g = methodInvocation {$e = $g;}
	|	h = classInstanceCreationExpression {$e = $h;}
	;

ifThenStatement returns [IfElseStatement st]
	:	'if' '(' e = expression ')' s = statement
        {$st = new IfElseStatement($e, $s);}
	;

ifThenElseStatement returns [IfElseStatement st]
	:	'if' '(' e = expression ')' t = statementNoShortIf 'else' el = statement
        {$st = new IfElseStatement($e, $t, $el);}
	;

ifThenElseStatementNoShortIf returns [IfElseStatement st]
	:	'if' '(' e = expression ')' t = statementNoShortIf
        'else' el = statementNoShortIf
        {$st = new IfElseStatement($e, $t, $el);}
	;

assertStatement returns [AssertStatement st]
	:	'assert' e = expression ';' {$st = new AssertStatement($e);}
	|	'assert' e = expression ':' msg = expression ';'
        {$st = new AssertStatement($e, $msg);}
	;

switchStatement returns [SwitchStatement st]
	:	'switch' '(' e = expression ')' b = switchBlock
        {$st = new SwitchStatement($e, $b);}
	;

switchBlock returns [List<CaseBlock> ls]
    locals [List<CaseBlock> blocks = new ArrayList<>();]
	:	'{' (m = switchBlockStatementGroup {$blocks.add($m);})*
            (l = switchLabel {$blocks.add($l);})* '}'
        {$ls = $blocks;}
	;

switchBlockStatementGroup returns [CaseBlock b]
	:	l = switchLabels s = blockStatements {$b = new CaseBlock($l, $s);}
	;

switchLabels returns [List<Expression> ls]
    locals [List<Expression> lbls = new ArrayList<>();]
	:	(s = switchLabel {$lbls.add($s);})
        (l = switchLabel {$lbls.add($l);})*
        {$ls = $lbls;}
	;

switchLabel returns [Expression e]
	:	'case' c = constantExpression ':' {$e = $c;}
	|	'case' en = enumConstantName ':' {$e = $en;}
	|	'default' ':' {$e = DEFAULT;}
	;

enumConstantName returns [String s]
	:	id = Identifier {$s = $id.getText();}
	;

whileStatement returns [WhileStatement st]
	:	'while' '(' c = expression ')' s = statement
        {$st = new WhileStatement($c, $s);}
	;

whileStatementNoShortIf returns [WhileStatement st]
	:	'while' '(' c = expression ')' s = statementNoShortIf
        {$st = new WhileStatement($c, $s);}
	;

doStatement returns [WhileStatement st]
	:	'do' s = statement 'while' '(' c = expression ')' ';'
        {$st = new WhileStatement($c, $s);}
	;

forStatement returns [Statement st]
	:	b = basicForStatement {$st = $b;}
	|	e = enhancedForStatement {$st = $e;}
	;

forStatementNoShortIf returns [Statement st]
	:	b = basicForStatementNoShortIf {$st = $b;}
	|	e = enhancedForStatementNoShortIf {$st = $e;}
	;

basicForStatement returns [ForStatement st]
	:	'for' '(' i = forInit? ';' e = expression? ';' u = forUpdate? ')'
        s = statement
        {$st = new ForStatement($i, $e, $u, $s);}
	;

basicForStatementNoShortIf returns [ForStatement st]
	:	'for' '(' i = forInit? ';' e = expression? ';' u = forUpdate? ')'
        s = statementNoShortIf
        {$st = new ForStatement($i, $e, $u, $s);}
	;

forInit returns [List<Expression> l]
	:	ls = statementExpressionList {$l = $ls;}
	|	d = localVariableDeclaration
        {$l = new ArrayList<Expression>();
         $l.add($d);}
	;

forUpdate returns [List<Expression> l]
	:	ls = statementExpressionList {$l = $ls;}
	;

statementExpressionList returns [List<Expression> ls]
    locals [List<Expression> ups = new ArrayList<>();]
	:	(s = statementExpression {$ups.add($s);})
        (',' e = statementExpression {$ups.add($e);})*
        { $ls = $ups;}
	;

enhancedForStatement returns [ForEachStatement st]
    locals [List<Modifier> mods = new ArrayList<>(),
            VariableDeclaration v;]
	:	'for' '(' (m = variableModifier {$mods.add($m)})*
                   t = unannType
                   n = variableDeclaratorId ':'
                   e = expression ')'
                   s = statement
        {$v = new VariableDeclaration($n, $t, $mods);
         $st = new ForEachStatement($v, $e, $s);}
	;

enhancedForStatementNoShortIf returns [ForEachStatement st]
    locals [List<Modifier> mods = new ArrayList<>(),
            VariableDeclaration v;]
	:	'for' '(' (m = variableModifier {$mods.add($m);})*
                   t = unannType
                   n = variableDeclaratorId ':'
                   e = expression ')'
                   s = statementNoShortIf
        {$v = new VariableDeclaration($n, $t, $mods);
         $st = new ForEachStatement($v, $e, $s);}
	;

breakStatement returns [JumpStatement st]
	:	'break' id = Identifier? ';'
        {$st = new JumpStatement(true, $id.getText());}
	;

continueStatement returns [JumpStatement st]
	:	'continue' id = Identifier? ';'
        {$st = new JumpStatement(false, $id.getText());}
	;

returnStatement returns [ReturnStatement st]
	:	'return' e = expression? ';' {$st = new ReturnStatement($e);}
	;

throwStatement returns [ThrowStatement st]
	:	'throw' e = expression ';' {$st = new ThrowStatement($e);}
	;

synchronizedStatement returns [SynchronizedStatement st]
	:	'synchronized' '(' e = expression ')' b = block
        {$st = new SynchronizedStatement($e, $b);}
	;

tryStatement returns [TryCatchStatement st]
	:	'try' t = block cs = catches {$st = new TryCatchStatement($t, $cs);}
	|	'try' t = block cs = catches? f = finally_
        {$st = new TryCatchStatement($t, $cs, $f);}
	|	r = tryWithResourcesStatement {$st = $r;}
	;

catches returns [List<CatchBlock> l]
    locals [List<CatchBlock> ls = new ArrayList<>();]
	:	f = catchClause {$ls.add($f);} (c = catchClause {$ls.add($c);})*
        {$l = $ls;}
	;

catchClause returns [CatchBlock b]
	:	'catch' '(' p = catchFormalParameter ')' body = block
        {$b = new CatchBlock($p, $body);}
	;

catchFormalParameter returns [VariableDeclaration d]
    locals [List<Modifier> mods = new ArrayList<>();]
	:	(m = variableModifier {$mods.add($m);})*
        t = catchType
        n = variableDeclaratorId
        {$d = new VariableDeclaration($n, $t, $mods);}
	;

catchType returns [List<ClassInterfaceType> l]
    locals [List<ClassInterfaceType> types = new ArrayList<>();]
	:	(u = unannClassType {$types.add($u);})
        ('|' c = classType {$types.add($c);})*
        {$l = $types;}
	;

finally_ returns [Block b]
	:	'finally' body = block {$b = $body;}
	;

tryWithResourcesStatement returns [TryCatchStatement st]
	:	'try' r = resourceSpecification b = block c = catches? f = finally_?
        {$st = new TryCatchStatement($r, $b, $c, $f);}
	;

resourceSpecification returns [List<Statement> lst]
	:	'(' l = resourceList ';'? ')' {$lst = $l;}
	;

resourceList returns [List<Statement> lst]
    locals [List<VariableDeclartion> vars = new ArrayList<>();]
	:	r = resource {$vars.add($r);}
        (';' re = resource {$vars.add($re);})*
        {$lst = $vars;}
	;

resource returns [VariableDeclaration d]
    locals [List<Modifier> mods = new ArrayList<>();]
	:	(m = variableModifier {$mods.add($m);})*
        t = unannType
        n = variableDeclaratorId '='
        e = expression
    {$d = new VariableDeclaration($n, $t, $mods, $e);}
	;

/*
 * Productions from §15 (Expressions)
 */

primary returns [Expression e]
	:	(	pno = primaryNoNewArray_lfno_primary
		|	a = arrayCreationExpression
		)
		(	p = primaryNoNewArray_lf_primary
		)*
	;

// TODO
primaryNoNewArray returns [Expression e]
	:	a1 = literal {$e = $a1;}
	|	a2 = typeName ('[' ']')* '.' 'class'
	|	'void' '.' 'class'
	|	'this'
	|	a5 = typeName '.' 'this'
	|	'(' p = expression ')' {$e = $p;}
	|	a7 = classInstanceCreationExpression {$e = $a7;}
	|	a8 = fieldAccess {$e = $a8;}
	|	a9 = arrayAccess {$e = $a9;}
	|	a10 = methodInvocation {$e = $a10;}
	|	a11 = methodReference {$e = $a11;}
	;

// TODO
primaryNoNewArray_lf_arrayAccess
	:
	;

// TODO
primaryNoNewArray_lfno_arrayAccess returns [Expression e]
	:	a1 = literal {$e = $a1;}
	|	a2 = typeName ('[' ']')* '.' 'class'
	|	'void' '.' 'class'
	|	'this'
	|	a3 = typeName '.' 'this'
	|	'(' p = expression ')' {$e = $p;}
	|	a5 = classInstanceCreationExpression {$e = $a5;}
	|   a6 = fieldAccess {$e = $a6;}
	|	a7 = methodInvocation {$e = $a7;}
	|	a8 = methodReference {$e = $a8;}
	;

primaryNoNewArray_lf_primary returns [Expression e]
	:	a1 = classInstanceCreationExpression_lf_primary {$e = $a1;}
	|	a2 = fieldAccess_lf_primary {$e = $a2;}
	|	a3 = arrayAccess_lf_primary {$e = $a3;}
	|	a4 = methodInvocation_lf_primary {$e = $a4;}
	|	a5 = methodReference_lf_primary {$e = $a5;}
	;

// TODO
primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary
	:
	;

primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary returns [Expression e]
	:	a1 = classInstanceCreationExpression_lf_primary {$e = $a1;}
	|	a2 = fieldAccess_lf_primary {$e = $a2;}
	|	a3 = methodInvocation_lf_primary {$e = $a3;}
	|	a4 = methodReference_lf_primary {$e = $a4;}
	;

// TODO
primaryNoNewArray_lfno_primary returns [Expression e]
	:	a1 = literal {$e = $a1;}
	|	a2 = typeName ('[' ']')* '.' 'class'
	|	a3 = unannPrimitiveType ('[' ']')* '.' 'class'
	|	'void' '.' 'class'
	|	'this'
	|	a6 = typeName '.' 'this'
	|	'(' p = expression ')' {$e = $p;}
	|	a7 = classInstanceCreationExpression_lfno_primary {$e = $a7;}
	|	a8 = fieldAccess_lfno_primary {$e = $a8;}
	|	a9 = arrayAccess_lfno_primary {$e = $a9;}
	|	a10 = methodInvocation_lfno_primary {$e = $a10;}
	|	a11 = methodReference_lfno_primary {$e = $a11;}
	;

// TODO
primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary
	:
	;

// TODO
primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary returns [Expression e]
	:	a1 = literal {$e = $a1;}
	|	a2 = typeName ('[' ']')* '.' 'class'
	|	a3 = unannPrimitiveType ('[' ']')* '.' 'class'
	|	'void' '.' 'class'
	|	'this'
	|	a6 = typeName '.' 'this'
	|	'(' p = expression ')' {$e = $p;}
	|	a7 = classInstanceCreationExpression_lfno_primary {$e = $a7;}
	|	a8 = fieldAccess_lfno_primary {$e = $a8;}
	|	a9 = methodInvocation_lfno_primary {$e = $a9;}
	|	a10 = methodReference_lfno_primary {$e = $a10;}
	;

// TODO
classInstanceCreationExpression returns [ConstructionExpression e]
	:	'new' t = typeArguments? a = annotation* id = Identifier
        ('.' a2 = annotation* id2 = Identifier)* targs = typeArgumentsOrDiamond?
        '(' l = argumentList? ')' b = classBody?
	|	name = expressionName '.' 'new' t = typeArguments? a = annotation*
        id = Identifier targs = typeArgumentsOrDiamond?
        '(' l = argumentList? ')' b = classBody?
	|	p = primary '.' 'new' t = typeArguments? a = annotation* id = Identifier
        targs = typeArgumentsOrDiamond?
        '(' l = argumentList? ')' b = classBody?
	;

// TODO
classInstanceCreationExpression_lf_primary returns [ConstructionExpression e]
	:	'.' 'new' t = typeArguments? a = annotation* id = Identifier
        targs = typeArgumentsOrDiamond?
        '(' l = argumentList? ')'
        b = classBody?
	;

// TODO
classInstanceCreationExpression_lfno_primary returns [ConstructionExpression e]
	:	'new' t = typeArguments? a = annotation* id = Identifier
        ('.' a2 = annotation* id2 = Identifier)*
        targs = typeArgumentsOrDiamond?
        '(' l = argumentList? ')' b = classBody?
	|	name = expressionName '.' 'new' t = typeArguments? a = annotation*
        id =Identifier
        targs = typeArgumentsOrDiamond?
        '(' l = argumentList? ')' b = classBody?
	;

// TODO
typeArgumentsOrDiamond
	:	typeArguments
	|	'<' '>'
	;

fieldAccess returns [AccessExpression e]
	:	p = primary '.' id = Identifier
        {$e = new AccessExpression($p, $id.getText());}
	|	'super' '.' id = Identifier
        {$e = new AccessExpression(Expression.SuperExpression, $id.getText());}
	|	t = typeName '.' 'super' '.' id = Identifier
	;

fieldAccess_lf_primary returns [AccessExpression e]
	:	'.' id = Identifier {$e = new AccessExpression(null, $id.getText());}
	;

// TODO
fieldAccess_lfno_primary returns [AccessExpression e]
	:	'super' '.' id = Identifier
        {$e = new AccessExpression(Expression.SuperExpression, $id);}
	|	typeName '.' 'super' '.' Identifier
	;

// TODO
arrayAccess returns [ArrayAccessExpression e]
	:	(	(n = expressionName '[' i = expression ']'
                {$e = new ArrayAccessExpression($n, $i);})
		|	(pno = primaryNoNewArray_lfno_arrayAccess '[' i = expression ']'
                {$e = new ArrayAccessExpression($pno, $i);})
		)
            // always empty?
		(	primaryNoNewArray_lf_arrayAccess '[' i = expression ']'
		)*
	;

// TODO
arrayAccess_lf_primary returns [ArrayAccessExpression e]
	:	(	(pno = primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary
           '[' i = expression ']' {$e = new ArrayAccessExpression($p, $i);})
		)
            // always empty?
		(	primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary
            '[' i2 = expression ']'
		)*
	;

// TODO
arrayAccess_lfno_primary returns [ArrayAccessExpression e]
	:	(	(name = expressionName '[' i = expression ']'
                {$e = new ArrayAccessExpression($name, $i);})
		|	(pno = primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary
                '[' i = expression ']'
                {$e = new ArrayAccessExpression($p, $i);})
		)
            // always empty?
		(	primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary
        '[' i2 = expression ']'
		)*
	;

// TODO
methodInvocation returns [CallExpression e]
	:	mn = methodName '(' a = argumentList? ')'
        {$e = new CallExpression($mn, $a);}
	|	tn = typeName '.' t = typeArguments? id = Identifier
        '(' a = argumentList? ')'
        {$e = new CallExpression($id.getText(), $a);}
	|	en = expressionName '.' t = typeArguments? id = Identifier
        '(' a = argumentList? ')'
        {$e = new CallExpression($id.getText(), $a);}
	|	p = primary '.' t = typeArguments?
        id = Identifier '(' a = argumentList? ')'
        {$e = new CallExpression($p, $a);}
	|	'super' '.' t = typeArguments? id = Identifier '(' a = argumentList? ')'
        {$e = new CallExpression($id.getText(), $a);}
	|	tn = typeName '.' 'super' '.' t = typeArguments?
        id = Identifier '(' a = argumentList? ')'
        {$e = new CallExpression($id.getText(), $a);}
	;

// TODO
methodInvocation_lf_primary returns [CallExpression e]
	:	'.' t = typeArguments? id = Identifier '(' a = argumentList? ')'
        {$e = new CallExpression($id.getText(), $a);}
	;

// TODO
methodInvocation_lfno_primary returns [CallExpression e]
	:	mn = methodName '(' a = argumentList? ')'
        {$e = new CallExpression($mn, $a);}
	|	tn = typeName '.' t = typeArguments?
        id = Identifier '(' a = argumentList? ')'
        {$e = new CallExpression($id.getText(), $a);}
	|	en = expressionName '.' t = typeArguments?
        id = Identifier '(' a = argumentList? ')'
        {$e = new CallExpression($id.getText(), $a);}
	|	'super' '.' t = typeArguments? id = Identifier '(' a = argumentList? ')'
        {$e = new CallExpression($id.getText(), $a);}
	|	tn = typeName '.' 'super' '.' t = typeArguments?
        id = Identifier '(' a = argumentList? ')'
        {$e = new CallExpression($id.getText(), $a);}
	;

argumentList returns [List<Expression> l]
    locals [List<Expression> ls = new ArrayList<>();]
	:	(e = expression {$ls.add($e);})
        (',' ex = expression {$ls.add($ex);})* {$l = $ls;}
	;

// TODO
methodReference returns [MethodReferenceExpression e]
	:	en = expressionName '::' t = typeArguments? id = Identifier
        {$e = new MethodReferenceExpression($en, $id.getText());}
	|	r = referenceType '::' t = typeArguments? id = Identifier
        {$e = new MethodReferenceExpression($r, $id.getText());}
	|	p = primary '::' t = typeArguments? id = Identifier
        {$e = new MethodReferenceExpression($p, $id.getText());}
	|	'super' '::' t = typeArguments? id = Identifier
        {$e = new MethodReferenceExpression(Expression.SuperExpression,
                                            $id.getText());}
	|	tn = typeName '.' 'super' '::' t = typeArguments? id = Identifier
        {$e = new MethodReferenceExpression(Expression.SuperExpression,
                                            $id.getText());}
	|	c = classType '::' t = typeArguments? 'new'
        {$e = new MethodReferenceExpression($c);}
	|	a = arrayType '::' 'new'
        {$e = new MethodReferenceExpression($a);}
	;

// TODO
methodReference_lf_primary returns [MethodReferenceExpression e]
	:	'::' t = typeArguments? id = Identifier
        {$e = new MethodReferenceExpression($id.getText());}
	;

// TODO
methodReference_lfno_primary returns [MethodReferenceExpression e]
	:	en = expressionName '::' t = typeArguments? id = Identifier
        {$e = new MethodReferenceExpression($en, $id.getText());}
	|	r = referenceType '::' t = typeArguments? id = Identifier
        {$e = new MethodReferenceExpression($r, $id.getText());}
	|	'super' '::' t = typeArguments? id = Identifier
        {$e = new MethodReferenceExpression(Expression.SuperExpression,
                                            $id.getText());}
	|	tn = typeName '.' 'super' '::' t = typeArguments? id = Identifier
        {$e = new MethodReferenceExpression($tn, $id.getText());}
	|	c = classType '::' t = typeArguments? 'new'
        {$e = new MethodReferenceExpression($c);}
	|	a = arrayType '::' 'new'
        {$e = new MethodReferenceExpression($a);}
	;

// TODO
arrayCreationExpression returns [Expression e]
	:	'new' primitiveType dimExprs dims?
	|	'new' classOrInterfaceType dimExprs dims?
	|	'new' primitiveType dims arrayInitializer
	|	'new' classOrInterfaceType dims arrayInitializer
	;

// TODO
dimExprs
	:	dimExpr dimExpr*
	;

// TODO
dimExpr returns [Expression e]
    locals [List<Modifier> mods = new ArrayList<>();]
	:	(a = annotation {$mods.add($a);})*
        '[' ex = expression ']'
	;

constantExpression returns [Expression e]
	:	ex = expression {$e = $ex;}
	;

expression returns [Expression e]
	:	l = lambdaExpression {$e = $l;}
	|	a = assignmentExpression {$e = $a;}
	;

lambdaExpression returns [LambdaExpression e]
	:	p = lambdaParameters '->' b = lambdaBody
        {$e = new LambdaExpression($p, $b);}
	;

lambdaParameters returns [List<VariableDeclaration> l]
    locals [List<VariableDeclaration> vars = new ArrayList<>();]
	:	id = Identifier
        {$vars.add(new VariableDeclaration($id.getText()));
         $l = $vars;}
	|	'(' p = formalParameterList? ')' {$l = $p;}
	|	'(' i = inferredFormalParameterList ')' {$l = $i;}
	;

inferredFormalParameterList returns [List<VariableDeclaration> l]
    locals [List<VariableDeclaration> vars = new ArrayList<>();]
	:	(id = Identifier {$vars.add(new VariableDeclaration($id.getText()));})
        (',' i = Identifier
            {$vars.add(new VariableDeclaration($i.getText()));})*
        {$l = $vars;}
	;

lambdaBody returns [Block b]
	:	e = expression {$b = new Block($e);}
	|	body = block {$b = $body;}
	;

assignmentExpression returns [AssignmentExpression e]
	:	c = conditionalExpression {$e = $c;}
	|	a = assignment {$e = $a;}
	;

assignment returns [AssignmentExpression e]
	:	l = leftHandSide op = assignmentOperator r = expression
        {e = new AssignmentExpression($l, $op, $r);}
	;

leftHandSide returns [Expression e]
	:	n = expressionName {$e = $n;}
	|	f = fieldAccess {$e = $f;}
	|	a = arrayAccess {$e = $a;}
	;

assignmentOperator returns [AssignmentOperator op]
	:	'=' {$op = AssignmentOperator.EQUALS}
	|	'*=' {$op = AssignmentOperator.MULTIPLICATION}
	|	'/=' {$op = AssignmentOperator.DIVISION}
	|	'%=' {$op = AssignmentOperator.MODULUS}
	|	'+=' {$op = AssignmentOperator.ADDITION}
	|	'-=' {$op = AssignmentOperator.SUBTRACTION}
	|	'<<=' {$op = AssignmentOperator.LEFT_SHIFT}
	|	'>>=' {$op = AssignmentOperator.RIGHT_SHIFT}
	|	'>>>=' {$op = AssignmentOperator.RIGHT_LOGICAL_SHIFT}
	|	'&=' {$op = AssignmentOperator.BITWISE_AND}
	|	'^=' {$op = AssignmentOperator.BITWISE_XOR}
	|	'|=' {$op = AssignmentOperator.BITWISE_OR}
	;

conditionalExpression returns [Expression e]
	:	c = conditionalOrExpression {$e = $c;}
	|	c = conditionalOrExpression '?'
        i = expression ':' el = conditionalExpression
        {$e = new TernaryExpression($c, $i, $el);}
	;

conditionalOrExpression returns [BinaryExpression e]
	:	c = conditionalAndExpression {$e = $c;}
	|	c1 = conditionalOrExpression '||' c2 = conditionalAndExpression
        {$e = new BinaryExpression($c1, BinaryOperator.OR, $c2);}
	;

conditionalAndExpression returns [BinaryExpression e]
	:	i = inclusiveOrExpression {$e = $i;}
	|	l = conditionalAndExpression '&&' r = inclusiveOrExpression
        {$e = new BinaryExpression($l, BinaryOperator.AND, $r);}
	;

inclusiveOrExpression returns [BinaryExpression e]
	:	ex = exclusiveOrExpression {$e = $ex;}
	|	l = inclusiveOrExpression '|' r = exclusiveOrExpression
        {$e = new BinaryExpression($l, BinaryOperator.BITWISE_OR, $r);}
	;

exclusiveOrExpression returns [BinaryExpression e]
	:	ex = andExpression {$e = $ex;}
	|	l = exclusiveOrExpression '^' r = andExpression
        {$e = new BinaryExpression($l, BinaryOperator.BITWISE_XOR, $r);}
	;

andExpression returns [BinaryExpression e]
	:	ex = equalityExpression {$e = $ex;}
	|	l = andExpression '&' r = equalityExpression
        {$e = new BinaryExpression($l, BinaryOperator.BITWISE_AND, $r);}
	;

equalityExpression returns [BinaryExpression e]
	:	ex = relationalExpression {$e = $ex;}
	|	l = equalityExpression '==' r = relationalExpression
        {$e = new BinaryExpression($l, BinaryOperator.EQUALITY, $r);}
	|	l = equalityExpression '!=' r = relationalExpression
        {$e = new BinaryExpression($l, BinaryOperator.INEQUALITY, $r);}
	;

relationalExpression returns [BinaryExpression e]
	:	ex = shiftExpression {$e = $ex;}
	|	l = relationalExpression '<' r = shiftExpression
        {$e = new BinaryExpression($l, BinaryOperator.LESS_THAN, $r);}
	|	l = relationalExpression '>' r = shiftExpression
        {$e = new BinaryExpression($l, BinaryOperator.GREATER_THAN, $r);}
	|	l = relationalExpression '<=' r = shiftExpression
        {$e = new BinaryExpression($l, BinaryOperator.LESS_THAN_OR_EQUAL, $r);}
	|	l = relationalExpression '>=' r = shiftExpression
        {$e = new BinaryExpression($l, BinaryOperator.GREATER_THAN_OR_EQUAL, $r);}
	|	l = relationalExpression 'instanceof' rt = referenceType
        {$e = new BinaryExpression($l, BinaryOperator.INSTANCE_OF, $rt);}
	;

shiftExpression returns [BinaryExpression e]
	:	ex = additiveExpression {$e = $ex;}
	|	l = shiftExpression '<' '<' r = additiveExpression
        {$e = new BinaryExpression($l, BinaryOperator.LEFT_SHIFT, $r);}
	|	l = shiftExpression '>' '>' r = additiveExpression
        {$e = new BinaryExpression($l, BinaryOperator.RIGHT_SHIFT, $r);}
	|	l = shiftExpression '>' '>' '>' r = additiveExpression
        {$e = new BinaryExpression($l, BinaryOperator.RIGHT_LOGICAL_SHIFT, $r);}
	;

additiveExpression returns [BinaryExpression e]
	:	ex = multiplicativeExpression {$e = $ex;}
        {$e = new BinaryExpression($l, , $r);}
	|	l = additiveExpression '+' r = multiplicativeExpression
        {$e = new BinaryExpression($l, BinaryOperator.ADDITION, $r);}
	|	l = additiveExpression '-' r = multiplicativeExpression
        {$e = new BinaryExpression($l, BinaryOperator.SUBTRACTION, $r);}
	;

multiplicativeExpression returns [Expression e]
	:	ex = unaryExpression {$e = $ex;}
	|	l = multiplicativeExpression '*' r = unaryExpression
        {$e = new BinaryExpression($l, BinaryOperator.MULTIPLACATION, $r);}
	|	l = multiplicativeExpression '/' r = unaryExpression
        {$e = new BinaryExpression($l, BinaryOperator.DIVISION, $r);}
	|	l = multiplicativeExpression '%' r = unaryExpression
        {$e = new BinaryExpression($l, BinaryOperator.MODULUS, $r);}
	;

unaryExpression returns [UnaryExpression e]
	:	pi = preIncrementExpression {$e = $pi;}
	|	pd = preDecrementExpression {$e = $pd;}
	|	'+' ex = unaryExpression {$e = $ex;}
	|	'-' ex = unaryExpression
        {$e = new UnaryExpression($ex, UnaryOperator.NEGATION);}
	|	npm = unaryExpressionNotPlusMinus {$e = $npm;}
	;

preIncrementExpression returns [UnaryExpression e]
	:	'++' ex = unaryExpression
        {$e = new UnaryExpression($ex, UnaryOperator.PRE_INCREMENT);}
	;

preDecrementExpression returns [UnaryExpression e]
	:	'--' ex = unaryExpression
        {$e = new UnaryExpression($ex, UnaryOperator.PRE_DECREMENT);}
	;

// TODO
unaryExpressionNotPlusMinus returns [Expression e]
	:	pf = postfixExpression {$e = $pf;}
	|	'~' ex = unaryExpression
        {$e = new UnaryExpression($ex, UnaryOperator.BITWISE_NEGATION);}
	|	'!' ex = unaryExpression
        {$e = new UnaryExpression($ex, UnaryOperator.NEGATIION);}
	|	cex = castExpression {$e = $cex;}
	;

// TODO
postfixExpression returns [UnaryExpression e]
	:	(	p = primary
		|	n = expressionName
		)
		(	op1 = postIncrementExpression_lf_postfixExpression
		|	op2 = postDecrementExpression_lf_postfixExpression
		)*
	;

postIncrementExpression returns [UnaryExpression e]
	:	ex = postfixExpression '++'
        {$e = new UnaryExpression($ex, UnaryOperator.INCREMENT);}
	;

postIncrementExpression_lf_postfixExpression returns [UnaryOperator op]
	:	'++' {$op = UnaryOperator.INCREMENT;}
	;

postDecrementExpression returns [UnaryExpression e]
	:	ex = postfixExpression '--'
        {$e = new UnaryExpression($ex, UnaryOperator.DECREMENT);}
	;

postDecrementExpression_lf_postfixExpression returns [UnaryOperator op]
	:	'--' {$op = UnaryOperator.DECREMENT;}
	;

// TODO
castExpression returns [CastExpression e]
	:	'(' pt = primitiveType ')' uex = unaryExpression
        {$e = new CastExpression($uex, $pt);}
	|	'(' rt = referenceType b = additionalBound* ')'
        npm = unaryExpressionNotPlusMinus
        {$e = new CastExpression($npm, $rt);}
	|	'(' rt = referenceType b = additionalBound* ')' lam = lambdaExpression
        {$e = new CastExpression($lam, $rt);}
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
