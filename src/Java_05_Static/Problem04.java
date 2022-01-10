package Java_05_Static;

//4. Call instance methods in static methods

public class Problem04 {
    public void Display(){
        System.out.println("This is instance method()");
    }
    public static void print(){
        System.out.println("This is static method()");

    }
    public static void main(String[] args) {

        Problem04.print();
        Problem04 pr04 = new Problem04();

        pr04.Display();


    }
}
