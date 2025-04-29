package java_8.Lambda;

//Functional Interface 
@FunctionalInterface
interface Greeting{
    void sayHello(String name);
}
public class AnonymousClassExample {
    public static void main(String[] args) {
        //Anonymous class implemention of functional interface

        Greeting greeting = new Greeting() {
            @Override 
            public void sayHello(String name){
                System.out.println("Hello " + name + "!");
            }
        };
    }
}
