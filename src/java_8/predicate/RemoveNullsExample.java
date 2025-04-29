package java_8.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class RemoveNullsExample {
    public static void main(String[] args) {
        //Initial list with null values
        List<String> list = new ArrayList<>
        (Arrays.asList("Ankit", "Rahul", null, "Amit", null, "Sunil"));

        // ---- Method 1 : Using Iterator ------
        List<String> it = new ArrayList<>(list);
        Iterator<String> iterator = it.iterator();

        while(iterator.hasNext()){
            if(iterator.next() == null){
                iterator.remove();
            }
        }

        System.out.println("After removing nulls using Iterator: " + it);

        //---- Method 1 : Using Iterator ------
        List<String> lP = new ArrayList<>(list);
        Predicate<String> isNull = Objects::isNull;   // s-> s == null

        //Collection.removeIf(Predicate<? super E> filter) Removed the Nulls from the list which predicte returns true
        lP.removeIf(isNull);
        System.out.println("After removing nulls using Predicate: " + lP);
 //----------------------------------------------------------------------------------

        Predicate<String> isNull1 = item -> Objects.isNull(item); // s-> s == null
        list.removeIf(isNull1);

        System.out.println("After removing nulls using Predicate: " + list);

    }
}
