import javax.swing.*;
import java.awt.*;

public class ListExample {
    static void main(String[] args){
        JFrame f1=new JFrame("GUI");
        f1.setSize(300,300);
        f1.setLayout(new FlowLayout());
        String []weeks={"Sunday","Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday"};
        JComboBox c1=new JComboBox(weeks);
        f1.add(c1);
        JList l1=new JList(weeks);
        f1.add(l1);
        f1.setVisible(true);
    }
}
