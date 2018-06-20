/* Program to implement Shell Sort */
/*  Input:Unsorted Array
    Output:Sorted Array   */

import java.io.DataInputStream;   // to load DataInputStream class

class ShellSort
{
	public static void main(String args[ ])
	{
		int i,n=0;
		int increments[]={5,3,1};
 		int x[]=new int[25];
		DataInputStream in = new DataInputStream(System.in);
        try
		{
		    System.out.print("Enter how many numbers to be sorted : ");
			n = Integer.parseInt(in.readLine());
			System.out.println("Enter "+n+" numbers in any order....");
			for(i=0;i<n;i++)
			{
				System.out.print("\t\tElement x["+(i+1)+"]=");
				x[i] = Integer.parseInt(in.readLine());
			}
		}
		catch(Exception e)
		{
			System.out.println("I/O Error");   }
		    shell(x,n,increments,3); // Call to shell function
          	System.out.println("\nSorted Elements are :");
                for(i=0;i<n;i++)
                     System.out.println("\t\tElement x["+(i+1)+"]="+x[i]);

         }


	//Shell Sort Function

	static void shell(int x[],int n,int increments[],int numinc)
	{
 		int i,span,y,j,k;
 		for(i=0; i<numinc; i++)
      		{
          		span=increments[i];
           		for(j= span; j<n; j++)
             		{
   	         		y=x[j];
   	         		for(k=j-span; k>=0 && y<x[k]; k-=span)
	               			x[k+span]=x[k];
   	            		x[k+span]=y;
             		} /* end for*/
  		}/* end for*/
	}/* end shellsort*/
}









