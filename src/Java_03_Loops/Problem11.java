package Java_03_Loops;

import java.util.Scanner;

//11. Program to check whether a number is EVEN or ODD using switch
public class Problem11 {
    public static void main (String args[]){

        //int num = 100;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();


        switch (num%2){
            case 0:
                System.out.println(num+" is an Even number");
                break;

            case 1:
                System.out.println(num+" is an Odd number");
                break;

        }

    }
}
