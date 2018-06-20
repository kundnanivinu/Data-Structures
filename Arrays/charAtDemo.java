/* Program to demonstrates the - charAt( ) */

class charAtDemo
{
	public static void main(String args[ ])
	{
		String s = "INDIA";
		char ch;

		System.out.println("String is : "+s);
		ch= s. charAt(2);
		System.out.println("Character at Index 2 (i.e. 3rd position) is : "+ch);
	}
}

/* 

Execution:
C:\ javac charAtDemo.java
C:\ java charAtDemo

Output:
String is : INDIA
Character at Index 2 (i.e. 3rd position) is : D

*/