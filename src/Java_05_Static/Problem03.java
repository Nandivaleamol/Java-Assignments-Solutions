package Java_05_Static;

//3. Print static variables in Instance methods
public class Problem03 {

    static String Name = "john";
    static int age = 23;

    public void printName(){
        System.out.println(Name);
        System.out.println(age);
    }
    public static void main(String[] args) {
        Problem03 pr03 = new Problem03();
        pr03.printName();

    }
}
