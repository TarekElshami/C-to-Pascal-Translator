// Generated from C:/Users/burak/OneDrive - Universidad Rey Juan Carlos/Curso 3/Semestre 2/Procesadores del lenguaje/PracticaPL/src/Practica2.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Practica2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		IDENT=32, CONSTINT=33, CONSTFLOAT=34, DECIMAL_INT=35, DECIMAL_REAL=36, 
		OCTAL_INT=37, OCTAL_REAL=38, HEXA_INT=39, HEXA_REAL=40, CONSTLIT=41, GPC=42, 
		GPC2=43, JUMP=44;
	public static final int
		RULE_r = 0, RULE_defines = 1, RULE_ctes = 2, RULE_partes = 3, RULE_partes2 = 4, 
		RULE_part = 5, RULE_blq = 6, RULE_type = 7, RULE_op = 8, RULE_listparam = 9, 
		RULE_listparam2 = 10, RULE_sentlist = 11, RULE_sentlist2 = 12, RULE_lid = 13, 
		RULE_lid2 = 14, RULE_lexp = 15, RULE_lexp2 = 16, RULE_exp = 17, RULE_exp2 = 18, 
		RULE_factor = 19, RULE_factor2 = 20, RULE_factor3 = 21, RULE_restpart = 22, 
		RULE_restpart2 = 23, RULE_sent = 24, RULE_sent2 = 25, RULE_sent3 = 26, 
		RULE_lcond = 27, RULE_lcond2 = 28, RULE_opl = 29, RULE_cond = 30, RULE_opr = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "defines", "ctes", "partes", "partes2", "part", "blq", "type", "op", 
			"listparam", "listparam2", "sentlist", "sentlist2", "lid", "lid2", "lexp", 
			"lexp2", "exp", "exp2", "factor", "factor2", "factor3", "restpart", "restpart2", 
			"sent", "sent2", "sent3", "lcond", "lcond2", "opl", "cond", "opr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#define'", "'{'", "'}'", "'void'", "'int'", "'float'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "','", "'('", "')'", "';'", "'return'", "'if'", 
			"'else'", "'while'", "'do'", "'until'", "'for'", "'='", "'!'", "'||'", 
			"'&&'", "'=='", "'<'", "'>'", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "IDENT", "CONSTINT", 
			"CONSTFLOAT", "DECIMAL_INT", "DECIMAL_REAL", "OCTAL_INT", "OCTAL_REAL", 
			"HEXA_INT", "HEXA_REAL", "CONSTLIT", "GPC", "GPC2", "JUMP"
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

	@Override
	public String getGrammarFileName() { return "Practica2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Practica2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RContext extends ParserRuleContext {
		public DefinesContext defines() {
			return getRuleContext(DefinesContext.class,0);
		}
		public PartesContext partes() {
			return getRuleContext(PartesContext.class,0);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			defines();
			setState(65);
			partes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinesContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Practica2Parser.IDENT, 0); }
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public DefinesContext defines() {
			return getRuleContext(DefinesContext.class,0);
		}
		public DefinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterDefines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitDefines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitDefines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinesContext defines() throws RecognitionException {
		DefinesContext _localctx = new DefinesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_defines);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(T__0);
				setState(68);
				match(IDENT);
				setState(69);
				ctes();
				setState(70);
				defines();
				}
				break;
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class CtesContext extends ParserRuleContext {
		public TerminalNode CONSTINT() { return getToken(Practica2Parser.CONSTINT, 0); }
		public TerminalNode CONSTFLOAT() { return getToken(Practica2Parser.CONSTFLOAT, 0); }
		public TerminalNode CONSTLIT() { return getToken(Practica2Parser.CONSTLIT, 0); }
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitCtes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitCtes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2224793059328L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PartesContext extends ParserRuleContext {
		public PartContext part() {
			return getRuleContext(PartContext.class,0);
		}
		public Partes2Context partes2() {
			return getRuleContext(Partes2Context.class,0);
		}
		public PartesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterPartes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitPartes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitPartes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartesContext partes() throws RecognitionException {
		PartesContext _localctx = new PartesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_partes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			part();
			setState(78);
			partes2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Partes2Context extends ParserRuleContext {
		public PartesContext partes() {
			return getRuleContext(PartesContext.class,0);
		}
		public Partes2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partes2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterPartes2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitPartes2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitPartes2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partes2Context partes2() throws RecognitionException {
		Partes2Context _localctx = new Partes2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_partes2);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				partes();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class PartContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RestpartContext restpart() {
			return getRuleContext(RestpartContext.class,0);
		}
		public PartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartContext part() throws RecognitionException {
		PartContext _localctx = new PartContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			type();
			setState(85);
			restpart();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlqContext extends ParserRuleContext {
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public BlqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterBlq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitBlq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitBlq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlqContext blq() throws RecognitionException {
		BlqContext _localctx = new BlqContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_blq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__1);
			setState(88);
			sentlist();
			setState(89);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpContext extends ParserRuleContext {
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3968L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListparamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(Practica2Parser.IDENT, 0); }
		public Listparam2Context listparam2() {
			return getRuleContext(Listparam2Context.class,0);
		}
		public ListparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterListparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitListparam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitListparam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListparamContext listparam() throws RecognitionException {
		ListparamContext _localctx = new ListparamContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_listparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			type();
			setState(96);
			match(IDENT);
			setState(97);
			listparam2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Listparam2Context extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(Practica2Parser.IDENT, 0); }
		public Listparam2Context listparam2() {
			return getRuleContext(Listparam2Context.class,0);
		}
		public Listparam2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listparam2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterListparam2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitListparam2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitListparam2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Listparam2Context listparam2() throws RecognitionException {
		Listparam2Context _localctx = new Listparam2Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_listparam2);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(T__11);
				setState(100);
				type();
				setState(101);
				match(IDENT);
				setState(102);
				listparam2();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentlistContext extends ParserRuleContext {
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Sentlist2Context sentlist2() {
			return getRuleContext(Sentlist2Context.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterSentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitSentlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitSentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlistContext sentlist() throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			sent();
			setState(108);
			sentlist2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sentlist2Context extends ParserRuleContext {
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Sentlist2Context sentlist2() {
			return getRuleContext(Sentlist2Context.class,0);
		}
		public Sentlist2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterSentlist2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitSentlist2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitSentlist2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentlist2Context sentlist2() throws RecognitionException {
		Sentlist2Context _localctx = new Sentlist2Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_sentlist2);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
			case T__15:
			case T__16:
			case T__18:
			case T__19:
			case T__21:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				sent();
				setState(111);
				sentlist2();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class LidContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Practica2Parser.IDENT, 0); }
		public Lid2Context lid2() {
			return getRuleContext(Lid2Context.class,0);
		}
		public LidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterLid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitLid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitLid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LidContext lid() throws RecognitionException {
		LidContext _localctx = new LidContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(IDENT);
			setState(117);
			lid2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Lid2Context extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Practica2Parser.IDENT, 0); }
		public Lid2Context lid2() {
			return getRuleContext(Lid2Context.class,0);
		}
		public Lid2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lid2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterLid2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitLid2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitLid2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lid2Context lid2() throws RecognitionException {
		Lid2Context _localctx = new Lid2Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_lid2);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(T__11);
				setState(120);
				match(IDENT);
				setState(121);
				lid2();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class LexpContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Lexp2Context lexp2() {
			return getRuleContext(Lexp2Context.class,0);
		}
		public LexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterLexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitLexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitLexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexpContext lexp() throws RecognitionException {
		LexpContext _localctx = new LexpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			exp();
			setState(126);
			lexp2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Lexp2Context extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Lexp2Context lexp2() {
			return getRuleContext(Lexp2Context.class,0);
		}
		public Lexp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexp2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterLexp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitLexp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitLexp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lexp2Context lexp2() throws RecognitionException {
		Lexp2Context _localctx = new Lexp2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_lexp2);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T__11);
				setState(129);
				exp();
				setState(130);
				lexp2();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			factor();
			setState(136);
			exp2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp2Context extends ParserRuleContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public Exp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitExp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitExp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp2Context exp2() throws RecognitionException {
		Exp2Context _localctx = new Exp2Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_exp2);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				op();
				setState(139);
				exp();
				setState(140);
				exp2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(Practica2Parser.IDENT, 0); }
		public Factor2Context factor2() {
			return getRuleContext(Factor2Context.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_factor);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(T__12);
				setState(146);
				exp();
				setState(147);
				match(T__13);
				}
				break;
			case CONSTINT:
			case CONSTFLOAT:
			case CONSTLIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				ctes();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				match(IDENT);
				setState(151);
				factor2();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Factor2Context extends ParserRuleContext {
		public Factor3Context factor3() {
			return getRuleContext(Factor3Context.class,0);
		}
		public Factor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterFactor2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitFactor2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitFactor2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor2Context factor2() throws RecognitionException {
		Factor2Context _localctx = new Factor2Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_factor2);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(T__12);
				setState(155);
				factor3();
				}
				break;
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__13:
			case T__14:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Factor3Context extends ParserRuleContext {
		public LexpContext lexp() {
			return getRuleContext(LexpContext.class,0);
		}
		public Factor3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterFactor3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitFactor3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitFactor3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor3Context factor3() throws RecognitionException {
		Factor3Context _localctx = new Factor3Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_factor3);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case IDENT:
			case CONSTINT:
			case CONSTFLOAT:
			case CONSTLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				lexp();
				setState(160);
				match(T__13);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(T__13);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RestpartContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Practica2Parser.IDENT, 0); }
		public Restpart2Context restpart2() {
			return getRuleContext(Restpart2Context.class,0);
		}
		public RestpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restpart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterRestpart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitRestpart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitRestpart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestpartContext restpart() throws RecognitionException {
		RestpartContext _localctx = new RestpartContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_restpart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(IDENT);
			setState(166);
			match(T__12);
			setState(167);
			restpart2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Restpart2Context extends ParserRuleContext {
		public ListparamContext listparam() {
			return getRuleContext(ListparamContext.class,0);
		}
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public Restpart2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restpart2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterRestpart2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitRestpart2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitRestpart2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Restpart2Context restpart2() throws RecognitionException {
		Restpart2Context _localctx = new Restpart2Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_restpart2);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				listparam();
				setState(170);
				match(T__13);
				setState(171);
				blq();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(T__3);
				setState(174);
				match(T__13);
				setState(175);
				blq();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LidContext lid() {
			return getRuleContext(LidContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> IDENT() { return getTokens(Practica2Parser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(Practica2Parser.IDENT, i);
		}
		public Sent2Context sent2() {
			return getRuleContext(Sent2Context.class,0);
		}
		public LcondContext lcond() {
			return getRuleContext(LcondContext.class,0);
		}
		public List<BlqContext> blq() {
			return getRuleContexts(BlqContext.class);
		}
		public BlqContext blq(int i) {
			return getRuleContext(BlqContext.class,i);
		}
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitSent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitSent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sent);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				type();
				setState(179);
				lid();
				setState(180);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(T__15);
				setState(183);
				exp();
				setState(184);
				match(T__14);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(IDENT);
				setState(187);
				sent2();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				match(T__16);
				setState(189);
				match(T__12);
				setState(190);
				lcond();
				setState(191);
				match(T__13);
				setState(192);
				blq();
				setState(193);
				match(T__17);
				setState(194);
				blq();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				match(T__18);
				setState(197);
				match(T__12);
				setState(198);
				lcond();
				setState(199);
				match(T__13);
				setState(200);
				blq();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 6);
				{
				setState(202);
				match(T__19);
				setState(203);
				blq();
				setState(204);
				match(T__20);
				setState(205);
				match(T__12);
				setState(206);
				lcond();
				setState(207);
				match(T__13);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 7);
				{
				setState(209);
				match(T__21);
				setState(210);
				match(T__12);
				setState(211);
				match(IDENT);
				setState(212);
				match(T__22);
				setState(213);
				exp();
				setState(214);
				match(T__14);
				setState(215);
				lcond();
				setState(216);
				match(T__14);
				setState(217);
				match(IDENT);
				setState(218);
				match(T__22);
				setState(219);
				exp();
				setState(220);
				match(T__13);
				setState(221);
				blq();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sent2Context extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Sent3Context sent3() {
			return getRuleContext(Sent3Context.class,0);
		}
		public Sent2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterSent2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitSent2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitSent2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sent2Context sent2() throws RecognitionException {
		Sent2Context _localctx = new Sent2Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_sent2);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(T__22);
				setState(226);
				exp();
				setState(227);
				match(T__14);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(T__12);
				setState(230);
				sent3();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sent3Context extends ParserRuleContext {
		public LexpContext lexp() {
			return getRuleContext(LexpContext.class,0);
		}
		public Sent3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterSent3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitSent3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitSent3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sent3Context sent3() throws RecognitionException {
		Sent3Context _localctx = new Sent3Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_sent3);
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(T__13);
				setState(234);
				match(T__14);
				}
				break;
			case T__12:
			case IDENT:
			case CONSTINT:
			case CONSTFLOAT:
			case CONSTLIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				lexp();
				setState(236);
				match(T__13);
				setState(237);
				match(T__14);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LcondContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Lcond2Context lcond2() {
			return getRuleContext(Lcond2Context.class,0);
		}
		public LcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterLcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitLcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitLcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LcondContext lcond() throws RecognitionException {
		LcondContext _localctx = new LcondContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_lcond);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case IDENT:
			case CONSTINT:
			case CONSTFLOAT:
			case CONSTLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				cond();
				setState(242);
				lcond2();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(T__23);
				setState(245);
				cond();
				setState(246);
				lcond2();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lcond2Context extends ParserRuleContext {
		public OplContext opl() {
			return getRuleContext(OplContext.class,0);
		}
		public LcondContext lcond() {
			return getRuleContext(LcondContext.class,0);
		}
		public Lcond2Context lcond2() {
			return getRuleContext(Lcond2Context.class,0);
		}
		public Lcond2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lcond2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterLcond2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitLcond2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitLcond2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lcond2Context lcond2() throws RecognitionException {
		Lcond2Context _localctx = new Lcond2Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_lcond2);
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				opl();
				setState(251);
				lcond();
				setState(252);
				lcond2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OplContext extends ParserRuleContext {
		public OplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterOpl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitOpl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitOpl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OplContext opl() throws RecognitionException {
		OplContext _localctx = new OplContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_opl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__25) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			exp();
			setState(260);
			opr();
			setState(261);
			exp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OprContext extends ParserRuleContext {
		public OprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterOpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitOpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitOpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OprContext opr() throws RecognitionException {
		OprContext _localctx = new OprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_opr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4160749568L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\u0004\u0001,\u010a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"J\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0003\u0004S\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nj\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\fs\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"|\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0086\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u0090\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0099\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u009e\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00a4\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00b1\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00e0\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u00e8\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u00f0\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u00f9\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u0100\b\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0000\u0000 \u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>\u0000\u0005\u0002\u0000!\"))\u0001\u0000\u0004\u0006"+
		"\u0001\u0000\u0007\u000b\u0001\u0000\u0019\u001a\u0001\u0000\u001b\u001f"+
		"\u00ff\u0000@\u0001\u0000\u0000\u0000\u0002I\u0001\u0000\u0000\u0000\u0004"+
		"K\u0001\u0000\u0000\u0000\u0006M\u0001\u0000\u0000\u0000\bR\u0001\u0000"+
		"\u0000\u0000\nT\u0001\u0000\u0000\u0000\fW\u0001\u0000\u0000\u0000\u000e"+
		"[\u0001\u0000\u0000\u0000\u0010]\u0001\u0000\u0000\u0000\u0012_\u0001"+
		"\u0000\u0000\u0000\u0014i\u0001\u0000\u0000\u0000\u0016k\u0001\u0000\u0000"+
		"\u0000\u0018r\u0001\u0000\u0000\u0000\u001at\u0001\u0000\u0000\u0000\u001c"+
		"{\u0001\u0000\u0000\u0000\u001e}\u0001\u0000\u0000\u0000 \u0085\u0001"+
		"\u0000\u0000\u0000\"\u0087\u0001\u0000\u0000\u0000$\u008f\u0001\u0000"+
		"\u0000\u0000&\u0098\u0001\u0000\u0000\u0000(\u009d\u0001\u0000\u0000\u0000"+
		"*\u00a3\u0001\u0000\u0000\u0000,\u00a5\u0001\u0000\u0000\u0000.\u00b0"+
		"\u0001\u0000\u0000\u00000\u00df\u0001\u0000\u0000\u00002\u00e7\u0001\u0000"+
		"\u0000\u00004\u00ef\u0001\u0000\u0000\u00006\u00f8\u0001\u0000\u0000\u0000"+
		"8\u00ff\u0001\u0000\u0000\u0000:\u0101\u0001\u0000\u0000\u0000<\u0103"+
		"\u0001\u0000\u0000\u0000>\u0107\u0001\u0000\u0000\u0000@A\u0003\u0002"+
		"\u0001\u0000AB\u0003\u0006\u0003\u0000B\u0001\u0001\u0000\u0000\u0000"+
		"CD\u0005\u0001\u0000\u0000DE\u0005 \u0000\u0000EF\u0003\u0004\u0002\u0000"+
		"FG\u0003\u0002\u0001\u0000GJ\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000"+
		"\u0000IC\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000J\u0003\u0001"+
		"\u0000\u0000\u0000KL\u0007\u0000\u0000\u0000L\u0005\u0001\u0000\u0000"+
		"\u0000MN\u0003\n\u0005\u0000NO\u0003\b\u0004\u0000O\u0007\u0001\u0000"+
		"\u0000\u0000PS\u0003\u0006\u0003\u0000QS\u0001\u0000\u0000\u0000RP\u0001"+
		"\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000S\t\u0001\u0000\u0000\u0000"+
		"TU\u0003\u000e\u0007\u0000UV\u0003,\u0016\u0000V\u000b\u0001\u0000\u0000"+
		"\u0000WX\u0005\u0002\u0000\u0000XY\u0003\u0016\u000b\u0000YZ\u0005\u0003"+
		"\u0000\u0000Z\r\u0001\u0000\u0000\u0000[\\\u0007\u0001\u0000\u0000\\\u000f"+
		"\u0001\u0000\u0000\u0000]^\u0007\u0002\u0000\u0000^\u0011\u0001\u0000"+
		"\u0000\u0000_`\u0003\u000e\u0007\u0000`a\u0005 \u0000\u0000ab\u0003\u0014"+
		"\n\u0000b\u0013\u0001\u0000\u0000\u0000cd\u0005\f\u0000\u0000de\u0003"+
		"\u000e\u0007\u0000ef\u0005 \u0000\u0000fg\u0003\u0014\n\u0000gj\u0001"+
		"\u0000\u0000\u0000hj\u0001\u0000\u0000\u0000ic\u0001\u0000\u0000\u0000"+
		"ih\u0001\u0000\u0000\u0000j\u0015\u0001\u0000\u0000\u0000kl\u00030\u0018"+
		"\u0000lm\u0003\u0018\f\u0000m\u0017\u0001\u0000\u0000\u0000no\u00030\u0018"+
		"\u0000op\u0003\u0018\f\u0000ps\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000"+
		"\u0000rn\u0001\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000s\u0019\u0001"+
		"\u0000\u0000\u0000tu\u0005 \u0000\u0000uv\u0003\u001c\u000e\u0000v\u001b"+
		"\u0001\u0000\u0000\u0000wx\u0005\f\u0000\u0000xy\u0005 \u0000\u0000y|"+
		"\u0003\u001c\u000e\u0000z|\u0001\u0000\u0000\u0000{w\u0001\u0000\u0000"+
		"\u0000{z\u0001\u0000\u0000\u0000|\u001d\u0001\u0000\u0000\u0000}~\u0003"+
		"\"\u0011\u0000~\u007f\u0003 \u0010\u0000\u007f\u001f\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005\f\u0000\u0000\u0081\u0082\u0003\"\u0011\u0000"+
		"\u0082\u0083\u0003 \u0010\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084"+
		"\u0086\u0001\u0000\u0000\u0000\u0085\u0080\u0001\u0000\u0000\u0000\u0085"+
		"\u0084\u0001\u0000\u0000\u0000\u0086!\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0003&\u0013\u0000\u0088\u0089\u0003$\u0012\u0000\u0089#\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0003\u0010\b\u0000\u008b\u008c\u0003\"\u0011"+
		"\u0000\u008c\u008d\u0003$\u0012\u0000\u008d\u0090\u0001\u0000\u0000\u0000"+
		"\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u008a\u0001\u0000\u0000\u0000"+
		"\u008f\u008e\u0001\u0000\u0000\u0000\u0090%\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0005\r\u0000\u0000\u0092\u0093\u0003\"\u0011\u0000\u0093\u0094"+
		"\u0005\u000e\u0000\u0000\u0094\u0099\u0001\u0000\u0000\u0000\u0095\u0099"+
		"\u0003\u0004\u0002\u0000\u0096\u0097\u0005 \u0000\u0000\u0097\u0099\u0003"+
		"(\u0014\u0000\u0098\u0091\u0001\u0000\u0000\u0000\u0098\u0095\u0001\u0000"+
		"\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\'\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0005\r\u0000\u0000\u009b\u009e\u0003*\u0015\u0000"+
		"\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009a\u0001\u0000\u0000\u0000"+
		"\u009d\u009c\u0001\u0000\u0000\u0000\u009e)\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0003\u001e\u000f\u0000\u00a0\u00a1\u0005\u000e\u0000\u0000\u00a1"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a4\u0005\u000e\u0000\u0000\u00a3"+
		"\u009f\u0001\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4"+
		"+\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005 \u0000\u0000\u00a6\u00a7\u0005"+
		"\r\u0000\u0000\u00a7\u00a8\u0003.\u0017\u0000\u00a8-\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0003\u0012\t\u0000\u00aa\u00ab\u0005\u000e\u0000\u0000"+
		"\u00ab\u00ac\u0003\f\u0006\u0000\u00ac\u00b1\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0005\u0004\u0000\u0000\u00ae\u00af\u0005\u000e\u0000\u0000\u00af"+
		"\u00b1\u0003\f\u0006\u0000\u00b0\u00a9\u0001\u0000\u0000\u0000\u00b0\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b1/\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003"+
		"\u000e\u0007\u0000\u00b3\u00b4\u0003\u001a\r\u0000\u00b4\u00b5\u0005\u000f"+
		"\u0000\u0000\u00b5\u00e0\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u0010"+
		"\u0000\u0000\u00b7\u00b8\u0003\"\u0011\u0000\u00b8\u00b9\u0005\u000f\u0000"+
		"\u0000\u00b9\u00e0\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005 \u0000\u0000"+
		"\u00bb\u00e0\u00032\u0019\u0000\u00bc\u00bd\u0005\u0011\u0000\u0000\u00bd"+
		"\u00be\u0005\r\u0000\u0000\u00be\u00bf\u00036\u001b\u0000\u00bf\u00c0"+
		"\u0005\u000e\u0000\u0000\u00c0\u00c1\u0003\f\u0006\u0000\u00c1\u00c2\u0005"+
		"\u0012\u0000\u0000\u00c2\u00c3\u0003\f\u0006\u0000\u00c3\u00e0\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0005\u0013\u0000\u0000\u00c5\u00c6\u0005\r\u0000"+
		"\u0000\u00c6\u00c7\u00036\u001b\u0000\u00c7\u00c8\u0005\u000e\u0000\u0000"+
		"\u00c8\u00c9\u0003\f\u0006\u0000\u00c9\u00e0\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0005\u0014\u0000\u0000\u00cb\u00cc\u0003\f\u0006\u0000\u00cc\u00cd"+
		"\u0005\u0015\u0000\u0000\u00cd\u00ce\u0005\r\u0000\u0000\u00ce\u00cf\u0003"+
		"6\u001b\u0000\u00cf\u00d0\u0005\u000e\u0000\u0000\u00d0\u00e0\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0005\u0016\u0000\u0000\u00d2\u00d3\u0005\r\u0000"+
		"\u0000\u00d3\u00d4\u0005 \u0000\u0000\u00d4\u00d5\u0005\u0017\u0000\u0000"+
		"\u00d5\u00d6\u0003\"\u0011\u0000\u00d6\u00d7\u0005\u000f\u0000\u0000\u00d7"+
		"\u00d8\u00036\u001b\u0000\u00d8\u00d9\u0005\u000f\u0000\u0000\u00d9\u00da"+
		"\u0005 \u0000\u0000\u00da\u00db\u0005\u0017\u0000\u0000\u00db\u00dc\u0003"+
		"\"\u0011\u0000\u00dc\u00dd\u0005\u000e\u0000\u0000\u00dd\u00de\u0003\f"+
		"\u0006\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df\u00b2\u0001\u0000"+
		"\u0000\u0000\u00df\u00b6\u0001\u0000\u0000\u0000\u00df\u00ba\u0001\u0000"+
		"\u0000\u0000\u00df\u00bc\u0001\u0000\u0000\u0000\u00df\u00c4\u0001\u0000"+
		"\u0000\u0000\u00df\u00ca\u0001\u0000\u0000\u0000\u00df\u00d1\u0001\u0000"+
		"\u0000\u0000\u00e01\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u0017\u0000"+
		"\u0000\u00e2\u00e3\u0003\"\u0011\u0000\u00e3\u00e4\u0005\u000f\u0000\u0000"+
		"\u00e4\u00e8\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\r\u0000\u0000\u00e6"+
		"\u00e8\u00034\u001a\u0000\u00e7\u00e1\u0001\u0000\u0000\u0000\u00e7\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e83\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005"+
		"\u000e\u0000\u0000\u00ea\u00f0\u0005\u000f\u0000\u0000\u00eb\u00ec\u0003"+
		"\u001e\u000f\u0000\u00ec\u00ed\u0005\u000e\u0000\u0000\u00ed\u00ee\u0005"+
		"\u000f\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00e9\u0001"+
		"\u0000\u0000\u0000\u00ef\u00eb\u0001\u0000\u0000\u0000\u00f05\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f2\u0003<\u001e\u0000\u00f2\u00f3\u00038\u001c\u0000"+
		"\u00f3\u00f9\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\u0018\u0000\u0000"+
		"\u00f5\u00f6\u0003<\u001e\u0000\u00f6\u00f7\u00038\u001c\u0000\u00f7\u00f9"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f1\u0001\u0000\u0000\u0000\u00f8\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f97\u0001\u0000\u0000\u0000\u00fa\u00fb\u0003"+
		":\u001d\u0000\u00fb\u00fc\u00036\u001b\u0000\u00fc\u00fd\u00038\u001c"+
		"\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u0100\u0001\u0000\u0000"+
		"\u0000\u00ff\u00fa\u0001\u0000\u0000\u0000\u00ff\u00fe\u0001\u0000\u0000"+
		"\u0000\u01009\u0001\u0000\u0000\u0000\u0101\u0102\u0007\u0003\u0000\u0000"+
		"\u0102;\u0001\u0000\u0000\u0000\u0103\u0104\u0003\"\u0011\u0000\u0104"+
		"\u0105\u0003>\u001f\u0000\u0105\u0106\u0003\"\u0011\u0000\u0106=\u0001"+
		"\u0000\u0000\u0000\u0107\u0108\u0007\u0004\u0000\u0000\u0108?\u0001\u0000"+
		"\u0000\u0000\u0010IRir{\u0085\u008f\u0098\u009d\u00a3\u00b0\u00df\u00e7"+
		"\u00ef\u00f8\u00ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}