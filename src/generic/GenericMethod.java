package generic;

public class GenericMethod {
    static <T> void dispaly(T element)
    {
        System.out.println(element.getClass().getName()+"="+element);
    }

    public static void main(String[] args) {
        dispaly(20);
        dispaly("String");
        dispaly(1.0);
        dispaly(0.123f);
        dispaly('A');
        dispaly(true);
        dispaly((short)5);
        dispaly((byte)10);
    }
}
