/*implementation of Josephus problem*/
import java.io.*;
import java.io.DataInputStream;

class Nodetype
{
	String name;
	Nodetype next;

	Nodetype(String n)
	{
		name=new String(n);
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
			System.out.print("-->"+p.name);
			p=p.next;
		}
		System.out.print("-->"+p.name);
	}
}/*end display*/

void insertend(String  n)
{
	Nodetype temp=null;
	Nodetype q=new Nodetype(n);

	q.name=n;
	q.next=null;
	temp=list;
	if(temp==null)
		q.next=q;
	else
	{
		q.next=list.next;
		list.next=q;
	}
	list=q;
	//display();

}/*insertend*/

void delafter(String n)
{
	Nodetype q=null;
	String name;
	q=list;
	if((q==null)||(q==q.next))
		System.out.println("\nNode cannot be deleted");
	else
	{
		q=list.next;
		name=q.name;
		System.out.println(name);
		list.next=q.next;

	}
}/*end delafter*/

void joseph()
{
	String end=new String("end");
	String name=null;

	DataInputStream in=new DataInputStream(System.in);

	int n=0,i=0;;
	Nodetype q=null,t=null;



	System.out.println("\t\tJosephus problem");
	System.out.println("\nEnter names of the soldiers, enter \"end\" as last string : ");
	//scanf("%s",name);

		try
		{
		name=in.readLine();
		}
		catch(Exception e)
		{
			System.out.println("I/O Error");
		}

	while(name.equals(end)==false)
	{
		insertend(name);   /*form linked list*/
		try
				{
				name=in.readLine();
				}
				catch(Exception e)
				{
					System.out.println("I/O Error");
		}

	}

	System.out.println("\nSoldiers : ");
	display();

	System.out.println("\nEnter n : ");
	//scanf("%d",&n);
	try
	{
		name=in.readLine();
		n=Integer.parseInt(name);
	}
	catch(Exception e)
	{
		System.out.println("I/O Error");
	}


	System.out.println("\nEnter the name from whom counting begins : ");
	//scanf("%s",name);
	try
	{
		name=in.readLine();
	}
	catch(Exception e)
	{
		System.out.println("I/O Error");
	}


	if(name.equals(list.name))
	{
		q=list.next;
		while(q!=list)
		{
			t=q;
			q=q.next;
		}
	}
	else
	{
		while(name.equals(list.name)==false)
		{
			t=list;
			list=list.next;
		}
	}
	list=t;
	System.out.println("\nOrder in which the soldiers are eliminated ...");
	while(list!=list.next)
	{
		for(i=1;i<n;i++)
			list=list.next;
		delafter(name);
		//System.out.println(name);

	}
	System.out.println("\nThe soldier who escapes is : "+list.name);

}/*end josephus*/

}


class Josephus
{

public static void main(String args[])
{
	Operations L =new Operations();
	L.joseph();

}/*end main*/
}
  /*              Josephus problem

Enter names of the soldiers, enter "end" as last string :
Ajay
Rajeev
Shekhar
Deepak
Sanket
end

Soldiers :

-->Ajay-->Rajeev-->Shekhar-->Deepak-->Sanket
Enter n :
3

Enter the name from whom counting begins :
Shekhar

Order in which the soldiers are eliminated ...
Sanket
Shekhar
Rajeev
Deepak

The soldier who escapes is : Ajay
*/