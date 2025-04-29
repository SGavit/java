package Java;
/* Class Example
class Test<T>{
    T obj;
    Test(T obj)
    {
        this.obj = obj;
    }

    public T getObject() {
        return this.obj;
    }
}*/
public class GenericDemo {
//    Generic method example
    static <T> void genricDispaly(T ele)
    {
        System.out.println(ele.getClass().getName());
    }
    public static void main(String[] args) {

        genricDispaly(12);
        genricDispaly("Shalim");
        genricDispaly(1.0f);

    }
}
