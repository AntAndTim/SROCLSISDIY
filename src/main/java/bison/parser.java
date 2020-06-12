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

package bison;

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
    /* "parser.y":87  */
    {root = new ProgramNode(((ArrayList<ClassDeclNode>)(yystack.valueAt (0))));};
  break;
    

  case 3:
  if (yyn == 3)
    /* "parser.y":91  */
    {yyval = new ArrayList<ClassDeclNode>();};
  break;
    

  case 4:
  if (yyn == 4)
    /* "parser.y":92  */
    { ((ArrayList<ClassDeclNode>)(yystack.valueAt (0))).add(0, ((ast.ClassDeclNode)(yystack.valueAt (1)))); yyval=((ArrayList<ClassDeclNode>)(yystack.valueAt (0))); };
  break;
    

  case 5:
  if (yyn == 5)
    /* "parser.y":96  */
    {yyval = new ClassDeclNode(((ast.ClassNameNode)(yystack.valueAt (3))), ((ArrayList<MemberDeclNode>)(yystack.valueAt (1))));};
  break;
    

  case 6:
  if (yyn == 6)
    /* "parser.y":97  */
    {yyval = new ClassDeclNode(((ast.ClassNameNode)(yystack.valueAt (5))), ((ast.ClassNameNode)(yystack.valueAt (3))), ((ArrayList<MemberDeclNode>)(yystack.valueAt (1))));};
  break;
    

  case 7:
  if (yyn == 7)
    /* "parser.y":101  */
    {yyval = new ast.ClassNameNode(new ast.IdentNode(((bison.Token)(yystack.valueAt (0))).getValue()), new ArrayList<IdentNode>());};
  break;
    

  case 8:
  if (yyn == 8)
    /* "parser.y":102  */
    {yyval = new ast.ClassNameNode(new ast.IdentNode(((bison.Token)(yystack.valueAt (3))).getValue()), ((ArrayList<IdentNode>)(yystack.valueAt (1))));};
  break;
    

  case 9:
  if (yyn == 9)
    /* "parser.y":107  */
    {yyval = new ast.TypeNode(new ast.IdentNode(((bison.Token)(yystack.valueAt (0))).getValue()), new ArrayList<TypeNode>());};
  break;
    

  case 10:
  if (yyn == 10)
    /* "parser.y":108  */
    {yyval = new ast.TypeNode(new ast.IdentNode(((bison.Token)(yystack.valueAt (3))).getValue()), ((ArrayList<ast.TypeNode>)(yystack.valueAt (1))));};
  break;
    

  case 11:
  if (yyn == 11)
    /* "parser.y":112  */
    {ArrayList<TypeNode> list = new ArrayList<TypeNode>(); list.add(((ast.TypeNode)(yystack.valueAt (0)))); yyval = list;};
  break;
    

  case 12:
  if (yyn == 12)
    /* "parser.y":113  */
    {((ArrayList<ast.TypeNode>)(yystack.valueAt (2))).add(((ast.TypeNode)(yystack.valueAt (0)))); yyval = ((ArrayList<ast.TypeNode>)(yystack.valueAt (2)));};
  break;
    

  case 13:
  if (yyn == 13)
    /* "parser.y":116  */
    {ArrayList<IdentNode> list = new ArrayList<IdentNode>(); list.add(new IdentNode(((bison.Token)(yystack.valueAt (0))).getValue())); yyval = list;};
  break;
    

  case 14:
  if (yyn == 14)
    /* "parser.y":117  */
    {((ArrayList<IdentNode>)(yystack.valueAt (2))).add(new IdentNode(((bison.Token)(yystack.valueAt (0))).getValue())); yyval = ((ArrayList<IdentNode>)(yystack.valueAt (2)));};
  break;
    

  case 15:
  if (yyn == 15)
    /* "parser.y":120  */
    {yyval = new ArrayList<MemberDeclNode>();};
  break;
    

  case 16:
  if (yyn == 16)
    /* "parser.y":121  */
    {((ArrayList<MemberDeclNode>)(yystack.valueAt (0))).add(0,((ast.MemberDeclNode)(yystack.valueAt (1)))); yyval = ((ArrayList<MemberDeclNode>)(yystack.valueAt (0)));};
  break;
    

  case 17:
  if (yyn == 17)
    /* "parser.y":125  */
    {MemberDeclNode node = new MemberDeclNode(); node.declaration = ((ast.FieldDeclNode)(yystack.valueAt (0))); node.declType = MemberDeclNode.memberType.FIELD; yyval = node;};
  break;
    

  case 18:
  if (yyn == 18)
    /* "parser.y":126  */
    {MemberDeclNode node = new MemberDeclNode(); node.declaration = ((ast.MethodDeclNode)(yystack.valueAt (0))); node.declType = MemberDeclNode.memberType.METHOD; yyval = node;};
  break;
    

  case 19:
  if (yyn == 19)
    /* "parser.y":127  */
    {MemberDeclNode node = new MemberDeclNode(); node.declaration = ((ast.ConstructorDeclNode)(yystack.valueAt (0))); node.declType = MemberDeclNode.memberType.CONSTRUCTOR; yyval = node;};
  break;
    

  case 20:
  if (yyn == 20)
    /* "parser.y":131  */
    {yyval = new ast.FieldDeclNode(new IdentNode(((bison.Token)(yystack.valueAt (2))).getValue()),((ast.ClassNameNode)(yystack.valueAt (0))));};
  break;
    

  case 21:
  if (yyn == 21)
    /* "parser.y":134  */
    {yyval = new ast.VariableDeclNode(new IdentNode(((bison.Token)(yystack.valueAt (2))).getValue()),((ast.ExpressionNode)(yystack.valueAt (0))));};
  break;
    

  case 22:
  if (yyn == 22)
    /* "parser.y":138  */
    {yyval = new ast.MethodDeclNode(new ast.IdentNode(((bison.Token)(yystack.valueAt (5))).getValue()),((ArrayList<ParamsDeclNode>)(yystack.valueAt (4))),((ast.IdentNode)(yystack.valueAt (3))),new ast.BodyNode(((ArrayList<ast.Node>)(yystack.valueAt (1)))));};
  break;
    

  case 23:
  if (yyn == 23)
    /* "parser.y":142  */
    {yyval = null;};
  break;
    

  case 24:
  if (yyn == 24)
    /* "parser.y":143  */
    {yyval = new IdentNode(((bison.Token)(yystack.valueAt (0))).getValue());};
  break;
    

  case 25:
  if (yyn == 25)
    /* "parser.y":147  */
    {yyval = new ArrayList<ParamsDeclNode>();};
  break;
    

  case 26:
  if (yyn == 26)
    /* "parser.y":148  */
    {yyval = ((ArrayList<ParamsDeclNode>)(yystack.valueAt (1)));};
  break;
    

  case 27:
  if (yyn == 27)
    /* "parser.y":152  */
    {ArrayList<ParamsDeclNode> params = new ArrayList<ParamsDeclNode>(); params.add(((ast.ParamsDeclNode)(yystack.valueAt (0)))); yyval = params;};
  break;
    

  case 28:
  if (yyn == 28)
    /* "parser.y":153  */
    { ((ArrayList<ParamsDeclNode>)(yystack.valueAt (2))).add(((ast.ParamsDeclNode)(yystack.valueAt (0)))); };
  break;
    

  case 29:
  if (yyn == 29)
    /* "parser.y":157  */
    {yyval = new ParamsDeclNode(new IdentNode(((bison.Token)(yystack.valueAt (2))).getValue()), ((ast.TypeNode)(yystack.valueAt (0))));};
  break;
    

  case 30:
  if (yyn == 30)
    /* "parser.y":161  */
    {yyval = new ArrayList<Node>();};
  break;
    

  case 31:
  if (yyn == 31)
    /* "parser.y":162  */
    {((ArrayList<ast.Node>)(yystack.valueAt (0))).addAll(0,((ArrayList<ast.Node>)(yystack.valueAt (1)))); yyval = ((ArrayList<ast.Node>)(yystack.valueAt (0)));};
  break;
    

  case 32:
  if (yyn == 32)
    /* "parser.y":166  */
    {yyval = ((ArrayList<ast.Node>)(yystack.valueAt (0)));};
  break;
    

  case 33:
  if (yyn == 33)
    /* "parser.y":167  */
    {yyval = ((ArrayList<ast.Node>)(yystack.valueAt (0)));};
  break;
    

  case 34:
  if (yyn == 34)
    /* "parser.y":171  */
    {yyval = new ArrayList<ast.Node>();};
  break;
    

  case 35:
  if (yyn == 35)
    /* "parser.y":172  */
    {((ArrayList<ast.Node>)(yystack.valueAt (0))).add(0,((ast.VariableDeclNode)(yystack.valueAt (1)))); yyval = ((ArrayList<ast.Node>)(yystack.valueAt (0)));};
  break;
    

  case 36:
  if (yyn == 36)
    /* "parser.y":176  */
    {yyval = new ArrayList<ast.Node>();};
  break;
    

  case 37:
  if (yyn == 37)
    /* "parser.y":177  */
    {((ArrayList<ast.Node>)(yystack.valueAt (0))).add(0, ((ast.Node)(yystack.valueAt (1)))); yyval = ((ArrayList<ast.Node>)(yystack.valueAt (0)));};
  break;
    

  case 38:
  if (yyn == 38)
    /* "parser.y":181  */
    {yyval = new ast.ConstructorDeclNode(((ArrayList<ParamsDeclNode>)(yystack.valueAt (3))),new BodyNode(((ArrayList<ast.Node>)(yystack.valueAt (1)))));};
  break;
    

  case 39:
  if (yyn == 39)
    /* "parser.y":185  */
    {yyval = ((ast.AssignmentNode)(yystack.valueAt (0)));};
  break;
    

  case 40:
  if (yyn == 40)
    /* "parser.y":186  */
    {yyval = ((ast.WhileLoopNode)(yystack.valueAt (0)));};
  break;
    

  case 41:
  if (yyn == 41)
    /* "parser.y":187  */
    {yyval = ((ast.IfStatementNode)(yystack.valueAt (0)));};
  break;
    

  case 42:
  if (yyn == 42)
    /* "parser.y":188  */
    {yyval = ((ast.ReturnStatement)(yystack.valueAt (0)));};
  break;
    

  case 43:
  if (yyn == 43)
    /* "parser.y":189  */
    {yyval = ((ast.ExpressionNode)(yystack.valueAt (0)));};
  break;
    

  case 44:
  if (yyn == 44)
    /* "parser.y":204  */
    {yyval = new AssignmentNode(new IdentNode(((bison.Token)(yystack.valueAt (2))).getValue()), ((ast.ExpressionNode)(yystack.valueAt (0))));};
  break;
    

  case 45:
  if (yyn == 45)
    /* "parser.y":208  */
    {yyval = new WhileLoopNode(((ast.ExpressionNode)(yystack.valueAt (3))), new BodyNode(((ArrayList<ast.Node>)(yystack.valueAt (1)))));};
  break;
    

  case 46:
  if (yyn == 46)
    /* "parser.y":212  */
    {yyval = new IfStatementNode(((ast.ExpressionNode)(yystack.valueAt (3))), new BodyNode(((ArrayList<ast.Node>)(yystack.valueAt (1)))));};
  break;
    

  case 47:
  if (yyn == 47)
    /* "parser.y":213  */
    {yyval = new IfStatementNode(((ast.ExpressionNode)(yystack.valueAt (5))), new BodyNode(((ArrayList<ast.Node>)(yystack.valueAt (3)))), new BodyNode(((ArrayList<ast.Node>)(yystack.valueAt (1)))));};
  break;
    

  case 48:
  if (yyn == 48)
    /* "parser.y":217  */
    {yyval = new ReturnStatement(null);};
  break;
    

  case 49:
  if (yyn == 49)
    /* "parser.y":218  */
    {yyval = new ReturnStatement(((ast.ExpressionNode)(yystack.valueAt (0))));};
  break;
    

  case 50:
  if (yyn == 50)
    /* "parser.y":222  */
    {yyval = new ExpressionNode(((ast.Node)(yystack.valueAt (0))), new ArrayList<Pair<IdentNode, ArrayList<ExpressionNode>>>());};
  break;
    

  case 51:
  if (yyn == 51)
    /* "parser.y":223  */
    {yyval = new ExpressionNode(((ast.Node)(yystack.valueAt (1))), ((ArrayList<Pair<IdentNode, ArrayList<ExpressionNode>>>)(yystack.valueAt (0))));};
  break;
    

  case 52:
  if (yyn == 52)
    /* "parser.y":225  */
    {ArrayList<Pair<IdentNode, ArrayList<ExpressionNode>>> list = new ArrayList<Pair<IdentNode, ArrayList<ExpressionNode>>>();
     list.add(new Pair<IdentNode, ArrayList<ExpressionNode>>(new IdentNode(""), ((ArrayList<ExpressionNode>)(yystack.valueAt (0)))));
     yyval = new ExpressionNode(((ast.TypeNode)(yystack.valueAt (1))), list);};
  break;
    

  case 53:
  if (yyn == 53)
    /* "parser.y":229  */
    {ArrayList<Pair<IdentNode, ArrayList<ExpressionNode>>> list = new ArrayList<Pair<IdentNode, ArrayList<ExpressionNode>>>();
    list.add(new Pair<IdentNode, ArrayList<ExpressionNode>>(new IdentNode(""), ((ArrayList<ExpressionNode>)(yystack.valueAt (1)))));
    list.addAll(((ArrayList<Pair<IdentNode, ArrayList<ExpressionNode>>>)(yystack.valueAt (0))));
    yyval = new ExpressionNode(((ast.TypeNode)(yystack.valueAt (2))), list);};
  break;
    

  case 54:
  if (yyn == 54)
    /* "parser.y":237  */
    {ArrayList<Pair<IdentNode, ArrayList<ExpressionNode>>> list = new ArrayList<Pair<IdentNode, ArrayList<ExpressionNode>>>(); list.add(((Pair<IdentNode, ArrayList<ExpressionNode>>)(yystack.valueAt (0)))); yyval = list;};
  break;
    

  case 55:
  if (yyn == 55)
    /* "parser.y":238  */
    {((ArrayList<Pair<IdentNode, ArrayList<ExpressionNode>>>)(yystack.valueAt (0))).add(((Pair<IdentNode, ArrayList<ExpressionNode>>)(yystack.valueAt (1)))); yyval = ((ArrayList<Pair<IdentNode, ArrayList<ExpressionNode>>>)(yystack.valueAt (0)));};
  break;
    

  case 56:
  if (yyn == 56)
    /* "parser.y":242  */
    {Pair<IdentNode, ArrayList<ExpressionNode>> component = new Pair<IdentNode, ArrayList<ExpressionNode>>(new IdentNode(((bison.Token)(yystack.valueAt (0))).getValue()), new ArrayList<ExpressionNode>()); yyval = component;};
  break;
    

  case 57:
  if (yyn == 57)
    /* "parser.y":243  */
    {Pair<IdentNode, ArrayList<ExpressionNode>> component = new Pair<IdentNode, ArrayList<ExpressionNode>>(new IdentNode(((bison.Token)(yystack.valueAt (1))).getValue()), ((ArrayList<ExpressionNode>)(yystack.valueAt (0)))); yyval = component;};
  break;
    

  case 58:
  if (yyn == 58)
    /* "parser.y":248  */
    {yyval = new ArrayList<ExpressionNode>();};
  break;
    

  case 59:
  if (yyn == 59)
    /* "parser.y":249  */
    {yyval = ((ArrayList<ExpressionNode>)(yystack.valueAt (1)));};
  break;
    

  case 60:
  if (yyn == 60)
    /* "parser.y":255  */
    {ArrayList<ExpressionNode> list = new ArrayList<ExpressionNode>(); list.add(((ast.ExpressionNode)(yystack.valueAt (0)))); yyval = list;};
  break;
    

  case 61:
  if (yyn == 61)
    /* "parser.y":256  */
    {((ArrayList<ExpressionNode>)(yystack.valueAt (2))).add(((ast.ExpressionNode)(yystack.valueAt (0)))); yyval = ((ArrayList<ExpressionNode>)(yystack.valueAt (2)));};
  break;
    

  case 62:
  if (yyn == 62)
    /* "parser.y":260  */
    {yyval = new IntegerLitNode(((bison.Token)(yystack.valueAt (0))).getValue());};
  break;
    

  case 63:
  if (yyn == 63)
    /* "parser.y":261  */
    {yyval = new RealLitNode(((bison.Token)(yystack.valueAt (0))).getValue());};
  break;
    

  case 64:
  if (yyn == 64)
    /* "parser.y":262  */
    {yyval = ((ast.BooleanLitNode)(yystack.valueAt (0)));};
  break;
    

  case 65:
  if (yyn == 65)
    /* "parser.y":263  */
    {yyval = new ast.IdentNode("this");};
  break;
    

  case 66:
  if (yyn == 66)
    /* "parser.y":264  */
    {yyval = ((ast.TypeNode)(yystack.valueAt (0)));};
  break;
    

  case 67:
  if (yyn == 67)
    /* "parser.y":268  */
    {yyval = new BooleanLitNode("True");};
  break;
    

  case 68:
  if (yyn == 68)
    /* "parser.y":269  */
    {yyval = new BooleanLitNode("False");};
  break;
    


