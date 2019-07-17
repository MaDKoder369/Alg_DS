package vik.projects.alg;

import vik.projects.ds.Node;
import vik.projects.alg.ArrUtl;
import java.lang.*;
import java.util.Arrays; 
import java.util.List;



public  class TreeAlg 
{  

   static List<Integer> ModList;
    
   public static List AllModeCalc(Node root)
   {
       //ModList = new ArrayList<Integer>(); 
      
      if(root == null)
      {
        return ModList;
      }

      findMode( root.getLeft() );
      findMode( root.getRight() );
      
      return ModList;
   }
   
   public static void findMode(Node nod)
   {
       System.out.println("findMode");
       
       if( ( nod.getData() == nod.getLeft() || nod.getData() == nod.getRight() ) &&  ModList.contains( (Integer)nod.getData() ) )
       {
           ModList.add((Integer)nod.getData());
       }
           
           
       
   }

}
