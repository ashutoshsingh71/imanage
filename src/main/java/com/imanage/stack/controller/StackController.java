package com.imanage.stack.controller;

import com.imanage.stack.Stack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@Component
public class StackController {

    Stack stack;

    @RequestMapping("/welcome")
    public String welcomepage() {
        return "Welcome to Stack creation page";
    }

    @RequestMapping("/create/{size}")
    public Stack createStack(@PathVariable int size) {
        try{
            stack =  new Stack(size);
        }catch (Exception ex){
            System.out.println(ex.getCause());
            System.out.print(ex.getStackTrace());
        }
        return stack;
    }

    @GetMapping("/print")
    public String printStack() throws Exception {
        System.out.println(stack.getTop());
        return stack.printStack();
    }

    @GetMapping("/push/{ele}")
    public void pushElementToStack(@PathVariable int ele) {
        try {
            stack.push(ele);
            System.out.println(stack.getTop());
        }catch (Exception ex){
            System.out.println(ex.getCause());
            System.out.println(ex.getStackTrace());
        }

    }

    @GetMapping("/peek")
    public int getTopElement() {
        try {

            System.out.println(stack.getTop());
            return stack.peek();
        }catch (Exception ex){
            System.out.println(ex.getCause());
        }
        return -1;
    }

    @GetMapping("/pop")
    public int removeTopElement() {
        try {
            int ele = stack.pop();
            return ele;
        }catch (Exception ex){
            System.out.println(ex.getCause());
        }
        return -1;
    }
}
