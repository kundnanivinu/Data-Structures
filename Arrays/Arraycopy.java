/*  Program to demonstrates System.arraycopy( ) function */

class Arraycopy
{
	public static void main(String args[ ])
	{
		int Array1[ ] = {10,20,30,40,50,60,70,80,90,100};
		int Array2[ ] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("The first array is:");
		for (int i = 0; i < 10; i++)
			System.out.print(Array1[i]+"\t");
		
		System.out.println("The second array is:");
		for (int i = 0; i < 10; i++)
			System.out.print(Array2[i]+"\t");

		// Copying last 5 elements of Array1 to Array2
		System.arraycopy(Array1,5,Array2,5,5);
		
		System.out.println("The second array after calling arraycopy( ):");
		for (int i = 0; i < 10; i++)
			System.out.print(Array2[i]+"\t");

	}
}

/*
 		
Execution:
C:\ javac Arraycopy.java
C:\ java Arraycopy

Output:
The first array is:
10      20      30      40      50      60      70      80      90      100
The second array is:
1       2       3       4       5       6       7       8       9       10
The second array after calling arraycopy( ) :
1       2       3       4       5       60      70      80      90      100

 */