// Generated from Java8.g4 by ANTLR 4.6
package com.binghamton.jhelp.antlr;

    import java.util.ArrayList;
    import java.util.HashSet;
    import java.util.List;
    import java.util.Set;

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
		RULE_classOrInterfaceType = 7, RULE_classType = 8, RULE_classType_lfno_classOrInterfaceType = 9, 
		RULE_typeVariable = 10, RULE_arrayType = 11, RULE_dims = 12, RULE_typeParameter = 13, 
		RULE_typeParameterModifier = 14, RULE_typeBound = 15, RULE_additionalBound = 16, 
		RULE_typeArguments = 17, RULE_typeArgumentList = 18, RULE_typeArgument = 19, 
		RULE_wildcard = 20, RULE_wildcardBounds = 21, RULE_typeName = 22, RULE_packageOrTypeName = 23, 
		RULE_expressionName = 24, RULE_ambiguousName = 25, RULE_compilationUnit = 26, 
		RULE_packageDeclaration = 27, RULE_packageModifier = 28, RULE_importDeclaration = 29, 
		RULE_singleTypeImportDeclaration = 30, RULE_typeImportOnDemandDeclaration = 31, 
		RULE_singleStaticImportDeclaration = 32, RULE_staticImportOnDemandDeclaration = 33, 
		RULE_typeDeclaration = 34, RULE_classDeclaration = 35, RULE_normalClassDeclaration = 36, 
		RULE_classModifier = 37, RULE_typeParameters = 38, RULE_typeParameterList = 39, 
		RULE_superclass = 40, RULE_superinterfaces = 41, RULE_interfaceTypeList = 42, 
		RULE_classBody = 43, RULE_classBodyDeclaration = 44, RULE_classMemberDeclaration = 45, 
		RULE_fieldDeclaration = 46, RULE_fieldModifier = 47, RULE_variableDeclaratorList = 48, 
		RULE_variableDeclarator = 49, RULE_variableDeclaratorId = 50, RULE_typedVariableDeclaratorId = 51, 
		RULE_variableInitializer = 52, RULE_unannType = 53, RULE_unannPrimitiveType = 54, 
		RULE_unannReferenceType = 55, RULE_unannClassOrInterfaceType = 56, RULE_unannClassType = 57, 
		RULE_unannClassType_lfno_unannClassOrInterfaceType = 58, RULE_unannTypeVariable = 59, 
		RULE_unannArrayType = 60, RULE_methodDeclaration = 61, RULE_methodModifier = 62, 
		RULE_methodHeader = 63, RULE_result = 64, RULE_methodDeclarator = 65, 
		RULE_formalParameterList = 66, RULE_formalParameters = 67, RULE_formalParameter = 68, 
		RULE_variableModifier = 69, RULE_lastFormalParameter = 70, RULE_receiverParameter = 71, 
		RULE_throws_ = 72, RULE_exceptionTypeList = 73, RULE_exceptionType = 74, 
		RULE_methodBody = 75, RULE_instanceInitializer = 76, RULE_staticInitializer = 77, 
		RULE_constructorDeclaration = 78, RULE_constructorModifier = 79, RULE_constructorDeclarator = 80, 
		RULE_constructorBody = 81, RULE_explicitConstructorInvocation = 82, RULE_enumDeclaration = 83, 
		RULE_enumBody = 84, RULE_enumConstantList = 85, RULE_enumConstant = 86, 
		RULE_enumBodyDeclarations = 87, RULE_interfaceDeclaration = 88, RULE_normalInterfaceDeclaration = 89, 
		RULE_interfaceModifier = 90, RULE_extendsInterfaces = 91, RULE_interfaceBody = 92, 
		RULE_interfaceMemberDeclaration = 93, RULE_constantDeclaration = 94, RULE_constantModifier = 95, 
		RULE_interfaceMethodDeclaration = 96, RULE_interfaceMethodModifier = 97, 
		RULE_annotationTypeDeclaration = 98, RULE_annotationTypeBody = 99, RULE_annotationTypeMemberDeclaration = 100, 
		RULE_annotationTypeElementDeclaration = 101, RULE_annotationTypeElementModifier = 102, 
		RULE_defaultValue = 103, RULE_annotation = 104, RULE_normalAnnotation = 105, 
		RULE_elementValuePairList = 106, RULE_elementValuePair = 107, RULE_elementValue = 108, 
		RULE_elementValueArrayInitializer = 109, RULE_elementValueList = 110, 
		RULE_markerAnnotation = 111, RULE_singleElementAnnotation = 112, RULE_arrayInitializer = 113, 
		RULE_variableInitializerList = 114, RULE_block = 115, RULE_blockStatements = 116, 
		RULE_blockStatement = 117, RULE_localVariableDeclarationStatement = 118, 
		RULE_localVariableDeclaration = 119, RULE_statement = 120, RULE_statementNoShortIf = 121, 
		RULE_statementWithoutTrailingSubstatement = 122, RULE_emptyStatement = 123, 
		RULE_labeledStatement = 124, RULE_labeledStatementNoShortIf = 125, RULE_expressionStatement = 126, 
		RULE_statementExpression = 127, RULE_ifThenStatement = 128, RULE_ifThenElseStatement = 129, 
		RULE_ifThenElseStatementNoShortIf = 130, RULE_assertStatement = 131, RULE_switchStatement = 132, 
		RULE_switchBlock = 133, RULE_switchBlockStatementGroup = 134, RULE_switchLabels = 135, 
		RULE_switchLabel = 136, RULE_whileStatement = 137, RULE_whileStatementNoShortIf = 138, 
		RULE_doStatement = 139, RULE_forStatement = 140, RULE_forStatementNoShortIf = 141, 
		RULE_basicForStatement = 142, RULE_basicForStatementNoShortIf = 143, RULE_forInit = 144, 
		RULE_forUpdate = 145, RULE_statementExpressionList = 146, RULE_enhancedForStatement = 147, 
		RULE_enhancedForStatementNoShortIf = 148, RULE_breakStatement = 149, RULE_continueStatement = 150, 
		RULE_returnStatement = 151, RULE_throwStatement = 152, RULE_synchronizedStatement = 153, 
		RULE_tryStatement = 154, RULE_catches = 155, RULE_catchClause = 156, RULE_catchFormalParameter = 157, 
		RULE_catchType = 158, RULE_finally_ = 159, RULE_tryWithResourcesStatement = 160, 
		RULE_resourceSpecification = 161, RULE_resourceList = 162, RULE_resource = 163, 
		RULE_primary = 164, RULE_primaryNoNewArray = 165, RULE_primaryNoNewArray_typeAccess = 166, 
		RULE_primaryNoNewArray_lf_arrayAccess = 167, RULE_primaryNoNewArray_lfno_arrayAccess = 168, 
		RULE_primaryNoNewArray_lf_primary = 169, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 170, 
		RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 171, RULE_primaryNoNewArray_lfno_primary = 172, 
		RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 173, 
		RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 174, 
		RULE_classInstanceCreationExpression = 175, RULE_classInstanceCreationExpression_lf_primary = 176, 
		RULE_classInstanceCreationExpression_lfno_primary = 177, RULE_typeArgumentsOrDiamond = 178, 
		RULE_fieldAccess = 179, RULE_fieldAccess_lf_primary = 180, RULE_fieldAccess_lfno_primary = 181, 
		RULE_arrayAccess = 182, RULE_arrayAccess_lf_primary = 183, RULE_arrayAccess_lfno_primary = 184, 
		RULE_methodInvocation = 185, RULE_methodInvocation_lf_primary = 186, RULE_methodInvocation_lfno_primary = 187, 
		RULE_argumentList = 188, RULE_methodReference = 189, RULE_methodReference_lf_primary = 190, 
		RULE_methodReference_lfno_primary = 191, RULE_arrayCreationExpression = 192, 
		RULE_dimExprs = 193, RULE_dimExpr = 194, RULE_constantExpression = 195, 
		RULE_expression = 196, RULE_lambdaExpression = 197, RULE_lambdaParameters = 198, 
		RULE_inferredFormalParameterList = 199, RULE_lambdaBody = 200, RULE_assignmentExpression = 201, 
		RULE_assignment = 202, RULE_leftHandSide = 203, RULE_assignmentOperator = 204, 
		RULE_conditionalExpression = 205, RULE_conditionalOrExpression = 206, 
		RULE_conditionalAndExpression = 207, RULE_inclusiveOrExpression = 208, 
		RULE_exclusiveOrExpression = 209, RULE_andExpression = 210, RULE_equalityExpression = 211, 
		RULE_relationalExpression = 212, RULE_shiftExpression = 213, RULE_additiveExpression = 214, 
		RULE_multiplicativeExpression = 215, RULE_unaryExpression = 216, RULE_preIncrementExpression = 217, 
		RULE_preDecrementExpression = 218, RULE_unaryExpressionNotPlusMinus = 219, 
		RULE_postfixExpression = 220, RULE_postIncrementExpression = 221, RULE_postDecrementExpression = 222, 
		RULE_castExpression = 223;
	public static final String[] ruleNames = {
		"literal", "type_", "primitiveType", "numericType", "integralType", "floatingPointType", 
		"referenceType", "classOrInterfaceType", "classType", "classType_lfno_classOrInterfaceType", 
		"typeVariable", "arrayType", "dims", "typeParameter", "typeParameterModifier", 
		"typeBound", "additionalBound", "typeArguments", "typeArgumentList", "typeArgument", 
		"wildcard", "wildcardBounds", "typeName", "packageOrTypeName", "expressionName", 
		"ambiguousName", "compilationUnit", "packageDeclaration", "packageModifier", 
		"importDeclaration", "singleTypeImportDeclaration", "typeImportOnDemandDeclaration", 
		"singleStaticImportDeclaration", "staticImportOnDemandDeclaration", "typeDeclaration", 
		"classDeclaration", "normalClassDeclaration", "classModifier", "typeParameters", 
		"typeParameterList", "superclass", "superinterfaces", "interfaceTypeList", 
		"classBody", "classBodyDeclaration", "classMemberDeclaration", "fieldDeclaration", 
		"fieldModifier", "variableDeclaratorList", "variableDeclarator", "variableDeclaratorId", 
		"typedVariableDeclaratorId", "variableInitializer", "unannType", "unannPrimitiveType", 
		"unannReferenceType", "unannClassOrInterfaceType", "unannClassType", "unannClassType_lfno_unannClassOrInterfaceType", 
		"unannTypeVariable", "unannArrayType", "methodDeclaration", "methodModifier", 
		"methodHeader", "result", "methodDeclarator", "formalParameterList", "formalParameters", 
		"formalParameter", "variableModifier", "lastFormalParameter", "receiverParameter", 
		"throws_", "exceptionTypeList", "exceptionType", "methodBody", "instanceInitializer", 
		"staticInitializer", "constructorDeclaration", "constructorModifier", 
		"constructorDeclarator", "constructorBody", "explicitConstructorInvocation", 
		"enumDeclaration", "enumBody", "enumConstantList", "enumConstant", "enumBodyDeclarations", 
		"interfaceDeclaration", "normalInterfaceDeclaration", "interfaceModifier", 
		"extendsInterfaces", "interfaceBody", "interfaceMemberDeclaration", "constantDeclaration", 
		"constantModifier", "interfaceMethodDeclaration", "interfaceMethodModifier", 
		"annotationTypeDeclaration", "annotationTypeBody", "annotationTypeMemberDeclaration", 
		"annotationTypeElementDeclaration", "annotationTypeElementModifier", "defaultValue", 
		"annotation", "normalAnnotation", "elementValuePairList", "elementValuePair", 
		"elementValue", "elementValueArrayInitializer", "elementValueList", "markerAnnotation", 
		"singleElementAnnotation", "arrayInitializer", "variableInitializerList", 
		"block", "blockStatements", "blockStatement", "localVariableDeclarationStatement", 
		"localVariableDeclaration", "statement", "statementNoShortIf", "statementWithoutTrailingSubstatement", 
		"emptyStatement", "labeledStatement", "labeledStatementNoShortIf", "expressionStatement", 
		"statementExpression", "ifThenStatement", "ifThenElseStatement", "ifThenElseStatementNoShortIf", 
		"assertStatement", "switchStatement", "switchBlock", "switchBlockStatementGroup", 
		"switchLabels", "switchLabel", "whileStatement", "whileStatementNoShortIf", 
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
		"postDecrementExpression", "castExpression"
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


	    private void checkModifiers(List<Modifier> modifiers) {
	        Set<Modifier> modSet = new HashSet<>();
	        for (Modifier mod : modifiers) {
	            if (!modSet.add(mod)) {
	                // TODO throw error (notifyErrorListeners)
	            }
	        }
	    }

	public Java8Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LiteralContext extends ParserRuleContext {
		public Expression ret;
		public char last;
		public Token i;
		public Token f;
		public Token b;
		public Token c;
		public Token s;
		public Token n;
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
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		try {
			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				((LiteralContext)_localctx).i = match(IntegerLiteral);

				            ((LiteralContext)_localctx).last =  ((LiteralContext)_localctx).i.getText().charAt(((LiteralContext)_localctx).i.getText().length()-1);
				            if (_localctx.last == 'l' || _localctx.last == 'L') {
				                ((LiteralContext)_localctx).ret =  new LiteralExpression(((LiteralContext)_localctx).i, PrimitiveType.LONG);
				            } else {
				                ((LiteralContext)_localctx).ret =  new LiteralExpression(((LiteralContext)_localctx).i, PrimitiveType.INT);
				            }
				        
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				((LiteralContext)_localctx).f = match(FloatingPointLiteral);

				            ((LiteralContext)_localctx).last =  ((LiteralContext)_localctx).f.getText().charAt(((LiteralContext)_localctx).f.getText().length()-1);
				            if (_localctx.last == 'd' || _localctx.last == 'D') {
				                ((LiteralContext)_localctx).ret =  new LiteralExpression(((LiteralContext)_localctx).f, PrimitiveType.DOUBLE);
				            } else {
				                ((LiteralContext)_localctx).ret =  new LiteralExpression(((LiteralContext)_localctx).f, PrimitiveType.FLOAT);
				            }
				        
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
				((LiteralContext)_localctx).b = match(BooleanLiteral);
				((LiteralContext)_localctx).ret =  new LiteralExpression(((LiteralContext)_localctx).b, PrimitiveType.BOOLEAN);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(454);
				((LiteralContext)_localctx).c = match(CharacterLiteral);
				((LiteralContext)_localctx).ret =  new LiteralExpression(((LiteralContext)_localctx).c, PrimitiveType.CHAR);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(456);
				((LiteralContext)_localctx).s = match(StringLiteral);
				((LiteralContext)_localctx).ret =  new LiteralExpression(((LiteralContext)_localctx).s, null);
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(458);
				((LiteralContext)_localctx).n = match(NullLiteral);
				((LiteralContext)_localctx).ret =  new KeywordExpression(((LiteralContext)_localctx).n);
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
		public Expression ret;
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
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_type_);
		try {
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				((Type_Context)_localctx).p = primitiveType();
				((Type_Context)_localctx).ret =  ((Type_Context)_localctx).p.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
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
		public IdentifierExpression ret;
		public List<Annotation> anns = new ArrayList<>();
		public AnnotationContext a;
		public NumericTypeContext n;
		public Token b;
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
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_primitiveType);
		int _la;
		try {
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(470);
					((PrimitiveTypeContext)_localctx).a = annotation();
					_localctx.anns.add(((PrimitiveTypeContext)_localctx).a.ret);
					}
					}
					setState(477);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(478);
				((PrimitiveTypeContext)_localctx).n = numericType();
				((PrimitiveTypeContext)_localctx).ret =  new KeywordExpression(((PrimitiveTypeContext)_localctx).n.ret, _localctx.anns);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(481);
					((PrimitiveTypeContext)_localctx).a = annotation();
					_localctx.anns.add(((PrimitiveTypeContext)_localctx).a.ret);
					}
					}
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(489);
				((PrimitiveTypeContext)_localctx).b = match(BOOLEAN);
				((PrimitiveTypeContext)_localctx).ret =  new KeywordExpression(((PrimitiveTypeContext)_localctx).b, _localctx.anns);
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
		public Token ret;
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
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numericType);
		try {
			setState(499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				((NumericTypeContext)_localctx).i = integralType();
				((NumericTypeContext)_localctx).ret =  ((NumericTypeContext)_localctx).i.ret;
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
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
		public Token ret;
		public Token b;
		public Token s;
		public Token i;
		public Token l;
		public Token c;
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralType; }
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_integralType);
		try {
			setState(511);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				((IntegralTypeContext)_localctx).b = match(BYTE);
				((IntegralTypeContext)_localctx).ret =  ((IntegralTypeContext)_localctx).b;
				}
				break;
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				((IntegralTypeContext)_localctx).s = match(SHORT);
				((IntegralTypeContext)_localctx).ret =  ((IntegralTypeContext)_localctx).s;
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(505);
				((IntegralTypeContext)_localctx).i = match(INT);
				((IntegralTypeContext)_localctx).ret =  ((IntegralTypeContext)_localctx).i;
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 4);
				{
				setState(507);
				((IntegralTypeContext)_localctx).l = match(LONG);
				((IntegralTypeContext)_localctx).ret =  ((IntegralTypeContext)_localctx).l;
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(509);
				((IntegralTypeContext)_localctx).c = match(CHAR);
				((IntegralTypeContext)_localctx).ret =  ((IntegralTypeContext)_localctx).c;
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
		public Token ret;
		public Token f;
		public Token d;
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointType; }
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_floatingPointType);
		try {
			setState(517);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				((FloatingPointTypeContext)_localctx).f = match(FLOAT);
				((FloatingPointTypeContext)_localctx).ret =  ((FloatingPointTypeContext)_localctx).f;
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				((FloatingPointTypeContext)_localctx).d = match(DOUBLE);
				((FloatingPointTypeContext)_localctx).ret =  ((FloatingPointTypeContext)_localctx).d;
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
		public Expression ret;
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
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_referenceType);
		try {
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				((ReferenceTypeContext)_localctx).c = classOrInterfaceType();
				((ReferenceTypeContext)_localctx).ret =  ((ReferenceTypeContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				((ReferenceTypeContext)_localctx).v = typeVariable();
				((ReferenceTypeContext)_localctx).ret =  ((ReferenceTypeContext)_localctx).v.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(525);
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
		public Expression ret;
		public ClassType_lfno_classOrInterfaceTypeContext co;
		public ClassType_lfno_classOrInterfaceTypeContext c;
		public List<ClassType_lfno_classOrInterfaceTypeContext> classType_lfno_classOrInterfaceType() {
			return getRuleContexts(ClassType_lfno_classOrInterfaceTypeContext.class);
		}
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType(int i) {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			((ClassOrInterfaceTypeContext)_localctx).co = classType_lfno_classOrInterfaceType();
			((ClassOrInterfaceTypeContext)_localctx).ret =  ((ClassOrInterfaceTypeContext)_localctx).co.ret;
			setState(537);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(532);
					((ClassOrInterfaceTypeContext)_localctx).c = classType_lfno_classOrInterfaceType();
					((ClassOrInterfaceTypeContext)_localctx).ret =  new AccessExpression(_localctx.ret, ((ClassOrInterfaceTypeContext)_localctx).c.ret);
					}
					} 
				}
				setState(539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public Expression ret;
		public List<Annotation> anns = new ArrayList<>();
		public List<TypeArgument> ls = new ArrayList<>();
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
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classType);
		int _la;
		try {
			setState(574);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(540);
					((ClassTypeContext)_localctx).a = annotation();
					_localctx.anns.add(((ClassTypeContext)_localctx).a.ret);
					}
					}
					setState(547);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(548);
				((ClassTypeContext)_localctx).id = match(Identifier);
				((ClassTypeContext)_localctx).ret =  new IdentifierExpression(((ClassTypeContext)_localctx).id, _localctx.anns);
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(550);
					((ClassTypeContext)_localctx).targs = typeArguments();
					((ClassTypeContext)_localctx).ret =  new TypeExpression(_localctx.ret, ((ClassTypeContext)_localctx).targs.ret);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				((ClassTypeContext)_localctx).st = classOrInterfaceType();
				setState(556);
				match(DOT);
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(557);
					((ClassTypeContext)_localctx).a = annotation();
					_localctx.anns.add(((ClassTypeContext)_localctx).a.ret);
					}
					}
					setState(564);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(565);
				((ClassTypeContext)_localctx).id = match(Identifier);
				((ClassTypeContext)_localctx).ret =  new IdentifierExpression(((ClassTypeContext)_localctx).id, _localctx.anns);
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(567);
					((ClassTypeContext)_localctx).targs = typeArguments();
					((ClassTypeContext)_localctx).ret =  new TypeExpression(_localctx.ret, ((ClassTypeContext)_localctx).targs.ret);
					}
				}

				((ClassTypeContext)_localctx).ret =  new AccessExpression(((ClassTypeContext)_localctx).st.ret, _localctx.ret);
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

	public static class ClassType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public Expression ret;
		public List<Annotation> ans = new ArrayList<>();
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
	}

	public final ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() throws RecognitionException {
		ClassType_lfno_classOrInterfaceTypeContext _localctx = new ClassType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classType_lfno_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(576);
				((ClassType_lfno_classOrInterfaceTypeContext)_localctx).a = annotation();
				_localctx.ans.add(((ClassType_lfno_classOrInterfaceTypeContext)_localctx).a.ret);
				}
				}
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(584);
			((ClassType_lfno_classOrInterfaceTypeContext)_localctx).id = match(Identifier);
			((ClassType_lfno_classOrInterfaceTypeContext)_localctx).ret =  new IdentifierExpression(((ClassType_lfno_classOrInterfaceTypeContext)_localctx).id, _localctx.ans);
			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(586);
				((ClassType_lfno_classOrInterfaceTypeContext)_localctx).targs = typeArguments();
				((ClassType_lfno_classOrInterfaceTypeContext)_localctx).ret =  new TypeExpression(_localctx.ret, ((ClassType_lfno_classOrInterfaceTypeContext)_localctx).targs.ret);
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

	public static class TypeVariableContext extends ParserRuleContext {
		public Expression ret;
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
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(591);
				((TypeVariableContext)_localctx).a = annotation();
				_localctx.ans.add(((TypeVariableContext)_localctx).a.ret);
				}
				}
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(599);
			((TypeVariableContext)_localctx).id = match(Identifier);
			((TypeVariableContext)_localctx).ret =  new IdentifierExpression(((TypeVariableContext)_localctx).id, _localctx.ans);
			}
		}
		catch (RecognitionException re) {
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
		public ArrayTypeExpression ret;
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
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrayType);
		try {
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				((ArrayTypeContext)_localctx).p = primitiveType();
				setState(603);
				((ArrayTypeContext)_localctx).d = dims();
				((ArrayTypeContext)_localctx).ret =  new ArrayTypeExpression(((ArrayTypeContext)_localctx).p.ret, ((ArrayTypeContext)_localctx).d.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(606);
				((ArrayTypeContext)_localctx).c = classOrInterfaceType();
				setState(607);
				((ArrayTypeContext)_localctx).d = dims();
				((ArrayTypeContext)_localctx).ret =  new ArrayTypeExpression(((ArrayTypeContext)_localctx).c.ret, ((ArrayTypeContext)_localctx).d.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(610);
				((ArrayTypeContext)_localctx).v = typeVariable();
				setState(611);
				((ArrayTypeContext)_localctx).d = dims();
				((ArrayTypeContext)_localctx).ret =  new ArrayTypeExpression(((ArrayTypeContext)_localctx).v.ret, ((ArrayTypeContext)_localctx).d.ret);
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
		public List<Dimension> ret;
		public List<Annotation> ans = new ArrayList<>();
		public List<Dimension> ls = new ArrayList<>();
		public AnnotationContext a1;
		public Token first;
		public Token last;
		public AnnotationContext a;
		public Token f;
		public Token l;
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
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dims);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(616);
				((DimsContext)_localctx).a1 = annotation();
				_localctx.ans.add(((DimsContext)_localctx).a1.ret);
				}
				}
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(624);
			((DimsContext)_localctx).first = match(LBRACK);
			setState(625);
			((DimsContext)_localctx).last = match(RBRACK);
			_localctx.ls.add(new Dimension(((DimsContext)_localctx).first, ((DimsContext)_localctx).last, _localctx.ans));
			setState(641);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					_localctx.ans.clear();
					setState(633);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(628);
						((DimsContext)_localctx).a = annotation();
						_localctx.ans.add(((DimsContext)_localctx).a.ret);
						}
						}
						setState(635);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(636);
					((DimsContext)_localctx).f = match(LBRACK);
					setState(637);
					((DimsContext)_localctx).l = match(RBRACK);
					_localctx.ls.add(new Dimension(((DimsContext)_localctx).f, ((DimsContext)_localctx).l, _localctx.ans));
					}
					} 
				}
				setState(643);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			((DimsContext)_localctx).ret =  _localctx.ls;
			}
		}
		catch (RecognitionException re) {
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
		public List<Expression> ls = new ArrayList<>();
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
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeParameter);
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
				((TypeParameterContext)_localctx).a = typeParameterModifier();
				_localctx.ans.add(((TypeParameterContext)_localctx).a.ret);
				}
				}
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(654);
			((TypeParameterContext)_localctx).id = match(Identifier);
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(655);
				((TypeParameterContext)_localctx).b = typeBound();
				((TypeParameterContext)_localctx).ls =  ((TypeParameterContext)_localctx).b.ret;
				}
			}

			((TypeParameterContext)_localctx).ret =  new TypeParameter(((TypeParameterContext)_localctx).id, _localctx.ans, _localctx.ls);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final TypeParameterModifierContext typeParameterModifier() throws RecognitionException {
		TypeParameterModifierContext _localctx = new TypeParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
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
		public List<Expression> ret;
		public List<Expression> ls = new ArrayList<>();
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
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeBound);
		int _la;
		try {
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(665);
				match(EXTENDS);
				setState(666);
				((TypeBoundContext)_localctx).v = typeVariable();
				_localctx.ls.add(((TypeBoundContext)_localctx).v.ret); ((TypeBoundContext)_localctx).ret =  _localctx.ls;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(669);
				match(EXTENDS);
				setState(670);
				((TypeBoundContext)_localctx).c = classOrInterfaceType();
				_localctx.ls.add(((TypeBoundContext)_localctx).c.ret);
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(672);
					((TypeBoundContext)_localctx).a = additionalBound();
					_localctx.ls.add(((TypeBoundContext)_localctx).a.ret);
					}
					}
					setState(679);
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
		public Expression ret;
		public ClassTypeContext i;
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public AdditionalBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalBound; }
	}

	public final AdditionalBoundContext additionalBound() throws RecognitionException {
		AdditionalBoundContext _localctx = new AdditionalBoundContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_additionalBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(BITAND);
			setState(685);
			((AdditionalBoundContext)_localctx).i = classType();
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
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(LT);
			setState(689);
			((TypeArgumentsContext)_localctx).ls = typeArgumentList();
			setState(690);
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
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			((TypeArgumentListContext)_localctx).a1 = typeArgument();
			_localctx.ls.add(((TypeArgumentListContext)_localctx).a1.ret);
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(695);
				match(COMMA);
				setState(696);
				((TypeArgumentListContext)_localctx).a = typeArgument();
				_localctx.ls.add(((TypeArgumentListContext)_localctx).a.ret);
				}
				}
				setState(703);
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
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeArgument);
		try {
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(706);
				((TypeArgumentContext)_localctx).r = referenceType();
				((TypeArgumentContext)_localctx).ret =  new TypeArgument(((TypeArgumentContext)_localctx).r.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
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
		public Token w;
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
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(714);
				((WildcardContext)_localctx).a = annotation();
				_localctx.ans.add(((WildcardContext)_localctx).a.ret);
				}
				}
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(722);
			((WildcardContext)_localctx).w = match(QUESTION);
			((WildcardContext)_localctx).ret =  new TypeArgument(((WildcardContext)_localctx).w, _localctx.ans);
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(724);
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
	}

	public final WildcardBoundsContext wildcardBounds(TypeArgument ret) throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState(), ret);
		enterRule(_localctx, 42, RULE_wildcardBounds);
		try {
			setState(735);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(727);
				match(EXTENDS);
				setState(728);
				((WildcardBoundsContext)_localctx).r = referenceType();
				_localctx.ret.setBoundType(((WildcardBoundsContext)_localctx).r.ret); _localctx.ret.setIsUpperBounded(true);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(731);
				match(SUPER);
				setState(732);
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

	public static class TypeNameContext extends ParserRuleContext {
		public Expression ret;
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
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeName);
		try {
			setState(744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(737);
				((TypeNameContext)_localctx).id = match(Identifier);
				 ((TypeNameContext)_localctx).ret =  new IdentifierExpression(((TypeNameContext)_localctx).id); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				((TypeNameContext)_localctx).p = packageOrTypeName(0);
				setState(740);
				match(DOT);
				setState(741);
				((TypeNameContext)_localctx).id = match(Identifier);
				 ((TypeNameContext)_localctx).ret =  new AccessExpression(((TypeNameContext)_localctx).p.ret, ((TypeNameContext)_localctx).id); 
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
		public Expression ret;
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
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		return packageOrTypeName(0);
	}

	private PackageOrTypeNameContext packageOrTypeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, _parentState);
		PackageOrTypeNameContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_packageOrTypeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(747);
			((PackageOrTypeNameContext)_localctx).id = match(Identifier);
			 ((PackageOrTypeNameContext)_localctx).ret =  new IdentifierExpression(((PackageOrTypeNameContext)_localctx).id); 
			}
			_ctx.stop = _input.LT(-1);
			setState(756);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
					setState(750);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(751);
					match(DOT);
					setState(752);
					((PackageOrTypeNameContext)_localctx).id = match(Identifier);
					 ((PackageOrTypeNameContext)_localctx).ret =  new AccessExpression(((PackageOrTypeNameContext)_localctx).p.ret, ((PackageOrTypeNameContext)_localctx).id); 
					}
					} 
				}
				setState(758);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		public Expression ret;
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
	}

	public final ExpressionNameContext expressionName() throws RecognitionException {
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expressionName);
		try {
			setState(766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(759);
				((ExpressionNameContext)_localctx).id = match(Identifier);
				 ((ExpressionNameContext)_localctx).ret =  new IdentifierExpression(((ExpressionNameContext)_localctx).id); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(761);
				((ExpressionNameContext)_localctx).a = ambiguousName(0);
				setState(762);
				match(DOT);
				setState(763);
				((ExpressionNameContext)_localctx).id = match(Identifier);
				 ((ExpressionNameContext)_localctx).ret =  new AccessExpression(((ExpressionNameContext)_localctx).a.ret, ((ExpressionNameContext)_localctx).id); 
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

	public static class AmbiguousNameContext extends ParserRuleContext {
		public Expression ret;
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
	}

	public final AmbiguousNameContext ambiguousName() throws RecognitionException {
		return ambiguousName(0);
	}

	private AmbiguousNameContext ambiguousName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx, _parentState);
		AmbiguousNameContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_ambiguousName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(769);
			((AmbiguousNameContext)_localctx).id = match(Identifier);
			 ((AmbiguousNameContext)_localctx).ret =  new IdentifierExpression(((AmbiguousNameContext)_localctx).id); 
			}
			_ctx.stop = _input.LT(-1);
			setState(778);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
					setState(772);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(773);
					match(DOT);
					setState(774);
					((AmbiguousNameContext)_localctx).id = match(Identifier);
					 ((AmbiguousNameContext)_localctx).ret =  new AccessExpression(((AmbiguousNameContext)_localctx).a.ret, ((AmbiguousNameContext)_localctx).id); 
					}
					} 
				}
				setState(780);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(781);
				((CompilationUnitContext)_localctx).p = packageDeclaration();
				((CompilationUnitContext)_localctx).stmt =  ((CompilationUnitContext)_localctx).p.ret;
				}
				break;
			}
			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(786);
				((CompilationUnitContext)_localctx).i = importDeclaration();
				_localctx.imports.add(((CompilationUnitContext)_localctx).i.ret);
				}
				}
				setState(793);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==AT) {
				{
				{
				setState(794);
				((CompilationUnitContext)_localctx).t = typeDeclaration();
				_localctx.bodies.add(((CompilationUnitContext)_localctx).t.ret);
				}
				}
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(802);
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
		public List<Token> ids = new ArrayList<>();
		public PackageModifierContext a;
		public Token kw;
		public Token id;
		public Token last;
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
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(805);
				((PackageDeclarationContext)_localctx).a = packageModifier();
				_localctx.anns.add(((PackageDeclarationContext)_localctx).a.ret);
				}
				}
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(813);
			((PackageDeclarationContext)_localctx).kw = match(PACKAGE);
			{
			setState(814);
			((PackageDeclarationContext)_localctx).id = match(Identifier);
			_localctx.ids.add(((PackageDeclarationContext)_localctx).id);
			}
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(817);
				match(DOT);
				setState(818);
				((PackageDeclarationContext)_localctx).id = match(Identifier);
				_localctx.ids.add(((PackageDeclarationContext)_localctx).id);
				}
				}
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(825);
			((PackageDeclarationContext)_localctx).last = match(SEMI);
			 ((PackageDeclarationContext)_localctx).ret =  new PackageStatement(_localctx.ids, ((PackageDeclarationContext)_localctx).kw, ((PackageDeclarationContext)_localctx).last, _localctx.anns);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final PackageModifierContext packageModifier() throws RecognitionException {
		PackageModifierContext _localctx = new PackageModifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_packageModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
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
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_importDeclaration);
		try {
			setState(843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(831);
				((ImportDeclarationContext)_localctx).s = singleTypeImportDeclaration();
				((ImportDeclarationContext)_localctx).ret =  ((ImportDeclarationContext)_localctx).s.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(834);
				((ImportDeclarationContext)_localctx).t = typeImportOnDemandDeclaration();
				((ImportDeclarationContext)_localctx).ret =  ((ImportDeclarationContext)_localctx).t.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(837);
				((ImportDeclarationContext)_localctx).ss = singleStaticImportDeclaration();
				((ImportDeclarationContext)_localctx).ret =  ((ImportDeclarationContext)_localctx).ss.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(840);
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
		public Token kw;
		public TypeNameContext t;
		public Token last;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public SingleTypeImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTypeImportDeclaration; }
	}

	public final SingleTypeImportDeclarationContext singleTypeImportDeclaration() throws RecognitionException {
		SingleTypeImportDeclarationContext _localctx = new SingleTypeImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_singleTypeImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			((SingleTypeImportDeclarationContext)_localctx).kw = match(IMPORT);
			setState(846);
			((SingleTypeImportDeclarationContext)_localctx).t = typeName();
			setState(847);
			((SingleTypeImportDeclarationContext)_localctx).last = match(SEMI);
			 ((SingleTypeImportDeclarationContext)_localctx).ret =  new ImportStatement(((SingleTypeImportDeclarationContext)_localctx).kw, ((SingleTypeImportDeclarationContext)_localctx).last, ((SingleTypeImportDeclarationContext)_localctx).t.ret, false, false); 
			}
		}
		catch (RecognitionException re) {
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
		public Token kw;
		public PackageOrTypeNameContext p;
		public Token last;
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeImportOnDemandDeclaration; }
	}

	public final TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() throws RecognitionException {
		TypeImportOnDemandDeclarationContext _localctx = new TypeImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_typeImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			((TypeImportOnDemandDeclarationContext)_localctx).kw = match(IMPORT);
			setState(851);
			((TypeImportOnDemandDeclarationContext)_localctx).p = packageOrTypeName(0);
			setState(852);
			match(DOT);
			setState(853);
			match(MUL);
			setState(854);
			((TypeImportOnDemandDeclarationContext)_localctx).last = match(SEMI);
			((TypeImportOnDemandDeclarationContext)_localctx).ret =  new ImportStatement(((TypeImportOnDemandDeclarationContext)_localctx).kw, ((TypeImportOnDemandDeclarationContext)_localctx).last, ((TypeImportOnDemandDeclarationContext)_localctx).p.ret, false, true);
			}
		}
		catch (RecognitionException re) {
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
		public Token kw;
		public TypeNameContext t;
		public Token id;
		public Token last;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public SingleStaticImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStaticImportDeclaration; }
	}

	public final SingleStaticImportDeclarationContext singleStaticImportDeclaration() throws RecognitionException {
		SingleStaticImportDeclarationContext _localctx = new SingleStaticImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_singleStaticImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			((SingleStaticImportDeclarationContext)_localctx).kw = match(IMPORT);
			setState(858);
			match(STATIC);
			setState(859);
			((SingleStaticImportDeclarationContext)_localctx).t = typeName();
			setState(860);
			match(DOT);
			setState(861);
			((SingleStaticImportDeclarationContext)_localctx).id = match(Identifier);
			setState(862);
			((SingleStaticImportDeclarationContext)_localctx).last = match(SEMI);
			((SingleStaticImportDeclarationContext)_localctx).ret =  new ImportStatement(((SingleStaticImportDeclarationContext)_localctx).kw,
			                                    ((SingleStaticImportDeclarationContext)_localctx).last,
			                                    new AccessExpression(((SingleStaticImportDeclarationContext)_localctx).t.ret, ((SingleStaticImportDeclarationContext)_localctx).id),
			                                    true,
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

	public static class StaticImportOnDemandDeclarationContext extends ParserRuleContext {
		public ImportStatement ret;
		public Token kw;
		public TypeNameContext t;
		public Token last;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StaticImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticImportOnDemandDeclaration; }
	}

	public final StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() throws RecognitionException {
		StaticImportOnDemandDeclarationContext _localctx = new StaticImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_staticImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			((StaticImportOnDemandDeclarationContext)_localctx).kw = match(IMPORT);
			setState(866);
			match(STATIC);
			setState(867);
			((StaticImportOnDemandDeclarationContext)_localctx).t = typeName();
			setState(868);
			match(DOT);
			setState(869);
			match(MUL);
			setState(870);
			((StaticImportOnDemandDeclarationContext)_localctx).last = match(SEMI);
			((StaticImportOnDemandDeclarationContext)_localctx).ret =  new ImportStatement(((StaticImportOnDemandDeclarationContext)_localctx).kw, ((StaticImportOnDemandDeclarationContext)_localctx).last, ((StaticImportOnDemandDeclarationContext)_localctx).t.ret, true, true);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_typeDeclaration);
		try {
			setState(880);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(873);
				((TypeDeclarationContext)_localctx).c = classDeclaration();
				((TypeDeclarationContext)_localctx).ret =  ((TypeDeclarationContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(876);
				((TypeDeclarationContext)_localctx).i = interfaceDeclaration();
				((TypeDeclarationContext)_localctx).ret =  ((TypeDeclarationContext)_localctx).i.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(879);
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
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_classDeclaration);
		try {
			setState(888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(882);
				((ClassDeclarationContext)_localctx).n = normalClassDeclaration();
				((ClassDeclarationContext)_localctx).ret =  ((ClassDeclarationContext)_localctx).n.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(885);
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
		public List<Annotation> ans = new ArrayList<>();
		public List<TypeParameter> tpars = new ArrayList<>();
		public Expression scls = null;
		public List<Expression> sis = new ArrayList<>();
		public ClassModifierContext m;
		public AnnotationContext a;
		public Token kw;
		public Token n;
		public TypeParametersContext p;
		public SuperclassContext sc;
		public SuperinterfacesContext si;
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				setState(896);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ABSTRACT:
				case FINAL:
				case PRIVATE:
				case PROTECTED:
				case PUBLIC:
				case STATIC:
				case STRICTFP:
					{
					{
					setState(890);
					((NormalClassDeclarationContext)_localctx).m = classModifier();
					_localctx.mods.add(((NormalClassDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(893);
					((NormalClassDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((NormalClassDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(900);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			checkModifiers(_localctx.mods);
			setState(902);
			((NormalClassDeclarationContext)_localctx).kw = match(CLASS);
			setState(903);
			((NormalClassDeclarationContext)_localctx).n = match(Identifier);
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(904);
				((NormalClassDeclarationContext)_localctx).p = typeParameters();
				((NormalClassDeclarationContext)_localctx).tpars =  ((NormalClassDeclarationContext)_localctx).p.ret;
				}
			}

			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(909);
				((NormalClassDeclarationContext)_localctx).sc = superclass();
				((NormalClassDeclarationContext)_localctx).scls =  ((NormalClassDeclarationContext)_localctx).sc.ret;
				}
			}

			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(914);
				((NormalClassDeclarationContext)_localctx).si = superinterfaces();
				((NormalClassDeclarationContext)_localctx).sis =  ((NormalClassDeclarationContext)_localctx).si.ret;
				}
			}

			((NormalClassDeclarationContext)_localctx).ret =  new ClassDeclaration(((NormalClassDeclarationContext)_localctx).n,
			                                     ((NormalClassDeclarationContext)_localctx).kw,
			                                     _localctx.mods,
			                                     _localctx.ans,
			                                     _localctx.sis,
			                                     _localctx.tpars,
			                                     _localctx.scls);
			setState(920);
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
		public Token pu;
		public Token pro;
		public Token pri;
		public Token ab;
		public Token st;
		public Token f;
		public Token fp;
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_classModifier);
		try {
			setState(936);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(922);
				((ClassModifierContext)_localctx).pu = match(PUBLIC);
				((ClassModifierContext)_localctx).ret =  new Modifier(((ClassModifierContext)_localctx).pu);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(924);
				((ClassModifierContext)_localctx).pro = match(PROTECTED);
				((ClassModifierContext)_localctx).ret =  new Modifier(((ClassModifierContext)_localctx).pro);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(926);
				((ClassModifierContext)_localctx).pri = match(PRIVATE);
				((ClassModifierContext)_localctx).ret =  new Modifier(((ClassModifierContext)_localctx).pri);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 4);
				{
				setState(928);
				((ClassModifierContext)_localctx).ab = match(ABSTRACT);
				((ClassModifierContext)_localctx).ret =  new Modifier(((ClassModifierContext)_localctx).ab);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(930);
				((ClassModifierContext)_localctx).st = match(STATIC);
				((ClassModifierContext)_localctx).ret =  new Modifier(((ClassModifierContext)_localctx).st);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(932);
				((ClassModifierContext)_localctx).f = match(FINAL);
				((ClassModifierContext)_localctx).ret =  new Modifier(((ClassModifierContext)_localctx).f);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
				setState(934);
				((ClassModifierContext)_localctx).fp = match(STRICTFP);
				((ClassModifierContext)_localctx).ret =  new Modifier(((ClassModifierContext)_localctx).fp);
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
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			match(LT);
			setState(939);
			((TypeParametersContext)_localctx).t = typeParameterList();
			setState(940);
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
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(943);
			((TypeParameterListContext)_localctx).t1 = typeParameter();
			_localctx.ls.add(((TypeParameterListContext)_localctx).t1.ret);
			}
			setState(952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(946);
				match(COMMA);
				setState(947);
				((TypeParameterListContext)_localctx).t = typeParameter();
				_localctx.ls.add(((TypeParameterListContext)_localctx).t.ret);
				}
				}
				setState(954);
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
		public Expression ret;
		public ClassTypeContext c;
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			match(EXTENDS);
			setState(958);
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
		public List<Expression> ret;
		public InterfaceTypeListContext i;
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public SuperinterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superinterfaces; }
	}

	public final SuperinterfacesContext superinterfaces() throws RecognitionException {
		SuperinterfacesContext _localctx = new SuperinterfacesContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_superinterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			match(IMPLEMENTS);
			setState(962);
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
		public List<Expression> ret;
		public List<Expression> ls = new ArrayList<>();
		public ClassTypeContext i1;
		public ClassTypeContext i;
		public List<ClassTypeContext> classType() {
			return getRuleContexts(ClassTypeContext.class);
		}
		public ClassTypeContext classType(int i) {
			return getRuleContext(ClassTypeContext.class,i);
		}
		public InterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceTypeList; }
	}

	public final InterfaceTypeListContext interfaceTypeList() throws RecognitionException {
		InterfaceTypeListContext _localctx = new InterfaceTypeListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_interfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(965);
			((InterfaceTypeListContext)_localctx).i1 = classType();
			_localctx.ls.add(((InterfaceTypeListContext)_localctx).i1.ret);
			}
			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(968);
				match(COMMA);
				setState(969);
				((InterfaceTypeListContext)_localctx).i = classType();
				_localctx.ls.add(((InterfaceTypeListContext)_localctx).i.ret);
				}
				}
				setState(976);
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
		public Token first;
		public Token last;
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
	}

	public final ClassBodyContext classBody(ConcreteBodyDeclaration ret) throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState(), ret);
		enterRule(_localctx, 86, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			((ClassBodyContext)_localctx).first = match(LBRACE);
			setState(983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(980);
				classBodyDeclaration(_localctx.ret);
				}
				}
				setState(985);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(986);
			((ClassBodyContext)_localctx).last = match(RBRACE);
			_localctx.ret.setFirstToken(((ClassBodyContext)_localctx).first); _localctx.ret.setLastToken(((ClassBodyContext)_localctx).last);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final ClassBodyDeclarationContext classBodyDeclaration(ConcreteBodyDeclaration ret) throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState(), ret);
		enterRule(_localctx, 88, RULE_classBodyDeclaration);
		try {
			setState(999);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(989);
				classMemberDeclaration(_localctx.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(990);
				((ClassBodyDeclarationContext)_localctx).i = instanceInitializer();
				_localctx.ret.addInstanceInitializer(((ClassBodyDeclarationContext)_localctx).i.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(993);
				((ClassBodyDeclarationContext)_localctx).s = staticInitializer();
				_localctx.ret.addStaticInitializer(((ClassBodyDeclarationContext)_localctx).s.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(996);
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
	}

	public final ClassMemberDeclarationContext classMemberDeclaration(ConcreteBodyDeclaration ret) throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState(), ret);
		enterRule(_localctx, 90, RULE_classMemberDeclaration);
		try {
			setState(1012);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1001);
				((ClassMemberDeclarationContext)_localctx).f = fieldDeclaration(ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1002);
				((ClassMemberDeclarationContext)_localctx).m = methodDeclaration();
				_localctx.ret.addMethod(((ClassMemberDeclarationContext)_localctx).m.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1005);
				((ClassMemberDeclarationContext)_localctx).c = classDeclaration();
				_localctx.ret.addInnerBody(((ClassMemberDeclarationContext)_localctx).c.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1008);
				((ClassMemberDeclarationContext)_localctx).i = interfaceDeclaration();
				_localctx.ret.addInnerInterface(((ClassMemberDeclarationContext)_localctx).i.ret);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1011);
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
		public BodyDeclaration decl;
		public List<Modifier> mods = new ArrayList<>();
		public List<Annotation> ans = new ArrayList<>();
		public FieldModifierContext m;
		public AnnotationContext a;
		public UnannTypeContext t;
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState, BodyDeclaration decl) {
			super(parent, invokingState);
			this.decl = decl;
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
	}

	public final FieldDeclarationContext fieldDeclaration(BodyDeclaration decl) throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState(), decl);
		enterRule(_localctx, 92, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				setState(1020);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FINAL:
				case PRIVATE:
				case PROTECTED:
				case PUBLIC:
				case STATIC:
				case TRANSIENT:
				case VOLATILE:
					{
					{
					setState(1014);
					((FieldDeclarationContext)_localctx).m = fieldModifier();
					_localctx.mods.add(((FieldDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1017);
					((FieldDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((FieldDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			checkModifiers(_localctx.mods);
			setState(1026);
			((FieldDeclarationContext)_localctx).t = unannType();
			setState(1027);
			variableDeclaratorList(_localctx.decl, _localctx.mods, _localctx.ans, ((FieldDeclarationContext)_localctx).t.ret);
			setState(1028);
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

	public static class FieldModifierContext extends ParserRuleContext {
		public Modifier ret;
		public Token pu;
		public Token pro;
		public Token pri;
		public Token st;
		public Token f;
		public Token t;
		public Token v;
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_fieldModifier);
		try {
			setState(1044);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1030);
				((FieldModifierContext)_localctx).pu = match(PUBLIC);
				((FieldModifierContext)_localctx).ret =  new Modifier(((FieldModifierContext)_localctx).pu);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1032);
				((FieldModifierContext)_localctx).pro = match(PROTECTED);
				((FieldModifierContext)_localctx).ret =  new Modifier(((FieldModifierContext)_localctx).pro);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1034);
				((FieldModifierContext)_localctx).pri = match(PRIVATE);
				((FieldModifierContext)_localctx).ret =  new Modifier(((FieldModifierContext)_localctx).pri);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 4);
				{
				setState(1036);
				((FieldModifierContext)_localctx).st = match(STATIC);
				((FieldModifierContext)_localctx).ret =  new Modifier(((FieldModifierContext)_localctx).st);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1038);
				((FieldModifierContext)_localctx).f = match(FINAL);
				((FieldModifierContext)_localctx).ret =  new Modifier(((FieldModifierContext)_localctx).f);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1040);
				((FieldModifierContext)_localctx).t = match(TRANSIENT);
				((FieldModifierContext)_localctx).ret =  new Modifier(((FieldModifierContext)_localctx).t);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1042);
				((FieldModifierContext)_localctx).v = match(VOLATILE);
				((FieldModifierContext)_localctx).ret =  new Modifier(((FieldModifierContext)_localctx).v);
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
		public BodyDeclaration decl;
		public List<Modifier> mods;
		public List<Annotation> ans;
		public Expression t;
		public List<VariableDeclaration> ret;
		public List<VariableDeclaration> ls = new ArrayList<>();
		public VariableDeclaratorContext d1;
		public VariableDeclaratorContext d;
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState, BodyDeclaration decl, List<Modifier> mods, List<Annotation> ans, Expression t) {
			super(parent, invokingState);
			this.decl = decl;
			this.mods = mods;
			this.ans = ans;
			this.t = t;
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorList; }
	}

	public final VariableDeclaratorListContext variableDeclaratorList(BodyDeclaration decl,List<Modifier> mods,List<Annotation> ans,Expression t) throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState(), decl, mods, ans, t);
		enterRule(_localctx, 96, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1046);
			((VariableDeclaratorListContext)_localctx).d1 = variableDeclarator(_localctx.decl, _localctx.mods, _localctx.ans, _localctx.t);
			_localctx.ls.add(((VariableDeclaratorListContext)_localctx).d1.ret);
			}
			setState(1055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1049);
				match(COMMA);
				setState(1050);
				((VariableDeclaratorListContext)_localctx).d = variableDeclarator(_localctx.decl, _localctx.mods, _localctx.ans, _localctx.t);
				_localctx.ls.add(((VariableDeclaratorListContext)_localctx).d.ret);
				}
				}
				setState(1057);
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
		public BodyDeclaration decl;
		public List<Modifier> mods;
		public List<Annotation> ans;
		public Expression t;
		public VariableDeclaration ret;
		public Expression type;
		public VariableDeclaration var;
		public VariableDeclaratorIdContext id;
		public VariableInitializerContext in;
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState, BodyDeclaration decl, List<Modifier> mods, List<Annotation> ans, Expression t) {
			super(parent, invokingState);
			this.decl = decl;
			this.mods = mods;
			this.ans = ans;
			this.t = t;
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
	}

	public final VariableDeclaratorContext variableDeclarator(BodyDeclaration decl,List<Modifier> mods,List<Annotation> ans,Expression t) throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState(), decl, mods, ans, t);
		enterRule(_localctx, 98, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			((VariableDeclaratorContext)_localctx).id = variableDeclaratorId();

			            ((VariableDeclaratorContext)_localctx).type =  _localctx.t;
			            if (((VariableDeclaratorContext)_localctx).id.d.size() > 0) {
			                ((VariableDeclaratorContext)_localctx).type =  new ArrayTypeExpression(_localctx.type, ((VariableDeclaratorContext)_localctx).id.d);
			            }
			            ((VariableDeclaratorContext)_localctx).var =  new VariableDeclaration(((VariableDeclaratorContext)_localctx).id.ret, _localctx.type, _localctx.mods, _localctx.ans);
			            if (_localctx.decl != null) {
			                _localctx.decl.addField(_localctx.var);
			            }
			        
			setState(1066);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1062);
				match(ASSIGN);
				setState(1063);
				((VariableDeclaratorContext)_localctx).in = variableInitializer();
				_localctx.var.setInitializer(((VariableDeclaratorContext)_localctx).in.ret);
				}
			}

			((VariableDeclaratorContext)_localctx).ret =  _localctx.var;
			}
		}
		catch (RecognitionException re) {
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
		public Token ret;
		public List<Dimension> d;
		public Token id;
		public DimsContext ls;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((VariableDeclaratorIdContext)_localctx).d =  new ArrayList<Dimension>();
			setState(1071);
			((VariableDeclaratorIdContext)_localctx).id = match(Identifier);
			setState(1075);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1072);
				((VariableDeclaratorIdContext)_localctx).ls = dims();
				((VariableDeclaratorIdContext)_localctx).d =  ((VariableDeclaratorIdContext)_localctx).ls.ret;
				}
			}

			((VariableDeclaratorIdContext)_localctx).ret =  ((VariableDeclaratorIdContext)_localctx).id;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedVariableDeclaratorIdContext extends ParserRuleContext {
		public List<Modifier> mods;
		public List<Annotation> ans;
		public VariableDeclaration ret;
		public Expression expr;
		public UnannTypeContext t;
		public VariableDeclaratorIdContext id;
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TypedVariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TypedVariableDeclaratorIdContext(ParserRuleContext parent, int invokingState, List<Modifier> mods, List<Annotation> ans) {
			super(parent, invokingState);
			this.mods = mods;
			this.ans = ans;
		}
		@Override public int getRuleIndex() { return RULE_typedVariableDeclaratorId; }
	}

	public final TypedVariableDeclaratorIdContext typedVariableDeclaratorId(List<Modifier> mods,List<Annotation> ans) throws RecognitionException {
		TypedVariableDeclaratorIdContext _localctx = new TypedVariableDeclaratorIdContext(_ctx, getState(), mods, ans);
		enterRule(_localctx, 102, RULE_typedVariableDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			((TypedVariableDeclaratorIdContext)_localctx).t = unannType();
			setState(1080);
			((TypedVariableDeclaratorIdContext)_localctx).id = variableDeclaratorId();

			            ((TypedVariableDeclaratorIdContext)_localctx).expr =  ((TypedVariableDeclaratorIdContext)_localctx).t.ret;
			            if (((TypedVariableDeclaratorIdContext)_localctx).id.d.size() > 0) {
			                ((TypedVariableDeclaratorIdContext)_localctx).expr =  new ArrayTypeExpression(_localctx.expr, ((TypedVariableDeclaratorIdContext)_localctx).id.d);
			            }
			            ((TypedVariableDeclaratorIdContext)_localctx).ret =  new VariableDeclaration(((TypedVariableDeclaratorIdContext)_localctx).id.ret, _localctx.expr, _localctx.mods, _localctx.ans);
			        
			}
		}
		catch (RecognitionException re) {
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
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_variableInitializer);
		try {
			setState(1089);
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
				setState(1083);
				((VariableInitializerContext)_localctx).ex = expression();
				((VariableInitializerContext)_localctx).ret =  ((VariableInitializerContext)_localctx).ex.ret;
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1086);
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
		public Expression ret;
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
	}

	public final UnannTypeContext unannType() throws RecognitionException {
		UnannTypeContext _localctx = new UnannTypeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_unannType);
		try {
			setState(1097);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1091);
				((UnannTypeContext)_localctx).p = unannPrimitiveType();
				((UnannTypeContext)_localctx).ret =  new IdentifierExpression(((UnannTypeContext)_localctx).p.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1094);
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
		public Token ret;
		public NumericTypeContext n;
		public Token b;
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public UnannPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannPrimitiveType; }
	}

	public final UnannPrimitiveTypeContext unannPrimitiveType() throws RecognitionException {
		UnannPrimitiveTypeContext _localctx = new UnannPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_unannPrimitiveType);
		try {
			setState(1104);
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
				setState(1099);
				((UnannPrimitiveTypeContext)_localctx).n = numericType();
				((UnannPrimitiveTypeContext)_localctx).ret =  ((UnannPrimitiveTypeContext)_localctx).n.ret;
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1102);
				((UnannPrimitiveTypeContext)_localctx).b = match(BOOLEAN);
				((UnannPrimitiveTypeContext)_localctx).ret =  ((UnannPrimitiveTypeContext)_localctx).b;
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
		public Expression ret;
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
	}

	public final UnannReferenceTypeContext unannReferenceType() throws RecognitionException {
		UnannReferenceTypeContext _localctx = new UnannReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_unannReferenceType);
		try {
			setState(1115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1106);
				((UnannReferenceTypeContext)_localctx).c = unannClassOrInterfaceType();
				((UnannReferenceTypeContext)_localctx).ret =  ((UnannReferenceTypeContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1109);
				((UnannReferenceTypeContext)_localctx).v = unannTypeVariable();
				((UnannReferenceTypeContext)_localctx).ret =  ((UnannReferenceTypeContext)_localctx).v.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1112);
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
		public Expression ret;
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext cno;
		public ClassType_lfno_classOrInterfaceTypeContext c;
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public List<ClassType_lfno_classOrInterfaceTypeContext> classType_lfno_classOrInterfaceType() {
			return getRuleContexts(ClassType_lfno_classOrInterfaceTypeContext.class);
		}
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType(int i) {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,i);
		}
		public UnannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassOrInterfaceType; }
	}

	public final UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() throws RecognitionException {
		UnannClassOrInterfaceTypeContext _localctx = new UnannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_unannClassOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1117);
			((UnannClassOrInterfaceTypeContext)_localctx).cno = unannClassType_lfno_unannClassOrInterfaceType();
			((UnannClassOrInterfaceTypeContext)_localctx).ret =  ((UnannClassOrInterfaceTypeContext)_localctx).cno.ret;
			}
			setState(1126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1120);
					match(DOT);
					setState(1121);
					((UnannClassOrInterfaceTypeContext)_localctx).c = classType_lfno_classOrInterfaceType();
					((UnannClassOrInterfaceTypeContext)_localctx).ret =  new AccessExpression(_localctx.ret, ((UnannClassOrInterfaceTypeContext)_localctx).c.ret);
					}
					} 
				}
				setState(1128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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
		public Expression ret;
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext u;
		public UnannClassOrInterfaceTypeContext a;
		public ClassType_lfno_classOrInterfaceTypeContext b;
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public UnannClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType; }
	}

	public final UnannClassTypeContext unannClassType() throws RecognitionException {
		UnannClassTypeContext _localctx = new UnannClassTypeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_unannClassType);
		try {
			setState(1137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1129);
				((UnannClassTypeContext)_localctx).u = unannClassType_lfno_unannClassOrInterfaceType();
				((UnannClassTypeContext)_localctx).ret =  ((UnannClassTypeContext)_localctx).u.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1132);
				((UnannClassTypeContext)_localctx).a = unannClassOrInterfaceType();
				setState(1133);
				match(DOT);
				setState(1134);
				((UnannClassTypeContext)_localctx).b = classType_lfno_classOrInterfaceType();
				((UnannClassTypeContext)_localctx).ret =  new AccessExpression(((UnannClassTypeContext)_localctx).a.ret, ((UnannClassTypeContext)_localctx).b.ret);
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

	public static class UnannClassType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public Expression ret;
		public Token id;
		public TypeArgumentsContext targs;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lfno_unannClassOrInterfaceType; }
	}

	public final UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_unannClassType_lfno_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			((UnannClassType_lfno_unannClassOrInterfaceTypeContext)_localctx).id = match(Identifier);
			((UnannClassType_lfno_unannClassOrInterfaceTypeContext)_localctx).ret =  new IdentifierExpression(((UnannClassType_lfno_unannClassOrInterfaceTypeContext)_localctx).id);
			setState(1144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1141);
				((UnannClassType_lfno_unannClassOrInterfaceTypeContext)_localctx).targs = typeArguments();
				((UnannClassType_lfno_unannClassOrInterfaceTypeContext)_localctx).ret =  new TypeExpression(_localctx.ret, ((UnannClassType_lfno_unannClassOrInterfaceTypeContext)_localctx).targs.ret);
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

	public static class UnannTypeVariableContext extends ParserRuleContext {
		public Expression ret;
		public Token i;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public UnannTypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannTypeVariable; }
	}

	public final UnannTypeVariableContext unannTypeVariable() throws RecognitionException {
		UnannTypeVariableContext _localctx = new UnannTypeVariableContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_unannTypeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			((UnannTypeVariableContext)_localctx).i = match(Identifier);
			((UnannTypeVariableContext)_localctx).ret =  new IdentifierExpression(((UnannTypeVariableContext)_localctx).i);
			}
		}
		catch (RecognitionException re) {
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
		public ArrayTypeExpression ret;
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
	}

	public final UnannArrayTypeContext unannArrayType() throws RecognitionException {
		UnannArrayTypeContext _localctx = new UnannArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_unannArrayType);
		try {
			setState(1161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1149);
				((UnannArrayTypeContext)_localctx).p = unannPrimitiveType();
				setState(1150);
				((UnannArrayTypeContext)_localctx).d = dims();
				((UnannArrayTypeContext)_localctx).ret =  new ArrayTypeExpression(new KeywordExpression(((UnannArrayTypeContext)_localctx).p.ret), ((UnannArrayTypeContext)_localctx).d.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1153);
				((UnannArrayTypeContext)_localctx).c = unannClassOrInterfaceType();
				setState(1154);
				((UnannArrayTypeContext)_localctx).d = dims();
				((UnannArrayTypeContext)_localctx).ret =  new ArrayTypeExpression(((UnannArrayTypeContext)_localctx).c.ret, ((UnannArrayTypeContext)_localctx).d.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1157);
				((UnannArrayTypeContext)_localctx).v = unannTypeVariable();
				setState(1158);
				((UnannArrayTypeContext)_localctx).d = dims();
				((UnannArrayTypeContext)_localctx).ret =  new ArrayTypeExpression(((UnannArrayTypeContext)_localctx).v.ret, ((UnannArrayTypeContext)_localctx).d.ret);
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
		public List<Annotation> ans = new ArrayList<>();
		public MethodModifierContext m;
		public AnnotationContext a;
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
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED))) != 0) || _la==AT) {
				{
				setState(1169);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ABSTRACT:
				case FINAL:
				case NATIVE:
				case PRIVATE:
				case PROTECTED:
				case PUBLIC:
				case STATIC:
				case STRICTFP:
				case SYNCHRONIZED:
					{
					{
					setState(1163);
					((MethodDeclarationContext)_localctx).m = methodModifier();
					_localctx.mods.add(((MethodDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1166);
					((MethodDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((MethodDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			checkModifiers(_localctx.mods);
			((MethodDeclarationContext)_localctx).ret =  new MethodDeclaration(_localctx.mods, _localctx.ans);
			setState(1176);
			methodHeader(_localctx.ret);
			setState(1177);
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
		public Token pu;
		public Token pro;
		public Token pri;
		public Token ab;
		public Token st;
		public Token f;
		public Token s;
		public Token n;
		public Token fp;
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_methodModifier);
		try {
			setState(1198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1180);
				((MethodModifierContext)_localctx).pu = match(PUBLIC);
				((MethodModifierContext)_localctx).ret =  new Modifier(((MethodModifierContext)_localctx).pu);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1182);
				((MethodModifierContext)_localctx).pro = match(PROTECTED);
				((MethodModifierContext)_localctx).ret =  new Modifier(((MethodModifierContext)_localctx).pro);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1184);
				((MethodModifierContext)_localctx).pri = match(PRIVATE);
				((MethodModifierContext)_localctx).ret =  new Modifier(((MethodModifierContext)_localctx).pri);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1186);
				((MethodModifierContext)_localctx).ab = match(ABSTRACT);
				((MethodModifierContext)_localctx).ret =  new Modifier(((MethodModifierContext)_localctx).ab);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1188);
				((MethodModifierContext)_localctx).st = match(STATIC);
				((MethodModifierContext)_localctx).ret =  new Modifier(((MethodModifierContext)_localctx).st);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1190);
				((MethodModifierContext)_localctx).f = match(FINAL);
				((MethodModifierContext)_localctx).ret =  new Modifier(((MethodModifierContext)_localctx).f);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 7);
				{
				setState(1192);
				((MethodModifierContext)_localctx).s = match(SYNCHRONIZED);
				((MethodModifierContext)_localctx).ret =  new Modifier(((MethodModifierContext)_localctx).s);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1194);
				((MethodModifierContext)_localctx).n = match(NATIVE);
				((MethodModifierContext)_localctx).ret =  new Modifier(((MethodModifierContext)_localctx).n);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 9);
				{
				setState(1196);
				((MethodModifierContext)_localctx).fp = match(STRICTFP);
				((MethodModifierContext)_localctx).ret =  new Modifier(((MethodModifierContext)_localctx).fp);
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
	}

	public final MethodHeaderContext methodHeader(MethodDeclaration ret) throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState(), ret);
		enterRule(_localctx, 126, RULE_methodHeader);
		int _la;
		try {
			setState(1227);
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
				setState(1200);
				((MethodHeaderContext)_localctx).rt = result();
				_localctx.ret.setReturnType(((MethodHeaderContext)_localctx).rt.ret);
				setState(1202);
				methodDeclarator(_localctx.ret);
				setState(1206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1203);
					((MethodHeaderContext)_localctx).th = throws_();
					_localctx.ret.setExceptions(((MethodHeaderContext)_localctx).th.ret);
					}
				}

				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1208);
				((MethodHeaderContext)_localctx).tp = typeParameters();
				_localctx.ret.setTypeParameters(((MethodHeaderContext)_localctx).tp.ret);
				setState(1215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1210);
					((MethodHeaderContext)_localctx).a = annotation();
					_localctx.ans.add(((MethodHeaderContext)_localctx).a.ret);
					}
					}
					setState(1217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

				            if (_localctx.ans.size() > 0) {
				                _localctx.ret.setReturnTypeAnnotations(_localctx.ans);
				            }
				        
				setState(1219);
				((MethodHeaderContext)_localctx).rt = result();
				_localctx.ret.setReturnType(((MethodHeaderContext)_localctx).rt.ret);
				setState(1221);
				methodDeclarator(_localctx.ret);
				setState(1225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1222);
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
		public Expression ret;
		public UnannTypeContext u;
		public Token v;
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_result);
		try {
			setState(1234);
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
				setState(1229);
				((ResultContext)_localctx).u = unannType();
				((ResultContext)_localctx).ret =  ((ResultContext)_localctx).u.ret;
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1232);
				((ResultContext)_localctx).v = match(VOID);
				((ResultContext)_localctx).ret =  new KeywordExpression(((ResultContext)_localctx).v);
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
	}

	public final MethodDeclaratorContext methodDeclarator(MethodDeclaration ret) throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState(), ret);
		enterRule(_localctx, 130, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1236);
			((MethodDeclaratorContext)_localctx).n = match(Identifier);
			_localctx.ret.setName(((MethodDeclaratorContext)_localctx).n);
			setState(1238);
			match(LPAREN);
			setState(1242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1239);
				((MethodDeclaratorContext)_localctx).p = formalParameterList();
				_localctx.ret.setParameters(((MethodDeclaratorContext)_localctx).p.ret);
				}
			}

			setState(1244);
			match(RPAREN);
			setState(1248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1245);
				((MethodDeclaratorContext)_localctx).d = dims();

				            if (((MethodDeclaratorContext)_localctx).d.ret.size() > 0) {
				                _localctx.ret.setReturnType(new ArrayTypeExpression(_localctx.ret.getReturnTypeExpression(),
				                                                           ((MethodDeclaratorContext)_localctx).d.ret));
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
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_formalParameterList);
		try {
			setState(1264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1250);
				((FormalParameterListContext)_localctx).p = formalParameters();
				_localctx.ls.addAll(((FormalParameterListContext)_localctx).p.ret);
				}
				setState(1253);
				match(COMMA);
				{
				setState(1254);
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
				setState(1259);
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
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_formalParameters);
		try {
			int _alt;
			setState(1294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1266);
				((FormalParametersContext)_localctx).p = formalParameter();
				_localctx.ls.add(((FormalParametersContext)_localctx).p.ret);
				}
				setState(1275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1269);
						match(COMMA);
						setState(1270);
						((FormalParametersContext)_localctx).f = formalParameter();
						_localctx.ls.add(((FormalParametersContext)_localctx).f.ret);
						}
						} 
					}
					setState(1277);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				((FormalParametersContext)_localctx).ret =  _localctx.ls;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1280);
				((FormalParametersContext)_localctx).r = receiverParameter();
				_localctx.ls.add(((FormalParametersContext)_localctx).r.ret);
				}
				setState(1289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1283);
						match(COMMA);
						setState(1284);
						((FormalParametersContext)_localctx).f = formalParameter();
						_localctx.ls.add(((FormalParametersContext)_localctx).f.ret);
						}
						} 
					}
					setState(1291);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
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
		public List<Annotation> ans = new ArrayList<>();
		public VariableModifierContext m;
		public AnnotationContext a;
		public TypedVariableDeclaratorIdContext v;
		public TypedVariableDeclaratorIdContext typedVariableDeclaratorId() {
			return getRuleContext(TypedVariableDeclaratorIdContext.class,0);
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
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				setState(1302);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FINAL:
					{
					{
					setState(1296);
					((FormalParameterContext)_localctx).m = variableModifier();
					_localctx.mods.add(((FormalParameterContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1299);
					((FormalParameterContext)_localctx).a = annotation();
					_localctx.ans.add(((FormalParameterContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			checkModifiers(_localctx.mods);
			setState(1308);
			((FormalParameterContext)_localctx).v = typedVariableDeclaratorId(_localctx.mods, _localctx.ans);
			((FormalParameterContext)_localctx).ret =  ((FormalParameterContext)_localctx).v.ret;
			}
		}
		catch (RecognitionException re) {
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
		public Token f;
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_variableModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
			((VariableModifierContext)_localctx).f = match(FINAL);
			((VariableModifierContext)_localctx).ret =  new Modifier(((VariableModifierContext)_localctx).f);
			}
		}
		catch (RecognitionException re) {
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
		public List<Annotation> ans = new ArrayList<>();
		public List<Annotation> ans2 = new ArrayList<>();
		public Expression type;
		public VariableModifierContext m;
		public AnnotationContext a;
		public UnannTypeContext t;
		public Token e;
		public VariableDeclaratorIdContext n;
		public FormalParameterContext f;
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_lastFormalParameter);
		int _la;
		try {
			setState(1341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
					setState(1320);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FINAL:
						{
						{
						setState(1314);
						((LastFormalParameterContext)_localctx).m = variableModifier();
						_localctx.mods.add(((LastFormalParameterContext)_localctx).m.ret);
						}
						}
						break;
					case AT:
						{
						{
						setState(1317);
						((LastFormalParameterContext)_localctx).a = annotation();
						_localctx.ans.add(((LastFormalParameterContext)_localctx).a.ret);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1325);
				((LastFormalParameterContext)_localctx).t = unannType();
				setState(1331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1326);
					((LastFormalParameterContext)_localctx).a = annotation();
					_localctx.ans2.add(((LastFormalParameterContext)_localctx).a.ret);
					}
					}
					setState(1333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1334);
				((LastFormalParameterContext)_localctx).e = match(ELLIPSIS);
				setState(1335);
				((LastFormalParameterContext)_localctx).n = variableDeclaratorId();

				            ((LastFormalParameterContext)_localctx).type =  ((LastFormalParameterContext)_localctx).t.ret;
				            if (((LastFormalParameterContext)_localctx).n.d.size() > 0) {
				                ((LastFormalParameterContext)_localctx).type =  new ArrayTypeExpression(_localctx.type, ((LastFormalParameterContext)_localctx).n.d);
				            }
				            ((LastFormalParameterContext)_localctx).ret =  new VariableDeclaration(((LastFormalParameterContext)_localctx).n.ret, _localctx.type, _localctx.mods, _localctx.ans, ((LastFormalParameterContext)_localctx).e, _localctx.ans2);
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1338);
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
		public List<Annotation> ans = new ArrayList<>();
		public AnnotationContext a;
		public UnannTypeContext t;
		public Token id;
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1343);
				((ReceiverParameterContext)_localctx).a = annotation();
				_localctx.ans.add(((ReceiverParameterContext)_localctx).a.ret);
				}
				}
				setState(1350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1351);
			((ReceiverParameterContext)_localctx).t = unannType();
			setState(1352);
			((ReceiverParameterContext)_localctx).id = match(Identifier);
			setState(1353);
			match(DOT);
			setState(1354);
			match(THIS);
			((ReceiverParameterContext)_localctx).ret =  new VariableDeclaration(((ReceiverParameterContext)_localctx).id, ((ReceiverParameterContext)_localctx).t.ret,
			                                        new ArrayList<Modifier>(), _localctx.ans);
			         _localctx.ret.setReceiverParameter(true);
			}
		}
		catch (RecognitionException re) {
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
		public List<Expression> ret;
		public ExceptionTypeListContext e;
		public ExceptionTypeListContext exceptionTypeList() {
			return getRuleContext(ExceptionTypeListContext.class,0);
		}
		public Throws_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throws_; }
	}

	public final Throws_Context throws_() throws RecognitionException {
		Throws_Context _localctx = new Throws_Context(_ctx, getState());
		enterRule(_localctx, 144, RULE_throws_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357);
			match(THROWS);
			setState(1358);
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
		public List<Expression> ret;
		public List<Expression> ls = new ArrayList<>();
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
	}

	public final ExceptionTypeListContext exceptionTypeList() throws RecognitionException {
		ExceptionTypeListContext _localctx = new ExceptionTypeListContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_exceptionTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1361);
			((ExceptionTypeListContext)_localctx).e = exceptionType();
			_localctx.ls.add(((ExceptionTypeListContext)_localctx).e.ret);
			}
			setState(1370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1364);
				match(COMMA);
				setState(1365);
				((ExceptionTypeListContext)_localctx).e = exceptionType();
				_localctx.ls.add(((ExceptionTypeListContext)_localctx).e.ret);
				}
				}
				setState(1372);
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
		public Expression ret;
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
	}

	public final ExceptionTypeContext exceptionType() throws RecognitionException {
		ExceptionTypeContext _localctx = new ExceptionTypeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_exceptionType);
		try {
			setState(1381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1375);
				((ExceptionTypeContext)_localctx).c = classType();
				((ExceptionTypeContext)_localctx).ret =  ((ExceptionTypeContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1378);
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
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_methodBody);
		try {
			setState(1388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1383);
				((MethodBodyContext)_localctx).body = block();
				((MethodBodyContext)_localctx).ret =  ((MethodBodyContext)_localctx).body.ret;
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1386);
				match(SEMI);
				((MethodBodyContext)_localctx).ret =  new NilBlock();
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
	}

	public final InstanceInitializerContext instanceInitializer() throws RecognitionException {
		InstanceInitializerContext _localctx = new InstanceInitializerContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_instanceInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1390);
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
		public Token kw;
		public BlockContext body;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StaticInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticInitializer; }
	}

	public final StaticInitializerContext staticInitializer() throws RecognitionException {
		StaticInitializerContext _localctx = new StaticInitializerContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1393);
			((StaticInitializerContext)_localctx).kw = match(STATIC);
			setState(1394);
			((StaticInitializerContext)_localctx).body = block();

			            ((StaticInitializerContext)_localctx).ret =  ((StaticInitializerContext)_localctx).body.ret;
			            ((StaticInitializerContext)_localctx).body.ret.setFirstToken(((StaticInitializerContext)_localctx).kw);
			        
			}
		}
		catch (RecognitionException re) {
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
		public List<Annotation> ans = new ArrayList<>();
		public ConstructorModifierContext m;
		public AnnotationContext a;
		public Throws_Context t;
		public ConstructorBodyContext b;
		public ConstructorDeclaratorContext constructorDeclarator() {
			return getRuleContext(ConstructorDeclaratorContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public List<ConstructorModifierContext> constructorModifier() {
			return getRuleContexts(ConstructorModifierContext.class);
		}
		public ConstructorModifierContext constructorModifier(int i) {
			return getRuleContext(ConstructorModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0) || _la==AT) {
				{
				setState(1403);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRIVATE:
				case PROTECTED:
				case PUBLIC:
					{
					{
					setState(1397);
					((ConstructorDeclarationContext)_localctx).m = constructorModifier();
					_localctx.mods.add(((ConstructorDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1400);
					((ConstructorDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((ConstructorDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			checkModifiers(_localctx.mods);
			((ConstructorDeclarationContext)_localctx).ret =  new MethodDeclaration(_localctx.mods, _localctx.ans);
			setState(1410);
			constructorDeclarator(_localctx.ret);
			setState(1414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1411);
				((ConstructorDeclarationContext)_localctx).t = throws_();
				_localctx.ret.setExceptions(((ConstructorDeclarationContext)_localctx).t.ret);
				}
			}

			setState(1416);
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
		public Token pu;
		public Token pro;
		public Token pri;
		public ConstructorModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorModifier; }
	}

	public final ConstructorModifierContext constructorModifier() throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_constructorModifier);
		try {
			setState(1425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1419);
				((ConstructorModifierContext)_localctx).pu = match(PUBLIC);
				((ConstructorModifierContext)_localctx).ret =  new Modifier(((ConstructorModifierContext)_localctx).pu);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1421);
				((ConstructorModifierContext)_localctx).pro = match(PROTECTED);
				((ConstructorModifierContext)_localctx).ret =  new Modifier(((ConstructorModifierContext)_localctx).pro);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1423);
				((ConstructorModifierContext)_localctx).pri = match(PRIVATE);
				((ConstructorModifierContext)_localctx).ret =  new Modifier(((ConstructorModifierContext)_localctx).pri);
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
		public Token n;
		public FormalParameterListContext l;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
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
	}

	public final ConstructorDeclaratorContext constructorDeclarator(MethodDeclaration ret) throws RecognitionException {
		ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(_ctx, getState(), ret);
		enterRule(_localctx, 160, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1427);
				((ConstructorDeclaratorContext)_localctx).t = typeParameters();
				_localctx.ret.setTypeParameters(((ConstructorDeclaratorContext)_localctx).t.ret);
				}
			}

			setState(1432);
			((ConstructorDeclaratorContext)_localctx).n = match(Identifier);
			_localctx.ret.setName(((ConstructorDeclaratorContext)_localctx).n);
			setState(1434);
			match(LPAREN);
			setState(1438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1435);
				((ConstructorDeclaratorContext)_localctx).l = formalParameterList();
				_localctx.ret.setParameters(((ConstructorDeclaratorContext)_localctx).l.ret);
				}
			}

			setState(1440);
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

	public static class ConstructorBodyContext extends ParserRuleContext {
		public Block ret;
		public Token first;
		public ExplicitConstructorInvocationContext s;
		public BlockStatementsContext st;
		public Token last;
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
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ConstructorBodyContext)_localctx).ret =  new Block();
			setState(1443);
			((ConstructorBodyContext)_localctx).first = match(LBRACE);
			setState(1447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(1444);
				((ConstructorBodyContext)_localctx).s = explicitConstructorInvocation();
				_localctx.ret.addStatement(((ConstructorBodyContext)_localctx).s.ret);
				}
				break;
			}
			setState(1452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1449);
				((ConstructorBodyContext)_localctx).st = blockStatements();
				_localctx.ret.addStatements(((ConstructorBodyContext)_localctx).st.ret);
				}
			}

			setState(1454);
			((ConstructorBodyContext)_localctx).last = match(RBRACE);
			_localctx.ret.setFirstToken(((ConstructorBodyContext)_localctx).first);
			         _localctx.ret.setLastToken(((ConstructorBodyContext)_localctx).last);
			}
		}
		catch (RecognitionException re) {
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
		public List<TypeArgument> targs = new ArrayList<>();
		public List<Expression> args = new ArrayList<>();
		public Expression tmp;
		public TypeArgumentsContext t;
		public Token kw;
		public ArgumentListContext a;
		public Token last;
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
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(1523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1457);
					((ExplicitConstructorInvocationContext)_localctx).t = typeArguments();
					((ExplicitConstructorInvocationContext)_localctx).targs =  ((ExplicitConstructorInvocationContext)_localctx).t.ret;
					}
				}

				setState(1462);
				((ExplicitConstructorInvocationContext)_localctx).kw = match(THIS);
				setState(1463);
				match(LPAREN);
				setState(1467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1464);
					((ExplicitConstructorInvocationContext)_localctx).a = argumentList();
					((ExplicitConstructorInvocationContext)_localctx).args =  ((ExplicitConstructorInvocationContext)_localctx).a.ret;
					}
				}

				setState(1469);
				match(RPAREN);
				setState(1470);
				((ExplicitConstructorInvocationContext)_localctx).last = match(SEMI);
				((ExplicitConstructorInvocationContext)_localctx).ret =  new CallExpression(((ExplicitConstructorInvocationContext)_localctx).last, new KeywordExpression(((ExplicitConstructorInvocationContext)_localctx).kw),
				                                   _localctx.args, _localctx.targs);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1472);
					((ExplicitConstructorInvocationContext)_localctx).t = typeArguments();
					((ExplicitConstructorInvocationContext)_localctx).targs =  ((ExplicitConstructorInvocationContext)_localctx).t.ret;
					}
				}

				setState(1477);
				((ExplicitConstructorInvocationContext)_localctx).kw = match(SUPER);
				setState(1478);
				match(LPAREN);
				setState(1482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1479);
					((ExplicitConstructorInvocationContext)_localctx).a = argumentList();
					((ExplicitConstructorInvocationContext)_localctx).args =  ((ExplicitConstructorInvocationContext)_localctx).a.ret;
					}
				}

				setState(1484);
				match(RPAREN);
				setState(1485);
				((ExplicitConstructorInvocationContext)_localctx).last = match(SEMI);
				((ExplicitConstructorInvocationContext)_localctx).ret =  new CallExpression(((ExplicitConstructorInvocationContext)_localctx).last, new KeywordExpression(((ExplicitConstructorInvocationContext)_localctx).kw),
				                                   _localctx.args, _localctx.targs);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1487);
				((ExplicitConstructorInvocationContext)_localctx).en = expressionName();
				setState(1488);
				match(DOT);
				setState(1492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1489);
					((ExplicitConstructorInvocationContext)_localctx).t = typeArguments();
					((ExplicitConstructorInvocationContext)_localctx).targs =  ((ExplicitConstructorInvocationContext)_localctx).t.ret;
					}
				}

				setState(1494);
				((ExplicitConstructorInvocationContext)_localctx).kw = match(SUPER);
				setState(1495);
				match(LPAREN);
				setState(1499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1496);
					((ExplicitConstructorInvocationContext)_localctx).a = argumentList();
					((ExplicitConstructorInvocationContext)_localctx).args =  ((ExplicitConstructorInvocationContext)_localctx).a.ret;
					}
				}

				setState(1501);
				match(RPAREN);
				setState(1502);
				((ExplicitConstructorInvocationContext)_localctx).last = match(SEMI);
				((ExplicitConstructorInvocationContext)_localctx).ret =  new CallExpression(((ExplicitConstructorInvocationContext)_localctx).last, new KeywordExpression(((ExplicitConstructorInvocationContext)_localctx).kw),
				                                   _localctx.args, _localctx.targs);
				         ((ExplicitConstructorInvocationContext)_localctx).ret =  new AccessExpression(((ExplicitConstructorInvocationContext)_localctx).en.ret, _localctx.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1505);
				((ExplicitConstructorInvocationContext)_localctx).p = primary();
				setState(1506);
				match(DOT);
				setState(1510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1507);
					((ExplicitConstructorInvocationContext)_localctx).t = typeArguments();
					((ExplicitConstructorInvocationContext)_localctx).targs =  ((ExplicitConstructorInvocationContext)_localctx).t.ret;
					}
				}

				setState(1512);
				((ExplicitConstructorInvocationContext)_localctx).kw = match(SUPER);
				setState(1513);
				match(LPAREN);
				setState(1517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1514);
					((ExplicitConstructorInvocationContext)_localctx).a = argumentList();
					((ExplicitConstructorInvocationContext)_localctx).args =  ((ExplicitConstructorInvocationContext)_localctx).a.ret;
					}
				}

				setState(1519);
				match(RPAREN);
				setState(1520);
				((ExplicitConstructorInvocationContext)_localctx).last = match(SEMI);
				((ExplicitConstructorInvocationContext)_localctx).ret =  new CallExpression(((ExplicitConstructorInvocationContext)_localctx).last, new KeywordExpression(((ExplicitConstructorInvocationContext)_localctx).kw),
				                                   _localctx.args, _localctx.targs);
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
		public List<Annotation> ans = new ArrayList<>();
		public List<Expression> sis = new ArrayList<>();
		public ClassModifierContext m;
		public AnnotationContext a;
		public Token kw;
		public Token id;
		public SuperinterfacesContext il;
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				setState(1531);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ABSTRACT:
				case FINAL:
				case PRIVATE:
				case PROTECTED:
				case PUBLIC:
				case STATIC:
				case STRICTFP:
					{
					{
					setState(1525);
					((EnumDeclarationContext)_localctx).m = classModifier();
					_localctx.mods.add(((EnumDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1528);
					((EnumDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((EnumDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1535);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1536);
			((EnumDeclarationContext)_localctx).kw = match(ENUM);
			setState(1537);
			((EnumDeclarationContext)_localctx).id = match(Identifier);
			setState(1541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1538);
				((EnumDeclarationContext)_localctx).il = superinterfaces();
				((EnumDeclarationContext)_localctx).sis =  ((EnumDeclarationContext)_localctx).il.ret;
				}
			}

			((EnumDeclarationContext)_localctx).ret =  new EnumDeclaration(((EnumDeclarationContext)_localctx).id, ((EnumDeclarationContext)_localctx).kw, _localctx.mods, _localctx.ans, _localctx.sis);
			setState(1544);
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
		public Token last;
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
	}

	public final EnumBodyContext enumBody(EnumDeclaration ret) throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState(), ret);
		enterRule(_localctx, 168, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1546);
			match(LBRACE);
			setState(1548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(1547);
				enumConstantList(_localctx.ret);
				}
			}

			setState(1551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1550);
				match(COMMA);
				}
			}

			setState(1554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1553);
				enumBodyDeclarations(_localctx.ret);
				}
			}

			setState(1556);
			((EnumBodyContext)_localctx).last = match(RBRACE);
			_localctx.ret.setLastToken(((EnumBodyContext)_localctx).last);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final EnumConstantListContext enumConstantList(EnumDeclaration ret) throws RecognitionException {
		EnumConstantListContext _localctx = new EnumConstantListContext(_ctx, getState(), ret);
		enterRule(_localctx, 170, RULE_enumConstantList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1559);
			enumConstant(_localctx.ret);
			setState(1564);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1560);
					match(COMMA);
					setState(1561);
					enumConstant(_localctx.ret);
					}
					} 
				}
				setState(1566);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
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
		public List<Annotation> ans = new ArrayList<>();
		public EnumConstant cons;
		public List<Expression> args = new ArrayList<>();
		public AnnotationContext an;
		public Token id;
		public ArgumentListContext a;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
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
	}

	public final EnumConstantContext enumConstant(EnumDeclaration ret) throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState(), ret);
		enterRule(_localctx, 172, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1567);
				((EnumConstantContext)_localctx).an = annotation();
				_localctx.ans.add(((EnumConstantContext)_localctx).an.ret);
				}
				}
				setState(1574);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1575);
			((EnumConstantContext)_localctx).id = match(Identifier);
			setState(1583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1576);
				match(LPAREN);
				setState(1580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1577);
					((EnumConstantContext)_localctx).a = argumentList();
					((EnumConstantContext)_localctx).args =  ((EnumConstantContext)_localctx).a.ret;
					}
				}

				setState(1582);
				match(RPAREN);
				}
			}


			            ((EnumConstantContext)_localctx).cons =  new EnumConstant(((EnumConstantContext)_localctx).id, _localctx.ans, _localctx.args);
			            _localctx.ret.addConstant(_localctx.cons);
			        
			setState(1587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1586);
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
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations(EnumDeclaration ret) throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState(), ret);
		enterRule(_localctx, 174, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1589);
			match(SEMI);
			setState(1593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(1590);
				classBodyDeclaration(_localctx.ret);
				}
				}
				setState(1595);
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
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_interfaceDeclaration);
		try {
			setState(1602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1596);
				((InterfaceDeclarationContext)_localctx).n = normalInterfaceDeclaration();
				((InterfaceDeclarationContext)_localctx).ret =  ((InterfaceDeclarationContext)_localctx).n.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1599);
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
		public List<TypeParameter> tpars = new ArrayList<>();
		public List<Expression> eis = new ArrayList<>();
		public List<Annotation> ans = new ArrayList<>();
		public InterfaceModifierContext m;
		public AnnotationContext a;
		public Token kw;
		public Token id;
		public TypeParametersContext t;
		public ExtendsInterfacesContext e;
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ExtendsInterfacesContext extendsInterfaces() {
			return getRuleContext(ExtendsInterfacesContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				setState(1610);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ABSTRACT:
				case PRIVATE:
				case PROTECTED:
				case PUBLIC:
				case STATIC:
				case STRICTFP:
					{
					{
					setState(1604);
					((NormalInterfaceDeclarationContext)_localctx).m = interfaceModifier();
					_localctx.mods.add(((NormalInterfaceDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1607);
					((NormalInterfaceDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((NormalInterfaceDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1614);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			checkModifiers(_localctx.mods);
			setState(1616);
			((NormalInterfaceDeclarationContext)_localctx).kw = match(INTERFACE);
			setState(1617);
			((NormalInterfaceDeclarationContext)_localctx).id = match(Identifier);
			setState(1621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1618);
				((NormalInterfaceDeclarationContext)_localctx).t = typeParameters();
				((NormalInterfaceDeclarationContext)_localctx).tpars =  ((NormalInterfaceDeclarationContext)_localctx).t.ret;
				}
			}

			setState(1626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1623);
				((NormalInterfaceDeclarationContext)_localctx).e = extendsInterfaces();
				((NormalInterfaceDeclarationContext)_localctx).eis =  ((NormalInterfaceDeclarationContext)_localctx).e.ret;
				}
			}

			((NormalInterfaceDeclarationContext)_localctx).ret =  new InterfaceDeclaration(((NormalInterfaceDeclarationContext)_localctx).id, ((NormalInterfaceDeclarationContext)_localctx).kw, _localctx.mods, _localctx.ans, _localctx.eis, _localctx.tpars);
			setState(1629);
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
		public Token pu;
		public Token pro;
		public Token pri;
		public Token ab;
		public Token st;
		public Token fp;
		public InterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceModifier; }
	}

	public final InterfaceModifierContext interfaceModifier() throws RecognitionException {
		InterfaceModifierContext _localctx = new InterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_interfaceModifier);
		try {
			setState(1643);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1631);
				((InterfaceModifierContext)_localctx).pu = match(PUBLIC);
				((InterfaceModifierContext)_localctx).ret =  new Modifier(((InterfaceModifierContext)_localctx).pu);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1633);
				((InterfaceModifierContext)_localctx).pro = match(PROTECTED);
				((InterfaceModifierContext)_localctx).ret =  new Modifier(((InterfaceModifierContext)_localctx).pro);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1635);
				((InterfaceModifierContext)_localctx).pri = match(PRIVATE);
				((InterfaceModifierContext)_localctx).ret =  new Modifier(((InterfaceModifierContext)_localctx).pri);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1637);
				((InterfaceModifierContext)_localctx).ab = match(ABSTRACT);
				((InterfaceModifierContext)_localctx).ret =  new Modifier(((InterfaceModifierContext)_localctx).ab);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1639);
				((InterfaceModifierContext)_localctx).st = match(STATIC);
				((InterfaceModifierContext)_localctx).ret =  new Modifier(((InterfaceModifierContext)_localctx).st);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(1641);
				((InterfaceModifierContext)_localctx).fp = match(STRICTFP);
				((InterfaceModifierContext)_localctx).ret =  new Modifier(((InterfaceModifierContext)_localctx).fp);
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
		public List<Expression> ret;
		public InterfaceTypeListContext i;
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public ExtendsInterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsInterfaces; }
	}

	public final ExtendsInterfacesContext extendsInterfaces() throws RecognitionException {
		ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_extendsInterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1645);
			match(EXTENDS);
			setState(1646);
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
		public Token last;
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
	}

	public final InterfaceBodyContext interfaceBody(InterfaceDeclaration ret) throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState(), ret);
		enterRule(_localctx, 184, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1649);
			match(LBRACE);
			setState(1653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(1650);
				interfaceMemberDeclaration(_localctx.ret);
				}
				}
				setState(1655);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1656);
			((InterfaceBodyContext)_localctx).last = match(RBRACE);
			_localctx.ret.setLastToken(((InterfaceBodyContext)_localctx).last);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration(InterfaceDeclaration ret) throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState(), ret);
		enterRule(_localctx, 186, RULE_interfaceMemberDeclaration);
		try {
			setState(1670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1659);
				constantDeclaration(_localctx.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1660);
				((InterfaceMemberDeclarationContext)_localctx).im = interfaceMethodDeclaration();
				_localctx.ret.addMethod(((InterfaceMemberDeclarationContext)_localctx).im.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1663);
				((InterfaceMemberDeclarationContext)_localctx).cl = classDeclaration();
				_localctx.ret.addInnerBody(((InterfaceMemberDeclarationContext)_localctx).cl.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1666);
				((InterfaceMemberDeclarationContext)_localctx).id = interfaceDeclaration();
				_localctx.ret.addInnerInterface(((InterfaceMemberDeclarationContext)_localctx).id.ret);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1669);
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
		public BodyDeclaration decl;
		public List<Modifier> mods = new ArrayList<>();
		public List<Annotation> ans = new ArrayList<>();
		public ConstantModifierContext m;
		public AnnotationContext a;
		public UnannTypeContext t;
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
		}
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState, BodyDeclaration decl) {
			super(parent, invokingState);
			this.decl = decl;
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
	}

	public final ConstantDeclarationContext constantDeclaration(BodyDeclaration decl) throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState(), decl);
		enterRule(_localctx, 188, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << STATIC))) != 0) || _la==AT) {
				{
				setState(1678);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FINAL:
				case PUBLIC:
				case STATIC:
					{
					{
					setState(1672);
					((ConstantDeclarationContext)_localctx).m = constantModifier();
					_localctx.mods.add(((ConstantDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1675);
					((ConstantDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((ConstantDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1682);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			checkModifiers(_localctx.mods);
			setState(1684);
			((ConstantDeclarationContext)_localctx).t = unannType();
			setState(1685);
			variableDeclaratorList(_localctx.decl, _localctx.mods, _localctx.ans, ((ConstantDeclarationContext)_localctx).t.ret);
			setState(1686);
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

	public static class ConstantModifierContext extends ParserRuleContext {
		public Modifier ret;
		public Token pu;
		public Token st;
		public Token f;
		public ConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantModifier; }
	}

	public final ConstantModifierContext constantModifier() throws RecognitionException {
		ConstantModifierContext _localctx = new ConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_constantModifier);
		try {
			setState(1694);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1688);
				((ConstantModifierContext)_localctx).pu = match(PUBLIC);
				((ConstantModifierContext)_localctx).ret =  new Modifier(((ConstantModifierContext)_localctx).pu);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1690);
				((ConstantModifierContext)_localctx).st = match(STATIC);
				((ConstantModifierContext)_localctx).ret =  new Modifier(((ConstantModifierContext)_localctx).st);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1692);
				((ConstantModifierContext)_localctx).f = match(FINAL);
				((ConstantModifierContext)_localctx).ret =  new Modifier(((ConstantModifierContext)_localctx).f);
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
		public List<Annotation> ans = new ArrayList<>();
		public InterfaceMethodModifierContext m;
		public AnnotationContext a;
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
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				setState(1702);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ABSTRACT:
				case DEFAULT:
				case PUBLIC:
				case STATIC:
				case STRICTFP:
					{
					{
					setState(1696);
					((InterfaceMethodDeclarationContext)_localctx).m = interfaceMethodModifier();
					_localctx.mods.add(((InterfaceMethodDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1699);
					((InterfaceMethodDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((InterfaceMethodDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1706);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			checkModifiers(_localctx.mods);
			((InterfaceMethodDeclarationContext)_localctx).ret =  new MethodDeclaration(_localctx.mods, _localctx.ans);
			{
			setState(1709);
			methodHeader(_localctx.ret);
			}
			{
			setState(1710);
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
		public Token pu;
		public Token ab;
		public Token d;
		public Token st;
		public Token fp;
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_interfaceMethodModifier);
		try {
			setState(1723);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1713);
				((InterfaceMethodModifierContext)_localctx).pu = match(PUBLIC);
				((InterfaceMethodModifierContext)_localctx).ret =  new Modifier(((InterfaceMethodModifierContext)_localctx).pu);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1715);
				((InterfaceMethodModifierContext)_localctx).ab = match(ABSTRACT);
				((InterfaceMethodModifierContext)_localctx).ret =  new Modifier(((InterfaceMethodModifierContext)_localctx).ab);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1717);
				((InterfaceMethodModifierContext)_localctx).d = match(DEFAULT);
				((InterfaceMethodModifierContext)_localctx).ret =  new Modifier(((InterfaceMethodModifierContext)_localctx).d);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 4);
				{
				setState(1719);
				((InterfaceMethodModifierContext)_localctx).st = match(STATIC);
				((InterfaceMethodModifierContext)_localctx).ret =  new Modifier(((InterfaceMethodModifierContext)_localctx).st);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 5);
				{
				setState(1721);
				((InterfaceMethodModifierContext)_localctx).fp = match(STRICTFP);
				((InterfaceMethodModifierContext)_localctx).ret =  new Modifier(((InterfaceMethodModifierContext)_localctx).fp);
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
		public List<Annotation> ans = new ArrayList<>();
		public InterfaceModifierContext m;
		public AnnotationContext a;
		public Token at;
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
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_annotationTypeDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1733);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1731);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ABSTRACT:
					case PRIVATE:
					case PROTECTED:
					case PUBLIC:
					case STATIC:
					case STRICTFP:
						{
						{
						setState(1725);
						((AnnotationTypeDeclarationContext)_localctx).m = interfaceModifier();
						_localctx.mods.add(((AnnotationTypeDeclarationContext)_localctx).m.ret);
						}
						}
						break;
					case AT:
						{
						{
						setState(1728);
						((AnnotationTypeDeclarationContext)_localctx).a = annotation();
						_localctx.ans.add(((AnnotationTypeDeclarationContext)_localctx).a.ret);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1735);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			setState(1736);
			((AnnotationTypeDeclarationContext)_localctx).at = match(AT);
			setState(1737);
			match(INTERFACE);
			setState(1738);
			((AnnotationTypeDeclarationContext)_localctx).id = match(Identifier);
			((AnnotationTypeDeclarationContext)_localctx).ret =  new AnnotationDeclaration(((AnnotationTypeDeclarationContext)_localctx).id, ((AnnotationTypeDeclarationContext)_localctx).at, _localctx.mods, _localctx.ans);
			setState(1740);
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
		public Token last;
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
	}

	public final AnnotationTypeBodyContext annotationTypeBody(AnnotationDeclaration ret) throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState(), ret);
		enterRule(_localctx, 198, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1742);
			match(LBRACE);
			setState(1746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==Identifier || _la==AT) {
				{
				{
				setState(1743);
				annotationTypeMemberDeclaration(_localctx.ret);
				}
				}
				setState(1748);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1749);
			((AnnotationTypeBodyContext)_localctx).last = match(RBRACE);
			_localctx.ret.setLastToken(((AnnotationTypeBodyContext)_localctx).last);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration(AnnotationDeclaration ret) throws RecognitionException {
		AnnotationTypeMemberDeclarationContext _localctx = new AnnotationTypeMemberDeclarationContext(_ctx, getState(), ret);
		enterRule(_localctx, 200, RULE_annotationTypeMemberDeclaration);
		try {
			setState(1763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1752);
				((AnnotationTypeMemberDeclarationContext)_localctx).a = annotationTypeElementDeclaration();
				_localctx.ret.addField(((AnnotationTypeMemberDeclarationContext)_localctx).a.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1755);
				constantDeclaration(_localctx.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1756);
				((AnnotationTypeMemberDeclarationContext)_localctx).cl = classDeclaration();
				_localctx.ret.addInnerBody(((AnnotationTypeMemberDeclarationContext)_localctx).cl.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1759);
				((AnnotationTypeMemberDeclarationContext)_localctx).i = interfaceDeclaration();
				_localctx.ret.addInnerInterface(((AnnotationTypeMemberDeclarationContext)_localctx).i.ret);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1762);
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
		public List<Dimension> ls = new ArrayList<>();
		public Expression expr = new NilExpression();
		public Expression type;
		public List<Annotation> ans = new ArrayList<>();
		public AnnotationTypeElementModifierContext m;
		public AnnotationContext a;
		public UnannTypeContext t;
		public Token id;
		public DimsContext ds;
		public DefaultValueContext dv;
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public List<AnnotationTypeElementModifierContext> annotationTypeElementModifier() {
			return getRuleContexts(AnnotationTypeElementModifierContext.class);
		}
		public AnnotationTypeElementModifierContext annotationTypeElementModifier(int i) {
			return getRuleContext(AnnotationTypeElementModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_annotationTypeElementDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT || _la==PUBLIC || _la==AT) {
				{
				setState(1771);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ABSTRACT:
				case PUBLIC:
					{
					{
					setState(1765);
					((AnnotationTypeElementDeclarationContext)_localctx).m = annotationTypeElementModifier();
					_localctx.mods.add(((AnnotationTypeElementDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1768);
					((AnnotationTypeElementDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((AnnotationTypeElementDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1775);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			checkModifiers(_localctx.mods);
			setState(1777);
			((AnnotationTypeElementDeclarationContext)_localctx).t = unannType();
			setState(1778);
			((AnnotationTypeElementDeclarationContext)_localctx).id = match(Identifier);
			setState(1779);
			match(LPAREN);
			setState(1780);
			match(RPAREN);
			setState(1784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1781);
				((AnnotationTypeElementDeclarationContext)_localctx).ds = dims();
				((AnnotationTypeElementDeclarationContext)_localctx).ls =  ((AnnotationTypeElementDeclarationContext)_localctx).ds.ret;
				}
			}

			setState(1789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1786);
				((AnnotationTypeElementDeclarationContext)_localctx).dv = defaultValue();
				((AnnotationTypeElementDeclarationContext)_localctx).expr =  ((AnnotationTypeElementDeclarationContext)_localctx).dv.ret;
				}
			}

			setState(1791);
			match(SEMI);

			            ((AnnotationTypeElementDeclarationContext)_localctx).type =  ((AnnotationTypeElementDeclarationContext)_localctx).t.ret;
			            if (_localctx.ls.size() > 0) {
			                ((AnnotationTypeElementDeclarationContext)_localctx).type =  new ArrayTypeExpression(_localctx.type, _localctx.ls);
			            }
			            ((AnnotationTypeElementDeclarationContext)_localctx).ret =  new VariableDeclaration(((AnnotationTypeElementDeclarationContext)_localctx).id, _localctx.type,
			                                           _localctx.mods, _localctx.ans, _localctx.expr);
			        
			}
		}
		catch (RecognitionException re) {
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
		public Token pu;
		public Token ab;
		public AnnotationTypeElementModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementModifier; }
	}

	public final AnnotationTypeElementModifierContext annotationTypeElementModifier() throws RecognitionException {
		AnnotationTypeElementModifierContext _localctx = new AnnotationTypeElementModifierContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_annotationTypeElementModifier);
		try {
			setState(1798);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1794);
				((AnnotationTypeElementModifierContext)_localctx).pu = match(PUBLIC);
				((AnnotationTypeElementModifierContext)_localctx).ret =  new Modifier(((AnnotationTypeElementModifierContext)_localctx).pu);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1796);
				((AnnotationTypeElementModifierContext)_localctx).ab = match(ABSTRACT);
				((AnnotationTypeElementModifierContext)_localctx).ret =  new Modifier(((AnnotationTypeElementModifierContext)_localctx).ab);
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
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1800);
			match(DEFAULT);
			setState(1801);
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
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_annotation);
		try {
			setState(1813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1804);
				((AnnotationContext)_localctx).n = normalAnnotation();
				((AnnotationContext)_localctx).ret =  ((AnnotationContext)_localctx).n.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1807);
				((AnnotationContext)_localctx).m = markerAnnotation();
				((AnnotationContext)_localctx).ret =  ((AnnotationContext)_localctx).m.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1810);
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
		public Token at;
		public TypeNameContext t;
		public Token last;
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
	}

	public final NormalAnnotationContext normalAnnotation() throws RecognitionException {
		NormalAnnotationContext _localctx = new NormalAnnotationContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_normalAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1815);
			((NormalAnnotationContext)_localctx).at = match(AT);
			setState(1816);
			((NormalAnnotationContext)_localctx).t = typeName();
			((NormalAnnotationContext)_localctx).ret =  new Annotation(((NormalAnnotationContext)_localctx).at, ((NormalAnnotationContext)_localctx).t.ret);
			setState(1818);
			match(LPAREN);
			setState(1820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1819);
				elementValuePairList(_localctx.ret);
				}
			}

			setState(1822);
			((NormalAnnotationContext)_localctx).last = match(RPAREN);
			_localctx.ret.setLastToken(((NormalAnnotationContext)_localctx).last);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final ElementValuePairListContext elementValuePairList(Annotation ret) throws RecognitionException {
		ElementValuePairListContext _localctx = new ElementValuePairListContext(_ctx, getState(), ret);
		enterRule(_localctx, 212, RULE_elementValuePairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1825);
			elementValuePair(_localctx.ret);
			}
			setState(1830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1826);
				match(COMMA);
				setState(1827);
				elementValuePair(_localctx.ret);
				}
				}
				setState(1832);
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
	}

	public final ElementValuePairContext elementValuePair(Annotation ret) throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState(), ret);
		enterRule(_localctx, 214, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1833);
			((ElementValuePairContext)_localctx).id = match(Identifier);
			setState(1834);
			match(ASSIGN);
			setState(1835);
			((ElementValuePairContext)_localctx).v = elementValue();
			_localctx.ret.addArgument(((ElementValuePairContext)_localctx).id, ((ElementValuePairContext)_localctx).v.ret);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_elementValue);
		try {
			setState(1847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1838);
				((ElementValueContext)_localctx).c = conditionalExpression();
				((ElementValueContext)_localctx).ret =  ((ElementValueContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1841);
				((ElementValueContext)_localctx).i = elementValueArrayInitializer();
				((ElementValueContext)_localctx).ret =  ((ElementValueContext)_localctx).i.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1844);
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
		public List<Expression> ls = new ArrayList<>();
		public Token first;
		public ElementValueListContext l;
		public Token last;
		public ElementValueListContext elementValueList() {
			return getRuleContext(ElementValueListContext.class,0);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_elementValueArrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1849);
			((ElementValueArrayInitializerContext)_localctx).first = match(LBRACE);
			setState(1853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1850);
				((ElementValueArrayInitializerContext)_localctx).l = elementValueList();
				((ElementValueArrayInitializerContext)_localctx).ls =  ((ElementValueArrayInitializerContext)_localctx).l.ret;
				}
			}

			setState(1856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1855);
				match(COMMA);
				}
			}

			setState(1858);
			((ElementValueArrayInitializerContext)_localctx).last = match(RBRACE);
			((ElementValueArrayInitializerContext)_localctx).ret =  new ArrayInitializer(((ElementValueArrayInitializerContext)_localctx).first, ((ElementValueArrayInitializerContext)_localctx).last, _localctx.ls);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final ElementValueListContext elementValueList() throws RecognitionException {
		ElementValueListContext _localctx = new ElementValueListContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_elementValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1861);
			((ElementValueListContext)_localctx).v1 = elementValue();
			_localctx.ls.add(((ElementValueListContext)_localctx).v1.ret);
			}
			setState(1870);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1864);
					match(COMMA);
					setState(1865);
					((ElementValueListContext)_localctx).v = elementValue();
					_localctx.ls.add(((ElementValueListContext)_localctx).v.ret);
					}
					} 
				}
				setState(1872);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
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
		public Token at;
		public TypeNameContext t;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MarkerAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markerAnnotation; }
	}

	public final MarkerAnnotationContext markerAnnotation() throws RecognitionException {
		MarkerAnnotationContext _localctx = new MarkerAnnotationContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_markerAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1875);
			((MarkerAnnotationContext)_localctx).at = match(AT);
			setState(1876);
			((MarkerAnnotationContext)_localctx).t = typeName();
			((MarkerAnnotationContext)_localctx).ret =  new Annotation(((MarkerAnnotationContext)_localctx).at, ((MarkerAnnotationContext)_localctx).t.ret);
			}
		}
		catch (RecognitionException re) {
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
		public Token at;
		public TypeNameContext t;
		public ElementValueContext v;
		public Token last;
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
	}

	public final SingleElementAnnotationContext singleElementAnnotation() throws RecognitionException {
		SingleElementAnnotationContext _localctx = new SingleElementAnnotationContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_singleElementAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1879);
			((SingleElementAnnotationContext)_localctx).at = match(AT);
			setState(1880);
			((SingleElementAnnotationContext)_localctx).t = typeName();
			setState(1881);
			match(LPAREN);
			setState(1882);
			((SingleElementAnnotationContext)_localctx).v = elementValue();
			setState(1883);
			((SingleElementAnnotationContext)_localctx).last = match(RPAREN);
			((SingleElementAnnotationContext)_localctx).ret =  new Annotation(((SingleElementAnnotationContext)_localctx).at, ((SingleElementAnnotationContext)_localctx).last, ((SingleElementAnnotationContext)_localctx).t.ret, ((SingleElementAnnotationContext)_localctx).v.ret);
			}
		}
		catch (RecognitionException re) {
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
		public List<Expression> ls = new ArrayList<>();
		public Token first;
		public VariableInitializerListContext l;
		public Token last;
		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class,0);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1886);
			((ArrayInitializerContext)_localctx).first = match(LBRACE);
			setState(1890);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1887);
				((ArrayInitializerContext)_localctx).l = variableInitializerList();
				((ArrayInitializerContext)_localctx).ls =  ((ArrayInitializerContext)_localctx).l.ret;
				}
			}

			setState(1893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1892);
				match(COMMA);
				}
			}

			setState(1895);
			((ArrayInitializerContext)_localctx).last = match(RBRACE);
			((ArrayInitializerContext)_localctx).ret =  new ArrayInitializer(((ArrayInitializerContext)_localctx).first, ((ArrayInitializerContext)_localctx).last, _localctx.ls);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1898);
			((VariableInitializerListContext)_localctx).i = variableInitializer();
			_localctx.ls.add(((VariableInitializerListContext)_localctx).i.ret);
			}
			setState(1907);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1901);
					match(COMMA);
					setState(1902);
					((VariableInitializerListContext)_localctx).v = variableInitializer();
					_localctx.ls.add(((VariableInitializerListContext)_localctx).v.ret);
					}
					} 
				}
				setState(1909);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
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
		public Token first;
		public BlockStatementsContext s;
		public Token last;
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((BlockContext)_localctx).ret =  new Block();
			setState(1913);
			((BlockContext)_localctx).first = match(LBRACE);
			setState(1917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1914);
				((BlockContext)_localctx).s = blockStatements();
				_localctx.ret.addStatements(((BlockContext)_localctx).s.ret);
				}
			}

			setState(1919);
			((BlockContext)_localctx).last = match(RBRACE);
			_localctx.ret.setFirstToken(((BlockContext)_localctx).first);
			         _localctx.ret.setLastToken(((BlockContext)_localctx).last);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1922);
			((BlockStatementsContext)_localctx).s = blockStatement();
			_localctx.ls.add(((BlockStatementsContext)_localctx).s.ret);
			}
			setState(1930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				{
				setState(1925);
				((BlockStatementsContext)_localctx).b = blockStatement();
				_localctx.ls.add(((BlockStatementsContext)_localctx).b.ret);
				}
				}
				setState(1932);
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
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_blockStatement);
		try {
			setState(1944);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1935);
				((BlockStatementContext)_localctx).d = localVariableDeclarationStatement();
				((BlockStatementContext)_localctx).ret =  ((BlockStatementContext)_localctx).d.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1938);
				((BlockStatementContext)_localctx).c = classDeclaration();
				((BlockStatementContext)_localctx).ret =  ((BlockStatementContext)_localctx).c.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1941);
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
		public LocalVariableStatement ret;
		public LocalVariableDeclarationContext d;
		public Token last;
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1946);
			((LocalVariableDeclarationStatementContext)_localctx).d = localVariableDeclaration();
			setState(1947);
			((LocalVariableDeclarationStatementContext)_localctx).last = match(SEMI);
			((LocalVariableDeclarationStatementContext)_localctx).ret =  new LocalVariableStatement(((LocalVariableDeclarationStatementContext)_localctx).last, ((LocalVariableDeclarationStatementContext)_localctx).d.ret);
			}
		}
		catch (RecognitionException re) {
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
		public List<VariableDeclaration> ret;
		public List<Modifier> mods = new ArrayList<>();
		public List<Annotation> ans = new ArrayList<>();
		public VariableModifierContext m;
		public AnnotationContext a;
		public UnannTypeContext t;
		public VariableDeclaratorListContext l;
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
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				setState(1956);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FINAL:
					{
					{
					setState(1950);
					((LocalVariableDeclarationContext)_localctx).m = variableModifier();
					_localctx.mods.add(((LocalVariableDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1953);
					((LocalVariableDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((LocalVariableDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1960);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1961);
			((LocalVariableDeclarationContext)_localctx).t = unannType();
			setState(1962);
			((LocalVariableDeclarationContext)_localctx).l = variableDeclaratorList(null, _localctx.mods, _localctx.ans, ((LocalVariableDeclarationContext)_localctx).t.ret);
			((LocalVariableDeclarationContext)_localctx).ret =  ((LocalVariableDeclarationContext)_localctx).l.ret;
			}
		}
		catch (RecognitionException re) {
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_statement);
		try {
			setState(1983);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1965);
				((StatementContext)_localctx).a = statementWithoutTrailingSubstatement();
				((StatementContext)_localctx).ret =  ((StatementContext)_localctx).a.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1968);
				((StatementContext)_localctx).b = labeledStatement();
				((StatementContext)_localctx).ret =  ((StatementContext)_localctx).b.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1971);
				((StatementContext)_localctx).c = ifThenStatement();
				((StatementContext)_localctx).ret =  ((StatementContext)_localctx).c.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1974);
				((StatementContext)_localctx).d = ifThenElseStatement();
				((StatementContext)_localctx).ret =  ((StatementContext)_localctx).d.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1977);
				((StatementContext)_localctx).e = whileStatement();
				((StatementContext)_localctx).ret =  ((StatementContext)_localctx).e.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1980);
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
	}

	public final StatementNoShortIfContext statementNoShortIf() throws RecognitionException {
		StatementNoShortIfContext _localctx = new StatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_statementNoShortIf);
		try {
			setState(2000);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1985);
				((StatementNoShortIfContext)_localctx).a = statementWithoutTrailingSubstatement();
				((StatementNoShortIfContext)_localctx).ret =  ((StatementNoShortIfContext)_localctx).a.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1988);
				((StatementNoShortIfContext)_localctx).b = labeledStatementNoShortIf();
				((StatementNoShortIfContext)_localctx).ret =  ((StatementNoShortIfContext)_localctx).b.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1991);
				((StatementNoShortIfContext)_localctx).c = ifThenElseStatementNoShortIf();
				((StatementNoShortIfContext)_localctx).ret =  ((StatementNoShortIfContext)_localctx).c.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1994);
				((StatementNoShortIfContext)_localctx).d = whileStatementNoShortIf();
				((StatementNoShortIfContext)_localctx).ret =  ((StatementNoShortIfContext)_localctx).d.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1997);
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
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(2038);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2002);
				((StatementWithoutTrailingSubstatementContext)_localctx).a = block();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).a.ret;
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(2005);
				((StatementWithoutTrailingSubstatementContext)_localctx).b = emptyStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).b.ret;
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
				setState(2008);
				((StatementWithoutTrailingSubstatementContext)_localctx).c = expressionStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).c.ret;
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(2011);
				((StatementWithoutTrailingSubstatementContext)_localctx).d = assertStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).d.ret;
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(2014);
				((StatementWithoutTrailingSubstatementContext)_localctx).e = switchStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).e.ret;
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(2017);
				((StatementWithoutTrailingSubstatementContext)_localctx).f = doStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).f.ret;
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(2020);
				((StatementWithoutTrailingSubstatementContext)_localctx).g = breakStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).g.ret;
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2023);
				((StatementWithoutTrailingSubstatementContext)_localctx).h = continueStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).h.ret;
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(2026);
				((StatementWithoutTrailingSubstatementContext)_localctx).i = returnStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).i.ret;
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
				setState(2029);
				((StatementWithoutTrailingSubstatementContext)_localctx).j = synchronizedStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).j.ret;
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 11);
				{
				setState(2032);
				((StatementWithoutTrailingSubstatementContext)_localctx).k = throwStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).k.ret;
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 12);
				{
				setState(2035);
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
		public EmptyStatement ret;
		public Token t;
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2040);
			((EmptyStatementContext)_localctx).t = match(SEMI);
			((EmptyStatementContext)_localctx).ret =  new EmptyStatement(((EmptyStatementContext)_localctx).t);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2043);
			((LabeledStatementContext)_localctx).id = match(Identifier);
			setState(2044);
			match(COLON);
			setState(2045);
			((LabeledStatementContext)_localctx).s = statement();
			((LabeledStatementContext)_localctx).ret =  new LabelStatement(((LabeledStatementContext)_localctx).id, ((LabeledStatementContext)_localctx).s.ret);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final LabeledStatementNoShortIfContext labeledStatementNoShortIf() throws RecognitionException {
		LabeledStatementNoShortIfContext _localctx = new LabeledStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_labeledStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2048);
			((LabeledStatementNoShortIfContext)_localctx).id = match(Identifier);
			setState(2049);
			match(COLON);
			setState(2050);
			((LabeledStatementNoShortIfContext)_localctx).s = statementNoShortIf();
			((LabeledStatementNoShortIfContext)_localctx).ret =  new LabelStatement(((LabeledStatementNoShortIfContext)_localctx).id, ((LabeledStatementNoShortIfContext)_localctx).s.ret);
			}
		}
		catch (RecognitionException re) {
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
		public Statement ret;
		public StatementExpressionContext s;
		public Token last;
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2053);
			((ExpressionStatementContext)_localctx).s = statementExpression();
			setState(2054);
			((ExpressionStatementContext)_localctx).last = match(SEMI);
			((ExpressionStatementContext)_localctx).ret =  ((ExpressionStatementContext)_localctx).s.ret; _localctx.ret.setLastToken(((ExpressionStatementContext)_localctx).last);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_statementExpression);
		try {
			setState(2078);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2057);
				((StatementExpressionContext)_localctx).a = assignment();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).a.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2060);
				((StatementExpressionContext)_localctx).b = preIncrementExpression();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).b.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2063);
				((StatementExpressionContext)_localctx).c = preDecrementExpression();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).c.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2066);
				((StatementExpressionContext)_localctx).d = postIncrementExpression();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).d.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2069);
				((StatementExpressionContext)_localctx).f = postDecrementExpression();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).f.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2072);
				((StatementExpressionContext)_localctx).g = methodInvocation();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).g.ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2075);
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
		public Token kw;
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
	}

	public final IfThenStatementContext ifThenStatement() throws RecognitionException {
		IfThenStatementContext _localctx = new IfThenStatementContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_ifThenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2080);
			((IfThenStatementContext)_localctx).kw = match(IF);
			setState(2081);
			match(LPAREN);
			setState(2082);
			((IfThenStatementContext)_localctx).e = expression();
			setState(2083);
			match(RPAREN);
			setState(2084);
			((IfThenStatementContext)_localctx).s = statement();
			((IfThenStatementContext)_localctx).ret =  new IfElseStatement(((IfThenStatementContext)_localctx).kw, ((IfThenStatementContext)_localctx).e.ret, new Block(((IfThenStatementContext)_localctx).s.ret));
			}
		}
		catch (RecognitionException re) {
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
		public Token kw;
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
	}

	public final IfThenElseStatementContext ifThenElseStatement() throws RecognitionException {
		IfThenElseStatementContext _localctx = new IfThenElseStatementContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_ifThenElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2087);
			((IfThenElseStatementContext)_localctx).kw = match(IF);
			setState(2088);
			match(LPAREN);
			setState(2089);
			((IfThenElseStatementContext)_localctx).e = expression();
			setState(2090);
			match(RPAREN);
			setState(2091);
			((IfThenElseStatementContext)_localctx).t = statementNoShortIf();
			setState(2092);
			match(ELSE);
			setState(2093);
			((IfThenElseStatementContext)_localctx).el = statement();
			((IfThenElseStatementContext)_localctx).ret =  new IfElseStatement(((IfThenElseStatementContext)_localctx).kw,
			                                    ((IfThenElseStatementContext)_localctx).e.ret,
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
		public Token kw;
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
	}

	public final IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() throws RecognitionException {
		IfThenElseStatementNoShortIfContext _localctx = new IfThenElseStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_ifThenElseStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2096);
			((IfThenElseStatementNoShortIfContext)_localctx).kw = match(IF);
			setState(2097);
			match(LPAREN);
			setState(2098);
			((IfThenElseStatementNoShortIfContext)_localctx).e = expression();
			setState(2099);
			match(RPAREN);
			setState(2100);
			((IfThenElseStatementNoShortIfContext)_localctx).t = statementNoShortIf();
			setState(2101);
			match(ELSE);
			setState(2102);
			((IfThenElseStatementNoShortIfContext)_localctx).el = statementNoShortIf();
			((IfThenElseStatementNoShortIfContext)_localctx).ret =  new IfElseStatement(((IfThenElseStatementNoShortIfContext)_localctx).kw,
			                                    ((IfThenElseStatementNoShortIfContext)_localctx).e.ret,
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
		public Token kw;
		public ExpressionContext e;
		public Token last;
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
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_assertStatement);
		try {
			setState(2117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2105);
				((AssertStatementContext)_localctx).kw = match(ASSERT);
				setState(2106);
				((AssertStatementContext)_localctx).e = expression();
				setState(2107);
				((AssertStatementContext)_localctx).last = match(SEMI);
				((AssertStatementContext)_localctx).ret =  new AssertStatement(((AssertStatementContext)_localctx).kw, ((AssertStatementContext)_localctx).last, ((AssertStatementContext)_localctx).e.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2110);
				((AssertStatementContext)_localctx).kw = match(ASSERT);
				setState(2111);
				((AssertStatementContext)_localctx).e = expression();
				setState(2112);
				match(COLON);
				setState(2113);
				((AssertStatementContext)_localctx).msg = expression();
				setState(2114);
				((AssertStatementContext)_localctx).last = match(SEMI);
				((AssertStatementContext)_localctx).ret =  new AssertStatement(((AssertStatementContext)_localctx).kw, ((AssertStatementContext)_localctx).last, ((AssertStatementContext)_localctx).e.ret, ((AssertStatementContext)_localctx).msg.ret);
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
		public Token kw;
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
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2119);
			((SwitchStatementContext)_localctx).kw = match(SWITCH);
			setState(2120);
			match(LPAREN);
			setState(2121);
			((SwitchStatementContext)_localctx).e = expression();
			setState(2122);
			match(RPAREN);
			setState(2123);
			((SwitchStatementContext)_localctx).b = switchBlock();
			((SwitchStatementContext)_localctx).ret =  new SwitchStatement(((SwitchStatementContext)_localctx).kw, ((SwitchStatementContext)_localctx).b.last, ((SwitchStatementContext)_localctx).e.ret, ((SwitchStatementContext)_localctx).b.ret);
			}
		}
		catch (RecognitionException re) {
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
		public Token last;
		public List<CaseBlock> blocks = new ArrayList<>();
		public SwitchBlockStatementGroupContext m;
		public SwitchLabelContext l;
		public Token fin;
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
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2126);
			match(LBRACE);
			setState(2132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2127);
					((SwitchBlockContext)_localctx).m = switchBlockStatementGroup();
					_localctx.blocks.add(((SwitchBlockContext)_localctx).m.ret);
					}
					} 
				}
				setState(2134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			}
			setState(2140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(2135);
				((SwitchBlockContext)_localctx).l = switchLabel();
				_localctx.blocks.add(new CaseBlock(((SwitchBlockContext)_localctx).l.ret));
				}
				}
				setState(2142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2143);
			((SwitchBlockContext)_localctx).fin = match(RBRACE);
			((SwitchBlockContext)_localctx).last =  ((SwitchBlockContext)_localctx).fin;
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
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2147);
			((SwitchBlockStatementGroupContext)_localctx).l = switchLabels();
			setState(2148);
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
	}

	public final SwitchLabelsContext switchLabels() throws RecognitionException {
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_switchLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2151);
			((SwitchLabelsContext)_localctx).s = switchLabel();
			_localctx.lbls.add(((SwitchLabelsContext)_localctx).s.ret);
			}
			setState(2159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(2154);
				((SwitchLabelsContext)_localctx).l = switchLabel();
				_localctx.lbls.add(((SwitchLabelsContext)_localctx).l.ret);
				}
				}
				setState(2161);
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
		public Token id;
		public Token kw;
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_switchLabel);
		try {
			setState(2176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2164);
				match(CASE);
				setState(2165);
				((SwitchLabelContext)_localctx).c = constantExpression();
				setState(2166);
				match(COLON);
				((SwitchLabelContext)_localctx).ret =  ((SwitchLabelContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2169);
				match(CASE);
				setState(2170);
				((SwitchLabelContext)_localctx).id = match(Identifier);
				setState(2171);
				match(COLON);
				((SwitchLabelContext)_localctx).ret =  new IdentifierExpression(((SwitchLabelContext)_localctx).id);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2173);
				((SwitchLabelContext)_localctx).kw = match(DEFAULT);
				setState(2174);
				match(COLON);
				((SwitchLabelContext)_localctx).ret =  new IdentifierExpression(((SwitchLabelContext)_localctx).kw);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public WhileStatement ret;
		public Token kw;
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
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2178);
			((WhileStatementContext)_localctx).kw = match(WHILE);
			setState(2179);
			match(LPAREN);
			setState(2180);
			((WhileStatementContext)_localctx).c = expression();
			setState(2181);
			match(RPAREN);
			setState(2182);
			((WhileStatementContext)_localctx).s = statement();
			((WhileStatementContext)_localctx).ret =  new WhileStatement(((WhileStatementContext)_localctx).kw, ((WhileStatementContext)_localctx).c.ret, new Block(((WhileStatementContext)_localctx).s.ret));
			}
		}
		catch (RecognitionException re) {
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
		public Token kw;
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
	}

	public final WhileStatementNoShortIfContext whileStatementNoShortIf() throws RecognitionException {
		WhileStatementNoShortIfContext _localctx = new WhileStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_whileStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2185);
			((WhileStatementNoShortIfContext)_localctx).kw = match(WHILE);
			setState(2186);
			match(LPAREN);
			setState(2187);
			((WhileStatementNoShortIfContext)_localctx).c = expression();
			setState(2188);
			match(RPAREN);
			setState(2189);
			((WhileStatementNoShortIfContext)_localctx).s = statementNoShortIf();
			((WhileStatementNoShortIfContext)_localctx).ret =  new WhileStatement(((WhileStatementNoShortIfContext)_localctx).kw, ((WhileStatementNoShortIfContext)_localctx).c.ret, new Block(((WhileStatementNoShortIfContext)_localctx).s.ret));
			}
		}
		catch (RecognitionException re) {
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
		public Token kw;
		public StatementContext s;
		public ExpressionContext c;
		public Token last;
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
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2192);
			((DoStatementContext)_localctx).kw = match(DO);
			setState(2193);
			((DoStatementContext)_localctx).s = statement();
			setState(2194);
			match(WHILE);
			setState(2195);
			match(LPAREN);
			setState(2196);
			((DoStatementContext)_localctx).c = expression();
			setState(2197);
			match(RPAREN);
			setState(2198);
			((DoStatementContext)_localctx).last = match(SEMI);
			((DoStatementContext)_localctx).ret =  new WhileStatement(((DoStatementContext)_localctx).kw, ((DoStatementContext)_localctx).last, ((DoStatementContext)_localctx).c.ret, new Block(((DoStatementContext)_localctx).s.ret));
			}
		}
		catch (RecognitionException re) {
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
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_forStatement);
		try {
			setState(2207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2201);
				((ForStatementContext)_localctx).b = basicForStatement();
				((ForStatementContext)_localctx).ret =  ((ForStatementContext)_localctx).b.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2204);
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
	}

	public final ForStatementNoShortIfContext forStatementNoShortIf() throws RecognitionException {
		ForStatementNoShortIfContext _localctx = new ForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_forStatementNoShortIf);
		try {
			setState(2215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2209);
				((ForStatementNoShortIfContext)_localctx).b = basicForStatementNoShortIf();
				((ForStatementNoShortIfContext)_localctx).ret =  ((ForStatementNoShortIfContext)_localctx).b.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2212);
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
		public List<Statement> forIn = new ArrayList<>();
		public List<Statement> forUp = new ArrayList<>();
		public Expression expr = new NilExpression();
		public Token kw;
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
	}

	public final BasicForStatementContext basicForStatement() throws RecognitionException {
		BasicForStatementContext _localctx = new BasicForStatementContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_basicForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2217);
			((BasicForStatementContext)_localctx).kw = match(FOR);
			setState(2218);
			match(LPAREN);
			setState(2222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(2219);
				((BasicForStatementContext)_localctx).i = forInit();
				((BasicForStatementContext)_localctx).forIn =  ((BasicForStatementContext)_localctx).i.ret;
				}
			}

			setState(2224);
			match(SEMI);
			setState(2228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2225);
				((BasicForStatementContext)_localctx).e = expression();
				((BasicForStatementContext)_localctx).expr =  ((BasicForStatementContext)_localctx).e.ret;
				}
			}

			setState(2230);
			match(SEMI);
			setState(2234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(2231);
				((BasicForStatementContext)_localctx).u = forUpdate();
				((BasicForStatementContext)_localctx).forUp =  ((BasicForStatementContext)_localctx).u.ret;
				}
			}

			setState(2236);
			match(RPAREN);
			setState(2237);
			((BasicForStatementContext)_localctx).s = statement();
			((BasicForStatementContext)_localctx).ret =  new ForStatement(((BasicForStatementContext)_localctx).kw, _localctx.forIn, _localctx.expr, _localctx.forUp, new Block(((BasicForStatementContext)_localctx).s.ret));
			}
		}
		catch (RecognitionException re) {
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
		public List<Statement> forIn = new ArrayList<>();
		public List<Statement> forUp = new ArrayList<>();
		public Expression expr = new NilExpression();
		public Token kw;
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
	}

	public final BasicForStatementNoShortIfContext basicForStatementNoShortIf() throws RecognitionException {
		BasicForStatementNoShortIfContext _localctx = new BasicForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_basicForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2240);
			((BasicForStatementNoShortIfContext)_localctx).kw = match(FOR);
			setState(2241);
			match(LPAREN);
			setState(2245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(2242);
				((BasicForStatementNoShortIfContext)_localctx).i = forInit();
				((BasicForStatementNoShortIfContext)_localctx).forIn =  ((BasicForStatementNoShortIfContext)_localctx).i.ret;
				}
			}

			setState(2247);
			match(SEMI);
			setState(2251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2248);
				((BasicForStatementNoShortIfContext)_localctx).e = expression();
				((BasicForStatementNoShortIfContext)_localctx).expr =  ((BasicForStatementNoShortIfContext)_localctx).e.ret;
				}
			}

			setState(2253);
			match(SEMI);
			setState(2257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(2254);
				((BasicForStatementNoShortIfContext)_localctx).u = forUpdate();
				((BasicForStatementNoShortIfContext)_localctx).forUp =  ((BasicForStatementNoShortIfContext)_localctx).u.ret;
				}
			}

			setState(2259);
			match(RPAREN);
			setState(2260);
			((BasicForStatementNoShortIfContext)_localctx).s = statementNoShortIf();
			((BasicForStatementNoShortIfContext)_localctx).ret =  new ForStatement(((BasicForStatementNoShortIfContext)_localctx).kw, _localctx.forIn, _localctx.expr, _localctx.forUp, new Block(((BasicForStatementNoShortIfContext)_localctx).s.ret));
			}
		}
		catch (RecognitionException re) {
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
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_forInit);
		try {
			setState(2269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2263);
				((ForInitContext)_localctx).ls = statementExpressionList();
				((ForInitContext)_localctx).ret =  ((ForInitContext)_localctx).ls.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2266);
				((ForInitContext)_localctx).d = localVariableDeclaration();

				            ((ForInitContext)_localctx).ret =  new ArrayList<>();
				            for (VariableDeclaration var : ((ForInitContext)_localctx).d.ret) {
				                _localctx.ret.add(var);
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
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2271);
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
	}

	public final StatementExpressionListContext statementExpressionList() throws RecognitionException {
		StatementExpressionListContext _localctx = new StatementExpressionListContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_statementExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2274);
			((StatementExpressionListContext)_localctx).s = statementExpression();
			_localctx.ups.add(((StatementExpressionListContext)_localctx).s.ret);
			}
			setState(2283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2277);
				match(COMMA);
				setState(2278);
				((StatementExpressionListContext)_localctx).e = statementExpression();
				_localctx.ups.add(((StatementExpressionListContext)_localctx).e.ret);
				}
				}
				setState(2285);
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
		public List<Annotation> ans = new ArrayList<>();
		public Token kw;
		public VariableModifierContext m;
		public AnnotationContext a;
		public TypedVariableDeclaratorIdContext v;
		public ExpressionContext e;
		public StatementContext s;
		public TypedVariableDeclaratorIdContext typedVariableDeclaratorId() {
			return getRuleContext(TypedVariableDeclaratorIdContext.class,0);
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
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public EnhancedForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatement; }
	}

	public final EnhancedForStatementContext enhancedForStatement() throws RecognitionException {
		EnhancedForStatementContext _localctx = new EnhancedForStatementContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_enhancedForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2288);
			((EnhancedForStatementContext)_localctx).kw = match(FOR);
			setState(2289);
			match(LPAREN);
			setState(2298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				setState(2296);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FINAL:
					{
					{
					setState(2290);
					((EnhancedForStatementContext)_localctx).m = variableModifier();
					_localctx.mods.add(((EnhancedForStatementContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(2293);
					((EnhancedForStatementContext)_localctx).a = annotation();
					_localctx.ans.add(((EnhancedForStatementContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2301);
			((EnhancedForStatementContext)_localctx).v = typedVariableDeclaratorId(_localctx.mods, _localctx.ans);
			setState(2302);
			match(COLON);
			setState(2303);
			((EnhancedForStatementContext)_localctx).e = expression();
			setState(2304);
			match(RPAREN);
			setState(2305);
			((EnhancedForStatementContext)_localctx).s = statement();
			((EnhancedForStatementContext)_localctx).ret =  new ForEachStatement(((EnhancedForStatementContext)_localctx).kw, ((EnhancedForStatementContext)_localctx).v.ret, ((EnhancedForStatementContext)_localctx).e.ret, new Block(((EnhancedForStatementContext)_localctx).s.ret));
			}
		}
		catch (RecognitionException re) {
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
		public List<Annotation> ans = new ArrayList<>();
		public Token kw;
		public VariableModifierContext m;
		public AnnotationContext a;
		public TypedVariableDeclaratorIdContext v;
		public ExpressionContext e;
		public StatementNoShortIfContext s;
		public TypedVariableDeclaratorIdContext typedVariableDeclaratorId() {
			return getRuleContext(TypedVariableDeclaratorIdContext.class,0);
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
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public EnhancedForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatementNoShortIf; }
	}

	public final EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() throws RecognitionException {
		EnhancedForStatementNoShortIfContext _localctx = new EnhancedForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_enhancedForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2308);
			((EnhancedForStatementNoShortIfContext)_localctx).kw = match(FOR);
			setState(2309);
			match(LPAREN);
			setState(2318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				setState(2316);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FINAL:
					{
					{
					setState(2310);
					((EnhancedForStatementNoShortIfContext)_localctx).m = variableModifier();
					_localctx.mods.add(((EnhancedForStatementNoShortIfContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(2313);
					((EnhancedForStatementNoShortIfContext)_localctx).a = annotation();
					_localctx.ans.add(((EnhancedForStatementNoShortIfContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2321);
			((EnhancedForStatementNoShortIfContext)_localctx).v = typedVariableDeclaratorId(_localctx.mods, _localctx.ans);
			setState(2322);
			match(COLON);
			setState(2323);
			((EnhancedForStatementNoShortIfContext)_localctx).e = expression();
			setState(2324);
			match(RPAREN);
			setState(2325);
			((EnhancedForStatementNoShortIfContext)_localctx).s = statementNoShortIf();
			((EnhancedForStatementNoShortIfContext)_localctx).ret =  new ForEachStatement(((EnhancedForStatementNoShortIfContext)_localctx).kw, ((EnhancedForStatementNoShortIfContext)_localctx).v.ret, ((EnhancedForStatementNoShortIfContext)_localctx).e.ret, new Block(((EnhancedForStatementNoShortIfContext)_localctx).s.ret));
			}
		}
		catch (RecognitionException re) {
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
		public Token name = null;
		public Token kw;
		public Token id;
		public Token last;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2328);
			((BreakStatementContext)_localctx).kw = match(BREAK);
			setState(2331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(2329);
				((BreakStatementContext)_localctx).id = match(Identifier);
				((BreakStatementContext)_localctx).name =  ((BreakStatementContext)_localctx).id;
				}
			}

			setState(2333);
			((BreakStatementContext)_localctx).last = match(SEMI);
			((BreakStatementContext)_localctx).ret =  new JumpStatement(((BreakStatementContext)_localctx).kw, ((BreakStatementContext)_localctx).last, _localctx.name);
			}
		}
		catch (RecognitionException re) {
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
		public Token name = null;
		public Token kw;
		public Token id;
		public Token last;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2336);
			((ContinueStatementContext)_localctx).kw = match(CONTINUE);
			setState(2339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(2337);
				((ContinueStatementContext)_localctx).id = match(Identifier);
				((ContinueStatementContext)_localctx).name =  ((ContinueStatementContext)_localctx).id;
				}
			}

			setState(2341);
			((ContinueStatementContext)_localctx).last = match(SEMI);
			((ContinueStatementContext)_localctx).ret =  new JumpStatement(((ContinueStatementContext)_localctx).kw, ((ContinueStatementContext)_localctx).last, _localctx.name);
			}
		}
		catch (RecognitionException re) {
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
		public Token kw;
		public Token last;
		public ExpressionContext e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_returnStatement);
		try {
			setState(2352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2344);
				((ReturnStatementContext)_localctx).kw = match(RETURN);
				setState(2345);
				((ReturnStatementContext)_localctx).last = match(SEMI);
				((ReturnStatementContext)_localctx).ret =  new ReturnStatement(((ReturnStatementContext)_localctx).kw, ((ReturnStatementContext)_localctx).last);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2347);
				((ReturnStatementContext)_localctx).kw = match(RETURN);
				setState(2348);
				((ReturnStatementContext)_localctx).e = expression();
				setState(2349);
				((ReturnStatementContext)_localctx).last = match(SEMI);
				((ReturnStatementContext)_localctx).ret =  new ReturnStatement(((ReturnStatementContext)_localctx).kw, ((ReturnStatementContext)_localctx).last, ((ReturnStatementContext)_localctx).e.ret);
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

	public static class ThrowStatementContext extends ParserRuleContext {
		public ThrowStatement ret;
		public Token kw;
		public ExpressionContext e;
		public Token last;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2354);
			((ThrowStatementContext)_localctx).kw = match(THROW);
			setState(2355);
			((ThrowStatementContext)_localctx).e = expression();
			setState(2356);
			((ThrowStatementContext)_localctx).last = match(SEMI);
			((ThrowStatementContext)_localctx).ret =  new ThrowStatement(((ThrowStatementContext)_localctx).kw, ((ThrowStatementContext)_localctx).last, ((ThrowStatementContext)_localctx).e.ret);
			}
		}
		catch (RecognitionException re) {
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
		public Token kw;
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
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2359);
			((SynchronizedStatementContext)_localctx).kw = match(SYNCHRONIZED);
			setState(2360);
			match(LPAREN);
			setState(2361);
			((SynchronizedStatementContext)_localctx).e = expression();
			setState(2362);
			match(RPAREN);
			setState(2363);
			((SynchronizedStatementContext)_localctx).b = block();
			((SynchronizedStatementContext)_localctx).ret =  new SynchronizedBlock(((SynchronizedStatementContext)_localctx).kw, ((SynchronizedStatementContext)_localctx).e.ret, ((SynchronizedStatementContext)_localctx).b.ret);
			}
		}
		catch (RecognitionException re) {
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
		public List<CatchBlock> ls = new ArrayList<>();
		public Token kw;
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
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_tryStatement);
		int _la;
		try {
			setState(2384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2366);
				((TryStatementContext)_localctx).kw = match(TRY);
				setState(2367);
				((TryStatementContext)_localctx).t = block();
				setState(2368);
				((TryStatementContext)_localctx).cs = catches();
				((TryStatementContext)_localctx).ret =  new TryCatchBlock(((TryStatementContext)_localctx).kw, ((TryStatementContext)_localctx).t.ret, ((TryStatementContext)_localctx).cs.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2371);
				((TryStatementContext)_localctx).kw = match(TRY);
				setState(2372);
				((TryStatementContext)_localctx).t = block();
				setState(2376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(2373);
					((TryStatementContext)_localctx).cs = catches();
					((TryStatementContext)_localctx).ls =  ((TryStatementContext)_localctx).cs.ret;
					}
				}

				setState(2378);
				((TryStatementContext)_localctx).f = finally_();
				((TryStatementContext)_localctx).ret =  new TryCatchBlock(((TryStatementContext)_localctx).kw, ((TryStatementContext)_localctx).t.ret, _localctx.ls, ((TryStatementContext)_localctx).f.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2381);
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
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2386);
			((CatchesContext)_localctx).f = catchClause();
			_localctx.ls.add(((CatchesContext)_localctx).f.ret);
			setState(2393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(2388);
				((CatchesContext)_localctx).c = catchClause();
				_localctx.ls.add(((CatchesContext)_localctx).c.ret);
				}
				}
				setState(2395);
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
		public Token kw;
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
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2398);
			((CatchClauseContext)_localctx).kw = match(CATCH);
			((CatchClauseContext)_localctx).ret =  new CatchBlock(((CatchClauseContext)_localctx).kw);
			setState(2400);
			match(LPAREN);
			setState(2401);
			catchFormalParameter(_localctx.ret);
			setState(2402);
			match(RPAREN);
			setState(2403);
			((CatchClauseContext)_localctx).b = block();

			            _localctx.ret.setStatements(((CatchClauseContext)_localctx).b.ret.getStatements());
			            _localctx.ret.setLastToken(((CatchClauseContext)_localctx).b.ret.getLastToken());
			        
			}
		}
		catch (RecognitionException re) {
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
		public List<Annotation> ans = new ArrayList<>();
		public VariableModifierContext m;
		public AnnotationContext a;
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
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public CatchFormalParameterContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CatchFormalParameterContext(ParserRuleContext parent, int invokingState, CatchBlock ret) {
			super(parent, invokingState);
			this.ret = ret;
		}
		@Override public int getRuleIndex() { return RULE_catchFormalParameter; }
	}

	public final CatchFormalParameterContext catchFormalParameter(CatchBlock ret) throws RecognitionException {
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(_ctx, getState(), ret);
		enterRule(_localctx, 314, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				setState(2412);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FINAL:
					{
					{
					setState(2406);
					((CatchFormalParameterContext)_localctx).m = variableModifier();
					_localctx.mods.add(((CatchFormalParameterContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(2409);
					((CatchFormalParameterContext)_localctx).a = annotation();
					_localctx.ans.add(((CatchFormalParameterContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2417);
			catchType(_localctx.ret);
			setState(2418);
			((CatchFormalParameterContext)_localctx).n = variableDeclaratorId();
			_localctx.ret.setVariable(new VariableDeclaration(((CatchFormalParameterContext)_localctx).n.ret, _localctx.mods, _localctx.ans));
			}
		}
		catch (RecognitionException re) {
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
	}

	public final CatchTypeContext catchType(CatchBlock ret) throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState(), ret);
		enterRule(_localctx, 316, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2421);
			((CatchTypeContext)_localctx).u = unannClassType();
			_localctx.ret.addExceptionType(((CatchTypeContext)_localctx).u.ret);
			}
			setState(2430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(2424);
				match(BITOR);
				setState(2425);
				((CatchTypeContext)_localctx).c = classType();
				_localctx.ret.addExceptionType(((CatchTypeContext)_localctx).c.ret);
				}
				}
				setState(2432);
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
	}

	public final Finally_Context finally_() throws RecognitionException {
		Finally_Context _localctx = new Finally_Context(_ctx, getState());
		enterRule(_localctx, 318, RULE_finally_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2433);
			match(FINALLY);
			setState(2434);
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
		public List<CatchBlock> ls = new ArrayList<>();
		public Block fin = new NilBlock();
		public Token kw;
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
	}

	public final TryWithResourcesStatementContext tryWithResourcesStatement() throws RecognitionException {
		TryWithResourcesStatementContext _localctx = new TryWithResourcesStatementContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_tryWithResourcesStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2437);
			((TryWithResourcesStatementContext)_localctx).kw = match(TRY);
			setState(2438);
			((TryWithResourcesStatementContext)_localctx).r = resourceSpecification();
			setState(2439);
			((TryWithResourcesStatementContext)_localctx).b = block();
			setState(2443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(2440);
				((TryWithResourcesStatementContext)_localctx).c = catches();
				((TryWithResourcesStatementContext)_localctx).ls =  ((TryWithResourcesStatementContext)_localctx).c.ret;
				}
			}

			setState(2448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(2445);
				((TryWithResourcesStatementContext)_localctx).f = finally_();
				((TryWithResourcesStatementContext)_localctx).fin =  ((TryWithResourcesStatementContext)_localctx).f.ret;
				}
			}

			((TryWithResourcesStatementContext)_localctx).ret =  new TryCatchBlock(((TryWithResourcesStatementContext)_localctx).kw, ((TryWithResourcesStatementContext)_localctx).r.ret, ((TryWithResourcesStatementContext)_localctx).b.ret, _localctx.ls, _localctx.fin);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ResourceSpecificationContext)_localctx).ret =  new ArrayList<>();
			setState(2453);
			match(LPAREN);
			setState(2458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(2454);
				((ResourceSpecificationContext)_localctx).l = resourceList();
				setState(2455);
				match(SEMI);
				((ResourceSpecificationContext)_localctx).ret =  ((ResourceSpecificationContext)_localctx).l.ret;
				}
			}

			setState(2460);
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
	}

	public final ResourceListContext resourceList() throws RecognitionException {
		ResourceListContext _localctx = new ResourceListContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_resourceList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2462);
			((ResourceListContext)_localctx).r = resource();
			_localctx.vars.add(((ResourceListContext)_localctx).r.ret);
			setState(2470);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2464);
					match(SEMI);
					setState(2465);
					((ResourceListContext)_localctx).re = resource();
					_localctx.vars.add(((ResourceListContext)_localctx).re.ret);
					}
					} 
				}
				setState(2472);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
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
		public List<Annotation> ans = new ArrayList<>();
		public VariableModifierContext m;
		public AnnotationContext a;
		public TypedVariableDeclaratorIdContext v;
		public ExpressionContext e;
		public TypedVariableDeclaratorIdContext typedVariableDeclaratorId() {
			return getRuleContext(TypedVariableDeclaratorIdContext.class,0);
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
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				setState(2481);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FINAL:
					{
					{
					setState(2475);
					((ResourceContext)_localctx).m = variableModifier();
					_localctx.mods.add(((ResourceContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(2478);
					((ResourceContext)_localctx).a = annotation();
					_localctx.ans.add(((ResourceContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2485);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2486);
			((ResourceContext)_localctx).v = typedVariableDeclaratorId(_localctx.mods, _localctx.ans);
			setState(2487);
			match(ASSIGN);
			setState(2488);
			((ResourceContext)_localctx).e = expression();

			            ((ResourceContext)_localctx).v.ret.setInitializer(((ResourceContext)_localctx).e.ret);
			            ((ResourceContext)_localctx).ret =  ((ResourceContext)_localctx).v.ret;
			        
			}
		}
		catch (RecognitionException re) {
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
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(2491);
				((PrimaryContext)_localctx).pno = primaryNoNewArray_lfno_primary();
				((PrimaryContext)_localctx).ret =  ((PrimaryContext)_localctx).pno.ret;
				}
				break;
			case 2:
				{
				setState(2494);
				((PrimaryContext)_localctx).a = arrayCreationExpression();
				((PrimaryContext)_localctx).ret =  ((PrimaryContext)_localctx).a.ret;
				}
				break;
			}
			setState(2504);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2499);
					((PrimaryContext)_localctx).p = primaryNoNewArray_lf_primary();

					                if (((PrimaryContext)_localctx).p.isAccess) {
					                    ((PrimaryContext)_localctx).ret =  new AccessExpression(_localctx.ret, ((PrimaryContext)_localctx).p.ret);
					                } else {
					                    ((PrimaryContext)_localctx).ret =  new MethodReferenceExpression(_localctx.ret, ((PrimaryContext)_localctx).p.ret);
					                }
					            
					}
					} 
				}
				setState(2506);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
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
		public Token kw;
		public Token first;
		public ExpressionContext p;
		public Token last;
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
	}

	public final PrimaryNoNewArrayContext primaryNoNewArray() throws RecognitionException {
		PrimaryNoNewArrayContext _localctx = new PrimaryNoNewArrayContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_primaryNoNewArray);
		try {
			setState(2535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2507);
				((PrimaryNoNewArrayContext)_localctx).a1 = literal();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a1.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2510);
				((PrimaryNoNewArrayContext)_localctx).a2 = primaryNoNewArray_typeAccess();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a2.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2513);
				((PrimaryNoNewArrayContext)_localctx).kw = match(THIS);
				((PrimaryNoNewArrayContext)_localctx).ret =  new KeywordExpression(((PrimaryNoNewArrayContext)_localctx).kw);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2515);
				((PrimaryNoNewArrayContext)_localctx).first = match(LPAREN);
				setState(2516);
				((PrimaryNoNewArrayContext)_localctx).p = expression();
				setState(2517);
				((PrimaryNoNewArrayContext)_localctx).last = match(RPAREN);
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).p.ret; _localctx.ret.setFirstToken(((PrimaryNoNewArrayContext)_localctx).first); _localctx.ret.setLastToken(((PrimaryNoNewArrayContext)_localctx).last);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2520);
				((PrimaryNoNewArrayContext)_localctx).a7 = classInstanceCreationExpression();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a7.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2523);
				((PrimaryNoNewArrayContext)_localctx).a8 = fieldAccess();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a8.ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2526);
				((PrimaryNoNewArrayContext)_localctx).a9 = arrayAccess();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a9.ret;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2529);
				((PrimaryNoNewArrayContext)_localctx).a10 = methodInvocation();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a10.ret;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2532);
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
		public List<Dimension> ls = new ArrayList<>();
		public Expression expr;
		public Token id;
		public Token first;
		public Token last;
		public Token kw;
		public PackageOrTypeNameContext p;
		public Token kv;
		public Token kc;
		public TypeNameContext a5;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PrimaryNoNewArray_typeAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_typeAccess; }
	}

	public final PrimaryNoNewArray_typeAccessContext primaryNoNewArray_typeAccess() throws RecognitionException {
		PrimaryNoNewArray_typeAccessContext _localctx = new PrimaryNoNewArray_typeAccessContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_primaryNoNewArray_typeAccess);
		int _la;
		try {
			setState(2573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2537);
				((PrimaryNoNewArray_typeAccessContext)_localctx).id = match(Identifier);
				setState(2543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2538);
					((PrimaryNoNewArray_typeAccessContext)_localctx).first = match(LBRACK);
					setState(2539);
					((PrimaryNoNewArray_typeAccessContext)_localctx).last = match(RBRACK);
					_localctx.ls.add(new Dimension(((PrimaryNoNewArray_typeAccessContext)_localctx).first, ((PrimaryNoNewArray_typeAccessContext)_localctx).last));
					}
					}
					setState(2545);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2546);
				match(DOT);
				setState(2547);
				((PrimaryNoNewArray_typeAccessContext)_localctx).kw = match(CLASS);

				            ((PrimaryNoNewArray_typeAccessContext)_localctx).expr =  new IdentifierExpression(((PrimaryNoNewArray_typeAccessContext)_localctx).id);
				            if (_localctx.ls.size() > 0) {
				                ((PrimaryNoNewArray_typeAccessContext)_localctx).expr =  new ArrayTypeExpression(_localctx.expr, _localctx.ls);
				            }
				            ((PrimaryNoNewArray_typeAccessContext)_localctx).ret =  new AccessExpression(_localctx.expr, new KeywordExpression(((PrimaryNoNewArray_typeAccessContext)_localctx).kw));
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2549);
				((PrimaryNoNewArray_typeAccessContext)_localctx).p = packageOrTypeName(0);
				setState(2550);
				match(DOT);
				setState(2551);
				((PrimaryNoNewArray_typeAccessContext)_localctx).id = match(Identifier);
				setState(2557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2552);
					((PrimaryNoNewArray_typeAccessContext)_localctx).first = match(LBRACK);
					setState(2553);
					((PrimaryNoNewArray_typeAccessContext)_localctx).last = match(RBRACK);
					_localctx.ls.add(new Dimension(((PrimaryNoNewArray_typeAccessContext)_localctx).first, ((PrimaryNoNewArray_typeAccessContext)_localctx).last));
					}
					}
					setState(2559);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2560);
				match(DOT);
				setState(2561);
				((PrimaryNoNewArray_typeAccessContext)_localctx).kw = match(CLASS);

				            ((PrimaryNoNewArray_typeAccessContext)_localctx).expr =  new IdentifierExpression(((PrimaryNoNewArray_typeAccessContext)_localctx).id);
				            if (_localctx.ls.size() > 0) {
				                ((PrimaryNoNewArray_typeAccessContext)_localctx).expr =  new ArrayTypeExpression(_localctx.expr, _localctx.ls);
				            }
				            ((PrimaryNoNewArray_typeAccessContext)_localctx).ret =  new AccessExpression(new AccessExpression(((PrimaryNoNewArray_typeAccessContext)_localctx).p.ret, _localctx.expr),
				                                        new KeywordExpression(((PrimaryNoNewArray_typeAccessContext)_localctx).kw));
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2564);
				((PrimaryNoNewArray_typeAccessContext)_localctx).kv = match(VOID);
				setState(2565);
				match(DOT);
				setState(2566);
				((PrimaryNoNewArray_typeAccessContext)_localctx).kc = match(CLASS);
				((PrimaryNoNewArray_typeAccessContext)_localctx).ret =  new AccessExpression(new KeywordExpression(((PrimaryNoNewArray_typeAccessContext)_localctx).kv),
				                                     new KeywordExpression(((PrimaryNoNewArray_typeAccessContext)_localctx).kc));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2568);
				((PrimaryNoNewArray_typeAccessContext)_localctx).a5 = typeName();
				setState(2569);
				match(DOT);
				setState(2570);
				((PrimaryNoNewArray_typeAccessContext)_localctx).kw = match(THIS);

				            ((PrimaryNoNewArray_typeAccessContext)_localctx).ret =  new AccessExpression(((PrimaryNoNewArray_typeAccessContext)_localctx).a5.ret, new KeywordExpression(((PrimaryNoNewArray_typeAccessContext)_localctx).kw));
				        
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
	}

	public final PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lf_arrayAccessContext _localctx = new PrimaryNoNewArray_lf_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_primaryNoNewArray_lf_arrayAccess);
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
		public Token kw;
		public Token first;
		public ExpressionContext p;
		public Token last;
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
	}

	public final PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lfno_arrayAccessContext _localctx = new PrimaryNoNewArray_lfno_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_primaryNoNewArray_lfno_arrayAccess);
		try {
			setState(2602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2577);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a1 = literal();
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a1.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2580);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a2 = primaryNoNewArray_typeAccess();
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a2.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2583);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).kw = match(THIS);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  new KeywordExpression(((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).kw);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2585);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).first = match(LPAREN);
				setState(2586);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).p = expression();
				setState(2587);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).last = match(RPAREN);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).p.ret; _localctx.ret.setFirstToken(((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).first); _localctx.ret.setLastToken(((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).last);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2590);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a5 = classInstanceCreationExpression();
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a5.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2593);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a6 = fieldAccess();
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a6.ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2596);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a7 = methodInvocation();
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a7.ret;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2599);
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
	}

	public final PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_primaryNoNewArray_lf_primary);
		try {
			setState(2619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2604);
				((PrimaryNoNewArray_lf_primaryContext)_localctx).a1 = classInstanceCreationExpression_lf_primary();
				((PrimaryNoNewArray_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primaryContext)_localctx).a1.ret;
				                                                         ((PrimaryNoNewArray_lf_primaryContext)_localctx).isAccess =  true;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2607);
				((PrimaryNoNewArray_lf_primaryContext)_localctx).a2 = fieldAccess_lf_primary();
				((PrimaryNoNewArray_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primaryContext)_localctx).a2.ret; ((PrimaryNoNewArray_lf_primaryContext)_localctx).isAccess =  true;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2610);
				((PrimaryNoNewArray_lf_primaryContext)_localctx).a3 = arrayAccess_lf_primary();
				((PrimaryNoNewArray_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primaryContext)_localctx).a3.ret; ((PrimaryNoNewArray_lf_primaryContext)_localctx).isAccess =  ((PrimaryNoNewArray_lf_primaryContext)_localctx).a3.isAccess;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2613);
				((PrimaryNoNewArray_lf_primaryContext)_localctx).a4 = methodInvocation_lf_primary();
				((PrimaryNoNewArray_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primaryContext)_localctx).a4.ret; ((PrimaryNoNewArray_lf_primaryContext)_localctx).isAccess =  true;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2616);
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
	}

	public final PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
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
	}

	public final PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(2635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2623);
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a1 = classInstanceCreationExpression_lf_primary();
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a1.ret;
				                                                         ((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).isAccess =  true;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2626);
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a2 = fieldAccess_lf_primary();
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a2.ret; ((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).isAccess =  true;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2629);
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a3 = methodInvocation_lf_primary();
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a3.ret; ((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).isAccess =  true;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2632);
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
		public List<Dimension> ls = new ArrayList<>();
		public Expression lhs;
		public LiteralContext a1;
		public PrimaryNoNewArray_typeAccessContext a2;
		public UnannPrimitiveTypeContext a3;
		public Token first;
		public Token last;
		public Token kw;
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
	}

	public final PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_primaryNoNewArray_lfno_primary);
		int _la;
		try {
			setState(2678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2637);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a1 = literal();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a1.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2640);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a2 = primaryNoNewArray_typeAccess();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a2.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2643);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a3 = unannPrimitiveType();
				setState(2649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2644);
					((PrimaryNoNewArray_lfno_primaryContext)_localctx).first = match(LBRACK);
					setState(2645);
					((PrimaryNoNewArray_lfno_primaryContext)_localctx).last = match(RBRACK);
					_localctx.ls.add(new Dimension(((PrimaryNoNewArray_lfno_primaryContext)_localctx).first, ((PrimaryNoNewArray_lfno_primaryContext)_localctx).last));
					}
					}
					setState(2651);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2652);
				match(DOT);
				setState(2653);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).kw = match(CLASS);

				            ((PrimaryNoNewArray_lfno_primaryContext)_localctx).lhs =  new KeywordExpression(((PrimaryNoNewArray_lfno_primaryContext)_localctx).a3.ret);
				            if (_localctx.ls.size() > 0) {
				                ((PrimaryNoNewArray_lfno_primaryContext)_localctx).lhs =  new ArrayTypeExpression(_localctx.lhs, _localctx.ls);
				            }
				            ((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  new AccessExpression(_localctx.lhs, new KeywordExpression(((PrimaryNoNewArray_lfno_primaryContext)_localctx).kw));
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2656);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).kw = match(THIS);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  new KeywordExpression(((PrimaryNoNewArray_lfno_primaryContext)_localctx).kw);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2658);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).first = match(LPAREN);
				setState(2659);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).p = expression();
				setState(2660);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).last = match(RPAREN);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).p.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2663);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a7 = classInstanceCreationExpression_lfno_primary();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a7.ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2666);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a8 = fieldAccess_lfno_primary();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a8.ret;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2669);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a9 = arrayAccess_lfno_primary();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a9.ret;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2672);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a10 = methodInvocation_lfno_primary();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a10.ret;
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2675);
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
	}

	public final PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
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
		public List<Dimension> ls = new ArrayList<>();
		public Expression lhs;
		public LiteralContext a1;
		public PrimaryNoNewArray_typeAccessContext a2;
		public UnannPrimitiveTypeContext a3;
		public Token first;
		public Token last;
		public Token kw;
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
	}

	public final PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		int _la;
		try {
			setState(2720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2682);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a1 = literal();
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a1.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2685);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a2 = primaryNoNewArray_typeAccess();
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a2.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2688);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a3 = unannPrimitiveType();
				setState(2694);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2689);
					((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).first = match(LBRACK);
					setState(2690);
					((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).last = match(RBRACK);
					_localctx.ls.add(new Dimension(((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).first, ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).last));
					}
					}
					setState(2696);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2697);
				match(DOT);
				setState(2698);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).kw = match(CLASS);

				            ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).lhs =  new KeywordExpression(((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a3.ret);
				            if (_localctx.ls.size() > 0) {
				                ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).lhs =  new ArrayTypeExpression(_localctx.lhs, _localctx.ls);
				            }
				            ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  new AccessExpression(_localctx.lhs, new KeywordExpression(((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).kw));
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2701);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).kw = match(THIS);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  new KeywordExpression(((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).kw);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2703);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).first = match(LPAREN);
				setState(2704);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).p = expression();
				setState(2705);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).last = match(RPAREN);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).p.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2708);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a7 = classInstanceCreationExpression_lfno_primary();
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a7.ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2711);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a8 = fieldAccess_lfno_primary();
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a8.ret;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2714);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a9 = methodInvocation_lfno_primary();
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a9.ret;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2717);
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
		public List<TypeArgument> targs = new ArrayList<>();
		public List<Expression> args = new ArrayList<>();
		public Token kw;
		public TypeArgumentsContext t;
		public AnnotationContext a;
		public Token id;
		public AnnotationContext a2;
		public Token id2;
		public TypeArgumentsOrDiamondContext ta;
		public ArgumentListContext l;
		public Token last;
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
	}

	public final ClassInstanceCreationExpressionContext classInstanceCreationExpression() throws RecognitionException {
		ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(2838);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2722);
				((ClassInstanceCreationExpressionContext)_localctx).kw = match(NEW);
				setState(2726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2723);
					((ClassInstanceCreationExpressionContext)_localctx).t = typeArguments();
					((ClassInstanceCreationExpressionContext)_localctx).targs =  ((ClassInstanceCreationExpressionContext)_localctx).t.ret;
					}
				}

				setState(2733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2728);
					((ClassInstanceCreationExpressionContext)_localctx).a = annotation();
					_localctx.ans.add(((ClassInstanceCreationExpressionContext)_localctx).a.ret);
					}
					}
					setState(2735);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2736);
				((ClassInstanceCreationExpressionContext)_localctx).id = match(Identifier);

				            ((ClassInstanceCreationExpressionContext)_localctx).methodExpr =  new IdentifierExpression(((ClassInstanceCreationExpressionContext)_localctx).id, _localctx.ans);
				        
				setState(2751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2738);
					match(DOT);
					setState(2744);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2739);
						((ClassInstanceCreationExpressionContext)_localctx).a2 = annotation();
						_localctx.ans2.add(((ClassInstanceCreationExpressionContext)_localctx).a2.ret);
						}
						}
						setState(2746);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2747);
					((ClassInstanceCreationExpressionContext)_localctx).id2 = match(Identifier);

					                ((ClassInstanceCreationExpressionContext)_localctx).methodExpr =  new AccessExpression(_localctx.methodExpr,
					                                                   new IdentifierExpression(((ClassInstanceCreationExpressionContext)_localctx).id2,
					                                                                            _localctx.ans2));
					                _localctx.ans2.clear();
					            
					}
					}
					setState(2753);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2754);
					((ClassInstanceCreationExpressionContext)_localctx).ta = typeArgumentsOrDiamond();

					                ((ClassInstanceCreationExpressionContext)_localctx).methodExpr =  new TypeExpression(_localctx.methodExpr, ((ClassInstanceCreationExpressionContext)_localctx).ta.ret);
					            
					}
				}

				setState(2759);
				match(LPAREN);
				setState(2763);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2760);
					((ClassInstanceCreationExpressionContext)_localctx).l = argumentList();
					((ClassInstanceCreationExpressionContext)_localctx).args =  ((ClassInstanceCreationExpressionContext)_localctx).l.ret;
					}
				}

				setState(2765);
				((ClassInstanceCreationExpressionContext)_localctx).last = match(RPAREN);

				            ((ClassInstanceCreationExpressionContext)_localctx).inst =  new InstantiationExpression(((ClassInstanceCreationExpressionContext)_localctx).kw, ((ClassInstanceCreationExpressionContext)_localctx).last,
				                                                _localctx.methodExpr,
				                                                _localctx.args, _localctx.targs);
				            ((ClassInstanceCreationExpressionContext)_localctx).anon =  _localctx.inst.getAnonymousClass();
				            ((ClassInstanceCreationExpressionContext)_localctx).ret =  _localctx.inst;
				        
				setState(2768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2767);
					classBody(_localctx.anon);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2770);
				((ClassInstanceCreationExpressionContext)_localctx).name = expressionName();
				setState(2771);
				match(DOT);
				setState(2772);
				((ClassInstanceCreationExpressionContext)_localctx).kw = match(NEW);
				setState(2776);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2773);
					((ClassInstanceCreationExpressionContext)_localctx).t = typeArguments();
					((ClassInstanceCreationExpressionContext)_localctx).targs =  ((ClassInstanceCreationExpressionContext)_localctx).t.ret;
					}
				}

				setState(2783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2778);
					((ClassInstanceCreationExpressionContext)_localctx).a = annotation();
					_localctx.ans.add(((ClassInstanceCreationExpressionContext)_localctx).a.ret);
					}
					}
					setState(2785);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2786);
				((ClassInstanceCreationExpressionContext)_localctx).id = match(Identifier);

				            ((ClassInstanceCreationExpressionContext)_localctx).methodExpr =  new IdentifierExpression(((ClassInstanceCreationExpressionContext)_localctx).id, _localctx.ans);
				        
				setState(2791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2788);
					((ClassInstanceCreationExpressionContext)_localctx).ta = typeArgumentsOrDiamond();

					                ((ClassInstanceCreationExpressionContext)_localctx).methodExpr =  new TypeExpression(_localctx.methodExpr, ((ClassInstanceCreationExpressionContext)_localctx).ta.ret);
					            
					}
				}

				setState(2793);
				match(LPAREN);
				setState(2797);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2794);
					((ClassInstanceCreationExpressionContext)_localctx).l = argumentList();
					((ClassInstanceCreationExpressionContext)_localctx).args =  ((ClassInstanceCreationExpressionContext)_localctx).l.ret;
					}
				}

				setState(2799);
				((ClassInstanceCreationExpressionContext)_localctx).last = match(RPAREN);

				            ((ClassInstanceCreationExpressionContext)_localctx).inst =  new InstantiationExpression(((ClassInstanceCreationExpressionContext)_localctx).kw, ((ClassInstanceCreationExpressionContext)_localctx).last,
				                                                _localctx.methodExpr,
				                                                _localctx.args, _localctx.targs);
				            ((ClassInstanceCreationExpressionContext)_localctx).anon =  _localctx.inst.getAnonymousClass();
				            ((ClassInstanceCreationExpressionContext)_localctx).ret =  new AccessExpression(((ClassInstanceCreationExpressionContext)_localctx).name.ret, _localctx.inst);
				        
				setState(2802);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2801);
					classBody(_localctx.anon);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2804);
				((ClassInstanceCreationExpressionContext)_localctx).p = primary();
				setState(2805);
				match(DOT);
				setState(2806);
				((ClassInstanceCreationExpressionContext)_localctx).kw = match(NEW);
				setState(2810);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2807);
					((ClassInstanceCreationExpressionContext)_localctx).t = typeArguments();
					((ClassInstanceCreationExpressionContext)_localctx).targs =  ((ClassInstanceCreationExpressionContext)_localctx).t.ret;
					}
				}

				setState(2817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2812);
					((ClassInstanceCreationExpressionContext)_localctx).a = annotation();
					_localctx.ans.add(((ClassInstanceCreationExpressionContext)_localctx).a.ret);
					}
					}
					setState(2819);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2820);
				((ClassInstanceCreationExpressionContext)_localctx).id = match(Identifier);

				            ((ClassInstanceCreationExpressionContext)_localctx).methodExpr =  new IdentifierExpression(((ClassInstanceCreationExpressionContext)_localctx).id, _localctx.ans);
				        
				setState(2825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2822);
					((ClassInstanceCreationExpressionContext)_localctx).ta = typeArgumentsOrDiamond();

					                ((ClassInstanceCreationExpressionContext)_localctx).methodExpr =  new TypeExpression(_localctx.methodExpr, ((ClassInstanceCreationExpressionContext)_localctx).ta.ret);
					            
					}
				}

				setState(2827);
				match(LPAREN);
				setState(2831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2828);
					((ClassInstanceCreationExpressionContext)_localctx).l = argumentList();
					((ClassInstanceCreationExpressionContext)_localctx).args =  ((ClassInstanceCreationExpressionContext)_localctx).l.ret;
					}
				}

				setState(2833);
				((ClassInstanceCreationExpressionContext)_localctx).last = match(RPAREN);

				            ((ClassInstanceCreationExpressionContext)_localctx).inst =  new InstantiationExpression(((ClassInstanceCreationExpressionContext)_localctx).kw, ((ClassInstanceCreationExpressionContext)_localctx).last,
				                                                _localctx.methodExpr,
				                                                _localctx.args, _localctx.targs);
				            ((ClassInstanceCreationExpressionContext)_localctx).anon =  _localctx.inst.getAnonymousClass();
				            ((ClassInstanceCreationExpressionContext)_localctx).ret =  new AccessExpression(((ClassInstanceCreationExpressionContext)_localctx).p.ret, _localctx.inst);
				        
				setState(2836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2835);
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
		public List<TypeArgument> targs = new ArrayList<>();
		public List<Expression> args = new ArrayList<>();
		public Expression methodExpr;
		public Token kw;
		public TypeArgumentsContext t;
		public AnnotationContext a;
		public Token id;
		public TypeArgumentsOrDiamondContext ta;
		public ArgumentListContext l;
		public Token last;
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
	}

	public final ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lf_primaryContext _localctx = new ClassInstanceCreationExpression_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_classInstanceCreationExpression_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2840);
			match(DOT);
			setState(2841);
			((ClassInstanceCreationExpression_lf_primaryContext)_localctx).kw = match(NEW);
			setState(2845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2842);
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).t = typeArguments();
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).targs =  ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).t.ret;
				}
			}

			setState(2852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2847);
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).a = annotation();
				_localctx.ans.add(((ClassInstanceCreationExpression_lf_primaryContext)_localctx).a.ret);
				}
				}
				setState(2854);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2855);
			((ClassInstanceCreationExpression_lf_primaryContext)_localctx).id = match(Identifier);

			            ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).methodExpr =  new IdentifierExpression(((ClassInstanceCreationExpression_lf_primaryContext)_localctx).id, _localctx.ans);
			        
			setState(2860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2857);
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).ta = typeArgumentsOrDiamond();

				                ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).methodExpr =  new TypeExpression(_localctx.methodExpr, ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).ta.ret);
				            
				}
			}

			setState(2862);
			match(LPAREN);
			setState(2866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2863);
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).l = argumentList();
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).args =  ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).l.ret;
				}
			}

			setState(2868);
			((ClassInstanceCreationExpression_lf_primaryContext)_localctx).last = match(RPAREN);

			            ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).inst =  new InstantiationExpression(((ClassInstanceCreationExpression_lf_primaryContext)_localctx).kw, ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).last,
			                                                _localctx.methodExpr,
			                                                _localctx.args, _localctx.targs);
			            ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).anon =  _localctx.inst.getAnonymousClass();
			            ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).ret =  _localctx.inst;
			        
			setState(2871);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				{
				setState(2870);
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
		public List<TypeArgument> targs = new ArrayList<>();
		public List<Expression> args = new ArrayList<>();
		public Token kw;
		public TypeArgumentsContext t;
		public AnnotationContext a;
		public Token id;
		public AnnotationContext a2;
		public Token id2;
		public TypeArgumentsOrDiamondContext ta;
		public ArgumentListContext l;
		public Token last;
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
	}

	public final ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lfno_primaryContext _localctx = new ClassInstanceCreationExpression_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_classInstanceCreationExpression_lfno_primary);
		int _la;
		try {
			setState(2955);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2873);
				((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).kw = match(NEW);
				setState(2877);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2874);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).t = typeArguments();
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).targs =  ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(2884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2879);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a = annotation();
					_localctx.ans.add(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a.ret);
					}
					}
					setState(2886);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2887);
				((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id = match(Identifier);

				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).methodExpr =  new IdentifierExpression(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id, _localctx.ans);
				        
				setState(2902);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2889);
					match(DOT);
					setState(2895);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2890);
						((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a2 = annotation();
						_localctx.ans2.add(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a2.ret);
						}
						}
						setState(2897);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2898);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id2 = match(Identifier);

					                ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).methodExpr =  new AccessExpression(_localctx.methodExpr,
					                                                   new IdentifierExpression(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id2,
					                                                                            _localctx.ans2));
					                _localctx.ans2.clear();
					            
					}
					}
					setState(2904);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2905);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ta = typeArgumentsOrDiamond();

					                ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).methodExpr =  new TypeExpression(_localctx.methodExpr, ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ta.ret);
					            
					}
				}

				setState(2910);
				match(LPAREN);
				setState(2914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2911);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).l = argumentList();
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).args =  ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).l.ret;
					}
				}

				setState(2916);
				((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).last = match(RPAREN);

				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).inst =  new InstantiationExpression(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).kw, ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).last,
				                                                _localctx.methodExpr,
				                                                _localctx.args, _localctx.targs);
				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).anon =  _localctx.inst.getAnonymousClass();
				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ret =  _localctx.inst;
				        
				setState(2919);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(2918);
					classBody(_localctx.anon);
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2921);
				((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).name = expressionName();
				setState(2922);
				match(DOT);
				setState(2923);
				((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).kw = match(NEW);
				setState(2927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2924);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).t = typeArguments();
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).targs =  ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(2934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2929);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a = annotation();
					_localctx.ans.add(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a.ret);
					}
					}
					setState(2936);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2937);
				((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id = match(Identifier);

				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).methodExpr =  new IdentifierExpression(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id, _localctx.ans);
				        
				setState(2942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2939);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ta = typeArgumentsOrDiamond();

					                ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).methodExpr =  new TypeExpression(_localctx.methodExpr, ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ta.ret);
					            
					}
				}

				setState(2944);
				match(LPAREN);
				setState(2948);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2945);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).l = argumentList();
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).args =  ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).l.ret;
					}
				}

				setState(2950);
				((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).last = match(RPAREN);

				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).inst =  new InstantiationExpression(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).kw, ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).last,
				                                                _localctx.methodExpr,
				                                                _localctx.args, _localctx.targs);
				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).anon =  _localctx.inst.getAnonymousClass();
				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ret =  new AccessExpression(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).name.ret, _localctx.inst);
				        
				setState(2953);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(2952);
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
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_typeArgumentsOrDiamond);
		try {
			setState(2963);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2957);
				((TypeArgumentsOrDiamondContext)_localctx).ta = typeArguments();
				((TypeArgumentsOrDiamondContext)_localctx).ret =  ((TypeArgumentsOrDiamondContext)_localctx).ta.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2960);
				match(LT);
				setState(2961);
				match(GT);
				((TypeArgumentsOrDiamondContext)_localctx).ret =  new ArrayList<>(); _localctx.ret.add(new TypeArgument());
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
		public Token kw;
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
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_fieldAccess);
		try {
			setState(2981);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2965);
				((FieldAccessContext)_localctx).p = primary();
				setState(2966);
				match(DOT);
				setState(2967);
				((FieldAccessContext)_localctx).id = match(Identifier);
				((FieldAccessContext)_localctx).ret =  new AccessExpression(((FieldAccessContext)_localctx).p.ret, ((FieldAccessContext)_localctx).id);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2970);
				((FieldAccessContext)_localctx).kw = match(SUPER);
				setState(2971);
				match(DOT);
				setState(2972);
				((FieldAccessContext)_localctx).id = match(Identifier);
				((FieldAccessContext)_localctx).ret =  new AccessExpression(new KeywordExpression(((FieldAccessContext)_localctx).kw), ((FieldAccessContext)_localctx).id);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2974);
				((FieldAccessContext)_localctx).t = typeName();
				setState(2975);
				match(DOT);
				setState(2976);
				((FieldAccessContext)_localctx).kw = match(SUPER);
				setState(2977);
				match(DOT);
				setState(2978);
				((FieldAccessContext)_localctx).id = match(Identifier);
				((FieldAccessContext)_localctx).ret =  new AccessExpression(((FieldAccessContext)_localctx).t.ret,
				                                     new AccessExpression(new KeywordExpression(((FieldAccessContext)_localctx).kw),
				                                                          ((FieldAccessContext)_localctx).id));
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
	}

	public final FieldAccess_lf_primaryContext fieldAccess_lf_primary() throws RecognitionException {
		FieldAccess_lf_primaryContext _localctx = new FieldAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_fieldAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2983);
			match(DOT);
			setState(2984);
			((FieldAccess_lf_primaryContext)_localctx).id = match(Identifier);
			((FieldAccess_lf_primaryContext)_localctx).ret =  new IdentifierExpression(((FieldAccess_lf_primaryContext)_localctx).id);
			}
		}
		catch (RecognitionException re) {
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
		public Token kw;
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
	}

	public final FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() throws RecognitionException {
		FieldAccess_lfno_primaryContext _localctx = new FieldAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_fieldAccess_lfno_primary);
		try {
			setState(2998);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2987);
				((FieldAccess_lfno_primaryContext)_localctx).kw = match(SUPER);
				setState(2988);
				match(DOT);
				setState(2989);
				((FieldAccess_lfno_primaryContext)_localctx).id = match(Identifier);
				((FieldAccess_lfno_primaryContext)_localctx).ret =  new AccessExpression(new KeywordExpression(((FieldAccess_lfno_primaryContext)_localctx).kw), ((FieldAccess_lfno_primaryContext)_localctx).id);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2991);
				((FieldAccess_lfno_primaryContext)_localctx).t = typeName();
				setState(2992);
				match(DOT);
				setState(2993);
				((FieldAccess_lfno_primaryContext)_localctx).kw = match(SUPER);
				setState(2994);
				match(DOT);
				setState(2995);
				((FieldAccess_lfno_primaryContext)_localctx).id = match(Identifier);

				            ((FieldAccess_lfno_primaryContext)_localctx).ret =  new AccessExpression(new KeywordExpression(((FieldAccess_lfno_primaryContext)_localctx).kw), ((FieldAccess_lfno_primaryContext)_localctx).id);
				            ((FieldAccess_lfno_primaryContext)_localctx).ret =  new AccessExpression(((FieldAccess_lfno_primaryContext)_localctx).t.ret, _localctx.ret);
				        
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
		public Token last;
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
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3012);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				{
				{
				setState(3000);
				((ArrayAccessContext)_localctx).n = expressionName();
				setState(3001);
				match(LBRACK);
				setState(3002);
				((ArrayAccessContext)_localctx).i = expression();
				setState(3003);
				((ArrayAccessContext)_localctx).last = match(RBRACK);
				((ArrayAccessContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccessContext)_localctx).last, ((ArrayAccessContext)_localctx).n.ret, ((ArrayAccessContext)_localctx).i.ret);
				}
				}
				break;
			case 2:
				{
				{
				setState(3006);
				((ArrayAccessContext)_localctx).pno = primaryNoNewArray_lfno_arrayAccess();
				setState(3007);
				match(LBRACK);
				setState(3008);
				((ArrayAccessContext)_localctx).i = expression();
				setState(3009);
				((ArrayAccessContext)_localctx).last = match(RBRACK);
				((ArrayAccessContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccessContext)_localctx).last, ((ArrayAccessContext)_localctx).pno.ret, ((ArrayAccessContext)_localctx).i.ret);
				}
				}
				break;
			}
			setState(3022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(3014);
				primaryNoNewArray_lf_arrayAccess();
				setState(3015);
				match(LBRACK);
				setState(3016);
				((ArrayAccessContext)_localctx).i = expression();
				setState(3017);
				((ArrayAccessContext)_localctx).last = match(RBRACK);
				((ArrayAccessContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccessContext)_localctx).last, _localctx.ret, ((ArrayAccessContext)_localctx).i.ret);
				}
				}
				setState(3024);
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
		public Token last;
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
	}

	public final ArrayAccess_lf_primaryContext arrayAccess_lf_primary() throws RecognitionException {
		ArrayAccess_lf_primaryContext _localctx = new ArrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_arrayAccess_lf_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(3025);
			((ArrayAccess_lf_primaryContext)_localctx).pno = primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(3026);
			match(LBRACK);
			setState(3027);
			((ArrayAccess_lf_primaryContext)_localctx).i = expression();
			setState(3028);
			((ArrayAccess_lf_primaryContext)_localctx).last = match(RBRACK);
			((ArrayAccess_lf_primaryContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccess_lf_primaryContext)_localctx).last, ((ArrayAccess_lf_primaryContext)_localctx).pno.ret, ((ArrayAccess_lf_primaryContext)_localctx).i.ret);
			                 ((ArrayAccess_lf_primaryContext)_localctx).isAccess =  ((ArrayAccess_lf_primaryContext)_localctx).pno.isAccess;
			}
			}
			setState(3039);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3031);
					primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
					setState(3032);
					match(LBRACK);
					setState(3033);
					((ArrayAccess_lf_primaryContext)_localctx).i2 = expression();
					setState(3034);
					((ArrayAccess_lf_primaryContext)_localctx).last = match(RBRACK);
					((ArrayAccess_lf_primaryContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccess_lf_primaryContext)_localctx).last, _localctx.ret, ((ArrayAccess_lf_primaryContext)_localctx).i2.ret);
					}
					} 
				}
				setState(3041);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
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
		public Token last;
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
	}

	public final ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() throws RecognitionException {
		ArrayAccess_lfno_primaryContext _localctx = new ArrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_arrayAccess_lfno_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3054);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				{
				setState(3042);
				((ArrayAccess_lfno_primaryContext)_localctx).name = expressionName();
				setState(3043);
				match(LBRACK);
				setState(3044);
				((ArrayAccess_lfno_primaryContext)_localctx).i = expression();
				setState(3045);
				((ArrayAccess_lfno_primaryContext)_localctx).last = match(RBRACK);
				((ArrayAccess_lfno_primaryContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccess_lfno_primaryContext)_localctx).last, ((ArrayAccess_lfno_primaryContext)_localctx).name.ret, ((ArrayAccess_lfno_primaryContext)_localctx).i.ret);
				}
				}
				break;
			case 2:
				{
				{
				setState(3048);
				((ArrayAccess_lfno_primaryContext)_localctx).pno = primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(3049);
				match(LBRACK);
				setState(3050);
				((ArrayAccess_lfno_primaryContext)_localctx).i = expression();
				setState(3051);
				((ArrayAccess_lfno_primaryContext)_localctx).last = match(RBRACK);
				((ArrayAccess_lfno_primaryContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccess_lfno_primaryContext)_localctx).last, ((ArrayAccess_lfno_primaryContext)_localctx).pno.ret, ((ArrayAccess_lfno_primaryContext)_localctx).i.ret);
				}
				}
				break;
			}
			setState(3064);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3056);
					primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(3057);
					match(LBRACK);
					setState(3058);
					((ArrayAccess_lfno_primaryContext)_localctx).i2 = expression();
					setState(3059);
					((ArrayAccess_lfno_primaryContext)_localctx).last = match(RBRACK);
					((ArrayAccess_lfno_primaryContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccess_lfno_primaryContext)_localctx).last, _localctx.ret, ((ArrayAccess_lfno_primaryContext)_localctx).i2.ret);
					}
					} 
				}
				setState(3066);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
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
		public List<Expression> args = new ArrayList<>();
		public List<TypeArgument> targs = new ArrayList<>();
		public Token mn;
		public ArgumentListContext a;
		public Token last;
		public TypeNameContext tn;
		public TypeArgumentsContext t;
		public Token id;
		public ExpressionNameContext en;
		public PrimaryContext p;
		public Token kw;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
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
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_methodInvocation);
		int _la;
		try {
			setState(3162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3067);
				((MethodInvocationContext)_localctx).mn = match(Identifier);
				setState(3068);
				match(LPAREN);
				setState(3072);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3069);
					((MethodInvocationContext)_localctx).a = argumentList();
					((MethodInvocationContext)_localctx).args =  ((MethodInvocationContext)_localctx).a.ret;
					}
				}

				setState(3074);
				((MethodInvocationContext)_localctx).last = match(RPAREN);
				((MethodInvocationContext)_localctx).ret =  new CallExpression(((MethodInvocationContext)_localctx).last, ((MethodInvocationContext)_localctx).mn, _localctx.args);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3076);
				((MethodInvocationContext)_localctx).tn = typeName();
				setState(3077);
				match(DOT);
				setState(3081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3078);
					((MethodInvocationContext)_localctx).t = typeArguments();
					((MethodInvocationContext)_localctx).targs =  ((MethodInvocationContext)_localctx).t.ret;
					}
				}

				setState(3083);
				((MethodInvocationContext)_localctx).id = match(Identifier);
				setState(3084);
				match(LPAREN);
				setState(3088);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3085);
					((MethodInvocationContext)_localctx).a = argumentList();
					((MethodInvocationContext)_localctx).args =  ((MethodInvocationContext)_localctx).a.ret;
					}
				}

				setState(3090);
				((MethodInvocationContext)_localctx).last = match(RPAREN);
				((MethodInvocationContext)_localctx).ret =  new CallExpression(((MethodInvocationContext)_localctx).last, ((MethodInvocationContext)_localctx).id, _localctx.args, _localctx.targs);
				         ((MethodInvocationContext)_localctx).ret =  new AccessExpression(((MethodInvocationContext)_localctx).tn.ret, _localctx.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3093);
				((MethodInvocationContext)_localctx).en = expressionName();
				setState(3094);
				match(DOT);
				setState(3098);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3095);
					((MethodInvocationContext)_localctx).t = typeArguments();
					((MethodInvocationContext)_localctx).targs =  ((MethodInvocationContext)_localctx).t.ret;
					}
				}

				setState(3100);
				((MethodInvocationContext)_localctx).id = match(Identifier);
				setState(3101);
				match(LPAREN);
				setState(3105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3102);
					((MethodInvocationContext)_localctx).a = argumentList();
					((MethodInvocationContext)_localctx).args =  ((MethodInvocationContext)_localctx).a.ret;
					}
				}

				setState(3107);
				((MethodInvocationContext)_localctx).last = match(RPAREN);
				((MethodInvocationContext)_localctx).ret =  new CallExpression(((MethodInvocationContext)_localctx).last, ((MethodInvocationContext)_localctx).id, _localctx.args, _localctx.targs);
				         ((MethodInvocationContext)_localctx).ret =  new AccessExpression(((MethodInvocationContext)_localctx).en.ret, _localctx.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3110);
				((MethodInvocationContext)_localctx).p = primary();
				setState(3111);
				match(DOT);
				setState(3115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3112);
					((MethodInvocationContext)_localctx).t = typeArguments();
					((MethodInvocationContext)_localctx).targs =  ((MethodInvocationContext)_localctx).t.ret;
					}
				}

				setState(3117);
				((MethodInvocationContext)_localctx).id = match(Identifier);
				setState(3118);
				match(LPAREN);
				setState(3122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3119);
					((MethodInvocationContext)_localctx).a = argumentList();
					((MethodInvocationContext)_localctx).args =  ((MethodInvocationContext)_localctx).a.ret;
					}
				}

				setState(3124);
				((MethodInvocationContext)_localctx).last = match(RPAREN);
				((MethodInvocationContext)_localctx).ret =  new CallExpression(((MethodInvocationContext)_localctx).last, ((MethodInvocationContext)_localctx).id, _localctx.args, _localctx.targs);
				         ((MethodInvocationContext)_localctx).ret =  new AccessExpression(((MethodInvocationContext)_localctx).p.ret, _localctx.ret);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3127);
				((MethodInvocationContext)_localctx).kw = match(SUPER);
				setState(3128);
				match(DOT);
				setState(3132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3129);
					((MethodInvocationContext)_localctx).t = typeArguments();
					((MethodInvocationContext)_localctx).targs =  ((MethodInvocationContext)_localctx).t.ret;
					}
				}

				setState(3134);
				((MethodInvocationContext)_localctx).id = match(Identifier);
				setState(3135);
				match(LPAREN);
				setState(3139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3136);
					((MethodInvocationContext)_localctx).a = argumentList();
					((MethodInvocationContext)_localctx).args =  ((MethodInvocationContext)_localctx).a.ret;
					}
				}

				setState(3141);
				((MethodInvocationContext)_localctx).last = match(RPAREN);
				((MethodInvocationContext)_localctx).ret =  new CallExpression(((MethodInvocationContext)_localctx).last, ((MethodInvocationContext)_localctx).id, _localctx.args, _localctx.targs);
				         ((MethodInvocationContext)_localctx).ret =  new AccessExpression(new KeywordExpression(((MethodInvocationContext)_localctx).kw), _localctx.ret);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3143);
				((MethodInvocationContext)_localctx).tn = typeName();
				setState(3144);
				match(DOT);
				setState(3145);
				((MethodInvocationContext)_localctx).kw = match(SUPER);
				setState(3146);
				match(DOT);
				setState(3150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3147);
					((MethodInvocationContext)_localctx).t = typeArguments();
					((MethodInvocationContext)_localctx).targs =  ((MethodInvocationContext)_localctx).t.ret;
					}
				}

				setState(3152);
				((MethodInvocationContext)_localctx).id = match(Identifier);
				setState(3153);
				match(LPAREN);
				setState(3157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3154);
					((MethodInvocationContext)_localctx).a = argumentList();
					((MethodInvocationContext)_localctx).args =  ((MethodInvocationContext)_localctx).a.ret;
					}
				}

				setState(3159);
				((MethodInvocationContext)_localctx).last = match(RPAREN);
				((MethodInvocationContext)_localctx).ret =  new CallExpression(((MethodInvocationContext)_localctx).last, ((MethodInvocationContext)_localctx).id, _localctx.args, _localctx.targs);
				         ((MethodInvocationContext)_localctx).ret =  new AccessExpression(new KeywordExpression(((MethodInvocationContext)_localctx).kw), _localctx.ret);
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
		public List<Expression> args = new ArrayList<>();
		public List<TypeArgument> targs = new ArrayList<>();
		public TypeArgumentsContext t;
		public Token id;
		public ArgumentListContext a;
		public Token last;
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
	}

	public final MethodInvocation_lf_primaryContext methodInvocation_lf_primary() throws RecognitionException {
		MethodInvocation_lf_primaryContext _localctx = new MethodInvocation_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_methodInvocation_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3164);
			match(DOT);
			setState(3168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(3165);
				((MethodInvocation_lf_primaryContext)_localctx).t = typeArguments();
				((MethodInvocation_lf_primaryContext)_localctx).targs =  ((MethodInvocation_lf_primaryContext)_localctx).t.ret;
				}
			}

			setState(3170);
			((MethodInvocation_lf_primaryContext)_localctx).id = match(Identifier);
			setState(3171);
			match(LPAREN);
			setState(3175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(3172);
				((MethodInvocation_lf_primaryContext)_localctx).a = argumentList();
				((MethodInvocation_lf_primaryContext)_localctx).args =  ((MethodInvocation_lf_primaryContext)_localctx).a.ret;
				}
			}

			setState(3177);
			((MethodInvocation_lf_primaryContext)_localctx).last = match(RPAREN);
			((MethodInvocation_lf_primaryContext)_localctx).ret =  new CallExpression(((MethodInvocation_lf_primaryContext)_localctx).last, ((MethodInvocation_lf_primaryContext)_localctx).id, _localctx.args, _localctx.targs);
			}
		}
		catch (RecognitionException re) {
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
		public List<Expression> args = new ArrayList<>();
		public List<TypeArgument> targs = new ArrayList<>();
		public Token mn;
		public ArgumentListContext a;
		public Token last;
		public TypeNameContext tn;
		public TypeArgumentsContext t;
		public Token id;
		public ExpressionNameContext en;
		public Token kw;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
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
	}

	public final MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() throws RecognitionException {
		MethodInvocation_lfno_primaryContext _localctx = new MethodInvocation_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_methodInvocation_lfno_primary);
		int _la;
		try {
			setState(3258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3180);
				((MethodInvocation_lfno_primaryContext)_localctx).mn = match(Identifier);
				setState(3181);
				match(LPAREN);
				setState(3185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3182);
					((MethodInvocation_lfno_primaryContext)_localctx).a = argumentList();
					((MethodInvocation_lfno_primaryContext)_localctx).args =  ((MethodInvocation_lfno_primaryContext)_localctx).a.ret;
					}
				}

				setState(3187);
				((MethodInvocation_lfno_primaryContext)_localctx).last = match(RPAREN);
				((MethodInvocation_lfno_primaryContext)_localctx).ret =  new CallExpression(((MethodInvocation_lfno_primaryContext)_localctx).last, ((MethodInvocation_lfno_primaryContext)_localctx).mn, _localctx.args);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3189);
				((MethodInvocation_lfno_primaryContext)_localctx).tn = typeName();
				setState(3190);
				match(DOT);
				setState(3194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3191);
					((MethodInvocation_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodInvocation_lfno_primaryContext)_localctx).targs =  ((MethodInvocation_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3196);
				((MethodInvocation_lfno_primaryContext)_localctx).id = match(Identifier);
				setState(3197);
				match(LPAREN);
				setState(3201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3198);
					((MethodInvocation_lfno_primaryContext)_localctx).a = argumentList();
					((MethodInvocation_lfno_primaryContext)_localctx).args =  ((MethodInvocation_lfno_primaryContext)_localctx).a.ret;
					}
				}

				setState(3203);
				((MethodInvocation_lfno_primaryContext)_localctx).last = match(RPAREN);
				((MethodInvocation_lfno_primaryContext)_localctx).ret =  new CallExpression(((MethodInvocation_lfno_primaryContext)_localctx).last, ((MethodInvocation_lfno_primaryContext)_localctx).id, _localctx.args, _localctx.targs);
				         ((MethodInvocation_lfno_primaryContext)_localctx).ret =  new AccessExpression(((MethodInvocation_lfno_primaryContext)_localctx).tn.ret, _localctx.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3206);
				((MethodInvocation_lfno_primaryContext)_localctx).en = expressionName();
				setState(3207);
				match(DOT);
				setState(3211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3208);
					((MethodInvocation_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodInvocation_lfno_primaryContext)_localctx).targs =  ((MethodInvocation_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3213);
				((MethodInvocation_lfno_primaryContext)_localctx).id = match(Identifier);
				setState(3214);
				match(LPAREN);
				setState(3218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3215);
					((MethodInvocation_lfno_primaryContext)_localctx).a = argumentList();
					((MethodInvocation_lfno_primaryContext)_localctx).args =  ((MethodInvocation_lfno_primaryContext)_localctx).a.ret;
					}
				}

				setState(3220);
				((MethodInvocation_lfno_primaryContext)_localctx).last = match(RPAREN);
				((MethodInvocation_lfno_primaryContext)_localctx).ret =  new CallExpression(((MethodInvocation_lfno_primaryContext)_localctx).last, ((MethodInvocation_lfno_primaryContext)_localctx).id, _localctx.args, _localctx.targs);
				         ((MethodInvocation_lfno_primaryContext)_localctx).ret =  new AccessExpression(((MethodInvocation_lfno_primaryContext)_localctx).en.ret, _localctx.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3223);
				((MethodInvocation_lfno_primaryContext)_localctx).kw = match(SUPER);
				setState(3224);
				match(DOT);
				setState(3228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3225);
					((MethodInvocation_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodInvocation_lfno_primaryContext)_localctx).targs =  ((MethodInvocation_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3230);
				((MethodInvocation_lfno_primaryContext)_localctx).id = match(Identifier);
				setState(3231);
				match(LPAREN);
				setState(3235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3232);
					((MethodInvocation_lfno_primaryContext)_localctx).a = argumentList();
					((MethodInvocation_lfno_primaryContext)_localctx).args =  ((MethodInvocation_lfno_primaryContext)_localctx).a.ret;
					}
				}

				setState(3237);
				((MethodInvocation_lfno_primaryContext)_localctx).last = match(RPAREN);
				((MethodInvocation_lfno_primaryContext)_localctx).ret =  new CallExpression(((MethodInvocation_lfno_primaryContext)_localctx).last, ((MethodInvocation_lfno_primaryContext)_localctx).id, _localctx.args, _localctx.targs);
				         ((MethodInvocation_lfno_primaryContext)_localctx).ret =  new AccessExpression(new KeywordExpression(((MethodInvocation_lfno_primaryContext)_localctx).kw), _localctx.ret);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3239);
				((MethodInvocation_lfno_primaryContext)_localctx).tn = typeName();
				setState(3240);
				match(DOT);
				setState(3241);
				((MethodInvocation_lfno_primaryContext)_localctx).kw = match(SUPER);
				setState(3242);
				match(DOT);
				setState(3246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3243);
					((MethodInvocation_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodInvocation_lfno_primaryContext)_localctx).targs =  ((MethodInvocation_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3248);
				((MethodInvocation_lfno_primaryContext)_localctx).id = match(Identifier);
				setState(3249);
				match(LPAREN);
				setState(3253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3250);
					((MethodInvocation_lfno_primaryContext)_localctx).a = argumentList();
					((MethodInvocation_lfno_primaryContext)_localctx).args =  ((MethodInvocation_lfno_primaryContext)_localctx).a.ret;
					}
				}

				setState(3255);
				((MethodInvocation_lfno_primaryContext)_localctx).last = match(RPAREN);
				((MethodInvocation_lfno_primaryContext)_localctx).ret =  new CallExpression(((MethodInvocation_lfno_primaryContext)_localctx).last, ((MethodInvocation_lfno_primaryContext)_localctx).id, _localctx.args, _localctx.targs);
				         ((MethodInvocation_lfno_primaryContext)_localctx).ret =  new AccessExpression(new KeywordExpression(((MethodInvocation_lfno_primaryContext)_localctx).kw), _localctx.ret);
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
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3260);
			((ArgumentListContext)_localctx).e = expression();
			_localctx.ls.add(((ArgumentListContext)_localctx).e.ret);
			}
			setState(3269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3263);
				match(COMMA);
				setState(3264);
				((ArgumentListContext)_localctx).ex = expression();
				_localctx.ls.add(((ArgumentListContext)_localctx).ex.ret);
				}
				}
				setState(3271);
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
		public Expression tmp;
		public List<TypeArgument> targs = new ArrayList<>();
		public ExpressionNameContext en;
		public TypeArgumentsContext t;
		public Token id;
		public ReferenceTypeContext r;
		public PrimaryContext p;
		public Token kw;
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
	}

	public final MethodReferenceContext methodReference() throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_methodReference);
		int _la;
		try {
			setState(3340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3274);
				((MethodReferenceContext)_localctx).en = expressionName();
				setState(3275);
				match(COLONCOLON);
				setState(3279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3276);
					((MethodReferenceContext)_localctx).t = typeArguments();
					((MethodReferenceContext)_localctx).targs =  ((MethodReferenceContext)_localctx).t.ret;
					}
				}

				setState(3281);
				((MethodReferenceContext)_localctx).id = match(Identifier);

				            ((MethodReferenceContext)_localctx).ret =  new IdentifierExpression(((MethodReferenceContext)_localctx).id);
				            if (_localctx.targs.size() > 0) {
				                ((MethodReferenceContext)_localctx).ret =  new TypeExpression(_localctx.ret, _localctx.targs);
				            }
				            ((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(((MethodReferenceContext)_localctx).en.ret, _localctx.ret);
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3284);
				((MethodReferenceContext)_localctx).r = referenceType();
				setState(3285);
				match(COLONCOLON);
				setState(3289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3286);
					((MethodReferenceContext)_localctx).t = typeArguments();
					((MethodReferenceContext)_localctx).targs =  ((MethodReferenceContext)_localctx).t.ret;
					}
				}

				setState(3291);
				((MethodReferenceContext)_localctx).id = match(Identifier);

				            ((MethodReferenceContext)_localctx).ret =  new IdentifierExpression(((MethodReferenceContext)_localctx).id);
				            if (_localctx.targs.size() > 0) {
				                ((MethodReferenceContext)_localctx).ret =  new TypeExpression(_localctx.ret, _localctx.targs);
				            }
				            ((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(((MethodReferenceContext)_localctx).r.ret, _localctx.ret);
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3294);
				((MethodReferenceContext)_localctx).p = primary();
				setState(3295);
				match(COLONCOLON);
				setState(3299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3296);
					((MethodReferenceContext)_localctx).t = typeArguments();
					((MethodReferenceContext)_localctx).targs =  ((MethodReferenceContext)_localctx).t.ret;
					}
				}

				setState(3301);
				((MethodReferenceContext)_localctx).id = match(Identifier);

				            ((MethodReferenceContext)_localctx).ret =  new IdentifierExpression(((MethodReferenceContext)_localctx).id);
				            if (_localctx.targs.size() > 0) {
				                ((MethodReferenceContext)_localctx).ret =  new TypeExpression(_localctx.ret, _localctx.targs);
				            }
				            ((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(((MethodReferenceContext)_localctx).p.ret, _localctx.ret);
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3304);
				((MethodReferenceContext)_localctx).kw = match(SUPER);
				setState(3305);
				match(COLONCOLON);
				setState(3309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3306);
					((MethodReferenceContext)_localctx).t = typeArguments();
					((MethodReferenceContext)_localctx).targs =  ((MethodReferenceContext)_localctx).t.ret;
					}
				}

				setState(3311);
				((MethodReferenceContext)_localctx).id = match(Identifier);

				            ((MethodReferenceContext)_localctx).ret =  new IdentifierExpression(((MethodReferenceContext)_localctx).id);
				            if (_localctx.targs.size() > 0) {
				                ((MethodReferenceContext)_localctx).ret =  new TypeExpression(_localctx.ret, _localctx.targs);
				            }
				            ((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(new KeywordExpression(((MethodReferenceContext)_localctx).kw),
				                                                 _localctx.ret);
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3313);
				((MethodReferenceContext)_localctx).tn = typeName();
				setState(3314);
				match(DOT);
				setState(3315);
				((MethodReferenceContext)_localctx).kw = match(SUPER);
				setState(3316);
				match(COLONCOLON);
				setState(3320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3317);
					((MethodReferenceContext)_localctx).t = typeArguments();
					((MethodReferenceContext)_localctx).targs =  ((MethodReferenceContext)_localctx).t.ret;
					}
				}

				setState(3322);
				((MethodReferenceContext)_localctx).id = match(Identifier);

				            ((MethodReferenceContext)_localctx).ret =  new IdentifierExpression(((MethodReferenceContext)_localctx).id);
				            if (_localctx.targs.size() > 0) {
				                ((MethodReferenceContext)_localctx).ret =  new TypeExpression(_localctx.ret, _localctx.targs);
				            }
				            ((MethodReferenceContext)_localctx).tmp =  new AccessExpression(((MethodReferenceContext)_localctx).tn.ret, new KeywordExpression(((MethodReferenceContext)_localctx).kw));
				            ((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(_localctx.tmp, _localctx.ret);
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3325);
				((MethodReferenceContext)_localctx).c = classType();
				setState(3326);
				match(COLONCOLON);
				setState(3330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3327);
					((MethodReferenceContext)_localctx).t = typeArguments();
					((MethodReferenceContext)_localctx).targs =  ((MethodReferenceContext)_localctx).t.ret;
					}
				}

				setState(3332);
				((MethodReferenceContext)_localctx).kw = match(NEW);

				            ((MethodReferenceContext)_localctx).ret =  new KeywordExpression(((MethodReferenceContext)_localctx).kw);
				            if (_localctx.targs.size() > 0) {
				                ((MethodReferenceContext)_localctx).ret =  new TypeExpression(_localctx.ret, _localctx.targs);
				            }
				            ((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(((MethodReferenceContext)_localctx).c.ret, _localctx.ret);
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3335);
				((MethodReferenceContext)_localctx).a = arrayType();
				setState(3336);
				match(COLONCOLON);
				setState(3337);
				((MethodReferenceContext)_localctx).kw = match(NEW);
				((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(((MethodReferenceContext)_localctx).a.ret,
				                                              new KeywordExpression(((MethodReferenceContext)_localctx).kw));
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
		public Expression ret;
		public List<TypeArgument> targs = new ArrayList<>();
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
	}

	public final MethodReference_lf_primaryContext methodReference_lf_primary() throws RecognitionException {
		MethodReference_lf_primaryContext _localctx = new MethodReference_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_methodReference_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3342);
			match(COLONCOLON);
			setState(3346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(3343);
				((MethodReference_lf_primaryContext)_localctx).t = typeArguments();
				((MethodReference_lf_primaryContext)_localctx).targs =  ((MethodReference_lf_primaryContext)_localctx).t.ret;
				}
			}

			setState(3348);
			((MethodReference_lf_primaryContext)_localctx).id = match(Identifier);

			            ((MethodReference_lf_primaryContext)_localctx).ret =  new IdentifierExpression(((MethodReference_lf_primaryContext)_localctx).id);
			            if (_localctx.targs.size() > 0) {
			                ((MethodReference_lf_primaryContext)_localctx).ret =  new TypeExpression(_localctx.ret, _localctx.targs);
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

	public static class MethodReference_lfno_primaryContext extends ParserRuleContext {
		public Expression ret;
		public Expression tmp;
		public List<TypeArgument> targs = new ArrayList<>();
		public ExpressionNameContext en;
		public TypeArgumentsContext t;
		public Token id;
		public ReferenceTypeContext r;
		public Token kw;
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
	}

	public final MethodReference_lfno_primaryContext methodReference_lfno_primary() throws RecognitionException {
		MethodReference_lfno_primaryContext _localctx = new MethodReference_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_methodReference_lfno_primary);
		int _la;
		try {
			setState(3407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3351);
				((MethodReference_lfno_primaryContext)_localctx).en = expressionName();
				setState(3352);
				match(COLONCOLON);
				setState(3356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3353);
					((MethodReference_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodReference_lfno_primaryContext)_localctx).targs =  ((MethodReference_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3358);
				((MethodReference_lfno_primaryContext)_localctx).id = match(Identifier);

				            ((MethodReference_lfno_primaryContext)_localctx).ret =  new IdentifierExpression(((MethodReference_lfno_primaryContext)_localctx).id);
				            if (_localctx.targs.size() > 0) {
				                ((MethodReference_lfno_primaryContext)_localctx).ret =  new TypeExpression(_localctx.ret, _localctx.targs);
				            }
				            ((MethodReference_lfno_primaryContext)_localctx).ret =  new MethodReferenceExpression(((MethodReference_lfno_primaryContext)_localctx).en.ret, _localctx.ret);
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3361);
				((MethodReference_lfno_primaryContext)_localctx).r = referenceType();
				setState(3362);
				match(COLONCOLON);
				setState(3366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3363);
					((MethodReference_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodReference_lfno_primaryContext)_localctx).targs =  ((MethodReference_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3368);
				((MethodReference_lfno_primaryContext)_localctx).id = match(Identifier);

				            ((MethodReference_lfno_primaryContext)_localctx).ret =  new IdentifierExpression(((MethodReference_lfno_primaryContext)_localctx).id);
				            if (_localctx.targs.size() > 0) {
				                ((MethodReference_lfno_primaryContext)_localctx).ret =  new TypeExpression(_localctx.ret, _localctx.targs);
				            }
				            ((MethodReference_lfno_primaryContext)_localctx).ret =  new MethodReferenceExpression(((MethodReference_lfno_primaryContext)_localctx).r.ret, _localctx.ret);
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3371);
				((MethodReference_lfno_primaryContext)_localctx).kw = match(SUPER);
				setState(3372);
				match(COLONCOLON);
				setState(3376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3373);
					((MethodReference_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodReference_lfno_primaryContext)_localctx).targs =  ((MethodReference_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3378);
				((MethodReference_lfno_primaryContext)_localctx).id = match(Identifier);

				            ((MethodReference_lfno_primaryContext)_localctx).ret =  new IdentifierExpression(((MethodReference_lfno_primaryContext)_localctx).id);
				            if (_localctx.targs.size() > 0) {
				                ((MethodReference_lfno_primaryContext)_localctx).ret =  new TypeExpression(_localctx.ret, _localctx.targs);
				            }
				            ((MethodReference_lfno_primaryContext)_localctx).ret =  new MethodReferenceExpression(new KeywordExpression(((MethodReference_lfno_primaryContext)_localctx).kw),
				                                                 _localctx.ret);
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3380);
				((MethodReference_lfno_primaryContext)_localctx).tn = typeName();
				setState(3381);
				match(DOT);
				setState(3382);
				((MethodReference_lfno_primaryContext)_localctx).kw = match(SUPER);
				setState(3383);
				match(COLONCOLON);
				setState(3387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3384);
					((MethodReference_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodReference_lfno_primaryContext)_localctx).targs =  ((MethodReference_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3389);
				((MethodReference_lfno_primaryContext)_localctx).id = match(Identifier);

				            ((MethodReference_lfno_primaryContext)_localctx).ret =  new IdentifierExpression(((MethodReference_lfno_primaryContext)_localctx).id);
				            if (_localctx.targs.size() > 0) {
				                ((MethodReference_lfno_primaryContext)_localctx).ret =  new TypeExpression(_localctx.ret, _localctx.targs);
				            }
				            ((MethodReference_lfno_primaryContext)_localctx).tmp =  new AccessExpression(((MethodReference_lfno_primaryContext)_localctx).tn.ret, new KeywordExpression(((MethodReference_lfno_primaryContext)_localctx).kw));
				            ((MethodReference_lfno_primaryContext)_localctx).ret =  new MethodReferenceExpression(_localctx.tmp, _localctx.ret);
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3392);
				((MethodReference_lfno_primaryContext)_localctx).c = classType();
				setState(3393);
				match(COLONCOLON);
				setState(3397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3394);
					((MethodReference_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodReference_lfno_primaryContext)_localctx).targs =  ((MethodReference_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3399);
				((MethodReference_lfno_primaryContext)_localctx).kw = match(NEW);

				            ((MethodReference_lfno_primaryContext)_localctx).ret =  new KeywordExpression(((MethodReference_lfno_primaryContext)_localctx).kw);
				            if (_localctx.targs.size() > 0) {
				                ((MethodReference_lfno_primaryContext)_localctx).ret =  new TypeExpression(_localctx.ret, _localctx.targs);
				            }
				            ((MethodReference_lfno_primaryContext)_localctx).ret =  new MethodReferenceExpression(((MethodReference_lfno_primaryContext)_localctx).c.ret, _localctx.ret);
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3402);
				((MethodReference_lfno_primaryContext)_localctx).a = arrayType();
				setState(3403);
				match(COLONCOLON);
				setState(3404);
				((MethodReference_lfno_primaryContext)_localctx).kw = match(NEW);
				((MethodReference_lfno_primaryContext)_localctx).ret =  new MethodReferenceExpression(((MethodReference_lfno_primaryContext)_localctx).a.ret,
				                                              new KeywordExpression(((MethodReference_lfno_primaryContext)_localctx).kw));
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
		public List<Dimension> ls = new ArrayList<>();
		public Token kw;
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
	}

	public final ArrayCreationExpressionContext arrayCreationExpression() throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_arrayCreationExpression);
		try {
			setState(3441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3409);
				((ArrayCreationExpressionContext)_localctx).kw = match(NEW);
				setState(3410);
				((ArrayCreationExpressionContext)_localctx).p = primitiveType();
				setState(3411);
				((ArrayCreationExpressionContext)_localctx).de = dimExprs();
				setState(3415);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
				case 1:
					{
					setState(3412);
					((ArrayCreationExpressionContext)_localctx).d = dims();
					((ArrayCreationExpressionContext)_localctx).ls =  ((ArrayCreationExpressionContext)_localctx).d.ret;
					}
					break;
				}
				((ArrayCreationExpressionContext)_localctx).ret =  new ArrayConstruction(((ArrayCreationExpressionContext)_localctx).kw, ((ArrayCreationExpressionContext)_localctx).p.ret, ((ArrayCreationExpressionContext)_localctx).de.ret, _localctx.ls);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3419);
				((ArrayCreationExpressionContext)_localctx).kw = match(NEW);
				setState(3420);
				((ArrayCreationExpressionContext)_localctx).c = classOrInterfaceType();
				setState(3421);
				((ArrayCreationExpressionContext)_localctx).de = dimExprs();
				setState(3425);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
				case 1:
					{
					setState(3422);
					((ArrayCreationExpressionContext)_localctx).d = dims();
					((ArrayCreationExpressionContext)_localctx).ls =  ((ArrayCreationExpressionContext)_localctx).d.ret;
					}
					break;
				}
				((ArrayCreationExpressionContext)_localctx).ret =  new ArrayConstruction(((ArrayCreationExpressionContext)_localctx).kw, ((ArrayCreationExpressionContext)_localctx).c.ret, ((ArrayCreationExpressionContext)_localctx).de.ret, _localctx.ls);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3429);
				((ArrayCreationExpressionContext)_localctx).kw = match(NEW);
				setState(3430);
				((ArrayCreationExpressionContext)_localctx).p = primitiveType();
				setState(3431);
				((ArrayCreationExpressionContext)_localctx).d = dims();
				setState(3432);
				((ArrayCreationExpressionContext)_localctx).i = arrayInitializer();
				((ArrayCreationExpressionContext)_localctx).ret =  new ArrayConstruction(((ArrayCreationExpressionContext)_localctx).kw, ((ArrayCreationExpressionContext)_localctx).p.ret, ((ArrayCreationExpressionContext)_localctx).d.ret, ((ArrayCreationExpressionContext)_localctx).i.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3435);
				((ArrayCreationExpressionContext)_localctx).kw = match(NEW);
				setState(3436);
				((ArrayCreationExpressionContext)_localctx).c = classOrInterfaceType();
				setState(3437);
				((ArrayCreationExpressionContext)_localctx).d = dims();
				setState(3438);
				((ArrayCreationExpressionContext)_localctx).i = arrayInitializer();
				((ArrayCreationExpressionContext)_localctx).ret =  new ArrayConstruction(((ArrayCreationExpressionContext)_localctx).kw, ((ArrayCreationExpressionContext)_localctx).c.ret, ((ArrayCreationExpressionContext)_localctx).d.ret, ((ArrayCreationExpressionContext)_localctx).i.ret);
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
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3443);
			((DimExprsContext)_localctx).d1 = dimExpr();
			((DimExprsContext)_localctx).ret =  new ArrayList<>(); _localctx.ret.add(((DimExprsContext)_localctx).d1.ret);
			setState(3450);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3445);
					((DimExprsContext)_localctx).d = dimExpr();
					_localctx.ret.add(((DimExprsContext)_localctx).d.ret);
					}
					} 
				}
				setState(3452);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
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
		public Token first;
		public ExpressionContext ex;
		public Token last;
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
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_dimExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(3453);
				((DimExprContext)_localctx).a = annotation();
				_localctx.ans.add(((DimExprContext)_localctx).a.ret);
				}
				}
				setState(3460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3461);
			((DimExprContext)_localctx).first = match(LBRACK);
			setState(3462);
			((DimExprContext)_localctx).ex = expression();
			setState(3463);
			((DimExprContext)_localctx).last = match(RBRACK);
			((DimExprContext)_localctx).ret =  new DimensionExpression(((DimExprContext)_localctx).first, ((DimExprContext)_localctx).last, _localctx.ans, ((DimExprContext)_localctx).ex.ret);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3466);
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_expression);
		try {
			setState(3475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3469);
				((ExpressionContext)_localctx).l = lambdaExpression();
				((ExpressionContext)_localctx).ret =  ((ExpressionContext)_localctx).l.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3472);
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
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3477);
			((LambdaExpressionContext)_localctx).p = lambdaParameters();
			setState(3478);
			match(ARROW);
			setState(3479);
			((LambdaExpressionContext)_localctx).b = lambdaBody();
			((LambdaExpressionContext)_localctx).ret =  new LambdaExpression(((LambdaExpressionContext)_localctx).p.first, ((LambdaExpressionContext)_localctx).p.ret, ((LambdaExpressionContext)_localctx).b.ret);
			}
		}
		catch (RecognitionException re) {
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
		public Token first;
		public List<VariableDeclaration> vars = new ArrayList<>();
		public Token id;
		public Token f;
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
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_lambdaParameters);
		int _la;
		try {
			setState(3497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3482);
				((LambdaParametersContext)_localctx).id = match(Identifier);

				            _localctx.vars.add(new VariableDeclaration(((LambdaParametersContext)_localctx).id));
				            ((LambdaParametersContext)_localctx).ret =  _localctx.vars;
				            ((LambdaParametersContext)_localctx).first =  ((LambdaParametersContext)_localctx).id;
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3484);
				((LambdaParametersContext)_localctx).f = match(LPAREN);
				setState(3488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
					{
					setState(3485);
					((LambdaParametersContext)_localctx).p = formalParameterList();
					((LambdaParametersContext)_localctx).ret =  ((LambdaParametersContext)_localctx).p.ret;
					}
				}

				setState(3490);
				match(RPAREN);
				((LambdaParametersContext)_localctx).first =  ((LambdaParametersContext)_localctx).f;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3492);
				((LambdaParametersContext)_localctx).f = match(LPAREN);
				setState(3493);
				((LambdaParametersContext)_localctx).i = inferredFormalParameterList();
				setState(3494);
				match(RPAREN);
				((LambdaParametersContext)_localctx).ret =  ((LambdaParametersContext)_localctx).i.ret; ((LambdaParametersContext)_localctx).first =  ((LambdaParametersContext)_localctx).f;
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
	}

	public final InferredFormalParameterListContext inferredFormalParameterList() throws RecognitionException {
		InferredFormalParameterListContext _localctx = new InferredFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3499);
			((InferredFormalParameterListContext)_localctx).id = match(Identifier);
			_localctx.vars.add(new VariableDeclaration(((InferredFormalParameterListContext)_localctx).id));
			}
			setState(3507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3502);
				match(COMMA);
				setState(3503);
				((InferredFormalParameterListContext)_localctx).i = match(Identifier);
				_localctx.vars.add(new VariableDeclaration(((InferredFormalParameterListContext)_localctx).i));
				}
				}
				setState(3509);
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
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_lambdaBody);
		try {
			setState(3518);
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
				setState(3512);
				((LambdaBodyContext)_localctx).e = expression();
				((LambdaBodyContext)_localctx).ret =  new Block(((LambdaBodyContext)_localctx).e.ret);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(3515);
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
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_assignmentExpression);
		try {
			setState(3526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3520);
				((AssignmentExpressionContext)_localctx).c = conditionalExpression();
				((AssignmentExpressionContext)_localctx).ret =  ((AssignmentExpressionContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3523);
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
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3528);
			((AssignmentContext)_localctx).l = leftHandSide();
			setState(3529);
			((AssignmentContext)_localctx).op = assignmentOperator();
			setState(3530);
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
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_leftHandSide);
		try {
			setState(3542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3533);
				((LeftHandSideContext)_localctx).n = expressionName();
				((LeftHandSideContext)_localctx).ret =  ((LeftHandSideContext)_localctx).n.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3536);
				((LeftHandSideContext)_localctx).f = fieldAccess();
				((LeftHandSideContext)_localctx).ret =  ((LeftHandSideContext)_localctx).f.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3539);
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
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_assignmentOperator);
		try {
			setState(3568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(3544);
				match(ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.EQUALS;
				}
				break;
			case MUL_ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(3546);
				match(MUL_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.MULTIPLICATION;
				}
				break;
			case DIV_ASSIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(3548);
				match(DIV_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.DIVISION;
				}
				break;
			case MOD_ASSIGN:
				enterOuterAlt(_localctx, 4);
				{
				setState(3550);
				match(MOD_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.MODULUS;
				}
				break;
			case ADD_ASSIGN:
				enterOuterAlt(_localctx, 5);
				{
				setState(3552);
				match(ADD_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.ADDITION;
				}
				break;
			case SUB_ASSIGN:
				enterOuterAlt(_localctx, 6);
				{
				setState(3554);
				match(SUB_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.SUBTRACTION;
				}
				break;
			case LSHIFT_ASSIGN:
				enterOuterAlt(_localctx, 7);
				{
				setState(3556);
				match(LSHIFT_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.LEFT_SHIFT;
				}
				break;
			case RSHIFT_ASSIGN:
				enterOuterAlt(_localctx, 8);
				{
				setState(3558);
				match(RSHIFT_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.RIGHT_SHIFT;
				}
				break;
			case URSHIFT_ASSIGN:
				enterOuterAlt(_localctx, 9);
				{
				setState(3560);
				match(URSHIFT_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.RIGHT_LOGICAL_SHIFT;
				}
				break;
			case AND_ASSIGN:
				enterOuterAlt(_localctx, 10);
				{
				setState(3562);
				match(AND_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.BITWISE_AND;
				}
				break;
			case XOR_ASSIGN:
				enterOuterAlt(_localctx, 11);
				{
				setState(3564);
				match(XOR_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  AssignmentOperator.BITWISE_XOR;
				}
				break;
			case OR_ASSIGN:
				enterOuterAlt(_localctx, 12);
				{
				setState(3566);
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
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_conditionalExpression);
		try {
			setState(3580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3570);
				((ConditionalExpressionContext)_localctx).c = conditionalOrExpression(0);
				((ConditionalExpressionContext)_localctx).ret =  ((ConditionalExpressionContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3573);
				((ConditionalExpressionContext)_localctx).c = conditionalOrExpression(0);
				setState(3574);
				match(QUESTION);
				setState(3575);
				((ConditionalExpressionContext)_localctx).i = expression();
				setState(3576);
				match(COLON);
				setState(3577);
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
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 412;
		enterRecursionRule(_localctx, 412, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3583);
			((ConditionalOrExpressionContext)_localctx).c = conditionalAndExpression(0);
			((ConditionalOrExpressionContext)_localctx).ret =  ((ConditionalOrExpressionContext)_localctx).c.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3593);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
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
					setState(3586);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3587);
					match(OR);
					setState(3588);
					((ConditionalOrExpressionContext)_localctx).c2 = conditionalAndExpression(0);
					((ConditionalOrExpressionContext)_localctx).ret =  new BinaryExpression(((ConditionalOrExpressionContext)_localctx).c1.ret, BinaryOperator.OR, ((ConditionalOrExpressionContext)_localctx).c2.ret);
					}
					} 
				}
				setState(3595);
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
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 414;
		enterRecursionRule(_localctx, 414, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3597);
			((ConditionalAndExpressionContext)_localctx).i = inclusiveOrExpression(0);
			((ConditionalAndExpressionContext)_localctx).ret =  ((ConditionalAndExpressionContext)_localctx).i.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3607);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
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
					setState(3600);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3601);
					match(AND);
					setState(3602);
					((ConditionalAndExpressionContext)_localctx).r = inclusiveOrExpression(0);
					((ConditionalAndExpressionContext)_localctx).ret =  new BinaryExpression(((ConditionalAndExpressionContext)_localctx).l.ret, BinaryOperator.AND, ((ConditionalAndExpressionContext)_localctx).r.ret);
					}
					} 
				}
				setState(3609);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
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
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 416;
		enterRecursionRule(_localctx, 416, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3611);
			((InclusiveOrExpressionContext)_localctx).ex = exclusiveOrExpression(0);
			((InclusiveOrExpressionContext)_localctx).ret =  ((InclusiveOrExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3621);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
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
					setState(3614);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3615);
					match(BITOR);
					setState(3616);
					((InclusiveOrExpressionContext)_localctx).r = exclusiveOrExpression(0);
					((InclusiveOrExpressionContext)_localctx).ret =  new BinaryExpression(((InclusiveOrExpressionContext)_localctx).l.ret,BinaryOperator.BITWISE_OR, ((InclusiveOrExpressionContext)_localctx).r.ret);
					}
					} 
				}
				setState(3623);
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
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 418;
		enterRecursionRule(_localctx, 418, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3625);
			((ExclusiveOrExpressionContext)_localctx).ex = andExpression(0);
			((ExclusiveOrExpressionContext)_localctx).ret =  ((ExclusiveOrExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3635);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
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
					setState(3628);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3629);
					match(CARET);
					setState(3630);
					((ExclusiveOrExpressionContext)_localctx).r = andExpression(0);
					((ExclusiveOrExpressionContext)_localctx).ret =  new BinaryExpression(((ExclusiveOrExpressionContext)_localctx).l.ret, BinaryOperator.BITWISE_XOR, ((ExclusiveOrExpressionContext)_localctx).r.ret);
					}
					} 
				}
				setState(3637);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
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
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 420;
		enterRecursionRule(_localctx, 420, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3639);
			((AndExpressionContext)_localctx).ex = equalityExpression(0);
			((AndExpressionContext)_localctx).ret =  ((AndExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3649);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
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
					setState(3642);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3643);
					match(BITAND);
					setState(3644);
					((AndExpressionContext)_localctx).r = equalityExpression(0);
					((AndExpressionContext)_localctx).ret =  new BinaryExpression(((AndExpressionContext)_localctx).l.ret, BinaryOperator.BITWISE_AND, ((AndExpressionContext)_localctx).r.ret);
					}
					} 
				}
				setState(3651);
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
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 422;
		enterRecursionRule(_localctx, 422, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3653);
			((EqualityExpressionContext)_localctx).ex = relationalExpression(0);
			((EqualityExpressionContext)_localctx).ret =  ((EqualityExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3668);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3666);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(3656);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3657);
						match(EQUAL);
						setState(3658);
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
						setState(3661);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3662);
						match(NOTEQUAL);
						setState(3663);
						((EqualityExpressionContext)_localctx).r = relationalExpression(0);
						((EqualityExpressionContext)_localctx).ret =  new BinaryExpression(((EqualityExpressionContext)_localctx).l.ret, BinaryOperator.INEQUALITY, ((EqualityExpressionContext)_localctx).r.ret);
						}
						break;
					}
					} 
				}
				setState(3670);
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
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 424;
		enterRecursionRule(_localctx, 424, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3672);
			((RelationalExpressionContext)_localctx).ex = shiftExpression(0);
			((RelationalExpressionContext)_localctx).ret =  ((RelationalExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3702);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3700);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(3675);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(3676);
						match(LT);
						setState(3677);
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
						setState(3680);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(3681);
						match(GT);
						setState(3682);
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
						setState(3685);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(3686);
						match(LE);
						setState(3687);
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
						setState(3690);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3691);
						match(GE);
						setState(3692);
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
						setState(3695);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3696);
						match(INSTANCEOF);
						setState(3697);
						((RelationalExpressionContext)_localctx).rt = referenceType();
						((RelationalExpressionContext)_localctx).ret =  new BinaryExpression(((RelationalExpressionContext)_localctx).l.ret, BinaryOperator.INSTANCE_OF, ((RelationalExpressionContext)_localctx).rt.ret);
						}
						break;
					}
					} 
				}
				setState(3704);
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
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 426;
		enterRecursionRule(_localctx, 426, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3706);
			((ShiftExpressionContext)_localctx).ex = additiveExpression(0);
			((ShiftExpressionContext)_localctx).ret =  ((ShiftExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3730);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3728);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(3709);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(3710);
						match(LT);
						setState(3711);
						match(LT);
						setState(3712);
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
						setState(3715);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3716);
						match(GT);
						setState(3717);
						match(GT);
						setState(3718);
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
						setState(3721);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3722);
						match(GT);
						setState(3723);
						match(GT);
						setState(3724);
						match(GT);
						setState(3725);
						((ShiftExpressionContext)_localctx).r = additiveExpression(0);
						((ShiftExpressionContext)_localctx).ret =  new BinaryExpression(((ShiftExpressionContext)_localctx).l.ret, BinaryOperator.RIGHT_LOGICAL_SHIFT, ((ShiftExpressionContext)_localctx).r.ret);
						}
						break;
					}
					} 
				}
				setState(3732);
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
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 428;
		enterRecursionRule(_localctx, 428, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3734);
			((AdditiveExpressionContext)_localctx).ex = multiplicativeExpression(0);
			((AdditiveExpressionContext)_localctx).ret =  ((AdditiveExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3749);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3747);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(3737);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3738);
						match(ADD);
						setState(3739);
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
						setState(3742);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3743);
						match(SUB);
						setState(3744);
						((AdditiveExpressionContext)_localctx).r = multiplicativeExpression(0);
						((AdditiveExpressionContext)_localctx).ret =  new BinaryExpression(((AdditiveExpressionContext)_localctx).l.ret, BinaryOperator.SUBTRACTION, ((AdditiveExpressionContext)_localctx).r.ret);
						}
						break;
					}
					} 
				}
				setState(3751);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
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
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 430;
		enterRecursionRule(_localctx, 430, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3753);
			((MultiplicativeExpressionContext)_localctx).ex = unaryExpression();
			((MultiplicativeExpressionContext)_localctx).ret =  ((MultiplicativeExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3773);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3771);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(3756);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(3757);
						match(MUL);
						setState(3758);
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
						setState(3761);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3762);
						match(DIV);
						setState(3763);
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
						setState(3766);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3767);
						match(MOD);
						setState(3768);
						((MultiplicativeExpressionContext)_localctx).r = unaryExpression();
						((MultiplicativeExpressionContext)_localctx).ret =  new BinaryExpression(((MultiplicativeExpressionContext)_localctx).l.ret, BinaryOperator.MODULUS, ((MultiplicativeExpressionContext)_localctx).r.ret);
						}
						break;
					}
					} 
				}
				setState(3775);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
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
		public Token first;
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
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_unaryExpression);
		try {
			setState(3793);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(3776);
				((UnaryExpressionContext)_localctx).pi = preIncrementExpression();
				((UnaryExpressionContext)_localctx).ret =  ((UnaryExpressionContext)_localctx).pi.ret;
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(3779);
				((UnaryExpressionContext)_localctx).pd = preDecrementExpression();
				((UnaryExpressionContext)_localctx).ret =  ((UnaryExpressionContext)_localctx).pd.ret;
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(3782);
				((UnaryExpressionContext)_localctx).first = match(ADD);
				setState(3783);
				((UnaryExpressionContext)_localctx).ex = unaryExpression();
				((UnaryExpressionContext)_localctx).ret =  new UnaryExpression(((UnaryExpressionContext)_localctx).first, ((UnaryExpressionContext)_localctx).ex.ret, UnaryOperator.PLUS);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(3786);
				((UnaryExpressionContext)_localctx).first = match(SUB);
				setState(3787);
				((UnaryExpressionContext)_localctx).ex = unaryExpression();
				((UnaryExpressionContext)_localctx).ret =  new UnaryExpression(((UnaryExpressionContext)_localctx).first, ((UnaryExpressionContext)_localctx).ex.ret, UnaryOperator.NEGATION);
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
				setState(3790);
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
		public Token first;
		public UnaryExpressionContext ex;
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementExpression; }
	}

	public final PreIncrementExpressionContext preIncrementExpression() throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3795);
			((PreIncrementExpressionContext)_localctx).first = match(INC);
			setState(3796);
			((PreIncrementExpressionContext)_localctx).ex = unaryExpression();
			((PreIncrementExpressionContext)_localctx).ret =  new UnaryExpression(((PreIncrementExpressionContext)_localctx).first, ((PreIncrementExpressionContext)_localctx).ex.ret,
			                                    UnaryOperator.PRE_INCREMENT);
			}
		}
		catch (RecognitionException re) {
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
		public Token first;
		public UnaryExpressionContext ex;
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementExpression; }
	}

	public final PreDecrementExpressionContext preDecrementExpression() throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3799);
			((PreDecrementExpressionContext)_localctx).first = match(DEC);
			setState(3800);
			((PreDecrementExpressionContext)_localctx).ex = unaryExpression();
			((PreDecrementExpressionContext)_localctx).ret =  new UnaryExpression(((PreDecrementExpressionContext)_localctx).first, ((PreDecrementExpressionContext)_localctx).ex.ret,
			                                    UnaryOperator.PRE_DECREMENT);
			}
		}
		catch (RecognitionException re) {
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
		public Token first;
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
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(3817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3803);
				((UnaryExpressionNotPlusMinusContext)_localctx).pf = postfixExpression();
				((UnaryExpressionNotPlusMinusContext)_localctx).ret =  ((UnaryExpressionNotPlusMinusContext)_localctx).pf.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3806);
				((UnaryExpressionNotPlusMinusContext)_localctx).first = match(TILDE);
				setState(3807);
				((UnaryExpressionNotPlusMinusContext)_localctx).ex = unaryExpression();
				((UnaryExpressionNotPlusMinusContext)_localctx).ret =  new UnaryExpression(((UnaryExpressionNotPlusMinusContext)_localctx).first,
				                                    ((UnaryExpressionNotPlusMinusContext)_localctx).ex.ret,
				                                    UnaryOperator.BITWISE_NEGATION);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3810);
				((UnaryExpressionNotPlusMinusContext)_localctx).first = match(BANG);
				setState(3811);
				((UnaryExpressionNotPlusMinusContext)_localctx).ex = unaryExpression();
				((UnaryExpressionNotPlusMinusContext)_localctx).ret =  new UnaryExpression(((UnaryExpressionNotPlusMinusContext)_localctx).first, ((UnaryExpressionNotPlusMinusContext)_localctx).ex.ret, UnaryOperator.NEGATION);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3814);
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
		public Token op1;
		public Token op2;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3825);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				{
				setState(3819);
				((PostfixExpressionContext)_localctx).p = primary();
				((PostfixExpressionContext)_localctx).ret =  ((PostfixExpressionContext)_localctx).p.ret;
				}
				break;
			case 2:
				{
				setState(3822);
				((PostfixExpressionContext)_localctx).n = expressionName();
				((PostfixExpressionContext)_localctx).ret =  ((PostfixExpressionContext)_localctx).n.ret;
				}
				break;
			}
			setState(3833);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(3831);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(3827);
						((PostfixExpressionContext)_localctx).op1 = match(INC);
						((PostfixExpressionContext)_localctx).ret =  new UnaryExpression(((PostfixExpressionContext)_localctx).op1, _localctx.ret, UnaryOperator.INCREMENT);
						}
						break;
					case DEC:
						{
						setState(3829);
						((PostfixExpressionContext)_localctx).op2 = match(DEC);
						((PostfixExpressionContext)_localctx).ret =  new UnaryExpression(((PostfixExpressionContext)_localctx).op2, _localctx.ret, UnaryOperator.DECREMENT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(3835);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
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
		public Token last;
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression; }
	}

	public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3836);
			((PostIncrementExpressionContext)_localctx).ex = postfixExpression();
			setState(3837);
			((PostIncrementExpressionContext)_localctx).last = match(INC);
			((PostIncrementExpressionContext)_localctx).ret =  new UnaryExpression(((PostIncrementExpressionContext)_localctx).last, ((PostIncrementExpressionContext)_localctx).ex.ret, UnaryOperator.INCREMENT);
			}
		}
		catch (RecognitionException re) {
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
		public Token last;
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression; }
	}

	public final PostDecrementExpressionContext postDecrementExpression() throws RecognitionException {
		PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3840);
			((PostDecrementExpressionContext)_localctx).ex = postfixExpression();
			setState(3841);
			((PostDecrementExpressionContext)_localctx).last = match(DEC);
			((PostDecrementExpressionContext)_localctx).ret =  new UnaryExpression(((PostDecrementExpressionContext)_localctx).last, ((PostDecrementExpressionContext)_localctx).ex.ret, UnaryOperator.DECREMENT);
			}
		}
		catch (RecognitionException re) {
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
		public List<Expression> ls = new ArrayList<>();
		public Token first;
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
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_castExpression);
		int _la;
		try {
			setState(3880);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3844);
				((CastExpressionContext)_localctx).first = match(LPAREN);
				setState(3845);
				((CastExpressionContext)_localctx).pt = primitiveType();
				setState(3846);
				match(RPAREN);
				setState(3847);
				((CastExpressionContext)_localctx).uex = unaryExpression();
				((CastExpressionContext)_localctx).ret =  new CastExpression(((CastExpressionContext)_localctx).first, ((CastExpressionContext)_localctx).uex.ret, ((CastExpressionContext)_localctx).pt.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3850);
				((CastExpressionContext)_localctx).first = match(LPAREN);
				setState(3851);
				((CastExpressionContext)_localctx).rt = referenceType();
				_localctx.ls.add(((CastExpressionContext)_localctx).rt.ret);
				setState(3858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(3853);
					((CastExpressionContext)_localctx).b = additionalBound();
					_localctx.ls.add(((CastExpressionContext)_localctx).b.ret);
					}
					}
					setState(3860);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3861);
				match(RPAREN);
				setState(3862);
				((CastExpressionContext)_localctx).npm = unaryExpressionNotPlusMinus();
				((CastExpressionContext)_localctx).ret =  new CastExpression(((CastExpressionContext)_localctx).first, ((CastExpressionContext)_localctx).npm.ret, _localctx.ls);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3865);
				((CastExpressionContext)_localctx).first = match(LPAREN);
				setState(3866);
				((CastExpressionContext)_localctx).rt = referenceType();
				_localctx.ls.add(((CastExpressionContext)_localctx).rt.ret);
				setState(3873);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(3868);
					((CastExpressionContext)_localctx).b = additionalBound();
					_localctx.ls.add(((CastExpressionContext)_localctx).b.ret);
					}
					}
					setState(3875);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3876);
				match(RPAREN);
				setState(3877);
				((CastExpressionContext)_localctx).lam = lambdaExpression();
				((CastExpressionContext)_localctx).ret =  new CastExpression(((CastExpressionContext)_localctx).first, ((CastExpressionContext)_localctx).lam.ret, _localctx.ls);
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
		case 23:
			return packageOrTypeName_sempred((PackageOrTypeNameContext)_localctx, predIndex);
		case 25:
			return ambiguousName_sempred((AmbiguousNameContext)_localctx, predIndex);
		case 206:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 207:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 208:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 209:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 210:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 211:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 212:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 213:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 214:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 215:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean packageOrTypeName_sempred(PackageOrTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ambiguousName_sempred(AmbiguousNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 3);
		case 15:
			return precpred(_ctx, 2);
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 2);
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 3);
		case 20:
			return precpred(_ctx, 2);
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3m\u0f2d\4\2\t\2\4"+
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
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\5\2\u01cf\n\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u01d7\n\3"+
		"\3\4\3\4\3\4\7\4\u01dc\n\4\f\4\16\4\u01df\13\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4\u01e7\n\4\f\4\16\4\u01ea\13\4\3\4\3\4\5\4\u01ee\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5\u01f6\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0202"+
		"\n\6\3\7\3\7\3\7\3\7\5\7\u0208\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u0213\n\b\3\t\3\t\3\t\3\t\3\t\7\t\u021a\n\t\f\t\16\t\u021d\13\t\3"+
		"\n\3\n\3\n\7\n\u0222\n\n\f\n\16\n\u0225\13\n\3\n\3\n\3\n\3\n\3\n\5\n\u022c"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\7\n\u0233\n\n\f\n\16\n\u0236\13\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u023d\n\n\3\n\3\n\5\n\u0241\n\n\3\13\3\13\3\13\7\13\u0246"+
		"\n\13\f\13\16\13\u0249\13\13\3\13\3\13\3\13\3\13\3\13\5\13\u0250\n\13"+
		"\3\f\3\f\3\f\7\f\u0255\n\f\f\f\16\f\u0258\13\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0269\n\r\3\16\3\16\3\16\7\16"+
		"\u026e\n\16\f\16\16\16\u0271\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u027a\n\16\f\16\16\16\u027d\13\16\3\16\3\16\3\16\7\16\u0282\n\16"+
		"\f\16\16\16\u0285\13\16\3\16\3\16\3\17\3\17\3\17\7\17\u028c\n\17\f\17"+
		"\16\17\u028f\13\17\3\17\3\17\3\17\3\17\5\17\u0295\n\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u02a6"+
		"\n\21\f\21\16\21\u02a9\13\21\3\21\3\21\5\21\u02ad\n\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u02be"+
		"\n\24\f\24\16\24\u02c1\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5"+
		"\25\u02cb\n\25\3\26\3\26\3\26\7\26\u02d0\n\26\f\26\16\26\u02d3\13\26\3"+
		"\26\3\26\3\26\5\26\u02d8\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u02e2\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u02eb\n\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u02f5\n\31\f\31\16\31\u02f8"+
		"\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0301\n\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\7\33\u030b\n\33\f\33\16\33\u030e\13\33\3"+
		"\34\3\34\3\34\5\34\u0313\n\34\3\34\3\34\3\34\7\34\u0318\n\34\f\34\16\34"+
		"\u031b\13\34\3\34\3\34\3\34\7\34\u0320\n\34\f\34\16\34\u0323\13\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\7\35\u032b\n\35\f\35\16\35\u032e\13\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0337\n\35\f\35\16\35\u033a\13\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u034e\n\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!"+
		"\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3"+
		"$\3$\3$\3$\5$\u0373\n$\3%\3%\3%\3%\3%\3%\5%\u037b\n%\3&\3&\3&\3&\3&\3"+
		"&\7&\u0383\n&\f&\16&\u0386\13&\3&\3&\3&\3&\3&\3&\5&\u038e\n&\3&\3&\3&"+
		"\5&\u0393\n&\3&\3&\3&\5&\u0398\n&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u03ab\n\'\3(\3(\3(\3(\3(\3)\3)\3)\3)"+
		"\3)\3)\3)\7)\u03b9\n)\f)\16)\u03bc\13)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3"+
		",\3,\3,\3,\3,\3,\3,\7,\u03cf\n,\f,\16,\u03d2\13,\3,\3,\3-\3-\7-\u03d8"+
		"\n-\f-\16-\u03db\13-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u03ea\n"+
		".\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u03f7\n/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\7\60\u03ff\n\60\f\60\16\60\u0402\13\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\5\61\u0417\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0420\n\62\f"+
		"\62\16\62\u0423\13\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u042d"+
		"\n\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\5\64\u0436\n\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0444\n\66\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\5\67\u044c\n\67\38\38\38\38\38\58\u0453\n8\39\39"+
		"\39\39\39\39\39\39\39\59\u045e\n9\3:\3:\3:\3:\3:\3:\3:\7:\u0467\n:\f:"+
		"\16:\u046a\13:\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0474\n;\3<\3<\3<\3<\3<\5<\u047b"+
		"\n<\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u048c\n>\3?\3?\3?"+
		"\3?\3?\3?\7?\u0494\n?\f?\16?\u0497\13?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u04b1\n@\3A\3A\3A\3A\3A\3"+
		"A\5A\u04b9\nA\3A\3A\3A\3A\3A\7A\u04c0\nA\fA\16A\u04c3\13A\3A\3A\3A\3A"+
		"\3A\3A\3A\5A\u04cc\nA\5A\u04ce\nA\3B\3B\3B\3B\3B\5B\u04d5\nB\3C\3C\3C"+
		"\3C\3C\3C\5C\u04dd\nC\3C\3C\3C\3C\5C\u04e3\nC\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\3D\3D\3D\3D\3D\3D\5D\u04f3\nD\3E\3E\3E\3E\3E\3E\3E\7E\u04fc\nE\fE\16"+
		"E\u04ff\13E\3E\3E\3E\3E\3E\3E\3E\3E\3E\7E\u050a\nE\fE\16E\u050d\13E\3"+
		"E\3E\5E\u0511\nE\3F\3F\3F\3F\3F\3F\7F\u0519\nF\fF\16F\u051c\13F\3F\3F"+
		"\3F\3F\3G\3G\3G\3H\3H\3H\3H\3H\3H\7H\u052b\nH\fH\16H\u052e\13H\3H\3H\3"+
		"H\3H\7H\u0534\nH\fH\16H\u0537\13H\3H\3H\3H\3H\3H\3H\3H\5H\u0540\nH\3I"+
		"\3I\3I\7I\u0545\nI\fI\16I\u0548\13I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3K\3"+
		"K\3K\3K\3K\3K\3K\7K\u055b\nK\fK\16K\u055e\13K\3K\3K\3L\3L\3L\3L\3L\3L"+
		"\5L\u0568\nL\3M\3M\3M\3M\3M\5M\u056f\nM\3N\3N\3N\3O\3O\3O\3O\3P\3P\3P"+
		"\3P\3P\3P\7P\u057e\nP\fP\16P\u0581\13P\3P\3P\3P\3P\3P\3P\5P\u0589\nP\3"+
		"P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u0594\nQ\3R\3R\3R\5R\u0599\nR\3R\3R\3R\3"+
		"R\3R\3R\5R\u05a1\nR\3R\3R\3S\3S\3S\3S\3S\5S\u05aa\nS\3S\3S\3S\5S\u05af"+
		"\nS\3S\3S\3S\3T\3T\3T\5T\u05b7\nT\3T\3T\3T\3T\3T\5T\u05be\nT\3T\3T\3T"+
		"\3T\3T\3T\5T\u05c6\nT\3T\3T\3T\3T\3T\5T\u05cd\nT\3T\3T\3T\3T\3T\3T\3T"+
		"\3T\5T\u05d7\nT\3T\3T\3T\3T\3T\5T\u05de\nT\3T\3T\3T\3T\3T\3T\3T\3T\3T"+
		"\5T\u05e9\nT\3T\3T\3T\3T\3T\5T\u05f0\nT\3T\3T\3T\3T\5T\u05f6\nT\3U\3U"+
		"\3U\3U\3U\3U\7U\u05fe\nU\fU\16U\u0601\13U\3U\3U\3U\3U\3U\5U\u0608\nU\3"+
		"U\3U\3U\3V\3V\5V\u060f\nV\3V\5V\u0612\nV\3V\5V\u0615\nV\3V\3V\3V\3W\3"+
		"W\3W\7W\u061d\nW\fW\16W\u0620\13W\3X\3X\3X\7X\u0625\nX\fX\16X\u0628\13"+
		"X\3X\3X\3X\3X\3X\5X\u062f\nX\3X\5X\u0632\nX\3X\3X\5X\u0636\nX\3Y\3Y\7"+
		"Y\u063a\nY\fY\16Y\u063d\13Y\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0645\nZ\3[\3[\3[\3["+
		"\3[\3[\7[\u064d\n[\f[\16[\u0650\13[\3[\3[\3[\3[\3[\3[\5[\u0658\n[\3[\3"+
		"[\3[\5[\u065d\n[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\5\\\u066e\n\\\3]\3]\3]\3]\3^\3^\7^\u0676\n^\f^\16^\u0679\13^\3^\3"+
		"^\3^\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u0689\n_\3`\3`\3`\3`\3`\3`\7"+
		"`\u0691\n`\f`\16`\u0694\13`\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a\5a\u06a1"+
		"\na\3b\3b\3b\3b\3b\3b\7b\u06a9\nb\fb\16b\u06ac\13b\3b\3b\3b\3b\3b\3b\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u06be\nc\3d\3d\3d\3d\3d\3d\7d\u06c6\n"+
		"d\fd\16d\u06c9\13d\3d\3d\3d\3d\3d\3d\3e\3e\7e\u06d3\ne\fe\16e\u06d6\13"+
		"e\3e\3e\3e\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u06e6\nf\3g\3g\3g\3g\3"+
		"g\3g\7g\u06ee\ng\fg\16g\u06f1\13g\3g\3g\3g\3g\3g\3g\3g\3g\5g\u06fb\ng"+
		"\3g\3g\3g\5g\u0700\ng\3g\3g\3g\3h\3h\3h\3h\5h\u0709\nh\3i\3i\3i\3i\3j"+
		"\3j\3j\3j\3j\3j\3j\3j\3j\5j\u0718\nj\3k\3k\3k\3k\3k\5k\u071f\nk\3k\3k"+
		"\3k\3l\3l\3l\7l\u0727\nl\fl\16l\u072a\13l\3m\3m\3m\3m\3m\3n\3n\3n\3n\3"+
		"n\3n\3n\3n\3n\5n\u073a\nn\3o\3o\3o\3o\5o\u0740\no\3o\5o\u0743\no\3o\3"+
		"o\3o\3p\3p\3p\3p\3p\3p\3p\7p\u074f\np\fp\16p\u0752\13p\3p\3p\3q\3q\3q"+
		"\3q\3r\3r\3r\3r\3r\3r\3r\3s\3s\3s\3s\5s\u0765\ns\3s\5s\u0768\ns\3s\3s"+
		"\3s\3t\3t\3t\3t\3t\3t\3t\7t\u0774\nt\ft\16t\u0777\13t\3t\3t\3u\3u\3u\3"+
		"u\3u\5u\u0780\nu\3u\3u\3u\3v\3v\3v\3v\3v\3v\7v\u078b\nv\fv\16v\u078e\13"+
		"v\3v\3v\3w\3w\3w\3w\3w\3w\3w\3w\3w\5w\u079b\nw\3x\3x\3x\3x\3y\3y\3y\3"+
		"y\3y\3y\7y\u07a7\ny\fy\16y\u07aa\13y\3y\3y\3y\3y\3z\3z\3z\3z\3z\3z\3z"+
		"\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\5z\u07c2\nz\3{\3{\3{\3{\3{\3{\3{\3{"+
		"\3{\3{\3{\3{\3{\3{\3{\5{\u07d3\n{\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|"+
		"\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|"+
		"\3|\5|\u07f9\n|\3}\3}\3}\3~\3~\3~\3~\3~\3\177\3\177\3\177\3\177\3\177"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u0821"+
		"\n\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\5\u0085\u0848\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087\7\u0087\u0855"+
		"\n\u0087\f\u0087\16\u0087\u0858\13\u0087\3\u0087\3\u0087\3\u0087\7\u0087"+
		"\u085d\n\u0087\f\u0087\16\u0087\u0860\13\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\7\u0089\u0870\n\u0089\f\u0089\16\u0089\u0873\13\u0089"+
		"\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u0883\n\u008a\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\5\u008e\u08a2\n\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\5\u008f\u08aa\n\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\5\u0090\u08b1\n\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u08b7\n"+
		"\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u08bd\n\u0090\3\u0090\3"+
		"\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091"+
		"\u08c8\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u08ce\n\u0091\3"+
		"\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u08d4\n\u0091\3\u0091\3\u0091\3"+
		"\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092"+
		"\u08e0\n\u0092\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\7\u0094\u08ec\n\u0094\f\u0094\16\u0094\u08ef"+
		"\13\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\7\u0095\u08fb\n\u0095\f\u0095\16\u0095\u08fe\13\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\7\u0096\u090f\n\u0096"+
		"\f\u0096\16\u0096\u0912\13\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\5\u0097\u091e\n\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\5\u0098\u0926\n\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\5\u0099\u0933\n\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c"+
		"\u094b\n\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c"+
		"\u0953\n\u009c\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\7\u009d\u095a\n"+
		"\u009d\f\u009d\16\u009d\u095d\13\u009d\3\u009d\3\u009d\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\7\u009f\u096f\n\u009f\f\u009f\16\u009f\u0972"+
		"\13\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\7\u00a0\u097f\n\u00a0\f\u00a0\16\u00a0\u0982"+
		"\13\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\5\u00a2\u098e\n\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2"+
		"\u0993\n\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\5\u00a3\u099d\n\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4"+
		"\3\u00a4\3\u00a4\3\u00a4\7\u00a4\u09a7\n\u00a4\f\u00a4\16\u00a4\u09aa"+
		"\13\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\7\u00a5\u09b4\n\u00a5\f\u00a5\16\u00a5\u09b7\13\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\5\u00a6\u09c4\n\u00a6\3\u00a6\3\u00a6\3\u00a6\7\u00a6\u09c9\n\u00a6\f"+
		"\u00a6\16\u00a6\u09cc\13\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u09ea\n\u00a7\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\7\u00a8\u09f0\n\u00a8\f\u00a8\16\u00a8\u09f3"+
		"\13\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\7\u00a8\u09fe\n\u00a8\f\u00a8\16\u00a8\u0a01\13\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u0a10\n\u00a8\3\u00a9\3\u00a9\3\u00aa"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u0a2d\n\u00aa"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u0a3e\n\u00ab"+
		"\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u0a4e\n\u00ad\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\7\u00ae\u0a5a\n\u00ae\f\u00ae\16\u00ae\u0a5d\13\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u0a79\n\u00ae"+
		"\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b0\7\u00b0\u0a87\n\u00b0\f\u00b0\16\u00b0\u0a8a"+
		"\13\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0aa3\n\u00b0"+
		"\3\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u0aa9\n\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b1\7\u00b1\u0aae\n\u00b1\f\u00b1\16\u00b1\u0ab1\13\u00b1\3\u00b1"+
		"\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\7\u00b1\u0ab9\n\u00b1\f\u00b1"+
		"\16\u00b1\u0abc\13\u00b1\3\u00b1\3\u00b1\7\u00b1\u0ac0\n\u00b1\f\u00b1"+
		"\16\u00b1\u0ac3\13\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u0ac8\n\u00b1"+
		"\3\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u0ace\n\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b1\5\u00b1\u0ad3\n\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b1\5\u00b1\u0adb\n\u00b1\3\u00b1\3\u00b1\3\u00b1\7\u00b1\u0ae0\n"+
		"\u00b1\f\u00b1\16\u00b1\u0ae3\13\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b1\5\u00b1\u0aea\n\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1"+
		"\u0af0\n\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u0af5\n\u00b1\3\u00b1\3"+
		"\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u0afd\n\u00b1\3\u00b1\3"+
		"\u00b1\3\u00b1\7\u00b1\u0b02\n\u00b1\f\u00b1\16\u00b1\u0b05\13\u00b1\3"+
		"\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u0b0c\n\u00b1\3\u00b1\3"+
		"\u00b1\3\u00b1\3\u00b1\5\u00b1\u0b12\n\u00b1\3\u00b1\3\u00b1\3\u00b1\5"+
		"\u00b1\u0b17\n\u00b1\5\u00b1\u0b19\n\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\5\u00b2\u0b20\n\u00b2\3\u00b2\3\u00b2\3\u00b2\7\u00b2\u0b25\n"+
		"\u00b2\f\u00b2\16\u00b2\u0b28\13\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\5\u00b2\u0b2f\n\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2"+
		"\u0b35\n\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u0b3a\n\u00b2\3\u00b3\3"+
		"\u00b3\3\u00b3\3\u00b3\5\u00b3\u0b40\n\u00b3\3\u00b3\3\u00b3\3\u00b3\7"+
		"\u00b3\u0b45\n\u00b3\f\u00b3\16\u00b3\u0b48\13\u00b3\3\u00b3\3\u00b3\3"+
		"\u00b3\3\u00b3\3\u00b3\3\u00b3\7\u00b3\u0b50\n\u00b3\f\u00b3\16\u00b3"+
		"\u0b53\13\u00b3\3\u00b3\3\u00b3\7\u00b3\u0b57\n\u00b3\f\u00b3\16\u00b3"+
		"\u0b5a\13\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u0b5f\n\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u0b65\n\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\5\u00b3\u0b6a\n\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\5\u00b3\u0b72\n\u00b3\3\u00b3\3\u00b3\3\u00b3\7\u00b3\u0b77\n\u00b3\f"+
		"\u00b3\16\u00b3\u0b7a\13\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\5\u00b3\u0b81\n\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u0b87\n"+
		"\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u0b8c\n\u00b3\5\u00b3\u0b8e\n\u00b3"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u0b96\n\u00b4"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u0ba8"+
		"\n\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0bb9"+
		"\n\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u0bc7\n\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\7\u00b8\u0bcf\n\u00b8\f\u00b8\16\u00b8"+
		"\u0bd2\13\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\7\u00b9\u0be0\n\u00b9\f\u00b9"+
		"\16\u00b9\u0be3\13\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0bf1\n\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\7\u00ba\u0bf9\n\u00ba"+
		"\f\u00ba\16\u00ba\u0bfc\13\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\5\u00bb\u0c03\n\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\5\u00bb\u0c0c\n\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\5\u00bb\u0c13\n\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\5\u00bb\u0c1d\n\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\5\u00bb\u0c24\n\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u0c2e\n\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\5\u00bb\u0c35\n\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u0c3f\n\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u0c46\n\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u0c51\n\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u0c58\n\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\5\u00bb\u0c5d\n\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\5\u00bc\u0c63\n\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc"+
		"\u0c6a\n\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\5\u00bd\u0c74\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\5\u00bd\u0c7d\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\5\u00bd\u0c84\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0c8e\n\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\5\u00bd\u0c95\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0c9f\n\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0ca6\n\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0cb1\n\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0cb8\n\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\5\u00bd\u0cbd\n\u00bd\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\7\u00be\u0cc6\n\u00be\f\u00be\16\u00be\u0cc9"+
		"\13\u00be\3\u00be\3\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf"+
		"\u0cd2\n\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\3\u00bf\5\u00bf\u0cdc\n\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u0ce6\n\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u0cf0\n\u00bf\3\u00bf"+
		"\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf"+
		"\u0cfb\n\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\3\u00bf\5\u00bf\u0d05\n\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u0d0f\n\u00bf\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\5\u00c0\u0d15\n\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u0d1f\n\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u0d29\n\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u0d33"+
		"\n\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\5\u00c1\u0d3e\n\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u0d48\n\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u0d52\n\u00c1\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0d5a\n\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0d64"+
		"\n\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0d74\n\u00c2"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\7\u00c3\u0d7b\n\u00c3\f\u00c3"+
		"\16\u00c3\u0d7e\13\u00c3\3\u00c4\3\u00c4\3\u00c4\7\u00c4\u0d83\n\u00c4"+
		"\f\u00c4\16\u00c4\u0d86\13\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\5\u00c6\u0d96\n\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0da3\n\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0dac\n\u00c8"+
		"\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\7\u00c9\u0db4\n\u00c9"+
		"\f\u00c9\16\u00c9\u0db7\13\u00c9\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u0dc1\n\u00ca\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u0dc9\n\u00cb\3\u00cc\3\u00cc\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\5\u00cd\u0dd9\n\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\5\u00ce\u0df3\n\u00ce\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u0dff\n\u00cf"+
		"\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\7\u00d0\u0e0a\n\u00d0\f\u00d0\16\u00d0\u0e0d\13\u00d0\3\u00d1\3\u00d1"+
		"\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\7\u00d1\u0e18"+
		"\n\u00d1\f\u00d1\16\u00d1\u0e1b\13\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\7\u00d2\u0e26\n\u00d2\f\u00d2"+
		"\16\u00d2\u0e29\13\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3"+
		"\3\u00d3\3\u00d3\3\u00d3\7\u00d3\u0e34\n\u00d3\f\u00d3\16\u00d3\u0e37"+
		"\13\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\7\u00d4\u0e42\n\u00d4\f\u00d4\16\u00d4\u0e45\13\u00d4\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d5\7\u00d5\u0e55\n\u00d5\f\u00d5\16\u00d5"+
		"\u0e58\13\u00d5\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\7\u00d6\u0e77\n\u00d6\f\u00d6\16\u00d6"+
		"\u0e7a\13\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7"+
		"\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7"+
		"\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\7\u00d7\u0e93"+
		"\n\u00d7\f\u00d7\16\u00d7\u0e96\13\u00d7\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\7\u00d8\u0ea6\n\u00d8\f\u00d8\16\u00d8\u0ea9\13\u00d8\3\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\7\u00d9\u0ebe\n\u00d9\f\u00d9\16\u00d9\u0ec1\13\u00d9\3\u00da\3\u00da"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\5\u00da\u0ed4\n\u00da"+
		"\3\u00db\3\u00db\3\u00db\3\u00db\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u0eec\n\u00dd\3\u00de\3\u00de"+
		"\3\u00de\3\u00de\3\u00de\3\u00de\5\u00de\u0ef4\n\u00de\3\u00de\3\u00de"+
		"\3\u00de\3\u00de\7\u00de\u0efa\n\u00de\f\u00de\16\u00de\u0efd\13\u00de"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\7\u00e1\u0f13\n\u00e1\f\u00e1\16\u00e1\u0f16\13\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\7\u00e1\u0f22\n\u00e1\f\u00e1\16\u00e1\u0f25\13\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\5\u00e1\u0f2b\n\u00e1\3\u00e1\2\16\60\64\u019e"+
		"\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u00e2\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120"+
		"\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138"+
		"\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150"+
		"\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168"+
		"\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180"+
		"\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198"+
		"\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0"+
		"\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\2\2\u1034\2\u01ce\3\2"+
		"\2\2\4\u01d6\3\2\2\2\6\u01ed\3\2\2\2\b\u01f5\3\2\2\2\n\u0201\3\2\2\2\f"+
		"\u0207\3\2\2\2\16\u0212\3\2\2\2\20\u0214\3\2\2\2\22\u0240\3\2\2\2\24\u0247"+
		"\3\2\2\2\26\u0256\3\2\2\2\30\u0268\3\2\2\2\32\u026f\3\2\2\2\34\u028d\3"+
		"\2\2\2\36\u0298\3\2\2\2 \u02ac\3\2\2\2\"\u02ae\3\2\2\2$\u02b2\3\2\2\2"+
		"&\u02b7\3\2\2\2(\u02ca\3\2\2\2*\u02d1\3\2\2\2,\u02e1\3\2\2\2.\u02ea\3"+
		"\2\2\2\60\u02ec\3\2\2\2\62\u0300\3\2\2\2\64\u0302\3\2\2\2\66\u0312\3\2"+
		"\2\28\u032c\3\2\2\2:\u033e\3\2\2\2<\u034d\3\2\2\2>\u034f\3\2\2\2@\u0354"+
		"\3\2\2\2B\u035b\3\2\2\2D\u0363\3\2\2\2F\u0372\3\2\2\2H\u037a\3\2\2\2J"+
		"\u0384\3\2\2\2L\u03aa\3\2\2\2N\u03ac\3\2\2\2P\u03b1\3\2\2\2R\u03bf\3\2"+
		"\2\2T\u03c3\3\2\2\2V\u03c7\3\2\2\2X\u03d5\3\2\2\2Z\u03e9\3\2\2\2\\\u03f6"+
		"\3\2\2\2^\u0400\3\2\2\2`\u0416\3\2\2\2b\u0418\3\2\2\2d\u0426\3\2\2\2f"+
		"\u0430\3\2\2\2h\u0439\3\2\2\2j\u0443\3\2\2\2l\u044b\3\2\2\2n\u0452\3\2"+
		"\2\2p\u045d\3\2\2\2r\u045f\3\2\2\2t\u0473\3\2\2\2v\u0475\3\2\2\2x\u047c"+
		"\3\2\2\2z\u048b\3\2\2\2|\u0495\3\2\2\2~\u04b0\3\2\2\2\u0080\u04cd\3\2"+
		"\2\2\u0082\u04d4\3\2\2\2\u0084\u04d6\3\2\2\2\u0086\u04f2\3\2\2\2\u0088"+
		"\u0510\3\2\2\2\u008a\u051a\3\2\2\2\u008c\u0521\3\2\2\2\u008e\u053f\3\2"+
		"\2\2\u0090\u0546\3\2\2\2\u0092\u054f\3\2\2\2\u0094\u0553\3\2\2\2\u0096"+
		"\u0567\3\2\2\2\u0098\u056e\3\2\2\2\u009a\u0570\3\2\2\2\u009c\u0573\3\2"+
		"\2\2\u009e\u057f\3\2\2\2\u00a0\u0593\3\2\2\2\u00a2\u0598\3\2\2\2\u00a4"+
		"\u05a4\3\2\2\2\u00a6\u05f5\3\2\2\2\u00a8\u05ff\3\2\2\2\u00aa\u060c\3\2"+
		"\2\2\u00ac\u0619\3\2\2\2\u00ae\u0626\3\2\2\2\u00b0\u0637\3\2\2\2\u00b2"+
		"\u0644\3\2\2\2\u00b4\u064e\3\2\2\2\u00b6\u066d\3\2\2\2\u00b8\u066f\3\2"+
		"\2\2\u00ba\u0673\3\2\2\2\u00bc\u0688\3\2\2\2\u00be\u0692\3\2\2\2\u00c0"+
		"\u06a0\3\2\2\2\u00c2\u06aa\3\2\2\2\u00c4\u06bd\3\2\2\2\u00c6\u06c7\3\2"+
		"\2\2\u00c8\u06d0\3\2\2\2\u00ca\u06e5\3\2\2\2\u00cc\u06ef\3\2\2\2\u00ce"+
		"\u0708\3\2\2\2\u00d0\u070a\3\2\2\2\u00d2\u0717\3\2\2\2\u00d4\u0719\3\2"+
		"\2\2\u00d6\u0723\3\2\2\2\u00d8\u072b\3\2\2\2\u00da\u0739\3\2\2\2\u00dc"+
		"\u073b\3\2\2\2\u00de\u0747\3\2\2\2\u00e0\u0755\3\2\2\2\u00e2\u0759\3\2"+
		"\2\2\u00e4\u0760\3\2\2\2\u00e6\u076c\3\2\2\2\u00e8\u077a\3\2\2\2\u00ea"+
		"\u0784\3\2\2\2\u00ec\u079a\3\2\2\2\u00ee\u079c\3\2\2\2\u00f0\u07a8\3\2"+
		"\2\2\u00f2\u07c1\3\2\2\2\u00f4\u07d2\3\2\2\2\u00f6\u07f8\3\2\2\2\u00f8"+
		"\u07fa\3\2\2\2\u00fa\u07fd\3\2\2\2\u00fc\u0802\3\2\2\2\u00fe\u0807\3\2"+
		"\2\2\u0100\u0820\3\2\2\2\u0102\u0822\3\2\2\2\u0104\u0829\3\2\2\2\u0106"+
		"\u0832\3\2\2\2\u0108\u0847\3\2\2\2\u010a\u0849\3\2\2\2\u010c\u0850\3\2"+
		"\2\2\u010e\u0865\3\2\2\2\u0110\u0869\3\2\2\2\u0112\u0882\3\2\2\2\u0114"+
		"\u0884\3\2\2\2\u0116\u088b\3\2\2\2\u0118\u0892\3\2\2\2\u011a\u08a1\3\2"+
		"\2\2\u011c\u08a9\3\2\2\2\u011e\u08ab\3\2\2\2\u0120\u08c2\3\2\2\2\u0122"+
		"\u08df\3\2\2\2\u0124\u08e1\3\2\2\2\u0126\u08e4\3\2\2\2\u0128\u08f2\3\2"+
		"\2\2\u012a\u0906\3\2\2\2\u012c\u091a\3\2\2\2\u012e\u0922\3\2\2\2\u0130"+
		"\u0932\3\2\2\2\u0132\u0934\3\2\2\2\u0134\u0939\3\2\2\2\u0136\u0952\3\2"+
		"\2\2\u0138\u0954\3\2\2\2\u013a\u0960\3\2\2\2\u013c\u0970\3\2\2\2\u013e"+
		"\u0977\3\2\2\2\u0140\u0983\3\2\2\2\u0142\u0987\3\2\2\2\u0144\u0996\3\2"+
		"\2\2\u0146\u09a0\3\2\2\2\u0148\u09b5\3\2\2\2\u014a\u09c3\3\2\2\2\u014c"+
		"\u09e9\3\2\2\2\u014e\u0a0f\3\2\2\2\u0150\u0a11\3\2\2\2\u0152\u0a2c\3\2"+
		"\2\2\u0154\u0a3d\3\2\2\2\u0156\u0a3f\3\2\2\2\u0158\u0a4d\3\2\2\2\u015a"+
		"\u0a78\3\2\2\2\u015c\u0a7a\3\2\2\2\u015e\u0aa2\3\2\2\2\u0160\u0b18\3\2"+
		"\2\2\u0162\u0b1a\3\2\2\2\u0164\u0b8d\3\2\2\2\u0166\u0b95\3\2\2\2\u0168"+
		"\u0ba7\3\2\2\2\u016a\u0ba9\3\2\2\2\u016c\u0bb8\3\2\2\2\u016e\u0bc6\3\2"+
		"\2\2\u0170\u0bd3\3\2\2\2\u0172\u0bf0\3\2\2\2\u0174\u0c5c\3\2\2\2\u0176"+
		"\u0c5e\3\2\2\2\u0178\u0cbc\3\2\2\2\u017a\u0cbe\3\2\2\2\u017c\u0d0e\3\2"+
		"\2\2\u017e\u0d10\3\2\2\2\u0180\u0d51\3\2\2\2\u0182\u0d73\3\2\2\2\u0184"+
		"\u0d75\3\2\2\2\u0186\u0d84\3\2\2\2\u0188\u0d8c\3\2\2\2\u018a\u0d95\3\2"+
		"\2\2\u018c\u0d97\3\2\2\2\u018e\u0dab\3\2\2\2\u0190\u0dad\3\2\2\2\u0192"+
		"\u0dc0\3\2\2\2\u0194\u0dc8\3\2\2\2\u0196\u0dca\3\2\2\2\u0198\u0dd8\3\2"+
		"\2\2\u019a\u0df2\3\2\2\2\u019c\u0dfe\3\2\2\2\u019e\u0e00\3\2\2\2\u01a0"+
		"\u0e0e\3\2\2\2\u01a2\u0e1c\3\2\2\2\u01a4\u0e2a\3\2\2\2\u01a6\u0e38\3\2"+
		"\2\2\u01a8\u0e46\3\2\2\2\u01aa\u0e59\3\2\2\2\u01ac\u0e7b\3\2\2\2\u01ae"+
		"\u0e97\3\2\2\2\u01b0\u0eaa\3\2\2\2\u01b2\u0ed3\3\2\2\2\u01b4\u0ed5\3\2"+
		"\2\2\u01b6\u0ed9\3\2\2\2\u01b8\u0eeb\3\2\2\2\u01ba\u0ef3\3\2\2\2\u01bc"+
		"\u0efe\3\2\2\2\u01be\u0f02\3\2\2\2\u01c0\u0f2a\3\2\2\2\u01c2\u01c3\7\65"+
		"\2\2\u01c3\u01cf\b\2\1\2\u01c4\u01c5\7\66\2\2\u01c5\u01cf\b\2\1\2\u01c6"+
		"\u01c7\7\67\2\2\u01c7\u01cf\b\2\1\2\u01c8\u01c9\78\2\2\u01c9\u01cf\b\2"+
		"\1\2\u01ca\u01cb\79\2\2\u01cb\u01cf\b\2\1\2\u01cc\u01cd\7:\2\2\u01cd\u01cf"+
		"\b\2\1\2\u01ce\u01c2\3\2\2\2\u01ce\u01c4\3\2\2\2\u01ce\u01c6\3\2\2\2\u01ce"+
		"\u01c8\3\2\2\2\u01ce\u01ca\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\3\3\2\2\2"+
		"\u01d0\u01d1\5\6\4\2\u01d1\u01d2\b\3\1\2\u01d2\u01d7\3\2\2\2\u01d3\u01d4"+
		"\5\16\b\2\u01d4\u01d5\b\3\1\2\u01d5\u01d7\3\2\2\2\u01d6\u01d0\3\2\2\2"+
		"\u01d6\u01d3\3\2\2\2\u01d7\5\3\2\2\2\u01d8\u01d9\5\u00d2j\2\u01d9\u01da"+
		"\b\4\1\2\u01da\u01dc\3\2\2\2\u01db\u01d8\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd"+
		"\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01dd\3\2"+
		"\2\2\u01e0\u01e1\5\b\5\2\u01e1\u01e2\b\4\1\2\u01e2\u01ee\3\2\2\2\u01e3"+
		"\u01e4\5\u00d2j\2\u01e4\u01e5\b\4\1\2\u01e5\u01e7\3\2\2\2\u01e6\u01e3"+
		"\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u01eb\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ec\7\5\2\2\u01ec\u01ee\b\4"+
		"\1\2\u01ed\u01dd\3\2\2\2\u01ed\u01e8\3\2\2\2\u01ee\7\3\2\2\2\u01ef\u01f0"+
		"\5\n\6\2\u01f0\u01f1\b\5\1\2\u01f1\u01f6\3\2\2\2\u01f2\u01f3\5\f\7\2\u01f3"+
		"\u01f4\b\5\1\2\u01f4\u01f6\3\2\2\2\u01f5\u01ef\3\2\2\2\u01f5\u01f2\3\2"+
		"\2\2\u01f6\t\3\2\2\2\u01f7\u01f8\7\7\2\2\u01f8\u0202\b\6\1\2\u01f9\u01fa"+
		"\7\'\2\2\u01fa\u0202\b\6\1\2\u01fb\u01fc\7\35\2\2\u01fc\u0202\b\6\1\2"+
		"\u01fd\u01fe\7\37\2\2\u01fe\u0202\b\6\1\2\u01ff\u0200\7\n\2\2\u0200\u0202"+
		"\b\6\1\2\u0201\u01f7\3\2\2\2\u0201\u01f9\3\2\2\2\u0201\u01fb\3\2\2\2\u0201"+
		"\u01fd\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\13\3\2\2\2\u0203\u0204\7\26\2"+
		"\2\u0204\u0208\b\7\1\2\u0205\u0206\7\20\2\2\u0206\u0208\b\7\1\2\u0207"+
		"\u0203\3\2\2\2\u0207\u0205\3\2\2\2\u0208\r\3\2\2\2\u0209\u020a\5\20\t"+
		"\2\u020a\u020b\b\b\1\2\u020b\u0213\3\2\2\2\u020c\u020d\5\26\f\2\u020d"+
		"\u020e\b\b\1\2\u020e\u0213\3\2\2\2\u020f\u0210\5\30\r\2\u0210\u0211\b"+
		"\b\1\2\u0211\u0213\3\2\2\2\u0212\u0209\3\2\2\2\u0212\u020c\3\2\2\2\u0212"+
		"\u020f\3\2\2\2\u0213\17\3\2\2\2\u0214\u0215\5\24\13\2\u0215\u021b\b\t"+
		"\1\2\u0216\u0217\5\24\13\2\u0217\u0218\b\t\1\2\u0218\u021a\3\2\2\2\u0219"+
		"\u0216\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2"+
		"\2\2\u021c\21\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u021f\5\u00d2j\2\u021f"+
		"\u0220\b\n\1\2\u0220\u0222\3\2\2\2\u0221\u021e\3\2\2\2\u0222\u0225\3\2"+
		"\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0226\3\2\2\2\u0225"+
		"\u0223\3\2\2\2\u0226\u0227\7h\2\2\u0227\u022b\b\n\1\2\u0228\u0229\5$\23"+
		"\2\u0229\u022a\b\n\1\2\u022a\u022c\3\2\2\2\u022b\u0228\3\2\2\2\u022b\u022c"+
		"\3\2\2\2\u022c\u0241\3\2\2\2\u022d\u022e\5\20\t\2\u022e\u0234\7C\2\2\u022f"+
		"\u0230\5\u00d2j\2\u0230\u0231\b\n\1\2\u0231\u0233\3\2\2\2\u0232\u022f"+
		"\3\2\2\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235"+
		"\u0237\3\2\2\2\u0236\u0234\3\2\2\2\u0237\u0238\7h\2\2\u0238\u023c\b\n"+
		"\1\2\u0239\u023a\5$\23\2\u023a\u023b\b\n\1\2\u023b\u023d\3\2\2\2\u023c"+
		"\u0239\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\b\n"+
		"\1\2\u023f\u0241\3\2\2\2\u0240\u0223\3\2\2\2\u0240\u022d\3\2\2\2\u0241"+
		"\23\3\2\2\2\u0242\u0243\5\u00d2j\2\u0243\u0244\b\13\1\2\u0244\u0246\3"+
		"\2\2\2\u0245\u0242\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u024a\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u024b\7h"+
		"\2\2\u024b\u024f\b\13\1\2\u024c\u024d\5$\23\2\u024d\u024e\b\13\1\2\u024e"+
		"\u0250\3\2\2\2\u024f\u024c\3\2\2\2\u024f\u0250\3\2\2\2\u0250\25\3\2\2"+
		"\2\u0251\u0252\5\u00d2j\2\u0252\u0253\b\f\1\2\u0253\u0255\3\2\2\2\u0254"+
		"\u0251\3\2\2\2\u0255\u0258\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2"+
		"\2\2\u0257\u0259\3\2\2\2\u0258\u0256\3\2\2\2\u0259\u025a\7h\2\2\u025a"+
		"\u025b\b\f\1\2\u025b\27\3\2\2\2\u025c\u025d\5\6\4\2\u025d\u025e\5\32\16"+
		"\2\u025e\u025f\b\r\1\2\u025f\u0269\3\2\2\2\u0260\u0261\5\20\t\2\u0261"+
		"\u0262\5\32\16\2\u0262\u0263\b\r\1\2\u0263\u0269\3\2\2\2\u0264\u0265\5"+
		"\26\f\2\u0265\u0266\5\32\16\2\u0266\u0267\b\r\1\2\u0267\u0269\3\2\2\2"+
		"\u0268\u025c\3\2\2\2\u0268\u0260\3\2\2\2\u0268\u0264\3\2\2\2\u0269\31"+
		"\3\2\2\2\u026a\u026b\5\u00d2j\2\u026b\u026c\b\16\1\2\u026c\u026e\3\2\2"+
		"\2\u026d\u026a\3\2\2\2\u026e\u0271\3\2\2\2\u026f\u026d\3\2\2\2\u026f\u0270"+
		"\3\2\2\2\u0270\u0272\3\2\2\2\u0271\u026f\3\2\2\2\u0272\u0273\7?\2\2\u0273"+
		"\u0274\7@\2\2\u0274\u0283\b\16\1\2\u0275\u027b\b\16\1\2\u0276\u0277\5"+
		"\u00d2j\2\u0277\u0278\b\16\1\2\u0278\u027a\3\2\2\2\u0279\u0276\3\2\2\2"+
		"\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027e"+
		"\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u027f\7?\2\2\u027f\u0280\7@\2\2\u0280"+
		"\u0282\b\16\1\2\u0281\u0275\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3"+
		"\2\2\2\u0283\u0284\3\2\2\2\u0284\u0286\3\2\2\2\u0285\u0283\3\2\2\2\u0286"+
		"\u0287\b\16\1\2\u0287\33\3\2\2\2\u0288\u0289\5\36\20\2\u0289\u028a\b\17"+
		"\1\2\u028a\u028c\3\2\2\2\u028b\u0288\3\2\2\2\u028c\u028f\3\2\2\2\u028d"+
		"\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0290\3\2\2\2\u028f\u028d\3\2"+
		"\2\2\u0290\u0294\7h\2\2\u0291\u0292\5 \21\2\u0292\u0293\b\17\1\2\u0293"+
		"\u0295\3\2\2\2\u0294\u0291\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\3\2"+
		"\2\2\u0296\u0297\b\17\1\2\u0297\35\3\2\2\2\u0298\u0299\5\u00d2j\2\u0299"+
		"\u029a\b\20\1\2\u029a\37\3\2\2\2\u029b\u029c\7\23\2\2\u029c\u029d\5\26"+
		"\f\2\u029d\u029e\b\21\1\2\u029e\u02ad\3\2\2\2\u029f\u02a0\7\23\2\2\u02a0"+
		"\u02a1\5\20\t\2\u02a1\u02a7\b\21\1\2\u02a2\u02a3\5\"\22\2\u02a3\u02a4"+
		"\b\21\1\2\u02a4\u02a6\3\2\2\2\u02a5\u02a2\3\2\2\2\u02a6\u02a9\3\2\2\2"+
		"\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02aa\3\2\2\2\u02a9\u02a7"+
		"\3\2\2\2\u02aa\u02ab\b\21\1\2\u02ab\u02ad\3\2\2\2\u02ac\u029b\3\2\2\2"+
		"\u02ac\u029f\3\2\2\2\u02ad!\3\2\2\2\u02ae\u02af\7W\2\2\u02af\u02b0\5\22"+
		"\n\2\u02b0\u02b1\b\22\1\2\u02b1#\3\2\2\2\u02b2\u02b3\7F\2\2\u02b3\u02b4"+
		"\5&\24\2\u02b4\u02b5\7E\2\2\u02b5\u02b6\b\23\1\2\u02b6%\3\2\2\2\u02b7"+
		"\u02b8\5(\25\2\u02b8\u02bf\b\24\1\2\u02b9\u02ba\7B\2\2\u02ba\u02bb\5("+
		"\25\2\u02bb\u02bc\b\24\1\2\u02bc\u02be\3\2\2\2\u02bd\u02b9\3\2\2\2\u02be"+
		"\u02c1\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c2\3\2"+
		"\2\2\u02c1\u02bf\3\2\2\2\u02c2\u02c3\b\24\1\2\u02c3\'\3\2\2\2\u02c4\u02c5"+
		"\5\16\b\2\u02c5\u02c6\b\25\1\2\u02c6\u02cb\3\2\2\2\u02c7\u02c8\5*\26\2"+
		"\u02c8\u02c9\b\25\1\2\u02c9\u02cb\3\2\2\2\u02ca\u02c4\3\2\2\2\u02ca\u02c7"+
		"\3\2\2\2\u02cb)\3\2\2\2\u02cc\u02cd\5\u00d2j\2\u02cd\u02ce\b\26\1\2\u02ce"+
		"\u02d0\3\2\2\2\u02cf\u02cc\3\2\2\2\u02d0\u02d3\3\2\2\2\u02d1\u02cf\3\2"+
		"\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d4\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d4"+
		"\u02d5\7I\2\2\u02d5\u02d7\b\26\1\2\u02d6\u02d8\5,\27\2\u02d7\u02d6\3\2"+
		"\2\2\u02d7\u02d8\3\2\2\2\u02d8+\3\2\2\2\u02d9\u02da\7\23\2\2\u02da\u02db"+
		"\5\16\b\2\u02db\u02dc\b\27\1\2\u02dc\u02e2\3\2\2\2\u02dd\u02de\7*\2\2"+
		"\u02de\u02df\5\16\b\2\u02df\u02e0\b\27\1\2\u02e0\u02e2\3\2\2\2\u02e1\u02d9"+
		"\3\2\2\2\u02e1\u02dd\3\2\2\2\u02e2-\3\2\2\2\u02e3\u02e4\7h\2\2\u02e4\u02eb"+
		"\b\30\1\2\u02e5\u02e6\5\60\31\2\u02e6\u02e7\7C\2\2\u02e7\u02e8\7h\2\2"+
		"\u02e8\u02e9\b\30\1\2\u02e9\u02eb\3\2\2\2\u02ea\u02e3\3\2\2\2\u02ea\u02e5"+
		"\3\2\2\2\u02eb/\3\2\2\2\u02ec\u02ed\b\31\1\2\u02ed\u02ee\7h\2\2\u02ee"+
		"\u02ef\b\31\1\2\u02ef\u02f6\3\2\2\2\u02f0\u02f1\f\3\2\2\u02f1\u02f2\7"+
		"C\2\2\u02f2\u02f3\7h\2\2\u02f3\u02f5\b\31\1\2\u02f4\u02f0\3\2\2\2\u02f5"+
		"\u02f8\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\61\3\2\2"+
		"\2\u02f8\u02f6\3\2\2\2\u02f9\u02fa\7h\2\2\u02fa\u0301\b\32\1\2\u02fb\u02fc"+
		"\5\64\33\2\u02fc\u02fd\7C\2\2\u02fd\u02fe\7h\2\2\u02fe\u02ff\b\32\1\2"+
		"\u02ff\u0301\3\2\2\2\u0300\u02f9\3\2\2\2\u0300\u02fb\3\2\2\2\u0301\63"+
		"\3\2\2\2\u0302\u0303\b\33\1\2\u0303\u0304\7h\2\2\u0304\u0305\b\33\1\2"+
		"\u0305\u030c\3\2\2\2\u0306\u0307\f\3\2\2\u0307\u0308\7C\2\2\u0308\u0309"+
		"\7h\2\2\u0309\u030b\b\33\1\2\u030a\u0306\3\2\2\2\u030b\u030e\3\2\2\2\u030c"+
		"\u030a\3\2\2\2\u030c\u030d\3\2\2\2\u030d\65\3\2\2\2\u030e\u030c\3\2\2"+
		"\2\u030f\u0310\58\35\2\u0310\u0311\b\34\1\2\u0311\u0313\3\2\2\2\u0312"+
		"\u030f\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0319\3\2\2\2\u0314\u0315\5<"+
		"\37\2\u0315\u0316\b\34\1\2\u0316\u0318\3\2\2\2\u0317\u0314\3\2\2\2\u0318"+
		"\u031b\3\2\2\2\u0319\u0317\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u0321\3\2"+
		"\2\2\u031b\u0319\3\2\2\2\u031c\u031d\5F$\2\u031d\u031e\b\34\1\2\u031e"+
		"\u0320\3\2\2\2\u031f\u031c\3\2\2\2\u0320\u0323\3\2\2\2\u0321\u031f\3\2"+
		"\2\2\u0321\u0322\3\2\2\2\u0322\u0324\3\2\2\2\u0323\u0321\3\2\2\2\u0324"+
		"\u0325\7\2\2\3\u0325\u0326\b\34\1\2\u0326\67\3\2\2\2\u0327\u0328\5:\36"+
		"\2\u0328\u0329\b\35\1\2\u0329\u032b\3\2\2\2\u032a\u0327\3\2\2\2\u032b"+
		"\u032e\3\2\2\2\u032c\u032a\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032f\3\2"+
		"\2\2\u032e\u032c\3\2\2\2\u032f\u0330\7\"\2\2\u0330\u0331\7h\2\2\u0331"+
		"\u0332\b\35\1\2\u0332\u0338\3\2\2\2\u0333\u0334\7C\2\2\u0334\u0335\7h"+
		"\2\2\u0335\u0337\b\35\1\2\u0336\u0333\3\2\2\2\u0337\u033a\3\2\2\2\u0338"+
		"\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033b\3\2\2\2\u033a\u0338\3\2"+
		"\2\2\u033b\u033c\7A\2\2\u033c\u033d\b\35\1\2\u033d9\3\2\2\2\u033e\u033f"+
		"\5\u00d2j\2\u033f\u0340\b\36\1\2\u0340;\3\2\2\2\u0341\u0342\5> \2\u0342"+
		"\u0343\b\37\1\2\u0343\u034e\3\2\2\2\u0344\u0345\5@!\2\u0345\u0346\b\37"+
		"\1\2\u0346\u034e\3\2\2\2\u0347\u0348\5B\"\2\u0348\u0349\b\37\1\2\u0349"+
		"\u034e\3\2\2\2\u034a\u034b\5D#\2\u034b\u034c\b\37\1\2\u034c\u034e\3\2"+
		"\2\2\u034d\u0341\3\2\2\2\u034d\u0344\3\2\2\2\u034d\u0347\3\2\2\2\u034d"+
		"\u034a\3\2\2\2\u034e=\3\2\2\2\u034f\u0350\7\33\2\2\u0350\u0351\5.\30\2"+
		"\u0351\u0352\7A\2\2\u0352\u0353\b \1\2\u0353?\3\2\2\2\u0354\u0355\7\33"+
		"\2\2\u0355\u0356\5\60\31\2\u0356\u0357\7C\2\2\u0357\u0358\7U\2\2\u0358"+
		"\u0359\7A\2\2\u0359\u035a\b!\1\2\u035aA\3\2\2\2\u035b\u035c\7\33\2\2\u035c"+
		"\u035d\7(\2\2\u035d\u035e\5.\30\2\u035e\u035f\7C\2\2\u035f\u0360\7h\2"+
		"\2\u0360\u0361\7A\2\2\u0361\u0362\b\"\1\2\u0362C\3\2\2\2\u0363\u0364\7"+
		"\33\2\2\u0364\u0365\7(\2\2\u0365\u0366\5.\30\2\u0366\u0367\7C\2\2\u0367"+
		"\u0368\7U\2\2\u0368\u0369\7A\2\2\u0369\u036a\b#\1\2\u036aE\3\2\2\2\u036b"+
		"\u036c\5H%\2\u036c\u036d\b$\1\2\u036d\u0373\3\2\2\2\u036e\u036f\5\u00b2"+
		"Z\2\u036f\u0370\b$\1\2\u0370\u0373\3\2\2\2\u0371\u0373\7A\2\2\u0372\u036b"+
		"\3\2\2\2\u0372\u036e\3\2\2\2\u0372\u0371\3\2\2\2\u0373G\3\2\2\2\u0374"+
		"\u0375\5J&\2\u0375\u0376\b%\1\2\u0376\u037b\3\2\2\2\u0377\u0378\5\u00a8"+
		"U\2\u0378\u0379\b%\1\2\u0379\u037b\3\2\2\2\u037a\u0374\3\2\2\2\u037a\u0377"+
		"\3\2\2\2\u037bI\3\2\2\2\u037c\u037d\5L\'\2\u037d\u037e\b&\1\2\u037e\u0383"+
		"\3\2\2\2\u037f\u0380\5\u00d2j\2\u0380\u0381\b&\1\2\u0381\u0383\3\2\2\2"+
		"\u0382\u037c\3\2\2\2\u0382\u037f\3\2\2\2\u0383\u0386\3\2\2\2\u0384\u0382"+
		"\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0387\3\2\2\2\u0386\u0384\3\2\2\2\u0387"+
		"\u0388\b&\1\2\u0388\u0389\7\13\2\2\u0389\u038d\7h\2\2\u038a\u038b\5N("+
		"\2\u038b\u038c\b&\1\2\u038c\u038e\3\2\2\2\u038d\u038a\3\2\2\2\u038d\u038e"+
		"\3\2\2\2\u038e\u0392\3\2\2\2\u038f\u0390\5R*\2\u0390\u0391\b&\1\2\u0391"+
		"\u0393\3\2\2\2\u0392\u038f\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0397\3\2"+
		"\2\2\u0394\u0395\5T+\2\u0395\u0396\b&\1\2\u0396\u0398\3\2\2\2\u0397\u0394"+
		"\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039a\b&\1\2\u039a"+
		"\u039b\5X-\2\u039bK\3\2\2\2\u039c\u039d\7%\2\2\u039d\u03ab\b\'\1\2\u039e"+
		"\u039f\7$\2\2\u039f\u03ab\b\'\1\2\u03a0\u03a1\7#\2\2\u03a1\u03ab\b\'\1"+
		"\2\u03a2\u03a3\7\3\2\2\u03a3\u03ab\b\'\1\2\u03a4\u03a5\7(\2\2\u03a5\u03ab"+
		"\b\'\1\2\u03a6\u03a7\7\24\2\2\u03a7\u03ab\b\'\1\2\u03a8\u03a9\7)\2\2\u03a9"+
		"\u03ab\b\'\1\2\u03aa\u039c\3\2\2\2\u03aa\u039e\3\2\2\2\u03aa\u03a0\3\2"+
		"\2\2\u03aa\u03a2\3\2\2\2\u03aa\u03a4\3\2\2\2\u03aa\u03a6\3\2\2\2\u03aa"+
		"\u03a8\3\2\2\2\u03abM\3\2\2\2\u03ac\u03ad\7F\2\2\u03ad\u03ae\5P)\2\u03ae"+
		"\u03af\7E\2\2\u03af\u03b0\b(\1\2\u03b0O\3\2\2\2\u03b1\u03b2\5\34\17\2"+
		"\u03b2\u03b3\b)\1\2\u03b3\u03ba\3\2\2\2\u03b4\u03b5\7B\2\2\u03b5\u03b6"+
		"\5\34\17\2\u03b6\u03b7\b)\1\2\u03b7\u03b9\3\2\2\2\u03b8\u03b4\3\2\2\2"+
		"\u03b9\u03bc\3\2\2\2\u03ba\u03b8\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bd"+
		"\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bd\u03be\b)\1\2\u03beQ\3\2\2\2\u03bf\u03c0"+
		"\7\23\2\2\u03c0\u03c1\5\22\n\2\u03c1\u03c2\b*\1\2\u03c2S\3\2\2\2\u03c3"+
		"\u03c4\7\32\2\2\u03c4\u03c5\5V,\2\u03c5\u03c6\b+\1\2\u03c6U\3\2\2\2\u03c7"+
		"\u03c8\5\22\n\2\u03c8\u03c9\b,\1\2\u03c9\u03d0\3\2\2\2\u03ca\u03cb\7B"+
		"\2\2\u03cb\u03cc\5\22\n\2\u03cc\u03cd\b,\1\2\u03cd\u03cf\3\2\2\2\u03ce"+
		"\u03ca\3\2\2\2\u03cf\u03d2\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d0\u03d1\3\2"+
		"\2\2\u03d1\u03d3\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d3\u03d4\b,\1\2\u03d4"+
		"W\3\2\2\2\u03d5\u03d9\7=\2\2\u03d6\u03d8\5Z.\2\u03d7\u03d6\3\2\2\2\u03d8"+
		"\u03db\3\2\2\2\u03d9\u03d7\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03dc\3\2"+
		"\2\2\u03db\u03d9\3\2\2\2\u03dc\u03dd\7>\2\2\u03dd\u03de\b-\1\2\u03deY"+
		"\3\2\2\2\u03df\u03ea\5\\/\2\u03e0\u03e1\5\u009aN\2\u03e1\u03e2\b.\1\2"+
		"\u03e2\u03ea\3\2\2\2\u03e3\u03e4\5\u009cO\2\u03e4\u03e5\b.\1\2\u03e5\u03ea"+
		"\3\2\2\2\u03e6\u03e7\5\u009eP\2\u03e7\u03e8\b.\1\2\u03e8\u03ea\3\2\2\2"+
		"\u03e9\u03df\3\2\2\2\u03e9\u03e0\3\2\2\2\u03e9\u03e3\3\2\2\2\u03e9\u03e6"+
		"\3\2\2\2\u03ea[\3\2\2\2\u03eb\u03f7\5^\60\2\u03ec\u03ed\5|?\2\u03ed\u03ee"+
		"\b/\1\2\u03ee\u03f7\3\2\2\2\u03ef\u03f0\5H%\2\u03f0\u03f1\b/\1\2\u03f1"+
		"\u03f7\3\2\2\2\u03f2\u03f3\5\u00b2Z\2\u03f3\u03f4\b/\1\2\u03f4\u03f7\3"+
		"\2\2\2\u03f5\u03f7\7A\2\2\u03f6\u03eb\3\2\2\2\u03f6\u03ec\3\2\2\2\u03f6"+
		"\u03ef\3\2\2\2\u03f6\u03f2\3\2\2\2\u03f6\u03f5\3\2\2\2\u03f7]\3\2\2\2"+
		"\u03f8\u03f9\5`\61\2\u03f9\u03fa\b\60\1\2\u03fa\u03ff\3\2\2\2\u03fb\u03fc"+
		"\5\u00d2j\2\u03fc\u03fd\b\60\1\2\u03fd\u03ff\3\2\2\2\u03fe\u03f8\3\2\2"+
		"\2\u03fe\u03fb\3\2\2\2\u03ff\u0402\3\2\2\2\u0400\u03fe\3\2\2\2\u0400\u0401"+
		"\3\2\2\2\u0401\u0403\3\2\2\2\u0402\u0400\3\2\2\2\u0403\u0404\b\60\1\2"+
		"\u0404\u0405\5l\67\2\u0405\u0406\5b\62\2\u0406\u0407\7A\2\2\u0407_\3\2"+
		"\2\2\u0408\u0409\7%\2\2\u0409\u0417\b\61\1\2\u040a\u040b\7$\2\2\u040b"+
		"\u0417\b\61\1\2\u040c\u040d\7#\2\2\u040d\u0417\b\61\1\2\u040e\u040f\7"+
		"(\2\2\u040f\u0417\b\61\1\2\u0410\u0411\7\24\2\2\u0411\u0417\b\61\1\2\u0412"+
		"\u0413\7\60\2\2\u0413\u0417\b\61\1\2\u0414\u0415\7\63\2\2\u0415\u0417"+
		"\b\61\1\2\u0416\u0408\3\2\2\2\u0416\u040a\3\2\2\2\u0416\u040c\3\2\2\2"+
		"\u0416\u040e\3\2\2\2\u0416\u0410\3\2\2\2\u0416\u0412\3\2\2\2\u0416\u0414"+
		"\3\2\2\2\u0417a\3\2\2\2\u0418\u0419\5d\63\2\u0419\u041a\b\62\1\2\u041a"+
		"\u0421\3\2\2\2\u041b\u041c\7B\2\2\u041c\u041d\5d\63\2\u041d\u041e\b\62"+
		"\1\2\u041e\u0420\3\2\2\2\u041f\u041b\3\2\2\2\u0420\u0423\3\2\2\2\u0421"+
		"\u041f\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0424\3\2\2\2\u0423\u0421\3\2"+
		"\2\2\u0424\u0425\b\62\1\2\u0425c\3\2\2\2\u0426\u0427\5f\64\2\u0427\u042c"+
		"\b\63\1\2\u0428\u0429\7D\2\2\u0429\u042a\5j\66\2\u042a\u042b\b\63\1\2"+
		"\u042b\u042d\3\2\2\2\u042c\u0428\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u042e"+
		"\3\2\2\2\u042e\u042f\b\63\1\2\u042fe\3\2\2\2\u0430\u0431\b\64\1\2\u0431"+
		"\u0435\7h\2\2\u0432\u0433\5\32\16\2\u0433\u0434\b\64\1\2\u0434\u0436\3"+
		"\2\2\2\u0435\u0432\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0437\3\2\2\2\u0437"+
		"\u0438\b\64\1\2\u0438g\3\2\2\2\u0439\u043a\5l\67\2\u043a\u043b\5f\64\2"+
		"\u043b\u043c\b\65\1\2\u043ci\3\2\2\2\u043d\u043e\5\u018a\u00c6\2\u043e"+
		"\u043f\b\66\1\2\u043f\u0444\3\2\2\2\u0440\u0441\5\u00e4s\2\u0441\u0442"+
		"\b\66\1\2\u0442\u0444\3\2\2\2\u0443\u043d\3\2\2\2\u0443\u0440\3\2\2\2"+
		"\u0444k\3\2\2\2\u0445\u0446\5n8\2\u0446\u0447\b\67\1\2\u0447\u044c\3\2"+
		"\2\2\u0448\u0449\5p9\2\u0449\u044a\b\67\1\2\u044a\u044c\3\2\2\2\u044b"+
		"\u0445\3\2\2\2\u044b\u0448\3\2\2\2\u044cm\3\2\2\2\u044d\u044e\5\b\5\2"+
		"\u044e\u044f\b8\1\2\u044f\u0453\3\2\2\2\u0450\u0451\7\5\2\2\u0451\u0453"+
		"\b8\1\2\u0452\u044d\3\2\2\2\u0452\u0450\3\2\2\2\u0453o\3\2\2\2\u0454\u0455"+
		"\5r:\2\u0455\u0456\b9\1\2\u0456\u045e\3\2\2\2\u0457\u0458\5x=\2\u0458"+
		"\u0459\b9\1\2\u0459\u045e\3\2\2\2\u045a\u045b\5z>\2\u045b\u045c\b9\1\2"+
		"\u045c\u045e\3\2\2\2\u045d\u0454\3\2\2\2\u045d\u0457\3\2\2\2\u045d\u045a"+
		"\3\2\2\2\u045eq\3\2\2\2\u045f\u0460\5v<\2\u0460\u0461\b:\1\2\u0461\u0468"+
		"\3\2\2\2\u0462\u0463\7C\2\2\u0463\u0464\5\24\13\2\u0464\u0465\b:\1\2\u0465"+
		"\u0467\3\2\2\2\u0466\u0462\3\2\2\2\u0467\u046a\3\2\2\2\u0468\u0466\3\2"+
		"\2\2\u0468\u0469\3\2\2\2\u0469s\3\2\2\2\u046a\u0468\3\2\2\2\u046b\u046c"+
		"\5v<\2\u046c\u046d\b;\1\2\u046d\u0474\3\2\2\2\u046e\u046f\5r:\2\u046f"+
		"\u0470\7C\2\2\u0470\u0471\5\24\13\2\u0471\u0472\b;\1\2\u0472\u0474\3\2"+
		"\2\2\u0473\u046b\3\2\2\2\u0473\u046e\3\2\2\2\u0474u\3\2\2\2\u0475\u0476"+
		"\7h\2\2\u0476\u047a\b<\1\2\u0477\u0478\5$\23\2\u0478\u0479\b<\1\2\u0479"+
		"\u047b\3\2\2\2\u047a\u0477\3\2\2\2\u047a\u047b\3\2\2\2\u047bw\3\2\2\2"+
		"\u047c\u047d\7h\2\2\u047d\u047e\b=\1\2\u047ey\3\2\2\2\u047f\u0480\5n8"+
		"\2\u0480\u0481\5\32\16\2\u0481\u0482\b>\1\2\u0482\u048c\3\2\2\2\u0483"+
		"\u0484\5r:\2\u0484\u0485\5\32\16\2\u0485\u0486\b>\1\2\u0486\u048c\3\2"+
		"\2\2\u0487\u0488\5x=\2\u0488\u0489\5\32\16\2\u0489\u048a\b>\1\2\u048a"+
		"\u048c\3\2\2\2\u048b\u047f\3\2\2\2\u048b\u0483\3\2\2\2\u048b\u0487\3\2"+
		"\2\2\u048c{\3\2\2\2\u048d\u048e\5~@\2\u048e\u048f\b?\1\2\u048f\u0494\3"+
		"\2\2\2\u0490\u0491\5\u00d2j\2\u0491\u0492\b?\1\2\u0492\u0494\3\2\2\2\u0493"+
		"\u048d\3\2\2\2\u0493\u0490\3\2\2\2\u0494\u0497\3\2\2\2\u0495\u0493\3\2"+
		"\2\2\u0495\u0496\3\2\2\2\u0496\u0498\3\2\2\2\u0497\u0495\3\2\2\2\u0498"+
		"\u0499\b?\1\2\u0499\u049a\b?\1\2\u049a\u049b\5\u0080A\2\u049b\u049c\5"+
		"\u0098M\2\u049c\u049d\b?\1\2\u049d}\3\2\2\2\u049e\u049f\7%\2\2\u049f\u04b1"+
		"\b@\1\2\u04a0\u04a1\7$\2\2\u04a1\u04b1\b@\1\2\u04a2\u04a3\7#\2\2\u04a3"+
		"\u04b1\b@\1\2\u04a4\u04a5\7\3\2\2\u04a5\u04b1\b@\1\2\u04a6\u04a7\7(\2"+
		"\2\u04a7\u04b1\b@\1\2\u04a8\u04a9\7\24\2\2\u04a9\u04b1\b@\1\2\u04aa\u04ab"+
		"\7,\2\2\u04ab\u04b1\b@\1\2\u04ac\u04ad\7 \2\2\u04ad\u04b1\b@\1\2\u04ae"+
		"\u04af\7)\2\2\u04af\u04b1\b@\1\2\u04b0\u049e\3\2\2\2\u04b0\u04a0\3\2\2"+
		"\2\u04b0\u04a2\3\2\2\2\u04b0\u04a4\3\2\2\2\u04b0\u04a6\3\2\2\2\u04b0\u04a8"+
		"\3\2\2\2\u04b0\u04aa\3\2\2\2\u04b0\u04ac\3\2\2\2\u04b0\u04ae\3\2\2\2\u04b1"+
		"\177\3\2\2\2\u04b2\u04b3\5\u0082B\2\u04b3\u04b4\bA\1\2\u04b4\u04b8\5\u0084"+
		"C\2\u04b5\u04b6\5\u0092J\2\u04b6\u04b7\bA\1\2\u04b7\u04b9\3\2\2\2\u04b8"+
		"\u04b5\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04ce\3\2\2\2\u04ba\u04bb\5N"+
		"(\2\u04bb\u04c1\bA\1\2\u04bc\u04bd\5\u00d2j\2\u04bd\u04be\bA\1\2\u04be"+
		"\u04c0\3\2\2\2\u04bf\u04bc\3\2\2\2\u04c0\u04c3\3\2\2\2\u04c1\u04bf\3\2"+
		"\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c4\3\2\2\2\u04c3\u04c1\3\2\2\2\u04c4"+
		"\u04c5\bA\1\2\u04c5\u04c6\5\u0082B\2\u04c6\u04c7\bA\1\2\u04c7\u04cb\5"+
		"\u0084C\2\u04c8\u04c9\5\u0092J\2\u04c9\u04ca\bA\1\2\u04ca\u04cc\3\2\2"+
		"\2\u04cb\u04c8\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04ce\3\2\2\2\u04cd\u04b2"+
		"\3\2\2\2\u04cd\u04ba\3\2\2\2\u04ce\u0081\3\2\2\2\u04cf\u04d0\5l\67\2\u04d0"+
		"\u04d1\bB\1\2\u04d1\u04d5\3\2\2\2\u04d2\u04d3\7\62\2\2\u04d3\u04d5\bB"+
		"\1\2\u04d4\u04cf\3\2\2\2\u04d4\u04d2\3\2\2\2\u04d5\u0083\3\2\2\2\u04d6"+
		"\u04d7\7h\2\2\u04d7\u04d8\bC\1\2\u04d8\u04dc\7;\2\2\u04d9\u04da\5\u0086"+
		"D\2\u04da\u04db\bC\1\2\u04db\u04dd\3\2\2\2\u04dc\u04d9\3\2\2\2\u04dc\u04dd"+
		"\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04e2\7<\2\2\u04df\u04e0\5\32\16\2"+
		"\u04e0\u04e1\bC\1\2\u04e1\u04e3\3\2\2\2\u04e2\u04df\3\2\2\2\u04e2\u04e3"+
		"\3\2\2\2\u04e3\u0085\3\2\2\2\u04e4\u04e5\5\u0088E\2\u04e5\u04e6\bD\1\2"+
		"\u04e6\u04e7\3\2\2\2\u04e7\u04e8\7B\2\2\u04e8\u04e9\5\u008eH\2\u04e9\u04ea"+
		"\bD\1\2\u04ea\u04eb\3\2\2\2\u04eb\u04ec\bD\1\2\u04ec\u04f3\3\2\2\2\u04ed"+
		"\u04ee\5\u008eH\2\u04ee\u04ef\bD\1\2\u04ef\u04f0\3\2\2\2\u04f0\u04f1\b"+
		"D\1\2\u04f1\u04f3\3\2\2\2\u04f2\u04e4\3\2\2\2\u04f2\u04ed\3\2\2\2\u04f3"+
		"\u0087\3\2\2\2\u04f4\u04f5\5\u008aF\2\u04f5\u04f6\bE\1\2\u04f6\u04fd\3"+
		"\2\2\2\u04f7\u04f8\7B\2\2\u04f8\u04f9\5\u008aF\2\u04f9\u04fa\bE\1\2\u04fa"+
		"\u04fc\3\2\2\2\u04fb\u04f7\3\2\2\2\u04fc\u04ff\3\2\2\2\u04fd\u04fb\3\2"+
		"\2\2\u04fd\u04fe\3\2\2\2\u04fe\u0500\3\2\2\2\u04ff\u04fd\3\2\2\2\u0500"+
		"\u0501\bE\1\2\u0501\u0511\3\2\2\2\u0502\u0503\5\u0090I\2\u0503\u0504\b"+
		"E\1\2\u0504\u050b\3\2\2\2\u0505\u0506\7B\2\2\u0506\u0507\5\u008aF\2\u0507"+
		"\u0508\bE\1\2\u0508\u050a\3\2\2\2\u0509\u0505\3\2\2\2\u050a\u050d\3\2"+
		"\2\2\u050b\u0509\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u050e\3\2\2\2\u050d"+
		"\u050b\3\2\2\2\u050e\u050f\bE\1\2\u050f\u0511\3\2\2\2\u0510\u04f4\3\2"+
		"\2\2\u0510\u0502\3\2\2\2\u0511\u0089\3\2\2\2\u0512\u0513\5\u008cG\2\u0513"+
		"\u0514\bF\1\2\u0514\u0519\3\2\2\2\u0515\u0516\5\u00d2j\2\u0516\u0517\b"+
		"F\1\2\u0517\u0519\3\2\2\2\u0518\u0512\3\2\2\2\u0518\u0515\3\2\2\2\u0519"+
		"\u051c\3\2\2\2\u051a\u0518\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u051d\3\2"+
		"\2\2\u051c\u051a\3\2\2\2\u051d\u051e\bF\1\2\u051e\u051f\5h\65\2\u051f"+
		"\u0520\bF\1\2\u0520\u008b\3\2\2\2\u0521\u0522\7\24\2\2\u0522\u0523\bG"+
		"\1\2\u0523\u008d\3\2\2\2\u0524\u0525\5\u008cG\2\u0525\u0526\bH\1\2\u0526"+
		"\u052b\3\2\2\2\u0527\u0528\5\u00d2j\2\u0528\u0529\bH\1\2\u0529\u052b\3"+
		"\2\2\2\u052a\u0524\3\2\2\2\u052a\u0527\3\2\2\2\u052b\u052e\3\2\2\2\u052c"+
		"\u052a\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u052f\3\2\2\2\u052e\u052c\3\2"+
		"\2\2\u052f\u0535\5l\67\2\u0530\u0531\5\u00d2j\2\u0531\u0532\bH\1\2\u0532"+
		"\u0534\3\2\2\2\u0533\u0530\3\2\2\2\u0534\u0537\3\2\2\2\u0535\u0533\3\2"+
		"\2\2\u0535\u0536\3\2\2\2\u0536\u0538\3\2\2\2\u0537\u0535\3\2\2\2\u0538"+
		"\u0539\7j\2\2\u0539\u053a\5f\64\2\u053a\u053b\bH\1\2\u053b\u0540\3\2\2"+
		"\2\u053c\u053d\5\u008aF\2\u053d\u053e\bH\1\2\u053e\u0540\3\2\2\2\u053f"+
		"\u052c\3\2\2\2\u053f\u053c\3\2\2\2\u0540\u008f\3\2\2\2\u0541\u0542\5\u00d2"+
		"j\2\u0542\u0543\bI\1\2\u0543\u0545\3\2\2\2\u0544\u0541\3\2\2\2\u0545\u0548"+
		"\3\2\2\2\u0546\u0544\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u0549\3\2\2\2\u0548"+
		"\u0546\3\2\2\2\u0549\u054a\5l\67\2\u054a\u054b\7h\2\2\u054b\u054c\7C\2"+
		"\2\u054c\u054d\7-\2\2\u054d\u054e\bI\1\2\u054e\u0091\3\2\2\2\u054f\u0550"+
		"\7/\2\2\u0550\u0551\5\u0094K\2\u0551\u0552\bJ\1\2\u0552\u0093\3\2\2\2"+
		"\u0553\u0554\5\u0096L\2\u0554\u0555\bK\1\2\u0555\u055c\3\2\2\2\u0556\u0557"+
		"\7B\2\2\u0557\u0558\5\u0096L\2\u0558\u0559\bK\1\2\u0559\u055b\3\2\2\2"+
		"\u055a\u0556\3\2\2\2\u055b\u055e\3\2\2\2\u055c\u055a\3\2\2\2\u055c\u055d"+
		"\3\2\2\2\u055d\u055f\3\2\2\2\u055e\u055c\3\2\2\2\u055f\u0560\bK\1\2\u0560"+
		"\u0095\3\2\2\2\u0561\u0562\5\22\n\2\u0562\u0563\bL\1\2\u0563\u0568\3\2"+
		"\2\2\u0564\u0565\5\26\f\2\u0565\u0566\bL\1\2\u0566\u0568\3\2\2\2\u0567"+
		"\u0561\3\2\2\2\u0567\u0564\3\2\2\2\u0568\u0097\3\2\2\2\u0569\u056a\5\u00e8"+
		"u\2\u056a\u056b\bM\1\2\u056b\u056f\3\2\2\2\u056c\u056d\7A\2\2\u056d\u056f"+
		"\bM\1\2\u056e\u0569\3\2\2\2\u056e\u056c\3\2\2\2\u056f\u0099\3\2\2\2\u0570"+
		"\u0571\5\u00e8u\2\u0571\u0572\bN\1\2\u0572\u009b\3\2\2\2\u0573\u0574\7"+
		"(\2\2\u0574\u0575\5\u00e8u\2\u0575\u0576\bO\1\2\u0576\u009d\3\2\2\2\u0577"+
		"\u0578\5\u00a0Q\2\u0578\u0579\bP\1\2\u0579\u057e\3\2\2\2\u057a\u057b\5"+
		"\u00d2j\2\u057b\u057c\bP\1\2\u057c\u057e\3\2\2\2\u057d\u0577\3\2\2\2\u057d"+
		"\u057a\3\2\2\2\u057e\u0581\3\2\2\2\u057f\u057d\3\2\2\2\u057f\u0580\3\2"+
		"\2\2\u0580\u0582\3\2\2\2\u0581\u057f\3\2\2\2\u0582\u0583\bP\1\2\u0583"+
		"\u0584\bP\1\2\u0584\u0588\5\u00a2R\2\u0585\u0586\5\u0092J\2\u0586\u0587"+
		"\bP\1\2\u0587\u0589\3\2\2\2\u0588\u0585\3\2\2\2\u0588\u0589\3\2\2\2\u0589"+
		"\u058a\3\2\2\2\u058a\u058b\5\u00a4S\2\u058b\u058c\bP\1\2\u058c\u009f\3"+
		"\2\2\2\u058d\u058e\7%\2\2\u058e\u0594\bQ\1\2\u058f\u0590\7$\2\2\u0590"+
		"\u0594\bQ\1\2\u0591\u0592\7#\2\2\u0592\u0594\bQ\1\2\u0593\u058d\3\2\2"+
		"\2\u0593\u058f\3\2\2\2\u0593\u0591\3\2\2\2\u0594\u00a1\3\2\2\2\u0595\u0596"+
		"\5N(\2\u0596\u0597\bR\1\2\u0597\u0599\3\2\2\2\u0598\u0595\3\2\2\2\u0598"+
		"\u0599\3\2\2\2\u0599\u059a\3\2\2\2\u059a\u059b\7h\2\2\u059b\u059c\bR\1"+
		"\2\u059c\u05a0\7;\2\2\u059d\u059e\5\u0086D\2\u059e\u059f\bR\1\2\u059f"+
		"\u05a1\3\2\2\2\u05a0\u059d\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u05a2\3\2"+
		"\2\2\u05a2\u05a3\7<\2\2\u05a3\u00a3\3\2\2\2\u05a4\u05a5\bS\1\2\u05a5\u05a9"+
		"\7=\2\2\u05a6\u05a7\5\u00a6T\2\u05a7\u05a8\bS\1\2\u05a8\u05aa\3\2\2\2"+
		"\u05a9\u05a6\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ae\3\2\2\2\u05ab\u05ac"+
		"\5\u00eav\2\u05ac\u05ad\bS\1\2\u05ad\u05af\3\2\2\2\u05ae\u05ab\3\2\2\2"+
		"\u05ae\u05af\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b1\7>\2\2\u05b1\u05b2"+
		"\bS\1\2\u05b2\u00a5\3\2\2\2\u05b3\u05b4\5$\23\2\u05b4\u05b5\bT\1\2\u05b5"+
		"\u05b7\3\2\2\2\u05b6\u05b3\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7\u05b8\3\2"+
		"\2\2\u05b8\u05b9\7-\2\2\u05b9\u05bd\7;\2\2\u05ba\u05bb\5\u017a\u00be\2"+
		"\u05bb\u05bc\bT\1\2\u05bc\u05be\3\2\2\2\u05bd\u05ba\3\2\2\2\u05bd\u05be"+
		"\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c0\7<\2\2\u05c0\u05c1\7A\2\2\u05c1"+
		"\u05f6\bT\1\2\u05c2\u05c3\5$\23\2\u05c3\u05c4\bT\1\2\u05c4\u05c6\3\2\2"+
		"\2\u05c5\u05c2\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c8"+
		"\7*\2\2\u05c8\u05cc\7;\2\2\u05c9\u05ca\5\u017a\u00be\2\u05ca\u05cb\bT"+
		"\1\2\u05cb\u05cd\3\2\2\2\u05cc\u05c9\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd"+
		"\u05ce\3\2\2\2\u05ce\u05cf\7<\2\2\u05cf\u05d0\7A\2\2\u05d0\u05f6\bT\1"+
		"\2\u05d1\u05d2\5\62\32\2\u05d2\u05d6\7C\2\2\u05d3\u05d4\5$\23\2\u05d4"+
		"\u05d5\bT\1\2\u05d5\u05d7\3\2\2\2\u05d6\u05d3\3\2\2\2\u05d6\u05d7\3\2"+
		"\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05d9\7*\2\2\u05d9\u05dd\7;\2\2\u05da\u05db"+
		"\5\u017a\u00be\2\u05db\u05dc\bT\1\2\u05dc\u05de\3\2\2\2\u05dd\u05da\3"+
		"\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05df\3\2\2\2\u05df\u05e0\7<\2\2\u05e0"+
		"\u05e1\7A\2\2\u05e1\u05e2\bT\1\2\u05e2\u05f6\3\2\2\2\u05e3\u05e4\5\u014a"+
		"\u00a6\2\u05e4\u05e8\7C\2\2\u05e5\u05e6\5$\23\2\u05e6\u05e7\bT\1\2\u05e7"+
		"\u05e9\3\2\2\2\u05e8\u05e5\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9\u05ea\3\2"+
		"\2\2\u05ea\u05eb\7*\2\2\u05eb\u05ef\7;\2\2\u05ec\u05ed\5\u017a\u00be\2"+
		"\u05ed\u05ee\bT\1\2\u05ee\u05f0\3\2\2\2\u05ef\u05ec\3\2\2\2\u05ef\u05f0"+
		"\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1\u05f2\7<\2\2\u05f2\u05f3\7A\2\2\u05f3"+
		"\u05f4\bT\1\2\u05f4\u05f6\3\2\2\2\u05f5\u05b6\3\2\2\2\u05f5\u05c5\3\2"+
		"\2\2\u05f5\u05d1\3\2\2\2\u05f5\u05e3\3\2\2\2\u05f6\u00a7\3\2\2\2\u05f7"+
		"\u05f8\5L\'\2\u05f8\u05f9\bU\1\2\u05f9\u05fe\3\2\2\2\u05fa\u05fb\5\u00d2"+
		"j\2\u05fb\u05fc\bU\1\2\u05fc\u05fe\3\2\2\2\u05fd\u05f7\3\2\2\2\u05fd\u05fa"+
		"\3\2\2\2\u05fe\u0601\3\2\2\2\u05ff\u05fd\3\2\2\2\u05ff\u0600\3\2\2\2\u0600"+
		"\u0602\3\2\2\2\u0601\u05ff\3\2\2\2\u0602\u0603\7\22\2\2\u0603\u0607\7"+
		"h\2\2\u0604\u0605\5T+\2\u0605\u0606\bU\1\2\u0606\u0608\3\2\2\2\u0607\u0604"+
		"\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u060a\bU\1\2\u060a"+
		"\u060b\5\u00aaV\2\u060b\u00a9\3\2\2\2\u060c\u060e\7=\2\2\u060d\u060f\5"+
		"\u00acW\2\u060e\u060d\3\2\2\2\u060e\u060f\3\2\2\2\u060f\u0611\3\2\2\2"+
		"\u0610\u0612\7B\2\2\u0611\u0610\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u0614"+
		"\3\2\2\2\u0613\u0615\5\u00b0Y\2\u0614\u0613\3\2\2\2\u0614\u0615\3\2\2"+
		"\2\u0615\u0616\3\2\2\2\u0616\u0617\7>\2\2\u0617\u0618\bV\1\2\u0618\u00ab"+
		"\3\2\2\2\u0619\u061e\5\u00aeX\2\u061a\u061b\7B\2\2\u061b\u061d\5\u00ae"+
		"X\2\u061c\u061a\3\2\2\2\u061d\u0620\3\2\2\2\u061e\u061c\3\2\2\2\u061e"+
		"\u061f\3\2\2\2\u061f\u00ad\3\2\2\2\u0620\u061e\3\2\2\2\u0621\u0622\5\u00d2"+
		"j\2\u0622\u0623\bX\1\2\u0623\u0625\3\2\2\2\u0624\u0621\3\2\2\2\u0625\u0628"+
		"\3\2\2\2\u0626\u0624\3\2\2\2\u0626\u0627\3\2\2\2\u0627\u0629\3\2\2\2\u0628"+
		"\u0626\3\2\2\2\u0629\u0631\7h\2\2\u062a\u062e\7;\2\2\u062b\u062c\5\u017a"+
		"\u00be\2\u062c\u062d\bX\1\2\u062d\u062f\3\2\2\2\u062e\u062b\3\2\2\2\u062e"+
		"\u062f\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0632\7<\2\2\u0631\u062a\3\2"+
		"\2\2\u0631\u0632\3\2\2\2\u0632\u0633\3\2\2\2\u0633\u0635\bX\1\2\u0634"+
		"\u0636\5X-\2\u0635\u0634\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u00af\3\2\2"+
		"\2\u0637\u063b\7A\2\2\u0638\u063a\5Z.\2\u0639\u0638\3\2\2\2\u063a\u063d"+
		"\3\2\2\2\u063b\u0639\3\2\2\2\u063b\u063c\3\2\2\2\u063c\u00b1\3\2\2\2\u063d"+
		"\u063b\3\2\2\2\u063e\u063f\5\u00b4[\2\u063f\u0640\bZ\1\2\u0640\u0645\3"+
		"\2\2\2\u0641\u0642\5\u00c6d\2\u0642\u0643\bZ\1\2\u0643\u0645\3\2\2\2\u0644"+
		"\u063e\3\2\2\2\u0644\u0641\3\2\2\2\u0645\u00b3\3\2\2\2\u0646\u0647\5\u00b6"+
		"\\\2\u0647\u0648\b[\1\2\u0648\u064d\3\2\2\2\u0649\u064a\5\u00d2j\2\u064a"+
		"\u064b\b[\1\2\u064b\u064d\3\2\2\2\u064c\u0646\3\2\2\2\u064c\u0649\3\2"+
		"\2\2\u064d\u0650\3\2\2\2\u064e\u064c\3\2\2\2\u064e\u064f\3\2\2\2\u064f"+
		"\u0651\3\2\2\2\u0650\u064e\3\2\2\2\u0651\u0652\b[\1\2\u0652\u0653\7\36"+
		"\2\2\u0653\u0657\7h\2\2\u0654\u0655\5N(\2\u0655\u0656\b[\1\2\u0656\u0658"+
		"\3\2\2\2\u0657\u0654\3\2\2\2\u0657\u0658\3\2\2\2\u0658\u065c\3\2\2\2\u0659"+
		"\u065a\5\u00b8]\2\u065a\u065b\b[\1\2\u065b\u065d\3\2\2\2\u065c\u0659\3"+
		"\2\2\2\u065c\u065d\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u065f\b[\1\2\u065f"+
		"\u0660\5\u00ba^\2\u0660\u00b5\3\2\2\2\u0661\u0662\7%\2\2\u0662\u066e\b"+
		"\\\1\2\u0663\u0664\7$\2\2\u0664\u066e\b\\\1\2\u0665\u0666\7#\2\2\u0666"+
		"\u066e\b\\\1\2\u0667\u0668\7\3\2\2\u0668\u066e\b\\\1\2\u0669\u066a\7("+
		"\2\2\u066a\u066e\b\\\1\2\u066b\u066c\7)\2\2\u066c\u066e\b\\\1\2\u066d"+
		"\u0661\3\2\2\2\u066d\u0663\3\2\2\2\u066d\u0665\3\2\2\2\u066d\u0667\3\2"+
		"\2\2\u066d\u0669\3\2\2\2\u066d\u066b\3\2\2\2\u066e\u00b7\3\2\2\2\u066f"+
		"\u0670\7\23\2\2\u0670\u0671\5V,\2\u0671\u0672\b]\1\2\u0672\u00b9\3\2\2"+
		"\2\u0673\u0677\7=\2\2\u0674\u0676\5\u00bc_\2\u0675\u0674\3\2\2\2\u0676"+
		"\u0679\3\2\2\2\u0677\u0675\3\2\2\2\u0677\u0678\3\2\2\2\u0678\u067a\3\2"+
		"\2\2\u0679\u0677\3\2\2\2\u067a\u067b\7>\2\2\u067b\u067c\b^\1\2\u067c\u00bb"+
		"\3\2\2\2\u067d\u0689\5\u00be`\2\u067e\u067f\5\u00c2b\2\u067f\u0680\b_"+
		"\1\2\u0680\u0689\3\2\2\2\u0681\u0682\5H%\2\u0682\u0683\b_\1\2\u0683\u0689"+
		"\3\2\2\2\u0684\u0685\5\u00b2Z\2\u0685\u0686\b_\1\2\u0686\u0689\3\2\2\2"+
		"\u0687\u0689\7A\2\2\u0688\u067d\3\2\2\2\u0688\u067e\3\2\2\2\u0688\u0681"+
		"\3\2\2\2\u0688\u0684\3\2\2\2\u0688\u0687\3\2\2\2\u0689\u00bd\3\2\2\2\u068a"+
		"\u068b\5\u00c0a\2\u068b\u068c\b`\1\2\u068c\u0691\3\2\2\2\u068d\u068e\5"+
		"\u00d2j\2\u068e\u068f\b`\1\2\u068f\u0691\3\2\2\2\u0690\u068a\3\2\2\2\u0690"+
		"\u068d\3\2\2\2\u0691\u0694\3\2\2\2\u0692\u0690\3\2\2\2\u0692\u0693\3\2"+
		"\2\2\u0693\u0695\3\2\2\2\u0694\u0692\3\2\2\2\u0695\u0696\b`\1\2\u0696"+
		"\u0697\5l\67\2\u0697\u0698\5b\62\2\u0698\u0699\7A\2\2\u0699\u00bf\3\2"+
		"\2\2\u069a\u069b\7%\2\2\u069b\u06a1\ba\1\2\u069c\u069d\7(\2\2\u069d\u06a1"+
		"\ba\1\2\u069e\u069f\7\24\2\2\u069f\u06a1\ba\1\2\u06a0\u069a\3\2\2\2\u06a0"+
		"\u069c\3\2\2\2\u06a0\u069e\3\2\2\2\u06a1\u00c1\3\2\2\2\u06a2\u06a3\5\u00c4"+
		"c\2\u06a3\u06a4\bb\1\2\u06a4\u06a9\3\2\2\2\u06a5\u06a6\5\u00d2j\2\u06a6"+
		"\u06a7\bb\1\2\u06a7\u06a9\3\2\2\2\u06a8\u06a2\3\2\2\2\u06a8\u06a5\3\2"+
		"\2\2\u06a9\u06ac\3\2\2\2\u06aa\u06a8\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab"+
		"\u06ad\3\2\2\2\u06ac\u06aa\3\2\2\2\u06ad\u06ae\bb\1\2\u06ae\u06af\bb\1"+
		"\2\u06af\u06b0\5\u0080A\2\u06b0\u06b1\5\u0098M\2\u06b1\u06b2\bb\1\2\u06b2"+
		"\u00c3\3\2\2\2\u06b3\u06b4\7%\2\2\u06b4\u06be\bc\1\2\u06b5\u06b6\7\3\2"+
		"\2\u06b6\u06be\bc\1\2\u06b7\u06b8\7\16\2\2\u06b8\u06be\bc\1\2\u06b9\u06ba"+
		"\7(\2\2\u06ba\u06be\bc\1\2\u06bb\u06bc\7)\2\2\u06bc\u06be\bc\1\2\u06bd"+
		"\u06b3\3\2\2\2\u06bd\u06b5\3\2\2\2\u06bd\u06b7\3\2\2\2\u06bd\u06b9\3\2"+
		"\2\2\u06bd\u06bb\3\2\2\2\u06be\u00c5\3\2\2\2\u06bf\u06c0\5\u00b6\\\2\u06c0"+
		"\u06c1\bd\1\2\u06c1\u06c6\3\2\2\2\u06c2\u06c3\5\u00d2j\2\u06c3\u06c4\b"+
		"d\1\2\u06c4\u06c6\3\2\2\2\u06c5\u06bf\3\2\2\2\u06c5\u06c2\3\2\2\2\u06c6"+
		"\u06c9\3\2\2\2\u06c7\u06c5\3\2\2\2\u06c7\u06c8\3\2\2\2\u06c8\u06ca\3\2"+
		"\2\2\u06c9\u06c7\3\2\2\2\u06ca\u06cb\7i\2\2\u06cb\u06cc\7\36\2\2\u06cc"+
		"\u06cd\7h\2\2\u06cd\u06ce\bd\1\2\u06ce\u06cf\5\u00c8e\2\u06cf\u00c7\3"+
		"\2\2\2\u06d0\u06d4\7=\2\2\u06d1\u06d3\5\u00caf\2\u06d2\u06d1\3\2\2\2\u06d3"+
		"\u06d6\3\2\2\2\u06d4\u06d2\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5\u06d7\3\2"+
		"\2\2\u06d6\u06d4\3\2\2\2\u06d7\u06d8\7>\2\2\u06d8\u06d9\be\1\2\u06d9\u00c9"+
		"\3\2\2\2\u06da\u06db\5\u00ccg\2\u06db\u06dc\bf\1\2\u06dc\u06e6\3\2\2\2"+
		"\u06dd\u06e6\5\u00be`\2\u06de\u06df\5H%\2\u06df\u06e0\bf\1\2\u06e0\u06e6"+
		"\3\2\2\2\u06e1\u06e2\5\u00b2Z\2\u06e2\u06e3\bf\1\2\u06e3\u06e6\3\2\2\2"+
		"\u06e4\u06e6\7A\2\2\u06e5\u06da\3\2\2\2\u06e5\u06dd\3\2\2\2\u06e5\u06de"+
		"\3\2\2\2\u06e5\u06e1\3\2\2\2\u06e5\u06e4\3\2\2\2\u06e6\u00cb\3\2\2\2\u06e7"+
		"\u06e8\5\u00ceh\2\u06e8\u06e9\bg\1\2\u06e9\u06ee\3\2\2\2\u06ea\u06eb\5"+
		"\u00d2j\2\u06eb\u06ec\bg\1\2\u06ec\u06ee\3\2\2\2\u06ed\u06e7\3\2\2\2\u06ed"+
		"\u06ea\3\2\2\2\u06ee\u06f1\3\2\2\2\u06ef\u06ed\3\2\2\2\u06ef\u06f0\3\2"+
		"\2\2\u06f0\u06f2\3\2\2\2\u06f1\u06ef\3\2\2\2\u06f2\u06f3\bg\1\2\u06f3"+
		"\u06f4\5l\67\2\u06f4\u06f5\7h\2\2\u06f5\u06f6\7;\2\2\u06f6\u06fa\7<\2"+
		"\2\u06f7\u06f8\5\32\16\2\u06f8\u06f9\bg\1\2\u06f9\u06fb\3\2\2\2\u06fa"+
		"\u06f7\3\2\2\2\u06fa\u06fb\3\2\2\2\u06fb\u06ff\3\2\2\2\u06fc\u06fd\5\u00d0"+
		"i\2\u06fd\u06fe\bg\1\2\u06fe\u0700\3\2\2\2\u06ff\u06fc\3\2\2\2\u06ff\u0700"+
		"\3\2\2\2\u0700\u0701\3\2\2\2\u0701\u0702\7A\2\2\u0702\u0703\bg\1\2\u0703"+
		"\u00cd\3\2\2\2\u0704\u0705\7%\2\2\u0705\u0709\bh\1\2\u0706\u0707\7\3\2"+
		"\2\u0707\u0709\bh\1\2\u0708\u0704\3\2\2\2\u0708\u0706\3\2\2\2\u0709\u00cf"+
		"\3\2\2\2\u070a\u070b\7\16\2\2\u070b\u070c\5\u00dan\2\u070c\u070d\bi\1"+
		"\2\u070d\u00d1\3\2\2\2\u070e\u070f\5\u00d4k\2\u070f\u0710\bj\1\2\u0710"+
		"\u0718\3\2\2\2\u0711\u0712\5\u00e0q\2\u0712\u0713\bj\1\2\u0713\u0718\3"+
		"\2\2\2\u0714\u0715\5\u00e2r\2\u0715\u0716\bj\1\2\u0716\u0718\3\2\2\2\u0717"+
		"\u070e\3\2\2\2\u0717\u0711\3\2\2\2\u0717\u0714\3\2\2\2\u0718\u00d3\3\2"+
		"\2\2\u0719\u071a\7i\2\2\u071a\u071b\5.\30\2\u071b\u071c\bk\1\2\u071c\u071e"+
		"\7;\2\2\u071d\u071f\5\u00d6l\2\u071e\u071d\3\2\2\2\u071e\u071f\3\2\2\2"+
		"\u071f\u0720\3\2\2\2\u0720\u0721\7<\2\2\u0721\u0722\bk\1\2\u0722\u00d5"+
		"\3\2\2\2\u0723\u0728\5\u00d8m\2\u0724\u0725\7B\2\2\u0725\u0727\5\u00d8"+
		"m\2\u0726\u0724\3\2\2\2\u0727\u072a\3\2\2\2\u0728\u0726\3\2\2\2\u0728"+
		"\u0729\3\2\2\2\u0729\u00d7\3\2\2\2\u072a\u0728\3\2\2\2\u072b\u072c\7h"+
		"\2\2\u072c\u072d\7D\2\2\u072d\u072e\5\u00dan\2\u072e\u072f\bm\1\2\u072f"+
		"\u00d9\3\2\2\2\u0730\u0731\5\u019c\u00cf\2\u0731\u0732\bn\1\2\u0732\u073a"+
		"\3\2\2\2\u0733\u0734\5\u00dco\2\u0734\u0735\bn\1\2\u0735\u073a\3\2\2\2"+
		"\u0736\u0737\5\u00d2j\2\u0737\u0738\bn\1\2\u0738\u073a\3\2\2\2\u0739\u0730"+
		"\3\2\2\2\u0739\u0733\3\2\2\2\u0739\u0736\3\2\2\2\u073a\u00db\3\2\2\2\u073b"+
		"\u073f\7=\2\2\u073c\u073d\5\u00dep\2\u073d\u073e\bo\1\2\u073e\u0740\3"+
		"\2\2\2\u073f\u073c\3\2\2\2\u073f\u0740\3\2\2\2\u0740\u0742\3\2\2\2\u0741"+
		"\u0743\7B\2\2\u0742\u0741\3\2\2\2\u0742\u0743\3\2\2\2\u0743\u0744\3\2"+
		"\2\2\u0744\u0745\7>\2\2\u0745\u0746\bo\1\2\u0746\u00dd\3\2\2\2\u0747\u0748"+
		"\5\u00dan\2\u0748\u0749\bp\1\2\u0749\u0750\3\2\2\2\u074a\u074b\7B\2\2"+
		"\u074b\u074c\5\u00dan\2\u074c\u074d\bp\1\2\u074d\u074f\3\2\2\2\u074e\u074a"+
		"\3\2\2\2\u074f\u0752\3\2\2\2\u0750\u074e\3\2\2\2\u0750\u0751\3\2\2\2\u0751"+
		"\u0753\3\2\2\2\u0752\u0750\3\2\2\2\u0753\u0754\bp\1\2\u0754\u00df\3\2"+
		"\2\2\u0755\u0756\7i\2\2\u0756\u0757\5.\30\2\u0757\u0758\bq\1\2\u0758\u00e1"+
		"\3\2\2\2\u0759\u075a\7i\2\2\u075a\u075b\5.\30\2\u075b\u075c\7;\2\2\u075c"+
		"\u075d\5\u00dan\2\u075d\u075e\7<\2\2\u075e\u075f\br\1\2\u075f\u00e3\3"+
		"\2\2\2\u0760\u0764\7=\2\2\u0761\u0762\5\u00e6t\2\u0762\u0763\bs\1\2\u0763"+
		"\u0765\3\2\2\2\u0764\u0761\3\2\2\2\u0764\u0765\3\2\2\2\u0765\u0767\3\2"+
		"\2\2\u0766\u0768\7B\2\2\u0767\u0766\3\2\2\2\u0767\u0768\3\2\2\2\u0768"+
		"\u0769\3\2\2\2\u0769\u076a\7>\2\2\u076a\u076b\bs\1\2\u076b\u00e5\3\2\2"+
		"\2\u076c\u076d\5j\66\2\u076d\u076e\bt\1\2\u076e\u0775\3\2\2\2\u076f\u0770"+
		"\7B\2\2\u0770\u0771\5j\66\2\u0771\u0772\bt\1\2\u0772\u0774\3\2\2\2\u0773"+
		"\u076f\3\2\2\2\u0774\u0777\3\2\2\2\u0775\u0773\3\2\2\2\u0775\u0776\3\2"+
		"\2\2\u0776\u0778\3\2\2\2\u0777\u0775\3\2\2\2\u0778\u0779\bt\1\2\u0779"+
		"\u00e7\3\2\2\2\u077a\u077b\bu\1\2\u077b\u077f\7=\2\2\u077c\u077d\5\u00ea"+
		"v\2\u077d\u077e\bu\1\2\u077e\u0780\3\2\2\2\u077f\u077c\3\2\2\2\u077f\u0780"+
		"\3\2\2\2\u0780\u0781\3\2\2\2\u0781\u0782\7>\2\2\u0782\u0783\bu\1\2\u0783"+
		"\u00e9\3\2\2\2\u0784\u0785\5\u00ecw\2\u0785\u0786\bv\1\2\u0786\u078c\3"+
		"\2\2\2\u0787\u0788\5\u00ecw\2\u0788\u0789\bv\1\2\u0789\u078b\3\2\2\2\u078a"+
		"\u0787\3\2\2\2\u078b\u078e\3\2\2\2\u078c\u078a\3\2\2\2\u078c\u078d\3\2"+
		"\2\2\u078d\u078f\3\2\2\2\u078e\u078c\3\2\2\2\u078f\u0790\bv\1\2\u0790"+
		"\u00eb\3\2\2\2\u0791\u0792\5\u00eex\2\u0792\u0793\bw\1\2\u0793\u079b\3"+
		"\2\2\2\u0794\u0795\5H%\2\u0795\u0796\bw\1\2\u0796\u079b\3\2\2\2\u0797"+
		"\u0798\5\u00f2z\2\u0798\u0799\bw\1\2\u0799\u079b\3\2\2\2\u079a\u0791\3"+
		"\2\2\2\u079a\u0794\3\2\2\2\u079a\u0797\3\2\2\2\u079b\u00ed\3\2\2\2\u079c"+
		"\u079d\5\u00f0y\2\u079d\u079e\7A\2\2\u079e\u079f\bx\1\2\u079f\u00ef\3"+
		"\2\2\2\u07a0\u07a1\5\u008cG\2\u07a1\u07a2\by\1\2\u07a2\u07a7\3\2\2\2\u07a3"+
		"\u07a4\5\u00d2j\2\u07a4\u07a5\by\1\2\u07a5\u07a7\3\2\2\2\u07a6\u07a0\3"+
		"\2\2\2\u07a6\u07a3\3\2\2\2\u07a7\u07aa\3\2\2\2\u07a8\u07a6\3\2\2\2\u07a8"+
		"\u07a9\3\2\2\2\u07a9\u07ab\3\2\2\2\u07aa\u07a8\3\2\2\2\u07ab\u07ac\5l"+
		"\67\2\u07ac\u07ad\5b\62\2\u07ad\u07ae\by\1\2\u07ae\u00f1\3\2\2\2\u07af"+
		"\u07b0\5\u00f6|\2\u07b0\u07b1\bz\1\2\u07b1\u07c2\3\2\2\2\u07b2\u07b3\5"+
		"\u00fa~\2\u07b3\u07b4\bz\1\2\u07b4\u07c2\3\2\2\2\u07b5\u07b6\5\u0102\u0082"+
		"\2\u07b6\u07b7\bz\1\2\u07b7\u07c2\3\2\2\2\u07b8\u07b9\5\u0104\u0083\2"+
		"\u07b9\u07ba\bz\1\2\u07ba\u07c2\3\2\2\2\u07bb\u07bc\5\u0114\u008b\2\u07bc"+
		"\u07bd\bz\1\2\u07bd\u07c2\3\2\2\2\u07be\u07bf\5\u011a\u008e\2\u07bf\u07c0"+
		"\bz\1\2\u07c0\u07c2\3\2\2\2\u07c1\u07af\3\2\2\2\u07c1\u07b2\3\2\2\2\u07c1"+
		"\u07b5\3\2\2\2\u07c1\u07b8\3\2\2\2\u07c1\u07bb\3\2\2\2\u07c1\u07be\3\2"+
		"\2\2\u07c2\u00f3\3\2\2\2\u07c3\u07c4\5\u00f6|\2\u07c4\u07c5\b{\1\2\u07c5"+
		"\u07d3\3\2\2\2\u07c6\u07c7\5\u00fc\177\2\u07c7\u07c8\b{\1\2\u07c8\u07d3"+
		"\3\2\2\2\u07c9\u07ca\5\u0106\u0084\2\u07ca\u07cb\b{\1\2\u07cb\u07d3\3"+
		"\2\2\2\u07cc\u07cd\5\u0116\u008c\2\u07cd\u07ce\b{\1\2\u07ce\u07d3\3\2"+
		"\2\2\u07cf\u07d0\5\u011c\u008f\2\u07d0\u07d1\b{\1\2\u07d1\u07d3\3\2\2"+
		"\2\u07d2\u07c3\3\2\2\2\u07d2\u07c6\3\2\2\2\u07d2\u07c9\3\2\2\2\u07d2\u07cc"+
		"\3\2\2\2\u07d2\u07cf\3\2\2\2\u07d3\u00f5\3\2\2\2\u07d4\u07d5\5\u00e8u"+
		"\2\u07d5\u07d6\b|\1\2\u07d6\u07f9\3\2\2\2\u07d7\u07d8\5\u00f8}\2\u07d8"+
		"\u07d9\b|\1\2\u07d9\u07f9\3\2\2\2\u07da\u07db\5\u00fe\u0080\2\u07db\u07dc"+
		"\b|\1\2\u07dc\u07f9\3\2\2\2\u07dd\u07de\5\u0108\u0085\2\u07de\u07df\b"+
		"|\1\2\u07df\u07f9\3\2\2\2\u07e0\u07e1\5\u010a\u0086\2\u07e1\u07e2\b|\1"+
		"\2\u07e2\u07f9\3\2\2\2\u07e3\u07e4\5\u0118\u008d\2\u07e4\u07e5\b|\1\2"+
		"\u07e5\u07f9\3\2\2\2\u07e6\u07e7\5\u012c\u0097\2\u07e7\u07e8\b|\1\2\u07e8"+
		"\u07f9\3\2\2\2\u07e9\u07ea\5\u012e\u0098\2\u07ea\u07eb\b|\1\2\u07eb\u07f9"+
		"\3\2\2\2\u07ec\u07ed\5\u0130\u0099\2\u07ed\u07ee\b|\1\2\u07ee\u07f9\3"+
		"\2\2\2\u07ef\u07f0\5\u0134\u009b\2\u07f0\u07f1\b|\1\2\u07f1\u07f9\3\2"+
		"\2\2\u07f2\u07f3\5\u0132\u009a\2\u07f3\u07f4\b|\1\2\u07f4\u07f9\3\2\2"+
		"\2\u07f5\u07f6\5\u0136\u009c\2\u07f6\u07f7\b|\1\2\u07f7\u07f9\3\2\2\2"+
		"\u07f8\u07d4\3\2\2\2\u07f8\u07d7\3\2\2\2\u07f8\u07da\3\2\2\2\u07f8\u07dd"+
		"\3\2\2\2\u07f8\u07e0\3\2\2\2\u07f8\u07e3\3\2\2\2\u07f8\u07e6\3\2\2\2\u07f8"+
		"\u07e9\3\2\2\2\u07f8\u07ec\3\2\2\2\u07f8\u07ef\3\2\2\2\u07f8\u07f2\3\2"+
		"\2\2\u07f8\u07f5\3\2\2\2\u07f9\u00f7\3\2\2\2\u07fa\u07fb\7A\2\2\u07fb"+
		"\u07fc\b}\1\2\u07fc\u00f9\3\2\2\2\u07fd\u07fe\7h\2\2\u07fe\u07ff\7J\2"+
		"\2\u07ff\u0800\5\u00f2z\2\u0800\u0801\b~\1\2\u0801\u00fb\3\2\2\2\u0802"+
		"\u0803\7h\2\2\u0803\u0804\7J\2\2\u0804\u0805\5\u00f4{\2\u0805\u0806\b"+
		"\177\1\2\u0806\u00fd\3\2\2\2\u0807\u0808\5\u0100\u0081\2\u0808\u0809\7"+
		"A\2\2\u0809\u080a\b\u0080\1\2\u080a\u00ff\3\2\2\2\u080b\u080c\5\u0196"+
		"\u00cc\2\u080c\u080d\b\u0081\1\2\u080d\u0821\3\2\2\2\u080e\u080f\5\u01b4"+
		"\u00db\2\u080f\u0810\b\u0081\1\2\u0810\u0821\3\2\2\2\u0811\u0812\5\u01b6"+
		"\u00dc\2\u0812\u0813\b\u0081\1\2\u0813\u0821\3\2\2\2\u0814\u0815\5\u01bc"+
		"\u00df\2\u0815\u0816\b\u0081\1\2\u0816\u0821\3\2\2\2\u0817\u0818\5\u01be"+
		"\u00e0\2\u0818\u0819\b\u0081\1\2\u0819\u0821\3\2\2\2\u081a\u081b\5\u0174"+
		"\u00bb\2\u081b\u081c\b\u0081\1\2\u081c\u0821\3\2\2\2\u081d\u081e\5\u0160"+
		"\u00b1\2\u081e\u081f\b\u0081\1\2\u081f\u0821\3\2\2\2\u0820\u080b\3\2\2"+
		"\2\u0820\u080e\3\2\2\2\u0820\u0811\3\2\2\2\u0820\u0814\3\2\2\2\u0820\u0817"+
		"\3\2\2\2\u0820\u081a\3\2\2\2\u0820\u081d\3\2\2\2\u0821\u0101\3\2\2\2\u0822"+
		"\u0823\7\30\2\2\u0823\u0824\7;\2\2\u0824\u0825\5\u018a\u00c6\2\u0825\u0826"+
		"\7<\2\2\u0826\u0827\5\u00f2z\2\u0827\u0828\b\u0082\1\2\u0828\u0103\3\2"+
		"\2\2\u0829\u082a\7\30\2\2\u082a\u082b\7;\2\2\u082b\u082c\5\u018a\u00c6"+
		"\2\u082c\u082d\7<\2\2\u082d\u082e\5\u00f4{\2\u082e\u082f\7\21\2\2\u082f"+
		"\u0830\5\u00f2z\2\u0830\u0831\b\u0083\1\2\u0831\u0105\3\2\2\2\u0832\u0833"+
		"\7\30\2\2\u0833\u0834\7;\2\2\u0834\u0835\5\u018a\u00c6\2\u0835\u0836\7"+
		"<\2\2\u0836\u0837\5\u00f4{\2\u0837\u0838\7\21\2\2\u0838\u0839\5\u00f4"+
		"{\2\u0839\u083a\b\u0084\1\2\u083a\u0107\3\2\2\2\u083b\u083c\7\4\2\2\u083c"+
		"\u083d\5\u018a\u00c6\2\u083d\u083e\7A\2\2\u083e\u083f\b\u0085\1\2\u083f"+
		"\u0848\3\2\2\2\u0840\u0841\7\4\2\2\u0841\u0842\5\u018a\u00c6\2\u0842\u0843"+
		"\7J\2\2\u0843\u0844\5\u018a\u00c6\2\u0844\u0845\7A\2\2\u0845\u0846\b\u0085"+
		"\1\2\u0846\u0848\3\2\2\2\u0847\u083b\3\2\2\2\u0847\u0840\3\2\2\2\u0848"+
		"\u0109\3\2\2\2\u0849\u084a\7+\2\2\u084a\u084b\7;\2\2\u084b\u084c\5\u018a"+
		"\u00c6\2\u084c\u084d\7<\2\2\u084d\u084e\5\u010c\u0087\2\u084e\u084f\b"+
		"\u0086\1\2\u084f\u010b\3\2\2\2\u0850\u0856\7=\2\2\u0851\u0852\5\u010e"+
		"\u0088\2\u0852\u0853\b\u0087\1\2\u0853\u0855\3\2\2\2\u0854\u0851\3\2\2"+
		"\2\u0855\u0858\3\2\2\2\u0856\u0854\3\2\2\2\u0856\u0857\3\2\2\2\u0857\u085e"+
		"\3\2\2\2\u0858\u0856\3\2\2\2\u0859\u085a\5\u0112\u008a\2\u085a\u085b\b"+
		"\u0087\1\2\u085b\u085d\3\2\2\2\u085c\u0859\3\2\2\2\u085d\u0860\3\2\2\2"+
		"\u085e\u085c\3\2\2\2\u085e\u085f\3\2\2\2\u085f\u0861\3\2\2\2\u0860\u085e"+
		"\3\2\2\2\u0861\u0862\7>\2\2\u0862\u0863\b\u0087\1\2\u0863\u0864\b\u0087"+
		"\1\2\u0864\u010d\3\2\2\2\u0865\u0866\5\u0110\u0089\2\u0866\u0867\5\u00ea"+
		"v\2\u0867\u0868\b\u0088\1\2\u0868\u010f\3\2\2\2\u0869\u086a\5\u0112\u008a"+
		"\2\u086a\u086b\b\u0089\1\2\u086b\u0871\3\2\2\2\u086c\u086d\5\u0112\u008a"+
		"\2\u086d\u086e\b\u0089\1\2\u086e\u0870\3\2\2\2\u086f\u086c\3\2\2\2\u0870"+
		"\u0873\3\2\2\2\u0871\u086f\3\2\2\2\u0871\u0872\3\2\2\2\u0872\u0874\3\2"+
		"\2\2\u0873\u0871\3\2\2\2\u0874\u0875\b\u0089\1\2\u0875\u0111\3\2\2\2\u0876"+
		"\u0877\7\b\2\2\u0877\u0878\5\u0188\u00c5\2\u0878\u0879\7J\2\2\u0879\u087a"+
		"\b\u008a\1\2\u087a\u0883\3\2\2\2\u087b\u087c\7\b\2\2\u087c\u087d\7h\2"+
		"\2\u087d\u087e\7J\2\2\u087e\u0883\b\u008a\1\2\u087f\u0880\7\16\2\2\u0880"+
		"\u0881\7J\2\2\u0881\u0883\b\u008a\1\2\u0882\u0876\3\2\2\2\u0882\u087b"+
		"\3\2\2\2\u0882\u087f\3\2\2\2\u0883\u0113\3\2\2\2\u0884\u0885\7\64\2\2"+
		"\u0885\u0886\7;\2\2\u0886\u0887\5\u018a\u00c6\2\u0887\u0888\7<\2\2\u0888"+
		"\u0889\5\u00f2z\2\u0889\u088a\b\u008b\1\2\u088a\u0115\3\2\2\2\u088b\u088c"+
		"\7\64\2\2\u088c\u088d\7;\2\2\u088d\u088e\5\u018a\u00c6\2\u088e\u088f\7"+
		"<\2\2\u088f\u0890\5\u00f4{\2\u0890\u0891\b\u008c\1\2\u0891\u0117\3\2\2"+
		"\2\u0892\u0893\7\17\2\2\u0893\u0894\5\u00f2z\2\u0894\u0895\7\64\2\2\u0895"+
		"\u0896\7;\2\2\u0896\u0897\5\u018a\u00c6\2\u0897\u0898\7<\2\2\u0898\u0899"+
		"\7A\2\2\u0899\u089a\b\u008d\1\2\u089a\u0119\3\2\2\2\u089b\u089c\5\u011e"+
		"\u0090\2\u089c\u089d\b\u008e\1\2\u089d\u08a2\3\2\2\2\u089e\u089f\5\u0128"+
		"\u0095\2\u089f\u08a0\b\u008e\1\2\u08a0\u08a2\3\2\2\2\u08a1\u089b\3\2\2"+
		"\2\u08a1\u089e\3\2\2\2\u08a2\u011b\3\2\2\2\u08a3\u08a4\5\u0120\u0091\2"+
		"\u08a4\u08a5\b\u008f\1\2\u08a5\u08aa\3\2\2\2\u08a6\u08a7\5";
	private static final String _serializedATNSegment1 =
		"\u012a\u0096\2\u08a7\u08a8\b\u008f\1\2\u08a8\u08aa\3\2\2\2\u08a9\u08a3"+
		"\3\2\2\2\u08a9\u08a6\3\2\2\2\u08aa\u011d\3\2\2\2\u08ab\u08ac\7\27\2\2"+
		"\u08ac\u08b0\7;\2\2\u08ad\u08ae\5\u0122\u0092\2\u08ae\u08af\b\u0090\1"+
		"\2\u08af\u08b1\3\2\2\2\u08b0\u08ad\3\2\2\2\u08b0\u08b1\3\2\2\2\u08b1\u08b2"+
		"\3\2\2\2\u08b2\u08b6\7A\2\2\u08b3\u08b4\5\u018a\u00c6\2\u08b4\u08b5\b"+
		"\u0090\1\2\u08b5\u08b7\3\2\2\2\u08b6\u08b3\3\2\2\2\u08b6\u08b7\3\2\2\2"+
		"\u08b7\u08b8\3\2\2\2\u08b8\u08bc\7A\2\2\u08b9\u08ba\5\u0124\u0093\2\u08ba"+
		"\u08bb\b\u0090\1\2\u08bb\u08bd\3\2\2\2\u08bc\u08b9\3\2\2\2\u08bc\u08bd"+
		"\3\2\2\2\u08bd\u08be\3\2\2\2\u08be\u08bf\7<\2\2\u08bf\u08c0\5\u00f2z\2"+
		"\u08c0\u08c1\b\u0090\1\2\u08c1\u011f\3\2\2\2\u08c2\u08c3\7\27\2\2\u08c3"+
		"\u08c7\7;\2\2\u08c4\u08c5\5\u0122\u0092\2\u08c5\u08c6\b\u0091\1\2\u08c6"+
		"\u08c8\3\2\2\2\u08c7\u08c4\3\2\2\2\u08c7\u08c8\3\2\2\2\u08c8\u08c9\3\2"+
		"\2\2\u08c9\u08cd\7A\2\2\u08ca\u08cb\5\u018a\u00c6\2\u08cb\u08cc\b\u0091"+
		"\1\2\u08cc\u08ce\3\2\2\2\u08cd\u08ca\3\2\2\2\u08cd\u08ce\3\2\2\2\u08ce"+
		"\u08cf\3\2\2\2\u08cf\u08d3\7A\2\2\u08d0\u08d1\5\u0124\u0093\2\u08d1\u08d2"+
		"\b\u0091\1\2\u08d2\u08d4\3\2\2\2\u08d3\u08d0\3\2\2\2\u08d3\u08d4\3\2\2"+
		"\2\u08d4\u08d5\3\2\2\2\u08d5\u08d6\7<\2\2\u08d6\u08d7\5\u00f4{\2\u08d7"+
		"\u08d8\b\u0091\1\2\u08d8\u0121\3\2\2\2\u08d9\u08da\5\u0126\u0094\2\u08da"+
		"\u08db\b\u0092\1\2\u08db\u08e0\3\2\2\2\u08dc\u08dd\5\u00f0y\2\u08dd\u08de"+
		"\b\u0092\1\2\u08de\u08e0\3\2\2\2\u08df\u08d9\3\2\2\2\u08df\u08dc\3\2\2"+
		"\2\u08e0\u0123\3\2\2\2\u08e1\u08e2\5\u0126\u0094\2\u08e2\u08e3\b\u0093"+
		"\1\2\u08e3\u0125\3\2\2\2\u08e4\u08e5\5\u0100\u0081\2\u08e5\u08e6\b\u0094"+
		"\1\2\u08e6\u08ed\3\2\2\2\u08e7\u08e8\7B\2\2\u08e8\u08e9\5\u0100\u0081"+
		"\2\u08e9\u08ea\b\u0094\1\2\u08ea\u08ec\3\2\2\2\u08eb\u08e7\3\2\2\2\u08ec"+
		"\u08ef\3\2\2\2\u08ed\u08eb\3\2\2\2\u08ed\u08ee\3\2\2\2\u08ee\u08f0\3\2"+
		"\2\2\u08ef\u08ed\3\2\2\2\u08f0\u08f1\b\u0094\1\2\u08f1\u0127\3\2\2\2\u08f2"+
		"\u08f3\7\27\2\2\u08f3\u08fc\7;\2\2\u08f4\u08f5\5\u008cG\2\u08f5\u08f6"+
		"\b\u0095\1\2\u08f6\u08fb\3\2\2\2\u08f7\u08f8\5\u00d2j\2\u08f8\u08f9\b"+
		"\u0095\1\2\u08f9\u08fb\3\2\2\2\u08fa\u08f4\3\2\2\2\u08fa\u08f7\3\2\2\2"+
		"\u08fb\u08fe\3\2\2\2\u08fc\u08fa\3\2\2\2\u08fc\u08fd\3\2\2\2\u08fd\u08ff"+
		"\3\2\2\2\u08fe\u08fc\3\2\2\2\u08ff\u0900\5h\65\2\u0900\u0901\7J\2\2\u0901"+
		"\u0902\5\u018a\u00c6\2\u0902\u0903\7<\2\2\u0903\u0904\5\u00f2z\2\u0904"+
		"\u0905\b\u0095\1\2\u0905\u0129\3\2\2\2\u0906\u0907\7\27\2\2\u0907\u0910"+
		"\7;\2\2\u0908\u0909\5\u008cG\2\u0909\u090a\b\u0096\1\2\u090a\u090f\3\2"+
		"\2\2\u090b\u090c\5\u00d2j\2\u090c\u090d\b\u0096\1\2\u090d\u090f\3\2\2"+
		"\2\u090e\u0908\3\2\2\2\u090e\u090b\3\2\2\2\u090f\u0912\3\2\2\2\u0910\u090e"+
		"\3\2\2\2\u0910\u0911\3\2\2\2\u0911\u0913\3\2\2\2\u0912\u0910\3\2\2\2\u0913"+
		"\u0914\5h\65\2\u0914\u0915\7J\2\2\u0915\u0916\5\u018a\u00c6\2\u0916\u0917"+
		"\7<\2\2\u0917\u0918\5\u00f4{\2\u0918\u0919\b\u0096\1\2\u0919\u012b\3\2"+
		"\2\2\u091a\u091d\7\6\2\2\u091b\u091c\7h\2\2\u091c\u091e\b\u0097\1\2\u091d"+
		"\u091b\3\2\2\2\u091d\u091e\3\2\2\2\u091e\u091f\3\2\2\2\u091f\u0920\7A"+
		"\2\2\u0920\u0921\b\u0097\1\2\u0921\u012d\3\2\2\2\u0922\u0925\7\r\2\2\u0923"+
		"\u0924\7h\2\2\u0924\u0926\b\u0098\1\2\u0925\u0923\3\2\2\2\u0925\u0926"+
		"\3\2\2\2\u0926\u0927\3\2\2\2\u0927\u0928\7A\2\2\u0928\u0929\b\u0098\1"+
		"\2\u0929\u012f\3\2\2\2\u092a\u092b\7&\2\2\u092b\u092c\7A\2\2\u092c\u0933"+
		"\b\u0099\1\2\u092d\u092e\7&\2\2\u092e\u092f\5\u018a\u00c6\2\u092f\u0930"+
		"\7A\2\2\u0930\u0931\b\u0099\1\2\u0931\u0933\3\2\2\2\u0932\u092a\3\2\2"+
		"\2\u0932\u092d\3\2\2\2\u0933\u0131\3\2\2\2\u0934\u0935\7.\2\2\u0935\u0936"+
		"\5\u018a\u00c6\2\u0936\u0937\7A\2\2\u0937\u0938\b\u009a\1\2\u0938\u0133"+
		"\3\2\2\2\u0939\u093a\7,\2\2\u093a\u093b\7;\2\2\u093b\u093c\5\u018a\u00c6"+
		"\2\u093c\u093d\7<\2\2\u093d\u093e\5\u00e8u\2\u093e\u093f\b\u009b\1\2\u093f"+
		"\u0135\3\2\2\2\u0940\u0941\7\61\2\2\u0941\u0942\5\u00e8u\2\u0942\u0943"+
		"\5\u0138\u009d\2\u0943\u0944\b\u009c\1\2\u0944\u0953\3\2\2\2\u0945\u0946"+
		"\7\61\2\2\u0946\u094a\5\u00e8u\2\u0947\u0948\5\u0138\u009d\2\u0948\u0949"+
		"\b\u009c\1\2\u0949\u094b\3\2\2\2\u094a\u0947\3\2\2\2\u094a\u094b\3\2\2"+
		"\2\u094b\u094c\3\2\2\2\u094c\u094d\5\u0140\u00a1\2\u094d\u094e\b\u009c"+
		"\1\2\u094e\u0953\3\2\2\2\u094f\u0950\5\u0142\u00a2\2\u0950\u0951\b\u009c"+
		"\1\2\u0951\u0953\3\2\2\2\u0952\u0940\3\2\2\2\u0952\u0945\3\2\2\2\u0952"+
		"\u094f\3\2\2\2\u0953\u0137\3\2\2\2\u0954\u0955\5\u013a\u009e\2\u0955\u095b"+
		"\b\u009d\1\2\u0956\u0957\5\u013a\u009e\2\u0957\u0958\b\u009d\1\2\u0958"+
		"\u095a\3\2\2\2\u0959\u0956\3\2\2\2\u095a\u095d\3\2\2\2\u095b\u0959\3\2"+
		"\2\2\u095b\u095c\3\2\2\2\u095c\u095e\3\2\2\2\u095d\u095b\3\2\2\2\u095e"+
		"\u095f\b\u009d\1\2\u095f\u0139\3\2\2\2\u0960\u0961\7\t\2\2\u0961\u0962"+
		"\b\u009e\1\2\u0962\u0963\7;\2\2\u0963\u0964\5\u013c\u009f\2\u0964\u0965"+
		"\7<\2\2\u0965\u0966\5\u00e8u\2\u0966\u0967\b\u009e\1\2\u0967\u013b\3\2"+
		"\2\2\u0968\u0969\5\u008cG\2\u0969\u096a\b\u009f\1\2\u096a\u096f\3\2\2"+
		"\2\u096b\u096c\5\u00d2j\2\u096c\u096d\b\u009f\1\2\u096d\u096f\3\2\2\2"+
		"\u096e\u0968\3\2\2\2\u096e\u096b\3\2\2\2\u096f\u0972\3\2\2\2\u0970\u096e"+
		"\3\2\2\2\u0970\u0971\3\2\2\2\u0971\u0973\3\2\2\2\u0972\u0970\3\2\2\2\u0973"+
		"\u0974\5\u013e\u00a0\2\u0974\u0975\5f\64\2\u0975\u0976\b\u009f\1\2\u0976"+
		"\u013d\3\2\2\2\u0977\u0978\5t;\2\u0978\u0979\b\u00a0\1\2\u0979\u0980\3"+
		"\2\2\2\u097a\u097b\7X\2\2\u097b\u097c\5\22\n\2\u097c\u097d\b\u00a0\1\2"+
		"\u097d\u097f\3\2\2\2\u097e\u097a\3\2\2\2\u097f\u0982\3\2\2\2\u0980\u097e"+
		"\3\2\2\2\u0980\u0981\3\2\2\2\u0981\u013f\3\2\2\2\u0982\u0980\3\2\2\2\u0983"+
		"\u0984\7\25\2\2\u0984\u0985\5\u00e8u\2\u0985\u0986\b\u00a1\1\2\u0986\u0141"+
		"\3\2\2\2\u0987\u0988\7\61\2\2\u0988\u0989\5\u0144\u00a3\2\u0989\u098d"+
		"\5\u00e8u\2\u098a\u098b\5\u0138\u009d\2\u098b\u098c\b\u00a2\1\2\u098c"+
		"\u098e\3\2\2\2\u098d\u098a\3\2\2\2\u098d\u098e\3\2\2\2\u098e\u0992\3\2"+
		"\2\2\u098f\u0990\5\u0140\u00a1\2\u0990\u0991\b\u00a2\1\2\u0991\u0993\3"+
		"\2\2\2\u0992\u098f\3\2\2\2\u0992\u0993\3\2\2\2\u0993\u0994\3\2\2\2\u0994"+
		"\u0995\b\u00a2\1\2\u0995\u0143\3\2\2\2\u0996\u0997\b\u00a3\1\2\u0997\u099c"+
		"\7;\2\2\u0998\u0999\5\u0146\u00a4\2\u0999\u099a\7A\2\2\u099a\u099b\b\u00a3"+
		"\1\2\u099b\u099d\3\2\2\2\u099c\u0998\3\2\2\2\u099c\u099d\3\2\2\2\u099d"+
		"\u099e\3\2\2\2\u099e\u099f\7<\2\2\u099f\u0145\3\2\2\2\u09a0\u09a1\5\u0148"+
		"\u00a5\2\u09a1\u09a8\b\u00a4\1\2\u09a2\u09a3\7A\2\2\u09a3\u09a4\5\u0148"+
		"\u00a5\2\u09a4\u09a5\b\u00a4\1\2\u09a5\u09a7\3\2\2\2\u09a6\u09a2\3\2\2"+
		"\2\u09a7\u09aa\3\2\2\2\u09a8\u09a6\3\2\2\2\u09a8\u09a9\3\2\2\2\u09a9\u09ab"+
		"\3\2\2\2\u09aa\u09a8\3\2\2\2\u09ab\u09ac\b\u00a4\1\2\u09ac\u0147\3\2\2"+
		"\2\u09ad\u09ae\5\u008cG\2\u09ae\u09af\b\u00a5\1\2\u09af\u09b4\3\2\2\2"+
		"\u09b0\u09b1\5\u00d2j\2\u09b1\u09b2\b\u00a5\1\2\u09b2\u09b4\3\2\2\2\u09b3"+
		"\u09ad\3\2\2\2\u09b3\u09b0\3\2\2\2\u09b4\u09b7\3\2\2\2\u09b5\u09b3\3\2"+
		"\2\2\u09b5\u09b6\3\2\2\2\u09b6\u09b8\3\2\2\2\u09b7\u09b5\3\2\2\2\u09b8"+
		"\u09b9\5h\65\2\u09b9\u09ba\7D\2\2\u09ba\u09bb\5\u018a\u00c6\2\u09bb\u09bc"+
		"\b\u00a5\1\2\u09bc\u0149\3\2\2\2\u09bd\u09be\5\u015a\u00ae\2\u09be\u09bf"+
		"\b\u00a6\1\2\u09bf\u09c4\3\2\2\2\u09c0\u09c1\5\u0182\u00c2\2\u09c1\u09c2"+
		"\b\u00a6\1\2\u09c2\u09c4\3\2\2\2\u09c3\u09bd\3\2\2\2\u09c3\u09c0\3\2\2"+
		"\2\u09c4\u09ca\3\2\2\2\u09c5\u09c6\5\u0154\u00ab\2\u09c6\u09c7\b\u00a6"+
		"\1\2\u09c7\u09c9\3\2\2\2\u09c8\u09c5\3\2\2\2\u09c9\u09cc\3\2\2\2\u09ca"+
		"\u09c8\3\2\2\2\u09ca\u09cb\3\2\2\2\u09cb\u014b\3\2\2\2\u09cc\u09ca\3\2"+
		"\2\2\u09cd\u09ce\5\2\2\2\u09ce\u09cf\b\u00a7\1\2\u09cf\u09ea\3\2\2\2\u09d0"+
		"\u09d1\5\u014e\u00a8\2\u09d1\u09d2\b\u00a7\1\2\u09d2\u09ea\3\2\2\2\u09d3"+
		"\u09d4\7-\2\2\u09d4\u09ea\b\u00a7\1\2\u09d5\u09d6\7;\2\2\u09d6\u09d7\5"+
		"\u018a\u00c6\2\u09d7\u09d8\7<\2\2\u09d8\u09d9\b\u00a7\1\2\u09d9\u09ea"+
		"\3\2\2\2\u09da\u09db\5\u0160\u00b1\2\u09db\u09dc\b\u00a7\1\2\u09dc\u09ea"+
		"\3\2\2\2\u09dd\u09de\5\u0168\u00b5\2\u09de\u09df\b\u00a7\1\2\u09df\u09ea"+
		"\3\2\2\2\u09e0\u09e1\5\u016e\u00b8\2\u09e1\u09e2\b\u00a7\1\2\u09e2\u09ea"+
		"\3\2\2\2\u09e3\u09e4\5\u0174\u00bb\2\u09e4\u09e5\b\u00a7\1\2\u09e5\u09ea"+
		"\3\2\2\2\u09e6\u09e7\5\u017c\u00bf\2\u09e7\u09e8\b\u00a7\1\2\u09e8\u09ea"+
		"\3\2\2\2\u09e9\u09cd\3\2\2\2\u09e9\u09d0\3\2\2\2\u09e9\u09d3\3\2\2\2\u09e9"+
		"\u09d5\3\2\2\2\u09e9\u09da\3\2\2\2\u09e9\u09dd\3\2\2\2\u09e9\u09e0\3\2"+
		"\2\2\u09e9\u09e3\3\2\2\2\u09e9\u09e6\3\2\2\2\u09ea\u014d\3\2\2\2\u09eb"+
		"\u09f1\7h\2\2\u09ec\u09ed\7?\2\2\u09ed\u09ee\7@\2\2\u09ee\u09f0\b\u00a8"+
		"\1\2\u09ef\u09ec\3\2\2\2\u09f0\u09f3\3\2\2\2\u09f1\u09ef\3\2\2\2\u09f1"+
		"\u09f2\3\2\2\2\u09f2\u09f4\3\2\2\2\u09f3\u09f1\3\2\2\2\u09f4\u09f5\7C"+
		"\2\2\u09f5\u09f6\7\13\2\2\u09f6\u0a10\b\u00a8\1\2\u09f7\u09f8\5\60\31"+
		"\2\u09f8\u09f9\7C\2\2\u09f9\u09ff\7h\2\2\u09fa\u09fb\7?\2\2\u09fb\u09fc"+
		"\7@\2\2\u09fc\u09fe\b\u00a8\1\2\u09fd\u09fa\3\2\2\2\u09fe\u0a01\3\2\2"+
		"\2\u09ff\u09fd\3\2\2\2\u09ff\u0a00\3\2\2\2\u0a00\u0a02\3\2\2\2\u0a01\u09ff"+
		"\3\2\2\2\u0a02\u0a03\7C\2\2\u0a03\u0a04\7\13\2\2\u0a04\u0a05\b\u00a8\1"+
		"\2\u0a05\u0a10\3\2\2\2\u0a06\u0a07\7\62\2\2\u0a07\u0a08\7C\2\2\u0a08\u0a09"+
		"\7\13\2\2\u0a09\u0a10\b\u00a8\1\2\u0a0a\u0a0b\5.\30\2\u0a0b\u0a0c\7C\2"+
		"\2\u0a0c\u0a0d\7-\2\2\u0a0d\u0a0e\b\u00a8\1\2\u0a0e\u0a10\3\2\2\2\u0a0f"+
		"\u09eb\3\2\2\2\u0a0f\u09f7\3\2\2\2\u0a0f\u0a06\3\2\2\2\u0a0f\u0a0a\3\2"+
		"\2\2\u0a10\u014f\3\2\2\2\u0a11\u0a12\3\2\2\2\u0a12\u0151\3\2\2\2\u0a13"+
		"\u0a14\5\2\2\2\u0a14\u0a15\b\u00aa\1\2\u0a15\u0a2d\3\2\2\2\u0a16\u0a17"+
		"\5\u014e\u00a8\2\u0a17\u0a18\b\u00aa\1\2\u0a18\u0a2d\3\2\2\2\u0a19\u0a1a"+
		"\7-\2\2\u0a1a\u0a2d\b\u00aa\1\2\u0a1b\u0a1c\7;\2\2\u0a1c\u0a1d\5\u018a"+
		"\u00c6\2\u0a1d\u0a1e\7<\2\2\u0a1e\u0a1f\b\u00aa\1\2\u0a1f\u0a2d\3\2\2"+
		"\2\u0a20\u0a21\5\u0160\u00b1\2\u0a21\u0a22\b\u00aa\1\2\u0a22\u0a2d\3\2"+
		"\2\2\u0a23\u0a24\5\u0168\u00b5\2\u0a24\u0a25\b\u00aa\1\2\u0a25\u0a2d\3"+
		"\2\2\2\u0a26\u0a27\5\u0174\u00bb\2\u0a27\u0a28\b\u00aa\1\2\u0a28\u0a2d"+
		"\3\2\2\2\u0a29\u0a2a\5\u017c\u00bf\2\u0a2a\u0a2b\b\u00aa\1\2\u0a2b\u0a2d"+
		"\3\2\2\2\u0a2c\u0a13\3\2\2\2\u0a2c\u0a16\3\2\2\2\u0a2c\u0a19\3\2\2\2\u0a2c"+
		"\u0a1b\3\2\2\2\u0a2c\u0a20\3\2\2\2\u0a2c\u0a23\3\2\2\2\u0a2c\u0a26\3\2"+
		"\2\2\u0a2c\u0a29\3\2\2\2\u0a2d\u0153\3\2\2\2\u0a2e\u0a2f\5\u0162\u00b2"+
		"\2\u0a2f\u0a30\b\u00ab\1\2\u0a30\u0a3e\3\2\2\2\u0a31\u0a32\5\u016a\u00b6"+
		"\2\u0a32\u0a33\b\u00ab\1\2\u0a33\u0a3e\3\2\2\2\u0a34\u0a35\5\u0170\u00b9"+
		"\2\u0a35\u0a36\b\u00ab\1\2\u0a36\u0a3e\3\2\2\2\u0a37\u0a38\5\u0176\u00bc"+
		"\2\u0a38\u0a39\b\u00ab\1\2\u0a39\u0a3e\3\2\2\2\u0a3a\u0a3b\5\u017e\u00c0"+
		"\2\u0a3b\u0a3c\b\u00ab\1\2\u0a3c\u0a3e\3\2\2\2\u0a3d\u0a2e\3\2\2\2\u0a3d"+
		"\u0a31\3\2\2\2\u0a3d\u0a34\3\2\2\2\u0a3d\u0a37\3\2\2\2\u0a3d\u0a3a\3\2"+
		"\2\2\u0a3e\u0155\3\2\2\2\u0a3f\u0a40\3\2\2\2\u0a40\u0157\3\2\2\2\u0a41"+
		"\u0a42\5\u0162\u00b2\2\u0a42\u0a43\b\u00ad\1\2\u0a43\u0a4e\3\2\2\2\u0a44"+
		"\u0a45\5\u016a\u00b6\2\u0a45\u0a46\b\u00ad\1\2\u0a46\u0a4e\3\2\2\2\u0a47"+
		"\u0a48\5\u0176\u00bc\2\u0a48\u0a49\b\u00ad\1\2\u0a49\u0a4e\3\2\2\2\u0a4a"+
		"\u0a4b\5\u017e\u00c0\2\u0a4b\u0a4c\b\u00ad\1\2\u0a4c\u0a4e\3\2\2\2\u0a4d"+
		"\u0a41\3\2\2\2\u0a4d\u0a44\3\2\2\2\u0a4d\u0a47\3\2\2\2\u0a4d\u0a4a\3\2"+
		"\2\2\u0a4e\u0159\3\2\2\2\u0a4f\u0a50\5\2\2\2\u0a50\u0a51\b\u00ae\1\2\u0a51"+
		"\u0a79\3\2\2\2\u0a52\u0a53\5\u014e\u00a8\2\u0a53\u0a54\b\u00ae\1\2\u0a54"+
		"\u0a79\3\2\2\2\u0a55\u0a5b\5n8\2\u0a56\u0a57\7?\2\2\u0a57\u0a58\7@\2\2"+
		"\u0a58\u0a5a\b\u00ae\1\2\u0a59\u0a56\3\2\2\2\u0a5a\u0a5d\3\2\2\2\u0a5b"+
		"\u0a59\3\2\2\2\u0a5b\u0a5c\3\2\2\2\u0a5c\u0a5e\3\2\2\2\u0a5d\u0a5b\3\2"+
		"\2\2\u0a5e\u0a5f\7C\2\2\u0a5f\u0a60\7\13\2\2\u0a60\u0a61\b\u00ae\1\2\u0a61"+
		"\u0a79\3\2\2\2\u0a62\u0a63\7-\2\2\u0a63\u0a79\b\u00ae\1\2\u0a64\u0a65"+
		"\7;\2\2\u0a65\u0a66\5\u018a\u00c6\2\u0a66\u0a67\7<\2\2\u0a67\u0a68\b\u00ae"+
		"\1\2\u0a68\u0a79\3\2\2\2\u0a69\u0a6a\5\u0164\u00b3\2\u0a6a\u0a6b\b\u00ae"+
		"\1\2\u0a6b\u0a79\3\2\2\2\u0a6c\u0a6d\5\u016c\u00b7\2\u0a6d\u0a6e\b\u00ae"+
		"\1\2\u0a6e\u0a79\3\2\2\2\u0a6f\u0a70\5\u0172\u00ba\2\u0a70\u0a71\b\u00ae"+
		"\1\2\u0a71\u0a79\3\2\2\2\u0a72\u0a73\5\u0178\u00bd\2\u0a73\u0a74\b\u00ae"+
		"\1\2\u0a74\u0a79\3\2\2\2\u0a75\u0a76\5\u0180\u00c1\2\u0a76\u0a77\b\u00ae"+
		"\1\2\u0a77\u0a79\3\2\2\2\u0a78\u0a4f\3\2\2\2\u0a78\u0a52\3\2\2\2\u0a78"+
		"\u0a55\3\2\2\2\u0a78\u0a62\3\2\2\2\u0a78\u0a64\3\2\2\2\u0a78\u0a69\3\2"+
		"\2\2\u0a78\u0a6c\3\2\2\2\u0a78\u0a6f\3\2\2\2\u0a78\u0a72\3\2\2\2\u0a78"+
		"\u0a75\3\2\2\2\u0a79\u015b\3\2\2\2\u0a7a\u0a7b\3\2\2\2\u0a7b\u015d\3\2"+
		"\2\2\u0a7c\u0a7d\5\2\2\2\u0a7d\u0a7e\b\u00b0\1\2\u0a7e\u0aa3\3\2\2\2\u0a7f"+
		"\u0a80\5\u014e\u00a8\2\u0a80\u0a81\b\u00b0\1\2\u0a81\u0aa3\3\2\2\2\u0a82"+
		"\u0a88\5n8\2\u0a83\u0a84\7?\2\2\u0a84\u0a85\7@\2\2\u0a85\u0a87\b\u00b0"+
		"\1\2\u0a86\u0a83\3\2\2\2\u0a87\u0a8a\3\2\2\2\u0a88\u0a86\3\2\2\2\u0a88"+
		"\u0a89\3\2\2\2\u0a89\u0a8b\3\2\2\2\u0a8a\u0a88\3\2\2\2\u0a8b\u0a8c\7C"+
		"\2\2\u0a8c\u0a8d\7\13\2\2\u0a8d\u0a8e\b\u00b0\1\2\u0a8e\u0aa3\3\2\2\2"+
		"\u0a8f\u0a90\7-\2\2\u0a90\u0aa3\b\u00b0\1\2\u0a91\u0a92\7;\2\2\u0a92\u0a93"+
		"\5\u018a\u00c6\2\u0a93\u0a94\7<\2\2\u0a94\u0a95\b\u00b0\1\2\u0a95\u0aa3"+
		"\3\2\2\2\u0a96\u0a97\5\u0164\u00b3\2\u0a97\u0a98\b\u00b0\1\2\u0a98\u0aa3"+
		"\3\2\2\2\u0a99\u0a9a\5\u016c\u00b7\2\u0a9a\u0a9b\b\u00b0\1\2\u0a9b\u0aa3"+
		"\3\2\2\2\u0a9c\u0a9d\5\u0178\u00bd\2\u0a9d\u0a9e\b\u00b0\1\2\u0a9e\u0aa3"+
		"\3\2\2\2\u0a9f\u0aa0\5\u0180\u00c1\2\u0aa0\u0aa1\b\u00b0\1\2\u0aa1\u0aa3"+
		"\3\2\2\2\u0aa2\u0a7c\3\2\2\2\u0aa2\u0a7f\3\2\2\2\u0aa2\u0a82\3\2\2\2\u0aa2"+
		"\u0a8f\3\2\2\2\u0aa2\u0a91\3\2\2\2\u0aa2\u0a96\3\2\2\2\u0aa2\u0a99\3\2"+
		"\2\2\u0aa2\u0a9c\3\2\2\2\u0aa2\u0a9f\3\2\2\2\u0aa3\u015f\3\2\2\2\u0aa4"+
		"\u0aa8\7!\2\2\u0aa5\u0aa6\5$\23\2\u0aa6\u0aa7\b\u00b1\1\2\u0aa7\u0aa9"+
		"\3\2\2\2\u0aa8\u0aa5\3\2\2\2\u0aa8\u0aa9\3\2\2\2\u0aa9\u0aaf\3\2\2\2\u0aaa"+
		"\u0aab\5\u00d2j\2\u0aab\u0aac\b\u00b1\1\2\u0aac\u0aae\3\2\2\2\u0aad\u0aaa"+
		"\3\2\2\2\u0aae\u0ab1\3\2\2\2\u0aaf\u0aad\3\2\2\2\u0aaf\u0ab0\3\2\2\2\u0ab0"+
		"\u0ab2\3\2\2\2\u0ab1\u0aaf\3\2\2\2\u0ab2\u0ab3\7h\2\2\u0ab3\u0ac1\b\u00b1"+
		"\1\2\u0ab4\u0aba\7C\2\2\u0ab5\u0ab6\5\u00d2j\2\u0ab6\u0ab7\b\u00b1\1\2"+
		"\u0ab7\u0ab9\3\2\2\2\u0ab8\u0ab5\3\2\2\2\u0ab9\u0abc\3\2\2\2\u0aba\u0ab8"+
		"\3\2\2\2\u0aba\u0abb\3\2\2\2\u0abb\u0abd\3\2\2\2\u0abc\u0aba\3\2\2\2\u0abd"+
		"\u0abe\7h\2\2\u0abe\u0ac0\b\u00b1\1\2\u0abf\u0ab4\3\2\2\2\u0ac0\u0ac3"+
		"\3\2\2\2\u0ac1\u0abf\3\2\2\2\u0ac1\u0ac2\3\2\2\2\u0ac2\u0ac7\3\2\2\2\u0ac3"+
		"\u0ac1\3\2\2\2\u0ac4\u0ac5\5\u0166\u00b4\2\u0ac5\u0ac6\b\u00b1\1\2\u0ac6"+
		"\u0ac8\3\2\2\2\u0ac7\u0ac4\3\2\2\2\u0ac7\u0ac8\3\2\2\2\u0ac8\u0ac9\3\2"+
		"\2\2\u0ac9\u0acd\7;\2\2\u0aca\u0acb\5\u017a\u00be\2\u0acb\u0acc\b\u00b1"+
		"\1\2\u0acc\u0ace\3\2\2\2\u0acd\u0aca\3\2\2\2\u0acd\u0ace\3\2\2\2\u0ace"+
		"\u0acf\3\2\2\2\u0acf\u0ad0\7<\2\2\u0ad0\u0ad2\b\u00b1\1\2\u0ad1\u0ad3"+
		"\5X-\2\u0ad2\u0ad1\3\2\2\2\u0ad2\u0ad3\3\2\2\2\u0ad3\u0b19\3\2\2\2\u0ad4"+
		"\u0ad5\5\62\32\2\u0ad5\u0ad6\7C\2\2\u0ad6\u0ada\7!\2\2\u0ad7\u0ad8\5$"+
		"\23\2\u0ad8\u0ad9\b\u00b1\1\2\u0ad9\u0adb\3\2\2\2\u0ada\u0ad7\3\2\2\2"+
		"\u0ada\u0adb\3\2\2\2\u0adb\u0ae1\3\2\2\2\u0adc\u0add\5\u00d2j\2\u0add"+
		"\u0ade\b\u00b1\1\2\u0ade\u0ae0\3\2\2\2\u0adf\u0adc\3\2\2\2\u0ae0\u0ae3"+
		"\3\2\2\2\u0ae1\u0adf\3\2\2\2\u0ae1\u0ae2\3\2\2\2\u0ae2\u0ae4\3\2\2\2\u0ae3"+
		"\u0ae1\3\2\2\2\u0ae4\u0ae5\7h\2\2\u0ae5\u0ae9\b\u00b1\1\2\u0ae6\u0ae7"+
		"\5\u0166\u00b4\2\u0ae7\u0ae8\b\u00b1\1\2\u0ae8\u0aea\3\2\2\2\u0ae9\u0ae6"+
		"\3\2\2\2\u0ae9\u0aea\3\2\2\2\u0aea\u0aeb\3\2\2\2\u0aeb\u0aef\7;\2\2\u0aec"+
		"\u0aed\5\u017a\u00be\2\u0aed\u0aee\b\u00b1\1\2\u0aee\u0af0\3\2\2\2\u0aef"+
		"\u0aec\3\2\2\2\u0aef\u0af0\3\2\2\2\u0af0\u0af1\3\2\2\2\u0af1\u0af2\7<"+
		"\2\2\u0af2\u0af4\b\u00b1\1\2\u0af3\u0af5\5X-\2\u0af4\u0af3\3\2\2\2\u0af4"+
		"\u0af5\3\2\2\2\u0af5\u0b19\3\2\2\2\u0af6\u0af7\5\u014a\u00a6\2\u0af7\u0af8"+
		"\7C\2\2\u0af8\u0afc\7!\2\2\u0af9\u0afa\5$\23\2\u0afa\u0afb\b\u00b1\1\2"+
		"\u0afb\u0afd\3\2\2\2\u0afc\u0af9\3\2\2\2\u0afc\u0afd\3\2\2\2\u0afd\u0b03"+
		"\3\2\2\2\u0afe\u0aff\5\u00d2j\2\u0aff\u0b00\b\u00b1\1\2\u0b00\u0b02\3"+
		"\2\2\2\u0b01\u0afe\3\2\2\2\u0b02\u0b05\3\2\2\2\u0b03\u0b01\3\2\2\2\u0b03"+
		"\u0b04\3\2\2\2\u0b04\u0b06\3\2\2\2\u0b05\u0b03\3\2\2\2\u0b06\u0b07\7h"+
		"\2\2\u0b07\u0b0b\b\u00b1\1\2\u0b08\u0b09\5\u0166\u00b4\2\u0b09\u0b0a\b"+
		"\u00b1\1\2\u0b0a\u0b0c\3\2\2\2\u0b0b\u0b08\3\2\2\2\u0b0b\u0b0c\3\2\2\2"+
		"\u0b0c\u0b0d\3\2\2\2\u0b0d\u0b11\7;\2\2\u0b0e\u0b0f\5\u017a\u00be\2\u0b0f"+
		"\u0b10\b\u00b1\1\2\u0b10\u0b12\3\2\2\2\u0b11\u0b0e\3\2\2\2\u0b11\u0b12"+
		"\3\2\2\2\u0b12\u0b13\3\2\2\2\u0b13\u0b14\7<\2\2\u0b14\u0b16\b\u00b1\1"+
		"\2\u0b15\u0b17\5X-\2\u0b16\u0b15\3\2\2\2\u0b16\u0b17\3\2\2\2\u0b17\u0b19"+
		"\3\2\2\2\u0b18\u0aa4\3\2\2\2\u0b18\u0ad4\3\2\2\2\u0b18\u0af6\3\2\2\2\u0b19"+
		"\u0161\3\2\2\2\u0b1a\u0b1b\7C\2\2\u0b1b\u0b1f\7!\2\2\u0b1c\u0b1d\5$\23"+
		"\2\u0b1d\u0b1e\b\u00b2\1\2\u0b1e\u0b20\3\2\2\2\u0b1f\u0b1c\3\2\2\2\u0b1f"+
		"\u0b20\3\2\2\2\u0b20\u0b26\3\2\2\2\u0b21\u0b22\5\u00d2j\2\u0b22\u0b23"+
		"\b\u00b2\1\2\u0b23\u0b25\3\2\2\2\u0b24\u0b21\3\2\2\2\u0b25\u0b28\3\2\2"+
		"\2\u0b26\u0b24\3\2\2\2\u0b26\u0b27\3\2\2\2\u0b27\u0b29\3\2\2\2\u0b28\u0b26"+
		"\3\2\2\2\u0b29\u0b2a\7h\2\2\u0b2a\u0b2e\b\u00b2\1\2\u0b2b\u0b2c\5\u0166"+
		"\u00b4\2\u0b2c\u0b2d\b\u00b2\1\2\u0b2d\u0b2f\3\2\2\2\u0b2e\u0b2b\3\2\2"+
		"\2\u0b2e\u0b2f\3\2\2\2\u0b2f\u0b30\3\2\2\2\u0b30\u0b34\7;\2\2\u0b31\u0b32"+
		"\5\u017a\u00be\2\u0b32\u0b33\b\u00b2\1\2\u0b33\u0b35\3\2\2\2\u0b34\u0b31"+
		"\3\2\2\2\u0b34\u0b35\3\2\2\2\u0b35\u0b36\3\2\2\2\u0b36\u0b37\7<\2\2\u0b37"+
		"\u0b39\b\u00b2\1\2\u0b38\u0b3a\5X-\2\u0b39\u0b38\3\2\2\2\u0b39\u0b3a\3"+
		"\2\2\2\u0b3a\u0163\3\2\2\2\u0b3b\u0b3f\7!\2\2\u0b3c\u0b3d\5$\23\2\u0b3d"+
		"\u0b3e\b\u00b3\1\2\u0b3e\u0b40\3\2\2\2\u0b3f\u0b3c\3\2\2\2\u0b3f\u0b40"+
		"\3\2\2\2\u0b40\u0b46\3\2\2\2\u0b41\u0b42\5\u00d2j\2\u0b42\u0b43\b\u00b3"+
		"\1\2\u0b43\u0b45\3\2\2\2\u0b44\u0b41\3\2\2\2\u0b45\u0b48\3\2\2\2\u0b46"+
		"\u0b44\3\2\2\2\u0b46\u0b47\3\2\2\2\u0b47\u0b49\3\2\2\2\u0b48\u0b46\3\2"+
		"\2\2\u0b49\u0b4a\7h\2\2\u0b4a\u0b58\b\u00b3\1\2\u0b4b\u0b51\7C\2\2\u0b4c"+
		"\u0b4d\5\u00d2j\2\u0b4d\u0b4e\b\u00b3\1\2\u0b4e\u0b50\3\2\2\2\u0b4f\u0b4c"+
		"\3\2\2\2\u0b50\u0b53\3\2\2\2\u0b51\u0b4f\3\2\2\2\u0b51\u0b52\3\2\2\2\u0b52"+
		"\u0b54\3\2\2\2\u0b53\u0b51\3\2\2\2\u0b54\u0b55\7h\2\2\u0b55\u0b57\b\u00b3"+
		"\1\2\u0b56\u0b4b\3\2\2\2\u0b57\u0b5a\3\2\2\2\u0b58\u0b56\3\2\2\2\u0b58"+
		"\u0b59\3\2\2\2\u0b59\u0b5e\3\2\2\2\u0b5a\u0b58\3\2\2\2\u0b5b\u0b5c\5\u0166"+
		"\u00b4\2\u0b5c\u0b5d\b\u00b3\1\2\u0b5d\u0b5f\3\2\2\2\u0b5e\u0b5b\3\2\2"+
		"\2\u0b5e\u0b5f\3\2\2\2\u0b5f\u0b60\3\2\2\2\u0b60\u0b64\7;\2\2\u0b61\u0b62"+
		"\5\u017a\u00be\2\u0b62\u0b63\b\u00b3\1\2\u0b63\u0b65\3\2\2\2\u0b64\u0b61"+
		"\3\2\2\2\u0b64\u0b65\3\2\2\2\u0b65\u0b66\3\2\2\2\u0b66\u0b67\7<\2\2\u0b67"+
		"\u0b69\b\u00b3\1\2\u0b68\u0b6a\5X-\2\u0b69\u0b68\3\2\2\2\u0b69\u0b6a\3"+
		"\2\2\2\u0b6a\u0b8e\3\2\2\2\u0b6b\u0b6c\5\62\32\2\u0b6c\u0b6d\7C\2\2\u0b6d"+
		"\u0b71\7!\2\2\u0b6e\u0b6f\5$\23\2\u0b6f\u0b70\b\u00b3\1\2\u0b70\u0b72"+
		"\3\2\2\2\u0b71\u0b6e\3\2\2\2\u0b71\u0b72\3\2\2\2\u0b72\u0b78\3\2\2\2\u0b73"+
		"\u0b74\5\u00d2j\2\u0b74\u0b75\b\u00b3\1\2\u0b75\u0b77\3\2\2\2\u0b76\u0b73"+
		"\3\2\2\2\u0b77\u0b7a\3\2\2\2\u0b78\u0b76\3\2\2\2\u0b78\u0b79\3\2\2\2\u0b79"+
		"\u0b7b\3\2\2\2\u0b7a\u0b78\3\2\2\2\u0b7b\u0b7c\7h\2\2\u0b7c\u0b80\b\u00b3"+
		"\1\2\u0b7d\u0b7e\5\u0166\u00b4\2\u0b7e\u0b7f\b\u00b3\1\2\u0b7f\u0b81\3"+
		"\2\2\2\u0b80\u0b7d\3\2\2\2\u0b80\u0b81\3\2\2\2\u0b81\u0b82\3\2\2\2\u0b82"+
		"\u0b86\7;\2\2\u0b83\u0b84\5\u017a\u00be\2\u0b84\u0b85\b\u00b3\1\2\u0b85"+
		"\u0b87\3\2\2\2\u0b86\u0b83\3\2\2\2\u0b86\u0b87\3\2\2\2\u0b87\u0b88\3\2"+
		"\2\2\u0b88\u0b89\7<\2\2\u0b89\u0b8b\b\u00b3\1\2\u0b8a\u0b8c\5X-\2\u0b8b"+
		"\u0b8a\3\2\2\2\u0b8b\u0b8c\3\2\2\2\u0b8c\u0b8e\3\2\2\2\u0b8d\u0b3b\3\2"+
		"\2\2\u0b8d\u0b6b\3\2\2\2\u0b8e\u0165\3\2\2\2\u0b8f\u0b90\5$\23\2\u0b90"+
		"\u0b91\b\u00b4\1\2\u0b91\u0b96\3\2\2\2\u0b92\u0b93\7F\2\2\u0b93\u0b94"+
		"\7E\2\2\u0b94\u0b96\b\u00b4\1\2\u0b95\u0b8f\3\2\2\2\u0b95\u0b92\3\2\2"+
		"\2\u0b96\u0167\3\2\2\2\u0b97\u0b98\5\u014a\u00a6\2\u0b98\u0b99\7C\2\2"+
		"\u0b99\u0b9a\7h\2\2\u0b9a\u0b9b\b\u00b5\1\2\u0b9b\u0ba8\3\2\2\2\u0b9c"+
		"\u0b9d\7*\2\2\u0b9d\u0b9e\7C\2\2\u0b9e\u0b9f\7h\2\2\u0b9f\u0ba8\b\u00b5"+
		"\1\2\u0ba0\u0ba1\5.\30\2\u0ba1\u0ba2\7C\2\2\u0ba2\u0ba3\7*\2\2\u0ba3\u0ba4"+
		"\7C\2\2\u0ba4\u0ba5\7h\2\2\u0ba5\u0ba6\b\u00b5\1\2\u0ba6\u0ba8\3\2\2\2"+
		"\u0ba7\u0b97\3\2\2\2\u0ba7\u0b9c\3\2\2\2\u0ba7\u0ba0\3\2\2\2\u0ba8\u0169"+
		"\3\2\2\2\u0ba9\u0baa\7C\2\2\u0baa\u0bab\7h\2\2\u0bab\u0bac\b\u00b6\1\2"+
		"\u0bac\u016b\3\2\2\2\u0bad\u0bae\7*\2\2\u0bae\u0baf\7C\2\2\u0baf\u0bb0"+
		"\7h\2\2\u0bb0\u0bb9\b\u00b7\1\2\u0bb1\u0bb2\5.\30\2\u0bb2\u0bb3\7C\2\2"+
		"\u0bb3\u0bb4\7*\2\2\u0bb4\u0bb5\7C\2\2\u0bb5\u0bb6\7h\2\2\u0bb6\u0bb7"+
		"\b\u00b7\1\2\u0bb7\u0bb9\3\2\2\2\u0bb8\u0bad\3\2\2\2\u0bb8\u0bb1\3\2\2"+
		"\2\u0bb9\u016d\3\2\2\2\u0bba\u0bbb\5\62\32\2\u0bbb\u0bbc\7?\2\2\u0bbc"+
		"\u0bbd\5\u018a\u00c6\2\u0bbd\u0bbe\7@\2\2\u0bbe\u0bbf\b\u00b8\1\2\u0bbf"+
		"\u0bc7\3\2\2\2\u0bc0\u0bc1\5\u0152\u00aa\2\u0bc1\u0bc2\7?\2\2\u0bc2\u0bc3"+
		"\5\u018a\u00c6\2\u0bc3\u0bc4\7@\2\2\u0bc4\u0bc5\b\u00b8\1\2\u0bc5\u0bc7"+
		"\3\2\2\2\u0bc6\u0bba\3\2\2\2\u0bc6\u0bc0\3\2\2\2\u0bc7\u0bd0\3\2\2\2\u0bc8"+
		"\u0bc9\5\u0150\u00a9\2\u0bc9\u0bca\7?\2\2\u0bca\u0bcb\5\u018a\u00c6\2"+
		"\u0bcb\u0bcc\7@\2\2\u0bcc\u0bcd\b\u00b8\1\2\u0bcd\u0bcf\3\2\2\2\u0bce"+
		"\u0bc8\3\2\2\2\u0bcf\u0bd2\3\2\2\2\u0bd0\u0bce\3\2\2\2\u0bd0\u0bd1\3\2"+
		"\2\2\u0bd1\u016f\3\2\2\2\u0bd2\u0bd0\3\2\2\2\u0bd3\u0bd4\5\u0158\u00ad"+
		"\2\u0bd4\u0bd5\7?\2\2\u0bd5\u0bd6\5\u018a\u00c6\2\u0bd6\u0bd7\7@\2\2\u0bd7"+
		"\u0bd8\b\u00b9\1\2\u0bd8\u0be1\3\2\2\2\u0bd9\u0bda\5\u0156\u00ac\2\u0bda"+
		"\u0bdb\7?\2\2\u0bdb\u0bdc\5\u018a\u00c6\2\u0bdc\u0bdd\7@\2\2\u0bdd\u0bde"+
		"\b\u00b9\1\2\u0bde\u0be0\3\2\2\2\u0bdf\u0bd9\3\2\2\2\u0be0\u0be3\3\2\2"+
		"\2\u0be1\u0bdf\3\2\2\2\u0be1\u0be2\3\2\2\2\u0be2\u0171\3\2\2\2\u0be3\u0be1"+
		"\3\2\2\2\u0be4\u0be5\5\62\32\2\u0be5\u0be6\7?\2\2\u0be6\u0be7\5\u018a"+
		"\u00c6\2\u0be7\u0be8\7@\2\2\u0be8\u0be9\b\u00ba\1\2\u0be9\u0bf1\3\2\2"+
		"\2\u0bea\u0beb\5\u015e\u00b0\2\u0beb\u0bec\7?\2\2\u0bec\u0bed\5\u018a"+
		"\u00c6\2\u0bed\u0bee\7@\2\2\u0bee\u0bef\b\u00ba\1\2\u0bef\u0bf1\3\2\2"+
		"\2\u0bf0\u0be4\3\2\2\2\u0bf0\u0bea\3\2\2\2\u0bf1\u0bfa\3\2\2\2\u0bf2\u0bf3"+
		"\5\u015c\u00af\2\u0bf3\u0bf4\7?\2\2\u0bf4\u0bf5\5\u018a\u00c6\2\u0bf5"+
		"\u0bf6\7@\2\2\u0bf6\u0bf7\b\u00ba\1\2\u0bf7\u0bf9\3\2\2\2\u0bf8\u0bf2"+
		"\3\2\2\2\u0bf9\u0bfc\3\2\2\2\u0bfa\u0bf8\3\2\2\2\u0bfa\u0bfb\3\2\2\2\u0bfb"+
		"\u0173\3\2\2\2\u0bfc\u0bfa\3\2\2\2\u0bfd\u0bfe\7h\2\2\u0bfe\u0c02\7;\2"+
		"\2\u0bff\u0c00\5\u017a\u00be\2\u0c00\u0c01\b\u00bb\1\2\u0c01\u0c03\3\2"+
		"\2\2\u0c02\u0bff\3\2\2\2\u0c02\u0c03\3\2\2\2\u0c03\u0c04\3\2\2\2\u0c04"+
		"\u0c05\7<\2\2\u0c05\u0c5d\b\u00bb\1\2\u0c06\u0c07\5.\30\2\u0c07\u0c0b"+
		"\7C\2\2\u0c08\u0c09\5$\23\2\u0c09\u0c0a\b\u00bb\1\2\u0c0a\u0c0c\3\2\2"+
		"\2\u0c0b\u0c08\3\2\2\2\u0c0b\u0c0c\3\2\2\2\u0c0c\u0c0d\3\2\2\2\u0c0d\u0c0e"+
		"\7h\2\2\u0c0e\u0c12\7;\2\2\u0c0f\u0c10\5\u017a\u00be\2\u0c10\u0c11\b\u00bb"+
		"\1\2\u0c11\u0c13\3\2\2\2\u0c12\u0c0f\3\2\2\2\u0c12\u0c13\3\2\2\2\u0c13"+
		"\u0c14\3\2\2\2\u0c14\u0c15\7<\2\2\u0c15\u0c16\b\u00bb\1\2\u0c16\u0c5d"+
		"\3\2\2\2\u0c17\u0c18\5\62\32\2\u0c18\u0c1c\7C\2\2\u0c19\u0c1a\5$\23\2"+
		"\u0c1a\u0c1b\b\u00bb\1\2\u0c1b\u0c1d\3\2\2\2\u0c1c\u0c19\3\2\2\2\u0c1c"+
		"\u0c1d\3\2\2\2\u0c1d\u0c1e\3\2\2\2\u0c1e\u0c1f\7h\2\2\u0c1f\u0c23\7;\2"+
		"\2\u0c20\u0c21\5\u017a\u00be\2\u0c21\u0c22\b\u00bb\1\2\u0c22\u0c24\3\2"+
		"\2\2\u0c23\u0c20\3\2\2\2\u0c23\u0c24\3\2\2\2\u0c24\u0c25\3\2\2\2\u0c25"+
		"\u0c26\7<\2\2\u0c26\u0c27\b\u00bb\1\2\u0c27\u0c5d\3\2\2\2\u0c28\u0c29"+
		"\5\u014a\u00a6\2\u0c29\u0c2d\7C\2\2\u0c2a\u0c2b\5$\23\2\u0c2b\u0c2c\b"+
		"\u00bb\1\2\u0c2c\u0c2e\3\2\2\2\u0c2d\u0c2a\3\2\2\2\u0c2d\u0c2e\3\2\2\2"+
		"\u0c2e\u0c2f\3\2\2\2\u0c2f\u0c30\7h\2\2\u0c30\u0c34\7;\2\2\u0c31\u0c32"+
		"\5\u017a\u00be\2\u0c32\u0c33\b\u00bb\1\2\u0c33\u0c35\3\2\2\2\u0c34\u0c31"+
		"\3\2\2\2\u0c34\u0c35\3\2\2\2\u0c35\u0c36\3\2\2\2\u0c36\u0c37\7<\2\2\u0c37"+
		"\u0c38\b\u00bb\1\2\u0c38\u0c5d\3\2\2\2\u0c39\u0c3a\7*\2\2\u0c3a\u0c3e"+
		"\7C\2\2\u0c3b\u0c3c\5$\23\2\u0c3c\u0c3d\b\u00bb\1\2\u0c3d\u0c3f\3\2\2"+
		"\2\u0c3e\u0c3b\3\2\2\2\u0c3e\u0c3f\3\2\2\2\u0c3f\u0c40\3\2\2\2\u0c40\u0c41"+
		"\7h\2\2\u0c41\u0c45\7;\2\2\u0c42\u0c43\5\u017a\u00be\2\u0c43\u0c44\b\u00bb"+
		"\1\2\u0c44\u0c46\3\2\2\2\u0c45\u0c42\3\2\2\2\u0c45\u0c46\3\2\2\2\u0c46"+
		"\u0c47\3\2\2\2\u0c47\u0c48\7<\2\2\u0c48\u0c5d\b\u00bb\1\2\u0c49\u0c4a"+
		"\5.\30\2\u0c4a\u0c4b\7C\2\2\u0c4b\u0c4c\7*\2\2\u0c4c\u0c50\7C\2\2\u0c4d"+
		"\u0c4e\5$\23\2\u0c4e\u0c4f\b\u00bb\1\2\u0c4f\u0c51\3\2\2\2\u0c50\u0c4d"+
		"\3\2\2\2\u0c50\u0c51\3\2\2\2\u0c51\u0c52\3\2\2\2\u0c52\u0c53\7h\2\2\u0c53"+
		"\u0c57\7;\2\2\u0c54\u0c55\5\u017a\u00be\2\u0c55\u0c56\b\u00bb\1\2\u0c56"+
		"\u0c58\3\2\2\2\u0c57\u0c54\3\2\2\2\u0c57\u0c58\3\2\2\2\u0c58\u0c59\3\2"+
		"\2\2\u0c59\u0c5a\7<\2\2\u0c5a\u0c5b\b\u00bb\1\2\u0c5b\u0c5d\3\2\2\2\u0c5c"+
		"\u0bfd\3\2\2\2\u0c5c\u0c06\3\2\2\2\u0c5c\u0c17\3\2\2\2\u0c5c\u0c28\3\2"+
		"\2\2\u0c5c\u0c39\3\2\2\2\u0c5c\u0c49\3\2\2\2\u0c5d\u0175\3\2\2\2\u0c5e"+
		"\u0c62\7C\2\2\u0c5f\u0c60\5$\23\2\u0c60\u0c61\b\u00bc\1\2\u0c61\u0c63"+
		"\3\2\2\2\u0c62\u0c5f\3\2\2\2\u0c62\u0c63\3\2\2\2\u0c63\u0c64\3\2\2\2\u0c64"+
		"\u0c65\7h\2\2\u0c65\u0c69\7;\2\2\u0c66\u0c67\5\u017a\u00be\2\u0c67\u0c68"+
		"\b\u00bc\1\2\u0c68\u0c6a\3\2\2\2\u0c69\u0c66\3\2\2\2\u0c69\u0c6a\3\2\2"+
		"\2\u0c6a\u0c6b\3\2\2\2\u0c6b\u0c6c\7<\2\2\u0c6c\u0c6d\b\u00bc\1\2\u0c6d"+
		"\u0177\3\2\2\2\u0c6e\u0c6f\7h\2\2\u0c6f\u0c73\7;\2\2\u0c70\u0c71\5\u017a"+
		"\u00be\2\u0c71\u0c72\b\u00bd\1\2\u0c72\u0c74\3\2\2\2\u0c73\u0c70\3\2\2"+
		"\2\u0c73\u0c74\3\2\2\2\u0c74\u0c75\3\2\2\2\u0c75\u0c76\7<\2\2\u0c76\u0cbd"+
		"\b\u00bd\1\2\u0c77\u0c78\5.\30\2\u0c78\u0c7c\7C\2\2\u0c79\u0c7a\5$\23"+
		"\2\u0c7a\u0c7b\b\u00bd\1\2\u0c7b\u0c7d\3\2\2\2\u0c7c\u0c79\3\2\2\2\u0c7c"+
		"\u0c7d\3\2\2\2\u0c7d\u0c7e\3\2\2\2\u0c7e\u0c7f\7h\2\2\u0c7f\u0c83\7;\2"+
		"\2\u0c80\u0c81\5\u017a\u00be\2\u0c81\u0c82\b\u00bd\1\2\u0c82\u0c84\3\2"+
		"\2\2\u0c83\u0c80\3\2\2\2\u0c83\u0c84\3\2\2\2\u0c84\u0c85\3\2\2\2\u0c85"+
		"\u0c86\7<\2\2\u0c86\u0c87\b\u00bd\1\2\u0c87\u0cbd\3\2\2\2\u0c88\u0c89"+
		"\5\62\32\2\u0c89\u0c8d\7C\2\2\u0c8a\u0c8b\5$\23\2\u0c8b\u0c8c\b\u00bd"+
		"\1\2\u0c8c\u0c8e\3\2\2\2\u0c8d\u0c8a\3\2\2\2\u0c8d\u0c8e\3\2\2\2\u0c8e"+
		"\u0c8f\3\2\2\2\u0c8f\u0c90\7h\2\2\u0c90\u0c94\7;\2\2\u0c91\u0c92\5\u017a"+
		"\u00be\2\u0c92\u0c93\b\u00bd\1\2\u0c93\u0c95\3\2\2\2\u0c94\u0c91\3\2\2"+
		"\2\u0c94\u0c95\3\2\2\2\u0c95\u0c96\3\2\2\2\u0c96\u0c97\7<\2\2\u0c97\u0c98"+
		"\b\u00bd\1\2\u0c98\u0cbd\3\2\2\2\u0c99\u0c9a\7*\2\2\u0c9a\u0c9e\7C\2\2"+
		"\u0c9b\u0c9c\5$\23\2\u0c9c\u0c9d\b\u00bd\1\2\u0c9d\u0c9f\3\2\2\2\u0c9e"+
		"\u0c9b\3\2\2\2\u0c9e\u0c9f\3\2\2\2\u0c9f\u0ca0\3\2\2\2\u0ca0\u0ca1\7h"+
		"\2\2\u0ca1\u0ca5\7;\2\2\u0ca2\u0ca3\5\u017a\u00be\2\u0ca3\u0ca4\b\u00bd"+
		"\1\2\u0ca4\u0ca6\3\2\2\2\u0ca5\u0ca2\3\2\2\2\u0ca5\u0ca6\3\2\2\2\u0ca6"+
		"\u0ca7\3\2\2\2\u0ca7\u0ca8\7<\2\2\u0ca8\u0cbd\b\u00bd\1\2\u0ca9\u0caa"+
		"\5.\30\2\u0caa\u0cab\7C\2\2\u0cab\u0cac\7*\2\2\u0cac\u0cb0\7C\2\2\u0cad"+
		"\u0cae\5$\23\2\u0cae\u0caf\b\u00bd\1\2\u0caf\u0cb1\3\2\2\2\u0cb0\u0cad"+
		"\3\2\2\2\u0cb0\u0cb1\3\2\2\2\u0cb1\u0cb2\3\2\2\2\u0cb2\u0cb3\7h\2\2\u0cb3"+
		"\u0cb7\7;\2\2\u0cb4\u0cb5\5\u017a\u00be\2\u0cb5\u0cb6\b\u00bd\1\2\u0cb6"+
		"\u0cb8\3\2\2\2\u0cb7\u0cb4\3\2\2\2\u0cb7\u0cb8\3\2\2\2\u0cb8\u0cb9\3\2"+
		"\2\2\u0cb9\u0cba\7<\2\2\u0cba\u0cbb\b\u00bd\1\2\u0cbb\u0cbd\3\2\2\2\u0cbc"+
		"\u0c6e\3\2\2\2\u0cbc\u0c77\3\2\2\2\u0cbc\u0c88\3\2\2\2\u0cbc\u0c99\3\2"+
		"\2\2\u0cbc\u0ca9\3\2\2\2\u0cbd\u0179\3\2\2\2\u0cbe\u0cbf\5\u018a\u00c6"+
		"\2\u0cbf\u0cc0\b\u00be\1\2\u0cc0\u0cc7\3\2\2\2\u0cc1\u0cc2\7B\2\2\u0cc2"+
		"\u0cc3\5\u018a\u00c6\2\u0cc3\u0cc4\b\u00be\1\2\u0cc4\u0cc6\3\2\2\2\u0cc5"+
		"\u0cc1\3\2\2\2\u0cc6\u0cc9\3\2\2\2\u0cc7\u0cc5\3\2\2\2\u0cc7\u0cc8\3\2"+
		"\2\2\u0cc8\u0cca\3\2\2\2\u0cc9\u0cc7\3\2\2\2\u0cca\u0ccb\b\u00be\1\2\u0ccb"+
		"\u017b\3\2\2\2\u0ccc\u0ccd\5\62\32\2\u0ccd\u0cd1\7\\\2\2\u0cce\u0ccf\5"+
		"$\23\2\u0ccf\u0cd0\b\u00bf\1\2\u0cd0\u0cd2\3\2\2\2\u0cd1\u0cce\3\2\2\2"+
		"\u0cd1\u0cd2\3\2\2\2\u0cd2\u0cd3\3\2\2\2\u0cd3\u0cd4\7h\2\2\u0cd4\u0cd5"+
		"\b\u00bf\1\2\u0cd5\u0d0f\3\2\2\2\u0cd6\u0cd7\5\16\b\2\u0cd7\u0cdb\7\\"+
		"\2\2\u0cd8\u0cd9\5$\23\2\u0cd9\u0cda\b\u00bf\1\2\u0cda\u0cdc\3\2\2\2\u0cdb"+
		"\u0cd8\3\2\2\2\u0cdb\u0cdc\3\2\2\2\u0cdc\u0cdd\3\2\2\2\u0cdd\u0cde\7h"+
		"\2\2\u0cde\u0cdf\b\u00bf\1\2\u0cdf\u0d0f\3\2\2\2\u0ce0\u0ce1\5\u014a\u00a6"+
		"\2\u0ce1\u0ce5\7\\\2\2\u0ce2\u0ce3\5$\23\2\u0ce3\u0ce4\b\u00bf\1\2\u0ce4"+
		"\u0ce6\3\2\2\2\u0ce5\u0ce2\3\2\2\2\u0ce5\u0ce6\3\2\2\2\u0ce6\u0ce7\3\2"+
		"\2\2\u0ce7\u0ce8\7h\2\2\u0ce8\u0ce9\b\u00bf\1\2\u0ce9\u0d0f\3\2\2\2\u0cea"+
		"\u0ceb\7*\2\2\u0ceb\u0cef\7\\\2\2\u0cec\u0ced\5$\23\2\u0ced\u0cee\b\u00bf"+
		"\1\2\u0cee\u0cf0\3\2\2\2\u0cef\u0cec\3\2\2\2\u0cef\u0cf0\3\2\2\2\u0cf0"+
		"\u0cf1\3\2\2\2\u0cf1\u0cf2\7h\2\2\u0cf2\u0d0f\b\u00bf\1\2\u0cf3\u0cf4"+
		"\5.\30\2\u0cf4\u0cf5\7C\2\2\u0cf5\u0cf6\7*\2\2\u0cf6\u0cfa\7\\\2\2\u0cf7"+
		"\u0cf8\5$\23\2\u0cf8\u0cf9\b\u00bf\1\2\u0cf9\u0cfb\3\2\2\2\u0cfa\u0cf7"+
		"\3\2\2\2\u0cfa\u0cfb\3\2\2\2\u0cfb\u0cfc\3\2\2\2\u0cfc\u0cfd\7h\2\2\u0cfd"+
		"\u0cfe\b\u00bf\1\2\u0cfe\u0d0f\3\2\2\2\u0cff\u0d00\5\22\n\2\u0d00\u0d04"+
		"\7\\\2\2\u0d01\u0d02\5$\23\2\u0d02\u0d03\b\u00bf\1\2\u0d03\u0d05\3\2\2"+
		"\2\u0d04\u0d01\3\2\2\2\u0d04\u0d05\3\2\2\2\u0d05\u0d06\3\2\2\2\u0d06\u0d07"+
		"\7!\2\2\u0d07\u0d08\b\u00bf\1\2\u0d08\u0d0f\3\2\2\2\u0d09\u0d0a\5\30\r"+
		"\2\u0d0a\u0d0b\7\\\2\2\u0d0b\u0d0c\7!\2\2\u0d0c\u0d0d\b\u00bf\1\2\u0d0d"+
		"\u0d0f\3\2\2\2\u0d0e\u0ccc\3\2\2\2\u0d0e\u0cd6\3\2\2\2\u0d0e\u0ce0\3\2"+
		"\2\2\u0d0e\u0cea\3\2\2\2\u0d0e\u0cf3\3\2\2\2\u0d0e\u0cff\3\2\2\2\u0d0e"+
		"\u0d09\3\2\2\2\u0d0f\u017d\3\2\2\2\u0d10\u0d14\7\\\2\2\u0d11\u0d12\5$"+
		"\23\2\u0d12\u0d13\b\u00c0\1\2\u0d13\u0d15\3\2\2\2\u0d14\u0d11\3\2\2\2"+
		"\u0d14\u0d15\3\2\2\2\u0d15\u0d16\3\2\2\2\u0d16\u0d17\7h\2\2\u0d17\u0d18"+
		"\b\u00c0\1\2\u0d18\u017f\3\2\2\2\u0d19\u0d1a\5\62\32\2\u0d1a\u0d1e\7\\"+
		"\2\2\u0d1b\u0d1c\5$\23\2\u0d1c\u0d1d\b\u00c1\1\2\u0d1d\u0d1f\3\2\2\2\u0d1e"+
		"\u0d1b\3\2\2\2\u0d1e\u0d1f\3\2\2\2\u0d1f\u0d20\3\2\2\2\u0d20\u0d21\7h"+
		"\2\2\u0d21\u0d22\b\u00c1\1\2\u0d22\u0d52\3\2\2\2\u0d23\u0d24\5\16\b\2"+
		"\u0d24\u0d28\7\\\2\2\u0d25\u0d26\5$\23\2\u0d26\u0d27\b\u00c1\1\2\u0d27"+
		"\u0d29\3\2\2\2\u0d28\u0d25\3\2\2\2\u0d28\u0d29\3\2\2\2\u0d29\u0d2a\3\2"+
		"\2\2\u0d2a\u0d2b\7h\2\2\u0d2b\u0d2c\b\u00c1\1\2\u0d2c\u0d52\3\2\2\2\u0d2d"+
		"\u0d2e\7*\2\2\u0d2e\u0d32\7\\\2\2\u0d2f\u0d30\5$\23\2\u0d30\u0d31\b\u00c1"+
		"\1\2\u0d31\u0d33\3\2\2\2\u0d32\u0d2f\3\2\2\2\u0d32\u0d33\3\2\2\2\u0d33"+
		"\u0d34\3\2\2\2\u0d34\u0d35\7h\2\2\u0d35\u0d52\b\u00c1\1\2\u0d36\u0d37"+
		"\5.\30\2\u0d37\u0d38\7C\2\2\u0d38\u0d39\7*\2\2\u0d39\u0d3d\7\\\2\2\u0d3a"+
		"\u0d3b\5$\23\2\u0d3b\u0d3c\b\u00c1\1\2\u0d3c\u0d3e\3\2\2\2\u0d3d\u0d3a"+
		"\3\2\2\2\u0d3d\u0d3e\3\2\2\2\u0d3e\u0d3f\3\2\2\2\u0d3f\u0d40\7h\2\2\u0d40"+
		"\u0d41\b\u00c1\1\2\u0d41\u0d52\3\2\2\2\u0d42\u0d43\5\22\n\2\u0d43\u0d47"+
		"\7\\\2\2\u0d44\u0d45\5$\23\2\u0d45\u0d46\b\u00c1\1\2\u0d46\u0d48\3\2\2"+
		"\2\u0d47\u0d44\3\2\2\2\u0d47\u0d48\3\2\2\2\u0d48\u0d49\3\2\2\2\u0d49\u0d4a"+
		"\7!\2\2\u0d4a\u0d4b\b\u00c1\1\2\u0d4b\u0d52\3\2\2\2\u0d4c\u0d4d\5\30\r"+
		"\2\u0d4d\u0d4e\7\\\2\2\u0d4e\u0d4f\7!\2\2\u0d4f\u0d50\b\u00c1\1\2\u0d50"+
		"\u0d52\3\2\2\2\u0d51\u0d19\3\2\2\2\u0d51\u0d23\3\2\2\2\u0d51\u0d2d\3\2"+
		"\2\2\u0d51\u0d36\3\2\2\2\u0d51\u0d42\3\2\2\2\u0d51\u0d4c\3\2\2\2\u0d52"+
		"\u0181\3\2\2\2\u0d53\u0d54\7!\2\2\u0d54\u0d55\5\6\4\2\u0d55\u0d59\5\u0184"+
		"\u00c3\2\u0d56\u0d57\5\32\16\2\u0d57\u0d58\b\u00c2\1\2\u0d58\u0d5a\3\2"+
		"\2\2\u0d59\u0d56\3\2\2\2\u0d59\u0d5a\3\2\2\2\u0d5a\u0d5b\3\2\2\2\u0d5b"+
		"\u0d5c\b\u00c2\1\2\u0d5c\u0d74\3\2\2\2\u0d5d\u0d5e\7!\2\2\u0d5e\u0d5f"+
		"\5\20\t\2\u0d5f\u0d63\5\u0184\u00c3\2\u0d60\u0d61\5\32\16\2\u0d61\u0d62"+
		"\b\u00c2\1\2\u0d62\u0d64\3\2\2\2\u0d63\u0d60\3\2\2\2\u0d63\u0d64\3\2\2"+
		"\2\u0d64\u0d65\3\2\2\2\u0d65\u0d66\b\u00c2\1\2\u0d66\u0d74\3\2\2\2\u0d67"+
		"\u0d68\7!\2\2\u0d68\u0d69\5\6\4\2\u0d69\u0d6a\5\32\16\2\u0d6a\u0d6b\5"+
		"\u00e4s\2\u0d6b\u0d6c\b\u00c2\1\2\u0d6c\u0d74\3\2\2\2\u0d6d\u0d6e\7!\2"+
		"\2\u0d6e\u0d6f\5\20\t\2\u0d6f\u0d70\5\32\16\2\u0d70\u0d71\5\u00e4s\2\u0d71"+
		"\u0d72\b\u00c2\1\2\u0d72\u0d74\3\2\2\2\u0d73\u0d53\3\2\2\2\u0d73\u0d5d"+
		"\3\2\2\2\u0d73\u0d67\3\2\2\2\u0d73\u0d6d\3\2\2\2\u0d74\u0183\3\2\2\2\u0d75"+
		"\u0d76\5\u0186\u00c4\2\u0d76\u0d7c\b\u00c3\1\2\u0d77\u0d78\5\u0186\u00c4"+
		"\2\u0d78\u0d79\b\u00c3\1\2\u0d79\u0d7b\3\2\2\2\u0d7a\u0d77\3\2\2\2\u0d7b"+
		"\u0d7e\3\2\2\2\u0d7c\u0d7a\3\2\2\2\u0d7c\u0d7d\3\2\2\2\u0d7d\u0185\3\2"+
		"\2\2\u0d7e\u0d7c\3\2\2\2\u0d7f\u0d80\5\u00d2j\2\u0d80\u0d81\b\u00c4\1"+
		"\2\u0d81\u0d83\3\2\2\2\u0d82\u0d7f\3\2\2\2\u0d83\u0d86\3\2\2\2\u0d84\u0d82"+
		"\3\2\2\2\u0d84\u0d85\3\2\2\2\u0d85\u0d87\3\2\2\2\u0d86\u0d84\3\2\2\2\u0d87"+
		"\u0d88\7?\2\2\u0d88\u0d89\5\u018a\u00c6\2\u0d89\u0d8a\7@\2\2\u0d8a\u0d8b"+
		"\b\u00c4\1\2\u0d8b\u0187\3\2\2\2\u0d8c\u0d8d\5\u018a\u00c6\2\u0d8d\u0d8e"+
		"\b\u00c5\1\2\u0d8e\u0189\3\2\2\2\u0d8f\u0d90\5\u018c\u00c7\2\u0d90\u0d91"+
		"\b\u00c6\1\2\u0d91\u0d96\3\2\2\2\u0d92\u0d93\5\u0194\u00cb\2\u0d93\u0d94"+
		"\b\u00c6\1\2\u0d94\u0d96\3\2\2\2\u0d95\u0d8f\3\2\2\2\u0d95\u0d92\3\2\2"+
		"\2\u0d96\u018b\3\2\2\2\u0d97\u0d98\5\u018e\u00c8\2\u0d98\u0d99\7[\2\2"+
		"\u0d99\u0d9a\5\u0192\u00ca\2\u0d9a\u0d9b\b\u00c7\1\2\u0d9b\u018d\3\2\2"+
		"\2\u0d9c\u0d9d\7h\2\2\u0d9d\u0dac\b\u00c8\1\2\u0d9e\u0da2\7;\2\2\u0d9f"+
		"\u0da0\5\u0086D\2\u0da0\u0da1\b\u00c8\1\2\u0da1\u0da3\3\2\2\2\u0da2\u0d9f"+
		"\3\2\2\2\u0da2\u0da3\3\2\2\2\u0da3\u0da4\3\2\2\2\u0da4\u0da5\7<\2\2\u0da5"+
		"\u0dac\b\u00c8\1\2\u0da6\u0da7\7;\2\2\u0da7\u0da8\5\u0190\u00c9\2\u0da8"+
		"\u0da9\7<\2\2\u0da9\u0daa\b\u00c8\1\2\u0daa\u0dac\3\2\2\2\u0dab\u0d9c"+
		"\3\2\2\2\u0dab\u0d9e\3\2\2\2\u0dab\u0da6\3\2\2\2\u0dac\u018f\3\2\2\2\u0dad"+
		"\u0dae\7h\2\2\u0dae\u0daf\b\u00c9\1\2\u0daf\u0db5\3\2\2\2\u0db0\u0db1"+
		"\7B\2\2\u0db1\u0db2\7h\2\2\u0db2\u0db4\b\u00c9\1\2\u0db3\u0db0\3\2\2\2"+
		"\u0db4\u0db7\3\2\2\2\u0db5\u0db3\3\2\2\2\u0db5\u0db6\3\2\2\2\u0db6\u0db8"+
		"\3\2\2\2\u0db7\u0db5\3\2\2\2\u0db8\u0db9\b\u00c9\1\2\u0db9\u0191\3\2\2"+
		"\2\u0dba\u0dbb\5\u018a\u00c6\2\u0dbb\u0dbc\b\u00ca\1\2\u0dbc\u0dc1\3\2"+
		"\2\2\u0dbd\u0dbe\5\u00e8u\2\u0dbe\u0dbf\b\u00ca\1\2\u0dbf\u0dc1\3\2\2"+
		"\2\u0dc0\u0dba\3\2\2\2\u0dc0\u0dbd\3\2\2\2\u0dc1\u0193\3\2\2\2\u0dc2\u0dc3"+
		"\5\u019c\u00cf\2\u0dc3\u0dc4\b\u00cb\1\2\u0dc4\u0dc9\3\2\2\2\u0dc5\u0dc6"+
		"\5\u0196\u00cc\2\u0dc6\u0dc7\b\u00cb\1\2\u0dc7\u0dc9\3\2\2\2\u0dc8\u0dc2"+
		"\3\2\2\2\u0dc8\u0dc5\3\2\2\2\u0dc9\u0195\3\2\2\2\u0dca\u0dcb\5\u0198\u00cd"+
		"\2\u0dcb\u0dcc\5\u019a\u00ce\2\u0dcc\u0dcd\5\u018a\u00c6\2\u0dcd\u0dce"+
		"\b\u00cc\1\2\u0dce\u0197\3\2\2\2\u0dcf\u0dd0\5\62\32\2\u0dd0\u0dd1\b\u00cd"+
		"\1\2\u0dd1\u0dd9\3\2\2\2\u0dd2\u0dd3\5\u0168\u00b5\2\u0dd3\u0dd4\b\u00cd"+
		"\1\2\u0dd4\u0dd9\3\2\2\2\u0dd5\u0dd6\5\u016e\u00b8\2\u0dd6\u0dd7\b\u00cd"+
		"\1\2\u0dd7\u0dd9\3\2\2\2\u0dd8\u0dcf\3\2\2\2\u0dd8\u0dd2\3\2\2\2\u0dd8"+
		"\u0dd5\3\2\2\2\u0dd9\u0199\3\2\2\2\u0dda\u0ddb\7D\2\2\u0ddb\u0df3\b\u00ce"+
		"\1\2\u0ddc\u0ddd\7_\2\2\u0ddd\u0df3\b\u00ce\1\2\u0dde\u0ddf\7`\2\2\u0ddf"+
		"\u0df3\b\u00ce\1\2\u0de0\u0de1\7d\2\2\u0de1\u0df3\b\u00ce\1\2\u0de2\u0de3"+
		"\7]\2\2\u0de3\u0df3\b\u00ce\1\2\u0de4\u0de5\7^\2\2\u0de5\u0df3\b\u00ce"+
		"\1\2\u0de6\u0de7\7e\2\2\u0de7\u0df3\b\u00ce\1\2\u0de8\u0de9\7f\2\2\u0de9"+
		"\u0df3\b\u00ce\1\2\u0dea\u0deb\7g\2\2\u0deb\u0df3\b\u00ce\1\2\u0dec\u0ded"+
		"\7a\2\2\u0ded\u0df3\b\u00ce\1\2\u0dee\u0def\7c\2\2\u0def\u0df3\b\u00ce"+
		"\1\2\u0df0\u0df1\7b\2\2\u0df1\u0df3\b\u00ce\1\2\u0df2\u0dda\3\2\2\2\u0df2"+
		"\u0ddc\3\2\2\2\u0df2\u0dde\3\2\2\2\u0df2\u0de0\3\2\2\2\u0df2\u0de2\3\2"+
		"\2\2\u0df2\u0de4\3\2\2\2\u0df2\u0de6\3\2\2\2\u0df2\u0de8\3\2\2\2\u0df2"+
		"\u0dea\3\2\2\2\u0df2\u0dec\3\2\2\2\u0df2\u0dee\3\2\2\2\u0df2\u0df0\3\2"+
		"\2\2\u0df3\u019b\3\2\2\2\u0df4\u0df5\5\u019e\u00d0\2\u0df5\u0df6\b\u00cf"+
		"\1\2\u0df6\u0dff\3\2\2\2\u0df7\u0df8\5\u019e\u00d0\2\u0df8\u0df9\7I\2"+
		"\2\u0df9\u0dfa\5\u018a\u00c6\2\u0dfa\u0dfb\7J\2\2\u0dfb\u0dfc\5\u019c"+
		"\u00cf\2\u0dfc\u0dfd\b\u00cf\1\2\u0dfd\u0dff\3\2\2\2\u0dfe\u0df4\3\2\2"+
		"\2\u0dfe\u0df7\3\2\2\2\u0dff\u019d\3\2\2\2\u0e00\u0e01\b\u00d0\1\2\u0e01"+
		"\u0e02\5\u01a0\u00d1\2\u0e02\u0e03\b\u00d0\1\2\u0e03\u0e0b\3\2\2\2\u0e04"+
		"\u0e05\f\3\2\2\u0e05\u0e06\7P\2\2\u0e06\u0e07\5\u01a0\u00d1\2\u0e07\u0e08"+
		"\b\u00d0\1\2\u0e08\u0e0a\3\2\2\2\u0e09\u0e04\3\2\2\2\u0e0a\u0e0d\3\2\2"+
		"\2\u0e0b\u0e09\3\2\2\2\u0e0b\u0e0c\3\2\2\2\u0e0c\u019f\3\2\2\2\u0e0d\u0e0b"+
		"\3\2\2\2\u0e0e\u0e0f\b\u00d1\1\2\u0e0f\u0e10\5\u01a2\u00d2\2\u0e10\u0e11"+
		"\b\u00d1\1\2\u0e11\u0e19\3\2\2\2\u0e12\u0e13\f\3\2\2\u0e13\u0e14\7O\2"+
		"\2\u0e14\u0e15\5\u01a2\u00d2\2\u0e15\u0e16\b\u00d1\1\2\u0e16\u0e18\3\2"+
		"\2\2\u0e17\u0e12\3\2\2\2\u0e18\u0e1b\3\2\2\2\u0e19\u0e17\3\2\2\2\u0e19"+
		"\u0e1a\3\2\2\2\u0e1a\u01a1\3\2\2\2\u0e1b\u0e19\3\2\2\2\u0e1c\u0e1d\b\u00d2"+
		"\1\2\u0e1d\u0e1e\5\u01a4\u00d3\2\u0e1e\u0e1f\b\u00d2\1\2\u0e1f\u0e27\3"+
		"\2\2\2\u0e20\u0e21\f\3\2\2\u0e21\u0e22\7X\2\2\u0e22\u0e23\5\u01a4\u00d3"+
		"\2\u0e23\u0e24\b\u00d2\1\2\u0e24\u0e26\3\2\2\2\u0e25\u0e20\3\2\2\2\u0e26"+
		"\u0e29\3\2\2\2\u0e27\u0e25\3\2\2\2\u0e27\u0e28\3\2\2\2\u0e28\u01a3\3\2"+
		"\2\2\u0e29\u0e27\3\2\2\2\u0e2a\u0e2b\b\u00d3\1\2\u0e2b\u0e2c\5\u01a6\u00d4"+
		"\2\u0e2c\u0e2d\b\u00d3\1\2\u0e2d\u0e35\3\2\2\2\u0e2e\u0e2f\f\3\2\2\u0e2f"+
		"\u0e30\7Y\2\2\u0e30\u0e31\5\u01a6\u00d4\2\u0e31\u0e32\b\u00d3\1\2\u0e32"+
		"\u0e34\3\2\2\2\u0e33\u0e2e\3\2\2\2\u0e34\u0e37\3\2\2\2\u0e35\u0e33\3\2"+
		"\2\2\u0e35\u0e36\3\2\2\2\u0e36\u01a5\3\2\2\2\u0e37\u0e35\3\2\2\2\u0e38"+
		"\u0e39\b\u00d4\1\2\u0e39\u0e3a\5\u01a8\u00d5\2\u0e3a\u0e3b\b\u00d4\1\2"+
		"\u0e3b\u0e43\3\2\2\2\u0e3c\u0e3d\f\3\2\2\u0e3d\u0e3e\7W\2\2\u0e3e\u0e3f"+
		"\5\u01a8\u00d5\2\u0e3f\u0e40\b\u00d4\1\2\u0e40\u0e42\3\2\2\2\u0e41\u0e3c"+
		"\3\2\2\2\u0e42\u0e45\3\2\2\2\u0e43\u0e41\3\2\2\2\u0e43\u0e44\3\2\2\2\u0e44"+
		"\u01a7\3\2\2\2\u0e45\u0e43\3\2\2\2\u0e46\u0e47\b\u00d5\1\2\u0e47\u0e48"+
		"\5\u01aa\u00d6\2\u0e48\u0e49\b\u00d5\1\2\u0e49\u0e56\3\2\2\2\u0e4a\u0e4b"+
		"\f\4\2\2\u0e4b\u0e4c\7K\2\2\u0e4c\u0e4d\5\u01aa\u00d6\2\u0e4d\u0e4e\b"+
		"\u00d5\1\2\u0e4e\u0e55\3\2\2\2\u0e4f\u0e50\f\3\2\2\u0e50\u0e51\7N\2\2"+
		"\u0e51\u0e52\5\u01aa\u00d6\2\u0e52\u0e53\b\u00d5\1\2\u0e53\u0e55\3\2\2"+
		"\2\u0e54\u0e4a\3\2\2\2\u0e54\u0e4f\3\2\2\2\u0e55\u0e58\3\2\2\2\u0e56\u0e54"+
		"\3\2\2\2\u0e56\u0e57\3\2\2\2\u0e57\u01a9\3\2\2\2\u0e58\u0e56\3\2\2\2\u0e59"+
		"\u0e5a\b\u00d6\1\2\u0e5a\u0e5b\5\u01ac\u00d7\2\u0e5b\u0e5c\b\u00d6\1\2"+
		"\u0e5c\u0e78\3\2\2\2\u0e5d\u0e5e\f\7\2\2\u0e5e\u0e5f\7F\2\2\u0e5f\u0e60"+
		"\5\u01ac\u00d7\2\u0e60\u0e61\b\u00d6\1\2\u0e61\u0e77\3\2\2\2\u0e62\u0e63"+
		"\f\6\2\2\u0e63\u0e64\7E\2\2\u0e64\u0e65\5\u01ac\u00d7\2\u0e65\u0e66\b"+
		"\u00d6\1\2\u0e66\u0e77\3\2\2\2\u0e67\u0e68\f\5\2\2\u0e68\u0e69\7L\2\2"+
		"\u0e69\u0e6a\5\u01ac\u00d7\2\u0e6a\u0e6b\b\u00d6\1\2\u0e6b\u0e77\3\2\2"+
		"\2\u0e6c\u0e6d\f\4\2\2\u0e6d\u0e6e\7M\2\2\u0e6e\u0e6f\5\u01ac\u00d7\2"+
		"\u0e6f\u0e70\b\u00d6\1\2\u0e70\u0e77\3\2\2\2\u0e71\u0e72\f\3\2\2\u0e72"+
		"\u0e73\7\34\2\2\u0e73\u0e74\5\16\b\2\u0e74\u0e75\b\u00d6\1\2\u0e75\u0e77"+
		"\3\2\2\2\u0e76\u0e5d\3\2\2\2\u0e76\u0e62\3\2\2\2\u0e76\u0e67\3\2\2\2\u0e76"+
		"\u0e6c\3\2\2\2\u0e76\u0e71\3\2\2\2\u0e77\u0e7a\3\2\2\2\u0e78\u0e76\3\2"+
		"\2\2\u0e78\u0e79\3\2\2\2\u0e79\u01ab\3\2\2\2\u0e7a\u0e78\3\2\2\2\u0e7b"+
		"\u0e7c\b\u00d7\1\2\u0e7c\u0e7d\5\u01ae\u00d8\2\u0e7d\u0e7e\b\u00d7\1\2"+
		"\u0e7e\u0e94\3\2\2\2\u0e7f\u0e80\f\5\2\2\u0e80\u0e81\7F\2\2\u0e81\u0e82"+
		"\7F\2\2\u0e82\u0e83\5\u01ae\u00d8\2\u0e83\u0e84\b\u00d7\1\2\u0e84\u0e93"+
		"\3\2\2\2\u0e85\u0e86\f\4\2\2\u0e86\u0e87\7E\2\2\u0e87\u0e88\7E\2\2\u0e88"+
		"\u0e89\5\u01ae\u00d8\2\u0e89\u0e8a\b\u00d7\1\2\u0e8a\u0e93\3\2\2\2\u0e8b"+
		"\u0e8c\f\3\2\2\u0e8c\u0e8d\7E\2\2\u0e8d\u0e8e\7E\2\2\u0e8e\u0e8f\7E\2"+
		"\2\u0e8f\u0e90\5\u01ae\u00d8\2\u0e90\u0e91\b\u00d7\1\2\u0e91\u0e93\3\2"+
		"\2\2\u0e92\u0e7f\3\2\2\2\u0e92\u0e85\3\2\2\2\u0e92\u0e8b\3\2\2\2\u0e93"+
		"\u0e96\3\2\2\2\u0e94\u0e92\3\2\2\2\u0e94\u0e95\3\2\2\2\u0e95\u01ad\3\2"+
		"\2\2\u0e96\u0e94\3\2\2\2\u0e97\u0e98\b\u00d8\1\2\u0e98\u0e99\5\u01b0\u00d9"+
		"\2\u0e99\u0e9a\b\u00d8\1\2\u0e9a\u0ea7\3\2\2\2\u0e9b\u0e9c\f\4\2\2\u0e9c"+
		"\u0e9d\7S\2\2\u0e9d\u0e9e\5\u01b0\u00d9\2\u0e9e\u0e9f\b\u00d8\1\2\u0e9f"+
		"\u0ea6\3\2\2\2\u0ea0\u0ea1\f\3\2\2\u0ea1\u0ea2\7T\2\2\u0ea2\u0ea3\5\u01b0"+
		"\u00d9\2\u0ea3\u0ea4\b\u00d8\1\2\u0ea4\u0ea6\3\2\2\2\u0ea5\u0e9b\3\2\2"+
		"\2\u0ea5\u0ea0\3\2\2\2\u0ea6\u0ea9\3\2\2\2\u0ea7\u0ea5\3\2\2\2\u0ea7\u0ea8"+
		"\3\2\2\2\u0ea8\u01af\3\2\2\2\u0ea9\u0ea7\3\2\2\2\u0eaa\u0eab\b\u00d9\1"+
		"\2\u0eab\u0eac\5\u01b2\u00da\2\u0eac\u0ead\b\u00d9\1\2\u0ead\u0ebf\3\2"+
		"\2\2\u0eae\u0eaf\f\5\2\2\u0eaf\u0eb0\7U\2\2\u0eb0\u0eb1\5\u01b2\u00da"+
		"\2\u0eb1\u0eb2\b\u00d9\1\2\u0eb2\u0ebe\3\2\2\2\u0eb3\u0eb4\f\4\2\2\u0eb4"+
		"\u0eb5\7V\2\2\u0eb5\u0eb6\5\u01b2\u00da\2\u0eb6\u0eb7\b\u00d9\1\2\u0eb7"+
		"\u0ebe\3\2\2\2\u0eb8\u0eb9\f\3\2\2\u0eb9\u0eba\7Z\2\2\u0eba\u0ebb\5\u01b2"+
		"\u00da\2\u0ebb\u0ebc\b\u00d9\1\2\u0ebc\u0ebe\3\2\2\2\u0ebd\u0eae\3\2\2"+
		"\2\u0ebd\u0eb3\3\2\2\2\u0ebd\u0eb8\3\2\2\2\u0ebe\u0ec1\3\2\2\2\u0ebf\u0ebd"+
		"\3\2\2\2\u0ebf\u0ec0\3\2\2\2\u0ec0\u01b1\3\2\2\2\u0ec1\u0ebf\3\2\2\2\u0ec2"+
		"\u0ec3\5\u01b4\u00db\2\u0ec3\u0ec4\b\u00da\1\2\u0ec4\u0ed4\3\2\2\2\u0ec5"+
		"\u0ec6\5\u01b6\u00dc\2\u0ec6\u0ec7\b\u00da\1\2\u0ec7\u0ed4\3\2\2\2\u0ec8"+
		"\u0ec9\7S\2\2\u0ec9\u0eca\5\u01b2\u00da\2\u0eca\u0ecb\b\u00da\1\2\u0ecb"+
		"\u0ed4\3\2\2\2\u0ecc\u0ecd\7T\2\2\u0ecd\u0ece\5\u01b2\u00da\2\u0ece\u0ecf"+
		"\b\u00da\1\2\u0ecf\u0ed4\3\2\2\2\u0ed0\u0ed1\5\u01b8\u00dd\2\u0ed1\u0ed2"+
		"\b\u00da\1\2\u0ed2\u0ed4\3\2\2\2\u0ed3\u0ec2\3\2\2\2\u0ed3\u0ec5\3\2\2"+
		"\2\u0ed3\u0ec8\3\2\2\2\u0ed3\u0ecc\3\2\2\2\u0ed3\u0ed0\3\2\2\2\u0ed4\u01b3"+
		"\3\2\2\2\u0ed5\u0ed6\7Q\2\2\u0ed6\u0ed7\5\u01b2\u00da\2\u0ed7\u0ed8\b"+
		"\u00db\1\2\u0ed8\u01b5\3\2\2\2\u0ed9\u0eda\7R\2\2\u0eda\u0edb\5\u01b2"+
		"\u00da\2\u0edb\u0edc\b\u00dc\1\2\u0edc\u01b7\3\2\2\2\u0edd\u0ede\5\u01ba"+
		"\u00de\2\u0ede\u0edf\b\u00dd\1\2\u0edf\u0eec\3\2\2\2\u0ee0\u0ee1\7H\2"+
		"\2\u0ee1\u0ee2\5\u01b2\u00da\2\u0ee2\u0ee3\b\u00dd\1\2\u0ee3\u0eec\3\2"+
		"\2\2\u0ee4\u0ee5\7G\2\2\u0ee5\u0ee6\5\u01b2\u00da\2\u0ee6\u0ee7\b\u00dd"+
		"\1\2\u0ee7\u0eec\3\2\2\2\u0ee8\u0ee9\5\u01c0\u00e1\2\u0ee9\u0eea\b\u00dd"+
		"\1\2\u0eea\u0eec\3\2\2\2\u0eeb\u0edd\3\2\2\2\u0eeb\u0ee0\3\2\2\2\u0eeb"+
		"\u0ee4\3\2\2\2\u0eeb\u0ee8\3\2\2\2\u0eec\u01b9\3\2\2\2\u0eed\u0eee\5\u014a"+
		"\u00a6\2\u0eee\u0eef\b\u00de\1\2\u0eef\u0ef4\3\2\2\2\u0ef0\u0ef1\5\62"+
		"\32\2\u0ef1\u0ef2\b\u00de\1\2\u0ef2\u0ef4\3\2\2\2\u0ef3\u0eed\3\2\2\2"+
		"\u0ef3\u0ef0\3\2\2\2\u0ef4\u0efb\3\2\2\2\u0ef5\u0ef6\7Q\2\2\u0ef6\u0efa"+
		"\b\u00de\1\2\u0ef7\u0ef8\7R\2\2\u0ef8\u0efa\b\u00de\1\2\u0ef9\u0ef5\3"+
		"\2\2\2\u0ef9\u0ef7\3\2\2\2\u0efa\u0efd\3\2\2\2\u0efb\u0ef9\3\2\2\2\u0efb"+
		"\u0efc\3\2\2\2\u0efc\u01bb\3\2\2\2\u0efd\u0efb\3\2\2\2\u0efe\u0eff\5\u01ba"+
		"\u00de\2\u0eff\u0f00\7Q\2\2\u0f00\u0f01\b\u00df\1\2\u0f01\u01bd\3\2\2"+
		"\2\u0f02\u0f03\5\u01ba\u00de\2\u0f03\u0f04\7R\2\2\u0f04\u0f05\b\u00e0"+
		"\1\2\u0f05\u01bf\3\2\2\2\u0f06\u0f07\7;\2\2\u0f07\u0f08\5\6\4\2\u0f08"+
		"\u0f09\7<\2\2\u0f09\u0f0a\5\u01b2\u00da\2\u0f0a\u0f0b\b\u00e1\1\2\u0f0b"+
		"\u0f2b\3\2\2\2\u0f0c\u0f0d\7;\2\2\u0f0d\u0f0e\5\16\b\2\u0f0e\u0f14\b\u00e1"+
		"\1\2\u0f0f\u0f10\5\"\22\2\u0f10\u0f11\b\u00e1\1\2\u0f11\u0f13\3\2\2\2"+
		"\u0f12\u0f0f\3\2\2\2\u0f13\u0f16\3\2\2\2\u0f14\u0f12\3\2\2\2\u0f14\u0f15"+
		"\3\2\2\2\u0f15\u0f17\3\2\2\2\u0f16\u0f14\3\2\2\2\u0f17\u0f18\7<\2\2\u0f18"+
		"\u0f19\5\u01b8\u00dd\2\u0f19\u0f1a\b\u00e1\1\2\u0f1a\u0f2b\3\2\2\2\u0f1b"+
		"\u0f1c\7;\2\2\u0f1c\u0f1d\5\16\b\2\u0f1d\u0f23\b\u00e1\1\2\u0f1e\u0f1f"+
		"\5\"\22\2\u0f1f\u0f20\b\u00e1\1\2\u0f20\u0f22\3\2\2\2\u0f21\u0f1e\3\2"+
		"\2\2\u0f22\u0f25\3\2\2\2\u0f23\u0f21\3\2\2\2\u0f23\u0f24\3\2\2\2\u0f24"+
		"\u0f26\3\2\2\2\u0f25\u0f23\3\2\2\2\u0f26\u0f27\7<\2\2\u0f27\u0f28\5\u018c"+
		"\u00c7\2\u0f28\u0f29\b\u00e1\1\2\u0f29\u0f2b\3\2\2\2\u0f2a\u0f06\3\2\2"+
		"\2\u0f2a\u0f0c\3\2\2\2\u0f2a\u0f1b\3\2\2\2\u0f2b\u01c1\3\2\2\2\u014c\u01ce"+
		"\u01d6\u01dd\u01e8\u01ed\u01f5\u0201\u0207\u0212\u021b\u0223\u022b\u0234"+
		"\u023c\u0240\u0247\u024f\u0256\u0268\u026f\u027b\u0283\u028d\u0294\u02a7"+
		"\u02ac\u02bf\u02ca\u02d1\u02d7\u02e1\u02ea\u02f6\u0300\u030c\u0312\u0319"+
		"\u0321\u032c\u0338\u034d\u0372\u037a\u0382\u0384\u038d\u0392\u0397\u03aa"+
		"\u03ba\u03d0\u03d9\u03e9\u03f6\u03fe\u0400\u0416\u0421\u042c\u0435\u0443"+
		"\u044b\u0452\u045d\u0468\u0473\u047a\u048b\u0493\u0495\u04b0\u04b8\u04c1"+
		"\u04cb\u04cd\u04d4\u04dc\u04e2\u04f2\u04fd\u050b\u0510\u0518\u051a\u052a"+
		"\u052c\u0535\u053f\u0546\u055c\u0567\u056e\u057d\u057f\u0588\u0593\u0598"+
		"\u05a0\u05a9\u05ae\u05b6\u05bd\u05c5\u05cc\u05d6\u05dd\u05e8\u05ef\u05f5"+
		"\u05fd\u05ff\u0607\u060e\u0611\u0614\u061e\u0626\u062e\u0631\u0635\u063b"+
		"\u0644\u064c\u064e\u0657\u065c\u066d\u0677\u0688\u0690\u0692\u06a0\u06a8"+
		"\u06aa\u06bd\u06c5\u06c7\u06d4\u06e5\u06ed\u06ef\u06fa\u06ff\u0708\u0717"+
		"\u071e\u0728\u0739\u073f\u0742\u0750\u0764\u0767\u0775\u077f\u078c\u079a"+
		"\u07a6\u07a8\u07c1\u07d2\u07f8\u0820\u0847\u0856\u085e\u0871\u0882\u08a1"+
		"\u08a9\u08b0\u08b6\u08bc\u08c7\u08cd\u08d3\u08df\u08ed\u08fa\u08fc\u090e"+
		"\u0910\u091d\u0925\u0932\u094a\u0952\u095b\u096e\u0970\u0980\u098d\u0992"+
		"\u099c\u09a8\u09b3\u09b5\u09c3\u09ca\u09e9\u09f1\u09ff\u0a0f\u0a2c\u0a3d"+
		"\u0a4d\u0a5b\u0a78\u0a88\u0aa2\u0aa8\u0aaf\u0aba\u0ac1\u0ac7\u0acd\u0ad2"+
		"\u0ada\u0ae1\u0ae9\u0aef\u0af4\u0afc\u0b03\u0b0b\u0b11\u0b16\u0b18\u0b1f"+
		"\u0b26\u0b2e\u0b34\u0b39\u0b3f\u0b46\u0b51\u0b58\u0b5e\u0b64\u0b69\u0b71"+
		"\u0b78\u0b80\u0b86\u0b8b\u0b8d\u0b95\u0ba7\u0bb8\u0bc6\u0bd0\u0be1\u0bf0"+
		"\u0bfa\u0c02\u0c0b\u0c12\u0c1c\u0c23\u0c2d\u0c34\u0c3e\u0c45\u0c50\u0c57"+
		"\u0c5c\u0c62\u0c69\u0c73\u0c7c\u0c83\u0c8d\u0c94\u0c9e\u0ca5\u0cb0\u0cb7"+
		"\u0cbc\u0cc7\u0cd1\u0cdb\u0ce5\u0cef\u0cfa\u0d04\u0d0e\u0d14\u0d1e\u0d28"+
		"\u0d32\u0d3d\u0d47\u0d51\u0d59\u0d63\u0d73\u0d7c\u0d84\u0d95\u0da2\u0dab"+
		"\u0db5\u0dc0\u0dc8\u0dd8\u0df2\u0dfe\u0e0b\u0e19\u0e27\u0e35\u0e43\u0e54"+
		"\u0e56\u0e76\u0e78\u0e92\u0e94\u0ea5\u0ea7\u0ebd\u0ebf\u0ed3\u0eeb\u0ef3"+
		"\u0ef9\u0efb\u0f14\u0f23\u0f2a";
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