/* "parser.java":846  */

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

  private static final byte yypact_ninf_ = -75;
  private static final byte yytable_ninf_ = -1;

  /* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
  private static final byte yypact_[] = yypact_init();
  private static final byte[] yypact_init()
  {
    return new byte[]
    {
     -11,     8,    43,   -75,   -11,    30,    20,   -75,   -75,    34,
       8,    -4,   -75,    71,    26,    54,    46,    56,    36,    -4,
     -75,   -75,   -75,   -75,    60,    -4,    22,    39,    51,    54,
     -75,   -75,   -75,    50,   -75,    62,    38,   -75,    37,     8,
      63,   -75,    72,   -75,    76,     3,   -75,     7,   -75,   -75,
      77,     7,     7,   -75,   -75,    84,    74,    66,    37,   -75,
     -75,    59,   -75,   -75,   -75,   -75,   -75,    85,   -75,   -75,
      83,    70,    90,   -75,   -75,    72,     7,    69,    78,    75,
     -75,     0,    85,   -75,   -75,   -75,   -75,    88,   -75,    85,
     -75,    37,   -75,    73,   -75,    37,     7,    37,   -75,   -75,
      52,   -75,    84,   -75,    79,   -75,    72,    -5,   -75,    80,
     -75,     7,   -75,   -75,   -75,    37,   -75,   -75,   -75,    81,
     -75
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
       3,     0,     0,     2,     3,     7,     0,     1,     4,     0,
       0,    15,    13,     0,     0,     0,     0,     0,     0,    15,
      17,    18,    19,     8,     0,    15,     0,     0,     0,     0,
       5,    16,    14,     0,    25,     0,     0,    27,    30,     0,
      23,     6,     0,    26,     0,     9,    68,     0,    65,    67,
       0,     0,    48,    62,    63,    66,    34,     0,    30,    32,
      33,    36,    39,    40,    41,    42,    43,    50,    64,    20,
       0,     0,     9,    29,    28,     0,     0,     0,     0,     0,
      49,     0,    52,    35,    38,    31,    37,     0,    51,    54,
      24,    30,    11,     0,    44,    30,     0,    30,    58,    60,
       0,    53,    56,    55,     0,    10,     0,     0,    21,     0,
      59,     0,    57,    22,    12,    30,    46,    45,    61,     0,
      47
    };
  }

/* YYPGOTO[NTERM-NUM].  */
  private static final byte yypgoto_[] = yypgoto_init();
  private static final byte[] yypgoto_init()
  {
    return new byte[]
    {
     -75,   -75,    96,   -75,    -9,   -40,   -75,   -75,     2,   -75,
     -75,   -75,   -75,   -75,    82,   -75,    58,   -55,   -75,    48,
      44,   -75,   -75,   -75,   -75,   -75,   -75,   -47,   -74,   -75,
      10,   -75,   -75,   -75
    };
  }

