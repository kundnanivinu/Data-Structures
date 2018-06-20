/* Program to count Total marks and highest marks obtained by student*/  

import java.io.DataInputStream;   // to load DataInputStream class           

class P9
{
	public static void main(String args[ ])
	{
		int marks[][]=new int[5][3];
		int total[]=new int[5];		
		int i,j,high=0,index=0;
		DataInputStream in = new DataInputStream(System.in); 
		
		try
		{
		      	System.out.println("Enter marks obtained by students :");
			for (i=0;i<5;i++)
			  for(j=0;j<3;j++)
      			       marks[i][j]= Integer.parseInt(in.readLine());
		}
		catch(Exception e) {  System.out.println("I/O Error");   }
		
		System.out.println("\n\n *****Annual Examination Result***** \n ");

		System.out.print(" \n\t\t ");
		for (i=0;i<3;i++)
			System.out.print("subj"+(i+1)+"\t");
        	        System.out.println("");
		System.out.println("\t\t________________________");

		for(i=0;i<5;i++)
		{
		     System.out.print(" Roll No. "+(i+1)+"|\t   ");
		     for(j=0;j<3;j++)
			System.out.print(marks[i][j]+"  \t");
		     System.out.println();
		}
		
		for(i=0;i<5;i++)
		     for(j=0;j<3;j++)
			total[i]= total[i]+marks[i][j];

		System.out.println("\n**Total marks Obtained by each student**\n");
		for(i=0;i<5;i++)
		      System.out.println("Total marks of Roll No. "+(i+1)+" : "+total[i]);

		System.out.println("\n**Student who obtained the highest Total marks** \n");
		for(i=0;i<5;i++)
		   if(high<total[i])
		   {
			high=total[i];
			index = i;
		   }
		System.out.println("Highest marks "+high+" obtained by Roll No. "+(index+1));

		System.out.println("\n**Student who obtained the highest marks in each subject** \n");
		high=0;index=0;

		for(j=0;j<3;j++)
		{
		   for (i=0;i<5;i++)
		   {
		       if(high<marks[i][j])
		       {
			 high=marks[i][j];
			 index=i;
		       }
		    }
		   System.out.println("Highest marks "+high+" obtained by Roll No. "+(index+1)+" in subject "+(j+1));
		   high=0;
		}		  		
	}
}		
