/*program for dynamic implementation of queue using linked list*/
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
Nodetype front=null,rear=null;

/*Where front is the pointer which will point to the front of the queue
and rear will point to rear end of the queue*/


void display()
{
/*display all elements of linked list*/

	Nodetype temp;
	if(front==null)
		System.out.println("\nEmpty linked list");
	else
	{
		System.out.print("\nfront");
		temp=front;
		while(temp!=null)
		{
			System.out.print("-->"+temp.info);
			temp=temp.next;
		}
		System.out.println("<--rear");
	}
}



void insert(int x)
{
	Nodetype node=new Nodetype(x);
	node.info=x;
	node.next=null;
	if (front==null&&rear==null)
	{
		front=node;
		rear=node;
	}
	else
	{
		rear.next=node;
		rear=node;
	}
	display();



}/*end insert*/

void remove()
{
	Nodetype p=null;
	int x;
	p=front;
	if(p==null)
	{
		System.out.println("\nUnderflow\n");
		return;
	}
	System.out.print("\nThe element removed is "+p.info);
	front=front.next;
	if(front==null)
		rear=null;
	display();
}/*end removee*/

}



class LLQueue
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	Operations L =new Operations();
	int ch,n;
	while(true)
	{
		System.out.println("\n\tQUEUE");
		System.out.println("1.Insert");
		System.out.println("2.Remove");
		System.out.println("3.Exit");
		System.out.print("Enter your choice : ");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:System.out.print("Enter Number : ");
				   n=sc.nextInt();
				   L.insert(n);
				   break;
			case 2:L.remove();
				   break;
			case 3:return;
		}
	}



}/*end main*/
}

/*
        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 1
Enter Number : 12

front-->12<--rear

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 1
Enter Number : 5

front-->12-->5<--rear

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 1
Enter Number : 10

front-->12-->5-->10<--rear

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 1
Enter Number : 3

front-->12-->5-->10-->3<--rear

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 2

The element removed is 12
front-->5-->10-->3<--rear

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 2

The element removed is 5
front-->10-->3<--rear

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 2

The element removed is 10
front-->3<--rear

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 1
Enter Number : 40

front-->3-->40<--rear

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 2

The element removed is 3
front-->40<--rear

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 3
*/
