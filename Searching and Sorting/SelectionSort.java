/* Program to implement Selection Sort */
/*  Input:Unsorted Array
    Output:Sorted Array   */

import java.io.DataInputStream;   // to load DataInputStream class

class SelectionSort
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
		    selection(x,n); // Call to Selection Sort
          	System.out.println("\nSorted Elements are :");
                for(i=0;i<n;i++)
                     System.out.println("\t\tElement x["+(i+1)+"]="+x[i]);

         }


	//Selection Sort Function

	static void selection(int x[],int n)
	{
		int i,indx,j,large;
		for(i=n-1;i>0;i--)
  		{
		/*place the largest number ofx[0] through
		x[i] into large and its index into indx*/
			large=x[0];
			indx=0;

			for(j=1;j<=i;j++)
			   if(x[j]>large)
			   {
					large=x[j];
					indx=j;
			   }/*end for...if*/
			x[indx]=x[i];
			x[i]=large;

			for(int v=0;v<n;v++)
				System.out.print("\t"+x[v]);
			System.out.println();
		}/*end for*/
	}/*end select sort*/

}