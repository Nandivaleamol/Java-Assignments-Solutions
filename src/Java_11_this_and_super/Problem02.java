package Java_11_this_and_super;

//2. Print the fields/instance members of the parent class using super
class Animal{
    String color ="white";
}
class Dog extends Animal{
    String color = "black";
    void printColor(){
        System.out.println("This color is getting in a Dog Class: "+color);//prints color of Dog class
        System.out.println("This color getting in a Animal Class: "+super.color); //prints color of Animal class
    }
}
public class Problem02 {
    public static void main(String args[]){
        Dog d = new Dog();

        d.printColor();
    }
}
