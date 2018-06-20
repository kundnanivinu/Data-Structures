/* Program to count the frequency of a given letter in a string. */

import java.io.DataInputStream;     // to load DataInputStream class         

class P19
{
	public static void main(String args[ ])
	{
		String str = new String();
		char ch='a';
		int len,count=0;
		DataInputStream in = new DataInputStream(System.in); 

		try
		{
			System.out.print("Enter String : ");
			str = in.readLine();
			System.out.print("Enter a character to be searched in string : ");
			ch = (char)in.read();
			System.out.println(" String is : "+str);
			
		}
		catch(Exception e) {  System.out.println("I/O Error");   }

		len = str.length();
		for(int i =0;i<=len-1;i++)
			if(ch==str.charAt(i))
				count++;

	      System.out.println(" Frequency of character '"+ch+"' in string is "+count);
	}
}
