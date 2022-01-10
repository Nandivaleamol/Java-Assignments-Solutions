package Java_15_IO;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

//1. Write a program to read text from .txt file using InputStream
public class Problem01 {
    public static void main(String[] args) throws IOException {

        File file = new File("doc.txt");
        try(InputStream in = new FileInputStream((file))){
            int content;
            while((content = in.read())!=-1){
                System.out.println((char)content);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
