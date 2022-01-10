package Java_14_Exception_Handlling;
import  java.io.*;
import java.util.Scanner;

//11. Write a program to generate FileNotFoundException
public class Problem11 {
    public static void main(String[] args) {

      File myfile = new File("file01.txt");

      try{
          Scanner sc = new Scanner(myfile);
          while(sc.hasNextLine()){
              String line = sc.nextLine();
              System.out.println(line);
          }
      }
      catch(FileNotFoundException e){
          e.printStackTrace();
      }
    }
}
