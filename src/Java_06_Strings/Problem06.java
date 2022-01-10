package Java_06_Strings;

//6. Matching a String Against a Regular Expression With matches()
public class Problem06 {
    public static void main(String[] args) {

        String str = new String("HelloWorld!");

        // Display message for better readability
        System.out.print("Does String contains regex(.*)Hello(.*)? :");

        // Testing if regex is present or not
        System.out.println(str.matches("(.*)Hello(.*)"));

        // Display message for better readability
        System.out.println("Does String contains regex geeks ? :");

        // Testing if regex is present or not
        System.out.println(str.matches("Hello"));
    }
}
