package vik.projects.alg;

import java.util.Arrays;
import java.lang.*;


public class StrUtl
{
    
   public static boolean CheckString(String str)
   {
       String callMethod = Thread.currentThread().getStackTrace()[2].getMethodName();
       //System.out.println(" CheckString " + callMethod + "\n");
       String errMsg = new String();
       
       if(str == null)
       {
           System.out.println("Null String in CheckString from " + callMethod + "\n");
           return true;
       }
       else if(str.length() == 0)
       {
           System.out.println("String empty in CheckString from " + callMethod + "\n");
           return true;
       }
       else
       {
           return false;
       }
   }

   public static boolean AllUniqChr(String testString)
   {
       if( CheckString(testString) )
           return false;

       char[] str = testString.toCharArray();
       boolean isUniqChr = false;

       for (int i = 0; i < str.length; i++)
       {
          char chr = str[i];

          for (int j = i+1; j < str.length; j++)
          {
              if(chr == str[j])
              {
                  System.out.println("not uniq value: " + chr + "at index: " + j + "   chr:  " + str[j] + "\n");
                  return true;
              }
          }
       }

      return isUniqChr;
   }
   
   public static boolean isStrPermuted(String str1, String str2)
   {
      if( CheckString(str1) && CheckString(str2) )
          return false;
      
      if( str1.length() != str2.length())
      {
          return false;
      }

      boolean isStrPer = StrMinusStr(str1,str2);

      return isStrPer;
   }
   
   public static boolean StrMinusStr(String str1, String str2)
   {
       char[] strToChr1 = str1.toCharArray();
       char[] strToChr2 = str2.toCharArray();
       
       Arrays.sort(strToChr1);
       Arrays.sort(strToChr2); 
       
       for(int i = 0; i < str1.length(); i++)
       {
           if(strToChr1[i] != strToChr2[i])
           {
               return false;
           }
       }
       
       return true;
   }

   public static void URLify(String str1, int strSize)
   {
       if( CheckString(str1) )
       {
           return ;
       }

       char[] strToChr1 = str1.toCharArray();
       char SymbSpace = ' ';

       int spaces = CountSymbolsInArr(strToChr1,SymbSpace);
       int NewSize = ( str1.length() - spaces) + ( spaces * 3);

       if(NewSize > strSize)
       {
           //return;
       }
       char[] strToChr2 = new char[NewSize+1];
       char[] subsitutor = { '%', '2', '0' };

       for(int i = 0, j =0; i < strSize; i++)
       {

           if(strToChr1[i] != SymbSpace )
           {
              strToChr2[j] = strToChr1[i];
              j++;
           }
           else
           {
               for( int si = 0; si < 3; si++)
               {
                  strToChr2[j] = subsitutor[si];
                  j++;
               }
           }
       }
       
       String strUrl = new String(strToChr2);
       System.out.println("function URLify!  " + strUrl + "\n");
   }

   public static int CountSpacesInArr(String str1)
   {
       int cntSpc = 0;

       for( int i = 0; i < str1.length(); i++)
       {
           if(str1.charAt(i) == ' ')
           {
               cntSpc++;
           }
       }

       return cntSpc;
   }

   public static int CountSymbolsInArr(char [] str1, char Symbol)
   {
       int cntSymb = 0;

       for( int i = 0; i < str1.length; i++)
       {
           if(str1[i] == Symbol)
           {
               cntSymb++;
           }
       }

       return cntSymb;
   }
   
   public static boolean OneAway(String str1, String str2)
   {
      if( CheckString(str1) && CheckString(str2) )
      {
         return false;
      }

      int DiffLenghth = str1.length() - str2.length();
      boolean DelEdit = false;
      int DiffSymbol = 0;
      char[] strBig;
      char[] strLittle;

      if( (DiffLenghth > 1) && (DiffLenghth < -1) )
      {
         return false;
      }

      if( DiffLenghth != 0)
      {
         DelEdit = true;
      }
         
      if( DiffLenghth != -1)
      {
         strBig = str1.toCharArray();
         strLittle = str2.toCharArray();
      }
      else
      {
         strBig = str2.toCharArray();
         strLittle = str1.toCharArray();
      }

      //System.out.println("function OneAway test strBig: " +  Arrays.toString(strBig) + "\n");
      //System.out.println("function OneAway test strLittle: " +  Arrays.toString(strLittle) + "\n");

      for( int i = 0; i < strLittle.length; i++)
      {

            if( strBig[i] != strLittle[i] )
            {
               DiffSymbol++;
               //System.out.println("function OneAway strBig[i]: " + strBig[i] + " ,index: " + i + "  strLittle[i]: " + strLittle[i] + "\n");

               if(DelEdit)
               {
                  int res = FindSubStr(strBig,strLittle,i+1,i);
                  
                  if(res != 0)
                  {
                     DiffSymbol++;
                  }
                  else
                  {
                     break;
                  }
               }

               if (DiffSymbol > 1)
               {
                  break;
               }
            }
      }

      if (DiffSymbol > 1)
      {//System.out.println("function OneAway! false:  \n");
         return false;
      }
      else
      {//System.out.println("function OneAway! true:  \n");
         return true;
      }
   }

   public static int FindSubStr(char[] strBig, char[] strLittle, int indB, int indL)
   {

       for( ; indL < strLittle.length; indL++, indB++)
       {
          //System.out.println("function FindSubStr strBig[indB]: " +  strBig[indB] + " ,index: " + indB + "\n");
          //System.out.println("function FindSubStr strLittle[indL]: " +  strLittle[indL] + " ,index: " + indL + "\n");

          if (strBig[indB] != strLittle[indL])
          {
             return indB;
          }
       }

       return 0;
   }

   public static boolean CompressStr(String str1)
   {
      if( CheckString(str1) )
         return false;

      char[] str = str1.toCharArray();
      StringBuilder CmprStr = new StringBuilder();
      char Symbol = str[0];
      int Cnt = 1;

      for (int i = 1; i < str.length; i++)
      {

         if(str[i] == Symbol)
         {
            Cnt++;
         }
         else
         {
            CmprStr.append(Symbol);
            char c = Character.forDigit(Cnt,10);
            CmprStr.append( c );

            System.out.println("function FCompressStr: Symbol:  " + Symbol + "  Cnt: " + c +  "\n");
            Symbol = str[i];
            Cnt = 1;
         }
      }

      CmprStr.append(Symbol);
      char c = Character.forDigit(Cnt,10);
      CmprStr.append( c ) ;
      System.out.println("function FCompressStr: " +  CmprStr.toString() + "\n");

      return true;
   }

   public static void RotateMatrix(String str1)
   {
      // NxN matrix, rotate image by 90 degrees
   }
   
   public static void ZeroMatrix(String str1)
   {
      //if element in MxN matrix is 0, entire row and column are set to 0
   }
   
   public static void StringRotation (String str)
   {
      //todo
   }

}