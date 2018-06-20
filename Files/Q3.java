import java.io.*;

class Q3
{
	public static void main(String args[])
	{
		FileOutputStream out;
		PrintStream p;
		try
		{
			out=new FileOutputStream("sample.txt");
			p = new PrintStream(out);
			p.println("This is written to a file");
			p.close();
		}
		catch(Exception e)
		{
			System.err.println("Error writing to file");
		}
	}
}
