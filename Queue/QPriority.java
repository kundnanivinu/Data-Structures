/* Program To implement priority queue using arrays*/

import java.io.*;
import java.util.Scanner;
class Queue
{
/*array is used to hold queue elements*/
/*two integer variables are used for front and rear pointers*/
	int items[]=new int[10];
	int front,rear;

	Queue()
	{/*create queue*/
		front=1;
		rear=0;
	}/*end createqueue*/

	int empty()
	{
		if((front==1)&&(rear==0) ||(front>rear))
			return 1;
		else
			return 0;


	}

	void display( )
	{
	/* function to display queue elements */
		int i=front;
		if(empty()==1)
			System.out.println("Q is empty ");
		else
		{
			System.out.print("Front-->");
			while(i<=rear)
			{
				System.out.print("  "+items[i]);
				i++;
			}
			System.out.println("<--Rear");
		}
	}


	void insert(int x)
	 {
	/*function to add new element*/
		if(rear==9)
			System.out.println("Queue is FUll");
		else
		{
			rear++;
			items[rear]=x;
		}

	}



	void remove()
	{
	/* Function to delete the largest number */
		int large,i,j,k;
		if(empty()!=1)
		{
			i=front+1;
			large=items[front];
			k=front;
			while(i<=rear)
			{
				if (items[i]>large)
				{
					 large=items[i];
					 k=i;
				}
				i++;
			}
			System.out.println("Deleted element : "+items[k]);
			if(k==front)/*if first element is deleted increment front pointer*/
				front++;
			else
			{
			/*if middle element or last element is deleted decrement rear pointer*/
			/*after coping all elements forward*/
			for(i=k;i<rear;i++)
				items[i]=items[i+1];
			rear--;
			}
		}
	}

}


class QPriority
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

}
}

/*
        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 1
Enter Number : 10
Front-->  10<--Rear

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 1
Enter Number : 60
Front-->  10  60<--Rear

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 1
Enter Number : 26
Front-->  10  60  26<--Rear

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 1
Enter Number : 77
Front-->  10  60  26  77<--Rear

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 2
Deleted element : 77
Front-->  10  60  26<--Rear

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 2
Deleted element : 60
Front-->  10  26<--Rear

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 2
Deleted element : 26
Front-->  10<--Rear

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 2
Deleted element : 10
Q is empty

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 2
Q is empty

        QUEUE
1.Insert
2.Remove
3.Exit
Enter your choice : 3
Press any key to continue . . .*/