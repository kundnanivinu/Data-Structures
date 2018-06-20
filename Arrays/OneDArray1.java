/* Program to compute and print the number of students who have obtained marks in specific range */

import java.io.DataInputStream;   // to load DataInputStream class
           
class OneDArray1
{
      public static void main(String args[])
     {
	int student_marks[]= new int[25];
	int i,n=0,count1=0,count2=0,count3=0,count4=0;
	DataInputStream in = new DataInputStream(System.in); 

	try
	{
		System.out.print("Enter no. of student : "); 
		n= Integer.parseInt(in.readLine());
		for(i=0;i<n;i++)
		{
			System.out.print("Enter marks of student ["+(i+1)+"] : ");
			student_marks[i]= Integer.parseInt(in.readLine());
		}
	}
	catch(Exception e) {  System.out.println("I/O Error");   }

	System.out.println();
	for(i=0;i<n;i++)
	{
		if(student_marks[i]>=81&&student_marks[i]<=100)
		{
		           System.out.println("Student["+(i+1)+"] obtained marks between 81 to 100");
			count1++;
		}
		if(student_marks[i]>=61&&student_marks[i]<=80)
		{
			   System.out.println("Student["+(i+1)+"] obtained marks between 61 to 80");
		               count2++;
		}
		if(student_marks[i]>=41&&student_marks[i]<=60)
		{
			     System.out.println("Student["+(i+1)+"] obtained marks between 41 to 60");
		                count3++;
		}
		if(student_marks[i]>=0&&student_marks[i]<=40)
 		{
			    System.out.println("Student["+(i+1)+"] obtained marks between 0 to 40");
			    count4++;
		}
	}
	System.out.println("\nTotal no. of students who obtained marks between 81 to 100 :"+count1);
	System.out.println("Total no. of students who obtained marks between 61 to 80 :"+count2);
	System.out.println("Total no. of students who obtained marks between 41 to 60 :"+count3);
	System.out.println("Total no. of students who obtained marks between 0 to 40 :"+count4);
      }
}

/* 							
Execution:
C:\ javac OneDArray1.java
C:\ java OneDArray1

Output:
Enter no. of student : 5
Enter marks of student [1] : 99
Enter marks of student [2] : 89
Enter marks of student [3] : 65
Enter marks of student [4] : 45
Enter marks of student [5] : 35

Student[1] obtained marks between 81 to 100
Student[2] obtained marks between 81 to 100
Student[3] obtained marks between 61 to 80
Student[4] obtained marks between 41 to 60
Student[5] obtained marks between 0 to 40

Total no. of students who obtained marks between 81 to 100 :2
Total no. of students who obtained marks between 61 to 80 :1
Total no. of students who obtained marks between 41 to 60 :1
Total no. of students who obtained marks between 0 to 40 :1
*/
