/*program for postfix evaluation
Input: Valid postfix expression having single
       digits numbers and valid operators.
Output: Result of postfix expression.*/

import java.io.*;
import java.io.DataInputStream;
class Stack
{
	double items[]=new double[10];
	int top;
	Stack()
	{
		top=-1;
	}
	void push (double item)
	{
		if (top==9)
			System.out.println("Stack overflow");
		else
			items[++top]=item;
	}/*end push*/

	boolean isempty()
	{
		if (top<0)
			return true;
		else
			return false;
	}/*end isempty*/

	double pop()
	{
		if (isempty())
		{
			System.out.println("Stack underflow");
			return 0;
		}
		else
			return (items[top--]);
	}/*end pop*/



}/*end class stack*/



class Functions
{

	int isdigit(char symb)
	{
	   if(symb>='0'&& symb<='9')
			return 1; /*return 1 if symbol is digit*/
	   else
			return 0;
	}/*end isadigit*/

	void eval(String expr)
	{
		 int position;
		 char c;
		 double opnd1,opnd2,value;
		 Stack s=new Stack();
		 s.top=-1;
		 for(position=0;position!=expr.length(); position++)
		 {
		  	c=expr.charAt(position);
			if(isdigit(c)==1)
				s.push((double)(c -'0'));
			else
			{
				opnd2=s.pop();
				opnd1=s.pop();
				value=oper(c,opnd1,opnd2);
				s.push(value);
			}/*end else*/
		 }/*end for*/
			value=s.pop();
			if(!s.isempty())
			   System.out.println("\nExpression is wrong!!!!!!!!!!!");
			else
			   System.out.println("\nResult of postfix expression is "+value);
	}/*end eval*/



	double oper(char symb,double opnd1,double opnd2)
	{
		switch(symb)
		{
		   case '+':return(opnd1+opnd2);
		   case '-':return(opnd1-opnd2); /*return the result of operation*/
		   case '*':return(opnd1*opnd2);
		   case '/':return(opnd1/opnd2);
		   case '$':return(Math.pow(opnd1,opnd2));
		   default:System.out.println("\nillegal operator found");

		}
		return(0);
	}/*end oper*/
}/*end class functions*/



class PostfixEval
{
	public static void main(String args[])
	{
		Functions f=new Functions();
		String expr=new String();

		DataInputStream in=new DataInputStream(System.in);

		System.out.println("\nUse digits(0-9)and operators(+,-,*,/,$)");
		System.out.println("\nEnter an expression in postfix form :");
		/*read posfix string and call eval*/
		try
		{
		expr=in.readLine();
		}
		catch(Exception e)
		{
			System.out.println("I/O Error");
		}
		System.out.println("\nOriginal postfix expression is "+expr);
		f.eval(expr);
		}
}/*end class PostfixEval*/





