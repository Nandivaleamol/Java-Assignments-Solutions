package Java_04_Array;

//16. Write a function to get the difference of largest and smallest value
public class Problem16 {
    public static void main(String[] args) {

        int arr [] = {12,43,54,76,34,77};

        // Code for Max Value
        int large = arr[0];
        for(int i=1; i<arr.length; i++){
            if(large<arr[i]){
                large = arr[i];
            }
        }
        System.out.println("Largest Value in Array : "+large);

        //code for min value
        int small =arr[0];
        for(int j=1; j<arr.length; j++){
            if (small > arr[j]) {
                small = arr[j];
            }
        }
        System.out.println("Smallest Value in Array : "+small);

        int diff = large-small;
        System.out.println("Difference between Largest value and smallest value is : "+diff);

    }
}
