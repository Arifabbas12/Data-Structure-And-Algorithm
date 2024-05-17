package oops;

public class cons {
    public static void main(String args[]) {
        Student s1=new Student();
        Student s2=new Student("Arif Abbas");
        System.out.println(s2.name);
        Student s3=new Student(123);
        System.out.println(s3.roll);
        Student s4=new Student(34.55f);
        System.out.println(s4.marks);
    }
}
class Student{
    String name;
    int roll;
    float marks;

    Student(){ // without parameter
        System.out.println("it is constructor");
    }
    Student(String name){
        this.name=name;

    }
    Student(int roll){
        this.roll=roll;
    }
    Student(float marks){
        this.marks=marks;
    }

}

