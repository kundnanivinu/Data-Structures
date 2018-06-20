/* Program to implement Binary Search */


import java.io.DataInputStream;   // to load DataInputStream class

class BinarySearch
{
	public static void main(String args[ ])
	{
		int i,n = 0,KEY, flag=0;
		String ans="y";
 		int x[] = new int[25];
		DataInputStream in = new DataInputStream(System.in);

        try
		{
		    System.out.print("Enter how many numbers to be stored : ");
            n = Integer.parseInt(in.readLine());
		    System.out.println("Enter the number in INCREASING ORDER PLEASE.");
            System.out.println("Enter "+n+" numbers ....");
            for(i=1;i<=n;i++)
            {
                 System.out.print("\t\tElement ["+i+"]=");
            	 x[i] = Integer.parseInt(in.readLine());
            }
		    do
  		    {
		    	System.out.print("Enter the number to be searched  : ");
               	KEY = Integer.parseInt(in.readLine());

		    	flag = Binary_Search(x,n,KEY);  // call to binary search function
		    	if (flag == -1)
		   		System.out.println(" Number Not present in the given array");
		    	else
				System.out.println(" Number "+KEY+" found at "+flag+" location in the array");


			System.out.print(" Want to search another number ?");
			ans=in.readLine();
		     }while((ans.equals("y"))||(ans.equals("Y")));

		}
		catch(Exception e) {  System.out.println("I/O Error");   }
	}


	//Binary Search Function

	static int Binary_Search(int K[ ],int n,int KEY)
	{
  		 int low=1;
  		 int high=n;
  		 int mid;
   		 mid=(low+high)/2;  	/* find the mid position */
  		 while (high>=low)
		 {
			if (K[mid]==KEY)
			   return(mid);
    			else
     			{
		            if(KEY>K[mid])
				low=mid+1;  			 /* number may be in upper half */
			    else
	  		        high=mid-1;  /* Number may be present in lower half */
			    mid=(low+high)/2;
    			}
   		 }
                 return(-1);
	}

}












