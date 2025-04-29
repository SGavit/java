package Java;
class Bound<T extends A>
{
    private T obj;

    public Bound(T obj)
    {
        this.obj=obj;
    }

    public void doRunTest(){
        this.obj.displayClass();
    }
}

class A {
    public void displayClass()
    {
        System.out.println("Inside sub class B");
    }
}
public class BoundTypesExample {
    public static void main(String[] args) {
        Bound<A> bec = new Bound<A>(new A());
        bec.doRunTest();
    }
}
