package Java_10_Interfaces;

//3. Use Interface instances to call the implemented method in the implemented class
interface A{
    void showName();
    void displayNumber();
}
class B implements A{
    @Override
    public void showName(){
        System.out.println("Pranav");
    }
    @Override
    public void displayNumber(){
        System.out.println(3);
    }
}
public class Problem03 {
    public static void main(String[] args) {
        B b = new B();
         b.displayNumber();
         b.showName();
    }
}
