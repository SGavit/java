package java_8.Lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        //traversing using Iterator
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            Integer i = itr.next();
            System.out.println("Iterator Value ::" + i);
        }

        //traversing through forEach method of Iterable with anonymous class
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("forEach anonymous class value ::" + integer);
            }
        });

        //traversing with Consumer interface implementation
        MyConsumer action = new MyConsumer();
        list.forEach(action);

    }
}

    //Consumer implementation can be reused
    class MyConsumer implements Consumer<Integer>{
        @Override
        public void accept(Integer integer) {
            System.out.println("Consumer impl Value ::"+integer);
        }
}


