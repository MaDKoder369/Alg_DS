package vik.projects.alg;



public class ArrUtl 
{
   public static void AllModeCalc(int[] numRead, int[] mode)
   {
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
   }
   
   public static int ModeCalc(int[] numRead)
   {
      int prev = 0;
      int j = 0;
      
      return j;
   }
}
