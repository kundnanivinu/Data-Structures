/* Program to display list of eligible candidate */

import java.io.DataInputStream;        // to load DataInputStream class

class student
{
	int maths,phy,chem;

	student()
	{
		maths=0;phy=0;chem=0;
	}
	void getdata()
	{
		try
		{
			DataInputStream in = new DataInputStream(System.in); 
			System.out.print("Enter Mathematics Marks : ");
			maths = Integer.parseInt(in.readLine()); 
			System.out.print("Enter Physics Marks : ");
			phy = Integer.parseInt(in.readLine()); 
			System.out.print("Enter Chemistry Marks : ");
			chem = Integer.parseInt(in.readLine()); 
		}
		catch(Exception e) {  System.out.println("I/O Error");   }
	}
	boolean eligibility()
	{
		int T_3,T_mp;
		boolean flag;
		T_3 = maths+phy+chem;
		T_mp=maths+phy;
		        if((maths>=60&&phy>=50&&chem>=40&&T_3>=200)||(T_mp>=150))
			flag=true;
		else
			flag=false;
		return flag;
	}
}				
class Admission
{
	public static void main(String args[])
	{
		student s[]=new student[100];
		int n =0,i;
		boolean flag=false;
		DataInputStream in = new DataInputStream(System.in); 

		try
		{
			System.out.print("Enter no. of student : "); 
			n = Integer.parseInt(in.readLine());
		}
		catch(Exception e) {  System.out.println("I/O Error");   }

		for(i=0;i<n;i++)
		{
			s[i]=new student();
			System.out.println("\nEnter Marks of student ["+(i+1)+"] ");
			s[i].getdata();
		}
		System.out.println("\n**** List of eligible candidate ****\n");
		for(i=0;i<n;i++)
		{
			flag=s[i].eligibility();
			if(flag==true)
				System.out.println("\t Student ["+(i+1)+"] ");
		}
	}
}

/* 

Execution:
C:\ javac Admission.java
C:\ java Admission

Output:
Enter no. of student : 5
Enter Marks of student [1]
Enter Mathematics Marks : 66
Enter Physics Marks : 55
Enter Chemistry Marks : 45

Enter Marks of student [2]
Enter Mathematics Marks : 70
Enter Physics Marks : 70
Enter Chemistry Marks : 70

Enter Marks of student [3]
Enter Mathematics Marks : 75
Enter Physics Marks : 75
Enter Chemistry Marks : 30

Enter Marks of student [4]
Enter Mathematics Marks : 10
Enter Physics Marks : 15
Enter Chemistry Marks : 45

Enter Marks of student [5]
Enter Mathematics Marks : 76
Enter Physics Marks : 73
Enter Chemistry Marks : 40

 **** List of eligible candidate ****

             Student [2] 
             Student [3] 
 
*/