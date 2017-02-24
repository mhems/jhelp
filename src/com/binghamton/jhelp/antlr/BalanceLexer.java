// Generated from Balance.g4 by ANTLR 4.6
package com.binghamton.jhelp.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BalanceLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN=1, CLOSE=2, LPAREN=3, RPAREN=4, LBRACE=5, RBRACE=6, LBRACK=7, RBRACK=8, 
		CharacterLiteral=9, StringLiteral=10, WS=11, COMMENT=12, LINE_COMMENT=13, 
		ELSE=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"OPEN", "CLOSE", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"HexDigit", "OctalDigit", "CharacterLiteral", "SingleCharacter", "StringLiteral", 
		"StringCharacters", "StringCharacter", "EscapeSequence", "OctalEscape", 
		"ZeroToThree", "UnicodeEscape", "WS", "COMMENT", "LINE_COMMENT", "ELSE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'('", "')'", "'{'", "'}'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPEN", "CLOSE", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", 
		"RBRACK", "CharacterLiteral", "StringLiteral", "WS", "COMMENT", "LINE_COMMENT", 
		"ELSE"
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


	public BalanceLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Balance.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20\u00ad\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\5\2\65\n\2\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\fT\n\f\3\f\3\f\3\r\3\r\3\16\3\16\5\16\\\n\16\3\16\3\16\3\16\3\16\3\17"+
		"\6\17c\n\17\r\17\16\17d\3\20\3\20\5\20i\n\20\3\21\3\21\3\21\3\21\5\21"+
		"o\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22|\n"+
		"\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\6\25\u0088\n\25"+
		"\r\25\16\25\u0089\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u0092\n\26\f\26\16"+
		"\26\u0095\13\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u00a0"+
		"\n\27\f\27\16\27\u00a3\13\27\3\27\3\27\3\30\6\30\u00a8\n\30\r\30\16\30"+
		"\u00a9\3\30\3\30\3\u0093\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\2"+
		"\25\2\27\13\31\2\33\f\35\2\37\2!\2#\2%\2\'\2)\r+\16-\17/\20\3\2\13\5\2"+
		"\62;CHch\3\2\629\4\2))^^\4\2$$^^\n\2$$))^^ddhhppttvv\3\2\62\65\5\2\13"+
		"\f\16\17\"\"\4\2\f\f\17\17\7\2*+]]__}}\177\177\u00b3\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\27\3\2\2\2\2\33\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\3\64\3\2\2\2\59\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2"+
		"\rA\3\2\2\2\17C\3\2\2\2\21E\3\2\2\2\23G\3\2\2\2\25I\3\2\2\2\27S\3\2\2"+
		"\2\31W\3\2\2\2\33Y\3\2\2\2\35b\3\2\2\2\37h\3\2\2\2!n\3\2\2\2#{\3\2\2\2"+
		"%}\3\2\2\2\'\177\3\2\2\2)\u0087\3\2\2\2+\u008d\3\2\2\2-\u009b\3\2\2\2"+
		"/\u00a7\3\2\2\2\61\65\5\7\4\2\62\65\5\13\6\2\63\65\5\17\b\2\64\61\3\2"+
		"\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\4\3\2\2\2\66:\5\t\5\2\67:\5\r\7\2"+
		"8:\5\21\t\29\66\3\2\2\29\67\3\2\2\298\3\2\2\2:\6\3\2\2\2;<\7*\2\2<\b\3"+
		"\2\2\2=>\7+\2\2>\n\3\2\2\2?@\7}\2\2@\f\3\2\2\2AB\7\177\2\2B\16\3\2\2\2"+
		"CD\7]\2\2D\20\3\2\2\2EF\7_\2\2F\22\3\2\2\2GH\t\2\2\2H\24\3\2\2\2IJ\t\3"+
		"\2\2J\26\3\2\2\2KL\7)\2\2LM\5\31\r\2MN\7)\2\2NT\3\2\2\2OP\7)\2\2PQ\5!"+
		"\21\2QR\7)\2\2RT\3\2\2\2SK\3\2\2\2SO\3\2\2\2TU\3\2\2\2UV\b\f\2\2V\30\3"+
		"\2\2\2WX\n\4\2\2X\32\3\2\2\2Y[\7$\2\2Z\\\5\35\17\2[Z\3\2\2\2[\\\3\2\2"+
		"\2\\]\3\2\2\2]^\7$\2\2^_\3\2\2\2_`\b\16\2\2`\34\3\2\2\2ac\5\37\20\2ba"+
		"\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2e\36\3\2\2\2fi\n\5\2\2gi\5!\21\2"+
		"hf\3\2\2\2hg\3\2\2\2i \3\2\2\2jk\7^\2\2ko\t\6\2\2lo\5#\22\2mo\5\'\24\2"+
		"nj\3\2\2\2nl\3\2\2\2nm\3\2\2\2o\"\3\2\2\2pq\7^\2\2q|\5\25\13\2rs\7^\2"+
		"\2st\5\25\13\2tu\5\25\13\2u|\3\2\2\2vw\7^\2\2wx\5%\23\2xy\5\25\13\2yz"+
		"\5\25\13\2z|\3\2\2\2{p\3\2\2\2{r\3\2\2\2{v\3\2\2\2|$\3\2\2\2}~\t\7\2\2"+
		"~&\3\2\2\2\177\u0080\7^\2\2\u0080\u0081\7w\2\2\u0081\u0082\5\23\n\2\u0082"+
		"\u0083\5\23\n\2\u0083\u0084\5\23\n\2\u0084\u0085\5\23\n\2\u0085(\3\2\2"+
		"\2\u0086\u0088\t\b\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\25\2\2"+
		"\u008c*\3\2\2\2\u008d\u008e\7\61\2\2\u008e\u008f\7,\2\2\u008f\u0093\3"+
		"\2\2\2\u0090\u0092\13\2\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0096\u0097\7,\2\2\u0097\u0098\7\61\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\b\26\2\2\u009a,\3\2\2\2\u009b\u009c\7\61\2\2\u009c\u009d\7\61\2"+
		"\2\u009d\u00a1\3\2\2\2\u009e\u00a0\n\t\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3"+
		"\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a5\b\27\2\2\u00a5.\3\2\2\2\u00a6\u00a8\n\n\2\2"+
		"\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\b\30\2\2\u00ac\60\3\2\2\2\17"+
		"\2\649S[dhn{\u0089\u0093\u00a1\u00a9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}