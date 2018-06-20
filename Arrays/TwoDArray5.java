/* Program to print two-dimensional Square Root Table */

import java.text.*;    // to include DecimalFormat class

class TwoDArray5
{
	public static void main(String args[])
	{
		double a[][]= new double[10][10];
		int i,j;
		double x,y;
		DecimalFormat df = new DecimalFormat("0.00"); // formatting
		
                  System.out.println("--------Square Root Table--------\n");
   
		for(i=0,x=0.0;i<10;i++,x=x+1.0)
		    for(j=0,y=0.0;j<10;j++,y=y+0.1)		    
			 a[i][j] = Math.sqrt(x+y);
		
		for(j=0,y=0.0;j<10;j++,y=y+0.1)
		     System.out.print("    "+df.format(y));

		for(j=0;j<10;j++)
		    System.out.print("============");

		System.out.println();
		for(i=0,x=0.0;i<10;i++,x=x+1.0)
		{	
		      System.out.print(x+" | ");
		       for(j=0;j<10;j++)
			    System.out.print("   "+df.format(a[i][j]));
		       System.out.println();
		}
	}
}

/* 

Execution:
C:\ javac TwoDArray5.java
C:\ java TwoDArray5


Output:
                             --------Square Root Table--------

         0.00    0.10    0.20    0.30    0.40    0.50   0.60    0.70    0.80    0.90
========================================================================================
0.0 |    0.00    0.32    0.45    0.55    0.63    0.71    0.77    0.84    0.89   0.95
1.0 |    1.00    1.05    1.10    1.14    1.18    1.22    1.26    1.30    1.34   1.38
2.0 |    1.41    1.45    1.48    1.52    1.55    1.58    1.61    1.64    1.67   1.70
3.0 |    1.73    1.76    1.79    1.82    1.84    1.87    1.90    1.92    1.95   1.97
4.0 |    2.00    2.02    2.05    2.07    2.10    2.12    2.14    2.17    2.19   2.21
5.0 |    2.24    2.26    2.28    2.30    2.32    2.35    2.37    2.39    2.41   2.43
6.0 |    2.45    2.47    2.49    2.51    2.53    2.55    2.57    2.59    2.61   2.63
7.0 |    2.65    2.66    2.68    2.70    2.72    2.74    2.76    2.77    2.79   2.81
8.0 |    2.83    2.85    2.86    2.88    2.90    2.92    2.93    2.95    2.97   2.98
9.0 |    3.00    3.02    3.03    3.05    3.07    3.08    3.10    3.11    3.13   3.15

*/