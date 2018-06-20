/*program for  infix to postfix conversion:
Input: valid infix expression having single
       digit numbers and valid operators*/
/*Output: Postfix expression*/




import java.io.*;
import java.util.*;
import java.io.DataInputStream;
class Stack
{
	char items[]=new char[10];
	int top;
	Stack()
	{
		top=-1;
	}
	void push (char item)
	{
		if (top==9)
			System.out.println("Stack overflow");
		else
			items[++top]=item;
	}/*end push*/

	int isempty()
	{
		if (top<0)
			return 1;
		else
			return 0;
	}/*end isempty*/

	char pop()
	{
		if (isempty()==1)
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

	void postfix(char infix[],char post[])
	{
		int position,und=1;
		int outpos=0;
		char topsymb='+';
		char symb;
		Stack opstk=new Stack();
		opstk.top=-1;

		for(position =0;(symb=infix[position])!='\0';position++)
		{

			//System.out.println(symb);
			if(isoperand(symb))
				post[outpos++]=symb;
			else
			{
				//popandtest(&opstk,&topsymb,&und);

				if (opstk.isempty()==1)
					und=1;
				else
				{
					und=0;
					topsymb=opstk.pop();
				}

				while(und==0 && prcd(topsymb,symb)==1)
				{
					post[outpos++]=topsymb;
					if (opstk.isempty()==1)
						und=1;
					else
					{
						und=0;
						topsymb=opstk.pop();
					}
				}//end while


				if(und==0)
					opstk.push(topsymb);

				if(und==1||(symb!=')'))
					opstk.push(symb);
				else
					topsymb=opstk.pop();
			}//end else

		}//end for
		while(opstk.isempty()==0)
			post[outpos++]=opstk.pop();
		post[outpos]='\0';
	}//end postfix function


	int prcd(char topsymb,char symb)
	{
	/*check precedence and return 0 or 1*/
		if(topsymb=='(')
			return 0;

		if(symb=='(')
			return 0;

		if(symb==')')
			return 1;

		if (topsymb=='$'&&symb=='$')
			return 0;

		if (topsymb=='$'&&symb!='$')
			return 1;

		if (topsymb!='$'&&symb=='$')
			return 0;

		if((topsymb=='*'||topsymb=='/')&&(symb!='$'))
			return 1;

		if((topsymb== '+'||topsymb=='-')&&(symb=='-'||symb=='+'))
			return 1;

		if((topsymb== '+'||topsymb=='-')&&(symb=='*'||symb=='/'))
			return 0;

		return 1;
	}
	//end prcd function



	boolean isoperand(char symb)
	{
	/*Return 1 if symbol is digit and 0 otherwise*/
		if(symb>='0'&& symb<='9')
			return true;
		else
			return false;
	}/* end isoperand function*/

}

class InToPost
{
	public static void main(String args[])
	{
	/*Read infix expression and call postfix function*/
		Functions f=new Functions();
Scanner s=new Scanner();
		char infix[]=new char[80];
		char post[]=new char[80];
		int pos=0;char c;

		DataInputStream in=new DataInputStream(System.in);
		System.out.println("\nEnter an expression is infix form : ");
		try
		{
			do
			{
				c=(char)in.read();
				infix[pos++]=c;
			}while(c!='\n');
		}
		catch(Exception e)
		{
			System.out.println("I/O Error");
		}


		infix[--pos]='\0';
		System.out.println("The original infix expression is : ");
		for (int i=0;i<pos;i++)
		System.out.print(infix[i]);

		f.postfix(infix,post);

		System.out.println("\nThe postfix expression is : ");
		for (int i=0;post[i]!='\0';i++)
		System.out.println(post[i]);


	}//end main

}
