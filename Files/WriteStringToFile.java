/* Program to write String to File */

import java.io.*;

class WriteStringToFile 
{	

        public static void main(String args[])
        {              
                FileOutputStream out;   // declare a file output object
                PrintStream p; // declare a print stream object

                try
                {
                        // Create a new file output stream
                        // connected to "myfile.txt"
                        out = new FileOutputStream("myfile.txt");

                        // Connect print stream to the output stream
                        p = new PrintStream( out );
		
                        p.println ("This is written to a file");

                        p.close();
                }
                catch (Exception e)
                {
                        System.err.println ("Error writing to file");
                }
        }
}
