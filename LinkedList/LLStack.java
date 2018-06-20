/*program for dynamic implementation of stack using linked list*/
import java.util.Scanner;
class Nodetype
{
	int info;
	Nodetype next;

	Nodetype(int i)
	{
		info=i;
		next=null;
	}
}

class Operations
{
Nodetype top=null;

/*Where top is the pointer which will point to the element
at the top of the stack hence it will act as the external
pointer list.*/


void display()
{
/*display all elements of linked list*/

	Nodetype temp;
	if(top==null)
		System.out.println("Empty linked list");
	else
	{
		System.out.print("Stack->\n");
		temp=top;
		while(temp!=null)
		{
			System.out.println("     "+temp.info);
			temp=temp.next;
		}
	}
}


void push(int x)
{
	Nodetype node=new Nodetype(x);
	node.info=x;
	node.next=top;
	top=node;
}/*end push*/


void pop()
{


	Nodetype p=null;
	int x;
	p=top;
	if(p!=null)
	{
		System.out.println("Popped is "+p.info+"\n");
		top=top.next;
	}
}/*end pop*/

}


class LLStack
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	Operations L =new Operations();
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
				   L.push(n);
				   L.display();
				   break;
			case 2:L.pop();
				   L.display();
				   break;
			case 3:return;
		}
	}



}/*end main*/
}



/*

        STACK
1.Push
2.Pop
3.Exit
Enter your choice : 1
Enter Number : 34
Stack->
     34

        STACK
1.Push
2.Pop
3.Exit
Enter your choice : 1
Enter Number : 66
Stack->
     66
     34

        STACK
1.Push
2.Pop
3.Exit
Enter your choice : 1
Enter Number : 22
Stack->
     22
     66
     34

        STACK
1.Push
2.Pop
3.Exit
Enter your choice : 2
Popped is 22

Stack->
     66
     34

        STACK
1.Push
2.Pop
3.Exit
Enter your choice : 2
Popped is 66

Stack->
     34

        STACK
1.Push
2.Pop
3.Exit
Enter your choice : 2
Popped is 34


Empty linked list

        STACK
1.Push
2.Pop
3.Exit
Enter your choice : 2

Empty linked list

        STACK
1.Push
2.Pop
3.Exit
Enter your choice : 3
Press any key to continue . . .*/
