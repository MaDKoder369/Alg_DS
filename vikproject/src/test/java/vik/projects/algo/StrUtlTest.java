package vik.projects.alg;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class StrUtlTest 
{
    @Test
    public void main()
    {
        System.out.println("TEST UNIQ VALUE\n");

        String testString = "This Is Test";
		char[] stringToCharArray = testString.toCharArray();

        assertTrue( StrUtl.AllUniqChr(stringToCharArray) );
        
        System.out.println("TEST STRING PERMUTATION\n");

        String testString1 = "ThisIsTest";
        String testString2 = "tseTsIsihT";
        
        assertTrue( StrUtl.isStrPermuted(testString1,testString2) );
    }
}
