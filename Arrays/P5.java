/* Program to Compute mean, variance and standard deviation */  

import java.io.DataInputStream;   // to load DataInputStream class           

class P5
{
	public static void main(String args[ ])
	{
		float mean=0,variance=0;
		int i;
		int x[]= new int[5];
		DataInputStream in = new DataInputStream(System.in); 

		try
		{
			for(i=0;i<5;i++)
			{
         		                 System.out.print(" Enter array element["+(i+1)+"] : ");
         		                 x[i]= Integer.parseInt(in.readLine()); 
         		                 mean = mean+x[i];
			}
		}
		catch(Exception e) {  System.out.println("I/O Error");   }

		mean = mean/5;
		System.out.println("  Mean : "+mean);
		for(i=0;i<5;i++)
       			variance = variance + (x[i]-mean)*(x[i]-mean);
		variance = variance/5;
		System.out.println("  Variance : "+variance) ;
		System.out.println("  Standard Deviation : "+Math.sqrt(variance));
	}
}
