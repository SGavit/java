package generic;
class GenericConstructor1 {
    private double v;

    <T extends Number> GenericConstructor1(T t)
    {
        v = t.doubleValue();
    }
    void show()
    {
        System.out.println("v: "+v);
    }
}
class GenericConstructor{
    public static void main(String[] args) {
        System.out.println("Number to Double Conversion:");

        GenericConstructor1 obj1
                = new GenericConstructor1(10);
        GenericConstructor1 obj2
                = new GenericConstructor1(136.8F);
        obj1.show();
        obj2.show();
    }
}
