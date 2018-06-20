/* Program to count the frequency of a given word in a string. */

import java.io.DataInputStream;     // to load DataInputStream class         

class P20
{
	public static void main(String args[ ])
	{
		String str = new String();
		String search = new String();
		int i,len1,len2,index=-1,count=0;
		DataInputStream in = new DataInputStream(System.in); 

		try
		{
			System.out.print("Enter String : ");
			str = in.readLine();
			System.out.print("Enter a word to be searched in string : ");
			search = in.readLine();
		}
		catch(Exception e) {  System.out.println("I/O Error");   }

		len1 = str.length();
		len2 = search.length();
		for(i=0;i<=len1-1;i=index+len2)
		{
			index=str.indexOf(search,i);
			if(index!=-1)
				count++; 
			else 
				break;
		}		
	      System.out.println(" Total No. of Occurrences of word '"+search+"' in given string is :"+count);
	}
}
