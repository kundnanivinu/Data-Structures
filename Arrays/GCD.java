/* Program to find GCD using Recursion */

import java.io.DataInputStream;   // to load DataInputStream class 
          
class GCD
{
	public static void main(String args[ ])
	{
		int n1=0,n2=0;
		DataInputStream in = new DataInputStream(System.in); 

                try
		{
		    System.out.println("Enter two numbers to find GCD.... ");
		    System.out.print("Enter First number :");
               	    n1 = Integer.parseInt(in.readLine());
 		    System.out.print("Enter Second number :");
		    n2 = Integer.parseInt(in.readLine());
            	}
		catch(Exception e) {  System.out.println("I/O Error");   }
		
		System.out.println(" The GCD of "+n1+" and "+n2+" is :"+euclid(n1,n2));
	}/*end main*/

	static int euclid(int a,int b)
	{
		if(b==0)
			return a;
		else
			return euclid(b,a%b);
	}/*end euclid*/

} /* end of GCD class

/*Sample input and output

Enter two numbers to find GCD....
Enter First number :51
Enter Second number :17
The GCD of 51 and 17 is :17

*/

