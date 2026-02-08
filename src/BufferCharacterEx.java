import java.io.*;

public class BufferCharacterEx {
    static void main(String[] args) throws Exception{
        FileWriter fw=new FileWriter("ram.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("Sachin");
        bw.newLine();
        bw.write("Ram");
        bw.close();
        FileReader fr=new FileReader("ram.txt");
        BufferedReader br=new BufferedReader(fr);

        String c;
        while((c=br.readLine())!=null){
            System.out.println(c);
        }
    }
}
