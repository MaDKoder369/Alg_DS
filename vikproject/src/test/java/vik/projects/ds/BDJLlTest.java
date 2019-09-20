package vik.projects.ds;

import vik.projects.ds.BDNode;
import vik.projects.ds.BDLList;
import static org.junit.Assert.*;
import org.junit.Test;


public class BDJLlTest
{
   @Test
   public void main()
   {
      // assertTrue will fail if the checked value is false, and assertFalse will do the opposite: fail if the checked value is true. 

      System.out.println("Test BDLList Started");
      
      BDLList myexp = new BDLList();
      myexp.add("1");
      myexp.add("2");
    //  myexp.display();
      myexp.AddIndx("15",2);
      myexp.add("7");
      myexp.add("12");
     // myexp.display();
      
      myexp.remove(4);
     // myexp.display(); 
      
      
      System.out.println("Test BDLList Palindrom Started");
      
      BDLList Palindrom = new BDLList();
      Palindrom.add("1");
      Palindrom.add("2");
      Palindrom.add("3");
      Palindrom.add("3");
      Palindrom.add("2");
      Palindrom.add("1");
      
      assertTrue( Palindrom.Palindrom() );
      
      
      System.out.println("Test BDLList Ended");
   }

}
