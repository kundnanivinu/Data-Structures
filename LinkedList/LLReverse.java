/*Program to reverse the linked list*/
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
	Nodetype l1=null;
	Nodetype list=null;


void display()
{
/*display all elements*/
	Nodetype  p;
	p=list;
	if(p==null)
	{
		System.out.println("\nThe list is empty:\n");
		return;
	}
	System.out.print("List");
	while(p!=null)
	{
		System.out.print("->"+p.info);
		p=p.next;
	}
	System.out.println("\n");
}/*end display*/

void addend(int x)
{
/*add new element in the end of this list*/
	Nodetype temp;
	Nodetype p=new Nodetype(x);

	p.info=x;
	p.next=null;
	temp=list;
	if(temp==null)
	{
	       list=p;
	}
	else
	{
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=p;
	}
}/*end addend*/

void addbeg(int x)
{
/*insert new element at the beginning of linked list*/
	Nodetype q=new Nodetype(x);

	q.info=x;
	q.next=list;
	list=q;
}/*end addbeg*/




void reverse()
{
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("\nEnter Elements (Enter -1 to stop) : ");
	while(true)
	{
	n=sc.nextInt();
	if (n==-1)
	break;
	else
		addend(n);
	l1=list;
	display();
	}

	list=null;
	System.out.println("\nThe elements of the linked list in reverse order : ");
    while(l1!=null)
	{
		/*insert element in the beginning of second linked list*/
		addbeg(l1.info);
		l1=l1.next;
	}
	display();

}
}


class LLReverse
{
public static void main(String args[])
{
	Operations L =new Operations();
	L.reverse();
}
}


/*
Enter Elements (Enter -1 to stop) :
1
List->1

2
List->1->2

3
List->1->2->3

4
List->1->2->3->4

-1

The elements of the linked list in reverse order :
List->4->3->2->1

*/
