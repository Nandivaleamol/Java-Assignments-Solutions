package Java_03_Loops;

import java.util.Scanner;

//12. Print gender (Male/Female) program according to given M/F using switch
public class Problem12 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter M For Male or F for Female: ");
        String gender = sc.next();

        System.out.println("You entered : "+gender);

        switch(gender){
            case "M" ,"m":
                System.out.println("Your Male");
                break;
            case "F", "f":
                System.out.println("Your Female");
                break;
            default:
                System.out.println(" Opp's Something went wrong!Try Again!\n Enter 'M' for Male \n Enter 'F' for Female!");

        }

    }
}
