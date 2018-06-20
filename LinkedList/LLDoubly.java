/*Program to implement Doubly Linked List*/

import java.util.Scanner;
class Nodetype
{
	int info;
	Nodetype right,left;
	Nodetype(int i)
	{
		info=i;
		right=null;
		left=null;
	}
}


class Operations
{
Nodetype list=null;



void display()
{
/*display all nodes*/
	Nodetype t;
	t=list;
	if(t==null)
		System.out.println("\nThe linked list is empty");
	else
	{
		System.out.print("\nList");
		while(t!=null)
		{
			System.out.print("<==>|"+t.info+"|");
			t=t.right;
		}
	}
}/*end display*/

void insertbeg(int x)
{
/*insert new element in the beginning of linked list*/
	Nodetype q=new Nodetype(x);
	q.info=x;
	q.right=list;
	if(list!=null)
	list.left=q;
	q.left=null;
	list=q;
	display();
}/*end insertbeg*/

void deletebeg()
{
/*delete a node from the beginning of the linked list*/
	int x;
	Nodetype q;
	q=list;
	if(list==null)
		System.out.println("\nThe linked list is empty");
	else
	{
		x=q.info;
		list=q.right;
		(q.right).left=null;
		System.out.println("\n\nThe deleted element is "+x);
		display();
	}
}/*end deletebeg*/

void insertend(int x)
{
/*insert new element at the end of linked list*/
	Nodetype temp;
	Nodetype q=new Nodetype(x);
	q.info=x;
	q.right=null;
	temp=list;
	if(list==null)
	{
		list=q;
		q.left=null;
	}
	else
	{
		while(temp.right!=null)
			temp=temp.right;
		temp.right=q;
		q.left=temp;
	}
	display();
}/*end insertend*/

void deleteend()
{
/*delete a node from the end of the linked list*/
	Nodetype q,temp=null;
	int x;
	q=list;
	if(list==null)
		System.out.println("\nThe linked list is empty");
	else
	{
		if(list.right==null)
			list=null;
		else
		{
			while(q.right!=null)
			{
				temp=q;
				q=q.right;
			}
		temp.right=null;
		}
	System.out.println("\n\nThe deleted element is "+q.info);
	}
	display();
}/*end deleteend
*/
void insright(int x,int nx)
{
/*insert new element towards right of a  specific node*/
	Nodetype r,t;
	t=list;
	do
	{
		if(t.info==x)          /*node found*/
			break;
		else
			t=t.right;

	}while(t!=null);
	if(t==null)
	{
		System.out.println("\nElement not found");
		return;
	}
	Nodetype q=new Nodetype(x);
	q.info=nx;
	r=t.right;
	if(r!=null)
		r.left=q;
	q.right=r;
	q.left=t;
	t.right=q;

	display();
}/*end insright*/

void delright(int x)
{
/*delete a node which is towards right of a node*/
	Nodetype q,t;
	t=list;
	do
	{
		if(t.info==x) /*node found*/
			break;
		else
			t=t.right;

	}while(t!=null);
	if(t==null)
	{
		System.out.println("\nElement not found");
		return;
	}
	if(t.right==null)
	{
		System.out.println("\nThere is no right node");
		return;
	}
	q=t.right;
	System.out.println("\n\nThe deleted element is "+q.info);
	t.right=q.right;
	if(q.right!=null)
		(q.right).left=t;
	display();
}/*end delafter*/

void insleft(int x,int nx)
{
/*insert new node towards left of a specific node*/
	Nodetype l,t;

	t=list;
	do
	{
		if(t.info==x)
			break;
		else
			t=t.right;

	}while(t!=null);
	if(t==null)
	{
		System.out.println("\nElement not found");
		return;
	}
	Nodetype q=new Nodetype(x);
	q.info=nx;
	l=t.left;
	if(l!=null)
		l.right=q;
	q.right=t;
	q.left=l;
	t.left=q;
	if(t==list)
		list=q;
	display();

}/*end insloc*/

void delleft(int x)
{
/*delete a node which is towards left of a specific node*/
	Nodetype l,q,t;
	t=list;
	do
	{
		if(t.info==x)
			break;
		else
			t=t.right;
	}while(t!=null);
	if(t==null)
	{
		System.out.println("\nElement not found");
		return;
	}
	if(t.left==null)
	{
		System.out.println("\nThere is no left node");
		return;
	}
	q=t.left;
	if(q==list)
		list=t;
	System.out.println("\n\nThe deleted element is "+q.info);
	t.left=q.left;
	l=q.left;
	if(l!=null)
		(q.left).right=t;

	display();

}/*end delloc*/
}

class LLDoubly
{

public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	Operations L =new Operations();

	int ch,n,nl;
	System.out.println("\n\tDOUBLY LINKED LIST");
	System.out.println("1.Insert in the beginning");
	System.out.println("2.Insert in the end");
	System.out.println("3.Insert right ");
	System.out.println("4.Insert left ");
	System.out.println("5.Delete from the beginning");
	System.out.println("6.Delete from the end");
	System.out.println("7.Delete right");
	System.out.println("8.Delete left");
	System.out.println("9.Exit");
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
				   System.out.print("Enter number present in the list : ");
				   nl=sc.nextInt();
				   L.insright(nl,n);
		   		   break;
		   	case 4:System.out.print("Enter Number : ");
				   n=sc.nextInt();
				   System.out.print("Enter number present in the list : ");
				   nl=sc.nextInt();
				   L.insleft(nl,n);
		   		   break;
			case 5:L.deletebeg();
				   break;
			case 6:L.deleteend();
				   break;
			case 7:System.out.print("Enter number present in the list: ");
				   nl=sc.nextInt();
				   L.delright(nl);
				   break;
			case 8:System.out.print("Enter number present in the list: ");
				   nl=sc.nextInt();
				   L.delleft(nl);
				   break;
			case 9:return;
		}
	}

}/*end main*/
}


/*
        DOUBLY LINKED LIST
1.Insert in the beginning
2.Insert in the end
3.Insert right
4.Insert left
5.Delete from the beginning
6.Delete from the end
7.Delete right
8.Delete left
9.Exit

Enter your choice : 1
Enter Number : 10

List<==>|10|
Enter your choice : 1
Enter Number : 20

List<==>|20|<==>|10|
Enter your choice : 2
Enter Number : 30

List<==>|20|<==>|10|<==>|30|
Enter your choice : 3
Enter Number : 99
Enter number present in the list : 10

List<==>|20|<==>|10|<==>|99|<==>|30|
Enter your choice : 4
Enter Number : 232
Enter number present in the list : 99

List<==>|20|<==>|10|<==>|232|<==>|99|<==>|30|
Enter your choice : 5


The deleted element is 20

List<==>|10|<==>|232|<==>|99|<==>|30|
Enter your choice : 7
Enter number present in the list: 232


The deleted element is 99

List<==>|10|<==>|232|<==>|30|
Enter your choice : 8
Enter number present in the list: 30


The deleted element is 232

List<==>|10|<==>|30|
Enter your choice : 6


The deleted element is 30

List<==>|10|
Enter your choice : 6


The deleted element is 10

The linked list is empty

Enter your choice : 9
*/
