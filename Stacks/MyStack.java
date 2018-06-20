import java.util.Scanner;


class Stack
{
	int stk[]=new int[10];
	int top;
	Stack()
	{
		top=-1;
	}
	void push (int item)
	{
		if (top==9)
			System.out.println("Stack overflow");
		else
			stk[++top]=item;
	}/*end push*/

	boolean isempty()
	{
		if (top<0)
			return true;
		else
			return false;
	}/*end isempty*/

	int pop()
	{
		if (isempty())
		{
			System.out.println("Stack underflow");
			return 0;
		}
		else
			return (stk[top--]);
	}/*end pop*/

	void stacktop()
	{
		if(isempty())
			System.out.println("Stack underflow ");
		else
			System.out.println("Stack top is "+(stk[top]));
	}/*end stacktop*/

	void display()
	{
		System.out.println("Stack-->");
		for(int i=top;i>=0;i--)
			System.out.println("\t"+stk[i]);
	}/*end display*/
}


class MyStack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Stack s=new Stack();
		int ch,n;
		while(true)
		{
			System.out.println("\n\tSTACK");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Exit");
			System.out.print("Enter your choice : ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:System.out.print("Enter Number : ");
					   n=sc.nextInt();
					   s.push(n);
					   s.display();
					   break;
				case 2:System.out.println("Popped element : "+s.pop());
					   s.display();
					   break;
				case 3:return;
			}
		}


	}
}


/*
        STACK
1.Push
2.Pop
3.Exit
Enter your choice : 1
Enter Number : 23
Stack-->
        23

        STACK
1.Push
2.Pop
3.Exit
Enter your choice : 1
Enter Number : 55
Stack-->
        55
        23

        STACK
1.Push
2.Pop
3.Exit
Enter your choice : 1
Enter Number : 10
Stack-->
        10
        55
        23

        STACK
1.Push
2.Pop
3.Exit
Enter your choice : 2
Popped element : 10
Stack-->
        55
        23

        STACK
1.Push
2.Pop
3.Exit
Enter your choice : 2
Popped element : 55
Stack-->
        23

        STACK
1.Push
2.Pop
3.Exit
Enter your choice : 2
Popped element : 23
Stack-->

        STACK
1.Push
2.Pop
3.Exit
Enter your choice : 3
Press any key to continue . . .*/

