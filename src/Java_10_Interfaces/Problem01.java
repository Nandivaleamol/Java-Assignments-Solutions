package Java_10_Interfaces;

/*1. Create an interface with only one method and implement it in a class. Call the method
     implemented.
 */
interface TvRemote{
    void SwitchOn();
}
class Tv implements TvRemote{

    @Override
    public void SwitchOn() {
        System.out.println("Switch On");
    }

}
public class Problem01 {
    public static void main(String[] args) {
        Tv tv = new Tv();

        tv.SwitchOn();
    }
}
