package Java_13_Method_Overriding;

/*
3. Write two methods with the same name and same number of parameters of same type
   and call from main method

   ===> This program throws an error
 */

public class Problem03 {
    int a ;
    int b;

    void printNum(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("I am 1st method with two same data type and two parameters");
    }
//    void printNum(int b, int a){
//        this.b = b;
//        this.a = a;
//        System.out.println("I am 2nd method with two same data type and two parameters");
//    }
    public static void main(String[] args) {

        Problem03 pr = new Problem03();

        /*
        Ambiguous method call. Both printNum (int,int)in Problem03 and printNum (int, int in Problem03 match
         */
        //pr.printNum(18,10);
    }
}
