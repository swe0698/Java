package com.example.java;

import java.util.HashSet;
import java.util.Iterator;

public class Hset {
    public static void main(String[] args){
        HashSet<Float> hSet = new HashSet<>();
        hSet.add(12.2f);
        hSet.add(9.2f);
        hSet.add(3.3f);

        hSet.add(2.2f);
        hSet.add(1.3f);
        hSet.add(3.3f);
        hSet.add(5.4f);
        System.out.println(hSet);

        Iterator<Float> itr = hSet.iterator();
        for(;itr.hasNext();){
            if(hSet.contains(12.2f)) {
                System.out.print("True");
               break;
            }
            else
                System.out.print("False");
        }

    }
}
