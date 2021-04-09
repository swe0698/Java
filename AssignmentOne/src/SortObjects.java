import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/*
* Sort objects with name, rollno */

class StudentSort{
    private String sName;
    private String sId;
    private int rollNo;
    public StudentSort(String sName, String sId, int rollNo){
        this.sName = sName;
        this.sId = sId;
        this.rollNo = rollNo;
    }

    public StudentSort() {
        sName = null;
        sId = null;
        rollNo = 0;
    }
    public String getsName() {
        return sName;
    }
    public void setsName(String sName) { this.sName = sName;}
    public String getsId() {
        return sId;
    }
    public void setsId(String sId) {
        this.sId = sId;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public static Comparator<StudentSort> sNameComp = new Comparator<>() {
       @Override
       public int compare(StudentSort o1, StudentSort o2) {

           return o1.getsName().compareTo(o2.getsName());
       }
   };

    public static Comparator<StudentSort> sRollComp = new Comparator<>() {
        @Override
        public int compare(StudentSort o1, StudentSort o2) {
            return o1.getRollNo()- o2.getRollNo();
        }
    };
}
public class SortObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of objects");
        int c = sc.nextInt();
        sc.nextLine();
        ArrayList<StudentSort> list = new ArrayList<>();


        for (int i = 0; i < c; i++) {
            StudentSort s = new StudentSort();
            System.out.println("Enter the name");
            String name = sc.nextLine();
            s.setsName(name);
            System.out.println("Enter the id");
            String id = sc.nextLine();
            s.setsId(id);
            System.out.println("Enter the roll no");
             int roll= sc.nextInt();
             s.setRollNo(roll);
            sc.nextLine();

            list.add(s);

        }

        list.sort(StudentSort.sNameComp);



        for(StudentSort k:list){
            System.out.println("Student Name: "+k.getsName()+"\n"+
                    "Student Id: "+k.getsId()+"\n"+
                    "Student Roll No: "+k.getRollNo());

        }
    System.out.println(" ");
        list.sort(StudentSort.sRollComp);
        for(StudentSort k:list){
            System.out.println("Student Name: "+k.getsName()+"\n"+
                    "Student Id: "+k.getsId()+"\n"+
                    "Student Roll No: "+k.getRollNo());

        }
    }
}
