/* Construct string from subset of char array */

class StringDemo2
{
	public static void main(String args[ ])
	{
		byte ASCII[]={65,66,67,68,69,70};
	
		String str1=new String(ASCII);
		System.out.println("String1 : "+str1);
	
		String str2=new String(ASCII,1,3);
		System.out.println("String2 : "+str2);
	}
}

/* 

Execution:
C:\ javac StringDemo2.java
C:\ java StringDemo2

Output:
String1 : ABCDEF
String2 : BCD

*/
