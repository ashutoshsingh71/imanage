package com.imanage.stack;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private int top;
    private int size;
    private int[] array;

    public Stack(int MAX_SIZE) {
        this.size = MAX_SIZE;
        this.array = new int [size];
        top = -1;
    }

    public int getTop() {
        return top;
    }


    public void push(int element) throws Exception{
        if(top >= size){
            throw new Exception("Stack is full");
        }else
            ++top;
            array[top] = element;
    }
    public int peek() throws Exception{
        if(top == -1){
            throw new Exception("Stack is empty");
        }else
            return array[top];
    }

    public int pop() throws Exception{
        if(top > -1 && top <= size){
            int ele = array[top--];
            return ele;
        }else
            throw new Exception("Stack is empty");
    }

    public String printStack() throws ArrayIndexOutOfBoundsException, Exception{
        StringBuilder sb = new StringBuilder();
        int k = top;
        for(int i = 0;i<=top; i++){
            sb.append(array[i]  + " ");
            k--;
        }
        return sb.toString();
    }
}
