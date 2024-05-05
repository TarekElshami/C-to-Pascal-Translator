// Generated from //10.97.0.20/Home_VDI$/t.elshami.2021/Desktop/C-to-Pascal-Translator-main/src/Practica2.g4 by ANTLR 4.13.1

import classes.Program;
import classes.Blq;
import classes.declarations.*;
import classes.expression.*;
import classes.sentences.*;
import classes.factors.*;
import classes.factors.conditionalfactors.*;
import classes.factors.normalfactors.*;

import java.util.ArrayList;
import java.util.List;

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
		RULE_program = 0, RULE_defines = 1, RULE_ctes = 2, RULE_partes = 3, RULE_partes2 = 4, 
		RULE_part = 5, RULE_blq = 6, RULE_type = 7, RULE_op = 8, RULE_listparam = 9, 
		RULE_listparam2 = 10, RULE_sentlist = 11, RULE_sentlist2 = 12, RULE_lid = 13, 
		RULE_lid2 = 14, RULE_lexp = 15, RULE_lexp2 = 16, RULE_exp = 17, RULE_exp2 = 18, 
		RULE_factor = 19, RULE_factor2 = 20, RULE_factor3 = 21, RULE_restpart = 22, 
		RULE_restpart2 = 23, RULE_sent = 24, RULE_sent2 = 25, RULE_sent3 = 26, 
		RULE_lcond = 27, RULE_lcond2 = 28, RULE_opl = 29, RULE_cond = 30, RULE_opr = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "defines", "ctes", "partes", "partes2", "part", "blq", "type", 
			"op", "listparam", "listparam2", "sentlist", "sentlist2", "lid", "lid2", 
			"lexp", "lexp2", "exp", "exp2", "factor", "factor2", "factor3", "restpart", 
			"restpart2", "sent", "sent2", "sent3", "lcond", "lcond2", "opl", "cond", 
			"opr"
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


	 private Program program = new Program();
	 private Blq currentBlq = new Blq();
	 private String methName = null;

	public Practica2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public String name;
		public DefinesContext defines() {
			return getRuleContext(DefinesContext.class,0);
		}
		public PartesContext partes() {
			return getRuleContext(PartesContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ProgramContext(ParserRuleContext parent, int invokingState, String name) {
			super(parent, invokingState);
			this.name = name;
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Practica2Listener ) ((Practica2Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Practica2Visitor ) return ((Practica2Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program(String name) throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState(), name);
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			program.setName(name);
			setState(65);
			defines();
			setState(66);
			partes();
			System.out.println(program.getTranslation());
			}
		}
		catch (RecognitionException re) {
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
		public Token IDENT;
		public CtesContext ctes;
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
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(T__0);
				setState(70);
				((DefinesContext)_localctx).IDENT = match(IDENT);
				setState(71);
				((DefinesContext)_localctx).ctes = ctes();

				    VarDcl constant = new VarDcl();
				    constant.setName((((DefinesContext)_localctx).IDENT!=null?((DefinesContext)_localctx).IDENT.getText():null));
				    constant.setValue(((DefinesContext)_localctx).ctes.constante);
				    constant.setType(null);

				    program.getBlock().addDcl(constant);

				setState(73);
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
		public String constante;
		public Token CONSTINT;
		public Token CONSTFLOAT;
		public Token CONSTLIT;
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
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				((CtesContext)_localctx).CONSTINT = match(CONSTINT);
				((CtesContext)_localctx).constante =  (((CtesContext)_localctx).CONSTINT!=null?((CtesContext)_localctx).CONSTINT.getText():null);
				}
				break;
			case CONSTFLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				((CtesContext)_localctx).CONSTFLOAT = match(CONSTFLOAT);
				((CtesContext)_localctx).constante =  (((CtesContext)_localctx).CONSTFLOAT!=null?((CtesContext)_localctx).CONSTFLOAT.getText():null);
				}
				break;
			case CONSTLIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				((CtesContext)_localctx).CONSTLIT = match(CONSTLIT);
				((CtesContext)_localctx).constante =  (((CtesContext)_localctx).CONSTLIT!=null?((CtesContext)_localctx).CONSTLIT.getText():null);
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
			setState(86);
			part();
			setState(87);
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
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
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
		public TypeContext type;
		public RestpartContext restpart;
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
			setState(93);
			((PartContext)_localctx).type = type();
			setState(94);
			((PartContext)_localctx).restpart = restpart();

			    MethodDcl method = new MethodDcl();
			    method.setType(((PartContext)_localctx).type.tipo);
			    method.setName(((PartContext)_localctx).restpart.name);
			    method.setListParam(((PartContext)_localctx).restpart.params);
			    method.setBlock(((PartContext)_localctx).restpart.block);

			    if ("main".equals(method.getName())) {
			        program.setHasMain(true);
			        program.getBlock().getDclList().addAll(method.getBlock().getDclList());
			        program.getBlock().setSentList(method.getBlock().getSentList());
			    } else {
			        program.getBlock().addDcl(method);
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
	public static class BlqContext extends ParserRuleContext {
		public Blq block;
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
			((BlqContext)_localctx).block =  new Blq();
			setState(98);
			match(T__1);
			setState(99);
			sentlist(_localctx.block);
			setState(100);
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
		public String tipo;
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
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(T__3);
				((TypeContext)_localctx).tipo =  "void";
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(T__4);
				((TypeContext)_localctx).tipo =  "INTEGER";
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(T__5);
				((TypeContext)_localctx).tipo =  "REAL";
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
	public static class OpContext extends ParserRuleContext {
		public MathOp operacion;
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
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(T__6);
				((OpContext)_localctx).operacion =  MathOp.SUM;
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(T__7);
				((OpContext)_localctx).operacion =  MathOp.SUB;
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(T__8);
				((OpContext)_localctx).operacion =  MathOp.MULT;
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				match(T__9);
				((OpContext)_localctx).operacion =  MathOp.DIV;
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				match(T__10);
				((OpContext)_localctx).operacion =  MathOp.MOD;
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
	public static class ListparamContext extends ParserRuleContext {
		public List<Param> params;
		public TypeContext type;
		public Token IDENT;
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
			setState(122);
			((ListparamContext)_localctx).type = type();
			setState(123);
			((ListparamContext)_localctx).IDENT = match(IDENT);

			    ((ListparamContext)_localctx).params =  new ArrayList<>();
			    _localctx.params.add(new Param((((ListparamContext)_localctx).IDENT!=null?((ListparamContext)_localctx).IDENT.getText():null), ((ListparamContext)_localctx).type.tipo));

			setState(125);
			listparam2(_localctx.params);
			}
		}
		catch (RecognitionException re) {
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
		public List<Param> params;
		public TypeContext type;
		public Token IDENT;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(Practica2Parser.IDENT, 0); }
		public Listparam2Context listparam2() {
			return getRuleContext(Listparam2Context.class,0);
		}
		public Listparam2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Listparam2Context(ParserRuleContext parent, int invokingState, List<Param> params) {
			super(parent, invokingState);
			this.params = params;
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

	public final Listparam2Context listparam2(List<Param> params) throws RecognitionException {
		Listparam2Context _localctx = new Listparam2Context(_ctx, getState(), params);
		enterRule(_localctx, 20, RULE_listparam2);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(T__11);
				setState(128);
				((Listparam2Context)_localctx).type = type();
				setState(129);
				((Listparam2Context)_localctx).IDENT = match(IDENT);
				params.add(new Param((((Listparam2Context)_localctx).IDENT!=null?((Listparam2Context)_localctx).IDENT.getText():null), ((Listparam2Context)_localctx).type.tipo));
				setState(131);
				listparam2(params);
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
		public Blq block;
		public SentContext sent;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Sentlist2Context sentlist2() {
			return getRuleContext(Sentlist2Context.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SentlistContext(ParserRuleContext parent, int invokingState, Blq block) {
			super(parent, invokingState);
			this.block = block;
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

	public final SentlistContext sentlist(Blq block) throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState(), block);
		enterRule(_localctx, 22, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			((SentlistContext)_localctx).sent = sent();
			if (((SentlistContext)_localctx).sent.sentence!=null)block.addSent(((SentlistContext)_localctx).sent.sentence); else block.addDcl(((SentlistContext)_localctx).sent.dcl);
			setState(138);
			sentlist2(block);
			}
		}
		catch (RecognitionException re) {
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
		public Blq block;
		public SentContext sent;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Sentlist2Context sentlist2() {
			return getRuleContext(Sentlist2Context.class,0);
		}
		public Sentlist2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Sentlist2Context(ParserRuleContext parent, int invokingState, Blq block) {
			super(parent, invokingState);
			this.block = block;
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

	public final Sentlist2Context sentlist2(Blq block) throws RecognitionException {
		Sentlist2Context _localctx = new Sentlist2Context(_ctx, getState(), block);
		enterRule(_localctx, 24, RULE_sentlist2);
		try {
			setState(145);
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
				setState(140);
				((Sentlist2Context)_localctx).sent = sent();
				if (((Sentlist2Context)_localctx).sent.sentence!=null)block.addSent(((Sentlist2Context)_localctx).sent.sentence); else block.addDcl(((Sentlist2Context)_localctx).sent.dcl);
				setState(142);
				sentlist2(block);
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
		public String name;
		public Token IDENT;
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
			setState(147);
			((LidContext)_localctx).IDENT = match(IDENT);
			((LidContext)_localctx).name =  (((LidContext)_localctx).IDENT!=null?((LidContext)_localctx).IDENT.getText():null); List<String> names = new ArrayList<>();
			setState(149);
			lid2(names);
			for (String s :names) {_localctx.name += ", " +s;}
			}
		}
		catch (RecognitionException re) {
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
		public List<String> names;
		public Token IDENT;
		public TerminalNode IDENT() { return getToken(Practica2Parser.IDENT, 0); }
		public Lid2Context lid2() {
			return getRuleContext(Lid2Context.class,0);
		}
		public Lid2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Lid2Context(ParserRuleContext parent, int invokingState, List<String> names) {
			super(parent, invokingState);
			this.names = names;
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

	public final Lid2Context lid2(List<String> names) throws RecognitionException {
		Lid2Context _localctx = new Lid2Context(_ctx, getState(), names);
		enterRule(_localctx, 28, RULE_lid2);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(T__11);
				setState(153);
				((Lid2Context)_localctx).IDENT = match(IDENT);
				names.add((((Lid2Context)_localctx).IDENT!=null?((Lid2Context)_localctx).IDENT.getText():null));
				setState(155);
				lid2(names);
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
		public List<Expression> params;
		public ExpContext exp;
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
			setState(159);
			((LexpContext)_localctx).exp = exp();
			((LexpContext)_localctx).params =  new ArrayList<>(); _localctx.params.add(((LexpContext)_localctx).exp.expression);
			setState(161);
			lexp2(_localctx.params);
			}
		}
		catch (RecognitionException re) {
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
		public List<Expression> params;
		public ExpContext exp;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Lexp2Context lexp2() {
			return getRuleContext(Lexp2Context.class,0);
		}
		public Lexp2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Lexp2Context(ParserRuleContext parent, int invokingState, List<Expression> params) {
			super(parent, invokingState);
			this.params = params;
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

	public final Lexp2Context lexp2(List<Expression> params) throws RecognitionException {
		Lexp2Context _localctx = new Lexp2Context(_ctx, getState(), params);
		enterRule(_localctx, 32, RULE_lexp2);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(T__11);
				setState(164);
				((Lexp2Context)_localctx).exp = exp();
				params.add(((Lexp2Context)_localctx).exp.expression);
				setState(166);
				lexp2(params);
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
		public Expression expression;
		public FactorContext factor;
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
			((ExpContext)_localctx).expression =  new Expression();
			setState(172);
			((ExpContext)_localctx).factor = factor();
			_localctx.expression.addFactor(((ExpContext)_localctx).factor.fact);
			setState(174);
			exp2(_localctx.expression);
			}
		}
		catch (RecognitionException re) {
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
		public Expression expression;
		public OpContext op;
		public ExpContext exp;
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public Exp2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Exp2Context(ParserRuleContext parent, int invokingState, Expression expression) {
			super(parent, invokingState);
			this.expression = expression;
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

	public final Exp2Context exp2(Expression expression) throws RecognitionException {
		Exp2Context _localctx = new Exp2Context(_ctx, getState(), expression);
		enterRule(_localctx, 36, RULE_exp2);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				((Exp2Context)_localctx).op = op();
				expression.addOp(((Exp2Context)_localctx).op.operacion);
				setState(178);
				((Exp2Context)_localctx).exp = exp();
				expression.getFactorList().addAll(((Exp2Context)_localctx).exp.expression.getFactorList());expression.getOpList().addAll(((Exp2Context)_localctx).exp.expression.getOpList());
				setState(180);
				exp2(expression);
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
		public Factor fact;
		public ExpContext exp;
		public CtesContext ctes;
		public Token IDENT;
		public Factor2Context factor2;
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
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(T__12);
				setState(186);
				((FactorContext)_localctx).exp = exp();
				setState(187);
				match(T__13);
				Parenthesis par = new Parenthesis(); par.setValue(((FactorContext)_localctx).exp.expression); ((FactorContext)_localctx).fact = par;
				}
				break;
			case CONSTINT:
			case CONSTFLOAT:
			case CONSTLIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				((FactorContext)_localctx).ctes = ctes();
				Inmediate inm = new Inmediate(((FactorContext)_localctx).ctes.constante); ((FactorContext)_localctx).fact =  inm;
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				((FactorContext)_localctx).IDENT = match(IDENT);
				CallOrVar cov = new CallOrVar(); cov.setName((((FactorContext)_localctx).IDENT!=null?((FactorContext)_localctx).IDENT.getText():null));
				setState(195);
				((FactorContext)_localctx).factor2 = factor2();
				if (((FactorContext)_localctx).factor2.params==null) cov.setListParams(null); else cov.setListParams(((FactorContext)_localctx).factor2.params);((FactorContext)_localctx).fact = cov;
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
		public List<Expression> params;
		public Factor3Context factor3;
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
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(T__12);
				setState(201);
				((Factor2Context)_localctx).factor3 = factor3();
				((Factor2Context)_localctx).params =  ((Factor2Context)_localctx).factor3.params;
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
				((Factor2Context)_localctx).params =  null;
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
		public List<Expression> params;
		public LexpContext lexp;
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
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case IDENT:
			case CONSTINT:
			case CONSTFLOAT:
			case CONSTLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				((Factor3Context)_localctx).lexp = lexp();
				setState(208);
				match(T__13);
				((Factor3Context)_localctx).params =  ((Factor3Context)_localctx).lexp.params;
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(T__13);
				((Factor3Context)_localctx).params =  new ArrayList<>();
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
		public String name;
		public List<Param> params;
		public Blq block;
		public Token IDENT;
		public Restpart2Context restpart2;
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
			setState(215);
			((RestpartContext)_localctx).IDENT = match(IDENT);
			methName = (((RestpartContext)_localctx).IDENT!=null?((RestpartContext)_localctx).IDENT.getText():null);
			setState(217);
			match(T__12);
			setState(218);
			((RestpartContext)_localctx).restpart2 = restpart2();
			((RestpartContext)_localctx).name = (((RestpartContext)_localctx).IDENT!=null?((RestpartContext)_localctx).IDENT.getText():null);((RestpartContext)_localctx).params = ((RestpartContext)_localctx).restpart2.params;((RestpartContext)_localctx).block = ((RestpartContext)_localctx).restpart2.block;methName=null;
			}
		}
		catch (RecognitionException re) {
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
		public List<Param> params;
		public Blq block;
		public ListparamContext listparam;
		public BlqContext blq;
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
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				((Restpart2Context)_localctx).listparam = listparam();
				setState(222);
				match(T__13);
				((Restpart2Context)_localctx).params = ((Restpart2Context)_localctx).listparam.params;
				setState(224);
				((Restpart2Context)_localctx).blq = blq();
				((Restpart2Context)_localctx).block =  ((Restpart2Context)_localctx).blq.block;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(T__3);
				setState(228);
				match(T__13);
				setState(229);
				((Restpart2Context)_localctx).blq = blq();
				((Restpart2Context)_localctx).params =  null;((Restpart2Context)_localctx).block =  ((Restpart2Context)_localctx).blq.block;
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
		public Sent sentence;
		public Declaration dcl;
		public TypeContext type;
		public LidContext lid;
		public ExpContext exp;
		public Token IDENT;
		public Sent2Context sent2;
		public LcondContext lcond;
		public BlqContext b1;
		public BlqContext b2;
		public BlqContext blq;
		public Token id1;
		public ExpContext e1;
		public Token id2;
		public ExpContext e2;
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
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				((SentContext)_localctx).type = type();
				setState(235);
				((SentContext)_localctx).lid = lid();
				setState(236);
				match(T__14);
				((SentContext)_localctx).sentence =  null; VarDcl varDcl = new VarDcl(); varDcl.setType(((SentContext)_localctx).type.tipo);varDcl.setName(((SentContext)_localctx).lid.name);varDcl.setValue(null);((SentContext)_localctx).dcl =  varDcl;
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(T__15);
				setState(240);
				((SentContext)_localctx).exp = exp();
				setState(241);
				match(T__14);
				((SentContext)_localctx).dcl =  null; Asig asig = new Asig(); asig.setName(methName); asig.setValue(((SentContext)_localctx).exp.expression); ((SentContext)_localctx).sentence =  asig;
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				((SentContext)_localctx).IDENT = match(IDENT);
				setState(245);
				((SentContext)_localctx).sent2 = sent2();
				((SentContext)_localctx).dcl =  null; SentWithName sent = ((SentContext)_localctx).sent2.sentence; sent.setName((((SentContext)_localctx).IDENT!=null?((SentContext)_localctx).IDENT.getText():null)); ((SentContext)_localctx).sentence =  sent;
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				match(T__16);
				setState(249);
				match(T__12);
				setState(250);
				((SentContext)_localctx).lcond = lcond();
				setState(251);
				match(T__13);
				setState(252);
				((SentContext)_localctx).b1 = blq();
				setState(253);
				match(T__17);
				setState(254);
				((SentContext)_localctx).b2 = blq();
				((SentContext)_localctx).dcl =  null; IfLoop ifLoop = new IfLoop(); ifLoop.setCond(((SentContext)_localctx).lcond.condition); ifLoop.setBlockIf(((SentContext)_localctx).b1.block); ifLoop.setBlockElse(((SentContext)_localctx).b2.block); ((SentContext)_localctx).sentence =  ifLoop;
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(257);
				match(T__18);
				setState(258);
				match(T__12);
				setState(259);
				((SentContext)_localctx).lcond = lcond();
				setState(260);
				match(T__13);
				setState(261);
				((SentContext)_localctx).blq = blq();
				((SentContext)_localctx).dcl =  null; WhileLoop whileLoop = new WhileLoop(); whileLoop.setWhile(true);  whileLoop.setCond(((SentContext)_localctx).lcond.condition); whileLoop.setBlock(((SentContext)_localctx).blq.block); ((SentContext)_localctx).sentence =  whileLoop;
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 6);
				{
				setState(264);
				match(T__19);
				setState(265);
				((SentContext)_localctx).blq = blq();
				setState(266);
				match(T__20);
				setState(267);
				match(T__12);
				setState(268);
				((SentContext)_localctx).lcond = lcond();
				setState(269);
				match(T__13);
				((SentContext)_localctx).dcl =  null; WhileLoop whileLoop = new WhileLoop(); whileLoop.setWhile(false); whileLoop.setCond(((SentContext)_localctx).lcond.condition); whileLoop.setBlock(((SentContext)_localctx).blq.block); ((SentContext)_localctx).sentence =  whileLoop;
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 7);
				{
				setState(272);
				match(T__21);
				setState(273);
				match(T__12);
				setState(274);
				((SentContext)_localctx).id1 = match(IDENT);
				setState(275);
				match(T__22);
				setState(276);
				((SentContext)_localctx).e1 = exp();
				setState(277);
				match(T__14);
				setState(278);
				((SentContext)_localctx).lcond = lcond();
				setState(279);
				match(T__14);
				setState(280);
				((SentContext)_localctx).id2 = match(IDENT);
				setState(281);
				match(T__22);
				setState(282);
				((SentContext)_localctx).e2 = exp();
				setState(283);
				match(T__13);
				setState(284);
				((SentContext)_localctx).blq = blq();

				                                                ((SentContext)_localctx).dcl =  null;
				                                                ForManager forM = new ForManager();
				                                                forM.setNameAsig((((SentContext)_localctx).id1!=null?((SentContext)_localctx).id1.getText():null));
				                                                forM.setExpAsig(((SentContext)_localctx).e1.expression);
				                                                forM.setCond(((SentContext)_localctx).lcond.condition);
				                                                forM.setNameIncrement((((SentContext)_localctx).id2!=null?((SentContext)_localctx).id2.getText():null));
				                                                forM.setExpIncrement(((SentContext)_localctx).e2.expression);
				                                                forM.setBlock(((SentContext)_localctx).blq.block);

				                                                ((SentContext)_localctx).sentence =  forM.get();
				                                             
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
		public SentWithName sentence;
		public ExpContext exp;
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
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(T__22);
				setState(290);
				((Sent2Context)_localctx).exp = exp();
				setState(291);
				match(T__14);
				Asig asig = new Asig(); asig.setValue(((Sent2Context)_localctx).exp.expression); ((Sent2Context)_localctx).sentence =  asig;
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(T__12);
				setState(295);
				sent3();
				((Sent2Context)_localctx).sentence =  new ProcCall();
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
		public List<Expression> params;
		public LexpContext lexp;
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
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(T__13);
				setState(301);
				match(T__14);
				((Sent3Context)_localctx).params = null;
				}
				break;
			case T__12:
			case IDENT:
			case CONSTINT:
			case CONSTFLOAT:
			case CONSTLIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				((Sent3Context)_localctx).lexp = lexp();
				setState(304);
				match(T__13);
				setState(305);
				match(T__14);
				((Sent3Context)_localctx).params =  ((Sent3Context)_localctx).lexp.params;
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
		public Cond condition;
		public CondContext cond;
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
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case IDENT:
			case CONSTINT:
			case CONSTFLOAT:
			case CONSTLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				((LcondContext)_localctx).cond = cond();
				((LcondContext)_localctx).condition = new Cond();_localctx.condition.addFactor(((LcondContext)_localctx).cond.fact);
				setState(312);
				lcond2(_localctx.condition);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(T__23);
				setState(315);
				((LcondContext)_localctx).cond = cond();
				Not not = new Not(); not.setFactorCond(((LcondContext)_localctx).cond.fact); ((LcondContext)_localctx).condition = new Cond();_localctx.condition.addFactor(not);
				setState(317);
				lcond2(_localctx.condition);
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
		public Cond condition;
		public OplContext opl;
		public LcondContext lcond;
		public OplContext opl() {
			return getRuleContext(OplContext.class,0);
		}
		public LcondContext lcond() {
			return getRuleContext(LcondContext.class,0);
		}
		public Lcond2Context lcond2() {
			return getRuleContext(Lcond2Context.class,0);
		}
		public Lcond2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Lcond2Context(ParserRuleContext parent, int invokingState, Cond condition) {
			super(parent, invokingState);
			this.condition = condition;
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

	public final Lcond2Context lcond2(Cond condition) throws RecognitionException {
		Lcond2Context _localctx = new Lcond2Context(_ctx, getState(), condition);
		enterRule(_localctx, 56, RULE_lcond2);
		try {
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				((Lcond2Context)_localctx).opl = opl();
				condition.addOp(((Lcond2Context)_localctx).opl.andOr);
				setState(323);
				((Lcond2Context)_localctx).lcond = lcond();
				condition.addAll(((Lcond2Context)_localctx).lcond.condition);
				setState(325);
				lcond2(condition);
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
		public LogOp andOr;
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
		try {
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(T__24);
				((OplContext)_localctx).andOr =  LogOp.OR;
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				match(T__25);
				((OplContext)_localctx).andOr =  LogOp.AND;
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
	public static class CondContext extends ParserRuleContext {
		public FactorCond fact;
		public ExpContext e1;
		public OprContext opr;
		public ExpContext e2;
		public OprContext opr() {
			return getRuleContext(OprContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
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
			setState(336);
			((CondContext)_localctx).e1 = exp();
			setState(337);
			((CondContext)_localctx).opr = opr();
			setState(338);
			((CondContext)_localctx).e2 = exp();
			Comp comp = new Comp(); comp.setP1(((CondContext)_localctx).e1.expression);comp.setP2(((CondContext)_localctx).e2.expression);comp.setOp(((CondContext)_localctx).opr.operator); ((CondContext)_localctx).fact =  comp;
			}
		}
		catch (RecognitionException re) {
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
		public CompOp operator;
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
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(T__26);
				((OprContext)_localctx).operator =  CompOp.EQUAL;
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(T__27);
				((OprContext)_localctx).operator =  CompOp.LESSER_THAN;
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
				match(T__28);
				((OprContext)_localctx).operator =  CompOp.GREATER_THAN;
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 4);
				{
				setState(347);
				match(T__29);
				((OprContext)_localctx).operator =  CompOp.GREATER_EQUAL;
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 5);
				{
				setState(349);
				match(T__30);
				((OprContext)_localctx).operator =  CompOp.LESSER_EQUAL;
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

	public static final String _serializedATN =
		"\u0004\u0001,\u0162\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001M\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002U\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\\\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007m\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\by\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0087\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u0092\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u009e"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00aa"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00b8\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00c7\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00ce"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u00d6\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u00e9\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0120\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u012b\b\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u0135\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0140"+
		"\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u0149\b\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u014f\b\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u0160\b\u001f\u0001\u001f\u0000\u0000 \u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>\u0000\u0000\u0164\u0000@\u0001\u0000\u0000\u0000\u0002"+
		"L\u0001\u0000\u0000\u0000\u0004T\u0001\u0000\u0000\u0000\u0006V\u0001"+
		"\u0000\u0000\u0000\b[\u0001\u0000\u0000\u0000\n]\u0001\u0000\u0000\u0000"+
		"\fa\u0001\u0000\u0000\u0000\u000el\u0001\u0000\u0000\u0000\u0010x\u0001"+
		"\u0000\u0000\u0000\u0012z\u0001\u0000\u0000\u0000\u0014\u0086\u0001\u0000"+
		"\u0000\u0000\u0016\u0088\u0001\u0000\u0000\u0000\u0018\u0091\u0001\u0000"+
		"\u0000\u0000\u001a\u0093\u0001\u0000\u0000\u0000\u001c\u009d\u0001\u0000"+
		"\u0000\u0000\u001e\u009f\u0001\u0000\u0000\u0000 \u00a9\u0001\u0000\u0000"+
		"\u0000\"\u00ab\u0001\u0000\u0000\u0000$\u00b7\u0001\u0000\u0000\u0000"+
		"&\u00c6\u0001\u0000\u0000\u0000(\u00cd\u0001\u0000\u0000\u0000*\u00d5"+
		"\u0001\u0000\u0000\u0000,\u00d7\u0001\u0000\u0000\u0000.\u00e8\u0001\u0000"+
		"\u0000\u00000\u011f\u0001\u0000\u0000\u00002\u012a\u0001\u0000\u0000\u0000"+
		"4\u0134\u0001\u0000\u0000\u00006\u013f\u0001\u0000\u0000\u00008\u0148"+
		"\u0001\u0000\u0000\u0000:\u014e\u0001\u0000\u0000\u0000<\u0150\u0001\u0000"+
		"\u0000\u0000>\u015f\u0001\u0000\u0000\u0000@A\u0006\u0000\uffff\uffff"+
		"\u0000AB\u0003\u0002\u0001\u0000BC\u0003\u0006\u0003\u0000CD\u0006\u0000"+
		"\uffff\uffff\u0000D\u0001\u0001\u0000\u0000\u0000EF\u0005\u0001\u0000"+
		"\u0000FG\u0005 \u0000\u0000GH\u0003\u0004\u0002\u0000HI\u0006\u0001\uffff"+
		"\uffff\u0000IJ\u0003\u0002\u0001\u0000JM\u0001\u0000\u0000\u0000KM\u0001"+
		"\u0000\u0000\u0000LE\u0001\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000"+
		"M\u0003\u0001\u0000\u0000\u0000NO\u0005!\u0000\u0000OU\u0006\u0002\uffff"+
		"\uffff\u0000PQ\u0005\"\u0000\u0000QU\u0006\u0002\uffff\uffff\u0000RS\u0005"+
		")\u0000\u0000SU\u0006\u0002\uffff\uffff\u0000TN\u0001\u0000\u0000\u0000"+
		"TP\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000U\u0005\u0001\u0000"+
		"\u0000\u0000VW\u0003\n\u0005\u0000WX\u0003\b\u0004\u0000X\u0007\u0001"+
		"\u0000\u0000\u0000Y\\\u0003\u0006\u0003\u0000Z\\\u0001\u0000\u0000\u0000"+
		"[Y\u0001\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\\t\u0001\u0000\u0000"+
		"\u0000]^\u0003\u000e\u0007\u0000^_\u0003,\u0016\u0000_`\u0006\u0005\uffff"+
		"\uffff\u0000`\u000b\u0001\u0000\u0000\u0000ab\u0006\u0006\uffff\uffff"+
		"\u0000bc\u0005\u0002\u0000\u0000cd\u0003\u0016\u000b\u0000de\u0005\u0003"+
		"\u0000\u0000e\r\u0001\u0000\u0000\u0000fg\u0005\u0004\u0000\u0000gm\u0006"+
		"\u0007\uffff\uffff\u0000hi\u0005\u0005\u0000\u0000im\u0006\u0007\uffff"+
		"\uffff\u0000jk\u0005\u0006\u0000\u0000km\u0006\u0007\uffff\uffff\u0000"+
		"lf\u0001\u0000\u0000\u0000lh\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000"+
		"\u0000m\u000f\u0001\u0000\u0000\u0000no\u0005\u0007\u0000\u0000oy\u0006"+
		"\b\uffff\uffff\u0000pq\u0005\b\u0000\u0000qy\u0006\b\uffff\uffff\u0000"+
		"rs\u0005\t\u0000\u0000sy\u0006\b\uffff\uffff\u0000tu\u0005\n\u0000\u0000"+
		"uy\u0006\b\uffff\uffff\u0000vw\u0005\u000b\u0000\u0000wy\u0006\b\uffff"+
		"\uffff\u0000xn\u0001\u0000\u0000\u0000xp\u0001\u0000\u0000\u0000xr\u0001"+
		"\u0000\u0000\u0000xt\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000"+
		"y\u0011\u0001\u0000\u0000\u0000z{\u0003\u000e\u0007\u0000{|\u0005 \u0000"+
		"\u0000|}\u0006\t\uffff\uffff\u0000}~\u0003\u0014\n\u0000~\u0013\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005\f\u0000\u0000\u0080\u0081\u0003\u000e"+
		"\u0007\u0000\u0081\u0082\u0005 \u0000\u0000\u0082\u0083\u0006\n\uffff"+
		"\uffff\u0000\u0083\u0084\u0003\u0014\n\u0000\u0084\u0087\u0001\u0000\u0000"+
		"\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u007f\u0001\u0000\u0000"+
		"\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u0015\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u00030\u0018\u0000\u0089\u008a\u0006\u000b\uffff\uffff"+
		"\u0000\u008a\u008b\u0003\u0018\f\u0000\u008b\u0017\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u00030\u0018\u0000\u008d\u008e\u0006\f\uffff\uffff\u0000"+
		"\u008e\u008f\u0003\u0018\f\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090"+
		"\u0092\u0001\u0000\u0000\u0000\u0091\u008c\u0001\u0000\u0000\u0000\u0091"+
		"\u0090\u0001\u0000\u0000\u0000\u0092\u0019\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0005 \u0000\u0000\u0094\u0095\u0006\r\uffff\uffff\u0000\u0095"+
		"\u0096\u0003\u001c\u000e\u0000\u0096\u0097\u0006\r\uffff\uffff\u0000\u0097"+
		"\u001b\u0001\u0000\u0000\u0000\u0098\u0099\u0005\f\u0000\u0000\u0099\u009a"+
		"\u0005 \u0000\u0000\u009a\u009b\u0006\u000e\uffff\uffff\u0000\u009b\u009e"+
		"\u0003\u001c\u000e\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u0098"+
		"\u0001\u0000\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u001d"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0003\"\u0011\u0000\u00a0\u00a1\u0006"+
		"\u000f\uffff\uffff\u0000\u00a1\u00a2\u0003 \u0010\u0000\u00a2\u001f\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0005\f\u0000\u0000\u00a4\u00a5\u0003\""+
		"\u0011\u0000\u00a5\u00a6\u0006\u0010\uffff\uffff\u0000\u00a6\u00a7\u0003"+
		" \u0010\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00aa\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a3\u0001\u0000\u0000\u0000\u00a9\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa!\u0001\u0000\u0000\u0000\u00ab\u00ac\u0006\u0011\uffff"+
		"\uffff\u0000\u00ac\u00ad\u0003&\u0013\u0000\u00ad\u00ae\u0006\u0011\uffff"+
		"\uffff\u0000\u00ae\u00af\u0003$\u0012\u0000\u00af#\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0003\u0010\b\u0000\u00b1\u00b2\u0006\u0012\uffff\uffff\u0000"+
		"\u00b2\u00b3\u0003\"\u0011\u0000\u00b3\u00b4\u0006\u0012\uffff\uffff\u0000"+
		"\u00b4\u00b5\u0003$\u0012\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b7\u00b0\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b8%\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0005\r\u0000\u0000\u00ba\u00bb\u0003\"\u0011\u0000\u00bb\u00bc\u0005"+
		"\u000e\u0000\u0000\u00bc\u00bd\u0006\u0013\uffff\uffff\u0000\u00bd\u00c7"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0003\u0004\u0002\u0000\u00bf\u00c0"+
		"\u0006\u0013\uffff\uffff\u0000\u00c0\u00c7\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0005 \u0000\u0000\u00c2\u00c3\u0006\u0013\uffff\uffff\u0000\u00c3"+
		"\u00c4\u0003(\u0014\u0000\u00c4\u00c5\u0006\u0013\uffff\uffff\u0000\u00c5"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c6\u00b9\u0001\u0000\u0000\u0000\u00c6"+
		"\u00be\u0001\u0000\u0000\u0000\u00c6\u00c1\u0001\u0000\u0000\u0000\u00c7"+
		"\'\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\r\u0000\u0000\u00c9\u00ca"+
		"\u0003*\u0015\u0000\u00ca\u00cb\u0006\u0014\uffff\uffff\u0000\u00cb\u00ce"+
		"\u0001\u0000\u0000\u0000\u00cc\u00ce\u0006\u0014\uffff\uffff\u0000\u00cd"+
		"\u00c8\u0001\u0000\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce"+
		")\u0001\u0000\u0000\u0000\u00cf\u00d0\u0003\u001e\u000f\u0000\u00d0\u00d1"+
		"\u0005\u000e\u0000\u0000\u00d1\u00d2\u0006\u0015\uffff\uffff\u0000\u00d2"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u000e\u0000\u0000\u00d4"+
		"\u00d6\u0006\u0015\uffff\uffff\u0000\u00d5\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6+\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0005 \u0000\u0000\u00d8\u00d9\u0006\u0016\uffff\uffff\u0000\u00d9"+
		"\u00da\u0005\r\u0000\u0000\u00da\u00db\u0003.\u0017\u0000\u00db\u00dc"+
		"\u0006\u0016\uffff\uffff\u0000\u00dc-\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0003\u0012\t\u0000\u00de\u00df\u0005\u000e\u0000\u0000\u00df\u00e0\u0006"+
		"\u0017\uffff\uffff\u0000\u00e0\u00e1\u0003\f\u0006\u0000\u00e1\u00e2\u0006"+
		"\u0017\uffff\uffff\u0000\u00e2\u00e9\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0005\u0004\u0000\u0000\u00e4\u00e5\u0005\u000e\u0000\u0000\u00e5\u00e6"+
		"\u0003\f\u0006\u0000\u00e6\u00e7\u0006\u0017\uffff\uffff\u0000\u00e7\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e8\u00dd\u0001\u0000\u0000\u0000\u00e8\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e9/\u0001\u0000\u0000\u0000\u00ea\u00eb\u0003"+
		"\u000e\u0007\u0000\u00eb\u00ec\u0003\u001a\r\u0000\u00ec\u00ed\u0005\u000f"+
		"\u0000\u0000\u00ed\u00ee\u0006\u0018\uffff\uffff\u0000\u00ee\u0120\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u0005\u0010\u0000\u0000\u00f0\u00f1\u0003"+
		"\"\u0011\u0000\u00f1\u00f2\u0005\u000f\u0000\u0000\u00f2\u00f3\u0006\u0018"+
		"\uffff\uffff\u0000\u00f3\u0120\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005"+
		" \u0000\u0000\u00f5\u00f6\u00032\u0019\u0000\u00f6\u00f7\u0006\u0018\uffff"+
		"\uffff\u0000\u00f7\u0120\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\u0011"+
		"\u0000\u0000\u00f9\u00fa\u0005\r\u0000\u0000\u00fa\u00fb\u00036\u001b"+
		"\u0000\u00fb\u00fc\u0005\u000e\u0000\u0000\u00fc\u00fd\u0003\f\u0006\u0000"+
		"\u00fd\u00fe\u0005\u0012\u0000\u0000\u00fe\u00ff\u0003\f\u0006\u0000\u00ff"+
		"\u0100\u0006\u0018\uffff\uffff\u0000\u0100\u0120\u0001\u0000\u0000\u0000"+
		"\u0101\u0102\u0005\u0013\u0000\u0000\u0102\u0103\u0005\r\u0000\u0000\u0103"+
		"\u0104\u00036\u001b\u0000\u0104\u0105\u0005\u000e\u0000\u0000\u0105\u0106"+
		"\u0003\f\u0006\u0000\u0106\u0107\u0006\u0018\uffff\uffff\u0000\u0107\u0120"+
		"\u0001\u0000\u0000\u0000\u0108\u0109\u0005\u0014\u0000\u0000\u0109\u010a"+
		"\u0003\f\u0006\u0000\u010a\u010b\u0005\u0015\u0000\u0000\u010b\u010c\u0005"+
		"\r\u0000\u0000\u010c\u010d\u00036\u001b\u0000\u010d\u010e\u0005\u000e"+
		"\u0000\u0000\u010e\u010f\u0006\u0018\uffff\uffff\u0000\u010f\u0120\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0005\u0016\u0000\u0000\u0111\u0112\u0005"+
		"\r\u0000\u0000\u0112\u0113\u0005 \u0000\u0000\u0113\u0114\u0005\u0017"+
		"\u0000\u0000\u0114\u0115\u0003\"\u0011\u0000\u0115\u0116\u0005\u000f\u0000"+
		"\u0000\u0116\u0117\u00036\u001b\u0000\u0117\u0118\u0005\u000f\u0000\u0000"+
		"\u0118\u0119\u0005 \u0000\u0000\u0119\u011a\u0005\u0017\u0000\u0000\u011a"+
		"\u011b\u0003\"\u0011\u0000\u011b\u011c\u0005\u000e\u0000\u0000\u011c\u011d"+
		"\u0003\f\u0006\u0000\u011d\u011e\u0006\u0018\uffff\uffff\u0000\u011e\u0120"+
		"\u0001\u0000\u0000\u0000\u011f\u00ea\u0001\u0000\u0000\u0000\u011f\u00ef"+
		"\u0001\u0000\u0000\u0000\u011f\u00f4\u0001\u0000\u0000\u0000\u011f\u00f8"+
		"\u0001\u0000\u0000\u0000\u011f\u0101\u0001\u0000\u0000\u0000\u011f\u0108"+
		"\u0001\u0000\u0000\u0000\u011f\u0110\u0001\u0000\u0000\u0000\u01201\u0001"+
		"\u0000\u0000\u0000\u0121\u0122\u0005\u0017\u0000\u0000\u0122\u0123\u0003"+
		"\"\u0011\u0000\u0123\u0124\u0005\u000f\u0000\u0000\u0124\u0125\u0006\u0019"+
		"\uffff\uffff\u0000\u0125\u012b\u0001\u0000\u0000\u0000\u0126\u0127\u0005"+
		"\r\u0000\u0000\u0127\u0128\u00034\u001a\u0000\u0128\u0129\u0006\u0019"+
		"\uffff\uffff\u0000\u0129\u012b\u0001\u0000\u0000\u0000\u012a\u0121\u0001"+
		"\u0000\u0000\u0000\u012a\u0126\u0001\u0000\u0000\u0000\u012b3\u0001\u0000"+
		"\u0000\u0000\u012c\u012d\u0005\u000e\u0000\u0000\u012d\u012e\u0005\u000f"+
		"\u0000\u0000\u012e\u0135\u0006\u001a\uffff\uffff\u0000\u012f\u0130\u0003"+
		"\u001e\u000f\u0000\u0130\u0131\u0005\u000e\u0000\u0000\u0131\u0132\u0005"+
		"\u000f\u0000\u0000\u0132\u0133\u0006\u001a\uffff\uffff\u0000\u0133\u0135"+
		"\u0001\u0000\u0000\u0000\u0134\u012c\u0001\u0000\u0000\u0000\u0134\u012f"+
		"\u0001\u0000\u0000\u0000\u01355\u0001\u0000\u0000\u0000\u0136\u0137\u0003"+
		"<\u001e\u0000\u0137\u0138\u0006\u001b\uffff\uffff\u0000\u0138\u0139\u0003"+
		"8\u001c\u0000\u0139\u0140\u0001\u0000\u0000\u0000\u013a\u013b\u0005\u0018"+
		"\u0000\u0000\u013b\u013c\u0003<\u001e\u0000\u013c\u013d\u0006\u001b\uffff"+
		"\uffff\u0000\u013d\u013e\u00038\u001c\u0000\u013e\u0140\u0001\u0000\u0000"+
		"\u0000\u013f\u0136\u0001\u0000\u0000\u0000\u013f\u013a\u0001\u0000\u0000"+
		"\u0000\u01407\u0001\u0000\u0000\u0000\u0141\u0142\u0003:\u001d\u0000\u0142"+
		"\u0143\u0006\u001c\uffff\uffff\u0000\u0143\u0144\u00036\u001b\u0000\u0144"+
		"\u0145\u0006\u001c\uffff\uffff\u0000\u0145\u0146\u00038\u001c\u0000\u0146"+
		"\u0149\u0001\u0000\u0000\u0000\u0147\u0149\u0001\u0000\u0000\u0000\u0148"+
		"\u0141\u0001\u0000\u0000\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0149"+
		"9\u0001\u0000\u0000\u0000\u014a\u014b\u0005\u0019\u0000\u0000\u014b\u014f"+
		"\u0006\u001d\uffff\uffff\u0000\u014c\u014d\u0005\u001a\u0000\u0000\u014d"+
		"\u014f\u0006\u001d\uffff\uffff\u0000\u014e\u014a\u0001\u0000\u0000\u0000"+
		"\u014e\u014c\u0001\u0000\u0000\u0000\u014f;\u0001\u0000\u0000\u0000\u0150"+
		"\u0151\u0003\"\u0011\u0000\u0151\u0152\u0003>\u001f\u0000\u0152\u0153"+
		"\u0003\"\u0011\u0000\u0153\u0154\u0006\u001e\uffff\uffff\u0000\u0154="+
		"\u0001\u0000\u0000\u0000\u0155\u0156\u0005\u001b\u0000\u0000\u0156\u0160"+
		"\u0006\u001f\uffff\uffff\u0000\u0157\u0158\u0005\u001c\u0000\u0000\u0158"+
		"\u0160\u0006\u001f\uffff\uffff\u0000\u0159\u015a\u0005\u001d\u0000\u0000"+
		"\u015a\u0160\u0006\u001f\uffff\uffff\u0000\u015b\u015c\u0005\u001e\u0000"+
		"\u0000\u015c\u0160\u0006\u001f\uffff\uffff\u0000\u015d\u015e\u0005\u001f"+
		"\u0000\u0000\u015e\u0160\u0006\u001f\uffff\uffff\u0000\u015f\u0155\u0001"+
		"\u0000\u0000\u0000\u015f\u0157\u0001\u0000\u0000\u0000\u015f\u0159\u0001"+
		"\u0000\u0000\u0000\u015f\u015b\u0001\u0000\u0000\u0000\u015f\u015d\u0001"+
		"\u0000\u0000\u0000\u0160?\u0001\u0000\u0000\u0000\u0015LT[lx\u0086\u0091"+
		"\u009d\u00a9\u00b7\u00c6\u00cd\u00d5\u00e8\u011f\u012a\u0134\u013f\u0148"+
		"\u014e\u015f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}