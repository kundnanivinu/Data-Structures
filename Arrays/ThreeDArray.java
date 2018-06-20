/*  Program for Matrix Multiplication */

class ThreeDArray
{
	public static void main(String args[ ])
	{
		int a[][][]={ { {5,0,2}, {0,0,9}, {4,1,0}, {7,7,7}},
                                 { {3,0,0}, {8,5,0}, {0,0,0}, {2,0,9}}
                               };
		int count = 0;

		for (int i = 0; i < 2; i++)
      			for (int j= 0; j < 4; j++)
             			for (int k = 0; k < 3; k++)
                                     if (a[i][j][k]==0)    
    					 ++count;

		System.out.println("This Array has "+count+" zeros.");
	}
}

/*
Execution:
C:\ javac ThreeDArray.java
C:\ java ThreeDArray

Output:
This Array has 11 zeros.
*/
