/* Program to demonsrate System.arraycopy() function*/

class Arraycopy1
{
	public static void main(String[] args)
	{
        	           char[ ] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
		         	                           'i', 'n', 'a', 't', 'e', 'd' };
	            char[ ] copyTo = new char[7];
	            System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        	           System.out.println(new String(copyTo));
    	}
}
/*

Execution:
C:\ javac Arraycopy1.java
C:\ java Arraycopy1

Output:
caffein

*/
