package Exercises.Test16112025;

public class Person {
    String name ;
    int age;
    Person(String name, int age ){
            this.name= name ;
            this.age=age;
    }

//    public void print(){
//        System.out.print("Name"+":"+name+","+" "+"Age"+":"+age+" ");
//    }

    public static void main(String[] args) {
        Person p1 = new Person("John",25);
        System.out.print("Name"+":"+p1.name+","+" "+"Age"+":"+p1.age+" ");
        Person p2 = new Person("Alice",30);
        System.out.print("Name"+":"+p2.name+","+" "+"Age"+":"+p2.age+" ");

    }
}
