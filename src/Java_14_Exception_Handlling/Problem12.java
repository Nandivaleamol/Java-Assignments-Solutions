package Java_14_Exception_Handlling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//12. Write a program to generate IOException

public class Problem12 {
    public static void main(String[] args) {

        File myfile = new File("file011.txt");
        try{
            FileWriter fileWriter = new FileWriter("file011.txt");
            fileWriter.write("This is our first java course \n okey now bye!");
            fileWriter.close();
        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
