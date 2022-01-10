package Java_14_Exception_Handlling;

import Java_13_Method_Overriding.Problem05;

//3. Write a method which throws exception, Call that method in main class without try block
public class Problem03 {
    int a ;
    int b;
    int c;
    void division(int a, int b){
        this.a = a;
        this.b = b;
        c = a/b;
        System.out.println("Division of a/s: "+c);
    }
    public static void main(String[] args) {

        Problem03 pr = new Problem03();

        pr.division(10,0);
    }
}
