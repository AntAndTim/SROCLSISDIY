package parser;/* A Bison parser, made by GNU Bison 3.4.2.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java

   Copyright (C) 2007-2015, 2018 Free Software Foundation, Inc.

   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.

   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */





/**
 * A Bison parser, automatically generated from <tt>parser.y</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
class YYParser
{
    /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "3.4.2";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";





  

  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>YYParser</tt>.
   */
  public interface Lexer {
    /** Token returned by the scanner to signal the end of its input.  */
    public static final int EOF = 0;

/* Tokens.  */
    /** Token number,to be returned by the scanner.  */
    static final int NUM = 258;
    /** Token number,to be returned by the scanner.  */
    static final int INT = 259;
    /** Token number,to be returned by the scanner.  */
    static final int WHITESPACE = 260;
    /** Token number,to be returned by the scanner.  */
    static final int OPENING_CURLY_BRACES = 261;
    /** Token number,to be returned by the scanner.  */
    static final int CLOSING_CURLY_BRACES = 262;
    /** Token number,to be returned by the scanner.  */
    static final int OPENING_PARENTHESIS = 263;
    /** Token number,to be returned by the scanner.  */
    static final int CLOSING_PARENTHESIS = 264;
    /** Token number,to be returned by the scanner.  */
    static final int OPENING_BRACKETS = 265;
    /** Token number,to be returned by the scanner.  */
    static final int CLOSING_BRACKETS = 266;
    /** Token number,to be returned by the scanner.  */
    static final int DOUBLE_QUOTES = 267;
    /** Token number,to be returned by the scanner.  */
    static final int SINGLE_QUOTES = 268;
    /** Token number,to be returned by the scanner.  */
    static final int SINGLE_QUOTES_2 = 269;
    /** Token number,to be returned by the scanner.  */
    static final int COMMA = 270;
    /** Token number,to be returned by the scanner.  */
    static final int DOT = 271;
    /** Token number,to be returned by the scanner.  */
    static final int SEMICOLON = 272;
    /** Token number,to be returned by the scanner.  */
    static final int NEWLINE = 273;
    /** Token number,to be returned by the scanner.  */
    static final int IDENTIFIER = 274;
    /** Token number,to be returned by the scanner.  */
    static final int ABSTRACT = 275;
    /** Token number,to be returned by the scanner.  */
    static final int ARGUMENTS = 276;
    /** Token number,to be returned by the scanner.  */
    static final int BOOLEAN = 277;
    /** Token number,to be returned by the scanner.  */
    static final int BREAK = 278;
    /** Token number,to be returned by the scanner.  */
    static final int BYTE = 279;
    /** Token number,to be returned by the scanner.  */
    static final int CASE = 280;
    /** Token number,to be returned by the scanner.  */
    static final int CATCH = 281;
    /** Token number,to be returned by the scanner.  */
    static final int CHAR = 282;
    /** Token number,to be returned by the scanner.  */
    static final int CONST = 283;
    /** Token number,to be returned by the scanner.  */
    static final int CONTINUE = 284;
    /** Token number,to be returned by the scanner.  */
    static final int DEBUGGER = 285;
    /** Token number,to be returned by the scanner.  */
    static final int DEFAULT = 286;
    /** Token number,to be returned by the scanner.  */
    static final int DELETE = 287;
    /** Token number,to be returned by the scanner.  */
    static final int DO = 288;
    /** Token number,to be returned by the scanner.  */
    static final int DOUBLE = 289;
    /** Token number,to be returned by the scanner.  */
    static final int ELSE = 290;
    /** Token number,to be returned by the scanner.  */
    static final int EVAL = 291;
    /** Token number,to be returned by the scanner.  */
    static final int FALSE = 292;
    /** Token number,to be returned by the scanner.  */
    static final int FINAL = 293;
    /** Token number,to be returned by the scanner.  */
    static final int FINALLY = 294;
    /** Token number,to be returned by the scanner.  */
    static final int FLOAT = 295;
    /** Token number,to be returned by the scanner.  */
    static final int FOR = 296;
    /** Token number,to be returned by the scanner.  */
    static final int FUNCTION = 297;
    /** Token number,to be returned by the scanner.  */
    static final int GOTO = 298;
    /** Token number,to be returned by the scanner.  */
    static final int IF = 299;
    /** Token number,to be returned by the scanner.  */
    static final int IMPLEMENTS = 300;
    /** Token number,to be returned by the scanner.  */
    static final int IN = 301;
    /** Token number,to be returned by the scanner.  */
    static final int INSTANCEOF = 302;
    /** Token number,to be returned by the scanner.  */
    static final int INTERFACE = 303;
    /** Token number,to be returned by the scanner.  */
    static final int LET = 304;
    /** Token number,to be returned by the scanner.  */
    static final int LONG = 305;
    /** Token number,to be returned by the scanner.  */
    static final int NATIVE = 306;
    /** Token number,to be returned by the scanner.  */
    static final int NEW = 307;
    /** Token number,to be returned by the scanner.  */
    static final int NULL = 308;
    /** Token number,to be returned by the scanner.  */
    static final int PACKAGE = 309;
    /** Token number,to be returned by the scanner.  */
    static final int PRIVATE = 310;
    /** Token number,to be returned by the scanner.  */
    static final int PROTECTED = 311;
    /** Token number,to be returned by the scanner.  */
    static final int PUBLIC = 312;
    /** Token number,to be returned by the scanner.  */
    static final int RETURN = 313;
    /** Token number,to be returned by the scanner.  */
    static final int SHORT = 314;
    /** Token number,to be returned by the scanner.  */
    static final int STATIC = 315;
    /** Token number,to be returned by the scanner.  */
    static final int SWITCH = 316;
    /** Token number,to be returned by the scanner.  */
    static final int SYNCHRONIZED = 317;
    /** Token number,to be returned by the scanner.  */
    static final int THIS = 318;
    /** Token number,to be returned by the scanner.  */
    static final int THROW = 319;
    /** Token number,to be returned by the scanner.  */
    static final int THROWS = 320;
    /** Token number,to be returned by the scanner.  */
    static final int TRANSIENT = 321;
    /** Token number,to be returned by the scanner.  */
    static final int TRUE = 322;
    /** Token number,to be returned by the scanner.  */
    static final int TRY = 323;
    /** Token number,to be returned by the scanner.  */
    static final int TYPEOF = 324;
    /** Token number,to be returned by the scanner.  */
    static final int VAR = 325;
    /** Token number,to be returned by the scanner.  */
    static final int VOID = 326;
    /** Token number,to be returned by the scanner.  */
    static final int VOLATILE = 327;
    /** Token number,to be returned by the scanner.  */
    static final int WHILE = 328;
    /** Token number,to be returned by the scanner.  */
    static final int WITH = 329;
    /** Token number,to be returned by the scanner.  */
    static final int YIELD = 330;
    /** Token number,to be returned by the scanner.  */
    static final int CLASS = 331;
    /** Token number,to be returned by the scanner.  */
    static final int ENUM = 332;
    /** Token number,to be returned by the scanner.  */
    static final int EXPORT = 333;
    /** Token number,to be returned by the scanner.  */
    static final int EXTENDS = 334;
    /** Token number,to be returned by the scanner.  */
    static final int IMPORT = 335;
    /** Token number,to be returned by the scanner.  */
    static final int SUPER = 336;
    /** Token number,to be returned by the scanner.  */
    static final int NUMBER_LITERAL = 337;
    /** Token number,to be returned by the scanner.  */
    static final int ASSIGNMENT = 338;
    /** Token number,to be returned by the scanner.  */
    static final int ASSIGNMENT_WITH_INCREASE = 339;
    /** Token number,to be returned by the scanner.  */
    static final int ASSIGNMENT_WITH_DECREASE = 340;
    /** Token number,to be returned by the scanner.  */
    static final int ASSIGNMENT_WITH_MULTIPLICATION = 341;
    /** Token number,to be returned by the scanner.  */
    static final int ASSIGNMENT_WITH_DIVISION = 342;
    /** Token number,to be returned by the scanner.  */
    static final int ASSIGNMENT_WITH_REMAINDER = 343;
    /** Token number,to be returned by the scanner.  */
    static final int ASSIGNMENT_WITH_AND = 344;
    /** Token number,to be returned by the scanner.  */
    static final int ASSIGNMENT_WITH_OR = 345;
    /** Token number,to be returned by the scanner.  */
    static final int ASSIGNMENT_WITH_XOR = 346;
    /** Token number,to be returned by the scanner.  */
    static final int ASSIGNMENT_WITH_LEFT_SHIFT = 347;
    /** Token number,to be returned by the scanner.  */
    static final int ASSIGNMENT_WITH_RIGHT_SHIFT = 348;
    /** Token number,to be returned by the scanner.  */
    static final int ASSIGNMENT_WITH_UNSIGNED_RIGHT_SHIFT = 349;
    /** Token number,to be returned by the scanner.  */
    static final int TYPELESS_EQUALITY = 350;
    /** Token number,to be returned by the scanner.  */
    static final int TYPELESS_INEQUALITY = 351;
    /** Token number,to be returned by the scanner.  */
    static final int EQUALITY = 352;
    /** Token number,to be returned by the scanner.  */
    static final int INEQUALITY = 353;
    /** Token number,to be returned by the scanner.  */
    static final int GREATER = 354;
    /** Token number,to be returned by the scanner.  */
    static final int LESS = 355;
    /** Token number,to be returned by the scanner.  */
    static final int GREATER_OR_EQUAL = 356;
    /** Token number,to be returned by the scanner.  */
    static final int LESS_OR_EQUAL = 357;
    /** Token number,to be returned by the scanner.  */
    static final int PLUS = 358;
    /** Token number,to be returned by the scanner.  */
    static final int MINUS = 359;
    /** Token number,to be returned by the scanner.  */
    static final int MILTIPLICATION = 360;
    /** Token number,to be returned by the scanner.  */
    static final int DIVISION = 361;
    /** Token number,to be returned by the scanner.  */
    static final int REMAINDER = 362;
    /** Token number,to be returned by the scanner.  */
    static final int INCREMENT = 363;
    /** Token number,to be returned by the scanner.  */
    static final int DECREMENT = 364;
    /** Token number,to be returned by the scanner.  */
    static final int BITWISE_AND = 365;
    /** Token number,to be returned by the scanner.  */
    static final int BITWISE_OR = 366;
    /** Token number,to be returned by the scanner.  */
    static final int BITWISE_NOT = 367;
    /** Token number,to be returned by the scanner.  */
    static final int BITWISE_XOR = 368;
    /** Token number,to be returned by the scanner.  */
    static final int BITWISE_LEFT_SHIFT = 369;
    /** Token number,to be returned by the scanner.  */
    static final int BITWISE_RIGHT_SHIFT = 370;
    /** Token number,to be returned by the scanner.  */
    static final int BITWISE_UNSIGNED_RIGHT_SHIFT = 371;
    /** Token number,to be returned by the scanner.  */
    static final int LOGICAL_AND = 372;
    /** Token number,to be returned by the scanner.  */
    static final int LOGICAL_OR = 373;
    /** Token number,to be returned by the scanner.  */
    static final int LOGICAL_NOT = 374;
    /** Token number,to be returned by the scanner.  */
    static final int ARROW = 375;
    /** Token number,to be returned by the scanner.  */
    static final int UNKNOWN = 376;


    

    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.
     */
    token.Token getLVal ();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * of the token.
     * @return the token identifier corresponding to the next token.
     */
    int yylex () throws java.io.IOException;

    /**
     * Entry point for error reporting.  Emits an error
     * in a user-defined way.
     *
     * 
     * @param msg The string for the error message.
     */
     void yyerror (String msg);
  }

  /**
   * The object doing lexical analysis for us.
   */
  private Lexer yylexer;
  
  



  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  public YYParser (Lexer yylexer) 
  {
    
    this.yylexer = yylexer;
    
  }

  private java.io.PrintStream yyDebugStream = System.err;

  /**
   * Return the <tt>PrintStream</tt> on which the debugging output is
   * printed.
   */
  public final java.io.PrintStream getDebugStream () { return yyDebugStream; }

  /**
   * Set the <tt>PrintStream</tt> on which the debug output is printed.
   * @param s The stream that is used for debugging output.
   */
  public final void setDebugStream(java.io.PrintStream s) { yyDebugStream = s; }

  private int yydebug = 0;

  /**
   * Answer the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   */
  public final int getDebugLevel() { return yydebug; }

  /**
   * Set the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   * @param level The verbosity level for debugging output.
   */
  public final void setDebugLevel(int level) { yydebug = level; }

  /**
   * Print an error message via the lexer.
   *
   * @param msg The error message.
   */
  public final void yyerror (String msg)
  {
    yylexer.yyerror (msg);
  }


  protected final void yycdebug (String s) {
    if (yydebug > 0)
      yyDebugStream.println (s);
  }

  private final class YYStack {
    private int[] stateStack = new int[16];
    
    private token.Token[] valueStack = new token.Token[16];

    public int size = 16;
    public int height = -1;

    public final void push (int state, token.Token value                            ) {
      height++;
      if (size == height)
        {
          int[] newStateStack = new int[size * 2];
          System.arraycopy (stateStack, 0, newStateStack, 0, height);
          stateStack = newStateStack;
          

          token.Token[] newValueStack = new token.Token[size * 2];
          System.arraycopy (valueStack, 0, newValueStack, 0, height);
          valueStack = newValueStack;

          size *= 2;
        }

      stateStack[height] = state;
      
      valueStack[height] = value;
    }

    public final void pop () {
      pop (1);
    }

    public final void pop (int num) {
      // Avoid memory leaks... garbage collection is a white lie!
      if (num > 0) {
        java.util.Arrays.fill (valueStack, height - num + 1, height + 1, null);
        
      }
      height -= num;
    }

    public final int stateAt (int i) {
      return stateStack[height - i];
    }

    public final token.Token valueAt (int i) {
      return valueStack[height - i];
    }

    // Print the state stack on the debug stream.
    public void print (java.io.PrintStream out) {
      out.print ("Stack now");

      for (int i = 0; i <= height; i++)
        {
          out.print (' ');
          out.print (stateStack[i]);
        }
      out.println ();
    }
  }

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return success (<tt>true</tt>).
   */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).
   */
  public static final int YYABORT = 1;



  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.
   */
  public static final int YYERROR = 2;

  /**
   * Internal return codes that are not supported for user semantic
   * actions.
   */
  private static final int YYERRLAB = 3;
  private static final int YYNEWSTATE = 4;
  private static final int YYDEFAULT = 5;
  private static final int YYREDUCE = 6;
  private static final int YYERRLAB1 = 7;
  private static final int YYRETURN = 8;


  private int yyerrstatus_ = 0;


  /**
   * Return whether error recovery is being done.  In this state, the parser
   * reads token until it reaches a known state, and then restarts normal
   * operation.
   */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  /** Compute post-reduction state.
   * @param yystate   the current state
   * @param yysym     the nonterminal to push on the stack
   */
  private int yy_lr_goto_state_ (int yystate, int yysym)
  {
    int yyr = yypgoto_[yysym - yyntokens_] + yystate;
    if (0 <= yyr && yyr <= yylast_ && yycheck_[yyr] == yystate)
      return yytable_[yyr];
    else
      return yydefgoto_[yysym - yyntokens_];
  }

  private int yyaction (int yyn, YYStack yystack, int yylen) 
  {
    token.Token yyval;
    

    /* If YYLEN is nonzero, implement the default value of the action:
       '$$ = $1'.  Otherwise, use the top of the stack.

       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
    if (yylen > 0)
      yyval = yystack.valueAt (yylen - 1);
    else
      yyval = yystack.valueAt (0);

    yy_reduce_print (yyn, yystack);

    switch (yyn)
      {
        
/* "parser.java":539  */

        default: break;
      }

    yy_symbol_print ("-> $$ =", yyr1_[yyn], yyval);

    yystack.pop (yylen);
    yylen = 0;

    /* Shift the result of the reduction.  */
    int yystate = yy_lr_goto_state_ (yystack.stateAt (0), yyr1_[yyn]);
    yystack.push (yystate, yyval);
    return YYNEWSTATE;
  }



  /*--------------------------------.
  | Print this symbol on YYOUTPUT.  |
  `--------------------------------*/

  private void yy_symbol_print (String s, int yytype,
                                 token.Token yyvaluep                                 )
  {
    if (yydebug > 0)
    yycdebug (s + (yytype < yyntokens_ ? " token " : " nterm ")
              + yytname_[yytype] + " ("
              + (yyvaluep == null ? "(null)" : yyvaluep.toString ()) + ")");
  }


  /**
   * Parse input from the scanner that was specified at object construction
   * time.  Return whether the end of the input was reached successfully.
   *
   * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
   *          imply that there were no syntax errors.
   */
   public boolean parse () throws java.io.IOException

  {
    


    /* Lookahead and lookahead in internal form.  */
    int yychar = yyempty_;
    int yytoken = 0;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;
    YYStack yystack = new YYStack ();
    int label = YYNEWSTATE;

    /* Error handling.  */
    int yynerrs_ = 0;
    

    /* Semantic value of the lookahead.  */
    token.Token yylval = null;

    yycdebug ("Starting parse\n");
    yyerrstatus_ = 0;

    /* Initialize the stack.  */
    yystack.push (yystate, yylval );



    for (;;)
      switch (label)
      {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
           pushed when we come here.  */
      case YYNEWSTATE:
        yycdebug ("Entering state " + yystate + "\n");
        if (yydebug > 0)
          yystack.print (yyDebugStream);

        /* Accept?  */
        if (yystate == yyfinal_)
          return true;

        /* Take a decision.  First try without lookahead.  */
        yyn = yypact_[yystate];
        if (yy_pact_value_is_default_ (yyn))
          {
            label = YYDEFAULT;
            break;
          }

        /* Read a lookahead token.  */
        if (yychar == yyempty_)
          {


            yycdebug ("Reading a token: ");
            yychar = yylexer.yylex ();
            yylval = yylexer.getLVal ();

          }

        /* Convert token to internal form.  */
        if (yychar <= Lexer.EOF)
          {
            yychar = yytoken = Lexer.EOF;
            yycdebug ("Now at end of input.\n");
          }
        else
          {
            yytoken = yytranslate_ (yychar);
            yy_symbol_print ("Next token is", yytoken,
                             yylval);
          }

        /* If the proper action on seeing token YYTOKEN is to reduce or to
           detect an error, take that action.  */
        yyn += yytoken;
        if (yyn < 0 || yylast_ < yyn || yycheck_[yyn] != yytoken)
          label = YYDEFAULT;

        /* <= 0 means reduce or error.  */
        else if ((yyn = yytable_[yyn]) <= 0)
          {
            if (yy_table_value_is_error_ (yyn))
              label = YYERRLAB;
            else
              {
                yyn = -yyn;
                label = YYREDUCE;
              }
          }

        else
          {
            /* Shift the lookahead token.  */
            yy_symbol_print ("Shifting", yytoken,
                             yylval);

            /* Discard the token being shifted.  */
            yychar = yyempty_;

            /* Count tokens shifted since error; after three, turn off error
               status.  */
            if (yyerrstatus_ > 0)
              --yyerrstatus_;

            yystate = yyn;
            yystack.push (yystate, yylval);
            label = YYNEWSTATE;
          }
        break;

      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
      case YYDEFAULT:
        yyn = yydefact_[yystate];
        if (yyn == 0)
          label = YYERRLAB;
        else
          label = YYREDUCE;
        break;

      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
      case YYREDUCE:
        yylen = yyr2_[yyn];
        label = yyaction (yyn, yystack, yylen);
        yystate = yystack.stateAt (0);
        break;

      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
      case YYERRLAB:
        /* If not already recovering from an error, report this error.  */
        if (yyerrstatus_ == 0)
          {
            ++yynerrs_;
            if (yychar == yyempty_)
              yytoken = yyempty_;
            yyerror (yysyntax_error (yystate, yytoken));
          }

        
        if (yyerrstatus_ == 3)
          {
        /* If just tried and failed to reuse lookahead token after an
         error, discard it.  */

        if (yychar <= Lexer.EOF)
          {
          /* Return failure if at end of input.  */
          if (yychar == Lexer.EOF)
            return false;
          }
        else
            yychar = yyempty_;
          }

        /* Else will try to reuse lookahead token after shifting the error
           token.  */
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `-------------------------------------------------*/
      case YYERROR:

        
        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
        yystack.pop (yylen);
        yylen = 0;
        yystate = yystack.stateAt (0);
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
      case YYERRLAB1:
        yyerrstatus_ = 3;       /* Each real token shifted decrements this.  */

        for (;;)
          {
            yyn = yypact_[yystate];
            if (!yy_pact_value_is_default_ (yyn))
              {
                yyn += yyterror_;
                if (0 <= yyn && yyn <= yylast_ && yycheck_[yyn] == yyterror_)
                  {
                    yyn = yytable_[yyn];
                    if (0 < yyn)
                      break;
                  }
              }

            /* Pop the current state because it cannot handle the
             * error token.  */
            if (yystack.height == 0)
              return false;

            
            yystack.pop ();
            yystate = yystack.stateAt (0);
            if (yydebug > 0)
              yystack.print (yyDebugStream);
          }

        if (label == YYABORT)
            /* Leave the switch.  */
            break;



        /* Shift the error token.  */
        yy_symbol_print ("Shifting", yystos_[yyn],
                         yylval);

        yystate = yyn;
        yystack.push (yyn, yylval);
        label = YYNEWSTATE;
        break;

        /* Accept.  */
      case YYACCEPT:
        return true;

        /* Abort.  */
      case YYABORT:
        return false;
      }
}




  // Generate an error message.
  private String yysyntax_error (int yystate, int tok)
  {
    return "syntax error";
  }

  /**
   * Whether the given <code>yypact_</code> value indicates a defaulted state.
   * @param yyvalue   the value to check
   */
  private static boolean yy_pact_value_is_default_ (int yyvalue)
  {
    return yyvalue == yypact_ninf_;
  }

  /**
   * Whether the given <code>yytable_</code>
   * value indicates a syntax error.
   * @param yyvalue the value to check
   */
  private static boolean yy_table_value_is_error_ (int yyvalue)
  {
    return yyvalue == yytable_ninf_;
  }

  private static final byte yypact_ninf_ = -123;
  private static final byte yytable_ninf_ = -1;

  /* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
  private static final byte yypact_[] = yypact_init();
  private static final byte[] yypact_init()
  {
    return new byte[]
    {
       3,  -123,     7,  -122,  -122,  -123,     3,     3,     5,     6,
    -122,  -122,  -123,  -123
    };
  }

/* YYDEFACT[STATE-NUM] -- Default reduction number in state STATE-NUM.
   Performed when YYTABLE does not specify something else to do.  Zero
   means the default is an error.  */
  private static final byte yydefact_[] = yydefact_init();
  private static final byte[] yydefact_init()
  {
    return new byte[]
    {
       0,     6,     0,     2,     3,     1,     0,     0,     0,     0,
       4,     5,     7,     8
    };
  }

/* YYPGOTO[NTERM-NUM].  */
  private static final byte yypgoto_[] = yypgoto_init();
  private static final byte[] yypgoto_init()
  {
    return new byte[]
    {
    -123,  -123,  -123,    -2
    };
  }

/* YYDEFGOTO[NTERM-NUM].  */
  private static final byte yydefgoto_[] = yydefgoto_init();
  private static final byte[] yydefgoto_init()
  {
    return new byte[]
    {
      -1,     2,     3,     4
    };
  }

/* YYTABLE[YYPACT[STATE-NUM]] -- What to do in state STATE-NUM.  If
   positive, shift that token.  If negative, reduce the rule whose
   number is the opposite.  If YYTABLE_NINF, syntax error.  */
  private static final byte yytable_[] = yytable_init();
  private static final byte[] yytable_init()
  {
    return new byte[]
    {
       6,     7,     8,     9,    10,    11,     1,     5,    12,    13
    };
  }

private static final byte yycheck_[] = yycheck_init();
  private static final byte[] yycheck_init()
  {
    return new byte[]
    {
     122,   123,   124,   125,     6,     7,     3,     0,     3,     3
    };
  }

/* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
   symbol of state STATE-NUM.  */
  private static final short yystos_[] = yystos_init();
  private static final short[] yystos_init()
  {
    return new short[]
    {
       0,     3,   127,   128,   129,     0,   122,   123,   124,   125,
     129,   129,     3,     3
    };
  }

/* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final short yyr1_[] = yyr1_init();
  private static final short[] yyr1_init()
  {
    return new short[]
    {
       0,   126,   127,   128,   128,   128,   129,   129,   129
    };
  }

/* YYR2[YYN] -- Number of symbols on the right hand side of rule YYN.  */
  private static final byte yyr2_[] = yyr2_init();
  private static final byte[] yyr2_init()
  {
    return new byte[]
    {
       0,     2,     1,     1,     3,     3,     1,     3,     3
    };
  }

  /* YYTOKEN_NUMBER[YYLEX-NUM] -- Internal symbol number corresponding
      to YYLEX-NUM.  */
  private static final short yytoken_number_[] = yytoken_number_init();
  private static final short[] yytoken_number_init()
  {
    return new short[]
    {
       0,   256,   257,   258,   259,   260,   261,   262,   263,   264,
     265,   266,   267,   268,   269,   270,   271,   272,   273,   274,
     275,   276,   277,   278,   279,   280,   281,   282,   283,   284,
     285,   286,   287,   288,   289,   290,   291,   292,   293,   294,
     295,   296,   297,   298,   299,   300,   301,   302,   303,   304,
     305,   306,   307,   308,   309,   310,   311,   312,   313,   314,
     315,   316,   317,   318,   319,   320,   321,   322,   323,   324,
     325,   326,   327,   328,   329,   330,   331,   332,   333,   334,
     335,   336,   337,   338,   339,   340,   341,   342,   343,   344,
     345,   346,   347,   348,   349,   350,   351,   352,   353,   354,
     355,   356,   357,   358,   359,   360,   361,   362,   363,   364,
     365,   366,   367,   368,   369,   370,   371,   372,   373,   374,
     375,   376,    43,    45,    42,    47
    };
  }

  /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
     First, the terminals, then, starting at \a yyntokens_, nonterminals.  */
  private static final String yytname_[] = yytname_init();
  private static final String[] yytname_init()
  {
    return new String[]
    {
  "$end", "error", "$undefined", "NUM", "INT", "WHITESPACE",
  "OPENING_CURLY_BRACES", "CLOSING_CURLY_BRACES", "OPENING_PARENTHESIS",
  "CLOSING_PARENTHESIS", "OPENING_BRACKETS", "CLOSING_BRACKETS",
  "DOUBLE_QUOTES", "SINGLE_QUOTES", "SINGLE_QUOTES_2", "COMMA", "DOT",
  "SEMICOLON", "NEWLINE", "IDENTIFIER", "ABSTRACT", "ARGUMENTS", "BOOLEAN",
  "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CONST", "CONTINUE",
  "DEBUGGER", "DEFAULT", "DELETE", "DO", "DOUBLE", "ELSE", "EVAL", "FALSE",
  "FINAL", "FINALLY", "FLOAT", "FOR", "FUNCTION", "GOTO", "IF",
  "IMPLEMENTS", "IN", "INSTANCEOF", "INTERFACE", "LET", "LONG", "NATIVE",
  "NEW", "NULL", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN",
  "SHORT", "STATIC", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS",
  "TRANSIENT", "TRUE", "TRY", "TYPEOF", "VAR", "VOID", "VOLATILE", "WHILE",
  "WITH", "YIELD", "CLASS", "ENUM", "EXPORT", "EXTENDS", "IMPORT", "SUPER",
  "NUMBER_LITERAL", "ASSIGNMENT", "ASSIGNMENT_WITH_INCREASE",
  "ASSIGNMENT_WITH_DECREASE", "ASSIGNMENT_WITH_MULTIPLICATION",
  "ASSIGNMENT_WITH_DIVISION", "ASSIGNMENT_WITH_REMAINDER",
  "ASSIGNMENT_WITH_AND", "ASSIGNMENT_WITH_OR", "ASSIGNMENT_WITH_XOR",
  "ASSIGNMENT_WITH_LEFT_SHIFT", "ASSIGNMENT_WITH_RIGHT_SHIFT",
  "ASSIGNMENT_WITH_UNSIGNED_RIGHT_SHIFT", "TYPELESS_EQUALITY",
  "TYPELESS_INEQUALITY", "EQUALITY", "INEQUALITY", "GREATER", "LESS",
  "GREATER_OR_EQUAL", "LESS_OR_EQUAL", "PLUS", "MINUS", "MILTIPLICATION",
  "DIVISION", "REMAINDER", "INCREMENT", "DECREMENT", "BITWISE_AND",
  "BITWISE_OR", "BITWISE_NOT", "BITWISE_XOR", "BITWISE_LEFT_SHIFT",
  "BITWISE_RIGHT_SHIFT", "BITWISE_UNSIGNED_RIGHT_SHIFT", "LOGICAL_AND",
  "LOGICAL_OR", "LOGICAL_NOT", "ARROW", "UNKNOWN", "'+'", "'-'", "'*'",
  "'/'", "$accept", "EVALUATE", "EXPR", "TERM", null
    };
  }

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short yyrline_[] = yyrline_init();
  private static final short[] yyrline_init()
  {
    return new short[]
    {
       0,   129,   129,   131,   132,   133,   136,   137,   138
    };
  }


  // Report on the debug stream that the rule yyrule is going to be reduced.
  private void yy_reduce_print (int yyrule, YYStack yystack)
  {
    if (yydebug == 0)
      return;

    int yylno = yyrline_[yyrule];
    int yynrhs = yyr2_[yyrule];
    /* Print the symbols being reduced, and their result.  */
    yycdebug ("Reducing stack by rule " + (yyrule - 1)
              + " (line " + yylno + "), ");

    /* The symbols being reduced.  */
    for (int yyi = 0; yyi < yynrhs; yyi++)
      yy_symbol_print ("   $" + (yyi + 1) + " =",
                       yystos_[yystack.stateAt(yynrhs - (yyi + 1))],
                       yystack.valueAt ((yynrhs) - (yyi + 1)));
  }

  /* YYTRANSLATE(TOKEN-NUM) -- Symbol number corresponding to TOKEN-NUM
     as returned by yylex, with out-of-bounds checking.  */
  private static final byte yytranslate_table_[] = yytranslate_table_init();
  private static final byte[] yytranslate_table_init()
  {
    return new byte[]
    {
       0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,   124,   122,     2,   123,     2,   125,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    31,    32,    33,    34,
      35,    36,    37,    38,    39,    40,    41,    42,    43,    44,
      45,    46,    47,    48,    49,    50,    51,    52,    53,    54,
      55,    56,    57,    58,    59,    60,    61,    62,    63,    64,
      65,    66,    67,    68,    69,    70,    71,    72,    73,    74,
      75,    76,    77,    78,    79,    80,    81,    82,    83,    84,
      85,    86,    87,    88,    89,    90,    91,    92,    93,    94,
      95,    96,    97,    98,    99,   100,   101,   102,   103,   104,
     105,   106,   107,   108,   109,   110,   111,   112,   113,   114,
     115,   116,   117,   118,   119,   120,   121
    };
  }

  private static final byte yytranslate_ (int t)
  {
    if (t >= 0 && t <= yyuser_token_number_max_)
      return yytranslate_table_[t];
    else
      return yyundef_token_;
  }

  private static final int yylast_ = 9;
  private static final int yynnts_ = 4;
  private static final int yyempty_ = -2;
  private static final int yyfinal_ = 5;
  private static final int yyterror_ = 1;
  private static final int yyerrcode_ = 256;
  private static final int yyntokens_ = 126;

  private static final int yyuser_token_number_max_ = 376;
  private static final int yyundef_token_ = 2;

/* User implementation code.  */

}

/* "parser.y":141  */

