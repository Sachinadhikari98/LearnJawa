import javax.swing.*;
import java.awt.*;

public class PanelEx {
    static void main(String[] args){
        JFrame f1=new JFrame("Panel Example");
        f1.setSize(400,400);
        f1.setLayout(null);
        JPanel p1=new JPanel();
        p1.setBounds(0,0,200,200);
        p1.setLayout(new FlowLayout());
        p1.setBackground(Color.gray);
        JLabel l1=new JLabel("Enter num: ");
        l1.setFont(new Font("Elephant",Font.BOLD,20));
        l1.setForeground(Color.black);
        p1.add(l1);
        f1.add(p1);
        f1.setVisible(true);

    }
}
