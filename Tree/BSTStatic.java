/*program for array representation of binary trees*/
import java.io.*;
import java.util.*;

class Nodetype
{
      int info,used;
      Nodetype(int i,int u)
	  	{
	  		info=i;
	  		used=u;
	}
}

class Functions
{
	Nodetype node[]=new Nodetype[20];
	int TRUE=1,FALSE=0;
	void maketree(int x)
	{
		int p;
		node[0]=new Nodetype(x,1);
		/*the tree consists of node 0 alone*/
	   /*all other nodes are null nodes*/
	   	for(p=1;p<20;p++)
			node[p]=new Nodetype(0,0);
   }/*end maketree*/

	void setleft(int p,int x)
	{
		int q;
		q=2*p+1;
		/*q is the position of the left son*/
		if(q>=20)
			System.out.println("array overflow");
		else
				if(node[q].used==TRUE)
					System.out.println("\nInvalid insertion");
				else
				{
					node[q].info=x;
					node[q].used=TRUE;
				}/*end if*/
	}/*end setleft*/

	void setright(int p,int x)
    {
           int q;
           q=2*p+2;
           /*q is the position of the left son*/
           if(q>=20)
				System.out.println("array overflow");
           else
				if(node[q].used==TRUE)
					System.out.println("\nInvalid insertion");
				else
			   {
					node[q].info=x;
					node[q].used=TRUE;
			   }/*end if*/
      }/*end setright*/


	void create() //throws IOException
	{
		String str;
		int i=1,p,q,ne,number;


		System.out.println("\nEnter number of elements : ");
		ne=getNumber();

		System.out.println("\nEnter numbers : ");
		number=getNumber();
		maketree(number);

		while(i<ne)
		{
			number=getNumber();
			i++;
			p=q=0;
			while(q < 20 && node[q].used==TRUE && number!=node[p].info)
			{
				p=q;
				if(number<node[p].info)
					q=2*p+1;
				else
					q=2*p+2;
			}
			/*if the number is in the tree it is a duplicate*/
			if(number==node[p].info)
				System.out.println("Sorry!!..."+number+" is a Duplicate value\n");
			else
				if (number<node[p].info)
					setleft(p,number);
				else
					setright(p,number);
		}
	}/*end create*/

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
	}/*end getNumber*/

}

class BST
{
	public static void main(String args[])//hrows IOException, NullPointerException
	{

		Functions f=new Functions();
		f.create();
	}
}


/*
Enter number of nodes : 10

Enter info 10 nodes :
50
1
70
33
50
Sorry !.....50is a duplicate

1
Sorry !.....1is a duplicate

57
80
33
Sorry !.....33is a duplicate

22
*//