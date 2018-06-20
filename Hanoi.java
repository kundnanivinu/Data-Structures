// wajp to find solution to towers of hanoi problem


import java.io.*;

class Hanoi
{

public static void main(String args[]) throws IOException
{

 InputStreamReader isr=new InputStreamReader(System.in);
 BufferedReader stdin=new BufferedReader(isr);
 
 int n;
 
 System.out.println("Enter n: ");
 n=Integer.parseInt(stdin.readLine());

 towers(n,'A','C','B');
 
}

public static void towers(int n,char frompeg,char topeg,char auxpeg)
{
  // only one disk is present
  if(n==1)
  {
    System.out.println("Move disk 1 from "+frompeg+" to "+topeg);
    return;
  }

  // move top n-1 disks from a to b using c as auxillary
  towers(n-1,frompeg,auxpeg,topeg);

  //move remaining disk from a to c
  System.out.println("Move disk "+n+ " from "+frompeg+" to "+topeg);

  // move n-1 disk from b to c using a as auxillary
  towers(n-1,auxpeg,topeg,frompeg);
}

}
