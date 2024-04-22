package com.company.wiproPracticeQuestion;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Queue;

public class CustomQueue {
    private ArrayList<Integer>Queue;

    public CustomQueue(){
        Queue = new ArrayList<>();
    }
    public void enqueue(Integer i){
        Queue.add(i);
    }
    public Integer dequeue(Integer i){
        if (Queue.isEmpty()){
            throw new EmptyStackException();

        }
        return Queue.get(0);
    }


    public static void main(String[] args) {
        CustomQueue Queue= new CustomQueue();
        Queue.enqueue(10);
        Queue.enqueue(40);
        Queue.enqueue(50);

        System.out.println(Queue.dequeue(3));

    }
}
