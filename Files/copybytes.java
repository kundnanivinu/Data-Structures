/* Copying a bytes from one file to another */

import java.io.*;
class copybytes
{
	public static void main(String args[])
	{
		// declare input and output file streams
		FileInputStream inputfile = null;    // Input stream
		FileOutputStream outputfile = null;   // Output stream
		//Declare a variable to hold a byte
		byte ByteRead;
		try
		{
			// Connect inputfile to file1.dat
			inputfile = new FileInputStream("file1.dat");
			// Connect outfile to file2.dat
			outputfile = new FileOutputStream("file2.dat");
			// Reading bytes from file1.dat and Writing to file2.dat
			do
			{
				ByteRead =(byte) inputfile.read();
				outputfile.write(ByteRead);
			}
			while(ByteRead!=-1);			
		}
		catch(FileNotFoundException e)	
		{
			System.out.println(" File not found");
		}
		catch(IOException e)
		{
			System.out.println(" I/O Exception ");
		}
		finally
		{
			try
			{
				inputfile.close();
				outputfile.close();
			}
			catch(IOException e) {    }
		}
	}
}
