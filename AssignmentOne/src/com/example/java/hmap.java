package com.example.java;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hmap {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "A");
        hm.put(2, "B");
        hm.put(3, "C");
        hm.put(4, "D");
        hm.put(5, "E");
        hm.put(6, "F");

        for (Map.Entry mapElement : hm.entrySet())
            System.out.println(mapElement.getKey() + " " + mapElement.getValue());

        String s = hm.get(1);
        System.out.println(s);
        hm.put(1,"Z");
        hm.put(7,"Z");
        for(Integer i:hm.keySet())
        System.out.println(i);
        for(String k: hm.values())
            System.out.println(k);
    }
}