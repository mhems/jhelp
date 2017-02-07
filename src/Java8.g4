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
    package com.binghamton.jhelp;
    import java.util.ArrayList;
    import java.util.List;
}

@parser::members {

}


/*
 * Productions from §3 (Lexical Structure)
 */

literal
	:	IntegerLiteral
	|	FloatingPointLiteral
	|	BooleanLiteral
	|	CharacterLiteral
	|	StringLiteral
	|	NullLiteral
	;

/*
 * Productions from §4 (Types, Values, and Variables)
 */

type_
	:	primitiveType
	|	referenceType
	;

primitiveType
	:	annotation* numericType
	|	annotation* 'boolean'
	;

numericType returns [PrimitiveType p]
	:	i = integralType {$p = $i;}
	|	f = floatingPointType {$p = $f;}
	;

integralType returns [PrimitiveType p]
	:	t = 'byte' {$p = PrimitiveType.BYTE;}
	|	t = 'short' {$p = PrimitiveType.SHORT;}
	|	t = 'int' {$p = PrimitiveType.INT;}
	|	t = 'long' {$p = PrimitiveType.LONG;}
	|	t = 'char' {$p = PrimitiveType.CHAR;}
	;

floatingPointType returns [PrimitiveType p]
	:	'float' {$p = PrimitiveType.FLOAT;}
	|	'double' {$p = PrimitiveType.DOUBLE;}
	;

referenceType
	:	classOrInterfaceType
	|	typeVariable
	|	arrayType
	;

classOrInterfaceType
	:	(	classType_lfno_classOrInterfaceType
		|	interfaceType_lfno_classOrInterfaceType
		)
		(	classType_lf_classOrInterfaceType
		|	interfaceType_lf_classOrInterfaceType
		)*
	;

classType
	:	annotation* Identifier typeArguments?
	|	classOrInterfaceType '.' annotation* Identifier typeArguments?
	;

classType_lf_classOrInterfaceType
	:	'.' annotation* Identifier typeArguments?
	;

classType_lfno_classOrInterfaceType
	:	annotation* Identifier typeArguments?
	;

interfaceType
	:	classType
	;

interfaceType_lf_classOrInterfaceType
	:	classType_lf_classOrInterfaceType
	;

interfaceType_lfno_classOrInterfaceType
	:	classType_lfno_classOrInterfaceType
	;

typeVariable
	:	annotation* Identifier
	;

arrayType
	:	primitiveType dims
	|	classOrInterfaceType dims
	|	typeVariable dims
	;

dims
	:	annotation* '[' ']' (annotation* '[' ']')*
	;

typeParameter
	:	typeParameterModifier* Identifier typeBound?
	;

typeParameterModifier
	:	annotation
	;

typeBound
	:	'extends' typeVariable
	|	'extends' classOrInterfaceType additionalBound*
	;

additionalBound
	:	'&' interfaceType
	;

typeArguments
	:	'<' typeArgumentList '>'
	;

typeArgumentList
	:	typeArgument (',' typeArgument)*
	;

typeArgument
	:	referenceType
	|	wildcard
	;

wildcard
	:	annotation* '?' wildcardBounds?
	;

wildcardBounds
	:	'extends' referenceType
	|	'super' referenceType
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
	|	p = packageOrTypeName '.' id = Identifier { $name = p + "." + $id.getText(); }
	;

packageOrTypeName returns [String name]
	:	id = Identifier { $name = $id.getText(); }
	|	p = packageOrTypeName '.' id = Identifier { $name = p + "." + $id.getText(); }
	;

expressionName returns [String name]
	:	id = Identifier { $name = $id.getText(); }
	|	a = ambiguousName '.' id = Identifier { $name = a + "." + $id.getText(); }
	;

methodName returns [String name]
	:	id = Identifier { $name = $id.getText(); }
	;

ambiguousName returns [String name]
	:	id = Identifier { $name = $id.getText(); }
	|	a = ambiguousName '.' id = Identifier { $name = a + "." + $id.getText(); }
	;

/*
 * Productions from §7 (Packages)
 */

compilationUnit
	:	packageDeclaration? importDeclaration* typeDeclaration* EOF
	;

packageDeclaration returns [PackageStatement p]
    locals [ List<Annotation> mods = new ArrayList<>(),
             List<String> ids = new ArrayList<>()]
	:	( m = packageModifier { $mods.add($m); })* 'package'
        (id = Identifier {$ids.add($id);})
        ('.' id = Identifier {$ids.add($id);})* ';'
        { $p = new PackageStatement($ids, $mods)}
	;

packageModifier returns [AnnotationStatement a]
	:	an = annotation {$a = $an;}
	;

importDeclaration returns [ImportStatement i]
	:   d = singleTypeImportDeclaration {$i = $d;}
	|	d = typeImportOnDemandDeclaration {$i = $d;}
	|	d = singleStaticImportDeclaration {$i = $d;}
	|	d = staticImportOnDemandDeclaration {$i = $d;}
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
        {$imp = new ImportStatement($t + '.' + $id, true, false);}
	;

