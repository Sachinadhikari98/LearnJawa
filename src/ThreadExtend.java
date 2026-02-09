public class ThreadExtend extends Thread{
    static void main(String[] args) {
        ThreadExtend t1=new ThreadExtend();
        t1.start();
        System.out.println("Running via CPU");
    }
    public void run(){
        System.out.println("Running via thread");
    }
}
