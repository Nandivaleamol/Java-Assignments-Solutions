package Java_10_Interfaces;
/*
1. Create an interface with static final variable
 */
interface Q{
    public static final int a = 19;
    public static final String str = "Hello";
}
class R implements Q{

}
public class Problem11 {
    public static void main(String[] args) {

        R r = new R();
        int b = r.a;
        System.out.println(b);

        String s = r.str;
        System.out.println(s);
    }

}
