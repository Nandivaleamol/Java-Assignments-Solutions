package Java_08_AccessModifiers;

/*
    2. Create a class with DEFAULT fields and methods. Access these fields and methods
    from any other class in the same package
 */
public class Problem02 {
    String name = "NA";
    int age =23;

    void printDetails(String name, int age){
        this.name = name;
        this.age = age;

        System.out.println("Your name is : "+name);
        System.out.println("Your age is : "+age);
    }
    public static void main(String[] args) {

        Problem02 pr1 = new Problem02();

        pr1.printDetails("Amol",22);
        System.out.println(pr1.name);
        System.out.println(pr1.age);
    }
}
