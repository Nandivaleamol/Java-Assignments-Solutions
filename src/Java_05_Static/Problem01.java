package Java_05_Static;
/*
1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance
methods and a main method.
 */
public class Problem01 {

    // static variables
    static String ClgName = "VPCSCI";
    static int bactchYear = 2022;

    // instance variables
    String name;
    int age;

    // static methods
    static void printName(String name){
        System.out.println("your name is "+name);
    }
    static void printAge(int age){
        System.out.println("Your Age is "+age);
    }

    // instance methods
    void dispLastname(String name){
        this.name = name;
        System.out.println("Hello World, this Program is based on static keyword!");
        System.out.println("Your name is "+name);
    }
    void dispAge(int age){
        this.age = age;
        System.out.println("Your age is "+age);
    }

    // main method
    public static void main(String args[]){

        // calling static variables
        System.out.println("College Name: "+Problem01.ClgName);
        System.out.println("Batch Year : "+Problem01.bactchYear);

        // Calling static methods
        Problem01.printAge(22);
        Problem01.printName("Amol");

        // calling instance method
        Problem01 pr = new Problem01();
        pr.dispLastname("Nandivale");
        pr.dispAge(23);

    }


}
