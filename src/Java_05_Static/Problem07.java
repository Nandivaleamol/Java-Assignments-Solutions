package Java_05_Static;

//7. Call static methods and instance methods in main method
class Phone{

    void call(){
        System.out.println("calling....!");
    }
    void music(){
        System.out.println("play music...!");
    }
    static void off(){
        System.out.println("Switch of the phone...!");
    }
    static void on(){
        System.out.println("Switch on the phone...!");
    }
}
public class Problem07 {
    public static void main(String[] args) {

        // creating class Phone new obj
        Phone phone = new Phone();

        // calling instance methods
        phone.call();
        phone.music();

        //calling static methods
        Phone.off();
        Phone.on();

    }
}
