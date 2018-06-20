/* Program to calculate total number of word and lines in a file */

import java.io.*;


class CountWordLine
{
	public static void main(String args[]) throws IOException
	{
		File InFile = new File("sample2.txt");
		int countword=0; int countline=0;
		
            	FileReader in = null;       // creates file stream i
            	
             	try
		{
                         in=new FileReader(InFile);     // opens infile.dat
                        	
                          // read and write file
                  	  int ch;
                          while((ch=in.read())!=-1)
			  {
				if(ch==' ')
				    countword=countword+1;
				if(ch=='\n')
				    countline=countline+1;
			  }
			countword=countword+1+countline;
			System.out.println("Total number of words in files are :"+countword);
			System.out.println("Total number of lines in files are :"+(countline+1));
            	}
		catch(IOException e)
		{
			System.out.println(e);
			System.exit(-1);
		}

	}
}
		 