package Java_11_this_and_super;

//6. Use this() and super() in methods not in constructors
public class Problem06 {
    int a;
    int b;
    String str;
    void method1(String str){
        this.str = str;
        System.out.println("String value is "+str);
    }
    void printNum(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Value of 'a' : "+a);
        System.out.println("Value of 'b' : "+b);
    }

    public static void main(String[] args) {

        Problem06 p1 = new Problem06();
        p1.printNum(23,32);
        p1.method1("Hello");
    }
}
