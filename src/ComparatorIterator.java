import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class ComparatorIterator {
    static void main(String[] args) {
        ArrayList<Integer> i1=new ArrayList<>();
        i1.add(1);
        i1.add(15);
        i1.add(8);
        i1.add(16);
        i1.add(20);
        Iterator<Integer> it1=i1.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
        Collections.sort(i1, new Comparator<Integer>() {
            @Override
            public int compare(Integer a1, Integer a2) {
                return a1-a2;
            }
        });
        System.out.println(i1);
    }
}
