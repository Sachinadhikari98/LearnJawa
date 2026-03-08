import java.util.Dictionary;
import java.util.Hashtable;
enum Days{ab,ad,jd,uh,hd};
public class DictionaryExample {
    static void main(String[] args) {
        Dictionary<String,String> d1=new Hashtable<>();
        d1.put("BCA","Bernhardt");
        d1.put("Chunab","Balen");
        System.out.println(d1.get("Chunab"));
    }
}
