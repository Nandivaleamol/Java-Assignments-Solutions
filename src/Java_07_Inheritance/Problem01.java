package Java_07_Inheritance;

/*
        A, B and C are classes
        A is a super class. B is a sub class of A. C is a sub class of B.
        Create three methods in each class, 2 methods are specific to each class and third
        method (override method) should be in all three Classes A, B and C
        Create a class with main method. Create an object for each class A, B and C in main
        method and call every method of each class using its own object/instance.
        Call an overridden method with super class reference to B and C class’s objects
        Runtime Polymorphism with Data Members/Instance variables, Repeat the above
        process only for data members

     */

class A{
    public void methodA1(){
        System.out.println("I am methodA1() in class A");
    }
    public void methodA2(){
        System.out.println("I am methodA2() in class A");
    }
    public void methodA3(){
        System.out.println("I am methodA3() in class A");
    }
}
class B extends A{
    public void methodB1(){
        System.out.println("I am methodB1() in class B");
    }
    public void methodB2(){
        System.out.println("I am methodB2() in class B");
    }
    @Override
    public void methodA3(){
        System.out.println("I am methodA3() but i am override in class B ");
    }
}
class C extends B{
    public void methodC1(){
        System.out.println("I am methodC1() and class is C");
    }
    public void methodC2(){
        System.out.println("I am methodC2() of class C ");
    }
    @Override
    public void methodA3(){
        System.out.println("I am methodA3() of class A but i am override in class C");
    }

}
public class Problem01 {
    public static void main(String[] args) {

        // Creating object for Class A
        A a1 = new A();
        a1.methodA1();
        a1.methodA2();
        a1.methodA3();
        //a1.methodB2(); --> throws an error bcz methodB2() is method of class B

        //Creating object for Class B
        B b1 = new B();
        b1.methodB1();
        b1.methodB2();
        b1.methodA3();
        b1.methodA1(); // This is methodA1() class A

        // Creating object for Class C
        C c1 = new C();
        c1.methodC1();
        c1.methodC2();
        c1.methodA3();
        c1.methodA1(); // This is methodA1() class A
        c1.methodB1(); // This is methodB1() class B
    }
}
