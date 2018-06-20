
class ListItem
{
	Object data = null;    // The universal Object.
	ListItem next = null;

	// Constructor.
	public ListItem (Object obj)
	{
		data = obj;  next = null;
	}
	// Accessor.
	public Object getData ()
	{
		return data;
	}
}


// Linked list class - also a dynamic class.
class LinkedList
{
	ListItem front = null;
	ListItem rear = null;
	int numItems = 0;      // Current number of items.

	// Instance method to add a data item.
	public void addData (Object obj)
	{
		if (front == null) {
		front = new ListItem (obj);
		rear = front;
	}
	else
	{
		rear.next = new ListItem (obj);
		rear = rear.next;
	}
		numItems++;
	}

	public void printList ()
	{
		ListItem listPtr = front;
		System.out.println ("List: (" + numItems + " items)");
		int i = 1;
		while (listPtr != null)
		{
			System.out.println ("Item# " + i + ": "+ listPtr.getData());
			i++;
			listPtr = listPtr.next;
		}
	}

	ListItem enumPtr = null;

	// Start an enumeration.
	public void startEnumeration ()
	{
		enumPtr = front;
	}

	public boolean hasMoreElements()
	{
		if (enumPtr == null)
			return false;
		else
			return true;
	}

	public Object getNextElement()
	{
		Object obj = enumPtr.data;
		enumPtr = enumPtr.next;
		return obj;
	}


} // End of class "LinkedList"


// An object to use in the list:

class Person
{

	String name;
	String ssn;
	// Constructor.
	public Person (String name_in, String ssn_in)
	{
		name = name_in;  ssn = ssn_in;
	}
	// Override toString()
	public String toString ()
	{
		return "Person: name=" + name + ", ssn=" + ssn;
	}

} // End of class "Person"


// Test class.

class TestList5
{

public static void main (String[] argv)
{
	// Create a new list object.
	LinkedList L = new LinkedList ();

	// Create a Person instance and add it to list.
	Person p = new Person ("Terminator", "444-43-4343");
	L.addData (p); // p is a subclass of Object and so
	// p is automatically cast to Object

	// We don't really need a Person variable:
	L.addData (new Person ("Rambo", "555-54-5454"));
	L.addData (new Person ("James Bond", "666-65-6565"));
	L.addData (new Person ("Bruce Lee", "777-76-7676"));

	// Print contents.
	L.printList();

	// Enumerate items.
	L.startEnumeration();
	while (L.hasMoreElements()) {
	Person p2 = (Person) L.getNextElement();
	System.out.println (p2);
	}

}

} // End of class "TestList5"

/*Output
List: (4 items)
Item# 1: Person: name=Terminator, ssn=444-43-4343
Item# 2: Person: name=Rambo, ssn=555-54-5454
Item# 3: Person: name=James Bond, ssn=666-65-6565
Item# 4: Person: name=Bruce Lee, ssn=777-76-7676
Person: name=Terminator, ssn=444-43-4343
Person: name=Rambo, ssn=555-54-5454
Person: name=James Bond, ssn=666-65-6565
Person: name=Bruce Lee, ssn=777-76-7676

*/