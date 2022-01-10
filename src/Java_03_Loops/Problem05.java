package Java_03_Loops;

//5. Write a program to print largest number among three numbers.
public class Problem05 {
    public static void main(String args[]){

        int a1 = 20;
        int a2 = 20;
        int a3 = 20;

        if(a1>a2 && a1>a3){
            System.out.println(a1+ " is largest number");

        }
        else if(a2>a1 && a2>a3){
            System.out.println(a2+" is largest number");
        }
        else if(a3>a1 && a3>a2){
            System.out.println(a3+" is largest number");
        }
        else{
            System.out.println("Given 3 number are equal value");
        }

    }
}
