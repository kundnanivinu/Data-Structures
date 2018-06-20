/* Program to perform string reverse operation */

class P12A
{
	public static void main(String args[ ])
	{
		String str1 = "HOTJAVA";
		StringBuffer str2 = new StringBuffer();		
		int i,j,len = str1.length();
		
		System.out.println("Original String is : "+str1);
		str2.setLength(len);		
		for(i=len-1,j=0;i>=0;i--,j++)
			str2.setCharAt(j, str1.charAt(i));
		System.out.println("Reverse String is : "+str2);
	}
}		
