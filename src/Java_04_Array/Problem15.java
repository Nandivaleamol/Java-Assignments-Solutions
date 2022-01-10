package Java_04_Array;

//15. Write a method to find number of even number and odd numbers in an array
public class Problem15 {
    public static void main(String[] args) {

        int array[] ={10,38,27,17,22,19,18};
        int temp [] = array;

        System.out.print("Even numbers In Arrays Are: ");
        for(int i=0; i<temp.length; i++){
            if(temp[i]%2==0){
                System.out.print(temp[i]+" ");
            }


        }
        System.out.println();
        System.out.print("Odd Numbers In Arrays Are: ");
        for(int j=0; j<array.length; j++){
            if(array[j]%2==1){
                System.out.print(array[j]+" ");
            }
        }
    }
}
