/* Program to calculate Total Amount */  

class P3
{
	public static void main(String args[ ])
	{
		int j=0;
		
	     double qty[]={3,9.7,6.40,4.5,5.6,6.2,7,2.8,15.0,18.0};
	     double price[]={10.20,11.30,13.14,16.9,18.1,2.71,7.55,15.12,9.45,17.0};
	     double amount[]={1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0};
	     double tamount[]= new double[10];

		extend(qty,price,amount);
		System.out.println("Total Amount :");
		for(j=0;j<=9;j++)
			tamount[j]=amount[j];

		for(j=0;j<=9;j++)
			System.out.println(" "+tamount[j]);
	}

	static void extend(double q[], double p[], double amount[])
	{
		int i=0;
		for(i=0;i<=9;i++)
			amount[i]=q[i]*p[i];
	}
}
