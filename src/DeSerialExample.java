import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialExample {
static void main(String[] args) throws Exception{
    FileInputStream fis=new FileInputStream("student.txt");
    ObjectInputStream ois=new ObjectInputStream(fis);
    Students s1=(Students)ois.readObject();
    System.out.println(s1.name+" "+s1.roll);
}
}
