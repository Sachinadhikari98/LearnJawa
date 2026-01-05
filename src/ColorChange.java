import javax.swing.*;
import java.awt.*;

public class ColorChange {
    static void main(String[] args){
        JFrame f1=new JFrame("Styling");
        f1.setSize(400,400);
        f1.setLayout(new FlowLayout());
        f1.getContentPane().setBackground(Color.GRAY);
        JLabel l1=new JLabel("Hello");
        l1.setForeground(Color.MAGENTA);
        l1.setFont(new Font("times new roman", Font.BOLD,30));
        f1.add(l1);
        JTextField t1=new JTextField(20);
        t1.setForeground(Color.blue);
        t1.setFont(new Font("times new roman",Font.BOLD,30));
        t1.setBackground(Color.black);
        f1.add(t1);
        f1.setVisible(true);
    }
}
