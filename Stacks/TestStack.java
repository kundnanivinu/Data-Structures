import java.util.*;


// An object to use in the stack:

class Person
{

  String name;
  String ssn;

  // Constructor.
  public Person (String nameInit, String ssnInit)
  {
    name = nameInit;  ssn = ssnInit;
  }

  // Override toString()
  public String toString ()
  {
    return "Person: name=" + name + ", ssn=" + ssn;
  }

} // End of class "Person"


class TestStack {

  public static void main (String[] argv)
  {
    // Create a new list object.
    Stack S = new Stack ();

    // Create a Person instance and add it to the Stack.
    S.push (new Person ("Terminator", "444-43-4343"));
    S.push (new Person ("Rambo", "555-54-5454"));
    S.push (new Person ("James Bond", "666-65-6565"));
    S.push (new Person ("Bruce Lee", "777-76-7676"));

    // Pop the top of the stack:
    Person p = (Person) S.pop();
    System.out.println (p);

    // Look at the top without popping:
    p = (Person) S.peek();
    System.out.println (p);

  }

} // End of class "TestStack"
