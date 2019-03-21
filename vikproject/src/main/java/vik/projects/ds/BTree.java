package vik.projects.ds;

import vik.projects.ds.Node;
import java.lang.*;
import java.util.Arrays; 

public class BTree
{
   private Node root;
   private int NodeCount;
   private int NodeCount2;

   public BTree()
   {
      root = null;
   }

   public Node getRoot()
   {
      return root;
   }

   public void insert_node(Object data)
   {
      NodeCount2++;

      if(root == null)
      {
         root = new Node(data);
      }
      else
      {
         Node node = root;
         Node last_node = node;
      
         while(node != null)
         {
             last_node = node;
            
            if( (int) data > (int) node.getData() )
            {
               node = node.getRight();
            }
            else
            {
               node = node.getLeft();
            } 
         }
        
         Node new_node = new Node(data);

         if( (int) data > (int) last_node.getData() )
         {
            last_node.SetRight(new_node);
         }
         else
         {
            last_node.SetLeft(new_node);
         }
      }
   }
  
  public Node find_node(Object value)
  {
     Node node = root;
    
     while(node != null)
     {
        if( (int) node.getData() == (int) value )
        {
           return node;
        }
        
        if( (int) value > (int) node.getData() )
        {
           node = node.getRight();
        }
        else
        {
           node = node.getLeft();
        }  
     }
     
      return null;
   }

   public int treeHeight(Node n)
   {
     //System.out.println("treeHeight");

      if(n == null)
      {
         return 0;
      }
     
      return 1 + Math.max( treeHeight( n.getLeft() ),
                           treeHeight( n.getRight() ) );
   }

  public void preorderTraversal(Node n)
  {
     //System.out.println("preorderTraversal");

      if(n == null)
      {
         return ;
      }
     
      System.out.println("node contain: " + n.getData() );
      preorderTraversal( n.getLeft() );
      preorderTraversal( n.getRight() );
   }
   
   public void inorderTraversal(Node n)
   {
     //System.out.println("inorderTraversal");
    
      if(n == null)
      {
         return ;
      }

      inorderTraversal( n.getLeft() );
      System.out.println("node contain: " + n.getData() );
      inorderTraversal( n.getRight() );
   }

  public void postorderTraversal(Node n)
  {
     //System.out.println("postorderTraversal");
    
      if(n == null)
      {
        return ;
      }

      inorderTraversal( n.getLeft() );
      inorderTraversal( n.getRight() );
      System.out.println("node contain: " + n.getData() );
   }

   public Node findLowestCommonAncestor(Node root, int value1, int value2)
   {
     //System.out.println("findLowestCommonAncestor");

      while(root != null)
      {
         int value = (int)root.getData();

         if( value > value1 && value > value2)
         {
            root = root.getLeft();
         }
         else if(value < value1 && value2 < value2)
         {
            root = root.getRight();
         }
         else
         {
            return root;
         }
      }

      return null;
   }

   public void CountNodes(Node n)
   {
      //System.out.println("CountNodes");
    
      if(n == null)
      {
         return ;
      }

      NodeCount++;
      CountNodes( n.getLeft() );
      CountNodes( n.getRight() );
   }

   public int GetCount()
   {
      CountNodes(root);

      return NodeCount;
   }

   public int[] BTreeToArr()
   {
      int [] arr = new int[NodeCount2];
      AddToArray(root, arr, 0);
      Arrays.sort(arr);
      
      return arr;
      
   }

   public int AddToArray(Node n, int arr[], int i)
   {
     if(n == null)
     {
        return i;
     }

     arr[i] = (int)n.getData();
     i++;

     if(n.getLeft() != null)
          i = AddToArray(n.getLeft(), arr, i);
     if(n.getRight() != null)
          i = AddToArray(n.getRight(), arr, i);

     return i;
   }

}