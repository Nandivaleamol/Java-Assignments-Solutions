package Java_04_Array;

import java.util.Arrays;

//5. Write a function to remove a specific element from an array
public class Problem05 {
    public static void main(String[] args) {

        int [] myArray = {15,3,43,54,23,65,3,37,27,18};

        System.out.println("Original Array : "+ Arrays.toString(myArray));

        // remove the third element (index->1, value -> 3) of the array
        int removeIndex = 1;
        for(int i= removeIndex; i<myArray.length-1; i++){
            myArray[i] = myArray[i+1];
        }
        //We cannot alter the size of an array , after the removal, the
        //last and second last element in the array will exist twice
        System.out.println("After removing the second element: "+Arrays.toString(myArray));
    }
}
