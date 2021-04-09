package com.example.java;

import java.util.Iterator;
import java.util.TreeSet;

public class tset {
    public static void main(String[] args){
        TreeSet<String> tSet = new TreeSet<>();
        tSet.add("Ab");
        tSet.add("De");
        tSet.add("Bc");
        tSet.add("Ab");
        tSet.add("Cd");
        tSet.add("Ef");
        /* Delete first and last element */
        System.out.println(tSet.pollFirst());
        System.out.println(tSet.pollLast());
        System.out.println();
        /*Descending Order*/
        Iterator<String> itr = tSet.descendingIterator();
        while (itr.hasNext())
        System.out.println(itr.next());
    }
}
