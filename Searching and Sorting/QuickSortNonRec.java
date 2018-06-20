/* Program to implement quick Sort (Non-recursive) */
/*  Input:Unsorted Array
    Output:Sorted Array   */

import java.io.DataInputStream;   // To load DataInputStream class
import java.util.*;               // To load Stack class


class QuickSortNonRec
{
	public static void main(String args[ ])
	{
		int i,n = 0;
 		int x[] = new int[25];
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
		    quicksort(x,0,n-1);  // Call to recursive quick sort
          	System.out.println("\nSorted Elements are :");
			System.out.println("\t--------------------------------------------");
			display(x,n);
			System.out.println("\t--------------------------------------------");
         }


	//Non-recursive quick Sort Function

	static void quicksort(int[] a, int lb, int ub)
	{
		Stack S = new Stack();
		S.push(lb);
		S.push(ub);
    	while (!S.empty())
		{
			ub = (Integer)S.pop();
			lb = (Integer)S.pop();
			if (ub <= lb) continue;
			int i = partition(a, lb, ub);
			if (i-lb > ub-i)
			{
				S.push(lb);
				S.push(i-1);
			}
			S.push(i+1);
			S.push(ub);
			if (ub-i >= i-lb)
			{
				S.push(lb);
				S.push(i-1);
			}
		}
	}

	 static int partition(int x[], int lb, int ub )
	{
		int a, down, temp, up,pj;
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






