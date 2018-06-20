/*Binary search tree preorder traversal */
import java.io.*;
import java.util.*;


class Nodetype
{
	 int info;
	 Nodetype left;
	 Nodetype right;
	 Nodetype father;
	 Nodetype(int i)
	 {
		info=i;
		left=null;
		right=null;
		father=null;
	 }
}

class Stack
{
	Nodetype stk[]=new Nodetype[100];
	int top;
	Stack()
	{
		top=-1;
	}
	void push (Nodetype item)
	{
		if (top==9)
			System.out.println("Stack overflow");
		else
			stk[++top]=item;
	}/*end push*/

	boolean isempty()
	{
		if (top<0)
			return true;
		else
			return false;
	}/*end isempty*/

	Nodetype pop()
	{
		if (isempty())
		{
			System.out.println("Stack underflow");
			return null;
		}
		else
			return (stk[top--]);
	}/*end pop*/
}



class Functions
{

Stack s=new Stack();

Nodetype maketree(int x)
{
	Nodetype node=new Nodetype(x);
	return(node);
}/*end maketree*/

void setleft(Nodetype p,int x)
{
	if(p==null)
		System.out.println("\nInvalid insertion");
	else
		if(p.left!=null)
			System.out.println("\nInvalid insertion");
		else p.left=maketree(x);
}/*end setleft*/

void setright(Nodetype p,int x)
{
	if(p==null)
		System.out.println("\nInvalid insertion");
	else
		if(p.right!=null)
			System.out.println("\nInvalid insertion");
		else
			p.right=maketree(x);
}/*end setright*/

void pretrav(Nodetype tree)
{
	// let tree be the pointer to the beginning of tree
	Nodetype p;
	s.top=-1;
	s.push(tree);
	while (!s.isempty())
	{
		p=s.pop();
		System.out.print(p.info+" ");
		if(p.right!=null)
			s.push(p.right);
		if (p.left!=null)
			s.push(p.left);
	}
}

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

	System.out.println("\nPreorder  : ");
	pretrav(ptree);

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

class BSTTravPre
{
public static void main(String arg[])
{
	Functions f=new Functions();
	f.create();

}/*end main*/
}


/*


Enter number of nodes : 6

Enter info 6 nodes :
50
60
62
1
10
9

Preorder  :
50 1 10 9 60 62
*/