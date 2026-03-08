import java.util.Random;

public class RandomNumber {
    static void main(String[] args) {
        Random r1=new Random();
        int num= r1.nextInt(10);
        System.out.println(num);
    }
}
