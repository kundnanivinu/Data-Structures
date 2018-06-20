import java.util.*;
class StackDemo
{
	static void showpush(Stack st,int f)
	{
		st.push(new Integer(f));
		System.out.println("PUSH -->"+f);
	}

	static void showpop(Stack st)
	{
		System.out.print("POP -->");
		System.out.println(st.pop());
	}

	public static void main(String args[])
	{
		Stack st=new Stack();
		showpush(st,1);
		showpush(st,10);
		showpush(st,5);

		showpop(st);
		showpop(st);
		showpop(st);
		showpop(st);
	}
}


/*

PUSH -->1
PUSH -->10
PUSH -->5
POP -->5
POP -->10
POP -->1
POP -->Stack underflow
*/