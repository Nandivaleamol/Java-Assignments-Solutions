package Java_02_Operators;

//7. Print the smaller and larger number
public class Problem07 {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;

        if(x<y){
            System.out.println(x+" is smaller than "+y);
        }
        else if (x>y){
            System.out.println(x + " is larger than "+y);
        }
        else{
            System.out.println(x+" and "+y+ " both are equals");
        }
    }
}
