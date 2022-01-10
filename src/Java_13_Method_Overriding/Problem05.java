package Java_13_Method_Overriding;

/*
5. Write two methods with the same name, number of parameters and data type but
   different return Type.
 */
public class Problem05 {

    int a;
    String str;
    float f;

    int printNum(int a, float f){
        this.a =a;
        this.f = f;
        System.out.println("I am two parameterized method(int a, float f)");
        return (int) (a+f);
    }
    String printNum(String str, int a){
        this.str = str;
        this.a = a;
        System.out.println("I am two parameterized method(String str, int a)");
        return "Hello";
    }
    public static void main(String[] args) {

        Problem05 pr = new Problem05();

        pr.printNum(12,3.5f);

        pr.printNum("Hi",18);
    }
}