staticImportOnDemandDeclaration returns [ImportStatement imp]
	:	'import' 'static' t = typeName '.' '*' ';'
        {$imp = new ImportStatement($t, true, true);}
	;

typeDeclaration returns [TypeDeclaraction t]
	:	c = classDeclaration {$t = $c;}
	|	i = interfaceDeclaration {$t = $i;}
	|	';'
	;

/*
 * Productions from §8 (Classes)
 */

classDeclaration returns [ClassNode c]
	:	n = normalClassDeclaration {$c = $n;}
	|	e = enumDeclaration {$c = $e;}
	;

normalClassDeclaration returns [ClassNode c]
    [locals List<Modifier> mods = new ArrayList<>()]
	:	(m = classModifier {$mods.add($m);})* 'class' n = Identifier
        (p = typeParameters)?
        (sc = superclass)?
        (si = superinterfaces)?
        (b = classBody)
        {$c = new ClassNode($mods, $n, $p, $sc, $si, $b);}
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

typeParameters returns [List<String> l]
	:	'<' t = typeParameterList '>' {$l = $t;}
	;

typeParameterList returns [List<String> l]
    [locals List<String> ls = new ArrayList<>();]
	:	(t = typeParameter {$ls.add($t);})
        (',' t = typeParameter {$ls.add($t);})*
        {$l = $ls;}
	;

superclass returns [String s]
	:	'extends' c = classType {$s = $c;}
	;

superinterfaces returns [List<String> l]
	:	'implements' i = interfaceTypeList {$l = $i;}
	;

interfaceTypeList returns [List<String> s]
    [locals List<String> ls = new ArrayList<>();]
	:	(i = interfaceType {$ls.add($i);})
        (',' i = interfaceType {$ls.add($i);})*
        {$s = $ls;}
	;

classBody
	:	'{' classBodyDeclaration* '}'
	;

classBodyDeclaration
	:	classMemberDeclaration
	|	instanceInitializer
	|	staticInitializer
	|	constructorDeclaration
	;

classMemberDeclaration
	:	fieldDeclaration
	|	methodDeclaration
	|	classDeclaration
	|	interfaceDeclaration
	|	';'
	;

fieldDeclaration
	:	fieldModifier* unannType variableDeclaratorList ';'
	;

fieldModifier returns [ Modifier m]
	:	a = annotation {$m = $a;}
	|	'public' {$m = Modifier.PUBLIC;}
	|	'protected' {$m = Modifier.PROTECTED;}
	|	'private' {$m = Modifier.PRIVATE;}
	|	'static' {$m = Modifier.STATIC;}
	|	'final' {$m = Modifier.FINAL;}
	|	'transient' {$m = Modifier.TRANSIENT;}
	|	'volatile' {$m = Modifier.VOLATILE;}
	;

variableDeclaratorList
	:	variableDeclarator (',' variableDeclarator)*
	;

variableDeclarator
	:	variableDeclaratorId ('=' variableInitializer)?
	;

variableDeclaratorId
	:	Identifier dims?
	;

variableInitializer
	:	expression
	|	arrayInitializer
	;

unannType
	:	unannPrimitiveType
	|	unannReferenceType
	;

unannPrimitiveType returns [PrimitiveType t]
	:	n = numericType {$t = $n;}
	|	'boolean' {$t = PrimitiveType.BOOLEAN;}
	;

unannReferenceType
	:	unannClassOrInterfaceType
	|	unannTypeVariable
	|	unannArrayType
	;

unannClassOrInterfaceType
	:	(	unannClassType_lfno_unannClassOrInterfaceType
		|	unannInterfaceType_lfno_unannClassOrInterfaceType
		)
		(	unannClassType_lf_unannClassOrInterfaceType
		|	unannInterfaceType_lf_unannClassOrInterfaceType
		)*
	;

unannClassType
	:	Identifier typeArguments?
	|	unannClassOrInterfaceType '.' annotation* Identifier typeArguments?
	;

unannClassType_lf_unannClassOrInterfaceType
	:	'.' annotation* Identifier typeArguments?
	;

unannClassType_lfno_unannClassOrInterfaceType
	:	Identifier typeArguments?
	;

unannInterfaceType
	:	unannClassType
	;

unannInterfaceType_lf_unannClassOrInterfaceType
	:	unannClassType_lf_unannClassOrInterfaceType
	;

unannInterfaceType_lfno_unannClassOrInterfaceType
	:	unannClassType_lfno_unannClassOrInterfaceType
	;

unannTypeVariable returns [String s]
	:	i = Identifier {$s = $i;}
	;

unannArrayType
	:	unannPrimitiveType dims
	|	unannClassOrInterfaceType dims
	|	unannTypeVariable dims
	;

methodDeclaration
	:	methodModifier* methodHeader methodBody
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

methodHeader
	:	result methodDeclarator throws_?
	|	typeParameters annotation* result methodDeclarator throws_?
	;

