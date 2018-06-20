
import java.util.Scanner;
class Queue
{
/*array is used to hold queue elements*/
/*two integer variables are used for front and rear pointers*/
	int items[]=new int[5];
	int front,rear;

	Queue()
	{/*create queue*/
		front=4;
		rear=4;
	}/*end createqueue*/

	int empty()
	{/*Return 1 if queue is empty and 0 otherwise*/

		return(rear==front? 1:0);
	}/*end empty*/



	void remove()
	{
	/*remove first element using front pointer and increment front*/
		if(empty()==1)
			System.out.println("Queue underflow");
		else
		{
			if(front==4)
				front=0;
			else
				front++;
			System.out.println("Removed element : "+items[front]);
		}/*end else*/
	}/*end remove*/

	void insert(int e)
	{
	/*inset new element in the end of the queue and increment rear*/
		if(rear==4)
			rear=0;
		else
			rear++;
		if(rear!=front)
		{
			System.out.println("Insert: " + e);
			items[rear]=e;
		}
		else
		{
			System.out.println("Queue overflow");
			rear--;
		}
	}/*end insert*/

	void display()
	{
	/*display all the queue elements using front and rear pointers*/
		if(empty()==1)
			System.out.println("Queue is empty");
		else
		{
			int r,f;
			r=rear;
			f=front;
			System.out.print("Queue : ");
			while(r!=f)
			{
				if(f==4)
					f=0;
				else
					f++;
				System.out.print("  "+items[f]);
			}/*end while*/
		}/*end else*/
		System.out.println();
	}/*end display*/

}



class QCircular
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	Queue q=new Queue();
	q.front=4;q.rear=4;
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
Enter Number : 34
Insert: 34
Queue :   34

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 1
Enter Number : 78
Insert: 78
Queue :   34  78

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 1
Enter Number : 23
Insert: 23
Queue :   34  78  23

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 1
Enter Number : 90
Insert: 90
Queue :   34  78  23  90

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 1
Enter Number : 12
Queue overflow
Queue :   34  78  23  90

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 2
Removed element : 34
Queue :   78  23  90

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 2
Removed element : 78
Queue :   23  90

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 2
Removed element : 23
Queue :   90

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 1
Enter Number : 44
Insert: 44
Queue :   90  44

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 2
Removed element : 90
Queue :   44

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 2
Removed element : 44
Queue is empty


        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 2
Queue underflow
Queue is empty


        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 3
Press any key to continue . . .
*/