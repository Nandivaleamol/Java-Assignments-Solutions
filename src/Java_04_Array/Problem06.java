package Java_04_Array;

//6. Write a function to copy an array to another array
public class Problem06 {
    public static void main(String[] args) {
        int arr []= {1,2,3,4,5,6,7,8,9};

        System.out.print("Original Array elements: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        int copyArray[] = arr;
        System.out.print("\n Copy Array Elements: ");
        for(int i=0; i<copyArray.length; i++){
            System.out.print(copyArray[i] +" ");
        }

    }
}
