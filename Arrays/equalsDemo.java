/* Program to demonstrates the - equals( ) and equalsIgnoreCase( ) */

class equalsDemo
{
	public static void main(String args[ ])
	{
	       String s1="India";
	       String s2=" My India";
	       String s3="INDIA";
	       String s4="India";

	       System.out.println(s1+" equals "+s4+" -->"+s1.equals(s4));
	       System.out.println(s1+" equals "+s2+" -->"+s1.equals(s2));
	       System.out.println(s1+" equals "+s3+" -->"+s1.equals(s3));
	       System.out.println(s1+" equalsIgnoreCase "+s3+" -->"+s1.equalsIgnoreCase(s3));

	}
}

/*
	
Execution:
C:\ javac equalsDemo.java
C:\ java equalsDemo
Output:
India equals India -->true
India equals  My India -->false
India equals INDIA -->false
India equalsIgnoreCase INDIA -->true

*/