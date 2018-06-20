/* Concatenating and buffering files */

import java.io.*;

class ConcatFiles
{
	public static void main(String args[])throws IOException
	{
		//Declare file streams
		FileInputStream f1 = null;
		FileInputStream f2 = null;

		// Declare f3 to store combined files (i.e. f1+f2) 
		SequenceInputStream f3=null;

		//open the files to be concatenated
		f1 = new FileInputStream("file1.txt");
		f2 = new FileInputStream("file2.txt");

		//concatenate f1 and f2 into f3
		f3 = new SequenceInputStream (f1,f2);

		//cretae buffered input and output streams
		BufferedInputStream InputBuffer = new BufferedInputStream (f3);
		BufferedOutputStream OutputBuffer = new BufferedOutputStream (System.out);

		//Read and write till the end of buffers
		int ch;
		while((ch = InputBuffer.read())!=-1)
		{
			OutputBuffer.write((char)ch);
		}
		InputBuffer.close();
		OutputBuffer.close();
		f1.close();
		f2.close();
	}
}

		