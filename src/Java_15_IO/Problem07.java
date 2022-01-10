package Java_15_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//7. Read text from a .txt file using BufferedReader
public class Problem07 {
    public static void main(String[] args) {

        try{
            // Make a file object
            File file = new File("name3.txt");

            //get data from this file using a file reader
            FileReader fr = new FileReader(file);

            // To store the contents read via File Reader
            BufferedReader br = new BufferedReader(fr);

            //Read br and store a line in 'data', print data
            String data;
            while(br.readLine() != null){
                data = br.readLine();
                System.out.println(data);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
