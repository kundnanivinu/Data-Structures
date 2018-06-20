/* Program to find city with highest and lowest temperature */  

import java.io.DataInputStream;   // to load DataInputStream class           

class P7
{
	public static void main(String args[ ])
	{
		int temperature[][]= new int[5][5];
		int sort[]= new int[25];
		int i,j,max=0,min=0,k=0,temp;
		DataInputStream in = new DataInputStream(System.in); 
	
		try
		{
		      System.out.println(" Enter City Temperature: ");
		       for (i=0;i<5;i++)
			  for(j=0;j<5;j++)
      			       temperature[i][j]= Integer.parseInt(in.readLine());
		}
		catch(Exception e) {  System.out.println("I/O Error");   }

		System.out.println("\n ***** Chart of City Temperature ***** ");
		System.out.println("\n Day           City ----- ");
		System.out.println("  | ");
		System.out.println("  | ");
		for(i=0;i<5;i++)
		{
		     for(j=0;j<5;j++)
			System.out.print("    "+temperature[i][j]+" ");
		     System.out.println();
		}

		for (i=0; i<5; i++)          
		    for (j=0; j<5; j++)
        	        sort[k++] = temperature[i][j];
		
		for (i=0; i<25; i++)          
		   for (j=i+1; j<25; j++)
		   {
      			if (sort[i] > sort[j])
      			{
               	                              temp = sort[i];
               		                      sort[i] = sort[j];
               		                      sort[j] = temp;
       			}
		   }
		max=sort[24];
		min=sort[0];
		System.out.println(" Maximum temperature is  :"+max);
		System.out.println(" Minimum temperature is :"+min);
		
		for (i=0;i<5;i++)
		   for(j=0;j<5;j++)
			if(temperature[i][j]==max)
		             System.out.println("Temp of 'city "+(j+1)+"' on 'Day "+(i+1)+"' is maximum that is "+max);

		System.out.println(""); 
		for (i=0;i<5;i++)
		   for(j=0;j<5;j++)
			if(temperature[i][j]==min)
		             System.out.println("Temp of 'city "+(j+1)+"' on 'Day "+(i+1)+"' is minimum that is "+min);	
	}
}
