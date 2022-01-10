package Java_04_Array;

//19. Write a function to find the missing number of sorted array of 1 to 100
public class Problem19 {
    static int arr[] = {1,3,5,33,68,49};
    public static void main(String[] args) {
        displayMissing();

    }
    static public void displayMissing(){
        System.out.print("Given arry[] : ");
        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j]+" ");
        }
        System.out.print("\nNumbers missing between 1 to 100 in array: ");

        int j=0;
        for(int i=1; i<=100; i++){
            if(j<arr.length && i==arr[j]){
                j++;
            }
            else{
                System.out.print(i+ " ");
            }
        }
    }
}
