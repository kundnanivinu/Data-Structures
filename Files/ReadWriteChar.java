/* Copying characters from one file into another*/

import java.io.*;
class ReadWriteChar
{
	public static void main(String args[])
	{
		// Declare and create input and output files
		File InFile = new File("infile.dat");
		File OutFile = new File("outfile.dat");
		FileReader in = null;       // creates file stream i
		FileWriter o = null;	    // Creates file stream o
		try
		{
			in=new FileReader(InFile);     // opens infile.dat
			o=new FileWriter(OutFile);    // opens outfile.dat
			// read and write file
			int ch;
			while((ch=in.read())!=-1)
				o.write(ch);
		}
		catch(IOException e)
		{
			System.out.println(e);
			System.exit(-1);
		}
		finally    // close files
		{
			try
			{
				in.close();
				o.close();
			}
			catch(IOException e) {   }
		}
	}
}
