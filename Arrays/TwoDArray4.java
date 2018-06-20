/*  Program for Matrix Multiplication */

class TwoDArray4
{
	public static void main(String args[ ])
	{
		int i,j,k;
		int multi[][]= new int[3][4];
	   	int set1[ ][ ] = { {3,5 }, {4,2}, {4,1} } ;
	   	int set2[ ][ ] = { {1,2,4,3}, {1,5,3,2}} ;
	   	System.out.print("The first 3X2 matrix is :\n");
	   	for (i=0 ; i<3 ; i++)
	   	{
	         	for (j=0 ; j<2 ; j++)
		     		System.out.print(set1[i][j]+"\t");
	         	System.out.println(" ");
	   	}
	   	System.out.println(" ");

	   	System.out.println("The second 2X4 matrix is : ");
	   	for (i=0 ; i<2 ; i++)
	   	{
	         	for (j=0 ; j<4 ; j++)
		       		System.out.print(set2[i][j]+"\t");
	         	System.out.println(" ");
	    	}
	    	System.out.println(" ");

		for (i=0 ; i<3 ; i++)
                  {
	               for (j=0 ; j<2 ; j++)
	               {
	                  for (k=0 ; k<4 ; k++)
		               multi[i][k] += set1[i][j]*set2[j][k] ;
	               }
	          }

		System.out.println("The resultant addition 3X4 matrix is :") ;
	    	for (i=0 ; i<3 ; i++)
	    	{
	          	for (j=0 ; j<4 ; j++)
		        	System.out.print(multi[i][j]+"\t");
	         	System.out.println(" ");
	    	}	    
	}
}

/*  
Execution:
C:\ javac TwoDArray4.java
C:\ java TwoDArray4


Output:
The first 3X2 matrix is :
3       5
4       2
4       1

The second 2X4 matrix is :
1       2       4       3
1       5       3       2

The resultant addition 3X4 matrix is :
8       31      27      19
6       18      22      16
5       13      19      14

*/
