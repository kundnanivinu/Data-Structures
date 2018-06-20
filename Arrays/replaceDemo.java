/* Program to demonstrates the - replace( ) */

class replaceDemo
{
	public static void main(String args[ ])
	{
		String s1 = "Bye Bye !!";
		String s2= s1. replace('y','e');

		System.out.println("Original String is : "+s1);
		System.out.println("String after calling relace() : "+s2);
	}
}

/*

Execution:
C:\ javac replaceDemo.java
C:\ java replaceDemo

Output:
Original String is : Bye Bye !!
String after calling relace( ) : Bee Bee !!

*/