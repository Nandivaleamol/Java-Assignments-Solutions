package Java_06_Strings;

//14. Converting to uppercase and lowercase
public class Problem14 {
    public static void main(String[] args) {
        String name = "Amol Nandivale";
        System.out.println("Original String : "+name);

        String lowercase = name.toLowerCase();
        System.out.println("Lowercase string : "+lowercase);

        String uppercase = name.toUpperCase();
        System.out.println("UpperCase string : "+ uppercase);


    }
}
