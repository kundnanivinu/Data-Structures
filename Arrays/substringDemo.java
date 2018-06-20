/* Program to demonstrates the - substring() */

class substringDemo
{
	public static void main(String args[ ])
	{
		String s="India,Nepal,Bhotan,ShriLanka,China";
		String temp;

		System.out.println("Original String is : "+s);

		temp = s.substring(12);
		System.out.println("Substring from index 12 to end of string is: "+temp);

		temp = s.substring(0,5);
		System.out.println("Substring from index 0 to 4 is : "+temp);
	}
}	

/*
			
Execution:
C:\ javac substringDemo.java
C:\ java substringDemo

Output:
Original String is : India,Nepal,Bhotan,ShriLanka,China
Substring from index 12 to end of string is : Bhotan,ShriLanka,China
Substring from index 0 to 4 is : India

*/