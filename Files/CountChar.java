import java.io.*;


class CountChar
{
	public static void main(String args[]) throws IOException
	{
		File InFile = new File("sample1.txt");
		int count=0;
		
            	FileReader in = null;       // creates file stream i
            	
             	try
		{
                         in=new FileReader(InFile);     // opens infile.dat
                        	
                          // read and write file
                  	  int ch;
                          while((ch=in.read())!=-1)
			  {
				if((ch!=' ') && (ch>=65 && ch<=143))
				    count=count+1;
			   }
			System.out.println("Total number of characters in files are :"+count);
            	}
		catch(IOException e)
		{
			System.out.println(e);
			System.exit(-1);
		}

	}
}
		 