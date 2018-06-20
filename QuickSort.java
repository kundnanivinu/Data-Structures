// wajp to demonstrate recursive quick sort 

import java.io.*;

class QuickSort		 
{

public static void main(String args[]) throws IOException
{

 InputStreamReader isr=new InputStreamReader(System.in);
 BufferedReader stdin=new BufferedReader(isr);
 
 int i,n;
 
 System.out.println("Enter the number of elements: ");
 n=Integer.parseInt(stdin.readLine());
 int x[]=new int[n];

 System.out.println("Enter the elements:");
 for(i=0;i<n;i++)
    x[i]=Integer.parseInt(stdin.readLine());

 quick(x,0,n-1);

 System.out.println("Sorted list is as follows:");
 for(i=0;i<n;i++)
    System.out.print(x[i]+" ");
}

public static void quick(int x[],int lb,int ub)
{
  int j;
  if(lb>=ub)
    return;
  j=partition(x,lb,ub);
  quick(x,lb,j-1);
  quick(x,j+1,ub);
}

public static int partition(int x[],int lb,int ub)
{
  int a,down,up,temp;

  a=x[lb];
  up=ub;
  down=lb;

  while(down<up)
  {
    while(x[down]<=a&&down<ub)
	down++;
    while(x[up]>a)
	up--;
    if(down<up)
    {
	temp=x[down];
	x[down]=x[up];
	x[up]=temp;
    }
  }

  x[lb]=x[up];
  x[up]=a;
  return up;
}
}