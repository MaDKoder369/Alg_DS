package vik.projects.ds;


class BDNode 
{
   // reference to the next BDNode in the chain, or null if there isn't one.
   BDNode next;
   
   // reference to the previous BDNode in the chain, or null if there isn't one.
   BDNode prev;

   // data carried by this BDNode. could be of any type you need.
   Object data;

   // BDNode constructor
   BDNode(Object datavl)
   {
      next = null;
      prev = null;
      data = datavl;
   }

   public BDNode(Object dataValue, BDNode nextValue, BDNode prevValue) 
   {
      next = nextValue;
      prev = prevValue;
	  data = dataValue;
   }

   Object GetData()
   {
      return data;
   }

   BDNode GetNext()
   {
      return next;
   }
   
   BDNode GetPrev()
   {
      return prev;
   }

   public void setData(Object dataValue) 
   {
      data = dataValue;
   }

   void SetNext(BDNode nextBDNode)
   {
      next = nextBDNode;
   }
   
   void SetPrev(BDNode prevBDNode)
   {
      prev = prevBDNode;
   }

}