package Java_10_Interfaces;

//7. Create an interface and inherit it from the other interface.

interface M{
    default void printString(){
        System.out.println("Hello World");
    }
}
interface N extends M{
    @Override
    default void printString() {
        M.super.printString();
    }
}
public class Problem07 {
    public static void main(String[] args) {

    }
}
