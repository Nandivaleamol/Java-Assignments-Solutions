package Java_12_Constructor;

//5. Try to call the constructor multiple times with the same object
public class Problem05 {
    Problem05(){
        System.out.println("i am non parameterized constructor");
    }
    Problem05(int a){
        System.out.println("I am int return type one argument constructor");
    }
    Problem05(String str){
        System.out.println("I am String return type constructor");
    }

    public static void main(String[] args) {

        Problem05 p = new Problem05();

       // Problem05 p = new Problem05(18); //Throw an error

        //Problem05 p = new Problem05("Hello"); // throw an error
    }
}
