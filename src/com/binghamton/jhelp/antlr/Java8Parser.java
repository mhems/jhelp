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
		public List<Annotation> anns = new ArrayList<>();
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
		public List<Annotation> anns = new ArrayList<>();
		public List<TypeArgument> ls = null;
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
			setState(610);
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
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(586);
					((ClassTypeContext)_localctx).targs = typeArguments();
					((ClassTypeContext)_localctx).ls =  ((ClassTypeContext)_localctx).targs.ret;
					}
				}

				((ClassTypeContext)_localctx).ret =  new ClassInterfaceType(((ClassTypeContext)_localctx).id.getText(), _localctx.anns, _localctx.ls);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				((ClassTypeContext)_localctx).st = classOrInterfaceType();
				setState(593);
				match(DOT);
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(594);
					((ClassTypeContext)_localctx).a = annotation();
					_localctx.anns.add(((ClassTypeContext)_localctx).a.ret);
					}
					}
					setState(601);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(602);
				((ClassTypeContext)_localctx).id = match(Identifier);
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(603);
					((ClassTypeContext)_localctx).targs = typeArguments();
					((ClassTypeContext)_localctx).ls =  ((ClassTypeContext)_localctx).targs.ret;
					}
				}

				((ClassTypeContext)_localctx).ret =  new ClassInterfaceType(((ClassTypeContext)_localctx).id.getText(), _localctx.anns, _localctx.ls, ((ClassTypeContext)_localctx).st.ret);
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
		public List<Annotation> ans = new ArrayList<>();
		public List<TypeArgument> ls = null;
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
			setState(612);
			match(DOT);
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(613);
				((ClassType_lf_classOrInterfaceTypeContext)_localctx).a = annotation();
				_localctx.ans.add(((ClassType_lf_classOrInterfaceTypeContext)_localctx).a.ret);
				}
				}
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(621);
			((ClassType_lf_classOrInterfaceTypeContext)_localctx).id = match(Identifier);
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(622);
				((ClassType_lf_classOrInterfaceTypeContext)_localctx).targs = typeArguments();
				((ClassType_lf_classOrInterfaceTypeContext)_localctx).ls =  ((ClassType_lf_classOrInterfaceTypeContext)_localctx).targs.ret;
				}
				break;
			}
			((ClassType_lf_classOrInterfaceTypeContext)_localctx).ret =  new ClassInterfaceType(((ClassType_lf_classOrInterfaceTypeContext)_localctx).id.getText(), _localctx.ans, _localctx.ls);
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
		public List<Annotation> ans = new ArrayList<>();
		public List<TypeArgument> ls = null;
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
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(629);
				((ClassType_lfno_classOrInterfaceTypeContext)_localctx).a = annotation();
				_localctx.ans.add(((ClassType_lfno_classOrInterfaceTypeContext)_localctx).a.ret);
				}
				}
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(637);
			((ClassType_lfno_classOrInterfaceTypeContext)_localctx).id = match(Identifier);
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(638);
				((ClassType_lfno_classOrInterfaceTypeContext)_localctx).targs = typeArguments();
				((ClassType_lfno_classOrInterfaceTypeContext)_localctx).ls =  ((ClassType_lfno_classOrInterfaceTypeContext)_localctx).targs.ret;
				}
				break;
			}
			((ClassType_lfno_classOrInterfaceTypeContext)_localctx).ret =  new ClassInterfaceType(((ClassType_lfno_classOrInterfaceTypeContext)_localctx).id.getText(), _localctx.ans, _localctx.ls);
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
			setState(645);
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
			setState(648);
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
			setState(651);
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
		public List<Annotation> ans = new ArrayList<>();
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
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(654);
				((TypeVariableContext)_localctx).a = annotation();
				_localctx.ans.add(((TypeVariableContext)_localctx).a.ret);
				}
				}
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(662);
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
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(665);
				((ArrayTypeContext)_localctx).p = primitiveType();
				setState(666);
				((ArrayTypeContext)_localctx).d = dims();
				((ArrayTypeContext)_localctx).ret =  new ArrayType(((ArrayTypeContext)_localctx).p.ret, ((ArrayTypeContext)_localctx).d.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(669);
				((ArrayTypeContext)_localctx).c = classOrInterfaceType();
				setState(670);
				((ArrayTypeContext)_localctx).d = dims();
				((ArrayTypeContext)_localctx).ret =  new ArrayType(((ArrayTypeContext)_localctx).c.ret, ((ArrayTypeContext)_localctx).d.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(673);
				((ArrayTypeContext)_localctx).v = typeVariable();
				setState(674);
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
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(679);
				annotation();
				}
				}
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(685);
			match(LBRACK);
			setState(686);
			match(RBRACK);
			((DimsContext)_localctx).ret =  1;
			setState(699);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(691);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(688);
						annotation();
						}
						}
						setState(693);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(694);
					match(LBRACK);
					setState(695);
					match(RBRACK);
					++_localctx.ret;
					}
					} 
				}
				setState(701);
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
		public List<Annotation> ans = new ArrayList<>();
		public List<ReferenceType> ls = null;
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
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(702);
				((TypeParameterContext)_localctx).a = typeParameterModifier();
				_localctx.ans.add(((TypeParameterContext)_localctx).a.ret);
				}
				}
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(710);
			((TypeParameterContext)_localctx).id = match(Identifier);
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(711);
				((TypeParameterContext)_localctx).b = typeBound();
				((TypeParameterContext)_localctx).ls =  ((TypeParameterContext)_localctx).b.ret;
				}
			}

			((TypeParameterContext)_localctx).ret =  new TypeParameter(((TypeParameterContext)_localctx).id.getText(), _localctx.ans, _localctx.ls);
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
			setState(718);
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
		public List<ReferenceType> ls = new ArrayList<>();
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
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(721);
				match(EXTENDS);
				setState(722);
				((TypeBoundContext)_localctx).v = typeVariable();
				_localctx.ls.add(((TypeBoundContext)_localctx).v.ret); ((TypeBoundContext)_localctx).ret =  _localctx.ls;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(725);
				match(EXTENDS);
				setState(726);
				((TypeBoundContext)_localctx).c = classOrInterfaceType();
				_localctx.ls.add(((TypeBoundContext)_localctx).c.ret);
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(728);
					((TypeBoundContext)_localctx).a = additionalBound();
					_localctx.ls.add(((TypeBoundContext)_localctx).a.ret);
					}
					}
					setState(735);
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
			setState(740);
			match(BITAND);
			setState(741);
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
			setState(744);
			match(LT);
			setState(745);
			((TypeArgumentsContext)_localctx).ls = typeArgumentList();
			setState(746);
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
		public List<TypeArgument> ls = new ArrayList<>();
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
			setState(749);
			((TypeArgumentListContext)_localctx).a1 = typeArgument();
			_localctx.ls.add(((TypeArgumentListContext)_localctx).a1.ret);
			setState(757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(751);
				match(COMMA);
				setState(752);
				((TypeArgumentListContext)_localctx).a = typeArgument();
				_localctx.ls.add(((TypeArgumentListContext)_localctx).a.ret);
				}
				}
				setState(759);
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
			setState(768);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				((TypeArgumentContext)_localctx).r = referenceType();
				((TypeArgumentContext)_localctx).ret =  new TypeArgument(((TypeArgumentContext)_localctx).r.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
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
		public List<Annotation> ans = new ArrayList<>();
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
			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(770);
				((WildcardContext)_localctx).a = annotation();
				_localctx.ans.add(((WildcardContext)_localctx).a.ret);
				}
				}
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(778);
			match(QUESTION);
			((WildcardContext)_localctx).ret =  new TypeArgument(_localctx.ans);
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(780);
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
			setState(791);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				match(EXTENDS);
				setState(784);
				((WildcardBoundsContext)_localctx).r = referenceType();
				_localctx.ret.setBoundType(((WildcardBoundsContext)_localctx).r.ret); _localctx.ret.setIsUpperBounded(true);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
				match(SUPER);
				setState(788);
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
			setState(794);
			((PackageNameContext)_localctx).id = match(Identifier);
			 ((PackageNameContext)_localctx).ret =  ((PackageNameContext)_localctx).id.getText(); 
			}
			_ctx.stop = _input.LT(-1);
			setState(803);
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
					setState(797);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(798);
					match(DOT);
					setState(799);
					((PackageNameContext)_localctx).id = match(Identifier);
					((PackageNameContext)_localctx).ret =  ((PackageNameContext)_localctx).p.ret + "." + ((PackageNameContext)_localctx).id.getText();
					}
					} 
				}
				setState(805);
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
			setState(813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(806);
				((TypeNameContext)_localctx).id = match(Identifier);
				 ((TypeNameContext)_localctx).ret =  ((TypeNameContext)_localctx).id.getText(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(808);
				((TypeNameContext)_localctx).p = packageOrTypeName(0);
				setState(809);
				match(DOT);
				setState(810);
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
			setState(816);
			((PackageOrTypeNameContext)_localctx).id = match(Identifier);
			 ((PackageOrTypeNameContext)_localctx).ret =  ((PackageOrTypeNameContext)_localctx).id.getText(); 
			}
			_ctx.stop = _input.LT(-1);
			setState(825);
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
					setState(819);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(820);
					match(DOT);
					setState(821);
					((PackageOrTypeNameContext)_localctx).id = match(Identifier);
					 ((PackageOrTypeNameContext)_localctx).ret =  ((PackageOrTypeNameContext)_localctx).p.ret + "." + ((PackageOrTypeNameContext)_localctx).id.getText(); 
					}
					} 
				}
				setState(827);
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
			setState(835);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(828);
				((ExpressionNameContext)_localctx).id = match(Identifier);
				 ((ExpressionNameContext)_localctx).ret =  ((ExpressionNameContext)_localctx).id.getText(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(830);
				((ExpressionNameContext)_localctx).a = ambiguousName(0);
				setState(831);
				match(DOT);
				setState(832);
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
			setState(837);
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
			setState(841);
			((AmbiguousNameContext)_localctx).id = match(Identifier);
			 ((AmbiguousNameContext)_localctx).ret =  ((AmbiguousNameContext)_localctx).id.getText(); 
			}
			_ctx.stop = _input.LT(-1);
			setState(850);
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
					setState(844);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(845);
					match(DOT);
					setState(846);
					((AmbiguousNameContext)_localctx).id = match(Identifier);
					 ((AmbiguousNameContext)_localctx).ret =  ((AmbiguousNameContext)_localctx).a.ret + "." + ((AmbiguousNameContext)_localctx).id.getText(); 
					}
					} 
				}
				setState(852);
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
		public PackageStatement stmt = null;
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
			setState(856);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(853);
				((CompilationUnitContext)_localctx).p = packageDeclaration();
				((CompilationUnitContext)_localctx).stmt =  ((CompilationUnitContext)_localctx).p.ret;
				}
				break;
			}
			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(858);
				((CompilationUnitContext)_localctx).i = importDeclaration();
				_localctx.imports.add(((CompilationUnitContext)_localctx).i.ret);
				}
				}
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==AT) {
				{
				{
				setState(866);
				((CompilationUnitContext)_localctx).t = typeDeclaration();
				_localctx.bodies.add(((CompilationUnitContext)_localctx).t.ret);
				}
				}
				setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(874);
			match(EOF);
			((CompilationUnitContext)_localctx).ret =  new CompilationUnit(_localctx.stmt, _localctx.imports, _localctx.bodies);
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
			setState(882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(877);
				((PackageDeclarationContext)_localctx).a = packageModifier();
				_localctx.anns.add(((PackageDeclarationContext)_localctx).a.ret);
				}
				}
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(885);
			match(PACKAGE);
			{
			setState(886);
			((PackageDeclarationContext)_localctx).id = match(Identifier);
			_localctx.ids.add(((PackageDeclarationContext)_localctx).id.getText());
			}
			setState(894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(889);
				match(DOT);
				setState(890);
				((PackageDeclarationContext)_localctx).id = match(Identifier);
				_localctx.ids.add(((PackageDeclarationContext)_localctx).id.getText());
				}
				}
				setState(896);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(897);
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
			setState(900);
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
			setState(915);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(903);
				((ImportDeclarationContext)_localctx).s = singleTypeImportDeclaration();
				((ImportDeclarationContext)_localctx).ret =  ((ImportDeclarationContext)_localctx).s.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(906);
				((ImportDeclarationContext)_localctx).t = typeImportOnDemandDeclaration();
				((ImportDeclarationContext)_localctx).ret =  ((ImportDeclarationContext)_localctx).t.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(909);
				((ImportDeclarationContext)_localctx).ss = singleStaticImportDeclaration();
				((ImportDeclarationContext)_localctx).ret =  ((ImportDeclarationContext)_localctx).ss.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(912);
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
			setState(917);
			match(IMPORT);
			setState(918);
			((SingleTypeImportDeclarationContext)_localctx).t = typeName();
			setState(919);
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
			setState(922);
			match(IMPORT);
			setState(923);
			((TypeImportOnDemandDeclarationContext)_localctx).p = packageOrTypeName(0);
			setState(924);
			match(DOT);
			setState(925);
			match(MUL);
			setState(926);
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
			setState(929);
			match(IMPORT);
			setState(930);
			match(STATIC);
			setState(931);
			((SingleStaticImportDeclarationContext)_localctx).t = typeName();
			setState(932);
			match(DOT);
			setState(933);
			((SingleStaticImportDeclarationContext)_localctx).id = match(Identifier);
			setState(934);
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
			setState(937);
			match(IMPORT);
			setState(938);
			match(STATIC);
			setState(939);
			((StaticImportOnDemandDeclarationContext)_localctx).t = typeName();
			setState(940);
			match(DOT);
			setState(941);
			match(MUL);
			setState(942);
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
			setState(952);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(945);
				((TypeDeclarationContext)_localctx).c = classDeclaration();
				((TypeDeclarationContext)_localctx).ret =  ((TypeDeclarationContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(948);
				((TypeDeclarationContext)_localctx).i = interfaceDeclaration();
				((TypeDeclarationContext)_localctx).ret =  ((TypeDeclarationContext)_localctx).i.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(951);
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
			setState(960);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(954);
				((ClassDeclarationContext)_localctx).n = normalClassDeclaration();
				((ClassDeclarationContext)_localctx).ret =  ((ClassDeclarationContext)_localctx).n.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(957);
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
		public List<Modifier> mods = new ArrayList<>();
		public List<TypeParameter> tpars = null;
		public ClassInterfaceType scls = null;
		public List<ClassInterfaceType> sis = null;
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
			setState(967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(962);
				((NormalClassDeclarationContext)_localctx).m = classModifier();
				_localctx.mods.add(((NormalClassDeclarationContext)_localctx).m.ret);
				}
				}
				setState(969);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(970);
			match(CLASS);
			setState(971);
			((NormalClassDeclarationContext)_localctx).n = match(Identifier);
			setState(975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(972);
				((NormalClassDeclarationContext)_localctx).p = typeParameters();
				((NormalClassDeclarationContext)_localctx).tpars =  ((NormalClassDeclarationContext)_localctx).p.ret;
				}
			}

			setState(980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(977);
				((NormalClassDeclarationContext)_localctx).sc = superclass();
				((NormalClassDeclarationContext)_localctx).scls =  ((NormalClassDeclarationContext)_localctx).sc.ret;
				}
			}

			setState(985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(982);
				((NormalClassDeclarationContext)_localctx).si = superinterfaces();
				((NormalClassDeclarationContext)_localctx).sis =  ((NormalClassDeclarationContext)_localctx).si.ret;
				}
			}

			((NormalClassDeclarationContext)_localctx).ret =  new ClassDeclaration(((NormalClassDeclarationContext)_localctx).n.getText(), _localctx.mods, _localctx.sis, _localctx.tpars, _localctx.scls);
			setState(988);
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
			setState(1007);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(990);
				((ClassModifierContext)_localctx).a = annotation();
				((ClassModifierContext)_localctx).ret =  ((ClassModifierContext)_localctx).a.ret;
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(993);
				match(PUBLIC);
				((ClassModifierContext)_localctx).ret =  Modifier.PUBLIC;
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(995);
				match(PROTECTED);
				((ClassModifierContext)_localctx).ret =  Modifier.PROTECTED;
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(997);
				match(PRIVATE);
				((ClassModifierContext)_localctx).ret =  Modifier.PRIVATE;
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(999);
				match(ABSTRACT);
				((ClassModifierContext)_localctx).ret =  Modifier.ABSTRACT;
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1001);
				match(STATIC);
				((ClassModifierContext)_localctx).ret =  Modifier.STATIC;
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1003);
				match(FINAL);
				((ClassModifierContext)_localctx).ret =  Modifier.FINAL;
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(1005);
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
			setState(1009);
			match(LT);
			setState(1010);
			((TypeParametersContext)_localctx).t = typeParameterList();
			setState(1011);
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
		public List<TypeParameter> ls = new ArrayList<>();
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
			setState(1014);
			((TypeParameterListContext)_localctx).t1 = typeParameter();
			_localctx.ls.add(((TypeParameterListContext)_localctx).t1.ret);
			}
			setState(1023);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1017);
				match(COMMA);
				setState(1018);
				((TypeParameterListContext)_localctx).t = typeParameter();
				_localctx.ls.add(((TypeParameterListContext)_localctx).t.ret);
				}
				}
				setState(1025);
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
			setState(1028);
			match(EXTENDS);
			setState(1029);
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
			setState(1032);
			match(IMPLEMENTS);
			setState(1033);
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
		public List<ClassInterfaceType> ls = new ArrayList<>();
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
			setState(1036);
			((InterfaceTypeListContext)_localctx).i1 = interfaceType();
			_localctx.ls.add(((InterfaceTypeListContext)_localctx).i1.ret);
			}
			setState(1045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1039);
				match(COMMA);
				setState(1040);
				((InterfaceTypeListContext)_localctx).i = interfaceType();
				_localctx.ls.add(((InterfaceTypeListContext)_localctx).i.ret);
				}
				}
				setState(1047);
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
			setState(1050);
			match(LBRACE);
			setState(1054);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(1051);
				classBodyDeclaration(_localctx.ret);
				}
				}
				setState(1056);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1057);
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
			setState(1069);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1059);
				classMemberDeclaration(_localctx.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1060);
				((ClassBodyDeclarationContext)_localctx).i = instanceInitializer();
				_localctx.ret.addInstanceInitializer(((ClassBodyDeclarationContext)_localctx).i.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1063);
				((ClassBodyDeclarationContext)_localctx).s = staticInitializer();
				_localctx.ret.addStaticInitializer(((ClassBodyDeclarationContext)_localctx).s.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1066);
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
			setState(1084);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1071);
				((ClassMemberDeclarationContext)_localctx).f = fieldDeclaration();
				_localctx.ret.addField(((ClassMemberDeclarationContext)_localctx).f.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1074);
				((ClassMemberDeclarationContext)_localctx).m = methodDeclaration();
				_localctx.ret.addMethod(((ClassMemberDeclarationContext)_localctx).m.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1077);
				((ClassMemberDeclarationContext)_localctx).c = classDeclaration();
				_localctx.ret.addInnerBody(((ClassMemberDeclarationContext)_localctx).c.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1080);
				((ClassMemberDeclarationContext)_localctx).i = interfaceDeclaration();
				_localctx.ret.addInnerInterface(((ClassMemberDeclarationContext)_localctx).i.ret);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1083);
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
		public List<Modifier> mods = new ArrayList<>();
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
			setState(1091);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				{
				setState(1086);
				((FieldDeclarationContext)_localctx).m = fieldModifier();
				_localctx.mods.add(((FieldDeclarationContext)_localctx).m.ret);
				}
				}
				setState(1093);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1094);
			((FieldDeclarationContext)_localctx).t = unannType();
			setState(1095);
			((FieldDeclarationContext)_localctx).l = variableDeclaratorList();
			setState(1096);
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
			setState(1116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1099);
				((FieldModifierContext)_localctx).a = annotation();
				((FieldModifierContext)_localctx).ret =  ((FieldModifierContext)_localctx).a.ret;
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1102);
				match(PUBLIC);
				((FieldModifierContext)_localctx).ret =  Modifier.PUBLIC;
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1104);
				match(PROTECTED);
				((FieldModifierContext)_localctx).ret =  Modifier.PROTECTED;
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1106);
				match(PRIVATE);
				((FieldModifierContext)_localctx).ret =  Modifier.PRIVATE;
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1108);
				match(STATIC);
				((FieldModifierContext)_localctx).ret =  Modifier.STATIC;
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1110);
				match(FINAL);
				((FieldModifierContext)_localctx).ret =  Modifier.FINAL;
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(1112);
				match(TRANSIENT);
				((FieldModifierContext)_localctx).ret =  Modifier.TRANSIENT;
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1114);
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
		public List<MyPair<String, Expression>> ls = new ArrayList<>();
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
			setState(1118);
			((VariableDeclaratorListContext)_localctx).d1 = variableDeclarator();
			_localctx.ls.add(((VariableDeclaratorListContext)_localctx).d1.ret);
			}
			setState(1127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1121);
				match(COMMA);
				setState(1122);
				((VariableDeclaratorListContext)_localctx).d = variableDeclarator();
				_localctx.ls.add(((VariableDeclaratorListContext)_localctx).d.ret);
				}
				}
				setState(1129);
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
		public Expression expr = null;
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
			setState(1132);
			((VariableDeclaratorContext)_localctx).id = variableDeclaratorId();
			setState(1137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1133);
				match(ASSIGN);
				setState(1134);
				((VariableDeclaratorContext)_localctx).in = variableInitializer();
				((VariableDeclaratorContext)_localctx).expr =  ((VariableDeclaratorContext)_localctx).in.ret;
				}
			}

			((VariableDeclaratorContext)_localctx).ret =  new MyPair<>(toName(((VariableDeclaratorContext)_localctx).id.ret), _localctx.expr);
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
		public int dim = 0;
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
			setState(1141);
			((VariableDeclaratorIdContext)_localctx).id = match(Identifier);
			setState(1145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1142);
				((VariableDeclaratorIdContext)_localctx).d = dims();
				((VariableDeclaratorIdContext)_localctx).dim =  ((VariableDeclaratorIdContext)_localctx).d.ret;
				}
			}

			((VariableDeclaratorIdContext)_localctx).ret =  new MyPair<>(((VariableDeclaratorIdContext)_localctx).id.getText(), _localctx.dim);
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
			setState(1155);
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
				setState(1149);
				((VariableInitializerContext)_localctx).ex = expression();
				((VariableInitializerContext)_localctx).ret =  ((VariableInitializerContext)_localctx).ex.ret;
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1152);
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
			setState(1163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1157);
				((UnannTypeContext)_localctx).p = unannPrimitiveType();
				((UnannTypeContext)_localctx).ret =  ((UnannTypeContext)_localctx).p.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1160);
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
			setState(1170);
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
				setState(1165);
				((UnannPrimitiveTypeContext)_localctx).n = numericType();
				((UnannPrimitiveTypeContext)_localctx).ret =  new PrimitiveType(((UnannPrimitiveTypeContext)_localctx).n.ret);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1168);
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
			setState(1181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1172);
				((UnannReferenceTypeContext)_localctx).c = unannClassOrInterfaceType();
				((UnannReferenceTypeContext)_localctx).ret =  ((UnannReferenceTypeContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1175);
				((UnannReferenceTypeContext)_localctx).v = unannTypeVariable();
				((UnannReferenceTypeContext)_localctx).ret =  ((UnannReferenceTypeContext)_localctx).v.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1178);
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
			setState(1189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(1183);
				((UnannClassOrInterfaceTypeContext)_localctx).cno = unannClassType_lfno_unannClassOrInterfaceType();
				((UnannClassOrInterfaceTypeContext)_localctx).ret =  ((UnannClassOrInterfaceTypeContext)_localctx).cno.ret;
				}
				break;
			case 2:
				{
				setState(1186);
				((UnannClassOrInterfaceTypeContext)_localctx).ino = unannInterfaceType_lfno_unannClassOrInterfaceType();
				((UnannClassOrInterfaceTypeContext)_localctx).ret =  ((UnannClassOrInterfaceTypeContext)_localctx).ino.ret;
				}
				break;
			}
			setState(1199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1197);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
					case 1:
						{
						setState(1191);
						((UnannClassOrInterfaceTypeContext)_localctx).c = unannClassType_lf_unannClassOrInterfaceType();
						((UnannClassOrInterfaceTypeContext)_localctx).ret =  new ClassInterfaceType(_localctx.ret, ((UnannClassOrInterfaceTypeContext)_localctx).c.ret);
						}
						break;
					case 2:
						{
						setState(1194);
						((UnannClassOrInterfaceTypeContext)_localctx).i = unannInterfaceType_lf_unannClassOrInterfaceType();
						((UnannClassOrInterfaceTypeContext)_localctx).ret =  new ClassInterfaceType(_localctx.ret, ((UnannClassOrInterfaceTypeContext)_localctx).i.ret);
						}
						break;
					}
					} 
				}
				setState(1201);
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
		public List<Annotation> ans = new ArrayList<>();
		public List<TypeArgument> targs = null;
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
			setState(1227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1202);
				((UnannClassTypeContext)_localctx).id = match(Identifier);
				setState(1206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1203);
					((UnannClassTypeContext)_localctx).ta = typeArguments();
					((UnannClassTypeContext)_localctx).targs =  ((UnannClassTypeContext)_localctx).ta.ret;
					}
				}

				((UnannClassTypeContext)_localctx).ret =  new ClassInterfaceType(((UnannClassTypeContext)_localctx).id.getText(), null, _localctx.targs);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1209);
				((UnannClassTypeContext)_localctx).ci = unannClassOrInterfaceType();
				setState(1210);
				match(DOT);
				setState(1216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1211);
					((UnannClassTypeContext)_localctx).a = annotation();
					_localctx.ans.add(((UnannClassTypeContext)_localctx).a.ret);
					}
					}
					setState(1218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1219);
				((UnannClassTypeContext)_localctx).id2 = match(Identifier);
				setState(1223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1220);
					((UnannClassTypeContext)_localctx).ta2 = typeArguments();
					((UnannClassTypeContext)_localctx).targs =  ((UnannClassTypeContext)_localctx).ta2.ret;
					}
				}

				((UnannClassTypeContext)_localctx).ret =  new ClassInterfaceType(((UnannClassTypeContext)_localctx).id2.getText(), _localctx.ans,
				                                       _localctx.targs, ((UnannClassTypeContext)_localctx).ci.ret);
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
		public List<Annotation> ans = new ArrayList<>();
		public List<TypeArgument> targs = null;
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
			setState(1229);
			match(DOT);
			setState(1235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1230);
				((UnannClassType_lf_unannClassOrInterfaceTypeContext)_localctx).a = annotation();
				_localctx.ans.add(((UnannClassType_lf_unannClassOrInterfaceTypeContext)_localctx).a.ret);
				}
				}
				setState(1237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1238);
			((UnannClassType_lf_unannClassOrInterfaceTypeContext)_localctx).id = match(Identifier);
			setState(1242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1239);
				((UnannClassType_lf_unannClassOrInterfaceTypeContext)_localctx).ta = typeArguments();
				((UnannClassType_lf_unannClassOrInterfaceTypeContext)_localctx).targs =  ((UnannClassType_lf_unannClassOrInterfaceTypeContext)_localctx).ta.ret;
				}
			}

			((UnannClassType_lf_unannClassOrInterfaceTypeContext)_localctx).ret =  new ClassInterfaceType(((UnannClassType_lf_unannClassOrInterfaceTypeContext)_localctx).id.getText(), _localctx.ans, _localctx.targs);
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
		public List<TypeArgument> targs = null;
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
			setState(1246);
			((UnannClassType_lfno_unannClassOrInterfaceTypeContext)_localctx).id = match(Identifier);
			setState(1250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1247);
				((UnannClassType_lfno_unannClassOrInterfaceTypeContext)_localctx).ta = typeArguments();
				((UnannClassType_lfno_unannClassOrInterfaceTypeContext)_localctx).targs =  ((UnannClassType_lfno_unannClassOrInterfaceTypeContext)_localctx).ta.ret;
				}
			}

			((UnannClassType_lfno_unannClassOrInterfaceTypeContext)_localctx).ret =  new ClassInterfaceType(((UnannClassType_lfno_unannClassOrInterfaceTypeContext)_localctx).id.getText(), null, _localctx.targs);
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
			setState(1254);
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
			setState(1257);
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
			setState(1260);
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
			setState(1263);
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
			setState(1278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1266);
				((UnannArrayTypeContext)_localctx).p = unannPrimitiveType();
				setState(1267);
				((UnannArrayTypeContext)_localctx).d = dims();
				((UnannArrayTypeContext)_localctx).ret =  new ArrayType(((UnannArrayTypeContext)_localctx).p.ret, ((UnannArrayTypeContext)_localctx).d.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1270);
				((UnannArrayTypeContext)_localctx).c = unannClassOrInterfaceType();
				setState(1271);
				((UnannArrayTypeContext)_localctx).d = dims();
				((UnannArrayTypeContext)_localctx).ret =  new ArrayType(((UnannArrayTypeContext)_localctx).c.ret, ((UnannArrayTypeContext)_localctx).d.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1274);
				((UnannArrayTypeContext)_localctx).v = unannTypeVariable();
				setState(1275);
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
		public List<Modifier> mods = new ArrayList<>();
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
			setState(1285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED))) != 0) || _la==AT) {
				{
				{
				setState(1280);
				((MethodDeclarationContext)_localctx).m = methodModifier();
				_localctx.mods.add(((MethodDeclarationContext)_localctx).m.ret);
				}
				}
				setState(1287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((MethodDeclarationContext)_localctx).ret =  new MethodDeclaration(_localctx.mods);
			setState(1289);
			methodHeader(_localctx.ret);
			setState(1290);
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
			setState(1314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1293);
				((MethodModifierContext)_localctx).a = annotation();
				((MethodModifierContext)_localctx).ret =  ((MethodModifierContext)_localctx).a.ret;
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1296);
				match(PUBLIC);
				((MethodModifierContext)_localctx).ret =  Modifier.PUBLIC;
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1298);
				match(PROTECTED);
				((MethodModifierContext)_localctx).ret =  Modifier.PROTECTED;
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1300);
				match(PRIVATE);
				((MethodModifierContext)_localctx).ret =  Modifier.PRIVATE;
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1302);
				match(ABSTRACT);
				((MethodModifierContext)_localctx).ret =  Modifier.ABSTRACT;
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1304);
				match(STATIC);
				((MethodModifierContext)_localctx).ret =  Modifier.STATIC;
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1306);
				match(FINAL);
				((MethodModifierContext)_localctx).ret =  Modifier.FINAL;
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 8);
				{
				setState(1308);
				match(SYNCHRONIZED);
				((MethodModifierContext)_localctx).ret =  Modifier.SYNCHRONIZED;
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1310);
				match(NATIVE);
				((MethodModifierContext)_localctx).ret =  Modifier.NATIVE;
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 10);
				{
				setState(1312);
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
		public List<Annotation> ans = new ArrayList<>();
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
			setState(1343);
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
				setState(1316);
				((MethodHeaderContext)_localctx).rt = result();
				_localctx.ret.setReturnType(((MethodHeaderContext)_localctx).rt.ret);
				setState(1318);
				methodDeclarator(_localctx.ret);
				setState(1322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1319);
					((MethodHeaderContext)_localctx).th = throws_();
					_localctx.ret.setExceptions(((MethodHeaderContext)_localctx).th.ret);
					}
				}

				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1324);
				((MethodHeaderContext)_localctx).tp = typeParameters();
				_localctx.ret.setTypeParameters(((MethodHeaderContext)_localctx).tp.ret);
				setState(1331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1326);
					((MethodHeaderContext)_localctx).a = annotation();
					_localctx.ans.add(((MethodHeaderContext)_localctx).a.ret);
					}
					}
					setState(1333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

				            if (_localctx.ans.size() > 0) {
				                ((MethodHeaderContext)_localctx).rt.ret.setAnnotations(_localctx.ans);
				            }
				        
				setState(1335);
				((MethodHeaderContext)_localctx).rt = result();
				_localctx.ret.setReturnType(((MethodHeaderContext)_localctx).rt.ret);
				setState(1337);
				methodDeclarator(_localctx.ret);
				setState(1341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1338);
					((MethodHeaderContext)_localctx).th = throws_();
					_localctx.ret.setExceptions(((MethodHeaderContext)_localctx).th.ret);
					}
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
			setState(1350);
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
				setState(1345);
				((ResultContext)_localctx).u = unannType();
				((ResultContext)_localctx).ret =  ((ResultContext)_localctx).u.ret;
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1348);
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
			setState(1352);
			((MethodDeclaratorContext)_localctx).n = match(Identifier);
			_localctx.ret.setName(((MethodDeclaratorContext)_localctx).n.getText());
			setState(1354);
			match(LPAREN);
			setState(1358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1355);
				((MethodDeclaratorContext)_localctx).p = formalParameterList();
				_localctx.ret.setParameters(((MethodDeclaratorContext)_localctx).p.ret);
				}
			}

			setState(1360);
			match(RPAREN);
			setState(1364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1361);
				((MethodDeclaratorContext)_localctx).d = dims();

				            if (((MethodDeclaratorContext)_localctx).d.ret > 0) {
				                _localctx.ret.setReturnType(_localctx.ret.getReturnType().augment(((MethodDeclaratorContext)_localctx).d.ret));
				            }
				        
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<VariableDeclaration> ret;
		public List<VariableDeclaration> ls = new ArrayList<>();
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
			setState(1380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1366);
				((FormalParameterListContext)_localctx).p = formalParameters();
				_localctx.ls.addAll(((FormalParameterListContext)_localctx).p.ret);
				}
				setState(1369);
				match(COMMA);
				{
				setState(1370);
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
				setState(1375);
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
		public List<VariableDeclaration> ls = new ArrayList<>();
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
			setState(1410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1382);
				((FormalParametersContext)_localctx).p = formalParameter();
				_localctx.ls.add(((FormalParametersContext)_localctx).p.ret);
				}
				setState(1391);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1385);
						match(COMMA);
						setState(1386);
						((FormalParametersContext)_localctx).f = formalParameter();
						_localctx.ls.add(((FormalParametersContext)_localctx).f.ret);
						}
						} 
					}
					setState(1393);
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
				setState(1396);
				((FormalParametersContext)_localctx).r = receiverParameter();
				_localctx.ls.add(((FormalParametersContext)_localctx).r.ret);
				}
				setState(1405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1399);
						match(COMMA);
						setState(1400);
						((FormalParametersContext)_localctx).f = formalParameter();
						_localctx.ls.add(((FormalParametersContext)_localctx).f.ret);
						}
						} 
					}
					setState(1407);
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
		public List<Modifier> mods = new ArrayList<>();
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
			setState(1417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1412);
				((FormalParameterContext)_localctx).m = variableModifier();
				_localctx.mods.add(((FormalParameterContext)_localctx).m.ret);
				}
				}
				setState(1419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1420);
			((FormalParameterContext)_localctx).t = unannType();
			setState(1421);
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
			setState(1429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1424);
				((VariableModifierContext)_localctx).a = annotation();
				((VariableModifierContext)_localctx).ret =  ((VariableModifierContext)_localctx).a.ret;
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1427);
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
		public List<Modifier> mods = new ArrayList<>();
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
			setState(1455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
					{
					setState(1431);
					((LastFormalParameterContext)_localctx).m = variableModifier();
					_localctx.mods.add(((LastFormalParameterContext)_localctx).m.ret);
					}
					}
					setState(1438);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1439);
				((LastFormalParameterContext)_localctx).t = unannType();
				setState(1445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1440);
					((LastFormalParameterContext)_localctx).a = annotation();
					_localctx.mods.add(((LastFormalParameterContext)_localctx).a.ret);
					}
					}
					setState(1447);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1448);
				match(ELLIPSIS);
				setState(1449);
				((LastFormalParameterContext)_localctx).n = variableDeclaratorId();
				((LastFormalParameterContext)_localctx).ret =  new VariableDeclaration(toName(((LastFormalParameterContext)_localctx).n.ret), ((LastFormalParameterContext)_localctx).t.ret, _localctx.mods, true);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1452);
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
		public List<Modifier> ans = new ArrayList<>();
		public String id = "this";
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
			setState(1462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1457);
				((ReceiverParameterContext)_localctx).a = annotation();
				_localctx.ans.add(((ReceiverParameterContext)_localctx).a.ret);
				}
				}
				setState(1464);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1465);
			((ReceiverParameterContext)_localctx).t = unannType();
			setState(1469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1466);
				((ReceiverParameterContext)_localctx).i = match(Identifier);
				setState(1467);
				match(DOT);
				((ReceiverParameterContext)_localctx).id =  ((ReceiverParameterContext)_localctx).i.getText() + "." + _localctx.id;
				}
			}

			setState(1471);
			match(THIS);
			((ReceiverParameterContext)_localctx).ret =  new VariableDeclaration(_localctx.id, ((ReceiverParameterContext)_localctx).t.ret, _localctx.ans);
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
			setState(1474);
			match(THROWS);
			setState(1475);
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
		public List<Type> ls = new ArrayList<>();
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
			setState(1478);
			((ExceptionTypeListContext)_localctx).e = exceptionType();
			_localctx.ls.add(((ExceptionTypeListContext)_localctx).e.ret);
			}
			setState(1487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1481);
				match(COMMA);
				setState(1482);
				((ExceptionTypeListContext)_localctx).e = exceptionType();
				_localctx.ls.add(((ExceptionTypeListContext)_localctx).e.ret);
				}
				}
				setState(1489);
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
			setState(1498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1492);
				((ExceptionTypeContext)_localctx).c = classType();
				((ExceptionTypeContext)_localctx).ret =  ((ExceptionTypeContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1495);
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
			setState(1504);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1500);
				((MethodBodyContext)_localctx).body = block();
				((MethodBodyContext)_localctx).ret =  ((MethodBodyContext)_localctx).body.ret;
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1503);
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
			setState(1506);
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
			setState(1509);
			match(STATIC);
			setState(1510);
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
		public List<Modifier> mods = new ArrayList<>();
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
			setState(1518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0) || _la==AT) {
				{
				{
				setState(1513);
				((ConstructorDeclarationContext)_localctx).m = constructorModifier();
				_localctx.mods.add(((ConstructorDeclarationContext)_localctx).m.ret);
				}
				}
				setState(1520);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((ConstructorDeclarationContext)_localctx).ret =  new MethodDeclaration(_localctx.mods);
			setState(1522);
			constructorDeclarator(_localctx.ret);
			setState(1526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1523);
				((ConstructorDeclarationContext)_localctx).t = throws_();
				_localctx.ret.setExceptions(((ConstructorDeclarationContext)_localctx).t.ret);
				}
			}

			setState(1528);
			((ConstructorDeclarationContext)_localctx).b = constructorBody();
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
			setState(1540);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1531);
				((ConstructorModifierContext)_localctx).a = annotation();
				((ConstructorModifierContext)_localctx).ret =  ((ConstructorModifierContext)_localctx).a.ret;
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1534);
				match(PUBLIC);
				((ConstructorModifierContext)_localctx).ret =  Modifier.PUBLIC;
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1536);
				match(PROTECTED);
				((ConstructorModifierContext)_localctx).ret =  Modifier.PROTECTED;
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1538);
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
			setState(1545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1542);
				((ConstructorDeclaratorContext)_localctx).t = typeParameters();
				_localctx.ret.setTypeParameters(((ConstructorDeclaratorContext)_localctx).t.ret);
				}
			}

			setState(1547);
			((ConstructorDeclaratorContext)_localctx).n = simpleTypeName();
			_localctx.ret.setName(((ConstructorDeclaratorContext)_localctx).n.ret);
			setState(1549);
			match(LPAREN);
			setState(1553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1550);
				((ConstructorDeclaratorContext)_localctx).l = formalParameterList();
				_localctx.ret.setParameters(((ConstructorDeclaratorContext)_localctx).l.ret);
				}
			}

			setState(1555);
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
			setState(1557);
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
			((ConstructorBodyContext)_localctx).ret =  new Block();
			setState(1561);
			match(LBRACE);
			setState(1565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1562);
				((ConstructorBodyContext)_localctx).s = explicitConstructorInvocation();
				_localctx.ret.addStatement(((ConstructorBodyContext)_localctx).s.ret);
				}
				break;
			}
			setState(1570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1567);
				((ConstructorBodyContext)_localctx).st = blockStatements();
				_localctx.ret.addStatements(((ConstructorBodyContext)_localctx).st.ret);
				}
			}

			setState(1572);
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

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public Expression ret;
		public List<TypeArgument> targs = null;
		public List<Expression> args = null;
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
			setState(1640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1574);
					((ExplicitConstructorInvocationContext)_localctx).t = typeArguments();
					((ExplicitConstructorInvocationContext)_localctx).targs =  ((ExplicitConstructorInvocationContext)_localctx).t.ret;
					}
				}

				setState(1579);
				match(THIS);
				setState(1580);
				match(LPAREN);
				setState(1584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1581);
					((ExplicitConstructorInvocationContext)_localctx).a = argumentList();
					((ExplicitConstructorInvocationContext)_localctx).args =  ((ExplicitConstructorInvocationContext)_localctx).a.ret;
					}
				}

				setState(1586);
				match(RPAREN);
				setState(1587);
				match(SEMI);
				((ExplicitConstructorInvocationContext)_localctx).ret =  new CallExpression(new ThisLiteral(), _localctx.args, _localctx.targs);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1589);
					((ExplicitConstructorInvocationContext)_localctx).t = typeArguments();
					((ExplicitConstructorInvocationContext)_localctx).targs =  ((ExplicitConstructorInvocationContext)_localctx).t.ret;
					}
				}

				setState(1594);
				match(SUPER);
				setState(1595);
				match(LPAREN);
				setState(1599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1596);
					((ExplicitConstructorInvocationContext)_localctx).a = argumentList();
					((ExplicitConstructorInvocationContext)_localctx).args =  ((ExplicitConstructorInvocationContext)_localctx).a.ret;
					}
				}

				setState(1601);
				match(RPAREN);
				setState(1602);
				match(SEMI);
				((ExplicitConstructorInvocationContext)_localctx).ret =  new CallExpression(new SuperLiteral(), _localctx.args, _localctx.targs);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1604);
				((ExplicitConstructorInvocationContext)_localctx).en = expressionName();
				setState(1605);
				match(DOT);
				setState(1609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1606);
					((ExplicitConstructorInvocationContext)_localctx).t = typeArguments();
					((ExplicitConstructorInvocationContext)_localctx).targs =  ((ExplicitConstructorInvocationContext)_localctx).t.ret;
					}
				}

				setState(1611);
				match(SUPER);
				setState(1612);
				match(LPAREN);
				setState(1616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1613);
					((ExplicitConstructorInvocationContext)_localctx).a = argumentList();
					((ExplicitConstructorInvocationContext)_localctx).args =  ((ExplicitConstructorInvocationContext)_localctx).a.ret;
					}
				}

				setState(1618);
				match(RPAREN);
				setState(1619);
				match(SEMI);
				((ExplicitConstructorInvocationContext)_localctx).ret =  new CallExpression(new SuperLiteral(), _localctx.args, _localctx.targs);
				         ((ExplicitConstructorInvocationContext)_localctx).ret =  new AccessExpression(((ExplicitConstructorInvocationContext)_localctx).en.ret, _localctx.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1622);
				((ExplicitConstructorInvocationContext)_localctx).p = primary();
				setState(1623);
				match(DOT);
				setState(1627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1624);
					((ExplicitConstructorInvocationContext)_localctx).t = typeArguments();
					((ExplicitConstructorInvocationContext)_localctx).targs =  ((ExplicitConstructorInvocationContext)_localctx).t.ret;
					}
				}

				setState(1629);
				match(SUPER);
				setState(1630);
				match(LPAREN);
				setState(1634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1631);
					((ExplicitConstructorInvocationContext)_localctx).a = argumentList();
					((ExplicitConstructorInvocationContext)_localctx).args =  ((ExplicitConstructorInvocationContext)_localctx).a.ret;
					}
				}

				setState(1636);
				match(RPAREN);
				setState(1637);
				match(SEMI);
				((ExplicitConstructorInvocationContext)_localctx).ret =  new CallExpression(new SuperLiteral(), _localctx.args, _localctx.targs);
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
		public List<Modifier> mods = new ArrayList<>();
		public List<ClassInterfaceType> sis = null;
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
			setState(1647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1642);
				((EnumDeclarationContext)_localctx).m = classModifier();
				_localctx.mods.add(((EnumDeclarationContext)_localctx).m.ret);
				}
				}
				setState(1649);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1650);
			match(ENUM);
			setState(1651);
			((EnumDeclarationContext)_localctx).id = match(Identifier);
			setState(1655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1652);
				((EnumDeclarationContext)_localctx).il = superinterfaces();
				((EnumDeclarationContext)_localctx).sis =  ((EnumDeclarationContext)_localctx).il.ret;
				}
			}

			((EnumDeclarationContext)_localctx).ret =  new EnumDeclaration(((EnumDeclarationContext)_localctx).id.getText(), _localctx.mods, _localctx.sis);
			setState(1658);
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
			setState(1660);
			match(LBRACE);
			setState(1662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(1661);
				enumConstantList(_localctx.ret);
				}
			}

			setState(1665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1664);
				match(COMMA);
				}
			}

			setState(1668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1667);
				enumBodyDeclarations(_localctx.ret);
				}
			}

			setState(1670);
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
			setState(1672);
			enumConstant(_localctx.ret);
			setState(1677);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1673);
					match(COMMA);
					setState(1674);
					enumConstant(_localctx.ret);
					}
					} 
				}
				setState(1679);
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
		public List<Expression> args = null;
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
			setState(1685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1680);
				((EnumConstantContext)_localctx).an = enumConstantModifier();
				_localctx.ans.add(((EnumConstantContext)_localctx).an.ret);
				}
				}
				setState(1687);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1688);
			((EnumConstantContext)_localctx).id = match(Identifier);
			setState(1696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1689);
				match(LPAREN);
				setState(1693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1690);
					((EnumConstantContext)_localctx).a = argumentList();
					((EnumConstantContext)_localctx).args =  ((EnumConstantContext)_localctx).a.ret;
					}
				}

				setState(1695);
				match(RPAREN);
				}
			}


			            ((EnumConstantContext)_localctx).cons =  new EnumConstant(((EnumConstantContext)_localctx).id.getText(), _localctx.ans, _localctx.args);
			            _localctx.ret.addConstant(_localctx.cons);
			        
			setState(1700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1699);
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
			setState(1702);
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
			setState(1705);
			match(SEMI);
			setState(1709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(1706);
				classBodyDeclaration(_localctx.ret);
				}
				}
				setState(1711);
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
			setState(1718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1712);
				((InterfaceDeclarationContext)_localctx).n = normalInterfaceDeclaration();
				((InterfaceDeclarationContext)_localctx).ret =  ((InterfaceDeclarationContext)_localctx).n.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1715);
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
		public List<Modifier> mods = new ArrayList<>();
		public List<TypeParameter> tpars = null;
		public List<ClassInterfaceType> eis = null;
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
			setState(1725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1720);
				((NormalInterfaceDeclarationContext)_localctx).m = interfaceModifier();
				_localctx.mods.add(((NormalInterfaceDeclarationContext)_localctx).m.ret);
				}
				}
				setState(1727);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1728);
			match(INTERFACE);
			setState(1729);
			((NormalInterfaceDeclarationContext)_localctx).id = match(Identifier);
			setState(1733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1730);
				((NormalInterfaceDeclarationContext)_localctx).t = typeParameters();
				((NormalInterfaceDeclarationContext)_localctx).tpars =  ((NormalInterfaceDeclarationContext)_localctx).t.ret;
				}
			}

			setState(1738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1735);
				((NormalInterfaceDeclarationContext)_localctx).e = extendsInterfaces();
				((NormalInterfaceDeclarationContext)_localctx).eis =  ((NormalInterfaceDeclarationContext)_localctx).e.ret;
				}
			}

			((NormalInterfaceDeclarationContext)_localctx).ret =  new InterfaceDeclaration(((NormalInterfaceDeclarationContext)_localctx).id.getText(), _localctx.mods, _localctx.eis, _localctx.tpars);
			setState(1741);
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
			setState(1758);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1743);
				((InterfaceModifierContext)_localctx).a = annotation();
				((InterfaceModifierContext)_localctx).ret =  ((InterfaceModifierContext)_localctx).a.ret;
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1746);
				match(PUBLIC);
				((InterfaceModifierContext)_localctx).ret =  Modifier.PUBLIC;
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1748);
				match(PROTECTED);
				((InterfaceModifierContext)_localctx).ret =  Modifier.PROTECTED;
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1750);
				match(PRIVATE);
				((InterfaceModifierContext)_localctx).ret =  Modifier.PRIVATE;
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1752);
				match(ABSTRACT);
				((InterfaceModifierContext)_localctx).ret =  Modifier.ABSTRACT;
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1754);
				match(STATIC);
				((InterfaceModifierContext)_localctx).ret =  Modifier.STATIC;
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1756);
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
			setState(1760);
			match(EXTENDS);
			setState(1761);
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
			setState(1764);
			match(LBRACE);
			setState(1768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(1765);
				interfaceMemberDeclaration(_localctx.ret);
				}
				}
				setState(1770);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1771);
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
			setState(1786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1773);
				((InterfaceMemberDeclarationContext)_localctx).c = constantDeclaration();
				_localctx.ret.addField(((InterfaceMemberDeclarationContext)_localctx).c.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1776);
				((InterfaceMemberDeclarationContext)_localctx).im = interfaceMethodDeclaration();
				_localctx.ret.addMethod(((InterfaceMemberDeclarationContext)_localctx).im.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1779);
				((InterfaceMemberDeclarationContext)_localctx).cl = classDeclaration();
				_localctx.ret.addInnerBody(((InterfaceMemberDeclarationContext)_localctx).cl.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1782);
				((InterfaceMemberDeclarationContext)_localctx).id = interfaceDeclaration();
				_localctx.ret.addInnerInterface(((InterfaceMemberDeclarationContext)_localctx).id.ret);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1785);
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
		public List<Modifier> mods = new ArrayList<>();
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
			setState(1793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << STATIC))) != 0) || _la==AT) {
				{
				{
				setState(1788);
				((ConstantDeclarationContext)_localctx).m = constantModifier();
				_localctx.mods.add(((ConstantDeclarationContext)_localctx).m.ret);
				}
				}
				setState(1795);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1796);
			((ConstantDeclarationContext)_localctx).t = unannType();
			setState(1797);
			((ConstantDeclarationContext)_localctx).l = variableDeclaratorList();
			setState(1798);
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
			setState(1810);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1801);
				((ConstantModifierContext)_localctx).a = annotation();
				((ConstantModifierContext)_localctx).ret =  ((ConstantModifierContext)_localctx).a.ret;
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1804);
				match(PUBLIC);
				((ConstantModifierContext)_localctx).ret =  Modifier.PUBLIC;
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1806);
				match(STATIC);
				((ConstantModifierContext)_localctx).ret =  Modifier.STATIC;
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1808);
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
		public List<Modifier> mods = new ArrayList<>();
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
			setState(1817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1812);
				((InterfaceMethodDeclarationContext)_localctx).m = interfaceMethodModifier();
				_localctx.mods.add(((InterfaceMethodDeclarationContext)_localctx).m.ret);
				}
				}
				setState(1819);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((InterfaceMethodDeclarationContext)_localctx).ret =  new MethodDeclaration(_localctx.mods);
			{
			setState(1821);
			methodHeader(_localctx.ret);
			}
			{
			setState(1822);
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
			setState(1838);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1825);
				((InterfaceMethodModifierContext)_localctx).a = annotation();
				((InterfaceMethodModifierContext)_localctx).ret =  ((InterfaceMethodModifierContext)_localctx).a.ret;
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1828);
				match(PUBLIC);
				((InterfaceMethodModifierContext)_localctx).ret =  Modifier.PUBLIC;
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1830);
				match(ABSTRACT);
				((InterfaceMethodModifierContext)_localctx).ret =  Modifier.ABSTRACT;
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1832);
				match(DEFAULT);
				((InterfaceMethodModifierContext)_localctx).ret =  Modifier.DEFAULT;
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1834);
				match(STATIC);
				((InterfaceMethodModifierContext)_localctx).ret =  Modifier.STATIC;
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(1836);
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
		public List<Modifier> mods = new ArrayList<>();
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
			setState(1845);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1840);
					((AnnotationTypeDeclarationContext)_localctx).m = interfaceModifier();
					_localctx.mods.add(((AnnotationTypeDeclarationContext)_localctx).m.ret);
					}
					} 
				}
				setState(1847);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			}
			setState(1848);
			match(AT);
			setState(1849);
			match(INTERFACE);
			setState(1850);
			((AnnotationTypeDeclarationContext)_localctx).id = match(Identifier);
			((AnnotationTypeDeclarationContext)_localctx).ret =  new AnnotationDeclaration(((AnnotationTypeDeclarationContext)_localctx).id.getText(), _localctx.mods);
			setState(1852);
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
			setState(1854);
			match(LBRACE);
			setState(1858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==Identifier || _la==AT) {
				{
				{
				setState(1855);
				annotationTypeMemberDeclaration(_localctx.ret);
				}
				}
				setState(1860);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1861);
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
			setState(1876);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1863);
				((AnnotationTypeMemberDeclarationContext)_localctx).a = annotationTypeElementDeclaration();
				_localctx.ret.addField(((AnnotationTypeMemberDeclarationContext)_localctx).a.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1866);
				((AnnotationTypeMemberDeclarationContext)_localctx).co = constantDeclaration();
				_localctx.ret.addField(((AnnotationTypeMemberDeclarationContext)_localctx).co.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1869);
				((AnnotationTypeMemberDeclarationContext)_localctx).cl = classDeclaration();
				_localctx.ret.addInnerBody(((AnnotationTypeMemberDeclarationContext)_localctx).cl.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1872);
				((AnnotationTypeMemberDeclarationContext)_localctx).i = interfaceDeclaration();
				_localctx.ret.addInnerInterface(((AnnotationTypeMemberDeclarationContext)_localctx).i.ret);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1875);
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
		public List<Modifier> mods = new ArrayList<>();
		public int dim = 0;
		public Expression expr = null;
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
			setState(1883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT || _la==PUBLIC || _la==AT) {
				{
				{
				setState(1878);
				((AnnotationTypeElementDeclarationContext)_localctx).m = annotationTypeElementModifier();
				_localctx.mods.add(((AnnotationTypeElementDeclarationContext)_localctx).m.ret);
				}
				}
				setState(1885);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1886);
			((AnnotationTypeElementDeclarationContext)_localctx).t = unannType();
			setState(1887);
			((AnnotationTypeElementDeclarationContext)_localctx).id = match(Identifier);
			setState(1888);
			match(LPAREN);
			setState(1889);
			match(RPAREN);
			setState(1893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1890);
				((AnnotationTypeElementDeclarationContext)_localctx).ds = dims();
				((AnnotationTypeElementDeclarationContext)_localctx).dim =  ((AnnotationTypeElementDeclarationContext)_localctx).ds.ret;
				}
			}

			setState(1898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1895);
				((AnnotationTypeElementDeclarationContext)_localctx).dv = defaultValue();
				((AnnotationTypeElementDeclarationContext)_localctx).expr =  ((AnnotationTypeElementDeclarationContext)_localctx).dv.ret;
				}
			}

			setState(1900);
			match(SEMI);

			            if (_localctx.dim > 0) {
			                ((AnnotationTypeElementDeclarationContext)_localctx).ret =  new VariableDeclaration(((AnnotationTypeElementDeclarationContext)_localctx).id.getText(),
			                                               ((AnnotationTypeElementDeclarationContext)_localctx).t.ret.augment(_localctx.dim),
			                                               _localctx.mods,
			                                               _localctx.expr,
			                                               false);
			            } else {
			                ((AnnotationTypeElementDeclarationContext)_localctx).ret =  new VariableDeclaration(((AnnotationTypeElementDeclarationContext)_localctx).id.getText(), ((AnnotationTypeElementDeclarationContext)_localctx).t.ret,
			                                               _localctx.mods, _localctx.expr, false);
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
			setState(1910);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1903);
				((AnnotationTypeElementModifierContext)_localctx).a = annotation();
				((AnnotationTypeElementModifierContext)_localctx).ret =  ((AnnotationTypeElementModifierContext)_localctx).a.ret;
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1906);
				match(PUBLIC);
				((AnnotationTypeElementModifierContext)_localctx).ret =  Modifier.PUBLIC;
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1908);
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
			setState(1912);
			match(DEFAULT);
			setState(1913);
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
			setState(1925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1916);
				((AnnotationContext)_localctx).n = normalAnnotation();
				((AnnotationContext)_localctx).ret =  ((AnnotationContext)_localctx).n.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1919);
				((AnnotationContext)_localctx).m = markerAnnotation();
				((AnnotationContext)_localctx).ret =  ((AnnotationContext)_localctx).m.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1922);
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
			setState(1927);
			match(AT);
			setState(1928);
			((NormalAnnotationContext)_localctx).t = typeName();
			((NormalAnnotationContext)_localctx).ret =  new Annotation(((NormalAnnotationContext)_localctx).t.ret);
			setState(1930);
			match(LPAREN);
			setState(1932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1931);
				elementValuePairList(_localctx.ret);
				}
			}

			setState(1934);
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
			setState(1936);
			elementValuePair(_localctx.ret);
			}
			setState(1941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1937);
				match(COMMA);
				setState(1938);
				elementValuePair(_localctx.ret);
				}
				}
				setState(1943);
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
			setState(1944);
			((ElementValuePairContext)_localctx).id = match(Identifier);
			setState(1945);
			match(ASSIGN);
			setState(1946);
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
			setState(1958);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1949);
				((ElementValueContext)_localctx).c = conditionalExpression();
				((ElementValueContext)_localctx).ret =  ((ElementValueContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1952);
				((ElementValueContext)_localctx).i = elementValueArrayInitializer();
				((ElementValueContext)_localctx).ret =  ((ElementValueContext)_localctx).i.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1955);
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
		public List<Expression> ls = null;
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
			setState(1960);
			match(LBRACE);
			setState(1964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1961);
				((ElementValueArrayInitializerContext)_localctx).l = elementValueList();
				((ElementValueArrayInitializerContext)_localctx).ls =  ((ElementValueArrayInitializerContext)_localctx).l.ret;
				}
			}

			setState(1967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1966);
				match(COMMA);
				}
			}

			setState(1969);
			match(RBRACE);
			((ElementValueArrayInitializerContext)_localctx).ret =  new ArrayInitializer(_localctx.ls);
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
		public List<Expression> ls = new ArrayList<>();
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
			setState(1972);
			((ElementValueListContext)_localctx).v1 = elementValue();
			_localctx.ls.add(((ElementValueListContext)_localctx).v1.ret);
			}
			setState(1981);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1975);
					match(COMMA);
					setState(1976);
					((ElementValueListContext)_localctx).v = elementValue();
					_localctx.ls.add(((ElementValueListContext)_localctx).v.ret);
					}
					} 
				}
				setState(1983);
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
			setState(1986);
			match(AT);
			setState(1987);
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
			setState(1990);
			match(AT);
			setState(1991);
			((SingleElementAnnotationContext)_localctx).t = typeName();
			setState(1992);
			match(LPAREN);
			setState(1993);
			((SingleElementAnnotationContext)_localctx).v = elementValue();
			setState(1994);
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
		public List<Expression> ls = null;
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
			setState(1997);
			match(LBRACE);
			setState(2001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1998);
				((ArrayInitializerContext)_localctx).l = variableInitializerList();
				((ArrayInitializerContext)_localctx).ls =  ((ArrayInitializerContext)_localctx).l.ret;
				}
			}

			setState(2004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2003);
				match(COMMA);
				}
			}

			setState(2006);
			match(RBRACE);
			((ArrayInitializerContext)_localctx).ret =  new ArrayInitializer(_localctx.ls);
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
		public List<Expression> ls = new ArrayList<>();
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
			setState(2009);
			((VariableInitializerListContext)_localctx).i = variableInitializer();
			_localctx.ls.add(((VariableInitializerListContext)_localctx).i.ret);
			}
			setState(2018);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2012);
					match(COMMA);
					setState(2013);
					((VariableInitializerListContext)_localctx).v = variableInitializer();
					_localctx.ls.add(((VariableInitializerListContext)_localctx).v.ret);
					}
					} 
				}
				setState(2020);
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
			((BlockContext)_localctx).ret =  new Block();
			setState(2024);
			match(LBRACE);
			setState(2028);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(2025);
				((BlockContext)_localctx).s = blockStatements();
				_localctx.ret.addStatements(((BlockContext)_localctx).s.ret);
				}
			}

			setState(2030);
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

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<Statement> ret;
		public List<Statement> ls = new ArrayList<>();
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
			setState(2032);
			((BlockStatementsContext)_localctx).s = blockStatement();
			_localctx.ls.add(((BlockStatementsContext)_localctx).s.ret);
			}
			setState(2040);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				{
				setState(2035);
				((BlockStatementsContext)_localctx).b = blockStatement();
				_localctx.ls.add(((BlockStatementsContext)_localctx).b.ret);
				}
				}
				setState(2042);
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
			setState(2054);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2045);
				((BlockStatementContext)_localctx).d = localVariableDeclarationStatement();
				((BlockStatementContext)_localctx).ret =  ((BlockStatementContext)_localctx).d.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2048);
				((BlockStatementContext)_localctx).c = classDeclaration();
				((BlockStatementContext)_localctx).ret =  ((BlockStatementContext)_localctx).c.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2051);
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
			setState(2056);
			((LocalVariableDeclarationStatementContext)_localctx).d = localVariableDeclaration();
			setState(2057);
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
		public List<Modifier> mods = new ArrayList<>();
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
			setState(2065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(2060);
				((LocalVariableDeclarationContext)_localctx).m = variableModifier();
				_localctx.mods.add(((LocalVariableDeclarationContext)_localctx).m.ret);
				}
				}
				setState(2067);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2068);
			((LocalVariableDeclarationContext)_localctx).t = unannType();
			setState(2069);
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
			setState(2090);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2072);
				((StatementContext)_localctx).a = statementWithoutTrailingSubstatement();
				((StatementContext)_localctx).ret =  ((StatementContext)_localctx).a.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2075);
				((StatementContext)_localctx).b = labeledStatement();
				((StatementContext)_localctx).ret =  ((StatementContext)_localctx).b.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2078);
				((StatementContext)_localctx).c = ifThenStatement();
				((StatementContext)_localctx).ret =  ((StatementContext)_localctx).c.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2081);
				((StatementContext)_localctx).d = ifThenElseStatement();
				((StatementContext)_localctx).ret =  ((StatementContext)_localctx).d.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2084);
				((StatementContext)_localctx).e = whileStatement();
				((StatementContext)_localctx).ret =  ((StatementContext)_localctx).e.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2087);
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
			setState(2107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2092);
				((StatementNoShortIfContext)_localctx).a = statementWithoutTrailingSubstatement();
				((StatementNoShortIfContext)_localctx).ret =  ((StatementNoShortIfContext)_localctx).a.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2095);
				((StatementNoShortIfContext)_localctx).b = labeledStatementNoShortIf();
				((StatementNoShortIfContext)_localctx).ret =  ((StatementNoShortIfContext)_localctx).b.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2098);
				((StatementNoShortIfContext)_localctx).c = ifThenElseStatementNoShortIf();
				((StatementNoShortIfContext)_localctx).ret =  ((StatementNoShortIfContext)_localctx).c.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2101);
				((StatementNoShortIfContext)_localctx).d = whileStatementNoShortIf();
				((StatementNoShortIfContext)_localctx).ret =  ((StatementNoShortIfContext)_localctx).d.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2104);
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
			setState(2143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2109);
				((StatementWithoutTrailingSubstatementContext)_localctx).a = block();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).a.ret;
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(2112);
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
				setState(2113);
				((StatementWithoutTrailingSubstatementContext)_localctx).c = expressionStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).c.ret;
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(2116);
				((StatementWithoutTrailingSubstatementContext)_localctx).d = assertStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).d.ret;
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(2119);
				((StatementWithoutTrailingSubstatementContext)_localctx).e = switchStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).e.ret;
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(2122);
				((StatementWithoutTrailingSubstatementContext)_localctx).f = doStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).f.ret;
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(2125);
				((StatementWithoutTrailingSubstatementContext)_localctx).g = breakStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).g.ret;
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2128);
				((StatementWithoutTrailingSubstatementContext)_localctx).h = continueStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).h.ret;
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(2131);
				((StatementWithoutTrailingSubstatementContext)_localctx).i = returnStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).i.ret;
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
				setState(2134);
				((StatementWithoutTrailingSubstatementContext)_localctx).j = synchronizedStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).j.ret;
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 11);
				{
				setState(2137);
				((StatementWithoutTrailingSubstatementContext)_localctx).k = throwStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).k.ret;
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 12);
				{
				setState(2140);
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
			setState(2145);
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
			setState(2147);
			((LabeledStatementContext)_localctx).id = match(Identifier);
			setState(2148);
			match(COLON);
			setState(2149);
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
			setState(2152);
			((LabeledStatementNoShortIfContext)_localctx).id = match(Identifier);
			setState(2153);
			match(COLON);
			setState(2154);
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
			setState(2157);
			((ExpressionStatementContext)_localctx).s = statementExpression();
			setState(2158);
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
			setState(2182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2161);
				((StatementExpressionContext)_localctx).a = assignment();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).a.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2164);
				((StatementExpressionContext)_localctx).b = preIncrementExpression();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).b.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2167);
				((StatementExpressionContext)_localctx).c = preDecrementExpression();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).c.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2170);
				((StatementExpressionContext)_localctx).d = postIncrementExpression();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).d.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2173);
				((StatementExpressionContext)_localctx).f = postDecrementExpression();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).f.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2176);
				((StatementExpressionContext)_localctx).g = methodInvocation();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).g.ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2179);
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
			setState(2184);
			match(IF);
			setState(2185);
			match(LPAREN);
			setState(2186);
			((IfThenStatementContext)_localctx).e = expression();
			setState(2187);
			match(RPAREN);
			setState(2188);
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
			setState(2191);
			match(IF);
			setState(2192);
			match(LPAREN);
			setState(2193);
			((IfThenElseStatementContext)_localctx).e = expression();
			setState(2194);
			match(RPAREN);
			setState(2195);
			((IfThenElseStatementContext)_localctx).t = statementNoShortIf();
			setState(2196);
			match(ELSE);
			setState(2197);
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
			setState(2200);
			match(IF);
			setState(2201);
			match(LPAREN);
			setState(2202);
			((IfThenElseStatementNoShortIfContext)_localctx).e = expression();
			setState(2203);
			match(RPAREN);
			setState(2204);
			((IfThenElseStatementNoShortIfContext)_localctx).t = statementNoShortIf();
			setState(2205);
			match(ELSE);
			setState(2206);
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
			setState(2221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2209);
				match(ASSERT);
				setState(2210);
				((AssertStatementContext)_localctx).e = expression();
				setState(2211);
				match(SEMI);
				((AssertStatementContext)_localctx).ret =  new AssertStatement(((AssertStatementContext)_localctx).e.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2214);
				match(ASSERT);
				setState(2215);
				((AssertStatementContext)_localctx).e = expression();
				setState(2216);
				match(COLON);
				setState(2217);
				((AssertStatementContext)_localctx).msg = expression();
				setState(2218);
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
			setState(2223);
			match(SWITCH);
			setState(2224);
			match(LPAREN);
			setState(2225);
			((SwitchStatementContext)_localctx).e = expression();
			setState(2226);
			match(RPAREN);
			setState(2227);
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
		public List<CaseBlock> blocks = new ArrayList<>();
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
			setState(2230);
			match(LBRACE);
			setState(2236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2231);
					((SwitchBlockContext)_localctx).m = switchBlockStatementGroup();
					_localctx.blocks.add(((SwitchBlockContext)_localctx).m.ret);
					}
					} 
				}
				setState(2238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			}
			setState(2244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(2239);
				((SwitchBlockContext)_localctx).l = switchLabel();
				_localctx.blocks.add(new CaseBlock(((SwitchBlockContext)_localctx).l.ret));
				}
				}
				setState(2246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2247);
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
			setState(2250);
			((SwitchBlockStatementGroupContext)_localctx).l = switchLabels();
			setState(2251);
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
		public List<Expression> lbls = new ArrayList<>();
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
			setState(2254);
			((SwitchLabelsContext)_localctx).s = switchLabel();
			_localctx.lbls.add(((SwitchLabelsContext)_localctx).s.ret);
			}
			setState(2262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(2257);
				((SwitchLabelsContext)_localctx).l = switchLabel();
				_localctx.lbls.add(((SwitchLabelsContext)_localctx).l.ret);
				}
				}
				setState(2264);
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
			setState(2280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2267);
				match(CASE);
				setState(2268);
				((SwitchLabelContext)_localctx).c = constantExpression();
				setState(2269);
				match(COLON);
				((SwitchLabelContext)_localctx).ret =  ((SwitchLabelContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2272);
				match(CASE);
				setState(2273);
				((SwitchLabelContext)_localctx).en = enumConstantName();
				setState(2274);
				match(COLON);
				((SwitchLabelContext)_localctx).ret =  new IdentifierExpression(((SwitchLabelContext)_localctx).en.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2277);
				match(DEFAULT);
				setState(2278);
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
			setState(2282);
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
			setState(2285);
			match(WHILE);
			setState(2286);
			match(LPAREN);
			setState(2287);
			((WhileStatementContext)_localctx).c = expression();
			setState(2288);
			match(RPAREN);
			setState(2289);
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
			setState(2292);
			match(WHILE);
			setState(2293);
			match(LPAREN);
			setState(2294);
			((WhileStatementNoShortIfContext)_localctx).c = expression();
			setState(2295);
			match(RPAREN);
			setState(2296);
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
			setState(2299);
			match(DO);
			setState(2300);
			((DoStatementContext)_localctx).s = statement();
			setState(2301);
			match(WHILE);
			setState(2302);
			match(LPAREN);
			setState(2303);
			((DoStatementContext)_localctx).c = expression();
			setState(2304);
			match(RPAREN);
			setState(2305);
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
			setState(2314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2308);
				((ForStatementContext)_localctx).b = basicForStatement();
				((ForStatementContext)_localctx).ret =  ((ForStatementContext)_localctx).b.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2311);
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
			setState(2322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2316);
				((ForStatementNoShortIfContext)_localctx).b = basicForStatementNoShortIf();
				((ForStatementNoShortIfContext)_localctx).ret =  ((ForStatementNoShortIfContext)_localctx).b.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2319);
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
		public List<Statement> forIn;
		public List<Statement> forUp;
		public Expression expr;
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
			setState(2324);
			match(FOR);
			setState(2325);
			match(LPAREN);
			setState(2329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(2326);
				((BasicForStatementContext)_localctx).i = forInit();
				((BasicForStatementContext)_localctx).forIn =  ((BasicForStatementContext)_localctx).i.ret;
				}
			}

			setState(2331);
			match(SEMI);
			setState(2335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2332);
				((BasicForStatementContext)_localctx).e = expression();
				((BasicForStatementContext)_localctx).expr =  ((BasicForStatementContext)_localctx).e.ret;
				}
			}

			setState(2337);
			match(SEMI);
			setState(2341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(2338);
				((BasicForStatementContext)_localctx).u = forUpdate();
				((BasicForStatementContext)_localctx).forUp =  ((BasicForStatementContext)_localctx).u.ret;
				}
			}

			setState(2343);
			match(RPAREN);
			setState(2344);
			((BasicForStatementContext)_localctx).s = statement();
			((BasicForStatementContext)_localctx).ret =  new ForStatement(_localctx.forIn, _localctx.expr, _localctx.forUp, new Block(((BasicForStatementContext)_localctx).s.ret));
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
		public List<Statement> forIn;
		public List<Statement> forUp;
		public Expression expr;
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
			setState(2347);
			match(FOR);
			setState(2348);
			match(LPAREN);
			setState(2352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(2349);
				((BasicForStatementNoShortIfContext)_localctx).i = forInit();
				((BasicForStatementNoShortIfContext)_localctx).forIn =  ((BasicForStatementNoShortIfContext)_localctx).i.ret;
				}
			}

			setState(2354);
			match(SEMI);
			setState(2358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2355);
				((BasicForStatementNoShortIfContext)_localctx).e = expression();
				((BasicForStatementNoShortIfContext)_localctx).expr =  ((BasicForStatementNoShortIfContext)_localctx).e.ret;
				}
			}

			setState(2360);
			match(SEMI);
			setState(2364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(2361);
				((BasicForStatementNoShortIfContext)_localctx).u = forUpdate();
				((BasicForStatementNoShortIfContext)_localctx).forUp =  ((BasicForStatementNoShortIfContext)_localctx).u.ret;
				}
			}

			setState(2366);
			match(RPAREN);
			setState(2367);
			((BasicForStatementNoShortIfContext)_localctx).s = statementNoShortIf();
			((BasicForStatementNoShortIfContext)_localctx).ret =  new ForStatement(_localctx.forIn, _localctx.expr, _localctx.forUp, new Block(((BasicForStatementNoShortIfContext)_localctx).s.ret));
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
			setState(2376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2370);
				((ForInitContext)_localctx).ls = statementExpressionList();
				((ForInitContext)_localctx).ret =  ((ForInitContext)_localctx).ls.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2373);
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
			setState(2378);
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
		public List<Statement> ups = new ArrayList<>();
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
			setState(2381);
			((StatementExpressionListContext)_localctx).s = statementExpression();
			_localctx.ups.add(((StatementExpressionListContext)_localctx).s.ret);
			}
			setState(2390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2384);
				match(COMMA);
				setState(2385);
				((StatementExpressionListContext)_localctx).e = statementExpression();
				_localctx.ups.add(((StatementExpressionListContext)_localctx).e.ret);
				}
				}
				setState(2392);
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
			setState(2395);
			match(FOR);
			setState(2396);
			match(LPAREN);
			setState(2402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(2397);
				((EnhancedForStatementContext)_localctx).m = variableModifier();
				_localctx.mods.add(((EnhancedForStatementContext)_localctx).m.ret);
				}
				}
				setState(2404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2405);
			((EnhancedForStatementContext)_localctx).t = unannType();
			setState(2406);
			((EnhancedForStatementContext)_localctx).n = variableDeclaratorId();
			setState(2407);
			match(COLON);
			setState(2408);
			((EnhancedForStatementContext)_localctx).e = expression();
			setState(2409);
			match(RPAREN);
			setState(2410);
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
			setState(2413);
			match(FOR);
			setState(2414);
			match(LPAREN);
			setState(2420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(2415);
				((EnhancedForStatementNoShortIfContext)_localctx).m = variableModifier();
				_localctx.mods.add(((EnhancedForStatementNoShortIfContext)_localctx).m.ret);
				}
				}
				setState(2422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2423);
			((EnhancedForStatementNoShortIfContext)_localctx).t = unannType();
			setState(2424);
			((EnhancedForStatementNoShortIfContext)_localctx).n = variableDeclaratorId();
			setState(2425);
			match(COLON);
			setState(2426);
			((EnhancedForStatementNoShortIfContext)_localctx).e = expression();
			setState(2427);
			match(RPAREN);
			setState(2428);
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
		public String name = null;
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
			setState(2431);
			match(BREAK);
			setState(2434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(2432);
				((BreakStatementContext)_localctx).id = match(Identifier);
				((BreakStatementContext)_localctx).name =  ((BreakStatementContext)_localctx).id.getText();
				}
			}

			setState(2436);
			match(SEMI);
			((BreakStatementContext)_localctx).ret =  new JumpStatement(true, _localctx.name);
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
		public String name = null;
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
			setState(2439);
			match(CONTINUE);
			setState(2442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(2440);
				((ContinueStatementContext)_localctx).id = match(Identifier);
				((ContinueStatementContext)_localctx).name =  ((ContinueStatementContext)_localctx).id.getText();
				}
			}

			setState(2444);
			match(SEMI);
			((ContinueStatementContext)_localctx).ret =  new JumpStatement(false, _localctx.name);
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
		public Expression expr = null;
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
			setState(2447);
			match(RETURN);
			setState(2451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2448);
				((ReturnStatementContext)_localctx).e = expression();
				((ReturnStatementContext)_localctx).expr =  ((ReturnStatementContext)_localctx).e.ret;
				}
			}

			setState(2453);
			match(SEMI);
			((ReturnStatementContext)_localctx).ret =  new ReturnStatement(_localctx.expr);
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
			setState(2456);
			match(THROW);
			setState(2457);
			((ThrowStatementContext)_localctx).e = expression();
			setState(2458);
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
			setState(2461);
			match(SYNCHRONIZED);
			setState(2462);
			match(LPAREN);
			setState(2463);
			((SynchronizedStatementContext)_localctx).e = expression();
			setState(2464);
			match(RPAREN);
			setState(2465);
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
		public List<CatchBlock> ls = null;
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
			setState(2486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2468);
				match(TRY);
				setState(2469);
				((TryStatementContext)_localctx).t = block();
				setState(2470);
				((TryStatementContext)_localctx).cs = catches();
				((TryStatementContext)_localctx).ret =  new TryCatchBlock(((TryStatementContext)_localctx).t.ret, ((TryStatementContext)_localctx).cs.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2473);
				match(TRY);
				setState(2474);
				((TryStatementContext)_localctx).t = block();
				setState(2478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(2475);
					((TryStatementContext)_localctx).cs = catches();
					((TryStatementContext)_localctx).ls =  ((TryStatementContext)_localctx).cs.ret;
					}
				}

				setState(2480);
				((TryStatementContext)_localctx).f = finally_();
				((TryStatementContext)_localctx).ret =  new TryCatchBlock(((TryStatementContext)_localctx).t.ret, _localctx.ls, ((TryStatementContext)_localctx).f.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2483);
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
		public List<CatchBlock> ls = new ArrayList<>();
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
			setState(2488);
			((CatchesContext)_localctx).f = catchClause();
			_localctx.ls.add(((CatchesContext)_localctx).f.ret);
			setState(2495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(2490);
				((CatchesContext)_localctx).c = catchClause();
				_localctx.ls.add(((CatchesContext)_localctx).c.ret);
				}
				}
				setState(2497);
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
			setState(2501);
			match(CATCH);
			setState(2502);
			match(LPAREN);
			setState(2503);
			catchFormalParameter(_localctx.ret);
			setState(2504);
			match(RPAREN);
			setState(2505);
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
		public List<Modifier> mods = new ArrayList<>();
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
			setState(2513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(2508);
				((CatchFormalParameterContext)_localctx).m = variableModifier();
				_localctx.mods.add(((CatchFormalParameterContext)_localctx).m.ret);
				}
				}
				setState(2515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2516);
			catchType(_localctx.ret);
			setState(2517);
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
			setState(2520);
			((CatchTypeContext)_localctx).u = unannClassType();
			_localctx.ret.addExceptionType(((CatchTypeContext)_localctx).u.ret);
			}
			setState(2529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(2523);
				match(BITOR);
				setState(2524);
				((CatchTypeContext)_localctx).c = classType();
				_localctx.ret.addExceptionType(((CatchTypeContext)_localctx).c.ret);
				}
				}
				setState(2531);
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
			setState(2532);
			match(FINALLY);
			setState(2533);
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
		public List<CatchBlock> ls = null;
		public Block fin = null;
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
			setState(2536);
			match(TRY);
			setState(2537);
			((TryWithResourcesStatementContext)_localctx).r = resourceSpecification();
			setState(2538);
			((TryWithResourcesStatementContext)_localctx).b = block();
			setState(2542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(2539);
				((TryWithResourcesStatementContext)_localctx).c = catches();
				((TryWithResourcesStatementContext)_localctx).ls =  ((TryWithResourcesStatementContext)_localctx).c.ret;
				}
			}

			setState(2547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(2544);
				((TryWithResourcesStatementContext)_localctx).f = finally_();
				((TryWithResourcesStatementContext)_localctx).fin =  ((TryWithResourcesStatementContext)_localctx).f.ret;
				}
			}

			((TryWithResourcesStatementContext)_localctx).ret =  new TryCatchBlock(((TryWithResourcesStatementContext)_localctx).r.ret, ((TryWithResourcesStatementContext)_localctx).b.ret, _localctx.ls, _localctx.fin);
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
			((ResourceSpecificationContext)_localctx).ret =  new ArrayList<>();
			setState(2552);
			match(LPAREN);
			setState(2557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(2553);
				((ResourceSpecificationContext)_localctx).l = resourceList();
				setState(2554);
				match(SEMI);
				((ResourceSpecificationContext)_localctx).ret =  ((ResourceSpecificationContext)_localctx).l.ret;
				}
			}

			setState(2559);
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

	public static class ResourceListContext extends ParserRuleContext {
		public List<VariableDeclaration> ret;
		public List<VariableDeclaration> vars = new ArrayList<>();
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
			setState(2561);
			((ResourceListContext)_localctx).r = resource();
			_localctx.vars.add(((ResourceListContext)_localctx).r.ret);
			setState(2569);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2563);
					match(SEMI);
					setState(2564);
					((ResourceListContext)_localctx).re = resource();
					_localctx.vars.add(((ResourceListContext)_localctx).re.ret);
					}
					} 
				}
				setState(2571);
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
		public List<Modifier> mods = new ArrayList<>();
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
			setState(2579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(2574);
				((ResourceContext)_localctx).m = variableModifier();
				_localctx.mods.add(((ResourceContext)_localctx).m.ret);
				}
				}
				setState(2581);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2582);
			((ResourceContext)_localctx).t = unannType();
			setState(2583);
			((ResourceContext)_localctx).n = variableDeclaratorId();
			setState(2584);
			match(ASSIGN);
			setState(2585);
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
			setState(2594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(2588);
				((PrimaryContext)_localctx).pno = primaryNoNewArray_lfno_primary();
				((PrimaryContext)_localctx).ret =  ((PrimaryContext)_localctx).pno.ret;
				}
				break;
			case 2:
				{
				setState(2591);
				((PrimaryContext)_localctx).a = arrayCreationExpression();
				((PrimaryContext)_localctx).ret =  ((PrimaryContext)_localctx).a.ret;
				}
				break;
			}
			setState(2601);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2596);
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
				setState(2603);
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
			setState(2632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2604);
				((PrimaryNoNewArrayContext)_localctx).a1 = literal();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a1.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2607);
				((PrimaryNoNewArrayContext)_localctx).a2 = primaryNoNewArray_typeAccess();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a2.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2610);
				match(THIS);
				((PrimaryNoNewArrayContext)_localctx).ret =  new ThisLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2612);
				match(LPAREN);
				setState(2613);
				((PrimaryNoNewArrayContext)_localctx).p = expression();
				setState(2614);
				match(RPAREN);
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).p.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2617);
				((PrimaryNoNewArrayContext)_localctx).a7 = classInstanceCreationExpression();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a7.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2620);
				((PrimaryNoNewArrayContext)_localctx).a8 = fieldAccess();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a8.ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2623);
				((PrimaryNoNewArrayContext)_localctx).a9 = arrayAccess();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a9.ret;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2626);
				((PrimaryNoNewArrayContext)_localctx).a10 = methodInvocation();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a10.ret;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2629);
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
			setState(2656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2634);
				((PrimaryNoNewArray_typeAccessContext)_localctx).a2 = typeName();
				setState(2640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2635);
					match(LBRACK);
					setState(2636);
					match(RBRACK);
					++_localctx.cnt;
					}
					}
					setState(2642);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2643);
				match(DOT);
				setState(2644);
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
				setState(2647);
				match(VOID);
				setState(2648);
				match(DOT);
				setState(2649);
				match(CLASS);
				((PrimaryNoNewArray_typeAccessContext)_localctx).ret =  new AccessExpression(new VoidLiteral(), new ClassLiteral());
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2651);
				((PrimaryNoNewArray_typeAccessContext)_localctx).a5 = typeName();
				setState(2652);
				match(DOT);
				setState(2653);
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
			setState(2685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2660);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a1 = literal();
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a1.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2663);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a2 = primaryNoNewArray_typeAccess();
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a2.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2666);
				match(THIS);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  new ThisLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2668);
				match(LPAREN);
				setState(2669);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).p = expression();
				setState(2670);
				match(RPAREN);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).p.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2673);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a5 = classInstanceCreationExpression();
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a5.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2676);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a6 = fieldAccess();
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a6.ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2679);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a7 = methodInvocation();
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a7.ret;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2682);
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
			setState(2702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2687);
				((PrimaryNoNewArray_lf_primaryContext)_localctx).a1 = classInstanceCreationExpression_lf_primary();
				((PrimaryNoNewArray_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primaryContext)_localctx).a1.ret;
				                                                         ((PrimaryNoNewArray_lf_primaryContext)_localctx).isAccess =  true;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2690);
				((PrimaryNoNewArray_lf_primaryContext)_localctx).a2 = fieldAccess_lf_primary();
				((PrimaryNoNewArray_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primaryContext)_localctx).a2.ret; ((PrimaryNoNewArray_lf_primaryContext)_localctx).isAccess =  true;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2693);
				((PrimaryNoNewArray_lf_primaryContext)_localctx).a3 = arrayAccess_lf_primary();
				((PrimaryNoNewArray_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primaryContext)_localctx).a3.ret; ((PrimaryNoNewArray_lf_primaryContext)_localctx).isAccess =  ((PrimaryNoNewArray_lf_primaryContext)_localctx).a3.isAccess;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2696);
				((PrimaryNoNewArray_lf_primaryContext)_localctx).a4 = methodInvocation_lf_primary();
				((PrimaryNoNewArray_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primaryContext)_localctx).a4.ret; ((PrimaryNoNewArray_lf_primaryContext)_localctx).isAccess =  true;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2699);
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
			setState(2718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2706);
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a1 = classInstanceCreationExpression_lf_primary();
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a1.ret;
				                                                         ((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).isAccess =  true;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2709);
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a2 = fieldAccess_lf_primary();
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a2.ret; ((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).isAccess =  true;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2712);
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a3 = methodInvocation_lf_primary();
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a3.ret; ((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).isAccess =  true;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2715);
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
			setState(2761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2720);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a1 = literal();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a1.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2723);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a2 = primaryNoNewArray_typeAccess();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a2.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2726);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a3 = unannPrimitiveType();
				setState(2732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2727);
					match(LBRACK);
					setState(2728);
					match(RBRACK);
					++_localctx.cnt;
					}
					}
					setState(2734);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2735);
				match(DOT);
				setState(2736);
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
				setState(2739);
				match(THIS);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  new ThisLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2741);
				match(LPAREN);
				setState(2742);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).p = expression();
				setState(2743);
				match(RPAREN);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).p.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2746);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a7 = classInstanceCreationExpression_lfno_primary();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a7.ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2749);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a8 = fieldAccess_lfno_primary();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a8.ret;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2752);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a9 = arrayAccess_lfno_primary();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a9.ret;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2755);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a10 = methodInvocation_lfno_primary();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a10.ret;
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2758);
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
			setState(2803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2765);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a1 = literal();
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a1.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2768);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a2 = primaryNoNewArray_typeAccess();
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a2.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2771);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a3 = unannPrimitiveType();
				setState(2777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2772);
					match(LBRACK);
					setState(2773);
					match(RBRACK);
					++_localctx.cnt;
					}
					}
					setState(2779);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2780);
				match(DOT);
				setState(2781);
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
				setState(2784);
				match(THIS);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  new ThisLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2786);
				match(LPAREN);
				setState(2787);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).p = expression();
				setState(2788);
				match(RPAREN);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).p.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2791);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a7 = classInstanceCreationExpression_lfno_primary();
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a7.ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2794);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a8 = fieldAccess_lfno_primary();
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a8.ret;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2797);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a9 = methodInvocation_lfno_primary();
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a9.ret;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2800);
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
		public List<TypeArgument> targs = null;
		public List<TypeArgument> targsd = null;
		public List<Expression> args = null;
		public TypeArgumentsContext t;
		public AnnotationContext a;
		public Token id;
		public AnnotationContext a2;
		public Token id2;
		public TypeArgumentsOrDiamondContext ta;
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
			setState(2919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2805);
				match(NEW);
				setState(2809);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2806);
					((ClassInstanceCreationExpressionContext)_localctx).t = typeArguments();
					((ClassInstanceCreationExpressionContext)_localctx).targs =  ((ClassInstanceCreationExpressionContext)_localctx).t.ret;
					}
				}

				setState(2816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2811);
					((ClassInstanceCreationExpressionContext)_localctx).a = annotation();
					_localctx.ans.add(((ClassInstanceCreationExpressionContext)_localctx).a.ret);
					}
					}
					setState(2818);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2819);
				((ClassInstanceCreationExpressionContext)_localctx).id = match(Identifier);

				            ((ClassInstanceCreationExpressionContext)_localctx).methodExpr =  new IdentifierExpression(((ClassInstanceCreationExpressionContext)_localctx).id.getText(), _localctx.ans);
				        
				setState(2834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2821);
					match(DOT);
					setState(2827);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2822);
						((ClassInstanceCreationExpressionContext)_localctx).a2 = annotation();
						_localctx.ans2.add(((ClassInstanceCreationExpressionContext)_localctx).a2.ret);
						}
						}
						setState(2829);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2830);
					((ClassInstanceCreationExpressionContext)_localctx).id2 = match(Identifier);

					                ((ClassInstanceCreationExpressionContext)_localctx).methodExpr =  new AccessExpression(_localctx.methodExpr,
					                                                   new IdentifierExpression(((ClassInstanceCreationExpressionContext)_localctx).id2.getText(),
					                                                                            _localctx.ans2));
					                _localctx.ans2.clear();
					            
					}
					}
					setState(2836);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2837);
					((ClassInstanceCreationExpressionContext)_localctx).ta = typeArgumentsOrDiamond();
					((ClassInstanceCreationExpressionContext)_localctx).targsd =  ((ClassInstanceCreationExpressionContext)_localctx).ta.ret;
					}
				}

				setState(2842);
				match(LPAREN);
				setState(2846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2843);
					((ClassInstanceCreationExpressionContext)_localctx).l = argumentList();
					((ClassInstanceCreationExpressionContext)_localctx).args =  ((ClassInstanceCreationExpressionContext)_localctx).l.ret;
					}
				}

				setState(2848);
				match(RPAREN);

				            ((ClassInstanceCreationExpressionContext)_localctx).inst =  new InstantiationExpression(_localctx.targs, _localctx.methodExpr,
				                                                _localctx.targsd, _localctx.args);
				            ((ClassInstanceCreationExpressionContext)_localctx).anon =  _localctx.inst.getAnonymousClass();
				            ((ClassInstanceCreationExpressionContext)_localctx).ret =  _localctx.inst;
				        
				setState(2851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2850);
					classBody(_localctx.anon);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2853);
				((ClassInstanceCreationExpressionContext)_localctx).name = expressionName();
				setState(2854);
				match(DOT);
				setState(2855);
				match(NEW);
				setState(2859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2856);
					((ClassInstanceCreationExpressionContext)_localctx).t = typeArguments();
					((ClassInstanceCreationExpressionContext)_localctx).targs =  ((ClassInstanceCreationExpressionContext)_localctx).t.ret;
					}
				}

				setState(2866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2861);
					((ClassInstanceCreationExpressionContext)_localctx).a = annotation();
					_localctx.ans.add(((ClassInstanceCreationExpressionContext)_localctx).a.ret);
					}
					}
					setState(2868);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2869);
				((ClassInstanceCreationExpressionContext)_localctx).id = match(Identifier);
				setState(2873);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2870);
					((ClassInstanceCreationExpressionContext)_localctx).ta = typeArgumentsOrDiamond();
					((ClassInstanceCreationExpressionContext)_localctx).targsd =  ((ClassInstanceCreationExpressionContext)_localctx).ta.ret;
					}
				}

				setState(2875);
				match(LPAREN);
				setState(2879);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2876);
					((ClassInstanceCreationExpressionContext)_localctx).l = argumentList();
					((ClassInstanceCreationExpressionContext)_localctx).args =  ((ClassInstanceCreationExpressionContext)_localctx).l.ret;
					}
				}

				setState(2881);
				match(RPAREN);

				            ((ClassInstanceCreationExpressionContext)_localctx).inst =  new InstantiationExpression(_localctx.targs, _localctx.ans, ((ClassInstanceCreationExpressionContext)_localctx).id.getText(),
				                                                _localctx.targsd, _localctx.args);
				            ((ClassInstanceCreationExpressionContext)_localctx).anon =  _localctx.inst.getAnonymousClass();
				            ((ClassInstanceCreationExpressionContext)_localctx).ret =  new AccessExpression(((ClassInstanceCreationExpressionContext)_localctx).name.ret, _localctx.inst);
				        
				setState(2884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2883);
					classBody(_localctx.anon);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2886);
				((ClassInstanceCreationExpressionContext)_localctx).p = primary();
				setState(2887);
				match(DOT);
				setState(2888);
				match(NEW);
				setState(2892);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2889);
					((ClassInstanceCreationExpressionContext)_localctx).t = typeArguments();
					((ClassInstanceCreationExpressionContext)_localctx).targs =  ((ClassInstanceCreationExpressionContext)_localctx).t.ret;
					}
				}

				setState(2899);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2894);
					((ClassInstanceCreationExpressionContext)_localctx).a = annotation();
					_localctx.ans.add(((ClassInstanceCreationExpressionContext)_localctx).a.ret);
					}
					}
					setState(2901);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2902);
				((ClassInstanceCreationExpressionContext)_localctx).id = match(Identifier);
				setState(2906);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2903);
					((ClassInstanceCreationExpressionContext)_localctx).ta = typeArgumentsOrDiamond();
					((ClassInstanceCreationExpressionContext)_localctx).targsd =  ((ClassInstanceCreationExpressionContext)_localctx).ta.ret;
					}
				}

				setState(2908);
				match(LPAREN);
				setState(2912);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2909);
					((ClassInstanceCreationExpressionContext)_localctx).l = argumentList();
					((ClassInstanceCreationExpressionContext)_localctx).args =  ((ClassInstanceCreationExpressionContext)_localctx).l.ret;
					}
				}

				setState(2914);
				match(RPAREN);

				            ((ClassInstanceCreationExpressionContext)_localctx).inst =  new InstantiationExpression(_localctx.targs, _localctx.ans, ((ClassInstanceCreationExpressionContext)_localctx).id.getText(),
				                                                _localctx.targsd, _localctx.args);
				            ((ClassInstanceCreationExpressionContext)_localctx).anon =  _localctx.inst.getAnonymousClass();
				            ((ClassInstanceCreationExpressionContext)_localctx).ret =  new AccessExpression(((ClassInstanceCreationExpressionContext)_localctx).p.ret, _localctx.inst);
				        
				setState(2917);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2916);
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
		public List<TypeArgument> targs = null;
		public List<TypeArgument> targsd = null;
		public List<Expression> args = null;
		public TypeArgumentsContext t;
		public AnnotationContext a;
		public Token id;
		public TypeArgumentsOrDiamondContext ta;
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
			setState(2921);
			match(DOT);
			setState(2922);
			match(NEW);
			setState(2926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2923);
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).t = typeArguments();
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).targs =  ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).t.ret;
				}
			}

			setState(2933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2928);
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).a = annotation();
				_localctx.ans.add(((ClassInstanceCreationExpression_lf_primaryContext)_localctx).a.ret);
				}
				}
				setState(2935);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2936);
			((ClassInstanceCreationExpression_lf_primaryContext)_localctx).id = match(Identifier);
			setState(2940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2937);
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).ta = typeArgumentsOrDiamond();
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).targsd =  ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).ta.ret;
				}
			}

			setState(2942);
			match(LPAREN);
			setState(2946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2943);
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).l = argumentList();
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).args =  ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).l.ret;
				}
			}

			setState(2948);
			match(RPAREN);

			            ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).inst =  new InstantiationExpression(_localctx.targs, _localctx.ans, ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).id.getText(),
			                                                _localctx.targsd, _localctx.args);
			            ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).anon =  _localctx.inst.getAnonymousClass();
			            ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).ret =  _localctx.inst;
			        
			setState(2951);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(2950);
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
		public List<TypeArgument> targs = null;
		public List<TypeArgument> targsd = null;
		public List<Expression> args = null;
		public TypeArgumentsContext t;
		public AnnotationContext a;
		public Token id;
		public AnnotationContext a2;
		public Token id2;
		public TypeArgumentsOrDiamondContext ta;
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
			setState(3034);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2953);
				match(NEW);
				setState(2957);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2954);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).t = typeArguments();
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).targs =  ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(2964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2959);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a = annotation();
					_localctx.ans.add(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a.ret);
					}
					}
					setState(2966);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2967);
				((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id = match(Identifier);

				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).methodExpr =  new IdentifierExpression(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id.getText(), _localctx.ans);
				        
				setState(2982);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2969);
					match(DOT);
					setState(2975);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2970);
						((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a2 = annotation();
						_localctx.ans2.add(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a2.ret);
						}
						}
						setState(2977);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2978);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id2 = match(Identifier);

					                ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).methodExpr =  new AccessExpression(_localctx.methodExpr,
					                                                   new IdentifierExpression(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id2.getText(),
					                                                                            _localctx.ans2));
					                _localctx.ans2.clear();
					            
					}
					}
					setState(2984);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2985);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ta = typeArgumentsOrDiamond();
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).targsd =  ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ta.ret;
					}
				}

				setState(2990);
				match(LPAREN);
				setState(2994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2991);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).l = argumentList();
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).args =  ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).l.ret;
					}
				}

				setState(2996);
				match(RPAREN);

				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).inst =  new InstantiationExpression(_localctx.targs, _localctx.methodExpr,
				                                                _localctx.targsd, _localctx.args);
				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).anon =  _localctx.inst.getAnonymousClass();
				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ret =  _localctx.inst;
				        
				setState(2999);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(2998);
					classBody(_localctx.anon);
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(3001);
				((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).name = expressionName();
				setState(3002);
				match(DOT);
				setState(3003);
				match(NEW);
				setState(3007);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3004);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).t = typeArguments();
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).targs =  ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(3009);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a = annotation();
					_localctx.ans.add(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a.ret);
					}
					}
					setState(3016);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3017);
				((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id = match(Identifier);
				setState(3021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3018);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ta = typeArgumentsOrDiamond();
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).targsd =  ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ta.ret;
					}
				}

				setState(3023);
				match(LPAREN);
				setState(3027);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3024);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).l = argumentList();
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).args =  ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).l.ret;
					}
				}

				setState(3029);
				match(RPAREN);

				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).inst =  new InstantiationExpression(_localctx.targs, _localctx.ans, ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id.getText(),
				                                                _localctx.targsd, _localctx.args);
				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).anon =  _localctx.inst.getAnonymousClass();
				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ret =  new AccessExpression(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).name.ret, _localctx.inst);
				        
				setState(3032);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(3031);
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
			setState(3042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3036);
				((TypeArgumentsOrDiamondContext)_localctx).ta = typeArguments();
				((TypeArgumentsOrDiamondContext)_localctx).ret =  ((TypeArgumentsOrDiamondContext)_localctx).ta.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3039);
				match(LT);
				setState(3040);
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
			setState(3060);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3044);
				((FieldAccessContext)_localctx).p = primary();
				setState(3045);
				match(DOT);
				setState(3046);
				((FieldAccessContext)_localctx).id = match(Identifier);
				((FieldAccessContext)_localctx).ret =  new AccessExpression(((FieldAccessContext)_localctx).p.ret, ((FieldAccessContext)_localctx).id.getText());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3049);
				match(SUPER);
				setState(3050);
				match(DOT);
				setState(3051);
				((FieldAccessContext)_localctx).id = match(Identifier);
				((FieldAccessContext)_localctx).ret =  new AccessExpression(new SuperLiteral(), ((FieldAccessContext)_localctx).id.getText());
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3053);
				((FieldAccessContext)_localctx).t = typeName();
				setState(3054);
				match(DOT);
				setState(3055);
				match(SUPER);
				setState(3056);
				match(DOT);
				setState(3057);
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
			setState(3062);
			match(DOT);
			setState(3063);
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
			setState(3077);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(3066);
				match(SUPER);
				setState(3067);
				match(DOT);
				setState(3068);
				((FieldAccess_lfno_primaryContext)_localctx).id = match(Identifier);
				((FieldAccess_lfno_primaryContext)_localctx).ret =  new AccessExpression(new SuperLiteral(), ((FieldAccess_lfno_primaryContext)_localctx).id.getText());
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(3070);
				((FieldAccess_lfno_primaryContext)_localctx).t = typeName();
				setState(3071);
				match(DOT);
				setState(3072);
				match(SUPER);
				setState(3073);
				match(DOT);
				setState(3074);
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
			setState(3091);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				{
				setState(3079);
				((ArrayAccessContext)_localctx).n = expressionName();
				setState(3080);
				match(LBRACK);
				setState(3081);
				((ArrayAccessContext)_localctx).i = expression();
				setState(3082);
				match(RBRACK);
				((ArrayAccessContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccessContext)_localctx).n.ret, ((ArrayAccessContext)_localctx).i.ret);
				}
				}
				break;
			case 2:
				{
				{
				setState(3085);
				((ArrayAccessContext)_localctx).pno = primaryNoNewArray_lfno_arrayAccess();
				setState(3086);
				match(LBRACK);
				setState(3087);
				((ArrayAccessContext)_localctx).i = expression();
				setState(3088);
				match(RBRACK);
				((ArrayAccessContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccessContext)_localctx).pno.ret, ((ArrayAccessContext)_localctx).i.ret);
				}
				}
				break;
			}
			setState(3101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(3093);
				primaryNoNewArray_lf_arrayAccess();
				setState(3094);
				match(LBRACK);
				setState(3095);
				((ArrayAccessContext)_localctx).i = expression();
				setState(3096);
				match(RBRACK);
				((ArrayAccessContext)_localctx).ret =  new ArrayAccessExpression(_localctx.ret, ((ArrayAccessContext)_localctx).i.ret);
				}
				}
				setState(3103);
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
			setState(3104);
			((ArrayAccess_lf_primaryContext)_localctx).pno = primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(3105);
			match(LBRACK);
			setState(3106);
			((ArrayAccess_lf_primaryContext)_localctx).i = expression();
			setState(3107);
			match(RBRACK);
			((ArrayAccess_lf_primaryContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccess_lf_primaryContext)_localctx).pno.ret, ((ArrayAccess_lf_primaryContext)_localctx).i.ret);
			                 ((ArrayAccess_lf_primaryContext)_localctx).isAccess =  ((ArrayAccess_lf_primaryContext)_localctx).pno.isAccess;
			}
			}
			setState(3118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3110);
					primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
					setState(3111);
					match(LBRACK);
					setState(3112);
					((ArrayAccess_lf_primaryContext)_localctx).i2 = expression();
					setState(3113);
					match(RBRACK);
					((ArrayAccess_lf_primaryContext)_localctx).ret =  new ArrayAccessExpression(_localctx.ret, ((ArrayAccess_lf_primaryContext)_localctx).i2.ret);
					}
					} 
				}
				setState(3120);
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
			setState(3133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				{
				setState(3121);
				((ArrayAccess_lfno_primaryContext)_localctx).name = expressionName();
				setState(3122);
				match(LBRACK);
				setState(3123);
				((ArrayAccess_lfno_primaryContext)_localctx).i = expression();
				setState(3124);
				match(RBRACK);
				((ArrayAccess_lfno_primaryContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccess_lfno_primaryContext)_localctx).name.ret, ((ArrayAccess_lfno_primaryContext)_localctx).i.ret);
				}
				}
				break;
			case 2:
				{
				{
				setState(3127);
				((ArrayAccess_lfno_primaryContext)_localctx).pno = primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(3128);
				match(LBRACK);
				setState(3129);
				((ArrayAccess_lfno_primaryContext)_localctx).i = expression();
				setState(3130);
				match(RBRACK);
				((ArrayAccess_lfno_primaryContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccess_lfno_primaryContext)_localctx).pno.ret, ((ArrayAccess_lfno_primaryContext)_localctx).i.ret);
				}
				}
				break;
			}
			setState(3143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3135);
					primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(3136);
					match(LBRACK);
					setState(3137);
					((ArrayAccess_lfno_primaryContext)_localctx).i2 = expression();
					setState(3138);
					match(RBRACK);
					((ArrayAccess_lfno_primaryContext)_localctx).ret =  new ArrayAccessExpression(_localctx.ret, ((ArrayAccess_lfno_primaryContext)_localctx).i2.ret);
					}
					} 
				}
				setState(3145);
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
		public List<Expression> args = null;
		public List<TypeArgument> targs = null;
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
			setState(3242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3146);
				((MethodInvocationContext)_localctx).mn = methodName();
				setState(3147);
				match(LPAREN);
				setState(3151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3148);
					((MethodInvocationContext)_localctx).a = argumentList();
					((MethodInvocationContext)_localctx).args =  ((MethodInvocationContext)_localctx).a.ret;
					}
				}

				setState(3153);
				match(RPAREN);
				((MethodInvocationContext)_localctx).ret =  new CallExpression(((MethodInvocationContext)_localctx).mn.ret, _localctx.args);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3156);
				((MethodInvocationContext)_localctx).tn = typeName();
				setState(3157);
				match(DOT);
				setState(3161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3158);
					((MethodInvocationContext)_localctx).t = typeArguments();
					((MethodInvocationContext)_localctx).targs =  ((MethodInvocationContext)_localctx).t.ret;
					}
				}

				setState(3163);
				((MethodInvocationContext)_localctx).id = match(Identifier);
				setState(3164);
				match(LPAREN);
				setState(3168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3165);
					((MethodInvocationContext)_localctx).a = argumentList();
					((MethodInvocationContext)_localctx).args =  ((MethodInvocationContext)_localctx).a.ret;
					}
				}

				setState(3170);
				match(RPAREN);
				((MethodInvocationContext)_localctx).ret =  new CallExpression(((MethodInvocationContext)_localctx).id.getText(), _localctx.args, _localctx.targs);
				         ((MethodInvocationContext)_localctx).ret =  new AccessExpression(((MethodInvocationContext)_localctx).tn.ret, _localctx.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3173);
				((MethodInvocationContext)_localctx).en = expressionName();
				setState(3174);
				match(DOT);
				setState(3178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3175);
					((MethodInvocationContext)_localctx).t = typeArguments();
					((MethodInvocationContext)_localctx).targs =  ((MethodInvocationContext)_localctx).t.ret;
					}
				}

				setState(3180);
				((MethodInvocationContext)_localctx).id = match(Identifier);
				setState(3181);
				match(LPAREN);
				setState(3185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3182);
					((MethodInvocationContext)_localctx).a = argumentList();
					((MethodInvocationContext)_localctx).args =  ((MethodInvocationContext)_localctx).a.ret;
					}
				}

				setState(3187);
				match(RPAREN);
				((MethodInvocationContext)_localctx).ret =  new CallExpression(((MethodInvocationContext)_localctx).id.getText(), _localctx.args, _localctx.targs);
				         ((MethodInvocationContext)_localctx).ret =  new AccessExpression(((MethodInvocationContext)_localctx).en.ret, _localctx.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3190);
				((MethodInvocationContext)_localctx).p = primary();
				setState(3191);
				match(DOT);
				setState(3195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3192);
					((MethodInvocationContext)_localctx).t = typeArguments();
					((MethodInvocationContext)_localctx).targs =  ((MethodInvocationContext)_localctx).t.ret;
					}
				}

				setState(3197);
				((MethodInvocationContext)_localctx).id = match(Identifier);
				setState(3198);
				match(LPAREN);
				setState(3202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3199);
					((MethodInvocationContext)_localctx).a = argumentList();
					((MethodInvocationContext)_localctx).args =  ((MethodInvocationContext)_localctx).a.ret;
					}
				}

				setState(3204);
				match(RPAREN);
				((MethodInvocationContext)_localctx).ret =  new CallExpression(((MethodInvocationContext)_localctx).id.getText(), _localctx.args, _localctx.targs);
				         ((MethodInvocationContext)_localctx).ret =  new AccessExpression(((MethodInvocationContext)_localctx).p.ret, _localctx.ret);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3207);
				match(SUPER);
				setState(3208);
				match(DOT);
				setState(3212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3209);
					((MethodInvocationContext)_localctx).t = typeArguments();
					((MethodInvocationContext)_localctx).targs =  ((MethodInvocationContext)_localctx).t.ret;
					}
				}

				setState(3214);
				((MethodInvocationContext)_localctx).id = match(Identifier);
				setState(3215);
				match(LPAREN);
				setState(3219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3216);
					((MethodInvocationContext)_localctx).a = argumentList();
					((MethodInvocationContext)_localctx).args =  ((MethodInvocationContext)_localctx).a.ret;
					}
				}

				setState(3221);
				match(RPAREN);
				((MethodInvocationContext)_localctx).ret =  new CallExpression(((MethodInvocationContext)_localctx).id.getText(), _localctx.args, _localctx.targs);
				         ((MethodInvocationContext)_localctx).ret =  new AccessExpression(new SuperLiteral(), _localctx.ret);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3223);
				((MethodInvocationContext)_localctx).tn = typeName();
				setState(3224);
				match(DOT);
				setState(3225);
				match(SUPER);
				setState(3226);
				match(DOT);
				setState(3230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3227);
					((MethodInvocationContext)_localctx).t = typeArguments();
					((MethodInvocationContext)_localctx).targs =  ((MethodInvocationContext)_localctx).t.ret;
					}
				}

				setState(3232);
				((MethodInvocationContext)_localctx).id = match(Identifier);
				setState(3233);
				match(LPAREN);
				setState(3237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3234);
					((MethodInvocationContext)_localctx).a = argumentList();
					((MethodInvocationContext)_localctx).args =  ((MethodInvocationContext)_localctx).a.ret;
					}
				}

				setState(3239);
				match(RPAREN);
				((MethodInvocationContext)_localctx).ret =  new CallExpression(((MethodInvocationContext)_localctx).id.getText(), _localctx.args, _localctx.targs);
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
		public List<Expression> args = null;
		public List<TypeArgument> targs = null;
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
			setState(3244);
			match(DOT);
			setState(3248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(3245);
				((MethodInvocation_lf_primaryContext)_localctx).t = typeArguments();
				((MethodInvocation_lf_primaryContext)_localctx).targs =  ((MethodInvocation_lf_primaryContext)_localctx).t.ret;
				}
			}

			setState(3250);
			((MethodInvocation_lf_primaryContext)_localctx).id = match(Identifier);
			setState(3251);
			match(LPAREN);
			setState(3255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(3252);
				((MethodInvocation_lf_primaryContext)_localctx).a = argumentList();
				((MethodInvocation_lf_primaryContext)_localctx).args =  ((MethodInvocation_lf_primaryContext)_localctx).a.ret;
				}
			}

			setState(3257);
			match(RPAREN);
			((MethodInvocation_lf_primaryContext)_localctx).ret =  new CallExpression(((MethodInvocation_lf_primaryContext)_localctx).id.getText(), _localctx.args, _localctx.targs);
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
		public List<Expression> args = null;
		public List<TypeArgument> targs = null;
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
			setState(3339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3260);
				((MethodInvocation_lfno_primaryContext)_localctx).mn = methodName();
				setState(3261);
				match(LPAREN);
				setState(3265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3262);
					((MethodInvocation_lfno_primaryContext)_localctx).a = argumentList();
					((MethodInvocation_lfno_primaryContext)_localctx).args =  ((MethodInvocation_lfno_primaryContext)_localctx).a.ret;
					}
				}

				setState(3267);
				match(RPAREN);
				((MethodInvocation_lfno_primaryContext)_localctx).ret =  new CallExpression(((MethodInvocation_lfno_primaryContext)_localctx).mn.ret, _localctx.args);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3270);
				((MethodInvocation_lfno_primaryContext)_localctx).tn = typeName();
				setState(3271);
				match(DOT);
				setState(3275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3272);
					((MethodInvocation_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodInvocation_lfno_primaryContext)_localctx).targs =  ((MethodInvocation_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3277);
				((MethodInvocation_lfno_primaryContext)_localctx).id = match(Identifier);
				setState(3278);
				match(LPAREN);
				setState(3282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3279);
					((MethodInvocation_lfno_primaryContext)_localctx).a = argumentList();
					((MethodInvocation_lfno_primaryContext)_localctx).args =  ((MethodInvocation_lfno_primaryContext)_localctx).a.ret;
					}
				}

				setState(3284);
				match(RPAREN);
				((MethodInvocation_lfno_primaryContext)_localctx).ret =  new CallExpression(((MethodInvocation_lfno_primaryContext)_localctx).id.getText(), _localctx.args, _localctx.targs);
				         ((MethodInvocation_lfno_primaryContext)_localctx).ret =  new AccessExpression(((MethodInvocation_lfno_primaryContext)_localctx).tn.ret, _localctx.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3287);
				((MethodInvocation_lfno_primaryContext)_localctx).en = expressionName();
				setState(3288);
				match(DOT);
				setState(3292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3289);
					((MethodInvocation_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodInvocation_lfno_primaryContext)_localctx).targs =  ((MethodInvocation_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3294);
				((MethodInvocation_lfno_primaryContext)_localctx).id = match(Identifier);
				setState(3295);
				match(LPAREN);
				setState(3299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3296);
					((MethodInvocation_lfno_primaryContext)_localctx).a = argumentList();
					((MethodInvocation_lfno_primaryContext)_localctx).args =  ((MethodInvocation_lfno_primaryContext)_localctx).a.ret;
					}
				}

				setState(3301);
				match(RPAREN);
				((MethodInvocation_lfno_primaryContext)_localctx).ret =  new CallExpression(((MethodInvocation_lfno_primaryContext)_localctx).id.getText(), _localctx.args, _localctx.targs);
				         ((MethodInvocation_lfno_primaryContext)_localctx).ret =  new AccessExpression(((MethodInvocation_lfno_primaryContext)_localctx).en.ret, _localctx.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3304);
				match(SUPER);
				setState(3305);
				match(DOT);
				setState(3309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3306);
					((MethodInvocation_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodInvocation_lfno_primaryContext)_localctx).targs =  ((MethodInvocation_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3311);
				((MethodInvocation_lfno_primaryContext)_localctx).id = match(Identifier);
				setState(3312);
				match(LPAREN);
				setState(3316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3313);
					((MethodInvocation_lfno_primaryContext)_localctx).a = argumentList();
					((MethodInvocation_lfno_primaryContext)_localctx).args =  ((MethodInvocation_lfno_primaryContext)_localctx).a.ret;
					}
				}

				setState(3318);
				match(RPAREN);
				((MethodInvocation_lfno_primaryContext)_localctx).ret =  new CallExpression(((MethodInvocation_lfno_primaryContext)_localctx).id.getText(), _localctx.args, _localctx.targs);
				         ((MethodInvocation_lfno_primaryContext)_localctx).ret =  new AccessExpression(new SuperLiteral(), _localctx.ret);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3320);
				((MethodInvocation_lfno_primaryContext)_localctx).tn = typeName();
				setState(3321);
				match(DOT);
				setState(3322);
				match(SUPER);
				setState(3323);
				match(DOT);
				setState(3327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3324);
					((MethodInvocation_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodInvocation_lfno_primaryContext)_localctx).targs =  ((MethodInvocation_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3329);
				((MethodInvocation_lfno_primaryContext)_localctx).id = match(Identifier);
				setState(3330);
				match(LPAREN);
				setState(3334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3331);
					((MethodInvocation_lfno_primaryContext)_localctx).a = argumentList();
					((MethodInvocation_lfno_primaryContext)_localctx).args =  ((MethodInvocation_lfno_primaryContext)_localctx).a.ret;
					}
				}

				setState(3336);
				match(RPAREN);
				((MethodInvocation_lfno_primaryContext)_localctx).ret =  new CallExpression(((MethodInvocation_lfno_primaryContext)_localctx).id.getText(), _localctx.args, _localctx.targs);
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
		public List<Expression> ls = new ArrayList<>();
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
			setState(3341);
			((ArgumentListContext)_localctx).e = expression();
			_localctx.ls.add(((ArgumentListContext)_localctx).e.ret);
			}
			setState(3350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3344);
				match(COMMA);
				setState(3345);
				((ArgumentListContext)_localctx).ex = expression();
				_localctx.ls.add(((ArgumentListContext)_localctx).ex.ret);
				}
				}
				setState(3352);
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
		public List<TypeArgument> targs = null;
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
			setState(3421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3355);
				((MethodReferenceContext)_localctx).en = expressionName();
				setState(3356);
				match(COLONCOLON);
				setState(3360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3357);
					((MethodReferenceContext)_localctx).t = typeArguments();
					((MethodReferenceContext)_localctx).targs =  ((MethodReferenceContext)_localctx).t.ret;
					}
				}

				setState(3362);
				((MethodReferenceContext)_localctx).id = match(Identifier);
				((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(((MethodReferenceContext)_localctx).en.ret, ((MethodReferenceContext)_localctx).id.getText(), _localctx.targs);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3365);
				((MethodReferenceContext)_localctx).r = referenceType();
				setState(3366);
				match(COLONCOLON);
				setState(3370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3367);
					((MethodReferenceContext)_localctx).t = typeArguments();
					((MethodReferenceContext)_localctx).targs =  ((MethodReferenceContext)_localctx).t.ret;
					}
				}

				setState(3372);
				((MethodReferenceContext)_localctx).id = match(Identifier);
				((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(new TypeExpression(((MethodReferenceContext)_localctx).r.ret),
				                                              ((MethodReferenceContext)_localctx).id.getText(),
				                                              _localctx.targs);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3375);
				((MethodReferenceContext)_localctx).p = primary();
				setState(3376);
				match(COLONCOLON);
				setState(3380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3377);
					((MethodReferenceContext)_localctx).t = typeArguments();
					((MethodReferenceContext)_localctx).targs =  ((MethodReferenceContext)_localctx).t.ret;
					}
				}

				setState(3382);
				((MethodReferenceContext)_localctx).id = match(Identifier);
				((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(((MethodReferenceContext)_localctx).p.ret, ((MethodReferenceContext)_localctx).id.getText(), _localctx.targs);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3385);
				match(SUPER);
				setState(3386);
				match(COLONCOLON);
				setState(3390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3387);
					((MethodReferenceContext)_localctx).t = typeArguments();
					((MethodReferenceContext)_localctx).targs =  ((MethodReferenceContext)_localctx).t.ret;
					}
				}

				setState(3392);
				((MethodReferenceContext)_localctx).id = match(Identifier);
				((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(new SuperLiteral(),
				                                              ((MethodReferenceContext)_localctx).id.getText(),
				                                              _localctx.targs);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3394);
				((MethodReferenceContext)_localctx).tn = typeName();
				setState(3395);
				match(DOT);
				setState(3396);
				match(SUPER);
				setState(3397);
				match(COLONCOLON);
				setState(3401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3398);
					((MethodReferenceContext)_localctx).t = typeArguments();
					((MethodReferenceContext)_localctx).targs =  ((MethodReferenceContext)_localctx).t.ret;
					}
				}

				setState(3403);
				((MethodReferenceContext)_localctx).id = match(Identifier);

				            ((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(new SuperLiteral(),
				                                                 ((MethodReferenceContext)_localctx).id.getText(),
				                                                 _localctx.targs);
				            ((MethodReferenceContext)_localctx).ret =  new AccessExpression(new IdentifierExpression(((MethodReferenceContext)_localctx).tn.ret),
				                                        _localctx.ret);
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3406);
				((MethodReferenceContext)_localctx).c = classType();
				setState(3407);
				match(COLONCOLON);
				setState(3411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3408);
					((MethodReferenceContext)_localctx).t = typeArguments();
					((MethodReferenceContext)_localctx).targs =  ((MethodReferenceContext)_localctx).t.ret;
					}
				}

				setState(3413);
				match(NEW);
				((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(new TypeExpression(((MethodReferenceContext)_localctx).c.ret),
				                                              "new",
				                                              _localctx.targs);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3416);
				((MethodReferenceContext)_localctx).a = arrayType();
				setState(3417);
				match(COLONCOLON);
				setState(3418);
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
		public List<TypeArgument> targs = null;
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
			setState(3423);
			match(COLONCOLON);
			setState(3427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(3424);
				((MethodReference_lf_primaryContext)_localctx).t = typeArguments();
				((MethodReference_lf_primaryContext)_localctx).targs =  ((MethodReference_lf_primaryContext)_localctx).t.ret;
				}
			}

			setState(3429);
			((MethodReference_lf_primaryContext)_localctx).id = match(Identifier);
			((MethodReference_lf_primaryContext)_localctx).ret =  new MethodReferenceExpression(((MethodReference_lf_primaryContext)_localctx).id.getText(), _localctx.targs);
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
		public List<TypeArgument> targs = null;
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
			setState(3488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3432);
				((MethodReference_lfno_primaryContext)_localctx).en = expressionName();
				setState(3433);
				match(COLONCOLON);
				setState(3437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3434);
					((MethodReference_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodReference_lfno_primaryContext)_localctx).targs =  ((MethodReference_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3439);
				((MethodReference_lfno_primaryContext)_localctx).id = match(Identifier);
				((MethodReference_lfno_primaryContext)_localctx).ret =  new MethodReferenceExpression(((MethodReference_lfno_primaryContext)_localctx).en.ret, ((MethodReference_lfno_primaryContext)_localctx).id.getText(), _localctx.targs);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3442);
				((MethodReference_lfno_primaryContext)_localctx).r = referenceType();
				setState(3443);
				match(COLONCOLON);
				setState(3447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3444);
					((MethodReference_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodReference_lfno_primaryContext)_localctx).targs =  ((MethodReference_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3449);
				((MethodReference_lfno_primaryContext)_localctx).id = match(Identifier);
				((MethodReference_lfno_primaryContext)_localctx).ret =  new MethodReferenceExpression(new TypeExpression(((MethodReference_lfno_primaryContext)_localctx).r.ret),
				                                              ((MethodReference_lfno_primaryContext)_localctx).id.getText(),
				                                              _localctx.targs);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3452);
				match(SUPER);
				setState(3453);
				match(COLONCOLON);
				setState(3457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3454);
					((MethodReference_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodReference_lfno_primaryContext)_localctx).targs =  ((MethodReference_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3459);
				((MethodReference_lfno_primaryContext)_localctx).id = match(Identifier);
				((MethodReference_lfno_primaryContext)_localctx).ret =  new MethodReferenceExpression(new SuperLiteral(),
				                                              ((MethodReference_lfno_primaryContext)_localctx).id.getText(),
				                                              _localctx.targs);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3461);
				((MethodReference_lfno_primaryContext)_localctx).tn = typeName();
				setState(3462);
				match(DOT);
				setState(3463);
				match(SUPER);
				setState(3464);
				match(COLONCOLON);
				setState(3468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3465);
					((MethodReference_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodReference_lfno_primaryContext)_localctx).targs =  ((MethodReference_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3470);
				((MethodReference_lfno_primaryContext)_localctx).id = match(Identifier);

				            ((MethodReference_lfno_primaryContext)_localctx).ret =  new MethodReferenceExpression(new SuperLiteral(),
				                                                 ((MethodReference_lfno_primaryContext)_localctx).id.getText(),
				                                                 _localctx.targs);
				            ((MethodReference_lfno_primaryContext)_localctx).ret =  new AccessExpression(new IdentifierExpression(((MethodReference_lfno_primaryContext)_localctx).tn.ret),
				                                        _localctx.ret);
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3473);
				((MethodReference_lfno_primaryContext)_localctx).c = classType();
				setState(3474);
				match(COLONCOLON);
				setState(3478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3475);
					((MethodReference_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodReference_lfno_primaryContext)_localctx).targs =  ((MethodReference_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3480);
				match(NEW);
				((MethodReference_lfno_primaryContext)_localctx).ret =  new MethodReferenceExpression(new TypeExpression(((MethodReference_lfno_primaryContext)_localctx).c.ret),
				                                              "new",
				                                              _localctx.targs);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3483);
				((MethodReference_lfno_primaryContext)_localctx).a = arrayType();
				setState(3484);
				match(COLONCOLON);
				setState(3485);
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
		public int dim = 0;
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
			setState(3522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3490);
				match(NEW);
				setState(3491);
				((ArrayCreationExpressionContext)_localctx).p = primitiveType();
				setState(3492);
				((ArrayCreationExpressionContext)_localctx).de = dimExprs();
				setState(3496);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
				case 1:
					{
					setState(3493);
					((ArrayCreationExpressionContext)_localctx).d = dims();
					((ArrayCreationExpressionContext)_localctx).dim =  ((ArrayCreationExpressionContext)_localctx).d.ret;
					}
					break;
				}
				((ArrayCreationExpressionContext)_localctx).ret =  new ArrayConstruction(((ArrayCreationExpressionContext)_localctx).p.ret, ((ArrayCreationExpressionContext)_localctx).de.ret, _localctx.dim);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3500);
				match(NEW);
				setState(3501);
				((ArrayCreationExpressionContext)_localctx).c = classOrInterfaceType();
				setState(3502);
				((ArrayCreationExpressionContext)_localctx).de = dimExprs();
				setState(3506);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(3503);
					((ArrayCreationExpressionContext)_localctx).d = dims();
					((ArrayCreationExpressionContext)_localctx).dim =  ((ArrayCreationExpressionContext)_localctx).d.ret;
					}
					break;
				}
				((ArrayCreationExpressionContext)_localctx).ret =  new ArrayConstruction(((ArrayCreationExpressionContext)_localctx).c.ret, ((ArrayCreationExpressionContext)_localctx).de.ret, _localctx.dim);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3510);
				match(NEW);
				setState(3511);
				((ArrayCreationExpressionContext)_localctx).p = primitiveType();
				setState(3512);
				((ArrayCreationExpressionContext)_localctx).d = dims();
				setState(3513);
				((ArrayCreationExpressionContext)_localctx).i = arrayInitializer();
				((ArrayCreationExpressionContext)_localctx).ret =  new ArrayConstruction(((ArrayCreationExpressionContext)_localctx).p.ret, ((ArrayCreationExpressionContext)_localctx).d.ret, ((ArrayCreationExpressionContext)_localctx).i.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3516);
				match(NEW);
				setState(3517);
				((ArrayCreationExpressionContext)_localctx).c = classOrInterfaceType();
				setState(3518);
				((ArrayCreationExpressionContext)_localctx).d = dims();
				setState(3519);
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
			setState(3524);
			((DimExprsContext)_localctx).d1 = dimExpr();
			((DimExprsContext)_localctx).ret =  new ArrayList<>(); _localctx.ret.add(((DimExprsContext)_localctx).d1.ret);
			setState(3531);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3526);
					((DimExprsContext)_localctx).d = dimExpr();
					_localctx.ret.add(((DimExprsContext)_localctx).d.ret);
					}
					} 
				}
				setState(3533);
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
		public List<Annotation> ans = new ArrayList<>();
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
			setState(3539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(3534);
				((DimExprContext)_localctx).a = annotation();
				_localctx.ans.add(((DimExprContext)_localctx).a.ret);
				}
				}
				setState(3541);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3542);
			match(LBRACK);
			setState(3543);
			((DimExprContext)_localctx).ex = expression();
			setState(3544);
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
			setState(3547);
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
			setState(3556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3550);
				((ExpressionContext)_localctx).l = lambdaExpression();
				((ExpressionContext)_localctx).ret =  ((ExpressionContext)_localctx).l.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3553);
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
			setState(3558);
			((LambdaExpressionContext)_localctx).p = lambdaParameters();
			setState(3559);
			match(ARROW);
			setState(3560);
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
		public List<VariableDeclaration> vars = new ArrayList<>();
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
			setState(3578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3563);
				((LambdaParametersContext)_localctx).id = match(Identifier);
				_localctx.vars.add(new VariableDeclaration(((LambdaParametersContext)_localctx).id.getText()));
				         ((LambdaParametersContext)_localctx).ret =  _localctx.vars;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((LambdaParametersContext)_localctx).ret =  _localctx.vars;
				setState(3566);
				match(LPAREN);
				setState(3570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
					{
					setState(3567);
					((LambdaParametersContext)_localctx).p = formalParameterList();
					((LambdaParametersContext)_localctx).ret =  ((LambdaParametersContext)_localctx).p.ret;
					}
				}

				setState(3572);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3573);
				match(LPAREN);
				setState(3574);
				((LambdaParametersContext)_localctx).i = inferredFormalParameterList();
				setState(3575);
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
		public List<VariableDeclaration> vars = new ArrayList<>();
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
			setState(3580);
			((InferredFormalParameterListContext)_localctx).id = match(Identifier);
			_localctx.vars.add(new VariableDeclaration(((InferredFormalParameterListContext)_localctx).id.getText()));
			}
			setState(3588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3583);
				match(COMMA);
				setState(3584);
				((InferredFormalParameterListContext)_localctx).i = match(Identifier);
				_localctx.vars.add(new VariableDeclaration(((InferredFormalParameterListContext)_localctx).i.getText()));
				}
				}
				setState(3590);
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
			setState(3599);
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
				setState(3593);
				((LambdaBodyContext)_localctx).e = expression();
				((LambdaBodyContext)_localctx).ret =  new Block(((LambdaBodyContext)_localctx).e.ret);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(3596);
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
			setState(3607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3601);
				((AssignmentExpressionContext)_localctx).c = conditionalExpression();
				((AssignmentExpressionContext)_localctx).ret =  ((AssignmentExpressionContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3604);
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
			setState(3609);
			((AssignmentContext)_localctx).l = leftHandSide();
			setState(3610);
			((AssignmentContext)_localctx).op = assignmentOperator();
			setState(3611);
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
			setState(3623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3614);
				((LeftHandSideContext)_localctx).n = expressionName();
				((LeftHandSideContext)_localctx).ret =  new IdentifierExpression(((LeftHandSideContext)_localctx).n.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3617);
				((LeftHandSideContext)_localctx).f = fieldAccess();
				((LeftHandSideContext)_localctx).ret =  ((LeftHandSideContext)_localctx).f.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3620);
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
			setState(3649);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(3625);
				match(ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.EQUALS;
				}
				break;
			case MUL_ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(3627);
				match(MUL_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.MULTIPLICATION;
				}
				break;
			case DIV_ASSIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(3629);
				match(DIV_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.DIVISION;
				}
				break;
			case MOD_ASSIGN:
				enterOuterAlt(_localctx, 4);
				{
				setState(3631);
				match(MOD_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.MODULUS;
				}
				break;
			case ADD_ASSIGN:
				enterOuterAlt(_localctx, 5);
				{
				setState(3633);
				match(ADD_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.ADDITION;
				}
				break;
			case SUB_ASSIGN:
				enterOuterAlt(_localctx, 6);
				{
				setState(3635);
				match(SUB_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.SUBTRACTION;
				}
				break;
			case LSHIFT_ASSIGN:
				enterOuterAlt(_localctx, 7);
				{
				setState(3637);
				match(LSHIFT_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.LEFT_SHIFT;
				}
				break;
			case RSHIFT_ASSIGN:
				enterOuterAlt(_localctx, 8);
				{
				setState(3639);
				match(RSHIFT_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.RIGHT_SHIFT;
				}
				break;
			case URSHIFT_ASSIGN:
				enterOuterAlt(_localctx, 9);
				{
				setState(3641);
				match(URSHIFT_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.RIGHT_LOGICAL_SHIFT;
				}
				break;
			case AND_ASSIGN:
				enterOuterAlt(_localctx, 10);
				{
				setState(3643);
				match(AND_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.BITWISE_AND;
				}
				break;
			case XOR_ASSIGN:
				enterOuterAlt(_localctx, 11);
				{
				setState(3645);
				match(XOR_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.BITWISE_XOR;
				}
				break;
			case OR_ASSIGN:
				enterOuterAlt(_localctx, 12);
				{
				setState(3647);
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
			setState(3661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3651);
				((ConditionalExpressionContext)_localctx).c = conditionalOrExpression(0);
				((ConditionalExpressionContext)_localctx).ret =  ((ConditionalExpressionContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3654);
				((ConditionalExpressionContext)_localctx).c = conditionalOrExpression(0);
				setState(3655);
				match(QUESTION);
				setState(3656);
				((ConditionalExpressionContext)_localctx).i = expression();
				setState(3657);
				match(COLON);
				setState(3658);
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
			setState(3664);
			((ConditionalOrExpressionContext)_localctx).c = conditionalAndExpression(0);
			((ConditionalOrExpressionContext)_localctx).ret =  ((ConditionalOrExpressionContext)_localctx).c.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3674);
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
					setState(3667);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3668);
					match(OR);
					setState(3669);
					((ConditionalOrExpressionContext)_localctx).c2 = conditionalAndExpression(0);
					((ConditionalOrExpressionContext)_localctx).ret =  new BinaryExpression(((ConditionalOrExpressionContext)_localctx).c1.ret, BinaryOperator.OR, ((ConditionalOrExpressionContext)_localctx).c2.ret);
					}
					} 
				}
				setState(3676);
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
			setState(3678);
			((ConditionalAndExpressionContext)_localctx).i = inclusiveOrExpression(0);
			((ConditionalAndExpressionContext)_localctx).ret =  ((ConditionalAndExpressionContext)_localctx).i.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3688);
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
					setState(3681);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3682);
					match(AND);
					setState(3683);
					((ConditionalAndExpressionContext)_localctx).r = inclusiveOrExpression(0);
					((ConditionalAndExpressionContext)_localctx).ret =  new BinaryExpression(((ConditionalAndExpressionContext)_localctx).l.ret, BinaryOperator.AND, ((ConditionalAndExpressionContext)_localctx).r.ret);
					}
					} 
				}
				setState(3690);
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
			setState(3692);
			((InclusiveOrExpressionContext)_localctx).ex = exclusiveOrExpression(0);
			((InclusiveOrExpressionContext)_localctx).ret =  ((InclusiveOrExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3702);
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
					setState(3695);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3696);
					match(BITOR);
					setState(3697);
					((InclusiveOrExpressionContext)_localctx).r = exclusiveOrExpression(0);
					((InclusiveOrExpressionContext)_localctx).ret =  new BinaryExpression(((InclusiveOrExpressionContext)_localctx).l.ret,BinaryOperator.BITWISE_OR, ((InclusiveOrExpressionContext)_localctx).r.ret);
					}
					} 
				}
				setState(3704);
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
			setState(3706);
			((ExclusiveOrExpressionContext)_localctx).ex = andExpression(0);
			((ExclusiveOrExpressionContext)_localctx).ret =  ((ExclusiveOrExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3716);
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
					setState(3709);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3710);
					match(CARET);
					setState(3711);
					((ExclusiveOrExpressionContext)_localctx).r = andExpression(0);
					((ExclusiveOrExpressionContext)_localctx).ret =  new BinaryExpression(((ExclusiveOrExpressionContext)_localctx).l.ret, BinaryOperator.BITWISE_XOR, ((ExclusiveOrExpressionContext)_localctx).r.ret);
					}
					} 
				}
				setState(3718);
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
			setState(3720);
			((AndExpressionContext)_localctx).ex = equalityExpression(0);
			((AndExpressionContext)_localctx).ret =  ((AndExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3730);
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
					setState(3723);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3724);
					match(BITAND);
					setState(3725);
					((AndExpressionContext)_localctx).r = equalityExpression(0);
					((AndExpressionContext)_localctx).ret =  new BinaryExpression(((AndExpressionContext)_localctx).l.ret, BinaryOperator.BITWISE_AND, ((AndExpressionContext)_localctx).r.ret);
					}
					} 
				}
				setState(3732);
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
			setState(3734);
			((EqualityExpressionContext)_localctx).ex = relationalExpression(0);
			((EqualityExpressionContext)_localctx).ret =  ((EqualityExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3749);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3747);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(3737);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3738);
						match(EQUAL);
						setState(3739);
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
						setState(3742);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3743);
						match(NOTEQUAL);
						setState(3744);
						((EqualityExpressionContext)_localctx).r = relationalExpression(0);
						((EqualityExpressionContext)_localctx).ret =  new BinaryExpression(((EqualityExpressionContext)_localctx).l.ret, BinaryOperator.INEQUALITY, ((EqualityExpressionContext)_localctx).r.ret);
						}
						break;
					}
					} 
				}
				setState(3751);
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
			setState(3753);
			((RelationalExpressionContext)_localctx).ex = shiftExpression(0);
			((RelationalExpressionContext)_localctx).ret =  ((RelationalExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3783);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3781);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(3756);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(3757);
						match(LT);
						setState(3758);
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
						setState(3761);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(3762);
						match(GT);
						setState(3763);
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
						setState(3766);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(3767);
						match(LE);
						setState(3768);
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
						setState(3771);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3772);
						match(GE);
						setState(3773);
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
						setState(3776);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3777);
						match(INSTANCEOF);
						setState(3778);
						((RelationalExpressionContext)_localctx).rt = referenceType();
						((RelationalExpressionContext)_localctx).ret =  new BinaryExpression(((RelationalExpressionContext)_localctx).l.ret,
						                                               BinaryOperator.INSTANCE_OF,
						                                               new TypeExpression(((RelationalExpressionContext)_localctx).rt.ret));
						}
						break;
					}
					} 
				}
				setState(3785);
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
			setState(3787);
			((ShiftExpressionContext)_localctx).ex = additiveExpression(0);
			((ShiftExpressionContext)_localctx).ret =  ((ShiftExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3811);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3809);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(3790);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(3791);
						match(LT);
						setState(3792);
						match(LT);
						setState(3793);
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
						setState(3796);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3797);
						match(GT);
						setState(3798);
						match(GT);
						setState(3799);
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
						setState(3802);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3803);
						match(GT);
						setState(3804);
						match(GT);
						setState(3805);
						match(GT);
						setState(3806);
						((ShiftExpressionContext)_localctx).r = additiveExpression(0);
						((ShiftExpressionContext)_localctx).ret =  new BinaryExpression(((ShiftExpressionContext)_localctx).l.ret, BinaryOperator.RIGHT_LOGICAL_SHIFT, ((ShiftExpressionContext)_localctx).r.ret);
						}
						break;
					}
					} 
				}
				setState(3813);
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
			setState(3815);
			((AdditiveExpressionContext)_localctx).ex = multiplicativeExpression(0);
			((AdditiveExpressionContext)_localctx).ret =  ((AdditiveExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3830);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3828);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(3818);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3819);
						match(ADD);
						setState(3820);
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
						setState(3823);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3824);
						match(SUB);
						setState(3825);
						((AdditiveExpressionContext)_localctx).r = multiplicativeExpression(0);
						((AdditiveExpressionContext)_localctx).ret =  new BinaryExpression(((AdditiveExpressionContext)_localctx).l.ret, BinaryOperator.SUBTRACTION, ((AdditiveExpressionContext)_localctx).r.ret);
						}
						break;
					}
					} 
				}
				setState(3832);
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
			setState(3834);
			((MultiplicativeExpressionContext)_localctx).ex = unaryExpression();
			((MultiplicativeExpressionContext)_localctx).ret =  ((MultiplicativeExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3854);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3852);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(3837);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(3838);
						match(MUL);
						setState(3839);
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
						setState(3842);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3843);
						match(DIV);
						setState(3844);
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
						setState(3847);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3848);
						match(MOD);
						setState(3849);
						((MultiplicativeExpressionContext)_localctx).r = unaryExpression();
						((MultiplicativeExpressionContext)_localctx).ret =  new BinaryExpression(((MultiplicativeExpressionContext)_localctx).l.ret, BinaryOperator.MODULUS, ((MultiplicativeExpressionContext)_localctx).r.ret);
						}
						break;
					}
					} 
				}
				setState(3856);
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
			setState(3874);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(3857);
				((UnaryExpressionContext)_localctx).pi = preIncrementExpression();
				((UnaryExpressionContext)_localctx).ret =  ((UnaryExpressionContext)_localctx).pi.ret;
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(3860);
				((UnaryExpressionContext)_localctx).pd = preDecrementExpression();
				((UnaryExpressionContext)_localctx).ret =  ((UnaryExpressionContext)_localctx).pd.ret;
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(3863);
				match(ADD);
				setState(3864);
				((UnaryExpressionContext)_localctx).ex = unaryExpression();
				((UnaryExpressionContext)_localctx).ret =  ((UnaryExpressionContext)_localctx).ex.ret;
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(3867);
				match(SUB);
				setState(3868);
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
				setState(3871);
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
			setState(3876);
			match(INC);
			setState(3877);
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
			setState(3880);
			match(DEC);
			setState(3881);
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
			setState(3898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3884);
				((UnaryExpressionNotPlusMinusContext)_localctx).pf = postfixExpression();
				((UnaryExpressionNotPlusMinusContext)_localctx).ret =  ((UnaryExpressionNotPlusMinusContext)_localctx).pf.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3887);
				match(TILDE);
				setState(3888);
				((UnaryExpressionNotPlusMinusContext)_localctx).ex = unaryExpression();
				((UnaryExpressionNotPlusMinusContext)_localctx).ret =  new UnaryExpression(((UnaryExpressionNotPlusMinusContext)_localctx).ex.ret, UnaryOperator.BITWISE_NEGATION);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3891);
				match(BANG);
				setState(3892);
				((UnaryExpressionNotPlusMinusContext)_localctx).ex = unaryExpression();
				((UnaryExpressionNotPlusMinusContext)_localctx).ret =  new UnaryExpression(((UnaryExpressionNotPlusMinusContext)_localctx).ex.ret, UnaryOperator.NEGATION);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3895);
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
			setState(3906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				{
				setState(3900);
				((PostfixExpressionContext)_localctx).p = primary();
				((PostfixExpressionContext)_localctx).ret =  ((PostfixExpressionContext)_localctx).p.ret;
				}
				break;
			case 2:
				{
				setState(3903);
				((PostfixExpressionContext)_localctx).n = expressionName();
				((PostfixExpressionContext)_localctx).ret =  new IdentifierExpression(((PostfixExpressionContext)_localctx).n.ret);
				}
				break;
			}
			setState(3916);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(3914);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(3908);
						((PostfixExpressionContext)_localctx).op1 = postIncrementExpression_lf_postfixExpression();
						((PostfixExpressionContext)_localctx).ret =  new UnaryExpression(_localctx.ret, ((PostfixExpressionContext)_localctx).op1.ret);
						}
						break;
					case DEC:
						{
						setState(3911);
						((PostfixExpressionContext)_localctx).op2 = postDecrementExpression_lf_postfixExpression();
						((PostfixExpressionContext)_localctx).ret =  new UnaryExpression(_localctx.ret, ((PostfixExpressionContext)_localctx).op2.ret);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(3918);
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
			setState(3919);
			((PostIncrementExpressionContext)_localctx).ex = postfixExpression();
			setState(3920);
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
			setState(3923);
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
			setState(3926);
			((PostDecrementExpressionContext)_localctx).ex = postfixExpression();
			setState(3927);
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
			setState(3930);
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
		public List<ReferenceType> ls = new ArrayList<>();
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
			setState(3969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3933);
				match(LPAREN);
				setState(3934);
				((CastExpressionContext)_localctx).pt = primitiveType();
				setState(3935);
				match(RPAREN);
				setState(3936);
				((CastExpressionContext)_localctx).uex = unaryExpression();
				((CastExpressionContext)_localctx).ret =  new CastExpression(((CastExpressionContext)_localctx).uex.ret, ((CastExpressionContext)_localctx).pt.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3939);
				match(LPAREN);
				setState(3940);
				((CastExpressionContext)_localctx).rt = referenceType();
				_localctx.ls.add(((CastExpressionContext)_localctx).rt.ret);
				setState(3947);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(3942);
					((CastExpressionContext)_localctx).b = additionalBound();
					_localctx.ls.add(((CastExpressionContext)_localctx).b.ret);
					}
					}
					setState(3949);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3950);
				match(RPAREN);
				setState(3951);
				((CastExpressionContext)_localctx).npm = unaryExpressionNotPlusMinus();
				((CastExpressionContext)_localctx).ret =  new CastExpression(((CastExpressionContext)_localctx).npm.ret, _localctx.ls);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3954);
				match(LPAREN);
				setState(3955);
				((CastExpressionContext)_localctx).rt = referenceType();
				_localctx.ls.add(((CastExpressionContext)_localctx).rt.ret);
				setState(3962);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(3957);
					((CastExpressionContext)_localctx).b = additionalBound();
					_localctx.ls.add(((CastExpressionContext)_localctx).b.ret);
					}
					}
					setState(3964);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3965);
				match(RPAREN);
				setState(3966);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3m\u0f86\4\2\t\2\4"+
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
		"\n\n\f\n\16\n\u024a\13\n\3\n\3\n\3\n\3\n\5\n\u0250\n\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\7\n\u0258\n\n\f\n\16\n\u025b\13\n\3\n\3\n\3\n\3\n\5\n\u0261\n"+
		"\n\3\n\3\n\5\n\u0265\n\n\3\13\3\13\3\13\3\13\7\13\u026b\n\13\f\13\16\13"+
		"\u026e\13\13\3\13\3\13\3\13\3\13\5\13\u0274\n\13\3\13\3\13\3\f\3\f\3\f"+
		"\7\f\u027b\n\f\f\f\16\f\u027e\13\f\3\f\3\f\3\f\3\f\5\f\u0284\n\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\7\20\u0294"+
		"\n\20\f\20\16\20\u0297\13\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u02a8\n\21\3\22\7\22\u02ab\n\22"+
		"\f\22\16\22\u02ae\13\22\3\22\3\22\3\22\3\22\7\22\u02b4\n\22\f\22\16\22"+
		"\u02b7\13\22\3\22\3\22\3\22\7\22\u02bc\n\22\f\22\16\22\u02bf\13\22\3\23"+
		"\3\23\3\23\7\23\u02c4\n\23\f\23\16\23\u02c7\13\23\3\23\3\23\3\23\3\23"+
		"\5\23\u02cd\n\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\7\25\u02de\n\25\f\25\16\25\u02e1\13\25\3\25\3\25"+
		"\5\25\u02e5\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\7\30\u02f6\n\30\f\30\16\30\u02f9\13\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0303\n\31\3\32\3\32\3\32\7\32\u0308"+
		"\n\32\f\32\16\32\u030b\13\32\3\32\3\32\3\32\5\32\u0310\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u031a\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\7\34\u0324\n\34\f\34\16\34\u0327\13\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u0330\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\7\36\u033a\n\36\f\36\16\36\u033d\13\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u0346\n\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\7!\u0353\n"+
		"!\f!\16!\u0356\13!\3\"\3\"\3\"\5\"\u035b\n\"\3\"\3\"\3\"\7\"\u0360\n\""+
		"\f\"\16\"\u0363\13\"\3\"\3\"\3\"\7\"\u0368\n\"\f\"\16\"\u036b\13\"\3\""+
		"\3\"\3\"\3#\3#\3#\7#\u0373\n#\f#\16#\u0376\13#\3#\3#\3#\3#\3#\3#\3#\7"+
		"#\u037f\n#\f#\16#\u0382\13#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\5%\u0396\n%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\5"+
		"*\u03bb\n*\3+\3+\3+\3+\3+\3+\5+\u03c3\n+\3,\3,\3,\7,\u03c8\n,\f,\16,\u03cb"+
		"\13,\3,\3,\3,\3,\3,\5,\u03d2\n,\3,\3,\3,\5,\u03d7\n,\3,\3,\3,\5,\u03dc"+
		"\n,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u03f2"+
		"\n-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\7/\u0400\n/\f/\16/\u0403\13/\3"+
		"/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\7\62\u0416\n\62\f\62\16\62\u0419\13\62\3\62\3\62\3\63\3\63"+
		"\7\63\u041f\n\63\f\63\16\63\u0422\13\63\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0430\n\64\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u043f\n\65\3\66\3\66\3\66"+
		"\7\66\u0444\n\66\f\66\16\66\u0447\13\66\3\66\3\66\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\5\67\u045f\n\67\38\38\38\38\38\38\38\78\u0468\n8\f8\168\u046b"+
		"\138\38\38\39\39\39\39\39\59\u0474\n9\39\39\3:\3:\3:\3:\5:\u047c\n:\3"+
		":\3:\3;\3;\3;\3;\3;\3;\5;\u0486\n;\3<\3<\3<\3<\3<\3<\5<\u048e\n<\3=\3"+
		"=\3=\3=\3=\5=\u0495\n=\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u04a0\n>\3?\3?\3"+
		"?\3?\3?\3?\5?\u04a8\n?\3?\3?\3?\3?\3?\3?\7?\u04b0\n?\f?\16?\u04b3\13?"+
		"\3@\3@\3@\3@\5@\u04b9\n@\3@\3@\3@\3@\3@\3@\7@\u04c1\n@\f@\16@\u04c4\13"+
		"@\3@\3@\3@\3@\5@\u04ca\n@\3@\3@\5@\u04ce\n@\3A\3A\3A\3A\7A\u04d4\nA\f"+
		"A\16A\u04d7\13A\3A\3A\3A\3A\5A\u04dd\nA\3A\3A\3B\3B\3B\3B\5B\u04e5\nB"+
		"\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\5G\u0501\nG\3H\3H\3H\7H\u0506\nH\fH\16H\u0509\13H\3H\3H\3H\3"+
		"H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5"+
		"I\u0525\nI\3J\3J\3J\3J\3J\3J\5J\u052d\nJ\3J\3J\3J\3J\3J\7J\u0534\nJ\f"+
		"J\16J\u0537\13J\3J\3J\3J\3J\3J\3J\3J\5J\u0540\nJ\5J\u0542\nJ\3K\3K\3K"+
		"\3K\3K\5K\u0549\nK\3L\3L\3L\3L\3L\3L\5L\u0551\nL\3L\3L\3L\3L\5L\u0557"+
		"\nL\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u0567\nM\3N\3N\3N\3N"+
		"\3N\3N\3N\7N\u0570\nN\fN\16N\u0573\13N\3N\3N\3N\3N\3N\3N\3N\3N\3N\7N\u057e"+
		"\nN\fN\16N\u0581\13N\3N\3N\5N\u0585\nN\3O\3O\3O\7O\u058a\nO\fO\16O\u058d"+
		"\13O\3O\3O\3O\3O\3P\3P\3P\3P\3P\5P\u0598\nP\3Q\3Q\3Q\7Q\u059d\nQ\fQ\16"+
		"Q\u05a0\13Q\3Q\3Q\3Q\3Q\7Q\u05a6\nQ\fQ\16Q\u05a9\13Q\3Q\3Q\3Q\3Q\3Q\3"+
		"Q\3Q\5Q\u05b2\nQ\3R\3R\3R\7R\u05b7\nR\fR\16R\u05ba\13R\3R\3R\3R\3R\5R"+
		"\u05c0\nR\3R\3R\3R\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\7T\u05d0\nT\fT\16"+
		"T\u05d3\13T\3T\3T\3U\3U\3U\3U\3U\3U\5U\u05dd\nU\3V\3V\3V\3V\5V\u05e3\n"+
		"V\3W\3W\3W\3X\3X\3X\3X\3Y\3Y\3Y\7Y\u05ef\nY\fY\16Y\u05f2\13Y\3Y\3Y\3Y"+
		"\3Y\3Y\5Y\u05f9\nY\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0607\nZ\3["+
		"\3[\3[\5[\u060c\n[\3[\3[\3[\3[\3[\3[\5[\u0614\n[\3[\3[\3\\\3\\\3\\\3]"+
		"\3]\3]\3]\3]\5]\u0620\n]\3]\3]\3]\5]\u0625\n]\3]\3]\3^\3^\3^\5^\u062c"+
		"\n^\3^\3^\3^\3^\3^\5^\u0633\n^\3^\3^\3^\3^\3^\3^\5^\u063b\n^\3^\3^\3^"+
		"\3^\3^\5^\u0642\n^\3^\3^\3^\3^\3^\3^\3^\3^\5^\u064c\n^\3^\3^\3^\3^\3^"+
		"\5^\u0653\n^\3^\3^\3^\3^\3^\3^\3^\3^\3^\5^\u065e\n^\3^\3^\3^\3^\3^\5^"+
		"\u0665\n^\3^\3^\3^\3^\5^\u066b\n^\3_\3_\3_\7_\u0670\n_\f_\16_\u0673\13"+
		"_\3_\3_\3_\3_\3_\5_\u067a\n_\3_\3_\3_\3`\3`\5`\u0681\n`\3`\5`\u0684\n"+
		"`\3`\5`\u0687\n`\3`\3`\3a\3a\3a\7a\u068e\na\fa\16a\u0691\13a\3b\3b\3b"+
		"\7b\u0696\nb\fb\16b\u0699\13b\3b\3b\3b\3b\3b\5b\u06a0\nb\3b\5b\u06a3\n"+
		"b\3b\3b\5b\u06a7\nb\3c\3c\3c\3d\3d\7d\u06ae\nd\fd\16d\u06b1\13d\3e\3e"+
		"\3e\3e\3e\3e\5e\u06b9\ne\3f\3f\3f\7f\u06be\nf\ff\16f\u06c1\13f\3f\3f\3"+
		"f\3f\3f\5f\u06c8\nf\3f\3f\3f\5f\u06cd\nf\3f\3f\3f\3g\3g\3g\3g\3g\3g\3"+
		"g\3g\3g\3g\3g\3g\3g\3g\3g\5g\u06e1\ng\3h\3h\3h\3h\3i\3i\7i\u06e9\ni\f"+
		"i\16i\u06ec\13i\3i\3i\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\5j\u06fd"+
		"\nj\3k\3k\3k\7k\u0702\nk\fk\16k\u0705\13k\3k\3k\3k\3k\3k\3l\3l\3l\3l\3"+
		"l\3l\3l\3l\3l\5l\u0715\nl\3m\3m\3m\7m\u071a\nm\fm\16m\u071d\13m\3m\3m"+
		"\3m\3m\3m\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\5n\u0731\nn\3o\3o\3o"+
		"\7o\u0736\no\fo\16o\u0739\13o\3o\3o\3o\3o\3o\3o\3p\3p\7p\u0743\np\fp\16"+
		"p\u0746\13p\3p\3p\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\5q\u0757\nq\3"+
		"r\3r\3r\7r\u075c\nr\fr\16r\u075f\13r\3r\3r\3r\3r\3r\3r\3r\5r\u0768\nr"+
		"\3r\3r\3r\5r\u076d\nr\3r\3r\3r\3s\3s\3s\3s\3s\3s\3s\5s\u0779\ns\3t\3t"+
		"\3t\3t\3u\3u\3u\3u\3u\3u\3u\3u\3u\5u\u0788\nu\3v\3v\3v\3v\3v\5v\u078f"+
		"\nv\3v\3v\3w\3w\3w\7w\u0796\nw\fw\16w\u0799\13w\3x\3x\3x\3x\3x\3y\3y\3"+
		"y\3y\3y\3y\3y\3y\3y\5y\u07a9\ny\3z\3z\3z\3z\5z\u07af\nz\3z\5z\u07b2\n"+
		"z\3z\3z\3z\3{\3{\3{\3{\3{\3{\3{\7{\u07be\n{\f{\16{\u07c1\13{\3{\3{\3|"+
		"\3|\3|\3|\3}\3}\3}\3}\3}\3}\3}\3~\3~\3~\3~\5~\u07d4\n~\3~\5~\u07d7\n~"+
		"\3~\3~\3~\3\177\3\177\3\177\3\177\3\177\3\177\3\177\7\177\u07e3\n\177"+
		"\f\177\16\177\u07e6\13\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\5\u0080\u07ef\n\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\7\u0081\u07f9\n\u0081\f\u0081\16\u0081\u07fc"+
		"\13\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\5\u0082\u0809\n\u0082\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0084\3\u0084\3\u0084\7\u0084\u0812\n\u0084\f\u0084\16\u0084"+
		"\u0815\13\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u082d\n\u0085"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u083e\n\u0086"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u0862"+
		"\n\u0087\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008b\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\5\u008c\u0889\n\u008c\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u08b0\n\u0090"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\7\u0092\u08bd\n\u0092\f\u0092\16\u0092\u08c0\13\u0092"+
		"\3\u0092\3\u0092\3\u0092\7\u0092\u08c5\n\u0092\f\u0092\16\u0092\u08c8"+
		"\13\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\7\u0094\u08d7\n\u0094\f\u0094"+
		"\16\u0094\u08da\13\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\5\u0095\u08eb\n\u0095\3\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a"+
		"\u090d\n\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\5\u009b"+
		"\u0915\n\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u091c\n"+
		"\u009c\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u0922\n\u009c\3\u009c\3"+
		"\u009c\3\u009c\3\u009c\5\u009c\u0928\n\u009c\3\u009c\3\u009c\3\u009c\3"+
		"\u009c\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\5\u009d\u0933\n\u009d\3"+
		"\u009d\3\u009d\3\u009d\3\u009d\5\u009d\u0939\n\u009d\3\u009d\3\u009d\3"+
		"\u009d\3\u009d\5\u009d\u093f\n\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3"+
		"\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u094b\n\u009e\3"+
		"\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\7\u00a0\u0957\n\u00a0\f\u00a0\16\u00a0\u095a\13\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\7\u00a1\u0963\n\u00a1"+
		"\f\u00a1\16\u00a1\u0966\13\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\7\u00a2"+
		"\u0975\n\u00a2\f\u00a2\16\u00a2\u0978\13\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3\5\u00a3"+
		"\u0985\n\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\5\u00a4"+
		"\u098d\n\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\5\u00a5\u0996\n\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\5\u00a8\u09b1\n\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\5\u00a8\u09b9\n\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\7\u00a9\u09c0\n\u00a9\f\u00a9\16\u00a9\u09c3\13\u00a9\3\u00a9\3\u00a9"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00ab"+
		"\3\u00ab\3\u00ab\7\u00ab\u09d2\n\u00ab\f\u00ab\16\u00ab\u09d5\13\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\7\u00ac\u09e2\n\u00ac\f\u00ac\16\u00ac\u09e5\13\u00ac"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\5\u00ae\u09f1\n\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u09f6\n"+
		"\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af"+
		"\5\u00af\u0a00\n\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b0\7\u00b0\u0a0a\n\u00b0\f\u00b0\16\u00b0\u0a0d\13\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b1\7\u00b1\u0a14\n\u00b1\f\u00b1"+
		"\16\u00b1\u0a17\13\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u0a25\n\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\7\u00b2\u0a2a\n\u00b2\f\u00b2\16\u00b2\u0a2d"+
		"\13\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\5\u00b3\u0a4b\n\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\7\u00b4\u0a51\n\u00b4\f\u00b4\16\u00b4\u0a54\13\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\5\u00b4\u0a63\n\u00b4\3\u00b5\3\u00b5\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u0a80\n\u00b6\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0a91\n\u00b7\3\u00b8"+
		"\3\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u0aa1\n\u00b9\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\7\u00ba"+
		"\u0aad\n\u00ba\f\u00ba\16\u00ba\u0ab0\13\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0acc\n\u00ba\3\u00bb"+
		"\3\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\7\u00bc\u0ada\n\u00bc\f\u00bc\16\u00bc\u0add\13\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u0af6\n\u00bc\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0afc\n\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\7\u00bd\u0b01\n\u00bd\f\u00bd\16\u00bd\u0b04\13\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\7\u00bd\u0b0c\n\u00bd\f\u00bd\16\u00bd"+
		"\u0b0f\13\u00bd\3\u00bd\3\u00bd\7\u00bd\u0b13\n\u00bd\f\u00bd\16\u00bd"+
		"\u0b16\13\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0b1b\n\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0b21\n\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\5\u00bd\u0b26\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\5\u00bd\u0b2e\n\u00bd\3\u00bd\3\u00bd\3\u00bd\7\u00bd\u0b33\n\u00bd\f"+
		"\u00bd\16\u00bd\u0b36\13\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd"+
		"\u0b3c\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0b42\n\u00bd\3"+
		"\u00bd\3\u00bd\3\u00bd\5\u00bd\u0b47\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3"+
		"\u00bd\3\u00bd\3\u00bd\5\u00bd\u0b4f\n\u00bd\3\u00bd\3\u00bd\3\u00bd\7"+
		"\u00bd\u0b54\n\u00bd\f\u00bd\16\u00bd\u0b57\13\u00bd\3\u00bd\3\u00bd\3"+
		"\u00bd\3\u00bd\5\u00bd\u0b5d\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5"+
		"\u00bd\u0b63\n\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0b68\n\u00bd\5\u00bd"+
		"\u0b6a\n\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0b71\n"+
		"\u00be\3\u00be\3\u00be\3\u00be\7\u00be\u0b76\n\u00be\f\u00be\16\u00be"+
		"\u0b79\13\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0b7f\n\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0b85\n\u00be\3\u00be\3\u00be"+
		"\3\u00be\5\u00be\u0b8a\n\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf"+
		"\u0b90\n\u00bf\3\u00bf\3\u00bf\3\u00bf\7\u00bf\u0b95\n\u00bf\f\u00bf\16"+
		"\u00bf\u0b98\13\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\7\u00bf\u0ba0\n\u00bf\f\u00bf\16\u00bf\u0ba3\13\u00bf\3\u00bf\3\u00bf"+
		"\7\u00bf\u0ba7\n\u00bf\f\u00bf\16\u00bf\u0baa\13\u00bf\3\u00bf\3\u00bf"+
		"\3\u00bf\5\u00bf\u0baf\n\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf"+
		"\u0bb5\n\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u0bba\n\u00bf\3\u00bf\3"+
		"\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u0bc2\n\u00bf\3\u00bf\3"+
		"\u00bf\3\u00bf\7\u00bf\u0bc7\n\u00bf\f\u00bf\16\u00bf\u0bca\13\u00bf\3"+
		"\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u0bd0\n\u00bf\3\u00bf\3\u00bf\3"+
		"\u00bf\3\u00bf\5\u00bf\u0bd6\n\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u0bdb"+
		"\n\u00bf\5\u00bf\u0bdd\n\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\5\u00c0\u0be5\n\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\5\u00c1\u0bf7\n\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\5\u00c3\u0c08\n\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4"+
		"\u0c16\n\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\7\u00c4"+
		"\u0c1e\n\u00c4\f\u00c4\16\u00c4\u0c21\13\u00c4\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\7\u00c5\u0c2f\n\u00c5\f\u00c5\16\u00c5\u0c32\13\u00c5\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\5\u00c6\u0c40\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\7\u00c6\u0c48\n\u00c6\f\u00c6\16\u00c6\u0c4b\13\u00c6\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0c52\n\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0c5c\n\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0c63\n\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0c6d"+
		"\n\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0c74\n\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7"+
		"\u0c7e\n\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0c85\n"+
		"\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\5\u00c7\u0c8f\n\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7"+
		"\u0c96\n\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\5\u00c7\u0ca1\n\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\5\u00c7\u0ca8\n\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0cad\n"+
		"\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0cb3\n\u00c8\3\u00c8\3"+
		"\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0cba\n\u00c8\3\u00c8\3\u00c8\3"+
		"\u00c8\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0cc4\n\u00c9\3"+
		"\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9"+
		"\u0cce\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0cd5\n"+
		"\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\5\u00c9\u0cdf\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9"+
		"\u0ce6\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\5\u00c9\u0cf0\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\5\u00c9\u0cf7\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0d02\n\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00c9\5\u00c9\u0d09\n\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9"+
		"\u0d0e\n\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\7\u00ca\u0d17\n\u00ca\f\u00ca\16\u00ca\u0d1a\13\u00ca\3\u00ca\3\u00ca"+
		"\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u0d23\n\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u0d2d"+
		"\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\5\u00cb\u0d37\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\5\u00cb\u0d41\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u0d4c\n\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u0d56"+
		"\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\5\u00cb\u0d60\n\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u0d66\n"+
		"\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\5\u00cd\u0d70\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\5\u00cd\u0d7a\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0d84\n\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0d8f"+
		"\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\5\u00cd\u0d99\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\5\u00cd\u0da3\n\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\5\u00ce\u0dab\n\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u0db5\n\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u0dc5\n\u00ce\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\7\u00cf\u0dcc\n\u00cf\f\u00cf\16\u00cf\u0dcf\13\u00cf"+
		"\3\u00d0\3\u00d0\3\u00d0\7\u00d0\u0dd4\n\u00d0\f\u00d0\16\u00d0\u0dd7"+
		"\13\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d1\3\u00d1\3\u00d1"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\5\u00d2\u0de7\n\u00d2"+
		"\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0df5\n\u00d4\3\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0dfd\n\u00d4\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\7\u00d5\u0e05\n\u00d5\f\u00d5\16\u00d5\u0e08"+
		"\13\u00d5\3\u00d5\3\u00d5\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\5\u00d6\u0e12\n\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7"+
		"\5\u00d7\u0e1a\n\u00d7\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\5\u00d9"+
		"\u0e2a\n\u00d9\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\5\u00da"+
		"\u0e44\n\u00da\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db"+
		"\3\u00db\3\u00db\3\u00db\5\u00db\u0e50\n\u00db\3\u00dc\3\u00dc\3\u00dc"+
		"\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\7\u00dc\u0e5b\n\u00dc"+
		"\f\u00dc\16\u00dc\u0e5e\13\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\7\u00dd\u0e69\n\u00dd\f\u00dd\16\u00dd"+
		"\u0e6c\13\u00dd\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de"+
		"\3\u00de\3\u00de\7\u00de\u0e77\n\u00de\f\u00de\16\u00de\u0e7a\13\u00de"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\7\u00df\u0e85\n\u00df\f\u00df\16\u00df\u0e88\13\u00df\3\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\7\u00e0\u0e93"+
		"\n\u00e0\f\u00e0\16\u00e0\u0e96\13\u00e0\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\7\u00e1\u0ea6\n\u00e1\f\u00e1\16\u00e1\u0ea9\13\u00e1\3\u00e2"+
		"\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e2\7\u00e2\u0ec8\n\u00e2\f\u00e2\16\u00e2\u0ecb\13\u00e2\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\3\u00e3\7\u00e3\u0ee4\n\u00e3\f\u00e3\16\u00e3"+
		"\u0ee7\13\u00e3\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\7\u00e4\u0ef7"+
		"\n\u00e4\f\u00e4\16\u00e4\u0efa\13\u00e4\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\7\u00e5\u0f0f\n\u00e5"+
		"\f\u00e5\16\u00e5\u0f12\13\u00e5\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6"+
		"\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6"+
		"\3\u00e6\3\u00e6\3\u00e6\5\u00e6\u0f25\n\u00e6\3\u00e7\3\u00e7\3\u00e7"+
		"\3\u00e7\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e9\3\u00e9\3\u00e9\3\u00e9"+
		"\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9"+
		"\3\u00e9\5\u00e9\u0f3d\n\u00e9\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea"+
		"\3\u00ea\5\u00ea\u0f45\n\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea"+
		"\3\u00ea\7\u00ea\u0f4d\n\u00ea\f\u00ea\16\u00ea\u0f50\13\u00ea\3\u00eb"+
		"\3\u00eb\3\u00eb\3\u00eb\3\u00ec\3\u00ec\3\u00ec\3\u00ed\3\u00ed\3\u00ed"+
		"\3\u00ed\3\u00ee\3\u00ee\3\u00ee\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef"+
		"\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\7\u00ef\u0f6c"+
		"\n\u00ef\f\u00ef\16\u00ef\u0f6f\13\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef"+
		"\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\7\u00ef\u0f7b\n\u00ef"+
		"\f\u00ef\16\u00ef\u0f7e\13\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\5\u00ef"+
		"\u0f84\n\u00ef\3\u00ef\2\17\66:@\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2"+
		"\u01c4\u01c6\u01c8\u00f0\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c"+
		"\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144"+
		"\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c"+
		"\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174"+
		"\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c"+
		"\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4"+
		"\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc"+
		"\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4"+
		"\u01d6\u01d8\u01da\u01dc\2\2\u1082\2\u01ea\3\2\2\2\4\u01f2\3\2\2\2\6\u0209"+
		"\3\2\2\2\b\u0211\3\2\2\2\n\u021d\3\2\2\2\f\u0223\3\2\2\2\16\u022e\3\2"+
		"\2\2\20\u0236\3\2\2\2\22\u0264\3\2\2\2\24\u0266\3\2\2\2\26\u027c\3\2\2"+
		"\2\30\u0287\3\2\2\2\32\u028a\3\2\2\2\34\u028d\3\2\2\2\36\u0295\3\2\2\2"+
		" \u02a7\3\2\2\2\"\u02ac\3\2\2\2$\u02c5\3\2\2\2&\u02d0\3\2\2\2(\u02e4\3"+
		"\2\2\2*\u02e6\3\2\2\2,\u02ea\3\2\2\2.\u02ef\3\2\2\2\60\u0302\3\2\2\2\62"+
		"\u0309\3\2\2\2\64\u0319\3\2\2\2\66\u031b\3\2\2\28\u032f\3\2\2\2:\u0331"+
		"\3\2\2\2<\u0345\3\2\2\2>\u0347\3\2\2\2@\u034a\3\2\2\2B\u035a\3\2\2\2D"+
		"\u0374\3\2\2\2F\u0386\3\2\2\2H\u0395\3\2\2\2J\u0397\3\2\2\2L\u039c\3\2"+
		"\2\2N\u03a3\3\2\2\2P\u03ab\3\2\2\2R\u03ba\3\2\2\2T\u03c2\3\2\2\2V\u03c9"+
		"\3\2\2\2X\u03f1\3\2\2\2Z\u03f3\3\2\2\2\\\u03f8\3\2\2\2^\u0406\3\2\2\2"+
		"`\u040a\3\2\2\2b\u040e\3\2\2\2d\u041c\3\2\2\2f\u042f\3\2\2\2h\u043e\3"+
		"\2\2\2j\u0445\3\2\2\2l\u045e\3\2\2\2n\u0460\3\2\2\2p\u046e\3\2\2\2r\u0477"+
		"\3\2\2\2t\u0485\3\2\2\2v\u048d\3\2\2\2x\u0494\3\2\2\2z\u049f\3\2\2\2|"+
		"\u04a7\3\2\2\2~\u04cd\3\2\2\2\u0080\u04cf\3\2\2\2\u0082\u04e0\3\2\2\2"+
		"\u0084\u04e8\3\2\2\2\u0086\u04eb\3\2\2\2\u0088\u04ee\3\2\2\2\u008a\u04f1"+
		"\3\2\2\2\u008c\u0500\3\2\2\2\u008e\u0507\3\2\2\2\u0090\u0524\3\2\2\2\u0092"+
		"\u0541\3\2\2\2\u0094\u0548\3\2\2\2\u0096\u054a\3\2\2\2\u0098\u0566\3\2"+
		"\2\2\u009a\u0584\3\2\2\2\u009c\u058b\3\2\2\2\u009e\u0597\3\2\2\2\u00a0"+
		"\u05b1\3\2\2\2\u00a2\u05b8\3\2\2\2\u00a4\u05c4\3\2\2\2\u00a6\u05c8\3\2"+
		"\2\2\u00a8\u05dc\3\2\2\2\u00aa\u05e2\3\2\2\2\u00ac\u05e4\3\2\2\2\u00ae"+
		"\u05e7\3\2\2\2\u00b0\u05f0\3\2\2\2\u00b2\u0606\3\2\2\2\u00b4\u060b\3\2"+
		"\2\2\u00b6\u0617\3\2\2\2\u00b8\u061a\3\2\2\2\u00ba\u066a\3\2\2\2\u00bc"+
		"\u0671\3\2\2\2\u00be\u067e\3\2\2\2\u00c0\u068a\3\2\2\2\u00c2\u0697\3\2"+
		"\2\2\u00c4\u06a8\3\2\2\2\u00c6\u06ab\3\2\2\2\u00c8\u06b8\3\2\2\2\u00ca"+
		"\u06bf\3\2\2\2\u00cc\u06e0\3\2\2\2\u00ce\u06e2\3\2\2\2\u00d0\u06e6\3\2"+
		"\2\2\u00d2\u06fc\3\2\2\2\u00d4\u0703\3\2\2\2\u00d6\u0714\3\2\2\2\u00d8"+
		"\u071b\3\2\2\2\u00da\u0730\3\2\2\2\u00dc\u0737\3\2\2\2\u00de\u0740\3\2"+
		"\2\2\u00e0\u0756\3\2\2\2\u00e2\u075d\3\2\2\2\u00e4\u0778\3\2\2\2\u00e6"+
		"\u077a\3\2\2\2\u00e8\u0787\3\2\2\2\u00ea\u0789\3\2\2\2\u00ec\u0792\3\2"+
		"\2\2\u00ee\u079a\3\2\2\2\u00f0\u07a8\3\2\2\2\u00f2\u07aa\3\2\2\2\u00f4"+
		"\u07b6\3\2\2\2\u00f6\u07c4\3\2\2\2\u00f8\u07c8\3\2\2\2\u00fa\u07cf\3\2"+
		"\2\2\u00fc\u07db\3\2\2\2\u00fe\u07e9\3\2\2\2\u0100\u07f2\3\2\2\2\u0102"+
		"\u0808\3\2\2\2\u0104\u080a\3\2\2\2\u0106\u0813\3\2\2\2\u0108\u082c\3\2"+
		"\2\2\u010a\u083d\3\2\2\2\u010c\u0861\3\2\2\2\u010e\u0863\3\2\2\2\u0110"+
		"\u0865\3\2\2\2\u0112\u086a\3\2\2\2\u0114\u086f\3\2\2\2\u0116\u0888\3\2"+
		"\2\2\u0118\u088a\3\2\2\2\u011a\u0891\3\2\2\2\u011c\u089a\3\2\2\2\u011e"+
		"\u08af\3\2\2\2\u0120\u08b1\3\2\2\2\u0122\u08b8\3\2\2\2\u0124\u08cc\3\2"+
		"\2\2\u0126\u08d0\3\2\2\2\u0128\u08ea\3\2\2\2\u012a\u08ec\3\2\2\2\u012c"+
		"\u08ef\3\2\2\2\u012e\u08f6\3\2\2\2\u0130\u08fd\3\2\2\2\u0132\u090c\3\2"+
		"\2\2\u0134\u0914\3\2\2\2\u0136\u0916\3\2\2\2\u0138\u092d\3\2\2\2\u013a"+
		"\u094a\3\2\2\2\u013c\u094c\3\2\2\2\u013e\u094f\3\2\2\2\u0140\u095d\3\2"+
		"\2\2\u0142\u096f\3\2\2\2\u0144\u0981\3\2\2\2\u0146\u0989\3\2\2\2\u0148"+
		"\u0991\3\2\2\2\u014a\u099a\3\2\2\2\u014c\u099f\3\2\2\2\u014e\u09b8\3\2"+
		"\2\2\u0150\u09ba\3\2\2\2\u0152\u09c6\3\2\2\2\u0154\u09d3\3\2\2\2\u0156"+
		"\u09da\3\2\2\2\u0158\u09e6\3\2\2\2\u015a\u09ea\3\2\2\2\u015c\u09f9\3\2"+
		"\2\2\u015e\u0a03\3\2\2\2\u0160\u0a15\3\2\2\2\u0162\u0a24\3\2\2\2\u0164"+
		"\u0a4a\3\2\2\2\u0166\u0a62\3\2\2\2\u0168\u0a64\3\2\2\2\u016a\u0a7f\3\2"+
		"\2\2\u016c\u0a90\3\2\2\2\u016e\u0a92\3\2\2\2\u0170\u0aa0\3\2\2\2\u0172"+
		"\u0acb\3\2\2\2\u0174\u0acd\3\2\2\2\u0176\u0af5\3\2\2\2\u0178\u0b69\3\2"+
		"\2\2\u017a\u0b6b\3\2\2\2\u017c\u0bdc\3\2\2\2\u017e\u0be4\3\2\2\2\u0180"+
		"\u0bf6\3\2\2\2\u0182\u0bf8\3\2\2\2\u0184\u0c07\3\2\2\2\u0186\u0c15\3\2"+
		"\2\2\u0188\u0c22\3\2\2\2\u018a\u0c3f\3\2\2\2\u018c\u0cac\3\2\2\2\u018e"+
		"\u0cae\3\2\2\2\u0190\u0d0d\3\2\2\2\u0192\u0d0f\3\2\2\2\u0194\u0d5f\3\2"+
		"\2\2\u0196\u0d61\3\2\2\2\u0198\u0da2\3\2\2\2\u019a\u0dc4\3\2\2\2\u019c"+
		"\u0dc6\3\2\2\2\u019e\u0dd5\3\2\2\2\u01a0\u0ddd\3\2\2\2\u01a2\u0de6\3\2"+
		"\2\2\u01a4\u0de8\3\2\2\2\u01a6\u0dfc\3\2\2\2\u01a8\u0dfe\3\2\2\2\u01aa"+
		"\u0e11\3\2\2\2\u01ac\u0e19\3\2\2\2\u01ae\u0e1b\3\2\2\2\u01b0\u0e29\3\2"+
		"\2\2\u01b2\u0e43\3\2\2\2\u01b4\u0e4f\3\2\2\2\u01b6\u0e51\3\2\2\2\u01b8"+
		"\u0e5f\3\2\2\2\u01ba\u0e6d\3\2\2\2\u01bc\u0e7b\3\2\2\2\u01be\u0e89\3\2"+
		"\2\2\u01c0\u0e97\3\2\2\2\u01c2\u0eaa\3\2\2\2\u01c4\u0ecc\3\2\2\2\u01c6"+
		"\u0ee8\3\2\2\2\u01c8\u0efb\3\2\2\2\u01ca\u0f24\3\2\2\2\u01cc\u0f26\3\2"+
		"\2\2\u01ce\u0f2a\3\2\2\2\u01d0\u0f3c\3\2\2\2\u01d2\u0f44\3\2\2\2\u01d4"+
		"\u0f51\3\2\2\2\u01d6\u0f55\3\2\2\2\u01d8\u0f58\3\2\2\2\u01da\u0f5c\3\2"+
		"\2\2\u01dc\u0f83\3\2\2\2\u01de\u01df\7\65\2\2\u01df\u01eb\b\2\1\2\u01e0"+
		"\u01e1\7\66\2\2\u01e1\u01eb\b\2\1\2\u01e2\u01e3\7\67\2\2\u01e3\u01eb\b"+
		"\2\1\2\u01e4\u01e5\78\2\2\u01e5\u01eb\b\2\1\2\u01e6\u01e7\79\2\2\u01e7"+
		"\u01eb\b\2\1\2\u01e8\u01e9\7:\2\2\u01e9\u01eb\b\2\1\2\u01ea\u01de\3\2"+
		"\2\2\u01ea\u01e0\3\2\2\2\u01ea\u01e2\3\2\2\2\u01ea\u01e4\3\2\2\2\u01ea"+
		"\u01e6\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\3\3\2\2\2\u01ec\u01ed\5\6\4\2"+
		"\u01ed\u01ee\b\3\1\2\u01ee\u01f3\3\2\2\2\u01ef\u01f0\5\16\b\2\u01f0\u01f1"+
		"\b\3\1\2\u01f1\u01f3\3\2\2\2\u01f2\u01ec\3\2\2\2\u01f2\u01ef\3\2\2\2\u01f3"+
		"\5\3\2\2\2\u01f4\u01f5\5\u00e8u\2\u01f5\u01f6\b\4\1\2\u01f6\u01f8\3\2"+
		"\2\2\u01f7\u01f4\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9"+
		"\u01fa\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01fd\5\b"+
		"\5\2\u01fd\u01fe\b\4\1\2\u01fe\u020a\3\2\2\2\u01ff\u0200\5\u00e8u\2\u0200"+
		"\u0201\b\4\1\2\u0201\u0203\3\2\2\2\u0202\u01ff\3\2\2\2\u0203\u0206\3\2"+
		"\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0207\3\2\2\2\u0206"+
		"\u0204\3\2\2\2\u0207\u0208\7\5\2\2\u0208\u020a\b\4\1\2\u0209\u01f9\3\2"+
		"\2\2\u0209\u0204\3\2\2\2\u020a\7\3\2\2\2\u020b\u020c\5\n\6\2\u020c\u020d"+
		"\b\5\1\2\u020d\u0212\3\2\2\2\u020e\u020f\5\f\7\2\u020f\u0210\b\5\1\2\u0210"+
		"\u0212\3\2\2\2\u0211\u020b\3\2\2\2\u0211\u020e\3\2\2\2\u0212\t\3\2\2\2"+
		"\u0213\u0214\7\7\2\2\u0214\u021e\b\6\1\2\u0215\u0216\7\'\2\2\u0216\u021e"+
		"\b\6\1\2\u0217\u0218\7\35\2\2\u0218\u021e\b\6\1\2\u0219\u021a\7\37\2\2"+
		"\u021a\u021e\b\6\1\2\u021b\u021c\7\n\2\2\u021c\u021e\b\6\1\2\u021d\u0213"+
		"\3\2\2\2\u021d\u0215\3\2\2\2\u021d\u0217\3\2\2\2\u021d\u0219\3\2\2\2\u021d"+
		"\u021b\3\2\2\2\u021e\13\3\2\2\2\u021f\u0220\7\26\2\2\u0220\u0224\b\7\1"+
		"\2\u0221\u0222\7\20\2\2\u0222\u0224\b\7\1\2\u0223\u021f\3\2\2\2\u0223"+
		"\u0221\3\2\2\2\u0224\r\3\2\2\2\u0225\u0226\5\20\t\2\u0226\u0227\b\b\1"+
		"\2\u0227\u022f\3\2\2\2\u0228\u0229\5\36\20\2\u0229\u022a\b\b\1\2\u022a"+
		"\u022f\3\2\2\2\u022b\u022c\5 \21\2\u022c\u022d\b\b\1\2\u022d\u022f\3\2"+
		"\2\2\u022e\u0225\3\2\2\2\u022e\u0228\3\2\2\2\u022e\u022b\3\2\2\2\u022f"+
		"\17\3\2\2\2\u0230\u0231\5\26\f\2\u0231\u0232\b\t\1\2\u0232\u0237\3\2\2"+
		"\2\u0233\u0234\5\34\17\2\u0234\u0235\b\t\1\2\u0235\u0237\3\2\2\2\u0236"+
		"\u0230\3\2\2\2\u0236\u0233\3\2\2\2\u0237\u0240\3\2\2\2\u0238\u0239\5\24"+
		"\13\2\u0239\u023a\b\t\1\2\u023a\u023f\3\2\2\2\u023b\u023c\5\32\16\2\u023c"+
		"\u023d\b\t\1\2\u023d\u023f\3\2\2\2\u023e\u0238\3\2\2\2\u023e\u023b\3\2"+
		"\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\21\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0244\5\u00e8u\2\u0244\u0245\b\n"+
		"\1\2\u0245\u0247\3\2\2\2\u0246\u0243\3\2\2\2\u0247\u024a\3\2\2\2\u0248"+
		"\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024b\3\2\2\2\u024a\u0248\3\2"+
		"\2\2\u024b\u024f\7h\2\2\u024c\u024d\5,\27\2\u024d\u024e\b\n\1\2\u024e"+
		"\u0250\3\2\2\2\u024f\u024c\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\3\2"+
		"\2\2\u0251\u0265\b\n\1\2\u0252\u0253\5\20\t\2\u0253\u0259\7C\2\2\u0254"+
		"\u0255\5\u00e8u\2\u0255\u0256\b\n\1\2\u0256\u0258\3\2\2\2\u0257\u0254"+
		"\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"\u025c\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u0260\7h\2\2\u025d\u025e\5,\27"+
		"\2\u025e\u025f\b\n\1\2\u025f\u0261\3\2\2\2\u0260\u025d\3\2\2\2\u0260\u0261"+
		"\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0263\b\n\1\2\u0263\u0265\3\2\2\2\u0264"+
		"\u0248\3\2\2\2\u0264\u0252\3\2\2\2\u0265\23\3\2\2\2\u0266\u026c\7C\2\2"+
		"\u0267\u0268\5\u00e8u\2\u0268\u0269\b\13\1\2\u0269\u026b\3\2\2\2\u026a"+
		"\u0267\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2"+
		"\2\2\u026d\u026f\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0273\7h\2\2\u0270"+
		"\u0271\5,\27\2\u0271\u0272\b\13\1\2\u0272\u0274\3\2\2\2\u0273\u0270\3"+
		"\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276\b\13\1\2\u0276"+
		"\25\3\2\2\2\u0277\u0278\5\u00e8u\2\u0278\u0279\b\f\1\2\u0279\u027b\3\2"+
		"\2\2\u027a\u0277\3\2\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c"+
		"\u027d\3\2\2\2\u027d\u027f\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0283\7h"+
		"\2\2\u0280\u0281\5,\27\2\u0281\u0282\b\f\1\2\u0282\u0284\3\2\2\2\u0283"+
		"\u0280\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\b\f"+
		"\1\2\u0286\27\3\2\2\2\u0287\u0288\5\22\n\2\u0288\u0289\b\r\1\2\u0289\31"+
		"\3\2\2\2\u028a\u028b\5\24\13\2\u028b\u028c\b\16\1\2\u028c\33\3\2\2\2\u028d"+
		"\u028e\5\26\f\2\u028e\u028f\b\17\1\2\u028f\35\3\2\2\2\u0290\u0291\5\u00e8"+
		"u\2\u0291\u0292\b\20\1\2\u0292\u0294\3\2\2\2\u0293\u0290\3\2\2\2\u0294"+
		"\u0297\3\2\2\2\u0295\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0298\3\2"+
		"\2\2\u0297\u0295\3\2\2\2\u0298\u0299\7h\2\2\u0299\u029a\b\20\1\2\u029a"+
		"\37\3\2\2\2\u029b\u029c\5\6\4\2\u029c\u029d\5\"\22\2\u029d\u029e\b\21"+
		"\1\2\u029e\u02a8\3\2\2\2\u029f\u02a0\5\20\t\2\u02a0\u02a1\5\"\22\2\u02a1"+
		"\u02a2\b\21\1\2\u02a2\u02a8\3\2\2\2\u02a3\u02a4\5\36\20\2\u02a4\u02a5"+
		"\5\"\22\2\u02a5\u02a6\b\21\1\2\u02a6\u02a8\3\2\2\2\u02a7\u029b\3\2\2\2"+
		"\u02a7\u029f\3\2\2\2\u02a7\u02a3\3\2\2\2\u02a8!\3\2\2\2\u02a9\u02ab\5"+
		"\u00e8u\2\u02aa\u02a9\3\2\2\2\u02ab\u02ae\3\2\2\2\u02ac\u02aa\3\2\2\2"+
		"\u02ac\u02ad\3\2\2\2\u02ad\u02af\3\2\2\2\u02ae\u02ac\3\2\2\2\u02af\u02b0"+
		"\7?\2\2\u02b0\u02b1\7@\2\2\u02b1\u02bd\b\22\1\2\u02b2\u02b4\5\u00e8u\2"+
		"\u02b3\u02b2\3\2\2\2\u02b4\u02b7\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6"+
		"\3\2\2\2\u02b6\u02b8\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8\u02b9\7?\2\2\u02b9"+
		"\u02ba\7@\2\2\u02ba\u02bc\b\22\1\2\u02bb\u02b5\3\2\2\2\u02bc\u02bf\3\2"+
		"\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be#\3\2\2\2\u02bf\u02bd"+
		"\3\2\2\2\u02c0\u02c1\5&\24\2\u02c1\u02c2\b\23\1\2\u02c2\u02c4\3\2\2\2"+
		"\u02c3\u02c0\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6"+
		"\3\2\2\2\u02c6\u02c8\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8\u02cc\7h\2\2\u02c9"+
		"\u02ca\5(\25\2\u02ca\u02cb\b\23\1\2\u02cb\u02cd\3\2\2\2\u02cc\u02c9\3"+
		"\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf\b\23\1\2\u02cf"+
		"%\3\2\2\2\u02d0\u02d1\5\u00e8u\2\u02d1\u02d2\b\24\1\2\u02d2\'\3\2\2\2"+
		"\u02d3\u02d4\7\23\2\2\u02d4\u02d5\5\36\20\2\u02d5\u02d6\b\25\1\2\u02d6"+
		"\u02e5\3\2\2\2\u02d7\u02d8\7\23\2\2\u02d8\u02d9\5\20\t\2\u02d9\u02df\b"+
		"\25\1\2\u02da\u02db\5*\26\2\u02db\u02dc\b\25\1\2\u02dc\u02de\3\2\2\2\u02dd"+
		"\u02da\3\2\2\2\u02de\u02e1\3\2\2\2\u02df\u02dd\3\2\2\2\u02df\u02e0\3\2"+
		"\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02df\3\2\2\2\u02e2\u02e3\b\25\1\2\u02e3"+
		"\u02e5\3\2\2\2\u02e4\u02d3\3\2\2\2\u02e4\u02d7\3\2\2\2\u02e5)\3\2\2\2"+
		"\u02e6\u02e7\7W\2\2\u02e7\u02e8\5\30\r\2\u02e8\u02e9\b\26\1\2\u02e9+\3"+
		"\2\2\2\u02ea\u02eb\7F\2\2\u02eb\u02ec\5.\30\2\u02ec\u02ed\7E\2\2\u02ed"+
		"\u02ee\b\27\1\2\u02ee-\3\2\2\2\u02ef\u02f0\5\60\31\2\u02f0\u02f7\b\30"+
		"\1\2\u02f1\u02f2\7B\2\2\u02f2\u02f3\5\60\31\2\u02f3\u02f4\b\30\1\2\u02f4"+
		"\u02f6\3\2\2\2\u02f5\u02f1\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f5\3\2"+
		"\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fa\3\2\2\2\u02f9\u02f7\3\2\2\2\u02fa"+
		"\u02fb\b\30\1\2\u02fb/\3\2\2\2\u02fc\u02fd\5\16\b\2\u02fd\u02fe\b\31\1"+
		"\2\u02fe\u0303\3\2\2\2\u02ff\u0300\5\62\32\2\u0300\u0301\b\31\1\2\u0301"+
		"\u0303\3\2\2\2\u0302\u02fc\3\2\2\2\u0302\u02ff\3\2\2\2\u0303\61\3\2\2"+
		"\2\u0304\u0305\5\u00e8u\2\u0305\u0306\b\32\1\2\u0306\u0308\3\2\2\2\u0307"+
		"\u0304\3\2\2\2\u0308\u030b\3\2\2\2\u0309\u0307\3\2\2\2\u0309\u030a\3\2"+
		"\2\2\u030a\u030c\3\2\2\2\u030b\u0309\3\2\2\2\u030c\u030d\7I\2\2\u030d"+
		"\u030f\b\32\1\2\u030e\u0310\5\64\33\2\u030f\u030e\3\2\2\2\u030f\u0310"+
		"\3\2\2\2\u0310\63\3\2\2\2\u0311\u0312\7\23\2\2\u0312\u0313\5\16\b\2\u0313"+
		"\u0314\b\33\1\2\u0314\u031a\3\2\2\2\u0315\u0316\7*\2\2\u0316\u0317\5\16"+
		"\b\2\u0317\u0318\b\33\1\2\u0318\u031a\3\2\2\2\u0319\u0311\3\2\2\2\u0319"+
		"\u0315\3\2\2\2\u031a\65\3\2\2\2\u031b\u031c\b\34\1\2\u031c\u031d\7h\2"+
		"\2\u031d\u031e\b\34\1\2\u031e\u0325\3\2\2\2\u031f\u0320\f\3\2\2\u0320"+
		"\u0321\7C\2\2\u0321\u0322\7h\2\2\u0322\u0324\b\34\1\2\u0323\u031f\3\2"+
		"\2\2\u0324\u0327\3\2\2\2\u0325\u0323\3\2\2\2\u0325\u0326\3\2\2\2\u0326"+
		"\67\3\2\2\2\u0327\u0325\3\2\2\2\u0328\u0329\7h\2\2\u0329\u0330\b\35\1"+
		"\2\u032a\u032b\5:\36\2\u032b\u032c\7C\2\2\u032c\u032d\7h\2\2\u032d\u032e"+
		"\b\35\1\2\u032e\u0330\3\2\2\2\u032f\u0328\3\2\2\2\u032f\u032a\3\2\2\2"+
		"\u03309\3\2\2\2\u0331\u0332\b\36\1\2\u0332\u0333\7h\2\2\u0333\u0334\b"+
		"\36\1\2\u0334\u033b\3\2\2\2\u0335\u0336\f\3\2\2\u0336\u0337\7C\2\2\u0337"+
		"\u0338\7h\2\2\u0338\u033a\b\36\1\2\u0339\u0335\3\2\2\2\u033a\u033d\3\2"+
		"\2\2\u033b\u0339\3\2\2\2\u033b\u033c\3\2\2\2\u033c;\3\2\2\2\u033d\u033b"+
		"\3\2\2\2\u033e\u033f\7h\2\2\u033f\u0346\b\37\1\2\u0340\u0341\5@!\2\u0341"+
		"\u0342\7C\2\2\u0342\u0343\7h\2\2\u0343\u0344\b\37\1\2\u0344\u0346\3\2"+
		"\2\2\u0345\u033e\3\2\2\2\u0345\u0340\3\2\2\2\u0346=\3\2\2\2\u0347\u0348"+
		"\7h\2\2\u0348\u0349\b \1\2\u0349?\3\2\2\2\u034a\u034b\b!\1\2\u034b\u034c"+
		"\7h\2\2\u034c\u034d\b!\1\2\u034d\u0354\3\2\2\2\u034e\u034f\f\3\2\2\u034f"+
		"\u0350\7C\2\2\u0350\u0351\7h\2\2\u0351\u0353\b!\1\2\u0352\u034e\3\2\2"+
		"\2\u0353\u0356\3\2\2\2\u0354\u0352\3\2\2\2\u0354\u0355\3\2\2\2\u0355A"+
		"\3\2\2\2\u0356\u0354\3\2\2\2\u0357\u0358\5D#\2\u0358\u0359\b\"\1\2\u0359"+
		"\u035b\3\2\2\2\u035a\u0357\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u0361\3\2"+
		"\2\2\u035c\u035d\5H%\2\u035d\u035e\b\"\1\2\u035e\u0360\3\2\2\2\u035f\u035c"+
		"\3\2\2\2\u0360\u0363\3\2\2\2\u0361\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362"+
		"\u0369\3\2\2\2\u0363\u0361\3\2\2\2\u0364\u0365\5R*\2\u0365\u0366\b\"\1"+
		"\2\u0366\u0368\3\2\2\2\u0367\u0364\3\2\2\2\u0368\u036b\3\2\2\2\u0369\u0367"+
		"\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036c\3\2\2\2\u036b\u0369\3\2\2\2\u036c"+
		"\u036d\7\2\2\3\u036d\u036e\b\"\1\2\u036eC\3\2\2\2\u036f\u0370\5F$\2\u0370"+
		"\u0371\b#\1\2\u0371\u0373\3\2\2\2\u0372\u036f\3\2\2\2\u0373\u0376\3\2"+
		"\2\2\u0374\u0372\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0377\3\2\2\2\u0376"+
		"\u0374\3\2\2\2\u0377\u0378\7\"\2\2\u0378\u0379\7h\2\2\u0379\u037a\b#\1"+
		"\2\u037a\u0380\3\2\2\2\u037b\u037c\7C\2\2\u037c\u037d\7h\2\2\u037d\u037f"+
		"\b#\1\2\u037e\u037b\3\2\2\2\u037f\u0382\3\2\2\2\u0380\u037e\3\2\2\2\u0380"+
		"\u0381\3\2\2\2\u0381\u0383\3\2\2\2\u0382\u0380\3\2\2\2\u0383\u0384\7A"+
		"\2\2\u0384\u0385\b#\1\2\u0385E\3\2\2\2\u0386\u0387\5\u00e8u\2\u0387\u0388"+
		"\b$\1\2\u0388G\3\2\2\2\u0389\u038a\5J&\2\u038a\u038b\b%\1\2\u038b\u0396"+
		"\3\2\2\2\u038c\u038d\5L\'\2\u038d\u038e\b%\1\2\u038e\u0396\3\2\2\2\u038f"+
		"\u0390\5N(\2\u0390\u0391\b%\1\2\u0391\u0396\3\2\2\2\u0392\u0393\5P)\2"+
		"\u0393\u0394\b%\1\2\u0394\u0396\3\2\2\2\u0395\u0389\3\2\2\2\u0395\u038c"+
		"\3\2\2\2\u0395\u038f\3\2\2\2\u0395\u0392\3\2\2\2\u0396I\3\2\2\2\u0397"+
		"\u0398\7\33\2\2\u0398\u0399\58\35\2\u0399\u039a\7A\2\2\u039a\u039b\b&"+
		"\1\2\u039bK\3\2\2\2\u039c\u039d\7\33\2\2\u039d\u039e\5:\36\2\u039e\u039f"+
		"\7C\2\2\u039f\u03a0\7U\2\2\u03a0\u03a1\7A\2\2\u03a1\u03a2\b\'\1\2\u03a2"+
		"M\3\2\2\2\u03a3\u03a4\7\33\2\2\u03a4\u03a5\7(\2\2\u03a5\u03a6\58\35\2"+
		"\u03a6\u03a7\7C\2\2\u03a7\u03a8\7h\2\2\u03a8\u03a9\7A\2\2\u03a9\u03aa"+
		"\b(\1\2\u03aaO\3\2\2\2\u03ab\u03ac\7\33\2\2\u03ac\u03ad\7(\2\2\u03ad\u03ae"+
		"\58\35\2\u03ae\u03af\7C\2\2\u03af\u03b0\7U\2\2\u03b0\u03b1\7A\2\2\u03b1"+
		"\u03b2\b)\1\2\u03b2Q\3\2\2\2\u03b3\u03b4\5T+\2\u03b4\u03b5\b*\1\2\u03b5"+
		"\u03bb\3\2\2\2\u03b6\u03b7\5\u00c8e\2\u03b7\u03b8\b*\1\2\u03b8\u03bb\3"+
		"\2\2\2\u03b9\u03bb\7A\2\2\u03ba\u03b3\3\2\2\2\u03ba\u03b6\3\2\2\2\u03ba"+
		"\u03b9\3\2\2\2\u03bbS\3\2\2\2\u03bc\u03bd\5V,\2\u03bd\u03be\b+\1\2\u03be"+
		"\u03c3\3\2\2\2\u03bf\u03c0\5\u00bc_\2\u03c0\u03c1\b+\1\2\u03c1\u03c3\3"+
		"\2\2\2\u03c2\u03bc\3\2\2\2\u03c2\u03bf\3\2\2\2\u03c3U\3\2\2\2\u03c4\u03c5"+
		"\5X-\2\u03c5\u03c6\b,\1\2\u03c6\u03c8\3\2\2\2\u03c7\u03c4\3\2\2\2\u03c8"+
		"\u03cb\3\2\2\2\u03c9\u03c7\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cc\3\2"+
		"\2\2\u03cb\u03c9\3\2\2\2\u03cc\u03cd\7\13\2\2\u03cd\u03d1\7h\2\2\u03ce"+
		"\u03cf\5Z.\2\u03cf\u03d0\b,\1\2\u03d0\u03d2\3\2\2\2\u03d1\u03ce\3\2\2"+
		"\2\u03d1\u03d2\3\2\2\2\u03d2\u03d6\3\2\2\2\u03d3\u03d4\5^\60\2\u03d4\u03d5"+
		"\b,\1\2\u03d5\u03d7\3\2\2\2\u03d6\u03d3\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7"+
		"\u03db\3\2\2\2\u03d8\u03d9\5`\61\2\u03d9\u03da\b,\1\2\u03da\u03dc\3\2"+
		"\2\2\u03db\u03d8\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd"+
		"\u03de\b,\1\2\u03de\u03df\5d\63\2\u03dfW\3\2\2\2\u03e0\u03e1\5\u00e8u"+
		"\2\u03e1\u03e2\b-\1\2\u03e2\u03f2\3\2\2\2\u03e3\u03e4\7%\2\2\u03e4\u03f2"+
		"\b-\1\2\u03e5\u03e6\7$\2\2\u03e6\u03f2\b-\1\2\u03e7\u03e8\7#\2\2\u03e8"+
		"\u03f2\b-\1\2\u03e9\u03ea\7\3\2\2\u03ea\u03f2\b-\1\2\u03eb\u03ec\7(\2"+
		"\2\u03ec\u03f2\b-\1\2\u03ed\u03ee\7\24\2\2\u03ee\u03f2\b-\1\2\u03ef\u03f0"+
		"\7)\2\2\u03f0\u03f2\b-\1\2\u03f1\u03e0\3\2\2\2\u03f1\u03e3\3\2\2\2\u03f1"+
		"\u03e5\3\2\2\2\u03f1\u03e7\3\2\2\2\u03f1\u03e9\3\2\2\2\u03f1\u03eb\3\2"+
		"\2\2\u03f1\u03ed\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f2Y\3\2\2\2\u03f3\u03f4"+
		"\7F\2\2\u03f4\u03f5\5\\/\2\u03f5\u03f6\7E\2\2\u03f6\u03f7\b.\1\2\u03f7"+
		"[\3\2\2\2\u03f8\u03f9\5$\23\2\u03f9\u03fa\b/\1\2\u03fa\u0401\3\2\2\2\u03fb"+
		"\u03fc\7B\2\2\u03fc\u03fd\5$\23\2\u03fd\u03fe\b/\1\2\u03fe\u0400\3\2\2"+
		"\2\u03ff\u03fb\3\2\2\2\u0400\u0403\3\2\2\2\u0401\u03ff\3\2\2\2\u0401\u0402"+
		"\3\2\2\2\u0402\u0404\3\2\2\2\u0403\u0401\3\2\2\2\u0404\u0405\b/\1\2\u0405"+
		"]\3\2\2\2\u0406\u0407\7\23\2\2\u0407\u0408\5\22\n\2\u0408\u0409\b\60\1"+
		"\2\u0409_\3\2\2\2\u040a\u040b\7\32\2\2\u040b\u040c\5b\62\2\u040c\u040d"+
		"\b\61\1\2\u040da\3\2\2\2\u040e\u040f\5\30\r\2\u040f\u0410\b\62\1\2\u0410"+
		"\u0417\3\2\2\2\u0411\u0412\7B\2\2\u0412\u0413\5\30\r\2\u0413\u0414\b\62"+
		"\1\2\u0414\u0416\3\2\2\2\u0415\u0411\3\2\2\2\u0416\u0419\3\2\2\2\u0417"+
		"\u0415\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u041a\3\2\2\2\u0419\u0417\3\2"+
		"\2\2\u041a\u041b\b\62\1\2\u041bc\3\2\2\2\u041c\u0420\7=\2\2\u041d\u041f"+
		"\5f\64\2\u041e\u041d\3\2\2\2\u041f\u0422\3\2\2\2\u0420\u041e\3\2\2\2\u0420"+
		"\u0421\3\2\2\2\u0421\u0423\3\2\2\2\u0422\u0420\3\2\2\2\u0423\u0424\7>"+
		"\2\2\u0424e\3\2\2\2\u0425\u0430\5h\65\2\u0426\u0427\5\u00acW\2\u0427\u0428"+
		"\b\64\1\2\u0428\u0430\3\2\2\2\u0429\u042a\5\u00aeX\2\u042a\u042b\b\64"+
		"\1\2\u042b\u0430\3\2\2\2\u042c\u042d\5\u00b0Y\2\u042d\u042e\b\64\1\2\u042e"+
		"\u0430\3\2\2\2\u042f\u0425\3\2\2\2\u042f\u0426\3\2\2\2\u042f\u0429\3\2"+
		"\2\2\u042f\u042c\3\2\2\2\u0430g\3\2\2\2\u0431\u0432\5j\66\2\u0432\u0433"+
		"\b\65\1\2\u0433\u043f\3\2\2\2\u0434\u0435\5\u008eH\2\u0435\u0436\b\65"+
		"\1\2\u0436\u043f\3\2\2\2\u0437\u0438\5T+\2\u0438\u0439\b\65\1\2\u0439"+
		"\u043f\3\2\2\2\u043a\u043b\5\u00c8e\2\u043b\u043c\b\65\1\2\u043c\u043f"+
		"\3\2\2\2\u043d\u043f\7A\2\2\u043e\u0431\3\2\2\2\u043e\u0434\3\2\2\2\u043e"+
		"\u0437\3\2\2\2\u043e\u043a\3\2\2\2\u043e\u043d\3\2\2\2\u043fi\3\2\2\2"+
		"\u0440\u0441\5l\67\2\u0441\u0442\b\66\1\2\u0442\u0444\3\2\2\2\u0443\u0440"+
		"\3\2\2\2\u0444\u0447\3\2\2\2\u0445\u0443\3\2\2\2\u0445\u0446\3\2\2\2\u0446"+
		"\u0448\3\2\2\2\u0447\u0445\3\2\2\2\u0448\u0449\5v<\2\u0449\u044a\5n8\2"+
		"\u044a\u044b\7A\2\2\u044b\u044c\b\66\1\2\u044ck\3\2\2\2\u044d\u044e\5"+
		"\u00e8u\2\u044e\u044f\b\67\1\2\u044f\u045f\3\2\2\2\u0450\u0451\7%\2\2"+
		"\u0451\u045f\b\67\1\2\u0452\u0453\7$\2\2\u0453\u045f\b\67\1\2\u0454\u0455"+
		"\7#\2\2\u0455\u045f\b\67\1\2\u0456\u0457\7(\2\2\u0457\u045f\b\67\1\2\u0458"+
		"\u0459\7\24\2\2\u0459\u045f\b\67\1\2\u045a\u045b\7\60\2\2\u045b\u045f"+
		"\b\67\1\2\u045c\u045d\7\63\2\2\u045d\u045f\b\67\1\2\u045e\u044d\3\2\2"+
		"\2\u045e\u0450\3\2\2\2\u045e\u0452\3\2\2\2\u045e\u0454\3\2\2\2\u045e\u0456"+
		"\3\2\2\2\u045e\u0458\3\2\2\2\u045e\u045a\3\2\2\2\u045e\u045c\3\2\2\2\u045f"+
		"m\3\2\2\2\u0460\u0461\5p9\2\u0461\u0462\b8\1\2\u0462\u0469\3\2\2\2\u0463"+
		"\u0464\7B\2\2\u0464\u0465\5p9\2\u0465\u0466\b8\1\2\u0466\u0468\3\2\2\2"+
		"\u0467\u0463\3\2\2\2\u0468\u046b\3\2\2\2\u0469\u0467\3\2\2\2\u0469\u046a"+
		"\3\2\2\2\u046a\u046c\3\2\2\2\u046b\u0469\3\2\2\2\u046c\u046d\b8\1\2\u046d"+
		"o\3\2\2\2\u046e\u0473\5r:\2\u046f\u0470\7D\2\2\u0470\u0471\5t;\2\u0471"+
		"\u0472\b9\1\2\u0472\u0474\3\2\2\2\u0473\u046f\3\2\2\2\u0473\u0474\3\2"+
		"\2\2\u0474\u0475\3\2\2\2\u0475\u0476\b9\1\2\u0476q\3\2\2\2\u0477\u047b"+
		"\7h\2\2\u0478\u0479\5\"\22\2\u0479\u047a\b:\1\2\u047a\u047c\3\2\2\2\u047b"+
		"\u0478\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047e\b:"+
		"\1\2\u047es\3\2\2\2\u047f\u0480\5\u01a2\u00d2\2\u0480\u0481\b;\1\2\u0481"+
		"\u0486\3\2\2\2\u0482\u0483\5\u00fa~\2\u0483\u0484\b;\1\2\u0484\u0486\3"+
		"\2\2\2\u0485\u047f\3\2\2\2\u0485\u0482\3\2\2\2\u0486u\3\2\2\2\u0487\u0488"+
		"\5x=\2\u0488\u0489\b<\1\2\u0489\u048e\3\2\2\2\u048a\u048b\5z>\2\u048b"+
		"\u048c\b<\1\2\u048c\u048e\3\2\2\2\u048d\u0487\3\2\2\2\u048d\u048a\3\2"+
		"\2\2\u048ew\3\2\2\2\u048f\u0490\5\b\5\2\u0490\u0491\b=\1\2\u0491\u0495"+
		"\3\2\2\2\u0492\u0493\7\5\2\2\u0493\u0495\b=\1\2\u0494\u048f\3\2\2\2\u0494"+
		"\u0492\3\2\2\2\u0495y\3\2\2\2\u0496\u0497\5|?\2\u0497\u0498\b>\1\2\u0498"+
		"\u04a0\3\2\2\2\u0499\u049a\5\u008aF\2\u049a\u049b\b>\1\2\u049b\u04a0\3"+
		"\2\2\2\u049c\u049d\5\u008cG\2\u049d\u049e\b>\1\2\u049e\u04a0\3\2\2\2\u049f"+
		"\u0496\3\2\2\2\u049f\u0499\3\2\2\2\u049f\u049c\3\2\2\2\u04a0{\3\2\2\2"+
		"\u04a1\u04a2\5\u0082B\2\u04a2\u04a3\b?\1\2\u04a3\u04a8\3\2\2\2\u04a4\u04a5"+
		"\5\u0088E\2\u04a5\u04a6\b?\1\2\u04a6\u04a8\3\2\2\2\u04a7\u04a1\3\2\2\2"+
		"\u04a7\u04a4\3\2\2\2\u04a8\u04b1\3\2\2\2\u04a9\u04aa\5\u0080A\2\u04aa"+
		"\u04ab\b?\1\2\u04ab\u04b0\3\2\2\2\u04ac\u04ad\5\u0086D\2\u04ad\u04ae\b"+
		"?\1\2\u04ae\u04b0\3\2\2\2\u04af\u04a9\3\2\2\2\u04af\u04ac\3\2\2\2\u04b0"+
		"\u04b3\3\2\2\2\u04b1\u04af\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2}\3\2\2\2"+
		"\u04b3\u04b1\3\2\2\2\u04b4\u04b8\7h\2\2\u04b5\u04b6\5,\27\2\u04b6\u04b7"+
		"\b@\1\2\u04b7\u04b9\3\2\2\2\u04b8\u04b5\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9"+
		"\u04ba\3\2\2\2\u04ba\u04ce\b@\1\2\u04bb\u04bc\5|?\2\u04bc\u04c2\7C\2\2"+
		"\u04bd\u04be\5\u00e8u\2\u04be\u04bf\b@\1\2\u04bf\u04c1\3\2\2\2\u04c0\u04bd"+
		"\3\2\2\2\u04c1\u04c4\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3"+
		"\u04c5\3\2\2\2\u04c4\u04c2\3\2\2\2\u04c5\u04c9\7h\2\2\u04c6\u04c7\5,\27"+
		"\2\u04c7\u04c8\b@\1\2\u04c8\u04ca\3\2\2\2\u04c9\u04c6\3\2\2\2\u04c9\u04ca"+
		"\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cc\b@\1\2\u04cc\u04ce\3\2\2\2\u04cd"+
		"\u04b4\3\2\2\2\u04cd\u04bb\3\2\2\2\u04ce\177\3\2\2\2\u04cf\u04d5\7C\2"+
		"\2\u04d0\u04d1\5\u00e8u\2\u04d1\u04d2\bA\1\2\u04d2\u04d4\3\2\2\2\u04d3"+
		"\u04d0\3\2\2\2\u04d4\u04d7\3\2\2\2\u04d5\u04d3\3\2\2\2\u04d5\u04d6\3\2"+
		"\2\2\u04d6\u04d8\3\2\2\2\u04d7\u04d5\3\2\2\2\u04d8\u04dc\7h\2\2\u04d9"+
		"\u04da\5,\27\2\u04da\u04db\bA\1\2\u04db\u04dd\3\2\2\2\u04dc\u04d9\3\2"+
		"\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04df\bA\1\2\u04df"+
		"\u0081\3\2\2\2\u04e0\u04e4\7h\2\2\u04e1\u04e2\5,\27\2\u04e2\u04e3\bB\1"+
		"\2\u04e3\u04e5\3\2\2\2\u04e4\u04e1\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e6"+
		"\3\2\2\2\u04e6\u04e7\bB\1\2\u04e7\u0083\3\2\2\2\u04e8\u04e9\5~@\2\u04e9"+
		"\u04ea\bC\1\2\u04ea\u0085\3\2\2\2\u04eb\u04ec\5\u0080A\2\u04ec\u04ed\b"+
		"D\1\2\u04ed\u0087\3\2\2\2\u04ee\u04ef\5\u0082B\2\u04ef\u04f0\bE\1\2\u04f0"+
		"\u0089\3\2\2\2\u04f1\u04f2\7h\2\2\u04f2\u04f3\bF\1\2\u04f3\u008b\3\2\2"+
		"\2\u04f4\u04f5\5x=\2\u04f5\u04f6\5\"\22\2\u04f6\u04f7\bG\1\2\u04f7\u0501"+
		"\3\2\2\2\u04f8\u04f9\5|?\2\u04f9\u04fa\5\"\22\2\u04fa\u04fb\bG\1\2\u04fb"+
		"\u0501\3\2\2\2\u04fc\u04fd\5\u008aF\2\u04fd\u04fe\5\"\22\2\u04fe\u04ff"+
		"\bG\1\2\u04ff\u0501\3\2\2\2\u0500\u04f4\3\2\2\2\u0500\u04f8\3\2\2\2\u0500"+
		"\u04fc\3\2\2\2\u0501\u008d\3\2\2\2\u0502\u0503\5\u0090I\2\u0503\u0504"+
		"\bH\1\2\u0504\u0506\3\2\2\2\u0505\u0502\3\2\2\2\u0506\u0509\3\2\2\2\u0507"+
		"\u0505\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u050a\3\2\2\2\u0509\u0507\3\2"+
		"\2\2\u050a\u050b\bH\1\2\u050b\u050c\5\u0092J\2\u050c\u050d\5\u00aaV\2"+
		"\u050d\u050e\bH\1\2\u050e\u008f\3\2\2\2\u050f\u0510\5\u00e8u\2\u0510\u0511"+
		"\bI\1\2\u0511\u0525\3\2\2\2\u0512\u0513\7%\2\2\u0513\u0525\bI\1\2\u0514"+
		"\u0515\7$\2\2\u0515\u0525\bI\1\2\u0516\u0517\7#\2\2\u0517\u0525\bI\1\2"+
		"\u0518\u0519\7\3\2\2\u0519\u0525\bI\1\2\u051a\u051b\7(\2\2\u051b\u0525"+
		"\bI\1\2\u051c\u051d\7\24\2\2\u051d\u0525\bI\1\2\u051e\u051f\7,\2\2\u051f"+
		"\u0525\bI\1\2\u0520\u0521\7 \2\2\u0521\u0525\bI\1\2\u0522\u0523\7)\2\2"+
		"\u0523\u0525\bI\1\2\u0524\u050f\3\2\2\2\u0524\u0512\3\2\2\2\u0524\u0514"+
		"\3\2\2\2\u0524\u0516\3\2\2\2\u0524\u0518\3\2\2\2\u0524\u051a\3\2\2\2\u0524"+
		"\u051c\3\2\2\2\u0524\u051e\3\2\2\2\u0524\u0520\3\2\2\2\u0524\u0522\3\2"+
		"\2\2\u0525\u0091\3\2\2\2\u0526\u0527\5\u0094K\2\u0527\u0528\bJ\1\2\u0528"+
		"\u052c\5\u0096L\2\u0529\u052a\5\u00a4S\2\u052a\u052b\bJ\1\2\u052b\u052d"+
		"\3\2\2\2\u052c\u0529\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u0542\3\2\2\2\u052e"+
		"\u052f\5Z.\2\u052f\u0535\bJ\1\2\u0530\u0531\5\u00e8u\2\u0531\u0532\bJ"+
		"\1\2\u0532\u0534\3\2\2\2\u0533\u0530\3\2\2\2\u0534\u0537\3\2\2\2\u0535"+
		"\u0533\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u0538\3\2\2\2\u0537\u0535\3\2"+
		"\2\2\u0538\u0539\bJ\1\2\u0539\u053a\5\u0094K\2\u053a\u053b\bJ\1\2\u053b"+
		"\u053f\5\u0096L\2\u053c\u053d\5\u00a4S\2\u053d\u053e\bJ\1\2\u053e\u0540"+
		"\3\2\2\2\u053f\u053c\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0542\3\2\2\2\u0541"+
		"\u0526\3\2\2\2\u0541\u052e\3\2\2\2\u0542\u0093\3\2\2\2\u0543\u0544\5v"+
		"<\2\u0544\u0545\bK\1\2\u0545\u0549\3\2\2\2\u0546\u0547\7\62\2\2\u0547"+
		"\u0549\bK\1\2\u0548\u0543\3\2\2\2\u0548\u0546\3\2\2\2\u0549\u0095\3\2"+
		"\2\2\u054a\u054b\7h\2\2\u054b\u054c\bL\1\2\u054c\u0550\7;\2\2\u054d\u054e"+
		"\5\u0098M\2\u054e\u054f\bL\1\2\u054f\u0551\3\2\2\2\u0550\u054d\3\2\2\2"+
		"\u0550\u0551\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0556\7<\2\2\u0553\u0554"+
		"\5\"\22\2\u0554\u0555\bL\1\2\u0555\u0557\3\2\2\2\u0556\u0553\3\2\2\2\u0556"+
		"\u0557\3\2\2\2\u0557\u0097\3\2\2\2\u0558\u0559\5\u009aN\2\u0559\u055a"+
		"\bM\1\2\u055a\u055b\3\2\2\2\u055b\u055c\7B\2\2\u055c\u055d\5\u00a0Q\2"+
		"\u055d\u055e\bM\1\2\u055e\u055f\3\2\2\2\u055f\u0560\bM\1\2\u0560\u0567"+
		"\3\2\2\2\u0561\u0562\5\u00a0Q\2\u0562\u0563\bM\1\2\u0563\u0564\3\2\2\2"+
		"\u0564\u0565\bM\1\2\u0565\u0567\3\2\2\2\u0566\u0558\3\2\2\2\u0566\u0561"+
		"\3\2\2\2\u0567\u0099\3\2\2\2\u0568\u0569\5\u009cO\2\u0569\u056a\bN\1\2"+
		"\u056a\u0571\3\2\2\2\u056b\u056c\7B\2\2\u056c\u056d\5\u009cO\2\u056d\u056e"+
		"\bN\1\2\u056e\u0570\3\2\2\2\u056f\u056b\3\2\2\2\u0570\u0573\3\2\2\2\u0571"+
		"\u056f\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0574\3\2\2\2\u0573\u0571\3\2"+
		"\2\2\u0574\u0575\bN\1\2\u0575\u0585\3\2\2\2\u0576\u0577\5\u00a2R\2\u0577"+
		"\u0578\bN\1\2\u0578\u057f\3\2\2\2\u0579\u057a\7B\2\2\u057a\u057b\5\u009c"+
		"O\2\u057b\u057c\bN\1\2\u057c\u057e\3\2\2\2\u057d\u0579\3\2\2\2\u057e\u0581"+
		"\3\2\2\2\u057f\u057d\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0582\3\2\2\2\u0581"+
		"\u057f\3\2\2\2\u0582\u0583\bN\1\2\u0583\u0585\3\2\2\2\u0584\u0568\3\2"+
		"\2\2\u0584\u0576\3\2\2\2\u0585\u009b\3\2\2\2\u0586\u0587\5\u009eP\2\u0587"+
		"\u0588\bO\1\2\u0588\u058a\3\2\2\2\u0589\u0586\3\2\2\2\u058a\u058d\3\2"+
		"\2\2\u058b\u0589\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u058e\3\2\2\2\u058d"+
		"\u058b\3\2\2\2\u058e\u058f\5v<\2\u058f\u0590\5r:\2\u0590\u0591\bO\1\2"+
		"\u0591\u009d\3\2\2\2\u0592\u0593\5\u00e8u\2\u0593\u0594\bP\1\2\u0594\u0598"+
		"\3\2\2\2\u0595\u0596\7\24\2\2\u0596\u0598\bP\1\2\u0597\u0592\3\2\2\2\u0597"+
		"\u0595\3\2\2\2\u0598\u009f\3\2\2\2\u0599\u059a\5\u009eP\2\u059a\u059b"+
		"\bQ\1\2\u059b\u059d\3\2\2\2\u059c\u0599\3\2\2\2\u059d\u05a0\3\2\2\2\u059e"+
		"\u059c\3\2\2\2\u059e\u059f\3\2\2\2\u059f\u05a1\3\2\2\2\u05a0\u059e\3\2"+
		"\2\2\u05a1\u05a7\5v<\2\u05a2\u05a3\5\u00e8u\2\u05a3\u05a4\bQ\1\2\u05a4"+
		"\u05a6\3\2\2\2\u05a5\u05a2\3\2\2\2\u05a6\u05a9\3\2\2\2\u05a7\u05a5\3\2"+
		"\2\2\u05a7\u05a8\3\2\2\2\u05a8\u05aa\3\2\2\2\u05a9\u05a7\3\2\2\2\u05aa"+
		"\u05ab\7j\2\2\u05ab\u05ac\5r:\2\u05ac\u05ad\bQ\1\2\u05ad\u05b2\3\2\2\2"+
		"\u05ae\u05af\5\u009cO\2\u05af\u05b0\bQ\1\2\u05b0\u05b2\3\2\2\2\u05b1\u059e"+
		"\3\2\2\2\u05b1\u05ae\3\2\2\2\u05b2\u00a1\3\2\2\2\u05b3\u05b4\5\u00e8u"+
		"\2\u05b4\u05b5\bR\1\2\u05b5\u05b7\3\2\2\2\u05b6\u05b3\3\2\2\2\u05b7\u05ba"+
		"\3\2\2\2\u05b8\u05b6\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05bb\3\2\2\2\u05ba"+
		"\u05b8\3\2\2\2\u05bb\u05bf\5v<\2\u05bc\u05bd\7h\2\2\u05bd\u05be\7C\2\2"+
		"\u05be\u05c0\bR\1\2\u05bf\u05bc\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05c1"+
		"\3\2\2\2\u05c1\u05c2\7-\2\2\u05c2\u05c3\bR\1\2\u05c3\u00a3\3\2\2\2\u05c4"+
		"\u05c5\7/\2\2\u05c5\u05c6\5\u00a6T\2\u05c6\u05c7\bS\1\2\u05c7\u00a5\3"+
		"\2\2\2\u05c8\u05c9\5\u00a8U\2\u05c9\u05ca\bT\1\2\u05ca\u05d1\3\2\2\2\u05cb"+
		"\u05cc\7B\2\2\u05cc\u05cd\5\u00a8U\2\u05cd\u05ce\bT\1\2\u05ce\u05d0\3"+
		"\2\2\2\u05cf\u05cb\3\2\2\2\u05d0\u05d3\3\2\2\2\u05d1\u05cf\3\2\2\2\u05d1"+
		"\u05d2\3\2\2\2\u05d2\u05d4\3\2\2\2\u05d3\u05d1\3\2\2\2\u05d4\u05d5\bT"+
		"\1\2\u05d5\u00a7\3\2\2\2\u05d6\u05d7\5\22\n\2\u05d7\u05d8\bU\1\2\u05d8"+
		"\u05dd\3\2\2\2\u05d9\u05da\5\36\20\2\u05da\u05db\bU\1\2\u05db\u05dd\3"+
		"\2\2\2\u05dc\u05d6\3\2\2\2\u05dc\u05d9\3\2\2\2\u05dd\u00a9\3\2\2\2\u05de"+
		"\u05df\5\u00fe\u0080\2\u05df\u05e0\bV\1\2\u05e0\u05e3\3\2\2\2\u05e1\u05e3"+
		"\7A\2\2\u05e2\u05de\3\2\2\2\u05e2\u05e1\3\2\2\2\u05e3\u00ab\3\2\2\2\u05e4"+
		"\u05e5\5\u00fe\u0080\2\u05e5\u05e6\bW\1\2\u05e6\u00ad\3\2\2\2\u05e7\u05e8"+
		"\7(\2\2\u05e8\u05e9\5\u00fe\u0080\2\u05e9\u05ea\bX\1\2\u05ea\u00af\3\2"+
		"\2\2\u05eb\u05ec\5\u00b2Z\2\u05ec\u05ed\bY\1\2\u05ed\u05ef\3\2\2\2\u05ee"+
		"\u05eb\3\2\2\2\u05ef\u05f2\3\2\2\2\u05f0\u05ee\3\2\2\2\u05f0\u05f1\3\2"+
		"\2\2\u05f1\u05f3\3\2\2\2\u05f2\u05f0\3\2\2\2\u05f3\u05f4\bY\1\2\u05f4"+
		"\u05f8\5\u00b4[\2\u05f5\u05f6\5\u00a4S\2\u05f6\u05f7\bY\1\2\u05f7\u05f9"+
		"\3\2\2\2\u05f8\u05f5\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa"+
		"\u05fb\5\u00b8]\2\u05fb\u05fc\bY\1\2\u05fc\u00b1\3\2\2\2\u05fd\u05fe\5"+
		"\u00e8u\2\u05fe\u05ff\bZ\1\2\u05ff\u0607\3\2\2\2\u0600\u0601\7%\2\2\u0601"+
		"\u0607\bZ\1\2\u0602\u0603\7$\2\2\u0603\u0607\bZ\1\2\u0604\u0605\7#\2\2"+
		"\u0605\u0607\bZ\1\2\u0606\u05fd\3\2\2\2\u0606\u0600\3\2\2\2\u0606\u0602"+
		"\3\2\2\2\u0606\u0604\3\2\2\2\u0607\u00b3\3\2\2\2\u0608\u0609\5Z.\2\u0609"+
		"\u060a\b[\1\2\u060a\u060c\3\2\2\2\u060b\u0608\3\2\2\2\u060b\u060c\3\2"+
		"\2\2\u060c\u060d\3\2\2\2\u060d\u060e\5\u00b6\\\2\u060e\u060f\b[\1\2\u060f"+
		"\u0613\7;\2\2\u0610\u0611\5\u0098M\2\u0611\u0612\b[\1\2\u0612\u0614\3"+
		"\2\2\2\u0613\u0610\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u0615\3\2\2\2\u0615"+
		"\u0616\7<\2\2\u0616\u00b5\3\2\2\2\u0617\u0618\7h\2\2\u0618\u0619\b\\\1"+
		"\2\u0619\u00b7\3\2\2\2\u061a\u061b\b]\1\2\u061b\u061f\7=\2\2\u061c\u061d"+
		"\5\u00ba^\2\u061d\u061e\b]\1\2\u061e\u0620\3\2\2\2\u061f\u061c\3\2\2\2"+
		"\u061f\u0620\3\2\2\2\u0620\u0624\3\2\2\2\u0621\u0622\5\u0100\u0081\2\u0622"+
		"\u0623\b]\1\2\u0623\u0625\3\2\2\2\u0624\u0621\3\2\2\2\u0624\u0625\3\2"+
		"\2\2\u0625\u0626\3\2\2\2\u0626\u0627\7>\2\2\u0627\u00b9\3\2\2\2\u0628"+
		"\u0629\5,\27\2\u0629\u062a\b^\1\2\u062a\u062c\3\2\2\2\u062b\u0628\3\2"+
		"\2\2\u062b\u062c\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u062e\7-\2\2\u062e"+
		"\u0632\7;\2\2\u062f\u0630\5\u0192\u00ca\2\u0630\u0631\b^\1\2\u0631\u0633"+
		"\3\2\2\2\u0632\u062f\3\2\2\2\u0632\u0633\3\2\2\2\u0633\u0634\3\2\2\2\u0634"+
		"\u0635\7<\2\2\u0635\u0636\7A\2\2\u0636\u066b\b^\1\2\u0637\u0638\5,\27"+
		"\2\u0638\u0639\b^\1\2\u0639\u063b\3\2\2\2\u063a\u0637\3\2\2\2\u063a\u063b"+
		"\3\2\2\2\u063b\u063c\3\2\2\2\u063c\u063d\7*\2\2\u063d\u0641\7;\2\2\u063e"+
		"\u063f\5\u0192\u00ca\2\u063f\u0640\b^\1\2\u0640\u0642\3\2\2\2\u0641\u063e"+
		"\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0643\3\2\2\2\u0643\u0644\7<\2\2\u0644"+
		"\u0645\7A\2\2\u0645\u066b\b^\1\2\u0646\u0647\5<\37\2\u0647\u064b\7C\2"+
		"\2\u0648\u0649\5,\27\2\u0649\u064a\b^\1\2\u064a\u064c\3\2\2\2\u064b\u0648"+
		"\3\2\2\2\u064b\u064c\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u064e\7*\2\2\u064e"+
		"\u0652\7;\2\2\u064f\u0650\5\u0192\u00ca\2\u0650\u0651\b^\1\2\u0651\u0653"+
		"\3\2\2\2\u0652\u064f\3\2\2\2\u0652\u0653\3\2\2\2\u0653\u0654\3\2\2\2\u0654"+
		"\u0655\7<\2\2\u0655\u0656\7A\2\2\u0656\u0657\b^\1\2\u0657\u066b\3\2\2"+
		"\2\u0658\u0659\5\u0162\u00b2\2\u0659\u065d\7C\2\2\u065a\u065b\5,\27\2"+
		"\u065b\u065c\b^\1\2\u065c\u065e\3\2\2\2\u065d\u065a\3\2\2\2\u065d\u065e"+
		"\3\2\2\2\u065e\u065f\3\2\2\2\u065f\u0660\7*\2\2\u0660\u0664\7;\2\2\u0661"+
		"\u0662\5\u0192\u00ca\2\u0662\u0663\b^\1\2\u0663\u0665\3\2\2\2\u0664\u0661"+
		"\3\2\2\2\u0664\u0665\3\2\2\2\u0665\u0666\3\2\2\2\u0666\u0667\7<\2\2\u0667"+
		"\u0668\7A\2\2\u0668\u0669\b^\1\2\u0669\u066b\3\2\2\2\u066a\u062b\3\2\2"+
		"\2\u066a\u063a\3\2\2\2\u066a\u0646\3\2\2\2\u066a\u0658\3\2\2\2\u066b\u00bb"+
		"\3\2\2\2\u066c\u066d\5X-\2\u066d\u066e\b_\1\2\u066e\u0670\3\2\2\2\u066f"+
		"\u066c\3\2\2\2\u0670\u0673\3\2\2\2\u0671\u066f\3\2\2\2\u0671\u0672\3\2"+
		"\2\2\u0672\u0674\3\2\2\2\u0673\u0671\3\2\2\2\u0674\u0675\7\22\2\2\u0675"+
		"\u0679\7h\2\2\u0676\u0677\5`\61\2\u0677\u0678\b_\1\2\u0678\u067a\3\2\2"+
		"\2\u0679\u0676\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u067c"+
		"\b_\1\2\u067c\u067d\5\u00be`\2\u067d\u00bd\3\2\2\2\u067e\u0680\7=\2\2"+
		"\u067f\u0681\5\u00c0a\2\u0680\u067f\3\2\2\2\u0680\u0681\3\2\2\2\u0681"+
		"\u0683\3\2\2\2\u0682\u0684\7B\2\2\u0683\u0682\3\2\2\2\u0683\u0684\3\2"+
		"\2\2\u0684\u0686\3\2\2\2\u0685\u0687\5\u00c6d\2\u0686\u0685\3\2\2\2\u0686"+
		"\u0687\3\2\2\2\u0687\u0688\3\2\2\2\u0688\u0689\7>\2\2\u0689\u00bf\3\2"+
		"\2\2\u068a\u068f\5\u00c2b\2\u068b\u068c\7B\2\2\u068c\u068e\5\u00c2b\2"+
		"\u068d\u068b\3\2\2\2\u068e\u0691\3\2\2\2\u068f\u068d\3\2\2\2\u068f\u0690"+
		"\3\2\2\2\u0690\u00c1\3\2\2\2\u0691\u068f\3\2\2\2\u0692\u0693\5\u00c4c"+
		"\2\u0693\u0694\bb\1\2\u0694\u0696\3\2\2\2\u0695\u0692\3\2\2\2\u0696\u0699"+
		"\3\2\2\2\u0697\u0695\3\2\2\2\u0697\u0698\3\2\2\2\u0698\u069a\3\2\2\2\u0699"+
		"\u0697\3\2\2\2\u069a\u06a2\7h\2\2\u069b\u069f\7;\2\2\u069c\u069d\5\u0192"+
		"\u00ca\2\u069d\u069e\bb\1\2\u069e\u06a0\3\2\2\2\u069f\u069c\3\2\2\2\u069f"+
		"\u06a0\3\2\2\2\u06a0\u06a1\3\2\2\2\u06a1\u06a3\7<\2\2\u06a2\u069b\3\2"+
		"\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06a4\3\2\2\2\u06a4\u06a6\bb\1\2\u06a5"+
		"\u06a7\5d\63\2\u06a6\u06a5\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7\u00c3\3\2"+
		"\2\2\u06a8\u06a9\5\u00e8u\2\u06a9\u06aa\bc\1\2\u06aa\u00c5\3\2\2\2\u06ab"+
		"\u06af\7A\2\2\u06ac\u06ae\5f\64\2\u06ad\u06ac\3\2\2\2\u06ae\u06b1\3\2"+
		"\2\2\u06af\u06ad\3\2\2\2\u06af\u06b0\3\2\2\2\u06b0\u00c7\3\2\2\2\u06b1"+
		"\u06af\3\2\2\2\u06b2\u06b3\5\u00caf\2\u06b3\u06b4\be\1\2\u06b4\u06b9\3"+
		"\2\2\2\u06b5\u06b6\5\u00dco\2\u06b6\u06b7\be\1\2\u06b7\u06b9\3\2\2\2\u06b8"+
		"\u06b2\3\2\2\2\u06b8\u06b5\3\2\2\2\u06b9\u00c9\3\2\2\2\u06ba\u06bb\5\u00cc"+
		"g\2\u06bb\u06bc\bf\1\2\u06bc\u06be\3\2\2\2\u06bd\u06ba\3\2\2\2\u06be\u06c1"+
		"\3\2\2\2\u06bf\u06bd\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0\u06c2\3\2\2\2\u06c1"+
		"\u06bf\3\2\2\2\u06c2\u06c3\7\36\2\2\u06c3\u06c7\7h\2\2\u06c4\u06c5\5Z"+
		".\2\u06c5\u06c6\bf\1\2\u06c6\u06c8\3\2\2\2\u06c7\u06c4\3\2\2\2\u06c7\u06c8"+
		"\3\2\2\2\u06c8\u06cc\3\2\2\2\u06c9\u06ca\5\u00ceh\2\u06ca\u06cb\bf\1\2"+
		"\u06cb\u06cd\3\2\2\2\u06cc\u06c9\3\2\2\2\u06cc\u06cd\3\2\2\2\u06cd\u06ce"+
		"\3\2\2\2\u06ce\u06cf\bf\1\2\u06cf\u06d0\5\u00d0i\2\u06d0\u00cb\3\2\2\2"+
		"\u06d1\u06d2\5\u00e8u\2\u06d2\u06d3\bg\1\2\u06d3\u06e1\3\2\2\2\u06d4\u06d5"+
		"\7%\2\2\u06d5\u06e1\bg\1\2\u06d6\u06d7\7$\2\2\u06d7\u06e1\bg\1\2\u06d8"+
		"\u06d9\7#\2\2\u06d9\u06e1\bg\1\2\u06da\u06db\7\3\2\2\u06db\u06e1\bg\1"+
		"\2\u06dc\u06dd\7(\2\2\u06dd\u06e1\bg\1\2\u06de\u06df\7)\2\2\u06df\u06e1"+
		"\bg\1\2\u06e0\u06d1\3\2\2\2\u06e0\u06d4\3\2\2\2\u06e0\u06d6\3\2\2\2\u06e0"+
		"\u06d8\3\2\2\2\u06e0\u06da\3\2\2\2\u06e0\u06dc\3\2\2\2\u06e0\u06de\3\2"+
		"\2\2\u06e1\u00cd\3\2\2\2\u06e2\u06e3\7\23\2\2\u06e3\u06e4\5b\62\2\u06e4"+
		"\u06e5\bh\1\2\u06e5\u00cf\3\2\2\2\u06e6\u06ea\7=\2\2\u06e7\u06e9\5\u00d2"+
		"j\2\u06e8\u06e7\3\2\2\2\u06e9\u06ec\3\2\2\2\u06ea\u06e8\3\2\2\2\u06ea"+
		"\u06eb\3\2\2\2\u06eb\u06ed\3\2\2\2\u06ec\u06ea\3\2\2\2\u06ed\u06ee\7>"+
		"\2\2\u06ee\u00d1\3\2\2\2\u06ef\u06f0\5\u00d4k\2\u06f0\u06f1\bj\1\2\u06f1"+
		"\u06fd\3\2\2\2\u06f2\u06f3\5\u00d8m\2\u06f3\u06f4\bj\1\2\u06f4\u06fd\3"+
		"\2\2\2\u06f5\u06f6\5T+\2\u06f6\u06f7\bj\1\2\u06f7\u06fd\3\2\2\2\u06f8"+
		"\u06f9\5\u00c8e\2\u06f9\u06fa\bj\1\2\u06fa\u06fd\3\2\2\2\u06fb\u06fd\7"+
		"A\2\2\u06fc\u06ef\3\2\2\2\u06fc\u06f2\3\2\2\2\u06fc\u06f5\3\2\2\2\u06fc"+
		"\u06f8\3\2\2\2\u06fc\u06fb\3\2\2\2\u06fd\u00d3\3\2\2\2\u06fe\u06ff\5\u00d6"+
		"l\2\u06ff\u0700\bk\1\2\u0700\u0702\3\2\2\2\u0701\u06fe\3\2\2\2\u0702\u0705"+
		"\3\2\2\2\u0703\u0701\3\2\2\2\u0703\u0704\3\2\2\2\u0704\u0706\3\2\2\2\u0705"+
		"\u0703\3\2\2\2\u0706\u0707\5v<\2\u0707\u0708\5n8\2\u0708\u0709\7A\2\2"+
		"\u0709\u070a\bk\1\2\u070a\u00d5\3\2\2\2\u070b\u070c\5\u00e8u\2\u070c\u070d"+
		"\bl\1\2\u070d\u0715\3\2\2\2\u070e\u070f\7%\2\2\u070f\u0715\bl\1\2\u0710"+
		"\u0711\7(\2\2\u0711\u0715\bl\1\2\u0712\u0713\7\24\2\2\u0713\u0715\bl\1"+
		"\2\u0714\u070b\3\2\2\2\u0714\u070e\3\2\2\2\u0714\u0710\3\2\2\2\u0714\u0712"+
		"\3\2\2\2\u0715\u00d7\3\2\2\2\u0716\u0717\5\u00dan\2\u0717\u0718\bm\1\2"+
		"\u0718\u071a\3\2\2\2\u0719\u0716\3\2\2\2\u071a\u071d\3\2\2\2\u071b\u0719"+
		"\3\2\2\2\u071b\u071c\3\2\2\2\u071c\u071e\3\2\2\2\u071d\u071b\3\2\2\2\u071e"+
		"\u071f\bm\1\2\u071f\u0720\5\u0092J\2\u0720\u0721\5\u00aaV\2\u0721\u0722"+
		"\bm\1\2\u0722\u00d9\3\2\2\2\u0723\u0724\5\u00e8u\2\u0724\u0725\bn\1\2"+
		"\u0725\u0731\3\2\2\2\u0726\u0727\7%\2\2\u0727\u0731\bn\1\2\u0728\u0729"+
		"\7\3\2\2\u0729\u0731\bn\1\2\u072a\u072b\7\16\2\2\u072b\u0731\bn\1\2\u072c"+
		"\u072d\7(\2\2\u072d\u0731\bn\1\2\u072e\u072f\7)\2\2\u072f\u0731\bn\1\2"+
		"\u0730\u0723\3\2\2\2\u0730\u0726\3\2\2\2\u0730\u0728\3\2\2\2\u0730\u072a"+
		"\3\2\2\2\u0730\u072c\3\2\2\2\u0730\u072e\3\2\2\2\u0731\u00db\3\2\2\2\u0732"+
		"\u0733\5\u00ccg\2\u0733\u0734\bo\1\2\u0734\u0736\3\2\2\2\u0735\u0732\3"+
		"\2\2\2\u0736\u0739\3\2\2\2\u0737\u0735\3\2\2\2\u0737\u0738\3\2\2\2\u0738"+
		"\u073a\3\2\2\2\u0739\u0737\3\2\2\2\u073a\u073b\7i\2\2\u073b\u073c\7\36"+
		"\2\2\u073c\u073d\7h\2\2\u073d\u073e\bo\1\2\u073e\u073f\5\u00dep\2\u073f"+
		"\u00dd\3\2\2\2\u0740\u0744\7=\2\2\u0741\u0743\5\u00e0q\2\u0742\u0741\3"+
		"\2\2\2\u0743\u0746\3\2\2\2\u0744\u0742\3\2\2\2\u0744\u0745\3\2\2\2\u0745"+
		"\u0747\3\2\2\2\u0746\u0744\3\2\2\2\u0747\u0748\7>\2\2\u0748\u00df\3\2"+
		"\2\2\u0749\u074a\5\u00e2r\2\u074a\u074b\bq\1\2\u074b\u0757\3\2\2\2\u074c"+
		"\u074d\5\u00d4k\2\u074d\u074e\bq\1\2\u074e\u0757\3\2\2\2\u074f\u0750\5"+
		"T+\2\u0750\u0751\bq\1\2\u0751\u0757\3\2\2\2\u0752\u0753\5\u00c8e\2\u0753"+
		"\u0754\bq\1\2\u0754\u0757\3\2\2\2\u0755\u0757\7A\2\2\u0756\u0749\3\2\2"+
		"\2\u0756\u074c\3\2\2\2\u0756\u074f\3\2\2\2\u0756\u0752\3\2\2\2\u0756\u0755"+
		"\3\2\2\2\u0757\u00e1\3\2\2\2\u0758\u0759\5\u00e4s\2\u0759\u075a\br\1\2"+
		"\u075a\u075c\3\2\2\2\u075b\u0758\3\2\2\2\u075c\u075f\3\2\2\2\u075d\u075b"+
		"\3\2\2\2\u075d\u075e\3\2\2\2\u075e\u0760\3\2\2\2\u075f\u075d\3\2\2\2\u0760"+
		"\u0761\5v<\2\u0761\u0762\7h\2\2\u0762\u0763\7;\2\2\u0763\u0767\7<\2\2"+
		"\u0764\u0765\5\"\22\2\u0765\u0766\br\1\2\u0766\u0768\3\2\2\2\u0767\u0764"+
		"\3\2\2\2\u0767\u0768\3\2\2\2\u0768\u076c\3\2\2\2\u0769\u076a\5\u00e6t"+
		"\2\u076a\u076b\br\1\2\u076b\u076d\3\2\2\2\u076c\u0769\3\2\2\2\u076c\u076d"+
		"\3\2\2\2\u076d\u076e\3\2\2\2\u076e\u076f\7A\2\2\u076f\u0770\br\1\2\u0770"+
		"\u00e3\3\2\2\2\u0771\u0772\5\u00e8u\2\u0772\u0773\bs\1\2\u0773\u0779\3"+
		"\2\2\2\u0774\u0775\7%\2\2\u0775\u0779\bs\1\2\u0776\u0777\7\3\2\2\u0777"+
		"\u0779\bs\1\2\u0778\u0771\3\2\2\2\u0778\u0774\3\2\2\2\u0778\u0776\3\2"+
		"\2\2\u0779\u00e5\3\2\2\2\u077a\u077b\7\16\2\2\u077b\u077c\5\u00f0y\2\u077c"+
		"\u077d\bt\1\2\u077d\u00e7\3\2\2\2\u077e\u077f\5\u00eav\2\u077f\u0780\b"+
		"u\1\2\u0780\u0788\3\2\2\2\u0781\u0782\5\u00f6|\2\u0782\u0783\bu\1\2\u0783"+
		"\u0788\3\2\2\2\u0784\u0785\5\u00f8}\2\u0785\u0786\bu\1\2\u0786\u0788\3"+
		"\2\2\2\u0787\u077e\3\2\2\2\u0787\u0781\3\2\2\2\u0787\u0784\3\2\2\2\u0788"+
		"\u00e9\3\2\2\2\u0789\u078a\7i\2\2\u078a\u078b\58\35\2\u078b\u078c\bv\1"+
		"\2\u078c\u078e\7;\2\2\u078d\u078f\5\u00ecw\2\u078e\u078d\3\2\2\2\u078e"+
		"\u078f\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u0791\7<\2\2\u0791\u00eb\3\2"+
		"\2\2\u0792\u0797\5\u00eex\2\u0793\u0794\7B\2\2\u0794\u0796\5\u00eex\2"+
		"\u0795\u0793\3\2\2\2\u0796\u0799\3\2\2\2\u0797\u0795\3\2\2\2\u0797\u0798"+
		"\3\2\2\2\u0798\u00ed\3\2\2\2\u0799\u0797\3\2\2\2\u079a\u079b\7h\2\2\u079b"+
		"\u079c\7D\2\2\u079c\u079d\5\u00f0y\2\u079d\u079e\bx\1\2\u079e\u00ef\3"+
		"\2\2\2\u079f\u07a0\5\u01b4\u00db\2\u07a0\u07a1\by\1\2\u07a1\u07a9\3\2"+
		"\2\2\u07a2\u07a3\5\u00f2z\2\u07a3\u07a4\by\1\2\u07a4\u07a9\3\2\2\2\u07a5"+
		"\u07a6\5\u00e8u\2\u07a6\u07a7\by\1\2\u07a7\u07a9\3\2\2\2\u07a8\u079f\3"+
		"\2\2\2\u07a8\u07a2\3\2\2\2\u07a8\u07a5\3\2\2\2\u07a9\u00f1\3\2\2\2\u07aa"+
		"\u07ae\7=\2\2\u07ab\u07ac\5\u00f4{\2\u07ac\u07ad\bz\1\2\u07ad\u07af\3"+
		"\2\2\2\u07ae\u07ab\3\2\2\2\u07ae\u07af\3\2\2\2\u07af\u07b1\3\2\2\2\u07b0"+
		"\u07b2\7B\2\2\u07b1\u07b0\3\2\2\2\u07b1\u07b2\3\2\2\2\u07b2\u07b3\3\2"+
		"\2\2\u07b3\u07b4\7>\2\2\u07b4\u07b5\bz\1\2\u07b5\u00f3\3\2\2\2\u07b6\u07b7"+
		"\5\u00f0y\2\u07b7\u07b8\b{\1\2\u07b8\u07bf\3\2\2\2\u07b9\u07ba\7B\2\2"+
		"\u07ba\u07bb\5\u00f0y\2\u07bb\u07bc\b{\1\2\u07bc\u07be\3\2\2\2\u07bd\u07b9"+
		"\3\2\2\2\u07be\u07c1\3\2\2\2\u07bf\u07bd\3\2\2\2\u07bf\u07c0\3\2\2\2\u07c0"+
		"\u07c2\3\2\2\2\u07c1\u07bf\3\2\2\2\u07c2\u07c3\b{\1\2\u07c3\u00f5\3\2"+
		"\2\2\u07c4\u07c5\7i\2\2\u07c5\u07c6\58\35\2\u07c6\u07c7\b|\1\2\u07c7\u00f7"+
		"\3\2\2\2\u07c8\u07c9\7i\2\2\u07c9\u07ca\58\35\2\u07ca\u07cb\7;\2\2\u07cb"+
		"\u07cc\5\u00f0y\2\u07cc\u07cd\7<\2\2\u07cd\u07ce\b}\1\2\u07ce\u00f9\3"+
		"\2\2\2\u07cf\u07d3\7=\2\2\u07d0\u07d1\5\u00fc\177\2\u07d1\u07d2\b~\1\2"+
		"\u07d2\u07d4\3\2\2\2\u07d3\u07d0\3\2\2\2\u07d3\u07d4\3\2\2\2\u07d4\u07d6"+
		"\3\2\2\2\u07d5\u07d7\7B\2\2\u07d6\u07d5\3\2\2\2\u07d6\u07d7\3\2\2\2\u07d7"+
		"\u07d8\3\2\2\2\u07d8\u07d9\7>\2\2\u07d9\u07da\b~\1\2\u07da\u00fb\3\2\2"+
		"\2\u07db\u07dc\5t;\2\u07dc\u07dd\b\177\1\2\u07dd\u07e4\3\2\2\2\u07de\u07df"+
		"\7B\2\2\u07df\u07e0\5t;\2\u07e0\u07e1\b\177\1\2\u07e1\u07e3\3\2\2\2\u07e2"+
		"\u07de\3\2\2\2\u07e3\u07e6\3\2\2\2\u07e4\u07e2\3\2\2\2\u07e4\u07e5\3\2"+
		"\2\2\u07e5\u07e7\3\2\2\2\u07e6\u07e4\3\2\2\2\u07e7\u07e8\b\177\1\2\u07e8"+
		"\u00fd\3\2\2\2\u07e9\u07ea\b\u0080\1\2\u07ea\u07ee\7=\2\2\u07eb\u07ec"+
		"\5\u0100\u0081\2\u07ec\u07ed\b\u0080\1\2\u07ed\u07ef\3\2\2\2\u07ee\u07eb"+
		"\3\2\2\2\u07ee\u07ef\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0\u07f1\7>\2\2\u07f1"+
		"\u00ff\3\2\2\2\u07f2\u07f3\5\u0102\u0082\2\u07f3\u07f4\b\u0081\1\2\u07f4"+
		"\u07fa\3\2\2\2\u07f5\u07f6\5\u0102\u0082\2\u07f6\u07f7\b\u0081\1\2\u07f7"+
		"\u07f9\3\2\2\2\u07f8\u07f5\3\2\2\2\u07f9\u07fc\3\2\2\2\u07fa\u07f8\3\2"+
		"\2\2\u07fa\u07fb\3\2\2\2\u07fb\u07fd\3\2\2\2\u07fc\u07fa\3\2\2\2\u07fd"+
		"\u07fe\b\u0081\1\2\u07fe\u0101\3\2\2\2\u07ff\u0800\5\u0104\u0083\2\u0800"+
		"\u0801\b\u0082\1\2\u0801\u0809\3\2\2\2\u0802\u0803\5T+\2\u0803\u0804\b"+
		"\u0082\1\2\u0804\u0809\3\2\2\2\u0805\u0806\5\u0108\u0085\2\u0806\u0807"+
		"\b\u0082\1\2\u0807\u0809\3\2\2\2\u0808\u07ff\3\2\2\2\u0808\u0802\3\2\2"+
		"\2\u0808\u0805\3\2\2\2\u0809\u0103\3\2\2\2\u080a\u080b\5\u0106\u0084\2"+
		"\u080b\u080c\7A\2\2\u080c\u080d\b\u0083\1\2\u080d\u0105\3\2\2\2\u080e"+
		"\u080f\5\u009eP\2\u080f\u0810\b\u0084\1\2\u0810\u0812\3\2\2\2\u0811\u080e"+
		"\3\2\2\2\u0812\u0815\3\2\2\2\u0813\u0811\3\2\2\2\u0813\u0814\3\2\2\2\u0814"+
		"\u0816\3\2\2\2\u0815\u0813\3\2\2\2\u0816\u0817\5v<\2\u0817\u0818\5n8\2"+
		"\u0818\u0819\b\u0084\1\2\u0819\u0107\3\2\2\2\u081a\u081b\5\u010c\u0087"+
		"\2\u081b\u081c\b\u0085\1\2\u081c\u082d\3\2\2\2\u081d\u081e\5\u0110\u0089"+
		"\2\u081e\u081f\b\u0085\1\2\u081f\u082d\3\2\2\2\u0820\u0821\5\u0118\u008d"+
		"\2\u0821\u0822\b\u0085\1\2\u0822\u082d\3\2\2\2\u0823\u0824\5\u011a\u008e"+
		"\2\u0824\u0825\b\u0085\1\2\u0825\u082d\3\2\2\2\u0826\u0827\5\u012c\u0097"+
		"\2\u0827\u0828\b\u0085\1\2\u0828\u082d\3\2\2\2\u0829\u082a\5\u0132\u009a"+
		"\2\u082a\u082b\b\u0085\1\2\u082b\u082d\3\2\2\2\u082c\u081a\3\2\2\2\u082c"+
		"\u081d\3\2\2\2\u082c\u0820\3\2\2\2\u082c\u0823\3\2\2\2\u082c\u0826\3\2"+
		"\2\2\u082c\u0829\3\2\2\2\u082d\u0109\3\2\2\2\u082e\u082f\5\u010c\u0087"+
		"\2\u082f\u0830\b\u0086\1\2\u0830\u083e\3\2\2\2\u0831\u0832\5\u0112\u008a"+
		"\2\u0832\u0833\b\u0086\1\2\u0833\u083e\3\2\2\2\u0834\u0835\5\u011c\u008f"+
		"\2\u0835\u0836\b\u0086\1\2\u0836\u083e\3\2\2\2\u0837\u0838\5\u012e\u0098"+
		"\2\u0838\u0839\b\u0086\1\2\u0839\u083e\3\2\2\2\u083a\u083b\5\u0134\u009b"+
		"\2\u083b\u083c\b\u0086\1\2\u083c\u083e\3\2\2\2\u083d\u082e\3\2\2\2\u083d"+
		"\u0831\3\2\2\2\u083d\u0834\3\2\2\2\u083d\u0837\3\2\2\2\u083d\u083a\3\2"+
		"\2\2\u083e\u010b\3\2\2\2\u083f\u0840\5\u00fe\u0080\2\u0840\u0841\b\u0087"+
		"\1\2\u0841\u0862\3\2\2\2\u0842\u0862\5\u010e\u0088\2\u0843\u0844\5\u0114"+
		"\u008b\2\u0844\u0845\b\u0087\1\2\u0845\u0862\3\2\2\2\u0846\u0847\5\u011e"+
		"\u0090\2\u0847\u0848\b\u0087\1\2\u0848\u0862\3\2\2\2\u0849\u084a\5\u0120"+
		"\u0091\2\u084a\u084b\b\u0087\1\2\u084b\u0862\3\2\2\2\u084c\u084d\5\u0130"+
		"\u0099\2\u084d\u084e\b\u0087\1\2\u084e\u0862\3\2\2\2\u084f\u0850\5\u0144"+
		"\u00a3\2\u0850\u0851\b\u0087\1\2\u0851\u0862\3\2\2\2\u0852\u0853\5\u0146"+
		"\u00a4\2\u0853\u0854\b\u0087\1\2\u0854\u0862\3\2\2\2\u0855\u0856\5\u0148"+
		"\u00a5\2\u0856\u0857\b\u0087\1\2\u0857\u0862\3\2\2\2\u0858\u0859\5\u014c"+
		"\u00a7\2\u0859\u085a\b\u0087\1\2\u085a\u0862\3\2\2\2\u085b\u085c\5\u014a"+
		"\u00a6\2\u085c\u085d\b\u0087\1\2\u085d\u0862\3\2\2\2\u085e\u085f\5\u014e"+
		"\u00a8\2\u085f\u0860\b\u0087\1\2\u0860\u0862\3\2\2\2\u0861\u083f\3\2\2"+
		"\2\u0861\u0842\3\2\2\2\u0861\u0843\3\2\2\2\u0861\u0846\3\2\2\2\u0861\u0849"+
		"\3\2\2\2\u0861\u084c\3\2\2\2\u0861\u084f\3\2\2\2\u0861\u0852\3\2\2\2\u0861"+
		"\u0855\3\2\2\2\u0861\u0858\3\2\2\2\u0861\u085b\3\2\2\2\u0861\u085e\3\2"+
		"\2\2\u0862\u010d\3\2\2\2\u0863\u0864\7A\2\2\u0864\u010f\3\2\2\2\u0865"+
		"\u0866\7h\2\2\u0866\u0867\7J\2\2\u0867\u0868\5\u0108\u0085\2\u0868\u0869"+
		"\b\u0089\1\2\u0869\u0111\3\2\2\2\u086a\u086b\7h\2\2\u086b\u086c\7J\2\2"+
		"\u086c\u086d\5\u010a\u0086\2\u086d\u086e\b\u008a\1\2\u086e\u0113\3\2\2"+
		"\2\u086f\u0870\5\u0116\u008c\2\u0870\u0871\7A\2\2\u0871\u0872\b\u008b"+
		"\1\2\u0872\u0115\3\2\2\2\u0873\u0874\5\u01ae\u00d8\2\u0874\u0875\b\u008c"+
		"\1\2\u0875\u0889\3\2\2\2\u0876\u0877\5\u01cc\u00e7\2\u0877\u0878\b\u008c"+
		"\1\2\u0878\u0889\3\2\2\2\u0879\u087a\5\u01ce\u00e8\2\u087a\u087b\b\u008c"+
		"\1\2\u087b\u0889\3\2\2\2\u087c\u087d\5\u01d4\u00eb\2\u087d\u087e\b\u008c"+
		"\1\2\u087e\u0889\3\2\2\2\u087f\u0880\5\u01d8\u00ed\2\u0880\u0881\b\u008c"+
		"\1\2\u0881\u0889\3\2\2\2\u0882\u0883\5\u018c\u00c7\2\u0883\u0884\b\u008c"+
		"\1\2\u0884\u0889\3\2\2\2\u0885\u0886\5\u0178\u00bd\2\u0886\u0887\b\u008c"+
		"\1\2\u0887\u0889\3\2\2\2\u0888\u0873\3\2\2\2\u0888\u0876\3\2\2\2\u0888"+
		"\u0879\3\2\2\2\u0888\u087c\3\2\2\2\u0888\u087f\3\2\2\2\u0888\u0882\3\2"+
		"\2\2\u0888\u0885\3\2\2\2\u0889\u0117\3\2\2\2\u088a\u088b\7\30\2\2\u088b"+
		"\u088c\7;\2\2\u088c\u088d\5\u01a2\u00d2\2\u088d\u088e\7<\2\2\u088e\u088f"+
		"\5\u0108\u0085\2\u088f\u0890\b\u008d\1\2";
	private static final String _serializedATNSegment1 =
		"\u0890\u0119\3\2\2\2\u0891\u0892\7\30\2\2\u0892\u0893\7;\2\2\u0893\u0894"+
		"\5\u01a2\u00d2\2\u0894\u0895\7<\2\2\u0895\u0896\5\u010a\u0086\2\u0896"+
		"\u0897\7\21\2\2\u0897\u0898\5\u0108\u0085\2\u0898\u0899\b\u008e\1\2\u0899"+
		"\u011b\3\2\2\2\u089a\u089b\7\30\2\2\u089b\u089c\7;\2\2\u089c\u089d\5\u01a2"+
		"\u00d2\2\u089d\u089e\7<\2\2\u089e\u089f\5\u010a\u0086\2\u089f\u08a0\7"+
		"\21\2\2\u08a0\u08a1\5\u010a\u0086\2\u08a1\u08a2\b\u008f\1\2\u08a2\u011d"+
		"\3\2\2\2\u08a3\u08a4\7\4\2\2\u08a4\u08a5\5\u01a2\u00d2\2\u08a5\u08a6\7"+
		"A\2\2\u08a6\u08a7\b\u0090\1\2\u08a7\u08b0\3\2\2\2\u08a8\u08a9\7\4\2\2"+
		"\u08a9\u08aa\5\u01a2\u00d2\2\u08aa\u08ab\7J\2\2\u08ab\u08ac\5\u01a2\u00d2"+
		"\2\u08ac\u08ad\7A\2\2\u08ad\u08ae\b\u0090\1\2\u08ae\u08b0\3\2\2\2\u08af"+
		"\u08a3\3\2\2\2\u08af\u08a8\3\2\2\2\u08b0\u011f\3\2\2\2\u08b1\u08b2\7+"+
		"\2\2\u08b2\u08b3\7;\2\2\u08b3\u08b4\5\u01a2\u00d2\2\u08b4\u08b5\7<\2\2"+
		"\u08b5\u08b6\5\u0122\u0092\2\u08b6\u08b7\b\u0091\1\2\u08b7\u0121\3\2\2"+
		"\2\u08b8\u08be\7=\2\2\u08b9\u08ba\5\u0124\u0093\2\u08ba\u08bb\b\u0092"+
		"\1\2\u08bb\u08bd\3\2\2\2\u08bc\u08b9\3\2\2\2\u08bd\u08c0\3\2\2\2\u08be"+
		"\u08bc\3\2\2\2\u08be\u08bf\3\2\2\2\u08bf\u08c6\3\2\2\2\u08c0\u08be\3\2"+
		"\2\2\u08c1\u08c2\5\u0128\u0095\2\u08c2\u08c3\b\u0092\1\2\u08c3\u08c5\3"+
		"\2\2\2\u08c4\u08c1\3\2\2\2\u08c5\u08c8\3\2\2\2\u08c6\u08c4\3\2\2\2\u08c6"+
		"\u08c7\3\2\2\2\u08c7\u08c9\3\2\2\2\u08c8\u08c6\3\2\2\2\u08c9\u08ca\7>"+
		"\2\2\u08ca\u08cb\b\u0092\1\2\u08cb\u0123\3\2\2\2\u08cc\u08cd\5\u0126\u0094"+
		"\2\u08cd\u08ce\5\u0100\u0081\2\u08ce\u08cf\b\u0093\1\2\u08cf\u0125\3\2"+
		"\2\2\u08d0\u08d1\5\u0128\u0095\2\u08d1\u08d2\b\u0094\1\2\u08d2\u08d8\3"+
		"\2\2\2\u08d3\u08d4\5\u0128\u0095\2\u08d4\u08d5\b\u0094\1\2\u08d5\u08d7"+
		"\3\2\2\2\u08d6\u08d3\3\2\2\2\u08d7\u08da\3\2\2\2\u08d8\u08d6\3\2\2\2\u08d8"+
		"\u08d9\3\2\2\2\u08d9\u08db\3\2\2\2\u08da\u08d8\3\2\2\2\u08db\u08dc\b\u0094"+
		"\1\2\u08dc\u0127\3\2\2\2\u08dd\u08de\7\b\2\2\u08de\u08df\5\u01a0\u00d1"+
		"\2\u08df\u08e0\7J\2\2\u08e0\u08e1\b\u0095\1\2\u08e1\u08eb\3\2\2\2\u08e2"+
		"\u08e3\7\b\2\2\u08e3\u08e4\5\u012a\u0096\2\u08e4\u08e5\7J\2\2\u08e5\u08e6"+
		"\b\u0095\1\2\u08e6\u08eb\3\2\2\2\u08e7\u08e8\7\16\2\2\u08e8\u08e9\7J\2"+
		"\2\u08e9\u08eb\b\u0095\1\2\u08ea\u08dd\3\2\2\2\u08ea\u08e2\3\2\2\2\u08ea"+
		"\u08e7\3\2\2\2\u08eb\u0129\3\2\2\2\u08ec\u08ed\7h\2\2\u08ed\u08ee\b\u0096"+
		"\1\2\u08ee\u012b\3\2\2\2\u08ef\u08f0\7\64\2\2\u08f0\u08f1\7;\2\2\u08f1"+
		"\u08f2\5\u01a2\u00d2\2\u08f2\u08f3\7<\2\2\u08f3\u08f4\5\u0108\u0085\2"+
		"\u08f4\u08f5\b\u0097\1\2\u08f5\u012d\3\2\2\2\u08f6\u08f7\7\64\2\2\u08f7"+
		"\u08f8\7;\2\2\u08f8\u08f9\5\u01a2\u00d2\2\u08f9\u08fa\7<\2\2\u08fa\u08fb"+
		"\5\u010a\u0086\2\u08fb\u08fc\b\u0098\1\2\u08fc\u012f\3\2\2\2\u08fd\u08fe"+
		"\7\17\2\2\u08fe\u08ff\5\u0108\u0085\2\u08ff\u0900\7\64\2\2\u0900\u0901"+
		"\7;\2\2\u0901\u0902\5\u01a2\u00d2\2\u0902\u0903\7<\2\2\u0903\u0904\7A"+
		"\2\2\u0904\u0905\b\u0099\1\2\u0905\u0131\3\2\2\2\u0906\u0907\5\u0136\u009c"+
		"\2\u0907\u0908\b\u009a\1\2\u0908\u090d\3\2\2\2\u0909\u090a\5\u0140\u00a1"+
		"\2\u090a\u090b\b\u009a\1\2\u090b\u090d\3\2\2\2\u090c\u0906\3\2\2\2\u090c"+
		"\u0909\3\2\2\2\u090d\u0133\3\2\2\2\u090e\u090f\5\u0138\u009d\2\u090f\u0910"+
		"\b\u009b\1\2\u0910\u0915\3\2\2\2\u0911\u0912\5\u0142\u00a2\2\u0912\u0913"+
		"\b\u009b\1\2\u0913\u0915\3\2\2\2\u0914\u090e\3\2\2\2\u0914\u0911\3\2\2"+
		"\2\u0915\u0135\3\2\2\2\u0916\u0917\7\27\2\2\u0917\u091b\7;\2\2\u0918\u0919"+
		"\5\u013a\u009e\2\u0919\u091a\b\u009c\1\2\u091a\u091c\3\2\2\2\u091b\u0918"+
		"\3\2\2\2\u091b\u091c\3\2\2\2\u091c\u091d\3\2\2\2\u091d\u0921\7A\2\2\u091e"+
		"\u091f\5\u01a2\u00d2\2\u091f\u0920\b\u009c\1\2\u0920\u0922\3\2\2\2\u0921"+
		"\u091e\3\2\2\2\u0921\u0922\3\2\2\2\u0922\u0923\3\2\2\2\u0923\u0927\7A"+
		"\2\2\u0924\u0925\5\u013c\u009f\2\u0925\u0926\b\u009c\1\2\u0926\u0928\3"+
		"\2\2\2\u0927\u0924\3\2\2\2\u0927\u0928\3\2\2\2\u0928\u0929\3\2\2\2\u0929"+
		"\u092a\7<\2\2\u092a\u092b\5\u0108\u0085\2\u092b\u092c\b\u009c\1\2\u092c"+
		"\u0137\3\2\2\2\u092d\u092e\7\27\2\2\u092e\u0932\7;\2\2\u092f\u0930\5\u013a"+
		"\u009e\2\u0930\u0931\b\u009d\1\2\u0931\u0933\3\2\2\2\u0932\u092f\3\2\2"+
		"\2\u0932\u0933\3\2\2\2\u0933\u0934\3\2\2\2\u0934\u0938\7A\2\2\u0935\u0936"+
		"\5\u01a2\u00d2\2\u0936\u0937\b\u009d\1\2\u0937\u0939\3\2\2\2\u0938\u0935"+
		"\3\2\2\2\u0938\u0939\3\2\2\2\u0939\u093a\3\2\2\2\u093a\u093e\7A\2\2\u093b"+
		"\u093c\5\u013c\u009f\2\u093c\u093d\b\u009d\1\2\u093d\u093f\3\2\2\2\u093e"+
		"\u093b\3\2\2\2\u093e\u093f\3\2\2\2\u093f\u0940\3\2\2\2\u0940\u0941\7<"+
		"\2\2\u0941\u0942\5\u010a\u0086\2\u0942\u0943\b\u009d\1\2\u0943\u0139\3"+
		"\2\2\2\u0944\u0945\5\u013e\u00a0\2\u0945\u0946\b\u009e\1\2\u0946\u094b"+
		"\3\2\2\2\u0947\u0948\5\u0106\u0084\2\u0948\u0949\b\u009e\1\2\u0949\u094b"+
		"\3\2\2\2\u094a\u0944\3\2\2\2\u094a\u0947\3\2\2\2\u094b\u013b\3\2\2\2\u094c"+
		"\u094d\5\u013e\u00a0\2\u094d\u094e\b\u009f\1\2\u094e\u013d\3\2\2\2\u094f"+
		"\u0950\5\u0116\u008c\2\u0950\u0951\b\u00a0\1\2\u0951\u0958\3\2\2\2\u0952"+
		"\u0953\7B\2\2\u0953\u0954\5\u0116\u008c\2\u0954\u0955\b\u00a0\1\2\u0955"+
		"\u0957\3\2\2\2\u0956\u0952\3\2\2\2\u0957\u095a\3\2\2\2\u0958\u0956\3\2"+
		"\2\2\u0958\u0959\3\2\2\2\u0959\u095b\3\2\2\2\u095a\u0958\3\2\2\2\u095b"+
		"\u095c\b\u00a0\1\2\u095c\u013f\3\2\2\2\u095d\u095e\7\27\2\2\u095e\u0964"+
		"\7;\2\2\u095f\u0960\5\u009eP\2\u0960\u0961\b\u00a1\1\2\u0961\u0963\3\2"+
		"\2\2\u0962\u095f\3\2\2\2\u0963\u0966\3\2\2\2\u0964\u0962\3\2\2\2\u0964"+
		"\u0965\3\2\2\2\u0965\u0967\3\2\2\2\u0966\u0964\3\2\2\2\u0967\u0968\5v"+
		"<\2\u0968\u0969\5r:\2\u0969\u096a\7J\2\2\u096a\u096b\5\u01a2\u00d2\2\u096b"+
		"\u096c\7<\2\2\u096c\u096d\5\u0108\u0085\2\u096d\u096e\b\u00a1\1\2\u096e"+
		"\u0141\3\2\2\2\u096f\u0970\7\27\2\2\u0970\u0976\7;\2\2\u0971\u0972\5\u009e"+
		"P\2\u0972\u0973\b\u00a2\1\2\u0973\u0975\3\2\2\2\u0974\u0971\3\2\2\2\u0975"+
		"\u0978\3\2\2\2\u0976\u0974\3\2\2\2\u0976\u0977\3\2\2\2\u0977\u0979\3\2"+
		"\2\2\u0978\u0976\3\2\2\2\u0979\u097a\5v<\2\u097a\u097b\5r:\2\u097b\u097c"+
		"\7J\2\2\u097c\u097d\5\u01a2\u00d2\2\u097d\u097e\7<\2\2\u097e\u097f\5\u010a"+
		"\u0086\2\u097f\u0980\b\u00a2\1\2\u0980\u0143\3\2\2\2\u0981\u0984\7\6\2"+
		"\2\u0982\u0983\7h\2\2\u0983\u0985\b\u00a3\1\2\u0984\u0982\3\2\2\2\u0984"+
		"\u0985\3\2\2\2\u0985\u0986\3\2\2\2\u0986\u0987\7A\2\2\u0987\u0988\b\u00a3"+
		"\1\2\u0988\u0145\3\2\2\2\u0989\u098c\7\r\2\2\u098a\u098b\7h\2\2\u098b"+
		"\u098d\b\u00a4\1\2\u098c\u098a\3\2\2\2\u098c\u098d\3\2\2\2\u098d\u098e"+
		"\3\2\2\2\u098e\u098f\7A\2\2\u098f\u0990\b\u00a4\1\2\u0990\u0147\3\2\2"+
		"\2\u0991\u0995\7&\2\2\u0992\u0993\5\u01a2\u00d2\2\u0993\u0994\b\u00a5"+
		"\1\2\u0994\u0996\3\2\2\2\u0995\u0992\3\2\2\2\u0995\u0996\3\2\2\2\u0996"+
		"\u0997\3\2\2\2\u0997\u0998\7A\2\2\u0998\u0999\b\u00a5\1\2\u0999\u0149"+
		"\3\2\2\2\u099a\u099b\7.\2\2\u099b\u099c\5\u01a2\u00d2\2\u099c\u099d\7"+
		"A\2\2\u099d\u099e\b\u00a6\1\2\u099e\u014b\3\2\2\2\u099f\u09a0\7,\2\2\u09a0"+
		"\u09a1\7;\2\2\u09a1\u09a2\5\u01a2\u00d2\2\u09a2\u09a3\7<\2\2\u09a3\u09a4"+
		"\5\u00fe\u0080\2\u09a4\u09a5\b\u00a7\1\2\u09a5\u014d\3\2\2\2\u09a6\u09a7"+
		"\7\61\2\2\u09a7\u09a8\5\u00fe\u0080\2\u09a8\u09a9\5\u0150\u00a9\2\u09a9"+
		"\u09aa\b\u00a8\1\2\u09aa\u09b9\3\2\2\2\u09ab\u09ac\7\61\2\2\u09ac\u09b0"+
		"\5\u00fe\u0080\2\u09ad\u09ae\5\u0150\u00a9\2\u09ae\u09af\b\u00a8\1\2\u09af"+
		"\u09b1\3\2\2\2\u09b0\u09ad\3\2\2\2\u09b0\u09b1\3\2\2\2\u09b1\u09b2\3\2"+
		"\2\2\u09b2\u09b3\5\u0158\u00ad\2\u09b3\u09b4\b\u00a8\1\2\u09b4\u09b9\3"+
		"\2\2\2\u09b5\u09b6\5\u015a\u00ae\2\u09b6\u09b7\b\u00a8\1\2\u09b7\u09b9"+
		"\3\2\2\2\u09b8\u09a6\3\2\2\2\u09b8\u09ab\3\2\2\2\u09b8\u09b5\3\2\2\2\u09b9"+
		"\u014f\3\2\2\2\u09ba\u09bb\5\u0152\u00aa\2\u09bb\u09c1\b\u00a9\1\2\u09bc"+
		"\u09bd\5\u0152\u00aa\2\u09bd\u09be\b\u00a9\1\2\u09be\u09c0\3\2\2\2\u09bf"+
		"\u09bc\3\2\2\2\u09c0\u09c3\3\2\2\2\u09c1\u09bf\3\2\2\2\u09c1\u09c2\3\2"+
		"\2\2\u09c2\u09c4\3\2\2\2\u09c3\u09c1\3\2\2\2\u09c4\u09c5\b\u00a9\1\2\u09c5"+
		"\u0151\3\2\2\2\u09c6\u09c7\b\u00aa\1\2\u09c7\u09c8\7\t\2\2\u09c8\u09c9"+
		"\7;\2\2\u09c9\u09ca\5\u0154\u00ab\2\u09ca\u09cb\7<\2\2\u09cb\u09cc\5\u00fe"+
		"\u0080\2\u09cc\u09cd\b\u00aa\1\2\u09cd\u0153\3\2\2\2\u09ce\u09cf\5\u009e"+
		"P\2\u09cf\u09d0\b\u00ab\1\2\u09d0\u09d2\3\2\2\2\u09d1\u09ce\3\2\2\2\u09d2"+
		"\u09d5\3\2\2\2\u09d3\u09d1\3\2\2\2\u09d3\u09d4\3\2\2\2\u09d4\u09d6\3\2"+
		"\2\2\u09d5\u09d3\3\2\2\2\u09d6\u09d7\5\u0156\u00ac\2\u09d7\u09d8\5r:\2"+
		"\u09d8\u09d9\b\u00ab\1\2\u09d9\u0155\3\2\2\2\u09da\u09db\5~@\2\u09db\u09dc"+
		"\b\u00ac\1\2\u09dc\u09e3\3\2\2\2\u09dd\u09de\7X\2\2\u09de\u09df\5\22\n"+
		"\2\u09df\u09e0\b\u00ac\1\2\u09e0\u09e2\3\2\2\2\u09e1\u09dd\3\2\2\2\u09e2"+
		"\u09e5\3\2\2\2\u09e3\u09e1\3\2\2\2\u09e3\u09e4\3\2\2\2\u09e4\u0157\3\2"+
		"\2\2\u09e5\u09e3\3\2\2\2\u09e6\u09e7\7\25\2\2\u09e7\u09e8\5\u00fe\u0080"+
		"\2\u09e8\u09e9\b\u00ad\1\2\u09e9\u0159\3\2\2\2\u09ea\u09eb\7\61\2\2\u09eb"+
		"\u09ec\5\u015c\u00af\2\u09ec\u09f0\5\u00fe\u0080\2\u09ed\u09ee\5\u0150"+
		"\u00a9\2\u09ee\u09ef\b\u00ae\1\2\u09ef\u09f1\3\2\2\2\u09f0\u09ed\3\2\2"+
		"\2\u09f0\u09f1\3\2\2\2\u09f1\u09f5\3\2\2\2\u09f2\u09f3\5\u0158\u00ad\2"+
		"\u09f3\u09f4\b\u00ae\1\2\u09f4\u09f6\3\2\2\2\u09f5\u09f2\3\2\2\2\u09f5"+
		"\u09f6\3\2\2\2\u09f6\u09f7\3\2\2\2\u09f7\u09f8\b\u00ae\1\2\u09f8\u015b"+
		"\3\2\2\2\u09f9\u09fa\b\u00af\1\2\u09fa\u09ff\7;\2\2\u09fb\u09fc\5\u015e"+
		"\u00b0\2\u09fc\u09fd\7A\2\2\u09fd\u09fe\b\u00af\1\2\u09fe\u0a00\3\2\2"+
		"\2\u09ff\u09fb\3\2\2\2\u09ff\u0a00\3\2\2\2\u0a00\u0a01\3\2\2\2\u0a01\u0a02"+
		"\7<\2\2\u0a02\u015d\3\2\2\2\u0a03\u0a04\5\u0160\u00b1\2\u0a04\u0a0b\b"+
		"\u00b0\1\2\u0a05\u0a06\7A\2\2\u0a06\u0a07\5\u0160\u00b1\2\u0a07\u0a08"+
		"\b\u00b0\1\2\u0a08\u0a0a\3\2\2\2\u0a09\u0a05\3\2\2\2\u0a0a\u0a0d\3\2\2"+
		"\2\u0a0b\u0a09\3\2\2\2\u0a0b\u0a0c\3\2\2\2\u0a0c\u0a0e\3\2\2\2\u0a0d\u0a0b"+
		"\3\2\2\2\u0a0e\u0a0f\b\u00b0\1\2\u0a0f\u015f\3\2\2\2\u0a10\u0a11\5\u009e"+
		"P\2\u0a11\u0a12\b\u00b1\1\2\u0a12\u0a14\3\2\2\2\u0a13\u0a10\3\2\2\2\u0a14"+
		"\u0a17\3\2\2\2\u0a15\u0a13\3\2\2\2\u0a15\u0a16\3\2\2\2\u0a16\u0a18\3\2"+
		"\2\2\u0a17\u0a15\3\2\2\2\u0a18\u0a19\5v<\2\u0a19\u0a1a\5r:\2\u0a1a\u0a1b"+
		"\7D\2\2\u0a1b\u0a1c\5\u01a2\u00d2\2\u0a1c\u0a1d\b\u00b1\1\2\u0a1d\u0161"+
		"\3\2\2\2\u0a1e\u0a1f\5\u0172\u00ba\2\u0a1f\u0a20\b\u00b2\1\2\u0a20\u0a25"+
		"\3\2\2\2\u0a21\u0a22\5\u019a\u00ce\2\u0a22\u0a23\b\u00b2\1\2\u0a23\u0a25"+
		"\3\2\2\2\u0a24\u0a1e\3\2\2\2\u0a24\u0a21\3\2\2\2\u0a25\u0a2b\3\2\2\2\u0a26"+
		"\u0a27\5\u016c\u00b7\2\u0a27\u0a28\b\u00b2\1\2\u0a28\u0a2a\3\2\2\2\u0a29"+
		"\u0a26\3\2\2\2\u0a2a\u0a2d\3\2\2\2\u0a2b\u0a29\3\2\2\2\u0a2b\u0a2c\3\2"+
		"\2\2\u0a2c\u0163\3\2\2\2\u0a2d\u0a2b\3\2\2\2\u0a2e\u0a2f\5\2\2\2\u0a2f"+
		"\u0a30\b\u00b3\1\2\u0a30\u0a4b\3\2\2\2\u0a31\u0a32\5\u0166\u00b4\2\u0a32"+
		"\u0a33\b\u00b3\1\2\u0a33\u0a4b\3\2\2\2\u0a34\u0a35\7-\2\2\u0a35\u0a4b"+
		"\b\u00b3\1\2\u0a36\u0a37\7;\2\2\u0a37\u0a38\5\u01a2\u00d2\2\u0a38\u0a39"+
		"\7<\2\2\u0a39\u0a3a\b\u00b3\1\2\u0a3a\u0a4b\3\2\2\2\u0a3b\u0a3c\5\u0178"+
		"\u00bd\2\u0a3c\u0a3d\b\u00b3\1\2\u0a3d\u0a4b\3\2\2\2\u0a3e\u0a3f\5\u0180"+
		"\u00c1\2\u0a3f\u0a40\b\u00b3\1\2\u0a40\u0a4b\3\2\2\2\u0a41\u0a42\5\u0186"+
		"\u00c4\2\u0a42\u0a43\b\u00b3\1\2\u0a43\u0a4b\3\2\2\2\u0a44\u0a45\5\u018c"+
		"\u00c7\2\u0a45\u0a46\b\u00b3\1\2\u0a46\u0a4b\3\2\2\2\u0a47\u0a48\5\u0194"+
		"\u00cb\2\u0a48\u0a49\b\u00b3\1\2\u0a49\u0a4b\3\2\2\2\u0a4a\u0a2e\3\2\2"+
		"\2\u0a4a\u0a31\3\2\2\2\u0a4a\u0a34\3\2\2\2\u0a4a\u0a36\3\2\2\2\u0a4a\u0a3b"+
		"\3\2\2\2\u0a4a\u0a3e\3\2\2\2\u0a4a\u0a41\3\2\2\2\u0a4a\u0a44\3\2\2\2\u0a4a"+
		"\u0a47\3\2\2\2\u0a4b\u0165\3\2\2\2\u0a4c\u0a52\58\35\2\u0a4d\u0a4e\7?"+
		"\2\2\u0a4e\u0a4f\7@\2\2\u0a4f\u0a51\b\u00b4\1\2\u0a50\u0a4d\3\2\2\2\u0a51"+
		"\u0a54\3\2\2\2\u0a52\u0a50\3\2\2\2\u0a52\u0a53\3\2\2\2\u0a53\u0a55\3\2"+
		"\2\2\u0a54\u0a52\3\2\2\2\u0a55\u0a56\7C\2\2\u0a56\u0a57\7\13\2\2\u0a57"+
		"\u0a58\b\u00b4\1\2\u0a58\u0a63\3\2\2\2\u0a59\u0a5a\7\62\2\2\u0a5a\u0a5b"+
		"\7C\2\2\u0a5b\u0a5c\7\13\2\2\u0a5c\u0a63\b\u00b4\1\2\u0a5d\u0a5e\58\35"+
		"\2\u0a5e\u0a5f\7C\2\2\u0a5f\u0a60\7-\2\2\u0a60\u0a61\b\u00b4\1\2\u0a61"+
		"\u0a63\3\2\2\2\u0a62\u0a4c\3\2\2\2\u0a62\u0a59\3\2\2\2\u0a62\u0a5d\3\2"+
		"\2\2\u0a63\u0167\3\2\2\2\u0a64\u0a65\3\2\2\2\u0a65\u0169\3\2\2\2\u0a66"+
		"\u0a67\5\2\2\2\u0a67\u0a68\b\u00b6\1\2\u0a68\u0a80\3\2\2\2\u0a69\u0a6a"+
		"\5\u0166\u00b4\2\u0a6a\u0a6b\b\u00b6\1\2\u0a6b\u0a80\3\2\2\2\u0a6c\u0a6d"+
		"\7-\2\2\u0a6d\u0a80\b\u00b6\1\2\u0a6e\u0a6f\7;\2\2\u0a6f\u0a70\5\u01a2"+
		"\u00d2\2\u0a70\u0a71\7<\2\2\u0a71\u0a72\b\u00b6\1\2\u0a72\u0a80\3\2\2"+
		"\2\u0a73\u0a74\5\u0178\u00bd\2\u0a74\u0a75\b\u00b6\1\2\u0a75\u0a80\3\2"+
		"\2\2\u0a76\u0a77\5\u0180\u00c1\2\u0a77\u0a78\b\u00b6\1\2\u0a78\u0a80\3"+
		"\2\2\2\u0a79\u0a7a\5\u018c\u00c7\2\u0a7a\u0a7b\b\u00b6\1\2\u0a7b\u0a80"+
		"\3\2\2\2\u0a7c\u0a7d\5\u0194\u00cb\2\u0a7d\u0a7e\b\u00b6\1\2\u0a7e\u0a80"+
		"\3\2\2\2\u0a7f\u0a66\3\2\2\2\u0a7f\u0a69\3\2\2\2\u0a7f\u0a6c\3\2\2\2\u0a7f"+
		"\u0a6e\3\2\2\2\u0a7f\u0a73\3\2\2\2\u0a7f\u0a76\3\2\2\2\u0a7f\u0a79\3\2"+
		"\2\2\u0a7f\u0a7c\3\2\2\2\u0a80\u016b\3\2\2\2\u0a81\u0a82\5\u017a\u00be"+
		"\2\u0a82\u0a83\b\u00b7\1\2\u0a83\u0a91\3\2\2\2\u0a84\u0a85\5\u0182\u00c2"+
		"\2\u0a85\u0a86\b\u00b7\1\2\u0a86\u0a91\3\2\2\2\u0a87\u0a88\5\u0188\u00c5"+
		"\2\u0a88\u0a89\b\u00b7\1\2\u0a89\u0a91\3\2\2\2\u0a8a\u0a8b\5\u018e\u00c8"+
		"\2\u0a8b\u0a8c\b\u00b7\1\2\u0a8c\u0a91\3\2\2\2\u0a8d\u0a8e\5\u0196\u00cc"+
		"\2\u0a8e\u0a8f\b\u00b7\1\2\u0a8f\u0a91\3\2\2\2\u0a90\u0a81\3\2\2\2\u0a90"+
		"\u0a84\3\2\2\2\u0a90\u0a87\3\2\2\2\u0a90\u0a8a\3\2\2\2\u0a90\u0a8d\3\2"+
		"\2\2\u0a91\u016d\3\2\2\2\u0a92\u0a93\3\2\2\2\u0a93\u016f\3\2\2\2\u0a94"+
		"\u0a95\5\u017a\u00be\2\u0a95\u0a96\b\u00b9\1\2\u0a96\u0aa1\3\2\2\2\u0a97"+
		"\u0a98\5\u0182\u00c2\2\u0a98\u0a99\b\u00b9\1\2\u0a99\u0aa1\3\2\2\2\u0a9a"+
		"\u0a9b\5\u018e\u00c8\2\u0a9b\u0a9c\b\u00b9\1\2\u0a9c\u0aa1\3\2\2\2\u0a9d"+
		"\u0a9e\5\u0196\u00cc\2\u0a9e\u0a9f\b\u00b9\1\2\u0a9f\u0aa1\3\2\2\2\u0aa0"+
		"\u0a94\3\2\2\2\u0aa0\u0a97\3\2\2\2\u0aa0\u0a9a\3\2\2\2\u0aa0\u0a9d\3\2"+
		"\2\2\u0aa1\u0171\3\2\2\2\u0aa2\u0aa3\5\2\2\2\u0aa3\u0aa4\b\u00ba\1\2\u0aa4"+
		"\u0acc\3\2\2\2\u0aa5\u0aa6\5\u0166\u00b4\2\u0aa6\u0aa7\b\u00ba\1\2\u0aa7"+
		"\u0acc\3\2\2\2\u0aa8\u0aae\5x=\2\u0aa9\u0aaa\7?\2\2\u0aaa\u0aab\7@\2\2"+
		"\u0aab\u0aad\b\u00ba\1\2\u0aac\u0aa9\3\2\2\2\u0aad\u0ab0\3\2\2\2\u0aae"+
		"\u0aac\3\2\2\2\u0aae\u0aaf\3\2\2\2\u0aaf\u0ab1\3\2\2\2\u0ab0\u0aae\3\2"+
		"\2\2\u0ab1\u0ab2\7C\2\2\u0ab2\u0ab3\7\13\2\2\u0ab3\u0ab4\b\u00ba\1\2\u0ab4"+
		"\u0acc\3\2\2\2\u0ab5\u0ab6\7-\2\2\u0ab6\u0acc\b\u00ba\1\2\u0ab7\u0ab8"+
		"\7;\2\2\u0ab8\u0ab9\5\u01a2\u00d2\2\u0ab9\u0aba\7<\2\2\u0aba\u0abb\b\u00ba"+
		"\1\2\u0abb\u0acc\3\2\2\2\u0abc\u0abd\5\u017c\u00bf\2\u0abd\u0abe\b\u00ba"+
		"\1\2\u0abe\u0acc\3\2\2\2\u0abf\u0ac0\5\u0184\u00c3\2\u0ac0\u0ac1\b\u00ba"+
		"\1\2\u0ac1\u0acc\3\2\2\2\u0ac2\u0ac3\5\u018a\u00c6\2\u0ac3\u0ac4\b\u00ba"+
		"\1\2\u0ac4\u0acc\3\2\2\2\u0ac5\u0ac6\5\u0190\u00c9\2\u0ac6\u0ac7\b\u00ba"+
		"\1\2\u0ac7\u0acc\3\2\2\2\u0ac8\u0ac9\5\u0198\u00cd\2\u0ac9\u0aca\b\u00ba"+
		"\1\2\u0aca\u0acc\3\2\2\2\u0acb\u0aa2\3\2\2\2\u0acb\u0aa5\3\2\2\2\u0acb"+
		"\u0aa8\3\2\2\2\u0acb\u0ab5\3\2\2\2\u0acb\u0ab7\3\2\2\2\u0acb\u0abc\3\2"+
		"\2\2\u0acb\u0abf\3\2\2\2\u0acb\u0ac2\3\2\2\2\u0acb\u0ac5\3\2\2\2\u0acb"+
		"\u0ac8\3\2\2\2\u0acc\u0173\3\2\2\2\u0acd\u0ace\3\2\2\2\u0ace\u0175\3\2"+
		"\2\2\u0acf\u0ad0\5\2\2\2\u0ad0\u0ad1\b\u00bc\1\2\u0ad1\u0af6\3\2\2\2\u0ad2"+
		"\u0ad3\5\u0166\u00b4\2\u0ad3\u0ad4\b\u00bc\1\2\u0ad4\u0af6\3\2\2\2\u0ad5"+
		"\u0adb\5x=\2\u0ad6\u0ad7\7?\2\2\u0ad7\u0ad8\7@\2\2\u0ad8\u0ada\b\u00bc"+
		"\1\2\u0ad9\u0ad6\3\2\2\2\u0ada\u0add\3\2\2\2\u0adb\u0ad9\3\2\2\2\u0adb"+
		"\u0adc\3\2\2\2\u0adc\u0ade\3\2\2\2\u0add\u0adb\3\2\2\2\u0ade\u0adf\7C"+
		"\2\2\u0adf\u0ae0\7\13\2\2\u0ae0\u0ae1\b\u00bc\1\2\u0ae1\u0af6\3\2\2\2"+
		"\u0ae2\u0ae3\7-\2\2\u0ae3\u0af6\b\u00bc\1\2\u0ae4\u0ae5\7;\2\2\u0ae5\u0ae6"+
		"\5\u01a2\u00d2\2\u0ae6\u0ae7\7<\2\2\u0ae7\u0ae8\b\u00bc\1\2\u0ae8\u0af6"+
		"\3\2\2\2\u0ae9\u0aea\5\u017c\u00bf\2\u0aea\u0aeb\b\u00bc\1\2\u0aeb\u0af6"+
		"\3\2\2\2\u0aec\u0aed\5\u0184\u00c3\2\u0aed\u0aee\b\u00bc\1\2\u0aee\u0af6"+
		"\3\2\2\2\u0aef\u0af0\5\u0190\u00c9\2\u0af0\u0af1\b\u00bc\1\2\u0af1\u0af6"+
		"\3\2\2\2\u0af2\u0af3\5\u0198\u00cd\2\u0af3\u0af4\b\u00bc\1\2\u0af4\u0af6"+
		"\3\2\2\2\u0af5\u0acf\3\2\2\2\u0af5\u0ad2\3\2\2\2\u0af5\u0ad5\3\2\2\2\u0af5"+
		"\u0ae2\3\2\2\2\u0af5\u0ae4\3\2\2\2\u0af5\u0ae9\3\2\2\2\u0af5\u0aec\3\2"+
		"\2\2\u0af5\u0aef\3\2\2\2\u0af5\u0af2\3\2\2\2\u0af6\u0177\3\2\2\2\u0af7"+
		"\u0afb\7!\2\2\u0af8\u0af9\5,\27\2\u0af9\u0afa\b\u00bd\1\2\u0afa\u0afc"+
		"\3\2\2\2\u0afb\u0af8\3\2\2\2\u0afb\u0afc\3\2\2\2\u0afc\u0b02\3\2\2\2\u0afd"+
		"\u0afe\5\u00e8u\2\u0afe\u0aff\b\u00bd\1\2\u0aff\u0b01\3\2\2\2\u0b00\u0afd"+
		"\3\2\2\2\u0b01\u0b04\3\2\2\2\u0b02\u0b00\3\2\2\2\u0b02\u0b03\3\2\2\2\u0b03"+
		"\u0b05\3\2\2\2\u0b04\u0b02\3\2\2\2\u0b05\u0b06\7h\2\2\u0b06\u0b14\b\u00bd"+
		"\1\2\u0b07\u0b0d\7C\2\2\u0b08\u0b09\5\u00e8u\2\u0b09\u0b0a\b\u00bd\1\2"+
		"\u0b0a\u0b0c\3\2\2\2\u0b0b\u0b08\3\2\2\2\u0b0c\u0b0f\3\2\2\2\u0b0d\u0b0b"+
		"\3\2\2\2\u0b0d\u0b0e\3\2\2\2\u0b0e\u0b10\3\2\2\2\u0b0f\u0b0d\3\2\2\2\u0b10"+
		"\u0b11\7h\2\2\u0b11\u0b13\b\u00bd\1\2\u0b12\u0b07\3\2\2\2\u0b13\u0b16"+
		"\3\2\2\2\u0b14\u0b12\3\2\2\2\u0b14\u0b15\3\2\2\2\u0b15\u0b1a\3\2\2\2\u0b16"+
		"\u0b14\3\2\2\2\u0b17\u0b18\5\u017e\u00c0\2\u0b18\u0b19\b\u00bd\1\2\u0b19"+
		"\u0b1b\3\2\2\2\u0b1a\u0b17\3\2\2\2\u0b1a\u0b1b\3\2\2\2\u0b1b\u0b1c\3\2"+
		"\2\2\u0b1c\u0b20\7;\2\2\u0b1d\u0b1e\5\u0192\u00ca\2\u0b1e\u0b1f\b\u00bd"+
		"\1\2\u0b1f\u0b21\3\2\2\2\u0b20\u0b1d\3\2\2\2\u0b20\u0b21\3\2\2\2\u0b21"+
		"\u0b22\3\2\2\2\u0b22\u0b23\7<\2\2\u0b23\u0b25\b\u00bd\1\2\u0b24\u0b26"+
		"\5d\63\2\u0b25\u0b24\3\2\2\2\u0b25\u0b26\3\2\2\2\u0b26\u0b6a\3\2\2\2\u0b27"+
		"\u0b28\5<\37\2\u0b28\u0b29\7C\2\2\u0b29\u0b2d\7!\2\2\u0b2a\u0b2b\5,\27"+
		"\2\u0b2b\u0b2c\b\u00bd\1\2\u0b2c\u0b2e\3\2\2\2\u0b2d\u0b2a\3\2\2\2\u0b2d"+
		"\u0b2e\3\2\2\2\u0b2e\u0b34\3\2\2\2\u0b2f\u0b30\5\u00e8u\2\u0b30\u0b31"+
		"\b\u00bd\1\2\u0b31\u0b33\3\2\2\2\u0b32\u0b2f\3\2\2\2\u0b33\u0b36\3\2\2"+
		"\2\u0b34\u0b32\3\2\2\2\u0b34\u0b35\3\2\2\2\u0b35\u0b37\3\2\2\2\u0b36\u0b34"+
		"\3\2\2\2\u0b37\u0b3b\7h\2\2\u0b38\u0b39\5\u017e\u00c0\2\u0b39\u0b3a\b"+
		"\u00bd\1\2\u0b3a\u0b3c\3\2\2\2\u0b3b\u0b38\3\2\2\2\u0b3b\u0b3c\3\2\2\2"+
		"\u0b3c\u0b3d\3\2\2\2\u0b3d\u0b41\7;\2\2\u0b3e\u0b3f\5\u0192\u00ca\2\u0b3f"+
		"\u0b40\b\u00bd\1\2\u0b40\u0b42\3\2\2\2\u0b41\u0b3e\3\2\2\2\u0b41\u0b42"+
		"\3\2\2\2\u0b42\u0b43\3\2\2\2\u0b43\u0b44\7<\2\2\u0b44\u0b46\b\u00bd\1"+
		"\2\u0b45\u0b47\5d\63\2\u0b46\u0b45\3\2\2\2\u0b46\u0b47\3\2\2\2\u0b47\u0b6a"+
		"\3\2\2\2\u0b48\u0b49\5\u0162\u00b2\2\u0b49\u0b4a\7C\2\2\u0b4a\u0b4e\7"+
		"!\2\2\u0b4b\u0b4c\5,\27\2\u0b4c\u0b4d\b\u00bd\1\2\u0b4d\u0b4f\3\2\2\2"+
		"\u0b4e\u0b4b\3\2\2\2\u0b4e\u0b4f\3\2\2\2\u0b4f\u0b55\3\2\2\2\u0b50\u0b51"+
		"\5\u00e8u\2\u0b51\u0b52\b\u00bd\1\2\u0b52\u0b54\3\2\2\2\u0b53\u0b50\3"+
		"\2\2\2\u0b54\u0b57\3\2\2\2\u0b55\u0b53\3\2\2\2\u0b55\u0b56\3\2\2\2\u0b56"+
		"\u0b58\3\2\2\2\u0b57\u0b55\3\2\2\2\u0b58\u0b5c\7h\2\2\u0b59\u0b5a\5\u017e"+
		"\u00c0\2\u0b5a\u0b5b\b\u00bd\1\2\u0b5b\u0b5d\3\2\2\2\u0b5c\u0b59\3\2\2"+
		"\2\u0b5c\u0b5d\3\2\2\2\u0b5d\u0b5e\3\2\2\2\u0b5e\u0b62\7;\2\2\u0b5f\u0b60"+
		"\5\u0192\u00ca\2\u0b60\u0b61\b\u00bd\1\2\u0b61\u0b63\3\2\2\2\u0b62\u0b5f"+
		"\3\2\2\2\u0b62\u0b63\3\2\2\2\u0b63\u0b64\3\2\2\2\u0b64\u0b65\7<\2\2\u0b65"+
		"\u0b67\b\u00bd\1\2\u0b66\u0b68\5d\63\2\u0b67\u0b66\3\2\2\2\u0b67\u0b68"+
		"\3\2\2\2\u0b68\u0b6a\3\2\2\2\u0b69\u0af7\3\2\2\2\u0b69\u0b27\3\2\2\2\u0b69"+
		"\u0b48\3\2\2\2\u0b6a\u0179\3\2\2\2\u0b6b\u0b6c\7C\2\2\u0b6c\u0b70\7!\2"+
		"\2\u0b6d\u0b6e\5,\27\2\u0b6e\u0b6f\b\u00be\1\2\u0b6f\u0b71\3\2\2\2\u0b70"+
		"\u0b6d\3\2\2\2\u0b70\u0b71\3\2\2\2\u0b71\u0b77\3\2\2\2\u0b72\u0b73\5\u00e8"+
		"u\2\u0b73\u0b74\b\u00be\1\2\u0b74\u0b76\3\2\2\2\u0b75\u0b72\3\2\2\2\u0b76"+
		"\u0b79\3\2\2\2\u0b77\u0b75\3\2\2\2\u0b77\u0b78\3\2\2\2\u0b78\u0b7a\3\2"+
		"\2\2\u0b79\u0b77\3\2\2\2\u0b7a\u0b7e\7h\2\2\u0b7b\u0b7c\5\u017e\u00c0"+
		"\2\u0b7c\u0b7d\b\u00be\1\2\u0b7d\u0b7f\3\2\2\2\u0b7e\u0b7b\3\2\2\2\u0b7e"+
		"\u0b7f\3\2\2\2\u0b7f\u0b80\3\2\2\2\u0b80\u0b84\7;\2\2\u0b81\u0b82\5\u0192"+
		"\u00ca\2\u0b82\u0b83\b\u00be\1\2\u0b83\u0b85\3\2\2\2\u0b84\u0b81\3\2\2"+
		"\2\u0b84\u0b85\3\2\2\2\u0b85\u0b86\3\2\2\2\u0b86\u0b87\7<\2\2\u0b87\u0b89"+
		"\b\u00be\1\2\u0b88\u0b8a\5d\63\2\u0b89\u0b88\3\2\2\2\u0b89\u0b8a\3\2\2"+
		"\2\u0b8a\u017b\3\2\2\2\u0b8b\u0b8f\7!\2\2\u0b8c\u0b8d\5,\27\2\u0b8d\u0b8e"+
		"\b\u00bf\1\2\u0b8e\u0b90\3\2\2\2\u0b8f\u0b8c\3\2\2\2\u0b8f\u0b90\3\2\2"+
		"\2\u0b90\u0b96\3\2\2\2\u0b91\u0b92\5\u00e8u\2\u0b92\u0b93\b\u00bf\1\2"+
		"\u0b93\u0b95\3\2\2\2\u0b94\u0b91\3\2\2\2\u0b95\u0b98\3\2\2\2\u0b96\u0b94"+
		"\3\2\2\2\u0b96\u0b97\3\2\2\2\u0b97\u0b99\3\2\2\2\u0b98\u0b96\3\2\2\2\u0b99"+
		"\u0b9a\7h\2\2\u0b9a\u0ba8\b\u00bf\1\2\u0b9b\u0ba1\7C\2\2\u0b9c\u0b9d\5"+
		"\u00e8u\2\u0b9d\u0b9e\b\u00bf\1\2\u0b9e\u0ba0\3\2\2\2\u0b9f\u0b9c\3\2"+
		"\2\2\u0ba0\u0ba3\3\2\2\2\u0ba1\u0b9f\3\2\2\2\u0ba1\u0ba2\3\2\2\2\u0ba2"+
		"\u0ba4\3\2\2\2\u0ba3\u0ba1\3\2\2\2\u0ba4\u0ba5\7h\2\2\u0ba5\u0ba7\b\u00bf"+
		"\1\2\u0ba6\u0b9b\3\2\2\2\u0ba7\u0baa\3\2\2\2\u0ba8\u0ba6\3\2\2\2\u0ba8"+
		"\u0ba9\3\2\2\2\u0ba9\u0bae\3\2\2\2\u0baa\u0ba8\3\2\2\2\u0bab\u0bac\5\u017e"+
		"\u00c0\2\u0bac\u0bad\b\u00bf\1\2\u0bad\u0baf\3\2\2\2\u0bae\u0bab\3\2\2"+
		"\2\u0bae\u0baf\3\2\2\2\u0baf\u0bb0\3\2\2\2\u0bb0\u0bb4\7;\2\2\u0bb1\u0bb2"+
		"\5\u0192\u00ca\2\u0bb2\u0bb3\b\u00bf\1\2\u0bb3\u0bb5\3\2\2\2\u0bb4\u0bb1"+
		"\3\2\2\2\u0bb4\u0bb5\3\2\2\2\u0bb5\u0bb6\3\2\2\2\u0bb6\u0bb7\7<\2\2\u0bb7"+
		"\u0bb9\b\u00bf\1\2\u0bb8\u0bba\5d\63\2\u0bb9\u0bb8\3\2\2\2\u0bb9\u0bba"+
		"\3\2\2\2\u0bba\u0bdd\3\2\2\2\u0bbb\u0bbc\5<\37\2\u0bbc\u0bbd\7C\2\2\u0bbd"+
		"\u0bc1\7!\2\2\u0bbe\u0bbf\5,\27\2\u0bbf\u0bc0\b\u00bf\1\2\u0bc0\u0bc2"+
		"\3\2\2\2\u0bc1\u0bbe\3\2\2\2\u0bc1\u0bc2\3\2\2\2\u0bc2\u0bc8\3\2\2\2\u0bc3"+
		"\u0bc4\5\u00e8u\2\u0bc4\u0bc5\b\u00bf\1\2\u0bc5\u0bc7\3\2\2\2\u0bc6\u0bc3"+
		"\3\2\2\2\u0bc7\u0bca\3\2\2\2\u0bc8\u0bc6\3\2\2\2\u0bc8\u0bc9\3\2\2\2\u0bc9"+
		"\u0bcb\3\2\2\2\u0bca\u0bc8\3\2\2\2\u0bcb\u0bcf\7h\2\2\u0bcc\u0bcd\5\u017e"+
		"\u00c0\2\u0bcd\u0bce\b\u00bf\1\2\u0bce\u0bd0\3\2\2\2\u0bcf\u0bcc\3\2\2"+
		"\2\u0bcf\u0bd0\3\2\2\2\u0bd0\u0bd1\3\2\2\2\u0bd1\u0bd5\7;\2\2\u0bd2\u0bd3"+
		"\5\u0192\u00ca\2\u0bd3\u0bd4\b\u00bf\1\2\u0bd4\u0bd6\3\2\2\2\u0bd5\u0bd2"+
		"\3\2\2\2\u0bd5\u0bd6\3\2\2\2\u0bd6\u0bd7\3\2\2\2\u0bd7\u0bd8\7<\2\2\u0bd8"+
		"\u0bda\b\u00bf\1\2\u0bd9\u0bdb\5d\63\2\u0bda\u0bd9\3\2\2\2\u0bda\u0bdb"+
		"\3\2\2\2\u0bdb\u0bdd\3\2\2\2\u0bdc\u0b8b\3\2\2\2\u0bdc\u0bbb\3\2\2\2\u0bdd"+
		"\u017d\3\2\2\2\u0bde\u0bdf\5,\27\2\u0bdf\u0be0\b\u00c0\1\2\u0be0\u0be5"+
		"\3\2\2\2\u0be1\u0be2\7F\2\2\u0be2\u0be3\7E\2\2\u0be3\u0be5\b\u00c0\1\2"+
		"\u0be4\u0bde\3\2\2\2\u0be4\u0be1\3\2\2\2\u0be5\u017f\3\2\2\2\u0be6\u0be7"+
		"\5\u0162\u00b2\2\u0be7\u0be8\7C\2\2\u0be8\u0be9\7h\2\2\u0be9\u0bea\b\u00c1"+
		"\1\2\u0bea\u0bf7\3\2\2\2\u0beb\u0bec\7*\2\2\u0bec\u0bed\7C\2\2\u0bed\u0bee"+
		"\7h\2\2\u0bee\u0bf7\b\u00c1\1\2\u0bef\u0bf0\58\35\2\u0bf0\u0bf1\7C\2\2"+
		"\u0bf1\u0bf2\7*\2\2\u0bf2\u0bf3\7C\2\2\u0bf3\u0bf4\7h\2\2\u0bf4\u0bf5"+
		"\b\u00c1\1\2\u0bf5\u0bf7\3\2\2\2\u0bf6\u0be6\3\2\2\2\u0bf6\u0beb\3\2\2"+
		"\2\u0bf6\u0bef\3\2\2\2\u0bf7\u0181\3\2\2\2\u0bf8\u0bf9\7C\2\2\u0bf9\u0bfa"+
		"\7h\2\2\u0bfa\u0bfb\b\u00c2\1\2\u0bfb\u0183\3\2\2\2\u0bfc\u0bfd\7*\2\2"+
		"\u0bfd\u0bfe\7C\2\2\u0bfe\u0bff\7h\2\2\u0bff\u0c08\b\u00c3\1\2\u0c00\u0c01"+
		"\58\35\2\u0c01\u0c02\7C\2\2\u0c02\u0c03\7*\2\2\u0c03\u0c04\7C\2\2\u0c04"+
		"\u0c05\7h\2\2\u0c05\u0c06\b\u00c3\1\2\u0c06\u0c08\3\2\2\2\u0c07\u0bfc"+
		"\3\2\2\2\u0c07\u0c00\3\2\2\2\u0c08\u0185\3\2\2\2\u0c09\u0c0a\5<\37\2\u0c0a"+
		"\u0c0b\7?\2\2\u0c0b\u0c0c\5\u01a2\u00d2\2\u0c0c\u0c0d\7@\2\2\u0c0d\u0c0e"+
		"\b\u00c4\1\2\u0c0e\u0c16\3\2\2\2\u0c0f\u0c10\5\u016a\u00b6\2\u0c10\u0c11"+
		"\7?\2\2\u0c11\u0c12\5\u01a2\u00d2\2\u0c12\u0c13\7@\2\2\u0c13\u0c14\b\u00c4"+
		"\1\2\u0c14\u0c16\3\2\2\2\u0c15\u0c09\3\2\2\2\u0c15\u0c0f\3\2\2\2\u0c16"+
		"\u0c1f\3\2\2\2\u0c17\u0c18\5\u0168\u00b5\2\u0c18\u0c19\7?\2\2\u0c19\u0c1a"+
		"\5\u01a2\u00d2\2\u0c1a\u0c1b\7@\2\2\u0c1b\u0c1c\b\u00c4\1\2\u0c1c\u0c1e"+
		"\3\2\2\2\u0c1d\u0c17\3\2\2\2\u0c1e\u0c21\3\2\2\2\u0c1f\u0c1d\3\2\2\2\u0c1f"+
		"\u0c20\3\2\2\2\u0c20\u0187\3\2\2\2\u0c21\u0c1f\3\2\2\2\u0c22\u0c23\5\u0170"+
		"\u00b9\2\u0c23\u0c24\7?\2\2\u0c24\u0c25\5\u01a2\u00d2\2\u0c25\u0c26\7"+
		"@\2\2\u0c26\u0c27\b\u00c5\1\2\u0c27\u0c30\3\2\2\2\u0c28\u0c29\5\u016e"+
		"\u00b8\2\u0c29\u0c2a\7?\2\2\u0c2a\u0c2b\5\u01a2\u00d2\2\u0c2b\u0c2c\7"+
		"@\2\2\u0c2c\u0c2d\b\u00c5\1\2\u0c2d\u0c2f\3\2\2\2\u0c2e\u0c28\3\2\2\2"+
		"\u0c2f\u0c32\3\2\2\2\u0c30\u0c2e\3\2\2\2\u0c30\u0c31\3\2\2\2\u0c31\u0189"+
		"\3\2\2\2\u0c32\u0c30\3\2\2\2\u0c33\u0c34\5<\37\2\u0c34\u0c35\7?\2\2\u0c35"+
		"\u0c36\5\u01a2\u00d2\2\u0c36\u0c37\7@\2\2\u0c37\u0c38\b\u00c6\1\2\u0c38"+
		"\u0c40\3\2\2\2\u0c39\u0c3a\5\u0176\u00bc\2\u0c3a\u0c3b\7?\2\2\u0c3b\u0c3c"+
		"\5\u01a2\u00d2\2\u0c3c\u0c3d\7@\2\2\u0c3d\u0c3e\b\u00c6\1\2\u0c3e\u0c40"+
		"\3\2\2\2\u0c3f\u0c33\3\2\2\2\u0c3f\u0c39\3\2\2\2\u0c40\u0c49\3\2\2\2\u0c41"+
		"\u0c42\5\u0174\u00bb\2\u0c42\u0c43\7?\2\2\u0c43\u0c44\5\u01a2\u00d2\2"+
		"\u0c44\u0c45\7@\2\2\u0c45\u0c46\b\u00c6\1\2\u0c46\u0c48\3\2\2\2\u0c47"+
		"\u0c41\3\2\2\2\u0c48\u0c4b\3\2\2\2\u0c49\u0c47\3\2\2\2\u0c49\u0c4a\3\2"+
		"\2\2\u0c4a\u018b\3\2\2\2\u0c4b\u0c49\3\2\2\2\u0c4c\u0c4d\5> \2\u0c4d\u0c51"+
		"\7;\2\2\u0c4e\u0c4f\5\u0192\u00ca\2\u0c4f\u0c50\b\u00c7\1\2\u0c50\u0c52"+
		"\3\2\2\2\u0c51\u0c4e\3\2\2\2\u0c51\u0c52\3\2\2\2\u0c52\u0c53\3\2\2\2\u0c53"+
		"\u0c54\7<\2\2\u0c54\u0c55\b\u00c7\1\2\u0c55\u0cad\3\2\2\2\u0c56\u0c57"+
		"\58\35\2\u0c57\u0c5b\7C\2\2\u0c58\u0c59\5,\27\2\u0c59\u0c5a\b\u00c7\1"+
		"\2\u0c5a\u0c5c\3\2\2\2\u0c5b\u0c58\3\2\2\2\u0c5b\u0c5c\3\2\2\2\u0c5c\u0c5d"+
		"\3\2\2\2\u0c5d\u0c5e\7h\2\2\u0c5e\u0c62\7;\2\2\u0c5f\u0c60\5\u0192\u00ca"+
		"\2\u0c60\u0c61\b\u00c7\1\2\u0c61\u0c63\3\2\2\2\u0c62\u0c5f\3\2\2\2\u0c62"+
		"\u0c63\3\2\2\2\u0c63\u0c64\3\2\2\2\u0c64\u0c65\7<\2\2\u0c65\u0c66\b\u00c7"+
		"\1\2\u0c66\u0cad\3\2\2\2\u0c67\u0c68\5<\37\2\u0c68\u0c6c\7C\2\2\u0c69"+
		"\u0c6a\5,\27\2\u0c6a\u0c6b\b\u00c7\1\2\u0c6b\u0c6d\3\2\2\2\u0c6c\u0c69"+
		"\3\2\2\2\u0c6c\u0c6d\3\2\2\2\u0c6d\u0c6e\3\2\2\2\u0c6e\u0c6f\7h\2\2\u0c6f"+
		"\u0c73\7;\2\2\u0c70\u0c71\5\u0192\u00ca\2\u0c71\u0c72\b\u00c7\1\2\u0c72"+
		"\u0c74\3\2\2\2\u0c73\u0c70\3\2\2\2\u0c73\u0c74\3\2\2\2\u0c74\u0c75\3\2"+
		"\2\2\u0c75\u0c76\7<\2\2\u0c76\u0c77\b\u00c7\1\2\u0c77\u0cad\3\2\2\2\u0c78"+
		"\u0c79\5\u0162\u00b2\2\u0c79\u0c7d\7C\2\2\u0c7a\u0c7b\5,\27\2\u0c7b\u0c7c"+
		"\b\u00c7\1\2\u0c7c\u0c7e\3\2\2\2\u0c7d\u0c7a\3\2\2\2\u0c7d\u0c7e\3\2\2"+
		"\2\u0c7e\u0c7f\3\2\2\2\u0c7f\u0c80\7h\2\2\u0c80\u0c84\7;\2\2\u0c81\u0c82"+
		"\5\u0192\u00ca\2\u0c82\u0c83\b\u00c7\1\2\u0c83\u0c85\3\2\2\2\u0c84\u0c81"+
		"\3\2\2\2\u0c84\u0c85\3\2\2\2\u0c85\u0c86\3\2\2\2\u0c86\u0c87\7<\2\2\u0c87"+
		"\u0c88\b\u00c7\1\2\u0c88\u0cad\3\2\2\2\u0c89\u0c8a\7*\2\2\u0c8a\u0c8e"+
		"\7C\2\2\u0c8b\u0c8c\5,\27\2\u0c8c\u0c8d\b\u00c7\1\2\u0c8d\u0c8f\3\2\2"+
		"\2\u0c8e\u0c8b\3\2\2\2\u0c8e\u0c8f\3\2\2\2\u0c8f\u0c90\3\2\2\2\u0c90\u0c91"+
		"\7h\2\2\u0c91\u0c95\7;\2\2\u0c92\u0c93\5\u0192\u00ca\2\u0c93\u0c94\b\u00c7"+
		"\1\2\u0c94\u0c96\3\2\2\2\u0c95\u0c92\3\2\2\2\u0c95\u0c96\3\2\2\2\u0c96"+
		"\u0c97\3\2\2\2\u0c97\u0c98\7<\2\2\u0c98\u0cad\b\u00c7\1\2\u0c99\u0c9a"+
		"\58\35\2\u0c9a\u0c9b\7C\2\2\u0c9b\u0c9c\7*\2\2\u0c9c\u0ca0\7C\2\2\u0c9d"+
		"\u0c9e\5,\27\2\u0c9e\u0c9f\b\u00c7\1\2\u0c9f\u0ca1\3\2\2\2\u0ca0\u0c9d"+
		"\3\2\2\2\u0ca0\u0ca1\3\2\2\2\u0ca1\u0ca2\3\2\2\2\u0ca2\u0ca3\7h\2\2\u0ca3"+
		"\u0ca7\7;\2\2\u0ca4\u0ca5\5\u0192\u00ca\2\u0ca5\u0ca6\b\u00c7\1\2\u0ca6"+
		"\u0ca8\3\2\2\2\u0ca7\u0ca4\3\2\2\2\u0ca7\u0ca8\3\2\2\2\u0ca8\u0ca9\3\2"+
		"\2\2\u0ca9\u0caa\7<\2\2\u0caa\u0cab\b\u00c7\1\2\u0cab\u0cad\3\2\2\2\u0cac"+
		"\u0c4c\3\2\2\2\u0cac\u0c56\3\2\2\2\u0cac\u0c67\3\2\2\2\u0cac\u0c78\3\2"+
		"\2\2\u0cac\u0c89\3\2\2\2\u0cac\u0c99\3\2\2\2\u0cad\u018d\3\2\2\2\u0cae"+
		"\u0cb2\7C\2\2\u0caf\u0cb0\5,\27\2\u0cb0\u0cb1\b\u00c8\1\2\u0cb1\u0cb3"+
		"\3\2\2\2\u0cb2\u0caf\3\2\2\2\u0cb2\u0cb3\3\2\2\2\u0cb3\u0cb4\3\2\2\2\u0cb4"+
		"\u0cb5\7h\2\2\u0cb5\u0cb9\7;\2\2\u0cb6\u0cb7\5\u0192\u00ca\2\u0cb7\u0cb8"+
		"\b\u00c8\1\2\u0cb8\u0cba\3\2\2\2\u0cb9\u0cb6\3\2\2\2\u0cb9\u0cba\3\2\2"+
		"\2\u0cba\u0cbb\3\2\2\2\u0cbb\u0cbc\7<\2\2\u0cbc\u0cbd\b\u00c8\1\2\u0cbd"+
		"\u018f\3\2\2\2\u0cbe\u0cbf\5> \2\u0cbf\u0cc3\7;\2\2\u0cc0\u0cc1\5\u0192"+
		"\u00ca\2\u0cc1\u0cc2\b\u00c9\1\2\u0cc2\u0cc4\3\2\2\2\u0cc3\u0cc0\3\2\2"+
		"\2\u0cc3\u0cc4\3\2\2\2\u0cc4\u0cc5\3\2\2\2\u0cc5\u0cc6\7<\2\2\u0cc6\u0cc7"+
		"\b\u00c9\1\2\u0cc7\u0d0e\3\2\2\2\u0cc8\u0cc9\58\35\2\u0cc9\u0ccd\7C\2"+
		"\2\u0cca\u0ccb\5,\27\2\u0ccb\u0ccc\b\u00c9\1\2\u0ccc\u0cce\3\2\2\2\u0ccd"+
		"\u0cca\3\2\2\2\u0ccd\u0cce\3\2\2\2\u0cce\u0ccf\3\2\2\2\u0ccf\u0cd0\7h"+
		"\2\2\u0cd0\u0cd4\7;\2\2\u0cd1\u0cd2\5\u0192\u00ca\2\u0cd2\u0cd3\b\u00c9"+
		"\1\2\u0cd3\u0cd5\3\2\2\2\u0cd4\u0cd1\3\2\2\2\u0cd4\u0cd5\3\2\2\2\u0cd5"+
		"\u0cd6\3\2\2\2\u0cd6\u0cd7\7<\2\2\u0cd7\u0cd8\b\u00c9\1\2\u0cd8\u0d0e"+
		"\3\2\2\2\u0cd9\u0cda\5<\37\2\u0cda\u0cde\7C\2\2\u0cdb\u0cdc\5,\27\2\u0cdc"+
		"\u0cdd\b\u00c9\1\2\u0cdd\u0cdf\3\2\2\2\u0cde\u0cdb\3\2\2\2\u0cde\u0cdf"+
		"\3\2\2\2\u0cdf\u0ce0\3\2\2\2\u0ce0\u0ce1\7h\2\2\u0ce1\u0ce5\7;\2\2\u0ce2"+
		"\u0ce3\5\u0192\u00ca\2\u0ce3\u0ce4\b\u00c9\1\2\u0ce4\u0ce6\3\2\2\2\u0ce5"+
		"\u0ce2\3\2\2\2\u0ce5\u0ce6\3\2\2\2\u0ce6\u0ce7\3\2\2\2\u0ce7\u0ce8\7<"+
		"\2\2\u0ce8\u0ce9\b\u00c9\1\2\u0ce9\u0d0e\3\2\2\2\u0cea\u0ceb\7*\2\2\u0ceb"+
		"\u0cef\7C\2\2\u0cec\u0ced\5,\27\2\u0ced\u0cee\b\u00c9\1\2\u0cee\u0cf0"+
		"\3\2\2\2\u0cef\u0cec\3\2\2\2\u0cef\u0cf0\3\2\2\2\u0cf0\u0cf1\3\2\2\2\u0cf1"+
		"\u0cf2\7h\2\2\u0cf2\u0cf6\7;\2\2\u0cf3\u0cf4\5\u0192\u00ca\2\u0cf4\u0cf5"+
		"\b\u00c9\1\2\u0cf5\u0cf7\3\2\2\2\u0cf6\u0cf3\3\2\2\2\u0cf6\u0cf7\3\2\2"+
		"\2\u0cf7\u0cf8\3\2\2\2\u0cf8\u0cf9\7<\2\2\u0cf9\u0d0e\b\u00c9\1\2\u0cfa"+
		"\u0cfb\58\35\2\u0cfb\u0cfc\7C\2\2\u0cfc\u0cfd\7*\2\2\u0cfd\u0d01\7C\2"+
		"\2\u0cfe\u0cff\5,\27\2\u0cff\u0d00\b\u00c9\1\2\u0d00\u0d02\3\2\2\2\u0d01"+
		"\u0cfe\3\2\2\2\u0d01\u0d02\3\2\2\2\u0d02\u0d03\3\2\2\2\u0d03\u0d04\7h"+
		"\2\2\u0d04\u0d08\7;\2\2\u0d05\u0d06\5\u0192\u00ca\2\u0d06\u0d07\b\u00c9"+
		"\1\2\u0d07\u0d09\3\2\2\2\u0d08\u0d05\3\2\2\2\u0d08\u0d09\3\2\2\2\u0d09"+
		"\u0d0a\3\2\2\2\u0d0a\u0d0b\7<\2\2\u0d0b\u0d0c\b\u00c9\1\2\u0d0c\u0d0e"+
		"\3\2\2\2\u0d0d\u0cbe\3\2\2\2\u0d0d\u0cc8\3\2\2\2\u0d0d\u0cd9\3\2\2\2\u0d0d"+
		"\u0cea\3\2\2\2\u0d0d\u0cfa\3\2\2\2\u0d0e\u0191\3\2\2\2\u0d0f\u0d10\5\u01a2"+
		"\u00d2\2\u0d10\u0d11\b\u00ca\1\2\u0d11\u0d18\3\2\2\2\u0d12\u0d13\7B\2"+
		"\2\u0d13\u0d14\5\u01a2\u00d2\2\u0d14\u0d15\b\u00ca\1\2\u0d15\u0d17\3\2"+
		"\2\2\u0d16\u0d12\3\2\2\2\u0d17\u0d1a\3\2\2\2\u0d18\u0d16\3\2\2\2\u0d18"+
		"\u0d19\3\2\2\2\u0d19\u0d1b\3\2\2\2\u0d1a\u0d18\3\2\2\2\u0d1b\u0d1c\b\u00ca"+
		"\1\2\u0d1c\u0193\3\2\2\2\u0d1d\u0d1e\5<\37\2\u0d1e\u0d22\7\\\2\2\u0d1f"+
		"\u0d20\5,\27\2\u0d20\u0d21\b\u00cb\1\2\u0d21\u0d23\3\2\2\2\u0d22\u0d1f"+
		"\3\2\2\2\u0d22\u0d23\3\2\2\2\u0d23\u0d24\3\2\2\2\u0d24\u0d25\7h\2\2\u0d25"+
		"\u0d26\b\u00cb\1\2\u0d26\u0d60\3\2\2\2\u0d27\u0d28\5\16\b\2\u0d28\u0d2c"+
		"\7\\\2\2\u0d29\u0d2a\5,\27\2\u0d2a\u0d2b\b\u00cb\1\2\u0d2b\u0d2d\3\2\2"+
		"\2\u0d2c\u0d29\3\2\2\2\u0d2c\u0d2d\3\2\2\2\u0d2d\u0d2e\3\2\2\2\u0d2e\u0d2f"+
		"\7h\2\2\u0d2f\u0d30\b\u00cb\1\2\u0d30\u0d60\3\2\2\2\u0d31\u0d32\5\u0162"+
		"\u00b2\2\u0d32\u0d36\7\\\2\2\u0d33\u0d34\5,\27\2\u0d34\u0d35\b\u00cb\1"+
		"\2\u0d35\u0d37\3\2\2\2\u0d36\u0d33\3\2\2\2\u0d36\u0d37\3\2\2\2\u0d37\u0d38"+
		"\3\2\2\2\u0d38\u0d39\7h\2\2\u0d39\u0d3a\b\u00cb\1\2\u0d3a\u0d60\3\2\2"+
		"\2\u0d3b\u0d3c\7*\2\2\u0d3c\u0d40\7\\\2\2\u0d3d\u0d3e\5,\27\2\u0d3e\u0d3f"+
		"\b\u00cb\1\2\u0d3f\u0d41\3\2\2\2\u0d40\u0d3d\3\2\2\2\u0d40\u0d41\3\2\2"+
		"\2\u0d41\u0d42\3\2\2\2\u0d42\u0d43\7h\2\2\u0d43\u0d60\b\u00cb\1\2\u0d44"+
		"\u0d45\58\35\2\u0d45\u0d46\7C\2\2\u0d46\u0d47\7*\2\2\u0d47\u0d4b\7\\\2"+
		"\2\u0d48\u0d49\5,\27\2\u0d49\u0d4a\b\u00cb\1\2\u0d4a\u0d4c\3\2\2\2\u0d4b"+
		"\u0d48\3\2\2\2\u0d4b\u0d4c\3\2\2\2\u0d4c\u0d4d\3\2\2\2\u0d4d\u0d4e\7h"+
		"\2\2\u0d4e\u0d4f\b\u00cb\1\2\u0d4f\u0d60\3\2\2\2\u0d50\u0d51\5\22\n\2"+
		"\u0d51\u0d55\7\\\2\2\u0d52\u0d53\5,\27\2\u0d53\u0d54\b\u00cb\1\2\u0d54"+
		"\u0d56\3\2\2\2\u0d55\u0d52\3\2\2\2\u0d55\u0d56\3\2\2\2\u0d56\u0d57\3\2"+
		"\2\2\u0d57\u0d58\7!\2\2\u0d58\u0d59\b\u00cb\1\2\u0d59\u0d60\3\2\2\2\u0d5a"+
		"\u0d5b\5 \21\2\u0d5b\u0d5c\7\\\2\2\u0d5c\u0d5d\7!\2\2\u0d5d\u0d5e\b\u00cb"+
		"\1\2\u0d5e\u0d60\3\2\2\2\u0d5f\u0d1d\3\2\2\2\u0d5f\u0d27\3\2\2\2\u0d5f"+
		"\u0d31\3\2\2\2\u0d5f\u0d3b\3\2\2\2\u0d5f\u0d44\3\2\2\2\u0d5f\u0d50\3\2"+
		"\2\2\u0d5f\u0d5a\3\2\2\2\u0d60\u0195\3\2\2\2\u0d61\u0d65\7\\\2\2\u0d62"+
		"\u0d63\5,\27\2\u0d63\u0d64\b\u00cc\1\2\u0d64\u0d66\3\2\2\2\u0d65\u0d62"+
		"\3\2\2\2\u0d65\u0d66\3\2\2\2\u0d66\u0d67\3\2\2\2\u0d67\u0d68\7h\2\2\u0d68"+
		"\u0d69\b\u00cc\1\2\u0d69\u0197\3\2\2\2\u0d6a\u0d6b\5<\37\2\u0d6b\u0d6f"+
		"\7\\\2\2\u0d6c\u0d6d\5,\27\2\u0d6d\u0d6e\b\u00cd\1\2\u0d6e\u0d70\3\2\2"+
		"\2\u0d6f\u0d6c\3\2\2\2\u0d6f\u0d70\3\2\2\2\u0d70\u0d71\3\2\2\2\u0d71\u0d72"+
		"\7h\2\2\u0d72\u0d73\b\u00cd\1\2\u0d73\u0da3\3\2\2\2\u0d74\u0d75\5\16\b"+
		"\2\u0d75\u0d79\7\\\2\2\u0d76\u0d77\5,\27\2\u0d77\u0d78\b\u00cd\1\2\u0d78"+
		"\u0d7a\3\2\2\2\u0d79\u0d76\3\2\2\2\u0d79\u0d7a\3\2\2\2\u0d7a\u0d7b\3\2"+
		"\2\2\u0d7b\u0d7c\7h\2\2\u0d7c\u0d7d\b\u00cd\1\2\u0d7d\u0da3\3\2\2\2\u0d7e"+
		"\u0d7f\7*\2\2\u0d7f\u0d83\7\\\2\2\u0d80\u0d81\5,\27\2\u0d81\u0d82\b\u00cd"+
		"\1\2\u0d82\u0d84\3\2\2\2\u0d83\u0d80\3\2\2\2\u0d83\u0d84\3\2\2\2\u0d84"+
		"\u0d85\3\2\2\2\u0d85\u0d86\7h\2\2\u0d86\u0da3\b\u00cd\1\2\u0d87\u0d88"+
		"\58\35\2\u0d88\u0d89\7C\2\2\u0d89\u0d8a\7*\2\2\u0d8a\u0d8e\7\\\2\2\u0d8b"+
		"\u0d8c\5,\27\2\u0d8c\u0d8d\b\u00cd\1\2\u0d8d\u0d8f\3\2\2\2\u0d8e\u0d8b"+
		"\3\2\2\2\u0d8e\u0d8f\3\2\2\2\u0d8f\u0d90\3\2\2\2\u0d90\u0d91\7h\2\2\u0d91"+
		"\u0d92\b\u00cd\1\2\u0d92\u0da3\3\2\2\2\u0d93\u0d94\5\22\n\2\u0d94\u0d98"+
		"\7\\\2\2\u0d95\u0d96\5,\27\2\u0d96\u0d97\b\u00cd\1\2\u0d97\u0d99\3\2\2"+
		"\2\u0d98\u0d95\3\2\2\2\u0d98\u0d99\3\2\2\2\u0d99\u0d9a\3\2\2\2\u0d9a\u0d9b"+
		"\7!\2\2\u0d9b\u0d9c\b\u00cd\1\2\u0d9c\u0da3\3\2\2\2\u0d9d\u0d9e\5 \21"+
		"\2\u0d9e\u0d9f\7\\\2\2\u0d9f\u0da0\7!\2\2\u0da0\u0da1\b\u00cd\1\2\u0da1"+
		"\u0da3\3\2\2\2\u0da2\u0d6a\3\2\2\2\u0da2\u0d74\3\2\2\2\u0da2\u0d7e\3\2"+
		"\2\2\u0da2\u0d87\3\2\2\2\u0da2\u0d93\3\2\2\2\u0da2\u0d9d\3\2\2\2\u0da3"+
		"\u0199\3\2\2\2\u0da4\u0da5\7!\2\2\u0da5\u0da6\5\6\4\2\u0da6\u0daa\5\u019c"+
		"\u00cf\2\u0da7\u0da8\5\"\22\2\u0da8\u0da9\b\u00ce\1\2\u0da9\u0dab\3\2"+
		"\2\2\u0daa\u0da7\3\2\2\2\u0daa\u0dab\3\2\2\2\u0dab\u0dac\3\2\2\2\u0dac"+
		"\u0dad\b\u00ce\1\2\u0dad\u0dc5\3\2\2\2\u0dae\u0daf\7!\2\2\u0daf\u0db0"+
		"\5\20\t\2\u0db0\u0db4\5\u019c\u00cf\2\u0db1\u0db2\5\"\22\2\u0db2\u0db3"+
		"\b\u00ce\1\2\u0db3\u0db5\3\2\2\2\u0db4\u0db1\3\2\2\2\u0db4\u0db5\3\2\2"+
		"\2\u0db5\u0db6\3\2\2\2\u0db6\u0db7\b\u00ce\1\2\u0db7\u0dc5\3\2\2\2\u0db8"+
		"\u0db9\7!\2\2\u0db9\u0dba\5\6\4\2\u0dba\u0dbb\5\"\22\2\u0dbb\u0dbc\5\u00fa"+
		"~\2\u0dbc\u0dbd\b\u00ce\1\2\u0dbd\u0dc5\3\2\2\2\u0dbe\u0dbf\7!\2\2\u0dbf"+
		"\u0dc0\5\20\t\2\u0dc0\u0dc1\5\"\22\2\u0dc1\u0dc2\5\u00fa~\2\u0dc2\u0dc3"+
		"\b\u00ce\1\2\u0dc3\u0dc5\3\2\2\2\u0dc4\u0da4\3\2\2\2\u0dc4\u0dae\3\2\2"+
		"\2\u0dc4\u0db8\3\2\2\2\u0dc4\u0dbe\3\2\2\2\u0dc5\u019b\3\2\2\2\u0dc6\u0dc7"+
		"\5\u019e\u00d0\2\u0dc7\u0dcd\b\u00cf\1\2\u0dc8\u0dc9\5\u019e\u00d0\2\u0dc9"+
		"\u0dca\b\u00cf\1\2\u0dca\u0dcc\3\2\2\2\u0dcb\u0dc8\3\2\2\2\u0dcc\u0dcf"+
		"\3\2\2\2\u0dcd\u0dcb\3\2\2\2\u0dcd\u0dce\3\2\2\2\u0dce\u019d\3\2\2\2\u0dcf"+
		"\u0dcd\3\2\2\2\u0dd0\u0dd1\5\u00e8u\2\u0dd1\u0dd2\b\u00d0\1\2\u0dd2\u0dd4"+
		"\3\2\2\2\u0dd3\u0dd0\3\2\2\2\u0dd4\u0dd7\3\2\2\2\u0dd5\u0dd3\3\2\2\2\u0dd5"+
		"\u0dd6\3\2\2\2\u0dd6\u0dd8\3\2\2\2\u0dd7\u0dd5\3\2\2\2\u0dd8\u0dd9\7?"+
		"\2\2\u0dd9\u0dda\5\u01a2\u00d2\2\u0dda\u0ddb\7@\2\2\u0ddb\u0ddc\b\u00d0"+
		"\1\2\u0ddc\u019f\3\2\2\2\u0ddd\u0dde\5\u01a2\u00d2\2\u0dde\u0ddf\b\u00d1"+
		"\1\2\u0ddf\u01a1\3\2\2\2\u0de0\u0de1\5\u01a4\u00d3\2\u0de1\u0de2\b\u00d2"+
		"\1\2\u0de2\u0de7\3\2\2\2\u0de3\u0de4\5\u01ac\u00d7\2\u0de4\u0de5\b\u00d2"+
		"\1\2\u0de5\u0de7\3\2\2\2\u0de6\u0de0\3\2\2\2\u0de6\u0de3\3\2\2\2\u0de7"+
		"\u01a3\3\2\2\2\u0de8\u0de9\5\u01a6\u00d4\2\u0de9\u0dea\7[\2\2\u0dea\u0deb"+
		"\5\u01aa\u00d6\2\u0deb\u0dec\b\u00d3\1\2\u0dec\u01a5\3\2\2\2\u0ded\u0dee"+
		"\7h\2\2\u0dee\u0dfd\b\u00d4\1\2\u0def\u0df0\b\u00d4\1\2\u0df0\u0df4\7"+
		";\2\2\u0df1\u0df2\5\u0098M\2\u0df2\u0df3\b\u00d4\1\2\u0df3\u0df5\3\2\2"+
		"\2\u0df4\u0df1\3\2\2\2\u0df4\u0df5\3\2\2\2\u0df5\u0df6\3\2\2\2\u0df6\u0dfd"+
		"\7<\2\2\u0df7\u0df8\7;\2\2\u0df8\u0df9\5\u01a8\u00d5\2\u0df9\u0dfa\7<"+
		"\2\2\u0dfa\u0dfb\b\u00d4\1\2\u0dfb\u0dfd\3\2\2\2\u0dfc\u0ded\3\2\2\2\u0dfc"+
		"\u0def\3\2\2\2\u0dfc\u0df7\3\2\2\2\u0dfd\u01a7\3\2\2\2\u0dfe\u0dff\7h"+
		"\2\2\u0dff\u0e00\b\u00d5\1\2\u0e00\u0e06\3\2\2\2\u0e01\u0e02\7B\2\2\u0e02"+
		"\u0e03\7h\2\2\u0e03\u0e05\b\u00d5\1\2\u0e04\u0e01\3\2\2\2\u0e05\u0e08"+
		"\3\2\2\2\u0e06\u0e04\3\2\2\2\u0e06\u0e07\3\2\2\2\u0e07\u0e09\3\2\2\2\u0e08"+
		"\u0e06\3\2\2\2\u0e09\u0e0a\b\u00d5\1\2\u0e0a\u01a9\3\2\2\2\u0e0b\u0e0c"+
		"\5\u01a2\u00d2\2\u0e0c\u0e0d\b\u00d6\1\2\u0e0d\u0e12\3\2\2\2\u0e0e\u0e0f"+
		"\5\u00fe\u0080\2\u0e0f\u0e10\b\u00d6\1\2\u0e10\u0e12\3\2\2\2\u0e11\u0e0b"+
		"\3\2\2\2\u0e11\u0e0e\3\2\2\2\u0e12\u01ab\3\2\2\2\u0e13\u0e14\5\u01b4\u00db"+
		"\2\u0e14\u0e15\b\u00d7\1\2\u0e15\u0e1a\3\2\2\2\u0e16\u0e17\5\u01ae\u00d8"+
		"\2\u0e17\u0e18\b\u00d7\1\2\u0e18\u0e1a\3\2\2\2\u0e19\u0e13\3\2\2\2\u0e19"+
		"\u0e16\3\2\2\2\u0e1a\u01ad\3\2\2\2\u0e1b\u0e1c\5\u01b0\u00d9\2\u0e1c\u0e1d"+
		"\5\u01b2\u00da\2\u0e1d\u0e1e\5\u01a2\u00d2\2\u0e1e\u0e1f\b\u00d8\1\2\u0e1f"+
		"\u01af\3\2\2\2\u0e20\u0e21\5<\37\2\u0e21\u0e22\b\u00d9\1\2\u0e22\u0e2a"+
		"\3\2\2\2\u0e23\u0e24\5\u0180\u00c1\2\u0e24\u0e25\b\u00d9\1\2\u0e25\u0e2a"+
		"\3\2\2\2\u0e26\u0e27\5\u0186\u00c4\2\u0e27\u0e28\b\u00d9\1\2\u0e28\u0e2a"+
		"\3\2\2\2\u0e29\u0e20\3\2\2\2\u0e29\u0e23\3\2\2\2\u0e29\u0e26\3\2\2\2\u0e2a"+
		"\u01b1\3\2\2\2\u0e2b\u0e2c\7D\2\2\u0e2c\u0e44\b\u00da\1\2\u0e2d\u0e2e"+
		"\7_\2\2\u0e2e\u0e44\b\u00da\1\2\u0e2f\u0e30\7`\2\2\u0e30\u0e44\b\u00da"+
		"\1\2\u0e31\u0e32\7d\2\2\u0e32\u0e44\b\u00da\1\2\u0e33\u0e34\7]\2\2\u0e34"+
		"\u0e44\b\u00da\1\2\u0e35\u0e36\7^\2\2\u0e36\u0e44\b\u00da\1\2\u0e37\u0e38"+
		"\7e\2\2\u0e38\u0e44\b\u00da\1\2\u0e39\u0e3a\7f\2\2\u0e3a\u0e44\b\u00da"+
		"\1\2\u0e3b\u0e3c\7g\2\2\u0e3c\u0e44\b\u00da\1\2\u0e3d\u0e3e\7a\2\2\u0e3e"+
		"\u0e44\b\u00da\1\2\u0e3f\u0e40\7c\2\2\u0e40\u0e44\b\u00da\1\2\u0e41\u0e42"+
		"\7b\2\2\u0e42\u0e44\b\u00da\1\2\u0e43\u0e2b\3\2\2\2\u0e43\u0e2d\3\2\2"+
		"\2\u0e43\u0e2f\3\2\2\2\u0e43\u0e31\3\2\2\2\u0e43\u0e33\3\2\2\2\u0e43\u0e35"+
		"\3\2\2\2\u0e43\u0e37\3\2\2\2\u0e43\u0e39\3\2\2\2\u0e43\u0e3b\3\2\2\2\u0e43"+
		"\u0e3d\3\2\2\2\u0e43\u0e3f\3\2\2\2\u0e43\u0e41\3\2\2\2\u0e44\u01b3\3\2"+
		"\2\2\u0e45\u0e46\5\u01b6\u00dc\2\u0e46\u0e47\b\u00db\1\2\u0e47\u0e50\3"+
		"\2\2\2\u0e48\u0e49\5\u01b6\u00dc\2\u0e49\u0e4a\7I\2\2\u0e4a\u0e4b\5\u01a2"+
		"\u00d2\2\u0e4b\u0e4c\7J\2\2\u0e4c\u0e4d\5\u01b4\u00db\2\u0e4d\u0e4e\b"+
		"\u00db\1\2\u0e4e\u0e50\3\2\2\2\u0e4f\u0e45\3\2\2\2\u0e4f\u0e48\3\2\2\2"+
		"\u0e50\u01b5\3\2\2\2\u0e51\u0e52\b\u00dc\1\2\u0e52\u0e53\5\u01b8\u00dd"+
		"\2\u0e53\u0e54\b\u00dc\1\2\u0e54\u0e5c\3\2\2\2\u0e55\u0e56\f\3\2\2\u0e56"+
		"\u0e57\7P\2\2\u0e57\u0e58\5\u01b8\u00dd\2\u0e58\u0e59\b\u00dc\1\2\u0e59"+
		"\u0e5b\3\2\2\2\u0e5a\u0e55\3\2\2\2\u0e5b\u0e5e\3\2\2\2\u0e5c\u0e5a\3\2"+
		"\2\2\u0e5c\u0e5d\3\2\2\2\u0e5d\u01b7\3\2\2\2\u0e5e\u0e5c\3\2\2\2\u0e5f"+
		"\u0e60\b\u00dd\1\2\u0e60\u0e61\5\u01ba\u00de\2\u0e61\u0e62\b\u00dd\1\2"+
		"\u0e62\u0e6a\3\2\2\2\u0e63\u0e64\f\3\2\2\u0e64\u0e65\7O\2\2\u0e65\u0e66"+
		"\5\u01ba\u00de\2\u0e66\u0e67\b\u00dd\1\2\u0e67\u0e69\3\2\2\2\u0e68\u0e63"+
		"\3\2\2\2\u0e69\u0e6c\3\2\2\2\u0e6a\u0e68\3\2\2\2\u0e6a\u0e6b\3\2\2\2\u0e6b"+
		"\u01b9\3\2\2\2\u0e6c\u0e6a\3\2\2\2\u0e6d\u0e6e\b\u00de\1\2\u0e6e\u0e6f"+
		"\5\u01bc\u00df\2\u0e6f\u0e70\b\u00de\1\2\u0e70\u0e78\3\2\2\2\u0e71\u0e72"+
		"\f\3\2\2\u0e72\u0e73\7X\2\2\u0e73\u0e74\5\u01bc\u00df\2\u0e74\u0e75\b"+
		"\u00de\1\2\u0e75\u0e77\3\2\2\2\u0e76\u0e71\3\2\2\2\u0e77\u0e7a\3\2\2\2"+
		"\u0e78\u0e76\3\2\2\2\u0e78\u0e79\3\2\2\2\u0e79\u01bb\3\2\2\2\u0e7a\u0e78"+
		"\3\2\2\2\u0e7b\u0e7c\b\u00df\1\2\u0e7c\u0e7d\5\u01be\u00e0\2\u0e7d\u0e7e"+
		"\b\u00df\1\2\u0e7e\u0e86\3\2\2\2\u0e7f\u0e80\f\3\2\2\u0e80\u0e81\7Y\2"+
		"\2\u0e81\u0e82\5\u01be\u00e0\2\u0e82\u0e83\b\u00df\1\2\u0e83\u0e85\3\2"+
		"\2\2\u0e84\u0e7f\3\2\2\2\u0e85\u0e88\3\2\2\2\u0e86\u0e84\3\2\2\2\u0e86"+
		"\u0e87\3\2\2\2\u0e87\u01bd\3\2\2\2\u0e88\u0e86\3\2\2\2\u0e89\u0e8a\b\u00e0"+
		"\1\2\u0e8a\u0e8b\5\u01c0\u00e1\2\u0e8b\u0e8c\b\u00e0\1\2\u0e8c\u0e94\3"+
		"\2\2\2\u0e8d\u0e8e\f\3\2\2\u0e8e\u0e8f\7W\2\2\u0e8f\u0e90\5\u01c0\u00e1"+
		"\2\u0e90\u0e91\b\u00e0\1\2\u0e91\u0e93\3\2\2\2\u0e92\u0e8d\3\2\2\2\u0e93"+
		"\u0e96\3\2\2\2\u0e94\u0e92\3\2\2\2\u0e94\u0e95\3\2\2\2\u0e95\u01bf\3\2"+
		"\2\2\u0e96\u0e94\3\2\2\2\u0e97\u0e98\b\u00e1\1\2\u0e98\u0e99\5\u01c2\u00e2"+
		"\2\u0e99\u0e9a\b\u00e1\1\2\u0e9a\u0ea7\3\2\2\2\u0e9b\u0e9c\f\4\2\2\u0e9c"+
		"\u0e9d\7K\2\2\u0e9d\u0e9e\5\u01c2\u00e2\2\u0e9e\u0e9f\b\u00e1\1\2\u0e9f"+
		"\u0ea6\3\2\2\2\u0ea0\u0ea1\f\3\2\2\u0ea1\u0ea2\7N\2\2\u0ea2\u0ea3\5\u01c2"+
		"\u00e2\2\u0ea3\u0ea4\b\u00e1\1\2\u0ea4\u0ea6\3\2\2\2\u0ea5\u0e9b\3\2\2"+
		"\2\u0ea5\u0ea0\3\2\2\2\u0ea6\u0ea9\3\2\2\2\u0ea7\u0ea5\3\2\2\2\u0ea7\u0ea8"+
		"\3\2\2\2\u0ea8\u01c1\3\2\2\2\u0ea9\u0ea7\3\2\2\2\u0eaa\u0eab\b\u00e2\1"+
		"\2\u0eab\u0eac\5\u01c4\u00e3\2\u0eac\u0ead\b\u00e2\1\2\u0ead\u0ec9\3\2"+
		"\2\2\u0eae\u0eaf\f\7\2\2\u0eaf\u0eb0\7F\2\2\u0eb0\u0eb1\5\u01c4\u00e3"+
		"\2\u0eb1\u0eb2\b\u00e2\1\2\u0eb2\u0ec8\3\2\2\2\u0eb3\u0eb4\f\6\2\2\u0eb4"+
		"\u0eb5\7E\2\2\u0eb5\u0eb6\5\u01c4\u00e3\2\u0eb6\u0eb7\b\u00e2\1\2\u0eb7"+
		"\u0ec8\3\2\2\2\u0eb8\u0eb9\f\5\2\2\u0eb9\u0eba\7L\2\2\u0eba\u0ebb\5\u01c4"+
		"\u00e3\2\u0ebb\u0ebc\b\u00e2\1\2\u0ebc\u0ec8\3\2\2\2\u0ebd\u0ebe\f\4\2"+
		"\2\u0ebe\u0ebf\7M\2\2\u0ebf\u0ec0\5\u01c4\u00e3\2\u0ec0\u0ec1\b\u00e2"+
		"\1\2\u0ec1\u0ec8\3\2\2\2\u0ec2\u0ec3\f\3\2\2\u0ec3\u0ec4\7\34\2\2\u0ec4"+
		"\u0ec5\5\16\b\2\u0ec5\u0ec6\b\u00e2\1\2\u0ec6\u0ec8\3\2\2\2\u0ec7\u0eae"+
		"\3\2\2\2\u0ec7\u0eb3\3\2\2\2\u0ec7\u0eb8\3\2\2\2\u0ec7\u0ebd\3\2\2\2\u0ec7"+
		"\u0ec2\3\2\2\2\u0ec8\u0ecb\3\2\2\2\u0ec9\u0ec7\3\2\2\2\u0ec9\u0eca\3\2"+
		"\2\2\u0eca\u01c3\3\2\2\2\u0ecb\u0ec9\3\2\2\2\u0ecc\u0ecd\b\u00e3\1\2\u0ecd"+
		"\u0ece\5\u01c6\u00e4\2\u0ece\u0ecf\b\u00e3\1\2\u0ecf\u0ee5\3\2\2\2\u0ed0"+
		"\u0ed1\f\5\2\2\u0ed1\u0ed2\7F\2\2\u0ed2\u0ed3\7F\2\2\u0ed3\u0ed4\5\u01c6"+
		"\u00e4\2\u0ed4\u0ed5\b\u00e3\1\2\u0ed5\u0ee4\3\2\2\2\u0ed6\u0ed7\f\4\2"+
		"\2\u0ed7\u0ed8\7E\2\2\u0ed8\u0ed9\7E\2\2\u0ed9\u0eda\5\u01c6\u00e4\2\u0eda"+
		"\u0edb\b\u00e3\1\2\u0edb\u0ee4\3\2\2\2\u0edc\u0edd\f\3\2\2\u0edd\u0ede"+
		"\7E\2\2\u0ede\u0edf\7E\2\2\u0edf\u0ee0\7E\2\2\u0ee0\u0ee1\5\u01c6\u00e4"+
		"\2\u0ee1\u0ee2\b\u00e3\1\2\u0ee2\u0ee4\3\2\2\2\u0ee3\u0ed0\3\2\2\2\u0ee3"+
		"\u0ed6\3\2\2\2\u0ee3\u0edc\3\2\2\2\u0ee4\u0ee7\3\2\2\2\u0ee5\u0ee3\3\2"+
		"\2\2\u0ee5\u0ee6\3\2\2\2\u0ee6\u01c5\3\2\2\2\u0ee7\u0ee5\3\2\2\2\u0ee8"+
		"\u0ee9\b\u00e4\1\2\u0ee9\u0eea\5\u01c8\u00e5\2\u0eea\u0eeb\b\u00e4\1\2"+
		"\u0eeb\u0ef8\3\2\2\2\u0eec\u0eed\f\4\2\2\u0eed\u0eee\7S\2\2\u0eee\u0eef"+
		"\5\u01c8\u00e5\2\u0eef\u0ef0\b\u00e4\1\2\u0ef0\u0ef7\3\2\2\2\u0ef1\u0ef2"+
		"\f\3\2\2\u0ef2\u0ef3\7T\2\2\u0ef3\u0ef4\5\u01c8\u00e5\2\u0ef4\u0ef5\b"+
		"\u00e4\1\2\u0ef5\u0ef7\3\2\2\2\u0ef6\u0eec\3\2\2\2\u0ef6\u0ef1\3\2\2\2"+
		"\u0ef7\u0efa\3\2\2\2\u0ef8\u0ef6\3\2\2\2\u0ef8\u0ef9\3\2\2\2\u0ef9\u01c7"+
		"\3\2\2\2\u0efa\u0ef8\3\2\2\2\u0efb\u0efc\b\u00e5\1\2\u0efc\u0efd\5\u01ca"+
		"\u00e6\2\u0efd\u0efe\b\u00e5\1\2\u0efe\u0f10\3\2\2\2\u0eff\u0f00\f\5\2"+
		"\2\u0f00\u0f01\7U\2\2\u0f01\u0f02\5\u01ca\u00e6\2\u0f02\u0f03\b\u00e5"+
		"\1\2\u0f03\u0f0f\3\2\2\2\u0f04\u0f05\f\4\2\2\u0f05\u0f06\7V\2\2\u0f06"+
		"\u0f07\5\u01ca\u00e6\2\u0f07\u0f08\b\u00e5\1\2\u0f08\u0f0f\3\2\2\2\u0f09"+
		"\u0f0a\f\3\2\2\u0f0a\u0f0b\7Z\2\2\u0f0b\u0f0c\5\u01ca\u00e6\2\u0f0c\u0f0d"+
		"\b\u00e5\1\2\u0f0d\u0f0f\3\2\2\2\u0f0e\u0eff\3\2\2\2\u0f0e\u0f04\3\2\2"+
		"\2\u0f0e\u0f09\3\2\2\2\u0f0f\u0f12\3\2\2\2\u0f10\u0f0e\3\2\2\2\u0f10\u0f11"+
		"\3\2\2\2\u0f11\u01c9\3\2\2\2\u0f12\u0f10\3\2\2\2\u0f13\u0f14\5\u01cc\u00e7"+
		"\2\u0f14\u0f15\b\u00e6\1\2\u0f15\u0f25\3\2\2\2\u0f16\u0f17\5\u01ce\u00e8"+
		"\2\u0f17\u0f18\b\u00e6\1\2\u0f18\u0f25\3\2\2\2\u0f19\u0f1a\7S\2\2\u0f1a"+
		"\u0f1b\5\u01ca\u00e6\2\u0f1b\u0f1c\b\u00e6\1\2\u0f1c\u0f25\3\2\2\2\u0f1d"+
		"\u0f1e\7T\2\2\u0f1e\u0f1f\5\u01ca\u00e6\2\u0f1f\u0f20\b\u00e6\1\2\u0f20"+
		"\u0f25\3\2\2\2\u0f21\u0f22\5\u01d0\u00e9\2\u0f22\u0f23\b\u00e6\1\2\u0f23"+
		"\u0f25\3\2\2\2\u0f24\u0f13\3\2\2\2\u0f24\u0f16\3\2\2\2\u0f24\u0f19\3\2"+
		"\2\2\u0f24\u0f1d\3\2\2\2\u0f24\u0f21\3\2\2\2\u0f25\u01cb\3\2\2\2\u0f26"+
		"\u0f27\7Q\2\2\u0f27\u0f28\5\u01ca\u00e6\2\u0f28\u0f29\b\u00e7\1\2\u0f29"+
		"\u01cd\3\2\2\2\u0f2a\u0f2b\7R\2\2\u0f2b\u0f2c\5\u01ca\u00e6\2\u0f2c\u0f2d"+
		"\b\u00e8\1\2\u0f2d\u01cf\3\2\2\2\u0f2e\u0f2f\5\u01d2\u00ea\2\u0f2f\u0f30"+
		"\b\u00e9\1\2\u0f30\u0f3d\3\2\2\2\u0f31\u0f32\7H\2\2\u0f32\u0f33\5\u01ca"+
		"\u00e6\2\u0f33\u0f34\b\u00e9\1\2\u0f34\u0f3d\3\2\2\2\u0f35\u0f36\7G\2"+
		"\2\u0f36\u0f37\5\u01ca\u00e6\2\u0f37\u0f38\b\u00e9\1\2\u0f38\u0f3d\3\2"+
		"\2\2\u0f39\u0f3a\5\u01dc\u00ef\2\u0f3a\u0f3b\b\u00e9\1\2\u0f3b\u0f3d\3"+
		"\2\2\2\u0f3c\u0f2e\3\2\2\2\u0f3c\u0f31\3\2\2\2\u0f3c\u0f35\3\2\2\2\u0f3c"+
		"\u0f39\3\2\2\2\u0f3d\u01d1\3\2\2\2\u0f3e\u0f3f\5\u0162\u00b2\2\u0f3f\u0f40"+
		"\b\u00ea\1\2\u0f40\u0f45\3\2\2\2\u0f41\u0f42\5<\37\2\u0f42\u0f43\b\u00ea"+
		"\1\2\u0f43\u0f45\3\2\2\2\u0f44\u0f3e\3\2\2\2\u0f44\u0f41\3\2\2\2\u0f45"+
		"\u0f4e\3\2\2\2\u0f46\u0f47\5\u01d6\u00ec\2\u0f47\u0f48\b\u00ea\1\2\u0f48"+
		"\u0f4d\3\2\2\2\u0f49\u0f4a\5\u01da\u00ee\2\u0f4a\u0f4b\b\u00ea\1\2\u0f4b"+
		"\u0f4d\3\2\2\2\u0f4c\u0f46\3\2\2\2\u0f4c\u0f49\3\2\2\2\u0f4d\u0f50\3\2"+
		"\2\2\u0f4e\u0f4c\3\2\2\2\u0f4e\u0f4f\3\2\2\2\u0f4f\u01d3\3\2\2\2\u0f50"+
		"\u0f4e\3\2\2\2\u0f51\u0f52\5\u01d2\u00ea\2\u0f52\u0f53\7Q\2\2\u0f53\u0f54"+
		"\b\u00eb\1\2\u0f54\u01d5\3\2\2\2\u0f55\u0f56\7Q\2\2\u0f56\u0f57\b\u00ec"+
		"\1\2\u0f57\u01d7\3\2\2\2\u0f58\u0f59\5\u01d2\u00ea\2\u0f59\u0f5a\7R\2"+
		"\2\u0f5a\u0f5b\b\u00ed\1\2\u0f5b\u01d9\3\2\2\2\u0f5c\u0f5d\7R\2\2\u0f5d"+
		"\u0f5e\b\u00ee\1\2\u0f5e\u01db\3\2\2\2\u0f5f\u0f60\7;\2\2\u0f60\u0f61"+
		"\5\6\4\2\u0f61\u0f62\7<\2\2\u0f62\u0f63\5\u01ca\u00e6\2\u0f63\u0f64\b"+
		"\u00ef\1\2\u0f64\u0f84\3\2\2\2\u0f65\u0f66\7;\2\2\u0f66\u0f67\5\16\b\2"+
		"\u0f67\u0f6d\b\u00ef\1\2\u0f68\u0f69\5*\26\2\u0f69\u0f6a\b\u00ef\1\2\u0f6a"+
		"\u0f6c\3\2\2\2\u0f6b\u0f68\3\2\2\2\u0f6c\u0f6f\3\2\2\2\u0f6d\u0f6b\3\2"+
		"\2\2\u0f6d\u0f6e\3\2\2\2\u0f6e\u0f70\3\2\2\2\u0f6f\u0f6d\3\2\2\2\u0f70"+
		"\u0f71\7<\2\2\u0f71\u0f72\5\u01d0\u00e9\2\u0f72\u0f73\b\u00ef\1\2\u0f73"+
		"\u0f84\3\2\2\2\u0f74\u0f75\7;\2\2\u0f75\u0f76\5\16\b\2\u0f76\u0f7c\b\u00ef"+
		"\1\2\u0f77\u0f78\5*\26\2\u0f78\u0f79\b\u00ef\1\2\u0f79\u0f7b\3\2\2\2\u0f7a"+
		"\u0f77\3\2\2\2\u0f7b\u0f7e\3\2\2\2\u0f7c\u0f7a\3\2\2\2\u0f7c\u0f7d\3\2"+
		"\2\2\u0f7d\u0f7f\3\2\2\2\u0f7e\u0f7c\3\2\2\2\u0f7f\u0f80\7<\2\2\u0f80"+
		"\u0f81\5\u01a4\u00d3\2\u0f81\u0f82\b\u00ef\1\2\u0f82\u0f84\3\2\2\2\u0f83"+
		"\u0f5f\3\2\2\2\u0f83\u0f65\3\2\2\2\u0f83\u0f74\3\2\2\2\u0f84\u01dd\3\2"+
		"\2\2\u0148\u01ea\u01f2\u01f9\u0204\u0209\u0211\u021d\u0223\u022e\u0236"+
		"\u023e\u0240\u0248\u024f\u0259\u0260\u0264\u026c\u0273\u027c\u0283\u0295"+
		"\u02a7\u02ac\u02b5\u02bd\u02c5\u02cc\u02df\u02e4\u02f7\u0302\u0309\u030f"+
		"\u0319\u0325\u032f\u033b\u0345\u0354\u035a\u0361\u0369\u0374\u0380\u0395"+
		"\u03ba\u03c2\u03c9\u03d1\u03d6\u03db\u03f1\u0401\u0417\u0420\u042f\u043e"+
		"\u0445\u045e\u0469\u0473\u047b\u0485\u048d\u0494\u049f\u04a7\u04af\u04b1"+
		"\u04b8\u04c2\u04c9\u04cd\u04d5\u04dc\u04e4\u0500\u0507\u0524\u052c\u0535"+
		"\u053f\u0541\u0548\u0550\u0556\u0566\u0571\u057f\u0584\u058b\u0597\u059e"+
		"\u05a7\u05b1\u05b8\u05bf\u05d1\u05dc\u05e2\u05f0\u05f8\u0606\u060b\u0613"+
		"\u061f\u0624\u062b\u0632\u063a\u0641\u064b\u0652\u065d\u0664\u066a\u0671"+
		"\u0679\u0680\u0683\u0686\u068f\u0697\u069f\u06a2\u06a6\u06af\u06b8\u06bf"+
		"\u06c7\u06cc\u06e0\u06ea\u06fc\u0703\u0714\u071b\u0730\u0737\u0744\u0756"+
		"\u075d\u0767\u076c\u0778\u0787\u078e\u0797\u07a8\u07ae\u07b1\u07bf\u07d3"+
		"\u07d6\u07e4\u07ee\u07fa\u0808\u0813\u082c\u083d\u0861\u0888\u08af\u08be"+
		"\u08c6\u08d8\u08ea\u090c\u0914\u091b\u0921\u0927\u0932\u0938\u093e\u094a"+
		"\u0958\u0964\u0976\u0984\u098c\u0995\u09b0\u09b8\u09c1\u09d3\u09e3\u09f0"+
		"\u09f5\u09ff\u0a0b\u0a15\u0a24\u0a2b\u0a4a\u0a52\u0a62\u0a7f\u0a90\u0aa0"+
		"\u0aae\u0acb\u0adb\u0af5\u0afb\u0b02\u0b0d\u0b14\u0b1a\u0b20\u0b25\u0b2d"+
		"\u0b34\u0b3b\u0b41\u0b46\u0b4e\u0b55\u0b5c\u0b62\u0b67\u0b69\u0b70\u0b77"+
		"\u0b7e\u0b84\u0b89\u0b8f\u0b96\u0ba1\u0ba8\u0bae\u0bb4\u0bb9\u0bc1\u0bc8"+
		"\u0bcf\u0bd5\u0bda\u0bdc\u0be4\u0bf6\u0c07\u0c15\u0c1f\u0c30\u0c3f\u0c49"+
		"\u0c51\u0c5b\u0c62\u0c6c\u0c73\u0c7d\u0c84\u0c8e\u0c95\u0ca0\u0ca7\u0cac"+
		"\u0cb2\u0cb9\u0cc3\u0ccd\u0cd4\u0cde\u0ce5\u0cef\u0cf6\u0d01\u0d08\u0d0d"+
		"\u0d18\u0d22\u0d2c\u0d36\u0d40\u0d4b\u0d55\u0d5f\u0d65\u0d6f\u0d79\u0d83"+
		"\u0d8e\u0d98\u0da2\u0daa\u0db4\u0dc4\u0dcd\u0dd5\u0de6\u0df4\u0dfc\u0e06"+
		"\u0e11\u0e19\u0e29\u0e43\u0e4f\u0e5c\u0e6a\u0e78\u0e86\u0e94\u0ea5\u0ea7"+
		"\u0ec7\u0ec9\u0ee3\u0ee5\u0ef6\u0ef8\u0f0e\u0f10\u0f24\u0f3c\u0f44\u0f4c"+
		"\u0f4e\u0f6d\u0f7c\u0f83";
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