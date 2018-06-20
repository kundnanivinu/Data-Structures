// wajp to evaluate a given postfix expression


import java.io.*;

class Stacks		          
{
  private final int STACKSIZE=50; 
  private int top;                   
  private double items[]=new double[STACKSIZE];	

  public Stacks()
  {		top=-1;  }



public void push(double x)
{
  if(top==STACKSIZE-1)
  {
    System.out.println("Stack Overflow. Cannot push");
    return; 	
  }
  else                        
    items[++top]=x;
}


public boolean empty()
{
  if(top==-1)
    return true;
  else
    return false;
}

public double pop()
{
  if(empty())
    {
      System.out.println("Stack Underflow. Cannot pop");
      return -1;   
    }
  else
    return items[top--];
}


}

class PostEval
{
public static void main(String args[]) throws IOException
{

InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader stdin=new BufferedReader(isr);

String e;

System.out.println("Enter the expression in postfix form:");
e=stdin.readLine();
System.out.println("Value of the expression is: "+evaluate(e));
  
}

// this fn will evaluate value of given postfix expression
public static double evaluate(String e)	// why static
{
  int i;
  char c;
  double opnd1,opnd2,value,x;

  Stacks s = new Stacks(); //  V IMP


  for(i=0;i<e.length();i++)
  {
    c=e.charAt(i);
    if(isOperand(c))
    {
      x=c -'0';   // converting a character to a number
      s.push(x);   // Eg. '2' - '0' = 50-48 = 2
    }
    else
    {
      opnd2=s.pop();
      opnd1=s.pop();
      value=oper(c,opnd1,opnd2);
      s.push(value);
    }
  }
  return s.pop();
}

// this fn will return true if the given character is an operand
public static boolean isOperand(char c)
{
  if(c>='0'&&c<='9')
    return true;
  else
    return false;
}

//this fn will apply an operator c to operands opnd1 and opnd2 and will return the result
public static double oper(char c,double opnd1, double opnd2)
{
	switch(c)
	{
	  case '+':return(opnd1+opnd2);  
	  case '-':return(opnd1-opnd2);
	  case '*':return(opnd1*opnd2);
	  case '/':return(opnd1/opnd2);
	  case '$':return(Math.pow(opnd1,opnd2));
	  default:System.out.println("Illegal Operation.");
		  System.exit(1); return -1;
	}
}
}
