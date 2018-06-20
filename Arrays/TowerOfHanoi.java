/*
  Program to find solution for Towers Of Hanoi 
  It is meant as an example of recursion.
*/


import java.io.DataInputStream;   // to load DataInputStream class 
          
class TowerOfHanoi
{
	public static void main(String args[ ])
	{
		int n=0;		
		DataInputStream in = new DataInputStream(System.in); 

                try
		{
		    System.out.print("Enter number of rings : ");
               	    n = Integer.parseInt(in.readLine());
                    
		}
		catch(Exception e) {  System.out.println("I/O Error");   }	

		Hanoi(n);
	}


	static void MoveDisc (int whichdisc , char frompeg , char topeg )
        {
		System.out.println("Move ring "+whichdisc+" from peg "+frompeg+" to peg "+topeg);
	}

        static void MoveTower (int height, char frompeg, char topeg, char usingpeg) 	
	{
		if (height <= 0)
     	 	{
			// nothing to move!
		} 
		else	
		{
			MoveTower (height-1, frompeg, usingpeg, topeg);
			MoveDisc (height, frompeg, topeg);
			MoveTower (height-1, usingpeg, topeg, frompeg);
		}
 	}

	static void Hanoi(int n) 
	{
		MoveTower(n,'A','B','C');
	}

}
