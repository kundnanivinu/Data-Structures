/* Program to check whether given number is a palindrome or not */

import java.io.DataInputStream;     // to load DataInputStream class 
          
class P14
{
	public static void main(String args[ ])
	{
		String no = new String( );
		int i,j,len;
		boolean flag=true;
		DataInputStream in = new DataInputStream(System.in); 

		try
		{
		        System.out.print("Enter Integer Number : ");
		        no = in.readLine();
		}
		catch(Exception e) {  System.out.println("I/O Error");   }
		
		len = no.length( );
		for(i=0,j=len-1;i<=len/2;i++,j--)
		{
		         if(no.charAt(i)==no.charAt(j))
			        flag=true;
		          else
	                {
			        flag=false;
			        break;
		           }
		 }				
		if(flag==true)
			 System.out.println("Number is palindrome");
		else
			 System.out.println("Number is not palindrome");
        }
}
