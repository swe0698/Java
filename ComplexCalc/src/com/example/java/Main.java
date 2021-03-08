package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value1");
        String s = sc.nextLine();
        System.out.println("Enter the value2");
        String k = sc.nextLine();
        System.out.println("Enter the choice (+, -, *, /)");
        String ch = sc.nextLine();
        switch (ch) {
            case "+": {
                add(s, k);
                break;
            }
            case "-": {
                sub(s, k);
                break;
            }
            case "*": {
                mul(s, k);
                break;
            }
            case "/": {
                div(s, k);
                break;
            }
            default: {

                System.out.println("Invalid operation");

            }

        }
    }
        public static void add(String s, String k){
            double result = Double.parseDouble(s) + Double.parseDouble(k);
            System.out.println("The result is" + result);
        }
        public static void sub(String s, String k){
            double result = Double.parseDouble(s) - Double.parseDouble(k);
            System.out.println("The result is" + result);
        }
        public static void mul(String s, String k){
            double result = Double.parseDouble(s) * Double.parseDouble(k);
            System.out.println("The result is" + result);
        }
        public static void div(String s, String k){
            double result = Double.parseDouble(s) / Double.parseDouble(k);
            System.out.println("The result is" + result);
        }



}
