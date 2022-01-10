package Java_04_Array;

//4. Write a function to test if array contains a specific value
public class Problem04 {
    public static boolean contains(int[] arr, int item){
        for(int n : arr){
            if(item == n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] myArray = {1239,1453,1234,1543,1238,1233,1432,1435,1453};
        System.out.println(contains(myArray,1453));
        System.out.println(contains(myArray,2015));
    }
}
