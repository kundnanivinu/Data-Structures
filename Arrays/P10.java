/* Program to merge ascending array */  
           
class P10
{
	public static void main(String args[ ])
	{
		int A[]= {17,45,3,2,5};
		int B[]= {55,19,10,25,-1};
		int C[]= new int[10];
		int i,j,k=0,temp;
		
		System.out.print("\n Array A : ");
		for(i=0;i<5;i++)
		      System.out.print(" "+A[i]+"  ");

		System.out.print("\n\n Array B : ");
		for(i=0;i<5;i++)
		      System.out.print(" "+B[i]+"  ");

		for (i=0; i<5; i++)          
		   for (j=i+1; j<5; j++)
		   {
      			if (A[i] > A[j])
      			{
               	             temp = A[i];
               		     A[i] = A[j];
               		     A[j] = temp;
       			}
		   }

		System.out.print("\n\n Sorted Array A  : ");
		for(i=0;i<5;i++)
		      System.out.print(" "+A[i]+"  ");

		for (i=0; i<5; i++)          
		   for (j=i+1; j<5; j++)
		   {
      			if (B[i] > B[j])
      			{
               	             temp = B[i];
               		     B[i] = B[j];
               		     B[j] = temp;
       			}
		   }
		System.out.print("\n\n Sorted Array B : ");
		for(i=0;i<5;i++)
		      System.out.print(" "+B[i]+"  ");

		// Merging of two Array
		    for(i=0;i<5;i++)
			C[k++]=A[i];
		    for(i=0;i<5;i++)
			C[k++]=B[i];

		System.out.print("\n\n Array C : ");
		for(i=0;i<10;i++)
		    System.out.print(" "+C[i]+"  ");

		for (i=0; i<10; i++)          
		   for (j=i+1; j<10; j++)
		   {
      			if (C[i] > C[j])
      			{
               	             temp = C[i];
               		     C[i] = C[j];
               		     C[j] = temp;
       			}
		   }
		System.out.print("\n\n Sorted Array C : ");
		for(i=0;i<10;i++)
		    System.out.print(" "+C[i]+"  ");
	}
}		
