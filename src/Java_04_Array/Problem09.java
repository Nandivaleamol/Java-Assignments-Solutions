package Java_04_Array;

//9. Write a function to reverse an array of integer values
public class Problem09 {
    public static void main(String[] args) {
        int arr[] = {12,33,42,32,22};

        System.out.print("Original Array: ");
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Reverse Array: ");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }

    }
}
