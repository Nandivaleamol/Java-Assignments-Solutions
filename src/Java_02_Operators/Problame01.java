package Java_02_Operators;

//1. Write a function for arithmetic operators(+,-,*,/)
public class Problame01 {

    static void calculator(int a, int b){
        // for addition
        int add = a+b;
        System.out.println("Addition of "+a+" and "+b+" = "+add);

        //for subtraction
        int sub = a-b;
        System.out.println("Subtraction of "+a+" and "+b+" = "+sub);

        //for Multiplication
        int mult = a*b;
        System.out.println("Multiplication of "+a+" and "+b+" = "+mult);

        // for division
        double div = a/b;
        System.out.println("Division of "+a+" / "+b+" = "+div);

    }
    public static void main(String[] args) {
        calculator(10,5);
    }
}
