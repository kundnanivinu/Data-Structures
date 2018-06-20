/* n queen problem */

import java.io.DataInputStream;   // to load DataInputStream class 
import java.math.*;   // to load math package

class nQueens
{
	public static void main(String arg[])
	{
		int n=0;
		int x[ ]= new int[8];
		int count=0;
		DataInputStream in = new DataInputStream(System.in); 
		System.out.print("\n\t\t\t\tN-Queens Problem\n\n");
		
                try
		{
		    System.out.print("Enter value of n  : ");
               	    n = Integer.parseInt(in.readLine());
		}
		
		catch(Exception e) {   System.out.print("I/O Error");   }

		nqueens(1,n,x,count);
		
	} /* end void main */

	static int place(int k,int i,int x[])
	{
		int j;
		for(j=1;j<=k-1;j++)
			if((x[j]==i)||((x[j]-i)==(j-k)))
				return 0;
			return 1;
	}

	static void display(int n, int x[])
	{
		int i,j,k;

		System.out.print("\n\n\t");
		for(k=1;k<=n;k++)
			System.out.print("\t"+k);

		for(i=1;i<=n;i++)
		{
			System.out.print("\n\t"+i+"|");
			for(j=1;j<=x[i];j++)
				System.out.print("\t");
			System.out.print("Q\n");
		}
	}

	static void nqueens(int k,int n,int x[],int count)
	{
		int i,j;
		for(i=1;i<=n;i++)
		{
			if(place(k,i,x)==1)
			{
				x[k]=i;
				if(k==n)
				{
				
					System.out.print("\n\t\t");
					count=count+1;
					System.out.print("Solution  = ["+count+"] : (");
					for(j=1;j<=n;j++)
						System.out.print(" "+x[j]);
					System.out.print(")");

					display(n,x);
				}
				else
					nqueens(k+1,n,x,count);
			}
		}
	}/*end nqueens*/

} /* End of nQueens class


/*Sample input and output


                                N-Queens Problem

Enter value of n  : 4

                Solution  = [1] : ( 2 4 1 3)

                1       2       3       4
        1|              Q

        2|                              Q

        3|      Q

        4|                      Q

                Solution  = [1] : ( 2 4 3 1)

                1       2       3       4
        1|              Q

        2|                              Q

        3|                      Q

        4|      Q

                Solution  = [1] : ( 3 1 4 2)

                1       2       3       4
        1|                      Q

        2|      Q

        3|                              Q

        4|              Q

                Solution  = [1] : ( 3 2 4 1)

                1       2       3       4
        1|                      Q

        2|              Q

        3|                              Q

        4|      Q

                Solution  = [1] : ( 4 1 3 2)

                1       2       3       4
        1|                              Q

        2|      Q

        3|                      Q

        4|              Q

                Solution  = [1] : ( 4 2 1 3)

                1       2       3       4
        1|                              Q

        2|              Q

        3|      Q

        4|                      Q

                Solution  = [1] : ( 4 3 2 1)

                1       2       3       4
        1|                              Q

        2|                      Q

        3|              Q

        4|      Q				
*/
