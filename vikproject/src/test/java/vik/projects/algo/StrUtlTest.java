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
    }
}
