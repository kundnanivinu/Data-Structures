/* Program to Sort the matrix in ascending order */

import java.io.DataInputStream;   // to load DataInputStream class           

class P2
{
	public static void main(String args[ ])
	{
		int matrix[][]= new int[3][3];
		int sort[]= new int[9];
		int i, j, temp, k=0;
		DataInputStream in = new DataInputStream(System.in); 

		try
		{
		      System.out.println(" Input 3 × 3 matrix  elements : ");
		       for (i=0;i<3;i++)
			  for(j=0;j<3;j++)
      			       matrix[i][j]= Integer.parseInt(in.readLine());
		}
		catch(Exception e) {  System.out.println("I/O Error");   }

		System.out.println(" Matrix is : ");
		for (i=0;i<3;i++)
		{
		     for(j=0;j<3;j++)
			System.out.print(" "+matrix[i][j]+" ");
		     System.out.println();
		}

		// copy into an array for sorting
		for (i=0; i<3; i++)          
			for (j=0; j<3; j++)
        			        sort[k++] = matrix[i][j];
		
		 //sort the copied array		
		 for (i=0; i<9; i++)          
			for (j=i+1; j<9; j++)
			{
      				if (sort[i] > sort[j])
      				{
               				temp = sort[i];
               				sort[i] = sort[j];
               				sort[j] = temp;
       				}
			}

		System.out.println(" Sorted matrix is : ");
		for ( k=0, i=0, j=0; k<9; k++)       //copy back to the matrix
		{
         		  	if (j == 3)
         		         {
              			j = 0;
              			i ++;  
              			System.out.println("");
          		         }
          		        matrix[i][j] = sort[k];
          		        System.out.print(" "+ matrix[i][j]);      //print sorted matrix.
          		        j++;
                    }
                        
	}
}
