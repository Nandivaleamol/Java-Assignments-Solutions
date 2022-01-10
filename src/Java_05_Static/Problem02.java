package Java_05_Static;

//2. Print instance variables in static methods
public class Problem02 {
   public String name = "Amol";

    public static void main(String[] args) {

        Problem02 problem02 = new Problem02();
        System.out.println(problem02.name);

    }
}
