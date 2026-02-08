import java.io.*;

public class BufferEx {
    static void main(String[] args) throws Exception{
        FileOutputStream fo=new FileOutputStream("sachin.txt");
        BufferedOutputStream bo=new BufferedOutputStream(fo);
        bo.write(65);
        bo.write(110);
        bo.write(117);
        bo.write(112);
        bo.close();
        FileInputStream fi=new FileInputStream("sachin.txt");
        BufferedInputStream bi=new BufferedInputStream(fi);
        int c;
        while((c=fi.read())!=-1){
            System.out.print((char)c);
        }
    }
}
