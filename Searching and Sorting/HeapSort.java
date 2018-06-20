/* Program to implement Heap sort */


import java.io.DataInputStream;   // to load DataInputStream class

class HeapSort
{
	public static void main(String args[ ])
	{
		int i,n=0;
 		int x[]=new int[25];
		DataInputStream in = new DataInputStream(System.in);
        try
		{
		    System.out.print("Enter how many numbers to be sorted : ");
			n = Integer.parseInt(in.readLine());
			System.out.println("Enter "+n+" numbers in any order....");
			for(i=0;i<n;i++)
			{
				System.out.print("\t\tElement x["+(i+1)+"]=");
				x[i] = Integer.parseInt(in.readLine());
			}
		}
		catch(Exception e)
		{
			System.out.println("I/O Error");
		}

		heap(x,n);  // Call to heap
		System.out.print("\nSORTED ARRAY:");
		display(x,n);
    }


	//Heap Sort Function

	static void heap(int x[],int n)
	{
		int i,elt,s,f,ivalue,pass=1;
		/*preprocessing phase ;create initial heap*/
		for(i=1;i<n;i++)
		{
				elt=x[i];
				/*pqinsert(x,i,elt)*/
				s=i;
				f=(s-1)/2;
				while((s>0)&&(x[f]<elt))
				{
						x[s]=x[f];
						s=f;
						f=(s-1)/2;
					}/*end while*/
					x[s]=elt;
		}/*end for*/

		/* selection phase ;repeatedly remove x[0],insert it
		in its proper posotion and adjust the heap*/

		for(i=n-1;i>0;i--)
   		{
        		/*pqmaxdelete(x,i+1)*/
           		ivalue=x[i];
          		x[i]=x[0];
          		f=0;
     			/*s=largeson(0,i-1);*/
           		if(i==1)
           			s=-1;
    			else
          			s=1;
           		if((i>2) && (x[2]>x[1]))
              			s=2;
            		while((s>=0)&&(ivalue<x[s]))
              		{
                               x[f]=x[s];
                               f=s;
                               /*s=largeson(f,i-1)*/
                               s=2*f+1;
                                if((s+1<=i-1)&&(x[s]<x[s+1]))
                                    s=s+1;
                                if(s>(i-1))
                                    s=-1;
                         }/*end while*/
                         x[f]=ivalue;
                         System.out.print("\tPass "+(pass++)+" : ");
                         display(x,n);
                  }/*end for*/
	}/*end heap sort*/

	static void display(int a[], int n)
	{
		int i;
		for(i=0;i<n;i++)
	  		System.out.print("   "+a[i]);
		System.out.println("\n-----------------------------------------------");
	}
}









