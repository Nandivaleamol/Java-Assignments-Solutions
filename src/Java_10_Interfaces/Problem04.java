package Java_10_Interfaces;

/*4. Create two interfaces with one method each. Implement these two interfaces in one
     class.
 */
interface C {
    void printNumber();
}
interface D{
    void printString();
}
class E implements C, D{
    @Override
    public void printNumber() {
        System.out.println(18);
    }

    @Override
    public void printString() {
        System.out.println("Hello");
    }
}
public class Problem04 {
    public static void main(String[] args) {
         E e = new E();
         e.printNumber();
         e.printString();
    }
}
