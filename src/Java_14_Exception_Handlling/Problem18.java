package Java_14_Exception_Handlling;

//17. Write a program to generate StringIndexOutOfBoundsException
public class Problem18 {
    public static void main(String[] args) {

        String str = "Hello World";
        try{
            //trying to access at negative index
            char charAtNegativeIndex = str.charAt(-1);

            // Trying to access at index equal to size of the string
            char charAtLengthIndex = str.charAt(11);
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException");
            e.printStackTrace();
        }
    }
}
