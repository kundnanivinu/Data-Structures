/* Program that adds up the individual elements of 2 D Array*/
	
class TwoDArray1
{
	public static void main(String args[ ])
	{
	     int i , j , sum ;
	     int elements[ ][ ] = { {0,2,4,6,8,10,12},
				    {14,16,18,20,22,24,26},
				    {28,30,32,34,36,38,40} } ;
              for ( i = 0,sum = 0 ; i < 3 ; i++)
	      {
	             for (j=0 ; j<7 ; j++)
	                   sum = sum + elements[i][j] ;
	      }
	      System.out.println("The result of addition : "+ sum) ;	  
	}
}

/* 
Execution:
C:\ javac TwoDArray1.java
C:\ java TwoDArray1

Output: 
The result of addition : 420 */
