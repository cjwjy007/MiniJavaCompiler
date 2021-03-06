// Generated from /Users/wei/IdeaProjects/MiniJavaCompiler/src/MiniJava.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, ID=20, INT_LITE=21, WS=22, BLOCK_COMMENT=23, LINE_COMMENT=24, 
		ASSIGN=25, GT=26, LT=27, GE=28, LE=29, PLUS=30, MINUS=31, TIMES=32, BANG=33, 
		AND=34, OR=35, L_PAREN=36, R_PAREN=37, L_BRACK=38, R_BRACK=39, L_BRACE=40, 
		R_BRACE=41, COMMA=42, DOT=43, SEMI=44;
	public static final int
		RULE_init = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_methodDeclaration = 4, RULE_type = 5, RULE_statement = 6, RULE_expr = 7;
	public static final String[] ruleNames = {
		"init", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
		"type", "statement", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'public'", "'static'", "'void'", "'main'", "'String'", 
		"'extends'", "'return'", "'int'", "'boolean'", "'if'", "'else'", "'while'", 
		"'System.out.println'", "'length'", "'true'", "'false'", "'this'", "'new'", 
		null, null, null, null, null, "'='", "'>'", "'<'", "'>='", "'<='", "'+'", 
		"'-'", "'*'", "'!'", "'&&'", "'||'", "'('", "')'", "'['", "']'", "'{'", 
		"'}'", "','", "'.'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "ID", "INT_LITE", "WS", 
		"BLOCK_COMMENT", "LINE_COMMENT", "ASSIGN", "GT", "LT", "GE", "LE", "PLUS", 
		"MINUS", "TIMES", "BANG", "AND", "OR", "L_PAREN", "R_PAREN", "L_BRACK", 
		"R_BRACK", "L_BRACE", "R_BRACE", "COMMA", "DOT", "SEMI"
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
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiniJavaParser.EOF, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			mainClass();
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(17);
				classDeclaration();
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23);
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

	public static class MainClassContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiniJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniJavaParser.ID, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMainClass(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(T__0);
			setState(26);
			match(ID);
			setState(27);
			match(L_BRACE);
			setState(28);
			match(T__1);
			setState(29);
			match(T__2);
			setState(30);
			match(T__3);
			setState(31);
			match(T__4);
			setState(32);
			match(L_PAREN);
			setState(33);
			match(T__5);
			setState(34);
			match(L_BRACK);
			setState(35);
			match(R_BRACK);
			setState(36);
			match(ID);
			setState(37);
			match(R_PAREN);
			setState(38);
			match(L_BRACE);
			setState(39);
			statement();
			setState(40);
			match(R_BRACE);
			setState(41);
			match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> ID() { return getTokens(MiniJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniJavaParser.ID, i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__0);
			setState(44);
			match(ID);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(45);
				match(T__6);
				setState(46);
				match(ID);
				}
			}

			setState(49);
			match(L_BRACE);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << ID))) != 0)) {
				{
				{
				setState(50);
				varDeclaration();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(56);
				methodDeclaration();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			type();
			setState(65);
			match(ID);
			setState(66);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(MiniJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniJavaParser.ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__1);
			setState(69);
			type();
			setState(70);
			match(ID);
			setState(71);
			match(L_PAREN);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << ID))) != 0)) {
				{
				setState(72);
				type();
				setState(73);
				match(ID);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(74);
					match(COMMA);
					setState(75);
					type();
					setState(76);
					match(ID);
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(85);
			match(R_PAREN);
			setState(86);
			match(L_BRACE);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(87);
					varDeclaration();
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << ID) | (1L << L_BRACE))) != 0)) {
				{
				{
				setState(93);
				statement();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(T__7);
			setState(100);
			expr(0);
			setState(101);
			match(SEMI);
			setState(102);
			match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(T__8);
				setState(105);
				match(L_BRACK);
				setState(106);
				match(R_BRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(T__8);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				match(ID);
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

	public static class StatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(L_BRACE);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << ID) | (1L << L_BRACE))) != 0)) {
					{
					{
					setState(113);
					statement();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				match(R_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(T__10);
				setState(121);
				match(L_PAREN);
				setState(122);
				expr(0);
				setState(123);
				match(R_PAREN);
				setState(124);
				statement();
				setState(125);
				match(T__11);
				setState(126);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(T__12);
				setState(129);
				match(L_PAREN);
				setState(130);
				expr(0);
				setState(131);
				match(R_PAREN);
				setState(132);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				match(T__13);
				setState(135);
				match(L_PAREN);
				setState(136);
				expr(0);
				setState(137);
				match(R_PAREN);
				setState(138);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				match(ID);
				setState(141);
				match(ASSIGN);
				setState(142);
				expr(0);
				setState(143);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(145);
				match(ID);
				setState(146);
				match(L_BRACK);
				setState(147);
				expr(0);
				setState(148);
				match(R_BRACK);
				setState(149);
				match(ASSIGN);
				setState(150);
				expr(0);
				setState(151);
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

	public static class ExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode INT_LITE() { return getToken(MiniJavaParser.INT_LITE, 0); }
		public TerminalNode ID() { return getToken(MiniJavaParser.ID, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaListener ) ((MiniJavaListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(156);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << AND))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(157);
				expr(15);
				notifyErrorListeners(this.getCurrentToken(),
				                    "Missing left operand",
				                    new MyRecognitionException(this));
				}
				break;
			case 2:
				{
				setState(160);
				match(INT_LITE);
				}
				break;
			case 3:
				{
				setState(161);
				match(T__15);
				}
				break;
			case 4:
				{
				setState(162);
				match(T__16);
				}
				break;
			case 5:
				{
				setState(163);
				match(ID);
				}
				break;
			case 6:
				{
				setState(164);
				match(T__17);
				}
				break;
			case 7:
				{
				setState(165);
				match(T__18);
				setState(166);
				match(T__8);
				setState(167);
				match(L_BRACK);
				setState(168);
				expr(0);
				setState(169);
				match(R_BRACK);
				}
				break;
			case 8:
				{
				setState(171);
				match(T__18);
				setState(172);
				match(ID);
				setState(173);
				match(L_PAREN);
				setState(174);
				match(R_PAREN);
				}
				break;
			case 9:
				{
				setState(175);
				match(BANG);
				setState(176);
				expr(2);
				}
				break;
			case 10:
				{
				setState(177);
				match(L_PAREN);
				setState(178);
				expr(0);
				setState(179);
				match(R_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(244);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(184);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << AND))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(185);
						expr(18);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(187);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << AND))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						notifyErrorListeners(this.getCurrentToken(),
						                              "Missing right operand",
						                              new MyRecognitionException(this));
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(190);
						match(L_BRACK);
						setState(191);
						expr(0);
						setState(192);
						match(R_BRACK);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(194);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(195);
						match(DOT);
						setState(196);
						match(T__14);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(197);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(198);
						match(DOT);
						setState(199);
						match(ID);
						setState(200);
						match(L_PAREN);
						setState(209);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << ID) | (1L << INT_LITE) | (1L << LT) | (1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << BANG) | (1L << AND) | (1L << L_PAREN))) != 0)) {
							{
							setState(201);
							expr(0);
							setState(206);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(202);
								match(COMMA);
								setState(203);
								expr(0);
								}
								}
								setState(208);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(211);
						match(R_PAREN);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(212);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(213);
						match(DOT);
						setState(214);
						match(ID);
						setState(215);
						match(L_PAREN);
						setState(224);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << ID) | (1L << INT_LITE) | (1L << LT) | (1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << BANG) | (1L << AND) | (1L << L_PAREN))) != 0)) {
							{
							setState(216);
							expr(0);
							setState(221);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(217);
								match(COMMA);
								setState(218);
								expr(0);
								}
								}
								setState(223);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(226);
						match(R_PAREN);
						setState(227);
						match(R_PAREN);
						notifyErrorListeners(this.getCurrentToken(),
						                                      "Too many parentheses",
						                                      new MyRecognitionException(this));
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(229);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(230);
						match(DOT);
						setState(231);
						match(ID);
						setState(232);
						match(L_PAREN);
						setState(241);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
						case 1:
							{
							setState(233);
							expr(0);
							setState(238);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(234);
									match(COMMA);
									setState(235);
									expr(0);
									}
									} 
								}
								setState(240);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
							}
							}
							break;
						}
						notifyErrorListeners(this.getCurrentToken(),
						                           "Missing closing ')'",
						                           new MyRecognitionException(this));
						}
						break;
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u00fc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\7\2\25"+
		"\n\2\f\2\16\2\30\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\62\n\4\3\4\3\4\7"+
		"\4\66\n\4\f\4\16\49\13\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6Q\n\6\f\6\16\6T\13\6"+
		"\5\6V\n\6\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\6\7\6a\n\6\f\6\16\6d\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7q\n\7\3\b\3\b\7\bu\n"+
		"\b\f\b\16\bx\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u009c\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b8"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\7\t\u00cf\n\t\f\t\16\t\u00d2\13\t\5\t\u00d4\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00de\n\t\f\t\16\t\u00e1\13\t\5\t\u00e3"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ef\n\t\f\t\16\t\u00f2"+
		"\13\t\5\t\u00f4\n\t\3\t\7\t\u00f7\n\t\f\t\16\t\u00fa\13\t\3\t\2\3\20\n"+
		"\2\4\6\b\n\f\16\20\2\3\5\2\35\35 \"$$\2\u011a\2\22\3\2\2\2\4\33\3\2\2"+
		"\2\6-\3\2\2\2\bB\3\2\2\2\nF\3\2\2\2\fp\3\2\2\2\16\u009b\3\2\2\2\20\u00b7"+
		"\3\2\2\2\22\26\5\4\3\2\23\25\5\6\4\2\24\23\3\2\2\2\25\30\3\2\2\2\26\24"+
		"\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30\26\3\2\2\2\31\32\7\2\2\3\32\3"+
		"\3\2\2\2\33\34\7\3\2\2\34\35\7\26\2\2\35\36\7*\2\2\36\37\7\4\2\2\37 \7"+
		"\5\2\2 !\7\6\2\2!\"\7\7\2\2\"#\7&\2\2#$\7\b\2\2$%\7(\2\2%&\7)\2\2&\'\7"+
		"\26\2\2\'(\7\'\2\2()\7*\2\2)*\5\16\b\2*+\7+\2\2+,\7+\2\2,\5\3\2\2\2-."+
		"\7\3\2\2.\61\7\26\2\2/\60\7\t\2\2\60\62\7\26\2\2\61/\3\2\2\2\61\62\3\2"+
		"\2\2\62\63\3\2\2\2\63\67\7*\2\2\64\66\5\b\5\2\65\64\3\2\2\2\669\3\2\2"+
		"\2\67\65\3\2\2\2\678\3\2\2\28=\3\2\2\29\67\3\2\2\2:<\5\n\6\2;:\3\2\2\2"+
		"<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7+\2\2A\7\3\2\2\2"+
		"BC\5\f\7\2CD\7\26\2\2DE\7.\2\2E\t\3\2\2\2FG\7\4\2\2GH\5\f\7\2HI\7\26\2"+
		"\2IU\7&\2\2JK\5\f\7\2KR\7\26\2\2LM\7,\2\2MN\5\f\7\2NO\7\26\2\2OQ\3\2\2"+
		"\2PL\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SV\3\2\2\2TR\3\2\2\2UJ\3\2\2"+
		"\2UV\3\2\2\2VW\3\2\2\2WX\7\'\2\2X\\\7*\2\2Y[\5\b\5\2ZY\3\2\2\2[^\3\2\2"+
		"\2\\Z\3\2\2\2\\]\3\2\2\2]b\3\2\2\2^\\\3\2\2\2_a\5\16\b\2`_\3\2\2\2ad\3"+
		"\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\n\2\2fg\5\20\t\2gh"+
		"\7.\2\2hi\7+\2\2i\13\3\2\2\2jk\7\13\2\2kl\7(\2\2lq\7)\2\2mq\7\f\2\2nq"+
		"\7\13\2\2oq\7\26\2\2pj\3\2\2\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2q\r\3\2\2"+
		"\2rv\7*\2\2su\5\16\b\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2"+
		"\2xv\3\2\2\2y\u009c\7+\2\2z{\7\r\2\2{|\7&\2\2|}\5\20\t\2}~\7\'\2\2~\177"+
		"\5\16\b\2\177\u0080\7\16\2\2\u0080\u0081\5\16\b\2\u0081\u009c\3\2\2\2"+
		"\u0082\u0083\7\17\2\2\u0083\u0084\7&\2\2\u0084\u0085\5\20\t\2\u0085\u0086"+
		"\7\'\2\2\u0086\u0087\5\16\b\2\u0087\u009c\3\2\2\2\u0088\u0089\7\20\2\2"+
		"\u0089\u008a\7&\2\2\u008a\u008b\5\20\t\2\u008b\u008c\7\'\2\2\u008c\u008d"+
		"\7.\2\2\u008d\u009c\3\2\2\2\u008e\u008f\7\26\2\2\u008f\u0090\7\33\2\2"+
		"\u0090\u0091\5\20\t\2\u0091\u0092\7.\2\2\u0092\u009c\3\2\2\2\u0093\u0094"+
		"\7\26\2\2\u0094\u0095\7(\2\2\u0095\u0096\5\20\t\2\u0096\u0097\7)\2\2\u0097"+
		"\u0098\7\33\2\2\u0098\u0099\5\20\t\2\u0099\u009a\7.\2\2\u009a\u009c\3"+
		"\2\2\2\u009br\3\2\2\2\u009bz\3\2\2\2\u009b\u0082\3\2\2\2\u009b\u0088\3"+
		"\2\2\2\u009b\u008e\3\2\2\2\u009b\u0093\3\2\2\2\u009c\17\3\2\2\2\u009d"+
		"\u009e\b\t\1\2\u009e\u009f\t\2\2\2\u009f\u00a0\5\20\t\21\u00a0\u00a1\b"+
		"\t\1\2\u00a1\u00b8\3\2\2\2\u00a2\u00b8\7\27\2\2\u00a3\u00b8\7\22\2\2\u00a4"+
		"\u00b8\7\23\2\2\u00a5\u00b8\7\26\2\2\u00a6\u00b8\7\24\2\2\u00a7\u00a8"+
		"\7\25\2\2\u00a8\u00a9\7\13\2\2\u00a9\u00aa\7(\2\2\u00aa\u00ab\5\20\t\2"+
		"\u00ab\u00ac\7)\2\2\u00ac\u00b8\3\2\2\2\u00ad\u00ae\7\25\2\2\u00ae\u00af"+
		"\7\26\2\2\u00af\u00b0\7&\2\2\u00b0\u00b8\7\'\2\2\u00b1\u00b2\7#\2\2\u00b2"+
		"\u00b8\5\20\t\4\u00b3\u00b4\7&\2\2\u00b4\u00b5\5\20\t\2\u00b5\u00b6\7"+
		"\'\2\2\u00b6\u00b8\3\2\2\2\u00b7\u009d\3\2\2\2\u00b7\u00a2\3\2\2\2\u00b7"+
		"\u00a3\3\2\2\2\u00b7\u00a4\3\2\2\2\u00b7\u00a5\3\2\2\2\u00b7\u00a6\3\2"+
		"\2\2\u00b7\u00a7\3\2\2\2\u00b7\u00ad\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7"+
		"\u00b3\3\2\2\2\u00b8\u00f8\3\2\2\2\u00b9\u00ba\f\23\2\2\u00ba\u00bb\t"+
		"\2\2\2\u00bb\u00f7\5\20\t\24\u00bc\u00bd\f\22\2\2\u00bd\u00be\t\2\2\2"+
		"\u00be\u00f7\b\t\1\2\u00bf\u00c0\f\20\2\2\u00c0\u00c1\7(\2\2\u00c1\u00c2"+
		"\5\20\t\2\u00c2\u00c3\7)\2\2\u00c3\u00f7\3\2\2\2\u00c4\u00c5\f\17\2\2"+
		"\u00c5\u00c6\7-\2\2\u00c6\u00f7\7\21\2\2\u00c7\u00c8\f\16\2\2\u00c8\u00c9"+
		"\7-\2\2\u00c9\u00ca\7\26\2\2\u00ca\u00d3\7&\2\2\u00cb\u00d0\5\20\t\2\u00cc"+
		"\u00cd\7,\2\2\u00cd\u00cf\5\20\t\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d3\u00cb\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00f7\7\'\2\2\u00d6\u00d7\f\r\2\2\u00d7\u00d8\7-\2\2\u00d8"+
		"\u00d9\7\26\2\2\u00d9\u00e2\7&\2\2\u00da\u00df\5\20\t\2\u00db\u00dc\7"+
		",\2\2\u00dc\u00de\5\20\t\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e2\u00da\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\7\'\2\2\u00e5\u00e6\7\'\2\2\u00e6\u00f7\b\t\1\2\u00e7\u00e8\f\f"+
		"\2\2\u00e8\u00e9\7-\2\2\u00e9\u00ea\7\26\2\2\u00ea\u00f3\7&\2\2\u00eb"+
		"\u00f0\5\20\t\2\u00ec\u00ed\7,\2\2\u00ed\u00ef\5\20\t\2\u00ee\u00ec\3"+
		"\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00eb\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\b\t\1\2\u00f6\u00b9\3\2\2\2\u00f6"+
		"\u00bc\3\2\2\2\u00f6\u00bf\3\2\2\2\u00f6\u00c4\3\2\2\2\u00f6\u00c7\3\2"+
		"\2\2\u00f6\u00d6\3\2\2\2\u00f6\u00e7\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\21\3\2\2\2\u00fa\u00f8\3\2\2"+
		"\2\26\26\61\67=RU\\bpv\u009b\u00b7\u00d0\u00d3\u00df\u00e2\u00f0\u00f3"+
		"\u00f6\u00f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}