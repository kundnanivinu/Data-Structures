
import java.io.*;
class Stack
{
	int items[]=new int[20];
	int top1,top2;
	Stack()
	{
		top1=-1;
		top2=20;
	}
	void push1 (int item)
	{
		if (top1==top2-1)
			System.out.println("Stack overflow");
		else
			items[++top1]=item;

	}/*end push1*/

	void push2 (int item)
	{
		if (top1==top2-1)
			System.out.println("Stack overflow");
		else
			items[--top2]=item;

	}/*end push2*/

	boolean isempty()
	{
		if (top1==-1&&top2==20)
			return true;
		else
			return false;
	}/*end isempty*/

	void pop1()
	{
		if (isempty()==true)
		{
			System.out.println("Stack underflow");
		}
		else
		{
			System.out.println("Popped element from stack1: "+items[top1--]);
			//display();
		}
	}/*end pop*/

	void pop2()
	{
		if (isempty())
		{
			System.out.println("Stack underflow");
		}
		else
		{
			System.out.println("Popped element from stack2: "+items[top2++]);
			//display();
		}
	}/*end pop*/

	void stacktop1()
	{
		if(isempty())
			System.out.println("Stack underflow ");
		else
			System.out.println("Stack1-Stack top : "+(items[top1]));
	}/*end stacktop*/

	void stacktop2()
		{
			if(isempty())
				System.out.println("Stack underflow ");
			else
				System.out.println("Stack2-Stack top : "+(items[top2]));
	}/*end stacktop*/


	void display()
	{
		int i;
		System.out.println("Stack 1->");
		for(i=top1;i>=0;i--)
			System.out.println(items[i]);
		System.out.println("Stack 2->");
		for(i=top2;i<=19;i++)
			System.out.println(items[i]);
	}/*end display*/
}




class TwoStacks
{
public static void main(String args[]) throws IOException
{
	Stack s=new Stack();
	int i,j;
	for (i=1;i<=5;i++)
		s.push1(10*i);
	for (i=6;i<=10;i++)
		s.push2(10*i);
	s.display();
	s.stacktop1();
	s.stacktop2();
	for (i=1;i<=3;i++)
	{
		s.pop1();
		s.pop2();
	}
	s.display();
}/*end main*/

}


/*
Stack 1->
50
40
30
20
10
Stack 2->
100
90
80
70
60
Stack1-Stack top : 50
Stack2-Stack top : 100
Popped element from stack1: 50
Popped element from stack2: 100
Popped element from stack1: 40
Popped element from stack2: 90
Popped element from stack1: 30
Popped element from stack2: 80
Stack 1->
20
10
Stack 2->
70
60
*/
