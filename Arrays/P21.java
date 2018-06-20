/* Program for substring replacement */

class P21
{
	public static void main(String args[ ])
	{
		String org = " This is a demo of substring( )."+
			   " This program shows working of substring( ).";

		String search="is";
		String sub="was";
		String result=" ";
		int i;
	
		do   // replace all matching substring
		{
			System.out.println(org);
			i=org.indexOf(search);
			if(i!=-1)
			{
				result= org.substring(0,i);
				result=result+sub;
				result=result+org.substring(i+search.length());
				org=result;
			}
		}while(i!=-1);
	}
}
