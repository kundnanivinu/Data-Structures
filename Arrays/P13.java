/*Program to check whether given string is a palindrome or not */

class P13
{
	public static void main(String args[ ])
	{
		String str = new String("MALAYALAM");
		int i,j,len = str.length();
		boolean flag=true;

		System.out.println("String :"+str);
		for(i=0,j=len-1;i<=len/2;i++,j--)
		{
		         if(str.charAt(i)==str.charAt(j))
			        flag=true;
		          else
	                   {
			        flag=false;
			        break;
		          }
		 }				
		if(flag==true)
			 System.out.println("String is palindrome");
		else
			 System.out.println("String is not palindrome");
        }
}
