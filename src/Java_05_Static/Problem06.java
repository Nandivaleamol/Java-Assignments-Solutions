package Java_05_Static;

//6. Print all the static, instance variables in main method
public class Problem06 {
    // instance variables
    String name = "Amol";
    int age = 22;

    // static variables
    static String lastname = "Nandivale";
    static int year = 2022;
    public static void main(String[] args) {

        // creating new class object
        Problem06 obj = new Problem06();

        // calling all instance variables
        String n = obj.name;
        int a = obj.age;

        // Printing instance variable
        System.out.println("Name is : "+n);
        System.out.println("Age is : "+a);

        //calling static variables
        System.out.println("Lastname is "+Problem06.lastname);
        System.out.println("Current year is "+Problem06.year);
    }
}
