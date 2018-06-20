/* Program to demonstrates the - trim( ) */

class trimDemo
{
	public static void main(String args[ ])
	{
		String s1 = "         Mahatma Gandhi        ";
		String temp = s1.trim();

		System.out.println("Original String is : "+s1);
		System.out.println("String after calling trim() : "+temp);
	}
}

/* Execution:
C:\ javac trimDemo.java
C:\ java trimDemo

Output:
Original String is :          Mahatma Gandhi
String after calling trim() : Mahatma Gandhi
 */
