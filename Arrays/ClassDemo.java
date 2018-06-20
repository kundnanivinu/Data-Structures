class Rectangle
{
	int length;
	int width;

	// display Area of a Rectangle
	void area()
	{
		System.out.println(" Area is "+(length*width));
	}
}

class ClassDemo
{
	public static void main(String args[])
	{
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();
			
		//assign values to rect1's instance variables
		rect1.length= 20;
		rect1.width=15;

		//assign different values to rect2's instance variables
		rect2.length= 25;
		rect2.width=17;

		System.out.print(" First Rectangle (length : "+rect1.length+" , width : "+rect1.width+") ->"); 
		rect1.area();          // display area of first rectangle

		
		System.out.print(" Second Rectangle (length : "+rect2.length+" , width : "+rect2.width+") ->"); 
		rect2.area();          // display area of second rectangle
	}
}

