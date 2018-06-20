/* Program to demonstrates the - indexOf() and lastIndexOf() */

class indexOfDemo
{
     public static void main(String args[ ])
     {
	 String s = "Java is object oriented and dynamic Language, and  it "+
              "can be used to create two types of programs: applications and applets.";
	 
	 System.out.println("Original String is :");
	 System.out.println(s);

	 System.out.println("\nindexOf(t) = "+s.indexOf('t'));
	 System.out.println("\nlastIndexOf(t) = "+s.lastIndexOf('t'));
	 System.out.println("\nindexOf(and) = "+s.indexOf("and"));
	 System.out.println("\nlastIndexOf(and) = "+s.lastIndexOf("and"));

	 System.out.println("\nindexOf(t,16) = "+s.indexOf('t',16));
	 System.out.println("\nlastIndexOf(t,111) = "+s.lastIndexOf('t',111));
	 System.out.println("\nindexOf(and,30) = "+s.indexOf("and",30));
	 System.out.println("\nlastIndexOf(and,99) = "+s.lastIndexOf("and",99));
      }
}

/*

Execution:
C:\ javac indexOfDemo.java
C:\ java indexOfDemo


Output:
Original String is :
Java is object oriented and dynamic Language, and it can be used to create two types of programs: applications and applets.

indexOf(t) = 13

lastIndexOf(t) = 120

indexOf(and) = 24

lastIndexOf(and) = 111

indexOf(t,16) =20

lastIndexOf(t,111) = 105

indexOf(and,30) = 46

lastIndexOf(and,99) = 46

*/