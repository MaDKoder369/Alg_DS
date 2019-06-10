package vik.projects.alg;



public class ArrUtl 
{
   public static void AllModeCalc(int[] numRead, int[] mode)
   {
      System.out.println("AllModeCalc function!");
      
      int prev = 0;
      int j = 0;

      for(int i = 0; i < numRead.length; i++) 
      {
         if( ((i+1) < numRead.length) && (numRead[i] == numRead[i+1] && prev != numRead[i]) )
         {
            mode[j] = numRead[i];
            prev = numRead[i];
            j++;
         }
      }
      System.out.println("test##### function!");
     PrintArrwithoutZero(mode); 
   }
   
   public static boolean FindValueUnsorted(int [] arr, int val)
   {
       for ( int i : arr)
       {
           if(val == i)
           {
               return true;
           }
       }
       
       return false;
       
   }

   public static int ModeCalc(int[] numRead)
   {
      int prev = 0;
      int j = 0;
      
      return j;
   }
   
   public static void PrintArrwithoutZero(int [] arr)
   {
      System.out.println("PrintArrwithoutZero function!");

      for(int i : arr)
      {
         if(i != 0)
         {
            System.out.println("Array contain: " + i + "\n");
         }
      }
   }
   
   public static void PrintArr(int [] arr)
   {
      System.out.println("PrintArr function!");

      for(int i : arr)
      {
         System.out.println("Array contain: " + i + "\n");
      }
   }
}
