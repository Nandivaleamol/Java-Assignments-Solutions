package Java_04_Array;

//3. Write a program to find the index of an array element
public class Problem03 {
    public static void main(String[] args) {
        int arr[] = {1,34,54,56,87,3,4};

        int element = 3;
        int index = -1;

        int i = 0;

        //using while loop
        while(i<arr.length){
            if(arr[i] == element){
                index = i;
                break;
            }

            i++;
        }
        System.out.println("Index of "+ element+" is : "+index);

        // using for loop
        for(i=0; i<arr.length; i++){
            if(arr[i] == element){
                index = i;
                break;
            }
        }
        System.out.println("Index of "+element+" is : "+index);
    }
}
