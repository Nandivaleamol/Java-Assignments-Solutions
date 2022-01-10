package Java_15_IO;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//3. Read text from a .txt file using BufferedInputStream
public class Problem03 {
    public static void main(String[] args) {

        File file = new File("name3.txt");
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;

        try{
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);

            while(dis.available()!=0){
                System.out.println(dis.readLine());
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try {
                fis.close();
                bis.close();
                dis.close();

            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
