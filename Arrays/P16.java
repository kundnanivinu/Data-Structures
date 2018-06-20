/* Program which delete an element from given string */
          
class P16
{
    public static void main(String args[ ])
    {
	String str= new String("JAHVA");
	System.out.println(" String is : "+str);
	str=delete(str,2);
         System.out.println(" After removing 3rd element from given String resultant String is : "+str);
    }

    static String delete(String str, int m)
    {
		int len = str.length();
		String s1 = str.substring(0,m);
		String s2 = str.substring(m+1);		
		str=s1+s2;
		return(str);
     }
}
