public class ThreadImple implements Runnable{
    static void main(String[] args) throws Exception{
        ThreadImple i1=new ThreadImple();
        Thread t1=new Thread(i1);
        t1.start();
        System.out.println("Running via CPU");
    }
    public void run(){
        System.out.println("Running via thread");
    }
}
