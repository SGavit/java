package java_8.Lambda;

import java.util.TreeSet;

public class TreeSetSortExample {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>((a,b)->a.compareTo(b));
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("D");
        ts.add("E");
        ts.add("F");
        ts.add("G");
        System.out.println(ts);

        for(String ele : ts)
        {
            System.out.println(ele+" ");
        }
    }
}
