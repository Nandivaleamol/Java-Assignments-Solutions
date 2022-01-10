package Java_09_Abstract;

/*
3. Create an instance for the child class in child class and call abstract methods
 */
abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelePhone extends TelePhone{

    void playMusic(){
        System.out.println("Play Music...");
    }
    void recVideo(){
        System.out.println("Record Video...");
    }
    @Override
    void ring(){
        System.out.println("Phone ringing...!");
    }

    @Override
    void lift() {
        System.out.println("Lifting Call...");
    }

    @Override
    void disconnect() {
        System.out.println("Call disconnecting...!");
    }

}
public class Problem03 {
    public static void main(String[] args) {

        //creating instance of child class
        TelePhone redmi = new SmartTelePhone();

        // calling abstract methods
        redmi.ring();
        redmi.lift();
        redmi.disconnect();

    }
}
