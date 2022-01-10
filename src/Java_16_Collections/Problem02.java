package Java_16_Collections;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;

/*
2. Create a HashMap with at least 10 key value pairs of the Student ID and Name
    Insert a Key value mapping into the map
    Fetch the value of a Key
    Create a clone/copy of HashMap
    Check if the given Key is in the Map
    Check if the value is in the Map
    Check if the map is empty
    Print the size of the Map to the console
    Print all the Keys of the map to the console
    Print all the Keys of the map to the console
    Remove a specific Key-value pair
    Copy all the elements of the Map to another Map
 */
public class Problem02 {
    public static void main(String[] args) {

        Map<Integer,String> student = new HashMap<>();

        student.put(1,"Amol");
        student.put(2,"Aman");
        student.put(3,"Suraj");
        student.put(4,"Snehal");
        student.put(5,"Sakshi");
        student.put(6,"Pratiksha");
        student.put(7,"Prajakta");
        student.put(8,"Rohan");
        student.put(9,"Harry");
        student.put(10,"Aakash");

        //Fetch the value of a Key
        System.out.println(student.get(1));

        //Create a clone/copy of HashMap
        //Shallow clone
        HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) ((HashMap<Integer, String>) student).clone();
        System.out.println(clonedMap);

        //Check if the given Key is in the Map
        System.out.println(student.containsKey(7));

        //Check if the value is in the Map
        System.out.println(student.containsValue("Shivani"));

        //Check if the map is empty
        System.out.println(student.isEmpty());

        //Print the size of the Map to the console
        System.out.println(student.size());

        //Print all the Keys of the map to the console
        System.out.println(student.keySet());

        //Print all the Values of the map to the console
        System.out.println(student.values());

        //Remove a specific Key-value pair
        student.remove(9);
        System.out.println(student);

        //Copy all the elements of the Map to another Map
        Map<Integer,String> stud = new HashMap<>();

        stud.putAll(student);

        System.out.println(stud);
    }
}
