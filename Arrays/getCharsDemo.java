/* Program to demonstrates the - getChars( ) */

class getCharsDemo
{
	public static void main(String args[ ])
	{
		String s = "Java is Internet Language";
		int start = 8;
		int end = 16;
		char buffer[ ]= new char[end-start];

		System.out.println("String is : "+s);

		s.getChars(start,end,buffer,0);

		System.out.print("Extracted characters from String : ");
		System.out.println(buffer);
	}
}

/*
				
Execution:
C:\ javac getCharsDemo.java
C:\ java getCharsDemo


Output:
String is : Java is Internet Language
Extracted characters from String : Internet

*/