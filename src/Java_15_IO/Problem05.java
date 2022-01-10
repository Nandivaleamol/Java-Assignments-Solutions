package Java_15_IO;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//5. Write a program to read text from .txt file using FileReader
public class Problem05 {
    public static void main(String[] args) {

        File myFile = new File("name3.txt");

        try{
            Scanner sc = new Scanner(myFile);

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
