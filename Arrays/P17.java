/* Program to accept a 3 digit number and print it out digit by digit as a series of words */

 import java.io.DataInputStream;     // to load DataInputStream class         

class P17
{
    public static void main(String args[ ])
    {
	String s[]={
				"Zero", "One","Two", "Three", "Four",
		            	"Five", "Six", "Seven", "Eight", "Nine" 
			  }; 
	int n=0;
	DataInputStream in = new DataInputStream(System.in); 

	try
	{
		System.out.print("Enter 3 digit Number : ");
		n = Integer.parseInt(in.readLine());
	}
	catch(Exception e) {  System.out.println("I/O Error");   }

	System.out.println("Number is : "+n);
	System.out.print(" "+s[n/100]);
	n = n % 100;
	System.out.print(" "+s[n/10]);
	n = n % 10;
	System.out.print(" "+s[n/1]);
    }
}
