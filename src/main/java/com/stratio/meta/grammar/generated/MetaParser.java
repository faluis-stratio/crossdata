// $ANTLR 3.5.1 Meta.g 2014-02-26 13:16:19

    package com.stratio.meta.grammar.generated;    
    import com.stratio.meta.statements.*;
    import com.stratio.meta.structures.*;
    import com.stratio.meta.utils.*;
    import java.util.LinkedHashMap;
    import java.util.HashMap;
    import java.util.Map;
    import java.util.Set;
    import java.util.HashSet;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MetaParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "B", "C", "D", "DIGIT", "E", 
		"EXPONENT", "F", "G", "H", "I", "J", "K", "L", "LETTER", "M", "N", "O", 
		"P", "POINT", "Q", "QUOTED_LITERAL", "R", "S", "T", "T_ADD", "T_AGGREGATION", 
		"T_ALL", "T_ALTER", "T_ANALYTICS", "T_AND", "T_ANY", "T_AS", "T_ASC", 
		"T_ASTERISK", "T_AVG", "T_BETWEEN", "T_BY", "T_CLUSTERING", "T_COLON", 
		"T_COMMA", "T_COMPACT", "T_CONSISTENCY", "T_CONSTANT", "T_COUNT", "T_CREATE", 
		"T_DELETE", "T_DESC", "T_DISABLE", "T_DISTINCT", "T_DROP", "T_EACH_QUORUM", 
		"T_END_BRACKET", "T_END_PARENTHESIS", "T_END_SBRACKET", "T_EQUAL", "T_EXISTS", 
		"T_EXPLAIN", "T_FALSE", "T_FLOAT", "T_FOR", "T_FROM", "T_GROUP", "T_GT", 
		"T_GTE", "T_IDENT", "T_IF", "T_IN", "T_INDEX", "T_INDEX_TYPE", "T_INNER", 
		"T_INSERT", "T_INTERROGATION", "T_INTO", "T_JOIN", "T_KEY", "T_KEYSPACE", 
		"T_KS_AND_TN", "T_LAST", "T_LIKE", "T_LIMIT", "T_LIST", "T_LOCAL_ONE", 
		"T_LOCAL_QUORUM", "T_LT", "T_LTE", "T_MAX", "T_MIN", "T_NOT", "T_NOT_EQUAL", 
		"T_ON", "T_ONE", "T_OPTIONS", "T_ORDER", "T_PATH", "T_PLAN", "T_PLUS", 
		"T_PRIMARY", "T_PROCESS", "T_QUORUM", "T_QUOTE", "T_REMOVE", "T_ROWS", 
		"T_SELECT", "T_SEMICOLON", "T_SET", "T_SINGLE_QUOTE", "T_START_BRACKET", 
		"T_START_PARENTHESIS", "T_START_SBRACKET", "T_STOP", "T_STORAGE", "T_SUBTRACT", 
		"T_TABLE", "T_TERM", "T_THREE", "T_TOKEN", "T_TRIGGER", "T_TRUE", "T_TRUNCATE", 
		"T_TWO", "T_TYPE", "T_UDF", "T_UPDATE", "T_USE", "T_USING", "T_VALUES", 
		"T_WHERE", "T_WINDOW", "T_WITH", "U", "V", "W", "WS", "X", "Y", "Z", "'1'", 
		"'D'", "'DAYS'", "'H'", "'HOURS'", "'M'", "'MINUTES'", "'PROCESS'", "'S'", 
		"'SECONDS'", "'TRIGGER'", "'UDF'", "'d'", "'days'", "'h'", "'hours'", 
		"'m'", "'minutes'", "'s'", "'seconds'"
	};
	public static final int EOF=-1;
	public static final int T__141=141;
	public static final int T__142=142;
	public static final int T__143=143;
	public static final int T__144=144;
	public static final int T__145=145;
	public static final int T__146=146;
	public static final int T__147=147;
	public static final int T__148=148;
	public static final int T__149=149;
	public static final int T__150=150;
	public static final int T__151=151;
	public static final int T__152=152;
	public static final int T__153=153;
	public static final int T__154=154;
	public static final int T__155=155;
	public static final int T__156=156;
	public static final int T__157=157;
	public static final int T__158=158;
	public static final int T__159=159;
	public static final int T__160=160;
	public static final int A=4;
	public static final int B=5;
	public static final int C=6;
	public static final int D=7;
	public static final int DIGIT=8;
	public static final int E=9;
	public static final int EXPONENT=10;
	public static final int F=11;
	public static final int G=12;
	public static final int H=13;
	public static final int I=14;
	public static final int J=15;
	public static final int K=16;
	public static final int L=17;
	public static final int LETTER=18;
	public static final int M=19;
	public static final int N=20;
	public static final int O=21;
	public static final int P=22;
	public static final int POINT=23;
	public static final int Q=24;
	public static final int QUOTED_LITERAL=25;
	public static final int R=26;
	public static final int S=27;
	public static final int T=28;
	public static final int T_ADD=29;
	public static final int T_AGGREGATION=30;
	public static final int T_ALL=31;
	public static final int T_ALTER=32;
	public static final int T_ANALYTICS=33;
	public static final int T_AND=34;
	public static final int T_ANY=35;
	public static final int T_AS=36;
	public static final int T_ASC=37;
	public static final int T_ASTERISK=38;
	public static final int T_AVG=39;
	public static final int T_BETWEEN=40;
	public static final int T_BY=41;
	public static final int T_CLUSTERING=42;
	public static final int T_COLON=43;
	public static final int T_COMMA=44;
	public static final int T_COMPACT=45;
	public static final int T_CONSISTENCY=46;
	public static final int T_CONSTANT=47;
	public static final int T_COUNT=48;
	public static final int T_CREATE=49;
	public static final int T_DELETE=50;
	public static final int T_DESC=51;
	public static final int T_DISABLE=52;
	public static final int T_DISTINCT=53;
	public static final int T_DROP=54;
	public static final int T_EACH_QUORUM=55;
	public static final int T_END_BRACKET=56;
	public static final int T_END_PARENTHESIS=57;
	public static final int T_END_SBRACKET=58;
	public static final int T_EQUAL=59;
	public static final int T_EXISTS=60;
	public static final int T_EXPLAIN=61;
	public static final int T_FALSE=62;
	public static final int T_FLOAT=63;
	public static final int T_FOR=64;
	public static final int T_FROM=65;
	public static final int T_GROUP=66;
	public static final int T_GT=67;
	public static final int T_GTE=68;
	public static final int T_IDENT=69;
	public static final int T_IF=70;
	public static final int T_IN=71;
	public static final int T_INDEX=72;
	public static final int T_INDEX_TYPE=73;
	public static final int T_INNER=74;
	public static final int T_INSERT=75;
	public static final int T_INTERROGATION=76;
	public static final int T_INTO=77;
	public static final int T_JOIN=78;
	public static final int T_KEY=79;
	public static final int T_KEYSPACE=80;
	public static final int T_KS_AND_TN=81;
	public static final int T_LAST=82;
	public static final int T_LIKE=83;
	public static final int T_LIMIT=84;
	public static final int T_LIST=85;
	public static final int T_LOCAL_ONE=86;
	public static final int T_LOCAL_QUORUM=87;
	public static final int T_LT=88;
	public static final int T_LTE=89;
	public static final int T_MAX=90;
	public static final int T_MIN=91;
	public static final int T_NOT=92;
	public static final int T_NOT_EQUAL=93;
	public static final int T_ON=94;
	public static final int T_ONE=95;
	public static final int T_OPTIONS=96;
	public static final int T_ORDER=97;
	public static final int T_PATH=98;
	public static final int T_PLAN=99;
	public static final int T_PLUS=100;
	public static final int T_PRIMARY=101;
	public static final int T_PROCESS=102;
	public static final int T_QUORUM=103;
	public static final int T_QUOTE=104;
	public static final int T_REMOVE=105;
	public static final int T_ROWS=106;
	public static final int T_SELECT=107;
	public static final int T_SEMICOLON=108;
	public static final int T_SET=109;
	public static final int T_SINGLE_QUOTE=110;
	public static final int T_START_BRACKET=111;
	public static final int T_START_PARENTHESIS=112;
	public static final int T_START_SBRACKET=113;
	public static final int T_STOP=114;
	public static final int T_STORAGE=115;
	public static final int T_SUBTRACT=116;
	public static final int T_TABLE=117;
	public static final int T_TERM=118;
	public static final int T_THREE=119;
	public static final int T_TOKEN=120;
	public static final int T_TRIGGER=121;
	public static final int T_TRUE=122;
	public static final int T_TRUNCATE=123;
	public static final int T_TWO=124;
	public static final int T_TYPE=125;
	public static final int T_UDF=126;
	public static final int T_UPDATE=127;
	public static final int T_USE=128;
	public static final int T_USING=129;
	public static final int T_VALUES=130;
	public static final int T_WHERE=131;
	public static final int T_WINDOW=132;
	public static final int T_WITH=133;
	public static final int U=134;
	public static final int V=135;
	public static final int W=136;
	public static final int WS=137;
	public static final int X=138;
	public static final int Y=139;
	public static final int Z=140;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public MetaParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public MetaParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return MetaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Meta.g"; }


	    private ErrorsHelper foundErrors = new ErrorsHelper();

	    public ErrorsHelper getFoundErrors(){
	        return foundErrors;
	    }

	    @Override
	    public void displayRecognitionError(String[] tokenNames, RecognitionException e){        
	        String hdr = getErrorHeader(e);
	        String msg = getErrorMessage(e, tokenNames);
	        /*System.err.println("Antlr exception: ");
	        System.err.print("\tError recognized: ");
	        System.err.print(hdr+": ");
	        System.err.println(msg);*/
	        AntlrError antlrError = new AntlrError(hdr, msg);
	        foundErrors.addError(antlrError);
	    }



	// $ANTLR start "deleteStatement"
	// Meta.g:225:1: deleteStatement returns [DeleteStatement ds] : T_DELETE ( T_START_PARENTHESIS firstField= T_IDENT ( T_COMMA field= T_IDENT )* T_END_PARENTHESIS )* T_FROM tablename= T_IDENT T_WHERE rel1= getRelation ( T_AND relN= getRelation )* ;
	public final DeleteStatement deleteStatement() throws RecognitionException {
		DeleteStatement ds = null;


		Token firstField=null;
		Token field=null;
		Token tablename=null;
		MetaRelation rel1 =null;
		MetaRelation relN =null;


				ds = new DeleteStatement();
			
		try {
			// Meta.g:228:3: ( T_DELETE ( T_START_PARENTHESIS firstField= T_IDENT ( T_COMMA field= T_IDENT )* T_END_PARENTHESIS )* T_FROM tablename= T_IDENT T_WHERE rel1= getRelation ( T_AND relN= getRelation )* )
			// Meta.g:229:2: T_DELETE ( T_START_PARENTHESIS firstField= T_IDENT ( T_COMMA field= T_IDENT )* T_END_PARENTHESIS )* T_FROM tablename= T_IDENT T_WHERE rel1= getRelation ( T_AND relN= getRelation )*
			{
			match(input,T_DELETE,FOLLOW_T_DELETE_in_deleteStatement1963); 
			// Meta.g:230:2: ( T_START_PARENTHESIS firstField= T_IDENT ( T_COMMA field= T_IDENT )* T_END_PARENTHESIS )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==T_START_PARENTHESIS) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Meta.g:230:3: T_START_PARENTHESIS firstField= T_IDENT ( T_COMMA field= T_IDENT )* T_END_PARENTHESIS
					{
					match(input,T_START_PARENTHESIS,FOLLOW_T_START_PARENTHESIS_in_deleteStatement1967); 
					firstField=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_deleteStatement1972); 
					ds.addColumn((firstField!=null?firstField.getText():null));
					// Meta.g:232:3: ( T_COMMA field= T_IDENT )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==T_COMMA) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// Meta.g:232:4: T_COMMA field= T_IDENT
							{
							match(input,T_COMMA,FOLLOW_T_COMMA_in_deleteStatement1979); 
							field=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_deleteStatement1986); 
							ds.addColumn((field!=null?field.getText():null));
							}
							break;

						default :
							break loop1;
						}
					}

					match(input,T_END_PARENTHESIS,FOLLOW_T_END_PARENTHESIS_in_deleteStatement1998); 
					}
					break;

				default :
					break loop2;
				}
			}

			match(input,T_FROM,FOLLOW_T_FROM_in_deleteStatement2003); 
			tablename=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_deleteStatement2008); 
			ds.setTablename((tablename!=null?tablename.getText():null));
			match(input,T_WHERE,FOLLOW_T_WHERE_in_deleteStatement2013); 
			pushFollow(FOLLOW_getRelation_in_deleteStatement2018);
			rel1=getRelation();
			state._fsp--;

			ds.addRelation(rel1);
			// Meta.g:240:44: ( T_AND relN= getRelation )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==T_AND) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Meta.g:240:45: T_AND relN= getRelation
					{
					match(input,T_AND,FOLLOW_T_AND_in_deleteStatement2023); 
					pushFollow(FOLLOW_getRelation_in_deleteStatement2027);
					relN=getRelation();
					state._fsp--;

					ds.addRelation(relN);
					}
					break;

				default :
					break loop3;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ds;
	}
	// $ANTLR end "deleteStatement"



	// $ANTLR start "addStatement"
	// Meta.g:244:1: addStatement returns [AddStatement as] : T_ADD ( T_QUOTE | T_SINGLE_QUOTE ) name= T_PATH ( T_QUOTE | T_SINGLE_QUOTE ) ;
	public final AddStatement addStatement() throws RecognitionException {
		AddStatement as = null;


		Token name=null;

		try {
			// Meta.g:244:39: ( T_ADD ( T_QUOTE | T_SINGLE_QUOTE ) name= T_PATH ( T_QUOTE | T_SINGLE_QUOTE ) )
			// Meta.g:245:2: T_ADD ( T_QUOTE | T_SINGLE_QUOTE ) name= T_PATH ( T_QUOTE | T_SINGLE_QUOTE )
			{
			match(input,T_ADD,FOLLOW_T_ADD_in_addStatement2046); 
			if ( input.LA(1)==T_QUOTE||input.LA(1)==T_SINGLE_QUOTE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			name=(Token)match(input,T_PATH,FOLLOW_T_PATH_in_addStatement2058); 
			if ( input.LA(1)==T_QUOTE||input.LA(1)==T_SINGLE_QUOTE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			as = new AddStatement((name!=null?name.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return as;
	}
	// $ANTLR end "addStatement"



	// $ANTLR start "listStatement"
	// Meta.g:249:1: listStatement returns [ListStatement ls] : T_LIST (type= getListTypes ) ;
	public final ListStatement listStatement() throws RecognitionException {
		ListStatement ls = null;


		ParserRuleReturnScope type =null;

		try {
			// Meta.g:249:41: ( T_LIST (type= getListTypes ) )
			// Meta.g:250:2: T_LIST (type= getListTypes )
			{
			match(input,T_LIST,FOLLOW_T_LIST_in_listStatement2083); 
			// Meta.g:250:9: (type= getListTypes )
			// Meta.g:250:10: type= getListTypes
			{
			pushFollow(FOLLOW_getListTypes_in_listStatement2088);
			type=getListTypes();
			state._fsp--;

			}

			ls = new ListStatement((type!=null?input.toString(type.start,type.stop):null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ls;
	}
	// $ANTLR end "listStatement"



	// $ANTLR start "removeUDFStatement"
	// Meta.g:254:1: removeUDFStatement returns [RemoveUDFStatement rus] : T_REMOVE 'UDF' ( T_QUOTE | T_SINGLE_QUOTE ) jar= getTerm ( T_QUOTE | T_SINGLE_QUOTE ) ;
	public final RemoveUDFStatement removeUDFStatement() throws RecognitionException {
		RemoveUDFStatement rus = null;


		String jar =null;

		try {
			// Meta.g:254:52: ( T_REMOVE 'UDF' ( T_QUOTE | T_SINGLE_QUOTE ) jar= getTerm ( T_QUOTE | T_SINGLE_QUOTE ) )
			// Meta.g:255:2: T_REMOVE 'UDF' ( T_QUOTE | T_SINGLE_QUOTE ) jar= getTerm ( T_QUOTE | T_SINGLE_QUOTE )
			{
			match(input,T_REMOVE,FOLLOW_T_REMOVE_in_removeUDFStatement2106); 
			match(input,152,FOLLOW_152_in_removeUDFStatement2108); 
			if ( input.LA(1)==T_QUOTE||input.LA(1)==T_SINGLE_QUOTE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_getTerm_in_removeUDFStatement2120);
			jar=getTerm();
			state._fsp--;

			rus = new RemoveUDFStatement(jar);
			if ( input.LA(1)==T_QUOTE||input.LA(1)==T_SINGLE_QUOTE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return rus;
	}
	// $ANTLR end "removeUDFStatement"



	// $ANTLR start "dropIndexStatement"
	// Meta.g:259:1: dropIndexStatement returns [DropIndexStatement dis] : T_DROP T_INDEX ( T_IF T_EXISTS )? name= T_IDENT ;
	public final DropIndexStatement dropIndexStatement() throws RecognitionException {
		DropIndexStatement dis = null;


		Token name=null;


				dis = new DropIndexStatement();
			
		try {
			// Meta.g:262:3: ( T_DROP T_INDEX ( T_IF T_EXISTS )? name= T_IDENT )
			// Meta.g:263:2: T_DROP T_INDEX ( T_IF T_EXISTS )? name= T_IDENT
			{
			match(input,T_DROP,FOLLOW_T_DROP_in_dropIndexStatement2150); 
			match(input,T_INDEX,FOLLOW_T_INDEX_in_dropIndexStatement2152); 
			// Meta.g:264:2: ( T_IF T_EXISTS )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==T_IF) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// Meta.g:264:3: T_IF T_EXISTS
					{
					match(input,T_IF,FOLLOW_T_IF_in_dropIndexStatement2156); 
					match(input,T_EXISTS,FOLLOW_T_EXISTS_in_dropIndexStatement2158); 
					dis.setDropIfExists();
					}
					break;

			}

			name=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_dropIndexStatement2167); 
			dis.setName((name!=null?name.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return dis;
	}
	// $ANTLR end "dropIndexStatement"



	// $ANTLR start "createIndexStatement"
	// Meta.g:272:1: createIndexStatement returns [CreateIndexStatement cis] : T_CREATE indexType= T_INDEX_TYPE T_INDEX ( T_IF T_NOT T_EXISTS )? name= T_IDENT T_ON tablename= getTableID T_START_PARENTHESIS firstField= T_IDENT ( T_COMMA field= T_IDENT )* T_END_PARENTHESIS ( T_USING usingClass= getTerm )? ( T_WITH T_OPTIONS key= T_IDENT T_EQUAL value= getValueProperty ( T_AND key= T_IDENT T_EQUAL value= getValueProperty )* )? ;
	public final CreateIndexStatement createIndexStatement() throws RecognitionException {
		CreateIndexStatement cis = null;


		Token indexType=null;
		Token name=null;
		Token firstField=null;
		Token field=null;
		Token key=null;
		String tablename =null;
		String usingClass =null;
		ValueProperty value =null;


				cis = new CreateIndexStatement();
			
		try {
			// Meta.g:275:3: ( T_CREATE indexType= T_INDEX_TYPE T_INDEX ( T_IF T_NOT T_EXISTS )? name= T_IDENT T_ON tablename= getTableID T_START_PARENTHESIS firstField= T_IDENT ( T_COMMA field= T_IDENT )* T_END_PARENTHESIS ( T_USING usingClass= getTerm )? ( T_WITH T_OPTIONS key= T_IDENT T_EQUAL value= getValueProperty ( T_AND key= T_IDENT T_EQUAL value= getValueProperty )* )? )
			// Meta.g:276:2: T_CREATE indexType= T_INDEX_TYPE T_INDEX ( T_IF T_NOT T_EXISTS )? name= T_IDENT T_ON tablename= getTableID T_START_PARENTHESIS firstField= T_IDENT ( T_COMMA field= T_IDENT )* T_END_PARENTHESIS ( T_USING usingClass= getTerm )? ( T_WITH T_OPTIONS key= T_IDENT T_EQUAL value= getValueProperty ( T_AND key= T_IDENT T_EQUAL value= getValueProperty )* )?
			{
			match(input,T_CREATE,FOLLOW_T_CREATE_in_createIndexStatement2192); 
			indexType=(Token)match(input,T_INDEX_TYPE,FOLLOW_T_INDEX_TYPE_in_createIndexStatement2196); 
			cis.setIndexType((indexType!=null?indexType.getText():null));
			match(input,T_INDEX,FOLLOW_T_INDEX_in_createIndexStatement2200); 
			// Meta.g:277:2: ( T_IF T_NOT T_EXISTS )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==T_IF) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Meta.g:277:3: T_IF T_NOT T_EXISTS
					{
					match(input,T_IF,FOLLOW_T_IF_in_createIndexStatement2204); 
					match(input,T_NOT,FOLLOW_T_NOT_in_createIndexStatement2206); 
					match(input,T_EXISTS,FOLLOW_T_EXISTS_in_createIndexStatement2208); 
					cis.setCreateIfNotExists();
					}
					break;

			}

			name=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_createIndexStatement2217); 
			cis.setName((name!=null?name.getText():null));
			match(input,T_ON,FOLLOW_T_ON_in_createIndexStatement2222); 
			pushFollow(FOLLOW_getTableID_in_createIndexStatement2226);
			tablename=getTableID();
			state._fsp--;

			cis.setTablename(tablename);
			match(input,T_START_PARENTHESIS,FOLLOW_T_START_PARENTHESIS_in_createIndexStatement2231); 
			firstField=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_createIndexStatement2236); 
			cis.addColumn((firstField!=null?firstField.getText():null));
			// Meta.g:282:2: ( T_COMMA field= T_IDENT )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==T_COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Meta.g:282:3: T_COMMA field= T_IDENT
					{
					match(input,T_COMMA,FOLLOW_T_COMMA_in_createIndexStatement2242); 
					field=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_createIndexStatement2248); 
					cis.addColumn((field!=null?field.getText():null));
					}
					break;

				default :
					break loop6;
				}
			}

			match(input,T_END_PARENTHESIS,FOLLOW_T_END_PARENTHESIS_in_createIndexStatement2257); 
			// Meta.g:286:2: ( T_USING usingClass= getTerm )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==T_USING) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// Meta.g:286:3: T_USING usingClass= getTerm
					{
					match(input,T_USING,FOLLOW_T_USING_in_createIndexStatement2261); 
					pushFollow(FOLLOW_getTerm_in_createIndexStatement2265);
					usingClass=getTerm();
					state._fsp--;

					cis.setUsingClass(usingClass);
					}
					break;

			}

			// Meta.g:287:2: ( T_WITH T_OPTIONS key= T_IDENT T_EQUAL value= getValueProperty ( T_AND key= T_IDENT T_EQUAL value= getValueProperty )* )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==T_WITH) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// Meta.g:287:3: T_WITH T_OPTIONS key= T_IDENT T_EQUAL value= getValueProperty ( T_AND key= T_IDENT T_EQUAL value= getValueProperty )*
					{
					match(input,T_WITH,FOLLOW_T_WITH_in_createIndexStatement2273); 
					match(input,T_OPTIONS,FOLLOW_T_OPTIONS_in_createIndexStatement2275); 
					key=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_createIndexStatement2279); 
					match(input,T_EQUAL,FOLLOW_T_EQUAL_in_createIndexStatement2281); 
					pushFollow(FOLLOW_getValueProperty_in_createIndexStatement2285);
					value=getValueProperty();
					state._fsp--;

					cis.addOption((key!=null?key.getText():null), value);
					// Meta.g:288:3: ( T_AND key= T_IDENT T_EQUAL value= getValueProperty )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==T_AND) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// Meta.g:288:4: T_AND key= T_IDENT T_EQUAL value= getValueProperty
							{
							match(input,T_AND,FOLLOW_T_AND_in_createIndexStatement2292); 
							key=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_createIndexStatement2296); 
							match(input,T_EQUAL,FOLLOW_T_EQUAL_in_createIndexStatement2298); 
							pushFollow(FOLLOW_getValueProperty_in_createIndexStatement2302);
							value=getValueProperty();
							state._fsp--;

							cis.addOption((key!=null?key.getText():null), value);
							}
							break;

						default :
							break loop8;
						}
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return cis;
	}
	// $ANTLR end "createIndexStatement"



	// $ANTLR start "updateTableStatement"
	// Meta.g:297:1: updateTableStatement returns [UpdateTableStatement pdtbst] : T_UPDATE tablename= getTableID ( T_USING opt1= getOption (optN= getOption )* )? T_SET assig1= getAssignment ( T_COMMA assigN= getAssignment )* T_WHERE rel1= getRelation ( T_AND relN= getRelation )* ( T_IF id1= T_IDENT T_EQUAL term1= getTerm ( T_AND idN= T_IDENT T_EQUAL termN= getTerm )* )? ;
	public final UpdateTableStatement updateTableStatement() throws RecognitionException {
		UpdateTableStatement pdtbst = null;


		Token id1=null;
		Token idN=null;
		String tablename =null;
		Option opt1 =null;
		Option optN =null;
		Assignment assig1 =null;
		Assignment assigN =null;
		MetaRelation rel1 =null;
		MetaRelation relN =null;
		String term1 =null;
		String termN =null;


		        boolean optsInc = false;
		        boolean condsInc = false;
		        List<Option> options = new ArrayList<>();
		        List<Assignment> assignments = new ArrayList<>();
		        List<MetaRelation> whereclauses = new ArrayList<>();
		        Map<String, Term> conditions = new HashMap<>();
		    
		try {
			// Meta.g:305:6: ( T_UPDATE tablename= getTableID ( T_USING opt1= getOption (optN= getOption )* )? T_SET assig1= getAssignment ( T_COMMA assigN= getAssignment )* T_WHERE rel1= getRelation ( T_AND relN= getRelation )* ( T_IF id1= T_IDENT T_EQUAL term1= getTerm ( T_AND idN= T_IDENT T_EQUAL termN= getTerm )* )? )
			// Meta.g:306:5: T_UPDATE tablename= getTableID ( T_USING opt1= getOption (optN= getOption )* )? T_SET assig1= getAssignment ( T_COMMA assigN= getAssignment )* T_WHERE rel1= getRelation ( T_AND relN= getRelation )* ( T_IF id1= T_IDENT T_EQUAL term1= getTerm ( T_AND idN= T_IDENT T_EQUAL termN= getTerm )* )?
			{
			match(input,T_UPDATE,FOLLOW_T_UPDATE_in_updateTableStatement2343); 
			pushFollow(FOLLOW_getTableID_in_updateTableStatement2347);
			tablename=getTableID();
			state._fsp--;

			// Meta.g:307:5: ( T_USING opt1= getOption (optN= getOption )* )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==T_USING) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// Meta.g:307:6: T_USING opt1= getOption (optN= getOption )*
					{
					match(input,T_USING,FOLLOW_T_USING_in_updateTableStatement2354); 
					pushFollow(FOLLOW_getOption_in_updateTableStatement2358);
					opt1=getOption();
					state._fsp--;

					optsInc = true; options.add(opt1);
					// Meta.g:307:66: (optN= getOption )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==T_CLUSTERING||LA10_0==T_COMPACT||LA10_0==T_IDENT) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// Meta.g:307:67: optN= getOption
							{
							pushFollow(FOLLOW_getOption_in_updateTableStatement2365);
							optN=getOption();
							state._fsp--;

							options.add(optN);
							}
							break;

						default :
							break loop10;
						}
					}

					}
					break;

			}

			match(input,T_SET,FOLLOW_T_SET_in_updateTableStatement2377); 
			pushFollow(FOLLOW_getAssignment_in_updateTableStatement2381);
			assig1=getAssignment();
			state._fsp--;

			assignments.add(assig1);
			// Meta.g:308:59: ( T_COMMA assigN= getAssignment )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==T_COMMA) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// Meta.g:308:60: T_COMMA assigN= getAssignment
					{
					match(input,T_COMMA,FOLLOW_T_COMMA_in_updateTableStatement2386); 
					pushFollow(FOLLOW_getAssignment_in_updateTableStatement2390);
					assigN=getAssignment();
					state._fsp--;

					assignments.add(assigN);
					}
					break;

				default :
					break loop12;
				}
			}

			match(input,T_WHERE,FOLLOW_T_WHERE_in_updateTableStatement2400); 
			pushFollow(FOLLOW_getRelation_in_updateTableStatement2404);
			rel1=getRelation();
			state._fsp--;

			whereclauses.add(rel1);
			// Meta.g:309:56: ( T_AND relN= getRelation )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==T_AND) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// Meta.g:309:57: T_AND relN= getRelation
					{
					match(input,T_AND,FOLLOW_T_AND_in_updateTableStatement2409); 
					pushFollow(FOLLOW_getRelation_in_updateTableStatement2413);
					relN=getRelation();
					state._fsp--;

					whereclauses.add(relN);
					}
					break;

				default :
					break loop13;
				}
			}

			// Meta.g:310:5: ( T_IF id1= T_IDENT T_EQUAL term1= getTerm ( T_AND idN= T_IDENT T_EQUAL termN= getTerm )* )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==T_IF) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// Meta.g:310:6: T_IF id1= T_IDENT T_EQUAL term1= getTerm ( T_AND idN= T_IDENT T_EQUAL termN= getTerm )*
					{
					match(input,T_IF,FOLLOW_T_IF_in_updateTableStatement2424); 
					id1=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_updateTableStatement2428); 
					match(input,T_EQUAL,FOLLOW_T_EQUAL_in_updateTableStatement2430); 
					pushFollow(FOLLOW_getTerm_in_updateTableStatement2434);
					term1=getTerm();
					state._fsp--;

					condsInc = true; conditions.put((id1!=null?id1.getText():null), new Term(term1));
					// Meta.g:311:21: ( T_AND idN= T_IDENT T_EQUAL termN= getTerm )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==T_AND) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// Meta.g:311:22: T_AND idN= T_IDENT T_EQUAL termN= getTerm
							{
							match(input,T_AND,FOLLOW_T_AND_in_updateTableStatement2460); 
							idN=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_updateTableStatement2464); 
							match(input,T_EQUAL,FOLLOW_T_EQUAL_in_updateTableStatement2466); 
							pushFollow(FOLLOW_getTerm_in_updateTableStatement2470);
							termN=getTerm();
							state._fsp--;

							conditions.put((idN!=null?idN.getText():null), new Term(termN));
							}
							break;

						default :
							break loop14;
						}
					}

					}
					break;

			}

			 
			        if(optsInc)
			            if(condsInc)
			                pdtbst = new UpdateTableStatement(tablename, options, assignments, whereclauses, conditions);
			            else
			                pdtbst = new UpdateTableStatement(tablename, options, assignments, whereclauses);
			        else
			            if(condsInc)
			                pdtbst = new UpdateTableStatement(tablename, assignments, whereclauses, conditions);
			            else
			                pdtbst = new UpdateTableStatement(tablename, assignments, whereclauses);
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return pdtbst;
	}
	// $ANTLR end "updateTableStatement"



	// $ANTLR start "stopProcessStatement"
	// Meta.g:326:1: stopProcessStatement returns [StopProcessStatement stprst] : T_STOP T_PROCESS ident= T_IDENT ;
	public final StopProcessStatement stopProcessStatement() throws RecognitionException {
		StopProcessStatement stprst = null;


		Token ident=null;

		try {
			// Meta.g:326:59: ( T_STOP T_PROCESS ident= T_IDENT )
			// Meta.g:327:5: T_STOP T_PROCESS ident= T_IDENT
			{
			match(input,T_STOP,FOLLOW_T_STOP_in_stopProcessStatement2502); 
			match(input,T_PROCESS,FOLLOW_T_PROCESS_in_stopProcessStatement2504); 
			ident=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_stopProcessStatement2508); 
			 stprst = new StopProcessStatement((ident!=null?ident.getText():null)); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stprst;
	}
	// $ANTLR end "stopProcessStatement"



	// $ANTLR start "dropTriggerStatement"
	// Meta.g:330:1: dropTriggerStatement returns [DropTriggerStatement drtrst] : T_DROP T_TRIGGER ident= T_IDENT T_ON ident2= T_IDENT ;
	public final DropTriggerStatement dropTriggerStatement() throws RecognitionException {
		DropTriggerStatement drtrst = null;


		Token ident=null;
		Token ident2=null;

		try {
			// Meta.g:330:59: ( T_DROP T_TRIGGER ident= T_IDENT T_ON ident2= T_IDENT )
			// Meta.g:331:5: T_DROP T_TRIGGER ident= T_IDENT T_ON ident2= T_IDENT
			{
			match(input,T_DROP,FOLLOW_T_DROP_in_dropTriggerStatement2530); 
			match(input,T_TRIGGER,FOLLOW_T_TRIGGER_in_dropTriggerStatement2537); 
			ident=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_dropTriggerStatement2541); 
			match(input,T_ON,FOLLOW_T_ON_in_dropTriggerStatement2548); 
			ident2=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_dropTriggerStatement2557); 
			drtrst = new DropTriggerStatement((ident!=null?ident.getText():null),(ident2!=null?ident2.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return drtrst;
	}
	// $ANTLR end "dropTriggerStatement"



	// $ANTLR start "createTriggerStatement"
	// Meta.g:338:1: createTriggerStatement returns [CreateTriggerStatement crtrst] : T_CREATE T_TRIGGER trigger_name= T_IDENT T_ON table_name= T_IDENT T_USING class_name= T_IDENT ;
	public final CreateTriggerStatement createTriggerStatement() throws RecognitionException {
		CreateTriggerStatement crtrst = null;


		Token trigger_name=null;
		Token table_name=null;
		Token class_name=null;

		try {
			// Meta.g:338:63: ( T_CREATE T_TRIGGER trigger_name= T_IDENT T_ON table_name= T_IDENT T_USING class_name= T_IDENT )
			// Meta.g:339:5: T_CREATE T_TRIGGER trigger_name= T_IDENT T_ON table_name= T_IDENT T_USING class_name= T_IDENT
			{
			match(input,T_CREATE,FOLLOW_T_CREATE_in_createTriggerStatement2585); 
			match(input,T_TRIGGER,FOLLOW_T_TRIGGER_in_createTriggerStatement2592); 
			trigger_name=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_createTriggerStatement2596); 
			match(input,T_ON,FOLLOW_T_ON_in_createTriggerStatement2603); 
			table_name=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_createTriggerStatement2612); 
			match(input,T_USING,FOLLOW_T_USING_in_createTriggerStatement2618); 
			class_name=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_createTriggerStatement2622); 
			crtrst = new CreateTriggerStatement((trigger_name!=null?trigger_name.getText():null),(table_name!=null?table_name.getText():null),(class_name!=null?class_name.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return crtrst;
	}
	// $ANTLR end "createTriggerStatement"



	// $ANTLR start "createTableStatement"
	// Meta.g:348:1: createTableStatement returns [CreateTableStatement crtast] : T_CREATE T_TABLE ( T_IF T_NOT T_EXISTS )? name_table= getTableID '(' (ident_column1= ( T_IDENT | T_KEY ) type1= getDataType ( T_PRIMARY T_KEY )? ( ( ',' ident_columN= ( T_IDENT | T_KEY ) typeN= getDataType ( T_PRIMARY T_KEY )? ) | ( ',' T_PRIMARY T_KEY '(' ( (primaryK= ( T_IDENT | T_KEY ) ( ',' partitionKN= ( T_IDENT | T_KEY ) )* ) | ( '(' partitionK= ( T_IDENT | T_KEY ) ( ',' partitionKN= ( T_IDENT | T_KEY ) )* ')' ( ',' clusterKN= ( T_IDENT | T_KEY ) )* ) ) ')' ) )* ) ')' ( T_WITH properties= getMetaProperties )? ;
	public final CreateTableStatement createTableStatement() throws RecognitionException {
		CreateTableStatement crtast = null;


		Token ident_column1=null;
		Token ident_columN=null;
		Token primaryK=null;
		Token partitionKN=null;
		Token partitionK=null;
		Token clusterKN=null;
		String name_table =null;
		String type1 =null;
		String typeN =null;
		List<MetaProperty> properties =null;


		    LinkedHashMap<String, String> columns = new LinkedHashMap<>();
		    List<String>   primaryKey = new ArrayList<String>();
		    List<String> clusterKey = new ArrayList<String>();
		    LinkedHashMap<String, ValueProperty> propierties = new LinkedHashMap<>();
		    int Type_Primary_Key= 0;
		    int columnNumberPK= 0;
		    int columnNumberPK_inter= 0;
		    boolean ifNotExists_2 = false;
		    boolean withClusterKey = false;
		    boolean withPropierties = false;
		    
		try {
			// Meta.g:360:6: ( T_CREATE T_TABLE ( T_IF T_NOT T_EXISTS )? name_table= getTableID '(' (ident_column1= ( T_IDENT | T_KEY ) type1= getDataType ( T_PRIMARY T_KEY )? ( ( ',' ident_columN= ( T_IDENT | T_KEY ) typeN= getDataType ( T_PRIMARY T_KEY )? ) | ( ',' T_PRIMARY T_KEY '(' ( (primaryK= ( T_IDENT | T_KEY ) ( ',' partitionKN= ( T_IDENT | T_KEY ) )* ) | ( '(' partitionK= ( T_IDENT | T_KEY ) ( ',' partitionKN= ( T_IDENT | T_KEY ) )* ')' ( ',' clusterKN= ( T_IDENT | T_KEY ) )* ) ) ')' ) )* ) ')' ( T_WITH properties= getMetaProperties )? )
			// Meta.g:361:5: T_CREATE T_TABLE ( T_IF T_NOT T_EXISTS )? name_table= getTableID '(' (ident_column1= ( T_IDENT | T_KEY ) type1= getDataType ( T_PRIMARY T_KEY )? ( ( ',' ident_columN= ( T_IDENT | T_KEY ) typeN= getDataType ( T_PRIMARY T_KEY )? ) | ( ',' T_PRIMARY T_KEY '(' ( (primaryK= ( T_IDENT | T_KEY ) ( ',' partitionKN= ( T_IDENT | T_KEY ) )* ) | ( '(' partitionK= ( T_IDENT | T_KEY ) ( ',' partitionKN= ( T_IDENT | T_KEY ) )* ')' ( ',' clusterKN= ( T_IDENT | T_KEY ) )* ) ) ')' ) )* ) ')' ( T_WITH properties= getMetaProperties )?
			{
			match(input,T_CREATE,FOLLOW_T_CREATE_in_createTableStatement2661); 
			match(input,T_TABLE,FOLLOW_T_TABLE_in_createTableStatement2667); 
			// Meta.g:363:5: ( T_IF T_NOT T_EXISTS )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==T_IF) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// Meta.g:363:6: T_IF T_NOT T_EXISTS
					{
					match(input,T_IF,FOLLOW_T_IF_in_createTableStatement2674); 
					match(input,T_NOT,FOLLOW_T_NOT_in_createTableStatement2676); 
					match(input,T_EXISTS,FOLLOW_T_EXISTS_in_createTableStatement2678); 
					ifNotExists_2 = true;
					}
					break;

			}

			pushFollow(FOLLOW_getTableID_in_createTableStatement2691);
			name_table=getTableID();
			state._fsp--;

			match(input,T_START_PARENTHESIS,FOLLOW_T_START_PARENTHESIS_in_createTableStatement2697); 
			// Meta.g:365:9: (ident_column1= ( T_IDENT | T_KEY ) type1= getDataType ( T_PRIMARY T_KEY )? ( ( ',' ident_columN= ( T_IDENT | T_KEY ) typeN= getDataType ( T_PRIMARY T_KEY )? ) | ( ',' T_PRIMARY T_KEY '(' ( (primaryK= ( T_IDENT | T_KEY ) ( ',' partitionKN= ( T_IDENT | T_KEY ) )* ) | ( '(' partitionK= ( T_IDENT | T_KEY ) ( ',' partitionKN= ( T_IDENT | T_KEY ) )* ')' ( ',' clusterKN= ( T_IDENT | T_KEY ) )* ) ) ')' ) )* )
			// Meta.g:366:17: ident_column1= ( T_IDENT | T_KEY ) type1= getDataType ( T_PRIMARY T_KEY )? ( ( ',' ident_columN= ( T_IDENT | T_KEY ) typeN= getDataType ( T_PRIMARY T_KEY )? ) | ( ',' T_PRIMARY T_KEY '(' ( (primaryK= ( T_IDENT | T_KEY ) ( ',' partitionKN= ( T_IDENT | T_KEY ) )* ) | ( '(' partitionK= ( T_IDENT | T_KEY ) ( ',' partitionKN= ( T_IDENT | T_KEY ) )* ')' ( ',' clusterKN= ( T_IDENT | T_KEY ) )* ) ) ')' ) )*
			{
			ident_column1=input.LT(1);
			if ( input.LA(1)==T_IDENT||input.LA(1)==T_KEY ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_getDataType_in_createTableStatement2741);
			type1=getDataType();
			state._fsp--;

			// Meta.g:366:67: ( T_PRIMARY T_KEY )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==T_PRIMARY) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// Meta.g:366:68: T_PRIMARY T_KEY
					{
					match(input,T_PRIMARY,FOLLOW_T_PRIMARY_in_createTableStatement2744); 
					match(input,T_KEY,FOLLOW_T_KEY_in_createTableStatement2746); 
					}
					break;

			}

			columns.put((ident_column1!=null?ident_column1.getText():null),type1); Type_Primary_Key=1;
			// Meta.g:367:17: ( ( ',' ident_columN= ( T_IDENT | T_KEY ) typeN= getDataType ( T_PRIMARY T_KEY )? ) | ( ',' T_PRIMARY T_KEY '(' ( (primaryK= ( T_IDENT | T_KEY ) ( ',' partitionKN= ( T_IDENT | T_KEY ) )* ) | ( '(' partitionK= ( T_IDENT | T_KEY ) ( ',' partitionKN= ( T_IDENT | T_KEY ) )* ')' ( ',' clusterKN= ( T_IDENT | T_KEY ) )* ) ) ')' ) )*
			loop23:
			while (true) {
				int alt23=3;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==T_COMMA) ) {
					int LA23_2 = input.LA(2);
					if ( (LA23_2==T_IDENT||LA23_2==T_KEY) ) {
						alt23=1;
					}
					else if ( (LA23_2==T_PRIMARY) ) {
						alt23=2;
					}

				}

				switch (alt23) {
				case 1 :
					// Meta.g:368:21: ( ',' ident_columN= ( T_IDENT | T_KEY ) typeN= getDataType ( T_PRIMARY T_KEY )? )
					{
					// Meta.g:368:21: ( ',' ident_columN= ( T_IDENT | T_KEY ) typeN= getDataType ( T_PRIMARY T_KEY )? )
					// Meta.g:368:23: ',' ident_columN= ( T_IDENT | T_KEY ) typeN= getDataType ( T_PRIMARY T_KEY )?
					{
					match(input,T_COMMA,FOLLOW_T_COMMA_in_createTableStatement2795); 
					ident_columN=input.LT(1);
					if ( input.LA(1)==T_IDENT||input.LA(1)==T_KEY ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_getDataType_in_createTableStatement2809);
					typeN=getDataType();
					state._fsp--;

					// Meta.g:368:76: ( T_PRIMARY T_KEY )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==T_PRIMARY) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// Meta.g:368:77: T_PRIMARY T_KEY
							{
							match(input,T_PRIMARY,FOLLOW_T_PRIMARY_in_createTableStatement2812); 
							match(input,T_KEY,FOLLOW_T_KEY_in_createTableStatement2814); 
							Type_Primary_Key=2;columnNumberPK=columnNumberPK_inter +1;
							}
							break;

					}

					columns.put((ident_columN!=null?ident_columN.getText():null),typeN);columnNumberPK_inter+=1;
					}

					}
					break;
				case 2 :
					// Meta.g:369:22: ( ',' T_PRIMARY T_KEY '(' ( (primaryK= ( T_IDENT | T_KEY ) ( ',' partitionKN= ( T_IDENT | T_KEY ) )* ) | ( '(' partitionK= ( T_IDENT | T_KEY ) ( ',' partitionKN= ( T_IDENT | T_KEY ) )* ')' ( ',' clusterKN= ( T_IDENT | T_KEY ) )* ) ) ')' )
					{
					// Meta.g:369:22: ( ',' T_PRIMARY T_KEY '(' ( (primaryK= ( T_IDENT | T_KEY ) ( ',' partitionKN= ( T_IDENT | T_KEY ) )* ) | ( '(' partitionK= ( T_IDENT | T_KEY ) ( ',' partitionKN= ( T_IDENT | T_KEY ) )* ')' ( ',' clusterKN= ( T_IDENT | T_KEY ) )* ) ) ')' )
					// Meta.g:370:25: ',' T_PRIMARY T_KEY '(' ( (primaryK= ( T_IDENT | T_KEY ) ( ',' partitionKN= ( T_IDENT | T_KEY ) )* ) | ( '(' partitionK= ( T_IDENT | T_KEY ) ( ',' partitionKN= ( T_IDENT | T_KEY ) )* ')' ( ',' clusterKN= ( T_IDENT | T_KEY ) )* ) ) ')'
					{
					match(input,T_COMMA,FOLLOW_T_COMMA_in_createTableStatement2872); 
					match(input,T_PRIMARY,FOLLOW_T_PRIMARY_in_createTableStatement2874); 
					match(input,T_KEY,FOLLOW_T_KEY_in_createTableStatement2876); 
					match(input,T_START_PARENTHESIS,FOLLOW_T_START_PARENTHESIS_in_createTableStatement2878); 
					// Meta.g:371:25: ( (primaryK= ( T_IDENT | T_KEY ) ( ',' partitionKN= ( T_IDENT | T_KEY ) )* ) | ( '(' partitionK= ( T_IDENT | T_KEY ) ( ',' partitionKN= ( T_IDENT | T_KEY ) )* ')' ( ',' clusterKN= ( T_IDENT | T_KEY ) )* ) )
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==T_IDENT||LA22_0==T_KEY) ) {
						alt22=1;
					}
					else if ( (LA22_0==T_START_PARENTHESIS) ) {
						alt22=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 22, 0, input);
						throw nvae;
					}

					switch (alt22) {
						case 1 :
							// Meta.g:372:29: (primaryK= ( T_IDENT | T_KEY ) ( ',' partitionKN= ( T_IDENT | T_KEY ) )* )
							{
							// Meta.g:372:29: (primaryK= ( T_IDENT | T_KEY ) ( ',' partitionKN= ( T_IDENT | T_KEY ) )* )
							// Meta.g:372:33: primaryK= ( T_IDENT | T_KEY ) ( ',' partitionKN= ( T_IDENT | T_KEY ) )*
							{
							primaryK=input.LT(1);
							if ( input.LA(1)==T_IDENT||input.LA(1)==T_KEY ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							primaryKey.add((primaryK!=null?primaryK.getText():null));Type_Primary_Key=3;
							// Meta.g:374:33: ( ',' partitionKN= ( T_IDENT | T_KEY ) )*
							loop19:
							while (true) {
								int alt19=2;
								int LA19_0 = input.LA(1);
								if ( (LA19_0==T_COMMA) ) {
									alt19=1;
								}

								switch (alt19) {
								case 1 :
									// Meta.g:374:34: ',' partitionKN= ( T_IDENT | T_KEY )
									{
									match(input,T_COMMA,FOLLOW_T_COMMA_in_createTableStatement3011); 
									partitionKN=input.LT(1);
									if ( input.LA(1)==T_IDENT||input.LA(1)==T_KEY ) {
										input.consume();
										state.errorRecovery=false;
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										throw mse;
									}
									primaryKey.add((partitionKN!=null?partitionKN.getText():null));
									}
									break;

								default :
									break loop19;
								}
							}

							}

							}
							break;
						case 2 :
							// Meta.g:376:30: ( '(' partitionK= ( T_IDENT | T_KEY ) ( ',' partitionKN= ( T_IDENT | T_KEY ) )* ')' ( ',' clusterKN= ( T_IDENT | T_KEY ) )* )
							{
							// Meta.g:376:30: ( '(' partitionK= ( T_IDENT | T_KEY ) ( ',' partitionKN= ( T_IDENT | T_KEY ) )* ')' ( ',' clusterKN= ( T_IDENT | T_KEY ) )* )
							// Meta.g:377:33: '(' partitionK= ( T_IDENT | T_KEY ) ( ',' partitionKN= ( T_IDENT | T_KEY ) )* ')' ( ',' clusterKN= ( T_IDENT | T_KEY ) )*
							{
							match(input,T_START_PARENTHESIS,FOLLOW_T_START_PARENTHESIS_in_createTableStatement3119); 
							partitionK=input.LT(1);
							if ( input.LA(1)==T_IDENT||input.LA(1)==T_KEY ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							primaryKey.add((partitionK!=null?partitionK.getText():null));Type_Primary_Key=4;
							// Meta.g:378:37: ( ',' partitionKN= ( T_IDENT | T_KEY ) )*
							loop20:
							while (true) {
								int alt20=2;
								int LA20_0 = input.LA(1);
								if ( (LA20_0==T_COMMA) ) {
									alt20=1;
								}

								switch (alt20) {
								case 1 :
									// Meta.g:378:38: ',' partitionKN= ( T_IDENT | T_KEY )
									{
									match(input,T_COMMA,FOLLOW_T_COMMA_in_createTableStatement3170); 
									partitionKN=input.LT(1);
									if ( input.LA(1)==T_IDENT||input.LA(1)==T_KEY ) {
										input.consume();
										state.errorRecovery=false;
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										throw mse;
									}
									primaryKey.add((partitionKN!=null?partitionKN.getText():null));
									}
									break;

								default :
									break loop20;
								}
							}

							match(input,T_END_PARENTHESIS,FOLLOW_T_END_PARENTHESIS_in_createTableStatement3217); 
							// Meta.g:380:33: ( ',' clusterKN= ( T_IDENT | T_KEY ) )*
							loop21:
							while (true) {
								int alt21=2;
								int LA21_0 = input.LA(1);
								if ( (LA21_0==T_COMMA) ) {
									alt21=1;
								}

								switch (alt21) {
								case 1 :
									// Meta.g:380:34: ',' clusterKN= ( T_IDENT | T_KEY )
									{
									match(input,T_COMMA,FOLLOW_T_COMMA_in_createTableStatement3253); 
									clusterKN=input.LT(1);
									if ( input.LA(1)==T_IDENT||input.LA(1)==T_KEY ) {
										input.consume();
										state.errorRecovery=false;
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										throw mse;
									}
									clusterKey.add((clusterKN!=null?clusterKN.getText():null));withClusterKey=true;
									}
									break;

								default :
									break loop21;
								}
							}

							}

							}
							break;

					}

					match(input,T_END_PARENTHESIS,FOLLOW_T_END_PARENTHESIS_in_createTableStatement3349); 
					}

					}
					break;

				default :
					break loop23;
				}
			}

			}

			match(input,T_END_PARENTHESIS,FOLLOW_T_END_PARENTHESIS_in_createTableStatement3421); 
			// Meta.g:388:9: ( T_WITH properties= getMetaProperties )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==T_WITH) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// Meta.g:388:10: T_WITH properties= getMetaProperties
					{
					match(input,T_WITH,FOLLOW_T_WITH_in_createTableStatement3424); 
					withPropierties=true;
					pushFollow(FOLLOW_getMetaProperties_in_createTableStatement3430);
					properties=getMetaProperties();
					state._fsp--;

					}
					break;

			}

			crtast = new CreateTableStatement(name_table,columns,primaryKey,clusterKey,properties,Type_Primary_Key,ifNotExists_2,withClusterKey,columnNumberPK,withPropierties);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return crtast;
	}
	// $ANTLR end "createTableStatement"



	// $ANTLR start "alterTableStatement"
	// Meta.g:394:1: alterTableStatement returns [AlterTableStatement altast] : T_ALTER T_TABLE name_table= getTableID ( T_ALTER column= T_IDENT T_TYPE type= T_IDENT | T_ADD column= T_IDENT type= T_IDENT | T_DROP column= T_IDENT | T_WITH identProp1= T_IDENT T_EQUAL valueProp1= getValueProperty ( T_AND identPropN= T_IDENT T_EQUAL valuePropN= getValueProperty )* ) ;
	public final AlterTableStatement alterTableStatement() throws RecognitionException {
		AlterTableStatement altast = null;


		Token column=null;
		Token type=null;
		Token identProp1=null;
		Token identPropN=null;
		String name_table =null;
		ValueProperty valueProp1 =null;
		ValueProperty valuePropN =null;


		        LinkedHashMap<String, ValueProperty> option = new LinkedHashMap<>();
		        int prop= 0;
		    
		try {
			// Meta.g:398:6: ( T_ALTER T_TABLE name_table= getTableID ( T_ALTER column= T_IDENT T_TYPE type= T_IDENT | T_ADD column= T_IDENT type= T_IDENT | T_DROP column= T_IDENT | T_WITH identProp1= T_IDENT T_EQUAL valueProp1= getValueProperty ( T_AND identPropN= T_IDENT T_EQUAL valuePropN= getValueProperty )* ) )
			// Meta.g:399:5: T_ALTER T_TABLE name_table= getTableID ( T_ALTER column= T_IDENT T_TYPE type= T_IDENT | T_ADD column= T_IDENT type= T_IDENT | T_DROP column= T_IDENT | T_WITH identProp1= T_IDENT T_EQUAL valueProp1= getValueProperty ( T_AND identPropN= T_IDENT T_EQUAL valuePropN= getValueProperty )* )
			{
			match(input,T_ALTER,FOLLOW_T_ALTER_in_alterTableStatement3493); 
			match(input,T_TABLE,FOLLOW_T_TABLE_in_alterTableStatement3499); 
			pushFollow(FOLLOW_getTableID_in_alterTableStatement3507);
			name_table=getTableID();
			state._fsp--;

			// Meta.g:402:5: ( T_ALTER column= T_IDENT T_TYPE type= T_IDENT | T_ADD column= T_IDENT type= T_IDENT | T_DROP column= T_IDENT | T_WITH identProp1= T_IDENT T_EQUAL valueProp1= getValueProperty ( T_AND identPropN= T_IDENT T_EQUAL valuePropN= getValueProperty )* )
			int alt26=4;
			switch ( input.LA(1) ) {
			case T_ALTER:
				{
				alt26=1;
				}
				break;
			case T_ADD:
				{
				alt26=2;
				}
				break;
			case T_DROP:
				{
				alt26=3;
				}
				break;
			case T_WITH:
				{
				alt26=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// Meta.g:402:6: T_ALTER column= T_IDENT T_TYPE type= T_IDENT
					{
					match(input,T_ALTER,FOLLOW_T_ALTER_in_alterTableStatement3514); 
					column=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_alterTableStatement3518); 
					match(input,T_TYPE,FOLLOW_T_TYPE_in_alterTableStatement3520); 
					type=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_alterTableStatement3524); 
					prop=1;
					}
					break;
				case 2 :
					// Meta.g:403:10: T_ADD column= T_IDENT type= T_IDENT
					{
					match(input,T_ADD,FOLLOW_T_ADD_in_alterTableStatement3537); 
					column=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_alterTableStatement3541); 
					type=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_alterTableStatement3545); 
					prop=2;
					}
					break;
				case 3 :
					// Meta.g:404:10: T_DROP column= T_IDENT
					{
					match(input,T_DROP,FOLLOW_T_DROP_in_alterTableStatement3558); 
					column=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_alterTableStatement3562); 
					prop=3;
					}
					break;
				case 4 :
					// Meta.g:405:10: T_WITH identProp1= T_IDENT T_EQUAL valueProp1= getValueProperty ( T_AND identPropN= T_IDENT T_EQUAL valuePropN= getValueProperty )*
					{
					match(input,T_WITH,FOLLOW_T_WITH_in_alterTableStatement3575); 
					identProp1=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_alterTableStatement3592); 
					match(input,T_EQUAL,FOLLOW_T_EQUAL_in_alterTableStatement3594); 
					pushFollow(FOLLOW_getValueProperty_in_alterTableStatement3598);
					valueProp1=getValueProperty();
					state._fsp--;

					option.put((identProp1!=null?identProp1.getText():null), valueProp1);
					// Meta.g:407:13: ( T_AND identPropN= T_IDENT T_EQUAL valuePropN= getValueProperty )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==T_AND) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// Meta.g:407:14: T_AND identPropN= T_IDENT T_EQUAL valuePropN= getValueProperty
							{
							match(input,T_AND,FOLLOW_T_AND_in_alterTableStatement3615); 
							identPropN=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_alterTableStatement3619); 
							match(input,T_EQUAL,FOLLOW_T_EQUAL_in_alterTableStatement3621); 
							pushFollow(FOLLOW_getValueProperty_in_alterTableStatement3625);
							valuePropN=getValueProperty();
							state._fsp--;

							option.put((identPropN!=null?identPropN.getText():null), valuePropN);
							}
							break;

						default :
							break loop25;
						}
					}

					prop=4;
					}
					break;

			}

			altast = new AlterTableStatement(name_table, (column!=null?column.getText():null), (type!=null?type.getText():null), option, prop);  
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return altast;
	}
	// $ANTLR end "alterTableStatement"



	// $ANTLR start "selectStatement"
	// Meta.g:413:1: selectStatement returns [SelectStatement slctst] : T_SELECT selClause= getSelectClause T_FROM tablename= getTableID ( T_WITH T_WINDOW window= getWindow )? ( T_INNER T_JOIN identJoin= getTableID T_ON fields= getFields )? ( T_WHERE whereClauses= getWhereClauses )? ( T_ORDER T_BY ordering= getOrdering )? ( T_GROUP T_BY groupby= getList )? ( T_LIMIT constant= T_CONSTANT )? ( T_DISABLE T_ANALYTICS )? ;
	public final SelectStatement selectStatement() throws RecognitionException {
		SelectStatement slctst = null;


		Token constant=null;
		SelectionClause selClause =null;
		String tablename =null;
		WindowSelect window =null;
		String identJoin =null;
		Map<String, String> fields =null;
		List<MetaRelation> whereClauses =null;
		List<MetaOrdering> ordering =null;
		List groupby =null;


		        boolean windowInc = false;
		        boolean joinInc = false;
		        boolean whereInc = false;
		        boolean orderInc = false;
		        boolean groupInc = false;
		        boolean limitInc = false;
		        boolean disable = false;
		    
		try {
			// Meta.g:422:6: ( T_SELECT selClause= getSelectClause T_FROM tablename= getTableID ( T_WITH T_WINDOW window= getWindow )? ( T_INNER T_JOIN identJoin= getTableID T_ON fields= getFields )? ( T_WHERE whereClauses= getWhereClauses )? ( T_ORDER T_BY ordering= getOrdering )? ( T_GROUP T_BY groupby= getList )? ( T_LIMIT constant= T_CONSTANT )? ( T_DISABLE T_ANALYTICS )? )
			// Meta.g:423:5: T_SELECT selClause= getSelectClause T_FROM tablename= getTableID ( T_WITH T_WINDOW window= getWindow )? ( T_INNER T_JOIN identJoin= getTableID T_ON fields= getFields )? ( T_WHERE whereClauses= getWhereClauses )? ( T_ORDER T_BY ordering= getOrdering )? ( T_GROUP T_BY groupby= getList )? ( T_LIMIT constant= T_CONSTANT )? ( T_DISABLE T_ANALYTICS )?
			{
			match(input,T_SELECT,FOLLOW_T_SELECT_in_selectStatement3680); 
			pushFollow(FOLLOW_getSelectClause_in_selectStatement3684);
			selClause=getSelectClause();
			state._fsp--;

			match(input,T_FROM,FOLLOW_T_FROM_in_selectStatement3686); 
			pushFollow(FOLLOW_getTableID_in_selectStatement3690);
			tablename=getTableID();
			state._fsp--;

			// Meta.g:424:5: ( T_WITH T_WINDOW window= getWindow )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==T_WITH) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// Meta.g:424:6: T_WITH T_WINDOW window= getWindow
					{
					match(input,T_WITH,FOLLOW_T_WITH_in_selectStatement3698); 
					match(input,T_WINDOW,FOLLOW_T_WINDOW_in_selectStatement3700); 
					windowInc = true;
					pushFollow(FOLLOW_getWindow_in_selectStatement3706);
					window=getWindow();
					state._fsp--;

					}
					break;

			}

			// Meta.g:425:5: ( T_INNER T_JOIN identJoin= getTableID T_ON fields= getFields )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==T_INNER) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// Meta.g:425:6: T_INNER T_JOIN identJoin= getTableID T_ON fields= getFields
					{
					match(input,T_INNER,FOLLOW_T_INNER_in_selectStatement3719); 
					match(input,T_JOIN,FOLLOW_T_JOIN_in_selectStatement3721); 
					 joinInc = true;
					pushFollow(FOLLOW_getTableID_in_selectStatement3727);
					identJoin=getTableID();
					state._fsp--;

					match(input,T_ON,FOLLOW_T_ON_in_selectStatement3729); 
					pushFollow(FOLLOW_getFields_in_selectStatement3733);
					fields=getFields();
					state._fsp--;

					}
					break;

			}

			// Meta.g:426:5: ( T_WHERE whereClauses= getWhereClauses )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==T_WHERE) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// Meta.g:426:6: T_WHERE whereClauses= getWhereClauses
					{
					match(input,T_WHERE,FOLLOW_T_WHERE_in_selectStatement3742); 
					whereInc = true;
					pushFollow(FOLLOW_getWhereClauses_in_selectStatement3748);
					whereClauses=getWhereClauses();
					state._fsp--;

					}
					break;

			}

			// Meta.g:427:5: ( T_ORDER T_BY ordering= getOrdering )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==T_ORDER) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// Meta.g:427:6: T_ORDER T_BY ordering= getOrdering
					{
					match(input,T_ORDER,FOLLOW_T_ORDER_in_selectStatement3757); 
					match(input,T_BY,FOLLOW_T_BY_in_selectStatement3759); 
					orderInc = true;
					pushFollow(FOLLOW_getOrdering_in_selectStatement3765);
					ordering=getOrdering();
					state._fsp--;

					}
					break;

			}

			// Meta.g:428:5: ( T_GROUP T_BY groupby= getList )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==T_GROUP) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// Meta.g:428:6: T_GROUP T_BY groupby= getList
					{
					match(input,T_GROUP,FOLLOW_T_GROUP_in_selectStatement3774); 
					match(input,T_BY,FOLLOW_T_BY_in_selectStatement3776); 
					groupInc = true;
					pushFollow(FOLLOW_getList_in_selectStatement3782);
					groupby=getList();
					state._fsp--;

					}
					break;

			}

			// Meta.g:429:5: ( T_LIMIT constant= T_CONSTANT )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==T_LIMIT) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// Meta.g:429:6: T_LIMIT constant= T_CONSTANT
					{
					match(input,T_LIMIT,FOLLOW_T_LIMIT_in_selectStatement3791); 
					limitInc = true;
					constant=(Token)match(input,T_CONSTANT,FOLLOW_T_CONSTANT_in_selectStatement3797); 
					}
					break;

			}

			// Meta.g:430:5: ( T_DISABLE T_ANALYTICS )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==T_DISABLE) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// Meta.g:430:6: T_DISABLE T_ANALYTICS
					{
					match(input,T_DISABLE,FOLLOW_T_DISABLE_in_selectStatement3806); 
					match(input,T_ANALYTICS,FOLLOW_T_ANALYTICS_in_selectStatement3808); 
					disable = true;
					}
					break;

			}


			        slctst = new SelectStatement(selClause, tablename);        
			        if(windowInc)
			            slctst.setWindow(window);
			        if(joinInc)
			            slctst.setJoin(new InnerJoin(identJoin, fields)); 
			        if(whereInc)
			             slctst.setWhere(whereClauses); 
			        if(orderInc)
			             slctst.setOrder(ordering);
			        if(groupInc)
			            slctst.setGroup(new GroupBy(groupby)); 
			        if(limitInc)
			            slctst.setLimit(Integer.parseInt((constant!=null?constant.getText():null)));
			        if(disable)
			            slctst.setDisableAnalytics(true);
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return slctst;
	}
	// $ANTLR end "selectStatement"



	// $ANTLR start "insertIntoStatement"
	// Meta.g:449:1: insertIntoStatement returns [InsertIntoStatement nsntst] : T_INSERT T_INTO tableName= getTableID T_START_PARENTHESIS ident1= T_IDENT ( T_COMMA identN= T_IDENT )* T_END_PARENTHESIS (selectStmnt= selectStatement | T_VALUES T_START_PARENTHESIS term1= getTermOrLiteral ( T_COMMA termN= getTermOrLiteral )* T_END_PARENTHESIS ) ( T_IF T_NOT T_EXISTS )? ( T_USING opt1= getOption ( T_AND optN= getOption )* )? ;
	public final InsertIntoStatement insertIntoStatement() throws RecognitionException {
		InsertIntoStatement nsntst = null;


		Token ident1=null;
		Token identN=null;
		String tableName =null;
		SelectStatement selectStmnt =null;
		ValueCell term1 =null;
		ValueCell termN =null;
		Option opt1 =null;
		Option optN =null;


		        List<String> ids = new ArrayList<>();
		        boolean ifNotExists = false;
		        int typeValues = InsertIntoStatement.TYPE_VALUES_CLAUSE;
		        List<ValueCell> cellValues = new ArrayList<>();
		        boolean optsInc = false;
		        List<Option> options = new ArrayList<>();
		    
		try {
			// Meta.g:457:6: ( T_INSERT T_INTO tableName= getTableID T_START_PARENTHESIS ident1= T_IDENT ( T_COMMA identN= T_IDENT )* T_END_PARENTHESIS (selectStmnt= selectStatement | T_VALUES T_START_PARENTHESIS term1= getTermOrLiteral ( T_COMMA termN= getTermOrLiteral )* T_END_PARENTHESIS ) ( T_IF T_NOT T_EXISTS )? ( T_USING opt1= getOption ( T_AND optN= getOption )* )? )
			// Meta.g:458:5: T_INSERT T_INTO tableName= getTableID T_START_PARENTHESIS ident1= T_IDENT ( T_COMMA identN= T_IDENT )* T_END_PARENTHESIS (selectStmnt= selectStatement | T_VALUES T_START_PARENTHESIS term1= getTermOrLiteral ( T_COMMA termN= getTermOrLiteral )* T_END_PARENTHESIS ) ( T_IF T_NOT T_EXISTS )? ( T_USING opt1= getOption ( T_AND optN= getOption )* )?
			{
			match(input,T_INSERT,FOLLOW_T_INSERT_in_insertIntoStatement3841); 
			match(input,T_INTO,FOLLOW_T_INTO_in_insertIntoStatement3848); 
			pushFollow(FOLLOW_getTableID_in_insertIntoStatement3857);
			tableName=getTableID();
			state._fsp--;

			match(input,T_START_PARENTHESIS,FOLLOW_T_START_PARENTHESIS_in_insertIntoStatement3863); 
			ident1=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_insertIntoStatement3872); 
			ids.add((ident1!=null?ident1.getText():null));
			// Meta.g:463:5: ( T_COMMA identN= T_IDENT )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==T_COMMA) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// Meta.g:463:6: T_COMMA identN= T_IDENT
					{
					match(input,T_COMMA,FOLLOW_T_COMMA_in_insertIntoStatement3882); 
					identN=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_insertIntoStatement3886); 
					ids.add((identN!=null?identN.getText():null));
					}
					break;

				default :
					break loop34;
				}
			}

			match(input,T_END_PARENTHESIS,FOLLOW_T_END_PARENTHESIS_in_insertIntoStatement3897); 
			// Meta.g:465:5: (selectStmnt= selectStatement | T_VALUES T_START_PARENTHESIS term1= getTermOrLiteral ( T_COMMA termN= getTermOrLiteral )* T_END_PARENTHESIS )
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==T_SELECT) ) {
				alt36=1;
			}
			else if ( (LA36_0==T_VALUES) ) {
				alt36=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}

			switch (alt36) {
				case 1 :
					// Meta.g:466:9: selectStmnt= selectStatement
					{
					pushFollow(FOLLOW_selectStatement_in_insertIntoStatement3916);
					selectStmnt=selectStatement();
					state._fsp--;

					typeValues = InsertIntoStatement.TYPE_SELECT_CLAUSE;
					}
					break;
				case 2 :
					// Meta.g:468:9: T_VALUES T_START_PARENTHESIS term1= getTermOrLiteral ( T_COMMA termN= getTermOrLiteral )* T_END_PARENTHESIS
					{
					match(input,T_VALUES,FOLLOW_T_VALUES_in_insertIntoStatement3939); 
					match(input,T_START_PARENTHESIS,FOLLOW_T_START_PARENTHESIS_in_insertIntoStatement3949); 
					pushFollow(FOLLOW_getTermOrLiteral_in_insertIntoStatement3966);
					term1=getTermOrLiteral();
					state._fsp--;

					cellValues.add(term1);
					// Meta.g:471:13: ( T_COMMA termN= getTermOrLiteral )*
					loop35:
					while (true) {
						int alt35=2;
						int LA35_0 = input.LA(1);
						if ( (LA35_0==T_COMMA) ) {
							alt35=1;
						}

						switch (alt35) {
						case 1 :
							// Meta.g:471:14: T_COMMA termN= getTermOrLiteral
							{
							match(input,T_COMMA,FOLLOW_T_COMMA_in_insertIntoStatement3983); 
							pushFollow(FOLLOW_getTermOrLiteral_in_insertIntoStatement3987);
							termN=getTermOrLiteral();
							state._fsp--;

							cellValues.add(termN);
							}
							break;

						default :
							break loop35;
						}
					}

					match(input,T_END_PARENTHESIS,FOLLOW_T_END_PARENTHESIS_in_insertIntoStatement4001); 
					}
					break;

			}

			// Meta.g:474:5: ( T_IF T_NOT T_EXISTS )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==T_IF) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// Meta.g:474:6: T_IF T_NOT T_EXISTS
					{
					match(input,T_IF,FOLLOW_T_IF_in_insertIntoStatement4014); 
					match(input,T_NOT,FOLLOW_T_NOT_in_insertIntoStatement4016); 
					match(input,T_EXISTS,FOLLOW_T_EXISTS_in_insertIntoStatement4018); 
					ifNotExists=true;
					}
					break;

			}

			// Meta.g:475:5: ( T_USING opt1= getOption ( T_AND optN= getOption )* )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==T_USING) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// Meta.g:476:9: T_USING opt1= getOption ( T_AND optN= getOption )*
					{
					match(input,T_USING,FOLLOW_T_USING_in_insertIntoStatement4039); 
					optsInc=true;
					pushFollow(FOLLOW_getOption_in_insertIntoStatement4054);
					opt1=getOption();
					state._fsp--;


					            options.add(opt1);
					        
					// Meta.g:480:9: ( T_AND optN= getOption )*
					loop38:
					while (true) {
						int alt38=2;
						int LA38_0 = input.LA(1);
						if ( (LA38_0==T_AND) ) {
							alt38=1;
						}

						switch (alt38) {
						case 1 :
							// Meta.g:480:10: T_AND optN= getOption
							{
							match(input,T_AND,FOLLOW_T_AND_in_insertIntoStatement4067); 
							pushFollow(FOLLOW_getOption_in_insertIntoStatement4071);
							optN=getOption();
							state._fsp--;

							options.add(optN);
							}
							break;

						default :
							break loop38;
						}
					}

					}
					break;

			}


			        if(typeValues==InsertIntoStatement.TYPE_SELECT_CLAUSE)
			            if(optsInc)
			                nsntst = new InsertIntoStatement(tableName, ids, selectStmnt, ifNotExists, options);
			            else
			                nsntst = new InsertIntoStatement(tableName, ids, selectStmnt, ifNotExists);
			        else
			            if(optsInc)
			                nsntst = new InsertIntoStatement(tableName, ids, cellValues, ifNotExists, options);
			            else
			                nsntst = new InsertIntoStatement(tableName, ids, cellValues, ifNotExists);
			                
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return nsntst;
	}
	// $ANTLR end "insertIntoStatement"



	// $ANTLR start "explainPlanStatement"
	// Meta.g:497:1: explainPlanStatement returns [ExplainPlanStatement xpplst] : T_EXPLAIN T_PLAN T_FOR parsedStmnt= metaStatement ;
	public final ExplainPlanStatement explainPlanStatement() throws RecognitionException {
		ExplainPlanStatement xpplst = null;


		MetaStatement parsedStmnt =null;

		try {
			// Meta.g:497:59: ( T_EXPLAIN T_PLAN T_FOR parsedStmnt= metaStatement )
			// Meta.g:498:5: T_EXPLAIN T_PLAN T_FOR parsedStmnt= metaStatement
			{
			match(input,T_EXPLAIN,FOLLOW_T_EXPLAIN_in_explainPlanStatement4108); 
			match(input,T_PLAN,FOLLOW_T_PLAN_in_explainPlanStatement4110); 
			match(input,T_FOR,FOLLOW_T_FOR_in_explainPlanStatement4112); 
			pushFollow(FOLLOW_metaStatement_in_explainPlanStatement4116);
			parsedStmnt=metaStatement();
			state._fsp--;

			xpplst = new ExplainPlanStatement(parsedStmnt);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return xpplst;
	}
	// $ANTLR end "explainPlanStatement"



	// $ANTLR start "setOptionsStatement"
	// Meta.g:502:1: setOptionsStatement returns [SetOptionsStatement stptst] : T_SET T_OPTIONS ( T_ANALYTICS T_EQUAL ( T_TRUE | T_FALSE ) ( T_AND T_CONSISTENCY T_EQUAL ( T_ALL | T_ANY | T_QUORUM | T_ONE | T_TWO | T_THREE | T_EACH_QUORUM | T_LOCAL_ONE | T_LOCAL_QUORUM ) )? | T_CONSISTENCY T_EQUAL ( T_ALL | T_ANY | T_QUORUM | T_ONE | T_TWO | T_THREE | T_EACH_QUORUM | T_LOCAL_ONE | T_LOCAL_QUORUM ) ( T_AND T_ANALYTICS T_EQUAL ( T_TRUE | T_FALSE ) )? ) ;
	public final SetOptionsStatement setOptionsStatement() throws RecognitionException {
		SetOptionsStatement stptst = null;



		        ArrayList<Boolean> checks = new ArrayList<>();
		        checks.add(false);
		        checks.add(false);
		        boolean analytics = false;
		        Consistency cnstc=Consistency.ALL;
		    
		try {
			// Meta.g:509:6: ( T_SET T_OPTIONS ( T_ANALYTICS T_EQUAL ( T_TRUE | T_FALSE ) ( T_AND T_CONSISTENCY T_EQUAL ( T_ALL | T_ANY | T_QUORUM | T_ONE | T_TWO | T_THREE | T_EACH_QUORUM | T_LOCAL_ONE | T_LOCAL_QUORUM ) )? | T_CONSISTENCY T_EQUAL ( T_ALL | T_ANY | T_QUORUM | T_ONE | T_TWO | T_THREE | T_EACH_QUORUM | T_LOCAL_ONE | T_LOCAL_QUORUM ) ( T_AND T_ANALYTICS T_EQUAL ( T_TRUE | T_FALSE ) )? ) )
			// Meta.g:510:5: T_SET T_OPTIONS ( T_ANALYTICS T_EQUAL ( T_TRUE | T_FALSE ) ( T_AND T_CONSISTENCY T_EQUAL ( T_ALL | T_ANY | T_QUORUM | T_ONE | T_TWO | T_THREE | T_EACH_QUORUM | T_LOCAL_ONE | T_LOCAL_QUORUM ) )? | T_CONSISTENCY T_EQUAL ( T_ALL | T_ANY | T_QUORUM | T_ONE | T_TWO | T_THREE | T_EACH_QUORUM | T_LOCAL_ONE | T_LOCAL_QUORUM ) ( T_AND T_ANALYTICS T_EQUAL ( T_TRUE | T_FALSE ) )? )
			{
			match(input,T_SET,FOLLOW_T_SET_in_setOptionsStatement4150); 
			match(input,T_OPTIONS,FOLLOW_T_OPTIONS_in_setOptionsStatement4152); 
			// Meta.g:510:21: ( T_ANALYTICS T_EQUAL ( T_TRUE | T_FALSE ) ( T_AND T_CONSISTENCY T_EQUAL ( T_ALL | T_ANY | T_QUORUM | T_ONE | T_TWO | T_THREE | T_EACH_QUORUM | T_LOCAL_ONE | T_LOCAL_QUORUM ) )? | T_CONSISTENCY T_EQUAL ( T_ALL | T_ANY | T_QUORUM | T_ONE | T_TWO | T_THREE | T_EACH_QUORUM | T_LOCAL_ONE | T_LOCAL_QUORUM ) ( T_AND T_ANALYTICS T_EQUAL ( T_TRUE | T_FALSE ) )? )
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==T_ANALYTICS) ) {
				alt46=1;
			}
			else if ( (LA46_0==T_CONSISTENCY) ) {
				alt46=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// Meta.g:511:9: T_ANALYTICS T_EQUAL ( T_TRUE | T_FALSE ) ( T_AND T_CONSISTENCY T_EQUAL ( T_ALL | T_ANY | T_QUORUM | T_ONE | T_TWO | T_THREE | T_EACH_QUORUM | T_LOCAL_ONE | T_LOCAL_QUORUM ) )?
					{
					match(input,T_ANALYTICS,FOLLOW_T_ANALYTICS_in_setOptionsStatement4164); 
					match(input,T_EQUAL,FOLLOW_T_EQUAL_in_setOptionsStatement4166); 
					// Meta.g:511:29: ( T_TRUE | T_FALSE )
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==T_TRUE) ) {
						alt40=1;
					}
					else if ( (LA40_0==T_FALSE) ) {
						alt40=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 40, 0, input);
						throw nvae;
					}

					switch (alt40) {
						case 1 :
							// Meta.g:511:30: T_TRUE
							{
							match(input,T_TRUE,FOLLOW_T_TRUE_in_setOptionsStatement4169); 
							analytics=true;
							}
							break;
						case 2 :
							// Meta.g:511:54: T_FALSE
							{
							match(input,T_FALSE,FOLLOW_T_FALSE_in_setOptionsStatement4172); 
							analytics=false;
							}
							break;

					}

					checks.set(0, true);
					// Meta.g:512:9: ( T_AND T_CONSISTENCY T_EQUAL ( T_ALL | T_ANY | T_QUORUM | T_ONE | T_TWO | T_THREE | T_EACH_QUORUM | T_LOCAL_ONE | T_LOCAL_QUORUM ) )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==T_AND) ) {
						alt42=1;
					}
					switch (alt42) {
						case 1 :
							// Meta.g:512:10: T_AND T_CONSISTENCY T_EQUAL ( T_ALL | T_ANY | T_QUORUM | T_ONE | T_TWO | T_THREE | T_EACH_QUORUM | T_LOCAL_ONE | T_LOCAL_QUORUM )
							{
							match(input,T_AND,FOLLOW_T_AND_in_setOptionsStatement4187); 
							match(input,T_CONSISTENCY,FOLLOW_T_CONSISTENCY_in_setOptionsStatement4189); 
							match(input,T_EQUAL,FOLLOW_T_EQUAL_in_setOptionsStatement4191); 
							// Meta.g:513:13: ( T_ALL | T_ANY | T_QUORUM | T_ONE | T_TWO | T_THREE | T_EACH_QUORUM | T_LOCAL_ONE | T_LOCAL_QUORUM )
							int alt41=9;
							switch ( input.LA(1) ) {
							case T_ALL:
								{
								alt41=1;
								}
								break;
							case T_ANY:
								{
								alt41=2;
								}
								break;
							case T_QUORUM:
								{
								alt41=3;
								}
								break;
							case T_ONE:
								{
								alt41=4;
								}
								break;
							case T_TWO:
								{
								alt41=5;
								}
								break;
							case T_THREE:
								{
								alt41=6;
								}
								break;
							case T_EACH_QUORUM:
								{
								alt41=7;
								}
								break;
							case T_LOCAL_ONE:
								{
								alt41=8;
								}
								break;
							case T_LOCAL_QUORUM:
								{
								alt41=9;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 41, 0, input);
								throw nvae;
							}
							switch (alt41) {
								case 1 :
									// Meta.g:513:14: T_ALL
									{
									match(input,T_ALL,FOLLOW_T_ALL_in_setOptionsStatement4206); 
									cnstc=Consistency.ALL;
									}
									break;
								case 2 :
									// Meta.g:514:15: T_ANY
									{
									match(input,T_ANY,FOLLOW_T_ANY_in_setOptionsStatement4225); 
									cnstc=Consistency.ANY;
									}
									break;
								case 3 :
									// Meta.g:515:15: T_QUORUM
									{
									match(input,T_QUORUM,FOLLOW_T_QUORUM_in_setOptionsStatement4243); 
									cnstc=Consistency.QUORUM;
									}
									break;
								case 4 :
									// Meta.g:516:15: T_ONE
									{
									match(input,T_ONE,FOLLOW_T_ONE_in_setOptionsStatement4261); 
									cnstc=Consistency.ONE;
									}
									break;
								case 5 :
									// Meta.g:517:15: T_TWO
									{
									match(input,T_TWO,FOLLOW_T_TWO_in_setOptionsStatement4279); 
									cnstc=Consistency.TWO;
									}
									break;
								case 6 :
									// Meta.g:518:15: T_THREE
									{
									match(input,T_THREE,FOLLOW_T_THREE_in_setOptionsStatement4297); 
									cnstc=Consistency.THREE;
									}
									break;
								case 7 :
									// Meta.g:519:15: T_EACH_QUORUM
									{
									match(input,T_EACH_QUORUM,FOLLOW_T_EACH_QUORUM_in_setOptionsStatement4315); 
									cnstc=Consistency.EACH_QUORUM;
									}
									break;
								case 8 :
									// Meta.g:520:15: T_LOCAL_ONE
									{
									match(input,T_LOCAL_ONE,FOLLOW_T_LOCAL_ONE_in_setOptionsStatement4333); 
									cnstc=Consistency.LOCAL_ONE;
									}
									break;
								case 9 :
									// Meta.g:521:15: T_LOCAL_QUORUM
									{
									match(input,T_LOCAL_QUORUM,FOLLOW_T_LOCAL_QUORUM_in_setOptionsStatement4351); 
									cnstc=Consistency.LOCAL_QUORUM;
									}
									break;

							}

							checks.set(1, true);
							}
							break;

					}

					 stptst = new SetOptionsStatement(analytics, cnstc, checks);
					}
					break;
				case 2 :
					// Meta.g:525:11: T_CONSISTENCY T_EQUAL ( T_ALL | T_ANY | T_QUORUM | T_ONE | T_TWO | T_THREE | T_EACH_QUORUM | T_LOCAL_ONE | T_LOCAL_QUORUM ) ( T_AND T_ANALYTICS T_EQUAL ( T_TRUE | T_FALSE ) )?
					{
					match(input,T_CONSISTENCY,FOLLOW_T_CONSISTENCY_in_setOptionsStatement4401); 
					match(input,T_EQUAL,FOLLOW_T_EQUAL_in_setOptionsStatement4403); 
					// Meta.g:526:13: ( T_ALL | T_ANY | T_QUORUM | T_ONE | T_TWO | T_THREE | T_EACH_QUORUM | T_LOCAL_ONE | T_LOCAL_QUORUM )
					int alt43=9;
					switch ( input.LA(1) ) {
					case T_ALL:
						{
						alt43=1;
						}
						break;
					case T_ANY:
						{
						alt43=2;
						}
						break;
					case T_QUORUM:
						{
						alt43=3;
						}
						break;
					case T_ONE:
						{
						alt43=4;
						}
						break;
					case T_TWO:
						{
						alt43=5;
						}
						break;
					case T_THREE:
						{
						alt43=6;
						}
						break;
					case T_EACH_QUORUM:
						{
						alt43=7;
						}
						break;
					case T_LOCAL_ONE:
						{
						alt43=8;
						}
						break;
					case T_LOCAL_QUORUM:
						{
						alt43=9;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 43, 0, input);
						throw nvae;
					}
					switch (alt43) {
						case 1 :
							// Meta.g:526:14: T_ALL
							{
							match(input,T_ALL,FOLLOW_T_ALL_in_setOptionsStatement4419); 
							cnstc=Consistency.ALL;
							}
							break;
						case 2 :
							// Meta.g:527:15: T_ANY
							{
							match(input,T_ANY,FOLLOW_T_ANY_in_setOptionsStatement4438); 
							cnstc=Consistency.ANY;
							}
							break;
						case 3 :
							// Meta.g:528:15: T_QUORUM
							{
							match(input,T_QUORUM,FOLLOW_T_QUORUM_in_setOptionsStatement4456); 
							cnstc=Consistency.QUORUM;
							}
							break;
						case 4 :
							// Meta.g:529:15: T_ONE
							{
							match(input,T_ONE,FOLLOW_T_ONE_in_setOptionsStatement4474); 
							cnstc=Consistency.ONE;
							}
							break;
						case 5 :
							// Meta.g:530:15: T_TWO
							{
							match(input,T_TWO,FOLLOW_T_TWO_in_setOptionsStatement4492); 
							cnstc=Consistency.TWO;
							}
							break;
						case 6 :
							// Meta.g:531:15: T_THREE
							{
							match(input,T_THREE,FOLLOW_T_THREE_in_setOptionsStatement4510); 
							cnstc=Consistency.THREE;
							}
							break;
						case 7 :
							// Meta.g:532:15: T_EACH_QUORUM
							{
							match(input,T_EACH_QUORUM,FOLLOW_T_EACH_QUORUM_in_setOptionsStatement4528); 
							cnstc=Consistency.EACH_QUORUM;
							}
							break;
						case 8 :
							// Meta.g:533:15: T_LOCAL_ONE
							{
							match(input,T_LOCAL_ONE,FOLLOW_T_LOCAL_ONE_in_setOptionsStatement4546); 
							cnstc=Consistency.LOCAL_ONE;
							}
							break;
						case 9 :
							// Meta.g:534:15: T_LOCAL_QUORUM
							{
							match(input,T_LOCAL_QUORUM,FOLLOW_T_LOCAL_QUORUM_in_setOptionsStatement4564); 
							cnstc=Consistency.LOCAL_QUORUM;
							}
							break;

					}

					checks.set(1, true);
					// Meta.g:536:9: ( T_AND T_ANALYTICS T_EQUAL ( T_TRUE | T_FALSE ) )?
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==T_AND) ) {
						alt45=1;
					}
					switch (alt45) {
						case 1 :
							// Meta.g:536:10: T_AND T_ANALYTICS T_EQUAL ( T_TRUE | T_FALSE )
							{
							match(input,T_AND,FOLLOW_T_AND_in_setOptionsStatement4592); 
							match(input,T_ANALYTICS,FOLLOW_T_ANALYTICS_in_setOptionsStatement4594); 
							match(input,T_EQUAL,FOLLOW_T_EQUAL_in_setOptionsStatement4596); 
							// Meta.g:536:36: ( T_TRUE | T_FALSE )
							int alt44=2;
							int LA44_0 = input.LA(1);
							if ( (LA44_0==T_TRUE) ) {
								alt44=1;
							}
							else if ( (LA44_0==T_FALSE) ) {
								alt44=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 44, 0, input);
								throw nvae;
							}

							switch (alt44) {
								case 1 :
									// Meta.g:536:37: T_TRUE
									{
									match(input,T_TRUE,FOLLOW_T_TRUE_in_setOptionsStatement4599); 
									analytics=true;
									}
									break;
								case 2 :
									// Meta.g:536:61: T_FALSE
									{
									match(input,T_FALSE,FOLLOW_T_FALSE_in_setOptionsStatement4602); 
									analytics=false;
									}
									break;

							}

							checks.set(0, true);
							}
							break;

					}

					 stptst = new SetOptionsStatement(analytics, cnstc, checks);
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stptst;
	}
	// $ANTLR end "setOptionsStatement"



	// $ANTLR start "useStatement"
	// Meta.g:541:1: useStatement returns [UseStatement usst] : T_USE iden= T_IDENT ;
	public final UseStatement useStatement() throws RecognitionException {
		UseStatement usst = null;


		Token iden=null;

		try {
			// Meta.g:541:41: ( T_USE iden= T_IDENT )
			// Meta.g:542:5: T_USE iden= T_IDENT
			{
			match(input,T_USE,FOLLOW_T_USE_in_useStatement4652); 
			iden=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_useStatement4660); 
			usst = new UseStatement((iden!=null?iden.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return usst;
	}
	// $ANTLR end "useStatement"



	// $ANTLR start "dropKeyspaceStatement"
	// Meta.g:545:1: dropKeyspaceStatement returns [DropKeyspaceStatement drksst] : T_DROP T_KEYSPACE ( T_IF T_EXISTS )? iden= T_IDENT ;
	public final DropKeyspaceStatement dropKeyspaceStatement() throws RecognitionException {
		DropKeyspaceStatement drksst = null;


		Token iden=null;


		        boolean ifExists = false;
		    
		try {
			// Meta.g:548:6: ( T_DROP T_KEYSPACE ( T_IF T_EXISTS )? iden= T_IDENT )
			// Meta.g:549:5: T_DROP T_KEYSPACE ( T_IF T_EXISTS )? iden= T_IDENT
			{
			match(input,T_DROP,FOLLOW_T_DROP_in_dropKeyspaceStatement4685); 
			match(input,T_KEYSPACE,FOLLOW_T_KEYSPACE_in_dropKeyspaceStatement4691); 
			// Meta.g:551:5: ( T_IF T_EXISTS )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==T_IF) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// Meta.g:551:6: T_IF T_EXISTS
					{
					match(input,T_IF,FOLLOW_T_IF_in_dropKeyspaceStatement4698); 
					match(input,T_EXISTS,FOLLOW_T_EXISTS_in_dropKeyspaceStatement4700); 
					ifExists = true;
					}
					break;

			}

			iden=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_dropKeyspaceStatement4712); 
			 drksst = new DropKeyspaceStatement((iden!=null?iden.getText():null), ifExists);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return drksst;
	}
	// $ANTLR end "dropKeyspaceStatement"



	// $ANTLR start "alterKeyspaceStatement"
	// Meta.g:555:1: alterKeyspaceStatement returns [AlterKeyspaceStatement alksst] : T_ALTER T_KEYSPACE ident= T_IDENT T_WITH identProp1= T_IDENT T_EQUAL valueProp1= getValueProperty ( T_AND identPropN= T_IDENT T_EQUAL valuePropN= getValueProperty )* ;
	public final AlterKeyspaceStatement alterKeyspaceStatement() throws RecognitionException {
		AlterKeyspaceStatement alksst = null;


		Token ident=null;
		Token identProp1=null;
		Token identPropN=null;
		ValueProperty valueProp1 =null;
		ValueProperty valuePropN =null;


		        HashMap<String, ValueProperty> properties = new HashMap<>();
		    
		try {
			// Meta.g:558:6: ( T_ALTER T_KEYSPACE ident= T_IDENT T_WITH identProp1= T_IDENT T_EQUAL valueProp1= getValueProperty ( T_AND identPropN= T_IDENT T_EQUAL valuePropN= getValueProperty )* )
			// Meta.g:559:5: T_ALTER T_KEYSPACE ident= T_IDENT T_WITH identProp1= T_IDENT T_EQUAL valueProp1= getValueProperty ( T_AND identPropN= T_IDENT T_EQUAL valuePropN= getValueProperty )*
			{
			match(input,T_ALTER,FOLLOW_T_ALTER_in_alterKeyspaceStatement4741); 
			match(input,T_KEYSPACE,FOLLOW_T_KEYSPACE_in_alterKeyspaceStatement4747); 
			ident=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_alterKeyspaceStatement4755); 
			match(input,T_WITH,FOLLOW_T_WITH_in_alterKeyspaceStatement4761); 
			identProp1=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_alterKeyspaceStatement4769); 
			match(input,T_EQUAL,FOLLOW_T_EQUAL_in_alterKeyspaceStatement4771); 
			pushFollow(FOLLOW_getValueProperty_in_alterKeyspaceStatement4775);
			valueProp1=getValueProperty();
			state._fsp--;

			properties.put((identProp1!=null?identProp1.getText():null), valueProp1);
			// Meta.g:564:5: ( T_AND identPropN= T_IDENT T_EQUAL valuePropN= getValueProperty )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==T_AND) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// Meta.g:564:6: T_AND identPropN= T_IDENT T_EQUAL valuePropN= getValueProperty
					{
					match(input,T_AND,FOLLOW_T_AND_in_alterKeyspaceStatement4784); 
					identPropN=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_alterKeyspaceStatement4788); 
					match(input,T_EQUAL,FOLLOW_T_EQUAL_in_alterKeyspaceStatement4790); 
					pushFollow(FOLLOW_getValueProperty_in_alterKeyspaceStatement4794);
					valuePropN=getValueProperty();
					state._fsp--;

					properties.put((identPropN!=null?identPropN.getText():null), valuePropN);
					}
					break;

				default :
					break loop48;
				}
			}

			 alksst = new AlterKeyspaceStatement((ident!=null?ident.getText():null), properties); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return alksst;
	}
	// $ANTLR end "alterKeyspaceStatement"



	// $ANTLR start "createKeyspaceStatement"
	// Meta.g:567:1: createKeyspaceStatement returns [CreateKeyspaceStatement crksst] : T_CREATE T_KEYSPACE ( T_IF T_NOT T_EXISTS )? identKS= T_IDENT T_WITH identProp1= T_IDENT T_EQUAL valueProp1= getValueProperty ( T_AND identPropN= T_IDENT T_EQUAL valuePropN= getValueProperty )* ;
	public final CreateKeyspaceStatement createKeyspaceStatement() throws RecognitionException {
		CreateKeyspaceStatement crksst = null;


		Token identKS=null;
		Token identProp1=null;
		Token identPropN=null;
		ValueProperty valueProp1 =null;
		ValueProperty valuePropN =null;


		        boolean ifNotExists = false;
		        HashMap<String, ValueProperty> properties = new HashMap<>();
		    
		try {
			// Meta.g:571:6: ( T_CREATE T_KEYSPACE ( T_IF T_NOT T_EXISTS )? identKS= T_IDENT T_WITH identProp1= T_IDENT T_EQUAL valueProp1= getValueProperty ( T_AND identPropN= T_IDENT T_EQUAL valuePropN= getValueProperty )* )
			// Meta.g:572:5: T_CREATE T_KEYSPACE ( T_IF T_NOT T_EXISTS )? identKS= T_IDENT T_WITH identProp1= T_IDENT T_EQUAL valueProp1= getValueProperty ( T_AND identPropN= T_IDENT T_EQUAL valuePropN= getValueProperty )*
			{
			match(input,T_CREATE,FOLLOW_T_CREATE_in_createKeyspaceStatement4828); 
			match(input,T_KEYSPACE,FOLLOW_T_KEYSPACE_in_createKeyspaceStatement4834); 
			// Meta.g:574:5: ( T_IF T_NOT T_EXISTS )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==T_IF) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// Meta.g:574:6: T_IF T_NOT T_EXISTS
					{
					match(input,T_IF,FOLLOW_T_IF_in_createKeyspaceStatement4841); 
					match(input,T_NOT,FOLLOW_T_NOT_in_createKeyspaceStatement4843); 
					match(input,T_EXISTS,FOLLOW_T_EXISTS_in_createKeyspaceStatement4845); 
					ifNotExists = true;
					}
					break;

			}

			identKS=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_createKeyspaceStatement4857); 
			match(input,T_WITH,FOLLOW_T_WITH_in_createKeyspaceStatement4863); 
			identProp1=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_createKeyspaceStatement4875); 
			match(input,T_EQUAL,FOLLOW_T_EQUAL_in_createKeyspaceStatement4877); 
			pushFollow(FOLLOW_getValueProperty_in_createKeyspaceStatement4881);
			valueProp1=getValueProperty();
			state._fsp--;

			properties.put((identProp1!=null?identProp1.getText():null), valueProp1);
			// Meta.g:578:5: ( T_AND identPropN= T_IDENT T_EQUAL valuePropN= getValueProperty )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==T_AND) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// Meta.g:578:6: T_AND identPropN= T_IDENT T_EQUAL valuePropN= getValueProperty
					{
					match(input,T_AND,FOLLOW_T_AND_in_createKeyspaceStatement4890); 
					identPropN=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_createKeyspaceStatement4894); 
					match(input,T_EQUAL,FOLLOW_T_EQUAL_in_createKeyspaceStatement4896); 
					pushFollow(FOLLOW_getValueProperty_in_createKeyspaceStatement4900);
					valuePropN=getValueProperty();
					state._fsp--;

					properties.put((identPropN!=null?identPropN.getText():null), valuePropN);
					}
					break;

				default :
					break loop50;
				}
			}

			 crksst = new CreateKeyspaceStatement((identKS!=null?identKS.getText():null), ifNotExists, properties); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return crksst;
	}
	// $ANTLR end "createKeyspaceStatement"



	// $ANTLR start "dropTableStatement"
	// Meta.g:581:1: dropTableStatement returns [DropTableStatement drtbst] : T_DROP T_TABLE ( T_IF T_EXISTS )? identID= getTableID ;
	public final DropTableStatement dropTableStatement() throws RecognitionException {
		DropTableStatement drtbst = null;


		String identID =null;


		        boolean ifExists = false;
		    
		try {
			// Meta.g:584:6: ( T_DROP T_TABLE ( T_IF T_EXISTS )? identID= getTableID )
			// Meta.g:585:5: T_DROP T_TABLE ( T_IF T_EXISTS )? identID= getTableID
			{
			match(input,T_DROP,FOLLOW_T_DROP_in_dropTableStatement4934); 
			match(input,T_TABLE,FOLLOW_T_TABLE_in_dropTableStatement4940); 
			// Meta.g:587:5: ( T_IF T_EXISTS )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==T_IF) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// Meta.g:587:6: T_IF T_EXISTS
					{
					match(input,T_IF,FOLLOW_T_IF_in_dropTableStatement4947); 
					match(input,T_EXISTS,FOLLOW_T_EXISTS_in_dropTableStatement4949); 
					 ifExists = true; 
					}
					break;

			}

			pushFollow(FOLLOW_getTableID_in_dropTableStatement4961);
			identID=getTableID();
			state._fsp--;


			        drtbst = new DropTableStatement(identID, ifExists);
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return drtbst;
	}
	// $ANTLR end "dropTableStatement"



	// $ANTLR start "truncateStatement"
	// Meta.g:592:1: truncateStatement returns [TruncateStatement trst] : T_TRUNCATE ident= getTableID ;
	public final TruncateStatement truncateStatement() throws RecognitionException {
		TruncateStatement trst = null;


		String ident =null;

		try {
			// Meta.g:592:51: ( T_TRUNCATE ident= getTableID )
			// Meta.g:593:2: T_TRUNCATE ident= getTableID
			{
			match(input,T_TRUNCATE,FOLLOW_T_TRUNCATE_in_truncateStatement4976); 
			pushFollow(FOLLOW_getTableID_in_truncateStatement4989);
			ident=getTableID();
			state._fsp--;


			            trst = new TruncateStatement(ident);
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return trst;
	}
	// $ANTLR end "truncateStatement"



	// $ANTLR start "metaStatement"
	// Meta.g:598:1: metaStatement returns [MetaStatement st] : (st_crta= createTableStatement |st_alta= alterTableStatement |st_crtr= createTriggerStatement |st_drtr= dropTriggerStatement |st_stpr= stopProcessStatement |st_pdtb= updateTableStatement |st_slct= selectStatement |st_nsnt= insertIntoStatement |st_xppl= explainPlanStatement |st_stpt= setOptionsStatement |st_usks= useStatement |st_drks= dropKeyspaceStatement |st_crks= createKeyspaceStatement |st_alks= alterKeyspaceStatement |st_tbdr= dropTableStatement |st_trst= truncateStatement |cis= createIndexStatement |dis= dropIndexStatement |ls= listStatement |add= addStatement |rs= removeUDFStatement |ds= deleteStatement );
	public final MetaStatement metaStatement() throws RecognitionException {
		MetaStatement st = null;


		CreateTableStatement st_crta =null;
		AlterTableStatement st_alta =null;
		CreateTriggerStatement st_crtr =null;
		DropTriggerStatement st_drtr =null;
		StopProcessStatement st_stpr =null;
		UpdateTableStatement st_pdtb =null;
		SelectStatement st_slct =null;
		InsertIntoStatement st_nsnt =null;
		ExplainPlanStatement st_xppl =null;
		SetOptionsStatement st_stpt =null;
		UseStatement st_usks =null;
		DropKeyspaceStatement st_drks =null;
		CreateKeyspaceStatement st_crks =null;
		AlterKeyspaceStatement st_alks =null;
		DropTableStatement st_tbdr =null;
		TruncateStatement st_trst =null;
		CreateIndexStatement cis =null;
		DropIndexStatement dis =null;
		ListStatement ls =null;
		AddStatement add =null;
		RemoveUDFStatement rs =null;
		DeleteStatement ds =null;

		try {
			// Meta.g:598:41: (st_crta= createTableStatement |st_alta= alterTableStatement |st_crtr= createTriggerStatement |st_drtr= dropTriggerStatement |st_stpr= stopProcessStatement |st_pdtb= updateTableStatement |st_slct= selectStatement |st_nsnt= insertIntoStatement |st_xppl= explainPlanStatement |st_stpt= setOptionsStatement |st_usks= useStatement |st_drks= dropKeyspaceStatement |st_crks= createKeyspaceStatement |st_alks= alterKeyspaceStatement |st_tbdr= dropTableStatement |st_trst= truncateStatement |cis= createIndexStatement |dis= dropIndexStatement |ls= listStatement |add= addStatement |rs= removeUDFStatement |ds= deleteStatement )
			int alt52=22;
			switch ( input.LA(1) ) {
			case T_CREATE:
				{
				switch ( input.LA(2) ) {
				case T_TABLE:
					{
					alt52=1;
					}
					break;
				case T_TRIGGER:
					{
					alt52=3;
					}
					break;
				case T_KEYSPACE:
					{
					alt52=13;
					}
					break;
				case T_INDEX_TYPE:
					{
					alt52=17;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 52, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case T_ALTER:
				{
				int LA52_2 = input.LA(2);
				if ( (LA52_2==T_TABLE) ) {
					alt52=2;
				}
				else if ( (LA52_2==T_KEYSPACE) ) {
					alt52=14;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 52, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case T_DROP:
				{
				switch ( input.LA(2) ) {
				case T_TRIGGER:
					{
					alt52=4;
					}
					break;
				case T_KEYSPACE:
					{
					alt52=12;
					}
					break;
				case T_TABLE:
					{
					alt52=15;
					}
					break;
				case T_INDEX:
					{
					alt52=18;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 52, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case T_STOP:
				{
				alt52=5;
				}
				break;
			case T_UPDATE:
				{
				alt52=6;
				}
				break;
			case T_SELECT:
				{
				alt52=7;
				}
				break;
			case T_INSERT:
				{
				alt52=8;
				}
				break;
			case T_EXPLAIN:
				{
				alt52=9;
				}
				break;
			case T_SET:
				{
				alt52=10;
				}
				break;
			case T_USE:
				{
				alt52=11;
				}
				break;
			case T_TRUNCATE:
				{
				alt52=16;
				}
				break;
			case T_LIST:
				{
				alt52=19;
				}
				break;
			case T_ADD:
				{
				alt52=20;
				}
				break;
			case T_REMOVE:
				{
				alt52=21;
				}
				break;
			case T_DELETE:
				{
				alt52=22;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}
			switch (alt52) {
				case 1 :
					// Meta.g:599:5: st_crta= createTableStatement
					{
					pushFollow(FOLLOW_createTableStatement_in_metaStatement5009);
					st_crta=createTableStatement();
					state._fsp--;

					 st = st_crta;
					}
					break;
				case 2 :
					// Meta.g:600:7: st_alta= alterTableStatement
					{
					pushFollow(FOLLOW_alterTableStatement_in_metaStatement5022);
					st_alta=alterTableStatement();
					state._fsp--;

					 st = st_alta;
					}
					break;
				case 3 :
					// Meta.g:601:7: st_crtr= createTriggerStatement
					{
					pushFollow(FOLLOW_createTriggerStatement_in_metaStatement5035);
					st_crtr=createTriggerStatement();
					state._fsp--;

					 st = st_crtr; 
					}
					break;
				case 4 :
					// Meta.g:602:7: st_drtr= dropTriggerStatement
					{
					pushFollow(FOLLOW_dropTriggerStatement_in_metaStatement5048);
					st_drtr=dropTriggerStatement();
					state._fsp--;

					 st = st_drtr; 
					}
					break;
				case 5 :
					// Meta.g:603:7: st_stpr= stopProcessStatement
					{
					pushFollow(FOLLOW_stopProcessStatement_in_metaStatement5062);
					st_stpr=stopProcessStatement();
					state._fsp--;

					 st = st_stpr; 
					}
					break;
				case 6 :
					// Meta.g:604:7: st_pdtb= updateTableStatement
					{
					pushFollow(FOLLOW_updateTableStatement_in_metaStatement5076);
					st_pdtb=updateTableStatement();
					state._fsp--;

					 st = st_pdtb; 
					}
					break;
				case 7 :
					// Meta.g:605:7: st_slct= selectStatement
					{
					pushFollow(FOLLOW_selectStatement_in_metaStatement5090);
					st_slct=selectStatement();
					state._fsp--;

					 st = st_slct;
					}
					break;
				case 8 :
					// Meta.g:606:7: st_nsnt= insertIntoStatement
					{
					pushFollow(FOLLOW_insertIntoStatement_in_metaStatement5104);
					st_nsnt=insertIntoStatement();
					state._fsp--;

					 st = st_nsnt;
					}
					break;
				case 9 :
					// Meta.g:607:7: st_xppl= explainPlanStatement
					{
					pushFollow(FOLLOW_explainPlanStatement_in_metaStatement5118);
					st_xppl=explainPlanStatement();
					state._fsp--;

					 st = st_xppl;
					}
					break;
				case 10 :
					// Meta.g:608:7: st_stpt= setOptionsStatement
					{
					pushFollow(FOLLOW_setOptionsStatement_in_metaStatement5132);
					st_stpt=setOptionsStatement();
					state._fsp--;

					 st = st_stpt; 
					}
					break;
				case 11 :
					// Meta.g:609:7: st_usks= useStatement
					{
					pushFollow(FOLLOW_useStatement_in_metaStatement5146);
					st_usks=useStatement();
					state._fsp--;

					 st = st_usks; 
					}
					break;
				case 12 :
					// Meta.g:610:7: st_drks= dropKeyspaceStatement
					{
					pushFollow(FOLLOW_dropKeyspaceStatement_in_metaStatement5160);
					st_drks=dropKeyspaceStatement();
					state._fsp--;

					 st = st_drks ;
					}
					break;
				case 13 :
					// Meta.g:611:7: st_crks= createKeyspaceStatement
					{
					pushFollow(FOLLOW_createKeyspaceStatement_in_metaStatement5174);
					st_crks=createKeyspaceStatement();
					state._fsp--;

					 st = st_crks; 
					}
					break;
				case 14 :
					// Meta.g:612:7: st_alks= alterKeyspaceStatement
					{
					pushFollow(FOLLOW_alterKeyspaceStatement_in_metaStatement5188);
					st_alks=alterKeyspaceStatement();
					state._fsp--;

					 st = st_alks; 
					}
					break;
				case 15 :
					// Meta.g:613:7: st_tbdr= dropTableStatement
					{
					pushFollow(FOLLOW_dropTableStatement_in_metaStatement5202);
					st_tbdr=dropTableStatement();
					state._fsp--;

					 st = st_tbdr; 
					}
					break;
				case 16 :
					// Meta.g:614:7: st_trst= truncateStatement
					{
					pushFollow(FOLLOW_truncateStatement_in_metaStatement5216);
					st_trst=truncateStatement();
					state._fsp--;

					 st = st_trst; 
					}
					break;
				case 17 :
					// Meta.g:615:7: cis= createIndexStatement
					{
					pushFollow(FOLLOW_createIndexStatement_in_metaStatement5230);
					cis=createIndexStatement();
					state._fsp--;

					 st = cis; 
					}
					break;
				case 18 :
					// Meta.g:616:7: dis= dropIndexStatement
					{
					pushFollow(FOLLOW_dropIndexStatement_in_metaStatement5245);
					dis=dropIndexStatement();
					state._fsp--;

					 st = dis; 
					}
					break;
				case 19 :
					// Meta.g:617:7: ls= listStatement
					{
					pushFollow(FOLLOW_listStatement_in_metaStatement5260);
					ls=listStatement();
					state._fsp--;

					 st = ls; 
					}
					break;
				case 20 :
					// Meta.g:618:7: add= addStatement
					{
					pushFollow(FOLLOW_addStatement_in_metaStatement5275);
					add=addStatement();
					state._fsp--;

					 st = add; 
					}
					break;
				case 21 :
					// Meta.g:619:7: rs= removeUDFStatement
					{
					pushFollow(FOLLOW_removeUDFStatement_in_metaStatement5290);
					rs=removeUDFStatement();
					state._fsp--;

					 st = rs; 
					}
					break;
				case 22 :
					// Meta.g:620:7: ds= deleteStatement
					{
					pushFollow(FOLLOW_deleteStatement_in_metaStatement5305);
					ds=deleteStatement();
					state._fsp--;

					 st = ds; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return st;
	}
	// $ANTLR end "metaStatement"



	// $ANTLR start "query"
	// Meta.g:623:1: query returns [MetaStatement st] : mtst= metaStatement ( T_SEMICOLON )+ EOF ;
	public final MetaStatement query() throws RecognitionException {
		MetaStatement st = null;


		MetaStatement mtst =null;

		try {
			// Meta.g:623:33: (mtst= metaStatement ( T_SEMICOLON )+ EOF )
			// Meta.g:624:2: mtst= metaStatement ( T_SEMICOLON )+ EOF
			{
			pushFollow(FOLLOW_metaStatement_in_query5328);
			mtst=metaStatement();
			state._fsp--;

			// Meta.g:624:21: ( T_SEMICOLON )+
			int cnt53=0;
			loop53:
			while (true) {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==T_SEMICOLON) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// Meta.g:624:22: T_SEMICOLON
					{
					match(input,T_SEMICOLON,FOLLOW_T_SEMICOLON_in_query5331); 
					}
					break;

				default :
					if ( cnt53 >= 1 ) break loop53;
					EarlyExitException eee = new EarlyExitException(53, input);
					throw eee;
				}
				cnt53++;
			}

			match(input,EOF,FOLLOW_EOF_in_query5335); 

					st = mtst;
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return st;
	}
	// $ANTLR end "query"



	// $ANTLR start "getMetaProperties"
	// Meta.g:631:1: getMetaProperties returns [List<MetaProperty> props] : firstProp= getMetaProperty ( T_AND newProp= getMetaProperty )* ;
	public final List<MetaProperty> getMetaProperties() throws RecognitionException {
		List<MetaProperty> props = null;


		MetaProperty firstProp =null;
		MetaProperty newProp =null;


		        props = new ArrayList<>();
		    
		try {
			// Meta.g:634:6: (firstProp= getMetaProperty ( T_AND newProp= getMetaProperty )* )
			// Meta.g:635:5: firstProp= getMetaProperty ( T_AND newProp= getMetaProperty )*
			{
			pushFollow(FOLLOW_getMetaProperty_in_getMetaProperties5365);
			firstProp=getMetaProperty();
			state._fsp--;

			props.add(firstProp);
			// Meta.g:636:5: ( T_AND newProp= getMetaProperty )*
			loop54:
			while (true) {
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( (LA54_0==T_AND) ) {
					alt54=1;
				}

				switch (alt54) {
				case 1 :
					// Meta.g:636:6: T_AND newProp= getMetaProperty
					{
					match(input,T_AND,FOLLOW_T_AND_in_getMetaProperties5374); 
					pushFollow(FOLLOW_getMetaProperty_in_getMetaProperties5378);
					newProp=getMetaProperty();
					state._fsp--;

					props.add(newProp);
					}
					break;

				default :
					break loop54;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return props;
	}
	// $ANTLR end "getMetaProperties"



	// $ANTLR start "getMetaProperty"
	// Meta.g:639:1: getMetaProperty returns [MetaProperty mp] : (identProp= T_IDENT T_EQUAL valueProp= getValueProperty | T_COMPACT T_STORAGE | T_CLUSTERING T_ORDER T_BY T_START_PARENTHESIS ordering= getOrdering T_END_PARENTHESIS ) ;
	public final MetaProperty getMetaProperty() throws RecognitionException {
		MetaProperty mp = null;


		Token identProp=null;
		ValueProperty valueProp =null;
		List<MetaOrdering> ordering =null;

		try {
			// Meta.g:639:42: ( (identProp= T_IDENT T_EQUAL valueProp= getValueProperty | T_COMPACT T_STORAGE | T_CLUSTERING T_ORDER T_BY T_START_PARENTHESIS ordering= getOrdering T_END_PARENTHESIS ) )
			// Meta.g:640:5: (identProp= T_IDENT T_EQUAL valueProp= getValueProperty | T_COMPACT T_STORAGE | T_CLUSTERING T_ORDER T_BY T_START_PARENTHESIS ordering= getOrdering T_END_PARENTHESIS )
			{
			// Meta.g:640:5: (identProp= T_IDENT T_EQUAL valueProp= getValueProperty | T_COMPACT T_STORAGE | T_CLUSTERING T_ORDER T_BY T_START_PARENTHESIS ordering= getOrdering T_END_PARENTHESIS )
			int alt55=3;
			switch ( input.LA(1) ) {
			case T_IDENT:
				{
				alt55=1;
				}
				break;
			case T_COMPACT:
				{
				alt55=2;
				}
				break;
			case T_CLUSTERING:
				{
				alt55=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}
			switch (alt55) {
				case 1 :
					// Meta.g:640:6: identProp= T_IDENT T_EQUAL valueProp= getValueProperty
					{
					identProp=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getMetaProperty5401); 
					match(input,T_EQUAL,FOLLOW_T_EQUAL_in_getMetaProperty5403); 
					pushFollow(FOLLOW_getValueProperty_in_getMetaProperty5407);
					valueProp=getValueProperty();
					state._fsp--;

					mp = new PropertyNameValue((identProp!=null?identProp.getText():null), valueProp);
					}
					break;
				case 2 :
					// Meta.g:641:7: T_COMPACT T_STORAGE
					{
					match(input,T_COMPACT,FOLLOW_T_COMPACT_in_getMetaProperty5418); 
					match(input,T_STORAGE,FOLLOW_T_STORAGE_in_getMetaProperty5420); 
					mp = new PropertyCompactStorage();
					}
					break;
				case 3 :
					// Meta.g:642:7: T_CLUSTERING T_ORDER T_BY T_START_PARENTHESIS ordering= getOrdering T_END_PARENTHESIS
					{
					match(input,T_CLUSTERING,FOLLOW_T_CLUSTERING_in_getMetaProperty5430); 
					match(input,T_ORDER,FOLLOW_T_ORDER_in_getMetaProperty5432); 
					match(input,T_BY,FOLLOW_T_BY_in_getMetaProperty5434); 
					match(input,T_START_PARENTHESIS,FOLLOW_T_START_PARENTHESIS_in_getMetaProperty5436); 
					pushFollow(FOLLOW_getOrdering_in_getMetaProperty5440);
					ordering=getOrdering();
					state._fsp--;

					mp = new PropertyClusteringOrder(ordering);
					match(input,T_END_PARENTHESIS,FOLLOW_T_END_PARENTHESIS_in_getMetaProperty5444); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return mp;
	}
	// $ANTLR end "getMetaProperty"



	// $ANTLR start "getDataType"
	// Meta.g:645:1: getDataType returns [String dataType] : (ident1= T_IDENT ( '<' ident2= T_IDENT ( ',' ident3= T_IDENT )? '>' )? ) ;
	public final String getDataType() throws RecognitionException {
		String dataType = null;


		Token ident1=null;
		Token ident2=null;
		Token ident3=null;

		try {
			// Meta.g:645:38: ( (ident1= T_IDENT ( '<' ident2= T_IDENT ( ',' ident3= T_IDENT )? '>' )? ) )
			// Meta.g:646:5: (ident1= T_IDENT ( '<' ident2= T_IDENT ( ',' ident3= T_IDENT )? '>' )? )
			{
			// Meta.g:646:5: (ident1= T_IDENT ( '<' ident2= T_IDENT ( ',' ident3= T_IDENT )? '>' )? )
			// Meta.g:647:9: ident1= T_IDENT ( '<' ident2= T_IDENT ( ',' ident3= T_IDENT )? '>' )?
			{
			ident1=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getDataType5477); 
			// Meta.g:647:24: ( '<' ident2= T_IDENT ( ',' ident3= T_IDENT )? '>' )?
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==T_LT) ) {
				alt57=1;
			}
			switch (alt57) {
				case 1 :
					// Meta.g:647:25: '<' ident2= T_IDENT ( ',' ident3= T_IDENT )? '>'
					{
					match(input,T_LT,FOLLOW_T_LT_in_getDataType5480); 
					ident2=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getDataType5484); 
					// Meta.g:647:44: ( ',' ident3= T_IDENT )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==T_COMMA) ) {
						alt56=1;
					}
					switch (alt56) {
						case 1 :
							// Meta.g:647:45: ',' ident3= T_IDENT
							{
							match(input,T_COMMA,FOLLOW_T_COMMA_in_getDataType5487); 
							ident3=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getDataType5491); 
							}
							break;

					}

					match(input,T_GT,FOLLOW_T_GT_in_getDataType5495); 
					}
					break;

			}

			}

			dataType = (ident1!=null?ident1.getText():null).concat(ident2==null?"":"<"+(ident2!=null?ident2.getText():null)).concat(ident3==null?"":","+(ident3!=null?ident3.getText():null)).concat(ident2==null?"":">");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return dataType;
	}
	// $ANTLR end "getDataType"



	// $ANTLR start "getOrdering"
	// Meta.g:652:1: getOrdering returns [List<MetaOrdering> order] : ident1= T_IDENT ( T_ASC | T_DESC )? ( T_COMMA identN= T_IDENT ( T_ASC | T_DESC )? )* ;
	public final List<MetaOrdering> getOrdering() throws RecognitionException {
		List<MetaOrdering> order = null;


		Token ident1=null;
		Token identN=null;


		        order = new ArrayList<>();
		        MetaOrdering ordering;
		    
		try {
			// Meta.g:656:6: (ident1= T_IDENT ( T_ASC | T_DESC )? ( T_COMMA identN= T_IDENT ( T_ASC | T_DESC )? )* )
			// Meta.g:657:5: ident1= T_IDENT ( T_ASC | T_DESC )? ( T_COMMA identN= T_IDENT ( T_ASC | T_DESC )? )*
			{
			ident1=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getOrdering5535); 
			ordering = new MetaOrdering((ident1!=null?ident1.getText():null));
			// Meta.g:657:65: ( T_ASC | T_DESC )?
			int alt58=3;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==T_ASC) ) {
				alt58=1;
			}
			else if ( (LA58_0==T_DESC) ) {
				alt58=2;
			}
			switch (alt58) {
				case 1 :
					// Meta.g:657:66: T_ASC
					{
					match(input,T_ASC,FOLLOW_T_ASC_in_getOrdering5540); 
					ordering.setOrderDir(OrderDirection.ASC);
					}
					break;
				case 2 :
					// Meta.g:657:118: T_DESC
					{
					match(input,T_DESC,FOLLOW_T_DESC_in_getOrdering5546); 
					ordering.setOrderDir(OrderDirection.DESC);
					}
					break;

			}

			order.add(ordering);
			// Meta.g:658:5: ( T_COMMA identN= T_IDENT ( T_ASC | T_DESC )? )*
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==T_COMMA) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// Meta.g:658:6: T_COMMA identN= T_IDENT ( T_ASC | T_DESC )?
					{
					match(input,T_COMMA,FOLLOW_T_COMMA_in_getOrdering5559); 
					identN=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getOrdering5563); 
					ordering = new MetaOrdering((identN!=null?identN.getText():null));
					// Meta.g:658:74: ( T_ASC | T_DESC )?
					int alt59=3;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==T_ASC) ) {
						alt59=1;
					}
					else if ( (LA59_0==T_DESC) ) {
						alt59=2;
					}
					switch (alt59) {
						case 1 :
							// Meta.g:658:75: T_ASC
							{
							match(input,T_ASC,FOLLOW_T_ASC_in_getOrdering5568); 
							ordering.setOrderDir(OrderDirection.ASC);
							}
							break;
						case 2 :
							// Meta.g:658:127: T_DESC
							{
							match(input,T_DESC,FOLLOW_T_DESC_in_getOrdering5574); 
							ordering.setOrderDir(OrderDirection.DESC);
							}
							break;

					}

					order.add(ordering);
					}
					break;

				default :
					break loop60;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return order;
	}
	// $ANTLR end "getOrdering"



	// $ANTLR start "getWhereClauses"
	// Meta.g:661:1: getWhereClauses returns [List<MetaRelation> clauses] : rel1= getRelation ( T_AND relN= getRelation )* ;
	public final List<MetaRelation> getWhereClauses() throws RecognitionException {
		List<MetaRelation> clauses = null;


		MetaRelation rel1 =null;
		MetaRelation relN =null;


		        clauses = new ArrayList<>();
		    
		try {
			// Meta.g:664:6: (rel1= getRelation ( T_AND relN= getRelation )* )
			// Meta.g:665:5: rel1= getRelation ( T_AND relN= getRelation )*
			{
			pushFollow(FOLLOW_getRelation_in_getWhereClauses5608);
			rel1=getRelation();
			state._fsp--;

			clauses.add(rel1);
			// Meta.g:665:43: ( T_AND relN= getRelation )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==T_AND) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// Meta.g:665:44: T_AND relN= getRelation
					{
					match(input,T_AND,FOLLOW_T_AND_in_getWhereClauses5613); 
					pushFollow(FOLLOW_getRelation_in_getWhereClauses5617);
					relN=getRelation();
					state._fsp--;

					clauses.add(relN);
					}
					break;

				default :
					break loop61;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return clauses;
	}
	// $ANTLR end "getWhereClauses"



	// $ANTLR start "getFields"
	// Meta.g:668:1: getFields returns [Map<String, String> fields] : ident1L= T_IDENT T_EQUAL ident1R= T_IDENT (identNL= T_IDENT T_EQUAL identNR= T_IDENT )* ;
	public final Map<String, String> getFields() throws RecognitionException {
		Map<String, String> fields = null;


		Token ident1L=null;
		Token ident1R=null;
		Token identNL=null;
		Token identNR=null;


		        fields = new HashMap<>();
		    
		try {
			// Meta.g:671:6: (ident1L= T_IDENT T_EQUAL ident1R= T_IDENT (identNL= T_IDENT T_EQUAL identNR= T_IDENT )* )
			// Meta.g:672:5: ident1L= T_IDENT T_EQUAL ident1R= T_IDENT (identNL= T_IDENT T_EQUAL identNR= T_IDENT )*
			{
			ident1L=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getFields5647); 
			match(input,T_EQUAL,FOLLOW_T_EQUAL_in_getFields5649); 
			ident1R=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getFields5653); 
			 fields.put((ident1L!=null?ident1L.getText():null), (ident1R!=null?ident1R.getText():null));
			// Meta.g:673:5: (identNL= T_IDENT T_EQUAL identNR= T_IDENT )*
			loop62:
			while (true) {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==T_IDENT) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// Meta.g:673:6: identNL= T_IDENT T_EQUAL identNR= T_IDENT
					{
					identNL=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getFields5664); 
					match(input,T_EQUAL,FOLLOW_T_EQUAL_in_getFields5666); 
					identNR=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getFields5670); 
					 fields.put((identNL!=null?identNL.getText():null), (identNR!=null?identNR.getText():null));
					}
					break;

				default :
					break loop62;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return fields;
	}
	// $ANTLR end "getFields"



	// $ANTLR start "getWindow"
	// Meta.g:676:1: getWindow returns [WindowSelect ws] : ( T_LAST |cnstnt= T_CONSTANT ( T_ROWS |unit= getTimeUnit ) ) ;
	public final WindowSelect getWindow() throws RecognitionException {
		WindowSelect ws = null;


		Token cnstnt=null;
		TimeUnit unit =null;

		try {
			// Meta.g:676:36: ( ( T_LAST |cnstnt= T_CONSTANT ( T_ROWS |unit= getTimeUnit ) ) )
			// Meta.g:677:5: ( T_LAST |cnstnt= T_CONSTANT ( T_ROWS |unit= getTimeUnit ) )
			{
			// Meta.g:677:5: ( T_LAST |cnstnt= T_CONSTANT ( T_ROWS |unit= getTimeUnit ) )
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==T_LAST) ) {
				alt64=1;
			}
			else if ( (LA64_0==T_CONSTANT) ) {
				alt64=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}

			switch (alt64) {
				case 1 :
					// Meta.g:677:6: T_LAST
					{
					match(input,T_LAST,FOLLOW_T_LAST_in_getWindow5692); 
					ws = new WindowLast();
					}
					break;
				case 2 :
					// Meta.g:678:7: cnstnt= T_CONSTANT ( T_ROWS |unit= getTimeUnit )
					{
					cnstnt=(Token)match(input,T_CONSTANT,FOLLOW_T_CONSTANT_in_getWindow5705); 
					// Meta.g:678:25: ( T_ROWS |unit= getTimeUnit )
					int alt63=2;
					int LA63_0 = input.LA(1);
					if ( (LA63_0==T_ROWS) ) {
						alt63=1;
					}
					else if ( ((LA63_0 >= 142 && LA63_0 <= 147)||(LA63_0 >= 149 && LA63_0 <= 150)||(LA63_0 >= 153 && LA63_0 <= 160)) ) {
						alt63=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 63, 0, input);
						throw nvae;
					}

					switch (alt63) {
						case 1 :
							// Meta.g:678:26: T_ROWS
							{
							match(input,T_ROWS,FOLLOW_T_ROWS_in_getWindow5708); 
							ws = new WindowRows(Integer.parseInt((cnstnt!=null?cnstnt.getText():null)));
							}
							break;
						case 2 :
							// Meta.g:679:26: unit= getTimeUnit
							{
							pushFollow(FOLLOW_getTimeUnit_in_getWindow5740);
							unit=getTimeUnit();
							state._fsp--;

							ws = new WindowTime(Integer.parseInt((cnstnt!=null?cnstnt.getText():null)), unit);
							}
							break;

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ws;
	}
	// $ANTLR end "getWindow"



	// $ANTLR start "getTimeUnit"
	// Meta.g:683:1: getTimeUnit returns [TimeUnit unit] : ( 'S' | 'M' | 'H' | 'D' | 's' | 'm' | 'h' | 'd' | 'seconds' | 'minutes' | 'hours' | 'days' | 'SECONDS' | 'MINUTES' | 'HOURS' | 'DAYS' ) ;
	public final TimeUnit getTimeUnit() throws RecognitionException {
		TimeUnit unit = null;


		try {
			// Meta.g:683:36: ( ( 'S' | 'M' | 'H' | 'D' | 's' | 'm' | 'h' | 'd' | 'seconds' | 'minutes' | 'hours' | 'days' | 'SECONDS' | 'MINUTES' | 'HOURS' | 'DAYS' ) )
			// Meta.g:684:5: ( 'S' | 'M' | 'H' | 'D' | 's' | 'm' | 'h' | 'd' | 'seconds' | 'minutes' | 'hours' | 'days' | 'SECONDS' | 'MINUTES' | 'HOURS' | 'DAYS' )
			{
			// Meta.g:684:5: ( 'S' | 'M' | 'H' | 'D' | 's' | 'm' | 'h' | 'd' | 'seconds' | 'minutes' | 'hours' | 'days' | 'SECONDS' | 'MINUTES' | 'HOURS' | 'DAYS' )
			int alt65=16;
			switch ( input.LA(1) ) {
			case 149:
				{
				alt65=1;
				}
				break;
			case 146:
				{
				alt65=2;
				}
				break;
			case 144:
				{
				alt65=3;
				}
				break;
			case 142:
				{
				alt65=4;
				}
				break;
			case 159:
				{
				alt65=5;
				}
				break;
			case 157:
				{
				alt65=6;
				}
				break;
			case 155:
				{
				alt65=7;
				}
				break;
			case 153:
				{
				alt65=8;
				}
				break;
			case 160:
				{
				alt65=9;
				}
				break;
			case 158:
				{
				alt65=10;
				}
				break;
			case 156:
				{
				alt65=11;
				}
				break;
			case 154:
				{
				alt65=12;
				}
				break;
			case 150:
				{
				alt65=13;
				}
				break;
			case 147:
				{
				alt65=14;
				}
				break;
			case 145:
				{
				alt65=15;
				}
				break;
			case 143:
				{
				alt65=16;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}
			switch (alt65) {
				case 1 :
					// Meta.g:684:7: 'S'
					{
					match(input,149,FOLLOW_149_in_getTimeUnit5790); 
					unit =TimeUnit.SECONDS;
					}
					break;
				case 2 :
					// Meta.g:685:7: 'M'
					{
					match(input,146,FOLLOW_146_in_getTimeUnit5800); 
					unit =TimeUnit.MINUTES;
					}
					break;
				case 3 :
					// Meta.g:686:7: 'H'
					{
					match(input,144,FOLLOW_144_in_getTimeUnit5810); 
					unit =TimeUnit.HOURS;
					}
					break;
				case 4 :
					// Meta.g:687:7: 'D'
					{
					match(input,142,FOLLOW_142_in_getTimeUnit5820); 
					unit =TimeUnit.DAYS;
					}
					break;
				case 5 :
					// Meta.g:688:7: 's'
					{
					match(input,159,FOLLOW_159_in_getTimeUnit5830); 
					unit =TimeUnit.SECONDS;
					}
					break;
				case 6 :
					// Meta.g:689:7: 'm'
					{
					match(input,157,FOLLOW_157_in_getTimeUnit5840); 
					unit =TimeUnit.MINUTES;
					}
					break;
				case 7 :
					// Meta.g:690:7: 'h'
					{
					match(input,155,FOLLOW_155_in_getTimeUnit5850); 
					unit =TimeUnit.HOURS;
					}
					break;
				case 8 :
					// Meta.g:691:7: 'd'
					{
					match(input,153,FOLLOW_153_in_getTimeUnit5860); 
					unit =TimeUnit.DAYS;
					}
					break;
				case 9 :
					// Meta.g:692:7: 'seconds'
					{
					match(input,160,FOLLOW_160_in_getTimeUnit5870); 
					unit =TimeUnit.SECONDS;
					}
					break;
				case 10 :
					// Meta.g:693:7: 'minutes'
					{
					match(input,158,FOLLOW_158_in_getTimeUnit5880); 
					unit =TimeUnit.MINUTES;
					}
					break;
				case 11 :
					// Meta.g:694:7: 'hours'
					{
					match(input,156,FOLLOW_156_in_getTimeUnit5890); 
					unit =TimeUnit.HOURS;
					}
					break;
				case 12 :
					// Meta.g:695:7: 'days'
					{
					match(input,154,FOLLOW_154_in_getTimeUnit5900); 
					unit =TimeUnit.DAYS;
					}
					break;
				case 13 :
					// Meta.g:696:7: 'SECONDS'
					{
					match(input,150,FOLLOW_150_in_getTimeUnit5910); 
					unit =TimeUnit.SECONDS;
					}
					break;
				case 14 :
					// Meta.g:697:7: 'MINUTES'
					{
					match(input,147,FOLLOW_147_in_getTimeUnit5920); 
					unit =TimeUnit.MINUTES;
					}
					break;
				case 15 :
					// Meta.g:698:7: 'HOURS'
					{
					match(input,145,FOLLOW_145_in_getTimeUnit5930); 
					unit =TimeUnit.HOURS;
					}
					break;
				case 16 :
					// Meta.g:699:7: 'DAYS'
					{
					match(input,143,FOLLOW_143_in_getTimeUnit5940); 
					unit =TimeUnit.DAYS;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return unit;
	}
	// $ANTLR end "getTimeUnit"



	// $ANTLR start "getSelectClause"
	// Meta.g:703:1: getSelectClause returns [SelectionClause sc] : (scc= getSelectionCount |scl= getSelectionList );
	public final SelectionClause getSelectClause() throws RecognitionException {
		SelectionClause sc = null;


		SelectionCount scc =null;
		SelectionList scl =null;

		try {
			// Meta.g:703:45: (scc= getSelectionCount |scl= getSelectionList )
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==T_COUNT) ) {
				int LA66_1 = input.LA(2);
				if ( (LA66_1==T_START_PARENTHESIS) ) {
					int LA66_3 = input.LA(3);
					if ( (LA66_3==T_ASTERISK||LA66_3==141) ) {
						alt66=1;
					}
					else if ( (LA66_3==T_AGGREGATION||LA66_3==T_AVG||LA66_3==T_COUNT||LA66_3==T_END_PARENTHESIS||LA66_3==T_IDENT||(LA66_3 >= T_MAX && LA66_3 <= T_MIN)) ) {
						alt66=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 66, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 66, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA66_0==T_AGGREGATION||(LA66_0 >= T_ASTERISK && LA66_0 <= T_AVG)||LA66_0==T_DISTINCT||LA66_0==T_IDENT||(LA66_0 >= T_MAX && LA66_0 <= T_MIN)) ) {
				alt66=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}

			switch (alt66) {
				case 1 :
					// Meta.g:704:5: scc= getSelectionCount
					{
					pushFollow(FOLLOW_getSelectionCount_in_getSelectClause5966);
					scc=getSelectionCount();
					state._fsp--;

					sc = scc;
					}
					break;
				case 2 :
					// Meta.g:705:7: scl= getSelectionList
					{
					pushFollow(FOLLOW_getSelectionList_in_getSelectClause5978);
					scl=getSelectionList();
					state._fsp--;

					sc = scl;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return sc;
	}
	// $ANTLR end "getSelectClause"



	// $ANTLR start "getSelectionCount"
	// Meta.g:708:1: getSelectionCount returns [SelectionCount scc] : T_COUNT T_START_PARENTHESIS ( T_ASTERISK | '1' ) T_END_PARENTHESIS ( T_AS ident= T_IDENT )? ;
	public final SelectionCount getSelectionCount() throws RecognitionException {
		SelectionCount scc = null;


		Token ident=null;


		        boolean identInc = false;
		        char symbol = '*';
		    
		try {
			// Meta.g:712:6: ( T_COUNT T_START_PARENTHESIS ( T_ASTERISK | '1' ) T_END_PARENTHESIS ( T_AS ident= T_IDENT )? )
			// Meta.g:713:5: T_COUNT T_START_PARENTHESIS ( T_ASTERISK | '1' ) T_END_PARENTHESIS ( T_AS ident= T_IDENT )?
			{
			match(input,T_COUNT,FOLLOW_T_COUNT_in_getSelectionCount6004); 
			match(input,T_START_PARENTHESIS,FOLLOW_T_START_PARENTHESIS_in_getSelectionCount6006); 
			// Meta.g:713:33: ( T_ASTERISK | '1' )
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==T_ASTERISK) ) {
				alt67=1;
			}
			else if ( (LA67_0==141) ) {
				alt67=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 67, 0, input);
				throw nvae;
			}

			switch (alt67) {
				case 1 :
					// Meta.g:713:35: T_ASTERISK
					{
					match(input,T_ASTERISK,FOLLOW_T_ASTERISK_in_getSelectionCount6010); 
					}
					break;
				case 2 :
					// Meta.g:713:48: '1'
					{
					match(input,141,FOLLOW_141_in_getSelectionCount6014); 
					symbol = '1';
					}
					break;

			}

			match(input,T_END_PARENTHESIS,FOLLOW_T_END_PARENTHESIS_in_getSelectionCount6020); 
			// Meta.g:714:5: ( T_AS ident= T_IDENT )?
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==T_AS) ) {
				alt68=1;
			}
			switch (alt68) {
				case 1 :
					// Meta.g:714:6: T_AS ident= T_IDENT
					{
					match(input,T_AS,FOLLOW_T_AS_in_getSelectionCount6027); 
					identInc = true;
					ident=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getSelectionCount6033); 
					}
					break;

			}


			        if(identInc)
			            scc = new SelectionCount(symbol, identInc, (ident!=null?ident.getText():null));
			        else
			            scc = new SelectionCount(symbol);
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return scc;
	}
	// $ANTLR end "getSelectionCount"



	// $ANTLR start "getSelectionList"
	// Meta.g:723:1: getSelectionList returns [SelectionList scl] : ( T_DISTINCT )? selections= getSelection ;
	public final SelectionList getSelectionList() throws RecognitionException {
		SelectionList scl = null;


		Selection selections =null;


		        boolean distinct = false;
		    
		try {
			// Meta.g:726:6: ( ( T_DISTINCT )? selections= getSelection )
			// Meta.g:727:5: ( T_DISTINCT )? selections= getSelection
			{
			// Meta.g:727:5: ( T_DISTINCT )?
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==T_DISTINCT) ) {
				alt69=1;
			}
			switch (alt69) {
				case 1 :
					// Meta.g:727:6: T_DISTINCT
					{
					match(input,T_DISTINCT,FOLLOW_T_DISTINCT_in_getSelectionList6068); 
					distinct = true;
					}
					break;

			}

			pushFollow(FOLLOW_getSelection_in_getSelectionList6076);
			selections=getSelection();
			state._fsp--;

			 scl = new SelectionList(distinct, selections);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return scl;
	}
	// $ANTLR end "getSelectionList"



	// $ANTLR start "getSelection"
	// Meta.g:731:1: getSelection returns [Selection slct] : ( T_ASTERISK |selector1= getSelector ( T_AS ident1= T_IDENT )? ( T_COMMA selectorN= getSelector ( T_AS identN= T_IDENT )? )* ) ;
	public final Selection getSelection() throws RecognitionException {
		Selection slct = null;


		Token ident1=null;
		Token identN=null;
		SelectorMeta selector1 =null;
		SelectorMeta selectorN =null;


		        SelectionSelector slsl;
		        List<SelectionSelector> selections = new ArrayList<>();
		    
		try {
			// Meta.g:735:6: ( ( T_ASTERISK |selector1= getSelector ( T_AS ident1= T_IDENT )? ( T_COMMA selectorN= getSelector ( T_AS identN= T_IDENT )? )* ) )
			// Meta.g:736:5: ( T_ASTERISK |selector1= getSelector ( T_AS ident1= T_IDENT )? ( T_COMMA selectorN= getSelector ( T_AS identN= T_IDENT )? )* )
			{
			// Meta.g:736:5: ( T_ASTERISK |selector1= getSelector ( T_AS ident1= T_IDENT )? ( T_COMMA selectorN= getSelector ( T_AS identN= T_IDENT )? )* )
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==T_ASTERISK) ) {
				alt73=1;
			}
			else if ( (LA73_0==T_AGGREGATION||LA73_0==T_AVG||LA73_0==T_COUNT||LA73_0==T_IDENT||(LA73_0 >= T_MAX && LA73_0 <= T_MIN)) ) {
				alt73=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}

			switch (alt73) {
				case 1 :
					// Meta.g:737:9: T_ASTERISK
					{
					match(input,T_ASTERISK,FOLLOW_T_ASTERISK_in_getSelection6116); 
					 slct = new SelectionAsterisk();
					}
					break;
				case 2 :
					// Meta.g:738:11: selector1= getSelector ( T_AS ident1= T_IDENT )? ( T_COMMA selectorN= getSelector ( T_AS identN= T_IDENT )? )*
					{
					pushFollow(FOLLOW_getSelector_in_getSelection6139);
					selector1=getSelector();
					state._fsp--;

					 slsl = new SelectionSelector(selector1);
					// Meta.g:738:77: ( T_AS ident1= T_IDENT )?
					int alt70=2;
					int LA70_0 = input.LA(1);
					if ( (LA70_0==T_AS) ) {
						alt70=1;
					}
					switch (alt70) {
						case 1 :
							// Meta.g:738:78: T_AS ident1= T_IDENT
							{
							match(input,T_AS,FOLLOW_T_AS_in_getSelection6144); 
							ident1=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getSelection6148); 
							slsl.setAlias((ident1!=null?ident1.getText():null));
							}
							break;

					}

					selections.add(slsl);
					// Meta.g:739:13: ( T_COMMA selectorN= getSelector ( T_AS identN= T_IDENT )? )*
					loop72:
					while (true) {
						int alt72=2;
						int LA72_0 = input.LA(1);
						if ( (LA72_0==T_COMMA) ) {
							alt72=1;
						}

						switch (alt72) {
						case 1 :
							// Meta.g:739:14: T_COMMA selectorN= getSelector ( T_AS identN= T_IDENT )?
							{
							match(input,T_COMMA,FOLLOW_T_COMMA_in_getSelection6169); 
							pushFollow(FOLLOW_getSelector_in_getSelection6173);
							selectorN=getSelector();
							state._fsp--;

							slsl = new SelectionSelector(selectorN);
							// Meta.g:739:87: ( T_AS identN= T_IDENT )?
							int alt71=2;
							int LA71_0 = input.LA(1);
							if ( (LA71_0==T_AS) ) {
								alt71=1;
							}
							switch (alt71) {
								case 1 :
									// Meta.g:739:88: T_AS identN= T_IDENT
									{
									match(input,T_AS,FOLLOW_T_AS_in_getSelection6178); 
									identN=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getSelection6182); 
									slsl.setAlias((identN!=null?identN.getText():null));
									}
									break;

							}

							selections.add(slsl);
							}
							break;

						default :
							break loop72;
						}
					}

					 slct = new SelectionSelectors(selections);
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return slct;
	}
	// $ANTLR end "getSelection"



	// $ANTLR start "getSelector"
	// Meta.g:744:1: getSelector returns [SelectorMeta slmt] : ( ( T_AGGREGATION | T_MAX | T_MIN | T_AVG | T_COUNT ) T_START_PARENTHESIS (select1= getSelector ( T_COMMA selectN= getSelector )* )? T_END_PARENTHESIS |ident= T_IDENT (| T_START_PARENTHESIS (select1= getSelector ( T_COMMA selectN= getSelector )* )? T_END_PARENTHESIS ) ) ;
	public final SelectorMeta getSelector() throws RecognitionException {
		SelectorMeta slmt = null;


		Token ident=null;
		SelectorMeta select1 =null;
		SelectorMeta selectN =null;


		        List<SelectorMeta> params = new ArrayList<>();
		        GroupByFunction gbFunc = null;
		    
		try {
			// Meta.g:748:6: ( ( ( T_AGGREGATION | T_MAX | T_MIN | T_AVG | T_COUNT ) T_START_PARENTHESIS (select1= getSelector ( T_COMMA selectN= getSelector )* )? T_END_PARENTHESIS |ident= T_IDENT (| T_START_PARENTHESIS (select1= getSelector ( T_COMMA selectN= getSelector )* )? T_END_PARENTHESIS ) ) )
			// Meta.g:749:5: ( ( T_AGGREGATION | T_MAX | T_MIN | T_AVG | T_COUNT ) T_START_PARENTHESIS (select1= getSelector ( T_COMMA selectN= getSelector )* )? T_END_PARENTHESIS |ident= T_IDENT (| T_START_PARENTHESIS (select1= getSelector ( T_COMMA selectN= getSelector )* )? T_END_PARENTHESIS ) )
			{
			// Meta.g:749:5: ( ( T_AGGREGATION | T_MAX | T_MIN | T_AVG | T_COUNT ) T_START_PARENTHESIS (select1= getSelector ( T_COMMA selectN= getSelector )* )? T_END_PARENTHESIS |ident= T_IDENT (| T_START_PARENTHESIS (select1= getSelector ( T_COMMA selectN= getSelector )* )? T_END_PARENTHESIS ) )
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==T_AGGREGATION||LA80_0==T_AVG||LA80_0==T_COUNT||(LA80_0 >= T_MAX && LA80_0 <= T_MIN)) ) {
				alt80=1;
			}
			else if ( (LA80_0==T_IDENT) ) {
				alt80=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				throw nvae;
			}

			switch (alt80) {
				case 1 :
					// Meta.g:749:7: ( T_AGGREGATION | T_MAX | T_MIN | T_AVG | T_COUNT ) T_START_PARENTHESIS (select1= getSelector ( T_COMMA selectN= getSelector )* )? T_END_PARENTHESIS
					{
					// Meta.g:749:7: ( T_AGGREGATION | T_MAX | T_MIN | T_AVG | T_COUNT )
					int alt74=5;
					switch ( input.LA(1) ) {
					case T_AGGREGATION:
						{
						alt74=1;
						}
						break;
					case T_MAX:
						{
						alt74=2;
						}
						break;
					case T_MIN:
						{
						alt74=3;
						}
						break;
					case T_AVG:
						{
						alt74=4;
						}
						break;
					case T_COUNT:
						{
						alt74=5;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 74, 0, input);
						throw nvae;
					}
					switch (alt74) {
						case 1 :
							// Meta.g:749:8: T_AGGREGATION
							{
							match(input,T_AGGREGATION,FOLLOW_T_AGGREGATION_in_getSelector6237); 
							gbFunc = GroupByFunction.aggregation;
							}
							break;
						case 2 :
							// Meta.g:750:10: T_MAX
							{
							match(input,T_MAX,FOLLOW_T_MAX_in_getSelector6251); 
							gbFunc = GroupByFunction.max;
							}
							break;
						case 3 :
							// Meta.g:751:10: T_MIN
							{
							match(input,T_MIN,FOLLOW_T_MIN_in_getSelector6265); 
							gbFunc = GroupByFunction.min;
							}
							break;
						case 4 :
							// Meta.g:752:10: T_AVG
							{
							match(input,T_AVG,FOLLOW_T_AVG_in_getSelector6279); 
							gbFunc = GroupByFunction.avg;
							}
							break;
						case 5 :
							// Meta.g:753:10: T_COUNT
							{
							match(input,T_COUNT,FOLLOW_T_COUNT_in_getSelector6293); 
							gbFunc = GroupByFunction.count;
							}
							break;

					}

					match(input,T_START_PARENTHESIS,FOLLOW_T_START_PARENTHESIS_in_getSelector6319); 
					// Meta.g:756:17: (select1= getSelector ( T_COMMA selectN= getSelector )* )?
					int alt76=2;
					int LA76_0 = input.LA(1);
					if ( (LA76_0==T_AGGREGATION||LA76_0==T_AVG||LA76_0==T_COUNT||LA76_0==T_IDENT||(LA76_0 >= T_MAX && LA76_0 <= T_MIN)) ) {
						alt76=1;
					}
					switch (alt76) {
						case 1 :
							// Meta.g:756:18: select1= getSelector ( T_COMMA selectN= getSelector )*
							{
							pushFollow(FOLLOW_getSelector_in_getSelector6341);
							select1=getSelector();
							state._fsp--;

							params.add(select1);
							// Meta.g:756:61: ( T_COMMA selectN= getSelector )*
							loop75:
							while (true) {
								int alt75=2;
								int LA75_0 = input.LA(1);
								if ( (LA75_0==T_COMMA) ) {
									alt75=1;
								}

								switch (alt75) {
								case 1 :
									// Meta.g:756:62: T_COMMA selectN= getSelector
									{
									match(input,T_COMMA,FOLLOW_T_COMMA_in_getSelector6346); 
									pushFollow(FOLLOW_getSelector_in_getSelector6350);
									selectN=getSelector();
									state._fsp--;

									params.add(selectN);
									}
									break;

								default :
									break loop75;
								}
							}

							}
							break;

					}

					match(input,T_END_PARENTHESIS,FOLLOW_T_END_PARENTHESIS_in_getSelector6371); 
					slmt = new SelectorGroupBy(gbFunc, params);
					}
					break;
				case 2 :
					// Meta.g:758:11: ident= T_IDENT (| T_START_PARENTHESIS (select1= getSelector ( T_COMMA selectN= getSelector )* )? T_END_PARENTHESIS )
					{
					ident=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getSelector6387); 
					// Meta.g:758:25: (| T_START_PARENTHESIS (select1= getSelector ( T_COMMA selectN= getSelector )* )? T_END_PARENTHESIS )
					int alt79=2;
					int LA79_0 = input.LA(1);
					if ( (LA79_0==T_AS||LA79_0==T_COMMA||LA79_0==T_END_PARENTHESIS||LA79_0==T_FROM) ) {
						alt79=1;
					}
					else if ( (LA79_0==T_START_PARENTHESIS) ) {
						alt79=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 79, 0, input);
						throw nvae;
					}

					switch (alt79) {
						case 1 :
							// Meta.g:759:13: 
							{
							slmt = new SelectorIdentifier((ident!=null?ident.getText():null));
							}
							break;
						case 2 :
							// Meta.g:760:15: T_START_PARENTHESIS (select1= getSelector ( T_COMMA selectN= getSelector )* )? T_END_PARENTHESIS
							{
							match(input,T_START_PARENTHESIS,FOLLOW_T_START_PARENTHESIS_in_getSelector6419); 
							// Meta.g:760:35: (select1= getSelector ( T_COMMA selectN= getSelector )* )?
							int alt78=2;
							int LA78_0 = input.LA(1);
							if ( (LA78_0==T_AGGREGATION||LA78_0==T_AVG||LA78_0==T_COUNT||LA78_0==T_IDENT||(LA78_0 >= T_MAX && LA78_0 <= T_MIN)) ) {
								alt78=1;
							}
							switch (alt78) {
								case 1 :
									// Meta.g:760:36: select1= getSelector ( T_COMMA selectN= getSelector )*
									{
									pushFollow(FOLLOW_getSelector_in_getSelector6424);
									select1=getSelector();
									state._fsp--;

									params.add(select1);
									// Meta.g:760:79: ( T_COMMA selectN= getSelector )*
									loop77:
									while (true) {
										int alt77=2;
										int LA77_0 = input.LA(1);
										if ( (LA77_0==T_COMMA) ) {
											alt77=1;
										}

										switch (alt77) {
										case 1 :
											// Meta.g:760:80: T_COMMA selectN= getSelector
											{
											match(input,T_COMMA,FOLLOW_T_COMMA_in_getSelector6429); 
											pushFollow(FOLLOW_getSelector_in_getSelector6433);
											selectN=getSelector();
											state._fsp--;

											params.add(selectN);
											}
											break;

										default :
											break loop77;
										}
									}

									}
									break;

							}

							match(input,T_END_PARENTHESIS,FOLLOW_T_END_PARENTHESIS_in_getSelector6458); 
							slmt = new SelectorFunction((ident!=null?ident.getText():null), params);
							}
							break;

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return slmt;
	}
	// $ANTLR end "getSelector"


	public static class getListTypes_return extends ParserRuleReturnScope {
		public String listType;
	};


	// $ANTLR start "getListTypes"
	// Meta.g:766:1: getListTypes returns [String listType] : ident= ( 'PROCESS' | 'UDF' | 'TRIGGER' ) ;
	public final MetaParser.getListTypes_return getListTypes() throws RecognitionException {
		MetaParser.getListTypes_return retval = new MetaParser.getListTypes_return();
		retval.start = input.LT(1);

		Token ident=null;

		try {
			// Meta.g:766:39: (ident= ( 'PROCESS' | 'UDF' | 'TRIGGER' ) )
			// Meta.g:767:2: ident= ( 'PROCESS' | 'UDF' | 'TRIGGER' )
			{
			ident=input.LT(1);
			if ( input.LA(1)==148||(input.LA(1) >= 151 && input.LA(1) <= 152) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			retval.listType = new String((ident!=null?ident.getText():null));
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "getListTypes"



	// $ANTLR start "getAssignment"
	// Meta.g:770:1: getAssignment returns [Assignment assign] : ident= T_IDENT ( T_EQUAL value= getValueAssign | T_START_BRACKET termL= getTerm T_END_BRACKET T_EQUAL termR= getTerm ) ;
	public final Assignment getAssignment() throws RecognitionException {
		Assignment assign = null;


		Token ident=null;
		ValueAssignment value =null;
		String termL =null;
		String termR =null;

		try {
			// Meta.g:770:42: (ident= T_IDENT ( T_EQUAL value= getValueAssign | T_START_BRACKET termL= getTerm T_END_BRACKET T_EQUAL termR= getTerm ) )
			// Meta.g:771:5: ident= T_IDENT ( T_EQUAL value= getValueAssign | T_START_BRACKET termL= getTerm T_END_BRACKET T_EQUAL termR= getTerm )
			{
			ident=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getAssignment6522); 
			// Meta.g:771:19: ( T_EQUAL value= getValueAssign | T_START_BRACKET termL= getTerm T_END_BRACKET T_EQUAL termR= getTerm )
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==T_EQUAL) ) {
				alt81=1;
			}
			else if ( (LA81_0==T_START_BRACKET) ) {
				alt81=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				throw nvae;
			}

			switch (alt81) {
				case 1 :
					// Meta.g:772:9: T_EQUAL value= getValueAssign
					{
					match(input,T_EQUAL,FOLLOW_T_EQUAL_in_getAssignment6534); 
					pushFollow(FOLLOW_getValueAssign_in_getAssignment6538);
					value=getValueAssign();
					state._fsp--;

					assign = new Assignment(new IdentifierAssignment((ident!=null?ident.getText():null)), value);
					}
					break;
				case 2 :
					// Meta.g:774:9: T_START_BRACKET termL= getTerm T_END_BRACKET T_EQUAL termR= getTerm
					{
					match(input,T_START_BRACKET,FOLLOW_T_START_BRACKET_in_getAssignment6557); 
					pushFollow(FOLLOW_getTerm_in_getAssignment6561);
					termL=getTerm();
					state._fsp--;

					match(input,T_END_BRACKET,FOLLOW_T_END_BRACKET_in_getAssignment6563); 
					match(input,T_EQUAL,FOLLOW_T_EQUAL_in_getAssignment6565); 
					pushFollow(FOLLOW_getTerm_in_getAssignment6569);
					termR=getTerm();
					state._fsp--;

					 
					            assign = new Assignment (new IdentifierAssignment((ident!=null?ident.getText():null), new Term(termL)), new ValueAssignment(new Term(termR)));
					        
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return assign;
	}
	// $ANTLR end "getAssignment"



	// $ANTLR start "getValueAssign"
	// Meta.g:780:1: getValueAssign returns [ValueAssignment valueAssign] : (term1= getTerm |ident= T_IDENT ( T_PLUS ( T_START_SBRACKET mapLiteral= getMapLiteral T_END_SBRACKET |value1= getIntSetOrList ) | T_SUBTRACT value2= getIntSetOrList ) );
	public final ValueAssignment getValueAssign() throws RecognitionException {
		ValueAssignment valueAssign = null;


		Token ident=null;
		String term1 =null;
		Map<String, String> mapLiteral =null;
		IdentIntOrLiteral value1 =null;
		IdentIntOrLiteral value2 =null;

		try {
			// Meta.g:780:53: (term1= getTerm |ident= T_IDENT ( T_PLUS ( T_START_SBRACKET mapLiteral= getMapLiteral T_END_SBRACKET |value1= getIntSetOrList ) | T_SUBTRACT value2= getIntSetOrList ) )
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==T_IDENT) ) {
				int LA84_1 = input.LA(2);
				if ( (LA84_1==T_COMMA||LA84_1==T_WHERE) ) {
					alt84=1;
				}
				else if ( (LA84_1==T_PLUS||LA84_1==T_SUBTRACT) ) {
					alt84=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 84, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA84_0==T_CONSTANT||LA84_0==T_FALSE||LA84_0==T_KS_AND_TN||LA84_0==T_TERM||LA84_0==T_TRUE||LA84_0==141) ) {
				alt84=1;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 84, 0, input);
				throw nvae;
			}

			switch (alt84) {
				case 1 :
					// Meta.g:781:5: term1= getTerm
					{
					pushFollow(FOLLOW_getTerm_in_getValueAssign6596);
					term1=getTerm();
					state._fsp--;

					 valueAssign = new ValueAssignment(new Term(term1));
					}
					break;
				case 2 :
					// Meta.g:782:7: ident= T_IDENT ( T_PLUS ( T_START_SBRACKET mapLiteral= getMapLiteral T_END_SBRACKET |value1= getIntSetOrList ) | T_SUBTRACT value2= getIntSetOrList )
					{
					ident=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getValueAssign6608); 
					// Meta.g:782:21: ( T_PLUS ( T_START_SBRACKET mapLiteral= getMapLiteral T_END_SBRACKET |value1= getIntSetOrList ) | T_SUBTRACT value2= getIntSetOrList )
					int alt83=2;
					int LA83_0 = input.LA(1);
					if ( (LA83_0==T_PLUS) ) {
						alt83=1;
					}
					else if ( (LA83_0==T_SUBTRACT) ) {
						alt83=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 83, 0, input);
						throw nvae;
					}

					switch (alt83) {
						case 1 :
							// Meta.g:782:22: T_PLUS ( T_START_SBRACKET mapLiteral= getMapLiteral T_END_SBRACKET |value1= getIntSetOrList )
							{
							match(input,T_PLUS,FOLLOW_T_PLUS_in_getValueAssign6611); 
							// Meta.g:782:29: ( T_START_SBRACKET mapLiteral= getMapLiteral T_END_SBRACKET |value1= getIntSetOrList )
							int alt82=2;
							int LA82_0 = input.LA(1);
							if ( (LA82_0==T_START_SBRACKET) ) {
								int LA82_1 = input.LA(2);
								if ( (LA82_1==T_START_SBRACKET) ) {
									alt82=1;
								}
								else if ( (LA82_1==T_CONSTANT||LA82_1==T_FALSE||LA82_1==T_IDENT||LA82_1==T_KS_AND_TN||LA82_1==T_TERM||LA82_1==T_TRUE||LA82_1==141) ) {
									alt82=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 82, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( (LA82_0==T_CONSTANT||LA82_0==T_START_BRACKET) ) {
								alt82=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 82, 0, input);
								throw nvae;
							}

							switch (alt82) {
								case 1 :
									// Meta.g:782:30: T_START_SBRACKET mapLiteral= getMapLiteral T_END_SBRACKET
									{
									match(input,T_START_SBRACKET,FOLLOW_T_START_SBRACKET_in_getValueAssign6614); 
									pushFollow(FOLLOW_getMapLiteral_in_getValueAssign6618);
									mapLiteral=getMapLiteral();
									state._fsp--;

									match(input,T_END_SBRACKET,FOLLOW_T_END_SBRACKET_in_getValueAssign6620); 
									 valueAssign = new ValueAssignment(new IdentMap((ident!=null?ident.getText():null), new MapLiteralProperty(mapLiteral)));
									}
									break;
								case 2 :
									// Meta.g:783:35: value1= getIntSetOrList
									{
									pushFollow(FOLLOW_getIntSetOrList_in_getValueAssign6660);
									value1=getIntSetOrList();
									state._fsp--;

									 
									                                                            if(value1 instanceof IntTerm)
									                                                                valueAssign = new ValueAssignment(new IntTerm((ident!=null?ident.getText():null), '+', ((IntTerm) value1).getTerm()));
									                                                            else if(value1 instanceof ListLiteral)
									                                                                valueAssign = new ValueAssignment(new ListLiteral((ident!=null?ident.getText():null), '+', ((ListLiteral) value1).getLiterals()));
									                                                            else
									                                                                valueAssign = new ValueAssignment(new SetLiteral((ident!=null?ident.getText():null), '+', ((SetLiteral) value1).getLiterals()));
									                                                         
									}
									break;

							}

							}
							break;
						case 2 :
							// Meta.g:792:11: T_SUBTRACT value2= getIntSetOrList
							{
							match(input,T_SUBTRACT,FOLLOW_T_SUBTRACT_in_getValueAssign6704); 
							pushFollow(FOLLOW_getIntSetOrList_in_getValueAssign6708);
							value2=getIntSetOrList();
							state._fsp--;

							 
							                                                if(value2 instanceof IntTerm)
							                                                    valueAssign = new ValueAssignment(new IntTerm((ident!=null?ident.getText():null), '-', ((IntTerm) value2).getTerm()));
							                                                else if(value2 instanceof ListLiteral)
							                                                    valueAssign = new ValueAssignment(new ListLiteral((ident!=null?ident.getText():null), '-', ((ListLiteral) value2).getLiterals()));
							                                                else
							                                                    valueAssign = new ValueAssignment(new SetLiteral((ident!=null?ident.getText():null), '-', ((SetLiteral) value2).getLiterals()));
							                                            
							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return valueAssign;
	}
	// $ANTLR end "getValueAssign"



	// $ANTLR start "getIntSetOrList"
	// Meta.g:803:1: getIntSetOrList returns [IdentIntOrLiteral iiol] : (constant= T_CONSTANT | T_START_BRACKET list= getList T_END_BRACKET | T_START_SBRACKET set= getSet T_END_SBRACKET );
	public final IdentIntOrLiteral getIntSetOrList() throws RecognitionException {
		IdentIntOrLiteral iiol = null;


		Token constant=null;
		List list =null;
		Set set =null;

		try {
			// Meta.g:803:49: (constant= T_CONSTANT | T_START_BRACKET list= getList T_END_BRACKET | T_START_SBRACKET set= getSet T_END_SBRACKET )
			int alt85=3;
			switch ( input.LA(1) ) {
			case T_CONSTANT:
				{
				alt85=1;
				}
				break;
			case T_START_BRACKET:
				{
				alt85=2;
				}
				break;
			case T_START_SBRACKET:
				{
				alt85=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 85, 0, input);
				throw nvae;
			}
			switch (alt85) {
				case 1 :
					// Meta.g:804:5: constant= T_CONSTANT
					{
					constant=(Token)match(input,T_CONSTANT,FOLLOW_T_CONSTANT_in_getIntSetOrList6734); 
					 iiol = new IntTerm(Integer.parseInt((constant!=null?constant.getText():null)));
					}
					break;
				case 2 :
					// Meta.g:805:7: T_START_BRACKET list= getList T_END_BRACKET
					{
					match(input,T_START_BRACKET,FOLLOW_T_START_BRACKET_in_getIntSetOrList6744); 
					pushFollow(FOLLOW_getList_in_getIntSetOrList6748);
					list=getList();
					state._fsp--;

					match(input,T_END_BRACKET,FOLLOW_T_END_BRACKET_in_getIntSetOrList6750); 
					 iiol = new ListLiteral(list);
					}
					break;
				case 3 :
					// Meta.g:806:7: T_START_SBRACKET set= getSet T_END_SBRACKET
					{
					match(input,T_START_SBRACKET,FOLLOW_T_START_SBRACKET_in_getIntSetOrList6760); 
					pushFollow(FOLLOW_getSet_in_getIntSetOrList6764);
					set=getSet();
					state._fsp--;

					match(input,T_END_SBRACKET,FOLLOW_T_END_SBRACKET_in_getIntSetOrList6766); 
					 iiol = new SetLiteral(set);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return iiol;
	}
	// $ANTLR end "getIntSetOrList"



	// $ANTLR start "getRelation"
	// Meta.g:809:1: getRelation returns [MetaRelation mrel] : ( T_TOKEN T_START_PARENTHESIS listIds= getIds T_END_PARENTHESIS operator= getComparator term= getTerm |ident= T_IDENT (compSymbol= getComparator termR= getTerm | T_IN T_START_PARENTHESIS terms= getTerms T_END_PARENTHESIS | T_BETWEEN term1= getTerm T_AND term2= getTerm ) );
	public final MetaRelation getRelation() throws RecognitionException {
		MetaRelation mrel = null;


		Token ident=null;
		List<String> listIds =null;
		String operator =null;
		String term =null;
		String compSymbol =null;
		String termR =null;
		List terms =null;
		String term1 =null;
		String term2 =null;

		try {
			// Meta.g:809:40: ( T_TOKEN T_START_PARENTHESIS listIds= getIds T_END_PARENTHESIS operator= getComparator term= getTerm |ident= T_IDENT (compSymbol= getComparator termR= getTerm | T_IN T_START_PARENTHESIS terms= getTerms T_END_PARENTHESIS | T_BETWEEN term1= getTerm T_AND term2= getTerm ) )
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==T_TOKEN) ) {
				alt87=1;
			}
			else if ( (LA87_0==T_IDENT) ) {
				alt87=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 87, 0, input);
				throw nvae;
			}

			switch (alt87) {
				case 1 :
					// Meta.g:810:5: T_TOKEN T_START_PARENTHESIS listIds= getIds T_END_PARENTHESIS operator= getComparator term= getTerm
					{
					match(input,T_TOKEN,FOLLOW_T_TOKEN_in_getRelation6784); 
					match(input,T_START_PARENTHESIS,FOLLOW_T_START_PARENTHESIS_in_getRelation6786); 
					pushFollow(FOLLOW_getIds_in_getRelation6790);
					listIds=getIds();
					state._fsp--;

					match(input,T_END_PARENTHESIS,FOLLOW_T_END_PARENTHESIS_in_getRelation6792); 
					pushFollow(FOLLOW_getComparator_in_getRelation6796);
					operator=getComparator();
					state._fsp--;

					pushFollow(FOLLOW_getTerm_in_getRelation6800);
					term=getTerm();
					state._fsp--;

					mrel = new RelationToken(listIds, operator, new Term(term));
					}
					break;
				case 2 :
					// Meta.g:811:7: ident= T_IDENT (compSymbol= getComparator termR= getTerm | T_IN T_START_PARENTHESIS terms= getTerms T_END_PARENTHESIS | T_BETWEEN term1= getTerm T_AND term2= getTerm )
					{
					ident=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getRelation6812); 
					// Meta.g:811:21: (compSymbol= getComparator termR= getTerm | T_IN T_START_PARENTHESIS terms= getTerms T_END_PARENTHESIS | T_BETWEEN term1= getTerm T_AND term2= getTerm )
					int alt86=3;
					switch ( input.LA(1) ) {
					case T_EQUAL:
					case T_GT:
					case T_GTE:
					case T_LIKE:
					case T_LT:
					case T_LTE:
					case T_NOT_EQUAL:
						{
						alt86=1;
						}
						break;
					case T_IN:
						{
						alt86=2;
						}
						break;
					case T_BETWEEN:
						{
						alt86=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 86, 0, input);
						throw nvae;
					}
					switch (alt86) {
						case 1 :
							// Meta.g:811:23: compSymbol= getComparator termR= getTerm
							{
							pushFollow(FOLLOW_getComparator_in_getRelation6818);
							compSymbol=getComparator();
							state._fsp--;

							pushFollow(FOLLOW_getTerm_in_getRelation6822);
							termR=getTerm();
							state._fsp--;

							mrel = new RelationCompare((ident!=null?ident.getText():null), compSymbol, new Term(termR));
							}
							break;
						case 2 :
							// Meta.g:812:23: T_IN T_START_PARENTHESIS terms= getTerms T_END_PARENTHESIS
							{
							match(input,T_IN,FOLLOW_T_IN_in_getRelation6848); 
							match(input,T_START_PARENTHESIS,FOLLOW_T_START_PARENTHESIS_in_getRelation6850); 
							pushFollow(FOLLOW_getTerms_in_getRelation6854);
							terms=getTerms();
							state._fsp--;

							match(input,T_END_PARENTHESIS,FOLLOW_T_END_PARENTHESIS_in_getRelation6856); 
							mrel = new RelationIn((ident!=null?ident.getText():null), terms);
							}
							break;
						case 3 :
							// Meta.g:813:23: T_BETWEEN term1= getTerm T_AND term2= getTerm
							{
							match(input,T_BETWEEN,FOLLOW_T_BETWEEN_in_getRelation6882); 
							pushFollow(FOLLOW_getTerm_in_getRelation6886);
							term1=getTerm();
							state._fsp--;

							match(input,T_AND,FOLLOW_T_AND_in_getRelation6888); 
							pushFollow(FOLLOW_getTerm_in_getRelation6892);
							term2=getTerm();
							state._fsp--;

							mrel = new RelationBetween((ident!=null?ident.getText():null), new Term(term1), new Term(term2));
							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return mrel;
	}
	// $ANTLR end "getRelation"



	// $ANTLR start "getComparator"
	// Meta.g:817:1: getComparator returns [String comparator] : ( T_EQUAL | T_GT | T_LT | T_GTE | T_LTE | T_NOT_EQUAL | T_LIKE );
	public final String getComparator() throws RecognitionException {
		String comparator = null;


		try {
			// Meta.g:817:42: ( T_EQUAL | T_GT | T_LT | T_GTE | T_LTE | T_NOT_EQUAL | T_LIKE )
			int alt88=7;
			switch ( input.LA(1) ) {
			case T_EQUAL:
				{
				alt88=1;
				}
				break;
			case T_GT:
				{
				alt88=2;
				}
				break;
			case T_LT:
				{
				alt88=3;
				}
				break;
			case T_GTE:
				{
				alt88=4;
				}
				break;
			case T_LTE:
				{
				alt88=5;
				}
				break;
			case T_NOT_EQUAL:
				{
				alt88=6;
				}
				break;
			case T_LIKE:
				{
				alt88=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 88, 0, input);
				throw nvae;
			}
			switch (alt88) {
				case 1 :
					// Meta.g:818:5: T_EQUAL
					{
					match(input,T_EQUAL,FOLLOW_T_EQUAL_in_getComparator6932); 
					comparator ="=";
					}
					break;
				case 2 :
					// Meta.g:819:7: T_GT
					{
					match(input,T_GT,FOLLOW_T_GT_in_getComparator6942); 
					comparator =">";
					}
					break;
				case 3 :
					// Meta.g:820:7: T_LT
					{
					match(input,T_LT,FOLLOW_T_LT_in_getComparator6952); 
					comparator ="<";
					}
					break;
				case 4 :
					// Meta.g:821:7: T_GTE
					{
					match(input,T_GTE,FOLLOW_T_GTE_in_getComparator6962); 
					comparator =">=";
					}
					break;
				case 5 :
					// Meta.g:822:7: T_LTE
					{
					match(input,T_LTE,FOLLOW_T_LTE_in_getComparator6973); 
					comparator ="<=";
					}
					break;
				case 6 :
					// Meta.g:823:7: T_NOT_EQUAL
					{
					match(input,T_NOT_EQUAL,FOLLOW_T_NOT_EQUAL_in_getComparator6983); 
					comparator ="<>";
					}
					break;
				case 7 :
					// Meta.g:824:7: T_LIKE
					{
					match(input,T_LIKE,FOLLOW_T_LIKE_in_getComparator6994); 
					comparator ="LIKE";
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return comparator;
	}
	// $ANTLR end "getComparator"



	// $ANTLR start "getIds"
	// Meta.g:827:1: getIds returns [List<String> listStrs] : ident1= T_IDENT ( T_COMMA identN= T_IDENT )* ;
	public final List<String> getIds() throws RecognitionException {
		List<String> listStrs = null;


		Token ident1=null;
		Token identN=null;


		        listStrs = new ArrayList<>();
		    
		try {
			// Meta.g:830:6: (ident1= T_IDENT ( T_COMMA identN= T_IDENT )* )
			// Meta.g:831:5: ident1= T_IDENT ( T_COMMA identN= T_IDENT )*
			{
			ident1=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getIds7022); 
			listStrs.add((ident1!=null?ident1.getText():null));
			// Meta.g:831:50: ( T_COMMA identN= T_IDENT )*
			loop89:
			while (true) {
				int alt89=2;
				int LA89_0 = input.LA(1);
				if ( (LA89_0==T_COMMA) ) {
					alt89=1;
				}

				switch (alt89) {
				case 1 :
					// Meta.g:831:51: T_COMMA identN= T_IDENT
					{
					match(input,T_COMMA,FOLLOW_T_COMMA_in_getIds7027); 
					identN=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getIds7031); 
					listStrs.add((identN!=null?identN.getText():null));
					}
					break;

				default :
					break loop89;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return listStrs;
	}
	// $ANTLR end "getIds"



	// $ANTLR start "getOptions"
	// Meta.g:834:1: getOptions returns [List<Option> opts] : opt1= getOption (optN= getOption )* ;
	public final List<Option> getOptions() throws RecognitionException {
		List<Option> opts = null;


		Option opt1 =null;
		Option optN =null;


		        opts = new ArrayList<>();
		    
		try {
			// Meta.g:836:6: (opt1= getOption (optN= getOption )* )
			// Meta.g:837:5: opt1= getOption (optN= getOption )*
			{
			pushFollow(FOLLOW_getOption_in_getOptions7056);
			opt1=getOption();
			state._fsp--;

			opts.add(opt1);
			// Meta.g:837:38: (optN= getOption )*
			loop90:
			while (true) {
				int alt90=2;
				int LA90_0 = input.LA(1);
				if ( (LA90_0==T_CLUSTERING||LA90_0==T_COMPACT||LA90_0==T_IDENT) ) {
					alt90=1;
				}

				switch (alt90) {
				case 1 :
					// Meta.g:837:39: optN= getOption
					{
					pushFollow(FOLLOW_getOption_in_getOptions7063);
					optN=getOption();
					state._fsp--;

					opts.add(optN);
					}
					break;

				default :
					break loop90;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return opts;
	}
	// $ANTLR end "getOptions"



	// $ANTLR start "getOption"
	// Meta.g:840:1: getOption returns [Option opt] : ( T_COMPACT T_STORAGE | T_CLUSTERING T_ORDER |identProp= T_IDENT T_EQUAL valueProp= getValueProperty );
	public final Option getOption() throws RecognitionException {
		Option opt = null;


		Token identProp=null;
		ValueProperty valueProp =null;

		try {
			// Meta.g:840:31: ( T_COMPACT T_STORAGE | T_CLUSTERING T_ORDER |identProp= T_IDENT T_EQUAL valueProp= getValueProperty )
			int alt91=3;
			switch ( input.LA(1) ) {
			case T_COMPACT:
				{
				alt91=1;
				}
				break;
			case T_CLUSTERING:
				{
				alt91=2;
				}
				break;
			case T_IDENT:
				{
				alt91=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 91, 0, input);
				throw nvae;
			}
			switch (alt91) {
				case 1 :
					// Meta.g:841:5: T_COMPACT T_STORAGE
					{
					match(input,T_COMPACT,FOLLOW_T_COMPACT_in_getOption7083); 
					match(input,T_STORAGE,FOLLOW_T_STORAGE_in_getOption7085); 
					opt =new Option(Option.OPTION_COMPACT);
					}
					break;
				case 2 :
					// Meta.g:842:7: T_CLUSTERING T_ORDER
					{
					match(input,T_CLUSTERING,FOLLOW_T_CLUSTERING_in_getOption7095); 
					match(input,T_ORDER,FOLLOW_T_ORDER_in_getOption7097); 
					opt =new Option(Option.OPTION_CLUSTERING);
					}
					break;
				case 3 :
					// Meta.g:843:7: identProp= T_IDENT T_EQUAL valueProp= getValueProperty
					{
					identProp=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getOption7109); 
					match(input,T_EQUAL,FOLLOW_T_EQUAL_in_getOption7111); 
					pushFollow(FOLLOW_getValueProperty_in_getOption7115);
					valueProp=getValueProperty();
					state._fsp--;

					opt =new Option((identProp!=null?identProp.getText():null), valueProp);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return opt;
	}
	// $ANTLR end "getOption"



	// $ANTLR start "getList"
	// Meta.g:846:1: getList returns [List list] : term1= getTerm ( T_COMMA termN= getTerm )* ;
	public final List getList() throws RecognitionException {
		List list = null;


		String term1 =null;
		String termN =null;


		        list = new ArrayList<String>();
		    
		try {
			// Meta.g:849:6: (term1= getTerm ( T_COMMA termN= getTerm )* )
			// Meta.g:850:5: term1= getTerm ( T_COMMA termN= getTerm )*
			{
			pushFollow(FOLLOW_getTerm_in_getList7143);
			term1=getTerm();
			state._fsp--;

			list.add(term1);
			// Meta.g:851:5: ( T_COMMA termN= getTerm )*
			loop92:
			while (true) {
				int alt92=2;
				int LA92_0 = input.LA(1);
				if ( (LA92_0==T_COMMA) ) {
					alt92=1;
				}

				switch (alt92) {
				case 1 :
					// Meta.g:851:6: T_COMMA termN= getTerm
					{
					match(input,T_COMMA,FOLLOW_T_COMMA_in_getList7152); 
					pushFollow(FOLLOW_getTerm_in_getList7156);
					termN=getTerm();
					state._fsp--;

					list.add(termN);
					}
					break;

				default :
					break loop92;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return list;
	}
	// $ANTLR end "getList"



	// $ANTLR start "getTerms"
	// Meta.g:854:1: getTerms returns [List list] : term1= getTerm ( T_COMMA termN= getTerm )* ;
	public final List getTerms() throws RecognitionException {
		List list = null;


		String term1 =null;
		String termN =null;


		        list = new ArrayList<Term>();
		    
		try {
			// Meta.g:857:6: (term1= getTerm ( T_COMMA termN= getTerm )* )
			// Meta.g:858:5: term1= getTerm ( T_COMMA termN= getTerm )*
			{
			pushFollow(FOLLOW_getTerm_in_getTerms7190);
			term1=getTerm();
			state._fsp--;

			list.add(new Term(term1));
			// Meta.g:859:5: ( T_COMMA termN= getTerm )*
			loop93:
			while (true) {
				int alt93=2;
				int LA93_0 = input.LA(1);
				if ( (LA93_0==T_COMMA) ) {
					alt93=1;
				}

				switch (alt93) {
				case 1 :
					// Meta.g:859:6: T_COMMA termN= getTerm
					{
					match(input,T_COMMA,FOLLOW_T_COMMA_in_getTerms7199); 
					pushFollow(FOLLOW_getTerm_in_getTerms7203);
					termN=getTerm();
					state._fsp--;

					list.add(new Term(termN));
					}
					break;

				default :
					break loop93;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return list;
	}
	// $ANTLR end "getTerms"



	// $ANTLR start "getSet"
	// Meta.g:862:1: getSet returns [Set set] : term1= getTerm ( T_COMMA termN= getTerm )* ;
	public final Set getSet() throws RecognitionException {
		Set set = null;


		String term1 =null;
		String termN =null;


		        set = new HashSet<String>();
		    
		try {
			// Meta.g:865:6: (term1= getTerm ( T_COMMA termN= getTerm )* )
			// Meta.g:866:5: term1= getTerm ( T_COMMA termN= getTerm )*
			{
			pushFollow(FOLLOW_getTerm_in_getSet7237);
			term1=getTerm();
			state._fsp--;

			set.add(term1);
			// Meta.g:867:5: ( T_COMMA termN= getTerm )*
			loop94:
			while (true) {
				int alt94=2;
				int LA94_0 = input.LA(1);
				if ( (LA94_0==T_COMMA) ) {
					alt94=1;
				}

				switch (alt94) {
				case 1 :
					// Meta.g:867:6: T_COMMA termN= getTerm
					{
					match(input,T_COMMA,FOLLOW_T_COMMA_in_getSet7246); 
					pushFollow(FOLLOW_getTerm_in_getSet7250);
					termN=getTerm();
					state._fsp--;

					set.add(termN);
					}
					break;

				default :
					break loop94;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return set;
	}
	// $ANTLR end "getSet"



	// $ANTLR start "getTermOrLiteral"
	// Meta.g:870:1: getTermOrLiteral returns [ValueCell vc] : (term= getTerm | T_START_SBRACKET (term1= getTerm ( T_COMMA termN= getTerm )* )? T_END_SBRACKET );
	public final ValueCell getTermOrLiteral() throws RecognitionException {
		ValueCell vc = null;


		String term =null;
		String term1 =null;
		String termN =null;


		        CollectionLiteral cl = new CollectionLiteral();
		    
		try {
			// Meta.g:873:6: (term= getTerm | T_START_SBRACKET (term1= getTerm ( T_COMMA termN= getTerm )* )? T_END_SBRACKET )
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==T_CONSTANT||LA97_0==T_FALSE||LA97_0==T_IDENT||LA97_0==T_KS_AND_TN||LA97_0==T_TERM||LA97_0==T_TRUE||LA97_0==141) ) {
				alt97=1;
			}
			else if ( (LA97_0==T_START_SBRACKET) ) {
				alt97=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 97, 0, input);
				throw nvae;
			}

			switch (alt97) {
				case 1 :
					// Meta.g:874:5: term= getTerm
					{
					pushFollow(FOLLOW_getTerm_in_getTermOrLiteral7284);
					term=getTerm();
					state._fsp--;

					vc =new Term(term);
					}
					break;
				case 2 :
					// Meta.g:876:5: T_START_SBRACKET (term1= getTerm ( T_COMMA termN= getTerm )* )? T_END_SBRACKET
					{
					match(input,T_START_SBRACKET,FOLLOW_T_START_SBRACKET_in_getTermOrLiteral7298); 
					// Meta.g:877:5: (term1= getTerm ( T_COMMA termN= getTerm )* )?
					int alt96=2;
					int LA96_0 = input.LA(1);
					if ( (LA96_0==T_CONSTANT||LA96_0==T_FALSE||LA96_0==T_IDENT||LA96_0==T_KS_AND_TN||LA96_0==T_TERM||LA96_0==T_TRUE||LA96_0==141) ) {
						alt96=1;
					}
					switch (alt96) {
						case 1 :
							// Meta.g:878:9: term1= getTerm ( T_COMMA termN= getTerm )*
							{
							pushFollow(FOLLOW_getTerm_in_getTermOrLiteral7316);
							term1=getTerm();
							state._fsp--;

							cl.addLiteral(new Term(term1));
							// Meta.g:879:9: ( T_COMMA termN= getTerm )*
							loop95:
							while (true) {
								int alt95=2;
								int LA95_0 = input.LA(1);
								if ( (LA95_0==T_COMMA) ) {
									alt95=1;
								}

								switch (alt95) {
								case 1 :
									// Meta.g:879:10: T_COMMA termN= getTerm
									{
									match(input,T_COMMA,FOLLOW_T_COMMA_in_getTermOrLiteral7329); 
									pushFollow(FOLLOW_getTerm_in_getTermOrLiteral7333);
									termN=getTerm();
									state._fsp--;

									cl.addLiteral(new Term(termN));
									}
									break;

								default :
									break loop95;
								}
							}

							}
							break;

					}

					match(input,T_END_SBRACKET,FOLLOW_T_END_SBRACKET_in_getTermOrLiteral7350); 
					vc =cl;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return vc;
	}
	// $ANTLR end "getTermOrLiteral"



	// $ANTLR start "getTableID"
	// Meta.g:884:1: getTableID returns [String tableID] : (ident1= T_IDENT |ident2= T_KS_AND_TN ) ;
	public final String getTableID() throws RecognitionException {
		String tableID = null;


		Token ident1=null;
		Token ident2=null;


		        tableID ="";
		    
		try {
			// Meta.g:887:6: ( (ident1= T_IDENT |ident2= T_KS_AND_TN ) )
			// Meta.g:888:5: (ident1= T_IDENT |ident2= T_KS_AND_TN )
			{
			// Meta.g:888:5: (ident1= T_IDENT |ident2= T_KS_AND_TN )
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0==T_IDENT) ) {
				alt98=1;
			}
			else if ( (LA98_0==T_KS_AND_TN) ) {
				alt98=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 98, 0, input);
				throw nvae;
			}

			switch (alt98) {
				case 1 :
					// Meta.g:888:6: ident1= T_IDENT
					{
					ident1=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getTableID7380); 
					tableID = new String((ident1!=null?ident1.getText():null));
					}
					break;
				case 2 :
					// Meta.g:889:7: ident2= T_KS_AND_TN
					{
					ident2=(Token)match(input,T_KS_AND_TN,FOLLOW_T_KS_AND_TN_in_getTableID7396); 
					tableID = new String((ident2!=null?ident2.getText():null));
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return tableID;
	}
	// $ANTLR end "getTableID"



	// $ANTLR start "getTerm"
	// Meta.g:892:1: getTerm returns [String term] : (ident= T_IDENT |constant= T_CONSTANT | '1' | T_FALSE | T_TRUE |ksAndTn= T_KS_AND_TN |noIdent= T_TERM );
	public final String getTerm() throws RecognitionException {
		String term = null;


		Token ident=null;
		Token constant=null;
		Token ksAndTn=null;
		Token noIdent=null;

		try {
			// Meta.g:892:30: (ident= T_IDENT |constant= T_CONSTANT | '1' | T_FALSE | T_TRUE |ksAndTn= T_KS_AND_TN |noIdent= T_TERM )
			int alt99=7;
			switch ( input.LA(1) ) {
			case T_IDENT:
				{
				alt99=1;
				}
				break;
			case T_CONSTANT:
				{
				alt99=2;
				}
				break;
			case 141:
				{
				alt99=3;
				}
				break;
			case T_FALSE:
				{
				alt99=4;
				}
				break;
			case T_TRUE:
				{
				alt99=5;
				}
				break;
			case T_KS_AND_TN:
				{
				alt99=6;
				}
				break;
			case T_TERM:
				{
				alt99=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 99, 0, input);
				throw nvae;
			}
			switch (alt99) {
				case 1 :
					// Meta.g:893:5: ident= T_IDENT
					{
					ident=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getTerm7421); 
					term = new String((ident!=null?ident.getText():null));
					}
					break;
				case 2 :
					// Meta.g:894:7: constant= T_CONSTANT
					{
					constant=(Token)match(input,T_CONSTANT,FOLLOW_T_CONSTANT_in_getTerm7433); 
					term = new String((constant!=null?constant.getText():null));
					}
					break;
				case 3 :
					// Meta.g:895:7: '1'
					{
					match(input,141,FOLLOW_141_in_getTerm7443); 
					term = new String("1");
					}
					break;
				case 4 :
					// Meta.g:896:7: T_FALSE
					{
					match(input,T_FALSE,FOLLOW_T_FALSE_in_getTerm7453); 
					term = new String("false");
					}
					break;
				case 5 :
					// Meta.g:897:7: T_TRUE
					{
					match(input,T_TRUE,FOLLOW_T_TRUE_in_getTerm7463); 
					term = new String("true");
					}
					break;
				case 6 :
					// Meta.g:898:7: ksAndTn= T_KS_AND_TN
					{
					ksAndTn=(Token)match(input,T_KS_AND_TN,FOLLOW_T_KS_AND_TN_in_getTerm7475); 
					term = new String((ksAndTn!=null?ksAndTn.getText():null));
					}
					break;
				case 7 :
					// Meta.g:899:7: noIdent= T_TERM
					{
					noIdent=(Token)match(input,T_TERM,FOLLOW_T_TERM_in_getTerm7487); 
					term = new String((noIdent!=null?noIdent.getText():null));
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return term;
	}
	// $ANTLR end "getTerm"



	// $ANTLR start "getMapLiteral"
	// Meta.g:902:1: getMapLiteral returns [Map<String, String> mapTerms] : T_START_SBRACKET (leftTerm1= getTerm T_COLON rightTerm1= getTerm ( T_COMMA leftTermN= getTerm T_COLON rightTermN= getTerm )* )? T_END_SBRACKET ;
	public final Map<String, String> getMapLiteral() throws RecognitionException {
		Map<String, String> mapTerms = null;


		String leftTerm1 =null;
		String rightTerm1 =null;
		String leftTermN =null;
		String rightTermN =null;


		        mapTerms = new HashMap<>();
		    
		try {
			// Meta.g:905:6: ( T_START_SBRACKET (leftTerm1= getTerm T_COLON rightTerm1= getTerm ( T_COMMA leftTermN= getTerm T_COLON rightTermN= getTerm )* )? T_END_SBRACKET )
			// Meta.g:906:5: T_START_SBRACKET (leftTerm1= getTerm T_COLON rightTerm1= getTerm ( T_COMMA leftTermN= getTerm T_COLON rightTermN= getTerm )* )? T_END_SBRACKET
			{
			match(input,T_START_SBRACKET,FOLLOW_T_START_SBRACKET_in_getMapLiteral7513); 
			// Meta.g:907:5: (leftTerm1= getTerm T_COLON rightTerm1= getTerm ( T_COMMA leftTermN= getTerm T_COLON rightTermN= getTerm )* )?
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==T_CONSTANT||LA101_0==T_FALSE||LA101_0==T_IDENT||LA101_0==T_KS_AND_TN||LA101_0==T_TERM||LA101_0==T_TRUE||LA101_0==141) ) {
				alt101=1;
			}
			switch (alt101) {
				case 1 :
					// Meta.g:907:6: leftTerm1= getTerm T_COLON rightTerm1= getTerm ( T_COMMA leftTermN= getTerm T_COLON rightTermN= getTerm )*
					{
					pushFollow(FOLLOW_getTerm_in_getMapLiteral7523);
					leftTerm1=getTerm();
					state._fsp--;

					match(input,T_COLON,FOLLOW_T_COLON_in_getMapLiteral7525); 
					pushFollow(FOLLOW_getTerm_in_getMapLiteral7529);
					rightTerm1=getTerm();
					state._fsp--;

					mapTerms.put(leftTerm1, rightTerm1);
					// Meta.g:908:5: ( T_COMMA leftTermN= getTerm T_COLON rightTermN= getTerm )*
					loop100:
					while (true) {
						int alt100=2;
						int LA100_0 = input.LA(1);
						if ( (LA100_0==T_COMMA) ) {
							alt100=1;
						}

						switch (alt100) {
						case 1 :
							// Meta.g:908:6: T_COMMA leftTermN= getTerm T_COLON rightTermN= getTerm
							{
							match(input,T_COMMA,FOLLOW_T_COMMA_in_getMapLiteral7538); 
							pushFollow(FOLLOW_getTerm_in_getMapLiteral7542);
							leftTermN=getTerm();
							state._fsp--;

							match(input,T_COLON,FOLLOW_T_COLON_in_getMapLiteral7544); 
							pushFollow(FOLLOW_getTerm_in_getMapLiteral7548);
							rightTermN=getTerm();
							state._fsp--;

							mapTerms.put(leftTermN, rightTermN);
							}
							break;

						default :
							break loop100;
						}
					}

					}
					break;

			}

			match(input,T_END_SBRACKET,FOLLOW_T_END_SBRACKET_in_getMapLiteral7560); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return mapTerms;
	}
	// $ANTLR end "getMapLiteral"



	// $ANTLR start "getValueProperty"
	// Meta.g:912:1: getValueProperty returns [ValueProperty value] : (ident= T_IDENT |constant= T_CONSTANT |mapliteral= getMapLiteral |number= getFloat | T_FALSE | T_TRUE | T_COMPACT T_STORAGE | T_CLUSTERING T_ORDER |quotedLiteral= QUOTED_LITERAL );
	public final ValueProperty getValueProperty() throws RecognitionException {
		ValueProperty value = null;


		Token ident=null;
		Token constant=null;
		Token quotedLiteral=null;
		Map<String, String> mapliteral =null;
		String number =null;


		        StringBuilder sb = new StringBuilder();
		    
		try {
			// Meta.g:915:6: (ident= T_IDENT |constant= T_CONSTANT |mapliteral= getMapLiteral |number= getFloat | T_FALSE | T_TRUE | T_COMPACT T_STORAGE | T_CLUSTERING T_ORDER |quotedLiteral= QUOTED_LITERAL )
			int alt102=9;
			switch ( input.LA(1) ) {
			case T_IDENT:
				{
				alt102=1;
				}
				break;
			case T_CONSTANT:
				{
				alt102=2;
				}
				break;
			case T_START_SBRACKET:
				{
				alt102=3;
				}
				break;
			case T_FLOAT:
			case T_TERM:
				{
				alt102=4;
				}
				break;
			case T_FALSE:
				{
				alt102=5;
				}
				break;
			case T_TRUE:
				{
				alt102=6;
				}
				break;
			case T_COMPACT:
				{
				alt102=7;
				}
				break;
			case T_CLUSTERING:
				{
				alt102=8;
				}
				break;
			case QUOTED_LITERAL:
				{
				alt102=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 102, 0, input);
				throw nvae;
			}
			switch (alt102) {
				case 1 :
					// Meta.g:916:5: ident= T_IDENT
					{
					ident=(Token)match(input,T_IDENT,FOLLOW_T_IDENT_in_getValueProperty7590); 
					value = new IdentifierProperty((ident!=null?ident.getText():null));
					}
					break;
				case 2 :
					// Meta.g:917:7: constant= T_CONSTANT
					{
					constant=(Token)match(input,T_CONSTANT,FOLLOW_T_CONSTANT_in_getValueProperty7602); 
					value = new ConstantProperty(Integer.parseInt((constant!=null?constant.getText():null)));
					}
					break;
				case 3 :
					// Meta.g:918:7: mapliteral= getMapLiteral
					{
					pushFollow(FOLLOW_getMapLiteral_in_getValueProperty7614);
					mapliteral=getMapLiteral();
					state._fsp--;

					value = new MapLiteralProperty(mapliteral);
					}
					break;
				case 4 :
					// Meta.g:919:7: number= getFloat
					{
					pushFollow(FOLLOW_getFloat_in_getValueProperty7626);
					number=getFloat();
					state._fsp--;

					value = new FloatProperty(Float.parseFloat(number));
					}
					break;
				case 5 :
					// Meta.g:920:7: T_FALSE
					{
					match(input,T_FALSE,FOLLOW_T_FALSE_in_getValueProperty7636); 
					value = new BooleanProperty(false);
					}
					break;
				case 6 :
					// Meta.g:921:7: T_TRUE
					{
					match(input,T_TRUE,FOLLOW_T_TRUE_in_getValueProperty7646); 
					value = new BooleanProperty(true);
					}
					break;
				case 7 :
					// Meta.g:922:7: T_COMPACT T_STORAGE
					{
					match(input,T_COMPACT,FOLLOW_T_COMPACT_in_getValueProperty7656); 
					match(input,T_STORAGE,FOLLOW_T_STORAGE_in_getValueProperty7658); 
					value = new IdentifierProperty("COMPACT STORAGE");
					}
					break;
				case 8 :
					// Meta.g:923:7: T_CLUSTERING T_ORDER
					{
					match(input,T_CLUSTERING,FOLLOW_T_CLUSTERING_in_getValueProperty7668); 
					match(input,T_ORDER,FOLLOW_T_ORDER_in_getValueProperty7670); 
					value = new IdentifierProperty("CLUSTERING ORDER");
					}
					break;
				case 9 :
					// Meta.g:924:7: quotedLiteral= QUOTED_LITERAL
					{
					quotedLiteral=(Token)match(input,QUOTED_LITERAL,FOLLOW_QUOTED_LITERAL_in_getValueProperty7682); 
					value = new IdentifierProperty((quotedLiteral!=null?quotedLiteral.getText():null));
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "getValueProperty"



	// $ANTLR start "getFloat"
	// Meta.g:928:1: getFloat returns [String floating] : (termToken= T_TERM |floatToken= T_FLOAT );
	public final String getFloat() throws RecognitionException {
		String floating = null;


		Token termToken=null;
		Token floatToken=null;

		try {
			// Meta.g:928:35: (termToken= T_TERM |floatToken= T_FLOAT )
			int alt103=2;
			int LA103_0 = input.LA(1);
			if ( (LA103_0==T_TERM) ) {
				alt103=1;
			}
			else if ( (LA103_0==T_FLOAT) ) {
				alt103=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 103, 0, input);
				throw nvae;
			}

			switch (alt103) {
				case 1 :
					// Meta.g:929:5: termToken= T_TERM
					{
					termToken=(Token)match(input,T_TERM,FOLLOW_T_TERM_in_getFloat7707); 
					floating =(termToken!=null?termToken.getText():null);
					}
					break;
				case 2 :
					// Meta.g:931:5: floatToken= T_FLOAT
					{
					floatToken=(Token)match(input,T_FLOAT,FOLLOW_T_FLOAT_in_getFloat7725); 
					floating =(floatToken!=null?floatToken.getText():null);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return floating;
	}
	// $ANTLR end "getFloat"

	// Delegated rules



	public static final BitSet FOLLOW_T_DELETE_in_deleteStatement1963 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000002L});
	public static final BitSet FOLLOW_T_START_PARENTHESIS_in_deleteStatement1967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_deleteStatement1972 = new BitSet(new long[]{0x0200100000000000L});
	public static final BitSet FOLLOW_T_COMMA_in_deleteStatement1979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_deleteStatement1986 = new BitSet(new long[]{0x0200100000000000L});
	public static final BitSet FOLLOW_T_END_PARENTHESIS_in_deleteStatement1998 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000002L});
	public static final BitSet FOLLOW_T_FROM_in_deleteStatement2003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_deleteStatement2008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_T_WHERE_in_deleteStatement2013 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000020L});
	public static final BitSet FOLLOW_getRelation_in_deleteStatement2018 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_AND_in_deleteStatement2023 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000020L});
	public static final BitSet FOLLOW_getRelation_in_deleteStatement2027 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_ADD_in_addStatement2046 = new BitSet(new long[]{0x0000000000000000L,0x0000410000000000L});
	public static final BitSet FOLLOW_set_in_addStatement2048 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_T_PATH_in_addStatement2058 = new BitSet(new long[]{0x0000000000000000L,0x0000410000000000L});
	public static final BitSet FOLLOW_set_in_addStatement2060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_LIST_in_listStatement2083 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001900000L});
	public static final BitSet FOLLOW_getListTypes_in_listStatement2088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_REMOVE_in_removeUDFStatement2106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_152_in_removeUDFStatement2108 = new BitSet(new long[]{0x0000000000000000L,0x0000410000000000L});
	public static final BitSet FOLLOW_set_in_removeUDFStatement2110 = new BitSet(new long[]{0x4000800000000000L,0x0440000000020020L,0x0000000000002000L});
	public static final BitSet FOLLOW_getTerm_in_removeUDFStatement2120 = new BitSet(new long[]{0x0000000000000000L,0x0000410000000000L});
	public static final BitSet FOLLOW_set_in_removeUDFStatement2124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DROP_in_dropIndexStatement2150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_T_INDEX_in_dropIndexStatement2152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
	public static final BitSet FOLLOW_T_IF_in_dropIndexStatement2156 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_T_EXISTS_in_dropIndexStatement2158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_dropIndexStatement2167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_CREATE_in_createIndexStatement2192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_T_INDEX_TYPE_in_createIndexStatement2196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_T_INDEX_in_createIndexStatement2200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
	public static final BitSet FOLLOW_T_IF_in_createIndexStatement2204 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_T_NOT_in_createIndexStatement2206 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_T_EXISTS_in_createIndexStatement2208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_createIndexStatement2217 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_T_ON_in_createIndexStatement2222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020020L});
	public static final BitSet FOLLOW_getTableID_in_createIndexStatement2226 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_T_START_PARENTHESIS_in_createIndexStatement2231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_createIndexStatement2236 = new BitSet(new long[]{0x0200100000000000L});
	public static final BitSet FOLLOW_T_COMMA_in_createIndexStatement2242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_createIndexStatement2248 = new BitSet(new long[]{0x0200100000000000L});
	public static final BitSet FOLLOW_T_END_PARENTHESIS_in_createIndexStatement2257 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000022L});
	public static final BitSet FOLLOW_T_USING_in_createIndexStatement2261 = new BitSet(new long[]{0x4000800000000000L,0x0440000000020020L,0x0000000000002000L});
	public static final BitSet FOLLOW_getTerm_in_createIndexStatement2265 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_WITH_in_createIndexStatement2273 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_T_OPTIONS_in_createIndexStatement2275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_createIndexStatement2279 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_T_EQUAL_in_createIndexStatement2281 = new BitSet(new long[]{0xC000A40002000000L,0x0442000000000020L});
	public static final BitSet FOLLOW_getValueProperty_in_createIndexStatement2285 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_AND_in_createIndexStatement2292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_createIndexStatement2296 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_T_EQUAL_in_createIndexStatement2298 = new BitSet(new long[]{0xC000A40002000000L,0x0442000000000020L});
	public static final BitSet FOLLOW_getValueProperty_in_createIndexStatement2302 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_UPDATE_in_updateTableStatement2343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020020L});
	public static final BitSet FOLLOW_getTableID_in_updateTableStatement2347 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_T_USING_in_updateTableStatement2354 = new BitSet(new long[]{0x0000240000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_getOption_in_updateTableStatement2358 = new BitSet(new long[]{0x0000240000000000L,0x0000200000000020L});
	public static final BitSet FOLLOW_getOption_in_updateTableStatement2365 = new BitSet(new long[]{0x0000240000000000L,0x0000200000000020L});
	public static final BitSet FOLLOW_T_SET_in_updateTableStatement2377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_getAssignment_in_updateTableStatement2381 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_T_COMMA_in_updateTableStatement2386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_getAssignment_in_updateTableStatement2390 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_T_WHERE_in_updateTableStatement2400 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000020L});
	public static final BitSet FOLLOW_getRelation_in_updateTableStatement2404 = new BitSet(new long[]{0x0000000400000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_T_AND_in_updateTableStatement2409 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000020L});
	public static final BitSet FOLLOW_getRelation_in_updateTableStatement2413 = new BitSet(new long[]{0x0000000400000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_T_IF_in_updateTableStatement2424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_updateTableStatement2428 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_T_EQUAL_in_updateTableStatement2430 = new BitSet(new long[]{0x4000800000000000L,0x0440000000020020L,0x0000000000002000L});
	public static final BitSet FOLLOW_getTerm_in_updateTableStatement2434 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_AND_in_updateTableStatement2460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_updateTableStatement2464 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_T_EQUAL_in_updateTableStatement2466 = new BitSet(new long[]{0x4000800000000000L,0x0440000000020020L,0x0000000000002000L});
	public static final BitSet FOLLOW_getTerm_in_updateTableStatement2470 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_STOP_in_stopProcessStatement2502 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_T_PROCESS_in_stopProcessStatement2504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_stopProcessStatement2508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DROP_in_dropTriggerStatement2530 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_T_TRIGGER_in_dropTriggerStatement2537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_dropTriggerStatement2541 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_T_ON_in_dropTriggerStatement2548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_dropTriggerStatement2557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_CREATE_in_createTriggerStatement2585 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_T_TRIGGER_in_createTriggerStatement2592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_createTriggerStatement2596 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_T_ON_in_createTriggerStatement2603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_createTriggerStatement2612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_T_USING_in_createTriggerStatement2618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_createTriggerStatement2622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_CREATE_in_createTableStatement2661 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_T_TABLE_in_createTableStatement2667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020060L});
	public static final BitSet FOLLOW_T_IF_in_createTableStatement2674 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_T_NOT_in_createTableStatement2676 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_T_EXISTS_in_createTableStatement2678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020020L});
	public static final BitSet FOLLOW_getTableID_in_createTableStatement2691 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_T_START_PARENTHESIS_in_createTableStatement2697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008020L});
	public static final BitSet FOLLOW_set_in_createTableStatement2731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_getDataType_in_createTableStatement2741 = new BitSet(new long[]{0x0200100000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_T_PRIMARY_in_createTableStatement2744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_T_KEY_in_createTableStatement2746 = new BitSet(new long[]{0x0200100000000000L});
	public static final BitSet FOLLOW_T_COMMA_in_createTableStatement2795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008020L});
	public static final BitSet FOLLOW_set_in_createTableStatement2799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_getDataType_in_createTableStatement2809 = new BitSet(new long[]{0x0200100000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_T_PRIMARY_in_createTableStatement2812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_T_KEY_in_createTableStatement2814 = new BitSet(new long[]{0x0200100000000000L});
	public static final BitSet FOLLOW_T_COMMA_in_createTableStatement2872 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_T_PRIMARY_in_createTableStatement2874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_T_KEY_in_createTableStatement2876 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_T_START_PARENTHESIS_in_createTableStatement2878 = new BitSet(new long[]{0x0000000000000000L,0x0001000000008020L});
	public static final BitSet FOLLOW_set_in_createTableStatement2940 = new BitSet(new long[]{0x0200100000000000L});
	public static final BitSet FOLLOW_T_COMMA_in_createTableStatement3011 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008020L});
	public static final BitSet FOLLOW_set_in_createTableStatement3014 = new BitSet(new long[]{0x0200100000000000L});
	public static final BitSet FOLLOW_T_START_PARENTHESIS_in_createTableStatement3119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008020L});
	public static final BitSet FOLLOW_set_in_createTableStatement3123 = new BitSet(new long[]{0x0200100000000000L});
	public static final BitSet FOLLOW_T_COMMA_in_createTableStatement3170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008020L});
	public static final BitSet FOLLOW_set_in_createTableStatement3173 = new BitSet(new long[]{0x0200100000000000L});
	public static final BitSet FOLLOW_T_END_PARENTHESIS_in_createTableStatement3217 = new BitSet(new long[]{0x0200100000000000L});
	public static final BitSet FOLLOW_T_COMMA_in_createTableStatement3253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008020L});
	public static final BitSet FOLLOW_set_in_createTableStatement3257 = new BitSet(new long[]{0x0200100000000000L});
	public static final BitSet FOLLOW_T_END_PARENTHESIS_in_createTableStatement3349 = new BitSet(new long[]{0x0200100000000000L});
	public static final BitSet FOLLOW_T_END_PARENTHESIS_in_createTableStatement3421 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_WITH_in_createTableStatement3424 = new BitSet(new long[]{0x0000240000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_getMetaProperties_in_createTableStatement3430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ALTER_in_alterTableStatement3493 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_T_TABLE_in_alterTableStatement3499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020020L});
	public static final BitSet FOLLOW_getTableID_in_alterTableStatement3507 = new BitSet(new long[]{0x0040000120000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_ALTER_in_alterTableStatement3514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_alterTableStatement3518 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_T_TYPE_in_alterTableStatement3520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_alterTableStatement3524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ADD_in_alterTableStatement3537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_alterTableStatement3541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_alterTableStatement3545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DROP_in_alterTableStatement3558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_alterTableStatement3562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_WITH_in_alterTableStatement3575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_alterTableStatement3592 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_T_EQUAL_in_alterTableStatement3594 = new BitSet(new long[]{0xC000A40002000000L,0x0442000000000020L});
	public static final BitSet FOLLOW_getValueProperty_in_alterTableStatement3598 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_AND_in_alterTableStatement3615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_alterTableStatement3619 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_T_EQUAL_in_alterTableStatement3621 = new BitSet(new long[]{0xC000A40002000000L,0x0442000000000020L});
	public static final BitSet FOLLOW_getValueProperty_in_alterTableStatement3625 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_SELECT_in_selectStatement3680 = new BitSet(new long[]{0x002100C040000000L,0x000000000C000020L});
	public static final BitSet FOLLOW_getSelectClause_in_selectStatement3684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_T_FROM_in_selectStatement3686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020020L});
	public static final BitSet FOLLOW_getTableID_in_selectStatement3690 = new BitSet(new long[]{0x0010000000000002L,0x0000000200100404L,0x0000000000000028L});
	public static final BitSet FOLLOW_T_WITH_in_selectStatement3698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_T_WINDOW_in_selectStatement3700 = new BitSet(new long[]{0x0000800000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_getWindow_in_selectStatement3706 = new BitSet(new long[]{0x0010000000000002L,0x0000000200100404L,0x0000000000000008L});
	public static final BitSet FOLLOW_T_INNER_in_selectStatement3719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_T_JOIN_in_selectStatement3721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020020L});
	public static final BitSet FOLLOW_getTableID_in_selectStatement3727 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_T_ON_in_selectStatement3729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_getFields_in_selectStatement3733 = new BitSet(new long[]{0x0010000000000002L,0x0000000200100004L,0x0000000000000008L});
	public static final BitSet FOLLOW_T_WHERE_in_selectStatement3742 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000020L});
	public static final BitSet FOLLOW_getWhereClauses_in_selectStatement3748 = new BitSet(new long[]{0x0010000000000002L,0x0000000200100004L});
	public static final BitSet FOLLOW_T_ORDER_in_selectStatement3757 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_T_BY_in_selectStatement3759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_getOrdering_in_selectStatement3765 = new BitSet(new long[]{0x0010000000000002L,0x0000000000100004L});
	public static final BitSet FOLLOW_T_GROUP_in_selectStatement3774 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_T_BY_in_selectStatement3776 = new BitSet(new long[]{0x4000800000000000L,0x0440000000020020L,0x0000000000002000L});
	public static final BitSet FOLLOW_getList_in_selectStatement3782 = new BitSet(new long[]{0x0010000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_T_LIMIT_in_selectStatement3791 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_T_CONSTANT_in_selectStatement3797 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_T_DISABLE_in_selectStatement3806 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_T_ANALYTICS_in_selectStatement3808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_INSERT_in_insertIntoStatement3841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_T_INTO_in_insertIntoStatement3848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020020L});
	public static final BitSet FOLLOW_getTableID_in_insertIntoStatement3857 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_T_START_PARENTHESIS_in_insertIntoStatement3863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_insertIntoStatement3872 = new BitSet(new long[]{0x0200100000000000L});
	public static final BitSet FOLLOW_T_COMMA_in_insertIntoStatement3882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_insertIntoStatement3886 = new BitSet(new long[]{0x0200100000000000L});
	public static final BitSet FOLLOW_T_END_PARENTHESIS_in_insertIntoStatement3897 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_selectStatement_in_insertIntoStatement3916 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L,0x0000000000000002L});
	public static final BitSet FOLLOW_T_VALUES_in_insertIntoStatement3939 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_T_START_PARENTHESIS_in_insertIntoStatement3949 = new BitSet(new long[]{0x4000800000000000L,0x0442000000020020L,0x0000000000002000L});
	public static final BitSet FOLLOW_getTermOrLiteral_in_insertIntoStatement3966 = new BitSet(new long[]{0x0200100000000000L});
	public static final BitSet FOLLOW_T_COMMA_in_insertIntoStatement3983 = new BitSet(new long[]{0x4000800000000000L,0x0442000000020020L,0x0000000000002000L});
	public static final BitSet FOLLOW_getTermOrLiteral_in_insertIntoStatement3987 = new BitSet(new long[]{0x0200100000000000L});
	public static final BitSet FOLLOW_T_END_PARENTHESIS_in_insertIntoStatement4001 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L,0x0000000000000002L});
	public static final BitSet FOLLOW_T_IF_in_insertIntoStatement4014 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_T_NOT_in_insertIntoStatement4016 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_T_EXISTS_in_insertIntoStatement4018 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_T_USING_in_insertIntoStatement4039 = new BitSet(new long[]{0x0000240000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_getOption_in_insertIntoStatement4054 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_AND_in_insertIntoStatement4067 = new BitSet(new long[]{0x0000240000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_getOption_in_insertIntoStatement4071 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_EXPLAIN_in_explainPlanStatement4108 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_T_PLAN_in_explainPlanStatement4110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_T_FOR_in_explainPlanStatement4112 = new BitSet(new long[]{0x2046000120000000L,0x88042A0000200800L,0x0000000000000001L});
	public static final BitSet FOLLOW_metaStatement_in_explainPlanStatement4116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_SET_in_setOptionsStatement4150 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_T_OPTIONS_in_setOptionsStatement4152 = new BitSet(new long[]{0x0000400200000000L});
	public static final BitSet FOLLOW_T_ANALYTICS_in_setOptionsStatement4164 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_T_EQUAL_in_setOptionsStatement4166 = new BitSet(new long[]{0x4000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_T_TRUE_in_setOptionsStatement4169 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_FALSE_in_setOptionsStatement4172 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_AND_in_setOptionsStatement4187 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_T_CONSISTENCY_in_setOptionsStatement4189 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_T_EQUAL_in_setOptionsStatement4191 = new BitSet(new long[]{0x0080000880000000L,0x1080008080C00000L});
	public static final BitSet FOLLOW_T_ALL_in_setOptionsStatement4206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ANY_in_setOptionsStatement4225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_QUORUM_in_setOptionsStatement4243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ONE_in_setOptionsStatement4261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_TWO_in_setOptionsStatement4279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_THREE_in_setOptionsStatement4297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_EACH_QUORUM_in_setOptionsStatement4315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_LOCAL_ONE_in_setOptionsStatement4333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_LOCAL_QUORUM_in_setOptionsStatement4351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_CONSISTENCY_in_setOptionsStatement4401 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_T_EQUAL_in_setOptionsStatement4403 = new BitSet(new long[]{0x0080000880000000L,0x1080008080C00000L});
	public static final BitSet FOLLOW_T_ALL_in_setOptionsStatement4419 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_ANY_in_setOptionsStatement4438 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_QUORUM_in_setOptionsStatement4456 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_ONE_in_setOptionsStatement4474 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_TWO_in_setOptionsStatement4492 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_THREE_in_setOptionsStatement4510 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_EACH_QUORUM_in_setOptionsStatement4528 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_LOCAL_ONE_in_setOptionsStatement4546 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_LOCAL_QUORUM_in_setOptionsStatement4564 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_AND_in_setOptionsStatement4592 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_T_ANALYTICS_in_setOptionsStatement4594 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_T_EQUAL_in_setOptionsStatement4596 = new BitSet(new long[]{0x4000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_T_TRUE_in_setOptionsStatement4599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_FALSE_in_setOptionsStatement4602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_USE_in_useStatement4652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_useStatement4660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DROP_in_dropKeyspaceStatement4685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_T_KEYSPACE_in_dropKeyspaceStatement4691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
	public static final BitSet FOLLOW_T_IF_in_dropKeyspaceStatement4698 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_T_EXISTS_in_dropKeyspaceStatement4700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_dropKeyspaceStatement4712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ALTER_in_alterKeyspaceStatement4741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_T_KEYSPACE_in_alterKeyspaceStatement4747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_alterKeyspaceStatement4755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_WITH_in_alterKeyspaceStatement4761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_alterKeyspaceStatement4769 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_T_EQUAL_in_alterKeyspaceStatement4771 = new BitSet(new long[]{0xC000A40002000000L,0x0442000000000020L});
	public static final BitSet FOLLOW_getValueProperty_in_alterKeyspaceStatement4775 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_AND_in_alterKeyspaceStatement4784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_alterKeyspaceStatement4788 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_T_EQUAL_in_alterKeyspaceStatement4790 = new BitSet(new long[]{0xC000A40002000000L,0x0442000000000020L});
	public static final BitSet FOLLOW_getValueProperty_in_alterKeyspaceStatement4794 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_CREATE_in_createKeyspaceStatement4828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_T_KEYSPACE_in_createKeyspaceStatement4834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
	public static final BitSet FOLLOW_T_IF_in_createKeyspaceStatement4841 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_T_NOT_in_createKeyspaceStatement4843 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_T_EXISTS_in_createKeyspaceStatement4845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_createKeyspaceStatement4857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_WITH_in_createKeyspaceStatement4863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_createKeyspaceStatement4875 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_T_EQUAL_in_createKeyspaceStatement4877 = new BitSet(new long[]{0xC000A40002000000L,0x0442000000000020L});
	public static final BitSet FOLLOW_getValueProperty_in_createKeyspaceStatement4881 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_AND_in_createKeyspaceStatement4890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_createKeyspaceStatement4894 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_T_EQUAL_in_createKeyspaceStatement4896 = new BitSet(new long[]{0xC000A40002000000L,0x0442000000000020L});
	public static final BitSet FOLLOW_getValueProperty_in_createKeyspaceStatement4900 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_DROP_in_dropTableStatement4934 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_T_TABLE_in_dropTableStatement4940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020060L});
	public static final BitSet FOLLOW_T_IF_in_dropTableStatement4947 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_T_EXISTS_in_dropTableStatement4949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020020L});
	public static final BitSet FOLLOW_getTableID_in_dropTableStatement4961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_TRUNCATE_in_truncateStatement4976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020020L});
	public static final BitSet FOLLOW_getTableID_in_truncateStatement4989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createTableStatement_in_metaStatement5009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterTableStatement_in_metaStatement5022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createTriggerStatement_in_metaStatement5035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropTriggerStatement_in_metaStatement5048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stopProcessStatement_in_metaStatement5062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_updateTableStatement_in_metaStatement5076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectStatement_in_metaStatement5090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insertIntoStatement_in_metaStatement5104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_explainPlanStatement_in_metaStatement5118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_setOptionsStatement_in_metaStatement5132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_useStatement_in_metaStatement5146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropKeyspaceStatement_in_metaStatement5160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createKeyspaceStatement_in_metaStatement5174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterKeyspaceStatement_in_metaStatement5188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropTableStatement_in_metaStatement5202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_truncateStatement_in_metaStatement5216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createIndexStatement_in_metaStatement5230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropIndexStatement_in_metaStatement5245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listStatement_in_metaStatement5260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addStatement_in_metaStatement5275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_removeUDFStatement_in_metaStatement5290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deleteStatement_in_metaStatement5305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_metaStatement_in_query5328 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_T_SEMICOLON_in_query5331 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_EOF_in_query5335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getMetaProperty_in_getMetaProperties5365 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_AND_in_getMetaProperties5374 = new BitSet(new long[]{0x0000240000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_getMetaProperty_in_getMetaProperties5378 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_IDENT_in_getMetaProperty5401 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_T_EQUAL_in_getMetaProperty5403 = new BitSet(new long[]{0xC000A40002000000L,0x0442000000000020L});
	public static final BitSet FOLLOW_getValueProperty_in_getMetaProperty5407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_COMPACT_in_getMetaProperty5418 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_T_STORAGE_in_getMetaProperty5420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_CLUSTERING_in_getMetaProperty5430 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_T_ORDER_in_getMetaProperty5432 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_T_BY_in_getMetaProperty5434 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_T_START_PARENTHESIS_in_getMetaProperty5436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_getOrdering_in_getMetaProperty5440 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_T_END_PARENTHESIS_in_getMetaProperty5444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IDENT_in_getDataType5477 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_T_LT_in_getDataType5480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_getDataType5484 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_T_COMMA_in_getDataType5487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_getDataType5491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_T_GT_in_getDataType5495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IDENT_in_getOrdering5535 = new BitSet(new long[]{0x0008102000000002L});
	public static final BitSet FOLLOW_T_ASC_in_getOrdering5540 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_T_DESC_in_getOrdering5546 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_T_COMMA_in_getOrdering5559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_getOrdering5563 = new BitSet(new long[]{0x0008102000000002L});
	public static final BitSet FOLLOW_T_ASC_in_getOrdering5568 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_T_DESC_in_getOrdering5574 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_getRelation_in_getWhereClauses5608 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_AND_in_getWhereClauses5613 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000020L});
	public static final BitSet FOLLOW_getRelation_in_getWhereClauses5617 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_T_IDENT_in_getFields5647 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_T_EQUAL_in_getFields5649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_getFields5653 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_getFields5664 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_T_EQUAL_in_getFields5666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_getFields5670 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_LAST_in_getWindow5692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_CONSTANT_in_getWindow5705 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x00000001FE6FC000L});
	public static final BitSet FOLLOW_T_ROWS_in_getWindow5708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getTimeUnit_in_getWindow5740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_149_in_getTimeUnit5790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_146_in_getTimeUnit5800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_144_in_getTimeUnit5810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_142_in_getTimeUnit5820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_159_in_getTimeUnit5830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_157_in_getTimeUnit5840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_155_in_getTimeUnit5850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_153_in_getTimeUnit5860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_160_in_getTimeUnit5870 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_158_in_getTimeUnit5880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_156_in_getTimeUnit5890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_154_in_getTimeUnit5900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_150_in_getTimeUnit5910 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_147_in_getTimeUnit5920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_145_in_getTimeUnit5930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_143_in_getTimeUnit5940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getSelectionCount_in_getSelectClause5966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getSelectionList_in_getSelectClause5978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_COUNT_in_getSelectionCount6004 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_T_START_PARENTHESIS_in_getSelectionCount6006 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_T_ASTERISK_in_getSelectionCount6010 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_141_in_getSelectionCount6014 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_T_END_PARENTHESIS_in_getSelectionCount6020 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_T_AS_in_getSelectionCount6027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_getSelectionCount6033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_DISTINCT_in_getSelectionList6068 = new BitSet(new long[]{0x000100C040000000L,0x000000000C000020L});
	public static final BitSet FOLLOW_getSelection_in_getSelectionList6076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_ASTERISK_in_getSelection6116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getSelector_in_getSelection6139 = new BitSet(new long[]{0x0000101000000002L});
	public static final BitSet FOLLOW_T_AS_in_getSelection6144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_getSelection6148 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_T_COMMA_in_getSelection6169 = new BitSet(new long[]{0x0001008040000000L,0x000000000C000020L});
	public static final BitSet FOLLOW_getSelector_in_getSelection6173 = new BitSet(new long[]{0x0000101000000002L});
	public static final BitSet FOLLOW_T_AS_in_getSelection6178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_getSelection6182 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_T_AGGREGATION_in_getSelector6237 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_T_MAX_in_getSelector6251 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_T_MIN_in_getSelector6265 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_T_AVG_in_getSelector6279 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_T_COUNT_in_getSelector6293 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_T_START_PARENTHESIS_in_getSelector6319 = new BitSet(new long[]{0x0201008040000000L,0x000000000C000020L});
	public static final BitSet FOLLOW_getSelector_in_getSelector6341 = new BitSet(new long[]{0x0200100000000000L});
	public static final BitSet FOLLOW_T_COMMA_in_getSelector6346 = new BitSet(new long[]{0x0001008040000000L,0x000000000C000020L});
	public static final BitSet FOLLOW_getSelector_in_getSelector6350 = new BitSet(new long[]{0x0200100000000000L});
	public static final BitSet FOLLOW_T_END_PARENTHESIS_in_getSelector6371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IDENT_in_getSelector6387 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
	public static final BitSet FOLLOW_T_START_PARENTHESIS_in_getSelector6419 = new BitSet(new long[]{0x0201008040000000L,0x000000000C000020L});
	public static final BitSet FOLLOW_getSelector_in_getSelector6424 = new BitSet(new long[]{0x0200100000000000L});
	public static final BitSet FOLLOW_T_COMMA_in_getSelector6429 = new BitSet(new long[]{0x0001008040000000L,0x000000000C000020L});
	public static final BitSet FOLLOW_getSelector_in_getSelector6433 = new BitSet(new long[]{0x0200100000000000L});
	public static final BitSet FOLLOW_T_END_PARENTHESIS_in_getSelector6458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_getListTypes6491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IDENT_in_getAssignment6522 = new BitSet(new long[]{0x0800000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_T_EQUAL_in_getAssignment6534 = new BitSet(new long[]{0x4000800000000000L,0x0440000000020020L,0x0000000000002000L});
	public static final BitSet FOLLOW_getValueAssign_in_getAssignment6538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_START_BRACKET_in_getAssignment6557 = new BitSet(new long[]{0x4000800000000000L,0x0440000000020020L,0x0000000000002000L});
	public static final BitSet FOLLOW_getTerm_in_getAssignment6561 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_T_END_BRACKET_in_getAssignment6563 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_T_EQUAL_in_getAssignment6565 = new BitSet(new long[]{0x4000800000000000L,0x0440000000020020L,0x0000000000002000L});
	public static final BitSet FOLLOW_getTerm_in_getAssignment6569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getTerm_in_getValueAssign6596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IDENT_in_getValueAssign6608 = new BitSet(new long[]{0x0000000000000000L,0x0010001000000000L});
	public static final BitSet FOLLOW_T_PLUS_in_getValueAssign6611 = new BitSet(new long[]{0x0000800000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_T_START_SBRACKET_in_getValueAssign6614 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_getMapLiteral_in_getValueAssign6618 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_T_END_SBRACKET_in_getValueAssign6620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getIntSetOrList_in_getValueAssign6660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_SUBTRACT_in_getValueAssign6704 = new BitSet(new long[]{0x0000800000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_getIntSetOrList_in_getValueAssign6708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_CONSTANT_in_getIntSetOrList6734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_START_BRACKET_in_getIntSetOrList6744 = new BitSet(new long[]{0x4000800000000000L,0x0440000000020020L,0x0000000000002000L});
	public static final BitSet FOLLOW_getList_in_getIntSetOrList6748 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_T_END_BRACKET_in_getIntSetOrList6750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_START_SBRACKET_in_getIntSetOrList6760 = new BitSet(new long[]{0x4000800000000000L,0x0440000000020020L,0x0000000000002000L});
	public static final BitSet FOLLOW_getSet_in_getIntSetOrList6764 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_T_END_SBRACKET_in_getIntSetOrList6766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_TOKEN_in_getRelation6784 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_T_START_PARENTHESIS_in_getRelation6786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_getIds_in_getRelation6790 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_T_END_PARENTHESIS_in_getRelation6792 = new BitSet(new long[]{0x0800000000000000L,0x0000000023080018L});
	public static final BitSet FOLLOW_getComparator_in_getRelation6796 = new BitSet(new long[]{0x4000800000000000L,0x0440000000020020L,0x0000000000002000L});
	public static final BitSet FOLLOW_getTerm_in_getRelation6800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IDENT_in_getRelation6812 = new BitSet(new long[]{0x0800010000000000L,0x0000000023080098L});
	public static final BitSet FOLLOW_getComparator_in_getRelation6818 = new BitSet(new long[]{0x4000800000000000L,0x0440000000020020L,0x0000000000002000L});
	public static final BitSet FOLLOW_getTerm_in_getRelation6822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IN_in_getRelation6848 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_T_START_PARENTHESIS_in_getRelation6850 = new BitSet(new long[]{0x4000800000000000L,0x0440000000020020L,0x0000000000002000L});
	public static final BitSet FOLLOW_getTerms_in_getRelation6854 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_T_END_PARENTHESIS_in_getRelation6856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_BETWEEN_in_getRelation6882 = new BitSet(new long[]{0x4000800000000000L,0x0440000000020020L,0x0000000000002000L});
	public static final BitSet FOLLOW_getTerm_in_getRelation6886 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_T_AND_in_getRelation6888 = new BitSet(new long[]{0x4000800000000000L,0x0440000000020020L,0x0000000000002000L});
	public static final BitSet FOLLOW_getTerm_in_getRelation6892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_EQUAL_in_getComparator6932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_GT_in_getComparator6942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_LT_in_getComparator6952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_GTE_in_getComparator6962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_LTE_in_getComparator6973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_NOT_EQUAL_in_getComparator6983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_LIKE_in_getComparator6994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IDENT_in_getIds7022 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_T_COMMA_in_getIds7027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_IDENT_in_getIds7031 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_getOption_in_getOptions7056 = new BitSet(new long[]{0x0000240000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_getOption_in_getOptions7063 = new BitSet(new long[]{0x0000240000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_T_COMPACT_in_getOption7083 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_T_STORAGE_in_getOption7085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_CLUSTERING_in_getOption7095 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_T_ORDER_in_getOption7097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IDENT_in_getOption7109 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_T_EQUAL_in_getOption7111 = new BitSet(new long[]{0xC000A40002000000L,0x0442000000000020L});
	public static final BitSet FOLLOW_getValueProperty_in_getOption7115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getTerm_in_getList7143 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_T_COMMA_in_getList7152 = new BitSet(new long[]{0x4000800000000000L,0x0440000000020020L,0x0000000000002000L});
	public static final BitSet FOLLOW_getTerm_in_getList7156 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_getTerm_in_getTerms7190 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_T_COMMA_in_getTerms7199 = new BitSet(new long[]{0x4000800000000000L,0x0440000000020020L,0x0000000000002000L});
	public static final BitSet FOLLOW_getTerm_in_getTerms7203 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_getTerm_in_getSet7237 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_T_COMMA_in_getSet7246 = new BitSet(new long[]{0x4000800000000000L,0x0440000000020020L,0x0000000000002000L});
	public static final BitSet FOLLOW_getTerm_in_getSet7250 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_getTerm_in_getTermOrLiteral7284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_START_SBRACKET_in_getTermOrLiteral7298 = new BitSet(new long[]{0x4400800000000000L,0x0440000000020020L,0x0000000000002000L});
	public static final BitSet FOLLOW_getTerm_in_getTermOrLiteral7316 = new BitSet(new long[]{0x0400100000000000L});
	public static final BitSet FOLLOW_T_COMMA_in_getTermOrLiteral7329 = new BitSet(new long[]{0x4000800000000000L,0x0440000000020020L,0x0000000000002000L});
	public static final BitSet FOLLOW_getTerm_in_getTermOrLiteral7333 = new BitSet(new long[]{0x0400100000000000L});
	public static final BitSet FOLLOW_T_END_SBRACKET_in_getTermOrLiteral7350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IDENT_in_getTableID7380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_KS_AND_TN_in_getTableID7396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IDENT_in_getTerm7421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_CONSTANT_in_getTerm7433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_141_in_getTerm7443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_FALSE_in_getTerm7453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_TRUE_in_getTerm7463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_KS_AND_TN_in_getTerm7475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_TERM_in_getTerm7487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_START_SBRACKET_in_getMapLiteral7513 = new BitSet(new long[]{0x4400800000000000L,0x0440000000020020L,0x0000000000002000L});
	public static final BitSet FOLLOW_getTerm_in_getMapLiteral7523 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_T_COLON_in_getMapLiteral7525 = new BitSet(new long[]{0x4000800000000000L,0x0440000000020020L,0x0000000000002000L});
	public static final BitSet FOLLOW_getTerm_in_getMapLiteral7529 = new BitSet(new long[]{0x0400100000000000L});
	public static final BitSet FOLLOW_T_COMMA_in_getMapLiteral7538 = new BitSet(new long[]{0x4000800000000000L,0x0440000000020020L,0x0000000000002000L});
	public static final BitSet FOLLOW_getTerm_in_getMapLiteral7542 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_T_COLON_in_getMapLiteral7544 = new BitSet(new long[]{0x4000800000000000L,0x0440000000020020L,0x0000000000002000L});
	public static final BitSet FOLLOW_getTerm_in_getMapLiteral7548 = new BitSet(new long[]{0x0400100000000000L});
	public static final BitSet FOLLOW_T_END_SBRACKET_in_getMapLiteral7560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_IDENT_in_getValueProperty7590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_CONSTANT_in_getValueProperty7602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getMapLiteral_in_getValueProperty7614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getFloat_in_getValueProperty7626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_FALSE_in_getValueProperty7636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_TRUE_in_getValueProperty7646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_COMPACT_in_getValueProperty7656 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_T_STORAGE_in_getValueProperty7658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_CLUSTERING_in_getValueProperty7668 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_T_ORDER_in_getValueProperty7670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTED_LITERAL_in_getValueProperty7682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_TERM_in_getFloat7707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_FLOAT_in_getFloat7725 = new BitSet(new long[]{0x0000000000000002L});
}