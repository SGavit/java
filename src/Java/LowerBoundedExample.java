package Java;

import java.util.List;

public class LowerBoundedExample {
    public static void addNumber(List<? super Integer> list)
    {
        list.add(100);
        list.add(200);
    }
}