result returns [Type t]
	:	u = unannType {$t = $u;}
	|	'void' {$t = Type.VOID;}
	;

methodDeclarator returns [MethodDeclaration m]
	:	n = Identifier '(' p = formalParameterList? ')' d = dims?
        {$m = new MethodDeclaration($n, $p, $d);}
	;

formalParameterList returns [List<VariableDeclaration> l]
    [locals List<VariableDeclaration> ls = new ArrayList<>();]
	:	(p = formalParameters {$ls.addAll($p);}) ','
        (p2 = lastFormalParameter {$ls.add($p2);}) {$l = $ls;}
	|   (l = lastFormalParameter {$ls.add($v);}) {$l = $ls;}
	;

formalParameters returns [List<VariableDeclaration> l]
    [locals List<VariableDeclaration> ls = new ArrayList<>();]
	:	(p = formalParameter {$ls.add($p);})
        (',' f = formalParameter {$ls.add($f);})* {$l = $ls;}
	|	(r = receiverParameter {$ls.add($r);})
        (',' f = formalParameter {$ls.add($f);})* {$l = $ls;}
	;

formalParameter returns [VariableDeclaration v]
    [locals List<Modifier> mods = new ArrayList<>();]
	:	(m = variableModifier {$mods.add($m);})*
        t = unannType n = variableDeclaratorId
        {$v = new VariableDeclaration($n, $t, $mods, false);}
	;

variableModifier returns [Modifier m]
	:	a = annotation {$m = $a;}
	|	'final' {$m = Modifier.FINAL;}
	;

lastFormalParameter returns [VariableDeclaration v]
    [locals List<Modifier> mods = new ArrayList<>();]
	:	(m = variableModifier {$mods.add($m);})*
        t = unannType
        (a = annotation {$mods.add($a);})*
        '...'
        n = variableDeclaratorId
        {$v = new VariableDeclaration($n, $t, $mods, true);}
	|	f = formalParameter {$v = $f;}
	;

receiverParameter returns [VariableDeclaration v]
    [locals List<Modifier> mods = new ArrayList<>();]
	:	(m = annotation {$mods.add($m);})*
        t = unannType
        (i = Identifier '.')?
        'this'
        {$v = new VariableDeclaration($i + "." + "this", $t, $mods);}
	;

throws_ returns [List<Type> l]
	:	'throws' e = exceptionTypeList {$l = $e;}
	;

exceptionTypeList returns [List<Type> l]
    [locals List<Type> ls = new ArrayList<>();]
	:	(e = exceptionType {$ls.add($e);})
        (',' e = exceptionType {$ls.add($e);})*
        {$l = $ls;}
	;

exceptionType returns [Type t]
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

constructorDeclaration returns [MethodDeclaration m]
    [local List<Modifier> mods = new ArrayList<>();]
	:	(m = constructorModifier {$mods.add($m);})*
        p = constructorDeclarator
        t = throws_?
        b = constructorBody
        {$m = new MethodDeclaration();}
	;

constructorModifier returns [Modifier m]
	:	a = annotation {$m = $a;}
	|	'public' {$m = Modifier.PUBLIC;}
	|	'protected' {$m = Modifier.PROTECTED;}
	|	'private' {$m = Modifier.PRIVATE;}
	;

constructorDeclarator
	:	typeParameters? simpleTypeName '(' formalParameterList? ')'
	;

simpleTypeName returns [String s]
	:	id = Identifier {$s = $id;}
	;

constructorBody
	:	'{' explicitConstructorInvocation? blockStatements? '}'
	;

explicitConstructorInvocation
	:	typeArguments? 'this' '(' argumentList? ')' ';'
	|	typeArguments? 'super' '(' argumentList? ')' ';'
	|	expressionName '.' typeArguments? 'super' '(' argumentList? ')' ';'
	|	primary '.' typeArguments? 'super' '(' argumentList? ')' ';'
	;

enumDeclaration
	:	classModifier* 'enum' Identifier superinterfaces? enumBody
	;

enumBody
	:	'{' enumConstantList? ','? enumBodyDeclarations? '}'
	;

enumConstantList
	:	enumConstant (',' enumConstant)*
	;

enumConstant
	:	enumConstantModifier* Identifier ('(' argumentList? ')')? classBody?
	;

enumConstantModifier
	:	annotation
	;

enumBodyDeclarations
	:	';' classBodyDeclaration*
	;

/*
 * Productions from §9 (Interfaces)
 */

interfaceDeclaration returns [InterfaceDeclaration d]
	:	normalInterfaceDeclaration
	|	annotationTypeDeclaration
	;

normalInterfaceDeclaration
	:	interfaceModifier* 'interface' Identifier typeParameters? extendsInterfaces? interfaceBody
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

extendsInterfaces returns [List<String> l]
	:	'extends' i = interfaceTypeList {$l = $i;}
	;

interfaceBody
	:	'{' interfaceMemberDeclaration* '}'
	;

