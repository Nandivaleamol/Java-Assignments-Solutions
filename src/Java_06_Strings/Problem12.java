package Java_06_Strings;

//12. Converting Numbers to Strings with valueOf()
public class Problem12 {
    public static void main(String[] args) {

        int num = 181022;

        String toStr = String.valueOf(num);

        System.out.println(toStr+10);

        System.out.println();

        int value = 991018;
        System.out.println("Before Converting : "+ value);
        String strVal = String.valueOf(value);
        System.out.println("After Converting : "+strVal+1220);
    }
}
