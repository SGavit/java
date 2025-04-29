package multithreading;
class Counter{
    private int c = 0;

    public synchronized void inc()
    {
        c++;
    }

    public synchronized int get(){
        return c;
    }
}
public class SynchronizedExample {
    public static void main(String[] args) {
        Counter cnt  = new Counter();

        Thread t1 = new Thread(()->{
            for(int i = 0; i< 10;i++){
                cnt.inc();

            }

        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                cnt.inc();

            }
        });

        t1.start();
        t2.start();


        System.out.println("Counter: " + cnt.get());

    }
}
