/*Program for dynamic implementation of sorted Doubly linked list*/
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

void insert(int x)
{
	Nodetype  p=null,temp;
	temp=list;
	Nodetype q=new Nodetype(x);
	//q.info=x;
	if(temp==null)
	{
		list=q;
		q.right=temp;
		q.left=null;
		display();
	return;
	}
	while(temp!=null)
	{
		/*travel linked list till u get its correct position*/
		if(x >= temp.info)
		{
			p=temp;
			temp=temp.right;
		}
		else
			break;
	}
	if(temp!=null&&list==temp)
	{
		/*insert new node in the beginning*/
		list=q;
		q.right=temp;
		q.left=null;
		display();
		return;
	}
	/*insert in the middle*/
	q.right=p.right;
	p.right=q;
	q.left=p;
	(p.right).left=q;
	display();

}/*end insert*/
void deleten(int x)
{
	Nodetype  p=null,temp;
	temp=list;
	/*travel linked list till u get its correct position*/
	while(temp!=null)
	{
		if(x==temp.info)
			break;
		else
		{
		p=temp;
		temp=temp.right;
		}
	}
	if (temp==null)
	{
		System.out.println("\nList is empty/Element not found");
		return;
	}
	if (temp==list)
	{
		list=temp.right;
		(temp.right).left=null;

		display();
		return;
	}
	p.right=temp.right;
	(temp.right).left=p;

	display();
}

void search(int x)
{
	int i=0;
	Nodetype  p,temp;
	temp=list;
	/*travel linked list till u get its correct position*/
	while(temp!=null)
	{
		i++;
		if(x==temp.info)
		{
			System.out.println("\nElement found at position : "+i);
			break;
		}
		else
		{
		p=temp;
		temp=temp.right;
		}
	}
	if(temp==null)
	{
		System.out.println("\n list is empty/element not found");
		return;
	}

}
}

class DLLSorted
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	Operations L =new Operations();
	int ch,n;

	while(true)
	{
		System.out.println("\n\nSORTED DOUBLY LINKED LIST");
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
SORTED DOUBLY LINKED LIST
1.Insert
2.Delete
3.Search
4.Exit
Enter your choice : 1
Enter Number : 10

List<==>|10|

SORTED DOUBLY LINKED LIST
1.Insert
2.Delete
3.Search
4.Exit
Enter your choice : 1
Enter Number : 1

List<==>|1|<==>|10|

SORTED DOUBLY LINKED LIST
1.Insert
2.Delete
3.Search
4.Exit
Enter your choice : 1
Enter Number : 150

List<==>|1|<==>|10|<==>|150|

SORTED DOUBLY LINKED LIST
1.Insert
2.Delete
3.Search
4.Exit
Enter your choice : 1
Enter Number : 50

List<==>|1|<==>|10|<==>|50|<==>|150|

SORTED DOUBLY LINKED LIST
1.Insert
2.Delete
3.Search
4.Exit
Enter your choice : 1
Enter Number : 75

List<==>|1|<==>|10|<==>|50|<==>|75|<==>|150|

SORTED DOUBLY LINKED LIST
1.Insert
2.Delete
3.Search
4.Exit
Enter your choice : 1
Enter Number : 100

List<==>|1|<==>|10|<==>|50|<==>|75|<==>|100|<==>|150|

SORTED DOUBLY LINKED LIST
1.Insert
2.Delete
3.Search
4.Exit
Enter your choice : 3
Enter Number : 75

Element found at position : 4


SORTED DOUBLY LINKED LIST
1.Insert
2.Delete
3.Search
4.Exit
Enter your choice : 2
Enter Number : 75

List<==>|1|<==>|10|<==>|50|<==>|100|<==>|150|

SORTED DOUBLY LINKED LIST
1.Insert
2.Delete
3.Search
4.Exit
Enter your choice : 2
Enter Number : 1

List<==>|10|<==>|50|<==>|100|<==>|150|

SORTED DOUBLY LINKED LIST
1.Insert
2.Delete
3.Search
4.Exit
Enter your choice : 4
*/