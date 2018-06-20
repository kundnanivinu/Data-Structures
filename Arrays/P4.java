/* Program to Compute the sum and average of an array */  

import java.io.DataInputStream;   // to load DataInputStream class           

class P4
{
	public static void main(String args[ ])
	{
		int x[]=new int[100];
		int i=1,avg=0,max=0,min=0,sum=0,n=0;
		DataInputStream in = new DataInputStream(System.in); 

		try
		{
			System.out.print(" Enter total number of elements in array X : ");
			n = Integer.parseInt(in.readLine());
			System.out.println(" Enter the values in the array X : ");
			for(i=0; i<n; i++)
	       			x[i] = Integer.parseInt(in.readLine());
		}
		catch(Exception e) {  System.out.println("I/O Error");   }

		for(i=0;i<n;i++)
	        	sum=sum+x[i];
		System.out.println(" Sum of array elements is : "+sum);
		avg=sum/n;
		System.out.println(" Average of array elements is : "+avg);
		for(i=0; i<n; i++)
		{
			if (x[i]>avg) max++;
			else min++;
		}
		System.out.print(" Total "+max+" numbers are present in array X ");
		System.out.println("which are greater than average");
		System.out.print(" Total "+min+" numbers are present in array X ");
		System.out.print("which are less than average");      
	}
}
