/* Program to implement Insertion Sort */
/*  Input:Unsorted Array
    Output:Sorted Array   */

import java.io.DataInputStream;   // to load DataInputStream class

class InsertionSort
{
	public static void main(String args[ ])
	{
		int i,n=0;
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
			System.out.println("I/O Error");
		}

        insertion(x,n);  // Call to insertion function
		System.out.println("\nSorted Elements are :");
			for(i=0;i<n;i++)
				 System.out.println("\t\tElement x["+(i+1)+"]="+x[i]);

         }


	//Insertion Sort Function

	static void insertion(int x[],int n)
	{
   		int i,k,y;
   		/*initially x[0] may be thought of as a sorted file of
   		one element.After each repetetion of the following
   		loop, the elements x[0] through x[k] are in order*/
		for(k=1;k<n;k++)
		{
				/*Insert x[k] into the sorted file*/
				y=x[k];
				/*Move down 1 position all elements greater than y*/
			for(i=k-1;i>=0&&y<x[i];i--)
					x[i+1]=x[i];
				/*Insert y at proper position*/
				x[i+1]=y;
		}/*end for*/
	}/*end insertion function*/
}









