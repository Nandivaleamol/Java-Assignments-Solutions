package Java_05_Static;

//5. Call static methods in instance methods

class A{
    public void method1(){
        System.out.println("This Instance Method()");

        // calling static method in instance method
        method2();
    }
    public static void method2(){
        System.out.println("This is static method()");
    }
}
public class Problem05 {

    public static void main(String[] args) {
       // A.method2();

        A obj = new A();
        obj.method1();

    }


}
