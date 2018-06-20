/* Program to check whether given matrix is diagonal matrix or not */  

import java.io.DataInputStream;   // to load DataInputStream class           

class P6
{
	public static void main(String args[ ])
	{
		int matrix[][]= new int[3][3];
		int i,j;
		boolean flag=true;
		DataInputStream in = new DataInputStream(System.in); 

		try
		{
		      System.out.println(" Input 3 × 3 matrix  row wise : ");
		       for (i=0;i<3;i++)
			  for(j=0;j<3;j++)
      			       matrix[i][j]= Integer.parseInt(in.readLine());
		}
		catch(Exception e) {  System.out.println("I/O Error");   }

		System.out.println(" Matrix is : ");
		for(i=0;i<3;i++)
		{
		     for(j=0;j<3;j++)
			System.out.print(" "+matrix[i][j]+" ");
		     System.out.println();
		}

		for(i=0;(i<3)&&(flag==true);i++)
		{
      			for(j=0;j<3;j++)     			
           			        if(i!=j && matrix[i][j]!=0)          			              				
              				flag=false;     			
		}
		if(flag==true)
			System.out.println("Matrix is diagonal matrix");
		else
			System.out.println(" Matrix is not diagonal matrix");
	}
}		
