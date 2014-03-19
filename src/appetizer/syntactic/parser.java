
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sat Mar 15 13:05:43 CST 2014
//----------------------------------------------------

package appetizer.syntactic;

import java.io.InputStream;
import appetizer.ast.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sat Mar 15 13:05:43 CST 2014
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\032\000\002\002\004\000\002\002\007\000\002\003" +
    "\006\000\002\004\002\000\002\004\004\000\002\005\005" +
    "\000\002\006\002\000\002\006\004\000\002\007\007\000" +
    "\002\007\005\000\002\007\004\000\002\007\003\000\002" +
    "\010\005\000\002\010\005\000\002\010\005\000\002\010" +
    "\005\000\002\010\005\000\002\010\005\000\002\010\005" +
    "\000\002\010\005\000\002\010\005\000\002\010\005\000" +
    "\002\010\005\000\002\010\003\000\002\010\003\000\002" +
    "\010\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\071\000\004\024\005\001\002\000\004\002\073\001" +
    "\002\000\004\030\006\001\002\000\004\017\007\001\002" +
    "\000\004\020\010\001\002\000\004\021\011\001\002\000" +
    "\022\017\ufffe\021\ufffe\022\ufffe\024\015\025\ufffe\026\ufffe" +
    "\027\ufffe\030\ufffe\001\002\000\004\002\000\001\002\000" +
    "\022\017\ufffe\021\ufffe\022\ufffe\024\015\025\ufffe\026\ufffe" +
    "\027\ufffe\030\ufffe\001\002\000\020\017\030\021\011\022" +
    "\ufffb\025\024\026\027\027\020\030\025\001\002\000\004" +
    "\030\016\001\002\000\004\023\017\001\002\000\022\017" +
    "\ufffc\021\ufffc\022\ufffc\024\ufffc\025\ufffc\026\ufffc\027\ufffc" +
    "\030\ufffc\001\002\000\034\004\uffe9\005\uffe9\006\uffe9\007" +
    "\uffe9\010\uffe9\011\uffe9\012\uffe9\013\uffe9\014\uffe9\015\uffe9" +
    "\016\uffe9\020\uffe9\023\uffe9\001\002\000\004\022\071\001" +
    "\002\000\020\017\030\021\011\022\ufffb\025\024\026\027" +
    "\027\020\030\025\001\002\000\020\017\ufff6\021\ufff6\022" +
    "\ufff6\025\ufff6\026\ufff6\027\ufff6\030\ufff6\001\002\000\004" +
    "\017\064\001\002\000\034\004\uffea\005\uffea\006\uffea\007" +
    "\uffea\010\uffea\011\uffea\012\uffea\013\uffea\014\uffea\015\uffea" +
    "\016\uffea\020\uffea\023\uffea\001\002\000\032\004\035\005" +
    "\032\006\043\007\033\010\041\011\036\012\044\013\045" +
    "\014\040\015\037\016\034\023\063\001\002\000\010\017" +
    "\030\027\020\030\025\001\002\000\010\017\030\027\020" +
    "\030\025\001\002\000\032\004\035\005\032\006\043\007" +
    "\033\010\041\011\036\012\044\013\045\014\040\015\037" +
    "\016\034\020\042\001\002\000\010\017\030\027\020\030" +
    "\025\001\002\000\010\017\030\027\020\030\025\001\002" +
    "\000\010\017\030\027\020\030\025\001\002\000\010\017" +
    "\030\027\020\030\025\001\002\000\010\017\030\027\020" +
    "\030\025\001\002\000\010\017\030\027\020\030\025\001" +
    "\002\000\010\017\030\027\020\030\025\001\002\000\010" +
    "\017\030\027\020\030\025\001\002\000\034\004\uffe8\005" +
    "\uffe8\006\uffe8\007\uffe8\010\uffe8\011\uffe8\012\uffe8\013\uffe8" +
    "\014\uffe8\015\uffe8\016\uffe8\020\uffe8\023\uffe8\001\002\000" +
    "\010\017\030\027\020\030\025\001\002\000\010\017\030" +
    "\027\020\030\025\001\002\000\010\017\030\027\020\030" +
    "\025\001\002\000\020\004\035\005\032\006\043\007\033" +
    "\010\uffef\020\uffef\023\uffef\001\002\000\020\004\035\005" +
    "\032\006\043\007\033\010\ufff0\020\ufff0\023\ufff0\001\002" +
    "\000\034\004\ufff3\005\ufff3\006\ufff3\007\ufff3\010\ufff3\011" +
    "\ufff3\012\ufff3\013\ufff3\014\ufff3\015\ufff3\016\ufff3\020\ufff3" +
    "\023\ufff3\001\002\000\034\004\035\005\032\006\043\007" +
    "\033\010\041\011\036\012\044\013\045\014\040\015\037" +
    "\016\034\020\uffeb\023\uffeb\001\002\000\020\004\035\005" +
    "\032\006\043\007\033\010\uffee\020\uffee\023\uffee\001\002" +
    "\000\020\004\035\005\032\006\043\007\033\010\uffed\020" +
    "\uffed\023\uffed\001\002\000\020\004\035\005\032\006\043" +
    "\007\033\010\ufff1\020\ufff1\023\ufff1\001\002\000\034\004" +
    "\ufff5\005\ufff5\006\043\007\033\010\ufff5\011\ufff5\012\ufff5" +
    "\013\ufff5\014\ufff5\015\ufff5\016\ufff5\020\ufff5\023\ufff5\001" +
    "\002\000\020\004\035\005\032\006\043\007\033\010\uffec" +
    "\020\uffec\023\uffec\001\002\000\034\004\ufff2\005\ufff2\006" +
    "\ufff2\007\ufff2\010\ufff2\011\ufff2\012\ufff2\013\ufff2\014\ufff2" +
    "\015\ufff2\016\ufff2\020\ufff2\023\ufff2\001\002\000\034\004" +
    "\ufff4\005\ufff4\006\043\007\033\010\ufff4\011\ufff4\012\ufff4" +
    "\013\ufff4\014\ufff4\015\ufff4\016\ufff4\020\ufff4\023\ufff4\001" +
    "\002\000\032\004\035\005\032\006\043\007\033\010\041" +
    "\011\036\012\044\013\045\014\040\015\037\016\034\023" +
    "\062\001\002\000\020\017\ufff8\021\ufff8\022\ufff8\025\ufff8" +
    "\026\ufff8\027\ufff8\030\ufff8\001\002\000\020\017\ufff7\021" +
    "\ufff7\022\ufff7\025\ufff7\026\ufff7\027\ufff7\030\ufff7\001\002" +
    "\000\010\017\030\027\020\030\025\001\002\000\032\004" +
    "\035\005\032\006\043\007\033\010\041\011\036\012\044" +
    "\013\045\014\040\015\037\016\034\020\066\001\002\000" +
    "\016\017\030\021\011\025\024\026\027\027\020\030\025" +
    "\001\002\000\020\017\ufff9\021\ufff9\022\ufff9\025\ufff9\026" +
    "\ufff9\027\ufff9\030\ufff9\001\002\000\004\022\ufffa\001\002" +
    "\000\022\002\uffff\017\uffff\021\uffff\022\uffff\025\uffff\026" +
    "\uffff\027\uffff\030\uffff\001\002\000\020\017\ufffd\021\ufffd" +
    "\022\ufffd\025\ufffd\026\ufffd\027\ufffd\030\ufffd\001\002\000" +
    "\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\071\000\004\002\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\003\011\001\001\000\006\004\013\005\012\001\001\000" +
    "\002\001\001\000\006\004\071\005\012\001\001\000\012" +
    "\003\022\006\020\007\021\010\025\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\012\003\022\006\067\007\021\010" +
    "\025\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\010\060\001\001\000" +
    "\004\010\030\001\001\000\002\001\001\000\004\010\057" +
    "\001\001\000\004\010\056\001\001\000\004\010\055\001" +
    "\001\000\004\010\054\001\001\000\004\010\053\001\001" +
    "\000\004\010\052\001\001\000\004\010\051\001\001\000" +
    "\004\010\050\001\001\000\002\001\001\000\004\010\047" +
    "\001\001\000\004\010\046\001\001\000\004\010\045\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\010\064\001\001\000\002" +
    "\001\001\000\010\003\022\007\066\010\025\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



	public void report_error(String message, Object info) {
		StringBuffer m = new StringBuffer("\tParsing error");
		if (info instanceof java_cup.runtime.Symbol) {
			java_cup.runtime.Symbol s = (java_cup.runtime.Symbol) info;

			if (s.left >= 0) {
				m.append(" in line " + (s.left +1 ));
				if (s.right >= 0) {
					m.append(", column " + (s.right + 1));
				}
			}
		}
		m.append(" : " + message);
		System.err.println(m);
	}

	public parser(InputStream inp) {
		this(new Yylex(inp));
	}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {


	static appetizer.symbol.Symbol symbol(String s) {
		return appetizer.symbol.Symbol.symbol(s);
	}

  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // expr ::= LPAREN expr RPAREN 
            {
              Expr RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Expr e = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // expr ::= NUM 
            {
              Expr RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Num(n.intValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // expr ::= ID 
            {
              Expr RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Var(symbol(i)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expr ::= expr ASSIGN expr 
            {
              Expr RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expr l = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expr r = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Op(l, Op.OpType.ASSIGN, r); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expr ::= expr GE expr 
            {
              Expr RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expr l = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expr r = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Op(l, Op.OpType.GE, r); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expr ::= expr LE expr 
            {
              Expr RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expr l = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expr r = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Op(l, Op.OpType.LE, r); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expr ::= expr GT expr 
            {
              Expr RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expr l = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expr r = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Op(l, Op.OpType.GT, r); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expr ::= expr LT expr 
            {
              Expr RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expr l = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expr r = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Op(l, Op.OpType.LT, r); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expr ::= expr NE expr 
            {
              Expr RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expr l = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expr r = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Op(l, Op.OpType.NE, r); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expr ::= expr EQ expr 
            {
              Expr RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expr l = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expr r = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Op(l, Op.OpType.EQ, r); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expr ::= expr DIVIDE expr 
            {
              Expr RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expr l = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expr r = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Op(l, Op.OpType.DIVIDE, r); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expr ::= expr TIMES expr 
            {
              Expr RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expr l = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expr r = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Op(l, Op.OpType.TIMES, r); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expr ::= expr MINUS expr 
            {
              Expr RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expr l = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expr r = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Op(l, Op.OpType.MINUS, r); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expr ::= expr PLUS expr 
            {
              Expr RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expr l = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object x = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expr r = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Op(l, Op.OpType.PLUS, r); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // stmt ::= block 
            {
              Stmt RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Block b = (Block)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = b; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // stmt ::= expr SEMICOLON 
            {
              Stmt RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Expr e = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // stmt ::= RETURN expr SEMICOLON 
            {
              Stmt RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Expr e = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new ReturnStmt(e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // stmt ::= IF LPAREN expr RPAREN stmt 
            {
              Stmt RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expr e = (Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Stmt s = (Stmt)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new IfStmt(e, s); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // stmts ::= stmt stmts 
            {
              StmtList RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Stmt s = (Stmt)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		StmtList x = (StmtList)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new StmtList(s, x); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmts",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // stmts ::= 
            {
              StmtList RESULT =null;
		 RESULT = null; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmts",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // decl ::= INT ID SEMICOLON 
            {
              Decl RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new Decl(symbol(i)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("decl",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // decls ::= decl decls 
            {
              DeclList RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Decl d = (Decl)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		DeclList x = (DeclList)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new DeclList(d, x); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("decls",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // decls ::= 
            {
              DeclList RESULT =null;
		 RESULT = null; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("decls",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // block ::= LBRACE decls stmts RBRACE 
            {
              Block RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		DeclList d = (DeclList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		StmtList s = (StmtList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new Block(d, s); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("block",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // program ::= INT ID LPAREN RPAREN block 
            {
              Program RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Block b = (Block)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Program(symbol(i), b); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Program start_val = (Program)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

