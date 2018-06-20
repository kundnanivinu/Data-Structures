/* Program to demonstrates Array of Objects */

class Book
{
	String bookTitle;
	double price;

	public void setName(String bookName)
	{
		bookTitle = bookName;
	}

	public void setPrice(double cost)
	{
		price=cost;
	}

	public String getName()
	{
		return bookTitle;
	}

	public double getPrice()
	{
		return price;
	}
}

class BookDemo
{	
	Book books[];

	BookDemo()
	{
		books=new Book[2];
	}

	void createBooks()
	{
		//create the first book object and set its Attributes 
		books[0]=new Book();
		books[0].setName("Gone with the wind");
		books[0].setPrice(500.25);
			
		//create the second book object and set its Attributes 
		books[1]=new Book();
		books[1].setName("Java Programming");
		books[1].setPrice(475);
	}

	void showBooks()
	{
		/* Display the array of book objects. The variable length 
                   stores the number of items in an array */
		System.out.println("Book Title \t\t\t Price");
		System.out.println("============= \t\t\t ======");
		for(int count =0;count<books.length;count++)
		{
			System.out.println(books[count].getName()+
			              "\t\t"+books[count].getPrice());
		}
	}

	public static void main(String args[])
	{
            /* create an object of BookDemo class and invoke 
               createBooks and showBooks methods using the object */
		BookDemo object=new BookDemo();
		object.createBooks();
		object.showBooks();
	}
}

/*

Execution:
C:\ javac BookDemo.java
C:\ java BookDemo

Output:
Book Title                  Price
==============              ======
Gone with the wind          500.25
Java Programming            475.0

*/
