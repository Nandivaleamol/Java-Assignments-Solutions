package Java_15_IO;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

//4. Write text to a .txt file using BufferedOutputStream
public class Problem04 {
    public static void main(String[] args) throws Exception{

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("name3.txt"));

        bos.write("Hellow".getBytes(StandardCharsets.UTF_8));
        bos.write("\nWorld".getBytes());

        bos.write(65);
        bos.close();
    }
}
