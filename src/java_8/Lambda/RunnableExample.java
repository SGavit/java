package java_8.Lambda;

public class RunnableExample {
    public static void main(String[] args) {
        Runnable myThread = () ->{
            Thread.currentThread().setName("My Thread");
            System.out.println(Thread.currentThread().getName()+" is running");
        };

        Thread run = new Thread(myThread);
        run.start();
    }
}
