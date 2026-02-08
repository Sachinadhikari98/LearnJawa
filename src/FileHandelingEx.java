
import java.io.*;

public class FileHandelingEx {
    static void main(String[] args) throws Exception{
        FileOutputStream fo=new FileOutputStream("sachin.txt");
        fo.write(65);
        fo.write(110);
        fo.write(117);
        fo.write(112);
        fo.close();
        FileInputStream fi=new FileInputStream("sachin.txt");
        int c;
        while((c=fi.read())!=-1){
            System.out.print((char)c);
        }
    }
}
