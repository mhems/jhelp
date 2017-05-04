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
			setState(458);
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
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				((Type_Context)_localctx).p = primitiveType();
				((Type_Context)_localctx).ret =  ((Type_Context)_localctx).p.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
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
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(468);
					((PrimitiveTypeContext)_localctx).a = annotation();
					_localctx.anns.add(((PrimitiveTypeContext)_localctx).a.ret);
					}
					}
					setState(475);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(476);
				((PrimitiveTypeContext)_localctx).n = numericType();
				((PrimitiveTypeContext)_localctx).ret =  createTypeName(((PrimitiveTypeContext)_localctx).n.ret, _localctx.anns);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(479);
					((PrimitiveTypeContext)_localctx).a = annotation();
					_localctx.anns.add(((PrimitiveTypeContext)_localctx).a.ret);
					}
					}
					setState(486);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(487);
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
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				((NumericTypeContext)_localctx).i = integralType();
				((NumericTypeContext)_localctx).ret =  ((NumericTypeContext)_localctx).i.ret;
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
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
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				((IntegralTypeContext)_localctx).b = match(BYTE);
				((IntegralTypeContext)_localctx).ret =  ((IntegralTypeContext)_localctx).b;
				}
				break;
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				((IntegralTypeContext)_localctx).s = match(SHORT);
				((IntegralTypeContext)_localctx).ret =  ((IntegralTypeContext)_localctx).s;
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(503);
				((IntegralTypeContext)_localctx).i = match(INT);
				((IntegralTypeContext)_localctx).ret =  ((IntegralTypeContext)_localctx).i;
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 4);
				{
				setState(505);
				((IntegralTypeContext)_localctx).l = match(LONG);
				((IntegralTypeContext)_localctx).ret =  ((IntegralTypeContext)_localctx).l;
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(507);
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
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				((FloatingPointTypeContext)_localctx).f = match(FLOAT);
				((FloatingPointTypeContext)_localctx).ret =  ((FloatingPointTypeContext)_localctx).f;
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
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
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				((ReferenceTypeContext)_localctx).c = classOrInterfaceType();
				((ReferenceTypeContext)_localctx).ret =  ((ReferenceTypeContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				((ReferenceTypeContext)_localctx).v = typeVariable();
				((ReferenceTypeContext)_localctx).ret =  ((ReferenceTypeContext)_localctx).v.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(523);
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
			setState(528);
			((ClassOrInterfaceTypeContext)_localctx).co = classType_lfno_classOrInterfaceType();

			            ((ClassOrInterfaceTypeContext)_localctx).ret =  ((ClassOrInterfaceTypeContext)_localctx).co.ret;
			            if (((ClassOrInterfaceTypeContext)_localctx).co.targs != null) {
			                ((ClassOrInterfaceTypeContext)_localctx).ret =  new ParamExpression(_localctx.ret, ((ClassOrInterfaceTypeContext)_localctx).co.targs, ((ClassOrInterfaceTypeContext)_localctx).co.last);
			            }
			        
			setState(536);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(530);
					match(DOT);
					setState(531);
					((ClassOrInterfaceTypeContext)_localctx).c = classType_lfno_classOrInterfaceType();

					                ((ClassOrInterfaceTypeContext)_localctx).ret =  new AccessExpression(_localctx.ret, ((ClassOrInterfaceTypeContext)_localctx).c.ret);
					                if (((ClassOrInterfaceTypeContext)_localctx).c.targs != null) {
					                    ((ClassOrInterfaceTypeContext)_localctx).ret =  new ParamExpression(_localctx.ret, ((ClassOrInterfaceTypeContext)_localctx).c.targs, ((ClassOrInterfaceTypeContext)_localctx).c.last);
					                }
					            
					}
					} 
				}
				setState(538);
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
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(539);
					((ClassTypeContext)_localctx).a = annotation();
					_localctx.anns.add(((ClassTypeContext)_localctx).a.ret);
					}
					}
					setState(546);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(547);
				((ClassTypeContext)_localctx).id = match(Identifier);
				((ClassTypeContext)_localctx).ret =  createPackageOrTypeName(((ClassTypeContext)_localctx).id, _localctx.anns);
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(549);
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
				setState(554);
				((ClassTypeContext)_localctx).st = classOrInterfaceType();
				setState(555);
				match(DOT);
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(556);
					((ClassTypeContext)_localctx).a = annotation();
					_localctx.anns.add(((ClassTypeContext)_localctx).a.ret);
					}
					}
					setState(563);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(564);
				((ClassTypeContext)_localctx).id = match(Identifier);

				            ((ClassTypeContext)_localctx).ret =  new AccessExpression(((ClassTypeContext)_localctx).st.ret,
				                                        createPackageOrTypeName(((ClassTypeContext)_localctx).id, _localctx.anns));
				        
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(566);
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
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(573);
				((ClassType_lfno_classOrInterfaceTypeContext)_localctx).a = annotation();
				_localctx.ans.add(((ClassType_lfno_classOrInterfaceTypeContext)_localctx).a.ret);
				}
				}
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(581);
			((ClassType_lfno_classOrInterfaceTypeContext)_localctx).id = match(Identifier);
			((ClassType_lfno_classOrInterfaceTypeContext)_localctx).ret =  createPackageOrTypeName(((ClassType_lfno_classOrInterfaceTypeContext)_localctx).id, _localctx.ans);
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(583);
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
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(588);
				((TypeVariableContext)_localctx).a = annotation();
				_localctx.ans.add(((TypeVariableContext)_localctx).a.ret);
				}
				}
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(596);
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
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				((ArrayTypeContext)_localctx).p = primitiveType();
				setState(600);
				((ArrayTypeContext)_localctx).d = dims();
				((ArrayTypeContext)_localctx).ret =  new ArrayTypeExpression(((ArrayTypeContext)_localctx).p.ret, ((ArrayTypeContext)_localctx).d.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				((ArrayTypeContext)_localctx).c = classOrInterfaceType();
				setState(604);
				((ArrayTypeContext)_localctx).d = dims();
				((ArrayTypeContext)_localctx).ret =  new ArrayTypeExpression(((ArrayTypeContext)_localctx).c.ret, ((ArrayTypeContext)_localctx).d.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(607);
				((ArrayTypeContext)_localctx).v = typeVariable();
				setState(608);
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
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(613);
				((DimsContext)_localctx).a1 = annotation();
				_localctx.ans.add(((DimsContext)_localctx).a1.ret);
				}
				}
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(621);
			((DimsContext)_localctx).first = match(LBRACK);
			setState(622);
			((DimsContext)_localctx).last = match(RBRACK);
			_localctx.ls.add(new Dimension(((DimsContext)_localctx).first, ((DimsContext)_localctx).last, _localctx.ans));
			setState(638);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					_localctx.ans.clear();
					setState(630);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(625);
						((DimsContext)_localctx).a = annotation();
						_localctx.ans.add(((DimsContext)_localctx).a.ret);
						}
						}
						setState(632);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(633);
					((DimsContext)_localctx).f = match(LBRACK);
					setState(634);
					((DimsContext)_localctx).l = match(RBRACK);
					_localctx.ls.add(new Dimension(((DimsContext)_localctx).f, ((DimsContext)_localctx).l, _localctx.ans));
					}
					} 
				}
				setState(640);
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
			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(643);
				((TypeParameterContext)_localctx).a = typeParameterModifier();
				_localctx.ans.add(((TypeParameterContext)_localctx).a.ret);
				}
				}
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(651);
			((TypeParameterContext)_localctx).id = match(Identifier);
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(652);
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
			setState(659);
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
			setState(679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				match(EXTENDS);
				setState(663);
				((TypeBoundContext)_localctx).v = typeVariable();
				_localctx.ls.add(((TypeBoundContext)_localctx).v.ret); ((TypeBoundContext)_localctx).ret =  _localctx.ls;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				match(EXTENDS);
				setState(667);
				((TypeBoundContext)_localctx).c = classOrInterfaceType();
				_localctx.ls.add(((TypeBoundContext)_localctx).c.ret);
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(669);
					((TypeBoundContext)_localctx).a = additionalBound();
					_localctx.ls.add(((TypeBoundContext)_localctx).a.ret);
					}
					}
					setState(676);
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
			setState(681);
			match(BITAND);
			setState(682);
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
			setState(685);
			match(LT);
			setState(686);
			((TypeArgumentsContext)_localctx).ls = typeArgumentList();
			setState(687);
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
			setState(690);
			((TypeArgumentListContext)_localctx).a1 = typeArgument();
			_localctx.ls.add(((TypeArgumentListContext)_localctx).a1.ret);
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(692);
				match(COMMA);
				setState(693);
				((TypeArgumentListContext)_localctx).a = typeArgument();
				_localctx.ls.add(((TypeArgumentListContext)_localctx).a.ret);
				}
				}
				setState(700);
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
			setState(709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(703);
				((TypeArgumentContext)_localctx).r = referenceType();
				((TypeArgumentContext)_localctx).ret =  new TypeArgument(((TypeArgumentContext)_localctx).r.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(706);
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
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(711);
				((WildcardContext)_localctx).a = annotation();
				_localctx.ans.add(((WildcardContext)_localctx).a.ret);
				}
				}
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(719);
			((WildcardContext)_localctx).w = match(QUESTION);
			((WildcardContext)_localctx).ret =  new TypeArgument(((WildcardContext)_localctx).w, _localctx.ans);
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(721);
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
			setState(732);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(724);
				match(EXTENDS);
				setState(725);
				((WildcardBoundsContext)_localctx).r = referenceType();
				_localctx.ret.setBoundType(((WildcardBoundsContext)_localctx).r.ret); _localctx.ret.setIsUpperBounded(true);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(728);
				match(SUPER);
				setState(729);
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
			setState(741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(734);
				((TypeNameContext)_localctx).id = match(Identifier);
				 ((TypeNameContext)_localctx).ret =  createTypeName(((TypeNameContext)_localctx).id); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(736);
				((TypeNameContext)_localctx).p = packageOrTypeName(0);
				setState(737);
				match(DOT);
				setState(738);
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
			setState(744);
			((PackageOrTypeNameContext)_localctx).id = match(Identifier);
			 ((PackageOrTypeNameContext)_localctx).ret =  createPackageOrTypeName(((PackageOrTypeNameContext)_localctx).id); 
			}
			_ctx.stop = _input.LT(-1);
			setState(753);
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
					setState(747);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(748);
					match(DOT);
					setState(749);
					((PackageOrTypeNameContext)_localctx).id = match(Identifier);
					((PackageOrTypeNameContext)_localctx).ret =  new NameExpression(((PackageOrTypeNameContext)_localctx).p.ret, createTypeName(((PackageOrTypeNameContext)_localctx).id));
					}
					} 
				}
				setState(755);
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
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(756);
				((ExpressionNameContext)_localctx).id = match(Identifier);
				 ((ExpressionNameContext)_localctx).ret =  createExpressionName(((ExpressionNameContext)_localctx).id); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(758);
				((ExpressionNameContext)_localctx).a = ambiguousName(0);
				setState(759);
				match(DOT);
				setState(760);
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
			setState(766);
			((AmbiguousNameContext)_localctx).id = match(Identifier);
			 ((AmbiguousNameContext)_localctx).ret =  createAmbiguousName(((AmbiguousNameContext)_localctx).id); 
			}
			_ctx.stop = _input.LT(-1);
			setState(775);
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
					setState(769);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(770);
					match(DOT);
					setState(771);
					((AmbiguousNameContext)_localctx).id = match(Identifier);
					((AmbiguousNameContext)_localctx).ret =  new NameExpression(((AmbiguousNameContext)_localctx).a.ret, createAmbiguousName(((AmbiguousNameContext)_localctx).id));
					}
					} 
				}
				setState(777);
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
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(778);
				((CompilationUnitContext)_localctx).p = packageDeclaration();
				((CompilationUnitContext)_localctx).stmt =  ((CompilationUnitContext)_localctx).p.ret;
				}
				break;
			}
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(783);
				((CompilationUnitContext)_localctx).i = importDeclaration();
				_localctx.imports.add(((CompilationUnitContext)_localctx).i.ret);
				}
				}
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==AT) {
				{
				{
				setState(791);
				((CompilationUnitContext)_localctx).t = typeDeclaration();
				_localctx.bodies.add(((CompilationUnitContext)_localctx).t.ret);
				}
				}
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(799);
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
			setState(807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(802);
				((PackageDeclarationContext)_localctx).a = packageModifier();
				_localctx.anns.add(((PackageDeclarationContext)_localctx).a.ret);
				}
				}
				setState(809);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(810);
			((PackageDeclarationContext)_localctx).kw = match(PACKAGE);
			{
			setState(811);
			((PackageDeclarationContext)_localctx).id = match(Identifier);
			((PackageDeclarationContext)_localctx).name =  createPackageName(((PackageDeclarationContext)_localctx).id);
			}
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(814);
				match(DOT);
				setState(815);
				((PackageDeclarationContext)_localctx).id = match(Identifier);

				                ((PackageDeclarationContext)_localctx).name =  new NameExpression(_localctx.name,
				                                           createPackageName(((PackageDeclarationContext)_localctx).id));
				            
				}
				}
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(822);
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
			setState(825);
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
			setState(840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(828);
				((ImportDeclarationContext)_localctx).s = singleTypeImportDeclaration();
				((ImportDeclarationContext)_localctx).ret =  ((ImportDeclarationContext)_localctx).s.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				((ImportDeclarationContext)_localctx).t = typeImportOnDemandDeclaration();
				((ImportDeclarationContext)_localctx).ret =  ((ImportDeclarationContext)_localctx).t.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(834);
				((ImportDeclarationContext)_localctx).ss = singleStaticImportDeclaration();
				((ImportDeclarationContext)_localctx).ret =  ((ImportDeclarationContext)_localctx).ss.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(837);
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
			setState(842);
			((SingleTypeImportDeclarationContext)_localctx).kw = match(IMPORT);
			setState(843);
			((SingleTypeImportDeclarationContext)_localctx).t = typeName();
			setState(844);
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
			setState(847);
			((TypeImportOnDemandDeclarationContext)_localctx).kw = match(IMPORT);
			setState(848);
			((TypeImportOnDemandDeclarationContext)_localctx).p = packageOrTypeName(0);
			setState(849);
			match(DOT);
			setState(850);
			match(MUL);
			setState(851);
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
			setState(854);
			((SingleStaticImportDeclarationContext)_localctx).kw = match(IMPORT);
			setState(855);
			match(STATIC);
			setState(856);
			((SingleStaticImportDeclarationContext)_localctx).t = typeName();
			setState(857);
			match(DOT);
			setState(858);
			((SingleStaticImportDeclarationContext)_localctx).id = match(Identifier);
			setState(859);
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
			setState(862);
			((StaticImportOnDemandDeclarationContext)_localctx).kw = match(IMPORT);
			setState(863);
			match(STATIC);
			setState(864);
			((StaticImportOnDemandDeclarationContext)_localctx).t = typeName();
			setState(865);
			match(DOT);
			setState(866);
			match(MUL);
			setState(867);
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
			setState(877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(870);
				((TypeDeclarationContext)_localctx).c = classDeclaration();
				((TypeDeclarationContext)_localctx).ret =  ((TypeDeclarationContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(873);
				((TypeDeclarationContext)_localctx).i = interfaceDeclaration();
				((TypeDeclarationContext)_localctx).ret =  ((TypeDeclarationContext)_localctx).i.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(876);
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
			setState(885);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(879);
				((ClassDeclarationContext)_localctx).n = normalClassDeclaration();
				((ClassDeclarationContext)_localctx).ret =  ((ClassDeclarationContext)_localctx).n.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(882);
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
			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				setState(893);
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
					setState(887);
					((NormalClassDeclarationContext)_localctx).m = classModifier();
					_localctx.mods.add(((NormalClassDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(890);
					((NormalClassDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((NormalClassDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			checkModifiers(_localctx.mods);
			setState(899);
			((NormalClassDeclarationContext)_localctx).kw = match(CLASS);
			setState(900);
			((NormalClassDeclarationContext)_localctx).n = match(Identifier);
			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(901);
				((NormalClassDeclarationContext)_localctx).p = typeParameters();
				((NormalClassDeclarationContext)_localctx).tpars =  ((NormalClassDeclarationContext)_localctx).p.ret;
				}
			}

			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(906);
				((NormalClassDeclarationContext)_localctx).sc = superclass();
				((NormalClassDeclarationContext)_localctx).scls =  ((NormalClassDeclarationContext)_localctx).sc.ret;
				}
			}

			setState(914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(911);
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
			setState(917);
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
			setState(933);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(919);
				((ClassModifierContext)_localctx).pu = match(PUBLIC);
				((ClassModifierContext)_localctx).ret =  new Modifier(((ClassModifierContext)_localctx).pu);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(921);
				((ClassModifierContext)_localctx).pro = match(PROTECTED);
				((ClassModifierContext)_localctx).ret =  new Modifier(((ClassModifierContext)_localctx).pro);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(923);
				((ClassModifierContext)_localctx).pri = match(PRIVATE);
				((ClassModifierContext)_localctx).ret =  new Modifier(((ClassModifierContext)_localctx).pri);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 4);
				{
				setState(925);
				((ClassModifierContext)_localctx).ab = match(ABSTRACT);
				((ClassModifierContext)_localctx).ret =  new Modifier(((ClassModifierContext)_localctx).ab);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(927);
				((ClassModifierContext)_localctx).st = match(STATIC);
				((ClassModifierContext)_localctx).ret =  new Modifier(((ClassModifierContext)_localctx).st);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(929);
				((ClassModifierContext)_localctx).f = match(FINAL);
				((ClassModifierContext)_localctx).ret =  new Modifier(((ClassModifierContext)_localctx).f);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
				setState(931);
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
			setState(935);
			match(LT);
			setState(936);
			((TypeParametersContext)_localctx).t = typeParameterList();
			setState(937);
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
			setState(940);
			((TypeParameterListContext)_localctx).t1 = typeParameter();
			_localctx.ls.add(((TypeParameterListContext)_localctx).t1.ret);
			}
			setState(949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(943);
				match(COMMA);
				setState(944);
				((TypeParameterListContext)_localctx).t = typeParameter();
				_localctx.ls.add(((TypeParameterListContext)_localctx).t.ret);
				}
				}
				setState(951);
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
			setState(954);
			match(EXTENDS);
			setState(955);
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
			setState(958);
			match(IMPLEMENTS);
			setState(959);
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
			setState(962);
			((InterfaceTypeListContext)_localctx).i1 = classType();
			_localctx.ls.add(((InterfaceTypeListContext)_localctx).i1.ret);
			}
			setState(971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(965);
				match(COMMA);
				setState(966);
				((InterfaceTypeListContext)_localctx).i = classType();
				_localctx.ls.add(((InterfaceTypeListContext)_localctx).i.ret);
				}
				}
				setState(973);
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
			setState(976);
			((ClassBodyContext)_localctx).first = match(LBRACE);
			setState(980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(977);
				classBodyDeclaration(_localctx.ret);
				}
				}
				setState(982);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(983);
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
			setState(996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(986);
				classMemberDeclaration(_localctx.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(987);
				((ClassBodyDeclarationContext)_localctx).i = instanceInitializer();
				_localctx.ret.addInstanceInitializer(((ClassBodyDeclarationContext)_localctx).i.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(990);
				((ClassBodyDeclarationContext)_localctx).s = staticInitializer();
				_localctx.ret.addStaticInitializer(((ClassBodyDeclarationContext)_localctx).s.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(993);
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
			setState(1009);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(998);
				((ClassMemberDeclarationContext)_localctx).f = fieldDeclaration(ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(999);
				((ClassMemberDeclarationContext)_localctx).m = methodDeclaration();
				_localctx.ret.addMethod(((ClassMemberDeclarationContext)_localctx).m.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1002);
				((ClassMemberDeclarationContext)_localctx).c = classDeclaration();
				_localctx.ret.addInnerBody(((ClassMemberDeclarationContext)_localctx).c.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1005);
				((ClassMemberDeclarationContext)_localctx).i = interfaceDeclaration();
				_localctx.ret.addInnerBody(((ClassMemberDeclarationContext)_localctx).i.ret);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1008);
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
			setState(1019);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				setState(1017);
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
					setState(1011);
					((FieldDeclarationContext)_localctx).m = fieldModifier();
					_localctx.mods.add(((FieldDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1014);
					((FieldDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((FieldDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			checkModifiers(_localctx.mods);
			setState(1023);
			((FieldDeclarationContext)_localctx).t = unannType();
			setState(1024);
			variableDeclaratorList(_localctx.decl, _localctx.mods, _localctx.ans, ((FieldDeclarationContext)_localctx).t.ret);
			setState(1025);
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
			setState(1041);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1027);
				((FieldModifierContext)_localctx).pu = match(PUBLIC);
				((FieldModifierContext)_localctx).ret =  new Modifier(((FieldModifierContext)_localctx).pu);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1029);
				((FieldModifierContext)_localctx).pro = match(PROTECTED);
				((FieldModifierContext)_localctx).ret =  new Modifier(((FieldModifierContext)_localctx).pro);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1031);
				((FieldModifierContext)_localctx).pri = match(PRIVATE);
				((FieldModifierContext)_localctx).ret =  new Modifier(((FieldModifierContext)_localctx).pri);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 4);
				{
				setState(1033);
				((FieldModifierContext)_localctx).st = match(STATIC);
				((FieldModifierContext)_localctx).ret =  new Modifier(((FieldModifierContext)_localctx).st);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1035);
				((FieldModifierContext)_localctx).f = match(FINAL);
				((FieldModifierContext)_localctx).ret =  new Modifier(((FieldModifierContext)_localctx).f);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1037);
				((FieldModifierContext)_localctx).t = match(TRANSIENT);
				((FieldModifierContext)_localctx).ret =  new Modifier(((FieldModifierContext)_localctx).t);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1039);
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
			setState(1043);
			((VariableDeclaratorListContext)_localctx).d1 = variableDeclarator(_localctx.decl, _localctx.mods, _localctx.ans, _localctx.t);
			_localctx.ls.add(((VariableDeclaratorListContext)_localctx).d1.ret);
			}
			setState(1052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1046);
				match(COMMA);
				setState(1047);
				((VariableDeclaratorListContext)_localctx).d = variableDeclarator(_localctx.decl, _localctx.mods, _localctx.ans, _localctx.t);
				_localctx.ls.add(((VariableDeclaratorListContext)_localctx).d.ret);
				}
				}
				setState(1054);
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
			setState(1057);
			((VariableDeclaratorContext)_localctx).id = variableDeclaratorId();

			            ((VariableDeclaratorContext)_localctx).type =  _localctx.t;
			            if (((VariableDeclaratorContext)_localctx).id.d.size() > 0) {
			                ((VariableDeclaratorContext)_localctx).type =  new ArrayTypeExpression(_localctx.t, ((VariableDeclaratorContext)_localctx).id.d);
			            }
			            ((VariableDeclaratorContext)_localctx).var =  new VariableDeclaration(((VariableDeclaratorContext)_localctx).id.ret, _localctx.type, _localctx.mods, _localctx.ans);
			            if (_localctx.decl != null) {
			                _localctx.decl.addField(_localctx.var);
			            }
			        
			setState(1063);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1059);
				match(ASSIGN);
				setState(1060);
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
			setState(1068);
			((VariableDeclaratorIdContext)_localctx).id = match(Identifier);
			setState(1072);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1069);
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
			setState(1076);
			((TypedVariableDeclaratorIdContext)_localctx).t = unannType();
			setState(1077);
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
			setState(1086);
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
				setState(1080);
				((VariableInitializerContext)_localctx).ex = expression();
				((VariableInitializerContext)_localctx).ret =  ((VariableInitializerContext)_localctx).ex.ret;
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1083);
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
			setState(1094);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1088);
				((UnannTypeContext)_localctx).p = unannPrimitiveType();
				((UnannTypeContext)_localctx).ret =  ((UnannTypeContext)_localctx).p.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1091);
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
			setState(1101);
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
				setState(1096);
				((UnannPrimitiveTypeContext)_localctx).n = numericType();
				((UnannPrimitiveTypeContext)_localctx).ret =  createTypeName(((UnannPrimitiveTypeContext)_localctx).n.ret);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1099);
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
			setState(1112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1103);
				((UnannReferenceTypeContext)_localctx).c = unannClassOrInterfaceType();
				((UnannReferenceTypeContext)_localctx).ret =  ((UnannReferenceTypeContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1106);
				((UnannReferenceTypeContext)_localctx).v = unannTypeVariable();
				((UnannReferenceTypeContext)_localctx).ret =  ((UnannReferenceTypeContext)_localctx).v.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1109);
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
			setState(1114);
			((UnannClassOrInterfaceTypeContext)_localctx).cno = unannClassType_lfno_unannClassOrInterfaceType();
			((UnannClassOrInterfaceTypeContext)_localctx).ret =  ((UnannClassOrInterfaceTypeContext)_localctx).cno.ret;
			}
			setState(1123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1117);
					match(DOT);
					setState(1118);
					((UnannClassOrInterfaceTypeContext)_localctx).c = classType_lfno_classOrInterfaceType();

					                ((UnannClassOrInterfaceTypeContext)_localctx).ret =  new AccessExpression(_localctx.ret, ((UnannClassOrInterfaceTypeContext)_localctx).c.ret);
					                if (((UnannClassOrInterfaceTypeContext)_localctx).c.targs != null) {
					                    ((UnannClassOrInterfaceTypeContext)_localctx).ret =  new ParamExpression(_localctx.ret, ((UnannClassOrInterfaceTypeContext)_localctx).c.targs, ((UnannClassOrInterfaceTypeContext)_localctx).c.last);
					                }
					            
					}
					} 
				}
				setState(1125);
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
			setState(1134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1126);
				((UnannClassTypeContext)_localctx).u = unannClassType_lfno_unannClassOrInterfaceType();
				((UnannClassTypeContext)_localctx).ret =  ((UnannClassTypeContext)_localctx).u.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1129);
				((UnannClassTypeContext)_localctx).a = unannClassOrInterfaceType();
				setState(1130);
				match(DOT);
				setState(1131);
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
			setState(1136);
			((UnannClassType_lfno_unannClassOrInterfaceTypeContext)_localctx).id = match(Identifier);
			((UnannClassType_lfno_unannClassOrInterfaceTypeContext)_localctx).ret =  createPackageOrTypeName(((UnannClassType_lfno_unannClassOrInterfaceTypeContext)_localctx).id);
			setState(1141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1138);
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
			setState(1143);
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
			setState(1158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1146);
				((UnannArrayTypeContext)_localctx).p = unannPrimitiveType();
				setState(1147);
				((UnannArrayTypeContext)_localctx).d = dims();
				((UnannArrayTypeContext)_localctx).ret =  new ArrayTypeExpression(((UnannArrayTypeContext)_localctx).p.ret, ((UnannArrayTypeContext)_localctx).d.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1150);
				((UnannArrayTypeContext)_localctx).c = unannClassOrInterfaceType();
				setState(1151);
				((UnannArrayTypeContext)_localctx).d = dims();
				((UnannArrayTypeContext)_localctx).ret =  new ArrayTypeExpression(((UnannArrayTypeContext)_localctx).c.ret, ((UnannArrayTypeContext)_localctx).d.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1154);
				((UnannArrayTypeContext)_localctx).v = unannTypeVariable();
				setState(1155);
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
			setState(1168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED))) != 0) || _la==AT) {
				{
				setState(1166);
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
					setState(1160);
					((MethodDeclarationContext)_localctx).m = methodModifier();
					_localctx.mods.add(((MethodDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1163);
					((MethodDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((MethodDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			checkModifiers(_localctx.mods);
			((MethodDeclarationContext)_localctx).ret =  new MethodDeclaration(_localctx.mods, _localctx.ans);
			setState(1173);
			methodHeader(_localctx.ret);
			setState(1174);
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
			setState(1195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1177);
				((MethodModifierContext)_localctx).pu = match(PUBLIC);
				((MethodModifierContext)_localctx).ret =  new Modifier(((MethodModifierContext)_localctx).pu);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1179);
				((MethodModifierContext)_localctx).pro = match(PROTECTED);
				((MethodModifierContext)_localctx).ret =  new Modifier(((MethodModifierContext)_localctx).pro);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1181);
				((MethodModifierContext)_localctx).pri = match(PRIVATE);
				((MethodModifierContext)_localctx).ret =  new Modifier(((MethodModifierContext)_localctx).pri);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1183);
				((MethodModifierContext)_localctx).ab = match(ABSTRACT);
				((MethodModifierContext)_localctx).ret =  new Modifier(((MethodModifierContext)_localctx).ab);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1185);
				((MethodModifierContext)_localctx).st = match(STATIC);
				((MethodModifierContext)_localctx).ret =  new Modifier(((MethodModifierContext)_localctx).st);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1187);
				((MethodModifierContext)_localctx).f = match(FINAL);
				((MethodModifierContext)_localctx).ret =  new Modifier(((MethodModifierContext)_localctx).f);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 7);
				{
				setState(1189);
				((MethodModifierContext)_localctx).s = match(SYNCHRONIZED);
				((MethodModifierContext)_localctx).ret =  new Modifier(((MethodModifierContext)_localctx).s);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1191);
				((MethodModifierContext)_localctx).n = match(NATIVE);
				((MethodModifierContext)_localctx).ret =  new Modifier(((MethodModifierContext)_localctx).n);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 9);
				{
				setState(1193);
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
			setState(1224);
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
				setState(1197);
				((MethodHeaderContext)_localctx).rt = result();
				_localctx.ret.setReturnType(((MethodHeaderContext)_localctx).rt.ret);
				setState(1199);
				methodDeclarator(_localctx.ret);
				setState(1203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1200);
					((MethodHeaderContext)_localctx).th = throws_();
					_localctx.ret.setExceptions(((MethodHeaderContext)_localctx).th.ret);
					}
				}

				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1205);
				((MethodHeaderContext)_localctx).tp = typeParameters();
				_localctx.ret.setTypeParameters(((MethodHeaderContext)_localctx).tp.ret);
				setState(1212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1207);
					((MethodHeaderContext)_localctx).a = annotation();
					_localctx.ans.add(((MethodHeaderContext)_localctx).a.ret);
					}
					}
					setState(1214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

				            if (_localctx.ans.size() > 0) {
				                _localctx.ret.setReturnTypeAnnotations(_localctx.ans);
				            }
				        
				setState(1216);
				((MethodHeaderContext)_localctx).rt = result();
				_localctx.ret.setReturnType(((MethodHeaderContext)_localctx).rt.ret);
				setState(1218);
				methodDeclarator(_localctx.ret);
				setState(1222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1219);
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
			setState(1231);
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
				setState(1226);
				((ResultContext)_localctx).u = unannType();
				((ResultContext)_localctx).ret =  ((ResultContext)_localctx).u.ret;
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1229);
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
			setState(1233);
			((MethodDeclaratorContext)_localctx).n = match(Identifier);
			_localctx.ret.setName(((MethodDeclaratorContext)_localctx).n);
			setState(1235);
			match(LPAREN);
			setState(1239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1236);
				((MethodDeclaratorContext)_localctx).p = formalParameterList();
				_localctx.ret.setParameters(((MethodDeclaratorContext)_localctx).p.ret);
				}
			}

			setState(1241);
			match(RPAREN);
			setState(1245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1242);
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
			setState(1261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1247);
				((FormalParameterListContext)_localctx).p = formalParameters();
				_localctx.ls.addAll(((FormalParameterListContext)_localctx).p.ret);
				}
				setState(1250);
				match(COMMA);
				{
				setState(1251);
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
				setState(1256);
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
			setState(1291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1263);
				((FormalParametersContext)_localctx).p = formalParameter();
				_localctx.ls.add(((FormalParametersContext)_localctx).p.ret);
				}
				setState(1272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1266);
						match(COMMA);
						setState(1267);
						((FormalParametersContext)_localctx).f = formalParameter();
						_localctx.ls.add(((FormalParametersContext)_localctx).f.ret);
						}
						} 
					}
					setState(1274);
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
				setState(1277);
				((FormalParametersContext)_localctx).r = receiverParameter();
				_localctx.ls.add(((FormalParametersContext)_localctx).r.ret);
				}
				setState(1286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1280);
						match(COMMA);
						setState(1281);
						((FormalParametersContext)_localctx).f = formalParameter();
						_localctx.ls.add(((FormalParametersContext)_localctx).f.ret);
						}
						} 
					}
					setState(1288);
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
			setState(1301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				setState(1299);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FINAL:
					{
					{
					setState(1293);
					((FormalParameterContext)_localctx).m = variableModifier();
					_localctx.mods.add(((FormalParameterContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1296);
					((FormalParameterContext)_localctx).a = annotation();
					_localctx.ans.add(((FormalParameterContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			checkModifiers(_localctx.mods);
			setState(1305);
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
			setState(1308);
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
			setState(1338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
					setState(1317);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FINAL:
						{
						{
						setState(1311);
						((LastFormalParameterContext)_localctx).m = variableModifier();
						_localctx.mods.add(((LastFormalParameterContext)_localctx).m.ret);
						}
						}
						break;
					case AT:
						{
						{
						setState(1314);
						((LastFormalParameterContext)_localctx).a = annotation();
						_localctx.ans.add(((LastFormalParameterContext)_localctx).a.ret);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1322);
				((LastFormalParameterContext)_localctx).t = unannType();
				setState(1328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1323);
					((LastFormalParameterContext)_localctx).a = annotation();
					_localctx.ans2.add(((LastFormalParameterContext)_localctx).a.ret);
					}
					}
					setState(1330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1331);
				((LastFormalParameterContext)_localctx).e = match(ELLIPSIS);
				setState(1332);
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
				setState(1335);
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
			setState(1345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1340);
				((ReceiverParameterContext)_localctx).a = annotation();
				_localctx.ans.add(((ReceiverParameterContext)_localctx).a.ret);
				}
				}
				setState(1347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1348);
			((ReceiverParameterContext)_localctx).t = unannType();
			setState(1349);
			((ReceiverParameterContext)_localctx).id = match(Identifier);
			setState(1350);
			match(DOT);
			setState(1351);
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
			setState(1354);
			match(THROWS);
			setState(1355);
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
			setState(1358);
			((ExceptionTypeListContext)_localctx).e = exceptionType();
			_localctx.ls.add(((ExceptionTypeListContext)_localctx).e.ret);
			}
			setState(1367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1361);
				match(COMMA);
				setState(1362);
				((ExceptionTypeListContext)_localctx).e = exceptionType();
				_localctx.ls.add(((ExceptionTypeListContext)_localctx).e.ret);
				}
				}
				setState(1369);
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
			setState(1378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1372);
				((ExceptionTypeContext)_localctx).c = classType();
				((ExceptionTypeContext)_localctx).ret =  ((ExceptionTypeContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1375);
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
			setState(1385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1380);
				((MethodBodyContext)_localctx).body = block();
				((MethodBodyContext)_localctx).ret =  ((MethodBodyContext)_localctx).body.ret;
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1383);
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
			setState(1387);
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
			setState(1390);
			((StaticInitializerContext)_localctx).kw = match(STATIC);
			setState(1391);
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
			setState(1402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0) || _la==AT) {
				{
				setState(1400);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRIVATE:
				case PROTECTED:
				case PUBLIC:
					{
					{
					setState(1394);
					((ConstructorDeclarationContext)_localctx).m = constructorModifier();
					_localctx.mods.add(((ConstructorDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1397);
					((ConstructorDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((ConstructorDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			checkModifiers(_localctx.mods);
			((ConstructorDeclarationContext)_localctx).ret =  new MethodDeclaration(_localctx.mods, _localctx.ans);
			         _localctx.ret.setConstructor(true);
			setState(1407);
			constructorDeclarator(_localctx.ret);
			setState(1411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1408);
				((ConstructorDeclarationContext)_localctx).t = throws_();
				_localctx.ret.setExceptions(((ConstructorDeclarationContext)_localctx).t.ret);
				}
			}

			setState(1413);
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
			setState(1422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1416);
				((ConstructorModifierContext)_localctx).pu = match(PUBLIC);
				((ConstructorModifierContext)_localctx).ret =  new Modifier(((ConstructorModifierContext)_localctx).pu);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1418);
				((ConstructorModifierContext)_localctx).pro = match(PROTECTED);
				((ConstructorModifierContext)_localctx).ret =  new Modifier(((ConstructorModifierContext)_localctx).pro);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1420);
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
			setState(1427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1424);
				((ConstructorDeclaratorContext)_localctx).t = typeParameters();
				_localctx.ret.setTypeParameters(((ConstructorDeclaratorContext)_localctx).t.ret);
				}
			}

			setState(1429);
			((ConstructorDeclaratorContext)_localctx).n = match(Identifier);
			_localctx.ret.setName(((ConstructorDeclaratorContext)_localctx).n);
			setState(1431);
			match(LPAREN);
			setState(1435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1432);
				((ConstructorDeclaratorContext)_localctx).l = formalParameterList();
				_localctx.ret.setParameters(((ConstructorDeclaratorContext)_localctx).l.ret);
				}
			}

			setState(1437);
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
			setState(1440);
			((ConstructorBodyContext)_localctx).first = match(LBRACE);
			setState(1444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(1441);
				((ConstructorBodyContext)_localctx).s = explicitConstructorInvocation();
				_localctx.ret.addStatement(((ConstructorBodyContext)_localctx).s.ret);
				}
				break;
			}
			setState(1449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1446);
				((ConstructorBodyContext)_localctx).st = blockStatements();
				_localctx.ret.addStatements(((ConstructorBodyContext)_localctx).st.ret);
				}
			}

			setState(1451);
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
			setState(1520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1454);
					((ExplicitConstructorInvocationContext)_localctx).t = typeArguments();
					((ExplicitConstructorInvocationContext)_localctx).targs =  ((ExplicitConstructorInvocationContext)_localctx).t.ret;
					}
				}

				setState(1459);
				((ExplicitConstructorInvocationContext)_localctx).kw = match(THIS);
				setState(1460);
				match(LPAREN);
				setState(1464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1461);
					((ExplicitConstructorInvocationContext)_localctx).a = argumentList();
					((ExplicitConstructorInvocationContext)_localctx).args =  ((ExplicitConstructorInvocationContext)_localctx).a.ret;
					}
				}

				setState(1466);
				match(RPAREN);
				setState(1467);
				((ExplicitConstructorInvocationContext)_localctx).last = match(SEMI);
				((ExplicitConstructorInvocationContext)_localctx).ret =  new CallExpression(((ExplicitConstructorInvocationContext)_localctx).last, createTypeName(((ExplicitConstructorInvocationContext)_localctx).kw), ((ExplicitConstructorInvocationContext)_localctx).kw,
				                                   _localctx.args, _localctx.targs);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1469);
					((ExplicitConstructorInvocationContext)_localctx).t = typeArguments();
					((ExplicitConstructorInvocationContext)_localctx).targs =  ((ExplicitConstructorInvocationContext)_localctx).t.ret;
					}
				}

				setState(1474);
				((ExplicitConstructorInvocationContext)_localctx).kw = match(SUPER);
				setState(1475);
				match(LPAREN);
				setState(1479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1476);
					((ExplicitConstructorInvocationContext)_localctx).a = argumentList();
					((ExplicitConstructorInvocationContext)_localctx).args =  ((ExplicitConstructorInvocationContext)_localctx).a.ret;
					}
				}

				setState(1481);
				match(RPAREN);
				setState(1482);
				((ExplicitConstructorInvocationContext)_localctx).last = match(SEMI);
				((ExplicitConstructorInvocationContext)_localctx).ret =  new CallExpression(((ExplicitConstructorInvocationContext)_localctx).last, createTypeName(((ExplicitConstructorInvocationContext)_localctx).kw), ((ExplicitConstructorInvocationContext)_localctx).kw,
				                                   _localctx.args, _localctx.targs);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1484);
				((ExplicitConstructorInvocationContext)_localctx).en = expressionName();
				setState(1485);
				match(DOT);
				setState(1489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1486);
					((ExplicitConstructorInvocationContext)_localctx).t = typeArguments();
					((ExplicitConstructorInvocationContext)_localctx).targs =  ((ExplicitConstructorInvocationContext)_localctx).t.ret;
					}
				}

				setState(1491);
				((ExplicitConstructorInvocationContext)_localctx).kw = match(SUPER);
				setState(1492);
				match(LPAREN);
				setState(1496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1493);
					((ExplicitConstructorInvocationContext)_localctx).a = argumentList();
					((ExplicitConstructorInvocationContext)_localctx).args =  ((ExplicitConstructorInvocationContext)_localctx).a.ret;
					}
				}

				setState(1498);
				match(RPAREN);
				setState(1499);
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
				setState(1502);
				((ExplicitConstructorInvocationContext)_localctx).p = primary();
				setState(1503);
				match(DOT);
				setState(1507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1504);
					((ExplicitConstructorInvocationContext)_localctx).t = typeArguments();
					((ExplicitConstructorInvocationContext)_localctx).targs =  ((ExplicitConstructorInvocationContext)_localctx).t.ret;
					}
				}

				setState(1509);
				((ExplicitConstructorInvocationContext)_localctx).kw = match(SUPER);
				setState(1510);
				match(LPAREN);
				setState(1514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1511);
					((ExplicitConstructorInvocationContext)_localctx).a = argumentList();
					((ExplicitConstructorInvocationContext)_localctx).args =  ((ExplicitConstructorInvocationContext)_localctx).a.ret;
					}
				}

				setState(1516);
				match(RPAREN);
				setState(1517);
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
			setState(1530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				setState(1528);
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
					setState(1522);
					((EnumDeclarationContext)_localctx).m = classModifier();
					_localctx.mods.add(((EnumDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1525);
					((EnumDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((EnumDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1532);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1533);
			((EnumDeclarationContext)_localctx).kw = match(ENUM);
			setState(1534);
			((EnumDeclarationContext)_localctx).id = match(Identifier);
			setState(1538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1535);
				((EnumDeclarationContext)_localctx).il = superinterfaces();
				((EnumDeclarationContext)_localctx).sis =  ((EnumDeclarationContext)_localctx).il.ret;
				}
			}

			((EnumDeclarationContext)_localctx).ret =  new EnumDeclaration(((EnumDeclarationContext)_localctx).id, ((EnumDeclarationContext)_localctx).kw, _localctx.mods, _localctx.ans, _localctx.sis);
			setState(1541);
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
			setState(1543);
			match(LBRACE);
			setState(1545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(1544);
				enumConstantList(_localctx.ret);
				}
			}

			setState(1548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1547);
				match(COMMA);
				}
			}

			setState(1551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1550);
				enumBodyDeclarations(_localctx.ret);
				}
			}

			setState(1553);
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
			setState(1556);
			enumConstant(_localctx.ret);
			setState(1561);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1557);
					match(COMMA);
					setState(1558);
					enumConstant(_localctx.ret);
					}
					} 
				}
				setState(1563);
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
			setState(1569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1564);
				((EnumConstantContext)_localctx).an = annotation();
				_localctx.ans.add(((EnumConstantContext)_localctx).an.ret);
				}
				}
				setState(1571);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1572);
			((EnumConstantContext)_localctx).id = match(Identifier);
			setState(1580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1573);
				match(LPAREN);
				setState(1577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(1574);
					((EnumConstantContext)_localctx).a = argumentList();
					((EnumConstantContext)_localctx).args =  ((EnumConstantContext)_localctx).a.ret;
					}
				}

				setState(1579);
				match(RPAREN);
				}
			}


			            ((EnumConstantContext)_localctx).cons =  new EnumConstant(((EnumConstantContext)_localctx).id, _localctx.ans, _localctx.args);
			            ((EnumConstantContext)_localctx).body =  _localctx.cons.getBody();
			            _localctx.ret.addConstant(_localctx.cons);
			        
			setState(1584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1583);
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
			setState(1586);
			match(SEMI);
			setState(1590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(1587);
				classBodyDeclaration(_localctx.ret);
				}
				}
				setState(1592);
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
			setState(1599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1593);
				((InterfaceDeclarationContext)_localctx).n = normalInterfaceDeclaration();
				((InterfaceDeclarationContext)_localctx).ret =  ((InterfaceDeclarationContext)_localctx).n.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1596);
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
			setState(1609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				setState(1607);
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
					setState(1601);
					((NormalInterfaceDeclarationContext)_localctx).m = interfaceModifier();
					_localctx.mods.add(((NormalInterfaceDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1604);
					((NormalInterfaceDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((NormalInterfaceDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1611);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			checkModifiers(_localctx.mods);
			setState(1613);
			((NormalInterfaceDeclarationContext)_localctx).kw = match(INTERFACE);
			setState(1614);
			((NormalInterfaceDeclarationContext)_localctx).id = match(Identifier);
			setState(1618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1615);
				((NormalInterfaceDeclarationContext)_localctx).t = typeParameters();
				((NormalInterfaceDeclarationContext)_localctx).tpars =  ((NormalInterfaceDeclarationContext)_localctx).t.ret;
				}
			}

			setState(1623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1620);
				((NormalInterfaceDeclarationContext)_localctx).e = extendsInterfaces();
				((NormalInterfaceDeclarationContext)_localctx).eis =  ((NormalInterfaceDeclarationContext)_localctx).e.ret;
				}
			}

			((NormalInterfaceDeclarationContext)_localctx).ret =  new InterfaceDeclaration(((NormalInterfaceDeclarationContext)_localctx).id, ((NormalInterfaceDeclarationContext)_localctx).kw, _localctx.mods, _localctx.ans, _localctx.eis, _localctx.tpars);
			setState(1626);
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
			setState(1640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1628);
				((InterfaceModifierContext)_localctx).pu = match(PUBLIC);
				((InterfaceModifierContext)_localctx).ret =  new Modifier(((InterfaceModifierContext)_localctx).pu);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1630);
				((InterfaceModifierContext)_localctx).pro = match(PROTECTED);
				((InterfaceModifierContext)_localctx).ret =  new Modifier(((InterfaceModifierContext)_localctx).pro);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1632);
				((InterfaceModifierContext)_localctx).pri = match(PRIVATE);
				((InterfaceModifierContext)_localctx).ret =  new Modifier(((InterfaceModifierContext)_localctx).pri);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1634);
				((InterfaceModifierContext)_localctx).ab = match(ABSTRACT);
				((InterfaceModifierContext)_localctx).ret =  new Modifier(((InterfaceModifierContext)_localctx).ab);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1636);
				((InterfaceModifierContext)_localctx).st = match(STATIC);
				((InterfaceModifierContext)_localctx).ret =  new Modifier(((InterfaceModifierContext)_localctx).st);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(1638);
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
			setState(1642);
			match(EXTENDS);
			setState(1643);
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
			setState(1646);
			match(LBRACE);
			setState(1650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(1647);
				interfaceMemberDeclaration(_localctx.ret);
				}
				}
				setState(1652);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1653);
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
			setState(1667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1656);
				constantDeclaration(_localctx.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1657);
				((InterfaceMemberDeclarationContext)_localctx).im = interfaceMethodDeclaration();
				_localctx.ret.addMethod(((InterfaceMemberDeclarationContext)_localctx).im.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1660);
				((InterfaceMemberDeclarationContext)_localctx).cl = classDeclaration();
				_localctx.ret.addInnerBody(((InterfaceMemberDeclarationContext)_localctx).cl.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1663);
				((InterfaceMemberDeclarationContext)_localctx).id = interfaceDeclaration();
				_localctx.ret.addInnerBody(((InterfaceMemberDeclarationContext)_localctx).id.ret);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1666);
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
			setState(1677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << STATIC))) != 0) || _la==AT) {
				{
				setState(1675);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FINAL:
				case PUBLIC:
				case STATIC:
					{
					{
					setState(1669);
					((ConstantDeclarationContext)_localctx).m = constantModifier();
					_localctx.mods.add(((ConstantDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1672);
					((ConstantDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((ConstantDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1679);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			checkModifiers(_localctx.mods);
			setState(1681);
			((ConstantDeclarationContext)_localctx).t = unannType();
			setState(1682);
			variableDeclaratorList(_localctx.decl, _localctx.mods, _localctx.ans, ((ConstantDeclarationContext)_localctx).t.ret);
			setState(1683);
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
			setState(1691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1685);
				((ConstantModifierContext)_localctx).pu = match(PUBLIC);
				((ConstantModifierContext)_localctx).ret =  new Modifier(((ConstantModifierContext)_localctx).pu);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1687);
				((ConstantModifierContext)_localctx).st = match(STATIC);
				((ConstantModifierContext)_localctx).ret =  new Modifier(((ConstantModifierContext)_localctx).st);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1689);
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
			setState(1701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				setState(1699);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ABSTRACT:
				case DEFAULT:
				case PUBLIC:
				case STATIC:
				case STRICTFP:
					{
					{
					setState(1693);
					((InterfaceMethodDeclarationContext)_localctx).m = interfaceMethodModifier();
					_localctx.mods.add(((InterfaceMethodDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1696);
					((InterfaceMethodDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((InterfaceMethodDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1703);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			checkModifiers(_localctx.mods);
			((InterfaceMethodDeclarationContext)_localctx).ret =  new MethodDeclaration(_localctx.mods, _localctx.ans);
			{
			setState(1706);
			methodHeader(_localctx.ret);
			}
			{
			setState(1707);
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
			setState(1720);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1710);
				((InterfaceMethodModifierContext)_localctx).pu = match(PUBLIC);
				((InterfaceMethodModifierContext)_localctx).ret =  new Modifier(((InterfaceMethodModifierContext)_localctx).pu);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1712);
				((InterfaceMethodModifierContext)_localctx).ab = match(ABSTRACT);
				((InterfaceMethodModifierContext)_localctx).ret =  new Modifier(((InterfaceMethodModifierContext)_localctx).ab);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1714);
				((InterfaceMethodModifierContext)_localctx).d = match(DEFAULT);
				((InterfaceMethodModifierContext)_localctx).ret =  new Modifier(((InterfaceMethodModifierContext)_localctx).d);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 4);
				{
				setState(1716);
				((InterfaceMethodModifierContext)_localctx).st = match(STATIC);
				((InterfaceMethodModifierContext)_localctx).ret =  new Modifier(((InterfaceMethodModifierContext)_localctx).st);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 5);
				{
				setState(1718);
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
			setState(1730);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1728);
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
						setState(1722);
						((AnnotationTypeDeclarationContext)_localctx).m = interfaceModifier();
						_localctx.mods.add(((AnnotationTypeDeclarationContext)_localctx).m.ret);
						}
						}
						break;
					case AT:
						{
						{
						setState(1725);
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
				setState(1732);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			setState(1733);
			((AnnotationTypeDeclarationContext)_localctx).at = match(AT);
			setState(1734);
			match(INTERFACE);
			setState(1735);
			((AnnotationTypeDeclarationContext)_localctx).id = match(Identifier);
			((AnnotationTypeDeclarationContext)_localctx).ret =  new AnnotationDeclaration(((AnnotationTypeDeclarationContext)_localctx).id, ((AnnotationTypeDeclarationContext)_localctx).at, _localctx.mods, _localctx.ans);
			setState(1737);
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
			setState(1739);
			match(LBRACE);
			setState(1743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==Identifier || _la==AT) {
				{
				{
				setState(1740);
				annotationTypeMemberDeclaration(_localctx.ret);
				}
				}
				setState(1745);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1746);
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
			setState(1760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1749);
				((AnnotationTypeMemberDeclarationContext)_localctx).a = annotationTypeElementDeclaration();
				_localctx.ret.addMethod(((AnnotationTypeMemberDeclarationContext)_localctx).a.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1752);
				constantDeclaration(_localctx.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1753);
				((AnnotationTypeMemberDeclarationContext)_localctx).cl = classDeclaration();
				_localctx.ret.addInnerBody(((AnnotationTypeMemberDeclarationContext)_localctx).cl.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1756);
				((AnnotationTypeMemberDeclarationContext)_localctx).i = interfaceDeclaration();
				_localctx.ret.addInnerBody(((AnnotationTypeMemberDeclarationContext)_localctx).i.ret);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1759);
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
			setState(1770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT || _la==PUBLIC || _la==AT) {
				{
				setState(1768);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ABSTRACT:
				case PUBLIC:
					{
					{
					setState(1762);
					((AnnotationTypeElementDeclarationContext)_localctx).m = annotationTypeElementModifier();
					_localctx.mods.add(((AnnotationTypeElementDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1765);
					((AnnotationTypeElementDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((AnnotationTypeElementDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1772);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			checkModifiers(_localctx.mods);
			setState(1774);
			((AnnotationTypeElementDeclarationContext)_localctx).t = unannType();
			setState(1775);
			((AnnotationTypeElementDeclarationContext)_localctx).id = match(Identifier);
			setState(1776);
			match(LPAREN);
			setState(1777);
			match(RPAREN);
			setState(1781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1778);
				((AnnotationTypeElementDeclarationContext)_localctx).ds = dims();
				((AnnotationTypeElementDeclarationContext)_localctx).ls =  ((AnnotationTypeElementDeclarationContext)_localctx).ds.ret;
				}
			}

			setState(1786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1783);
				((AnnotationTypeElementDeclarationContext)_localctx).dv = defaultValue();

				                ((AnnotationTypeElementDeclarationContext)_localctx).expr =  ((AnnotationTypeElementDeclarationContext)_localctx).dv.ret;
				                _localctx.mods.add(Modifier.DEFAULT);
				            
				}
			}

			setState(1788);
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
			setState(1795);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1791);
				((AnnotationTypeElementModifierContext)_localctx).pu = match(PUBLIC);
				((AnnotationTypeElementModifierContext)_localctx).ret =  new Modifier(((AnnotationTypeElementModifierContext)_localctx).pu);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1793);
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
			setState(1797);
			match(DEFAULT);
			setState(1798);
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
			setState(1810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1801);
				((AnnotationContext)_localctx).n = normalAnnotation();
				((AnnotationContext)_localctx).ret =  ((AnnotationContext)_localctx).n.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1804);
				((AnnotationContext)_localctx).m = markerAnnotation();
				((AnnotationContext)_localctx).ret =  ((AnnotationContext)_localctx).m.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1807);
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
			setState(1812);
			((NormalAnnotationContext)_localctx).at = match(AT);
			setState(1813);
			((NormalAnnotationContext)_localctx).t = typeName();
			((NormalAnnotationContext)_localctx).ret =  new Annotation(((NormalAnnotationContext)_localctx).at, ((NormalAnnotationContext)_localctx).t.ret);
			setState(1815);
			match(LPAREN);
			setState(1817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1816);
				elementValuePairList(_localctx.ret);
				}
			}

			setState(1819);
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
			setState(1822);
			elementValuePair(_localctx.ret);
			}
			setState(1827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1823);
				match(COMMA);
				setState(1824);
				elementValuePair(_localctx.ret);
				}
				}
				setState(1829);
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
			setState(1830);
			((ElementValuePairContext)_localctx).id = match(Identifier);
			setState(1831);
			match(ASSIGN);
			setState(1832);
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
			setState(1844);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1835);
				((ElementValueContext)_localctx).c = conditionalExpression();
				((ElementValueContext)_localctx).ret =  ((ElementValueContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1838);
				((ElementValueContext)_localctx).i = elementValueArrayInitializer();
				((ElementValueContext)_localctx).ret =  ((ElementValueContext)_localctx).i.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1841);
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
			setState(1846);
			((ElementValueArrayInitializerContext)_localctx).first = match(LBRACE);
			setState(1850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1847);
				((ElementValueArrayInitializerContext)_localctx).l = elementValueList();
				((ElementValueArrayInitializerContext)_localctx).ls =  ((ElementValueArrayInitializerContext)_localctx).l.ret;
				}
			}

			setState(1853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1852);
				match(COMMA);
				}
			}

			setState(1855);
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
			setState(1858);
			((ElementValueListContext)_localctx).v1 = elementValue();
			_localctx.ls.add(((ElementValueListContext)_localctx).v1.ret);
			}
			setState(1867);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1861);
					match(COMMA);
					setState(1862);
					((ElementValueListContext)_localctx).v = elementValue();
					_localctx.ls.add(((ElementValueListContext)_localctx).v.ret);
					}
					} 
				}
				setState(1869);
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
			setState(1872);
			((MarkerAnnotationContext)_localctx).at = match(AT);
			setState(1873);
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
			setState(1876);
			((SingleElementAnnotationContext)_localctx).at = match(AT);
			setState(1877);
			((SingleElementAnnotationContext)_localctx).t = typeName();
			setState(1878);
			match(LPAREN);
			setState(1879);
			((SingleElementAnnotationContext)_localctx).v = elementValue();
			setState(1880);
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
			setState(1883);
			((ArrayInitializerContext)_localctx).first = match(LBRACE);
			setState(1887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(1884);
				((ArrayInitializerContext)_localctx).l = variableInitializerList();
				((ArrayInitializerContext)_localctx).ls =  ((ArrayInitializerContext)_localctx).l.ret;
				}
			}

			setState(1890);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1889);
				match(COMMA);
				}
			}

			setState(1892);
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
			setState(1895);
			((VariableInitializerListContext)_localctx).i = variableInitializer();
			_localctx.ls.add(((VariableInitializerListContext)_localctx).i.ret);
			}
			setState(1904);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1898);
					match(COMMA);
					setState(1899);
					((VariableInitializerListContext)_localctx).v = variableInitializer();
					_localctx.ls.add(((VariableInitializerListContext)_localctx).v.ret);
					}
					} 
				}
				setState(1906);
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
			setState(1910);
			((BlockContext)_localctx).first = match(LBRACE);
			setState(1914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(1911);
				((BlockContext)_localctx).s = blockStatements();
				_localctx.ret.addStatements(((BlockContext)_localctx).s.ret);
				}
			}

			setState(1916);
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
			setState(1919);
			((BlockStatementsContext)_localctx).s = blockStatement();
			_localctx.ls.add(((BlockStatementsContext)_localctx).s.ret);
			}
			setState(1927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				{
				setState(1922);
				((BlockStatementsContext)_localctx).b = blockStatement();
				_localctx.ls.add(((BlockStatementsContext)_localctx).b.ret);
				}
				}
				setState(1929);
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
			setState(1941);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1932);
				((BlockStatementContext)_localctx).d = localVariableDeclarationStatement();
				((BlockStatementContext)_localctx).ret =  ((BlockStatementContext)_localctx).d.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1935);
				((BlockStatementContext)_localctx).c = classDeclaration();
				((BlockStatementContext)_localctx).ret =  new LocalClassDeclaration(((BlockStatementContext)_localctx).c.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1938);
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
			setState(1943);
			((LocalVariableDeclarationStatementContext)_localctx).d = localVariableDeclaration();
			setState(1944);
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
			setState(1955);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				setState(1953);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FINAL:
					{
					{
					setState(1947);
					((LocalVariableDeclarationContext)_localctx).m = variableModifier();
					_localctx.mods.add(((LocalVariableDeclarationContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(1950);
					((LocalVariableDeclarationContext)_localctx).a = annotation();
					_localctx.ans.add(((LocalVariableDeclarationContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1957);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1958);
			((LocalVariableDeclarationContext)_localctx).t = unannType();
			setState(1959);
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
			setState(1980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1962);
				((StatementContext)_localctx).a = statementWithoutTrailingSubstatement();
				((StatementContext)_localctx).ret =  ((StatementContext)_localctx).a.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1965);
				((StatementContext)_localctx).b = labeledStatement();
				((StatementContext)_localctx).ret =  ((StatementContext)_localctx).b.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1968);
				((StatementContext)_localctx).c = ifThenStatement();
				((StatementContext)_localctx).ret =  ((StatementContext)_localctx).c.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1971);
				((StatementContext)_localctx).d = ifThenElseStatement();
				((StatementContext)_localctx).ret =  ((StatementContext)_localctx).d.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1974);
				((StatementContext)_localctx).e = whileStatement();
				((StatementContext)_localctx).ret =  ((StatementContext)_localctx).e.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1977);
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
			setState(1997);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1982);
				((StatementNoShortIfContext)_localctx).a = statementWithoutTrailingSubstatement();
				((StatementNoShortIfContext)_localctx).ret =  ((StatementNoShortIfContext)_localctx).a.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1985);
				((StatementNoShortIfContext)_localctx).b = labeledStatementNoShortIf();
				((StatementNoShortIfContext)_localctx).ret =  ((StatementNoShortIfContext)_localctx).b.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1988);
				((StatementNoShortIfContext)_localctx).c = ifThenElseStatementNoShortIf();
				((StatementNoShortIfContext)_localctx).ret =  ((StatementNoShortIfContext)_localctx).c.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1991);
				((StatementNoShortIfContext)_localctx).d = whileStatementNoShortIf();
				((StatementNoShortIfContext)_localctx).ret =  ((StatementNoShortIfContext)_localctx).d.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1994);
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
			setState(2035);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1999);
				((StatementWithoutTrailingSubstatementContext)_localctx).a = block();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).a.ret;
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(2002);
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
				setState(2005);
				((StatementWithoutTrailingSubstatementContext)_localctx).c = expressionStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).c.ret;
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(2008);
				((StatementWithoutTrailingSubstatementContext)_localctx).d = assertStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).d.ret;
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(2011);
				((StatementWithoutTrailingSubstatementContext)_localctx).e = switchStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).e.ret;
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(2014);
				((StatementWithoutTrailingSubstatementContext)_localctx).f = doStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).f.ret;
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(2017);
				((StatementWithoutTrailingSubstatementContext)_localctx).g = breakStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).g.ret;
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2020);
				((StatementWithoutTrailingSubstatementContext)_localctx).h = continueStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).h.ret;
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(2023);
				((StatementWithoutTrailingSubstatementContext)_localctx).i = returnStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).i.ret;
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
				setState(2026);
				((StatementWithoutTrailingSubstatementContext)_localctx).j = synchronizedStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).j.ret;
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 11);
				{
				setState(2029);
				((StatementWithoutTrailingSubstatementContext)_localctx).k = throwStatement();
				((StatementWithoutTrailingSubstatementContext)_localctx).ret =  ((StatementWithoutTrailingSubstatementContext)_localctx).k.ret;
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 12);
				{
				setState(2032);
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
			setState(2037);
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
			setState(2040);
			((LabeledStatementContext)_localctx).id = match(Identifier);
			setState(2041);
			match(COLON);
			setState(2042);
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
			setState(2045);
			((LabeledStatementNoShortIfContext)_localctx).id = match(Identifier);
			setState(2046);
			match(COLON);
			setState(2047);
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
			setState(2050);
			((ExpressionStatementContext)_localctx).s = statementExpression();
			setState(2051);
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
			setState(2075);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2054);
				((StatementExpressionContext)_localctx).a = assignment();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).a.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2057);
				((StatementExpressionContext)_localctx).b = preIncrementExpression();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).b.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2060);
				((StatementExpressionContext)_localctx).c = preDecrementExpression();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).c.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2063);
				((StatementExpressionContext)_localctx).d = postIncrementExpression();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).d.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2066);
				((StatementExpressionContext)_localctx).f = postDecrementExpression();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).f.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2069);
				((StatementExpressionContext)_localctx).g = methodInvocation();
				((StatementExpressionContext)_localctx).ret =  ((StatementExpressionContext)_localctx).g.ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2072);
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
			setState(2077);
			((IfThenStatementContext)_localctx).kw = match(IF);
			setState(2078);
			match(LPAREN);
			setState(2079);
			((IfThenStatementContext)_localctx).e = expression();
			setState(2080);
			match(RPAREN);
			setState(2081);
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
			setState(2084);
			((IfThenElseStatementContext)_localctx).kw = match(IF);
			setState(2085);
			match(LPAREN);
			setState(2086);
			((IfThenElseStatementContext)_localctx).e = expression();
			setState(2087);
			match(RPAREN);
			setState(2088);
			((IfThenElseStatementContext)_localctx).t = statementNoShortIf();
			setState(2089);
			match(ELSE);
			setState(2090);
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
			setState(2093);
			((IfThenElseStatementNoShortIfContext)_localctx).kw = match(IF);
			setState(2094);
			match(LPAREN);
			setState(2095);
			((IfThenElseStatementNoShortIfContext)_localctx).e = expression();
			setState(2096);
			match(RPAREN);
			setState(2097);
			((IfThenElseStatementNoShortIfContext)_localctx).t = statementNoShortIf();
			setState(2098);
			match(ELSE);
			setState(2099);
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
			setState(2114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2102);
				((AssertStatementContext)_localctx).kw = match(ASSERT);
				setState(2103);
				((AssertStatementContext)_localctx).e = expression();
				setState(2104);
				((AssertStatementContext)_localctx).last = match(SEMI);
				((AssertStatementContext)_localctx).ret =  new AssertStatement(((AssertStatementContext)_localctx).kw, ((AssertStatementContext)_localctx).last, ((AssertStatementContext)_localctx).e.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2107);
				((AssertStatementContext)_localctx).kw = match(ASSERT);
				setState(2108);
				((AssertStatementContext)_localctx).e = expression();
				setState(2109);
				match(COLON);
				setState(2110);
				((AssertStatementContext)_localctx).msg = expression();
				setState(2111);
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
			setState(2116);
			((SwitchStatementContext)_localctx).kw = match(SWITCH);
			setState(2117);
			match(LPAREN);
			setState(2118);
			((SwitchStatementContext)_localctx).e = expression();
			setState(2119);
			match(RPAREN);
			setState(2120);
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
			setState(2123);
			match(LBRACE);
			setState(2129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2124);
					((SwitchBlockContext)_localctx).m = switchBlockStatementGroup();
					_localctx.blocks.add(((SwitchBlockContext)_localctx).m.ret);
					}
					} 
				}
				setState(2131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			}
			setState(2137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(2132);
				((SwitchBlockContext)_localctx).l = switchLabel();
				_localctx.blocks.add(new CaseBlock(((SwitchBlockContext)_localctx).l.ret));
				}
				}
				setState(2139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2140);
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
			setState(2144);
			((SwitchBlockStatementGroupContext)_localctx).l = switchLabels();
			setState(2145);
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
			setState(2148);
			((SwitchLabelsContext)_localctx).s = switchLabel();
			_localctx.lbls.add(((SwitchLabelsContext)_localctx).s.ret);
			}
			setState(2156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(2151);
				((SwitchLabelsContext)_localctx).l = switchLabel();
				_localctx.lbls.add(((SwitchLabelsContext)_localctx).l.ret);
				}
				}
				setState(2158);
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
			setState(2173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2161);
				match(CASE);
				setState(2162);
				((SwitchLabelContext)_localctx).c = constantExpression();
				setState(2163);
				match(COLON);
				((SwitchLabelContext)_localctx).ret =  ((SwitchLabelContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2166);
				match(CASE);
				setState(2167);
				((SwitchLabelContext)_localctx).id = match(Identifier);
				setState(2168);
				match(COLON);
				((SwitchLabelContext)_localctx).ret =  createExpressionName(((SwitchLabelContext)_localctx).id);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2170);
				((SwitchLabelContext)_localctx).kw = match(DEFAULT);
				setState(2171);
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
			setState(2175);
			((WhileStatementContext)_localctx).kw = match(WHILE);
			setState(2176);
			match(LPAREN);
			setState(2177);
			((WhileStatementContext)_localctx).c = expression();
			setState(2178);
			match(RPAREN);
			setState(2179);
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
			setState(2182);
			((WhileStatementNoShortIfContext)_localctx).kw = match(WHILE);
			setState(2183);
			match(LPAREN);
			setState(2184);
			((WhileStatementNoShortIfContext)_localctx).c = expression();
			setState(2185);
			match(RPAREN);
			setState(2186);
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
			setState(2189);
			((DoStatementContext)_localctx).kw = match(DO);
			setState(2190);
			((DoStatementContext)_localctx).s = statement();
			setState(2191);
			match(WHILE);
			setState(2192);
			match(LPAREN);
			setState(2193);
			((DoStatementContext)_localctx).c = expression();
			setState(2194);
			match(RPAREN);
			setState(2195);
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
			setState(2204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2198);
				((ForStatementContext)_localctx).b = basicForStatement();
				((ForStatementContext)_localctx).ret =  ((ForStatementContext)_localctx).b.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2201);
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
			setState(2212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2206);
				((ForStatementNoShortIfContext)_localctx).b = basicForStatementNoShortIf();
				((ForStatementNoShortIfContext)_localctx).ret =  ((ForStatementNoShortIfContext)_localctx).b.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2209);
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
			setState(2214);
			((BasicForStatementContext)_localctx).kw = match(FOR);
			setState(2215);
			match(LPAREN);
			setState(2219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(2216);
				((BasicForStatementContext)_localctx).i = forInit();
				((BasicForStatementContext)_localctx).forIn =  ((BasicForStatementContext)_localctx).i.ret;
				}
			}

			setState(2221);
			match(SEMI);
			setState(2225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2222);
				((BasicForStatementContext)_localctx).e = expression();
				((BasicForStatementContext)_localctx).expr =  ((BasicForStatementContext)_localctx).e.ret;
				}
			}

			setState(2227);
			match(SEMI);
			setState(2231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(2228);
				((BasicForStatementContext)_localctx).u = forUpdate();
				((BasicForStatementContext)_localctx).forUp =  ((BasicForStatementContext)_localctx).u.ret;
				}
			}

			setState(2233);
			match(RPAREN);
			setState(2234);
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
			setState(2237);
			((BasicForStatementNoShortIfContext)_localctx).kw = match(FOR);
			setState(2238);
			match(LPAREN);
			setState(2242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(2239);
				((BasicForStatementNoShortIfContext)_localctx).i = forInit();
				((BasicForStatementNoShortIfContext)_localctx).forIn =  ((BasicForStatementNoShortIfContext)_localctx).i.ret;
				}
			}

			setState(2244);
			match(SEMI);
			setState(2248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2245);
				((BasicForStatementNoShortIfContext)_localctx).e = expression();
				((BasicForStatementNoShortIfContext)_localctx).expr =  ((BasicForStatementNoShortIfContext)_localctx).e.ret;
				}
			}

			setState(2250);
			match(SEMI);
			setState(2254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (INC - 79)) | (1L << (DEC - 79)) | (1L << (Identifier - 79)) | (1L << (AT - 79)))) != 0)) {
				{
				setState(2251);
				((BasicForStatementNoShortIfContext)_localctx).u = forUpdate();
				((BasicForStatementNoShortIfContext)_localctx).forUp =  ((BasicForStatementNoShortIfContext)_localctx).u.ret;
				}
			}

			setState(2256);
			match(RPAREN);
			setState(2257);
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
			setState(2266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2260);
				((ForInitContext)_localctx).ls = statementExpressionList();
				((ForInitContext)_localctx).ret =  ((ForInitContext)_localctx).ls.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2263);
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
			setState(2268);
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
			setState(2271);
			((StatementExpressionListContext)_localctx).s = statementExpression();
			_localctx.ups.add(((StatementExpressionListContext)_localctx).s.ret);
			}
			setState(2280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2274);
				match(COMMA);
				setState(2275);
				((StatementExpressionListContext)_localctx).e = statementExpression();
				_localctx.ups.add(((StatementExpressionListContext)_localctx).e.ret);
				}
				}
				setState(2282);
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
			setState(2285);
			((EnhancedForStatementContext)_localctx).kw = match(FOR);
			setState(2286);
			match(LPAREN);
			setState(2295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				setState(2293);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FINAL:
					{
					{
					setState(2287);
					((EnhancedForStatementContext)_localctx).m = variableModifier();
					_localctx.mods.add(((EnhancedForStatementContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(2290);
					((EnhancedForStatementContext)_localctx).a = annotation();
					_localctx.ans.add(((EnhancedForStatementContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2298);
			((EnhancedForStatementContext)_localctx).v = typedVariableDeclaratorId(_localctx.mods, _localctx.ans);
			setState(2299);
			match(COLON);
			setState(2300);
			((EnhancedForStatementContext)_localctx).e = expression();
			setState(2301);
			match(RPAREN);
			setState(2302);
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
			setState(2305);
			((EnhancedForStatementNoShortIfContext)_localctx).kw = match(FOR);
			setState(2306);
			match(LPAREN);
			setState(2315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				setState(2313);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FINAL:
					{
					{
					setState(2307);
					((EnhancedForStatementNoShortIfContext)_localctx).m = variableModifier();
					_localctx.mods.add(((EnhancedForStatementNoShortIfContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(2310);
					((EnhancedForStatementNoShortIfContext)_localctx).a = annotation();
					_localctx.ans.add(((EnhancedForStatementNoShortIfContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2318);
			((EnhancedForStatementNoShortIfContext)_localctx).v = typedVariableDeclaratorId(_localctx.mods, _localctx.ans);
			setState(2319);
			match(COLON);
			setState(2320);
			((EnhancedForStatementNoShortIfContext)_localctx).e = expression();
			setState(2321);
			match(RPAREN);
			setState(2322);
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
			setState(2325);
			((BreakStatementContext)_localctx).kw = match(BREAK);
			setState(2328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(2326);
				((BreakStatementContext)_localctx).id = match(Identifier);
				((BreakStatementContext)_localctx).name =  ((BreakStatementContext)_localctx).id;
				}
			}

			setState(2330);
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
			setState(2333);
			((ContinueStatementContext)_localctx).kw = match(CONTINUE);
			setState(2336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(2334);
				((ContinueStatementContext)_localctx).id = match(Identifier);
				((ContinueStatementContext)_localctx).name =  ((ContinueStatementContext)_localctx).id;
				}
			}

			setState(2338);
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
			setState(2349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2341);
				((ReturnStatementContext)_localctx).kw = match(RETURN);
				setState(2342);
				((ReturnStatementContext)_localctx).last = match(SEMI);
				((ReturnStatementContext)_localctx).ret =  new ReturnStatement(((ReturnStatementContext)_localctx).kw, ((ReturnStatementContext)_localctx).last);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2344);
				((ReturnStatementContext)_localctx).kw = match(RETURN);
				setState(2345);
				((ReturnStatementContext)_localctx).e = expression();
				setState(2346);
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
			setState(2351);
			((ThrowStatementContext)_localctx).kw = match(THROW);
			setState(2352);
			((ThrowStatementContext)_localctx).e = expression();
			setState(2353);
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
			setState(2356);
			((SynchronizedStatementContext)_localctx).kw = match(SYNCHRONIZED);
			setState(2357);
			match(LPAREN);
			setState(2358);
			((SynchronizedStatementContext)_localctx).e = expression();
			setState(2359);
			match(RPAREN);
			setState(2360);
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
			setState(2381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2363);
				((TryStatementContext)_localctx).kw = match(TRY);
				setState(2364);
				((TryStatementContext)_localctx).t = block();
				setState(2365);
				((TryStatementContext)_localctx).cs = catches();
				((TryStatementContext)_localctx).ret =  new TryCatchBlock(((TryStatementContext)_localctx).kw, ((TryStatementContext)_localctx).t.ret, ((TryStatementContext)_localctx).cs.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2368);
				((TryStatementContext)_localctx).kw = match(TRY);
				setState(2369);
				((TryStatementContext)_localctx).t = block();
				setState(2373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(2370);
					((TryStatementContext)_localctx).cs = catches();
					((TryStatementContext)_localctx).ls =  ((TryStatementContext)_localctx).cs.ret;
					}
				}

				setState(2375);
				((TryStatementContext)_localctx).f = finally_();
				((TryStatementContext)_localctx).ret =  new TryCatchBlock(((TryStatementContext)_localctx).kw, ((TryStatementContext)_localctx).t.ret, _localctx.ls, ((TryStatementContext)_localctx).f.ret);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2378);
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
			setState(2383);
			((CatchesContext)_localctx).f = catchClause();
			_localctx.ls.add(((CatchesContext)_localctx).f.ret);
			setState(2390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(2385);
				((CatchesContext)_localctx).c = catchClause();
				_localctx.ls.add(((CatchesContext)_localctx).c.ret);
				}
				}
				setState(2392);
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
			setState(2395);
			((CatchClauseContext)_localctx).kw = match(CATCH);
			((CatchClauseContext)_localctx).ret =  new CatchBlock(((CatchClauseContext)_localctx).kw);
			setState(2397);
			match(LPAREN);
			setState(2398);
			catchFormalParameter(_localctx.ret);
			setState(2399);
			match(RPAREN);
			setState(2400);
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
			setState(2411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				setState(2409);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FINAL:
					{
					{
					setState(2403);
					((CatchFormalParameterContext)_localctx).m = variableModifier();
					_localctx.mods.add(((CatchFormalParameterContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(2406);
					((CatchFormalParameterContext)_localctx).a = annotation();
					_localctx.ans.add(((CatchFormalParameterContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2414);
			catchType(_localctx.ret);
			setState(2415);
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
			setState(2418);
			((CatchTypeContext)_localctx).u = unannClassType();
			_localctx.ret.addExceptionType(((CatchTypeContext)_localctx).u.ret);
			}
			setState(2427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(2421);
				match(BITOR);
				setState(2422);
				((CatchTypeContext)_localctx).c = classType();
				_localctx.ret.addExceptionType(((CatchTypeContext)_localctx).c.ret);
				}
				}
				setState(2429);
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
			setState(2430);
			match(FINALLY);
			setState(2431);
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
			setState(2434);
			((TryWithResourcesStatementContext)_localctx).kw = match(TRY);
			setState(2435);
			((TryWithResourcesStatementContext)_localctx).r = resourceSpecification();
			setState(2436);
			((TryWithResourcesStatementContext)_localctx).b = block();
			setState(2440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(2437);
				((TryWithResourcesStatementContext)_localctx).c = catches();
				((TryWithResourcesStatementContext)_localctx).ls =  ((TryWithResourcesStatementContext)_localctx).c.ret;
				}
			}

			setState(2445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(2442);
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
			setState(2450);
			match(LPAREN);
			setState(2457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(2451);
				((ResourceSpecificationContext)_localctx).l = resourceList();
				{
				setState(2453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(2452);
					match(SEMI);
					}
				}

				}
				((ResourceSpecificationContext)_localctx).ret =  ((ResourceSpecificationContext)_localctx).l.ret;
				}
			}

			setState(2459);
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
			setState(2461);
			((ResourceListContext)_localctx).r = resource();
			_localctx.vars.add(((ResourceListContext)_localctx).r.ret);
			setState(2469);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2463);
					match(SEMI);
					setState(2464);
					((ResourceListContext)_localctx).re = resource();
					_localctx.vars.add(((ResourceListContext)_localctx).re.ret);
					}
					} 
				}
				setState(2471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
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
			setState(2482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				setState(2480);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FINAL:
					{
					{
					setState(2474);
					((ResourceContext)_localctx).m = variableModifier();
					_localctx.mods.add(((ResourceContext)_localctx).m.ret);
					}
					}
					break;
				case AT:
					{
					{
					setState(2477);
					((ResourceContext)_localctx).a = annotation();
					_localctx.ans.add(((ResourceContext)_localctx).a.ret);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2485);
			((ResourceContext)_localctx).v = typedVariableDeclaratorId(_localctx.mods, _localctx.ans);
			setState(2486);
			match(ASSIGN);
			setState(2487);
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
			setState(2496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(2490);
				((PrimaryContext)_localctx).pno = primaryNoNewArray_lfno_primary();
				((PrimaryContext)_localctx).ret =  ((PrimaryContext)_localctx).pno.ret;
				}
				break;
			case 2:
				{
				setState(2493);
				((PrimaryContext)_localctx).a = arrayCreationExpression();
				((PrimaryContext)_localctx).ret =  ((PrimaryContext)_localctx).a.ret;
				}
				break;
			}
			setState(2503);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2498);
					((PrimaryContext)_localctx).p = primaryNoNewArray_lf_primary();

					                ((PrimaryContext)_localctx).p.ret.qualifyWith(_localctx.ret);
					                ((PrimaryContext)_localctx).ret =  ((PrimaryContext)_localctx).p.ret;
					            
					}
					} 
				}
				setState(2505);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
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
			setState(2534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2506);
				((PrimaryNoNewArrayContext)_localctx).a1 = literal();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a1.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2509);
				((PrimaryNoNewArrayContext)_localctx).a2 = primaryNoNewArray_typeAccess();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a2.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2512);
				((PrimaryNoNewArrayContext)_localctx).kw = match(THIS);
				((PrimaryNoNewArrayContext)_localctx).ret =  createTypeName(((PrimaryNoNewArrayContext)_localctx).kw);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2514);
				((PrimaryNoNewArrayContext)_localctx).first = match(LPAREN);
				setState(2515);
				((PrimaryNoNewArrayContext)_localctx).p = expression();
				setState(2516);
				((PrimaryNoNewArrayContext)_localctx).last = match(RPAREN);
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).p.ret; _localctx.ret.setFirstToken(((PrimaryNoNewArrayContext)_localctx).first); _localctx.ret.setLastToken(((PrimaryNoNewArrayContext)_localctx).last);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2519);
				((PrimaryNoNewArrayContext)_localctx).a7 = classInstanceCreationExpression();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a7.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2522);
				((PrimaryNoNewArrayContext)_localctx).a8 = fieldAccess();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a8.ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2525);
				((PrimaryNoNewArrayContext)_localctx).a9 = arrayAccess();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a9.ret;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2528);
				((PrimaryNoNewArrayContext)_localctx).a10 = methodInvocation();
				((PrimaryNoNewArrayContext)_localctx).ret =  ((PrimaryNoNewArrayContext)_localctx).a10.ret;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2531);
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
			setState(2572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2536);
				((PrimaryNoNewArray_typeAccessContext)_localctx).id = match(Identifier);
				setState(2542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2537);
					((PrimaryNoNewArray_typeAccessContext)_localctx).first = match(LBRACK);
					setState(2538);
					((PrimaryNoNewArray_typeAccessContext)_localctx).last = match(RBRACK);
					_localctx.ls.add(new Dimension(((PrimaryNoNewArray_typeAccessContext)_localctx).first, ((PrimaryNoNewArray_typeAccessContext)_localctx).last));
					}
					}
					setState(2544);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2545);
				match(DOT);
				setState(2546);
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
				setState(2548);
				((PrimaryNoNewArray_typeAccessContext)_localctx).p = packageOrTypeName(0);
				setState(2549);
				match(DOT);
				setState(2550);
				((PrimaryNoNewArray_typeAccessContext)_localctx).id = match(Identifier);
				setState(2556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2551);
					((PrimaryNoNewArray_typeAccessContext)_localctx).first = match(LBRACK);
					setState(2552);
					((PrimaryNoNewArray_typeAccessContext)_localctx).last = match(RBRACK);
					_localctx.ls.add(new Dimension(((PrimaryNoNewArray_typeAccessContext)_localctx).first, ((PrimaryNoNewArray_typeAccessContext)_localctx).last));
					}
					}
					setState(2558);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2559);
				match(DOT);
				setState(2560);
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
				setState(2563);
				((PrimaryNoNewArray_typeAccessContext)_localctx).kv = match(VOID);
				setState(2564);
				match(DOT);
				setState(2565);
				((PrimaryNoNewArray_typeAccessContext)_localctx).kw = match(CLASS);
				((PrimaryNoNewArray_typeAccessContext)_localctx).ret =  new ClassLiteralExpression(createTypeName(((PrimaryNoNewArray_typeAccessContext)_localctx).kv), ((PrimaryNoNewArray_typeAccessContext)_localctx).kw);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2567);
				((PrimaryNoNewArray_typeAccessContext)_localctx).t = typeName();
				setState(2568);
				match(DOT);
				setState(2569);
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
			setState(2601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2576);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a1 = literal();
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a1.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2579);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a2 = primaryNoNewArray_typeAccess();
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a2.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2582);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).kw = match(THIS);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  createTypeName(((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).kw);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2584);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).first = match(LPAREN);
				setState(2585);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).p = expression();
				setState(2586);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).last = match(RPAREN);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).p.ret; _localctx.ret.setFirstToken(((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).first); _localctx.ret.setLastToken(((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).last);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2589);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a5 = classInstanceCreationExpression();
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a5.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2592);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a6 = fieldAccess();
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a6.ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2595);
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a7 = methodInvocation();
				((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_arrayAccessContext)_localctx).a7.ret;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2598);
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
			setState(2618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2603);
				((PrimaryNoNewArray_lf_primaryContext)_localctx).a1 = classInstanceCreationExpression_lf_primary();
				((PrimaryNoNewArray_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primaryContext)_localctx).a1.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2606);
				((PrimaryNoNewArray_lf_primaryContext)_localctx).a2 = fieldAccess_lf_primary();
				((PrimaryNoNewArray_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primaryContext)_localctx).a2.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2609);
				((PrimaryNoNewArray_lf_primaryContext)_localctx).a3 = arrayAccess_lf_primary();
				((PrimaryNoNewArray_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primaryContext)_localctx).a3.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2612);
				((PrimaryNoNewArray_lf_primaryContext)_localctx).a4 = methodInvocation_lf_primary();
				((PrimaryNoNewArray_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primaryContext)_localctx).a4.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2615);
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
			setState(2632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2620);
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a1 = classInstanceCreationExpression_lf_primary();
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a1.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2623);
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a2 = fieldAccess_lf_primary();
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a2.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2626);
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a3 = methodInvocation_lf_primary();
				((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext)_localctx).a3.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2629);
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
			setState(2675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2634);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a1 = literal();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a1.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2637);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a2 = primaryNoNewArray_typeAccess();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a2.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2640);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a3 = unannPrimitiveType();
				setState(2646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2641);
					((PrimaryNoNewArray_lfno_primaryContext)_localctx).first = match(LBRACK);
					setState(2642);
					((PrimaryNoNewArray_lfno_primaryContext)_localctx).last = match(RBRACK);
					_localctx.ls.add(new Dimension(((PrimaryNoNewArray_lfno_primaryContext)_localctx).first, ((PrimaryNoNewArray_lfno_primaryContext)_localctx).last));
					}
					}
					setState(2648);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2649);
				match(DOT);
				setState(2650);
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
				setState(2653);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).kw = match(THIS);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  createTypeName(((PrimaryNoNewArray_lfno_primaryContext)_localctx).kw);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2655);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).first = match(LPAREN);
				setState(2656);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).p = expression();
				setState(2657);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).last = match(RPAREN);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).p.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2660);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a7 = classInstanceCreationExpression_lfno_primary();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a7.ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2663);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a8 = fieldAccess_lfno_primary();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a8.ret;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2666);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a9 = arrayAccess_lfno_primary();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a9.ret;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2669);
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).a10 = methodInvocation_lfno_primary();
				((PrimaryNoNewArray_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primaryContext)_localctx).a10.ret;
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2672);
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
			setState(2717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2679);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a1 = literal();
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a1.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2682);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a2 = primaryNoNewArray_typeAccess();
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a2.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2685);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a3 = unannPrimitiveType();
				setState(2691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2686);
					((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).first = match(LBRACK);
					setState(2687);
					((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).last = match(RBRACK);
					_localctx.ls.add(new Dimension(((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).first, ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).last));
					}
					}
					setState(2693);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2694);
				match(DOT);
				setState(2695);
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
				setState(2698);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).kw = match(THIS);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  createTypeName(((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).kw);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2700);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).first = match(LPAREN);
				setState(2701);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).p = expression();
				setState(2702);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).last = match(RPAREN);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).p.ret;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2705);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a7 = classInstanceCreationExpression_lfno_primary();
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a7.ret;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2708);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a8 = fieldAccess_lfno_primary();
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a8.ret;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2711);
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a9 = methodInvocation_lfno_primary();
				((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).ret =  ((PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext)_localctx).a9.ret;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2714);
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
			setState(2835);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2719);
				((ClassInstanceCreationExpressionContext)_localctx).kw = match(NEW);
				setState(2723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2720);
					((ClassInstanceCreationExpressionContext)_localctx).t = typeArguments();
					((ClassInstanceCreationExpressionContext)_localctx).targs =  ((ClassInstanceCreationExpressionContext)_localctx).t.ret;
					}
				}

				setState(2730);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2725);
					((ClassInstanceCreationExpressionContext)_localctx).a = annotation();
					_localctx.ans.add(((ClassInstanceCreationExpressionContext)_localctx).a.ret);
					}
					}
					setState(2732);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2733);
				((ClassInstanceCreationExpressionContext)_localctx).id = match(Identifier);

				            ((ClassInstanceCreationExpressionContext)_localctx).tok =  ((ClassInstanceCreationExpressionContext)_localctx).id;
				            ((ClassInstanceCreationExpressionContext)_localctx).prev =  createTypeName(((ClassInstanceCreationExpressionContext)_localctx).id, _localctx.ans);
				            ((ClassInstanceCreationExpressionContext)_localctx).methodExpr =  _localctx.prev;
				        
				setState(2748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2735);
					match(DOT);
					setState(2741);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2736);
						((ClassInstanceCreationExpressionContext)_localctx).a2 = annotation();
						_localctx.ans2.add(((ClassInstanceCreationExpressionContext)_localctx).a2.ret);
						}
						}
						setState(2743);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2744);
					((ClassInstanceCreationExpressionContext)_localctx).id2 = match(Identifier);

					                ((ClassInstanceCreationExpressionContext)_localctx).tok =  ((ClassInstanceCreationExpressionContext)_localctx).id2;
					                _localctx.prev.setKind(NameExpression.Kind.PACKAGE_OR_TYPE);
					                ((ClassInstanceCreationExpressionContext)_localctx).prev =  createTypeName(((ClassInstanceCreationExpressionContext)_localctx).id2, _localctx.ans2);
					                ((ClassInstanceCreationExpressionContext)_localctx).methodExpr =  new AccessExpression(_localctx.methodExpr, _localctx.prev);
					                _localctx.ans2.clear();
					            
					}
					}
					setState(2750);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2751);
					((ClassInstanceCreationExpressionContext)_localctx).ta = typeArgumentsOrDiamond();

					                ((ClassInstanceCreationExpressionContext)_localctx).methodExpr =  new ParamExpression(_localctx.methodExpr, ((ClassInstanceCreationExpressionContext)_localctx).ta.ret, ((ClassInstanceCreationExpressionContext)_localctx).ta.last);
					            
					}
				}

				setState(2756);
				match(LPAREN);
				setState(2760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2757);
					((ClassInstanceCreationExpressionContext)_localctx).l = argumentList();
					((ClassInstanceCreationExpressionContext)_localctx).args =  ((ClassInstanceCreationExpressionContext)_localctx).l.ret;
					}
				}

				setState(2762);
				((ClassInstanceCreationExpressionContext)_localctx).last = match(RPAREN);

				            ((ClassInstanceCreationExpressionContext)_localctx).ret =  new InstantiationExpression(((ClassInstanceCreationExpressionContext)_localctx).kw, ((ClassInstanceCreationExpressionContext)_localctx).last,
				                                               _localctx.methodExpr, _localctx.tok,
				                                               _localctx.args, _localctx.targs);
				            ((ClassInstanceCreationExpressionContext)_localctx).anon =  _localctx.ret.getAnonymousClass();
				        
				setState(2765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2764);
					classBody(_localctx.anon);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2767);
				((ClassInstanceCreationExpressionContext)_localctx).name = expressionName();
				setState(2768);
				match(DOT);
				setState(2769);
				((ClassInstanceCreationExpressionContext)_localctx).kw = match(NEW);
				setState(2773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2770);
					((ClassInstanceCreationExpressionContext)_localctx).t = typeArguments();
					((ClassInstanceCreationExpressionContext)_localctx).targs =  ((ClassInstanceCreationExpressionContext)_localctx).t.ret;
					}
				}

				setState(2780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2775);
					((ClassInstanceCreationExpressionContext)_localctx).a = annotation();
					_localctx.ans.add(((ClassInstanceCreationExpressionContext)_localctx).a.ret);
					}
					}
					setState(2782);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2783);
				((ClassInstanceCreationExpressionContext)_localctx).id = match(Identifier);

				            ((ClassInstanceCreationExpressionContext)_localctx).tok =  ((ClassInstanceCreationExpressionContext)_localctx).id;
				            ((ClassInstanceCreationExpressionContext)_localctx).methodExpr =  new AccessExpression(((ClassInstanceCreationExpressionContext)_localctx).name.ret,
				                                               createTypeName(((ClassInstanceCreationExpressionContext)_localctx).id, _localctx.ans));
				        
				setState(2788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2785);
					((ClassInstanceCreationExpressionContext)_localctx).ta = typeArgumentsOrDiamond();

					                ((ClassInstanceCreationExpressionContext)_localctx).methodExpr =  new ParamExpression(_localctx.methodExpr, ((ClassInstanceCreationExpressionContext)_localctx).ta.ret, ((ClassInstanceCreationExpressionContext)_localctx).ta.last);
					            
					}
				}

				setState(2790);
				match(LPAREN);
				setState(2794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2791);
					((ClassInstanceCreationExpressionContext)_localctx).l = argumentList();
					((ClassInstanceCreationExpressionContext)_localctx).args =  ((ClassInstanceCreationExpressionContext)_localctx).l.ret;
					}
				}

				setState(2796);
				((ClassInstanceCreationExpressionContext)_localctx).last = match(RPAREN);

				            ((ClassInstanceCreationExpressionContext)_localctx).ret =  new InstantiationExpression(((ClassInstanceCreationExpressionContext)_localctx).kw, ((ClassInstanceCreationExpressionContext)_localctx).last,
				                                               _localctx.methodExpr, _localctx.tok,
				                                               _localctx.args, _localctx.targs);
				            ((ClassInstanceCreationExpressionContext)_localctx).anon =  _localctx.ret.getAnonymousClass();
				        
				setState(2799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2798);
					classBody(_localctx.anon);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2801);
				((ClassInstanceCreationExpressionContext)_localctx).p = primary();
				setState(2802);
				match(DOT);
				setState(2803);
				((ClassInstanceCreationExpressionContext)_localctx).kw = match(NEW);
				setState(2807);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2804);
					((ClassInstanceCreationExpressionContext)_localctx).t = typeArguments();
					((ClassInstanceCreationExpressionContext)_localctx).targs =  ((ClassInstanceCreationExpressionContext)_localctx).t.ret;
					}
				}

				setState(2814);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2809);
					((ClassInstanceCreationExpressionContext)_localctx).a = annotation();
					_localctx.ans.add(((ClassInstanceCreationExpressionContext)_localctx).a.ret);
					}
					}
					setState(2816);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2817);
				((ClassInstanceCreationExpressionContext)_localctx).id = match(Identifier);

				            ((ClassInstanceCreationExpressionContext)_localctx).tok =  ((ClassInstanceCreationExpressionContext)_localctx).id;
				            ((ClassInstanceCreationExpressionContext)_localctx).methodExpr =  new AccessExpression(((ClassInstanceCreationExpressionContext)_localctx).p.ret,
				                                               createTypeName(((ClassInstanceCreationExpressionContext)_localctx).id, _localctx.ans));
				        
				setState(2822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2819);
					((ClassInstanceCreationExpressionContext)_localctx).ta = typeArgumentsOrDiamond();

					                ((ClassInstanceCreationExpressionContext)_localctx).methodExpr =  new ParamExpression(_localctx.methodExpr, ((ClassInstanceCreationExpressionContext)_localctx).ta.ret, ((ClassInstanceCreationExpressionContext)_localctx).ta.last);
					            
					}
				}

				setState(2824);
				match(LPAREN);
				setState(2828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2825);
					((ClassInstanceCreationExpressionContext)_localctx).l = argumentList();
					((ClassInstanceCreationExpressionContext)_localctx).args =  ((ClassInstanceCreationExpressionContext)_localctx).l.ret;
					}
				}

				setState(2830);
				((ClassInstanceCreationExpressionContext)_localctx).last = match(RPAREN);

				            ((ClassInstanceCreationExpressionContext)_localctx).ret =  new InstantiationExpression(((ClassInstanceCreationExpressionContext)_localctx).kw, ((ClassInstanceCreationExpressionContext)_localctx).last,
				                                               _localctx.methodExpr, _localctx.tok,
				                                               _localctx.args, _localctx.targs);
				            ((ClassInstanceCreationExpressionContext)_localctx).anon =  _localctx.ret.getAnonymousClass();
				        
				setState(2833);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2832);
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
			setState(2837);
			match(DOT);
			setState(2838);
			((ClassInstanceCreationExpression_lf_primaryContext)_localctx).kw = match(NEW);
			setState(2842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2839);
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).t = typeArguments();
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).targs =  ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).t.ret;
				}
			}

			setState(2849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2844);
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).a = annotation();
				_localctx.ans.add(((ClassInstanceCreationExpression_lf_primaryContext)_localctx).a.ret);
				}
				}
				setState(2851);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2852);
			((ClassInstanceCreationExpression_lf_primaryContext)_localctx).id = match(Identifier);

			            ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).tok =  ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).id;
			            ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).methodExpr =  createTypeName(((ClassInstanceCreationExpression_lf_primaryContext)_localctx).id, _localctx.ans);
			        
			setState(2857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2854);
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).ta = typeArgumentsOrDiamond();

				                ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).methodExpr =  new ParamExpression(_localctx.methodExpr, ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).ta.ret, ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).ta.last);
				            
				}
			}

			setState(2859);
			match(LPAREN);
			setState(2863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(2860);
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).l = argumentList();
				((ClassInstanceCreationExpression_lf_primaryContext)_localctx).args =  ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).l.ret;
				}
			}

			setState(2865);
			((ClassInstanceCreationExpression_lf_primaryContext)_localctx).last = match(RPAREN);

			            ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).ret =  new InstantiationExpression(((ClassInstanceCreationExpression_lf_primaryContext)_localctx).kw, ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).last,
			                                               _localctx.methodExpr, _localctx.tok,
			                                               _localctx.args, _localctx.targs);
			            ((ClassInstanceCreationExpression_lf_primaryContext)_localctx).anon =  _localctx.ret.getAnonymousClass();
			        
			setState(2868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				{
				setState(2867);
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
			setState(2952);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2870);
				((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).kw = match(NEW);
				setState(2874);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2871);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).t = typeArguments();
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).targs =  ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(2881);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2876);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a = annotation();
					_localctx.ans.add(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a.ret);
					}
					}
					setState(2883);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2884);
				((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id = match(Identifier);

				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).tok =  ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id;
				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).methodExpr =  createPackageOrTypeName(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id, _localctx.ans);
				        
				setState(2899);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2886);
					match(DOT);
					setState(2892);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2887);
						((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a2 = annotation();
						_localctx.ans2.add(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a2.ret);
						}
						}
						setState(2894);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2895);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id2 = match(Identifier);

					                ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).tok =  ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id2;
					                ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).methodExpr =  new AccessExpression(_localctx.methodExpr,
					                                                   createPackageOrTypeName(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id2, _localctx.ans2));
					                _localctx.ans2.clear();
					            
					}
					}
					setState(2901);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2902);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ta = typeArgumentsOrDiamond();

					                ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).methodExpr =  new ParamExpression(_localctx.methodExpr, ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ta.ret, ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ta.last);
					            
					}
				}

				setState(2907);
				match(LPAREN);
				setState(2911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2908);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).l = argumentList();
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).args =  ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).l.ret;
					}
				}

				setState(2913);
				((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).last = match(RPAREN);

				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ret =  new InstantiationExpression(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).kw, ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).last,
				                                               _localctx.methodExpr, _localctx.tok,
				                                               _localctx.args, _localctx.targs);
				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).anon =  _localctx.ret.getAnonymousClass();
				        
				setState(2916);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(2915);
					classBody(_localctx.anon);
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2918);
				((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).name = expressionName();
				setState(2919);
				match(DOT);
				setState(2920);
				((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).kw = match(NEW);
				setState(2924);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2921);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).t = typeArguments();
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).targs =  ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(2931);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2926);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a = annotation();
					_localctx.ans.add(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).a.ret);
					}
					}
					setState(2933);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2934);
				((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id = match(Identifier);

				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).tok =  ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id;
				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).methodExpr =  new AccessExpression(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).name.ret,
				                                                createTypeName(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).id, _localctx.ans));
				        
				setState(2939);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2936);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ta = typeArgumentsOrDiamond();

					                ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).methodExpr =  new ParamExpression(_localctx.methodExpr, ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ta.ret, ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ta.last);
					            
					}
				}

				setState(2941);
				match(LPAREN);
				setState(2945);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(2942);
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).l = argumentList();
					((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).args =  ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).l.ret;
					}
				}

				setState(2947);
				((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).last = match(RPAREN);

				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).ret =  new InstantiationExpression(((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).kw, ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).last,
				                                               _localctx.methodExpr, _localctx.tok,
				                                               _localctx.args, _localctx.targs);
				            ((ClassInstanceCreationExpression_lfno_primaryContext)_localctx).anon =  _localctx.ret.getAnonymousClass();
				        
				setState(2950);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(2949);
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
			setState(2960);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2954);
				((TypeArgumentsOrDiamondContext)_localctx).ta = typeArguments();
				((TypeArgumentsOrDiamondContext)_localctx).ret =  ((TypeArgumentsOrDiamondContext)_localctx).ta.ret; ((TypeArgumentsOrDiamondContext)_localctx).last =  ((TypeArgumentsOrDiamondContext)_localctx).ta.last;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2957);
				match(LT);
				setState(2958);
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
			setState(2978);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2962);
				((FieldAccessContext)_localctx).p = primary();
				setState(2963);
				match(DOT);
				setState(2964);
				((FieldAccessContext)_localctx).id = match(Identifier);
				((FieldAccessContext)_localctx).ret =  new AccessExpression(((FieldAccessContext)_localctx).p.ret, createExpressionName(((FieldAccessContext)_localctx).id));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2967);
				((FieldAccessContext)_localctx).kw = match(SUPER);
				setState(2968);
				match(DOT);
				setState(2969);
				((FieldAccessContext)_localctx).id = match(Identifier);
				((FieldAccessContext)_localctx).ret =  new AccessExpression(createTypeName(((FieldAccessContext)_localctx).kw),
				                                     createExpressionName(((FieldAccessContext)_localctx).id));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2971);
				((FieldAccessContext)_localctx).t = typeName();
				setState(2972);
				match(DOT);
				setState(2973);
				((FieldAccessContext)_localctx).kw = match(SUPER);
				setState(2974);
				match(DOT);
				setState(2975);
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
			setState(2980);
			match(DOT);
			setState(2981);
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
			setState(2995);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2984);
				((FieldAccess_lfno_primaryContext)_localctx).kw = match(SUPER);
				setState(2985);
				match(DOT);
				setState(2986);
				((FieldAccess_lfno_primaryContext)_localctx).id = match(Identifier);

				            ((FieldAccess_lfno_primaryContext)_localctx).ret =  new AccessExpression(createTypeName(((FieldAccess_lfno_primaryContext)_localctx).kw),
				                                        createExpressionName(((FieldAccess_lfno_primaryContext)_localctx).id));
				        
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2988);
				((FieldAccess_lfno_primaryContext)_localctx).t = typeName();
				setState(2989);
				match(DOT);
				setState(2990);
				((FieldAccess_lfno_primaryContext)_localctx).kw = match(SUPER);
				setState(2991);
				match(DOT);
				setState(2992);
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
			setState(3009);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				{
				{
				setState(2997);
				((ArrayAccessContext)_localctx).n = expressionName();
				setState(2998);
				match(LBRACK);
				setState(2999);
				((ArrayAccessContext)_localctx).i = expression();
				setState(3000);
				((ArrayAccessContext)_localctx).last = match(RBRACK);
				((ArrayAccessContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccessContext)_localctx).last, ((ArrayAccessContext)_localctx).n.ret, ((ArrayAccessContext)_localctx).i.ret);
				}
				}
				break;
			case 2:
				{
				{
				setState(3003);
				((ArrayAccessContext)_localctx).pno = primaryNoNewArray_lfno_arrayAccess();
				setState(3004);
				match(LBRACK);
				setState(3005);
				((ArrayAccessContext)_localctx).i = expression();
				setState(3006);
				((ArrayAccessContext)_localctx).last = match(RBRACK);
				((ArrayAccessContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccessContext)_localctx).last, ((ArrayAccessContext)_localctx).pno.ret, ((ArrayAccessContext)_localctx).i.ret);
				}
				}
				break;
			}
			setState(3019);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(3011);
				primaryNoNewArray_lf_arrayAccess();
				setState(3012);
				match(LBRACK);
				setState(3013);
				((ArrayAccessContext)_localctx).i = expression();
				setState(3014);
				((ArrayAccessContext)_localctx).last = match(RBRACK);
				((ArrayAccessContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccessContext)_localctx).last, _localctx.ret, ((ArrayAccessContext)_localctx).i.ret);
				}
				}
				setState(3021);
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
			setState(3022);
			((ArrayAccess_lf_primaryContext)_localctx).pno = primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(3023);
			match(LBRACK);
			setState(3024);
			((ArrayAccess_lf_primaryContext)_localctx).i = expression();
			setState(3025);
			((ArrayAccess_lf_primaryContext)_localctx).last = match(RBRACK);
			((ArrayAccess_lf_primaryContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccess_lf_primaryContext)_localctx).last, ((ArrayAccess_lf_primaryContext)_localctx).pno.ret, ((ArrayAccess_lf_primaryContext)_localctx).i.ret);
			}
			setState(3035);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3028);
					match(LBRACK);
					setState(3029);
					((ArrayAccess_lf_primaryContext)_localctx).i2 = expression();
					setState(3030);
					((ArrayAccess_lf_primaryContext)_localctx).last = match(RBRACK);
					((ArrayAccess_lf_primaryContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccess_lf_primaryContext)_localctx).last, _localctx.ret, ((ArrayAccess_lf_primaryContext)_localctx).i2.ret);
					}
					} 
				}
				setState(3037);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
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
			setState(3050);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				{
				setState(3038);
				((ArrayAccess_lfno_primaryContext)_localctx).name = expressionName();
				setState(3039);
				match(LBRACK);
				setState(3040);
				((ArrayAccess_lfno_primaryContext)_localctx).i = expression();
				setState(3041);
				((ArrayAccess_lfno_primaryContext)_localctx).last = match(RBRACK);
				((ArrayAccess_lfno_primaryContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccess_lfno_primaryContext)_localctx).last, ((ArrayAccess_lfno_primaryContext)_localctx).name.ret, ((ArrayAccess_lfno_primaryContext)_localctx).i.ret);
				}
				}
				break;
			case 2:
				{
				{
				setState(3044);
				((ArrayAccess_lfno_primaryContext)_localctx).pno = primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(3045);
				match(LBRACK);
				setState(3046);
				((ArrayAccess_lfno_primaryContext)_localctx).i = expression();
				setState(3047);
				((ArrayAccess_lfno_primaryContext)_localctx).last = match(RBRACK);
				((ArrayAccess_lfno_primaryContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccess_lfno_primaryContext)_localctx).last, ((ArrayAccess_lfno_primaryContext)_localctx).pno.ret, ((ArrayAccess_lfno_primaryContext)_localctx).i.ret);
				}
				}
				break;
			}
			setState(3060);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3052);
					primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(3053);
					match(LBRACK);
					setState(3054);
					((ArrayAccess_lfno_primaryContext)_localctx).i2 = expression();
					setState(3055);
					((ArrayAccess_lfno_primaryContext)_localctx).last = match(RBRACK);
					((ArrayAccess_lfno_primaryContext)_localctx).ret =  new ArrayAccessExpression(((ArrayAccess_lfno_primaryContext)_localctx).last, _localctx.ret, ((ArrayAccess_lfno_primaryContext)_localctx).i2.ret);
					}
					} 
				}
				setState(3062);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
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
			setState(3141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3063);
				((MethodInvocationContext)_localctx).mn = match(Identifier);
				setState(3064);
				match(LPAREN);
				setState(3068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3065);
					((MethodInvocationContext)_localctx).a = argumentList();
					((MethodInvocationContext)_localctx).args =  ((MethodInvocationContext)_localctx).a.ret;
					}
				}

				setState(3070);
				((MethodInvocationContext)_localctx).last = match(RPAREN);
				((MethodInvocationContext)_localctx).ret =  new CallExpression(((MethodInvocationContext)_localctx).last, ((MethodInvocationContext)_localctx).mn, _localctx.args);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3072);
				((MethodInvocationContext)_localctx).amb = ambiguousName(0);
				setState(3073);
				match(DOT);
				setState(3077);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3074);
					((MethodInvocationContext)_localctx).t = typeArguments();
					((MethodInvocationContext)_localctx).targs =  ((MethodInvocationContext)_localctx).t.ret;
					}
				}

				setState(3079);
				((MethodInvocationContext)_localctx).id = match(Identifier);
				setState(3080);
				match(LPAREN);
				setState(3084);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3081);
					((MethodInvocationContext)_localctx).a = argumentList();
					((MethodInvocationContext)_localctx).args =  ((MethodInvocationContext)_localctx).a.ret;
					}
				}

				setState(3086);
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
				setState(3089);
				((MethodInvocationContext)_localctx).p = primary();
				setState(3090);
				match(DOT);
				setState(3094);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3091);
					((MethodInvocationContext)_localctx).t = typeArguments();
					((MethodInvocationContext)_localctx).targs =  ((MethodInvocationContext)_localctx).t.ret;
					}
				}

				setState(3096);
				((MethodInvocationContext)_localctx).id = match(Identifier);
				setState(3097);
				match(LPAREN);
				setState(3101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3098);
					((MethodInvocationContext)_localctx).a = argumentList();
					((MethodInvocationContext)_localctx).args =  ((MethodInvocationContext)_localctx).a.ret;
					}
				}

				setState(3103);
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
				setState(3106);
				((MethodInvocationContext)_localctx).kw = match(SUPER);
				setState(3107);
				match(DOT);
				setState(3111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3108);
					((MethodInvocationContext)_localctx).t = typeArguments();
					((MethodInvocationContext)_localctx).targs =  ((MethodInvocationContext)_localctx).t.ret;
					}
				}

				setState(3113);
				((MethodInvocationContext)_localctx).id = match(Identifier);
				setState(3114);
				match(LPAREN);
				setState(3118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3115);
					((MethodInvocationContext)_localctx).a = argumentList();
					((MethodInvocationContext)_localctx).args =  ((MethodInvocationContext)_localctx).a.ret;
					}
				}

				setState(3120);
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
				setState(3122);
				((MethodInvocationContext)_localctx).tn = typeName();
				setState(3123);
				match(DOT);
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3133);
					((MethodInvocationContext)_localctx).a = argumentList();
					((MethodInvocationContext)_localctx).args =  ((MethodInvocationContext)_localctx).a.ret;
					}
				}

				setState(3138);
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
			setState(3143);
			match(DOT);
			setState(3147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(3144);
				((MethodInvocation_lf_primaryContext)_localctx).t = typeArguments();
				((MethodInvocation_lf_primaryContext)_localctx).targs =  ((MethodInvocation_lf_primaryContext)_localctx).t.ret;
				}
			}

			setState(3149);
			((MethodInvocation_lf_primaryContext)_localctx).id = match(Identifier);
			setState(3150);
			match(LPAREN);
			setState(3154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
				{
				setState(3151);
				((MethodInvocation_lf_primaryContext)_localctx).a = argumentList();
				((MethodInvocation_lf_primaryContext)_localctx).args =  ((MethodInvocation_lf_primaryContext)_localctx).a.ret;
				}
			}

			setState(3156);
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
			setState(3220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3159);
				((MethodInvocation_lfno_primaryContext)_localctx).mn = match(Identifier);
				setState(3160);
				match(LPAREN);
				setState(3164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3161);
					((MethodInvocation_lfno_primaryContext)_localctx).a = argumentList();
					((MethodInvocation_lfno_primaryContext)_localctx).args =  ((MethodInvocation_lfno_primaryContext)_localctx).a.ret;
					}
				}

				setState(3166);
				((MethodInvocation_lfno_primaryContext)_localctx).last = match(RPAREN);
				((MethodInvocation_lfno_primaryContext)_localctx).ret =  new CallExpression(((MethodInvocation_lfno_primaryContext)_localctx).last, ((MethodInvocation_lfno_primaryContext)_localctx).mn, _localctx.args);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3168);
				((MethodInvocation_lfno_primaryContext)_localctx).amb = ambiguousName(0);
				setState(3169);
				match(DOT);
				setState(3173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3170);
					((MethodInvocation_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodInvocation_lfno_primaryContext)_localctx).targs =  ((MethodInvocation_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3175);
				((MethodInvocation_lfno_primaryContext)_localctx).id = match(Identifier);
				setState(3176);
				match(LPAREN);
				setState(3180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3177);
					((MethodInvocation_lfno_primaryContext)_localctx).a = argumentList();
					((MethodInvocation_lfno_primaryContext)_localctx).args =  ((MethodInvocation_lfno_primaryContext)_localctx).a.ret;
					}
				}

				setState(3182);
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
				setState(3185);
				((MethodInvocation_lfno_primaryContext)_localctx).kw = match(SUPER);
				setState(3186);
				match(DOT);
				setState(3190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3187);
					((MethodInvocation_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodInvocation_lfno_primaryContext)_localctx).targs =  ((MethodInvocation_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3192);
				((MethodInvocation_lfno_primaryContext)_localctx).id = match(Identifier);
				setState(3193);
				match(LPAREN);
				setState(3197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3194);
					((MethodInvocation_lfno_primaryContext)_localctx).a = argumentList();
					((MethodInvocation_lfno_primaryContext)_localctx).args =  ((MethodInvocation_lfno_primaryContext)_localctx).a.ret;
					}
				}

				setState(3199);
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
				setState(3201);
				((MethodInvocation_lfno_primaryContext)_localctx).tn = typeName();
				setState(3202);
				match(DOT);
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
					setState(3212);
					((MethodInvocation_lfno_primaryContext)_localctx).a = argumentList();
					((MethodInvocation_lfno_primaryContext)_localctx).args =  ((MethodInvocation_lfno_primaryContext)_localctx).a.ret;
					}
				}

				setState(3217);
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
			setState(3222);
			((ArgumentListContext)_localctx).e = expression();
			_localctx.ls.add(((ArgumentListContext)_localctx).e.ret);
			}
			setState(3231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3225);
				match(COMMA);
				setState(3226);
				((ArgumentListContext)_localctx).ex = expression();
				_localctx.ls.add(((ArgumentListContext)_localctx).ex.ret);
				}
				}
				setState(3233);
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
			setState(3302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3236);
				((MethodReferenceContext)_localctx).en = expressionName();
				setState(3237);
				match(COLONCOLON);
				setState(3241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3238);
					((MethodReferenceContext)_localctx).t = typeArguments();
					((MethodReferenceContext)_localctx).targs =  ((MethodReferenceContext)_localctx).t.ret;
					}
				}

				setState(3243);
				((MethodReferenceContext)_localctx).id = match(Identifier);

				            ((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(((MethodReferenceContext)_localctx).en.ret,
				                                                 createMethodName(((MethodReferenceContext)_localctx).id),
				                                                 _localctx.targs);
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3246);
				((MethodReferenceContext)_localctx).r = referenceType();
				setState(3247);
				match(COLONCOLON);
				setState(3251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3248);
					((MethodReferenceContext)_localctx).t = typeArguments();
					((MethodReferenceContext)_localctx).targs =  ((MethodReferenceContext)_localctx).t.ret;
					}
				}

				setState(3253);
				((MethodReferenceContext)_localctx).id = match(Identifier);

				            ((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(((MethodReferenceContext)_localctx).r.ret,
				                                                 createMethodName(((MethodReferenceContext)_localctx).id),
				                                                 _localctx.targs);
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3256);
				((MethodReferenceContext)_localctx).p = primary();
				setState(3257);
				match(COLONCOLON);
				setState(3261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3258);
					((MethodReferenceContext)_localctx).t = typeArguments();
					((MethodReferenceContext)_localctx).targs =  ((MethodReferenceContext)_localctx).t.ret;
					}
				}

				setState(3263);
				((MethodReferenceContext)_localctx).id = match(Identifier);

				            ((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(((MethodReferenceContext)_localctx).p.ret,
				                                                 createMethodName(((MethodReferenceContext)_localctx).id),
				                                                 _localctx.targs);
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3266);
				((MethodReferenceContext)_localctx).kw = match(SUPER);
				setState(3267);
				match(COLONCOLON);
				setState(3271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3268);
					((MethodReferenceContext)_localctx).t = typeArguments();
					((MethodReferenceContext)_localctx).targs =  ((MethodReferenceContext)_localctx).t.ret;
					}
				}

				setState(3273);
				((MethodReferenceContext)_localctx).id = match(Identifier);

				            ((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(createTypeName(((MethodReferenceContext)_localctx).kw),
				                                                 createMethodName(((MethodReferenceContext)_localctx).id),
				                                                 _localctx.targs);
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3275);
				((MethodReferenceContext)_localctx).tn = typeName();
				setState(3276);
				match(DOT);
				setState(3277);
				((MethodReferenceContext)_localctx).kw = match(SUPER);
				setState(3278);
				match(COLONCOLON);
				setState(3282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3279);
					((MethodReferenceContext)_localctx).t = typeArguments();
					((MethodReferenceContext)_localctx).targs =  ((MethodReferenceContext)_localctx).t.ret;
					}
				}

				setState(3284);
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
				setState(3287);
				((MethodReferenceContext)_localctx).c = classType();
				setState(3288);
				match(COLONCOLON);
				setState(3292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3289);
					((MethodReferenceContext)_localctx).t = typeArguments();
					((MethodReferenceContext)_localctx).targs =  ((MethodReferenceContext)_localctx).t.ret;
					}
				}

				setState(3294);
				((MethodReferenceContext)_localctx).kw = match(NEW);

				            ((MethodReferenceContext)_localctx).ret =  new MethodReferenceExpression(((MethodReferenceContext)_localctx).c.ret,
				                                                 createMethodName(((MethodReferenceContext)_localctx).kw),
				                                                 _localctx.targs);
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3297);
				((MethodReferenceContext)_localctx).a = arrayType();
				setState(3298);
				match(COLONCOLON);
				setState(3299);
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
			setState(3304);
			match(COLONCOLON);
			setState(3308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(3305);
				((MethodReference_lf_primaryContext)_localctx).t = typeArguments();
				((MethodReference_lf_primaryContext)_localctx).targs =  ((MethodReference_lf_primaryContext)_localctx).t.ret;
				}
			}

			setState(3310);
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
			setState(3369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3313);
				((MethodReference_lfno_primaryContext)_localctx).en = expressionName();
				setState(3314);
				match(COLONCOLON);
				setState(3318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3315);
					((MethodReference_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodReference_lfno_primaryContext)_localctx).targs =  ((MethodReference_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3320);
				((MethodReference_lfno_primaryContext)_localctx).id = match(Identifier);

				            ((MethodReference_lfno_primaryContext)_localctx).ret =  new MethodReferenceExpression(((MethodReference_lfno_primaryContext)_localctx).en.ret,
				                                                 createMethodName(((MethodReference_lfno_primaryContext)_localctx).id),
				                                                 _localctx.targs);
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3323);
				((MethodReference_lfno_primaryContext)_localctx).r = referenceType();
				setState(3324);
				match(COLONCOLON);
				setState(3328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3325);
					((MethodReference_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodReference_lfno_primaryContext)_localctx).targs =  ((MethodReference_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3330);
				((MethodReference_lfno_primaryContext)_localctx).id = match(Identifier);

				            ((MethodReference_lfno_primaryContext)_localctx).ret =  new MethodReferenceExpression(((MethodReference_lfno_primaryContext)_localctx).r.ret,
				                                                 createMethodName(((MethodReference_lfno_primaryContext)_localctx).id),
				                                                 _localctx.targs);
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3333);
				((MethodReference_lfno_primaryContext)_localctx).kw = match(SUPER);
				setState(3334);
				match(COLONCOLON);
				setState(3338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3335);
					((MethodReference_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodReference_lfno_primaryContext)_localctx).targs =  ((MethodReference_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3340);
				((MethodReference_lfno_primaryContext)_localctx).id = match(Identifier);

				            ((MethodReference_lfno_primaryContext)_localctx).ret =  new MethodReferenceExpression(createTypeName(((MethodReference_lfno_primaryContext)_localctx).kw),
				                                                 createMethodName(((MethodReference_lfno_primaryContext)_localctx).id),
				                                                 _localctx.targs);
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3342);
				((MethodReference_lfno_primaryContext)_localctx).tn = typeName();
				setState(3343);
				match(DOT);
				setState(3344);
				((MethodReference_lfno_primaryContext)_localctx).kw = match(SUPER);
				setState(3345);
				match(COLONCOLON);
				setState(3349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3346);
					((MethodReference_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodReference_lfno_primaryContext)_localctx).targs =  ((MethodReference_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3351);
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
				setState(3354);
				((MethodReference_lfno_primaryContext)_localctx).c = classType();
				setState(3355);
				match(COLONCOLON);
				setState(3359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(3356);
					((MethodReference_lfno_primaryContext)_localctx).t = typeArguments();
					((MethodReference_lfno_primaryContext)_localctx).targs =  ((MethodReference_lfno_primaryContext)_localctx).t.ret;
					}
				}

				setState(3361);
				((MethodReference_lfno_primaryContext)_localctx).kw = match(NEW);

				            ((MethodReference_lfno_primaryContext)_localctx).ret =  new MethodReferenceExpression(((MethodReference_lfno_primaryContext)_localctx).c.ret,
				                                                 createMethodName(((MethodReference_lfno_primaryContext)_localctx).kw),
				                                                 _localctx.targs);
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3364);
				((MethodReference_lfno_primaryContext)_localctx).a = arrayType();
				setState(3365);
				match(COLONCOLON);
				setState(3366);
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
			setState(3403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3371);
				((ArrayCreationExpressionContext)_localctx).kw = match(NEW);
				setState(3372);
				((ArrayCreationExpressionContext)_localctx).p = primitiveType();
				setState(3373);
				((ArrayCreationExpressionContext)_localctx).de = dimExprs();
				setState(3377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(3374);
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
				setState(3381);
				((ArrayCreationExpressionContext)_localctx).kw = match(NEW);
				setState(3382);
				((ArrayCreationExpressionContext)_localctx).c = classOrInterfaceType();
				setState(3383);
				((ArrayCreationExpressionContext)_localctx).de = dimExprs();
				setState(3387);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(3384);
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
				setState(3391);
				((ArrayCreationExpressionContext)_localctx).kw = match(NEW);
				setState(3392);
				((ArrayCreationExpressionContext)_localctx).p = primitiveType();
				setState(3393);
				((ArrayCreationExpressionContext)_localctx).d = dims();
				setState(3394);
				((ArrayCreationExpressionContext)_localctx).i = arrayInitializer();
				((ArrayCreationExpressionContext)_localctx).ret =  new ArrayConstruction(((ArrayCreationExpressionContext)_localctx).kw, ((ArrayCreationExpressionContext)_localctx).p.ret, ((ArrayCreationExpressionContext)_localctx).d.ret, ((ArrayCreationExpressionContext)_localctx).i.ret);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3397);
				((ArrayCreationExpressionContext)_localctx).kw = match(NEW);
				setState(3398);
				((ArrayCreationExpressionContext)_localctx).c = classOrInterfaceType();
				setState(3399);
				((ArrayCreationExpressionContext)_localctx).d = dims();
				setState(3400);
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
			setState(3405);
			((DimExprsContext)_localctx).d1 = dimExpr();
			((DimExprsContext)_localctx).ret =  new ArrayList<>(); _localctx.ret.add(((DimExprsContext)_localctx).d1.ret);
			setState(3412);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,293,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3407);
					((DimExprsContext)_localctx).d = dimExpr();
					_localctx.ret.add(((DimExprsContext)_localctx).d.ret);
					}
					} 
				}
				setState(3414);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,293,_ctx);
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
			setState(3420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(3415);
				((DimExprContext)_localctx).a = annotation();
				_localctx.ans.add(((DimExprContext)_localctx).a.ret);
				}
				}
				setState(3422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3423);
			((DimExprContext)_localctx).first = match(LBRACK);
			setState(3424);
			((DimExprContext)_localctx).ex = expression();
			setState(3425);
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
			setState(3428);
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
			setState(3437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3431);
				((ExpressionContext)_localctx).l = lambdaExpression();
				((ExpressionContext)_localctx).ret =  ((ExpressionContext)_localctx).l.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3434);
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
			setState(3439);
			((LambdaExpressionContext)_localctx).p = lambdaParameters();
			setState(3440);
			match(ARROW);
			setState(3441);
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
			setState(3459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3444);
				((LambdaParametersContext)_localctx).id = match(Identifier);

				            _localctx.vars.add(new VariableDeclaration(((LambdaParametersContext)_localctx).id));
				            ((LambdaParametersContext)_localctx).ret =  _localctx.vars;
				            ((LambdaParametersContext)_localctx).first =  ((LambdaParametersContext)_localctx).id;
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3446);
				((LambdaParametersContext)_localctx).f = match(LPAREN);
				setState(3450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
					{
					setState(3447);
					((LambdaParametersContext)_localctx).p = formalParameterList();
					((LambdaParametersContext)_localctx).ret =  ((LambdaParametersContext)_localctx).p.ret;
					}
				}

				setState(3452);
				match(RPAREN);
				((LambdaParametersContext)_localctx).first =  ((LambdaParametersContext)_localctx).f;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3454);
				((LambdaParametersContext)_localctx).f = match(LPAREN);
				setState(3455);
				((LambdaParametersContext)_localctx).i = inferredFormalParameterList();
				setState(3456);
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
			setState(3461);
			((InferredFormalParameterListContext)_localctx).id = match(Identifier);
			_localctx.vars.add(new VariableDeclaration(((InferredFormalParameterListContext)_localctx).id));
			}
			setState(3469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3464);
				match(COMMA);
				setState(3465);
				((InferredFormalParameterListContext)_localctx).i = match(Identifier);
				_localctx.vars.add(new VariableDeclaration(((InferredFormalParameterListContext)_localctx).i));
				}
				}
				setState(3471);
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
			setState(3480);
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
				setState(3474);
				((LambdaBodyContext)_localctx).e = expression();
				((LambdaBodyContext)_localctx).ret =  new Block(((LambdaBodyContext)_localctx).e.ret);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(3477);
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
			setState(3488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3482);
				((AssignmentExpressionContext)_localctx).c = conditionalExpression();
				((AssignmentExpressionContext)_localctx).ret =  ((AssignmentExpressionContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3485);
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
			setState(3490);
			((AssignmentContext)_localctx).l = leftHandSide();
			setState(3491);
			((AssignmentContext)_localctx).op = assignmentOperator();
			setState(3492);
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
			setState(3504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3495);
				((LeftHandSideContext)_localctx).n = expressionName();
				((LeftHandSideContext)_localctx).ret =  ((LeftHandSideContext)_localctx).n.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3498);
				((LeftHandSideContext)_localctx).f = fieldAccess();
				((LeftHandSideContext)_localctx).ret =  ((LeftHandSideContext)_localctx).f.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3501);
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
			setState(3530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(3506);
				match(ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  null;
				}
				break;
			case MUL_ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(3508);
				match(MUL_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  BinaryOperator.MULTIPLICATION;
				}
				break;
			case DIV_ASSIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(3510);
				match(DIV_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  BinaryOperator.DIVISION;
				}
				break;
			case MOD_ASSIGN:
				enterOuterAlt(_localctx, 4);
				{
				setState(3512);
				match(MOD_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  BinaryOperator.MODULUS;
				}
				break;
			case ADD_ASSIGN:
				enterOuterAlt(_localctx, 5);
				{
				setState(3514);
				match(ADD_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  BinaryOperator.ADDITION;
				}
				break;
			case SUB_ASSIGN:
				enterOuterAlt(_localctx, 6);
				{
				setState(3516);
				match(SUB_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  BinaryOperator.SUBTRACTION;
				}
				break;
			case LSHIFT_ASSIGN:
				enterOuterAlt(_localctx, 7);
				{
				setState(3518);
				match(LSHIFT_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  BinaryOperator.LEFT_SHIFT;
				}
				break;
			case RSHIFT_ASSIGN:
				enterOuterAlt(_localctx, 8);
				{
				setState(3520);
				match(RSHIFT_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  BinaryOperator.RIGHT_SHIFT;
				}
				break;
			case URSHIFT_ASSIGN:
				enterOuterAlt(_localctx, 9);
				{
				setState(3522);
				match(URSHIFT_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  BinaryOperator.RIGHT_LOGICAL_SHIFT;
				}
				break;
			case AND_ASSIGN:
				enterOuterAlt(_localctx, 10);
				{
				setState(3524);
				match(AND_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  BinaryOperator.BITWISE_AND;
				}
				break;
			case XOR_ASSIGN:
				enterOuterAlt(_localctx, 11);
				{
				setState(3526);
				match(XOR_ASSIGN);
				((AssignmentOperatorContext)_localctx).ret =  BinaryOperator.BITWISE_XOR;
				}
				break;
			case OR_ASSIGN:
				enterOuterAlt(_localctx, 12);
				{
				setState(3528);
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
			setState(3542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3532);
				((ConditionalExpressionContext)_localctx).c = conditionalOrExpression(0);
				((ConditionalExpressionContext)_localctx).ret =  ((ConditionalExpressionContext)_localctx).c.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3535);
				((ConditionalExpressionContext)_localctx).c = conditionalOrExpression(0);
				setState(3536);
				match(QUESTION);
				setState(3537);
				((ConditionalExpressionContext)_localctx).i = expression();
				setState(3538);
				match(COLON);
				setState(3539);
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
			setState(3545);
			((ConditionalOrExpressionContext)_localctx).c = conditionalAndExpression(0);
			((ConditionalOrExpressionContext)_localctx).ret =  ((ConditionalOrExpressionContext)_localctx).c.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3555);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
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
					setState(3548);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3549);
					match(OR);
					setState(3550);
					((ConditionalOrExpressionContext)_localctx).c2 = conditionalAndExpression(0);
					((ConditionalOrExpressionContext)_localctx).ret =  new BinaryExpression(((ConditionalOrExpressionContext)_localctx).c1.ret, BinaryOperator.OR, ((ConditionalOrExpressionContext)_localctx).c2.ret);
					}
					} 
				}
				setState(3557);
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
			setState(3559);
			((ConditionalAndExpressionContext)_localctx).i = inclusiveOrExpression(0);
			((ConditionalAndExpressionContext)_localctx).ret =  ((ConditionalAndExpressionContext)_localctx).i.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3569);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
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
					setState(3562);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3563);
					match(AND);
					setState(3564);
					((ConditionalAndExpressionContext)_localctx).r = inclusiveOrExpression(0);
					((ConditionalAndExpressionContext)_localctx).ret =  new BinaryExpression(((ConditionalAndExpressionContext)_localctx).l.ret, BinaryOperator.AND, ((ConditionalAndExpressionContext)_localctx).r.ret);
					}
					} 
				}
				setState(3571);
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
			setState(3573);
			((InclusiveOrExpressionContext)_localctx).ex = exclusiveOrExpression(0);
			((InclusiveOrExpressionContext)_localctx).ret =  ((InclusiveOrExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3583);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
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
					setState(3576);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3577);
					match(BITOR);
					setState(3578);
					((InclusiveOrExpressionContext)_localctx).r = exclusiveOrExpression(0);
					((InclusiveOrExpressionContext)_localctx).ret =  new BinaryExpression(((InclusiveOrExpressionContext)_localctx).l.ret,BinaryOperator.BITWISE_OR, ((InclusiveOrExpressionContext)_localctx).r.ret);
					}
					} 
				}
				setState(3585);
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
			setState(3587);
			((ExclusiveOrExpressionContext)_localctx).ex = andExpression(0);
			((ExclusiveOrExpressionContext)_localctx).ret =  ((ExclusiveOrExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3597);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
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
					setState(3590);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3591);
					match(CARET);
					setState(3592);
					((ExclusiveOrExpressionContext)_localctx).r = andExpression(0);
					((ExclusiveOrExpressionContext)_localctx).ret =  new BinaryExpression(((ExclusiveOrExpressionContext)_localctx).l.ret, BinaryOperator.BITWISE_XOR, ((ExclusiveOrExpressionContext)_localctx).r.ret);
					}
					} 
				}
				setState(3599);
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
			setState(3601);
			((AndExpressionContext)_localctx).ex = equalityExpression(0);
			((AndExpressionContext)_localctx).ret =  ((AndExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3611);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
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
					setState(3604);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(3605);
					match(BITAND);
					setState(3606);
					((AndExpressionContext)_localctx).r = equalityExpression(0);
					((AndExpressionContext)_localctx).ret =  new BinaryExpression(((AndExpressionContext)_localctx).l.ret, BinaryOperator.BITWISE_AND, ((AndExpressionContext)_localctx).r.ret);
					}
					} 
				}
				setState(3613);
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
			setState(3615);
			((EqualityExpressionContext)_localctx).ex = relationalExpression(0);
			((EqualityExpressionContext)_localctx).ret =  ((EqualityExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3630);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3628);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(3618);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3619);
						match(EQUAL);
						setState(3620);
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
						setState(3623);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3624);
						match(NOTEQUAL);
						setState(3625);
						((EqualityExpressionContext)_localctx).r = relationalExpression(0);
						((EqualityExpressionContext)_localctx).ret =  new BinaryExpression(((EqualityExpressionContext)_localctx).l.ret, BinaryOperator.INEQUALITY, ((EqualityExpressionContext)_localctx).r.ret);
						}
						break;
					}
					} 
				}
				setState(3632);
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
			setState(3634);
			((RelationalExpressionContext)_localctx).ex = shiftExpression(0);
			((RelationalExpressionContext)_localctx).ret =  ((RelationalExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3664);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3662);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(3637);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(3638);
						match(LT);
						setState(3639);
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
						setState(3642);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(3643);
						match(GT);
						setState(3644);
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
						setState(3647);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(3648);
						match(LE);
						setState(3649);
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
						setState(3652);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3653);
						match(GE);
						setState(3654);
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
						setState(3657);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3658);
						match(INSTANCEOF);
						setState(3659);
						((RelationalExpressionContext)_localctx).rt = referenceType();
						((RelationalExpressionContext)_localctx).ret =  new BinaryExpression(((RelationalExpressionContext)_localctx).l.ret, BinaryOperator.INSTANCE_OF, ((RelationalExpressionContext)_localctx).rt.ret);
						}
						break;
					}
					} 
				}
				setState(3666);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
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
			setState(3668);
			((ShiftExpressionContext)_localctx).ex = additiveExpression(0);
			((ShiftExpressionContext)_localctx).ret =  ((ShiftExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3692);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3690);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(3671);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(3672);
						match(LT);
						setState(3673);
						match(LT);
						setState(3674);
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
						setState(3677);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3678);
						match(GT);
						setState(3679);
						match(GT);
						setState(3680);
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
						setState(3683);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3684);
						match(GT);
						setState(3685);
						match(GT);
						setState(3686);
						match(GT);
						setState(3687);
						((ShiftExpressionContext)_localctx).r = additiveExpression(0);
						((ShiftExpressionContext)_localctx).ret =  new BinaryExpression(((ShiftExpressionContext)_localctx).l.ret, BinaryOperator.RIGHT_LOGICAL_SHIFT, ((ShiftExpressionContext)_localctx).r.ret);
						}
						break;
					}
					} 
				}
				setState(3694);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
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
			setState(3696);
			((AdditiveExpressionContext)_localctx).ex = multiplicativeExpression(0);
			((AdditiveExpressionContext)_localctx).ret =  ((AdditiveExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3711);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3709);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(3699);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3700);
						match(ADD);
						setState(3701);
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
						setState(3704);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3705);
						match(SUB);
						setState(3706);
						((AdditiveExpressionContext)_localctx).r = multiplicativeExpression(0);
						((AdditiveExpressionContext)_localctx).ret =  new BinaryExpression(((AdditiveExpressionContext)_localctx).l.ret, BinaryOperator.SUBTRACTION, ((AdditiveExpressionContext)_localctx).r.ret);
						}
						break;
					}
					} 
				}
				setState(3713);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
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
			setState(3715);
			((MultiplicativeExpressionContext)_localctx).ex = unaryExpression();
			((MultiplicativeExpressionContext)_localctx).ret =  ((MultiplicativeExpressionContext)_localctx).ex.ret;
			}
			_ctx.stop = _input.LT(-1);
			setState(3735);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3733);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(3718);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(3719);
						match(MUL);
						setState(3720);
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
						setState(3723);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3724);
						match(DIV);
						setState(3725);
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
						setState(3728);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3729);
						match(MOD);
						setState(3730);
						((MultiplicativeExpressionContext)_localctx).r = unaryExpression();
						((MultiplicativeExpressionContext)_localctx).ret =  new BinaryExpression(((MultiplicativeExpressionContext)_localctx).l.ret, BinaryOperator.MODULUS, ((MultiplicativeExpressionContext)_localctx).r.ret);
						}
						break;
					}
					} 
				}
				setState(3737);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
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
			setState(3755);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(3738);
				((UnaryExpressionContext)_localctx).pi = preIncrementExpression();
				((UnaryExpressionContext)_localctx).ret =  ((UnaryExpressionContext)_localctx).pi.ret;
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(3741);
				((UnaryExpressionContext)_localctx).pd = preDecrementExpression();
				((UnaryExpressionContext)_localctx).ret =  ((UnaryExpressionContext)_localctx).pd.ret;
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(3744);
				((UnaryExpressionContext)_localctx).first = match(ADD);
				setState(3745);
				((UnaryExpressionContext)_localctx).ex = unaryExpression();
				((UnaryExpressionContext)_localctx).ret =  new UnaryExpression(((UnaryExpressionContext)_localctx).first, ((UnaryExpressionContext)_localctx).ex.ret, UnaryOperator.PLUS);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(3748);
				((UnaryExpressionContext)_localctx).first = match(SUB);
				setState(3749);
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
				setState(3752);
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
			setState(3757);
			((PreIncrementExpressionContext)_localctx).first = match(INC);
			setState(3758);
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
			setState(3761);
			((PreDecrementExpressionContext)_localctx).first = match(DEC);
			setState(3762);
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
			setState(3779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3765);
				((UnaryExpressionNotPlusMinusContext)_localctx).pf = postfixExpression();
				((UnaryExpressionNotPlusMinusContext)_localctx).ret =  ((UnaryExpressionNotPlusMinusContext)_localctx).pf.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3768);
				((UnaryExpressionNotPlusMinusContext)_localctx).first = match(TILDE);
				setState(3769);
				((UnaryExpressionNotPlusMinusContext)_localctx).ex = unaryExpression();
				((UnaryExpressionNotPlusMinusContext)_localctx).ret =  new UnaryExpression(((UnaryExpressionNotPlusMinusContext)_localctx).first,
				                                    ((UnaryExpressionNotPlusMinusContext)_localctx).ex.ret,
				                                    UnaryOperator.BITWISE_NEGATION);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3772);
				((UnaryExpressionNotPlusMinusContext)_localctx).first = match(BANG);
				setState(3773);
				((UnaryExpressionNotPlusMinusContext)_localctx).ex = unaryExpression();
				((UnaryExpressionNotPlusMinusContext)_localctx).ret =  new UnaryExpression(((UnaryExpressionNotPlusMinusContext)_localctx).first, ((UnaryExpressionNotPlusMinusContext)_localctx).ex.ret, UnaryOperator.NEGATION);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3776);
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
			setState(3787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
			case 1:
				{
				setState(3781);
				((PostfixExpressionContext)_localctx).p = primary();
				((PostfixExpressionContext)_localctx).ret =  ((PostfixExpressionContext)_localctx).p.ret;
				}
				break;
			case 2:
				{
				setState(3784);
				((PostfixExpressionContext)_localctx).n = expressionName();
				((PostfixExpressionContext)_localctx).ret =  ((PostfixExpressionContext)_localctx).n.ret;
				}
				break;
			}
			setState(3795);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,323,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(3793);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(3789);
						((PostfixExpressionContext)_localctx).op1 = match(INC);
						((PostfixExpressionContext)_localctx).ret =  new UnaryExpression(((PostfixExpressionContext)_localctx).op1, _localctx.ret, UnaryOperator.INCREMENT);
						}
						break;
					case DEC:
						{
						setState(3791);
						((PostfixExpressionContext)_localctx).op2 = match(DEC);
						((PostfixExpressionContext)_localctx).ret =  new UnaryExpression(((PostfixExpressionContext)_localctx).op2, _localctx.ret, UnaryOperator.DECREMENT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(3797);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,323,_ctx);
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
			setState(3798);
			((PostIncrementExpressionContext)_localctx).ex = postfixExpression();
			setState(3799);
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
			setState(3802);
			((PostDecrementExpressionContext)_localctx).ex = postfixExpression();
			setState(3803);
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
			setState(3840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3806);
				((CastExpressionContext)_localctx).first = match(LPAREN);
				setState(3807);
				((CastExpressionContext)_localctx).pt = primitiveType();
				setState(3808);
				match(RPAREN);
				setState(3809);
				((CastExpressionContext)_localctx).uex = unaryExpression();
				((CastExpressionContext)_localctx).ret =  new CastExpression(((CastExpressionContext)_localctx).first, ((CastExpressionContext)_localctx).uex.ret, ((CastExpressionContext)_localctx).pt.ret);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3812);
				((CastExpressionContext)_localctx).first = match(LPAREN);
				setState(3813);
				((CastExpressionContext)_localctx).rt = referenceType();
				setState(3819);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(3814);
					((CastExpressionContext)_localctx).b = additionalBound();
					_localctx.ls.add(((CastExpressionContext)_localctx).b.ret);
					}
					}
					setState(3821);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3822);
				match(RPAREN);
				setState(3823);
				((CastExpressionContext)_localctx).npm = unaryExpressionNotPlusMinus();
				((CastExpressionContext)_localctx).ret =  new CastExpression(((CastExpressionContext)_localctx).first, ((CastExpressionContext)_localctx).npm.ret, ((CastExpressionContext)_localctx).rt.ret, _localctx.ls);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3826);
				((CastExpressionContext)_localctx).first = match(LPAREN);
				setState(3827);
				((CastExpressionContext)_localctx).rt = referenceType();
				setState(3833);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(3828);
					((CastExpressionContext)_localctx).b = additionalBound();
					_localctx.ls.add(((CastExpressionContext)_localctx).b.ret);
					}
					}
					setState(3835);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3836);
				match(RPAREN);
				setState(3837);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3m\u0f05\4\2\t\2\4"+
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
		"\2\5\2\u01cd\n\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u01d5\n\3\3\4\3\4\3\4\7\4"+
		"\u01da\n\4\f\4\16\4\u01dd\13\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u01e5\n\4\f"+
		"\4\16\4\u01e8\13\4\3\4\3\4\5\4\u01ec\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u01f4"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0200\n\6\3\7\3\7\3\7"+
		"\3\7\5\7\u0206\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0211\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\7\t\u0219\n\t\f\t\16\t\u021c\13\t\3\n\3\n\3\n\7"+
		"\n\u0221\n\n\f\n\16\n\u0224\13\n\3\n\3\n\3\n\3\n\3\n\5\n\u022b\n\n\3\n"+
		"\3\n\3\n\3\n\3\n\7\n\u0232\n\n\f\n\16\n\u0235\13\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u023c\n\n\5\n\u023e\n\n\3\13\3\13\3\13\7\13\u0243\n\13\f\13\16\13"+
		"\u0246\13\13\3\13\3\13\3\13\3\13\3\13\5\13\u024d\n\13\3\f\3\f\3\f\7\f"+
		"\u0252\n\f\f\f\16\f\u0255\13\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u0266\n\r\3\16\3\16\3\16\7\16\u026b\n\16\f\16"+
		"\16\16\u026e\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0277\n\16"+
		"\f\16\16\16\u027a\13\16\3\16\3\16\3\16\7\16\u027f\n\16\f\16\16\16\u0282"+
		"\13\16\3\16\3\16\3\17\3\17\3\17\7\17\u0289\n\17\f\17\16\17\u028c\13\17"+
		"\3\17\3\17\3\17\3\17\5\17\u0292\n\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u02a3\n\21\f\21\16\21\u02a6"+
		"\13\21\3\21\3\21\5\21\u02aa\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u02bb\n\24\f\24\16\24\u02be"+
		"\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u02c8\n\25\3\26\3"+
		"\26\3\26\7\26\u02cd\n\26\f\26\16\26\u02d0\13\26\3\26\3\26\3\26\5\26\u02d5"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u02df\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u02e8\n\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\7\31\u02f2\n\31\f\31\16\31\u02f5\13\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u02fe\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\7\33\u0308\n\33\f\33\16\33\u030b\13\33\3\34\3\34\3\34\5\34\u0310\n\34"+
		"\3\34\3\34\3\34\7\34\u0315\n\34\f\34\16\34\u0318\13\34\3\34\3\34\3\34"+
		"\7\34\u031d\n\34\f\34\16\34\u0320\13\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\7\35\u0328\n\35\f\35\16\35\u032b\13\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\7\35\u0334\n\35\f\35\16\35\u0337\13\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u034b\n\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\5$\u0370\n$\3"+
		"%\3%\3%\3%\3%\3%\5%\u0378\n%\3&\3&\3&\3&\3&\3&\7&\u0380\n&\f&\16&\u0383"+
		"\13&\3&\3&\3&\3&\3&\3&\5&\u038b\n&\3&\3&\3&\5&\u0390\n&\3&\3&\3&\5&\u0395"+
		"\n&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5"+
		"\'\u03a8\n\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\7)\u03b6\n)\f)\16)\u03b9"+
		"\13)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\7,\u03cc\n,\f"+
		",\16,\u03cf\13,\3,\3,\3-\3-\7-\u03d5\n-\f-\16-\u03d8\13-\3-\3-\3-\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\5.\u03e7\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\5/\u03f4\n/\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u03fc\n\60\f\60\16\60"+
		"\u03ff\13\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0414\n\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\7\62\u041d\n\62\f\62\16\62\u0420\13\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u042a\n\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\64\5\64\u0433\n\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\5\66\u0441\n\66\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0449"+
		"\n\67\38\38\38\38\38\58\u0450\n8\39\39\39\39\39\39\39\39\39\59\u045b\n"+
		"9\3:\3:\3:\3:\3:\3:\3:\7:\u0464\n:\f:\16:\u0467\13:\3;\3;\3;\3;\3;\3;"+
		"\3;\3;\5;\u0471\n;\3<\3<\3<\3<\3<\5<\u0478\n<\3=\3=\3=\3>\3>\3>\3>\3>"+
		"\3>\3>\3>\3>\3>\3>\3>\5>\u0489\n>\3?\3?\3?\3?\3?\3?\7?\u0491\n?\f?\16"+
		"?\u0494\13?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\5@\u04ae\n@\3A\3A\3A\3A\3A\3A\5A\u04b6\nA\3A\3A\3A\3A\3"+
		"A\7A\u04bd\nA\fA\16A\u04c0\13A\3A\3A\3A\3A\3A\3A\3A\5A\u04c9\nA\5A\u04cb"+
		"\nA\3B\3B\3B\3B\3B\5B\u04d2\nB\3C\3C\3C\3C\3C\3C\5C\u04da\nC\3C\3C\3C"+
		"\3C\5C\u04e0\nC\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u04f0\nD"+
		"\3E\3E\3E\3E\3E\3E\3E\7E\u04f9\nE\fE\16E\u04fc\13E\3E\3E\3E\3E\3E\3E\3"+
		"E\3E\3E\7E\u0507\nE\fE\16E\u050a\13E\3E\3E\5E\u050e\nE\3F\3F\3F\3F\3F"+
		"\3F\7F\u0516\nF\fF\16F\u0519\13F\3F\3F\3F\3F\3G\3G\3G\3H\3H\3H\3H\3H\3"+
		"H\7H\u0528\nH\fH\16H\u052b\13H\3H\3H\3H\3H\7H\u0531\nH\fH\16H\u0534\13"+
		"H\3H\3H\3H\3H\3H\3H\3H\5H\u053d\nH\3I\3I\3I\7I\u0542\nI\fI\16I\u0545\13"+
		"I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\7K\u0558\nK\fK\16"+
		"K\u055b\13K\3K\3K\3L\3L\3L\3L\3L\3L\5L\u0565\nL\3M\3M\3M\3M\3M\5M\u056c"+
		"\nM\3N\3N\3N\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\7P\u057b\nP\fP\16P\u057e\13"+
		"P\3P\3P\3P\3P\3P\3P\5P\u0586\nP\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u0591\n"+
		"Q\3R\3R\3R\5R\u0596\nR\3R\3R\3R\3R\3R\3R\5R\u059e\nR\3R\3R\3S\3S\3S\3"+
		"S\3S\5S\u05a7\nS\3S\3S\3S\5S\u05ac\nS\3S\3S\3S\3T\3T\3T\5T\u05b4\nT\3"+
		"T\3T\3T\3T\3T\5T\u05bb\nT\3T\3T\3T\3T\3T\3T\5T\u05c3\nT\3T\3T\3T\3T\3"+
		"T\5T\u05ca\nT\3T\3T\3T\3T\3T\3T\3T\3T\5T\u05d4\nT\3T\3T\3T\3T\3T\5T\u05db"+
		"\nT\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u05e6\nT\3T\3T\3T\3T\3T\5T\u05ed\nT"+
		"\3T\3T\3T\3T\5T\u05f3\nT\3U\3U\3U\3U\3U\3U\7U\u05fb\nU\fU\16U\u05fe\13"+
		"U\3U\3U\3U\3U\3U\5U\u0605\nU\3U\3U\3U\3V\3V\5V\u060c\nV\3V\5V\u060f\n"+
		"V\3V\5V\u0612\nV\3V\3V\3V\3W\3W\3W\7W\u061a\nW\fW\16W\u061d\13W\3X\3X"+
		"\3X\7X\u0622\nX\fX\16X\u0625\13X\3X\3X\3X\3X\3X\5X\u062c\nX\3X\5X\u062f"+
		"\nX\3X\3X\5X\u0633\nX\3Y\3Y\7Y\u0637\nY\fY\16Y\u063a\13Y\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\5Z\u0642\nZ\3[\3[\3[\3[\3[\3[\7[\u064a\n[\f[\16[\u064d\13[\3[\3["+
		"\3[\3[\3[\3[\5[\u0655\n[\3[\3[\3[\5[\u065a\n[\3[\3[\3[\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u066b\n\\\3]\3]\3]\3]\3^\3^\7^\u0673"+
		"\n^\f^\16^\u0676\13^\3^\3^\3^\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u0686"+
		"\n_\3`\3`\3`\3`\3`\3`\7`\u068e\n`\f`\16`\u0691\13`\3`\3`\3`\3`\3`\3a\3"+
		"a\3a\3a\3a\3a\5a\u069e\na\3b\3b\3b\3b\3b\3b\7b\u06a6\nb\fb\16b\u06a9\13"+
		"b\3b\3b\3b\3b\3b\3b\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u06bb\nc\3d\3d\3"+
		"d\3d\3d\3d\7d\u06c3\nd\fd\16d\u06c6\13d\3d\3d\3d\3d\3d\3d\3e\3e\7e\u06d0"+
		"\ne\fe\16e\u06d3\13e\3e\3e\3e\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u06e3"+
		"\nf\3g\3g\3g\3g\3g\3g\7g\u06eb\ng\fg\16g\u06ee\13g\3g\3g\3g\3g\3g\3g\3"+
		"g\3g\5g\u06f8\ng\3g\3g\3g\5g\u06fd\ng\3g\3g\3g\3h\3h\3h\3h\5h\u0706\n"+
		"h\3i\3i\3i\3i\3j\3j\3j\3j\3j\3j\3j\3j\3j\5j\u0715\nj\3k\3k\3k\3k\3k\5"+
		"k\u071c\nk\3k\3k\3k\3l\3l\3l\7l\u0724\nl\fl\16l\u0727\13l\3m\3m\3m\3m"+
		"\3m\3n\3n\3n\3n\3n\3n\3n\3n\3n\5n\u0737\nn\3o\3o\3o\3o\5o\u073d\no\3o"+
		"\5o\u0740\no\3o\3o\3o\3p\3p\3p\3p\3p\3p\3p\7p\u074c\np\fp\16p\u074f\13"+
		"p\3p\3p\3q\3q\3q\3q\3r\3r\3r\3r\3r\3r\3r\3s\3s\3s\3s\5s\u0762\ns\3s\5"+
		"s\u0765\ns\3s\3s\3s\3t\3t\3t\3t\3t\3t\3t\7t\u0771\nt\ft\16t\u0774\13t"+
		"\3t\3t\3u\3u\3u\3u\3u\5u\u077d\nu\3u\3u\3u\3v\3v\3v\3v\3v\3v\7v\u0788"+
		"\nv\fv\16v\u078b\13v\3v\3v\3w\3w\3w\3w\3w\3w\3w\3w\3w\5w\u0798\nw\3x\3"+
		"x\3x\3x\3y\3y\3y\3y\3y\3y\7y\u07a4\ny\fy\16y\u07a7\13y\3y\3y\3y\3y\3z"+
		"\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\5z\u07bf\nz\3{\3{"+
		"\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\5{\u07d0\n{\3|\3|\3|\3|\3|\3|"+
		"\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|"+
		"\3|\3|\3|\3|\3|\3|\3|\5|\u07f6\n|\3}\3}\3}\3~\3~\3~\3~\3~\3\177\3\177"+
		"\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\5\u0081\u081e\n\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u0845\n\u0085\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\7\u0087\u0852\n\u0087\f\u0087\16\u0087\u0855\13\u0087\3\u0087\3\u0087"+
		"\3\u0087\7\u0087\u085a\n\u0087\f\u0087\16\u0087\u085d\13\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\7\u0089\u086d\n\u0089\f\u0089\16\u0089"+
		"\u0870\13\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u0880"+
		"\n\u008a\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\5\u008e\u089f\n\u008e\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\5\u008f\u08a7\n\u008f\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\5\u0090\u08ae\n\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\5\u0090\u08b4\n\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u08ba\n"+
		"\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\5\u0091\u08c5\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091"+
		"\u08cb\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u08d1\n\u0091\3"+
		"\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\5\u0092\u08dd\n\u0092\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\7\u0094\u08e9\n\u0094\f\u0094"+
		"\16\u0094\u08ec\13\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\7\u0095\u08f8\n\u0095\f\u0095\16\u0095"+
		"\u08fb\13\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\7\u0096"+
		"\u090c\n\u0096\f\u0096\16\u0096\u090f\13\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\5\u0097\u091b"+
		"\n\u0097\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\5\u0098\u0923"+
		"\n\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\5\u0099\u0930\n\u0099\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\5\u009c\u0948\n\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\5\u009c\u0950\n\u009c\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\7\u009d\u0957\n\u009d\f\u009d\16\u009d\u095a\13\u009d\3\u009d\3\u009d"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\7\u009f\u096c\n\u009f\f\u009f"+
		"\16\u009f\u096f\13\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\7\u00a0\u097c\n\u00a0\f\u00a0"+
		"\16\u00a0\u097f\13\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u098b\n\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\5\u00a2\u0990\n\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\5\u00a3\u0998\n\u00a3\3\u00a3\3\u00a3\5\u00a3\u099c\n\u00a3\3"+
		"\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\7\u00a4"+
		"\u09a6\n\u00a4\f\u00a4\16\u00a4\u09a9\13\u00a4\3\u00a4\3\u00a4\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\7\u00a5\u09b3\n\u00a5\f\u00a5"+
		"\16\u00a5\u09b6\13\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u09c3\n\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a6\7\u00a6\u09c8\n\u00a6\f\u00a6\16\u00a6\u09cb\13\u00a6"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\5\u00a7\u09e9\n\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\7\u00a8"+
		"\u09ef\n\u00a8\f\u00a8\16\u00a8\u09f2\13\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\7\u00a8\u09fd\n\u00a8"+
		"\f\u00a8\16\u00a8\u0a00\13\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8"+
		"\u0a0f\n\u00a8\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\5\u00aa\u0a2c\n\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\5\u00ab\u0a3d\n\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac"+
		"\u0a4b\n\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\7\u00ad\u0a57\n\u00ad\f\u00ad\16\u00ad\u0a5a"+
		"\13\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\5\u00ad\u0a76\n\u00ad\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\7\u00af\u0a84\n\u00af"+
		"\f\u00af\16\u00af\u0a87\13\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af"+
		"\5\u00af\u0aa0\n\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0aa6\n"+
		"\u00b0\3\u00b0\3\u00b0\3\u00b0\7\u00b0\u0aab\n\u00b0\f\u00b0\16\u00b0"+
		"\u0aae\13\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\7\u00b0"+
		"\u0ab6\n\u00b0\f\u00b0\16\u00b0\u0ab9\13\u00b0\3\u00b0\3\u00b0\7\u00b0"+
		"\u0abd\n\u00b0\f\u00b0\16\u00b0\u0ac0\13\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\5\u00b0\u0ac5\n\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0acb\n"+
		"\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0ad0\n\u00b0\3\u00b0\3\u00b0\3"+
		"\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0ad8\n\u00b0\3\u00b0\3\u00b0\3"+
		"\u00b0\7\u00b0\u0add\n\u00b0\f\u00b0\16\u00b0\u0ae0\13\u00b0\3\u00b0\3"+
		"\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0ae7\n\u00b0\3\u00b0\3\u00b0\3"+
		"\u00b0\3\u00b0\5\u00b0\u0aed\n\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0af2"+
		"\n\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0afa"+
		"\n\u00b0\3\u00b0\3\u00b0\3\u00b0\7\u00b0\u0aff\n\u00b0\f\u00b0\16\u00b0"+
		"\u0b02\13\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0b09"+
		"\n\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0b0f\n\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b0\5\u00b0\u0b14\n\u00b0\5\u00b0\u0b16\n\u00b0\3\u00b1\3"+
		"\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u0b1d\n\u00b1\3\u00b1\3\u00b1\3"+
		"\u00b1\7\u00b1\u0b22\n\u00b1\f\u00b1\16\u00b1\u0b25\13\u00b1\3\u00b1\3"+
		"\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u0b2c\n\u00b1\3\u00b1\3\u00b1\3"+
		"\u00b1\3\u00b1\5\u00b1\u0b32\n\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u0b37"+
		"\n\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u0b3d\n\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\7\u00b2\u0b42\n\u00b2\f\u00b2\16\u00b2\u0b45\13\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\7\u00b2\u0b4d\n\u00b2"+
		"\f\u00b2\16\u00b2\u0b50\13\u00b2\3\u00b2\3\u00b2\7\u00b2\u0b54\n\u00b2"+
		"\f\u00b2\16\u00b2\u0b57\13\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u0b5c"+
		"\n\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u0b62\n\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\5\u00b2\u0b67\n\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\5\u00b2\u0b6f\n\u00b2\3\u00b2\3\u00b2\3\u00b2\7\u00b2"+
		"\u0b74\n\u00b2\f\u00b2\16\u00b2\u0b77\13\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\5\u00b2\u0b7e\n\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\5\u00b2\u0b84\n\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u0b89\n\u00b2\5"+
		"\u00b2\u0b8b\n\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5"+
		"\u00b3\u0b93\n\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3"+
		"\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\5\u00b4\u0ba5\n\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\5\u00b6\u0bb6\n\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0bc4"+
		"\n\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\7\u00b7\u0bcc"+
		"\n\u00b7\f\u00b7\16\u00b7\u0bcf\13\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\7\u00b8\u0bdc"+
		"\n\u00b8\f\u00b8\16\u00b8\u0bdf\13\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9"+
		"\u0bed\n\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\7\u00b9"+
		"\u0bf5\n\u00b9\f\u00b9\16\u00b9\u0bf8\13\u00b9\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\5\u00ba\u0bff\n\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0c08\n\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\5\u00ba\u0c0f\n\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0c19\n\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0c20\n\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0c2a\n\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0c31\n\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0c3c"+
		"\n\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0c43\n\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0c48\n\u00ba\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\5\u00bb\u0c4e\n\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\5\u00bb\u0c55\n\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\5\u00bc\u0c5f\n\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u0c68\n\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\5\u00bc\u0c6f\n\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u0c79\n\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u0c80\n\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u0c8b\n\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u0c92\n\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\5\u00bc\u0c97\n\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\7\u00bd\u0ca0\n\u00bd\f\u00bd\16\u00bd\u0ca3"+
		"\13\u00bd\3\u00bd\3\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be"+
		"\u0cac\n\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\5\u00be\u0cb6\n\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\5\u00be\u0cc0\n\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0cca\n\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be"+
		"\u0cd5\n\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\5\u00be\u0cdf\n\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\5\u00be\u0ce9\n\u00be\3\u00bf\3\u00bf\3\u00bf"+
		"\3\u00bf\5\u00bf\u0cef\n\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u0cf9\n\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u0d03\n\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u0d0d"+
		"\n\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\5\u00c0\u0d18\n\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u0d22\n\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u0d2c\n\u00c0\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u0d34\n\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u0d3e"+
		"\n\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u0d4e\n\u00c1"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\7\u00c2\u0d55\n\u00c2\f\u00c2"+
		"\16\u00c2\u0d58\13\u00c2\3\u00c3\3\u00c3\3\u00c3\7\u00c3\u0d5d\n\u00c3"+
		"\f\u00c3\16\u00c3\u0d60\13\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\5\u00c5\u0d70\n\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0d7d\n\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0d86\n\u00c7"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\7\u00c8\u0d8e\n\u00c8"+
		"\f\u00c8\16\u00c8\u0d91\13\u00c8\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u0d9b\n\u00c9\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u0da3\n\u00ca\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\3\u00cc\3\u00cc\5\u00cc\u0db3\n\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\5\u00cd\u0dcd\n\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u0dd9\n\u00ce"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\7\u00cf\u0de4\n\u00cf\f\u00cf\16\u00cf\u0de7\13\u00cf\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\7\u00d0\u0df2"+
		"\n\u00d0\f\u00d0\16\u00d0\u0df5\13\u00d0\3\u00d1\3\u00d1\3\u00d1\3\u00d1"+
		"\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d1\7\u00d1\u0e00\n\u00d1\f\u00d1"+
		"\16\u00d1\u0e03\13\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\7\u00d2\u0e0e\n\u00d2\f\u00d2\16\u00d2\u0e11"+
		"\13\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3"+
		"\3\u00d3\7\u00d3\u0e1c\n\u00d3\f\u00d3\16\u00d3\u0e1f\13\u00d3\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d4\7\u00d4\u0e2f\n\u00d4\f\u00d4\16\u00d4"+
		"\u0e32\13\u00d4\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d5\7\u00d5\u0e51\n\u00d5\f\u00d5\16\u00d5"+
		"\u0e54\13\u00d5\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\7\u00d6\u0e6d"+
		"\n\u00d6\f\u00d6\16\u00d6\u0e70\13\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d7"+
		"\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7"+
		"\3\u00d7\7\u00d7\u0e80\n\u00d7\f\u00d7\16\u00d7\u0e83\13\u00d7\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\7\u00d8\u0e98\n\u00d8\f\u00d8\16\u00d8\u0e9b\13\u00d8\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u0eae\n\u00d9"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\3\u00db\3\u00db\3\u00db\3\u00db\3\u00dc"+
		"\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc"+
		"\3\u00dc\3\u00dc\3\u00dc\3\u00dc\5\u00dc\u0ec6\n\u00dc\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u0ece\n\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\7\u00dd\u0ed4\n\u00dd\f\u00dd\16\u00dd\u0ed7\13\u00dd"+
		"\3\u00de\3\u00de\3\u00de\3\u00de\3\u00df\3\u00df\3\u00df\3\u00df\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0"+
		"\3\u00e0\7\u00e0\u0eec\n\u00e0\f\u00e0\16\u00e0\u0eef\13\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\7\u00e0"+
		"\u0efa\n\u00e0\f\u00e0\16\u00e0\u0efd\13\u00e0\3\u00e0\3\u00e0\3\u00e0"+
		"\3\u00e0\5\u00e0\u0f03\n\u00e0\3\u00e0\2\16\60\64\u019c\u019e\u01a0\u01a2"+
		"\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u00e1\2\4\6\b\n\f\16\20\22\24\26"+
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
		"\u01b8\u01ba\u01bc\u01be\2\2\u1008\2\u01cc\3\2\2\2\4\u01d4\3\2\2\2\6\u01eb"+
		"\3\2\2\2\b\u01f3\3\2\2\2\n\u01ff\3\2\2\2\f\u0205\3\2\2\2\16\u0210\3\2"+
		"\2\2\20\u0212\3\2\2\2\22\u023d\3\2\2\2\24\u0244\3\2\2\2\26\u0253\3\2\2"+
		"\2\30\u0265\3\2\2\2\32\u026c\3\2\2\2\34\u028a\3\2\2\2\36\u0295\3\2\2\2"+
		" \u02a9\3\2\2\2\"\u02ab\3\2\2\2$\u02af\3\2\2\2&\u02b4\3\2\2\2(\u02c7\3"+
		"\2\2\2*\u02ce\3\2\2\2,\u02de\3\2\2\2.\u02e7\3\2\2\2\60\u02e9\3\2\2\2\62"+
		"\u02fd\3\2\2\2\64\u02ff\3\2\2\2\66\u030f\3\2\2\28\u0329\3\2\2\2:\u033b"+
		"\3\2\2\2<\u034a\3\2\2\2>\u034c\3\2\2\2@\u0351\3\2\2\2B\u0358\3\2\2\2D"+
		"\u0360\3\2\2\2F\u036f\3\2\2\2H\u0377\3\2\2\2J\u0381\3\2\2\2L\u03a7\3\2"+
		"\2\2N\u03a9\3\2\2\2P\u03ae\3\2\2\2R\u03bc\3\2\2\2T\u03c0\3\2\2\2V\u03c4"+
		"\3\2\2\2X\u03d2\3\2\2\2Z\u03e6\3\2\2\2\\\u03f3\3\2\2\2^\u03fd\3\2\2\2"+
		"`\u0413\3\2\2\2b\u0415\3\2\2\2d\u0423\3\2\2\2f\u042d\3\2\2\2h\u0436\3"+
		"\2\2\2j\u0440\3\2\2\2l\u0448\3\2\2\2n\u044f\3\2\2\2p\u045a\3\2\2\2r\u045c"+
		"\3\2\2\2t\u0470\3\2\2\2v\u0472\3\2\2\2x\u0479\3\2\2\2z\u0488\3\2\2\2|"+
		"\u0492\3\2\2\2~\u04ad\3\2\2\2\u0080\u04ca\3\2\2\2\u0082\u04d1\3\2\2\2"+
		"\u0084\u04d3\3\2\2\2\u0086\u04ef\3\2\2\2\u0088\u050d\3\2\2\2\u008a\u0517"+
		"\3\2\2\2\u008c\u051e\3\2\2\2\u008e\u053c\3\2\2\2\u0090\u0543\3\2\2\2\u0092"+
		"\u054c\3\2\2\2\u0094\u0550\3\2\2\2\u0096\u0564\3\2\2\2\u0098\u056b\3\2"+
		"\2\2\u009a\u056d\3\2\2\2\u009c\u0570\3\2\2\2\u009e\u057c\3\2\2\2\u00a0"+
		"\u0590\3\2\2\2\u00a2\u0595\3\2\2\2\u00a4\u05a1\3\2\2\2\u00a6\u05f2\3\2"+
		"\2\2\u00a8\u05fc\3\2\2\2\u00aa\u0609\3\2\2\2\u00ac\u0616\3\2\2\2\u00ae"+
		"\u0623\3\2\2\2\u00b0\u0634\3\2\2\2\u00b2\u0641\3\2\2\2\u00b4\u064b\3\2"+
		"\2\2\u00b6\u066a\3\2\2\2\u00b8\u066c\3\2\2\2\u00ba\u0670\3\2\2\2\u00bc"+
		"\u0685\3\2\2\2\u00be\u068f\3\2\2\2\u00c0\u069d\3\2\2\2\u00c2\u06a7\3\2"+
		"\2\2\u00c4\u06ba\3\2\2\2\u00c6\u06c4\3\2\2\2\u00c8\u06cd\3\2\2\2\u00ca"+
		"\u06e2\3\2\2\2\u00cc\u06ec\3\2\2\2\u00ce\u0705\3\2\2\2\u00d0\u0707\3\2"+
		"\2\2\u00d2\u0714\3\2\2\2\u00d4\u0716\3\2\2\2\u00d6\u0720\3\2\2\2\u00d8"+
		"\u0728\3\2\2\2\u00da\u0736\3\2\2\2\u00dc\u0738\3\2\2\2\u00de\u0744\3\2"+
		"\2\2\u00e0\u0752\3\2\2\2\u00e2\u0756\3\2\2\2\u00e4\u075d\3\2\2\2\u00e6"+
		"\u0769\3\2\2\2\u00e8\u0777\3\2\2\2\u00ea\u0781\3\2\2\2\u00ec\u0797\3\2"+
		"\2\2\u00ee\u0799\3\2\2\2\u00f0\u07a5\3\2\2\2\u00f2\u07be\3\2\2\2\u00f4"+
		"\u07cf\3\2\2\2\u00f6\u07f5\3\2\2\2\u00f8\u07f7\3\2\2\2\u00fa\u07fa\3\2"+
		"\2\2\u00fc\u07ff\3\2\2\2\u00fe\u0804\3\2\2\2\u0100\u081d\3\2\2\2\u0102"+
		"\u081f\3\2\2\2\u0104\u0826\3\2\2\2\u0106\u082f\3\2\2\2\u0108\u0844\3\2"+
		"\2\2\u010a\u0846\3\2\2\2\u010c\u084d\3\2\2\2\u010e\u0862\3\2\2\2\u0110"+
		"\u0866\3\2\2\2\u0112\u087f\3\2\2\2\u0114\u0881\3\2\2\2\u0116\u0888\3\2"+
		"\2\2\u0118\u088f\3\2\2\2\u011a\u089e\3\2\2\2\u011c\u08a6\3\2\2\2\u011e"+
		"\u08a8\3\2\2\2\u0120\u08bf\3\2\2\2\u0122\u08dc\3\2\2\2\u0124\u08de\3\2"+
		"\2\2\u0126\u08e1\3\2\2\2\u0128\u08ef\3\2\2\2\u012a\u0903\3\2\2\2\u012c"+
		"\u0917\3\2\2\2\u012e\u091f\3\2\2\2\u0130\u092f\3\2\2\2\u0132\u0931\3\2"+
		"\2\2\u0134\u0936\3\2\2\2\u0136\u094f\3\2\2\2\u0138\u0951\3\2\2\2\u013a"+
		"\u095d\3\2\2\2\u013c\u096d\3\2\2\2\u013e\u0974\3\2\2\2\u0140\u0980\3\2"+
		"\2\2\u0142\u0984\3\2\2\2\u0144\u0993\3\2\2\2\u0146\u099f\3\2\2\2\u0148"+
		"\u09b4\3\2\2\2\u014a\u09c2\3\2\2\2\u014c\u09e8\3\2\2\2\u014e\u0a0e\3\2"+
		"\2\2\u0150\u0a10\3\2\2\2\u0152\u0a2b\3\2\2\2\u0154\u0a3c\3\2\2\2\u0156"+
		"\u0a4a\3\2\2\2\u0158\u0a75\3\2\2\2\u015a\u0a77\3\2\2\2\u015c\u0a9f\3\2"+
		"\2\2\u015e\u0b15\3\2\2\2\u0160\u0b17\3\2\2\2\u0162\u0b8a\3\2\2\2\u0164"+
		"\u0b92\3\2\2\2\u0166\u0ba4\3\2\2\2\u0168\u0ba6\3\2\2\2\u016a\u0bb5\3\2"+
		"\2\2\u016c\u0bc3\3\2\2\2\u016e\u0bd0\3\2\2\2\u0170\u0bec\3\2\2\2\u0172"+
		"\u0c47\3\2\2\2\u0174\u0c49\3\2\2\2\u0176\u0c96\3\2\2\2\u0178\u0c98\3\2"+
		"\2\2\u017a\u0ce8\3\2\2\2\u017c\u0cea\3\2\2\2\u017e\u0d2b\3\2\2\2\u0180"+
		"\u0d4d\3\2\2\2\u0182\u0d4f\3\2\2\2\u0184\u0d5e\3\2\2\2\u0186\u0d66\3\2"+
		"\2\2\u0188\u0d6f\3\2\2\2\u018a\u0d71\3\2\2\2\u018c\u0d85\3\2\2\2\u018e"+
		"\u0d87\3\2\2\2\u0190\u0d9a\3\2\2\2\u0192\u0da2\3\2\2\2\u0194\u0da4\3\2"+
		"\2\2\u0196\u0db2\3\2\2\2\u0198\u0dcc\3\2\2\2\u019a\u0dd8\3\2\2\2\u019c"+
		"\u0dda\3\2\2\2\u019e\u0de8\3\2\2\2\u01a0\u0df6\3\2\2\2\u01a2\u0e04\3\2"+
		"\2\2\u01a4\u0e12\3\2\2\2\u01a6\u0e20\3\2\2\2\u01a8\u0e33\3\2\2\2\u01aa"+
		"\u0e55\3\2\2\2\u01ac\u0e71\3\2\2\2\u01ae\u0e84\3\2\2\2\u01b0\u0ead\3\2"+
		"\2\2\u01b2\u0eaf\3\2\2\2\u01b4\u0eb3\3\2\2\2\u01b6\u0ec5\3\2\2\2\u01b8"+
		"\u0ecd\3\2\2\2\u01ba\u0ed8\3\2\2\2\u01bc\u0edc\3\2\2\2\u01be\u0f02\3\2"+
		"\2\2\u01c0\u01c1\7\65\2\2\u01c1\u01cd\b\2\1\2\u01c2\u01c3\7\66\2\2\u01c3"+
		"\u01cd\b\2\1\2\u01c4\u01c5\7\67\2\2\u01c5\u01cd\b\2\1\2\u01c6\u01c7\7"+
		"8\2\2\u01c7\u01cd\b\2\1\2\u01c8\u01c9\79\2\2\u01c9\u01cd\b\2\1\2\u01ca"+
		"\u01cb\7:\2\2\u01cb\u01cd\b\2\1\2\u01cc\u01c0\3\2\2\2\u01cc\u01c2\3\2"+
		"\2\2\u01cc\u01c4\3\2\2\2\u01cc\u01c6\3\2\2\2\u01cc\u01c8\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cd\3\3\2\2\2\u01ce\u01cf\5\6\4\2\u01cf\u01d0\b\3\1\2"+
		"\u01d0\u01d5\3\2\2\2\u01d1\u01d2\5\16\b\2\u01d2\u01d3\b\3\1\2\u01d3\u01d5"+
		"\3\2\2\2\u01d4\u01ce\3\2\2\2\u01d4\u01d1\3\2\2\2\u01d5\5\3\2\2\2\u01d6"+
		"\u01d7\5\u00d2j\2\u01d7\u01d8\b\4\1\2\u01d8\u01da\3\2\2\2\u01d9\u01d6"+
		"\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc"+
		"\u01de\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01df\5\b\5\2\u01df\u01e0\b\4"+
		"\1\2\u01e0\u01ec\3\2\2\2\u01e1\u01e2\5\u00d2j\2\u01e2\u01e3\b\4\1\2\u01e3"+
		"\u01e5\3\2\2\2\u01e4\u01e1\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2"+
		"\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9"+
		"\u01ea\7\5\2\2\u01ea\u01ec\b\4\1\2\u01eb\u01db\3\2\2\2\u01eb\u01e6\3\2"+
		"\2\2\u01ec\7\3\2\2\2\u01ed\u01ee\5\n\6\2\u01ee\u01ef\b\5\1\2\u01ef\u01f4"+
		"\3\2\2\2\u01f0\u01f1\5\f\7\2\u01f1\u01f2\b\5\1\2\u01f2\u01f4\3\2\2\2\u01f3"+
		"\u01ed\3\2\2\2\u01f3\u01f0\3\2\2\2\u01f4\t\3\2\2\2\u01f5\u01f6\7\7\2\2"+
		"\u01f6\u0200\b\6\1\2\u01f7\u01f8\7\'\2\2\u01f8\u0200\b\6\1\2\u01f9\u01fa"+
		"\7\35\2\2\u01fa\u0200\b\6\1\2\u01fb\u01fc\7\37\2\2\u01fc\u0200\b\6\1\2"+
		"\u01fd\u01fe\7\n\2\2\u01fe\u0200\b\6\1\2\u01ff\u01f5\3\2\2\2\u01ff\u01f7"+
		"\3\2\2\2\u01ff\u01f9\3\2\2\2\u01ff\u01fb\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200"+
		"\13\3\2\2\2\u0201\u0202\7\26\2\2\u0202\u0206\b\7\1\2\u0203\u0204\7\20"+
		"\2\2\u0204\u0206\b\7\1\2\u0205\u0201\3\2\2\2\u0205\u0203\3\2\2\2\u0206"+
		"\r\3\2\2\2\u0207\u0208\5\20\t\2\u0208\u0209\b\b\1\2\u0209\u0211\3\2\2"+
		"\2\u020a\u020b\5\26\f\2\u020b\u020c\b\b\1\2\u020c\u0211\3\2\2\2\u020d"+
		"\u020e\5\30\r\2\u020e\u020f\b\b\1\2\u020f\u0211\3\2\2\2\u0210\u0207\3"+
		"\2\2\2\u0210\u020a\3\2\2\2\u0210\u020d\3\2\2\2\u0211\17\3\2\2\2\u0212"+
		"\u0213\5\24\13\2\u0213\u021a\b\t\1\2\u0214\u0215\7C\2\2\u0215\u0216\5"+
		"\24\13\2\u0216\u0217\b\t\1\2\u0217\u0219\3\2\2\2\u0218\u0214\3\2\2\2\u0219"+
		"\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\21\3\2\2"+
		"\2\u021c\u021a\3\2\2\2\u021d\u021e\5\u00d2j\2\u021e\u021f\b\n\1\2\u021f"+
		"\u0221\3\2\2\2\u0220\u021d\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2"+
		"\2\2\u0222\u0223\3\2\2\2\u0223\u0225\3\2\2\2\u0224\u0222\3\2\2\2\u0225"+
		"\u0226\7h\2\2\u0226\u022a\b\n\1\2\u0227\u0228\5$\23\2\u0228\u0229\b\n"+
		"\1\2\u0229\u022b\3\2\2\2\u022a\u0227\3\2\2\2\u022a\u022b\3\2\2\2\u022b"+
		"\u023e\3\2\2\2\u022c\u022d\5\20\t\2\u022d\u0233\7C\2\2\u022e\u022f\5\u00d2"+
		"j\2\u022f\u0230\b\n\1\2\u0230\u0232\3\2\2\2\u0231\u022e\3\2\2\2\u0232"+
		"\u0235\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0236\3\2"+
		"\2\2\u0235\u0233\3\2\2\2\u0236\u0237\7h\2\2\u0237\u023b\b\n\1\2\u0238"+
		"\u0239\5$\23\2\u0239\u023a\b\n\1\2\u023a\u023c\3\2\2\2\u023b\u0238\3\2"+
		"\2\2\u023b\u023c\3\2\2\2\u023c\u023e\3\2\2\2\u023d\u0222\3\2\2\2\u023d"+
		"\u022c\3\2\2\2\u023e\23\3\2\2\2\u023f\u0240\5\u00d2j\2\u0240\u0241\b\13"+
		"\1\2\u0241\u0243\3\2\2\2\u0242\u023f\3\2\2\2\u0243\u0246\3\2\2\2\u0244"+
		"\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0247\3\2\2\2\u0246\u0244\3\2"+
		"\2\2\u0247\u0248\7h\2\2\u0248\u024c\b\13\1\2\u0249\u024a\5$\23\2\u024a"+
		"\u024b\b\13\1\2\u024b\u024d\3\2\2\2\u024c\u0249\3\2\2\2\u024c\u024d\3"+
		"\2\2\2\u024d\25\3\2\2\2\u024e\u024f\5\u00d2j\2\u024f\u0250\b\f\1\2\u0250"+
		"\u0252\3\2\2\2\u0251\u024e\3\2\2\2\u0252\u0255\3\2\2\2\u0253\u0251\3\2"+
		"\2\2\u0253\u0254\3\2\2\2\u0254\u0256\3\2\2\2\u0255\u0253\3\2\2\2\u0256"+
		"\u0257\7h\2\2\u0257\u0258\b\f\1\2\u0258\27\3\2\2\2\u0259\u025a\5\6\4\2"+
		"\u025a\u025b\5\32\16\2\u025b\u025c\b\r\1\2\u025c\u0266\3\2\2\2\u025d\u025e"+
		"\5\20\t\2\u025e\u025f\5\32\16\2\u025f\u0260\b\r\1\2\u0260\u0266\3\2\2"+
		"\2\u0261\u0262\5\26\f\2\u0262\u0263\5\32\16\2\u0263\u0264\b\r\1\2\u0264"+
		"\u0266\3\2\2\2\u0265\u0259\3\2\2\2\u0265\u025d\3\2\2\2\u0265\u0261\3\2"+
		"\2\2\u0266\31\3\2\2\2\u0267\u0268\5\u00d2j\2\u0268\u0269\b\16\1\2\u0269"+
		"\u026b\3\2\2\2\u026a\u0267\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2"+
		"\2\2\u026c\u026d\3\2\2\2\u026d\u026f\3\2\2\2\u026e\u026c\3\2\2\2\u026f"+
		"\u0270\7?\2\2\u0270\u0271\7@\2\2\u0271\u0280\b\16\1\2\u0272\u0278\b\16"+
		"\1\2\u0273\u0274\5\u00d2j\2\u0274\u0275\b\16\1\2\u0275\u0277\3\2\2\2\u0276"+
		"\u0273\3\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2"+
		"\2\2\u0279\u027b\3\2\2\2\u027a\u0278\3\2\2\2\u027b\u027c\7?\2\2\u027c"+
		"\u027d\7@\2\2\u027d\u027f\b\16\1\2\u027e\u0272\3\2\2\2\u027f\u0282\3\2"+
		"\2\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0283\3\2\2\2\u0282"+
		"\u0280\3\2\2\2\u0283\u0284\b\16\1\2\u0284\33\3\2\2\2\u0285\u0286\5\36"+
		"\20\2\u0286\u0287\b\17\1\2\u0287\u0289\3\2\2\2\u0288\u0285\3\2\2\2\u0289"+
		"\u028c\3\2\2\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028d\3\2"+
		"\2\2\u028c\u028a\3\2\2\2\u028d\u0291\7h\2\2\u028e\u028f\5 \21\2\u028f"+
		"\u0290\b\17\1\2\u0290\u0292\3\2\2\2\u0291\u028e\3\2\2\2\u0291\u0292\3"+
		"\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\b\17\1\2\u0294\35\3\2\2\2\u0295"+
		"\u0296\5\u00d2j\2\u0296\u0297\b\20\1\2\u0297\37\3\2\2\2\u0298\u0299\7"+
		"\23\2\2\u0299\u029a\5\26\f\2\u029a\u029b\b\21\1\2\u029b\u02aa\3\2\2\2"+
		"\u029c\u029d\7\23\2\2\u029d\u029e\5\20\t\2\u029e\u02a4\b\21\1\2\u029f"+
		"\u02a0\5\"\22\2\u02a0\u02a1\b\21\1\2\u02a1\u02a3\3\2\2\2\u02a2\u029f\3"+
		"\2\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5"+
		"\u02a7\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02a8\b\21\1\2\u02a8\u02aa\3"+
		"\2\2\2\u02a9\u0298\3\2\2\2\u02a9\u029c\3\2\2\2\u02aa!\3\2\2\2\u02ab\u02ac"+
		"\7W\2\2\u02ac\u02ad\5\22\n\2\u02ad\u02ae\b\22\1\2\u02ae#\3\2\2\2\u02af"+
		"\u02b0\7F\2\2\u02b0\u02b1\5&\24\2\u02b1\u02b2\7E\2\2\u02b2\u02b3\b\23"+
		"\1\2\u02b3%\3\2\2\2\u02b4\u02b5\5(\25\2\u02b5\u02bc\b\24\1\2\u02b6\u02b7"+
		"\7B\2\2\u02b7\u02b8\5(\25\2\u02b8\u02b9\b\24\1\2\u02b9\u02bb\3\2\2\2\u02ba"+
		"\u02b6\3\2\2\2\u02bb\u02be\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2"+
		"\2\2\u02bd\u02bf\3\2\2\2\u02be\u02bc\3\2\2\2\u02bf\u02c0\b\24\1\2\u02c0"+
		"\'\3\2\2\2\u02c1\u02c2\5\16\b\2\u02c2\u02c3\b\25\1\2\u02c3\u02c8\3\2\2"+
		"\2\u02c4\u02c5\5*\26\2\u02c5\u02c6\b\25\1\2\u02c6\u02c8\3\2\2\2\u02c7"+
		"\u02c1\3\2\2\2\u02c7\u02c4\3\2\2\2\u02c8)\3\2\2\2\u02c9\u02ca\5\u00d2"+
		"j\2\u02ca\u02cb\b\26\1\2\u02cb\u02cd\3\2\2\2\u02cc\u02c9\3\2\2\2\u02cd"+
		"\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d1\3\2"+
		"\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d2\7I\2\2\u02d2\u02d4\b\26\1\2\u02d3"+
		"\u02d5\5,\27\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5+\3\2\2\2"+
		"\u02d6\u02d7\7\23\2\2\u02d7\u02d8\5\16\b\2\u02d8\u02d9\b\27\1\2\u02d9"+
		"\u02df\3\2\2\2\u02da\u02db\7*\2\2\u02db\u02dc\5\16\b\2\u02dc\u02dd\b\27"+
		"\1\2\u02dd\u02df\3\2\2\2\u02de\u02d6\3\2\2\2\u02de\u02da\3\2\2\2\u02df"+
		"-\3\2\2\2\u02e0\u02e1\7h\2\2\u02e1\u02e8\b\30\1\2\u02e2\u02e3\5\60\31"+
		"\2\u02e3\u02e4\7C\2\2\u02e4\u02e5\7h\2\2\u02e5\u02e6\b\30\1\2\u02e6\u02e8"+
		"\3\2\2\2\u02e7\u02e0\3\2\2\2\u02e7\u02e2\3\2\2\2\u02e8/\3\2\2\2\u02e9"+
		"\u02ea\b\31\1\2\u02ea\u02eb\7h\2\2\u02eb\u02ec\b\31\1\2\u02ec\u02f3\3"+
		"\2\2\2\u02ed\u02ee\f\3\2\2\u02ee\u02ef\7C\2\2\u02ef\u02f0\7h\2\2\u02f0"+
		"\u02f2\b\31\1\2\u02f1\u02ed\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3"+
		"\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\61\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6"+
		"\u02f7\7h\2\2\u02f7\u02fe\b\32\1\2\u02f8\u02f9\5\64\33\2\u02f9\u02fa\7"+
		"C\2\2\u02fa\u02fb\7h\2\2\u02fb\u02fc\b\32\1\2\u02fc\u02fe\3\2\2\2\u02fd"+
		"\u02f6\3\2\2\2\u02fd\u02f8\3\2\2\2\u02fe\63\3\2\2\2\u02ff\u0300\b\33\1"+
		"\2\u0300\u0301\7h\2\2\u0301\u0302\b\33\1\2\u0302\u0309\3\2\2\2\u0303\u0304"+
		"\f\3\2\2\u0304\u0305\7C\2\2\u0305\u0306\7h\2\2\u0306\u0308\b\33\1\2\u0307"+
		"\u0303\3\2\2\2\u0308\u030b\3\2\2\2\u0309\u0307\3\2\2\2\u0309\u030a\3\2"+
		"\2\2\u030a\65\3\2\2\2\u030b\u0309\3\2\2\2\u030c\u030d\58\35\2\u030d\u030e"+
		"\b\34\1\2\u030e\u0310\3\2\2\2\u030f\u030c\3\2\2\2\u030f\u0310\3\2\2\2"+
		"\u0310\u0316\3\2\2\2\u0311\u0312\5<\37\2\u0312\u0313\b\34\1\2\u0313\u0315"+
		"\3\2\2\2\u0314\u0311\3\2\2\2\u0315\u0318\3\2\2\2\u0316\u0314\3\2\2\2\u0316"+
		"\u0317\3\2\2\2\u0317\u031e\3\2\2\2\u0318\u0316\3\2\2\2\u0319\u031a\5F"+
		"$\2\u031a\u031b\b\34\1\2\u031b\u031d\3\2\2\2\u031c\u0319\3\2\2\2\u031d"+
		"\u0320\3\2\2\2\u031e\u031c\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0321\3\2"+
		"\2\2\u0320\u031e\3\2\2\2\u0321\u0322\7\2\2\3\u0322\u0323\b\34\1\2\u0323"+
		"\67\3\2\2\2\u0324\u0325\5:\36\2\u0325\u0326\b\35\1\2\u0326\u0328\3\2\2"+
		"\2\u0327\u0324\3\2\2\2\u0328\u032b\3\2\2\2\u0329\u0327\3\2\2\2\u0329\u032a"+
		"\3\2\2\2\u032a\u032c\3\2\2\2\u032b\u0329\3\2\2\2\u032c\u032d\7\"\2\2\u032d"+
		"\u032e\7h\2\2\u032e\u032f\b\35\1\2\u032f\u0335\3\2\2\2\u0330\u0331\7C"+
		"\2\2\u0331\u0332\7h\2\2\u0332\u0334\b\35\1\2\u0333\u0330\3\2\2\2\u0334"+
		"\u0337\3\2\2\2\u0335\u0333\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0338\3\2"+
		"\2\2\u0337\u0335\3\2\2\2\u0338\u0339\7A\2\2\u0339\u033a\b\35\1\2\u033a"+
		"9\3\2\2\2\u033b\u033c\5\u00d2j\2\u033c\u033d\b\36\1\2\u033d;\3\2\2\2\u033e"+
		"\u033f\5> \2\u033f\u0340\b\37\1\2\u0340\u034b\3\2\2\2\u0341\u0342\5@!"+
		"\2\u0342\u0343\b\37\1\2\u0343\u034b\3\2\2\2\u0344\u0345\5B\"\2\u0345\u0346"+
		"\b\37\1\2\u0346\u034b\3\2\2\2\u0347\u0348\5D#\2\u0348\u0349\b\37\1\2\u0349"+
		"\u034b\3\2\2\2\u034a\u033e\3\2\2\2\u034a\u0341\3\2\2\2\u034a\u0344\3\2"+
		"\2\2\u034a\u0347\3\2\2\2\u034b=\3\2\2\2\u034c\u034d\7\33\2\2\u034d\u034e"+
		"\5.\30\2\u034e\u034f\7A\2\2\u034f\u0350\b \1\2\u0350?\3\2\2\2\u0351\u0352"+
		"\7\33\2\2\u0352\u0353\5\60\31\2\u0353\u0354\7C\2\2\u0354\u0355\7U\2\2"+
		"\u0355\u0356\7A\2\2\u0356\u0357\b!\1\2\u0357A\3\2\2\2\u0358\u0359\7\33"+
		"\2\2\u0359\u035a\7(\2\2\u035a\u035b\5.\30\2\u035b\u035c\7C\2\2\u035c\u035d"+
		"\7h\2\2\u035d\u035e\7A\2\2\u035e\u035f\b\"\1\2\u035fC\3\2\2\2\u0360\u0361"+
		"\7\33\2\2\u0361\u0362\7(\2\2\u0362\u0363\5.\30\2\u0363\u0364\7C\2\2\u0364"+
		"\u0365\7U\2\2\u0365\u0366\7A\2\2\u0366\u0367\b#\1\2\u0367E\3\2\2\2\u0368"+
		"\u0369\5H%\2\u0369\u036a\b$\1\2\u036a\u0370\3\2\2\2\u036b\u036c\5\u00b2"+
		"Z\2\u036c\u036d\b$\1\2\u036d\u0370\3\2\2\2\u036e\u0370\7A\2\2\u036f\u0368"+
		"\3\2\2\2\u036f\u036b\3\2\2\2\u036f\u036e\3\2\2\2\u0370G\3\2\2\2\u0371"+
		"\u0372\5J&\2\u0372\u0373\b%\1\2\u0373\u0378\3\2\2\2\u0374\u0375\5\u00a8"+
		"U\2\u0375\u0376\b%\1\2\u0376\u0378\3\2\2\2\u0377\u0371\3\2\2\2\u0377\u0374"+
		"\3\2\2\2\u0378I\3\2\2\2\u0379\u037a\5L\'\2\u037a\u037b\b&\1\2\u037b\u0380"+
		"\3\2\2\2\u037c\u037d\5\u00d2j\2\u037d\u037e\b&\1\2\u037e\u0380\3\2\2\2"+
		"\u037f\u0379\3\2\2\2\u037f\u037c\3\2\2\2\u0380\u0383\3\2\2\2\u0381\u037f"+
		"\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0384\3\2\2\2\u0383\u0381\3\2\2\2\u0384"+
		"\u0385\b&\1\2\u0385\u0386\7\13\2\2\u0386\u038a\7h\2\2\u0387\u0388\5N("+
		"\2\u0388\u0389\b&\1\2\u0389\u038b\3\2\2\2\u038a\u0387\3\2\2\2\u038a\u038b"+
		"\3\2\2\2\u038b\u038f\3\2\2\2\u038c\u038d\5R*\2\u038d\u038e\b&\1\2\u038e"+
		"\u0390\3\2\2\2\u038f\u038c\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0394\3\2"+
		"\2\2\u0391\u0392\5T+\2\u0392\u0393\b&\1\2\u0393\u0395\3\2\2\2\u0394\u0391"+
		"\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0397\b&\1\2\u0397"+
		"\u0398\5X-\2\u0398K\3\2\2\2\u0399\u039a\7%\2\2\u039a\u03a8\b\'\1\2\u039b"+
		"\u039c\7$\2\2\u039c\u03a8\b\'\1\2\u039d\u039e\7#\2\2\u039e\u03a8\b\'\1"+
		"\2\u039f\u03a0\7\3\2\2\u03a0\u03a8\b\'\1\2\u03a1\u03a2\7(\2\2\u03a2\u03a8"+
		"\b\'\1\2\u03a3\u03a4\7\24\2\2\u03a4\u03a8\b\'\1\2\u03a5\u03a6\7)\2\2\u03a6"+
		"\u03a8\b\'\1\2\u03a7\u0399\3\2\2\2\u03a7\u039b\3\2\2\2\u03a7\u039d\3\2"+
		"\2\2\u03a7\u039f\3\2\2\2\u03a7\u03a1\3\2\2\2\u03a7\u03a3\3\2\2\2\u03a7"+
		"\u03a5\3\2\2\2\u03a8M\3\2\2\2\u03a9\u03aa\7F\2\2\u03aa\u03ab\5P)\2\u03ab"+
		"\u03ac\7E\2\2\u03ac\u03ad\b(\1\2\u03adO\3\2\2\2\u03ae\u03af\5\34\17\2"+
		"\u03af\u03b0\b)\1\2\u03b0\u03b7\3\2\2\2\u03b1\u03b2\7B\2\2\u03b2\u03b3"+
		"\5\34\17\2\u03b3\u03b4\b)\1\2\u03b4\u03b6\3\2\2\2\u03b5\u03b1\3\2\2\2"+
		"\u03b6\u03b9\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03ba"+
		"\3\2\2\2\u03b9\u03b7\3\2\2\2\u03ba\u03bb\b)\1\2\u03bbQ\3\2\2\2\u03bc\u03bd"+
		"\7\23\2\2\u03bd\u03be\5\22\n\2\u03be\u03bf\b*\1\2\u03bfS\3\2\2\2\u03c0"+
		"\u03c1\7\32\2\2\u03c1\u03c2\5V,\2\u03c2\u03c3\b+\1\2\u03c3U\3\2\2\2\u03c4"+
		"\u03c5\5\22\n\2\u03c5\u03c6\b,\1\2\u03c6\u03cd\3\2\2\2\u03c7\u03c8\7B"+
		"\2\2\u03c8\u03c9\5\22\n\2\u03c9\u03ca\b,\1\2\u03ca\u03cc\3\2\2\2\u03cb"+
		"\u03c7\3\2\2\2\u03cc\u03cf\3\2\2\2\u03cd\u03cb\3\2\2\2\u03cd\u03ce\3\2"+
		"\2\2\u03ce\u03d0\3\2\2\2\u03cf\u03cd\3\2\2\2\u03d0\u03d1\b,\1\2\u03d1"+
		"W\3\2\2\2\u03d2\u03d6\7=\2\2\u03d3\u03d5\5Z.\2\u03d4\u03d3\3\2\2\2\u03d5"+
		"\u03d8\3\2\2\2\u03d6\u03d4\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d9\3\2"+
		"\2\2\u03d8\u03d6\3\2\2\2\u03d9\u03da\7>\2\2\u03da\u03db\b-\1\2\u03dbY"+
		"\3\2\2\2\u03dc\u03e7\5\\/\2\u03dd\u03de\5\u009aN\2\u03de\u03df\b.\1\2"+
		"\u03df\u03e7\3\2\2\2\u03e0\u03e1\5\u009cO\2\u03e1\u03e2\b.\1\2\u03e2\u03e7"+
		"\3\2\2\2\u03e3\u03e4\5\u009eP\2\u03e4\u03e5\b.\1\2\u03e5\u03e7\3\2\2\2"+
		"\u03e6\u03dc\3\2\2\2\u03e6\u03dd\3\2\2\2\u03e6\u03e0\3\2\2\2\u03e6\u03e3"+
		"\3\2\2\2\u03e7[\3\2\2\2\u03e8\u03f4\5^\60\2\u03e9\u03ea\5|?\2\u03ea\u03eb"+
		"\b/\1\2\u03eb\u03f4\3\2\2\2\u03ec\u03ed\5H%\2\u03ed\u03ee\b/\1\2\u03ee"+
		"\u03f4\3\2\2\2\u03ef\u03f0\5\u00b2Z\2\u03f0\u03f1\b/\1\2\u03f1\u03f4\3"+
		"\2\2\2\u03f2\u03f4\7A\2\2\u03f3\u03e8\3\2\2\2\u03f3\u03e9\3\2\2\2\u03f3"+
		"\u03ec\3\2\2\2\u03f3\u03ef\3\2\2\2\u03f3\u03f2\3\2\2\2\u03f4]\3\2\2\2"+
		"\u03f5\u03f6\5`\61\2\u03f6\u03f7\b\60\1\2\u03f7\u03fc\3\2\2\2\u03f8\u03f9"+
		"\5\u00d2j\2\u03f9\u03fa\b\60\1\2\u03fa\u03fc\3\2\2\2\u03fb\u03f5\3\2\2"+
		"\2\u03fb\u03f8\3\2\2\2\u03fc\u03ff\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fd\u03fe"+
		"\3\2\2\2\u03fe\u0400\3\2\2\2\u03ff\u03fd\3\2\2\2\u0400\u0401\b\60\1\2"+
		"\u0401\u0402\5l\67\2\u0402\u0403\5b\62\2\u0403\u0404\7A\2\2\u0404_\3\2"+
		"\2\2\u0405\u0406\7%\2\2\u0406\u0414\b\61\1\2\u0407\u0408\7$\2\2\u0408"+
		"\u0414\b\61\1\2\u0409\u040a\7#\2\2\u040a\u0414\b\61\1\2\u040b\u040c\7"+
		"(\2\2\u040c\u0414\b\61\1\2\u040d\u040e\7\24\2\2\u040e\u0414\b\61\1\2\u040f"+
		"\u0410\7\60\2\2\u0410\u0414\b\61\1\2\u0411\u0412\7\63\2\2\u0412\u0414"+
		"\b\61\1\2\u0413\u0405\3\2\2\2\u0413\u0407\3\2\2\2\u0413\u0409\3\2\2\2"+
		"\u0413\u040b\3\2\2\2\u0413\u040d\3\2\2\2\u0413\u040f\3\2\2\2\u0413\u0411"+
		"\3\2\2\2\u0414a\3\2\2\2\u0415\u0416\5d\63\2\u0416\u0417\b\62\1\2\u0417"+
		"\u041e\3\2\2\2\u0418\u0419\7B\2\2\u0419\u041a\5d\63\2\u041a\u041b\b\62"+
		"\1\2\u041b\u041d\3\2\2\2\u041c\u0418\3\2\2\2\u041d\u0420\3\2\2\2\u041e"+
		"\u041c\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u0421\3\2\2\2\u0420\u041e\3\2"+
		"\2\2\u0421\u0422\b\62\1\2\u0422c\3\2\2\2\u0423\u0424\5f\64\2\u0424\u0429"+
		"\b\63\1\2\u0425\u0426\7D\2\2\u0426\u0427\5j\66\2\u0427\u0428\b\63\1\2"+
		"\u0428\u042a\3\2\2\2\u0429\u0425\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042b"+
		"\3\2\2\2\u042b\u042c\b\63\1\2\u042ce\3\2\2\2\u042d\u042e\b\64\1\2\u042e"+
		"\u0432\7h\2\2\u042f\u0430\5\32\16\2\u0430\u0431\b\64\1\2\u0431\u0433\3"+
		"\2\2\2\u0432\u042f\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u0434\3\2\2\2\u0434"+
		"\u0435\b\64\1\2\u0435g\3\2\2\2\u0436\u0437\5l\67\2\u0437\u0438\5f\64\2"+
		"\u0438\u0439\b\65\1\2\u0439i\3\2\2\2\u043a\u043b\5\u0188\u00c5\2\u043b"+
		"\u043c\b\66\1\2\u043c\u0441\3\2\2\2\u043d\u043e\5\u00e4s\2\u043e\u043f"+
		"\b\66\1\2\u043f\u0441\3\2\2\2\u0440\u043a\3\2\2\2\u0440\u043d\3\2\2\2"+
		"\u0441k\3\2\2\2\u0442\u0443\5n8\2\u0443\u0444\b\67\1\2\u0444\u0449\3\2"+
		"\2\2\u0445\u0446\5p9\2\u0446\u0447\b\67\1\2\u0447\u0449\3\2\2\2\u0448"+
		"\u0442\3\2\2\2\u0448\u0445\3\2\2\2\u0449m\3\2\2\2\u044a\u044b\5\b\5\2"+
		"\u044b\u044c\b8\1\2\u044c\u0450\3\2\2\2\u044d\u044e\7\5\2\2\u044e\u0450"+
		"\b8\1\2\u044f\u044a\3\2\2\2\u044f\u044d\3\2\2\2\u0450o\3\2\2\2\u0451\u0452"+
		"\5r:\2\u0452\u0453\b9\1\2\u0453\u045b\3\2\2\2\u0454\u0455\5x=\2\u0455"+
		"\u0456\b9\1\2\u0456\u045b\3\2\2\2\u0457\u0458\5z>\2\u0458\u0459\b9\1\2"+
		"\u0459\u045b\3\2\2\2\u045a\u0451\3\2\2\2\u045a\u0454\3\2\2\2\u045a\u0457"+
		"\3\2\2\2\u045bq\3\2\2\2\u045c\u045d\5v<\2\u045d\u045e\b:\1\2\u045e\u0465"+
		"\3\2\2\2\u045f\u0460\7C\2\2\u0460\u0461\5\24\13\2\u0461\u0462\b:\1\2\u0462"+
		"\u0464\3\2\2\2\u0463\u045f\3\2\2\2\u0464\u0467\3\2\2\2\u0465\u0463\3\2"+
		"\2\2\u0465\u0466\3\2\2\2\u0466s\3\2\2\2\u0467\u0465\3\2\2\2\u0468\u0469"+
		"\5v<\2\u0469\u046a\b;\1\2\u046a\u0471\3\2\2\2\u046b\u046c\5r:\2\u046c"+
		"\u046d\7C\2\2\u046d\u046e\5\24\13\2\u046e\u046f\b;\1\2\u046f\u0471\3\2"+
		"\2\2\u0470\u0468\3\2\2\2\u0470\u046b\3\2\2\2\u0471u\3\2\2\2\u0472\u0473"+
		"\7h\2\2\u0473\u0477\b<\1\2\u0474\u0475\5$\23\2\u0475\u0476\b<\1\2\u0476"+
		"\u0478\3\2\2\2\u0477\u0474\3\2\2\2\u0477\u0478\3\2\2\2\u0478w\3\2\2\2"+
		"\u0479\u047a\7h\2\2\u047a\u047b\b=\1\2\u047by\3\2\2\2\u047c\u047d\5n8"+
		"\2\u047d\u047e\5\32\16\2\u047e\u047f\b>\1\2\u047f\u0489\3\2\2\2\u0480"+
		"\u0481\5r:\2\u0481\u0482\5\32\16\2\u0482\u0483\b>\1\2\u0483\u0489\3\2"+
		"\2\2\u0484\u0485\5x=\2\u0485\u0486\5\32\16\2\u0486\u0487\b>\1\2\u0487"+
		"\u0489\3\2\2\2\u0488\u047c\3\2\2\2\u0488\u0480\3\2\2\2\u0488\u0484\3\2"+
		"\2\2\u0489{\3\2\2\2\u048a\u048b\5~@\2\u048b\u048c\b?\1\2\u048c\u0491\3"+
		"\2\2\2\u048d\u048e\5\u00d2j\2\u048e\u048f\b?\1\2\u048f\u0491\3\2\2\2\u0490"+
		"\u048a\3\2\2\2\u0490\u048d\3\2\2\2\u0491\u0494\3\2\2\2\u0492\u0490\3\2"+
		"\2\2\u0492\u0493\3\2\2\2\u0493\u0495\3\2\2\2\u0494\u0492\3\2\2\2\u0495"+
		"\u0496\b?\1\2\u0496\u0497\b?\1\2\u0497\u0498\5\u0080A\2\u0498\u0499\5"+
		"\u0098M\2\u0499\u049a\b?\1\2\u049a}\3\2\2\2\u049b\u049c\7%\2\2\u049c\u04ae"+
		"\b@\1\2\u049d\u049e\7$\2\2\u049e\u04ae\b@\1\2\u049f\u04a0\7#\2\2\u04a0"+
		"\u04ae\b@\1\2\u04a1\u04a2\7\3\2\2\u04a2\u04ae\b@\1\2\u04a3\u04a4\7(\2"+
		"\2\u04a4\u04ae\b@\1\2\u04a5\u04a6\7\24\2\2\u04a6\u04ae\b@\1\2\u04a7\u04a8"+
		"\7,\2\2\u04a8\u04ae\b@\1\2\u04a9\u04aa\7 \2\2\u04aa\u04ae\b@\1\2\u04ab"+
		"\u04ac\7)\2\2\u04ac\u04ae\b@\1\2\u04ad\u049b\3\2\2\2\u04ad\u049d\3\2\2"+
		"\2\u04ad\u049f\3\2\2\2\u04ad\u04a1\3\2\2\2\u04ad\u04a3\3\2\2\2\u04ad\u04a5"+
		"\3\2\2\2\u04ad\u04a7\3\2\2\2\u04ad\u04a9\3\2\2\2\u04ad\u04ab\3\2\2\2\u04ae"+
		"\177\3\2\2\2\u04af\u04b0\5\u0082B\2\u04b0\u04b1\bA\1\2\u04b1\u04b5\5\u0084"+
		"C\2\u04b2\u04b3\5\u0092J\2\u04b3\u04b4\bA\1\2\u04b4\u04b6\3\2\2\2\u04b5"+
		"\u04b2\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04cb\3\2\2\2\u04b7\u04b8\5N"+
		"(\2\u04b8\u04be\bA\1\2\u04b9\u04ba\5\u00d2j\2\u04ba\u04bb\bA\1\2\u04bb"+
		"\u04bd\3\2\2\2\u04bc\u04b9\3\2\2\2\u04bd\u04c0\3\2\2\2\u04be\u04bc\3\2"+
		"\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c1\3\2\2\2\u04c0\u04be\3\2\2\2\u04c1"+
		"\u04c2\bA\1\2\u04c2\u04c3\5\u0082B\2\u04c3\u04c4\bA\1\2\u04c4\u04c8\5"+
		"\u0084C\2\u04c5\u04c6\5\u0092J\2\u04c6\u04c7\bA\1\2\u04c7\u04c9\3\2\2"+
		"\2\u04c8\u04c5\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04cb\3\2\2\2\u04ca\u04af"+
		"\3\2\2\2\u04ca\u04b7\3\2\2\2\u04cb\u0081\3\2\2\2\u04cc\u04cd\5l\67\2\u04cd"+
		"\u04ce\bB\1\2\u04ce\u04d2\3\2\2\2\u04cf\u04d0\7\62\2\2\u04d0\u04d2\bB"+
		"\1\2\u04d1\u04cc\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d2\u0083\3\2\2\2\u04d3"+
		"\u04d4\7h\2\2\u04d4\u04d5\bC\1\2\u04d5\u04d9\7;\2\2\u04d6\u04d7\5\u0086"+
		"D\2\u04d7\u04d8\bC\1\2\u04d8\u04da\3\2\2\2\u04d9\u04d6\3\2\2\2\u04d9\u04da"+
		"\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04df\7<\2\2\u04dc\u04dd\5\32\16\2"+
		"\u04dd\u04de\bC\1\2\u04de\u04e0\3\2\2\2\u04df\u04dc\3\2\2\2\u04df\u04e0"+
		"\3\2\2\2\u04e0\u0085\3\2\2\2\u04e1\u04e2\5\u0088E\2\u04e2\u04e3\bD\1\2"+
		"\u04e3\u04e4\3\2\2\2\u04e4\u04e5\7B\2\2\u04e5\u04e6\5\u008eH\2\u04e6\u04e7"+
		"\bD\1\2\u04e7\u04e8\3\2\2\2\u04e8\u04e9\bD\1\2\u04e9\u04f0\3\2\2\2\u04ea"+
		"\u04eb\5\u008eH\2\u04eb\u04ec\bD\1\2\u04ec\u04ed\3\2\2\2\u04ed\u04ee\b"+
		"D\1\2\u04ee\u04f0\3\2\2\2\u04ef\u04e1\3\2\2\2\u04ef\u04ea\3\2\2\2\u04f0"+
		"\u0087\3\2\2\2\u04f1\u04f2\5\u008aF\2\u04f2\u04f3\bE\1\2\u04f3\u04fa\3"+
		"\2\2\2\u04f4\u04f5\7B\2\2\u04f5\u04f6\5\u008aF\2\u04f6\u04f7\bE\1\2\u04f7"+
		"\u04f9\3\2\2\2\u04f8\u04f4\3\2\2\2\u04f9\u04fc\3\2\2\2\u04fa\u04f8\3\2"+
		"\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fd\3\2\2\2\u04fc\u04fa\3\2\2\2\u04fd"+
		"\u04fe\bE\1\2\u04fe\u050e\3\2\2\2\u04ff\u0500\5\u0090I\2\u0500\u0501\b"+
		"E\1\2\u0501\u0508\3\2\2\2\u0502\u0503\7B\2\2\u0503\u0504\5\u008aF\2\u0504"+
		"\u0505\bE\1\2\u0505\u0507\3\2\2\2\u0506\u0502\3\2\2\2\u0507\u050a\3\2"+
		"\2\2\u0508\u0506\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u050b\3\2\2\2\u050a"+
		"\u0508\3\2\2\2\u050b\u050c\bE\1\2\u050c\u050e\3\2\2\2\u050d\u04f1\3\2"+
		"\2\2\u050d\u04ff\3\2\2\2\u050e\u0089\3\2\2\2\u050f\u0510\5\u008cG\2\u0510"+
		"\u0511\bF\1\2\u0511\u0516\3\2\2\2\u0512\u0513\5\u00d2j\2\u0513\u0514\b"+
		"F\1\2\u0514\u0516\3\2\2\2\u0515\u050f\3\2\2\2\u0515\u0512\3\2\2\2\u0516"+
		"\u0519\3\2\2\2\u0517\u0515\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u051a\3\2"+
		"\2\2\u0519\u0517\3\2\2\2\u051a\u051b\bF\1\2\u051b\u051c\5h\65\2\u051c"+
		"\u051d\bF\1\2\u051d\u008b\3\2\2\2\u051e\u051f\7\24\2\2\u051f\u0520\bG"+
		"\1\2\u0520\u008d\3\2\2\2\u0521\u0522\5\u008cG\2\u0522\u0523\bH\1\2\u0523"+
		"\u0528\3\2\2\2\u0524\u0525\5\u00d2j\2\u0525\u0526\bH\1\2\u0526\u0528\3"+
		"\2\2\2\u0527\u0521\3\2\2\2\u0527\u0524\3\2\2\2\u0528\u052b\3\2\2\2\u0529"+
		"\u0527\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u052c\3\2\2\2\u052b\u0529\3\2"+
		"\2\2\u052c\u0532\5l\67\2\u052d\u052e\5\u00d2j\2\u052e\u052f\bH\1\2\u052f"+
		"\u0531\3\2\2\2\u0530\u052d\3\2\2\2\u0531\u0534\3\2\2\2\u0532\u0530\3\2"+
		"\2\2\u0532\u0533\3\2\2\2\u0533\u0535\3\2\2\2\u0534\u0532\3\2\2\2\u0535"+
		"\u0536\7j\2\2\u0536\u0537\5f\64\2\u0537\u0538\bH\1\2\u0538\u053d\3\2\2"+
		"\2\u0539\u053a\5\u008aF\2\u053a\u053b\bH\1\2\u053b\u053d\3\2\2\2\u053c"+
		"\u0529\3\2\2\2\u053c\u0539\3\2\2\2\u053d\u008f\3\2\2\2\u053e\u053f\5\u00d2"+
		"j\2\u053f\u0540\bI\1\2\u0540\u0542\3\2\2\2\u0541\u053e\3\2\2\2\u0542\u0545"+
		"\3\2\2\2\u0543\u0541\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0546\3\2\2\2\u0545"+
		"\u0543\3\2\2\2\u0546\u0547\5l\67\2\u0547\u0548\7h\2\2\u0548\u0549\7C\2"+
		"\2\u0549\u054a\7-\2\2\u054a\u054b\bI\1\2\u054b\u0091\3\2\2\2\u054c\u054d"+
		"\7/\2\2\u054d\u054e\5\u0094K\2\u054e\u054f\bJ\1\2\u054f\u0093\3\2\2\2"+
		"\u0550\u0551\5\u0096L\2\u0551\u0552\bK\1\2\u0552\u0559\3\2\2\2\u0553\u0554"+
		"\7B\2\2\u0554\u0555\5\u0096L\2\u0555\u0556\bK\1\2\u0556\u0558\3\2\2\2"+
		"\u0557\u0553\3\2\2\2\u0558\u055b\3\2\2\2\u0559\u0557\3\2\2\2\u0559\u055a"+
		"\3\2\2\2\u055a\u055c\3\2\2\2\u055b\u0559\3\2\2\2\u055c\u055d\bK\1\2\u055d"+
		"\u0095\3\2\2\2\u055e\u055f\5\22\n\2\u055f\u0560\bL\1\2\u0560\u0565\3\2"+
		"\2\2\u0561\u0562\5\26\f\2\u0562\u0563\bL\1\2\u0563\u0565\3\2\2\2\u0564"+
		"\u055e\3\2\2\2\u0564\u0561\3\2\2\2\u0565\u0097\3\2\2\2\u0566\u0567\5\u00e8"+
		"u\2\u0567\u0568\bM\1\2\u0568\u056c\3\2\2\2\u0569\u056a\7A\2\2\u056a\u056c"+
		"\bM\1\2\u056b\u0566\3\2\2\2\u056b\u0569\3\2\2\2\u056c\u0099\3\2\2\2\u056d"+
		"\u056e\5\u00e8u\2\u056e\u056f\bN\1\2\u056f\u009b\3\2\2\2\u0570\u0571\7"+
		"(\2\2\u0571\u0572\5\u00e8u\2\u0572\u0573\bO\1\2\u0573\u009d\3\2\2\2\u0574"+
		"\u0575\5\u00a0Q\2\u0575\u0576\bP\1\2\u0576\u057b\3\2\2\2\u0577\u0578\5"+
		"\u00d2j\2\u0578\u0579\bP\1\2\u0579\u057b\3\2\2\2\u057a\u0574\3\2\2\2\u057a"+
		"\u0577\3\2\2\2\u057b\u057e\3\2\2\2\u057c\u057a\3\2\2\2\u057c\u057d\3\2"+
		"\2\2\u057d\u057f\3\2\2\2\u057e\u057c\3\2\2\2\u057f\u0580\bP\1\2\u0580"+
		"\u0581\bP\1\2\u0581\u0585\5\u00a2R\2\u0582\u0583\5\u0092J\2\u0583\u0584"+
		"\bP\1\2\u0584\u0586\3\2\2\2\u0585\u0582\3\2\2\2\u0585\u0586\3\2\2\2\u0586"+
		"\u0587\3\2\2\2\u0587\u0588\5\u00a4S\2\u0588\u0589\bP\1\2\u0589\u009f\3"+
		"\2\2\2\u058a\u058b\7%\2\2\u058b\u0591\bQ\1\2\u058c\u058d\7$\2\2\u058d"+
		"\u0591\bQ\1\2\u058e\u058f\7#\2\2\u058f\u0591\bQ\1\2\u0590\u058a\3\2\2"+
		"\2\u0590\u058c\3\2\2\2\u0590\u058e\3\2\2\2\u0591\u00a1\3\2\2\2\u0592\u0593"+
		"\5N(\2\u0593\u0594\bR\1\2\u0594\u0596\3\2\2\2\u0595\u0592\3\2\2\2\u0595"+
		"\u0596\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u0598\7h\2\2\u0598\u0599\bR\1"+
		"\2\u0599\u059d\7;\2\2\u059a\u059b\5\u0086D\2\u059b\u059c\bR\1\2\u059c"+
		"\u059e\3\2\2\2\u059d\u059a\3\2\2\2\u059d\u059e\3\2\2\2\u059e\u059f\3\2"+
		"\2\2\u059f\u05a0\7<\2\2\u05a0\u00a3\3\2\2\2\u05a1\u05a2\bS\1\2\u05a2\u05a6"+
		"\7=\2\2\u05a3\u05a4\5\u00a6T\2\u05a4\u05a5\bS\1\2\u05a5\u05a7\3\2\2\2"+
		"\u05a6\u05a3\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05ab\3\2\2\2\u05a8\u05a9"+
		"\5\u00eav\2\u05a9\u05aa\bS\1\2\u05aa\u05ac\3\2\2\2\u05ab\u05a8\3\2\2\2"+
		"\u05ab\u05ac\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad\u05ae\7>\2\2\u05ae\u05af"+
		"\bS\1\2\u05af\u00a5\3\2\2\2\u05b0\u05b1\5$\23\2\u05b1\u05b2\bT\1\2\u05b2"+
		"\u05b4\3\2\2\2\u05b3\u05b0\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b5\3\2"+
		"\2\2\u05b5\u05b6\7-\2\2\u05b6\u05ba\7;\2\2\u05b7\u05b8\5\u0178\u00bd\2"+
		"\u05b8\u05b9\bT\1\2\u05b9\u05bb\3\2\2\2\u05ba\u05b7\3\2\2\2\u05ba\u05bb"+
		"\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc\u05bd\7<\2\2\u05bd\u05be\7A\2\2\u05be"+
		"\u05f3\bT\1\2\u05bf\u05c0\5$\23\2\u05c0\u05c1\bT\1\2\u05c1\u05c3\3\2\2"+
		"\2\u05c2\u05bf\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4\u05c5"+
		"\7*\2\2\u05c5\u05c9\7;\2\2\u05c6\u05c7\5\u0178\u00bd\2\u05c7\u05c8\bT"+
		"\1\2\u05c8\u05ca\3\2\2\2\u05c9\u05c6\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca"+
		"\u05cb\3\2\2\2\u05cb\u05cc\7<\2\2\u05cc\u05cd\7A\2\2\u05cd\u05f3\bT\1"+
		"\2\u05ce\u05cf\5\62\32\2\u05cf\u05d3\7C\2\2\u05d0\u05d1\5$\23\2\u05d1"+
		"\u05d2\bT\1\2\u05d2\u05d4\3\2\2\2\u05d3\u05d0\3\2\2\2\u05d3\u05d4\3\2"+
		"\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d6\7*\2\2\u05d6\u05da\7;\2\2\u05d7\u05d8"+
		"\5\u0178\u00bd\2\u05d8\u05d9\bT\1\2\u05d9\u05db\3\2\2\2\u05da\u05d7\3"+
		"\2\2\2\u05da\u05db\3\2\2\2\u05db\u05dc\3\2\2\2\u05dc\u05dd\7<\2\2\u05dd"+
		"\u05de\7A\2\2\u05de\u05df\bT\1\2\u05df\u05f3\3\2\2\2\u05e0\u05e1\5\u014a"+
		"\u00a6\2\u05e1\u05e5\7C\2\2\u05e2\u05e3\5$\23\2\u05e3\u05e4\bT\1\2\u05e4"+
		"\u05e6\3\2\2\2\u05e5\u05e2\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05e7\3\2"+
		"\2\2\u05e7\u05e8\7*\2\2\u05e8\u05ec\7;\2\2\u05e9\u05ea\5\u0178\u00bd\2"+
		"\u05ea\u05eb\bT\1\2\u05eb\u05ed\3\2\2\2\u05ec\u05e9\3\2\2\2\u05ec\u05ed"+
		"\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee\u05ef\7<\2\2\u05ef\u05f0\7A\2\2\u05f0"+
		"\u05f1\bT\1\2\u05f1\u05f3\3\2\2\2\u05f2\u05b3\3\2\2\2\u05f2\u05c2\3\2"+
		"\2\2\u05f2\u05ce\3\2\2\2\u05f2\u05e0\3\2\2\2\u05f3\u00a7\3\2\2\2\u05f4"+
		"\u05f5\5L\'\2\u05f5\u05f6\bU\1\2\u05f6\u05fb\3\2\2\2\u05f7\u05f8\5\u00d2"+
		"j\2\u05f8\u05f9\bU\1\2\u05f9\u05fb\3\2\2\2\u05fa\u05f4\3\2\2\2\u05fa\u05f7"+
		"\3\2\2\2\u05fb\u05fe\3\2\2\2\u05fc\u05fa\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd"+
		"\u05ff\3\2\2\2\u05fe\u05fc\3\2\2\2\u05ff\u0600\7\22\2\2\u0600\u0604\7"+
		"h\2\2\u0601\u0602\5T+\2\u0602\u0603\bU\1\2\u0603\u0605\3\2\2\2\u0604\u0601"+
		"\3\2\2\2\u0604\u0605\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0607\bU\1\2\u0607"+
		"\u0608\5\u00aaV\2\u0608\u00a9\3\2\2\2\u0609\u060b\7=\2\2\u060a\u060c\5"+
		"\u00acW\2\u060b\u060a\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060e\3\2\2\2"+
		"\u060d\u060f\7B\2\2\u060e\u060d\3\2\2\2\u060e\u060f\3\2\2\2\u060f\u0611"+
		"\3\2\2\2\u0610\u0612\5\u00b0Y\2\u0611\u0610\3\2\2\2\u0611\u0612\3\2\2"+
		"\2\u0612\u0613\3\2\2\2\u0613\u0614\7>\2\2\u0614\u0615\bV\1\2\u0615\u00ab"+
		"\3\2\2\2\u0616\u061b\5\u00aeX\2\u0617\u0618\7B\2\2\u0618\u061a\5\u00ae"+
		"X\2\u0619\u0617\3\2\2\2\u061a\u061d\3\2\2\2\u061b\u0619\3\2\2\2\u061b"+
		"\u061c\3\2\2\2\u061c\u00ad\3\2\2\2\u061d\u061b\3\2\2\2\u061e\u061f\5\u00d2"+
		"j\2\u061f\u0620\bX\1\2\u0620\u0622\3\2\2\2\u0621\u061e\3\2\2\2\u0622\u0625"+
		"\3\2\2\2\u0623\u0621\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u0626\3\2\2\2\u0625"+
		"\u0623\3\2\2\2\u0626\u062e\7h\2\2\u0627\u062b\7;\2\2\u0628\u0629\5\u0178"+
		"\u00bd\2\u0629\u062a\bX\1\2\u062a\u062c\3\2\2\2\u062b\u0628\3\2\2\2\u062b"+
		"\u062c\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u062f\7<\2\2\u062e\u0627\3\2"+
		"\2\2\u062e\u062f\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0632\bX\1\2\u0631"+
		"\u0633\5X-\2\u0632\u0631\3\2\2\2\u0632\u0633\3\2\2\2\u0633\u00af\3\2\2"+
		"\2\u0634\u0638\7A\2\2\u0635\u0637\5Z.\2\u0636\u0635\3\2\2\2\u0637\u063a"+
		"\3\2\2\2\u0638\u0636\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u00b1\3\2\2\2\u063a"+
		"\u0638\3\2\2\2\u063b\u063c\5\u00b4[\2\u063c\u063d\bZ\1\2\u063d\u0642\3"+
		"\2\2\2\u063e\u063f\5\u00c6d\2\u063f\u0640\bZ\1\2\u0640\u0642\3\2\2\2\u0641"+
		"\u063b\3\2\2\2\u0641\u063e\3\2\2\2\u0642\u00b3\3\2\2\2\u0643\u0644\5\u00b6"+
		"\\\2\u0644\u0645\b[\1\2\u0645\u064a\3\2\2\2\u0646\u0647\5\u00d2j\2\u0647"+
		"\u0648\b[\1\2\u0648\u064a\3\2\2\2\u0649\u0643\3\2\2\2\u0649\u0646\3\2"+
		"\2\2\u064a\u064d\3\2\2\2\u064b\u0649\3\2\2\2\u064b\u064c\3\2\2\2\u064c"+
		"\u064e\3\2\2\2\u064d\u064b\3\2\2\2\u064e\u064f\b[\1\2\u064f\u0650\7\36"+
		"\2\2\u0650\u0654\7h\2\2\u0651\u0652\5N(\2\u0652\u0653\b[\1\2\u0653\u0655"+
		"\3\2\2\2\u0654\u0651\3\2\2\2\u0654\u0655\3\2\2\2\u0655\u0659\3\2\2\2\u0656"+
		"\u0657\5\u00b8]\2\u0657\u0658\b[\1\2\u0658\u065a\3\2\2\2\u0659\u0656\3"+
		"\2\2\2\u0659\u065a\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u065c\b[\1\2\u065c"+
		"\u065d\5\u00ba^\2\u065d\u00b5\3\2\2\2\u065e\u065f\7%\2\2\u065f\u066b\b"+
		"\\\1\2\u0660\u0661\7$\2\2\u0661\u066b\b\\\1\2\u0662\u0663\7#\2\2\u0663"+
		"\u066b\b\\\1\2\u0664\u0665\7\3\2\2\u0665\u066b\b\\\1\2\u0666\u0667\7("+
		"\2\2\u0667\u066b\b\\\1\2\u0668\u0669\7)\2\2\u0669\u066b\b\\\1\2\u066a"+
		"\u065e\3\2\2\2\u066a\u0660\3\2\2\2\u066a\u0662\3\2\2\2\u066a\u0664\3\2"+
		"\2\2\u066a\u0666\3\2\2\2\u066a\u0668\3\2\2\2\u066b\u00b7\3\2\2\2\u066c"+
		"\u066d\7\23\2\2\u066d\u066e\5V,\2\u066e\u066f\b]\1\2\u066f\u00b9\3\2\2"+
		"\2\u0670\u0674\7=\2\2\u0671\u0673\5\u00bc_\2\u0672\u0671\3\2\2\2\u0673"+
		"\u0676\3\2\2\2\u0674\u0672\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u0677\3\2"+
		"\2\2\u0676\u0674\3\2\2\2\u0677\u0678\7>\2\2\u0678\u0679\b^\1\2\u0679\u00bb"+
		"\3\2\2\2\u067a\u0686\5\u00be`\2\u067b\u067c\5\u00c2b\2\u067c\u067d\b_"+
		"\1\2\u067d\u0686\3\2\2\2\u067e\u067f\5H%\2\u067f\u0680\b_\1\2\u0680\u0686"+
		"\3\2\2\2\u0681\u0682\5\u00b2Z\2\u0682\u0683\b_\1\2\u0683\u0686\3\2\2\2"+
		"\u0684\u0686\7A\2\2\u0685\u067a\3\2\2\2\u0685\u067b\3\2\2\2\u0685\u067e"+
		"\3\2\2\2\u0685\u0681\3\2\2\2\u0685\u0684\3\2\2\2\u0686\u00bd\3\2\2\2\u0687"+
		"\u0688\5\u00c0a\2\u0688\u0689\b`\1\2\u0689\u068e\3\2\2\2\u068a\u068b\5"+
		"\u00d2j\2\u068b\u068c\b`\1\2\u068c\u068e\3\2\2\2\u068d\u0687\3\2\2\2\u068d"+
		"\u068a\3\2\2\2\u068e\u0691\3\2\2\2\u068f\u068d\3\2\2\2\u068f\u0690\3\2"+
		"\2\2\u0690\u0692\3\2\2\2\u0691\u068f\3\2\2\2\u0692\u0693\b`\1\2\u0693"+
		"\u0694\5l\67\2\u0694\u0695\5b\62\2\u0695\u0696\7A\2\2\u0696\u00bf\3\2"+
		"\2\2\u0697\u0698\7%\2\2\u0698\u069e\ba\1\2\u0699\u069a\7(\2\2\u069a\u069e"+
		"\ba\1\2\u069b\u069c\7\24\2\2\u069c\u069e\ba\1\2\u069d\u0697\3\2\2\2\u069d"+
		"\u0699\3\2\2\2\u069d\u069b\3\2\2\2\u069e\u00c1\3\2\2\2\u069f\u06a0\5\u00c4"+
		"c\2\u06a0\u06a1\bb\1\2\u06a1\u06a6\3\2\2\2\u06a2\u06a3\5\u00d2j\2\u06a3"+
		"\u06a4\bb\1\2\u06a4\u06a6\3\2\2\2\u06a5\u069f\3\2\2\2\u06a5\u06a2\3\2"+
		"\2\2\u06a6\u06a9\3\2\2\2\u06a7\u06a5\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8"+
		"\u06aa\3\2\2\2\u06a9\u06a7\3\2\2\2\u06aa\u06ab\bb\1\2\u06ab\u06ac\bb\1"+
		"\2\u06ac\u06ad\5\u0080A\2\u06ad\u06ae\5\u0098M\2\u06ae\u06af\bb\1\2\u06af"+
		"\u00c3\3\2\2\2\u06b0\u06b1\7%\2\2\u06b1\u06bb\bc\1\2\u06b2\u06b3\7\3\2"+
		"\2\u06b3\u06bb\bc\1\2\u06b4\u06b5\7\16\2\2\u06b5\u06bb\bc\1\2\u06b6\u06b7"+
		"\7(\2\2\u06b7\u06bb\bc\1\2\u06b8\u06b9\7)\2\2\u06b9\u06bb\bc\1\2\u06ba"+
		"\u06b0\3\2\2\2\u06ba\u06b2\3\2\2\2\u06ba\u06b4\3\2\2\2\u06ba\u06b6\3\2"+
		"\2\2\u06ba\u06b8\3\2\2\2\u06bb\u00c5\3\2\2\2\u06bc\u06bd\5\u00b6\\\2\u06bd"+
		"\u06be\bd\1\2\u06be\u06c3\3\2\2\2\u06bf\u06c0\5\u00d2j\2\u06c0\u06c1\b"+
		"d\1\2\u06c1\u06c3\3\2\2\2\u06c2\u06bc\3\2\2\2\u06c2\u06bf\3\2\2\2\u06c3"+
		"\u06c6\3\2\2\2\u06c4\u06c2\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5\u06c7\3\2"+
		"\2\2\u06c6\u06c4\3\2\2\2\u06c7\u06c8\7i\2\2\u06c8\u06c9\7\36\2\2\u06c9"+
		"\u06ca\7h\2\2\u06ca\u06cb\bd\1\2\u06cb\u06cc\5\u00c8e\2\u06cc\u00c7\3"+
		"\2\2\2\u06cd\u06d1\7=\2\2\u06ce\u06d0\5\u00caf\2\u06cf\u06ce\3\2\2\2\u06d0"+
		"\u06d3\3\2\2\2\u06d1\u06cf\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2\u06d4\3\2"+
		"\2\2\u06d3\u06d1\3\2\2\2\u06d4\u06d5\7>\2\2\u06d5\u06d6\be\1\2\u06d6\u00c9"+
		"\3\2\2\2\u06d7\u06d8\5\u00ccg\2\u06d8\u06d9\bf\1\2\u06d9\u06e3\3\2\2\2"+
		"\u06da\u06e3\5\u00be`\2\u06db\u06dc\5H%\2\u06dc\u06dd\bf\1\2\u06dd\u06e3"+
		"\3\2\2\2\u06de\u06df\5\u00b2Z\2\u06df\u06e0\bf\1\2\u06e0\u06e3\3\2\2\2"+
		"\u06e1\u06e3\7A\2\2\u06e2\u06d7\3\2\2\2\u06e2\u06da\3\2\2\2\u06e2\u06db"+
		"\3\2\2\2\u06e2\u06de\3\2\2\2\u06e2\u06e1\3\2\2\2\u06e3\u00cb\3\2\2\2\u06e4"+
		"\u06e5\5\u00ceh\2\u06e5\u06e6\bg\1\2\u06e6\u06eb\3\2\2\2\u06e7\u06e8\5"+
		"\u00d2j\2\u06e8\u06e9\bg\1\2\u06e9\u06eb\3\2\2\2\u06ea\u06e4\3\2\2\2\u06ea"+
		"\u06e7\3\2\2\2\u06eb\u06ee\3\2\2\2\u06ec\u06ea\3\2\2\2\u06ec\u06ed\3\2"+
		"\2\2\u06ed\u06ef\3\2\2\2\u06ee\u06ec\3\2\2\2\u06ef\u06f0\bg\1\2\u06f0"+
		"\u06f1\5l\67\2\u06f1\u06f2\7h\2\2\u06f2\u06f3\7;\2\2\u06f3\u06f7\7<\2"+
		"\2\u06f4\u06f5\5\32\16\2\u06f5\u06f6\bg\1\2\u06f6\u06f8\3\2\2\2\u06f7"+
		"\u06f4\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8\u06fc\3\2\2\2\u06f9\u06fa\5\u00d0"+
		"i\2\u06fa\u06fb\bg\1\2\u06fb\u06fd\3\2\2\2\u06fc\u06f9\3\2\2\2\u06fc\u06fd"+
		"\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u06ff\7A\2\2\u06ff\u0700\bg\1\2\u0700"+
		"\u00cd\3\2\2\2\u0701\u0702\7%\2\2\u0702\u0706\bh\1\2\u0703\u0704\7\3\2"+
		"\2\u0704\u0706\bh\1\2\u0705\u0701\3\2\2\2\u0705\u0703\3\2\2\2\u0706\u00cf"+
		"\3\2\2\2\u0707\u0708\7\16\2\2\u0708\u0709\5\u00dan\2\u0709\u070a\bi\1"+
		"\2\u070a\u00d1\3\2\2\2\u070b\u070c\5\u00d4k\2\u070c\u070d\bj\1\2\u070d"+
		"\u0715\3\2\2\2\u070e\u070f\5\u00e0q\2\u070f\u0710\bj\1\2\u0710\u0715\3"+
		"\2\2\2\u0711\u0712\5\u00e2r\2\u0712\u0713\bj\1\2\u0713\u0715\3\2\2\2\u0714"+
		"\u070b\3\2\2\2\u0714\u070e\3\2\2\2\u0714\u0711\3\2\2\2\u0715\u00d3\3\2"+
		"\2\2\u0716\u0717\7i\2\2\u0717\u0718\5.\30\2\u0718\u0719\bk\1\2\u0719\u071b"+
		"\7;\2\2\u071a\u071c\5\u00d6l\2\u071b\u071a\3\2\2\2\u071b\u071c\3\2\2\2"+
		"\u071c\u071d\3\2\2\2\u071d\u071e\7<\2\2\u071e\u071f\bk\1\2\u071f\u00d5"+
		"\3\2\2\2\u0720\u0725\5\u00d8m\2\u0721\u0722\7B\2\2\u0722\u0724\5\u00d8"+
		"m\2\u0723\u0721\3\2\2\2\u0724\u0727\3\2\2\2\u0725\u0723\3\2\2\2\u0725"+
		"\u0726\3\2\2\2\u0726\u00d7\3\2\2\2\u0727\u0725\3\2\2\2\u0728\u0729\7h"+
		"\2\2\u0729\u072a\7D\2\2\u072a\u072b\5\u00dan\2\u072b\u072c\bm\1\2\u072c"+
		"\u00d9\3\2\2\2\u072d\u072e\5\u019a\u00ce\2\u072e\u072f\bn\1\2\u072f\u0737"+
		"\3\2\2\2\u0730\u0731\5\u00dco\2\u0731\u0732\bn\1\2\u0732\u0737\3\2\2\2"+
		"\u0733\u0734\5\u00d2j\2\u0734\u0735\bn\1\2\u0735\u0737\3\2\2\2\u0736\u072d"+
		"\3\2\2\2\u0736\u0730\3\2\2\2\u0736\u0733\3\2\2\2\u0737\u00db\3\2\2\2\u0738"+
		"\u073c\7=\2\2\u0739\u073a\5\u00dep\2\u073a\u073b\bo\1\2\u073b\u073d\3"+
		"\2\2\2\u073c\u0739\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u073f\3\2\2\2\u073e"+
		"\u0740\7B\2\2\u073f\u073e\3\2\2\2\u073f\u0740\3\2\2\2\u0740\u0741\3\2"+
		"\2\2\u0741\u0742\7>\2\2\u0742\u0743\bo\1\2\u0743\u00dd\3\2\2\2\u0744\u0745"+
		"\5\u00dan\2\u0745\u0746\bp\1\2\u0746\u074d\3\2\2\2\u0747\u0748\7B\2\2"+
		"\u0748\u0749\5\u00dan\2\u0749\u074a\bp\1\2\u074a\u074c\3\2\2\2\u074b\u0747"+
		"\3\2\2\2\u074c\u074f\3\2\2\2\u074d\u074b\3\2\2\2\u074d\u074e\3\2\2\2\u074e"+
		"\u0750\3\2\2\2\u074f\u074d\3\2\2\2\u0750\u0751\bp\1\2\u0751\u00df\3\2"+
		"\2\2\u0752\u0753\7i\2\2\u0753\u0754\5.\30\2\u0754\u0755\bq\1\2\u0755\u00e1"+
		"\3\2\2\2\u0756\u0757\7i\2\2\u0757\u0758\5.\30\2\u0758\u0759\7;\2\2\u0759"+
		"\u075a\5\u00dan\2\u075a\u075b\7<\2\2\u075b\u075c\br\1\2\u075c\u00e3\3"+
		"\2\2\2\u075d\u0761\7=\2\2\u075e\u075f\5\u00e6t\2\u075f\u0760\bs\1\2\u0760"+
		"\u0762\3\2\2\2\u0761\u075e\3\2\2\2\u0761\u0762\3\2\2\2\u0762\u0764\3\2"+
		"\2\2\u0763\u0765\7B\2\2\u0764\u0763\3\2\2\2\u0764\u0765\3\2\2\2\u0765"+
		"\u0766\3\2\2\2\u0766\u0767\7>\2\2\u0767\u0768\bs\1\2\u0768\u00e5\3\2\2"+
		"\2\u0769\u076a\5j\66\2\u076a\u076b\bt\1\2\u076b\u0772\3\2\2\2\u076c\u076d"+
		"\7B\2\2\u076d\u076e\5j\66\2\u076e\u076f\bt\1\2\u076f\u0771\3\2\2\2\u0770"+
		"\u076c\3\2\2\2\u0771\u0774\3\2\2\2\u0772\u0770\3\2\2\2\u0772\u0773\3\2"+
		"\2\2\u0773\u0775\3\2\2\2\u0774\u0772\3\2\2\2\u0775\u0776\bt\1\2\u0776"+
		"\u00e7\3\2\2\2\u0777\u0778\bu\1\2\u0778\u077c\7=\2\2\u0779\u077a\5\u00ea"+
		"v\2\u077a\u077b\bu\1\2\u077b\u077d\3\2\2\2\u077c\u0779\3\2\2\2\u077c\u077d"+
		"\3\2\2\2\u077d\u077e\3\2\2\2\u077e\u077f\7>\2\2\u077f\u0780\bu\1\2\u0780"+
		"\u00e9\3\2\2\2\u0781\u0782\5\u00ecw\2\u0782\u0783\bv\1\2\u0783\u0789\3"+
		"\2\2\2\u0784\u0785\5\u00ecw\2\u0785\u0786\bv\1\2\u0786\u0788\3\2\2\2\u0787"+
		"\u0784\3\2\2\2\u0788\u078b\3\2\2\2\u0789\u0787\3\2\2\2\u0789\u078a\3\2"+
		"\2\2\u078a\u078c\3\2\2\2\u078b\u0789\3\2\2\2\u078c\u078d\bv\1\2\u078d"+
		"\u00eb\3\2\2\2\u078e\u078f\5\u00eex\2\u078f\u0790\bw\1\2\u0790\u0798\3"+
		"\2\2\2\u0791\u0792\5H%\2\u0792\u0793\bw\1\2\u0793\u0798\3\2\2\2\u0794"+
		"\u0795\5\u00f2z\2\u0795\u0796\bw\1\2\u0796\u0798\3\2\2\2\u0797\u078e\3"+
		"\2\2\2\u0797\u0791\3\2\2\2\u0797\u0794\3\2\2\2\u0798\u00ed\3\2\2\2\u0799"+
		"\u079a\5\u00f0y\2\u079a\u079b\7A\2\2\u079b\u079c\bx\1\2\u079c\u00ef\3"+
		"\2\2\2\u079d\u079e\5\u008cG\2\u079e\u079f\by\1\2\u079f\u07a4\3\2\2\2\u07a0"+
		"\u07a1\5\u00d2j\2\u07a1\u07a2\by\1\2\u07a2\u07a4\3\2\2\2\u07a3\u079d\3"+
		"\2\2\2\u07a3\u07a0\3\2\2\2\u07a4\u07a7\3\2\2\2\u07a5\u07a3\3\2\2\2\u07a5"+
		"\u07a6\3\2\2\2\u07a6\u07a8\3\2\2\2\u07a7\u07a5\3\2\2\2\u07a8\u07a9\5l"+
		"\67\2\u07a9\u07aa\5b\62\2\u07aa\u07ab\by\1\2\u07ab\u00f1\3\2\2\2\u07ac"+
		"\u07ad\5\u00f6|\2\u07ad\u07ae\bz\1\2\u07ae\u07bf\3\2\2\2\u07af\u07b0\5"+
		"\u00fa~\2\u07b0\u07b1\bz\1\2\u07b1\u07bf\3\2\2\2\u07b2\u07b3\5\u0102\u0082"+
		"\2\u07b3\u07b4\bz\1\2\u07b4\u07bf\3\2\2\2\u07b5\u07b6\5\u0104\u0083\2"+
		"\u07b6\u07b7\bz\1\2\u07b7\u07bf\3\2\2\2\u07b8\u07b9\5\u0114\u008b\2\u07b9"+
		"\u07ba\bz\1\2\u07ba\u07bf\3\2\2\2\u07bb\u07bc\5\u011a\u008e\2\u07bc\u07bd"+
		"\bz\1\2\u07bd\u07bf\3\2\2\2\u07be\u07ac\3\2\2\2\u07be\u07af\3\2\2\2\u07be"+
		"\u07b2\3\2\2\2\u07be\u07b5\3\2\2\2\u07be\u07b8\3\2\2\2\u07be\u07bb\3\2"+
		"\2\2\u07bf\u00f3\3\2\2\2\u07c0\u07c1\5\u00f6|\2\u07c1\u07c2\b{\1\2\u07c2"+
		"\u07d0\3\2\2\2\u07c3\u07c4\5\u00fc\177\2\u07c4\u07c5\b{\1\2\u07c5\u07d0"+
		"\3\2\2\2\u07c6\u07c7\5\u0106\u0084\2\u07c7\u07c8\b{\1\2\u07c8\u07d0\3"+
		"\2\2\2\u07c9\u07ca\5\u0116\u008c\2\u07ca\u07cb\b{\1\2\u07cb\u07d0\3\2"+
		"\2\2\u07cc\u07cd\5\u011c\u008f\2\u07cd\u07ce\b{\1\2\u07ce\u07d0\3\2\2"+
		"\2\u07cf\u07c0\3\2\2\2\u07cf\u07c3\3\2\2\2\u07cf\u07c6\3\2\2\2\u07cf\u07c9"+
		"\3\2\2\2\u07cf\u07cc\3\2\2\2\u07d0\u00f5\3\2\2\2\u07d1\u07d2\5\u00e8u"+
		"\2\u07d2\u07d3\b|\1\2\u07d3\u07f6\3\2\2\2\u07d4\u07d5\5\u00f8}\2\u07d5"+
		"\u07d6\b|\1\2\u07d6\u07f6\3\2\2\2\u07d7\u07d8\5\u00fe\u0080\2\u07d8\u07d9"+
		"\b|\1\2\u07d9\u07f6\3\2\2\2\u07da\u07db\5\u0108\u0085\2\u07db\u07dc\b"+
		"|\1\2\u07dc\u07f6\3\2\2\2\u07dd\u07de\5\u010a\u0086\2\u07de\u07df\b|\1"+
		"\2\u07df\u07f6\3\2\2\2\u07e0\u07e1\5\u0118\u008d\2\u07e1\u07e2\b|\1\2"+
		"\u07e2\u07f6\3\2\2\2\u07e3\u07e4\5\u012c\u0097\2\u07e4\u07e5\b|\1\2\u07e5"+
		"\u07f6\3\2\2\2\u07e6\u07e7\5\u012e\u0098\2\u07e7\u07e8\b|\1\2\u07e8\u07f6"+
		"\3\2\2\2\u07e9\u07ea\5\u0130\u0099\2\u07ea\u07eb\b|\1\2\u07eb\u07f6\3"+
		"\2\2\2\u07ec\u07ed\5\u0134\u009b\2\u07ed\u07ee\b|\1\2\u07ee\u07f6\3\2"+
		"\2\2\u07ef\u07f0\5\u0132\u009a\2\u07f0\u07f1\b|\1\2\u07f1\u07f6\3\2\2"+
		"\2\u07f2\u07f3\5\u0136\u009c\2\u07f3\u07f4\b|\1\2\u07f4\u07f6\3\2\2\2"+
		"\u07f5\u07d1\3\2\2\2\u07f5\u07d4\3\2\2\2\u07f5\u07d7\3\2\2\2\u07f5\u07da"+
		"\3\2\2\2\u07f5\u07dd\3\2\2\2\u07f5\u07e0\3\2\2\2\u07f5\u07e3\3\2\2\2\u07f5"+
		"\u07e6\3\2\2\2\u07f5\u07e9\3\2\2\2\u07f5\u07ec\3\2\2\2\u07f5\u07ef\3\2"+
		"\2\2\u07f5\u07f2\3\2\2\2\u07f6\u00f7\3\2\2\2\u07f7\u07f8\7A\2\2\u07f8"+
		"\u07f9\b}\1\2\u07f9\u00f9\3\2\2\2\u07fa\u07fb\7h\2\2\u07fb\u07fc\7J\2"+
		"\2\u07fc\u07fd\5\u00f2z\2\u07fd\u07fe\b~\1\2\u07fe\u00fb\3\2\2\2\u07ff"+
		"\u0800\7h\2\2\u0800\u0801\7J\2\2\u0801\u0802\5\u00f4{\2\u0802\u0803\b"+
		"\177\1\2\u0803\u00fd\3\2\2\2\u0804\u0805\5\u0100\u0081\2\u0805\u0806\7"+
		"A\2\2\u0806\u0807\b\u0080\1\2\u0807\u00ff\3\2\2\2\u0808\u0809\5\u0194"+
		"\u00cb\2\u0809\u080a\b\u0081\1\2\u080a\u081e\3\2\2\2\u080b\u080c\5\u01b2"+
		"\u00da\2\u080c\u080d\b\u0081\1\2\u080d\u081e\3\2\2\2\u080e\u080f\5\u01b4"+
		"\u00db\2\u080f\u0810\b\u0081\1\2\u0810\u081e\3\2\2\2\u0811\u0812\5\u01ba"+
		"\u00de\2\u0812\u0813\b\u0081\1\2\u0813\u081e\3\2\2\2\u0814\u0815\5\u01bc"+
		"\u00df\2\u0815\u0816\b\u0081\1\2\u0816\u081e\3\2\2\2\u0817\u0818\5\u0172"+
		"\u00ba\2\u0818\u0819\b\u0081\1\2\u0819\u081e\3\2\2\2\u081a\u081b\5\u015e"+
		"\u00b0\2\u081b\u081c\b\u0081\1\2\u081c\u081e\3\2\2\2\u081d\u0808\3\2\2"+
		"\2\u081d\u080b\3\2\2\2\u081d\u080e\3\2\2\2\u081d\u0811\3\2\2\2\u081d\u0814"+
		"\3\2\2\2\u081d\u0817\3\2\2\2\u081d\u081a\3\2\2\2\u081e\u0101\3\2\2\2\u081f"+
		"\u0820\7\30\2\2\u0820\u0821\7;\2\2\u0821\u0822\5\u0188\u00c5\2\u0822\u0823"+
		"\7<\2\2\u0823\u0824\5\u00f2z\2\u0824\u0825\b\u0082\1\2\u0825\u0103\3\2"+
		"\2\2\u0826\u0827\7\30\2\2\u0827\u0828\7;\2\2\u0828\u0829\5\u0188\u00c5"+
		"\2\u0829\u082a\7<\2\2\u082a\u082b\5\u00f4{\2\u082b\u082c\7\21\2\2\u082c"+
		"\u082d\5\u00f2z\2\u082d\u082e\b\u0083\1\2\u082e\u0105\3\2\2\2\u082f\u0830"+
		"\7\30\2\2\u0830\u0831\7;\2\2\u0831\u0832\5\u0188\u00c5\2\u0832\u0833\7"+
		"<\2\2\u0833\u0834\5\u00f4{\2\u0834\u0835\7\21\2\2\u0835\u0836\5\u00f4"+
		"{\2\u0836\u0837\b\u0084\1\2\u0837\u0107\3\2\2\2\u0838\u0839\7\4\2\2\u0839"+
		"\u083a\5\u0188\u00c5\2\u083a\u083b\7A\2\2\u083b\u083c\b\u0085\1\2\u083c"+
		"\u0845\3\2\2\2\u083d\u083e\7\4\2\2\u083e\u083f\5\u0188\u00c5\2\u083f\u0840"+
		"\7J\2\2\u0840\u0841\5\u0188\u00c5\2\u0841\u0842\7A\2\2\u0842\u0843\b\u0085"+
		"\1\2\u0843\u0845\3\2\2\2\u0844\u0838\3\2\2\2\u0844\u083d\3\2\2\2\u0845"+
		"\u0109\3\2\2\2\u0846\u0847\7+\2\2\u0847\u0848\7;\2\2\u0848\u0849\5\u0188"+
		"\u00c5\2\u0849\u084a\7<\2\2\u084a\u084b\5\u010c\u0087\2\u084b\u084c\b"+
		"\u0086\1\2\u084c\u010b\3\2\2\2\u084d\u0853\7=\2\2\u084e\u084f\5\u010e"+
		"\u0088\2\u084f\u0850\b\u0087\1\2\u0850\u0852\3\2\2\2\u0851\u084e\3\2\2"+
		"\2\u0852\u0855\3\2\2\2\u0853\u0851\3\2\2\2\u0853\u0854\3\2\2\2\u0854\u085b"+
		"\3\2\2\2\u0855\u0853\3\2\2\2\u0856\u0857\5\u0112\u008a\2\u0857\u0858\b"+
		"\u0087\1\2\u0858\u085a\3\2\2\2\u0859\u0856\3\2\2\2\u085a\u085d\3\2\2\2"+
		"\u085b\u0859\3\2\2\2\u085b\u085c\3\2\2\2\u085c\u085e\3\2\2\2\u085d\u085b"+
		"\3\2\2\2\u085e\u085f\7>\2\2\u085f\u0860\b\u0087\1\2\u0860\u0861\b\u0087"+
		"\1\2\u0861\u010d\3\2\2\2\u0862\u0863\5\u0110\u0089\2\u0863\u0864\5\u00ea"+
		"v\2\u0864\u0865\b\u0088\1\2\u0865\u010f\3\2\2\2\u0866\u0867\5\u0112\u008a"+
		"\2\u0867\u0868\b\u0089\1\2\u0868\u086e\3\2\2\2\u0869\u086a\5\u0112\u008a"+
		"\2\u086a\u086b\b\u0089\1\2\u086b\u086d\3\2\2\2\u086c\u0869\3\2\2\2\u086d"+
		"\u0870\3\2\2\2\u086e\u086c\3\2\2\2\u086e\u086f\3\2\2\2\u086f\u0871\3\2"+
		"\2\2\u0870\u086e\3\2\2\2\u0871\u0872\b\u0089\1\2\u0872\u0111\3\2\2\2\u0873"+
		"\u0874\7\b\2\2\u0874\u0875\5\u0186\u00c4\2\u0875\u0876\7J\2\2\u0876\u0877"+
		"\b\u008a\1\2\u0877\u0880\3\2\2\2\u0878\u0879\7\b\2\2\u0879\u087a\7h\2"+
		"\2\u087a\u087b\7J\2\2\u087b\u0880\b\u008a\1\2\u087c\u087d\7\16\2\2\u087d"+
		"\u087e\7J\2\2\u087e\u0880\b\u008a\1\2\u087f\u0873\3\2\2\2\u087f\u0878"+
		"\3\2\2\2\u087f\u087c\3\2\2\2\u0880\u0113\3\2\2\2\u0881\u0882\7\64\2\2"+
		"\u0882\u0883\7;\2\2\u0883\u0884\5\u0188\u00c5\2\u0884\u0885\7<\2\2\u0885"+
		"\u0886\5\u00f2z\2\u0886\u0887\b\u008b\1\2\u0887\u0115\3\2\2\2\u0888\u0889"+
		"\7\64\2\2\u0889\u088a\7;\2\2\u088a\u088b\5\u0188\u00c5\2\u088b\u088c\7"+
		"<\2\2\u088c\u088d\5\u00f4{\2\u088d\u088e\b\u008c\1\2\u088e\u0117\3\2\2"+
		"\2\u088f\u0890\7\17\2\2\u0890\u0891\5\u00f2z\2\u0891\u0892\7\64\2\2\u0892"+
		"\u0893\7;\2\2\u0893\u0894\5\u0188\u00c5\2\u0894\u0895\7<\2\2\u0895\u0896"+
		"\7A\2\2\u0896\u0897\b\u008d\1\2\u0897\u0119\3\2\2\2\u0898\u0899\5\u011e"+
		"\u0090\2\u0899\u089a\b\u008e\1\2\u089a\u089f\3\2\2\2\u089b\u089c\5\u0128"+
		"\u0095\2\u089c\u089d\b\u008e\1\2\u089d\u089f\3\2\2\2\u089e\u0898\3\2\2"+
		"\2\u089e\u089b\3\2\2\2\u089f\u011b\3\2\2\2\u08a0\u08a1\5\u0120\u0091\2"+
		"\u08a1\u08a2\b\u008f\1\2\u08a2\u08a7\3\2\2\2\u08a3\u08a4\5\u012a\u0096"+
		"\2\u08a4\u08a5\b\u008f\1\2\u08a5\u08a7\3\2\2\2\u08a6\u08a0\3\2\2\2\u08a6"+
		"\u08a3\3\2\2\2\u08a7\u011d\3\2\2\2\u08a8\u08a9\7\27\2\2\u08a9\u08ad\7"+
		";\2\2\u08aa\u08ab\5\u0122\u0092\2\u08ab\u08ac\b\u0090\1\2\u08ac\u08ae"+
		"\3\2\2\2\u08ad\u08aa\3\2\2\2\u08ad\u08ae\3\2\2\2\u08ae\u08af\3\2\2\2\u08af"+
		"\u08b3\7A\2\2\u08b0\u08b1\5\u0188\u00c5\2\u08b1\u08b2\b";
	private static final String _serializedATNSegment1 =
		"\u0090\1\2\u08b2\u08b4\3\2\2\2\u08b3\u08b0\3\2\2\2\u08b3\u08b4\3\2\2\2"+
		"\u08b4\u08b5\3\2\2\2\u08b5\u08b9\7A\2\2\u08b6\u08b7\5\u0124\u0093\2\u08b7"+
		"\u08b8\b\u0090\1\2\u08b8\u08ba\3\2\2\2\u08b9\u08b6\3\2\2\2\u08b9\u08ba"+
		"\3\2\2\2\u08ba\u08bb\3\2\2\2\u08bb\u08bc\7<\2\2\u08bc\u08bd\5\u00f2z\2"+
		"\u08bd\u08be\b\u0090\1\2\u08be\u011f\3\2\2\2\u08bf\u08c0\7\27\2\2\u08c0"+
		"\u08c4\7;\2\2\u08c1\u08c2\5\u0122\u0092\2\u08c2\u08c3\b\u0091\1\2\u08c3"+
		"\u08c5\3\2\2\2\u08c4\u08c1\3\2\2\2\u08c4\u08c5\3\2\2\2\u08c5\u08c6\3\2"+
		"\2\2\u08c6\u08ca\7A\2\2\u08c7\u08c8\5\u0188\u00c5\2\u08c8\u08c9\b\u0091"+
		"\1\2\u08c9\u08cb\3\2\2\2\u08ca\u08c7\3\2\2\2\u08ca\u08cb\3\2\2\2\u08cb"+
		"\u08cc\3\2\2\2\u08cc\u08d0\7A\2\2\u08cd\u08ce\5\u0124\u0093\2\u08ce\u08cf"+
		"\b\u0091\1\2\u08cf\u08d1\3\2\2\2\u08d0\u08cd\3\2\2\2\u08d0\u08d1\3\2\2"+
		"\2\u08d1\u08d2\3\2\2\2\u08d2\u08d3\7<\2\2\u08d3\u08d4\5\u00f4{\2\u08d4"+
		"\u08d5\b\u0091\1\2\u08d5\u0121\3\2\2\2\u08d6\u08d7\5\u0126\u0094\2\u08d7"+
		"\u08d8\b\u0092\1\2\u08d8\u08dd\3\2\2\2\u08d9\u08da\5\u00f0y\2\u08da\u08db"+
		"\b\u0092\1\2\u08db\u08dd\3\2\2\2\u08dc\u08d6\3\2\2\2\u08dc\u08d9\3\2\2"+
		"\2\u08dd\u0123\3\2\2\2\u08de\u08df\5\u0126\u0094\2\u08df\u08e0\b\u0093"+
		"\1\2\u08e0\u0125\3\2\2\2\u08e1\u08e2\5\u0100\u0081\2\u08e2\u08e3\b\u0094"+
		"\1\2\u08e3\u08ea\3\2\2\2\u08e4\u08e5\7B\2\2\u08e5\u08e6\5\u0100\u0081"+
		"\2\u08e6\u08e7\b\u0094\1\2\u08e7\u08e9\3\2\2\2\u08e8\u08e4\3\2\2\2\u08e9"+
		"\u08ec\3\2\2\2\u08ea\u08e8\3\2\2\2\u08ea\u08eb\3\2\2\2\u08eb\u08ed\3\2"+
		"\2\2\u08ec\u08ea\3\2\2\2\u08ed\u08ee\b\u0094\1\2\u08ee\u0127\3\2\2\2\u08ef"+
		"\u08f0\7\27\2\2\u08f0\u08f9\7;\2\2\u08f1\u08f2\5\u008cG\2\u08f2\u08f3"+
		"\b\u0095\1\2\u08f3\u08f8\3\2\2\2\u08f4\u08f5\5\u00d2j\2\u08f5\u08f6\b"+
		"\u0095\1\2\u08f6\u08f8\3\2\2\2\u08f7\u08f1\3\2\2\2\u08f7\u08f4\3\2\2\2"+
		"\u08f8\u08fb\3\2\2\2\u08f9\u08f7\3\2\2\2\u08f9\u08fa\3\2\2\2\u08fa\u08fc"+
		"\3\2\2\2\u08fb\u08f9\3\2\2\2\u08fc\u08fd\5h\65\2\u08fd\u08fe\7J\2\2\u08fe"+
		"\u08ff\5\u0188\u00c5\2\u08ff\u0900\7<\2\2\u0900\u0901\5\u00f2z\2\u0901"+
		"\u0902\b\u0095\1\2\u0902\u0129\3\2\2\2\u0903\u0904\7\27\2\2\u0904\u090d"+
		"\7;\2\2\u0905\u0906\5\u008cG\2\u0906\u0907\b\u0096\1\2\u0907\u090c\3\2"+
		"\2\2\u0908\u0909\5\u00d2j\2\u0909\u090a\b\u0096\1\2\u090a\u090c\3\2\2"+
		"\2\u090b\u0905\3\2\2\2\u090b\u0908\3\2\2\2\u090c\u090f\3\2\2\2\u090d\u090b"+
		"\3\2\2\2\u090d\u090e\3\2\2\2\u090e\u0910\3\2\2\2\u090f\u090d\3\2\2\2\u0910"+
		"\u0911\5h\65\2\u0911\u0912\7J\2\2\u0912\u0913\5\u0188\u00c5\2\u0913\u0914"+
		"\7<\2\2\u0914\u0915\5\u00f4{\2\u0915\u0916\b\u0096\1\2\u0916\u012b\3\2"+
		"\2\2\u0917\u091a\7\6\2\2\u0918\u0919\7h\2\2\u0919\u091b\b\u0097\1\2\u091a"+
		"\u0918\3\2\2\2\u091a\u091b\3\2\2\2\u091b\u091c\3\2\2\2\u091c\u091d\7A"+
		"\2\2\u091d\u091e\b\u0097\1\2\u091e\u012d\3\2\2\2\u091f\u0922\7\r\2\2\u0920"+
		"\u0921\7h\2\2\u0921\u0923\b\u0098\1\2\u0922\u0920\3\2\2\2\u0922\u0923"+
		"\3\2\2\2\u0923\u0924\3\2\2\2\u0924\u0925\7A\2\2\u0925\u0926\b\u0098\1"+
		"\2\u0926\u012f\3\2\2\2\u0927\u0928\7&\2\2\u0928\u0929\7A\2\2\u0929\u0930"+
		"\b\u0099\1\2\u092a\u092b\7&\2\2\u092b\u092c\5\u0188\u00c5\2\u092c\u092d"+
		"\7A\2\2\u092d\u092e\b\u0099\1\2\u092e\u0930\3\2\2\2\u092f\u0927\3\2\2"+
		"\2\u092f\u092a\3\2\2\2\u0930\u0131\3\2\2\2\u0931\u0932\7.\2\2\u0932\u0933"+
		"\5\u0188\u00c5\2\u0933\u0934\7A\2\2\u0934\u0935\b\u009a\1\2\u0935\u0133"+
		"\3\2\2\2\u0936\u0937\7,\2\2\u0937\u0938\7;\2\2\u0938\u0939\5\u0188\u00c5"+
		"\2\u0939\u093a\7<\2\2\u093a\u093b\5\u00e8u\2\u093b\u093c\b\u009b\1\2\u093c"+
		"\u0135\3\2\2\2\u093d\u093e\7\61\2\2\u093e\u093f\5\u00e8u\2\u093f\u0940"+
		"\5\u0138\u009d\2\u0940\u0941\b\u009c\1\2\u0941\u0950\3\2\2\2\u0942\u0943"+
		"\7\61\2\2\u0943\u0947\5\u00e8u\2\u0944\u0945\5\u0138\u009d\2\u0945\u0946"+
		"\b\u009c\1\2\u0946\u0948\3\2\2\2\u0947\u0944\3\2\2\2\u0947\u0948\3\2\2"+
		"\2\u0948\u0949\3\2\2\2\u0949\u094a\5\u0140\u00a1\2\u094a\u094b\b\u009c"+
		"\1\2\u094b\u0950\3\2\2\2\u094c\u094d\5\u0142\u00a2\2\u094d\u094e\b\u009c"+
		"\1\2\u094e\u0950\3\2\2\2\u094f\u093d\3\2\2\2\u094f\u0942\3\2\2\2\u094f"+
		"\u094c\3\2\2\2\u0950\u0137\3\2\2\2\u0951\u0952\5\u013a\u009e\2\u0952\u0958"+
		"\b\u009d\1\2\u0953\u0954\5\u013a\u009e\2\u0954\u0955\b\u009d\1\2\u0955"+
		"\u0957\3\2\2\2\u0956\u0953\3\2\2\2\u0957\u095a\3\2\2\2\u0958\u0956\3\2"+
		"\2\2\u0958\u0959\3\2\2\2\u0959\u095b\3\2\2\2\u095a\u0958\3\2\2\2\u095b"+
		"\u095c\b\u009d\1\2\u095c\u0139\3\2\2\2\u095d\u095e\7\t\2\2\u095e\u095f"+
		"\b\u009e\1\2\u095f\u0960\7;\2\2\u0960\u0961\5\u013c\u009f\2\u0961\u0962"+
		"\7<\2\2\u0962\u0963\5\u00e8u\2\u0963\u0964\b\u009e\1\2\u0964\u013b\3\2"+
		"\2\2\u0965\u0966\5\u008cG\2\u0966\u0967\b\u009f\1\2\u0967\u096c\3\2\2"+
		"\2\u0968\u0969\5\u00d2j\2\u0969\u096a\b\u009f\1\2\u096a\u096c\3\2\2\2"+
		"\u096b\u0965\3\2\2\2\u096b\u0968\3\2\2\2\u096c\u096f\3\2\2\2\u096d\u096b"+
		"\3\2\2\2\u096d\u096e\3\2\2\2\u096e\u0970\3\2\2\2\u096f\u096d\3\2\2\2\u0970"+
		"\u0971\5\u013e\u00a0\2\u0971\u0972\5f\64\2\u0972\u0973\b\u009f\1\2\u0973"+
		"\u013d\3\2\2\2\u0974\u0975\5t;\2\u0975\u0976\b\u00a0\1\2\u0976\u097d\3"+
		"\2\2\2\u0977\u0978\7X\2\2\u0978\u0979\5\22\n\2\u0979\u097a\b\u00a0\1\2"+
		"\u097a\u097c\3\2\2\2\u097b\u0977\3\2\2\2\u097c\u097f\3\2\2\2\u097d\u097b"+
		"\3\2\2\2\u097d\u097e\3\2\2\2\u097e\u013f\3\2\2\2\u097f\u097d\3\2\2\2\u0980"+
		"\u0981\7\25\2\2\u0981\u0982\5\u00e8u\2\u0982\u0983\b\u00a1\1\2\u0983\u0141"+
		"\3\2\2\2\u0984\u0985\7\61\2\2\u0985\u0986\5\u0144\u00a3\2\u0986\u098a"+
		"\5\u00e8u\2\u0987\u0988\5\u0138\u009d\2\u0988\u0989\b\u00a2\1\2\u0989"+
		"\u098b\3\2\2\2\u098a\u0987\3\2\2\2\u098a\u098b\3\2\2\2\u098b\u098f\3\2"+
		"\2\2\u098c\u098d\5\u0140\u00a1\2\u098d\u098e\b\u00a2\1\2\u098e\u0990\3"+
		"\2\2\2\u098f\u098c\3\2\2\2\u098f\u0990\3\2\2\2\u0990\u0991\3\2\2\2\u0991"+
		"\u0992\b\u00a2\1\2\u0992\u0143\3\2\2\2\u0993\u0994\b\u00a3\1\2\u0994\u099b"+
		"\7;\2\2\u0995\u0997\5\u0146\u00a4\2\u0996\u0998\7A\2\2\u0997\u0996\3\2"+
		"\2\2\u0997\u0998\3\2\2\2\u0998\u0999\3\2\2\2\u0999\u099a\b\u00a3\1\2\u099a"+
		"\u099c\3\2\2\2\u099b\u0995\3\2\2\2\u099b\u099c\3\2\2\2\u099c\u099d\3\2"+
		"\2\2\u099d\u099e\7<\2\2\u099e\u0145\3\2\2\2\u099f\u09a0\5\u0148\u00a5"+
		"\2\u09a0\u09a7\b\u00a4\1\2\u09a1\u09a2\7A\2\2\u09a2\u09a3\5\u0148\u00a5"+
		"\2\u09a3\u09a4\b\u00a4\1\2\u09a4\u09a6\3\2\2\2\u09a5\u09a1\3\2\2\2\u09a6"+
		"\u09a9\3\2\2\2\u09a7\u09a5\3\2\2\2\u09a7\u09a8\3\2\2\2\u09a8\u09aa\3\2"+
		"\2\2\u09a9\u09a7\3\2\2\2\u09aa\u09ab\b\u00a4\1\2\u09ab\u0147\3\2\2\2\u09ac"+
		"\u09ad\5\u008cG\2\u09ad\u09ae\b\u00a5\1\2\u09ae\u09b3\3\2\2\2\u09af\u09b0"+
		"\5\u00d2j\2\u09b0\u09b1\b\u00a5\1\2\u09b1\u09b3\3\2\2\2\u09b2\u09ac\3"+
		"\2\2\2\u09b2\u09af\3\2\2\2\u09b3\u09b6\3\2\2\2\u09b4\u09b2\3\2\2\2\u09b4"+
		"\u09b5\3\2\2\2\u09b5\u09b7\3\2\2\2\u09b6\u09b4\3\2\2\2\u09b7\u09b8\5h"+
		"\65\2\u09b8\u09b9\7D\2\2\u09b9\u09ba\5\u0188\u00c5\2\u09ba\u09bb\b\u00a5"+
		"\1\2\u09bb\u0149\3\2\2\2\u09bc\u09bd\5\u0158\u00ad\2\u09bd\u09be\b\u00a6"+
		"\1\2\u09be\u09c3\3\2\2\2\u09bf\u09c0\5\u0180\u00c1\2\u09c0\u09c1\b\u00a6"+
		"\1\2\u09c1\u09c3\3\2\2\2\u09c2\u09bc\3\2\2\2\u09c2\u09bf\3\2\2\2\u09c3"+
		"\u09c9\3\2\2\2\u09c4\u09c5\5\u0154\u00ab\2\u09c5\u09c6\b\u00a6\1\2\u09c6"+
		"\u09c8\3\2\2\2\u09c7\u09c4\3\2\2\2\u09c8\u09cb\3\2\2\2\u09c9\u09c7\3\2"+
		"\2\2\u09c9\u09ca\3\2\2\2\u09ca\u014b\3\2\2\2\u09cb\u09c9\3\2\2\2\u09cc"+
		"\u09cd\5\2\2\2\u09cd\u09ce\b\u00a7\1\2\u09ce\u09e9\3\2\2\2\u09cf\u09d0"+
		"\5\u014e\u00a8\2\u09d0\u09d1\b\u00a7\1\2\u09d1\u09e9\3\2\2\2\u09d2\u09d3"+
		"\7-\2\2\u09d3\u09e9\b\u00a7\1\2\u09d4\u09d5\7;\2\2\u09d5\u09d6\5\u0188"+
		"\u00c5\2\u09d6\u09d7\7<\2\2\u09d7\u09d8\b\u00a7\1\2\u09d8\u09e9\3\2\2"+
		"\2\u09d9\u09da\5\u015e\u00b0\2\u09da\u09db\b\u00a7\1\2\u09db\u09e9\3\2"+
		"\2\2\u09dc\u09dd\5\u0166\u00b4\2\u09dd\u09de\b\u00a7\1\2\u09de\u09e9\3"+
		"\2\2\2\u09df\u09e0\5\u016c\u00b7\2\u09e0\u09e1\b\u00a7\1\2\u09e1\u09e9"+
		"\3\2\2\2\u09e2\u09e3\5\u0172\u00ba\2\u09e3\u09e4\b\u00a7\1\2\u09e4\u09e9"+
		"\3\2\2\2\u09e5\u09e6\5\u017a\u00be\2\u09e6\u09e7\b\u00a7\1\2\u09e7\u09e9"+
		"\3\2\2\2\u09e8\u09cc\3\2\2\2\u09e8\u09cf\3\2\2\2\u09e8\u09d2\3\2\2\2\u09e8"+
		"\u09d4\3\2\2\2\u09e8\u09d9\3\2\2\2\u09e8\u09dc\3\2\2\2\u09e8\u09df\3\2"+
		"\2\2\u09e8\u09e2\3\2\2\2\u09e8\u09e5\3\2\2\2\u09e9\u014d\3\2\2\2\u09ea"+
		"\u09f0\7h\2\2\u09eb\u09ec\7?\2\2\u09ec\u09ed\7@\2\2\u09ed\u09ef\b\u00a8"+
		"\1\2\u09ee\u09eb\3\2\2\2\u09ef\u09f2\3\2\2\2\u09f0\u09ee\3\2\2\2\u09f0"+
		"\u09f1\3\2\2\2\u09f1\u09f3\3\2\2\2\u09f2\u09f0\3\2\2\2\u09f3\u09f4\7C"+
		"\2\2\u09f4\u09f5\7\13\2\2\u09f5\u0a0f\b\u00a8\1\2\u09f6\u09f7\5\60\31"+
		"\2\u09f7\u09f8\7C\2\2\u09f8\u09fe\7h\2\2\u09f9\u09fa\7?\2\2\u09fa\u09fb"+
		"\7@\2\2\u09fb\u09fd\b\u00a8\1\2\u09fc\u09f9\3\2\2\2\u09fd\u0a00\3\2\2"+
		"\2\u09fe\u09fc\3\2\2\2\u09fe\u09ff\3\2\2\2\u09ff\u0a01\3\2\2\2\u0a00\u09fe"+
		"\3\2\2\2\u0a01\u0a02\7C\2\2\u0a02\u0a03\7\13\2\2\u0a03\u0a04\b\u00a8\1"+
		"\2\u0a04\u0a0f\3\2\2\2\u0a05\u0a06\7\62\2\2\u0a06\u0a07\7C\2\2\u0a07\u0a08"+
		"\7\13\2\2\u0a08\u0a0f\b\u00a8\1\2\u0a09\u0a0a\5.\30\2\u0a0a\u0a0b\7C\2"+
		"\2\u0a0b\u0a0c\7-\2\2\u0a0c\u0a0d\b\u00a8\1\2\u0a0d\u0a0f\3\2\2\2\u0a0e"+
		"\u09ea\3\2\2\2\u0a0e\u09f6\3\2\2\2\u0a0e\u0a05\3\2\2\2\u0a0e\u0a09\3\2"+
		"\2\2\u0a0f\u014f\3\2\2\2\u0a10\u0a11\3\2\2\2\u0a11\u0151\3\2\2\2\u0a12"+
		"\u0a13\5\2\2\2\u0a13\u0a14\b\u00aa\1\2\u0a14\u0a2c\3\2\2\2\u0a15\u0a16"+
		"\5\u014e\u00a8\2\u0a16\u0a17\b\u00aa\1\2\u0a17\u0a2c\3\2\2\2\u0a18\u0a19"+
		"\7-\2\2\u0a19\u0a2c\b\u00aa\1\2\u0a1a\u0a1b\7;\2\2\u0a1b\u0a1c\5\u0188"+
		"\u00c5\2\u0a1c\u0a1d\7<\2\2\u0a1d\u0a1e\b\u00aa\1\2\u0a1e\u0a2c\3\2\2"+
		"\2\u0a1f\u0a20\5\u015e\u00b0\2\u0a20\u0a21\b\u00aa\1\2\u0a21\u0a2c\3\2"+
		"\2\2\u0a22\u0a23\5\u0166\u00b4\2\u0a23\u0a24\b\u00aa\1\2\u0a24\u0a2c\3"+
		"\2\2\2\u0a25\u0a26\5\u0172\u00ba\2\u0a26\u0a27\b\u00aa\1\2\u0a27\u0a2c"+
		"\3\2\2\2\u0a28\u0a29\5\u017a\u00be\2\u0a29\u0a2a\b\u00aa\1\2\u0a2a\u0a2c"+
		"\3\2\2\2\u0a2b\u0a12\3\2\2\2\u0a2b\u0a15\3\2\2\2\u0a2b\u0a18\3\2\2\2\u0a2b"+
		"\u0a1a\3\2\2\2\u0a2b\u0a1f\3\2\2\2\u0a2b\u0a22\3\2\2\2\u0a2b\u0a25\3\2"+
		"\2\2\u0a2b\u0a28\3\2\2\2\u0a2c\u0153\3\2\2\2\u0a2d\u0a2e\5\u0160\u00b1"+
		"\2\u0a2e\u0a2f\b\u00ab\1\2\u0a2f\u0a3d\3\2\2\2\u0a30\u0a31\5\u0168\u00b5"+
		"\2\u0a31\u0a32\b\u00ab\1\2\u0a32\u0a3d\3\2\2\2\u0a33\u0a34\5\u016e\u00b8"+
		"\2\u0a34\u0a35\b\u00ab\1\2\u0a35\u0a3d\3\2\2\2\u0a36\u0a37\5\u0174\u00bb"+
		"\2\u0a37\u0a38\b\u00ab\1\2\u0a38\u0a3d\3\2\2\2\u0a39\u0a3a\5\u017c\u00bf"+
		"\2\u0a3a\u0a3b\b\u00ab\1\2\u0a3b\u0a3d\3\2\2\2\u0a3c\u0a2d\3\2\2\2\u0a3c"+
		"\u0a30\3\2\2\2\u0a3c\u0a33\3\2\2\2\u0a3c\u0a36\3\2\2\2\u0a3c\u0a39\3\2"+
		"\2\2\u0a3d\u0155\3\2\2\2\u0a3e\u0a3f\5\u0160\u00b1\2\u0a3f\u0a40\b\u00ac"+
		"\1\2\u0a40\u0a4b\3\2\2\2\u0a41\u0a42\5\u0168\u00b5\2\u0a42\u0a43\b\u00ac"+
		"\1\2\u0a43\u0a4b\3\2\2\2\u0a44\u0a45\5\u0174\u00bb\2\u0a45\u0a46\b\u00ac"+
		"\1\2\u0a46\u0a4b\3\2\2\2\u0a47\u0a48\5\u017c\u00bf\2\u0a48\u0a49\b\u00ac"+
		"\1\2\u0a49\u0a4b\3\2\2\2\u0a4a\u0a3e\3\2\2\2\u0a4a\u0a41\3\2\2\2\u0a4a"+
		"\u0a44\3\2\2\2\u0a4a\u0a47\3\2\2\2\u0a4b\u0157\3\2\2\2\u0a4c\u0a4d\5\2"+
		"\2\2\u0a4d\u0a4e\b\u00ad\1\2\u0a4e\u0a76\3\2\2\2\u0a4f\u0a50\5\u014e\u00a8"+
		"\2\u0a50\u0a51\b\u00ad\1\2\u0a51\u0a76\3\2\2\2\u0a52\u0a58\5n8\2\u0a53"+
		"\u0a54\7?\2\2\u0a54\u0a55\7@\2\2\u0a55\u0a57\b\u00ad\1\2\u0a56\u0a53\3"+
		"\2\2\2\u0a57\u0a5a\3\2\2\2\u0a58\u0a56\3\2\2\2\u0a58\u0a59\3\2\2\2\u0a59"+
		"\u0a5b\3\2\2\2\u0a5a\u0a58\3\2\2\2\u0a5b\u0a5c\7C\2\2\u0a5c\u0a5d\7\13"+
		"\2\2\u0a5d\u0a5e\b\u00ad\1\2\u0a5e\u0a76\3\2\2\2\u0a5f\u0a60\7-\2\2\u0a60"+
		"\u0a76\b\u00ad\1\2\u0a61\u0a62\7;\2\2\u0a62\u0a63\5\u0188\u00c5\2\u0a63"+
		"\u0a64\7<\2\2\u0a64\u0a65\b\u00ad\1\2\u0a65\u0a76\3\2\2\2\u0a66\u0a67"+
		"\5\u0162\u00b2\2\u0a67\u0a68\b\u00ad\1\2\u0a68\u0a76\3\2\2\2\u0a69\u0a6a"+
		"\5\u016a\u00b6\2\u0a6a\u0a6b\b\u00ad\1\2\u0a6b\u0a76\3\2\2\2\u0a6c\u0a6d"+
		"\5\u0170\u00b9\2\u0a6d\u0a6e\b\u00ad\1\2\u0a6e\u0a76\3\2\2\2\u0a6f\u0a70"+
		"\5\u0176\u00bc\2\u0a70\u0a71\b\u00ad\1\2\u0a71\u0a76\3\2\2\2\u0a72\u0a73"+
		"\5\u017e\u00c0\2\u0a73\u0a74\b\u00ad\1\2\u0a74\u0a76\3\2\2\2\u0a75\u0a4c"+
		"\3\2\2\2\u0a75\u0a4f\3\2\2\2\u0a75\u0a52\3\2\2\2\u0a75\u0a5f\3\2\2\2\u0a75"+
		"\u0a61\3\2\2\2\u0a75\u0a66\3\2\2\2\u0a75\u0a69\3\2\2\2\u0a75\u0a6c\3\2"+
		"\2\2\u0a75\u0a6f\3\2\2\2\u0a75\u0a72\3\2\2\2\u0a76\u0159\3\2\2\2\u0a77"+
		"\u0a78\3\2\2\2\u0a78\u015b\3\2\2\2\u0a79\u0a7a\5\2\2\2\u0a7a\u0a7b\b\u00af"+
		"\1\2\u0a7b\u0aa0\3\2\2\2\u0a7c\u0a7d\5\u014e\u00a8\2\u0a7d\u0a7e\b\u00af"+
		"\1\2\u0a7e\u0aa0\3\2\2\2\u0a7f\u0a85\5n8\2\u0a80\u0a81\7?\2\2\u0a81\u0a82"+
		"\7@\2\2\u0a82\u0a84\b\u00af\1\2\u0a83\u0a80\3\2\2\2\u0a84\u0a87\3\2\2"+
		"\2\u0a85\u0a83\3\2\2\2\u0a85\u0a86\3\2\2\2\u0a86\u0a88\3\2\2\2\u0a87\u0a85"+
		"\3\2\2\2\u0a88\u0a89\7C\2\2\u0a89\u0a8a\7\13\2\2\u0a8a\u0a8b\b\u00af\1"+
		"\2\u0a8b\u0aa0\3\2\2\2\u0a8c\u0a8d\7-\2\2\u0a8d\u0aa0\b\u00af\1\2\u0a8e"+
		"\u0a8f\7;\2\2\u0a8f\u0a90\5\u0188\u00c5\2\u0a90\u0a91\7<\2\2\u0a91\u0a92"+
		"\b\u00af\1\2\u0a92\u0aa0\3\2\2\2\u0a93\u0a94\5\u0162\u00b2\2\u0a94\u0a95"+
		"\b\u00af\1\2\u0a95\u0aa0\3\2\2\2\u0a96\u0a97\5\u016a\u00b6\2\u0a97\u0a98"+
		"\b\u00af\1\2\u0a98\u0aa0\3\2\2\2\u0a99\u0a9a\5\u0176\u00bc\2\u0a9a\u0a9b"+
		"\b\u00af\1\2\u0a9b\u0aa0\3\2\2\2\u0a9c\u0a9d\5\u017e\u00c0\2\u0a9d\u0a9e"+
		"\b\u00af\1\2\u0a9e\u0aa0\3\2\2\2\u0a9f\u0a79\3\2\2\2\u0a9f\u0a7c\3\2\2"+
		"\2\u0a9f\u0a7f\3\2\2\2\u0a9f\u0a8c\3\2\2\2\u0a9f\u0a8e\3\2\2\2\u0a9f\u0a93"+
		"\3\2\2\2\u0a9f\u0a96\3\2\2\2\u0a9f\u0a99\3\2\2\2\u0a9f\u0a9c\3\2\2\2\u0aa0"+
		"\u015d\3\2\2\2\u0aa1\u0aa5\7!\2\2\u0aa2\u0aa3\5$\23\2\u0aa3\u0aa4\b\u00b0"+
		"\1\2\u0aa4\u0aa6\3\2\2\2\u0aa5\u0aa2\3\2\2\2\u0aa5\u0aa6\3\2\2\2\u0aa6"+
		"\u0aac\3\2\2\2\u0aa7\u0aa8\5\u00d2j\2\u0aa8\u0aa9\b\u00b0\1\2\u0aa9\u0aab"+
		"\3\2\2\2\u0aaa\u0aa7\3\2\2\2\u0aab\u0aae\3\2\2\2\u0aac\u0aaa\3\2\2\2\u0aac"+
		"\u0aad\3\2\2\2\u0aad\u0aaf\3\2\2\2\u0aae\u0aac\3\2\2\2\u0aaf\u0ab0\7h"+
		"\2\2\u0ab0\u0abe\b\u00b0\1\2\u0ab1\u0ab7\7C\2\2\u0ab2\u0ab3\5\u00d2j\2"+
		"\u0ab3\u0ab4\b\u00b0\1\2\u0ab4\u0ab6\3\2\2\2\u0ab5\u0ab2\3\2\2\2\u0ab6"+
		"\u0ab9\3\2\2\2\u0ab7\u0ab5\3\2\2\2\u0ab7\u0ab8\3\2\2\2\u0ab8\u0aba\3\2"+
		"\2\2\u0ab9\u0ab7\3\2\2\2\u0aba\u0abb\7h\2\2\u0abb\u0abd\b\u00b0\1\2\u0abc"+
		"\u0ab1\3\2\2\2\u0abd\u0ac0\3\2\2\2\u0abe\u0abc\3\2\2\2\u0abe\u0abf\3\2"+
		"\2\2\u0abf\u0ac4\3\2\2\2\u0ac0\u0abe\3\2\2\2\u0ac1\u0ac2\5\u0164\u00b3"+
		"\2\u0ac2\u0ac3\b\u00b0\1\2\u0ac3\u0ac5\3\2\2\2\u0ac4\u0ac1\3\2\2\2\u0ac4"+
		"\u0ac5\3\2\2\2\u0ac5\u0ac6\3\2\2\2\u0ac6\u0aca\7;\2\2\u0ac7\u0ac8\5\u0178"+
		"\u00bd\2\u0ac8\u0ac9\b\u00b0\1\2\u0ac9\u0acb\3\2\2\2\u0aca\u0ac7\3\2\2"+
		"\2\u0aca\u0acb\3\2\2\2\u0acb\u0acc\3\2\2\2\u0acc\u0acd\7<\2\2\u0acd\u0acf"+
		"\b\u00b0\1\2\u0ace\u0ad0\5X-\2\u0acf\u0ace\3\2\2\2\u0acf\u0ad0\3\2\2\2"+
		"\u0ad0\u0b16\3\2\2\2\u0ad1\u0ad2\5\62\32\2\u0ad2\u0ad3\7C\2\2\u0ad3\u0ad7"+
		"\7!\2\2\u0ad4\u0ad5\5$\23\2\u0ad5\u0ad6\b\u00b0\1\2\u0ad6\u0ad8\3\2\2"+
		"\2\u0ad7\u0ad4\3\2\2\2\u0ad7\u0ad8\3\2\2\2\u0ad8\u0ade\3\2\2\2\u0ad9\u0ada"+
		"\5\u00d2j\2\u0ada\u0adb\b\u00b0\1\2\u0adb\u0add\3\2\2\2\u0adc\u0ad9\3"+
		"\2\2\2\u0add\u0ae0\3\2\2\2\u0ade\u0adc\3\2\2\2\u0ade\u0adf\3\2\2\2\u0adf"+
		"\u0ae1\3\2\2\2\u0ae0\u0ade\3\2\2\2\u0ae1\u0ae2\7h\2\2\u0ae2\u0ae6\b\u00b0"+
		"\1\2\u0ae3\u0ae4\5\u0164\u00b3\2\u0ae4\u0ae5\b\u00b0\1\2\u0ae5\u0ae7\3"+
		"\2\2\2\u0ae6\u0ae3\3\2\2\2\u0ae6\u0ae7\3\2\2\2\u0ae7\u0ae8\3\2\2\2\u0ae8"+
		"\u0aec\7;\2\2\u0ae9\u0aea\5\u0178\u00bd\2\u0aea\u0aeb\b\u00b0\1\2\u0aeb"+
		"\u0aed\3\2\2\2\u0aec\u0ae9\3\2\2\2\u0aec\u0aed\3\2\2\2\u0aed\u0aee\3\2"+
		"\2\2\u0aee\u0aef\7<\2\2\u0aef\u0af1\b\u00b0\1\2\u0af0\u0af2\5X-\2\u0af1"+
		"\u0af0\3\2\2\2\u0af1\u0af2\3\2\2\2\u0af2\u0b16\3\2\2\2\u0af3\u0af4\5\u014a"+
		"\u00a6\2\u0af4\u0af5\7C\2\2\u0af5\u0af9\7!\2\2\u0af6\u0af7\5$\23\2\u0af7"+
		"\u0af8\b\u00b0\1\2\u0af8\u0afa\3\2\2\2\u0af9\u0af6\3\2\2\2\u0af9\u0afa"+
		"\3\2\2\2\u0afa\u0b00\3\2\2\2\u0afb\u0afc\5\u00d2j\2\u0afc\u0afd\b\u00b0"+
		"\1\2\u0afd\u0aff\3\2\2\2\u0afe\u0afb\3\2\2\2\u0aff\u0b02\3\2\2\2\u0b00"+
		"\u0afe\3\2\2\2\u0b00\u0b01\3\2\2\2\u0b01\u0b03\3\2\2\2\u0b02\u0b00\3\2"+
		"\2\2\u0b03\u0b04\7h\2\2\u0b04\u0b08\b\u00b0\1\2\u0b05\u0b06\5\u0164\u00b3"+
		"\2\u0b06\u0b07\b\u00b0\1\2\u0b07\u0b09\3\2\2\2\u0b08\u0b05\3\2\2\2\u0b08"+
		"\u0b09\3\2\2\2\u0b09\u0b0a\3\2\2\2\u0b0a\u0b0e\7;\2\2\u0b0b\u0b0c\5\u0178"+
		"\u00bd\2\u0b0c\u0b0d\b\u00b0\1\2\u0b0d\u0b0f\3\2\2\2\u0b0e\u0b0b\3\2\2"+
		"\2\u0b0e\u0b0f\3\2\2\2\u0b0f\u0b10\3\2\2\2\u0b10\u0b11\7<\2\2\u0b11\u0b13"+
		"\b\u00b0\1\2\u0b12\u0b14\5X-\2\u0b13\u0b12\3\2\2\2\u0b13\u0b14\3\2\2\2"+
		"\u0b14\u0b16\3\2\2\2\u0b15\u0aa1\3\2\2\2\u0b15\u0ad1\3\2\2\2\u0b15\u0af3"+
		"\3\2\2\2\u0b16\u015f\3\2\2\2\u0b17\u0b18\7C\2\2\u0b18\u0b1c\7!\2\2\u0b19"+
		"\u0b1a\5$\23\2\u0b1a\u0b1b\b\u00b1\1\2\u0b1b\u0b1d\3\2\2\2\u0b1c\u0b19"+
		"\3\2\2\2\u0b1c\u0b1d\3\2\2\2\u0b1d\u0b23\3\2\2\2\u0b1e\u0b1f\5\u00d2j"+
		"\2\u0b1f\u0b20\b\u00b1\1\2\u0b20\u0b22\3\2\2\2\u0b21\u0b1e\3\2\2\2\u0b22"+
		"\u0b25\3\2\2\2\u0b23\u0b21\3\2\2\2\u0b23\u0b24\3\2\2\2\u0b24\u0b26\3\2"+
		"\2\2\u0b25\u0b23\3\2\2\2\u0b26\u0b27\7h\2\2\u0b27\u0b2b\b\u00b1\1\2\u0b28"+
		"\u0b29\5\u0164\u00b3\2\u0b29\u0b2a\b\u00b1\1\2\u0b2a\u0b2c\3\2\2\2\u0b2b"+
		"\u0b28\3\2\2\2\u0b2b\u0b2c\3\2\2\2\u0b2c\u0b2d\3\2\2\2\u0b2d\u0b31\7;"+
		"\2\2\u0b2e\u0b2f\5\u0178\u00bd\2\u0b2f\u0b30\b\u00b1\1\2\u0b30\u0b32\3"+
		"\2\2\2\u0b31\u0b2e\3\2\2\2\u0b31\u0b32\3\2\2\2\u0b32\u0b33\3\2\2\2\u0b33"+
		"\u0b34\7<\2\2\u0b34\u0b36\b\u00b1\1\2\u0b35\u0b37\5X-\2\u0b36\u0b35\3"+
		"\2\2\2\u0b36\u0b37\3\2\2\2\u0b37\u0161\3\2\2\2\u0b38\u0b3c\7!\2\2\u0b39"+
		"\u0b3a\5$\23\2\u0b3a\u0b3b\b\u00b2\1\2\u0b3b\u0b3d\3\2\2\2\u0b3c\u0b39"+
		"\3\2\2\2\u0b3c\u0b3d\3\2\2\2\u0b3d\u0b43\3\2\2\2\u0b3e\u0b3f\5\u00d2j"+
		"\2\u0b3f\u0b40\b\u00b2\1\2\u0b40\u0b42\3\2\2\2\u0b41\u0b3e\3\2\2\2\u0b42"+
		"\u0b45\3\2\2\2\u0b43\u0b41\3\2\2\2\u0b43\u0b44\3\2\2\2\u0b44\u0b46\3\2"+
		"\2\2\u0b45\u0b43\3\2\2\2\u0b46\u0b47\7h\2\2\u0b47\u0b55\b\u00b2\1\2\u0b48"+
		"\u0b4e\7C\2\2\u0b49\u0b4a\5\u00d2j\2\u0b4a\u0b4b\b\u00b2\1\2\u0b4b\u0b4d"+
		"\3\2\2\2\u0b4c\u0b49\3\2\2\2\u0b4d\u0b50\3\2\2\2\u0b4e\u0b4c\3\2\2\2\u0b4e"+
		"\u0b4f\3\2\2\2\u0b4f\u0b51\3\2\2\2\u0b50\u0b4e\3\2\2\2\u0b51\u0b52\7h"+
		"\2\2\u0b52\u0b54\b\u00b2\1\2\u0b53\u0b48\3\2\2\2\u0b54\u0b57\3\2\2\2\u0b55"+
		"\u0b53\3\2\2\2\u0b55\u0b56\3\2\2\2\u0b56\u0b5b\3\2\2\2\u0b57\u0b55\3\2"+
		"\2\2\u0b58\u0b59\5\u0164\u00b3\2\u0b59\u0b5a\b\u00b2\1\2\u0b5a\u0b5c\3"+
		"\2\2\2\u0b5b\u0b58\3\2\2\2\u0b5b\u0b5c\3\2\2\2\u0b5c\u0b5d\3\2\2\2\u0b5d"+
		"\u0b61\7;\2\2\u0b5e\u0b5f\5\u0178\u00bd\2\u0b5f\u0b60\b\u00b2\1\2\u0b60"+
		"\u0b62\3\2\2\2\u0b61\u0b5e\3\2\2\2\u0b61\u0b62\3\2\2\2\u0b62\u0b63\3\2"+
		"\2\2\u0b63\u0b64\7<\2\2\u0b64\u0b66\b\u00b2\1\2\u0b65\u0b67\5X-\2\u0b66"+
		"\u0b65\3\2\2\2\u0b66\u0b67\3\2\2\2\u0b67\u0b8b\3\2\2\2\u0b68\u0b69\5\62"+
		"\32\2\u0b69\u0b6a\7C\2\2\u0b6a\u0b6e\7!\2\2\u0b6b\u0b6c\5$\23\2\u0b6c"+
		"\u0b6d\b\u00b2\1\2\u0b6d\u0b6f\3\2\2\2\u0b6e\u0b6b\3\2\2\2\u0b6e\u0b6f"+
		"\3\2\2\2\u0b6f\u0b75\3\2\2\2\u0b70\u0b71\5\u00d2j\2\u0b71\u0b72\b\u00b2"+
		"\1\2\u0b72\u0b74\3\2\2\2\u0b73\u0b70\3\2\2\2\u0b74\u0b77\3\2\2\2\u0b75"+
		"\u0b73\3\2\2\2\u0b75\u0b76\3\2\2\2\u0b76\u0b78\3\2\2\2\u0b77\u0b75\3\2"+
		"\2\2\u0b78\u0b79\7h\2\2\u0b79\u0b7d\b\u00b2\1\2\u0b7a\u0b7b\5\u0164\u00b3"+
		"\2\u0b7b\u0b7c\b\u00b2\1\2\u0b7c\u0b7e\3\2\2\2\u0b7d\u0b7a\3\2\2\2\u0b7d"+
		"\u0b7e\3\2\2\2\u0b7e\u0b7f\3\2\2\2\u0b7f\u0b83\7;\2\2\u0b80\u0b81\5\u0178"+
		"\u00bd\2\u0b81\u0b82\b\u00b2\1\2\u0b82\u0b84\3\2\2\2\u0b83\u0b80\3\2\2"+
		"\2\u0b83\u0b84\3\2\2\2\u0b84\u0b85\3\2\2\2\u0b85\u0b86\7<\2\2\u0b86\u0b88"+
		"\b\u00b2\1\2\u0b87\u0b89\5X-\2\u0b88\u0b87\3\2\2\2\u0b88\u0b89\3\2\2\2"+
		"\u0b89\u0b8b\3\2\2\2\u0b8a\u0b38\3\2\2\2\u0b8a\u0b68\3\2\2\2\u0b8b\u0163"+
		"\3\2\2\2\u0b8c\u0b8d\5$\23\2\u0b8d\u0b8e\b\u00b3\1\2\u0b8e\u0b93\3\2\2"+
		"\2\u0b8f\u0b90\7F\2\2\u0b90\u0b91\7E\2\2\u0b91\u0b93\b\u00b3\1\2\u0b92"+
		"\u0b8c\3\2\2\2\u0b92\u0b8f\3\2\2\2\u0b93\u0165\3\2\2\2\u0b94\u0b95\5\u014a"+
		"\u00a6\2\u0b95\u0b96\7C\2\2\u0b96\u0b97\7h\2\2\u0b97\u0b98\b\u00b4\1\2"+
		"\u0b98\u0ba5\3\2\2\2\u0b99\u0b9a\7*\2\2\u0b9a\u0b9b\7C\2\2\u0b9b\u0b9c"+
		"\7h\2\2\u0b9c\u0ba5\b\u00b4\1\2\u0b9d\u0b9e\5.\30\2\u0b9e\u0b9f\7C\2\2"+
		"\u0b9f\u0ba0\7*\2\2\u0ba0\u0ba1\7C\2\2\u0ba1\u0ba2\7h\2\2\u0ba2\u0ba3"+
		"\b\u00b4\1\2\u0ba3\u0ba5\3\2\2\2\u0ba4\u0b94\3\2\2\2\u0ba4\u0b99\3\2\2"+
		"\2\u0ba4\u0b9d\3\2\2\2\u0ba5\u0167\3\2\2\2\u0ba6\u0ba7\7C\2\2\u0ba7\u0ba8"+
		"\7h\2\2\u0ba8\u0ba9\b\u00b5\1\2\u0ba9\u0169\3\2\2\2\u0baa\u0bab\7*\2\2"+
		"\u0bab\u0bac\7C\2\2\u0bac\u0bad\7h\2\2\u0bad\u0bb6\b\u00b6\1\2\u0bae\u0baf"+
		"\5.\30\2\u0baf\u0bb0\7C\2\2\u0bb0\u0bb1\7*\2\2\u0bb1\u0bb2\7C\2\2\u0bb2"+
		"\u0bb3\7h\2\2\u0bb3\u0bb4\b\u00b6\1\2\u0bb4\u0bb6\3\2\2\2\u0bb5\u0baa"+
		"\3\2\2\2\u0bb5\u0bae\3\2\2\2\u0bb6\u016b\3\2\2\2\u0bb7\u0bb8\5\62\32\2"+
		"\u0bb8\u0bb9\7?\2\2\u0bb9\u0bba\5\u0188\u00c5\2\u0bba\u0bbb\7@\2\2\u0bbb"+
		"\u0bbc\b\u00b7\1\2\u0bbc\u0bc4\3\2\2\2\u0bbd\u0bbe\5\u0152\u00aa\2\u0bbe"+
		"\u0bbf\7?\2\2\u0bbf\u0bc0\5\u0188\u00c5\2\u0bc0\u0bc1\7@\2\2\u0bc1\u0bc2"+
		"\b\u00b7\1\2\u0bc2\u0bc4\3\2\2\2\u0bc3\u0bb7\3\2\2\2\u0bc3\u0bbd\3\2\2"+
		"\2\u0bc4\u0bcd\3\2\2\2\u0bc5\u0bc6\5\u0150\u00a9\2\u0bc6\u0bc7\7?\2\2"+
		"\u0bc7\u0bc8\5\u0188\u00c5\2\u0bc8\u0bc9\7@\2\2\u0bc9\u0bca\b\u00b7\1"+
		"\2\u0bca\u0bcc\3\2\2\2\u0bcb\u0bc5\3\2\2\2\u0bcc\u0bcf\3\2\2\2\u0bcd\u0bcb"+
		"\3\2\2\2\u0bcd\u0bce\3\2\2\2\u0bce\u016d\3\2\2\2\u0bcf\u0bcd\3\2\2\2\u0bd0"+
		"\u0bd1\5\u0156\u00ac\2\u0bd1\u0bd2\7?\2\2\u0bd2\u0bd3\5\u0188\u00c5\2"+
		"\u0bd3\u0bd4\7@\2\2\u0bd4\u0bd5\b\u00b8\1\2\u0bd5\u0bdd\3\2\2\2\u0bd6"+
		"\u0bd7\7?\2\2\u0bd7\u0bd8\5\u0188\u00c5\2\u0bd8\u0bd9\7@\2\2\u0bd9\u0bda"+
		"\b\u00b8\1\2\u0bda\u0bdc\3\2\2\2\u0bdb\u0bd6\3\2\2\2\u0bdc\u0bdf\3\2\2"+
		"\2\u0bdd\u0bdb\3\2\2\2\u0bdd\u0bde\3\2\2\2\u0bde\u016f\3\2\2\2\u0bdf\u0bdd"+
		"\3\2\2\2\u0be0\u0be1\5\62\32\2\u0be1\u0be2\7?\2\2\u0be2\u0be3\5\u0188"+
		"\u00c5\2\u0be3\u0be4\7@\2\2\u0be4\u0be5\b\u00b9\1\2\u0be5\u0bed\3\2\2"+
		"\2\u0be6\u0be7\5\u015c\u00af\2\u0be7\u0be8\7?\2\2\u0be8\u0be9\5\u0188"+
		"\u00c5\2\u0be9\u0bea\7@\2\2\u0bea\u0beb\b\u00b9\1\2\u0beb\u0bed\3\2\2"+
		"\2\u0bec\u0be0\3\2\2\2\u0bec\u0be6\3\2\2\2\u0bed\u0bf6\3\2\2\2\u0bee\u0bef"+
		"\5\u015a\u00ae\2\u0bef\u0bf0\7?\2\2\u0bf0\u0bf1\5\u0188\u00c5\2\u0bf1"+
		"\u0bf2\7@\2\2\u0bf2\u0bf3\b\u00b9\1\2\u0bf3\u0bf5\3\2\2\2\u0bf4\u0bee"+
		"\3\2\2\2\u0bf5\u0bf8\3\2\2\2\u0bf6\u0bf4\3\2\2\2\u0bf6\u0bf7\3\2\2\2\u0bf7"+
		"\u0171\3\2\2\2\u0bf8\u0bf6\3\2\2\2\u0bf9\u0bfa\7h\2\2\u0bfa\u0bfe\7;\2"+
		"\2\u0bfb\u0bfc\5\u0178\u00bd\2\u0bfc\u0bfd\b\u00ba\1\2\u0bfd\u0bff\3\2"+
		"\2\2\u0bfe\u0bfb\3\2\2\2\u0bfe\u0bff\3\2\2\2\u0bff\u0c00\3\2\2\2\u0c00"+
		"\u0c01\7<\2\2\u0c01\u0c48\b\u00ba\1\2\u0c02\u0c03\5\64\33\2\u0c03\u0c07"+
		"\7C\2\2\u0c04\u0c05\5$\23\2\u0c05\u0c06\b\u00ba\1\2\u0c06\u0c08\3\2\2"+
		"\2\u0c07\u0c04\3\2\2\2\u0c07\u0c08\3\2\2\2\u0c08\u0c09\3\2\2\2\u0c09\u0c0a"+
		"\7h\2\2\u0c0a\u0c0e\7;\2\2\u0c0b\u0c0c\5\u0178\u00bd\2\u0c0c\u0c0d\b\u00ba"+
		"\1\2\u0c0d\u0c0f\3\2\2\2\u0c0e\u0c0b\3\2\2\2\u0c0e\u0c0f\3\2\2\2\u0c0f"+
		"\u0c10\3\2\2\2\u0c10\u0c11\7<\2\2\u0c11\u0c12\b\u00ba\1\2\u0c12\u0c48"+
		"\3\2\2\2\u0c13\u0c14\5\u014a\u00a6\2\u0c14\u0c18\7C\2\2\u0c15\u0c16\5"+
		"$\23\2\u0c16\u0c17\b\u00ba\1\2\u0c17\u0c19\3\2\2\2\u0c18\u0c15\3\2\2\2"+
		"\u0c18\u0c19\3\2\2\2\u0c19\u0c1a\3\2\2\2\u0c1a\u0c1b\7h\2\2\u0c1b\u0c1f"+
		"\7;\2\2\u0c1c\u0c1d\5\u0178\u00bd\2\u0c1d\u0c1e\b\u00ba\1\2\u0c1e\u0c20"+
		"\3\2\2\2\u0c1f\u0c1c\3\2\2\2\u0c1f\u0c20\3\2\2\2\u0c20\u0c21\3\2\2\2\u0c21"+
		"\u0c22\7<\2\2\u0c22\u0c23\b\u00ba\1\2\u0c23\u0c48\3\2\2\2\u0c24\u0c25"+
		"\7*\2\2\u0c25\u0c29\7C\2\2\u0c26\u0c27\5$\23\2\u0c27\u0c28\b\u00ba\1\2"+
		"\u0c28\u0c2a\3\2\2\2\u0c29\u0c26\3\2\2\2\u0c29\u0c2a\3\2\2\2\u0c2a\u0c2b"+
		"\3\2\2\2\u0c2b\u0c2c\7h\2\2\u0c2c\u0c30\7;\2\2\u0c2d\u0c2e\5\u0178\u00bd"+
		"\2\u0c2e\u0c2f\b\u00ba\1\2\u0c2f\u0c31\3\2\2\2\u0c30\u0c2d\3\2\2\2\u0c30"+
		"\u0c31\3\2\2\2\u0c31\u0c32\3\2\2\2\u0c32\u0c33\7<\2\2\u0c33\u0c48\b\u00ba"+
		"\1\2\u0c34\u0c35\5.\30\2\u0c35\u0c36\7C\2\2\u0c36\u0c37\7*\2\2\u0c37\u0c3b"+
		"\7C\2\2\u0c38\u0c39\5$\23\2\u0c39\u0c3a\b\u00ba\1\2\u0c3a\u0c3c\3\2\2"+
		"\2\u0c3b\u0c38\3\2\2\2\u0c3b\u0c3c\3\2\2\2\u0c3c\u0c3d\3\2\2\2\u0c3d\u0c3e"+
		"\7h\2\2\u0c3e\u0c42\7;\2\2\u0c3f\u0c40\5\u0178\u00bd\2\u0c40\u0c41\b\u00ba"+
		"\1\2\u0c41\u0c43\3\2\2\2\u0c42\u0c3f\3\2\2\2\u0c42\u0c43\3\2\2\2\u0c43"+
		"\u0c44\3\2\2\2\u0c44\u0c45\7<\2\2\u0c45\u0c46\b\u00ba\1\2\u0c46\u0c48"+
		"\3\2\2\2\u0c47\u0bf9\3\2\2\2\u0c47\u0c02\3\2\2\2\u0c47\u0c13\3\2\2\2\u0c47"+
		"\u0c24\3\2\2\2\u0c47\u0c34\3\2\2\2\u0c48\u0173\3\2\2\2\u0c49\u0c4d\7C"+
		"\2\2\u0c4a\u0c4b\5$\23\2\u0c4b\u0c4c\b\u00bb\1\2\u0c4c\u0c4e\3\2\2\2\u0c4d"+
		"\u0c4a\3\2\2\2\u0c4d\u0c4e\3\2\2\2\u0c4e\u0c4f\3\2\2\2\u0c4f\u0c50\7h"+
		"\2\2\u0c50\u0c54\7;\2\2\u0c51\u0c52\5\u0178\u00bd\2\u0c52\u0c53\b\u00bb"+
		"\1\2\u0c53\u0c55\3\2\2\2\u0c54\u0c51\3\2\2\2\u0c54\u0c55\3\2\2\2\u0c55"+
		"\u0c56\3\2\2\2\u0c56\u0c57\7<\2\2\u0c57\u0c58\b\u00bb\1\2\u0c58\u0175"+
		"\3\2\2\2\u0c59\u0c5a\7h\2\2\u0c5a\u0c5e\7;\2\2\u0c5b\u0c5c\5\u0178\u00bd"+
		"\2\u0c5c\u0c5d\b\u00bc\1\2\u0c5d\u0c5f\3\2\2\2\u0c5e\u0c5b\3\2\2\2\u0c5e"+
		"\u0c5f\3\2\2\2\u0c5f\u0c60\3\2\2\2\u0c60\u0c61\7<\2\2\u0c61\u0c97\b\u00bc"+
		"\1\2\u0c62\u0c63\5\64\33\2\u0c63\u0c67\7C\2\2\u0c64\u0c65\5$\23\2\u0c65"+
		"\u0c66\b\u00bc\1\2\u0c66\u0c68\3\2\2\2\u0c67\u0c64\3\2\2\2\u0c67\u0c68"+
		"\3\2\2\2\u0c68\u0c69\3\2\2\2\u0c69\u0c6a\7h\2\2\u0c6a\u0c6e\7;\2\2\u0c6b"+
		"\u0c6c\5\u0178\u00bd\2\u0c6c\u0c6d\b\u00bc\1\2\u0c6d\u0c6f\3\2\2\2\u0c6e"+
		"\u0c6b\3\2\2\2\u0c6e\u0c6f\3\2\2\2\u0c6f\u0c70\3\2\2\2\u0c70\u0c71\7<"+
		"\2\2\u0c71\u0c72\b\u00bc\1\2\u0c72\u0c97\3\2\2\2\u0c73\u0c74\7*\2\2\u0c74"+
		"\u0c78\7C\2\2\u0c75\u0c76\5$\23\2\u0c76\u0c77\b\u00bc\1\2\u0c77\u0c79"+
		"\3\2\2\2\u0c78\u0c75\3\2\2\2\u0c78\u0c79\3\2\2\2\u0c79\u0c7a\3\2\2\2\u0c7a"+
		"\u0c7b\7h\2\2\u0c7b\u0c7f\7;\2\2\u0c7c\u0c7d\5\u0178\u00bd\2\u0c7d\u0c7e"+
		"\b\u00bc\1\2\u0c7e\u0c80\3\2\2\2\u0c7f\u0c7c\3\2\2\2\u0c7f\u0c80\3\2\2"+
		"\2\u0c80\u0c81\3\2\2\2\u0c81\u0c82\7<\2\2\u0c82\u0c97\b\u00bc\1\2\u0c83"+
		"\u0c84\5.\30\2\u0c84\u0c85\7C\2\2\u0c85\u0c86\7*\2\2\u0c86\u0c8a\7C\2"+
		"\2\u0c87\u0c88\5$\23\2\u0c88\u0c89\b\u00bc\1\2\u0c89\u0c8b\3\2\2\2\u0c8a"+
		"\u0c87\3\2\2\2\u0c8a\u0c8b\3\2\2\2\u0c8b\u0c8c\3\2\2\2\u0c8c\u0c8d\7h"+
		"\2\2\u0c8d\u0c91\7;\2\2\u0c8e\u0c8f\5\u0178\u00bd\2\u0c8f\u0c90\b\u00bc"+
		"\1\2\u0c90\u0c92\3\2\2\2\u0c91\u0c8e\3\2\2\2\u0c91\u0c92\3\2\2\2\u0c92"+
		"\u0c93\3\2\2\2\u0c93\u0c94\7<\2\2\u0c94\u0c95\b\u00bc\1\2\u0c95\u0c97"+
		"\3\2\2\2\u0c96\u0c59\3\2\2\2\u0c96\u0c62\3\2\2\2\u0c96\u0c73\3\2\2\2\u0c96"+
		"\u0c83\3\2\2\2\u0c97\u0177\3\2\2\2\u0c98\u0c99\5\u0188\u00c5\2\u0c99\u0c9a"+
		"\b\u00bd\1\2\u0c9a\u0ca1\3\2\2\2\u0c9b\u0c9c\7B\2\2\u0c9c\u0c9d\5\u0188"+
		"\u00c5\2\u0c9d\u0c9e\b\u00bd\1\2\u0c9e\u0ca0\3\2\2\2\u0c9f\u0c9b\3\2\2"+
		"\2\u0ca0\u0ca3\3\2\2\2\u0ca1\u0c9f\3\2\2\2\u0ca1\u0ca2\3\2\2\2\u0ca2\u0ca4"+
		"\3\2\2\2\u0ca3\u0ca1\3\2\2\2\u0ca4\u0ca5\b\u00bd\1\2\u0ca5\u0179\3\2\2"+
		"\2\u0ca6\u0ca7\5\62\32\2\u0ca7\u0cab\7\\\2\2\u0ca8\u0ca9\5$\23\2\u0ca9"+
		"\u0caa\b\u00be\1\2\u0caa\u0cac\3\2\2\2\u0cab\u0ca8\3\2\2\2\u0cab\u0cac"+
		"\3\2\2\2\u0cac\u0cad\3\2\2\2\u0cad\u0cae\7h\2\2\u0cae\u0caf\b\u00be\1"+
		"\2\u0caf\u0ce9\3\2\2\2\u0cb0\u0cb1\5\16\b\2\u0cb1\u0cb5\7\\\2\2\u0cb2"+
		"\u0cb3\5$\23\2\u0cb3\u0cb4\b\u00be\1\2\u0cb4\u0cb6\3\2\2\2\u0cb5\u0cb2"+
		"\3\2\2\2\u0cb5\u0cb6\3\2\2\2\u0cb6\u0cb7\3\2\2\2\u0cb7\u0cb8\7h\2\2\u0cb8"+
		"\u0cb9\b\u00be\1\2\u0cb9\u0ce9\3\2\2\2\u0cba\u0cbb\5\u014a\u00a6\2\u0cbb"+
		"\u0cbf\7\\\2\2\u0cbc\u0cbd\5$\23\2\u0cbd\u0cbe\b\u00be\1\2\u0cbe\u0cc0"+
		"\3\2\2\2\u0cbf\u0cbc\3\2\2\2\u0cbf\u0cc0\3\2\2\2\u0cc0\u0cc1\3\2\2\2\u0cc1"+
		"\u0cc2\7h\2\2\u0cc2\u0cc3\b\u00be\1\2\u0cc3\u0ce9\3\2\2\2\u0cc4\u0cc5"+
		"\7*\2\2\u0cc5\u0cc9\7\\\2\2\u0cc6\u0cc7\5$\23\2\u0cc7\u0cc8\b\u00be\1"+
		"\2\u0cc8\u0cca\3\2\2\2\u0cc9\u0cc6\3\2\2\2\u0cc9\u0cca\3\2\2\2\u0cca\u0ccb"+
		"\3\2\2\2\u0ccb\u0ccc\7h\2\2\u0ccc\u0ce9\b\u00be\1\2\u0ccd\u0cce\5.\30"+
		"\2\u0cce\u0ccf\7C\2\2\u0ccf\u0cd0\7*\2\2\u0cd0\u0cd4\7\\\2\2\u0cd1\u0cd2"+
		"\5$\23\2\u0cd2\u0cd3\b\u00be\1\2\u0cd3\u0cd5\3\2\2\2\u0cd4\u0cd1\3\2\2"+
		"\2\u0cd4\u0cd5\3\2\2\2\u0cd5\u0cd6\3\2\2\2\u0cd6\u0cd7\7h\2\2\u0cd7\u0cd8"+
		"\b\u00be\1\2\u0cd8\u0ce9\3\2\2\2\u0cd9\u0cda\5\22\n\2\u0cda\u0cde\7\\"+
		"\2\2\u0cdb\u0cdc\5$\23\2\u0cdc\u0cdd\b\u00be\1\2\u0cdd\u0cdf\3\2\2\2\u0cde"+
		"\u0cdb\3\2\2\2\u0cde\u0cdf\3\2\2\2\u0cdf\u0ce0\3\2\2\2\u0ce0\u0ce1\7!"+
		"\2\2\u0ce1\u0ce2\b\u00be\1\2\u0ce2\u0ce9\3\2\2\2\u0ce3\u0ce4\5\30\r\2"+
		"\u0ce4\u0ce5\7\\\2\2\u0ce5\u0ce6\7!\2\2\u0ce6\u0ce7\b\u00be\1\2\u0ce7"+
		"\u0ce9\3\2\2\2\u0ce8\u0ca6\3\2\2\2\u0ce8\u0cb0\3\2\2\2\u0ce8\u0cba\3\2"+
		"\2\2\u0ce8\u0cc4\3\2\2\2\u0ce8\u0ccd\3\2\2\2\u0ce8\u0cd9\3\2\2\2\u0ce8"+
		"\u0ce3\3\2\2\2\u0ce9\u017b\3\2\2\2\u0cea\u0cee\7\\\2\2\u0ceb\u0cec\5$"+
		"\23\2\u0cec\u0ced\b\u00bf\1\2\u0ced\u0cef\3\2\2\2\u0cee\u0ceb\3\2\2\2"+
		"\u0cee\u0cef\3\2\2\2\u0cef\u0cf0\3\2\2\2\u0cf0\u0cf1\7h\2\2\u0cf1\u0cf2"+
		"\b\u00bf\1\2\u0cf2\u017d\3\2\2\2\u0cf3\u0cf4\5\62\32\2\u0cf4\u0cf8\7\\"+
		"\2\2\u0cf5\u0cf6\5$\23\2\u0cf6\u0cf7\b\u00c0\1\2\u0cf7\u0cf9\3\2\2\2\u0cf8"+
		"\u0cf5\3\2\2\2\u0cf8\u0cf9\3\2\2\2\u0cf9\u0cfa\3\2\2\2\u0cfa\u0cfb\7h"+
		"\2\2\u0cfb\u0cfc\b\u00c0\1\2\u0cfc\u0d2c\3\2\2\2\u0cfd\u0cfe\5\16\b\2"+
		"\u0cfe\u0d02\7\\\2\2\u0cff\u0d00\5$\23\2\u0d00\u0d01\b\u00c0\1\2\u0d01"+
		"\u0d03\3\2\2\2\u0d02\u0cff\3\2\2\2\u0d02\u0d03\3\2\2\2\u0d03\u0d04\3\2"+
		"\2\2\u0d04\u0d05\7h\2\2\u0d05\u0d06\b\u00c0\1\2\u0d06\u0d2c\3\2\2\2\u0d07"+
		"\u0d08\7*\2\2\u0d08\u0d0c\7\\\2\2\u0d09\u0d0a\5$\23\2\u0d0a\u0d0b\b\u00c0"+
		"\1\2\u0d0b\u0d0d\3\2\2\2\u0d0c\u0d09\3\2\2\2\u0d0c\u0d0d\3\2\2\2\u0d0d"+
		"\u0d0e\3\2\2\2\u0d0e\u0d0f\7h\2\2\u0d0f\u0d2c\b\u00c0\1\2\u0d10\u0d11"+
		"\5.\30\2\u0d11\u0d12\7C\2\2\u0d12\u0d13\7*\2\2\u0d13\u0d17\7\\\2\2\u0d14"+
		"\u0d15\5$\23\2\u0d15\u0d16\b\u00c0\1\2\u0d16\u0d18\3\2\2\2\u0d17\u0d14"+
		"\3\2\2\2\u0d17\u0d18\3\2\2\2\u0d18\u0d19\3\2\2\2\u0d19\u0d1a\7h\2\2\u0d1a"+
		"\u0d1b\b\u00c0\1\2\u0d1b\u0d2c\3\2\2\2\u0d1c\u0d1d\5\22\n\2\u0d1d\u0d21"+
		"\7\\\2\2\u0d1e\u0d1f\5$\23\2\u0d1f\u0d20\b\u00c0\1\2\u0d20\u0d22\3\2\2"+
		"\2\u0d21\u0d1e\3\2\2\2\u0d21\u0d22\3\2\2\2\u0d22\u0d23\3\2\2\2\u0d23\u0d24"+
		"\7!\2\2\u0d24\u0d25\b\u00c0\1\2\u0d25\u0d2c\3\2\2\2\u0d26\u0d27\5\30\r"+
		"\2\u0d27\u0d28\7\\\2\2\u0d28\u0d29\7!\2\2\u0d29\u0d2a\b\u00c0\1\2\u0d2a"+
		"\u0d2c\3\2\2\2\u0d2b\u0cf3\3\2\2\2\u0d2b\u0cfd\3\2\2\2\u0d2b\u0d07\3\2"+
		"\2\2\u0d2b\u0d10\3\2\2\2\u0d2b\u0d1c\3\2\2\2\u0d2b\u0d26\3\2\2\2\u0d2c"+
		"\u017f\3\2\2\2\u0d2d\u0d2e\7!\2\2\u0d2e\u0d2f\5\6\4\2\u0d2f\u0d33\5\u0182"+
		"\u00c2\2\u0d30\u0d31\5\32\16\2\u0d31\u0d32\b\u00c1\1\2\u0d32\u0d34\3\2"+
		"\2\2\u0d33\u0d30\3\2\2\2\u0d33\u0d34\3\2\2\2\u0d34\u0d35\3\2\2\2\u0d35"+
		"\u0d36\b\u00c1\1\2\u0d36\u0d4e\3\2\2\2\u0d37\u0d38\7!\2\2\u0d38\u0d39"+
		"\5\20\t\2\u0d39\u0d3d\5\u0182\u00c2\2\u0d3a\u0d3b\5\32\16\2\u0d3b\u0d3c"+
		"\b\u00c1\1\2\u0d3c\u0d3e\3\2\2\2\u0d3d\u0d3a\3\2\2\2\u0d3d\u0d3e\3\2\2"+
		"\2\u0d3e\u0d3f\3\2\2\2\u0d3f\u0d40\b\u00c1\1\2\u0d40\u0d4e\3\2\2\2\u0d41"+
		"\u0d42\7!\2\2\u0d42\u0d43\5\6\4\2\u0d43\u0d44\5\32\16\2\u0d44\u0d45\5"+
		"\u00e4s\2\u0d45\u0d46\b\u00c1\1\2\u0d46\u0d4e\3\2\2\2\u0d47\u0d48\7!\2"+
		"\2\u0d48\u0d49\5\20\t\2\u0d49\u0d4a\5\32\16\2\u0d4a\u0d4b\5\u00e4s\2\u0d4b"+
		"\u0d4c\b\u00c1\1\2\u0d4c\u0d4e\3\2\2\2\u0d4d\u0d2d\3\2\2\2\u0d4d\u0d37"+
		"\3\2\2\2\u0d4d\u0d41\3\2\2\2\u0d4d\u0d47\3\2\2\2\u0d4e\u0181\3\2\2\2\u0d4f"+
		"\u0d50\5\u0184\u00c3\2\u0d50\u0d56\b\u00c2\1\2\u0d51\u0d52\5\u0184\u00c3"+
		"\2\u0d52\u0d53\b\u00c2\1\2\u0d53\u0d55\3\2\2\2\u0d54\u0d51\3\2\2\2\u0d55"+
		"\u0d58\3\2\2\2\u0d56\u0d54\3\2\2\2\u0d56\u0d57\3\2\2\2\u0d57\u0183\3\2"+
		"\2\2\u0d58\u0d56\3\2\2\2\u0d59\u0d5a\5\u00d2j\2\u0d5a\u0d5b\b\u00c3\1"+
		"\2\u0d5b\u0d5d\3\2\2\2\u0d5c\u0d59\3\2\2\2\u0d5d\u0d60\3\2\2\2\u0d5e\u0d5c"+
		"\3\2\2\2\u0d5e\u0d5f\3\2\2\2\u0d5f\u0d61\3\2\2\2\u0d60\u0d5e\3\2\2\2\u0d61"+
		"\u0d62\7?\2\2\u0d62\u0d63\5\u0188\u00c5\2\u0d63\u0d64\7@\2\2\u0d64\u0d65"+
		"\b\u00c3\1\2\u0d65\u0185\3\2\2\2\u0d66\u0d67\5\u0188\u00c5\2\u0d67\u0d68"+
		"\b\u00c4\1\2\u0d68\u0187\3\2\2\2\u0d69\u0d6a\5\u018a\u00c6\2\u0d6a\u0d6b"+
		"\b\u00c5\1\2\u0d6b\u0d70\3\2\2\2\u0d6c\u0d6d\5\u0192\u00ca\2\u0d6d\u0d6e"+
		"\b\u00c5\1\2\u0d6e\u0d70\3\2\2\2\u0d6f\u0d69\3\2\2\2\u0d6f\u0d6c\3\2\2"+
		"\2\u0d70\u0189\3\2\2\2\u0d71\u0d72\5\u018c\u00c7\2\u0d72\u0d73\7[\2\2"+
		"\u0d73\u0d74\5\u0190\u00c9\2\u0d74\u0d75\b\u00c6\1\2\u0d75\u018b\3\2\2"+
		"\2\u0d76\u0d77\7h\2\2\u0d77\u0d86\b\u00c7\1\2\u0d78\u0d7c\7;\2\2\u0d79"+
		"\u0d7a\5\u0086D\2\u0d7a\u0d7b\b\u00c7\1\2\u0d7b\u0d7d\3\2\2\2\u0d7c\u0d79"+
		"\3\2\2\2\u0d7c\u0d7d\3\2\2\2\u0d7d\u0d7e\3\2\2\2\u0d7e\u0d7f\7<\2\2\u0d7f"+
		"\u0d86\b\u00c7\1\2\u0d80\u0d81\7;\2\2\u0d81\u0d82\5\u018e\u00c8\2\u0d82"+
		"\u0d83\7<\2\2\u0d83\u0d84\b\u00c7\1\2\u0d84\u0d86\3\2\2\2\u0d85\u0d76"+
		"\3\2\2\2\u0d85\u0d78\3\2\2\2\u0d85\u0d80\3\2\2\2\u0d86\u018d\3\2\2\2\u0d87"+
		"\u0d88\7h\2\2\u0d88\u0d89\b\u00c8\1\2\u0d89\u0d8f\3\2\2\2\u0d8a\u0d8b"+
		"\7B\2\2\u0d8b\u0d8c\7h\2\2\u0d8c\u0d8e\b\u00c8\1\2\u0d8d\u0d8a\3\2\2\2"+
		"\u0d8e\u0d91\3\2\2\2\u0d8f\u0d8d\3\2\2\2\u0d8f\u0d90\3\2\2\2\u0d90\u0d92"+
		"\3\2\2\2\u0d91\u0d8f\3\2\2\2\u0d92\u0d93\b\u00c8\1\2\u0d93\u018f\3\2\2"+
		"\2\u0d94\u0d95\5\u0188\u00c5\2\u0d95\u0d96\b\u00c9\1\2\u0d96\u0d9b\3\2"+
		"\2\2\u0d97\u0d98\5\u00e8u\2\u0d98\u0d99\b\u00c9\1\2\u0d99\u0d9b\3\2\2"+
		"\2\u0d9a\u0d94\3\2\2\2\u0d9a\u0d97\3\2\2\2\u0d9b\u0191\3\2\2\2\u0d9c\u0d9d"+
		"\5\u019a\u00ce\2\u0d9d\u0d9e\b\u00ca\1\2\u0d9e\u0da3\3\2\2\2\u0d9f\u0da0"+
		"\5\u0194\u00cb\2\u0da0\u0da1\b\u00ca\1\2\u0da1\u0da3\3\2\2\2\u0da2\u0d9c"+
		"\3\2\2\2\u0da2\u0d9f\3\2\2\2\u0da3\u0193\3\2\2\2\u0da4\u0da5\5\u0196\u00cc"+
		"\2\u0da5\u0da6\5\u0198\u00cd\2\u0da6\u0da7\5\u0188\u00c5\2\u0da7\u0da8"+
		"\b\u00cb\1\2\u0da8\u0195\3\2\2\2\u0da9\u0daa\5\62\32\2\u0daa\u0dab\b\u00cc"+
		"\1\2\u0dab\u0db3\3\2\2\2\u0dac\u0dad\5\u0166\u00b4\2\u0dad\u0dae\b\u00cc"+
		"\1\2\u0dae\u0db3\3\2\2\2\u0daf\u0db0\5\u016c\u00b7\2\u0db0\u0db1\b\u00cc"+
		"\1\2\u0db1\u0db3\3\2\2\2\u0db2\u0da9\3\2\2\2\u0db2\u0dac\3\2\2\2\u0db2"+
		"\u0daf\3\2\2\2\u0db3\u0197\3\2\2\2\u0db4\u0db5\7D\2\2\u0db5\u0dcd\b\u00cd"+
		"\1\2\u0db6\u0db7\7_\2\2\u0db7\u0dcd\b\u00cd\1\2\u0db8\u0db9\7`\2\2\u0db9"+
		"\u0dcd\b\u00cd\1\2\u0dba\u0dbb\7d\2\2\u0dbb\u0dcd\b\u00cd\1\2\u0dbc\u0dbd"+
		"\7]\2\2\u0dbd\u0dcd\b\u00cd\1\2\u0dbe\u0dbf\7^\2\2\u0dbf\u0dcd\b\u00cd"+
		"\1\2\u0dc0\u0dc1\7e\2\2\u0dc1\u0dcd\b\u00cd\1\2\u0dc2\u0dc3\7f\2\2\u0dc3"+
		"\u0dcd\b\u00cd\1\2\u0dc4\u0dc5\7g\2\2\u0dc5\u0dcd\b\u00cd\1\2\u0dc6\u0dc7"+
		"\7a\2\2\u0dc7\u0dcd\b\u00cd\1\2\u0dc8\u0dc9\7c\2\2\u0dc9\u0dcd\b\u00cd"+
		"\1\2\u0dca\u0dcb\7b\2\2\u0dcb\u0dcd\b\u00cd\1\2\u0dcc\u0db4\3\2\2\2\u0dcc"+
		"\u0db6\3\2\2\2\u0dcc\u0db8\3\2\2\2\u0dcc\u0dba\3\2\2\2\u0dcc\u0dbc\3\2"+
		"\2\2\u0dcc\u0dbe\3\2\2\2\u0dcc\u0dc0\3\2\2\2\u0dcc\u0dc2\3\2\2\2\u0dcc"+
		"\u0dc4\3\2\2\2\u0dcc\u0dc6\3\2\2\2\u0dcc\u0dc8\3\2\2\2\u0dcc\u0dca\3\2"+
		"\2\2\u0dcd\u0199\3\2\2\2\u0dce\u0dcf\5\u019c\u00cf\2\u0dcf\u0dd0\b\u00ce"+
		"\1\2\u0dd0\u0dd9\3\2\2\2\u0dd1\u0dd2\5\u019c\u00cf\2\u0dd2\u0dd3\7I\2"+
		"\2\u0dd3\u0dd4\5\u0188\u00c5\2\u0dd4\u0dd5\7J\2\2\u0dd5\u0dd6\5\u019a"+
		"\u00ce\2\u0dd6\u0dd7\b\u00ce\1\2\u0dd7\u0dd9\3\2\2\2\u0dd8\u0dce\3\2\2"+
		"\2\u0dd8\u0dd1\3\2\2\2\u0dd9\u019b\3\2\2\2\u0dda\u0ddb\b\u00cf\1\2\u0ddb"+
		"\u0ddc\5\u019e\u00d0\2\u0ddc\u0ddd\b\u00cf\1\2\u0ddd\u0de5\3\2\2\2\u0dde"+
		"\u0ddf\f\3\2\2\u0ddf\u0de0\7P\2\2\u0de0\u0de1\5\u019e\u00d0\2\u0de1\u0de2"+
		"\b\u00cf\1\2\u0de2\u0de4\3\2\2\2\u0de3\u0dde\3\2\2\2\u0de4\u0de7\3\2\2"+
		"\2\u0de5\u0de3\3\2\2\2\u0de5\u0de6\3\2\2\2\u0de6\u019d\3\2\2\2\u0de7\u0de5"+
		"\3\2\2\2\u0de8\u0de9\b\u00d0\1\2\u0de9\u0dea\5\u01a0\u00d1\2\u0dea\u0deb"+
		"\b\u00d0\1\2\u0deb\u0df3\3\2\2\2\u0dec\u0ded\f\3\2\2\u0ded\u0dee\7O\2"+
		"\2\u0dee\u0def\5\u01a0\u00d1\2\u0def\u0df0\b\u00d0\1\2\u0df0\u0df2\3\2"+
		"\2\2\u0df1\u0dec\3\2\2\2\u0df2\u0df5\3\2\2\2\u0df3\u0df1\3\2\2\2\u0df3"+
		"\u0df4\3\2\2\2\u0df4\u019f\3\2\2\2\u0df5\u0df3\3\2\2\2\u0df6\u0df7\b\u00d1"+
		"\1\2\u0df7\u0df8\5\u01a2\u00d2\2\u0df8\u0df9\b\u00d1\1\2\u0df9\u0e01\3"+
		"\2\2\2\u0dfa\u0dfb\f\3\2\2\u0dfb\u0dfc\7X\2\2\u0dfc\u0dfd\5\u01a2\u00d2"+
		"\2\u0dfd\u0dfe\b\u00d1\1\2\u0dfe\u0e00\3\2\2\2\u0dff\u0dfa\3\2\2\2\u0e00"+
		"\u0e03\3\2\2\2\u0e01\u0dff\3\2\2\2\u0e01\u0e02\3\2\2\2\u0e02\u01a1\3\2"+
		"\2\2\u0e03\u0e01\3\2\2\2\u0e04\u0e05\b\u00d2\1\2\u0e05\u0e06\5\u01a4\u00d3"+
		"\2\u0e06\u0e07\b\u00d2\1\2\u0e07\u0e0f\3\2\2\2\u0e08\u0e09\f\3\2\2\u0e09"+
		"\u0e0a\7Y\2\2\u0e0a\u0e0b\5\u01a4\u00d3\2\u0e0b\u0e0c\b\u00d2\1\2\u0e0c"+
		"\u0e0e\3\2\2\2\u0e0d\u0e08\3\2\2\2\u0e0e\u0e11\3\2\2\2\u0e0f\u0e0d\3\2"+
		"\2\2\u0e0f\u0e10\3\2\2\2\u0e10\u01a3\3\2\2\2\u0e11\u0e0f\3\2\2\2\u0e12"+
		"\u0e13\b\u00d3\1\2\u0e13\u0e14\5\u01a6\u00d4\2\u0e14\u0e15\b\u00d3\1\2"+
		"\u0e15\u0e1d\3\2\2\2\u0e16\u0e17\f\3\2\2\u0e17\u0e18\7W\2\2\u0e18\u0e19"+
		"\5\u01a6\u00d4\2\u0e19\u0e1a\b\u00d3\1\2\u0e1a\u0e1c\3\2\2\2\u0e1b\u0e16"+
		"\3\2\2\2\u0e1c\u0e1f\3\2\2\2\u0e1d\u0e1b\3\2\2\2\u0e1d\u0e1e\3\2\2\2\u0e1e"+
		"\u01a5\3\2\2\2\u0e1f\u0e1d\3\2\2\2\u0e20\u0e21\b\u00d4\1\2\u0e21\u0e22"+
		"\5\u01a8\u00d5\2\u0e22\u0e23\b\u00d4\1\2\u0e23\u0e30\3\2\2\2\u0e24\u0e25"+
		"\f\4\2\2\u0e25\u0e26\7K\2\2\u0e26\u0e27\5\u01a8\u00d5\2\u0e27\u0e28\b"+
		"\u00d4\1\2\u0e28\u0e2f\3\2\2\2\u0e29\u0e2a\f\3\2\2\u0e2a\u0e2b\7N\2\2"+
		"\u0e2b\u0e2c\5\u01a8\u00d5\2\u0e2c\u0e2d\b\u00d4\1\2\u0e2d\u0e2f\3\2\2"+
		"\2\u0e2e\u0e24\3\2\2\2\u0e2e\u0e29\3\2\2\2\u0e2f\u0e32\3\2\2\2\u0e30\u0e2e"+
		"\3\2\2\2\u0e30\u0e31\3\2\2\2\u0e31\u01a7\3\2\2\2\u0e32\u0e30\3\2\2\2\u0e33"+
		"\u0e34\b\u00d5\1\2\u0e34\u0e35\5\u01aa\u00d6\2\u0e35\u0e36\b\u00d5\1\2"+
		"\u0e36\u0e52\3\2\2\2\u0e37\u0e38\f\7\2\2\u0e38\u0e39\7F\2\2\u0e39\u0e3a"+
		"\5\u01aa\u00d6\2\u0e3a\u0e3b\b\u00d5\1\2\u0e3b\u0e51\3\2\2\2\u0e3c\u0e3d"+
		"\f\6\2\2\u0e3d\u0e3e\7E\2\2\u0e3e\u0e3f\5\u01aa\u00d6\2\u0e3f\u0e40\b"+
		"\u00d5\1\2\u0e40\u0e51\3\2\2\2\u0e41\u0e42\f\5\2\2\u0e42\u0e43\7L\2\2"+
		"\u0e43\u0e44\5\u01aa\u00d6\2\u0e44\u0e45\b\u00d5\1\2\u0e45\u0e51\3\2\2"+
		"\2\u0e46\u0e47\f\4\2\2\u0e47\u0e48\7M\2\2\u0e48\u0e49\5\u01aa\u00d6\2"+
		"\u0e49\u0e4a\b\u00d5\1\2\u0e4a\u0e51\3\2\2\2\u0e4b\u0e4c\f\3\2\2\u0e4c"+
		"\u0e4d\7\34\2\2\u0e4d\u0e4e\5\16\b\2\u0e4e\u0e4f\b\u00d5\1\2\u0e4f\u0e51"+
		"\3\2\2\2\u0e50\u0e37\3\2\2\2\u0e50\u0e3c\3\2\2\2\u0e50\u0e41\3\2\2\2\u0e50"+
		"\u0e46\3\2\2\2\u0e50\u0e4b\3\2\2\2\u0e51\u0e54\3\2\2\2\u0e52\u0e50\3\2"+
		"\2\2\u0e52\u0e53\3\2\2\2\u0e53\u01a9\3\2\2\2\u0e54\u0e52\3\2\2\2\u0e55"+
		"\u0e56\b\u00d6\1\2\u0e56\u0e57\5\u01ac\u00d7\2\u0e57\u0e58\b\u00d6\1\2"+
		"\u0e58\u0e6e\3\2\2\2\u0e59\u0e5a\f\5\2\2\u0e5a\u0e5b\7F\2\2\u0e5b\u0e5c"+
		"\7F\2\2\u0e5c\u0e5d\5\u01ac\u00d7\2\u0e5d\u0e5e\b\u00d6\1\2\u0e5e\u0e6d"+
		"\3\2\2\2\u0e5f\u0e60\f\4\2\2\u0e60\u0e61\7E\2\2\u0e61\u0e62\7E\2\2\u0e62"+
		"\u0e63\5\u01ac\u00d7\2\u0e63\u0e64\b\u00d6\1\2\u0e64\u0e6d\3\2\2\2\u0e65"+
		"\u0e66\f\3\2\2\u0e66\u0e67\7E\2\2\u0e67\u0e68\7E\2\2\u0e68\u0e69\7E\2"+
		"\2\u0e69\u0e6a\5\u01ac\u00d7\2\u0e6a\u0e6b\b\u00d6\1\2\u0e6b\u0e6d\3\2"+
		"\2\2\u0e6c\u0e59\3\2\2\2\u0e6c\u0e5f\3\2\2\2\u0e6c\u0e65\3\2\2\2\u0e6d"+
		"\u0e70\3\2\2\2\u0e6e\u0e6c\3\2\2\2\u0e6e\u0e6f\3\2\2\2\u0e6f\u01ab\3\2"+
		"\2\2\u0e70\u0e6e\3\2\2\2\u0e71\u0e72\b\u00d7\1\2\u0e72\u0e73\5\u01ae\u00d8"+
		"\2\u0e73\u0e74\b\u00d7\1\2\u0e74\u0e81\3\2\2\2\u0e75\u0e76\f\4\2\2\u0e76"+
		"\u0e77\7S\2\2\u0e77\u0e78\5\u01ae\u00d8\2\u0e78\u0e79\b\u00d7\1\2\u0e79"+
		"\u0e80\3\2\2\2\u0e7a\u0e7b\f\3\2\2\u0e7b\u0e7c\7T\2\2\u0e7c\u0e7d\5\u01ae"+
		"\u00d8\2\u0e7d\u0e7e\b\u00d7\1\2\u0e7e\u0e80\3\2\2\2\u0e7f\u0e75\3\2\2"+
		"\2\u0e7f\u0e7a\3\2\2\2\u0e80\u0e83\3\2\2\2\u0e81\u0e7f\3\2\2\2\u0e81\u0e82"+
		"\3\2\2\2\u0e82\u01ad\3\2\2\2\u0e83\u0e81\3\2\2\2\u0e84\u0e85\b\u00d8\1"+
		"\2\u0e85\u0e86\5\u01b0\u00d9\2\u0e86\u0e87\b\u00d8\1\2\u0e87\u0e99\3\2"+
		"\2\2\u0e88\u0e89\f\5\2\2\u0e89\u0e8a\7U\2\2\u0e8a\u0e8b\5\u01b0\u00d9"+
		"\2\u0e8b\u0e8c\b\u00d8\1\2\u0e8c\u0e98\3\2\2\2\u0e8d\u0e8e\f\4\2\2\u0e8e"+
		"\u0e8f\7V\2\2\u0e8f\u0e90\5\u01b0\u00d9\2\u0e90\u0e91\b\u00d8\1\2\u0e91"+
		"\u0e98\3\2\2\2\u0e92\u0e93\f\3\2\2\u0e93\u0e94\7Z\2\2\u0e94\u0e95\5\u01b0"+
		"\u00d9\2\u0e95\u0e96\b\u00d8\1\2\u0e96\u0e98\3\2\2\2\u0e97\u0e88\3\2\2"+
		"\2\u0e97\u0e8d\3\2\2\2\u0e97\u0e92\3\2\2\2\u0e98\u0e9b\3\2\2\2\u0e99\u0e97"+
		"\3\2\2\2\u0e99\u0e9a\3\2\2\2\u0e9a\u01af\3\2\2\2\u0e9b\u0e99\3\2\2\2\u0e9c"+
		"\u0e9d\5\u01b2\u00da\2\u0e9d\u0e9e\b\u00d9\1\2\u0e9e\u0eae\3\2\2\2\u0e9f"+
		"\u0ea0\5\u01b4\u00db\2\u0ea0\u0ea1\b\u00d9\1\2\u0ea1\u0eae\3\2\2\2\u0ea2"+
		"\u0ea3\7S\2\2\u0ea3\u0ea4\5\u01b0\u00d9\2\u0ea4\u0ea5\b\u00d9\1\2\u0ea5"+
		"\u0eae\3\2\2\2\u0ea6\u0ea7\7T\2\2\u0ea7\u0ea8\5\u01b0\u00d9\2\u0ea8\u0ea9"+
		"\b\u00d9\1\2\u0ea9\u0eae\3\2\2\2\u0eaa\u0eab\5\u01b6\u00dc\2\u0eab\u0eac"+
		"\b\u00d9\1\2\u0eac\u0eae\3\2\2\2\u0ead\u0e9c\3\2\2\2\u0ead\u0e9f\3\2\2"+
		"\2\u0ead\u0ea2\3\2\2\2\u0ead\u0ea6\3\2\2\2\u0ead\u0eaa\3\2\2\2\u0eae\u01b1"+
		"\3\2\2\2\u0eaf\u0eb0\7Q\2\2\u0eb0\u0eb1\5\u01b0\u00d9\2\u0eb1\u0eb2\b"+
		"\u00da\1\2\u0eb2\u01b3\3\2\2\2\u0eb3\u0eb4\7R\2\2\u0eb4\u0eb5\5\u01b0"+
		"\u00d9\2\u0eb5\u0eb6\b\u00db\1\2\u0eb6\u01b5\3\2\2\2\u0eb7\u0eb8\5\u01b8"+
		"\u00dd\2\u0eb8\u0eb9\b\u00dc\1\2\u0eb9\u0ec6\3\2\2\2\u0eba\u0ebb\7H\2"+
		"\2\u0ebb\u0ebc\5\u01b0\u00d9\2\u0ebc\u0ebd\b\u00dc\1\2\u0ebd\u0ec6\3\2"+
		"\2\2\u0ebe\u0ebf\7G\2\2\u0ebf\u0ec0\5\u01b0\u00d9\2\u0ec0\u0ec1\b\u00dc"+
		"\1\2\u0ec1\u0ec6\3\2\2\2\u0ec2\u0ec3\5\u01be\u00e0\2\u0ec3\u0ec4\b\u00dc"+
		"\1\2\u0ec4\u0ec6\3\2\2\2\u0ec5\u0eb7\3\2\2\2\u0ec5\u0eba\3\2\2\2\u0ec5"+
		"\u0ebe\3\2\2\2\u0ec5\u0ec2\3\2\2\2\u0ec6\u01b7\3\2\2\2\u0ec7\u0ec8\5\u014a"+
		"\u00a6\2\u0ec8\u0ec9\b\u00dd\1\2\u0ec9\u0ece\3\2\2\2\u0eca\u0ecb\5\62"+
		"\32\2\u0ecb\u0ecc\b\u00dd\1\2\u0ecc\u0ece\3\2\2\2\u0ecd\u0ec7\3\2\2\2"+
		"\u0ecd\u0eca\3\2\2\2\u0ece\u0ed5\3\2\2\2\u0ecf\u0ed0\7Q\2\2\u0ed0\u0ed4"+
		"\b\u00dd\1\2\u0ed1\u0ed2\7R\2\2\u0ed2\u0ed4\b\u00dd\1\2\u0ed3\u0ecf\3"+
		"\2\2\2\u0ed3\u0ed1\3\2\2\2\u0ed4\u0ed7\3\2\2\2\u0ed5\u0ed3\3\2\2\2\u0ed5"+
		"\u0ed6\3\2\2\2\u0ed6\u01b9\3\2\2\2\u0ed7\u0ed5\3\2\2\2\u0ed8\u0ed9\5\u01b8"+
		"\u00dd\2\u0ed9\u0eda\7Q\2\2\u0eda\u0edb\b\u00de\1\2\u0edb\u01bb\3\2\2"+
		"\2\u0edc\u0edd\5\u01b8\u00dd\2\u0edd\u0ede\7R\2\2\u0ede\u0edf\b\u00df"+
		"\1\2\u0edf\u01bd\3\2\2\2\u0ee0\u0ee1\7;\2\2\u0ee1\u0ee2\5\6\4\2\u0ee2"+
		"\u0ee3\7<\2\2\u0ee3\u0ee4\5\u01b0\u00d9\2\u0ee4\u0ee5\b\u00e0\1\2\u0ee5"+
		"\u0f03\3\2\2\2\u0ee6\u0ee7\7;\2\2\u0ee7\u0eed\5\16\b\2\u0ee8\u0ee9\5\""+
		"\22\2\u0ee9\u0eea\b\u00e0\1\2\u0eea\u0eec\3\2\2\2\u0eeb\u0ee8\3\2\2\2"+
		"\u0eec\u0eef\3\2\2\2\u0eed\u0eeb\3\2\2\2\u0eed\u0eee\3\2\2\2\u0eee\u0ef0"+
		"\3\2\2\2\u0eef\u0eed\3\2\2\2\u0ef0\u0ef1\7<\2\2\u0ef1\u0ef2\5\u01b6\u00dc"+
		"\2\u0ef2\u0ef3\b\u00e0\1\2\u0ef3\u0f03\3\2\2\2\u0ef4\u0ef5\7;\2\2\u0ef5"+
		"\u0efb\5\16\b\2\u0ef6\u0ef7\5\"\22\2\u0ef7\u0ef8\b\u00e0\1\2\u0ef8\u0efa"+
		"\3\2\2\2\u0ef9\u0ef6\3\2\2\2\u0efa\u0efd\3\2\2\2\u0efb\u0ef9\3\2\2\2\u0efb"+
		"\u0efc\3\2\2\2\u0efc\u0efe\3\2\2\2\u0efd\u0efb\3\2\2\2\u0efe\u0eff\7<"+
		"\2\2\u0eff\u0f00\5\u018a\u00c6\2\u0f00\u0f01\b\u00e0\1\2\u0f01\u0f03\3"+
		"\2\2\2\u0f02\u0ee0\3\2\2\2\u0f02\u0ee6\3\2\2\2\u0f02\u0ef4\3\2\2\2\u0f03"+
		"\u01bf\3\2\2\2\u0149\u01cc\u01d4\u01db\u01e6\u01eb\u01f3\u01ff\u0205\u0210"+
		"\u021a\u0222\u022a\u0233\u023b\u023d\u0244\u024c\u0253\u0265\u026c\u0278"+
		"\u0280\u028a\u0291\u02a4\u02a9\u02bc\u02c7\u02ce\u02d4\u02de\u02e7\u02f3"+
		"\u02fd\u0309\u030f\u0316\u031e\u0329\u0335\u034a\u036f\u0377\u037f\u0381"+
		"\u038a\u038f\u0394\u03a7\u03b7\u03cd\u03d6\u03e6\u03f3\u03fb\u03fd\u0413"+
		"\u041e\u0429\u0432\u0440\u0448\u044f\u045a\u0465\u0470\u0477\u0488\u0490"+
		"\u0492\u04ad\u04b5\u04be\u04c8\u04ca\u04d1\u04d9\u04df\u04ef\u04fa\u0508"+
		"\u050d\u0515\u0517\u0527\u0529\u0532\u053c\u0543\u0559\u0564\u056b\u057a"+
		"\u057c\u0585\u0590\u0595\u059d\u05a6\u05ab\u05b3\u05ba\u05c2\u05c9\u05d3"+
		"\u05da\u05e5\u05ec\u05f2\u05fa\u05fc\u0604\u060b\u060e\u0611\u061b\u0623"+
		"\u062b\u062e\u0632\u0638\u0641\u0649\u064b\u0654\u0659\u066a\u0674\u0685"+
		"\u068d\u068f\u069d\u06a5\u06a7\u06ba\u06c2\u06c4\u06d1\u06e2\u06ea\u06ec"+
		"\u06f7\u06fc\u0705\u0714\u071b\u0725\u0736\u073c\u073f\u074d\u0761\u0764"+
		"\u0772\u077c\u0789\u0797\u07a3\u07a5\u07be\u07cf\u07f5\u081d\u0844\u0853"+
		"\u085b\u086e\u087f\u089e\u08a6\u08ad\u08b3\u08b9\u08c4\u08ca\u08d0\u08dc"+
		"\u08ea\u08f7\u08f9\u090b\u090d\u091a\u0922\u092f\u0947\u094f\u0958\u096b"+
		"\u096d\u097d\u098a\u098f\u0997\u099b\u09a7\u09b2\u09b4\u09c2\u09c9\u09e8"+
		"\u09f0\u09fe\u0a0e\u0a2b\u0a3c\u0a4a\u0a58\u0a75\u0a85\u0a9f\u0aa5\u0aac"+
		"\u0ab7\u0abe\u0ac4\u0aca\u0acf\u0ad7\u0ade\u0ae6\u0aec\u0af1\u0af9\u0b00"+
		"\u0b08\u0b0e\u0b13\u0b15\u0b1c\u0b23\u0b2b\u0b31\u0b36\u0b3c\u0b43\u0b4e"+
		"\u0b55\u0b5b\u0b61\u0b66\u0b6e\u0b75\u0b7d\u0b83\u0b88\u0b8a\u0b92\u0ba4"+
		"\u0bb5\u0bc3\u0bcd\u0bdd\u0bec\u0bf6\u0bfe\u0c07\u0c0e\u0c18\u0c1f\u0c29"+
		"\u0c30\u0c3b\u0c42\u0c47\u0c4d\u0c54\u0c5e\u0c67\u0c6e\u0c78\u0c7f\u0c8a"+
		"\u0c91\u0c96\u0ca1\u0cab\u0cb5\u0cbf\u0cc9\u0cd4\u0cde\u0ce8\u0cee\u0cf8"+
		"\u0d02\u0d0c\u0d17\u0d21\u0d2b\u0d33\u0d3d\u0d4d\u0d56\u0d5e\u0d6f\u0d7c"+
		"\u0d85\u0d8f\u0d9a\u0da2\u0db2\u0dcc\u0dd8\u0de5\u0df3\u0e01\u0e0f\u0e1d"+
		"\u0e2e\u0e30\u0e50\u0e52\u0e6c\u0e6e\u0e7f\u0e81\u0e97\u0e99\u0ead\u0ec5"+
		"\u0ecd\u0ed3\u0ed5\u0eed\u0efb\u0f02";
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