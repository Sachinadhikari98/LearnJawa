import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumSwing {
    static void main(String[] args){
        JFrame f1=new JFrame("Sum");
        f1.setSize(250,400);
        f1.setLayout(new FlowLayout());
        JLabel l1=new JLabel("Num1");
        JTextField t1=new JTextField(10);
        f1.add(l1);f1.add(t1);
        JLabel l2=new JLabel("Num2: ");
        JTextField t2=new JTextField(10);
        f1.add(l2);f1.add(t2);
        JButton b1=new JButton("Sum");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1=Integer.parseInt(t1.getText());
                int num2=Integer.parseInt(t2.getText());
                JOptionPane.showMessageDialog(null,"sum="+(num1+num2));
            }
        });
        f1.add(b1);
        f1.setVisible(true);
    }
}
