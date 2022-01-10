package Java_10_Interfaces;

/*
    8. Create a PUBLIC interface with fields and methods, fields should have values assigned.
        Implement this interface to some class and print the values of the interface fields and
        call the interface methods
 */
interface O{
    public int a = 20;
    public String str = "Hello";
    default void printData(){
        System.out.println(a);
        System.out.println(str);
    }
    default void show(){
        System.out.println("Hello, I am Java Developer.");
    }
}
class P implements O{

}
public class Problem08 {
    public static void main(String[] args) {
        P p = new P();

        p.printData();
        p.show();
    }
}
