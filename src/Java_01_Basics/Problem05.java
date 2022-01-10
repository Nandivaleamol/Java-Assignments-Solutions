package Java_01_Basics;

/*
5. Define the local and Global variables with the same name and print both variables and
understand the scope of the variables
 */
public class Problem05 {

    // Global Variable
    static String name = "Amol";

    public static void main(String[] args) {

        // Local Variable
        String Lastname = "Nandivale";

        System.out.println("Global Variable : "+name);
        System.out.println("Local Variable : "+Lastname);
    }
}
