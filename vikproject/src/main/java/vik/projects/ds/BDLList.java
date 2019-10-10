package vik.projects.ds;

import vik.projects.ds.BDNode;
import vik.projects.log.Log;

import java.util.Set;
import java.util.HashSet;


public class BDLList
{

   private BDNode head;
   private static int size;

   // Default constructor
   public BDLList() 
   {
      size = 0;
   }

   public int GetSize() 
   {
      return size;
   }

   public void IncSize() 
   {
      size++;
   }

   public void DecSize() 
   {
      size--;
   }

   public void add(Object data) 
   { //System.out.println("method: add");
      if(head == null)
      {
         head = new BDNode(data);
      }

      BDNode crnN = head;

      if(crnN != null)
      {
          BDNode Ntmp = new BDNode(data);

          while( crnN.GetNext() != null)
          {
              crnN = crnN.GetNext();
          }

          crnN.SetNext(Ntmp);
          Ntmp.SetPrev(crnN);
          IncSize();
      }
   }

   public Object get(int Indx) 
   { //System.out.println("method: get");
       if(Indx < 0)
       {
          return null;
       }

       BDNode crnN = null;

       if(head!=null)
       {
           crnN = head.GetNext();

           for(int i=0; i<Indx; i++)
           {
               if(crnN.GetNext()==null)
               {
                  return null;
               }

               crnN = crnN.GetNext();
           }

          return crnN.GetData();
       }

        return crnN;
   }

   public void AddIndx(Object data, int Indx)
   {//System.out.println("method: AddIndx");

      BDNode tmp = new BDNode(data);
      BDNode crn = head;

      if(crn != null)
      {

         for(int i = 0; i < Indx && crn.GetNext() != null; i++)
         {
            crn = crn.GetNext();
         }
      }

      tmp.SetNext(crn.GetNext());
      crn.SetNext(tmp);
      tmp.SetPrev( crn );
      IncSize();
   }
   
   public void Append(Object data)
   {
      if(head == null)
      {
         head = new BDNode(data);
      }

      BDNode Ntmp = new BDNode(data);
      BDNode crnN = head;
      
      Ntmp.SetNext(crnN.GetNext() );
      crnN.SetNext(Ntmp);
      
      IncSize();
   }

   public boolean remove(int Indx)
   {//System.out.println("method: remove");

      if (Indx < 1 || Indx > size)
	     return false;

      BDNode crn = head;

      if(head != null)
      {

         for(int i = 0; i < Indx; i++)
         {
            if(crn.GetNext() == null)
            {
                return false;
            }
            crn = crn.GetNext();
         }

         System.out.println("method: remove" + crn.GetNext().GetData() );
         
         if( crn.GetNext().GetNext() != null )
         {
            crn.SetNext( crn.GetNext().GetNext() );
            crn.GetNext().SetPrev(crn);
            DecSize();
         }
         else
         {
            crn.SetNext( null );
           //??? todo
            DecSize();
         }

         return true;
      }

      return false;
   }

   public void display()
   {//System.out.println("method: display");
   //System.out.println("List size: " + GetSize() );
       for(int i = 0; i < GetSize(); i++)
       {
          //System.out.println("List size: " + myexp.GetSize() );
          System.out.println(".get(" + i + "): \t\t\t\t" + get(i) );
       }
   }

   public boolean Palindrom()
   {
      BDNode end = head;
      BDNode start = head.GetNext();

       try
       {
           
      for(int i = 0; i < GetSize(); i++)
      {
         if(end.GetNext() == null)
         {
            break;
         }

         end = end.GetNext();
      }

      int size = GetSize() / 2;
      System.out.println("size: " + size);

      while( start != null )
      {
          if(size == 0)
          {
              break;
          }

          if( start.GetData() != end.GetData() )
          {
              return false;
          }

          if( end.GetPrev() != null && start.GetNext() != null )
          {
             end = end.GetPrev(); 
             start = start.GetNext();
             size--;
          }
          else
          {
              break;
          }
      }
    }
          catch (NullPointerException e) 
          {
            System.out.println("Caught the NullPointerException");
            
            if( end == null)
            {
                System.out.println("end the NullPointerException");
            }
            else
            {
                System.out.println("start the NullPointerException");
            }
          }

      return true;
   }
}