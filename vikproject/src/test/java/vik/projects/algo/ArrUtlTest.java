package vik.projects.alg;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ArrUtlTest 
{

    @Test
    public void main()
    {
        int [] arr = new int[10];
        int [] arrMode = new int[10];
        
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = i + 1;
        }
        arr[1] = 1;
        arr[5] = 5;
        arr[6] = 5;
        PrintArr(arr);
        
        ArrUtl.AllModeCalc(arr,arrMode);
        PrintArr(arrMode);
        
        assertTrue( true );
    }
    
   public void PrintArr(int [] arr)
   {
      System.out.println("PrintArr function!");

      for(int i : arr)
      {
          if ( i == 0 )
          {
              continue;
          }
          else
          {
            System.out.println("Array contain: " + i + "\n");
          }
      }
   }
}
