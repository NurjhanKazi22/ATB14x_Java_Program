package Exercises.Test16112025;

public class Student {
    String name ;
    int rollNo;
    char section;
    Student(String name ,int rollNo ,char section){
        this.name = name;
        this.rollNo=rollNo;
        this.section=section;
    }

    public void print(){
        System.out.print("Student"+":"+name+", "+"Roll No"+":"+rollNo+", "+"Section"+":"+section);
    }

    public static void main(String[] args) {
        Student s = new Student("Bob",101,'A');
        s.print();
    }
}
