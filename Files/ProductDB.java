/* Program to write String to File */

import java.io.*;

class product
{
	int code;
	int cost;
	int no_of_item;

	public String toString()
	{
		return ""+code+"	  "+cost+"	    "+no_of_item+"";
	}
}

class ProductDB
{	

        public static void main(String args[])
        {              
                FileOutputStream out;   // declare a file output object
                PrintStream p; // declare a print stream object
		DataInputStream in = new DataInputStream(System.in); 
		product pro1 = new product(); 
		product pro2 = new product();
		product pro3 = new product(); 
		product pro4 = new product(); 
		product pro5 = new product(); 

		
		pro1.code=1005; pro1.cost=525; pro1.no_of_item=10;
		pro2.code=1006; pro2.cost=500; pro2.no_of_item=20;
		pro3.code=1007; pro3.cost=1525; pro3.no_of_item=25;
		pro4.code=1008; pro4.cost=1000; pro4.no_of_item=10;
		pro5.code=1009; pro5.cost=20000; pro5.no_of_item=100;

                try
		{
                        // Create a new file output stream
                        // connected to "product.txt"
                        out = new FileOutputStream("Product.txt");

                        // Connect print stream to the output stream
                        p = new PrintStream( out );
		
                        p.println ("Code     Cost     No. of Items");
			p.println(pro1);
			p.println(pro2);
			p.println(pro3);
			p.println(pro4);
			p.println(pro5);

                        p.close();
                }
                catch(Exception e)
                {
                       System.err.println ("Error writing to file");
                }
        }
}
