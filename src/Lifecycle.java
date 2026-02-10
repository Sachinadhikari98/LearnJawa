public class Lifecycle implements Runnable{
    static void main(String[] args) throws InterruptedException {
        Lifecycle c1=new Lifecycle();
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c1);
        t1.sleep(100);
        t2.wait();
        t1.start();
        t2.start();
    }
    public void run(){
        System.out.println("Hello from thread");
    }
}
