package com.example.java;

import java.util.LinkedList;

public class Linklist {
    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(5);
        ll.add(1);
        ll.add(25);
        ll.addFirst(3);
        System.out.println(ll.contains(3));
        ll.addLast(4);
        System.out.println(ll);
        System.out.println(ll.get(1));
        ll.set(0,2);
        System.out.print(ll);
        ll.clear();
        System.out.println(ll);


    }
}
