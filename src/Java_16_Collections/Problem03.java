package Java_16_Collections;

import java.util.HashMap;
import java.util.Map;

/*3. Create a HashSet with at least 10 elements of type String
     Write program covering all the operations of HashSet
 */
public class Problem03 {
    public static void main(String[] args) {

        Map<String, String> country = new HashMap<>();

        //put()
        country.put("IN","India");
        country.put("US","United States");
        country.put("RS","Russia");
        country.put("JP","Japan");
        country.put("Ml","Mali");
        country.put("PK","Pakistan");
        country.put("CN","China");
        country.put("AF","Afghanistan");
        country.put("SK","South Korea");
        country.put("TN","Taiwan");

        //print all key-pairs
        System.out.println(country);

        //printing all keys
        System.out.println(country.keySet());

        //printing all values
        System.out.println(country.values());

        // get()
        System.out.println(country.get("IN"));

        //size()
        System.out.println(country.size());

        // isEmpty()
        System.out.println(country.isEmpty());

        // .containsKey()
        System.out.println(country.containsKey("US"));

        // .containsValue()
        System.out.println(country.containsValue("Russia"));

        //putIfAbsent
        System.out.println(country.putIfAbsent("BN","Bangladesh"));

        // remove()
        System.out.println(country.remove("CN"));

        //remove()
        System.out.println(country.remove("AF","Afghanistan"));

        // replace()
        System.out.println(country.replace("PK","Pak"));

        //forEach loop
        for (String cn: country.keySet()) {
            System.out.println(cn);
        }
    }
}