interfaceMemberDeclaration
	:	constantDeclaration
	|	interfaceMethodDeclaration
	|	classDeclaration
	|	interfaceDeclaration
	|	';'
	;

constantDeclaration returns [VariableDeclaration v]
    [locals List<Modifier> mods = new ArrayList<>();]
	:	(m =constantModifier {$mods.add($m);})*
        t = unannType
        l = variableDeclaratorList ';'
        {$v = new VariableDeclaration();}
	;

constantModifier returns [Modifier m]
	:	a = annotation {$m = $a;}
	|	'public' {$m = Modifier.PUBLIC;}
	|	'static' {$m = Modifier.STATIC;}
	|	'final' {$m = Modifier.FINAL;}
	;

interfaceMethodDeclaration
	:	interfaceMethodModifier* methodHeader methodBody
	;

interfaceMethodModifier returns [Modifier m]
	:	a = annotation {$m = $a;}
	|	'public' {$m = Modifier.PUBLIC;}
	|	'abstract' {$m = Modifier.ABSTRACT;}
	|	'default' {$m = Modifier.DEFAULT;}
	|	'static' {$m = Modifier.STATIC;}
	|	'strictfp' {$m = Modifier.STRICT_FP;}
	;

annotationTypeDeclaration
	:	interfaceModifier* '@' 'interface' Identifier annotationTypeBody
	;

annotationTypeBody
	:	'{' annotationTypeMemberDeclaration* '}'
	;

annotationTypeMemberDeclaration
	:	annotationTypeElementDeclaration
	|	constantDeclaration
	|	classDeclaration
	|	interfaceDeclaration
	|	';'
	;

annotationTypeElementDeclaration
	:	annotationTypeElementModifier* unannType Identifier '(' ')' dims? defaultValue? ';'
	;

annotationTypeElementModifier returns [Modifier m]
	:	a = annotation {$m = $a;}
	|	'public' {$m = Modifier.PUBLIC;}
	|	'abstract' {$m = Modifier.ABSTRACT;}
	;

defaultValue
	:	'default' elementValue
	;

annotation
	:	normalAnnotation
	|	markerAnnotation
	|	singleElementAnnotation
	;

normalAnnotation
	:	'@' typeName '(' elementValuePairList? ')'
	;

elementValuePairList
	:	elementValuePair (',' elementValuePair)*
	;

elementValuePair
	:	Identifier '=' elementValue
	;

elementValue
	:	conditionalExpression
	|	elementValueArrayInitializer
	|	annotation
	;

elementValueArrayInitializer
	:	'{' elementValueList? ','? '}'
	;

elementValueList
	:	elementValue (',' elementValue)*
	;

markerAnnotation
	:	'@' typeName
	;

singleElementAnnotation
	:	'@' typeName '(' elementValue ')'
	;

/*
 * Productions from §10 (Arrays)
 */

arrayInitializer returns [ArrayDeclaration d]
	:	'{' l = variableInitializerList? ','? '}'
        {$d = new ArrayDeclaration($l);}
	;

variableInitializerList returns [List<Expression> l]
    [locals List<Expression> ls = new ArrayList<>();]
	:	(i = variableInitializer {$ls.add($i);}
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
    [locals List<Statement> ls = new ArrayList<>();]
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
    [locals List<Modifier> mods = new ArrayList<>();)]
	:	(m = variableModifier {$mods.add($m);})*
        t = unannType
        vl = variableDeclaratorList
        {$v = new VariableDeclaration();}
	;

statement returns [Statement s]
	:	st = statementWithoutTrailingSubstatement {$s = $st;}
	|	st = labeledStatement {$s = $st;}
	|	st = ifThenStatement {$s = $st;}
	|	st = ifThenElseStatement {$s = $st;}
	|	st = whileStatement {$s = $st;}
	|	st = forStatement {$s = $st;}
	;

statementNoShortIf returns [Statement s]
	:	st = statementWithoutTrailingSubstatement {$s = $st;}
	|	st = labeledStatementNoShortIf {$s = $st;}
	|	st = ifThenElseStatementNoShortIf {$s = $st;}
	|	st = whileStatementNoShortIf {$s = $st;}
	|	st = forStatementNoShortIf {$s = $st;}
	;

statementWithoutTrailingSubstatement returns [Statement s]
	:	st = block {$s = $st;}
	|	st = emptyStatement {$s = $st;}
	|	st = expressionStatement {$s = $st;}
	|	st = assertStatement {$s = $st;}
	|	st = switchStatement {$s = $st;}
	|	st = doStatement {$s = $st;}
	|	st = breakStatement {$s = $st;}
	|	st = continueStatement {$s = $st;}
	|	st = returnStatement {$s = $st;}
	|	st = synchronizedStatement {$s = $st;}
	|	st = throwStatement {$s = $st;}
	|	st = tryStatement {$s = $st;}
	;

emptyStatement returns [Statement s]
	:	';' {$s = new Statement();}
	;

labeledStatement returns [LabelStatement ls]
	:	id = Identifier ':' s = statement {$ls = new LabelStatement($id, $s);}
	;

