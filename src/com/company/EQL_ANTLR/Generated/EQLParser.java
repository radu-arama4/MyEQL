package com.company.EQL_ANTLR.Generated;// Generated from D:/UTM/SEMESTRUL 4/PBL/MyEQL/src\EQL.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, YEAR=17, 
		DAY=18, SORTVALUE=19, BOOLVALUE=20, PARAMETER=21, FEXTENSION=22, DATE=23, 
		WORD=24, EMAIL=25, INTERVAL=26, INT=27, OPERAND=28, ASSIGN=29, STRING=30, 
		STAR=31, SPACE=32;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assignment = 2, RULE_query = 3, 
		RULE_print = 4, RULE_expression = 5, RULE_filter = 6, RULE_destination = 7, 
		RULE_time = 8, RULE_subject = 9, RULE_property = 10, RULE_content = 11, 
		RULE_sorting = 12, RULE_folder = 13, RULE_to = 14, RULE_from = 15, RULE_cc = 16, 
		RULE_forwarded = 17, RULE_read = 18, RULE_body = 19, RULE_attachments = 20, 
		RULE_datevalue = 21, RULE_subjectvalue = 22, RULE_sortingvalue = 23, RULE_foldervalue = 24, 
		RULE_destinationvalue = 25, RULE_bodyvalue = 26, RULE_attachementsvalue = 27, 
		RULE_wordlist = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "assignment", "query", "print", "expression", 
			"filter", "destination", "time", "subject", "property", "content", "sorting", 
			"folder", "to", "from", "cc", "forwarded", "read", "body", "attachments", 
			"datevalue", "subjectvalue", "sortingvalue", "foldervalue", "destinationvalue", 
			"bodyvalue", "attachementsvalue", "wordlist"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'print'", "'('", "')'", "'time:'", "'subject:'", 
			"'sortby:'", "'folder:'", "'to:'", "'from:'", "'cc:'", "'forwarded:'", 
			"'read:'", "'body:'", "'attachements:'", null, null, null, null, null, 
			null, null, null, null, null, null, null, "':'", null, "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "YEAR", "DAY", "SORTVALUE", "BOOLVALUE", 
			"PARAMETER", "FEXTENSION", "DATE", "WORD", "EMAIL", "INTERVAL", "INT", 
			"OPERAND", "ASSIGN", "STRING", "STAR", "SPACE"
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
	public String getGrammarFileName() { return "com/company/EQL_ANTLR/EQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
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
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==WORD) {
				{
				{
				setState(58);
				statement();
				}
				}
				setState(63);
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

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				assignment();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				print();
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(EQLParser.WORD, 0); }
		public TerminalNode ASSIGN() { return getToken(EQLParser.ASSIGN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(WORD);
			setState(69);
			match(ASSIGN);
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(70);
				query();
				}
				break;
			case 2:
				{
				setState(71);
				expression(0);
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

	public static class QueryContext extends ParserRuleContext {
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(EQLParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(EQLParser.STAR, i);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__0);
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
					{
					{
					setState(75);
					filter();
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STAR) {
					{
					{
					setState(81);
					match(STAR);
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(89);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode WORD() { return getToken(EQLParser.WORD, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__2);
			setState(92);
			match(T__3);
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(93);
				query();
				}
				break;
			case WORD:
				{
				setState(94);
				match(WORD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(97);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
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
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode WORD() { return getToken(EQLParser.WORD, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OPERAND() { return getToken(EQLParser.OPERAND, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(100);
				query();
				}
				break;
			case WORD:
				{
				setState(101);
				match(WORD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(104);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(105);
					match(OPERAND);
					setState(106);
					expression(4);
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class FilterContext extends ParserRuleContext {
		public DestinationContext destination() {
			return getRuleContext(DestinationContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public SubjectContext subject() {
			return getRuleContext(SubjectContext.class,0);
		}
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public SortingContext sorting() {
			return getRuleContext(SortingContext.class,0);
		}
		public FolderContext folder() {
			return getRuleContext(FolderContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_filter);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				destination();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				time();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				subject();
				}
				break;
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				property();
				}
				break;
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				content();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				sorting();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(118);
				folder();
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

	public static class DestinationContext extends ParserRuleContext {
		public ToContext to() {
			return getRuleContext(ToContext.class,0);
		}
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public CcContext cc() {
			return getRuleContext(CcContext.class,0);
		}
		public DestinationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destination; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterDestination(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitDestination(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitDestination(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestinationContext destination() throws RecognitionException {
		DestinationContext _localctx = new DestinationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_destination);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				to();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				from();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				cc();
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

	public static class TimeContext extends ParserRuleContext {
		public DatevalueContext datevalue() {
			return getRuleContext(DatevalueContext.class,0);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__5);
			setState(127);
			datevalue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubjectContext extends ParserRuleContext {
		public SubjectvalueContext subjectvalue() {
			return getRuleContext(SubjectvalueContext.class,0);
		}
		public SubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterSubject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitSubject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitSubject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubjectContext subject() throws RecognitionException {
		SubjectContext _localctx = new SubjectContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_subject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__6);
			setState(130);
			subjectvalue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContext extends ParserRuleContext {
		public ForwardedContext forwarded() {
			return getRuleContext(ForwardedContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_property);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				forwarded();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				read();
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

	public static class ContentContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public AttachmentsContext attachments() {
			return getRuleContext(AttachmentsContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_content);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				body();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				attachments();
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

	public static class SortingContext extends ParserRuleContext {
		public SortingvalueContext sortingvalue() {
			return getRuleContext(SortingvalueContext.class,0);
		}
		public SortingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sorting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterSorting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitSorting(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitSorting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortingContext sorting() throws RecognitionException {
		SortingContext _localctx = new SortingContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sorting);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__7);
			setState(141);
			sortingvalue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FolderContext extends ParserRuleContext {
		public FoldervalueContext foldervalue() {
			return getRuleContext(FoldervalueContext.class,0);
		}
		public FolderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_folder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterFolder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitFolder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitFolder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FolderContext folder() throws RecognitionException {
		FolderContext _localctx = new FolderContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_folder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__8);
			setState(144);
			foldervalue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ToContext extends ParserRuleContext {
		public DestinationvalueContext destinationvalue() {
			return getRuleContext(DestinationvalueContext.class,0);
		}
		public ToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitTo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToContext to() throws RecognitionException {
		ToContext _localctx = new ToContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__9);
			setState(147);
			destinationvalue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromContext extends ParserRuleContext {
		public DestinationvalueContext destinationvalue() {
			return getRuleContext(DestinationvalueContext.class,0);
		}
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__10);
			setState(150);
			destinationvalue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CcContext extends ParserRuleContext {
		public DestinationvalueContext destinationvalue() {
			return getRuleContext(DestinationvalueContext.class,0);
		}
		public CcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterCc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitCc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitCc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CcContext cc() throws RecognitionException {
		CcContext _localctx = new CcContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__11);
			setState(153);
			destinationvalue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForwardedContext extends ParserRuleContext {
		public TerminalNode BOOLVALUE() { return getToken(EQLParser.BOOLVALUE, 0); }
		public ForwardedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forwarded; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterForwarded(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitForwarded(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitForwarded(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForwardedContext forwarded() throws RecognitionException {
		ForwardedContext _localctx = new ForwardedContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forwarded);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__12);
			setState(156);
			match(BOOLVALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode BOOLVALUE() { return getToken(EQLParser.BOOLVALUE, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__13);
			setState(159);
			match(BOOLVALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public BodyvalueContext bodyvalue() {
			return getRuleContext(BodyvalueContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__14);
			setState(162);
			bodyvalue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttachmentsContext extends ParserRuleContext {
		public AttachementsvalueContext attachementsvalue() {
			return getRuleContext(AttachementsvalueContext.class,0);
		}
		public AttachmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attachments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterAttachments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitAttachments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitAttachments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttachmentsContext attachments() throws RecognitionException {
		AttachmentsContext _localctx = new AttachmentsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_attachments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__15);
			setState(165);
			attachementsvalue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatevalueContext extends ParserRuleContext {
		public List<TerminalNode> DATE() { return getTokens(EQLParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(EQLParser.DATE, i);
		}
		public TerminalNode STAR() { return getToken(EQLParser.STAR, 0); }
		public TerminalNode DAY() { return getToken(EQLParser.DAY, 0); }
		public TerminalNode YEAR() { return getToken(EQLParser.YEAR, 0); }
		public DatevalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datevalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterDatevalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitDatevalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitDatevalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatevalueContext datevalue() throws RecognitionException {
		DatevalueContext _localctx = new DatevalueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_datevalue);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(DATE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(DATE);
				setState(169);
				match(STAR);
				setState(170);
				match(DATE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(DATE);
				setState(172);
				match(STAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				match(STAR);
				setState(174);
				match(DATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				match(STAR);
				setState(176);
				match(DAY);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(177);
				match(DAY);
				setState(178);
				match(STAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(179);
				match(STAR);
				setState(180);
				match(YEAR);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(181);
				match(YEAR);
				setState(182);
				match(STAR);
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

	public static class SubjectvalueContext extends ParserRuleContext {
		public WordlistContext wordlist() {
			return getRuleContext(WordlistContext.class,0);
		}
		public TerminalNode STRING() { return getToken(EQLParser.STRING, 0); }
		public SubjectvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subjectvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterSubjectvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitSubjectvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitSubjectvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubjectvalueContext subjectvalue() throws RecognitionException {
		SubjectvalueContext _localctx = new SubjectvalueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_subjectvalue);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				wordlist();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(STRING);
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

	public static class SortingvalueContext extends ParserRuleContext {
		public TerminalNode PARAMETER() { return getToken(EQLParser.PARAMETER, 0); }
		public TerminalNode SORTVALUE() { return getToken(EQLParser.SORTVALUE, 0); }
		public SortingvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortingvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterSortingvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitSortingvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitSortingvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortingvalueContext sortingvalue() throws RecognitionException {
		SortingvalueContext _localctx = new SortingvalueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sortingvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(PARAMETER);
			setState(190);
			match(SORTVALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FoldervalueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(EQLParser.STRING, 0); }
		public FoldervalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foldervalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterFoldervalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitFoldervalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitFoldervalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FoldervalueContext foldervalue() throws RecognitionException {
		FoldervalueContext _localctx = new FoldervalueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_foldervalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DestinationvalueContext extends ParserRuleContext {
		public WordlistContext wordlist() {
			return getRuleContext(WordlistContext.class,0);
		}
		public TerminalNode EMAIL() { return getToken(EQLParser.EMAIL, 0); }
		public TerminalNode STRING() { return getToken(EQLParser.STRING, 0); }
		public TerminalNode WORD() { return getToken(EQLParser.WORD, 0); }
		public TerminalNode STAR() { return getToken(EQLParser.STAR, 0); }
		public DestinationvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destinationvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterDestinationvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitDestinationvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitDestinationvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestinationvalueContext destinationvalue() throws RecognitionException {
		DestinationvalueContext _localctx = new DestinationvalueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_destinationvalue);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				wordlist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(EMAIL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				match(WORD);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				match(STAR);
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

	public static class BodyvalueContext extends ParserRuleContext {
		public WordlistContext wordlist() {
			return getRuleContext(WordlistContext.class,0);
		}
		public TerminalNode WORD() { return getToken(EQLParser.WORD, 0); }
		public TerminalNode STRING() { return getToken(EQLParser.STRING, 0); }
		public BodyvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterBodyvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitBodyvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitBodyvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyvalueContext bodyvalue() throws RecognitionException {
		BodyvalueContext _localctx = new BodyvalueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_bodyvalue);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				wordlist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(WORD);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				match(STRING);
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

	public static class AttachementsvalueContext extends ParserRuleContext {
		public TerminalNode BOOLVALUE() { return getToken(EQLParser.BOOLVALUE, 0); }
		public TerminalNode FEXTENSION() { return getToken(EQLParser.FEXTENSION, 0); }
		public TerminalNode WORD() { return getToken(EQLParser.WORD, 0); }
		public TerminalNode INT() { return getToken(EQLParser.INT, 0); }
		public TerminalNode INTERVAL() { return getToken(EQLParser.INTERVAL, 0); }
		public AttachementsvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attachementsvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterAttachementsvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitAttachementsvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitAttachementsvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttachementsvalueContext attachementsvalue() throws RecognitionException {
		AttachementsvalueContext _localctx = new AttachementsvalueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_attachementsvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLVALUE) | (1L << FEXTENSION) | (1L << WORD) | (1L << INTERVAL) | (1L << INT))) != 0)) ) {
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

	public static class WordlistContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(EQLParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(EQLParser.WORD, i);
		}
		public WordlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wordlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).enterWordlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EQLListener ) ((EQLListener)listener).exitWordlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EQLVisitor ) return ((EQLVisitor<? extends T>)visitor).visitWordlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordlistContext wordlist() throws RecognitionException {
		WordlistContext _localctx = new WordlistContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_wordlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(208);
				match(WORD);
				}
				}
				setState(211); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			}
		}
		catch (RecognitionException re) {
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
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00d8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\3\3\3\5\3E\n\3\3\4\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\7\5O\n\5\f"+
		"\5\16\5R\13\5\3\5\7\5U\n\5\f\5\16\5X\13\5\5\5Z\n\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\5\6b\n\6\3\6\3\6\3\7\3\7\3\7\5\7i\n\7\3\7\3\7\3\7\7\7n\n\7\f\7\16"+
		"\7q\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bz\n\b\3\t\3\t\3\t\5\t\177\n\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\5\f\u0089\n\f\3\r\3\r\5\r\u008d\n"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\5\27\u00ba\n\27\3\30\3\30\5\30\u00be\n\30\3\31\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u00ca\n\33\3\34\3\34\3\34\5\34\u00cf"+
		"\n\34\3\35\3\35\3\36\6\36\u00d4\n\36\r\36\16\36\u00d5\3\36\2\3\f\37\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\3\6\2\26"+
		"\26\30\30\32\32\34\35\2\u00dc\2?\3\2\2\2\4D\3\2\2\2\6F\3\2\2\2\bL\3\2"+
		"\2\2\n]\3\2\2\2\fh\3\2\2\2\16y\3\2\2\2\20~\3\2\2\2\22\u0080\3\2\2\2\24"+
		"\u0083\3\2\2\2\26\u0088\3\2\2\2\30\u008c\3\2\2\2\32\u008e\3\2\2\2\34\u0091"+
		"\3\2\2\2\36\u0094\3\2\2\2 \u0097\3\2\2\2\"\u009a\3\2\2\2$\u009d\3\2\2"+
		"\2&\u00a0\3\2\2\2(\u00a3\3\2\2\2*\u00a6\3\2\2\2,\u00b9\3\2\2\2.\u00bd"+
		"\3\2\2\2\60\u00bf\3\2\2\2\62\u00c2\3\2\2\2\64\u00c9\3\2\2\2\66\u00ce\3"+
		"\2\2\28\u00d0\3\2\2\2:\u00d3\3\2\2\2<>\5\4\3\2=<\3\2\2\2>A\3\2\2\2?=\3"+
		"\2\2\2?@\3\2\2\2@\3\3\2\2\2A?\3\2\2\2BE\5\6\4\2CE\5\n\6\2DB\3\2\2\2DC"+
		"\3\2\2\2E\5\3\2\2\2FG\7\32\2\2GJ\7\37\2\2HK\5\b\5\2IK\5\f\7\2JH\3\2\2"+
		"\2JI\3\2\2\2K\7\3\2\2\2LY\7\3\2\2MO\5\16\b\2NM\3\2\2\2OR\3\2\2\2PN\3\2"+
		"\2\2PQ\3\2\2\2QZ\3\2\2\2RP\3\2\2\2SU\7!\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2"+
		"\2\2VW\3\2\2\2WZ\3\2\2\2XV\3\2\2\2YP\3\2\2\2YV\3\2\2\2Z[\3\2\2\2[\\\7"+
		"\4\2\2\\\t\3\2\2\2]^\7\5\2\2^a\7\6\2\2_b\5\b\5\2`b\7\32\2\2a_\3\2\2\2"+
		"a`\3\2\2\2bc\3\2\2\2cd\7\7\2\2d\13\3\2\2\2ef\b\7\1\2fi\5\b\5\2gi\7\32"+
		"\2\2he\3\2\2\2hg\3\2\2\2io\3\2\2\2jk\f\5\2\2kl\7\36\2\2ln\5\f\7\6mj\3"+
		"\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\r\3\2\2\2qo\3\2\2\2rz\5\20\t\2s"+
		"z\5\22\n\2tz\5\24\13\2uz\5\26\f\2vz\5\30\r\2wz\5\32\16\2xz\5\34\17\2y"+
		"r\3\2\2\2ys\3\2\2\2yt\3\2\2\2yu\3\2\2\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2"+
		"z\17\3\2\2\2{\177\5\36\20\2|\177\5 \21\2}\177\5\"\22\2~{\3\2\2\2~|\3\2"+
		"\2\2~}\3\2\2\2\177\21\3\2\2\2\u0080\u0081\7\b\2\2\u0081\u0082\5,\27\2"+
		"\u0082\23\3\2\2\2\u0083\u0084\7\t\2\2\u0084\u0085\5.\30\2\u0085\25\3\2"+
		"\2\2\u0086\u0089\5$\23\2\u0087\u0089\5&\24\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0087\3\2\2\2\u0089\27\3\2\2\2\u008a\u008d\5(\25\2\u008b\u008d\5*\26"+
		"\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\31\3\2\2\2\u008e\u008f"+
		"\7\n\2\2\u008f\u0090\5\60\31\2\u0090\33\3\2\2\2\u0091\u0092\7\13\2\2\u0092"+
		"\u0093\5\62\32\2\u0093\35\3\2\2\2\u0094\u0095\7\f\2\2\u0095\u0096\5\64"+
		"\33\2\u0096\37\3\2\2\2\u0097\u0098\7\r\2\2\u0098\u0099\5\64\33\2\u0099"+
		"!\3\2\2\2\u009a\u009b\7\16\2\2\u009b\u009c\5\64\33\2\u009c#\3\2\2\2\u009d"+
		"\u009e\7\17\2\2\u009e\u009f\7\26\2\2\u009f%\3\2\2\2\u00a0\u00a1\7\20\2"+
		"\2\u00a1\u00a2\7\26\2\2\u00a2\'\3\2\2\2\u00a3\u00a4\7\21\2\2\u00a4\u00a5"+
		"\5\66\34\2\u00a5)\3\2\2\2\u00a6\u00a7\7\22\2\2\u00a7\u00a8\58\35\2\u00a8"+
		"+\3\2\2\2\u00a9\u00ba\7\31\2\2\u00aa\u00ab\7\31\2\2\u00ab\u00ac\7!\2\2"+
		"\u00ac\u00ba\7\31\2\2\u00ad\u00ae\7\31\2\2\u00ae\u00ba\7!\2\2\u00af\u00b0"+
		"\7!\2\2\u00b0\u00ba\7\31\2\2\u00b1\u00b2\7!\2\2\u00b2\u00ba\7\24\2\2\u00b3"+
		"\u00b4\7\24\2\2\u00b4\u00ba\7!\2\2\u00b5\u00b6\7!\2\2\u00b6\u00ba\7\23"+
		"\2\2\u00b7\u00b8\7\23\2\2\u00b8\u00ba\7!\2\2\u00b9\u00a9\3\2\2\2\u00b9"+
		"\u00aa\3\2\2\2\u00b9\u00ad\3\2\2\2\u00b9\u00af\3\2\2\2\u00b9\u00b1\3\2"+
		"\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba"+
		"-\3\2\2\2\u00bb\u00be\5:\36\2\u00bc\u00be\7 \2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00bc\3\2\2\2\u00be/\3\2\2\2\u00bf\u00c0\7\27\2\2\u00c0\u00c1\7\25\2"+
		"\2\u00c1\61\3\2\2\2\u00c2\u00c3\7 \2\2\u00c3\63\3\2\2\2\u00c4\u00ca\5"+
		":\36\2\u00c5\u00ca\7\33\2\2\u00c6\u00ca\7 \2\2\u00c7\u00ca\7\32\2\2\u00c8"+
		"\u00ca\7!\2\2\u00c9\u00c4\3\2\2\2\u00c9\u00c5\3\2\2\2\u00c9\u00c6\3\2"+
		"\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\65\3\2\2\2\u00cb\u00cf"+
		"\5:\36\2\u00cc\u00cf\7\32\2\2\u00cd\u00cf\7 \2\2\u00ce\u00cb\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\67\3\2\2\2\u00d0\u00d1\t\2\2"+
		"\2\u00d19\3\2\2\2\u00d2\u00d4\7\32\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6;\3\2\2\2\24?DJ"+
		"PVYahoy~\u0088\u008c\u00b9\u00bd\u00c9\u00ce\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}