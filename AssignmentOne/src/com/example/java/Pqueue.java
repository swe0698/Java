package com.example.java;

import java.util.PriorityQueue;

public class Pqueue {
    public static void main(String[] args){
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        pQueue.add(-1);
        pQueue.add(2);
        pQueue.add(2);
        pQueue.add(2);
        pQueue.add(3);
        pQueue.add(0);
        pQueue.add(-1);
        pQueue.add(10);

        System.out.println(pQueue);
        pQueue.remove(2);
        /*Delete first element*/
        System.out.println(pQueue.poll());
        System.out.println(pQueue);

        /*Prints first element*/
        System.out.println(pQueue.peek());
        System.out.println(pQueue);

    }
}
