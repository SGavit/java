package multithreading;

class MyTask implements Runnable
{
    @Override
    public void run() {
        System.out.println("Task running via Runnable");
    }
}
public class RunnableExample {
    public static void main(String[] args) {
        Thread th = new Thread(new MyTask());
        th.start();
    }
}
