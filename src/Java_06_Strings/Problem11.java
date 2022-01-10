package Java_06_Strings;

//11. Splitting strings with split()
public class Problem11 {
    public static void main(String[] args) {

        String str = "Hello-Welcome-to-Java-World";
        System.out.println(str);

        String parts [] = str.split("-");

        System.out.println("After spliting string: ");
        for(int i=0; i<parts.length; i++){
            System.out.println("==> "+parts[i]);
        }
    }
}
