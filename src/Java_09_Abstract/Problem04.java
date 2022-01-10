package Java_09_Abstract;

/*
   4. Create an instance for the child class in child class and call non-abstract method
 */
abstract class RemoteTV{
    abstract void onTV();
    abstract void OffTV();
    void playMusic(){
        System.out.println("Play Music...");
    }
    void stopMusic(){
        System.out.println("Stop music...");
    }
}
class SmartRemoteTV extends RemoteTV{
    @Override
    void onTV() {
        System.out.println("TV On");
    }

    @Override
    void OffTV() {
        System.out.println("TV Off");
    }

}
public class Problem04 {
    public static void main(String[] args) {

        // creating object of child class
        SmartRemoteTV tv = new SmartRemoteTV();

        //calling non-abstract method
        tv.stopMusic();
        tv.playMusic();
    }
}
