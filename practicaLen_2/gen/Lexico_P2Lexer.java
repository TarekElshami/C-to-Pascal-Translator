// Generated from C:/Users/aserr/OneDrive/Documentos/UNI/year_3/Procesaror de lenguajes/practicaLen_2/src/Lexico_P2.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Lexico_P2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		H1=1, H2=2, H3=3, H4=4, H5=5, H6=6, HR=7, BOLD=8, BOLD2=9, ITALIC=10, 
		ITALIC2=11, BLOCKQUOTE=12, CODEBL=13, LINKS=14, LINKS2=15, LIST=16, NORMALTEXT=17, 
		IGNORE=18, WORD=19, SPACIO=20, JUMP=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"H1", "H2", "H3", "H4", "H5", "H6", "HR", "BOLD", "BOLD2", "ITALIC", 
			"ITALIC2", "BLOCKQUOTE", "CODEBL", "LINKS", "LINKS2", "LIST", "NORMALTEXT", 
			"IGNORE", "WORD", "SPACIO", "JUMP"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "H1", "H2", "H3", "H4", "H5", "H6", "HR", "BOLD", "BOLD2", "ITALIC", 
			"ITALIC2", "BLOCKQUOTE", "CODEBL", "LINKS", "LINKS2", "LIST", "NORMALTEXT", 
			"IGNORE", "WORD", "SPACIO", "JUMP"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public Lexico_P2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lexico_P2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			H1_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			H2_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			H3_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			H4_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			H5_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			H6_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			HR_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			BOLD_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			BOLD2_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			ITALIC_action((RuleContext)_localctx, actionIndex);
			break;
		case 10:
			ITALIC2_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			BLOCKQUOTE_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			CODEBL_action((RuleContext)_localctx, actionIndex);
			break;
		case 13:
			LINKS_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			LINKS2_action((RuleContext)_localctx, actionIndex);
			break;
		case 15:
			LIST_action((RuleContext)_localctx, actionIndex);
			break;
		case 16:
			NORMALTEXT_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			IGNORE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void H1_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("<H1>"+getText().replace("# ","")+"</H1>");
			break;
		}
	}
	private void H2_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println("<H2>"+getText().replace("## ","")+"</H2>");
			break;
		}
	}
	private void H3_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.println("<H3>"+getText().replace("### ","")+"</H3>");
			break;
		}
	}
	private void H4_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			System.out.println("<H4>"+getText().replace("#### ","")+"</H4>");
			break;
		}
	}
	private void H5_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			System.out.println("<H5>"+getText().replace("##### ","")+"</H5>");
			break;
		}
	}
	private void H6_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			System.out.println("<H6>"+getText().replace("###### ","")+"</H6>");
			break;
		}
	}
	private void HR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			System.out.println("<HR/>");
			break;
		}
	}
	private void BOLD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			System.out.println("<SPAN class=\"bold\">"+getText().replace("_","")+"</SPAN>");
			break;
		}
	}
	private void BOLD2_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			System.out.println("<SPAN class=\"bold\">"+getText().replace("*","")+"</SPAN>");
			break;
		}
	}
	private void ITALIC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			System.out.println("<SPAN class=\"ital\">"+getText().replace("_","")+"</SPAN>");
			break;
		}
	}
	private void ITALIC2_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			System.out.println("<SPAN class=\"ital\">"+getText().replace("*","")+"</SPAN>");
			break;
		}
	}
	private void BLOCKQUOTE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			System.out.println("<blockquote>");System.out.println(getText().replace("> ",""));System.out.println("</blockquote>");
			break;
		}
	}
	private void CODEBL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:

			        System.out.print("<code><pre>");
			        System.out.print(getText().replace("~",""));
			        System.out.println("</pre></code>");
			    
			break;
		}
	}
	private void LINKS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:

			        String[] words = getText().split("]");
			        System.out.println("<A HREF=\""+words[1].replaceAll("[(\\)]","")+"\">");
			        System.out.println(words[0].replace("[", ""));
			        System.out.println("</A>");
			    
			break;
		}
	}
	private void LINKS2_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:

			        String[] words = getText().split("]");
			        System.out.println("<A HREF=\""+words[1].replaceAll("[(\\)]","")+"\">");
			        System.out.println(words[0].replace("[", "")+" (URL aparentemente incorrecta)");
			        System.out.println("</A>");
			    
			break;
		}
	}
	private void LIST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:

			        System.out.println("<UL>");
			        String[] words = getText().split("- ");
			        for (int i = 1; i< words.length;i++){
			            System.out.println("<LI>"+words[i].replace("\r\n", "")+"</LI>");
			        }
			        System.out.println("</UL>");
			    
			break;
		}
	}
	private void NORMALTEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:
			System.out.println(getText());
			break;
		}
	}
	private void IGNORE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17:
			System.out.println();
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0015\u0159\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u00000\b\u0000"+
		"\n\u0000\f\u00003\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001<\b\u0001\n\u0001\f\u0001"+
		"?\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002I\b\u0002\n\u0002\f\u0002"+
		"L\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003W\b\u0003"+
		"\n\u0003\f\u0003Z\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004f\b\u0004\n\u0004\f\u0004i\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005v\b\u0005\n\u0005\f\u0005"+
		"y\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u0086\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u008e\b\u0007\n\u0007\f\u0007\u0091"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u009c\b\b\n\b\f\b\u009f\t\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0005\t\u00a8\b\t\n\t"+
		"\f\t\u00ab\t\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u00b2\b"+
		"\n\n\n\f\n\u00b5\t\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u00be\b\u000b\n\u000b\f\u000b\u00c1\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00ca\b\f\u0001\f\u0004\f\u00cd\b\f\u000b\f\f\f\u00ce\u0001\f\u0004"+
		"\f\u00d2\b\f\u000b\f\f\f\u00d3\u0005\f\u00d6\b\f\n\f\f\f\u00d9\t\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005\r\u00e3"+
		"\b\r\n\r\f\r\u00e6\t\r\u0001\r\u0001\r\u0005\r\u00ea\b\r\n\r\f\r\u00ed"+
		"\t\r\u0001\r\u0001\r\u0005\r\u00f1\b\r\n\r\f\r\u00f4\t\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0105\b\r\u0001\r\u0004\r\u0108"+
		"\b\r\u000b\r\f\r\u0109\u0001\r\u0001\r\u0004\r\u010e\b\r\u000b\r\f\r\u010f"+
		"\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0005\u000e\u0117\b\u000e"+
		"\n\u000e\f\u000e\u011a\t\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u011e"+
		"\b\u000e\n\u000e\f\u000e\u0121\t\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u0125\b\u000e\n\u000e\f\u000e\u0128\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u0130\b\u000f\u000b"+
		"\u000f\f\u000f\u0131\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004"+
		"\u000f\u0138\b\u000f\u000b\u000f\f\u000f\u0139\u0005\u000f\u013c\b\u000f"+
		"\n\u000f\f\u000f\u013f\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0004"+
		"\u0010\u0144\b\u0010\u000b\u0010\f\u0010\u0145\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0004\u0011\u014b\b\u0011\u000b\u0011\f\u0011\u014c\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0003\u0014\u0156\b\u0014\u0001\u0014\u0001\u0014\u0000\u0000\u0015"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015\u0001\u0000"+
		"\u0003\u0002\u0000\t\n\r\r\u0004\u0000\n\n\r\r##~~\u0001\u0000  \u0179"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0001+\u0001\u0000\u0000\u0000\u00036\u0001\u0000\u0000\u0000\u0005B"+
		"\u0001\u0000\u0000\u0000\u0007O\u0001\u0000\u0000\u0000\t]\u0001\u0000"+
		"\u0000\u0000\u000bl\u0001\u0000\u0000\u0000\r\u0085\u0001\u0000\u0000"+
		"\u0000\u000f\u0089\u0001\u0000\u0000\u0000\u0011\u0097\u0001\u0000\u0000"+
		"\u0000\u0013\u00a5\u0001\u0000\u0000\u0000\u0015\u00af\u0001\u0000\u0000"+
		"\u0000\u0017\u00b9\u0001\u0000\u0000\u0000\u0019\u00c4\u0001\u0000\u0000"+
		"\u0000\u001b\u00e0\u0001\u0000\u0000\u0000\u001d\u0114\u0001\u0000\u0000"+
		"\u0000\u001f\u012c\u0001\u0000\u0000\u0000!\u0143\u0001\u0000\u0000\u0000"+
		"#\u014a\u0001\u0000\u0000\u0000%\u0150\u0001\u0000\u0000\u0000\'\u0152"+
		"\u0001\u0000\u0000\u0000)\u0155\u0001\u0000\u0000\u0000+,\u0005#\u0000"+
		"\u0000,-\u0005 \u0000\u0000-1\u0001\u0000\u0000\u0000.0\u0003%\u0012\u0000"+
		"/.\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000"+
		"\u000012\u0001\u0000\u0000\u000024\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u000045\u0006\u0000\u0000\u00005\u0002\u0001\u0000\u0000\u0000"+
		"67\u0005#\u0000\u000078\u0005#\u0000\u000089\u0005 \u0000\u00009=\u0001"+
		"\u0000\u0000\u0000:<\u0003%\u0012\u0000;:\u0001\u0000\u0000\u0000<?\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		">@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0006\u0001\u0001"+
		"\u0000A\u0004\u0001\u0000\u0000\u0000BC\u0005#\u0000\u0000CD\u0005#\u0000"+
		"\u0000DE\u0005#\u0000\u0000EF\u0005 \u0000\u0000FJ\u0001\u0000\u0000\u0000"+
		"GI\u0003%\u0012\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KM\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000MN\u0006\u0002\u0002\u0000N\u0006\u0001"+
		"\u0000\u0000\u0000OP\u0005#\u0000\u0000PQ\u0005#\u0000\u0000QR\u0005#"+
		"\u0000\u0000RS\u0005#\u0000\u0000ST\u0005 \u0000\u0000TX\u0001\u0000\u0000"+
		"\u0000UW\u0003%\u0012\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000"+
		"\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000[\\\u0006\u0003\u0003\u0000\\\b"+
		"\u0001\u0000\u0000\u0000]^\u0005#\u0000\u0000^_\u0005#\u0000\u0000_`\u0005"+
		"#\u0000\u0000`a\u0005#\u0000\u0000ab\u0005#\u0000\u0000bc\u0005 \u0000"+
		"\u0000cg\u0001\u0000\u0000\u0000df\u0003%\u0012\u0000ed\u0001\u0000\u0000"+
		"\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000"+
		"\u0000\u0000hj\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u0006"+
		"\u0004\u0004\u0000k\n\u0001\u0000\u0000\u0000lm\u0005#\u0000\u0000mn\u0005"+
		"#\u0000\u0000no\u0005#\u0000\u0000op\u0005#\u0000\u0000pq\u0005#\u0000"+
		"\u0000qr\u0005#\u0000\u0000rs\u0005 \u0000\u0000sw\u0001\u0000\u0000\u0000"+
		"tv\u0003%\u0012\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000z{\u0006\u0005\u0005\u0000{\f\u0001\u0000"+
		"\u0000\u0000|}\u0005-\u0000\u0000}~\u0005-\u0000\u0000~\u0086\u0005-\u0000"+
		"\u0000\u007f\u0080\u0005_\u0000\u0000\u0080\u0081\u0005_\u0000\u0000\u0081"+
		"\u0086\u0005_\u0000\u0000\u0082\u0083\u0005*\u0000\u0000\u0083\u0084\u0005"+
		"*\u0000\u0000\u0084\u0086\u0005*\u0000\u0000\u0085|\u0001\u0000\u0000"+
		"\u0000\u0085\u007f\u0001\u0000\u0000\u0000\u0085\u0082\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0006\u0006\u0006"+
		"\u0000\u0088\u000e\u0001\u0000\u0000\u0000\u0089\u008a\u0005_\u0000\u0000"+
		"\u008a\u008b\u0005_\u0000\u0000\u008b\u008f\u0001\u0000\u0000\u0000\u008c"+
		"\u008e\u0003%\u0012\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0091"+
		"\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008f"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0005_\u0000\u0000\u0093\u0094\u0005"+
		"_\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0006\u0007"+
		"\u0007\u0000\u0096\u0010\u0001\u0000\u0000\u0000\u0097\u0098\u0005*\u0000"+
		"\u0000\u0098\u0099\u0005*\u0000\u0000\u0099\u009d\u0001\u0000\u0000\u0000"+
		"\u009a\u009c\u0003%\u0012\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c"+
		"\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f"+
		"\u009d\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005*\u0000\u0000\u00a1\u00a2"+
		"\u0005*\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0006"+
		"\b\b\u0000\u00a4\u0012\u0001\u0000\u0000\u0000\u00a5\u00a9\u0005_\u0000"+
		"\u0000\u00a6\u00a8\u0003%\u0012\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005_\u0000\u0000\u00ad"+
		"\u00ae\u0006\t\t\u0000\u00ae\u0014\u0001\u0000\u0000\u0000\u00af\u00b3"+
		"\u0005*\u0000\u0000\u00b0\u00b2\u0003%\u0012\u0000\u00b1\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005*\u0000"+
		"\u0000\u00b7\u00b8\u0006\n\n\u0000\u00b8\u0016\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0005>\u0000\u0000\u00ba\u00bb\u0005 \u0000\u0000\u00bb\u00bf"+
		"\u0001\u0000\u0000\u0000\u00bc\u00be\u0003%\u0012\u0000\u00bd\u00bc\u0001"+
		"\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c3\u0006"+
		"\u000b\u000b\u0000\u00c3\u0018\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005"+
		"~\u0000\u0000\u00c5\u00c6\u0005~\u0000\u0000\u00c6\u00c7\u0005~\u0000"+
		"\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00ca\u0003)\u0014\u0000"+
		"\u00c9\u00c8\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000"+
		"\u00ca\u00d7\u0001\u0000\u0000\u0000\u00cb\u00cd\u0003%\u0012\u0000\u00cc"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d0\u00d2\u0003)\u0014\u0000\u00d1\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d5\u00cc\u0001\u0000\u0000\u0000\u00d5\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00da"+
		"\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u0005~\u0000\u0000\u00db\u00dc\u0005~\u0000\u0000\u00dc\u00dd\u0005~"+
		"\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00df\u0006\f\f"+
		"\u0000\u00df\u001a\u0001\u0000\u0000\u0000\u00e0\u00e4\u0005[\u0000\u0000"+
		"\u00e1\u00e3\u0003%\u0012\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e7\u00eb\u0005]\u0000\u0000\u00e8\u00ea"+
		"\u0003\'\u0013\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001"+
		"\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ee\u00f2\u0005(\u0000\u0000\u00ef\u00f1\u0003\'"+
		"\u0013\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f3\u0104\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0005h\u0000\u0000\u00f6\u00f7\u0005t\u0000\u0000"+
		"\u00f7\u00f8\u0005t\u0000\u0000\u00f8\u00f9\u0005p\u0000\u0000\u00f9\u00fa"+
		"\u0005:\u0000\u0000\u00fa\u00fb\u0005/\u0000\u0000\u00fb\u0105\u0005/"+
		"\u0000\u0000\u00fc\u00fd\u0005h\u0000\u0000\u00fd\u00fe\u0005t\u0000\u0000"+
		"\u00fe\u00ff\u0005t\u0000\u0000\u00ff\u0100\u0005p\u0000\u0000\u0100\u0101"+
		"\u0005s\u0000\u0000\u0101\u0102\u0005:\u0000\u0000\u0102\u0103\u0005/"+
		"\u0000\u0000\u0103\u0105\u0005/\u0000\u0000\u0104\u00f5\u0001\u0000\u0000"+
		"\u0000\u0104\u00fc\u0001\u0000\u0000\u0000\u0105\u0107\u0001\u0000\u0000"+
		"\u0000\u0106\u0108\u0003%\u0012\u0000\u0107\u0106\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000"+
		"\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000"+
		"\u010b\u010d\u0005.\u0000\u0000\u010c\u010e\u0003%\u0012\u0000\u010d\u010c"+
		"\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u010d"+
		"\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111"+
		"\u0001\u0000\u0000\u0000\u0111\u0112\u0005)\u0000\u0000\u0112\u0113\u0006"+
		"\r\r\u0000\u0113\u001c\u0001\u0000\u0000\u0000\u0114\u0118\u0005[\u0000"+
		"\u0000\u0115\u0117\u0003%\u0012\u0000\u0116\u0115\u0001\u0000\u0000\u0000"+
		"\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000"+
		"\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000"+
		"\u011a\u0118\u0001\u0000\u0000\u0000\u011b\u011f\u0005]\u0000\u0000\u011c"+
		"\u011e\u0003\'\u0013\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011e\u0121"+
		"\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120"+
		"\u0001\u0000\u0000\u0000\u0120\u0122\u0001\u0000\u0000\u0000\u0121\u011f"+
		"\u0001\u0000\u0000\u0000\u0122\u0126\u0005(\u0000\u0000\u0123\u0125\u0003"+
		"%\u0012\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125\u0128\u0001\u0000"+
		"\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000"+
		"\u0000\u0000\u0127\u0129\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000"+
		"\u0000\u0000\u0129\u012a\u0005)\u0000\u0000\u012a\u012b\u0006\u000e\u000e"+
		"\u0000\u012b\u001e\u0001\u0000\u0000\u0000\u012c\u012d\u0005-\u0000\u0000"+
		"\u012d\u012f\u0003\'\u0013\u0000\u012e\u0130\u0003%\u0012\u0000\u012f"+
		"\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131"+
		"\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132"+
		"\u013d\u0001\u0000\u0000\u0000\u0133\u0134\u0003)\u0014\u0000\u0134\u0135"+
		"\u0005-\u0000\u0000\u0135\u0137\u0003\'\u0013\u0000\u0136\u0138\u0003"+
		"%\u0012\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000"+
		"\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000"+
		"\u0000\u0000\u013a\u013c\u0001\u0000\u0000\u0000\u013b\u0133\u0001\u0000"+
		"\u0000\u0000\u013c\u013f\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000"+
		"\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u0140\u0001\u0000"+
		"\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u0140\u0141\u0006\u000f"+
		"\u000f\u0000\u0141 \u0001\u0000\u0000\u0000\u0142\u0144\u0003%\u0012\u0000"+
		"\u0143\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000"+
		"\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000"+
		"\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0148\u0006\u0010\u0010\u0000"+
		"\u0148\"\u0001\u0000\u0000\u0000\u0149\u014b\u0007\u0000\u0000\u0000\u014a"+
		"\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c"+
		"\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d"+
		"\u014e\u0001\u0000\u0000\u0000\u014e\u014f\u0006\u0011\u0011\u0000\u014f"+
		"$\u0001\u0000\u0000\u0000\u0150\u0151\b\u0001\u0000\u0000\u0151&\u0001"+
		"\u0000\u0000\u0000\u0152\u0153\u0007\u0002\u0000\u0000\u0153(\u0001\u0000"+
		"\u0000\u0000\u0154\u0156\u0005\r\u0000\u0000\u0155\u0154\u0001\u0000\u0000"+
		"\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0005\n\u0000\u0000\u0158*\u0001\u0000\u0000\u0000"+
		"!\u00001=JXgw\u0085\u008f\u009d\u00a9\u00b3\u00bf\u00c9\u00ce\u00d3\u00d5"+
		"\u00d7\u00e4\u00eb\u00f2\u0104\u0109\u010f\u0118\u011f\u0126\u0131\u0139"+
		"\u013d\u0145\u014c\u0155\u0012\u0001\u0000\u0000\u0001\u0001\u0001\u0001"+
		"\u0002\u0002\u0001\u0003\u0003\u0001\u0004\u0004\u0001\u0005\u0005\u0001"+
		"\u0006\u0006\u0001\u0007\u0007\u0001\b\b\u0001\t\t\u0001\n\n\u0001\u000b"+
		"\u000b\u0001\f\f\u0001\r\r\u0001\u000e\u000e\u0001\u000f\u000f\u0001\u0010"+
		"\u0010\u0001\u0011\u0011";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}