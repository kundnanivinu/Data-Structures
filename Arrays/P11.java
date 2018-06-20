/* Program to perform string copy */

class P11
{
	public static void main(String args[ ])
	{
        	       String s = "HotJava is Cool!";
        	       StringBuffer t = new StringBuffer("Java is Cool!");

        	       System.out.println("First String is : "+s);
		 System.out.println("Second String is : "+t);
		 System.out.println("\nFirst String is copied to second String ");
        	        myStrCopy(s, t);
		 System.out.println("\nStrings after calling string copy function......");
        	       System.out.println("\nFirst String is : "+s);
		 System.out.println("Second String is : "+t);
    	}

    	static void myStrCopy(String str1, StringBuffer str2)
	{
        	        int i, len = str1.length();
		  str2.setLength(len);
        	         for (i = 0; i < len; i++)
            		         str2.setCharAt(i, str1.charAt(i));
    	}
}
