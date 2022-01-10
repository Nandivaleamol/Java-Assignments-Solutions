package Java_03_Loops;

//13. Program for multiple if else statement(Largest number in 10,20 and 30)
public class Problem13 {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 20;
        int n3 = 30;

        // if-else ladder
        if(n1>n2 && n1>n3){
            System.out.println(n1+" is largest number than "+n2+" and "+n3);
        }
        else if(n2>n1 && n2>n3){
            System.out.println(n2+" is largest number than "+n1+" and "+n3);
        }
        else if(n3>n1 && n3>n2){
            System.out.println(n3+" is largest number than "+n1+ " and "+n2);
        }
        else{
            System.out.println("All values are same!");
        }

    }
}
