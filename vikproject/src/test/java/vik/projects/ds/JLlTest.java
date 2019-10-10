package vik.projects.ds;

import vik.projects.ds.LlNode;
import vik.projects.ds.LList;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class JLlTest
{
   @Test
   public void main()
   {
      System.out.println("Test JLlTest Started");
      
      LList myexp = new LList();
      myexp.Append("11");
      myexp.add("2");
      //myexp.display();
      myexp.AddIndx("15",2);
      myexp.display();
      
      //myexp.remove(4);
      myexp.Append("34");
      myexp.Append("324");
      myexp.Append("5434");
      myexp.display();
      
      System.out.println("Test JLlTest Ended");
   }

}
