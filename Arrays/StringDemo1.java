/* Construct one string from another */

class StringDemo1
{
	public static void main(String args[ ])
	{
		char name[ ]={'I','N','D','I', 'A'};
		String str1= new String(name);
		String str2= new String(str1);

		System.out.println("String1 : "+str1);
		System.out.println("String2 : "+str2);
	}
}

/*

Execution:
C:\ javac StringDemo1.java
C:\ java StringDemo1
Output:
String1 : INDIA
String2 : INDIA

*/