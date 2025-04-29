package java_8.method_ref;

import java.util.function.BiFunction;

import javax.sound.midi.spi.MidiFileWriter;

public class MethodRefExample {
    public static <T> T mergeThings(T a, T b,
                                    BiFunction<T,T,T> merger) 
    {
        return merger.apply(a, b);
    }


    public static String appendStrings(String  a, String b){
        return a + b;
    }
  
    public String appendStrings2(String a, String b) {
        return a + b;
    }


public static void main(String[] args) {
    
    MethodRefExample obj = new MethodRefExample();

    // Calling the method mergeThings with a lambda expression
    System.out.println(MethodRefExample.mergeThings("Hello", 
                                                    "World!", 
                                                    (a,b)->a+b)); 
    
    // Reference to a static method
    System.out.println(MethodRefExample.mergeThings("Hello", 
                                                    "World!", //Using method reference
                                                    MethodRefExample::appendStrings));

    // Reference to an instance method of a particular object 
    System.out.println(MethodRefExample.mergeThings("Hello",
                                                    "Word",
                                                    obj::appendStrings2));

    // Reference to an instance method of an arbitrary object of a particular type
    System.out.println(MethodRefExample.mergeThings("Hello",
                                                    "World!",
                                                    String::concat)); //Using lambda expression

}
}
