import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemListenerExample {
    static void main(String[] args){
        JFrame f1=new JFrame("ItemListener");
        f1.setSize(300,300);
        f1.setLayout(new FlowLayout());
        f1.add(new JLabel("Programming"));
        JCheckBox c1=new JCheckBox("C");
        JCheckBox c2=new JCheckBox("Java");
        JLabel l1=new JLabel();
        c1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (c1.isSelected()){
                    l1.setText("C selected");
                }else {
                    l1.setText("C Unselected");
                }
            }
        });
        c2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (c2.isSelected()){
                    l1.setText("Java Selected");
                }else {
                    l1.setText("Java UnSelected");
                }
            }
        });
        f1.add(c1);f1.add(c2);f1.add(l1);
        f1.setVisible(true);
    }
}
