import java.io.*;
class Q1
{
	public static void main(String args[])
	{
		try
		{
			FileReader FR = new FileReader("in.dat");
			FileWriter FW = new FileWriter("out.dat");
			int ch;
			while((ch=FR.read())!=-1)
				FW.write(ch);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
