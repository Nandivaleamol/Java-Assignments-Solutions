package Java_11_this_and_super;

//4. Call argument constructor of current class using this()
public class Problem04 {
    int a =18;
    Problem04(){
        System.out.println("I am non parameterized constructor");
    }
    Problem04(int a){
        this.a = a;

        System.out.println("I am parameterized constructor");
        System.out.println(a);
    }
    public static void main(String[] args) {
        Problem04 obj = new Problem04();
        Problem04 obj1 = new Problem04(12);
    }
}
