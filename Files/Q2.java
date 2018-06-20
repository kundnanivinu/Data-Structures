import java.io.*;

class Q2
{
	public static void main(String args[])
	{
		if(args.length==1)
		{
			try
			{
				FileInputStream fstream = new FileInputStream(args[0]);
				DataInputStream in = new DataInputStream(System.in);
				while(in.available()!=0)
					System.out.println(in.readLine());
				in.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else
			System.out.println("Invalid parameters");
	}
}
			
