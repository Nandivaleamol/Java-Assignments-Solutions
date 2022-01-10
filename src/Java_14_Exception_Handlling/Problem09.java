package Java_14_Exception_Handlling;

//9. Write a program to generate ArrayIndexOutOfBoundException
public class Problem09 {
    public static void main(String[] args) {
        // creating String array
        String [] name = {"Amol","Suraj","Snehal","Sagar","Rohan"};

        System.out.println(name.length);

        // print 6th index
        System.out.println(name[6]);
    }
}
