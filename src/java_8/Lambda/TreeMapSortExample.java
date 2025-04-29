package java_8.Lambda;

import java.util.TreeMap;

public class TreeMapSortExample {
    public static void main(String[] args) {
        TreeMap<Integer,String> m= new TreeMap<>((a,b)->(a>b)? -1:(a<b)?1:0);
        m.put(1, "Apple");
        m.put(4, "Mango");
        m.put(5, "Orange");
        m.put(2, "Banana");
        m.put(3, "Grapes");

        System.out.println(m);
    }
}
