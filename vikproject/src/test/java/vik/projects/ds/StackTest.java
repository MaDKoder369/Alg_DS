package vik.projects.ds;

import vik.projects.ds.Stack;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class StackTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void main()
    {
        System.out.println(" Stack test started"); 

        Stack s = new Stack();
        s.Push(10); 
        s.Push(20); 

        System.out.println(s.Pop() + " Popped from stack");
        System.out.println(s.Pop() + " Popped from stack");
        System.out.println(s.Pop() + " Popped from stack"); 
    }
}
