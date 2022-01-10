package Java_03_Loops;

//6. Write a program to print even number between 10 and 100 using while
public class Problem06 {
    public static void main(String[] args) {

        int n = 10;
        System.out.println("Even numbers "+n+" to 100 are: ");
        while(n<=100){
            while(n%2==0){
                System.out.print(n+" ");
                n++;
            }
            n++;
        }
    }
}
