package Java_13_Method_Overriding;

/*1. Write two methods with the same name but different number of parameters of same type
     and call the methods from main method
 */
public class Problem01 {
    int a,b,c,d;

    void sum() {
        System.out.println("I am non parameterized method");
    }
    void sum(int a, int b){
        this.a = a;
        this.b = b;

        System.out.println("Sum of "+a+" and "+b+" is : "+(a+b));
    }
    void sum(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Sum of "+a+", "+b+" and "+c+" is : "+(a+b+c));
    }

    public static void main(String[] args) {

        Problem01 pr = new Problem01();

        pr.sum();
        pr.sum(12,12);
        pr.sum(3,5,4);

    }
}
