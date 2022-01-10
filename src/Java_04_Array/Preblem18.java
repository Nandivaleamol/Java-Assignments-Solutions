package Java_04_Array;

import java.util.HashSet;

//18. Write a program to remove the duplicate elements and return the new array
public class Preblem18 {
    public static void main(String[] args) {
        int arr[] = {12,34,23,14,54,12,14,65,34};

        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<arr.length; i++){

            hs.add(arr[i]);
        }
        for(int no : hs){
            System.out.print(no + " ");
        }
    }
}
