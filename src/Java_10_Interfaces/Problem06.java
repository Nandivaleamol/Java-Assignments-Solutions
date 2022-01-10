package Java_10_Interfaces;

/*
    6. Create an interface with a default method and implement it in a class. Do not provide
       implementation to the default method and call the method.
 */
interface K{
    default void showRollNo(){
        System.out.println(1234);
    }
}
class L implements K{

}
public class Problem06 {
    public static void main(String[] args) {

        //K = new K(); // cannot create object of interface
        L l = new L();
        l.showRollNo();
    }
}
