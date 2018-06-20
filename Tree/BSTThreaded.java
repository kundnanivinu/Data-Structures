import java.io.*;
import java.util.*;

class Nodetype
{
	 int info;
	 Nodetype left;
	 Nodetype right;
	 int rthread;
	 Nodetype(int i)
	 {
		info=i;
		left=null;
		right=null;
		rthread=1;
	 }
}

class Functions
{
Nodetype maketree(int x)
{
	Nodetype node=new Nodetype(x);
	return(node);
}/*end maketree*/


void intrav(Nodetype tree)
{
	Nodetype p,q;
	p=tree;
	do
	{
		q=null;
		while(p!=null)        /*traverse left branch*/
		{
			q=p;
			p=p.left;
		}
		if(q!=null)
		{
			System.out.print(q.info+" ");
			p=q.right;
		}
		while((q.rthread==1)&&(p!=null))
		{
			System.out.print(p.info+" ");
			q=p;
			p=p.right;
		}
	}
	while(q!=null);
}/*end intrav*/


void setleft(Nodetype p,int x)
{
	if(p==null)
		System.out.println("\nInvalid insertion");
	else
		if(p.left!=null)
			System.out.println("\nInvalid insertion");
		else
		{
			Nodetype q=new Nodetype(x);
			p.left=q;
			q.right=p;
		}
}/*end setleft*/


void setright(Nodetype p,int x)
{
	Nodetype r;
	if(p==null)
		System.out.println("\nInvalid insertion");
	else
		if(p.rthread==0)
			System.out.println("\nInvalid insertion");
		else
		{
			Nodetype q=new Nodetype(x);
			r=p.right;
			p.right=q;
			p.rthread=0;
			q.right=r;
		}
}/*end setright*/


void create()
{
	Nodetype ptree,p,q;
	int n,number=0,i;
	System.out.print("\nEnter number of nodes : ");
	n=getNumber();
	System.out.println("\nEnter info "+n+" nodes :");
	number=getNumber();
	ptree=maketree(number);
	for(i=1;i<n;i++)
	{
		number=getNumber();
		p=q=ptree;
		while(q!=null&&number!=p.info)
		{
			p=q;
			if(number<p.info)
				  q=p.left;
			else
				  q=p.right;
		}
		if(number==p.info)
			System.out.println("Sorry !....."+number+"is a duplicate\n");
		else
		if(number<p.info)
			setleft(p,number);
		else
			setright(p,number);
		}
	System.out.println("\nInorder   : ");
	intrav(ptree);
}

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

class BSTThreaded
{
public static void main(String arg[])
{
	Functions f=new Functions();
	f.create();
}/*end main*/
}


/*
Enter number of nodes : 5

Enter info 5 nodes :
1
2
3
4
5

Inorder   :
1 2 3 4 5
*/