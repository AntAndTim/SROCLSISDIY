/* A Bison parser, made by GNU Bison 3.4.2.  */

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




/* "%code imports" blocks.  */
/* "parser.y":3  */

package parser;

import ast.*;
import utils.Pair;

import java.util.ArrayList;

/* "parser.java":47  */

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
    static final int OPENING_CURLY_BRACES = 258;
    /** Token number,to be returned by the scanner.  */
    static final int CLOSING_CURLY_BRACES = 259;
    /** Token number,to be returned by the scanner.  */
    static final int OPENING_PARENTHESIS = 260;
    /** Token number,to be returned by the scanner.  */
    static final int CLOSING_PARENTHESIS = 261;
    /** Token number,to be returned by the scanner.  */
    static final int OPENING_BRACKETS = 262;
    /** Token number,to be returned by the scanner.  */
    static final int CLOSING_BRACKETS = 263;
    /** Token number,to be returned by the scanner.  */
    static final int COMMA = 264;
    /** Token number,to be returned by the scanner.  */
    static final int DOT = 265;
    /** Token number,to be returned by the scanner.  */
    static final int IDENTIFIER = 266;
    /** Token number,to be returned by the scanner.  */
    static final int ELSE = 267;
    /** Token number,to be returned by the scanner.  */
    static final int FALSE = 268;
    /** Token number,to be returned by the scanner.  */
    static final int IF = 269;
    /** Token number,to be returned by the scanner.  */
    static final int IN = 270;
    /** Token number,to be returned by the scanner.  */
    static final int THIS = 271;
    /** Token number,to be returned by the scanner.  */
    static final int TRUE = 272;
    /** Token number,to be returned by the scanner.  */
    static final int VAR = 273;
    /** Token number,to be returned by the scanner.  */
    static final int WHILE = 274;
    /** Token number,to be returned by the scanner.  */
    static final int CLASS = 275;
    /** Token number,to be returned by the scanner.  */
    static final int EXTENDS = 276;
    /** Token number,to be returned by the scanner.  */
    static final int ASSIGNMENT = 277;
    /** Token number,to be returned by the scanner.  */
    static final int COLON = 278;
    /** Token number,to be returned by the scanner.  */
    static final int UNKNOWN = 279;
    /** Token number,to be returned by the scanner.  */
    static final int RETURN = 280;
    /** Token number,to be returned by the scanner.  */
    static final int IS = 281;
    /** Token number,to be returned by the scanner.  */
    static final int END = 282;
    /** Token number,to be returned by the scanner.  */
    static final int LOOP = 283;
    /** Token number,to be returned by the scanner.  */
    static final int THEN = 284;
    /** Token number,to be returned by the scanner.  */
    static final int METHOD = 285;
    /** Token number,to be returned by the scanner.  */
    static final int INTEGER = 286;
    /** Token number,to be returned by the scanner.  */
    static final int REAL = 287;


    

    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.
     */
    Object getLVal ();

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
    
    private Object[] valueStack = new Object[16];

    public int size = 16;
    public int height = -1;

    public final void push (int state, Object value                            ) {
      height++;
      if (size == height)
        {
          int[] newStateStack = new int[size * 2];
          System.arraycopy (stateStack, 0, newStateStack, 0, height);
          stateStack = newStateStack;
          

          Object[] newValueStack = new Object[size * 2];
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

    public final Object valueAt (int i) {
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
    Object yyval;
    

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
          case 2:
  if (yyn == 2)
    /* "parser.y":85  */
    {root = new ProgramNode(((ArrayList<ClassDeclNode>)(yystack.valueAt (0))));};
  break;
    

  case 3:
  if (yyn == 3)
    /* "parser.y":89  */
    {yyval = new ArrayList<ClassDeclNode>();};
  break;
    

  case 4:
  if (yyn == 4)
    /* "parser.y":90  */
    { ((ArrayList<ClassDeclNode>)(yystack.valueAt (0))).add(((ast.ClassDeclNode)(yystack.valueAt (1)))); yyval=((ArrayList<ClassDeclNode>)(yystack.valueAt (0))); };
  break;
    

  case 5:
  if (yyn == 5)
    /* "parser.y":94  */
    {yyval = new ClassDeclNode(((ast.ClassNameNode)(yystack.valueAt (4))), ((ast.ClassNameNode)(yystack.valueAt (3))), ((ArrayList<MemberDeclNode>)(yystack.valueAt (1))));};
  break;
    

  case 6:
  if (yyn == 6)
    /* "parser.y":98  */
    {yyval = null;};
  break;
    

  case 7:
  if (yyn == 7)
    /* "parser.y":99  */
    {yyval = ((ast.ClassNameNode)(yystack.valueAt (0)));};
  break;
    

  case 8:
  if (yyn == 8)
    /* "parser.y":103  */
    {yyval = new ast.ClassNameNode(new ast.IdentNode(((token.Token)(yystack.valueAt (0))).getValue()), null);};
  break;
    

  case 9:
  if (yyn == 9)
    /* "parser.y":104  */
    {yyval = new ast.ClassNameNode(new ast.IdentNode(((token.Token)(yystack.valueAt (3))).getValue()), ((ast.ClassNameNode)(yystack.valueAt (1))));};
  break;
    

  case 10:
  if (yyn == 10)
    /* "parser.y":108  */
    {yyval = new ArrayList<MemberDeclNode>();};
  break;
    

  case 11:
  if (yyn == 11)
    /* "parser.y":109  */
    {((ArrayList<MemberDeclNode>)(yystack.valueAt (0))).add(((ast.MemberDeclNode)(yystack.valueAt (1)))); yyval = ((ArrayList<MemberDeclNode>)(yystack.valueAt (0)));};
  break;
    

  case 12:
  if (yyn == 12)
    /* "parser.y":113  */
    {MemberDeclNode node = new MemberDeclNode(); node.declaration = ((ast.VariableDeclNode)(yystack.valueAt (0))); node.declType = MemberDeclNode.memberType.FIELD; yyval = node;};
  break;
    

  case 13:
  if (yyn == 13)
    /* "parser.y":114  */
    {MemberDeclNode node = new MemberDeclNode(); node.declaration = ((ast.MethodDeclNode)(yystack.valueAt (0))); node.declType = MemberDeclNode.memberType.FIELD; yyval = node;};
  break;
    

  case 14:
  if (yyn == 14)
    /* "parser.y":115  */
    {MemberDeclNode node = new MemberDeclNode(); node.declaration = ((ast.ConstructorDeclNode)(yystack.valueAt (0))); node.declType = MemberDeclNode.memberType.FIELD; yyval = node;};
  break;
    

  case 15:
  if (yyn == 15)
    /* "parser.y":119  */
    {yyval = new ast.VariableDeclNode(new IdentNode(((token.Token)(yystack.valueAt (2))).getValue()),((ast.ExpressionNode)(yystack.valueAt (0))));};
  break;
    

  case 16:
  if (yyn == 16)
    /* "parser.y":123  */
    {yyval = new ast.MethodDeclNode(new ast.IdentNode(((token.Token)(yystack.valueAt (5))).getValue()),((ArrayList<ParamsDeclNode>)(yystack.valueAt (4))),((ast.IdentNode)(yystack.valueAt (3))),new ast.BodyNode(((ArrayList<ast.Node>)(yystack.valueAt (1)))));};
  break;
    

  case 17:
  if (yyn == 17)
    /* "parser.y":127  */
    {yyval = null;};
  break;
    

  case 18:
  if (yyn == 18)
    /* "parser.y":128  */
    {yyval = new IdentNode(((token.Token)(yystack.valueAt (0))).getValue());};
  break;
    

  case 19:
  if (yyn == 19)
    /* "parser.y":132  */
    {yyval = new ArrayList<ParamsDeclNode>();};
  break;
    

  case 20:
  if (yyn == 20)
    /* "parser.y":133  */
    {yyval = ((ArrayList<ParamsDeclNode>)(yystack.valueAt (1)));};
  break;
    

  case 21:
  if (yyn == 21)
    /* "parser.y":137  */
    {ArrayList<ParamsDeclNode> params = new ArrayList<ParamsDeclNode>(); params.add(((ast.ParamsDeclNode)(yystack.valueAt (0)))); yyval = params;};
  break;
    

  case 22:
  if (yyn == 22)
    /* "parser.y":138  */
    { ((ArrayList<ParamsDeclNode>)(yystack.valueAt (2))).add(((ast.ParamsDeclNode)(yystack.valueAt (0)))); };
  break;
    

  case 23:
  if (yyn == 23)
    /* "parser.y":142  */
    {yyval = new ParamsDeclNode(new IdentNode(((token.Token)(yystack.valueAt (2))).getValue()), new TypeNode(((ast.ClassNameNode)(yystack.valueAt (0))).ident, ((ast.ClassNameNode)(yystack.valueAt (0))).generics));};
  break;
    

  case 24:
  if (yyn == 24)
    /* "parser.y":146  */
    {yyval = new ArrayList<Node>();};
  break;
    

  case 25:
  if (yyn == 25)
    /* "parser.y":147  */
    {((ArrayList<ast.Node>)(yystack.valueAt (0))).addAll(((ArrayList<ast.Node>)(yystack.valueAt (1))));};
  break;
    

  case 26:
  if (yyn == 26)
    /* "parser.y":151  */
    {yyval = ((ArrayList<ast.Node>)(yystack.valueAt (0)));};
  break;
    

  case 27:
  if (yyn == 27)
    /* "parser.y":152  */
    {yyval = ((ArrayList<ast.Node>)(yystack.valueAt (0)));};
  break;
    

  case 28:
  if (yyn == 28)
    /* "parser.y":156  */
    {yyval = new ArrayList<ast.Node>();};
  break;
    

  case 29:
  if (yyn == 29)
    /* "parser.y":157  */
    {((ArrayList<ast.Node>)(yystack.valueAt (0))).add(((ast.VariableDeclNode)(yystack.valueAt (1)))); yyval = ((ArrayList<ast.Node>)(yystack.valueAt (0)));};
  break;
    

  case 30:
  if (yyn == 30)
    /* "parser.y":161  */
    {yyval = new ArrayList<ast.Node>();};
  break;
    

  case 31:
  if (yyn == 31)
    /* "parser.y":162  */
    {((ArrayList<ast.Node>)(yystack.valueAt (0))).add(((ast.Node)(yystack.valueAt (1)))); yyval = ((ArrayList<ast.Node>)(yystack.valueAt (0)));};
  break;
    

  case 32:
  if (yyn == 32)
    /* "parser.y":166  */
    {yyval = new ast.ConstructorDeclNode(((ArrayList<ParamsDeclNode>)(yystack.valueAt (3))),new BodyNode(((ArrayList<ast.Node>)(yystack.valueAt (1)))));};
  break;
    

  case 33:
  if (yyn == 33)
    /* "parser.y":170  */
    {yyval = ((ast.AssignmentNode)(yystack.valueAt (0)));};
  break;
    

  case 34:
  if (yyn == 34)
    /* "parser.y":171  */
    {yyval = ((ast.WhileLoopNode)(yystack.valueAt (0)));};
  break;
    

  case 35:
  if (yyn == 35)
    /* "parser.y":172  */
    {yyval = ((ast.IfStatementNode)(yystack.valueAt (0)));};
  break;
    

  case 36:
  if (yyn == 36)
    /* "parser.y":173  */
    {yyval = ((ast.ReturnStatement)(yystack.valueAt (0)));};
  break;
    

  case 37:
  if (yyn == 37)
    /* "parser.y":174  */
    {yyval = ((ast.ExpressionNode)(yystack.valueAt (0)));};
  break;
    

  case 38:
  if (yyn == 38)
    /* "parser.y":189  */
    {yyval = new AssignmentNode(new IdentNode(((token.Token)(yystack.valueAt (2))).getValue()), ((ast.ExpressionNode)(yystack.valueAt (0))));};
  break;
    

  case 39:
  if (yyn == 39)
    /* "parser.y":193  */
    {yyval = new WhileLoopNode(((ast.ExpressionNode)(yystack.valueAt (3))), new BodyNode(((ArrayList<ast.Node>)(yystack.valueAt (1)))));};
  break;
    

  case 40:
  if (yyn == 40)
    /* "parser.y":197  */
    {yyval = new IfStatementNode(((ast.ExpressionNode)(yystack.valueAt (3))), new BodyNode(((ArrayList<ast.Node>)(yystack.valueAt (1)))));};
  break;
    

  case 41:
  if (yyn == 41)
    /* "parser.y":198  */
    {yyval = new IfStatementNode(((ast.ExpressionNode)(yystack.valueAt (5))), new BodyNode(((ArrayList<ast.Node>)(yystack.valueAt (3)))), new BodyNode(((ArrayList<ast.Node>)(yystack.valueAt (1)))));};
  break;
    

  case 42:
  if (yyn == 42)
    /* "parser.y":202  */
    {yyval = new ReturnStatement(null);};
  break;
    

  case 43:
  if (yyn == 43)
    /* "parser.y":203  */
    {yyval = new ReturnStatement(((ast.ExpressionNode)(yystack.valueAt (0))));};
  break;
    

  case 44:
  if (yyn == 44)
    /* "parser.y":207  */
    {yyval = new ExpressionNode(((ast.Node)(yystack.valueAt (0))), null)};
  break;
    

  case 45:
  if (yyn == 45)
    /* "parser.y":208  */
    {yyval = new ExpressionNode(((ast.Node)(yystack.valueAt (1))), ((ArrayList<Pair<IdentNode, ArrayList<ExpressionNode>>>)(yystack.valueAt (0))))};
  break;
    

  case 46:
  if (yyn == 46)
    /* "parser.y":213  */
    {ArrayList<Pair<IdentNode, ArrayList<ExpressionNode>>> list = new ArrayList<Pair<IdentNode, ArrayList<ExpressionNode>>>(); list.add(((Pair<IdentNode, ArrayList<ExpressionNode>>)(yystack.valueAt (0)))); yyval = list;};
  break;
    

  case 47:
  if (yyn == 47)
    /* "parser.y":214  */
    {((ArrayList<Pair<IdentNode, ArrayList<ExpressionNode>>>)(yystack.valueAt (1))).add(((Pair<IdentNode, ArrayList<ExpressionNode>>)(yystack.valueAt (0)))); yyval = ((ArrayList<Pair<IdentNode, ArrayList<ExpressionNode>>>)(yystack.valueAt (1)));};
  break;
    

  case 48:
  if (yyn == 48)
    /* "parser.y":218  */
    {Pair<IdentNode, ArrayList<ExpressionNode>> component = new Pair<IdentNode, ArrayList<ExpressionNode>>(new IdentNode(((token.Token)(yystack.valueAt (1))).getValue()), ((ArrayList<ExpressionNode>)(yystack.valueAt (0)))); yyval = component;};
  break;
    

  case 49:
  if (yyn == 49)
    /* "parser.y":223  */
    {yyval = new ArrayList<ExpressionNode>();};
  break;
    

  case 50:
  if (yyn == 50)
    /* "parser.y":224  */
    {yyval = ((ArrayList<ExpressionNode>)(yystack.valueAt (1)));};
  break;
    

  case 51:
  if (yyn == 51)
    /* "parser.y":230  */
    {ArrayList<ExpressionNode> list = new ArrayList<ExpressionNode>(); list.add(((ast.ExpressionNode)(yystack.valueAt (0)))); yyval = list;};
  break;
    

  case 52:
  if (yyn == 52)
    /* "parser.y":231  */
    {((ArrayList<ExpressionNode>)(yystack.valueAt (2))).add(((ast.ExpressionNode)(yystack.valueAt (0)))); yyval = ((ArrayList<ExpressionNode>)(yystack.valueAt (2)));};
  break;
    

  case 53:
  if (yyn == 53)
    /* "parser.y":235  */
    {yyval = new IntegerLitNode(((token.Token)(yystack.valueAt (0))).getValue());};
  break;
    

  case 54:
  if (yyn == 54)
    /* "parser.y":236  */
    {yyval = new RealLitNode(((token.Token)(yystack.valueAt (0))).getValue());};
  break;
    

  case 55:
  if (yyn == 55)
    /* "parser.y":237  */
    {yyval = ((ast.BooleanLitNode)(yystack.valueAt (0)))};
  break;
    

  case 56:
  if (yyn == 56)
    /* "parser.y":238  */
    {yyval = null;};
  break;
    

  case 57:
  if (yyn == 57)
    /* "parser.y":239  */
    {yyval = ((ast.ClassNameNode)(yystack.valueAt (0)));};
  break;
    

  case 58:
  if (yyn == 58)
    /* "parser.y":243  */
    {yyval = new BooleanLitNode("True");};
  break;
    

  case 59:
  if (yyn == 59)
    /* "parser.y":244  */
    {yyval = new BooleanLitNode("False");};
  break;
    


/* "parser.java":778  */

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
                                 Object yyvaluep                                 )
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
    Object yylval = null;

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

  private static final byte yypact_ninf_ = -52;
  private static final byte yytable_ninf_ = -1;

  /* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
  private static final byte yypact_[] = yypact_init();
  private static final byte[] yypact_init()
  {
    return new byte[]
    {
      -5,    14,    16,   -52,    -5,    19,     9,   -52,   -52,    14,
      14,    10,    30,   -52,     5,   -52,    34,    33,    35,    18,
       5,   -52,   -52,   -52,     8,    21,    25,    34,   -52,   -52,
     -52,    26,     0,   -52,    39,    50,    36,    14,   -52,    40,
      -4,   -52,    50,   -52,   -52,    50,    50,   -52,   -52,   -52,
      42,    41,    39,   -52,   -52,    61,   -52,   -52,   -52,   -52,
     -52,    52,   -52,   -52,    58,    47,   -52,   -52,    50,    54,
      48,   -52,   -52,   -52,   -52,   -52,    68,    52,   -52,   -52,
      39,   -52,    39,    39,    79,   -52,    60,    -7,    62,    11,
     -52,   -52,    39,   -52,   -52,   -52,   -52,    28,    63,   -52,
      50,   -52,   -52
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
       3,     0,     0,     2,     3,     8,     6,     1,     4,     0,
       0,     0,     0,     7,    10,     9,     0,     0,     0,     0,
      10,    12,    13,    14,     0,     0,     0,     0,     5,    11,
      19,     0,     0,    21,    24,     0,    17,     0,    20,     0,
       8,    59,     0,    56,    58,     0,    42,    53,    54,    57,
      28,     0,    24,    26,    27,    30,    33,    34,    35,    36,
      37,    44,    55,    15,     0,     0,    23,    22,     0,     0,
       0,    43,    29,    32,    25,    31,     0,    45,    46,    18,
      24,    38,    24,    24,     0,    47,     0,     0,     0,     0,
      48,    16,    24,    40,    39,    49,    51,     0,     0,    50,
       0,    41,    52
    };
  }

/* YYPGOTO[NTERM-NUM].  */
  private static final byte yypgoto_[] = yypgoto_init();
  private static final byte[] yypgoto_init()
  {
    return new byte[]
    {
     -52,   -52,    81,   -52,   -52,     3,    71,   -52,   -12,   -52,
     -52,    67,   -52,    49,   -51,   -52,    45,    43,   -52,   -52,
     -52,   -52,   -52,   -52,   -35,   -52,    20,   -52,   -52,   -52,
     -52
    };
  }

/* YYDEFGOTO[NTERM-NUM].  */
  private static final byte yydefgoto_[] = yydefgoto_init();
  private static final byte[] yydefgoto_init()
  {
    return new byte[]
    {
      -1,     2,     3,     4,    11,    49,    19,    20,    50,    22,
      65,    25,    32,    33,    51,    52,    53,    54,    23,    55,
      56,    57,    58,    59,    60,    77,    78,    90,    97,    61,
      62
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
      63,    74,    21,     9,     6,    92,    38,    69,    21,    39,
      70,    71,    12,    13,    30,     1,     7,    95,    68,    31,
      93,    16,     5,    17,    41,     5,     9,    43,    44,    86,
      10,    87,    88,    81,    99,    18,    14,   100,    15,    24,
      66,    98,    47,    48,    26,    28,    27,    34,    35,    37,
      40,    31,    41,    42,    96,    43,    44,    17,    45,    64,
      17,     5,    76,    41,    46,   102,    43,    44,    73,    79,
      47,    48,    40,    80,    41,    42,    83,    43,    44,    84,
      45,    47,    48,    82,    89,     8,    46,    91,    67,    94,
     101,    29,    47,    48,    36,    72,     0,    85,    75
    };
  }

private static final byte yycheck_[] = yycheck_init();
  private static final byte[] yycheck_init()
  {
    return new byte[]
    {
      35,    52,    14,     7,     1,    12,     6,    42,    20,     9,
      45,    46,     9,    10,     6,    20,     0,     6,    22,    11,
      27,    16,    11,    18,    13,    11,     7,    16,    17,    80,
      21,    82,    83,    68,     6,    30,    26,     9,     8,     5,
      37,    92,    31,    32,    11,    27,    11,    26,    23,    23,
      11,    11,    13,    14,    89,    16,    17,    18,    19,    23,
      18,    11,    10,    13,    25,   100,    16,    17,    27,    11,
      31,    32,    11,    26,    13,    14,    28,    16,    17,    11,
      19,    31,    32,    29,     5,     4,    25,    27,    39,    27,
      27,    20,    31,    32,    27,    50,    -1,    77,    55
    };
  }

/* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
   symbol of state STATE-NUM.  */
  private static final byte yystos_[] = yystos_init();
  private static final byte[] yystos_init()
  {
    return new byte[]
    {
       0,    20,    34,    35,    36,    11,    38,     0,    35,     7,
      21,    37,    38,    38,    26,     8,    16,    18,    30,    39,
      40,    41,    42,    51,     5,    44,    11,    11,    27,    39,
       6,    11,    45,    46,    26,    23,    44,    23,     6,     9,
      11,    13,    14,    16,    17,    19,    25,    31,    32,    38,
      41,    47,    48,    49,    50,    52,    53,    54,    55,    56,
      57,    62,    63,    57,    23,    43,    38,    46,    22,    57,
      57,    57,    49,    27,    47,    50,    10,    58,    59,    11,
      26,    57,    29,    28,    11,    59,    47,    47,    47,     5,
      60,    27,    12,    27,    27,     6,    57,    61,    47,     6,
       9,    27,    57
    };
  }

/* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final byte yyr1_[] = yyr1_init();
  private static final byte[] yyr1_init()
  {
    return new byte[]
    {
       0,    33,    34,    35,    35,    36,    37,    37,    38,    38,
      39,    39,    40,    40,    40,    41,    42,    43,    43,    44,
      44,    45,    45,    46,    47,    47,    48,    48,    49,    49,
      50,    50,    51,    52,    52,    52,    52,    52,    53,    54,
      55,    55,    56,    56,    57,    57,    58,    58,    59,    60,
      60,    61,    61,    62,    62,    62,    62,    62,    63,    63
    };
  }

/* YYR2[YYN] -- Number of symbols on the right hand side of rule YYN.  */
  private static final byte yyr2_[] = yyr2_init();
  private static final byte[] yyr2_init()
  {
    return new byte[]
    {
       0,     2,     1,     0,     2,     6,     0,     2,     1,     4,
       0,     2,     1,     1,     1,     4,     7,     0,     2,     2,
       3,     1,     3,     3,     0,     2,     1,     1,     0,     2,
       0,     2,     5,     1,     1,     1,     1,     1,     3,     5,
       5,     7,     1,     2,     1,     2,     1,     2,     3,     2,
       3,     1,     3,     1,     1,     1,     1,     1,     1,     1
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
     285,   286,   287
    };
  }

  /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
     First, the terminals, then, starting at \a yyntokens_, nonterminals.  */
  private static final String yytname_[] = yytname_init();
  private static final String[] yytname_init()
  {
    return new String[]
    {
  "$end", "error", "$undefined", "OPENING_CURLY_BRACES",
  "CLOSING_CURLY_BRACES", "OPENING_PARENTHESIS", "CLOSING_PARENTHESIS",
  "OPENING_BRACKETS", "CLOSING_BRACKETS", "COMMA", "DOT", "IDENTIFIER",
  "ELSE", "FALSE", "IF", "IN", "THIS", "TRUE", "VAR", "WHILE", "CLASS",
  "EXTENDS", "ASSIGNMENT", "COLON", "UNKNOWN", "RETURN", "IS", "END",
  "LOOP", "THEN", "METHOD", "INTEGER", "REAL", "$accept", "Program",
  "ClassDeclarations", "ClassDeclaration", "Extends", "ClassName",
  "MemberDeclarations", "MemberDeclaration", "VariableDeclaration",
  "MethodDeclaration", "MethodReturnType", "Parameters",
  "ParameterDeclarations", "ParameterDeclaration", "Body", "BodyMember",
  "VariableDeclarationGroup", "StatementGroup", "ConstructorDeclaration",
  "Statement", "Assignment", "WhileLoop", "IfStatement", "ReturnStatement",
  "Expression", "ExpressionCallGroup", "ExpressionCallGroupComponent",
  "Arguments", "ExpressionsList", "Primary", "BooleanLiteral", null
    };
  }

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short yyrline_[] = yyrline_init();
  private static final short[] yyrline_init()
  {
    return new short[]
    {
       0,    85,    85,    89,    90,    94,    98,    99,   103,   104,
     108,   109,   113,   114,   115,   119,   123,   127,   128,   132,
     133,   137,   138,   142,   146,   147,   151,   152,   156,   157,
     161,   162,   166,   170,   171,   172,   173,   174,   189,   193,
     197,   198,   202,   203,   207,   208,   213,   214,   218,   223,
     224,   230,   231,   235,   236,   237,   238,   239,   243,   244
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
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    31,    32
    };
  }

  private static final byte yytranslate_ (int t)
  {
    if (t >= 0 && t <= yyuser_token_number_max_)
      return yytranslate_table_[t];
    else
      return yyundef_token_;
  }

  private static final int yylast_ = 98;
  private static final int yynnts_ = 31;
  private static final int yyempty_ = -2;
  private static final int yyfinal_ = 7;
  private static final int yyterror_ = 1;
  private static final int yyerrcode_ = 256;
  private static final int yyntokens_ = 33;

  private static final int yyuser_token_number_max_ = 287;
  private static final int yyundef_token_ = 2;

/* User implementation code.  */
/* Unqualified %code blocks.  */
/* "parser.y":12  */
public ProgramNode root;

/* "parser.java":1384  */

}

/* "parser.y":247  */

