package vik.projects.ds;

/**
 * Stack!
 *
 */
public class Stack 
{
   int MAX;
   int Cur;
   int Storage[];
   
   public Stack()
   {
       MAX = 1000;
       Cur = -1;
       Storage = new int[MAX];
   }
   
   public Stack( int size)
   {
       MAX = size - 1;
       Cur = -1;
       Storage = new int[size];
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
   
   public int Size()
   {
       return Cur+1;
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