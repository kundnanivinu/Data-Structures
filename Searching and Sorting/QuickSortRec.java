/* Program to implement quick Sort (Recursive) */
/*  Input:Unsorted Array
    Output:Sorted Array   */

import java.io.DataInputStream;   // to load DataInputStream class

class QuickSortRec
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
			System.out.println("I/O Error");   }
		    quicksort(x,0,n-1,n);  // Call to recursive quick sort
          	System.out.println("\nSorted Elements are :");
			System.out.println("-----------------------------------");
			display(x,n);
			System.out.println("-----------------------------------");
         }


	//Recursive quick Sort Function

	static void quicksort(int x[], int lb, int ub, int n)
	{
		int j=0;
		if(lb>=ub)
	  		return;
		j=partition(x, lb, ub, j);
		System.out.println("After partitioning array from index "+(lb+1)+" to "+(ub+1)+ " :\n ");
		display(x,n);
		quicksort(x, lb, j-1, n);
		quicksort(x, j+1, ub, n);
	} // end of recursive quick sort function

	 static int partition(int x[], int lb, int ub, int pj)
	{
		int a, down, temp, up;
		a=x[lb];               // a is pivot element
     		up=ub;
	        down=lb;
		while(down<up)
	 	{
			while(x[down]<=a && down<up)
				down=down+1;        //move up the array
		     	while(x[up]>a)
				up=up-1;          //move down the array
		     	if(down<up)
		       	{
				temp=x[down];    //interchange x[down]with x[up]
				x[down]=x[up];
				x[up]=temp;
		        }/*end if*/
	    	}/* end while*/
   	        x[lb]=x[up];
	        x[up]=a;
                pj=up;
		return (pj);
	}/* end partition*/

	static void display(int x[], int n)
	{
		int i;
		System.out.println(" ");
		for(i=0;i<n;i++)
			System.out.print("\t"+x[i]+ " ");
		System.out.println(" ");
	} // end of display function

}