labeledStatementNoShortIf returns [LabelStatement ls]
	:	id = Identifier ':' s = statementNoShortIf {$ls = new LabelStatement($id, $s);}
	;

expressionStatement returns [Expression e]
	:	s = statementExpression ';' {$e = $s;}
	;

statementExpression returns [Expression e]
	:	s = assignment {$e = $s;}
	|	s = preIncrementExpression {$e = $s;}
	|	s = preDecrementExpression {$e = $s;}
	|	s = postIncrementExpression {$e = $s;}
	|	s = postDecrementExpression {$e = $s;}
	|	s = methodInvocation {$e = $s;}
	|	s = classInstanceCreationExpression {$e = $s;}
	;

ifThenStatement returns [IfElseStatement st]
	:	'if' '(' e = expression ')' s = statement {$st = new IfElseStatement($e, $s);}
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
    [locals List<CaseBlock> blocks = new ArrayList<>();]
	:	'{' (m = switchBlockStatementGroup {$blocks.add($m);})*
            (l = switchLabel {$blocks.add($l);})* '}'
        {$ls = $blocks;}
	;

switchBlockStatementGroup returns [CaseBlock b]
	:	l = switchLabels b = blockStatements {$b = new CaseBlock($l, $b);}
	;

switchLabels returns [List<Expression> ls]
    [locals List<Expression> lbls = new ArrayList<>();]
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
	:	id = Identifier {$s = $id;}
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
	:	b = basicForStatementNoShortIf {$st = $e;}
	|	e = enhancedForStatementNoShortIf {$st = $b;}
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

forInit
	:	statementExpressionList
	|	localVariableDeclaration
	;

forUpdate
	:	statementExpressionList
	;

statementExpressionList returns [List<Expression> ls]
    [locals List<Expression> ups = new ArrayList<>();]
	:	(s = statementExpression {$ups.add($s);})
        (',' e = statementExpression {$ups.add($e);})*
        { $ls = $ups;}
	;

