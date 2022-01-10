package Java_10_Interfaces;

/*
   5. Create two interfaces with the same method (same signature) in both the interfaces.
      Implement these two interfaces in one class. Call the method.
 */
interface G{
    void showNumber();
}
interface F{
    void showNumber();
}
class J implements G, F{
    @Override
    public void showNumber() {
        System.out.println(10);
    }
}
public class Problem05 {
    public static void main(String[] args) {

        J j = new J();

        j.showNumber();
    }
}
