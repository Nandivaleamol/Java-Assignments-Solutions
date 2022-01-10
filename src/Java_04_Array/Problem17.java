package Java_04_Array;

//117. Write a method to verify if the array contains two specified elements(12,23)
public class Problem17 {
    public static void main(String[] args) {

        int arr[] = {54,39,20,29,12,23};
        int search1 = 12;
        int search2 = 23;

        for(int item:arr){
            if(item == search1){
                System.out.println("The array contains "+search1);
            }
            else if(item == search2){
                System.out.println("The array contains "+search2);
            }
            else{
                System.out.println("The array contains "+search1 + " and "+search2);
                break;
            }
        }
    }
}
