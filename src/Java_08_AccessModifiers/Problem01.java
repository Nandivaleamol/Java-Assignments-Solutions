package Java_08_AccessModifiers;

/*
    1. Create a class with PRIVATE fields, private method and a main method. Print the fields
    in main method. Call the private method in main method.
    Create a sub class and try to access the private fields and methods from sub class.
 */
class Bank{
    private int uId;
    private String uName;
    private String pass;

    private void printUserDet(int uId, String uName, String pass){
        this.uId = uId;
        this.pass = pass;
        this.uName = uName;
        System.out.println("User Id : "+uId);
        System.out.println("User Name : "+uName);
        System.out.println("User Pass : "+pass);
    }

}
class SubBank extends Bank{

    private void printUserDet(int uId){

       // this.uId = uId; cannot access because uiD is private data member of class bank
    }

}
public class Problem01 {
    public static void main(String[] args) {

        // Creating object of class Bank
        Bank bank1 = new Bank();

        //bank1.printUserDet(123,"Amol","User123"); // throws an error because printUserDet() is private


    }
}
