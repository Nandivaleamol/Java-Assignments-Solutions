package Java_04_Array;

//13. Write a method to find the second largest number in an array
public class Problem13 {
    public static void main(String[] args) {

        int temp, size;
        int array[] = {10,39,28,37,50,40};
        size = array.length;

        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] =temp;
                }
            }
        }
        System.out.println("Second Largest number: "+array[size-2]);
    }
}
