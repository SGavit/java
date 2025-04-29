package multithreading;

class SharedResource1{
    volatile int count = 0;

    void increment(){
        count++;
    }
}
public class VolatileExample2 extends Thread {
    SharedResource1 resource;
    VolatileExample2(SharedResource1 resource) {
        this.resource = resource;
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            resource.increment();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SharedResource1 resource = new SharedResource1();

        VolatileExample2 thread1 = new VolatileExample2(resource);
        VolatileExample2 thread2 = new VolatileExample2(resource);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("Final Count: " + resource.count);
    }
}
