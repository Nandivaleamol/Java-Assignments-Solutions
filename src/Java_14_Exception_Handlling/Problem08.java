package Java_14_Exception_Handlling;

//8. Write a program to generate Arithmetic Exception
public class Problem08 {
    public static void main(String[] args) {
        int a =0;
        int b = 30;

        int c = b/a;
        // throws an error -> Arithmetic Exception
        System.out.println(c);
    }
}
