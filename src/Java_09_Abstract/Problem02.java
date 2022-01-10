package Java_09_Abstract;

/*2. Create a sub class for an abstract class. Create an object in the child class for the
     abstract class and access the non-abstract methods

 */
abstract class Parent{
    public void sayHello(){
        System.out.println("Hello...!");
    }
    abstract public void great();
    abstract public void great2();

}
class Child extends Parent{
    @Override
    public void great() {
        System.out.println("Good Morning!");
    }

    @Override
    public void great2() {
        System.out.println("Good AfterNoon!");
    }
}
abstract class Child1 extends Parent{

    public void Disp(){
        System.out.println("I am abstract class inherited to Parent class!");
    }
}
public class Problem02 {
    public static void main(String[] args) {

        Child c = new Child();

        c.sayHello();

        /*
        Creating an object in the child class for the
     abstract class and access the non-abstract methods
         */
        Parent p = new Child();
        p.sayHello();


    }
}
