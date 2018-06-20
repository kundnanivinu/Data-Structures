/* Program to display the elements of string with their element nos.*/

import java.io.DataInputStream;     // to load DataInputStream class         

class P22
{
	public static void main(String args[ ])
	{
		String str=new String();
		char c[] = new char[15];
		int len=0;
		DataInputStream in = new DataInputStream(System.in); 

		try
		{
		     System.out.print(" Enter String : ");
		     str = in.readLine();
		}
		catch(Exception e) {  System.out.println("I/O Error");   }

		len=str.length();
		c = str.toCharArray();
		for(int i=0;i<=len-1;i++)
		      System.out.println(" Element["+i+"] : "+c[i]);
	}
}
