import javax.swing.*;
import java.awt.*;

public class Table {
    static void main(String[] args){
        JFrame f1=new JFrame("table");
        f1.setSize(300,300);
        f1.setLayout(new FlowLayout());
        String []row={"ID","Name","Address"};
        String [][]cols={{"1","Ram","Kalanki"},{"2","Sachin","Dahachowk"},{"3","Samir","Pulmuni"}};
        JTable t1=new JTable(cols,row);
        JScrollPane p1=new JScrollPane(t1);
        f1.add(p1);
        f1.setVisible(true);
    }
}
