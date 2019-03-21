package vik.projects.ds;

import vik.projects.ds.LlNode;


class LList
{
	private LlNode head;

    private static int size;

   // Default constructor
   public LList() 
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
   { System.out.println("method: add");
      if(head == null)
      {
         head = new LlNode(data);
      }

      LlNode Ntmp = new LlNode(data);
      LlNode crnN = head;

      if(crnN != null)
      {
          while( crnN.GetNext() != null)
          {
              crnN = crnN.GetNext();
          }

          crnN.SetNext(Ntmp);
          IncSize();
      }
   }

   public Object get(int Indx) 
   { System.out.println("method: get");
       if(Indx < 0)
       {
          return null;
       }

       LlNode crnN = null;

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
   {System.out.println("method: AddIndx");

      LlNode tmp = new LlNode(data);
      LlNode crn = head;

      if(crn != null)
      {

         for(int i = 0; i < Indx && crn.GetNext() != null; i++)
         {
            crn = crn.GetNext();
         }
      }

      tmp.SetNext(crn.GetNext());
      crn.SetNext(tmp);
      IncSize();
   }
   
   public boolean remove(int Indx)
   {System.out.println("method: remove");

      if (Indx < 1 || Indx > size)
	     return false;
        
      LlNode crn = head;
      
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
      
         crn.SetNext( crn.GetNext().GetNext() );
         DecSize();
         return true;
      }
      return false;
   }
   
   public  void display()
   {
       for(int i = 0; i < GetSize(); i++)
       {
          //System.out.println("List size: " + myexp.GetSize() );
          System.out.println(".get(" + i + "): \t\t\t\t" + get(i) );
       }
   }

}