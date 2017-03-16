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
public class Balance extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CharacterLiteral=1, StringLiteral=2, LPAREN=3, RPAREN=4, LBRACE=5, RBRACE=6, 
		LBRACK=7, RBRACK=8, WS=9, COMMENT=10, LINE_COMMENT=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"HexDigit", "OctalDigit", "CharacterLiteral", "SingleCharacter", "StringLiteral", 
		"StringCharacters", "StringCharacter", "EscapeSequence", "OctalEscape", 
		"ZeroToThree", "UnicodeEscape", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"LBRACK", "RBRACK", "WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'('", "')'", "'{'", "'}'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CharacterLiteral", "StringLiteral", "LPAREN", "RPAREN", "LBRACE", 
		"RBRACE", "LBRACK", "RBRACK", "WS", "COMMENT", "LINE_COMMENT"
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


	public Balance(CharStream input) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\r\u0096\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\48\n\4\3\4\3\4\3\5\3\5\3\6\3\6\5\6@\n\6\3\6\3\6\3\6\3\6\3\7"+
		"\6\7G\n\7\r\7\16\7H\3\b\3\b\5\bM\n\b\3\t\3\t\3\t\3\t\5\tS\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n`\n\n\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\6\23x\n\23\r\23\16\23y\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u0082"+
		"\n\24\f\24\16\24\u0085\13\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\7\25\u0090\n\25\f\25\16\25\u0093\13\25\3\25\3\25\3\u0083\2\26\3\2"+
		"\5\2\7\3\t\2\13\4\r\2\17\2\21\2\23\2\25\2\27\2\31\5\33\6\35\7\37\b!\t"+
		"#\n%\13\'\f)\r\3\2\n\5\2\62;CHch\3\2\629\4\2))^^\4\2$$^^\n\2$$))^^ddh"+
		"hppttvv\3\2\62\65\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u0097\2\7\3\2\2\2\2"+
		"\13\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2"+
		"\2\7\67\3\2\2\2\t;\3\2\2\2\13=\3\2\2\2\rF\3\2\2\2\17L\3\2\2\2\21R\3\2"+
		"\2\2\23_\3\2\2\2\25a\3\2\2\2\27c\3\2\2\2\31j\3\2\2\2\33l\3\2\2\2\35n\3"+
		"\2\2\2\37p\3\2\2\2!r\3\2\2\2#t\3\2\2\2%w\3\2\2\2\'}\3\2\2\2)\u008b\3\2"+
		"\2\2+,\t\2\2\2,\4\3\2\2\2-.\t\3\2\2.\6\3\2\2\2/\60\7)\2\2\60\61\5\t\5"+
		"\2\61\62\7)\2\2\628\3\2\2\2\63\64\7)\2\2\64\65\5\21\t\2\65\66\7)\2\2\66"+
		"8\3\2\2\2\67/\3\2\2\2\67\63\3\2\2\289\3\2\2\29:\b\4\2\2:\b\3\2\2\2;<\n"+
		"\4\2\2<\n\3\2\2\2=?\7$\2\2>@\5\r\7\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7"+
		"$\2\2BC\3\2\2\2CD\b\6\2\2D\f\3\2\2\2EG\5\17\b\2FE\3\2\2\2GH\3\2\2\2HF"+
		"\3\2\2\2HI\3\2\2\2I\16\3\2\2\2JM\n\5\2\2KM\5\21\t\2LJ\3\2\2\2LK\3\2\2"+
		"\2M\20\3\2\2\2NO\7^\2\2OS\t\6\2\2PS\5\23\n\2QS\5\27\f\2RN\3\2\2\2RP\3"+
		"\2\2\2RQ\3\2\2\2S\22\3\2\2\2TU\7^\2\2U`\5\5\3\2VW\7^\2\2WX\5\5\3\2XY\5"+
		"\5\3\2Y`\3\2\2\2Z[\7^\2\2[\\\5\25\13\2\\]\5\5\3\2]^\5\5\3\2^`\3\2\2\2"+
		"_T\3\2\2\2_V\3\2\2\2_Z\3\2\2\2`\24\3\2\2\2ab\t\7\2\2b\26\3\2\2\2cd\7^"+
		"\2\2de\7w\2\2ef\5\3\2\2fg\5\3\2\2gh\5\3\2\2hi\5\3\2\2i\30\3\2\2\2jk\7"+
		"*\2\2k\32\3\2\2\2lm\7+\2\2m\34\3\2\2\2no\7}\2\2o\36\3\2\2\2pq\7\177\2"+
		"\2q \3\2\2\2rs\7]\2\2s\"\3\2\2\2tu\7_\2\2u$\3\2\2\2vx\t\b\2\2wv\3\2\2"+
		"\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\b\23\2\2|&\3\2\2\2}~\7\61"+
		"\2\2~\177\7,\2\2\177\u0083\3\2\2\2\u0080\u0082\13\2\2\2\u0081\u0080\3"+
		"\2\2\2\u0082\u0085\3\2\2\2\u0083\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7,\2\2\u0087\u0088\7\61"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\24\2\2\u008a(\3\2\2\2\u008b\u008c"+
		"\7\61\2\2\u008c\u008d\7\61\2\2\u008d\u0091\3\2\2\2\u008e\u0090\n\t\2\2"+
		"\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\b\25\2\2"+
		"\u0095*\3\2\2\2\f\2\67?HLR_y\u0083\u0091\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}