// Generated from CPP14.g4 by ANTLR 4.10.1

package grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CPP14Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Directive=1, Alignas=2, Alignof=3, Asm=4, Auto=5, Bool=6, Break=7, Case=8, 
		Catch=9, Char=10, Char16=11, Char32=12, Class=13, Const=14, Constexpr=15, 
		Const_cast=16, Continue=17, Decltype=18, Default=19, Delete=20, Do=21, 
		Double=22, Dynamic_cast=23, Else=24, Enum=25, Explicit=26, Export=27, 
		Extern=28, False=29, Final=30, Float=31, For=32, Friend=33, Goto=34, If=35, 
		Inline=36, Int=37, Long=38, Mutable=39, Namespace=40, New=41, Noexcept=42, 
		Nullptr=43, Operator=44, Override=45, Private=46, Protected=47, Public=48, 
		Register=49, Reinterpret_cast=50, Return=51, Short=52, Signed=53, Sizeof=54, 
		Static=55, Static_assert=56, Static_cast=57, Struct=58, Switch=59, Template=60, 
		This=61, Thread_local=62, Throw=63, True=64, Try=65, Typedef=66, Typeid=67, 
		Typename=68, Union=69, Unsigned=70, Using=71, Virtual=72, Void=73, Volatile=74, 
		Wchar=75, While=76, LeftParen=77, RightParen=78, LeftBracket=79, RightBracket=80, 
		LeftBrace=81, RightBrace=82, Plus=83, Minus=84, Star=85, Div=86, Mod=87, 
		Caret=88, And=89, Or=90, Tilde=91, Not=92, Assign=93, Less=94, Greater=95, 
		PlusAssign=96, MinusAssign=97, StarAssign=98, DivAssign=99, ModAssign=100, 
		XorAssign=101, AndAssign=102, OrAssign=103, LeftShift=104, LeftShiftAssign=105, 
		Equal=106, NotEqual=107, LessEqual=108, GreaterEqual=109, AndAnd=110, 
		OrOr=111, PlusPlus=112, MinusMinus=113, Comma=114, ArrowStar=115, Arrow=116, 
		Question=117, Colon=118, Doublecolon=119, Semi=120, Dot=121, DotStar=122, 
		Ellipsis=123, Identifier=124, Integerliteral=125, Decimalliteral=126, 
		Octalliteral=127, Hexadecimalliteral=128, Binaryliteral=129, Integersuffix=130, 
		Characterliteral=131, Floatingliteral=132, Stringliteral=133, Userdefinedintegerliteral=134, 
		Userdefinedfloatingliteral=135, Userdefinedstringliteral=136, Userdefinedcharacterliteral=137, 
		Whitespace=138, Newline=139, BlockComment=140, LineComment=141;
	public static final int
		RULE_translationunit = 0, RULE_primaryexpression = 1, RULE_idexpression = 2, 
		RULE_unqualifiedid = 3, RULE_qualifiedid = 4, RULE_nestednamespecifier = 5, 
		RULE_lambdaexpression = 6, RULE_lambdaintroducer = 7, RULE_lambdacapture = 8, 
		RULE_capturedefault = 9, RULE_capturelist = 10, RULE_capture = 11, RULE_simplecapture = 12, 
		RULE_initcapture = 13, RULE_lambdadeclarator = 14, RULE_postfixexpression = 15, 
		RULE_expressionlist = 16, RULE_pseudodestructorname = 17, RULE_unaryexpression = 18, 
		RULE_unaryoperator = 19, RULE_newexpression = 20, RULE_newplacement = 21, 
		RULE_newtypeid = 22, RULE_newdeclarator = 23, RULE_noptrnewdeclarator = 24, 
		RULE_newinitializer = 25, RULE_deleteexpression = 26, RULE_noexceptexpression = 27, 
		RULE_castexpression = 28, RULE_pmexpression = 29, RULE_multiplicativeexpression = 30, 
		RULE_additiveexpression = 31, RULE_shiftexpression = 32, RULE_relationalexpression = 33, 
		RULE_equalityexpression = 34, RULE_andexpression = 35, RULE_exclusiveorexpression = 36, 
		RULE_inclusiveorexpression = 37, RULE_logicalandexpression = 38, RULE_logicalorexpression = 39, 
		RULE_conditionalexpression = 40, RULE_assignmentexpression = 41, RULE_assignmentoperator = 42, 
		RULE_expression = 43, RULE_constantexpression = 44, RULE_statement = 45, 
		RULE_labeledstatement = 46, RULE_expressionstatement = 47, RULE_compoundstatement = 48, 
		RULE_statementseq = 49, RULE_selectionstatement = 50, RULE_condition = 51, 
		RULE_iterationstatement = 52, RULE_forinitstatement = 53, RULE_forrangedeclaration = 54, 
		RULE_forrangeinitializer = 55, RULE_jumpstatement = 56, RULE_declarationstatement = 57, 
		RULE_declarationseq = 58, RULE_declaration = 59, RULE_blockdeclaration = 60, 
		RULE_aliasdeclaration = 61, RULE_simpledeclaration = 62, RULE_static_assertdeclaration = 63, 
		RULE_emptydeclaration = 64, RULE_attributedeclaration = 65, RULE_declspecifier = 66, 
		RULE_declspecifierseq = 67, RULE_storageclassspecifier = 68, RULE_functionspecifier = 69, 
		RULE_typedefname = 70, RULE_typespecifier = 71, RULE_trailingtypespecifier = 72, 
		RULE_typespecifierseq = 73, RULE_trailingtypespecifierseq = 74, RULE_simpletypespecifier = 75, 
		RULE_typename = 76, RULE_decltypespecifier = 77, RULE_elaboratedtypespecifier = 78, 
		RULE_enumname = 79, RULE_enumspecifier = 80, RULE_enumhead = 81, RULE_opaqueenumdeclaration = 82, 
		RULE_enumkey = 83, RULE_enumbase = 84, RULE_enumeratorlist = 85, RULE_enumeratordefinition = 86, 
		RULE_enumerator = 87, RULE_namespacename = 88, RULE_originalnamespacename = 89, 
		RULE_namespacedefinition = 90, RULE_namednamespacedefinition = 91, RULE_originalnamespacedefinition = 92, 
		RULE_extensionnamespacedefinition = 93, RULE_unnamednamespacedefinition = 94, 
		RULE_namespacebody = 95, RULE_namespacealias = 96, RULE_namespacealiasdefinition = 97, 
		RULE_qualifiednamespacespecifier = 98, RULE_usingdeclaration = 99, RULE_usingdirective = 100, 
		RULE_asmdefinition = 101, RULE_linkagespecification = 102, RULE_attributespecifierseq = 103, 
		RULE_attributespecifier = 104, RULE_alignmentspecifier = 105, RULE_attributelist = 106, 
		RULE_attribute = 107, RULE_attributetoken = 108, RULE_attributescopedtoken = 109, 
		RULE_attributenamespace = 110, RULE_attributeargumentclause = 111, RULE_balancedtokenseq = 112, 
		RULE_balancedtoken = 113, RULE_initdeclaratorlist = 114, RULE_initdeclarator = 115, 
		RULE_declarator = 116, RULE_ptrdeclarator = 117, RULE_noptrdeclarator = 118, 
		RULE_parametersandqualifiers = 119, RULE_trailingreturntype = 120, RULE_ptroperator = 121, 
		RULE_cvqualifierseq = 122, RULE_cvqualifier = 123, RULE_refqualifier = 124, 
		RULE_declaratorid = 125, RULE_typeid = 126, RULE_abstractdeclarator = 127, 
		RULE_ptrabstractdeclarator = 128, RULE_noptrabstractdeclarator = 129, 
		RULE_abstractpackdeclarator = 130, RULE_noptrabstractpackdeclarator = 131, 
		RULE_parameterdeclarationclause = 132, RULE_parameterdeclarationlist = 133, 
		RULE_parameterdeclaration = 134, RULE_functiondefinition = 135, RULE_functionbody = 136, 
		RULE_initializer = 137, RULE_braceorequalinitializer = 138, RULE_initializerclause = 139, 
		RULE_initializerlist = 140, RULE_bracedinitlist = 141, RULE_classname = 142, 
		RULE_classspecifier = 143, RULE_classhead = 144, RULE_classheadname = 145, 
		RULE_classvirtspecifier = 146, RULE_classkey = 147, RULE_memberspecification = 148, 
		RULE_memberdeclaration = 149, RULE_memberdeclaratorlist = 150, RULE_memberdeclarator = 151, 
		RULE_virtspecifierseq = 152, RULE_virtspecifier = 153, RULE_purespecifier = 154, 
		RULE_baseclause = 155, RULE_basespecifierlist = 156, RULE_basespecifier = 157, 
		RULE_classordecltype = 158, RULE_basetypespecifier = 159, RULE_accessspecifier = 160, 
		RULE_conversionfunctionid = 161, RULE_conversiontypeid = 162, RULE_conversiondeclarator = 163, 
		RULE_ctorinitializer = 164, RULE_meminitializerlist = 165, RULE_meminitializer = 166, 
		RULE_meminitializerid = 167, RULE_operatorfunctionid = 168, RULE_literaloperatorid = 169, 
		RULE_templatedeclaration = 170, RULE_templateparameterlist = 171, RULE_templateparameter = 172, 
		RULE_typeparameter = 173, RULE_simpletemplateid = 174, RULE_templateid = 175, 
		RULE_templatename = 176, RULE_templateargumentlist = 177, RULE_templateargument = 178, 
		RULE_typenamespecifier = 179, RULE_explicitinstantiation = 180, RULE_explicitspecialization = 181, 
		RULE_tryblock = 182, RULE_functiontryblock = 183, RULE_handlerseq = 184, 
		RULE_handler = 185, RULE_exceptiondeclaration = 186, RULE_throwexpression = 187, 
		RULE_exceptionspecification = 188, RULE_dynamicexceptionspecification = 189, 
		RULE_typeidlist = 190, RULE_noexceptspecification = 191, RULE_rightShift = 192, 
		RULE_rightShiftAssign = 193, RULE_operator = 194, RULE_literal = 195, 
		RULE_booleanliteral = 196, RULE_pointerliteral = 197, RULE_userdefinedliteral = 198;
	private static String[] makeRuleNames() {
		return new String[] {
			"translationunit", "primaryexpression", "idexpression", "unqualifiedid", 
			"qualifiedid", "nestednamespecifier", "lambdaexpression", "lambdaintroducer", 
			"lambdacapture", "capturedefault", "capturelist", "capture", "simplecapture", 
			"initcapture", "lambdadeclarator", "postfixexpression", "expressionlist", 
			"pseudodestructorname", "unaryexpression", "unaryoperator", "newexpression", 
			"newplacement", "newtypeid", "newdeclarator", "noptrnewdeclarator", "newinitializer", 
			"deleteexpression", "noexceptexpression", "castexpression", "pmexpression", 
			"multiplicativeexpression", "additiveexpression", "shiftexpression", 
			"relationalexpression", "equalityexpression", "andexpression", "exclusiveorexpression", 
			"inclusiveorexpression", "logicalandexpression", "logicalorexpression", 
			"conditionalexpression", "assignmentexpression", "assignmentoperator", 
			"expression", "constantexpression", "statement", "labeledstatement", 
			"expressionstatement", "compoundstatement", "statementseq", "selectionstatement", 
			"condition", "iterationstatement", "forinitstatement", "forrangedeclaration", 
			"forrangeinitializer", "jumpstatement", "declarationstatement", "declarationseq", 
			"declaration", "blockdeclaration", "aliasdeclaration", "simpledeclaration", 
			"static_assertdeclaration", "emptydeclaration", "attributedeclaration", 
			"declspecifier", "declspecifierseq", "storageclassspecifier", "functionspecifier", 
			"typedefname", "typespecifier", "trailingtypespecifier", "typespecifierseq", 
			"trailingtypespecifierseq", "simpletypespecifier", "typename", "decltypespecifier", 
			"elaboratedtypespecifier", "enumname", "enumspecifier", "enumhead", "opaqueenumdeclaration", 
			"enumkey", "enumbase", "enumeratorlist", "enumeratordefinition", "enumerator", 
			"namespacename", "originalnamespacename", "namespacedefinition", "namednamespacedefinition", 
			"originalnamespacedefinition", "extensionnamespacedefinition", "unnamednamespacedefinition", 
			"namespacebody", "namespacealias", "namespacealiasdefinition", "qualifiednamespacespecifier", 
			"usingdeclaration", "usingdirective", "asmdefinition", "linkagespecification", 
			"attributespecifierseq", "attributespecifier", "alignmentspecifier", 
			"attributelist", "attribute", "attributetoken", "attributescopedtoken", 
			"attributenamespace", "attributeargumentclause", "balancedtokenseq", 
			"balancedtoken", "initdeclaratorlist", "initdeclarator", "declarator", 
			"ptrdeclarator", "noptrdeclarator", "parametersandqualifiers", "trailingreturntype", 
			"ptroperator", "cvqualifierseq", "cvqualifier", "refqualifier", "declaratorid", 
			"typeid", "abstractdeclarator", "ptrabstractdeclarator", "noptrabstractdeclarator", 
			"abstractpackdeclarator", "noptrabstractpackdeclarator", "parameterdeclarationclause", 
			"parameterdeclarationlist", "parameterdeclaration", "functiondefinition", 
			"functionbody", "initializer", "braceorequalinitializer", "initializerclause", 
			"initializerlist", "bracedinitlist", "classname", "classspecifier", "classhead", 
			"classheadname", "classvirtspecifier", "classkey", "memberspecification", 
			"memberdeclaration", "memberdeclaratorlist", "memberdeclarator", "virtspecifierseq", 
			"virtspecifier", "purespecifier", "baseclause", "basespecifierlist", 
			"basespecifier", "classordecltype", "basetypespecifier", "accessspecifier", 
			"conversionfunctionid", "conversiontypeid", "conversiondeclarator", "ctorinitializer", 
			"meminitializerlist", "meminitializer", "meminitializerid", "operatorfunctionid", 
			"literaloperatorid", "templatedeclaration", "templateparameterlist", 
			"templateparameter", "typeparameter", "simpletemplateid", "templateid", 
			"templatename", "templateargumentlist", "templateargument", "typenamespecifier", 
			"explicitinstantiation", "explicitspecialization", "tryblock", "functiontryblock", 
			"handlerseq", "handler", "exceptiondeclaration", "throwexpression", "exceptionspecification", 
			"dynamicexceptionspecification", "typeidlist", "noexceptspecification", 
			"rightShift", "rightShiftAssign", "operator", "literal", "booleanliteral", 
			"pointerliteral", "userdefinedliteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'alignas'", "'alignof'", "'asm'", "'auto'", "'bool'", "'break'", 
			"'case'", "'catch'", "'char'", "'char16_t'", "'char32_t'", "'class'", 
			"'const'", "'constexpr'", "'const_cast'", "'continue'", "'decltype'", 
			"'default'", "'delete'", "'do'", "'double'", "'dynamic_cast'", "'else'", 
			"'enum'", "'explicit'", "'export'", "'extern'", "'false'", "'final'", 
			"'float'", "'for'", "'friend'", "'goto'", "'if'", "'inline'", "'int'", 
			"'long'", "'mutable'", "'namespace'", "'new'", "'noexcept'", "'nullptr'", 
			"'operator'", "'override'", "'private'", "'protected'", "'public'", "'register'", 
			"'reinterpret_cast'", "'return'", "'short'", "'signed'", "'sizeof'", 
			"'static'", "'static_assert'", "'static_cast'", "'struct'", "'switch'", 
			"'template'", "'this'", "'thread_local'", "'throw'", "'true'", "'try'", 
			"'typedef'", "'typeid'", "'typename'", "'union'", "'unsigned'", "'using'", 
			"'virtual'", "'void'", "'volatile'", "'wchar_t'", "'while'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", 
			"'&'", "'|'", "'~'", "'!'", "'='", "'<'", "'>'", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'^='", "'&='", "'|='", "'<<'", "'<<='", "'=='", "'!='", 
			"'<='", "'>='", "'&&'", "'||'", "'++'", "'--'", "','", "'->*'", "'->'", 
			"'?'", "':'", "'::'", "';'", "'.'", "'.*'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Directive", "Alignas", "Alignof", "Asm", "Auto", "Bool", "Break", 
			"Case", "Catch", "Char", "Char16", "Char32", "Class", "Const", "Constexpr", 
			"Const_cast", "Continue", "Decltype", "Default", "Delete", "Do", "Double", 
			"Dynamic_cast", "Else", "Enum", "Explicit", "Export", "Extern", "False", 
			"Final", "Float", "For", "Friend", "Goto", "If", "Inline", "Int", "Long", 
			"Mutable", "Namespace", "New", "Noexcept", "Nullptr", "Operator", "Override", 
			"Private", "Protected", "Public", "Register", "Reinterpret_cast", "Return", 
			"Short", "Signed", "Sizeof", "Static", "Static_assert", "Static_cast", 
			"Struct", "Switch", "Template", "This", "Thread_local", "Throw", "True", 
			"Try", "Typedef", "Typeid", "Typename", "Union", "Unsigned", "Using", 
			"Virtual", "Void", "Volatile", "Wchar", "While", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Plus", "Minus", 
			"Star", "Div", "Mod", "Caret", "And", "Or", "Tilde", "Not", "Assign", 
			"Less", "Greater", "PlusAssign", "MinusAssign", "StarAssign", "DivAssign", 
			"ModAssign", "XorAssign", "AndAssign", "OrAssign", "LeftShift", "LeftShiftAssign", 
			"Equal", "NotEqual", "LessEqual", "GreaterEqual", "AndAnd", "OrOr", "PlusPlus", 
			"MinusMinus", "Comma", "ArrowStar", "Arrow", "Question", "Colon", "Doublecolon", 
			"Semi", "Dot", "DotStar", "Ellipsis", "Identifier", "Integerliteral", 
			"Decimalliteral", "Octalliteral", "Hexadecimalliteral", "Binaryliteral", 
			"Integersuffix", "Characterliteral", "Floatingliteral", "Stringliteral", 
			"Userdefinedintegerliteral", "Userdefinedfloatingliteral", "Userdefinedstringliteral", 
			"Userdefinedcharacterliteral", "Whitespace", "Newline", "BlockComment", 
			"LineComment"
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
	public String getGrammarFileName() { return "CPP14.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CPP14Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TranslationunitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CPP14Parser.EOF, 0); }
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public TranslationunitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationunit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTranslationunit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTranslationunit(this);
		}
	}

	public final TranslationunitContext translationunit() throws RecognitionException {
		TranslationunitContext _localctx = new TranslationunitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationunit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(398);
				declarationseq(0);
				}
			}

			setState(401);
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

	public static class PrimaryexpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode This() { return getToken(CPP14Parser.This, 0); }
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public LambdaexpressionContext lambdaexpression() {
			return getRuleContext(LambdaexpressionContext.class,0);
		}
		public PrimaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPrimaryexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPrimaryexpression(this);
		}
	}

	public final PrimaryexpressionContext primaryexpression() throws RecognitionException {
		PrimaryexpressionContext _localctx = new PrimaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primaryexpression);
		try {
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case False:
			case Nullptr:
			case True:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				literal();
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				match(This);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				match(LeftParen);
				setState(406);
				expression(0);
				setState(407);
				match(RightParen);
				}
				break;
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(409);
				idexpression();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(410);
				lambdaexpression();
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

	public static class IdexpressionContext extends ParserRuleContext {
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public QualifiedidContext qualifiedid() {
			return getRuleContext(QualifiedidContext.class,0);
		}
		public IdexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterIdexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitIdexpression(this);
		}
	}

	public final IdexpressionContext idexpression() throws RecognitionException {
		IdexpressionContext _localctx = new IdexpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_idexpression);
		try {
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				unqualifiedid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				qualifiedid();
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

	public static class UnqualifiedidContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public OperatorfunctionidContext operatorfunctionid() {
			return getRuleContext(OperatorfunctionidContext.class,0);
		}
		public ConversionfunctionidContext conversionfunctionid() {
			return getRuleContext(ConversionfunctionidContext.class,0);
		}
		public LiteraloperatoridContext literaloperatorid() {
			return getRuleContext(LiteraloperatoridContext.class,0);
		}
		public TerminalNode Tilde() { return getToken(CPP14Parser.Tilde, 0); }
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public TemplateidContext templateid() {
			return getRuleContext(TemplateidContext.class,0);
		}
		public UnqualifiedidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUnqualifiedid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUnqualifiedid(this);
		}
	}

	public final UnqualifiedidContext unqualifiedid() throws RecognitionException {
		UnqualifiedidContext _localctx = new UnqualifiedidContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unqualifiedid);
		try {
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				operatorfunctionid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
				conversionfunctionid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(420);
				literaloperatorid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(421);
				match(Tilde);
				setState(422);
				classname();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(423);
				match(Tilde);
				setState(424);
				decltypespecifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(425);
				templateid();
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

	public static class QualifiedidContext extends ParserRuleContext {
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public QualifiedidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterQualifiedid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitQualifiedid(this);
		}
	}

	public final QualifiedidContext qualifiedid() throws RecognitionException {
		QualifiedidContext _localctx = new QualifiedidContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_qualifiedid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			nestednamespecifier(0);
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Template) {
				{
				setState(429);
				match(Template);
				}
			}

			setState(432);
			unqualifiedid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestednamespecifierContext extends ParserRuleContext {
		public TerminalNode Doublecolon() { return getToken(CPP14Parser.Doublecolon, 0); }
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public NestednamespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestednamespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNestednamespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNestednamespecifier(this);
		}
	}

	public final NestednamespecifierContext nestednamespecifier() throws RecognitionException {
		return nestednamespecifier(0);
	}

	private NestednamespecifierContext nestednamespecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NestednamespecifierContext _localctx = new NestednamespecifierContext(_ctx, _parentState);
		NestednamespecifierContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_nestednamespecifier, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(435);
				match(Doublecolon);
				}
				break;
			case 2:
				{
				setState(436);
				typename();
				setState(437);
				match(Doublecolon);
				}
				break;
			case 3:
				{
				setState(439);
				namespacename();
				setState(440);
				match(Doublecolon);
				}
				break;
			case 4:
				{
				setState(442);
				decltypespecifier();
				setState(443);
				match(Doublecolon);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(459);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(457);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(447);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(448);
						match(Identifier);
						setState(449);
						match(Doublecolon);
						}
						break;
					case 2:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(450);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(452);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(451);
							match(Template);
							}
						}

						setState(454);
						simpletemplateid();
						setState(455);
						match(Doublecolon);
						}
						break;
					}
					} 
				}
				setState(461);
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

	public static class LambdaexpressionContext extends ParserRuleContext {
		public LambdaintroducerContext lambdaintroducer() {
			return getRuleContext(LambdaintroducerContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public LambdadeclaratorContext lambdadeclarator() {
			return getRuleContext(LambdadeclaratorContext.class,0);
		}
		public LambdaexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLambdaexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLambdaexpression(this);
		}
	}

	public final LambdaexpressionContext lambdaexpression() throws RecognitionException {
		LambdaexpressionContext _localctx = new LambdaexpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lambdaexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			lambdaintroducer();
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(463);
				lambdadeclarator();
				}
			}

			setState(466);
			compoundstatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaintroducerContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(CPP14Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPP14Parser.RightBracket, 0); }
		public LambdacaptureContext lambdacapture() {
			return getRuleContext(LambdacaptureContext.class,0);
		}
		public LambdaintroducerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaintroducer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLambdaintroducer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLambdaintroducer(this);
		}
	}

	public final LambdaintroducerContext lambdaintroducer() throws RecognitionException {
		LambdaintroducerContext _localctx = new LambdaintroducerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lambdaintroducer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(LeftBracket);
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (This - 61)) | (1L << (And - 61)) | (1L << (Assign - 61)) | (1L << (Identifier - 61)))) != 0)) {
				{
				setState(469);
				lambdacapture();
				}
			}

			setState(472);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdacaptureContext extends ParserRuleContext {
		public CapturedefaultContext capturedefault() {
			return getRuleContext(CapturedefaultContext.class,0);
		}
		public CapturelistContext capturelist() {
			return getRuleContext(CapturelistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public LambdacaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdacapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLambdacapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLambdacapture(this);
		}
	}

	public final LambdacaptureContext lambdacapture() throws RecognitionException {
		LambdacaptureContext _localctx = new LambdacaptureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lambdacapture);
		try {
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				capturedefault();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				capturelist(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(476);
				capturedefault();
				setState(477);
				match(Comma);
				setState(478);
				capturelist(0);
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

	public static class CapturedefaultContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(CPP14Parser.And, 0); }
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public CapturedefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capturedefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCapturedefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCapturedefault(this);
		}
	}

	public final CapturedefaultContext capturedefault() throws RecognitionException {
		CapturedefaultContext _localctx = new CapturedefaultContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_capturedefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			_la = _input.LA(1);
			if ( !(_la==And || _la==Assign) ) {
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

	public static class CapturelistContext extends ParserRuleContext {
		public CaptureContext capture() {
			return getRuleContext(CaptureContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(CPP14Parser.Ellipsis, 0); }
		public CapturelistContext capturelist() {
			return getRuleContext(CapturelistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public CapturelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capturelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCapturelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCapturelist(this);
		}
	}

	public final CapturelistContext capturelist() throws RecognitionException {
		return capturelist(0);
	}

	private CapturelistContext capturelist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CapturelistContext _localctx = new CapturelistContext(_ctx, _parentState);
		CapturelistContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_capturelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(485);
			capture();
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(486);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(497);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CapturelistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_capturelist);
					setState(489);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(490);
					match(Comma);
					setState(491);
					capture();
					setState(493);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(492);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(499);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class CaptureContext extends ParserRuleContext {
		public SimplecaptureContext simplecapture() {
			return getRuleContext(SimplecaptureContext.class,0);
		}
		public InitcaptureContext initcapture() {
			return getRuleContext(InitcaptureContext.class,0);
		}
		public CaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCapture(this);
		}
	}

	public final CaptureContext capture() throws RecognitionException {
		CaptureContext _localctx = new CaptureContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_capture);
		try {
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				simplecapture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				initcapture();
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

	public static class SimplecaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode And() { return getToken(CPP14Parser.And, 0); }
		public TerminalNode This() { return getToken(CPP14Parser.This, 0); }
		public SimplecaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplecapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterSimplecapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitSimplecapture(this);
		}
	}

	public final SimplecaptureContext simplecapture() throws RecognitionException {
		SimplecaptureContext _localctx = new SimplecaptureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simplecapture);
		try {
			setState(508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				match(Identifier);
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				match(And);
				setState(506);
				match(Identifier);
				}
				break;
			case This:
				enterOuterAlt(_localctx, 3);
				{
				setState(507);
				match(This);
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

	public static class InitcaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public TerminalNode And() { return getToken(CPP14Parser.And, 0); }
		public InitcaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initcapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitcapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitcapture(this);
		}
	}

	public final InitcaptureContext initcapture() throws RecognitionException {
		InitcaptureContext _localctx = new InitcaptureContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_initcapture);
		try {
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(510);
				match(Identifier);
				setState(511);
				initializer();
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				match(And);
				setState(513);
				match(Identifier);
				setState(514);
				initializer();
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

	public static class LambdadeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ParameterdeclarationclauseContext parameterdeclarationclause() {
			return getRuleContext(ParameterdeclarationclauseContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public TerminalNode Mutable() { return getToken(CPP14Parser.Mutable, 0); }
		public ExceptionspecificationContext exceptionspecification() {
			return getRuleContext(ExceptionspecificationContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public LambdadeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdadeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLambdadeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLambdadeclarator(this);
		}
	}

	public final LambdadeclaratorContext lambdadeclarator() throws RecognitionException {
		LambdadeclaratorContext _localctx = new LambdadeclaratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lambdadeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(LeftParen);
			setState(518);
			parameterdeclarationclause();
			setState(519);
			match(RightParen);
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Mutable) {
				{
				setState(520);
				match(Mutable);
				}
			}

			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Noexcept || _la==Throw) {
				{
				setState(523);
				exceptionspecification();
				}
			}

			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(526);
				attributespecifierseq(0);
				}
			}

			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
				setState(529);
				trailingreturntype();
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

	public static class PostfixexpressionContext extends ParserRuleContext {
		public PrimaryexpressionContext primaryexpression() {
			return getRuleContext(PrimaryexpressionContext.class,0);
		}
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public TypenamespecifierContext typenamespecifier() {
			return getRuleContext(TypenamespecifierContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public TerminalNode Dynamic_cast() { return getToken(CPP14Parser.Dynamic_cast, 0); }
		public TerminalNode Less() { return getToken(CPP14Parser.Less, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode Greater() { return getToken(CPP14Parser.Greater, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Static_cast() { return getToken(CPP14Parser.Static_cast, 0); }
		public TerminalNode Reinterpret_cast() { return getToken(CPP14Parser.Reinterpret_cast, 0); }
		public TerminalNode Const_cast() { return getToken(CPP14Parser.Const_cast, 0); }
		public TerminalNode Typeid() { return getToken(CPP14Parser.Typeid, 0); }
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CPP14Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPP14Parser.RightBracket, 0); }
		public TerminalNode Dot() { return getToken(CPP14Parser.Dot, 0); }
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TerminalNode Arrow() { return getToken(CPP14Parser.Arrow, 0); }
		public PseudodestructornameContext pseudodestructorname() {
			return getRuleContext(PseudodestructornameContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(CPP14Parser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(CPP14Parser.MinusMinus, 0); }
		public PostfixexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPostfixexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPostfixexpression(this);
		}
	}

	public final PostfixexpressionContext postfixexpression() throws RecognitionException {
		return postfixexpression(0);
	}

	private PostfixexpressionContext postfixexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixexpressionContext _localctx = new PostfixexpressionContext(_ctx, _parentState);
		PostfixexpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_postfixexpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(533);
				primaryexpression();
				}
				break;
			case 2:
				{
				setState(534);
				simpletypespecifier();
				setState(535);
				match(LeftParen);
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(536);
					expressionlist();
					}
				}

				setState(539);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(541);
				typenamespecifier();
				setState(542);
				match(LeftParen);
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(543);
					expressionlist();
					}
				}

				setState(546);
				match(RightParen);
				}
				break;
			case 4:
				{
				setState(548);
				simpletypespecifier();
				setState(549);
				bracedinitlist();
				}
				break;
			case 5:
				{
				setState(551);
				typenamespecifier();
				setState(552);
				bracedinitlist();
				}
				break;
			case 6:
				{
				setState(554);
				match(Dynamic_cast);
				setState(555);
				match(Less);
				setState(556);
				typeid();
				setState(557);
				match(Greater);
				setState(558);
				match(LeftParen);
				setState(559);
				expression(0);
				setState(560);
				match(RightParen);
				}
				break;
			case 7:
				{
				setState(562);
				match(Static_cast);
				setState(563);
				match(Less);
				setState(564);
				typeid();
				setState(565);
				match(Greater);
				setState(566);
				match(LeftParen);
				setState(567);
				expression(0);
				setState(568);
				match(RightParen);
				}
				break;
			case 8:
				{
				setState(570);
				match(Reinterpret_cast);
				setState(571);
				match(Less);
				setState(572);
				typeid();
				setState(573);
				match(Greater);
				setState(574);
				match(LeftParen);
				setState(575);
				expression(0);
				setState(576);
				match(RightParen);
				}
				break;
			case 9:
				{
				setState(578);
				match(Const_cast);
				setState(579);
				match(Less);
				setState(580);
				typeid();
				setState(581);
				match(Greater);
				setState(582);
				match(LeftParen);
				setState(583);
				expression(0);
				setState(584);
				match(RightParen);
				}
				break;
			case 10:
				{
				setState(586);
				match(Typeid);
				setState(587);
				match(LeftParen);
				setState(588);
				expression(0);
				setState(589);
				match(RightParen);
				}
				break;
			case 11:
				{
				setState(591);
				match(Typeid);
				setState(592);
				match(LeftParen);
				setState(593);
				typeid();
				setState(594);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(638);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(636);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(598);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(599);
						match(LeftBracket);
						setState(600);
						expression(0);
						setState(601);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(603);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(604);
						match(LeftBracket);
						setState(605);
						bracedinitlist();
						setState(606);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(608);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(609);
						match(LeftParen);
						setState(611);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
							{
							setState(610);
							expressionlist();
							}
						}

						setState(613);
						match(RightParen);
						}
						break;
					case 4:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(614);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(615);
						match(Dot);
						setState(617);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(616);
							match(Template);
							}
						}

						setState(619);
						idexpression();
						}
						break;
					case 5:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(620);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(621);
						match(Arrow);
						setState(623);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(622);
							match(Template);
							}
						}

						setState(625);
						idexpression();
						}
						break;
					case 6:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(626);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(627);
						match(Dot);
						setState(628);
						pseudodestructorname();
						}
						break;
					case 7:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(629);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(630);
						match(Arrow);
						setState(631);
						pseudodestructorname();
						}
						break;
					case 8:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(632);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(633);
						match(PlusPlus);
						}
						break;
					case 9:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(634);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(635);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(640);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class ExpressionlistContext extends ParserRuleContext {
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public ExpressionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExpressionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExpressionlist(this);
		}
	}

	public final ExpressionlistContext expressionlist() throws RecognitionException {
		ExpressionlistContext _localctx = new ExpressionlistContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expressionlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			initializerlist(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PseudodestructornameContext extends ParserRuleContext {
		public List<TypenameContext> typename() {
			return getRuleContexts(TypenameContext.class);
		}
		public TypenameContext typename(int i) {
			return getRuleContext(TypenameContext.class,i);
		}
		public TerminalNode Doublecolon() { return getToken(CPP14Parser.Doublecolon, 0); }
		public TerminalNode Tilde() { return getToken(CPP14Parser.Tilde, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public PseudodestructornameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudodestructorname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPseudodestructorname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPseudodestructorname(this);
		}
	}

	public final PseudodestructornameContext pseudodestructorname() throws RecognitionException {
		PseudodestructornameContext _localctx = new PseudodestructornameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pseudodestructorname);
		int _la;
		try {
			setState(665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(644);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(643);
					nestednamespecifier(0);
					}
					break;
				}
				setState(646);
				typename();
				setState(647);
				match(Doublecolon);
				setState(648);
				match(Tilde);
				setState(649);
				typename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				nestednamespecifier(0);
				setState(652);
				match(Template);
				setState(653);
				simpletemplateid();
				setState(654);
				match(Doublecolon);
				setState(655);
				match(Tilde);
				setState(656);
				typename();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(658);
					nestednamespecifier(0);
					}
				}

				setState(661);
				match(Tilde);
				setState(662);
				typename();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(663);
				match(Tilde);
				setState(664);
				decltypespecifier();
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

	public static class UnaryexpressionContext extends ParserRuleContext {
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(CPP14Parser.PlusPlus, 0); }
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public TerminalNode MinusMinus() { return getToken(CPP14Parser.MinusMinus, 0); }
		public UnaryoperatorContext unaryoperator() {
			return getRuleContext(UnaryoperatorContext.class,0);
		}
		public TerminalNode Sizeof() { return getToken(CPP14Parser.Sizeof, 0); }
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public TerminalNode Ellipsis() { return getToken(CPP14Parser.Ellipsis, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Alignof() { return getToken(CPP14Parser.Alignof, 0); }
		public NoexceptexpressionContext noexceptexpression() {
			return getRuleContext(NoexceptexpressionContext.class,0);
		}
		public NewexpressionContext newexpression() {
			return getRuleContext(NewexpressionContext.class,0);
		}
		public DeleteexpressionContext deleteexpression() {
			return getRuleContext(DeleteexpressionContext.class,0);
		}
		public UnaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUnaryexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUnaryexpression(this);
		}
	}

	public final UnaryexpressionContext unaryexpression() throws RecognitionException {
		UnaryexpressionContext _localctx = new UnaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_unaryexpression);
		try {
			setState(695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(667);
				postfixexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(668);
				match(PlusPlus);
				setState(669);
				castexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(670);
				match(MinusMinus);
				setState(671);
				castexpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(672);
				unaryoperator();
				setState(673);
				castexpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(675);
				match(Sizeof);
				setState(676);
				unaryexpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(677);
				match(Sizeof);
				setState(678);
				match(LeftParen);
				setState(679);
				typeid();
				setState(680);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(682);
				match(Sizeof);
				setState(683);
				match(Ellipsis);
				setState(684);
				match(LeftParen);
				setState(685);
				match(Identifier);
				setState(686);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(687);
				match(Alignof);
				setState(688);
				match(LeftParen);
				setState(689);
				typeid();
				setState(690);
				match(RightParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(692);
				noexceptexpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(693);
				newexpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(694);
				deleteexpression();
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

	public static class UnaryoperatorContext extends ParserRuleContext {
		public TerminalNode Or() { return getToken(CPP14Parser.Or, 0); }
		public TerminalNode Star() { return getToken(CPP14Parser.Star, 0); }
		public TerminalNode And() { return getToken(CPP14Parser.And, 0); }
		public TerminalNode Plus() { return getToken(CPP14Parser.Plus, 0); }
		public TerminalNode Not() { return getToken(CPP14Parser.Not, 0); }
		public TerminalNode Tilde() { return getToken(CPP14Parser.Tilde, 0); }
		public UnaryoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUnaryoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUnaryoperator(this);
		}
	}

	public final UnaryoperatorContext unaryoperator() throws RecognitionException {
		UnaryoperatorContext _localctx = new UnaryoperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unaryoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			_la = _input.LA(1);
			if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (Plus - 83)) | (1L << (Star - 83)) | (1L << (And - 83)) | (1L << (Or - 83)) | (1L << (Tilde - 83)) | (1L << (Not - 83)))) != 0)) ) {
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

	public static class NewexpressionContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(CPP14Parser.New, 0); }
		public NewtypeidContext newtypeid() {
			return getRuleContext(NewtypeidContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(CPP14Parser.Doublecolon, 0); }
		public NewplacementContext newplacement() {
			return getRuleContext(NewplacementContext.class,0);
		}
		public NewinitializerContext newinitializer() {
			return getRuleContext(NewinitializerContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public NewexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNewexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNewexpression(this);
		}
	}

	public final NewexpressionContext newexpression() throws RecognitionException {
		NewexpressionContext _localctx = new NewexpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_newexpression);
		int _la;
		try {
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(699);
					match(Doublecolon);
					}
				}

				setState(702);
				match(New);
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(703);
					newplacement();
					}
				}

				setState(706);
				newtypeid();
				setState(708);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(707);
					newinitializer();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(710);
					match(Doublecolon);
					}
				}

				setState(713);
				match(New);
				setState(715);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(714);
					newplacement();
					}
					break;
				}
				setState(717);
				match(LeftParen);
				setState(718);
				typeid();
				setState(719);
				match(RightParen);
				setState(721);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(720);
					newinitializer();
					}
					break;
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

	public static class NewplacementContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public NewplacementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newplacement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNewplacement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNewplacement(this);
		}
	}

	public final NewplacementContext newplacement() throws RecognitionException {
		NewplacementContext _localctx = new NewplacementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_newplacement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			match(LeftParen);
			setState(726);
			expressionlist();
			setState(727);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewtypeidContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public NewdeclaratorContext newdeclarator() {
			return getRuleContext(NewdeclaratorContext.class,0);
		}
		public NewtypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newtypeid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNewtypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNewtypeid(this);
		}
	}

	public final NewtypeidContext newtypeid() throws RecognitionException {
		NewtypeidContext _localctx = new NewtypeidContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_newtypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			typespecifierseq();
			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(730);
				newdeclarator();
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

	public static class NewdeclaratorContext extends ParserRuleContext {
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public NewdeclaratorContext newdeclarator() {
			return getRuleContext(NewdeclaratorContext.class,0);
		}
		public NoptrnewdeclaratorContext noptrnewdeclarator() {
			return getRuleContext(NoptrnewdeclaratorContext.class,0);
		}
		public NewdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNewdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNewdeclarator(this);
		}
	}

	public final NewdeclaratorContext newdeclarator() throws RecognitionException {
		NewdeclaratorContext _localctx = new NewdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_newdeclarator);
		try {
			setState(738);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decltype:
			case Star:
			case And:
			case AndAnd:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(733);
				ptroperator();
				setState(735);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(734);
					newdeclarator();
					}
					break;
				}
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(737);
				noptrnewdeclarator(0);
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

	public static class NoptrnewdeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(CPP14Parser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(CPP14Parser.RightBracket, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NoptrnewdeclaratorContext noptrnewdeclarator() {
			return getRuleContext(NoptrnewdeclaratorContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoptrnewdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrnewdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoptrnewdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoptrnewdeclarator(this);
		}
	}

	public final NoptrnewdeclaratorContext noptrnewdeclarator() throws RecognitionException {
		return noptrnewdeclarator(0);
	}

	private NoptrnewdeclaratorContext noptrnewdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrnewdeclaratorContext _localctx = new NoptrnewdeclaratorContext(_ctx, _parentState);
		NoptrnewdeclaratorContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_noptrnewdeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(741);
			match(LeftBracket);
			setState(742);
			expression(0);
			setState(743);
			match(RightBracket);
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(744);
				attributespecifierseq(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(756);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoptrnewdeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noptrnewdeclarator);
					setState(747);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(748);
					match(LeftBracket);
					setState(749);
					constantexpression();
					setState(750);
					match(RightBracket);
					setState(752);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(751);
						attributespecifierseq(0);
						}
						break;
					}
					}
					} 
				}
				setState(758);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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

	public static class NewinitializerContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public NewinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNewinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNewinitializer(this);
		}
	}

	public final NewinitializerContext newinitializer() throws RecognitionException {
		NewinitializerContext _localctx = new NewinitializerContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_newinitializer);
		int _la;
		try {
			setState(765);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(759);
				match(LeftParen);
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(760);
					expressionlist();
					}
				}

				setState(763);
				match(RightParen);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				bracedinitlist();
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

	public static class DeleteexpressionContext extends ParserRuleContext {
		public TerminalNode Delete() { return getToken(CPP14Parser.Delete, 0); }
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(CPP14Parser.Doublecolon, 0); }
		public TerminalNode LeftBracket() { return getToken(CPP14Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPP14Parser.RightBracket, 0); }
		public DeleteexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeleteexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeleteexpression(this);
		}
	}

	public final DeleteexpressionContext deleteexpression() throws RecognitionException {
		DeleteexpressionContext _localctx = new DeleteexpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_deleteexpression);
		int _la;
		try {
			setState(779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(767);
					match(Doublecolon);
					}
				}

				setState(770);
				match(Delete);
				setState(771);
				castexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(772);
					match(Doublecolon);
					}
				}

				setState(775);
				match(Delete);
				setState(776);
				match(LeftBracket);
				setState(777);
				match(RightBracket);
				setState(778);
				castexpression();
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

	public static class NoexceptexpressionContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(CPP14Parser.Noexcept, 0); }
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public NoexceptexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noexceptexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoexceptexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoexceptexpression(this);
		}
	}

	public final NoexceptexpressionContext noexceptexpression() throws RecognitionException {
		NoexceptexpressionContext _localctx = new NoexceptexpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_noexceptexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			match(Noexcept);
			setState(782);
			match(LeftParen);
			setState(783);
			expression(0);
			setState(784);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastexpressionContext extends ParserRuleContext {
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public CastexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCastexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCastexpression(this);
		}
	}

	public final CastexpressionContext castexpression() throws RecognitionException {
		CastexpressionContext _localctx = new CastexpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_castexpression);
		try {
			setState(792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(786);
				unaryexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
				match(LeftParen);
				setState(788);
				typeid();
				setState(789);
				match(RightParen);
				setState(790);
				castexpression();
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

	public static class PmexpressionContext extends ParserRuleContext {
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public PmexpressionContext pmexpression() {
			return getRuleContext(PmexpressionContext.class,0);
		}
		public TerminalNode DotStar() { return getToken(CPP14Parser.DotStar, 0); }
		public TerminalNode ArrowStar() { return getToken(CPP14Parser.ArrowStar, 0); }
		public PmexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pmexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPmexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPmexpression(this);
		}
	}

	public final PmexpressionContext pmexpression() throws RecognitionException {
		return pmexpression(0);
	}

	private PmexpressionContext pmexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PmexpressionContext _localctx = new PmexpressionContext(_ctx, _parentState);
		PmexpressionContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_pmexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(795);
			castexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(805);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(803);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(797);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(798);
						match(DotStar);
						setState(799);
						castexpression();
						}
						break;
					case 2:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(800);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(801);
						match(ArrowStar);
						setState(802);
						castexpression();
						}
						break;
					}
					} 
				}
				setState(807);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	public static class MultiplicativeexpressionContext extends ParserRuleContext {
		public PmexpressionContext pmexpression() {
			return getRuleContext(PmexpressionContext.class,0);
		}
		public MultiplicativeexpressionContext multiplicativeexpression() {
			return getRuleContext(MultiplicativeexpressionContext.class,0);
		}
		public TerminalNode Star() { return getToken(CPP14Parser.Star, 0); }
		public TerminalNode Div() { return getToken(CPP14Parser.Div, 0); }
		public TerminalNode Mod() { return getToken(CPP14Parser.Mod, 0); }
		public MultiplicativeexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMultiplicativeexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMultiplicativeexpression(this);
		}
	}

	public final MultiplicativeexpressionContext multiplicativeexpression() throws RecognitionException {
		return multiplicativeexpression(0);
	}

	private MultiplicativeexpressionContext multiplicativeexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeexpressionContext _localctx = new MultiplicativeexpressionContext(_ctx, _parentState);
		MultiplicativeexpressionContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_multiplicativeexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(809);
			pmexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(822);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(820);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(811);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(812);
						match(Star);
						setState(813);
						pmexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(814);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(815);
						match(Div);
						setState(816);
						pmexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(817);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(818);
						match(Mod);
						setState(819);
						pmexpression(0);
						}
						break;
					}
					} 
				}
				setState(824);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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

	public static class AdditiveexpressionContext extends ParserRuleContext {
		public MultiplicativeexpressionContext multiplicativeexpression() {
			return getRuleContext(MultiplicativeexpressionContext.class,0);
		}
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public TerminalNode Plus() { return getToken(CPP14Parser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CPP14Parser.Minus, 0); }
		public AdditiveexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAdditiveexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAdditiveexpression(this);
		}
	}

	public final AdditiveexpressionContext additiveexpression() throws RecognitionException {
		return additiveexpression(0);
	}

	private AdditiveexpressionContext additiveexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveexpressionContext _localctx = new AdditiveexpressionContext(_ctx, _parentState);
		AdditiveexpressionContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_additiveexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(826);
			multiplicativeexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(836);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(834);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(828);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(829);
						match(Plus);
						setState(830);
						multiplicativeexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(831);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(832);
						match(Minus);
						setState(833);
						multiplicativeexpression(0);
						}
						break;
					}
					} 
				}
				setState(838);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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

	public static class ShiftexpressionContext extends ParserRuleContext {
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public ShiftexpressionContext shiftexpression() {
			return getRuleContext(ShiftexpressionContext.class,0);
		}
		public TerminalNode LeftShift() { return getToken(CPP14Parser.LeftShift, 0); }
		public RightShiftContext rightShift() {
			return getRuleContext(RightShiftContext.class,0);
		}
		public ShiftexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterShiftexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitShiftexpression(this);
		}
	}

	public final ShiftexpressionContext shiftexpression() throws RecognitionException {
		return shiftexpression(0);
	}

	private ShiftexpressionContext shiftexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftexpressionContext _localctx = new ShiftexpressionContext(_ctx, _parentState);
		ShiftexpressionContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_shiftexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(840);
			additiveexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(851);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(849);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftexpression);
						setState(842);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(843);
						match(LeftShift);
						setState(844);
						additiveexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftexpression);
						setState(845);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(846);
						rightShift();
						setState(847);
						additiveexpression(0);
						}
						break;
					}
					} 
				}
				setState(853);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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

	public static class RelationalexpressionContext extends ParserRuleContext {
		public ShiftexpressionContext shiftexpression() {
			return getRuleContext(ShiftexpressionContext.class,0);
		}
		public RelationalexpressionContext relationalexpression() {
			return getRuleContext(RelationalexpressionContext.class,0);
		}
		public TerminalNode Less() { return getToken(CPP14Parser.Less, 0); }
		public TerminalNode Greater() { return getToken(CPP14Parser.Greater, 0); }
		public TerminalNode LessEqual() { return getToken(CPP14Parser.LessEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(CPP14Parser.GreaterEqual, 0); }
		public RelationalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterRelationalexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitRelationalexpression(this);
		}
	}

	public final RelationalexpressionContext relationalexpression() throws RecognitionException {
		return relationalexpression(0);
	}

	private RelationalexpressionContext relationalexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalexpressionContext _localctx = new RelationalexpressionContext(_ctx, _parentState);
		RelationalexpressionContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_relationalexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(855);
			shiftexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(871);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(869);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(857);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(858);
						match(Less);
						setState(859);
						shiftexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(860);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(861);
						match(Greater);
						setState(862);
						shiftexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(863);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(864);
						match(LessEqual);
						setState(865);
						shiftexpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(866);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(867);
						match(GreaterEqual);
						setState(868);
						shiftexpression(0);
						}
						break;
					}
					} 
				}
				setState(873);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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

	public static class EqualityexpressionContext extends ParserRuleContext {
		public RelationalexpressionContext relationalexpression() {
			return getRuleContext(RelationalexpressionContext.class,0);
		}
		public EqualityexpressionContext equalityexpression() {
			return getRuleContext(EqualityexpressionContext.class,0);
		}
		public TerminalNode Equal() { return getToken(CPP14Parser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(CPP14Parser.NotEqual, 0); }
		public EqualityexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEqualityexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEqualityexpression(this);
		}
	}

	public final EqualityexpressionContext equalityexpression() throws RecognitionException {
		return equalityexpression(0);
	}

	private EqualityexpressionContext equalityexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityexpressionContext _localctx = new EqualityexpressionContext(_ctx, _parentState);
		EqualityexpressionContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_equalityexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(875);
			relationalexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(885);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(883);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(877);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(878);
						match(Equal);
						setState(879);
						relationalexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(880);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(881);
						match(NotEqual);
						setState(882);
						relationalexpression(0);
						}
						break;
					}
					} 
				}
				setState(887);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndexpressionContext extends ParserRuleContext {
		public EqualityexpressionContext equalityexpression() {
			return getRuleContext(EqualityexpressionContext.class,0);
		}
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public TerminalNode And() { return getToken(CPP14Parser.And, 0); }
		public AndexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAndexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAndexpression(this);
		}
	}

	public final AndexpressionContext andexpression() throws RecognitionException {
		return andexpression(0);
	}

	private AndexpressionContext andexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndexpressionContext _localctx = new AndexpressionContext(_ctx, _parentState);
		AndexpressionContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_andexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(889);
			equalityexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(896);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andexpression);
					setState(891);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(892);
					match(And);
					setState(893);
					equalityexpression(0);
					}
					} 
				}
				setState(898);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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

	public static class ExclusiveorexpressionContext extends ParserRuleContext {
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public ExclusiveorexpressionContext exclusiveorexpression() {
			return getRuleContext(ExclusiveorexpressionContext.class,0);
		}
		public TerminalNode Caret() { return getToken(CPP14Parser.Caret, 0); }
		public ExclusiveorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExclusiveorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExclusiveorexpression(this);
		}
	}

	public final ExclusiveorexpressionContext exclusiveorexpression() throws RecognitionException {
		return exclusiveorexpression(0);
	}

	private ExclusiveorexpressionContext exclusiveorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveorexpressionContext _localctx = new ExclusiveorexpressionContext(_ctx, _parentState);
		ExclusiveorexpressionContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_exclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(900);
			andexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(907);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveorexpression);
					setState(902);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(903);
					match(Caret);
					setState(904);
					andexpression(0);
					}
					} 
				}
				setState(909);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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

	public static class InclusiveorexpressionContext extends ParserRuleContext {
		public ExclusiveorexpressionContext exclusiveorexpression() {
			return getRuleContext(ExclusiveorexpressionContext.class,0);
		}
		public InclusiveorexpressionContext inclusiveorexpression() {
			return getRuleContext(InclusiveorexpressionContext.class,0);
		}
		public TerminalNode Or() { return getToken(CPP14Parser.Or, 0); }
		public InclusiveorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInclusiveorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInclusiveorexpression(this);
		}
	}

	public final InclusiveorexpressionContext inclusiveorexpression() throws RecognitionException {
		return inclusiveorexpression(0);
	}

	private InclusiveorexpressionContext inclusiveorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveorexpressionContext _localctx = new InclusiveorexpressionContext(_ctx, _parentState);
		InclusiveorexpressionContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_inclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(911);
			exclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(918);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveorexpression);
					setState(913);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(914);
					match(Or);
					setState(915);
					exclusiveorexpression(0);
					}
					} 
				}
				setState(920);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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

	public static class LogicalandexpressionContext extends ParserRuleContext {
		public InclusiveorexpressionContext inclusiveorexpression() {
			return getRuleContext(InclusiveorexpressionContext.class,0);
		}
		public LogicalandexpressionContext logicalandexpression() {
			return getRuleContext(LogicalandexpressionContext.class,0);
		}
		public TerminalNode AndAnd() { return getToken(CPP14Parser.AndAnd, 0); }
		public LogicalandexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalandexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLogicalandexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLogicalandexpression(this);
		}
	}

	public final LogicalandexpressionContext logicalandexpression() throws RecognitionException {
		return logicalandexpression(0);
	}

	private LogicalandexpressionContext logicalandexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalandexpressionContext _localctx = new LogicalandexpressionContext(_ctx, _parentState);
		LogicalandexpressionContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_logicalandexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(922);
			inclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(929);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
					setState(924);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(925);
					match(AndAnd);
					setState(926);
					inclusiveorexpression(0);
					}
					} 
				}
				setState(931);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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

	public static class LogicalorexpressionContext extends ParserRuleContext {
		public LogicalandexpressionContext logicalandexpression() {
			return getRuleContext(LogicalandexpressionContext.class,0);
		}
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public TerminalNode OrOr() { return getToken(CPP14Parser.OrOr, 0); }
		public LogicalorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLogicalorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLogicalorexpression(this);
		}
	}

	public final LogicalorexpressionContext logicalorexpression() throws RecognitionException {
		return logicalorexpression(0);
	}

	private LogicalorexpressionContext logicalorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalorexpressionContext _localctx = new LogicalorexpressionContext(_ctx, _parentState);
		LogicalorexpressionContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_logicalorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(933);
			logicalandexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(940);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
					setState(935);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(936);
					match(OrOr);
					setState(937);
					logicalandexpression(0);
					}
					} 
				}
				setState(942);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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

	public static class ConditionalexpressionContext extends ParserRuleContext {
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public TerminalNode Question() { return getToken(CPP14Parser.Question, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CPP14Parser.Colon, 0); }
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ConditionalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterConditionalexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitConditionalexpression(this);
		}
	}

	public final ConditionalexpressionContext conditionalexpression() throws RecognitionException {
		ConditionalexpressionContext _localctx = new ConditionalexpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_conditionalexpression);
		try {
			setState(950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(943);
				logicalorexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(944);
				logicalorexpression(0);
				setState(945);
				match(Question);
				setState(946);
				expression(0);
				setState(947);
				match(Colon);
				setState(948);
				assignmentexpression();
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

	public static class AssignmentexpressionContext extends ParserRuleContext {
		public ConditionalexpressionContext conditionalexpression() {
			return getRuleContext(ConditionalexpressionContext.class,0);
		}
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public AssignmentoperatorContext assignmentoperator() {
			return getRuleContext(AssignmentoperatorContext.class,0);
		}
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public ThrowexpressionContext throwexpression() {
			return getRuleContext(ThrowexpressionContext.class,0);
		}
		public AssignmentexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAssignmentexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAssignmentexpression(this);
		}
	}

	public final AssignmentexpressionContext assignmentexpression() throws RecognitionException {
		AssignmentexpressionContext _localctx = new AssignmentexpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_assignmentexpression);
		try {
			setState(958);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(952);
				conditionalexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(953);
				logicalorexpression(0);
				setState(954);
				assignmentoperator();
				setState(955);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(957);
				throwexpression();
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

	public static class AssignmentoperatorContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(CPP14Parser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(CPP14Parser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(CPP14Parser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(CPP14Parser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(CPP14Parser.MinusAssign, 0); }
		public RightShiftAssignContext rightShiftAssign() {
			return getRuleContext(RightShiftAssignContext.class,0);
		}
		public TerminalNode LeftShiftAssign() { return getToken(CPP14Parser.LeftShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(CPP14Parser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(CPP14Parser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(CPP14Parser.OrAssign, 0); }
		public AssignmentoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAssignmentoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAssignmentoperator(this);
		}
	}

	public final AssignmentoperatorContext assignmentoperator() throws RecognitionException {
		AssignmentoperatorContext _localctx = new AssignmentoperatorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_assignmentoperator);
		try {
			setState(971);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(960);
				match(Assign);
				}
				break;
			case StarAssign:
				enterOuterAlt(_localctx, 2);
				{
				setState(961);
				match(StarAssign);
				}
				break;
			case DivAssign:
				enterOuterAlt(_localctx, 3);
				{
				setState(962);
				match(DivAssign);
				}
				break;
			case ModAssign:
				enterOuterAlt(_localctx, 4);
				{
				setState(963);
				match(ModAssign);
				}
				break;
			case PlusAssign:
				enterOuterAlt(_localctx, 5);
				{
				setState(964);
				match(PlusAssign);
				}
				break;
			case MinusAssign:
				enterOuterAlt(_localctx, 6);
				{
				setState(965);
				match(MinusAssign);
				}
				break;
			case Greater:
				enterOuterAlt(_localctx, 7);
				{
				setState(966);
				rightShiftAssign();
				}
				break;
			case LeftShiftAssign:
				enterOuterAlt(_localctx, 8);
				{
				setState(967);
				match(LeftShiftAssign);
				}
				break;
			case AndAssign:
				enterOuterAlt(_localctx, 9);
				{
				setState(968);
				match(AndAssign);
				}
				break;
			case XorAssign:
				enterOuterAlt(_localctx, 10);
				{
				setState(969);
				match(XorAssign);
				}
				break;
			case OrAssign:
				enterOuterAlt(_localctx, 11);
				{
				setState(970);
				match(OrAssign);
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

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExpression(this);
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(974);
			assignmentexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(981);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(976);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(977);
					match(Comma);
					setState(978);
					assignmentexpression();
					}
					} 
				}
				setState(983);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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

	public static class ConstantexpressionContext extends ParserRuleContext {
		public ConditionalexpressionContext conditionalexpression() {
			return getRuleContext(ConditionalexpressionContext.class,0);
		}
		public ConstantexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterConstantexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitConstantexpression(this);
		}
	}

	public final ConstantexpressionContext constantexpression() throws RecognitionException {
		ConstantexpressionContext _localctx = new ConstantexpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_constantexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			conditionalexpression();
			}
		}
		catch (RecognitionException re) {
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
		public LabeledstatementContext labeledstatement() {
			return getRuleContext(LabeledstatementContext.class,0);
		}
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public SelectionstatementContext selectionstatement() {
			return getRuleContext(SelectionstatementContext.class,0);
		}
		public IterationstatementContext iterationstatement() {
			return getRuleContext(IterationstatementContext.class,0);
		}
		public JumpstatementContext jumpstatement() {
			return getRuleContext(JumpstatementContext.class,0);
		}
		public DeclarationstatementContext declarationstatement() {
			return getRuleContext(DeclarationstatementContext.class,0);
		}
		public TryblockContext tryblock() {
			return getRuleContext(TryblockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_statement);
		int _la;
		try {
			setState(1012);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(986);
				labeledstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(988);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(987);
					attributespecifierseq(0);
					}
					break;
				}
				setState(990);
				expressionstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(992);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(991);
					attributespecifierseq(0);
					}
				}

				setState(994);
				compoundstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(995);
					attributespecifierseq(0);
					}
				}

				setState(998);
				selectionstatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(999);
					attributespecifierseq(0);
					}
				}

				setState(1002);
				iterationstatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1004);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1003);
					attributespecifierseq(0);
					}
				}

				setState(1006);
				jumpstatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1007);
				declarationstatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1008);
					attributespecifierseq(0);
					}
				}

				setState(1011);
				tryblock();
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

	public static class LabeledstatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(CPP14Parser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Case() { return getToken(CPP14Parser.Case, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(CPP14Parser.Default, 0); }
		public LabeledstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLabeledstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLabeledstatement(this);
		}
	}

	public final LabeledstatementContext labeledstatement() throws RecognitionException {
		LabeledstatementContext _localctx = new LabeledstatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_labeledstatement);
		int _la;
		try {
			setState(1034);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1015);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1014);
					attributespecifierseq(0);
					}
				}

				setState(1017);
				match(Identifier);
				setState(1018);
				match(Colon);
				setState(1019);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1020);
					attributespecifierseq(0);
					}
				}

				setState(1023);
				match(Case);
				setState(1024);
				constantexpression();
				setState(1025);
				match(Colon);
				setState(1026);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1028);
					attributespecifierseq(0);
					}
				}

				setState(1031);
				match(Default);
				setState(1032);
				match(Colon);
				setState(1033);
				statement();
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

	public static class ExpressionstatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExpressionstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExpressionstatement(this);
		}
	}

	public final ExpressionstatementContext expressionstatement() throws RecognitionException {
		ExpressionstatementContext _localctx = new ExpressionstatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_expressionstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
				{
				setState(1036);
				expression(0);
				}
			}

			setState(1039);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundstatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(CPP14Parser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CPP14Parser.RightBrace, 0); }
		public StatementseqContext statementseq() {
			return getRuleContext(StatementseqContext.class,0);
		}
		public CompoundstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCompoundstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCompoundstatement(this);
		}
	}

	public final CompoundstatementContext compoundstatement() throws RecognitionException {
		CompoundstatementContext _localctx = new CompoundstatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_compoundstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			match(LeftBrace);
			setState(1043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << False) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Static_assert) | (1L << Static_cast) | (1L << Struct) | (1L << Switch) | (1L << This) | (1L << Thread_local) | (1L << Throw))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (AndAnd - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Semi - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
				{
				setState(1042);
				statementseq(0);
				}
			}

			setState(1045);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementseqContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementseqContext statementseq() {
			return getRuleContext(StatementseqContext.class,0);
		}
		public StatementseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterStatementseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitStatementseq(this);
		}
	}

	public final StatementseqContext statementseq() throws RecognitionException {
		return statementseq(0);
	}

	private StatementseqContext statementseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementseqContext _localctx = new StatementseqContext(_ctx, _parentState);
		StatementseqContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_statementseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1048);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(1054);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statementseq);
					setState(1050);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1051);
					statement();
					}
					} 
				}
				setState(1056);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
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

	public static class SelectionstatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(CPP14Parser.If, 0); }
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(CPP14Parser.Else, 0); }
		public TerminalNode Switch() { return getToken(CPP14Parser.Switch, 0); }
		public SelectionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterSelectionstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitSelectionstatement(this);
		}
	}

	public final SelectionstatementContext selectionstatement() throws RecognitionException {
		SelectionstatementContext _localctx = new SelectionstatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_selectionstatement);
		try {
			setState(1077);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1057);
				match(If);
				setState(1058);
				match(LeftParen);
				setState(1059);
				condition();
				setState(1060);
				match(RightParen);
				setState(1061);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1063);
				match(If);
				setState(1064);
				match(LeftParen);
				setState(1065);
				condition();
				setState(1066);
				match(RightParen);
				setState(1067);
				statement();
				setState(1068);
				match(Else);
				setState(1069);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1071);
				match(Switch);
				setState(1072);
				match(LeftParen);
				setState(1073);
				condition();
				setState(1074);
				match(RightParen);
				setState(1075);
				statement();
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

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_condition);
		int _la;
		try {
			setState(1095);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1079);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1080);
					attributespecifierseq(0);
					}
				}

				setState(1083);
				declspecifierseq();
				setState(1084);
				declarator();
				setState(1085);
				match(Assign);
				setState(1086);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1089);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1088);
					attributespecifierseq(0);
					}
				}

				setState(1091);
				declspecifierseq();
				setState(1092);
				declarator();
				setState(1093);
				bracedinitlist();
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

	public static class IterationstatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(CPP14Parser.While, 0); }
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(CPP14Parser.Do, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public TerminalNode For() { return getToken(CPP14Parser.For, 0); }
		public ForinitstatementContext forinitstatement() {
			return getRuleContext(ForinitstatementContext.class,0);
		}
		public ForrangedeclarationContext forrangedeclaration() {
			return getRuleContext(ForrangedeclarationContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CPP14Parser.Colon, 0); }
		public ForrangeinitializerContext forrangeinitializer() {
			return getRuleContext(ForrangeinitializerContext.class,0);
		}
		public IterationstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterIterationstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitIterationstatement(this);
		}
	}

	public final IterationstatementContext iterationstatement() throws RecognitionException {
		IterationstatementContext _localctx = new IterationstatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_iterationstatement);
		int _la;
		try {
			setState(1132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1097);
				match(While);
				setState(1098);
				match(LeftParen);
				setState(1099);
				condition();
				setState(1100);
				match(RightParen);
				setState(1101);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1103);
				match(Do);
				setState(1104);
				statement();
				setState(1105);
				match(While);
				setState(1106);
				match(LeftParen);
				setState(1107);
				expression(0);
				setState(1108);
				match(RightParen);
				setState(1109);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1111);
				match(For);
				setState(1112);
				match(LeftParen);
				setState(1113);
				forinitstatement();
				setState(1115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << False) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Static_cast) | (1L << Struct) | (1L << This) | (1L << Thread_local) | (1L << Throw))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(1114);
					condition();
					}
				}

				setState(1117);
				match(Semi);
				setState(1119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(1118);
					expression(0);
					}
				}

				setState(1121);
				match(RightParen);
				setState(1122);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1124);
				match(For);
				setState(1125);
				match(LeftParen);
				setState(1126);
				forrangedeclaration();
				setState(1127);
				match(Colon);
				setState(1128);
				forrangeinitializer();
				setState(1129);
				match(RightParen);
				setState(1130);
				statement();
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

	public static class ForinitstatementContext extends ParserRuleContext {
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public SimpledeclarationContext simpledeclaration() {
			return getRuleContext(SimpledeclarationContext.class,0);
		}
		public ForinitstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forinitstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterForinitstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitForinitstatement(this);
		}
	}

	public final ForinitstatementContext forinitstatement() throws RecognitionException {
		ForinitstatementContext _localctx = new ForinitstatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_forinitstatement);
		try {
			setState(1136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1134);
				expressionstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1135);
				simpledeclaration();
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

	public static class ForrangedeclarationContext extends ParserRuleContext {
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ForrangedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forrangedeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterForrangedeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitForrangedeclaration(this);
		}
	}

	public final ForrangedeclarationContext forrangedeclaration() throws RecognitionException {
		ForrangedeclarationContext _localctx = new ForrangedeclarationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_forrangedeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1138);
				attributespecifierseq(0);
				}
			}

			setState(1141);
			declspecifierseq();
			setState(1142);
			declarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForrangeinitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public ForrangeinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forrangeinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterForrangeinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitForrangeinitializer(this);
		}
	}

	public final ForrangeinitializerContext forrangeinitializer() throws RecognitionException {
		ForrangeinitializerContext _localctx = new ForrangeinitializerContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_forrangeinitializer);
		try {
			setState(1146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Alignof:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Const_cast:
			case Decltype:
			case Delete:
			case Double:
			case Dynamic_cast:
			case False:
			case Float:
			case Int:
			case Long:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Reinterpret_cast:
			case Short:
			case Signed:
			case Sizeof:
			case Static_cast:
			case This:
			case Throw:
			case True:
			case Typeid:
			case Typename:
			case Unsigned:
			case Void:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Plus:
			case Star:
			case And:
			case Or:
			case Tilde:
			case Not:
			case PlusPlus:
			case MinusMinus:
			case Doublecolon:
			case Identifier:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1144);
				expression(0);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1145);
				bracedinitlist();
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

	public static class JumpstatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(CPP14Parser.Break, 0); }
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public TerminalNode Continue() { return getToken(CPP14Parser.Continue, 0); }
		public TerminalNode Return() { return getToken(CPP14Parser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public TerminalNode Goto() { return getToken(CPP14Parser.Goto, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public JumpstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterJumpstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitJumpstatement(this);
		}
	}

	public final JumpstatementContext jumpstatement() throws RecognitionException {
		JumpstatementContext _localctx = new JumpstatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_jumpstatement);
		int _la;
		try {
			setState(1164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1148);
				match(Break);
				setState(1149);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1150);
				match(Continue);
				setState(1151);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1152);
				match(Return);
				setState(1154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(1153);
					expression(0);
					}
				}

				setState(1156);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1157);
				match(Return);
				setState(1158);
				bracedinitlist();
				setState(1159);
				match(Semi);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1161);
				match(Goto);
				setState(1162);
				match(Identifier);
				setState(1163);
				match(Semi);
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

	public static class DeclarationstatementContext extends ParserRuleContext {
		public BlockdeclarationContext blockdeclaration() {
			return getRuleContext(BlockdeclarationContext.class,0);
		}
		public DeclarationstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclarationstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclarationstatement(this);
		}
	}

	public final DeclarationstatementContext declarationstatement() throws RecognitionException {
		DeclarationstatementContext _localctx = new DeclarationstatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_declarationstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1166);
			blockdeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationseqContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public DeclarationseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclarationseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclarationseq(this);
		}
	}

	public final DeclarationseqContext declarationseq() throws RecognitionException {
		return declarationseq(0);
	}

	private DeclarationseqContext declarationseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationseqContext _localctx = new DeclarationseqContext(_ctx, _parentState);
		DeclarationseqContext _prevctx = _localctx;
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_declarationseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1169);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationseq);
					setState(1171);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1172);
					declaration();
					}
					} 
				}
				setState(1177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
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

	public static class DeclarationContext extends ParserRuleContext {
		public BlockdeclarationContext blockdeclaration() {
			return getRuleContext(BlockdeclarationContext.class,0);
		}
		public FunctiondefinitionContext functiondefinition() {
			return getRuleContext(FunctiondefinitionContext.class,0);
		}
		public TemplatedeclarationContext templatedeclaration() {
			return getRuleContext(TemplatedeclarationContext.class,0);
		}
		public ExplicitinstantiationContext explicitinstantiation() {
			return getRuleContext(ExplicitinstantiationContext.class,0);
		}
		public ExplicitspecializationContext explicitspecialization() {
			return getRuleContext(ExplicitspecializationContext.class,0);
		}
		public LinkagespecificationContext linkagespecification() {
			return getRuleContext(LinkagespecificationContext.class,0);
		}
		public NamespacedefinitionContext namespacedefinition() {
			return getRuleContext(NamespacedefinitionContext.class,0);
		}
		public EmptydeclarationContext emptydeclaration() {
			return getRuleContext(EmptydeclarationContext.class,0);
		}
		public AttributedeclarationContext attributedeclaration() {
			return getRuleContext(AttributedeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_declaration);
		try {
			setState(1187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1178);
				blockdeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1179);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1180);
				templatedeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1181);
				explicitinstantiation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1182);
				explicitspecialization();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1183);
				linkagespecification();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1184);
				namespacedefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1185);
				emptydeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1186);
				attributedeclaration();
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

	public static class BlockdeclarationContext extends ParserRuleContext {
		public SimpledeclarationContext simpledeclaration() {
			return getRuleContext(SimpledeclarationContext.class,0);
		}
		public AsmdefinitionContext asmdefinition() {
			return getRuleContext(AsmdefinitionContext.class,0);
		}
		public NamespacealiasdefinitionContext namespacealiasdefinition() {
			return getRuleContext(NamespacealiasdefinitionContext.class,0);
		}
		public UsingdeclarationContext usingdeclaration() {
			return getRuleContext(UsingdeclarationContext.class,0);
		}
		public UsingdirectiveContext usingdirective() {
			return getRuleContext(UsingdirectiveContext.class,0);
		}
		public Static_assertdeclarationContext static_assertdeclaration() {
			return getRuleContext(Static_assertdeclarationContext.class,0);
		}
		public AliasdeclarationContext aliasdeclaration() {
			return getRuleContext(AliasdeclarationContext.class,0);
		}
		public OpaqueenumdeclarationContext opaqueenumdeclaration() {
			return getRuleContext(OpaqueenumdeclarationContext.class,0);
		}
		public BlockdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBlockdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBlockdeclaration(this);
		}
	}

	public final BlockdeclarationContext blockdeclaration() throws RecognitionException {
		BlockdeclarationContext _localctx = new BlockdeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_blockdeclaration);
		try {
			setState(1197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1189);
				simpledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1190);
				asmdefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1191);
				namespacealiasdefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1192);
				usingdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1193);
				usingdirective();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1194);
				static_assertdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1195);
				aliasdeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1196);
				opaqueenumdeclaration();
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

	public static class AliasdeclarationContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(CPP14Parser.Using, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AliasdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAliasdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAliasdeclaration(this);
		}
	}

	public final AliasdeclarationContext aliasdeclaration() throws RecognitionException {
		AliasdeclarationContext _localctx = new AliasdeclarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_aliasdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			match(Using);
			setState(1200);
			match(Identifier);
			setState(1202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1201);
				attributespecifierseq(0);
				}
			}

			setState(1204);
			match(Assign);
			setState(1205);
			typeid();
			setState(1206);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpledeclarationContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public InitdeclaratorlistContext initdeclaratorlist() {
			return getRuleContext(InitdeclaratorlistContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public SimpledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpledeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterSimpledeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitSimpledeclaration(this);
		}
	}

	public final SimpledeclarationContext simpledeclaration() throws RecognitionException {
		SimpledeclarationContext _localctx = new SimpledeclarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_simpledeclaration);
		int _la;
		try {
			setState(1222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Decltype:
			case Double:
			case Enum:
			case Explicit:
			case Extern:
			case Float:
			case Friend:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Operator:
			case Register:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Thread_local:
			case Typedef:
			case Typename:
			case Union:
			case Unsigned:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case LeftParen:
			case Star:
			case And:
			case Tilde:
			case AndAnd:
			case Doublecolon:
			case Semi:
			case Ellipsis:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1209);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(1208);
					declspecifierseq();
					}
					break;
				}
				setState(1212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Operator || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LeftParen - 77)) | (1L << (Star - 77)) | (1L << (And - 77)) | (1L << (Tilde - 77)) | (1L << (AndAnd - 77)) | (1L << (Doublecolon - 77)) | (1L << (Ellipsis - 77)) | (1L << (Identifier - 77)))) != 0)) {
					{
					setState(1211);
					initdeclaratorlist(0);
					}
				}

				setState(1214);
				match(Semi);
				}
				break;
			case Alignas:
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1215);
				attributespecifierseq(0);
				setState(1217);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(1216);
					declspecifierseq();
					}
					break;
				}
				setState(1219);
				initdeclaratorlist(0);
				setState(1220);
				match(Semi);
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

	public static class Static_assertdeclarationContext extends ParserRuleContext {
		public TerminalNode Static_assert() { return getToken(CPP14Parser.Static_assert, 0); }
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public Static_assertdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_assertdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterStatic_assertdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitStatic_assertdeclaration(this);
		}
	}

	public final Static_assertdeclarationContext static_assertdeclaration() throws RecognitionException {
		Static_assertdeclarationContext _localctx = new Static_assertdeclarationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_static_assertdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1224);
			match(Static_assert);
			setState(1225);
			match(LeftParen);
			setState(1226);
			constantexpression();
			setState(1227);
			match(Comma);
			setState(1228);
			match(Stringliteral);
			setState(1229);
			match(RightParen);
			setState(1230);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptydeclarationContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public EmptydeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptydeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEmptydeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEmptydeclaration(this);
		}
	}

	public final EmptydeclarationContext emptydeclaration() throws RecognitionException {
		EmptydeclarationContext _localctx = new EmptydeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_emptydeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributedeclarationContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public AttributedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributedeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributedeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributedeclaration(this);
		}
	}

	public final AttributedeclarationContext attributedeclaration() throws RecognitionException {
		AttributedeclarationContext _localctx = new AttributedeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_attributedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
			attributespecifierseq(0);
			setState(1235);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclspecifierContext extends ParserRuleContext {
		public StorageclassspecifierContext storageclassspecifier() {
			return getRuleContext(StorageclassspecifierContext.class,0);
		}
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public FunctionspecifierContext functionspecifier() {
			return getRuleContext(FunctionspecifierContext.class,0);
		}
		public TerminalNode Friend() { return getToken(CPP14Parser.Friend, 0); }
		public TerminalNode Typedef() { return getToken(CPP14Parser.Typedef, 0); }
		public TerminalNode Constexpr() { return getToken(CPP14Parser.Constexpr, 0); }
		public DeclspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclspecifier(this);
		}
	}

	public final DeclspecifierContext declspecifier() throws RecognitionException {
		DeclspecifierContext _localctx = new DeclspecifierContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_declspecifier);
		try {
			setState(1243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Extern:
			case Mutable:
			case Register:
			case Static:
			case Thread_local:
				enterOuterAlt(_localctx, 1);
				{
				setState(1237);
				storageclassspecifier();
				}
				break;
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Decltype:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Struct:
			case Typename:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Wchar:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1238);
				typespecifier();
				}
				break;
			case Explicit:
			case Inline:
			case Virtual:
				enterOuterAlt(_localctx, 3);
				{
				setState(1239);
				functionspecifier();
				}
				break;
			case Friend:
				enterOuterAlt(_localctx, 4);
				{
				setState(1240);
				match(Friend);
				}
				break;
			case Typedef:
				enterOuterAlt(_localctx, 5);
				{
				setState(1241);
				match(Typedef);
				}
				break;
			case Constexpr:
				enterOuterAlt(_localctx, 6);
				{
				setState(1242);
				match(Constexpr);
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

	public static class DeclspecifierseqContext extends ParserRuleContext {
		public DeclspecifierContext declspecifier() {
			return getRuleContext(DeclspecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclspecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declspecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclspecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclspecifierseq(this);
		}
	}

	public final DeclspecifierseqContext declspecifierseq() throws RecognitionException {
		DeclspecifierseqContext _localctx = new DeclspecifierseqContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_declspecifierseq);
		try {
			setState(1252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1245);
				declspecifier();
				setState(1247);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(1246);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1249);
				declspecifier();
				setState(1250);
				declspecifierseq();
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

	public static class StorageclassspecifierContext extends ParserRuleContext {
		public TerminalNode Register() { return getToken(CPP14Parser.Register, 0); }
		public TerminalNode Static() { return getToken(CPP14Parser.Static, 0); }
		public TerminalNode Thread_local() { return getToken(CPP14Parser.Thread_local, 0); }
		public TerminalNode Extern() { return getToken(CPP14Parser.Extern, 0); }
		public TerminalNode Mutable() { return getToken(CPP14Parser.Mutable, 0); }
		public StorageclassspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageclassspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterStorageclassspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitStorageclassspecifier(this);
		}
	}

	public final StorageclassspecifierContext storageclassspecifier() throws RecognitionException {
		StorageclassspecifierContext _localctx = new StorageclassspecifierContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_storageclassspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Extern) | (1L << Mutable) | (1L << Register) | (1L << Static) | (1L << Thread_local))) != 0)) ) {
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

	public static class FunctionspecifierContext extends ParserRuleContext {
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public TerminalNode Virtual() { return getToken(CPP14Parser.Virtual, 0); }
		public TerminalNode Explicit() { return getToken(CPP14Parser.Explicit, 0); }
		public FunctionspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterFunctionspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitFunctionspecifier(this);
		}
	}

	public final FunctionspecifierContext functionspecifier() throws RecognitionException {
		FunctionspecifierContext _localctx = new FunctionspecifierContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_functionspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			_la = _input.LA(1);
			if ( !(((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (Explicit - 26)) | (1L << (Inline - 26)) | (1L << (Virtual - 26)))) != 0)) ) {
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

	public static class TypedefnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TypedefnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypedefname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypedefname(this);
		}
	}

	public final TypedefnameContext typedefname() throws RecognitionException {
		TypedefnameContext _localctx = new TypedefnameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_typedefname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypespecifierContext extends ParserRuleContext {
		public TrailingtypespecifierContext trailingtypespecifier() {
			return getRuleContext(TrailingtypespecifierContext.class,0);
		}
		public ClassspecifierContext classspecifier() {
			return getRuleContext(ClassspecifierContext.class,0);
		}
		public EnumspecifierContext enumspecifier() {
			return getRuleContext(EnumspecifierContext.class,0);
		}
		public TypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypespecifier(this);
		}
	}

	public final TypespecifierContext typespecifier() throws RecognitionException {
		TypespecifierContext _localctx = new TypespecifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_typespecifier);
		try {
			setState(1263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1260);
				trailingtypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1261);
				classspecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1262);
				enumspecifier();
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

	public static class TrailingtypespecifierContext extends ParserRuleContext {
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public ElaboratedtypespecifierContext elaboratedtypespecifier() {
			return getRuleContext(ElaboratedtypespecifierContext.class,0);
		}
		public TypenamespecifierContext typenamespecifier() {
			return getRuleContext(TypenamespecifierContext.class,0);
		}
		public CvqualifierContext cvqualifier() {
			return getRuleContext(CvqualifierContext.class,0);
		}
		public TrailingtypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingtypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTrailingtypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTrailingtypespecifier(this);
		}
	}

	public final TrailingtypespecifierContext trailingtypespecifier() throws RecognitionException {
		TrailingtypespecifierContext _localctx = new TrailingtypespecifierContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_trailingtypespecifier);
		try {
			setState(1269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Decltype:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Wchar:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1265);
				simpletypespecifier();
				}
				break;
			case Class:
			case Enum:
			case Struct:
			case Union:
				enterOuterAlt(_localctx, 2);
				{
				setState(1266);
				elaboratedtypespecifier();
				}
				break;
			case Typename:
				enterOuterAlt(_localctx, 3);
				{
				setState(1267);
				typenamespecifier();
				}
				break;
			case Const:
			case Volatile:
				enterOuterAlt(_localctx, 4);
				{
				setState(1268);
				cvqualifier();
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

	public static class TypespecifierseqContext extends ParserRuleContext {
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public TypespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typespecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypespecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypespecifierseq(this);
		}
	}

	public final TypespecifierseqContext typespecifierseq() throws RecognitionException {
		TypespecifierseqContext _localctx = new TypespecifierseqContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_typespecifierseq);
		try {
			setState(1278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1271);
				typespecifier();
				setState(1273);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1272);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1275);
				typespecifier();
				setState(1276);
				typespecifierseq();
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

	public static class TrailingtypespecifierseqContext extends ParserRuleContext {
		public TrailingtypespecifierContext trailingtypespecifier() {
			return getRuleContext(TrailingtypespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TrailingtypespecifierseqContext trailingtypespecifierseq() {
			return getRuleContext(TrailingtypespecifierseqContext.class,0);
		}
		public TrailingtypespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingtypespecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTrailingtypespecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTrailingtypespecifierseq(this);
		}
	}

	public final TrailingtypespecifierseqContext trailingtypespecifierseq() throws RecognitionException {
		TrailingtypespecifierseqContext _localctx = new TrailingtypespecifierseqContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_trailingtypespecifierseq);
		try {
			setState(1287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1280);
				trailingtypespecifier();
				setState(1282);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1281);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1284);
				trailingtypespecifier();
				setState(1285);
				trailingtypespecifierseq();
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

	public static class SimpletypespecifierContext extends ParserRuleContext {
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Char() { return getToken(CPP14Parser.Char, 0); }
		public TerminalNode Char16() { return getToken(CPP14Parser.Char16, 0); }
		public TerminalNode Char32() { return getToken(CPP14Parser.Char32, 0); }
		public TerminalNode Wchar() { return getToken(CPP14Parser.Wchar, 0); }
		public TerminalNode Bool() { return getToken(CPP14Parser.Bool, 0); }
		public TerminalNode Short() { return getToken(CPP14Parser.Short, 0); }
		public TerminalNode Int() { return getToken(CPP14Parser.Int, 0); }
		public TerminalNode Long() { return getToken(CPP14Parser.Long, 0); }
		public TerminalNode Signed() { return getToken(CPP14Parser.Signed, 0); }
		public TerminalNode Unsigned() { return getToken(CPP14Parser.Unsigned, 0); }
		public TerminalNode Float() { return getToken(CPP14Parser.Float, 0); }
		public TerminalNode Double() { return getToken(CPP14Parser.Double, 0); }
		public TerminalNode Void() { return getToken(CPP14Parser.Void, 0); }
		public TerminalNode Auto() { return getToken(CPP14Parser.Auto, 0); }
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public SimpletypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpletypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterSimpletypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitSimpletypespecifier(this);
		}
	}

	public final SimpletypespecifierContext simpletypespecifier() throws RecognitionException {
		SimpletypespecifierContext _localctx = new SimpletypespecifierContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_simpletypespecifier);
		try {
			setState(1312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1290);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1289);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1292);
				typename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1293);
				nestednamespecifier(0);
				setState(1294);
				match(Template);
				setState(1295);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1297);
				match(Char);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1298);
				match(Char16);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1299);
				match(Char32);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1300);
				match(Wchar);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1301);
				match(Bool);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1302);
				match(Short);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1303);
				match(Int);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1304);
				match(Long);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1305);
				match(Signed);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1306);
				match(Unsigned);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1307);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1308);
				match(Double);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1309);
				match(Void);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1310);
				match(Auto);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1311);
				decltypespecifier();
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

	public static class TypenameContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public EnumnameContext enumname() {
			return getRuleContext(EnumnameContext.class,0);
		}
		public TypedefnameContext typedefname() {
			return getRuleContext(TypedefnameContext.class,0);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TypenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypename(this);
		}
	}

	public final TypenameContext typename() throws RecognitionException {
		TypenameContext _localctx = new TypenameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_typename);
		try {
			setState(1318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1314);
				classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1315);
				enumname();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1316);
				typedefname();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1317);
				simpletemplateid();
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

	public static class DecltypespecifierContext extends ParserRuleContext {
		public TerminalNode Decltype() { return getToken(CPP14Parser.Decltype, 0); }
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public TerminalNode Auto() { return getToken(CPP14Parser.Auto, 0); }
		public DecltypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decltypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDecltypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDecltypespecifier(this);
		}
	}

	public final DecltypespecifierContext decltypespecifier() throws RecognitionException {
		DecltypespecifierContext _localctx = new DecltypespecifierContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_decltypespecifier);
		try {
			setState(1329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1320);
				match(Decltype);
				setState(1321);
				match(LeftParen);
				setState(1322);
				expression(0);
				setState(1323);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1325);
				match(Decltype);
				setState(1326);
				match(LeftParen);
				setState(1327);
				match(Auto);
				setState(1328);
				match(RightParen);
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

	public static class ElaboratedtypespecifierContext extends ParserRuleContext {
		public ClasskeyContext classkey() {
			return getRuleContext(ClasskeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TerminalNode Enum() { return getToken(CPP14Parser.Enum, 0); }
		public ElaboratedtypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elaboratedtypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterElaboratedtypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitElaboratedtypespecifier(this);
		}
	}

	public final ElaboratedtypespecifierContext elaboratedtypespecifier() throws RecognitionException {
		ElaboratedtypespecifierContext _localctx = new ElaboratedtypespecifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_elaboratedtypespecifier);
		int _la;
		try {
			setState(1355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1331);
				classkey();
				setState(1333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1332);
					attributespecifierseq(0);
					}
				}

				setState(1336);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(1335);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1338);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1340);
				classkey();
				setState(1341);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1343);
				classkey();
				setState(1344);
				nestednamespecifier(0);
				setState(1346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(1345);
					match(Template);
					}
				}

				setState(1348);
				simpletemplateid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1350);
				match(Enum);
				setState(1352);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1351);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1354);
				match(Identifier);
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

	public static class EnumnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public EnumnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumname(this);
		}
	}

	public final EnumnameContext enumname() throws RecognitionException {
		EnumnameContext _localctx = new EnumnameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_enumname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumspecifierContext extends ParserRuleContext {
		public EnumheadContext enumhead() {
			return getRuleContext(EnumheadContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(CPP14Parser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CPP14Parser.RightBrace, 0); }
		public EnumeratorlistContext enumeratorlist() {
			return getRuleContext(EnumeratorlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public EnumspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumspecifier(this);
		}
	}

	public final EnumspecifierContext enumspecifier() throws RecognitionException {
		EnumspecifierContext _localctx = new EnumspecifierContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_enumspecifier);
		int _la;
		try {
			setState(1372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1359);
				enumhead();
				setState(1360);
				match(LeftBrace);
				setState(1362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1361);
					enumeratorlist(0);
					}
				}

				setState(1364);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1366);
				enumhead();
				setState(1367);
				match(LeftBrace);
				setState(1368);
				enumeratorlist(0);
				setState(1369);
				match(Comma);
				setState(1370);
				match(RightBrace);
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

	public static class EnumheadContext extends ParserRuleContext {
		public EnumkeyContext enumkey() {
			return getRuleContext(EnumkeyContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public EnumbaseContext enumbase() {
			return getRuleContext(EnumbaseContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public EnumheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumhead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumhead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumhead(this);
		}
	}

	public final EnumheadContext enumhead() throws RecognitionException {
		EnumheadContext _localctx = new EnumheadContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_enumhead);
		int _la;
		try {
			setState(1393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1374);
				enumkey();
				setState(1376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1375);
					attributespecifierseq(0);
					}
				}

				setState(1379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1378);
					match(Identifier);
					}
				}

				setState(1382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1381);
					enumbase();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1384);
				enumkey();
				setState(1386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1385);
					attributespecifierseq(0);
					}
				}

				setState(1388);
				nestednamespecifier(0);
				setState(1389);
				match(Identifier);
				setState(1391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1390);
					enumbase();
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

	public static class OpaqueenumdeclarationContext extends ParserRuleContext {
		public EnumkeyContext enumkey() {
			return getRuleContext(EnumkeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public EnumbaseContext enumbase() {
			return getRuleContext(EnumbaseContext.class,0);
		}
		public OpaqueenumdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opaqueenumdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterOpaqueenumdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitOpaqueenumdeclaration(this);
		}
	}

	public final OpaqueenumdeclarationContext opaqueenumdeclaration() throws RecognitionException {
		OpaqueenumdeclarationContext _localctx = new OpaqueenumdeclarationContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_opaqueenumdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1395);
			enumkey();
			setState(1397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1396);
				attributespecifierseq(0);
				}
			}

			setState(1399);
			match(Identifier);
			setState(1401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1400);
				enumbase();
				}
			}

			setState(1403);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumkeyContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(CPP14Parser.Enum, 0); }
		public TerminalNode Class() { return getToken(CPP14Parser.Class, 0); }
		public TerminalNode Struct() { return getToken(CPP14Parser.Struct, 0); }
		public EnumkeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumkey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumkey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumkey(this);
		}
	}

	public final EnumkeyContext enumkey() throws RecognitionException {
		EnumkeyContext _localctx = new EnumkeyContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_enumkey);
		try {
			setState(1410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1405);
				match(Enum);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1406);
				match(Enum);
				setState(1407);
				match(Class);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1408);
				match(Enum);
				setState(1409);
				match(Struct);
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

	public static class EnumbaseContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(CPP14Parser.Colon, 0); }
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public EnumbaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumbase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumbase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumbase(this);
		}
	}

	public final EnumbaseContext enumbase() throws RecognitionException {
		EnumbaseContext _localctx = new EnumbaseContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_enumbase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
			match(Colon);
			setState(1413);
			typespecifierseq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorlistContext extends ParserRuleContext {
		public EnumeratordefinitionContext enumeratordefinition() {
			return getRuleContext(EnumeratordefinitionContext.class,0);
		}
		public EnumeratorlistContext enumeratorlist() {
			return getRuleContext(EnumeratorlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public EnumeratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumeratorlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumeratorlist(this);
		}
	}

	public final EnumeratorlistContext enumeratorlist() throws RecognitionException {
		return enumeratorlist(0);
	}

	private EnumeratorlistContext enumeratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EnumeratorlistContext _localctx = new EnumeratorlistContext(_ctx, _parentState);
		EnumeratorlistContext _prevctx = _localctx;
		int _startState = 170;
		enterRecursionRule(_localctx, 170, RULE_enumeratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1416);
			enumeratordefinition();
			}
			_ctx.stop = _input.LT(-1);
			setState(1423);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorlist);
					setState(1418);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1419);
					match(Comma);
					setState(1420);
					enumeratordefinition();
					}
					} 
				}
				setState(1425);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
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

	public static class EnumeratordefinitionContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public EnumeratordefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratordefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumeratordefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumeratordefinition(this);
		}
	}

	public final EnumeratordefinitionContext enumeratordefinition() throws RecognitionException {
		EnumeratordefinitionContext _localctx = new EnumeratordefinitionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_enumeratordefinition);
		try {
			setState(1431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1426);
				enumerator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1427);
				enumerator();
				setState(1428);
				match(Assign);
				setState(1429);
				constantexpression();
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

	public static class EnumeratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumerator(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_enumerator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1433);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacenameContext extends ParserRuleContext {
		public OriginalnamespacenameContext originalnamespacename() {
			return getRuleContext(OriginalnamespacenameContext.class,0);
		}
		public NamespacealiasContext namespacealias() {
			return getRuleContext(NamespacealiasContext.class,0);
		}
		public NamespacenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamespacename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamespacename(this);
		}
	}

	public final NamespacenameContext namespacename() throws RecognitionException {
		NamespacenameContext _localctx = new NamespacenameContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_namespacename);
		try {
			setState(1437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1435);
				originalnamespacename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1436);
				namespacealias();
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

	public static class OriginalnamespacenameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public OriginalnamespacenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalnamespacename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterOriginalnamespacename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitOriginalnamespacename(this);
		}
	}

	public final OriginalnamespacenameContext originalnamespacename() throws RecognitionException {
		OriginalnamespacenameContext _localctx = new OriginalnamespacenameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_originalnamespacename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1439);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacedefinitionContext extends ParserRuleContext {
		public NamednamespacedefinitionContext namednamespacedefinition() {
			return getRuleContext(NamednamespacedefinitionContext.class,0);
		}
		public UnnamednamespacedefinitionContext unnamednamespacedefinition() {
			return getRuleContext(UnnamednamespacedefinitionContext.class,0);
		}
		public NamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamespacedefinition(this);
		}
	}

	public final NamespacedefinitionContext namespacedefinition() throws RecognitionException {
		NamespacedefinitionContext _localctx = new NamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_namespacedefinition);
		try {
			setState(1443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1441);
				namednamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1442);
				unnamednamespacedefinition();
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

	public static class NamednamespacedefinitionContext extends ParserRuleContext {
		public OriginalnamespacedefinitionContext originalnamespacedefinition() {
			return getRuleContext(OriginalnamespacedefinitionContext.class,0);
		}
		public ExtensionnamespacedefinitionContext extensionnamespacedefinition() {
			return getRuleContext(ExtensionnamespacedefinitionContext.class,0);
		}
		public NamednamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namednamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamednamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamednamespacedefinition(this);
		}
	}

	public final NamednamespacedefinitionContext namednamespacedefinition() throws RecognitionException {
		NamednamespacedefinitionContext _localctx = new NamednamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_namednamespacedefinition);
		try {
			setState(1447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1445);
				originalnamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1446);
				extensionnamespacedefinition();
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

	public static class OriginalnamespacedefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode LeftBrace() { return getToken(CPP14Parser.LeftBrace, 0); }
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CPP14Parser.RightBrace, 0); }
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public OriginalnamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalnamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterOriginalnamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitOriginalnamespacedefinition(this);
		}
	}

	public final OriginalnamespacedefinitionContext originalnamespacedefinition() throws RecognitionException {
		OriginalnamespacedefinitionContext _localctx = new OriginalnamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_originalnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1449);
				match(Inline);
				}
			}

			setState(1452);
			match(Namespace);
			setState(1453);
			match(Identifier);
			setState(1454);
			match(LeftBrace);
			setState(1455);
			namespacebody();
			setState(1456);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionnamespacedefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public OriginalnamespacenameContext originalnamespacename() {
			return getRuleContext(OriginalnamespacenameContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(CPP14Parser.LeftBrace, 0); }
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CPP14Parser.RightBrace, 0); }
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public ExtensionnamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionnamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExtensionnamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExtensionnamespacedefinition(this);
		}
	}

	public final ExtensionnamespacedefinitionContext extensionnamespacedefinition() throws RecognitionException {
		ExtensionnamespacedefinitionContext _localctx = new ExtensionnamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_extensionnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1458);
				match(Inline);
				}
			}

			setState(1461);
			match(Namespace);
			setState(1462);
			originalnamespacename();
			setState(1463);
			match(LeftBrace);
			setState(1464);
			namespacebody();
			setState(1465);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnnamednamespacedefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public TerminalNode LeftBrace() { return getToken(CPP14Parser.LeftBrace, 0); }
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CPP14Parser.RightBrace, 0); }
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public UnnamednamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unnamednamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUnnamednamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUnnamednamespacedefinition(this);
		}
	}

	public final UnnamednamespacedefinitionContext unnamednamespacedefinition() throws RecognitionException {
		UnnamednamespacedefinitionContext _localctx = new UnnamednamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_unnamednamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1467);
				match(Inline);
				}
			}

			setState(1470);
			match(Namespace);
			setState(1471);
			match(LeftBrace);
			setState(1472);
			namespacebody();
			setState(1473);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacebodyContext extends ParserRuleContext {
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public NamespacebodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacebody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamespacebody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamespacebody(this);
		}
	}

	public final NamespacebodyContext namespacebody() throws RecognitionException {
		NamespacebodyContext _localctx = new NamespacebodyContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_namespacebody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(1475);
				declarationseq(0);
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

	public static class NamespacealiasContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public NamespacealiasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacealias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamespacealias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamespacealias(this);
		}
	}

	public final NamespacealiasContext namespacealias() throws RecognitionException {
		NamespacealiasContext _localctx = new NamespacealiasContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_namespacealias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1478);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacealiasdefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public QualifiednamespacespecifierContext qualifiednamespacespecifier() {
			return getRuleContext(QualifiednamespacespecifierContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public NamespacealiasdefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacealiasdefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamespacealiasdefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamespacealiasdefinition(this);
		}
	}

	public final NamespacealiasdefinitionContext namespacealiasdefinition() throws RecognitionException {
		NamespacealiasdefinitionContext _localctx = new NamespacealiasdefinitionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_namespacealiasdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			match(Namespace);
			setState(1481);
			match(Identifier);
			setState(1482);
			match(Assign);
			setState(1483);
			qualifiednamespacespecifier();
			setState(1484);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiednamespacespecifierContext extends ParserRuleContext {
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public QualifiednamespacespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiednamespacespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterQualifiednamespacespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitQualifiednamespacespecifier(this);
		}
	}

	public final QualifiednamespacespecifierContext qualifiednamespacespecifier() throws RecognitionException {
		QualifiednamespacespecifierContext _localctx = new QualifiednamespacespecifierContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_qualifiednamespacespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1486);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1489);
			namespacename();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingdeclarationContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(CPP14Parser.Using, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public TerminalNode Typename() { return getToken(CPP14Parser.Typename, 0); }
		public TerminalNode Doublecolon() { return getToken(CPP14Parser.Doublecolon, 0); }
		public UsingdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUsingdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUsingdeclaration(this);
		}
	}

	public final UsingdeclarationContext usingdeclaration() throws RecognitionException {
		UsingdeclarationContext _localctx = new UsingdeclarationContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_usingdeclaration);
		int _la;
		try {
			setState(1504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1491);
				match(Using);
				setState(1493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Typename) {
					{
					setState(1492);
					match(Typename);
					}
				}

				setState(1495);
				nestednamespecifier(0);
				setState(1496);
				unqualifiedid();
				setState(1497);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1499);
				match(Using);
				setState(1500);
				match(Doublecolon);
				setState(1501);
				unqualifiedid();
				setState(1502);
				match(Semi);
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

	public static class UsingdirectiveContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(CPP14Parser.Using, 0); }
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public UsingdirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingdirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUsingdirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUsingdirective(this);
		}
	}

	public final UsingdirectiveContext usingdirective() throws RecognitionException {
		UsingdirectiveContext _localctx = new UsingdirectiveContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_usingdirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1506);
				attributespecifierseq(0);
				}
			}

			setState(1509);
			match(Using);
			setState(1510);
			match(Namespace);
			setState(1512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1511);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1514);
			namespacename();
			setState(1515);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsmdefinitionContext extends ParserRuleContext {
		public TerminalNode Asm() { return getToken(CPP14Parser.Asm, 0); }
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public AsmdefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmdefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAsmdefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAsmdefinition(this);
		}
	}

	public final AsmdefinitionContext asmdefinition() throws RecognitionException {
		AsmdefinitionContext _localctx = new AsmdefinitionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_asmdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1517);
			match(Asm);
			setState(1518);
			match(LeftParen);
			setState(1519);
			match(Stringliteral);
			setState(1520);
			match(RightParen);
			setState(1521);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinkagespecificationContext extends ParserRuleContext {
		public TerminalNode Extern() { return getToken(CPP14Parser.Extern, 0); }
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public TerminalNode LeftBrace() { return getToken(CPP14Parser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CPP14Parser.RightBrace, 0); }
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public LinkagespecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkagespecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLinkagespecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLinkagespecification(this);
		}
	}

	public final LinkagespecificationContext linkagespecification() throws RecognitionException {
		LinkagespecificationContext _localctx = new LinkagespecificationContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_linkagespecification);
		int _la;
		try {
			setState(1533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1523);
				match(Extern);
				setState(1524);
				match(Stringliteral);
				setState(1525);
				match(LeftBrace);
				setState(1527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(1526);
					declarationseq(0);
					}
				}

				setState(1529);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1530);
				match(Extern);
				setState(1531);
				match(Stringliteral);
				setState(1532);
				declaration();
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

	public static class AttributespecifierseqContext extends ParserRuleContext {
		public AttributespecifierContext attributespecifier() {
			return getRuleContext(AttributespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AttributespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributespecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributespecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributespecifierseq(this);
		}
	}

	public final AttributespecifierseqContext attributespecifierseq() throws RecognitionException {
		return attributespecifierseq(0);
	}

	private AttributespecifierseqContext attributespecifierseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AttributespecifierseqContext _localctx = new AttributespecifierseqContext(_ctx, _parentState);
		AttributespecifierseqContext _prevctx = _localctx;
		int _startState = 206;
		enterRecursionRule(_localctx, 206, RULE_attributespecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1536);
			attributespecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AttributespecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_attributespecifierseq);
					setState(1538);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1539);
					attributespecifier();
					}
					} 
				}
				setState(1544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
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

	public static class AttributespecifierContext extends ParserRuleContext {
		public List<TerminalNode> LeftBracket() { return getTokens(CPP14Parser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(CPP14Parser.LeftBracket, i);
		}
		public AttributelistContext attributelist() {
			return getRuleContext(AttributelistContext.class,0);
		}
		public List<TerminalNode> RightBracket() { return getTokens(CPP14Parser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(CPP14Parser.RightBracket, i);
		}
		public AlignmentspecifierContext alignmentspecifier() {
			return getRuleContext(AlignmentspecifierContext.class,0);
		}
		public AttributespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributespecifier(this);
		}
	}

	public final AttributespecifierContext attributespecifier() throws RecognitionException {
		AttributespecifierContext _localctx = new AttributespecifierContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_attributespecifier);
		try {
			setState(1552);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1545);
				match(LeftBracket);
				setState(1546);
				match(LeftBracket);
				setState(1547);
				attributelist(0);
				setState(1548);
				match(RightBracket);
				setState(1549);
				match(RightBracket);
				}
				break;
			case Alignas:
				enterOuterAlt(_localctx, 2);
				{
				setState(1551);
				alignmentspecifier();
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

	public static class AlignmentspecifierContext extends ParserRuleContext {
		public TerminalNode Alignas() { return getToken(CPP14Parser.Alignas, 0); }
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public TerminalNode Ellipsis() { return getToken(CPP14Parser.Ellipsis, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public AlignmentspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAlignmentspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAlignmentspecifier(this);
		}
	}

	public final AlignmentspecifierContext alignmentspecifier() throws RecognitionException {
		AlignmentspecifierContext _localctx = new AlignmentspecifierContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_alignmentspecifier);
		int _la;
		try {
			setState(1570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1554);
				match(Alignas);
				setState(1555);
				match(LeftParen);
				setState(1556);
				typeid();
				setState(1558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1557);
					match(Ellipsis);
					}
				}

				setState(1560);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1562);
				match(Alignas);
				setState(1563);
				match(LeftParen);
				setState(1564);
				constantexpression();
				setState(1566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1565);
					match(Ellipsis);
					}
				}

				setState(1568);
				match(RightParen);
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

	public static class AttributelistContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(CPP14Parser.Ellipsis, 0); }
		public AttributelistContext attributelist() {
			return getRuleContext(AttributelistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public AttributelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributelist(this);
		}
	}

	public final AttributelistContext attributelist() throws RecognitionException {
		return attributelist(0);
	}

	private AttributelistContext attributelist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AttributelistContext _localctx = new AttributelistContext(_ctx, _parentState);
		AttributelistContext _prevctx = _localctx;
		int _startState = 212;
		enterRecursionRule(_localctx, 212, RULE_attributelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1574);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1573);
					attribute();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1576);
				attribute();
				setState(1577);
				match(Ellipsis);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1593);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1591);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
					case 1:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1581);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1582);
						match(Comma);
						setState(1584);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
						case 1:
							{
							setState(1583);
							attribute();
							}
							break;
						}
						}
						break;
					case 2:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1586);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1587);
						match(Comma);
						setState(1588);
						attribute();
						setState(1589);
						match(Ellipsis);
						}
						break;
					}
					} 
				}
				setState(1595);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
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

	public static class AttributeContext extends ParserRuleContext {
		public AttributetokenContext attributetoken() {
			return getRuleContext(AttributetokenContext.class,0);
		}
		public AttributeargumentclauseContext attributeargumentclause() {
			return getRuleContext(AttributeargumentclauseContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1596);
			attributetoken();
			setState(1598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1597);
				attributeargumentclause();
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

	public static class AttributetokenContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributescopedtokenContext attributescopedtoken() {
			return getRuleContext(AttributescopedtokenContext.class,0);
		}
		public AttributetokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributetoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributetoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributetoken(this);
		}
	}

	public final AttributetokenContext attributetoken() throws RecognitionException {
		AttributetokenContext _localctx = new AttributetokenContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_attributetoken);
		try {
			setState(1602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1600);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1601);
				attributescopedtoken();
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

	public static class AttributescopedtokenContext extends ParserRuleContext {
		public AttributenamespaceContext attributenamespace() {
			return getRuleContext(AttributenamespaceContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(CPP14Parser.Doublecolon, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributescopedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributescopedtoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributescopedtoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributescopedtoken(this);
		}
	}

	public final AttributescopedtokenContext attributescopedtoken() throws RecognitionException {
		AttributescopedtokenContext _localctx = new AttributescopedtokenContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_attributescopedtoken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1604);
			attributenamespace();
			setState(1605);
			match(Doublecolon);
			setState(1606);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributenamespaceContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributenamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributenamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributenamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributenamespace(this);
		}
	}

	public final AttributenamespaceContext attributenamespace() throws RecognitionException {
		AttributenamespaceContext _localctx = new AttributenamespaceContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_attributenamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1608);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeargumentclauseContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public AttributeargumentclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeargumentclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributeargumentclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributeargumentclause(this);
		}
	}

	public final AttributeargumentclauseContext attributeargumentclause() throws RecognitionException {
		AttributeargumentclauseContext _localctx = new AttributeargumentclauseContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_attributeargumentclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1610);
			match(LeftParen);
			setState(1611);
			balancedtokenseq(0);
			setState(1612);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BalancedtokenseqContext extends ParserRuleContext {
		public BalancedtokenContext balancedtoken() {
			return getRuleContext(BalancedtokenContext.class,0);
		}
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public BalancedtokenseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedtokenseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBalancedtokenseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBalancedtokenseq(this);
		}
	}

	public final BalancedtokenseqContext balancedtokenseq() throws RecognitionException {
		return balancedtokenseq(0);
	}

	private BalancedtokenseqContext balancedtokenseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BalancedtokenseqContext _localctx = new BalancedtokenseqContext(_ctx, _parentState);
		BalancedtokenseqContext _prevctx = _localctx;
		int _startState = 224;
		enterRecursionRule(_localctx, 224, RULE_balancedtokenseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1615);
				balancedtoken();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1622);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BalancedtokenseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_balancedtokenseq);
					setState(1618);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1619);
					balancedtoken();
					}
					} 
				}
				setState(1624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
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

	public static class BalancedtokenContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public TerminalNode LeftBracket() { return getToken(CPP14Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPP14Parser.RightBracket, 0); }
		public TerminalNode LeftBrace() { return getToken(CPP14Parser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CPP14Parser.RightBrace, 0); }
		public BalancedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedtoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBalancedtoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBalancedtoken(this);
		}
	}

	public final BalancedtokenContext balancedtoken() throws RecognitionException {
		BalancedtokenContext _localctx = new BalancedtokenContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_balancedtoken);
		try {
			setState(1637);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(1625);
				match(LeftParen);
				setState(1626);
				balancedtokenseq(0);
				setState(1627);
				match(RightParen);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1629);
				match(LeftBracket);
				setState(1630);
				balancedtokenseq(0);
				setState(1631);
				match(RightBracket);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(1633);
				match(LeftBrace);
				setState(1634);
				balancedtokenseq(0);
				setState(1635);
				match(RightBrace);
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

	public static class InitdeclaratorlistContext extends ParserRuleContext {
		public InitdeclaratorContext initdeclarator() {
			return getRuleContext(InitdeclaratorContext.class,0);
		}
		public InitdeclaratorlistContext initdeclaratorlist() {
			return getRuleContext(InitdeclaratorlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public InitdeclaratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initdeclaratorlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitdeclaratorlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitdeclaratorlist(this);
		}
	}

	public final InitdeclaratorlistContext initdeclaratorlist() throws RecognitionException {
		return initdeclaratorlist(0);
	}

	private InitdeclaratorlistContext initdeclaratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitdeclaratorlistContext _localctx = new InitdeclaratorlistContext(_ctx, _parentState);
		InitdeclaratorlistContext _prevctx = _localctx;
		int _startState = 228;
		enterRecursionRule(_localctx, 228, RULE_initdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1640);
			initdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1647);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initdeclaratorlist);
					setState(1642);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1643);
					match(Comma);
					setState(1644);
					initdeclarator();
					}
					} 
				}
				setState(1649);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
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

	public static class InitdeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitdeclarator(this);
		}
	}

	public final InitdeclaratorContext initdeclarator() throws RecognitionException {
		InitdeclaratorContext _localctx = new InitdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_initdeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1650);
			declarator();
			setState(1652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1651);
				initializer();
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

	public static class DeclaratorContext extends ParserRuleContext {
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_declarator);
		try {
			setState(1659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1654);
				ptrdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1655);
				noptrdeclarator(0);
				setState(1656);
				parametersandqualifiers();
				setState(1657);
				trailingreturntype();
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

	public static class PtrdeclaratorContext extends ParserRuleContext {
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public PtrdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPtrdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPtrdeclarator(this);
		}
	}

	public final PtrdeclaratorContext ptrdeclarator() throws RecognitionException {
		PtrdeclaratorContext _localctx = new PtrdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_ptrdeclarator);
		try {
			setState(1665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1661);
				noptrdeclarator(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1662);
				ptroperator();
				setState(1663);
				ptrdeclarator();
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

	public static class NoptrdeclaratorContext extends ParserRuleContext {
		public DeclaratoridContext declaratorid() {
			return getRuleContext(DeclaratoridContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CPP14Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPP14Parser.RightBracket, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoptrdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoptrdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoptrdeclarator(this);
		}
	}

	public final NoptrdeclaratorContext noptrdeclarator() throws RecognitionException {
		return noptrdeclarator(0);
	}

	private NoptrdeclaratorContext noptrdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrdeclaratorContext _localctx = new NoptrdeclaratorContext(_ctx, _parentState);
		NoptrdeclaratorContext _prevctx = _localctx;
		int _startState = 236;
		enterRecursionRule(_localctx, 236, RULE_noptrdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1676);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Ellipsis:
			case Identifier:
				{
				setState(1668);
				declaratorid();
				setState(1670);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1669);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case LeftParen:
				{
				setState(1672);
				match(LeftParen);
				setState(1673);
				ptrdeclarator();
				setState(1674);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1691);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1689);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1678);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1679);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1680);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1681);
						match(LeftBracket);
						setState(1683);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
							{
							setState(1682);
							constantexpression();
							}
						}

						setState(1685);
						match(RightBracket);
						setState(1687);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
						case 1:
							{
							setState(1686);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1693);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
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

	public static class ParametersandqualifiersContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ParameterdeclarationclauseContext parameterdeclarationclause() {
			return getRuleContext(ParameterdeclarationclauseContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public RefqualifierContext refqualifier() {
			return getRuleContext(RefqualifierContext.class,0);
		}
		public ExceptionspecificationContext exceptionspecification() {
			return getRuleContext(ExceptionspecificationContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ParametersandqualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersandqualifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterParametersandqualifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitParametersandqualifiers(this);
		}
	}

	public final ParametersandqualifiersContext parametersandqualifiers() throws RecognitionException {
		ParametersandqualifiersContext _localctx = new ParametersandqualifiersContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_parametersandqualifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
			match(LeftParen);
			setState(1695);
			parameterdeclarationclause();
			setState(1696);
			match(RightParen);
			setState(1698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				setState(1697);
				cvqualifierseq();
				}
				break;
			}
			setState(1701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1700);
				refqualifier();
				}
				break;
			}
			setState(1704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1703);
				exceptionspecification();
				}
				break;
			}
			setState(1707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1706);
				attributespecifierseq(0);
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

	public static class TrailingreturntypeContext extends ParserRuleContext {
		public TerminalNode Arrow() { return getToken(CPP14Parser.Arrow, 0); }
		public TrailingtypespecifierseqContext trailingtypespecifierseq() {
			return getRuleContext(TrailingtypespecifierseqContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public TrailingreturntypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingreturntype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTrailingreturntype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTrailingreturntype(this);
		}
	}

	public final TrailingreturntypeContext trailingreturntype() throws RecognitionException {
		TrailingreturntypeContext _localctx = new TrailingreturntypeContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_trailingreturntype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1709);
			match(Arrow);
			setState(1710);
			trailingtypespecifierseq();
			setState(1712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1711);
				abstractdeclarator();
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

	public static class PtroperatorContext extends ParserRuleContext {
		public TerminalNode Star() { return getToken(CPP14Parser.Star, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public TerminalNode And() { return getToken(CPP14Parser.And, 0); }
		public TerminalNode AndAnd() { return getToken(CPP14Parser.AndAnd, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public PtroperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptroperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPtroperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPtroperator(this);
		}
	}

	public final PtroperatorContext ptroperator() throws RecognitionException {
		PtroperatorContext _localctx = new PtroperatorContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_ptroperator);
		try {
			setState(1737);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Star:
				enterOuterAlt(_localctx, 1);
				{
				setState(1714);
				match(Star);
				setState(1716);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1715);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1719);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1718);
					cvqualifierseq();
					}
					break;
				}
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(1721);
				match(And);
				setState(1723);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1722);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case AndAnd:
				enterOuterAlt(_localctx, 3);
				{
				setState(1725);
				match(AndAnd);
				setState(1727);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1726);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case Decltype:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(1729);
				nestednamespecifier(0);
				setState(1730);
				match(Star);
				setState(1732);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1731);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1735);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1734);
					cvqualifierseq();
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

	public static class CvqualifierseqContext extends ParserRuleContext {
		public CvqualifierContext cvqualifier() {
			return getRuleContext(CvqualifierContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public CvqualifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvqualifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCvqualifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCvqualifierseq(this);
		}
	}

	public final CvqualifierseqContext cvqualifierseq() throws RecognitionException {
		CvqualifierseqContext _localctx = new CvqualifierseqContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_cvqualifierseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1739);
			cvqualifier();
			setState(1741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1740);
				cvqualifierseq();
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

	public static class CvqualifierContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(CPP14Parser.Const, 0); }
		public TerminalNode Volatile() { return getToken(CPP14Parser.Volatile, 0); }
		public CvqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvqualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCvqualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCvqualifier(this);
		}
	}

	public final CvqualifierContext cvqualifier() throws RecognitionException {
		CvqualifierContext _localctx = new CvqualifierContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_cvqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1743);
			_la = _input.LA(1);
			if ( !(_la==Const || _la==Volatile) ) {
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

	public static class RefqualifierContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(CPP14Parser.And, 0); }
		public TerminalNode AndAnd() { return getToken(CPP14Parser.AndAnd, 0); }
		public RefqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refqualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterRefqualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitRefqualifier(this);
		}
	}

	public final RefqualifierContext refqualifier() throws RecognitionException {
		RefqualifierContext _localctx = new RefqualifierContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_refqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1745);
			_la = _input.LA(1);
			if ( !(_la==And || _la==AndAnd) ) {
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

	public static class DeclaratoridContext extends ParserRuleContext {
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(CPP14Parser.Ellipsis, 0); }
		public DeclaratoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaratorid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclaratorid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclaratorid(this);
		}
	}

	public final DeclaratoridContext declaratorid() throws RecognitionException {
		DeclaratoridContext _localctx = new DeclaratoridContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_declaratorid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1747);
				match(Ellipsis);
				}
			}

			setState(1750);
			idexpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeidContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public TypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypeid(this);
		}
	}

	public final TypeidContext typeid() throws RecognitionException {
		TypeidContext _localctx = new TypeidContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_typeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			typespecifierseq();
			setState(1754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1753);
				abstractdeclarator();
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

	public static class AbstractdeclaratorContext extends ParserRuleContext {
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public AbstractpackdeclaratorContext abstractpackdeclarator() {
			return getRuleContext(AbstractpackdeclaratorContext.class,0);
		}
		public AbstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAbstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAbstractdeclarator(this);
		}
	}

	public final AbstractdeclaratorContext abstractdeclarator() throws RecognitionException {
		AbstractdeclaratorContext _localctx = new AbstractdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_abstractdeclarator);
		try {
			setState(1764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1756);
				ptrabstractdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1758);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1757);
					noptrabstractdeclarator(0);
					}
					break;
				}
				setState(1760);
				parametersandqualifiers();
				setState(1761);
				trailingreturntype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1763);
				abstractpackdeclarator();
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

	public static class PtrabstractdeclaratorContext extends ParserRuleContext {
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public PtrabstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrabstractdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPtrabstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPtrabstractdeclarator(this);
		}
	}

	public final PtrabstractdeclaratorContext ptrabstractdeclarator() throws RecognitionException {
		PtrabstractdeclaratorContext _localctx = new PtrabstractdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_ptrabstractdeclarator);
		try {
			setState(1771);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1766);
				noptrabstractdeclarator(0);
				}
				break;
			case Decltype:
			case Star:
			case And:
			case AndAnd:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1767);
				ptroperator();
				setState(1769);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1768);
					ptrabstractdeclarator();
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

	public static class NoptrabstractdeclaratorContext extends ParserRuleContext {
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CPP14Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPP14Parser.RightBracket, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public NoptrabstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrabstractdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoptrabstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoptrabstractdeclarator(this);
		}
	}

	public final NoptrabstractdeclaratorContext noptrabstractdeclarator() throws RecognitionException {
		return noptrabstractdeclarator(0);
	}

	private NoptrabstractdeclaratorContext noptrabstractdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrabstractdeclaratorContext _localctx = new NoptrabstractdeclaratorContext(_ctx, _parentState);
		NoptrabstractdeclaratorContext _prevctx = _localctx;
		int _startState = 258;
		enterRecursionRule(_localctx, 258, RULE_noptrabstractdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1774);
				parametersandqualifiers();
				}
				break;
			case 2:
				{
				setState(1775);
				match(LeftBracket);
				setState(1777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(1776);
					constantexpression();
					}
				}

				setState(1779);
				match(RightBracket);
				setState(1781);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1780);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1783);
				match(LeftParen);
				setState(1784);
				ptrabstractdeclarator();
				setState(1785);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1802);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1800);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1789);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1790);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1791);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1792);
						match(LeftBracket);
						setState(1794);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
							{
							setState(1793);
							constantexpression();
							}
						}

						setState(1796);
						match(RightBracket);
						setState(1798);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
						case 1:
							{
							setState(1797);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1804);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
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

	public static class AbstractpackdeclaratorContext extends ParserRuleContext {
		public NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() {
			return getRuleContext(NoptrabstractpackdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public AbstractpackdeclaratorContext abstractpackdeclarator() {
			return getRuleContext(AbstractpackdeclaratorContext.class,0);
		}
		public AbstractpackdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractpackdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAbstractpackdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAbstractpackdeclarator(this);
		}
	}

	public final AbstractpackdeclaratorContext abstractpackdeclarator() throws RecognitionException {
		AbstractpackdeclaratorContext _localctx = new AbstractpackdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_abstractpackdeclarator);
		try {
			setState(1809);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ellipsis:
				enterOuterAlt(_localctx, 1);
				{
				setState(1805);
				noptrabstractpackdeclarator(0);
				}
				break;
			case Decltype:
			case Star:
			case And:
			case AndAnd:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1806);
				ptroperator();
				setState(1807);
				abstractpackdeclarator();
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

	public static class NoptrabstractpackdeclaratorContext extends ParserRuleContext {
		public TerminalNode Ellipsis() { return getToken(CPP14Parser.Ellipsis, 0); }
		public NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() {
			return getRuleContext(NoptrabstractpackdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CPP14Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPP14Parser.RightBracket, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NoptrabstractpackdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrabstractpackdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoptrabstractpackdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoptrabstractpackdeclarator(this);
		}
	}

	public final NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() throws RecognitionException {
		return noptrabstractpackdeclarator(0);
	}

	private NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrabstractpackdeclaratorContext _localctx = new NoptrabstractpackdeclaratorContext(_ctx, _parentState);
		NoptrabstractpackdeclaratorContext _prevctx = _localctx;
		int _startState = 262;
		enterRecursionRule(_localctx, 262, RULE_noptrabstractpackdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1812);
			match(Ellipsis);
			}
			_ctx.stop = _input.LT(-1);
			setState(1827);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1825);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1814);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1815);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1816);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1817);
						match(LeftBracket);
						setState(1819);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
							{
							setState(1818);
							constantexpression();
							}
						}

						setState(1821);
						match(RightBracket);
						setState(1823);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
						case 1:
							{
							setState(1822);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1829);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
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

	public static class ParameterdeclarationclauseContext extends ParserRuleContext {
		public ParameterdeclarationlistContext parameterdeclarationlist() {
			return getRuleContext(ParameterdeclarationlistContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(CPP14Parser.Ellipsis, 0); }
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public ParameterdeclarationclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclarationclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterParameterdeclarationclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitParameterdeclarationclause(this);
		}
	}

	public final ParameterdeclarationclauseContext parameterdeclarationclause() throws RecognitionException {
		ParameterdeclarationclauseContext _localctx = new ParameterdeclarationclauseContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_parameterdeclarationclause);
		int _la;
		try {
			setState(1840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftBracket - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(1830);
					parameterdeclarationlist(0);
					}
				}

				setState(1834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1833);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1836);
				parameterdeclarationlist(0);
				setState(1837);
				match(Comma);
				setState(1838);
				match(Ellipsis);
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

	public static class ParameterdeclarationlistContext extends ParserRuleContext {
		public ParameterdeclarationContext parameterdeclaration() {
			return getRuleContext(ParameterdeclarationContext.class,0);
		}
		public ParameterdeclarationlistContext parameterdeclarationlist() {
			return getRuleContext(ParameterdeclarationlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public ParameterdeclarationlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclarationlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterParameterdeclarationlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitParameterdeclarationlist(this);
		}
	}

	public final ParameterdeclarationlistContext parameterdeclarationlist() throws RecognitionException {
		return parameterdeclarationlist(0);
	}

	private ParameterdeclarationlistContext parameterdeclarationlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterdeclarationlistContext _localctx = new ParameterdeclarationlistContext(_ctx, _parentState);
		ParameterdeclarationlistContext _prevctx = _localctx;
		int _startState = 266;
		enterRecursionRule(_localctx, 266, RULE_parameterdeclarationlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1843);
			parameterdeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1850);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterdeclarationlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterdeclarationlist);
					setState(1845);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1846);
					match(Comma);
					setState(1847);
					parameterdeclaration();
					}
					} 
				}
				setState(1852);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
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

	public static class ParameterdeclarationContext extends ParserRuleContext {
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public ParameterdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterParameterdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitParameterdeclaration(this);
		}
	}

	public final ParameterdeclarationContext parameterdeclaration() throws RecognitionException {
		ParameterdeclarationContext _localctx = new ParameterdeclarationContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_parameterdeclaration);
		int _la;
		try {
			setState(1884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1853);
					attributespecifierseq(0);
					}
				}

				setState(1856);
				declspecifierseq();
				setState(1857);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1860);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1859);
					attributespecifierseq(0);
					}
				}

				setState(1862);
				declspecifierseq();
				setState(1863);
				declarator();
				setState(1864);
				match(Assign);
				setState(1865);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1867);
					attributespecifierseq(0);
					}
				}

				setState(1870);
				declspecifierseq();
				setState(1872);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1871);
					abstractdeclarator();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1874);
					attributespecifierseq(0);
					}
				}

				setState(1877);
				declspecifierseq();
				setState(1879);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LeftParen - 77)) | (1L << (LeftBracket - 77)) | (1L << (Star - 77)) | (1L << (And - 77)) | (1L << (AndAnd - 77)) | (1L << (Doublecolon - 77)) | (1L << (Ellipsis - 77)) | (1L << (Identifier - 77)))) != 0)) {
					{
					setState(1878);
					abstractdeclarator();
					}
				}

				setState(1881);
				match(Assign);
				setState(1882);
				initializerclause();
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

	public static class FunctiondefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public FunctiondefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterFunctiondefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitFunctiondefinition(this);
		}
	}

	public final FunctiondefinitionContext functiondefinition() throws RecognitionException {
		FunctiondefinitionContext _localctx = new FunctiondefinitionContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_functiondefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1886);
				attributespecifierseq(0);
				}
			}

			setState(1890);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(1889);
				declspecifierseq();
				}
				break;
			}
			setState(1892);
			declarator();
			setState(1894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Final || _la==Override) {
				{
				setState(1893);
				virtspecifierseq(0);
				}
			}

			setState(1896);
			functionbody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionbodyContext extends ParserRuleContext {
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public CtorinitializerContext ctorinitializer() {
			return getRuleContext(CtorinitializerContext.class,0);
		}
		public FunctiontryblockContext functiontryblock() {
			return getRuleContext(FunctiontryblockContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public TerminalNode Default() { return getToken(CPP14Parser.Default, 0); }
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public TerminalNode Delete() { return getToken(CPP14Parser.Delete, 0); }
		public FunctionbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterFunctionbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitFunctionbody(this);
		}
	}

	public final FunctionbodyContext functionbody() throws RecognitionException {
		FunctionbodyContext _localctx = new FunctionbodyContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_functionbody);
		int _la;
		try {
			setState(1909);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1899);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1898);
					ctorinitializer();
					}
				}

				setState(1901);
				compoundstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1902);
				functiontryblock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1903);
				match(Assign);
				setState(1904);
				match(Default);
				setState(1905);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1906);
				match(Assign);
				setState(1907);
				match(Delete);
				setState(1908);
				match(Semi);
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

	public static class InitializerContext extends ParserRuleContext {
		public BraceorequalinitializerContext braceorequalinitializer() {
			return getRuleContext(BraceorequalinitializerContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_initializer);
		try {
			setState(1916);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1911);
				braceorequalinitializer();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(1912);
				match(LeftParen);
				setState(1913);
				expressionlist();
				setState(1914);
				match(RightParen);
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

	public static class BraceorequalinitializerContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public BraceorequalinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braceorequalinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBraceorequalinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBraceorequalinitializer(this);
		}
	}

	public final BraceorequalinitializerContext braceorequalinitializer() throws RecognitionException {
		BraceorequalinitializerContext _localctx = new BraceorequalinitializerContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_braceorequalinitializer);
		try {
			setState(1921);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1918);
				match(Assign);
				setState(1919);
				initializerclause();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1920);
				bracedinitlist();
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

	public static class InitializerclauseContext extends ParserRuleContext {
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public InitializerclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitializerclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitializerclause(this);
		}
	}

	public final InitializerclauseContext initializerclause() throws RecognitionException {
		InitializerclauseContext _localctx = new InitializerclauseContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_initializerclause);
		try {
			setState(1925);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Alignof:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Const_cast:
			case Decltype:
			case Delete:
			case Double:
			case Dynamic_cast:
			case False:
			case Float:
			case Int:
			case Long:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Reinterpret_cast:
			case Short:
			case Signed:
			case Sizeof:
			case Static_cast:
			case This:
			case Throw:
			case True:
			case Typeid:
			case Typename:
			case Unsigned:
			case Void:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Plus:
			case Star:
			case And:
			case Or:
			case Tilde:
			case Not:
			case PlusPlus:
			case MinusMinus:
			case Doublecolon:
			case Identifier:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1923);
				assignmentexpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1924);
				bracedinitlist();
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

	public static class InitializerlistContext extends ParserRuleContext {
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(CPP14Parser.Ellipsis, 0); }
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public InitializerlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitializerlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitializerlist(this);
		}
	}

	public final InitializerlistContext initializerlist() throws RecognitionException {
		return initializerlist(0);
	}

	private InitializerlistContext initializerlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitializerlistContext _localctx = new InitializerlistContext(_ctx, _parentState);
		InitializerlistContext _prevctx = _localctx;
		int _startState = 280;
		enterRecursionRule(_localctx, 280, RULE_initializerlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1928);
			initializerclause();
			setState(1930);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(1929);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1940);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerlist);
					setState(1932);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1933);
					match(Comma);
					setState(1934);
					initializerclause();
					setState(1936);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
					case 1:
						{
						setState(1935);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(1942);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
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

	public static class BracedinitlistContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(CPP14Parser.LeftBrace, 0); }
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CPP14Parser.RightBrace, 0); }
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public BracedinitlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracedinitlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBracedinitlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBracedinitlist(this);
		}
	}

	public final BracedinitlistContext bracedinitlist() throws RecognitionException {
		BracedinitlistContext _localctx = new BracedinitlistContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_bracedinitlist);
		int _la;
		try {
			setState(1952);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1943);
				match(LeftBrace);
				setState(1944);
				initializerlist(0);
				setState(1946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1945);
					match(Comma);
					}
				}

				setState(1948);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1950);
				match(LeftBrace);
				setState(1951);
				match(RightBrace);
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

	public static class ClassnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public ClassnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClassname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClassname(this);
		}
	}

	public final ClassnameContext classname() throws RecognitionException {
		ClassnameContext _localctx = new ClassnameContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_classname);
		try {
			setState(1956);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1954);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1955);
				simpletemplateid();
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

	public static class ClassspecifierContext extends ParserRuleContext {
		public ClassheadContext classhead() {
			return getRuleContext(ClassheadContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(CPP14Parser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CPP14Parser.RightBrace, 0); }
		public MemberspecificationContext memberspecification() {
			return getRuleContext(MemberspecificationContext.class,0);
		}
		public ClassspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClassspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClassspecifier(this);
		}
	}

	public final ClassspecifierContext classspecifier() throws RecognitionException {
		ClassspecifierContext _localctx = new ClassspecifierContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_classspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1958);
			classhead();
			setState(1959);
			match(LeftBrace);
			setState(1961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Colon - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(1960);
				memberspecification();
				}
			}

			setState(1963);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassheadContext extends ParserRuleContext {
		public ClasskeyContext classkey() {
			return getRuleContext(ClasskeyContext.class,0);
		}
		public ClassheadnameContext classheadname() {
			return getRuleContext(ClassheadnameContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ClassvirtspecifierContext classvirtspecifier() {
			return getRuleContext(ClassvirtspecifierContext.class,0);
		}
		public BaseclauseContext baseclause() {
			return getRuleContext(BaseclauseContext.class,0);
		}
		public ClassheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classhead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClasshead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClasshead(this);
		}
	}

	public final ClassheadContext classhead() throws RecognitionException {
		ClassheadContext _localctx = new ClassheadContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_classhead);
		int _la;
		try {
			setState(1983);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1965);
				classkey();
				setState(1967);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1966);
					attributespecifierseq(0);
					}
				}

				setState(1969);
				classheadname();
				setState(1971);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Final) {
					{
					setState(1970);
					classvirtspecifier();
					}
				}

				setState(1974);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1973);
					baseclause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1976);
				classkey();
				setState(1978);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1977);
					attributespecifierseq(0);
					}
				}

				setState(1981);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1980);
					baseclause();
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

	public static class ClassheadnameContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public ClassheadnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classheadname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClassheadname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClassheadname(this);
		}
	}

	public final ClassheadnameContext classheadname() throws RecognitionException {
		ClassheadnameContext _localctx = new ClassheadnameContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_classheadname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1986);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(1985);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1988);
			classname();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassvirtspecifierContext extends ParserRuleContext {
		public TerminalNode Final() { return getToken(CPP14Parser.Final, 0); }
		public ClassvirtspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classvirtspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClassvirtspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClassvirtspecifier(this);
		}
	}

	public final ClassvirtspecifierContext classvirtspecifier() throws RecognitionException {
		ClassvirtspecifierContext _localctx = new ClassvirtspecifierContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_classvirtspecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1990);
			match(Final);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClasskeyContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(CPP14Parser.Class, 0); }
		public TerminalNode Struct() { return getToken(CPP14Parser.Struct, 0); }
		public TerminalNode Union() { return getToken(CPP14Parser.Union, 0); }
		public ClasskeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classkey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClasskey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClasskey(this);
		}
	}

	public final ClasskeyContext classkey() throws RecognitionException {
		ClasskeyContext _localctx = new ClasskeyContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_classkey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1992);
			_la = _input.LA(1);
			if ( !(((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (Class - 13)) | (1L << (Struct - 13)) | (1L << (Union - 13)))) != 0)) ) {
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

	public static class MemberspecificationContext extends ParserRuleContext {
		public MemberdeclarationContext memberdeclaration() {
			return getRuleContext(MemberdeclarationContext.class,0);
		}
		public MemberspecificationContext memberspecification() {
			return getRuleContext(MemberspecificationContext.class,0);
		}
		public AccessspecifierContext accessspecifier() {
			return getRuleContext(AccessspecifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CPP14Parser.Colon, 0); }
		public MemberspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMemberspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMemberspecification(this);
		}
	}

	public final MemberspecificationContext memberspecification() throws RecognitionException {
		MemberspecificationContext _localctx = new MemberspecificationContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_memberspecification);
		int _la;
		try {
			setState(2003);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Alignas:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Decltype:
			case Double:
			case Enum:
			case Explicit:
			case Extern:
			case Float:
			case Friend:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Operator:
			case Register:
			case Short:
			case Signed:
			case Static:
			case Static_assert:
			case Struct:
			case Template:
			case Thread_local:
			case Typedef:
			case Typename:
			case Union:
			case Unsigned:
			case Using:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Star:
			case And:
			case Tilde:
			case AndAnd:
			case Colon:
			case Doublecolon:
			case Semi:
			case Ellipsis:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1994);
				memberdeclaration();
				setState(1996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Colon - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(1995);
					memberspecification();
					}
				}

				}
				break;
			case Private:
			case Protected:
			case Public:
				enterOuterAlt(_localctx, 2);
				{
				setState(1998);
				accessspecifier();
				setState(1999);
				match(Colon);
				setState(2001);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Colon - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(2000);
					memberspecification();
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

	public static class MemberdeclarationContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(CPP14Parser.Semi, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public MemberdeclaratorlistContext memberdeclaratorlist() {
			return getRuleContext(MemberdeclaratorlistContext.class,0);
		}
		public FunctiondefinitionContext functiondefinition() {
			return getRuleContext(FunctiondefinitionContext.class,0);
		}
		public UsingdeclarationContext usingdeclaration() {
			return getRuleContext(UsingdeclarationContext.class,0);
		}
		public Static_assertdeclarationContext static_assertdeclaration() {
			return getRuleContext(Static_assertdeclarationContext.class,0);
		}
		public TemplatedeclarationContext templatedeclaration() {
			return getRuleContext(TemplatedeclarationContext.class,0);
		}
		public AliasdeclarationContext aliasdeclaration() {
			return getRuleContext(AliasdeclarationContext.class,0);
		}
		public EmptydeclarationContext emptydeclaration() {
			return getRuleContext(EmptydeclarationContext.class,0);
		}
		public MemberdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMemberdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMemberdeclaration(this);
		}
	}

	public final MemberdeclarationContext memberdeclaration() throws RecognitionException {
		MemberdeclarationContext _localctx = new MemberdeclarationContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_memberdeclaration);
		int _la;
		try {
			setState(2021);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2006);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(2005);
					attributespecifierseq(0);
					}
					break;
				}
				setState(2009);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(2008);
					declspecifierseq();
					}
					break;
				}
				setState(2012);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Decltype) | (1L << Operator))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LeftParen - 77)) | (1L << (LeftBracket - 77)) | (1L << (Star - 77)) | (1L << (And - 77)) | (1L << (Tilde - 77)) | (1L << (AndAnd - 77)) | (1L << (Colon - 77)) | (1L << (Doublecolon - 77)) | (1L << (Ellipsis - 77)) | (1L << (Identifier - 77)))) != 0)) {
					{
					setState(2011);
					memberdeclaratorlist(0);
					}
				}

				setState(2014);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2015);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2016);
				usingdeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2017);
				static_assertdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2018);
				templatedeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2019);
				aliasdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2020);
				emptydeclaration();
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

	public static class MemberdeclaratorlistContext extends ParserRuleContext {
		public MemberdeclaratorContext memberdeclarator() {
			return getRuleContext(MemberdeclaratorContext.class,0);
		}
		public MemberdeclaratorlistContext memberdeclaratorlist() {
			return getRuleContext(MemberdeclaratorlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public MemberdeclaratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclaratorlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMemberdeclaratorlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMemberdeclaratorlist(this);
		}
	}

	public final MemberdeclaratorlistContext memberdeclaratorlist() throws RecognitionException {
		return memberdeclaratorlist(0);
	}

	private MemberdeclaratorlistContext memberdeclaratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MemberdeclaratorlistContext _localctx = new MemberdeclaratorlistContext(_ctx, _parentState);
		MemberdeclaratorlistContext _prevctx = _localctx;
		int _startState = 300;
		enterRecursionRule(_localctx, 300, RULE_memberdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2024);
			memberdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(2031);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MemberdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_memberdeclaratorlist);
					setState(2026);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2027);
					match(Comma);
					setState(2028);
					memberdeclarator();
					}
					} 
				}
				setState(2033);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
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

	public static class MemberdeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public PurespecifierContext purespecifier() {
			return getRuleContext(PurespecifierContext.class,0);
		}
		public BraceorequalinitializerContext braceorequalinitializer() {
			return getRuleContext(BraceorequalinitializerContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CPP14Parser.Colon, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public MemberdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMemberdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMemberdeclarator(this);
		}
	}

	public final MemberdeclaratorContext memberdeclarator() throws RecognitionException {
		MemberdeclaratorContext _localctx = new MemberdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_memberdeclarator);
		int _la;
		try {
			setState(2053);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2034);
				declarator();
				setState(2036);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
				case 1:
					{
					setState(2035);
					virtspecifierseq(0);
					}
					break;
				}
				setState(2039);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
				case 1:
					{
					setState(2038);
					purespecifier();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2041);
				declarator();
				setState(2043);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(2042);
					braceorequalinitializer();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2046);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2045);
					match(Identifier);
					}
				}

				setState(2049);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2048);
					attributespecifierseq(0);
					}
				}

				setState(2051);
				match(Colon);
				setState(2052);
				constantexpression();
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

	public static class VirtspecifierseqContext extends ParserRuleContext {
		public VirtspecifierContext virtspecifier() {
			return getRuleContext(VirtspecifierContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public VirtspecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtspecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterVirtspecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitVirtspecifierseq(this);
		}
	}

	public final VirtspecifierseqContext virtspecifierseq() throws RecognitionException {
		return virtspecifierseq(0);
	}

	private VirtspecifierseqContext virtspecifierseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VirtspecifierseqContext _localctx = new VirtspecifierseqContext(_ctx, _parentState);
		VirtspecifierseqContext _prevctx = _localctx;
		int _startState = 304;
		enterRecursionRule(_localctx, 304, RULE_virtspecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2056);
			virtspecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2062);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VirtspecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_virtspecifierseq);
					setState(2058);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2059);
					virtspecifier();
					}
					} 
				}
				setState(2064);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
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

	public static class VirtspecifierContext extends ParserRuleContext {
		public TerminalNode Override() { return getToken(CPP14Parser.Override, 0); }
		public TerminalNode Final() { return getToken(CPP14Parser.Final, 0); }
		public VirtspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterVirtspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitVirtspecifier(this);
		}
	}

	public final VirtspecifierContext virtspecifier() throws RecognitionException {
		VirtspecifierContext _localctx = new VirtspecifierContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_virtspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2065);
			_la = _input.LA(1);
			if ( !(_la==Final || _la==Override) ) {
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

	public static class PurespecifierContext extends ParserRuleContext {
		public Token val;
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public TerminalNode Integerliteral() { return getToken(CPP14Parser.Integerliteral, 0); }
		public PurespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_purespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPurespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPurespecifier(this);
		}
	}

	public final PurespecifierContext purespecifier() throws RecognitionException {
		PurespecifierContext _localctx = new PurespecifierContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_purespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2067);
			match(Assign);
			setState(2068);
			((PurespecifierContext)_localctx).val = match(Integerliteral);
			if((((PurespecifierContext)_localctx).val!=null?((PurespecifierContext)_localctx).val.getText():null).compareTo("0")!=0) throw new InputMismatchException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseclauseContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(CPP14Parser.Colon, 0); }
		public BasespecifierlistContext basespecifierlist() {
			return getRuleContext(BasespecifierlistContext.class,0);
		}
		public BaseclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBaseclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBaseclause(this);
		}
	}

	public final BaseclauseContext baseclause() throws RecognitionException {
		BaseclauseContext _localctx = new BaseclauseContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_baseclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2071);
			match(Colon);
			setState(2072);
			basespecifierlist(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasespecifierlistContext extends ParserRuleContext {
		public BasespecifierContext basespecifier() {
			return getRuleContext(BasespecifierContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(CPP14Parser.Ellipsis, 0); }
		public BasespecifierlistContext basespecifierlist() {
			return getRuleContext(BasespecifierlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public BasespecifierlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basespecifierlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBasespecifierlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBasespecifierlist(this);
		}
	}

	public final BasespecifierlistContext basespecifierlist() throws RecognitionException {
		return basespecifierlist(0);
	}

	private BasespecifierlistContext basespecifierlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BasespecifierlistContext _localctx = new BasespecifierlistContext(_ctx, _parentState);
		BasespecifierlistContext _prevctx = _localctx;
		int _startState = 312;
		enterRecursionRule(_localctx, 312, RULE_basespecifierlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2075);
			basespecifier();
			setState(2077);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(2076);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2087);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BasespecifierlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_basespecifierlist);
					setState(2079);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2080);
					match(Comma);
					setState(2081);
					basespecifier();
					setState(2083);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
					case 1:
						{
						setState(2082);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2089);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
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

	public static class BasespecifierContext extends ParserRuleContext {
		public BasetypespecifierContext basetypespecifier() {
			return getRuleContext(BasetypespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Virtual() { return getToken(CPP14Parser.Virtual, 0); }
		public AccessspecifierContext accessspecifier() {
			return getRuleContext(AccessspecifierContext.class,0);
		}
		public BasespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBasespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBasespecifier(this);
		}
	}

	public final BasespecifierContext basespecifier() throws RecognitionException {
		BasespecifierContext _localctx = new BasespecifierContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_basespecifier);
		int _la;
		try {
			setState(2111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2091);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2090);
					attributespecifierseq(0);
					}
				}

				setState(2093);
				basetypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2094);
					attributespecifierseq(0);
					}
				}

				setState(2097);
				match(Virtual);
				setState(2099);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) {
					{
					setState(2098);
					accessspecifier();
					}
				}

				setState(2101);
				basetypespecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2102);
					attributespecifierseq(0);
					}
				}

				setState(2105);
				accessspecifier();
				setState(2107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Virtual) {
					{
					setState(2106);
					match(Virtual);
					}
				}

				setState(2109);
				basetypespecifier();
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

	public static class ClassordecltypeContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public ClassordecltypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classordecltype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClassordecltype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClassordecltype(this);
		}
	}

	public final ClassordecltypeContext classordecltype() throws RecognitionException {
		ClassordecltypeContext _localctx = new ClassordecltypeContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_classordecltype);
		try {
			setState(2118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2114);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
				case 1:
					{
					setState(2113);
					nestednamespecifier(0);
					}
					break;
				}
				setState(2116);
				classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2117);
				decltypespecifier();
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

	public static class BasetypespecifierContext extends ParserRuleContext {
		public ClassordecltypeContext classordecltype() {
			return getRuleContext(ClassordecltypeContext.class,0);
		}
		public BasetypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basetypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBasetypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBasetypespecifier(this);
		}
	}

	public final BasetypespecifierContext basetypespecifier() throws RecognitionException {
		BasetypespecifierContext _localctx = new BasetypespecifierContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_basetypespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2120);
			classordecltype();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessspecifierContext extends ParserRuleContext {
		public TerminalNode Private() { return getToken(CPP14Parser.Private, 0); }
		public TerminalNode Protected() { return getToken(CPP14Parser.Protected, 0); }
		public TerminalNode Public() { return getToken(CPP14Parser.Public, 0); }
		public AccessspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAccessspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAccessspecifier(this);
		}
	}

	public final AccessspecifierContext accessspecifier() throws RecognitionException {
		AccessspecifierContext _localctx = new AccessspecifierContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_accessspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2122);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) ) {
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

	public static class ConversionfunctionidContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(CPP14Parser.Operator, 0); }
		public ConversiontypeidContext conversiontypeid() {
			return getRuleContext(ConversiontypeidContext.class,0);
		}
		public ConversionfunctionidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversionfunctionid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterConversionfunctionid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitConversionfunctionid(this);
		}
	}

	public final ConversionfunctionidContext conversionfunctionid() throws RecognitionException {
		ConversionfunctionidContext _localctx = new ConversionfunctionidContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_conversionfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2124);
			match(Operator);
			setState(2125);
			conversiontypeid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversiontypeidContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public ConversiondeclaratorContext conversiondeclarator() {
			return getRuleContext(ConversiondeclaratorContext.class,0);
		}
		public ConversiontypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversiontypeid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterConversiontypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitConversiontypeid(this);
		}
	}

	public final ConversiontypeidContext conversiontypeid() throws RecognitionException {
		ConversiontypeidContext _localctx = new ConversiontypeidContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_conversiontypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2127);
			typespecifierseq();
			setState(2129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				{
				setState(2128);
				conversiondeclarator();
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

	public static class ConversiondeclaratorContext extends ParserRuleContext {
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public ConversiondeclaratorContext conversiondeclarator() {
			return getRuleContext(ConversiondeclaratorContext.class,0);
		}
		public ConversiondeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversiondeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterConversiondeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitConversiondeclarator(this);
		}
	}

	public final ConversiondeclaratorContext conversiondeclarator() throws RecognitionException {
		ConversiondeclaratorContext _localctx = new ConversiondeclaratorContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_conversiondeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2131);
			ptroperator();
			setState(2133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
			case 1:
				{
				setState(2132);
				conversiondeclarator();
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

	public static class CtorinitializerContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(CPP14Parser.Colon, 0); }
		public MeminitializerlistContext meminitializerlist() {
			return getRuleContext(MeminitializerlistContext.class,0);
		}
		public CtorinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctorinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCtorinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCtorinitializer(this);
		}
	}

	public final CtorinitializerContext ctorinitializer() throws RecognitionException {
		CtorinitializerContext _localctx = new CtorinitializerContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_ctorinitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2135);
			match(Colon);
			setState(2136);
			meminitializerlist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeminitializerlistContext extends ParserRuleContext {
		public MeminitializerContext meminitializer() {
			return getRuleContext(MeminitializerContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(CPP14Parser.Ellipsis, 0); }
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public MeminitializerlistContext meminitializerlist() {
			return getRuleContext(MeminitializerlistContext.class,0);
		}
		public MeminitializerlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMeminitializerlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMeminitializerlist(this);
		}
	}

	public final MeminitializerlistContext meminitializerlist() throws RecognitionException {
		MeminitializerlistContext _localctx = new MeminitializerlistContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_meminitializerlist);
		int _la;
		try {
			setState(2149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2138);
				meminitializer();
				setState(2140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2139);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2142);
				meminitializer();
				setState(2144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2143);
					match(Ellipsis);
					}
				}

				setState(2146);
				match(Comma);
				setState(2147);
				meminitializerlist();
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

	public static class MeminitializerContext extends ParserRuleContext {
		public MeminitializeridContext meminitializerid() {
			return getRuleContext(MeminitializeridContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public MeminitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMeminitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMeminitializer(this);
		}
	}

	public final MeminitializerContext meminitializer() throws RecognitionException {
		MeminitializerContext _localctx = new MeminitializerContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_meminitializer);
		int _la;
		try {
			setState(2161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2151);
				meminitializerid();
				setState(2152);
				match(LeftParen);
				setState(2154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(2153);
					expressionlist();
					}
				}

				setState(2156);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2158);
				meminitializerid();
				setState(2159);
				bracedinitlist();
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

	public static class MeminitializeridContext extends ParserRuleContext {
		public ClassordecltypeContext classordecltype() {
			return getRuleContext(ClassordecltypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public MeminitializeridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMeminitializerid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMeminitializerid(this);
		}
	}

	public final MeminitializeridContext meminitializerid() throws RecognitionException {
		MeminitializeridContext _localctx = new MeminitializeridContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_meminitializerid);
		try {
			setState(2165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2163);
				classordecltype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2164);
				match(Identifier);
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

	public static class OperatorfunctionidContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(CPP14Parser.Operator, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public OperatorfunctionidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorfunctionid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterOperatorfunctionid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitOperatorfunctionid(this);
		}
	}

	public final OperatorfunctionidContext operatorfunctionid() throws RecognitionException {
		OperatorfunctionidContext _localctx = new OperatorfunctionidContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_operatorfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2167);
			match(Operator);
			setState(2168);
			operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteraloperatoridContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(CPP14Parser.Operator, 0); }
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Userdefinedstringliteral() { return getToken(CPP14Parser.Userdefinedstringliteral, 0); }
		public LiteraloperatoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literaloperatorid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLiteraloperatorid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLiteraloperatorid(this);
		}
	}

	public final LiteraloperatoridContext literaloperatorid() throws RecognitionException {
		LiteraloperatoridContext _localctx = new LiteraloperatoridContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_literaloperatorid);
		try {
			setState(2175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2170);
				match(Operator);
				setState(2171);
				match(Stringliteral);
				setState(2172);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2173);
				match(Operator);
				setState(2174);
				match(Userdefinedstringliteral);
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

	public static class TemplatedeclarationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TerminalNode Less() { return getToken(CPP14Parser.Less, 0); }
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public TerminalNode Greater() { return getToken(CPP14Parser.Greater, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TemplatedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatedeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplatedeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplatedeclaration(this);
		}
	}

	public final TemplatedeclarationContext templatedeclaration() throws RecognitionException {
		TemplatedeclarationContext _localctx = new TemplatedeclarationContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_templatedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2177);
			match(Template);
			setState(2178);
			match(Less);
			setState(2179);
			templateparameterlist(0);
			setState(2180);
			match(Greater);
			setState(2181);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateparameterlistContext extends ParserRuleContext {
		public TemplateparameterContext templateparameter() {
			return getRuleContext(TemplateparameterContext.class,0);
		}
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public TemplateparameterlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateparameterlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplateparameterlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplateparameterlist(this);
		}
	}

	public final TemplateparameterlistContext templateparameterlist() throws RecognitionException {
		return templateparameterlist(0);
	}

	private TemplateparameterlistContext templateparameterlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TemplateparameterlistContext _localctx = new TemplateparameterlistContext(_ctx, _parentState);
		TemplateparameterlistContext _prevctx = _localctx;
		int _startState = 342;
		enterRecursionRule(_localctx, 342, RULE_templateparameterlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2184);
			templateparameter();
			}
			_ctx.stop = _input.LT(-1);
			setState(2191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateparameterlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateparameterlist);
					setState(2186);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2187);
					match(Comma);
					setState(2188);
					templateparameter();
					}
					} 
				}
				setState(2193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
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

	public static class TemplateparameterContext extends ParserRuleContext {
		public TypeparameterContext typeparameter() {
			return getRuleContext(TypeparameterContext.class,0);
		}
		public ParameterdeclarationContext parameterdeclaration() {
			return getRuleContext(ParameterdeclarationContext.class,0);
		}
		public TemplateparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplateparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplateparameter(this);
		}
	}

	public final TemplateparameterContext templateparameter() throws RecognitionException {
		TemplateparameterContext _localctx = new TemplateparameterContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_templateparameter);
		try {
			setState(2196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2194);
				typeparameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2195);
				parameterdeclaration();
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

	public static class TypeparameterContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(CPP14Parser.Class, 0); }
		public TerminalNode Ellipsis() { return getToken(CPP14Parser.Ellipsis, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode Typename() { return getToken(CPP14Parser.Typename, 0); }
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TerminalNode Less() { return getToken(CPP14Parser.Less, 0); }
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public TerminalNode Greater() { return getToken(CPP14Parser.Greater, 0); }
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TypeparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypeparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypeparameter(this);
		}
	}

	public final TypeparameterContext typeparameter() throws RecognitionException {
		TypeparameterContext _localctx = new TypeparameterContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_typeparameter);
		int _la;
		try {
			setState(2246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2198);
				match(Class);
				setState(2200);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
				case 1:
					{
					setState(2199);
					match(Ellipsis);
					}
					break;
				}
				setState(2203);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
				case 1:
					{
					setState(2202);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2205);
				match(Class);
				setState(2207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2206);
					match(Identifier);
					}
				}

				setState(2209);
				match(Assign);
				setState(2210);
				typeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2211);
				match(Typename);
				setState(2213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
				case 1:
					{
					setState(2212);
					match(Ellipsis);
					}
					break;
				}
				setState(2216);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(2215);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2218);
				match(Typename);
				setState(2220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2219);
					match(Identifier);
					}
				}

				setState(2222);
				match(Assign);
				setState(2223);
				typeid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2224);
				match(Template);
				setState(2225);
				match(Less);
				setState(2226);
				templateparameterlist(0);
				setState(2227);
				match(Greater);
				setState(2228);
				match(Class);
				setState(2230);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
				case 1:
					{
					setState(2229);
					match(Ellipsis);
					}
					break;
				}
				setState(2233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(2232);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2235);
				match(Template);
				setState(2236);
				match(Less);
				setState(2237);
				templateparameterlist(0);
				setState(2238);
				match(Greater);
				setState(2239);
				match(Class);
				setState(2241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2240);
					match(Identifier);
					}
				}

				setState(2243);
				match(Assign);
				setState(2244);
				idexpression();
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

	public static class SimpletemplateidContext extends ParserRuleContext {
		public TemplatenameContext templatename() {
			return getRuleContext(TemplatenameContext.class,0);
		}
		public TerminalNode Less() { return getToken(CPP14Parser.Less, 0); }
		public TerminalNode Greater() { return getToken(CPP14Parser.Greater, 0); }
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public SimpletemplateidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpletemplateid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterSimpletemplateid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitSimpletemplateid(this);
		}
	}

	public final SimpletemplateidContext simpletemplateid() throws RecognitionException {
		SimpletemplateidContext _localctx = new SimpletemplateidContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_simpletemplateid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2248);
			templatename();
			setState(2249);
			match(Less);
			setState(2251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << Struct) | (1L << This))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
				{
				setState(2250);
				templateargumentlist(0);
				}
			}

			setState(2253);
			match(Greater);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateidContext extends ParserRuleContext {
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public OperatorfunctionidContext operatorfunctionid() {
			return getRuleContext(OperatorfunctionidContext.class,0);
		}
		public TerminalNode Less() { return getToken(CPP14Parser.Less, 0); }
		public TerminalNode Greater() { return getToken(CPP14Parser.Greater, 0); }
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public LiteraloperatoridContext literaloperatorid() {
			return getRuleContext(LiteraloperatoridContext.class,0);
		}
		public TemplateidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplateid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplateid(this);
		}
	}

	public final TemplateidContext templateid() throws RecognitionException {
		TemplateidContext _localctx = new TemplateidContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_templateid);
		int _la;
		try {
			setState(2270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2255);
				simpletemplateid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2256);
				operatorfunctionid();
				setState(2257);
				match(Less);
				setState(2259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << Struct) | (1L << This))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(2258);
					templateargumentlist(0);
					}
				}

				setState(2261);
				match(Greater);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2263);
				literaloperatorid();
				setState(2264);
				match(Less);
				setState(2266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << Struct) | (1L << This))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(2265);
					templateargumentlist(0);
					}
				}

				setState(2268);
				match(Greater);
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

	public static class TemplatenameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TemplatenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplatename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplatename(this);
		}
	}

	public final TemplatenameContext templatename() throws RecognitionException {
		TemplatenameContext _localctx = new TemplatenameContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_templatename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2272);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateargumentlistContext extends ParserRuleContext {
		public TemplateargumentContext templateargument() {
			return getRuleContext(TemplateargumentContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(CPP14Parser.Ellipsis, 0); }
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public TemplateargumentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateargumentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplateargumentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplateargumentlist(this);
		}
	}

	public final TemplateargumentlistContext templateargumentlist() throws RecognitionException {
		return templateargumentlist(0);
	}

	private TemplateargumentlistContext templateargumentlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TemplateargumentlistContext _localctx = new TemplateargumentlistContext(_ctx, _parentState);
		TemplateargumentlistContext _prevctx = _localctx;
		int _startState = 354;
		enterRecursionRule(_localctx, 354, RULE_templateargumentlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2275);
			templateargument();
			setState(2277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				{
				setState(2276);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateargumentlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateargumentlist);
					setState(2279);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2280);
					match(Comma);
					setState(2281);
					templateargument();
					setState(2283);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
					case 1:
						{
						setState(2282);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
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

	public static class TemplateargumentContext extends ParserRuleContext {
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TemplateargumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateargument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplateargument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplateargument(this);
		}
	}

	public final TemplateargumentContext templateargument() throws RecognitionException {
		TemplateargumentContext _localctx = new TemplateargumentContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_templateargument);
		try {
			setState(2293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2290);
				constantexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2291);
				typeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2292);
				idexpression();
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

	public static class TypenamespecifierContext extends ParserRuleContext {
		public TerminalNode Typename() { return getToken(CPP14Parser.Typename, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TypenamespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typenamespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypenamespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypenamespecifier(this);
		}
	}

	public final TypenamespecifierContext typenamespecifier() throws RecognitionException {
		TypenamespecifierContext _localctx = new TypenamespecifierContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_typenamespecifier);
		int _la;
		try {
			setState(2306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2295);
				match(Typename);
				setState(2296);
				nestednamespecifier(0);
				setState(2297);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2299);
				match(Typename);
				setState(2300);
				nestednamespecifier(0);
				setState(2302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(2301);
					match(Template);
					}
				}

				setState(2304);
				simpletemplateid();
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

	public static class ExplicitinstantiationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Extern() { return getToken(CPP14Parser.Extern, 0); }
		public ExplicitinstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitinstantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExplicitinstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExplicitinstantiation(this);
		}
	}

	public final ExplicitinstantiationContext explicitinstantiation() throws RecognitionException {
		ExplicitinstantiationContext _localctx = new ExplicitinstantiationContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_explicitinstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extern) {
				{
				setState(2308);
				match(Extern);
				}
			}

			setState(2311);
			match(Template);
			setState(2312);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitspecializationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TerminalNode Less() { return getToken(CPP14Parser.Less, 0); }
		public TerminalNode Greater() { return getToken(CPP14Parser.Greater, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExplicitspecializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitspecialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExplicitspecialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExplicitspecialization(this);
		}
	}

	public final ExplicitspecializationContext explicitspecialization() throws RecognitionException {
		ExplicitspecializationContext _localctx = new ExplicitspecializationContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_explicitspecialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2314);
			match(Template);
			setState(2315);
			match(Less);
			setState(2316);
			match(Greater);
			setState(2317);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryblockContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(CPP14Parser.Try, 0); }
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public TryblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTryblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTryblock(this);
		}
	}

	public final TryblockContext tryblock() throws RecognitionException {
		TryblockContext _localctx = new TryblockContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_tryblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2319);
			match(Try);
			setState(2320);
			compoundstatement();
			setState(2321);
			handlerseq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctiontryblockContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(CPP14Parser.Try, 0); }
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public CtorinitializerContext ctorinitializer() {
			return getRuleContext(CtorinitializerContext.class,0);
		}
		public FunctiontryblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiontryblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterFunctiontryblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitFunctiontryblock(this);
		}
	}

	public final FunctiontryblockContext functiontryblock() throws RecognitionException {
		FunctiontryblockContext _localctx = new FunctiontryblockContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_functiontryblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2323);
			match(Try);
			setState(2325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(2324);
				ctorinitializer();
				}
			}

			setState(2327);
			compoundstatement();
			setState(2328);
			handlerseq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HandlerseqContext extends ParserRuleContext {
		public HandlerContext handler() {
			return getRuleContext(HandlerContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public HandlerseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterHandlerseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitHandlerseq(this);
		}
	}

	public final HandlerseqContext handlerseq() throws RecognitionException {
		HandlerseqContext _localctx = new HandlerseqContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_handlerseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2330);
			handler();
			setState(2332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				{
				setState(2331);
				handlerseq();
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

	public static class HandlerContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(CPP14Parser.Catch, 0); }
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ExceptiondeclarationContext exceptiondeclaration() {
			return getRuleContext(ExceptiondeclarationContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public HandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitHandler(this);
		}
	}

	public final HandlerContext handler() throws RecognitionException {
		HandlerContext _localctx = new HandlerContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_handler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2334);
			match(Catch);
			setState(2335);
			match(LeftParen);
			setState(2336);
			exceptiondeclaration();
			setState(2337);
			match(RightParen);
			setState(2338);
			compoundstatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptiondeclarationContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(CPP14Parser.Ellipsis, 0); }
		public ExceptiondeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptiondeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExceptiondeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExceptiondeclaration(this);
		}
	}

	public final ExceptiondeclarationContext exceptiondeclaration() throws RecognitionException {
		ExceptiondeclarationContext _localctx = new ExceptiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_exceptiondeclaration);
		int _la;
		try {
			setState(2354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2340);
					attributespecifierseq(0);
					}
				}

				setState(2343);
				typespecifierseq();
				setState(2344);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2346);
					attributespecifierseq(0);
					}
				}

				setState(2349);
				typespecifierseq();
				setState(2351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LeftParen - 77)) | (1L << (LeftBracket - 77)) | (1L << (Star - 77)) | (1L << (And - 77)) | (1L << (AndAnd - 77)) | (1L << (Doublecolon - 77)) | (1L << (Ellipsis - 77)) | (1L << (Identifier - 77)))) != 0)) {
					{
					setState(2350);
					abstractdeclarator();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2353);
				match(Ellipsis);
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

	public static class ThrowexpressionContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(CPP14Parser.Throw, 0); }
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ThrowexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterThrowexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitThrowexpression(this);
		}
	}

	public final ThrowexpressionContext throwexpression() throws RecognitionException {
		ThrowexpressionContext _localctx = new ThrowexpressionContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_throwexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2356);
			match(Throw);
			setState(2358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				{
				setState(2357);
				assignmentexpression();
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

	public static class ExceptionspecificationContext extends ParserRuleContext {
		public DynamicexceptionspecificationContext dynamicexceptionspecification() {
			return getRuleContext(DynamicexceptionspecificationContext.class,0);
		}
		public NoexceptspecificationContext noexceptspecification() {
			return getRuleContext(NoexceptspecificationContext.class,0);
		}
		public ExceptionspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExceptionspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExceptionspecification(this);
		}
	}

	public final ExceptionspecificationContext exceptionspecification() throws RecognitionException {
		ExceptionspecificationContext _localctx = new ExceptionspecificationContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_exceptionspecification);
		try {
			setState(2362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(2360);
				dynamicexceptionspecification();
				}
				break;
			case Noexcept:
				enterOuterAlt(_localctx, 2);
				{
				setState(2361);
				noexceptspecification();
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

	public static class DynamicexceptionspecificationContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(CPP14Parser.Throw, 0); }
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public TypeidlistContext typeidlist() {
			return getRuleContext(TypeidlistContext.class,0);
		}
		public DynamicexceptionspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicexceptionspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDynamicexceptionspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDynamicexceptionspecification(this);
		}
	}

	public final DynamicexceptionspecificationContext dynamicexceptionspecification() throws RecognitionException {
		DynamicexceptionspecificationContext _localctx = new DynamicexceptionspecificationContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_dynamicexceptionspecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2364);
			match(Throw);
			setState(2365);
			match(LeftParen);
			setState(2367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Struct))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Typename - 68)) | (1L << (Union - 68)) | (1L << (Unsigned - 68)) | (1L << (Void - 68)) | (1L << (Volatile - 68)) | (1L << (Wchar - 68)) | (1L << (Doublecolon - 68)) | (1L << (Identifier - 68)))) != 0)) {
				{
				setState(2366);
				typeidlist(0);
				}
			}

			setState(2369);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeidlistContext extends ParserRuleContext {
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(CPP14Parser.Ellipsis, 0); }
		public TypeidlistContext typeidlist() {
			return getRuleContext(TypeidlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public TypeidlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeidlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypeidlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypeidlist(this);
		}
	}

	public final TypeidlistContext typeidlist() throws RecognitionException {
		return typeidlist(0);
	}

	private TypeidlistContext typeidlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeidlistContext _localctx = new TypeidlistContext(_ctx, _parentState);
		TypeidlistContext _prevctx = _localctx;
		int _startState = 380;
		enterRecursionRule(_localctx, 380, RULE_typeidlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2372);
			typeid();
			setState(2374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				{
				setState(2373);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeidlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeidlist);
					setState(2376);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2377);
					match(Comma);
					setState(2378);
					typeid();
					setState(2380);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
					case 1:
						{
						setState(2379);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2386);
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

	public static class NoexceptspecificationContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(CPP14Parser.Noexcept, 0); }
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public NoexceptspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noexceptspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoexceptspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoexceptspecification(this);
		}
	}

	public final NoexceptspecificationContext noexceptspecification() throws RecognitionException {
		NoexceptspecificationContext _localctx = new NoexceptspecificationContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_noexceptspecification);
		try {
			setState(2393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2387);
				match(Noexcept);
				setState(2388);
				match(LeftParen);
				setState(2389);
				constantexpression();
				setState(2390);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2392);
				match(Noexcept);
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

	public static class RightShiftContext extends ParserRuleContext {
		public List<TerminalNode> Greater() { return getTokens(CPP14Parser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(CPP14Parser.Greater, i);
		}
		public RightShiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightShift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterRightShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitRightShift(this);
		}
	}

	public final RightShiftContext rightShift() throws RecognitionException {
		RightShiftContext _localctx = new RightShiftContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_rightShift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2395);
			match(Greater);
			setState(2396);
			match(Greater);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightShiftAssignContext extends ParserRuleContext {
		public List<TerminalNode> Greater() { return getTokens(CPP14Parser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(CPP14Parser.Greater, i);
		}
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public RightShiftAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightShiftAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterRightShiftAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitRightShiftAssign(this);
		}
	}

	public final RightShiftAssignContext rightShiftAssign() throws RecognitionException {
		RightShiftAssignContext _localctx = new RightShiftAssignContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_rightShiftAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2398);
			match(Greater);
			setState(2399);
			match(Greater);
			setState(2400);
			match(Assign);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(CPP14Parser.New, 0); }
		public TerminalNode Delete() { return getToken(CPP14Parser.Delete, 0); }
		public TerminalNode LeftBracket() { return getToken(CPP14Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPP14Parser.RightBracket, 0); }
		public TerminalNode Plus() { return getToken(CPP14Parser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CPP14Parser.Minus, 0); }
		public TerminalNode Star() { return getToken(CPP14Parser.Star, 0); }
		public TerminalNode Div() { return getToken(CPP14Parser.Div, 0); }
		public TerminalNode Mod() { return getToken(CPP14Parser.Mod, 0); }
		public TerminalNode Caret() { return getToken(CPP14Parser.Caret, 0); }
		public TerminalNode And() { return getToken(CPP14Parser.And, 0); }
		public TerminalNode Or() { return getToken(CPP14Parser.Or, 0); }
		public TerminalNode Tilde() { return getToken(CPP14Parser.Tilde, 0); }
		public TerminalNode Not() { return getToken(CPP14Parser.Not, 0); }
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public TerminalNode Less() { return getToken(CPP14Parser.Less, 0); }
		public TerminalNode Greater() { return getToken(CPP14Parser.Greater, 0); }
		public TerminalNode PlusAssign() { return getToken(CPP14Parser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(CPP14Parser.MinusAssign, 0); }
		public TerminalNode StarAssign() { return getToken(CPP14Parser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(CPP14Parser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(CPP14Parser.ModAssign, 0); }
		public TerminalNode XorAssign() { return getToken(CPP14Parser.XorAssign, 0); }
		public TerminalNode AndAssign() { return getToken(CPP14Parser.AndAssign, 0); }
		public TerminalNode OrAssign() { return getToken(CPP14Parser.OrAssign, 0); }
		public TerminalNode LeftShift() { return getToken(CPP14Parser.LeftShift, 0); }
		public RightShiftContext rightShift() {
			return getRuleContext(RightShiftContext.class,0);
		}
		public RightShiftAssignContext rightShiftAssign() {
			return getRuleContext(RightShiftAssignContext.class,0);
		}
		public TerminalNode LeftShiftAssign() { return getToken(CPP14Parser.LeftShiftAssign, 0); }
		public TerminalNode Equal() { return getToken(CPP14Parser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(CPP14Parser.NotEqual, 0); }
		public TerminalNode LessEqual() { return getToken(CPP14Parser.LessEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(CPP14Parser.GreaterEqual, 0); }
		public TerminalNode AndAnd() { return getToken(CPP14Parser.AndAnd, 0); }
		public TerminalNode OrOr() { return getToken(CPP14Parser.OrOr, 0); }
		public TerminalNode PlusPlus() { return getToken(CPP14Parser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(CPP14Parser.MinusMinus, 0); }
		public TerminalNode Comma() { return getToken(CPP14Parser.Comma, 0); }
		public TerminalNode ArrowStar() { return getToken(CPP14Parser.ArrowStar, 0); }
		public TerminalNode Arrow() { return getToken(CPP14Parser.Arrow, 0); }
		public TerminalNode LeftParen() { return getToken(CPP14Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPP14Parser.RightParen, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_operator);
		try {
			setState(2450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2402);
				match(New);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2403);
				match(Delete);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2404);
				match(New);
				setState(2405);
				match(LeftBracket);
				setState(2406);
				match(RightBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2407);
				match(Delete);
				setState(2408);
				match(LeftBracket);
				setState(2409);
				match(RightBracket);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2410);
				match(Plus);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2411);
				match(Minus);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2412);
				match(Star);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2413);
				match(Div);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2414);
				match(Mod);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2415);
				match(Caret);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2416);
				match(And);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2417);
				match(Or);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2418);
				match(Tilde);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2419);
				match(Not);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2420);
				match(Assign);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2421);
				match(Less);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2422);
				match(Greater);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2423);
				match(PlusAssign);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2424);
				match(MinusAssign);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2425);
				match(StarAssign);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2426);
				match(DivAssign);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2427);
				match(ModAssign);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2428);
				match(XorAssign);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2429);
				match(AndAssign);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2430);
				match(OrAssign);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2431);
				match(LeftShift);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2432);
				rightShift();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2433);
				rightShiftAssign();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2434);
				match(LeftShiftAssign);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2435);
				match(Equal);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2436);
				match(NotEqual);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2437);
				match(LessEqual);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2438);
				match(GreaterEqual);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2439);
				match(AndAnd);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2440);
				match(OrOr);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2441);
				match(PlusPlus);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2442);
				match(MinusMinus);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2443);
				match(Comma);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2444);
				match(ArrowStar);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2445);
				match(Arrow);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2446);
				match(LeftParen);
				setState(2447);
				match(RightParen);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2448);
				match(LeftBracket);
				setState(2449);
				match(RightBracket);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode Integerliteral() { return getToken(CPP14Parser.Integerliteral, 0); }
		public TerminalNode Characterliteral() { return getToken(CPP14Parser.Characterliteral, 0); }
		public TerminalNode Floatingliteral() { return getToken(CPP14Parser.Floatingliteral, 0); }
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public BooleanliteralContext booleanliteral() {
			return getRuleContext(BooleanliteralContext.class,0);
		}
		public PointerliteralContext pointerliteral() {
			return getRuleContext(PointerliteralContext.class,0);
		}
		public UserdefinedliteralContext userdefinedliteral() {
			return getRuleContext(UserdefinedliteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_literal);
		try {
			setState(2459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integerliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2452);
				match(Integerliteral);
				}
				break;
			case Characterliteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2453);
				match(Characterliteral);
				}
				break;
			case Floatingliteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(2454);
				match(Floatingliteral);
				}
				break;
			case Stringliteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(2455);
				match(Stringliteral);
				}
				break;
			case False:
			case True:
				enterOuterAlt(_localctx, 5);
				{
				setState(2456);
				booleanliteral();
				}
				break;
			case Nullptr:
				enterOuterAlt(_localctx, 6);
				{
				setState(2457);
				pointerliteral();
				}
				break;
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(2458);
				userdefinedliteral();
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

	public static class BooleanliteralContext extends ParserRuleContext {
		public TerminalNode False() { return getToken(CPP14Parser.False, 0); }
		public TerminalNode True() { return getToken(CPP14Parser.True, 0); }
		public BooleanliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBooleanliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBooleanliteral(this);
		}
	}

	public final BooleanliteralContext booleanliteral() throws RecognitionException {
		BooleanliteralContext _localctx = new BooleanliteralContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_booleanliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2461);
			_la = _input.LA(1);
			if ( !(_la==False || _la==True) ) {
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

	public static class PointerliteralContext extends ParserRuleContext {
		public TerminalNode Nullptr() { return getToken(CPP14Parser.Nullptr, 0); }
		public PointerliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPointerliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPointerliteral(this);
		}
	}

	public final PointerliteralContext pointerliteral() throws RecognitionException {
		PointerliteralContext _localctx = new PointerliteralContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_pointerliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2463);
			match(Nullptr);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserdefinedliteralContext extends ParserRuleContext {
		public TerminalNode Userdefinedintegerliteral() { return getToken(CPP14Parser.Userdefinedintegerliteral, 0); }
		public TerminalNode Userdefinedfloatingliteral() { return getToken(CPP14Parser.Userdefinedfloatingliteral, 0); }
		public TerminalNode Userdefinedstringliteral() { return getToken(CPP14Parser.Userdefinedstringliteral, 0); }
		public TerminalNode Userdefinedcharacterliteral() { return getToken(CPP14Parser.Userdefinedcharacterliteral, 0); }
		public UserdefinedliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userdefinedliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUserdefinedliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUserdefinedliteral(this);
		}
	}

	public final UserdefinedliteralContext userdefinedliteral() throws RecognitionException {
		UserdefinedliteralContext _localctx = new UserdefinedliteralContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_userdefinedliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2465);
			_la = _input.LA(1);
			if ( !(((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (Userdefinedintegerliteral - 134)) | (1L << (Userdefinedfloatingliteral - 134)) | (1L << (Userdefinedstringliteral - 134)) | (1L << (Userdefinedcharacterliteral - 134)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return nestednamespecifier_sempred((NestednamespecifierContext)_localctx, predIndex);
		case 10:
			return capturelist_sempred((CapturelistContext)_localctx, predIndex);
		case 15:
			return postfixexpression_sempred((PostfixexpressionContext)_localctx, predIndex);
		case 24:
			return noptrnewdeclarator_sempred((NoptrnewdeclaratorContext)_localctx, predIndex);
		case 29:
			return pmexpression_sempred((PmexpressionContext)_localctx, predIndex);
		case 30:
			return multiplicativeexpression_sempred((MultiplicativeexpressionContext)_localctx, predIndex);
		case 31:
			return additiveexpression_sempred((AdditiveexpressionContext)_localctx, predIndex);
		case 32:
			return shiftexpression_sempred((ShiftexpressionContext)_localctx, predIndex);
		case 33:
			return relationalexpression_sempred((RelationalexpressionContext)_localctx, predIndex);
		case 34:
			return equalityexpression_sempred((EqualityexpressionContext)_localctx, predIndex);
		case 35:
			return andexpression_sempred((AndexpressionContext)_localctx, predIndex);
		case 36:
			return exclusiveorexpression_sempred((ExclusiveorexpressionContext)_localctx, predIndex);
		case 37:
			return inclusiveorexpression_sempred((InclusiveorexpressionContext)_localctx, predIndex);
		case 38:
			return logicalandexpression_sempred((LogicalandexpressionContext)_localctx, predIndex);
		case 39:
			return logicalorexpression_sempred((LogicalorexpressionContext)_localctx, predIndex);
		case 43:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 49:
			return statementseq_sempred((StatementseqContext)_localctx, predIndex);
		case 58:
			return declarationseq_sempred((DeclarationseqContext)_localctx, predIndex);
		case 85:
			return enumeratorlist_sempred((EnumeratorlistContext)_localctx, predIndex);
		case 103:
			return attributespecifierseq_sempred((AttributespecifierseqContext)_localctx, predIndex);
		case 106:
			return attributelist_sempred((AttributelistContext)_localctx, predIndex);
		case 112:
			return balancedtokenseq_sempred((BalancedtokenseqContext)_localctx, predIndex);
		case 114:
			return initdeclaratorlist_sempred((InitdeclaratorlistContext)_localctx, predIndex);
		case 118:
			return noptrdeclarator_sempred((NoptrdeclaratorContext)_localctx, predIndex);
		case 129:
			return noptrabstractdeclarator_sempred((NoptrabstractdeclaratorContext)_localctx, predIndex);
		case 131:
			return noptrabstractpackdeclarator_sempred((NoptrabstractpackdeclaratorContext)_localctx, predIndex);
		case 133:
			return parameterdeclarationlist_sempred((ParameterdeclarationlistContext)_localctx, predIndex);
		case 140:
			return initializerlist_sempred((InitializerlistContext)_localctx, predIndex);
		case 150:
			return memberdeclaratorlist_sempred((MemberdeclaratorlistContext)_localctx, predIndex);
		case 152:
			return virtspecifierseq_sempred((VirtspecifierseqContext)_localctx, predIndex);
		case 156:
			return basespecifierlist_sempred((BasespecifierlistContext)_localctx, predIndex);
		case 171:
			return templateparameterlist_sempred((TemplateparameterlistContext)_localctx, predIndex);
		case 177:
			return templateargumentlist_sempred((TemplateargumentlistContext)_localctx, predIndex);
		case 190:
			return typeidlist_sempred((TypeidlistContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean nestednamespecifier_sempred(NestednamespecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean capturelist_sempred(CapturelistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixexpression_sempred(PostfixexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		case 11:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean noptrnewdeclarator_sempred(NoptrnewdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean pmexpression_sempred(PmexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeexpression_sempred(MultiplicativeexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveexpression_sempred(AdditiveexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftexpression_sempred(ShiftexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 2);
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalexpression_sempred(RelationalexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 4);
		case 23:
			return precpred(_ctx, 3);
		case 24:
			return precpred(_ctx, 2);
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityexpression_sempred(EqualityexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 2);
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andexpression_sempred(AndexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveorexpression_sempred(ExclusiveorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveorexpression_sempred(InclusiveorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalandexpression_sempred(LogicalandexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalorexpression_sempred(LogicalorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statementseq_sempred(StatementseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarationseq_sempred(DeclarationseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean enumeratorlist_sempred(EnumeratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributespecifierseq_sempred(AttributespecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributelist_sempred(AttributelistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return precpred(_ctx, 3);
		case 39:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean balancedtokenseq_sempred(BalancedtokenseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 40:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initdeclaratorlist_sempred(InitdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean noptrdeclarator_sempred(NoptrdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42:
			return precpred(_ctx, 3);
		case 43:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean noptrabstractdeclarator_sempred(NoptrabstractdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 44:
			return precpred(_ctx, 5);
		case 45:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean noptrabstractpackdeclarator_sempred(NoptrabstractpackdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46:
			return precpred(_ctx, 3);
		case 47:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean parameterdeclarationlist_sempred(ParameterdeclarationlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initializerlist_sempred(InitializerlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean memberdeclaratorlist_sempred(MemberdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean virtspecifierseq_sempred(VirtspecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean basespecifierlist_sempred(BasespecifierlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean templateparameterlist_sempred(TemplateparameterlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 53:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean templateargumentlist_sempred(TemplateargumentlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 54:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeidlist_sempred(TypeidlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 55:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final String _serializedATNSegment0 =
		"\u0004\u0001\u008d\u09a4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007"+
		"\u008c\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007"+
		"\u008f\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007"+
		"\u0092\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007"+
		"\u0095\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0002\u0098\u0007"+
		"\u0098\u0002\u0099\u0007\u0099\u0002\u009a\u0007\u009a\u0002\u009b\u0007"+
		"\u009b\u0002\u009c\u0007\u009c\u0002\u009d\u0007\u009d\u0002\u009e\u0007"+
		"\u009e\u0002\u009f\u0007\u009f\u0002\u00a0\u0007\u00a0\u0002\u00a1\u0007"+
		"\u00a1\u0002\u00a2\u0007\u00a2\u0002\u00a3\u0007\u00a3\u0002\u00a4\u0007"+
		"\u00a4\u0002\u00a5\u0007\u00a5\u0002\u00a6\u0007\u00a6\u0002\u00a7\u0007"+
		"\u00a7\u0002\u00a8\u0007\u00a8\u0002\u00a9\u0007\u00a9\u0002\u00aa\u0007"+
		"\u00aa\u0002\u00ab\u0007\u00ab\u0002\u00ac\u0007\u00ac\u0002\u00ad\u0007"+
		"\u00ad\u0002\u00ae\u0007\u00ae\u0002\u00af\u0007\u00af\u0002\u00b0\u0007"+
		"\u00b0\u0002\u00b1\u0007\u00b1\u0002\u00b2\u0007\u00b2\u0002\u00b3\u0007"+
		"\u00b3\u0002\u00b4\u0007\u00b4\u0002\u00b5\u0007\u00b5\u0002\u00b6\u0007"+
		"\u00b6\u0002\u00b7\u0007\u00b7\u0002\u00b8\u0007\u00b8\u0002\u00b9\u0007"+
		"\u00b9\u0002\u00ba\u0007\u00ba\u0002\u00bb\u0007\u00bb\u0002\u00bc\u0007"+
		"\u00bc\u0002\u00bd\u0007\u00bd\u0002\u00be\u0007\u00be\u0002\u00bf\u0007"+
		"\u00bf\u0002\u00c0\u0007\u00c0\u0002\u00c1\u0007\u00c1\u0002\u00c2\u0007"+
		"\u00c2\u0002\u00c3\u0007\u00c3\u0002\u00c4\u0007\u00c4\u0002\u00c5\u0007"+
		"\u00c5\u0002\u00c6\u0007\u00c6\u0001\u0000\u0003\u0000\u0190\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u019c\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u01a0\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u01ab\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u01af"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u01be\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u01c5\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u01ca\b\u0005\n\u0005\f\u0005\u01cd\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u01d1\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u01d7\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u01e1\b\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\n\u01e8\b\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u01ee\b\n\u0005\n\u01f0\b\n\n\n\f\n\u01f3\t\n\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u01f7\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u01fd\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0204"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u020a"+
		"\b\u000e\u0001\u000e\u0003\u000e\u020d\b\u000e\u0001\u000e\u0003\u000e"+
		"\u0210\b\u000e\u0001\u000e\u0003\u000e\u0213\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u021a\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0221"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0255\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u0264\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u026a\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u0270\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u027d\b\u000f\n\u000f\f\u000f\u0280\t\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0003\u0011\u0285\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u0294\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u029a\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u02b8\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0003\u0014\u02bd\b"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u02c1\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u02c5\b\u0014\u0001\u0014\u0003\u0014\u02c8\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u02cc\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u02d2\b\u0014\u0003\u0014\u02d4\b"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u02dc\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u02e0"+
		"\b\u0017\u0001\u0017\u0003\u0017\u02e3\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u02ea\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u02f1\b\u0018"+
		"\u0005\u0018\u02f3\b\u0018\n\u0018\f\u0018\u02f6\t\u0018\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u02fa\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u02fe"+
		"\b\u0019\u0001\u001a\u0003\u001a\u0301\b\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u0306\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u030c\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u0319\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0005\u001d\u0324\b\u001d\n\u001d\f\u001d\u0327\t\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u0335\b\u001e\n\u001e\f\u001e\u0338\t\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0005\u001f\u0343\b\u001f\n\u001f\f\u001f\u0346\t\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005"+
		" \u0352\b \n \f \u0355\t \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u0366"+
		"\b!\n!\f!\u0369\t!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0005\"\u0374\b\"\n\"\f\"\u0377\t\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0005#\u037f\b#\n#\f#\u0382\t#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0005$\u038a\b$\n$\f$\u038d\t$\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0005%\u0395\b%\n%\f%\u0398\t%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0005&\u03a0\b&\n&\f&\u03a3\t&\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u03ab\b\'\n\'\f\'\u03ae\t\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u03b7\b(\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0003)\u03bf\b)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u03cc\b*\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0005+\u03d4\b+\n+\f+\u03d7\t+\u0001"+
		",\u0001,\u0001-\u0001-\u0003-\u03dd\b-\u0001-\u0001-\u0003-\u03e1\b-\u0001"+
		"-\u0001-\u0003-\u03e5\b-\u0001-\u0001-\u0003-\u03e9\b-\u0001-\u0001-\u0003"+
		"-\u03ed\b-\u0001-\u0001-\u0001-\u0003-\u03f2\b-\u0001-\u0003-\u03f5\b"+
		"-\u0001.\u0003.\u03f8\b.\u0001.\u0001.\u0001.\u0001.\u0003.\u03fe\b.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u0406\b.\u0001.\u0001.\u0001"+
		".\u0003.\u040b\b.\u0001/\u0003/\u040e\b/\u0001/\u0001/\u00010\u00010\u0003"+
		"0\u0414\b0\u00010\u00010\u00011\u00011\u00011\u00011\u00011\u00051\u041d"+
		"\b1\n1\f1\u0420\t1\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00032\u0436\b2\u00013\u00013\u00033\u043a\b3\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00033\u0442\b3\u00013\u00013\u00013\u0001"+
		"3\u00033\u0448\b3\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00034\u045c\b4\u00014\u00014\u00034\u0460\b4\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00034\u046d\b4\u0001"+
		"5\u00015\u00035\u0471\b5\u00016\u00036\u0474\b6\u00016\u00016\u00016\u0001"+
		"7\u00017\u00037\u047b\b7\u00018\u00018\u00018\u00018\u00018\u00018\u0003"+
		"8\u0483\b8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0003"+
		"8\u048d\b8\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0005:\u0496"+
		"\b:\n:\f:\u0499\t:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0003;\u04a4\b;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0003<\u04ae\b<\u0001=\u0001=\u0001=\u0003=\u04b3\b=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001>\u0003>\u04ba\b>\u0001>\u0003>\u04bd\b>\u0001>\u0001"+
		">\u0001>\u0003>\u04c2\b>\u0001>\u0001>\u0001>\u0003>\u04c7\b>\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001A\u0001"+
		"A\u0001A\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0003B\u04dc\bB\u0001"+
		"C\u0001C\u0003C\u04e0\bC\u0001C\u0001C\u0001C\u0003C\u04e5\bC\u0001D\u0001"+
		"D\u0001E\u0001E\u0001F\u0001F\u0001G\u0001G\u0001G\u0003G\u04f0\bG\u0001"+
		"H\u0001H\u0001H\u0001H\u0003H\u04f6\bH\u0001I\u0001I\u0003I\u04fa\bI\u0001"+
		"I\u0001I\u0001I\u0003I\u04ff\bI\u0001J\u0001J\u0003J\u0503\bJ\u0001J\u0001"+
		"J\u0001J\u0003J\u0508\bJ\u0001K\u0003K\u050b\bK\u0001K\u0001K\u0001K\u0001"+
		"K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001"+
		"K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0003K\u0521\bK\u0001L\u0001"+
		"L\u0001L\u0001L\u0003L\u0527\bL\u0001M\u0001M\u0001M\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0001M\u0003M\u0532\bM\u0001N\u0001N\u0003N\u0536\bN\u0001"+
		"N\u0003N\u0539\bN\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0003N\u0543\bN\u0001N\u0001N\u0001N\u0001N\u0003N\u0549\bN\u0001N\u0003"+
		"N\u054c\bN\u0001O\u0001O\u0001P\u0001P\u0001P\u0003P\u0553\bP\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0003P\u055d\bP\u0001Q\u0001"+
		"Q\u0003Q\u0561\bQ\u0001Q\u0003Q\u0564\bQ\u0001Q\u0003Q\u0567\bQ\u0001"+
		"Q\u0001Q\u0003Q\u056b\bQ\u0001Q\u0001Q\u0001Q\u0003Q\u0570\bQ\u0003Q\u0572"+
		"\bQ\u0001R\u0001R\u0003R\u0576\bR\u0001R\u0001R\u0003R\u057a\bR\u0001"+
		"R\u0001R\u0001S\u0001S\u0001S\u0001S\u0001S\u0003S\u0583\bS\u0001T\u0001"+
		"T\u0001T\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0005U\u058e\bU\nU"+
		"\fU\u0591\tU\u0001V\u0001V\u0001V\u0001V\u0001V\u0003V\u0598\bV\u0001"+
		"W\u0001W\u0001X\u0001X\u0003X\u059e\bX\u0001Y\u0001Y\u0001Z\u0001Z\u0003"+
		"Z\u05a4\bZ\u0001[\u0001[\u0003[\u05a8\b[\u0001\\\u0003\\\u05ab\b\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001]\u0003]\u05b4\b]\u0001"+
		"]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001^\u0003^\u05bd\b^\u0001^\u0001"+
		"^\u0001^\u0001^\u0001^\u0001_\u0003_\u05c5\b_\u0001`\u0001`\u0001a\u0001"+
		"a\u0001a\u0001a\u0001a\u0001a\u0001b\u0003b\u05d0\bb\u0001b\u0001b\u0001"+
		"c\u0001c\u0003c\u05d6\bc\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001"+
		"c\u0001c\u0001c\u0003c\u05e1\bc\u0001d\u0003d\u05e4\bd\u0001d\u0001d\u0001"+
		"d\u0003d\u05e9\bd\u0001d\u0001d\u0001d\u0001e\u0001e\u0001e\u0001e\u0001"+
		"e\u0001e\u0001f\u0001f\u0001f\u0001f\u0003f\u05f8\bf\u0001f\u0001f\u0001"+
		"f\u0001f\u0003f\u05fe\bf\u0001g\u0001g\u0001g\u0001g\u0001g\u0005g\u0605"+
		"\bg\ng\fg\u0608\tg\u0001h\u0001h\u0001h\u0001h\u0001h\u0001h\u0001h\u0003"+
		"h\u0611\bh\u0001i\u0001i\u0001i\u0001i\u0003i\u0617\bi\u0001i\u0001i\u0001"+
		"i\u0001i\u0001i\u0001i\u0003i\u061f\bi\u0001i\u0001i\u0003i\u0623\bi\u0001"+
		"j\u0001j\u0003j\u0627\bj\u0001j\u0001j\u0001j\u0003j\u062c\bj\u0001j\u0001"+
		"j\u0001j\u0003j\u0631\bj\u0001j\u0001j\u0001j\u0001j\u0001j\u0005j\u0638"+
		"\bj\nj\fj\u063b\tj\u0001k\u0001k\u0003k\u063f\bk\u0001l\u0001l\u0003l"+
		"\u0643\bl\u0001m\u0001m\u0001m\u0001m\u0001n\u0001n\u0001o\u0001o\u0001"+
		"o\u0001o\u0001p\u0001p\u0003p\u0651\bp\u0001p\u0001p\u0005p\u0655\bp\n"+
		"p\fp\u0658\tp\u0001q\u0001q\u0001q\u0001q\u0001q\u0001q\u0001q\u0001q"+
		"\u0001q\u0001q\u0001q\u0001q\u0003q\u0666\bq\u0001r\u0001r\u0001r\u0001"+
		"r\u0001r\u0001r\u0005r\u066e\br\nr\fr\u0671\tr\u0001s\u0001s\u0003s\u0675"+
		"\bs\u0001t\u0001t\u0001t\u0001t\u0001t\u0003t\u067c\bt\u0001u\u0001u\u0001"+
		"u\u0001u\u0003u\u0682\bu\u0001v\u0001v\u0001v\u0003v\u0687\bv\u0001v\u0001"+
		"v\u0001v\u0001v\u0003v\u068d\bv\u0001v\u0001v\u0001v\u0001v\u0001v\u0003"+
		"v\u0694\bv\u0001v\u0001v\u0003v\u0698\bv\u0005v\u069a\bv\nv\fv\u069d\t"+
		"v\u0001w\u0001w\u0001w\u0001w\u0003w\u06a3\bw\u0001w\u0003w\u06a6\bw\u0001"+
		"w\u0003w\u06a9\bw\u0001w\u0003w\u06ac\bw\u0001x\u0001x\u0001x\u0003x\u06b1"+
		"\bx\u0001y\u0001y\u0003y\u06b5\by\u0001y\u0003y\u06b8\by\u0001y\u0001"+
		"y\u0003y\u06bc\by\u0001y\u0001y\u0003y\u06c0\by\u0001y\u0001y\u0001y\u0003"+
		"y\u06c5\by\u0001y\u0003y\u06c8\by\u0003y\u06ca\by\u0001z\u0001z\u0003"+
		"z\u06ce\bz\u0001{\u0001{\u0001|\u0001|\u0001}\u0003}\u06d5\b}\u0001}\u0001"+
		"}\u0001~\u0001~\u0003~\u06db\b~\u0001\u007f\u0001\u007f\u0003\u007f\u06df"+
		"\b\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0003\u007f\u06e5"+
		"\b\u007f\u0001\u0080\u0001\u0080\u0001\u0080\u0003\u0080\u06ea\b\u0080"+
		"\u0003\u0080\u06ec\b\u0080\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081"+
		"\u0003\u0081\u06f2\b\u0081\u0001\u0081\u0001\u0081\u0003\u0081\u06f6\b"+
		"\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0003\u0081\u06fc"+
		"\b\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0003"+
		"\u0081\u0703\b\u0081\u0001\u0081\u0001\u0081\u0003\u0081\u0707\b\u0081"+
		"\u0005\u0081\u0709\b\u0081\n\u0081\f\u0081\u070c\t\u0081\u0001\u0082\u0001"+
		"\u0082\u0001\u0082\u0001\u0082\u0003\u0082\u0712\b\u0082\u0001\u0083\u0001"+
		"\u0083\u0001\u0083\u0001\u0083\u0001\u0083\u0001\u0083\u0001\u0083\u0001"+
		"\u0083\u0003\u0083\u071c\b\u0083\u0001\u0083\u0001\u0083\u0003\u0083\u0720"+
		"\b\u0083\u0005\u0083\u0722\b\u0083\n\u0083\f\u0083\u0725\t\u0083\u0001"+
		"\u0084\u0003\u0084\u0728\b\u0084\u0001\u0084\u0003\u0084\u072b\b\u0084"+
		"\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0003\u0084\u0731\b\u0084"+
		"\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085"+
		"\u0005\u0085\u0739\b\u0085\n\u0085\f\u0085\u073c\t\u0085\u0001\u0086\u0003"+
		"\u0086\u073f\b\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0003"+
		"\u0086\u0745\b\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001"+
		"\u0086\u0001\u0086\u0003\u0086\u074d\b\u0086\u0001\u0086\u0001\u0086\u0003"+
		"\u0086\u0751\b\u0086\u0001\u0086\u0003\u0086\u0754\b\u0086\u0001\u0086"+
		"\u0001\u0086\u0003\u0086\u0758\b\u0086\u0001\u0086\u0001\u0086\u0001\u0086"+
		"\u0003\u0086\u075d\b\u0086\u0001\u0087\u0003\u0087\u0760\b\u0087\u0001"+
		"\u0087\u0003\u0087\u0763\b\u0087\u0001\u0087\u0001\u0087\u0003\u0087\u0767"+
		"\b\u0087\u0001\u0087\u0001\u0087\u0001\u0088\u0003\u0088\u076c\b\u0088"+
		"\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0088"+
		"\u0001\u0088\u0001\u0088\u0003\u0088\u0776\b\u0088\u0001\u0089\u0001\u0089"+
		"\u0001\u0089\u0001\u0089\u0001\u0089\u0003\u0089\u077d\b\u0089\u0001\u008a"+
		"\u0001\u008a\u0001\u008a\u0003\u008a\u0782\b\u008a\u0001\u008b\u0001\u008b"+
		"\u0003\u008b\u0786\b\u008b\u0001\u008c\u0001\u008c\u0001\u008c\u0003\u008c"+
		"\u078b\b\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0003\u008c"+
		"\u0791\b\u008c\u0005\u008c\u0793\b\u008c\n\u008c\f\u008c\u0796\t\u008c"+
		"\u0001\u008d\u0001\u008d\u0001\u008d\u0003\u008d\u079b\b\u008d\u0001\u008d"+
		"\u0001\u008d\u0001\u008d\u0001\u008d\u0003\u008d\u07a1\b\u008d\u0001\u008e"+
		"\u0001\u008e\u0003\u008e\u07a5\b\u008e\u0001\u008f\u0001\u008f\u0001\u008f"+
		"\u0003\u008f\u07aa\b\u008f\u0001\u008f\u0001\u008f\u0001\u0090\u0001\u0090"+
		"\u0003\u0090\u07b0\b\u0090\u0001\u0090\u0001\u0090\u0003\u0090\u07b4\b"+
		"\u0090\u0001\u0090\u0003\u0090\u07b7\b\u0090\u0001\u0090\u0001\u0090\u0003"+
		"\u0090\u07bb\b\u0090\u0001\u0090\u0003\u0090\u07be\b\u0090\u0003\u0090"+
		"\u07c0\b\u0090\u0001\u0091\u0003\u0091\u07c3\b\u0091\u0001\u0091\u0001"+
		"\u0091\u0001\u0092\u0001\u0092\u0001\u0093\u0001\u0093\u0001\u0094\u0001"+
		"\u0094\u0003\u0094\u07cd\b\u0094\u0001\u0094\u0001\u0094\u0001\u0094\u0003"+
		"\u0094\u07d2\b\u0094\u0003\u0094\u07d4\b\u0094\u0001\u0095\u0003\u0095"+
		"\u07d7\b\u0095\u0001\u0095\u0003\u0095\u07da\b\u0095\u0001\u0095\u0003"+
		"\u0095\u07dd\b\u0095\u0001\u0095\u0001\u0095\u0001\u0095\u0001\u0095\u0001"+
		"\u0095\u0001\u0095\u0001\u0095\u0003\u0095\u07e6\b\u0095\u0001\u0096\u0001"+
		"\u0096\u0001\u0096\u0001\u0096\u0001\u0096\u0001\u0096\u0005\u0096\u07ee"+
		"\b\u0096\n\u0096\f\u0096\u07f1\t\u0096\u0001\u0097\u0001\u0097\u0003\u0097"+
		"\u07f5\b\u0097\u0001\u0097\u0003\u0097\u07f8\b\u0097\u0001\u0097\u0001"+
		"\u0097\u0003\u0097\u07fc\b\u0097\u0001\u0097\u0003\u0097\u07ff\b\u0097"+
		"\u0001\u0097\u0003\u0097\u0802\b\u0097\u0001\u0097\u0001\u0097\u0003\u0097"+
		"\u0806\b\u0097\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0098"+
		"\u0005\u0098\u080d\b\u0098\n\u0098\f\u0098\u0810\t\u0098\u0001\u0099\u0001"+
		"\u0099\u0001\u009a\u0001\u009a\u0001\u009a\u0001\u009a\u0001\u009b\u0001"+
		"\u009b\u0001\u009b\u0001\u009c\u0001\u009c\u0001\u009c\u0003\u009c\u081e"+
		"\b\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0003\u009c\u0824"+
		"\b\u009c\u0005\u009c\u0826\b\u009c\n\u009c\f\u009c\u0829\t\u009c\u0001"+
		"\u009d\u0003\u009d\u082c\b\u009d\u0001\u009d\u0001\u009d\u0003\u009d\u0830"+
		"\b\u009d\u0001\u009d\u0001\u009d\u0003\u009d\u0834\b\u009d\u0001\u009d"+
		"\u0001\u009d\u0003\u009d\u0838\b\u009d\u0001\u009d\u0001\u009d\u0003\u009d"+
		"\u083c\b\u009d\u0001\u009d\u0001\u009d\u0003\u009d\u0840\b\u009d\u0001"+
		"\u009e\u0003\u009e\u0843\b\u009e\u0001\u009e\u0001\u009e\u0003\u009e\u0847"+
		"\b\u009e\u0001\u009f\u0001\u009f\u0001\u00a0\u0001\u00a0\u0001\u00a1\u0001"+
		"\u00a1\u0001\u00a1\u0001\u00a2\u0001\u00a2\u0003\u00a2\u0852\b\u00a2\u0001"+
		"\u00a3\u0001\u00a3\u0003\u00a3\u0856\b\u00a3\u0001\u00a4\u0001\u00a4\u0001"+
		"\u00a4\u0001\u00a5\u0001\u00a5\u0003\u00a5\u085d\b\u00a5\u0001\u00a5\u0001"+
		"\u00a5\u0003\u00a5\u0861\b\u00a5\u0001\u00a5\u0001\u00a5\u0001\u00a5\u0003"+
		"\u00a5\u0866\b\u00a5\u0001\u00a6\u0001\u00a6\u0001\u00a6\u0003\u00a6\u086b"+
		"\b\u00a6\u0001\u00a6\u0001\u00a6\u0001\u00a6\u0001\u00a6\u0001\u00a6\u0003"+
		"\u00a6\u0872\b\u00a6\u0001\u00a7\u0001\u00a7\u0003\u00a7\u0876\b\u00a7"+
		"\u0001\u00a8\u0001\u00a8\u0001\u00a8\u0001\u00a9\u0001\u00a9\u0001\u00a9"+
		"\u0001\u00a9\u0001\u00a9\u0003\u00a9\u0880\b\u00a9\u0001\u00aa\u0001\u00aa"+
		"\u0001\u00aa\u0001\u00aa\u0001\u00aa\u0001\u00aa\u0001\u00ab\u0001\u00ab"+
		"\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0005\u00ab\u088e\b\u00ab"+
		"\n\u00ab\f\u00ab\u0891\t\u00ab\u0001\u00ac\u0001\u00ac\u0003\u00ac\u0895"+
		"\b\u00ac\u0001\u00ad\u0001\u00ad\u0003\u00ad\u0899\b\u00ad\u0001\u00ad"+
		"\u0003\u00ad\u089c\b\u00ad\u0001\u00ad\u0001\u00ad\u0003\u00ad\u08a0\b"+
		"\u00ad\u0001\u00ad\u0001\u00ad\u0001\u00ad\u0001\u00ad\u0003\u00ad\u08a6"+
		"\b\u00ad\u0001\u00ad\u0003\u00ad\u08a9\b\u00ad\u0001\u00ad\u0001\u00ad"+
		"\u0003\u00ad\u08ad\b\u00ad\u0001\u00ad\u0001\u00ad\u0001\u00ad\u0001\u00ad"+
		"\u0001\u00ad\u0001\u00ad\u0001\u00ad\u0001\u00ad\u0003\u00ad\u08b7\b\u00ad"+
		"\u0001\u00ad\u0003\u00ad\u08ba\b\u00ad\u0001\u00ad\u0001\u00ad\u0001\u00ad"+
		"\u0001\u00ad\u0001\u00ad\u0001\u00ad\u0003\u00ad\u08c2\b\u00ad\u0001\u00ad"+
		"\u0001\u00ad\u0001\u00ad\u0003\u00ad\u08c7\b\u00ad\u0001\u00ae\u0001\u00ae"+
		"\u0001\u00ae\u0003\u00ae\u08cc\b\u00ae\u0001\u00ae\u0001\u00ae\u0001\u00af"+
		"\u0001\u00af\u0001\u00af\u0001\u00af\u0003\u00af\u08d4\b\u00af\u0001\u00af"+
		"\u0001\u00af\u0001\u00af\u0001\u00af\u0001\u00af\u0003\u00af\u08db\b\u00af"+
		"\u0001\u00af\u0001\u00af\u0003\u00af\u08df\b\u00af\u0001\u00b0\u0001\u00b0"+
		"\u0001\u00b1\u0001\u00b1\u0001\u00b1\u0003\u00b1\u08e6\b\u00b1\u0001\u00b1"+
		"\u0001\u00b1\u0001\u00b1\u0001\u00b1\u0003\u00b1\u08ec\b\u00b1\u0005\u00b1"+
		"\u08ee\b\u00b1\n\u00b1\f\u00b1\u08f1\t\u00b1\u0001\u00b2\u0001\u00b2\u0001"+
		"\u00b2\u0003\u00b2\u08f6\b\u00b2\u0001\u00b3\u0001\u00b3\u0001\u00b3\u0001"+
		"\u00b3\u0001\u00b3\u0001\u00b3\u0001\u00b3\u0003\u00b3\u08ff\b\u00b3\u0001"+
		"\u00b3\u0001\u00b3\u0003\u00b3\u0903\b\u00b3\u0001\u00b4\u0003\u00b4\u0906"+
		"\b\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b5\u0001\u00b5\u0001"+
		"\u00b5\u0001\u00b5\u0001\u00b5\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0001"+
		"\u00b6\u0001\u00b7\u0001\u00b7\u0003\u00b7\u0916\b\u00b7\u0001\u00b7\u0001"+
		"\u00b7\u0001\u00b7\u0001\u00b8\u0001\u00b8\u0003\u00b8\u091d\b\u00b8\u0001"+
		"\u00b9\u0001\u00b9\u0001\u00b9\u0001\u00b9\u0001\u00b9\u0001\u00b9\u0001"+
		"\u00ba\u0003\u00ba\u0926\b\u00ba\u0001\u00ba\u0001\u00ba\u0001\u00ba\u0001"+
		"\u00ba\u0003\u00ba\u092c\b\u00ba\u0001\u00ba\u0001\u00ba\u0003\u00ba\u0930"+
		"\b\u00ba\u0001\u00ba\u0003\u00ba\u0933\b\u00ba\u0001\u00bb\u0001\u00bb"+
		"\u0003\u00bb\u0937\b\u00bb\u0001\u00bc\u0001\u00bc\u0003\u00bc\u093b\b"+
		"\u00bc\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0003\u00bd\u0940\b\u00bd\u0001"+
		"\u00bd\u0001\u00bd\u0001\u00be\u0001\u00be\u0001\u00be\u0003\u00be\u0947"+
		"\b\u00be\u0001\u00be\u0001\u00be\u0001\u00be\u0001\u00be\u0003\u00be\u094d"+
		"\b\u00be\u0005\u00be\u094f\b\u00be\n\u00be\f\u00be\u0952\t\u00be\u0001"+
		"\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0003"+
		"\u00bf\u095a\b\u00bf\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c1\u0001"+
		"\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001"+
		"\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001"+
		"\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001"+
		"\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001"+
		"\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001"+
		"\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001"+
		"\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001"+
		"\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001"+
		"\u00c2\u0001\u00c2\u0001\u00c2\u0003\u00c2\u0993\b\u00c2\u0001\u00c3\u0001"+
		"\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0003"+
		"\u00c3\u099c\b\u00c3\u0001\u00c4\u0001\u00c4\u0001\u00c5\u0001\u00c5\u0001"+
		"\u00c6\u0001\u00c6\u0001\u00c6\u0000\"\n\u0014\u001e0:<>@BDFHJLNVbt\u00aa"+
		"\u00ce\u00d4\u00e0\u00e4\u00ec\u0102\u0106\u010a\u0118\u012c\u0130\u0138"+
		"\u0156\u0162\u017c\u00c7\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120"+
		"\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138"+
		"\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150"+
		"\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168"+
		"\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180"+
		"\u0182\u0184\u0186\u0188\u018a\u018c\u0000\u000b\u0002\u0000YY]]\u0003"+
		"\u0000SSUUY\\\u0005\u0000\u001c\u001c\'\'1177>>\u0003\u0000\u001a\u001a"+
		"$$HH\u0002\u0000\u000e\u000eJJ\u0002\u0000YYnn\u0003\u0000\r\r::EE\u0002"+
		"\u0000\u001e\u001e--\u0001\u0000.0\u0002\u0000\u001d\u001d@@\u0001\u0000"+
		"\u0086\u0089\u0ac5\u0000\u018f\u0001\u0000\u0000\u0000\u0002\u019b\u0001"+
		"\u0000\u0000\u0000\u0004\u019f\u0001\u0000\u0000\u0000\u0006\u01aa\u0001"+
		"\u0000\u0000\u0000\b\u01ac\u0001\u0000\u0000\u0000\n\u01bd\u0001\u0000"+
		"\u0000\u0000\f\u01ce\u0001\u0000\u0000\u0000\u000e\u01d4\u0001\u0000\u0000"+
		"\u0000\u0010\u01e0\u0001\u0000\u0000\u0000\u0012\u01e2\u0001\u0000\u0000"+
		"\u0000\u0014\u01e4\u0001\u0000\u0000\u0000\u0016\u01f6\u0001\u0000\u0000"+
		"\u0000\u0018\u01fc\u0001\u0000\u0000\u0000\u001a\u0203\u0001\u0000\u0000"+
		"\u0000\u001c\u0205\u0001\u0000\u0000\u0000\u001e\u0254\u0001\u0000\u0000"+
		"\u0000 \u0281\u0001\u0000\u0000\u0000\"\u0299\u0001\u0000\u0000\u0000"+
		"$\u02b7\u0001\u0000\u0000\u0000&\u02b9\u0001\u0000\u0000\u0000(\u02d3"+
		"\u0001\u0000\u0000\u0000*\u02d5\u0001\u0000\u0000\u0000,\u02d9\u0001\u0000"+
		"\u0000\u0000.\u02e2\u0001\u0000\u0000\u00000\u02e4\u0001\u0000\u0000\u0000"+
		"2\u02fd\u0001\u0000\u0000\u00004\u030b\u0001\u0000\u0000\u00006\u030d"+
		"\u0001\u0000\u0000\u00008\u0318\u0001\u0000\u0000\u0000:\u031a\u0001\u0000"+
		"\u0000\u0000<\u0328\u0001\u0000\u0000\u0000>\u0339\u0001\u0000\u0000\u0000"+
		"@\u0347\u0001\u0000\u0000\u0000B\u0356\u0001\u0000\u0000\u0000D\u036a"+
		"\u0001\u0000\u0000\u0000F\u0378\u0001\u0000\u0000\u0000H\u0383\u0001\u0000"+
		"\u0000\u0000J\u038e\u0001\u0000\u0000\u0000L\u0399\u0001\u0000\u0000\u0000"+
		"N\u03a4\u0001\u0000\u0000\u0000P\u03b6\u0001\u0000\u0000\u0000R\u03be"+
		"\u0001\u0000\u0000\u0000T\u03cb\u0001\u0000\u0000\u0000V\u03cd\u0001\u0000"+
		"\u0000\u0000X\u03d8\u0001\u0000\u0000\u0000Z\u03f4\u0001\u0000\u0000\u0000"+
		"\\\u040a\u0001\u0000\u0000\u0000^\u040d\u0001\u0000\u0000\u0000`\u0411"+
		"\u0001\u0000\u0000\u0000b\u0417\u0001\u0000\u0000\u0000d\u0435\u0001\u0000"+
		"\u0000\u0000f\u0447\u0001\u0000\u0000\u0000h\u046c\u0001\u0000\u0000\u0000"+
		"j\u0470\u0001\u0000\u0000\u0000l\u0473\u0001\u0000\u0000\u0000n\u047a"+
		"\u0001\u0000\u0000\u0000p\u048c\u0001\u0000\u0000\u0000r\u048e\u0001\u0000"+
		"\u0000\u0000t\u0490\u0001\u0000\u0000\u0000v\u04a3\u0001\u0000\u0000\u0000"+
		"x\u04ad\u0001\u0000\u0000\u0000z\u04af\u0001\u0000\u0000\u0000|\u04c6"+
		"\u0001\u0000\u0000\u0000~\u04c8\u0001\u0000\u0000\u0000\u0080\u04d0\u0001"+
		"\u0000\u0000\u0000\u0082\u04d2\u0001\u0000\u0000\u0000\u0084\u04db\u0001"+
		"\u0000\u0000\u0000\u0086\u04e4\u0001\u0000\u0000\u0000\u0088\u04e6\u0001"+
		"\u0000\u0000\u0000\u008a\u04e8\u0001\u0000\u0000\u0000\u008c\u04ea\u0001"+
		"\u0000\u0000\u0000\u008e\u04ef\u0001\u0000\u0000\u0000\u0090\u04f5\u0001"+
		"\u0000\u0000\u0000\u0092\u04fe\u0001\u0000\u0000\u0000\u0094\u0507\u0001"+
		"\u0000\u0000\u0000\u0096\u0520\u0001\u0000\u0000\u0000\u0098\u0526\u0001"+
		"\u0000\u0000\u0000\u009a\u0531\u0001\u0000\u0000\u0000\u009c\u054b\u0001"+
		"\u0000\u0000\u0000\u009e\u054d\u0001\u0000\u0000\u0000\u00a0\u055c\u0001"+
		"\u0000\u0000\u0000\u00a2\u0571\u0001\u0000\u0000\u0000\u00a4\u0573\u0001"+
		"\u0000\u0000\u0000\u00a6\u0582\u0001\u0000\u0000\u0000\u00a8\u0584\u0001"+
		"\u0000\u0000\u0000\u00aa\u0587\u0001\u0000\u0000\u0000\u00ac\u0597\u0001"+
		"\u0000\u0000\u0000\u00ae\u0599\u0001\u0000\u0000\u0000\u00b0\u059d\u0001"+
		"\u0000\u0000\u0000\u00b2\u059f\u0001\u0000\u0000\u0000\u00b4\u05a3\u0001"+
		"\u0000\u0000\u0000\u00b6\u05a7\u0001\u0000\u0000\u0000\u00b8\u05aa\u0001"+
		"\u0000\u0000\u0000\u00ba\u05b3\u0001\u0000\u0000\u0000\u00bc\u05bc\u0001"+
		"\u0000\u0000\u0000\u00be\u05c4\u0001\u0000\u0000\u0000\u00c0\u05c6\u0001"+
		"\u0000\u0000\u0000\u00c2\u05c8\u0001\u0000\u0000\u0000\u00c4\u05cf\u0001"+
		"\u0000\u0000\u0000\u00c6\u05e0\u0001\u0000\u0000\u0000\u00c8\u05e3\u0001"+
		"\u0000\u0000\u0000\u00ca\u05ed\u0001\u0000\u0000\u0000\u00cc\u05fd\u0001"+
		"\u0000\u0000\u0000\u00ce\u05ff\u0001\u0000\u0000\u0000\u00d0\u0610\u0001"+
		"\u0000\u0000\u0000\u00d2\u0622\u0001\u0000\u0000\u0000\u00d4\u062b\u0001"+
		"\u0000\u0000\u0000\u00d6\u063c\u0001\u0000\u0000\u0000\u00d8\u0642\u0001"+
		"\u0000\u0000\u0000\u00da\u0644\u0001\u0000\u0000\u0000\u00dc\u0648\u0001"+
		"\u0000\u0000\u0000\u00de\u064a\u0001\u0000\u0000\u0000\u00e0\u064e\u0001"+
		"\u0000\u0000\u0000\u00e2\u0665\u0001\u0000\u0000\u0000\u00e4\u0667\u0001"+
		"\u0000\u0000\u0000\u00e6\u0672\u0001\u0000\u0000\u0000\u00e8\u067b\u0001"+
		"\u0000\u0000\u0000\u00ea\u0681\u0001\u0000\u0000\u0000\u00ec\u068c\u0001"+
		"\u0000\u0000\u0000\u00ee\u069e\u0001\u0000\u0000\u0000\u00f0\u06ad\u0001"+
		"\u0000\u0000\u0000\u00f2\u06c9\u0001\u0000\u0000\u0000\u00f4\u06cb\u0001"+
		"\u0000\u0000\u0000\u00f6\u06cf\u0001\u0000\u0000\u0000\u00f8\u06d1\u0001"+
		"\u0000\u0000\u0000\u00fa\u06d4\u0001\u0000\u0000\u0000\u00fc\u06d8\u0001"+
		"\u0000\u0000\u0000\u00fe\u06e4\u0001\u0000\u0000\u0000\u0100\u06eb\u0001"+
		"\u0000\u0000\u0000\u0102\u06fb\u0001\u0000\u0000\u0000\u0104\u0711\u0001"+
		"\u0000\u0000\u0000\u0106\u0713\u0001\u0000\u0000\u0000\u0108\u0730\u0001"+
		"\u0000\u0000\u0000\u010a\u0732\u0001\u0000\u0000\u0000\u010c\u075c\u0001"+
		"\u0000\u0000\u0000\u010e\u075f\u0001\u0000\u0000\u0000\u0110\u0775\u0001"+
		"\u0000\u0000\u0000\u0112\u077c\u0001\u0000\u0000\u0000\u0114\u0781\u0001"+
		"\u0000\u0000\u0000\u0116\u0785\u0001\u0000\u0000\u0000\u0118\u0787\u0001"+
		"\u0000\u0000\u0000\u011a\u07a0\u0001\u0000\u0000\u0000\u011c\u07a4\u0001"+
		"\u0000\u0000\u0000\u011e\u07a6\u0001\u0000\u0000\u0000\u0120\u07bf\u0001"+
		"\u0000\u0000\u0000\u0122\u07c2\u0001\u0000\u0000\u0000\u0124\u07c6\u0001"+
		"\u0000\u0000\u0000\u0126\u07c8\u0001\u0000\u0000\u0000\u0128\u07d3\u0001"+
		"\u0000\u0000\u0000\u012a\u07e5\u0001\u0000\u0000\u0000\u012c\u07e7\u0001"+
		"\u0000\u0000\u0000\u012e\u0805\u0001\u0000\u0000\u0000\u0130\u0807\u0001"+
		"\u0000\u0000\u0000\u0132\u0811\u0001\u0000\u0000\u0000\u0134\u0813\u0001"+
		"\u0000\u0000\u0000\u0136\u0817\u0001\u0000\u0000\u0000\u0138\u081a\u0001"+
		"\u0000\u0000\u0000\u013a\u083f\u0001\u0000\u0000\u0000\u013c\u0846\u0001"+
		"\u0000\u0000\u0000\u013e\u0848\u0001\u0000\u0000\u0000\u0140\u084a\u0001"+
		"\u0000\u0000\u0000\u0142\u084c\u0001\u0000\u0000\u0000\u0144\u084f\u0001"+
		"\u0000\u0000\u0000\u0146\u0853\u0001\u0000\u0000\u0000\u0148\u0857\u0001"+
		"\u0000\u0000\u0000\u014a\u0865\u0001\u0000\u0000\u0000\u014c\u0871\u0001"+
		"\u0000\u0000\u0000\u014e\u0875\u0001\u0000\u0000\u0000\u0150\u0877\u0001"+
		"\u0000\u0000\u0000\u0152\u087f\u0001\u0000\u0000\u0000\u0154\u0881\u0001"+
		"\u0000\u0000\u0000\u0156\u0887\u0001\u0000\u0000\u0000\u0158\u0894\u0001"+
		"\u0000\u0000\u0000\u015a\u08c6\u0001\u0000\u0000\u0000\u015c\u08c8\u0001"+
		"\u0000\u0000\u0000\u015e\u08de\u0001\u0000\u0000\u0000\u0160\u08e0\u0001"+
		"\u0000\u0000\u0000\u0162\u08e2\u0001\u0000\u0000\u0000\u0164\u08f5\u0001"+
		"\u0000\u0000\u0000\u0166\u0902\u0001\u0000\u0000\u0000\u0168\u0905\u0001"+
		"\u0000\u0000\u0000\u016a\u090a\u0001\u0000\u0000\u0000\u016c\u090f\u0001"+
		"\u0000\u0000\u0000\u016e\u0913\u0001\u0000\u0000\u0000\u0170\u091a\u0001"+
		"\u0000\u0000\u0000\u0172\u091e\u0001\u0000\u0000\u0000\u0174\u0932\u0001"+
		"\u0000\u0000\u0000\u0176\u0934\u0001\u0000\u0000\u0000\u0178\u093a\u0001"+
		"\u0000\u0000\u0000\u017a\u093c\u0001\u0000\u0000\u0000\u017c\u0943\u0001"+
		"\u0000\u0000\u0000\u017e\u0959\u0001\u0000\u0000\u0000\u0180\u095b\u0001"+
		"\u0000\u0000\u0000\u0182\u095e\u0001\u0000\u0000\u0000\u0184\u0992\u0001"+
		"\u0000\u0000\u0000\u0186\u099b\u0001\u0000\u0000\u0000\u0188\u099d\u0001"+
		"\u0000\u0000\u0000\u018a\u099f\u0001\u0000\u0000\u0000\u018c\u09a1\u0001"+
		"\u0000\u0000\u0000\u018e\u0190\u0003t:\u0000\u018f\u018e\u0001\u0000\u0000"+
		"\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000"+
		"\u0000\u0191\u0192\u0005\u0000\u0000\u0001\u0192\u0001\u0001\u0000\u0000"+
		"\u0000\u0193\u019c\u0003\u0186\u00c3\u0000\u0194\u019c\u0005=\u0000\u0000"+
		"\u0195\u0196\u0005M\u0000\u0000\u0196\u0197\u0003V+\u0000\u0197\u0198"+
		"\u0005N\u0000\u0000\u0198\u019c\u0001\u0000\u0000\u0000\u0199\u019c\u0003"+
		"\u0004\u0002\u0000\u019a\u019c\u0003\f\u0006\u0000\u019b\u0193\u0001\u0000"+
		"\u0000\u0000\u019b\u0194\u0001\u0000\u0000\u0000\u019b\u0195\u0001\u0000"+
		"\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019b\u019a\u0001\u0000"+
		"\u0000\u0000\u019c\u0003\u0001\u0000\u0000\u0000\u019d\u01a0\u0003\u0006"+
		"\u0003\u0000\u019e\u01a0\u0003\b\u0004\u0000\u019f\u019d\u0001\u0000\u0000"+
		"\u0000\u019f\u019e\u0001\u0000\u0000\u0000\u01a0\u0005\u0001\u0000\u0000"+
		"\u0000\u01a1\u01ab\u0005|\u0000\u0000\u01a2\u01ab\u0003\u0150\u00a8\u0000"+
		"\u01a3\u01ab\u0003\u0142\u00a1\u0000\u01a4\u01ab\u0003\u0152\u00a9\u0000"+
		"\u01a5\u01a6\u0005[\u0000\u0000\u01a6\u01ab\u0003\u011c\u008e\u0000\u01a7"+
		"\u01a8\u0005[\u0000\u0000\u01a8\u01ab\u0003\u009aM\u0000\u01a9\u01ab\u0003"+
		"\u015e\u00af\u0000\u01aa\u01a1\u0001\u0000\u0000\u0000\u01aa\u01a2\u0001"+
		"\u0000\u0000\u0000\u01aa\u01a3\u0001\u0000\u0000\u0000\u01aa\u01a4\u0001"+
		"\u0000\u0000\u0000\u01aa\u01a5\u0001\u0000\u0000\u0000\u01aa\u01a7\u0001"+
		"\u0000\u0000\u0000\u01aa\u01a9\u0001\u0000\u0000\u0000\u01ab\u0007\u0001"+
		"\u0000\u0000\u0000\u01ac\u01ae\u0003\n\u0005\u0000\u01ad\u01af\u0005<"+
		"\u0000\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000"+
		"\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b1\u0003\u0006"+
		"\u0003\u0000\u01b1\t\u0001\u0000\u0000\u0000\u01b2\u01b3\u0006\u0005\uffff"+
		"\uffff\u0000\u01b3\u01be\u0005w\u0000\u0000\u01b4\u01b5\u0003\u0098L\u0000"+
		"\u01b5\u01b6\u0005w\u0000\u0000\u01b6\u01be\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b8\u0003\u00b0X\u0000\u01b8\u01b9\u0005w\u0000\u0000\u01b9\u01be\u0001"+
		"\u0000\u0000\u0000\u01ba\u01bb\u0003\u009aM\u0000\u01bb\u01bc\u0005w\u0000"+
		"\u0000\u01bc\u01be\u0001\u0000\u0000\u0000\u01bd\u01b2\u0001\u0000\u0000"+
		"\u0000\u01bd\u01b4\u0001\u0000\u0000\u0000\u01bd\u01b7\u0001\u0000\u0000"+
		"\u0000\u01bd\u01ba\u0001\u0000\u0000\u0000\u01be\u01cb\u0001\u0000\u0000"+
		"\u0000\u01bf\u01c0\n\u0002\u0000\u0000\u01c0\u01c1\u0005|\u0000\u0000"+
		"\u01c1\u01ca\u0005w\u0000\u0000\u01c2\u01c4\n\u0001\u0000\u0000\u01c3"+
		"\u01c5\u0005<\u0000\u0000\u01c4\u01c3\u0001\u0000\u0000\u0000\u01c4\u01c5"+
		"\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c7"+
		"\u0003\u015c\u00ae\u0000\u01c7\u01c8\u0005w\u0000\u0000\u01c8\u01ca\u0001"+
		"\u0000\u0000\u0000\u01c9\u01bf\u0001\u0000\u0000\u0000\u01c9\u01c2\u0001"+
		"\u0000\u0000\u0000\u01ca\u01cd\u0001\u0000\u0000\u0000\u01cb\u01c9\u0001"+
		"\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u000b\u0001"+
		"\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01ce\u01d0\u0003"+
		"\u000e\u0007\u0000\u01cf\u01d1\u0003\u001c\u000e\u0000\u01d0\u01cf\u0001"+
		"\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d2\u01d3\u0003`0\u0000\u01d3\r\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d6\u0005O\u0000\u0000\u01d5\u01d7\u0003\u0010\b\u0000"+
		"\u01d6\u01d5\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000"+
		"\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01d9\u0005P\u0000\u0000\u01d9"+
		"\u000f\u0001\u0000\u0000\u0000\u01da\u01e1\u0003\u0012\t\u0000\u01db\u01e1"+
		"\u0003\u0014\n\u0000\u01dc\u01dd\u0003\u0012\t\u0000\u01dd\u01de\u0005"+
		"r\u0000\u0000\u01de\u01df\u0003\u0014\n\u0000\u01df\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e0\u01da\u0001\u0000\u0000\u0000\u01e0\u01db\u0001\u0000"+
		"\u0000\u0000\u01e0\u01dc\u0001\u0000\u0000\u0000\u01e1\u0011\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e3\u0007\u0000\u0000\u0000\u01e3\u0013\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e5\u0006\n\uffff\uffff\u0000\u01e5\u01e7\u0003\u0016"+
		"\u000b\u0000\u01e6\u01e8\u0005{\u0000\u0000\u01e7\u01e6\u0001\u0000\u0000"+
		"\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01f1\u0001\u0000\u0000"+
		"\u0000\u01e9\u01ea\n\u0001\u0000\u0000\u01ea\u01eb\u0005r\u0000\u0000"+
		"\u01eb\u01ed\u0003\u0016\u000b\u0000\u01ec\u01ee\u0005{\u0000\u0000\u01ed"+
		"\u01ec\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee"+
		"\u01f0\u0001\u0000\u0000\u0000\u01ef\u01e9\u0001\u0000\u0000\u0000\u01f0"+
		"\u01f3\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f1"+
		"\u01f2\u0001\u0000\u0000\u0000\u01f2\u0015\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f1\u0001\u0000\u0000\u0000\u01f4\u01f7\u0003\u0018\f\u0000\u01f5\u01f7"+
		"\u0003\u001a\r\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f6\u01f5\u0001"+
		"\u0000\u0000\u0000\u01f7\u0017\u0001\u0000\u0000\u0000\u01f8\u01fd\u0005"+
		"|\u0000\u0000\u01f9\u01fa\u0005Y\u0000\u0000\u01fa\u01fd\u0005|\u0000"+
		"\u0000\u01fb\u01fd\u0005=\u0000\u0000\u01fc\u01f8\u0001\u0000\u0000\u0000"+
		"\u01fc\u01f9\u0001\u0000\u0000\u0000\u01fc\u01fb\u0001\u0000\u0000\u0000"+
		"\u01fd\u0019\u0001\u0000\u0000\u0000\u01fe\u01ff\u0005|\u0000\u0000\u01ff"+
		"\u0204\u0003\u0112\u0089\u0000\u0200\u0201\u0005Y\u0000\u0000\u0201\u0202"+
		"\u0005|\u0000\u0000\u0202\u0204\u0003\u0112\u0089\u0000\u0203\u01fe\u0001"+
		"\u0000\u0000\u0000\u0203\u0200\u0001\u0000\u0000\u0000\u0204\u001b\u0001"+
		"\u0000\u0000\u0000\u0205\u0206\u0005M\u0000\u0000\u0206\u0207\u0003\u0108"+
		"\u0084\u0000\u0207\u0209\u0005N\u0000\u0000\u0208\u020a\u0005\'\u0000"+
		"\u0000\u0209\u0208\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000"+
		"\u0000\u020a\u020c\u0001\u0000\u0000\u0000\u020b\u020d\u0003\u0178\u00bc"+
		"\u0000\u020c\u020b\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000"+
		"\u0000\u020d\u020f\u0001\u0000\u0000\u0000\u020e\u0210\u0003\u00ceg\u0000"+
		"\u020f\u020e\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000"+
		"\u0210\u0212\u0001\u0000\u0000\u0000\u0211\u0213\u0003\u00f0x\u0000\u0212"+
		"\u0211\u0001\u0000\u0000\u0000\u0212\u0213\u0001\u0000\u0000\u0000\u0213"+
		"\u001d\u0001\u0000\u0000\u0000\u0214\u0215\u0006\u000f\uffff\uffff\u0000"+
		"\u0215\u0255\u0003\u0002\u0001\u0000\u0216\u0217\u0003\u0096K\u0000\u0217"+
		"\u0219\u0005M\u0000\u0000\u0218\u021a\u0003 \u0010\u0000\u0219\u0218\u0001"+
		"\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u021b\u0001"+
		"\u0000\u0000\u0000\u021b\u021c\u0005N\u0000\u0000\u021c\u0255\u0001\u0000"+
		"\u0000\u0000\u021d\u021e\u0003\u0166\u00b3\u0000\u021e\u0220\u0005M\u0000"+
		"\u0000\u021f\u0221\u0003 \u0010\u0000\u0220\u021f\u0001\u0000\u0000\u0000"+
		"\u0220\u0221\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000"+
		"\u0222\u0223\u0005N\u0000\u0000\u0223\u0255\u0001\u0000\u0000\u0000\u0224"+
		"\u0225\u0003\u0096K\u0000\u0225\u0226\u0003\u011a\u008d\u0000\u0226\u0255"+
		"\u0001\u0000\u0000\u0000\u0227\u0228\u0003\u0166\u00b3\u0000\u0228\u0229"+
		"\u0003\u011a\u008d\u0000\u0229\u0255\u0001\u0000\u0000\u0000\u022a\u022b"+
		"\u0005\u0017\u0000\u0000\u022b\u022c\u0005^\u0000\u0000\u022c\u022d\u0003"+
		"\u00fc~\u0000\u022d\u022e\u0005_\u0000\u0000\u022e\u022f\u0005M\u0000"+
		"\u0000\u022f\u0230\u0003V+\u0000\u0230\u0231\u0005N\u0000\u0000\u0231"+
		"\u0255\u0001\u0000\u0000\u0000\u0232\u0233\u00059\u0000\u0000\u0233\u0234"+
		"\u0005^\u0000\u0000\u0234\u0235\u0003\u00fc~\u0000\u0235\u0236\u0005_"+
		"\u0000\u0000\u0236\u0237\u0005M\u0000\u0000\u0237\u0238\u0003V+\u0000"+
		"\u0238\u0239\u0005N\u0000\u0000\u0239\u0255\u0001\u0000\u0000\u0000\u023a"+
		"\u023b\u00052\u0000\u0000\u023b\u023c\u0005^\u0000\u0000\u023c\u023d\u0003"+
		"\u00fc~\u0000\u023d\u023e\u0005_\u0000\u0000\u023e\u023f\u0005M\u0000"+
		"\u0000\u023f\u0240\u0003V+\u0000\u0240\u0241\u0005N\u0000\u0000\u0241"+
		"\u0255\u0001\u0000\u0000\u0000\u0242\u0243\u0005\u0010\u0000\u0000\u0243"+
		"\u0244\u0005^\u0000\u0000\u0244\u0245\u0003\u00fc~\u0000\u0245\u0246\u0005"+
		"_\u0000\u0000\u0246\u0247\u0005M\u0000\u0000\u0247\u0248\u0003V+\u0000"+
		"\u0248\u0249\u0005N\u0000\u0000\u0249\u0255\u0001\u0000\u0000\u0000\u024a"+
		"\u024b\u0005C\u0000\u0000\u024b\u024c\u0005M\u0000\u0000\u024c\u024d\u0003"+
		"V+\u0000\u024d\u024e\u0005N\u0000\u0000\u024e\u0255\u0001\u0000\u0000"+
		"\u0000\u024f\u0250\u0005C\u0000\u0000\u0250\u0251\u0005M\u0000\u0000\u0251"+
		"\u0252\u0003\u00fc~\u0000\u0252\u0253\u0005N\u0000\u0000\u0253\u0255\u0001"+
		"\u0000\u0000\u0000\u0254\u0214\u0001\u0000\u0000\u0000\u0254\u0216\u0001"+
		"\u0000\u0000\u0000\u0254\u021d\u0001\u0000\u0000\u0000\u0254\u0224\u0001"+
		"\u0000\u0000\u0000\u0254\u0227\u0001\u0000\u0000\u0000\u0254\u022a\u0001"+
		"\u0000\u0000\u0000\u0254\u0232\u0001\u0000\u0000\u0000\u0254\u023a\u0001"+
		"\u0000\u0000\u0000\u0254\u0242\u0001\u0000\u0000\u0000\u0254\u024a\u0001"+
		"\u0000\u0000\u0000\u0254\u024f\u0001\u0000\u0000\u0000\u0255\u027e\u0001"+
		"\u0000\u0000\u0000\u0256\u0257\n\u0013\u0000\u0000\u0257\u0258\u0005O"+
		"\u0000\u0000\u0258\u0259\u0003V+\u0000\u0259\u025a\u0005P\u0000\u0000"+
		"\u025a\u027d\u0001\u0000\u0000\u0000\u025b\u025c\n\u0012\u0000\u0000\u025c"+
		"\u025d\u0005O\u0000\u0000\u025d\u025e\u0003\u011a\u008d\u0000\u025e\u025f"+
		"\u0005P\u0000\u0000\u025f\u027d\u0001\u0000\u0000\u0000\u0260\u0261\n"+
		"\u0011\u0000\u0000\u0261\u0263\u0005M\u0000\u0000\u0262\u0264\u0003 \u0010"+
		"\u0000\u0263\u0262\u0001\u0000\u0000\u0000\u0263\u0264\u0001\u0000\u0000"+
		"\u0000\u0264\u0265\u0001\u0000\u0000\u0000\u0265\u027d\u0005N\u0000\u0000"+
		"\u0266\u0267\n\f\u0000\u0000\u0267\u0269\u0005y\u0000\u0000\u0268\u026a"+
		"\u0005<\u0000\u0000\u0269\u0268\u0001\u0000\u0000\u0000\u0269\u026a\u0001"+
		"\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u027d\u0003"+
		"\u0004\u0002\u0000\u026c\u026d\n\u000b\u0000\u0000\u026d\u026f\u0005t"+
		"\u0000\u0000\u026e\u0270\u0005<\u0000\u0000\u026f\u026e\u0001\u0000\u0000"+
		"\u0000\u026f\u0270\u0001\u0000\u0000\u0000\u0270\u0271\u0001\u0000\u0000"+
		"\u0000\u0271\u027d\u0003\u0004\u0002\u0000\u0272\u0273\n\n\u0000\u0000"+
		"\u0273\u0274\u0005y\u0000\u0000\u0274\u027d\u0003\"\u0011\u0000\u0275"+
		"\u0276\n\t\u0000\u0000\u0276\u0277\u0005t\u0000\u0000\u0277\u027d\u0003"+
		"\"\u0011\u0000\u0278\u0279\n\b\u0000\u0000\u0279\u027d\u0005p\u0000\u0000"+
		"\u027a\u027b\n\u0007\u0000\u0000\u027b\u027d\u0005q\u0000\u0000\u027c"+
		"\u0256\u0001\u0000\u0000\u0000\u027c\u025b\u0001\u0000\u0000\u0000\u027c"+
		"\u0260\u0001\u0000\u0000\u0000\u027c\u0266\u0001\u0000\u0000\u0000\u027c"+
		"\u026c\u0001\u0000\u0000\u0000\u027c\u0272\u0001\u0000\u0000\u0000\u027c"+
		"\u0275\u0001\u0000\u0000\u0000\u027c\u0278\u0001\u0000\u0000\u0000\u027c"+
		"\u027a\u0001\u0000\u0000\u0000\u027d\u0280\u0001\u0000\u0000\u0000\u027e"+
		"\u027c\u0001\u0000\u0000\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027f"+
		"\u001f\u0001\u0000\u0000\u0000\u0280\u027e\u0001\u0000\u0000\u0000\u0281"+
		"\u0282\u0003\u0118\u008c\u0000\u0282!\u0001\u0000\u0000\u0000\u0283\u0285"+
		"\u0003\n\u0005\u0000\u0284\u0283\u0001\u0000\u0000\u0000\u0284\u0285\u0001"+
		"\u0000\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286\u0287\u0003"+
		"\u0098L\u0000\u0287\u0288\u0005w\u0000\u0000\u0288\u0289\u0005[\u0000"+
		"\u0000\u0289\u028a\u0003\u0098L\u0000\u028a\u029a\u0001\u0000\u0000\u0000"+
		"\u028b\u028c\u0003\n\u0005\u0000\u028c\u028d\u0005<\u0000\u0000\u028d"+
		"\u028e\u0003\u015c\u00ae\u0000\u028e\u028f\u0005w\u0000\u0000\u028f\u0290"+
		"\u0005[\u0000\u0000\u0290\u0291\u0003\u0098L\u0000\u0291\u029a\u0001\u0000"+
		"\u0000\u0000\u0292\u0294\u0003\n\u0005\u0000\u0293\u0292\u0001\u0000\u0000"+
		"\u0000\u0293\u0294\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000\u0000"+
		"\u0000\u0295\u0296\u0005[\u0000\u0000\u0296\u029a\u0003\u0098L\u0000\u0297"+
		"\u0298\u0005[\u0000\u0000\u0298\u029a\u0003\u009aM\u0000\u0299\u0284\u0001"+
		"\u0000\u0000\u0000\u0299\u028b\u0001\u0000\u0000\u0000\u0299\u0293\u0001"+
		"\u0000\u0000\u0000\u0299\u0297\u0001\u0000\u0000\u0000\u029a#\u0001\u0000"+
		"\u0000\u0000\u029b\u02b8\u0003\u001e\u000f\u0000\u029c\u029d\u0005p\u0000"+
		"\u0000\u029d\u02b8\u00038\u001c\u0000\u029e\u029f\u0005q\u0000\u0000\u029f"+
		"\u02b8\u00038\u001c\u0000\u02a0\u02a1\u0003&\u0013\u0000\u02a1\u02a2\u0003"+
		"8\u001c\u0000\u02a2\u02b8\u0001\u0000\u0000\u0000\u02a3\u02a4\u00056\u0000"+
		"\u0000\u02a4\u02b8\u0003$\u0012\u0000\u02a5\u02a6\u00056\u0000\u0000\u02a6"+
		"\u02a7\u0005M\u0000\u0000\u02a7\u02a8\u0003\u00fc~\u0000\u02a8\u02a9\u0005"+
		"N\u0000\u0000\u02a9\u02b8\u0001\u0000\u0000\u0000\u02aa\u02ab\u00056\u0000"+
		"\u0000\u02ab\u02ac\u0005{\u0000\u0000\u02ac\u02ad\u0005M\u0000\u0000\u02ad"+
		"\u02ae\u0005|\u0000\u0000\u02ae\u02b8\u0005N\u0000\u0000\u02af\u02b0\u0005"+
		"\u0003\u0000\u0000\u02b0\u02b1\u0005M\u0000\u0000\u02b1\u02b2\u0003\u00fc"+
		"~\u0000\u02b2\u02b3\u0005N\u0000\u0000\u02b3\u02b8\u0001\u0000\u0000\u0000"+
		"\u02b4\u02b8\u00036\u001b\u0000\u02b5\u02b8\u0003(\u0014\u0000\u02b6\u02b8"+
		"\u00034\u001a\u0000\u02b7\u029b\u0001\u0000\u0000\u0000\u02b7\u029c\u0001"+
		"\u0000\u0000\u0000\u02b7\u029e\u0001\u0000\u0000\u0000\u02b7\u02a0\u0001"+
		"\u0000\u0000\u0000\u02b7\u02a3\u0001\u0000\u0000\u0000\u02b7\u02a5\u0001"+
		"\u0000\u0000\u0000\u02b7\u02aa\u0001\u0000\u0000\u0000\u02b7\u02af\u0001"+
		"\u0000\u0000\u0000\u02b7\u02b4\u0001\u0000\u0000\u0000\u02b7\u02b5\u0001"+
		"\u0000\u0000\u0000\u02b7\u02b6\u0001\u0000\u0000\u0000\u02b8%\u0001\u0000"+
		"\u0000\u0000\u02b9\u02ba\u0007\u0001\u0000\u0000\u02ba\'\u0001\u0000\u0000"+
		"\u0000\u02bb\u02bd\u0005w\u0000\u0000\u02bc\u02bb\u0001\u0000\u0000\u0000"+
		"\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bd\u02be\u0001\u0000\u0000\u0000"+
		"\u02be\u02c0\u0005)\u0000\u0000\u02bf\u02c1\u0003*\u0015\u0000\u02c0\u02bf"+
		"\u0001\u0000\u0000\u0000\u02c0\u02c1\u0001\u0000\u0000\u0000\u02c1\u02c2"+
		"\u0001\u0000\u0000\u0000\u02c2\u02c4\u0003,\u0016\u0000\u02c3\u02c5\u0003"+
		"2\u0019\u0000\u02c4\u02c3\u0001\u0000\u0000\u0000\u02c4\u02c5\u0001\u0000"+
		"\u0000\u0000\u02c5\u02d4\u0001\u0000\u0000\u0000\u02c6\u02c8\u0005w\u0000"+
		"\u0000\u02c7\u02c6\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000\u0000"+
		"\u0000\u02c8\u02c9\u0001\u0000\u0000\u0000\u02c9\u02cb\u0005)\u0000\u0000"+
		"\u02ca\u02cc\u0003*\u0015\u0000\u02cb\u02ca\u0001\u0000\u0000\u0000\u02cb"+
		"\u02cc\u0001\u0000\u0000\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cd"+
		"\u02ce\u0005M\u0000\u0000\u02ce\u02cf\u0003\u00fc~\u0000\u02cf\u02d1\u0005"+
		"N\u0000\u0000\u02d0\u02d2\u00032\u0019\u0000\u02d1\u02d0\u0001\u0000\u0000"+
		"\u0000\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2\u02d4\u0001\u0000\u0000"+
		"\u0000\u02d3\u02bc\u0001\u0000\u0000\u0000\u02d3\u02c7\u0001\u0000\u0000"+
		"\u0000\u02d4)\u0001\u0000\u0000\u0000\u02d5\u02d6\u0005M\u0000\u0000\u02d6"+
		"\u02d7\u0003 \u0010\u0000\u02d7\u02d8\u0005N\u0000\u0000\u02d8+\u0001"+
		"\u0000\u0000\u0000\u02d9\u02db\u0003\u0092I\u0000\u02da\u02dc\u0003.\u0017"+
		"\u0000\u02db\u02da\u0001\u0000\u0000\u0000\u02db\u02dc\u0001\u0000\u0000"+
		"\u0000\u02dc-\u0001\u0000\u0000\u0000\u02dd\u02df\u0003\u00f2y\u0000\u02de"+
		"\u02e0\u0003.\u0017\u0000\u02df\u02de\u0001\u0000\u0000\u0000\u02df\u02e0"+
		"\u0001\u0000\u0000\u0000\u02e0\u02e3\u0001\u0000\u0000\u0000\u02e1\u02e3"+
		"\u00030\u0018\u0000\u02e2\u02dd\u0001\u0000\u0000\u0000\u02e2\u02e1\u0001"+
		"\u0000\u0000\u0000\u02e3/\u0001\u0000\u0000\u0000\u02e4\u02e5\u0006\u0018"+
		"\uffff\uffff\u0000\u02e5\u02e6\u0005O\u0000\u0000\u02e6\u02e7\u0003V+"+
		"\u0000\u02e7\u02e9\u0005P\u0000\u0000\u02e8\u02ea\u0003\u00ceg\u0000\u02e9"+
		"\u02e8\u0001\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000\u02ea"+
		"\u02f4\u0001\u0000\u0000\u0000\u02eb\u02ec\n\u0001\u0000\u0000\u02ec\u02ed"+
		"\u0005O\u0000\u0000\u02ed\u02ee\u0003X,\u0000\u02ee\u02f0\u0005P\u0000"+
		"\u0000\u02ef\u02f1\u0003\u00ceg\u0000\u02f0\u02ef\u0001\u0000\u0000\u0000"+
		"\u02f0\u02f1\u0001\u0000\u0000\u0000\u02f1\u02f3\u0001\u0000\u0000\u0000"+
		"\u02f2\u02eb\u0001\u0000\u0000\u0000\u02f3\u02f6\u0001\u0000\u0000\u0000"+
		"\u02f4\u02f2\u0001\u0000\u0000\u0000\u02f4\u02f5\u0001\u0000\u0000\u0000"+
		"\u02f51\u0001\u0000\u0000\u0000\u02f6\u02f4\u0001\u0000\u0000\u0000\u02f7"+
		"\u02f9\u0005M\u0000\u0000\u02f8\u02fa\u0003 \u0010\u0000\u02f9\u02f8\u0001"+
		"\u0000\u0000\u0000\u02f9\u02fa\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001"+
		"\u0000\u0000\u0000\u02fb\u02fe\u0005N\u0000\u0000\u02fc\u02fe\u0003\u011a"+
		"\u008d\u0000\u02fd\u02f7\u0001\u0000\u0000\u0000\u02fd\u02fc\u0001\u0000"+
		"\u0000\u0000\u02fe3\u0001\u0000\u0000\u0000\u02ff\u0301\u0005w\u0000\u0000"+
		"\u0300\u02ff\u0001\u0000\u0000\u0000\u0300\u0301\u0001\u0000\u0000\u0000"+
		"\u0301\u0302\u0001\u0000\u0000\u0000\u0302\u0303\u0005\u0014\u0000\u0000"+
		"\u0303\u030c\u00038\u001c\u0000\u0304\u0306\u0005w\u0000\u0000\u0305\u0304"+
		"\u0001\u0000\u0000\u0000\u0305\u0306\u0001\u0000\u0000\u0000\u0306\u0307"+
		"\u0001\u0000\u0000\u0000\u0307\u0308\u0005\u0014\u0000\u0000\u0308\u0309"+
		"\u0005O\u0000\u0000\u0309\u030a\u0005P\u0000\u0000\u030a\u030c\u00038"+
		"\u001c\u0000\u030b\u0300\u0001\u0000\u0000\u0000\u030b\u0305\u0001\u0000"+
		"\u0000\u0000\u030c5\u0001\u0000\u0000\u0000\u030d\u030e\u0005*\u0000\u0000"+
		"\u030e\u030f\u0005M\u0000\u0000\u030f\u0310\u0003V+\u0000\u0310\u0311"+
		"\u0005N\u0000\u0000\u03117\u0001\u0000\u0000\u0000\u0312\u0319\u0003$"+
		"\u0012\u0000\u0313\u0314\u0005M\u0000\u0000\u0314\u0315\u0003\u00fc~\u0000"+
		"\u0315\u0316\u0005N\u0000\u0000\u0316\u0317\u00038\u001c\u0000\u0317\u0319"+
		"\u0001\u0000\u0000\u0000\u0318\u0312\u0001\u0000\u0000\u0000\u0318\u0313"+
		"\u0001\u0000\u0000\u0000\u03199\u0001\u0000\u0000\u0000\u031a\u031b\u0006"+
		"\u001d\uffff\uffff\u0000\u031b\u031c\u00038\u001c\u0000\u031c\u0325\u0001"+
		"\u0000\u0000\u0000\u031d\u031e\n\u0002\u0000\u0000\u031e\u031f\u0005z"+
		"\u0000\u0000\u031f\u0324\u00038\u001c\u0000\u0320\u0321\n\u0001\u0000"+
		"\u0000\u0321\u0322\u0005s\u0000\u0000\u0322\u0324\u00038\u001c\u0000\u0323"+
		"\u031d\u0001\u0000\u0000\u0000\u0323\u0320\u0001\u0000\u0000\u0000\u0324"+
		"\u0327\u0001\u0000\u0000\u0000\u0325\u0323\u0001\u0000\u0000\u0000\u0325"+
		"\u0326\u0001\u0000\u0000\u0000\u0326;\u0001\u0000\u0000\u0000\u0327\u0325"+
		"\u0001\u0000\u0000\u0000\u0328\u0329\u0006\u001e\uffff\uffff\u0000\u0329"+
		"\u032a\u0003:\u001d\u0000\u032a\u0336\u0001\u0000\u0000\u0000\u032b\u032c"+
		"\n\u0003\u0000\u0000\u032c\u032d\u0005U\u0000\u0000\u032d\u0335\u0003"+
		":\u001d\u0000\u032e\u032f\n\u0002\u0000\u0000\u032f\u0330\u0005V\u0000"+
		"\u0000\u0330\u0335\u0003:\u001d\u0000\u0331\u0332\n\u0001\u0000\u0000"+
		"\u0332\u0333\u0005W\u0000\u0000\u0333\u0335\u0003:\u001d\u0000\u0334\u032b"+
		"\u0001\u0000\u0000\u0000\u0334\u032e\u0001\u0000\u0000\u0000\u0334\u0331"+
		"\u0001\u0000\u0000\u0000\u0335\u0338\u0001\u0000\u0000\u0000\u0336\u0334"+
		"\u0001\u0000\u0000\u0000\u0336\u0337\u0001\u0000\u0000\u0000\u0337=\u0001"+
		"\u0000\u0000\u0000\u0338\u0336\u0001\u0000\u0000\u0000\u0339\u033a\u0006"+
		"\u001f\uffff\uffff\u0000\u033a\u033b\u0003<\u001e\u0000\u033b\u0344\u0001"+
		"\u0000\u0000\u0000\u033c\u033d\n\u0002\u0000\u0000\u033d\u033e\u0005S"+
		"\u0000\u0000\u033e\u0343\u0003<\u001e\u0000\u033f\u0340\n\u0001\u0000"+
		"\u0000\u0340\u0341\u0005T\u0000\u0000\u0341\u0343\u0003<\u001e\u0000\u0342"+
		"\u033c\u0001\u0000\u0000\u0000\u0342\u033f\u0001\u0000\u0000\u0000\u0343"+
		"\u0346\u0001\u0000\u0000\u0000\u0344\u0342\u0001\u0000\u0000\u0000\u0344"+
		"\u0345\u0001\u0000\u0000\u0000\u0345?\u0001\u0000\u0000\u0000\u0346\u0344"+
		"\u0001\u0000\u0000\u0000\u0347\u0348\u0006 \uffff\uffff\u0000\u0348\u0349"+
		"\u0003>\u001f\u0000\u0349\u0353\u0001\u0000\u0000\u0000\u034a\u034b\n"+
		"\u0002\u0000\u0000\u034b\u034c\u0005h\u0000\u0000\u034c\u0352\u0003>\u001f"+
		"\u0000\u034d\u034e\n\u0001\u0000\u0000\u034e\u034f\u0003\u0180\u00c0\u0000"+
		"\u034f\u0350\u0003>\u001f\u0000\u0350\u0352\u0001\u0000\u0000\u0000\u0351"+
		"\u034a\u0001\u0000\u0000\u0000\u0351\u034d\u0001\u0000\u0000\u0000\u0352"+
		"\u0355\u0001\u0000\u0000\u0000\u0353\u0351\u0001\u0000\u0000\u0000\u0353"+
		"\u0354\u0001\u0000\u0000\u0000\u0354A\u0001\u0000\u0000\u0000\u0355\u0353"+
		"\u0001\u0000\u0000\u0000\u0356\u0357\u0006!\uffff\uffff\u0000\u0357\u0358"+
		"\u0003@ \u0000\u0358\u0367\u0001\u0000\u0000\u0000\u0359\u035a\n\u0004"+
		"\u0000\u0000\u035a\u035b\u0005^\u0000\u0000\u035b\u0366\u0003@ \u0000"+
		"\u035c\u035d\n\u0003\u0000\u0000\u035d\u035e\u0005_\u0000\u0000\u035e"+
		"\u0366\u0003@ \u0000\u035f\u0360\n\u0002\u0000\u0000\u0360\u0361\u0005"+
		"l\u0000\u0000\u0361\u0366\u0003@ \u0000\u0362\u0363\n\u0001\u0000\u0000"+
		"\u0363\u0364\u0005m\u0000\u0000\u0364\u0366\u0003@ \u0000\u0365\u0359"+
		"\u0001\u0000\u0000\u0000\u0365\u035c\u0001\u0000\u0000\u0000\u0365\u035f"+
		"\u0001\u0000\u0000\u0000\u0365\u0362\u0001\u0000\u0000\u0000\u0366\u0369"+
		"\u0001\u0000\u0000\u0000\u0367\u0365\u0001\u0000\u0000\u0000\u0367\u0368"+
		"\u0001\u0000\u0000\u0000\u0368C\u0001\u0000\u0000\u0000\u0369\u0367\u0001"+
		"\u0000\u0000\u0000\u036a\u036b\u0006\"\uffff\uffff\u0000\u036b\u036c\u0003"+
		"B!\u0000\u036c\u0375\u0001\u0000\u0000\u0000\u036d\u036e\n\u0002\u0000"+
		"\u0000\u036e\u036f\u0005j\u0000\u0000\u036f\u0374\u0003B!\u0000\u0370"+
		"\u0371\n\u0001\u0000\u0000\u0371\u0372\u0005k\u0000\u0000\u0372\u0374"+
		"\u0003B!\u0000\u0373\u036d\u0001\u0000\u0000\u0000\u0373\u0370\u0001\u0000"+
		"\u0000\u0000\u0374\u0377\u0001\u0000\u0000\u0000\u0375\u0373\u0001\u0000"+
		"\u0000\u0000\u0375\u0376\u0001\u0000\u0000\u0000\u0376E\u0001\u0000\u0000"+
		"\u0000\u0377\u0375\u0001\u0000\u0000\u0000\u0378\u0379\u0006#\uffff\uffff"+
		"\u0000\u0379\u037a\u0003D\"\u0000\u037a\u0380\u0001\u0000\u0000\u0000"+
		"\u037b\u037c\n\u0001\u0000\u0000\u037c\u037d\u0005Y\u0000\u0000\u037d"+
		"\u037f\u0003D\"\u0000\u037e\u037b\u0001\u0000\u0000\u0000\u037f\u0382"+
		"\u0001\u0000\u0000\u0000\u0380\u037e\u0001\u0000\u0000\u0000\u0380\u0381"+
		"\u0001\u0000\u0000\u0000\u0381G\u0001\u0000\u0000\u0000\u0382\u0380\u0001"+
		"\u0000\u0000\u0000\u0383\u0384\u0006$\uffff\uffff\u0000\u0384\u0385\u0003"+
		"F#\u0000\u0385\u038b\u0001\u0000\u0000\u0000\u0386\u0387\n\u0001\u0000"+
		"\u0000\u0387\u0388\u0005X\u0000\u0000\u0388\u038a\u0003F#\u0000\u0389"+
		"\u0386\u0001\u0000\u0000\u0000\u038a\u038d\u0001\u0000\u0000\u0000\u038b"+
		"\u0389\u0001\u0000\u0000\u0000\u038b\u038c\u0001\u0000\u0000\u0000\u038c"+
		"I\u0001\u0000\u0000\u0000\u038d\u038b\u0001\u0000\u0000\u0000\u038e\u038f"+
		"\u0006%\uffff\uffff\u0000\u038f\u0390\u0003H$\u0000\u0390\u0396\u0001"+
		"\u0000\u0000\u0000\u0391\u0392\n\u0001\u0000\u0000\u0392\u0393\u0005Z"+
		"\u0000\u0000\u0393\u0395\u0003H$\u0000\u0394\u0391\u0001\u0000\u0000\u0000"+
		"\u0395\u0398\u0001\u0000\u0000\u0000\u0396\u0394\u0001\u0000\u0000\u0000"+
		"\u0396\u0397\u0001\u0000\u0000\u0000\u0397K\u0001\u0000\u0000\u0000\u0398"+
		"\u0396\u0001\u0000\u0000\u0000\u0399\u039a\u0006&\uffff\uffff\u0000\u039a"+
		"\u039b\u0003J%\u0000\u039b\u03a1\u0001\u0000\u0000\u0000\u039c\u039d\n"+
		"\u0001\u0000\u0000\u039d\u039e\u0005n\u0000\u0000\u039e\u03a0\u0003J%"+
		"\u0000\u039f\u039c\u0001\u0000\u0000\u0000\u03a0\u03a3\u0001\u0000\u0000"+
		"\u0000\u03a1\u039f\u0001\u0000\u0000\u0000\u03a1\u03a2\u0001\u0000\u0000"+
		"\u0000\u03a2M\u0001\u0000\u0000\u0000\u03a3\u03a1\u0001\u0000\u0000\u0000"+
		"\u03a4\u03a5\u0006\'\uffff\uffff\u0000\u03a5\u03a6\u0003L&\u0000\u03a6"+
		"\u03ac\u0001\u0000\u0000\u0000\u03a7\u03a8\n\u0001\u0000\u0000\u03a8\u03a9"+
		"\u0005o\u0000\u0000\u03a9\u03ab\u0003L&\u0000\u03aa\u03a7\u0001\u0000"+
		"\u0000\u0000\u03ab\u03ae\u0001\u0000\u0000\u0000\u03ac\u03aa\u0001\u0000"+
		"\u0000\u0000\u03ac\u03ad\u0001\u0000\u0000\u0000\u03adO\u0001\u0000\u0000"+
		"\u0000\u03ae\u03ac\u0001\u0000\u0000\u0000\u03af\u03b7\u0003N\'\u0000"+
		"\u03b0\u03b1\u0003N\'\u0000\u03b1\u03b2\u0005u\u0000\u0000\u03b2\u03b3"+
		"\u0003V+\u0000\u03b3\u03b4\u0005v\u0000\u0000\u03b4\u03b5\u0003R)\u0000"+
		"\u03b5\u03b7\u0001\u0000\u0000\u0000\u03b6\u03af\u0001\u0000\u0000\u0000"+
		"\u03b6\u03b0\u0001\u0000\u0000\u0000\u03b7Q\u0001\u0000\u0000\u0000\u03b8"+
		"\u03bf\u0003P(\u0000\u03b9\u03ba\u0003N\'\u0000\u03ba\u03bb\u0003T*\u0000"+
		"\u03bb\u03bc\u0003\u0116\u008b\u0000\u03bc\u03bf\u0001\u0000\u0000\u0000"+
		"\u03bd\u03bf\u0003\u0176\u00bb\u0000\u03be\u03b8\u0001\u0000\u0000\u0000"+
		"\u03be\u03b9\u0001\u0000\u0000\u0000\u03be\u03bd\u0001\u0000\u0000\u0000"+
		"\u03bfS\u0001\u0000\u0000\u0000\u03c0\u03cc\u0005]\u0000\u0000\u03c1\u03cc"+
		"\u0005b\u0000\u0000\u03c2\u03cc\u0005c\u0000\u0000\u03c3\u03cc\u0005d"+
		"\u0000\u0000\u03c4\u03cc\u0005`\u0000\u0000\u03c5\u03cc\u0005a\u0000\u0000"+
		"\u03c6\u03cc\u0003\u0182\u00c1\u0000\u03c7\u03cc\u0005i\u0000\u0000\u03c8"+
		"\u03cc\u0005f\u0000\u0000\u03c9\u03cc\u0005e\u0000\u0000\u03ca\u03cc\u0005"+
		"g\u0000\u0000\u03cb\u03c0\u0001\u0000\u0000\u0000\u03cb\u03c1\u0001\u0000"+
		"\u0000\u0000\u03cb\u03c2\u0001\u0000\u0000\u0000\u03cb\u03c3\u0001\u0000"+
		"\u0000\u0000\u03cb\u03c4\u0001\u0000\u0000\u0000\u03cb\u03c5\u0001\u0000"+
		"\u0000\u0000\u03cb\u03c6\u0001\u0000\u0000\u0000\u03cb\u03c7\u0001\u0000"+
		"\u0000\u0000\u03cb\u03c8\u0001\u0000\u0000\u0000\u03cb\u03c9\u0001\u0000"+
		"\u0000\u0000\u03cb\u03ca\u0001\u0000\u0000\u0000\u03ccU\u0001\u0000\u0000"+
		"\u0000\u03cd\u03ce\u0006+\uffff\uffff\u0000\u03ce\u03cf\u0003R)\u0000"+
		"\u03cf\u03d5\u0001\u0000\u0000\u0000\u03d0\u03d1\n\u0001\u0000\u0000\u03d1"+
		"\u03d2\u0005r\u0000\u0000\u03d2\u03d4\u0003R)\u0000\u03d3\u03d0\u0001"+
		"\u0000\u0000\u0000\u03d4\u03d7\u0001\u0000\u0000\u0000\u03d5\u03d3\u0001"+
		"\u0000\u0000\u0000\u03d5\u03d6\u0001\u0000\u0000\u0000\u03d6W\u0001\u0000"+
		"\u0000\u0000\u03d7\u03d5\u0001\u0000\u0000\u0000\u03d8\u03d9\u0003P(\u0000"+
		"\u03d9Y\u0001\u0000\u0000\u0000\u03da\u03f5\u0003\\.\u0000\u03db\u03dd"+
		"\u0003\u00ceg\u0000\u03dc\u03db\u0001\u0000\u0000\u0000\u03dc\u03dd\u0001"+
		"\u0000\u0000\u0000\u03dd\u03de\u0001\u0000\u0000\u0000\u03de\u03f5\u0003"+
		"^/\u0000\u03df\u03e1\u0003\u00ceg\u0000\u03e0\u03df\u0001\u0000\u0000"+
		"\u0000\u03e0\u03e1\u0001\u0000\u0000\u0000\u03e1\u03e2\u0001\u0000\u0000"+
		"\u0000\u03e2\u03f5\u0003`0\u0000\u03e3\u03e5\u0003\u00ceg\u0000\u03e4"+
		"\u03e3\u0001\u0000\u0000\u0000\u03e4\u03e5\u0001\u0000\u0000\u0000\u03e5"+
		"\u03e6\u0001\u0000\u0000\u0000\u03e6\u03f5\u0003d2\u0000\u03e7\u03e9\u0003"+
		"\u00ceg\u0000\u03e8\u03e7\u0001\u0000\u0000\u0000\u03e8\u03e9\u0001\u0000"+
		"\u0000\u0000\u03e9\u03ea\u0001\u0000\u0000\u0000\u03ea\u03f5\u0003h4\u0000"+
		"\u03eb\u03ed\u0003\u00ceg\u0000\u03ec\u03eb\u0001\u0000\u0000\u0000\u03ec"+
		"\u03ed\u0001\u0000\u0000\u0000\u03ed\u03ee\u0001\u0000\u0000\u0000\u03ee"+
		"\u03f5\u0003p8\u0000\u03ef\u03f5\u0003r9\u0000\u03f0\u03f2\u0003\u00ce"+
		"g\u0000\u03f1\u03f0\u0001\u0000\u0000\u0000\u03f1\u03f2\u0001\u0000\u0000"+
		"\u0000\u03f2\u03f3\u0001\u0000\u0000\u0000\u03f3\u03f5\u0003\u016c\u00b6"+
		"\u0000\u03f4\u03da\u0001\u0000\u0000\u0000\u03f4\u03dc\u0001\u0000\u0000"+
		"\u0000\u03f4\u03e0\u0001\u0000\u0000\u0000\u03f4\u03e4\u0001\u0000\u0000"+
		"\u0000\u03f4\u03e8\u0001\u0000\u0000\u0000\u03f4\u03ec\u0001\u0000\u0000"+
		"\u0000\u03f4\u03ef\u0001\u0000\u0000\u0000\u03f4\u03f1\u0001\u0000\u0000"+
		"\u0000\u03f5[\u0001\u0000\u0000\u0000\u03f6\u03f8\u0003\u00ceg\u0000\u03f7"+
		"\u03f6\u0001\u0000\u0000\u0000\u03f7\u03f8\u0001\u0000\u0000\u0000\u03f8"+
		"\u03f9\u0001\u0000\u0000\u0000\u03f9\u03fa\u0005|\u0000\u0000\u03fa\u03fb"+
		"\u0005v\u0000\u0000\u03fb\u040b\u0003Z-\u0000\u03fc\u03fe\u0003\u00ce"+
		"g\u0000\u03fd\u03fc\u0001\u0000\u0000\u0000\u03fd\u03fe\u0001\u0000\u0000"+
		"\u0000\u03fe\u03ff\u0001\u0000\u0000\u0000\u03ff\u0400\u0005\b\u0000\u0000"+
		"\u0400\u0401\u0003X,\u0000\u0401\u0402\u0005v\u0000\u0000\u0402\u0403"+
		"\u0003Z-\u0000\u0403\u040b\u0001\u0000\u0000\u0000\u0404\u0406\u0003\u00ce"+
		"g\u0000\u0405\u0404\u0001\u0000\u0000\u0000\u0405\u0406\u0001\u0000\u0000"+
		"\u0000\u0406\u0407\u0001\u0000\u0000\u0000\u0407\u0408\u0005\u0013\u0000"+
		"\u0000\u0408\u0409\u0005v\u0000\u0000\u0409\u040b\u0003Z-\u0000\u040a"+
		"\u03f7\u0001\u0000\u0000\u0000\u040a\u03fd\u0001\u0000\u0000\u0000\u040a"+
		"\u0405\u0001\u0000\u0000\u0000\u040b]\u0001\u0000\u0000\u0000\u040c\u040e"+
		"\u0003V+\u0000\u040d\u040c\u0001\u0000\u0000\u0000\u040d\u040e\u0001\u0000"+
		"\u0000\u0000\u040e\u040f\u0001\u0000\u0000\u0000\u040f\u0410\u0005x\u0000"+
		"\u0000\u0410_\u0001\u0000\u0000\u0000\u0411\u0413\u0005Q\u0000\u0000\u0412"+
		"\u0414\u0003b1\u0000\u0413\u0412\u0001\u0000\u0000\u0000\u0413\u0414\u0001"+
		"\u0000\u0000\u0000\u0414\u0415\u0001\u0000\u0000\u0000\u0415\u0416\u0005"+
		"R\u0000\u0000\u0416a\u0001\u0000\u0000\u0000\u0417\u0418\u00061\uffff"+
		"\uffff\u0000\u0418\u0419\u0003Z-\u0000\u0419\u041e\u0001\u0000\u0000\u0000"+
		"\u041a\u041b\n\u0001\u0000\u0000\u041b\u041d\u0003Z-\u0000\u041c\u041a"+
		"\u0001\u0000\u0000\u0000\u041d\u0420\u0001\u0000\u0000\u0000\u041e\u041c"+
		"\u0001\u0000\u0000\u0000\u041e\u041f\u0001\u0000\u0000\u0000\u041fc\u0001"+
		"\u0000\u0000\u0000\u0420\u041e\u0001\u0000\u0000\u0000\u0421\u0422\u0005"+
		"#\u0000\u0000\u0422\u0423\u0005M\u0000\u0000\u0423\u0424\u0003f3\u0000"+
		"\u0424\u0425\u0005N\u0000\u0000\u0425\u0426\u0003Z-\u0000\u0426\u0436"+
		"\u0001\u0000\u0000\u0000\u0427\u0428\u0005#\u0000\u0000\u0428\u0429\u0005"+
		"M\u0000\u0000\u0429\u042a\u0003f3\u0000\u042a\u042b\u0005N\u0000\u0000"+
		"\u042b\u042c\u0003Z-\u0000\u042c\u042d\u0005\u0018\u0000\u0000\u042d\u042e"+
		"\u0003Z-\u0000\u042e\u0436\u0001\u0000\u0000\u0000\u042f\u0430\u0005;"+
		"\u0000\u0000\u0430\u0431\u0005M\u0000\u0000\u0431\u0432\u0003f3\u0000"+
		"\u0432\u0433\u0005N\u0000\u0000\u0433\u0434\u0003Z-\u0000\u0434\u0436"+
		"\u0001\u0000\u0000\u0000\u0435\u0421\u0001\u0000\u0000\u0000\u0435\u0427"+
		"\u0001\u0000\u0000\u0000\u0435\u042f\u0001\u0000\u0000\u0000\u0436e\u0001"+
		"\u0000\u0000\u0000\u0437\u0448\u0003V+\u0000\u0438\u043a\u0003\u00ceg"+
		"\u0000\u0439\u0438\u0001\u0000\u0000\u0000\u0439\u043a\u0001\u0000\u0000"+
		"\u0000\u043a\u043b\u0001\u0000\u0000\u0000\u043b\u043c\u0003\u0086C\u0000"+
		"\u043c\u043d\u0003\u00e8t\u0000\u043d\u043e\u0005]\u0000\u0000\u043e\u043f"+
		"\u0003\u0116\u008b\u0000\u043f\u0448\u0001\u0000\u0000\u0000\u0440\u0442"+
		"\u0003\u00ceg\u0000\u0441\u0440\u0001\u0000\u0000\u0000\u0441\u0442\u0001"+
		"\u0000\u0000\u0000\u0442\u0443\u0001\u0000\u0000\u0000\u0443\u0444\u0003"+
		"\u0086C\u0000\u0444\u0445\u0003\u00e8t\u0000\u0445\u0446\u0003\u011a\u008d"+
		"\u0000\u0446\u0448\u0001\u0000\u0000\u0000\u0447\u0437\u0001\u0000\u0000"+
		"\u0000\u0447\u0439\u0001\u0000\u0000\u0000\u0447\u0441\u0001\u0000\u0000"+
		"\u0000\u0448g\u0001\u0000\u0000\u0000\u0449\u044a\u0005L\u0000\u0000\u044a"+
		"\u044b\u0005M\u0000\u0000\u044b\u044c\u0003f3\u0000\u044c\u044d\u0005"+
		"N\u0000\u0000\u044d\u044e\u0003Z-\u0000\u044e\u046d\u0001\u0000\u0000"+
		"\u0000\u044f\u0450\u0005\u0015\u0000\u0000\u0450\u0451\u0003Z-\u0000\u0451"+
		"\u0452\u0005L\u0000\u0000\u0452\u0453\u0005M\u0000\u0000\u0453\u0454\u0003"+
		"V+\u0000\u0454\u0455\u0005N\u0000\u0000\u0455\u0456\u0005x\u0000\u0000"+
		"\u0456\u046d\u0001\u0000\u0000\u0000\u0457\u0458\u0005 \u0000\u0000\u0458"+
		"\u0459\u0005M\u0000\u0000\u0459\u045b\u0003j5\u0000\u045a\u045c\u0003"+
		"f3\u0000\u045b\u045a\u0001\u0000\u0000\u0000\u045b\u045c\u0001\u0000\u0000"+
		"\u0000\u045c\u045d\u0001\u0000\u0000\u0000\u045d\u045f\u0005x\u0000\u0000"+
		"\u045e\u0460\u0003V+\u0000\u045f\u045e\u0001\u0000\u0000\u0000\u045f\u0460"+
		"\u0001\u0000\u0000\u0000\u0460\u0461\u0001\u0000\u0000\u0000\u0461\u0462"+
		"\u0005N\u0000\u0000\u0462\u0463\u0003Z-\u0000\u0463\u046d\u0001\u0000"+
		"\u0000\u0000\u0464\u0465\u0005 \u0000\u0000\u0465\u0466\u0005M\u0000\u0000"+
		"\u0466\u0467\u0003l6\u0000\u0467\u0468\u0005v\u0000\u0000\u0468\u0469"+
		"\u0003n7\u0000\u0469\u046a\u0005N\u0000\u0000\u046a\u046b\u0003Z-\u0000"+
		"\u046b\u046d\u0001\u0000\u0000\u0000\u046c\u0449\u0001\u0000\u0000\u0000"+
		"\u046c\u044f\u0001\u0000\u0000\u0000\u046c\u0457\u0001\u0000\u0000\u0000"+
		"\u046c\u0464\u0001\u0000\u0000\u0000\u046di\u0001\u0000\u0000\u0000\u046e"+
		"\u0471\u0003^/\u0000\u046f\u0471\u0003|>\u0000\u0470\u046e\u0001\u0000"+
		"\u0000\u0000\u0470\u046f\u0001\u0000\u0000\u0000\u0471k\u0001\u0000\u0000"+
		"\u0000\u0472\u0474\u0003\u00ceg\u0000\u0473\u0472\u0001\u0000\u0000\u0000"+
		"\u0473\u0474\u0001\u0000\u0000\u0000\u0474\u0475\u0001\u0000\u0000\u0000"+
		"\u0475\u0476\u0003\u0086C\u0000\u0476\u0477\u0003\u00e8t\u0000\u0477m"+
		"\u0001\u0000\u0000\u0000\u0478\u047b\u0003V+\u0000\u0479\u047b\u0003\u011a"+
		"\u008d\u0000\u047a\u0478\u0001\u0000\u0000\u0000\u047a\u0479\u0001\u0000"+
		"\u0000\u0000\u047bo\u0001\u0000\u0000\u0000\u047c\u047d\u0005\u0007\u0000"+
		"\u0000\u047d\u048d\u0005x\u0000\u0000\u047e\u047f\u0005\u0011\u0000\u0000"+
		"\u047f\u048d\u0005x\u0000\u0000\u0480\u0482\u00053\u0000\u0000\u0481\u0483"+
		"\u0003V+\u0000\u0482\u0481\u0001\u0000\u0000\u0000\u0482\u0483\u0001\u0000"+
		"\u0000\u0000\u0483\u0484\u0001\u0000\u0000\u0000\u0484\u048d\u0005x\u0000"+
		"\u0000\u0485\u0486\u00053\u0000\u0000\u0486\u0487\u0003\u011a\u008d\u0000"+
		"\u0487\u0488\u0005x\u0000\u0000\u0488\u048d\u0001\u0000\u0000\u0000\u0489"+
		"\u048a\u0005\"\u0000\u0000\u048a\u048b\u0005|\u0000\u0000\u048b\u048d"+
		"\u0005x\u0000\u0000\u048c\u047c\u0001\u0000\u0000\u0000\u048c\u047e\u0001"+
		"\u0000\u0000\u0000\u048c\u0480\u0001\u0000\u0000\u0000\u048c\u0485\u0001"+
		"\u0000\u0000\u0000\u048c\u0489\u0001\u0000\u0000\u0000\u048dq\u0001\u0000"+
		"\u0000\u0000\u048e\u048f\u0003x<\u0000\u048fs\u0001\u0000\u0000\u0000"+
		"\u0490\u0491\u0006:\uffff\uffff\u0000\u0491\u0492\u0003v;\u0000\u0492"+
		"\u0497\u0001\u0000\u0000\u0000\u0493\u0494\n\u0001\u0000\u0000\u0494\u0496"+
		"\u0003v;\u0000\u0495\u0493\u0001\u0000\u0000\u0000\u0496\u0499\u0001\u0000"+
		"\u0000\u0000\u0497\u0495\u0001\u0000\u0000\u0000\u0497\u0498\u0001\u0000"+
		"\u0000\u0000\u0498u\u0001\u0000\u0000\u0000\u0499\u0497\u0001\u0000\u0000"+
		"\u0000\u049a\u04a4\u0003x<\u0000\u049b\u04a4\u0003\u010e\u0087\u0000\u049c"+
		"\u04a4\u0003\u0154\u00aa\u0000\u049d\u04a4\u0003\u0168\u00b4\u0000\u049e"+
		"\u04a4\u0003\u016a\u00b5\u0000\u049f\u04a4\u0003\u00ccf\u0000\u04a0\u04a4"+
		"\u0003\u00b4Z\u0000\u04a1\u04a4\u0003\u0080@\u0000\u04a2\u04a4\u0003\u0082"+
		"A\u0000\u04a3\u049a\u0001\u0000\u0000\u0000\u04a3\u049b\u0001\u0000\u0000"+
		"\u0000\u04a3\u049c\u0001\u0000\u0000\u0000\u04a3\u049d\u0001\u0000\u0000"+
		"\u0000\u04a3\u049e\u0001\u0000\u0000\u0000\u04a3\u049f\u0001\u0000\u0000"+
		"\u0000\u04a3\u04a0\u0001\u0000\u0000\u0000\u04a3\u04a1\u0001\u0000\u0000"+
		"\u0000\u04a3\u04a2\u0001\u0000\u0000\u0000\u04a4w\u0001\u0000\u0000\u0000"+
		"\u04a5\u04ae\u0003|>\u0000\u04a6\u04ae\u0003\u00cae\u0000\u04a7\u04ae"+
		"\u0003\u00c2a\u0000\u04a8\u04ae\u0003\u00c6c\u0000\u04a9\u04ae\u0003\u00c8"+
		"d\u0000\u04aa\u04ae\u0003~?\u0000\u04ab\u04ae\u0003z=\u0000\u04ac\u04ae"+
		"\u0003\u00a4R\u0000\u04ad\u04a5\u0001\u0000\u0000\u0000\u04ad\u04a6\u0001"+
		"\u0000\u0000\u0000\u04ad\u04a7\u0001\u0000\u0000\u0000\u04ad\u04a8\u0001"+
		"\u0000\u0000\u0000\u04ad\u04a9\u0001\u0000\u0000\u0000\u04ad\u04aa\u0001"+
		"\u0000\u0000\u0000\u04ad\u04ab\u0001\u0000\u0000\u0000\u04ad\u04ac\u0001"+
		"\u0000\u0000\u0000\u04aey\u0001\u0000\u0000\u0000\u04af\u04b0\u0005G\u0000"+
		"\u0000\u04b0\u04b2\u0005|\u0000\u0000\u04b1\u04b3\u0003\u00ceg\u0000\u04b2"+
		"\u04b1\u0001\u0000\u0000\u0000\u04b2\u04b3\u0001\u0000\u0000\u0000\u04b3"+
		"\u04b4\u0001\u0000\u0000\u0000\u04b4\u04b5\u0005]\u0000\u0000\u04b5\u04b6"+
		"\u0003\u00fc~\u0000\u04b6\u04b7\u0005x\u0000\u0000\u04b7{\u0001\u0000"+
		"\u0000\u0000\u04b8\u04ba\u0003\u0086C\u0000\u04b9\u04b8\u0001\u0000\u0000"+
		"\u0000\u04b9\u04ba\u0001\u0000\u0000\u0000\u04ba\u04bc\u0001\u0000\u0000"+
		"\u0000\u04bb\u04bd\u0003\u00e4r\u0000\u04bc\u04bb\u0001\u0000\u0000\u0000"+
		"\u04bc\u04bd\u0001\u0000\u0000\u0000\u04bd\u04be\u0001\u0000\u0000\u0000"+
		"\u04be\u04c7\u0005x\u0000\u0000\u04bf\u04c1\u0003\u00ceg\u0000\u04c0\u04c2"+
		"\u0003\u0086C\u0000\u04c1\u04c0\u0001\u0000\u0000\u0000\u04c1\u04c2\u0001"+
		"\u0000\u0000\u0000\u04c2\u04c3\u0001\u0000\u0000\u0000\u04c3\u04c4\u0003"+
		"\u00e4r\u0000\u04c4\u04c5\u0005x\u0000\u0000\u04c5\u04c7\u0001\u0000\u0000"+
		"\u0000\u04c6\u04b9\u0001\u0000\u0000\u0000\u04c6\u04bf\u0001\u0000\u0000"+
		"\u0000\u04c7}\u0001\u0000\u0000\u0000\u04c8\u04c9\u00058\u0000\u0000\u04c9"+
		"\u04ca\u0005M\u0000\u0000\u04ca\u04cb\u0003X,\u0000\u04cb\u04cc\u0005"+
		"r\u0000\u0000\u04cc\u04cd\u0005\u0085\u0000\u0000\u04cd\u04ce\u0005N\u0000"+
		"\u0000\u04ce\u04cf\u0005x\u0000\u0000\u04cf\u007f\u0001\u0000\u0000\u0000"+
		"\u04d0\u04d1\u0005x\u0000\u0000\u04d1\u0081\u0001\u0000\u0000\u0000\u04d2"+
		"\u04d3\u0003\u00ceg\u0000\u04d3\u04d4\u0005x\u0000\u0000\u04d4\u0083\u0001"+
		"\u0000\u0000\u0000\u04d5\u04dc\u0003\u0088D\u0000\u04d6\u04dc\u0003\u008e"+
		"G\u0000\u04d7\u04dc\u0003\u008aE\u0000\u04d8\u04dc\u0005!\u0000\u0000"+
		"\u04d9\u04dc\u0005B\u0000\u0000\u04da\u04dc\u0005\u000f\u0000\u0000\u04db"+
		"\u04d5\u0001\u0000\u0000\u0000\u04db\u04d6\u0001\u0000\u0000\u0000\u04db"+
		"\u04d7\u0001\u0000\u0000\u0000\u04db\u04d8\u0001\u0000\u0000\u0000\u04db"+
		"\u04d9\u0001\u0000\u0000\u0000\u04db\u04da\u0001\u0000\u0000\u0000\u04dc"+
		"\u0085\u0001\u0000\u0000\u0000\u04dd\u04df\u0003\u0084B\u0000\u04de\u04e0"+
		"\u0003\u00ceg\u0000\u04df\u04de\u0001\u0000\u0000\u0000\u04df\u04e0\u0001"+
		"\u0000\u0000\u0000\u04e0\u04e5\u0001\u0000\u0000\u0000\u04e1\u04e2\u0003"+
		"\u0084B\u0000\u04e2\u04e3\u0003\u0086C\u0000\u04e3\u04e5\u0001\u0000\u0000"+
		"\u0000\u04e4\u04dd\u0001\u0000\u0000\u0000\u04e4\u04e1\u0001\u0000\u0000"+
		"\u0000\u04e5\u0087\u0001\u0000\u0000\u0000\u04e6\u04e7\u0007\u0002\u0000"+
		"\u0000\u04e7\u0089\u0001\u0000\u0000\u0000\u04e8\u04e9\u0007\u0003\u0000"+
		"\u0000\u04e9\u008b\u0001\u0000\u0000\u0000\u04ea\u04eb\u0005|\u0000\u0000"+
		"\u04eb\u008d\u0001\u0000\u0000\u0000\u04ec\u04f0\u0003\u0090H\u0000\u04ed"+
		"\u04f0\u0003\u011e\u008f\u0000\u04ee\u04f0\u0003\u00a0P\u0000\u04ef\u04ec"+
		"\u0001\u0000\u0000\u0000\u04ef\u04ed\u0001\u0000\u0000\u0000\u04ef\u04ee"+
		"\u0001\u0000\u0000\u0000\u04f0\u008f\u0001\u0000\u0000\u0000\u04f1\u04f6"+
		"\u0003\u0096K\u0000\u04f2\u04f6\u0003\u009cN\u0000\u04f3\u04f6\u0003\u0166"+
		"\u00b3\u0000\u04f4\u04f6\u0003\u00f6{\u0000\u04f5\u04f1\u0001\u0000\u0000"+
		"\u0000\u04f5\u04f2\u0001\u0000\u0000\u0000\u04f5\u04f3\u0001\u0000\u0000"+
		"\u0000\u04f5\u04f4\u0001\u0000\u0000\u0000\u04f6\u0091\u0001\u0000\u0000"+
		"\u0000\u04f7\u04f9\u0003\u008eG\u0000\u04f8\u04fa\u0003\u00ceg\u0000\u04f9"+
		"\u04f8\u0001\u0000\u0000\u0000\u04f9\u04fa\u0001\u0000\u0000\u0000\u04fa"+
		"\u04ff\u0001\u0000\u0000\u0000\u04fb\u04fc\u0003\u008eG\u0000\u04fc\u04fd"+
		"\u0003\u0092I\u0000\u04fd\u04ff\u0001\u0000\u0000\u0000\u04fe\u04f7\u0001"+
		"\u0000\u0000\u0000\u04fe\u04fb\u0001\u0000\u0000\u0000\u04ff\u0093\u0001"+
		"\u0000\u0000\u0000\u0500\u0502\u0003\u0090H\u0000\u0501\u0503\u0003\u00ce"+
		"g\u0000\u0502\u0501\u0001\u0000\u0000\u0000\u0502\u0503\u0001\u0000\u0000"+
		"\u0000\u0503\u0508\u0001\u0000\u0000\u0000\u0504\u0505\u0003\u0090H\u0000"+
		"\u0505\u0506\u0003\u0094J\u0000\u0506\u0508\u0001\u0000\u0000\u0000\u0507"+
		"\u0500\u0001\u0000\u0000\u0000\u0507\u0504\u0001\u0000\u0000\u0000\u0508"+
		"\u0095\u0001\u0000\u0000\u0000\u0509\u050b\u0003\n\u0005\u0000\u050a\u0509"+
		"\u0001\u0000\u0000\u0000\u050a\u050b\u0001\u0000\u0000\u0000\u050b\u050c"+
		"\u0001\u0000\u0000\u0000\u050c\u0521\u0003\u0098L\u0000\u050d\u050e\u0003"+
		"\n\u0005\u0000\u050e\u050f\u0005<\u0000\u0000\u050f\u0510\u0003\u015c"+
		"\u00ae\u0000\u0510\u0521\u0001\u0000\u0000\u0000\u0511\u0521\u0005\n\u0000"+
		"\u0000\u0512\u0521\u0005\u000b\u0000\u0000\u0513\u0521\u0005\f\u0000\u0000"+
		"\u0514\u0521\u0005K\u0000\u0000\u0515\u0521\u0005\u0006\u0000\u0000\u0516"+
		"\u0521\u00054\u0000\u0000\u0517\u0521\u0005%\u0000\u0000\u0518\u0521\u0005"+
		"&\u0000\u0000\u0519\u0521\u00055\u0000\u0000\u051a\u0521\u0005F\u0000"+
		"\u0000\u051b\u0521\u0005\u001f\u0000\u0000\u051c\u0521\u0005\u0016\u0000"+
		"\u0000\u051d\u0521\u0005I\u0000\u0000\u051e\u0521\u0005\u0005\u0000\u0000"+
		"\u051f\u0521\u0003\u009aM\u0000\u0520\u050a\u0001\u0000\u0000\u0000\u0520"+
		"\u050d\u0001\u0000\u0000\u0000\u0520\u0511\u0001\u0000\u0000\u0000\u0520"+
		"\u0512\u0001\u0000\u0000\u0000\u0520\u0513\u0001\u0000\u0000\u0000\u0520"+
		"\u0514\u0001\u0000\u0000\u0000\u0520\u0515\u0001\u0000\u0000\u0000\u0520"+
		"\u0516\u0001\u0000\u0000\u0000\u0520\u0517\u0001\u0000\u0000\u0000\u0520"+
		"\u0518\u0001\u0000\u0000\u0000\u0520\u0519\u0001\u0000\u0000\u0000\u0520"+
		"\u051a\u0001\u0000\u0000\u0000\u0520\u051b\u0001\u0000\u0000\u0000\u0520"+
		"\u051c\u0001\u0000\u0000\u0000\u0520\u051d\u0001\u0000\u0000\u0000\u0520"+
		"\u051e\u0001\u0000\u0000\u0000\u0520\u051f\u0001\u0000\u0000\u0000\u0521"+
		"\u0097\u0001\u0000\u0000\u0000\u0522\u0527\u0003\u011c\u008e\u0000\u0523"+
		"\u0527\u0003\u009eO\u0000\u0524\u0527\u0003\u008cF\u0000\u0525\u0527\u0003"+
		"\u015c\u00ae\u0000\u0526\u0522\u0001\u0000\u0000\u0000\u0526\u0523\u0001"+
		"\u0000\u0000\u0000\u0526\u0524\u0001\u0000\u0000\u0000\u0526\u0525\u0001"+
		"\u0000\u0000\u0000\u0527\u0099\u0001\u0000\u0000\u0000\u0528\u0529\u0005"+
		"\u0012\u0000\u0000\u0529\u052a\u0005M\u0000\u0000\u052a\u052b\u0003V+"+
		"\u0000\u052b\u052c\u0005N\u0000\u0000\u052c\u0532\u0001\u0000\u0000\u0000"+
		"\u052d\u052e\u0005\u0012\u0000\u0000\u052e\u052f\u0005M\u0000\u0000\u052f"+
		"\u0530\u0005\u0005\u0000\u0000\u0530\u0532\u0005N\u0000\u0000\u0531\u0528"+
		"\u0001\u0000\u0000\u0000\u0531\u052d\u0001\u0000\u0000\u0000\u0532\u009b"+
		"\u0001\u0000\u0000\u0000\u0533\u0535\u0003\u0126\u0093\u0000\u0534\u0536"+
		"\u0003\u00ceg\u0000\u0535\u0534\u0001\u0000\u0000\u0000\u0535\u0536\u0001"+
		"\u0000\u0000\u0000\u0536\u0538\u0001\u0000\u0000\u0000\u0537\u0539\u0003"+
		"\n\u0005\u0000\u0538\u0537\u0001\u0000\u0000\u0000\u0538\u0539\u0001\u0000"+
		"\u0000\u0000\u0539\u053a\u0001\u0000\u0000\u0000\u053a\u053b\u0005|\u0000"+
		"\u0000\u053b\u054c\u0001\u0000\u0000\u0000\u053c\u053d\u0003\u0126\u0093"+
		"\u0000\u053d\u053e\u0003\u015c\u00ae\u0000\u053e\u054c\u0001\u0000\u0000"+
		"\u0000\u053f\u0540\u0003\u0126\u0093\u0000\u0540\u0542\u0003\n\u0005\u0000"+
		"\u0541\u0543\u0005<\u0000\u0000\u0542\u0541\u0001\u0000\u0000\u0000\u0542"+
		"\u0543\u0001\u0000\u0000\u0000\u0543\u0544\u0001\u0000\u0000\u0000\u0544"+
		"\u0545\u0003\u015c\u00ae\u0000\u0545\u054c\u0001\u0000\u0000\u0000\u0546"+
		"\u0548\u0005\u0019\u0000\u0000\u0547\u0549\u0003\n\u0005\u0000\u0548\u0547"+
		"\u0001\u0000\u0000\u0000\u0548\u0549\u0001\u0000\u0000\u0000\u0549\u054a"+
		"\u0001\u0000\u0000\u0000\u054a\u054c\u0005|\u0000\u0000\u054b\u0533\u0001"+
		"\u0000\u0000\u0000\u054b\u053c\u0001\u0000\u0000\u0000\u054b\u053f\u0001"+
		"\u0000\u0000\u0000\u054b\u0546\u0001\u0000\u0000\u0000\u054c\u009d\u0001"+
		"\u0000\u0000\u0000\u054d\u054e\u0005|\u0000\u0000\u054e\u009f\u0001\u0000"+
		"\u0000\u0000\u054f\u0550\u0003\u00a2Q\u0000\u0550\u0552\u0005Q\u0000\u0000"+
		"\u0551\u0553\u0003\u00aaU\u0000\u0552\u0551\u0001\u0000\u0000\u0000\u0552"+
		"\u0553\u0001\u0000\u0000\u0000\u0553\u0554\u0001\u0000\u0000\u0000\u0554"+
		"\u0555\u0005R\u0000\u0000\u0555\u055d\u0001\u0000\u0000\u0000\u0556\u0557"+
		"\u0003\u00a2Q\u0000\u0557\u0558\u0005Q\u0000\u0000\u0558\u0559\u0003\u00aa"+
		"U\u0000\u0559\u055a\u0005r\u0000\u0000\u055a\u055b\u0005R\u0000\u0000"+
		"\u055b\u055d\u0001\u0000\u0000\u0000\u055c\u054f\u0001\u0000\u0000\u0000"+
		"\u055c\u0556\u0001\u0000\u0000\u0000\u055d\u00a1\u0001\u0000\u0000\u0000"+
		"\u055e\u0560\u0003\u00a6S\u0000\u055f\u0561\u0003\u00ceg\u0000\u0560\u055f"+
		"\u0001\u0000\u0000\u0000\u0560\u0561\u0001\u0000\u0000\u0000\u0561\u0563"+
		"\u0001\u0000\u0000\u0000\u0562\u0564\u0005|\u0000\u0000\u0563\u0562\u0001"+
		"\u0000\u0000\u0000\u0563\u0564\u0001\u0000\u0000\u0000\u0564\u0566\u0001"+
		"\u0000\u0000\u0000\u0565\u0567\u0003\u00a8T\u0000\u0566\u0565\u0001\u0000"+
		"\u0000\u0000\u0566\u0567\u0001\u0000\u0000\u0000\u0567\u0572\u0001\u0000"+
		"\u0000\u0000\u0568\u056a\u0003\u00a6S\u0000\u0569\u056b\u0003\u00ceg\u0000"+
		"\u056a\u0569\u0001\u0000\u0000\u0000\u056a\u056b\u0001\u0000\u0000\u0000"+
		"\u056b\u056c\u0001\u0000\u0000\u0000\u056c\u056d\u0003\n\u0005\u0000\u056d"+
		"\u056f\u0005|\u0000\u0000\u056e\u0570\u0003\u00a8T\u0000\u056f\u056e\u0001"+
		"\u0000\u0000\u0000\u056f\u0570\u0001\u0000\u0000\u0000\u0570\u0572\u0001"+
		"\u0000\u0000\u0000\u0571\u055e\u0001\u0000\u0000\u0000\u0571\u0568\u0001"+
		"\u0000\u0000\u0000\u0572\u00a3\u0001\u0000\u0000\u0000\u0573\u0575\u0003"+
		"\u00a6S\u0000\u0574\u0576\u0003\u00ceg\u0000\u0575\u0574\u0001\u0000\u0000"+
		"\u0000\u0575\u0576\u0001\u0000\u0000\u0000\u0576\u0577\u0001\u0000\u0000"+
		"\u0000\u0577\u0579\u0005|\u0000\u0000\u0578\u057a\u0003\u00a8T\u0000\u0579"+
		"\u0578\u0001\u0000\u0000\u0000\u0579\u057a\u0001\u0000\u0000\u0000\u057a"+
		"\u057b\u0001\u0000\u0000\u0000\u057b\u057c\u0005x\u0000\u0000\u057c\u00a5"+
		"\u0001\u0000\u0000\u0000\u057d\u0583\u0005\u0019\u0000\u0000\u057e\u057f"+
		"\u0005\u0019\u0000\u0000\u057f\u0583\u0005\r\u0000\u0000\u0580\u0581\u0005"+
		"\u0019\u0000\u0000\u0581\u0583\u0005:\u0000\u0000\u0582\u057d\u0001\u0000"+
		"\u0000\u0000\u0582\u057e\u0001\u0000\u0000\u0000\u0582\u0580\u0001\u0000"+
		"\u0000\u0000\u0583\u00a7\u0001\u0000\u0000\u0000\u0584\u0585\u0005v\u0000"+
		"\u0000\u0585\u0586\u0003\u0092I\u0000\u0586\u00a9\u0001\u0000\u0000\u0000"+
		"\u0587\u0588\u0006U\uffff\uffff\u0000\u0588\u0589\u0003\u00acV\u0000\u0589"+
		"\u058f\u0001\u0000\u0000\u0000\u058a\u058b\n\u0001\u0000\u0000\u058b\u058c"+
		"\u0005r\u0000\u0000\u058c\u058e\u0003\u00acV\u0000\u058d\u058a\u0001\u0000"+
		"\u0000\u0000\u058e\u0591\u0001\u0000\u0000\u0000\u058f\u058d\u0001\u0000"+
		"\u0000\u0000\u058f\u0590\u0001\u0000\u0000\u0000\u0590\u00ab\u0001\u0000"+
		"\u0000\u0000\u0591\u058f\u0001\u0000\u0000\u0000\u0592\u0598\u0003\u00ae"+
		"W\u0000\u0593\u0594\u0003\u00aeW\u0000\u0594\u0595\u0005]\u0000\u0000"+
		"\u0595\u0596\u0003X,\u0000\u0596\u0598\u0001\u0000\u0000\u0000\u0597\u0592"+
		"\u0001\u0000\u0000\u0000\u0597\u0593\u0001\u0000\u0000\u0000\u0598\u00ad"+
		"\u0001\u0000\u0000\u0000\u0599\u059a\u0005|\u0000\u0000\u059a\u00af\u0001"+
		"\u0000\u0000\u0000\u059b\u059e\u0003\u00b2Y\u0000\u059c\u059e\u0003\u00c0"+
		"`\u0000\u059d\u059b\u0001\u0000\u0000\u0000\u059d\u059c\u0001\u0000\u0000"+
		"\u0000\u059e\u00b1\u0001\u0000\u0000\u0000\u059f\u05a0\u0005|\u0000\u0000"+
		"\u05a0\u00b3\u0001\u0000\u0000\u0000\u05a1\u05a4\u0003\u00b6[\u0000\u05a2"+
		"\u05a4\u0003\u00bc^\u0000\u05a3\u05a1\u0001\u0000\u0000\u0000\u05a3\u05a2"+
		"\u0001\u0000\u0000\u0000\u05a4\u00b5\u0001\u0000\u0000\u0000\u05a5\u05a8"+
		"\u0003\u00b8\\\u0000\u05a6\u05a8\u0003\u00ba]\u0000\u05a7\u05a5\u0001"+
		"\u0000\u0000\u0000\u05a7\u05a6\u0001\u0000\u0000\u0000\u05a8\u00b7\u0001"+
		"\u0000\u0000\u0000\u05a9\u05ab\u0005$\u0000\u0000\u05aa\u05a9\u0001\u0000"+
		"\u0000\u0000\u05aa\u05ab\u0001\u0000\u0000\u0000\u05ab\u05ac\u0001\u0000"+
		"\u0000\u0000\u05ac\u05ad\u0005(\u0000\u0000\u05ad\u05ae\u0005|\u0000\u0000"+
		"\u05ae\u05af\u0005Q\u0000\u0000\u05af\u05b0\u0003\u00be_\u0000\u05b0\u05b1"+
		"\u0005R\u0000\u0000\u05b1\u00b9\u0001\u0000\u0000\u0000\u05b2\u05b4\u0005"+
		"$\u0000\u0000\u05b3\u05b2\u0001\u0000\u0000\u0000\u05b3\u05b4\u0001\u0000"+
		"\u0000\u0000\u05b4\u05b5\u0001\u0000\u0000\u0000\u05b5\u05b6\u0005(\u0000"+
		"\u0000\u05b6\u05b7\u0003\u00b2Y\u0000\u05b7\u05b8\u0005Q\u0000\u0000\u05b8"+
		"\u05b9\u0003\u00be_\u0000\u05b9\u05ba\u0005R\u0000\u0000\u05ba\u00bb\u0001"+
		"\u0000\u0000\u0000\u05bb\u05bd\u0005$\u0000\u0000\u05bc\u05bb\u0001\u0000"+
		"\u0000\u0000\u05bc\u05bd\u0001\u0000\u0000\u0000\u05bd\u05be\u0001\u0000"+
		"\u0000\u0000\u05be\u05bf\u0005(\u0000\u0000\u05bf\u05c0\u0005Q\u0000\u0000"+
		"\u05c0\u05c1\u0003\u00be_\u0000\u05c1\u05c2\u0005R\u0000\u0000\u05c2\u00bd"+
		"\u0001\u0000\u0000\u0000\u05c3\u05c5\u0003t:\u0000\u05c4\u05c3\u0001\u0000"+
		"\u0000\u0000\u05c4\u05c5\u0001\u0000\u0000\u0000\u05c5\u00bf\u0001\u0000"+
		"\u0000\u0000\u05c6\u05c7\u0005|\u0000\u0000\u05c7\u00c1\u0001\u0000\u0000"+
		"\u0000\u05c8\u05c9\u0005(\u0000\u0000\u05c9\u05ca\u0005|\u0000\u0000\u05ca"+
		"\u05cb\u0005]\u0000\u0000\u05cb\u05cc\u0003\u00c4b\u0000\u05cc\u05cd\u0005"+
		"x\u0000\u0000\u05cd\u00c3\u0001\u0000\u0000\u0000\u05ce\u05d0\u0003\n"+
		"\u0005\u0000\u05cf\u05ce\u0001\u0000\u0000\u0000\u05cf\u05d0\u0001\u0000"+
		"\u0000\u0000\u05d0\u05d1\u0001\u0000\u0000\u0000\u05d1\u05d2\u0003\u00b0"+
		"X\u0000\u05d2\u00c5\u0001\u0000\u0000\u0000\u05d3\u05d5\u0005G\u0000\u0000"+
		"\u05d4\u05d6\u0005D\u0000\u0000\u05d5\u05d4\u0001\u0000\u0000\u0000\u05d5"+
		"\u05d6\u0001\u0000\u0000\u0000\u05d6\u05d7\u0001\u0000\u0000\u0000\u05d7"+
		"\u05d8\u0003\n\u0005\u0000\u05d8\u05d9\u0003\u0006\u0003\u0000\u05d9\u05da"+
		"\u0005x\u0000\u0000\u05da\u05e1\u0001\u0000\u0000\u0000\u05db\u05dc\u0005"+
		"G\u0000\u0000\u05dc\u05dd\u0005w\u0000\u0000\u05dd\u05de\u0003\u0006\u0003"+
		"\u0000\u05de\u05df\u0005x\u0000\u0000\u05df\u05e1\u0001\u0000\u0000\u0000"+
		"\u05e0\u05d3\u0001\u0000\u0000\u0000\u05e0\u05db\u0001\u0000\u0000\u0000"+
		"\u05e1\u00c7\u0001\u0000\u0000\u0000\u05e2\u05e4\u0003\u00ceg\u0000\u05e3"+
		"\u05e2\u0001\u0000\u0000\u0000\u05e3\u05e4\u0001\u0000\u0000\u0000\u05e4"+
		"\u05e5\u0001\u0000\u0000\u0000\u05e5\u05e6\u0005G\u0000\u0000\u05e6\u05e8"+
		"\u0005(\u0000\u0000\u05e7\u05e9\u0003\n\u0005\u0000\u05e8\u05e7\u0001"+
		"\u0000\u0000\u0000\u05e8\u05e9\u0001\u0000\u0000\u0000\u05e9\u05ea\u0001"+
		"\u0000\u0000\u0000\u05ea\u05eb\u0003\u00b0X\u0000\u05eb\u05ec\u0005x\u0000"+
		"\u0000\u05ec\u00c9\u0001\u0000\u0000\u0000\u05ed\u05ee\u0005\u0004\u0000"+
		"\u0000\u05ee\u05ef\u0005M\u0000\u0000\u05ef\u05f0\u0005\u0085\u0000\u0000"+
		"\u05f0\u05f1\u0005N\u0000\u0000\u05f1\u05f2\u0005x\u0000\u0000\u05f2\u00cb"+
		"\u0001\u0000\u0000\u0000\u05f3\u05f4\u0005\u001c\u0000\u0000\u05f4\u05f5"+
		"\u0005\u0085\u0000\u0000\u05f5\u05f7\u0005Q\u0000\u0000\u05f6\u05f8\u0003"+
		"t:\u0000\u05f7\u05f6\u0001\u0000\u0000\u0000\u05f7\u05f8\u0001\u0000\u0000"+
		"\u0000\u05f8\u05f9\u0001\u0000\u0000\u0000\u05f9\u05fe\u0005R\u0000\u0000"+
		"\u05fa\u05fb\u0005\u001c\u0000\u0000\u05fb\u05fc\u0005\u0085\u0000\u0000"+
		"\u05fc\u05fe\u0003v;\u0000\u05fd\u05f3\u0001\u0000\u0000\u0000\u05fd\u05fa"+
		"\u0001\u0000\u0000\u0000\u05fe\u00cd\u0001\u0000\u0000\u0000\u05ff\u0600"+
		"\u0006g\uffff\uffff\u0000\u0600\u0601\u0003\u00d0h\u0000\u0601\u0606\u0001"+
		"\u0000\u0000\u0000\u0602\u0603\n\u0001\u0000\u0000\u0603\u0605\u0003\u00d0"+
		"h\u0000\u0604\u0602\u0001\u0000\u0000\u0000\u0605\u0608\u0001\u0000\u0000"+
		"\u0000\u0606\u0604\u0001\u0000\u0000\u0000\u0606\u0607\u0001\u0000\u0000"+
		"\u0000\u0607\u00cf\u0001\u0000\u0000\u0000\u0608\u0606\u0001\u0000\u0000"+
		"\u0000\u0609\u060a\u0005O\u0000\u0000\u060a\u060b\u0005O\u0000\u0000\u060b"+
		"\u060c\u0003\u00d4j\u0000\u060c\u060d\u0005P\u0000\u0000\u060d\u060e\u0005"+
		"P\u0000\u0000\u060e\u0611\u0001\u0000\u0000\u0000\u060f\u0611\u0003\u00d2"+
		"i\u0000\u0610\u0609\u0001\u0000\u0000\u0000\u0610\u060f\u0001\u0000\u0000"+
		"\u0000\u0611\u00d1\u0001\u0000\u0000\u0000\u0612\u0613\u0005\u0002\u0000"+
		"\u0000\u0613\u0614\u0005M\u0000\u0000\u0614\u0616\u0003\u00fc~\u0000\u0615"+
		"\u0617\u0005{\u0000\u0000\u0616\u0615\u0001\u0000\u0000\u0000\u0616\u0617"+
		"\u0001\u0000\u0000\u0000\u0617\u0618\u0001\u0000\u0000\u0000\u0618\u0619"+
		"\u0005N\u0000\u0000\u0619\u0623\u0001\u0000\u0000\u0000\u061a\u061b\u0005"+
		"\u0002\u0000\u0000\u061b\u061c\u0005M\u0000\u0000\u061c\u061e\u0003X,"+
		"\u0000\u061d\u061f\u0005{\u0000\u0000\u061e\u061d\u0001\u0000\u0000\u0000"+
		"\u061e\u061f\u0001\u0000\u0000\u0000\u061f\u0620\u0001\u0000\u0000\u0000"+
		"\u0620\u0621\u0005N\u0000\u0000\u0621\u0623\u0001\u0000\u0000\u0000\u0622"+
		"\u0612\u0001\u0000\u0000\u0000\u0622\u061a\u0001\u0000\u0000\u0000\u0623"+
		"\u00d3\u0001\u0000\u0000\u0000\u0624\u0626\u0006j\uffff\uffff\u0000\u0625"+
		"\u0627\u0003\u00d6k\u0000\u0626\u0625\u0001\u0000\u0000\u0000\u0626\u0627"+
		"\u0001\u0000\u0000\u0000\u0627\u062c\u0001\u0000\u0000\u0000\u0628\u0629"+
		"\u0003\u00d6k\u0000\u0629\u062a\u0005{\u0000\u0000\u062a\u062c\u0001\u0000"+
		"\u0000\u0000\u062b\u0624\u0001\u0000\u0000\u0000\u062b\u0628\u0001\u0000"+
		"\u0000\u0000\u062c\u0639\u0001\u0000\u0000\u0000\u062d\u062e\n\u0003\u0000"+
		"\u0000\u062e\u0630\u0005r\u0000\u0000\u062f\u0631\u0003\u00d6k\u0000\u0630"+
		"\u062f\u0001\u0000\u0000\u0000\u0630\u0631\u0001\u0000\u0000\u0000\u0631"+
		"\u0638\u0001\u0000\u0000\u0000\u0632\u0633\n\u0001\u0000\u0000\u0633\u0634"+
		"\u0005r\u0000\u0000\u0634\u0635\u0003\u00d6k\u0000\u0635\u0636\u0005{"+
		"\u0000\u0000\u0636\u0638\u0001\u0000\u0000\u0000\u0637\u062d\u0001\u0000"+
		"\u0000\u0000\u0637\u0632\u0001\u0000\u0000\u0000\u0638\u063b\u0001\u0000"+
		"\u0000\u0000\u0639\u0637\u0001\u0000\u0000\u0000\u0639\u063a\u0001\u0000"+
		"\u0000\u0000\u063a\u00d5\u0001\u0000\u0000\u0000\u063b\u0639\u0001\u0000"+
		"\u0000\u0000\u063c\u063e\u0003\u00d8l\u0000\u063d\u063f\u0003\u00deo\u0000"+
		"\u063e\u063d\u0001\u0000\u0000\u0000\u063e\u063f\u0001\u0000\u0000\u0000"+
		"\u063f\u00d7\u0001\u0000\u0000\u0000\u0640\u0643\u0005|\u0000\u0000\u0641"+
		"\u0643\u0003\u00dam\u0000\u0642\u0640\u0001\u0000\u0000\u0000\u0642\u0641"+
		"\u0001\u0000\u0000\u0000\u0643\u00d9\u0001\u0000\u0000\u0000\u0644\u0645"+
		"\u0003\u00dcn\u0000\u0645\u0646\u0005w\u0000\u0000\u0646\u0647\u0005|"+
		"\u0000\u0000\u0647\u00db\u0001\u0000\u0000\u0000\u0648\u0649\u0005|\u0000"+
		"\u0000\u0649\u00dd\u0001\u0000\u0000\u0000\u064a\u064b\u0005M\u0000\u0000"+
		"\u064b\u064c\u0003\u00e0p\u0000\u064c\u064d\u0005N\u0000\u0000\u064d\u00df"+
		"\u0001\u0000\u0000\u0000\u064e\u0650\u0006p\uffff\uffff\u0000\u064f\u0651"+
		"\u0003\u00e2q\u0000\u0650\u064f\u0001\u0000\u0000\u0000\u0650\u0651\u0001"+
		"\u0000\u0000\u0000\u0651\u0656\u0001\u0000\u0000\u0000\u0652\u0653\n\u0001"+
		"\u0000\u0000\u0653\u0655\u0003\u00e2q\u0000\u0654\u0652\u0001\u0000\u0000"+
		"\u0000\u0655\u0658\u0001\u0000\u0000\u0000\u0656\u0654\u0001\u0000\u0000"+
		"\u0000\u0656\u0657\u0001\u0000\u0000\u0000\u0657\u00e1\u0001\u0000\u0000"+
		"\u0000\u0658\u0656\u0001\u0000\u0000\u0000\u0659\u065a\u0005M\u0000\u0000"+
		"\u065a\u065b\u0003\u00e0p\u0000\u065b\u065c\u0005N\u0000\u0000\u065c\u0666"+
		"\u0001\u0000\u0000\u0000\u065d\u065e\u0005O\u0000\u0000\u065e\u065f\u0003"+
		"\u00e0p\u0000\u065f\u0660\u0005P\u0000\u0000\u0660\u0666\u0001\u0000\u0000"+
		"\u0000\u0661\u0662\u0005Q\u0000\u0000\u0662\u0663\u0003\u00e0p\u0000\u0663"+
		"\u0664\u0005R\u0000\u0000\u0664\u0666\u0001\u0000\u0000\u0000\u0665\u0659"+
		"\u0001\u0000\u0000\u0000\u0665\u065d\u0001\u0000\u0000\u0000\u0665\u0661"+
		"\u0001\u0000\u0000\u0000\u0666\u00e3\u0001\u0000\u0000\u0000\u0667\u0668"+
		"\u0006r\uffff\uffff\u0000\u0668\u0669\u0003\u00e6s\u0000\u0669\u066f\u0001"+
		"\u0000\u0000\u0000\u066a\u066b\n\u0001\u0000\u0000\u066b\u066c\u0005r"+
		"\u0000\u0000\u066c\u066e\u0003\u00e6s\u0000\u066d\u066a\u0001\u0000\u0000"+
		"\u0000\u066e\u0671\u0001\u0000\u0000\u0000\u066f\u066d\u0001\u0000\u0000"+
		"\u0000\u066f\u0670\u0001\u0000\u0000\u0000\u0670\u00e5\u0001\u0000\u0000"+
		"\u0000\u0671\u066f\u0001\u0000\u0000\u0000\u0672\u0674\u0003\u00e8t\u0000"+
		"\u0673\u0675\u0003\u0112\u0089\u0000\u0674\u0673\u0001\u0000\u0000\u0000"+
		"\u0674\u0675\u0001\u0000\u0000\u0000\u0675\u00e7\u0001\u0000\u0000\u0000"+
		"\u0676\u067c\u0003\u00eau\u0000\u0677\u0678\u0003\u00ecv\u0000\u0678\u0679"+
		"\u0003\u00eew\u0000\u0679\u067a\u0003\u00f0x\u0000\u067a\u067c\u0001\u0000"+
		"\u0000\u0000\u067b\u0676\u0001\u0000\u0000\u0000\u067b\u0677\u0001\u0000"+
		"\u0000\u0000\u067c\u00e9\u0001\u0000\u0000\u0000\u067d\u0682\u0003\u00ec"+
		"v\u0000\u067e\u067f\u0003\u00f2y\u0000\u067f\u0680\u0003\u00eau\u0000"+
		"\u0680\u0682\u0001\u0000\u0000\u0000\u0681\u067d\u0001\u0000\u0000\u0000"+
		"\u0681\u067e\u0001\u0000\u0000\u0000\u0682\u00eb\u0001\u0000\u0000\u0000"+
		"\u0683\u0684\u0006v\uffff\uffff\u0000\u0684\u0686\u0003\u00fa}\u0000\u0685"+
		"\u0687\u0003\u00ceg\u0000\u0686\u0685\u0001\u0000\u0000\u0000\u0686\u0687"+
		"\u0001\u0000\u0000\u0000\u0687\u068d\u0001\u0000\u0000\u0000\u0688\u0689"+
		"\u0005M\u0000\u0000\u0689\u068a\u0003\u00eau\u0000\u068a\u068b\u0005N"+
		"\u0000\u0000\u068b\u068d\u0001\u0000\u0000\u0000\u068c\u0683\u0001\u0000"+
		"\u0000\u0000\u068c\u0688\u0001\u0000\u0000\u0000\u068d\u069b\u0001\u0000"+
		"\u0000\u0000\u068e\u068f\n\u0003\u0000\u0000\u068f\u069a\u0003\u00eew"+
		"\u0000\u0690\u0691\n\u0002\u0000\u0000\u0691\u0693\u0005O\u0000\u0000"+
		"\u0692\u0694\u0003X,\u0000\u0693\u0692\u0001\u0000\u0000\u0000\u0693\u0694"+
		"\u0001\u0000\u0000\u0000\u0694\u0695\u0001\u0000\u0000\u0000\u0695\u0697"+
		"\u0005P\u0000\u0000\u0696\u0698\u0003\u00ceg\u0000\u0697\u0696\u0001\u0000"+
		"\u0000\u0000\u0697\u0698\u0001\u0000\u0000\u0000\u0698\u069a\u0001\u0000"+
		"\u0000\u0000\u0699\u068e\u0001\u0000\u0000\u0000\u0699\u0690\u0001\u0000"+
		"\u0000\u0000\u069a\u069d\u0001\u0000\u0000\u0000\u069b\u0699\u0001\u0000"+
		"\u0000\u0000\u069b\u069c\u0001\u0000\u0000\u0000\u069c\u00ed\u0001\u0000"+
		"\u0000\u0000\u069d\u069b\u0001\u0000\u0000\u0000\u069e\u069f\u0005M\u0000"+
		"\u0000\u069f\u06a0\u0003\u0108\u0084\u0000\u06a0\u06a2\u0005N\u0000\u0000"+
		"\u06a1\u06a3\u0003\u00f4z\u0000\u06a2\u06a1\u0001\u0000\u0000\u0000\u06a2"+
		"\u06a3\u0001\u0000\u0000\u0000\u06a3\u06a5\u0001\u0000\u0000\u0000\u06a4"+
		"\u06a6\u0003\u00f8|\u0000\u06a5\u06a4\u0001\u0000\u0000\u0000\u06a5\u06a6"+
		"\u0001\u0000\u0000\u0000\u06a6\u06a8\u0001\u0000\u0000\u0000\u06a7\u06a9"+
		"\u0003\u0178\u00bc\u0000\u06a8\u06a7\u0001\u0000\u0000\u0000\u06a8\u06a9"+
		"\u0001\u0000\u0000\u0000\u06a9\u06ab\u0001\u0000\u0000\u0000\u06aa\u06ac"+
		"\u0003\u00ceg\u0000\u06ab\u06aa\u0001\u0000\u0000\u0000\u06ab\u06ac\u0001"+
		"\u0000\u0000\u0000\u06ac\u00ef\u0001\u0000\u0000\u0000\u06ad\u06ae\u0005"+
		"t\u0000\u0000\u06ae\u06b0\u0003\u0094J\u0000\u06af\u06b1\u0003\u00fe\u007f"+
		"\u0000\u06b0\u06af\u0001\u0000\u0000\u0000\u06b0\u06b1\u0001\u0000\u0000"+
		"\u0000\u06b1\u00f1\u0001\u0000\u0000\u0000\u06b2\u06b4\u0005U\u0000\u0000"+
		"\u06b3\u06b5\u0003\u00ceg\u0000\u06b4\u06b3\u0001\u0000\u0000\u0000\u06b4"+
		"\u06b5\u0001\u0000\u0000\u0000\u06b5\u06b7\u0001\u0000\u0000\u0000\u06b6"+
		"\u06b8\u0003\u00f4z\u0000\u06b7\u06b6\u0001\u0000\u0000\u0000\u06b7\u06b8"+
		"\u0001\u0000\u0000\u0000\u06b8\u06ca\u0001\u0000\u0000\u0000\u06b9\u06bb"+
		"\u0005Y\u0000\u0000\u06ba\u06bc\u0003\u00ceg\u0000\u06bb\u06ba\u0001\u0000"+
		"\u0000\u0000\u06bb\u06bc\u0001\u0000\u0000\u0000\u06bc\u06ca\u0001\u0000"+
		"\u0000\u0000\u06bd\u06bf\u0005n\u0000\u0000\u06be\u06c0\u0003\u00ceg\u0000"+
		"\u06bf\u06be\u0001\u0000\u0000\u0000\u06bf\u06c0\u0001\u0000\u0000\u0000"+
		"\u06c0\u06ca\u0001\u0000\u0000\u0000\u06c1\u06c2\u0003\n\u0005\u0000\u06c2"+
		"\u06c4\u0005U\u0000\u0000\u06c3\u06c5\u0003\u00ceg\u0000\u06c4\u06c3\u0001"+
		"\u0000\u0000\u0000\u06c4\u06c5\u0001\u0000\u0000\u0000\u06c5\u06c7\u0001"+
		"\u0000\u0000\u0000\u06c6\u06c8\u0003\u00f4z\u0000\u06c7\u06c6\u0001\u0000"+
		"\u0000\u0000\u06c7\u06c8\u0001\u0000\u0000\u0000\u06c8\u06ca\u0001\u0000"+
		"\u0000\u0000\u06c9\u06b2\u0001\u0000\u0000\u0000\u06c9\u06b9\u0001\u0000"+
		"\u0000\u0000\u06c9\u06bd\u0001\u0000\u0000\u0000\u06c9\u06c1\u0001\u0000"+
		"\u0000\u0000\u06ca\u00f3\u0001\u0000\u0000\u0000\u06cb\u06cd\u0003\u00f6"+
		"{\u0000\u06cc\u06ce\u0003\u00f4z\u0000\u06cd\u06cc\u0001\u0000\u0000\u0000"+
		"\u06cd\u06ce\u0001\u0000\u0000\u0000\u06ce\u00f5\u0001\u0000\u0000\u0000"+
		"\u06cf\u06d0\u0007\u0004\u0000\u0000\u06d0\u00f7\u0001\u0000\u0000\u0000"+
		"\u06d1\u06d2\u0007\u0005\u0000\u0000\u06d2\u00f9\u0001\u0000\u0000\u0000"+
		"\u06d3\u06d5\u0005{\u0000\u0000\u06d4\u06d3\u0001\u0000\u0000\u0000\u06d4"+
		"\u06d5\u0001\u0000\u0000\u0000\u06d5\u06d6\u0001\u0000\u0000\u0000\u06d6"+
		"\u06d7\u0003\u0004\u0002\u0000\u06d7\u00fb\u0001\u0000\u0000\u0000\u06d8"+
		"\u06da\u0003\u0092I\u0000\u06d9\u06db\u0003\u00fe\u007f\u0000\u06da\u06d9"+
		"\u0001\u0000\u0000\u0000\u06da\u06db\u0001\u0000\u0000\u0000\u06db\u00fd"+
		"\u0001\u0000\u0000\u0000\u06dc\u06e5\u0003\u0100\u0080\u0000\u06dd\u06df"+
		"\u0003\u0102\u0081\u0000\u06de\u06dd\u0001\u0000\u0000\u0000\u06de\u06df"+
		"\u0001\u0000\u0000\u0000\u06df\u06e0\u0001\u0000\u0000\u0000\u06e0\u06e1"+
		"\u0003\u00eew\u0000\u06e1\u06e2\u0003\u00f0x\u0000\u06e2\u06e5\u0001\u0000"+
		"\u0000\u0000\u06e3\u06e5\u0003\u0104\u0082\u0000\u06e4\u06dc\u0001\u0000"+
		"\u0000\u0000\u06e4\u06de\u0001\u0000\u0000\u0000\u06e4\u06e3\u0001\u0000"+
		"\u0000\u0000\u06e5\u00ff\u0001\u0000\u0000\u0000\u06e6\u06ec\u0003\u0102"+
		"\u0081\u0000\u06e7\u06e9\u0003\u00f2y\u0000\u06e8\u06ea\u0003\u0100\u0080"+
		"\u0000\u06e9\u06e8\u0001\u0000\u0000\u0000\u06e9\u06ea\u0001\u0000\u0000"+
		"\u0000\u06ea\u06ec\u0001\u0000\u0000\u0000\u06eb\u06e6\u0001\u0000\u0000"+
		"\u0000\u06eb\u06e7\u0001\u0000\u0000\u0000\u06ec\u0101\u0001\u0000\u0000"+
		"\u0000\u06ed\u06ee\u0006\u0081\uffff\uffff\u0000\u06ee\u06fc\u0003\u00ee"+
		"w\u0000\u06ef\u06f1\u0005O\u0000\u0000\u06f0\u06f2\u0003X,\u0000\u06f1"+
		"\u06f0\u0001\u0000\u0000\u0000\u06f1\u06f2\u0001\u0000\u0000\u0000\u06f2"+
		"\u06f3\u0001\u0000\u0000\u0000\u06f3\u06f5\u0005P\u0000\u0000\u06f4\u06f6"+
		"\u0003\u00ceg\u0000\u06f5\u06f4\u0001\u0000\u0000\u0000\u06f5\u06f6\u0001"+
		"\u0000\u0000\u0000\u06f6\u06fc\u0001\u0000\u0000\u0000\u06f7\u06f8\u0005"+
		"M\u0000\u0000\u06f8\u06f9\u0003\u0100\u0080\u0000\u06f9\u06fa\u0005N\u0000"+
		"\u0000\u06fa\u06fc\u0001\u0000\u0000\u0000\u06fb\u06ed\u0001\u0000\u0000"+
		"\u0000\u06fb\u06ef\u0001\u0000\u0000\u0000\u06fb\u06f7\u0001\u0000\u0000"+
		"\u0000\u06fc\u070a\u0001\u0000\u0000\u0000\u06fd\u06fe\n\u0005\u0000\u0000"+
		"\u06fe\u0709\u0003\u00eew\u0000\u06ff\u0700\n\u0003\u0000\u0000\u0700"+
		"\u0702\u0005O\u0000\u0000\u0701\u0703\u0003X,\u0000\u0702\u0701\u0001"+
		"\u0000\u0000\u0000\u0702\u0703\u0001\u0000\u0000\u0000\u0703\u0704\u0001"+
		"\u0000\u0000\u0000\u0704\u0706\u0005P\u0000\u0000\u0705\u0707\u0003\u00ce"+
		"g\u0000\u0706\u0705\u0001\u0000\u0000\u0000\u0706\u0707\u0001\u0000\u0000"+
		"\u0000\u0707\u0709\u0001\u0000\u0000\u0000\u0708\u06fd\u0001\u0000\u0000"+
		"\u0000\u0708\u06ff\u0001\u0000\u0000\u0000\u0709\u070c\u0001\u0000\u0000"+
		"\u0000\u070a\u0708\u0001\u0000\u0000\u0000\u070a\u070b\u0001\u0000\u0000"+
		"\u0000\u070b\u0103\u0001\u0000\u0000\u0000\u070c\u070a\u0001\u0000\u0000"+
		"\u0000\u070d\u0712\u0003\u0106\u0083\u0000\u070e\u070f\u0003\u00f2y\u0000"+
		"\u070f\u0710\u0003\u0104\u0082\u0000\u0710\u0712\u0001\u0000\u0000\u0000"+
		"\u0711\u070d\u0001\u0000\u0000\u0000\u0711\u070e\u0001\u0000\u0000\u0000"+
		"\u0712\u0105\u0001\u0000\u0000\u0000\u0713\u0714\u0006\u0083\uffff\uffff"+
		"\u0000\u0714\u0715\u0005{\u0000\u0000\u0715\u0723\u0001\u0000\u0000\u0000"+
		"\u0716\u0717\n\u0003\u0000\u0000\u0717\u0722\u0003\u00eew\u0000\u0718"+
		"\u0719\n\u0002\u0000\u0000\u0719\u071b\u0005O\u0000\u0000\u071a\u071c"+
		"\u0003X,\u0000\u071b\u071a\u0001\u0000\u0000\u0000\u071b\u071c\u0001\u0000"+
		"\u0000\u0000\u071c\u071d\u0001\u0000\u0000\u0000\u071d\u071f\u0005P\u0000"+
		"\u0000\u071e\u0720\u0003\u00ceg\u0000\u071f\u071e\u0001\u0000\u0000\u0000"+
		"\u071f\u0720\u0001\u0000\u0000\u0000\u0720\u0722\u0001\u0000\u0000\u0000"+
		"\u0721\u0716\u0001\u0000\u0000\u0000\u0721\u0718\u0001\u0000\u0000\u0000"+
		"\u0722\u0725\u0001\u0000\u0000\u0000\u0723\u0721\u0001\u0000\u0000\u0000"+
		"\u0723\u0724\u0001\u0000\u0000\u0000\u0724\u0107\u0001\u0000\u0000\u0000"+
		"\u0725\u0723\u0001\u0000\u0000\u0000\u0726\u0728\u0003\u010a\u0085\u0000"+
		"\u0727\u0726\u0001\u0000\u0000\u0000\u0727\u0728\u0001\u0000\u0000\u0000"+
		"\u0728\u072a\u0001\u0000\u0000\u0000\u0729\u072b\u0005{\u0000\u0000\u072a"+
		"\u0729\u0001\u0000\u0000\u0000\u072a\u072b\u0001\u0000\u0000\u0000\u072b"+
		"\u0731\u0001\u0000\u0000\u0000\u072c\u072d\u0003\u010a\u0085\u0000\u072d"+
		"\u072e\u0005r\u0000\u0000\u072e\u072f\u0005{\u0000\u0000\u072f\u0731\u0001"+
		"\u0000\u0000\u0000\u0730\u0727\u0001\u0000\u0000\u0000\u0730\u072c\u0001"+
		"\u0000\u0000\u0000\u0731\u0109\u0001\u0000\u0000\u0000\u0732\u0733\u0006"+
		"\u0085\uffff\uffff\u0000\u0733\u0734\u0003\u010c\u0086\u0000\u0734\u073a"+
		"\u0001\u0000\u0000\u0000\u0735\u0736\n\u0001\u0000\u0000\u0736\u0737\u0005"+
		"r\u0000\u0000\u0737\u0739\u0003\u010c\u0086\u0000\u0738\u0735\u0001\u0000"+
		"\u0000\u0000\u0739\u073c\u0001\u0000\u0000\u0000\u073a\u0738\u0001\u0000"+
		"\u0000\u0000\u073a\u073b\u0001\u0000\u0000\u0000\u073b\u010b\u0001\u0000"+
		"\u0000\u0000\u073c\u073a\u0001\u0000\u0000\u0000\u073d\u073f\u0003\u00ce"+
		"g\u0000\u073e\u073d\u0001\u0000\u0000\u0000\u073e\u073f\u0001\u0000\u0000"+
		"\u0000\u073f\u0740\u0001\u0000\u0000\u0000\u0740\u0741\u0003\u0086C\u0000"+
		"\u0741\u0742\u0003\u00e8t\u0000\u0742\u075d\u0001\u0000\u0000\u0000\u0743"+
		"\u0745\u0003\u00ceg\u0000\u0744\u0743\u0001\u0000\u0000\u0000\u0744\u0745"+
		"\u0001\u0000\u0000\u0000\u0745\u0746\u0001\u0000\u0000\u0000\u0746\u0747"+
		"\u0003\u0086C\u0000\u0747\u0748\u0003\u00e8t\u0000\u0748\u0749\u0005]"+
		"\u0000\u0000\u0749\u074a\u0003\u0116\u008b\u0000\u074a\u075d\u0001\u0000"+
		"\u0000\u0000\u074b\u074d\u0003\u00ceg\u0000\u074c\u074b\u0001\u0000\u0000"+
		"\u0000\u074c\u074d\u0001\u0000\u0000\u0000\u074d\u074e\u0001\u0000\u0000"+
		"\u0000\u074e\u0750\u0003\u0086C\u0000\u074f\u0751\u0003\u00fe\u007f\u0000"+
		"\u0750\u074f\u0001\u0000\u0000\u0000\u0750\u0751\u0001\u0000\u0000\u0000"+
		"\u0751\u075d\u0001\u0000\u0000\u0000\u0752\u0754\u0003\u00ceg\u0000\u0753"+
		"\u0752\u0001\u0000\u0000\u0000\u0753\u0754\u0001\u0000\u0000\u0000\u0754"+
		"\u0755\u0001\u0000\u0000\u0000\u0755\u0757\u0003\u0086C\u0000\u0756\u0758"+
		"\u0003\u00fe\u007f\u0000\u0757\u0756\u0001\u0000\u0000\u0000\u0757\u0758"+
		"\u0001\u0000\u0000\u0000\u0758\u0759\u0001\u0000\u0000\u0000\u0759\u075a"+
		"\u0005]\u0000\u0000\u075a\u075b\u0003\u0116\u008b\u0000\u075b\u075d\u0001"+
		"\u0000\u0000\u0000\u075c\u073e\u0001\u0000\u0000\u0000\u075c\u0744\u0001"+
		"\u0000\u0000\u0000\u075c\u074c\u0001\u0000\u0000\u0000\u075c\u0753\u0001"+
		"\u0000\u0000\u0000\u075d\u010d\u0001\u0000\u0000\u0000\u075e\u0760\u0003"+
		"\u00ceg\u0000\u075f\u075e\u0001\u0000\u0000\u0000\u075f\u0760\u0001\u0000"+
		"\u0000\u0000\u0760\u0762\u0001\u0000\u0000\u0000\u0761\u0763\u0003\u0086"+
		"C\u0000\u0762\u0761\u0001\u0000\u0000\u0000\u0762\u0763\u0001\u0000\u0000"+
		"\u0000\u0763\u0764\u0001\u0000\u0000\u0000\u0764\u0766\u0003\u00e8t\u0000"+
		"\u0765\u0767\u0003\u0130\u0098\u0000\u0766\u0765\u0001\u0000\u0000\u0000"+
		"\u0766\u0767\u0001\u0000\u0000\u0000\u0767\u0768\u0001\u0000\u0000\u0000"+
		"\u0768\u0769\u0003\u0110\u0088\u0000\u0769\u010f\u0001\u0000\u0000\u0000"+
		"\u076a\u076c\u0003\u0148\u00a4\u0000\u076b\u076a\u0001\u0000\u0000\u0000"+
		"\u076b\u076c\u0001\u0000\u0000\u0000\u076c\u076d\u0001\u0000\u0000\u0000"+
		"\u076d\u0776\u0003`0\u0000\u076e\u0776\u0003\u016e\u00b7\u0000\u076f\u0770"+
		"\u0005]\u0000\u0000\u0770\u0771\u0005\u0013\u0000\u0000\u0771\u0776\u0005"+
		"x\u0000\u0000\u0772\u0773\u0005]\u0000\u0000\u0773\u0774\u0005\u0014\u0000"+
		"\u0000\u0774\u0776\u0005x\u0000\u0000\u0775\u076b\u0001\u0000\u0000\u0000"+
		"\u0775\u076e\u0001\u0000\u0000\u0000\u0775\u076f\u0001\u0000\u0000\u0000"+
		"\u0775\u0772\u0001\u0000\u0000\u0000\u0776\u0111\u0001\u0000\u0000\u0000"+
		"\u0777\u077d\u0003\u0114\u008a\u0000\u0778\u0779\u0005M\u0000\u0000\u0779"+
		"\u077a\u0003 \u0010\u0000\u077a\u077b\u0005N\u0000\u0000\u077b\u077d\u0001"+
		"\u0000\u0000\u0000\u077c\u0777\u0001\u0000\u0000\u0000\u077c\u0778\u0001"+
		"\u0000\u0000\u0000\u077d\u0113\u0001\u0000\u0000\u0000\u077e\u077f\u0005"+
		"]\u0000\u0000\u077f\u0782\u0003\u0116\u008b\u0000\u0780\u0782\u0003\u011a"+
		"\u008d\u0000\u0781\u077e\u0001\u0000\u0000\u0000\u0781\u0780\u0001\u0000"+
		"\u0000\u0000\u0782\u0115\u0001\u0000\u0000\u0000\u0783\u0786\u0003R)\u0000"+
		"\u0784\u0786\u0003\u011a\u008d\u0000\u0785\u0783\u0001\u0000\u0000\u0000"+
		"\u0785\u0784\u0001\u0000\u0000\u0000\u0786\u0117\u0001\u0000\u0000\u0000"+
		"\u0787\u0788\u0006\u008c\uffff\uffff\u0000\u0788\u078a\u0003\u0116\u008b"+
		"\u0000\u0789\u078b\u0005{\u0000\u0000\u078a\u0789\u0001\u0000\u0000\u0000"+
		"\u078a\u078b\u0001\u0000\u0000\u0000\u078b\u0794\u0001\u0000\u0000\u0000"+
		"\u078c\u078d\n\u0001\u0000\u0000\u078d\u078e\u0005r\u0000\u0000\u078e"+
		"\u0790\u0003\u0116\u008b\u0000\u078f\u0791\u0005{\u0000\u0000\u0790\u078f"+
		"\u0001\u0000\u0000\u0000\u0790\u0791\u0001\u0000\u0000\u0000\u0791\u0793"+
		"\u0001\u0000\u0000\u0000\u0792\u078c\u0001\u0000\u0000\u0000\u0793\u0796"+
		"\u0001\u0000\u0000\u0000\u0794\u0792\u0001\u0000\u0000\u0000\u0794\u0795"+
		"\u0001\u0000\u0000\u0000\u0795\u0119\u0001\u0000\u0000\u0000\u0796\u0794"+
		"\u0001\u0000\u0000\u0000\u0797\u0798\u0005Q\u0000\u0000\u0798\u079a\u0003"+
		"\u0118\u008c\u0000\u0799\u079b\u0005r\u0000\u0000\u079a\u0799\u0001\u0000"+
		"\u0000\u0000\u079a\u079b\u0001\u0000\u0000\u0000\u079b\u079c\u0001\u0000"+
		"\u0000\u0000\u079c\u079d\u0005R\u0000\u0000\u079d\u07a1\u0001\u0000\u0000"+
		"\u0000\u079e\u079f\u0005Q\u0000\u0000\u079f\u07a1\u0005R\u0000\u0000\u07a0"+
		"\u0797\u0001\u0000\u0000\u0000\u07a0\u079e\u0001\u0000\u0000\u0000\u07a1"+
		"\u011b\u0001\u0000\u0000\u0000\u07a2\u07a5\u0005|\u0000\u0000\u07a3\u07a5"+
		"\u0003\u015c\u00ae\u0000\u07a4\u07a2\u0001\u0000\u0000\u0000\u07a4\u07a3"+
		"\u0001\u0000\u0000\u0000\u07a5\u011d\u0001\u0000\u0000\u0000\u07a6\u07a7"+
		"\u0003\u0120\u0090\u0000\u07a7\u07a9\u0005Q\u0000\u0000\u07a8\u07aa\u0003"+
		"\u0128\u0094\u0000\u07a9\u07a8\u0001\u0000\u0000\u0000\u07a9\u07aa\u0001"+
		"\u0000\u0000\u0000\u07aa\u07ab\u0001\u0000\u0000\u0000\u07ab\u07ac\u0005"+
		"R\u0000\u0000\u07ac\u011f\u0001\u0000\u0000\u0000\u07ad\u07af\u0003\u0126"+
		"\u0093\u0000\u07ae\u07b0\u0003\u00ceg\u0000\u07af\u07ae\u0001\u0000\u0000"+
		"\u0000\u07af\u07b0\u0001\u0000\u0000\u0000\u07b0\u07b1\u0001\u0000\u0000"+
		"\u0000\u07b1\u07b3\u0003\u0122\u0091\u0000\u07b2\u07b4\u0003\u0124\u0092"+
		"\u0000\u07b3\u07b2\u0001\u0000\u0000\u0000\u07b3\u07b4\u0001\u0000\u0000"+
		"\u0000\u07b4\u07b6\u0001\u0000\u0000\u0000\u07b5\u07b7\u0003\u0136\u009b"+
		"\u0000\u07b6\u07b5\u0001\u0000\u0000\u0000\u07b6\u07b7\u0001\u0000\u0000"+
		"\u0000\u07b7\u07c0\u0001\u0000\u0000\u0000\u07b8\u07ba\u0003\u0126\u0093"+
		"\u0000\u07b9\u07bb\u0003\u00ceg\u0000\u07ba\u07b9\u0001\u0000\u0000\u0000"+
		"\u07ba\u07bb\u0001\u0000\u0000\u0000\u07bb\u07bd\u0001\u0000\u0000\u0000"+
		"\u07bc\u07be\u0003\u0136\u009b\u0000\u07bd\u07bc\u0001\u0000\u0000\u0000"+
		"\u07bd\u07be\u0001\u0000\u0000\u0000\u07be\u07c0\u0001\u0000\u0000\u0000"+
		"\u07bf\u07ad\u0001\u0000\u0000\u0000\u07bf\u07b8\u0001\u0000\u0000\u0000"+
		"\u07c0\u0121\u0001\u0000\u0000\u0000\u07c1\u07c3\u0003\n\u0005\u0000\u07c2"+
		"\u07c1\u0001\u0000\u0000\u0000\u07c2\u07c3\u0001\u0000\u0000\u0000\u07c3"+
		"\u07c4\u0001\u0000\u0000\u0000\u07c4\u07c5\u0003\u011c\u008e\u0000\u07c5"+
		"\u0123\u0001\u0000\u0000\u0000\u07c6\u07c7\u0005\u001e\u0000\u0000\u07c7"+
		"\u0125\u0001\u0000\u0000\u0000\u07c8\u07c9\u0007\u0006\u0000\u0000\u07c9"+
		"\u0127\u0001\u0000\u0000\u0000\u07ca\u07cc\u0003\u012a\u0095\u0000\u07cb"+
		"\u07cd\u0003\u0128\u0094\u0000\u07cc\u07cb\u0001\u0000\u0000\u0000\u07cc"+
		"\u07cd\u0001\u0000\u0000\u0000\u07cd\u07d4\u0001\u0000\u0000\u0000\u07ce"+
		"\u07cf\u0003\u0140\u00a0\u0000\u07cf\u07d1\u0005v\u0000\u0000\u07d0\u07d2"+
		"\u0003\u0128\u0094\u0000\u07d1\u07d0\u0001\u0000\u0000\u0000\u07d1\u07d2"+
		"\u0001\u0000\u0000\u0000\u07d2\u07d4\u0001\u0000\u0000\u0000\u07d3\u07ca"+
		"\u0001\u0000\u0000\u0000\u07d3\u07ce\u0001\u0000\u0000\u0000\u07d4\u0129"+
		"\u0001\u0000\u0000\u0000\u07d5\u07d7\u0003\u00ceg\u0000\u07d6\u07d5\u0001"+
		"\u0000\u0000\u0000\u07d6\u07d7\u0001\u0000\u0000\u0000\u07d7\u07d9\u0001"+
		"\u0000\u0000\u0000\u07d8\u07da\u0003\u0086C\u0000\u07d9\u07d8\u0001\u0000"+
		"\u0000\u0000\u07d9\u07da\u0001\u0000\u0000\u0000\u07da\u07dc\u0001\u0000"+
		"\u0000\u0000\u07db\u07dd\u0003\u012c\u0096\u0000\u07dc\u07db\u0001\u0000"+
		"\u0000\u0000\u07dc\u07dd\u0001\u0000\u0000\u0000\u07dd\u07de\u0001\u0000"+
		"\u0000\u0000\u07de\u07e6\u0005x\u0000\u0000\u07df\u07e6\u0003\u010e\u0087"+
		"\u0000\u07e0\u07e6\u0003\u00c6c\u0000\u07e1\u07e6\u0003~?\u0000\u07e2"+
		"\u07e6\u0003\u0154\u00aa\u0000\u07e3\u07e6\u0003z=\u0000\u07e4\u07e6\u0003"+
		"\u0080@\u0000\u07e5\u07d6\u0001\u0000\u0000\u0000\u07e5\u07df\u0001\u0000"+
		"\u0000\u0000\u07e5\u07e0\u0001\u0000\u0000\u0000\u07e5\u07e1\u0001\u0000"+
		"\u0000\u0000\u07e5\u07e2\u0001\u0000\u0000\u0000\u07e5\u07e3\u0001\u0000"+
		"\u0000\u0000\u07e5\u07e4\u0001\u0000\u0000\u0000\u07e6\u012b\u0001\u0000"+
		"\u0000\u0000\u07e7\u07e8\u0006\u0096\uffff\uffff\u0000\u07e8\u07e9\u0003"+
		"\u012e\u0097\u0000\u07e9\u07ef\u0001\u0000\u0000\u0000\u07ea\u07eb\n\u0001"+
		"\u0000\u0000\u07eb\u07ec\u0005r\u0000\u0000\u07ec\u07ee\u0003\u012e\u0097"+
		"\u0000\u07ed\u07ea\u0001\u0000\u0000\u0000\u07ee\u07f1\u0001\u0000\u0000"+
		"\u0000\u07ef\u07ed\u0001\u0000\u0000\u0000\u07ef\u07f0\u0001\u0000\u0000"+
		"\u0000\u07f0\u012d\u0001\u0000\u0000\u0000\u07f1\u07ef\u0001\u0000\u0000"+
		"\u0000\u07f2\u07f4\u0003\u00e8t\u0000\u07f3\u07f5\u0003\u0130\u0098\u0000"+
		"\u07f4\u07f3\u0001\u0000\u0000\u0000\u07f4\u07f5\u0001\u0000\u0000\u0000"+
		"\u07f5\u07f7\u0001\u0000\u0000\u0000\u07f6\u07f8\u0003\u0134\u009a\u0000"+
		"\u07f7\u07f6\u0001\u0000\u0000\u0000\u07f7\u07f8\u0001\u0000\u0000\u0000"+
		"\u07f8\u0806\u0001\u0000\u0000\u0000\u07f9\u07fb\u0003\u00e8t\u0000\u07fa"+
		"\u07fc\u0003\u0114\u008a\u0000\u07fb\u07fa\u0001\u0000\u0000\u0000\u07fb"+
		"\u07fc\u0001\u0000\u0000\u0000\u07fc\u0806\u0001\u0000\u0000\u0000\u07fd"+
		"\u07ff\u0005|\u0000\u0000\u07fe\u07fd\u0001\u0000\u0000\u0000\u07fe\u07ff"+
		"\u0001\u0000\u0000\u0000\u07ff\u0801\u0001\u0000\u0000\u0000\u0800\u0802"+
		"\u0003\u00ceg\u0000\u0801\u0800\u0001\u0000\u0000\u0000\u0801\u0802\u0001"+
		"\u0000\u0000\u0000\u0802\u0803\u0001\u0000\u0000\u0000\u0803\u0804\u0005"+
		"v\u0000\u0000\u0804\u0806\u0003X,\u0000\u0805\u07f2\u0001\u0000\u0000"+
		"\u0000\u0805\u07f9\u0001\u0000\u0000\u0000\u0805\u07fe\u0001\u0000\u0000"+
		"\u0000\u0806\u012f\u0001\u0000\u0000\u0000\u0807\u0808\u0006\u0098\uffff"+
		"\uffff\u0000\u0808\u0809\u0003\u0132\u0099\u0000\u0809\u080e\u0001\u0000"+
		"\u0000\u0000\u080a\u080b\n\u0001\u0000\u0000\u080b\u080d\u0003\u0132\u0099"+
		"\u0000\u080c\u080a\u0001\u0000\u0000\u0000\u080d\u0810\u0001\u0000\u0000"+
		"\u0000\u080e\u080c\u0001\u0000\u0000\u0000\u080e\u080f\u0001\u0000\u0000"+
		"\u0000\u080f\u0131\u0001\u0000\u0000\u0000\u0810\u080e\u0001\u0000\u0000"+
		"\u0000\u0811\u0812\u0007\u0007\u0000\u0000\u0812\u0133\u0001\u0000\u0000"+
		"\u0000\u0813\u0814\u0005]\u0000\u0000\u0814\u0815\u0005}\u0000\u0000\u0815"+
		"\u0816\u0006\u009a\uffff\uffff\u0000\u0816\u0135\u0001\u0000\u0000\u0000"+
		"\u0817\u0818\u0005v\u0000\u0000\u0818\u0819\u0003\u0138\u009c\u0000\u0819"+
		"\u0137\u0001\u0000\u0000\u0000\u081a\u081b\u0006\u009c\uffff\uffff\u0000"+
		"\u081b\u081d\u0003\u013a\u009d\u0000\u081c\u081e\u0005{\u0000\u0000\u081d"+
		"\u081c\u0001\u0000\u0000\u0000\u081d\u081e\u0001\u0000\u0000\u0000\u081e"+
		"\u0827\u0001\u0000\u0000\u0000\u081f\u0820\n\u0001\u0000\u0000\u0820\u0821"+
		"\u0005r\u0000\u0000\u0821\u0823\u0003\u013a\u009d\u0000\u0822\u0824\u0005"+
		"{\u0000\u0000\u0823\u0822\u0001\u0000\u0000\u0000\u0823\u0824\u0001\u0000"+
		"\u0000\u0000\u0824\u0826\u0001\u0000\u0000\u0000\u0825\u081f\u0001\u0000"+
		"\u0000\u0000\u0826\u0829\u0001\u0000\u0000\u0000\u0827\u0825\u0001\u0000"+
		"\u0000\u0000\u0827\u0828\u0001\u0000\u0000\u0000\u0828\u0139\u0001\u0000"+
		"\u0000\u0000\u0829\u0827\u0001\u0000\u0000\u0000\u082a\u082c\u0003\u00ce"+
		"g\u0000\u082b\u082a\u0001\u0000\u0000\u0000\u082b\u082c\u0001\u0000\u0000"+
		"\u0000\u082c\u082d\u0001\u0000\u0000\u0000\u082d\u0840\u0003\u013e\u009f"+
		"\u0000\u082e\u0830\u0003\u00ceg\u0000\u082f\u082e\u0001\u0000\u0000\u0000"+
		"\u082f\u0830\u0001\u0000\u0000\u0000\u0830\u0831\u0001\u0000\u0000\u0000"+
		"\u0831\u0833\u0005H\u0000\u0000\u0832\u0834\u0003\u0140\u00a0\u0000\u0833"+
		"\u0832\u0001\u0000\u0000\u0000\u0833\u0834\u0001\u0000\u0000\u0000\u0834"+
		"\u0835\u0001\u0000\u0000\u0000\u0835\u0840\u0003\u013e\u009f\u0000\u0836"+
		"\u0838\u0003\u00ceg\u0000\u0837\u0836\u0001\u0000\u0000\u0000\u0837\u0838"+
		"\u0001\u0000\u0000\u0000\u0838\u0839\u0001\u0000\u0000\u0000\u0839\u083b"+
		"\u0003\u0140\u00a0\u0000\u083a\u083c\u0005H\u0000\u0000\u083b\u083a\u0001"+
		"\u0000\u0000\u0000\u083b\u083c\u0001\u0000\u0000\u0000\u083c\u083d\u0001"+
		"\u0000\u0000\u0000\u083d\u083e\u0003\u013e\u009f\u0000\u083e\u0840\u0001"+
		"\u0000\u0000\u0000\u083f\u082b\u0001\u0000\u0000\u0000\u083f\u082f\u0001"+
		"\u0000\u0000\u0000\u083f\u0837\u0001\u0000\u0000\u0000\u0840\u013b\u0001"+
		"\u0000\u0000\u0000\u0841\u0843\u0003\n\u0005\u0000\u0842\u0841\u0001\u0000"+
		"\u0000\u0000\u0842\u0843\u0001\u0000\u0000\u0000\u0843\u0844\u0001\u0000"+
		"\u0000\u0000\u0844\u0847\u0003\u011c\u008e\u0000\u0845\u0847\u0003\u009a"+
		"M\u0000\u0846\u0842\u0001\u0000\u0000\u0000\u0846\u0845\u0001\u0000\u0000"+
		"\u0000\u0847\u013d\u0001\u0000\u0000\u0000\u0848\u0849\u0003\u013c\u009e"+
		"\u0000\u0849\u013f\u0001\u0000\u0000\u0000\u084a\u084b\u0007\b\u0000\u0000"+
		"\u084b\u0141\u0001\u0000\u0000\u0000\u084c\u084d\u0005,\u0000\u0000\u084d"+
		"\u084e\u0003\u0144\u00a2\u0000\u084e\u0143\u0001\u0000\u0000\u0000\u084f"+
		"\u0851\u0003\u0092I\u0000\u0850\u0852\u0003\u0146\u00a3\u0000\u0851\u0850"+
		"\u0001\u0000\u0000\u0000\u0851\u0852\u0001\u0000\u0000\u0000\u0852\u0145"+
		"\u0001\u0000\u0000\u0000\u0853\u0855\u0003\u00f2y\u0000\u0854\u0856\u0003"+
		"\u0146\u00a3\u0000\u0855\u0854\u0001\u0000\u0000\u0000\u0855\u0856\u0001"+
		"\u0000\u0000\u0000\u0856\u0147\u0001\u0000\u0000\u0000\u0857\u0858\u0005"+
		"v\u0000\u0000\u0858\u0859\u0003\u014a\u00a5\u0000\u0859\u0149\u0001\u0000"+
		"\u0000\u0000\u085a\u085c\u0003\u014c\u00a6\u0000\u085b\u085d\u0005{\u0000"+
		"\u0000\u085c\u085b\u0001\u0000\u0000\u0000\u085c\u085d\u0001\u0000\u0000"+
		"\u0000\u085d\u0866\u0001\u0000\u0000\u0000\u085e\u0860\u0003\u014c\u00a6"+
		"\u0000\u085f\u0861\u0005{\u0000\u0000\u0860\u085f\u0001\u0000\u0000\u0000"+
		"\u0860\u0861\u0001\u0000\u0000\u0000\u0861\u0862\u0001\u0000\u0000\u0000"+
		"\u0862\u0863\u0005r\u0000\u0000\u0863\u0864\u0003\u014a\u00a5\u0000\u0864"+
		"\u0866\u0001\u0000\u0000\u0000\u0865\u085a\u0001\u0000\u0000\u0000\u0865"+
		"\u085e\u0001\u0000\u0000\u0000\u0866\u014b\u0001\u0000\u0000\u0000\u0867"+
		"\u0868\u0003\u014e\u00a7\u0000\u0868\u086a\u0005M\u0000\u0000\u0869\u086b"+
		"\u0003 \u0010\u0000\u086a\u0869\u0001\u0000\u0000\u0000\u086a\u086b\u0001"+
		"\u0000\u0000\u0000\u086b\u086c\u0001\u0000\u0000\u0000\u086c\u086d\u0005"+
		"N\u0000\u0000\u086d\u0872\u0001\u0000\u0000\u0000\u086e\u086f\u0003\u014e"+
		"\u00a7\u0000\u086f\u0870\u0003\u011a\u008d\u0000\u0870\u0872\u0001\u0000"+
		"\u0000\u0000\u0871\u0867\u0001\u0000\u0000\u0000\u0871\u086e\u0001\u0000"+
		"\u0000\u0000\u0872\u014d\u0001\u0000\u0000\u0000\u0873\u0876\u0003\u013c"+
		"\u009e\u0000\u0874\u0876\u0005|\u0000\u0000\u0875\u0873\u0001\u0000\u0000"+
		"\u0000\u0875\u0874\u0001\u0000\u0000\u0000\u0876\u014f\u0001\u0000\u0000"+
		"\u0000\u0877\u0878\u0005,\u0000\u0000\u0878\u0879\u0003\u0184\u00c2\u0000"+
		"\u0879\u0151\u0001\u0000\u0000\u0000\u087a\u087b\u0005,\u0000\u0000\u087b"+
		"\u087c\u0005\u0085\u0000\u0000\u087c\u0880\u0005|\u0000\u0000\u087d\u087e"+
		"\u0005,\u0000\u0000\u087e\u0880\u0005\u0088\u0000\u0000\u087f\u087a\u0001"+
		"\u0000\u0000\u0000\u087f\u087d\u0001\u0000\u0000\u0000\u0880\u0153\u0001"+
		"\u0000\u0000\u0000\u0881\u0882\u0005<\u0000\u0000\u0882\u0883\u0005^\u0000"+
		"\u0000\u0883\u0884\u0003\u0156\u00ab\u0000\u0884\u0885\u0005_\u0000\u0000"+
		"\u0885\u0886\u0003v;\u0000\u0886\u0155\u0001\u0000\u0000\u0000\u0887\u0888"+
		"\u0006\u00ab\uffff\uffff\u0000\u0888\u0889\u0003\u0158\u00ac\u0000\u0889"+
		"\u088f\u0001\u0000\u0000\u0000\u088a\u088b\n\u0001\u0000\u0000\u088b\u088c"+
		"\u0005r\u0000\u0000\u088c\u088e\u0003\u0158\u00ac\u0000\u088d\u088a\u0001"+
		"\u0000\u0000\u0000\u088e\u0891\u0001\u0000\u0000\u0000\u088f\u088d\u0001"+
		"\u0000\u0000\u0000\u088f\u0890\u0001\u0000\u0000\u0000\u0890\u0157\u0001"+
		"\u0000\u0000\u0000\u0891\u088f\u0001\u0000\u0000\u0000\u0892\u0895\u0003"+
		"\u015a\u00ad\u0000\u0893\u0895\u0003\u010c\u0086\u0000\u0894\u0892\u0001"+
		"\u0000\u0000\u0000\u0894\u0893\u0001\u0000\u0000\u0000\u0895\u0159\u0001"+
		"\u0000\u0000\u0000\u0896\u0898\u0005\r\u0000\u0000\u0897\u0899\u0005{"+
		"\u0000\u0000\u0898\u0897\u0001\u0000\u0000\u0000\u0898\u0899\u0001\u0000"+
		"\u0000\u0000\u0899\u089b\u0001\u0000\u0000\u0000\u089a\u089c\u0005|\u0000"+
		"\u0000\u089b\u089a\u0001\u0000\u0000\u0000\u089b\u089c\u0001\u0000\u0000"+
		"\u0000\u089c\u08c7\u0001\u0000\u0000\u0000\u089d\u089f\u0005\r\u0000\u0000"+
		"\u089e\u08a0\u0005|\u0000\u0000\u089f\u089e\u0001\u0000\u0000\u0000\u089f"+
		"\u08a0\u0001\u0000\u0000\u0000\u08a0\u08a1\u0001\u0000\u0000\u0000\u08a1"+
		"\u08a2\u0005]\u0000\u0000\u08a2\u08c7\u0003\u00fc~\u0000\u08a3\u08a5\u0005"+
		"D\u0000\u0000\u08a4\u08a6\u0005{\u0000\u0000\u08a5\u08a4\u0001\u0000\u0000"+
		"\u0000\u08a5\u08a6\u0001\u0000\u0000\u0000\u08a6\u08a8\u0001\u0000\u0000"+
		"\u0000\u08a7\u08a9\u0005|\u0000\u0000\u08a8\u08a7\u0001\u0000\u0000\u0000"+
		"\u08a8\u08a9\u0001\u0000\u0000\u0000\u08a9\u08c7\u0001\u0000\u0000\u0000"+
		"\u08aa\u08ac\u0005D\u0000\u0000\u08ab\u08ad\u0005|\u0000\u0000\u08ac\u08ab"+
		"\u0001\u0000\u0000\u0000\u08ac\u08ad\u0001\u0000\u0000\u0000\u08ad\u08ae"+
		"\u0001\u0000\u0000\u0000\u08ae\u08af\u0005]\u0000\u0000\u08af\u08c7\u0003"+
		"\u00fc~\u0000\u08b0\u08b1\u0005<\u0000\u0000\u08b1\u08b2\u0005^\u0000"+
		"\u0000\u08b2\u08b3\u0003\u0156\u00ab\u0000\u08b3\u08b4\u0005_\u0000\u0000"+
		"\u08b4\u08b6\u0005\r\u0000\u0000\u08b5\u08b7\u0005{\u0000\u0000\u08b6"+
		"\u08b5\u0001\u0000\u0000\u0000\u08b6\u08b7\u0001\u0000\u0000\u0000\u08b7"+
		"\u08b9\u0001\u0000\u0000\u0000\u08b8\u08ba\u0005|\u0000\u0000\u08b9\u08b8"+
		"\u0001\u0000\u0000\u0000\u08b9\u08ba\u0001\u0000\u0000\u0000\u08ba\u08c7"+
		"\u0001\u0000\u0000\u0000\u08bb\u08bc\u0005<\u0000\u0000\u08bc\u08bd\u0005"+
		"^\u0000\u0000\u08bd\u08be\u0003\u0156\u00ab\u0000\u08be\u08bf\u0005_\u0000"+
		"\u0000\u08bf\u08c1\u0005\r\u0000\u0000\u08c0\u08c2\u0005|\u0000\u0000"+
		"\u08c1\u08c0\u0001\u0000\u0000\u0000\u08c1\u08c2\u0001\u0000\u0000\u0000"+
		"\u08c2\u08c3\u0001\u0000\u0000\u0000\u08c3\u08c4\u0005]\u0000\u0000\u08c4"+
		"\u08c5\u0003\u0004\u0002\u0000\u08c5\u08c7\u0001\u0000\u0000\u0000\u08c6"+
		"\u0896\u0001\u0000\u0000\u0000\u08c6\u089d\u0001\u0000\u0000\u0000\u08c6"+
		"\u08a3\u0001\u0000\u0000\u0000\u08c6\u08aa\u0001\u0000\u0000\u0000\u08c6"+
		"\u08b0\u0001\u0000\u0000\u0000\u08c6\u08bb\u0001\u0000\u0000\u0000\u08c7"+
		"\u015b\u0001\u0000\u0000\u0000\u08c8\u08c9\u0003\u0160\u00b0\u0000\u08c9"+
		"\u08cb\u0005^\u0000\u0000\u08ca\u08cc\u0003\u0162\u00b1\u0000\u08cb\u08ca"+
		"\u0001\u0000\u0000\u0000\u08cb\u08cc\u0001\u0000\u0000\u0000\u08cc\u08cd"+
		"\u0001\u0000\u0000\u0000\u08cd\u08ce\u0005_\u0000\u0000\u08ce\u015d\u0001"+
		"\u0000\u0000\u0000\u08cf\u08df\u0003\u015c\u00ae\u0000\u08d0\u08d1\u0003"+
		"\u0150\u00a8\u0000\u08d1\u08d3\u0005^\u0000\u0000\u08d2\u08d4\u0003\u0162"+
		"\u00b1\u0000\u08d3\u08d2\u0001\u0000\u0000\u0000\u08d3\u08d4\u0001\u0000"+
		"\u0000\u0000\u08d4\u08d5\u0001\u0000\u0000\u0000\u08d5\u08d6\u0005_\u0000"+
		"\u0000\u08d6\u08df\u0001\u0000\u0000\u0000\u08d7\u08d8\u0003\u0152\u00a9"+
		"\u0000\u08d8\u08da\u0005^\u0000\u0000\u08d9\u08db\u0003\u0162\u00b1\u0000"+
		"\u08da\u08d9\u0001\u0000\u0000\u0000\u08da\u08db\u0001\u0000\u0000\u0000"+
		"\u08db\u08dc\u0001\u0000\u0000\u0000\u08dc\u08dd\u0005_\u0000\u0000\u08dd"+
		"\u08df\u0001\u0000\u0000\u0000\u08de\u08cf\u0001\u0000\u0000\u0000\u08de"+
		"\u08d0\u0001\u0000\u0000\u0000\u08de\u08d7\u0001\u0000\u0000\u0000\u08df"+
		"\u015f\u0001\u0000\u0000\u0000\u08e0\u08e1\u0005|\u0000\u0000\u08e1\u0161"+
		"\u0001\u0000\u0000\u0000\u08e2\u08e3\u0006\u00b1\uffff\uffff\u0000\u08e3"+
		"\u08e5\u0003\u0164\u00b2\u0000\u08e4\u08e6\u0005{\u0000\u0000\u08e5\u08e4"+
		"\u0001\u0000\u0000\u0000\u08e5\u08e6\u0001\u0000\u0000\u0000\u08e6\u08ef"+
		"\u0001\u0000\u0000\u0000\u08e7\u08e8\n\u0001\u0000\u0000\u08e8\u08e9\u0005"+
		"r\u0000\u0000\u08e9\u08eb\u0003\u0164\u00b2\u0000\u08ea\u08ec\u0005{\u0000"+
		"\u0000\u08eb\u08ea\u0001\u0000\u0000\u0000\u08eb\u08ec\u0001\u0000\u0000"+
		"\u0000\u08ec\u08ee\u0001\u0000\u0000\u0000\u08ed\u08e7\u0001\u0000\u0000"+
		"\u0000\u08ee\u08f1\u0001\u0000\u0000\u0000\u08ef\u08ed\u0001\u0000\u0000"+
		"\u0000\u08ef\u08f0\u0001\u0000\u0000\u0000\u08f0\u0163\u0001\u0000\u0000"+
		"\u0000\u08f1\u08ef\u0001\u0000\u0000\u0000\u08f2\u08f6\u0003X,\u0000\u08f3"+
		"\u08f6\u0003\u00fc~\u0000\u08f4\u08f6\u0003\u0004\u0002\u0000\u08f5\u08f2"+
		"\u0001\u0000\u0000\u0000\u08f5\u08f3\u0001\u0000\u0000\u0000\u08f5\u08f4"+
		"\u0001\u0000\u0000\u0000\u08f6\u0165\u0001\u0000\u0000\u0000\u08f7\u08f8"+
		"\u0005D\u0000\u0000\u08f8\u08f9\u0003\n\u0005\u0000\u08f9\u08fa\u0005"+
		"|\u0000\u0000\u08fa\u0903\u0001\u0000\u0000\u0000\u08fb\u08fc\u0005D\u0000"+
		"\u0000\u08fc\u08fe\u0003\n\u0005\u0000\u08fd\u08ff\u0005<\u0000\u0000"+
		"\u08fe\u08fd\u0001\u0000\u0000\u0000\u08fe\u08ff\u0001\u0000\u0000\u0000"+
		"\u08ff\u0900\u0001\u0000\u0000\u0000\u0900\u0901\u0003\u015c\u00ae\u0000"+
		"\u0901\u0903\u0001\u0000\u0000\u0000\u0902\u08f7\u0001\u0000\u0000\u0000"+
		"\u0902\u08fb\u0001\u0000\u0000\u0000\u0903\u0167\u0001\u0000\u0000\u0000"+
		"\u0904\u0906\u0005\u001c\u0000\u0000\u0905\u0904\u0001\u0000\u0000\u0000"+
		"\u0905\u0906\u0001\u0000\u0000\u0000\u0906\u0907\u0001\u0000\u0000\u0000"+
		"\u0907\u0908\u0005<\u0000\u0000\u0908\u0909\u0003v;\u0000\u0909\u0169"+
		"\u0001\u0000\u0000\u0000\u090a\u090b\u0005<\u0000\u0000\u090b\u090c\u0005"+
		"^\u0000\u0000\u090c\u090d\u0005_\u0000\u0000\u090d\u090e\u0003v;\u0000"+
		"\u090e\u016b\u0001\u0000\u0000\u0000\u090f\u0910\u0005A\u0000\u0000\u0910"+
		"\u0911\u0003`0\u0000\u0911\u0912\u0003\u0170\u00b8\u0000\u0912\u016d\u0001"+
		"\u0000\u0000\u0000\u0913\u0915\u0005A\u0000\u0000\u0914\u0916\u0003\u0148"+
		"\u00a4\u0000\u0915\u0914\u0001\u0000\u0000\u0000\u0915\u0916\u0001\u0000"+
		"\u0000\u0000\u0916\u0917\u0001\u0000\u0000\u0000\u0917\u0918\u0003`0\u0000"+
		"\u0918\u0919\u0003\u0170\u00b8\u0000\u0919\u016f\u0001\u0000\u0000\u0000"+
		"\u091a\u091c\u0003\u0172\u00b9\u0000\u091b\u091d\u0003\u0170\u00b8\u0000"+
		"\u091c\u091b\u0001\u0000\u0000\u0000\u091c\u091d\u0001\u0000\u0000\u0000"+
		"\u091d\u0171\u0001\u0000\u0000\u0000\u091e\u091f\u0005\t\u0000\u0000\u091f"+
		"\u0920\u0005M\u0000\u0000\u0920\u0921\u0003\u0174\u00ba\u0000\u0921\u0922"+
		"\u0005N\u0000\u0000\u0922\u0923\u0003`0\u0000\u0923\u0173\u0001\u0000"+
		"\u0000\u0000\u0924\u0926\u0003\u00ceg\u0000\u0925\u0924\u0001\u0000\u0000"+
		"\u0000\u0925\u0926\u0001\u0000\u0000\u0000\u0926\u0927\u0001\u0000\u0000"+
		"\u0000\u0927\u0928\u0003\u0092I\u0000\u0928\u0929\u0003\u00e8t\u0000\u0929"+
		"\u0933\u0001\u0000\u0000\u0000\u092a\u092c\u0003\u00ceg\u0000\u092b\u092a"+
		"\u0001\u0000\u0000\u0000\u092b\u092c\u0001\u0000\u0000\u0000\u092c\u092d"+
		"\u0001\u0000\u0000\u0000\u092d\u092f\u0003\u0092I\u0000\u092e\u0930\u0003"+
		"\u00fe\u007f\u0000\u092f\u092e\u0001\u0000\u0000\u0000\u092f\u0930\u0001"+
		"\u0000\u0000\u0000\u0930\u0933\u0001\u0000\u0000\u0000\u0931\u0933\u0005"+
		"{\u0000\u0000\u0932\u0925\u0001\u0000\u0000\u0000\u0932\u092b\u0001\u0000"+
		"\u0000\u0000\u0932\u0931\u0001\u0000\u0000\u0000\u0933\u0175\u0001\u0000"+
		"\u0000\u0000\u0934\u0936\u0005?\u0000\u0000\u0935\u0937\u0003R)\u0000"+
		"\u0936\u0935\u0001\u0000\u0000\u0000\u0936\u0937\u0001\u0000\u0000\u0000"+
		"\u0937\u0177\u0001\u0000\u0000\u0000\u0938\u093b\u0003\u017a\u00bd\u0000"+
		"\u0939\u093b\u0003\u017e\u00bf\u0000\u093a\u0938\u0001\u0000\u0000\u0000"+
		"\u093a\u0939\u0001\u0000\u0000\u0000\u093b\u0179\u0001\u0000\u0000\u0000"+
		"\u093c\u093d\u0005?\u0000\u0000\u093d\u093f\u0005M\u0000\u0000\u093e\u0940"+
		"\u0003\u017c\u00be\u0000\u093f\u093e\u0001\u0000\u0000\u0000\u093f\u0940"+
		"\u0001\u0000\u0000\u0000\u0940\u0941\u0001\u0000\u0000\u0000\u0941\u0942"+
		"\u0005N\u0000\u0000\u0942\u017b\u0001\u0000\u0000\u0000\u0943\u0944\u0006"+
		"\u00be\uffff\uffff\u0000\u0944\u0946\u0003\u00fc~\u0000\u0945\u0947\u0005"+
		"{\u0000\u0000\u0946\u0945\u0001\u0000\u0000\u0000\u0946\u0947\u0001\u0000"+
		"\u0000\u0000\u0947\u0950\u0001\u0000\u0000\u0000\u0948\u0949\n\u0001\u0000"+
		"\u0000\u0949\u094a\u0005r\u0000\u0000\u094a\u094c\u0003\u00fc~\u0000\u094b"+
		"\u094d\u0005{\u0000\u0000\u094c\u094b\u0001\u0000\u0000\u0000\u094c\u094d"+
		"\u0001\u0000\u0000\u0000\u094d\u094f\u0001\u0000\u0000\u0000\u094e\u0948"+
		"\u0001\u0000\u0000\u0000\u094f\u0952\u0001\u0000\u0000\u0000\u0950\u094e"+
		"\u0001\u0000\u0000\u0000\u0950\u0951\u0001\u0000\u0000\u0000\u0951\u017d"+
		"\u0001\u0000\u0000\u0000\u0952\u0950\u0001\u0000\u0000\u0000\u0953\u0954"+
		"\u0005*\u0000\u0000\u0954\u0955\u0005M\u0000\u0000\u0955\u0956\u0003X"+
		",\u0000\u0956\u0957\u0005N\u0000\u0000\u0957\u095a\u0001\u0000\u0000\u0000"+
		"\u0958\u095a\u0005*\u0000\u0000\u0959\u0953\u0001\u0000\u0000\u0000\u0959"+
		"\u0958\u0001\u0000\u0000\u0000\u095a\u017f\u0001\u0000\u0000\u0000\u095b"+
		"\u095c\u0005_\u0000\u0000\u095c\u095d\u0005_\u0000\u0000\u095d\u0181\u0001"+
		"\u0000\u0000\u0000\u095e\u095f\u0005_\u0000\u0000\u095f\u0960\u0005_\u0000"+
		"\u0000\u0960\u0961\u0005]\u0000\u0000\u0961\u0183\u0001\u0000\u0000\u0000"+
		"\u0962\u0993\u0005)\u0000\u0000\u0963\u0993\u0005\u0014\u0000\u0000\u0964"+
		"\u0965\u0005)\u0000\u0000\u0965\u0966\u0005O\u0000\u0000\u0966\u0993\u0005"+
		"P\u0000\u0000\u0967\u0968\u0005\u0014\u0000\u0000\u0968\u0969\u0005O\u0000"+
		"\u0000\u0969\u0993\u0005P\u0000\u0000\u096a\u0993\u0005S\u0000\u0000\u096b"+
		"\u0993\u0005T\u0000\u0000\u096c\u0993\u0005U\u0000\u0000\u096d\u0993\u0005"+
		"V\u0000\u0000\u096e\u0993\u0005W\u0000\u0000\u096f\u0993\u0005X\u0000"+
		"\u0000\u0970\u0993\u0005Y\u0000\u0000\u0971\u0993\u0005Z\u0000\u0000\u0972"+
		"\u0993\u0005[\u0000\u0000\u0973\u0993\u0005\\\u0000\u0000\u0974\u0993"+
		"\u0005]\u0000\u0000\u0975\u0993\u0005^\u0000\u0000\u0976\u0993\u0005_"+
		"\u0000\u0000\u0977\u0993\u0005`\u0000\u0000\u0978\u0993\u0005a\u0000\u0000"+
		"\u0979\u0993\u0005b\u0000\u0000\u097a\u0993\u0005c\u0000\u0000\u097b\u0993"+
		"\u0005d\u0000\u0000\u097c\u0993\u0005e\u0000\u0000\u097d\u0993\u0005f"+
		"\u0000\u0000\u097e\u0993\u0005g\u0000\u0000\u097f\u0993\u0005h\u0000\u0000"+
		"\u0980\u0993\u0003\u0180\u00c0\u0000\u0981\u0993\u0003\u0182\u00c1\u0000"+
		"\u0982\u0993\u0005i\u0000\u0000\u0983\u0993\u0005j\u0000\u0000\u0984\u0993"+
		"\u0005k\u0000\u0000\u0985\u0993\u0005l\u0000\u0000\u0986\u0993\u0005m"+
		"\u0000\u0000\u0987\u0993\u0005n\u0000\u0000\u0988\u0993\u0005o\u0000\u0000"+
		"\u0989\u0993\u0005p\u0000\u0000\u098a\u0993\u0005q\u0000\u0000\u098b\u0993"+
		"\u0005r\u0000\u0000\u098c\u0993\u0005s\u0000\u0000\u098d\u0993\u0005t"+
		"\u0000\u0000\u098e\u098f\u0005M\u0000\u0000\u098f\u0993\u0005N\u0000\u0000"+
		"\u0990\u0991\u0005O\u0000\u0000\u0991\u0993\u0005P\u0000\u0000\u0992\u0962"+
		"\u0001\u0000\u0000\u0000\u0992\u0963\u0001\u0000\u0000\u0000\u0992\u0964"+
		"\u0001\u0000\u0000\u0000\u0992\u0967\u0001\u0000\u0000\u0000\u0992\u096a"+
		"\u0001\u0000\u0000\u0000\u0992\u096b\u0001\u0000\u0000\u0000\u0992\u096c"+
		"\u0001\u0000\u0000\u0000\u0992\u096d\u0001\u0000\u0000\u0000\u0992\u096e"+
		"\u0001\u0000\u0000\u0000\u0992\u096f\u0001\u0000\u0000\u0000\u0992\u0970";
	private static final String _serializedATNSegment1 =
		"\u0001\u0000\u0000\u0000\u0992\u0971\u0001\u0000\u0000\u0000\u0992\u0972"+
		"\u0001\u0000\u0000\u0000\u0992\u0973\u0001\u0000\u0000\u0000\u0992\u0974"+
		"\u0001\u0000\u0000\u0000\u0992\u0975\u0001\u0000\u0000\u0000\u0992\u0976"+
		"\u0001\u0000\u0000\u0000\u0992\u0977\u0001\u0000\u0000\u0000\u0992\u0978"+
		"\u0001\u0000\u0000\u0000\u0992\u0979\u0001\u0000\u0000\u0000\u0992\u097a"+
		"\u0001\u0000\u0000\u0000\u0992\u097b\u0001\u0000\u0000\u0000\u0992\u097c"+
		"\u0001\u0000\u0000\u0000\u0992\u097d\u0001\u0000\u0000\u0000\u0992\u097e"+
		"\u0001\u0000\u0000\u0000\u0992\u097f\u0001\u0000\u0000\u0000\u0992\u0980"+
		"\u0001\u0000\u0000\u0000\u0992\u0981\u0001\u0000\u0000\u0000\u0992\u0982"+
		"\u0001\u0000\u0000\u0000\u0992\u0983\u0001\u0000\u0000\u0000\u0992\u0984"+
		"\u0001\u0000\u0000\u0000\u0992\u0985\u0001\u0000\u0000\u0000\u0992\u0986"+
		"\u0001\u0000\u0000\u0000\u0992\u0987\u0001\u0000\u0000\u0000\u0992\u0988"+
		"\u0001\u0000\u0000\u0000\u0992\u0989\u0001\u0000\u0000\u0000\u0992\u098a"+
		"\u0001\u0000\u0000\u0000\u0992\u098b\u0001\u0000\u0000\u0000\u0992\u098c"+
		"\u0001\u0000\u0000\u0000\u0992\u098d\u0001\u0000\u0000\u0000\u0992\u098e"+
		"\u0001\u0000\u0000\u0000\u0992\u0990\u0001\u0000\u0000\u0000\u0993\u0185"+
		"\u0001\u0000\u0000\u0000\u0994\u099c\u0005}\u0000\u0000\u0995\u099c\u0005"+
		"\u0083\u0000\u0000\u0996\u099c\u0005\u0084\u0000\u0000\u0997\u099c\u0005"+
		"\u0085\u0000\u0000\u0998\u099c\u0003\u0188\u00c4\u0000\u0999\u099c\u0003"+
		"\u018a\u00c5\u0000\u099a\u099c\u0003\u018c\u00c6\u0000\u099b\u0994\u0001"+
		"\u0000\u0000\u0000\u099b\u0995\u0001\u0000\u0000\u0000\u099b\u0996\u0001"+
		"\u0000\u0000\u0000\u099b\u0997\u0001\u0000\u0000\u0000\u099b\u0998\u0001"+
		"\u0000\u0000\u0000\u099b\u0999\u0001\u0000\u0000\u0000\u099b\u099a\u0001"+
		"\u0000\u0000\u0000\u099c\u0187\u0001\u0000\u0000\u0000\u099d\u099e\u0007"+
		"\t\u0000\u0000\u099e\u0189\u0001\u0000\u0000\u0000\u099f\u09a0\u0005+"+
		"\u0000\u0000\u09a0\u018b\u0001\u0000\u0000\u0000\u09a1\u09a2\u0007\n\u0000"+
		"\u0000\u09a2\u018d\u0001\u0000\u0000\u0000\u013b\u018f\u019b\u019f\u01aa"+
		"\u01ae\u01bd\u01c4\u01c9\u01cb\u01d0\u01d6\u01e0\u01e7\u01ed\u01f1\u01f6"+
		"\u01fc\u0203\u0209\u020c\u020f\u0212\u0219\u0220\u0254\u0263\u0269\u026f"+
		"\u027c\u027e\u0284\u0293\u0299\u02b7\u02bc\u02c0\u02c4\u02c7\u02cb\u02d1"+
		"\u02d3\u02db\u02df\u02e2\u02e9\u02f0\u02f4\u02f9\u02fd\u0300\u0305\u030b"+
		"\u0318\u0323\u0325\u0334\u0336\u0342\u0344\u0351\u0353\u0365\u0367\u0373"+
		"\u0375\u0380\u038b\u0396\u03a1\u03ac\u03b6\u03be\u03cb\u03d5\u03dc\u03e0"+
		"\u03e4\u03e8\u03ec\u03f1\u03f4\u03f7\u03fd\u0405\u040a\u040d\u0413\u041e"+
		"\u0435\u0439\u0441\u0447\u045b\u045f\u046c\u0470\u0473\u047a\u0482\u048c"+
		"\u0497\u04a3\u04ad\u04b2\u04b9\u04bc\u04c1\u04c6\u04db\u04df\u04e4\u04ef"+
		"\u04f5\u04f9\u04fe\u0502\u0507\u050a\u0520\u0526\u0531\u0535\u0538\u0542"+
		"\u0548\u054b\u0552\u055c\u0560\u0563\u0566\u056a\u056f\u0571\u0575\u0579"+
		"\u0582\u058f\u0597\u059d\u05a3\u05a7\u05aa\u05b3\u05bc\u05c4\u05cf\u05d5"+
		"\u05e0\u05e3\u05e8\u05f7\u05fd\u0606\u0610\u0616\u061e\u0622\u0626\u062b"+
		"\u0630\u0637\u0639\u063e\u0642\u0650\u0656\u0665\u066f\u0674\u067b\u0681"+
		"\u0686\u068c\u0693\u0697\u0699\u069b\u06a2\u06a5\u06a8\u06ab\u06b0\u06b4"+
		"\u06b7\u06bb\u06bf\u06c4\u06c7\u06c9\u06cd\u06d4\u06da\u06de\u06e4\u06e9"+
		"\u06eb\u06f1\u06f5\u06fb\u0702\u0706\u0708\u070a\u0711\u071b\u071f\u0721"+
		"\u0723\u0727\u072a\u0730\u073a\u073e\u0744\u074c\u0750\u0753\u0757\u075c"+
		"\u075f\u0762\u0766\u076b\u0775\u077c\u0781\u0785\u078a\u0790\u0794\u079a"+
		"\u07a0\u07a4\u07a9\u07af\u07b3\u07b6\u07ba\u07bd\u07bf\u07c2\u07cc\u07d1"+
		"\u07d3\u07d6\u07d9\u07dc\u07e5\u07ef\u07f4\u07f7\u07fb\u07fe\u0801\u0805"+
		"\u080e\u081d\u0823\u0827\u082b\u082f\u0833\u0837\u083b\u083f\u0842\u0846"+
		"\u0851\u0855\u085c\u0860\u0865\u086a\u0871\u0875\u087f\u088f\u0894\u0898"+
		"\u089b\u089f\u08a5\u08a8\u08ac\u08b6\u08b9\u08c1\u08c6\u08cb\u08d3\u08da"+
		"\u08de\u08e5\u08eb\u08ef\u08f5\u08fe\u0902\u0905\u0915\u091c\u0925\u092b"+
		"\u092f\u0932\u0936\u093a\u093f\u0946\u094c\u0950\u0959\u0992\u099b";
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