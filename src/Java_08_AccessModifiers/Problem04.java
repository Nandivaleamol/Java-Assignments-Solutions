package Java_08_AccessModifiers;

/* 4. Create a class with PUBLIC fields and methods.
        Access the public methods and fields from any class in the same package or different
        package

        ==> public is access modifier which is access all packages
 */

class Student{
    public static String clgName = "VPCSCI";
    public String name;
    public String studClass ="TYBCA";
    public int rollNo;
    public int age;

    public void getStudInfo(String name, String studClass, int rollNo, int age){
        this.name = name;
        this.studClass = studClass;
        this.rollNo = rollNo;
        this.age = age;
    }
    public void printStudInfo(){
        System.out.println("Student name is : "+name);
        System.out.println("Student class is : "+studClass);
        System.out.println("Student rollNo is : "+rollNo);
        System.out.println("Student age is : "+age);
        System.out.println("------------------------------------------------------------");
    }
}
public class Problem04 {
    public static void main(String[] args) {

        String clg = Student.clgName;
        System.out.println("College Name is :"+clg);
        //Creating object of Student Class
        Student student1 = new Student();

        // Getting student information
        student1.getStudInfo("Amol","TYBCA",1335,22);

        // printing student information
        student1.printStudInfo();

        student1.getStudInfo("Suraj","TYBCA",1319,21);
        student1.printStudInfo();

    }
}
