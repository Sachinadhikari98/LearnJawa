public class SynchronizedMethod implements Runnable{
    public synchronized void display(){
        System.out.println("hello");
        synchronized (this){
            System.out.println("via block");
        }
    }
    static void main(String[] args){
        SynchronizedMethod s1=new SynchronizedMethod();
        Thread t1=new Thread(s1);
        Thread t2=new Thread(s1);
        t1.start();
        t2.start();
    }
    public void run(){
        SynchronizedMethod s=new SynchronizedMethod();
        s.display();
    }
}
