package Java_04_Array;

//7. Write a function to insert an element at a specific position in the array
public class Problem07 {
    public static void inserElement(int a,int b){
        int arr[] = {23,34,25,12,16,18};
        System.out.println("Array length: "+arr.length);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        arr[a] = b;

        System.out.println("After insert element to specific position: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }

    }
    public static void main(String[] args) {

        inserElement(2,8);
        inserElement(1,10);



    }
}
