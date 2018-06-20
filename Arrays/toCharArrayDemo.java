/* Program to demonstrates the - toCharArray( ) */

class toCharArrayDemo
{
	public static void main(String args[ ])
	{
	    String s =" Java is Object Oriented Language";
	    char ch[]= new char[s.length()];

	    ch=s.toCharArray();
	    System.out.println("All characters in a String object is converted to character Array..");
	    System.out.println(ch);
	}
}


/*

Execution:
C:\ javac toCharArrayDemo.java
C:\ java toCharArrayDemo
Output:
  All characters in a String object is converted to character Array...
 Java is Object Oriented Language

*/