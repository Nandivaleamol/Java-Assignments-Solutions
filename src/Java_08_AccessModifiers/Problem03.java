package Java_08_AccessModifiers;
/*
    3. Create a class with PROTECTED fields and methods. Access these fields and methods
    from any other class in the same package.
    Also, Access the PROTECTED fields and methods from child class located in a different
    package
 */

//==> protected keyword is only access the same package.
class Animal{
    protected String name;
    protected int legs;
    protected String kingdom;
    protected String foodType ="Non-vegeterian";

    protected void printAnimalDetails(String name, String kingdom, int legs){
        this.name = name;
        this.kingdom = kingdom;
        this.legs = legs;

        System.out.println("Animal name is : "+name);
        System.out.println("Animal kingdom is : "+kingdom);
        System.out.println("Animal legs : "+legs);
    }
    protected void walk(int legs){
        this.legs = legs;
        System.out.println("i am walking on "+ legs+" legs!");
    }
    protected void eat(String foodType){
        this.foodType = foodType;
        System.out.println("I am "+foodType);
    }
}

class Birds extends Animal{
    protected void birdsDetails(String name, String kingdom, int legs){
        this.name = name;
        this.kingdom = kingdom;
        this.legs = legs;

        System.out.println("Bird name is : "+name);
        System.out.println("Bird kingdom is : "+kingdom);
        System.out.println("Bird legs : "+legs);
    }

    @Override
    protected void walk(int legs){
        this.legs = legs;
        System.out.println("i am walking on "+ legs+" legs!");
    }
    @Override
    protected void eat(String foodType){
        this.foodType = foodType;
        System.out.println("I am "+foodType);
    }
}
public class Problem03 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();

        animal1.printAnimalDetails("Tiger","Animalia",4);
        animal1.walk(4);
        animal1.eat("Non-Vegeterian");

        Birds bird1 = new Birds();
        bird1.birdsDetails("Parrot","Animalia",2);
        bird1.eat("Non-vegeterian");
        bird1.walk(2);
    }
}
