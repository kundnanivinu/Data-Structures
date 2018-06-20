/* Program to implement factorial of number using recursion */

import java.io.DataInputStream;   // to load DataInputStream class 
          
class Factorial
{
	// this is recursion function
	int fact(int n)
	{
		int result;
		
		if(n==1) return 1;
		result=fact(n-1)*n;
		return result;	
	}
}

class Recursion
{
	public static void main(String args[ ])
	{
		int n=0;
		DataInputStream in = new DataInputStream(System.in);
		Factorial f = new Factorial(); 

                try
		{
		    System.out.print("Enter number to find factorial : ");
               	    n = Integer.parseInt(in.readLine());
                    
		}
		catch(Exception e) {  System.out.println("I/O Error");   }
		
		System.out.println("Factorial of "+n+" is : "+f.fact(n));
	}
}


/* 

Execution:
C:\javac Recursion.java
C:\java Recursion

Output:
Enter number to find factorial : 5
Factorial of 5 is : 120

*/