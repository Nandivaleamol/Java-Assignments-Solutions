package Java_15_IO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

//8. Write text to a .txt file using BufferedWriter
public class Problem08 {
    public static void main(String[] args) {
        try {
            // create a writer
            BufferedWriter bw = Files.newBufferedWriter(Paths.get("output.txt"));

            // write text to file
            bw.write("Hey, there!");
            bw.newLine();
            bw.write("See you soon.");

            // close the writer
            bw.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
