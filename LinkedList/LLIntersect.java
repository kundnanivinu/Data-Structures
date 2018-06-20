/*Program for intersection of elements of two linked lists*/
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

Nodetype list1=null;
Nodetype list2=null;
Nodetype list=null;


void display(Nodetype  list)
{
/*display all nodes*/
	Nodetype  t;
	t=list;
	if(t==null)
		System.out.println("Linked list is empty");
	else
	{
		while(t!=null)
		{
			System.out.print("->"+t.info);
			t=t.next;
		}
	}
}/*end display*/


void addend(int x)
{
/*insert new element at the end of linked list*/
/*list will point to the list1 node and last will point to the last node*/
	Nodetype temp;
	Nodetype p=new Nodetype(x);
	temp=list;
	if(temp==null)
	    list=p;
	else
	{
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=p;
	}
}/*void insertend*/


void intersection()
{
/*find common elements */
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("\nEnter Elements (Enter -1 to stop) : ");
	System.out.println("\nFirst linked list : \nList1:");
	while(true)
	{
	n=sc.nextInt();
	if (n==-1)
		break;
	else
		addend(n);
	}
	list1=list;
	display(list1);
	list=null;
	System.out.println("\nSecond linked list : \nList2:");
	while(true)
	{
	n=sc.nextInt();
	if (n==-1)
		break;
	else
		addend(n);

	}
	list2=list;
	display(list2);
	list=null;


	Nodetype  i,j;
	for(i=list1;i!=null;i=i.next)
	{
		for(j=list2;j!=null;j=j.next)
		{
			if(i.info==j.info)
			{
				addend(i.info);
				break;
			}
		}
	}
	System.out.println("\nResultant linked list : \nList3:");
	display(list);
}/*end intersection*/
}


class LLIntersect
{
public static void main(String args[])
{
	Operations L =new Operations();
	L.intersection();

}/*end main*/

}

/*
Enter Elements (Enter -1 to stop) :
First linked list :
List1:
1 3 4 5 -1
->1->3->4->5
Second linked list :
List2:
5 2 7 8 1 -1
->5->2->7->8->1
Resultant linked list :
List3:
->1->5
*/

