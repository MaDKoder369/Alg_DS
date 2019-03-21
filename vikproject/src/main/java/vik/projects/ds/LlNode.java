package vik.projects.ds;


class LlNode 
{
   // reference to the next LlNode in the chain, or null if there isn't one.
   LlNode next;

   // data carried by this LlNode. could be of any type you need.
   Object data;

   // LlNode constructor
   LlNode(Object datavl)
   {
       next = null;
       data = datavl;
   }

   public LlNode(Object dataValue, LlNode nextValue) 
   {
      next = nextValue;
	  data = dataValue;
   }

   Object GetData()
   {
       return data;
   }

   LlNode GetNext()
   {
       return next;
   }

   public void setData(Object dataValue) 
   {
      data = dataValue;
   }

   void SetNext(LlNode nextLlNode)
   {
       next = nextLlNode;
   }

}