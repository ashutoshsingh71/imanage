package com.imanage.stack.application;

import com.imanage.stack.Stack;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StackTest {

    @Test
    public void popTest() throws Exception{
        Stack stack = new Stack(2);
        stack.push(2);
        stack.push(4);
        int ele = stack.pop();
        assertTrue(ele == 4);

        int el = stack.pop();
        assertTrue(stack.getTop() == -1);
    }

    @Test
    public void peekTest() throws Exception{
        Stack stack = new Stack(2);
        stack.push(2);
        stack.push(4);
        int ele = stack.peek();
        assertTrue(ele == 4);
    }
}
