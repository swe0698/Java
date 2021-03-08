package com.example.java;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value");
        String s = sc.nextLine();
        System.out.println("Enter the second value");
        String k = sc.nextLine();
        double result = Double.parseDouble(s) + Double.parseDouble(k);
        System.out.println("The result is"+ result);


    }
}
