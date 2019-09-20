package vik.projects.ds;

/**
 * Stack!
 *
 */
public class Stack 
{
   private int[] Storage;
   private int Cur;
   static int MAX;

   public void Stack( int size )
   {
      int[] Storage = new int[size];
      MAX = size -1;
      Cur = -1;
   }

   public boolean Push(int val)
   {
      if (Cur >= MAX)
      {
         return false;
      }
      else
      {
         Storage[++Cur] = val;
         return true;
      }
   }

   public int Pop()
   {
      if (Cur < 0)
      {
         return 0;
      }
      else
      {
         int val = Storage[Cur--];
         return val;
      }
   }
   
   public int Top()
   {
       return Storage[Cur];
   }
   
   public boolean isEmpty()
   {
       if(Cur < 0)
       {
           return true;
       }
       else
       {
           return false;
       }
   }


}