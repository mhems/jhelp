// Generated from Java8.g4 by ANTLR 4.6
package com.binghamton.jhelp.antlr;

    import java.util.ArrayList;
    import java.util.List;

    import com.binghamton.jhelp.*;
    import com.binghamton.jhelp.ast.*;
    import com.binghamton.jhelp.error.SyntacticError;

    import static com.binghamton.jhelp.ast.NameExpression.*;
    import static com.binghamton.jhelp.ast.BodyDeclaration.Kind.*;

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
		BadBooleanLiteral=54, CharacterLiteral=55, StringLiteral=56, BadStringLiteral=57, 
		NullLiteral=58, BadNullLiteral=59, LPAREN=60, RPAREN=61, LBRACE=62, RBRACE=63, 
		LBRACK=64, RBRACK=65, SEMI=66, COMMA=67, DOT=68, ASSIGN=69, GT=70, LT=71, 
		BANG=72, TILDE=73, QUESTION=74, COLON=75, EQUAL=76, LE=77, GE=78, NOTEQUAL=79, 
		AND=80, OR=81, INC=82, DEC=83, ADD=84, SUB=85, MUL=86, DIV=87, BITAND=88, 
		BITOR=89, CARET=90, MOD=91, ARROW=92, COLONCOLON=93, ADD_ASSIGN=94, SUB_ASSIGN=95, 
		MUL_ASSIGN=96, DIV_ASSIGN=97, AND_ASSIGN=98, OR_ASSIGN=99, XOR_ASSIGN=100, 
		MOD_ASSIGN=101, LSHIFT_ASSIGN=102, RSHIFT_ASSIGN=103, URSHIFT_ASSIGN=104, 
		Identifier=105, AT=106, ELLIPSIS=107, WS=108, COMMENT=109, LINE_COMMENT=110;
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
		RULE_primaryNoNewArray_lf_primary = 169, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 170, 
		RULE_primaryNoNewArray_lfno_primary = 171, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 172, 
		RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 173, 
		RULE_classInstanceCreationExpression = 174, RULE_classInstanceCreationExpression_lf_primary = 175, 
		RULE_classInstanceCreationExpression_lfno_primary = 176, RULE_typeArgumentsOrDiamond = 177, 
		RULE_fieldAccess = 178, RULE_fieldAccess_lf_primary = 179, RULE_fieldAccess_lfno_primary = 180, 
		RULE_arrayAccess = 181, RULE_arrayAccess_lf_primary = 182, RULE_arrayAccess_lfno_primary = 183, 
		RULE_methodInvocation = 184, RULE_methodInvocation_lf_primary = 185, RULE_methodInvocation_lfno_primary = 186, 
		RULE_argumentList = 187, RULE_methodReference = 188, RULE_methodReference_lf_primary = 189, 
		RULE_methodReference_lfno_primary = 190, RULE_arrayCreationExpression = 191, 
		RULE_dimExprs = 192, RULE_dimExpr = 193, RULE_constantExpression = 194, 
		RULE_expression = 195, RULE_lambdaExpression = 196, RULE_lambdaParameters = 197, 
		RULE_inferredFormalParameterList = 198, RULE_lambdaBody = 199, RULE_assignmentExpression = 200, 
		RULE_assignment = 201, RULE_leftHandSide = 202, RULE_assignmentOperator = 203, 
		RULE_conditionalExpression = 204, RULE_conditionalOrExpression = 205, 
		RULE_conditionalAndExpression = 206, RULE_inclusiveOrExpression = 207, 
		RULE_exclusiveOrExpression = 208, RULE_andExpression = 209, RULE_equalityExpression = 210, 
		RULE_relationalExpression = 211, RULE_shiftExpression = 212, RULE_additiveExpression = 213, 
		RULE_multiplicativeExpression = 214, RULE_unaryExpression = 215, RULE_preIncrementExpression = 216, 
		RULE_preDecrementExpression = 217, RULE_unaryExpressionNotPlusMinus = 218, 
		RULE_postfixExpression = 219, RULE_postIncrementExpression = 220, RULE_postDecrementExpression = 221, 
		RULE_castExpression = 222;
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
		"primaryNoNewArray_lf_primary", "primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary", 
		"primaryNoNewArray_lfno_primary", "primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary", 
		"primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary", "classInstanceCreationExpression", 
		"classInstanceCreationExpression_lf_primary", "classInstanceCreationExpression_lfno_primary", 
		"typeArgumentsOrDiamond", "fieldAccess", "fieldAccess_lf_primary", "fieldAccess_lfno_primary", 
		"arrayAccess", "arrayAccess_lf_primary", "arrayAccess_lfno_primary", "methodInvocation", 
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
		null, null, null, null, null, "'null'", null, "'('", "')'", "'{'", "'}'", 
		"'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", 
		"'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
		"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'->'", 
		"'::'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", 
		"'<<='", "'>>='", "'>>>='", null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
		"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
		"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", 
		"IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
		"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", 
		"SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", 
		"TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", "FloatingPointLiteral", 
		"BooleanLiteral", "BadBooleanLiteral", "CharacterLiteral", "StringLiteral", 
		"BadStringLiteral", "NullLiteral", "BadNullLiteral", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", 
		"GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", 
		"NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", 
		"BITOR", "CARET", "MOD", "ARROW", "COLONCOLON", "ADD_ASSIGN", "SUB_ASSIGN", 
		"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", 
		"LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "AT", 
		"ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
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
	        List<Modifier> mods = new ArrayList<>();
	        for (Modifier mod : modifiers) {
	            if (mods.contains(mod)) {
	                notifyErrorListeners(mod.getToken(),
	                                     null,
	                                     new RepeatModifierException(this,
	                                                                 getInputStream(),
	                                                                 getRuleContext(),
	                                                                 (MyToken)mods.get(mods.indexOf(mod)).getToken()));
	            } else {
	                mods.add(mod);
	            }
	        }
	    }

	    private MyRecognitionException createMyException(String suggestion) {
	        return new MyRecognitionException(this,
	                                          getInputStream(),
	                                          getRuleContext(),
	                                          suggestion);
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
		public Token e;
		public TerminalNode IntegerLiteral() { return getToken(Java8Parser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(Java8Parser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(Java8Parser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(Java8Parser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(Java8Parser.StringLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(Java8Parser.NullLiteral, 0); }
		public TerminalNode BadStringLiteral() { return getToken(Java8Parser.BadStringLiteral, 0); }
		public TerminalNode BadBooleanLiteral() { return getToken(Java8Parser.BadBooleanLiteral, 0); }
		public TerminalNode BadNullLiteral() { return getToken(Java8Parser.BadNullLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		try {
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
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
				setState(448);
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
				setState(450);
				((LiteralContext)_localctx).b = match(BooleanLiteral);
				((LiteralContext)_localctx).ret =  new LiteralExpression(((LiteralContext)_localctx).b, PrimitiveType.BOOLEAN);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(452);
				((LiteralContext)_localctx).c = match(CharacterLiteral);
				((LiteralContext)_localctx).ret =  new LiteralExpression(((LiteralContext)_localctx).c, PrimitiveType.CHAR);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(454);
				((LiteralContext)_localctx).s = match(StringLiteral);
				((LiteralContext)_localctx).ret =  new LiteralExpression(((LiteralContext)_localctx).s, null);
				}
				break;
			case NullLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(456);
				((LiteralContext)_localctx).n = match(NullLiteral);
				((LiteralContext)_localctx).ret =  new LiteralExpression(((LiteralContext)_localctx).n, null);
				}
				break;
			case BadStringLiteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(458);
				((LiteralContext)_localctx).e = match(BadStringLiteral);

				            notifyErrorListeners(((LiteralContext)_localctx).e,
				                                 "Strings must be enclosed in double quotes (\"\"), not single quotes (\'\')",
				                                 createMyException("Use \"\" instead of \'\'"));
				        
				}
				break;
			case BadBooleanLiteral:
				enterOuterAlt(_localctx, 8);
				{
				setState(460);
				((LiteralContext)_localctx).e = match(BadBooleanLiteral);

				            notifyErrorListeners(((LiteralContext)_localctx).e,
				                                 "Boolean value has wrong capitalization",
				                                 createMyException("boolean values must be all lowercase"));
				        
				}
				break;
			case BadNullLiteral:
				enterOuterAlt(_localctx, 9);
				{
				setState(462);
				((LiteralContext)_localctx).e = match(BadNullLiteral);

				            notifyErrorListeners(((LiteralContext)_localctx).e,
				                                 "The null literal has the wrong capitalization",
				                                 createMyException("the null literal must be all lowercase"));
				        
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
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				((Type_Context)_localctx).p = primitiveType();
				((Type_Context)_localctx).ret =  ((Type_Context)_localctx).p.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
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
		public NameExpression ret;
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
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(474);
					((PrimitiveTypeContext)_localctx).a = annotation();
					_localctx.anns.add(((PrimitiveTypeContext)_localctx).a.ret);
					}
					}
					setState(481);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(482);
				((PrimitiveTypeContext)_localctx).n = numericType();
				((PrimitiveTypeContext)_localctx).ret =  createTypeName(((PrimitiveTypeContext)_localctx).n.ret, _localctx.anns);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(485);
					((PrimitiveTypeContext)_localctx).a = annotation();
					_localctx.anns.add(((PrimitiveTypeContext)_localctx).a.ret);
					}
					}
					setState(492);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(493);
				((PrimitiveTypeContext)_localctx).b = match(BOOLEAN);
				((PrimitiveTypeContext)_localctx).ret =  createTypeName(((PrimitiveTypeContext)_localctx).b, _localctx.anns);
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
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				((NumericTypeContext)_localctx).i = integralType();
				((NumericTypeContext)_localctx).ret =  ((NumericTypeContext)_localctx).i.ret;
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
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
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				((IntegralTypeContext)_localctx).b = match(BYTE);
				((IntegralTypeContext)_localctx).ret =  ((IntegralTypeContext)_localctx).b;
				}
				break;
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				((IntegralTypeContext)_localctx).s = match(SHORT);
				((IntegralTypeContext)_localctx).ret =  ((IntegralTypeContext)_localctx).s;
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
				((IntegralTypeContext)_localctx).i = match(INT);
				((IntegralTypeContext)_localctx).ret =  ((IntegralTypeContext)_localctx).i;
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 4);
				{
				setState(511);
				((IntegralTypeContext)_localctx).l = match(LONG);
				((IntegralTypeContext)_localctx).ret =  ((IntegralTypeContext)_localctx).l;
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(513);
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
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				((FloatingPointTypeContext)_localctx).f = match(FLOAT);
				((FloatingPointTypeContext)_localctx).ret =  ((FloatingPointTypeContext)_localctx).f;
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
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
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				((ReferenceTypeContext)_localctx).c = classOrInterfaceType();
				((ReferenceTypeContext)_localctx).ret =  ((ReferenceTypeContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				((ReferenceTypeContext)_localctx).v = typeVariable();
				((ReferenceTypeContext)_localctx).ret =  ((ReferenceTypeContext)_localctx).v.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
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
			setState(534);
			((ClassOrInterfaceTypeContext)_localctx).co = classType_lfno_classOrInterfaceType();

			            ((ClassOrInterfaceTypeContext)_localctx).ret =  ((ClassOrInterfaceTypeContext)_localctx).co.ret;
			            if (((ClassOrInterfaceTypeContext)_localctx).co.targs != null) {
			                ((ClassOrInterfaceTypeContext)_localctx).ret =  new ParamExpression(_localctx.ret, ((ClassOrInterfaceTypeContext)_localctx).co.targs, ((ClassOrInterfaceTypeContext)_localctx).co.last);
			            }
			        
			setState(542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(536);
					match(DOT);
					setState(537);
					((ClassOrInterfaceTypeContext)_localctx).c = classType_lfno_classOrInterfaceType();

					                ((ClassOrInterfaceTypeContext)_localctx).ret =  new AccessExpression(_localctx.ret, ((ClassOrInterfaceTypeContext)_localctx).c.ret);
					                if (((ClassOrInterfaceTypeContext)_localctx).c.targs != null) {
					                    ((ClassOrInterfaceTypeContext)_localctx).ret =  new ParamExpression(_localctx.ret, ((ClassOrInterfaceTypeContext)_localctx).c.targs, ((ClassOrInterfaceTypeContext)_localctx).c.last);
					                }
					            
					}
					} 
				}
				setState(544);
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
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(545);
					((ClassTypeContext)_localctx).a = annotation();
					_localctx.anns.add(((ClassTypeContext)_localctx).a.ret);
					}
					}
					setState(552);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(553);
				((ClassTypeContext)_localctx).id = match(Identifier);
				((ClassTypeContext)_localctx).ret =  createPackageOrTypeName(((ClassTypeContext)_localctx).id, _localctx.anns);
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(555);
					((ClassTypeContext)_localctx).targs = typeArguments();
					((ClassTypeContext)_localctx).ret =  new ParamExpression(_localctx.ret,
					                                                           ((ClassTypeContext)_localctx).targs.ret,
					                                                           ((ClassTypeContext)_localctx).targs.last);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(560);
				((ClassTypeContext)_localctx).st = classOrInterfaceType();
				setState(561);
				match(DOT);
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(562);
					((ClassTypeContext)_localctx).a = annotation();
					_localctx.anns.add(((ClassTypeContext)_localctx).a.ret);
					}
					}
					setState(569);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(570);
				((ClassTypeContext)_localctx).id = match(Identifier);

				            ((ClassTypeContext)_localctx).ret =  new AccessExpression(((ClassTypeContext)_localctx).st.ret,
				                                        createPackageOrTypeName(((ClassTypeContext)_localctx).id, _localctx.anns));
				        
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(572);
					((ClassTypeContext)_localctx).targs = typeArguments();
					((ClassTypeContext)_localctx).ret =  new ParamExpression(_localctx.ret,
					                                                           ((ClassTypeContext)_localctx).targs.ret,
					                                                           ((ClassTypeContext)_localctx).targs.last);
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

	public static class ClassType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public NameExpression ret;
		public List<TypeArgument> targs;
		public Token last;
		public List<Annotation> ans = new ArrayList<>();
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
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(579);
				((ClassType_lfno_classOrInterfaceTypeContext)_localctx).a = annotation();
				_localctx.ans.add(((ClassType_lfno_classOrInterfaceTypeContext)_localctx).a.ret);
				}
				}
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(587);
			((ClassType_lfno_classOrInterfaceTypeContext)_localctx).id = match(Identifier);
			((ClassType_lfno_classOrInterfaceTypeContext)_localctx).ret =  createPackageOrTypeName(((ClassType_lfno_classOrInterfaceTypeContext)_localctx).id, _localctx.ans);
			setState(592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(589);
				((ClassType_lfno_classOrInterfaceTypeContext)_localctx).ta = typeArguments();
				((ClassType_lfno_classOrInterfaceTypeContext)_localctx).targs =  ((ClassType_lfno_classOrInterfaceTypeContext)_localctx).ta.ret; ((ClassType_lfno_classOrInterfaceTypeContext)_localctx).last =  ((ClassType_lfno_classOrInterfaceTypeContext)_localctx).ta.last;
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
		public NameExpression ret;
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
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(594);
				((TypeVariableContext)_localctx).a = annotation();
				_localctx.ans.add(((TypeVariableContext)_localctx).a.ret);
				}
				}
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(602);
			((TypeVariableContext)_localctx).id = match(Identifier);
			((TypeVariableContext)_localctx).ret =  createTypeName(((TypeVariableContext)_localctx).id, _localctx.ans);
			}
		}
		catch (RecognitionException re) {
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
			setState(617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				((ArrayTypeContext)_localctx).p = primitiveType();
				setState(606);
				((ArrayTypeContext)_localctx).d = dims();
				((ArrayTypeContext)_localctx).ret =  new ArrayTypeExpression(((ArrayTypeContext)_localctx).p.ret, ((ArrayTypeContext)_localctx).d.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				((ArrayTypeContext)_localctx).c = classOrInterfaceType();
				setState(610);
				((ArrayTypeContext)_localctx).d = dims();
				((ArrayTypeContext)_localctx).ret =  new ArrayTypeExpression(((ArrayTypeContext)_localctx).c.ret, ((ArrayTypeContext)_localctx).d.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(613);
				((ArrayTypeContext)_localctx).v = typeVariable();
				setState(614);
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
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(619);
				((DimsContext)_localctx).a1 = annotation();
				_localctx.ans.add(((DimsContext)_localctx).a1.ret);
				}
				}
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(627);
			((DimsContext)_localctx).first = match(LBRACK);
			setState(628);
			((DimsContext)_localctx).last = match(RBRACK);
			_localctx.ls.add(new Dimension(((DimsContext)_localctx).first, ((DimsContext)_localctx).last, _localctx.ans));
			setState(644);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					_localctx.ans.clear();
					setState(636);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(631);
						((DimsContext)_localctx).a = annotation();
						_localctx.ans.add(((DimsContext)_localctx).a.ret);
						}
						}
						setState(638);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(639);
					((DimsContext)_localctx).f = match(LBRACK);
					setState(640);
					((DimsContext)_localctx).l = match(RBRACK);
					_localctx.ls.add(new Dimension(((DimsContext)_localctx).f, ((DimsContext)_localctx).l, _localctx.ans));
					}
					} 
				}
				setState(646);
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
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(649);
				((TypeParameterContext)_localctx).a = typeParameterModifier();
				_localctx.ans.add(((TypeParameterContext)_localctx).a.ret);
				}
				}
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(657);
			((TypeParameterContext)_localctx).id = match(Identifier);
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(658);
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
			setState(665);
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
			setState(685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				match(EXTENDS);
				setState(669);
				((TypeBoundContext)_localctx).v = typeVariable();
				_localctx.ls.add(((TypeBoundContext)_localctx).v.ret); ((TypeBoundContext)_localctx).ret =  _localctx.ls;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				match(EXTENDS);
				setState(673);
				((TypeBoundContext)_localctx).c = classOrInterfaceType();
				_localctx.ls.add(((TypeBoundContext)_localctx).c.ret);
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(675);
					((TypeBoundContext)_localctx).a = additionalBound();
					_localctx.ls.add(((TypeBoundContext)_localctx).a.ret);
					}
					}
					setState(682);
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
			setState(687);
			match(BITAND);
			setState(688);
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
		public Token last;
		public TypeArgumentListContext ls;
		public Token end;
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
			setState(691);
			match(LT);
			setState(692);
			((TypeArgumentsContext)_localctx).ls = typeArgumentList();
			setState(693);
			((TypeArgumentsContext)_localctx).end = match(GT);
			((TypeArgumentsContext)_localctx).ret =  ((TypeArgumentsContext)_localctx).ls.ret; ((TypeArgumentsContext)_localctx).last =  ((TypeArgumentsContext)_localctx).end;
			}
		}
		catch (RecognitionException re) {
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
			setState(696);
			((TypeArgumentListContext)_localctx).a1 = typeArgument();
			_localctx.ls.add(((TypeArgumentListContext)_localctx).a1.ret);
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(698);
				match(COMMA);
				setState(699);
				((TypeArgumentListContext)_localctx).a = typeArgument();
				_localctx.ls.add(((TypeArgumentListContext)_localctx).a.ret);
				}
				}
				setState(706);
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
			setState(715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(709);
				((TypeArgumentContext)_localctx).r = referenceType();
				((TypeArgumentContext)_localctx).ret =  new TypeArgument(((TypeArgumentContext)_localctx).r.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(712);
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
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(717);
				((WildcardContext)_localctx).a = annotation();
				_localctx.ans.add(((WildcardContext)_localctx).a.ret);
				}
				}
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(725);
			((WildcardContext)_localctx).w = match(QUESTION);
			((WildcardContext)_localctx).ret =  new TypeArgument(((WildcardContext)_localctx).w, _localctx.ans);
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(727);
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
			setState(738);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(730);
				match(EXTENDS);
				setState(731);
				((WildcardBoundsContext)_localctx).r = referenceType();
				_localctx.ret.setBoundType(((WildcardBoundsContext)_localctx).r.ret); _localctx.ret.setIsUpperBounded(true);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
				match(SUPER);
				setState(735);
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
		public NameExpression ret;
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
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(740);
				((TypeNameContext)_localctx).id = match(Identifier);
				 ((TypeNameContext)_localctx).ret =  createTypeName(((TypeNameContext)_localctx).id); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(742);
				((TypeNameContext)_localctx).p = packageOrTypeName(0);
				setState(743);
				match(DOT);
				setState(744);
				((TypeNameContext)_localctx).id = match(Identifier);
				((TypeNameContext)_localctx).ret =  new NameExpression(((TypeNameContext)_localctx).p.ret, createTypeName(((TypeNameContext)_localctx).id));
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
		public NameExpression ret;
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
			setState(750);
			((PackageOrTypeNameContext)_localctx).id = match(Identifier);
			 ((PackageOrTypeNameContext)_localctx).ret =  createPackageOrTypeName(((PackageOrTypeNameContext)_localctx).id); 
			}
			_ctx.stop = _input.LT(-1);
			setState(759);
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
					setState(753);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(754);
					match(DOT);
					setState(755);
					((PackageOrTypeNameContext)_localctx).id = match(Identifier);
					((PackageOrTypeNameContext)_localctx).ret =  new NameExpression(((PackageOrTypeNameContext)_localctx).p.ret, createTypeName(((PackageOrTypeNameContext)_localctx).id));
					}
					} 
				}
				setState(761);
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
		public NameExpression ret;
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
			setState(769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				((ExpressionNameContext)_localctx).id = match(Identifier);
				 ((ExpressionNameContext)_localctx).ret =  createExpressionName(((ExpressionNameContext)_localctx).id); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				((ExpressionNameContext)_localctx).a = ambiguousName(0);
				setState(765);
				match(DOT);
				setState(766);
				((ExpressionNameContext)_localctx).id = match(Identifier);
				((ExpressionNameContext)_localctx).ret =  new NameExpression(((ExpressionNameContext)_localctx).a.ret, createAmbiguousName(((ExpressionNameContext)_localctx).id));
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
		public NameExpression ret;
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
			setState(772);
			((AmbiguousNameContext)_localctx).id = match(Identifier);
			 ((AmbiguousNameContext)_localctx).ret =  createAmbiguousName(((AmbiguousNameContext)_localctx).id); 
			}
			_ctx.stop = _input.LT(-1);
			setState(781);
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
					setState(775);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(776);
					match(DOT);
					setState(777);
					((AmbiguousNameContext)_localctx).id = match(Identifier);
					((AmbiguousNameContext)_localctx).ret =  new NameExpression(((AmbiguousNameContext)_localctx).a.ret, createAmbiguousName(((AmbiguousNameContext)_localctx).id));
					}
					} 
				}
				setState(783);
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
			setState(787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(784);
				((CompilationUnitContext)_localctx).p = packageDeclaration();
				((CompilationUnitContext)_localctx).stmt =  ((CompilationUnitContext)_localctx).p.ret;
				}
				break;
			}
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(789);
				((CompilationUnitContext)_localctx).i = importDeclaration();
				_localctx.imports.add(((CompilationUnitContext)_localctx).i.ret);
				}
				}
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(797);
				((CompilationUnitContext)_localctx).t = typeDeclaration();
				_localctx.bodies.add(((CompilationUnitContext)_localctx).t.ret);
				}
				}
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(805);
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
		public NameExpression name;
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
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(808);
				((PackageDeclarationContext)_localctx).a = packageModifier();
				_localctx.anns.add(((PackageDeclarationContext)_localctx).a.ret);
				}
				}
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(816);
			((PackageDeclarationContext)_localctx).kw = match(PACKAGE);
			{
			setState(817);
			((PackageDeclarationContext)_localctx).id = match(Identifier);
			((PackageDeclarationContext)_localctx).name =  createPackageName(((PackageDeclarationContext)_localctx).id);
			}
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(820);
				match(DOT);
				setState(821);
				((PackageDeclarationContext)_localctx).id = match(Identifier);

				                ((PackageDeclarationContext)_localctx).name =  new NameExpression(_localctx.name,
				                                           createPackageName(((PackageDeclarationContext)_localctx).id));
				            
				}
				}
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(828);
			((PackageDeclarationContext)_localctx).last = match(SEMI);
			 ((PackageDeclarationContext)_localctx).ret =  new PackageStatement(_localctx.name, ((PackageDeclarationContext)_localctx).kw, ((PackageDeclarationContext)_localctx).last, _localctx.anns);
			}
		}
		catch (RecognitionException re) {
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
			setState(831);
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
			setState(846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(834);
				((ImportDeclarationContext)_localctx).s = singleTypeImportDeclaration();
				((ImportDeclarationContext)_localctx).ret =  ((ImportDeclarationContext)_localctx).s.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(837);
				((ImportDeclarationContext)_localctx).t = typeImportOnDemandDeclaration();
				((ImportDeclarationContext)_localctx).ret =  ((ImportDeclarationContext)_localctx).t.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(840);
				((ImportDeclarationContext)_localctx).ss = singleStaticImportDeclaration();
				((ImportDeclarationContext)_localctx).ret =  ((ImportDeclarationContext)_localctx).ss.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(843);
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
			setState(848);
			((SingleTypeImportDeclarationContext)_localctx).kw = match(IMPORT);
			setState(849);
			((SingleTypeImportDeclarationContext)_localctx).t = typeName();
			setState(850);
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
			setState(853);
			((TypeImportOnDemandDeclarationContext)_localctx).kw = match(IMPORT);
			setState(854);
			((TypeImportOnDemandDeclarationContext)_localctx).p = packageOrTypeName(0);
			setState(855);
			match(DOT);
			setState(856);
			match(MUL);
			setState(857);
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
			setState(860);
			((SingleStaticImportDeclarationContext)_localctx).kw = match(IMPORT);
			setState(861);
			match(STATIC);
			setState(862);
			((SingleStaticImportDeclarationContext)_localctx).t = typeName();
			setState(863);
			match(DOT);
			setState(864);
			((SingleStaticImportDeclarationContext)_localctx).id = match(Identifier);
			setState(865);
			((SingleStaticImportDeclarationContext)_localctx).last = match(SEMI);

			            ((SingleStaticImportDeclarationContext)_localctx).ret =  new ImportStatement(((SingleStaticImportDeclarationContext)_localctx).kw,
			                                       ((SingleStaticImportDeclarationContext)_localctx).last,
			                                       new NameExpression(((SingleStaticImportDeclarationContext)_localctx).t.ret,
			                                                          createAmbiguousName(((SingleStaticImportDeclarationContext)_localctx).id)),
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
			setState(868);
			((StaticImportOnDemandDeclarationContext)_localctx).kw = match(IMPORT);
			setState(869);
			match(STATIC);
			setState(870);
			((StaticImportOnDemandDeclarationContext)_localctx).t = typeName();
			setState(871);
			match(DOT);
			setState(872);
			match(MUL);
			setState(873);
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
			setState(883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(876);
				((TypeDeclarationContext)_localctx).c = classDeclaration();
				((TypeDeclarationContext)_localctx).ret =  ((TypeDeclarationContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(879);
				((TypeDeclarationContext)_localctx).i = interfaceDeclaration();
				((TypeDeclarationContext)_localctx).ret =  ((TypeDeclarationContext)_localctx).i.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(882);
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
			setState(891);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(885);
				((ClassDeclarationContext)_localctx).n = normalClassDeclaration();
				((ClassDeclarationContext)_localctx).ret =  ((ClassDeclarationContext)_localctx).n.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(888);
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
		public Expression scls = new NilExpression();
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
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				setState(899);
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
					setState(893);
					((NormalClassDeclarationContext)_localctx).m = classModifier();
					_localctx.mods.add(((NormalClassDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(896);
					((NormalClassDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((NormalClassDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			checkModifiers(_localctx.mods);
			setState(905);
			((NormalClassDeclarationContext)_localctx).kw = match(CLASS);
			setState(906);
			((NormalClassDeclarationContext)_localctx).n = match(Identifier);
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(907);
				((NormalClassDeclarationContext)_localctx).p = typeParameters();
				((NormalClassDeclarationContext)_localctx).tpars =  ((NormalClassDeclarationContext)_localctx).p.ret;
				}
			}

			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(912);
				((NormalClassDeclarationContext)_localctx).sc = superclass();
				((NormalClassDeclarationContext)_localctx).scls =  ((NormalClassDeclarationContext)_localctx).sc.ret;
				}
			}

			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(917);
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
			setState(923);
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
			setState(939);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(925);
				((ClassModifierContext)_localctx).pu = match(PUBLIC);
				((ClassModifierContext)_localctx).ret =  new Modifier(((ClassModifierContext)_localctx).pu);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(927);
				((ClassModifierContext)_localctx).pro = match(PROTECTED);
				((ClassModifierContext)_localctx).ret =  new Modifier(((ClassModifierContext)_localctx).pro);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(929);
				((ClassModifierContext)_localctx).pri = match(PRIVATE);
				((ClassModifierContext)_localctx).ret =  new Modifier(((ClassModifierContext)_localctx).pri);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 4);
				{
				setState(931);
				((ClassModifierContext)_localctx).ab = match(ABSTRACT);
				((ClassModifierContext)_localctx).ret =  new Modifier(((ClassModifierContext)_localctx).ab);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(933);
				((ClassModifierContext)_localctx).st = match(STATIC);
				((ClassModifierContext)_localctx).ret =  new Modifier(((ClassModifierContext)_localctx).st);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(935);
				((ClassModifierContext)_localctx).f = match(FINAL);
				((ClassModifierContext)_localctx).ret =  new Modifier(((ClassModifierContext)_localctx).f);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
				setState(937);
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
			setState(941);
			match(LT);
			setState(942);
			((TypeParametersContext)_localctx).t = typeParameterList();
			setState(943);
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
			setState(946);
			((TypeParameterListContext)_localctx).t1 = typeParameter();
			_localctx.ls.add(((TypeParameterListContext)_localctx).t1.ret);
			}
			setState(955);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(949);
				match(COMMA);
				setState(950);
				((TypeParameterListContext)_localctx).t = typeParameter();
				_localctx.ls.add(((TypeParameterListContext)_localctx).t.ret);
				}
				}
				setState(957);
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
			setState(960);
			match(EXTENDS);
			setState(961);
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
			setState(964);
			match(IMPLEMENTS);
			setState(965);
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
			setState(968);
			((InterfaceTypeListContext)_localctx).i1 = classType();
			_localctx.ls.add(((InterfaceTypeListContext)_localctx).i1.ret);
			}
			setState(977);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(971);
				match(COMMA);
				setState(972);
				((InterfaceTypeListContext)_localctx).i = classType();
				_localctx.ls.add(((InterfaceTypeListContext)_localctx).i.ret);
				}
				}
				setState(979);
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
			setState(982);
			((ClassBodyContext)_localctx).first = match(LBRACE);
			setState(986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				{
				setState(983);
				classBodyDeclaration(_localctx.ret);
				}
				}
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(989);
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
			setState(1002);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(992);
				classMemberDeclaration(_localctx.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(993);
				((ClassBodyDeclarationContext)_localctx).i = instanceInitializer();
				_localctx.ret.addInstanceInitializer(((ClassBodyDeclarationContext)_localctx).i.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(996);
				((ClassBodyDeclarationContext)_localctx).s = staticInitializer();
				_localctx.ret.addStaticInitializer(((ClassBodyDeclarationContext)_localctx).s.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(999);
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
			setState(1015);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1004);
				((ClassMemberDeclarationContext)_localctx).f = fieldDeclaration(ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1005);
				((ClassMemberDeclarationContext)_localctx).m = methodDeclaration();
				_localctx.ret.addMethod(((ClassMemberDeclarationContext)_localctx).m.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1008);
				((ClassMemberDeclarationContext)_localctx).c = classDeclaration();
				_localctx.ret.addInnerBody(((ClassMemberDeclarationContext)_localctx).c.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1011);
				((ClassMemberDeclarationContext)_localctx).i = interfaceDeclaration();
				_localctx.ret.addInnerBody(((ClassMemberDeclarationContext)_localctx).i.ret);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1014);
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
			setState(1025);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				setState(1023);
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
					setState(1017);
					((FieldDeclarationContext)_localctx).m = fieldModifier();
					_localctx.mods.add(((FieldDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1020);
					((FieldDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((FieldDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1027);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			checkModifiers(_localctx.mods);
			setState(1029);
			((FieldDeclarationContext)_localctx).t = unannType();
			setState(1030);
			variableDeclaratorList(_localctx.decl, _localctx.mods, _localctx.ans, ((FieldDeclarationContext)_localctx).t.ret);
			setState(1031);
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
			setState(1047);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1033);
				((FieldModifierContext)_localctx).pu = match(PUBLIC);
				((FieldModifierContext)_localctx).ret =  new Modifier(((FieldModifierContext)_localctx).pu);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1035);
				((FieldModifierContext)_localctx).pro = match(PROTECTED);
				((FieldModifierContext)_localctx).ret =  new Modifier(((FieldModifierContext)_localctx).pro);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1037);
				((FieldModifierContext)_localctx).pri = match(PRIVATE);
				((FieldModifierContext)_localctx).ret =  new Modifier(((FieldModifierContext)_localctx).pri);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 4);
				{
				setState(1039);
				((FieldModifierContext)_localctx).st = match(STATIC);
				((FieldModifierContext)_localctx).ret =  new Modifier(((FieldModifierContext)_localctx).st);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1041);
				((FieldModifierContext)_localctx).f = match(FINAL);
				((FieldModifierContext)_localctx).ret =  new Modifier(((FieldModifierContext)_localctx).f);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1043);
				((FieldModifierContext)_localctx).t = match(TRANSIENT);
				((FieldModifierContext)_localctx).ret =  new Modifier(((FieldModifierContext)_localctx).t);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1045);
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
			setState(1049);
			((VariableDeclaratorListContext)_localctx).d1 = variableDeclarator(_localctx.decl, _localctx.mods, _localctx.ans, _localctx.t);
			_localctx.ls.add(((VariableDeclaratorListContext)_localctx).d1.ret);
			}
			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1052);
				match(COMMA);
				setState(1053);
				((VariableDeclaratorListContext)_localctx).d = variableDeclarator(_localctx.decl, _localctx.mods, _localctx.ans, _localctx.t);
				_localctx.ls.add(((VariableDeclaratorListContext)_localctx).d.ret);
				}
				}
				setState(1060);
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
			setState(1063);
			((VariableDeclaratorContext)_localctx).id = variableDeclaratorId();

			            ((VariableDeclaratorContext)_localctx).type =  _localctx.t;
			            if (((VariableDeclaratorContext)_localctx).id.d.size() > 0) {
			                ((VariableDeclaratorContext)_localctx).type =  new ArrayTypeExpression(_localctx.t, ((VariableDeclaratorContext)_localctx).id.d);
			            }
			            ((VariableDeclaratorContext)_localctx).var =  new VariableDeclaration(((VariableDeclaratorContext)_localctx).id.ret, _localctx.type, _localctx.mods, _localctx.ans);
			            if (_localctx.decl != null) {
			                _localctx.decl.addField(_localctx.var);
			            }
			        
			setState(1069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1065);
				match(ASSIGN);
				setState(1066);
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
			setState(1074);
			((VariableDeclaratorIdContext)_localctx).id = match(Identifier);
			setState(1078);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1075);
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
			setState(1082);
			((TypedVariableDeclaratorIdContext)_localctx).t = unannType();
			setState(1083);
			((TypedVariableDeclaratorIdContext)_localctx).id = variableDeclaratorId();

			            ((TypedVariableDeclaratorIdContext)_localctx).expr =  ((TypedVariableDeclaratorIdContext)_localctx).t.ret;
			            if (((TypedVariableDeclaratorIdContext)_localctx).id.d.size() > 0) {
			                ((TypedVariableDeclaratorIdContext)_localctx).expr =  new ArrayTypeExpression(((TypedVariableDeclaratorIdContext)_localctx).t.ret, ((TypedVariableDeclaratorIdContext)_localctx).id.d);
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
			setState(1092);
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
			case BadBooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case BadStringLiteral:
			case NullLiteral:
			case BadNullLiteral:
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
				setState(1086);
				((VariableInitializerContext)_localctx).ex = expression();
				((VariableInitializerContext)_localctx).ret =  ((VariableInitializerContext)_localctx).ex.ret;
				}
				break;
			case LBRACE:
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(1089);
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
			setState(1100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1094);
				((UnannTypeContext)_localctx).p = unannPrimitiveType();
				((UnannTypeContext)_localctx).ret =  ((UnannTypeContext)_localctx).p.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1097);
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
		public NameExpression ret;
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
			setState(1107);
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
				setState(1102);
				((UnannPrimitiveTypeContext)_localctx).n = numericType();
				((UnannPrimitiveTypeContext)_localctx).ret =  createTypeName(((UnannPrimitiveTypeContext)_localctx).n.ret);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1105);
				((UnannPrimitiveTypeContext)_localctx).b = match(BOOLEAN);
				((UnannPrimitiveTypeContext)_localctx).ret =  createTypeName(((UnannPrimitiveTypeContext)_localctx).b);
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
			setState(1118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1109);
				((UnannReferenceTypeContext)_localctx).c = unannClassOrInterfaceType();
				((UnannReferenceTypeContext)_localctx).ret =  ((UnannReferenceTypeContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1112);
				((UnannReferenceTypeContext)_localctx).v = unannTypeVariable();
				((UnannReferenceTypeContext)_localctx).ret =  ((UnannReferenceTypeContext)_localctx).v.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1115);
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
			setState(1120);
			((UnannClassOrInterfaceTypeContext)_localctx).cno = unannClassType_lfno_unannClassOrInterfaceType();
			((UnannClassOrInterfaceTypeContext)_localctx).ret =  ((UnannClassOrInterfaceTypeContext)_localctx).cno.ret;
			}
			setState(1129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1123);
					match(DOT);
					setState(1124);
					((UnannClassOrInterfaceTypeContext)_localctx).c = classType_lfno_classOrInterfaceType();

					                ((UnannClassOrInterfaceTypeContext)_localctx).ret =  new AccessExpression(_localctx.ret, ((UnannClassOrInterfaceTypeContext)_localctx).c.ret);
					                if (((UnannClassOrInterfaceTypeContext)_localctx).c.targs != null) {
					                    ((UnannClassOrInterfaceTypeContext)_localctx).ret =  new ParamExpression(_localctx.ret, ((UnannClassOrInterfaceTypeContext)_localctx).c.targs, ((UnannClassOrInterfaceTypeContext)_localctx).c.last);
					                }
					            
					}
					} 
				}
				setState(1131);
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
			setState(1140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1132);
				((UnannClassTypeContext)_localctx).u = unannClassType_lfno_unannClassOrInterfaceType();
				((UnannClassTypeContext)_localctx).ret =  ((UnannClassTypeContext)_localctx).u.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1135);
				((UnannClassTypeContext)_localctx).a = unannClassOrInterfaceType();
				setState(1136);
				match(DOT);
				setState(1137);
				((UnannClassTypeContext)_localctx).b = classType_lfno_classOrInterfaceType();

				            ((UnannClassTypeContext)_localctx).ret =  new AccessExpression(((UnannClassTypeContext)_localctx).a.ret, ((UnannClassTypeContext)_localctx).b.ret);
				            if (((UnannClassTypeContext)_localctx).b.targs != null) {
				                ((UnannClassTypeContext)_localctx).ret =  new ParamExpression(_localctx.ret, ((UnannClassTypeContext)_localctx).b.targs, ((UnannClassTypeContext)_localctx).b.last);
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
			setState(1142);
			((UnannClassType_lfno_unannClassOrInterfaceTypeContext)_localctx).id = match(Identifier);
			((UnannClassType_lfno_unannClassOrInterfaceTypeContext)_localctx).ret =  createPackageOrTypeName(((UnannClassType_lfno_unannClassOrInterfaceTypeContext)_localctx).id);
			setState(1147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1144);
				((UnannClassType_lfno_unannClassOrInterfaceTypeContext)_localctx).targs = typeArguments();
				((UnannClassType_lfno_unannClassOrInterfaceTypeContext)_localctx).ret =  new ParamExpression(_localctx.ret, ((UnannClassType_lfno_unannClassOrInterfaceTypeContext)_localctx).targs.ret, ((UnannClassType_lfno_unannClassOrInterfaceTypeContext)_localctx).targs.last);
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
		public NameExpression ret;
		public Token id;
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
			setState(1149);
			((UnannTypeVariableContext)_localctx).id = match(Identifier);
			((UnannTypeVariableContext)_localctx).ret =  createTypeName(((UnannTypeVariableContext)_localctx).id);
			}
		}
		catch (RecognitionException re) {
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
			setState(1164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1152);
				((UnannArrayTypeContext)_localctx).p = unannPrimitiveType();
				setState(1153);
				((UnannArrayTypeContext)_localctx).d = dims();
				((UnannArrayTypeContext)_localctx).ret =  new ArrayTypeExpression(((UnannArrayTypeContext)_localctx).p.ret, ((UnannArrayTypeContext)_localctx).d.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1156);
				((UnannArrayTypeContext)_localctx).c = unannClassOrInterfaceType();
				setState(1157);
				((UnannArrayTypeContext)_localctx).d = dims();
				((UnannArrayTypeContext)_localctx).ret =  new ArrayTypeExpression(((UnannArrayTypeContext)_localctx).c.ret, ((UnannArrayTypeContext)_localctx).d.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1160);
				((UnannArrayTypeContext)_localctx).v = unannTypeVariable();
				setState(1161);
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
			setState(1174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED))) != 0) || _la==AT) {
				{
				setState(1172);
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
					setState(1166);
					((MethodDeclarationContext)_localctx).m = methodModifier();
					_localctx.mods.add(((MethodDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1169);
					((MethodDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((MethodDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			checkModifiers(_localctx.mods);
			((MethodDeclarationContext)_localctx).ret =  new MethodDeclaration(_localctx.mods, _localctx.ans);
			setState(1179);
			methodHeader(_localctx.ret);
			setState(1180);
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
			setState(1201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1183);
				((MethodModifierContext)_localctx).pu = match(PUBLIC);
				((MethodModifierContext)_localctx).ret =  new Modifier(((MethodModifierContext)_localctx).pu);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1185);
				((MethodModifierContext)_localctx).pro = match(PROTECTED);
				((MethodModifierContext)_localctx).ret =  new Modifier(((MethodModifierContext)_localctx).pro);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1187);
				((MethodModifierContext)_localctx).pri = match(PRIVATE);
				((MethodModifierContext)_localctx).ret =  new Modifier(((MethodModifierContext)_localctx).pri);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1189);
				((MethodModifierContext)_localctx).ab = match(ABSTRACT);
				((MethodModifierContext)_localctx).ret =  new Modifier(((MethodModifierContext)_localctx).ab);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1191);
				((MethodModifierContext)_localctx).st = match(STATIC);
				((MethodModifierContext)_localctx).ret =  new Modifier(((MethodModifierContext)_localctx).st);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1193);
				((MethodModifierContext)_localctx).f = match(FINAL);
				((MethodModifierContext)_localctx).ret =  new Modifier(((MethodModifierContext)_localctx).f);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 7);
				{
				setState(1195);
				((MethodModifierContext)_localctx).s = match(SYNCHRONIZED);
				((MethodModifierContext)_localctx).ret =  new Modifier(((MethodModifierContext)_localctx).s);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1197);
				((MethodModifierContext)_localctx).n = match(NATIVE);
				((MethodModifierContext)_localctx).ret =  new Modifier(((MethodModifierContext)_localctx).n);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 9);
				{
				setState(1199);
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
			setState(1230);
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
				setState(1203);
				((MethodHeaderContext)_localctx).rt = result();
				_localctx.ret.setReturnType(((MethodHeaderContext)_localctx).rt.ret);
				setState(1205);
				methodDeclarator(_localctx.ret);
				setState(1209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1206);
					((MethodHeaderContext)_localctx).th = throws_();
					_localctx.ret.setExceptions(((MethodHeaderContext)_localctx).th.ret);
					}
				}

				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1211);
				((MethodHeaderContext)_localctx).tp = typeParameters();
				_localctx.ret.setTypeParameters(((MethodHeaderContext)_localctx).tp.ret);
				setState(1218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1213);
					((MethodHeaderContext)_localctx).a = annotation();
					_localctx.ans.add(((MethodHeaderContext)_localctx).a.ret);
					}
					}
					setState(1220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

				            if (_localctx.ans.size() > 0) {
				                _localctx.ret.setReturnTypeAnnotations(_localctx.ans);
				            }
				        
				setState(1222);
				((MethodHeaderContext)_localctx).rt = result();
				_localctx.ret.setReturnType(((MethodHeaderContext)_localctx).rt.ret);
				setState(1224);
				methodDeclarator(_localctx.ret);
				setState(1228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1225);
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
			setState(1237);
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
				setState(1232);
				((ResultContext)_localctx).u = unannType();
				((ResultContext)_localctx).ret =  ((ResultContext)_localctx).u.ret;
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1235);
				((ResultContext)_localctx).v = match(VOID);
				((ResultContext)_localctx).ret =  createTypeName(((ResultContext)_localctx).v);
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
			setState(1239);
			((MethodDeclaratorContext)_localctx).n = match(Identifier);
			_localctx.ret.setName(((MethodDeclaratorContext)_localctx).n);
			setState(1241);
			match(LPAREN);
			setState(1245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1242);
				((MethodDeclaratorContext)_localctx).p = formalParameterList();
				_localctx.ret.setParameters(((MethodDeclaratorContext)_localctx).p.ret);
				}
			}

			setState(1247);
			match(RPAREN);
			setState(1251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1248);
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
			setState(1267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1253);
				((FormalParameterListContext)_localctx).p = formalParameters();
				_localctx.ls.addAll(((FormalParameterListContext)_localctx).p.ret);
				}
				setState(1256);
				match(COMMA);
				{
				setState(1257);
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
				setState(1262);
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
			setState(1297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1269);
				((FormalParametersContext)_localctx).p = formalParameter();
				_localctx.ls.add(((FormalParametersContext)_localctx).p.ret);
				}
				setState(1278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1272);
						match(COMMA);
						setState(1273);
						((FormalParametersContext)_localctx).f = formalParameter();
						_localctx.ls.add(((FormalParametersContext)_localctx).f.ret);
						}
						} 
					}
					setState(1280);
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
				setState(1283);
				((FormalParametersContext)_localctx).r = receiverParameter();
				_localctx.ls.add(((FormalParametersContext)_localctx).r.ret);
				}
				setState(1292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1286);
						match(COMMA);
						setState(1287);
						((FormalParametersContext)_localctx).f = formalParameter();
						_localctx.ls.add(((FormalParametersContext)_localctx).f.ret);
						}
						} 
					}
					setState(1294);
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
			setState(1307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				setState(1305);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FINAL:
					{
					{
					setState(1299);
					((FormalParameterContext)_localctx).m = variableModifier();
					_localctx.mods.add(((FormalParameterContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1302);
					((FormalParameterContext)_localctx).a = annotation();
					_localctx.ans.add(((FormalParameterContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			checkModifiers(_localctx.mods);
			setState(1311);
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
			setState(1314);
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
			setState(1344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
					setState(1323);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FINAL:
						{
						{
						setState(1317);
						((LastFormalParameterContext)_localctx).m = variableModifier();
						_localctx.mods.add(((LastFormalParameterContext)_localctx).m.ret);
						}
						}
						break;
					case AT:
						{
						{
						setState(1320);
						((LastFormalParameterContext)_localctx).a = annotation();
						_localctx.ans.add(((LastFormalParameterContext)_localctx).a.ret);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1328);
				((LastFormalParameterContext)_localctx).t = unannType();
				setState(1334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1329);
					((LastFormalParameterContext)_localctx).a = annotation();
					_localctx.ans2.add(((LastFormalParameterContext)_localctx).a.ret);
					}
					}
					setState(1336);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1337);
				((LastFormalParameterContext)_localctx).e = match(ELLIPSIS);
				setState(1338);
				((LastFormalParameterContext)_localctx).n = variableDeclaratorId();

				            ((LastFormalParameterContext)_localctx).type =  ((LastFormalParameterContext)_localctx).t.ret;
				            if (((LastFormalParameterContext)_localctx).n.d.size() > 0) {
				                ((LastFormalParameterContext)_localctx).type =  new ArrayTypeExpression(((LastFormalParameterContext)_localctx).t.ret, ((LastFormalParameterContext)_localctx).n.d);
				            }
				            ((LastFormalParameterContext)_localctx).ret =  new VariableDeclaration(((LastFormalParameterContext)_localctx).n.ret, _localctx.type, _localctx.mods, _localctx.ans, ((LastFormalParameterContext)_localctx).e, _localctx.ans2);
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1341);
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
			setState(1351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1346);
				((ReceiverParameterContext)_localctx).a = annotation();
				_localctx.ans.add(((ReceiverParameterContext)_localctx).a.ret);
				}
				}
				setState(1353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1354);
			((ReceiverParameterContext)_localctx).t = unannType();
			setState(1355);
			((ReceiverParameterContext)_localctx).id = match(Identifier);
			setState(1356);
			match(DOT);
			setState(1357);
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
			setState(1360);
			match(THROWS);
			setState(1361);
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
			setState(1364);
			((ExceptionTypeListContext)_localctx).e = exceptionType();
			_localctx.ls.add(((ExceptionTypeListContext)_localctx).e.ret);
			}
			setState(1373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1367);
				match(COMMA);
				setState(1368);
				((ExceptionTypeListContext)_localctx).e = exceptionType();
				_localctx.ls.add(((ExceptionTypeListContext)_localctx).e.ret);
				}
				}
				setState(1375);
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
			setState(1384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1378);
				((ExceptionTypeContext)_localctx).c = classType();
				((ExceptionTypeContext)_localctx).ret =  ((ExceptionTypeContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1381);
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
			setState(1391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1386);
				((MethodBodyContext)_localctx).body = block();
				((MethodBodyContext)_localctx).ret =  ((MethodBodyContext)_localctx).body.ret;
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1389);
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
			setState(1393);
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
			setState(1396);
			((StaticInitializerContext)_localctx).kw = match(STATIC);
			setState(1397);
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
			setState(1408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0) || _la==AT) {
				{
				setState(1406);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRIVATE:
				case PROTECTED:
				case PUBLIC:
					{
					{
					setState(1400);
					((ConstructorDeclarationContext)_localctx).m = constructorModifier();
					_localctx.mods.add(((ConstructorDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1403);
					((ConstructorDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((ConstructorDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			checkModifiers(_localctx.mods);
			((ConstructorDeclarationContext)_localctx).ret =  new MethodDeclaration(_localctx.mods, _localctx.ans);
			         _localctx.ret.setConstructor(true);
			setState(1413);
			constructorDeclarator(_localctx.ret);
			setState(1417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1414);
				((ConstructorDeclarationContext)_localctx).t = throws_();
				_localctx.ret.setExceptions(((ConstructorDeclarationContext)_localctx).t.ret);
				}
			}

			setState(1419);
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
			setState(1428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1422);
				((ConstructorModifierContext)_localctx).pu = match(PUBLIC);
				((ConstructorModifierContext)_localctx).ret =  new Modifier(((ConstructorModifierContext)_localctx).pu);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1424);
				((ConstructorModifierContext)_localctx).pro = match(PROTECTED);
				((ConstructorModifierContext)_localctx).ret =  new Modifier(((ConstructorModifierContext)_localctx).pro);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1426);
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
			setState(1433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1430);
				((ConstructorDeclaratorContext)_localctx).t = typeParameters();
				_localctx.ret.setTypeParameters(((ConstructorDeclaratorContext)_localctx).t.ret);
				}
			}

			setState(1435);
			((ConstructorDeclaratorContext)_localctx).n = match(Identifier);
			_localctx.ret.setName(((ConstructorDeclaratorContext)_localctx).n);
			setState(1437);
			match(LPAREN);
			setState(1441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1438);
				((ConstructorDeclaratorContext)_localctx).l = formalParameterList();
				_localctx.ret.setParameters(((ConstructorDeclaratorContext)_localctx).l.ret);
				}
			}

			setState(1443);
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
			setState(1446);
			((ConstructorBodyContext)_localctx).first = match(LBRACE);
			setState(1450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(1447);
				((ConstructorBodyContext)_localctx).s = explicitConstructorInvocation();
				_localctx.ret.addStatement(((ConstructorBodyContext)_localctx).s.ret);
				}
				break;
			}
			setState(1455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				setState(1452);
				((ConstructorBodyContext)_localctx).st = blockStatements();
				_localctx.ret.addStatements(((ConstructorBodyContext)_localctx).st.ret);
				}
			}

			setState(1457);
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
			setState(1526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1460);
					((ExplicitConstructorInvocationContext)_localctx).t = typeArguments();
					((ExplicitConstructorInvocationContext)_localctx).targs =  ((ExplicitConstructorInvocationContext)_localctx).t.ret;
					}
				}

				setState(1465);
				((ExplicitConstructorInvocationContext)_localctx).kw = match(THIS);
				setState(1466);
				match(LPAREN);
				setState(1470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(1467);
					((ExplicitConstructorInvocationContext)_localctx).a = argumentList();
					((ExplicitConstructorInvocationContext)_localctx).args =  ((ExplicitConstructorInvocationContext)_localctx).a.ret;
					}
				}

				setState(1472);
				match(RPAREN);
				setState(1473);
				((ExplicitConstructorInvocationContext)_localctx).last = match(SEMI);
				((ExplicitConstructorInvocationContext)_localctx).ret =  new CallExpression(((ExplicitConstructorInvocationContext)_localctx).last, createTypeName(((ExplicitConstructorInvocationContext)_localctx).kw), ((ExplicitConstructorInvocationContext)_localctx).kw,
				                                   _localctx.args, _localctx.targs);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1475);
					((ExplicitConstructorInvocationContext)_localctx).t = typeArguments();
					((ExplicitConstructorInvocationContext)_localctx).targs =  ((ExplicitConstructorInvocationContext)_localctx).t.ret;
					}
				}

				setState(1480);
				((ExplicitConstructorInvocationContext)_localctx).kw = match(SUPER);
				setState(1481);
				match(LPAREN);
				setState(1485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(1482);
					((ExplicitConstructorInvocationContext)_localctx).a = argumentList();
					((ExplicitConstructorInvocationContext)_localctx).args =  ((ExplicitConstructorInvocationContext)_localctx).a.ret;
					}
				}

				setState(1487);
				match(RPAREN);
				setState(1488);
				((ExplicitConstructorInvocationContext)_localctx).last = match(SEMI);
				((ExplicitConstructorInvocationContext)_localctx).ret =  new CallExpression(((ExplicitConstructorInvocationContext)_localctx).last, createTypeName(((ExplicitConstructorInvocationContext)_localctx).kw), ((ExplicitConstructorInvocationContext)_localctx).kw,
				                                   _localctx.args, _localctx.targs);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1490);
				((ExplicitConstructorInvocationContext)_localctx).en = expressionName();
				setState(1491);
				match(DOT);
				setState(1495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1492);
					((ExplicitConstructorInvocationContext)_localctx).t = typeArguments();
					((ExplicitConstructorInvocationContext)_localctx).targs =  ((ExplicitConstructorInvocationContext)_localctx).t.ret;
					}
				}

				setState(1497);
				((ExplicitConstructorInvocationContext)_localctx).kw = match(SUPER);
				setState(1498);
				match(LPAREN);
				setState(1502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(1499);
					((ExplicitConstructorInvocationContext)_localctx).a = argumentList();
					((ExplicitConstructorInvocationContext)_localctx).args =  ((ExplicitConstructorInvocationContext)_localctx).a.ret;
					}
				}

				setState(1504);
				match(RPAREN);
				setState(1505);
				((ExplicitConstructorInvocationContext)_localctx).last = match(SEMI);

				            ((ExplicitConstructorInvocationContext)_localctx).ret =  new CallExpression(((ExplicitConstructorInvocationContext)_localctx).last,
				                                      new AccessExpression(((ExplicitConstructorInvocationContext)_localctx).en.ret,
				                                                           createTypeName(((ExplicitConstructorInvocationContext)_localctx).kw)),
				                                      ((ExplicitConstructorInvocationContext)_localctx).kw,
				                                      _localctx.args,
				                                      _localctx.targs);
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1508);
				((ExplicitConstructorInvocationContext)_localctx).p = primary();
				setState(1509);
				match(DOT);
				setState(1513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1510);
					((ExplicitConstructorInvocationContext)_localctx).t = typeArguments();
					((ExplicitConstructorInvocationContext)_localctx).targs =  ((ExplicitConstructorInvocationContext)_localctx).t.ret;
					}
				}

				setState(1515);
				((ExplicitConstructorInvocationContext)_localctx).kw = match(SUPER);
				setState(1516);
				match(LPAREN);
				setState(1520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(1517);
					((ExplicitConstructorInvocationContext)_localctx).a = argumentList();
					((ExplicitConstructorInvocationContext)_localctx).args =  ((ExplicitConstructorInvocationContext)_localctx).a.ret;
					}
				}

				setState(1522);
				match(RPAREN);
				setState(1523);
				((ExplicitConstructorInvocationContext)_localctx).last = match(SEMI);

				            ((ExplicitConstructorInvocationContext)_localctx).ret =  new CallExpression(((ExplicitConstructorInvocationContext)_localctx).last,
				                                      new AccessExpression(((ExplicitConstructorInvocationContext)_localctx).p.ret,
				                                                           createTypeName(((ExplicitConstructorInvocationContext)_localctx).kw)),
				                                      ((ExplicitConstructorInvocationContext)_localctx).kw,
				                                      _localctx.args,
				                                      _localctx.targs);
				        
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
			setState(1536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				setState(1534);
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
					setState(1528);
					((EnumDeclarationContext)_localctx).m = classModifier();
					_localctx.mods.add(((EnumDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1531);
					((EnumDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((EnumDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1538);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1539);
			((EnumDeclarationContext)_localctx).kw = match(ENUM);
			setState(1540);
			((EnumDeclarationContext)_localctx).id = match(Identifier);
			setState(1544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1541);
				((EnumDeclarationContext)_localctx).il = superinterfaces();
				((EnumDeclarationContext)_localctx).sis =  ((EnumDeclarationContext)_localctx).il.ret;
				}
			}

			((EnumDeclarationContext)_localctx).ret =  new EnumDeclaration(((EnumDeclarationContext)_localctx).id, ((EnumDeclarationContext)_localctx).kw, _localctx.mods, _localctx.ans, _localctx.sis);
			setState(1547);
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
			setState(1549);
			match(LBRACE);
			setState(1551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(1550);
				enumConstantList(_localctx.ret);
				}
			}

			setState(1554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1553);
				match(COMMA);
				}
			}

			setState(1557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1556);
				enumBodyDeclarations(_localctx.ret);
				}
			}

			setState(1559);
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
			setState(1562);
			enumConstant(_localctx.ret);
			setState(1567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1563);
					match(COMMA);
					setState(1564);
					enumConstant(_localctx.ret);
					}
					} 
				}
				setState(1569);
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
		public ConcreteBodyDeclaration body;
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
			setState(1575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1570);
				((EnumConstantContext)_localctx).an = annotation();
				_localctx.ans.add(((EnumConstantContext)_localctx).an.ret);
				}
				}
				setState(1577);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1578);
			((EnumConstantContext)_localctx).id = match(Identifier);
			setState(1586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1579);
				match(LPAREN);
				setState(1583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(1580);
					((EnumConstantContext)_localctx).a = argumentList();
					((EnumConstantContext)_localctx).args =  ((EnumConstantContext)_localctx).a.ret;
					}
				}

				setState(1585);
				match(RPAREN);
				}
			}


			            ((EnumConstantContext)_localctx).cons =  new EnumConstant(((EnumConstantContext)_localctx).id, _localctx.ans, _localctx.args);
			            ((EnumConstantContext)_localctx).body =  _localctx.cons.getBody();
			            _localctx.ret.addConstant(_localctx.cons);
			        
			setState(1590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1589);
				classBody(_localctx.body);
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
			setState(1592);
			match(SEMI);
			setState(1596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				{
				setState(1593);
				classBodyDeclaration(_localctx.ret);
				}
				}
				setState(1598);
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
			setState(1605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1599);
				((InterfaceDeclarationContext)_localctx).n = normalInterfaceDeclaration();
				((InterfaceDeclarationContext)_localctx).ret =  ((InterfaceDeclarationContext)_localctx).n.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1602);
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
			setState(1615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				setState(1613);
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
					setState(1607);
					((NormalInterfaceDeclarationContext)_localctx).m = interfaceModifier();
					_localctx.mods.add(((NormalInterfaceDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1610);
					((NormalInterfaceDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((NormalInterfaceDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1617);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			checkModifiers(_localctx.mods);
			setState(1619);
			((NormalInterfaceDeclarationContext)_localctx).kw = match(INTERFACE);
			setState(1620);
			((NormalInterfaceDeclarationContext)_localctx).id = match(Identifier);
			setState(1624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1621);
				((NormalInterfaceDeclarationContext)_localctx).t = typeParameters();
				((NormalInterfaceDeclarationContext)_localctx).tpars =  ((NormalInterfaceDeclarationContext)_localctx).t.ret;
				}
			}

			setState(1629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1626);
				((NormalInterfaceDeclarationContext)_localctx).e = extendsInterfaces();
				((NormalInterfaceDeclarationContext)_localctx).eis =  ((NormalInterfaceDeclarationContext)_localctx).e.ret;
				}
			}

			((NormalInterfaceDeclarationContext)_localctx).ret =  new InterfaceDeclaration(((NormalInterfaceDeclarationContext)_localctx).id, ((NormalInterfaceDeclarationContext)_localctx).kw, _localctx.mods, _localctx.ans, _localctx.eis, _localctx.tpars);
			setState(1632);
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
			setState(1646);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1634);
				((InterfaceModifierContext)_localctx).pu = match(PUBLIC);
				((InterfaceModifierContext)_localctx).ret =  new Modifier(((InterfaceModifierContext)_localctx).pu);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1636);
				((InterfaceModifierContext)_localctx).pro = match(PROTECTED);
				((InterfaceModifierContext)_localctx).ret =  new Modifier(((InterfaceModifierContext)_localctx).pro);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1638);
				((InterfaceModifierContext)_localctx).pri = match(PRIVATE);
				((InterfaceModifierContext)_localctx).ret =  new Modifier(((InterfaceModifierContext)_localctx).pri);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1640);
				((InterfaceModifierContext)_localctx).ab = match(ABSTRACT);
				((InterfaceModifierContext)_localctx).ret =  new Modifier(((InterfaceModifierContext)_localctx).ab);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1642);
				((InterfaceModifierContext)_localctx).st = match(STATIC);
				((InterfaceModifierContext)_localctx).ret =  new Modifier(((InterfaceModifierContext)_localctx).st);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(1644);
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
			setState(1648);
			match(EXTENDS);
			setState(1649);
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
			setState(1652);
			match(LBRACE);
			setState(1656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (LT - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				{
				setState(1653);
				interfaceMemberDeclaration(_localctx.ret);
				}
				}
				setState(1658);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1659);
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
			setState(1673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1662);
				constantDeclaration(_localctx.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1663);
				((InterfaceMemberDeclarationContext)_localctx).im = interfaceMethodDeclaration();
				_localctx.ret.addMethod(((InterfaceMemberDeclarationContext)_localctx).im.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1666);
				((InterfaceMemberDeclarationContext)_localctx).cl = classDeclaration();
				_localctx.ret.addInnerBody(((InterfaceMemberDeclarationContext)_localctx).cl.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1669);
				((InterfaceMemberDeclarationContext)_localctx).id = interfaceDeclaration();
				_localctx.ret.addInnerBody(((InterfaceMemberDeclarationContext)_localctx).id.ret);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1672);
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
			setState(1683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << STATIC))) != 0) || _la==AT) {
				{
				setState(1681);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FINAL:
				case PUBLIC:
				case STATIC:
					{
					{
					setState(1675);
					((ConstantDeclarationContext)_localctx).m = constantModifier();
					_localctx.mods.add(((ConstantDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1678);
					((ConstantDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((ConstantDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1685);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			checkModifiers(_localctx.mods);
			setState(1687);
			((ConstantDeclarationContext)_localctx).t = unannType();
			setState(1688);
			variableDeclaratorList(_localctx.decl, _localctx.mods, _localctx.ans, ((ConstantDeclarationContext)_localctx).t.ret);
			setState(1689);
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
			setState(1697);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1691);
				((ConstantModifierContext)_localctx).pu = match(PUBLIC);
				((ConstantModifierContext)_localctx).ret =  new Modifier(((ConstantModifierContext)_localctx).pu);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1693);
				((ConstantModifierContext)_localctx).st = match(STATIC);
				((ConstantModifierContext)_localctx).ret =  new Modifier(((ConstantModifierContext)_localctx).st);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1695);
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
			setState(1707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				setState(1705);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ABSTRACT:
				case DEFAULT:
				case PUBLIC:
				case STATIC:
				case STRICTFP:
					{
					{
					setState(1699);
					((InterfaceMethodDeclarationContext)_localctx).m = interfaceMethodModifier();
					_localctx.mods.add(((InterfaceMethodDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1702);
					((InterfaceMethodDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((InterfaceMethodDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1709);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			checkModifiers(_localctx.mods);
			((InterfaceMethodDeclarationContext)_localctx).ret =  new MethodDeclaration(_localctx.mods, _localctx.ans);
			{
			setState(1712);
			methodHeader(_localctx.ret);
			}
			{
			setState(1713);
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
			setState(1726);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1716);
				((InterfaceMethodModifierContext)_localctx).pu = match(PUBLIC);
				((InterfaceMethodModifierContext)_localctx).ret =  new Modifier(((InterfaceMethodModifierContext)_localctx).pu);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1718);
				((InterfaceMethodModifierContext)_localctx).ab = match(ABSTRACT);
				((InterfaceMethodModifierContext)_localctx).ret =  new Modifier(((InterfaceMethodModifierContext)_localctx).ab);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1720);
				((InterfaceMethodModifierContext)_localctx).d = match(DEFAULT);
				((InterfaceMethodModifierContext)_localctx).ret =  new Modifier(((InterfaceMethodModifierContext)_localctx).d);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 4);
				{
				setState(1722);
				((InterfaceMethodModifierContext)_localctx).st = match(STATIC);
				((InterfaceMethodModifierContext)_localctx).ret =  new Modifier(((InterfaceMethodModifierContext)_localctx).st);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 5);
				{
				setState(1724);
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
			setState(1736);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1734);
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
						setState(1728);
						((AnnotationTypeDeclarationContext)_localctx).m = interfaceModifier();
						_localctx.mods.add(((AnnotationTypeDeclarationContext)_localctx).m.ret);
						}
						}
						break;
					case AT:
						{
						{
						setState(1731);
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
				setState(1738);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			setState(1739);
			((AnnotationTypeDeclarationContext)_localctx).at = match(AT);
			setState(1740);
			match(INTERFACE);
			setState(1741);
			((AnnotationTypeDeclarationContext)_localctx).id = match(Identifier);
			((AnnotationTypeDeclarationContext)_localctx).ret =  new AnnotationDeclaration(((AnnotationTypeDeclarationContext)_localctx).id, ((AnnotationTypeDeclarationContext)_localctx).at, _localctx.mods, _localctx.ans);
			setState(1743);
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
			setState(1745);
			match(LBRACE);
			setState(1749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				{
				setState(1746);
				annotationTypeMemberDeclaration(_localctx.ret);
				}
				}
				setState(1751);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1752);
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
			setState(1766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1755);
				((AnnotationTypeMemberDeclarationContext)_localctx).a = annotationTypeElementDeclaration();
				_localctx.ret.addMethod(((AnnotationTypeMemberDeclarationContext)_localctx).a.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1758);
				constantDeclaration(_localctx.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1759);
				((AnnotationTypeMemberDeclarationContext)_localctx).cl = classDeclaration();
				_localctx.ret.addInnerBody(((AnnotationTypeMemberDeclarationContext)_localctx).cl.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1762);
				((AnnotationTypeMemberDeclarationContext)_localctx).i = interfaceDeclaration();
				_localctx.ret.addInnerBody(((AnnotationTypeMemberDeclarationContext)_localctx).i.ret);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1765);
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
		public MethodDeclaration ret;
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
			setState(1776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT || _la==PUBLIC || _la==AT) {
				{
				setState(1774);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ABSTRACT:
				case PUBLIC:
					{
					{
					setState(1768);
					((AnnotationTypeElementDeclarationContext)_localctx).m = annotationTypeElementModifier();
					_localctx.mods.add(((AnnotationTypeElementDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1771);
					((AnnotationTypeElementDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((AnnotationTypeElementDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1778);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			checkModifiers(_localctx.mods);
			setState(1780);
			((AnnotationTypeElementDeclarationContext)_localctx).t = unannType();
			setState(1781);
			((AnnotationTypeElementDeclarationContext)_localctx).id = match(Identifier);
			setState(1782);
			match(LPAREN);
			setState(1783);
			match(RPAREN);
			setState(1787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1784);
				((AnnotationTypeElementDeclarationContext)_localctx).ds = dims();
				((AnnotationTypeElementDeclarationContext)_localctx).ls =  ((AnnotationTypeElementDeclarationContext)_localctx).ds.ret;
				}
			}

			setState(1792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1789);
				((AnnotationTypeElementDeclarationContext)_localctx).dv = defaultValue();

				                ((AnnotationTypeElementDeclarationContext)_localctx).expr =  ((AnnotationTypeElementDeclarationContext)_localctx).dv.ret;
				                _localctx.mods.add(Modifier.DEFAULT);
				            
				}
			}

			setState(1794);
			match(SEMI);

			            ((AnnotationTypeElementDeclarationContext)_localctx).type =  ((AnnotationTypeElementDeclarationContext)_localctx).t.ret;
			            if (_localctx.ls.size() > 0) {
			                ((AnnotationTypeElementDeclarationContext)_localctx).type =  new ArrayTypeExpression(_localctx.type, _localctx.ls);
			            }
			            ((AnnotationTypeElementDeclarationContext)_localctx).ret =  new MethodDeclaration(_localctx.mods, _localctx.ans);
			            _localctx.ret.setName(((AnnotationTypeElementDeclarationContext)_localctx).id);
			            _localctx.ret.setReturnType(_localctx.type);
			            _localctx.ret.setBody(new Block(_localctx.expr));
			        
			}
		}
		catch (RecognitionException re) {
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
			setState(1801);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1797);
				((AnnotationTypeElementModifierContext)_localctx).pu = match(PUBLIC);
				((AnnotationTypeElementModifierContext)_localctx).ret =  new Modifier(((AnnotationTypeElementModifierContext)_localctx).pu);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1799);
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
			setState(1803);
			match(DEFAULT);
			setState(1804);
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
			setState(1816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1807);
				((AnnotationContext)_localctx).n = normalAnnotation();
				((AnnotationContext)_localctx).ret =  ((AnnotationContext)_localctx).n.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1810);
				((AnnotationContext)_localctx).m = markerAnnotation();
				((AnnotationContext)_localctx).ret =  ((AnnotationContext)_localctx).m.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1813);
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
			setState(1818);
			((NormalAnnotationContext)_localctx).at = match(AT);
			setState(1819);
			((NormalAnnotationContext)_localctx).t = typeName();
			((NormalAnnotationContext)_localctx).ret =  new Annotation(((NormalAnnotationContext)_localctx).at, ((NormalAnnotationContext)_localctx).t.ret);
			setState(1821);
			match(LPAREN);
			setState(1823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1822);
				elementValuePairList(_localctx.ret);
				}
			}

			setState(1825);
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
			setState(1828);
			elementValuePair(_localctx.ret);
			}
			setState(1833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1829);
				match(COMMA);
				setState(1830);
				elementValuePair(_localctx.ret);
				}
				}
				setState(1835);
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
			setState(1836);
			((ElementValuePairContext)_localctx).id = match(Identifier);
			setState(1837);
			match(ASSIGN);
			setState(1838);
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
			setState(1850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1841);
				((ElementValueContext)_localctx).c = conditionalExpression();
				((ElementValueContext)_localctx).ret =  ((ElementValueContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1844);
				((ElementValueContext)_localctx).i = elementValueArrayInitializer();
				((ElementValueContext)_localctx).ret =  ((ElementValueContext)_localctx).i.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1847);
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
			setState(1852);
			((ElementValueArrayInitializerContext)_localctx).first = match(LBRACE);
			setState(1856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
				{
				setState(1853);
				((ElementValueArrayInitializerContext)_localctx).l = elementValueList();
				((ElementValueArrayInitializerContext)_localctx).ls =  ((ElementValueArrayInitializerContext)_localctx).l.ret;
				}
			}

			setState(1859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1858);
				match(COMMA);
				}
			}

			setState(1861);
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
			setState(1864);
			((ElementValueListContext)_localctx).v1 = elementValue();
			_localctx.ls.add(((ElementValueListContext)_localctx).v1.ret);
			}
			setState(1873);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1867);
					match(COMMA);
					setState(1868);
					((ElementValueListContext)_localctx).v = elementValue();
					_localctx.ls.add(((ElementValueListContext)_localctx).v.ret);
					}
					} 
				}
				setState(1875);
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
			setState(1878);
			((MarkerAnnotationContext)_localctx).at = match(AT);
			setState(1879);
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
			setState(1882);
			((SingleElementAnnotationContext)_localctx).at = match(AT);
			setState(1883);
			((SingleElementAnnotationContext)_localctx).t = typeName();
			setState(1884);
			match(LPAREN);
			setState(1885);
			((SingleElementAnnotationContext)_localctx).v = elementValue();
			setState(1886);
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
			setState(1911);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1889);
				((ArrayInitializerContext)_localctx).first = match(LBRACE);
				setState(1893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LBRACK - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(1890);
					((ArrayInitializerContext)_localctx).l = variableInitializerList();
					((ArrayInitializerContext)_localctx).ls =  ((ArrayInitializerContext)_localctx).l.ret;
					}
				}

				setState(1896);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1895);
					match(COMMA);
					}
				}

				setState(1898);
				((ArrayInitializerContext)_localctx).last = match(RBRACE);
				((ArrayInitializerContext)_localctx).ret =  new ArrayInitializer(((ArrayInitializerContext)_localctx).first, ((ArrayInitializerContext)_localctx).last, _localctx.ls);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(1900);
				((ArrayInitializerContext)_localctx).first = match(LBRACK);
				setState(1904);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LBRACK - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
					{
					setState(1901);
					((ArrayInitializerContext)_localctx).l = variableInitializerList();
					((ArrayInitializerContext)_localctx).ls =  ((ArrayInitializerContext)_localctx).l.ret;
					}
				}

				setState(1907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1906);
					match(COMMA);
					}
				}

				setState(1909);
				((ArrayInitializerContext)_localctx).last = match(RBRACK);

				            ((ArrayInitializerContext)_localctx).ret =  new ArrayInitializer(((ArrayInitializerContext)_localctx).first, ((ArrayInitializerContext)_localctx).last, _localctx.ls);
				            notifyErrorListeners(((ArrayInitializerContext)_localctx).first,
				                                 "Array initialization uses curly braces instead of brackets",
				                                 createMyException("Replace the curly braces with square brackets"));
				        
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
			setState(1913);
			((VariableInitializerListContext)_localctx).i = variableInitializer();
			_localctx.ls.add(((VariableInitializerListContext)_localctx).i.ret);
			}
			setState(1922);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1916);
					match(COMMA);
					setState(1917);
					((VariableInitializerListContext)_localctx).v = variableInitializer();
					_localctx.ls.add(((VariableInitializerListContext)_localctx).v.ret);
					}
					} 
				}
				setState(1924);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
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
			setState(1928);
			((BlockContext)_localctx).first = match(LBRACE);
			setState(1932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				setState(1929);
				((BlockContext)_localctx).s = blockStatements();
				_localctx.ret.addStatements(((BlockContext)_localctx).s.ret);
				}
			}

			setState(1934);
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
			setState(1937);
			((BlockStatementsContext)_localctx).s = blockStatement();
			_localctx.ls.add(((BlockStatementsContext)_localctx).s.ret);
			}
			setState(1945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (SEMI - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (Identifier - 66)) | (1L << (AT - 66)))) != 0)) {
				{
				{
				setState(1940);
				((BlockStatementsContext)_localctx).b = blockStatement();
				_localctx.ls.add(((BlockStatementsContext)_localctx).b.ret);
				}
				}
				setState(1947);
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
			setState(1959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1950);
				((BlockStatementContext)_localctx).d = localVariableDeclarationStatement();
				((BlockStatementContext)_localctx).ret =  ((BlockStatementContext)_localctx).d.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1953);
				((BlockStatementContext)_localctx).c = classDeclaration();
				((BlockStatementContext)_localctx).ret =  new LocalClassDeclaration(((BlockStatementContext)_localctx).c.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1956);
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
			setState(1961);
			((LocalVariableDeclarationStatementContext)_localctx).d = localVariableDeclaration();
			setState(1962);
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
			setState(1973);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				setState(1971);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FINAL:
					{
					{
					setState(1965);
					((LocalVariableDeclarationContext)_localctx).m = variableModifier();
					_localctx.mods.add(((LocalVariableDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1968);
					((LocalVariableDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((LocalVariableDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1975);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1976);
			((LocalVariableDeclarationContext)_localctx).t = unannType();
			setState(1977);
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
			setState(1998);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1980);
				((StatementContext)_localctx).a = statementWithoutTrailingSubstatement();
				((StatementContext)_localctx).ret =  ((StatementContext)_localctx).a.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1983);
				((StatementContext)_localctx).b = labeledStatement();
				((StatementContext)_localctx).ret =  ((StatementContext)_localctx).b.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1986);
				((StatementContext)_localctx).c = ifThenStatement();
				((StatementContext)_localctx).ret =  ((StatementContext)_localctx).c.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1989);
				((StatementContext)_localctx).d = ifThenElseStatement();
				((StatementContext)_localctx).ret =  ((StatementContext)_localctx).d.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1992);
				((StatementContext)_localctx).e = whileStatement();
				((StatementContext)_localctx).ret =  ((StatementContext)_localctx).e.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1995);
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
			setState(2015);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2000);
				((StatementNoShortIfContext)_localctx).a = statementWithoutTrailingSubstatement();
				((StatementNoShortIfContext)_localctx).ret =  ((StatementNoShortIfContext)_localctx).a.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2003);
				((StatementNoShortIfContext)_localctx).b = labeledStatementNoShortIf();
				((StatementNoShortIfContext)_localctx).ret =  ((StatementNoShortIfContext)_localctx).b.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2006);
				((StatementNoShortIfContext)_localctx).c = ifThenElseStatementNoShortIf();
				((StatementNoShortIfContext)_localctx).ret =  ((StatementNoShortIfContext)_localctx).c.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2009);
				((StatementNoShortIfContext)_localctx).d = whileStatementNoShortIf();
				((StatementNoShortIfContext)_localctx).ret =  ((StatementNoShortIfContext)_localctx).d.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2012);
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
			setState(2053);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2017);
				((StatementWithoutTrailingSubstatementContext)_localctx).a = block();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).a.ret;
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(2020);
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
			case BadBooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case BadStringLiteral:
			case NullLiteral:
			case BadNullLiteral:
			case LPAREN:
			case INC:
			case DEC:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2023);
				((StatementWithoutTrailingSubstatementContext)_localctx).c = expressionStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).c.ret;
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(2026);
				((StatementWithoutTrailingSubstatementContext)_localctx).d = assertStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).d.ret;
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(2029);
				((StatementWithoutTrailingSubstatementContext)_localctx).e = switchStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).e.ret;
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(2032);
				((StatementWithoutTrailingSubstatementContext)_localctx).f = doStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).f.ret;
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(2035);
				((StatementWithoutTrailingSubstatementContext)_localctx).g = breakStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).g.ret;
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2038);
				((StatementWithoutTrailingSubstatementContext)_localctx).h = continueStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).h.ret;
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(2041);
				((StatementWithoutTrailingSubstatementContext)_localctx).i = returnStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).i.ret;
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
				setState(2044);
				((StatementWithoutTrailingSubstatementContext)_localctx).j = synchronizedStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).j.ret;
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 11);
				{
				setState(2047);
				((StatementWithoutTrailingSubstatementContext)_localctx).k = throwStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).k.ret;
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 12);
				{
				setState(2050);
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
			setState(2055);
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
			setState(2058);
			((LabeledStatementContext)_localctx).id = match(Identifier);
			setState(2059);
			match(COLON);
			setState(2060);
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
			setState(2063);
			((LabeledStatementNoShortIfContext)_localctx).id = match(Identifier);
			setState(2064);
			match(COLON);
			setState(2065);
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
			setState(2068);
			((ExpressionStatementContext)_localctx).s = statementExpression();
			setState(2069);
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
			setState(2093);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2072);
				((StatementExpressionContext)_localctx).a = assignment();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).a.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2075);
				((StatementExpressionContext)_localctx).b = preIncrementExpression();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).b.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2078);
				((StatementExpressionContext)_localctx).c = preDecrementExpression();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).c.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2081);
				((StatementExpressionContext)_localctx).d = postIncrementExpression();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).d.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2084);
				((StatementExpressionContext)_localctx).f = postDecrementExpression();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).f.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2087);
				((StatementExpressionContext)_localctx).g = methodInvocation();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).g.ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2090);
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
			setState(2095);
			((IfThenStatementContext)_localctx).kw = match(IF);
			setState(2096);
			match(LPAREN);
			setState(2097);
			((IfThenStatementContext)_localctx).e = expression();
			setState(2098);
			match(RPAREN);
			setState(2099);
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
			setState(2102);
			((IfThenElseStatementContext)_localctx).kw = match(IF);
			setState(2103);
			match(LPAREN);
			setState(2104);
			((IfThenElseStatementContext)_localctx).e = expression();
			setState(2105);
			match(RPAREN);
			setState(2106);
			((IfThenElseStatementContext)_localctx).t = statementNoShortIf();
			setState(2107);
			match(ELSE);
			setState(2108);
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
			setState(2111);
			((IfThenElseStatementNoShortIfContext)_localctx).kw = match(IF);
			setState(2112);
			match(LPAREN);
			setState(2113);
			((IfThenElseStatementNoShortIfContext)_localctx).e = expression();
			setState(2114);
			match(RPAREN);
			setState(2115);
			((IfThenElseStatementNoShortIfContext)_localctx).t = statementNoShortIf();
			setState(2116);
			match(ELSE);
			setState(2117);
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
			setState(2132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2120);
				((AssertStatementContext)_localctx).kw = match(ASSERT);
				setState(2121);
				((AssertStatementContext)_localctx).e = expression();
				setState(2122);
				((AssertStatementContext)_localctx).last = match(SEMI);
				((AssertStatementContext)_localctx).ret =  new AssertStatement(((AssertStatementContext)_localctx).kw, ((AssertStatementContext)_localctx).last, ((AssertStatementContext)_localctx).e.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2125);
				((AssertStatementContext)_localctx).kw = match(ASSERT);
				setState(2126);
				((AssertStatementContext)_localctx).e = expression();
				setState(2127);
				match(COLON);
				setState(2128);
				((AssertStatementContext)_localctx).msg = expression();
				setState(2129);
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
			setState(2134);
			((SwitchStatementContext)_localctx).kw = match(SWITCH);
			setState(2135);
			match(LPAREN);
			setState(2136);
			((SwitchStatementContext)_localctx).e = expression();
			setState(2137);
			match(RPAREN);
			setState(2138);
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
			setState(2141);
			match(LBRACE);
			setState(2147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2142);
					((SwitchBlockContext)_localctx).m = switchBlockStatementGroup();
					_localctx.blocks.add(((SwitchBlockContext)_localctx).m.ret);
					}
					} 
				}
				setState(2149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			}
			setState(2155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(2150);
				((SwitchBlockContext)_localctx).l = switchLabel();
				_localctx.blocks.add(new CaseBlock(((SwitchBlockContext)_localctx).l.ret));
				}
				}
				setState(2157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2158);
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
			setState(2162);
			((SwitchBlockStatementGroupContext)_localctx).l = switchLabels();
			setState(2163);
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
			setState(2166);
			((SwitchLabelsContext)_localctx).s = switchLabel();
			_localctx.lbls.add(((SwitchLabelsContext)_localctx).s.ret);
			}
			setState(2174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(2169);
				((SwitchLabelsContext)_localctx).l = switchLabel();
				_localctx.lbls.add(((SwitchLabelsContext)_localctx).l.ret);
				}
				}
				setState(2176);
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
			setState(2191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2179);
				match(CASE);
				setState(2180);
				((SwitchLabelContext)_localctx).c = constantExpression();
				setState(2181);
				match(COLON);
				((SwitchLabelContext)_localctx).ret =  ((SwitchLabelContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2184);
				match(CASE);
				setState(2185);
				((SwitchLabelContext)_localctx).id = match(Identifier);
				setState(2186);
				match(COLON);
				((SwitchLabelContext)_localctx).ret =  createExpressionName(((SwitchLabelContext)_localctx).id);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2188);
				((SwitchLabelContext)_localctx).kw = match(DEFAULT);
				setState(2189);
				match(COLON);
				((SwitchLabelContext)_localctx).ret =  new NilExpression();
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
			setState(2193);
			((WhileStatementContext)_localctx).kw = match(WHILE);
			setState(2194);
			match(LPAREN);
			setState(2195);
			((WhileStatementContext)_localctx).c = expression();
			setState(2196);
			match(RPAREN);
			setState(2197);
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
			setState(2200);
			((WhileStatementNoShortIfContext)_localctx).kw = match(WHILE);
			setState(2201);
			match(LPAREN);
			setState(2202);
			((WhileStatementNoShortIfContext)_localctx).c = expression();
			setState(2203);
			match(RPAREN);
			setState(2204);
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
			setState(2207);
			((DoStatementContext)_localctx).kw = match(DO);
			setState(2208);
			((DoStatementContext)_localctx).s = statement();
			setState(2209);
			match(WHILE);
			setState(2210);
			match(LPAREN);
			setState(2211);
			((DoStatementContext)_localctx).c = expression();
			setState(2212);
			match(RPAREN);
			setState(2213);
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
			setState(2222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2216);
				((ForStatementContext)_localctx).b = basicForStatement();
				((ForStatementContext)_localctx).ret =  ((ForStatementContext)_localctx).b.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2219);
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
			setState(2230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2224);
				((ForStatementNoShortIfContext)_localctx).b = basicForStatementNoShortIf();
				((ForStatementNoShortIfContext)_localctx).ret =  ((ForStatementNoShortIfContext)_localctx).b.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2227);
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
			setState(2232);
			((BasicForStatementContext)_localctx).kw = match(FOR);
			setState(2233);
			match(LPAREN);
			setState(2237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (INC - 82)) | (1L << (DEC - 82)) | (1L << (Identifier - 82)) | (1L << (AT - 82)))) != 0)) {
				{
				setState(2234);
				((BasicForStatementContext)_localctx).i = forInit();
				((BasicForStatementContext)_localctx).forIn =  ((BasicForStatementContext)_localctx).i.ret;
				}
			}

			setState(2239);
			match(SEMI);
			setState(2243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
				{
				setState(2240);
				((BasicForStatementContext)_localctx).e = expression();
				((BasicForStatementContext)_localctx).expr =  ((BasicForStatementContext)_localctx).e.ret;
				}
			}

			setState(2245);
			match(SEMI);
			setState(2249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (INC - 82)) | (1L << (DEC - 82)) | (1L << (Identifier - 82)) | (1L << (AT - 82)))) != 0)) {
				{
				setState(2246);
				((BasicForStatementContext)_localctx).u = forUpdate();
				((BasicForStatementContext)_localctx).forUp =  ((BasicForStatementContext)_localctx).u.ret;
				}
			}

			setState(2251);
			match(RPAREN);
			setState(2252);
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
			setState(2255);
			((BasicForStatementNoShortIfContext)_localctx).kw = match(FOR);
			setState(2256);
			match(LPAREN);
			setState(2260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (INC - 82)) | (1L << (DEC - 82)) | (1L << (Identifier - 82)) | (1L << (AT - 82)))) != 0)) {
				{
				setState(2257);
				((BasicForStatementNoShortIfContext)_localctx).i = forInit();
				((BasicForStatementNoShortIfContext)_localctx).forIn =  ((BasicForStatementNoShortIfContext)_localctx).i.ret;
				}
			}

			setState(2262);
			match(SEMI);
			setState(2266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
				{
				setState(2263);
				((BasicForStatementNoShortIfContext)_localctx).e = expression();
				((BasicForStatementNoShortIfContext)_localctx).expr =  ((BasicForStatementNoShortIfContext)_localctx).e.ret;
				}
			}

			setState(2268);
			match(SEMI);
			setState(2272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (INC - 82)) | (1L << (DEC - 82)) | (1L << (Identifier - 82)) | (1L << (AT - 82)))) != 0)) {
				{
				setState(2269);
				((BasicForStatementNoShortIfContext)_localctx).u = forUpdate();
				((BasicForStatementNoShortIfContext)_localctx).forUp =  ((BasicForStatementNoShortIfContext)_localctx).u.ret;
				}
			}

			setState(2274);
			match(RPAREN);
			setState(2275);
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
			setState(2284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2278);
				((ForInitContext)_localctx).ls = statementExpressionList();
				((ForInitContext)_localctx).ret =  ((ForInitContext)_localctx).ls.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2281);
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
			setState(2286);
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
			setState(2289);
			((StatementExpressionListContext)_localctx).s = statementExpression();
			_localctx.ups.add(((StatementExpressionListContext)_localctx).s.ret);
			}
			setState(2298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2292);
				match(COMMA);
				setState(2293);
				((StatementExpressionListContext)_localctx).e = statementExpression();
				_localctx.ups.add(((StatementExpressionListContext)_localctx).e.ret);
				}
				}
				setState(2300);
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
			setState(2303);
			((EnhancedForStatementContext)_localctx).kw = match(FOR);
			setState(2304);
			match(LPAREN);
			setState(2313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				setState(2311);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FINAL:
					{
					{
					setState(2305);
					((EnhancedForStatementContext)_localctx).m = variableModifier();
					_localctx.mods.add(((EnhancedForStatementContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(2308);
					((EnhancedForStatementContext)_localctx).a = annotation();
					_localctx.ans.add(((EnhancedForStatementContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2316);
			((EnhancedForStatementContext)_localctx).v = typedVariableDeclaratorId(_localctx.mods, _localctx.ans);
			setState(2317);
			match(COLON);
			setState(2318);
			((EnhancedForStatementContext)_localctx).e = expression();
			setState(2319);
			match(RPAREN);
			setState(2320);
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
			setState(2323);
			((EnhancedForStatementNoShortIfContext)_localctx).kw = match(FOR);
			setState(2324);
			match(LPAREN);
			setState(2333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				setState(2331);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FINAL:
					{
					{
					setState(2325);
					((EnhancedForStatementNoShortIfContext)_localctx).m = variableModifier();
					_localctx.mods.add(((EnhancedForStatementNoShortIfContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(2328);
					((EnhancedForStatementNoShortIfContext)_localctx).a = annotation();
					_localctx.ans.add(((EnhancedForStatementNoShortIfContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2336);
			((EnhancedForStatementNoShortIfContext)_localctx).v = typedVariableDeclaratorId(_localctx.mods, _localctx.ans);
			setState(2337);
			match(COLON);
			setState(2338);
			((EnhancedForStatementNoShortIfContext)_localctx).e = expression();
			setState(2339);
			match(RPAREN);
			setState(2340);
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
			setState(2343);
			((BreakStatementContext)_localctx).kw = match(BREAK);
			setState(2346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(2344);
				((BreakStatementContext)_localctx).id = match(Identifier);
				((BreakStatementContext)_localctx).name =  ((BreakStatementContext)_localctx).id;
				}
			}

			setState(2348);
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
			setState(2351);
			((ContinueStatementContext)_localctx).kw = match(CONTINUE);
			setState(2354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(2352);
				((ContinueStatementContext)_localctx).id = match(Identifier);
				((ContinueStatementContext)_localctx).name =  ((ContinueStatementContext)_localctx).id;
				}
			}

			setState(2356);
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
			setState(2367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2359);
				((ReturnStatementContext)_localctx).kw = match(RETURN);
				setState(2360);
				((ReturnStatementContext)_localctx).last = match(SEMI);
				((ReturnStatementContext)_localctx).ret =  new ReturnStatement(((ReturnStatementContext)_localctx).kw, ((ReturnStatementContext)_localctx).last);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2362);
				((ReturnStatementContext)_localctx).kw = match(RETURN);
				setState(2363);
				((ReturnStatementContext)_localctx).e = expression();
				setState(2364);
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
			setState(2369);
			((ThrowStatementContext)_localctx).kw = match(THROW);
			setState(2370);
			((ThrowStatementContext)_localctx).e = expression();
			setState(2371);
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
			setState(2374);
			((SynchronizedStatementContext)_localctx).kw = match(SYNCHRONIZED);
			setState(2375);
			match(LPAREN);
			setState(2376);
			((SynchronizedStatementContext)_localctx).e = expression();
			setState(2377);
			match(RPAREN);
			setState(2378);
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
			setState(2399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2381);
				((TryStatementContext)_localctx).kw = match(TRY);
				setState(2382);
				((TryStatementContext)_localctx).t = block();
				setState(2383);
				((TryStatementContext)_localctx).cs = catches();
				((TryStatementContext)_localctx).ret =  new TryCatchBlock(((TryStatementContext)_localctx).kw, ((TryStatementContext)_localctx).t.ret, ((TryStatementContext)_localctx).cs.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2386);
				((TryStatementContext)_localctx).kw = match(TRY);
				setState(2387);
				((TryStatementContext)_localctx).t = block();
				setState(2391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(2388);
					((TryStatementContext)_localctx).cs = catches();
					((TryStatementContext)_localctx).ls =  ((TryStatementContext)_localctx).cs.ret;
					}
				}

				setState(2393);
				((TryStatementContext)_localctx).f = finally_();
				((TryStatementContext)_localctx).ret =  new TryCatchBlock(((TryStatementContext)_localctx).kw, ((TryStatementContext)_localctx).t.ret, _localctx.ls, ((TryStatementContext)_localctx).f.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2396);
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
			setState(2401);
			((CatchesContext)_localctx).f = catchClause();
			_localctx.ls.add(((CatchesContext)_localctx).f.ret);
			setState(2408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(2403);
				((CatchesContext)_localctx).c = catchClause();
				_localctx.ls.add(((CatchesContext)_localctx).c.ret);
				}
				}
				setState(2410);
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
			setState(2413);
			((CatchClauseContext)_localctx).kw = match(CATCH);
			((CatchClauseContext)_localctx).ret =  new CatchBlock(((CatchClauseContext)_localctx).kw);
			setState(2415);
			match(LPAREN);
			setState(2416);
			catchFormalParameter(_localctx.ret);
			setState(2417);
			match(RPAREN);
			setState(2418);
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
			setState(2429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				setState(2427);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FINAL:
					{
					{
					setState(2421);
					((CatchFormalParameterContext)_localctx).m = variableModifier();
					_localctx.mods.add(((CatchFormalParameterContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(2424);
					((CatchFormalParameterContext)_localctx).a = annotation();
					_localctx.ans.add(((CatchFormalParameterContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2431);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2432);
			catchType(_localctx.ret);
			setState(2433);
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
			setState(2436);
			((CatchTypeContext)_localctx).u = unannClassType();
			_localctx.ret.addExceptionType(((CatchTypeContext)_localctx).u.ret);
			}
			setState(2445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(2439);
				match(BITOR);
				setState(2440);
				((CatchTypeContext)_localctx).c = classType();
				_localctx.ret.addExceptionType(((CatchTypeContext)_localctx).c.ret);
				}
				}
				setState(2447);
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
			setState(2448);
			match(FINALLY);
			setState(2449);
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
			setState(2452);
			((TryWithResourcesStatementContext)_localctx).kw = match(TRY);
			setState(2453);
			((TryWithResourcesStatementContext)_localctx).r = resourceSpecification();
			setState(2454);
			((TryWithResourcesStatementContext)_localctx).b = block();
			setState(2458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(2455);
				((TryWithResourcesStatementContext)_localctx).c = catches();
				((TryWithResourcesStatementContext)_localctx).ls =  ((TryWithResourcesStatementContext)_localctx).c.ret;
				}
			}

			setState(2463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(2460);
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
			setState(2468);
			match(LPAREN);
			setState(2475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(2469);
				((ResourceSpecificationContext)_localctx).l = resourceList();
				{
				setState(2471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(2470);
					match(SEMI);
					}
				}

				}
				((ResourceSpecificationContext)_localctx).ret =  ((ResourceSpecificationContext)_localctx).l.ret;
				}
			}

			setState(2477);
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
			setState(2479);
			((ResourceListContext)_localctx).r = resource();
			_localctx.vars.add(((ResourceListContext)_localctx).r.ret);
			setState(2487);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2481);
					match(SEMI);
					setState(2482);
					((ResourceListContext)_localctx).re = resource();
					_localctx.vars.add(((ResourceListContext)_localctx).re.ret);
					}
					} 
				}
				setState(2489);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
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
			setState(2500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				setState(2498);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FINAL:
					{
					{
					setState(2492);
					((ResourceContext)_localctx).m = variableModifier();
					_localctx.mods.add(((ResourceContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(2495);
					((ResourceContext)_localctx).a = annotation();
					_localctx.ans.add(((ResourceContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2502);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2503);
			((ResourceContext)_localctx).v = typedVariableDeclaratorId(_localctx.mods, _localctx.ans);
			setState(2504);
			match(ASSIGN);
			setState(2505);
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
			setState(2514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(2508);
				((PrimaryContext)_localctx).pno = primaryNoNewArray_lfno_primary();
				((PrimaryContext)_localctx).ret =  ((PrimaryContext)_localctx).pno.ret;
				}
				break;
			case 2:
				{
				setState(2511);
				((PrimaryContext)_localctx).a = arrayCreationExpression();
				((PrimaryContext)_localctx).ret =  ((PrimaryContext)_localctx).a.ret;
				}
				break;
			}
			setState(2521);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2516);
					((PrimaryContext)_localctx).p = primaryNoNewArray_lf_primary();

					                ((PrimaryContext)_localctx).p.ret.qualifyWith(_localctx.ret);
					                ((PrimaryContext)_localctx).ret =  ((PrimaryContext)_localctx).p.ret;
					            
					}
					} 
				}
				setState(2523);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
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
			setState(2552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2524);
				((PrimaryNoNewArrayContext)_localctx).a1 = literal();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a1.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2527);
				((PrimaryNoNewArrayContext)_localctx).a2 = primaryNoNewArray_typeAccess();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a2.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2530);
				((PrimaryNoNewArrayContext)_localctx).kw = match(THIS);
				((PrimaryNoNewArrayContext)_localctx).ret =  createTypeName(((PrimaryNoNewArrayContext)_localctx).kw);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2532);
				((PrimaryNoNewArrayContext)_localctx).first = match(LPAREN);
				setState(2533);
				((PrimaryNoNewArrayContext)_localctx).p = expression();
				setState(2534);
				((PrimaryNoNewArrayContext)_localctx).last = match(RPAREN);
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).p.ret; _localctx.ret.setFirstToken(((PrimaryNoNewArrayContext)_localctx).first); _localctx.ret.setLastToken(((PrimaryNoNewArrayContext)_localctx).last);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2537);
				((PrimaryNoNewArrayContext)_localctx).a7 = classInstanceCreationExpression();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a7.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2540);
				((PrimaryNoNewArrayContext)_localctx).a8 = fieldAccess();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a8.ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2543);
				((PrimaryNoNewArrayContext)_localctx).a9 = arrayAccess();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a9.ret;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2546);
				((PrimaryNoNewArrayContext)_localctx).a10 = methodInvocation();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a10.ret;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2549);
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
		public TypeNameContext t;
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
			setState(2590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2554);
				((PrimaryNoNewArray_typeAccessContext)_localctx).id = match(Identifier);
				setState(2560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2555);
					((PrimaryNoNewArray_typeAccessContext)_localctx).first = match(LBRACK);
					setState(2556);
					((PrimaryNoNewArray_typeAccessContext)_localctx).last = match(RBRACK);
					_localctx.ls.add(new Dimension(((PrimaryNoNewArray_typeAccessContext)_localctx).first, ((PrimaryNoNewArray_typeAccessContext)_localctx).last));
					}
					}
					setState(2562);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2563);
				match(DOT);
				setState(2564);
				((PrimaryNoNewArray_typeAccessContext)_localctx).kw = match(CLASS);

				            ((PrimaryNoNewArray_typeAccessContext)_localctx).expr =  createTypeName(((PrimaryNoNewArray_typeAccessContext)_localctx).id);
				            if (_localctx.ls.size() > 0) {
				                ((PrimaryNoNewArray_typeAccessContext)_localctx).expr =  new ArrayTypeExpression(_localctx.expr, _localctx.ls);
				            }
				            ((PrimaryNoNewArray_typeAccessContext)_localctx).ret =  new ClassLiteralExpression(_localctx.expr, ((PrimaryNoNewArray_typeAccessContext)_localctx).kw);
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2566);
				((PrimaryNoNewArray_typeAccessContext)_localctx).p = packageOrTypeName(0);
				setState(2567);
				match(DOT);
				setState(2568);
				((PrimaryNoNewArray_typeAccessContext)_localctx).id = match(Identifier);
				setState(2574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2569);
					((PrimaryNoNewArray_typeAccessContext)_localctx).first = match(LBRACK);
					setState(2570);
					((PrimaryNoNewArray_typeAccessContext)_localctx).last = match(RBRACK);
					_localctx.ls.add(new Dimension(((PrimaryNoNewArray_typeAccessContext)_localctx).first, ((PrimaryNoNewArray_typeAccessContext)_localctx).last));
					}
					}
					setState(2576);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2577);
				match(DOT);
				setState(2578);
				((PrimaryNoNewArray_typeAccessContext)_localctx).kw = match(CLASS);

				            ((PrimaryNoNewArray_typeAccessContext)_localctx).expr =  new NameExpression(((PrimaryNoNewArray_typeAccessContext)_localctx).p.ret, createTypeName(((PrimaryNoNewArray_typeAccessContext)_localctx).id));
				            if (_localctx.ls.size() > 0) {
				                ((PrimaryNoNewArray_typeAccessContext)_localctx).expr =  new ArrayTypeExpression(_localctx.expr, _localctx.ls);
				            }
				            ((PrimaryNoNewArray_typeAccessContext)_localctx).ret =  new ClassLiteralExpression(_localctx.expr, ((PrimaryNoNewArray_typeAccessContext)_localctx).kw);
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2581);
				((PrimaryNoNewArray_typeAccessContext)_localctx).kv = match(VOID);
				setState(2582);
				match(DOT);
				setState(2583);
				((PrimaryNoNewArray_typeAccessContext)_localctx).kw = match(CLASS);
				((PrimaryNoNewArray_typeAccessContext)_localctx).ret =  new ClassLiteralExpression(createTypeName(((PrimaryNoNewArray_typeAccessContext)_localctx).kv), ((PrimaryNoNewArray_typeAccessContext)_localctx).kw);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2585);
				((PrimaryNoNewArray_typeAccessContext)_localctx).t = typeName();
				setState(2586);
				match(DOT);
				setState(2587);
				((PrimaryNoNewArray_typeAccessContext)_localctx).kw = match(THIS);

				            ((PrimaryNoNewArray_typeAccessContext)_localctx).ret =  new NameExpression(((PrimaryNoNewArray_typeAccessContext)_localctx).t.ret, createTypeName(((PrimaryNoNewArray_typeAccessContext)_localctx).kw));
				        
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
			setState(2619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2594);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a1 = literal();
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a1.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2597);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a2 = primaryNoNewArray_typeAccess();
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a2.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2600);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).kw = match(THIS);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  createTypeName(((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).kw);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2602);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).first = match(LPAREN);
				setState(2603);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).p = expression();
				setState(2604);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).last = match(RPAREN);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).p.ret; _localctx.ret.setFirstToken(((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).first); _localctx.ret.setLastToken(((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).last);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2607);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a5 = classInstanceCreationExpression();
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a5.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2610);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a6 = fieldAccess();
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a6.ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2613);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a7 = methodInvocation();
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a7.ret;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2616);
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
		public QualifiableExpression ret;
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
			setState(2636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2621);
				((PrimaryNoNewArray_lf_primaryContext)_localctx).a1 = classInstanceCreationExpression_lf_primary();
				((PrimaryNoNewArray_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primaryContext)_localctx).a1.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2624);
				((PrimaryNoNewArray_lf_primaryContext)_localctx).a2 = fieldAccess_lf_primary();
				((PrimaryNoNewArray_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primaryContext)_localctx).a2.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2627);
				((PrimaryNoNewArray_lf_primaryContext)_localctx).a3 = arrayAccess_lf_primary();
				((PrimaryNoNewArray_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primaryContext)_localctx).a3.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2630);
				((PrimaryNoNewArray_lf_primaryContext)_localctx).a4 = methodInvocation_lf_primary();
				((PrimaryNoNewArray_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primaryContext)_localctx).a4.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2633);
				((PrimaryNoNewArray_lf_primaryContext)_localctx).a5 = methodReference_lf_primary();
				((PrimaryNoNewArray_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primaryContext)_localctx).a5.ret;
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

	public static class PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public QualifiableExpression ret;
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
		enterRule(_localctx, 340, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(2650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2638);
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a1 = classInstanceCreationExpression_lf_primary();
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a1.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2641);
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a2 = fieldAccess_lf_primary();
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a2.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2644);
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a3 = methodInvocation_lf_primary();
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a3.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2647);
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a4 = methodReference_lf_primary();
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a4.ret;
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
		enterRule(_localctx, 342, RULE_primaryNoNewArray_lfno_primary);
		int _la;
		try {
			setState(2693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2652);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a1 = literal();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a1.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2655);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a2 = primaryNoNewArray_typeAccess();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a2.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2658);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a3 = unannPrimitiveType();
				setState(2664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2659);
					((PrimaryNoNewArray_lfno_primaryContext)_localctx).first = match(LBRACK);
					setState(2660);
					((PrimaryNoNewArray_lfno_primaryContext)_localctx).last = match(RBRACK);
					_localctx.ls.add(new Dimension(((PrimaryNoNewArray_lfno_primaryContext)_localctx).first, ((PrimaryNoNewArray_lfno_primaryContext)_localctx).last));
					}
					}
					setState(2666);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2667);
				match(DOT);
				setState(2668);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).kw = match(CLASS);

				            ((PrimaryNoNewArray_lfno_primaryContext)_localctx).lhs =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a3.ret;
				            if (_localctx.ls.size() > 0) {
				                ((PrimaryNoNewArray_lfno_primaryContext)_localctx).lhs =  new ArrayTypeExpression(((PrimaryNoNewArray_lfno_primaryContext)_localctx).a3.ret, _localctx.ls);
				            }
				            ((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  new ClassLiteralExpression(_localctx.lhs, ((PrimaryNoNewArray_lfno_primaryContext)_localctx).kw);
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2671);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).kw = match(THIS);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  createTypeName(((PrimaryNoNewArray_lfno_primaryContext)_localctx).kw);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2673);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).first = match(LPAREN);
				setState(2674);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).p = expression();
				setState(2675);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).last = match(RPAREN);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).p.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2678);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a7 = classInstanceCreationExpression_lfno_primary();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a7.ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2681);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a8 = fieldAccess_lfno_primary();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a8.ret;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2684);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a9 = arrayAccess_lfno_primary();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a9.ret;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2687);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a10 = methodInvocation_lfno_primary();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a10.ret;
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2690);
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
		enterRule(_localctx, 344, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
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
		enterRule(_localctx, 346, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		int _la;
		try {
			setState(2735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2697);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a1 = literal();
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a1.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2700);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a2 = primaryNoNewArray_typeAccess();
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a2.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2703);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a3 = unannPrimitiveType();
				setState(2709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2704);
					((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).first = match(LBRACK);
					setState(2705);
					((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).last = match(RBRACK);
					_localctx.ls.add(new Dimension(((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).first, ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).last));
					}
					}
					setState(2711);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2712);
				match(DOT);
				setState(2713);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).kw = match(CLASS);

				            ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).lhs =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a3.ret;
				            if (_localctx.ls.size() > 0) {
				                ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).lhs =  new ArrayTypeExpression(((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a3.ret, _localctx.ls);
				            }
				            ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  new ClassLiteralExpression(_localctx.lhs, ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).kw);
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2716);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).kw = match(THIS);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  createTypeName(((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).kw);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2718);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).first = match(LPAREN);
				setState(2719);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).p = expression();
				setState(2720);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).last = match(RPAREN);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).p.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2723);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a7 = classInstanceCreationExpression_lfno_primary();
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a7.ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2726);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a8 = fieldAccess_lfno_primary();
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a8.ret;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2729);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a9 = methodInvocation_lfno_primary();
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a9.ret;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2732);
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
		public InstantiationExpression ret;
		public Expression methodExpr;
		public Token tok;
		public NameExpression prev;
		public List<Annotation> ans = new ArrayList<>();
		public List<Annotation> ans2 = new ArrayList<>();
		public ConcreteBodyDeclaration anon;
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
		enterRule(_localctx, 348, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(2853);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2737);
				((ClassInstanceCreationExpressionContext)_localctx).kw = match(NEW);
				setState(2741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2738);
					((ClassInstanceCreationExpressionContext)_localctx).t = typeArguments();
					((ClassInstanceCreationExpressionContext)_localctx).targs =  ((ClassInstanceCreationExpressionContext)_localctx).t.ret;
					}
				}

				setState(2748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2743);
					((ClassInstanceCreationExpressionContext)_localctx).a = annotation();
					_localctx.ans.add(((ClassInstanceCreationExpressionContext)_localctx).a.ret);
					}
					}
					setState(2750);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2751);
				((ClassInstanceCreationExpressionContext)_localctx).id = match(Identifier);

				            ((ClassInstanceCreationExpressionContext)_localctx).tok =  ((ClassInstanceCreationExpressionContext)_localctx).id;
				            ((ClassInstanceCreationExpressionContext)_localctx).prev =  createTypeName(((ClassInstanceCreationExpressionContext)_localctx).id, _localctx.ans);
				            ((ClassInstanceCreationExpressionContext)_localctx).methodExpr =  _localctx.prev;
				        
				setState(2766);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2753);
					match(DOT);
					setState(2759);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2754);
						((ClassInstanceCreationExpressionContext)_localctx).a2 = annotation();
						_localctx.ans2.add(((ClassInstanceCreationExpressionContext)_localctx).a2.ret);
						}
						}
						setState(2761);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2762);
					((ClassInstanceCreationExpressionContext)_localctx).id2 = match(Identifier);

					                ((ClassInstanceCreationExpressionContext)_localctx).tok =  ((ClassInstanceCreationExpressionContext)_localctx).id2;
					                _localctx.prev.setKind(NameExpression.Kind.PACKAGE_OR_TYPE);
					                ((ClassInstanceCreationExpressionContext)_localctx).prev =  createTypeName(((ClassInstanceCreationExpressionContext)_localctx).id2, _localctx.ans2);
					                ((ClassInstanceCreationExpressionContext)_localctx).methodExpr =  new AccessExpression(_localctx.methodExpr, _localctx.prev);
					                _localctx.ans2.clear();
					            
					}
					}
					setState(2768);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2769);
					((ClassInstanceCreationExpressionContext)_localctx).ta = typeArgumentsOrDiamond();

					                ((ClassInstanceCreationExpressionContext)_localctx).methodExpr =  new ParamExpression(_localctx.methodExpr, ((ClassInstanceCreationExpressionContext)_localctx).ta.ret, ((ClassInstanceCreationExpressionContext)_localctx).ta.last);
					            
					}
				}

				setState(2774);
				match(LPAREN);
				setState(2778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(2775);
					((ClassInstanceCreationExpressionContext)_localctx).l = argumentList();
					((ClassInstanceCreationExpressionContext)_localctx).args =  ((ClassInstanceCreationExpressionContext)_localctx).l.ret;
					}
				}

				setState(2780);
				((ClassInstanceCreationExpressionContext)_localctx).last = match(RPAREN);

				            ((ClassInstanceCreationExpressionContext)_localctx).ret =  new InstantiationExpression(((ClassInstanceCreationExpressionContext)_localctx).kw, ((ClassInstanceCreationExpressionContext)_localctx).last,
				                                               _localctx.methodExpr, _localctx.tok,
				                                               _localctx.args, _localctx.targs);
				            ((ClassInstanceCreationExpressionContext)_localctx).anon =  _localctx.ret.getAnonymousClass();
				        
				setState(2783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2782);
					classBody(_localctx.anon);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2785);
				((ClassInstanceCreationExpressionContext)_localctx).name = expressionName();
				setState(2786);
				match(DOT);
				setState(2787);
				((ClassInstanceCreationExpressionContext)_localctx).kw = match(NEW);
				setState(2791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2788);
					((ClassInstanceCreationExpressionContext)_localctx).t = typeArguments();
					((ClassInstanceCreationExpressionContext)_localctx).targs =  ((ClassInstanceCreationExpressionContext)_localctx).t.ret;
					}
				}

				setState(2798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2793);
					((ClassInstanceCreationExpressionContext)_localctx).a = annotation();
					_localctx.ans.add(((ClassInstanceCreationExpressionContext)_localctx).a.ret);
					}
					}
					setState(2800);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2801);
				((ClassInstanceCreationExpressionContext)_localctx).id = match(Identifier);

				            ((ClassInstanceCreationExpressionContext)_localctx).tok =  ((ClassInstanceCreationExpressionContext)_localctx).id;
				            ((ClassInstanceCreationExpressionContext)_localctx).methodExpr =  new AccessExpression(((ClassInstanceCreationExpressionContext)_localctx).name.ret,
				                                               createTypeName(((ClassInstanceCreationExpressionContext)_localctx).id, _localctx.ans));
				        
				setState(2806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2803);
					((ClassInstanceCreationExpressionContext)_localctx).ta = typeArgumentsOrDiamond();

					                ((ClassInstanceCreationExpressionContext)_localctx).methodExpr =  new ParamExpression(_localctx.methodExpr, ((ClassInstanceCreationExpressionContext)_localctx).ta.ret, ((ClassInstanceCreationExpressionContext)_localctx).ta.last);
					            
					}
				}

				setState(2808);
				match(LPAREN);
				setState(2812);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(2809);
					((ClassInstanceCreationExpressionContext)_localctx).l = argumentList();
					((ClassInstanceCreationExpressionContext)_localctx).args =  ((ClassInstanceCreationExpressionContext)_localctx).l.ret;
					}
				}

				setState(2814);
				((ClassInstanceCreationExpressionContext)_localctx).last = match(RPAREN);

				            ((ClassInstanceCreationExpressionContext)_localctx).ret =  new InstantiationExpression(((ClassInstanceCreationExpressionContext)_localctx).kw, ((ClassInstanceCreationExpressionContext)_localctx).last,
				                                               _localctx.methodExpr, _localctx.tok,
				                                               _localctx.args, _localctx.targs);
				            ((ClassInstanceCreationExpressionContext)_localctx).anon =  _localctx.ret.getAnonymousClass();
				        
				setState(2817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2816);
					classBody(_localctx.anon);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2819);
				((ClassInstanceCreationExpressionContext)_localctx).p = primary();
				setState(2820);
				match(DOT);
				setState(2821);
				((ClassInstanceCreationExpressionContext)_localctx).kw = match(NEW);
				setState(2825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2822);
					((ClassInstanceCreationExpressionContext)_localctx).t = typeArguments();
					((ClassInstanceCreationExpressionContext)_localctx).targs =  ((ClassInstanceCreationExpressionContext)_localctx).t.ret;
					}
				}

				setState(2832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2827);
					((ClassInstanceCreationExpressionContext)_localctx).a = annotation();
					_localctx.ans.add(((ClassInstanceCreationExpressionContext)_localctx).a.ret);
					}
					}
					setState(2834);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2835);
				((ClassInstanceCreationExpressionContext)_localctx).id = match(Identifier);

				            ((ClassInstanceCreationExpressionContext)_localctx).tok =  ((ClassInstanceCreationExpressionContext)_localctx).id;
				            ((ClassInstanceCreationExpressionContext)_localctx).methodExpr =  new AccessExpression(((ClassInstanceCreationExpressionContext)_localctx).p.ret,
				                                               createTypeName(((ClassInstanceCreationExpressionContext)_localctx).id, _localctx.ans));
				        
				setState(2840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2837);
					((ClassInstanceCreationExpressionContext)_localctx).ta = typeArgumentsOrDiamond();

					                ((ClassInstanceCreationExpressionContext)_localctx).methodExpr =  new ParamExpression(_localctx.methodExpr, ((ClassInstanceCreationExpressionContext)_localctx).ta.ret, ((ClassInstanceCreationExpressionContext)_localctx).ta.last);
					            
					}
				}

				setState(2842);
				match(LPAREN);
				setState(2846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(2843);
					((ClassInstanceCreationExpressionContext)_localctx).l = argumentList();
					((ClassInstanceCreationExpressionContext)_localctx).args =  ((ClassInstanceCreationExpressionContext)_localctx).l.ret;
					}
				}

				setState(2848);
				((ClassInstanceCreationExpressionContext)_localctx).last = match(RPAREN);

				            ((ClassInstanceCreationExpressionContext)_localctx).ret =  new InstantiationExpression(((ClassInstanceCreationExpressionContext)_localctx).kw, ((ClassInstanceCreationExpressionContext)_localctx).last,
				                                               _localctx.methodExpr, _localctx.tok,
				                                               _localctx.args, _localctx.targs);
				            ((ClassInstanceCreationExpressionContext)_localctx).anon =  _localctx.ret.getAnonymousClass();
				        
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
			}
		}
		catch (RecognitionException re) {
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
		public Token tok;
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
		enterRule(_localctx, 350, RULE_classInstanceCreationExpression_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2855);
			match(DOT);
			setState(2856);
			((ClassInstanceCreationExpression_lf_primaryContext)_localctx).kw = match(NEW);
			setState(2860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2857);
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).t = typeArguments();
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).targs =  ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).t.ret;
				}
			}

			setState(2867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2862);
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).a = annotation();
				_localctx.ans.add(((ClassInstanceCreationExpression_lf_primaryContext)_localctx).a.ret);
				}
				}
				setState(2869);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2870);
			((ClassInstanceCreationExpression_lf_primaryContext)_localctx).id = match(Identifier);

			            ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).tok =  ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).id;
			            ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).methodExpr =  createTypeName(((ClassInstanceCreationExpression_lf_primaryContext)_localctx).id, _localctx.ans);
			        
			setState(2875);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2872);
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).ta = typeArgumentsOrDiamond();

				                ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).methodExpr =  new ParamExpression(_localctx.methodExpr, ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).ta.ret, ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).ta.last);
				            
				}
			}

			setState(2877);
			match(LPAREN);
			setState(2881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
				{
				setState(2878);
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).l = argumentList();
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).args =  ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).l.ret;
				}
			}

			setState(2883);
			((ClassInstanceCreationExpression_lf_primaryContext)_localctx).last = match(RPAREN);

			            ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).ret =  new InstantiationExpression(((ClassInstanceCreationExpression_lf_primaryContext)_localctx).kw, ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).last,
			                                               _localctx.methodExpr, _localctx.tok,
			                                               _localctx.args, _localctx.targs);
			            ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).anon =  _localctx.ret.getAnonymousClass();
			        
			setState(2886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				{
				setState(2885);
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
		public InstantiationExpression ret;
		public Expression methodExpr;
		public Token tok;
		public List<Annotation> ans = new ArrayList<>();
		public List<Annotation> ans2 = new ArrayList<>();
		public ConcreteBodyDeclaration anon;
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
		enterRule(_localctx, 352, RULE_classInstanceCreationExpression_lfno_primary);
		int _la;
		try {
			setState(2970);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2888);
				((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).kw = match(NEW);
				setState(2892);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2889);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).t = typeArguments();
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).targs =  ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(2899);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2894);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a = annotation();
					_localctx.ans.add(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a.ret);
					}
					}
					setState(2901);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2902);
				((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id = match(Identifier);

				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).tok =  ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id;
				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).methodExpr =  createPackageOrTypeName(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id, _localctx.ans);
				        
				setState(2917);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2904);
					match(DOT);
					setState(2910);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2905);
						((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a2 = annotation();
						_localctx.ans2.add(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a2.ret);
						}
						}
						setState(2912);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2913);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id2 = match(Identifier);

					                ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).tok =  ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id2;
					                ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).methodExpr =  new AccessExpression(_localctx.methodExpr,
					                                                   createPackageOrTypeName(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id2, _localctx.ans2));
					                _localctx.ans2.clear();
					            
					}
					}
					setState(2919);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2920);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ta = typeArgumentsOrDiamond();

					                ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).methodExpr =  new ParamExpression(_localctx.methodExpr, ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ta.ret, ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ta.last);
					            
					}
				}

				setState(2925);
				match(LPAREN);
				setState(2929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(2926);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).l = argumentList();
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).args =  ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).l.ret;
					}
				}

				setState(2931);
				((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).last = match(RPAREN);

				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ret =  new InstantiationExpression(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).kw, ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).last,
				                                               _localctx.methodExpr, _localctx.tok,
				                                               _localctx.args, _localctx.targs);
				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).anon =  _localctx.ret.getAnonymousClass();
				        
				setState(2934);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(2933);
					classBody(_localctx.anon);
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2936);
				((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).name = expressionName();
				setState(2937);
				match(DOT);
				setState(2938);
				((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).kw = match(NEW);
				setState(2942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2939);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).t = typeArguments();
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).targs =  ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(2949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2944);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a = annotation();
					_localctx.ans.add(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a.ret);
					}
					}
					setState(2951);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2952);
				((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id = match(Identifier);

				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).tok =  ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id;
				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).methodExpr =  new AccessExpression(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).name.ret,
				                                                createTypeName(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id, _localctx.ans));
				        
				setState(2957);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2954);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ta = typeArgumentsOrDiamond();

					                ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).methodExpr =  new ParamExpression(_localctx.methodExpr, ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ta.ret, ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ta.last);
					            
					}
				}

				setState(2959);
				match(LPAREN);
				setState(2963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(2960);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).l = argumentList();
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).args =  ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).l.ret;
					}
				}

				setState(2965);
				((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).last = match(RPAREN);

				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ret =  new InstantiationExpression(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).kw, ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).last,
				                                               _localctx.methodExpr, _localctx.tok,
				                                               _localctx.args, _localctx.targs);
				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).anon =  _localctx.ret.getAnonymousClass();
				        
				setState(2968);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
				case 1:
					{
					setState(2967);
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
		public Token last;
		public TypeArgumentsContext ta;
		public Token end;
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
		enterRule(_localctx, 354, RULE_typeArgumentsOrDiamond);
		try {
			setState(2978);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2972);
				((TypeArgumentsOrDiamondContext)_localctx).ta = typeArguments();
				((TypeArgumentsOrDiamondContext)_localctx).ret =  ((TypeArgumentsOrDiamondContext)_localctx).ta.ret; ((TypeArgumentsOrDiamondContext)_localctx).last =  ((TypeArgumentsOrDiamondContext)_localctx).ta.last;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2975);
				match(LT);
				setState(2976);
				((TypeArgumentsOrDiamondContext)_localctx).end = match(GT);
				((TypeArgumentsOrDiamondContext)_localctx).ret =  new ArrayList<>(); ((TypeArgumentsOrDiamondContext)_localctx).last =  ((TypeArgumentsOrDiamondContext)_localctx).end;
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
		enterRule(_localctx, 356, RULE_fieldAccess);
		try {
			setState(2996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2980);
				((FieldAccessContext)_localctx).p = primary();
				setState(2981);
				match(DOT);
				setState(2982);
				((FieldAccessContext)_localctx).id = match(Identifier);
				((FieldAccessContext)_localctx).ret =  new AccessExpression(((FieldAccessContext)_localctx).p.ret, createExpressionName(((FieldAccessContext)_localctx).id));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2985);
				((FieldAccessContext)_localctx).kw = match(SUPER);
				setState(2986);
				match(DOT);
				setState(2987);
				((FieldAccessContext)_localctx).id = match(Identifier);
				((FieldAccessContext)_localctx).ret =  new AccessExpression(createTypeName(((FieldAccessContext)_localctx).kw),
				                                     createExpressionName(((FieldAccessContext)_localctx).id));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2989);
				((FieldAccessContext)_localctx).t = typeName();
				setState(2990);
				match(DOT);
				setState(2991);
				((FieldAccessContext)_localctx).kw = match(SUPER);
				setState(2992);
				match(DOT);
				setState(2993);
				((FieldAccessContext)_localctx).id = match(Identifier);

				            ((FieldAccessContext)_localctx).ret =  new AccessExpression(new AccessExpression(((FieldAccessContext)_localctx).t.ret,
				                                                             createTypeName(((FieldAccessContext)_localctx).kw)),
				                                        createExpressionName(((FieldAccessContext)_localctx).id));
				        
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
		public AccessExpression ret;
		public Token id;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FieldAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lf_primary; }
	}

	public final FieldAccess_lf_primaryContext fieldAccess_lf_primary() throws RecognitionException {
		FieldAccess_lf_primaryContext _localctx = new FieldAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_fieldAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2998);
			match(DOT);
			setState(2999);
			((FieldAccess_lf_primaryContext)_localctx).id = match(Identifier);

			            ((FieldAccess_lf_primaryContext)_localctx).ret =  new AccessExpression(new NilExpression(),
			                                        createExpressionName(((FieldAccess_lf_primaryContext)_localctx).id));
			        
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 360, RULE_fieldAccess_lfno_primary);
		try {
			setState(3013);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(3002);
				((FieldAccess_lfno_primaryContext)_localctx).kw = match(SUPER);
				setState(3003);
				match(DOT);
				setState(3004);
				((FieldAccess_lfno_primaryContext)_localctx).id = match(Identifier);

				            ((FieldAccess_lfno_primaryContext)_localctx).ret =  new AccessExpression(createTypeName(((FieldAccess_lfno_primaryContext)_localctx).kw),
				                                        createExpressionName(((FieldAccess_lfno_primaryContext)_localctx).id));
				        
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(3006);
				((FieldAccess_lfno_primaryContext)_localctx).t = typeName();
				setState(3007);
				match(DOT);
				setState(3008);
				((FieldAccess_lfno_primaryContext)_localctx).kw = match(SUPER);
				setState(3009);
				match(DOT);
				setState(3010);
				((FieldAccess_lfno_primaryContext)_localctx).id = match(Identifier);

				            ((FieldAccess_lfno_primaryContext)_localctx).ret =  new AccessExpression(new AccessExpression(((FieldAccess_lfno_primaryContext)_localctx).t.ret,
				                                                             createTypeName(((FieldAccess_lfno_primaryContext)_localctx).kw)),
				                                        createExpressionName(((FieldAccess_lfno_primaryContext)_localctx).id));
				        
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
		enterRule(_localctx, 362, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3027);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				{
				setState(3015);
				((ArrayAccessContext)_localctx).n = expressionName();
				setState(3016);
				match(LBRACK);
				setState(3017);
				((ArrayAccessContext)_localctx).i = expression();
				setState(3018);
				((ArrayAccessContext)_localctx).last = match(RBRACK);
				((ArrayAccessContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccessContext)_localctx).last, ((ArrayAccessContext)_localctx).n.ret, ((ArrayAccessContext)_localctx).i.ret);
				}
				}
				break;
			case 2:
				{
				{
				setState(3021);
				((ArrayAccessContext)_localctx).pno = primaryNoNewArray_lfno_arrayAccess();
				setState(3022);
				match(LBRACK);
				setState(3023);
				((ArrayAccessContext)_localctx).i = expression();
				setState(3024);
				((ArrayAccessContext)_localctx).last = match(RBRACK);
				((ArrayAccessContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccessContext)_localctx).last, ((ArrayAccessContext)_localctx).pno.ret, ((ArrayAccessContext)_localctx).i.ret);
				}
				}
				break;
			}
			setState(3037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(3029);
				primaryNoNewArray_lf_arrayAccess();
				setState(3030);
				match(LBRACK);
				setState(3031);
				((ArrayAccessContext)_localctx).i = expression();
				setState(3032);
				((ArrayAccessContext)_localctx).last = match(RBRACK);
				((ArrayAccessContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccessContext)_localctx).last, _localctx.ret, ((ArrayAccessContext)_localctx).i.ret);
				}
				}
				setState(3039);
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
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext pno;
		public ExpressionContext i;
		public Token last;
		public ExpressionContext i2;
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lf_primary; }
	}

	public final ArrayAccess_lf_primaryContext arrayAccess_lf_primary() throws RecognitionException {
		ArrayAccess_lf_primaryContext _localctx = new ArrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_arrayAccess_lf_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3040);
			((ArrayAccess_lf_primaryContext)_localctx).pno = primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(3041);
			match(LBRACK);
			setState(3042);
			((ArrayAccess_lf_primaryContext)_localctx).i = expression();
			setState(3043);
			((ArrayAccess_lf_primaryContext)_localctx).last = match(RBRACK);
			((ArrayAccess_lf_primaryContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccess_lf_primaryContext)_localctx).last, ((ArrayAccess_lf_primaryContext)_localctx).pno.ret, ((ArrayAccess_lf_primaryContext)_localctx).i.ret);
			}
			setState(3053);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3046);
					match(LBRACK);
					setState(3047);
					((ArrayAccess_lf_primaryContext)_localctx).i2 = expression();
					setState(3048);
					((ArrayAccess_lf_primaryContext)_localctx).last = match(RBRACK);
					((ArrayAccess_lf_primaryContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccess_lf_primaryContext)_localctx).last, _localctx.ret, ((ArrayAccess_lf_primaryContext)_localctx).i2.ret);
					}
					} 
				}
				setState(3055);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
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
		enterRule(_localctx, 366, RULE_arrayAccess_lfno_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3068);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				{
				{
				setState(3056);
				((ArrayAccess_lfno_primaryContext)_localctx).name = expressionName();
				setState(3057);
				match(LBRACK);
				setState(3058);
				((ArrayAccess_lfno_primaryContext)_localctx).i = expression();
				setState(3059);
				((ArrayAccess_lfno_primaryContext)_localctx).last = match(RBRACK);
				((ArrayAccess_lfno_primaryContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccess_lfno_primaryContext)_localctx).last, ((ArrayAccess_lfno_primaryContext)_localctx).name.ret, ((ArrayAccess_lfno_primaryContext)_localctx).i.ret);
				}
				}
				break;
			case 2:
				{
				{
				setState(3062);
				((ArrayAccess_lfno_primaryContext)_localctx).pno = primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(3063);
				match(LBRACK);
				setState(3064);
				((ArrayAccess_lfno_primaryContext)_localctx).i = expression();
				setState(3065);
				((ArrayAccess_lfno_primaryContext)_localctx).last = match(RBRACK);
				((ArrayAccess_lfno_primaryContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccess_lfno_primaryContext)_localctx).last, ((ArrayAccess_lfno_primaryContext)_localctx).pno.ret, ((ArrayAccess_lfno_primaryContext)_localctx).i.ret);
				}
				}
				break;
			}
			setState(3078);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3070);
					primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(3071);
					match(LBRACK);
					setState(3072);
					((ArrayAccess_lfno_primaryContext)_localctx).i2 = expression();
					setState(3073);
					((ArrayAccess_lfno_primaryContext)_localctx).last = match(RBRACK);
					((ArrayAccess_lfno_primaryContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccess_lfno_primaryContext)_localctx).last, _localctx.ret, ((ArrayAccess_lfno_primaryContext)_localctx).i2.ret);
					}
					} 
				}
				setState(3080);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
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
		public AmbiguousNameContext amb;
		public TypeArgumentsContext t;
		public Token id;
		public PrimaryContext p;
		public Token kw;
		public TypeNameContext tn;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_methodInvocation);
		int _la;
		try {
			setState(3159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3081);
				((MethodInvocationContext)_localctx).mn = match(Identifier);
				setState(3082);
				match(LPAREN);
				setState(3086);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(3083);
					((MethodInvocationContext)_localctx).a = argumentList();
					((MethodInvocationContext)_localctx).args =  ((MethodInvocationContext)_localctx).a.ret;
					}
				}

				setState(3088);
				((MethodInvocationContext)_localctx).last = match(RPAREN);
				((MethodInvocationContext)_localctx).ret =  new CallExpression(((MethodInvocationContext)_localctx).last, ((MethodInvocationContext)_localctx).mn, _localctx.args);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3090);
				((MethodInvocationContext)_localctx).amb = ambiguousName(0);
				setState(3091);
				match(DOT);
				setState(3095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3092);
					((MethodInvocationContext)_localctx).t = typeArguments();
					((MethodInvocationContext)_localctx).targs =  ((MethodInvocationContext)_localctx).t.ret;
					}
				}

				setState(3097);
				((MethodInvocationContext)_localctx).id = match(Identifier);
				setState(3098);
				match(LPAREN);
				setState(3102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(3099);
					((MethodInvocationContext)_localctx).a = argumentList();
					((MethodInvocationContext)_localctx).args =  ((MethodInvocationContext)_localctx).a.ret;
					}
				}

				setState(3104);
				((MethodInvocationContext)_localctx).last = match(RPAREN);

				            ((MethodInvocationContext)_localctx).ret =  new CallExpression(((MethodInvocationContext)_localctx).last,
				                                      new AccessExpression(((MethodInvocationContext)_localctx).amb.ret,
				                                                           createMethodName(((MethodInvocationContext)_localctx).id)),
				                                      ((MethodInvocationContext)_localctx).id,
				                                      _localctx.args,
				                                      _localctx.targs);
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3107);
				((MethodInvocationContext)_localctx).p = primary();
				setState(3108);
				match(DOT);
				setState(3112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3109);
					((MethodInvocationContext)_localctx).t = typeArguments();
					((MethodInvocationContext)_localctx).targs =  ((MethodInvocationContext)_localctx).t.ret;
					}
				}

				setState(3114);
				((MethodInvocationContext)_localctx).id = match(Identifier);
				setState(3115);
				match(LPAREN);
				setState(3119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(3116);
					((MethodInvocationContext)_localctx).a = argumentList();
					((MethodInvocationContext)_localctx).args =  ((MethodInvocationContext)_localctx).a.ret;
					}
				}

				setState(3121);
				((MethodInvocationContext)_localctx).last = match(RPAREN);

				            ((MethodInvocationContext)_localctx).ret =  new CallExpression(((MethodInvocationContext)_localctx).last,
				                                      new AccessExpression(((MethodInvocationContext)_localctx).p.ret,
				                                                           createMethodName(((MethodInvocationContext)_localctx).id)),
				                                      ((MethodInvocationContext)_localctx).id,
				                                      _localctx.args,
				                                      _localctx.targs);
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3124);
				((MethodInvocationContext)_localctx).kw = match(SUPER);
				setState(3125);
				match(DOT);
				setState(3129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3126);
					((MethodInvocationContext)_localctx).t = typeArguments();
					((MethodInvocationContext)_localctx).targs =  ((MethodInvocationContext)_localctx).t.ret;
					}
				}

				setState(3131);
				((MethodInvocationContext)_localctx).id = match(Identifier);
				setState(3132);
				match(LPAREN);
				setState(3136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(3133);
					((MethodInvocationContext)_localctx).a = argumentList();
					((MethodInvocationContext)_localctx).args =  ((MethodInvocationContext)_localctx).a.ret;
					}
				}

				setState(3138);
				((MethodInvocationContext)_localctx).last = match(RPAREN);

				            ((MethodInvocationContext)_localctx).ret =  new CallExpression(((MethodInvocationContext)_localctx).last,
				                                      new AccessExpression(createTypeName(((MethodInvocationContext)_localctx).kw),
				                                                           createMethodName(((MethodInvocationContext)_localctx).id)),
				                                      ((MethodInvocationContext)_localctx).id,
				                                      _localctx.args,
				                                      _localctx.targs);
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3140);
				((MethodInvocationContext)_localctx).tn = typeName();
				setState(3141);
				match(DOT);
				setState(3142);
				((MethodInvocationContext)_localctx).kw = match(SUPER);
				setState(3143);
				match(DOT);
				setState(3147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3144);
					((MethodInvocationContext)_localctx).t = typeArguments();
					((MethodInvocationContext)_localctx).targs =  ((MethodInvocationContext)_localctx).t.ret;
					}
				}

				setState(3149);
				((MethodInvocationContext)_localctx).id = match(Identifier);
				setState(3150);
				match(LPAREN);
				setState(3154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(3151);
					((MethodInvocationContext)_localctx).a = argumentList();
					((MethodInvocationContext)_localctx).args =  ((MethodInvocationContext)_localctx).a.ret;
					}
				}

				setState(3156);
				((MethodInvocationContext)_localctx).last = match(RPAREN);

				            ((MethodInvocationContext)_localctx).ret =  new CallExpression(((MethodInvocationContext)_localctx).last,
				                                      new AccessExpression(new AccessExpression(((MethodInvocationContext)_localctx).tn.ret,
				                                                                                createTypeName(((MethodInvocationContext)_localctx).kw)),
				                                                           createMethodName(((MethodInvocationContext)_localctx).id)),
				                                      ((MethodInvocationContext)_localctx).id,
				                                      _localctx.args,
				                                      _localctx.targs);
				        
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
		enterRule(_localctx, 370, RULE_methodInvocation_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3161);
			match(DOT);
			setState(3165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(3162);
				((MethodInvocation_lf_primaryContext)_localctx).t = typeArguments();
				((MethodInvocation_lf_primaryContext)_localctx).targs =  ((MethodInvocation_lf_primaryContext)_localctx).t.ret;
				}
			}

			setState(3167);
			((MethodInvocation_lf_primaryContext)_localctx).id = match(Identifier);
			setState(3168);
			match(LPAREN);
			setState(3172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
				{
				setState(3169);
				((MethodInvocation_lf_primaryContext)_localctx).a = argumentList();
				((MethodInvocation_lf_primaryContext)_localctx).args =  ((MethodInvocation_lf_primaryContext)_localctx).a.ret;
				}
			}

			setState(3174);
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
		public AmbiguousNameContext amb;
		public TypeArgumentsContext t;
		public Token id;
		public Token kw;
		public TypeNameContext tn;
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lfno_primary; }
	}

	public final MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() throws RecognitionException {
		MethodInvocation_lfno_primaryContext _localctx = new MethodInvocation_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_methodInvocation_lfno_primary);
		int _la;
		try {
			setState(3238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3177);
				((MethodInvocation_lfno_primaryContext)_localctx).mn = match(Identifier);
				setState(3178);
				match(LPAREN);
				setState(3182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(3179);
					((MethodInvocation_lfno_primaryContext)_localctx).a = argumentList();
					((MethodInvocation_lfno_primaryContext)_localctx).args =  ((MethodInvocation_lfno_primaryContext)_localctx).a.ret;
					}
				}

				setState(3184);
				((MethodInvocation_lfno_primaryContext)_localctx).last = match(RPAREN);
				((MethodInvocation_lfno_primaryContext)_localctx).ret =  new CallExpression(((MethodInvocation_lfno_primaryContext)_localctx).last, ((MethodInvocation_lfno_primaryContext)_localctx).mn, _localctx.args);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3186);
				((MethodInvocation_lfno_primaryContext)_localctx).amb = ambiguousName(0);
				setState(3187);
				match(DOT);
				setState(3191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3188);
					((MethodInvocation_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodInvocation_lfno_primaryContext)_localctx).targs =  ((MethodInvocation_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3193);
				((MethodInvocation_lfno_primaryContext)_localctx).id = match(Identifier);
				setState(3194);
				match(LPAREN);
				setState(3198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(3195);
					((MethodInvocation_lfno_primaryContext)_localctx).a = argumentList();
					((MethodInvocation_lfno_primaryContext)_localctx).args =  ((MethodInvocation_lfno_primaryContext)_localctx).a.ret;
					}
				}

				setState(3200);
				((MethodInvocation_lfno_primaryContext)_localctx).last = match(RPAREN);

				            ((MethodInvocation_lfno_primaryContext)_localctx).ret =  new CallExpression(((MethodInvocation_lfno_primaryContext)_localctx).last,
				                                      new AccessExpression(((MethodInvocation_lfno_primaryContext)_localctx).amb.ret,
				                                                           createMethodName(((MethodInvocation_lfno_primaryContext)_localctx).id)),
				                                      ((MethodInvocation_lfno_primaryContext)_localctx).id,
				                                      _localctx.args,
				                                      _localctx.targs);
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3203);
				((MethodInvocation_lfno_primaryContext)_localctx).kw = match(SUPER);
				setState(3204);
				match(DOT);
				setState(3208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3205);
					((MethodInvocation_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodInvocation_lfno_primaryContext)_localctx).targs =  ((MethodInvocation_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3210);
				((MethodInvocation_lfno_primaryContext)_localctx).id = match(Identifier);
				setState(3211);
				match(LPAREN);
				setState(3215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(3212);
					((MethodInvocation_lfno_primaryContext)_localctx).a = argumentList();
					((MethodInvocation_lfno_primaryContext)_localctx).args =  ((MethodInvocation_lfno_primaryContext)_localctx).a.ret;
					}
				}

				setState(3217);
				((MethodInvocation_lfno_primaryContext)_localctx).last = match(RPAREN);

				            ((MethodInvocation_lfno_primaryContext)_localctx).ret =  new CallExpression(((MethodInvocation_lfno_primaryContext)_localctx).last,
				                                      new AccessExpression(createTypeName(((MethodInvocation_lfno_primaryContext)_localctx).kw),
				                                                           createMethodName(((MethodInvocation_lfno_primaryContext)_localctx).id)),
				                                      ((MethodInvocation_lfno_primaryContext)_localctx).id,
				                                      _localctx.args,
				                                      _localctx.targs);
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3219);
				((MethodInvocation_lfno_primaryContext)_localctx).tn = typeName();
				setState(3220);
				match(DOT);
				setState(3221);
				((MethodInvocation_lfno_primaryContext)_localctx).kw = match(SUPER);
				setState(3222);
				match(DOT);
				setState(3226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3223);
					((MethodInvocation_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodInvocation_lfno_primaryContext)_localctx).targs =  ((MethodInvocation_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3228);
				((MethodInvocation_lfno_primaryContext)_localctx).id = match(Identifier);
				setState(3229);
				match(LPAREN);
				setState(3233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << BadBooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << NullLiteral) | (1L << BadNullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (Identifier - 72)) | (1L << (AT - 72)))) != 0)) {
					{
					setState(3230);
					((MethodInvocation_lfno_primaryContext)_localctx).a = argumentList();
					((MethodInvocation_lfno_primaryContext)_localctx).args =  ((MethodInvocation_lfno_primaryContext)_localctx).a.ret;
					}
				}

				setState(3235);
				((MethodInvocation_lfno_primaryContext)_localctx).last = match(RPAREN);

				            ((MethodInvocation_lfno_primaryContext)_localctx).ret =  new CallExpression(((MethodInvocation_lfno_primaryContext)_localctx).last,
				                                      new AccessExpression(new AccessExpression(((MethodInvocation_lfno_primaryContext)_localctx).tn.ret,
				                                                                                createTypeName(((MethodInvocation_lfno_primaryContext)_localctx).kw)),
				                                                           createMethodName(((MethodInvocation_lfno_primaryContext)_localctx).id)),
				                                      ((MethodInvocation_lfno_primaryContext)_localctx).id,
				                                      _localctx.args,
				                                      _localctx.targs);
				        
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
		enterRule(_localctx, 374, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3240);
			((ArgumentListContext)_localctx).e = expression();
			_localctx.ls.add(((ArgumentListContext)_localctx).e.ret);
			}
			setState(3249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3243);
				match(COMMA);
				setState(3244);
				((ArgumentListContext)_localctx).ex = expression();
				_localctx.ls.add(((ArgumentListContext)_localctx).ex.ret);
				}
				}
				setState(3251);
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
		enterRule(_localctx, 376, RULE_methodReference);
		int _la;
		try {
			setState(3320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3254);
				((MethodReferenceContext)_localctx).en = expressionName();
				setState(3255);
				match(COLONCOLON);
				setState(3259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3256);
					((MethodReferenceContext)_localctx).t = typeArguments();
					((MethodReferenceContext)_localctx).targs =  ((MethodReferenceContext)_localctx).t.ret;
					}
				}

				setState(3261);
				((MethodReferenceContext)_localctx).id = match(Identifier);

				            ((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(((MethodReferenceContext)_localctx).en.ret,
				                                                 createMethodName(((MethodReferenceContext)_localctx).id),
				                                                 _localctx.targs);
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3264);
				((MethodReferenceContext)_localctx).r = referenceType();
				setState(3265);
				match(COLONCOLON);
				setState(3269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3266);
					((MethodReferenceContext)_localctx).t = typeArguments();
					((MethodReferenceContext)_localctx).targs =  ((MethodReferenceContext)_localctx).t.ret;
					}
				}

				setState(3271);
				((MethodReferenceContext)_localctx).id = match(Identifier);

				            ((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(((MethodReferenceContext)_localctx).r.ret,
				                                                 createMethodName(((MethodReferenceContext)_localctx).id),
				                                                 _localctx.targs);
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3274);
				((MethodReferenceContext)_localctx).p = primary();
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

				            ((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(((MethodReferenceContext)_localctx).p.ret,
				                                                 createMethodName(((MethodReferenceContext)_localctx).id),
				                                                 _localctx.targs);
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3284);
				((MethodReferenceContext)_localctx).kw = match(SUPER);
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

				            ((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(createTypeName(((MethodReferenceContext)_localctx).kw),
				                                                 createMethodName(((MethodReferenceContext)_localctx).id),
				                                                 _localctx.targs);
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3293);
				((MethodReferenceContext)_localctx).tn = typeName();
				setState(3294);
				match(DOT);
				setState(3295);
				((MethodReferenceContext)_localctx).kw = match(SUPER);
				setState(3296);
				match(COLONCOLON);
				setState(3300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3297);
					((MethodReferenceContext)_localctx).t = typeArguments();
					((MethodReferenceContext)_localctx).targs =  ((MethodReferenceContext)_localctx).t.ret;
					}
				}

				setState(3302);
				((MethodReferenceContext)_localctx).id = match(Identifier);

				            ((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(new NameExpression(((MethodReferenceContext)_localctx).tn.ret,
				                                                                    createTypeName(((MethodReferenceContext)_localctx).kw)),
				                                                 createMethodName(((MethodReferenceContext)_localctx).id),
				                                                 _localctx.targs);
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3305);
				((MethodReferenceContext)_localctx).c = classType();
				setState(3306);
				match(COLONCOLON);
				setState(3310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3307);
					((MethodReferenceContext)_localctx).t = typeArguments();
					((MethodReferenceContext)_localctx).targs =  ((MethodReferenceContext)_localctx).t.ret;
					}
				}

				setState(3312);
				((MethodReferenceContext)_localctx).kw = match(NEW);

				            ((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(((MethodReferenceContext)_localctx).c.ret,
				                                                 createMethodName(((MethodReferenceContext)_localctx).kw),
				                                                 _localctx.targs);
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3315);
				((MethodReferenceContext)_localctx).a = arrayType();
				setState(3316);
				match(COLONCOLON);
				setState(3317);
				((MethodReferenceContext)_localctx).kw = match(NEW);

				            ((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(((MethodReferenceContext)_localctx).a.ret,
				                                                 createMethodName(((MethodReferenceContext)_localctx).kw),
				                                                 _localctx.targs);
				        
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
		enterRule(_localctx, 378, RULE_methodReference_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3322);
			match(COLONCOLON);
			setState(3326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(3323);
				((MethodReference_lf_primaryContext)_localctx).t = typeArguments();
				((MethodReference_lf_primaryContext)_localctx).targs =  ((MethodReference_lf_primaryContext)_localctx).t.ret;
				}
			}

			setState(3328);
			((MethodReference_lf_primaryContext)_localctx).id = match(Identifier);

			            ((MethodReference_lf_primaryContext)_localctx).ret =  new MethodReferenceExpression(new NilExpression(),
			                                                 createMethodName(((MethodReference_lf_primaryContext)_localctx).id),
			                                                 _localctx.targs);
			        
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 380, RULE_methodReference_lfno_primary);
		int _la;
		try {
			setState(3387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3331);
				((MethodReference_lfno_primaryContext)_localctx).en = expressionName();
				setState(3332);
				match(COLONCOLON);
				setState(3336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3333);
					((MethodReference_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodReference_lfno_primaryContext)_localctx).targs =  ((MethodReference_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3338);
				((MethodReference_lfno_primaryContext)_localctx).id = match(Identifier);

				            ((MethodReference_lfno_primaryContext)_localctx).ret =  new MethodReferenceExpression(((MethodReference_lfno_primaryContext)_localctx).en.ret,
				                                                 createMethodName(((MethodReference_lfno_primaryContext)_localctx).id),
				                                                 _localctx.targs);
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3341);
				((MethodReference_lfno_primaryContext)_localctx).r = referenceType();
				setState(3342);
				match(COLONCOLON);
				setState(3346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3343);
					((MethodReference_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodReference_lfno_primaryContext)_localctx).targs =  ((MethodReference_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3348);
				((MethodReference_lfno_primaryContext)_localctx).id = match(Identifier);

				            ((MethodReference_lfno_primaryContext)_localctx).ret =  new MethodReferenceExpression(((MethodReference_lfno_primaryContext)_localctx).r.ret,
				                                                 createMethodName(((MethodReference_lfno_primaryContext)_localctx).id),
				                                                 _localctx.targs);
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3351);
				((MethodReference_lfno_primaryContext)_localctx).kw = match(SUPER);
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

				            ((MethodReference_lfno_primaryContext)_localctx).ret =  new MethodReferenceExpression(createTypeName(((MethodReference_lfno_primaryContext)_localctx).kw),
				                                                 createMethodName(((MethodReference_lfno_primaryContext)_localctx).id),
				                                                 _localctx.targs);
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3360);
				((MethodReference_lfno_primaryContext)_localctx).tn = typeName();
				setState(3361);
				match(DOT);
				setState(3362);
				((MethodReference_lfno_primaryContext)_localctx).kw = match(SUPER);
				setState(3363);
				match(COLONCOLON);
				setState(3367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3364);
					((MethodReference_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodReference_lfno_primaryContext)_localctx).targs =  ((MethodReference_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3369);
				((MethodReference_lfno_primaryContext)_localctx).id = match(Identifier);

				            ((MethodReference_lfno_primaryContext)_localctx).ret =  new MethodReferenceExpression(new AccessExpression(((MethodReference_lfno_primaryContext)_localctx).tn.ret,
				                                                                      createTypeName(((MethodReference_lfno_primaryContext)_localctx).kw)),
				                                                 createMethodName(((MethodReference_lfno_primaryContext)_localctx).id),
				                                                 _localctx.targs);
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3372);
				((MethodReference_lfno_primaryContext)_localctx).c = classType();
				setState(3373);
				match(COLONCOLON);
				setState(3377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3374);
					((MethodReference_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodReference_lfno_primaryContext)_localctx).targs =  ((MethodReference_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3379);
				((MethodReference_lfno_primaryContext)_localctx).kw = match(NEW);

				            ((MethodReference_lfno_primaryContext)_localctx).ret =  new MethodReferenceExpression(((MethodReference_lfno_primaryContext)_localctx).c.ret,
				                                                 createMethodName(((MethodReference_lfno_primaryContext)_localctx).kw),
				                                                 _localctx.targs);
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3382);
				((MethodReference_lfno_primaryContext)_localctx).a = arrayType();
				setState(3383);
				match(COLONCOLON);
				setState(3384);
				((MethodReference_lfno_primaryContext)_localctx).kw = match(NEW);

				            ((MethodReference_lfno_primaryContext)_localctx).ret =  new MethodReferenceExpression(((MethodReference_lfno_primaryContext)_localctx).a.ret,
				                                                 createMethodName(((MethodReference_lfno_primaryContext)_localctx).kw),
				                                                 _localctx.targs);
				        
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
		enterRule(_localctx, 382, RULE_arrayCreationExpression);
		try {
			setState(3421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3389);
				((ArrayCreationExpressionContext)_localctx).kw = match(NEW);
				setState(3390);
				((ArrayCreationExpressionContext)_localctx).p = primitiveType();
				setState(3391);
				((ArrayCreationExpressionContext)_localctx).de = dimExprs();
				setState(3395);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
				case 1:
					{
					setState(3392);
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
				setState(3399);
				((ArrayCreationExpressionContext)_localctx).kw = match(NEW);
				setState(3400);
				((ArrayCreationExpressionContext)_localctx).c = classOrInterfaceType();
				setState(3401);
				((ArrayCreationExpressionContext)_localctx).de = dimExprs();
				setState(3405);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
				case 1:
					{
					setState(3402);
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
				setState(3409);
				((ArrayCreationExpressionContext)_localctx).kw = match(NEW);
				setState(3410);
				((ArrayCreationExpressionContext)_localctx).p = primitiveType();
				setState(3411);
				((ArrayCreationExpressionContext)_localctx).d = dims();
				setState(3412);
				((ArrayCreationExpressionContext)_localctx).i = arrayInitializer();
				((ArrayCreationExpressionContext)_localctx).ret =  new ArrayConstruction(((ArrayCreationExpressionContext)_localctx).kw, ((ArrayCreationExpressionContext)_localctx).p.ret, ((ArrayCreationExpressionContext)_localctx).d.ret, ((ArrayCreationExpressionContext)_localctx).i.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3415);
				((ArrayCreationExpressionContext)_localctx).kw = match(NEW);
				setState(3416);
				((ArrayCreationExpressionContext)_localctx).c = classOrInterfaceType();
				setState(3417);
				((ArrayCreationExpressionContext)_localctx).d = dims();
				setState(3418);
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
		enterRule(_localctx, 384, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3423);
			((DimExprsContext)_localctx).d1 = dimExpr();
			((DimExprsContext)_localctx).ret =  new ArrayList<>(); _localctx.ret.add(((DimExprsContext)_localctx).d1.ret);
			setState(3430);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3425);
					((DimExprsContext)_localctx).d = dimExpr();
					_localctx.ret.add(((DimExprsContext)_localctx).d.ret);
					}
					} 
				}
				setState(3432);
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
		enterRule(_localctx, 386, RULE_dimExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(3433);
				((DimExprContext)_localctx).a = annotation();
				_localctx.ans.add(((DimExprContext)_localctx).a.ret);
				}
				}
				setState(3440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3441);
			((DimExprContext)_localctx).first = match(LBRACK);
			setState(3442);
			((DimExprContext)_localctx).ex = expression();
			setState(3443);
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
		enterRule(_localctx, 388, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3446);
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
		enterRule(_localctx, 390, RULE_expression);
		try {
			setState(3455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3449);
				((ExpressionContext)_localctx).l = lambdaExpression();
				((ExpressionContext)_localctx).ret =  ((ExpressionContext)_localctx).l.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3452);
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
		enterRule(_localctx, 392, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3457);
			((LambdaExpressionContext)_localctx).p = lambdaParameters();
			setState(3458);
			match(ARROW);
			setState(3459);
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
		enterRule(_localctx, 394, RULE_lambdaParameters);
		int _la;
		try {
			setState(3477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3462);
				((LambdaParametersContext)_localctx).id = match(Identifier);

				            _localctx.vars.add(new VariableDeclaration(((LambdaParametersContext)_localctx).id));
				            ((LambdaParametersContext)_localctx).ret =  _localctx.vars;
				            ((LambdaParametersContext)_localctx).first =  ((LambdaParametersContext)_localctx).id;
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3464);
				((LambdaParametersContext)_localctx).f = match(LPAREN);
				setState(3468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
					{
					setState(3465);
					((LambdaParametersContext)_localctx).p = formalParameterList();
					((LambdaParametersContext)_localctx).ret =  ((LambdaParametersContext)_localctx).p.ret;
					}
				}

				setState(3470);
				match(RPAREN);
				((LambdaParametersContext)_localctx).first =  ((LambdaParametersContext)_localctx).f;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3472);
				((LambdaParametersContext)_localctx).f = match(LPAREN);
				setState(3473);
				((LambdaParametersContext)_localctx).i = inferredFormalParameterList();
				setState(3474);
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
		enterRule(_localctx, 396, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3479);
			((InferredFormalParameterListContext)_localctx).id = match(Identifier);
			_localctx.vars.add(new VariableDeclaration(((InferredFormalParameterListContext)_localctx).id));
			}
			setState(3487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3482);
				match(COMMA);
				setState(3483);
				((InferredFormalParameterListContext)_localctx).i = match(Identifier);
				_localctx.vars.add(new VariableDeclaration(((InferredFormalParameterListContext)_localctx).i));
				}
				}
				setState(3489);
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
		enterRule(_localctx, 398, RULE_lambdaBody);
		try {
			setState(3498);
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
			case BadBooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case BadStringLiteral:
			case NullLiteral:
			case BadNullLiteral:
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
				setState(3492);
				((LambdaBodyContext)_localctx).e = expression();
				((LambdaBodyContext)_localctx).ret =  new Block(((LambdaBodyContext)_localctx).e.ret);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(3495);
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
		enterRule(_localctx, 400, RULE_assignmentExpression);
		try {
			setState(3506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3500);
				((AssignmentExpressionContext)_localctx).c = conditionalExpression();
				((AssignmentExpressionContext)_localctx).ret =  ((AssignmentExpressionContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3503);
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
		enterRule(_localctx, 402, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3508);
			((AssignmentContext)_localctx).l = leftHandSide();
			setState(3509);
			((AssignmentContext)_localctx).op = assignmentOperator();
			setState(3510);
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
		enterRule(_localctx, 404, RULE_leftHandSide);
		try {
			setState(3522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3513);
				((LeftHandSideContext)_localctx).n = expressionName();
				((LeftHandSideContext)_localctx).ret =  ((LeftHandSideContext)_localctx).n.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3516);
				((LeftHandSideContext)_localctx).f = fieldAccess();
				((LeftHandSideContext)_localctx).ret =  ((LeftHandSideContext)_localctx).f.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3519);
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
		public BinaryOperator ret;
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_assignmentOperator);
		try {
			setState(3548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(3524);
				match(ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  null;
				}
				break;
			case MUL_ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(3526);
				match(MUL_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  BinaryOperator.MULTIPLICATION;
				}
				break;
			case DIV_ASSIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(3528);
				match(DIV_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  BinaryOperator.DIVISION;
				}
				break;
			case MOD_ASSIGN:
				enterOuterAlt(_localctx, 4);
				{
				setState(3530);
				match(MOD_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  BinaryOperator.MODULUS;
				}
				break;
			case ADD_ASSIGN:
				enterOuterAlt(_localctx, 5);
				{
				setState(3532);
				match(ADD_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  BinaryOperator.ADDITION;
				}
				break;
			case SUB_ASSIGN:
				enterOuterAlt(_localctx, 6);
				{
				setState(3534);
				match(SUB_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  BinaryOperator.SUBTRACTION;
				}
				break;
			case LSHIFT_ASSIGN:
				enterOuterAlt(_localctx, 7);
				{
				setState(3536);
				match(LSHIFT_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  BinaryOperator.LEFT_SHIFT;
				}
				break;
			case RSHIFT_ASSIGN:
				enterOuterAlt(_localctx, 8);
				{
				setState(3538);
				match(RSHIFT_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  BinaryOperator.RIGHT_SHIFT;
				}
				break;
			case URSHIFT_ASSIGN:
				enterOuterAlt(_localctx, 9);
				{
				setState(3540);
				match(URSHIFT_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  BinaryOperator.RIGHT_LOGICAL_SHIFT;
				}
				break;
			case AND_ASSIGN:
				enterOuterAlt(_localctx, 10);
				{
				setState(3542);
				match(AND_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  BinaryOperator.BITWISE_AND;
				}
				break;
			case XOR_ASSIGN:
				enterOuterAlt(_localctx, 11);
				{
				setState(3544);
				match(XOR_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  BinaryOperator.BITWISE_XOR;
				}
				break;
			case OR_ASSIGN:
				enterOuterAlt(_localctx, 12);
				{
				setState(3546);
				match(OR_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  BinaryOperator.BITWISE_OR;
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
		enterRule(_localctx, 408, RULE_conditionalExpression);
		try {
			setState(3560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3550);
				((ConditionalExpressionContext)_localctx).c = conditionalOrExpression(0);
				((ConditionalExpressionContext)_localctx).ret =  ((ConditionalExpressionContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3553);
				((ConditionalExpressionContext)_localctx).c = conditionalOrExpression(0);
				setState(3554);
				match(QUESTION);
				setState(3555);
				((ConditionalExpressionContext)_localctx).i = expression();
				setState(3556);
				match(COLON);
				setState(3557);
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
		int _startState = 410;
		enterRecursionRule(_localctx, 410, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3563);
			((ConditionalOrExpressionContext)_localctx).c = conditionalAndExpression(0);
			((ConditionalOrExpressionContext)_localctx).ret =  ((ConditionalOrExpressionContext)_localctx).c.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3573);
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
					setState(3566);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3567);
					match(OR);
					setState(3568);
					((ConditionalOrExpressionContext)_localctx).c2 = conditionalAndExpression(0);
					((ConditionalOrExpressionContext)_localctx).ret =  new BinaryExpression(((ConditionalOrExpressionContext)_localctx).c1.ret, BinaryOperator.OR, ((ConditionalOrExpressionContext)_localctx).c2.ret);
					}
					} 
				}
				setState(3575);
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
		int _startState = 412;
		enterRecursionRule(_localctx, 412, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3577);
			((ConditionalAndExpressionContext)_localctx).i = inclusiveOrExpression(0);
			((ConditionalAndExpressionContext)_localctx).ret =  ((ConditionalAndExpressionContext)_localctx).i.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3587);
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
					setState(3580);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3581);
					match(AND);
					setState(3582);
					((ConditionalAndExpressionContext)_localctx).r = inclusiveOrExpression(0);
					((ConditionalAndExpressionContext)_localctx).ret =  new BinaryExpression(((ConditionalAndExpressionContext)_localctx).l.ret, BinaryOperator.AND, ((ConditionalAndExpressionContext)_localctx).r.ret);
					}
					} 
				}
				setState(3589);
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
		int _startState = 414;
		enterRecursionRule(_localctx, 414, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3591);
			((InclusiveOrExpressionContext)_localctx).ex = exclusiveOrExpression(0);
			((InclusiveOrExpressionContext)_localctx).ret =  ((InclusiveOrExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3601);
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
					setState(3594);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3595);
					match(BITOR);
					setState(3596);
					((InclusiveOrExpressionContext)_localctx).r = exclusiveOrExpression(0);
					((InclusiveOrExpressionContext)_localctx).ret =  new BinaryExpression(((InclusiveOrExpressionContext)_localctx).l.ret,BinaryOperator.BITWISE_OR, ((InclusiveOrExpressionContext)_localctx).r.ret);
					}
					} 
				}
				setState(3603);
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
		int _startState = 416;
		enterRecursionRule(_localctx, 416, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3605);
			((ExclusiveOrExpressionContext)_localctx).ex = andExpression(0);
			((ExclusiveOrExpressionContext)_localctx).ret =  ((ExclusiveOrExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3615);
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
					setState(3608);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3609);
					match(CARET);
					setState(3610);
					((ExclusiveOrExpressionContext)_localctx).r = andExpression(0);
					((ExclusiveOrExpressionContext)_localctx).ret =  new BinaryExpression(((ExclusiveOrExpressionContext)_localctx).l.ret, BinaryOperator.BITWISE_XOR, ((ExclusiveOrExpressionContext)_localctx).r.ret);
					}
					} 
				}
				setState(3617);
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
		int _startState = 418;
		enterRecursionRule(_localctx, 418, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3619);
			((AndExpressionContext)_localctx).ex = equalityExpression(0);
			((AndExpressionContext)_localctx).ret =  ((AndExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3629);
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
					setState(3622);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3623);
					match(BITAND);
					setState(3624);
					((AndExpressionContext)_localctx).r = equalityExpression(0);
					((AndExpressionContext)_localctx).ret =  new BinaryExpression(((AndExpressionContext)_localctx).l.ret, BinaryOperator.BITWISE_AND, ((AndExpressionContext)_localctx).r.ret);
					}
					} 
				}
				setState(3631);
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
		int _startState = 420;
		enterRecursionRule(_localctx, 420, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3633);
			((EqualityExpressionContext)_localctx).ex = relationalExpression(0);
			((EqualityExpressionContext)_localctx).ret =  ((EqualityExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3648);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3646);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(3636);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3637);
						match(EQUAL);
						setState(3638);
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
						setState(3641);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3642);
						match(NOTEQUAL);
						setState(3643);
						((EqualityExpressionContext)_localctx).r = relationalExpression(0);
						((EqualityExpressionContext)_localctx).ret =  new BinaryExpression(((EqualityExpressionContext)_localctx).l.ret, BinaryOperator.INEQUALITY, ((EqualityExpressionContext)_localctx).r.ret);
						}
						break;
					}
					} 
				}
				setState(3650);
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
		int _startState = 422;
		enterRecursionRule(_localctx, 422, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3652);
			((RelationalExpressionContext)_localctx).ex = shiftExpression(0);
			((RelationalExpressionContext)_localctx).ret =  ((RelationalExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3682);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3680);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(3655);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(3656);
						match(LT);
						setState(3657);
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
						setState(3660);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(3661);
						match(GT);
						setState(3662);
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
						setState(3665);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(3666);
						match(LE);
						setState(3667);
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
						setState(3670);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3671);
						match(GE);
						setState(3672);
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
						setState(3675);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3676);
						match(INSTANCEOF);
						setState(3677);
						((RelationalExpressionContext)_localctx).rt = referenceType();
						((RelationalExpressionContext)_localctx).ret =  new BinaryExpression(((RelationalExpressionContext)_localctx).l.ret, BinaryOperator.INSTANCE_OF, ((RelationalExpressionContext)_localctx).rt.ret);
						}
						break;
					}
					} 
				}
				setState(3684);
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
		int _startState = 424;
		enterRecursionRule(_localctx, 424, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3686);
			((ShiftExpressionContext)_localctx).ex = additiveExpression(0);
			((ShiftExpressionContext)_localctx).ret =  ((ShiftExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3710);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3708);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(3689);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(3690);
						match(LT);
						setState(3691);
						match(LT);
						setState(3692);
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
						setState(3695);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3696);
						match(GT);
						setState(3697);
						match(GT);
						setState(3698);
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
						setState(3701);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3702);
						match(GT);
						setState(3703);
						match(GT);
						setState(3704);
						match(GT);
						setState(3705);
						((ShiftExpressionContext)_localctx).r = additiveExpression(0);
						((ShiftExpressionContext)_localctx).ret =  new BinaryExpression(((ShiftExpressionContext)_localctx).l.ret, BinaryOperator.RIGHT_LOGICAL_SHIFT, ((ShiftExpressionContext)_localctx).r.ret);
						}
						break;
					}
					} 
				}
				setState(3712);
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
		int _startState = 426;
		enterRecursionRule(_localctx, 426, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3714);
			((AdditiveExpressionContext)_localctx).ex = multiplicativeExpression(0);
			((AdditiveExpressionContext)_localctx).ret =  ((AdditiveExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3729);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3727);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(3717);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3718);
						match(ADD);
						setState(3719);
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
						setState(3722);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3723);
						match(SUB);
						setState(3724);
						((AdditiveExpressionContext)_localctx).r = multiplicativeExpression(0);
						((AdditiveExpressionContext)_localctx).ret =  new BinaryExpression(((AdditiveExpressionContext)_localctx).l.ret, BinaryOperator.SUBTRACTION, ((AdditiveExpressionContext)_localctx).r.ret);
						}
						break;
					}
					} 
				}
				setState(3731);
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
		int _startState = 428;
		enterRecursionRule(_localctx, 428, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3733);
			((MultiplicativeExpressionContext)_localctx).ex = unaryExpression();
			((MultiplicativeExpressionContext)_localctx).ret =  ((MultiplicativeExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3753);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3751);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(3736);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(3737);
						match(MUL);
						setState(3738);
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
						setState(3741);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3742);
						match(DIV);
						setState(3743);
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
						setState(3746);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3747);
						match(MOD);
						setState(3748);
						((MultiplicativeExpressionContext)_localctx).r = unaryExpression();
						((MultiplicativeExpressionContext)_localctx).ret =  new BinaryExpression(((MultiplicativeExpressionContext)_localctx).l.ret, BinaryOperator.MODULUS, ((MultiplicativeExpressionContext)_localctx).r.ret);
						}
						break;
					}
					} 
				}
				setState(3755);
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
		enterRule(_localctx, 430, RULE_unaryExpression);
		try {
			setState(3773);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(3756);
				((UnaryExpressionContext)_localctx).pi = preIncrementExpression();
				((UnaryExpressionContext)_localctx).ret =  ((UnaryExpressionContext)_localctx).pi.ret;
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(3759);
				((UnaryExpressionContext)_localctx).pd = preDecrementExpression();
				((UnaryExpressionContext)_localctx).ret =  ((UnaryExpressionContext)_localctx).pd.ret;
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(3762);
				((UnaryExpressionContext)_localctx).first = match(ADD);
				setState(3763);
				((UnaryExpressionContext)_localctx).ex = unaryExpression();
				((UnaryExpressionContext)_localctx).ret =  new UnaryExpression(((UnaryExpressionContext)_localctx).first, ((UnaryExpressionContext)_localctx).ex.ret, UnaryOperator.PLUS);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(3766);
				((UnaryExpressionContext)_localctx).first = match(SUB);
				setState(3767);
				((UnaryExpressionContext)_localctx).ex = unaryExpression();
				((UnaryExpressionContext)_localctx).ret =  new UnaryExpression(((UnaryExpressionContext)_localctx).first, ((UnaryExpressionContext)_localctx).ex.ret, UnaryOperator.MINUS);
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
			case BadBooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case BadStringLiteral:
			case NullLiteral:
			case BadNullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(3770);
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
		enterRule(_localctx, 432, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3775);
			((PreIncrementExpressionContext)_localctx).first = match(INC);
			setState(3776);
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
		enterRule(_localctx, 434, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3779);
			((PreDecrementExpressionContext)_localctx).first = match(DEC);
			setState(3780);
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
		enterRule(_localctx, 436, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(3797);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3783);
				((UnaryExpressionNotPlusMinusContext)_localctx).pf = postfixExpression();
				((UnaryExpressionNotPlusMinusContext)_localctx).ret =  ((UnaryExpressionNotPlusMinusContext)_localctx).pf.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3786);
				((UnaryExpressionNotPlusMinusContext)_localctx).first = match(TILDE);
				setState(3787);
				((UnaryExpressionNotPlusMinusContext)_localctx).ex = unaryExpression();
				((UnaryExpressionNotPlusMinusContext)_localctx).ret =  new UnaryExpression(((UnaryExpressionNotPlusMinusContext)_localctx).first,
				                                    ((UnaryExpressionNotPlusMinusContext)_localctx).ex.ret,
				                                    UnaryOperator.BITWISE_NEGATION);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3790);
				((UnaryExpressionNotPlusMinusContext)_localctx).first = match(BANG);
				setState(3791);
				((UnaryExpressionNotPlusMinusContext)_localctx).ex = unaryExpression();
				((UnaryExpressionNotPlusMinusContext)_localctx).ret =  new UnaryExpression(((UnaryExpressionNotPlusMinusContext)_localctx).first, ((UnaryExpressionNotPlusMinusContext)_localctx).ex.ret, UnaryOperator.NEGATION);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3794);
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
		enterRule(_localctx, 438, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3805);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				{
				setState(3799);
				((PostfixExpressionContext)_localctx).p = primary();
				((PostfixExpressionContext)_localctx).ret =  ((PostfixExpressionContext)_localctx).p.ret;
				}
				break;
			case 2:
				{
				setState(3802);
				((PostfixExpressionContext)_localctx).n = expressionName();
				((PostfixExpressionContext)_localctx).ret =  ((PostfixExpressionContext)_localctx).n.ret;
				}
				break;
			}
			setState(3813);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(3811);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(3807);
						((PostfixExpressionContext)_localctx).op1 = match(INC);
						((PostfixExpressionContext)_localctx).ret =  new UnaryExpression(((PostfixExpressionContext)_localctx).op1, _localctx.ret, UnaryOperator.INCREMENT);
						}
						break;
					case DEC:
						{
						setState(3809);
						((PostfixExpressionContext)_localctx).op2 = match(DEC);
						((PostfixExpressionContext)_localctx).ret =  new UnaryExpression(((PostfixExpressionContext)_localctx).op2, _localctx.ret, UnaryOperator.DECREMENT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(3815);
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
		enterRule(_localctx, 440, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3816);
			((PostIncrementExpressionContext)_localctx).ex = postfixExpression();
			setState(3817);
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
		enterRule(_localctx, 442, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3820);
			((PostDecrementExpressionContext)_localctx).ex = postfixExpression();
			setState(3821);
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
		enterRule(_localctx, 444, RULE_castExpression);
		int _la;
		try {
			setState(3858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3824);
				((CastExpressionContext)_localctx).first = match(LPAREN);
				setState(3825);
				((CastExpressionContext)_localctx).pt = primitiveType();
				setState(3826);
				match(RPAREN);
				setState(3827);
				((CastExpressionContext)_localctx).uex = unaryExpression();
				((CastExpressionContext)_localctx).ret =  new CastExpression(((CastExpressionContext)_localctx).first, ((CastExpressionContext)_localctx).uex.ret, ((CastExpressionContext)_localctx).pt.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3830);
				((CastExpressionContext)_localctx).first = match(LPAREN);
				setState(3831);
				((CastExpressionContext)_localctx).rt = referenceType();
				setState(3837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(3832);
					((CastExpressionContext)_localctx).b = additionalBound();
					_localctx.ls.add(((CastExpressionContext)_localctx).b.ret);
					}
					}
					setState(3839);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3840);
				match(RPAREN);
				setState(3841);
				((CastExpressionContext)_localctx).npm = unaryExpressionNotPlusMinus();
				((CastExpressionContext)_localctx).ret =  new CastExpression(((CastExpressionContext)_localctx).first, ((CastExpressionContext)_localctx).npm.ret, ((CastExpressionContext)_localctx).rt.ret, _localctx.ls);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3844);
				((CastExpressionContext)_localctx).first = match(LPAREN);
				setState(3845);
				((CastExpressionContext)_localctx).rt = referenceType();
				setState(3851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(3846);
					((CastExpressionContext)_localctx).b = additionalBound();
					_localctx.ls.add(((CastExpressionContext)_localctx).b.ret);
					}
					}
					setState(3853);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3854);
				match(RPAREN);
				setState(3855);
				((CastExpressionContext)_localctx).lam = lambdaExpression();
				((CastExpressionContext)_localctx).ret =  new CastExpression(((CastExpressionContext)_localctx).first, ((CastExpressionContext)_localctx).lam.ret, ((CastExpressionContext)_localctx).rt.ret, _localctx.ls);
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
		case 205:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 206:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 207:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 208:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 209:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 210:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 211:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 212:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 213:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 214:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3p\u0f17\4\2\t\2\4"+
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
		"\t\u00df\4\u00e0\t\u00e0\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u01d3\n\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u01db"+
		"\n\3\3\4\3\4\3\4\7\4\u01e0\n\4\f\4\16\4\u01e3\13\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4\u01eb\n\4\f\4\16\4\u01ee\13\4\3\4\3\4\5\4\u01f2\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5\u01fa\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u0206\n\6\3\7\3\7\3\7\3\7\5\7\u020c\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u0217\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u021f\n\t\f\t\16\t"+
		"\u0222\13\t\3\n\3\n\3\n\7\n\u0227\n\n\f\n\16\n\u022a\13\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u0231\n\n\3\n\3\n\3\n\3\n\3\n\7\n\u0238\n\n\f\n\16\n\u023b"+
		"\13\n\3\n\3\n\3\n\3\n\3\n\5\n\u0242\n\n\5\n\u0244\n\n\3\13\3\13\3\13\7"+
		"\13\u0249\n\13\f\13\16\13\u024c\13\13\3\13\3\13\3\13\3\13\3\13\5\13\u0253"+
		"\n\13\3\f\3\f\3\f\7\f\u0258\n\f\f\f\16\f\u025b\13\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u026c\n\r\3\16\3\16\3\16"+
		"\7\16\u0271\n\16\f\16\16\16\u0274\13\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u027d\n\16\f\16\16\16\u0280\13\16\3\16\3\16\3\16\7\16\u0285"+
		"\n\16\f\16\16\16\u0288\13\16\3\16\3\16\3\17\3\17\3\17\7\17\u028f\n\17"+
		"\f\17\16\17\u0292\13\17\3\17\3\17\3\17\3\17\5\17\u0298\n\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21"+
		"\u02a9\n\21\f\21\16\21\u02ac\13\21\3\21\3\21\5\21\u02b0\n\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24"+
		"\u02c1\n\24\f\24\16\24\u02c4\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u02ce\n\25\3\26\3\26\3\26\7\26\u02d3\n\26\f\26\16\26\u02d6"+
		"\13\26\3\26\3\26\3\26\5\26\u02db\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\5\27\u02e5\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u02ee"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u02f8\n\31\f\31\16"+
		"\31\u02fb\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0304\n\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u030e\n\33\f\33\16\33\u0311\13"+
		"\33\3\34\3\34\3\34\5\34\u0316\n\34\3\34\3\34\3\34\7\34\u031b\n\34\f\34"+
		"\16\34\u031e\13\34\3\34\3\34\3\34\7\34\u0323\n\34\f\34\16\34\u0326\13"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\7\35\u032e\n\35\f\35\16\35\u0331\13"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u033a\n\35\f\35\16\35\u033d"+
		"\13\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u0351\n\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$"+
		"\3$\3$\3$\3$\3$\5$\u0376\n$\3%\3%\3%\3%\3%\3%\5%\u037e\n%\3&\3&\3&\3&"+
		"\3&\3&\7&\u0386\n&\f&\16&\u0389\13&\3&\3&\3&\3&\3&\3&\5&\u0391\n&\3&\3"+
		"&\3&\5&\u0396\n&\3&\3&\3&\5&\u039b\n&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u03ae\n\'\3(\3(\3(\3(\3(\3)\3)\3"+
		")\3)\3)\3)\3)\7)\u03bc\n)\f)\16)\u03bf\13)\3)\3)\3*\3*\3*\3*\3+\3+\3+"+
		"\3+\3,\3,\3,\3,\3,\3,\3,\7,\u03d2\n,\f,\16,\u03d5\13,\3,\3,\3-\3-\7-\u03db"+
		"\n-\f-\16-\u03de\13-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u03ed\n"+
		".\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u03fa\n/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\7\60\u0402\n\60\f\60\16\60\u0405\13\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\5\61\u041a\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0423\n\62\f"+
		"\62\16\62\u0426\13\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0430"+
		"\n\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\5\64\u0439\n\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0447\n\66\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\5\67\u044f\n\67\38\38\38\38\38\58\u0456\n8\39\39"+
		"\39\39\39\39\39\39\39\59\u0461\n9\3:\3:\3:\3:\3:\3:\3:\7:\u046a\n:\f:"+
		"\16:\u046d\13:\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0477\n;\3<\3<\3<\3<\3<\5<\u047e"+
		"\n<\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u048f\n>\3?\3?\3?"+
		"\3?\3?\3?\7?\u0497\n?\f?\16?\u049a\13?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u04b4\n@\3A\3A\3A\3A\3A\3"+
		"A\5A\u04bc\nA\3A\3A\3A\3A\3A\7A\u04c3\nA\fA\16A\u04c6\13A\3A\3A\3A\3A"+
		"\3A\3A\3A\5A\u04cf\nA\5A\u04d1\nA\3B\3B\3B\3B\3B\5B\u04d8\nB\3C\3C\3C"+
		"\3C\3C\3C\5C\u04e0\nC\3C\3C\3C\3C\5C\u04e6\nC\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\3D\3D\3D\3D\3D\3D\5D\u04f6\nD\3E\3E\3E\3E\3E\3E\3E\7E\u04ff\nE\fE\16"+
		"E\u0502\13E\3E\3E\3E\3E\3E\3E\3E\3E\3E\7E\u050d\nE\fE\16E\u0510\13E\3"+
		"E\3E\5E\u0514\nE\3F\3F\3F\3F\3F\3F\7F\u051c\nF\fF\16F\u051f\13F\3F\3F"+
		"\3F\3F\3G\3G\3G\3H\3H\3H\3H\3H\3H\7H\u052e\nH\fH\16H\u0531\13H\3H\3H\3"+
		"H\3H\7H\u0537\nH\fH\16H\u053a\13H\3H\3H\3H\3H\3H\3H\3H\5H\u0543\nH\3I"+
		"\3I\3I\7I\u0548\nI\fI\16I\u054b\13I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3K\3"+
		"K\3K\3K\3K\3K\3K\7K\u055e\nK\fK\16K\u0561\13K\3K\3K\3L\3L\3L\3L\3L\3L"+
		"\5L\u056b\nL\3M\3M\3M\3M\3M\5M\u0572\nM\3N\3N\3N\3O\3O\3O\3O\3P\3P\3P"+
		"\3P\3P\3P\7P\u0581\nP\fP\16P\u0584\13P\3P\3P\3P\3P\3P\3P\5P\u058c\nP\3"+
		"P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u0597\nQ\3R\3R\3R\5R\u059c\nR\3R\3R\3R\3"+
		"R\3R\3R\5R\u05a4\nR\3R\3R\3S\3S\3S\3S\3S\5S\u05ad\nS\3S\3S\3S\5S\u05b2"+
		"\nS\3S\3S\3S\3T\3T\3T\5T\u05ba\nT\3T\3T\3T\3T\3T\5T\u05c1\nT\3T\3T\3T"+
		"\3T\3T\3T\5T\u05c9\nT\3T\3T\3T\3T\3T\5T\u05d0\nT\3T\3T\3T\3T\3T\3T\3T"+
		"\3T\5T\u05da\nT\3T\3T\3T\3T\3T\5T\u05e1\nT\3T\3T\3T\3T\3T\3T\3T\3T\3T"+
		"\5T\u05ec\nT\3T\3T\3T\3T\3T\5T\u05f3\nT\3T\3T\3T\3T\5T\u05f9\nT\3U\3U"+
		"\3U\3U\3U\3U\7U\u0601\nU\fU\16U\u0604\13U\3U\3U\3U\3U\3U\5U\u060b\nU\3"+
		"U\3U\3U\3V\3V\5V\u0612\nV\3V\5V\u0615\nV\3V\5V\u0618\nV\3V\3V\3V\3W\3"+
		"W\3W\7W\u0620\nW\fW\16W\u0623\13W\3X\3X\3X\7X\u0628\nX\fX\16X\u062b\13"+
		"X\3X\3X\3X\3X\3X\5X\u0632\nX\3X\5X\u0635\nX\3X\3X\5X\u0639\nX\3Y\3Y\7"+
		"Y\u063d\nY\fY\16Y\u0640\13Y\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0648\nZ\3[\3[\3[\3["+
		"\3[\3[\7[\u0650\n[\f[\16[\u0653\13[\3[\3[\3[\3[\3[\3[\5[\u065b\n[\3[\3"+
		"[\3[\5[\u0660\n[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\5\\\u0671\n\\\3]\3]\3]\3]\3^\3^\7^\u0679\n^\f^\16^\u067c\13^\3^\3"+
		"^\3^\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u068c\n_\3`\3`\3`\3`\3`\3`\7"+
		"`\u0694\n`\f`\16`\u0697\13`\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a\5a\u06a4"+
		"\na\3b\3b\3b\3b\3b\3b\7b\u06ac\nb\fb\16b\u06af\13b\3b\3b\3b\3b\3b\3b\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u06c1\nc\3d\3d\3d\3d\3d\3d\7d\u06c9\n"+
		"d\fd\16d\u06cc\13d\3d\3d\3d\3d\3d\3d\3e\3e\7e\u06d6\ne\fe\16e\u06d9\13"+
		"e\3e\3e\3e\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u06e9\nf\3g\3g\3g\3g\3"+
		"g\3g\7g\u06f1\ng\fg\16g\u06f4\13g\3g\3g\3g\3g\3g\3g\3g\3g\5g\u06fe\ng"+
		"\3g\3g\3g\5g\u0703\ng\3g\3g\3g\3h\3h\3h\3h\5h\u070c\nh\3i\3i\3i\3i\3j"+
		"\3j\3j\3j\3j\3j\3j\3j\3j\5j\u071b\nj\3k\3k\3k\3k\3k\5k\u0722\nk\3k\3k"+
		"\3k\3l\3l\3l\7l\u072a\nl\fl\16l\u072d\13l\3m\3m\3m\3m\3m\3n\3n\3n\3n\3"+
		"n\3n\3n\3n\3n\5n\u073d\nn\3o\3o\3o\3o\5o\u0743\no\3o\5o\u0746\no\3o\3"+
		"o\3o\3p\3p\3p\3p\3p\3p\3p\7p\u0752\np\fp\16p\u0755\13p\3p\3p\3q\3q\3q"+
		"\3q\3r\3r\3r\3r\3r\3r\3r\3s\3s\3s\3s\5s\u0768\ns\3s\5s\u076b\ns\3s\3s"+
		"\3s\3s\3s\3s\5s\u0773\ns\3s\5s\u0776\ns\3s\3s\5s\u077a\ns\3t\3t\3t\3t"+
		"\3t\3t\3t\7t\u0783\nt\ft\16t\u0786\13t\3t\3t\3u\3u\3u\3u\3u\5u\u078f\n"+
		"u\3u\3u\3u\3v\3v\3v\3v\3v\3v\7v\u079a\nv\fv\16v\u079d\13v\3v\3v\3w\3w"+
		"\3w\3w\3w\3w\3w\3w\3w\5w\u07aa\nw\3x\3x\3x\3x\3y\3y\3y\3y\3y\3y\7y\u07b6"+
		"\ny\fy\16y\u07b9\13y\3y\3y\3y\3y\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3"+
		"z\3z\3z\3z\3z\3z\5z\u07d1\nz\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3"+
		"{\3{\5{\u07e2\n{\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3"+
		"|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\5|\u0808\n|\3"+
		"}\3}\3}\3~\3~\3~\3~\3~\3\177\3\177\3\177\3\177\3\177\3\u0080\3\u0080\3"+
		"\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u0830\n\u0081\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\5\u0085\u0857\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087\7\u0087\u0864\n\u0087\f\u0087"+
		"\16\u0087\u0867\13\u0087\3\u0087\3\u0087\3\u0087\7\u0087\u086c\n\u0087"+
		"\f\u0087\16\u0087\u086f\13\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\7\u0089\u087f\n\u0089\f\u0089\16\u0089\u0882\13\u0089\3\u0089\3\u0089"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\5\u008a\u0892\n\u008a\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e"+
		"\u08b1\n\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f"+
		"\u08b9\n\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u08c0\n"+
		"\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u08c6\n\u0090\3\u0090\3"+
		"\u0090\3\u0090\3\u0090\5\u0090\u08cc\n\u0090\3\u0090\3\u0090\3\u0090\3"+
		"\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u08d7\n\u0091\3"+
		"\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u08dd\n\u0091\3\u0091\3\u0091\3"+
		"\u0091\3\u0091\5\u0091\u08e3\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3"+
		"\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u08ef\n\u0092\3"+
		"\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\7\u0094\u08fb\n\u0094\f\u0094\16\u0094\u08fe\13\u0094\3\u0094"+
		"\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\7\u0095\u090a\n\u0095\f\u0095\16\u0095\u090d\13\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\7\u0096\u091e\n\u0096\f\u0096\16\u0096"+
		"\u0921\13\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0097\3\u0097\3\u0097\5\u0097\u092d\n\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0098\3\u0098\3\u0098\5\u0098\u0935\n\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099"+
		"\u0942\n\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u095a\n\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u0962\n\u009c"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\7\u009d\u0969\n\u009d\f\u009d"+
		"\16\u009d\u096c\13\u009d\3\u009d\3\u009d\3\u009e\3\u009e\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\7\u009f\u097e\n\u009f\f\u009f\16\u009f\u0981\13\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\7\u00a0\u098e\n\u00a0\f\u00a0\16\u00a0\u0991\13\u00a0\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\5\u00a2\u099d\n\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u09a2\n\u00a2\3"+
		"\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u09aa\n\u00a3\3"+
		"\u00a3\3\u00a3\5\u00a3\u09ae\n\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3"+
		"\u00a4\3\u00a4\3\u00a4\3\u00a4\7\u00a4\u09b8\n\u00a4\f\u00a4\16\u00a4"+
		"\u09bb\13\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\7\u00a5\u09c5\n\u00a5\f\u00a5\16\u00a5\u09c8\13\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a6\5\u00a6\u09d5\n\u00a6\3\u00a6\3\u00a6\3\u00a6\7\u00a6\u09da\n"+
		"\u00a6\f\u00a6\16\u00a6\u09dd\13\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u09fb\n\u00a7"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a8\7\u00a8\u0a01\n\u00a8\f\u00a8\16\u00a8"+
		"\u0a04\13\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a8\7\u00a8\u0a0f\n\u00a8\f\u00a8\16\u00a8\u0a12\13\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u0a21\n\u00a8\3\u00a9\3\u00a9"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u0a3e"+
		"\n\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u0a4f"+
		"\n\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u0a5d\n\u00ac\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\7\u00ad"+
		"\u0a69\n\u00ad\f\u00ad\16\u00ad\u0a6c\13\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u0a88\n\u00ad\3\u00ae"+
		"\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\7\u00af\u0a96\n\u00af\f\u00af\16\u00af\u0a99\13\u00af"+
		"\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\5\u00af\u0ab2\n\u00af\3\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0ab8\n\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\7\u00b0\u0abd\n\u00b0\f\u00b0\16\u00b0\u0ac0\13\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b0\3\u00b0\7\u00b0\u0ac8\n\u00b0\f\u00b0\16\u00b0"+
		"\u0acb\13\u00b0\3\u00b0\3\u00b0\7\u00b0\u0acf\n\u00b0\f\u00b0\16\u00b0"+
		"\u0ad2\13\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0ad7\n\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0add\n\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\5\u00b0\u0ae2\n\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\5\u00b0\u0aea\n\u00b0\3\u00b0\3\u00b0\3\u00b0\7\u00b0\u0aef\n\u00b0\f"+
		"\u00b0\16\u00b0\u0af2\13\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\5\u00b0\u0af9\n\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0aff\n"+
		"\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0b04\n\u00b0\3\u00b0\3\u00b0\3"+
		"\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0b0c\n\u00b0\3\u00b0\3\u00b0\3"+
		"\u00b0\7\u00b0\u0b11\n\u00b0\f\u00b0\16\u00b0\u0b14\13\u00b0\3\u00b0\3"+
		"\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0b1b\n\u00b0\3\u00b0\3\u00b0\3"+
		"\u00b0\3\u00b0\5\u00b0\u0b21\n\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0b26"+
		"\n\u00b0\5\u00b0\u0b28\n\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1"+
		"\5\u00b1\u0b2f\n\u00b1\3\u00b1\3\u00b1\3\u00b1\7\u00b1\u0b34\n\u00b1\f"+
		"\u00b1\16\u00b1\u0b37\13\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1"+
		"\5\u00b1\u0b3e\n\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u0b44\n"+
		"\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u0b49\n\u00b1\3\u00b2\3\u00b2\3"+
		"\u00b2\3\u00b2\5\u00b2\u0b4f\n\u00b2\3\u00b2\3\u00b2\3\u00b2\7\u00b2\u0b54"+
		"\n\u00b2\f\u00b2\16\u00b2\u0b57\13\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\7\u00b2\u0b5f\n\u00b2\f\u00b2\16\u00b2\u0b62\13\u00b2"+
		"\3\u00b2\3\u00b2\7\u00b2\u0b66\n\u00b2\f\u00b2\16\u00b2\u0b69\13\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u0b6e\n\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\5\u00b2\u0b74\n\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u0b79\n"+
		"\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u0b81\n"+
		"\u00b2\3\u00b2\3\u00b2\3\u00b2\7\u00b2\u0b86\n\u00b2\f\u00b2\16\u00b2"+
		"\u0b89\13\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u0b90"+
		"\n\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u0b96\n\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\5\u00b2\u0b9b\n\u00b2\5\u00b2\u0b9d\n\u00b2\3\u00b3\3"+
		"\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u0ba5\n\u00b3\3\u00b4\3"+
		"\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u0bb7\n\u00b4"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u0bc8\n\u00b6"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0bd6\n\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\7\u00b7\u0bde\n\u00b7\f\u00b7\16\u00b7\u0be1"+
		"\13\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\7\u00b8\u0bee\n\u00b8\f\u00b8\16\u00b8\u0bf1"+
		"\13\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u0bff\n\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\7\u00b9\u0c07\n\u00b9\f\u00b9\16\u00b9"+
		"\u0c0a\13\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0c11"+
		"\n\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba"+
		"\u0c1a\n\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0c21\n"+
		"\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\5\u00ba\u0c2b\n\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba"+
		"\u0c32\n\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\5\u00ba\u0c3c\n\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\5\u00ba\u0c43\n\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0c4e\n\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\5\u00ba\u0c55\n\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba"+
		"\u0c5a\n\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u0c60\n\u00bb\3"+
		"\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u0c67\n\u00bb\3\u00bb\3"+
		"\u00bb\3\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u0c71\n"+
		"\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc"+
		"\u0c7a\n\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u0c81\n"+
		"\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\5\u00bc\u0c8b\n\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc"+
		"\u0c92\n\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\5\u00bc\u0c9d\n\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\5\u00bc\u0ca4\n\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u0ca9\n"+
		"\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\7\u00bd"+
		"\u0cb2\n\u00bd\f\u00bd\16\u00bd\u0cb5\13\u00bd\3\u00bd\3\u00bd\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0cbe\n\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0cc8\n\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be"+
		"\u0cd2\n\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\5\u00be\u0cdc\n\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0ce7\n\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0cf1\n\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be"+
		"\u0cfb\n\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u0d01\n\u00bf\3"+
		"\u00bf\3\u00bf\3\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0"+
		"\u0d0b\n\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\5\u00c0\u0d15\n\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u0d1f\n\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u0d2a\n\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0"+
		"\u0d34\n\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\5\u00c0\u0d3e\n\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\5\u00c1\u0d46\n\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u0d50\n\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\5\u00c1\u0d60\n\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c2\7\u00c2\u0d67\n\u00c2\f\u00c2\16\u00c2\u0d6a\13\u00c2\3\u00c3"+
		"\3\u00c3\3\u00c3\7\u00c3\u0d6f\n\u00c3\f\u00c3\16\u00c3\u0d72\13\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u0d82\n\u00c5\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\5\u00c7\u0d8f\n\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\5\u00c7\u0d98\n\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\7\u00c8\u0da0\n\u00c8\f\u00c8\16\u00c8\u0da3\13\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9"+
		"\u0dad\n\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca"+
		"\u0db5\n\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u0dc5"+
		"\n\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0ddf"+
		"\n\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\5\u00ce\u0deb\n\u00ce\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\7\u00cf\u0df6\n\u00cf\f\u00cf"+
		"\16\u00cf\u0df9\13\u00cf\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\7\u00d0\u0e04\n\u00d0\f\u00d0\16\u00d0\u0e07"+
		"\13\u00d0\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1"+
		"\3\u00d1\7\u00d1\u0e12\n\u00d1\f\u00d1\16\u00d1\u0e15\13\u00d1\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\7\u00d2"+
		"\u0e20\n\u00d2\f\u00d2\16\u00d2\u0e23\13\u00d2\3\u00d3\3\u00d3\3\u00d3"+
		"\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\7\u00d3\u0e2e\n\u00d3"+
		"\f\u00d3\16\u00d3\u0e31\13\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4"+
		"\7\u00d4\u0e41\n\u00d4\f\u00d4\16\u00d4\u0e44\13\u00d4\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5"+
		"\7\u00d5\u0e63\n\u00d5\f\u00d5\16\u00d5\u0e66\13\u00d5\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\7\u00d6\u0e7f\n\u00d6\f\u00d6\16\u00d6\u0e82"+
		"\13\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7"+
		"\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\7\u00d7\u0e92\n\u00d7"+
		"\f\u00d7\16\u00d7\u0e95\13\u00d7\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\7\u00d8\u0eaa\n\u00d8\f\u00d8"+
		"\16\u00d8\u0ead\13\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\5\u00d9\u0ec0\n\u00d9\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\3\u00db\3\u00db\3\u00db\3\u00db\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc"+
		"\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc"+
		"\5\u00dc\u0ed8\n\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\5\u00dd\u0ee0\n\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\7\u00dd\u0ee6\n"+
		"\u00dd\f\u00dd\16\u00dd\u0ee9\13\u00dd\3\u00de\3\u00de\3\u00de\3\u00de"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\7\u00e0\u0efe\n\u00e0"+
		"\f\u00e0\16\u00e0\u0f01\13\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\3\u00e0\7\u00e0\u0f0c\n\u00e0\f\u00e0\16\u00e0"+
		"\u0f0f\13\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\5\u00e0\u0f15\n\u00e0"+
		"\3\u00e0\2\16\60\64\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac"+
		"\u01ae\u00e1\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100"+
		"\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118"+
		"\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130"+
		"\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148"+
		"\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160"+
		"\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178"+
		"\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190"+
		"\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8"+
		"\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\2\2"+
		"\u1020\2\u01d2\3\2\2\2\4\u01da\3\2\2\2\6\u01f1\3\2\2\2\b\u01f9\3\2\2\2"+
		"\n\u0205\3\2\2\2\f\u020b\3\2\2\2\16\u0216\3\2\2\2\20\u0218\3\2\2\2\22"+
		"\u0243\3\2\2\2\24\u024a\3\2\2\2\26\u0259\3\2\2\2\30\u026b\3\2\2\2\32\u0272"+
		"\3\2\2\2\34\u0290\3\2\2\2\36\u029b\3\2\2\2 \u02af\3\2\2\2\"\u02b1\3\2"+
		"\2\2$\u02b5\3\2\2\2&\u02ba\3\2\2\2(\u02cd\3\2\2\2*\u02d4\3\2\2\2,\u02e4"+
		"\3\2\2\2.\u02ed\3\2\2\2\60\u02ef\3\2\2\2\62\u0303\3\2\2\2\64\u0305\3\2"+
		"\2\2\66\u0315\3\2\2\28\u032f\3\2\2\2:\u0341\3\2\2\2<\u0350\3\2\2\2>\u0352"+
		"\3\2\2\2@\u0357\3\2\2\2B\u035e\3\2\2\2D\u0366\3\2\2\2F\u0375\3\2\2\2H"+
		"\u037d\3\2\2\2J\u0387\3\2\2\2L\u03ad\3\2\2\2N\u03af\3\2\2\2P\u03b4\3\2"+
		"\2\2R\u03c2\3\2\2\2T\u03c6\3\2\2\2V\u03ca\3\2\2\2X\u03d8\3\2\2\2Z\u03ec"+
		"\3\2\2\2\\\u03f9\3\2\2\2^\u0403\3\2\2\2`\u0419\3\2\2\2b\u041b\3\2\2\2"+
		"d\u0429\3\2\2\2f\u0433\3\2\2\2h\u043c\3\2\2\2j\u0446\3\2\2\2l\u044e\3"+
		"\2\2\2n\u0455\3\2\2\2p\u0460\3\2\2\2r\u0462\3\2\2\2t\u0476\3\2\2\2v\u0478"+
		"\3\2\2\2x\u047f\3\2\2\2z\u048e\3\2\2\2|\u0498\3\2\2\2~\u04b3\3\2\2\2\u0080"+
		"\u04d0\3\2\2\2\u0082\u04d7\3\2\2\2\u0084\u04d9\3\2\2\2\u0086\u04f5\3\2"+
		"\2\2\u0088\u0513\3\2\2\2\u008a\u051d\3\2\2\2\u008c\u0524\3\2\2\2\u008e"+
		"\u0542\3\2\2\2\u0090\u0549\3\2\2\2\u0092\u0552\3\2\2\2\u0094\u0556\3\2"+
		"\2\2\u0096\u056a\3\2\2\2\u0098\u0571\3\2\2\2\u009a\u0573\3\2\2\2\u009c"+
		"\u0576\3\2\2\2\u009e\u0582\3\2\2\2\u00a0\u0596\3\2\2\2\u00a2\u059b\3\2"+
		"\2\2\u00a4\u05a7\3\2\2\2\u00a6\u05f8\3\2\2\2\u00a8\u0602\3\2\2\2\u00aa"+
		"\u060f\3\2\2\2\u00ac\u061c\3\2\2\2\u00ae\u0629\3\2\2\2\u00b0\u063a\3\2"+
		"\2\2\u00b2\u0647\3\2\2\2\u00b4\u0651\3\2\2\2\u00b6\u0670\3\2\2\2\u00b8"+
		"\u0672\3\2\2\2\u00ba\u0676\3\2\2\2\u00bc\u068b\3\2\2\2\u00be\u0695\3\2"+
		"\2\2\u00c0\u06a3\3\2\2\2\u00c2\u06ad\3\2\2\2\u00c4\u06c0\3\2\2\2\u00c6"+
		"\u06ca\3\2\2\2\u00c8\u06d3\3\2\2\2\u00ca\u06e8\3\2\2\2\u00cc\u06f2\3\2"+
		"\2\2\u00ce\u070b\3\2\2\2\u00d0\u070d\3\2\2\2\u00d2\u071a\3\2\2\2\u00d4"+
		"\u071c\3\2\2\2\u00d6\u0726\3\2\2\2\u00d8\u072e\3\2\2\2\u00da\u073c\3\2"+
		"\2\2\u00dc\u073e\3\2\2\2\u00de\u074a\3\2\2\2\u00e0\u0758\3\2\2\2\u00e2"+
		"\u075c\3\2\2\2\u00e4\u0779\3\2\2\2\u00e6\u077b\3\2\2\2\u00e8\u0789\3\2"+
		"\2\2\u00ea\u0793\3\2\2\2\u00ec\u07a9\3\2\2\2\u00ee\u07ab\3\2\2\2\u00f0"+
		"\u07b7\3\2\2\2\u00f2\u07d0\3\2\2\2\u00f4\u07e1\3\2\2\2\u00f6\u0807\3\2"+
		"\2\2\u00f8\u0809\3\2\2\2\u00fa\u080c\3\2\2\2\u00fc\u0811\3\2\2\2\u00fe"+
		"\u0816\3\2\2\2\u0100\u082f\3\2\2\2\u0102\u0831\3\2\2\2\u0104\u0838\3\2"+
		"\2\2\u0106\u0841\3\2\2\2\u0108\u0856\3\2\2\2\u010a\u0858\3\2\2\2\u010c"+
		"\u085f\3\2\2\2\u010e\u0874\3\2\2\2\u0110\u0878\3\2\2\2\u0112\u0891\3\2"+
		"\2\2\u0114\u0893\3\2\2\2\u0116\u089a\3\2\2\2\u0118\u08a1\3\2\2\2\u011a"+
		"\u08b0\3\2\2\2\u011c\u08b8\3\2\2\2\u011e\u08ba\3\2\2\2\u0120\u08d1\3\2"+
		"\2\2\u0122\u08ee\3\2\2\2\u0124\u08f0\3\2\2\2\u0126\u08f3\3\2\2\2\u0128"+
		"\u0901\3\2\2\2\u012a\u0915\3\2\2\2\u012c\u0929\3\2\2\2\u012e\u0931\3\2"+
		"\2\2\u0130\u0941\3\2\2\2\u0132\u0943\3\2\2\2\u0134\u0948\3\2\2\2\u0136"+
		"\u0961\3\2\2\2\u0138\u0963\3\2\2\2\u013a\u096f\3\2\2\2\u013c\u097f\3\2"+
		"\2\2\u013e\u0986\3\2\2\2\u0140\u0992\3\2\2\2\u0142\u0996\3\2\2\2\u0144"+
		"\u09a5\3\2\2\2\u0146\u09b1\3\2\2\2\u0148\u09c6\3\2\2\2\u014a\u09d4\3\2"+
		"\2\2\u014c\u09fa\3\2\2\2\u014e\u0a20\3\2\2\2\u0150\u0a22\3\2\2\2\u0152"+
		"\u0a3d\3\2\2\2\u0154\u0a4e\3\2\2\2\u0156\u0a5c\3\2\2\2\u0158\u0a87\3\2"+
		"\2\2\u015a\u0a89\3\2\2\2\u015c\u0ab1\3\2\2\2\u015e\u0b27\3\2\2\2\u0160"+
		"\u0b29\3\2\2\2\u0162\u0b9c\3\2\2\2\u0164\u0ba4\3\2\2\2\u0166\u0bb6\3\2"+
		"\2\2\u0168\u0bb8\3\2\2\2\u016a\u0bc7\3\2\2\2\u016c\u0bd5\3\2\2\2\u016e"+
		"\u0be2\3\2\2\2\u0170\u0bfe\3\2\2\2\u0172\u0c59\3\2\2\2\u0174\u0c5b\3\2"+
		"\2\2\u0176\u0ca8\3\2\2\2\u0178\u0caa\3\2\2\2\u017a\u0cfa\3\2\2\2\u017c"+
		"\u0cfc\3\2\2\2\u017e\u0d3d\3\2\2\2\u0180\u0d5f\3\2\2\2\u0182\u0d61\3\2"+
		"\2\2\u0184\u0d70\3\2\2\2\u0186\u0d78\3\2\2\2\u0188\u0d81\3\2\2\2\u018a"+
		"\u0d83\3\2\2\2\u018c\u0d97\3\2\2\2\u018e\u0d99\3\2\2\2\u0190\u0dac\3\2"+
		"\2\2\u0192\u0db4\3\2\2\2\u0194\u0db6\3\2\2\2\u0196\u0dc4\3\2\2\2\u0198"+
		"\u0dde\3\2\2\2\u019a\u0dea\3\2\2\2\u019c\u0dec\3\2\2\2\u019e\u0dfa\3\2"+
		"\2\2\u01a0\u0e08\3\2\2\2\u01a2\u0e16\3\2\2\2\u01a4\u0e24\3\2\2\2\u01a6"+
		"\u0e32\3\2\2\2\u01a8\u0e45\3\2\2\2\u01aa\u0e67\3\2\2\2\u01ac\u0e83\3\2"+
		"\2\2\u01ae\u0e96\3\2\2\2\u01b0\u0ebf\3\2\2\2\u01b2\u0ec1\3\2\2\2\u01b4"+
		"\u0ec5\3\2\2\2\u01b6\u0ed7\3\2\2\2\u01b8\u0edf\3\2\2\2\u01ba\u0eea\3\2"+
		"\2\2\u01bc\u0eee\3\2\2\2\u01be\u0f14\3\2\2\2\u01c0\u01c1\7\65\2\2\u01c1"+
		"\u01d3\b\2\1\2\u01c2\u01c3\7\66\2\2\u01c3\u01d3\b\2\1\2\u01c4\u01c5\7"+
		"\67\2\2\u01c5\u01d3\b\2\1\2\u01c6\u01c7\79\2\2\u01c7\u01d3\b\2\1\2\u01c8"+
		"\u01c9\7:\2\2\u01c9\u01d3\b\2\1\2\u01ca\u01cb\7<\2\2\u01cb\u01d3\b\2\1"+
		"\2\u01cc\u01cd\7;\2\2\u01cd\u01d3\b\2\1\2\u01ce\u01cf\78\2\2\u01cf\u01d3"+
		"\b\2\1\2\u01d0\u01d1\7=\2\2\u01d1\u01d3\b\2\1\2\u01d2\u01c0\3\2\2\2\u01d2"+
		"\u01c2\3\2\2\2\u01d2\u01c4\3\2\2\2\u01d2\u01c6\3\2\2\2\u01d2\u01c8\3\2"+
		"\2\2\u01d2\u01ca\3\2\2\2\u01d2\u01cc\3\2\2\2\u01d2\u01ce\3\2\2\2\u01d2"+
		"\u01d0\3\2\2\2\u01d3\3\3\2\2\2\u01d4\u01d5\5\6\4\2\u01d5\u01d6\b\3\1\2"+
		"\u01d6\u01db\3\2\2\2\u01d7\u01d8\5\16\b\2\u01d8\u01d9\b\3\1\2\u01d9\u01db"+
		"\3\2\2\2\u01da\u01d4\3\2\2\2\u01da\u01d7\3\2\2\2\u01db\5\3\2\2\2\u01dc"+
		"\u01dd\5\u00d2j\2\u01dd\u01de\b\4\1\2\u01de\u01e0\3\2\2\2\u01df\u01dc"+
		"\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u01e4\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e5\5\b\5\2\u01e5\u01e6\b\4"+
		"\1\2\u01e6\u01f2\3\2\2\2\u01e7\u01e8\5\u00d2j\2\u01e8\u01e9\b\4\1\2\u01e9"+
		"\u01eb\3\2\2\2\u01ea\u01e7\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2"+
		"\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef"+
		"\u01f0\7\5\2\2\u01f0\u01f2\b\4\1\2\u01f1\u01e1\3\2\2\2\u01f1\u01ec\3\2"+
		"\2\2\u01f2\7\3\2\2\2\u01f3\u01f4\5\n\6\2\u01f4\u01f5\b\5\1\2\u01f5\u01fa"+
		"\3\2\2\2\u01f6\u01f7\5\f\7\2\u01f7\u01f8\b\5\1\2\u01f8\u01fa\3\2\2\2\u01f9"+
		"\u01f3\3\2\2\2\u01f9\u01f6\3\2\2\2\u01fa\t\3\2\2\2\u01fb\u01fc\7\7\2\2"+
		"\u01fc\u0206\b\6\1\2\u01fd\u01fe\7\'\2\2\u01fe\u0206\b\6\1\2\u01ff\u0200"+
		"\7\35\2\2\u0200\u0206\b\6\1\2\u0201\u0202\7\37\2\2\u0202\u0206\b\6\1\2"+
		"\u0203\u0204\7\n\2\2\u0204\u0206\b\6\1\2\u0205\u01fb\3\2\2\2\u0205\u01fd"+
		"\3\2\2\2\u0205\u01ff\3\2\2\2\u0205\u0201\3\2\2\2\u0205\u0203\3\2\2\2\u0206"+
		"\13\3\2\2\2\u0207\u0208\7\26\2\2\u0208\u020c\b\7\1\2\u0209\u020a\7\20"+
		"\2\2\u020a\u020c\b\7\1\2\u020b\u0207\3\2\2\2\u020b\u0209\3\2\2\2\u020c"+
		"\r\3\2\2\2\u020d\u020e\5\20\t\2\u020e\u020f\b\b\1\2\u020f\u0217\3\2\2"+
		"\2\u0210\u0211\5\26\f\2\u0211\u0212\b\b\1\2\u0212\u0217\3\2\2\2\u0213"+
		"\u0214\5\30\r\2\u0214\u0215\b\b\1\2\u0215\u0217\3\2\2\2\u0216\u020d\3"+
		"\2\2\2\u0216\u0210\3\2\2\2\u0216\u0213\3\2\2\2\u0217\17\3\2\2\2\u0218"+
		"\u0219\5\24\13\2\u0219\u0220\b\t\1\2\u021a\u021b\7F\2\2\u021b\u021c\5"+
		"\24\13\2\u021c\u021d\b\t\1\2\u021d\u021f\3\2\2\2\u021e\u021a\3\2\2\2\u021f"+
		"\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221\21\3\2\2"+
		"\2\u0222\u0220\3\2\2\2\u0223\u0224\5\u00d2j\2\u0224\u0225\b\n\1\2\u0225"+
		"\u0227\3\2\2\2\u0226\u0223\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2"+
		"\2\2\u0228\u0229\3\2\2\2\u0229\u022b\3\2\2\2\u022a\u0228\3\2\2\2\u022b"+
		"\u022c\7k\2\2\u022c\u0230\b\n\1\2\u022d\u022e\5$\23\2\u022e\u022f\b\n"+
		"\1\2\u022f\u0231\3\2\2\2\u0230\u022d\3\2\2\2\u0230\u0231\3\2\2\2\u0231"+
		"\u0244\3\2\2\2\u0232\u0233\5\20\t\2\u0233\u0239\7F\2\2\u0234\u0235\5\u00d2"+
		"j\2\u0235\u0236\b\n\1\2\u0236\u0238\3\2\2\2\u0237\u0234\3\2\2\2\u0238"+
		"\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023c\3\2"+
		"\2\2\u023b\u0239\3\2\2\2\u023c\u023d\7k\2\2\u023d\u0241\b\n\1\2\u023e"+
		"\u023f\5$\23\2\u023f\u0240\b\n\1\2\u0240\u0242\3\2\2\2\u0241\u023e\3\2"+
		"\2\2\u0241\u0242\3\2\2\2\u0242\u0244\3\2\2\2\u0243\u0228\3\2\2\2\u0243"+
		"\u0232\3\2\2\2\u0244\23\3\2\2\2\u0245\u0246\5\u00d2j\2\u0246\u0247\b\13"+
		"\1\2\u0247\u0249\3\2\2\2\u0248\u0245\3\2\2\2\u0249\u024c\3\2\2\2\u024a"+
		"\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024d\3\2\2\2\u024c\u024a\3\2"+
		"\2\2\u024d\u024e\7k\2\2\u024e\u0252\b\13\1\2\u024f\u0250\5$\23\2\u0250"+
		"\u0251\b\13\1\2\u0251\u0253\3\2\2\2\u0252\u024f\3\2\2\2\u0252\u0253\3"+
		"\2\2\2\u0253\25\3\2\2\2\u0254\u0255\5\u00d2j\2\u0255\u0256\b\f\1\2\u0256"+
		"\u0258\3\2\2\2\u0257\u0254\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2"+
		"\2\2\u0259\u025a\3\2\2\2\u025a\u025c\3\2\2\2\u025b\u0259\3\2\2\2\u025c"+
		"\u025d\7k\2\2\u025d\u025e\b\f\1\2\u025e\27\3\2\2\2\u025f\u0260\5\6\4\2"+
		"\u0260\u0261\5\32\16\2\u0261\u0262\b\r\1\2\u0262\u026c\3\2\2\2\u0263\u0264"+
		"\5\20\t\2\u0264\u0265\5\32\16\2\u0265\u0266\b\r\1\2\u0266\u026c\3\2\2"+
		"\2\u0267\u0268\5\26\f\2\u0268\u0269\5\32\16\2\u0269\u026a\b\r\1\2\u026a"+
		"\u026c\3\2\2\2\u026b\u025f\3\2\2\2\u026b\u0263\3\2\2\2\u026b\u0267\3\2"+
		"\2\2\u026c\31\3\2\2\2\u026d\u026e\5\u00d2j\2\u026e\u026f\b\16\1\2\u026f"+
		"\u0271\3\2\2\2\u0270\u026d\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2"+
		"\2\2\u0272\u0273\3\2\2\2\u0273\u0275\3\2\2\2\u0274\u0272\3\2\2\2\u0275"+
		"\u0276\7B\2\2\u0276\u0277\7C\2\2\u0277\u0286\b\16\1\2\u0278\u027e\b\16"+
		"\1\2\u0279\u027a\5\u00d2j\2\u027a\u027b\b\16\1\2\u027b\u027d\3\2\2\2\u027c"+
		"\u0279\3\2\2\2\u027d\u0280\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2"+
		"\2\2\u027f\u0281\3\2\2\2\u0280\u027e\3\2\2\2\u0281\u0282\7B\2\2\u0282"+
		"\u0283\7C\2\2\u0283\u0285\b\16\1\2\u0284\u0278\3\2\2\2\u0285\u0288\3\2"+
		"\2\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0289\3\2\2\2\u0288"+
		"\u0286\3\2\2\2\u0289\u028a\b\16\1\2\u028a\33\3\2\2\2\u028b\u028c\5\36"+
		"\20\2\u028c\u028d\b\17\1\2\u028d\u028f\3\2\2\2\u028e\u028b\3\2\2\2\u028f"+
		"\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0293\3\2"+
		"\2\2\u0292\u0290\3\2\2\2\u0293\u0297\7k\2\2\u0294\u0295\5 \21\2\u0295"+
		"\u0296\b\17\1\2\u0296\u0298\3\2\2\2\u0297\u0294\3\2\2\2\u0297\u0298\3"+
		"\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a\b\17\1\2\u029a\35\3\2\2\2\u029b"+
		"\u029c\5\u00d2j\2\u029c\u029d\b\20\1\2\u029d\37\3\2\2\2\u029e\u029f\7"+
		"\23\2\2\u029f\u02a0\5\26\f\2\u02a0\u02a1\b\21\1\2\u02a1\u02b0\3\2\2\2"+
		"\u02a2\u02a3\7\23\2\2\u02a3\u02a4\5\20\t\2\u02a4\u02aa\b\21\1\2\u02a5"+
		"\u02a6\5\"\22\2\u02a6\u02a7\b\21\1\2\u02a7\u02a9\3\2\2\2\u02a8\u02a5\3"+
		"\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab"+
		"\u02ad\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02ae\b\21\1\2\u02ae\u02b0\3"+
		"\2\2\2\u02af\u029e\3\2\2\2\u02af\u02a2\3\2\2\2\u02b0!\3\2\2\2\u02b1\u02b2"+
		"\7Z\2\2\u02b2\u02b3\5\22\n\2\u02b3\u02b4\b\22\1\2\u02b4#\3\2\2\2\u02b5"+
		"\u02b6\7I\2\2\u02b6\u02b7\5&\24\2\u02b7\u02b8\7H\2\2\u02b8\u02b9\b\23"+
		"\1\2\u02b9%\3\2\2\2\u02ba\u02bb\5(\25\2\u02bb\u02c2\b\24\1\2\u02bc\u02bd"+
		"\7E\2\2\u02bd\u02be\5(\25\2\u02be\u02bf\b\24\1\2\u02bf\u02c1\3\2\2\2\u02c0"+
		"\u02bc\3\2\2\2\u02c1\u02c4\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c3\3\2"+
		"\2\2\u02c3\u02c5\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c5\u02c6\b\24\1\2\u02c6"+
		"\'\3\2\2\2\u02c7\u02c8\5\16\b\2\u02c8\u02c9\b\25\1\2\u02c9\u02ce\3\2\2"+
		"\2\u02ca\u02cb\5*\26\2\u02cb\u02cc\b\25\1\2\u02cc\u02ce\3\2\2\2\u02cd"+
		"\u02c7\3\2\2\2\u02cd\u02ca\3\2\2\2\u02ce)\3\2\2\2\u02cf\u02d0\5\u00d2"+
		"j\2\u02d0\u02d1\b\26\1\2\u02d1\u02d3\3\2\2\2\u02d2\u02cf\3\2\2\2\u02d3"+
		"\u02d6\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d7\3\2"+
		"\2\2\u02d6\u02d4\3\2\2\2\u02d7\u02d8\7L\2\2\u02d8\u02da\b\26\1\2\u02d9"+
		"\u02db\5,\27\2\u02da\u02d9\3\2\2\2\u02da\u02db\3\2\2\2\u02db+\3\2\2\2"+
		"\u02dc\u02dd\7\23\2\2\u02dd\u02de\5\16\b\2\u02de\u02df\b\27\1\2\u02df"+
		"\u02e5\3\2\2\2\u02e0\u02e1\7*\2\2\u02e1\u02e2\5\16\b\2\u02e2\u02e3\b\27"+
		"\1\2\u02e3\u02e5\3\2\2\2\u02e4\u02dc\3\2\2\2\u02e4\u02e0\3\2\2\2\u02e5"+
		"-\3\2\2\2\u02e6\u02e7\7k\2\2\u02e7\u02ee\b\30\1\2\u02e8\u02e9\5\60\31"+
		"\2\u02e9\u02ea\7F\2\2\u02ea\u02eb\7k\2\2\u02eb\u02ec\b\30\1\2\u02ec\u02ee"+
		"\3\2\2\2\u02ed\u02e6\3\2\2\2\u02ed\u02e8\3\2\2\2\u02ee/\3\2\2\2\u02ef"+
		"\u02f0\b\31\1\2\u02f0\u02f1\7k\2\2\u02f1\u02f2\b\31\1\2\u02f2\u02f9\3"+
		"\2\2\2\u02f3\u02f4\f\3\2\2\u02f4\u02f5\7F\2\2\u02f5\u02f6\7k\2\2\u02f6"+
		"\u02f8\b\31\1\2\u02f7\u02f3\3\2\2\2\u02f8\u02fb\3\2\2\2\u02f9\u02f7\3"+
		"\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\61\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fc"+
		"\u02fd\7k\2\2\u02fd\u0304\b\32\1\2\u02fe\u02ff\5\64\33\2\u02ff\u0300\7"+
		"F\2\2\u0300\u0301\7k\2\2\u0301\u0302\b\32\1\2\u0302\u0304\3\2\2\2\u0303"+
		"\u02fc\3\2\2\2\u0303\u02fe\3\2\2\2\u0304\63\3\2\2\2\u0305\u0306\b\33\1"+
		"\2\u0306\u0307\7k\2\2\u0307\u0308\b\33\1\2\u0308\u030f\3\2\2\2\u0309\u030a"+
		"\f\3\2\2\u030a\u030b\7F\2\2\u030b\u030c\7k\2\2\u030c\u030e\b\33\1\2\u030d"+
		"\u0309\3\2\2\2\u030e\u0311\3\2\2\2\u030f\u030d\3\2\2\2\u030f\u0310\3\2"+
		"\2\2\u0310\65\3\2\2\2\u0311\u030f\3\2\2\2\u0312\u0313\58\35\2\u0313\u0314"+
		"\b\34\1\2\u0314\u0316\3\2\2\2\u0315\u0312\3\2\2\2\u0315\u0316\3\2\2\2"+
		"\u0316\u031c\3\2\2\2\u0317\u0318\5<\37\2\u0318\u0319\b\34\1\2\u0319\u031b"+
		"\3\2\2\2\u031a\u0317\3\2\2\2\u031b\u031e\3\2\2\2\u031c\u031a\3\2\2\2\u031c"+
		"\u031d\3\2\2\2\u031d\u0324\3\2\2\2\u031e\u031c\3\2\2\2\u031f\u0320\5F"+
		"$\2\u0320\u0321\b\34\1\2\u0321\u0323\3\2\2\2\u0322\u031f\3\2\2\2\u0323"+
		"\u0326\3\2\2\2\u0324\u0322\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0327\3\2"+
		"\2\2\u0326\u0324\3\2\2\2\u0327\u0328\7\2\2\3\u0328\u0329\b\34\1\2\u0329"+
		"\67\3\2\2\2\u032a\u032b\5:\36\2\u032b\u032c\b\35\1\2\u032c\u032e\3\2\2"+
		"\2\u032d\u032a\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2\2\2\u032f\u0330"+
		"\3\2\2\2\u0330\u0332\3\2\2\2\u0331\u032f\3\2\2\2\u0332\u0333\7\"\2\2\u0333"+
		"\u0334\7k\2\2\u0334\u0335\b\35\1\2\u0335\u033b\3\2\2\2\u0336\u0337\7F"+
		"\2\2\u0337\u0338\7k\2\2\u0338\u033a\b\35\1\2\u0339\u0336\3\2\2\2\u033a"+
		"\u033d\3\2\2\2\u033b\u0339\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033e\3\2"+
		"\2\2\u033d\u033b\3\2\2\2\u033e\u033f\7D\2\2\u033f\u0340\b\35\1\2\u0340"+
		"9\3\2\2\2\u0341\u0342\5\u00d2j\2\u0342\u0343\b\36\1\2\u0343;\3\2\2\2\u0344"+
		"\u0345\5> \2\u0345\u0346\b\37\1\2\u0346\u0351\3\2\2\2\u0347\u0348\5@!"+
		"\2\u0348\u0349\b\37\1\2\u0349\u0351\3\2\2\2\u034a\u034b\5B\"\2\u034b\u034c"+
		"\b\37\1\2\u034c\u0351\3\2\2\2\u034d\u034e\5D#\2\u034e\u034f\b\37\1\2\u034f"+
		"\u0351\3\2\2\2\u0350\u0344\3\2\2\2\u0350\u0347\3\2\2\2\u0350\u034a\3\2"+
		"\2\2\u0350\u034d\3\2\2\2\u0351=\3\2\2\2\u0352\u0353\7\33\2\2\u0353\u0354"+
		"\5.\30\2\u0354\u0355\7D\2\2\u0355\u0356\b \1\2\u0356?\3\2\2\2\u0357\u0358"+
		"\7\33\2\2\u0358\u0359\5\60\31\2\u0359\u035a\7F\2\2\u035a\u035b\7X\2\2"+
		"\u035b\u035c\7D\2\2\u035c\u035d\b!\1\2\u035dA\3\2\2\2\u035e\u035f\7\33"+
		"\2\2\u035f\u0360\7(\2\2\u0360\u0361\5.\30\2\u0361\u0362\7F\2\2\u0362\u0363"+
		"\7k\2\2\u0363\u0364\7D\2\2\u0364\u0365\b\"\1\2\u0365C\3\2\2\2\u0366\u0367"+
		"\7\33\2\2\u0367\u0368\7(\2\2\u0368\u0369\5.\30\2\u0369\u036a\7F\2\2\u036a"+
		"\u036b\7X\2\2\u036b\u036c\7D\2\2\u036c\u036d\b#\1\2\u036dE\3\2\2\2\u036e"+
		"\u036f\5H%\2\u036f\u0370\b$\1\2\u0370\u0376\3\2\2\2\u0371\u0372\5\u00b2"+
		"Z\2\u0372\u0373\b$\1\2\u0373\u0376\3\2\2\2\u0374\u0376\7D\2\2\u0375\u036e"+
		"\3\2\2\2\u0375\u0371\3\2\2\2\u0375\u0374\3\2\2\2\u0376G\3\2\2\2\u0377"+
		"\u0378\5J&\2\u0378\u0379\b%\1\2\u0379\u037e\3\2\2\2\u037a\u037b\5\u00a8"+
		"U\2\u037b\u037c\b%\1\2\u037c\u037e\3\2\2\2\u037d\u0377\3\2\2\2\u037d\u037a"+
		"\3\2\2\2\u037eI\3\2\2\2\u037f\u0380\5L\'\2\u0380\u0381\b&\1\2\u0381\u0386"+
		"\3\2\2\2\u0382\u0383\5\u00d2j\2\u0383\u0384\b&\1\2\u0384\u0386\3\2\2\2"+
		"\u0385\u037f\3\2\2\2\u0385\u0382\3\2\2\2\u0386\u0389\3\2\2\2\u0387\u0385"+
		"\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u038a\3\2\2\2\u0389\u0387\3\2\2\2\u038a"+
		"\u038b\b&\1\2\u038b\u038c\7\13\2\2\u038c\u0390\7k\2\2\u038d\u038e\5N("+
		"\2\u038e\u038f\b&\1\2\u038f\u0391\3\2\2\2\u0390\u038d\3\2\2\2\u0390\u0391"+
		"\3\2\2\2\u0391\u0395\3\2\2\2\u0392\u0393\5R*\2\u0393\u0394\b&\1\2\u0394"+
		"\u0396\3\2\2\2\u0395\u0392\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u039a\3\2"+
		"\2\2\u0397\u0398\5T+\2\u0398\u0399\b&\1\2\u0399\u039b\3\2\2\2\u039a\u0397"+
		"\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039d\b&\1\2\u039d"+
		"\u039e\5X-\2\u039eK\3\2\2\2\u039f\u03a0\7%\2\2\u03a0\u03ae\b\'\1\2\u03a1"+
		"\u03a2\7$\2\2\u03a2\u03ae\b\'\1\2\u03a3\u03a4\7#\2\2\u03a4\u03ae\b\'\1"+
		"\2\u03a5\u03a6\7\3\2\2\u03a6\u03ae\b\'\1\2\u03a7\u03a8\7(\2\2\u03a8\u03ae"+
		"\b\'\1\2\u03a9\u03aa\7\24\2\2\u03aa\u03ae\b\'\1\2\u03ab\u03ac\7)\2\2\u03ac"+
		"\u03ae\b\'\1\2\u03ad\u039f\3\2\2\2\u03ad\u03a1\3\2\2\2\u03ad\u03a3\3\2"+
		"\2\2\u03ad\u03a5\3\2\2\2\u03ad\u03a7\3\2\2\2\u03ad\u03a9\3\2\2\2\u03ad"+
		"\u03ab\3\2\2\2\u03aeM\3\2\2\2\u03af\u03b0\7I\2\2\u03b0\u03b1\5P)\2\u03b1"+
		"\u03b2\7H\2\2\u03b2\u03b3\b(\1\2\u03b3O\3\2\2\2\u03b4\u03b5\5\34\17\2"+
		"\u03b5\u03b6\b)\1\2\u03b6\u03bd\3\2\2\2\u03b7\u03b8\7E\2\2\u03b8\u03b9"+
		"\5\34\17\2\u03b9\u03ba\b)\1\2\u03ba\u03bc\3\2\2\2\u03bb\u03b7\3\2\2\2"+
		"\u03bc\u03bf\3\2\2\2\u03bd\u03bb\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c0"+
		"\3\2\2\2\u03bf\u03bd\3\2\2\2\u03c0\u03c1\b)\1\2\u03c1Q\3\2\2\2\u03c2\u03c3"+
		"\7\23\2\2\u03c3\u03c4\5\22\n\2\u03c4\u03c5\b*\1\2\u03c5S\3\2\2\2\u03c6"+
		"\u03c7\7\32\2\2\u03c7\u03c8\5V,\2\u03c8\u03c9\b+\1\2\u03c9U\3\2\2\2\u03ca"+
		"\u03cb\5\22\n\2\u03cb\u03cc\b,\1\2\u03cc\u03d3\3\2\2\2\u03cd\u03ce\7E"+
		"\2\2\u03ce\u03cf\5\22\n\2\u03cf\u03d0\b,\1\2\u03d0\u03d2\3\2\2\2\u03d1"+
		"\u03cd\3\2\2\2\u03d2\u03d5\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d3\u03d4\3\2"+
		"\2\2\u03d4\u03d6\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d6\u03d7\b,\1\2\u03d7"+
		"W\3\2\2\2\u03d8\u03dc\7@\2\2\u03d9\u03db\5Z.\2\u03da\u03d9\3\2\2\2\u03db"+
		"\u03de\3\2\2\2\u03dc\u03da\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03df\3\2"+
		"\2\2\u03de\u03dc\3\2\2\2\u03df\u03e0\7A\2\2\u03e0\u03e1\b-\1\2\u03e1Y"+
		"\3\2\2\2\u03e2\u03ed\5\\/\2\u03e3\u03e4\5\u009aN\2\u03e4\u03e5\b.\1\2"+
		"\u03e5\u03ed\3\2\2\2\u03e6\u03e7\5\u009cO\2\u03e7\u03e8\b.\1\2\u03e8\u03ed"+
		"\3\2\2\2\u03e9\u03ea\5\u009eP\2\u03ea\u03eb\b.\1\2\u03eb\u03ed\3\2\2\2"+
		"\u03ec\u03e2\3\2\2\2\u03ec\u03e3\3\2\2\2\u03ec\u03e6\3\2\2\2\u03ec\u03e9"+
		"\3\2\2\2\u03ed[\3\2\2\2\u03ee\u03fa\5^\60\2\u03ef\u03f0\5|?\2\u03f0\u03f1"+
		"\b/\1\2\u03f1\u03fa\3\2\2\2\u03f2\u03f3\5H%\2\u03f3\u03f4\b/\1\2\u03f4"+
		"\u03fa\3\2\2\2\u03f5\u03f6\5\u00b2Z\2\u03f6\u03f7\b/\1\2\u03f7\u03fa\3"+
		"\2\2\2\u03f8\u03fa\7D\2\2\u03f9\u03ee\3\2\2\2\u03f9\u03ef\3\2\2\2\u03f9"+
		"\u03f2\3\2\2\2\u03f9\u03f5\3\2\2\2\u03f9\u03f8\3\2\2\2\u03fa]\3\2\2\2"+
		"\u03fb\u03fc\5`\61\2\u03fc\u03fd\b\60\1\2\u03fd\u0402\3\2\2\2\u03fe\u03ff"+
		"\5\u00d2j\2\u03ff\u0400\b\60\1\2\u0400\u0402\3\2\2\2\u0401\u03fb\3\2\2"+
		"\2\u0401\u03fe\3\2\2\2\u0402\u0405\3\2\2\2\u0403\u0401\3\2\2\2\u0403\u0404"+
		"\3\2\2\2\u0404\u0406\3\2\2\2\u0405\u0403\3\2\2\2\u0406\u0407\b\60\1\2"+
		"\u0407\u0408\5l\67\2\u0408\u0409\5b\62\2\u0409\u040a\7D\2\2\u040a_\3\2"+
		"\2\2\u040b\u040c\7%\2\2\u040c\u041a\b\61\1\2\u040d\u040e\7$\2\2\u040e"+
		"\u041a\b\61\1\2\u040f\u0410\7#\2\2\u0410\u041a\b\61\1\2\u0411\u0412\7"+
		"(\2\2\u0412\u041a\b\61\1\2\u0413\u0414\7\24\2\2\u0414\u041a\b\61\1\2\u0415"+
		"\u0416\7\60\2\2\u0416\u041a\b\61\1\2\u0417\u0418\7\63\2\2\u0418\u041a"+
		"\b\61\1\2\u0419\u040b\3\2\2\2\u0419\u040d\3\2\2\2\u0419\u040f\3\2\2\2"+
		"\u0419\u0411\3\2\2\2\u0419\u0413\3\2\2\2\u0419\u0415\3\2\2\2\u0419\u0417"+
		"\3\2\2\2\u041aa\3\2\2\2\u041b\u041c\5d\63\2\u041c\u041d\b\62\1\2\u041d"+
		"\u0424\3\2\2\2\u041e\u041f\7E\2\2\u041f\u0420\5d\63\2\u0420\u0421\b\62"+
		"\1\2\u0421\u0423\3\2\2\2\u0422\u041e\3\2\2\2\u0423\u0426\3\2\2\2\u0424"+
		"\u0422\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0427\3\2\2\2\u0426\u0424\3\2"+
		"\2\2\u0427\u0428\b\62\1\2\u0428c\3\2\2\2\u0429\u042a\5f\64\2\u042a\u042f"+
		"\b\63\1\2\u042b\u042c\7G\2\2\u042c\u042d\5j\66\2\u042d\u042e\b\63\1\2"+
		"\u042e\u0430\3\2\2\2\u042f\u042b\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0431"+
		"\3\2\2\2\u0431\u0432\b\63\1\2\u0432e\3\2\2\2\u0433\u0434\b\64\1\2\u0434"+
		"\u0438\7k\2\2\u0435\u0436\5\32\16\2\u0436\u0437\b\64\1\2\u0437\u0439\3"+
		"\2\2\2\u0438\u0435\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043a\3\2\2\2\u043a"+
		"\u043b\b\64\1\2\u043bg\3\2\2\2\u043c\u043d\5l\67\2\u043d\u043e\5f\64\2"+
		"\u043e\u043f\b\65\1\2\u043fi\3\2\2\2\u0440\u0441\5\u0188\u00c5\2\u0441"+
		"\u0442\b\66\1\2\u0442\u0447\3\2\2\2\u0443\u0444\5\u00e4s\2\u0444\u0445"+
		"\b\66\1\2\u0445\u0447\3\2\2\2\u0446\u0440\3\2\2\2\u0446\u0443\3\2\2\2"+
		"\u0447k\3\2\2\2\u0448\u0449\5n8\2\u0449\u044a\b\67\1\2\u044a\u044f\3\2"+
		"\2\2\u044b\u044c\5p9\2\u044c\u044d\b\67\1\2\u044d\u044f\3\2\2\2\u044e"+
		"\u0448\3\2\2\2\u044e\u044b\3\2\2\2\u044fm\3\2\2\2\u0450\u0451\5\b\5\2"+
		"\u0451\u0452\b8\1\2\u0452\u0456\3\2\2\2\u0453\u0454\7\5\2\2\u0454\u0456"+
		"\b8\1\2\u0455\u0450\3\2\2\2\u0455\u0453\3\2\2\2\u0456o\3\2\2\2\u0457\u0458"+
		"\5r:\2\u0458\u0459\b9\1\2\u0459\u0461\3\2\2\2\u045a\u045b\5x=\2\u045b"+
		"\u045c\b9\1\2\u045c\u0461\3\2\2\2\u045d\u045e\5z>\2\u045e\u045f\b9\1\2"+
		"\u045f\u0461\3\2\2\2\u0460\u0457\3\2\2\2\u0460\u045a\3\2\2\2\u0460\u045d"+
		"\3\2\2\2\u0461q\3\2\2\2\u0462\u0463\5v<\2\u0463\u0464\b:\1\2\u0464\u046b"+
		"\3\2\2\2\u0465\u0466\7F\2\2\u0466\u0467\5\24\13\2\u0467\u0468\b:\1\2\u0468"+
		"\u046a\3\2\2\2\u0469\u0465\3\2\2\2\u046a\u046d\3\2\2\2\u046b\u0469\3\2"+
		"\2\2\u046b\u046c\3\2\2\2\u046cs\3\2\2\2\u046d\u046b\3\2\2\2\u046e\u046f"+
		"\5v<\2\u046f\u0470\b;\1\2\u0470\u0477\3\2\2\2\u0471\u0472\5r:\2\u0472"+
		"\u0473\7F\2\2\u0473\u0474\5\24\13\2\u0474\u0475\b;\1\2\u0475\u0477\3\2"+
		"\2\2\u0476\u046e\3\2\2\2\u0476\u0471\3\2\2\2\u0477u\3\2\2\2\u0478\u0479"+
		"\7k\2\2\u0479\u047d\b<\1\2\u047a\u047b\5$\23\2\u047b\u047c\b<\1\2\u047c"+
		"\u047e\3\2\2\2\u047d\u047a\3\2\2\2\u047d\u047e\3\2\2\2\u047ew\3\2\2\2"+
		"\u047f\u0480\7k\2\2\u0480\u0481\b=\1\2\u0481y\3\2\2\2\u0482\u0483\5n8"+
		"\2\u0483\u0484\5\32\16\2\u0484\u0485\b>\1\2\u0485\u048f\3\2\2\2\u0486"+
		"\u0487\5r:\2\u0487\u0488\5\32\16\2\u0488\u0489\b>\1\2\u0489\u048f\3\2"+
		"\2\2\u048a\u048b\5x=\2\u048b\u048c\5\32\16\2\u048c\u048d\b>\1\2\u048d"+
		"\u048f\3\2\2\2\u048e\u0482\3\2\2\2\u048e\u0486\3\2\2\2\u048e\u048a\3\2"+
		"\2\2\u048f{\3\2\2\2\u0490\u0491\5~@\2\u0491\u0492\b?\1\2\u0492\u0497\3"+
		"\2\2\2\u0493\u0494\5\u00d2j\2\u0494\u0495\b?\1\2\u0495\u0497\3\2\2\2\u0496"+
		"\u0490\3\2\2\2\u0496\u0493\3\2\2\2\u0497\u049a\3\2\2\2\u0498\u0496\3\2"+
		"\2\2\u0498\u0499\3\2\2\2\u0499\u049b\3\2\2\2\u049a\u0498\3\2\2\2\u049b"+
		"\u049c\b?\1\2\u049c\u049d\b?\1\2\u049d\u049e\5\u0080A\2\u049e\u049f\5"+
		"\u0098M\2\u049f\u04a0\b?\1\2\u04a0}\3\2\2\2\u04a1\u04a2\7%\2\2\u04a2\u04b4"+
		"\b@\1\2\u04a3\u04a4\7$\2\2\u04a4\u04b4\b@\1\2\u04a5\u04a6\7#\2\2\u04a6"+
		"\u04b4\b@\1\2\u04a7\u04a8\7\3\2\2\u04a8\u04b4\b@\1\2\u04a9\u04aa\7(\2"+
		"\2\u04aa\u04b4\b@\1\2\u04ab\u04ac\7\24\2\2\u04ac\u04b4\b@\1\2\u04ad\u04ae"+
		"\7,\2\2\u04ae\u04b4\b@\1\2\u04af\u04b0\7 \2\2\u04b0\u04b4\b@\1\2\u04b1"+
		"\u04b2\7)\2\2\u04b2\u04b4\b@\1\2\u04b3\u04a1\3\2\2\2\u04b3\u04a3\3\2\2"+
		"\2\u04b3\u04a5\3\2\2\2\u04b3\u04a7\3\2\2\2\u04b3\u04a9\3\2\2\2\u04b3\u04ab"+
		"\3\2\2\2\u04b3\u04ad\3\2\2\2\u04b3\u04af\3\2\2\2\u04b3\u04b1\3\2\2\2\u04b4"+
		"\177\3\2\2\2\u04b5\u04b6\5\u0082B\2\u04b6\u04b7\bA\1\2\u04b7\u04bb\5\u0084"+
		"C\2\u04b8\u04b9\5\u0092J\2\u04b9\u04ba\bA\1\2\u04ba\u04bc\3\2\2\2\u04bb"+
		"\u04b8\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04d1\3\2\2\2\u04bd\u04be\5N"+
		"(\2\u04be\u04c4\bA\1\2\u04bf\u04c0\5\u00d2j\2\u04c0\u04c1\bA\1\2\u04c1"+
		"\u04c3\3\2\2\2\u04c2\u04bf\3\2\2\2\u04c3\u04c6\3\2\2\2\u04c4\u04c2\3\2"+
		"\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c7\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c7"+
		"\u04c8\bA\1\2\u04c8\u04c9\5\u0082B\2\u04c9\u04ca\bA\1\2\u04ca\u04ce\5"+
		"\u0084C\2\u04cb\u04cc\5\u0092J\2\u04cc\u04cd\bA\1\2\u04cd\u04cf\3\2\2"+
		"\2\u04ce\u04cb\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d1\3\2\2\2\u04d0\u04b5"+
		"\3\2\2\2\u04d0\u04bd\3\2\2\2\u04d1\u0081\3\2\2\2\u04d2\u04d3\5l\67\2\u04d3"+
		"\u04d4\bB\1\2\u04d4\u04d8\3\2\2\2\u04d5\u04d6\7\62\2\2\u04d6\u04d8\bB"+
		"\1\2\u04d7\u04d2\3\2\2\2\u04d7\u04d5\3\2\2\2\u04d8\u0083\3\2\2\2\u04d9"+
		"\u04da\7k\2\2\u04da\u04db\bC\1\2\u04db\u04df\7>\2\2\u04dc\u04dd\5\u0086"+
		"D\2\u04dd\u04de\bC\1\2\u04de\u04e0\3\2\2\2\u04df\u04dc\3\2\2\2\u04df\u04e0"+
		"\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e5\7?\2\2\u04e2\u04e3\5\32\16\2"+
		"\u04e3\u04e4\bC\1\2\u04e4\u04e6\3\2\2\2\u04e5\u04e2\3\2\2\2\u04e5\u04e6"+
		"\3\2\2\2\u04e6\u0085\3\2\2\2\u04e7\u04e8\5\u0088E\2\u04e8\u04e9\bD\1\2"+
		"\u04e9\u04ea\3\2\2\2\u04ea\u04eb\7E\2\2\u04eb\u04ec\5\u008eH\2\u04ec\u04ed"+
		"\bD\1\2\u04ed\u04ee\3\2\2\2\u04ee\u04ef\bD\1\2\u04ef\u04f6\3\2\2\2\u04f0"+
		"\u04f1\5\u008eH\2\u04f1\u04f2\bD\1\2\u04f2\u04f3\3\2\2\2\u04f3\u04f4\b"+
		"D\1\2\u04f4\u04f6\3\2\2\2\u04f5\u04e7\3\2\2\2\u04f5\u04f0\3\2\2\2\u04f6"+
		"\u0087\3\2\2\2\u04f7\u04f8\5\u008aF\2\u04f8\u04f9\bE\1\2\u04f9\u0500\3"+
		"\2\2\2\u04fa\u04fb\7E\2\2\u04fb\u04fc\5\u008aF\2\u04fc\u04fd\bE\1\2\u04fd"+
		"\u04ff\3\2\2\2\u04fe\u04fa\3\2\2\2\u04ff\u0502\3\2\2\2\u0500\u04fe\3\2"+
		"\2\2\u0500\u0501\3\2\2\2\u0501\u0503\3\2\2\2\u0502\u0500\3\2\2\2\u0503"+
		"\u0504\bE\1\2\u0504\u0514\3\2\2\2\u0505\u0506\5\u0090I\2\u0506\u0507\b"+
		"E\1\2\u0507\u050e\3\2\2\2\u0508\u0509\7E\2\2\u0509\u050a\5\u008aF\2\u050a"+
		"\u050b\bE\1\2\u050b\u050d\3\2\2\2\u050c\u0508\3\2\2\2\u050d\u0510\3\2"+
		"\2\2\u050e\u050c\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u0511\3\2\2\2\u0510"+
		"\u050e\3\2\2\2\u0511\u0512\bE\1\2\u0512\u0514\3\2\2\2\u0513\u04f7\3\2"+
		"\2\2\u0513\u0505\3\2\2\2\u0514\u0089\3\2\2\2\u0515\u0516\5\u008cG\2\u0516"+
		"\u0517\bF\1\2\u0517\u051c\3\2\2\2\u0518\u0519\5\u00d2j\2\u0519\u051a\b"+
		"F\1\2\u051a\u051c\3\2\2\2\u051b\u0515\3\2\2\2\u051b\u0518\3\2\2\2\u051c"+
		"\u051f\3\2\2\2\u051d\u051b\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u0520\3\2"+
		"\2\2\u051f\u051d\3\2\2\2\u0520\u0521\bF\1\2\u0521\u0522\5h\65\2\u0522"+
		"\u0523\bF\1\2\u0523\u008b\3\2\2\2\u0524\u0525\7\24\2\2\u0525\u0526\bG"+
		"\1\2\u0526\u008d\3\2\2\2\u0527\u0528\5\u008cG\2\u0528\u0529\bH\1\2\u0529"+
		"\u052e\3\2\2\2\u052a\u052b\5\u00d2j\2\u052b\u052c\bH\1\2\u052c\u052e\3"+
		"\2\2\2\u052d\u0527\3\2\2\2\u052d\u052a\3\2\2\2\u052e\u0531\3\2\2\2\u052f"+
		"\u052d\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0532\3\2\2\2\u0531\u052f\3\2"+
		"\2\2\u0532\u0538\5l\67\2\u0533\u0534\5\u00d2j\2\u0534\u0535\bH\1\2\u0535"+
		"\u0537\3\2\2\2\u0536\u0533\3\2\2\2\u0537\u053a\3\2\2\2\u0538\u0536\3\2"+
		"\2\2\u0538\u0539\3\2\2\2\u0539\u053b\3\2\2\2\u053a\u0538\3\2\2\2\u053b"+
		"\u053c\7m\2\2\u053c\u053d\5f\64\2\u053d\u053e\bH\1\2\u053e\u0543\3\2\2"+
		"\2\u053f\u0540\5\u008aF\2\u0540\u0541\bH\1\2\u0541\u0543\3\2\2\2\u0542"+
		"\u052f\3\2\2\2\u0542\u053f\3\2\2\2\u0543\u008f\3\2\2\2\u0544\u0545\5\u00d2"+
		"j\2\u0545\u0546\bI\1\2\u0546\u0548\3\2\2\2\u0547\u0544\3\2\2\2\u0548\u054b"+
		"\3\2\2\2\u0549\u0547\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054c\3\2\2\2\u054b"+
		"\u0549\3\2\2\2\u054c\u054d\5l\67\2\u054d\u054e\7k\2\2\u054e\u054f\7F\2"+
		"\2\u054f\u0550\7-\2\2\u0550\u0551\bI\1\2\u0551\u0091\3\2\2\2\u0552\u0553"+
		"\7/\2\2\u0553\u0554\5\u0094K\2\u0554\u0555\bJ\1\2\u0555\u0093\3\2\2\2"+
		"\u0556\u0557\5\u0096L\2\u0557\u0558\bK\1\2\u0558\u055f\3\2\2\2\u0559\u055a"+
		"\7E\2\2\u055a\u055b\5\u0096L\2\u055b\u055c\bK\1\2\u055c\u055e\3\2\2\2"+
		"\u055d\u0559\3\2\2\2\u055e\u0561\3\2\2\2\u055f\u055d\3\2\2\2\u055f\u0560"+
		"\3\2\2\2\u0560\u0562\3\2\2\2\u0561\u055f\3\2\2\2\u0562\u0563\bK\1\2\u0563"+
		"\u0095\3\2\2\2\u0564\u0565\5\22\n\2\u0565\u0566\bL\1\2\u0566\u056b\3\2"+
		"\2\2\u0567\u0568\5\26\f\2\u0568\u0569\bL\1\2\u0569\u056b\3\2\2\2\u056a"+
		"\u0564\3\2\2\2\u056a\u0567\3\2\2\2\u056b\u0097\3\2\2\2\u056c\u056d\5\u00e8"+
		"u\2\u056d\u056e\bM\1\2\u056e\u0572\3\2\2\2\u056f\u0570\7D\2\2\u0570\u0572"+
		"\bM\1\2\u0571\u056c\3\2\2\2\u0571\u056f\3\2\2\2\u0572\u0099\3\2\2\2\u0573"+
		"\u0574\5\u00e8u\2\u0574\u0575\bN\1\2\u0575\u009b\3\2\2\2\u0576\u0577\7"+
		"(\2\2\u0577\u0578\5\u00e8u\2\u0578\u0579\bO\1\2\u0579\u009d\3\2\2\2\u057a"+
		"\u057b\5\u00a0Q\2\u057b\u057c\bP\1\2\u057c\u0581\3\2\2\2\u057d\u057e\5"+
		"\u00d2j\2\u057e\u057f\bP\1\2\u057f\u0581\3\2\2\2\u0580\u057a\3\2\2\2\u0580"+
		"\u057d\3\2\2\2\u0581\u0584\3\2\2\2\u0582\u0580\3\2\2\2\u0582\u0583\3\2"+
		"\2\2\u0583\u0585\3\2\2\2\u0584\u0582\3\2\2\2\u0585\u0586\bP\1\2\u0586"+
		"\u0587\bP\1\2\u0587\u058b\5\u00a2R\2\u0588\u0589\5\u0092J\2\u0589\u058a"+
		"\bP\1\2\u058a\u058c\3\2\2\2\u058b\u0588\3\2\2\2\u058b\u058c\3\2\2\2\u058c"+
		"\u058d\3\2\2\2\u058d\u058e\5\u00a4S\2\u058e\u058f\bP\1\2\u058f\u009f\3"+
		"\2\2\2\u0590\u0591\7%\2\2\u0591\u0597\bQ\1\2\u0592\u0593\7$\2\2\u0593"+
		"\u0597\bQ\1\2\u0594\u0595\7#\2\2\u0595\u0597\bQ\1\2\u0596\u0590\3\2\2"+
		"\2\u0596\u0592\3\2\2\2\u0596\u0594\3\2\2\2\u0597\u00a1\3\2\2\2\u0598\u0599"+
		"\5N(\2\u0599\u059a\bR\1\2\u059a\u059c\3\2\2\2\u059b\u0598\3\2\2\2\u059b"+
		"\u059c\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u059e\7k\2\2\u059e\u059f\bR\1"+
		"\2\u059f\u05a3\7>\2\2\u05a0\u05a1\5\u0086D\2\u05a1\u05a2\bR\1\2\u05a2"+
		"\u05a4\3\2\2\2\u05a3\u05a0\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u05a5\3\2"+
		"\2\2\u05a5\u05a6\7?\2\2\u05a6\u00a3\3\2\2\2\u05a7\u05a8\bS\1\2\u05a8\u05ac"+
		"\7@\2\2\u05a9\u05aa\5\u00a6T\2\u05aa\u05ab\bS\1\2\u05ab\u05ad\3\2\2\2"+
		"\u05ac\u05a9\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad\u05b1\3\2\2\2\u05ae\u05af"+
		"\5\u00eav\2\u05af\u05b0\bS\1\2\u05b0\u05b2\3\2\2\2\u05b1\u05ae\3\2\2\2"+
		"\u05b1\u05b2\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b4\7A\2\2\u05b4\u05b5"+
		"\bS\1\2\u05b5\u00a5\3\2\2\2\u05b6\u05b7\5$\23\2\u05b7\u05b8\bT\1\2\u05b8"+
		"\u05ba\3\2\2\2\u05b9\u05b6\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05bb\3\2"+
		"\2\2\u05bb\u05bc\7-\2\2\u05bc\u05c0\7>\2\2\u05bd\u05be\5\u0178\u00bd\2"+
		"\u05be\u05bf\bT\1\2\u05bf\u05c1\3\2\2\2\u05c0\u05bd\3\2\2\2\u05c0\u05c1"+
		"\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c3\7?\2\2\u05c3\u05c4\7D\2\2\u05c4"+
		"\u05f9\bT\1\2\u05c5\u05c6\5$\23\2\u05c6\u05c7\bT\1\2\u05c7\u05c9\3\2\2"+
		"\2\u05c8\u05c5\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05cb"+
		"\7*\2\2\u05cb\u05cf\7>\2\2\u05cc\u05cd\5\u0178\u00bd\2\u05cd\u05ce\bT"+
		"\1\2\u05ce\u05d0\3\2\2\2\u05cf\u05cc\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0"+
		"\u05d1\3\2\2\2\u05d1\u05d2\7?\2\2\u05d2\u05d3\7D\2\2\u05d3\u05f9\bT\1"+
		"\2\u05d4\u05d5\5\62\32\2\u05d5\u05d9\7F\2\2\u05d6\u05d7\5$\23\2\u05d7"+
		"\u05d8\bT\1\2\u05d8\u05da\3\2\2\2\u05d9\u05d6\3\2\2\2\u05d9\u05da\3\2"+
		"\2\2\u05da\u05db\3\2\2\2\u05db\u05dc\7*\2\2\u05dc\u05e0\7>\2\2\u05dd\u05de"+
		"\5\u0178\u00bd\2\u05de\u05df\bT\1\2\u05df\u05e1\3\2\2\2\u05e0\u05dd\3"+
		"\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e3\7?\2\2\u05e3"+
		"\u05e4\7D\2\2\u05e4\u05e5\bT\1\2\u05e5\u05f9\3\2\2\2\u05e6\u05e7\5\u014a"+
		"\u00a6\2\u05e7\u05eb\7F\2\2\u05e8\u05e9\5$\23\2\u05e9\u05ea\bT\1\2\u05ea"+
		"\u05ec\3\2\2\2\u05eb\u05e8\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ed\3\2"+
		"\2\2\u05ed\u05ee\7*\2\2\u05ee\u05f2\7>\2\2\u05ef\u05f0\5\u0178\u00bd\2"+
		"\u05f0\u05f1\bT\1\2\u05f1\u05f3\3\2\2\2\u05f2\u05ef\3\2\2\2\u05f2\u05f3"+
		"\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u05f5\7?\2\2\u05f5\u05f6\7D\2\2\u05f6"+
		"\u05f7\bT\1\2\u05f7\u05f9\3\2\2\2\u05f8\u05b9\3\2\2\2\u05f8\u05c8\3\2"+
		"\2\2\u05f8\u05d4\3\2\2\2\u05f8\u05e6\3\2\2\2\u05f9\u00a7\3\2\2\2\u05fa"+
		"\u05fb\5L\'\2\u05fb\u05fc\bU\1\2\u05fc\u0601\3\2\2\2\u05fd\u05fe\5\u00d2"+
		"j\2\u05fe\u05ff\bU\1\2\u05ff\u0601\3\2\2\2\u0600\u05fa\3\2\2\2\u0600\u05fd"+
		"\3\2\2\2\u0601\u0604\3\2\2\2\u0602\u0600\3\2\2\2\u0602\u0603\3\2\2\2\u0603"+
		"\u0605\3\2\2\2\u0604\u0602\3\2\2\2\u0605\u0606\7\22\2\2\u0606\u060a\7"+
		"k\2\2\u0607\u0608\5T+\2\u0608\u0609\bU\1\2\u0609\u060b\3\2\2\2\u060a\u0607"+
		"\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060d\bU\1\2\u060d"+
		"\u060e\5\u00aaV\2\u060e\u00a9\3\2\2\2\u060f\u0611\7@\2\2\u0610\u0612\5"+
		"\u00acW\2\u0611\u0610\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u0614\3\2\2\2"+
		"\u0613\u0615\7E\2\2\u0614\u0613\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0617"+
		"\3\2\2\2\u0616\u0618\5\u00b0Y\2\u0617\u0616\3\2\2\2\u0617\u0618\3\2\2"+
		"\2\u0618\u0619\3\2\2\2\u0619\u061a\7A\2\2\u061a\u061b\bV\1\2\u061b\u00ab"+
		"\3\2\2\2\u061c\u0621\5\u00aeX\2\u061d\u061e\7E\2\2\u061e\u0620\5\u00ae"+
		"X\2\u061f\u061d\3\2\2\2\u0620\u0623\3\2\2\2\u0621\u061f\3\2\2\2\u0621"+
		"\u0622\3\2\2\2\u0622\u00ad\3\2\2\2\u0623\u0621\3\2\2\2\u0624\u0625\5\u00d2"+
		"j\2\u0625\u0626\bX\1\2\u0626\u0628\3\2\2\2\u0627\u0624\3\2\2\2\u0628\u062b"+
		"\3\2\2\2\u0629\u0627\3\2\2\2\u0629\u062a\3\2\2\2\u062a\u062c\3\2\2\2\u062b"+
		"\u0629\3\2\2\2\u062c\u0634\7k\2\2\u062d\u0631\7>\2\2\u062e\u062f\5\u0178"+
		"\u00bd\2\u062f\u0630\bX\1\2\u0630\u0632\3\2\2\2\u0631\u062e\3\2\2\2\u0631"+
		"\u0632\3\2\2\2\u0632\u0633\3\2\2\2\u0633\u0635\7?\2\2\u0634\u062d\3\2"+
		"\2\2\u0634\u0635\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u0638\bX\1\2\u0637"+
		"\u0639\5X-\2\u0638\u0637\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u00af\3\2\2"+
		"\2\u063a\u063e\7D\2\2\u063b\u063d\5Z.\2\u063c\u063b\3\2\2\2\u063d\u0640"+
		"\3\2\2\2\u063e\u063c\3\2\2\2\u063e\u063f\3\2\2\2\u063f\u00b1\3\2\2\2\u0640"+
		"\u063e\3\2\2\2\u0641\u0642\5\u00b4[\2\u0642\u0643\bZ\1\2\u0643\u0648\3"+
		"\2\2\2\u0644\u0645\5\u00c6d\2\u0645\u0646\bZ\1\2\u0646\u0648\3\2\2\2\u0647"+
		"\u0641\3\2\2\2\u0647\u0644\3\2\2\2\u0648\u00b3\3\2\2\2\u0649\u064a\5\u00b6"+
		"\\\2\u064a\u064b\b[\1\2\u064b\u0650\3\2\2\2\u064c\u064d\5\u00d2j\2\u064d"+
		"\u064e\b[\1\2\u064e\u0650\3\2\2\2\u064f\u0649\3\2\2\2\u064f\u064c\3\2"+
		"\2\2\u0650\u0653\3\2\2\2\u0651\u064f\3\2\2\2\u0651\u0652\3\2\2\2\u0652"+
		"\u0654\3\2\2\2\u0653\u0651\3\2\2\2\u0654\u0655\b[\1\2\u0655\u0656\7\36"+
		"\2\2\u0656\u065a\7k\2\2\u0657\u0658\5N(\2\u0658\u0659\b[\1\2\u0659\u065b"+
		"\3\2\2\2\u065a\u0657\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u065f\3\2\2\2\u065c"+
		"\u065d\5\u00b8]\2\u065d\u065e\b[\1\2\u065e\u0660\3\2\2\2\u065f\u065c\3"+
		"\2\2\2\u065f\u0660\3\2\2\2\u0660\u0661\3\2\2\2\u0661\u0662\b[\1\2\u0662"+
		"\u0663\5\u00ba^\2\u0663\u00b5\3\2\2\2\u0664\u0665\7%\2\2\u0665\u0671\b"+
		"\\\1\2\u0666\u0667\7$\2\2\u0667\u0671\b\\\1\2\u0668\u0669\7#\2\2\u0669"+
		"\u0671\b\\\1\2\u066a\u066b\7\3\2\2\u066b\u0671\b\\\1\2\u066c\u066d\7("+
		"\2\2\u066d\u0671\b\\\1\2\u066e\u066f\7)\2\2\u066f\u0671\b\\\1\2\u0670"+
		"\u0664\3\2\2\2\u0670\u0666\3\2\2\2\u0670\u0668\3\2\2\2\u0670\u066a\3\2"+
		"\2\2\u0670\u066c\3\2\2\2\u0670\u066e\3\2\2\2\u0671\u00b7\3\2\2\2\u0672"+
		"\u0673\7\23\2\2\u0673\u0674\5V,\2\u0674\u0675\b]\1\2\u0675\u00b9\3\2\2"+
		"\2\u0676\u067a\7@\2\2\u0677\u0679\5\u00bc_\2\u0678\u0677\3\2\2\2\u0679"+
		"\u067c\3\2\2\2\u067a\u0678\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u067d\3\2"+
		"\2\2\u067c\u067a\3\2\2\2\u067d\u067e\7A\2\2\u067e\u067f\b^\1\2\u067f\u00bb"+
		"\3\2\2\2\u0680\u068c\5\u00be`\2\u0681\u0682\5\u00c2b\2\u0682\u0683\b_"+
		"\1\2\u0683\u068c\3\2\2\2\u0684\u0685\5H%\2\u0685\u0686\b_\1\2\u0686\u068c"+
		"\3\2\2\2\u0687\u0688\5\u00b2Z\2\u0688\u0689\b_\1\2\u0689\u068c\3\2\2\2"+
		"\u068a\u068c\7D\2\2\u068b\u0680\3\2\2\2\u068b\u0681\3\2\2\2\u068b\u0684"+
		"\3\2\2\2\u068b\u0687\3\2\2\2\u068b\u068a\3\2\2\2\u068c\u00bd\3\2\2\2\u068d"+
		"\u068e\5\u00c0a\2\u068e\u068f\b`\1\2\u068f\u0694\3\2\2\2\u0690\u0691\5"+
		"\u00d2j\2\u0691\u0692\b`\1\2\u0692\u0694\3\2\2\2\u0693\u068d\3\2\2\2\u0693"+
		"\u0690\3\2\2\2\u0694\u0697\3\2\2\2\u0695\u0693\3\2\2\2\u0695\u0696\3\2"+
		"\2\2\u0696\u0698\3\2\2\2\u0697\u0695\3\2\2\2\u0698\u0699\b`\1\2\u0699"+
		"\u069a\5l\67\2\u069a\u069b\5b\62\2\u069b\u069c\7D\2\2\u069c\u00bf\3\2"+
		"\2\2\u069d\u069e\7%\2\2\u069e\u06a4\ba\1\2\u069f\u06a0\7(\2\2\u06a0\u06a4"+
		"\ba\1\2\u06a1\u06a2\7\24\2\2\u06a2\u06a4\ba\1\2\u06a3\u069d\3\2\2\2\u06a3"+
		"\u069f\3\2\2\2\u06a3\u06a1\3\2\2\2\u06a4\u00c1\3\2\2\2\u06a5\u06a6\5\u00c4"+
		"c\2\u06a6\u06a7\bb\1\2\u06a7\u06ac\3\2\2\2\u06a8\u06a9\5\u00d2j\2\u06a9"+
		"\u06aa\bb\1\2\u06aa\u06ac\3\2\2\2\u06ab\u06a5\3\2\2\2\u06ab\u06a8\3\2"+
		"\2\2\u06ac\u06af\3\2\2\2\u06ad\u06ab\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae"+
		"\u06b0\3\2\2\2\u06af\u06ad\3\2\2\2\u06b0\u06b1\bb\1\2\u06b1\u06b2\bb\1"+
		"\2\u06b2\u06b3\5\u0080A\2\u06b3\u06b4\5\u0098M\2\u06b4\u06b5\bb\1\2\u06b5"+
		"\u00c3\3\2\2\2\u06b6\u06b7\7%\2\2\u06b7\u06c1\bc\1\2\u06b8\u06b9\7\3\2"+
		"\2\u06b9\u06c1\bc\1\2\u06ba\u06bb\7\16\2\2\u06bb\u06c1\bc\1\2\u06bc\u06bd"+
		"\7(\2\2\u06bd\u06c1\bc\1\2\u06be\u06bf\7)\2\2\u06bf\u06c1\bc\1\2\u06c0"+
		"\u06b6\3\2\2\2\u06c0\u06b8\3\2\2\2\u06c0\u06ba\3\2\2\2\u06c0\u06bc\3\2"+
		"\2\2\u06c0\u06be\3\2\2\2\u06c1\u00c5\3\2\2\2\u06c2\u06c3\5\u00b6\\\2\u06c3"+
		"\u06c4\bd\1\2\u06c4\u06c9\3\2\2\2\u06c5\u06c6\5\u00d2j\2\u06c6\u06c7\b"+
		"d\1\2\u06c7\u06c9\3\2\2\2\u06c8\u06c2\3\2\2\2\u06c8\u06c5\3\2\2\2\u06c9"+
		"\u06cc\3\2\2\2\u06ca\u06c8\3\2\2\2\u06ca\u06cb\3\2\2\2\u06cb\u06cd\3\2"+
		"\2\2\u06cc\u06ca\3\2\2\2\u06cd\u06ce\7l\2\2\u06ce\u06cf\7\36\2\2\u06cf"+
		"\u06d0\7k\2\2\u06d0\u06d1\bd\1\2\u06d1\u06d2\5\u00c8e\2\u06d2\u00c7\3"+
		"\2\2\2\u06d3\u06d7\7@\2\2\u06d4\u06d6\5\u00caf\2\u06d5\u06d4\3\2\2\2\u06d6"+
		"\u06d9\3\2\2\2\u06d7\u06d5\3\2\2\2\u06d7\u06d8\3\2\2\2\u06d8\u06da\3\2"+
		"\2\2\u06d9\u06d7\3\2\2\2\u06da\u06db\7A\2\2\u06db\u06dc\be\1\2\u06dc\u00c9"+
		"\3\2\2\2\u06dd\u06de\5\u00ccg\2\u06de\u06df\bf\1\2\u06df\u06e9\3\2\2\2"+
		"\u06e0\u06e9\5\u00be`\2\u06e1\u06e2\5H%\2\u06e2\u06e3\bf\1\2\u06e3\u06e9"+
		"\3\2\2\2\u06e4\u06e5\5\u00b2Z\2\u06e5\u06e6\bf\1\2\u06e6\u06e9\3\2\2\2"+
		"\u06e7\u06e9\7D\2\2\u06e8\u06dd\3\2\2\2\u06e8\u06e0\3\2\2\2\u06e8\u06e1"+
		"\3\2\2\2\u06e8\u06e4\3\2\2\2\u06e8\u06e7\3\2\2\2\u06e9\u00cb\3\2\2\2\u06ea"+
		"\u06eb\5\u00ceh\2\u06eb\u06ec\bg\1\2\u06ec\u06f1\3\2\2\2\u06ed\u06ee\5"+
		"\u00d2j\2\u06ee\u06ef\bg\1\2\u06ef\u06f1\3\2\2\2\u06f0\u06ea\3\2\2\2\u06f0"+
		"\u06ed\3\2\2\2\u06f1\u06f4\3\2\2\2\u06f2\u06f0\3\2\2\2\u06f2\u06f3\3\2"+
		"\2\2\u06f3\u06f5\3\2\2\2\u06f4\u06f2\3\2\2\2\u06f5\u06f6\bg\1\2\u06f6"+
		"\u06f7\5l\67\2\u06f7\u06f8\7k\2\2\u06f8\u06f9\7>\2\2\u06f9\u06fd\7?\2"+
		"\2\u06fa\u06fb\5\32\16\2\u06fb\u06fc\bg\1\2\u06fc\u06fe\3\2\2\2\u06fd"+
		"\u06fa\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u0702\3\2\2\2\u06ff\u0700\5\u00d0"+
		"i\2\u0700\u0701\bg\1\2\u0701\u0703\3\2\2\2\u0702\u06ff\3\2\2\2\u0702\u0703"+
		"\3\2\2\2\u0703\u0704\3\2\2\2\u0704\u0705\7D\2\2\u0705\u0706\bg\1\2\u0706"+
		"\u00cd\3\2\2\2\u0707\u0708\7%\2\2\u0708\u070c\bh\1\2\u0709\u070a\7\3\2"+
		"\2\u070a\u070c\bh\1\2\u070b\u0707\3\2\2\2\u070b\u0709\3\2\2\2\u070c\u00cf"+
		"\3\2\2\2\u070d\u070e\7\16\2\2\u070e\u070f\5\u00dan\2\u070f\u0710\bi\1"+
		"\2\u0710\u00d1\3\2\2\2\u0711\u0712\5\u00d4k\2\u0712\u0713\bj\1\2\u0713"+
		"\u071b\3\2\2\2\u0714\u0715\5\u00e0q\2\u0715\u0716\bj\1\2\u0716\u071b\3"+
		"\2\2\2\u0717\u0718\5\u00e2r\2\u0718\u0719\bj\1\2\u0719\u071b\3\2\2\2\u071a"+
		"\u0711\3\2\2\2\u071a\u0714\3\2\2\2\u071a\u0717\3\2\2\2\u071b\u00d3\3\2"+
		"\2\2\u071c\u071d\7l\2\2\u071d\u071e\5.\30\2\u071e\u071f\bk\1\2\u071f\u0721"+
		"\7>\2\2\u0720\u0722\5\u00d6l\2\u0721\u0720\3\2\2\2\u0721\u0722\3\2\2\2"+
		"\u0722\u0723\3\2\2\2\u0723\u0724\7?\2\2\u0724\u0725\bk\1\2\u0725\u00d5"+
		"\3\2\2\2\u0726\u072b\5\u00d8m\2\u0727\u0728\7E\2\2\u0728\u072a\5\u00d8"+
		"m\2\u0729\u0727\3\2\2\2\u072a\u072d\3\2\2\2\u072b\u0729\3\2\2\2\u072b"+
		"\u072c\3\2\2\2\u072c\u00d7\3\2\2\2\u072d\u072b\3\2\2\2\u072e\u072f\7k"+
		"\2\2\u072f\u0730\7G\2\2\u0730\u0731\5\u00dan\2\u0731\u0732\bm\1\2\u0732"+
		"\u00d9\3\2\2\2\u0733\u0734\5\u019a\u00ce\2\u0734\u0735\bn\1\2\u0735\u073d"+
		"\3\2\2\2\u0736\u0737\5\u00dco\2\u0737\u0738\bn\1\2\u0738\u073d\3\2\2\2"+
		"\u0739\u073a\5\u00d2j\2\u073a\u073b\bn\1\2\u073b\u073d\3\2\2\2\u073c\u0733"+
		"\3\2\2\2\u073c\u0736\3\2\2\2\u073c\u0739\3\2\2\2\u073d\u00db\3\2\2\2\u073e"+
		"\u0742\7@\2\2\u073f\u0740\5\u00dep\2\u0740\u0741\bo\1\2\u0741\u0743\3"+
		"\2\2\2\u0742\u073f\3\2\2\2\u0742\u0743\3\2\2\2\u0743\u0745\3\2\2\2\u0744"+
		"\u0746\7E\2\2\u0745\u0744\3\2\2\2\u0745\u0746\3\2\2\2\u0746\u0747\3\2"+
		"\2\2\u0747\u0748\7A\2\2\u0748\u0749\bo\1\2\u0749\u00dd\3\2\2\2\u074a\u074b"+
		"\5\u00dan\2\u074b\u074c\bp\1\2\u074c\u0753\3\2\2\2\u074d\u074e\7E\2\2"+
		"\u074e\u074f\5\u00dan\2\u074f\u0750\bp\1\2\u0750\u0752\3\2\2\2\u0751\u074d"+
		"\3\2\2\2\u0752\u0755\3\2\2\2\u0753\u0751\3\2\2\2\u0753\u0754\3\2\2\2\u0754"+
		"\u0756\3\2\2\2\u0755\u0753\3\2\2\2\u0756\u0757\bp\1\2\u0757\u00df\3\2"+
		"\2\2\u0758\u0759\7l\2\2\u0759\u075a\5.\30\2\u075a\u075b\bq\1\2\u075b\u00e1"+
		"\3\2\2\2\u075c\u075d\7l\2\2\u075d\u075e\5.\30\2\u075e\u075f\7>\2\2\u075f"+
		"\u0760\5\u00dan\2\u0760\u0761\7?\2\2\u0761\u0762\br\1\2\u0762\u00e3\3"+
		"\2\2\2\u0763\u0767\7@\2\2\u0764\u0765\5\u00e6t\2\u0765\u0766\bs\1\2\u0766"+
		"\u0768\3\2\2\2\u0767\u0764\3\2\2\2\u0767\u0768\3\2\2\2\u0768\u076a\3\2"+
		"\2\2\u0769\u076b\7E\2\2\u076a\u0769\3\2\2\2\u076a\u076b\3\2\2\2\u076b"+
		"\u076c\3\2\2\2\u076c\u076d\7A\2\2\u076d\u077a\bs\1\2\u076e\u0772\7B\2"+
		"\2\u076f\u0770\5\u00e6t\2\u0770\u0771\bs\1\2\u0771\u0773\3\2\2\2\u0772"+
		"\u076f\3\2\2\2\u0772\u0773\3\2\2\2\u0773\u0775\3\2\2\2\u0774\u0776\7E"+
		"\2\2\u0775\u0774\3\2\2\2\u0775\u0776\3\2\2\2\u0776\u0777\3\2\2\2\u0777"+
		"\u0778\7C\2\2\u0778\u077a\bs\1\2\u0779\u0763\3\2\2\2\u0779\u076e\3\2\2"+
		"\2\u077a\u00e5\3\2\2\2\u077b\u077c\5j\66\2\u077c\u077d\bt\1\2\u077d\u0784"+
		"\3\2\2\2\u077e\u077f\7E\2\2\u077f\u0780\5j\66\2\u0780\u0781\bt\1\2\u0781"+
		"\u0783\3\2\2\2\u0782\u077e\3\2\2\2\u0783\u0786\3\2\2\2\u0784\u0782\3\2"+
		"\2\2\u0784\u0785\3\2\2\2\u0785\u0787\3\2\2\2\u0786\u0784\3\2\2\2\u0787"+
		"\u0788\bt\1\2\u0788\u00e7\3\2\2\2\u0789\u078a\bu\1\2\u078a\u078e\7@\2"+
		"\2\u078b\u078c\5\u00eav\2\u078c\u078d\bu\1\2\u078d\u078f\3\2\2\2\u078e"+
		"\u078b\3\2\2\2\u078e\u078f\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u0791\7A"+
		"\2\2\u0791\u0792\bu\1\2\u0792\u00e9\3\2\2\2\u0793\u0794\5\u00ecw\2\u0794"+
		"\u0795\bv\1\2\u0795\u079b\3\2\2\2\u0796\u0797\5\u00ecw\2\u0797\u0798\b"+
		"v\1\2\u0798\u079a\3\2\2\2\u0799\u0796\3\2\2\2\u079a\u079d\3\2\2\2\u079b"+
		"\u0799\3\2\2\2\u079b\u079c\3\2\2\2\u079c\u079e\3\2\2\2\u079d\u079b\3\2"+
		"\2\2\u079e\u079f\bv\1\2\u079f\u00eb\3\2\2\2\u07a0\u07a1\5\u00eex\2\u07a1"+
		"\u07a2\bw\1\2\u07a2\u07aa\3\2\2\2\u07a3\u07a4\5H%\2\u07a4\u07a5\bw\1\2"+
		"\u07a5\u07aa\3\2\2\2\u07a6\u07a7\5\u00f2z\2\u07a7\u07a8\bw\1\2\u07a8\u07aa"+
		"\3\2\2\2\u07a9\u07a0\3\2\2\2\u07a9\u07a3\3\2\2\2\u07a9\u07a6\3\2\2\2\u07aa"+
		"\u00ed\3\2\2\2\u07ab\u07ac\5\u00f0y\2\u07ac\u07ad\7D\2\2\u07ad\u07ae\b"+
		"x\1\2\u07ae\u00ef\3\2\2\2\u07af\u07b0\5\u008cG\2\u07b0\u07b1\by\1\2\u07b1"+
		"\u07b6\3\2\2\2\u07b2\u07b3\5\u00d2j\2\u07b3\u07b4\by\1\2\u07b4\u07b6\3"+
		"\2\2\2\u07b5\u07af\3\2\2\2\u07b5\u07b2\3\2\2\2\u07b6\u07b9\3\2\2\2\u07b7"+
		"\u07b5\3\2\2\2\u07b7\u07b8\3\2\2\2\u07b8\u07ba\3\2\2\2\u07b9\u07b7\3\2"+
		"\2\2\u07ba\u07bb\5l\67\2\u07bb\u07bc\5b\62\2\u07bc\u07bd\by\1\2\u07bd"+
		"\u00f1\3\2\2\2\u07be\u07bf\5\u00f6|\2\u07bf\u07c0\bz\1\2\u07c0\u07d1\3"+
		"\2\2\2\u07c1\u07c2\5\u00fa~\2\u07c2\u07c3\bz\1\2\u07c3\u07d1\3\2\2\2\u07c4"+
		"\u07c5\5\u0102\u0082\2\u07c5\u07c6\bz\1\2\u07c6\u07d1\3\2\2\2\u07c7\u07c8"+
		"\5\u0104\u0083\2\u07c8\u07c9\bz\1\2\u07c9\u07d1\3\2\2\2\u07ca\u07cb\5"+
		"\u0114\u008b\2\u07cb\u07cc\bz\1\2\u07cc\u07d1\3\2\2\2\u07cd\u07ce\5\u011a"+
		"\u008e\2\u07ce\u07cf\bz\1\2\u07cf\u07d1\3\2\2\2\u07d0\u07be\3\2\2\2\u07d0"+
		"\u07c1\3\2\2\2\u07d0\u07c4\3\2\2\2\u07d0\u07c7\3\2\2\2\u07d0\u07ca\3\2"+
		"\2\2\u07d0\u07cd\3\2\2\2\u07d1\u00f3\3\2\2\2\u07d2\u07d3\5\u00f6|\2\u07d3"+
		"\u07d4\b{\1\2\u07d4\u07e2\3\2\2\2\u07d5\u07d6\5\u00fc\177\2\u07d6\u07d7"+
		"\b{\1\2\u07d7\u07e2\3\2\2\2\u07d8\u07d9\5\u0106\u0084\2\u07d9\u07da\b"+
		"{\1\2\u07da\u07e2\3\2\2\2\u07db\u07dc\5\u0116\u008c\2\u07dc\u07dd\b{\1"+
		"\2\u07dd\u07e2\3\2\2\2\u07de\u07df\5\u011c\u008f\2\u07df\u07e0\b{\1\2"+
		"\u07e0\u07e2\3\2\2\2\u07e1\u07d2\3\2\2\2\u07e1\u07d5\3\2\2\2\u07e1\u07d8"+
		"\3\2\2\2\u07e1\u07db\3\2\2\2\u07e1\u07de\3\2\2\2\u07e2\u00f5\3\2\2\2\u07e3"+
		"\u07e4\5\u00e8u\2\u07e4\u07e5\b|\1\2\u07e5\u0808\3\2\2\2\u07e6\u07e7\5"+
		"\u00f8}\2\u07e7\u07e8\b|\1\2\u07e8\u0808\3\2\2\2\u07e9\u07ea\5\u00fe\u0080"+
		"\2\u07ea\u07eb\b|\1\2\u07eb\u0808\3\2\2\2\u07ec\u07ed\5\u0108\u0085\2"+
		"\u07ed\u07ee\b|\1\2\u07ee\u0808\3\2\2\2\u07ef\u07f0\5\u010a\u0086\2\u07f0"+
		"\u07f1\b|\1\2\u07f1\u0808\3\2\2\2\u07f2\u07f3\5\u0118\u008d\2\u07f3\u07f4"+
		"\b|\1\2\u07f4\u0808\3\2\2\2\u07f5\u07f6\5\u012c\u0097\2\u07f6\u07f7\b"+
		"|\1\2\u07f7\u0808\3\2\2\2\u07f8\u07f9\5\u012e\u0098\2\u07f9\u07fa\b|\1"+
		"\2\u07fa\u0808\3\2\2\2\u07fb\u07fc\5\u0130\u0099\2\u07fc\u07fd\b|\1\2"+
		"\u07fd\u0808\3\2\2\2\u07fe\u07ff\5\u0134\u009b\2\u07ff\u0800\b|\1\2\u0800"+
		"\u0808\3\2\2\2\u0801\u0802\5\u0132\u009a\2\u0802\u0803\b|\1\2\u0803\u0808"+
		"\3\2\2\2\u0804\u0805\5\u0136\u009c\2\u0805\u0806\b|\1\2\u0806\u0808\3"+
		"\2\2\2\u0807\u07e3\3\2\2\2\u0807\u07e6\3\2\2\2\u0807\u07e9\3\2\2\2\u0807"+
		"\u07ec\3\2\2\2\u0807\u07ef\3\2\2\2\u0807\u07f2\3\2\2\2\u0807\u07f5\3\2"+
		"\2\2\u0807\u07f8\3\2\2\2\u0807\u07fb\3\2\2\2\u0807\u07fe\3\2\2\2\u0807"+
		"\u0801\3\2\2\2\u0807\u0804\3\2\2\2\u0808\u00f7\3\2\2\2\u0809\u080a\7D"+
		"\2\2\u080a\u080b\b}\1\2\u080b\u00f9\3\2\2\2\u080c\u080d\7k\2\2\u080d\u080e"+
		"\7M\2\2\u080e\u080f\5\u00f2z\2\u080f\u0810\b~\1\2\u0810\u00fb\3\2\2\2"+
		"\u0811\u0812\7k\2\2\u0812\u0813\7M\2\2\u0813\u0814\5\u00f4{\2\u0814\u0815"+
		"\b\177\1\2\u0815\u00fd\3\2\2\2\u0816\u0817\5\u0100\u0081\2\u0817\u0818"+
		"\7D\2\2\u0818\u0819\b\u0080\1\2\u0819\u00ff\3\2\2\2\u081a\u081b\5\u0194"+
		"\u00cb\2\u081b\u081c\b\u0081\1\2\u081c\u0830\3\2\2\2\u081d\u081e\5\u01b2"+
		"\u00da\2\u081e\u081f\b\u0081\1\2\u081f\u0830\3\2\2\2\u0820\u0821\5\u01b4"+
		"\u00db\2\u0821\u0822\b\u0081\1\2\u0822\u0830\3\2\2\2\u0823\u0824\5\u01ba"+
		"\u00de\2\u0824\u0825\b\u0081\1\2\u0825\u0830\3\2\2\2\u0826\u0827\5\u01bc"+
		"\u00df\2\u0827\u0828\b\u0081\1\2\u0828\u0830\3\2\2\2\u0829\u082a\5\u0172"+
		"\u00ba\2\u082a\u082b\b\u0081\1\2\u082b\u0830\3\2\2\2\u082c\u082d\5\u015e"+
		"\u00b0\2\u082d\u082e\b\u0081\1\2\u082e\u0830\3\2\2\2\u082f\u081a\3\2\2"+
		"\2\u082f\u081d\3\2\2\2\u082f\u0820\3\2\2\2\u082f\u0823\3\2\2\2\u082f\u0826"+
		"\3\2\2\2\u082f\u0829\3\2\2\2\u082f\u082c\3\2\2\2\u0830\u0101\3\2\2\2\u0831"+
		"\u0832\7\30\2\2\u0832\u0833\7>\2\2\u0833\u0834\5\u0188\u00c5\2\u0834\u0835"+
		"\7?\2\2\u0835\u0836\5\u00f2z\2\u0836\u0837\b\u0082\1\2\u0837\u0103\3\2"+
		"\2\2\u0838\u0839\7\30\2\2\u0839\u083a\7>\2\2\u083a\u083b\5\u0188\u00c5"+
		"\2\u083b\u083c\7?\2\2\u083c\u083d\5\u00f4{\2\u083d\u083e\7\21\2\2\u083e"+
		"\u083f\5\u00f2z\2\u083f\u0840\b\u0083\1\2\u0840\u0105\3\2\2\2\u0841\u0842"+
		"\7\30\2\2\u0842\u0843\7>\2\2\u0843\u0844\5\u0188\u00c5\2\u0844\u0845\7"+
		"?\2\2\u0845\u0846\5\u00f4{\2\u0846\u0847\7\21\2\2\u0847\u0848\5\u00f4"+
		"{\2\u0848\u0849\b\u0084\1\2\u0849\u0107\3\2\2\2\u084a\u084b\7\4\2\2\u084b"+
		"\u084c\5\u0188\u00c5\2\u084c\u084d\7D\2\2\u084d\u084e\b\u0085\1\2\u084e"+
		"\u0857\3\2\2\2\u084f\u0850\7\4\2\2\u0850\u0851\5\u0188\u00c5\2\u0851\u0852"+
		"\7M\2\2\u0852\u0853\5\u0188\u00c5\2\u0853\u0854\7D\2\2\u0854\u0855\b\u0085"+
		"\1\2\u0855\u0857\3\2\2\2\u0856\u084a\3\2\2\2\u0856\u084f\3\2\2\2\u0857"+
		"\u0109\3\2\2\2\u0858\u0859\7+\2\2\u0859\u085a\7>\2\2\u085a\u085b\5\u0188"+
		"\u00c5\2\u085b\u085c\7?\2\2\u085c\u085d\5\u010c\u0087\2\u085d\u085e\b"+
		"\u0086\1\2\u085e\u010b\3\2\2\2\u085f\u0865\7@\2\2\u0860\u0861\5\u010e"+
		"\u0088\2\u0861\u0862\b\u0087\1\2\u0862\u0864\3\2\2\2\u0863\u0860\3\2\2"+
		"\2\u0864\u0867\3\2\2\2\u0865\u0863\3\2\2\2\u0865\u0866\3\2\2\2\u0866\u086d"+
		"\3\2\2\2\u0867\u0865\3\2\2\2\u0868\u0869\5\u0112\u008a\2\u0869\u086a\b"+
		"\u0087\1\2\u086a\u086c\3\2\2\2\u086b\u0868\3\2\2\2\u086c\u086f\3\2\2\2"+
		"\u086d\u086b\3\2\2\2\u086d\u086e\3\2\2\2\u086e\u0870\3\2\2\2\u086f\u086d"+
		"\3\2\2\2\u0870\u0871\7A\2\2\u0871\u0872\b\u0087\1\2\u0872\u0873\b\u0087"+
		"\1\2\u0873\u010d\3\2\2\2\u0874\u0875\5\u0110\u0089\2\u0875\u0876\5\u00ea"+
		"v\2\u0876\u0877\b\u0088\1\2\u0877\u010f\3\2\2\2\u0878\u0879\5\u0112\u008a"+
		"\2\u0879\u087a\b\u0089\1\2\u087a\u0880\3\2\2\2\u087b\u087c\5\u0112\u008a"+
		"\2\u087c\u087d\b\u0089\1\2\u087d\u087f\3\2\2\2\u087e\u087b\3\2\2\2\u087f"+
		"\u0882\3\2\2\2\u0880\u087e\3\2\2\2\u0880\u0881\3\2\2\2\u0881\u0883\3\2"+
		"\2\2\u0882\u0880\3\2\2\2\u0883\u0884\b\u0089\1\2\u0884\u0111\3\2\2\2\u0885"+
		"\u0886\7\b\2\2\u0886\u0887\5\u0186\u00c4\2\u0887\u0888\7M\2\2\u0888\u0889"+
		"\b\u008a\1\2\u0889\u0892\3\2\2\2\u088a\u088b\7\b\2\2\u088b\u088c\7k\2"+
		"\2\u088c\u088d\7M\2\2\u088d\u0892\b\u008a\1\2\u088e\u088f\7\16\2\2\u088f"+
		"\u0890\7M\2\2\u0890\u0892\b\u008a\1\2\u0891\u0885\3\2\2\2\u0891\u088a"+
		"\3\2\2\2\u0891\u088e\3\2\2\2\u0892\u0113\3\2\2\2\u0893\u0894\7\64\2\2"+
		"\u0894\u0895\7>\2\2\u0895\u0896\5\u0188\u00c5\2\u0896\u0897\7?\2\2\u0897"+
		"\u0898\5\u00f2z\2\u0898\u0899\b\u008b\1\2\u0899\u0115\3\2\2\2\u089a\u089b"+
		"\7\64\2\2\u089b\u089c\7>\2\2\u089c\u089d\5\u0188\u00c5\2\u089d\u089e\7"+
		"?\2\2\u089e\u089f\5\u00f4{\2\u089f\u08a0\b\u008c\1\2\u08a0\u0117\3\2\2"+
		"\2\u08a1\u08a2\7\17\2\2\u08a2\u08a3\5\u00f2z\2\u08a3\u08a4\7\64\2\2\u08a4"+
		"\u08a5\7>\2\2\u08a5\u08a6\5\u0188\u00c5\2\u08a6\u08a7\7?\2\2\u08a7\u08a8"+
		"\7D\2\2";
	private static final String _serializedATNSegment1 =
		"\u08a8\u08a9\b\u008d\1\2\u08a9\u0119\3\2\2\2\u08aa\u08ab\5\u011e\u0090"+
		"\2\u08ab\u08ac\b\u008e\1\2\u08ac\u08b1\3\2\2\2\u08ad\u08ae\5\u0128\u0095"+
		"\2\u08ae\u08af\b\u008e\1\2\u08af\u08b1\3\2\2\2\u08b0\u08aa\3\2\2\2\u08b0"+
		"\u08ad\3\2\2\2\u08b1\u011b\3\2\2\2\u08b2\u08b3\5\u0120\u0091\2\u08b3\u08b4"+
		"\b\u008f\1\2\u08b4\u08b9\3\2\2\2\u08b5\u08b6\5\u012a\u0096\2\u08b6\u08b7"+
		"\b\u008f\1\2\u08b7\u08b9\3\2\2\2\u08b8\u08b2\3\2\2\2\u08b8\u08b5\3\2\2"+
		"\2\u08b9\u011d\3\2\2\2\u08ba\u08bb\7\27\2\2\u08bb\u08bf\7>\2\2\u08bc\u08bd"+
		"\5\u0122\u0092\2\u08bd\u08be\b\u0090\1\2\u08be\u08c0\3\2\2\2\u08bf\u08bc"+
		"\3\2\2\2\u08bf\u08c0\3\2\2\2\u08c0\u08c1\3\2\2\2\u08c1\u08c5\7D\2\2\u08c2"+
		"\u08c3\5\u0188\u00c5\2\u08c3\u08c4\b\u0090\1\2\u08c4\u08c6\3\2\2\2\u08c5"+
		"\u08c2\3\2\2\2\u08c5\u08c6\3\2\2\2\u08c6\u08c7\3\2\2\2\u08c7\u08cb\7D"+
		"\2\2\u08c8\u08c9\5\u0124\u0093\2\u08c9\u08ca\b\u0090\1\2\u08ca\u08cc\3"+
		"\2\2\2\u08cb\u08c8\3\2\2\2\u08cb\u08cc\3\2\2\2\u08cc\u08cd\3\2\2\2\u08cd"+
		"\u08ce\7?\2\2\u08ce\u08cf\5\u00f2z\2\u08cf\u08d0\b\u0090\1\2\u08d0\u011f"+
		"\3\2\2\2\u08d1\u08d2\7\27\2\2\u08d2\u08d6\7>\2\2\u08d3\u08d4\5\u0122\u0092"+
		"\2\u08d4\u08d5\b\u0091\1\2\u08d5\u08d7\3\2\2\2\u08d6\u08d3\3\2\2\2\u08d6"+
		"\u08d7\3\2\2\2\u08d7\u08d8\3\2\2\2\u08d8\u08dc\7D\2\2\u08d9\u08da\5\u0188"+
		"\u00c5\2\u08da\u08db\b\u0091\1\2\u08db\u08dd\3\2\2\2\u08dc\u08d9\3\2\2"+
		"\2\u08dc\u08dd\3\2\2\2\u08dd\u08de\3\2\2\2\u08de\u08e2\7D\2\2\u08df\u08e0"+
		"\5\u0124\u0093\2\u08e0\u08e1\b\u0091\1\2\u08e1\u08e3\3\2\2\2\u08e2\u08df"+
		"\3\2\2\2\u08e2\u08e3\3\2\2\2\u08e3\u08e4\3\2\2\2\u08e4\u08e5\7?\2\2\u08e5"+
		"\u08e6\5\u00f4{\2\u08e6\u08e7\b\u0091\1\2\u08e7\u0121\3\2\2\2\u08e8\u08e9"+
		"\5\u0126\u0094\2\u08e9\u08ea\b\u0092\1\2\u08ea\u08ef\3\2\2\2\u08eb\u08ec"+
		"\5\u00f0y\2\u08ec\u08ed\b\u0092\1\2\u08ed\u08ef\3\2\2\2\u08ee\u08e8\3"+
		"\2\2\2\u08ee\u08eb\3\2\2\2\u08ef\u0123\3\2\2\2\u08f0\u08f1\5\u0126\u0094"+
		"\2\u08f1\u08f2\b\u0093\1\2\u08f2\u0125\3\2\2\2\u08f3\u08f4\5\u0100\u0081"+
		"\2\u08f4\u08f5\b\u0094\1\2\u08f5\u08fc\3\2\2\2\u08f6\u08f7\7E\2\2\u08f7"+
		"\u08f8\5\u0100\u0081\2\u08f8\u08f9\b\u0094\1\2\u08f9\u08fb\3\2\2\2\u08fa"+
		"\u08f6\3\2\2\2\u08fb\u08fe\3\2\2\2\u08fc\u08fa\3\2\2\2\u08fc\u08fd\3\2"+
		"\2\2\u08fd\u08ff\3\2\2\2\u08fe\u08fc\3\2\2\2\u08ff\u0900\b\u0094\1\2\u0900"+
		"\u0127\3\2\2\2\u0901\u0902\7\27\2\2\u0902\u090b\7>\2\2\u0903\u0904\5\u008c"+
		"G\2\u0904\u0905\b\u0095\1\2\u0905\u090a\3\2\2\2\u0906\u0907\5\u00d2j\2"+
		"\u0907\u0908\b\u0095\1\2\u0908\u090a\3\2\2\2\u0909\u0903\3\2\2\2\u0909"+
		"\u0906\3\2\2\2\u090a\u090d\3\2\2\2\u090b\u0909\3\2\2\2\u090b\u090c\3\2"+
		"\2\2\u090c\u090e\3\2\2\2\u090d\u090b\3\2\2\2\u090e\u090f\5h\65\2\u090f"+
		"\u0910\7M\2\2\u0910\u0911\5\u0188\u00c5\2\u0911\u0912\7?\2\2\u0912\u0913"+
		"\5\u00f2z\2\u0913\u0914\b\u0095\1\2\u0914\u0129\3\2\2\2\u0915\u0916\7"+
		"\27\2\2\u0916\u091f\7>\2\2\u0917\u0918\5\u008cG\2\u0918\u0919\b\u0096"+
		"\1\2\u0919\u091e\3\2\2\2\u091a\u091b\5\u00d2j\2\u091b\u091c\b\u0096\1"+
		"\2\u091c\u091e\3\2\2\2\u091d\u0917\3\2\2\2\u091d\u091a\3\2\2\2\u091e\u0921"+
		"\3\2\2\2\u091f\u091d\3\2\2\2\u091f\u0920\3\2\2\2\u0920\u0922\3\2\2\2\u0921"+
		"\u091f\3\2\2\2\u0922\u0923\5h\65\2\u0923\u0924\7M\2\2\u0924\u0925\5\u0188"+
		"\u00c5\2\u0925\u0926\7?\2\2\u0926\u0927\5\u00f4{\2\u0927\u0928\b\u0096"+
		"\1\2\u0928\u012b\3\2\2\2\u0929\u092c\7\6\2\2\u092a\u092b\7k\2\2\u092b"+
		"\u092d\b\u0097\1\2\u092c\u092a\3\2\2\2\u092c\u092d\3\2\2\2\u092d\u092e"+
		"\3\2\2\2\u092e\u092f\7D\2\2\u092f\u0930\b\u0097\1\2\u0930\u012d\3\2\2"+
		"\2\u0931\u0934\7\r\2\2\u0932\u0933\7k\2\2\u0933\u0935\b\u0098\1\2\u0934"+
		"\u0932\3\2\2\2\u0934\u0935\3\2\2\2\u0935\u0936\3\2\2\2\u0936\u0937\7D"+
		"\2\2\u0937\u0938\b\u0098\1\2\u0938\u012f\3\2\2\2\u0939\u093a\7&\2\2\u093a"+
		"\u093b\7D\2\2\u093b\u0942\b\u0099\1\2\u093c\u093d\7&\2\2\u093d\u093e\5"+
		"\u0188\u00c5\2\u093e\u093f\7D\2\2\u093f\u0940\b\u0099\1\2\u0940\u0942"+
		"\3\2\2\2\u0941\u0939\3\2\2\2\u0941\u093c\3\2\2\2\u0942\u0131\3\2\2\2\u0943"+
		"\u0944\7.\2\2\u0944\u0945\5\u0188\u00c5\2\u0945\u0946\7D\2\2\u0946\u0947"+
		"\b\u009a\1\2\u0947\u0133\3\2\2\2\u0948\u0949\7,\2\2\u0949\u094a\7>\2\2"+
		"\u094a\u094b\5\u0188\u00c5\2\u094b\u094c\7?\2\2\u094c\u094d\5\u00e8u\2"+
		"\u094d\u094e\b\u009b\1\2\u094e\u0135\3\2\2\2\u094f\u0950\7\61\2\2\u0950"+
		"\u0951\5\u00e8u\2\u0951\u0952\5\u0138\u009d\2\u0952\u0953\b\u009c\1\2"+
		"\u0953\u0962\3\2\2\2\u0954\u0955\7\61\2\2\u0955\u0959\5\u00e8u\2\u0956"+
		"\u0957\5\u0138\u009d\2\u0957\u0958\b\u009c\1\2\u0958\u095a\3\2\2\2\u0959"+
		"\u0956\3\2\2\2\u0959\u095a\3\2\2\2\u095a\u095b\3\2\2\2\u095b\u095c\5\u0140"+
		"\u00a1\2\u095c\u095d\b\u009c\1\2\u095d\u0962\3\2\2\2\u095e\u095f\5\u0142"+
		"\u00a2\2\u095f\u0960\b\u009c\1\2\u0960\u0962\3\2\2\2\u0961\u094f\3\2\2"+
		"\2\u0961\u0954\3\2\2\2\u0961\u095e\3\2\2\2\u0962\u0137\3\2\2\2\u0963\u0964"+
		"\5\u013a\u009e\2\u0964\u096a\b\u009d\1\2\u0965\u0966\5\u013a\u009e\2\u0966"+
		"\u0967\b\u009d\1\2\u0967\u0969\3\2\2\2\u0968\u0965\3\2\2\2\u0969\u096c"+
		"\3\2\2\2\u096a\u0968\3\2\2\2\u096a\u096b\3\2\2\2\u096b\u096d\3\2\2\2\u096c"+
		"\u096a\3\2\2\2\u096d\u096e\b\u009d\1\2\u096e\u0139\3\2\2\2\u096f\u0970"+
		"\7\t\2\2\u0970\u0971\b\u009e\1\2\u0971\u0972\7>\2\2\u0972\u0973\5\u013c"+
		"\u009f\2\u0973\u0974\7?\2\2\u0974\u0975\5\u00e8u\2\u0975\u0976\b\u009e"+
		"\1\2\u0976\u013b\3\2\2\2\u0977\u0978\5\u008cG\2\u0978\u0979\b\u009f\1"+
		"\2\u0979\u097e\3\2\2\2\u097a\u097b\5\u00d2j\2\u097b\u097c\b\u009f\1\2"+
		"\u097c\u097e\3\2\2\2\u097d\u0977\3\2\2\2\u097d\u097a\3\2\2\2\u097e\u0981"+
		"\3\2\2\2\u097f\u097d\3\2\2\2\u097f\u0980\3\2\2\2\u0980\u0982\3\2\2\2\u0981"+
		"\u097f\3\2\2\2\u0982\u0983\5\u013e\u00a0\2\u0983\u0984\5f\64\2\u0984\u0985"+
		"\b\u009f\1\2\u0985\u013d\3\2\2\2\u0986\u0987\5t;\2\u0987\u0988\b\u00a0"+
		"\1\2\u0988\u098f\3\2\2\2\u0989\u098a\7[\2\2\u098a\u098b\5\22\n\2\u098b"+
		"\u098c\b\u00a0\1\2\u098c\u098e\3\2\2\2\u098d\u0989\3\2\2\2\u098e\u0991"+
		"\3\2\2\2\u098f\u098d\3\2\2\2\u098f\u0990\3\2\2\2\u0990\u013f\3\2\2\2\u0991"+
		"\u098f\3\2\2\2\u0992\u0993\7\25\2\2\u0993\u0994\5\u00e8u\2\u0994\u0995"+
		"\b\u00a1\1\2\u0995\u0141\3\2\2\2\u0996\u0997\7\61\2\2\u0997\u0998\5\u0144"+
		"\u00a3\2\u0998\u099c\5\u00e8u\2\u0999\u099a\5\u0138\u009d\2\u099a\u099b"+
		"\b\u00a2\1\2\u099b\u099d\3\2\2\2\u099c\u0999\3\2\2\2\u099c\u099d\3\2\2"+
		"\2\u099d\u09a1\3\2\2\2\u099e\u099f\5\u0140\u00a1\2\u099f\u09a0\b\u00a2"+
		"\1\2\u09a0\u09a2\3\2\2\2\u09a1\u099e\3\2\2\2\u09a1\u09a2\3\2\2\2\u09a2"+
		"\u09a3\3\2\2\2\u09a3\u09a4\b\u00a2\1\2\u09a4\u0143\3\2\2\2\u09a5\u09a6"+
		"\b\u00a3\1\2\u09a6\u09ad\7>\2\2\u09a7\u09a9\5\u0146\u00a4\2\u09a8\u09aa"+
		"\7D\2\2\u09a9\u09a8\3\2\2\2\u09a9\u09aa\3\2\2\2\u09aa\u09ab\3\2\2\2\u09ab"+
		"\u09ac\b\u00a3\1\2\u09ac\u09ae\3\2\2\2\u09ad\u09a7\3\2\2\2\u09ad\u09ae"+
		"\3\2\2\2\u09ae\u09af\3\2\2\2\u09af\u09b0\7?\2\2\u09b0\u0145\3\2\2\2\u09b1"+
		"\u09b2\5\u0148\u00a5\2\u09b2\u09b9\b\u00a4\1\2\u09b3\u09b4\7D\2\2\u09b4"+
		"\u09b5\5\u0148\u00a5\2\u09b5\u09b6\b\u00a4\1\2\u09b6\u09b8\3\2\2\2\u09b7"+
		"\u09b3\3\2\2\2\u09b8\u09bb\3\2\2\2\u09b9\u09b7\3\2\2\2\u09b9\u09ba\3\2"+
		"\2\2\u09ba\u09bc\3\2\2\2\u09bb\u09b9\3\2\2\2\u09bc\u09bd\b\u00a4\1\2\u09bd"+
		"\u0147\3\2\2\2\u09be\u09bf\5\u008cG\2\u09bf\u09c0\b\u00a5\1\2\u09c0\u09c5"+
		"\3\2\2\2\u09c1\u09c2\5\u00d2j\2\u09c2\u09c3\b\u00a5\1\2\u09c3\u09c5\3"+
		"\2\2\2\u09c4\u09be\3\2\2\2\u09c4\u09c1\3\2\2\2\u09c5\u09c8\3\2\2\2\u09c6"+
		"\u09c4\3\2\2\2\u09c6\u09c7\3\2\2\2\u09c7\u09c9\3\2\2\2\u09c8\u09c6\3\2"+
		"\2\2\u09c9\u09ca\5h\65\2\u09ca\u09cb\7G\2\2\u09cb\u09cc\5\u0188\u00c5"+
		"\2\u09cc\u09cd\b\u00a5\1\2\u09cd\u0149\3\2\2\2\u09ce\u09cf\5\u0158\u00ad"+
		"\2\u09cf\u09d0\b\u00a6\1\2\u09d0\u09d5\3\2\2\2\u09d1\u09d2\5\u0180\u00c1"+
		"\2\u09d2\u09d3\b\u00a6\1\2\u09d3\u09d5\3\2\2\2\u09d4\u09ce\3\2\2\2\u09d4"+
		"\u09d1\3\2\2\2\u09d5\u09db\3\2\2\2\u09d6\u09d7\5\u0154\u00ab\2\u09d7\u09d8"+
		"\b\u00a6\1\2\u09d8\u09da\3\2\2\2\u09d9\u09d6\3\2\2\2\u09da\u09dd\3\2\2"+
		"\2\u09db\u09d9\3\2\2\2\u09db\u09dc\3\2\2\2\u09dc\u014b\3\2\2\2\u09dd\u09db"+
		"\3\2\2\2\u09de\u09df\5\2\2\2\u09df\u09e0\b\u00a7\1\2\u09e0\u09fb\3\2\2"+
		"\2\u09e1\u09e2\5\u014e\u00a8\2\u09e2\u09e3\b\u00a7\1\2\u09e3\u09fb\3\2"+
		"\2\2\u09e4\u09e5\7-\2\2\u09e5\u09fb\b\u00a7\1\2\u09e6\u09e7\7>\2\2\u09e7"+
		"\u09e8\5\u0188\u00c5\2\u09e8\u09e9\7?\2\2\u09e9\u09ea\b\u00a7\1\2\u09ea"+
		"\u09fb\3\2\2\2\u09eb\u09ec\5\u015e\u00b0\2\u09ec\u09ed\b\u00a7\1\2\u09ed"+
		"\u09fb\3\2\2\2\u09ee\u09ef\5\u0166\u00b4\2\u09ef\u09f0\b\u00a7\1\2\u09f0"+
		"\u09fb\3\2\2\2\u09f1\u09f2\5\u016c\u00b7\2\u09f2\u09f3\b\u00a7\1\2\u09f3"+
		"\u09fb\3\2\2\2\u09f4\u09f5\5\u0172\u00ba\2\u09f5\u09f6\b\u00a7\1\2\u09f6"+
		"\u09fb\3\2\2\2\u09f7\u09f8\5\u017a\u00be\2\u09f8\u09f9\b\u00a7\1\2\u09f9"+
		"\u09fb\3\2\2\2\u09fa\u09de\3\2\2\2\u09fa\u09e1\3\2\2\2\u09fa\u09e4\3\2"+
		"\2\2\u09fa\u09e6\3\2\2\2\u09fa\u09eb\3\2\2\2\u09fa\u09ee\3\2\2\2\u09fa"+
		"\u09f1\3\2\2\2\u09fa\u09f4\3\2\2\2\u09fa\u09f7\3\2\2\2\u09fb\u014d\3\2"+
		"\2\2\u09fc\u0a02\7k\2\2\u09fd\u09fe\7B\2\2\u09fe\u09ff\7C\2\2\u09ff\u0a01"+
		"\b\u00a8\1\2\u0a00\u09fd\3\2\2\2\u0a01\u0a04\3\2\2\2\u0a02\u0a00\3\2\2"+
		"\2\u0a02\u0a03\3\2\2\2\u0a03\u0a05\3\2\2\2\u0a04\u0a02\3\2\2\2\u0a05\u0a06"+
		"\7F\2\2\u0a06\u0a07\7\13\2\2\u0a07\u0a21\b\u00a8\1\2\u0a08\u0a09\5\60"+
		"\31\2\u0a09\u0a0a\7F\2\2\u0a0a\u0a10\7k\2\2\u0a0b\u0a0c\7B\2\2\u0a0c\u0a0d"+
		"\7C\2\2\u0a0d\u0a0f\b\u00a8\1\2\u0a0e\u0a0b\3\2\2\2\u0a0f\u0a12\3\2\2"+
		"\2\u0a10\u0a0e\3\2\2\2\u0a10\u0a11\3\2\2\2\u0a11\u0a13\3\2\2\2\u0a12\u0a10"+
		"\3\2\2\2\u0a13\u0a14\7F\2\2\u0a14\u0a15\7\13\2\2\u0a15\u0a16\b\u00a8\1"+
		"\2\u0a16\u0a21\3\2\2\2\u0a17\u0a18\7\62\2\2\u0a18\u0a19\7F\2\2\u0a19\u0a1a"+
		"\7\13\2\2\u0a1a\u0a21\b\u00a8\1\2\u0a1b\u0a1c\5.\30\2\u0a1c\u0a1d\7F\2"+
		"\2\u0a1d\u0a1e\7-\2\2\u0a1e\u0a1f\b\u00a8\1\2\u0a1f\u0a21\3\2\2\2\u0a20"+
		"\u09fc\3\2\2\2\u0a20\u0a08\3\2\2\2\u0a20\u0a17\3\2\2\2\u0a20\u0a1b\3\2"+
		"\2\2\u0a21\u014f\3\2\2\2\u0a22\u0a23\3\2\2\2\u0a23\u0151\3\2\2\2\u0a24"+
		"\u0a25\5\2\2\2\u0a25\u0a26\b\u00aa\1\2\u0a26\u0a3e\3\2\2\2\u0a27\u0a28"+
		"\5\u014e\u00a8\2\u0a28\u0a29\b\u00aa\1\2\u0a29\u0a3e\3\2\2\2\u0a2a\u0a2b"+
		"\7-\2\2\u0a2b\u0a3e\b\u00aa\1\2\u0a2c\u0a2d\7>\2\2\u0a2d\u0a2e\5\u0188"+
		"\u00c5\2\u0a2e\u0a2f\7?\2\2\u0a2f\u0a30\b\u00aa\1\2\u0a30\u0a3e\3\2\2"+
		"\2\u0a31\u0a32\5\u015e\u00b0\2\u0a32\u0a33\b\u00aa\1\2\u0a33\u0a3e\3\2"+
		"\2\2\u0a34\u0a35\5\u0166\u00b4\2\u0a35\u0a36\b\u00aa\1\2\u0a36\u0a3e\3"+
		"\2\2\2\u0a37\u0a38\5\u0172\u00ba\2\u0a38\u0a39\b\u00aa\1\2\u0a39\u0a3e"+
		"\3\2\2\2\u0a3a\u0a3b\5\u017a\u00be\2\u0a3b\u0a3c\b\u00aa\1\2\u0a3c\u0a3e"+
		"\3\2\2\2\u0a3d\u0a24\3\2\2\2\u0a3d\u0a27\3\2\2\2\u0a3d\u0a2a\3\2\2\2\u0a3d"+
		"\u0a2c\3\2\2\2\u0a3d\u0a31\3\2\2\2\u0a3d\u0a34\3\2\2\2\u0a3d\u0a37\3\2"+
		"\2\2\u0a3d\u0a3a\3\2\2\2\u0a3e\u0153\3\2\2\2\u0a3f\u0a40\5\u0160\u00b1"+
		"\2\u0a40\u0a41\b\u00ab\1\2\u0a41\u0a4f\3\2\2\2\u0a42\u0a43\5\u0168\u00b5"+
		"\2\u0a43\u0a44\b\u00ab\1\2\u0a44\u0a4f\3\2\2\2\u0a45\u0a46\5\u016e\u00b8"+
		"\2\u0a46\u0a47\b\u00ab\1\2\u0a47\u0a4f\3\2\2\2\u0a48\u0a49\5\u0174\u00bb"+
		"\2\u0a49\u0a4a\b\u00ab\1\2\u0a4a\u0a4f\3\2\2\2\u0a4b\u0a4c\5\u017c\u00bf"+
		"\2\u0a4c\u0a4d\b\u00ab\1\2\u0a4d\u0a4f\3\2\2\2\u0a4e\u0a3f\3\2\2\2\u0a4e"+
		"\u0a42\3\2\2\2\u0a4e\u0a45\3\2\2\2\u0a4e\u0a48\3\2\2\2\u0a4e\u0a4b\3\2"+
		"\2\2\u0a4f\u0155\3\2\2\2\u0a50\u0a51\5\u0160\u00b1\2\u0a51\u0a52\b\u00ac"+
		"\1\2\u0a52\u0a5d\3\2\2\2\u0a53\u0a54\5\u0168\u00b5\2\u0a54\u0a55\b\u00ac"+
		"\1\2\u0a55\u0a5d\3\2\2\2\u0a56\u0a57\5\u0174\u00bb\2\u0a57\u0a58\b\u00ac"+
		"\1\2\u0a58\u0a5d\3\2\2\2\u0a59\u0a5a\5\u017c\u00bf\2\u0a5a\u0a5b\b\u00ac"+
		"\1\2\u0a5b\u0a5d\3\2\2\2\u0a5c\u0a50\3\2\2\2\u0a5c\u0a53\3\2\2\2\u0a5c"+
		"\u0a56\3\2\2\2\u0a5c\u0a59\3\2\2\2\u0a5d\u0157\3\2\2\2\u0a5e\u0a5f\5\2"+
		"\2\2\u0a5f\u0a60\b\u00ad\1\2\u0a60\u0a88\3\2\2\2\u0a61\u0a62\5\u014e\u00a8"+
		"\2\u0a62\u0a63\b\u00ad\1\2\u0a63\u0a88\3\2\2\2\u0a64\u0a6a\5n8\2\u0a65"+
		"\u0a66\7B\2\2\u0a66\u0a67\7C\2\2\u0a67\u0a69\b\u00ad\1\2\u0a68\u0a65\3"+
		"\2\2\2\u0a69\u0a6c\3\2\2\2\u0a6a\u0a68\3\2\2\2\u0a6a\u0a6b\3\2\2\2\u0a6b"+
		"\u0a6d\3\2\2\2\u0a6c\u0a6a\3\2\2\2\u0a6d\u0a6e\7F\2\2\u0a6e\u0a6f\7\13"+
		"\2\2\u0a6f\u0a70\b\u00ad\1\2\u0a70\u0a88\3\2\2\2\u0a71\u0a72\7-\2\2\u0a72"+
		"\u0a88\b\u00ad\1\2\u0a73\u0a74\7>\2\2\u0a74\u0a75\5\u0188\u00c5\2\u0a75"+
		"\u0a76\7?\2\2\u0a76\u0a77\b\u00ad\1\2\u0a77\u0a88\3\2\2\2\u0a78\u0a79"+
		"\5\u0162\u00b2\2\u0a79\u0a7a\b\u00ad\1\2\u0a7a\u0a88\3\2\2\2\u0a7b\u0a7c"+
		"\5\u016a\u00b6\2\u0a7c\u0a7d\b\u00ad\1\2\u0a7d\u0a88\3\2\2\2\u0a7e\u0a7f"+
		"\5\u0170\u00b9\2\u0a7f\u0a80\b\u00ad\1\2\u0a80\u0a88\3\2\2\2\u0a81\u0a82"+
		"\5\u0176\u00bc\2\u0a82\u0a83\b\u00ad\1\2\u0a83\u0a88\3\2\2\2\u0a84\u0a85"+
		"\5\u017e\u00c0\2\u0a85\u0a86\b\u00ad\1\2\u0a86\u0a88\3\2\2\2\u0a87\u0a5e"+
		"\3\2\2\2\u0a87\u0a61\3\2\2\2\u0a87\u0a64\3\2\2\2\u0a87\u0a71\3\2\2\2\u0a87"+
		"\u0a73\3\2\2\2\u0a87\u0a78\3\2\2\2\u0a87\u0a7b\3\2\2\2\u0a87\u0a7e\3\2"+
		"\2\2\u0a87\u0a81\3\2\2\2\u0a87\u0a84\3\2\2\2\u0a88\u0159\3\2\2\2\u0a89"+
		"\u0a8a\3\2\2\2\u0a8a\u015b\3\2\2\2\u0a8b\u0a8c\5\2\2\2\u0a8c\u0a8d\b\u00af"+
		"\1\2\u0a8d\u0ab2\3\2\2\2\u0a8e\u0a8f\5\u014e\u00a8\2\u0a8f\u0a90\b\u00af"+
		"\1\2\u0a90\u0ab2\3\2\2\2\u0a91\u0a97\5n8\2\u0a92\u0a93\7B\2\2\u0a93\u0a94"+
		"\7C\2\2\u0a94\u0a96\b\u00af\1\2\u0a95\u0a92\3\2\2\2\u0a96\u0a99\3\2\2"+
		"\2\u0a97\u0a95\3\2\2\2\u0a97\u0a98\3\2\2\2\u0a98\u0a9a\3\2\2\2\u0a99\u0a97"+
		"\3\2\2\2\u0a9a\u0a9b\7F\2\2\u0a9b\u0a9c\7\13\2\2\u0a9c\u0a9d\b\u00af\1"+
		"\2\u0a9d\u0ab2\3\2\2\2\u0a9e\u0a9f\7-\2\2\u0a9f\u0ab2\b\u00af\1\2\u0aa0"+
		"\u0aa1\7>\2\2\u0aa1\u0aa2\5\u0188\u00c5\2\u0aa2\u0aa3\7?\2\2\u0aa3\u0aa4"+
		"\b\u00af\1\2\u0aa4\u0ab2\3\2\2\2\u0aa5\u0aa6\5\u0162\u00b2\2\u0aa6\u0aa7"+
		"\b\u00af\1\2\u0aa7\u0ab2\3\2\2\2\u0aa8\u0aa9\5\u016a\u00b6\2\u0aa9\u0aaa"+
		"\b\u00af\1\2\u0aaa\u0ab2\3\2\2\2\u0aab\u0aac\5\u0176\u00bc\2\u0aac\u0aad"+
		"\b\u00af\1\2\u0aad\u0ab2\3\2\2\2\u0aae\u0aaf\5\u017e\u00c0\2\u0aaf\u0ab0"+
		"\b\u00af\1\2\u0ab0\u0ab2\3\2\2\2\u0ab1\u0a8b\3\2\2\2\u0ab1\u0a8e\3\2\2"+
		"\2\u0ab1\u0a91\3\2\2\2\u0ab1\u0a9e\3\2\2\2\u0ab1\u0aa0\3\2\2\2\u0ab1\u0aa5"+
		"\3\2\2\2\u0ab1\u0aa8\3\2\2\2\u0ab1\u0aab\3\2\2\2\u0ab1\u0aae\3\2\2\2\u0ab2"+
		"\u015d\3\2\2\2\u0ab3\u0ab7\7!\2\2\u0ab4\u0ab5\5$\23\2\u0ab5\u0ab6\b\u00b0"+
		"\1\2\u0ab6\u0ab8\3\2\2\2\u0ab7\u0ab4\3\2\2\2\u0ab7\u0ab8\3\2\2\2\u0ab8"+
		"\u0abe\3\2\2\2\u0ab9\u0aba\5\u00d2j\2\u0aba\u0abb\b\u00b0\1\2\u0abb\u0abd"+
		"\3\2\2\2\u0abc\u0ab9\3\2\2\2\u0abd\u0ac0\3\2\2\2\u0abe\u0abc\3\2\2\2\u0abe"+
		"\u0abf\3\2\2\2\u0abf\u0ac1\3\2\2\2\u0ac0\u0abe\3\2\2\2\u0ac1\u0ac2\7k"+
		"\2\2\u0ac2\u0ad0\b\u00b0\1\2\u0ac3\u0ac9\7F\2\2\u0ac4\u0ac5\5\u00d2j\2"+
		"\u0ac5\u0ac6\b\u00b0\1\2\u0ac6\u0ac8\3\2\2\2\u0ac7\u0ac4\3\2\2\2\u0ac8"+
		"\u0acb\3\2\2\2\u0ac9\u0ac7\3\2\2\2\u0ac9\u0aca\3\2\2\2\u0aca\u0acc\3\2"+
		"\2\2\u0acb\u0ac9\3\2\2\2\u0acc\u0acd\7k\2\2\u0acd\u0acf\b\u00b0\1\2\u0ace"+
		"\u0ac3\3\2\2\2\u0acf\u0ad2\3\2\2\2\u0ad0\u0ace\3\2\2\2\u0ad0\u0ad1\3\2"+
		"\2\2\u0ad1\u0ad6\3\2\2\2\u0ad2\u0ad0\3\2\2\2\u0ad3\u0ad4\5\u0164\u00b3"+
		"\2\u0ad4\u0ad5\b\u00b0\1\2\u0ad5\u0ad7\3\2\2\2\u0ad6\u0ad3\3\2\2\2\u0ad6"+
		"\u0ad7\3\2\2\2\u0ad7\u0ad8\3\2\2\2\u0ad8\u0adc\7>\2\2\u0ad9\u0ada\5\u0178"+
		"\u00bd\2\u0ada\u0adb\b\u00b0\1\2\u0adb\u0add\3\2\2\2\u0adc\u0ad9\3\2\2"+
		"\2\u0adc\u0add\3\2\2\2\u0add\u0ade\3\2\2\2\u0ade\u0adf\7?\2\2\u0adf\u0ae1"+
		"\b\u00b0\1\2\u0ae0\u0ae2\5X-\2\u0ae1\u0ae0\3\2\2\2\u0ae1\u0ae2\3\2\2\2"+
		"\u0ae2\u0b28\3\2\2\2\u0ae3\u0ae4\5\62\32\2\u0ae4\u0ae5\7F\2\2\u0ae5\u0ae9"+
		"\7!\2\2\u0ae6\u0ae7\5$\23\2\u0ae7\u0ae8\b\u00b0\1\2\u0ae8\u0aea\3\2\2"+
		"\2\u0ae9\u0ae6\3\2\2\2\u0ae9\u0aea\3\2\2\2\u0aea\u0af0\3\2\2\2\u0aeb\u0aec"+
		"\5\u00d2j\2\u0aec\u0aed\b\u00b0\1\2\u0aed\u0aef\3\2\2\2\u0aee\u0aeb\3"+
		"\2\2\2\u0aef\u0af2\3\2\2\2\u0af0\u0aee\3\2\2\2\u0af0\u0af1\3\2\2\2\u0af1"+
		"\u0af3\3\2\2\2\u0af2\u0af0\3\2\2\2\u0af3\u0af4\7k\2\2\u0af4\u0af8\b\u00b0"+
		"\1\2\u0af5\u0af6\5\u0164\u00b3\2\u0af6\u0af7\b\u00b0\1\2\u0af7\u0af9\3"+
		"\2\2\2\u0af8\u0af5\3\2\2\2\u0af8\u0af9\3\2\2\2\u0af9\u0afa\3\2\2\2\u0afa"+
		"\u0afe\7>\2\2\u0afb\u0afc\5\u0178\u00bd\2\u0afc\u0afd\b\u00b0\1\2\u0afd"+
		"\u0aff\3\2\2\2\u0afe\u0afb\3\2\2\2\u0afe\u0aff\3\2\2\2\u0aff\u0b00\3\2"+
		"\2\2\u0b00\u0b01\7?\2\2\u0b01\u0b03\b\u00b0\1\2\u0b02\u0b04\5X-\2\u0b03"+
		"\u0b02\3\2\2\2\u0b03\u0b04\3\2\2\2\u0b04\u0b28\3\2\2\2\u0b05\u0b06\5\u014a"+
		"\u00a6\2\u0b06\u0b07\7F\2\2\u0b07\u0b0b\7!\2\2\u0b08\u0b09\5$\23\2\u0b09"+
		"\u0b0a\b\u00b0\1\2\u0b0a\u0b0c\3\2\2\2\u0b0b\u0b08\3\2\2\2\u0b0b\u0b0c"+
		"\3\2\2\2\u0b0c\u0b12\3\2\2\2\u0b0d\u0b0e\5\u00d2j\2\u0b0e\u0b0f\b\u00b0"+
		"\1\2\u0b0f\u0b11\3\2\2\2\u0b10\u0b0d\3\2\2\2\u0b11\u0b14\3\2\2\2\u0b12"+
		"\u0b10\3\2\2\2\u0b12\u0b13\3\2\2\2\u0b13\u0b15\3\2\2\2\u0b14\u0b12\3\2"+
		"\2\2\u0b15\u0b16\7k\2\2\u0b16\u0b1a\b\u00b0\1\2\u0b17\u0b18\5\u0164\u00b3"+
		"\2\u0b18\u0b19\b\u00b0\1\2\u0b19\u0b1b\3\2\2\2\u0b1a\u0b17\3\2\2\2\u0b1a"+
		"\u0b1b\3\2\2\2\u0b1b\u0b1c\3\2\2\2\u0b1c\u0b20\7>\2\2\u0b1d\u0b1e\5\u0178"+
		"\u00bd\2\u0b1e\u0b1f\b\u00b0\1\2\u0b1f\u0b21\3\2\2\2\u0b20\u0b1d\3\2\2"+
		"\2\u0b20\u0b21\3\2\2\2\u0b21\u0b22\3\2\2\2\u0b22\u0b23\7?\2\2\u0b23\u0b25"+
		"\b\u00b0\1\2\u0b24\u0b26\5X-\2\u0b25\u0b24\3\2\2\2\u0b25\u0b26\3\2\2\2"+
		"\u0b26\u0b28\3\2\2\2\u0b27\u0ab3\3\2\2\2\u0b27\u0ae3\3\2\2\2\u0b27\u0b05"+
		"\3\2\2\2\u0b28\u015f\3\2\2\2\u0b29\u0b2a\7F\2\2\u0b2a\u0b2e\7!\2\2\u0b2b"+
		"\u0b2c\5$\23\2\u0b2c\u0b2d\b\u00b1\1\2\u0b2d\u0b2f\3\2\2\2\u0b2e\u0b2b"+
		"\3\2\2\2\u0b2e\u0b2f\3\2\2\2\u0b2f\u0b35\3\2\2\2\u0b30\u0b31\5\u00d2j"+
		"\2\u0b31\u0b32\b\u00b1\1\2\u0b32\u0b34\3\2\2\2\u0b33\u0b30\3\2\2\2\u0b34"+
		"\u0b37\3\2\2\2\u0b35\u0b33\3\2\2\2\u0b35\u0b36\3\2\2\2\u0b36\u0b38\3\2"+
		"\2\2\u0b37\u0b35\3\2\2\2\u0b38\u0b39\7k\2\2\u0b39\u0b3d\b\u00b1\1\2\u0b3a"+
		"\u0b3b\5\u0164\u00b3\2\u0b3b\u0b3c\b\u00b1\1\2\u0b3c\u0b3e\3\2\2\2\u0b3d"+
		"\u0b3a\3\2\2\2\u0b3d\u0b3e\3\2\2\2\u0b3e\u0b3f\3\2\2\2\u0b3f\u0b43\7>"+
		"\2\2\u0b40\u0b41\5\u0178\u00bd\2\u0b41\u0b42\b\u00b1\1\2\u0b42\u0b44\3"+
		"\2\2\2\u0b43\u0b40\3\2\2\2\u0b43\u0b44\3\2\2\2\u0b44\u0b45\3\2\2\2\u0b45"+
		"\u0b46\7?\2\2\u0b46\u0b48\b\u00b1\1\2\u0b47\u0b49\5X-\2\u0b48\u0b47\3"+
		"\2\2\2\u0b48\u0b49\3\2\2\2\u0b49\u0161\3\2\2\2\u0b4a\u0b4e\7!\2\2\u0b4b"+
		"\u0b4c\5$\23\2\u0b4c\u0b4d\b\u00b2\1\2\u0b4d\u0b4f\3\2\2\2\u0b4e\u0b4b"+
		"\3\2\2\2\u0b4e\u0b4f\3\2\2\2\u0b4f\u0b55\3\2\2\2\u0b50\u0b51\5\u00d2j"+
		"\2\u0b51\u0b52\b\u00b2\1\2\u0b52\u0b54\3\2\2\2\u0b53\u0b50\3\2\2\2\u0b54"+
		"\u0b57\3\2\2\2\u0b55\u0b53\3\2\2\2\u0b55\u0b56\3\2\2\2\u0b56\u0b58\3\2"+
		"\2\2\u0b57\u0b55\3\2\2\2\u0b58\u0b59\7k\2\2\u0b59\u0b67\b\u00b2\1\2\u0b5a"+
		"\u0b60\7F\2\2\u0b5b\u0b5c\5\u00d2j\2\u0b5c\u0b5d\b\u00b2\1\2\u0b5d\u0b5f"+
		"\3\2\2\2\u0b5e\u0b5b\3\2\2\2\u0b5f\u0b62\3\2\2\2\u0b60\u0b5e\3\2\2\2\u0b60"+
		"\u0b61\3\2\2\2\u0b61\u0b63\3\2\2\2\u0b62\u0b60\3\2\2\2\u0b63\u0b64\7k"+
		"\2\2\u0b64\u0b66\b\u00b2\1\2\u0b65\u0b5a\3\2\2\2\u0b66\u0b69\3\2\2\2\u0b67"+
		"\u0b65\3\2\2\2\u0b67\u0b68\3\2\2\2\u0b68\u0b6d\3\2\2\2\u0b69\u0b67\3\2"+
		"\2\2\u0b6a\u0b6b\5\u0164\u00b3\2\u0b6b\u0b6c\b\u00b2\1\2\u0b6c\u0b6e\3"+
		"\2\2\2\u0b6d\u0b6a\3\2\2\2\u0b6d\u0b6e\3\2\2\2\u0b6e\u0b6f\3\2\2\2\u0b6f"+
		"\u0b73\7>\2\2\u0b70\u0b71\5\u0178\u00bd\2\u0b71\u0b72\b\u00b2\1\2\u0b72"+
		"\u0b74\3\2\2\2\u0b73\u0b70\3\2\2\2\u0b73\u0b74\3\2\2\2\u0b74\u0b75\3\2"+
		"\2\2\u0b75\u0b76\7?\2\2\u0b76\u0b78\b\u00b2\1\2\u0b77\u0b79\5X-\2\u0b78"+
		"\u0b77\3\2\2\2\u0b78\u0b79\3\2\2\2\u0b79\u0b9d\3\2\2\2\u0b7a\u0b7b\5\62"+
		"\32\2\u0b7b\u0b7c\7F\2\2\u0b7c\u0b80\7!\2\2\u0b7d\u0b7e\5$\23\2\u0b7e"+
		"\u0b7f\b\u00b2\1\2\u0b7f\u0b81\3\2\2\2\u0b80\u0b7d\3\2\2\2\u0b80\u0b81"+
		"\3\2\2\2\u0b81\u0b87\3\2\2\2\u0b82\u0b83\5\u00d2j\2\u0b83\u0b84\b\u00b2"+
		"\1\2\u0b84\u0b86\3\2\2\2\u0b85\u0b82\3\2\2\2\u0b86\u0b89\3\2\2\2\u0b87"+
		"\u0b85\3\2\2\2\u0b87\u0b88\3\2\2\2\u0b88\u0b8a\3\2\2\2\u0b89\u0b87\3\2"+
		"\2\2\u0b8a\u0b8b\7k\2\2\u0b8b\u0b8f\b\u00b2\1\2\u0b8c\u0b8d\5\u0164\u00b3"+
		"\2\u0b8d\u0b8e\b\u00b2\1\2\u0b8e\u0b90\3\2\2\2\u0b8f\u0b8c\3\2\2\2\u0b8f"+
		"\u0b90\3\2\2\2\u0b90\u0b91\3\2\2\2\u0b91\u0b95\7>\2\2\u0b92\u0b93\5\u0178"+
		"\u00bd\2\u0b93\u0b94\b\u00b2\1\2\u0b94\u0b96\3\2\2\2\u0b95\u0b92\3\2\2"+
		"\2\u0b95\u0b96\3\2\2\2\u0b96\u0b97\3\2\2\2\u0b97\u0b98\7?\2\2\u0b98\u0b9a"+
		"\b\u00b2\1\2\u0b99\u0b9b\5X-\2\u0b9a\u0b99\3\2\2\2\u0b9a\u0b9b\3\2\2\2"+
		"\u0b9b\u0b9d\3\2\2\2\u0b9c\u0b4a\3\2\2\2\u0b9c\u0b7a\3\2\2\2\u0b9d\u0163"+
		"\3\2\2\2\u0b9e\u0b9f\5$\23\2\u0b9f\u0ba0\b\u00b3\1\2\u0ba0\u0ba5\3\2\2"+
		"\2\u0ba1\u0ba2\7I\2\2\u0ba2\u0ba3\7H\2\2\u0ba3\u0ba5\b\u00b3\1\2\u0ba4"+
		"\u0b9e\3\2\2\2\u0ba4\u0ba1\3\2\2\2\u0ba5\u0165\3\2\2\2\u0ba6\u0ba7\5\u014a"+
		"\u00a6\2\u0ba7\u0ba8\7F\2\2\u0ba8\u0ba9\7k\2\2\u0ba9\u0baa\b\u00b4\1\2"+
		"\u0baa\u0bb7\3\2\2\2\u0bab\u0bac\7*\2\2\u0bac\u0bad\7F\2\2\u0bad\u0bae"+
		"\7k\2\2\u0bae\u0bb7\b\u00b4\1\2\u0baf\u0bb0\5.\30\2\u0bb0\u0bb1\7F\2\2"+
		"\u0bb1\u0bb2\7*\2\2\u0bb2\u0bb3\7F\2\2\u0bb3\u0bb4\7k\2\2\u0bb4\u0bb5"+
		"\b\u00b4\1\2\u0bb5\u0bb7\3\2\2\2\u0bb6\u0ba6\3\2\2\2\u0bb6\u0bab\3\2\2"+
		"\2\u0bb6\u0baf\3\2\2\2\u0bb7\u0167\3\2\2\2\u0bb8\u0bb9\7F\2\2\u0bb9\u0bba"+
		"\7k\2\2\u0bba\u0bbb\b\u00b5\1\2\u0bbb\u0169\3\2\2\2\u0bbc\u0bbd\7*\2\2"+
		"\u0bbd\u0bbe\7F\2\2\u0bbe\u0bbf\7k\2\2\u0bbf\u0bc8\b\u00b6\1\2\u0bc0\u0bc1"+
		"\5.\30\2\u0bc1\u0bc2\7F\2\2\u0bc2\u0bc3\7*\2\2\u0bc3\u0bc4\7F\2\2\u0bc4"+
		"\u0bc5\7k\2\2\u0bc5\u0bc6\b\u00b6\1\2\u0bc6\u0bc8\3\2\2\2\u0bc7\u0bbc"+
		"\3\2\2\2\u0bc7\u0bc0\3\2\2\2\u0bc8\u016b\3\2\2\2\u0bc9\u0bca\5\62\32\2"+
		"\u0bca\u0bcb\7B\2\2\u0bcb\u0bcc\5\u0188\u00c5\2\u0bcc\u0bcd\7C\2\2\u0bcd"+
		"\u0bce\b\u00b7\1\2\u0bce\u0bd6\3\2\2\2\u0bcf\u0bd0\5\u0152\u00aa\2\u0bd0"+
		"\u0bd1\7B\2\2\u0bd1\u0bd2\5\u0188\u00c5\2\u0bd2\u0bd3\7C\2\2\u0bd3\u0bd4"+
		"\b\u00b7\1\2\u0bd4\u0bd6\3\2\2\2\u0bd5\u0bc9\3\2\2\2\u0bd5\u0bcf\3\2\2"+
		"\2\u0bd6\u0bdf\3\2\2\2\u0bd7\u0bd8\5\u0150\u00a9\2\u0bd8\u0bd9\7B\2\2"+
		"\u0bd9\u0bda\5\u0188\u00c5\2\u0bda\u0bdb\7C\2\2\u0bdb\u0bdc\b\u00b7\1"+
		"\2\u0bdc\u0bde\3\2\2\2\u0bdd\u0bd7\3\2\2\2\u0bde\u0be1\3\2\2\2\u0bdf\u0bdd"+
		"\3\2\2\2\u0bdf\u0be0\3\2\2\2\u0be0\u016d\3\2\2\2\u0be1\u0bdf\3\2\2\2\u0be2"+
		"\u0be3\5\u0156\u00ac\2\u0be3\u0be4\7B\2\2\u0be4\u0be5\5\u0188\u00c5\2"+
		"\u0be5\u0be6\7C\2\2\u0be6\u0be7\b\u00b8\1\2\u0be7\u0bef\3\2\2\2\u0be8"+
		"\u0be9\7B\2\2\u0be9\u0bea\5\u0188\u00c5\2\u0bea\u0beb\7C\2\2\u0beb\u0bec"+
		"\b\u00b8\1\2\u0bec\u0bee\3\2\2\2\u0bed\u0be8\3\2\2\2\u0bee\u0bf1\3\2\2"+
		"\2\u0bef\u0bed\3\2\2\2\u0bef\u0bf0\3\2\2\2\u0bf0\u016f\3\2\2\2\u0bf1\u0bef"+
		"\3\2\2\2\u0bf2\u0bf3\5\62\32\2\u0bf3\u0bf4\7B\2\2\u0bf4\u0bf5\5\u0188"+
		"\u00c5\2\u0bf5\u0bf6\7C\2\2\u0bf6\u0bf7\b\u00b9\1\2\u0bf7\u0bff\3\2\2"+
		"\2\u0bf8\u0bf9\5\u015c\u00af\2\u0bf9\u0bfa\7B\2\2\u0bfa\u0bfb\5\u0188"+
		"\u00c5\2\u0bfb\u0bfc\7C\2\2\u0bfc\u0bfd\b\u00b9\1\2\u0bfd\u0bff\3\2\2"+
		"\2\u0bfe\u0bf2\3\2\2\2\u0bfe\u0bf8\3\2\2\2\u0bff\u0c08\3\2\2\2\u0c00\u0c01"+
		"\5\u015a\u00ae\2\u0c01\u0c02\7B\2\2\u0c02\u0c03\5\u0188\u00c5\2\u0c03"+
		"\u0c04\7C\2\2\u0c04\u0c05\b\u00b9\1\2\u0c05\u0c07\3\2\2\2\u0c06\u0c00"+
		"\3\2\2\2\u0c07\u0c0a\3\2\2\2\u0c08\u0c06\3\2\2\2\u0c08\u0c09\3\2\2\2\u0c09"+
		"\u0171\3\2\2\2\u0c0a\u0c08\3\2\2\2\u0c0b\u0c0c\7k\2\2\u0c0c\u0c10\7>\2"+
		"\2\u0c0d\u0c0e\5\u0178\u00bd\2\u0c0e\u0c0f\b\u00ba\1\2\u0c0f\u0c11\3\2"+
		"\2\2\u0c10\u0c0d\3\2\2\2\u0c10\u0c11\3\2\2\2\u0c11\u0c12\3\2\2\2\u0c12"+
		"\u0c13\7?\2\2\u0c13\u0c5a\b\u00ba\1\2\u0c14\u0c15\5\64\33\2\u0c15\u0c19"+
		"\7F\2\2\u0c16\u0c17\5$\23\2\u0c17\u0c18\b\u00ba\1\2\u0c18\u0c1a\3\2\2"+
		"\2\u0c19\u0c16\3\2\2\2\u0c19\u0c1a\3\2\2\2\u0c1a\u0c1b\3\2\2\2\u0c1b\u0c1c"+
		"\7k\2\2\u0c1c\u0c20\7>\2\2\u0c1d\u0c1e\5\u0178\u00bd\2\u0c1e\u0c1f\b\u00ba"+
		"\1\2\u0c1f\u0c21\3\2\2\2\u0c20\u0c1d\3\2\2\2\u0c20\u0c21\3\2\2\2\u0c21"+
		"\u0c22\3\2\2\2\u0c22\u0c23\7?\2\2\u0c23\u0c24\b\u00ba\1\2\u0c24\u0c5a"+
		"\3\2\2\2\u0c25\u0c26\5\u014a\u00a6\2\u0c26\u0c2a\7F\2\2\u0c27\u0c28\5"+
		"$\23\2\u0c28\u0c29\b\u00ba\1\2\u0c29\u0c2b\3\2\2\2\u0c2a\u0c27\3\2\2\2"+
		"\u0c2a\u0c2b\3\2\2\2\u0c2b\u0c2c\3\2\2\2\u0c2c\u0c2d\7k\2\2\u0c2d\u0c31"+
		"\7>\2\2\u0c2e\u0c2f\5\u0178\u00bd\2\u0c2f\u0c30\b\u00ba\1\2\u0c30\u0c32"+
		"\3\2\2\2\u0c31\u0c2e\3\2\2\2\u0c31\u0c32\3\2\2\2\u0c32\u0c33\3\2\2\2\u0c33"+
		"\u0c34\7?\2\2\u0c34\u0c35\b\u00ba\1\2\u0c35\u0c5a\3\2\2\2\u0c36\u0c37"+
		"\7*\2\2\u0c37\u0c3b\7F\2\2\u0c38\u0c39\5$\23\2\u0c39\u0c3a\b\u00ba\1\2"+
		"\u0c3a\u0c3c\3\2\2\2\u0c3b\u0c38\3\2\2\2\u0c3b\u0c3c\3\2\2\2\u0c3c\u0c3d"+
		"\3\2\2\2\u0c3d\u0c3e\7k\2\2\u0c3e\u0c42\7>\2\2\u0c3f\u0c40\5\u0178\u00bd"+
		"\2\u0c40\u0c41\b\u00ba\1\2\u0c41\u0c43\3\2\2\2\u0c42\u0c3f\3\2\2\2\u0c42"+
		"\u0c43\3\2\2\2\u0c43\u0c44\3\2\2\2\u0c44\u0c45\7?\2\2\u0c45\u0c5a\b\u00ba"+
		"\1\2\u0c46\u0c47\5.\30\2\u0c47\u0c48\7F\2\2\u0c48\u0c49\7*\2\2\u0c49\u0c4d"+
		"\7F\2\2\u0c4a\u0c4b\5$\23\2\u0c4b\u0c4c\b\u00ba\1\2\u0c4c\u0c4e\3\2\2"+
		"\2\u0c4d\u0c4a\3\2\2\2\u0c4d\u0c4e\3\2\2\2\u0c4e\u0c4f\3\2\2\2\u0c4f\u0c50"+
		"\7k\2\2\u0c50\u0c54\7>\2\2\u0c51\u0c52\5\u0178\u00bd\2\u0c52\u0c53\b\u00ba"+
		"\1\2\u0c53\u0c55\3\2\2\2\u0c54\u0c51\3\2\2\2\u0c54\u0c55\3\2\2\2\u0c55"+
		"\u0c56\3\2\2\2\u0c56\u0c57\7?\2\2\u0c57\u0c58\b\u00ba\1\2\u0c58\u0c5a"+
		"\3\2\2\2\u0c59\u0c0b\3\2\2\2\u0c59\u0c14\3\2\2\2\u0c59\u0c25\3\2\2\2\u0c59"+
		"\u0c36\3\2\2\2\u0c59\u0c46\3\2\2\2\u0c5a\u0173\3\2\2\2\u0c5b\u0c5f\7F"+
		"\2\2\u0c5c\u0c5d\5$\23\2\u0c5d\u0c5e\b\u00bb\1\2\u0c5e\u0c60\3\2\2\2\u0c5f"+
		"\u0c5c\3\2\2\2\u0c5f\u0c60\3\2\2\2\u0c60\u0c61\3\2\2\2\u0c61\u0c62\7k"+
		"\2\2\u0c62\u0c66\7>\2\2\u0c63\u0c64\5\u0178\u00bd\2\u0c64\u0c65\b\u00bb"+
		"\1\2\u0c65\u0c67\3\2\2\2\u0c66\u0c63\3\2\2\2\u0c66\u0c67\3\2\2\2\u0c67"+
		"\u0c68\3\2\2\2\u0c68\u0c69\7?\2\2\u0c69\u0c6a\b\u00bb\1\2\u0c6a\u0175"+
		"\3\2\2\2\u0c6b\u0c6c\7k\2\2\u0c6c\u0c70\7>\2\2\u0c6d\u0c6e\5\u0178\u00bd"+
		"\2\u0c6e\u0c6f\b\u00bc\1\2\u0c6f\u0c71\3\2\2\2\u0c70\u0c6d\3\2\2\2\u0c70"+
		"\u0c71\3\2\2\2\u0c71\u0c72\3\2\2\2\u0c72\u0c73\7?\2\2\u0c73\u0ca9\b\u00bc"+
		"\1\2\u0c74\u0c75\5\64\33\2\u0c75\u0c79\7F\2\2\u0c76\u0c77\5$\23\2\u0c77"+
		"\u0c78\b\u00bc\1\2\u0c78\u0c7a\3\2\2\2\u0c79\u0c76\3\2\2\2\u0c79\u0c7a"+
		"\3\2\2\2\u0c7a\u0c7b\3\2\2\2\u0c7b\u0c7c\7k\2\2\u0c7c\u0c80\7>\2\2\u0c7d"+
		"\u0c7e\5\u0178\u00bd\2\u0c7e\u0c7f\b\u00bc\1\2\u0c7f\u0c81\3\2\2\2\u0c80"+
		"\u0c7d\3\2\2\2\u0c80\u0c81\3\2\2\2\u0c81\u0c82\3\2\2\2\u0c82\u0c83\7?"+
		"\2\2\u0c83\u0c84\b\u00bc\1\2\u0c84\u0ca9\3\2\2\2\u0c85\u0c86\7*\2\2\u0c86"+
		"\u0c8a\7F\2\2\u0c87\u0c88\5$\23\2\u0c88\u0c89\b\u00bc\1\2\u0c89\u0c8b"+
		"\3\2\2\2\u0c8a\u0c87\3\2\2\2\u0c8a\u0c8b\3\2\2\2\u0c8b\u0c8c\3\2\2\2\u0c8c"+
		"\u0c8d\7k\2\2\u0c8d\u0c91\7>\2\2\u0c8e\u0c8f\5\u0178\u00bd\2\u0c8f\u0c90"+
		"\b\u00bc\1\2\u0c90\u0c92\3\2\2\2\u0c91\u0c8e\3\2\2\2\u0c91\u0c92\3\2\2"+
		"\2\u0c92\u0c93\3\2\2\2\u0c93\u0c94\7?\2\2\u0c94\u0ca9\b\u00bc\1\2\u0c95"+
		"\u0c96\5.\30\2\u0c96\u0c97\7F\2\2\u0c97\u0c98\7*\2\2\u0c98\u0c9c\7F\2"+
		"\2\u0c99\u0c9a\5$\23\2\u0c9a\u0c9b\b\u00bc\1\2\u0c9b\u0c9d\3\2\2\2\u0c9c"+
		"\u0c99\3\2\2\2\u0c9c\u0c9d\3\2\2\2\u0c9d\u0c9e\3\2\2\2\u0c9e\u0c9f\7k"+
		"\2\2\u0c9f\u0ca3\7>\2\2\u0ca0\u0ca1\5\u0178\u00bd\2\u0ca1\u0ca2\b\u00bc"+
		"\1\2\u0ca2\u0ca4\3\2\2\2\u0ca3\u0ca0\3\2\2\2\u0ca3\u0ca4\3\2\2\2\u0ca4"+
		"\u0ca5\3\2\2\2\u0ca5\u0ca6\7?\2\2\u0ca6\u0ca7\b\u00bc\1\2\u0ca7\u0ca9"+
		"\3\2\2\2\u0ca8\u0c6b\3\2\2\2\u0ca8\u0c74\3\2\2\2\u0ca8\u0c85\3\2\2\2\u0ca8"+
		"\u0c95\3\2\2\2\u0ca9\u0177\3\2\2\2\u0caa\u0cab\5\u0188\u00c5\2\u0cab\u0cac"+
		"\b\u00bd\1\2\u0cac\u0cb3\3\2\2\2\u0cad\u0cae\7E\2\2\u0cae\u0caf\5\u0188"+
		"\u00c5\2\u0caf\u0cb0\b\u00bd\1\2\u0cb0\u0cb2\3\2\2\2\u0cb1\u0cad\3\2\2"+
		"\2\u0cb2\u0cb5\3\2\2\2\u0cb3\u0cb1\3\2\2\2\u0cb3\u0cb4\3\2\2\2\u0cb4\u0cb6"+
		"\3\2\2\2\u0cb5\u0cb3\3\2\2\2\u0cb6\u0cb7\b\u00bd\1\2\u0cb7\u0179\3\2\2"+
		"\2\u0cb8\u0cb9\5\62\32\2\u0cb9\u0cbd\7_\2\2\u0cba\u0cbb\5$\23\2\u0cbb"+
		"\u0cbc\b\u00be\1\2\u0cbc\u0cbe\3\2\2\2\u0cbd\u0cba\3\2\2\2\u0cbd\u0cbe"+
		"\3\2\2\2\u0cbe\u0cbf\3\2\2\2\u0cbf\u0cc0\7k\2\2\u0cc0\u0cc1\b\u00be\1"+
		"\2\u0cc1\u0cfb\3\2\2\2\u0cc2\u0cc3\5\16\b\2\u0cc3\u0cc7\7_\2\2\u0cc4\u0cc5"+
		"\5$\23\2\u0cc5\u0cc6\b\u00be\1\2\u0cc6\u0cc8\3\2\2\2\u0cc7\u0cc4\3\2\2"+
		"\2\u0cc7\u0cc8\3\2\2\2\u0cc8\u0cc9\3\2\2\2\u0cc9\u0cca\7k\2\2\u0cca\u0ccb"+
		"\b\u00be\1\2\u0ccb\u0cfb\3\2\2\2\u0ccc\u0ccd\5\u014a\u00a6\2\u0ccd\u0cd1"+
		"\7_\2\2\u0cce\u0ccf\5$\23\2\u0ccf\u0cd0\b\u00be\1\2\u0cd0\u0cd2\3\2\2"+
		"\2\u0cd1\u0cce\3\2\2\2\u0cd1\u0cd2\3\2\2\2\u0cd2\u0cd3\3\2\2\2\u0cd3\u0cd4"+
		"\7k\2\2\u0cd4\u0cd5\b\u00be\1\2\u0cd5\u0cfb\3\2\2\2\u0cd6\u0cd7\7*\2\2"+
		"\u0cd7\u0cdb\7_\2\2\u0cd8\u0cd9\5$\23\2\u0cd9\u0cda\b\u00be\1\2\u0cda"+
		"\u0cdc\3\2\2\2\u0cdb\u0cd8\3\2\2\2\u0cdb\u0cdc\3\2\2\2\u0cdc\u0cdd\3\2"+
		"\2\2\u0cdd\u0cde\7k\2\2\u0cde\u0cfb\b\u00be\1\2\u0cdf\u0ce0\5.\30\2\u0ce0"+
		"\u0ce1\7F\2\2\u0ce1\u0ce2\7*\2\2\u0ce2\u0ce6\7_\2\2\u0ce3\u0ce4\5$\23"+
		"\2\u0ce4\u0ce5\b\u00be\1\2\u0ce5\u0ce7\3\2\2\2\u0ce6\u0ce3\3\2\2\2\u0ce6"+
		"\u0ce7\3\2\2\2\u0ce7\u0ce8\3\2\2\2\u0ce8\u0ce9\7k\2\2\u0ce9\u0cea\b\u00be"+
		"\1\2\u0cea\u0cfb\3\2\2\2\u0ceb\u0cec\5\22\n\2\u0cec\u0cf0\7_\2\2\u0ced"+
		"\u0cee\5$\23\2\u0cee\u0cef\b\u00be\1\2\u0cef\u0cf1\3\2\2\2\u0cf0\u0ced"+
		"\3\2\2\2\u0cf0\u0cf1\3\2\2\2\u0cf1\u0cf2\3\2\2\2\u0cf2\u0cf3\7!\2\2\u0cf3"+
		"\u0cf4\b\u00be\1\2\u0cf4\u0cfb\3\2\2\2\u0cf5\u0cf6\5\30\r\2\u0cf6\u0cf7"+
		"\7_\2\2\u0cf7\u0cf8\7!\2\2\u0cf8\u0cf9\b\u00be\1\2\u0cf9\u0cfb\3\2\2\2"+
		"\u0cfa\u0cb8\3\2\2\2\u0cfa\u0cc2\3\2\2\2\u0cfa\u0ccc\3\2\2\2\u0cfa\u0cd6"+
		"\3\2\2\2\u0cfa\u0cdf\3\2\2\2\u0cfa\u0ceb\3\2\2\2\u0cfa\u0cf5\3\2\2\2\u0cfb"+
		"\u017b\3\2\2\2\u0cfc\u0d00\7_\2\2\u0cfd\u0cfe\5$\23\2\u0cfe\u0cff\b\u00bf"+
		"\1\2\u0cff\u0d01\3\2\2\2\u0d00\u0cfd\3\2\2\2\u0d00\u0d01\3\2\2\2\u0d01"+
		"\u0d02\3\2\2\2\u0d02\u0d03\7k\2\2\u0d03\u0d04\b\u00bf\1\2\u0d04\u017d"+
		"\3\2\2\2\u0d05\u0d06\5\62\32\2\u0d06\u0d0a\7_\2\2\u0d07\u0d08\5$\23\2"+
		"\u0d08\u0d09\b\u00c0\1\2\u0d09\u0d0b\3\2\2\2\u0d0a\u0d07\3\2\2\2\u0d0a"+
		"\u0d0b\3\2\2\2\u0d0b\u0d0c\3\2\2\2\u0d0c\u0d0d\7k\2\2\u0d0d\u0d0e\b\u00c0"+
		"\1\2\u0d0e\u0d3e\3\2\2\2\u0d0f\u0d10\5\16\b\2\u0d10\u0d14\7_\2\2\u0d11"+
		"\u0d12\5$\23\2\u0d12\u0d13\b\u00c0\1\2\u0d13\u0d15\3\2\2\2\u0d14\u0d11"+
		"\3\2\2\2\u0d14\u0d15\3\2\2\2\u0d15\u0d16\3\2\2\2\u0d16\u0d17\7k\2\2\u0d17"+
		"\u0d18\b\u00c0\1\2\u0d18\u0d3e\3\2\2\2\u0d19\u0d1a\7*\2\2\u0d1a\u0d1e"+
		"\7_\2\2\u0d1b\u0d1c\5$\23\2\u0d1c\u0d1d\b\u00c0\1\2\u0d1d\u0d1f\3\2\2"+
		"\2\u0d1e\u0d1b\3\2\2\2\u0d1e\u0d1f\3\2\2\2\u0d1f\u0d20\3\2\2\2\u0d20\u0d21"+
		"\7k\2\2\u0d21\u0d3e\b\u00c0\1\2\u0d22\u0d23\5.\30\2\u0d23\u0d24\7F\2\2"+
		"\u0d24\u0d25\7*\2\2\u0d25\u0d29\7_\2\2\u0d26\u0d27\5$\23\2\u0d27\u0d28"+
		"\b\u00c0\1\2\u0d28\u0d2a\3\2\2\2\u0d29\u0d26\3\2\2\2\u0d29\u0d2a\3\2\2"+
		"\2\u0d2a\u0d2b\3\2\2\2\u0d2b\u0d2c\7k\2\2\u0d2c\u0d2d\b\u00c0\1\2\u0d2d"+
		"\u0d3e\3\2\2\2\u0d2e\u0d2f\5\22\n\2\u0d2f\u0d33\7_\2\2\u0d30\u0d31\5$"+
		"\23\2\u0d31\u0d32\b\u00c0\1\2\u0d32\u0d34\3\2\2\2\u0d33\u0d30\3\2\2\2"+
		"\u0d33\u0d34\3\2\2\2\u0d34\u0d35\3\2\2\2\u0d35\u0d36\7!\2\2\u0d36\u0d37"+
		"\b\u00c0\1\2\u0d37\u0d3e\3\2\2\2\u0d38\u0d39\5\30\r\2\u0d39\u0d3a\7_\2"+
		"\2\u0d3a\u0d3b\7!\2\2\u0d3b\u0d3c\b\u00c0\1\2\u0d3c\u0d3e\3\2\2\2\u0d3d"+
		"\u0d05\3\2\2\2\u0d3d\u0d0f\3\2\2\2\u0d3d\u0d19\3\2\2\2\u0d3d\u0d22\3\2"+
		"\2\2\u0d3d\u0d2e\3\2\2\2\u0d3d\u0d38\3\2\2\2\u0d3e\u017f\3\2\2\2\u0d3f"+
		"\u0d40\7!\2\2\u0d40\u0d41\5\6\4\2\u0d41\u0d45\5\u0182\u00c2\2\u0d42\u0d43"+
		"\5\32\16\2\u0d43\u0d44\b\u00c1\1\2\u0d44\u0d46\3\2\2\2\u0d45\u0d42\3\2"+
		"\2\2\u0d45\u0d46\3\2\2\2\u0d46\u0d47\3\2\2\2\u0d47\u0d48\b\u00c1\1\2\u0d48"+
		"\u0d60\3\2\2\2\u0d49\u0d4a\7!\2\2\u0d4a\u0d4b\5\20\t\2\u0d4b\u0d4f\5\u0182"+
		"\u00c2\2\u0d4c\u0d4d\5\32\16\2\u0d4d\u0d4e\b\u00c1\1\2\u0d4e\u0d50\3\2"+
		"\2\2\u0d4f\u0d4c\3\2\2\2\u0d4f\u0d50\3\2\2\2\u0d50\u0d51\3\2\2\2\u0d51"+
		"\u0d52\b\u00c1\1\2\u0d52\u0d60\3\2\2\2\u0d53\u0d54\7!\2\2\u0d54\u0d55"+
		"\5\6\4\2\u0d55\u0d56\5\32\16\2\u0d56\u0d57\5\u00e4s\2\u0d57\u0d58\b\u00c1"+
		"\1\2\u0d58\u0d60\3\2\2\2\u0d59\u0d5a\7!\2\2\u0d5a\u0d5b\5\20\t\2\u0d5b"+
		"\u0d5c\5\32\16\2\u0d5c\u0d5d\5\u00e4s\2\u0d5d\u0d5e\b\u00c1\1\2\u0d5e"+
		"\u0d60\3\2\2\2\u0d5f\u0d3f\3\2\2\2\u0d5f\u0d49\3\2\2\2\u0d5f\u0d53\3\2"+
		"\2\2\u0d5f\u0d59\3\2\2\2\u0d60\u0181\3\2\2\2\u0d61\u0d62\5\u0184\u00c3"+
		"\2\u0d62\u0d68\b\u00c2\1\2\u0d63\u0d64\5\u0184\u00c3\2\u0d64\u0d65\b\u00c2"+
		"\1\2\u0d65\u0d67\3\2\2\2\u0d66\u0d63\3\2\2\2\u0d67\u0d6a\3\2\2\2\u0d68"+
		"\u0d66\3\2\2\2\u0d68\u0d69\3\2\2\2\u0d69\u0183\3\2\2\2\u0d6a\u0d68\3\2"+
		"\2\2\u0d6b\u0d6c\5\u00d2j\2\u0d6c\u0d6d\b\u00c3\1\2\u0d6d\u0d6f\3\2\2"+
		"\2\u0d6e\u0d6b\3\2\2\2\u0d6f\u0d72\3\2\2\2\u0d70\u0d6e\3\2\2\2\u0d70\u0d71"+
		"\3\2\2\2\u0d71\u0d73\3\2\2\2\u0d72\u0d70\3\2\2\2\u0d73\u0d74\7B\2\2\u0d74"+
		"\u0d75\5\u0188\u00c5\2\u0d75\u0d76\7C\2\2\u0d76\u0d77\b\u00c3\1\2\u0d77"+
		"\u0185\3\2\2\2\u0d78\u0d79\5\u0188\u00c5\2\u0d79\u0d7a\b\u00c4\1\2\u0d7a"+
		"\u0187\3\2\2\2\u0d7b\u0d7c\5\u018a\u00c6\2\u0d7c\u0d7d\b\u00c5\1\2\u0d7d"+
		"\u0d82\3\2\2\2\u0d7e\u0d7f\5\u0192\u00ca\2\u0d7f\u0d80\b\u00c5\1\2\u0d80"+
		"\u0d82\3\2\2\2\u0d81\u0d7b\3\2\2\2\u0d81\u0d7e\3\2\2\2\u0d82\u0189\3\2"+
		"\2\2\u0d83\u0d84\5\u018c\u00c7\2\u0d84\u0d85\7^\2\2\u0d85\u0d86\5\u0190"+
		"\u00c9\2\u0d86\u0d87\b\u00c6\1\2\u0d87\u018b\3\2\2\2\u0d88\u0d89\7k\2"+
		"\2\u0d89\u0d98\b\u00c7\1\2\u0d8a\u0d8e\7>\2\2\u0d8b\u0d8c\5\u0086D\2\u0d8c"+
		"\u0d8d\b\u00c7\1\2\u0d8d\u0d8f\3\2\2\2\u0d8e\u0d8b\3\2\2\2\u0d8e\u0d8f"+
		"\3\2\2\2\u0d8f\u0d90\3\2\2\2\u0d90\u0d91\7?\2\2\u0d91\u0d98\b\u00c7\1"+
		"\2\u0d92\u0d93\7>\2\2\u0d93\u0d94\5\u018e\u00c8\2\u0d94\u0d95\7?\2\2\u0d95"+
		"\u0d96\b\u00c7\1\2\u0d96\u0d98\3\2\2\2\u0d97\u0d88\3\2\2\2\u0d97\u0d8a"+
		"\3\2\2\2\u0d97\u0d92\3\2\2\2\u0d98\u018d\3\2\2\2\u0d99\u0d9a\7k\2\2\u0d9a"+
		"\u0d9b\b\u00c8\1\2\u0d9b\u0da1\3\2\2\2\u0d9c\u0d9d\7E\2\2\u0d9d\u0d9e"+
		"\7k\2\2\u0d9e\u0da0\b\u00c8\1\2\u0d9f\u0d9c\3\2\2\2\u0da0\u0da3\3\2\2"+
		"\2\u0da1\u0d9f\3\2\2\2\u0da1\u0da2\3\2\2\2\u0da2\u0da4\3\2\2\2\u0da3\u0da1"+
		"\3\2\2\2\u0da4\u0da5\b\u00c8\1\2\u0da5\u018f\3\2\2\2\u0da6\u0da7\5\u0188"+
		"\u00c5\2\u0da7\u0da8\b\u00c9\1\2\u0da8\u0dad\3\2\2\2\u0da9\u0daa\5\u00e8"+
		"u\2\u0daa\u0dab\b\u00c9\1\2\u0dab\u0dad\3\2\2\2\u0dac\u0da6\3\2\2\2\u0dac"+
		"\u0da9\3\2\2\2\u0dad\u0191\3\2\2\2\u0dae\u0daf\5\u019a\u00ce\2\u0daf\u0db0"+
		"\b\u00ca\1\2\u0db0\u0db5\3\2\2\2\u0db1\u0db2\5\u0194\u00cb\2\u0db2\u0db3"+
		"\b\u00ca\1\2\u0db3\u0db5\3\2\2\2\u0db4\u0dae\3\2\2\2\u0db4\u0db1\3\2\2"+
		"\2\u0db5\u0193\3\2\2\2\u0db6\u0db7\5\u0196\u00cc\2\u0db7\u0db8\5\u0198"+
		"\u00cd\2\u0db8\u0db9\5\u0188\u00c5\2\u0db9\u0dba\b\u00cb\1\2\u0dba\u0195"+
		"\3\2\2\2\u0dbb\u0dbc\5\62\32\2\u0dbc\u0dbd\b\u00cc\1\2\u0dbd\u0dc5\3\2"+
		"\2\2\u0dbe\u0dbf\5\u0166\u00b4\2\u0dbf\u0dc0\b\u00cc\1\2\u0dc0\u0dc5\3"+
		"\2\2\2\u0dc1\u0dc2\5\u016c\u00b7\2\u0dc2\u0dc3\b\u00cc\1\2\u0dc3\u0dc5"+
		"\3\2\2\2\u0dc4\u0dbb\3\2\2\2\u0dc4\u0dbe\3\2\2\2\u0dc4\u0dc1\3\2\2\2\u0dc5"+
		"\u0197\3\2\2\2\u0dc6\u0dc7\7G\2\2\u0dc7\u0ddf\b\u00cd\1\2\u0dc8\u0dc9"+
		"\7b\2\2\u0dc9\u0ddf\b\u00cd\1\2\u0dca\u0dcb\7c\2\2\u0dcb\u0ddf\b\u00cd"+
		"\1\2\u0dcc\u0dcd\7g\2\2\u0dcd\u0ddf\b\u00cd\1\2\u0dce\u0dcf\7`\2\2\u0dcf"+
		"\u0ddf\b\u00cd\1\2\u0dd0\u0dd1\7a\2\2\u0dd1\u0ddf\b\u00cd\1\2\u0dd2\u0dd3"+
		"\7h\2\2\u0dd3\u0ddf\b\u00cd\1\2\u0dd4\u0dd5\7i\2\2\u0dd5\u0ddf\b\u00cd"+
		"\1\2\u0dd6\u0dd7\7j\2\2\u0dd7\u0ddf\b\u00cd\1\2\u0dd8\u0dd9\7d\2\2\u0dd9"+
		"\u0ddf\b\u00cd\1\2\u0dda\u0ddb\7f\2\2\u0ddb\u0ddf\b\u00cd\1\2\u0ddc\u0ddd"+
		"\7e\2\2\u0ddd\u0ddf\b\u00cd\1\2\u0dde\u0dc6\3\2\2\2\u0dde\u0dc8\3\2\2"+
		"\2\u0dde\u0dca\3\2\2\2\u0dde\u0dcc\3\2\2\2\u0dde\u0dce\3\2\2\2\u0dde\u0dd0"+
		"\3\2\2\2\u0dde\u0dd2\3\2\2\2\u0dde\u0dd4\3\2\2\2\u0dde\u0dd6\3\2\2\2\u0dde"+
		"\u0dd8\3\2\2\2\u0dde\u0dda\3\2\2\2\u0dde\u0ddc\3\2\2\2\u0ddf\u0199\3\2"+
		"\2\2\u0de0\u0de1\5\u019c\u00cf\2\u0de1\u0de2\b\u00ce\1\2\u0de2\u0deb\3"+
		"\2\2\2\u0de3\u0de4\5\u019c\u00cf\2\u0de4\u0de5\7L\2\2\u0de5\u0de6\5\u0188"+
		"\u00c5\2\u0de6\u0de7\7M\2\2\u0de7\u0de8\5\u019a\u00ce\2\u0de8\u0de9\b"+
		"\u00ce\1\2\u0de9\u0deb\3\2\2\2\u0dea\u0de0\3\2\2\2\u0dea\u0de3\3\2\2\2"+
		"\u0deb\u019b\3\2\2\2\u0dec\u0ded\b\u00cf\1\2\u0ded\u0dee\5\u019e\u00d0"+
		"\2\u0dee\u0def\b\u00cf\1\2\u0def\u0df7\3\2\2\2\u0df0\u0df1\f\3\2\2\u0df1"+
		"\u0df2\7S\2\2\u0df2\u0df3\5\u019e\u00d0\2\u0df3\u0df4\b\u00cf\1\2\u0df4"+
		"\u0df6\3\2\2\2\u0df5\u0df0\3\2\2\2\u0df6\u0df9\3\2\2\2\u0df7\u0df5\3\2"+
		"\2\2\u0df7\u0df8\3\2\2\2\u0df8\u019d\3\2\2\2\u0df9\u0df7\3\2\2\2\u0dfa"+
		"\u0dfb\b\u00d0\1\2\u0dfb\u0dfc\5\u01a0\u00d1\2\u0dfc\u0dfd\b\u00d0\1\2"+
		"\u0dfd\u0e05\3\2\2\2\u0dfe\u0dff\f\3\2\2\u0dff\u0e00\7R\2\2\u0e00\u0e01"+
		"\5\u01a0\u00d1\2\u0e01\u0e02\b\u00d0\1\2\u0e02\u0e04\3\2\2\2\u0e03\u0dfe"+
		"\3\2\2\2\u0e04\u0e07\3\2\2\2\u0e05\u0e03\3\2\2\2\u0e05\u0e06\3\2\2\2\u0e06"+
		"\u019f\3\2\2\2\u0e07\u0e05\3\2\2\2\u0e08\u0e09\b\u00d1\1\2\u0e09\u0e0a"+
		"\5\u01a2\u00d2\2\u0e0a\u0e0b\b\u00d1\1\2\u0e0b\u0e13\3\2\2\2\u0e0c\u0e0d"+
		"\f\3\2\2\u0e0d\u0e0e\7[\2\2\u0e0e\u0e0f\5\u01a2\u00d2\2\u0e0f\u0e10\b"+
		"\u00d1\1\2\u0e10\u0e12\3\2\2\2\u0e11\u0e0c\3\2\2\2\u0e12\u0e15\3\2\2\2"+
		"\u0e13\u0e11\3\2\2\2\u0e13\u0e14\3\2\2\2\u0e14\u01a1\3\2\2\2\u0e15\u0e13"+
		"\3\2\2\2\u0e16\u0e17\b\u00d2\1\2\u0e17\u0e18\5\u01a4\u00d3\2\u0e18\u0e19"+
		"\b\u00d2\1\2\u0e19\u0e21\3\2\2\2\u0e1a\u0e1b\f\3\2\2\u0e1b\u0e1c\7\\\2"+
		"\2\u0e1c\u0e1d\5\u01a4\u00d3\2\u0e1d\u0e1e\b\u00d2\1\2\u0e1e\u0e20\3\2"+
		"\2\2\u0e1f\u0e1a\3\2\2\2\u0e20\u0e23\3\2\2\2\u0e21\u0e1f\3\2\2\2\u0e21"+
		"\u0e22\3\2\2\2\u0e22\u01a3\3\2\2\2\u0e23\u0e21\3\2\2\2\u0e24\u0e25\b\u00d3"+
		"\1\2\u0e25\u0e26\5\u01a6\u00d4\2\u0e26\u0e27\b\u00d3\1\2\u0e27\u0e2f\3"+
		"\2\2\2\u0e28\u0e29\f\3\2\2\u0e29\u0e2a\7Z\2\2\u0e2a\u0e2b\5\u01a6\u00d4"+
		"\2\u0e2b\u0e2c\b\u00d3\1\2\u0e2c\u0e2e\3\2\2\2\u0e2d\u0e28\3\2\2\2\u0e2e"+
		"\u0e31\3\2\2\2\u0e2f\u0e2d\3\2\2\2\u0e2f\u0e30\3\2\2\2\u0e30\u01a5\3\2"+
		"\2\2\u0e31\u0e2f\3\2\2\2\u0e32\u0e33\b\u00d4\1\2\u0e33\u0e34\5\u01a8\u00d5"+
		"\2\u0e34\u0e35\b\u00d4\1\2\u0e35\u0e42\3\2\2\2\u0e36\u0e37\f\4\2\2\u0e37"+
		"\u0e38\7N\2\2\u0e38\u0e39\5\u01a8\u00d5\2\u0e39\u0e3a\b\u00d4\1\2\u0e3a"+
		"\u0e41\3\2\2\2\u0e3b\u0e3c\f\3\2\2\u0e3c\u0e3d\7Q\2\2\u0e3d\u0e3e\5\u01a8"+
		"\u00d5\2\u0e3e\u0e3f\b\u00d4\1\2\u0e3f\u0e41\3\2\2\2\u0e40\u0e36\3\2\2"+
		"\2\u0e40\u0e3b\3\2\2\2\u0e41\u0e44\3\2\2\2\u0e42\u0e40\3\2\2\2\u0e42\u0e43"+
		"\3\2\2\2\u0e43\u01a7\3\2\2\2\u0e44\u0e42\3\2\2\2\u0e45\u0e46\b\u00d5\1"+
		"\2\u0e46\u0e47\5\u01aa\u00d6\2\u0e47\u0e48\b\u00d5\1\2\u0e48\u0e64\3\2"+
		"\2\2\u0e49\u0e4a\f\7\2\2\u0e4a\u0e4b\7I\2\2\u0e4b\u0e4c\5\u01aa\u00d6"+
		"\2\u0e4c\u0e4d\b\u00d5\1\2\u0e4d\u0e63\3\2\2\2\u0e4e\u0e4f\f\6\2\2\u0e4f"+
		"\u0e50\7H\2\2\u0e50\u0e51\5\u01aa\u00d6\2\u0e51\u0e52\b\u00d5\1\2\u0e52"+
		"\u0e63\3\2\2\2\u0e53\u0e54\f\5\2\2\u0e54\u0e55\7O\2\2\u0e55\u0e56\5\u01aa"+
		"\u00d6\2\u0e56\u0e57\b\u00d5\1\2\u0e57\u0e63\3\2\2\2\u0e58\u0e59\f\4\2"+
		"\2\u0e59\u0e5a\7P\2\2\u0e5a\u0e5b\5\u01aa\u00d6\2\u0e5b\u0e5c\b\u00d5"+
		"\1\2\u0e5c\u0e63\3\2\2\2\u0e5d\u0e5e\f\3\2\2\u0e5e\u0e5f\7\34\2\2\u0e5f"+
		"\u0e60\5\16\b\2\u0e60\u0e61\b\u00d5\1\2\u0e61\u0e63\3\2\2\2\u0e62\u0e49"+
		"\3\2\2\2\u0e62\u0e4e\3\2\2\2\u0e62\u0e53\3\2\2\2\u0e62\u0e58\3\2\2\2\u0e62"+
		"\u0e5d\3\2\2\2\u0e63\u0e66\3\2\2\2\u0e64\u0e62\3\2\2\2\u0e64\u0e65\3\2"+
		"\2\2\u0e65\u01a9\3\2\2\2\u0e66\u0e64\3\2\2\2\u0e67\u0e68\b\u00d6\1\2\u0e68"+
		"\u0e69\5\u01ac\u00d7\2\u0e69\u0e6a\b\u00d6\1\2\u0e6a\u0e80\3\2\2\2\u0e6b"+
		"\u0e6c\f\5\2\2\u0e6c\u0e6d\7I\2\2\u0e6d\u0e6e\7I\2\2\u0e6e\u0e6f\5\u01ac"+
		"\u00d7\2\u0e6f\u0e70\b\u00d6\1\2\u0e70\u0e7f\3\2\2\2\u0e71\u0e72\f\4\2"+
		"\2\u0e72\u0e73\7H\2\2\u0e73\u0e74\7H\2\2\u0e74\u0e75\5\u01ac\u00d7\2\u0e75"+
		"\u0e76\b\u00d6\1\2\u0e76\u0e7f\3\2\2\2\u0e77\u0e78\f\3\2\2\u0e78\u0e79"+
		"\7H\2\2\u0e79\u0e7a\7H\2\2\u0e7a\u0e7b\7H\2\2\u0e7b\u0e7c\5\u01ac\u00d7"+
		"\2\u0e7c\u0e7d\b\u00d6\1\2\u0e7d\u0e7f\3\2\2\2\u0e7e\u0e6b\3\2\2\2\u0e7e"+
		"\u0e71\3\2\2\2\u0e7e\u0e77\3\2\2\2\u0e7f\u0e82\3\2\2\2\u0e80\u0e7e\3\2"+
		"\2\2\u0e80\u0e81\3\2\2\2\u0e81\u01ab\3\2\2\2\u0e82\u0e80\3\2\2\2\u0e83"+
		"\u0e84\b\u00d7\1\2\u0e84\u0e85\5\u01ae\u00d8\2\u0e85\u0e86\b\u00d7\1\2"+
		"\u0e86\u0e93\3\2\2\2\u0e87\u0e88\f\4\2\2\u0e88\u0e89\7V\2\2\u0e89\u0e8a"+
		"\5\u01ae\u00d8\2\u0e8a\u0e8b\b\u00d7\1\2\u0e8b\u0e92\3\2\2\2\u0e8c\u0e8d"+
		"\f\3\2\2\u0e8d\u0e8e\7W\2\2\u0e8e\u0e8f\5\u01ae\u00d8\2\u0e8f\u0e90\b"+
		"\u00d7\1\2\u0e90\u0e92\3\2\2\2\u0e91\u0e87\3\2\2\2\u0e91\u0e8c\3\2\2\2"+
		"\u0e92\u0e95\3\2\2\2\u0e93\u0e91\3\2\2\2\u0e93\u0e94\3\2\2\2\u0e94\u01ad"+
		"\3\2\2\2\u0e95\u0e93\3\2\2\2\u0e96\u0e97\b\u00d8\1\2\u0e97\u0e98\5\u01b0"+
		"\u00d9\2\u0e98\u0e99\b\u00d8\1\2\u0e99\u0eab\3\2\2\2\u0e9a\u0e9b\f\5\2"+
		"\2\u0e9b\u0e9c\7X\2\2\u0e9c\u0e9d\5\u01b0\u00d9\2\u0e9d\u0e9e\b\u00d8"+
		"\1\2\u0e9e\u0eaa\3\2\2\2\u0e9f\u0ea0\f\4\2\2\u0ea0\u0ea1\7Y\2\2\u0ea1"+
		"\u0ea2\5\u01b0\u00d9\2\u0ea2\u0ea3\b\u00d8\1\2\u0ea3\u0eaa\3\2\2\2\u0ea4"+
		"\u0ea5\f\3\2\2\u0ea5\u0ea6\7]\2\2\u0ea6\u0ea7\5\u01b0\u00d9\2\u0ea7\u0ea8"+
		"\b\u00d8\1\2\u0ea8\u0eaa\3\2\2\2\u0ea9\u0e9a\3\2\2\2\u0ea9\u0e9f\3\2\2"+
		"\2\u0ea9\u0ea4\3\2\2\2\u0eaa\u0ead\3\2\2\2\u0eab\u0ea9\3\2\2\2\u0eab\u0eac"+
		"\3\2\2\2\u0eac\u01af\3\2\2\2\u0ead\u0eab\3\2\2\2\u0eae\u0eaf\5\u01b2\u00da"+
		"\2\u0eaf\u0eb0\b\u00d9\1\2\u0eb0\u0ec0\3\2\2\2\u0eb1\u0eb2\5\u01b4\u00db"+
		"\2\u0eb2\u0eb3\b\u00d9\1\2\u0eb3\u0ec0\3\2\2\2\u0eb4\u0eb5\7V\2\2\u0eb5"+
		"\u0eb6\5\u01b0\u00d9\2\u0eb6\u0eb7\b\u00d9\1\2\u0eb7\u0ec0\3\2\2\2\u0eb8"+
		"\u0eb9\7W\2\2\u0eb9\u0eba\5\u01b0\u00d9\2\u0eba\u0ebb\b\u00d9\1\2\u0ebb"+
		"\u0ec0\3\2\2\2\u0ebc\u0ebd\5\u01b6\u00dc\2\u0ebd\u0ebe\b\u00d9\1\2\u0ebe"+
		"\u0ec0\3\2\2\2\u0ebf\u0eae\3\2\2\2\u0ebf\u0eb1\3\2\2\2\u0ebf\u0eb4\3\2"+
		"\2\2\u0ebf\u0eb8\3\2\2\2\u0ebf\u0ebc\3\2\2\2\u0ec0\u01b1\3\2\2\2\u0ec1"+
		"\u0ec2\7T\2\2\u0ec2\u0ec3\5\u01b0\u00d9\2\u0ec3\u0ec4\b\u00da\1\2\u0ec4"+
		"\u01b3\3\2\2\2\u0ec5\u0ec6\7U\2\2\u0ec6\u0ec7\5\u01b0\u00d9\2\u0ec7\u0ec8"+
		"\b\u00db\1\2\u0ec8\u01b5\3\2\2\2\u0ec9\u0eca\5\u01b8\u00dd\2\u0eca\u0ecb"+
		"\b\u00dc\1\2\u0ecb\u0ed8\3\2\2\2\u0ecc\u0ecd\7K\2\2\u0ecd\u0ece\5\u01b0"+
		"\u00d9\2\u0ece\u0ecf\b\u00dc\1\2\u0ecf\u0ed8\3\2\2\2\u0ed0\u0ed1\7J\2"+
		"\2\u0ed1\u0ed2\5\u01b0\u00d9\2\u0ed2\u0ed3\b\u00dc\1\2\u0ed3\u0ed8\3\2"+
		"\2\2\u0ed4\u0ed5\5\u01be\u00e0\2\u0ed5\u0ed6\b\u00dc\1\2\u0ed6\u0ed8\3"+
		"\2\2\2\u0ed7\u0ec9\3\2\2\2\u0ed7\u0ecc\3\2\2\2\u0ed7\u0ed0\3\2\2\2\u0ed7"+
		"\u0ed4\3\2\2\2\u0ed8\u01b7\3\2\2\2\u0ed9\u0eda\5\u014a\u00a6\2\u0eda\u0edb"+
		"\b\u00dd\1\2\u0edb\u0ee0\3\2\2\2\u0edc\u0edd\5\62\32\2\u0edd\u0ede\b\u00dd"+
		"\1\2\u0ede\u0ee0\3\2\2\2\u0edf\u0ed9\3\2\2\2\u0edf\u0edc\3\2\2\2\u0ee0"+
		"\u0ee7\3\2\2\2\u0ee1\u0ee2\7T\2\2\u0ee2\u0ee6\b\u00dd\1\2\u0ee3\u0ee4"+
		"\7U\2\2\u0ee4\u0ee6\b\u00dd\1\2\u0ee5\u0ee1\3\2\2\2\u0ee5\u0ee3\3\2\2"+
		"\2\u0ee6\u0ee9\3\2\2\2\u0ee7\u0ee5\3\2\2\2\u0ee7\u0ee8\3\2\2\2\u0ee8\u01b9"+
		"\3\2\2\2\u0ee9\u0ee7\3\2\2\2\u0eea\u0eeb\5\u01b8\u00dd\2\u0eeb\u0eec\7"+
		"T\2\2\u0eec\u0eed\b\u00de\1\2\u0eed\u01bb\3\2\2\2\u0eee\u0eef\5\u01b8"+
		"\u00dd\2\u0eef\u0ef0\7U\2\2\u0ef0\u0ef1\b\u00df\1\2\u0ef1\u01bd\3\2\2"+
		"\2\u0ef2\u0ef3\7>\2\2\u0ef3\u0ef4\5\6\4\2\u0ef4\u0ef5\7?\2\2\u0ef5\u0ef6"+
		"\5\u01b0\u00d9\2\u0ef6\u0ef7\b\u00e0\1\2\u0ef7\u0f15\3\2\2\2\u0ef8\u0ef9"+
		"\7>\2\2\u0ef9\u0eff\5\16\b\2\u0efa\u0efb\5\"\22\2\u0efb\u0efc\b\u00e0"+
		"\1\2\u0efc\u0efe\3\2\2\2\u0efd\u0efa\3\2\2\2\u0efe\u0f01\3\2\2\2\u0eff"+
		"\u0efd\3\2\2\2\u0eff\u0f00\3\2\2\2\u0f00\u0f02\3\2\2\2\u0f01\u0eff\3\2"+
		"\2\2\u0f02\u0f03\7?\2\2\u0f03\u0f04\5\u01b6\u00dc\2\u0f04\u0f05\b\u00e0"+
		"\1\2\u0f05\u0f15\3\2\2\2\u0f06\u0f07\7>\2\2\u0f07\u0f0d\5\16\b\2\u0f08"+
		"\u0f09\5\"\22\2\u0f09\u0f0a\b\u00e0\1\2\u0f0a\u0f0c\3\2\2\2\u0f0b\u0f08"+
		"\3\2\2\2\u0f0c\u0f0f\3\2\2\2\u0f0d\u0f0b\3\2\2\2\u0f0d\u0f0e\3\2\2\2\u0f0e"+
		"\u0f10\3\2\2\2\u0f0f\u0f0d\3\2\2\2\u0f10\u0f11\7?\2\2\u0f11\u0f12\5\u018a"+
		"\u00c6\2\u0f12\u0f13\b\u00e0\1\2\u0f13\u0f15\3\2\2\2\u0f14\u0ef2\3\2\2"+
		"\2\u0f14\u0ef8\3\2\2\2\u0f14\u0f06\3\2\2\2\u0f15\u01bf\3\2\2\2\u014c\u01d2"+
		"\u01da\u01e1\u01ec\u01f1\u01f9\u0205\u020b\u0216\u0220\u0228\u0230\u0239"+
		"\u0241\u0243\u024a\u0252\u0259\u026b\u0272\u027e\u0286\u0290\u0297\u02aa"+
		"\u02af\u02c2\u02cd\u02d4\u02da\u02e4\u02ed\u02f9\u0303\u030f\u0315\u031c"+
		"\u0324\u032f\u033b\u0350\u0375\u037d\u0385\u0387\u0390\u0395\u039a\u03ad"+
		"\u03bd\u03d3\u03dc\u03ec\u03f9\u0401\u0403\u0419\u0424\u042f\u0438\u0446"+
		"\u044e\u0455\u0460\u046b\u0476\u047d\u048e\u0496\u0498\u04b3\u04bb\u04c4"+
		"\u04ce\u04d0\u04d7\u04df\u04e5\u04f5\u0500\u050e\u0513\u051b\u051d\u052d"+
		"\u052f\u0538\u0542\u0549\u055f\u056a\u0571\u0580\u0582\u058b\u0596\u059b"+
		"\u05a3\u05ac\u05b1\u05b9\u05c0\u05c8\u05cf\u05d9\u05e0\u05eb\u05f2\u05f8"+
		"\u0600\u0602\u060a\u0611\u0614\u0617\u0621\u0629\u0631\u0634\u0638\u063e"+
		"\u0647\u064f\u0651\u065a\u065f\u0670\u067a\u068b\u0693\u0695\u06a3\u06ab"+
		"\u06ad\u06c0\u06c8\u06ca\u06d7\u06e8\u06f0\u06f2\u06fd\u0702\u070b\u071a"+
		"\u0721\u072b\u073c\u0742\u0745\u0753\u0767\u076a\u0772\u0775\u0779\u0784"+
		"\u078e\u079b\u07a9\u07b5\u07b7\u07d0\u07e1\u0807\u082f\u0856\u0865\u086d"+
		"\u0880\u0891\u08b0\u08b8\u08bf\u08c5\u08cb\u08d6\u08dc\u08e2\u08ee\u08fc"+
		"\u0909\u090b\u091d\u091f\u092c\u0934\u0941\u0959\u0961\u096a\u097d\u097f"+
		"\u098f\u099c\u09a1\u09a9\u09ad\u09b9\u09c4\u09c6\u09d4\u09db\u09fa\u0a02"+
		"\u0a10\u0a20\u0a3d\u0a4e\u0a5c\u0a6a\u0a87\u0a97\u0ab1\u0ab7\u0abe\u0ac9"+
		"\u0ad0\u0ad6\u0adc\u0ae1\u0ae9\u0af0\u0af8\u0afe\u0b03\u0b0b\u0b12\u0b1a"+
		"\u0b20\u0b25\u0b27\u0b2e\u0b35\u0b3d\u0b43\u0b48\u0b4e\u0b55\u0b60\u0b67"+
		"\u0b6d\u0b73\u0b78\u0b80\u0b87\u0b8f\u0b95\u0b9a\u0b9c\u0ba4\u0bb6\u0bc7"+
		"\u0bd5\u0bdf\u0bef\u0bfe\u0c08\u0c10\u0c19\u0c20\u0c2a\u0c31\u0c3b\u0c42"+
		"\u0c4d\u0c54\u0c59\u0c5f\u0c66\u0c70\u0c79\u0c80\u0c8a\u0c91\u0c9c\u0ca3"+
		"\u0ca8\u0cb3\u0cbd\u0cc7\u0cd1\u0cdb\u0ce6\u0cf0\u0cfa\u0d00\u0d0a\u0d14"+
		"\u0d1e\u0d29\u0d33\u0d3d\u0d45\u0d4f\u0d5f\u0d68\u0d70\u0d81\u0d8e\u0d97"+
		"\u0da1\u0dac\u0db4\u0dc4\u0dde\u0dea\u0df7\u0e05\u0e13\u0e21\u0e2f\u0e40"+
		"\u0e42\u0e62\u0e64\u0e7e\u0e80\u0e91\u0e93\u0ea9\u0eab\u0ebf\u0ed7\u0edf"+
		"\u0ee5\u0ee7\u0eff\u0f0d\u0f14";
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