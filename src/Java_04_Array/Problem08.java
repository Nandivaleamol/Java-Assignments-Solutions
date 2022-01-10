package Java_04_Array;

import java.util.Arrays;

//8. Write a function to find the minimum and maximum value of an array
public class Problem08 {
    public static void main(String[] args) {

        int arr[] = {12,32,34,23,46,43};

        System.out.println("Max value in array: "+Arrays.stream(arr).max());
        System.out.println("Min value in array: "+Arrays.stream(arr).min());
    }
}
