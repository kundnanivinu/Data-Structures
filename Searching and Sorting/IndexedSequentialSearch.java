/* Program to implement Indexed Sequential Search */


import java.io.DataInputStream;   // to load DataInputStream class

class IndexedSequentialSearch
{
	public static void main(String args[ ])
	{
		int i,j,n = 0,KEY, flag=0,val,indexsize;
		String ans="y";
 		int a[] = new int[25];
 		int kindex[] = new int[10];
	 	int pindex[] = new int[10];
		DataInputStream in = new DataInputStream(System.in);
        try
		{
		    System.out.print("Enter how many numbers to be stored : ");
			n = Integer.parseInt(in.readLine());
			System.out.println("Enter "+n+" numbers ....");
			for(i=0;i<n;i++)
			{
			System.out.print("\t\tElement ["+(i+1)+"]=");
				a[i] = Integer.parseInt(in.readLine());
			}

		    System.out.println("Enter proportional value for calculating size of index table:");
	 	    val = Integer.parseInt(in.readLine());
	 	    System.out.println("If the index is one "+val+" th the size of the file,Every "+val+" th record of the file is represented in the index");
	 	    indexsize=n/val;
	 	    System.out.println("Hence size of index  table is : "+indexsize);
	 	    for (i=0,j=val-1;i<indexsize;i++,j=j+val)
	 	    {
	 		kindex[i]= a[j] ;
	 		pindex[i]= j ;
	 	    }
			System.out.println(" INDEX TABLE :");
				System.out.println("kindex\tpindex");
			for(i=0;i<indexsize;i++)
				 System.out.println(""+kindex[i]+"\t"+pindex[i]);


		    do
  		    {
		    	System.out.print("Enter the number to be searched  : ");
				KEY = Integer.parseInt(in.readLine());

		    	flag=Indexed_Sequential_Search(a,kindex,pindex,KEY,n,indexsize);
		    	if (flag == -1)
					System.out.println(" Number Not present in the given array");
		    	else
					System.out.println(" Number "+KEY+" found at "+(flag+1)+" location in the array");
				System.out.print(" Want to search another number ?");
				ans=in.readLine();
		     }
		     while((ans.equals("y"))||(ans.equals("Y")));

		}
		catch(Exception e) {  System.out.println("I/O Error");   }
	}


	//Indexed Sequential SearchFunction


    	static int Indexed_Sequential_Search(int a[],int kindex[],int pindex[],int key,int n,int indexsize)
    	{
		int i,j,lowlim,highlim;
		for (i=0;(i<indexsize)&&(kindex[i]<=key);i++)     ;
     		//Here we identify the lower limit from where we need to start search
		lowlim=(i==0)? 0 : pindex[i-1];
 		highlim= (i== indexsize) ? n-1 : pindex[i]-1;
	     	//Actually search ‘key’ in the main file
     		for (j=lowlim; (j<=highlim) && (a[j]!=key); j++)  ;
		return ( ( j>highlim) ? -1 : j );
	}

}












