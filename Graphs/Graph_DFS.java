import java.io.*;
import java.util.*;

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
		for(int i=0;i<=top;i++)
			System.out.println(stk[i]);
	}/*end display*/
}

class Graph
{
	int MAXSIZE=51;
	int adj[][]=new int[MAXSIZE][MAXSIZE];
	int visited[]=new int [MAXSIZE];
	Stack s=new Stack();
	/*Function  for Depth-First-Search    */

	void createGraph()
	{
		int n,i,j,parent,adj_parent,initial_node;
		int  ans=0,ans1=0;

		System.out.print("\nEnter total number elements in a Undirected Graph :");
		n=getNumber();
		for ( i=1;i<=n;i++)
			for( j=1;j<=n;j++)
				adj[i][j]=0;


		/*All graph nodes are unvisited, hence assigned zero to visited field of each node */
		for (int c=1;c<=50;c++)
			visited[c]=0;
		System.out.println("\nEnter graph structure for BFS  ");

		do
		{
			System.out.print("\nEnter parent node :");
			parent=getNumber();
			do
			{
				System.out.print("\nEnter adjacent node for node "+parent+ " : ");
				adj_parent=getNumber();
				adj[parent][adj_parent]=1;
				adj[adj_parent][parent]=1;
				System.out.print("\nContinue to add adjacent node for "+parent+"(1/0)?");
				ans1= getNumber();
			} while (ans1==1);
			System.out.print("\nContinue to add graph node?");
			ans= getNumber();
		}while (ans ==1);


		System.out.print("\nAdjacency matrix for your graph is :\n");
		for (i=1;i<=n;i++)
		{
			for (j=1;j<=n;j++)
			System.out.print(" "+adj[i][j]);
			System.out.print("\n");
		}

		System.out.println("\nYour Undirected Graph is :");
		for (i=1;i<=n;i++)
		{
			System.out.print("\nVertex "+i+"is connected to : ");
			for (j=1;j<=n;j++)
			{
			if (adj[i][j]==1)
			System.out.print(" "+j);
			}
		}
		System.out.println("\nEnter the initial node for BFS traversal:");
		initial_node=getNumber();
		DFS (initial_node, n);
	}

	void DFS (int initial_node,int n)
	{
		int u,i;
		s.top = -1;
		s.push(initial_node);
		System.out.println("\nDFS traversal for given graph is : ");
		while(!s.isempty())
		{
			u=s.pop();
			if(visited[u]==0)
			{
				System.out.print("\n"+u);
				visited[u]=1;
			}
			for (i=1;i<=n;i++)
			{
				if((adj[u][i]==1) && (visited[i]==0))
				{
					s.push(u);
					visited[i]=1;
					System.out.print(" "+i);
					u = i;
				}
			}
		}
	}/*  end of DFS function  */


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

class Graph_DFS
{
	public static void main(String args[])
	{
		Graph g=new Graph();
		g.createGraph();
	}         /*  end of program */
}


/*
Sample Input and Output :

Enter total number elements in a Undirected Graph :9

Enter graph structure for BFS

Enter parent node :1

Enter adjacent node for node 1 : 2

Continue to add adjacent node for 1(1/0)?1

Enter adjacent node for node 1 : 3

Continue to add adjacent node for 1(1/0)?0

Continue to add graph node?1

Enter parent node :2

Enter adjacent node for node 2 : 4

Continue to add adjacent node for 2(1/0)?1

Enter adjacent node for node 2 : 5

Continue to add adjacent node for 2(1/0)?0

Continue to add graph node?1

Enter parent node :3

Enter adjacent node for node 3 : 5

Continue to add adjacent node for 3(1/0)?0

Continue to add graph node?1

Enter parent node :4

Enter adjacent node for node 4 : 6

Continue to add adjacent node for 4(1/0)?1

Enter adjacent node for node 4 : 7

Continue to add adjacent node for 4(1/0)?0

Continue to add graph node?1

Enter parent node :5

Enter adjacent node for node 5 : 8

Continue to add adjacent node for 5(1/0)?0

Continue to add graph node?1

Enter parent node :6

Enter adjacent node for node 6 : 9

Continue to add adjacent node for 6(1/0)?0

Continue to add graph node?0

Adjacency matrix for your graph is :
 0 1 1 0 0 0 0 0 0
 1 0 0 1 1 0 0 0 0
 1 0 0 0 1 0 0 0 0
 0 1 0 0 0 1 1 0 0
 0 1 1 0 0 0 0 1 0
 0 0 0 1 0 0 0 0 1
 0 0 0 1 0 0 0 0 0
 0 0 0 0 1 0 0 0 0
 0 0 0 0 0 1 0 0 0

Your Undirected Graph is :

Vertex 1is connected to :  2 3
Vertex 2is connected to :  1 4 5
Vertex 3is connected to :  1 5
Vertex 4is connected to :  2 6 7
Vertex 5is connected to :  2 3 8
Vertex 6is connected to :  4 9
Vertex 7is connected to :  4
Vertex 8is connected to :  5
Vertex 9is connected to :  6
Enter the initial node for BFS traversal:
1

DFS traversal for given graph is :

1 2 4 6 9 7 5 8 3
*/