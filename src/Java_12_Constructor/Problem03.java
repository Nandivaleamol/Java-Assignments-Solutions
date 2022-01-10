package Java_12_Constructor;

//3. Apply private, public, protected and default access modifiers to the constructor

public class Problem03 {

    Problem03(){
        System.out.println("I am default access modifier constructor");
    }
    public Problem03(double d){
        System.out.println("I am public access modifier constructor.");
    }
    private Problem03(int a){
        System.out.println("I am private access modifier constructor.");
    }
    protected Problem03(String name){
        System.out.println("I am protected access modifier constructor.");
    }

    public static void main(String[] args) {

    }
}
