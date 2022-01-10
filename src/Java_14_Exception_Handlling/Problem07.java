package Java_14_Exception_Handlling;

//7. Write a program with finally block
public class Problem07 {
        public static int greet(){
            try{
                int a = 50;
                int b = 0;
                int c = a/b;
                return c;
            }
            catch(Exception e){
                System.out.println(e);
            }
            finally{
                System.out.println("Cleaning up resources...\nThis is the end of this function.");
            }
            return -1;
        }
        public static void main(String args[]){
            int k = greet();
            System.out.println(k);
        }

}
