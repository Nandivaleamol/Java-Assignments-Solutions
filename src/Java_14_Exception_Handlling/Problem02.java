package Java_14_Exception_Handlling;

//2. Handle the Arithmetic exception using try-catch block
public class Problem02 {
    public static void main(String[] args) {

        int a = 20;
        int b = 0;

        try{
            int c = a/b;
            System.out.println("The result is : "+c);
        }
        catch (Exception e){
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program!");
    }
}
