package Java_15_IO;

import java.io.FileOutputStream;
import java.io.IOException;

//2. Write a program to write text to .txt file using OutputStream
public class Problem02 {
    public static void main(String[] args) throws IOException {

        int i;

        // creates a file output stream object
        FileOutputStream fout = new FileOutputStream("name3.txt",true);

        //we need to transfer this string to files
        String st = "TATA";

        char ch[] = st.toCharArray();
        for (i=0; i<st.length(); i++){

            //we will write the string by writing each character one by one to file
            fout.write(ch[i]);
        }
        /*
        by doing fout.close() all the changes which have been made till now in RAM
        had been now saved to hard disk
         */
        fout.close();

    }
}
