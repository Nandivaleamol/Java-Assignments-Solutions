package Java_09_Abstract;
//1. Create an abstract class with abstract and non-abstract methods.

abstract class Phone{

    //non-abstract methods
    public void call(){
        System.out.println("Calling Friends...!");
    }
    public void camera(){
        System.out.println("The taking photo using 64mp camera...!");
    }
    // abstract methods
    abstract void ringtone();
    abstract void musicOff();
    abstract void musicOn();
    abstract void switchOff();
    abstract void switchOn();

}
class Samsung extends Phone{

    @Override
    void ringtone() {
        System.out.println("Set ringtone...!");
    }

    @Override
    void musicOff() {
        System.out.println("Stop Music...!");
    }

    @Override
    void switchOn() {
        System.out.println("Phone's switch On...!");
    }

    @Override
    void musicOn() {
        System.out.println("Play Music...!");
    }

    @Override
    void switchOff() {
        System.out.println("Phone's switch Off...!");
    }
}
public class Problem01 {
    public static void main(String[] args) {

        // creating class Samsung objects
        Samsung samsung1 = new Samsung();

        samsung1.musicOn();
        samsung1.switchOn();
        samsung1.switchOff();
        samsung1.camera();
        Phone phone = new Samsung() ;
        phone.camera();
    }
}
