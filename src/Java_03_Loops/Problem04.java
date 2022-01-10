package Java_03_Loops;

//4. Write a program to print the odd and even numbers.
public class Problem04 {
    public static void main(String args[]){
        int n = 10;
        System.out.println("Even numbers from 1 to "+n+"are: \n");
        for(int i=0; i<=n; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("Odd numbers from 1 to "+n+" are: \n");
        for(int i= 1; i<=n; i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
}
