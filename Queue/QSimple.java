/*program for Queue implementation*/

import java.util.Scanner;
class Queue
{
/*array is used to hold queue elements*/
/*two integer variables are used for front and rear pointers*/
	int items[]=new int[10];
	int front,rear;

	Queue()
	{/*create queue*/
		front=0;
		rear=-1;
	}/*end createqueue*/

	void insert(int e)
	{/*if queue is not full insert new element at rear end of queue*/
		if(rear==9)
			System.out.println("Queue overflow");
		else
		{

			items[++rear]=e;
		}
	}/*end insert*/


	int empty()
	{/*Return 1 if queue is empty and 0 otherwise*/

		return(rear<front? 1:0);
	}/*end empty*/

	void remove()
	{/*if queue is not empty remove one element from front */
		if(empty()==1)
			System.out.println("Queue Underflow");
		else
			System.out.println("Removed element : "+items[front++]);
		/*end else*/
	}/*end rem*/

	void display()
	{/*Display all elements from front to rear end of queue*/
		if(empty()==0)
		{
			System.out.print("Queue : ");
			int t=front;
			while(t<=rear)
				System.out.print(" "+items[t++]);
			System.out.println();

		}
	}/*end display*/

}


class QSimple
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	Queue q=new Queue();
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
				   q.insert(n);
				   q.display();
				   break;
			case 2:q.remove();
				   q.display();
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
Enter Number : 45
Queue :  45

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 1
Enter Number : 78
Queue :  45 78

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 1
Enter Number : 23
Queue :  45 78 23

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 1
Enter Number : 10
Queue :  45 78 23 10

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 2
Removed element : 45
Queue :  78 23 10

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 2
Removed element : 78
Queue :  23 10

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 2
Removed element : 23
Queue :  10

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 2
Removed element : 10

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 2
Queue Underflow

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 3
Press any key to continue . . .*/