/*Program for dynamic implementation of sorted linked list*/

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
Nodetype list=null;

void display()
{
/*display all elements of linked list*/

	Nodetype temp;j
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


void insert(int x)
{
	Nodetype p=null;
	Nodetype temp=list;
	Nodetype node=new Nodetype(x);

	if(temp==null)
	{
		list=node;
		node.next=temp;
		display();
		return;
	}
	while(temp!=null)
	/*travel linked list till u get its correct position*/
	{
		if(x >= temp.info)
		{
		p=temp;
		temp=temp.next;
		}
		else
			break;
	}
	if(temp!=null&&list==temp)
	/*insert new node in the beginning*/
	{	list=node;
		node.next=temp;
		display();
		return;
	}
	/*insert in the middle*/
	node.next=p.next;
	p.next=node;
	display();
}/*end insert*/

void deleten(int x)
{

	Nodetype p=null;
	Nodetype temp=list;
	/*travel linked list till u get its correct position*/
	while(temp!=null)
	{
		if(x==temp.info)
			break;
		else
		{
		p=temp;
		temp=temp.next;
		}
	}
	if(temp==null)
	{
		System.out.println("List is empty/element not found");
		return;
	}
	else
	if(temp==list)
	{
		list=temp.next;
		display();
		return;
	}
	else
	p.next=temp.next;
	display();
}
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
				System.out.print("\nElement found at location "+i);
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


class SortedLL
{

public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	Operations L =new Operations();
	int ch,n;

	while(true)
	{
		System.out.println("\n\nSORTED LINKED LIST");
		System.out.println("1.Insert");
		System.out.println("2.Delete");
		System.out.println("3.Search");
		System.out.println("4.Exit");
		System.out.print("Enter your choice : ");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:System.out.print("Enter Number : ");
				   n=sc.nextInt();
				   L.insert(n);
				   break;
			case 2:System.out.print("Enter Number : ");
				   n=sc.nextInt();
				   L.deleten(n);
				   break;
			case 3:System.out.print("Enter Number : ");
				   n=sc.nextInt();
				   L.search(n);
				   break;
			case 4:return;
		}
		}


}/*end main*/
}


/*
SORTED LINKED LIST
1.Insert
2.Delete
3.Search
4.Exit
Enter your choice : 1
Enter Number : 10

-->10

SORTED LINKED LIST
1.Insert
2.Delete
3.Search
4.Exit
Enter your choice : 1
Enter Number : 1

-->1-->10

SORTED LINKED LIST
1.Insert
2.Delete
3.Search
4.Exit
Enter your choice : 1
Enter Number : 50

-->1-->10-->50

SORTED LINKED LIST
1.Insert
2.Delete
3.Search
4.Exit
Enter your choice : 1
Enter Number : 30

-->1-->10-->30-->50

SORTED LINKED LIST
1.Insert
2.Delete
3.Search
4.Exit
Enter your choice : 3
Enter Number : 30

Element found at location 3

SORTED LINKED LIST
1.Insert
2.Delete
3.Search
4.Exit
Enter your choice : 2
Enter Number : 30

-->1-->10-->50

SORTED LINKED LIST
1.Insert
2.Delete
3.Search
4.Exit
Enter your choice : 2
Enter Number : 100

 list is empty/element not found


SORTED LINKED LIST
1.Insert
2.Delete
3.Search
4.Exit
Enter your choice : 4
Press any key to continue . . .*/
