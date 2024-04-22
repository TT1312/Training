package com.company.wiproPracticeQuestion;

import java.util.ArrayList;
import java.util.List;

public class CustomStack{

    private List<Integer> stack;

    public CustomStack() {
        stack = new ArrayList<>();
    }

    public void push(Integer item){
        stack.add(item);
    }
    public void pop(){
        if (!stack.isEmpty()){
            stack.remove(stack.size()-1);
        }else {
            System.out.println("No elements");
        }
    }


    public int peek(){
        if (isEmpty()){
            System.out.println("No element!!");
        }
        return (int) stack.get(stack.size()-1);
    }


    public boolean isEmpty(){
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        CustomStack arr = new CustomStack();
        arr.push(3);
        arr.push(6);
        arr.push(9);
        System.out.println(arr.peek());
        arr.pop();
        arr.pop();
        arr.pop();

        boolean hr = arr.isEmpty();
        System.out.println(hr);
    }
}
