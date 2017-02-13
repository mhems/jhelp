// Generated from Java8.g4 by ANTLR 4.6
package com.binghamton.jhelp.antlr;

    import java.util.ArrayList;
    import java.util.List;

    import com.binghamton.jhelp.*;
    import com.binghamton.jhelp.ast.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Java8Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, IntegerLiteral=51, FloatingPointLiteral=52, BooleanLiteral=53, 
		CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58, 
		LBRACE=59, RBRACE=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=74, GE=75, NOTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ARROW=89, COLONCOLON=90, 
		ADD_ASSIGN=91, SUB_ASSIGN=92, MUL_ASSIGN=93, DIV_ASSIGN=94, AND_ASSIGN=95, 
		OR_ASSIGN=96, XOR_ASSIGN=97, MOD_ASSIGN=98, LSHIFT_ASSIGN=99, RSHIFT_ASSIGN=100, 
		URSHIFT_ASSIGN=101, Identifier=102, AT=103, ELLIPSIS=104, WS=105, COMMENT=106, 
		LINE_COMMENT=107;
	public static final int
		RULE_literal = 0, RULE_type_ = 1, RULE_primitiveType = 2, RULE_numericType = 3, 
		RULE_integralType = 4, RULE_floatingPointType = 5, RULE_referenceType = 6, 
		RULE_classOrInterfaceType = 7, RULE_classType = 8, RULE_classType_lf_classOrInterfaceType = 9, 
		RULE_classType_lfno_classOrInterfaceType = 10, RULE_interfaceType = 11, 
		RULE_interfaceType_lf_classOrInterfaceType = 12, RULE_interfaceType_lfno_classOrInterfaceType = 13, 
		RULE_typeVariable = 14, RULE_arrayType = 15, RULE_dims = 16, RULE_typeParameter = 17, 
		RULE_typeParameterModifier = 18, RULE_typeBound = 19, RULE_additionalBound = 20, 
		RULE_typeArguments = 21, RULE_typeArgumentList = 22, RULE_typeArgument = 23, 
		RULE_wildcard = 24, RULE_wildcardBounds = 25, RULE_packageName = 26, RULE_typeName = 27, 
		RULE_packageOrTypeName = 28, RULE_expressionName = 29, RULE_methodName = 30, 
		RULE_ambiguousName = 31, RULE_compilationUnit = 32, RULE_packageDeclaration = 33, 
		RULE_packageModifier = 34, RULE_importDeclaration = 35, RULE_singleTypeImportDeclaration = 36, 
		RULE_typeImportOnDemandDeclaration = 37, RULE_singleStaticImportDeclaration = 38, 
		RULE_staticImportOnDemandDeclaration = 39, RULE_typeDeclaration = 40, 
		RULE_classDeclaration = 41, RULE_normalClassDeclaration = 42, RULE_classModifier = 43, 
		RULE_typeParameters = 44, RULE_typeParameterList = 45, RULE_superclass = 46, 
		RULE_superinterfaces = 47, RULE_interfaceTypeList = 48, RULE_classBody = 49, 
		RULE_classBodyDeclaration = 50, RULE_classMemberDeclaration = 51, RULE_fieldDeclaration = 52, 
		RULE_fieldModifier = 53, RULE_variableDeclaratorList = 54, RULE_variableDeclarator = 55, 
		RULE_variableDeclaratorId = 56, RULE_variableInitializer = 57, RULE_unannType = 58, 
		RULE_unannPrimitiveType = 59, RULE_unannReferenceType = 60, RULE_unannClassOrInterfaceType = 61, 
		RULE_unannClassType = 62, RULE_unannClassType_lf_unannClassOrInterfaceType = 63, 
		RULE_unannClassType_lfno_unannClassOrInterfaceType = 64, RULE_unannInterfaceType = 65, 
		RULE_unannInterfaceType_lf_unannClassOrInterfaceType = 66, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType = 67, 
		RULE_unannTypeVariable = 68, RULE_unannArrayType = 69, RULE_methodDeclaration = 70, 
		RULE_methodModifier = 71, RULE_methodHeader = 72, RULE_result = 73, RULE_methodDeclarator = 74, 
		RULE_formalParameterList = 75, RULE_formalParameters = 76, RULE_formalParameter = 77, 
		RULE_variableModifier = 78, RULE_lastFormalParameter = 79, RULE_receiverParameter = 80, 
		RULE_throws_ = 81, RULE_exceptionTypeList = 82, RULE_exceptionType = 83, 
		RULE_methodBody = 84, RULE_instanceInitializer = 85, RULE_staticInitializer = 86, 
		RULE_constructorDeclaration = 87, RULE_constructorModifier = 88, RULE_constructorDeclarator = 89, 
		RULE_simpleTypeName = 90, RULE_constructorBody = 91, RULE_explicitConstructorInvocation = 92, 
		RULE_enumDeclaration = 93, RULE_enumBody = 94, RULE_enumConstantList = 95, 
		RULE_enumConstant = 96, RULE_enumConstantModifier = 97, RULE_enumBodyDeclarations = 98, 
		RULE_interfaceDeclaration = 99, RULE_normalInterfaceDeclaration = 100, 
		RULE_interfaceModifier = 101, RULE_extendsInterfaces = 102, RULE_interfaceBody = 103, 
		RULE_interfaceMemberDeclaration = 104, RULE_constantDeclaration = 105, 
		RULE_constantModifier = 106, RULE_interfaceMethodDeclaration = 107, RULE_interfaceMethodModifier = 108, 
		RULE_annotationTypeDeclaration = 109, RULE_annotationTypeBody = 110, RULE_annotationTypeMemberDeclaration = 111, 
		RULE_annotationTypeElementDeclaration = 112, RULE_annotationTypeElementModifier = 113, 
		RULE_defaultValue = 114, RULE_annotation = 115, RULE_normalAnnotation = 116, 
		RULE_elementValuePairList = 117, RULE_elementValuePair = 118, RULE_elementValue = 119, 
		RULE_elementValueArrayInitializer = 120, RULE_elementValueList = 121, 
		RULE_markerAnnotation = 122, RULE_singleElementAnnotation = 123, RULE_arrayInitializer = 124, 
		RULE_variableInitializerList = 125, RULE_block = 126, RULE_blockStatements = 127, 
		RULE_blockStatement = 128, RULE_localVariableDeclarationStatement = 129, 
		RULE_localVariableDeclaration = 130, RULE_statement = 131, RULE_statementNoShortIf = 132, 
		RULE_statementWithoutTrailingSubstatement = 133, RULE_emptyStatement = 134, 
		RULE_labeledStatement = 135, RULE_labeledStatementNoShortIf = 136, RULE_expressionStatement = 137, 
		RULE_statementExpression = 138, RULE_ifThenStatement = 139, RULE_ifThenElseStatement = 140, 
		RULE_ifThenElseStatementNoShortIf = 141, RULE_assertStatement = 142, RULE_switchStatement = 143, 
		RULE_switchBlock = 144, RULE_switchBlockStatementGroup = 145, RULE_switchLabels = 146, 
		RULE_switchLabel = 147, RULE_enumConstantName = 148, RULE_whileStatement = 149, 
		RULE_whileStatementNoShortIf = 150, RULE_doStatement = 151, RULE_forStatement = 152, 
		RULE_forStatementNoShortIf = 153, RULE_basicForStatement = 154, RULE_basicForStatementNoShortIf = 155, 
		RULE_forInit = 156, RULE_forUpdate = 157, RULE_statementExpressionList = 158, 
		RULE_enhancedForStatement = 159, RULE_enhancedForStatementNoShortIf = 160, 
		RULE_breakStatement = 161, RULE_continueStatement = 162, RULE_returnStatement = 163, 
		RULE_throwStatement = 164, RULE_synchronizedStatement = 165, RULE_tryStatement = 166, 
		RULE_catches = 167, RULE_catchClause = 168, RULE_catchFormalParameter = 169, 
		RULE_catchType = 170, RULE_finally_ = 171, RULE_tryWithResourcesStatement = 172, 
		RULE_resourceSpecification = 173, RULE_resourceList = 174, RULE_resource = 175, 
		RULE_primary = 176, RULE_primaryNoNewArray = 177, RULE_primaryNoNewArray_typeAccess = 178, 
		RULE_primaryNoNewArray_lf_arrayAccess = 179, RULE_primaryNoNewArray_lfno_arrayAccess = 180, 
		RULE_primaryNoNewArray_lf_primary = 181, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 182, 
		RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 183, RULE_primaryNoNewArray_lfno_primary = 184, 
		RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 185, 
		RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 186, 
		RULE_classInstanceCreationExpression = 187, RULE_classInstanceCreationExpression_lf_primary = 188, 
		RULE_classInstanceCreationExpression_lfno_primary = 189, RULE_typeArgumentsOrDiamond = 190, 
		RULE_fieldAccess = 191, RULE_fieldAccess_lf_primary = 192, RULE_fieldAccess_lfno_primary = 193, 
		RULE_arrayAccess = 194, RULE_arrayAccess_lf_primary = 195, RULE_arrayAccess_lfno_primary = 196, 
		RULE_methodInvocation = 197, RULE_methodInvocation_lf_primary = 198, RULE_methodInvocation_lfno_primary = 199, 
		RULE_argumentList = 200, RULE_methodReference = 201, RULE_methodReference_lf_primary = 202, 
		RULE_methodReference_lfno_primary = 203, RULE_arrayCreationExpression = 204, 
		RULE_dimExprs = 205, RULE_dimExpr = 206, RULE_constantExpression = 207, 
		RULE_expression = 208, RULE_lambdaExpression = 209, RULE_lambdaParameters = 210, 
		RULE_inferredFormalParameterList = 211, RULE_lambdaBody = 212, RULE_assignmentExpression = 213, 
		RULE_assignment = 214, RULE_leftHandSide = 215, RULE_assignmentOperator = 216, 
		RULE_conditionalExpression = 217, RULE_conditionalOrExpression = 218, 
		RULE_conditionalAndExpression = 219, RULE_inclusiveOrExpression = 220, 
		RULE_exclusiveOrExpression = 221, RULE_andExpression = 222, RULE_equalityExpression = 223, 
		RULE_relationalExpression = 224, RULE_shiftExpression = 225, RULE_additiveExpression = 226, 
		RULE_multiplicativeExpression = 227, RULE_unaryExpression = 228, RULE_preIncrementExpression = 229, 
		RULE_preDecrementExpression = 230, RULE_unaryExpressionNotPlusMinus = 231, 
		RULE_postfixExpression = 232, RULE_postIncrementExpression = 233, RULE_postIncrementExpression_lf_postfixExpression = 234, 
		RULE_postDecrementExpression = 235, RULE_postDecrementExpression_lf_postfixExpression = 236, 
		RULE_castExpression = 237;
	public static final String[] ruleNames = {
		"literal", "type_", "primitiveType", "numericType", "integralType", "floatingPointType", 
		"referenceType", "classOrInterfaceType", "classType", "classType_lf_classOrInterfaceType", 
		"classType_lfno_classOrInterfaceType", "interfaceType", "interfaceType_lf_classOrInterfaceType", 
		"interfaceType_lfno_classOrInterfaceType", "typeVariable", "arrayType", 
		"dims", "typeParameter", "typeParameterModifier", "typeBound", "additionalBound", 
		"typeArguments", "typeArgumentList", "typeArgument", "wildcard", "wildcardBounds", 
		"packageName", "typeName", "packageOrTypeName", "expressionName", "methodName", 
		"ambiguousName", "compilationUnit", "packageDeclaration", "packageModifier", 
		"importDeclaration", "singleTypeImportDeclaration", "typeImportOnDemandDeclaration", 
		"singleStaticImportDeclaration", "staticImportOnDemandDeclaration", "typeDeclaration", 
		"classDeclaration", "normalClassDeclaration", "classModifier", "typeParameters", 
		"typeParameterList", "superclass", "superinterfaces", "interfaceTypeList", 
		"classBody", "classBodyDeclaration", "classMemberDeclaration", "fieldDeclaration", 
		"fieldModifier", "variableDeclaratorList", "variableDeclarator", "variableDeclaratorId", 
		"variableInitializer", "unannType", "unannPrimitiveType", "unannReferenceType", 
		"unannClassOrInterfaceType", "unannClassType", "unannClassType_lf_unannClassOrInterfaceType", 
		"unannClassType_lfno_unannClassOrInterfaceType", "unannInterfaceType", 
		"unannInterfaceType_lf_unannClassOrInterfaceType", "unannInterfaceType_lfno_unannClassOrInterfaceType", 
		"unannTypeVariable", "unannArrayType", "methodDeclaration", "methodModifier", 
		"methodHeader", "result", "methodDeclarator", "formalParameterList", "formalParameters", 
		"formalParameter", "variableModifier", "lastFormalParameter", "receiverParameter", 
		"throws_", "exceptionTypeList", "exceptionType", "methodBody", "instanceInitializer", 
		"staticInitializer", "constructorDeclaration", "constructorModifier", 
		"constructorDeclarator", "simpleTypeName", "constructorBody", "explicitConstructorInvocation", 
		"enumDeclaration", "enumBody", "enumConstantList", "enumConstant", "enumConstantModifier", 
		"enumBodyDeclarations", "interfaceDeclaration", "normalInterfaceDeclaration", 
		"interfaceModifier", "extendsInterfaces", "interfaceBody", "interfaceMemberDeclaration", 
		"constantDeclaration", "constantModifier", "interfaceMethodDeclaration", 
		"interfaceMethodModifier", "annotationTypeDeclaration", "annotationTypeBody", 
		"annotationTypeMemberDeclaration", "annotationTypeElementDeclaration", 
		"annotationTypeElementModifier", "defaultValue", "annotation", "normalAnnotation", 
		"elementValuePairList", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
		"elementValueList", "markerAnnotation", "singleElementAnnotation", "arrayInitializer", 
		"variableInitializerList", "block", "blockStatements", "blockStatement", 
		"localVariableDeclarationStatement", "localVariableDeclaration", "statement", 
		"statementNoShortIf", "statementWithoutTrailingSubstatement", "emptyStatement", 
		"labeledStatement", "labeledStatementNoShortIf", "expressionStatement", 
		"statementExpression", "ifThenStatement", "ifThenElseStatement", "ifThenElseStatementNoShortIf", 
		"assertStatement", "switchStatement", "switchBlock", "switchBlockStatementGroup", 
		"switchLabels", "switchLabel", "enumConstantName", "whileStatement", "whileStatementNoShortIf", 
		"doStatement", "forStatement", "forStatementNoShortIf", "basicForStatement", 
		"basicForStatementNoShortIf", "forInit", "forUpdate", "statementExpressionList", 
		"enhancedForStatement", "enhancedForStatementNoShortIf", "breakStatement", 
		"continueStatement", "returnStatement", "throwStatement", "synchronizedStatement", 
		"tryStatement", "catches", "catchClause", "catchFormalParameter", "catchType", 
		"finally_", "tryWithResourcesStatement", "resourceSpecification", "resourceList", 
		"resource", "primary", "primaryNoNewArray", "primaryNoNewArray_typeAccess", 
		"primaryNoNewArray_lf_arrayAccess", "primaryNoNewArray_lfno_arrayAccess", 
		"primaryNoNewArray_lf_primary", "primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary", 
		"primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary", "primaryNoNewArray_lfno_primary", 
		"primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary", "primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary", 
		"classInstanceCreationExpression", "classInstanceCreationExpression_lf_primary", 
		"classInstanceCreationExpression_lfno_primary", "typeArgumentsOrDiamond", 
		"fieldAccess", "fieldAccess_lf_primary", "fieldAccess_lfno_primary", "arrayAccess", 
		"arrayAccess_lf_primary", "arrayAccess_lfno_primary", "methodInvocation", 
		"methodInvocation_lf_primary", "methodInvocation_lfno_primary", "argumentList", 
		"methodReference", "methodReference_lf_primary", "methodReference_lfno_primary", 
		"arrayCreationExpression", "dimExprs", "dimExpr", "constantExpression", 
		"expression", "lambdaExpression", "lambdaParameters", "inferredFormalParameterList", 
		"lambdaBody", "assignmentExpression", "assignment", "leftHandSide", "assignmentOperator", 
		"conditionalExpression", "conditionalOrExpression", "conditionalAndExpression", 
		"inclusiveOrExpression", "exclusiveOrExpression", "andExpression", "equalityExpression", 
		"relationalExpression", "shiftExpression", "additiveExpression", "multiplicativeExpression", 
		"unaryExpression", "preIncrementExpression", "preDecrementExpression", 
		"unaryExpressionNotPlusMinus", "postfixExpression", "postIncrementExpression", 
		"postIncrementExpression_lf_postfixExpression", "postDecrementExpression", 
		"postDecrementExpression_lf_postfixExpression", "castExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", 
		"'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
		"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
		"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
		"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
		"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
		"'transient'", "'try'", "'void'", "'volatile'", "'while'", null, null, 
		null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
		"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
		"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'->'", "'::'", "'+='", 
		"'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", 
		"'>>>='", null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
		"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
		"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", 
		"IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
		"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", 
		"SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", 
		"TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", "FloatingPointLiteral", 
		"BooleanLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
		"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
		"DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", "COLONCOLON", "ADD_ASSIGN", 
		"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
		"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", 
		"AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Java8.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private String toName(MyPair<String, Integer> pair) {
	        String name = pair.first;
	        int num = pair.second;
	        if (num > 0) {
	            name += "[" + num + "]";
	        }
	        return name;
	    }

	public Java8Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LiteralContext extends ParserRuleContext {
		public LiteralExpression ret;
		public Token i;
		public Token f;
		public Token b;
		public Token c;
		public Token s;
		public TerminalNode IntegerLiteral() { return getToken(Java8Parser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(Java8Parser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(Java8Parser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(Java8Parser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(Java8Parser.StringLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(Java8Parser.NullLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		try {
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				((LiteralContext)_localctx).i = match(IntegerLiteral);
				((LiteralContext)_localctx).ret =  new LiteralExpression(((LiteralContext)_localctx).i.getText(), PrimitiveType.INT);
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				((LiteralContext)_localctx).f = match(FloatingPointLiteral);
				((LiteralContext)_localctx).ret =  new LiteralExpression(((LiteralContext)_localctx).f.getText(), PrimitiveType.FLOAT);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(480);
				((LiteralContext)_localctx).b = match(BooleanLiteral);
				((LiteralContext)_localctx).ret =  new LiteralExpression(((LiteralContext)_localctx).b.getText(), PrimitiveType.BOOLEAN);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(482);
				((LiteralContext)_localctx).c = match(CharacterLiteral);
				((LiteralContext)_localctx).ret =  new LiteralExpression(((LiteralContext)_localctx).c.getText(), PrimitiveType.CHAR);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(484);
				((LiteralContext)_localctx).s = match(StringLiteral);
				((LiteralContext)_localctx).ret =  new LiteralExpression(((LiteralContext)_localctx).s.getText(), null);
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(486);
				match(NullLiteral);
				((LiteralContext)_localctx).ret =  new NullLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_Context extends ParserRuleContext {
		public Type ret;
		public PrimitiveTypeContext p;
		public ReferenceTypeContext r;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitType_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_type_);
		try {
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				((Type_Context)_localctx).p = primitiveType();
				((Type_Context)_localctx).ret =  ((Type_Context)_localctx).p.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				((Type_Context)_localctx).r = referenceType();
				((Type_Context)_localctx).ret =  ((Type_Context)_localctx).r.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveType ret;
		public List<Annotation> anns = new ArrayList<>();;
		public AnnotationContext a;
		public NumericTypeContext n;
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_primitiveType);
		int _la;
		try {
			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(498);
					((PrimitiveTypeContext)_localctx).a = annotation();
					_localctx.anns.add(((PrimitiveTypeContext)_localctx).a.ret);
					}
					}
					setState(505);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(506);
				((PrimitiveTypeContext)_localctx).n = numericType();
				((PrimitiveTypeContext)_localctx).ret =  new PrimitiveType(((PrimitiveTypeContext)_localctx).n.ret, _localctx.anns);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(509);
					((PrimitiveTypeContext)_localctx).a = annotation();
					_localctx.anns.add(((PrimitiveTypeContext)_localctx).a.ret);
					}
					}
					setState(516);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(517);
				match(BOOLEAN);
				((PrimitiveTypeContext)_localctx).ret =  new PrimitiveType(PrimitiveType.Primitive.BOOLEAN, _localctx.anns);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericTypeContext extends ParserRuleContext {
		public PrimitiveType.Primitive ret;
		public IntegralTypeContext i;
		public FloatingPointTypeContext f;
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class,0);
		}
		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class,0);
		}
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNumericType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numericType);
		try {
			setState(527);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				((NumericTypeContext)_localctx).i = integralType();
				((NumericTypeContext)_localctx).ret =  ((NumericTypeContext)_localctx).i.ret;
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				((NumericTypeContext)_localctx).f = floatingPointType();
				((NumericTypeContext)_localctx).ret =  ((NumericTypeContext)_localctx).f.ret;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegralTypeContext extends ParserRuleContext {
		public PrimitiveType.Primitive ret;
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIntegralType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_integralType);
		try {
			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				match(BYTE);
				((IntegralTypeContext)_localctx).ret =  PrimitiveType.Primitive.BYTE;
				}
				break;
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				match(SHORT);
				((IntegralTypeContext)_localctx).ret =  PrimitiveType.Primitive.SHORT;
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(533);
				match(INT);
				((IntegralTypeContext)_localctx).ret =  PrimitiveType.Primitive.INT;
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 4);
				{
				setState(535);
				match(LONG);
				((IntegralTypeContext)_localctx).ret =  PrimitiveType.Primitive.LONG;
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(537);
				match(CHAR);
				((IntegralTypeContext)_localctx).ret =  PrimitiveType.Primitive.CHAR;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public PrimitiveType.Primitive ret;
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFloatingPointType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_floatingPointType);
		try {
			setState(545);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				match(FLOAT);
				((FloatingPointTypeContext)_localctx).ret =  PrimitiveType.Primitive.FLOAT;
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				match(DOUBLE);
				((FloatingPointTypeContext)_localctx).ret =  PrimitiveType.Primitive.DOUBLE;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ReferenceType ret;
		public ClassOrInterfaceTypeContext c;
		public TypeVariableContext v;
		public ArrayTypeContext a;
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_referenceType);
		try {
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				((ReferenceTypeContext)_localctx).c = classOrInterfaceType();
				((ReferenceTypeContext)_localctx).ret =  ((ReferenceTypeContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				((ReferenceTypeContext)_localctx).v = typeVariable();
				((ReferenceTypeContext)_localctx).ret =  ((ReferenceTypeContext)_localctx).v.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(553);
				((ReferenceTypeContext)_localctx).a = arrayType();
				((ReferenceTypeContext)_localctx).ret =  ((ReferenceTypeContext)_localctx).a.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public ClassInterfaceType ret;
		public ClassType_lfno_classOrInterfaceTypeContext cno;
		public InterfaceType_lfno_classOrInterfaceTypeContext ino;
		public ClassType_lf_classOrInterfaceTypeContext c;
		public InterfaceType_lf_classOrInterfaceTypeContext i;
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() {
			return getRuleContext(InterfaceType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public List<ClassType_lf_classOrInterfaceTypeContext> classType_lf_classOrInterfaceType() {
			return getRuleContexts(ClassType_lf_classOrInterfaceTypeContext.class);
		}
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType(int i) {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,i);
		}
		public List<InterfaceType_lf_classOrInterfaceTypeContext> interfaceType_lf_classOrInterfaceType() {
			return getRuleContexts(InterfaceType_lf_classOrInterfaceTypeContext.class);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType(int i) {
			return getRuleContext(InterfaceType_lf_classOrInterfaceTypeContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(558);
				((ClassOrInterfaceTypeContext)_localctx).cno = classType_lfno_classOrInterfaceType();
				((ClassOrInterfaceTypeContext)_localctx).ret =  ((ClassOrInterfaceTypeContext)_localctx).cno.ret;
				}
				break;
			case 2:
				{
				setState(561);
				((ClassOrInterfaceTypeContext)_localctx).ino = interfaceType_lfno_classOrInterfaceType();
				((ClassOrInterfaceTypeContext)_localctx).ret =  ((ClassOrInterfaceTypeContext)_localctx).ino.ret;
				}
				break;
			}
			setState(574);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(572);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(566);
						((ClassOrInterfaceTypeContext)_localctx).c = classType_lf_classOrInterfaceType();
						((ClassOrInterfaceTypeContext)_localctx).ret =  new ClassInterfaceType(_localctx.ret, ((ClassOrInterfaceTypeContext)_localctx).c.ret);
						}
						break;
					case 2:
						{
						setState(569);
						((ClassOrInterfaceTypeContext)_localctx).i = interfaceType_lf_classOrInterfaceType();
						((ClassOrInterfaceTypeContext)_localctx).ret =  new ClassInterfaceType(_localctx.ret, ((ClassOrInterfaceTypeContext)_localctx).i.ret);
						}
						break;
					}
					} 
				}
				setState(576);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public ClassInterfaceType ret;
		public List<Annotation> anns = new ArrayList<>();;
		public AnnotationContext a;
		public Token id;
		public TypeArgumentsContext targs;
		public ClassOrInterfaceTypeContext st;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classType);
		int _la;
		try {
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(577);
					((ClassTypeContext)_localctx).a = annotation();
					_localctx.anns.add(((ClassTypeContext)_localctx).a.ret);
					}
					}
					setState(584);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(585);
				((ClassTypeContext)_localctx).id = match(Identifier);
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(586);
					((ClassTypeContext)_localctx).targs = typeArguments();
					}
				}

				((ClassTypeContext)_localctx).ret =  new ClassInterfaceType(((ClassTypeContext)_localctx).id.getText(), _localctx.anns, ((ClassTypeContext)_localctx).targs.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				((ClassTypeContext)_localctx).st = classOrInterfaceType();
				setState(591);
				match(DOT);
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(592);
					((ClassTypeContext)_localctx).a = annotation();
					_localctx.anns.add(((ClassTypeContext)_localctx).a.ret);
					}
					}
					setState(599);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(600);
				((ClassTypeContext)_localctx).id = match(Identifier);
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(601);
					((ClassTypeContext)_localctx).targs = typeArguments();
					}
				}

				((ClassTypeContext)_localctx).ret =  new ClassInterfaceType(((ClassTypeContext)_localctx).id.getText(), _localctx.anns,
				                                       ((ClassTypeContext)_localctx).targs.ret, ((ClassTypeContext)_localctx).st.ret);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassInterfaceType ret;
		public List<Annotation> ans = new ArrayList<>();;
		public AnnotationContext a;
		public Token id;
		public TypeArgumentsContext targs;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lf_classOrInterfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassType_lf_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() throws RecognitionException {
		ClassType_lf_classOrInterfaceTypeContext _localctx = new ClassType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classType_lf_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(DOT);
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(609);
				((ClassType_lf_classOrInterfaceTypeContext)_localctx).a = annotation();
				_localctx.ans.add(((ClassType_lf_classOrInterfaceTypeContext)_localctx).a.ret);
				}
				}
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(617);
			((ClassType_lf_classOrInterfaceTypeContext)_localctx).id = match(Identifier);
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(618);
				((ClassType_lf_classOrInterfaceTypeContext)_localctx).targs = typeArguments();
				}
				break;
			}
			((ClassType_lf_classOrInterfaceTypeContext)_localctx).ret =  new ClassInterfaceType(((ClassType_lf_classOrInterfaceTypeContext)_localctx).id.getText(), _localctx.ans, ((ClassType_lf_classOrInterfaceTypeContext)_localctx).targs.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassInterfaceType ret;
		public List<Annotation> ans = new ArrayList<>();;
		public AnnotationContext a;
		public Token id;
		public TypeArgumentsContext targs;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lfno_classOrInterfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassType_lfno_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() throws RecognitionException {
		ClassType_lfno_classOrInterfaceTypeContext _localctx = new ClassType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classType_lfno_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(623);
				((ClassType_lfno_classOrInterfaceTypeContext)_localctx).a = annotation();
				_localctx.ans.add(((ClassType_lfno_classOrInterfaceTypeContext)_localctx).a.ret);
				}
				}
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(631);
			((ClassType_lfno_classOrInterfaceTypeContext)_localctx).id = match(Identifier);
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(632);
				((ClassType_lfno_classOrInterfaceTypeContext)_localctx).targs = typeArguments();
				}
				break;
			}
			((ClassType_lfno_classOrInterfaceTypeContext)_localctx).ret =  new ClassInterfaceType(((ClassType_lfno_classOrInterfaceTypeContext)_localctx).id.getText(), _localctx.ans, ((ClassType_lfno_classOrInterfaceTypeContext)_localctx).targs.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeContext extends ParserRuleContext {
		public ClassInterfaceType ret;
		public ClassTypeContext c;
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			((InterfaceTypeContext)_localctx).c = classType();
			((InterfaceTypeContext)_localctx).ret =  ((InterfaceTypeContext)_localctx).c.ret;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassInterfaceType ret;
		public ClassType_lf_classOrInterfaceTypeContext c;
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lf_classOrInterfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceType_lf_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lf_classOrInterfaceTypeContext _localctx = new InterfaceType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceType_lf_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			((InterfaceType_lf_classOrInterfaceTypeContext)_localctx).c = classType_lf_classOrInterfaceType();
			((InterfaceType_lf_classOrInterfaceTypeContext)_localctx).ret =  ((InterfaceType_lf_classOrInterfaceTypeContext)_localctx).c.ret;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassInterfaceType ret;
		public ClassType_lfno_classOrInterfaceTypeContext c;
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lfno_classOrInterfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceType_lfno_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lfno_classOrInterfaceTypeContext _localctx = new InterfaceType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_interfaceType_lfno_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			((InterfaceType_lfno_classOrInterfaceTypeContext)_localctx).c = classType_lfno_classOrInterfaceType();
			((InterfaceType_lfno_classOrInterfaceTypeContext)_localctx).ret =  ((InterfaceType_lfno_classOrInterfaceTypeContext)_localctx).c.ret;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVariableContext extends ParserRuleContext {
		public TypeVariable ret;
		public List<Annotation> ans = new ArrayList<>();;
		public AnnotationContext a;
		public Token id;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(646);
				((TypeVariableContext)_localctx).a = annotation();
				_localctx.ans.add(((TypeVariableContext)_localctx).a.ret);
				}
				}
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(654);
			((TypeVariableContext)_localctx).id = match(Identifier);
			((TypeVariableContext)_localctx).ret =  new TypeVariable(((TypeVariableContext)_localctx).id.getText(), _localctx.ans);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public ArrayType ret;
		public PrimitiveTypeContext p;
		public DimsContext d;
		public ClassOrInterfaceTypeContext c;
		public TypeVariableContext v;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayType);
		try {
			setState(669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(657);
				((ArrayTypeContext)_localctx).p = primitiveType();
				setState(658);
				((ArrayTypeContext)_localctx).d = dims();
				((ArrayTypeContext)_localctx).ret =  new ArrayType(((ArrayTypeContext)_localctx).p.ret, ((ArrayTypeContext)_localctx).d.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				((ArrayTypeContext)_localctx).c = classOrInterfaceType();
				setState(662);
				((ArrayTypeContext)_localctx).d = dims();
				((ArrayTypeContext)_localctx).ret =  new ArrayType(((ArrayTypeContext)_localctx).c.ret, ((ArrayTypeContext)_localctx).d.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(665);
				((ArrayTypeContext)_localctx).v = typeVariable();
				setState(666);
				((ArrayTypeContext)_localctx).d = dims();
				((ArrayTypeContext)_localctx).ret =  new ArrayType(((ArrayTypeContext)_localctx).v.ret, ((ArrayTypeContext)_localctx).d.ret);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimsContext extends ParserRuleContext {
		public int ret;
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDims(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dims);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(671);
				annotation();
				}
				}
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(677);
			match(LBRACK);
			setState(678);
			match(RBRACK);
			((DimsContext)_localctx).ret =  1;
			setState(691);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(683);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(680);
						annotation();
						}
						}
						setState(685);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(686);
					match(LBRACK);
					setState(687);
					match(RBRACK);
					++_localctx.ret;
					}
					} 
				}
				setState(693);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TypeParameter ret;
		public List<Annotation> ans = new ArrayList<>();;
		public TypeParameterModifierContext a;
		public Token id;
		public TypeBoundContext b;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<TypeParameterModifierContext> typeParameterModifier() {
			return getRuleContexts(TypeParameterModifierContext.class);
		}
		public TypeParameterModifierContext typeParameterModifier(int i) {
			return getRuleContext(TypeParameterModifierContext.class,i);
		}
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(694);
				((TypeParameterContext)_localctx).a = typeParameterModifier();
				_localctx.ans.add(((TypeParameterContext)_localctx).a.ret);
				}
				}
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(702);
			((TypeParameterContext)_localctx).id = match(Identifier);
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(703);
				((TypeParameterContext)_localctx).b = typeBound();
				}
			}

			((TypeParameterContext)_localctx).ret =  new TypeParameter(((TypeParameterContext)_localctx).id.getText(), _localctx.ans, ((TypeParameterContext)_localctx).b.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterModifierContext extends ParserRuleContext {
		public Annotation ret;
		public AnnotationContext a;
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TypeParameterModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeParameterModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterModifierContext typeParameterModifier() throws RecognitionException {
		TypeParameterModifierContext _localctx = new TypeParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			((TypeParameterModifierContext)_localctx).a = annotation();
			((TypeParameterModifierContext)_localctx).ret =  ((TypeParameterModifierContext)_localctx).a.ret;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public List<ReferenceType> ret;
		public List<ReferenceType> ls = new ArrayList<>();;
		public TypeVariableContext v;
		public ClassOrInterfaceTypeContext c;
		public AdditionalBoundContext a;
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeBound);
		int _la;
		try {
			setState(728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(711);
				match(EXTENDS);
				setState(712);
				((TypeBoundContext)_localctx).v = typeVariable();
				_localctx.ls.add(((TypeBoundContext)_localctx).v.ret); ((TypeBoundContext)_localctx).ret =  _localctx.ls;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
				match(EXTENDS);
				setState(716);
				((TypeBoundContext)_localctx).c = classOrInterfaceType();
				_localctx.ls.add(((TypeBoundContext)_localctx).c.ret);
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(718);
					((TypeBoundContext)_localctx).a = additionalBound();
					_localctx.ls.add(((TypeBoundContext)_localctx).a.ret);
					}
					}
					setState(725);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((TypeBoundContext)_localctx).ret =  _localctx.ls;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditionalBoundContext extends ParserRuleContext {
		public ClassInterfaceType ret;
		public InterfaceTypeContext i;
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public AdditionalBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalBound; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAdditionalBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionalBoundContext additionalBound() throws RecognitionException {
		AdditionalBoundContext _localctx = new AdditionalBoundContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_additionalBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			match(BITAND);
			setState(731);
			((AdditionalBoundContext)_localctx).i = interfaceType();
			((AdditionalBoundContext)_localctx).ret =  ((AdditionalBoundContext)_localctx).i.ret;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public List<TypeArgument> ret;
		public TypeArgumentListContext ls;
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(LT);
			setState(735);
			((TypeArgumentsContext)_localctx).ls = typeArgumentList();
			setState(736);
			match(GT);
			((TypeArgumentsContext)_localctx).ret =  ((TypeArgumentsContext)_localctx).ls.ret;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgument> ret;
		public List<TypeArgument> ls = new ArrayList<>();;
		public TypeArgumentContext a1;
		public TypeArgumentContext a;
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			((TypeArgumentListContext)_localctx).a1 = typeArgument();
			_localctx.ls.add(((TypeArgumentListContext)_localctx).a1.ret);
			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(741);
				match(COMMA);
				setState(742);
				((TypeArgumentListContext)_localctx).a = typeArgument();
				_localctx.ls.add(((TypeArgumentListContext)_localctx).a.ret);
				}
				}
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((TypeArgumentListContext)_localctx).ret =  _localctx.ls;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeArgument ret;
		public ReferenceTypeContext r;
		public WildcardContext w;
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeArgument);
		try {
			setState(758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				((TypeArgumentContext)_localctx).r = referenceType();
				((TypeArgumentContext)_localctx).ret =  new TypeArgument(((TypeArgumentContext)_localctx).r.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(755);
				((TypeArgumentContext)_localctx).w = wildcard();
				((TypeArgumentContext)_localctx).ret =  ((TypeArgumentContext)_localctx).w.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardContext extends ParserRuleContext {
		public TypeArgument ret;
		public List<Annotation> ans = new ArrayList<>();;
		public AnnotationContext a;
		public WildcardBoundsContext wildcardBounds() {
			return getRuleContext(WildcardBoundsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitWildcard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(760);
				((WildcardContext)_localctx).a = annotation();
				_localctx.ans.add(((WildcardContext)_localctx).a.ret);
				}
				}
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(768);
			match(QUESTION);
			((WildcardContext)_localctx).ret =  new TypeArgument(_localctx.ans);
			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(770);
				wildcardBounds(_localctx.ret);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardBoundsContext extends ParserRuleContext {
		public TypeArgument ret;
		public ReferenceTypeContext r;
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardBoundsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public WildcardBoundsContext(ParserRuleContext parent, int invokingState, TypeArgument ret) {
			super(parent, invokingState);
			this.ret = ret;
		}
		@Override public int getRuleIndex() { return RULE_wildcardBounds; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitWildcardBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardBoundsContext wildcardBounds(TypeArgument ret) throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState(), ret);
		enterRule(_localctx, 50, RULE_wildcardBounds);
		try {
			setState(781);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(773);
				match(EXTENDS);
				setState(774);
				((WildcardBoundsContext)_localctx).r = referenceType();
				_localctx.ret.setBoundType(((WildcardBoundsContext)_localctx).r.ret); _localctx.ret.setIsUpperBounded(true);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(777);
				match(SUPER);
				setState(778);
				((WildcardBoundsContext)_localctx).r = referenceType();
				_localctx.ret.setBoundType(((WildcardBoundsContext)_localctx).r.ret); _localctx.ret.setIsUpperBounded(false);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageNameContext extends ParserRuleContext {
		public String ret;
		public PackageNameContext p;
		public Token id;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPackageName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		return packageName(0);
	}

	private PackageNameContext packageName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageNameContext _localctx = new PackageNameContext(_ctx, _parentState);
		PackageNameContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_packageName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(784);
			((PackageNameContext)_localctx).id = match(Identifier);
			 ((PackageNameContext)_localctx).ret =  ((PackageNameContext)_localctx).id.getText(); 
			}
			_ctx.stop = _input.LT(-1);
			setState(793);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageNameContext(_parentctx, _parentState);
					_localctx.p = _prevctx;
					_localctx.p = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_packageName);
					setState(787);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(788);
					match(DOT);
					setState(789);
					((PackageNameContext)_localctx).id = match(Identifier);
					((PackageNameContext)_localctx).ret =  ((PackageNameContext)_localctx).p.ret + "." + ((PackageNameContext)_localctx).id.getText();
					}
					} 
				}
				setState(795);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public String ret;
		public Token id;
		public PackageOrTypeNameContext p;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeName);
		try {
			setState(803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(796);
				((TypeNameContext)_localctx).id = match(Identifier);
				 ((TypeNameContext)_localctx).ret =  ((TypeNameContext)_localctx).id.getText(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(798);
				((TypeNameContext)_localctx).p = packageOrTypeName(0);
				setState(799);
				match(DOT);
				setState(800);
				((TypeNameContext)_localctx).id = match(Identifier);
				 ((TypeNameContext)_localctx).ret =  ((TypeNameContext)_localctx).p.ret + "." + ((TypeNameContext)_localctx).id.getText(); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public String ret;
		public PackageOrTypeNameContext p;
		public Token id;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPackageOrTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		return packageOrTypeName(0);
	}

	private PackageOrTypeNameContext packageOrTypeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, _parentState);
		PackageOrTypeNameContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_packageOrTypeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(806);
			((PackageOrTypeNameContext)_localctx).id = match(Identifier);
			 ((PackageOrTypeNameContext)_localctx).ret =  ((PackageOrTypeNameContext)_localctx).id.getText(); 
			}
			_ctx.stop = _input.LT(-1);
			setState(815);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageOrTypeNameContext(_parentctx, _parentState);
					_localctx.p = _prevctx;
					_localctx.p = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_packageOrTypeName);
					setState(809);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(810);
					match(DOT);
					setState(811);
					((PackageOrTypeNameContext)_localctx).id = match(Identifier);
					 ((PackageOrTypeNameContext)_localctx).ret =  ((PackageOrTypeNameContext)_localctx).p.ret + "." + ((PackageOrTypeNameContext)_localctx).id.getText(); 
					}
					} 
				}
				setState(817);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionNameContext extends ParserRuleContext {
		public String ret;
		public Token id;
		public AmbiguousNameContext a;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExpressionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNameContext expressionName() throws RecognitionException {
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expressionName);
		try {
			setState(825);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(818);
				((ExpressionNameContext)_localctx).id = match(Identifier);
				 ((ExpressionNameContext)_localctx).ret =  ((ExpressionNameContext)_localctx).id.getText(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(820);
				((ExpressionNameContext)_localctx).a = ambiguousName(0);
				setState(821);
				match(DOT);
				setState(822);
				((ExpressionNameContext)_localctx).id = match(Identifier);
				 ((ExpressionNameContext)_localctx).ret =  ((ExpressionNameContext)_localctx).a.ret + "." + ((ExpressionNameContext)_localctx).id.getText(); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public String ret;
		public Token id;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			((MethodNameContext)_localctx).id = match(Identifier);
			 ((MethodNameContext)_localctx).ret =  ((MethodNameContext)_localctx).id.getText(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbiguousNameContext extends ParserRuleContext {
		public String ret;
		public AmbiguousNameContext a;
		public Token id;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public AmbiguousNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiguousName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAmbiguousName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmbiguousNameContext ambiguousName() throws RecognitionException {
		return ambiguousName(0);
	}

	private AmbiguousNameContext ambiguousName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx, _parentState);
		AmbiguousNameContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_ambiguousName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(831);
			((AmbiguousNameContext)_localctx).id = match(Identifier);
			 ((AmbiguousNameContext)_localctx).ret =  ((AmbiguousNameContext)_localctx).id.getText(); 
			}
			_ctx.stop = _input.LT(-1);
			setState(840);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AmbiguousNameContext(_parentctx, _parentState);
					_localctx.a = _prevctx;
					_localctx.a = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_ambiguousName);
					setState(834);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(835);
					match(DOT);
					setState(836);
					((AmbiguousNameContext)_localctx).id = match(Identifier);
					 ((AmbiguousNameContext)_localctx).ret =  ((AmbiguousNameContext)_localctx).a.ret + "." + ((AmbiguousNameContext)_localctx).id.getText(); 
					}
					} 
				}
				setState(842);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public CompilationUnit ret;
		public List<ImportStatement> imports = new ArrayList<>();
		public List<BodyDeclaration> bodies = new ArrayList<>();
		public PackageDeclarationContext p;
		public ImportDeclarationContext i;
		public TypeDeclarationContext t;
		public TerminalNode EOF() { return getToken(Java8Parser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(843);
				((CompilationUnitContext)_localctx).p = packageDeclaration();
				}
				break;
			}
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(846);
				((CompilationUnitContext)_localctx).i = importDeclaration();
				_localctx.imports.add(((CompilationUnitContext)_localctx).i.ret);
				}
				}
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==AT) {
				{
				{
				setState(854);
				((CompilationUnitContext)_localctx).t = typeDeclaration();
				_localctx.bodies.add(((CompilationUnitContext)_localctx).t.ret);
				}
				}
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(862);
			match(EOF);
			((CompilationUnitContext)_localctx).ret =  new CompilationUnit(((CompilationUnitContext)_localctx).p.ret, _localctx.imports, _localctx.bodies);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public PackageStatement ret;
		public List<Annotation> anns = new ArrayList<>();
		public List<String> ids = new ArrayList<>();
		public PackageModifierContext a;
		public Token id;
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public List<PackageModifierContext> packageModifier() {
			return getRuleContexts(PackageModifierContext.class);
		}
		public PackageModifierContext packageModifier(int i) {
			return getRuleContext(PackageModifierContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(865);
				((PackageDeclarationContext)_localctx).a = packageModifier();
				_localctx.anns.add(((PackageDeclarationContext)_localctx).a.ret);
				}
				}
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(873);
			match(PACKAGE);
			{
			setState(874);
			((PackageDeclarationContext)_localctx).id = match(Identifier);
			_localctx.ids.add(((PackageDeclarationContext)_localctx).id.getText());
			}
			setState(882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(877);
				match(DOT);
				setState(878);
				((PackageDeclarationContext)_localctx).id = match(Identifier);
				_localctx.ids.add(((PackageDeclarationContext)_localctx).id.getText());
				}
				}
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(885);
			match(SEMI);
			 ((PackageDeclarationContext)_localctx).ret =  new PackageStatement(_localctx.ids, _localctx.anns);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageModifierContext extends ParserRuleContext {
		public Annotation ret;
		public AnnotationContext an;
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public PackageModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPackageModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageModifierContext packageModifier() throws RecognitionException {
		PackageModifierContext _localctx = new PackageModifierContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_packageModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			((PackageModifierContext)_localctx).an = annotation();
			((PackageModifierContext)_localctx).ret =  ((PackageModifierContext)_localctx).an.ret;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public ImportStatement ret;
		public SingleTypeImportDeclarationContext s;
		public TypeImportOnDemandDeclarationContext t;
		public SingleStaticImportDeclarationContext ss;
		public StaticImportOnDemandDeclarationContext si;
		public SingleTypeImportDeclarationContext singleTypeImportDeclaration() {
			return getRuleContext(SingleTypeImportDeclarationContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() {
			return getRuleContext(TypeImportOnDemandDeclarationContext.class,0);
		}
		public SingleStaticImportDeclarationContext singleStaticImportDeclaration() {
			return getRuleContext(SingleStaticImportDeclarationContext.class,0);
		}
		public StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() {
			return getRuleContext(StaticImportOnDemandDeclarationContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_importDeclaration);
		try {
			setState(903);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(891);
				((ImportDeclarationContext)_localctx).s = singleTypeImportDeclaration();
				((ImportDeclarationContext)_localctx).ret =  ((ImportDeclarationContext)_localctx).s.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(894);
				((ImportDeclarationContext)_localctx).t = typeImportOnDemandDeclaration();
				((ImportDeclarationContext)_localctx).ret =  ((ImportDeclarationContext)_localctx).t.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(897);
				((ImportDeclarationContext)_localctx).ss = singleStaticImportDeclaration();
				((ImportDeclarationContext)_localctx).ret =  ((ImportDeclarationContext)_localctx).ss.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(900);
				((ImportDeclarationContext)_localctx).si = staticImportOnDemandDeclaration();
				((ImportDeclarationContext)_localctx).ret =  ((ImportDeclarationContext)_localctx).si.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTypeImportDeclarationContext extends ParserRuleContext {
		public ImportStatement ret;
		public TypeNameContext t;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public SingleTypeImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTypeImportDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSingleTypeImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTypeImportDeclarationContext singleTypeImportDeclaration() throws RecognitionException {
		SingleTypeImportDeclarationContext _localctx = new SingleTypeImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_singleTypeImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			match(IMPORT);
			setState(906);
			((SingleTypeImportDeclarationContext)_localctx).t = typeName();
			setState(907);
			match(SEMI);
			 ((SingleTypeImportDeclarationContext)_localctx).ret =  new ImportStatement(((SingleTypeImportDeclarationContext)_localctx).t.ret, false, false); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeImportOnDemandDeclarationContext extends ParserRuleContext {
		public ImportStatement ret;
		public PackageOrTypeNameContext p;
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeImportOnDemandDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeImportOnDemandDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() throws RecognitionException {
		TypeImportOnDemandDeclarationContext _localctx = new TypeImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_typeImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			match(IMPORT);
			setState(911);
			((TypeImportOnDemandDeclarationContext)_localctx).p = packageOrTypeName(0);
			setState(912);
			match(DOT);
			setState(913);
			match(MUL);
			setState(914);
			match(SEMI);
			((TypeImportOnDemandDeclarationContext)_localctx).ret =  new ImportStatement(((TypeImportOnDemandDeclarationContext)_localctx).p.ret, false, true);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleStaticImportDeclarationContext extends ParserRuleContext {
		public ImportStatement ret;
		public TypeNameContext t;
		public Token id;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public SingleStaticImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStaticImportDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSingleStaticImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStaticImportDeclarationContext singleStaticImportDeclaration() throws RecognitionException {
		SingleStaticImportDeclarationContext _localctx = new SingleStaticImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_singleStaticImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			match(IMPORT);
			setState(918);
			match(STATIC);
			setState(919);
			((SingleStaticImportDeclarationContext)_localctx).t = typeName();
			setState(920);
			match(DOT);
			setState(921);
			((SingleStaticImportDeclarationContext)_localctx).id = match(Identifier);
			setState(922);
			match(SEMI);
			((SingleStaticImportDeclarationContext)_localctx).ret =  new ImportStatement(((SingleStaticImportDeclarationContext)_localctx).t.ret + '.' + ((SingleStaticImportDeclarationContext)_localctx).id.getText(), true, false);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticImportOnDemandDeclarationContext extends ParserRuleContext {
		public ImportStatement ret;
		public TypeNameContext t;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StaticImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticImportOnDemandDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStaticImportOnDemandDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() throws RecognitionException {
		StaticImportOnDemandDeclarationContext _localctx = new StaticImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_staticImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			match(IMPORT);
			setState(926);
			match(STATIC);
			setState(927);
			((StaticImportOnDemandDeclarationContext)_localctx).t = typeName();
			setState(928);
			match(DOT);
			setState(929);
			match(MUL);
			setState(930);
			match(SEMI);
			((StaticImportOnDemandDeclarationContext)_localctx).ret =  new ImportStatement(((StaticImportOnDemandDeclarationContext)_localctx).t.ret, true, true);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public BodyDeclaration ret;
		public ClassDeclarationContext c;
		public InterfaceDeclarationContext i;
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typeDeclaration);
		try {
			setState(940);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(933);
				((TypeDeclarationContext)_localctx).c = classDeclaration();
				((TypeDeclarationContext)_localctx).ret =  ((TypeDeclarationContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(936);
				((TypeDeclarationContext)_localctx).i = interfaceDeclaration();
				((TypeDeclarationContext)_localctx).ret =  ((TypeDeclarationContext)_localctx).i.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(939);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ConcreteBodyDeclaration ret;
		public NormalClassDeclarationContext n;
		public EnumDeclarationContext e;
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_classDeclaration);
		try {
			setState(948);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(942);
				((ClassDeclarationContext)_localctx).n = normalClassDeclaration();
				((ClassDeclarationContext)_localctx).ret =  ((ClassDeclarationContext)_localctx).n.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(945);
				((ClassDeclarationContext)_localctx).e = enumDeclaration();
				((ClassDeclarationContext)_localctx).ret =  ((ClassDeclarationContext)_localctx).e.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public ClassDeclaration ret;
		public List<Modifier> mods = new ArrayList<>();;
		public ClassModifierContext m;
		public Token n;
		public TypeParametersContext p;
		public SuperclassContext sc;
		public SuperinterfacesContext si;
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNormalClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(950);
				((NormalClassDeclarationContext)_localctx).m = classModifier();
				_localctx.mods.add(((NormalClassDeclarationContext)_localctx).m.ret);
				}
				}
				setState(957);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(958);
			match(CLASS);
			setState(959);
			((NormalClassDeclarationContext)_localctx).n = match(Identifier);
			setState(961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(960);
				((NormalClassDeclarationContext)_localctx).p = typeParameters();
				}
			}

			setState(964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(963);
				((NormalClassDeclarationContext)_localctx).sc = superclass();
				}
			}

			setState(967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(966);
				((NormalClassDeclarationContext)_localctx).si = superinterfaces();
				}
			}

			((NormalClassDeclarationContext)_localctx).ret =  new ClassDeclaration(((NormalClassDeclarationContext)_localctx).n.getText(), _localctx.mods, ((NormalClassDeclarationContext)_localctx).si.ret,
			                ((NormalClassDeclarationContext)_localctx).p.ret, ((NormalClassDeclarationContext)_localctx).sc.ret);
			setState(970);
			classBody(_localctx.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassModifierContext extends ParserRuleContext {
		public Modifier ret;
		public AnnotationContext a;
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_classModifier);
		try {
			setState(989);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(972);
				((ClassModifierContext)_localctx).a = annotation();
				((ClassModifierContext)_localctx).ret =  ((ClassModifierContext)_localctx).a.ret;
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(975);
				match(PUBLIC);
				((ClassModifierContext)_localctx).ret =  Modifier.PUBLIC;
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(977);
				match(PROTECTED);
				((ClassModifierContext)_localctx).ret =  Modifier.PROTECTED;
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(979);
				match(PRIVATE);
				((ClassModifierContext)_localctx).ret =  Modifier.PRIVATE;
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(981);
				match(ABSTRACT);
				((ClassModifierContext)_localctx).ret =  Modifier.ABSTRACT;
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(983);
				match(STATIC);
				((ClassModifierContext)_localctx).ret =  Modifier.STATIC;
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(985);
				match(FINAL);
				((ClassModifierContext)_localctx).ret =  Modifier.FINAL;
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(987);
				match(STRICTFP);
				((ClassModifierContext)_localctx).ret =  Modifier.STRICT_FP;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameter> ret;
		public TypeParameterListContext t;
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991);
			match(LT);
			setState(992);
			((TypeParametersContext)_localctx).t = typeParameterList();
			setState(993);
			match(GT);
			((TypeParametersContext)_localctx).ret =  ((TypeParametersContext)_localctx).t.ret;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameter> ret;
		public List<TypeParameter> ls = new ArrayList<>();;
		public TypeParameterContext t1;
		public TypeParameterContext t;
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(996);
			((TypeParameterListContext)_localctx).t1 = typeParameter();
			_localctx.ls.add(((TypeParameterListContext)_localctx).t1.ret);
			}
			setState(1005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(999);
				match(COMMA);
				setState(1000);
				((TypeParameterListContext)_localctx).t = typeParameter();
				_localctx.ls.add(((TypeParameterListContext)_localctx).t.ret);
				}
				}
				setState(1007);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((TypeParameterListContext)_localctx).ret =  _localctx.ls;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassContext extends ParserRuleContext {
		public ClassInterfaceType ret;
		public ClassTypeContext c;
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSuperclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			match(EXTENDS);
			setState(1011);
			((SuperclassContext)_localctx).c = classType();
			((SuperclassContext)_localctx).ret =  ((SuperclassContext)_localctx).c.ret;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperinterfacesContext extends ParserRuleContext {
		public List<ClassInterfaceType> ret;
		public InterfaceTypeListContext i;
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public SuperinterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superinterfaces; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSuperinterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperinterfacesContext superinterfaces() throws RecognitionException {
		SuperinterfacesContext _localctx = new SuperinterfacesContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_superinterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			match(IMPLEMENTS);
			setState(1015);
			((SuperinterfacesContext)_localctx).i = interfaceTypeList();
			((SuperinterfacesContext)_localctx).ret =  ((SuperinterfacesContext)_localctx).i.ret;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeListContext extends ParserRuleContext {
		public List<ClassInterfaceType> ret;
		public List<ClassInterfaceType> ls = new ArrayList<>();;
		public InterfaceTypeContext i1;
		public InterfaceTypeContext i;
		public List<InterfaceTypeContext> interfaceType() {
			return getRuleContexts(InterfaceTypeContext.class);
		}
		public InterfaceTypeContext interfaceType(int i) {
			return getRuleContext(InterfaceTypeContext.class,i);
		}
		public InterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceTypeList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeListContext interfaceTypeList() throws RecognitionException {
		InterfaceTypeListContext _localctx = new InterfaceTypeListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_interfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1018);
			((InterfaceTypeListContext)_localctx).i1 = interfaceType();
			_localctx.ls.add(((InterfaceTypeListContext)_localctx).i1.ret);
			}
			setState(1027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1021);
				match(COMMA);
				setState(1022);
				((InterfaceTypeListContext)_localctx).i = interfaceType();
				_localctx.ls.add(((InterfaceTypeListContext)_localctx).i.ret);
				}
				}
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((InterfaceTypeListContext)_localctx).ret =  _localctx.ls;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public ConcreteBodyDeclaration ret;
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ClassBodyContext(ParserRuleContext parent, int invokingState, ConcreteBodyDeclaration ret) {
			super(parent, invokingState);
			this.ret = ret;
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody(ConcreteBodyDeclaration ret) throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState(), ret);
		enterRule(_localctx, 98, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			match(LBRACE);
			setState(1036);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(1033);
				classBodyDeclaration(_localctx.ret);
				}
				}
				setState(1038);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1039);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ConcreteBodyDeclaration ret;
		public InstanceInitializerContext i;
		public StaticInitializerContext s;
		public ConstructorDeclarationContext ct;
		public ClassMemberDeclarationContext classMemberDeclaration() {
			return getRuleContext(ClassMemberDeclarationContext.class,0);
		}
		public InstanceInitializerContext instanceInitializer() {
			return getRuleContext(InstanceInitializerContext.class,0);
		}
		public StaticInitializerContext staticInitializer() {
			return getRuleContext(StaticInitializerContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState, ConcreteBodyDeclaration ret) {
			super(parent, invokingState);
			this.ret = ret;
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration(ConcreteBodyDeclaration ret) throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState(), ret);
		enterRule(_localctx, 100, RULE_classBodyDeclaration);
		try {
			setState(1051);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1041);
				classMemberDeclaration(_localctx.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1042);
				((ClassBodyDeclarationContext)_localctx).i = instanceInitializer();
				_localctx.ret.addInstanceInitializer(((ClassBodyDeclarationContext)_localctx).i.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1045);
				((ClassBodyDeclarationContext)_localctx).s = staticInitializer();
				_localctx.ret.addStaticInitializer(((ClassBodyDeclarationContext)_localctx).s.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1048);
				((ClassBodyDeclarationContext)_localctx).ct = constructorDeclaration();
				_localctx.ret.addConstructor(((ClassBodyDeclarationContext)_localctx).ct.ret);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public ConcreteBodyDeclaration ret;
		public FieldDeclarationContext f;
		public MethodDeclarationContext m;
		public ClassDeclarationContext c;
		public InterfaceDeclarationContext i;
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState, ConcreteBodyDeclaration ret) {
			super(parent, invokingState);
			this.ret = ret;
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration(ConcreteBodyDeclaration ret) throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState(), ret);
		enterRule(_localctx, 102, RULE_classMemberDeclaration);
		try {
			setState(1066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1053);
				((ClassMemberDeclarationContext)_localctx).f = fieldDeclaration();
				_localctx.ret.addField(((ClassMemberDeclarationContext)_localctx).f.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1056);
				((ClassMemberDeclarationContext)_localctx).m = methodDeclaration();
				_localctx.ret.addMethod(((ClassMemberDeclarationContext)_localctx).m.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1059);
				((ClassMemberDeclarationContext)_localctx).c = classDeclaration();
				_localctx.ret.addInnerBody(((ClassMemberDeclarationContext)_localctx).c.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1062);
				((ClassMemberDeclarationContext)_localctx).i = interfaceDeclaration();
				_localctx.ret.addInnerInterface(((ClassMemberDeclarationContext)_localctx).i.ret);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1065);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public VariableDeclaration ret;
		public List<Modifier> mods = new ArrayList<>();;
		public FieldModifierContext m;
		public UnannTypeContext t;
		public VariableDeclaratorListContext l;
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				{
				setState(1068);
				((FieldDeclarationContext)_localctx).m = fieldModifier();
				_localctx.mods.add(((FieldDeclarationContext)_localctx).m.ret);
				}
				}
				setState(1075);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1076);
			((FieldDeclarationContext)_localctx).t = unannType();
			setState(1077);
			((FieldDeclarationContext)_localctx).l = variableDeclaratorList();
			setState(1078);
			match(SEMI);
			((FieldDeclarationContext)_localctx).ret =  new VariableDeclaration(((FieldDeclarationContext)_localctx).l.ret, ((FieldDeclarationContext)_localctx).t.ret, _localctx.mods);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldModifierContext extends ParserRuleContext {
		public Modifier ret;
		public AnnotationContext a;
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_fieldModifier);
		try {
			setState(1098);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1081);
				((FieldModifierContext)_localctx).a = annotation();
				((FieldModifierContext)_localctx).ret =  ((FieldModifierContext)_localctx).a.ret;
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1084);
				match(PUBLIC);
				((FieldModifierContext)_localctx).ret =  Modifier.PUBLIC;
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1086);
				match(PROTECTED);
				((FieldModifierContext)_localctx).ret =  Modifier.PROTECTED;
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1088);
				match(PRIVATE);
				((FieldModifierContext)_localctx).ret =  Modifier.PRIVATE;
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1090);
				match(STATIC);
				((FieldModifierContext)_localctx).ret =  Modifier.STATIC;
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1092);
				match(FINAL);
				((FieldModifierContext)_localctx).ret =  Modifier.FINAL;
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(1094);
				match(TRANSIENT);
				((FieldModifierContext)_localctx).ret =  Modifier.TRANSIENT;
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1096);
				match(VOLATILE);
				((FieldModifierContext)_localctx).ret =  Modifier.VOLATILE;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public List<MyPair<String, Expression>> ret;
		public List<MyPair<String, Expression>> ls = new ArrayList<>();;
		public VariableDeclaratorContext d1;
		public VariableDeclaratorContext d;
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1100);
			((VariableDeclaratorListContext)_localctx).d1 = variableDeclarator();
			_localctx.ls.add(((VariableDeclaratorListContext)_localctx).d1.ret);
			}
			setState(1109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1103);
				match(COMMA);
				setState(1104);
				((VariableDeclaratorListContext)_localctx).d = variableDeclarator();
				_localctx.ls.add(((VariableDeclaratorListContext)_localctx).d.ret);
				}
				}
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((VariableDeclaratorListContext)_localctx).ret =  _localctx.ls;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public MyPair<String, Expression> ret;
		public VariableDeclaratorIdContext id;
		public VariableInitializerContext in;
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			((VariableDeclaratorContext)_localctx).id = variableDeclaratorId();
			setState(1117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1115);
				match(ASSIGN);
				setState(1116);
				((VariableDeclaratorContext)_localctx).in = variableInitializer();
				}
			}

			((VariableDeclaratorContext)_localctx).ret =  new MyPair<>(toName(((VariableDeclaratorContext)_localctx).id.ret), ((VariableDeclaratorContext)_localctx).in.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public MyPair<String, Integer> ret;
		public Token id;
		public DimsContext d;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121);
			((VariableDeclaratorIdContext)_localctx).id = match(Identifier);
			setState(1123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1122);
				((VariableDeclaratorIdContext)_localctx).d = dims();
				}
			}

			((VariableDeclaratorIdContext)_localctx).ret =  new MyPair<>(((VariableDeclaratorIdContext)_localctx).id.getText(), ((VariableDeclaratorIdContext)_localctx).d.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public Expression ret;
		public ExpressionContext ex;
		public ArrayInitializerContext a;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_variableInitializer);
		try {
			setState(1133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1127);
				((VariableInitializerContext)_localctx).ex = expression();
				((VariableInitializerContext)_localctx).ret =  ((VariableInitializerContext)_localctx).ex.ret;
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1130);
				((VariableInitializerContext)_localctx).a = arrayInitializer();
				((VariableInitializerContext)_localctx).ret =  ((VariableInitializerContext)_localctx).a.ret;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeContext extends ParserRuleContext {
		public Type ret;
		public UnannPrimitiveTypeContext p;
		public UnannReferenceTypeContext r;
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public UnannReferenceTypeContext unannReferenceType() {
			return getRuleContext(UnannReferenceTypeContext.class,0);
		}
		public UnannTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannTypeContext unannType() throws RecognitionException {
		UnannTypeContext _localctx = new UnannTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_unannType);
		try {
			setState(1141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1135);
				((UnannTypeContext)_localctx).p = unannPrimitiveType();
				((UnannTypeContext)_localctx).ret =  ((UnannTypeContext)_localctx).p.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1138);
				((UnannTypeContext)_localctx).r = unannReferenceType();
				((UnannTypeContext)_localctx).ret =  ((UnannTypeContext)_localctx).r.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannPrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveType ret;
		public NumericTypeContext n;
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public UnannPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannPrimitiveType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannPrimitiveTypeContext unannPrimitiveType() throws RecognitionException {
		UnannPrimitiveTypeContext _localctx = new UnannPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_unannPrimitiveType);
		try {
			setState(1148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1143);
				((UnannPrimitiveTypeContext)_localctx).n = numericType();
				((UnannPrimitiveTypeContext)_localctx).ret =  new PrimitiveType(((UnannPrimitiveTypeContext)_localctx).n.ret);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1146);
				match(BOOLEAN);
				((UnannPrimitiveTypeContext)_localctx).ret =  PrimitiveType.BOOLEAN;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannReferenceTypeContext extends ParserRuleContext {
		public ReferenceType ret;
		public UnannClassOrInterfaceTypeContext c;
		public UnannTypeVariableContext v;
		public UnannArrayTypeContext a;
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext unannArrayType() {
			return getRuleContext(UnannArrayTypeContext.class,0);
		}
		public UnannReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannReferenceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannReferenceTypeContext unannReferenceType() throws RecognitionException {
		UnannReferenceTypeContext _localctx = new UnannReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_unannReferenceType);
		try {
			setState(1159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1150);
				((UnannReferenceTypeContext)_localctx).c = unannClassOrInterfaceType();
				((UnannReferenceTypeContext)_localctx).ret =  ((UnannReferenceTypeContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1153);
				((UnannReferenceTypeContext)_localctx).v = unannTypeVariable();
				((UnannReferenceTypeContext)_localctx).ret =  ((UnannReferenceTypeContext)_localctx).v.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1156);
				((UnannReferenceTypeContext)_localctx).a = unannArrayType();
				((UnannReferenceTypeContext)_localctx).ret =  ((UnannReferenceTypeContext)_localctx).a.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassOrInterfaceTypeContext extends ParserRuleContext {
		public ClassInterfaceType ret;
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext cno;
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ino;
		public UnannClassType_lf_unannClassOrInterfaceTypeContext c;
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext i;
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public List<UnannClassType_lf_unannClassOrInterfaceTypeContext> unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannClassType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public List<UnannInterfaceType_lf_unannClassOrInterfaceTypeContext> unannInterfaceType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public UnannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassOrInterfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() throws RecognitionException {
		UnannClassOrInterfaceTypeContext _localctx = new UnannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_unannClassOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(1161);
				((UnannClassOrInterfaceTypeContext)_localctx).cno = unannClassType_lfno_unannClassOrInterfaceType();
				((UnannClassOrInterfaceTypeContext)_localctx).ret =  ((UnannClassOrInterfaceTypeContext)_localctx).cno.ret;
				}
				break;
			case 2:
				{
				setState(1164);
				((UnannClassOrInterfaceTypeContext)_localctx).ino = unannInterfaceType_lfno_unannClassOrInterfaceType();
				((UnannClassOrInterfaceTypeContext)_localctx).ret =  ((UnannClassOrInterfaceTypeContext)_localctx).ino.ret;
				}
				break;
			}
			setState(1177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1175);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
					case 1:
						{
						setState(1169);
						((UnannClassOrInterfaceTypeContext)_localctx).c = unannClassType_lf_unannClassOrInterfaceType();
						((UnannClassOrInterfaceTypeContext)_localctx).ret =  new ClassInterfaceType(_localctx.ret, ((UnannClassOrInterfaceTypeContext)_localctx).c.ret);
						}
						break;
					case 2:
						{
						setState(1172);
						((UnannClassOrInterfaceTypeContext)_localctx).i = unannInterfaceType_lf_unannClassOrInterfaceType();
						((UnannClassOrInterfaceTypeContext)_localctx).ret =  new ClassInterfaceType(_localctx.ret, ((UnannClassOrInterfaceTypeContext)_localctx).i.ret);
						}
						break;
					}
					} 
				}
				setState(1179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassTypeContext extends ParserRuleContext {
		public ClassInterfaceType ret;
		public List<Annotation> ans = new ArrayList<>();;
		public Token id;
		public TypeArgumentsContext ta;
		public UnannClassOrInterfaceTypeContext ci;
		public AnnotationContext a;
		public Token id2;
		public TypeArgumentsContext ta2;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public UnannClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassTypeContext unannClassType() throws RecognitionException {
		UnannClassTypeContext _localctx = new UnannClassTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_unannClassType);
		int _la;
		try {
			setState(1201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1180);
				((UnannClassTypeContext)_localctx).id = match(Identifier);
				setState(1182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1181);
					((UnannClassTypeContext)_localctx).ta = typeArguments();
					}
				}

				((UnannClassTypeContext)_localctx).ret =  new ClassInterfaceType(((UnannClassTypeContext)_localctx).id.getText(), null, ((UnannClassTypeContext)_localctx).ta.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1185);
				((UnannClassTypeContext)_localctx).ci = unannClassOrInterfaceType();
				setState(1186);
				match(DOT);
				setState(1192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1187);
					((UnannClassTypeContext)_localctx).a = annotation();
					_localctx.ans.add(((UnannClassTypeContext)_localctx).a.ret);
					}
					}
					setState(1194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1195);
				((UnannClassTypeContext)_localctx).id2 = match(Identifier);
				setState(1197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1196);
					((UnannClassTypeContext)_localctx).ta2 = typeArguments();
					}
				}

				((UnannClassTypeContext)_localctx).ret =  new ClassInterfaceType(((UnannClassTypeContext)_localctx).id2.getText(), _localctx.ans,
				                                       ((UnannClassTypeContext)_localctx).ta2.ret, ((UnannClassTypeContext)_localctx).ci.ret);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public ClassInterfaceType ret;
		public List<Annotation> ans = new ArrayList<>();;
		public AnnotationContext a;
		public Token id;
		public TypeArgumentsContext ta;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lf_unannClassOrInterfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannClassType_lf_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_unannClassType_lf_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			match(DOT);
			setState(1209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1204);
				((UnannClassType_lf_unannClassOrInterfaceTypeContext)_localctx).a = annotation();
				_localctx.ans.add(((UnannClassType_lf_unannClassOrInterfaceTypeContext)_localctx).a.ret);
				}
				}
				setState(1211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1212);
			((UnannClassType_lf_unannClassOrInterfaceTypeContext)_localctx).id = match(Identifier);
			setState(1214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1213);
				((UnannClassType_lf_unannClassOrInterfaceTypeContext)_localctx).ta = typeArguments();
				}
			}

			((UnannClassType_lf_unannClassOrInterfaceTypeContext)_localctx).ret =  new ClassInterfaceType(((UnannClassType_lf_unannClassOrInterfaceTypeContext)_localctx).id.getText(), _localctx.ans, ((UnannClassType_lf_unannClassOrInterfaceTypeContext)_localctx).ta.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public ClassInterfaceType ret;
		public Token id;
		public TypeArgumentsContext ta;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lfno_unannClassOrInterfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannClassType_lfno_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_unannClassType_lfno_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218);
			((UnannClassType_lfno_unannClassOrInterfaceTypeContext)_localctx).id = match(Identifier);
			setState(1220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1219);
				((UnannClassType_lfno_unannClassOrInterfaceTypeContext)_localctx).ta = typeArguments();
				}
			}

			((UnannClassType_lfno_unannClassOrInterfaceTypeContext)_localctx).ret =  new ClassInterfaceType(((UnannClassType_lfno_unannClassOrInterfaceTypeContext)_localctx).id.getText(), null, ((UnannClassType_lfno_unannClassOrInterfaceTypeContext)_localctx).ta.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceTypeContext extends ParserRuleContext {
		public ClassInterfaceType ret;
		public UnannClassTypeContext c;
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public UnannInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceTypeContext unannInterfaceType() throws RecognitionException {
		UnannInterfaceTypeContext _localctx = new UnannInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_unannInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1224);
			((UnannInterfaceTypeContext)_localctx).c = unannClassType();
			((UnannInterfaceTypeContext)_localctx).ret =  ((UnannInterfaceTypeContext)_localctx).c.ret;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public ClassInterfaceType ret;
		public UnannClassType_lf_unannClassOrInterfaceTypeContext ci;
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lf_unannClassOrInterfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_unannInterfaceType_lf_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
			((UnannInterfaceType_lf_unannClassOrInterfaceTypeContext)_localctx).ci = unannClassType_lf_unannClassOrInterfaceType();
			((UnannInterfaceType_lf_unannClassOrInterfaceTypeContext)_localctx).ret =  ((UnannInterfaceType_lf_unannClassOrInterfaceTypeContext)_localctx).ci.ret;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public ClassInterfaceType ret;
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext ci;
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lfno_unannClassOrInterfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1230);
			((UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext)_localctx).ci = unannClassType_lfno_unannClassOrInterfaceType();
			((UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext)_localctx).ret =  ((UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext)_localctx).ci.ret;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeVariableContext extends ParserRuleContext {
		public TypeVariable ret;
		public Token i;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public UnannTypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannTypeVariable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannTypeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannTypeVariableContext unannTypeVariable() throws RecognitionException {
		UnannTypeVariableContext _localctx = new UnannTypeVariableContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_unannTypeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			((UnannTypeVariableContext)_localctx).i = match(Identifier);
			((UnannTypeVariableContext)_localctx).ret =  new TypeVariable(((UnannTypeVariableContext)_localctx).i.getText());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannArrayTypeContext extends ParserRuleContext {
		public ArrayType ret;
		public UnannPrimitiveTypeContext p;
		public DimsContext d;
		public UnannClassOrInterfaceTypeContext c;
		public UnannTypeVariableContext v;
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannArrayType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnannArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannArrayTypeContext unannArrayType() throws RecognitionException {
		UnannArrayTypeContext _localctx = new UnannArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_unannArrayType);
		try {
			setState(1248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1236);
				((UnannArrayTypeContext)_localctx).p = unannPrimitiveType();
				setState(1237);
				((UnannArrayTypeContext)_localctx).d = dims();
				((UnannArrayTypeContext)_localctx).ret =  new ArrayType(((UnannArrayTypeContext)_localctx).p.ret, ((UnannArrayTypeContext)_localctx).d.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1240);
				((UnannArrayTypeContext)_localctx).c = unannClassOrInterfaceType();
				setState(1241);
				((UnannArrayTypeContext)_localctx).d = dims();
				((UnannArrayTypeContext)_localctx).ret =  new ArrayType(((UnannArrayTypeContext)_localctx).c.ret, ((UnannArrayTypeContext)_localctx).d.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1244);
				((UnannArrayTypeContext)_localctx).v = unannTypeVariable();
				setState(1245);
				((UnannArrayTypeContext)_localctx).d = dims();
				((UnannArrayTypeContext)_localctx).ret =  new ArrayType(((UnannArrayTypeContext)_localctx).v.ret, ((UnannArrayTypeContext)_localctx).d.ret);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodDeclaration ret;
		public List<Modifier> mods = new ArrayList<>();;
		public MethodModifierContext m;
		public MethodBodyContext b;
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<MethodModifierContext> methodModifier() {
			return getRuleContexts(MethodModifierContext.class);
		}
		public MethodModifierContext methodModifier(int i) {
			return getRuleContext(MethodModifierContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED))) != 0) || _la==AT) {
				{
				{
				setState(1250);
				((MethodDeclarationContext)_localctx).m = methodModifier();
				_localctx.mods.add(((MethodDeclarationContext)_localctx).m.ret);
				}
				}
				setState(1257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((MethodDeclarationContext)_localctx).ret =  new MethodDeclaration(_localctx.mods);
			setState(1259);
			methodHeader(_localctx.ret);
			setState(1260);
			((MethodDeclarationContext)_localctx).b = methodBody();
			_localctx.ret.setBody(((MethodDeclarationContext)_localctx).b.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodModifierContext extends ParserRuleContext {
		public Modifier ret;
		public AnnotationContext a;
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_methodModifier);
		try {
			setState(1284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1263);
				((MethodModifierContext)_localctx).a = annotation();
				((MethodModifierContext)_localctx).ret =  ((MethodModifierContext)_localctx).a.ret;
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1266);
				match(PUBLIC);
				((MethodModifierContext)_localctx).ret =  Modifier.PUBLIC;
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1268);
				match(PROTECTED);
				((MethodModifierContext)_localctx).ret =  Modifier.PROTECTED;
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1270);
				match(PRIVATE);
				((MethodModifierContext)_localctx).ret =  Modifier.PRIVATE;
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1272);
				match(ABSTRACT);
				((MethodModifierContext)_localctx).ret =  Modifier.ABSTRACT;
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1274);
				match(STATIC);
				((MethodModifierContext)_localctx).ret =  Modifier.STATIC;
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1276);
				match(FINAL);
				((MethodModifierContext)_localctx).ret =  Modifier.FINAL;
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 8);
				{
				setState(1278);
				match(SYNCHRONIZED);
				((MethodModifierContext)_localctx).ret =  Modifier.SYNCHRONIZED;
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1280);
				match(NATIVE);
				((MethodModifierContext)_localctx).ret =  Modifier.NATIVE;
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 10);
				{
				setState(1282);
				match(STRICTFP);
				((MethodModifierContext)_localctx).ret =  Modifier.STRICT_FP;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHeaderContext extends ParserRuleContext {
		public MethodDeclaration ret;
		public List<Annotation> ans = new ArrayList<>();;
		public ResultContext rt;
		public Throws_Context th;
		public TypeParametersContext tp;
		public AnnotationContext a;
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MethodHeaderContext(ParserRuleContext parent, int invokingState, MethodDeclaration ret) {
			super(parent, invokingState);
			this.ret = ret;
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodHeaderContext methodHeader(MethodDeclaration ret) throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState(), ret);
		enterRule(_localctx, 144, RULE_methodHeader);
		int _la;
		try {
			setState(1309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1286);
				((MethodHeaderContext)_localctx).rt = result();
				setState(1287);
				methodDeclarator(_localctx.ret);
				setState(1289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1288);
					((MethodHeaderContext)_localctx).th = throws_();
					}
				}


				            _localctx.ret.setReturnType(((MethodHeaderContext)_localctx).rt.ret);
				            _localctx.ret.setExceptions(((MethodHeaderContext)_localctx).th.ret);
				        
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1293);
				((MethodHeaderContext)_localctx).tp = typeParameters();
				setState(1299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1294);
					((MethodHeaderContext)_localctx).a = annotation();
					_localctx.ans.add(((MethodHeaderContext)_localctx).a.ret);
					}
					}
					setState(1301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1302);
				((MethodHeaderContext)_localctx).rt = result();
				setState(1303);
				methodDeclarator(_localctx.ret);
				setState(1305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1304);
					((MethodHeaderContext)_localctx).th = throws_();
					}
				}


				            _localctx.ret.setTypeParameters(((MethodHeaderContext)_localctx).tp.ret);
				            if (_localctx.ans.size() > 0) {
				                ((MethodHeaderContext)_localctx).rt.ret.setAnnotations(_localctx.ans);
				            }
				            _localctx.ret.setReturnType(((MethodHeaderContext)_localctx).rt.ret);
				            _localctx.ret.setExceptions(((MethodHeaderContext)_localctx).th.ret);
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public Type ret;
		public UnannTypeContext u;
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_result);
		try {
			setState(1316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1311);
				((ResultContext)_localctx).u = unannType();
				((ResultContext)_localctx).ret =  ((ResultContext)_localctx).u.ret;
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1314);
				match(VOID);
				((ResultContext)_localctx).ret =  PrimitiveType.VOID;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclaratorContext extends ParserRuleContext {
		public MethodDeclaration ret;
		public Token n;
		public FormalParameterListContext p;
		public DimsContext d;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState, MethodDeclaration ret) {
			super(parent, invokingState);
			this.ret = ret;
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator(MethodDeclaration ret) throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState(), ret);
		enterRule(_localctx, 148, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1318);
			((MethodDeclaratorContext)_localctx).n = match(Identifier);
			setState(1319);
			match(LPAREN);
			setState(1321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1320);
				((MethodDeclaratorContext)_localctx).p = formalParameterList();
				}
			}

			setState(1323);
			match(RPAREN);
			setState(1325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1324);
				((MethodDeclaratorContext)_localctx).d = dims();
				}
			}


			            _localctx.ret.setName(((MethodDeclaratorContext)_localctx).n.getText());
			            _localctx.ret.setParameters(((MethodDeclaratorContext)_localctx).p.ret);
			            if (((MethodDeclaratorContext)_localctx).d.ret > 0) {
			                _localctx.ret.setReturnType(_localctx.ret.getReturnType().augment(((MethodDeclaratorContext)_localctx).d.ret));
			            }
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<VariableDeclaration> ret;
		public List<VariableDeclaration> ls = new ArrayList<>();;
		public FormalParametersContext p;
		public LastFormalParameterContext p2;
		public LastFormalParameterContext f;
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_formalParameterList);
		try {
			setState(1343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1329);
				((FormalParameterListContext)_localctx).p = formalParameters();
				_localctx.ls.addAll(((FormalParameterListContext)_localctx).p.ret);
				}
				setState(1332);
				match(COMMA);
				{
				setState(1333);
				((FormalParameterListContext)_localctx).p2 = lastFormalParameter();
				_localctx.ls.add(((FormalParameterListContext)_localctx).p2.ret);
				}
				((FormalParameterListContext)_localctx).ret =  _localctx.ls;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1338);
				((FormalParameterListContext)_localctx).f = lastFormalParameter();
				_localctx.ls.add(((FormalParameterListContext)_localctx).f.ret);
				}
				((FormalParameterListContext)_localctx).ret =  _localctx.ls;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public List<VariableDeclaration> ret;
		public List<VariableDeclaration> ls = new ArrayList<>();;
		public FormalParameterContext p;
		public FormalParameterContext f;
		public ReceiverParameterContext r;
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_formalParameters);
		try {
			int _alt;
			setState(1373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1345);
				((FormalParametersContext)_localctx).p = formalParameter();
				_localctx.ls.add(((FormalParametersContext)_localctx).p.ret);
				}
				setState(1354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1348);
						match(COMMA);
						setState(1349);
						((FormalParametersContext)_localctx).f = formalParameter();
						_localctx.ls.add(((FormalParametersContext)_localctx).f.ret);
						}
						} 
					}
					setState(1356);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				}
				((FormalParametersContext)_localctx).ret =  _localctx.ls;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1359);
				((FormalParametersContext)_localctx).r = receiverParameter();
				_localctx.ls.add(((FormalParametersContext)_localctx).r.ret);
				}
				setState(1368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1362);
						match(COMMA);
						setState(1363);
						((FormalParametersContext)_localctx).f = formalParameter();
						_localctx.ls.add(((FormalParametersContext)_localctx).f.ret);
						}
						} 
					}
					setState(1370);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				}
				((FormalParametersContext)_localctx).ret =  _localctx.ls;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public VariableDeclaration ret;
		public List<Modifier> mods = new ArrayList<>();;
		public VariableModifierContext m;
		public UnannTypeContext t;
		public VariableDeclaratorIdContext n;
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1375);
				((FormalParameterContext)_localctx).m = variableModifier();
				_localctx.mods.add(((FormalParameterContext)_localctx).m.ret);
				}
				}
				setState(1382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1383);
			((FormalParameterContext)_localctx).t = unannType();
			setState(1384);
			((FormalParameterContext)_localctx).n = variableDeclaratorId();
			((FormalParameterContext)_localctx).ret =  new VariableDeclaration(toName(((FormalParameterContext)_localctx).n.ret), ((FormalParameterContext)_localctx).t.ret, _localctx.mods);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public Modifier ret;
		public AnnotationContext a;
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_variableModifier);
		try {
			setState(1392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1387);
				((VariableModifierContext)_localctx).a = annotation();
				((VariableModifierContext)_localctx).ret =  ((VariableModifierContext)_localctx).a.ret;
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1390);
				match(FINAL);
				((VariableModifierContext)_localctx).ret =  Modifier.FINAL;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public VariableDeclaration ret;
		public List<Modifier> mods = new ArrayList<>();;
		public VariableModifierContext m;
		public UnannTypeContext t;
		public AnnotationContext a;
		public VariableDeclaratorIdContext n;
		public FormalParameterContext f;
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_lastFormalParameter);
		int _la;
		try {
			setState(1418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
					{
					setState(1394);
					((LastFormalParameterContext)_localctx).m = variableModifier();
					_localctx.mods.add(((LastFormalParameterContext)_localctx).m.ret);
					}
					}
					setState(1401);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1402);
				((LastFormalParameterContext)_localctx).t = unannType();
				setState(1408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1403);
					((LastFormalParameterContext)_localctx).a = annotation();
					_localctx.mods.add(((LastFormalParameterContext)_localctx).a.ret);
					}
					}
					setState(1410);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1411);
				match(ELLIPSIS);
				setState(1412);
				((LastFormalParameterContext)_localctx).n = variableDeclaratorId();
				((LastFormalParameterContext)_localctx).ret =  new VariableDeclaration(toName(((LastFormalParameterContext)_localctx).n.ret), ((LastFormalParameterContext)_localctx).t.ret, _localctx.mods, true);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1415);
				((LastFormalParameterContext)_localctx).f = formalParameter();
				((LastFormalParameterContext)_localctx).ret =  ((LastFormalParameterContext)_localctx).f.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverParameterContext extends ParserRuleContext {
		public VariableDeclaration ret;
		public List<Modifier> ans = new ArrayList<>();;
		public AnnotationContext a;
		public UnannTypeContext t;
		public Token i;
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitReceiverParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1420);
				((ReceiverParameterContext)_localctx).a = annotation();
				_localctx.ans.add(((ReceiverParameterContext)_localctx).a.ret);
				}
				}
				setState(1427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1428);
			((ReceiverParameterContext)_localctx).t = unannType();
			setState(1431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1429);
				((ReceiverParameterContext)_localctx).i = match(Identifier);
				setState(1430);
				match(DOT);
				}
			}

			setState(1433);
			match(THIS);

			            ((ReceiverParameterContext)_localctx).ret =  new VariableDeclaration(
			                ((ReceiverParameterContext)_localctx).i.getText().equals("") ? "this" : ((ReceiverParameterContext)_localctx).i.getText() + "." + "this",
			                ((ReceiverParameterContext)_localctx).t.ret,
			                _localctx.ans);
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Throws_Context extends ParserRuleContext {
		public List<Type> ret;
		public ExceptionTypeListContext e;
		public ExceptionTypeListContext exceptionTypeList() {
			return getRuleContext(ExceptionTypeListContext.class,0);
		}
		public Throws_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throws_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitThrows_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Throws_Context throws_() throws RecognitionException {
		Throws_Context _localctx = new Throws_Context(_ctx, getState());
		enterRule(_localctx, 162, RULE_throws_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1436);
			match(THROWS);
			setState(1437);
			((Throws_Context)_localctx).e = exceptionTypeList();
			((Throws_Context)_localctx).ret =  ((Throws_Context)_localctx).e.ret;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeListContext extends ParserRuleContext {
		public List<Type> ret;
		public List<Type> ls = new ArrayList<>();;
		public ExceptionTypeContext e;
		public List<ExceptionTypeContext> exceptionType() {
			return getRuleContexts(ExceptionTypeContext.class);
		}
		public ExceptionTypeContext exceptionType(int i) {
			return getRuleContext(ExceptionTypeContext.class,i);
		}
		public ExceptionTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionTypeList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExceptionTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionTypeListContext exceptionTypeList() throws RecognitionException {
		ExceptionTypeListContext _localctx = new ExceptionTypeListContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_exceptionTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1440);
			((ExceptionTypeListContext)_localctx).e = exceptionType();
			_localctx.ls.add(((ExceptionTypeListContext)_localctx).e.ret);
			}
			setState(1449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1443);
				match(COMMA);
				setState(1444);
				((ExceptionTypeListContext)_localctx).e = exceptionType();
				_localctx.ls.add(((ExceptionTypeListContext)_localctx).e.ret);
				}
				}
				setState(1451);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((ExceptionTypeListContext)_localctx).ret =  _localctx.ls;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeContext extends ParserRuleContext {
		public ReferenceType ret;
		public ClassTypeContext c;
		public TypeVariableContext v;
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ExceptionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExceptionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionTypeContext exceptionType() throws RecognitionException {
		ExceptionTypeContext _localctx = new ExceptionTypeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_exceptionType);
		try {
			setState(1460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1454);
				((ExceptionTypeContext)_localctx).c = classType();
				((ExceptionTypeContext)_localctx).ret =  ((ExceptionTypeContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1457);
				((ExceptionTypeContext)_localctx).v = typeVariable();
				((ExceptionTypeContext)_localctx).ret =  ((ExceptionTypeContext)_localctx).v.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public Block ret;
		public BlockContext body;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_methodBody);
		try {
			setState(1466);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1462);
				((MethodBodyContext)_localctx).body = block();
				((MethodBodyContext)_localctx).ret =  ((MethodBodyContext)_localctx).body.ret;
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1465);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceInitializerContext extends ParserRuleContext {
		public Block ret;
		public BlockContext body;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InstanceInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInstanceInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceInitializerContext instanceInitializer() throws RecognitionException {
		InstanceInitializerContext _localctx = new InstanceInitializerContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_instanceInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1468);
			((InstanceInitializerContext)_localctx).body = block();
			((InstanceInitializerContext)_localctx).ret =  ((InstanceInitializerContext)_localctx).body.ret;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticInitializerContext extends ParserRuleContext {
		public Block ret;
		public BlockContext body;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StaticInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStaticInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticInitializerContext staticInitializer() throws RecognitionException {
		StaticInitializerContext _localctx = new StaticInitializerContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1471);
			match(STATIC);
			setState(1472);
			((StaticInitializerContext)_localctx).body = block();
			((StaticInitializerContext)_localctx).ret =  ((StaticInitializerContext)_localctx).body.ret;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public MethodDeclaration ret;
		public List<Modifier> mods = new ArrayList<>();;
		public ConstructorModifierContext m;
		public Throws_Context t;
		public ConstructorBodyContext b;
		public ConstructorDeclaratorContext constructorDeclarator() {
			return getRuleContext(ConstructorDeclaratorContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public List<ConstructorModifierContext> constructorModifier() {
			return getRuleContexts(ConstructorModifierContext.class);
		}
		public ConstructorModifierContext constructorModifier(int i) {
			return getRuleContext(ConstructorModifierContext.class,i);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0) || _la==AT) {
				{
				{
				setState(1475);
				((ConstructorDeclarationContext)_localctx).m = constructorModifier();
				_localctx.mods.add(((ConstructorDeclarationContext)_localctx).m.ret);
				}
				}
				setState(1482);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((ConstructorDeclarationContext)_localctx).ret =  new MethodDeclaration(_localctx.mods);
			setState(1484);
			constructorDeclarator(_localctx.ret);
			setState(1486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1485);
				((ConstructorDeclarationContext)_localctx).t = throws_();
				}
			}

			setState(1488);
			((ConstructorDeclarationContext)_localctx).b = constructorBody();

			            _localctx.ret.setExceptions(((ConstructorDeclarationContext)_localctx).t.ret);
			            _localctx.ret.setBody(((ConstructorDeclarationContext)_localctx).b.ret);
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorModifierContext extends ParserRuleContext {
		public Modifier ret;
		public AnnotationContext a;
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ConstructorModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstructorModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorModifierContext constructorModifier() throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_constructorModifier);
		try {
			setState(1500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1491);
				((ConstructorModifierContext)_localctx).a = annotation();
				((ConstructorModifierContext)_localctx).ret =  ((ConstructorModifierContext)_localctx).a.ret;
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1494);
				match(PUBLIC);
				((ConstructorModifierContext)_localctx).ret =  Modifier.PUBLIC;
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1496);
				match(PROTECTED);
				((ConstructorModifierContext)_localctx).ret =  Modifier.PROTECTED;
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1498);
				match(PRIVATE);
				((ConstructorModifierContext)_localctx).ret =  Modifier.PRIVATE;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclaratorContext extends ParserRuleContext {
		public MethodDeclaration ret;
		public TypeParametersContext t;
		public SimpleTypeNameContext n;
		public FormalParameterListContext l;
		public SimpleTypeNameContext simpleTypeName() {
			return getRuleContext(SimpleTypeNameContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ConstructorDeclaratorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ConstructorDeclaratorContext(ParserRuleContext parent, int invokingState, MethodDeclaration ret) {
			super(parent, invokingState);
			this.ret = ret;
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstructorDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclaratorContext constructorDeclarator(MethodDeclaration ret) throws RecognitionException {
		ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(_ctx, getState(), ret);
		enterRule(_localctx, 178, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1502);
				((ConstructorDeclaratorContext)_localctx).t = typeParameters();
				}
			}

			setState(1505);
			((ConstructorDeclaratorContext)_localctx).n = simpleTypeName();
			setState(1506);
			match(LPAREN);
			setState(1508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1507);
				((ConstructorDeclaratorContext)_localctx).l = formalParameterList();
				}
			}

			setState(1510);
			match(RPAREN);

			            _localctx.ret.setTypeParameters(((ConstructorDeclaratorContext)_localctx).t.ret);
			            _localctx.ret.setName(((ConstructorDeclaratorContext)_localctx).n.ret);
			            _localctx.ret.setParameters(((ConstructorDeclaratorContext)_localctx).l.ret);
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeNameContext extends ParserRuleContext {
		public String ret;
		public Token id;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSimpleTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeNameContext simpleTypeName() throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1513);
			((SimpleTypeNameContext)_localctx).id = match(Identifier);
			((SimpleTypeNameContext)_localctx).ret =  ((SimpleTypeNameContext)_localctx).id.getText();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public Block ret;
		public ExplicitConstructorInvocationContext s;
		public BlockStatementsContext st;
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1516);
			match(LBRACE);
			setState(1518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1517);
				((ConstructorBodyContext)_localctx).s = explicitConstructorInvocation();
				}
				break;
			}
			setState(1521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1520);
				((ConstructorBodyContext)_localctx).st = blockStatements();
				}
			}

			setState(1523);
			match(RBRACE);
			((ConstructorBodyContext)_localctx).ret =  new Block(((ConstructorBodyContext)_localctx).st.ret);
			         _localctx.ret.addStatement(0, ((ConstructorBodyContext)_localctx).s.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public Expression ret;
		public TypeArgumentsContext t;
		public ArgumentListContext a;
		public ExpressionNameContext en;
		public PrimaryContext p;
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExplicitConstructorInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(1576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1526);
					((ExplicitConstructorInvocationContext)_localctx).t = typeArguments();
					}
				}

				setState(1529);
				match(THIS);
				setState(1530);
				match(LPAREN);
				setState(1532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1531);
					((ExplicitConstructorInvocationContext)_localctx).a = argumentList();
					}
				}

				setState(1534);
				match(RPAREN);
				setState(1535);
				match(SEMI);
				((ExplicitConstructorInvocationContext)_localctx).ret =  new CallExpression(new ThisLiteral(), ((ExplicitConstructorInvocationContext)_localctx).a.ret, ((ExplicitConstructorInvocationContext)_localctx).t.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1537);
					((ExplicitConstructorInvocationContext)_localctx).t = typeArguments();
					}
				}

				setState(1540);
				match(SUPER);
				setState(1541);
				match(LPAREN);
				setState(1543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1542);
					((ExplicitConstructorInvocationContext)_localctx).a = argumentList();
					}
				}

				setState(1545);
				match(RPAREN);
				setState(1546);
				match(SEMI);
				((ExplicitConstructorInvocationContext)_localctx).ret =  new CallExpression(new SuperLiteral(), ((ExplicitConstructorInvocationContext)_localctx).a.ret, ((ExplicitConstructorInvocationContext)_localctx).t.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1548);
				((ExplicitConstructorInvocationContext)_localctx).en = expressionName();
				setState(1549);
				match(DOT);
				setState(1551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1550);
					((ExplicitConstructorInvocationContext)_localctx).t = typeArguments();
					}
				}

				setState(1553);
				match(SUPER);
				setState(1554);
				match(LPAREN);
				setState(1556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1555);
					((ExplicitConstructorInvocationContext)_localctx).a = argumentList();
					}
				}

				setState(1558);
				match(RPAREN);
				setState(1559);
				match(SEMI);
				((ExplicitConstructorInvocationContext)_localctx).ret =  new CallExpression(new SuperLiteral(), ((ExplicitConstructorInvocationContext)_localctx).a.ret, ((ExplicitConstructorInvocationContext)_localctx).t.ret);
				         ((ExplicitConstructorInvocationContext)_localctx).ret =  new AccessExpression(((ExplicitConstructorInvocationContext)_localctx).en.ret, _localctx.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1562);
				((ExplicitConstructorInvocationContext)_localctx).p = primary();
				setState(1563);
				match(DOT);
				setState(1565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1564);
					((ExplicitConstructorInvocationContext)_localctx).t = typeArguments();
					}
				}

				setState(1567);
				match(SUPER);
				setState(1568);
				match(LPAREN);
				setState(1570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1569);
					((ExplicitConstructorInvocationContext)_localctx).a = argumentList();
					}
				}

				setState(1572);
				match(RPAREN);
				setState(1573);
				match(SEMI);
				((ExplicitConstructorInvocationContext)_localctx).ret =  new CallExpression(new SuperLiteral(), ((ExplicitConstructorInvocationContext)_localctx).a.ret, ((ExplicitConstructorInvocationContext)_localctx).t.ret);
				         ((ExplicitConstructorInvocationContext)_localctx).ret =  new AccessExpression(((ExplicitConstructorInvocationContext)_localctx).p.ret, _localctx.ret);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public EnumDeclaration ret;
		public List<Modifier> mods = new ArrayList<>();;
		public ClassModifierContext m;
		public Token id;
		public SuperinterfacesContext il;
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1578);
				((EnumDeclarationContext)_localctx).m = classModifier();
				_localctx.mods.add(((EnumDeclarationContext)_localctx).m.ret);
				}
				}
				setState(1585);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1586);
			match(ENUM);
			setState(1587);
			((EnumDeclarationContext)_localctx).id = match(Identifier);
			setState(1589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1588);
				((EnumDeclarationContext)_localctx).il = superinterfaces();
				}
			}

			((EnumDeclarationContext)_localctx).ret =  new EnumDeclaration(((EnumDeclarationContext)_localctx).id.getText(), _localctx.mods, ((EnumDeclarationContext)_localctx).il.ret);
			setState(1592);
			enumBody(_localctx.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyContext extends ParserRuleContext {
		public EnumDeclaration ret;
		public EnumConstantListContext enumConstantList() {
			return getRuleContext(EnumConstantListContext.class,0);
		}
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EnumBodyContext(ParserRuleContext parent, int invokingState, EnumDeclaration ret) {
			super(parent, invokingState);
			this.ret = ret;
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyContext enumBody(EnumDeclaration ret) throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState(), ret);
		enterRule(_localctx, 188, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
			match(LBRACE);
			setState(1596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(1595);
				enumConstantList(_localctx.ret);
				}
			}

			setState(1599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1598);
				match(COMMA);
				}
			}

			setState(1602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1601);
				enumBodyDeclarations(_localctx.ret);
				}
			}

			setState(1604);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantListContext extends ParserRuleContext {
		public EnumDeclaration ret;
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EnumConstantListContext(ParserRuleContext parent, int invokingState, EnumDeclaration ret) {
			super(parent, invokingState);
			this.ret = ret;
		}
		@Override public int getRuleIndex() { return RULE_enumConstantList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantListContext enumConstantList(EnumDeclaration ret) throws RecognitionException {
		EnumConstantListContext _localctx = new EnumConstantListContext(_ctx, getState(), ret);
		enterRule(_localctx, 190, RULE_enumConstantList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1606);
			enumConstant(_localctx.ret);
			setState(1611);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1607);
					match(COMMA);
					setState(1608);
					enumConstant(_localctx.ret);
					}
					} 
				}
				setState(1613);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public EnumDeclaration ret;
		public List<Modifier> ans = new ArrayList<>();
		public EnumConstant cons;
		public EnumConstantModifierContext an;
		public Token id;
		public ArgumentListContext a;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<EnumConstantModifierContext> enumConstantModifier() {
			return getRuleContexts(EnumConstantModifierContext.class);
		}
		public EnumConstantModifierContext enumConstantModifier(int i) {
			return getRuleContext(EnumConstantModifierContext.class,i);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EnumConstantContext(ParserRuleContext parent, int invokingState, EnumDeclaration ret) {
			super(parent, invokingState);
			this.ret = ret;
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant(EnumDeclaration ret) throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState(), ret);
		enterRule(_localctx, 192, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1614);
				((EnumConstantContext)_localctx).an = enumConstantModifier();
				_localctx.ans.add(((EnumConstantContext)_localctx).an.ret);
				}
				}
				setState(1621);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1622);
			((EnumConstantContext)_localctx).id = match(Identifier);
			setState(1628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1623);
				match(LPAREN);
				setState(1625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1624);
					((EnumConstantContext)_localctx).a = argumentList();
					}
				}

				setState(1627);
				match(RPAREN);
				}
			}


			            ((EnumConstantContext)_localctx).cons =  new EnumConstant(((EnumConstantContext)_localctx).id.getText(), _localctx.ans, ((EnumConstantContext)_localctx).a.ret);
			            _localctx.ret.addConstant(_localctx.cons);
			setState(1632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1631);
				classBody(_localctx.cons);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantModifierContext extends ParserRuleContext {
		public Modifier ret;
		public AnnotationContext a;
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public EnumConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumConstantModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantModifierContext enumConstantModifier() throws RecognitionException {
		EnumConstantModifierContext _localctx = new EnumConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_enumConstantModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1634);
			((EnumConstantModifierContext)_localctx).a = annotation();
			((EnumConstantModifierContext)_localctx).ret =  ((EnumConstantModifierContext)_localctx).a.ret;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public EnumDeclaration ret;
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState, EnumDeclaration ret) {
			super(parent, invokingState);
			this.ret = ret;
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations(EnumDeclaration ret) throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState(), ret);
		enterRule(_localctx, 196, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1637);
			match(SEMI);
			setState(1641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(1638);
				classBodyDeclaration(_localctx.ret);
				}
				}
				setState(1643);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public AbstractBodyDeclaration ret;
		public NormalInterfaceDeclarationContext n;
		public AnnotationTypeDeclarationContext a;
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_interfaceDeclaration);
		try {
			setState(1650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1644);
				((InterfaceDeclarationContext)_localctx).n = normalInterfaceDeclaration();
				((InterfaceDeclarationContext)_localctx).ret =  ((InterfaceDeclarationContext)_localctx).n.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1647);
				((InterfaceDeclarationContext)_localctx).a = annotationTypeDeclaration();
				((InterfaceDeclarationContext)_localctx).ret =  ((InterfaceDeclarationContext)_localctx).a.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public InterfaceDeclaration ret;
		public List<Modifier> mods = new ArrayList<>();;
		public InterfaceModifierContext m;
		public Token id;
		public TypeParametersContext t;
		public ExtendsInterfacesContext e;
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ExtendsInterfacesContext extendsInterfaces() {
			return getRuleContext(ExtendsInterfacesContext.class,0);
		}
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNormalInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1652);
				((NormalInterfaceDeclarationContext)_localctx).m = interfaceModifier();
				_localctx.mods.add(((NormalInterfaceDeclarationContext)_localctx).m.ret);
				}
				}
				setState(1659);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1660);
			match(INTERFACE);
			setState(1661);
			((NormalInterfaceDeclarationContext)_localctx).id = match(Identifier);
			setState(1663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1662);
				((NormalInterfaceDeclarationContext)_localctx).t = typeParameters();
				}
			}

			setState(1666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1665);
				((NormalInterfaceDeclarationContext)_localctx).e = extendsInterfaces();
				}
			}

			((NormalInterfaceDeclarationContext)_localctx).ret =  new InterfaceDeclaration(((NormalInterfaceDeclarationContext)_localctx).id.getText(), _localctx.mods, ((NormalInterfaceDeclarationContext)_localctx).e.ret, ((NormalInterfaceDeclarationContext)_localctx).t.ret);
			setState(1669);
			interfaceBody(_localctx.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceModifierContext extends ParserRuleContext {
		public Modifier ret;
		public AnnotationContext a;
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public InterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceModifierContext interfaceModifier() throws RecognitionException {
		InterfaceModifierContext _localctx = new InterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_interfaceModifier);
		try {
			setState(1686);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1671);
				((InterfaceModifierContext)_localctx).a = annotation();
				((InterfaceModifierContext)_localctx).ret =  ((InterfaceModifierContext)_localctx).a.ret;
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1674);
				match(PUBLIC);
				((InterfaceModifierContext)_localctx).ret =  Modifier.PUBLIC;
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1676);
				match(PROTECTED);
				((InterfaceModifierContext)_localctx).ret =  Modifier.PROTECTED;
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1678);
				match(PRIVATE);
				((InterfaceModifierContext)_localctx).ret =  Modifier.PRIVATE;
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1680);
				match(ABSTRACT);
				((InterfaceModifierContext)_localctx).ret =  Modifier.ABSTRACT;
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1682);
				match(STATIC);
				((InterfaceModifierContext)_localctx).ret =  Modifier.STATIC;
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1684);
				match(STRICTFP);
				((InterfaceModifierContext)_localctx).ret =  Modifier.STRICT_FP;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendsInterfacesContext extends ParserRuleContext {
		public List<ClassInterfaceType> ret;
		public InterfaceTypeListContext i;
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public ExtendsInterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsInterfaces; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExtendsInterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendsInterfacesContext extendsInterfaces() throws RecognitionException {
		ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_extendsInterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1688);
			match(EXTENDS);
			setState(1689);
			((ExtendsInterfacesContext)_localctx).i = interfaceTypeList();
			((ExtendsInterfacesContext)_localctx).ret =  ((ExtendsInterfacesContext)_localctx).i.ret;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public InterfaceDeclaration ret;
		public List<InterfaceMemberDeclarationContext> interfaceMemberDeclaration() {
			return getRuleContexts(InterfaceMemberDeclarationContext.class);
		}
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration(int i) {
			return getRuleContext(InterfaceMemberDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState, InterfaceDeclaration ret) {
			super(parent, invokingState);
			this.ret = ret;
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody(InterfaceDeclaration ret) throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState(), ret);
		enterRule(_localctx, 206, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1692);
			match(LBRACE);
			setState(1696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(1693);
				interfaceMemberDeclaration(_localctx.ret);
				}
				}
				setState(1698);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1699);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public InterfaceDeclaration ret;
		public ConstantDeclarationContext c;
		public InterfaceMethodDeclarationContext im;
		public ClassDeclarationContext cl;
		public InterfaceDeclarationContext id;
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState, InterfaceDeclaration ret) {
			super(parent, invokingState);
			this.ret = ret;
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration(InterfaceDeclaration ret) throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState(), ret);
		enterRule(_localctx, 208, RULE_interfaceMemberDeclaration);
		try {
			setState(1714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1701);
				((InterfaceMemberDeclarationContext)_localctx).c = constantDeclaration();
				_localctx.ret.addField(((InterfaceMemberDeclarationContext)_localctx).c.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1704);
				((InterfaceMemberDeclarationContext)_localctx).im = interfaceMethodDeclaration();
				_localctx.ret.addMethod(((InterfaceMemberDeclarationContext)_localctx).im.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1707);
				((InterfaceMemberDeclarationContext)_localctx).cl = classDeclaration();
				_localctx.ret.addInnerBody(((InterfaceMemberDeclarationContext)_localctx).cl.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1710);
				((InterfaceMemberDeclarationContext)_localctx).id = interfaceDeclaration();
				_localctx.ret.addInnerInterface(((InterfaceMemberDeclarationContext)_localctx).id.ret);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1713);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public VariableDeclaration ret;
		public List<Modifier> mods = new ArrayList<>();;
		public ConstantModifierContext m;
		public UnannTypeContext t;
		public VariableDeclaratorListContext l;
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
		}
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class,i);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstantDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << STATIC))) != 0) || _la==AT) {
				{
				{
				setState(1716);
				((ConstantDeclarationContext)_localctx).m = constantModifier();
				_localctx.mods.add(((ConstantDeclarationContext)_localctx).m.ret);
				}
				}
				setState(1723);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1724);
			((ConstantDeclarationContext)_localctx).t = unannType();
			setState(1725);
			((ConstantDeclarationContext)_localctx).l = variableDeclaratorList();
			setState(1726);
			match(SEMI);
			((ConstantDeclarationContext)_localctx).ret =  new VariableDeclaration(((ConstantDeclarationContext)_localctx).l.ret, ((ConstantDeclarationContext)_localctx).t.ret, _localctx.mods);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantModifierContext extends ParserRuleContext {
		public Modifier ret;
		public AnnotationContext a;
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstantModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantModifierContext constantModifier() throws RecognitionException {
		ConstantModifierContext _localctx = new ConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_constantModifier);
		try {
			setState(1738);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1729);
				((ConstantModifierContext)_localctx).a = annotation();
				((ConstantModifierContext)_localctx).ret =  ((ConstantModifierContext)_localctx).a.ret;
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1732);
				match(PUBLIC);
				((ConstantModifierContext)_localctx).ret =  Modifier.PUBLIC;
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1734);
				match(STATIC);
				((ConstantModifierContext)_localctx).ret =  Modifier.STATIC;
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1736);
				match(FINAL);
				((ConstantModifierContext)_localctx).ret =  Modifier.FINAL;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public MethodDeclaration ret;
		public List<Modifier> mods = new ArrayList<>();;
		public InterfaceMethodModifierContext m;
		public MethodBodyContext b;
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1740);
				((InterfaceMethodDeclarationContext)_localctx).m = interfaceMethodModifier();
				_localctx.mods.add(((InterfaceMethodDeclarationContext)_localctx).m.ret);
				}
				}
				setState(1747);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((InterfaceMethodDeclarationContext)_localctx).ret =  new MethodDeclaration(_localctx.mods);
			{
			setState(1749);
			methodHeader(_localctx.ret);
			}
			{
			setState(1750);
			((InterfaceMethodDeclarationContext)_localctx).b = methodBody();
			_localctx.ret.setBody(((InterfaceMethodDeclarationContext)_localctx).b.ret);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public Modifier ret;
		public AnnotationContext a;
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInterfaceMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_interfaceMethodModifier);
		try {
			setState(1766);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1753);
				((InterfaceMethodModifierContext)_localctx).a = annotation();
				((InterfaceMethodModifierContext)_localctx).ret =  ((InterfaceMethodModifierContext)_localctx).a.ret;
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1756);
				match(PUBLIC);
				((InterfaceMethodModifierContext)_localctx).ret =  Modifier.PUBLIC;
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1758);
				match(ABSTRACT);
				((InterfaceMethodModifierContext)_localctx).ret =  Modifier.ABSTRACT;
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1760);
				match(DEFAULT);
				((InterfaceMethodModifierContext)_localctx).ret =  Modifier.DEFAULT;
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1762);
				match(STATIC);
				((InterfaceMethodModifierContext)_localctx).ret =  Modifier.STATIC;
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(1764);
				match(STRICTFP);
				((InterfaceMethodModifierContext)_localctx).ret =  Modifier.STRICT_FP;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public AnnotationDeclaration ret;
		public List<Modifier> mods = new ArrayList<>();;
		public InterfaceModifierContext m;
		public Token id;
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_annotationTypeDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1773);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1768);
					((AnnotationTypeDeclarationContext)_localctx).m = interfaceModifier();
					_localctx.mods.add(((AnnotationTypeDeclarationContext)_localctx).m.ret);
					}
					} 
				}
				setState(1775);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			}
			setState(1776);
			match(AT);
			setState(1777);
			match(INTERFACE);
			setState(1778);
			((AnnotationTypeDeclarationContext)_localctx).id = match(Identifier);
			((AnnotationTypeDeclarationContext)_localctx).ret =  new AnnotationDeclaration(((AnnotationTypeDeclarationContext)_localctx).id.getText(), _localctx.mods);
			setState(1780);
			annotationTypeBody(_localctx.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public AnnotationDeclaration ret;
		public List<AnnotationTypeMemberDeclarationContext> annotationTypeMemberDeclaration() {
			return getRuleContexts(AnnotationTypeMemberDeclarationContext.class);
		}
		public AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration(int i) {
			return getRuleContext(AnnotationTypeMemberDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState, AnnotationDeclaration ret) {
			super(parent, invokingState);
			this.ret = ret;
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody(AnnotationDeclaration ret) throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState(), ret);
		enterRule(_localctx, 220, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1782);
			match(LBRACE);
			setState(1786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==Identifier || _la==AT) {
				{
				{
				setState(1783);
				annotationTypeMemberDeclaration(_localctx.ret);
				}
				}
				setState(1788);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1789);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeMemberDeclarationContext extends ParserRuleContext {
		public AnnotationDeclaration ret;
		public AnnotationTypeElementDeclarationContext a;
		public ConstantDeclarationContext co;
		public ClassDeclarationContext cl;
		public InterfaceDeclarationContext i;
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeMemberDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AnnotationTypeMemberDeclarationContext(ParserRuleContext parent, int invokingState, AnnotationDeclaration ret) {
			super(parent, invokingState);
			this.ret = ret;
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeMemberDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationTypeMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration(AnnotationDeclaration ret) throws RecognitionException {
		AnnotationTypeMemberDeclarationContext _localctx = new AnnotationTypeMemberDeclarationContext(_ctx, getState(), ret);
		enterRule(_localctx, 222, RULE_annotationTypeMemberDeclaration);
		try {
			setState(1804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1791);
				((AnnotationTypeMemberDeclarationContext)_localctx).a = annotationTypeElementDeclaration();
				_localctx.ret.addField(((AnnotationTypeMemberDeclarationContext)_localctx).a.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1794);
				((AnnotationTypeMemberDeclarationContext)_localctx).co = constantDeclaration();
				_localctx.ret.addField(((AnnotationTypeMemberDeclarationContext)_localctx).co.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1797);
				((AnnotationTypeMemberDeclarationContext)_localctx).cl = classDeclaration();
				_localctx.ret.addInnerBody(((AnnotationTypeMemberDeclarationContext)_localctx).cl.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1800);
				((AnnotationTypeMemberDeclarationContext)_localctx).i = interfaceDeclaration();
				_localctx.ret.addInnerInterface(((AnnotationTypeMemberDeclarationContext)_localctx).i.ret);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1803);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public VariableDeclaration ret;
		public List<Modifier> mods = new ArrayList<>();;
		public AnnotationTypeElementModifierContext m;
		public UnannTypeContext t;
		public Token id;
		public DimsContext ds;
		public DefaultValueContext dv;
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationTypeElementModifierContext> annotationTypeElementModifier() {
			return getRuleContexts(AnnotationTypeElementModifierContext.class);
		}
		public AnnotationTypeElementModifierContext annotationTypeElementModifier(int i) {
			return getRuleContext(AnnotationTypeElementModifierContext.class,i);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_annotationTypeElementDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT || _la==PUBLIC || _la==AT) {
				{
				{
				setState(1806);
				((AnnotationTypeElementDeclarationContext)_localctx).m = annotationTypeElementModifier();
				_localctx.mods.add(((AnnotationTypeElementDeclarationContext)_localctx).m.ret);
				}
				}
				setState(1813);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1814);
			((AnnotationTypeElementDeclarationContext)_localctx).t = unannType();
			setState(1815);
			((AnnotationTypeElementDeclarationContext)_localctx).id = match(Identifier);
			setState(1816);
			match(LPAREN);
			setState(1817);
			match(RPAREN);
			setState(1819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1818);
				((AnnotationTypeElementDeclarationContext)_localctx).ds = dims();
				}
			}

			setState(1822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1821);
				((AnnotationTypeElementDeclarationContext)_localctx).dv = defaultValue();
				}
			}

			setState(1824);
			match(SEMI);

			            if (((AnnotationTypeElementDeclarationContext)_localctx).ds.ret > 0) {
			                ((AnnotationTypeElementDeclarationContext)_localctx).ret =  new VariableDeclaration(((AnnotationTypeElementDeclarationContext)_localctx).id.getText(),
			                                               ((AnnotationTypeElementDeclarationContext)_localctx).t.ret.augment(((AnnotationTypeElementDeclarationContext)_localctx).ds.ret),
			                                               _localctx.mods,
			                                               ((AnnotationTypeElementDeclarationContext)_localctx).dv.ret,
			                                               false);
			            } else {
			                ((AnnotationTypeElementDeclarationContext)_localctx).ret =  new VariableDeclaration(((AnnotationTypeElementDeclarationContext)_localctx).id.getText(), ((AnnotationTypeElementDeclarationContext)_localctx).t.ret,
			                                               _localctx.mods, ((AnnotationTypeElementDeclarationContext)_localctx).dv.ret, false);
			            }
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementModifierContext extends ParserRuleContext {
		public Modifier ret;
		public AnnotationContext a;
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public AnnotationTypeElementModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotationTypeElementModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementModifierContext annotationTypeElementModifier() throws RecognitionException {
		AnnotationTypeElementModifierContext _localctx = new AnnotationTypeElementModifierContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_annotationTypeElementModifier);
		try {
			setState(1834);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1827);
				((AnnotationTypeElementModifierContext)_localctx).a = annotation();
				((AnnotationTypeElementModifierContext)_localctx).ret =  ((AnnotationTypeElementModifierContext)_localctx).a.ret;
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1830);
				match(PUBLIC);
				((AnnotationTypeElementModifierContext)_localctx).ret =  Modifier.PUBLIC;
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1832);
				match(ABSTRACT);
				((AnnotationTypeElementModifierContext)_localctx).ret =  Modifier.ABSTRACT;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public Expression ret;
		public ElementValueContext v;
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
			match(DEFAULT);
			setState(1837);
			((DefaultValueContext)_localctx).v = elementValue();
			((DefaultValueContext)_localctx).ret =  ((DefaultValueContext)_localctx).v.ret;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public Annotation ret;
		public NormalAnnotationContext n;
		public MarkerAnnotationContext m;
		public SingleElementAnnotationContext e;
		public NormalAnnotationContext normalAnnotation() {
			return getRuleContext(NormalAnnotationContext.class,0);
		}
		public MarkerAnnotationContext markerAnnotation() {
			return getRuleContext(MarkerAnnotationContext.class,0);
		}
		public SingleElementAnnotationContext singleElementAnnotation() {
			return getRuleContext(SingleElementAnnotationContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_annotation);
		try {
			setState(1849);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1840);
				((AnnotationContext)_localctx).n = normalAnnotation();
				((AnnotationContext)_localctx).ret =  ((AnnotationContext)_localctx).n.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1843);
				((AnnotationContext)_localctx).m = markerAnnotation();
				((AnnotationContext)_localctx).ret =  ((AnnotationContext)_localctx).m.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1846);
				((AnnotationContext)_localctx).e = singleElementAnnotation();
				((AnnotationContext)_localctx).ret =  ((AnnotationContext)_localctx).e.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalAnnotationContext extends ParserRuleContext {
		public Annotation ret;
		public TypeNameContext t;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ElementValuePairListContext elementValuePairList() {
			return getRuleContext(ElementValuePairListContext.class,0);
		}
		public NormalAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalAnnotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitNormalAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalAnnotationContext normalAnnotation() throws RecognitionException {
		NormalAnnotationContext _localctx = new NormalAnnotationContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_normalAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1851);
			match(AT);
			setState(1852);
			((NormalAnnotationContext)_localctx).t = typeName();
			((NormalAnnotationContext)_localctx).ret =  new Annotation(((NormalAnnotationContext)_localctx).t.ret);
			setState(1854);
			match(LPAREN);
			setState(1856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1855);
				elementValuePairList(_localctx.ret);
				}
			}

			setState(1858);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairListContext extends ParserRuleContext {
		public Annotation ret;
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public ElementValuePairListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ElementValuePairListContext(ParserRuleContext parent, int invokingState, Annotation ret) {
			super(parent, invokingState);
			this.ret = ret;
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitElementValuePairList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairListContext elementValuePairList(Annotation ret) throws RecognitionException {
		ElementValuePairListContext _localctx = new ElementValuePairListContext(_ctx, getState(), ret);
		enterRule(_localctx, 234, RULE_elementValuePairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1860);
			elementValuePair(_localctx.ret);
			}
			setState(1865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1861);
				match(COMMA);
				setState(1862);
				elementValuePair(_localctx.ret);
				}
				}
				setState(1867);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public Annotation ret;
		public Token id;
		public ElementValueContext v;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ElementValuePairContext(ParserRuleContext parent, int invokingState, Annotation ret) {
			super(parent, invokingState);
			this.ret = ret;
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair(Annotation ret) throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState(), ret);
		enterRule(_localctx, 236, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1868);
			((ElementValuePairContext)_localctx).id = match(Identifier);
			setState(1869);
			match(ASSIGN);
			setState(1870);
			((ElementValuePairContext)_localctx).v = elementValue();
			_localctx.ret.addArgument(((ElementValuePairContext)_localctx).id.getText(), ((ElementValuePairContext)_localctx).v.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public Expression ret;
		public ConditionalExpressionContext c;
		public ElementValueArrayInitializerContext i;
		public AnnotationContext a;
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_elementValue);
		try {
			setState(1882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1873);
				((ElementValueContext)_localctx).c = conditionalExpression();
				((ElementValueContext)_localctx).ret =  ((ElementValueContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1876);
				((ElementValueContext)_localctx).i = elementValueArrayInitializer();
				((ElementValueContext)_localctx).ret =  ((ElementValueContext)_localctx).i.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1879);
				((ElementValueContext)_localctx).a = annotation();
				((ElementValueContext)_localctx).ret =  ((ElementValueContext)_localctx).a.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public ArrayInitializer ret;
		public ElementValueListContext l;
		public ElementValueListContext elementValueList() {
			return getRuleContext(ElementValueListContext.class,0);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_elementValueArrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1884);
			match(LBRACE);
			setState(1886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1885);
				((ElementValueArrayInitializerContext)_localctx).l = elementValueList();
				}
			}

			setState(1889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1888);
				match(COMMA);
				}
			}

			setState(1891);
			match(RBRACE);
			((ElementValueArrayInitializerContext)_localctx).ret =  new ArrayInitializer(((ElementValueArrayInitializerContext)_localctx).l.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueListContext extends ParserRuleContext {
		public List<Expression> ret;
		public List<Expression> ls = new ArrayList<>();;
		public ElementValueContext v1;
		public ElementValueContext v;
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public ElementValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitElementValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueListContext elementValueList() throws RecognitionException {
		ElementValueListContext _localctx = new ElementValueListContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_elementValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1894);
			((ElementValueListContext)_localctx).v1 = elementValue();
			_localctx.ls.add(((ElementValueListContext)_localctx).v1.ret);
			}
			setState(1903);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1897);
					match(COMMA);
					setState(1898);
					((ElementValueListContext)_localctx).v = elementValue();
					_localctx.ls.add(((ElementValueListContext)_localctx).v.ret);
					}
					} 
				}
				setState(1905);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			}
			((ElementValueListContext)_localctx).ret =  _localctx.ls;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MarkerAnnotationContext extends ParserRuleContext {
		public Annotation ret;
		public TypeNameContext t;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MarkerAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markerAnnotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMarkerAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarkerAnnotationContext markerAnnotation() throws RecognitionException {
		MarkerAnnotationContext _localctx = new MarkerAnnotationContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_markerAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1908);
			match(AT);
			setState(1909);
			((MarkerAnnotationContext)_localctx).t = typeName();
			((MarkerAnnotationContext)_localctx).ret =  new Annotation(((MarkerAnnotationContext)_localctx).t.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleElementAnnotationContext extends ParserRuleContext {
		public Annotation ret;
		public TypeNameContext t;
		public ElementValueContext v;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public SingleElementAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleElementAnnotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSingleElementAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleElementAnnotationContext singleElementAnnotation() throws RecognitionException {
		SingleElementAnnotationContext _localctx = new SingleElementAnnotationContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_singleElementAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1912);
			match(AT);
			setState(1913);
			((SingleElementAnnotationContext)_localctx).t = typeName();
			setState(1914);
			match(LPAREN);
			setState(1915);
			((SingleElementAnnotationContext)_localctx).v = elementValue();
			setState(1916);
			match(RPAREN);
			((SingleElementAnnotationContext)_localctx).ret =  new Annotation(((SingleElementAnnotationContext)_localctx).t.ret, ((SingleElementAnnotationContext)_localctx).v.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public ArrayInitializer ret;
		public VariableInitializerListContext l;
		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class,0);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1919);
			match(LBRACE);
			setState(1921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1920);
				((ArrayInitializerContext)_localctx).l = variableInitializerList();
				}
			}

			setState(1924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1923);
				match(COMMA);
				}
			}

			setState(1926);
			match(RBRACE);
			((ArrayInitializerContext)_localctx).ret =  new ArrayInitializer(((ArrayInitializerContext)_localctx).l.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerListContext extends ParserRuleContext {
		public List<Expression> ret;
		public List<Expression> ls = new ArrayList<>();;
		public VariableInitializerContext i;
		public VariableInitializerContext v;
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public VariableInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializerList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitVariableInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1929);
			((VariableInitializerListContext)_localctx).i = variableInitializer();
			_localctx.ls.add(((VariableInitializerListContext)_localctx).i.ret);
			}
			setState(1938);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1932);
					match(COMMA);
					setState(1933);
					((VariableInitializerListContext)_localctx).v = variableInitializer();
					_localctx.ls.add(((VariableInitializerListContext)_localctx).v.ret);
					}
					} 
				}
				setState(1940);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			}
			((VariableInitializerListContext)_localctx).ret =  _localctx.ls;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public Block ret;
		public BlockStatementsContext s;
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1943);
			match(LBRACE);
			setState(1945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1944);
				((BlockContext)_localctx).s = blockStatements();
				}
			}

			setState(1947);
			match(RBRACE);
			((BlockContext)_localctx).ret =  new Block(((BlockContext)_localctx).s.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<Statement> ret;
		public List<Statement> ls = new ArrayList<>();;
		public BlockStatementContext s;
		public BlockStatementContext b;
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBlockStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1950);
			((BlockStatementsContext)_localctx).s = blockStatement();
			_localctx.ls.add(((BlockStatementsContext)_localctx).s.ret);
			}
			setState(1958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				{
				setState(1953);
				((BlockStatementsContext)_localctx).b = blockStatement();
				_localctx.ls.add(((BlockStatementsContext)_localctx).b.ret);
				}
				}
				setState(1960);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((BlockStatementsContext)_localctx).ret =  _localctx.ls;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public Statement ret;
		public LocalVariableDeclarationStatementContext d;
		public ClassDeclarationContext c;
		public StatementContext st;
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_blockStatement);
		try {
			setState(1972);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1963);
				((BlockStatementContext)_localctx).d = localVariableDeclarationStatement();
				((BlockStatementContext)_localctx).ret =  ((BlockStatementContext)_localctx).d.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1966);
				((BlockStatementContext)_localctx).c = classDeclaration();
				((BlockStatementContext)_localctx).ret =  ((BlockStatementContext)_localctx).c.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1969);
				((BlockStatementContext)_localctx).st = statement();
				((BlockStatementContext)_localctx).ret =  ((BlockStatementContext)_localctx).st.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public VariableDeclaration ret;
		public LocalVariableDeclarationContext d;
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1974);
			((LocalVariableDeclarationStatementContext)_localctx).d = localVariableDeclaration();
			setState(1975);
			match(SEMI);
			((LocalVariableDeclarationStatementContext)_localctx).ret =  ((LocalVariableDeclarationStatementContext)_localctx).d.ret;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public VariableDeclaration ret;
		public List<Modifier> mods = new ArrayList<>();;
		public VariableModifierContext m;
		public UnannTypeContext t;
		public VariableDeclaratorListContext vl;
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1978);
				((LocalVariableDeclarationContext)_localctx).m = variableModifier();
				_localctx.mods.add(((LocalVariableDeclarationContext)_localctx).m.ret);
				}
				}
				setState(1985);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1986);
			((LocalVariableDeclarationContext)_localctx).t = unannType();
			setState(1987);
			((LocalVariableDeclarationContext)_localctx).vl = variableDeclaratorList();
			((LocalVariableDeclarationContext)_localctx).ret =  new VariableDeclaration(((LocalVariableDeclarationContext)_localctx).vl.ret, ((LocalVariableDeclarationContext)_localctx).t.ret, _localctx.mods);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Statement ret;
		public StatementWithoutTrailingSubstatementContext a;
		public LabeledStatementContext b;
		public IfThenStatementContext c;
		public IfThenElseStatementContext d;
		public WhileStatementContext e;
		public ForStatementContext f;
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public IfThenStatementContext ifThenStatement() {
			return getRuleContext(IfThenStatementContext.class,0);
		}
		public IfThenElseStatementContext ifThenElseStatement() {
			return getRuleContext(IfThenElseStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_statement);
		try {
			setState(2008);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1990);
				((StatementContext)_localctx).a = statementWithoutTrailingSubstatement();
				((StatementContext)_localctx).ret =  ((StatementContext)_localctx).a.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1993);
				((StatementContext)_localctx).b = labeledStatement();
				((StatementContext)_localctx).ret =  ((StatementContext)_localctx).b.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1996);
				((StatementContext)_localctx).c = ifThenStatement();
				((StatementContext)_localctx).ret =  ((StatementContext)_localctx).c.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1999);
				((StatementContext)_localctx).d = ifThenElseStatement();
				((StatementContext)_localctx).ret =  ((StatementContext)_localctx).d.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2002);
				((StatementContext)_localctx).e = whileStatement();
				((StatementContext)_localctx).ret =  ((StatementContext)_localctx).e.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2005);
				((StatementContext)_localctx).f = forStatement();
				((StatementContext)_localctx).ret =  ((StatementContext)_localctx).f.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementNoShortIfContext extends ParserRuleContext {
		public Statement ret;
		public StatementWithoutTrailingSubstatementContext a;
		public LabeledStatementNoShortIfContext b;
		public IfThenElseStatementNoShortIfContext c;
		public WhileStatementNoShortIfContext d;
		public ForStatementNoShortIfContext e;
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementNoShortIfContext labeledStatementNoShortIf() {
			return getRuleContext(LabeledStatementNoShortIfContext.class,0);
		}
		public IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() {
			return getRuleContext(IfThenElseStatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext whileStatementNoShortIf() {
			return getRuleContext(WhileStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext forStatementNoShortIf() {
			return getRuleContext(ForStatementNoShortIfContext.class,0);
		}
		public StatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementNoShortIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementNoShortIfContext statementNoShortIf() throws RecognitionException {
		StatementNoShortIfContext _localctx = new StatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_statementNoShortIf);
		try {
			setState(2025);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2010);
				((StatementNoShortIfContext)_localctx).a = statementWithoutTrailingSubstatement();
				((StatementNoShortIfContext)_localctx).ret =  ((StatementNoShortIfContext)_localctx).a.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2013);
				((StatementNoShortIfContext)_localctx).b = labeledStatementNoShortIf();
				((StatementNoShortIfContext)_localctx).ret =  ((StatementNoShortIfContext)_localctx).b.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2016);
				((StatementNoShortIfContext)_localctx).c = ifThenElseStatementNoShortIf();
				((StatementNoShortIfContext)_localctx).ret =  ((StatementNoShortIfContext)_localctx).c.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2019);
				((StatementNoShortIfContext)_localctx).d = whileStatementNoShortIf();
				((StatementNoShortIfContext)_localctx).ret =  ((StatementNoShortIfContext)_localctx).d.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2022);
				((StatementNoShortIfContext)_localctx).e = forStatementNoShortIf();
				((StatementNoShortIfContext)_localctx).ret =  ((StatementNoShortIfContext)_localctx).e.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementWithoutTrailingSubstatementContext extends ParserRuleContext {
		public Statement ret;
		public BlockContext a;
		public EmptyStatementContext b;
		public ExpressionStatementContext c;
		public AssertStatementContext d;
		public SwitchStatementContext e;
		public DoStatementContext f;
		public BreakStatementContext g;
		public ContinueStatementContext h;
		public ReturnStatementContext i;
		public SynchronizedStatementContext j;
		public ThrowStatementContext k;
		public TryStatementContext l;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithoutTrailingSubstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStatementWithoutTrailingSubstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(2061);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2027);
				((StatementWithoutTrailingSubstatementContext)_localctx).a = block();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).a.ret;
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(2030);
				((StatementWithoutTrailingSubstatementContext)_localctx).b = emptyStatement();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case INC:
			case DEC:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2031);
				((StatementWithoutTrailingSubstatementContext)_localctx).c = expressionStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).c.ret;
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(2034);
				((StatementWithoutTrailingSubstatementContext)_localctx).d = assertStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).d.ret;
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(2037);
				((StatementWithoutTrailingSubstatementContext)_localctx).e = switchStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).e.ret;
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(2040);
				((StatementWithoutTrailingSubstatementContext)_localctx).f = doStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).f.ret;
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(2043);
				((StatementWithoutTrailingSubstatementContext)_localctx).g = breakStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).g.ret;
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2046);
				((StatementWithoutTrailingSubstatementContext)_localctx).h = continueStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).h.ret;
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(2049);
				((StatementWithoutTrailingSubstatementContext)_localctx).i = returnStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).i.ret;
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
				setState(2052);
				((StatementWithoutTrailingSubstatementContext)_localctx).j = synchronizedStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).j.ret;
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 11);
				{
				setState(2055);
				((StatementWithoutTrailingSubstatementContext)_localctx).k = throwStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).k.ret;
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 12);
				{
				setState(2058);
				((StatementWithoutTrailingSubstatementContext)_localctx).l = tryStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).l.ret;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public Statement ret;
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2063);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public LabelStatement ret;
		public Token id;
		public StatementContext s;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2065);
			((LabeledStatementContext)_localctx).id = match(Identifier);
			setState(2066);
			match(COLON);
			setState(2067);
			((LabeledStatementContext)_localctx).s = statement();
			((LabeledStatementContext)_localctx).ret =  new LabelStatement(((LabeledStatementContext)_localctx).id.getText(), ((LabeledStatementContext)_localctx).s.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementNoShortIfContext extends ParserRuleContext {
		public LabelStatement ret;
		public Token id;
		public StatementNoShortIfContext s;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public LabeledStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatementNoShortIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLabeledStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementNoShortIfContext labeledStatementNoShortIf() throws RecognitionException {
		LabeledStatementNoShortIfContext _localctx = new LabeledStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_labeledStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2070);
			((LabeledStatementNoShortIfContext)_localctx).id = match(Identifier);
			setState(2071);
			match(COLON);
			setState(2072);
			((LabeledStatementNoShortIfContext)_localctx).s = statementNoShortIf();
			((LabeledStatementNoShortIfContext)_localctx).ret =  new LabelStatement(((LabeledStatementNoShortIfContext)_localctx).id.getText(), ((LabeledStatementNoShortIfContext)_localctx).s.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public Expression ret;
		public StatementExpressionContext s;
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2075);
			((ExpressionStatementContext)_localctx).s = statementExpression();
			setState(2076);
			match(SEMI);
			((ExpressionStatementContext)_localctx).ret =  ((ExpressionStatementContext)_localctx).s.ret;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public Expression ret;
		public AssignmentContext a;
		public PreIncrementExpressionContext b;
		public PreDecrementExpressionContext c;
		public PostIncrementExpressionContext d;
		public PostDecrementExpressionContext f;
		public MethodInvocationContext g;
		public ClassInstanceCreationExpressionContext h;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public PostIncrementExpressionContext postIncrementExpression() {
			return getRuleContext(PostIncrementExpressionContext.class,0);
		}
		public PostDecrementExpressionContext postDecrementExpression() {
			return getRuleContext(PostDecrementExpressionContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_statementExpression);
		try {
			setState(2100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2079);
				((StatementExpressionContext)_localctx).a = assignment();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).a.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2082);
				((StatementExpressionContext)_localctx).b = preIncrementExpression();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).b.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2085);
				((StatementExpressionContext)_localctx).c = preDecrementExpression();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).c.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2088);
				((StatementExpressionContext)_localctx).d = postIncrementExpression();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).d.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2091);
				((StatementExpressionContext)_localctx).f = postDecrementExpression();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).f.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2094);
				((StatementExpressionContext)_localctx).g = methodInvocation();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).g.ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2097);
				((StatementExpressionContext)_localctx).h = classInstanceCreationExpression();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).h.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenStatementContext extends ParserRuleContext {
		public IfElseStatement ret;
		public ExpressionContext e;
		public StatementContext s;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIfThenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenStatementContext ifThenStatement() throws RecognitionException {
		IfThenStatementContext _localctx = new IfThenStatementContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_ifThenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2102);
			match(IF);
			setState(2103);
			match(LPAREN);
			setState(2104);
			((IfThenStatementContext)_localctx).e = expression();
			setState(2105);
			match(RPAREN);
			setState(2106);
			((IfThenStatementContext)_localctx).s = statement();
			((IfThenStatementContext)_localctx).ret =  new IfElseStatement(((IfThenStatementContext)_localctx).e.ret, new Block(((IfThenStatementContext)_localctx).s.ret));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementContext extends ParserRuleContext {
		public IfElseStatement ret;
		public ExpressionContext e;
		public StatementNoShortIfContext t;
		public StatementContext el;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIfThenElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseStatementContext ifThenElseStatement() throws RecognitionException {
		IfThenElseStatementContext _localctx = new IfThenElseStatementContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_ifThenElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2109);
			match(IF);
			setState(2110);
			match(LPAREN);
			setState(2111);
			((IfThenElseStatementContext)_localctx).e = expression();
			setState(2112);
			match(RPAREN);
			setState(2113);
			((IfThenElseStatementContext)_localctx).t = statementNoShortIf();
			setState(2114);
			match(ELSE);
			setState(2115);
			((IfThenElseStatementContext)_localctx).el = statement();
			((IfThenElseStatementContext)_localctx).ret =  new IfElseStatement(((IfThenElseStatementContext)_localctx).e.ret,
			                                    new Block(((IfThenElseStatementContext)_localctx).t.ret),
			                                    new Block(((IfThenElseStatementContext)_localctx).el.ret));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementNoShortIfContext extends ParserRuleContext {
		public IfElseStatement ret;
		public ExpressionContext e;
		public StatementNoShortIfContext t;
		public StatementNoShortIfContext el;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementNoShortIfContext> statementNoShortIf() {
			return getRuleContexts(StatementNoShortIfContext.class);
		}
		public StatementNoShortIfContext statementNoShortIf(int i) {
			return getRuleContext(StatementNoShortIfContext.class,i);
		}
		public IfThenElseStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatementNoShortIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitIfThenElseStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() throws RecognitionException {
		IfThenElseStatementNoShortIfContext _localctx = new IfThenElseStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_ifThenElseStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2118);
			match(IF);
			setState(2119);
			match(LPAREN);
			setState(2120);
			((IfThenElseStatementNoShortIfContext)_localctx).e = expression();
			setState(2121);
			match(RPAREN);
			setState(2122);
			((IfThenElseStatementNoShortIfContext)_localctx).t = statementNoShortIf();
			setState(2123);
			match(ELSE);
			setState(2124);
			((IfThenElseStatementNoShortIfContext)_localctx).el = statementNoShortIf();
			((IfThenElseStatementNoShortIfContext)_localctx).ret =  new IfElseStatement(((IfThenElseStatementNoShortIfContext)_localctx).e.ret,
			                                    new Block(((IfThenElseStatementNoShortIfContext)_localctx).t.ret),
			                                    new Block(((IfThenElseStatementNoShortIfContext)_localctx).el.ret));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertStatementContext extends ParserRuleContext {
		public AssertStatement ret;
		public ExpressionContext e;
		public ExpressionContext msg;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAssertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_assertStatement);
		try {
			setState(2139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2127);
				match(ASSERT);
				setState(2128);
				((AssertStatementContext)_localctx).e = expression();
				setState(2129);
				match(SEMI);
				((AssertStatementContext)_localctx).ret =  new AssertStatement(((AssertStatementContext)_localctx).e.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2132);
				match(ASSERT);
				setState(2133);
				((AssertStatementContext)_localctx).e = expression();
				setState(2134);
				match(COLON);
				setState(2135);
				((AssertStatementContext)_localctx).msg = expression();
				setState(2136);
				match(SEMI);
				((AssertStatementContext)_localctx).ret =  new AssertStatement(((AssertStatementContext)_localctx).e.ret, ((AssertStatementContext)_localctx).msg.ret);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public SwitchStatement ret;
		public ExpressionContext e;
		public SwitchBlockContext b;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2141);
			match(SWITCH);
			setState(2142);
			match(LPAREN);
			setState(2143);
			((SwitchStatementContext)_localctx).e = expression();
			setState(2144);
			match(RPAREN);
			setState(2145);
			((SwitchStatementContext)_localctx).b = switchBlock();
			((SwitchStatementContext)_localctx).ret =  new SwitchStatement(((SwitchStatementContext)_localctx).e.ret, ((SwitchStatementContext)_localctx).b.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public List<CaseBlock> ret;
		public List<CaseBlock> blocks = new ArrayList<>();;
		public SwitchBlockStatementGroupContext m;
		public SwitchLabelContext l;
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2148);
			match(LBRACE);
			setState(2154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2149);
					((SwitchBlockContext)_localctx).m = switchBlockStatementGroup();
					_localctx.blocks.add(((SwitchBlockContext)_localctx).m.ret);
					}
					} 
				}
				setState(2156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			}
			setState(2162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(2157);
				((SwitchBlockContext)_localctx).l = switchLabel();
				_localctx.blocks.add(new CaseBlock(((SwitchBlockContext)_localctx).l.ret));
				}
				}
				setState(2164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2165);
			match(RBRACE);
			((SwitchBlockContext)_localctx).ret =  _localctx.blocks;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public CaseBlock ret;
		public SwitchLabelsContext l;
		public BlockStatementsContext s;
		public SwitchLabelsContext switchLabels() {
			return getRuleContext(SwitchLabelsContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2168);
			((SwitchBlockStatementGroupContext)_localctx).l = switchLabels();
			setState(2169);
			((SwitchBlockStatementGroupContext)_localctx).s = blockStatements();
			((SwitchBlockStatementGroupContext)_localctx).ret =  new CaseBlock(((SwitchBlockStatementGroupContext)_localctx).l.ret, new Block(((SwitchBlockStatementGroupContext)_localctx).s.ret));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelsContext extends ParserRuleContext {
		public List<Expression> ret;
		public List<Expression> lbls = new ArrayList<>();;
		public SwitchLabelContext s;
		public SwitchLabelContext l;
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabels; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSwitchLabels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelsContext switchLabels() throws RecognitionException {
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_switchLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2172);
			((SwitchLabelsContext)_localctx).s = switchLabel();
			_localctx.lbls.add(((SwitchLabelsContext)_localctx).s.ret);
			}
			setState(2180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(2175);
				((SwitchLabelsContext)_localctx).l = switchLabel();
				_localctx.lbls.add(((SwitchLabelsContext)_localctx).l.ret);
				}
				}
				setState(2182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((SwitchLabelsContext)_localctx).ret =  _localctx.lbls;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public Expression ret;
		public ConstantExpressionContext c;
		public EnumConstantNameContext en;
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_switchLabel);
		try {
			setState(2198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2185);
				match(CASE);
				setState(2186);
				((SwitchLabelContext)_localctx).c = constantExpression();
				setState(2187);
				match(COLON);
				((SwitchLabelContext)_localctx).ret =  ((SwitchLabelContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2190);
				match(CASE);
				setState(2191);
				((SwitchLabelContext)_localctx).en = enumConstantName();
				setState(2192);
				match(COLON);
				((SwitchLabelContext)_localctx).ret =  new IdentifierExpression(((SwitchLabelContext)_localctx).en.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2195);
				match(DEFAULT);
				setState(2196);
				match(COLON);
				((SwitchLabelContext)_localctx).ret =  new IdentifierExpression("default");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public String ret;
		public Token id;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnumConstantName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2200);
			((EnumConstantNameContext)_localctx).id = match(Identifier);
			((EnumConstantNameContext)_localctx).ret =  ((EnumConstantNameContext)_localctx).id.getText();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public WhileStatement ret;
		public ExpressionContext c;
		public StatementContext s;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2203);
			match(WHILE);
			setState(2204);
			match(LPAREN);
			setState(2205);
			((WhileStatementContext)_localctx).c = expression();
			setState(2206);
			match(RPAREN);
			setState(2207);
			((WhileStatementContext)_localctx).s = statement();
			((WhileStatementContext)_localctx).ret =  new WhileStatement(((WhileStatementContext)_localctx).c.ret, new Block(((WhileStatementContext)_localctx).s.ret));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementNoShortIfContext extends ParserRuleContext {
		public WhileStatement ret;
		public ExpressionContext c;
		public StatementNoShortIfContext s;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatementNoShortIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitWhileStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementNoShortIfContext whileStatementNoShortIf() throws RecognitionException {
		WhileStatementNoShortIfContext _localctx = new WhileStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_whileStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2210);
			match(WHILE);
			setState(2211);
			match(LPAREN);
			setState(2212);
			((WhileStatementNoShortIfContext)_localctx).c = expression();
			setState(2213);
			match(RPAREN);
			setState(2214);
			((WhileStatementNoShortIfContext)_localctx).s = statementNoShortIf();
			((WhileStatementNoShortIfContext)_localctx).ret =  new WhileStatement(((WhileStatementNoShortIfContext)_localctx).c.ret, new Block(((WhileStatementNoShortIfContext)_localctx).s.ret));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStatementContext extends ParserRuleContext {
		public WhileStatement ret;
		public StatementContext s;
		public ExpressionContext c;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2217);
			match(DO);
			setState(2218);
			((DoStatementContext)_localctx).s = statement();
			setState(2219);
			match(WHILE);
			setState(2220);
			match(LPAREN);
			setState(2221);
			((DoStatementContext)_localctx).c = expression();
			setState(2222);
			match(RPAREN);
			setState(2223);
			match(SEMI);
			((DoStatementContext)_localctx).ret =  new WhileStatement(((DoStatementContext)_localctx).c.ret, new Block(((DoStatementContext)_localctx).s.ret));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public Statement ret;
		public BasicForStatementContext b;
		public EnhancedForStatementContext e;
		public BasicForStatementContext basicForStatement() {
			return getRuleContext(BasicForStatementContext.class,0);
		}
		public EnhancedForStatementContext enhancedForStatement() {
			return getRuleContext(EnhancedForStatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_forStatement);
		try {
			setState(2232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2226);
				((ForStatementContext)_localctx).b = basicForStatement();
				((ForStatementContext)_localctx).ret =  ((ForStatementContext)_localctx).b.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2229);
				((ForStatementContext)_localctx).e = enhancedForStatement();
				((ForStatementContext)_localctx).ret =  ((ForStatementContext)_localctx).e.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementNoShortIfContext extends ParserRuleContext {
		public Statement ret;
		public BasicForStatementNoShortIfContext b;
		public EnhancedForStatementNoShortIfContext e;
		public BasicForStatementNoShortIfContext basicForStatementNoShortIf() {
			return getRuleContext(BasicForStatementNoShortIfContext.class,0);
		}
		public EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() {
			return getRuleContext(EnhancedForStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementNoShortIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementNoShortIfContext forStatementNoShortIf() throws RecognitionException {
		ForStatementNoShortIfContext _localctx = new ForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_forStatementNoShortIf);
		try {
			setState(2240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2234);
				((ForStatementNoShortIfContext)_localctx).b = basicForStatementNoShortIf();
				((ForStatementNoShortIfContext)_localctx).ret =  ((ForStatementNoShortIfContext)_localctx).b.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2237);
				((ForStatementNoShortIfContext)_localctx).e = enhancedForStatementNoShortIf();
				((ForStatementNoShortIfContext)_localctx).ret =  ((ForStatementNoShortIfContext)_localctx).e.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementContext extends ParserRuleContext {
		public ForStatement ret;
		public ForInitContext i;
		public ExpressionContext e;
		public ForUpdateContext u;
		public StatementContext s;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBasicForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicForStatementContext basicForStatement() throws RecognitionException {
		BasicForStatementContext _localctx = new BasicForStatementContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_basicForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2242);
			match(FOR);
			setState(2243);
			match(LPAREN);
			setState(2245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(2244);
				((BasicForStatementContext)_localctx).i = forInit();
				}
			}

			setState(2247);
			match(SEMI);
			setState(2249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2248);
				((BasicForStatementContext)_localctx).e = expression();
				}
			}

			setState(2251);
			match(SEMI);
			setState(2253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(2252);
				((BasicForStatementContext)_localctx).u = forUpdate();
				}
			}

			setState(2255);
			match(RPAREN);
			setState(2256);
			((BasicForStatementContext)_localctx).s = statement();
			((BasicForStatementContext)_localctx).ret =  new ForStatement(((BasicForStatementContext)_localctx).i.ret, ((BasicForStatementContext)_localctx).e.ret, ((BasicForStatementContext)_localctx).u.ret, new Block(((BasicForStatementContext)_localctx).s.ret));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementNoShortIfContext extends ParserRuleContext {
		public ForStatement ret;
		public ForInitContext i;
		public ExpressionContext e;
		public ForUpdateContext u;
		public StatementNoShortIfContext s;
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public BasicForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatementNoShortIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBasicForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicForStatementNoShortIfContext basicForStatementNoShortIf() throws RecognitionException {
		BasicForStatementNoShortIfContext _localctx = new BasicForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_basicForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2259);
			match(FOR);
			setState(2260);
			match(LPAREN);
			setState(2262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(2261);
				((BasicForStatementNoShortIfContext)_localctx).i = forInit();
				}
			}

			setState(2264);
			match(SEMI);
			setState(2266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2265);
				((BasicForStatementNoShortIfContext)_localctx).e = expression();
				}
			}

			setState(2268);
			match(SEMI);
			setState(2270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(2269);
				((BasicForStatementNoShortIfContext)_localctx).u = forUpdate();
				}
			}

			setState(2272);
			match(RPAREN);
			setState(2273);
			((BasicForStatementNoShortIfContext)_localctx).s = statementNoShortIf();
			((BasicForStatementNoShortIfContext)_localctx).ret =  new ForStatement(((BasicForStatementNoShortIfContext)_localctx).i.ret, ((BasicForStatementNoShortIfContext)_localctx).e.ret, ((BasicForStatementNoShortIfContext)_localctx).u.ret, new Block(((BasicForStatementNoShortIfContext)_localctx).s.ret));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public List<Statement> ret;
		public StatementExpressionListContext ls;
		public LocalVariableDeclarationContext d;
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_forInit);
		try {
			setState(2282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2276);
				((ForInitContext)_localctx).ls = statementExpressionList();
				((ForInitContext)_localctx).ret =  ((ForInitContext)_localctx).ls.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2279);
				((ForInitContext)_localctx).d = localVariableDeclaration();
				((ForInitContext)_localctx).ret =  new ArrayList<Statement>();
				         _localctx.ret.add(((ForInitContext)_localctx).d.ret);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public List<Statement> ret;
		public StatementExpressionListContext ls;
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2284);
			((ForUpdateContext)_localctx).ls = statementExpressionList();
			((ForUpdateContext)_localctx).ret =  ((ForUpdateContext)_localctx).ls.ret;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionListContext extends ParserRuleContext {
		public List<Statement> ret;
		public List<Statement> ups = new ArrayList<>();;
		public StatementExpressionContext s;
		public StatementExpressionContext e;
		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class,i);
		}
		public StatementExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitStatementExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionListContext statementExpressionList() throws RecognitionException {
		StatementExpressionListContext _localctx = new StatementExpressionListContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_statementExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2287);
			((StatementExpressionListContext)_localctx).s = statementExpression();
			_localctx.ups.add(((StatementExpressionListContext)_localctx).s.ret);
			}
			setState(2296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2290);
				match(COMMA);
				setState(2291);
				((StatementExpressionListContext)_localctx).e = statementExpression();
				_localctx.ups.add(((StatementExpressionListContext)_localctx).e.ret);
				}
				}
				setState(2298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((StatementExpressionListContext)_localctx).ret =  _localctx.ups;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementContext extends ParserRuleContext {
		public ForEachStatement ret;
		public List<Modifier> mods = new ArrayList<>();
		public VariableDeclaration v;
		public VariableModifierContext m;
		public UnannTypeContext t;
		public VariableDeclaratorIdContext n;
		public ExpressionContext e;
		public StatementContext s;
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnhancedForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForStatementContext enhancedForStatement() throws RecognitionException {
		EnhancedForStatementContext _localctx = new EnhancedForStatementContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_enhancedForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2301);
			match(FOR);
			setState(2302);
			match(LPAREN);
			setState(2308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(2303);
				((EnhancedForStatementContext)_localctx).m = variableModifier();
				_localctx.mods.add(((EnhancedForStatementContext)_localctx).m.ret);
				}
				}
				setState(2310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2311);
			((EnhancedForStatementContext)_localctx).t = unannType();
			setState(2312);
			((EnhancedForStatementContext)_localctx).n = variableDeclaratorId();
			setState(2313);
			match(COLON);
			setState(2314);
			((EnhancedForStatementContext)_localctx).e = expression();
			setState(2315);
			match(RPAREN);
			setState(2316);
			((EnhancedForStatementContext)_localctx).s = statement();
			((EnhancedForStatementContext)_localctx).v =  new VariableDeclaration(toName(((EnhancedForStatementContext)_localctx).n.ret), ((EnhancedForStatementContext)_localctx).t.ret, _localctx.mods);
			         ((EnhancedForStatementContext)_localctx).ret =  new ForEachStatement(_localctx.v, ((EnhancedForStatementContext)_localctx).e.ret, new Block(((EnhancedForStatementContext)_localctx).s.ret));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementNoShortIfContext extends ParserRuleContext {
		public ForEachStatement ret;
		public List<Modifier> mods = new ArrayList<>();
		public VariableDeclaration v;
		public VariableModifierContext m;
		public UnannTypeContext t;
		public VariableDeclaratorIdContext n;
		public ExpressionContext e;
		public StatementNoShortIfContext s;
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatementNoShortIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEnhancedForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() throws RecognitionException {
		EnhancedForStatementNoShortIfContext _localctx = new EnhancedForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_enhancedForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2319);
			match(FOR);
			setState(2320);
			match(LPAREN);
			setState(2326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(2321);
				((EnhancedForStatementNoShortIfContext)_localctx).m = variableModifier();
				_localctx.mods.add(((EnhancedForStatementNoShortIfContext)_localctx).m.ret);
				}
				}
				setState(2328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2329);
			((EnhancedForStatementNoShortIfContext)_localctx).t = unannType();
			setState(2330);
			((EnhancedForStatementNoShortIfContext)_localctx).n = variableDeclaratorId();
			setState(2331);
			match(COLON);
			setState(2332);
			((EnhancedForStatementNoShortIfContext)_localctx).e = expression();
			setState(2333);
			match(RPAREN);
			setState(2334);
			((EnhancedForStatementNoShortIfContext)_localctx).s = statementNoShortIf();
			((EnhancedForStatementNoShortIfContext)_localctx).v =  new VariableDeclaration(toName(((EnhancedForStatementNoShortIfContext)_localctx).n.ret), ((EnhancedForStatementNoShortIfContext)_localctx).t.ret, _localctx.mods);
			         ((EnhancedForStatementNoShortIfContext)_localctx).ret =  new ForEachStatement(_localctx.v, ((EnhancedForStatementNoShortIfContext)_localctx).e.ret, new Block(((EnhancedForStatementNoShortIfContext)_localctx).s.ret));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public JumpStatement ret;
		public Token id;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2337);
			match(BREAK);
			setState(2339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(2338);
				((BreakStatementContext)_localctx).id = match(Identifier);
				}
			}

			setState(2341);
			match(SEMI);
			((BreakStatementContext)_localctx).ret =  new JumpStatement(true, ((BreakStatementContext)_localctx).id.getText());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public JumpStatement ret;
		public Token id;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2344);
			match(CONTINUE);
			setState(2346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(2345);
				((ContinueStatementContext)_localctx).id = match(Identifier);
				}
			}

			setState(2348);
			match(SEMI);
			((ContinueStatementContext)_localctx).ret =  new JumpStatement(false, ((ContinueStatementContext)_localctx).id.getText());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatement ret;
		public ExpressionContext e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2351);
			match(RETURN);
			setState(2353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2352);
				((ReturnStatementContext)_localctx).e = expression();
				}
			}

			setState(2355);
			match(SEMI);
			((ReturnStatementContext)_localctx).ret =  new ReturnStatement(((ReturnStatementContext)_localctx).e.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public ThrowStatement ret;
		public ExpressionContext e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2358);
			match(THROW);
			setState(2359);
			((ThrowStatementContext)_localctx).e = expression();
			setState(2360);
			match(SEMI);
			((ThrowStatementContext)_localctx).ret =  new ThrowStatement(((ThrowStatementContext)_localctx).e.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynchronizedStatementContext extends ParserRuleContext {
		public SynchronizedBlock ret;
		public ExpressionContext e;
		public BlockContext b;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SynchronizedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitSynchronizedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2363);
			match(SYNCHRONIZED);
			setState(2364);
			match(LPAREN);
			setState(2365);
			((SynchronizedStatementContext)_localctx).e = expression();
			setState(2366);
			match(RPAREN);
			setState(2367);
			((SynchronizedStatementContext)_localctx).b = block();
			((SynchronizedStatementContext)_localctx).ret =  new SynchronizedBlock(((SynchronizedStatementContext)_localctx).e.ret, ((SynchronizedStatementContext)_localctx).b.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public TryCatchBlock ret;
		public BlockContext t;
		public CatchesContext cs;
		public Finally_Context f;
		public TryWithResourcesStatementContext r;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public TryWithResourcesStatementContext tryWithResourcesStatement() {
			return getRuleContext(TryWithResourcesStatementContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_tryStatement);
		int _la;
		try {
			setState(2386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2370);
				match(TRY);
				setState(2371);
				((TryStatementContext)_localctx).t = block();
				setState(2372);
				((TryStatementContext)_localctx).cs = catches();
				((TryStatementContext)_localctx).ret =  new TryCatchBlock(((TryStatementContext)_localctx).t.ret, ((TryStatementContext)_localctx).cs.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2375);
				match(TRY);
				setState(2376);
				((TryStatementContext)_localctx).t = block();
				setState(2378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(2377);
					((TryStatementContext)_localctx).cs = catches();
					}
				}

				setState(2380);
				((TryStatementContext)_localctx).f = finally_();
				((TryStatementContext)_localctx).ret =  new TryCatchBlock(((TryStatementContext)_localctx).t.ret, ((TryStatementContext)_localctx).cs.ret, ((TryStatementContext)_localctx).f.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2383);
				((TryStatementContext)_localctx).r = tryWithResourcesStatement();
				((TryStatementContext)_localctx).ret =  ((TryStatementContext)_localctx).r.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchesContext extends ParserRuleContext {
		public List<CatchBlock> ret;
		public List<CatchBlock> ls = new ArrayList<>();;
		public CatchClauseContext f;
		public CatchClauseContext c;
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2388);
			((CatchesContext)_localctx).f = catchClause();
			_localctx.ls.add(((CatchesContext)_localctx).f.ret);
			setState(2395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(2390);
				((CatchesContext)_localctx).c = catchClause();
				_localctx.ls.add(((CatchesContext)_localctx).c.ret);
				}
				}
				setState(2397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((CatchesContext)_localctx).ret =  _localctx.ls;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public CatchBlock ret;
		public BlockContext b;
		public CatchFormalParameterContext catchFormalParameter() {
			return getRuleContext(CatchFormalParameterContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((CatchClauseContext)_localctx).ret =  new CatchBlock();
			setState(2401);
			match(CATCH);
			setState(2402);
			match(LPAREN);
			setState(2403);
			catchFormalParameter(_localctx.ret);
			setState(2404);
			match(RPAREN);
			setState(2405);
			((CatchClauseContext)_localctx).b = block();
			_localctx.ret.setStatements(((CatchClauseContext)_localctx).b.ret.getStatements());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchFormalParameterContext extends ParserRuleContext {
		public CatchBlock ret;
		public List<Modifier> mods = new ArrayList<>();;
		public VariableModifierContext m;
		public VariableDeclaratorIdContext n;
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchFormalParameterContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CatchFormalParameterContext(ParserRuleContext parent, int invokingState, CatchBlock ret) {
			super(parent, invokingState);
			this.ret = ret;
		}
		@Override public int getRuleIndex() { return RULE_catchFormalParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCatchFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchFormalParameterContext catchFormalParameter(CatchBlock ret) throws RecognitionException {
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(_ctx, getState(), ret);
		enterRule(_localctx, 338, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(2408);
				((CatchFormalParameterContext)_localctx).m = variableModifier();
				_localctx.mods.add(((CatchFormalParameterContext)_localctx).m.ret);
				}
				}
				setState(2415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2416);
			catchType(_localctx.ret);
			setState(2417);
			((CatchFormalParameterContext)_localctx).n = variableDeclaratorId();
			_localctx.ret.setVariable(new VariableDeclaration(toName(((CatchFormalParameterContext)_localctx).n.ret), _localctx.mods));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public CatchBlock ret;
		public UnannClassTypeContext u;
		public ClassTypeContext c;
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public List<ClassTypeContext> classType() {
			return getRuleContexts(ClassTypeContext.class);
		}
		public ClassTypeContext classType(int i) {
			return getRuleContext(ClassTypeContext.class,i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CatchTypeContext(ParserRuleContext parent, int invokingState, CatchBlock ret) {
			super(parent, invokingState);
			this.ret = ret;
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType(CatchBlock ret) throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState(), ret);
		enterRule(_localctx, 340, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2420);
			((CatchTypeContext)_localctx).u = unannClassType();
			_localctx.ret.addExceptionType(((CatchTypeContext)_localctx).u.ret);
			}
			setState(2429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(2423);
				match(BITOR);
				setState(2424);
				((CatchTypeContext)_localctx).c = classType();
				_localctx.ret.addExceptionType(((CatchTypeContext)_localctx).c.ret);
				}
				}
				setState(2431);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Finally_Context extends ParserRuleContext {
		public Block ret;
		public BlockContext body;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFinally_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Finally_Context finally_() throws RecognitionException {
		Finally_Context _localctx = new Finally_Context(_ctx, getState());
		enterRule(_localctx, 342, RULE_finally_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2432);
			match(FINALLY);
			setState(2433);
			((Finally_Context)_localctx).body = block();
			((Finally_Context)_localctx).ret =  ((Finally_Context)_localctx).body.ret;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryWithResourcesStatementContext extends ParserRuleContext {
		public TryCatchBlock ret;
		public ResourceSpecificationContext r;
		public BlockContext b;
		public CatchesContext c;
		public Finally_Context f;
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public TryWithResourcesStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryWithResourcesStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTryWithResourcesStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryWithResourcesStatementContext tryWithResourcesStatement() throws RecognitionException {
		TryWithResourcesStatementContext _localctx = new TryWithResourcesStatementContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_tryWithResourcesStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2436);
			match(TRY);
			setState(2437);
			((TryWithResourcesStatementContext)_localctx).r = resourceSpecification();
			setState(2438);
			((TryWithResourcesStatementContext)_localctx).b = block();
			setState(2440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(2439);
				((TryWithResourcesStatementContext)_localctx).c = catches();
				}
			}

			setState(2443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(2442);
				((TryWithResourcesStatementContext)_localctx).f = finally_();
				}
			}

			((TryWithResourcesStatementContext)_localctx).ret =  new TryCatchBlock(((TryWithResourcesStatementContext)_localctx).r.ret, ((TryWithResourcesStatementContext)_localctx).b.ret, ((TryWithResourcesStatementContext)_localctx).c.ret, ((TryWithResourcesStatementContext)_localctx).f.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public List<VariableDeclaration> ret;
		public ResourceListContext l;
		public ResourceListContext resourceList() {
			return getRuleContext(ResourceListContext.class,0);
		}
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2447);
			match(LPAREN);
			setState(2448);
			((ResourceSpecificationContext)_localctx).l = resourceList();
			setState(2450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(2449);
				match(SEMI);
				}
			}

			setState(2452);
			match(RPAREN);
			((ResourceSpecificationContext)_localctx).ret =  ((ResourceSpecificationContext)_localctx).l.ret;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceListContext extends ParserRuleContext {
		public List<VariableDeclaration> ret;
		public List<VariableDeclaration> vars = new ArrayList<>();;
		public ResourceContext r;
		public ResourceContext re;
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public ResourceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitResourceList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceListContext resourceList() throws RecognitionException {
		ResourceListContext _localctx = new ResourceListContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_resourceList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2455);
			((ResourceListContext)_localctx).r = resource();
			_localctx.vars.add(((ResourceListContext)_localctx).r.ret);
			setState(2463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2457);
					match(SEMI);
					setState(2458);
					((ResourceListContext)_localctx).re = resource();
					_localctx.vars.add(((ResourceListContext)_localctx).re.ret);
					}
					} 
				}
				setState(2465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			}
			((ResourceListContext)_localctx).ret =  _localctx.vars;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public VariableDeclaration ret;
		public List<Modifier> mods = new ArrayList<>();;
		public VariableModifierContext m;
		public UnannTypeContext t;
		public VariableDeclaratorIdContext n;
		public ExpressionContext e;
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(2468);
				((ResourceContext)_localctx).m = variableModifier();
				_localctx.mods.add(((ResourceContext)_localctx).m.ret);
				}
				}
				setState(2475);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2476);
			((ResourceContext)_localctx).t = unannType();
			setState(2477);
			((ResourceContext)_localctx).n = variableDeclaratorId();
			setState(2478);
			match(ASSIGN);
			setState(2479);
			((ResourceContext)_localctx).e = expression();
			((ResourceContext)_localctx).ret =  new VariableDeclaration(toName(((ResourceContext)_localctx).n.ret),
			                                    ((ResourceContext)_localctx).t.ret,
			                                    _localctx.mods,
			                                    ((ResourceContext)_localctx).e.ret,
			                                    false);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public Expression ret;
		public PrimaryNoNewArray_lfno_primaryContext pno;
		public ArrayCreationExpressionContext a;
		public PrimaryNoNewArray_lf_primaryContext p;
		public PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primaryContext.class,0);
		}
		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_primaryContext> primaryNoNewArray_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primaryContext.class,i);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(2482);
				((PrimaryContext)_localctx).pno = primaryNoNewArray_lfno_primary();
				((PrimaryContext)_localctx).ret =  ((PrimaryContext)_localctx).pno.ret;
				}
				break;
			case 2:
				{
				setState(2485);
				((PrimaryContext)_localctx).a = arrayCreationExpression();
				((PrimaryContext)_localctx).ret =  ((PrimaryContext)_localctx).a.ret;
				}
				break;
			}
			setState(2495);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2490);
					((PrimaryContext)_localctx).p = primaryNoNewArray_lf_primary();

					                if (((PrimaryContext)_localctx).p.isAccess) {
					                    ((PrimaryContext)_localctx).ret =  new AccessExpression(_localctx.ret, ((PrimaryContext)_localctx).p.ret);
					                } else {
					                    ((MethodReferenceExpression) ((PrimaryContext)_localctx).p.ret).setLHS(_localctx.ret);
					                    ((PrimaryContext)_localctx).ret =  ((PrimaryContext)_localctx).p.ret;
					                }
					            
					}
					} 
				}
				setState(2497);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArrayContext extends ParserRuleContext {
		public Expression ret;
		public LiteralContext a1;
		public PrimaryNoNewArray_typeAccessContext a2;
		public ExpressionContext p;
		public ClassInstanceCreationExpressionContext a7;
		public FieldAccessContext a8;
		public ArrayAccessContext a9;
		public MethodInvocationContext a10;
		public MethodReferenceContext a11;
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimaryNoNewArray_typeAccessContext primaryNoNewArray_typeAccess() {
			return getRuleContext(PrimaryNoNewArray_typeAccessContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryNoNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArrayContext primaryNoNewArray() throws RecognitionException {
		PrimaryNoNewArrayContext _localctx = new PrimaryNoNewArrayContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_primaryNoNewArray);
		try {
			setState(2526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2498);
				((PrimaryNoNewArrayContext)_localctx).a1 = literal();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a1.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2501);
				((PrimaryNoNewArrayContext)_localctx).a2 = primaryNoNewArray_typeAccess();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a2.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2504);
				match(THIS);
				((PrimaryNoNewArrayContext)_localctx).ret =  new ThisLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2506);
				match(LPAREN);
				setState(2507);
				((PrimaryNoNewArrayContext)_localctx).p = expression();
				setState(2508);
				match(RPAREN);
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).p.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2511);
				((PrimaryNoNewArrayContext)_localctx).a7 = classInstanceCreationExpression();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a7.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2514);
				((PrimaryNoNewArrayContext)_localctx).a8 = fieldAccess();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a8.ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2517);
				((PrimaryNoNewArrayContext)_localctx).a9 = arrayAccess();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a9.ret;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2520);
				((PrimaryNoNewArrayContext)_localctx).a10 = methodInvocation();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a10.ret;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2523);
				((PrimaryNoNewArrayContext)_localctx).a11 = methodReference();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a11.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_typeAccessContext extends ParserRuleContext {
		public Expression ret;
		public int cnt = 0;
		public Type type;
		public TypeNameContext a2;
		public TypeNameContext a5;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PrimaryNoNewArray_typeAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_typeAccess; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_typeAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_typeAccessContext primaryNoNewArray_typeAccess() throws RecognitionException {
		PrimaryNoNewArray_typeAccessContext _localctx = new PrimaryNoNewArray_typeAccessContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_primaryNoNewArray_typeAccess);
		int _la;
		try {
			setState(2550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2528);
				((PrimaryNoNewArray_typeAccessContext)_localctx).a2 = typeName();
				setState(2534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2529);
					match(LBRACK);
					setState(2530);
					match(RBRACK);
					++_localctx.cnt;
					}
					}
					setState(2536);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2537);
				match(DOT);
				setState(2538);
				match(CLASS);

				            ((PrimaryNoNewArray_typeAccessContext)_localctx).type =  new ClassInterfaceType(((PrimaryNoNewArray_typeAccessContext)_localctx).a2.ret);
				            if (_localctx.cnt > 0) {
				                ((PrimaryNoNewArray_typeAccessContext)_localctx).type =  new ArrayType(_localctx.type, _localctx.cnt);
				            }
				            ((PrimaryNoNewArray_typeAccessContext)_localctx).ret =  new AccessExpression(new TypeExpression(_localctx.type),
				                                        new ClassLiteral());
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2541);
				match(VOID);
				setState(2542);
				match(DOT);
				setState(2543);
				match(CLASS);
				((PrimaryNoNewArray_typeAccessContext)_localctx).ret =  new AccessExpression(new VoidLiteral(), new ClassLiteral());
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2545);
				((PrimaryNoNewArray_typeAccessContext)_localctx).a5 = typeName();
				setState(2546);
				match(DOT);
				setState(2547);
				match(THIS);

				            ((PrimaryNoNewArray_typeAccessContext)_localctx).ret =  new AccessExpression(new TypeExpression(new ClassInterfaceType(((PrimaryNoNewArray_typeAccessContext)_localctx).a5.ret)),
				                                        new ThisLiteral());
				        
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_arrayAccessContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_arrayAccess; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_arrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lf_arrayAccessContext _localctx = new PrimaryNoNewArray_lf_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_primaryNoNewArray_lf_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_arrayAccessContext extends ParserRuleContext {
		public Expression ret;
		public LiteralContext a1;
		public PrimaryNoNewArray_typeAccessContext a2;
		public ExpressionContext p;
		public ClassInstanceCreationExpressionContext a5;
		public FieldAccessContext a6;
		public MethodInvocationContext a7;
		public MethodReferenceContext a8;
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimaryNoNewArray_typeAccessContext primaryNoNewArray_typeAccess() {
			return getRuleContext(PrimaryNoNewArray_typeAccessContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_arrayAccess; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_arrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lfno_arrayAccessContext _localctx = new PrimaryNoNewArray_lfno_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_primaryNoNewArray_lfno_arrayAccess);
		try {
			setState(2579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2554);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a1 = literal();
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a1.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2557);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a2 = primaryNoNewArray_typeAccess();
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a2.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2560);
				match(THIS);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  new ThisLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2562);
				match(LPAREN);
				setState(2563);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).p = expression();
				setState(2564);
				match(RPAREN);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).p.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2567);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a5 = classInstanceCreationExpression();
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a5.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2570);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a6 = fieldAccess();
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a6.ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2573);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a7 = methodInvocation();
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a7.ret;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2576);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a8 = methodReference();
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a8.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primaryContext extends ParserRuleContext {
		public Expression ret;
		public boolean isAccess;
		public ClassInstanceCreationExpression_lf_primaryContext a1;
		public FieldAccess_lf_primaryContext a2;
		public ArrayAccess_lf_primaryContext a3;
		public MethodInvocation_lf_primaryContext a4;
		public MethodReference_lf_primaryContext a5;
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public ArrayAccess_lf_primaryContext arrayAccess_lf_primary() {
			return getRuleContext(ArrayAccess_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_primaryNoNewArray_lf_primary);
		try {
			setState(2596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2581);
				((PrimaryNoNewArray_lf_primaryContext)_localctx).a1 = classInstanceCreationExpression_lf_primary();
				((PrimaryNoNewArray_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primaryContext)_localctx).a1.ret;
				                                                         ((PrimaryNoNewArray_lf_primaryContext)_localctx).isAccess =  true;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2584);
				((PrimaryNoNewArray_lf_primaryContext)_localctx).a2 = fieldAccess_lf_primary();
				((PrimaryNoNewArray_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primaryContext)_localctx).a2.ret; ((PrimaryNoNewArray_lf_primaryContext)_localctx).isAccess =  true;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2587);
				((PrimaryNoNewArray_lf_primaryContext)_localctx).a3 = arrayAccess_lf_primary();
				((PrimaryNoNewArray_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primaryContext)_localctx).a3.ret; ((PrimaryNoNewArray_lf_primaryContext)_localctx).isAccess =  ((PrimaryNoNewArray_lf_primaryContext)_localctx).a3.isAccess;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2590);
				((PrimaryNoNewArray_lf_primaryContext)_localctx).a4 = methodInvocation_lf_primary();
				((PrimaryNoNewArray_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primaryContext)_localctx).a4.ret; ((PrimaryNoNewArray_lf_primaryContext)_localctx).isAccess =  true;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2593);
				((PrimaryNoNewArray_lf_primaryContext)_localctx).a5 = methodReference_lf_primary();
				((PrimaryNoNewArray_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primaryContext)_localctx).a5.ret; ((PrimaryNoNewArray_lf_primaryContext)_localctx).isAccess =  false;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public Expression ret;
		public boolean isAccess;
		public ClassInstanceCreationExpression_lf_primaryContext a1;
		public FieldAccess_lf_primaryContext a2;
		public MethodInvocation_lf_primaryContext a3;
		public MethodReference_lf_primaryContext a4;
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(2612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2600);
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a1 = classInstanceCreationExpression_lf_primary();
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a1.ret;
				                                                         ((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).isAccess =  true;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2603);
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a2 = fieldAccess_lf_primary();
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a2.ret; ((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).isAccess =  true;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2606);
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a3 = methodInvocation_lf_primary();
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a3.ret; ((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).isAccess =  true;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2609);
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a4 = methodReference_lf_primary();
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a4.ret; ((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).isAccess =  false;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primaryContext extends ParserRuleContext {
		public Expression ret;
		public int cnt = 0;
		public Type type;
		public LiteralContext a1;
		public PrimaryNoNewArray_typeAccessContext a2;
		public UnannPrimitiveTypeContext a3;
		public ExpressionContext p;
		public ClassInstanceCreationExpression_lfno_primaryContext a7;
		public FieldAccess_lfno_primaryContext a8;
		public ArrayAccess_lfno_primaryContext a9;
		public MethodInvocation_lfno_primaryContext a10;
		public MethodReference_lfno_primaryContext a11;
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimaryNoNewArray_typeAccessContext primaryNoNewArray_typeAccess() {
			return getRuleContext(PrimaryNoNewArray_typeAccessContext.class,0);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() {
			return getRuleContext(ArrayAccess_lfno_primaryContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_primaryNoNewArray_lfno_primary);
		int _la;
		try {
			setState(2655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2614);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a1 = literal();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a1.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2617);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a2 = primaryNoNewArray_typeAccess();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a2.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2620);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a3 = unannPrimitiveType();
				setState(2626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2621);
					match(LBRACK);
					setState(2622);
					match(RBRACK);
					++_localctx.cnt;
					}
					}
					setState(2628);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2629);
				match(DOT);
				setState(2630);
				match(CLASS);

				            ((PrimaryNoNewArray_lfno_primaryContext)_localctx).type =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a3.ret;
				            if (_localctx.cnt > 0) {
				                ((PrimaryNoNewArray_lfno_primaryContext)_localctx).type =  new ArrayType(_localctx.type, _localctx.cnt);
				            }
				            ((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  new AccessExpression(new TypeExpression(_localctx.type),
				                                        new ClassLiteral());
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2633);
				match(THIS);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  new ThisLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2635);
				match(LPAREN);
				setState(2636);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).p = expression();
				setState(2637);
				match(RPAREN);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).p.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2640);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a7 = classInstanceCreationExpression_lfno_primary();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a7.ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2643);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a8 = fieldAccess_lfno_primary();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a8.ret;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2646);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a9 = arrayAccess_lfno_primary();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a9.ret;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2649);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a10 = methodInvocation_lfno_primary();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a10.ret;
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2652);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a11 = methodReference_lfno_primary();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a11.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public Expression ret;
		public int cnt = 0;
		public Type type;
		public LiteralContext a1;
		public PrimaryNoNewArray_typeAccessContext a2;
		public UnannPrimitiveTypeContext a3;
		public ExpressionContext p;
		public ClassInstanceCreationExpression_lfno_primaryContext a7;
		public FieldAccess_lfno_primaryContext a8;
		public MethodInvocation_lfno_primaryContext a9;
		public MethodReference_lfno_primaryContext a10;
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimaryNoNewArray_typeAccessContext primaryNoNewArray_typeAccess() {
			return getRuleContext(PrimaryNoNewArray_typeAccessContext.class,0);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		int _la;
		try {
			setState(2697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2659);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a1 = literal();
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a1.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2662);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a2 = primaryNoNewArray_typeAccess();
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a2.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2665);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a3 = unannPrimitiveType();
				setState(2671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2666);
					match(LBRACK);
					setState(2667);
					match(RBRACK);
					++_localctx.cnt;
					}
					}
					setState(2673);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2674);
				match(DOT);
				setState(2675);
				match(CLASS);

				            ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).type =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a3.ret;
				            if (_localctx.cnt > 0) {
				                ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).type =  new ArrayType(_localctx.type, _localctx.cnt);
				            }
				            ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  new AccessExpression(new TypeExpression(_localctx.type),
				                                        new ClassLiteral());
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2678);
				match(THIS);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  new ThisLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2680);
				match(LPAREN);
				setState(2681);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).p = expression();
				setState(2682);
				match(RPAREN);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).p.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2685);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a7 = classInstanceCreationExpression_lfno_primary();
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a7.ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2688);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a8 = fieldAccess_lfno_primary();
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a8.ret;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2691);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a9 = methodInvocation_lfno_primary();
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a9.ret;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2694);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a10 = methodReference_lfno_primary();
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a10.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpressionContext extends ParserRuleContext {
		public Expression ret;
		public Expression methodExpr;
		public List<Annotation> ans = new ArrayList<>();
		public List<Annotation> ans2 = new ArrayList<>();
		public ConcreteBodyDeclaration anon;
		public InstantiationExpression inst;
		public TypeArgumentsContext t;
		public AnnotationContext a;
		public Token id;
		public AnnotationContext a2;
		public Token id2;
		public TypeArgumentsOrDiamondContext targs;
		public ArgumentListContext l;
		public ExpressionNameContext name;
		public PrimaryContext p;
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ClassInstanceCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassInstanceCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpressionContext classInstanceCreationExpression() throws RecognitionException {
		ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(2795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2699);
				match(NEW);
				setState(2701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2700);
					((ClassInstanceCreationExpressionContext)_localctx).t = typeArguments();
					}
				}

				setState(2708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2703);
					((ClassInstanceCreationExpressionContext)_localctx).a = annotation();
					_localctx.ans.add(((ClassInstanceCreationExpressionContext)_localctx).a.ret);
					}
					}
					setState(2710);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2711);
				((ClassInstanceCreationExpressionContext)_localctx).id = match(Identifier);

				            ((ClassInstanceCreationExpressionContext)_localctx).methodExpr =  new IdentifierExpression(((ClassInstanceCreationExpressionContext)_localctx).id.getText(), _localctx.ans);
				        
				setState(2726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2713);
					match(DOT);
					setState(2719);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2714);
						((ClassInstanceCreationExpressionContext)_localctx).a2 = annotation();
						_localctx.ans2.add(((ClassInstanceCreationExpressionContext)_localctx).a2.ret);
						}
						}
						setState(2721);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2722);
					((ClassInstanceCreationExpressionContext)_localctx).id2 = match(Identifier);

					                ((ClassInstanceCreationExpressionContext)_localctx).methodExpr =  new AccessExpression(_localctx.methodExpr,
					                                                   new IdentifierExpression(((ClassInstanceCreationExpressionContext)_localctx).id2.getText(),
					                                                                            _localctx.ans2));
					                _localctx.ans2.clear();
					            
					}
					}
					setState(2728);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2730);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2729);
					((ClassInstanceCreationExpressionContext)_localctx).targs = typeArgumentsOrDiamond();
					}
				}

				setState(2732);
				match(LPAREN);
				setState(2734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2733);
					((ClassInstanceCreationExpressionContext)_localctx).l = argumentList();
					}
				}

				setState(2736);
				match(RPAREN);

				            ((ClassInstanceCreationExpressionContext)_localctx).inst =  new InstantiationExpression(((ClassInstanceCreationExpressionContext)_localctx).t.ret, _localctx.methodExpr,
				                                                ((ClassInstanceCreationExpressionContext)_localctx).targs.ret, ((ClassInstanceCreationExpressionContext)_localctx).l.ret);
				            ((ClassInstanceCreationExpressionContext)_localctx).anon =  _localctx.inst.getAnonymousClass();
				            ((ClassInstanceCreationExpressionContext)_localctx).ret =  _localctx.inst;
				        
				setState(2739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2738);
					classBody(_localctx.anon);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2741);
				((ClassInstanceCreationExpressionContext)_localctx).name = expressionName();
				setState(2742);
				match(DOT);
				setState(2743);
				match(NEW);
				setState(2745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2744);
					((ClassInstanceCreationExpressionContext)_localctx).t = typeArguments();
					}
				}

				setState(2752);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2747);
					((ClassInstanceCreationExpressionContext)_localctx).a = annotation();
					_localctx.ans.add(((ClassInstanceCreationExpressionContext)_localctx).a.ret);
					}
					}
					setState(2754);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2755);
				((ClassInstanceCreationExpressionContext)_localctx).id = match(Identifier);
				setState(2757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2756);
					((ClassInstanceCreationExpressionContext)_localctx).targs = typeArgumentsOrDiamond();
					}
				}

				setState(2759);
				match(LPAREN);
				setState(2761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2760);
					((ClassInstanceCreationExpressionContext)_localctx).l = argumentList();
					}
				}

				setState(2763);
				match(RPAREN);

				            ((ClassInstanceCreationExpressionContext)_localctx).inst =  new InstantiationExpression(((ClassInstanceCreationExpressionContext)_localctx).t.ret, _localctx.ans, ((ClassInstanceCreationExpressionContext)_localctx).id.getText(),
				                                                ((ClassInstanceCreationExpressionContext)_localctx).targs.ret, ((ClassInstanceCreationExpressionContext)_localctx).l.ret);
				            ((ClassInstanceCreationExpressionContext)_localctx).anon =  _localctx.inst.getAnonymousClass();
				            ((ClassInstanceCreationExpressionContext)_localctx).ret =  new AccessExpression(((ClassInstanceCreationExpressionContext)_localctx).name.ret, _localctx.inst);
				        
				setState(2766);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2765);
					classBody(_localctx.anon);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2768);
				((ClassInstanceCreationExpressionContext)_localctx).p = primary();
				setState(2769);
				match(DOT);
				setState(2770);
				match(NEW);
				setState(2772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2771);
					((ClassInstanceCreationExpressionContext)_localctx).t = typeArguments();
					}
				}

				setState(2779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2774);
					((ClassInstanceCreationExpressionContext)_localctx).a = annotation();
					_localctx.ans.add(((ClassInstanceCreationExpressionContext)_localctx).a.ret);
					}
					}
					setState(2781);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2782);
				((ClassInstanceCreationExpressionContext)_localctx).id = match(Identifier);
				setState(2784);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2783);
					((ClassInstanceCreationExpressionContext)_localctx).targs = typeArgumentsOrDiamond();
					}
				}

				setState(2786);
				match(LPAREN);
				setState(2788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2787);
					((ClassInstanceCreationExpressionContext)_localctx).l = argumentList();
					}
				}

				setState(2790);
				match(RPAREN);

				            ((ClassInstanceCreationExpressionContext)_localctx).inst =  new InstantiationExpression(((ClassInstanceCreationExpressionContext)_localctx).t.ret, _localctx.ans, ((ClassInstanceCreationExpressionContext)_localctx).id.getText(),
				                                                ((ClassInstanceCreationExpressionContext)_localctx).targs.ret, ((ClassInstanceCreationExpressionContext)_localctx).l.ret);
				            ((ClassInstanceCreationExpressionContext)_localctx).anon =  _localctx.inst.getAnonymousClass();
				            ((ClassInstanceCreationExpressionContext)_localctx).ret =  new AccessExpression(((ClassInstanceCreationExpressionContext)_localctx).p.ret, _localctx.inst);
				        
				setState(2793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2792);
					classBody(_localctx.anon);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lf_primaryContext extends ParserRuleContext {
		public InstantiationExpression ret;
		public List<Annotation> ans = new ArrayList<>();
		public ConcreteBodyDeclaration anon;
		public InstantiationExpression inst;
		public TypeArgumentsContext t;
		public AnnotationContext a;
		public Token id;
		public TypeArgumentsOrDiamondContext targs;
		public ArgumentListContext l;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassInstanceCreationExpression_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lf_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassInstanceCreationExpression_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lf_primaryContext _localctx = new ClassInstanceCreationExpression_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_classInstanceCreationExpression_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2797);
			match(DOT);
			setState(2798);
			match(NEW);
			setState(2800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2799);
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).t = typeArguments();
				}
			}

			setState(2807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2802);
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).a = annotation();
				_localctx.ans.add(((ClassInstanceCreationExpression_lf_primaryContext)_localctx).a.ret);
				}
				}
				setState(2809);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2810);
			((ClassInstanceCreationExpression_lf_primaryContext)_localctx).id = match(Identifier);
			setState(2812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2811);
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).targs = typeArgumentsOrDiamond();
				}
			}

			setState(2814);
			match(LPAREN);
			setState(2816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2815);
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).l = argumentList();
				}
			}

			setState(2818);
			match(RPAREN);

			            ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).inst =  new InstantiationExpression(((ClassInstanceCreationExpression_lf_primaryContext)_localctx).t.ret, _localctx.ans, ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).id.getText(),
			                                                ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).targs.ret, ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).l.ret);
			            ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).anon =  _localctx.inst.getAnonymousClass();
			            ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).ret =  _localctx.inst;
			        
			setState(2821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(2820);
				classBody(_localctx.anon);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lfno_primaryContext extends ParserRuleContext {
		public Expression ret;
		public Expression methodExpr;
		public List<Annotation> ans = new ArrayList<>();
		public List<Annotation> ans2 = new ArrayList<>();
		public ConcreteBodyDeclaration anon;
		public InstantiationExpression inst;
		public TypeArgumentsContext t;
		public AnnotationContext a;
		public Token id;
		public AnnotationContext a2;
		public Token id2;
		public TypeArgumentsOrDiamondContext targs;
		public ArgumentListContext l;
		public ExpressionNameContext name;
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lfno_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitClassInstanceCreationExpression_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lfno_primaryContext _localctx = new ClassInstanceCreationExpression_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_classInstanceCreationExpression_lfno_primary);
		int _la;
		try {
			setState(2892);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2823);
				match(NEW);
				setState(2825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2824);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).t = typeArguments();
					}
				}

				setState(2832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2827);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a = annotation();
					_localctx.ans.add(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a.ret);
					}
					}
					setState(2834);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2835);
				((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id = match(Identifier);

				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).methodExpr =  new IdentifierExpression(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id.getText(), _localctx.ans);
				        
				setState(2850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2837);
					match(DOT);
					setState(2843);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2838);
						((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a2 = annotation();
						_localctx.ans2.add(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a2.ret);
						}
						}
						setState(2845);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2846);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id2 = match(Identifier);

					                ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).methodExpr =  new AccessExpression(_localctx.methodExpr,
					                                                   new IdentifierExpression(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id2.getText(),
					                                                                            _localctx.ans2));
					                _localctx.ans2.clear();
					            
					}
					}
					setState(2852);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2853);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).targs = typeArgumentsOrDiamond();
					}
				}

				setState(2856);
				match(LPAREN);
				setState(2858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2857);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).l = argumentList();
					}
				}

				setState(2860);
				match(RPAREN);

				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).inst =  new InstantiationExpression(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).t.ret, _localctx.methodExpr,
				                                                ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).targs.ret, ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).l.ret);
				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).anon =  _localctx.inst.getAnonymousClass();
				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ret =  _localctx.inst;
				        
				setState(2863);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(2862);
					classBody(_localctx.anon);
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2865);
				((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).name = expressionName();
				setState(2866);
				match(DOT);
				setState(2867);
				match(NEW);
				setState(2869);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2868);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).t = typeArguments();
					}
				}

				setState(2876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2871);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a = annotation();
					_localctx.ans.add(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a.ret);
					}
					}
					setState(2878);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2879);
				((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id = match(Identifier);
				setState(2881);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2880);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).targs = typeArgumentsOrDiamond();
					}
				}

				setState(2883);
				match(LPAREN);
				setState(2885);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2884);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).l = argumentList();
					}
				}

				setState(2887);
				match(RPAREN);

				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).inst =  new InstantiationExpression(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).t.ret, _localctx.ans, ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id.getText(),
				                                                ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).targs.ret, ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).l.ret);
				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).anon =  _localctx.inst.getAnonymousClass();
				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ret =  new AccessExpression(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).name.ret, _localctx.inst);
				        
				setState(2890);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(2889);
					classBody(_localctx.anon);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public List<TypeArgument> ret;
		public TypeArgumentsContext ta;
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_typeArgumentsOrDiamond);
		try {
			setState(2900);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2894);
				((TypeArgumentsOrDiamondContext)_localctx).ta = typeArguments();
				((TypeArgumentsOrDiamondContext)_localctx).ret =  ((TypeArgumentsOrDiamondContext)_localctx).ta.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2897);
				match(LT);
				setState(2898);
				match(GT);
				((TypeArgumentsOrDiamondContext)_localctx).ret =  new ArrayList<>(); _localctx.ret.add(TypeArgument.DIAMOND);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccessContext extends ParserRuleContext {
		public AccessExpression ret;
		public PrimaryContext p;
		public Token id;
		public TypeNameContext t;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_fieldAccess);
		try {
			setState(2918);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2902);
				((FieldAccessContext)_localctx).p = primary();
				setState(2903);
				match(DOT);
				setState(2904);
				((FieldAccessContext)_localctx).id = match(Identifier);
				((FieldAccessContext)_localctx).ret =  new AccessExpression(((FieldAccessContext)_localctx).p.ret, ((FieldAccessContext)_localctx).id.getText());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2907);
				match(SUPER);
				setState(2908);
				match(DOT);
				setState(2909);
				((FieldAccessContext)_localctx).id = match(Identifier);
				((FieldAccessContext)_localctx).ret =  new AccessExpression(new SuperLiteral(), ((FieldAccessContext)_localctx).id.getText());
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2911);
				((FieldAccessContext)_localctx).t = typeName();
				setState(2912);
				match(DOT);
				setState(2913);
				match(SUPER);
				setState(2914);
				match(DOT);
				setState(2915);
				((FieldAccessContext)_localctx).id = match(Identifier);
				((FieldAccessContext)_localctx).ret =  new AccessExpression(new IdentifierExpression(((FieldAccessContext)_localctx).t.ret),
				                                     new AccessExpression(new SuperLiteral(),
				                                                          ((FieldAccessContext)_localctx).id.getText()));
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lf_primaryContext extends ParserRuleContext {
		public IdentifierExpression ret;
		public Token id;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FieldAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lf_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccess_lf_primaryContext fieldAccess_lf_primary() throws RecognitionException {
		FieldAccess_lf_primaryContext _localctx = new FieldAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_fieldAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2920);
			match(DOT);
			setState(2921);
			((FieldAccess_lf_primaryContext)_localctx).id = match(Identifier);
			((FieldAccess_lf_primaryContext)_localctx).ret =  new IdentifierExpression(((FieldAccess_lf_primaryContext)_localctx).id.getText());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lfno_primaryContext extends ParserRuleContext {
		public AccessExpression ret;
		public Token id;
		public TypeNameContext t;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lfno_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitFieldAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() throws RecognitionException {
		FieldAccess_lfno_primaryContext _localctx = new FieldAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_fieldAccess_lfno_primary);
		try {
			setState(2935);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2924);
				match(SUPER);
				setState(2925);
				match(DOT);
				setState(2926);
				((FieldAccess_lfno_primaryContext)_localctx).id = match(Identifier);
				((FieldAccess_lfno_primaryContext)_localctx).ret =  new AccessExpression(new SuperLiteral(), ((FieldAccess_lfno_primaryContext)_localctx).id.getText());
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2928);
				((FieldAccess_lfno_primaryContext)_localctx).t = typeName();
				setState(2929);
				match(DOT);
				setState(2930);
				match(SUPER);
				setState(2931);
				match(DOT);
				setState(2932);
				((FieldAccess_lfno_primaryContext)_localctx).id = match(Identifier);

				            ((FieldAccess_lfno_primaryContext)_localctx).ret =  new AccessExpression(new SuperLiteral(), ((FieldAccess_lfno_primaryContext)_localctx).id.getText());
				            ((FieldAccess_lfno_primaryContext)_localctx).ret =  new AccessExpression(new IdentifierExpression(((FieldAccess_lfno_primaryContext)_localctx).t.ret), _localctx.ret);
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccessContext extends ParserRuleContext {
		public ArrayAccessExpression ret;
		public ExpressionNameContext n;
		public ExpressionContext i;
		public PrimaryNoNewArray_lfno_arrayAccessContext pno;
		public List<PrimaryNoNewArray_lf_arrayAccessContext> primaryNoNewArray_lf_arrayAccess() {
			return getRuleContexts(PrimaryNoNewArray_lf_arrayAccessContext.class);
		}
		public PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_arrayAccessContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() {
			return getRuleContext(PrimaryNoNewArray_lfno_arrayAccessContext.class,0);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2949);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				{
				setState(2937);
				((ArrayAccessContext)_localctx).n = expressionName();
				setState(2938);
				match(LBRACK);
				setState(2939);
				((ArrayAccessContext)_localctx).i = expression();
				setState(2940);
				match(RBRACK);
				((ArrayAccessContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccessContext)_localctx).n.ret, ((ArrayAccessContext)_localctx).i.ret);
				}
				}
				break;
			case 2:
				{
				{
				setState(2943);
				((ArrayAccessContext)_localctx).pno = primaryNoNewArray_lfno_arrayAccess();
				setState(2944);
				match(LBRACK);
				setState(2945);
				((ArrayAccessContext)_localctx).i = expression();
				setState(2946);
				match(RBRACK);
				((ArrayAccessContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccessContext)_localctx).pno.ret, ((ArrayAccessContext)_localctx).i.ret);
				}
				}
				break;
			}
			setState(2959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(2951);
				primaryNoNewArray_lf_arrayAccess();
				setState(2952);
				match(LBRACK);
				setState(2953);
				((ArrayAccessContext)_localctx).i = expression();
				setState(2954);
				match(RBRACK);
				((ArrayAccessContext)_localctx).ret =  new ArrayAccessExpression(_localctx.ret, ((ArrayAccessContext)_localctx).i.ret);
				}
				}
				setState(2961);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lf_primaryContext extends ParserRuleContext {
		public ArrayAccessExpression ret;
		public boolean isAccess;
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext pno;
		public ExpressionContext i;
		public ExpressionContext i2;
		public List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext> primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext.class,0);
		}
		public ArrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lf_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccess_lf_primaryContext arrayAccess_lf_primary() throws RecognitionException {
		ArrayAccess_lf_primaryContext _localctx = new ArrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_arrayAccess_lf_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(2962);
			((ArrayAccess_lf_primaryContext)_localctx).pno = primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(2963);
			match(LBRACK);
			setState(2964);
			((ArrayAccess_lf_primaryContext)_localctx).i = expression();
			setState(2965);
			match(RBRACK);
			((ArrayAccess_lf_primaryContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccess_lf_primaryContext)_localctx).pno.ret, ((ArrayAccess_lf_primaryContext)_localctx).i.ret);
			                 ((ArrayAccess_lf_primaryContext)_localctx).isAccess =  ((ArrayAccess_lf_primaryContext)_localctx).pno.isAccess;
			}
			}
			setState(2976);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2968);
					primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
					setState(2969);
					match(LBRACK);
					setState(2970);
					((ArrayAccess_lf_primaryContext)_localctx).i2 = expression();
					setState(2971);
					match(RBRACK);
					((ArrayAccess_lf_primaryContext)_localctx).ret =  new ArrayAccessExpression(_localctx.ret, ((ArrayAccess_lf_primaryContext)_localctx).i2.ret);
					}
					} 
				}
				setState(2978);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lfno_primaryContext extends ParserRuleContext {
		public ArrayAccessExpression ret;
		public ExpressionNameContext name;
		public ExpressionContext i;
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext pno;
		public ExpressionContext i2;
		public List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext> primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() {
			return getRuleContexts(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class);
		}
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext.class,0);
		}
		public ArrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lfno_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() throws RecognitionException {
		ArrayAccess_lfno_primaryContext _localctx = new ArrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_arrayAccess_lfno_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2991);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				{
				setState(2979);
				((ArrayAccess_lfno_primaryContext)_localctx).name = expressionName();
				setState(2980);
				match(LBRACK);
				setState(2981);
				((ArrayAccess_lfno_primaryContext)_localctx).i = expression();
				setState(2982);
				match(RBRACK);
				((ArrayAccess_lfno_primaryContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccess_lfno_primaryContext)_localctx).name.ret, ((ArrayAccess_lfno_primaryContext)_localctx).i.ret);
				}
				}
				break;
			case 2:
				{
				{
				setState(2985);
				((ArrayAccess_lfno_primaryContext)_localctx).pno = primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(2986);
				match(LBRACK);
				setState(2987);
				((ArrayAccess_lfno_primaryContext)_localctx).i = expression();
				setState(2988);
				match(RBRACK);
				((ArrayAccess_lfno_primaryContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccess_lfno_primaryContext)_localctx).pno.ret, ((ArrayAccess_lfno_primaryContext)_localctx).i.ret);
				}
				}
				break;
			}
			setState(3001);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2993);
					primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(2994);
					match(LBRACK);
					setState(2995);
					((ArrayAccess_lfno_primaryContext)_localctx).i2 = expression();
					setState(2996);
					match(RBRACK);
					((ArrayAccess_lfno_primaryContext)_localctx).ret =  new ArrayAccessExpression(_localctx.ret, ((ArrayAccess_lfno_primaryContext)_localctx).i2.ret);
					}
					} 
				}
				setState(3003);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocationContext extends ParserRuleContext {
		public Expression ret;
		public MethodNameContext mn;
		public ArgumentListContext a;
		public TypeNameContext tn;
		public TypeArgumentsContext t;
		public Token id;
		public ExpressionNameContext en;
		public PrimaryContext p;
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_methodInvocation);
		int _la;
		try {
			setState(3078);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3004);
				((MethodInvocationContext)_localctx).mn = methodName();
				setState(3005);
				match(LPAREN);
				setState(3007);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3006);
					((MethodInvocationContext)_localctx).a = argumentList();
					}
				}

				setState(3009);
				match(RPAREN);
				((MethodInvocationContext)_localctx).ret =  new CallExpression(((MethodInvocationContext)_localctx).mn.ret, ((MethodInvocationContext)_localctx).a.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3012);
				((MethodInvocationContext)_localctx).tn = typeName();
				setState(3013);
				match(DOT);
				setState(3015);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3014);
					((MethodInvocationContext)_localctx).t = typeArguments();
					}
				}

				setState(3017);
				((MethodInvocationContext)_localctx).id = match(Identifier);
				setState(3018);
				match(LPAREN);
				setState(3020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3019);
					((MethodInvocationContext)_localctx).a = argumentList();
					}
				}

				setState(3022);
				match(RPAREN);
				((MethodInvocationContext)_localctx).ret =  new CallExpression(((MethodInvocationContext)_localctx).id.getText(), ((MethodInvocationContext)_localctx).a.ret, ((MethodInvocationContext)_localctx).t.ret);
				         ((MethodInvocationContext)_localctx).ret =  new AccessExpression(((MethodInvocationContext)_localctx).tn.ret, _localctx.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3025);
				((MethodInvocationContext)_localctx).en = expressionName();
				setState(3026);
				match(DOT);
				setState(3028);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3027);
					((MethodInvocationContext)_localctx).t = typeArguments();
					}
				}

				setState(3030);
				((MethodInvocationContext)_localctx).id = match(Identifier);
				setState(3031);
				match(LPAREN);
				setState(3033);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3032);
					((MethodInvocationContext)_localctx).a = argumentList();
					}
				}

				setState(3035);
				match(RPAREN);
				((MethodInvocationContext)_localctx).ret =  new CallExpression(((MethodInvocationContext)_localctx).id.getText(), ((MethodInvocationContext)_localctx).a.ret, ((MethodInvocationContext)_localctx).t.ret);
				         ((MethodInvocationContext)_localctx).ret =  new AccessExpression(((MethodInvocationContext)_localctx).en.ret, _localctx.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3038);
				((MethodInvocationContext)_localctx).p = primary();
				setState(3039);
				match(DOT);
				setState(3041);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3040);
					((MethodInvocationContext)_localctx).t = typeArguments();
					}
				}

				setState(3043);
				((MethodInvocationContext)_localctx).id = match(Identifier);
				setState(3044);
				match(LPAREN);
				setState(3046);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3045);
					((MethodInvocationContext)_localctx).a = argumentList();
					}
				}

				setState(3048);
				match(RPAREN);
				((MethodInvocationContext)_localctx).ret =  new CallExpression(((MethodInvocationContext)_localctx).id.getText(), ((MethodInvocationContext)_localctx).a.ret, ((MethodInvocationContext)_localctx).t.ret);
				         ((MethodInvocationContext)_localctx).ret =  new AccessExpression(((MethodInvocationContext)_localctx).p.ret, _localctx.ret);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3051);
				match(SUPER);
				setState(3052);
				match(DOT);
				setState(3054);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3053);
					((MethodInvocationContext)_localctx).t = typeArguments();
					}
				}

				setState(3056);
				((MethodInvocationContext)_localctx).id = match(Identifier);
				setState(3057);
				match(LPAREN);
				setState(3059);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3058);
					((MethodInvocationContext)_localctx).a = argumentList();
					}
				}

				setState(3061);
				match(RPAREN);
				((MethodInvocationContext)_localctx).ret =  new CallExpression(((MethodInvocationContext)_localctx).id.getText(), ((MethodInvocationContext)_localctx).a.ret, ((MethodInvocationContext)_localctx).t.ret);
				         ((MethodInvocationContext)_localctx).ret =  new AccessExpression(new SuperLiteral(), _localctx.ret);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3063);
				((MethodInvocationContext)_localctx).tn = typeName();
				setState(3064);
				match(DOT);
				setState(3065);
				match(SUPER);
				setState(3066);
				match(DOT);
				setState(3068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3067);
					((MethodInvocationContext)_localctx).t = typeArguments();
					}
				}

				setState(3070);
				((MethodInvocationContext)_localctx).id = match(Identifier);
				setState(3071);
				match(LPAREN);
				setState(3073);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3072);
					((MethodInvocationContext)_localctx).a = argumentList();
					}
				}

				setState(3075);
				match(RPAREN);
				((MethodInvocationContext)_localctx).ret =  new CallExpression(((MethodInvocationContext)_localctx).id.getText(), ((MethodInvocationContext)_localctx).a.ret, ((MethodInvocationContext)_localctx).t.ret);
				         ((MethodInvocationContext)_localctx).ret =  new AccessExpression(new SuperLiteral(), _localctx.ret);
				         ((MethodInvocationContext)_localctx).ret =  new AccessExpression(((MethodInvocationContext)_localctx).tn.ret, _localctx.ret);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lf_primaryContext extends ParserRuleContext {
		public CallExpression ret;
		public TypeArgumentsContext t;
		public Token id;
		public ArgumentListContext a;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocation_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lf_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodInvocation_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocation_lf_primaryContext methodInvocation_lf_primary() throws RecognitionException {
		MethodInvocation_lf_primaryContext _localctx = new MethodInvocation_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_methodInvocation_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3080);
			match(DOT);
			setState(3082);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(3081);
				((MethodInvocation_lf_primaryContext)_localctx).t = typeArguments();
				}
			}

			setState(3084);
			((MethodInvocation_lf_primaryContext)_localctx).id = match(Identifier);
			setState(3085);
			match(LPAREN);
			setState(3087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(3086);
				((MethodInvocation_lf_primaryContext)_localctx).a = argumentList();
				}
			}

			setState(3089);
			match(RPAREN);
			((MethodInvocation_lf_primaryContext)_localctx).ret =  new CallExpression(((MethodInvocation_lf_primaryContext)_localctx).id.getText(), ((MethodInvocation_lf_primaryContext)_localctx).a.ret, ((MethodInvocation_lf_primaryContext)_localctx).t.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lfno_primaryContext extends ParserRuleContext {
		public Expression ret;
		public MethodNameContext mn;
		public ArgumentListContext a;
		public TypeNameContext tn;
		public TypeArgumentsContext t;
		public Token id;
		public ExpressionNameContext en;
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lfno_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodInvocation_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() throws RecognitionException {
		MethodInvocation_lfno_primaryContext _localctx = new MethodInvocation_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_methodInvocation_lfno_primary);
		int _la;
		try {
			setState(3153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3092);
				((MethodInvocation_lfno_primaryContext)_localctx).mn = methodName();
				setState(3093);
				match(LPAREN);
				setState(3095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3094);
					((MethodInvocation_lfno_primaryContext)_localctx).a = argumentList();
					}
				}

				setState(3097);
				match(RPAREN);
				((MethodInvocation_lfno_primaryContext)_localctx).ret =  new CallExpression(((MethodInvocation_lfno_primaryContext)_localctx).mn.ret, ((MethodInvocation_lfno_primaryContext)_localctx).a.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3100);
				((MethodInvocation_lfno_primaryContext)_localctx).tn = typeName();
				setState(3101);
				match(DOT);
				setState(3103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3102);
					((MethodInvocation_lfno_primaryContext)_localctx).t = typeArguments();
					}
				}

				setState(3105);
				((MethodInvocation_lfno_primaryContext)_localctx).id = match(Identifier);
				setState(3106);
				match(LPAREN);
				setState(3108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3107);
					((MethodInvocation_lfno_primaryContext)_localctx).a = argumentList();
					}
				}

				setState(3110);
				match(RPAREN);
				((MethodInvocation_lfno_primaryContext)_localctx).ret =  new CallExpression(((MethodInvocation_lfno_primaryContext)_localctx).id.getText(), ((MethodInvocation_lfno_primaryContext)_localctx).a.ret, ((MethodInvocation_lfno_primaryContext)_localctx).t.ret);
				         ((MethodInvocation_lfno_primaryContext)_localctx).ret =  new AccessExpression(((MethodInvocation_lfno_primaryContext)_localctx).tn.ret, _localctx.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3113);
				((MethodInvocation_lfno_primaryContext)_localctx).en = expressionName();
				setState(3114);
				match(DOT);
				setState(3116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3115);
					((MethodInvocation_lfno_primaryContext)_localctx).t = typeArguments();
					}
				}

				setState(3118);
				((MethodInvocation_lfno_primaryContext)_localctx).id = match(Identifier);
				setState(3119);
				match(LPAREN);
				setState(3121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3120);
					((MethodInvocation_lfno_primaryContext)_localctx).a = argumentList();
					}
				}

				setState(3123);
				match(RPAREN);
				((MethodInvocation_lfno_primaryContext)_localctx).ret =  new CallExpression(((MethodInvocation_lfno_primaryContext)_localctx).id.getText(), ((MethodInvocation_lfno_primaryContext)_localctx).a.ret);
				         ((MethodInvocation_lfno_primaryContext)_localctx).ret =  new AccessExpression(((MethodInvocation_lfno_primaryContext)_localctx).en.ret, _localctx.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3126);
				match(SUPER);
				setState(3127);
				match(DOT);
				setState(3129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3128);
					((MethodInvocation_lfno_primaryContext)_localctx).t = typeArguments();
					}
				}

				setState(3131);
				((MethodInvocation_lfno_primaryContext)_localctx).id = match(Identifier);
				setState(3132);
				match(LPAREN);
				setState(3134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3133);
					((MethodInvocation_lfno_primaryContext)_localctx).a = argumentList();
					}
				}

				setState(3136);
				match(RPAREN);
				((MethodInvocation_lfno_primaryContext)_localctx).ret =  new CallExpression(((MethodInvocation_lfno_primaryContext)_localctx).id.getText(), ((MethodInvocation_lfno_primaryContext)_localctx).a.ret);
				         ((MethodInvocation_lfno_primaryContext)_localctx).ret =  new AccessExpression(new SuperLiteral(), _localctx.ret);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3138);
				((MethodInvocation_lfno_primaryContext)_localctx).tn = typeName();
				setState(3139);
				match(DOT);
				setState(3140);
				match(SUPER);
				setState(3141);
				match(DOT);
				setState(3143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3142);
					((MethodInvocation_lfno_primaryContext)_localctx).t = typeArguments();
					}
				}

				setState(3145);
				((MethodInvocation_lfno_primaryContext)_localctx).id = match(Identifier);
				setState(3146);
				match(LPAREN);
				setState(3148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3147);
					((MethodInvocation_lfno_primaryContext)_localctx).a = argumentList();
					}
				}

				setState(3150);
				match(RPAREN);
				((MethodInvocation_lfno_primaryContext)_localctx).ret =  new CallExpression(((MethodInvocation_lfno_primaryContext)_localctx).id.getText(), ((MethodInvocation_lfno_primaryContext)_localctx).a.ret);
				         ((MethodInvocation_lfno_primaryContext)_localctx).ret =  new AccessExpression(new SuperLiteral(), _localctx.ret);
				         ((MethodInvocation_lfno_primaryContext)_localctx).ret =  new AccessExpression(((MethodInvocation_lfno_primaryContext)_localctx).tn.ret, _localctx.ret);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<Expression> ret;
		public List<Expression> ls = new ArrayList<>();;
		public ExpressionContext e;
		public ExpressionContext ex;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3155);
			((ArgumentListContext)_localctx).e = expression();
			_localctx.ls.add(((ArgumentListContext)_localctx).e.ret);
			}
			setState(3164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3158);
				match(COMMA);
				setState(3159);
				((ArgumentListContext)_localctx).ex = expression();
				_localctx.ls.add(((ArgumentListContext)_localctx).ex.ret);
				}
				}
				setState(3166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((ArgumentListContext)_localctx).ret =  _localctx.ls;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReferenceContext extends ParserRuleContext {
		public Expression ret;
		public ExpressionNameContext en;
		public TypeArgumentsContext t;
		public Token id;
		public ReferenceTypeContext r;
		public PrimaryContext p;
		public TypeNameContext tn;
		public ClassTypeContext c;
		public ArrayTypeContext a;
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReferenceContext methodReference() throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_methodReference);
		int _la;
		try {
			setState(3223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3169);
				((MethodReferenceContext)_localctx).en = expressionName();
				setState(3170);
				match(COLONCOLON);
				setState(3172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3171);
					((MethodReferenceContext)_localctx).t = typeArguments();
					}
				}

				setState(3174);
				((MethodReferenceContext)_localctx).id = match(Identifier);
				((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(((MethodReferenceContext)_localctx).en.ret, ((MethodReferenceContext)_localctx).id.getText(), ((MethodReferenceContext)_localctx).t.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3177);
				((MethodReferenceContext)_localctx).r = referenceType();
				setState(3178);
				match(COLONCOLON);
				setState(3180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3179);
					((MethodReferenceContext)_localctx).t = typeArguments();
					}
				}

				setState(3182);
				((MethodReferenceContext)_localctx).id = match(Identifier);
				((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(new TypeExpression(((MethodReferenceContext)_localctx).r.ret),
				                                              ((MethodReferenceContext)_localctx).id.getText(),
				                                              ((MethodReferenceContext)_localctx).t.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3185);
				((MethodReferenceContext)_localctx).p = primary();
				setState(3186);
				match(COLONCOLON);
				setState(3188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3187);
					((MethodReferenceContext)_localctx).t = typeArguments();
					}
				}

				setState(3190);
				((MethodReferenceContext)_localctx).id = match(Identifier);
				((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(((MethodReferenceContext)_localctx).p.ret, ((MethodReferenceContext)_localctx).id.getText(), ((MethodReferenceContext)_localctx).t.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3193);
				match(SUPER);
				setState(3194);
				match(COLONCOLON);
				setState(3196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3195);
					((MethodReferenceContext)_localctx).t = typeArguments();
					}
				}

				setState(3198);
				((MethodReferenceContext)_localctx).id = match(Identifier);
				((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(new SuperLiteral(),
				                                              ((MethodReferenceContext)_localctx).id.getText(),
				                                              ((MethodReferenceContext)_localctx).t.ret);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3200);
				((MethodReferenceContext)_localctx).tn = typeName();
				setState(3201);
				match(DOT);
				setState(3202);
				match(SUPER);
				setState(3203);
				match(COLONCOLON);
				setState(3205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3204);
					((MethodReferenceContext)_localctx).t = typeArguments();
					}
				}

				setState(3207);
				((MethodReferenceContext)_localctx).id = match(Identifier);

				            ((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(new SuperLiteral(),
				                                                 ((MethodReferenceContext)_localctx).id.getText(),
				                                                 ((MethodReferenceContext)_localctx).t.ret);
				            ((MethodReferenceContext)_localctx).ret =  new AccessExpression(new IdentifierExpression(((MethodReferenceContext)_localctx).tn.ret),
				                                        _localctx.ret);
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3210);
				((MethodReferenceContext)_localctx).c = classType();
				setState(3211);
				match(COLONCOLON);
				setState(3213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3212);
					((MethodReferenceContext)_localctx).t = typeArguments();
					}
				}

				setState(3215);
				match(NEW);
				((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(new TypeExpression(((MethodReferenceContext)_localctx).c.ret),
				                                              "new",
				                                              ((MethodReferenceContext)_localctx).t.ret);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3218);
				((MethodReferenceContext)_localctx).a = arrayType();
				setState(3219);
				match(COLONCOLON);
				setState(3220);
				match(NEW);
				((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(new TypeExpression(((MethodReferenceContext)_localctx).a.ret),
				                                              "new");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lf_primaryContext extends ParserRuleContext {
		public MethodReferenceExpression ret;
		public TypeArgumentsContext t;
		public Token id;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public MethodReference_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lf_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodReference_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReference_lf_primaryContext methodReference_lf_primary() throws RecognitionException {
		MethodReference_lf_primaryContext _localctx = new MethodReference_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_methodReference_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3225);
			match(COLONCOLON);
			setState(3227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(3226);
				((MethodReference_lf_primaryContext)_localctx).t = typeArguments();
				}
			}

			setState(3229);
			((MethodReference_lf_primaryContext)_localctx).id = match(Identifier);
			((MethodReference_lf_primaryContext)_localctx).ret =  new MethodReferenceExpression(((MethodReference_lf_primaryContext)_localctx).id.getText(), ((MethodReference_lf_primaryContext)_localctx).t.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lfno_primaryContext extends ParserRuleContext {
		public Expression ret;
		public ExpressionNameContext en;
		public TypeArgumentsContext t;
		public Token id;
		public ReferenceTypeContext r;
		public TypeNameContext tn;
		public ClassTypeContext c;
		public ArrayTypeContext a;
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodReference_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lfno_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMethodReference_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReference_lfno_primaryContext methodReference_lfno_primary() throws RecognitionException {
		MethodReference_lfno_primaryContext _localctx = new MethodReference_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_methodReference_lfno_primary);
		int _la;
		try {
			setState(3278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3232);
				((MethodReference_lfno_primaryContext)_localctx).en = expressionName();
				setState(3233);
				match(COLONCOLON);
				setState(3235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3234);
					((MethodReference_lfno_primaryContext)_localctx).t = typeArguments();
					}
				}

				setState(3237);
				((MethodReference_lfno_primaryContext)_localctx).id = match(Identifier);
				((MethodReference_lfno_primaryContext)_localctx).ret =  new MethodReferenceExpression(((MethodReference_lfno_primaryContext)_localctx).en.ret, ((MethodReference_lfno_primaryContext)_localctx).id.getText(), ((MethodReference_lfno_primaryContext)_localctx).t.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3240);
				((MethodReference_lfno_primaryContext)_localctx).r = referenceType();
				setState(3241);
				match(COLONCOLON);
				setState(3243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3242);
					((MethodReference_lfno_primaryContext)_localctx).t = typeArguments();
					}
				}

				setState(3245);
				((MethodReference_lfno_primaryContext)_localctx).id = match(Identifier);
				((MethodReference_lfno_primaryContext)_localctx).ret =  new MethodReferenceExpression(new TypeExpression(((MethodReference_lfno_primaryContext)_localctx).r.ret),
				                                              ((MethodReference_lfno_primaryContext)_localctx).id.getText(),
				                                              ((MethodReference_lfno_primaryContext)_localctx).t.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3248);
				match(SUPER);
				setState(3249);
				match(COLONCOLON);
				setState(3251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3250);
					((MethodReference_lfno_primaryContext)_localctx).t = typeArguments();
					}
				}

				setState(3253);
				((MethodReference_lfno_primaryContext)_localctx).id = match(Identifier);
				((MethodReference_lfno_primaryContext)_localctx).ret =  new MethodReferenceExpression(new SuperLiteral(),
				                                              ((MethodReference_lfno_primaryContext)_localctx).id.getText(),
				                                              ((MethodReference_lfno_primaryContext)_localctx).t.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3255);
				((MethodReference_lfno_primaryContext)_localctx).tn = typeName();
				setState(3256);
				match(DOT);
				setState(3257);
				match(SUPER);
				setState(3258);
				match(COLONCOLON);
				setState(3260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3259);
					((MethodReference_lfno_primaryContext)_localctx).t = typeArguments();
					}
				}

				setState(3262);
				((MethodReference_lfno_primaryContext)_localctx).id = match(Identifier);

				            ((MethodReference_lfno_primaryContext)_localctx).ret =  new MethodReferenceExpression(new SuperLiteral(),
				                                                 ((MethodReference_lfno_primaryContext)_localctx).id.getText(),
				                                                 ((MethodReference_lfno_primaryContext)_localctx).t.ret);
				            ((MethodReference_lfno_primaryContext)_localctx).ret =  new AccessExpression(new IdentifierExpression(((MethodReference_lfno_primaryContext)_localctx).tn.ret),
				                                        _localctx.ret);
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3265);
				((MethodReference_lfno_primaryContext)_localctx).c = classType();
				setState(3266);
				match(COLONCOLON);
				setState(3268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3267);
					((MethodReference_lfno_primaryContext)_localctx).t = typeArguments();
					}
				}

				setState(3270);
				match(NEW);
				((MethodReference_lfno_primaryContext)_localctx).ret =  new MethodReferenceExpression(new TypeExpression(((MethodReference_lfno_primaryContext)_localctx).c.ret),
				                                              "new",
				                                              ((MethodReference_lfno_primaryContext)_localctx).t.ret);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3273);
				((MethodReference_lfno_primaryContext)_localctx).a = arrayType();
				setState(3274);
				match(COLONCOLON);
				setState(3275);
				match(NEW);
				((MethodReference_lfno_primaryContext)_localctx).ret =  new MethodReferenceExpression(new TypeExpression(((MethodReference_lfno_primaryContext)_localctx).a.ret),
				                                              "new");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreationExpressionContext extends ParserRuleContext {
		public ArrayConstruction ret;
		public PrimitiveTypeContext p;
		public DimExprsContext de;
		public DimsContext d;
		public ClassOrInterfaceTypeContext c;
		public ArrayInitializerContext i;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreationExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitArrayCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreationExpressionContext arrayCreationExpression() throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_arrayCreationExpression);
		try {
			setState(3308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3280);
				match(NEW);
				setState(3281);
				((ArrayCreationExpressionContext)_localctx).p = primitiveType();
				setState(3282);
				((ArrayCreationExpressionContext)_localctx).de = dimExprs();
				setState(3284);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
				case 1:
					{
					setState(3283);
					((ArrayCreationExpressionContext)_localctx).d = dims();
					}
					break;
				}
				((ArrayCreationExpressionContext)_localctx).ret =  new ArrayConstruction(((ArrayCreationExpressionContext)_localctx).p.ret, ((ArrayCreationExpressionContext)_localctx).de.ret, ((ArrayCreationExpressionContext)_localctx).d.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3288);
				match(NEW);
				setState(3289);
				((ArrayCreationExpressionContext)_localctx).c = classOrInterfaceType();
				setState(3290);
				((ArrayCreationExpressionContext)_localctx).de = dimExprs();
				setState(3292);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(3291);
					((ArrayCreationExpressionContext)_localctx).d = dims();
					}
					break;
				}
				((ArrayCreationExpressionContext)_localctx).ret =  new ArrayConstruction(((ArrayCreationExpressionContext)_localctx).c.ret, ((ArrayCreationExpressionContext)_localctx).de.ret, ((ArrayCreationExpressionContext)_localctx).d.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3296);
				match(NEW);
				setState(3297);
				((ArrayCreationExpressionContext)_localctx).p = primitiveType();
				setState(3298);
				((ArrayCreationExpressionContext)_localctx).d = dims();
				setState(3299);
				((ArrayCreationExpressionContext)_localctx).i = arrayInitializer();
				((ArrayCreationExpressionContext)_localctx).ret =  new ArrayConstruction(((ArrayCreationExpressionContext)_localctx).p.ret, ((ArrayCreationExpressionContext)_localctx).d.ret, ((ArrayCreationExpressionContext)_localctx).i.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3302);
				match(NEW);
				setState(3303);
				((ArrayCreationExpressionContext)_localctx).c = classOrInterfaceType();
				setState(3304);
				((ArrayCreationExpressionContext)_localctx).d = dims();
				setState(3305);
				((ArrayCreationExpressionContext)_localctx).i = arrayInitializer();
				((ArrayCreationExpressionContext)_localctx).ret =  new ArrayConstruction(((ArrayCreationExpressionContext)_localctx).c.ret, ((ArrayCreationExpressionContext)_localctx).d.ret, ((ArrayCreationExpressionContext)_localctx).i.ret);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprsContext extends ParserRuleContext {
		public List<DimensionExpression> ret;
		public DimExprContext d1;
		public DimExprContext d;
		public List<DimExprContext> dimExpr() {
			return getRuleContexts(DimExprContext.class);
		}
		public DimExprContext dimExpr(int i) {
			return getRuleContext(DimExprContext.class,i);
		}
		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExprs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDimExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3310);
			((DimExprsContext)_localctx).d1 = dimExpr();
			((DimExprsContext)_localctx).ret =  new ArrayList<>(); _localctx.ret.add(((DimExprsContext)_localctx).d1.ret);
			setState(3317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3312);
					((DimExprsContext)_localctx).d = dimExpr();
					_localctx.ret.add(((DimExprsContext)_localctx).d.ret);
					}
					} 
				}
				setState(3319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprContext extends ParserRuleContext {
		public DimensionExpression ret;
		public List<Annotation> ans = new ArrayList<>();;
		public AnnotationContext a;
		public ExpressionContext ex;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitDimExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_dimExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(3320);
				((DimExprContext)_localctx).a = annotation();
				_localctx.ans.add(((DimExprContext)_localctx).a.ret);
				}
				}
				setState(3327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3328);
			match(LBRACK);
			setState(3329);
			((DimExprContext)_localctx).ex = expression();
			setState(3330);
			match(RBRACK);
			((DimExprContext)_localctx).ret =  new DimensionExpression(_localctx.ans, ((DimExprContext)_localctx).ex.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public Expression ret;
		public ExpressionContext ex;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3333);
			((ConstantExpressionContext)_localctx).ex = expression();
			((ConstantExpressionContext)_localctx).ret =  ((ConstantExpressionContext)_localctx).ex.ret;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Expression ret;
		public LambdaExpressionContext l;
		public AssignmentExpressionContext a;
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_expression);
		try {
			setState(3342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3336);
				((ExpressionContext)_localctx).l = lambdaExpression();
				((ExpressionContext)_localctx).ret =  ((ExpressionContext)_localctx).l.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3339);
				((ExpressionContext)_localctx).a = assignmentExpression();
				((ExpressionContext)_localctx).ret =  ((ExpressionContext)_localctx).a.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaExpression ret;
		public LambdaParametersContext p;
		public LambdaBodyContext b;
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3344);
			((LambdaExpressionContext)_localctx).p = lambdaParameters();
			setState(3345);
			match(ARROW);
			setState(3346);
			((LambdaExpressionContext)_localctx).b = lambdaBody();
			((LambdaExpressionContext)_localctx).ret =  new LambdaExpression(((LambdaExpressionContext)_localctx).p.ret, ((LambdaExpressionContext)_localctx).b.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public List<VariableDeclaration> ret;
		public List<VariableDeclaration> vars = new ArrayList<>();;
		public Token id;
		public FormalParameterListContext p;
		public InferredFormalParameterListContext i;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public InferredFormalParameterListContext inferredFormalParameterList() {
			return getRuleContext(InferredFormalParameterListContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLambdaParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_lambdaParameters);
		int _la;
		try {
			setState(3362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3349);
				((LambdaParametersContext)_localctx).id = match(Identifier);
				_localctx.vars.add(new VariableDeclaration(((LambdaParametersContext)_localctx).id.getText()));
				         ((LambdaParametersContext)_localctx).ret =  _localctx.vars;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3351);
				match(LPAREN);
				setState(3353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
					{
					setState(3352);
					((LambdaParametersContext)_localctx).p = formalParameterList();
					}
				}

				setState(3355);
				match(RPAREN);
				((LambdaParametersContext)_localctx).ret =  ((LambdaParametersContext)_localctx).p.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3357);
				match(LPAREN);
				setState(3358);
				((LambdaParametersContext)_localctx).i = inferredFormalParameterList();
				setState(3359);
				match(RPAREN);
				((LambdaParametersContext)_localctx).ret =  ((LambdaParametersContext)_localctx).i.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InferredFormalParameterListContext extends ParserRuleContext {
		public List<VariableDeclaration> ret;
		public List<VariableDeclaration> vars = new ArrayList<>();;
		public Token id;
		public Token i;
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public InferredFormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferredFormalParameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInferredFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InferredFormalParameterListContext inferredFormalParameterList() throws RecognitionException {
		InferredFormalParameterListContext _localctx = new InferredFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3364);
			((InferredFormalParameterListContext)_localctx).id = match(Identifier);
			_localctx.vars.add(new VariableDeclaration(((InferredFormalParameterListContext)_localctx).id.getText()));
			}
			setState(3372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3367);
				match(COMMA);
				setState(3368);
				((InferredFormalParameterListContext)_localctx).i = match(Identifier);
				_localctx.vars.add(new VariableDeclaration(((InferredFormalParameterListContext)_localctx).i.getText()));
				}
				}
				setState(3374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((InferredFormalParameterListContext)_localctx).ret =  _localctx.vars;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public Block ret;
		public ExpressionContext e;
		public BlockContext body;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLambdaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_lambdaBody);
		try {
			setState(3383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(3377);
				((LambdaBodyContext)_localctx).e = expression();
				((LambdaBodyContext)_localctx).ret =  new Block(((LambdaBodyContext)_localctx).e.ret);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(3380);
				((LambdaBodyContext)_localctx).body = block();
				((LambdaBodyContext)_localctx).ret =  ((LambdaBodyContext)_localctx).body.ret;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public Expression ret;
		public ConditionalExpressionContext c;
		public AssignmentContext a;
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_assignmentExpression);
		try {
			setState(3391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3385);
				((AssignmentExpressionContext)_localctx).c = conditionalExpression();
				((AssignmentExpressionContext)_localctx).ret =  ((AssignmentExpressionContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3388);
				((AssignmentExpressionContext)_localctx).a = assignment();
				((AssignmentExpressionContext)_localctx).ret =  ((AssignmentExpressionContext)_localctx).a.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentExpression ret;
		public LeftHandSideContext l;
		public AssignmentOperatorContext op;
		public ExpressionContext r;
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3393);
			((AssignmentContext)_localctx).l = leftHandSide();
			setState(3394);
			((AssignmentContext)_localctx).op = assignmentOperator();
			setState(3395);
			((AssignmentContext)_localctx).r = expression();
			((AssignmentContext)_localctx).ret =  new AssignmentExpression(((AssignmentContext)_localctx).l.ret, ((AssignmentContext)_localctx).op.ret, ((AssignmentContext)_localctx).r.ret);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftHandSideContext extends ParserRuleContext {
		public Expression ret;
		public ExpressionNameContext n;
		public FieldAccessContext f;
		public ArrayAccessContext a;
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitLeftHandSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_leftHandSide);
		try {
			setState(3407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3398);
				((LeftHandSideContext)_localctx).n = expressionName();
				((LeftHandSideContext)_localctx).ret =  new IdentifierExpression(((LeftHandSideContext)_localctx).n.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3401);
				((LeftHandSideContext)_localctx).f = fieldAccess();
				((LeftHandSideContext)_localctx).ret =  ((LeftHandSideContext)_localctx).f.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3404);
				((LeftHandSideContext)_localctx).a = arrayAccess();
				((LeftHandSideContext)_localctx).ret =  ((LeftHandSideContext)_localctx).a.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperator ret;
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_assignmentOperator);
		try {
			setState(3433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(3409);
				match(ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.EQUALS;
				}
				break;
			case MUL_ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(3411);
				match(MUL_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.MULTIPLICATION;
				}
				break;
			case DIV_ASSIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(3413);
				match(DIV_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.DIVISION;
				}
				break;
			case MOD_ASSIGN:
				enterOuterAlt(_localctx, 4);
				{
				setState(3415);
				match(MOD_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.MODULUS;
				}
				break;
			case ADD_ASSIGN:
				enterOuterAlt(_localctx, 5);
				{
				setState(3417);
				match(ADD_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.ADDITION;
				}
				break;
			case SUB_ASSIGN:
				enterOuterAlt(_localctx, 6);
				{
				setState(3419);
				match(SUB_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.SUBTRACTION;
				}
				break;
			case LSHIFT_ASSIGN:
				enterOuterAlt(_localctx, 7);
				{
				setState(3421);
				match(LSHIFT_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.LEFT_SHIFT;
				}
				break;
			case RSHIFT_ASSIGN:
				enterOuterAlt(_localctx, 8);
				{
				setState(3423);
				match(RSHIFT_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.RIGHT_SHIFT;
				}
				break;
			case URSHIFT_ASSIGN:
				enterOuterAlt(_localctx, 9);
				{
				setState(3425);
				match(URSHIFT_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.RIGHT_LOGICAL_SHIFT;
				}
				break;
			case AND_ASSIGN:
				enterOuterAlt(_localctx, 10);
				{
				setState(3427);
				match(AND_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.BITWISE_AND;
				}
				break;
			case XOR_ASSIGN:
				enterOuterAlt(_localctx, 11);
				{
				setState(3429);
				match(XOR_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.BITWISE_XOR;
				}
				break;
			case OR_ASSIGN:
				enterOuterAlt(_localctx, 12);
				{
				setState(3431);
				match(OR_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.BITWISE_OR;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public Expression ret;
		public ConditionalOrExpressionContext c;
		public ExpressionContext i;
		public ConditionalExpressionContext el;
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_conditionalExpression);
		try {
			setState(3445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3435);
				((ConditionalExpressionContext)_localctx).c = conditionalOrExpression(0);
				((ConditionalExpressionContext)_localctx).ret =  ((ConditionalExpressionContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3438);
				((ConditionalExpressionContext)_localctx).c = conditionalOrExpression(0);
				setState(3439);
				match(QUESTION);
				setState(3440);
				((ConditionalExpressionContext)_localctx).i = expression();
				setState(3441);
				match(COLON);
				setState(3442);
				((ConditionalExpressionContext)_localctx).el = conditionalExpression();
				((ConditionalExpressionContext)_localctx).ret =  new TernaryExpression(((ConditionalExpressionContext)_localctx).c.ret, ((ConditionalExpressionContext)_localctx).i.ret, ((ConditionalExpressionContext)_localctx).el.ret);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public Expression ret;
		public ConditionalOrExpressionContext c1;
		public ConditionalAndExpressionContext c;
		public ConditionalAndExpressionContext c2;
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConditionalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 436;
		enterRecursionRule(_localctx, 436, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3448);
			((ConditionalOrExpressionContext)_localctx).c = conditionalAndExpression(0);
			((ConditionalOrExpressionContext)_localctx).ret =  ((ConditionalOrExpressionContext)_localctx).c.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3458);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					_localctx.c1 = _prevctx;
					_localctx.c1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(3451);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3452);
					match(OR);
					setState(3453);
					((ConditionalOrExpressionContext)_localctx).c2 = conditionalAndExpression(0);
					((ConditionalOrExpressionContext)_localctx).ret =  new BinaryExpression(((ConditionalOrExpressionContext)_localctx).c1.ret, BinaryOperator.OR, ((ConditionalOrExpressionContext)_localctx).c2.ret);
					}
					} 
				}
				setState(3460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public Expression ret;
		public ConditionalAndExpressionContext l;
		public InclusiveOrExpressionContext i;
		public InclusiveOrExpressionContext r;
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 438;
		enterRecursionRule(_localctx, 438, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3462);
			((ConditionalAndExpressionContext)_localctx).i = inclusiveOrExpression(0);
			((ConditionalAndExpressionContext)_localctx).ret =  ((ConditionalAndExpressionContext)_localctx).i.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3472);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(3465);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3466);
					match(AND);
					setState(3467);
					((ConditionalAndExpressionContext)_localctx).r = inclusiveOrExpression(0);
					((ConditionalAndExpressionContext)_localctx).ret =  new BinaryExpression(((ConditionalAndExpressionContext)_localctx).l.ret, BinaryOperator.AND, ((ConditionalAndExpressionContext)_localctx).r.ret);
					}
					} 
				}
				setState(3474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public Expression ret;
		public InclusiveOrExpressionContext l;
		public ExclusiveOrExpressionContext ex;
		public ExclusiveOrExpressionContext r;
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 440;
		enterRecursionRule(_localctx, 440, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3476);
			((InclusiveOrExpressionContext)_localctx).ex = exclusiveOrExpression(0);
			((InclusiveOrExpressionContext)_localctx).ret =  ((InclusiveOrExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3486);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(3479);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3480);
					match(BITOR);
					setState(3481);
					((InclusiveOrExpressionContext)_localctx).r = exclusiveOrExpression(0);
					((InclusiveOrExpressionContext)_localctx).ret =  new BinaryExpression(((InclusiveOrExpressionContext)_localctx).l.ret,BinaryOperator.BITWISE_OR, ((InclusiveOrExpressionContext)_localctx).r.ret);
					}
					} 
				}
				setState(3488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public Expression ret;
		public ExclusiveOrExpressionContext l;
		public AndExpressionContext ex;
		public AndExpressionContext r;
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 442;
		enterRecursionRule(_localctx, 442, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3490);
			((ExclusiveOrExpressionContext)_localctx).ex = andExpression(0);
			((ExclusiveOrExpressionContext)_localctx).ret =  ((ExclusiveOrExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3500);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(3493);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3494);
					match(CARET);
					setState(3495);
					((ExclusiveOrExpressionContext)_localctx).r = andExpression(0);
					((ExclusiveOrExpressionContext)_localctx).ret =  new BinaryExpression(((ExclusiveOrExpressionContext)_localctx).l.ret, BinaryOperator.BITWISE_XOR, ((ExclusiveOrExpressionContext)_localctx).r.ret);
					}
					} 
				}
				setState(3502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public Expression ret;
		public AndExpressionContext l;
		public EqualityExpressionContext ex;
		public EqualityExpressionContext r;
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 444;
		enterRecursionRule(_localctx, 444, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3504);
			((AndExpressionContext)_localctx).ex = equalityExpression(0);
			((AndExpressionContext)_localctx).ret =  ((AndExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3514);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(3507);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3508);
					match(BITAND);
					setState(3509);
					((AndExpressionContext)_localctx).r = equalityExpression(0);
					((AndExpressionContext)_localctx).ret =  new BinaryExpression(((AndExpressionContext)_localctx).l.ret, BinaryOperator.BITWISE_AND, ((AndExpressionContext)_localctx).r.ret);
					}
					} 
				}
				setState(3516);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public Expression ret;
		public EqualityExpressionContext l;
		public RelationalExpressionContext ex;
		public RelationalExpressionContext r;
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 446;
		enterRecursionRule(_localctx, 446, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3518);
			((EqualityExpressionContext)_localctx).ex = relationalExpression(0);
			((EqualityExpressionContext)_localctx).ret =  ((EqualityExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3533);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3531);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(3521);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3522);
						match(EQUAL);
						setState(3523);
						((EqualityExpressionContext)_localctx).r = relationalExpression(0);
						((EqualityExpressionContext)_localctx).ret =  new BinaryExpression(((EqualityExpressionContext)_localctx).l.ret, BinaryOperator.EQUALITY, ((EqualityExpressionContext)_localctx).r.ret);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(3526);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3527);
						match(NOTEQUAL);
						setState(3528);
						((EqualityExpressionContext)_localctx).r = relationalExpression(0);
						((EqualityExpressionContext)_localctx).ret =  new BinaryExpression(((EqualityExpressionContext)_localctx).l.ret, BinaryOperator.INEQUALITY, ((EqualityExpressionContext)_localctx).r.ret);
						}
						break;
					}
					} 
				}
				setState(3535);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public Expression ret;
		public RelationalExpressionContext l;
		public ShiftExpressionContext ex;
		public ShiftExpressionContext r;
		public ReferenceTypeContext rt;
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 448;
		enterRecursionRule(_localctx, 448, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3537);
			((RelationalExpressionContext)_localctx).ex = shiftExpression(0);
			((RelationalExpressionContext)_localctx).ret =  ((RelationalExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3565);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(3540);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(3541);
						match(LT);
						setState(3542);
						((RelationalExpressionContext)_localctx).r = shiftExpression(0);
						((RelationalExpressionContext)_localctx).ret =  new BinaryExpression(((RelationalExpressionContext)_localctx).l.ret, BinaryOperator.LESS_THAN, ((RelationalExpressionContext)_localctx).r.ret);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(3545);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(3546);
						match(GT);
						setState(3547);
						((RelationalExpressionContext)_localctx).r = shiftExpression(0);
						((RelationalExpressionContext)_localctx).ret =  new BinaryExpression(((RelationalExpressionContext)_localctx).l.ret, BinaryOperator.GREATER_THAN, ((RelationalExpressionContext)_localctx).r.ret);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(3550);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(3551);
						match(LE);
						setState(3552);
						((RelationalExpressionContext)_localctx).r = shiftExpression(0);
						((RelationalExpressionContext)_localctx).ret =  new BinaryExpression(((RelationalExpressionContext)_localctx).l.ret, BinaryOperator.LESS_THAN_OR_EQUAL, ((RelationalExpressionContext)_localctx).r.ret);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(3555);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3556);
						match(GE);
						setState(3557);
						((RelationalExpressionContext)_localctx).r = shiftExpression(0);
						((RelationalExpressionContext)_localctx).ret =  new BinaryExpression(((RelationalExpressionContext)_localctx).l.ret, BinaryOperator.GREATER_THAN_OR_EQUAL, ((RelationalExpressionContext)_localctx).r.ret);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(3560);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3561);
						match(INSTANCEOF);
						setState(3562);
						((RelationalExpressionContext)_localctx).rt = referenceType();
						((RelationalExpressionContext)_localctx).ret =  new BinaryExpression(((RelationalExpressionContext)_localctx).l.ret,
						                                               BinaryOperator.INSTANCE_OF,
						                                               new TypeExpression(((RelationalExpressionContext)_localctx).rt.ret));
						}
						break;
					}
					} 
				}
				setState(3569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public Expression ret;
		public ShiftExpressionContext l;
		public AdditiveExpressionContext ex;
		public AdditiveExpressionContext r;
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 450;
		enterRecursionRule(_localctx, 450, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3571);
			((ShiftExpressionContext)_localctx).ex = additiveExpression(0);
			((ShiftExpressionContext)_localctx).ret =  ((ShiftExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3595);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3593);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(3574);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(3575);
						match(LT);
						setState(3576);
						match(LT);
						setState(3577);
						((ShiftExpressionContext)_localctx).r = additiveExpression(0);
						((ShiftExpressionContext)_localctx).ret =  new BinaryExpression(((ShiftExpressionContext)_localctx).l.ret, BinaryOperator.LEFT_SHIFT, ((ShiftExpressionContext)_localctx).r.ret);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(3580);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3581);
						match(GT);
						setState(3582);
						match(GT);
						setState(3583);
						((ShiftExpressionContext)_localctx).r = additiveExpression(0);
						((ShiftExpressionContext)_localctx).ret =  new BinaryExpression(((ShiftExpressionContext)_localctx).l.ret, BinaryOperator.RIGHT_SHIFT, ((ShiftExpressionContext)_localctx).r.ret);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(3586);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3587);
						match(GT);
						setState(3588);
						match(GT);
						setState(3589);
						match(GT);
						setState(3590);
						((ShiftExpressionContext)_localctx).r = additiveExpression(0);
						((ShiftExpressionContext)_localctx).ret =  new BinaryExpression(((ShiftExpressionContext)_localctx).l.ret, BinaryOperator.RIGHT_LOGICAL_SHIFT, ((ShiftExpressionContext)_localctx).r.ret);
						}
						break;
					}
					} 
				}
				setState(3597);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Expression ret;
		public AdditiveExpressionContext l;
		public MultiplicativeExpressionContext ex;
		public MultiplicativeExpressionContext r;
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 452;
		enterRecursionRule(_localctx, 452, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3599);
			((AdditiveExpressionContext)_localctx).ex = multiplicativeExpression(0);
			((AdditiveExpressionContext)_localctx).ret =  ((AdditiveExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3614);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3612);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(3602);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3603);
						match(ADD);
						setState(3604);
						((AdditiveExpressionContext)_localctx).r = multiplicativeExpression(0);
						((AdditiveExpressionContext)_localctx).ret =  new BinaryExpression(((AdditiveExpressionContext)_localctx).l.ret, BinaryOperator.ADDITION, ((AdditiveExpressionContext)_localctx).r.ret);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(3607);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3608);
						match(SUB);
						setState(3609);
						((AdditiveExpressionContext)_localctx).r = multiplicativeExpression(0);
						((AdditiveExpressionContext)_localctx).ret =  new BinaryExpression(((AdditiveExpressionContext)_localctx).l.ret, BinaryOperator.SUBTRACTION, ((AdditiveExpressionContext)_localctx).r.ret);
						}
						break;
					}
					} 
				}
				setState(3616);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public Expression ret;
		public MultiplicativeExpressionContext l;
		public UnaryExpressionContext ex;
		public UnaryExpressionContext r;
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 454;
		enterRecursionRule(_localctx, 454, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3618);
			((MultiplicativeExpressionContext)_localctx).ex = unaryExpression();
			((MultiplicativeExpressionContext)_localctx).ret =  ((MultiplicativeExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3638);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3636);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(3621);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(3622);
						match(MUL);
						setState(3623);
						((MultiplicativeExpressionContext)_localctx).r = unaryExpression();
						((MultiplicativeExpressionContext)_localctx).ret =  new BinaryExpression(((MultiplicativeExpressionContext)_localctx).l.ret, BinaryOperator.MULTIPLICATION, ((MultiplicativeExpressionContext)_localctx).r.ret);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(3626);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3627);
						match(DIV);
						setState(3628);
						((MultiplicativeExpressionContext)_localctx).r = unaryExpression();
						((MultiplicativeExpressionContext)_localctx).ret =  new BinaryExpression(((MultiplicativeExpressionContext)_localctx).l.ret, BinaryOperator.DIVISION, ((MultiplicativeExpressionContext)_localctx).r.ret);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(3631);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3632);
						match(MOD);
						setState(3633);
						((MultiplicativeExpressionContext)_localctx).r = unaryExpression();
						((MultiplicativeExpressionContext)_localctx).ret =  new BinaryExpression(((MultiplicativeExpressionContext)_localctx).l.ret, BinaryOperator.MODULUS, ((MultiplicativeExpressionContext)_localctx).r.ret);
						}
						break;
					}
					} 
				}
				setState(3640);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public Expression ret;
		public PreIncrementExpressionContext pi;
		public PreDecrementExpressionContext pd;
		public UnaryExpressionContext ex;
		public UnaryExpressionNotPlusMinusContext npm;
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_unaryExpression);
		try {
			setState(3658);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(3641);
				((UnaryExpressionContext)_localctx).pi = preIncrementExpression();
				((UnaryExpressionContext)_localctx).ret =  ((UnaryExpressionContext)_localctx).pi.ret;
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(3644);
				((UnaryExpressionContext)_localctx).pd = preDecrementExpression();
				((UnaryExpressionContext)_localctx).ret =  ((UnaryExpressionContext)_localctx).pd.ret;
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(3647);
				match(ADD);
				setState(3648);
				((UnaryExpressionContext)_localctx).ex = unaryExpression();
				((UnaryExpressionContext)_localctx).ret =  ((UnaryExpressionContext)_localctx).ex.ret;
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(3651);
				match(SUB);
				setState(3652);
				((UnaryExpressionContext)_localctx).ex = unaryExpression();
				((UnaryExpressionContext)_localctx).ret =  new UnaryExpression(((UnaryExpressionContext)_localctx).ex.ret, UnaryOperator.NEGATION);
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(3655);
				((UnaryExpressionContext)_localctx).npm = unaryExpressionNotPlusMinus();
				((UnaryExpressionContext)_localctx).ret =  ((UnaryExpressionContext)_localctx).npm.ret;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreIncrementExpressionContext extends ParserRuleContext {
		public UnaryExpression ret;
		public UnaryExpressionContext ex;
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPreIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreIncrementExpressionContext preIncrementExpression() throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3660);
			match(INC);
			setState(3661);
			((PreIncrementExpressionContext)_localctx).ex = unaryExpression();
			((PreIncrementExpressionContext)_localctx).ret =  new UnaryExpression(((PreIncrementExpressionContext)_localctx).ex.ret, UnaryOperator.PRE_INCREMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreDecrementExpressionContext extends ParserRuleContext {
		public UnaryExpression ret;
		public UnaryExpressionContext ex;
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPreDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreDecrementExpressionContext preDecrementExpression() throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3664);
			match(DEC);
			setState(3665);
			((PreDecrementExpressionContext)_localctx).ex = unaryExpression();
			((PreDecrementExpressionContext)_localctx).ret =  new UnaryExpression(((PreDecrementExpressionContext)_localctx).ex.ret, UnaryOperator.PRE_DECREMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public Expression ret;
		public PostfixExpressionContext pf;
		public UnaryExpressionContext ex;
		public CastExpressionContext cex;
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitUnaryExpressionNotPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(3682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3668);
				((UnaryExpressionNotPlusMinusContext)_localctx).pf = postfixExpression();
				((UnaryExpressionNotPlusMinusContext)_localctx).ret =  ((UnaryExpressionNotPlusMinusContext)_localctx).pf.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3671);
				match(TILDE);
				setState(3672);
				((UnaryExpressionNotPlusMinusContext)_localctx).ex = unaryExpression();
				((UnaryExpressionNotPlusMinusContext)_localctx).ret =  new UnaryExpression(((UnaryExpressionNotPlusMinusContext)_localctx).ex.ret, UnaryOperator.BITWISE_NEGATION);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3675);
				match(BANG);
				setState(3676);
				((UnaryExpressionNotPlusMinusContext)_localctx).ex = unaryExpression();
				((UnaryExpressionNotPlusMinusContext)_localctx).ret =  new UnaryExpression(((UnaryExpressionNotPlusMinusContext)_localctx).ex.ret, UnaryOperator.NEGATION);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3679);
				((UnaryExpressionNotPlusMinusContext)_localctx).cex = castExpression();
				((UnaryExpressionNotPlusMinusContext)_localctx).ret =  ((UnaryExpressionNotPlusMinusContext)_localctx).cex.ret;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public Expression ret;
		public PrimaryContext p;
		public ExpressionNameContext n;
		public PostIncrementExpression_lf_postfixExpressionContext op1;
		public PostDecrementExpression_lf_postfixExpressionContext op2;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<PostIncrementExpression_lf_postfixExpressionContext> postIncrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostIncrementExpression_lf_postfixExpressionContext.class);
		}
		public PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostIncrementExpression_lf_postfixExpressionContext.class,i);
		}
		public List<PostDecrementExpression_lf_postfixExpressionContext> postDecrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostDecrementExpression_lf_postfixExpressionContext.class);
		}
		public PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostDecrementExpression_lf_postfixExpressionContext.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				{
				setState(3684);
				((PostfixExpressionContext)_localctx).p = primary();
				((PostfixExpressionContext)_localctx).ret =  ((PostfixExpressionContext)_localctx).p.ret;
				}
				break;
			case 2:
				{
				setState(3687);
				((PostfixExpressionContext)_localctx).n = expressionName();
				((PostfixExpressionContext)_localctx).ret =  new IdentifierExpression(((PostfixExpressionContext)_localctx).n.ret);
				}
				break;
			}
			setState(3700);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(3698);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(3692);
						((PostfixExpressionContext)_localctx).op1 = postIncrementExpression_lf_postfixExpression();
						((PostfixExpressionContext)_localctx).ret =  new UnaryExpression(_localctx.ret, ((PostfixExpressionContext)_localctx).op1.ret);
						}
						break;
					case DEC:
						{
						setState(3695);
						((PostfixExpressionContext)_localctx).op2 = postDecrementExpression_lf_postfixExpression();
						((PostfixExpressionContext)_localctx).ret =  new UnaryExpression(_localctx.ret, ((PostfixExpressionContext)_localctx).op2.ret);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(3702);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpressionContext extends ParserRuleContext {
		public UnaryExpression ret;
		public PostfixExpressionContext ex;
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPostIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3703);
			((PostIncrementExpressionContext)_localctx).ex = postfixExpression();
			setState(3704);
			match(INC);
			((PostIncrementExpressionContext)_localctx).ret =  new UnaryExpression(((PostIncrementExpressionContext)_localctx).ex.ret, UnaryOperator.INCREMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public UnaryOperator ret;
		public PostIncrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression_lf_postfixExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPostIncrementExpression_lf_postfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression() throws RecognitionException {
		PostIncrementExpression_lf_postfixExpressionContext _localctx = new PostIncrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_postIncrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3707);
			match(INC);
			((PostIncrementExpression_lf_postfixExpressionContext)_localctx).ret =  UnaryOperator.INCREMENT;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpressionContext extends ParserRuleContext {
		public UnaryExpression ret;
		public PostfixExpressionContext ex;
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPostDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementExpressionContext postDecrementExpression() throws RecognitionException {
		PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3710);
			((PostDecrementExpressionContext)_localctx).ex = postfixExpression();
			setState(3711);
			match(DEC);
			((PostDecrementExpressionContext)_localctx).ret =  new UnaryExpression(((PostDecrementExpressionContext)_localctx).ex.ret, UnaryOperator.DECREMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public UnaryOperator ret;
		public PostDecrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression_lf_postfixExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitPostDecrementExpression_lf_postfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression() throws RecognitionException {
		PostDecrementExpression_lf_postfixExpressionContext _localctx = new PostDecrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_postDecrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3714);
			match(DEC);
			((PostDecrementExpression_lf_postfixExpressionContext)_localctx).ret =  UnaryOperator.DECREMENT;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public CastExpression ret;
		public List<ReferenceType> ls = new ArrayList<>();;
		public PrimitiveTypeContext pt;
		public UnaryExpressionContext uex;
		public ReferenceTypeContext rt;
		public AdditionalBoundContext b;
		public UnaryExpressionNotPlusMinusContext npm;
		public LambdaExpressionContext lam;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Java8Visitor ) return ((Java8Visitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_castExpression);
		int _la;
		try {
			setState(3753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3717);
				match(LPAREN);
				setState(3718);
				((CastExpressionContext)_localctx).pt = primitiveType();
				setState(3719);
				match(RPAREN);
				setState(3720);
				((CastExpressionContext)_localctx).uex = unaryExpression();
				((CastExpressionContext)_localctx).ret =  new CastExpression(((CastExpressionContext)_localctx).uex.ret, ((CastExpressionContext)_localctx).pt.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3723);
				match(LPAREN);
				setState(3724);
				((CastExpressionContext)_localctx).rt = referenceType();
				_localctx.ls.add(((CastExpressionContext)_localctx).rt.ret);
				setState(3731);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(3726);
					((CastExpressionContext)_localctx).b = additionalBound();
					_localctx.ls.add(((CastExpressionContext)_localctx).b.ret);
					}
					}
					setState(3733);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3734);
				match(RPAREN);
				setState(3735);
				((CastExpressionContext)_localctx).npm = unaryExpressionNotPlusMinus();
				((CastExpressionContext)_localctx).ret =  new CastExpression(((CastExpressionContext)_localctx).npm.ret, _localctx.ls);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3738);
				match(LPAREN);
				setState(3739);
				((CastExpressionContext)_localctx).rt = referenceType();
				_localctx.ls.add(((CastExpressionContext)_localctx).rt.ret);
				setState(3746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(3741);
					((CastExpressionContext)_localctx).b = additionalBound();
					_localctx.ls.add(((CastExpressionContext)_localctx).b.ret);
					}
					}
					setState(3748);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3749);
				match(RPAREN);
				setState(3750);
				((CastExpressionContext)_localctx).lam = lambdaExpression();
				((CastExpressionContext)_localctx).ret =  new CastExpression(((CastExpressionContext)_localctx).lam.ret, _localctx.ls);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26:
			return packageName_sempred((PackageNameContext)_localctx, predIndex);
		case 28:
			return packageOrTypeName_sempred((PackageOrTypeNameContext)_localctx, predIndex);
		case 31:
			return ambiguousName_sempred((AmbiguousNameContext)_localctx, predIndex);
		case 218:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 219:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 220:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 221:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 222:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 223:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 224:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 225:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 226:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 227:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean packageName_sempred(PackageNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean packageOrTypeName_sempred(PackageOrTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ambiguousName_sempred(AmbiguousNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 3);
		case 21:
			return precpred(_ctx, 2);
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3m\u0eae\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u01eb\n\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u01f3"+
		"\n\3\3\4\3\4\3\4\7\4\u01f8\n\4\f\4\16\4\u01fb\13\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4\u0203\n\4\f\4\16\4\u0206\13\4\3\4\3\4\5\4\u020a\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5\u0212\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u021e\n\6\3\7\3\7\3\7\3\7\5\7\u0224\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u022f\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0237\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\7\t\u023f\n\t\f\t\16\t\u0242\13\t\3\n\3\n\3\n\7\n\u0247"+
		"\n\n\f\n\16\n\u024a\13\n\3\n\3\n\5\n\u024e\n\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\7\n\u0256\n\n\f\n\16\n\u0259\13\n\3\n\3\n\5\n\u025d\n\n\3\n\3\n\5\n\u0261"+
		"\n\n\3\13\3\13\3\13\3\13\7\13\u0267\n\13\f\13\16\13\u026a\13\13\3\13\3"+
		"\13\5\13\u026e\n\13\3\13\3\13\3\f\3\f\3\f\7\f\u0275\n\f\f\f\16\f\u0278"+
		"\13\f\3\f\3\f\5\f\u027c\n\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\7\20\u028c\n\20\f\20\16\20\u028f\13\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u02a0\n\21\3\22\7\22\u02a3\n\22\f\22\16\22\u02a6\13\22\3\22\3\22\3"+
		"\22\3\22\7\22\u02ac\n\22\f\22\16\22\u02af\13\22\3\22\3\22\3\22\7\22\u02b4"+
		"\n\22\f\22\16\22\u02b7\13\22\3\23\3\23\3\23\7\23\u02bc\n\23\f\23\16\23"+
		"\u02bf\13\23\3\23\3\23\5\23\u02c3\n\23\3\23\3\23\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u02d4\n\25\f\25\16\25"+
		"\u02d7\13\25\3\25\3\25\5\25\u02db\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u02ec\n\30\f\30\16\30"+
		"\u02ef\13\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u02f9\n\31\3"+
		"\32\3\32\3\32\7\32\u02fe\n\32\f\32\16\32\u0301\13\32\3\32\3\32\3\32\5"+
		"\32\u0306\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0310\n\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u031a\n\34\f\34\16\34\u031d"+
		"\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0326\n\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\7\36\u0330\n\36\f\36\16\36\u0333\13\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u033c\n\37\3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3!\3!\3!\7!\u0349\n!\f!\16!\u034c\13!\3\"\5\"\u034f\n\"\3\"\3\"\3"+
		"\"\7\"\u0354\n\"\f\"\16\"\u0357\13\"\3\"\3\"\3\"\7\"\u035c\n\"\f\"\16"+
		"\"\u035f\13\"\3\"\3\"\3\"\3#\3#\3#\7#\u0367\n#\f#\16#\u036a\13#\3#\3#"+
		"\3#\3#\3#\3#\3#\7#\u0373\n#\f#\16#\u0376\13#\3#\3#\3#\3$\3$\3$\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u038a\n%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3"+
		"*\3*\3*\3*\3*\5*\u03af\n*\3+\3+\3+\3+\3+\3+\5+\u03b7\n+\3,\3,\3,\7,\u03bc"+
		"\n,\f,\16,\u03bf\13,\3,\3,\3,\5,\u03c4\n,\3,\5,\u03c7\n,\3,\5,\u03ca\n"+
		",\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u03e0"+
		"\n-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\7/\u03ee\n/\f/\16/\u03f1\13/\3"+
		"/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\7\62\u0404\n\62\f\62\16\62\u0407\13\62\3\62\3\62\3\63\3\63"+
		"\7\63\u040d\n\63\f\63\16\63\u0410\13\63\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u041e\n\64\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u042d\n\65\3\66\3\66\3\66"+
		"\7\66\u0432\n\66\f\66\16\66\u0435\13\66\3\66\3\66\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\5\67\u044d\n\67\38\38\38\38\38\38\38\78\u0456\n8\f8\168\u0459"+
		"\138\38\38\39\39\39\59\u0460\n9\39\39\3:\3:\5:\u0466\n:\3:\3:\3;\3;\3"+
		";\3;\3;\3;\5;\u0470\n;\3<\3<\3<\3<\3<\3<\5<\u0478\n<\3=\3=\3=\3=\3=\5"+
		"=\u047f\n=\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u048a\n>\3?\3?\3?\3?\3?\3?\5"+
		"?\u0492\n?\3?\3?\3?\3?\3?\3?\7?\u049a\n?\f?\16?\u049d\13?\3@\3@\5@\u04a1"+
		"\n@\3@\3@\3@\3@\3@\3@\7@\u04a9\n@\f@\16@\u04ac\13@\3@\3@\5@\u04b0\n@\3"+
		"@\3@\5@\u04b4\n@\3A\3A\3A\3A\7A\u04ba\nA\fA\16A\u04bd\13A\3A\3A\5A\u04c1"+
		"\nA\3A\3A\3B\3B\5B\u04c7\nB\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\3F"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u04e3\nG\3H\3H\3H\7H\u04e8\nH"+
		"\fH\16H\u04eb\13H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u0507\nI\3J\3J\3J\5J\u050c\nJ\3J\3J\3J\3"+
		"J\3J\3J\7J\u0514\nJ\fJ\16J\u0517\13J\3J\3J\3J\5J\u051c\nJ\3J\3J\5J\u0520"+
		"\nJ\3K\3K\3K\3K\3K\5K\u0527\nK\3L\3L\3L\5L\u052c\nL\3L\3L\5L\u0530\nL"+
		"\3L\3L\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u0542\nM\3N\3N\3N"+
		"\3N\3N\3N\3N\7N\u054b\nN\fN\16N\u054e\13N\3N\3N\3N\3N\3N\3N\3N\3N\3N\7"+
		"N\u0559\nN\fN\16N\u055c\13N\3N\3N\5N\u0560\nN\3O\3O\3O\7O\u0565\nO\fO"+
		"\16O\u0568\13O\3O\3O\3O\3O\3P\3P\3P\3P\3P\5P\u0573\nP\3Q\3Q\3Q\7Q\u0578"+
		"\nQ\fQ\16Q\u057b\13Q\3Q\3Q\3Q\3Q\7Q\u0581\nQ\fQ\16Q\u0584\13Q\3Q\3Q\3"+
		"Q\3Q\3Q\3Q\3Q\5Q\u058d\nQ\3R\3R\3R\7R\u0592\nR\fR\16R\u0595\13R\3R\3R"+
		"\3R\5R\u059a\nR\3R\3R\3R\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\7T\u05aa\nT"+
		"\fT\16T\u05ad\13T\3T\3T\3U\3U\3U\3U\3U\3U\5U\u05b7\nU\3V\3V\3V\3V\5V\u05bd"+
		"\nV\3W\3W\3W\3X\3X\3X\3X\3Y\3Y\3Y\7Y\u05c9\nY\fY\16Y\u05cc\13Y\3Y\3Y\3"+
		"Y\5Y\u05d1\nY\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u05df\nZ\3[\5[\u05e2"+
		"\n[\3[\3[\3[\5[\u05e7\n[\3[\3[\3[\3\\\3\\\3\\\3]\3]\5]\u05f1\n]\3]\5]"+
		"\u05f4\n]\3]\3]\3]\3^\5^\u05fa\n^\3^\3^\3^\5^\u05ff\n^\3^\3^\3^\3^\5^"+
		"\u0605\n^\3^\3^\3^\5^\u060a\n^\3^\3^\3^\3^\3^\3^\5^\u0612\n^\3^\3^\3^"+
		"\5^\u0617\n^\3^\3^\3^\3^\3^\3^\3^\5^\u0620\n^\3^\3^\3^\5^\u0625\n^\3^"+
		"\3^\3^\3^\5^\u062b\n^\3_\3_\3_\7_\u0630\n_\f_\16_\u0633\13_\3_\3_\3_\5"+
		"_\u0638\n_\3_\3_\3_\3`\3`\5`\u063f\n`\3`\5`\u0642\n`\3`\5`\u0645\n`\3"+
		"`\3`\3a\3a\3a\7a\u064c\na\fa\16a\u064f\13a\3b\3b\3b\7b\u0654\nb\fb\16"+
		"b\u0657\13b\3b\3b\3b\5b\u065c\nb\3b\5b\u065f\nb\3b\3b\5b\u0663\nb\3c\3"+
		"c\3c\3d\3d\7d\u066a\nd\fd\16d\u066d\13d\3e\3e\3e\3e\3e\3e\5e\u0675\ne"+
		"\3f\3f\3f\7f\u067a\nf\ff\16f\u067d\13f\3f\3f\3f\5f\u0682\nf\3f\5f\u0685"+
		"\nf\3f\3f\3f\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\5g\u0699\ng"+
		"\3h\3h\3h\3h\3i\3i\7i\u06a1\ni\fi\16i\u06a4\13i\3i\3i\3j\3j\3j\3j\3j\3"+
		"j\3j\3j\3j\3j\3j\3j\3j\5j\u06b5\nj\3k\3k\3k\7k\u06ba\nk\fk\16k\u06bd\13"+
		"k\3k\3k\3k\3k\3k\3l\3l\3l\3l\3l\3l\3l\3l\3l\5l\u06cd\nl\3m\3m\3m\7m\u06d2"+
		"\nm\fm\16m\u06d5\13m\3m\3m\3m\3m\3m\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3"+
		"n\3n\5n\u06e9\nn\3o\3o\3o\7o\u06ee\no\fo\16o\u06f1\13o\3o\3o\3o\3o\3o"+
		"\3o\3p\3p\7p\u06fb\np\fp\16p\u06fe\13p\3p\3p\3q\3q\3q\3q\3q\3q\3q\3q\3"+
		"q\3q\3q\3q\3q\5q\u070f\nq\3r\3r\3r\7r\u0714\nr\fr\16r\u0717\13r\3r\3r"+
		"\3r\3r\3r\5r\u071e\nr\3r\5r\u0721\nr\3r\3r\3r\3s\3s\3s\3s\3s\3s\3s\5s"+
		"\u072d\ns\3t\3t\3t\3t\3u\3u\3u\3u\3u\3u\3u\3u\3u\5u\u073c\nu\3v\3v\3v"+
		"\3v\3v\5v\u0743\nv\3v\3v\3w\3w\3w\7w\u074a\nw\fw\16w\u074d\13w\3x\3x\3"+
		"x\3x\3x\3y\3y\3y\3y\3y\3y\3y\3y\3y\5y\u075d\ny\3z\3z\5z\u0761\nz\3z\5"+
		"z\u0764\nz\3z\3z\3z\3{\3{\3{\3{\3{\3{\3{\7{\u0770\n{\f{\16{\u0773\13{"+
		"\3{\3{\3|\3|\3|\3|\3}\3}\3}\3}\3}\3}\3}\3~\3~\5~\u0784\n~\3~\5~\u0787"+
		"\n~\3~\3~\3~\3\177\3\177\3\177\3\177\3\177\3\177\3\177\7\177\u0793\n\177"+
		"\f\177\16\177\u0796\13\177\3\177\3\177\3\u0080\3\u0080\5\u0080\u079c\n"+
		"\u0080\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\7\u0081\u07a7\n\u0081\f\u0081\16\u0081\u07aa\13\u0081\3\u0081"+
		"\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\5\u0082\u07b7\n\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0084"+
		"\3\u0084\3\u0084\7\u0084\u07c0\n\u0084\f\u0084\16\u0084\u07c3\13\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u07db\n\u0085\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u07ec\n\u0086\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u0810\n\u0087\3\u0088"+
		"\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\5\u008c\u0837\n\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u085e\n\u0090\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\7\u0092\u086b\n\u0092\f\u0092\16\u0092\u086e\13\u0092\3\u0092\3\u0092"+
		"\3\u0092\7\u0092\u0873\n\u0092\f\u0092\16\u0092\u0876\13\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\7\u0094\u0885\n\u0094\f\u0094\16\u0094\u0888"+
		"\13\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u0899"+
		"\n\u0095\3\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u08bb\n\u009a"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\5\u009b\u08c3\n\u009b"+
		"\3\u009c\3\u009c\3\u009c\5\u009c\u08c8\n\u009c\3\u009c\3\u009c\5\u009c"+
		"\u08cc\n\u009c\3\u009c\3\u009c\5\u009c\u08d0\n\u009c\3\u009c\3\u009c\3"+
		"\u009c\3\u009c\3\u009d\3\u009d\3\u009d\5\u009d\u08d9\n\u009d\3\u009d\3"+
		"\u009d\5\u009d\u08dd\n\u009d\3\u009d\3\u009d\5\u009d\u08e1\n\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e"+
		"\5\u009e\u08ed\n\u009e\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a0\7\u00a0\u08f9\n\u00a0\f\u00a0\16\u00a0"+
		"\u08fc\13\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\7\u00a1\u0905\n\u00a1\f\u00a1\16\u00a1\u0908\13\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\7\u00a2\u0917\n\u00a2\f\u00a2\16\u00a2\u091a\13\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a3"+
		"\3\u00a3\5\u00a3\u0926\n\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4"+
		"\5\u00a4\u092d\n\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\5\u00a5"+
		"\u0934\n\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u094d"+
		"\n\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u0955"+
		"\n\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\7\u00a9\u095c\n\u00a9"+
		"\f\u00a9\16\u00a9\u095f\13\u00a9\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab\7\u00ab"+
		"\u096e\n\u00ab\f\u00ab\16\u00ab\u0971\13\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\7\u00ac"+
		"\u097e\n\u00ac\f\u00ac\16\u00ac\u0981\13\u00ac\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u098b\n\u00ae\3\u00ae"+
		"\5\u00ae\u098e\n\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\5\u00af"+
		"\u0995\n\u00af\3\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b0\7\u00b0\u09a0\n\u00b0\f\u00b0\16\u00b0\u09a3\13\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b1\7\u00b1\u09aa\n\u00b1\f\u00b1"+
		"\16\u00b1\u09ad\13\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u09bb\n\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\7\u00b2\u09c0\n\u00b2\f\u00b2\16\u00b2\u09c3"+
		"\13\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\5\u00b3\u09e1\n\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\7\u00b4\u09e7\n\u00b4\f\u00b4\16\u00b4\u09ea\13\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\5\u00b4\u09f9\n\u00b4\3\u00b5\3\u00b5\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u0a16\n\u00b6\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0a27\n\u00b7\3\u00b8"+
		"\3\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u0a37\n\u00b9\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\7\u00ba"+
		"\u0a43\n\u00ba\f\u00ba\16\u00ba\u0a46\13\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0a62\n\u00ba\3\u00bb"+
		"\3\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\7\u00bc\u0a70\n\u00bc\f\u00bc\16\u00bc\u0a73\13\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u0a8c\n\u00bc\3\u00bd"+
		"\3\u00bd\5\u00bd\u0a90\n\u00bd\3\u00bd\3\u00bd\3\u00bd\7\u00bd\u0a95\n"+
		"\u00bd\f\u00bd\16\u00bd\u0a98\13\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\7\u00bd\u0aa0\n\u00bd\f\u00bd\16\u00bd\u0aa3\13\u00bd"+
		"\3\u00bd\3\u00bd\7\u00bd\u0aa7\n\u00bd\f\u00bd\16\u00bd\u0aaa\13\u00bd"+
		"\3\u00bd\5\u00bd\u0aad\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u0ab1\n\u00bd\3"+
		"\u00bd\3\u00bd\3\u00bd\5\u00bd\u0ab6\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3"+
		"\u00bd\5\u00bd\u0abc\n\u00bd\3\u00bd\3\u00bd\3\u00bd\7\u00bd\u0ac1\n\u00bd"+
		"\f\u00bd\16\u00bd\u0ac4\13\u00bd\3\u00bd\3\u00bd\5\u00bd\u0ac8\n\u00bd"+
		"\3\u00bd\3\u00bd\5\u00bd\u0acc\n\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd"+
		"\u0ad1\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0ad7\n\u00bd\3"+
		"\u00bd\3\u00bd\3\u00bd\7\u00bd\u0adc\n\u00bd\f\u00bd\16\u00bd\u0adf\13"+
		"\u00bd\3\u00bd\3\u00bd\5\u00bd\u0ae3\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u0ae7"+
		"\n\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0aec\n\u00bd\5\u00bd\u0aee\n"+
		"\u00bd\3\u00be\3\u00be\3\u00be\5\u00be\u0af3\n\u00be\3\u00be\3\u00be\3"+
		"\u00be\7\u00be\u0af8\n\u00be\f\u00be\16\u00be\u0afb\13\u00be\3\u00be\3"+
		"\u00be\5\u00be\u0aff\n\u00be\3\u00be\3\u00be\5\u00be\u0b03\n\u00be\3\u00be"+
		"\3\u00be\3\u00be\5\u00be\u0b08\n\u00be\3\u00bf\3\u00bf\5\u00bf\u0b0c\n"+
		"\u00bf\3\u00bf\3\u00bf\3\u00bf\7\u00bf\u0b11\n\u00bf\f\u00bf\16\u00bf"+
		"\u0b14\13\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\7\u00bf"+
		"\u0b1c\n\u00bf\f\u00bf\16\u00bf\u0b1f\13\u00bf\3\u00bf\3\u00bf\7\u00bf"+
		"\u0b23\n\u00bf\f\u00bf\16\u00bf\u0b26\13\u00bf\3\u00bf\5\u00bf\u0b29\n"+
		"\u00bf\3\u00bf\3\u00bf\5\u00bf\u0b2d\n\u00bf\3\u00bf\3\u00bf\3\u00bf\5"+
		"\u00bf\u0b32\n\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u0b38\n\u00bf"+
		"\3\u00bf\3\u00bf\3\u00bf\7\u00bf\u0b3d\n\u00bf\f\u00bf\16\u00bf\u0b40"+
		"\13\u00bf\3\u00bf\3\u00bf\5\u00bf\u0b44\n\u00bf\3\u00bf\3\u00bf\5\u00bf"+
		"\u0b48\n\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u0b4d\n\u00bf\5\u00bf\u0b4f"+
		"\n\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u0b57"+
		"\n\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1"+
		"\u0b69\n\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3"+
		"\u0b7a\n\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u0b88\n\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\7\u00c4\u0b90\n\u00c4\f\u00c4"+
		"\16\u00c4\u0b93\13\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\7\u00c5\u0ba1\n\u00c5"+
		"\f\u00c5\16\u00c5\u0ba4\13\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0bb2"+
		"\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\7\u00c6\u0bba"+
		"\n\u00c6\f\u00c6\16\u00c6\u0bbd\13\u00c6\3\u00c7\3\u00c7\3\u00c7\5\u00c7"+
		"\u0bc2\n\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7"+
		"\u0bca\n\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0bcf\n\u00c7\3\u00c7\3"+
		"\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0bd7\n\u00c7\3\u00c7\3"+
		"\u00c7\3\u00c7\5\u00c7\u0bdc\n\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3"+
		"\u00c7\3\u00c7\5\u00c7\u0be4\n\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0be9"+
		"\n\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0bf1"+
		"\n\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0bf6\n\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0bff\n\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\5\u00c7\u0c04\n\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7"+
		"\u0c09\n\u00c7\3\u00c8\3\u00c8\5\u00c8\u0c0d\n\u00c8\3\u00c8\3\u00c8\3"+
		"\u00c8\5\u00c8\u0c12\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3"+
		"\u00c9\5\u00c9\u0c1a\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3"+
		"\u00c9\5\u00c9\u0c22\n\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0c27\n\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0c2f\n\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0c34\n\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0c3c\n\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\5\u00c9\u0c41\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\5\u00c9\u0c4a\n\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0c4f\n"+
		"\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0c54\n\u00c9\3\u00ca\3\u00ca\3"+
		"\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\7\u00ca\u0c5d\n\u00ca\f\u00ca\16"+
		"\u00ca\u0c60\13\u00ca\3\u00ca\3\u00ca\3\u00cb\3\u00cb\3\u00cb\5\u00cb"+
		"\u0c67\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb"+
		"\u0c6f\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb"+
		"\u0c77\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb"+
		"\u0c7f\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\5\u00cb\u0c88\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\5\u00cb\u0c90\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\5\u00cb\u0c9a\n\u00cb\3\u00cc\3\u00cc\5\u00cc\u0c9e\n"+
		"\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0ca6\n"+
		"\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0cae\n"+
		"\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0cb6\n"+
		"\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd"+
		"\u0cbf\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd"+
		"\u0cc7\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\5\u00cd\u0cd1\n\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce"+
		"\u0cd7\n\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce"+
		"\u0cdf\n\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u0cef"+
		"\n\u00ce\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\7\u00cf\u0cf6\n\u00cf"+
		"\f\u00cf\16\u00cf\u0cf9\13\u00cf\3\u00d0\3\u00d0\3\u00d0\7\u00d0\u0cfe"+
		"\n\u00d0\f\u00d0\16\u00d0\u0d01\13\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d1\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\5\u00d2\u0d11\n\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0d1c\n\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0d25\n\u00d4\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\7\u00d5\u0d2d\n\u00d5\f\u00d5"+
		"\16\u00d5\u0d30\13\u00d5\3\u00d5\3\u00d5\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\5\u00d6\u0d3a\n\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d7"+
		"\3\u00d7\3\u00d7\5\u00d7\u0d42\n\u00d7\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\5\u00d9\u0d52\n\u00d9\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\3\u00da\5\u00da\u0d6c\n\u00da\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db"+
		"\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\5\u00db\u0d78\n\u00db\3\u00dc"+
		"\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\7\u00dc"+
		"\u0d83\n\u00dc\f\u00dc\16\u00dc\u0d86\13\u00dc\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\7\u00dd\u0d91\n\u00dd"+
		"\f\u00dd\16\u00dd\u0d94\13\u00dd\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de"+
		"\3\u00de\3\u00de\3\u00de\3\u00de\7\u00de\u0d9f\n\u00de\f\u00de\16\u00de"+
		"\u0da2\13\u00de\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\7\u00df\u0dad\n\u00df\f\u00df\16\u00df\u0db0\13\u00df"+
		"\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0"+
		"\7\u00e0\u0dbb\n\u00e0\f\u00e0\16\u00e0\u0dbe\13\u00e0\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\7\u00e1\u0dce\n\u00e1\f\u00e1\16\u00e1\u0dd1"+
		"\13\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e2\3\u00e2\3\u00e2\7\u00e2\u0df0\n\u00e2\f\u00e2\16\u00e2\u0df3"+
		"\13\u00e2\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\7\u00e3\u0e0c\n\u00e3"+
		"\f\u00e3\16\u00e3\u0e0f\13\u00e3\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\7\u00e4\u0e1f\n\u00e4\f\u00e4\16\u00e4\u0e22\13\u00e4\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\7\u00e5"+
		"\u0e37\n\u00e5\f\u00e5\16\u00e5\u0e3a\13\u00e5\3\u00e6\3\u00e6\3\u00e6"+
		"\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6"+
		"\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\5\u00e6\u0e4d\n\u00e6\3\u00e7"+
		"\3\u00e7\3\u00e7\3\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e9\3\u00e9"+
		"\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9"+
		"\3\u00e9\3\u00e9\3\u00e9\5\u00e9\u0e65\n\u00e9\3\u00ea\3\u00ea\3\u00ea"+
		"\3\u00ea\3\u00ea\3\u00ea\5\u00ea\u0e6d\n\u00ea\3\u00ea\3\u00ea\3\u00ea"+
		"\3\u00ea\3\u00ea\3\u00ea\7\u00ea\u0e75\n\u00ea\f\u00ea\16\u00ea\u0e78"+
		"\13\u00ea\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00ec\3\u00ec\3\u00ec\3\u00ed"+
		"\3\u00ed\3\u00ed\3\u00ed\3\u00ee\3\u00ee\3\u00ee\3\u00ef\3\u00ef\3\u00ef"+
		"\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef"+
		"\7\u00ef\u0e94\n\u00ef\f\u00ef\16\u00ef\u0e97\13\u00ef\3\u00ef\3\u00ef"+
		"\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\7\u00ef"+
		"\u0ea3\n\u00ef\f\u00ef\16\u00ef\u0ea6\13\u00ef\3\u00ef\3\u00ef\3\u00ef"+
		"\3\u00ef\5\u00ef\u0eac\n\u00ef\3\u00ef\2\17\66:@\u01b6\u01b8\u01ba\u01bc"+
		"\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u00f0\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6"+
		"\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de"+
		"\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6"+
		"\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e"+
		"\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126"+
		"\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e"+
		"\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156"+
		"\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e"+
		"\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186"+
		"\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e"+
		"\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6"+
		"\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce"+
		"\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\2\2\u0faa\2\u01ea\3\2\2\2\4"+
		"\u01f2\3\2\2\2\6\u0209\3\2\2\2\b\u0211\3\2\2\2\n\u021d\3\2\2\2\f\u0223"+
		"\3\2\2\2\16\u022e\3\2\2\2\20\u0236\3\2\2\2\22\u0260\3\2\2\2\24\u0262\3"+
		"\2\2\2\26\u0276\3\2\2\2\30\u027f\3\2\2\2\32\u0282\3\2\2\2\34\u0285\3\2"+
		"\2\2\36\u028d\3\2\2\2 \u029f\3\2\2\2\"\u02a4\3\2\2\2$\u02bd\3\2\2\2&\u02c6"+
		"\3\2\2\2(\u02da\3\2\2\2*\u02dc\3\2\2\2,\u02e0\3\2\2\2.\u02e5\3\2\2\2\60"+
		"\u02f8\3\2\2\2\62\u02ff\3\2\2\2\64\u030f\3\2\2\2\66\u0311\3\2\2\28\u0325"+
		"\3\2\2\2:\u0327\3\2\2\2<\u033b\3\2\2\2>\u033d\3\2\2\2@\u0340\3\2\2\2B"+
		"\u034e\3\2\2\2D\u0368\3\2\2\2F\u037a\3\2\2\2H\u0389\3\2\2\2J\u038b\3\2"+
		"\2\2L\u0390\3\2\2\2N\u0397\3\2\2\2P\u039f\3\2\2\2R\u03ae\3\2\2\2T\u03b6"+
		"\3\2\2\2V\u03bd\3\2\2\2X\u03df\3\2\2\2Z\u03e1\3\2\2\2\\\u03e6\3\2\2\2"+
		"^\u03f4\3\2\2\2`\u03f8\3\2\2\2b\u03fc\3\2\2\2d\u040a\3\2\2\2f\u041d\3"+
		"\2\2\2h\u042c\3\2\2\2j\u0433\3\2\2\2l\u044c\3\2\2\2n\u044e\3\2\2\2p\u045c"+
		"\3\2\2\2r\u0463\3\2\2\2t\u046f\3\2\2\2v\u0477\3\2\2\2x\u047e\3\2\2\2z"+
		"\u0489\3\2\2\2|\u0491\3\2\2\2~\u04b3\3\2\2\2\u0080\u04b5\3\2\2\2\u0082"+
		"\u04c4\3\2\2\2\u0084\u04ca\3\2\2\2\u0086\u04cd\3\2\2\2\u0088\u04d0\3\2"+
		"\2\2\u008a\u04d3\3\2\2\2\u008c\u04e2\3\2\2\2\u008e\u04e9\3\2\2\2\u0090"+
		"\u0506\3\2\2\2\u0092\u051f\3\2\2\2\u0094\u0526\3\2\2\2\u0096\u0528\3\2"+
		"\2\2\u0098\u0541\3\2\2\2\u009a\u055f\3\2\2\2\u009c\u0566\3\2\2\2\u009e"+
		"\u0572\3\2\2\2\u00a0\u058c\3\2\2\2\u00a2\u0593\3\2\2\2\u00a4\u059e\3\2"+
		"\2\2\u00a6\u05a2\3\2\2\2\u00a8\u05b6\3\2\2\2\u00aa\u05bc\3\2\2\2\u00ac"+
		"\u05be\3\2\2\2\u00ae\u05c1\3\2\2\2\u00b0\u05ca\3\2\2\2\u00b2\u05de\3\2"+
		"\2\2\u00b4\u05e1\3\2\2\2\u00b6\u05eb\3\2\2\2\u00b8\u05ee\3\2\2\2\u00ba"+
		"\u062a\3\2\2\2\u00bc\u0631\3\2\2\2\u00be\u063c\3\2\2\2\u00c0\u0648\3\2"+
		"\2\2\u00c2\u0655\3\2\2\2\u00c4\u0664\3\2\2\2\u00c6\u0667\3\2\2\2\u00c8"+
		"\u0674\3\2\2\2\u00ca\u067b\3\2\2\2\u00cc\u0698\3\2\2\2\u00ce\u069a\3\2"+
		"\2\2\u00d0\u069e\3\2\2\2\u00d2\u06b4\3\2\2\2\u00d4\u06bb\3\2\2\2\u00d6"+
		"\u06cc\3\2\2\2\u00d8\u06d3\3\2\2\2\u00da\u06e8\3\2\2\2\u00dc\u06ef\3\2"+
		"\2\2\u00de\u06f8\3\2\2\2\u00e0\u070e\3\2\2\2\u00e2\u0715\3\2\2\2\u00e4"+
		"\u072c\3\2\2\2\u00e6\u072e\3\2\2\2\u00e8\u073b\3\2\2\2\u00ea\u073d\3\2"+
		"\2\2\u00ec\u0746\3\2\2\2\u00ee\u074e\3\2\2\2\u00f0\u075c\3\2\2\2\u00f2"+
		"\u075e\3\2\2\2\u00f4\u0768\3\2\2\2\u00f6\u0776\3\2\2\2\u00f8\u077a\3\2"+
		"\2\2\u00fa\u0781\3\2\2\2\u00fc\u078b\3\2\2\2\u00fe\u0799\3\2\2\2\u0100"+
		"\u07a0\3\2\2\2\u0102\u07b6\3\2\2\2\u0104\u07b8\3\2\2\2\u0106\u07c1\3\2"+
		"\2\2\u0108\u07da\3\2\2\2\u010a\u07eb\3\2\2\2\u010c\u080f\3\2\2\2\u010e"+
		"\u0811\3\2\2\2\u0110\u0813\3\2\2\2\u0112\u0818\3\2\2\2\u0114\u081d\3\2"+
		"\2\2\u0116\u0836\3\2\2\2\u0118\u0838\3\2\2\2\u011a\u083f\3\2\2\2\u011c"+
		"\u0848\3\2\2\2\u011e\u085d\3\2\2\2\u0120\u085f\3\2\2\2\u0122\u0866\3\2"+
		"\2\2\u0124\u087a\3\2\2\2\u0126\u087e\3\2\2\2\u0128\u0898\3\2\2\2\u012a"+
		"\u089a\3\2\2\2\u012c\u089d\3\2\2\2\u012e\u08a4\3\2\2\2\u0130\u08ab\3\2"+
		"\2\2\u0132\u08ba\3\2\2\2\u0134\u08c2\3\2\2\2\u0136\u08c4\3\2\2\2\u0138"+
		"\u08d5\3\2\2\2\u013a\u08ec\3\2\2\2\u013c\u08ee\3\2\2\2\u013e\u08f1\3\2"+
		"\2\2\u0140\u08ff\3\2\2\2\u0142\u0911\3\2\2\2\u0144\u0923\3\2\2\2\u0146"+
		"\u092a\3\2\2\2\u0148\u0931\3\2\2\2\u014a\u0938\3\2\2\2\u014c\u093d\3\2"+
		"\2\2\u014e\u0954\3\2\2\2\u0150\u0956\3\2\2\2\u0152\u0962\3\2\2\2\u0154"+
		"\u096f\3\2\2\2\u0156\u0976\3\2\2\2\u0158\u0982\3\2\2\2\u015a\u0986\3\2"+
		"\2\2\u015c\u0991\3\2\2\2\u015e\u0999\3\2\2\2\u0160\u09ab\3\2\2\2\u0162"+
		"\u09ba\3\2\2\2\u0164\u09e0\3\2\2\2\u0166\u09f8\3\2\2\2\u0168\u09fa\3\2"+
		"\2\2\u016a\u0a15\3\2\2\2\u016c\u0a26\3\2\2\2\u016e\u0a28\3\2\2\2\u0170"+
		"\u0a36\3\2\2\2\u0172\u0a61\3\2\2\2\u0174\u0a63\3\2\2\2\u0176\u0a8b\3\2"+
		"\2\2\u0178\u0aed\3\2\2\2\u017a\u0aef\3\2\2\2\u017c\u0b4e\3\2\2\2\u017e"+
		"\u0b56\3\2\2\2\u0180\u0b68\3\2\2\2\u0182\u0b6a\3\2\2\2\u0184\u0b79\3\2"+
		"\2\2\u0186\u0b87\3\2\2\2\u0188\u0b94\3\2\2\2\u018a\u0bb1\3\2\2\2\u018c"+
		"\u0c08\3\2\2\2\u018e\u0c0a\3\2\2\2\u0190\u0c53\3\2\2\2\u0192\u0c55\3\2"+
		"\2\2\u0194\u0c99\3\2\2\2\u0196\u0c9b\3\2\2\2\u0198\u0cd0\3\2\2\2\u019a"+
		"\u0cee\3\2\2\2\u019c\u0cf0\3\2\2\2\u019e\u0cff\3\2\2\2\u01a0\u0d07\3\2"+
		"\2\2\u01a2\u0d10\3\2\2\2\u01a4\u0d12\3\2\2\2\u01a6\u0d24\3\2\2\2\u01a8"+
		"\u0d26\3\2\2\2\u01aa\u0d39\3\2\2\2\u01ac\u0d41\3\2\2\2\u01ae\u0d43\3\2"+
		"\2\2\u01b0\u0d51\3\2\2\2\u01b2\u0d6b\3\2\2\2\u01b4\u0d77\3\2\2\2\u01b6"+
		"\u0d79\3\2\2\2\u01b8\u0d87\3\2\2\2\u01ba\u0d95\3\2\2\2\u01bc\u0da3\3\2"+
		"\2\2\u01be\u0db1\3\2\2\2\u01c0\u0dbf\3\2\2\2\u01c2\u0dd2\3\2\2\2\u01c4"+
		"\u0df4\3\2\2\2\u01c6\u0e10\3\2\2\2\u01c8\u0e23\3\2\2\2\u01ca\u0e4c\3\2"+
		"\2\2\u01cc\u0e4e\3\2\2\2\u01ce\u0e52\3\2\2\2\u01d0\u0e64\3\2\2\2\u01d2"+
		"\u0e6c\3\2\2\2\u01d4\u0e79\3\2\2\2\u01d6\u0e7d\3\2\2\2\u01d8\u0e80\3\2"+
		"\2\2\u01da\u0e84\3\2\2\2\u01dc\u0eab\3\2\2\2\u01de\u01df\7\65\2\2\u01df"+
		"\u01eb\b\2\1\2\u01e0\u01e1\7\66\2\2\u01e1\u01eb\b\2\1\2\u01e2\u01e3\7"+
		"\67\2\2\u01e3\u01eb\b\2\1\2\u01e4\u01e5\78\2\2\u01e5\u01eb\b\2\1\2\u01e6"+
		"\u01e7\79\2\2\u01e7\u01eb\b\2\1\2\u01e8\u01e9\7:\2\2\u01e9\u01eb\b\2\1"+
		"\2\u01ea\u01de\3\2\2\2\u01ea\u01e0\3\2\2\2\u01ea\u01e2\3\2\2\2\u01ea\u01e4"+
		"\3\2\2\2\u01ea\u01e6\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\3\3\2\2\2\u01ec"+
		"\u01ed\5\6\4\2\u01ed\u01ee\b\3\1\2\u01ee\u01f3\3\2\2\2\u01ef\u01f0\5\16"+
		"\b\2\u01f0\u01f1\b\3\1\2\u01f1\u01f3\3\2\2\2\u01f2\u01ec\3\2\2\2\u01f2"+
		"\u01ef\3\2\2\2\u01f3\5\3\2\2\2\u01f4\u01f5\5\u00e8u\2\u01f5\u01f6\b\4"+
		"\1\2\u01f6\u01f8\3\2\2\2\u01f7\u01f4\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9"+
		"\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01f9\3\2"+
		"\2\2\u01fc\u01fd\5\b\5\2\u01fd\u01fe\b\4\1\2\u01fe\u020a\3\2\2\2\u01ff"+
		"\u0200\5\u00e8u\2\u0200\u0201\b\4\1\2\u0201\u0203\3\2\2\2\u0202\u01ff"+
		"\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"\u0207\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0208\7\5\2\2\u0208\u020a\b\4"+
		"\1\2\u0209\u01f9\3\2\2\2\u0209\u0204\3\2\2\2\u020a\7\3\2\2\2\u020b\u020c"+
		"\5\n\6\2\u020c\u020d\b\5\1\2\u020d\u0212\3\2\2\2\u020e\u020f\5\f\7\2\u020f"+
		"\u0210\b\5\1\2\u0210\u0212\3\2\2\2\u0211\u020b\3\2\2\2\u0211\u020e\3\2"+
		"\2\2\u0212\t\3\2\2\2\u0213\u0214\7\7\2\2\u0214\u021e\b\6\1\2\u0215\u0216"+
		"\7\'\2\2\u0216\u021e\b\6\1\2\u0217\u0218\7\35\2\2\u0218\u021e\b\6\1\2"+
		"\u0219\u021a\7\37\2\2\u021a\u021e\b\6\1\2\u021b\u021c\7\n\2\2\u021c\u021e"+
		"\b\6\1\2\u021d\u0213\3\2\2\2\u021d\u0215\3\2\2\2\u021d\u0217\3\2\2\2\u021d"+
		"\u0219\3\2\2\2\u021d\u021b\3\2\2\2\u021e\13\3\2\2\2\u021f\u0220\7\26\2"+
		"\2\u0220\u0224\b\7\1\2\u0221\u0222\7\20\2\2\u0222\u0224\b\7\1\2\u0223"+
		"\u021f\3\2\2\2\u0223\u0221\3\2\2\2\u0224\r\3\2\2\2\u0225\u0226\5\20\t"+
		"\2\u0226\u0227\b\b\1\2\u0227\u022f\3\2\2\2\u0228\u0229\5\36\20\2\u0229"+
		"\u022a\b\b\1\2\u022a\u022f\3\2\2\2\u022b\u022c\5 \21\2\u022c\u022d\b\b"+
		"\1\2\u022d\u022f\3\2\2\2\u022e\u0225\3\2\2\2\u022e\u0228\3\2\2\2\u022e"+
		"\u022b\3\2\2\2\u022f\17\3\2\2\2\u0230\u0231\5\26\f\2\u0231\u0232\b\t\1"+
		"\2\u0232\u0237\3\2\2\2\u0233\u0234\5\34\17\2\u0234\u0235\b\t\1\2\u0235"+
		"\u0237\3\2\2\2\u0236\u0230\3\2\2\2\u0236\u0233\3\2\2\2\u0237\u0240\3\2"+
		"\2\2\u0238\u0239\5\24\13\2\u0239\u023a\b\t\1\2\u023a\u023f\3\2\2\2\u023b"+
		"\u023c\5\32\16\2\u023c\u023d\b\t\1\2\u023d\u023f\3\2\2\2\u023e\u0238\3"+
		"\2\2\2\u023e\u023b\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0240"+
		"\u0241\3\2\2\2\u0241\21\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0244\5\u00e8"+
		"u\2\u0244\u0245\b\n\1\2\u0245\u0247\3\2\2\2\u0246\u0243\3\2\2\2\u0247"+
		"\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024b\3\2"+
		"\2\2\u024a\u0248\3\2\2\2\u024b\u024d\7h\2\2\u024c\u024e\5,\27\2\u024d"+
		"\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0261\b\n"+
		"\1\2\u0250\u0251\5\20\t\2\u0251\u0257\7C\2\2\u0252\u0253\5\u00e8u\2\u0253"+
		"\u0254\b\n\1\2\u0254\u0256\3\2\2\2\u0255\u0252\3\2\2\2\u0256\u0259\3\2"+
		"\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025a\3\2\2\2\u0259"+
		"\u0257\3\2\2\2\u025a\u025c\7h\2\2\u025b\u025d\5,\27\2\u025c\u025b\3\2"+
		"\2\2\u025c\u025d\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\b\n\1\2\u025f"+
		"\u0261\3\2\2\2\u0260\u0248\3\2\2\2\u0260\u0250\3\2\2\2\u0261\23\3\2\2"+
		"\2\u0262\u0268\7C\2\2\u0263\u0264\5\u00e8u\2\u0264\u0265\b\13\1\2\u0265"+
		"\u0267\3\2\2\2\u0266\u0263\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2"+
		"\2\2\u0268\u0269\3\2\2\2\u0269\u026b\3\2\2\2\u026a\u0268\3\2\2\2\u026b"+
		"\u026d\7h\2\2\u026c\u026e\5,\27\2\u026d\u026c\3\2\2\2\u026d\u026e\3\2"+
		"\2\2\u026e\u026f\3\2\2\2\u026f\u0270\b\13\1\2\u0270\25\3\2\2\2\u0271\u0272"+
		"\5\u00e8u\2\u0272\u0273\b\f\1\2\u0273\u0275\3\2\2\2\u0274\u0271\3\2\2"+
		"\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0279"+
		"\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027b\7h\2\2\u027a\u027c\5,\27\2\u027b"+
		"\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\b\f"+
		"\1\2\u027e\27\3\2\2\2\u027f\u0280\5\22\n\2\u0280\u0281\b\r\1\2\u0281\31"+
		"\3\2\2\2\u0282\u0283\5\24\13\2\u0283\u0284\b\16\1\2\u0284\33\3\2\2\2\u0285"+
		"\u0286\5\26\f\2\u0286\u0287\b\17\1\2\u0287\35\3\2\2\2\u0288\u0289\5\u00e8"+
		"u\2\u0289\u028a\b\20\1\2\u028a\u028c\3\2\2\2\u028b\u0288\3\2\2\2\u028c"+
		"\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0290\3\2"+
		"\2\2\u028f\u028d\3\2\2\2\u0290\u0291\7h\2\2\u0291\u0292\b\20\1\2\u0292"+
		"\37\3\2\2\2\u0293\u0294\5\6\4\2\u0294\u0295\5\"\22\2\u0295\u0296\b\21"+
		"\1\2\u0296\u02a0\3\2\2\2\u0297\u0298\5\20\t\2\u0298\u0299\5\"\22\2\u0299"+
		"\u029a\b\21\1\2\u029a\u02a0\3\2\2\2\u029b\u029c\5\36\20\2\u029c\u029d"+
		"\5\"\22\2\u029d\u029e\b\21\1\2\u029e\u02a0\3\2\2\2\u029f\u0293\3\2\2\2"+
		"\u029f\u0297\3\2\2\2\u029f\u029b\3\2\2\2\u02a0!\3\2\2\2\u02a1\u02a3\5"+
		"\u00e8u\2\u02a2\u02a1\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2"+
		"\u02a4\u02a5\3\2\2\2\u02a5\u02a7\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02a8"+
		"\7?\2\2\u02a8\u02a9\7@\2\2\u02a9\u02b5\b\22\1\2\u02aa\u02ac\5\u00e8u\2"+
		"\u02ab\u02aa\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae"+
		"\3\2\2\2\u02ae\u02b0\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0\u02b1\7?\2\2\u02b1"+
		"\u02b2\7@\2\2\u02b2\u02b4\b\22\1\2\u02b3\u02ad\3\2\2\2\u02b4\u02b7\3\2"+
		"\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6#\3\2\2\2\u02b7\u02b5"+
		"\3\2\2\2\u02b8\u02b9\5&\24\2\u02b9\u02ba\b\23\1\2\u02ba\u02bc\3\2\2\2"+
		"\u02bb\u02b8\3\2\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be"+
		"\3\2\2\2\u02be\u02c0\3\2\2\2\u02bf\u02bd\3\2\2\2\u02c0\u02c2\7h\2\2\u02c1"+
		"\u02c3\5(\25\2\u02c2\u02c1\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\3\2"+
		"\2\2\u02c4\u02c5\b\23\1\2\u02c5%\3\2\2\2\u02c6\u02c7\5\u00e8u\2\u02c7"+
		"\u02c8\b\24\1\2\u02c8\'\3\2\2\2\u02c9\u02ca\7\23\2\2\u02ca\u02cb\5\36"+
		"\20\2\u02cb\u02cc\b\25\1\2\u02cc\u02db\3\2\2\2\u02cd\u02ce\7\23\2\2\u02ce"+
		"\u02cf\5\20\t\2\u02cf\u02d5\b\25\1\2\u02d0\u02d1\5*\26\2\u02d1\u02d2\b"+
		"\25\1\2\u02d2\u02d4\3\2\2\2\u02d3\u02d0\3\2\2\2\u02d4\u02d7\3\2\2\2\u02d5"+
		"\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d8\3\2\2\2\u02d7\u02d5\3\2"+
		"\2\2\u02d8\u02d9\b\25\1\2\u02d9\u02db\3\2\2\2\u02da\u02c9\3\2\2\2\u02da"+
		"\u02cd\3\2\2\2\u02db)\3\2\2\2\u02dc\u02dd\7W\2\2\u02dd\u02de\5\30\r\2"+
		"\u02de\u02df\b\26\1\2\u02df+\3\2\2\2\u02e0\u02e1\7F\2\2\u02e1\u02e2\5"+
		".\30\2\u02e2\u02e3\7E\2\2\u02e3\u02e4\b\27\1\2\u02e4-\3\2\2\2\u02e5\u02e6"+
		"\5\60\31\2\u02e6\u02ed\b\30\1\2\u02e7\u02e8\7B\2\2\u02e8\u02e9\5\60\31"+
		"\2\u02e9\u02ea\b\30\1\2\u02ea\u02ec\3\2\2\2\u02eb\u02e7\3\2\2\2\u02ec"+
		"\u02ef\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f0\3\2"+
		"\2\2\u02ef\u02ed\3\2\2\2\u02f0\u02f1\b\30\1\2\u02f1/\3\2\2\2\u02f2\u02f3"+
		"\5\16\b\2\u02f3\u02f4\b\31\1\2\u02f4\u02f9\3\2\2\2\u02f5\u02f6\5\62\32"+
		"\2\u02f6\u02f7\b\31\1\2\u02f7\u02f9\3\2\2\2\u02f8\u02f2\3\2\2\2\u02f8"+
		"\u02f5\3\2\2\2\u02f9\61\3\2\2\2\u02fa\u02fb\5\u00e8u\2\u02fb\u02fc\b\32"+
		"\1\2\u02fc\u02fe\3\2\2\2\u02fd\u02fa\3\2\2\2\u02fe\u0301\3\2\2\2\u02ff"+
		"\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0302\3\2\2\2\u0301\u02ff\3\2"+
		"\2\2\u0302\u0303\7I\2\2\u0303\u0305\b\32\1\2\u0304\u0306\5\64\33\2\u0305"+
		"\u0304\3\2\2\2\u0305\u0306\3\2\2\2\u0306\63\3\2\2\2\u0307\u0308\7\23\2"+
		"\2\u0308\u0309\5\16\b\2\u0309\u030a\b\33\1\2\u030a\u0310\3\2\2\2\u030b"+
		"\u030c\7*\2\2\u030c\u030d\5\16\b\2\u030d\u030e\b\33\1\2\u030e\u0310\3"+
		"\2\2\2\u030f\u0307\3\2\2\2\u030f\u030b\3\2\2\2\u0310\65\3\2\2\2\u0311"+
		"\u0312\b\34\1\2\u0312\u0313\7h\2\2\u0313\u0314\b\34\1\2\u0314\u031b\3"+
		"\2\2\2\u0315\u0316\f\3\2\2\u0316\u0317\7C\2\2\u0317\u0318\7h\2\2\u0318"+
		"\u031a\b\34\1\2\u0319\u0315\3\2\2\2\u031a\u031d\3\2\2\2\u031b\u0319\3"+
		"\2\2\2\u031b\u031c\3\2\2\2\u031c\67\3\2\2\2\u031d\u031b\3\2\2\2\u031e"+
		"\u031f\7h\2\2\u031f\u0326\b\35\1\2\u0320\u0321\5:\36\2\u0321\u0322\7C"+
		"\2\2\u0322\u0323\7h\2\2\u0323\u0324\b\35\1\2\u0324\u0326\3\2\2\2\u0325"+
		"\u031e\3\2\2\2\u0325\u0320\3\2\2\2\u03269\3\2\2\2\u0327\u0328\b\36\1\2"+
		"\u0328\u0329\7h\2\2\u0329\u032a\b\36\1\2\u032a\u0331\3\2\2\2\u032b\u032c"+
		"\f\3\2\2\u032c\u032d\7C\2\2\u032d\u032e\7h\2\2\u032e\u0330\b\36\1\2\u032f"+
		"\u032b\3\2\2\2\u0330\u0333\3\2\2\2\u0331\u032f\3\2\2\2\u0331\u0332\3\2"+
		"\2\2\u0332;\3\2\2\2\u0333\u0331\3\2\2\2\u0334\u0335\7h\2\2\u0335\u033c"+
		"\b\37\1\2\u0336\u0337\5@!\2\u0337\u0338\7C\2\2\u0338\u0339\7h\2\2\u0339"+
		"\u033a\b\37\1\2\u033a\u033c\3\2\2\2\u033b\u0334\3\2\2\2\u033b\u0336\3"+
		"\2\2\2\u033c=\3\2\2\2\u033d\u033e\7h\2\2\u033e\u033f\b \1\2\u033f?\3\2"+
		"\2\2\u0340\u0341\b!\1\2\u0341\u0342\7h\2\2\u0342\u0343\b!\1\2\u0343\u034a"+
		"\3\2\2\2\u0344\u0345\f\3\2\2\u0345\u0346\7C\2\2\u0346\u0347\7h\2\2\u0347"+
		"\u0349\b!\1\2\u0348\u0344\3\2\2\2\u0349\u034c\3\2\2\2\u034a\u0348\3\2"+
		"\2\2\u034a\u034b\3\2\2\2\u034bA\3\2\2\2\u034c\u034a\3\2\2\2\u034d\u034f"+
		"\5D#\2\u034e\u034d\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0355\3\2\2\2\u0350"+
		"\u0351\5H%\2\u0351\u0352\b\"\1\2\u0352\u0354\3\2\2\2\u0353\u0350\3\2\2"+
		"\2\u0354\u0357\3\2\2\2\u0355\u0353\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u035d"+
		"\3\2\2\2\u0357\u0355\3\2\2\2\u0358\u0359\5R*\2\u0359\u035a\b\"\1\2\u035a"+
		"\u035c\3\2\2\2\u035b\u0358\3\2\2\2\u035c\u035f\3\2\2\2\u035d\u035b\3\2"+
		"\2\2\u035d\u035e\3\2\2\2\u035e\u0360\3\2\2\2\u035f\u035d\3\2\2\2\u0360"+
		"\u0361\7\2\2\3\u0361\u0362\b\"\1\2\u0362C\3\2\2\2\u0363\u0364\5F$\2\u0364"+
		"\u0365\b#\1\2\u0365\u0367\3\2\2\2\u0366\u0363\3\2\2\2\u0367\u036a\3\2"+
		"\2\2\u0368\u0366\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036b\3\2\2\2\u036a"+
		"\u0368\3\2\2\2\u036b\u036c\7\"\2\2\u036c\u036d\7h\2\2\u036d\u036e\b#\1"+
		"\2\u036e\u0374\3\2\2\2\u036f\u0370\7C\2\2\u0370\u0371\7h\2\2\u0371\u0373"+
		"\b#\1\2\u0372\u036f\3\2\2\2\u0373\u0376\3\2\2\2\u0374\u0372\3\2\2\2\u0374"+
		"\u0375\3\2\2\2\u0375\u0377\3\2\2\2\u0376\u0374\3\2\2\2\u0377\u0378\7A"+
		"\2\2\u0378\u0379\b#\1\2\u0379E\3\2\2\2\u037a\u037b\5\u00e8u\2\u037b\u037c"+
		"\b$\1\2\u037cG\3\2\2\2\u037d\u037e\5J&\2\u037e\u037f\b%\1\2\u037f\u038a"+
		"\3\2\2\2\u0380\u0381\5L\'\2\u0381\u0382\b%\1\2\u0382\u038a\3\2\2\2\u0383"+
		"\u0384\5N(\2\u0384\u0385\b%\1\2\u0385\u038a\3\2\2\2\u0386\u0387\5P)\2"+
		"\u0387\u0388\b%\1\2\u0388\u038a\3\2\2\2\u0389\u037d\3\2\2\2\u0389\u0380"+
		"\3\2\2\2\u0389\u0383\3\2\2\2\u0389\u0386\3\2\2\2\u038aI\3\2\2\2\u038b"+
		"\u038c\7\33\2\2\u038c\u038d\58\35\2\u038d\u038e\7A\2\2\u038e\u038f\b&"+
		"\1\2\u038fK\3\2\2\2\u0390\u0391\7\33\2\2\u0391\u0392\5:\36\2\u0392\u0393"+
		"\7C\2\2\u0393\u0394\7U\2\2\u0394\u0395\7A\2\2\u0395\u0396\b\'\1\2\u0396"+
		"M\3\2\2\2\u0397\u0398\7\33\2\2\u0398\u0399\7(\2\2\u0399\u039a\58\35\2"+
		"\u039a\u039b\7C\2\2\u039b\u039c\7h\2\2\u039c\u039d\7A\2\2\u039d\u039e"+
		"\b(\1\2\u039eO\3\2\2\2\u039f\u03a0\7\33\2\2\u03a0\u03a1\7(\2\2\u03a1\u03a2"+
		"\58\35\2\u03a2\u03a3\7C\2\2\u03a3\u03a4\7U\2\2\u03a4\u03a5\7A\2\2\u03a5"+
		"\u03a6\b)\1\2\u03a6Q\3\2\2\2\u03a7\u03a8\5T+\2\u03a8\u03a9\b*\1\2\u03a9"+
		"\u03af\3\2\2\2\u03aa\u03ab\5\u00c8e\2\u03ab\u03ac\b*\1\2\u03ac\u03af\3"+
		"\2\2\2\u03ad\u03af\7A\2\2\u03ae\u03a7\3\2\2\2\u03ae\u03aa\3\2\2\2\u03ae"+
		"\u03ad\3\2\2\2\u03afS\3\2\2\2\u03b0\u03b1\5V,\2\u03b1\u03b2\b+\1\2\u03b2"+
		"\u03b7\3\2\2\2\u03b3\u03b4\5\u00bc_\2\u03b4\u03b5\b+\1\2\u03b5\u03b7\3"+
		"\2\2\2\u03b6\u03b0\3\2\2\2\u03b6\u03b3\3\2\2\2\u03b7U\3\2\2\2\u03b8\u03b9"+
		"\5X-\2\u03b9\u03ba\b,\1\2\u03ba\u03bc\3\2\2\2\u03bb\u03b8\3\2\2\2\u03bc"+
		"\u03bf\3\2\2\2\u03bd\u03bb\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c0\3\2"+
		"\2\2\u03bf\u03bd\3\2\2\2\u03c0\u03c1\7\13\2\2\u03c1\u03c3\7h\2\2\u03c2"+
		"\u03c4\5Z.\2\u03c3\u03c2\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c6\3\2\2"+
		"\2\u03c5\u03c7\5^\60\2\u03c6\u03c5\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c9"+
		"\3\2\2\2\u03c8\u03ca\5`\61\2\u03c9\u03c8\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca"+
		"\u03cb\3\2\2\2\u03cb\u03cc\b,\1\2\u03cc\u03cd\5d\63\2\u03cdW\3\2\2\2\u03ce"+
		"\u03cf\5\u00e8u\2\u03cf\u03d0\b-\1\2\u03d0\u03e0\3\2\2\2\u03d1\u03d2\7"+
		"%\2\2\u03d2\u03e0\b-\1\2\u03d3\u03d4\7$\2\2\u03d4\u03e0\b-\1\2\u03d5\u03d6"+
		"\7#\2\2\u03d6\u03e0\b-\1\2\u03d7\u03d8\7\3\2\2\u03d8\u03e0\b-\1\2\u03d9"+
		"\u03da\7(\2\2\u03da\u03e0\b-\1\2\u03db\u03dc\7\24\2\2\u03dc\u03e0\b-\1"+
		"\2\u03dd\u03de\7)\2\2\u03de\u03e0\b-\1\2\u03df\u03ce\3\2\2\2\u03df\u03d1"+
		"\3\2\2\2\u03df\u03d3\3\2\2\2\u03df\u03d5\3\2\2\2\u03df\u03d7\3\2\2\2\u03df"+
		"\u03d9\3\2\2\2\u03df\u03db\3\2\2\2\u03df\u03dd\3\2\2\2\u03e0Y\3\2\2\2"+
		"\u03e1\u03e2\7F\2\2\u03e2\u03e3\5\\/\2\u03e3\u03e4\7E\2\2\u03e4\u03e5"+
		"\b.\1\2\u03e5[\3\2\2\2\u03e6\u03e7\5$\23\2\u03e7\u03e8\b/\1\2\u03e8\u03ef"+
		"\3\2\2\2\u03e9\u03ea\7B\2\2\u03ea\u03eb\5$\23\2\u03eb\u03ec\b/\1\2\u03ec"+
		"\u03ee\3\2\2\2\u03ed\u03e9\3\2\2\2\u03ee\u03f1\3\2\2\2\u03ef\u03ed\3\2"+
		"\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f2\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f2"+
		"\u03f3\b/\1\2\u03f3]\3\2\2\2\u03f4\u03f5\7\23\2\2\u03f5\u03f6\5\22\n\2"+
		"\u03f6\u03f7\b\60\1\2\u03f7_\3\2\2\2\u03f8\u03f9\7\32\2\2\u03f9\u03fa"+
		"\5b\62\2\u03fa\u03fb\b\61\1\2\u03fba\3\2\2\2\u03fc\u03fd\5\30\r\2\u03fd"+
		"\u03fe\b\62\1\2\u03fe\u0405\3\2\2\2\u03ff\u0400\7B\2\2\u0400\u0401\5\30"+
		"\r\2\u0401\u0402\b\62\1\2\u0402\u0404\3\2\2\2\u0403\u03ff\3\2\2\2\u0404"+
		"\u0407\3\2\2\2\u0405\u0403\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0408\3\2"+
		"\2\2\u0407\u0405\3\2\2\2\u0408\u0409\b\62\1\2\u0409c\3\2\2\2\u040a\u040e"+
		"\7=\2\2\u040b\u040d\5f\64\2\u040c\u040b\3\2\2\2\u040d\u0410\3\2\2\2\u040e"+
		"\u040c\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0411\3\2\2\2\u0410\u040e\3\2"+
		"\2\2\u0411\u0412\7>\2\2\u0412e\3\2\2\2\u0413\u041e\5h\65\2\u0414\u0415"+
		"\5\u00acW\2\u0415\u0416\b\64\1\2\u0416\u041e\3\2\2\2\u0417\u0418\5\u00ae"+
		"X\2\u0418\u0419\b\64\1\2\u0419\u041e\3\2\2\2\u041a\u041b\5\u00b0Y\2\u041b"+
		"\u041c\b\64\1\2\u041c\u041e\3\2\2\2\u041d\u0413\3\2\2\2\u041d\u0414\3"+
		"\2\2\2\u041d\u0417\3\2\2\2\u041d\u041a\3\2\2\2\u041eg\3\2\2\2\u041f\u0420"+
		"\5j\66\2\u0420\u0421\b\65\1\2\u0421\u042d\3\2\2\2\u0422\u0423\5\u008e"+
		"H\2\u0423\u0424\b\65\1\2\u0424\u042d\3\2\2\2\u0425\u0426\5T+\2\u0426\u0427"+
		"\b\65\1\2\u0427\u042d\3\2\2\2\u0428\u0429\5\u00c8e\2\u0429\u042a\b\65"+
		"\1\2\u042a\u042d\3\2\2\2\u042b\u042d\7A\2\2\u042c\u041f\3\2\2\2\u042c"+
		"\u0422\3\2\2\2\u042c\u0425\3\2\2\2\u042c\u0428\3\2\2\2\u042c\u042b\3\2"+
		"\2\2\u042di\3\2\2\2\u042e\u042f\5l\67\2\u042f\u0430\b\66\1\2\u0430\u0432"+
		"\3\2\2\2\u0431\u042e\3\2\2\2\u0432\u0435\3\2\2\2\u0433\u0431\3\2\2\2\u0433"+
		"\u0434\3\2\2\2\u0434\u0436\3\2\2\2\u0435\u0433\3\2\2\2\u0436\u0437\5v"+
		"<\2\u0437\u0438\5n8\2\u0438\u0439\7A\2\2\u0439\u043a\b\66\1\2\u043ak\3"+
		"\2\2\2\u043b\u043c\5\u00e8u\2\u043c\u043d\b\67\1\2\u043d\u044d\3\2\2\2"+
		"\u043e\u043f\7%\2\2\u043f\u044d\b\67\1\2\u0440\u0441\7$\2\2\u0441\u044d"+
		"\b\67\1\2\u0442\u0443\7#\2\2\u0443\u044d\b\67\1\2\u0444\u0445\7(\2\2\u0445"+
		"\u044d\b\67\1\2\u0446\u0447\7\24\2\2\u0447\u044d\b\67\1\2\u0448\u0449"+
		"\7\60\2\2\u0449\u044d\b\67\1\2\u044a\u044b\7\63\2\2\u044b\u044d\b\67\1"+
		"\2\u044c\u043b\3\2\2\2\u044c\u043e\3\2\2\2\u044c\u0440\3\2\2\2\u044c\u0442"+
		"\3\2\2\2\u044c\u0444\3\2\2\2\u044c\u0446\3\2\2\2\u044c\u0448\3\2\2\2\u044c"+
		"\u044a\3\2\2\2\u044dm\3\2\2\2\u044e\u044f\5p9\2\u044f\u0450\b8\1\2\u0450"+
		"\u0457\3\2\2\2\u0451\u0452\7B\2\2\u0452\u0453\5p9\2\u0453\u0454\b8\1\2"+
		"\u0454\u0456\3\2\2\2\u0455\u0451\3\2\2\2\u0456\u0459\3\2\2\2\u0457\u0455"+
		"\3\2\2\2\u0457\u0458\3\2\2\2\u0458\u045a\3\2\2\2\u0459\u0457\3\2\2\2\u045a"+
		"\u045b\b8\1\2\u045bo\3\2\2\2\u045c\u045f\5r:\2\u045d\u045e\7D\2\2\u045e"+
		"\u0460\5t;\2\u045f\u045d\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0461\3\2\2"+
		"\2\u0461\u0462\b9\1\2\u0462q\3\2\2\2\u0463\u0465\7h\2\2\u0464\u0466\5"+
		"\"\22\2\u0465\u0464\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0467\3\2\2\2\u0467"+
		"\u0468\b:\1\2\u0468s\3\2\2\2\u0469\u046a\5\u01a2\u00d2\2\u046a\u046b\b"+
		";\1\2\u046b\u0470\3\2\2\2\u046c\u046d\5\u00fa~\2\u046d\u046e\b;\1\2\u046e"+
		"\u0470\3\2\2\2\u046f\u0469\3\2\2\2\u046f\u046c\3\2\2\2\u0470u\3\2\2\2"+
		"\u0471\u0472\5x=\2\u0472\u0473\b<\1\2\u0473\u0478\3\2\2\2\u0474\u0475"+
		"\5z>\2\u0475\u0476\b<\1\2\u0476\u0478\3\2\2\2\u0477\u0471\3\2\2\2\u0477"+
		"\u0474\3\2\2\2\u0478w\3\2\2\2\u0479\u047a\5\b\5\2\u047a\u047b\b=\1\2\u047b"+
		"\u047f\3\2\2\2\u047c\u047d\7\5\2\2\u047d\u047f\b=\1\2\u047e\u0479\3\2"+
		"\2\2\u047e\u047c\3\2\2\2\u047fy\3\2\2\2\u0480\u0481\5|?\2\u0481\u0482"+
		"\b>\1\2\u0482\u048a\3\2\2\2\u0483\u0484\5\u008aF\2\u0484\u0485\b>\1\2"+
		"\u0485\u048a\3\2\2\2\u0486\u0487\5\u008cG\2\u0487\u0488\b>\1\2\u0488\u048a"+
		"\3\2\2\2\u0489\u0480\3\2\2\2\u0489\u0483\3\2\2\2\u0489\u0486\3\2\2\2\u048a"+
		"{\3\2\2\2\u048b\u048c\5\u0082B\2\u048c\u048d\b?\1\2\u048d\u0492\3\2\2"+
		"\2\u048e\u048f\5\u0088E\2\u048f\u0490\b?\1\2\u0490\u0492\3\2\2\2\u0491"+
		"\u048b\3\2\2\2\u0491\u048e\3\2\2\2\u0492\u049b\3\2\2\2\u0493\u0494\5\u0080"+
		"A\2\u0494\u0495\b?\1\2\u0495\u049a\3\2\2\2\u0496\u0497\5\u0086D\2\u0497"+
		"\u0498\b?\1\2\u0498\u049a\3\2\2\2\u0499\u0493\3\2\2\2\u0499\u0496\3\2"+
		"\2\2\u049a\u049d\3\2\2\2\u049b\u0499\3\2\2\2\u049b\u049c\3\2\2\2\u049c"+
		"}\3\2\2\2\u049d\u049b\3\2\2\2\u049e\u04a0\7h\2\2\u049f\u04a1\5,\27\2\u04a0"+
		"\u049f\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04b4\b@"+
		"\1\2\u04a3\u04a4\5|?\2\u04a4\u04aa\7C\2\2\u04a5\u04a6\5\u00e8u\2\u04a6"+
		"\u04a7\b@\1\2\u04a7\u04a9\3\2\2\2\u04a8\u04a5\3\2\2\2\u04a9\u04ac\3\2"+
		"\2\2\u04aa\u04a8\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04ad\3\2\2\2\u04ac"+
		"\u04aa\3\2\2\2\u04ad\u04af\7h\2\2\u04ae\u04b0\5,\27\2\u04af\u04ae\3\2"+
		"\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b2\b@\1\2\u04b2"+
		"\u04b4\3\2\2\2\u04b3\u049e\3\2\2\2\u04b3\u04a3\3\2\2\2\u04b4\177\3\2\2"+
		"\2\u04b5\u04bb\7C\2\2\u04b6\u04b7\5\u00e8u\2\u04b7\u04b8\bA\1\2\u04b8"+
		"\u04ba\3\2\2\2\u04b9\u04b6\3\2\2\2\u04ba\u04bd\3\2\2\2\u04bb\u04b9\3\2"+
		"\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04be\3\2\2\2\u04bd\u04bb\3\2\2\2\u04be"+
		"\u04c0\7h\2\2\u04bf\u04c1\5,\27\2\u04c0\u04bf\3\2\2\2\u04c0\u04c1\3\2"+
		"\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c3\bA\1\2\u04c3\u0081\3\2\2\2\u04c4"+
		"\u04c6\7h\2\2\u04c5\u04c7\5,\27\2\u04c6\u04c5\3\2\2\2\u04c6\u04c7\3\2"+
		"\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04c9\bB\1\2\u04c9\u0083\3\2\2\2\u04ca"+
		"\u04cb\5~@\2\u04cb\u04cc\bC\1\2\u04cc\u0085\3\2\2\2\u04cd\u04ce\5\u0080"+
		"A\2\u04ce\u04cf\bD\1\2\u04cf\u0087\3\2\2\2\u04d0\u04d1\5\u0082B\2\u04d1"+
		"\u04d2\bE\1\2\u04d2\u0089\3\2\2\2\u04d3\u04d4\7h\2\2\u04d4\u04d5\bF\1"+
		"\2\u04d5\u008b\3\2\2\2\u04d6\u04d7\5x=\2\u04d7\u04d8\5\"\22\2\u04d8\u04d9"+
		"\bG\1\2\u04d9\u04e3\3\2\2\2\u04da\u04db\5|?\2\u04db\u04dc\5\"\22\2\u04dc"+
		"\u04dd\bG\1\2\u04dd\u04e3\3\2\2\2\u04de\u04df\5\u008aF\2\u04df\u04e0\5"+
		"\"\22\2\u04e0\u04e1\bG\1\2\u04e1\u04e3\3\2\2\2\u04e2\u04d6\3\2\2\2\u04e2"+
		"\u04da\3\2\2\2\u04e2\u04de\3\2\2\2\u04e3\u008d\3\2\2\2\u04e4\u04e5\5\u0090"+
		"I\2\u04e5\u04e6\bH\1\2\u04e6\u04e8\3\2\2\2\u04e7\u04e4\3\2\2\2\u04e8\u04eb"+
		"\3\2\2\2\u04e9\u04e7\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04ec\3\2\2\2\u04eb"+
		"\u04e9\3\2\2\2\u04ec\u04ed\bH\1\2\u04ed\u04ee\5\u0092J\2\u04ee\u04ef\5"+
		"\u00aaV\2\u04ef\u04f0\bH\1\2\u04f0\u008f\3\2\2\2\u04f1\u04f2\5\u00e8u"+
		"\2\u04f2\u04f3\bI\1\2\u04f3\u0507\3\2\2\2\u04f4\u04f5\7%\2\2\u04f5\u0507"+
		"\bI\1\2\u04f6\u04f7\7$\2\2\u04f7\u0507\bI\1\2\u04f8\u04f9\7#\2\2\u04f9"+
		"\u0507\bI\1\2\u04fa\u04fb\7\3\2\2\u04fb\u0507\bI\1\2\u04fc\u04fd\7(\2"+
		"\2\u04fd\u0507\bI\1\2\u04fe\u04ff\7\24\2\2\u04ff\u0507\bI\1\2\u0500\u0501"+
		"\7,\2\2\u0501\u0507\bI\1\2\u0502\u0503\7 \2\2\u0503\u0507\bI\1\2\u0504"+
		"\u0505\7)\2\2\u0505\u0507\bI\1\2\u0506\u04f1\3\2\2\2\u0506\u04f4\3\2\2"+
		"\2\u0506\u04f6\3\2\2\2\u0506\u04f8\3\2\2\2\u0506\u04fa\3\2\2\2\u0506\u04fc"+
		"\3\2\2\2\u0506\u04fe\3\2\2\2\u0506\u0500\3\2\2\2\u0506\u0502\3\2\2\2\u0506"+
		"\u0504\3\2\2\2\u0507\u0091\3\2\2\2\u0508\u0509\5\u0094K\2\u0509\u050b"+
		"\5\u0096L\2\u050a\u050c\5\u00a4S\2\u050b\u050a\3\2\2\2\u050b\u050c\3\2"+
		"\2\2\u050c\u050d\3\2\2\2\u050d\u050e\bJ\1\2\u050e\u0520\3\2\2\2\u050f"+
		"\u0515\5Z.\2\u0510\u0511\5\u00e8u\2\u0511\u0512\bJ\1\2\u0512\u0514\3\2"+
		"\2\2\u0513\u0510\3\2\2\2\u0514\u0517\3\2\2\2\u0515\u0513\3\2\2\2\u0515"+
		"\u0516\3\2\2\2\u0516\u0518\3\2\2\2\u0517\u0515\3\2\2\2\u0518\u0519\5\u0094"+
		"K\2\u0519\u051b\5\u0096L\2\u051a\u051c\5\u00a4S\2\u051b\u051a\3\2\2\2"+
		"\u051b\u051c\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u051e\bJ\1\2\u051e\u0520"+
		"\3\2\2\2\u051f\u0508\3\2\2\2\u051f\u050f\3\2\2\2\u0520\u0093\3\2\2\2\u0521"+
		"\u0522\5v<\2\u0522\u0523\bK\1\2\u0523\u0527\3\2\2\2\u0524\u0525\7\62\2"+
		"\2\u0525\u0527\bK\1\2\u0526\u0521\3\2\2\2\u0526\u0524\3\2\2\2\u0527\u0095"+
		"\3\2\2\2\u0528\u0529\7h\2\2\u0529\u052b\7;\2\2\u052a\u052c\5\u0098M\2"+
		"\u052b\u052a\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u052f"+
		"\7<\2\2\u052e\u0530\5\"\22\2\u052f\u052e\3\2\2\2\u052f\u0530\3\2\2\2\u0530"+
		"\u0531\3\2\2\2\u0531\u0532\bL\1\2\u0532\u0097\3\2\2\2\u0533\u0534\5\u009a"+
		"N\2\u0534\u0535\bM\1\2\u0535\u0536\3\2\2\2\u0536\u0537\7B\2\2\u0537\u0538"+
		"\5\u00a0Q\2\u0538\u0539\bM\1\2\u0539\u053a\3\2\2\2\u053a\u053b\bM\1\2"+
		"\u053b\u0542\3\2\2\2\u053c\u053d\5\u00a0Q\2\u053d\u053e\bM\1\2\u053e\u053f"+
		"\3\2\2\2\u053f\u0540\bM\1\2\u0540\u0542\3\2\2\2\u0541\u0533\3\2\2\2\u0541"+
		"\u053c\3\2\2\2\u0542\u0099\3\2\2\2\u0543\u0544\5\u009cO\2\u0544\u0545"+
		"\bN\1\2\u0545\u054c\3\2\2\2\u0546\u0547\7B\2\2\u0547\u0548\5\u009cO\2"+
		"\u0548\u0549\bN\1\2\u0549\u054b\3\2\2\2\u054a\u0546\3\2\2\2\u054b\u054e"+
		"\3\2\2\2\u054c\u054a\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u054f\3\2\2\2\u054e"+
		"\u054c\3\2\2\2\u054f\u0550\bN\1\2\u0550\u0560\3\2\2\2\u0551\u0552\5\u00a2"+
		"R\2\u0552\u0553\bN\1\2\u0553\u055a\3\2\2\2\u0554\u0555\7B\2\2\u0555\u0556"+
		"\5\u009cO\2\u0556\u0557\bN\1\2\u0557\u0559\3\2\2\2\u0558\u0554\3\2\2\2"+
		"\u0559\u055c\3\2\2\2\u055a\u0558\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u055d"+
		"\3\2\2\2\u055c\u055a\3\2\2\2\u055d\u055e\bN\1\2\u055e\u0560\3\2\2\2\u055f"+
		"\u0543\3\2\2\2\u055f\u0551\3\2\2\2\u0560\u009b\3\2\2\2\u0561\u0562\5\u009e"+
		"P\2\u0562\u0563\bO\1\2\u0563\u0565\3\2\2\2\u0564\u0561\3\2\2\2\u0565\u0568"+
		"\3\2\2\2\u0566\u0564\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u0569\3\2\2\2\u0568"+
		"\u0566\3\2\2\2\u0569\u056a\5v<\2\u056a\u056b\5r:\2\u056b\u056c\bO\1\2"+
		"\u056c\u009d\3\2\2\2\u056d\u056e\5\u00e8u\2\u056e\u056f\bP\1\2\u056f\u0573"+
		"\3\2\2\2\u0570\u0571\7\24\2\2\u0571\u0573\bP\1\2\u0572\u056d\3\2\2\2\u0572"+
		"\u0570\3\2\2\2\u0573\u009f\3\2\2\2\u0574\u0575\5\u009eP\2\u0575\u0576"+
		"\bQ\1\2\u0576\u0578\3\2\2\2\u0577\u0574\3\2\2\2\u0578\u057b\3\2\2\2\u0579"+
		"\u0577\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u057c\3\2\2\2\u057b\u0579\3\2"+
		"\2\2\u057c\u0582\5v<\2\u057d\u057e\5\u00e8u\2\u057e\u057f\bQ\1\2\u057f"+
		"\u0581\3\2\2\2\u0580\u057d\3\2\2\2\u0581\u0584\3\2\2\2\u0582\u0580\3\2"+
		"\2\2\u0582\u0583\3\2\2\2\u0583\u0585\3\2\2\2\u0584\u0582\3\2\2\2\u0585"+
		"\u0586\7j\2\2\u0586\u0587\5r:\2\u0587\u0588\bQ\1\2\u0588\u058d\3\2\2\2"+
		"\u0589\u058a\5\u009cO\2\u058a\u058b\bQ\1\2\u058b\u058d\3\2\2\2\u058c\u0579"+
		"\3\2\2\2\u058c\u0589\3\2\2\2\u058d\u00a1\3\2\2\2\u058e\u058f\5\u00e8u"+
		"\2\u058f\u0590\bR\1\2\u0590\u0592\3\2\2\2\u0591\u058e\3\2\2\2\u0592\u0595"+
		"\3\2\2\2\u0593\u0591\3\2\2\2\u0593\u0594\3\2\2\2\u0594\u0596\3\2\2\2\u0595"+
		"\u0593\3\2\2\2\u0596\u0599\5v<\2\u0597\u0598\7h\2\2\u0598\u059a\7C\2\2"+
		"\u0599\u0597\3\2\2\2\u0599\u059a\3\2\2\2\u059a\u059b\3\2\2\2\u059b\u059c"+
		"\7-\2\2\u059c\u059d\bR\1\2\u059d\u00a3\3\2\2\2\u059e\u059f\7/\2\2\u059f"+
		"\u05a0\5\u00a6T\2\u05a0\u05a1\bS\1\2\u05a1\u00a5\3\2\2\2\u05a2\u05a3\5"+
		"\u00a8U\2\u05a3\u05a4\bT\1\2\u05a4\u05ab\3\2\2\2\u05a5\u05a6\7B\2\2\u05a6"+
		"\u05a7\5\u00a8U\2\u05a7\u05a8\bT\1\2\u05a8\u05aa\3\2\2\2\u05a9\u05a5\3"+
		"\2\2\2\u05aa\u05ad\3\2\2\2\u05ab\u05a9\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac"+
		"\u05ae\3\2\2\2\u05ad\u05ab\3\2\2\2\u05ae\u05af\bT\1\2\u05af\u00a7\3\2"+
		"\2\2\u05b0\u05b1\5\22\n\2\u05b1\u05b2\bU\1\2\u05b2\u05b7\3\2\2\2\u05b3"+
		"\u05b4\5\36\20\2\u05b4\u05b5\bU\1\2\u05b5\u05b7\3\2\2\2\u05b6\u05b0\3"+
		"\2\2\2\u05b6\u05b3\3\2\2\2\u05b7\u00a9\3\2\2\2\u05b8\u05b9\5\u00fe\u0080"+
		"\2\u05b9\u05ba\bV\1\2\u05ba\u05bd\3\2\2\2\u05bb\u05bd\7A\2\2\u05bc\u05b8"+
		"\3\2\2\2\u05bc\u05bb\3\2\2\2\u05bd\u00ab\3\2\2\2\u05be\u05bf\5\u00fe\u0080"+
		"\2\u05bf\u05c0\bW\1\2\u05c0\u00ad\3\2\2\2\u05c1\u05c2\7(\2\2\u05c2\u05c3"+
		"\5\u00fe\u0080\2\u05c3\u05c4\bX\1\2\u05c4\u00af\3\2\2\2\u05c5\u05c6\5"+
		"\u00b2Z\2\u05c6\u05c7\bY\1\2\u05c7\u05c9\3\2\2\2\u05c8\u05c5\3\2\2\2\u05c9"+
		"\u05cc\3\2\2\2\u05ca\u05c8\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05cd\3\2"+
		"\2\2\u05cc\u05ca\3\2\2\2\u05cd\u05ce\bY\1\2\u05ce\u05d0\5\u00b4[\2\u05cf"+
		"\u05d1\5\u00a4S\2\u05d0\u05cf\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d2"+
		"\3\2\2\2\u05d2\u05d3\5\u00b8]\2\u05d3\u05d4\bY\1\2\u05d4\u00b1\3\2\2\2"+
		"\u05d5\u05d6\5\u00e8u\2\u05d6\u05d7\bZ\1\2\u05d7\u05df\3\2\2\2\u05d8\u05d9"+
		"\7%\2\2\u05d9\u05df\bZ\1\2\u05da\u05db\7$\2\2\u05db\u05df\bZ\1\2\u05dc"+
		"\u05dd\7#\2\2\u05dd\u05df\bZ\1\2\u05de\u05d5\3\2\2\2\u05de\u05d8\3\2\2"+
		"\2\u05de\u05da\3\2\2\2\u05de\u05dc\3\2\2\2\u05df\u00b3\3\2\2\2\u05e0\u05e2"+
		"\5Z.\2\u05e1\u05e0\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3"+
		"\u05e4\5\u00b6\\\2\u05e4\u05e6\7;\2\2\u05e5\u05e7\5\u0098M\2\u05e6\u05e5"+
		"\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u05e9\7<\2\2\u05e9"+
		"\u05ea\b[\1\2\u05ea\u00b5\3\2\2\2\u05eb\u05ec\7h\2\2\u05ec\u05ed\b\\\1"+
		"\2\u05ed\u00b7\3\2\2\2\u05ee\u05f0\7=\2\2\u05ef\u05f1\5\u00ba^\2\u05f0"+
		"\u05ef\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1\u05f3\3\2\2\2\u05f2\u05f4\5\u0100"+
		"\u0081\2\u05f3\u05f2\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5"+
		"\u05f6\7>\2\2\u05f6\u05f7\b]\1\2\u05f7\u00b9\3\2\2\2\u05f8\u05fa\5,\27"+
		"\2\u05f9\u05f8\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u05fc"+
		"\7-\2\2\u05fc\u05fe\7;\2\2\u05fd\u05ff\5\u0192\u00ca\2\u05fe\u05fd\3\2"+
		"\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u0601\7<\2\2\u0601"+
		"\u0602\7A\2\2\u0602\u062b\b^\1\2\u0603\u0605\5,\27\2\u0604\u0603\3\2\2"+
		"\2\u0604\u0605\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0607\7*\2\2\u0607\u0609"+
		"\7;\2\2\u0608\u060a\5\u0192\u00ca\2\u0609\u0608\3\2\2\2\u0609\u060a\3"+
		"\2\2\2\u060a\u060b\3\2\2\2\u060b\u060c\7<\2\2\u060c\u060d\7A\2\2\u060d"+
		"\u062b\b^\1\2\u060e\u060f\5<\37\2\u060f\u0611\7C\2\2\u0610\u0612\5,\27"+
		"\2\u0611\u0610\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0614"+
		"\7*\2\2\u0614\u0616\7;\2\2\u0615\u0617\5\u0192\u00ca\2\u0616\u0615\3\2"+
		"\2\2\u0616\u0617\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u0619\7<\2\2\u0619"+
		"\u061a\7A\2\2\u061a\u061b\b^\1\2\u061b\u062b\3\2\2\2\u061c\u061d\5\u0162"+
		"\u00b2\2\u061d\u061f\7C\2\2\u061e\u0620\5,\27\2\u061f\u061e\3\2\2\2\u061f"+
		"\u0620\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u0622\7*\2\2\u0622\u0624\7;\2"+
		"\2\u0623\u0625\5\u0192\u00ca\2\u0624\u0623\3\2\2\2\u0624\u0625\3\2\2\2"+
		"\u0625\u0626\3\2\2\2\u0626\u0627\7<\2\2\u0627\u0628\7A\2\2\u0628\u0629"+
		"\b^\1\2\u0629\u062b\3\2\2\2\u062a\u05f9\3\2\2\2\u062a\u0604\3\2\2\2\u062a"+
		"\u060e\3\2\2\2\u062a\u061c\3\2\2\2\u062b\u00bb\3\2\2\2\u062c\u062d\5X"+
		"-\2\u062d\u062e\b_\1\2\u062e\u0630\3\2\2\2\u062f\u062c\3\2\2\2\u0630\u0633"+
		"\3\2\2\2\u0631\u062f\3\2\2\2\u0631\u0632\3\2\2\2\u0632\u0634\3\2\2\2\u0633"+
		"\u0631\3\2\2\2\u0634\u0635\7\22\2\2\u0635\u0637\7h\2\2\u0636\u0638\5`"+
		"\61\2\u0637\u0636\3\2\2\2\u0637\u0638\3\2\2\2\u0638\u0639\3\2\2\2\u0639"+
		"\u063a\b_\1\2\u063a\u063b\5\u00be`\2\u063b\u00bd\3\2\2\2\u063c\u063e\7"+
		"=\2\2\u063d\u063f\5\u00c0a\2\u063e\u063d\3\2\2\2\u063e\u063f\3\2\2\2\u063f"+
		"\u0641\3\2\2\2\u0640\u0642\7B\2\2\u0641\u0640\3\2\2\2\u0641\u0642\3\2"+
		"\2\2\u0642\u0644\3\2\2\2\u0643\u0645\5\u00c6d\2\u0644\u0643\3\2\2\2\u0644"+
		"\u0645\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u0647\7>\2\2\u0647\u00bf\3\2"+
		"\2\2\u0648\u064d\5\u00c2b\2\u0649\u064a\7B\2\2\u064a\u064c\5\u00c2b\2"+
		"\u064b\u0649\3\2\2\2\u064c\u064f\3\2\2\2\u064d\u064b\3\2\2\2\u064d\u064e"+
		"\3\2\2\2\u064e\u00c1\3\2\2\2\u064f\u064d\3\2\2\2\u0650\u0651\5\u00c4c"+
		"\2\u0651\u0652\bb\1\2\u0652\u0654\3\2\2\2\u0653\u0650\3\2\2\2\u0654\u0657"+
		"\3\2\2\2\u0655\u0653\3\2\2\2\u0655\u0656\3\2\2\2\u0656\u0658\3\2\2\2\u0657"+
		"\u0655\3\2\2\2\u0658\u065e\7h\2\2\u0659\u065b\7;\2\2\u065a\u065c\5\u0192"+
		"\u00ca\2\u065b\u065a\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u065d\3\2\2\2\u065d"+
		"\u065f\7<\2\2\u065e\u0659\3\2\2\2\u065e\u065f\3\2\2\2\u065f\u0660\3\2"+
		"\2\2\u0660\u0662\bb\1\2\u0661\u0663\5d\63\2\u0662\u0661\3\2\2\2\u0662"+
		"\u0663\3\2\2\2\u0663\u00c3\3\2\2\2\u0664\u0665\5\u00e8u\2\u0665\u0666"+
		"\bc\1\2\u0666\u00c5\3\2\2\2\u0667\u066b\7A\2\2\u0668\u066a\5f\64\2\u0669"+
		"\u0668\3\2\2\2\u066a\u066d\3\2\2\2\u066b\u0669\3\2\2\2\u066b\u066c\3\2"+
		"\2\2\u066c\u00c7\3\2\2\2\u066d\u066b\3\2\2\2\u066e\u066f\5\u00caf\2\u066f"+
		"\u0670\be\1\2\u0670\u0675\3\2\2\2\u0671\u0672\5\u00dco\2\u0672\u0673\b"+
		"e\1\2\u0673\u0675\3\2\2\2\u0674\u066e\3\2\2\2\u0674\u0671\3\2\2\2\u0675"+
		"\u00c9\3\2\2\2\u0676\u0677\5\u00ccg\2\u0677\u0678\bf\1\2\u0678\u067a\3"+
		"\2\2\2\u0679\u0676\3\2\2\2\u067a\u067d\3\2\2\2\u067b\u0679\3\2\2\2\u067b"+
		"\u067c\3\2\2\2\u067c\u067e\3\2\2\2\u067d\u067b\3\2\2\2\u067e\u067f\7\36"+
		"\2\2\u067f\u0681\7h\2\2\u0680\u0682\5Z.\2\u0681\u0680\3\2\2\2\u0681\u0682"+
		"\3\2\2\2\u0682\u0684\3\2\2\2\u0683\u0685\5\u00ceh\2\u0684\u0683\3\2\2"+
		"\2\u0684\u0685\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u0687\bf\1\2\u0687\u0688"+
		"\5\u00d0i\2\u0688\u00cb\3\2\2\2\u0689\u068a\5\u00e8u\2\u068a\u068b\bg"+
		"\1\2\u068b\u0699\3\2\2\2\u068c\u068d\7%\2\2\u068d\u0699\bg\1\2\u068e\u068f"+
		"\7$\2\2\u068f\u0699\bg\1\2\u0690\u0691\7#\2\2\u0691\u0699\bg\1\2\u0692"+
		"\u0693\7\3\2\2\u0693\u0699\bg\1\2\u0694\u0695\7(\2\2\u0695\u0699\bg\1"+
		"\2\u0696\u0697\7)\2\2\u0697\u0699\bg\1\2\u0698\u0689\3\2\2\2\u0698\u068c"+
		"\3\2\2\2\u0698\u068e\3\2\2\2\u0698\u0690\3\2\2\2\u0698\u0692\3\2\2\2\u0698"+
		"\u0694\3\2\2\2\u0698\u0696\3\2\2\2\u0699\u00cd\3\2\2\2\u069a\u069b\7\23"+
		"\2\2\u069b\u069c\5b\62\2\u069c\u069d\bh\1\2\u069d\u00cf\3\2\2\2\u069e"+
		"\u06a2\7=\2\2\u069f\u06a1\5\u00d2j\2\u06a0\u069f\3\2\2\2\u06a1\u06a4\3"+
		"\2\2\2\u06a2\u06a0\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06a5\3\2\2\2\u06a4"+
		"\u06a2\3\2\2\2\u06a5\u06a6\7>\2\2\u06a6\u00d1\3\2\2\2\u06a7\u06a8\5\u00d4"+
		"k\2\u06a8\u06a9\bj\1\2\u06a9\u06b5\3\2\2\2\u06aa\u06ab\5\u00d8m\2\u06ab"+
		"\u06ac\bj\1\2\u06ac\u06b5\3\2\2\2\u06ad\u06ae\5T+\2\u06ae\u06af\bj\1\2"+
		"\u06af\u06b5\3\2\2\2\u06b0\u06b1\5\u00c8e\2\u06b1\u06b2\bj\1\2\u06b2\u06b5"+
		"\3\2\2\2\u06b3\u06b5\7A\2\2\u06b4\u06a7\3\2\2\2\u06b4\u06aa\3\2\2\2\u06b4"+
		"\u06ad\3\2\2\2\u06b4\u06b0\3\2\2\2\u06b4\u06b3\3\2\2\2\u06b5\u00d3\3\2"+
		"\2\2\u06b6\u06b7\5\u00d6l\2\u06b7\u06b8\bk\1\2\u06b8\u06ba\3\2\2\2\u06b9"+
		"\u06b6\3\2\2\2\u06ba\u06bd\3\2\2\2\u06bb\u06b9\3\2\2\2\u06bb\u06bc\3\2"+
		"\2\2\u06bc\u06be\3\2\2\2\u06bd\u06bb\3\2\2\2\u06be\u06bf\5v<\2\u06bf\u06c0"+
		"\5n8\2\u06c0\u06c1\7A\2\2\u06c1\u06c2\bk\1\2\u06c2\u00d5\3\2\2\2\u06c3"+
		"\u06c4\5\u00e8u\2\u06c4\u06c5\bl\1\2\u06c5\u06cd\3\2\2\2\u06c6\u06c7\7"+
		"%\2\2\u06c7\u06cd\bl\1\2\u06c8\u06c9\7(\2\2\u06c9\u06cd\bl\1\2\u06ca\u06cb"+
		"\7\24\2\2\u06cb\u06cd\bl\1\2\u06cc\u06c3\3\2\2\2\u06cc\u06c6\3\2\2\2\u06cc"+
		"\u06c8\3\2\2\2\u06cc\u06ca\3\2\2\2\u06cd\u00d7\3\2\2\2\u06ce\u06cf\5\u00da"+
		"n\2\u06cf\u06d0\bm\1\2\u06d0\u06d2\3\2\2\2\u06d1\u06ce\3\2\2\2\u06d2\u06d5"+
		"\3\2\2\2\u06d3\u06d1\3\2\2\2\u06d3\u06d4\3\2\2\2\u06d4\u06d6\3\2\2\2\u06d5"+
		"\u06d3\3\2\2\2\u06d6\u06d7\bm\1\2\u06d7\u06d8\5\u0092J\2\u06d8\u06d9\5"+
		"\u00aaV\2\u06d9\u06da\bm\1\2\u06da\u00d9\3\2\2\2\u06db\u06dc\5\u00e8u"+
		"\2\u06dc\u06dd\bn\1\2\u06dd\u06e9\3\2\2\2\u06de\u06df\7%\2\2\u06df\u06e9"+
		"\bn\1\2\u06e0\u06e1\7\3\2\2\u06e1\u06e9\bn\1\2\u06e2\u06e3\7\16\2\2\u06e3"+
		"\u06e9\bn\1\2\u06e4\u06e5\7(\2\2\u06e5\u06e9\bn\1\2\u06e6\u06e7\7)\2\2"+
		"\u06e7\u06e9\bn\1\2\u06e8\u06db\3\2\2\2\u06e8\u06de\3\2\2\2\u06e8\u06e0"+
		"\3\2\2\2\u06e8\u06e2\3\2\2\2\u06e8\u06e4\3\2\2\2\u06e8\u06e6\3\2\2\2\u06e9"+
		"\u00db\3\2\2\2\u06ea\u06eb\5\u00ccg\2\u06eb\u06ec\bo\1\2\u06ec\u06ee\3"+
		"\2\2\2\u06ed\u06ea\3\2\2\2\u06ee\u06f1\3\2\2\2\u06ef\u06ed\3\2\2\2\u06ef"+
		"\u06f0\3\2\2\2\u06f0\u06f2\3\2\2\2\u06f1\u06ef\3\2\2\2\u06f2\u06f3\7i"+
		"\2\2\u06f3\u06f4\7\36\2\2\u06f4\u06f5\7h\2\2\u06f5\u06f6\bo\1\2\u06f6"+
		"\u06f7\5\u00dep\2\u06f7\u00dd\3\2\2\2\u06f8\u06fc\7=\2\2\u06f9\u06fb\5"+
		"\u00e0q\2\u06fa\u06f9\3\2\2\2\u06fb\u06fe\3\2\2\2\u06fc\u06fa\3\2\2\2"+
		"\u06fc\u06fd\3\2\2\2\u06fd\u06ff\3\2\2\2\u06fe\u06fc\3\2\2\2\u06ff\u0700"+
		"\7>\2\2\u0700\u00df\3\2\2\2\u0701\u0702\5\u00e2r\2\u0702\u0703\bq\1\2"+
		"\u0703\u070f\3\2\2\2\u0704\u0705\5\u00d4k\2\u0705\u0706\bq\1\2\u0706\u070f"+
		"\3\2\2\2\u0707\u0708\5T+\2\u0708\u0709\bq\1\2\u0709\u070f\3\2\2\2\u070a"+
		"\u070b\5\u00c8e\2\u070b\u070c\bq\1\2\u070c\u070f\3\2\2\2\u070d\u070f\7"+
		"A\2\2\u070e\u0701\3\2\2\2\u070e\u0704\3\2\2\2\u070e\u0707\3\2\2\2\u070e"+
		"\u070a\3\2\2\2\u070e\u070d\3\2\2\2\u070f\u00e1\3\2\2\2\u0710\u0711\5\u00e4"+
		"s\2\u0711\u0712\br\1\2\u0712\u0714\3\2\2\2\u0713\u0710\3\2\2\2\u0714\u0717"+
		"\3\2\2\2\u0715\u0713\3\2\2\2\u0715\u0716\3\2\2\2\u0716\u0718\3\2\2\2\u0717"+
		"\u0715\3\2\2\2\u0718\u0719\5v<\2\u0719\u071a\7h\2\2\u071a\u071b\7;\2\2"+
		"\u071b\u071d\7<\2\2\u071c\u071e\5\"\22\2\u071d\u071c\3\2\2\2\u071d\u071e"+
		"\3\2\2\2\u071e\u0720\3\2\2\2\u071f\u0721\5\u00e6t\2\u0720\u071f\3\2\2"+
		"\2\u0720\u0721\3\2\2\2\u0721\u0722\3\2\2\2\u0722\u0723\7A\2\2\u0723\u0724"+
		"\br\1\2\u0724\u00e3\3\2\2\2\u0725\u0726\5\u00e8u\2\u0726\u0727\bs\1\2"+
		"\u0727\u072d\3\2\2\2\u0728\u0729\7%\2\2\u0729\u072d\bs\1\2\u072a\u072b"+
		"\7\3\2\2\u072b\u072d\bs\1\2\u072c\u0725\3\2\2\2\u072c\u0728\3\2\2\2\u072c"+
		"\u072a\3\2\2\2\u072d\u00e5\3\2\2\2\u072e\u072f\7\16\2\2\u072f\u0730\5"+
		"\u00f0y\2\u0730\u0731\bt\1\2\u0731\u00e7\3\2\2\2\u0732\u0733\5\u00eav"+
		"\2\u0733\u0734\bu\1\2\u0734\u073c\3\2\2\2\u0735\u0736\5\u00f6|\2\u0736"+
		"\u0737\bu\1\2\u0737\u073c\3\2\2\2\u0738\u0739\5\u00f8}\2\u0739\u073a\b"+
		"u\1\2\u073a\u073c\3\2\2\2\u073b\u0732\3\2\2\2\u073b\u0735\3\2\2\2\u073b"+
		"\u0738\3\2\2\2\u073c\u00e9\3\2\2\2\u073d\u073e\7i\2\2\u073e\u073f\58\35"+
		"\2\u073f\u0740\bv\1\2\u0740\u0742\7;\2\2\u0741\u0743\5\u00ecw\2\u0742"+
		"\u0741\3\2\2\2\u0742\u0743\3\2\2\2\u0743\u0744\3\2\2\2\u0744\u0745\7<"+
		"\2\2\u0745\u00eb\3\2\2\2\u0746\u074b\5\u00eex\2\u0747\u0748\7B\2\2\u0748"+
		"\u074a\5\u00eex\2\u0749\u0747\3\2\2\2\u074a\u074d\3\2\2\2\u074b\u0749"+
		"\3\2\2\2\u074b\u074c\3\2\2\2\u074c\u00ed\3\2\2\2\u074d\u074b\3\2\2\2\u074e"+
		"\u074f\7h\2\2\u074f\u0750\7D\2\2\u0750\u0751\5\u00f0y\2\u0751\u0752\b"+
		"x\1\2\u0752\u00ef\3\2\2\2\u0753\u0754\5\u01b4\u00db\2\u0754\u0755\by\1"+
		"\2\u0755\u075d\3\2\2\2\u0756\u0757\5\u00f2z\2\u0757\u0758\by\1\2\u0758"+
		"\u075d\3\2\2\2\u0759\u075a\5\u00e8u\2\u075a\u075b\by\1\2\u075b\u075d\3"+
		"\2\2\2\u075c\u0753\3\2\2\2\u075c\u0756\3\2\2\2\u075c\u0759\3\2\2\2\u075d"+
		"\u00f1\3\2\2\2\u075e\u0760\7=\2\2\u075f\u0761\5\u00f4{\2\u0760\u075f\3"+
		"\2\2\2\u0760\u0761\3\2\2\2\u0761\u0763\3\2\2\2\u0762\u0764\7B\2\2\u0763"+
		"\u0762\3\2\2\2\u0763\u0764\3\2\2\2\u0764\u0765\3\2\2\2\u0765\u0766\7>"+
		"\2\2\u0766\u0767\bz\1\2\u0767\u00f3\3\2\2\2\u0768\u0769\5\u00f0y\2\u0769"+
		"\u076a\b{\1\2\u076a\u0771\3\2\2\2\u076b\u076c\7B\2\2\u076c\u076d\5\u00f0"+
		"y\2\u076d\u076e\b{\1\2\u076e\u0770\3\2\2\2\u076f\u076b\3\2\2\2\u0770\u0773"+
		"\3\2\2\2\u0771\u076f\3\2\2\2\u0771\u0772\3\2\2\2\u0772\u0774\3\2\2\2\u0773"+
		"\u0771\3\2\2\2\u0774\u0775\b{\1\2\u0775\u00f5\3\2\2\2\u0776\u0777\7i\2"+
		"\2\u0777\u0778\58\35\2\u0778\u0779\b|\1\2\u0779\u00f7\3\2\2\2\u077a\u077b"+
		"\7i\2\2\u077b\u077c\58\35\2\u077c\u077d\7;\2\2\u077d\u077e\5\u00f0y\2"+
		"\u077e\u077f\7<\2\2\u077f\u0780\b}\1\2\u0780\u00f9\3\2\2\2\u0781\u0783"+
		"\7=\2\2\u0782\u0784\5\u00fc\177\2\u0783\u0782\3\2\2\2\u0783\u0784\3\2"+
		"\2\2\u0784\u0786\3\2\2\2\u0785\u0787\7B\2\2\u0786\u0785\3\2\2\2\u0786"+
		"\u0787\3\2\2\2\u0787\u0788\3\2\2\2\u0788\u0789\7>\2\2\u0789\u078a\b~\1"+
		"\2\u078a\u00fb\3\2\2\2\u078b\u078c\5t;\2\u078c\u078d\b\177\1\2\u078d\u0794"+
		"\3\2\2\2\u078e\u078f\7B\2\2\u078f\u0790\5t;\2\u0790\u0791\b\177\1\2\u0791"+
		"\u0793\3\2\2\2\u0792\u078e\3\2\2\2\u0793\u0796\3\2\2\2\u0794\u0792\3\2"+
		"\2\2\u0794\u0795\3\2\2\2\u0795\u0797\3\2\2\2\u0796\u0794\3\2\2\2\u0797"+
		"\u0798\b\177\1\2\u0798\u00fd\3\2\2\2\u0799\u079b\7=\2\2\u079a\u079c\5"+
		"\u0100\u0081\2\u079b\u079a\3\2\2\2\u079b\u079c\3\2\2\2\u079c\u079d\3\2"+
		"\2\2\u079d\u079e\7>\2\2\u079e\u079f\b\u0080\1\2\u079f\u00ff\3\2\2\2\u07a0"+
		"\u07a1\5\u0102\u0082\2\u07a1\u07a2\b\u0081\1\2\u07a2\u07a8\3\2\2\2\u07a3"+
		"\u07a4\5\u0102\u0082\2\u07a4\u07a5\b\u0081\1\2\u07a5\u07a7\3\2\2\2\u07a6"+
		"\u07a3\3\2\2\2\u07a7\u07aa\3\2\2\2\u07a8\u07a6\3\2\2\2\u07a8\u07a9\3\2"+
		"\2\2\u07a9\u07ab\3\2\2\2\u07aa\u07a8\3\2\2\2\u07ab\u07ac\b\u0081\1\2\u07ac"+
		"\u0101\3\2\2\2\u07ad\u07ae\5\u0104\u0083\2\u07ae\u07af\b\u0082\1\2\u07af"+
		"\u07b7\3\2\2\2\u07b0\u07b1\5T+\2\u07b1\u07b2\b\u0082\1\2\u07b2\u07b7\3"+
		"\2\2\2\u07b3\u07b4\5\u0108\u0085\2\u07b4\u07b5\b\u0082\1\2\u07b5\u07b7"+
		"\3\2\2\2\u07b6\u07ad\3\2\2\2\u07b6\u07b0\3\2\2\2\u07b6\u07b3\3\2\2\2\u07b7"+
		"\u0103\3\2\2\2\u07b8\u07b9\5\u0106\u0084\2\u07b9\u07ba\7A\2\2\u07ba\u07bb"+
		"\b\u0083\1\2\u07bb\u0105\3\2\2\2\u07bc\u07bd\5\u009eP\2\u07bd\u07be\b"+
		"\u0084\1\2\u07be\u07c0\3\2\2\2\u07bf\u07bc\3\2\2\2\u07c0\u07c3\3\2\2\2"+
		"\u07c1\u07bf\3\2\2\2\u07c1\u07c2\3\2\2\2\u07c2\u07c4\3\2\2\2\u07c3\u07c1"+
		"\3\2\2\2\u07c4\u07c5\5v<\2\u07c5\u07c6\5n8\2\u07c6\u07c7\b\u0084\1\2\u07c7"+
		"\u0107\3\2\2\2\u07c8\u07c9\5\u010c\u0087\2\u07c9\u07ca\b\u0085\1\2\u07ca"+
		"\u07db\3\2\2\2\u07cb\u07cc\5\u0110\u0089\2\u07cc\u07cd\b\u0085\1\2\u07cd"+
		"\u07db\3\2\2\2\u07ce\u07cf\5\u0118\u008d\2\u07cf\u07d0\b\u0085\1\2\u07d0"+
		"\u07db\3\2\2\2\u07d1\u07d2\5\u011a\u008e\2\u07d2\u07d3\b\u0085\1\2\u07d3"+
		"\u07db\3\2\2\2\u07d4\u07d5\5\u012c\u0097\2\u07d5\u07d6\b\u0085\1\2\u07d6"+
		"\u07db\3\2\2\2\u07d7\u07d8\5\u0132\u009a\2\u07d8\u07d9\b\u0085\1\2\u07d9"+
		"\u07db\3\2\2\2\u07da\u07c8\3\2\2\2\u07da\u07cb\3\2\2\2\u07da\u07ce\3\2"+
		"\2\2\u07da\u07d1\3\2\2\2\u07da\u07d4\3\2\2\2\u07da\u07d7\3\2\2\2\u07db"+
		"\u0109\3\2\2\2\u07dc\u07dd\5\u010c\u0087\2\u07dd\u07de\b\u0086\1\2\u07de"+
		"\u07ec\3\2\2\2\u07df\u07e0\5\u0112\u008a\2\u07e0\u07e1\b\u0086\1\2\u07e1"+
		"\u07ec\3\2\2\2\u07e2\u07e3\5\u011c\u008f\2\u07e3\u07e4\b\u0086\1\2\u07e4"+
		"\u07ec\3\2\2\2\u07e5\u07e6\5\u012e\u0098\2\u07e6\u07e7\b\u0086\1\2\u07e7"+
		"\u07ec\3\2\2\2\u07e8\u07e9\5\u0134\u009b\2\u07e9\u07ea\b\u0086\1\2\u07ea"+
		"\u07ec\3\2\2\2\u07eb\u07dc\3\2\2\2\u07eb\u07df\3\2\2\2\u07eb\u07e2\3\2"+
		"\2\2\u07eb\u07e5\3\2\2\2\u07eb\u07e8\3\2\2\2\u07ec\u010b\3\2\2\2\u07ed"+
		"\u07ee\5\u00fe\u0080\2\u07ee\u07ef\b\u0087\1\2\u07ef\u0810\3\2\2\2\u07f0"+
		"\u0810\5\u010e\u0088\2\u07f1\u07f2\5\u0114\u008b\2\u07f2\u07f3\b\u0087"+
		"\1\2\u07f3\u0810\3\2\2\2\u07f4\u07f5\5\u011e\u0090\2\u07f5\u07f6\b\u0087"+
		"\1\2\u07f6\u0810\3\2\2\2\u07f7\u07f8\5\u0120\u0091\2\u07f8\u07f9\b\u0087"+
		"\1\2\u07f9\u0810\3\2\2\2\u07fa\u07fb\5\u0130\u0099\2\u07fb\u07fc\b\u0087"+
		"\1\2\u07fc\u0810\3\2\2\2\u07fd\u07fe\5\u0144\u00a3\2\u07fe\u07ff\b\u0087"+
		"\1\2\u07ff\u0810\3\2\2\2\u0800\u0801\5\u0146\u00a4\2\u0801\u0802\b\u0087"+
		"\1\2\u0802\u0810\3\2\2\2\u0803\u0804\5\u0148\u00a5\2\u0804\u0805\b\u0087"+
		"\1\2\u0805\u0810\3\2\2\2\u0806\u0807\5\u014c\u00a7\2\u0807\u0808\b\u0087"+
		"\1\2\u0808\u0810\3\2\2\2\u0809\u080a\5\u014a\u00a6\2\u080a\u080b\b\u0087"+
		"\1\2\u080b\u0810\3\2\2\2\u080c\u080d\5\u014e\u00a8\2\u080d\u080e\b\u0087"+
		"\1\2\u080e\u0810\3\2\2\2\u080f\u07ed\3\2\2\2\u080f\u07f0\3\2\2\2\u080f"+
		"\u07f1\3\2\2\2\u080f\u07f4\3\2\2\2\u080f\u07f7\3\2\2\2\u080f\u07fa\3\2"+
		"\2\2\u080f\u07fd\3\2\2\2\u080f\u0800\3\2\2\2\u080f\u0803\3\2\2\2\u080f"+
		"\u0806\3\2\2\2\u080f\u0809\3\2\2\2\u080f\u080c\3\2\2\2\u0810\u010d\3\2"+
		"\2\2\u0811\u0812\7A\2\2\u0812\u010f\3\2\2\2\u0813\u0814\7h\2\2\u0814\u0815"+
		"\7J\2\2\u0815\u0816\5\u0108\u0085\2\u0816\u0817\b\u0089\1\2\u0817\u0111"+
		"\3\2\2\2\u0818\u0819\7h\2\2\u0819\u081a\7J\2\2\u081a\u081b\5\u010a\u0086"+
		"\2\u081b\u081c\b\u008a\1\2\u081c\u0113\3\2\2\2\u081d\u081e\5\u0116\u008c"+
		"\2\u081e\u081f\7A\2\2\u081f\u0820\b\u008b\1\2\u0820\u0115\3\2\2\2\u0821"+
		"\u0822\5\u01ae\u00d8\2\u0822\u0823\b\u008c\1\2\u0823\u0837\3\2\2\2\u0824"+
		"\u0825\5\u01cc\u00e7\2\u0825\u0826\b\u008c\1\2\u0826\u0837\3\2\2\2\u0827"+
		"\u0828\5\u01ce\u00e8\2\u0828\u0829\b\u008c\1\2\u0829\u0837\3\2\2\2\u082a"+
		"\u082b\5\u01d4\u00eb\2\u082b\u082c\b\u008c\1\2\u082c\u0837\3\2\2\2\u082d"+
		"\u082e\5\u01d8\u00ed\2\u082e\u082f\b\u008c\1\2\u082f\u0837\3\2\2\2\u0830"+
		"\u0831\5\u018c\u00c7\2\u0831\u0832\b\u008c\1\2\u0832\u0837\3\2\2\2\u0833"+
		"\u0834\5\u0178\u00bd\2\u0834\u0835\b\u008c\1\2\u0835\u0837\3\2\2\2\u0836"+
		"\u0821\3\2\2\2\u0836\u0824\3\2\2\2\u0836\u0827\3\2\2\2\u0836\u082a\3\2"+
		"\2\2\u0836\u082d\3\2\2\2\u0836\u0830\3\2\2\2\u0836\u0833\3\2\2\2\u0837"+
		"\u0117\3\2\2\2\u0838\u0839\7\30\2\2\u0839\u083a\7;\2\2\u083a\u083b\5\u01a2"+
		"\u00d2\2\u083b\u083c\7<\2\2\u083c\u083d\5\u0108\u0085\2\u083d\u083e\b"+
		"\u008d\1\2\u083e\u0119\3\2\2\2\u083f\u0840\7\30\2\2\u0840\u0841\7;\2\2"+
		"\u0841\u0842\5\u01a2\u00d2\2\u0842\u0843\7<\2\2\u0843\u0844\5\u010a\u0086"+
		"\2\u0844\u0845\7\21\2\2\u0845\u0846\5\u0108\u0085\2\u0846\u0847\b\u008e"+
		"\1\2\u0847\u011b\3\2\2\2\u0848\u0849\7\30\2\2\u0849\u084a\7;\2\2\u084a"+
		"\u084b\5\u01a2\u00d2\2\u084b\u084c\7<\2\2\u084c\u084d\5\u010a\u0086\2"+
		"\u084d\u084e\7\21\2\2\u084e\u084f\5\u010a\u0086\2\u084f\u0850\b\u008f"+
		"\1\2\u0850\u011d\3\2\2\2\u0851\u0852\7\4\2\2\u0852\u0853\5\u01a2\u00d2"+
		"\2\u0853\u0854\7A\2\2\u0854\u0855\b\u0090\1\2\u0855\u085e\3\2\2\2\u0856"+
		"\u0857\7\4\2\2\u0857\u0858\5\u01a2\u00d2\2\u0858\u0859\7J\2\2\u0859\u085a"+
		"\5\u01a2\u00d2\2\u085a\u085b\7A\2\2\u085b\u085c\b\u0090\1\2\u085c\u085e"+
		"\3\2\2\2\u085d\u0851\3\2\2\2\u085d\u0856\3\2\2\2\u085e\u011f\3\2\2\2\u085f"+
		"\u0860\7+\2\2\u0860\u0861\7;\2\2\u0861\u0862\5\u01a2\u00d2\2\u0862\u0863"+
		"\7<\2\2\u0863\u0864\5\u0122\u0092\2\u0864\u0865\b\u0091\1\2\u0865\u0121"+
		"\3\2\2\2\u0866\u086c\7=\2\2\u0867\u0868\5\u0124\u0093\2\u0868\u0869\b"+
		"\u0092\1\2\u0869\u086b\3\2\2\2\u086a\u0867\3\2\2\2\u086b\u086e\3\2\2\2"+
		"\u086c\u086a\3\2\2\2\u086c\u086d\3\2\2\2\u086d\u0874\3\2\2\2\u086e\u086c"+
		"\3\2\2\2\u086f\u0870\5\u0128\u0095\2\u0870\u0871\b\u0092\1\2\u0871\u0873"+
		"\3\2\2\2\u0872\u086f\3\2\2\2\u0873\u0876\3\2\2\2\u0874\u0872\3\2\2\2\u0874"+
		"\u0875\3\2\2\2\u0875\u0877\3\2\2\2\u0876\u0874\3\2\2\2\u0877\u0878\7>"+
		"\2\2\u0878\u0879\b\u0092\1\2\u0879\u0123\3\2\2\2\u087a\u087b\5\u0126\u0094"+
		"\2\u087b\u087c\5\u0100\u0081\2\u087c\u087d\b\u0093\1\2\u087d\u0125\3\2"+
		"\2\2\u087e\u087f\5\u0128\u0095\2\u087f\u0880\b\u0094\1\2\u0880\u0886\3"+
		"\2\2\2\u0881\u0882\5\u0128\u0095\2\u0882\u0883\b\u0094\1\2\u0883\u0885"+
		"\3\2\2\2\u0884\u0881\3\2\2\2\u0885\u0888\3\2\2\2\u0886\u0884\3\2\2\2\u0886"+
		"\u0887\3\2\2\2\u0887\u0889\3\2\2\2\u0888\u0886\3\2\2\2\u0889\u088a\b\u0094"+
		"\1\2\u088a\u0127\3\2\2\2\u088b\u088c\7\b\2\2\u088c\u088d\5\u01a0\u00d1"+
		"\2\u088d\u088e\7J\2\2\u088e\u088f\b\u0095\1\2\u088f\u0899\3\2\2\2\u0890"+
		"\u0891\7\b\2\2\u0891\u0892\5\u012a\u0096\2\u0892\u0893\7J\2\2\u0893\u0894"+
		"\b\u0095\1\2\u0894\u0899\3\2\2\2\u0895\u0896\7\16\2\2\u0896\u0897\7J\2"+
		"\2\u0897\u0899\b\u0095\1\2\u0898\u088b\3\2\2\2\u0898\u0890\3\2\2\2\u0898"+
		"\u0895\3\2\2\2\u0899\u0129\3\2\2\2\u089a\u089b\7h\2\2\u089b\u089c\b\u0096"+
		"\1\2\u089c\u012b\3\2\2\2\u089d\u089e\7\64\2\2\u089e\u089f\7;\2\2\u089f"+
		"\u08a0\5\u01a2\u00d2\2\u08a0\u08a1\7<\2\2\u08a1\u08a2\5\u0108\u0085\2"+
		"\u08a2\u08a3\b\u0097\1\2\u08a3\u012d\3\2\2\2\u08a4\u08a5\7\64\2\2\u08a5"+
		"\u08a6\7;\2\2\u08a6\u08a7\5\u01a2\u00d2\2\u08a7\u08a8\7<\2\2\u08a8\u08a9"+
		"\5\u010a\u0086\2\u08a9\u08aa\b\u0098\1\2\u08aa\u012f\3\2\2\2\u08ab\u08ac"+
		"\7\17\2\2\u08ac\u08ad\5\u0108\u0085\2\u08ad\u08ae\7\64\2\2\u08ae\u08af"+
		"\7;\2\2\u08af\u08b0\5\u01a2\u00d2\2\u08b0\u08b1\7<\2\2\u08b1\u08b2\7A"+
		"\2\2\u08b2\u08b3\b\u0099\1\2\u08b3\u0131\3\2\2\2\u08b4\u08b5\5\u0136\u009c"+
		"\2\u08b5\u08b6\b\u009a\1\2\u08b6\u08bb\3\2\2\2\u08b7\u08b8\5\u0140\u00a1"+
		"\2\u08b8\u08b9\b\u009a\1\2\u08b9\u08bb\3\2\2\2\u08ba\u08b4\3\2\2\2\u08ba"+
		"\u08b7\3\2\2\2\u08bb\u0133\3\2\2\2\u08bc\u08bd\5\u0138\u009d\2\u08bd\u08be"+
		"\b\u009b\1\2\u08be\u08c3\3\2\2\2\u08bf\u08c0\5\u0142\u00a2\2\u08c0\u08c1"+
		"\b\u009b\1\2\u08c1\u08c3\3\2\2\2\u08c2\u08bc\3\2\2\2\u08c2\u08bf\3\2\2"+
		"\2\u08c3\u0135\3\2\2\2\u08c4\u08c5\7\27\2\2\u08c5\u08c7\7;\2\2\u08c6\u08c8"+
		"\5\u013a\u009e\2\u08c7\u08c6\3\2\2\2\u08c7\u08c8\3\2\2\2\u08c8\u08c9\3"+
		"\2\2\2\u08c9\u08cb\7A\2\2\u08ca\u08cc\5\u01a2\u00d2\2\u08cb\u08ca\3\2"+
		"\2\2\u08cb\u08cc\3\2\2\2\u08cc\u08cd\3\2\2\2\u08cd\u08cf\7A\2\2";
	private static final String _serializedATNSegment1 =
		"\u08ce\u08d0\5\u013c\u009f\2\u08cf\u08ce\3\2\2\2\u08cf\u08d0\3\2\2\2\u08d0"+
		"\u08d1\3\2\2\2\u08d1\u08d2\7<\2\2\u08d2\u08d3\5\u0108\u0085\2\u08d3\u08d4"+
		"\b\u009c\1\2\u08d4\u0137\3\2\2\2\u08d5\u08d6\7\27\2\2\u08d6\u08d8\7;\2"+
		"\2\u08d7\u08d9\5\u013a\u009e\2\u08d8\u08d7\3\2\2\2\u08d8\u08d9\3\2\2\2"+
		"\u08d9\u08da\3\2\2\2\u08da\u08dc\7A\2\2\u08db\u08dd\5\u01a2\u00d2\2\u08dc"+
		"\u08db\3\2\2\2\u08dc\u08dd\3\2\2\2\u08dd\u08de\3\2\2\2\u08de\u08e0\7A"+
		"\2\2\u08df\u08e1\5\u013c\u009f\2\u08e0\u08df\3\2\2\2\u08e0\u08e1\3\2\2"+
		"\2\u08e1\u08e2\3\2\2\2\u08e2\u08e3\7<\2\2\u08e3\u08e4\5\u010a\u0086\2"+
		"\u08e4\u08e5\b\u009d\1\2\u08e5\u0139\3\2\2\2\u08e6\u08e7\5\u013e\u00a0"+
		"\2\u08e7\u08e8\b\u009e\1\2\u08e8\u08ed\3\2\2\2\u08e9\u08ea\5\u0106\u0084"+
		"\2\u08ea\u08eb\b\u009e\1\2\u08eb\u08ed\3\2\2\2\u08ec\u08e6\3\2\2\2\u08ec"+
		"\u08e9\3\2\2\2\u08ed\u013b\3\2\2\2\u08ee\u08ef\5\u013e\u00a0\2\u08ef\u08f0"+
		"\b\u009f\1\2\u08f0\u013d\3\2\2\2\u08f1\u08f2\5\u0116\u008c\2\u08f2\u08f3"+
		"\b\u00a0\1\2\u08f3\u08fa\3\2\2\2\u08f4\u08f5\7B\2\2\u08f5\u08f6\5\u0116"+
		"\u008c\2\u08f6\u08f7\b\u00a0\1\2\u08f7\u08f9\3\2\2\2\u08f8\u08f4\3\2\2"+
		"\2\u08f9\u08fc\3\2\2\2\u08fa\u08f8\3\2\2\2\u08fa\u08fb\3\2\2\2\u08fb\u08fd"+
		"\3\2\2\2\u08fc\u08fa\3\2\2\2\u08fd\u08fe\b\u00a0\1\2\u08fe\u013f\3\2\2"+
		"\2\u08ff\u0900\7\27\2\2\u0900\u0906\7;\2\2\u0901\u0902\5\u009eP\2\u0902"+
		"\u0903\b\u00a1\1\2\u0903\u0905\3\2\2\2\u0904\u0901\3\2\2\2\u0905\u0908"+
		"\3\2\2\2\u0906\u0904\3\2\2\2\u0906\u0907\3\2\2\2\u0907\u0909\3\2\2\2\u0908"+
		"\u0906\3\2\2\2\u0909\u090a\5v<\2\u090a\u090b\5r:\2\u090b\u090c\7J\2\2"+
		"\u090c\u090d\5\u01a2\u00d2\2\u090d\u090e\7<\2\2\u090e\u090f\5\u0108\u0085"+
		"\2\u090f\u0910\b\u00a1\1\2\u0910\u0141\3\2\2\2\u0911\u0912\7\27\2\2\u0912"+
		"\u0918\7;\2\2\u0913\u0914\5\u009eP\2\u0914\u0915\b\u00a2\1\2\u0915\u0917"+
		"\3\2\2\2\u0916\u0913\3\2\2\2\u0917\u091a\3\2\2\2\u0918\u0916\3\2\2\2\u0918"+
		"\u0919\3\2\2\2\u0919\u091b\3\2\2\2\u091a\u0918\3\2\2\2\u091b\u091c\5v"+
		"<\2\u091c\u091d\5r:\2\u091d\u091e\7J\2\2\u091e\u091f\5\u01a2\u00d2\2\u091f"+
		"\u0920\7<\2\2\u0920\u0921\5\u010a\u0086\2\u0921\u0922\b\u00a2\1\2\u0922"+
		"\u0143\3\2\2\2\u0923\u0925\7\6\2\2\u0924\u0926\7h\2\2\u0925\u0924\3\2"+
		"\2\2\u0925\u0926\3\2\2\2\u0926\u0927\3\2\2\2\u0927\u0928\7A\2\2\u0928"+
		"\u0929\b\u00a3\1\2\u0929\u0145\3\2\2\2\u092a\u092c\7\r\2\2\u092b\u092d"+
		"\7h\2\2\u092c\u092b\3\2\2\2\u092c\u092d\3\2\2\2\u092d\u092e\3\2\2\2\u092e"+
		"\u092f\7A\2\2\u092f\u0930\b\u00a4\1\2\u0930\u0147\3\2\2\2\u0931\u0933"+
		"\7&\2\2\u0932\u0934\5\u01a2\u00d2\2\u0933\u0932\3\2\2\2\u0933\u0934\3"+
		"\2\2\2\u0934\u0935\3\2\2\2\u0935\u0936\7A\2\2\u0936\u0937\b\u00a5\1\2"+
		"\u0937\u0149\3\2\2\2\u0938\u0939\7.\2\2\u0939\u093a\5\u01a2\u00d2\2\u093a"+
		"\u093b\7A\2\2\u093b\u093c\b\u00a6\1\2\u093c\u014b\3\2\2\2\u093d\u093e"+
		"\7,\2\2\u093e\u093f\7;\2\2\u093f\u0940\5\u01a2\u00d2\2\u0940\u0941\7<"+
		"\2\2\u0941\u0942\5\u00fe\u0080\2\u0942\u0943\b\u00a7\1\2\u0943\u014d\3"+
		"\2\2\2\u0944\u0945\7\61\2\2\u0945\u0946\5\u00fe\u0080\2\u0946\u0947\5"+
		"\u0150\u00a9\2\u0947\u0948\b\u00a8\1\2\u0948\u0955\3\2\2\2\u0949\u094a"+
		"\7\61\2\2\u094a\u094c\5\u00fe\u0080\2\u094b\u094d\5\u0150\u00a9\2\u094c"+
		"\u094b\3\2\2\2\u094c\u094d\3\2\2\2\u094d\u094e\3\2\2\2\u094e\u094f\5\u0158"+
		"\u00ad\2\u094f\u0950\b\u00a8\1\2\u0950\u0955\3\2\2\2\u0951\u0952\5\u015a"+
		"\u00ae\2\u0952\u0953\b\u00a8\1\2\u0953\u0955\3\2\2\2\u0954\u0944\3\2\2"+
		"\2\u0954\u0949\3\2\2\2\u0954\u0951\3\2\2\2\u0955\u014f\3\2\2\2\u0956\u0957"+
		"\5\u0152\u00aa\2\u0957\u095d\b\u00a9\1\2\u0958\u0959\5\u0152\u00aa\2\u0959"+
		"\u095a\b\u00a9\1\2\u095a\u095c\3\2\2\2\u095b\u0958\3\2\2\2\u095c\u095f"+
		"\3\2\2\2\u095d\u095b\3\2\2\2\u095d\u095e\3\2\2\2\u095e\u0960\3\2\2\2\u095f"+
		"\u095d\3\2\2\2\u0960\u0961\b\u00a9\1\2\u0961\u0151\3\2\2\2\u0962\u0963"+
		"\b\u00aa\1\2\u0963\u0964\7\t\2\2\u0964\u0965\7;\2\2\u0965\u0966\5\u0154"+
		"\u00ab\2\u0966\u0967\7<\2\2\u0967\u0968\5\u00fe\u0080\2\u0968\u0969\b"+
		"\u00aa\1\2\u0969\u0153\3\2\2\2\u096a\u096b\5\u009eP\2\u096b\u096c\b\u00ab"+
		"\1\2\u096c\u096e\3\2\2\2\u096d\u096a\3\2\2\2\u096e\u0971\3\2\2\2\u096f"+
		"\u096d\3\2\2\2\u096f\u0970\3\2\2\2\u0970\u0972\3\2\2\2\u0971\u096f\3\2"+
		"\2\2\u0972\u0973\5\u0156\u00ac\2\u0973\u0974\5r:\2\u0974\u0975\b\u00ab"+
		"\1\2\u0975\u0155\3\2\2\2\u0976\u0977\5~@\2\u0977\u0978\b\u00ac\1\2\u0978"+
		"\u097f\3\2\2\2\u0979\u097a\7X\2\2\u097a\u097b\5\22\n\2\u097b\u097c\b\u00ac"+
		"\1\2\u097c\u097e\3\2\2\2\u097d\u0979\3\2\2\2\u097e\u0981\3\2\2\2\u097f"+
		"\u097d\3\2\2\2\u097f\u0980\3\2\2\2\u0980\u0157\3\2\2\2\u0981\u097f\3\2"+
		"\2\2\u0982\u0983\7\25\2\2\u0983\u0984\5\u00fe\u0080\2\u0984\u0985\b\u00ad"+
		"\1\2\u0985\u0159\3\2\2\2\u0986\u0987\7\61\2\2\u0987\u0988\5\u015c\u00af"+
		"\2\u0988\u098a\5\u00fe\u0080\2\u0989\u098b\5\u0150\u00a9\2\u098a\u0989"+
		"\3\2\2\2\u098a\u098b\3\2\2\2\u098b\u098d\3\2\2\2\u098c\u098e\5\u0158\u00ad"+
		"\2\u098d\u098c\3\2\2\2\u098d\u098e\3\2\2\2\u098e\u098f\3\2\2\2\u098f\u0990"+
		"\b\u00ae\1\2\u0990\u015b\3\2\2\2\u0991\u0992\7;\2\2\u0992\u0994\5\u015e"+
		"\u00b0\2\u0993\u0995\7A\2\2\u0994\u0993\3\2\2\2\u0994\u0995\3\2\2\2\u0995"+
		"\u0996\3\2\2\2\u0996\u0997\7<\2\2\u0997\u0998\b\u00af\1\2\u0998\u015d"+
		"\3\2\2\2\u0999\u099a\5\u0160\u00b1\2\u099a\u09a1\b\u00b0\1\2\u099b\u099c"+
		"\7A\2\2\u099c\u099d\5\u0160\u00b1\2\u099d\u099e\b\u00b0\1\2\u099e\u09a0"+
		"\3\2\2\2\u099f\u099b\3\2\2\2\u09a0\u09a3\3\2\2\2\u09a1\u099f\3\2\2\2\u09a1"+
		"\u09a2\3\2\2\2\u09a2\u09a4\3\2\2\2\u09a3\u09a1\3\2\2\2\u09a4\u09a5\b\u00b0"+
		"\1\2\u09a5\u015f\3\2\2\2\u09a6\u09a7\5\u009eP\2\u09a7\u09a8\b\u00b1\1"+
		"\2\u09a8\u09aa\3\2\2\2\u09a9\u09a6\3\2\2\2\u09aa\u09ad\3\2\2\2\u09ab\u09a9"+
		"\3\2\2\2\u09ab\u09ac\3\2\2\2\u09ac\u09ae\3\2\2\2\u09ad\u09ab\3\2\2\2\u09ae"+
		"\u09af\5v<\2\u09af\u09b0\5r:\2\u09b0\u09b1\7D\2\2\u09b1\u09b2\5\u01a2"+
		"\u00d2\2\u09b2\u09b3\b\u00b1\1\2\u09b3\u0161\3\2\2\2\u09b4\u09b5\5\u0172"+
		"\u00ba\2\u09b5\u09b6\b\u00b2\1\2\u09b6\u09bb\3\2\2\2\u09b7\u09b8\5\u019a"+
		"\u00ce\2\u09b8\u09b9\b\u00b2\1\2\u09b9\u09bb\3\2\2\2\u09ba\u09b4\3\2\2"+
		"\2\u09ba\u09b7\3\2\2\2\u09bb\u09c1\3\2\2\2\u09bc\u09bd\5\u016c\u00b7\2"+
		"\u09bd\u09be\b\u00b2\1\2\u09be\u09c0\3\2\2\2\u09bf\u09bc\3\2\2\2\u09c0"+
		"\u09c3\3\2\2\2\u09c1\u09bf\3\2\2\2\u09c1\u09c2\3\2\2\2\u09c2\u0163\3\2"+
		"\2\2\u09c3\u09c1\3\2\2\2\u09c4\u09c5\5\2\2\2\u09c5\u09c6\b\u00b3\1\2\u09c6"+
		"\u09e1\3\2\2\2\u09c7\u09c8\5\u0166\u00b4\2\u09c8\u09c9\b\u00b3\1\2\u09c9"+
		"\u09e1\3\2\2\2\u09ca\u09cb\7-\2\2\u09cb\u09e1\b\u00b3\1\2\u09cc\u09cd"+
		"\7;\2\2\u09cd\u09ce\5\u01a2\u00d2\2\u09ce\u09cf\7<\2\2\u09cf\u09d0\b\u00b3"+
		"\1\2\u09d0\u09e1\3\2\2\2\u09d1\u09d2\5\u0178\u00bd\2\u09d2\u09d3\b\u00b3"+
		"\1\2\u09d3\u09e1\3\2\2\2\u09d4\u09d5\5\u0180\u00c1\2\u09d5\u09d6\b\u00b3"+
		"\1\2\u09d6\u09e1\3\2\2\2\u09d7\u09d8\5\u0186\u00c4\2\u09d8\u09d9\b\u00b3"+
		"\1\2\u09d9\u09e1\3\2\2\2\u09da\u09db\5\u018c\u00c7\2\u09db\u09dc\b\u00b3"+
		"\1\2\u09dc\u09e1\3\2\2\2\u09dd\u09de\5\u0194\u00cb\2\u09de\u09df\b\u00b3"+
		"\1\2\u09df\u09e1\3\2\2\2\u09e0\u09c4\3\2\2\2\u09e0\u09c7\3\2\2\2\u09e0"+
		"\u09ca\3\2\2\2\u09e0\u09cc\3\2\2\2\u09e0\u09d1\3\2\2\2\u09e0\u09d4\3\2"+
		"\2\2\u09e0\u09d7\3\2\2\2\u09e0\u09da\3\2\2\2\u09e0\u09dd\3\2\2\2\u09e1"+
		"\u0165\3\2\2\2\u09e2\u09e8\58\35\2\u09e3\u09e4\7?\2\2\u09e4\u09e5\7@\2"+
		"\2\u09e5\u09e7\b\u00b4\1\2\u09e6\u09e3\3\2\2\2\u09e7\u09ea\3\2\2\2\u09e8"+
		"\u09e6\3\2\2\2\u09e8\u09e9\3\2\2\2\u09e9\u09eb\3\2\2\2\u09ea\u09e8\3\2"+
		"\2\2\u09eb\u09ec\7C\2\2\u09ec\u09ed\7\13\2\2\u09ed\u09ee\b\u00b4\1\2\u09ee"+
		"\u09f9\3\2\2\2\u09ef\u09f0\7\62\2\2\u09f0\u09f1\7C\2\2\u09f1\u09f2\7\13"+
		"\2\2\u09f2\u09f9\b\u00b4\1\2\u09f3\u09f4\58\35\2\u09f4\u09f5\7C\2\2\u09f5"+
		"\u09f6\7-\2\2\u09f6\u09f7\b\u00b4\1\2\u09f7\u09f9\3\2\2\2\u09f8\u09e2"+
		"\3\2\2\2\u09f8\u09ef\3\2\2\2\u09f8\u09f3\3\2\2\2\u09f9\u0167\3\2\2\2\u09fa"+
		"\u09fb\3\2\2\2\u09fb\u0169\3\2\2\2\u09fc\u09fd\5\2\2\2\u09fd\u09fe\b\u00b6"+
		"\1\2\u09fe\u0a16\3\2\2\2\u09ff\u0a00\5\u0166\u00b4\2\u0a00\u0a01\b\u00b6"+
		"\1\2\u0a01\u0a16\3\2\2\2\u0a02\u0a03\7-\2\2\u0a03\u0a16\b\u00b6\1\2\u0a04"+
		"\u0a05\7;\2\2\u0a05\u0a06\5\u01a2\u00d2\2\u0a06\u0a07\7<\2\2\u0a07\u0a08"+
		"\b\u00b6\1\2\u0a08\u0a16\3\2\2\2\u0a09\u0a0a\5\u0178\u00bd\2\u0a0a\u0a0b"+
		"\b\u00b6\1\2\u0a0b\u0a16\3\2\2\2\u0a0c\u0a0d\5\u0180\u00c1\2\u0a0d\u0a0e"+
		"\b\u00b6\1\2\u0a0e\u0a16\3\2\2\2\u0a0f\u0a10\5\u018c\u00c7\2\u0a10\u0a11"+
		"\b\u00b6\1\2\u0a11\u0a16\3\2\2\2\u0a12\u0a13\5\u0194\u00cb\2\u0a13\u0a14"+
		"\b\u00b6\1\2\u0a14\u0a16\3\2\2\2\u0a15\u09fc\3\2\2\2\u0a15\u09ff\3\2\2"+
		"\2\u0a15\u0a02\3\2\2\2\u0a15\u0a04\3\2\2\2\u0a15\u0a09\3\2\2\2\u0a15\u0a0c"+
		"\3\2\2\2\u0a15\u0a0f\3\2\2\2\u0a15\u0a12\3\2\2\2\u0a16\u016b\3\2\2\2\u0a17"+
		"\u0a18\5\u017a\u00be\2\u0a18\u0a19\b\u00b7\1\2\u0a19\u0a27\3\2\2\2\u0a1a"+
		"\u0a1b\5\u0182\u00c2\2\u0a1b\u0a1c\b\u00b7\1\2\u0a1c\u0a27\3\2\2\2\u0a1d"+
		"\u0a1e\5\u0188\u00c5\2\u0a1e\u0a1f\b\u00b7\1\2\u0a1f\u0a27\3\2\2\2\u0a20"+
		"\u0a21\5\u018e\u00c8\2\u0a21\u0a22\b\u00b7\1\2\u0a22\u0a27\3\2\2\2\u0a23"+
		"\u0a24\5\u0196\u00cc\2\u0a24\u0a25\b\u00b7\1\2\u0a25\u0a27\3\2\2\2\u0a26"+
		"\u0a17\3\2\2\2\u0a26\u0a1a\3\2\2\2\u0a26\u0a1d\3\2\2\2\u0a26\u0a20\3\2"+
		"\2\2\u0a26\u0a23\3\2\2\2\u0a27\u016d\3\2\2\2\u0a28\u0a29\3\2\2\2\u0a29"+
		"\u016f\3\2\2\2\u0a2a\u0a2b\5\u017a\u00be\2\u0a2b\u0a2c\b\u00b9\1\2\u0a2c"+
		"\u0a37\3\2\2\2\u0a2d\u0a2e\5\u0182\u00c2\2\u0a2e\u0a2f\b\u00b9\1\2\u0a2f"+
		"\u0a37\3\2\2\2\u0a30\u0a31\5\u018e\u00c8\2\u0a31\u0a32\b\u00b9\1\2\u0a32"+
		"\u0a37\3\2\2\2\u0a33\u0a34\5\u0196\u00cc\2\u0a34\u0a35\b\u00b9\1\2\u0a35"+
		"\u0a37\3\2\2\2\u0a36\u0a2a\3\2\2\2\u0a36\u0a2d\3\2\2\2\u0a36\u0a30\3\2"+
		"\2\2\u0a36\u0a33\3\2\2\2\u0a37\u0171\3\2\2\2\u0a38\u0a39\5\2\2\2\u0a39"+
		"\u0a3a\b\u00ba\1\2\u0a3a\u0a62\3\2\2\2\u0a3b\u0a3c\5\u0166\u00b4\2\u0a3c"+
		"\u0a3d\b\u00ba\1\2\u0a3d\u0a62\3\2\2\2\u0a3e\u0a44\5x=\2\u0a3f\u0a40\7"+
		"?\2\2\u0a40\u0a41\7@\2\2\u0a41\u0a43\b\u00ba\1\2\u0a42\u0a3f\3\2\2\2\u0a43"+
		"\u0a46\3\2\2\2\u0a44\u0a42\3\2\2\2\u0a44\u0a45\3\2\2\2\u0a45\u0a47\3\2"+
		"\2\2\u0a46\u0a44\3\2\2\2\u0a47\u0a48\7C\2\2\u0a48\u0a49\7\13\2\2\u0a49"+
		"\u0a4a\b\u00ba\1\2\u0a4a\u0a62\3\2\2\2\u0a4b\u0a4c\7-\2\2\u0a4c\u0a62"+
		"\b\u00ba\1\2\u0a4d\u0a4e\7;\2\2\u0a4e\u0a4f\5\u01a2\u00d2\2\u0a4f\u0a50"+
		"\7<\2\2\u0a50\u0a51\b\u00ba\1\2\u0a51\u0a62\3\2\2\2\u0a52\u0a53\5\u017c"+
		"\u00bf\2\u0a53\u0a54\b\u00ba\1\2\u0a54\u0a62\3\2\2\2\u0a55\u0a56\5\u0184"+
		"\u00c3\2\u0a56\u0a57\b\u00ba\1\2\u0a57\u0a62\3\2\2\2\u0a58\u0a59\5\u018a"+
		"\u00c6\2\u0a59\u0a5a\b\u00ba\1\2\u0a5a\u0a62\3\2\2\2\u0a5b\u0a5c\5\u0190"+
		"\u00c9\2\u0a5c\u0a5d\b\u00ba\1\2\u0a5d\u0a62\3\2\2\2\u0a5e\u0a5f\5\u0198"+
		"\u00cd\2\u0a5f\u0a60\b\u00ba\1\2\u0a60\u0a62\3\2\2\2\u0a61\u0a38\3\2\2"+
		"\2\u0a61\u0a3b\3\2\2\2\u0a61\u0a3e\3\2\2\2\u0a61\u0a4b\3\2\2\2\u0a61\u0a4d"+
		"\3\2\2\2\u0a61\u0a52\3\2\2\2\u0a61\u0a55\3\2\2\2\u0a61\u0a58\3\2\2\2\u0a61"+
		"\u0a5b\3\2\2\2\u0a61\u0a5e\3\2\2\2\u0a62\u0173\3\2\2\2\u0a63\u0a64\3\2"+
		"\2\2\u0a64\u0175\3\2\2\2\u0a65\u0a66\5\2\2\2\u0a66\u0a67\b\u00bc\1\2\u0a67"+
		"\u0a8c\3\2\2\2\u0a68\u0a69\5\u0166\u00b4\2\u0a69\u0a6a\b\u00bc\1\2\u0a6a"+
		"\u0a8c\3\2\2\2\u0a6b\u0a71\5x=\2\u0a6c\u0a6d\7?\2\2\u0a6d\u0a6e\7@\2\2"+
		"\u0a6e\u0a70\b\u00bc\1\2\u0a6f\u0a6c\3\2\2\2\u0a70\u0a73\3\2\2\2\u0a71"+
		"\u0a6f\3\2\2\2\u0a71\u0a72\3\2\2\2\u0a72\u0a74\3\2\2\2\u0a73\u0a71\3\2"+
		"\2\2\u0a74\u0a75\7C\2\2\u0a75\u0a76\7\13\2\2\u0a76\u0a77\b\u00bc\1\2\u0a77"+
		"\u0a8c\3\2\2\2\u0a78\u0a79\7-\2\2\u0a79\u0a8c\b\u00bc\1\2\u0a7a\u0a7b"+
		"\7;\2\2\u0a7b\u0a7c\5\u01a2\u00d2\2\u0a7c\u0a7d\7<\2\2\u0a7d\u0a7e\b\u00bc"+
		"\1\2\u0a7e\u0a8c\3\2\2\2\u0a7f\u0a80\5\u017c\u00bf\2\u0a80\u0a81\b\u00bc"+
		"\1\2\u0a81\u0a8c\3\2\2\2\u0a82\u0a83\5\u0184\u00c3\2\u0a83\u0a84\b\u00bc"+
		"\1\2\u0a84\u0a8c\3\2\2\2\u0a85\u0a86\5\u0190\u00c9\2\u0a86\u0a87\b\u00bc"+
		"\1\2\u0a87\u0a8c\3\2\2\2\u0a88\u0a89\5\u0198\u00cd\2\u0a89\u0a8a\b\u00bc"+
		"\1\2\u0a8a\u0a8c\3\2\2\2\u0a8b\u0a65\3\2\2\2\u0a8b\u0a68\3\2\2\2\u0a8b"+
		"\u0a6b\3\2\2\2\u0a8b\u0a78\3\2\2\2\u0a8b\u0a7a\3\2\2\2\u0a8b\u0a7f\3\2"+
		"\2\2\u0a8b\u0a82\3\2\2\2\u0a8b\u0a85\3\2\2\2\u0a8b\u0a88\3\2\2\2\u0a8c"+
		"\u0177\3\2\2\2\u0a8d\u0a8f\7!\2\2\u0a8e\u0a90\5,\27\2\u0a8f\u0a8e\3\2"+
		"\2\2\u0a8f\u0a90\3\2\2\2\u0a90\u0a96\3\2\2\2\u0a91\u0a92\5\u00e8u\2\u0a92"+
		"\u0a93\b\u00bd\1\2\u0a93\u0a95\3\2\2\2\u0a94\u0a91\3\2\2\2\u0a95\u0a98"+
		"\3\2\2\2\u0a96\u0a94\3\2\2\2\u0a96\u0a97\3\2\2\2\u0a97\u0a99\3\2\2\2\u0a98"+
		"\u0a96\3\2\2\2\u0a99\u0a9a\7h\2\2\u0a9a\u0aa8\b\u00bd\1\2\u0a9b\u0aa1"+
		"\7C\2\2\u0a9c\u0a9d\5\u00e8u\2\u0a9d\u0a9e\b\u00bd\1\2\u0a9e\u0aa0\3\2"+
		"\2\2\u0a9f\u0a9c\3\2\2\2\u0aa0\u0aa3\3\2\2\2\u0aa1\u0a9f\3\2\2\2\u0aa1"+
		"\u0aa2\3\2\2\2\u0aa2\u0aa4\3\2\2\2\u0aa3\u0aa1\3\2\2\2\u0aa4\u0aa5\7h"+
		"\2\2\u0aa5\u0aa7\b\u00bd\1\2\u0aa6\u0a9b\3\2\2\2\u0aa7\u0aaa\3\2\2\2\u0aa8"+
		"\u0aa6\3\2\2\2\u0aa8\u0aa9\3\2\2\2\u0aa9\u0aac\3\2\2\2\u0aaa\u0aa8\3\2"+
		"\2\2\u0aab\u0aad\5\u017e\u00c0\2\u0aac\u0aab\3\2\2\2\u0aac\u0aad\3\2\2"+
		"\2\u0aad\u0aae\3\2\2\2\u0aae\u0ab0\7;\2\2\u0aaf\u0ab1\5\u0192\u00ca\2"+
		"\u0ab0\u0aaf\3\2\2\2\u0ab0\u0ab1\3\2\2\2\u0ab1\u0ab2\3\2\2\2\u0ab2\u0ab3"+
		"\7<\2\2\u0ab3\u0ab5\b\u00bd\1\2\u0ab4\u0ab6\5d\63\2\u0ab5\u0ab4\3\2\2"+
		"\2\u0ab5\u0ab6\3\2\2\2\u0ab6\u0aee\3\2\2\2\u0ab7\u0ab8\5<\37\2\u0ab8\u0ab9"+
		"\7C\2\2\u0ab9\u0abb\7!\2\2\u0aba\u0abc\5,\27\2\u0abb\u0aba\3\2\2\2\u0abb"+
		"\u0abc\3\2\2\2\u0abc\u0ac2\3\2\2\2\u0abd\u0abe\5\u00e8u\2\u0abe\u0abf"+
		"\b\u00bd\1\2\u0abf\u0ac1\3\2\2\2\u0ac0\u0abd\3\2\2\2\u0ac1\u0ac4\3\2\2"+
		"\2\u0ac2\u0ac0\3\2\2\2\u0ac2\u0ac3\3\2\2\2\u0ac3\u0ac5\3\2\2\2\u0ac4\u0ac2"+
		"\3\2\2\2\u0ac5\u0ac7\7h\2\2\u0ac6\u0ac8\5\u017e\u00c0\2\u0ac7\u0ac6\3"+
		"\2\2\2\u0ac7\u0ac8\3\2\2\2\u0ac8\u0ac9\3\2\2\2\u0ac9\u0acb\7;\2\2\u0aca"+
		"\u0acc\5\u0192\u00ca\2\u0acb\u0aca\3\2\2\2\u0acb\u0acc\3\2\2\2\u0acc\u0acd"+
		"\3\2\2\2\u0acd\u0ace\7<\2\2\u0ace\u0ad0\b\u00bd\1\2\u0acf\u0ad1\5d\63"+
		"\2\u0ad0\u0acf\3\2\2\2\u0ad0\u0ad1\3\2\2\2\u0ad1\u0aee\3\2\2\2\u0ad2\u0ad3"+
		"\5\u0162\u00b2\2\u0ad3\u0ad4\7C\2\2\u0ad4\u0ad6\7!\2\2\u0ad5\u0ad7\5,"+
		"\27\2\u0ad6\u0ad5\3\2\2\2\u0ad6\u0ad7\3\2\2\2\u0ad7\u0add\3\2\2\2\u0ad8"+
		"\u0ad9\5\u00e8u\2\u0ad9\u0ada\b\u00bd\1\2\u0ada\u0adc\3\2\2\2\u0adb\u0ad8"+
		"\3\2\2\2\u0adc\u0adf\3\2\2\2\u0add\u0adb\3\2\2\2\u0add\u0ade\3\2\2\2\u0ade"+
		"\u0ae0\3\2\2\2\u0adf\u0add\3\2\2\2\u0ae0\u0ae2\7h\2\2\u0ae1\u0ae3\5\u017e"+
		"\u00c0\2\u0ae2\u0ae1\3\2\2\2\u0ae2\u0ae3\3\2\2\2\u0ae3\u0ae4\3\2\2\2\u0ae4"+
		"\u0ae6\7;\2\2\u0ae5\u0ae7\5\u0192\u00ca\2\u0ae6\u0ae5\3\2\2\2\u0ae6\u0ae7"+
		"\3\2\2\2\u0ae7\u0ae8\3\2\2\2\u0ae8\u0ae9\7<\2\2\u0ae9\u0aeb\b\u00bd\1"+
		"\2\u0aea\u0aec\5d\63\2\u0aeb\u0aea\3\2\2\2\u0aeb\u0aec\3\2\2\2\u0aec\u0aee"+
		"\3\2\2\2\u0aed\u0a8d\3\2\2\2\u0aed\u0ab7\3\2\2\2\u0aed\u0ad2\3\2\2\2\u0aee"+
		"\u0179\3\2\2\2\u0aef\u0af0\7C\2\2\u0af0\u0af2\7!\2\2\u0af1\u0af3\5,\27"+
		"\2\u0af2\u0af1\3\2\2\2\u0af2\u0af3\3\2\2\2\u0af3\u0af9\3\2\2\2\u0af4\u0af5"+
		"\5\u00e8u\2\u0af5\u0af6\b\u00be\1\2\u0af6\u0af8\3\2\2\2\u0af7\u0af4\3"+
		"\2\2\2\u0af8\u0afb\3\2\2\2\u0af9\u0af7\3\2\2\2\u0af9\u0afa\3\2\2\2\u0afa"+
		"\u0afc\3\2\2\2\u0afb\u0af9\3\2\2\2\u0afc\u0afe\7h\2\2\u0afd\u0aff\5\u017e"+
		"\u00c0\2\u0afe\u0afd\3\2\2\2\u0afe\u0aff\3\2\2\2\u0aff\u0b00\3\2\2\2\u0b00"+
		"\u0b02\7;\2\2\u0b01\u0b03\5\u0192\u00ca\2\u0b02\u0b01\3\2\2\2\u0b02\u0b03"+
		"\3\2\2\2\u0b03\u0b04\3\2\2\2\u0b04\u0b05\7<\2\2\u0b05\u0b07\b\u00be\1"+
		"\2\u0b06\u0b08\5d\63\2\u0b07\u0b06\3\2\2\2\u0b07\u0b08\3\2\2\2\u0b08\u017b"+
		"\3\2\2\2\u0b09\u0b0b\7!\2\2\u0b0a\u0b0c\5,\27\2\u0b0b\u0b0a\3\2\2\2\u0b0b"+
		"\u0b0c\3\2\2\2\u0b0c\u0b12\3\2\2\2\u0b0d\u0b0e\5\u00e8u\2\u0b0e\u0b0f"+
		"\b\u00bf\1\2\u0b0f\u0b11\3\2\2\2\u0b10\u0b0d\3\2\2\2\u0b11\u0b14\3\2\2"+
		"\2\u0b12\u0b10\3\2\2\2\u0b12\u0b13\3\2\2\2\u0b13\u0b15\3\2\2\2\u0b14\u0b12"+
		"\3\2\2\2\u0b15\u0b16\7h\2\2\u0b16\u0b24\b\u00bf\1\2\u0b17\u0b1d\7C\2\2"+
		"\u0b18\u0b19\5\u00e8u\2\u0b19\u0b1a\b\u00bf\1\2\u0b1a\u0b1c\3\2\2\2\u0b1b"+
		"\u0b18\3\2\2\2\u0b1c\u0b1f\3\2\2\2\u0b1d\u0b1b\3\2\2\2\u0b1d\u0b1e\3\2"+
		"\2\2\u0b1e\u0b20\3\2\2\2\u0b1f\u0b1d\3\2\2\2\u0b20\u0b21\7h\2\2\u0b21"+
		"\u0b23\b\u00bf\1\2\u0b22\u0b17\3\2\2\2\u0b23\u0b26\3\2\2\2\u0b24\u0b22"+
		"\3\2\2\2\u0b24\u0b25\3\2\2\2\u0b25\u0b28\3\2\2\2\u0b26\u0b24\3\2\2\2\u0b27"+
		"\u0b29\5\u017e\u00c0\2\u0b28\u0b27\3\2\2\2\u0b28\u0b29\3\2\2\2\u0b29\u0b2a"+
		"\3\2\2\2\u0b2a\u0b2c\7;\2\2\u0b2b\u0b2d\5\u0192\u00ca\2\u0b2c\u0b2b\3"+
		"\2\2\2\u0b2c\u0b2d\3\2\2\2\u0b2d\u0b2e\3\2\2\2\u0b2e\u0b2f\7<\2\2\u0b2f"+
		"\u0b31\b\u00bf\1\2\u0b30\u0b32\5d\63\2\u0b31\u0b30\3\2\2\2\u0b31\u0b32"+
		"\3\2\2\2\u0b32\u0b4f\3\2\2\2\u0b33\u0b34\5<\37\2\u0b34\u0b35\7C\2\2\u0b35"+
		"\u0b37\7!\2\2\u0b36\u0b38\5,\27\2\u0b37\u0b36\3\2\2\2\u0b37\u0b38\3\2"+
		"\2\2\u0b38\u0b3e\3\2\2\2\u0b39\u0b3a\5\u00e8u\2\u0b3a\u0b3b\b\u00bf\1"+
		"\2\u0b3b\u0b3d\3\2\2\2\u0b3c\u0b39\3\2\2\2\u0b3d\u0b40\3\2\2\2\u0b3e\u0b3c"+
		"\3\2\2\2\u0b3e\u0b3f\3\2\2\2\u0b3f\u0b41\3\2\2\2\u0b40\u0b3e\3\2\2\2\u0b41"+
		"\u0b43\7h\2\2\u0b42\u0b44\5\u017e\u00c0\2\u0b43\u0b42\3\2\2\2\u0b43\u0b44"+
		"\3\2\2\2\u0b44\u0b45\3\2\2\2\u0b45\u0b47\7;\2\2\u0b46\u0b48\5\u0192\u00ca"+
		"\2\u0b47\u0b46\3\2\2\2\u0b47\u0b48\3\2\2\2\u0b48\u0b49\3\2\2\2\u0b49\u0b4a"+
		"\7<\2\2\u0b4a\u0b4c\b\u00bf\1\2\u0b4b\u0b4d\5d\63\2\u0b4c\u0b4b\3\2\2"+
		"\2\u0b4c\u0b4d\3\2\2\2\u0b4d\u0b4f\3\2\2\2\u0b4e\u0b09\3\2\2\2\u0b4e\u0b33"+
		"\3\2\2\2\u0b4f\u017d\3\2\2\2\u0b50\u0b51\5,\27\2\u0b51\u0b52\b\u00c0\1"+
		"\2\u0b52\u0b57\3\2\2\2\u0b53\u0b54\7F\2\2\u0b54\u0b55\7E\2\2\u0b55\u0b57"+
		"\b\u00c0\1\2\u0b56\u0b50\3\2\2\2\u0b56\u0b53\3\2\2\2\u0b57\u017f\3\2\2"+
		"\2\u0b58\u0b59\5\u0162\u00b2\2\u0b59\u0b5a\7C\2\2\u0b5a\u0b5b\7h\2\2\u0b5b"+
		"\u0b5c\b\u00c1\1\2\u0b5c\u0b69\3\2\2\2\u0b5d\u0b5e\7*\2\2\u0b5e\u0b5f"+
		"\7C\2\2\u0b5f\u0b60\7h\2\2\u0b60\u0b69\b\u00c1\1\2\u0b61\u0b62\58\35\2"+
		"\u0b62\u0b63\7C\2\2\u0b63\u0b64\7*\2\2\u0b64\u0b65\7C\2\2\u0b65\u0b66"+
		"\7h\2\2\u0b66\u0b67\b\u00c1\1\2\u0b67\u0b69\3\2\2\2\u0b68\u0b58\3\2\2"+
		"\2\u0b68\u0b5d\3\2\2\2\u0b68\u0b61\3\2\2\2\u0b69\u0181\3\2\2\2\u0b6a\u0b6b"+
		"\7C\2\2\u0b6b\u0b6c\7h\2\2\u0b6c\u0b6d\b\u00c2\1\2\u0b6d\u0183\3\2\2\2"+
		"\u0b6e\u0b6f\7*\2\2\u0b6f\u0b70\7C\2\2\u0b70\u0b71\7h\2\2\u0b71\u0b7a"+
		"\b\u00c3\1\2\u0b72\u0b73\58\35\2\u0b73\u0b74\7C\2\2\u0b74\u0b75\7*\2\2"+
		"\u0b75\u0b76\7C\2\2\u0b76\u0b77\7h\2\2\u0b77\u0b78\b\u00c3\1\2\u0b78\u0b7a"+
		"\3\2\2\2\u0b79\u0b6e\3\2\2\2\u0b79\u0b72\3\2\2\2\u0b7a\u0185\3\2\2\2\u0b7b"+
		"\u0b7c\5<\37\2\u0b7c\u0b7d\7?\2\2\u0b7d\u0b7e\5\u01a2\u00d2\2\u0b7e\u0b7f"+
		"\7@\2\2\u0b7f\u0b80\b\u00c4\1\2\u0b80\u0b88\3\2\2\2\u0b81\u0b82\5\u016a"+
		"\u00b6\2\u0b82\u0b83\7?\2\2\u0b83\u0b84\5\u01a2\u00d2\2\u0b84\u0b85\7"+
		"@\2\2\u0b85\u0b86\b\u00c4\1\2\u0b86\u0b88\3\2\2\2\u0b87\u0b7b\3\2\2\2"+
		"\u0b87\u0b81\3\2\2\2\u0b88\u0b91\3\2\2\2\u0b89\u0b8a\5\u0168\u00b5\2\u0b8a"+
		"\u0b8b\7?\2\2\u0b8b\u0b8c\5\u01a2\u00d2\2\u0b8c\u0b8d\7@\2\2\u0b8d\u0b8e"+
		"\b\u00c4\1\2\u0b8e\u0b90\3\2\2\2\u0b8f\u0b89\3\2\2\2\u0b90\u0b93\3\2\2"+
		"\2\u0b91\u0b8f\3\2\2\2\u0b91\u0b92\3\2\2\2\u0b92\u0187\3\2\2\2\u0b93\u0b91"+
		"\3\2\2\2\u0b94\u0b95\5\u0170\u00b9\2\u0b95\u0b96\7?\2\2\u0b96\u0b97\5"+
		"\u01a2\u00d2\2\u0b97\u0b98\7@\2\2\u0b98\u0b99\b\u00c5\1\2\u0b99\u0ba2"+
		"\3\2\2\2\u0b9a\u0b9b\5\u016e\u00b8\2\u0b9b\u0b9c\7?\2\2\u0b9c\u0b9d\5"+
		"\u01a2\u00d2\2\u0b9d\u0b9e\7@\2\2\u0b9e\u0b9f\b\u00c5\1\2\u0b9f\u0ba1"+
		"\3\2\2\2\u0ba0\u0b9a\3\2\2\2\u0ba1\u0ba4\3\2\2\2\u0ba2\u0ba0\3\2\2\2\u0ba2"+
		"\u0ba3\3\2\2\2\u0ba3\u0189\3\2\2\2\u0ba4\u0ba2\3\2\2\2\u0ba5\u0ba6\5<"+
		"\37\2\u0ba6\u0ba7\7?\2\2\u0ba7\u0ba8\5\u01a2\u00d2\2\u0ba8\u0ba9\7@\2"+
		"\2\u0ba9\u0baa\b\u00c6\1\2\u0baa\u0bb2\3\2\2\2\u0bab\u0bac\5\u0176\u00bc"+
		"\2\u0bac\u0bad\7?\2\2\u0bad\u0bae\5\u01a2\u00d2\2\u0bae\u0baf\7@\2\2\u0baf"+
		"\u0bb0\b\u00c6\1\2\u0bb0\u0bb2\3\2\2\2\u0bb1\u0ba5\3\2\2\2\u0bb1\u0bab"+
		"\3\2\2\2\u0bb2\u0bbb\3\2\2\2\u0bb3\u0bb4\5\u0174\u00bb\2\u0bb4\u0bb5\7"+
		"?\2\2\u0bb5\u0bb6\5\u01a2\u00d2\2\u0bb6\u0bb7\7@\2\2\u0bb7\u0bb8\b\u00c6"+
		"\1\2\u0bb8\u0bba\3\2\2\2\u0bb9\u0bb3\3\2\2\2\u0bba\u0bbd\3\2\2\2\u0bbb"+
		"\u0bb9\3\2\2\2\u0bbb\u0bbc\3\2\2\2\u0bbc\u018b\3\2\2\2\u0bbd\u0bbb\3\2"+
		"\2\2\u0bbe\u0bbf\5> \2\u0bbf\u0bc1\7;\2\2\u0bc0\u0bc2\5\u0192\u00ca\2"+
		"\u0bc1\u0bc0\3\2\2\2\u0bc1\u0bc2\3\2\2\2\u0bc2\u0bc3\3\2\2\2\u0bc3\u0bc4"+
		"\7<\2\2\u0bc4\u0bc5\b\u00c7\1\2\u0bc5\u0c09\3\2\2\2\u0bc6\u0bc7\58\35"+
		"\2\u0bc7\u0bc9\7C\2\2\u0bc8\u0bca\5,\27\2\u0bc9\u0bc8\3\2\2\2\u0bc9\u0bca"+
		"\3\2\2\2\u0bca\u0bcb\3\2\2\2\u0bcb\u0bcc\7h\2\2\u0bcc\u0bce\7;\2\2\u0bcd"+
		"\u0bcf\5\u0192\u00ca\2\u0bce\u0bcd\3\2\2\2\u0bce\u0bcf\3\2\2\2\u0bcf\u0bd0"+
		"\3\2\2\2\u0bd0\u0bd1\7<\2\2\u0bd1\u0bd2\b\u00c7\1\2\u0bd2\u0c09\3\2\2"+
		"\2\u0bd3\u0bd4\5<\37\2\u0bd4\u0bd6\7C\2\2\u0bd5\u0bd7\5,\27\2\u0bd6\u0bd5"+
		"\3\2\2\2\u0bd6\u0bd7\3\2\2\2\u0bd7\u0bd8\3\2\2\2\u0bd8\u0bd9\7h\2\2\u0bd9"+
		"\u0bdb\7;\2\2\u0bda\u0bdc\5\u0192\u00ca\2\u0bdb\u0bda\3\2\2\2\u0bdb\u0bdc"+
		"\3\2\2\2\u0bdc\u0bdd\3\2\2\2\u0bdd\u0bde\7<\2\2\u0bde\u0bdf\b\u00c7\1"+
		"\2\u0bdf\u0c09\3\2\2\2\u0be0\u0be1\5\u0162\u00b2\2\u0be1\u0be3\7C\2\2"+
		"\u0be2\u0be4\5,\27\2\u0be3\u0be2\3\2\2\2\u0be3\u0be4\3\2\2\2\u0be4\u0be5"+
		"\3\2\2\2\u0be5\u0be6\7h\2\2\u0be6\u0be8\7;\2\2\u0be7\u0be9\5\u0192\u00ca"+
		"\2\u0be8\u0be7\3\2\2\2\u0be8\u0be9\3\2\2\2\u0be9\u0bea\3\2\2\2\u0bea\u0beb"+
		"\7<\2\2\u0beb\u0bec\b\u00c7\1\2\u0bec\u0c09\3\2\2\2\u0bed\u0bee\7*\2\2"+
		"\u0bee\u0bf0\7C\2\2\u0bef\u0bf1\5,\27\2\u0bf0\u0bef\3\2\2\2\u0bf0\u0bf1"+
		"\3\2\2\2\u0bf1\u0bf2\3\2\2\2\u0bf2\u0bf3\7h\2\2\u0bf3\u0bf5\7;\2\2\u0bf4"+
		"\u0bf6\5\u0192\u00ca\2\u0bf5\u0bf4\3\2\2\2\u0bf5\u0bf6\3\2\2\2\u0bf6\u0bf7"+
		"\3\2\2\2\u0bf7\u0bf8\7<\2\2\u0bf8\u0c09\b\u00c7\1\2\u0bf9\u0bfa\58\35"+
		"\2\u0bfa\u0bfb\7C\2\2\u0bfb\u0bfc\7*\2\2\u0bfc\u0bfe\7C\2\2\u0bfd\u0bff"+
		"\5,\27\2\u0bfe\u0bfd\3\2\2\2\u0bfe\u0bff\3\2\2\2\u0bff\u0c00\3\2\2\2\u0c00"+
		"\u0c01\7h\2\2\u0c01\u0c03\7;\2\2\u0c02\u0c04\5\u0192\u00ca\2\u0c03\u0c02"+
		"\3\2\2\2\u0c03\u0c04\3\2\2\2\u0c04\u0c05\3\2\2\2\u0c05\u0c06\7<\2\2\u0c06"+
		"\u0c07\b\u00c7\1\2\u0c07\u0c09\3\2\2\2\u0c08\u0bbe\3\2\2\2\u0c08\u0bc6"+
		"\3\2\2\2\u0c08\u0bd3\3\2\2\2\u0c08\u0be0\3\2\2\2\u0c08\u0bed\3\2\2\2\u0c08"+
		"\u0bf9\3\2\2\2\u0c09\u018d\3\2\2\2\u0c0a\u0c0c\7C\2\2\u0c0b\u0c0d\5,\27"+
		"\2\u0c0c\u0c0b\3\2\2\2\u0c0c\u0c0d\3\2\2\2\u0c0d\u0c0e\3\2\2\2\u0c0e\u0c0f"+
		"\7h\2\2\u0c0f\u0c11\7;\2\2\u0c10\u0c12\5\u0192\u00ca\2\u0c11\u0c10\3\2"+
		"\2\2\u0c11\u0c12\3\2\2\2\u0c12\u0c13\3\2\2\2\u0c13\u0c14\7<\2\2\u0c14"+
		"\u0c15\b\u00c8\1\2\u0c15\u018f\3\2\2\2\u0c16\u0c17\5> \2\u0c17\u0c19\7"+
		";\2\2\u0c18\u0c1a\5\u0192\u00ca\2\u0c19\u0c18\3\2\2\2\u0c19\u0c1a\3\2"+
		"\2\2\u0c1a\u0c1b\3\2\2\2\u0c1b\u0c1c\7<\2\2\u0c1c\u0c1d\b\u00c9\1\2\u0c1d"+
		"\u0c54\3\2\2\2\u0c1e\u0c1f\58\35\2\u0c1f\u0c21\7C\2\2\u0c20\u0c22\5,\27"+
		"\2\u0c21\u0c20\3\2\2\2\u0c21\u0c22\3\2\2\2\u0c22\u0c23\3\2\2\2\u0c23\u0c24"+
		"\7h\2\2\u0c24\u0c26\7;\2\2\u0c25\u0c27\5\u0192\u00ca\2\u0c26\u0c25\3\2"+
		"\2\2\u0c26\u0c27\3\2\2\2\u0c27\u0c28\3\2\2\2\u0c28\u0c29\7<\2\2\u0c29"+
		"\u0c2a\b\u00c9\1\2\u0c2a\u0c54\3\2\2\2\u0c2b\u0c2c\5<\37\2\u0c2c\u0c2e"+
		"\7C\2\2\u0c2d\u0c2f\5,\27\2\u0c2e\u0c2d\3\2\2\2\u0c2e\u0c2f\3\2\2\2\u0c2f"+
		"\u0c30\3\2\2\2\u0c30\u0c31\7h\2\2\u0c31\u0c33\7;\2\2\u0c32\u0c34\5\u0192"+
		"\u00ca\2\u0c33\u0c32\3\2\2\2\u0c33\u0c34\3\2\2\2\u0c34\u0c35\3\2\2\2\u0c35"+
		"\u0c36\7<\2\2\u0c36\u0c37\b\u00c9\1\2\u0c37\u0c54\3\2\2\2\u0c38\u0c39"+
		"\7*\2\2\u0c39\u0c3b\7C\2\2\u0c3a\u0c3c\5,\27\2\u0c3b\u0c3a\3\2\2\2\u0c3b"+
		"\u0c3c\3\2\2\2\u0c3c\u0c3d\3\2\2\2\u0c3d\u0c3e\7h\2\2\u0c3e\u0c40\7;\2"+
		"\2\u0c3f\u0c41\5\u0192\u00ca\2\u0c40\u0c3f\3\2\2\2\u0c40\u0c41\3\2\2\2"+
		"\u0c41\u0c42\3\2\2\2\u0c42\u0c43\7<\2\2\u0c43\u0c54\b\u00c9\1\2\u0c44"+
		"\u0c45\58\35\2\u0c45\u0c46\7C\2\2\u0c46\u0c47\7*\2\2\u0c47\u0c49\7C\2"+
		"\2\u0c48\u0c4a\5,\27\2\u0c49\u0c48\3\2\2\2\u0c49\u0c4a\3\2\2\2\u0c4a\u0c4b"+
		"\3\2\2\2\u0c4b\u0c4c\7h\2\2\u0c4c\u0c4e\7;\2\2\u0c4d\u0c4f\5\u0192\u00ca"+
		"\2\u0c4e\u0c4d\3\2\2\2\u0c4e\u0c4f\3\2\2\2\u0c4f\u0c50\3\2\2\2\u0c50\u0c51"+
		"\7<\2\2\u0c51\u0c52\b\u00c9\1\2\u0c52\u0c54\3\2\2\2\u0c53\u0c16\3\2\2"+
		"\2\u0c53\u0c1e\3\2\2\2\u0c53\u0c2b\3\2\2\2\u0c53\u0c38\3\2\2\2\u0c53\u0c44"+
		"\3\2\2\2\u0c54\u0191\3\2\2\2\u0c55\u0c56\5\u01a2\u00d2\2\u0c56\u0c57\b"+
		"\u00ca\1\2\u0c57\u0c5e\3\2\2\2\u0c58\u0c59\7B\2\2\u0c59\u0c5a\5\u01a2"+
		"\u00d2\2\u0c5a\u0c5b\b\u00ca\1\2\u0c5b\u0c5d\3\2\2\2\u0c5c\u0c58\3\2\2"+
		"\2\u0c5d\u0c60\3\2\2\2\u0c5e\u0c5c\3\2\2\2\u0c5e\u0c5f\3\2\2\2\u0c5f\u0c61"+
		"\3\2\2\2\u0c60\u0c5e\3\2\2\2\u0c61\u0c62\b\u00ca\1\2\u0c62\u0193\3\2\2"+
		"\2\u0c63\u0c64\5<\37\2\u0c64\u0c66\7\\\2\2\u0c65\u0c67\5,\27\2\u0c66\u0c65"+
		"\3\2\2\2\u0c66\u0c67\3\2\2\2\u0c67\u0c68\3\2\2\2\u0c68\u0c69\7h\2\2\u0c69"+
		"\u0c6a\b\u00cb\1\2\u0c6a\u0c9a\3\2\2\2\u0c6b\u0c6c\5\16\b\2\u0c6c\u0c6e"+
		"\7\\\2\2\u0c6d\u0c6f\5,\27\2\u0c6e\u0c6d\3\2\2\2\u0c6e\u0c6f\3\2\2\2\u0c6f"+
		"\u0c70\3\2\2\2\u0c70\u0c71\7h\2\2\u0c71\u0c72\b\u00cb\1\2\u0c72\u0c9a"+
		"\3\2\2\2\u0c73\u0c74\5\u0162\u00b2\2\u0c74\u0c76\7\\\2\2\u0c75\u0c77\5"+
		",\27\2\u0c76\u0c75\3\2\2\2\u0c76\u0c77\3\2\2\2\u0c77\u0c78\3\2\2\2\u0c78"+
		"\u0c79\7h\2\2\u0c79\u0c7a\b\u00cb\1\2\u0c7a\u0c9a\3\2\2\2\u0c7b\u0c7c"+
		"\7*\2\2\u0c7c\u0c7e\7\\\2\2\u0c7d\u0c7f\5,\27\2\u0c7e\u0c7d\3\2\2\2\u0c7e"+
		"\u0c7f\3\2\2\2\u0c7f\u0c80\3\2\2\2\u0c80\u0c81\7h\2\2\u0c81\u0c9a\b\u00cb"+
		"\1\2\u0c82\u0c83\58\35\2\u0c83\u0c84\7C\2\2\u0c84\u0c85\7*\2\2\u0c85\u0c87"+
		"\7\\\2\2\u0c86\u0c88\5,\27\2\u0c87\u0c86\3\2\2\2\u0c87\u0c88\3\2\2\2\u0c88"+
		"\u0c89\3\2\2\2\u0c89\u0c8a\7h\2\2\u0c8a\u0c8b\b\u00cb\1\2\u0c8b\u0c9a"+
		"\3\2\2\2\u0c8c\u0c8d\5\22\n\2\u0c8d\u0c8f\7\\\2\2\u0c8e\u0c90\5,\27\2"+
		"\u0c8f\u0c8e\3\2\2\2\u0c8f\u0c90\3\2\2\2\u0c90\u0c91\3\2\2\2\u0c91\u0c92"+
		"\7!\2\2\u0c92\u0c93\b\u00cb\1\2\u0c93\u0c9a\3\2\2\2\u0c94\u0c95\5 \21"+
		"\2\u0c95\u0c96\7\\\2\2\u0c96\u0c97\7!\2\2\u0c97\u0c98\b\u00cb\1\2\u0c98"+
		"\u0c9a\3\2\2\2\u0c99\u0c63\3\2\2\2\u0c99\u0c6b\3\2\2\2\u0c99\u0c73\3\2"+
		"\2\2\u0c99\u0c7b\3\2\2\2\u0c99\u0c82\3\2\2\2\u0c99\u0c8c\3\2\2\2\u0c99"+
		"\u0c94\3\2\2\2\u0c9a\u0195\3\2\2\2\u0c9b\u0c9d\7\\\2\2\u0c9c\u0c9e\5,"+
		"\27\2\u0c9d\u0c9c\3\2\2\2\u0c9d\u0c9e\3\2\2\2\u0c9e\u0c9f\3\2\2\2\u0c9f"+
		"\u0ca0\7h\2\2\u0ca0\u0ca1\b\u00cc\1\2\u0ca1\u0197\3\2\2\2\u0ca2\u0ca3"+
		"\5<\37\2\u0ca3\u0ca5\7\\\2\2\u0ca4\u0ca6\5,\27\2\u0ca5\u0ca4\3\2\2\2\u0ca5"+
		"\u0ca6\3\2\2\2\u0ca6\u0ca7\3\2\2\2\u0ca7\u0ca8\7h\2\2\u0ca8\u0ca9\b\u00cd"+
		"\1\2\u0ca9\u0cd1\3\2\2\2\u0caa\u0cab\5\16\b\2\u0cab\u0cad\7\\\2\2\u0cac"+
		"\u0cae\5,\27\2\u0cad\u0cac\3\2\2\2\u0cad\u0cae\3\2\2\2\u0cae\u0caf\3\2"+
		"\2\2\u0caf\u0cb0\7h\2\2\u0cb0\u0cb1\b\u00cd\1\2\u0cb1\u0cd1\3\2\2\2\u0cb2"+
		"\u0cb3\7*\2\2\u0cb3\u0cb5\7\\\2\2\u0cb4\u0cb6\5,\27\2\u0cb5\u0cb4\3\2"+
		"\2\2\u0cb5\u0cb6\3\2\2\2\u0cb6\u0cb7\3\2\2\2\u0cb7\u0cb8\7h\2\2\u0cb8"+
		"\u0cd1\b\u00cd\1\2\u0cb9\u0cba\58\35\2\u0cba\u0cbb\7C\2\2\u0cbb\u0cbc"+
		"\7*\2\2\u0cbc\u0cbe\7\\\2\2\u0cbd\u0cbf\5,\27\2\u0cbe\u0cbd\3\2\2\2\u0cbe"+
		"\u0cbf\3\2\2\2\u0cbf\u0cc0\3\2\2\2\u0cc0\u0cc1\7h\2\2\u0cc1\u0cc2\b\u00cd"+
		"\1\2\u0cc2\u0cd1\3\2\2\2\u0cc3\u0cc4\5\22\n\2\u0cc4\u0cc6\7\\\2\2\u0cc5"+
		"\u0cc7\5,\27\2\u0cc6\u0cc5\3\2\2\2\u0cc6\u0cc7\3\2\2\2\u0cc7\u0cc8\3\2"+
		"\2\2\u0cc8\u0cc9\7!\2\2\u0cc9\u0cca\b\u00cd\1\2\u0cca\u0cd1\3\2\2\2\u0ccb"+
		"\u0ccc\5 \21\2\u0ccc\u0ccd\7\\\2\2\u0ccd\u0cce\7!\2\2\u0cce\u0ccf\b\u00cd"+
		"\1\2\u0ccf\u0cd1\3\2\2\2\u0cd0\u0ca2\3\2\2\2\u0cd0\u0caa\3\2\2\2\u0cd0"+
		"\u0cb2\3\2\2\2\u0cd0\u0cb9\3\2\2\2\u0cd0\u0cc3\3\2\2\2\u0cd0\u0ccb\3\2"+
		"\2\2\u0cd1\u0199\3\2\2\2\u0cd2\u0cd3\7!\2\2\u0cd3\u0cd4\5\6\4\2\u0cd4"+
		"\u0cd6\5\u019c\u00cf\2\u0cd5\u0cd7\5\"\22\2\u0cd6\u0cd5\3\2\2\2\u0cd6"+
		"\u0cd7\3\2\2\2\u0cd7\u0cd8\3\2\2\2\u0cd8\u0cd9\b\u00ce\1\2\u0cd9\u0cef"+
		"\3\2\2\2\u0cda\u0cdb\7!\2\2\u0cdb\u0cdc\5\20\t\2\u0cdc\u0cde\5\u019c\u00cf"+
		"\2\u0cdd\u0cdf\5\"\22\2\u0cde\u0cdd\3\2\2\2\u0cde\u0cdf\3\2\2\2\u0cdf"+
		"\u0ce0\3\2\2\2\u0ce0\u0ce1\b\u00ce\1\2\u0ce1\u0cef\3\2\2\2\u0ce2\u0ce3"+
		"\7!\2\2\u0ce3\u0ce4\5\6\4\2\u0ce4\u0ce5\5\"\22\2\u0ce5\u0ce6\5\u00fa~"+
		"\2\u0ce6\u0ce7\b\u00ce\1\2\u0ce7\u0cef\3\2\2\2\u0ce8\u0ce9\7!\2\2\u0ce9"+
		"\u0cea\5\20\t\2\u0cea\u0ceb\5\"\22\2\u0ceb\u0cec\5\u00fa~\2\u0cec\u0ced"+
		"\b\u00ce\1\2\u0ced\u0cef\3\2\2\2\u0cee\u0cd2\3\2\2\2\u0cee\u0cda\3\2\2"+
		"\2\u0cee\u0ce2\3\2\2\2\u0cee\u0ce8\3\2\2\2\u0cef\u019b\3\2\2\2\u0cf0\u0cf1"+
		"\5\u019e\u00d0\2\u0cf1\u0cf7\b\u00cf\1\2\u0cf2\u0cf3\5\u019e\u00d0\2\u0cf3"+
		"\u0cf4\b\u00cf\1\2\u0cf4\u0cf6\3\2\2\2\u0cf5\u0cf2\3\2\2\2\u0cf6\u0cf9"+
		"\3\2\2\2\u0cf7\u0cf5\3\2\2\2\u0cf7\u0cf8\3\2\2\2\u0cf8\u019d\3\2\2\2\u0cf9"+
		"\u0cf7\3\2\2\2\u0cfa\u0cfb\5\u00e8u\2\u0cfb\u0cfc\b\u00d0\1\2\u0cfc\u0cfe"+
		"\3\2\2\2\u0cfd\u0cfa\3\2\2\2\u0cfe\u0d01\3\2\2\2\u0cff\u0cfd\3\2\2\2\u0cff"+
		"\u0d00\3\2\2\2\u0d00\u0d02\3\2\2\2\u0d01\u0cff\3\2\2\2\u0d02\u0d03\7?"+
		"\2\2\u0d03\u0d04\5\u01a2\u00d2\2\u0d04\u0d05\7@\2\2\u0d05\u0d06\b\u00d0"+
		"\1\2\u0d06\u019f\3\2\2\2\u0d07\u0d08\5\u01a2\u00d2\2\u0d08\u0d09\b\u00d1"+
		"\1\2\u0d09\u01a1\3\2\2\2\u0d0a\u0d0b\5\u01a4\u00d3\2\u0d0b\u0d0c\b\u00d2"+
		"\1\2\u0d0c\u0d11\3\2\2\2\u0d0d\u0d0e\5\u01ac\u00d7\2\u0d0e\u0d0f\b\u00d2"+
		"\1\2\u0d0f\u0d11\3\2\2\2\u0d10\u0d0a\3\2\2\2\u0d10\u0d0d\3\2\2\2\u0d11"+
		"\u01a3\3\2\2\2\u0d12\u0d13\5\u01a6\u00d4\2\u0d13\u0d14\7[\2\2\u0d14\u0d15"+
		"\5\u01aa\u00d6\2\u0d15\u0d16\b\u00d3\1\2\u0d16\u01a5\3\2\2\2\u0d17\u0d18"+
		"\7h\2\2\u0d18\u0d25\b\u00d4\1\2\u0d19\u0d1b\7;\2\2\u0d1a\u0d1c\5\u0098"+
		"M\2\u0d1b\u0d1a\3\2\2\2\u0d1b\u0d1c\3\2\2\2\u0d1c\u0d1d\3\2\2\2\u0d1d"+
		"\u0d1e\7<\2\2\u0d1e\u0d25\b\u00d4\1\2\u0d1f\u0d20\7;\2\2\u0d20\u0d21\5"+
		"\u01a8\u00d5\2\u0d21\u0d22\7<\2\2\u0d22\u0d23\b\u00d4\1\2\u0d23\u0d25"+
		"\3\2\2\2\u0d24\u0d17\3\2\2\2\u0d24\u0d19\3\2\2\2\u0d24\u0d1f\3\2\2\2\u0d25"+
		"\u01a7\3\2\2\2\u0d26\u0d27\7h\2\2\u0d27\u0d28\b\u00d5\1\2\u0d28\u0d2e"+
		"\3\2\2\2\u0d29\u0d2a\7B\2\2\u0d2a\u0d2b\7h\2\2\u0d2b\u0d2d\b\u00d5\1\2"+
		"\u0d2c\u0d29\3\2\2\2\u0d2d\u0d30\3\2\2\2\u0d2e\u0d2c\3\2\2\2\u0d2e\u0d2f"+
		"\3\2\2\2\u0d2f\u0d31\3\2\2\2\u0d30\u0d2e\3\2\2\2\u0d31\u0d32\b\u00d5\1"+
		"\2\u0d32\u01a9\3\2\2\2\u0d33\u0d34\5\u01a2\u00d2\2\u0d34\u0d35\b\u00d6"+
		"\1\2\u0d35\u0d3a\3\2\2\2\u0d36\u0d37\5\u00fe\u0080\2\u0d37\u0d38\b\u00d6"+
		"\1\2\u0d38\u0d3a\3\2\2\2\u0d39\u0d33\3\2\2\2\u0d39\u0d36\3\2\2\2\u0d3a"+
		"\u01ab\3\2\2\2\u0d3b\u0d3c\5\u01b4\u00db\2\u0d3c\u0d3d\b\u00d7\1\2\u0d3d"+
		"\u0d42\3\2\2\2\u0d3e\u0d3f\5\u01ae\u00d8\2\u0d3f\u0d40\b\u00d7\1\2\u0d40"+
		"\u0d42\3\2\2\2\u0d41\u0d3b\3\2\2\2\u0d41\u0d3e\3\2\2\2\u0d42\u01ad\3\2"+
		"\2\2\u0d43\u0d44\5\u01b0\u00d9\2\u0d44\u0d45\5\u01b2\u00da\2\u0d45\u0d46"+
		"\5\u01a2\u00d2\2\u0d46\u0d47\b\u00d8\1\2\u0d47\u01af\3\2\2\2\u0d48\u0d49"+
		"\5<\37\2\u0d49\u0d4a\b\u00d9\1\2\u0d4a\u0d52\3\2\2\2\u0d4b\u0d4c\5\u0180"+
		"\u00c1\2\u0d4c\u0d4d\b\u00d9\1\2\u0d4d\u0d52\3\2\2\2\u0d4e\u0d4f\5\u0186"+
		"\u00c4\2\u0d4f\u0d50\b\u00d9\1\2\u0d50\u0d52\3\2\2\2\u0d51\u0d48\3\2\2"+
		"\2\u0d51\u0d4b\3\2\2\2\u0d51\u0d4e\3\2\2\2\u0d52\u01b1\3\2\2\2\u0d53\u0d54"+
		"\7D\2\2\u0d54\u0d6c\b\u00da\1\2\u0d55\u0d56\7_\2\2\u0d56\u0d6c\b\u00da"+
		"\1\2\u0d57\u0d58\7`\2\2\u0d58\u0d6c\b\u00da\1\2\u0d59\u0d5a\7d\2\2\u0d5a"+
		"\u0d6c\b\u00da\1\2\u0d5b\u0d5c\7]\2\2\u0d5c\u0d6c\b\u00da\1\2\u0d5d\u0d5e"+
		"\7^\2\2\u0d5e\u0d6c\b\u00da\1\2\u0d5f\u0d60\7e\2\2\u0d60\u0d6c\b\u00da"+
		"\1\2\u0d61\u0d62\7f\2\2\u0d62\u0d6c\b\u00da\1\2\u0d63\u0d64\7g\2\2\u0d64"+
		"\u0d6c\b\u00da\1\2\u0d65\u0d66\7a\2\2\u0d66\u0d6c\b\u00da\1\2\u0d67\u0d68"+
		"\7c\2\2\u0d68\u0d6c\b\u00da\1\2\u0d69\u0d6a\7b\2\2\u0d6a\u0d6c\b\u00da"+
		"\1\2\u0d6b\u0d53\3\2\2\2\u0d6b\u0d55\3\2\2\2\u0d6b\u0d57\3\2\2\2\u0d6b"+
		"\u0d59\3\2\2\2\u0d6b\u0d5b\3\2\2\2\u0d6b\u0d5d\3\2\2\2\u0d6b\u0d5f\3\2"+
		"\2\2\u0d6b\u0d61\3\2\2\2\u0d6b\u0d63\3\2\2\2\u0d6b\u0d65\3\2\2\2\u0d6b"+
		"\u0d67\3\2\2\2\u0d6b\u0d69\3\2\2\2\u0d6c\u01b3\3\2\2\2\u0d6d\u0d6e\5\u01b6"+
		"\u00dc\2\u0d6e\u0d6f\b\u00db\1\2\u0d6f\u0d78\3\2\2\2\u0d70\u0d71\5\u01b6"+
		"\u00dc\2\u0d71\u0d72\7I\2\2\u0d72\u0d73\5\u01a2\u00d2\2\u0d73\u0d74\7"+
		"J\2\2\u0d74\u0d75\5\u01b4\u00db\2\u0d75\u0d76\b\u00db\1\2\u0d76\u0d78"+
		"\3\2\2\2\u0d77\u0d6d\3\2\2\2\u0d77\u0d70\3\2\2\2\u0d78\u01b5\3\2\2\2\u0d79"+
		"\u0d7a\b\u00dc\1\2\u0d7a\u0d7b\5\u01b8\u00dd\2\u0d7b\u0d7c\b\u00dc\1\2"+
		"\u0d7c\u0d84\3\2\2\2\u0d7d\u0d7e\f\3\2\2\u0d7e\u0d7f\7P\2\2\u0d7f\u0d80"+
		"\5\u01b8\u00dd\2\u0d80\u0d81\b\u00dc\1\2\u0d81\u0d83\3\2\2\2\u0d82\u0d7d"+
		"\3\2\2\2\u0d83\u0d86\3\2\2\2\u0d84\u0d82\3\2\2\2\u0d84\u0d85\3\2\2\2\u0d85"+
		"\u01b7\3\2\2\2\u0d86\u0d84\3\2\2\2\u0d87\u0d88\b\u00dd\1\2\u0d88\u0d89"+
		"\5\u01ba\u00de\2\u0d89\u0d8a\b\u00dd\1\2\u0d8a\u0d92\3\2\2\2\u0d8b\u0d8c"+
		"\f\3\2\2\u0d8c\u0d8d\7O\2\2\u0d8d\u0d8e\5\u01ba\u00de\2\u0d8e\u0d8f\b"+
		"\u00dd\1\2\u0d8f\u0d91\3\2\2\2\u0d90\u0d8b\3\2\2\2\u0d91\u0d94\3\2\2\2"+
		"\u0d92\u0d90\3\2\2\2\u0d92\u0d93\3\2\2\2\u0d93\u01b9\3\2\2\2\u0d94\u0d92"+
		"\3\2\2\2\u0d95\u0d96\b\u00de\1\2\u0d96\u0d97\5\u01bc\u00df\2\u0d97\u0d98"+
		"\b\u00de\1\2\u0d98\u0da0\3\2\2\2\u0d99\u0d9a\f\3\2\2\u0d9a\u0d9b\7X\2"+
		"\2\u0d9b\u0d9c\5\u01bc\u00df\2\u0d9c\u0d9d\b\u00de\1\2\u0d9d\u0d9f\3\2"+
		"\2\2\u0d9e\u0d99\3\2\2\2\u0d9f\u0da2\3\2\2\2\u0da0\u0d9e\3\2\2\2\u0da0"+
		"\u0da1\3\2\2\2\u0da1\u01bb\3\2\2\2\u0da2\u0da0\3\2\2\2\u0da3\u0da4\b\u00df"+
		"\1\2\u0da4\u0da5\5\u01be\u00e0\2\u0da5\u0da6\b\u00df\1\2\u0da6\u0dae\3"+
		"\2\2\2\u0da7\u0da8\f\3\2\2\u0da8\u0da9\7Y\2\2\u0da9\u0daa\5\u01be\u00e0"+
		"\2\u0daa\u0dab\b\u00df\1\2\u0dab\u0dad\3\2\2\2\u0dac\u0da7\3\2\2\2\u0dad"+
		"\u0db0\3\2\2\2\u0dae\u0dac\3\2\2\2\u0dae\u0daf\3\2\2\2\u0daf\u01bd\3\2"+
		"\2\2\u0db0\u0dae\3\2\2\2\u0db1\u0db2\b\u00e0\1\2\u0db2\u0db3\5\u01c0\u00e1"+
		"\2\u0db3\u0db4\b\u00e0\1\2\u0db4\u0dbc\3\2\2\2\u0db5\u0db6\f\3\2\2\u0db6"+
		"\u0db7\7W\2\2\u0db7\u0db8\5\u01c0\u00e1\2\u0db8\u0db9\b\u00e0\1\2\u0db9"+
		"\u0dbb\3\2\2\2\u0dba\u0db5\3\2\2\2\u0dbb\u0dbe\3\2\2\2\u0dbc\u0dba\3\2"+
		"\2\2\u0dbc\u0dbd\3\2\2\2\u0dbd\u01bf\3\2\2\2\u0dbe\u0dbc\3\2\2\2\u0dbf"+
		"\u0dc0\b\u00e1\1\2\u0dc0\u0dc1\5\u01c2\u00e2\2\u0dc1\u0dc2\b\u00e1\1\2"+
		"\u0dc2\u0dcf\3\2\2\2\u0dc3\u0dc4\f\4\2\2\u0dc4\u0dc5\7K\2\2\u0dc5\u0dc6"+
		"\5\u01c2\u00e2\2\u0dc6\u0dc7\b\u00e1\1\2\u0dc7\u0dce\3\2\2\2\u0dc8\u0dc9"+
		"\f\3\2\2\u0dc9\u0dca\7N\2\2\u0dca\u0dcb\5\u01c2\u00e2\2\u0dcb\u0dcc\b"+
		"\u00e1\1\2\u0dcc\u0dce\3\2\2\2\u0dcd\u0dc3\3\2\2\2\u0dcd\u0dc8\3\2\2\2"+
		"\u0dce\u0dd1\3\2\2\2\u0dcf\u0dcd\3\2\2\2\u0dcf\u0dd0\3\2\2\2\u0dd0\u01c1"+
		"\3\2\2\2\u0dd1\u0dcf\3\2\2\2\u0dd2\u0dd3\b\u00e2\1\2\u0dd3\u0dd4\5\u01c4"+
		"\u00e3\2\u0dd4\u0dd5\b\u00e2\1\2\u0dd5\u0df1\3\2\2\2\u0dd6\u0dd7\f\7\2"+
		"\2\u0dd7\u0dd8\7F\2\2\u0dd8\u0dd9\5\u01c4\u00e3\2\u0dd9\u0dda\b\u00e2"+
		"\1\2\u0dda\u0df0\3\2\2\2\u0ddb\u0ddc\f\6\2\2\u0ddc\u0ddd\7E\2\2\u0ddd"+
		"\u0dde\5\u01c4\u00e3\2\u0dde\u0ddf\b\u00e2\1\2\u0ddf\u0df0\3\2\2\2\u0de0"+
		"\u0de1\f\5\2\2\u0de1\u0de2\7L\2\2\u0de2\u0de3\5\u01c4\u00e3\2\u0de3\u0de4"+
		"\b\u00e2\1\2\u0de4\u0df0\3\2\2\2\u0de5\u0de6\f\4\2\2\u0de6\u0de7\7M\2"+
		"\2\u0de7\u0de8\5\u01c4\u00e3\2\u0de8\u0de9\b\u00e2\1\2\u0de9\u0df0\3\2"+
		"\2\2\u0dea\u0deb\f\3\2\2\u0deb\u0dec\7\34\2\2\u0dec\u0ded\5\16\b\2\u0ded"+
		"\u0dee\b\u00e2\1\2\u0dee\u0df0\3\2\2\2\u0def\u0dd6\3\2\2\2\u0def\u0ddb"+
		"\3\2\2\2\u0def\u0de0\3\2\2\2\u0def\u0de5\3\2\2\2\u0def\u0dea\3\2\2\2\u0df0"+
		"\u0df3\3\2\2\2\u0df1\u0def\3\2\2\2\u0df1\u0df2\3\2\2\2\u0df2\u01c3\3\2"+
		"\2\2\u0df3\u0df1\3\2\2\2\u0df4\u0df5\b\u00e3\1\2\u0df5\u0df6\5\u01c6\u00e4"+
		"\2\u0df6\u0df7\b\u00e3\1\2\u0df7\u0e0d\3\2\2\2\u0df8\u0df9\f\5\2\2\u0df9"+
		"\u0dfa\7F\2\2\u0dfa\u0dfb\7F\2\2\u0dfb\u0dfc\5\u01c6\u00e4\2\u0dfc\u0dfd"+
		"\b\u00e3\1\2\u0dfd\u0e0c\3\2\2\2\u0dfe\u0dff\f\4\2\2\u0dff\u0e00\7E\2"+
		"\2\u0e00\u0e01\7E\2\2\u0e01\u0e02\5\u01c6\u00e4\2\u0e02\u0e03\b\u00e3"+
		"\1\2\u0e03\u0e0c\3\2\2\2\u0e04\u0e05\f\3\2\2\u0e05\u0e06\7E\2\2\u0e06"+
		"\u0e07\7E\2\2\u0e07\u0e08\7E\2\2\u0e08\u0e09\5\u01c6\u00e4\2\u0e09\u0e0a"+
		"\b\u00e3\1\2\u0e0a\u0e0c\3\2\2\2\u0e0b\u0df8\3\2\2\2\u0e0b\u0dfe\3\2\2"+
		"\2\u0e0b\u0e04\3\2\2\2\u0e0c\u0e0f\3\2\2\2\u0e0d\u0e0b\3\2\2\2\u0e0d\u0e0e"+
		"\3\2\2\2\u0e0e\u01c5\3\2\2\2\u0e0f\u0e0d\3\2\2\2\u0e10\u0e11\b\u00e4\1"+
		"\2\u0e11\u0e12\5\u01c8\u00e5\2\u0e12\u0e13\b\u00e4\1\2\u0e13\u0e20\3\2"+
		"\2\2\u0e14\u0e15\f\4\2\2\u0e15\u0e16\7S\2\2\u0e16\u0e17\5\u01c8\u00e5"+
		"\2\u0e17\u0e18\b\u00e4\1\2\u0e18\u0e1f\3\2\2\2\u0e19\u0e1a\f\3\2\2\u0e1a"+
		"\u0e1b\7T\2\2\u0e1b\u0e1c\5\u01c8\u00e5\2\u0e1c\u0e1d\b\u00e4\1\2\u0e1d"+
		"\u0e1f\3\2\2\2\u0e1e\u0e14\3\2\2\2\u0e1e\u0e19\3\2\2\2\u0e1f\u0e22\3\2"+
		"\2\2\u0e20\u0e1e\3\2\2\2\u0e20\u0e21\3\2\2\2\u0e21\u01c7\3\2\2\2\u0e22"+
		"\u0e20\3\2\2\2\u0e23\u0e24\b\u00e5\1\2\u0e24\u0e25\5\u01ca\u00e6\2\u0e25"+
		"\u0e26\b\u00e5\1\2\u0e26\u0e38\3\2\2\2\u0e27\u0e28\f\5\2\2\u0e28\u0e29"+
		"\7U\2\2\u0e29\u0e2a\5\u01ca\u00e6\2\u0e2a\u0e2b\b\u00e5\1\2\u0e2b\u0e37"+
		"\3\2\2\2\u0e2c\u0e2d\f\4\2\2\u0e2d\u0e2e\7V\2\2\u0e2e\u0e2f\5\u01ca\u00e6"+
		"\2\u0e2f\u0e30\b\u00e5\1\2\u0e30\u0e37\3\2\2\2\u0e31\u0e32\f\3\2\2\u0e32"+
		"\u0e33\7Z\2\2\u0e33\u0e34\5\u01ca\u00e6\2\u0e34\u0e35\b\u00e5\1\2\u0e35"+
		"\u0e37\3\2\2\2\u0e36\u0e27\3\2\2\2\u0e36\u0e2c\3\2\2\2\u0e36\u0e31\3\2"+
		"\2\2\u0e37\u0e3a\3\2\2\2\u0e38\u0e36\3\2\2\2\u0e38\u0e39\3\2\2\2\u0e39"+
		"\u01c9\3\2\2\2\u0e3a\u0e38\3\2\2\2\u0e3b\u0e3c\5\u01cc\u00e7\2\u0e3c\u0e3d"+
		"\b\u00e6\1\2\u0e3d\u0e4d\3\2\2\2\u0e3e\u0e3f\5\u01ce\u00e8\2\u0e3f\u0e40"+
		"\b\u00e6\1\2\u0e40\u0e4d\3\2\2\2\u0e41\u0e42\7S\2\2\u0e42\u0e43\5\u01ca"+
		"\u00e6\2\u0e43\u0e44\b\u00e6\1\2\u0e44\u0e4d\3\2\2\2\u0e45\u0e46\7T\2"+
		"\2\u0e46\u0e47\5\u01ca\u00e6\2\u0e47\u0e48\b\u00e6\1\2\u0e48\u0e4d\3\2"+
		"\2\2\u0e49\u0e4a\5\u01d0\u00e9\2\u0e4a\u0e4b\b\u00e6\1\2\u0e4b\u0e4d\3"+
		"\2\2\2\u0e4c\u0e3b\3\2\2\2\u0e4c\u0e3e\3\2\2\2\u0e4c\u0e41\3\2\2\2\u0e4c"+
		"\u0e45\3\2\2\2\u0e4c\u0e49\3\2\2\2\u0e4d\u01cb\3\2\2\2\u0e4e\u0e4f\7Q"+
		"\2\2\u0e4f\u0e50\5\u01ca\u00e6\2\u0e50\u0e51\b\u00e7\1\2\u0e51\u01cd\3"+
		"\2\2\2\u0e52\u0e53\7R\2\2\u0e53\u0e54\5\u01ca\u00e6\2\u0e54\u0e55\b\u00e8"+
		"\1\2\u0e55\u01cf\3\2\2\2\u0e56\u0e57\5\u01d2\u00ea\2\u0e57\u0e58\b\u00e9"+
		"\1\2\u0e58\u0e65\3\2\2\2\u0e59\u0e5a\7H\2\2\u0e5a\u0e5b\5\u01ca\u00e6"+
		"\2\u0e5b\u0e5c\b\u00e9\1\2\u0e5c\u0e65\3\2\2\2\u0e5d\u0e5e\7G\2\2\u0e5e"+
		"\u0e5f\5\u01ca\u00e6\2\u0e5f\u0e60\b\u00e9\1\2\u0e60\u0e65\3\2\2\2\u0e61"+
		"\u0e62\5\u01dc\u00ef\2\u0e62\u0e63\b\u00e9\1\2\u0e63\u0e65\3\2\2\2\u0e64"+
		"\u0e56\3\2\2\2\u0e64\u0e59\3\2\2\2\u0e64\u0e5d\3\2\2\2\u0e64\u0e61\3\2"+
		"\2\2\u0e65\u01d1\3\2\2\2\u0e66\u0e67\5\u0162\u00b2\2\u0e67\u0e68\b\u00ea"+
		"\1\2\u0e68\u0e6d\3\2\2\2\u0e69\u0e6a\5<\37\2\u0e6a\u0e6b\b\u00ea\1\2\u0e6b"+
		"\u0e6d\3\2\2\2\u0e6c\u0e66\3\2\2\2\u0e6c\u0e69\3\2\2\2\u0e6d\u0e76\3\2"+
		"\2\2\u0e6e\u0e6f\5\u01d6\u00ec\2\u0e6f\u0e70\b\u00ea\1\2\u0e70\u0e75\3"+
		"\2\2\2\u0e71\u0e72\5\u01da\u00ee\2\u0e72\u0e73\b\u00ea\1\2\u0e73\u0e75"+
		"\3\2\2\2\u0e74\u0e6e\3\2\2\2\u0e74\u0e71\3\2\2\2\u0e75\u0e78\3\2\2\2\u0e76"+
		"\u0e74\3\2\2\2\u0e76\u0e77\3\2\2\2\u0e77\u01d3\3\2\2\2\u0e78\u0e76\3\2"+
		"\2\2\u0e79\u0e7a\5\u01d2\u00ea\2\u0e7a\u0e7b\7Q\2\2\u0e7b\u0e7c\b\u00eb"+
		"\1\2\u0e7c\u01d5\3\2\2\2\u0e7d\u0e7e\7Q\2\2\u0e7e\u0e7f\b\u00ec\1\2\u0e7f"+
		"\u01d7\3\2\2\2\u0e80\u0e81\5\u01d2\u00ea\2\u0e81\u0e82\7R\2\2\u0e82\u0e83"+
		"\b\u00ed\1\2\u0e83\u01d9\3\2\2\2\u0e84\u0e85\7R\2\2\u0e85\u0e86\b\u00ee"+
		"\1\2\u0e86\u01db\3\2\2\2\u0e87\u0e88\7;\2\2\u0e88\u0e89\5\6\4\2\u0e89"+
		"\u0e8a\7<\2\2\u0e8a\u0e8b\5\u01ca\u00e6\2\u0e8b\u0e8c\b\u00ef\1\2\u0e8c"+
		"\u0eac\3\2\2\2\u0e8d\u0e8e\7;\2\2\u0e8e\u0e8f\5\16\b\2\u0e8f\u0e95\b\u00ef"+
		"\1\2\u0e90\u0e91\5*\26\2\u0e91\u0e92\b\u00ef\1\2\u0e92\u0e94\3\2\2\2\u0e93"+
		"\u0e90\3\2\2\2\u0e94\u0e97\3\2\2\2\u0e95\u0e93\3\2\2\2\u0e95\u0e96\3\2"+
		"\2\2\u0e96\u0e98\3\2\2\2\u0e97\u0e95\3\2\2\2\u0e98\u0e99\7<\2\2\u0e99"+
		"\u0e9a\5\u01d0\u00e9\2\u0e9a\u0e9b\b\u00ef\1\2\u0e9b\u0eac\3\2\2\2\u0e9c"+
		"\u0e9d\7;\2\2\u0e9d\u0e9e\5\16\b\2\u0e9e\u0ea4\b\u00ef\1\2\u0e9f\u0ea0"+
		"\5*\26\2\u0ea0\u0ea1\b\u00ef\1\2\u0ea1\u0ea3\3\2\2\2\u0ea2\u0e9f\3\2\2"+
		"\2\u0ea3\u0ea6\3\2\2\2\u0ea4\u0ea2\3\2\2\2\u0ea4\u0ea5\3\2\2\2\u0ea5\u0ea7"+
		"\3\2\2\2\u0ea6\u0ea4\3\2\2\2\u0ea7\u0ea8\7<\2\2\u0ea8\u0ea9\5\u01a4\u00d3"+
		"\2\u0ea9\u0eaa\b\u00ef\1\2\u0eaa\u0eac\3\2\2\2\u0eab\u0e87\3\2\2\2\u0eab"+
		"\u0e8d\3\2\2\2\u0eab\u0e9c\3\2\2\2\u0eac\u01dd\3\2\2\2\u0148\u01ea\u01f2"+
		"\u01f9\u0204\u0209\u0211\u021d\u0223\u022e\u0236\u023e\u0240\u0248\u024d"+
		"\u0257\u025c\u0260\u0268\u026d\u0276\u027b\u028d\u029f\u02a4\u02ad\u02b5"+
		"\u02bd\u02c2\u02d5\u02da\u02ed\u02f8\u02ff\u0305\u030f\u031b\u0325\u0331"+
		"\u033b\u034a\u034e\u0355\u035d\u0368\u0374\u0389\u03ae\u03b6\u03bd\u03c3"+
		"\u03c6\u03c9\u03df\u03ef\u0405\u040e\u041d\u042c\u0433\u044c\u0457\u045f"+
		"\u0465\u046f\u0477\u047e\u0489\u0491\u0499\u049b\u04a0\u04aa\u04af\u04b3"+
		"\u04bb\u04c0\u04c6\u04e2\u04e9\u0506\u050b\u0515\u051b\u051f\u0526\u052b"+
		"\u052f\u0541\u054c\u055a\u055f\u0566\u0572\u0579\u0582\u058c\u0593\u0599"+
		"\u05ab\u05b6\u05bc\u05ca\u05d0\u05de\u05e1\u05e6\u05f0\u05f3\u05f9\u05fe"+
		"\u0604\u0609\u0611\u0616\u061f\u0624\u062a\u0631\u0637\u063e\u0641\u0644"+
		"\u064d\u0655\u065b\u065e\u0662\u066b\u0674\u067b\u0681\u0684\u0698\u06a2"+
		"\u06b4\u06bb\u06cc\u06d3\u06e8\u06ef\u06fc\u070e\u0715\u071d\u0720\u072c"+
		"\u073b\u0742\u074b\u075c\u0760\u0763\u0771\u0783\u0786\u0794\u079b\u07a8"+
		"\u07b6\u07c1\u07da\u07eb\u080f\u0836\u085d\u086c\u0874\u0886\u0898\u08ba"+
		"\u08c2\u08c7\u08cb\u08cf\u08d8\u08dc\u08e0\u08ec\u08fa\u0906\u0918\u0925"+
		"\u092c\u0933\u094c\u0954\u095d\u096f\u097f\u098a\u098d\u0994\u09a1\u09ab"+
		"\u09ba\u09c1\u09e0\u09e8\u09f8\u0a15\u0a26\u0a36\u0a44\u0a61\u0a71\u0a8b"+
		"\u0a8f\u0a96\u0aa1\u0aa8\u0aac\u0ab0\u0ab5\u0abb\u0ac2\u0ac7\u0acb\u0ad0"+
		"\u0ad6\u0add\u0ae2\u0ae6\u0aeb\u0aed\u0af2\u0af9\u0afe\u0b02\u0b07\u0b0b"+
		"\u0b12\u0b1d\u0b24\u0b28\u0b2c\u0b31\u0b37\u0b3e\u0b43\u0b47\u0b4c\u0b4e"+
		"\u0b56\u0b68\u0b79\u0b87\u0b91\u0ba2\u0bb1\u0bbb\u0bc1\u0bc9\u0bce\u0bd6"+
		"\u0bdb\u0be3\u0be8\u0bf0\u0bf5\u0bfe\u0c03\u0c08\u0c0c\u0c11\u0c19\u0c21"+
		"\u0c26\u0c2e\u0c33\u0c3b\u0c40\u0c49\u0c4e\u0c53\u0c5e\u0c66\u0c6e\u0c76"+
		"\u0c7e\u0c87\u0c8f\u0c99\u0c9d\u0ca5\u0cad\u0cb5\u0cbe\u0cc6\u0cd0\u0cd6"+
		"\u0cde\u0cee\u0cf7\u0cff\u0d10\u0d1b\u0d24\u0d2e\u0d39\u0d41\u0d51\u0d6b"+
		"\u0d77\u0d84\u0d92\u0da0\u0dae\u0dbc\u0dcd\u0dcf\u0def\u0df1\u0e0b\u0e0d"+
		"\u0e1e\u0e20\u0e36\u0e38\u0e4c\u0e64\u0e6c\u0e74\u0e76\u0e95\u0ea4\u0eab";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}