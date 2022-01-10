package Java_02_Operators;

//6. Program for relational operators (<,<==, >, >==)
public class Problem06 {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;

        if (x < y) {
            System.out.println(x + "is less than " + y);
        }
        else if (x<=y){
            System.out.println(x+" is less than or equal to "+y);
        }
        else if(x>y){
            System.out.println(x+" is greeter than "+y);
        }
        else if(x>=y){
            System.out.println(x +" is greater that equal to "+y);
        }
        else{
            System.out.println("something else!!");
        }
    }
}
