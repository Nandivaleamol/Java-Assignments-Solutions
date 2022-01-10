package Java_15_IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//6. Write a program to write text to .txt file using FileWriter
public class Problem06 {
    public static void main(String[] args) {
        File file = new File("name1.txt");
        try{
            FileWriter fileWriter = new FileWriter("name1.txt");

            fileWriter.write("This is our first java course\n Okey now bye!");
            fileWriter.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
