package multithreading;

class MyThread extends Thread
{
    @Override
    public void run() {
        System.out.println("Thread running via Thread subclass");
    }
}
public class ThreadExample {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
