/* Program to implement Linear Search */


import java.io.DataInputStream;   // to load DataInputStream class

class LinearSearch
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
		    	flag = Linear_Search(x,n,KEY);
		    	if (flag == -1)
					System.out.println(" Number Not present in the given array");
		    	else
					System.out.println(" Number "+KEY+" found at "+flag+" location in the array");
				System.out.print(" Want to search another number ?");
				ans=in.readLine();
		     }while((ans.equals("y"))||(ans.equals("Y")));

		}
		catch(Exception e)
		{
			System.out.println("I/O Error");
		}
	}


	//Linear Search Function

	/* Function to search ‘KEY’ from the array K of n numbers */
	static int Linear_Search(int K[], int n, int KEY)
	{
		int i;
		for(i=1;i<=n;i++)
			if(KEY == K[i])
				return(i);     /* Number found and return the location */
		return(-1);                    /* Number not found */
   	}
}












