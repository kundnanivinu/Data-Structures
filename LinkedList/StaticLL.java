
import java.util.Scanner;
class Nodetype
{
	int info,next;
	Nodetype(int i,int n)
	{
		info=i;
		next=n;
	}
}

class Operations
{

int maxnodes=10;
Nodetype node[]=new Nodetype[maxnodes];

int avail;
int list=-1;

void createlist()
{
/*link all available nodes together*/

	int i;
	avail=0;
	for(i=0;i<maxnodes-1;i++)
		node[i]=new Nodetype(0,i+1);
	node[maxnodes-1]=new Nodetype(0,-1);
}

int getnode()
{
/*obtain a node from available list and return its index */
	int p;
	if(avail==-1)
	{
		System.out.println("\nEmpty Linked List");
	}
	p=avail;
	avail=node[avail].next;
	return(p);
}/*end getnode*/

void freenode(int p)
{
/*accept index of a node and return that node to the available list*/
	node[p].next=avail;
	node[p].info=0;
	avail=p;
}/*end freenode*/


void display()
{
/*display all elements of linked list*/
	int i;
	int temp;
	if(list==-1)
		System.out.println("\nEmpty linked list");
	else
	{
		temp=list;
		//System.out.println("\n"+temp);
		System.out.println();

		while(temp!=-1)
		{
			System.out.print("-->|"+node[temp].info+"|"+node[temp].next+"|");
			temp=node[temp].next;
		}
	}
}/*end display*/



void insertbeg(int x)
{
/*insert new node at the beginning of linked list*/
	int q;
	q=getnode();
	node[q].info=x;
	node[q].next=list;
	list=q;
	display();
}/*end insertbeg*/


void deletebeg()
{
/*delete a node from the beginning of linked list*/
	int p,x;
	p=list;
	if(p==-1)
		System.out.println("\nEmpty Linked List");
	else
	{
		x=node[p].info;

		list=node[p].next;
		System.out.print("\nThe element deleted is "+x);
		freenode(p);
	}
	display();
}/*end deletebeg*/

void insertend(int x)
{
/*insert new node at the end of linked list*/
	int q,temp;
	q=getnode();
	node[q].info=x;
	node[q].next=-1;
	temp=list;
	if(temp==-1)
	{
		list=q;
	}
	else
	{
		while(node[temp].next!=-1)
			temp=node[temp].next;
		node[temp].next=q;
	}
	display();
}/*end insertend*/

void deleteend()
{
/*delete a node from the end of linked list*/
	int p,x,temp=-1;
	p=list;
	if(p==-1)
		System.out.println("\nEmpty Linked List");
	else
	{
		while(node[p].next!=-1)
		{
			temp=p;
			p=node[p].next;
		}
		x=node[p].info;
		node[temp].next=-1;
		System.out.print("\nThe element deleted is "+x);
		freenode(p);
	}
	display();
}/*delete end*/

void insertloc(int p,int x)
{
/*insert new node at specified location*/
	int t,i,q,temp;
	temp=list;
	for(i=0;i<(p-2);i++)
	{
		if(temp==-1)
			break;
		temp=node[temp].next;

	}
	if(temp!=-1)
	{
		q=getnode();
		node[q].info=x;
		node[q].next=node[temp].next;
		node[temp].next=q;
	}
	display();
}/*end insertloc*/

void deleteloc(int p)
{
/*delete a node from specified location*/
	int t=-1,i,q,temp;
	temp=list;
	if(p==1)
		list=node[list].next;
	for(i=0;i<p-1;i++)
	{
		if(node[temp].next==-1)
		{
		System.out.print("\nThere are less than "+p+" elements in list ");
		break;
		}
		t=temp;
		temp=node[temp].next;
	}
	if(i==p-1)
	{
		System.out.print("\nThe element deleted is "+node[temp].info);
		node[t].next=node[temp].next;
		freenode(temp);
	}
	display();
}/*end deleteloc*/

void search(int x)
{
/*search an element in linked list and return its location*/
	int i=1,q,p;
	if(list==-1)
		System.out.println("\nList is empty");
	else
	{
		q=list;
		do
		{
			if(node[q].info==x)
			{
				System.out.println("Element found at location "+i);
				break;
			}
			i++;
			q=node[q].next;
		}
		while(q!=-1);
		if(q==-1)
		System.out.println("Element not found");
	}
}/*end search*/

}


