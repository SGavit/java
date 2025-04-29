package generic;

public class Area<T> {
    private T t;
    public void add(T t)
    {
        this.t = t;
    }
    public T get(){
        return t;
    }

    public static void main(String[] args) {
        Area<Integer> rectangle = new Area<Integer>();
        Area<Double> circle = new Area<Double>();

        rectangle.add(10);
        circle.add(2.3);
        System.out.println(rectangle.get());
        System.out.println(circle.get());
    }
}
