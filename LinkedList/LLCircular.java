/*program for circular linked list*/
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
	Nodetype p=null;
	p=list;
	if(list==null)
		System.out.println("\nThe list is empty");
	else
	{
		System.out.println();
		p=p.next;
		while(p!=list)
		{
			System.out.print("-->"+p.info);
			p=p.next;
		}
		System.out.print("-->"+p.info);
	}
}/*end display*/

void insertbeg(int x)
{
	Nodetype p=new Nodetype(x);
	p.info=x;
	if(list==null)
	{
		list=p;
		p.next=p;
	}
    else
    {
		p.next=list.next;
		list.next=p;
	}
	display();
}/*end insertbeg*/

void insertend(int x)
{
	Nodetype p=new Nodetype(x);
	p.info=x;
	if(list==null)
		p.next=p;
	else
	{
		p.next=list.next;
		list.next=p;
	}
	list=p;
	display();
}/*end insertend*/

void deletebeg()
{
	Nodetype p=null;
	if(list==null)
		System.out.println("\nThe List is empty");
    else
    {
		p=list.next;
		System.out.print("\nThe element deleted is "+p.info);
        list.next=p.next;
        if(list.next==p)
			list=null;
		display();
	}
}/*end deletebeg*/

void deleteend()
{
	Nodetype p,q;
	if(list==null)
		System.out.println("\nThe list is empty");
	else
	{
		q=list;
		p=list;
		if(p.next==p)
			list=null;
		else
		{
			while(q.next!=p)
				q=q.next;
			q.next=p.next;
			list=q;
		}
		System.out.print("\nThe element deleted is "+p.info);
		display();
	}
}/*end deleteend*/
}


class LLCircular
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	Operations L =new Operations();

	int ch,n,nl;
	System.out.println("\n\tCIRCULAR LINKED LIST");
	System.out.println("1.Insert in the beginning");
	System.out.println("2.Insert in the end");
	System.out.println("3.Delete from the beginning");
	System.out.println("4.Delete from the end");
	System.out.println("5.Exit");
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
			case 3:L.deletebeg();
				   break;
			case 4:L.deleteend();
				   break;
			case 5:return;
		}
	}

}/*end main*/
}

/*
        CIRCULAR LINKED LIST
1.Insert in the beginning
2.Insert in the end
3.Delete from the beginning
4.Delete from the end
5.Exit

Enter your choice : 1
Enter Number : 10

-->10
Enter your choice : 1
Enter Number : 20

-->20-->10
Enter your choice : 2
Enter Number : 30

-->20-->10-->30
Enter your choice : 2
Enter Number : 40

-->20-->10-->30-->40
Enter your choice : 3

The element deleted is 20
-->10-->30-->40
Enter your choice : 4

The element deleted is 40
-->10-->30
Enter your choice : 2
Enter Number : 55

-->10-->30-->55
Enter your choice : 1
Enter Number : 66

-->66-->10-->30-->55
Enter your choice : 5
*/
