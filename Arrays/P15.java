/* Program which concatenates a string */
          
class P15
{
	public static void main(String args[ ])
	{
		StringBuffer str1 = new StringBuffer("Good ");
		String str2 = new String("Day");

		System.out.println(" String1 is : "+str1);
		System.out.println(" String2 is : "+str2);
		
		str1 = str1.append(str2);
		System.out.println(" String after concatenation : "+str1);
	}
}
