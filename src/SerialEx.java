import java.io.*;
class Students implements Serializable{
    String name;
    int roll;
    public Students(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
}

public class SerialEx {
    static void main(String[] args) throws Exception{
        Students s1=new Students("Ram",20);
        FileOutputStream fo=new FileOutputStream("student.txt");
        ObjectOutputStream os=new ObjectOutputStream(fo);
        os.writeObject(s1);
        os.close();
    }
}