enhancedForStatement returns [ForEachStatement st]
    [locals List<Modifier> mods = new ArrayList<>(),
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
    [locals List<Modifier> mods = new ArrayList<>(),
            VariableDeclaration v;]
	:	'for' '(' (m = variableModifier {$mods.add($m);})*
                   t = unannType
                   n = variableDeclaratorId ':'
                   e = expression ')'
                   s = statementNoShortIf
        {$v = new VariableDeclaration($n, $t, $mods);
         $st = new ForEachStatement($v, $e, $s);}
	;

breakStatement returns [BreakStatement st]
	:	'break' id = Identifier? ';' {$st = new BreakStatement($id);}
	;

continueStatement returns [ContinueStatement st]
	:	'continue' id = Identifier? ';' {$st = new ContinueStatement($id);}
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

tryStatement return [TryCatchStatement st]
	:	'try' t = block cs = catches {$st = new TryCatchStatement($t, $cs);}
	|	'try' t = block cs = catches? f = finally_
        {$st = new TryCatchStatement($t, $cs, $f);}
	|	t = tryWithResourcesStatement {$st = $t;}
	;

catches return [List<CatchBlock> l]
    [locals List<CatchBlock> ls = new ArrayList<>();]
	:	f = catchClause {$ls.add($f);} (c = catchClause {$ls.add($c);})*
        {$l = $ls;}
	;

catchClause return [CatchBlock b]
	:	'catch' '(' p = catchFormalParameter ')' body = block
        {$b = new CatchBlock($p, $body);}
	;

catchFormalParameter return [VariableDeclaration d]
    [locals List<Modifier> mods = new ArrayList<>();]
	:	(m = variableModifier {$mods.add($m);})*
        t = catchType
        n = variableDeclaratorId
        {$d = new VariableDeclaration($n, $t, $mods);}
	;

catchType return [List<Type> l]
    [locals List<Type> types = new ArrayList<>();]
	:	(u = unannClassType {$types.add($u);})
        ('|' c = classType {$types.add($c);})*
        {$l = $types;}
	;

finally_ return [Block b]
	:	'finally' body = block {$b = $body;}
	;

tryWithResourcesStatement return [TryCatchStatement st]
	:	'try' r = resourceSpecification b = block c = catches? f = finally_?
        {$st = new TryCatchStatement($r, $b, $c, $f);}
	;

resourceSpecification return [List<Statement> lst]
	:	'(' l = resourceList ';'? ')' {$lst = $l;}
	;

resourceList return [List<Statement> lst]
    [locals List<VariableDeclartion> vars = new ArrayList<>();]
	:	r = resource {$vars.add($r);}
        (';' re = resource {$vars.add($re);})*
        {$lst = $vars;}
	;

resource return [VariableDeclaration d]
    [locals List<Modifier> mods = new ArrayList<>();]
	:	(m = variableModifier {$mods.add($m);})*
        t = unannType
        n = variableDeclaratorId '='
        e = expression
    {$d = new VariableDeclaration($n, $t, $mods, $e);}
	;

/*
 * Productions from §15 (Expressions)
 */

primary
	:	(	primaryNoNewArray_lfno_primary
		|	arrayCreationExpression
		)
		(	primaryNoNewArray_lf_primary
		)*
	;

primaryNoNewArray returns [Expression e]
	:	p = literal {$e = $p;}
	|	p = typeName ('[' ']')* '.' 'class'
	|	'void' '.' 'class'
	|	'this'
	|	p = typeName '.' 'this'
	|	'(' p = expression ')' {$e = $p;}
	|	p = classInstanceCreationExpression {$e = $p;}
	|	p = fieldAccess {$e = $p;}
	|	p = arrayAccess {$e = $p;}
	|	p = methodInvocation {$e = $p;}
	|	p = methodReference {$e = $p;}
	;

primaryNoNewArray_lf_arrayAccess
	:
	;

primaryNoNewArray_lfno_arrayAccess returns [Expression e]
	:	p = literal {$e = $p;}
	|	typeName ('[' ']')* '.' 'class'
	|	'void' '.' 'class'
	|	'this'
	|	typeName '.' 'this'
	|	'(' p = expression ')' {$e = $p;}
	|	p = classInstanceCreationExpression {$e = $p;}
	|	p = fieldAccess {$e = $p;}
	|	p = methodInvocation {$e = $p;}
	|	p = methodReference {$e = $p;}
	;

primaryNoNewArray_lf_primary returns [Expression e]
	:	p = classInstanceCreationExpression_lf_primary {$e = $p;}
	|	p = fieldAccess_lf_primary {$e = $p;}
	|	p = arrayAccess_lf_primary {$e = $p;}
	|	p = methodInvocation_lf_primary {$e = $p;}
	|	p = methodReference_lf_primary {$e = $p;}
	;

primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary
	:
	;

primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary returns [Expression e]
	:	p = classInstanceCreationExpression_lf_primary {$e = $p;}
	|	p = fieldAccess_lf_primary {$e = $p;}
	|	p = methodInvocation_lf_primary {$e = $p;}
	|	p = methodReference_lf_primary {$e = $p;}
	;

primaryNoNewArray_lfno_primary returns [Expression e]
	:	p = literal {$e = $p;}
	|	typeName ('[' ']')* '.' 'class'
	|	unannPrimitiveType ('[' ']')* '.' 'class'
	|	'void' '.' 'class'
	|	'this'
	|	typeName '.' 'this'
	|	'(' p = expression ')' {$e = $p;}
	|	p = classInstanceCreationExpression_lfno_primary {$e = $p;}
	|	p = fieldAccess_lfno_primary {$e = $p;}
	|	p = arrayAccess_lfno_primary {$e = $p;}
	|	p = methodInvocation_lfno_primary {$e = $p;}
	|	p = methodReference_lfno_primary {$e = $p;}
	;

primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary
	:
	;

primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary returns [Expression e]
	:	p = literal {$e = $p;}
	|	typeName ('[' ']')* '.' 'class'
	|	unannPrimitiveType ('[' ']')* '.' 'class'
	|	'void' '.' 'class'
	|	'this'
	|	typeName '.' 'this'
	|	'(' p = expression ')' {$e = $p;}
	|	p = classInstanceCreationExpression_lfno_primary {$e = $p;}
	|	p = fieldAccess_lfno_primary {$e = $p;}
	|	p = methodInvocation_lfno_primary {$e = $p;}
	|	p = methodReference_lfno_primary {$e = $p;}
	;

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

classInstanceCreationExpression_lf_primary returns [ConstructionExpression e]
	:	'.' 'new' t = typeArguments? a = annotation* id = Identifier
        targs = typeArgumentsOrDiamond?
        '(' l = argumentList? ')'
        b = classBody?
	;

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

typeArgumentsOrDiamond
	:	typeArguments
	|	'<' '>'
	;

fieldAccess returns [AccessExpression e]
	:	p = primary '.' id = Identifier
        {$e = new AccessExpression($p, $id);}
	|	'super' '.' id = Identifier
        {$e = new AccessExpression(Expression.SuperExpression, $id);}
	|	t = typeName '.' 'super' '.' id = Identifier
	;

fieldAccess_lf_primary returns [AccessExpression e]
	:	'.' id = Identifier {$e = new AccessExpression(null, $id);}
	;

fieldAccess_lfno_primary returns [AccessExpression e]
	:	'super' '.' id = Identifier
        {$e = new AccessExpression(Expression.SuperExpression, $id);}
	|	typeName '.' 'super' '.' Identifier
	;

arrayAccess returns [ArrayAccessExpression e]
	:	(	(n = expressionName '[' i = expression ']'
                {$e = new ArrayAccessExpression($n, $i);})
		|	(p = primaryNoNewArray_lfno_arrayAccess '[' i = expression ']'
                {$e = new ArrayAccessExpression($p, $i);})
		)
		(	p = primaryNoNewArray_lf_arrayAccess '[' i = expression ']'
		)*
	;

arrayAccess_lf_primary returns [ArrayAccessExpression e]
	:	(	(p = primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary
           '[' i = expression ']' {$e = new ArrayAccessExpression($p, $i);})
		)
		(	primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary '[' expression ']'
		)*
	;

arrayAccess_lfno_primary returns [ArrayAccessExpression e]
	:	(	(name = expressionName '[' i = expression ']'
                {$e = new ArrayAccessExpression($name, $i);})
		|	(p = primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary
                '[' i = expression ']'
                {$e = new ArrayAccessExpression($p, $i);})
		)
		(	primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary '[' expression ']'
		)*
	;

methodInvocation returns [CallExpression e]
	:	n = methodName '(' a = argumentList? ')'
        {$e = new CallExpression($n, $a);}
	|	n = typeName '.' t = typeArguments? id = Identifier '(' a = argumentList? ')'
        {$e = new CallExpression($id, $a);}
	|	n = expressionName '.' t = typeArguments? id = Identifier '(' a = argumentList? ')'
        {$e = new CallExpression($id, $a);}
	|	p = primary '.' t = typeArguments?
        id = Identifier '(' a = argumentList? ')'
        {$e = new CallExpression($p, $a);}
	|	'super' '.' t = typeArguments? id = Identifier '(' a = argumentList? ')'
        {$e = new CallExpression($id, $a);}
	|	n = typeName '.' 'super' '.' t = typeArguments?
        id = Identifier '(' a = argumentList? ')'
        {$e = new CallExpression($id, $a);}
	;

methodInvocation_lf_primary returns [CallExpression e]
	:	'.' t = typeArguments? id = Identifier '(' a = argumentList? ')'
        {$e = new CallExpression($id, $a);}
	;

methodInvocation_lfno_primary returns [CallExpression e]
	:	n = methodName '(' a = argumentList? ')'
        {$e = new CallExpression($n, $a);}
	|	n = typeName '.' t = typeArguments?
        id = Identifier '(' a = argumentList? ')'
        {$e = new CallExpression($id, $a);}
	|	n = expressionName '.' t = typeArguments?
        id = Identifier '(' a = argumentList? ')'
        {$e = new CallExpression($id, $a);}
	|	'super' '.' t = typeArguments? id = Identifier '(' a = argumentList? ')'
        {$e = new CallExpression($id, $a);}
	|	n = typeName '.' 'super' '.' t = typeArguments?
        id = Identifier '(' a = argumentList? ')'
        {$e = new CallExpression($id, $a);}
	;

argumentList returns [List<Expression> l]
    [locals List<Expression> ls = new ArrayList<>();]
	:	(e = expression {$ls.add($e);})
        (',' ex = expression {$ls.add($ex);})* {$l = $ls;}
	;

methodReference returns [MethodReferenceExpression e]
	:	n = expressionName '::' t = typeArguments? id = Identifier
        {$e = new MethodReferenceExpression($n, $id);}
	|	r = referenceType '::' t = typeArguments? id = Identifier
        {$e = new MethodReferenceExpression($r, $id);}
	|	p = primary '::' t = typeArguments? id = Identifier
        {$e = new MethodReferenceExpression($p, $id);}
	|	'super' '::' t = typeArguments? id = Identifier
        {$e = new MethodReferenceExpression(Expression.SuperExpression, $id);}
	|	n = typeName '.' 'super' '::' t = typeArguments? id = Identifier
        {$e = new MethodReferenceExpression(Expression.SuperExpression, $id);}
	|	c = classType '::' t = typeArguments? 'new'
        {$e = new MethodReferenceExpression($c);}
	|	a = arrayType '::' 'new'
        {$e = new MethodReferenceExpression($a);}
	;

methodReference_lf_primary returns [MethodReferenceExpression e]
	:	'::' t = typeArguments? id = Identifier
        {$e = new MethodReferenceExpression($id);}
	;

methodReference_lfno_primary returns [MethodReferenceExpression e]
	:	n = expressionName '::' t = typeArguments? id = Identifier
        {$e = new MethodReferenceExpression($n, $id);}
	|	r = referenceType '::' t = typeArguments? id = Identifier
        {$e = new MethodReferenceExpression($r, $id);}
	|	'super' '::' t = typeArguments? id = Identifier
        {$e = new MethodReferenceExpression(Expression.SuperExpression, $id);}
	|	n = typeName '.' 'super' '::' t = typeArguments? id = Identifier
        {$e = new MethodReferenceExpression($n, $id);}
	|	c = classType '::' t = typeArguments? 'new'
        {$e = new MethodReferenceExpression($c);}
	|	a = arrayType '::' 'new'
        {$e = new MethodReferenceExpression($a);}
	;

arrayCreationExpression
	:	'new' primitiveType dimExprs dims?
	|	'new' classOrInterfaceType dimExprs dims?
	|	'new' primitiveType dims arrayInitializer
	|	'new' classOrInterfaceType dims arrayInitializer
	;

dimExprs
	:	dimExpr dimExpr*
	;

dimExpr
	:	annotation* '[' expression ']'
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
    [locals List<VariableDeclaration> vars = new ArrayList<>();]
	:	id = Identifier {$vars.add(new VariableDeclaration($id)); $l = $vars;}
	|	'(' p = formalParameterList? ')' {$l = $p;}
	|	'(' i = inferredFormalParameterList ')' {$l = $i;}
	;

inferredFormalParameterList returns [List<VariableDeclaration> l]
    [locals List<VariableDeclaration> vars = new ArrayList<>();]
	:	(id = Identifier {$vars.add(new VariableDeclaration($id));})
        (',' i = Identifier {$vars.add(new VariableDeclaration($i));})*
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
	|	a = fieldAccess {$e = $a;}
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
	|	c = conditionalOrExpression '?' i = expression ':' el = conditionalExpression
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
	|	l = relationalExpression 'instanceof' r = referenceType
        {$e = new BinaryExpression($l, BinaryOperator.INSTANCE_OF, $r);}
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
	|	l - multiplicativeExpression '%' r = unaryExpression
        {$e = new BinaryExpression($l, BinaryOperator.MODULUS, $r);}
	;

unaryExpression returns [UnaryExpression e]
	:	ex = preIncrementExpression {$e = $ex;}
	|	ex = preDecrementExpression {$e = $ex;}
	|	'+' ex = unaryExpression {$e = $ex;}
	|	'-' ex = unaryExpression
        {$e = new UnaryExpression($ex, UnaryOperator.NEGATION);}
	|	ex = unaryExpressionNotPlusMinus {$e = $ex;}
	;

preIncrementExpression returns [UnaryExpression e]
	:	'++' ex = unaryExpression
        {$e = new UnaryExpression($ex, UnaryOperator.PRE_INCREMENT);}
	;

preDecrementExpression returns [UnaryExpression e]
	:	'--' ex = unaryExpression
        {$e = new UnaryExpression($ex, UnaryOperator.PRE_DECREMENT);}
	;

unaryExpressionNotPlusMinus returns [Expression e]
	:	ex = postfixExpression {$e = $ex;}
	|	'~' ex = unaryExpression
        {$e = new UnaryExpression($ex, UnaryOperator.BITWISE_NEGATION);}
	|	'!' ex = unaryExpression
        {$e = new UnaryExpression($ex, UnaryOperator.NEGATIION);}
	|	ex = castExpression {$e = $ex;}
	;

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

castExpression returns [CastExpression e]
	:	'(' t = primitiveType ')' ex = unaryExpression
        {$e = new CastExpression($ex, $t);}
	|	'(' t = referenceType b = additionalBound* ')'
        ex = unaryExpressionNotPlusMinus
        {$e = new CastExpression($ex, $t);}
	|	'(' t = referenceType b = additionalBound* ')' ex = lambdaExpression
        {$e = new CastExpression($ex, $t);}
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

IntegerLiteral returns [LiteralExpression e]
	:	l = DecimalIntegerLiteral
        {$e = new LiteralExpression($l, PrimitiveType.INT);}
	|	l = HexIntegerLiteral
        {$e = new LiteralExpression($l, PrimitiveType.INT);}
	|	l = OctalIntegerLiteral
        {$e = new LiteralExpression($l, PrimitiveType.INT);}
	|	l = BinaryIntegerLiteral
        {$e = new LiteralExpression($l, PrimitiveType.INT);}
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

FloatingPointLiteral returns [LiteralExpression e]
	:	l = DecimalFloatingPointLiteral
         {$e = new LiteralExpression($l, PrimitiveType.DOUBLE);}
	|	l = HexadecimalFloatingPointLiteral
         {$e = new LiteralExpression($l, PrimitiveType.DOUBLE);}
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

BooleanLiteral returns [LiteralExpression e]
	:	'true' {$e = new LiteralExpression("true", PrimitiveType.BOOLEAN);}
	|	'false' {$e = new LiteralExpression("false", PrimitiveType.BOOLEAN);}
	;

// §3.10.4 Character Literals

CharacterLiteral returns [LiteralExpression e]
	:	'\'' c = SingleCharacter '\''
        {$e = new LiteralExpression($c, PrimitiveType.CHAR);}
	|	'\'' s = EscapeSequence '\''
        {$e = new LiteralExpression($s, PrimitiveType.CHAR);}
	;

fragment
SingleCharacter
	:	~['\\]
	;

// §3.10.5 String Literals

StringLiteral returns [LiteralExpression e]
	:	'"' c = StringCharacters? '"'
        {$e = new LiteralExpression($c, STRING);}
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

NullLiteral returns [LiteralExpression e]
	:	'null' {$e = LiteralExpression.NULL;}
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

Identifier returns [String s]
    [locals StringBuilder b = new StringBuilder();]
	:	(l = JavaLetter {$b.append($l);})
        (d =JavaLetterOrDigit {$b.append($d);})*
        {$s = $b.toString();}
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