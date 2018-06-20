/*  Program that display average of marks for each subject */

class TwoDArray2
{
	public static void main(String args[ ])
	{
		int i , j ;
		int marks[][] ={ {65,68,75,59,77},
				 {62,85,57,66,80},
				 {71,77,66,63,86} } ;
		float avg ;
		System.out.print("\t\t");
		for (i = 0 ; i < 5 ; i++)
			System.out.print("subj"+(i+1)+"\t");

		System.out.println("\n");
		for (i=0 ; i<3 ; i++)
		{
			System.out.print(" student"+(i+1)+"\t");
			for(j=0 ; j<5 ; j++)
				System.out.print(marks[i][j]+"\t");
			System.out.print("\n");
		}
		System.out.print("\n\nThe Average of each subject is : \n") ;

		for (j=0 ; j<5 ; j++)
		{
			System.out.print("Subject"+(j+1)+" : ") ;

			for (i=0,avg=0 ; i<3 ; i++)
				avg = avg + (float)marks[i][j] ;

			avg = avg / 3 ;                               
			System.out.print(avg+"\n");
		}
		
	}
}

/*  
Execution:
C:\ javac TwoDArray2.java
C:\ java TwoDArray2


Output:
                  subj1   subj2   subj3   subj4   subj5

 student1       65      68      75      59      77
 student2       62      85      57      66      80
 student3       71      77      66      63      86

The Average of each subject is :
Subject1 : 66.0
Subject2 : 76.666664
Subject3 : 66.0
Subject4 : 62.666668
Subject5 : 81.0
*/
