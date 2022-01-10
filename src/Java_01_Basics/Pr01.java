package Java_01_Basics;
// 1. How to create a class, object, method and its signature
class Probelm01{
    void add(int a, int b){
        System.out.println("Addition of "+a+" + "+b+" = "+(a+b));
    }
    void Mult(int c, int d){
        System.out.println("Multiplication of "+c+" X "+d+ " = "+(c*d));
    }
}
public class Pr01 {
    public static void main(String[] args) {

        Probelm01 add1 = new Probelm01();
        add1.add(10,5);
        add1.Mult(10,5);
    }
}
