package B5_Access_Modifier_JAVA.ThucHanh;

public class Student {
    private int rollno;
    private String name;
    private  static String college = "BBDIT";

    Student(int r,String n){
        rollno = r;
        name = n;
    }

    static void change(){
        college = "CODE GYM";
    }

    void display(){
        System.out.println(rollno + " "+ name + " "+college);
    }
}

