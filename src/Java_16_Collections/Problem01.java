package Java_16_Collections;
import java.util.ArrayList;
import java.util.List;

/*
1. Create an ArrayList of type String with 10 string elements. Add 10 string elements to
        ArrayList and perform the below operations
        Add an element to the ArrayList
        Iterate through the ArrayList by using Iterator object
        Add an element at a specific index
        Remove an element from the ArrayList, Remove at an index
        Update the element at a specific index
        Check the element is present at a particular index
        Get an element at a particular index
        Find out the size of the ArrayList
        Check the given element is present in the ArrayList
        Remove all elements of the ArrayList
 */
public class Problem01 {
    public static void main(String[] args) {

        System.out.println("Chapter 16 Collection Practice Problem 01 ArrayList");

        // Creating ArrayList object
        ArrayList ar = new ArrayList();

        //Add an element to the ArrayList
        ar.add("Amol");
        ar.add("Suraj");
        ar.add("Rohan");
        ar.add("Sagar");
        ar.add("Pranav");
        ar.add("Aakash");
        ar.add("Sachin");
        ar.add("Vilas");
        ar.add("Mahesh");
        ar.add("Rahul");

        System.out.println(ar.size());

        //Iterate through the ArrayList by using Iterator object
        for (Object item : ar){
            System.out.println(item);
        }
        System.out.println();

        //Add an element at a specific index
        ar.add(2,"Snehal");

        //Remove an element from the ArrayList, Remove at an index
        ar.remove(3);

        //Update the element at a specific index
        ar.add(7,"Pratiksha");

        //Check the element is present at a particular index
        System.out.println( ar.indexOf("Amol"));

        //Get an element at a particular index
        System.out.println(ar.get(4));

        //Find out the size of the ArrayList
        System.out.println(ar.size());

        //Check the given element is present in the ArrayList
        System.out.println(ar.indexOf(6));

        //Remove all elements of the ArrayList

        ar.removeAll(ar);

        System.out.println(ar);
    }
}
