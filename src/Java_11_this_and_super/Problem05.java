package Java_11_this_and_super;

//5. Call constructor of the parent class using super()
class Demo1{
    int a = 18;
    Demo1(){
        System.out.println("Non parameterized constructor");
    }
    Demo1(int a){
        this.a = a;
        System.out.println("Parameterized constructor");
    }
}
class Demo2 extends Demo1{
    Demo2(int b){
        super(b);
        System.out.println("I am constructor of class Demo2");
    }
}
public class Problem05 {
    public static void main(String[] args) {

        Demo1 d1 = new Demo1(23);
        Demo2 d2 = new Demo2(32);
    }
}
