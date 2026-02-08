import java.io.FileReader;
import java.io.FileWriter;

public class CharacterEx {
    static void main(String[] args) throws Exception{
        FileWriter fw=new FileWriter("ram.txt");
        fw.write("Sachin");
        fw.close();
        FileReader fr=new FileReader("ram.txt");
        int c;
        while((c=fr.read())!=-1){
            System.out.println((char)c);
        }
    }
}
