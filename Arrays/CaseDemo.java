/* Program to demonstrates the - toUpperCase( ) and toLowerCase( ) */

class CaseDemo
{
	public static void main(String args[ ])
	{
		String str1 = "MAHATMA";
		String str2 = "gandhi";
		String temp;

		System.out.println("Original String1 is : "+str1);
		temp=str1.toLowerCase();
		System.out.println("After calling toLowerCase(), String1 is : "+temp);

		System.out.println("\nOriginal String2 is : "+str2);
		temp=str2.toUpperCase();
 		System.out.println("After calling toUpperCase(), String2 is : "+temp);
	}
}

/* 

Execution:
C:\ javac CaseDemo.java
C:\ java CaseDemo 

Output:
Original String1 is : MAHATMA
After calling toLowerCase(), String1 is : mahatma

Original String2 is : gandhi
After calling toUpperCase(), String2 is : GANDHI

*/