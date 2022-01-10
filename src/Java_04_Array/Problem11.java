package Java_04_Array;

import java.util.Arrays;
import java.util.HashSet;

//11. Write a program to find the common values between two arrays
public class Problem11 {
    public static void main(String[] args) {

        String [] arr1 = {"Java","Python","C#","C++","SQL","MongoDB"};
        String [] arr2 = {"MySQL","MongoDB","SQL","SQLite","Oracle","PostgreSQL","Java"};

        System.out.println("Array1 : "+ Arrays.toString(arr1));
        System.out.println("Aarray2 : "+Arrays.toString(arr2));

        HashSet <String> set = new HashSet<String>();

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i].equals(arr2[j])){
                    set.add(arr1[i]);
                }
            }
        }
        System.out.println("Common element Are : "+(set));
    }
}
