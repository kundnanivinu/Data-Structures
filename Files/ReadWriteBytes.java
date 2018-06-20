/* Program to demonstrates Read and write bytes */

import java.io.*;

public class ReadWriteBytes
{
	static final int LINELENGTH = 80;
	public static void main(String arg[]) throws IOException
	{
		byte [] name = new byte[LINELENGTH];
		byte [] number = new byte[LINELENGTH];
		
		FileOutputStream fos = new FileOutputStream("phone.dat");
		while(true)
		{
			System.out.println("Enter Name (enter 'exit' to quit): ");
			readLine(name);
			if("exit".equalsIgnoreCase(new String(name,0,4)))
				break;
			for(int i = 0;name[i] != 13; i++)
                           {
				fos.write(name[i]);
			}
			fos.write('.');
			fos.write('.');
			fos.write('.');
			
			System.out.println("Enter Number : ");
			readLine(number);
			for( int i = 0; number[i] != 13; i++){
				fos.write(number[i]);
			}
			fos.write('\n');
		}
		fos.close();
		FileInputStream fis = new FileInputStream("phone.dat");
		int i;
		System.out.println("\n The Telephone Directory:\n");
		do
                  {
			i = fis.read();
			if( i != -1 ) System.out.print((char)i);
		}while( i != -1);
		fis.close();
	}
	
	private static void readLine(byte [] line) throws IOException
	{
		int i = 0, b = 0;
		while(i < LINELENGTH - 1 && (b = System.in.read()) != '\n')
		{
			line[i++] = (byte)b;
		}
	}
}	
