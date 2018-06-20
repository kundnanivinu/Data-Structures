/* Program to implement Merge Sort */
/*  Input:Unsorted Array
    Output:Sorted Array   */

import java.io.DataInputStream;   // to load DataInputStream class



class MergeSort
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
		    merge(x,n); // Call to Merge Sort
          	System.out.println("\nSorted Elements are :");
                for(i=0;i<n;i++)
                     System.out.println("\t\tElement x["+(i+1)+"]="+x[i]);

         }


	//Merge Sort Function

	static void merge(int x[],int n)
	{
 		int sub[] = new int[25];
 		int i,j,k,l1,l2,u1,u2,size;
 		size=1;                         //Merge files of size 1
 		while(size<n)
    	{
			l1=0;                       // Initialize lower bounds of first file
			k=0;                        // k is index for auxiliary array
   			while((l1+size)<n)         // Check to see if there are two files to merge
          	{
				l2=l1+size;           // Compute remaining indices
				u1=l2-1;
				u2=((l2+size-1)<n)?(l2+size-1):(n-1);
   				// Proceed through the two subfiles
				for(i=l1,j=l2;i<=u1 && j<=u2;k++)
					if(x[i]<=x[j])
							sub[k]=x[i++];
					else
						sub[k]=x[j++];

				/*At this point, one of the subfiles has been exhausted. Insert any remaining portions of the other file*/
				for(;i<=u1;k++)
						sub[k]=x[i++];
				for(;j<=u2;k++)
						sub[k]=x[j++];
   				// Advance l1 to the start of the next pair of files.
                l1=u2+1;
  			}   // end of while

  			//Copy any remaining single file
        		for(i=l1;k<n;i++)
               			sub[k++]=x[i];

  			//Copy aux into x and adjust size
        		for(i=0;i<n;i++)
             			x[i]=sub[i];
             		size*=2;
 		}  // end of while
	}   // end of merge sort function

}