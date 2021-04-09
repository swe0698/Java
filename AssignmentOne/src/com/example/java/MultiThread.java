package com.example.java;
//Multithreading

class A extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
        System.out.println("Class A");
            try{Thread.sleep(1000);} catch (Exception e){e.fillInStackTrace();}}
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
        System.out.println("Class B");
            try{Thread.sleep(1000);} catch (Exception e){e.fillInStackTrace();}}
    }
}
public class MultiThread {
    public static void main(String[] args){
  A t1 = new A();
  B t2 = new B();
  t1.start();
  try{Thread.sleep(1000);} catch (Exception e){e.fillInStackTrace();}
  t2.start();

    }

}
