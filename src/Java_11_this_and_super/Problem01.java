package Java_11_this_and_super;

//1. Print the fields/instance members of the current class using this and without using object

public class Problem01 {
    int a = 5;

    void method(int a){
        a = 10;
        System.out.println("Value of Instance Variable : "+this.a);
        System.out.println("Value of Local variable : "+a);
    }
    void method(){
        int a = 40;
        System.out.println("Value of Instance variable : "+this.a);
        System.out.println("Value of Local variable : "+ a);
    }
    public static void main(String[] args) {

        Problem01 obj = new Problem01();

        obj.method(20);
        obj.method();

    }
}