/* YYDEFGOTO[NTERM-NUM].  */
  private static final byte yydefgoto_[] = yydefgoto_init();
  private static final byte[] yydefgoto_init()
  {
    return new byte[]
    {
      -1,     2,     3,     4,     6,    55,    93,    13,    18,    19,
      20,    56,    21,    71,    27,    36,    37,    57,    58,    59,
      60,    22,    61,    62,    63,    64,    65,    66,    88,    89,
      82,   100,    67,    68
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
      77,    14,    73,    85,    79,    80,    98,   115,   101,     1,
      75,    72,    15,    46,    16,   103,    48,    49,    72,     5,
      46,    31,   116,    48,    49,    76,    17,    33,    34,    94,
      69,    53,    54,    35,    99,    92,   104,     9,    53,    54,
     107,    10,   109,     7,    43,    12,    11,    44,    45,   108,
      46,    47,    25,    48,    49,    50,    51,    28,   110,    26,
     119,   111,    52,    30,   118,    38,   114,    29,    53,    54,
      45,    32,    46,    47,    39,    48,    49,    41,    51,    23,
      24,   105,   106,    72,    52,    42,    70,    35,    78,    81,
      53,    54,    50,    84,    90,    87,    91,    75,    95,   102,
       8,    96,    74,    97,    83,    86,   113,   117,   120,     0,
       0,    40,   112
    };
  }

