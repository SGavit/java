package multithreading;
class SharedResource{
    volatile boolean flag = false;

    void setFlagTrue(){
        flag = true;
    }
}
class Worker extends Thread{
    SharedResource resource;
    Worker(SharedResource resource) {
        this.resource = resource;
    }
    public void run()
    {
        while(!resource.flag){
            //Waiting for flag to become ture
        }
        System.out.println("Flag changed! Worker thread exiting.");
    }
}
public class VolatileExample extends Thread{

    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();
        Worker worker = new Worker(resource);
        worker.start();

        Thread.sleep(1000);
        resource.setFlagTrue();
        worker.join();
    }

}

