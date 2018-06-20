
/*
    This program demonstrates a few routines for processing binary
    sort trees.  It uses a binary sort tree of integer.
    The user input is an integer number. Then the number of nodes in the tree
    and a list of items in the tree are output. */

import java.io.DataInputStream;   // to load DataInputStream class 

public class BinaryTreeSort
{


   static class TreeNode
   {
      // An object of type TreeNode represents one node
      // in a binary tree of integers.
      int item;         // The data in this node.
      TreeNode left;    // Pointer to left subtree.
      TreeNode right;   // Pointer to right subtree.
      TreeNode(int str)
      {
             // Constructor.  Make a node containing the specified integer.
         item = str;
      }
   }  // end nested class TreeNode

   
   static TreeNode root;  // Pointer to the root node in a binary tree.  This
                          // tree is used in this program as a binary sort tree.
                          // When the tree is empty, root is null.
   
   

   public static void main(String[] args)
   {
      
	int x[]=new int[25];
	int i,n = 0;
	DataInputStream in = new DataInputStream(System.in); 

	try
	{
		  System.out.print("Enter how many numbers to be sorted : ");
               	  n = Integer.parseInt(in.readLine());
                  System.out.println("Enter "+n+" numbers in any order....");
                  for(i=0;i<n;i++)
                  {
                	System.out.print("\t\tElement x["+(i+1)+"]=");
            	        x[i] = Integer.parseInt(in.readLine());
                  }
	}
	catch(Exception e) {  System.out.println("I/O Error");   }


        for( i=0;i<n;i++)
        {
             treeInsert(x[i]);  // Add user's number to the tree.
             System.out.println("\nThe tree contains " + countNodes(root) + " items.");
             System.out.println("\nContents of tree:\n");
             treeList(root);
        }
            
   }  // end main()
   
   
   static void treeInsert(int newItem)
   {
          // Add the item to the binary sort tree to which the global
          // variable "root" refers.  (Note that root can't be passed as
          // a parameter to this routine because the value of root might
          // change, and a change in the value of a formal parameter does
          // not change the actual parameter.)
      if ( root == null )
      {
             // The tree is empty.  Set root to point to a new node containing
             // the new item.  This becomes the only node in the tree.
             root = new TreeNode( newItem );
             return;
      }
      TreeNode runner;  // Runs down the tree to find a place for newItem.
      runner = root;   // Start at the root.
      while (true)
     {
         if ( newItem<(runner.item))
         {
                  // Since the new item is less than the item in runner,
                  // it belongs in the left subtree of runner.  If there
                  // is an open space at runner.left, add a new node there.
                  // Otherwise, advance runner down one level to the left.
            if ( runner.left == null )
            {
               runner.left = new TreeNode( newItem );
               return;  // New item has been added to the tree.
            }
            else
               runner = runner.left;
         }
         else
        {
                  // Since the new item is greater than or equal to the item in
                  // runner it belongs in the right subtree of runner.  If there
                  // is an open space at runner.right, add a new node there.
                  // Otherwise, advance runner down one level to the right.
            if ( runner.right == null )
            {
               runner.right = new TreeNode( newItem );
               return;  // New item has been added to the tree.
            }
            else
               runner = runner.right;
        }
      } // end while
   }  // end treeInsert()
   
   
   static boolean treeContains( TreeNode root, int item )
  {
          // Return true if item is one of the items in the binary
          // sort tree to which root points.   Return false if not.
      if ( root == null )
      {
            // Tree is empty, so it certainly doesn't contain item.
         return false;
      }
      else if ( item ==(root.item) )
           {
              // Yes, the item has been found in the root node.
               return true;
           }
      else if ( item < (root.item) )
           {
               // If the item occurs, it must be in the left subtree.
               return treeContains( root.left, item );
           }
      else
      {
             // If the item occurs, it must be in the right subtree.
             return treeContains( root.right, item );
      }
   }  // end treeContains()
   

   static void treeList(TreeNode node)  // Inorder Traversal of tree
  {
      if ( node != null )
      {
          treeList(node.left);                   // Print items in left subtree.
          System.out.println("  " + node.item);  // Print item in the node.
          treeList(node.right);                  // Print items in the right subtree.
      }
   } // end treeList()
   

   static int countNodes(TreeNode node)
  {
         // Count the nodes in the binary tree to which node 
         // points.  Return the answer.
       if ( node == null )
       {
          // Tree is empty, so it contains no nodes.
          return 0;
       }
       else
       {
          // Add up the root node and the nodes in its two subtrees.
          int leftCount = countNodes( node.left );
          int rightCount = countNodes( node.right );
          return  1 + leftCount + rightCount;  
       }
   } // end countNodes()
   

} // end class BinaryTreeSort