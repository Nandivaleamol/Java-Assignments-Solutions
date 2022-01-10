package Java_12_Constructor;

/*
2. Call the constructors(both default and argument constructors) of super class from a child
   class
 */
class Car{
    Car(){
        System.out.println("I am default constructor of Class Car");
    }
    Car(String name){
        System.out.println("I am argument constructor of Class Car");
    }
}
class Truck extends Car{

    Truck(String name){
        super(name);
        System.out.println("I am default constructor of Class Truck");
    }
}
public class Problem02 {
    public static void main(String[] args) {

       // Truck t = new Car(); //throws an error

        Truck t1 = new Truck("Eicher");
    }
}
