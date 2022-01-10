package Java_14_Exception_Handlling;

//5. Write a program to throw exception with your own message
public class Problem05 {
    public static void main(String[] args) {

        try{
            int a = 60/0;
            System.out.println(a);
        }
        catch(Exception e){
            System.out.println("Oop's, Something went wrong!");
        }
    }
}
