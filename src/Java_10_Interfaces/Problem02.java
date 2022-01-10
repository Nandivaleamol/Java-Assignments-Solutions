package Java_10_Interfaces;

/*
    2. Create an interface with two methods, but implement only one in a class. Call the
       method implemented.
 */
interface Student{
    void setDetails(String name, int rollNo);
    void printDetails();

}
class Student2 implements Student{
    String name;
    int rollNo;
    @Override
    public void setDetails(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public void printDetails() {
        System.out.println("Name is : "+name);
        System.out.println("Roll No is : "+rollNo);
    }
}
public class Problem02 {
    public static void main(String[] args) {

        Student2 student = new Student2();
        student.setDetails("Amol",1234);
        student.printDetails();
    }
}
