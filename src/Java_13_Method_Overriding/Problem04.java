package Java_13_Method_Overriding;

/*
4. Write two methods with the same name and same number of parameters of different
   type and call from main method
 */
public class Problem04 {
    int a;
    String str;

    void print(int n, String s){
        this.a = n;
        this.str = s;
        System.out.println("I am method with 2 parameters and different data types(int n , String s)");
    }
    void print(String st, int nm){
        this.a = nm;
        this.str = st;
        System.out.println("I am method with 2 parameters and different data types(String st, int nm)");
    }
    public static void main(String[] args) {

        Problem04 pr = new Problem04();

        pr.print(18,"Welcome");

        pr.print("Welcome",18);
    }
}
