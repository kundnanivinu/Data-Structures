/* Program to perform string reverse operation */

class P12B
{
	public static void main(String args[])
	{
		String s1 = "Gandhi";
		System.out.println(" Original String is : "+s1);
		System.out.println(" Reverse String is : "+reverseIt(s1));
	}

            public static String reverseIt(String source)
          {
          	      int i, len = source.length();
          	      StringBuffer dest = new StringBuffer(len);

           	     for (i=(len - 1); i>=0; i--)
            		        dest.append(source.charAt(i));
                  return dest.toString();
        }
}
