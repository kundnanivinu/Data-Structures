import java.io.*;
import java.util.*;
//--------------------------------------------------------------------------------
class Nodetype
{
	int info;
    Arctype arcptr;
    Nodetype nextnode;
    Nodetype(int i)
	{
			info=i;
			arcptr=null;
			nextnode=null;
	}
}
//--------------------------------------------------------------------------------
class Arctype
{

    Nodetype nodeptr;
    Arctype nextarc;
    Arctype()
	{
		nodeptr=null;
		nextarc=null;
	}
}
//--------------------------------------------------------------------------------



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
			items[++rear]=e;
	}/*end insert*/

	int empty()
	{/*Return 1 if queue is empty and 0 otherwise*/
		return(rear<front? 1:0);
	}/*end empty*/

	int remove()
	{/*if queue is not empty remove one element from front */

		int x=0;
		if(empty()==1)
		{
			System.out.println("Queue Underflow");
			return 0;
		}
		else
		{
			x=items[front++];
			return x;
		}
		/*end else*/
	}/*end rem*/
}
//-------------------------------------------------------------------------------

class Operations
{
Nodetype graph=null;

	void insertnode(int x)
	{
	/*insert new node at the end of linked graph*/

		Nodetype node=new Nodetype(x);
		Nodetype temp;
		temp=graph;
		if(temp==null)
			graph=node;
		else
		{
			while(temp.nextnode!=null)
				temp=temp.nextnode;
			temp.nextnode=node;
		}
	}/*end insertnode*/


	void insertarc(int i)
	{
	/*insert new node at the end of linked graph*/
		int x,ans;
		Nodetype temp1,temp2;
		Arctype temp3=null;

		temp1=searchnode(i);
		do
		{
			System.out.print("\nEnter adjacent node for node "+i+ " : ");
			x=getNumber();
			temp2=searchnode(x);
			if (temp2!=null)
			{
				Arctype node=new Arctype();
				node.nodeptr=temp2;
				node.nextarc=null;

				if (temp1.arcptr==null)
					temp1.arcptr=node;
				else
				{
					temp3=temp1.arcptr;
					while (temp3.nextarc!=null)
						temp3=temp3.nextarc;
					temp3.nextarc=node;
				}
			}
			System.out.print("\nContinue to add adjacent node for "+i+"(1/0)?");
			ans=getNumber();
		}while(ans==1);

		System.out.print("\nNode "+i+ "is connected to : ");
		temp3=temp1.arcptr;
		do
		{
			System.out.print(" "+(temp3.nodeptr).info);
			temp3=temp3.nextarc;
		}while (temp3!=null);

	}/*end insertarc*/


	Nodetype searchnode(int x)
	{
	/*search an element in linked graph and return its location*/
		int i=1;
		Nodetype q;
		if(graph==null)
		{
			System.out.println("\nList is empty");
			return null;
		}
		else
		{
			q=graph;
			do
			{
				if(q.info==x)
					break;
				i++;
				q=q.nextnode;
			}
			while(q!=null);
			if(q==null)
			{
					System.out.println("\nNode not found");
					return null;
			}
			else
					return q;
		}
	}/*end searchnode*/

	int  adjacent(int u,int i)
	{
	int x,ans;
		Nodetype temp1,temp2;
		Arctype temp3=null;
		temp1=searchnode(u);
		temp3=temp1.arcptr;
		do
		{
		if ((temp3.nodeptr).info==i)
				return 1;
		else
			temp3=temp3.nextarc;
		}while (temp3!=null);
		return 0;
	}/*end adjacent*/

	void creategraph()
	{
		int i,n=0,x,ans1,initial_node;
		System.out.println("Enter no. of nodes : ");
		n=getNumber();
		for(i=1;i<=n;i++)
			insertnode(i);
		for(i=1;i<=n;i++)
			insertarc(i);
		System.out.println("\nEnter the initial node for BFS traversal:");
			initial_node=getNumber();
		BFS(initial_node,n);
	}/*end creategraph*/

	void BFS (int initial_node,int n)
	{
		Queue q=new Queue();
		int u,i;
		u = initial_node;
		int visited[]=new int[n+1];

		visited[initial_node]=1;
		System.out.println("\nBFS traversal for given graph is : ");
		System.out.print(initial_node);
		q.insert(initial_node);
		while(q.empty()==0)
		{
			u = q.remove();
			  for (i=1;i<=n;i++)
			 {
				if((adjacent(u,i)==1) && (visited[i]==0))
				{
				  q.insert(i);
				  visited[i]=1;
				  System.out.print(" "+i);
				 }
			  }
		}
	} /* end of BFS function    */


	int getNumber()
 	{
 		 String str;
 		 int ne=0;
 		 InputStreamReader input=new InputStreamReader(System.in);
 		 BufferedReader in=new BufferedReader(input);
 		 try
 		 {
 			 str=in.readLine();
 			 ne=Integer.parseInt(str);
 		 }
 		 catch(Exception e)
 		 {
 			System.out.println("I/O Error");
 		 }
 		 return ne;
	}

}
//-------------------------------------------------------------------------------

class Graph_Linked
{
	public static void main(String args[])
	{
		Operations L =new Operations();
		L.creategraph();
	}
}

/*
Enter no. of nodes :
9

Enter adjacent node for node 1 : 2

Continue to add adjacent node for 1(1/0)?1

Enter adjacent node for node 1 : 3

Continue to add adjacent node for 1(1/0)?0

Node 1is connected to :  2 3
Enter adjacent node for node 2 : 1

Continue to add adjacent node for 2(1/0)?1

Enter adjacent node for node 2 : 4

Continue to add adjacent node for 2(1/0)?1

Enter adjacent node for node 2 : 5

Continue to add adjacent node for 2(1/0)?0

Node 2is connected to :  1 4 5
Enter adjacent node for node 3 : 1

Continue to add adjacent node for 3(1/0)?1

Enter adjacent node for node 3 : 5

Continue to add adjacent node for 3(1/0)?0

Node 3is connected to :  1 5
Enter adjacent node for node 4 : 2

Continue to add adjacent node for 4(1/0)?1

Enter adjacent node for node 4 : 6

Continue to add adjacent node for 4(1/0)?1

Enter adjacent node for node 4 : 7

Continue to add adjacent node for 4(1/0)?0

Node 4is connected to :  2 6 7
Enter adjacent node for node 5 : 2

Continue to add adjacent node for 5(1/0)?1

Enter adjacent node for node 5 : 3

Continue to add adjacent node for 5(1/0)?1

Enter adjacent node for node 5 : 8

Continue to add adjacent node for 5(1/0)?0

Node 5is connected to :  2 3 8
Enter adjacent node for node 6 : 4

Continue to add adjacent node for 6(1/0)?1

Enter adjacent node for node 6 : 9

Continue to add adjacent node for 6(1/0)?0

Node 6is connected to :  4 9
Enter adjacent node for node 7 : 4

Continue to add adjacent node for 7(1/0)?0

Node 7is connected to :  4
Enter adjacent node for node 8 : 5

Continue to add adjacent node for 8(1/0)?0

Node 8is connected to :  5
Enter adjacent node for node 9 : 6

Continue to add adjacent node for 9(1/0)?0

Node 9is connected to :  6
Enter the initial node for BFS traversal:
1

BFS traversal for given graph is :
1 2 3 4 5 6 7 8 9
*/