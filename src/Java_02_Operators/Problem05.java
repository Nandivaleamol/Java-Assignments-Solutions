package Java_02_Operators;

//5. Programs on Logical AND,OR operator and Logical NOT
public class Problem05 {
    public static void main(String[] args) {
        int a = 20;
        int b = 5;
        int c = 20;

        if (a==b && a==c){
            System.out.println("a and b and c are equal value");
        }
        else if (a==b || a==c){
            System.out.println("a and b or a and c are equal value");
        }
    }
}
