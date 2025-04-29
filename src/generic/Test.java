package generic;

class Test1<T> {
    T obj;
    Test1(T obj)
    {
        this.obj = obj;
    }
    public T getObject(){
        return this.obj;
    }
}
class Test
{
    public static void main(String[] args) {
        Test1<Integer> a=new Test1<Integer>(20);
        System.out.println(a.obj);
        Test1<String> b=new Test1<String>("Shalim");
        System.out.println(b.obj);

    }
}
