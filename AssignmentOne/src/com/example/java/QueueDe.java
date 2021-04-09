package com.example.java;

import java.util.ArrayDeque;
import java.util.Deque;


public class QueueDe {
    public static void main(String[] args){
        Deque<String> dQueue = new ArrayDeque<>();
        dQueue.add("A");
        dQueue.add("B");
        dQueue.add("A");
        dQueue.add("C");
        dQueue.add("D");
        dQueue.add("R");
        System.out.println(dQueue);

        System.out.println(dQueue.pollFirst());
        System.out.println(dQueue);
        dQueue.pop();
        System.out.println(dQueue);

        System.out.println(dQueue.remove("a"));
        System.out.println(dQueue);


    }
}
