package Java_06_Strings;

//13. Converting integer objects to Strings
class Helper{
    // To make class object in main
}
public class Problem13 {
    public static void main(String[] args) {

        // Object of Helper class
        Helper help = new Helper();

        // Converting object to string
        //using toString() method

        String str = help.toString();

        //converting object to string
        // using valueOf() method
        String str2 = String.valueOf(help);

        //Printing the converted string
        System.out.println("Converting string object || using toString() Method: "+str);

        // Printing the converted string
        System.out.println("Converted string object || using valueOf() Method : "+str2);


    }
}
