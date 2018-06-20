/* Program to demonstrate - toString( ) */

class Rectangle
{
	int length;
	int width;

	Rectangle(int l,int w)
	{		
		length = l;
		width = w;
	}

	public String toString()
	{
		return "Dimensions are "+length+" by "+width+".";
	}	
}

class toStringDemo
{
	public static void main(String args[ ])
	{
		Rectangle rect = new Rectangle(20,15);
		String s = "Rectangle rect : " +rect;  // concatenate Rectangle object

		System.out.println(rect);   // convert Rectangle to String
		System.out.println(s);
	}
}

/*
Execution:
C:\ javac toStringDemo.java
C:\ java toStringDemo

Output:
Dimensions are 20 by 15.
Rectangle rect : Dimensions are 20 by 15.

*/