private static final byte yycheck_[] = yycheck_init();
  private static final byte[] yycheck_init()
  {
    return new byte[]
    {
      47,    10,    42,    58,    51,    52,     6,    12,    82,    20,
       7,    11,    16,    13,    18,    89,    16,    17,    11,    11,
      13,    19,    27,    16,    17,    22,    30,    25,     6,    76,
      39,    31,    32,    11,    81,    75,    91,     7,    31,    32,
      95,    21,    97,     0,     6,    11,    26,     9,    11,    96,
      13,    14,    26,    16,    17,    18,    19,    11,     6,     5,
     115,     9,    25,    27,   111,    26,   106,    11,    31,    32,
      11,    11,    13,    14,    23,    16,    17,    27,    19,     8,
       9,     8,     9,    11,    25,    23,    23,    11,    11,     5,
      31,    32,    18,    27,    11,    10,    26,     7,    29,    11,
       4,    23,    44,    28,    56,    61,    27,    27,    27,    -1,
      -1,    29,   102
    };
  }

/* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
   symbol of state STATE-NUM.  */
  private static final byte yystos_[] = yystos_init();
  private static final byte[] yystos_init()
  {
    return new byte[]
    {
       0,    20,    34,    35,    36,    11,    37,     0,    35,     7,
      21,    26,    11,    40,    37,    16,    18,    30,    41,    42,
      43,    45,    54,     8,     9,    26,     5,    47,    11,    11,
      27,    41,    11,    41,     6,    11,    48,    49,    26,    23,
      47,    27,    23,     6,     9,    11,    13,    14,    16,    17,
      18,    19,    25,    31,    32,    38,    44,    50,    51,    52,
      53,    55,    56,    57,    58,    59,    60,    65,    66,    37,
      23,    46,    11,    38,    49,     7,    22,    60,    11,    60,
      60,     5,    63,    52,    27,    50,    53,    10,    61,    62,
      11,    26,    38,    39,    60,    29,    23,    28,     6,    60,
      64,    61,    11,    61,    50,     8,     9,    50,    60,    50,
       6,     9,    63,    27,    38,    12,    27,    27,    60,    50,
      27
    };
  }

/* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final byte yyr1_[] = yyr1_init();
  private static final byte[] yyr1_init()
  {
    return new byte[]
    {
       0,    33,    34,    35,    35,    36,    36,    37,    37,    38,
      38,    39,    39,    40,    40,    41,    41,    42,    42,    42,
      43,    44,    45,    46,    46,    47,    47,    48,    48,    49,
      50,    50,    51,    51,    52,    52,    53,    53,    54,    55,
      55,    55,    55,    55,    56,    57,    58,    58,    59,    59,
      60,    60,    60,    60,    61,    61,    62,    62,    63,    63,
      64,    64,    65,    65,    65,    65,    65,    66,    66
    };
  }

/* YYR2[YYN] -- Number of symbols on the right hand side of rule YYN.  */
  private static final byte yyr2_[] = yyr2_init();
  private static final byte[] yyr2_init()
  {
    return new byte[]
    {
       0,     2,     1,     0,     2,     5,     7,     1,     4,     1,
       4,     1,     3,     1,     3,     0,     2,     1,     1,     1,
       4,     4,     7,     0,     2,     2,     3,     1,     3,     3,
       0,     2,     1,     1,     0,     2,     0,     2,     5,     1,
       1,     1,     1,     1,     3,     5,     5,     7,     1,     2,
       1,     2,     2,     3,     1,     2,     2,     3,     2,     3,
       1,     3,     1,     1,     1,     1,     1,     1,     1
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
  "ClassDeclarations", "ClassDeclaration", "ClassName", "TypeName",
  "TypeNameList", "ClassGenerics", "MemberDeclarations",
  "MemberDeclaration", "FieldDeclaration", "VariableDeclaration",
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
       0,    87,    87,    91,    92,    96,    97,   101,   102,   107,
     108,   112,   113,   116,   117,   120,   121,   125,   126,   127,
     131,   134,   138,   142,   143,   147,   148,   152,   153,   157,
     161,   162,   166,   167,   171,   172,   176,   177,   181,   185,
     186,   187,   188,   189,   204,   208,   212,   213,   217,   218,
     222,   223,   224,   228,   237,   238,   242,   243,   248,   249,
     255,   256,   260,   261,   262,   263,   264,   268,   269
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

  private static final int yylast_ = 112;
  private static final int yynnts_ = 34;
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

/* "parser.java":1466  */

}

/* "parser.y":272  */

