package vik.projects.ds;

import vik.projects.ds.BTree;
import vik.projects.ds.Node;
import vik.projects.alg.ArrUtl;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.lang.*;

public class BTreeTest
{
   @Test
   public void main()
   {
      System.out.println("Test BTree Started");
      BTree mytree = new BTree();
      mytree.insert_node(20);
      mytree.insert_node(8);
      mytree.insert_node(22);
      mytree.insert_node(4);
      mytree.insert_node(12);
      mytree.insert_node(10);
      mytree.insert_node(14);
      
      System.out.println(" tree height: " + mytree.treeHeight( mytree.getRoot() ) );
      
     // Node n = mytree.getRoot();
     
      System.out.println("preorderTraversal");
      //mytree.preorderTraversal(  mytree.getRoot() );
      
      System.out.println("postorderTraversal");
      //mytree.postorderTraversal(  mytree.getRoot() );
      
      System.out.println("inorderTraversal");
      //mytree.inorderTraversal(  mytree.getRoot() );
      
      
      Node n = mytree.findLowestCommonAncestor(  mytree.getRoot(), 4, 14 );
      //System.out.println("findLowestCommonAncestor: " + n.getData() + "\n");
      
      System.out.println("CountNodes: " + mytree.GetCount() + "\n");
      
      int [] arr = new int[100];
      int [] arrMode = new int[100];

      arr = mytree.BTreeToArr();
      //PrintArr(arrMode);
      ArrUtl.AllModeCalc(arr,arrMode);
     // PrintArr(arrMode);
      
      System.out.println("Test BTree Ended");
      
   }
   
   public void PrintArr(int [] arr)
   {
      for(int i : arr)
      {
         System.out.println("Array contain: " + i + "\n");
      }
   }
   


}