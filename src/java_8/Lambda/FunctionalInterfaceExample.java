package java_8.Lambda;

//Functional Interface
@FunctionalInterface
interface Greetable{
    //Single abstract method
    void greet(String name);
}
public class FunctionalInterfaceExample {
    public static void main(String [] args) {
        //Using Lambda Expression
        Greetable greetable = (String name) -> {
            System.out.println("Hello " + name+
            "!");
        };
         System.out.println("---------------");
        //Use functional interface
        greetable.greet("World");
        greetable.greet("Java 8");
        System.out.println("---------------");
    }
}
