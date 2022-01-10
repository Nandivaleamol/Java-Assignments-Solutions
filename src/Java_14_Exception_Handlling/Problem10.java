package Java_14_Exception_Handlling;

//10. Write a program to generate ClassNotFoundException
public class Problem10 {
    public static void main(String[] args) {

        try{
            Class.forName("com.codewithharry.tryCatch");
            ClassLoader.getPlatformClassLoader().loadClass("com.codewithharry.tryCatch");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
