import java.util.ArrayList;
import java.util.Scanner;

/* Add objects to list */
class Student{
    String sName;
    String sId;
    int rollNo;
    public Student(String sName, String sId, int rollNo){
        this.sName = sName;
        this.sId = sId;
        this.rollNo = rollNo;
    }

    public Student() {
        sName = null;
        sId = null;
        rollNo = 0;
    }
}

public class CustomObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of objects");
        int c = sc.nextInt();
        sc.nextLine();
       ArrayList<Student> list = new ArrayList<Student>();
            String a,d;
            Student s = new Student();
        for (int i = 0; i < c; i++) {
            System.out.println("Enter the name");
            s.sName = sc.nextLine();

            System.out.println("Enter the id");
            s.sId = sc.nextLine();

            System.out.println("Enter the rollno");
            s.rollNo = sc.nextInt();
            sc.nextLine();

            list.add(s);

        }

            for(Student k:list){
            System.out.println("Student Name:"+k.sName);
            System.out.println("Student Id:"+k.sId);
            System.out.println("Student Rollno:"+k.rollNo);

        }
    }
}
