package Java_06_Strings;

//8. equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
public class Problem08 {
    public static void main(String[] args) {
        String lastname = "Nandivale";
        String lastName = "NANDIVALE";

        // .equalsIgnoreCase()
        System.out.println(lastname.equalsIgnoreCase(lastName));

        // .startsWith()
        System.out.println(lastname.startsWith("N"));

        // endsWith()
        System.out.println(lastName.endsWith("l"));

        // compareTo()
        System.out.println(lastName.compareTo("Nandi"));
    }
}
