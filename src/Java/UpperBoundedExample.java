package Java;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedExample {
    public static void printList(List<? extends Number> list)
    {
        for(Number num : list)
        {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10, 20 , 30);
        List<Double> doubles = Arrays.asList(1.5, 2.5, 3.5);

        printList(integers); // Allowed
        printList(doubles); // Allowed

    }
}
