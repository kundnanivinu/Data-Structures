wsimport java.util.Scanner;
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
Nodetype list=null;


void display()
{
/*display all elements of linked list*/

	Nodetype temp;
	if(list==null)
		System.out.println("\nEmpty linked list");
	else
	{
		temp=list;
		//System.out.println("\n"+temp);
		System.out.println();

		while(temp!=null)
		{
			System.out.print("-->"+temp.info);
			temp=temp.next;
		}
	}
}/*end display*/



void insertbeg(int x)
{
/*insert new node at the beginning of linked list*/
	Nodetype node=new Nodetype(x);
	node.next=list;
	list=node;
	display();
}/*end insertbeg*/


void deletebeg()
{
/*delete a node from the beginning of linked list*/
	if(list==null)
		System.out.println("\nEmpty Linked List");
	else
	{
		System.out.print("\nThe element deleted is "+list.info);
		list=list.next;
	}
	display();
}/*end deletebeg*/


void insertend(int x)
{
/*insert new node at the end of linked list*/


	Nodetype node=new Nodetype(x);
	node.info=x;
	node.next=null;
	Nodetype temp;
	temp=list;
	if(temp==null)
	{
		list=node;
	}
	else
	{
		while(temp.next!=null)
			temp=temp.next;
		temp.next=node;
	}
	display();
}/*end insertend*/

void deleteend()
{
/*delete a node from the end of linked list*/
	Nodetype temp=null;
	Nodetype p=list;
	if(p==null)
		System.out.println("\nEmpty Linked List");
	else
	{
		while(p.next!=null)
		{
			temp=p;
			p=p.next;
		}
		System.out.print("\nThe element deleted is "+p.info);
		temp.next=null;
	}
	display();
}/*delete end*/


void insertloc(int p,int x)
{
/*insert new node at specified location*/
	int i;
	Nodetype temp=list;
	for(i=0;i<(p-2);i++)
	{
		if(temp==null)
			break;
		temp=temp.next;

	}
	if(temp!=null)
	{
		Nodetype node=new Nodetype(x);
		node.next=temp.next;
		temp.next=node;
	}
	display();
}/*end insertloc*/

void deleteloc(int p)
{
/*delete a node from specified location*/
	int i;
	Nodetype temp=list;
	Nodetype t=null;
	if(p==1)
		list=list.next;
	for(i=0;i<p-1;i++)
	{
		if(temp.next==null)
		{
		System.out.print("\nThere are less than "+p+" elements in list ");
		break;
		}
		t=temp;
		temp=temp.next;
	}
	if(i==p-1)
	{
		System.out.print("\nThe element deleted is "+temp.info);
		t.next=temp.next;
	}
	display();
}/*end deleteloc*/

void search(int x)
{
/*search an element in linked list and return its location*/
	int i=1;
	Nodetype q;
	if(list==null)
		System.out.println("\nList is empty");
	else
	{
		q=list;
		do
		{
			if(q.info==x)
			{
				System.out.println("\nElement found at location "+i);
				break;
			}
			i++;
			q=q.next;
		}
		while(q!=null);
		if(q==null)
		System.out.println("\nElement not found");
	}
}/*end search*/

}


class DynamicLL
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	Operations L =new Operations();
	int ch,n,nl;
	System.out.println("\n\tSTATIC LINKED LIST");
	System.out.println("1.Insert in the beginning");
	System.out.println("2.Insert in the end");
	System.out.println("3.Insert at location");
	System.out.println("4.Delete from the beginning");
	System.out.println("5.Delete from the end");
	System.out.println("6.Delete from location");
	System.out.println("7.Search");
	System.out.println("8.Exit");
	while(true)
	{
		System.out.print("\nEnter your choice : ");
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
Enter Number : 10

-->10
Enter your choice : 2
Enter Number : 20

-->10-->20
Enter your choice : 1
Enter Number : 30

-->30-->10-->20
Enter your choice : 3
Enter Number : 99
Enter Location : 3

-->30-->10-->99-->20
Enter your choice : 1
Enter Number : 100

-->100-->30-->10-->99-->20
Enter your choice : 4

The element deleted is 100
-->30-->10-->99-->20
Enter your choice : 5

The element deleted is 20
-->30-->10-->99
Enter your choice : 6
Enter Location : 2

The element deleted is 10
-->30-->99
Enter your choice : 7
Enter Number : 100

Element not found

Enter your choice : 7
Enter Number : 99

Element found at location 2

Enter your choice : 8
*/
