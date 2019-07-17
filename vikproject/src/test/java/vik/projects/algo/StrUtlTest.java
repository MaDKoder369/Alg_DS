package vik.projects.alg;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class StrUtlTest 
{
    @Test
    public void main()
    {
        // assertTrue will fail if the checked value is false, and assertFalse will do the opposite: fail if the checked value is true. 
        
        
        System.out.println("TEST UNIQ VALUE\n");

        String testString = "This Is Test";
        assertTrue( StrUtl.AllUniqChr(testString) );
        
        /*
        if( StrUtl.AllUniqChr(testString) )
        {
           System.out.println("return true \n");
        }
        else
        {
           System.out.println("return false \n");
        }    just for checking */       
        
        System.out.println("TEST STRING PERMUTATION\n");

        String testString1 = "ThisIsTest";
        String testString2 = "tseTsIsihT";
        
        assertTrue( StrUtl.isStrPermuted(testString1,testString2) );
        
        
        System.out.println("TEST URLIFY\n");
        
        String testString3 = "Mr John Smith   ";
        StrUtl.URLify(testString3,13);
        
        
        System.out.println("TEST ONEAWAY\n");
        
        assertTrue(StrUtl.OneAway("pale","ple") );
        assertTrue(StrUtl.OneAway("pales","pale") );
        assertTrue(StrUtl.OneAway("pale","bale") );
        assertFalse(StrUtl.OneAway("pale","bake") );
        

        System.out.println("TEST COMPRESSSTR\n");
        String testString4 = "aabcccccaaa";
        StrUtl.CompressStr(testString4);
        

    }
}
