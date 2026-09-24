// Generated from ArduinoDSL.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ArduinoDSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, PIN_TYPE=12, MODE=13, STATE=14, ANALOG_PIN=15, IDENTIFIER=16, 
		INT=17, WS=18, COMMENT=19, BLOCK_COMMENT=20;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_pinDecl = 2, RULE_pinSpec = 3, 
		RULE_pinModeConfig = 4, RULE_digitalWriteCmd = 5, RULE_digitalReadCmd = 6, 
		RULE_delayCmd = 7, RULE_pinRef = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "pinDecl", "pinSpec", "pinModeConfig", "digitalWriteCmd", 
			"digitalReadCmd", "delayCmd", "pinRef"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pin'", "'='", "';'", "'pinMode'", "'('", "','", "')'", "'digitalWrite'", 
			"'digitalRead'", "'delay'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"PIN_TYPE", "MODE", "STATE", "ANALOG_PIN", "IDENTIFIER", "INT", "WS", 
			"COMMENT", "BLOCK_COMMENT"
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
	public String getGrammarFileName() { return "ArduinoDSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArduinoDSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ArduinoDSLParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArduinoDSLVisitor ) return ((ArduinoDSLVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1810L) != 0)) {
				{
				{
				setState(18);
				statement();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
	public static class StatementContext extends ParserRuleContext {
		public PinDeclContext pinDecl() {
			return getRuleContext(PinDeclContext.class,0);
		}
		public PinModeConfigContext pinModeConfig() {
			return getRuleContext(PinModeConfigContext.class,0);
		}
		public DigitalWriteCmdContext digitalWriteCmd() {
			return getRuleContext(DigitalWriteCmdContext.class,0);
		}
		public DigitalReadCmdContext digitalReadCmd() {
			return getRuleContext(DigitalReadCmdContext.class,0);
		}
		public DelayCmdContext delayCmd() {
			return getRuleContext(DelayCmdContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArduinoDSLVisitor ) return ((ArduinoDSLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				pinDecl();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				pinModeConfig();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				digitalWriteCmd();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(29);
				digitalReadCmd();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(30);
				delayCmd();
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
	public static class PinDeclContext extends ParserRuleContext {
		public TerminalNode PIN_TYPE() { return getToken(ArduinoDSLParser.PIN_TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArduinoDSLParser.IDENTIFIER, 0); }
		public PinSpecContext pinSpec() {
			return getRuleContext(PinSpecContext.class,0);
		}
		public PinDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pinDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).enterPinDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).exitPinDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArduinoDSLVisitor ) return ((ArduinoDSLVisitor<? extends T>)visitor).visitPinDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PinDeclContext pinDecl() throws RecognitionException {
		PinDeclContext _localctx = new PinDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pinDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__0);
			setState(34);
			match(PIN_TYPE);
			setState(35);
			match(IDENTIFIER);
			setState(36);
			match(T__1);
			setState(37);
			pinSpec();
			setState(38);
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
	public static class PinSpecContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ArduinoDSLParser.INT, 0); }
		public TerminalNode ANALOG_PIN() { return getToken(ArduinoDSLParser.ANALOG_PIN, 0); }
		public PinSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pinSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).enterPinSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).exitPinSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArduinoDSLVisitor ) return ((ArduinoDSLVisitor<? extends T>)visitor).visitPinSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PinSpecContext pinSpec() throws RecognitionException {
		PinSpecContext _localctx = new PinSpecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pinSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !(_la==ANALOG_PIN || _la==INT) ) {
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
	public static class PinModeConfigContext extends ParserRuleContext {
		public PinRefContext pinRef() {
			return getRuleContext(PinRefContext.class,0);
		}
		public TerminalNode MODE() { return getToken(ArduinoDSLParser.MODE, 0); }
		public PinModeConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pinModeConfig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).enterPinModeConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).exitPinModeConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArduinoDSLVisitor ) return ((ArduinoDSLVisitor<? extends T>)visitor).visitPinModeConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PinModeConfigContext pinModeConfig() throws RecognitionException {
		PinModeConfigContext _localctx = new PinModeConfigContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pinModeConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__3);
			setState(43);
			match(T__4);
			setState(44);
			pinRef();
			setState(45);
			match(T__5);
			setState(46);
			match(MODE);
			setState(47);
			match(T__6);
			setState(48);
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
	public static class DigitalWriteCmdContext extends ParserRuleContext {
		public PinRefContext pinRef() {
			return getRuleContext(PinRefContext.class,0);
		}
		public TerminalNode STATE() { return getToken(ArduinoDSLParser.STATE, 0); }
		public DigitalWriteCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digitalWriteCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).enterDigitalWriteCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).exitDigitalWriteCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArduinoDSLVisitor ) return ((ArduinoDSLVisitor<? extends T>)visitor).visitDigitalWriteCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitalWriteCmdContext digitalWriteCmd() throws RecognitionException {
		DigitalWriteCmdContext _localctx = new DigitalWriteCmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_digitalWriteCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__7);
			setState(51);
			match(T__4);
			setState(52);
			pinRef();
			setState(53);
			match(T__5);
			setState(54);
			match(STATE);
			setState(55);
			match(T__6);
			setState(56);
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
	public static class DigitalReadCmdContext extends ParserRuleContext {
		public PinRefContext pinRef() {
			return getRuleContext(PinRefContext.class,0);
		}
		public DigitalReadCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digitalReadCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).enterDigitalReadCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).exitDigitalReadCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArduinoDSLVisitor ) return ((ArduinoDSLVisitor<? extends T>)visitor).visitDigitalReadCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitalReadCmdContext digitalReadCmd() throws RecognitionException {
		DigitalReadCmdContext _localctx = new DigitalReadCmdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_digitalReadCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__8);
			setState(59);
			match(T__4);
			setState(60);
			pinRef();
			setState(61);
			match(T__6);
			setState(62);
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
	public static class DelayCmdContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ArduinoDSLParser.INT, 0); }
		public DelayCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delayCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).enterDelayCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).exitDelayCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArduinoDSLVisitor ) return ((ArduinoDSLVisitor<? extends T>)visitor).visitDelayCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelayCmdContext delayCmd() throws RecognitionException {
		DelayCmdContext _localctx = new DelayCmdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_delayCmd);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(T__9);
				setState(65);
				match(T__4);
				setState(66);
				match(INT);
				setState(67);
				match(T__6);
				setState(68);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(T__9);
				setState(70);
				match(T__4);
				setState(71);
				match(T__10);
				setState(72);
				match(INT);
				setState(73);
				match(T__6);
				setState(74);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
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
	public static class PinRefContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ArduinoDSLParser.IDENTIFIER, 0); }
		public PinSpecContext pinSpec() {
			return getRuleContext(PinSpecContext.class,0);
		}
		public PinRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pinRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).enterPinRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinoDSLListener ) ((ArduinoDSLListener)listener).exitPinRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArduinoDSLVisitor ) return ((ArduinoDSLVisitor<? extends T>)visitor).visitPinRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PinRefContext pinRef() throws RecognitionException {
		PinRefContext _localctx = new PinRefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pinRef);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(IDENTIFIER);
				}
				break;
			case ANALOG_PIN:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				pinSpec();
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
		"\u0004\u0001\u0014R\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000\u0017"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001 \b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007L\b\u0007\u0001"+
		"\b\u0001\b\u0003\bP\b\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0000\u0001\u0002\u0000\u000f\u000f\u0011\u0011O\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0002\u001f\u0001\u0000\u0000\u0000\u0004"+
		"!\u0001\u0000\u0000\u0000\u0006(\u0001\u0000\u0000\u0000\b*\u0001\u0000"+
		"\u0000\u0000\n2\u0001\u0000\u0000\u0000\f:\u0001\u0000\u0000\u0000\u000e"+
		"K\u0001\u0000\u0000\u0000\u0010O\u0001\u0000\u0000\u0000\u0012\u0014\u0003"+
		"\u0002\u0001\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0017\u0001"+
		"\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001"+
		"\u0000\u0000\u0000\u0016\u0018\u0001\u0000\u0000\u0000\u0017\u0015\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0005\u0000\u0000\u0001\u0019\u0001\u0001"+
		"\u0000\u0000\u0000\u001a \u0003\u0004\u0002\u0000\u001b \u0003\b\u0004"+
		"\u0000\u001c \u0003\n\u0005\u0000\u001d \u0003\f\u0006\u0000\u001e \u0003"+
		"\u000e\u0007\u0000\u001f\u001a\u0001\u0000\u0000\u0000\u001f\u001b\u0001"+
		"\u0000\u0000\u0000\u001f\u001c\u0001\u0000\u0000\u0000\u001f\u001d\u0001"+
		"\u0000\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000 \u0003\u0001\u0000"+
		"\u0000\u0000!\"\u0005\u0001\u0000\u0000\"#\u0005\f\u0000\u0000#$\u0005"+
		"\u0010\u0000\u0000$%\u0005\u0002\u0000\u0000%&\u0003\u0006\u0003\u0000"+
		"&\'\u0005\u0003\u0000\u0000\'\u0005\u0001\u0000\u0000\u0000()\u0007\u0000"+
		"\u0000\u0000)\u0007\u0001\u0000\u0000\u0000*+\u0005\u0004\u0000\u0000"+
		"+,\u0005\u0005\u0000\u0000,-\u0003\u0010\b\u0000-.\u0005\u0006\u0000\u0000"+
		"./\u0005\r\u0000\u0000/0\u0005\u0007\u0000\u000001\u0005\u0003\u0000\u0000"+
		"1\t\u0001\u0000\u0000\u000023\u0005\b\u0000\u000034\u0005\u0005\u0000"+
		"\u000045\u0003\u0010\b\u000056\u0005\u0006\u0000\u000067\u0005\u000e\u0000"+
		"\u000078\u0005\u0007\u0000\u000089\u0005\u0003\u0000\u00009\u000b\u0001"+
		"\u0000\u0000\u0000:;\u0005\t\u0000\u0000;<\u0005\u0005\u0000\u0000<=\u0003"+
		"\u0010\b\u0000=>\u0005\u0007\u0000\u0000>?\u0005\u0003\u0000\u0000?\r"+
		"\u0001\u0000\u0000\u0000@A\u0005\n\u0000\u0000AB\u0005\u0005\u0000\u0000"+
		"BC\u0005\u0011\u0000\u0000CD\u0005\u0007\u0000\u0000DL\u0005\u0003\u0000"+
		"\u0000EF\u0005\n\u0000\u0000FG\u0005\u0005\u0000\u0000GH\u0005\u000b\u0000"+
		"\u0000HI\u0005\u0011\u0000\u0000IJ\u0005\u0007\u0000\u0000JL\u0005\u0003"+
		"\u0000\u0000K@\u0001\u0000\u0000\u0000KE\u0001\u0000\u0000\u0000L\u000f"+
		"\u0001\u0000\u0000\u0000MP\u0005\u0010\u0000\u0000NP\u0003\u0006\u0003"+
		"\u0000OM\u0001\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000P\u0011\u0001"+
		"\u0000\u0000\u0000\u0004\u0015\u001fKO";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}