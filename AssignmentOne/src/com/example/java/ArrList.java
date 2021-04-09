package com.example.java;

import java.util.ArrayList;

//Arraylist

public class ArrList {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<String>();
        al.add("22");
        al.add("33");
        al.add("11");
        al.add("99");
        al.remove(0);
        al.set(0,"10");

        String a = al.get(1);
        System.out.println(a);
        System.out.println(al);

        /* Convert arraylist to array */
        String[] arr = new String[al.size()];
        al.toArray(arr);
        for(String i:arr){
            System.out.println(i);
        }

        /* Convert arraylist to string */
        String s= al.toString();
        System.out.print(s);

    }
}
