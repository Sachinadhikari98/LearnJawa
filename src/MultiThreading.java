public class MultiThreading implements Runnable{
    static void main(String[] args) {
        MultiThreading mt1=new MultiThreading();
        Thread t1=new Thread(mt1);
        Thread t2=new Thread(mt1);
        t1.setName("Thread 1");
        t1.setName("Thread 2");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is running");
    }
}
