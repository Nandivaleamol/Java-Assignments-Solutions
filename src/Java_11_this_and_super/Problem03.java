package Java_11_this_and_super;

import java.lang.reflect.Constructor;

//3. Call constructor of the current class using this()
public class Problem03 {

    // default constructor
    Problem03(){
        System.out.println("Default constructor called.");
    }

    // parameterized constructor
    Problem03(String str){
        super();
        System.out.println("Parameterized constructor called.");
    }

    // main method
    public static void main(String[] args) {
        //initializes the instance of example class
        Problem03 obj = new Problem03("Hello");
        Problem03 obj1 = new Problem03();

    }
}
