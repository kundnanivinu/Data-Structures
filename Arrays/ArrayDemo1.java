/* Program to calculate average of 5 numbers using Array*/

class ArrayDemo1
{
	public static void main(String args[ ])
	{
		int number[ ] = new int[5];
		int sum=0;

		number[0]=5;
 		number[1]=10;
		number[2]=15;
		number[3]=20;
		number[4]=25;

		for(int i=0;i<5;i++)
			sum=sum+number[i];

		System.out.println("Average is : "+sum/5);
	}
}