class StaticLL
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	Operations L =new Operations();
	L.createlist();

	int ch,n,nl;
	while(true)
	{
		System.out.println("\n\tSTATIC LINKED LIST");
		System.out.println("1.Insert in the beginning");
		System.out.println("2.Insert in the end");
		System.out.println("3.Insert at location");
		System.out.println("4.Delete from the beginning");
		System.out.println("5.Delete from the end");
		System.out.println("6.Delete from location");
		System.out.println("7.Search");
		System.out.println("8.Exit");
		System.out.print("Enter your choice : ");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:System.out.print("Enter Number : ");
				   n=sc.nextInt();
				   L.insertbeg(n);
				   break;
		    case 2:System.out.print("Enter Number : ");
				   n=sc.nextInt();
				   L.insertend(n);
		   		   break;
		    case 3:System.out.print("Enter Number : ");
				   n=sc.nextInt();
				   System.out.print("Enter Location : ");
				   nl=sc.nextInt();
				   L.insertloc(nl,n);
		   		   break;
			case 4:L.deletebeg();
				   break;
			case 5:L.deleteend();
				   break;
			case 6:System.out.print("Enter Location : ");
				   nl=sc.nextInt();
				   L.deleteloc(nl);
				   break;
			case 7:System.out.print("Enter Number : ");
				   n=sc.nextInt();
				   L.search(n);
				   break;
			case 8:return;
		}
	}

}
}


/*
        STATIC LINKED LIST
1.Insert in the beginning
2.Insert in the end
3.Insert at location
4.Delete from the beginning
5.Delete from the end
6.Delete from location
7.Search
8.Exit
Enter your choice : 1
Enter Number : 100

-->|100|-1|

        STATIC LINKED LIST
1.Insert in the beginning
2.Insert in the end
3.Insert at location
4.Delete from the beginning
5.Delete from the end
6.Delete from location
7.Search
8.Exit
Enter your choice : 1
Enter Number : 20

-->|20|0|-->|100|-1|

        STATIC LINKED LIST
1.Insert in the beginning
2.Insert in the end
3.Insert at location
4.Delete from the beginning
5.Delete from the end
6.Delete from location
7.Search
8.Exit
Enter your choice : 2
Enter Number : 50

-->|20|0|-->|100|2|-->|50|-1|

        STATIC LINKED LIST
1.Insert in the beginning
2.Insert in the end
3.Insert at location
4.Delete from the beginning
5.Delete from the end
6.Delete from location
7.Search
8.Exit
Enter your choice : 3
Enter Number : 22
Enter Location : 3

-->|20|0|-->|100|3|-->|22|2|-->|50|-1|

        STATIC LINKED LIST
1.Insert in the beginning
2.Insert in the end
3.Insert at location
4.Delete from the beginning
5.Delete from the end
6.Delete from location
7.Search
8.Exit
Enter your choice : 7
Enter Number : 50
Element found at location 4

        STATIC LINKED LIST
1.Insert in the beginning
2.Insert in the end
3.Insert at location
4.Delete from the beginning
5.Delete from the end
6.Delete from location
7.Search
8.Exit
Enter your choice : 7
Enter Number : 5
Element not found

        STATIC LINKED LIST
1.Insert in the beginning
2.Insert in the end
3.Insert at location
4.Delete from the beginning
5.Delete from the end
6.Delete from location
7.Search
8.Exit
Enter your choice : 4

The element deleted is 20
-->|100|3|-->|22|2|-->|50|-1|

        STATIC LINKED LIST
1.Insert in the beginning
2.Insert in the end
3.Insert at location
4.Delete from the beginning
5.Delete from the end
6.Delete from location
7.Search
8.Exit
Enter your choice : 5

The element deleted is 50
-->|100|3|-->|22|-1|


        STATIC LINKED LIST
1.Insert in the beginning
2.Insert in the end
3.Insert at location
4.Delete from the beginning
5.Delete from the end
6.Delete from location
7.Search
8.Exit
Enter your choice : 6
Enter Location : 2

The element deleted is 22
-->|100|-1|


        STATIC LINKED LIST
1.Insert in the beginning
2.Insert in the end
3.Insert at location
4.Delete from the beginning
5.Delete from the end
6.Delete from location
7.Search
8.Exit
Enter your choice : 7
Enter Number : 50
Element not found

        STATIC LINKED LIST
1.Insert in the beginning
2.Insert in the end
3.Insert at location
4.Delete from the beginning
5.Delete from the end
6.Delete from location
7.Search
8.Exit
Enter your choice : 8
Press any key to continue . . .*/
