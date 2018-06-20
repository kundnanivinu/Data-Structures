/* Program to implement bubble sort */


import java.io.DataInputStream;   // to load DataInputStream class

class BubbleDemo1
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

		bubble(x,n);  // Call to bubble
		System.out.println("\nSorted Elements are :");
		for(i=0;i<n;i++)
			 System.out.println("\t\tElement x["+(i+1)+"]="+x[i]);

         }


//Bubble Sort Function

static void bubble(int x[],int n)
{
	int hold,j,pass;
	for(pass=0;pass<n-1;pass++)
	{
           /*outer loop controls the number of passess*/
           /*initially no interchanges have been made on this pass*/
	   for(j=0;j<n-1;j++)
	   {
	        /*inner loop governs each individual pass*/
	        if(x[j]>x[j+1])
	        {
	            /*intetchange elements if they are out of order*/
	            hold=x[j];
                    x[j]=x[j+1];
                    x[j+1]=hold;
           	}/*end if*/
	    }
        }/*end for*/
}/*end bubble function*/

}









