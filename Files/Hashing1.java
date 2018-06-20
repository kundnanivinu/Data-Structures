/* Program to implement hashing */


import java.io.*;//DataInputStream;   // to load DataInputStream class 

class record
{
	int key;
	String rec;

	record ()
	{
		key=0;
		rec=" ";
	}
}  

        
class Hashing1
{
	public static void main(String args[ ]) 
	{
		int i,ch,cindex;
		int tkey;
		record table[ ] = new record[100]; 
		//String ans="y";
		//DataInputStream in = new DataInputStream(System.in); 
		//BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		try
		{
		  

			table[1].key=49670
			table[1].rec="engine";
			table[2].key=12366
			table[2].rec="breakwire";
			table[3].key =12254;
			table[3].rec="body";
		

          		System.out.println(" Enter a five digit key : ");
			tkey = Integer.parseInt(in.readLine());
			insert(tkey,table);
								
			System.out.println(" Enter key to be searched : ");
			tkey = Integer.parseInt(in.readLine());
			search(tkey,table);

			display(table);
		 	
		}
		        
		catch(Exception e) {  System.out.println("I/O Exception.");   }
	}

	//Hash Function
	static int hash(int KEY)      
	{ 
		int index=KEY%100;
		return(index);
	}

	//Rehash Function
	static int rehash(int index)   
	{
		index=(index+1)%100;
		return(index);
	}

	//Function for displaying content of Table
	static void display(record table[])
	{
		int i;
		System.out.println(" Table: ");
		System.out.println(" ----------------------------------------------");
		System.out.println(" Position\tkey\tRecord\n");
		for(i=0;i<100;i++)
		{
			if(table[i].key!=0)
			System.out.println(" "+i+"\t"+(table[i].key)+"\t"+(table[i].rec));
		}
		System.out.println(" -------------------------------------------------------");
	}

	//Function for inserting new record in table
	static void insert(int KEY, record table[])
	{
		int index,cindex=0;
		index=hash(KEY);
		while(table[index].key!=0 && table[index].key!=KEY)
		{
			index=rehash(index);
		}
		if(table[index].key==0)
		{
			table[index].key=KEY;
			
			System.out.println(" Enter Record : ");
			//while((table[index].rec[cindex++]=getchar())!='\n');
		}
	}

	//Function for searching a key in table
	static void search(int KEY, record table[])
	{
		long cindex=0;
		int i;

		int index=hash(KEY);
		while(table[index].key!=0 &&table[index].key!=KEY)
		{
			index=rehash(index);
		}
		if(table[index].key==KEY)
		{
			System.out.println(" KEY FOUND............");
			System.out.println(" Position\tkey\tRecord\n");
			System.out.println(" "+index+"\t"+(table[index].key)+"\t"+(table[index].rec)); 
		}
		else
		{
			if(table[index].key==0)
			{
				System.out.println("KEY NOT FOUND...........INSERT KEY");
				table[index].key=KEY;
				System.out.println("Enter Record : ");

				//while((table[index].rec[cindex++]=getchar())!='\n');
			}
		}
	}
	
}


	