/* Program to perform sorting on given numbers using Array*/

class ArrayDemo2
{
	public static void main(String args[])
	{
		int number[] = {100,-34,78,23,10};
		int size= number.length;

		System.out.println("Given List is : ");
		for(int i =0;i<size;i++)
			System.out.print(" "+number[i]);

		System.out.println("\n");

		// Code for ascending sorting

		for(int i =0;i<size;i++)
		{
			for(int j = i+1;j<size;j++)
			{
				if(number[i]>number[j])
				{
					int temp=number[i];
					number[i]=number[j];
					number[j]=temp;
				}
			}
		}

		System.out.println("Sorted List is : ");
		for(int i =0;i<size;i++)
			System.out.print(" "+number[i]);
	}
}		
