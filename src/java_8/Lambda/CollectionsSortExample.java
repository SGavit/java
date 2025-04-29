package java_8.Lambda;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortExample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(20);
        al.add(10);
        al.add(30);
        //Sorting in descending other
        Collections.sort(al,(a1,a2)->(a1 > a2)? -1: (a1 < a1)?1:0);
        System.out.println(al);
        
    }
}
