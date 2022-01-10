package Java_12_Constructor;

/*
1. Write a class with a default constructor, one argument constructor and two argument
constructors. Instantiate the class to call all the constructors of that class from a main
class
 */
class Student{
    int rollNo;
    String name;

    Student(){
        System.out.println("I am Default Constructor");
    }
    Student(int Rn){
        this.rollNo=Rn;
        System.out.println("I am one argument Constructor");
    }

    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
        System.out.println("I am two argument constructor");
    }
}
public class Problem01 {
    public static void main(String[] args) {
        Student student = new Student();

        Student student1 = new Student(18);

        Student student2 = new Student(19,"Amol");
    }
}
