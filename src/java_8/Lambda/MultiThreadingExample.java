package java_8.Lambda;

public class MultiThreadingExample {
    public static void main(String[] args) {
        Runnable r = ()->{
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName);
        };
        Thread thread1 = new Thread(r);
        Thread thread2 = new Thread(r);

        thread1.start();
        thread2.start();
    }
}
