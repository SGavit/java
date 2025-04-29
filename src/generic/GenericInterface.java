package generic;

interface MinMax<T extends Comparable<T>>{
    T mix();
    T max();
}

class MyClass <T extends Comparable<T>> implements MinMax<T>{

    T[] values;
    MyClass(T[] obj)
    {
        values = obj;
    }

    public T mix() {
        T o1 = values[0];

        // Iterating via for loop over elements using
        // length() method to get access of minimum element
        for (int i = 1; i < values.length; i++) {
            if (values[i].compareTo(o1) < 0) {
                System.out.println(values[i].compareTo(o1));
                o1 = values[i];
            }
            System.out.println(values[i].compareTo(o1));
        }

        // Return the minimum element in an array
        return o1;
    }

    @Override
    public T max() {
        return null;
    }
}
public class GenericInterface {
    public static void main(String[] args) {
        Integer arr[] = { 3, 6, 2, 8, 6 };
        MyClass<Integer> obj1 = new MyClass<>(arr);
        System.out.println("Minimum value: " + obj1.mix());
    }
}
