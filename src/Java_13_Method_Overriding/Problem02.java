package Java_13_Method_Overriding;

/*
2. Write two methods with the same name but different number of parameters of different
   data type and call the methods from main method
 */
public class Problem02 {
    int a;
    float b;
    String str;

    void display(){
        System.out.println("I am non-parameterized method");
    }
    void display(int a){
        this.a = a;
        System.out.println("Value of 'a' is "+a);
    }
    void display(int a, float b){
        this.a = a;
        this.b = b;
        System.out.println("Value of 'a' is "+a+" and value of 'b' is "+b);
    }
    void display(int a, String str){
        this.a = a;
        this.str = str;
        System.out.println("Value of 'a' is "+a+" and value of 'str' is "+str);
    }
    void display(String str, int a){
        this.a = a;
        this.str = str;
        System.out.println("Value of 'str' is "+str+ " and value of 'a' is "+a);
    }
    public static void main(String[] args) {

        // creating class object
        Problem02 pr = new Problem02();

        // calling all methods
        pr.display();

        pr.display(12);

        pr.display(12,10.5f);

        pr.display(20,"Hello");

        pr.display("Welcome",12);

    }
}
