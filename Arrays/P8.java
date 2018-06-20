/* Program to count number of votes and spoilt ballots*/  

import java.io.DataInputStream;   // to load DataInputStream class           

class P8
{
	public static void main(String args[ ])
	{
		int count[]= new int[7];
		int voters[]= new int[100];
		int i,j,n=0;
		DataInputStream in = new DataInputStream(System.in); 
		
		try
		{
		      	System.out.print("Enter Total number of voters : ");
		      	n= Integer.parseInt(in.readLine()); 
			System.out.println("\nAn election is contested by 5 candidates\n");
			System.out.println("       To vote Candidate 1 press 1");
			System.out.println("       To vote Candidate 2 press 2");
			System.out.println("       To vote Candidate 3 press 3");
			System.out.println("       To vote Candidate 4 press 4");
			System.out.println("       To vote Candidate 5 press 5");
			
			for(i=1;i<=n;i++)
			{
				System.out.print(" Voter["+i+"] Enter your vote : ");
				voters[i]= Integer.parseInt(in.readLine()); 
			}
		}
		catch(Exception e) {  System.out.println("I/O Error");   }

		for(i=1;i<=n;i++)
		{
			switch(voters[i])
			{
				case 1: count[1]++;
					    break;

				case 2: count[2]++;
					    break;
				case 3: count[3]++;
					    break;
				case 4: count[4]++;
					    break;
				case 5: count[5]++;
					    break;
				default:
					   count[6]++;
					   break;
			}
		}

		System.out.println(" ");
		for(i=1;i<=5;i++)		
			System.out.println(" Candidate "+i+" : "+count[i]+" votes");		
		System.out.println(" Spoilt Ballot : "+count[6]);		
	}
}
