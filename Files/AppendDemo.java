/* Appending to a file using random access */

import java.io.*;

class AppendDemo
{
	public static void main(String args[])
	{
		RandomAccessFile RA;
		try
		{
			RA = new RandomAccessFile("BookTitle.txt","rw");
			RA.seek(RA.length());    // Go to the end
			RA.writeBytes("Authors : 1. Ms. Vinaya M. Rawool    2. Ms. Bhakti C. Raul");   // Append data
			RA.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
