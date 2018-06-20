/*  Program for Matrix Addition */

class TwoDArray3
{
	public static void main(String args[ ])
	{
		int i , j;
		int add[][]= new int[3][3];
	   	int set1[ ][ ] = { {1,3,5},{7,9,11},{13,15,17} } ;
	   	int set2[ ][ ] = { {2,4,6},{8,10,12},{14,16,18} } ;
	   	System.out.print("The first 3X3 matrix is :\n");
	   	for (i=0 ; i<3 ; i++)
	   	{
	         	for (j=0 ; j<3 ; j++)
		     		System.out.print(set1[i][j]+"\t");
	         	System.out.println(" ");
	   	}
	   	System.out.println(" ");
	   	System.out.println("The second 3X3 matrix is : ");
	   	for (i=0 ; i<3 ; i++)
	   	{
	         	for (j=0 ; j<3 ; j++)
		       		System.out.print(set2[i][j]+"\t");
	         	System.out.println(" ");
	    	}
	    	System.out.println(" ");
	    	for (i=0 ; i<3 ; i++)
	    	{
	          	for (j=0 ; j<3 ; j++)
		      		add[i][j] = set1[i][j] + set2[i][j] ;
	    	}
	    	System.out.println("The resultant addition 3X3 matrix is :") ;
	    	for (i=0 ; i<3 ; i++)
	    	{
	          	for (j=0 ; j<3 ; j++)
		        	System.out.print(add[i][j]+"\t");
	         	System.out.println(" ");
	    	}	    
	}
}

/* 
Execution:
C:\ javac TwoDArray3.java
C:\ java TwoDArray3

Output:
The first 3X3 matrix is :
1       3       5
7       9       11
13      15      17

The second 3X3 matrix is :
2       4       6
8       10      12
14      16      18

The resultant addition 3X3 matrix is :
3       7       11
15      19      23
27      31      35

*/
