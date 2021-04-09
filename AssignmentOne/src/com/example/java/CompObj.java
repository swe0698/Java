package com.example.java;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Comparable;

/* Sorting: Comparable interface*/

class StudentComp implements Comparable<StudentComp>{
    String sName;
    String sId;
    int rollNo;
    public StudentComp(String sName, String sId, int rollNo){
        this.sName = sName;
        this.sId = sId;
        this.rollNo = rollNo;
    }

    public StudentComp() {
        sName = null;
        sId = null;
        rollNo = 0;
    }

    public int compareTo(StudentComp o1) {

       return sName.compareTo(o1.sName);
    }
    public int compare(StudentComp o2){
        return rollNo- o2.rollNo;
    }
}
public class CompObj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of objects");
        int c = sc.nextInt();
        sc.nextLine();
        ArrayList<StudentComp> list = new ArrayList<StudentComp>();
        String a, d;

        for (int i = 0; i < c; i++) {
            StudentComp s = new StudentComp();
            System.out.println("Enter the name");
            s.sName = sc.nextLine();

            System.out.println("Enter the id");
            s.sId = sc.nextLine();

            System.out.println("Enter the rollno");
            s.rollNo = sc.nextInt();
            sc.nextLine();

            list.add(s);
        }
        list.sort(StudentComp::compareTo);
    for(StudentComp k: list)
        System.out.println(k.sName+k.sId+k.rollNo);
    list.sort(StudentComp::compare);
        for(StudentComp k: list)
            System.out.println(k.sName+k.sId+k.rollNo);
    }

}
