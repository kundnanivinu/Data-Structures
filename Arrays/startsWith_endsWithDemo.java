/* Program to demonstrates the - startsWith() and endsWith() */

class startsWith_endsWithDemo
{
    public static void main(String args[ ])
    {
          String s1="Yahoo";

          System.out.println(s1+" starts with 'Ya' : "+s1.startsWith("Ya"));
          System.out.println(s1+" ends with 'hoo' : "+s1.endsWith("hoo"));
          System.out.println(s1+" starts with 'hoo'(starting from index 2 for comparison) : "+s1.startsWith("hoo",2));
   }
}

/* 

Execution:
C:\ javac startsWith_endsWithDemo.java
C:\ java startsWith_endsWithDemo

Output:
Yahoo starts with 'Ya' : true
Yahoo ends with 'hoo' : true
Yahoo starts with 'hoo'(starting from index 2 for comparison) : true

*/