package com.example.java;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*Sort numbers and string using Arraylist */

public class Main {

    public static void wordsort(ArrayList<String> w){
        Collections.sort(w);
        System.out.println("Ascending order"+w);

        Collections.sort(w,Collections.reverseOrder());
        System.out.println("Descending order"+w);
    }
    public static void numbersort(ArrayList<Integer> n){
        Collections.sort(n);
        System.out.println("Ascending order"+ n);

        Collections.sort(n,Collections.reverseOrder());
        System.out.println("Descending order"+n);
    }
    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<String> words = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the count of numbers you want to sort");
        int ch1 = s.nextInt();
        System.out.println("Enter the count of words you want to sort");
        int ch2 = s.nextInt();

        System.out.println("Enter the numbers");
        for (int i = 0; i < ch1; i++) {
            numbers.add(s.nextInt());
        }
        System.out.println("Enter the words");
        for (int i = 0; i < ch2; i++) {
            words.add(s.next());
        }
        numbersort(numbers);
        wordsort(words);


    }
}
