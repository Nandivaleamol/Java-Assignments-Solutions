package Java_04_Array;

//2. Write a function to calculate the average value of an array of integers
public class Problem02 {
    public static void main(String [] args){
        int arr[] ={11,12,13,14,15,16,23};
        int sum = 0;
        for(int elements: arr){
            sum = sum+elements;
            System.out.println(sum);

        }
        System.out.println("Average of array elements: "+sum/arr.length);

    }
}
