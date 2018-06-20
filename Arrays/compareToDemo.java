/* Program to demonstrates the - compareTo() and compareToIgnoreCase() */

class compareToDemo
{
	public static void main(String args[ ])
	{
		String arr[]={"china","japan","nepal","India","pakistan","australia","england"};

		String temp1[]=arr;
		String temp2[]=arr;
 
		 System.out.println("Original String array is :\n");
		 for(int j =0;j<arr.length;j++)		
		        System.out.println(arr[j]);
			
		
		/* using compareTo() */

		System.out.println("\n\nString Array after applying compareTo() :\n");
		for(int j =0;j<temp1.length;j++)
		{
			for(int i = j+1;i<temp1.length;i++)
			{
				if(temp1[i].compareTo(temp1[j])<0)
				{
					String t=temp1[j];
					temp1[j]=temp1[i];
					temp1[i]=t;
				}
			}
			System.out.println(temp1[j]);
		}

		/* using compareToIgnoreCase() */

		System.out.println("\nString Array after applying compareToIgnoreCase() :\n");
		for(int j =0;j<temp2.length;j++)
		{
			for(int i = j+1;i<temp2.length;i++)
			{
				if(temp2[i].compareToIgnoreCase(temp2[j])<0)
				{
					String t=temp2[j];
					temp2[j]=temp2[i];
					temp2[i]=t;
				}
			}
		          System.out.println(temp2[j]);
		}
	}
}


/*
			
Execution:
C:\ javac compareToDemo.java
C:\ java compareToDemo

Output :
Original String array is :

China
japan  
nepal   
India  
pakistan    
australia    
England

String Array after applying compareTo() :

India
australia
china
england
japan
nepal
pakistan

String Array after applying compareToIgnoreCase() :

australia
china
england
India
japan
nepal
pakistan

*/