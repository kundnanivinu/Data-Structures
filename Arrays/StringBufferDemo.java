/* Program to demonstrate StringBuffer Methods */

class StringBufferDemo
{
     public static void main(String args[ ])
     {
		// using length() and capacity()
		StringBuffer sb= new StringBuffer("Java");
		System.out.println("\n StringBuffer : "+sb);

		System.out.println("\n********** length() and capacity() **************");
		System.out.println("\n Length : "+sb.length());
		System.out.println("\n Capacity : "+sb.capacity());

		// using ensureCapacity()
		System.out.println("\n\n********** ensureCapacity() **************");
		System.out.println("\n Allocating room for 50 extra characters");

		sb.ensureCapacity(50); 
		System.out.println(" \n New Capacity after calling ensureCapacity(50) : "+sb.capacity());

		// using setLength()
		System.out.println("\n\n********** setLength() **************");
             System.out.println("When you increase the size of the buffer,null characters are added to the end of the existing buffer.");

		sb.setLength(2);
		System.out.println("\nNew Length after calling setLength(2) : "+sb.length());
		System.out.println("\n StringBUffer after setting new length : "+sb);

		// using charAt() and setCharAt()
		sb = new StringBuffer("Java");
		System.out.println("\n\n********** charAt() and setCharAt() **************");
		System.out.println("\nStringBuffer : "+sb);
		System.out.println("\ncharAt(0) before : "+sb.charAt(0));

		sb.setCharAt(0,'K'); 
		System.out.println("\nNew StringBuffer : "+sb);
		System.out.println("\ncharAt(0) after : "+sb.charAt(0));
		
		// using append()
		System.out.println("\n\n********** append() **************");
		StringBuffer sb1 = new StringBuffer(40);

		String s = sb1.append(" X = ").append(100).append(".").toString();
		System.out.println("\nAfter calling append(), String is : \n");
		System.out.println(s);

		// using insert()
		System.out.println("\n\n********** insert() **************");
		sb = new StringBuffer("Java is a true oriented Language");
		System.out.println("\nStringBuffer : "+sb);

		sb.insert(15, "object-");
		System.out.println("\n calling insert().....");
		System.out.println("\nAfter inserting 'object-' in StringBuffer, New String is :"+sb);

		// using reverse()
		System.out.println("\n\n********** reverse() **************");
		sb = new StringBuffer("JAVA");
		System.out.println("\nStringBuffer : "+sb);
		sb.reverse();
		System.out.println("\nAfter calling reverse() new StringBuffer : "+sb);

		// using delete() and deleteCharAt()
		System.out.println("\n\n********** delete() and deleteCharAt() **************");
		sb = new StringBuffer("Java is a true object-oriented Language");
		System.out.println("\nStringBuffer : "+sb);
		sb.delete(9,14);
		System.out.println("\n calling delete().....");
		System.out.println("\nAfter deleteing 'true' from StringBuffer, New StringBuffer : \n"+sb);

		sb.deleteCharAt(0);
		System.out.println("\n calling deleteCharAt().....");
		System.out.println("\nAfter deleting first character, New StringBuffer: \n"+sb);

		// using replace()
		System.out.println("\n\n********** replace() **************");
		sb = new StringBuffer("He is Superstar.");
		System.out.println("\nStringBuffer : "+sb);

		sb.replace(3,5,"was");
		System.out.println("\ncalling replace()......");
 		System.out.println("\nAfter replacing 'is' with 'was', New StringBuffer : "+sb);

		// using substring()
		System.out.println("\n\n********** substring() **************");
		sb = new StringBuffer("He is Superstar.");
		System.out.println("\nStringBuffer : "+sb);

		s = sb.substring(6,11);
		System.out.println("\n calling substring().....");		
		System.out.println("Retrieving 'Super' from StringBuffer, New StringBuffer : "+s);		

       }
}

/*  

Execution:
C:\ javac StringBufferDemo.java
C:\ java StringBufferDemo


Output :
StringBuffer : Java

********** length() and capacity() **************
 Length : 4

 Capacity : 20

********** ensureCapacity() **************

 Allocating room for 50 extra characters

 New Capacity after calling ensureCapacity(50) : 50

********** setLength() **************
When you increase the size of the buffer , null characters are added to the end
of the existing buffer.

New Length after calling setLength(2) : 2

 StringBUffer after setting new length : Ja

********** charAt() and setCharAt() **************

StringBuffer : Java

charAt(0) before : J

New StringBuffer : Kava

charAt(0) after : K

********** append() **************

After calling append(), String is :

 X = 100.

********** insert() **************

StringBuffer : Java is a true oriented Language

 calling insert().....

After inserting 'object-' in StringBuffer, New String is :Java is a true object
oriented Language

********** reverse() **************

StringBuffer : JAVA

After calling reverse() new StringBuffer : AVAJ

********** delete() and deleteCharAt() **************

StringBuffer : Java is a true object-oriented Language

 calling delete().....

After deleting 'true' from StringBuffer, New StringBuffer :
Java is a object-oriented Language

 calling deleteCharAt().....

After deleting first character, New StringBuffer:
ava is a object-oriented Language

********** replace() **************

StringBuffer : He is Superstar.

calling replace()......

After replacing 'is' with 'was', New StringBuffer : He was Superstar.

********** substring() **************

StringBuffer : He is Superstar.

calling substring().....
Retriving 'Super' from StringBuffer, New StringBuffer : Super

*/