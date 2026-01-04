import javax.swing.*;
import java.awt.*;

public class LoginForm {
    static void main (String[] args){
        JFrame f1=new JFrame("Login From");
        f1.setSize(300,300);
        f1.setLocation(500,500);
        f1.setLayout(new FlowLayout());
        f1.setVisible(true);
        JLabel l1=new JLabel("Username");
        JTextField t1=new JTextField(10);
        f1.add(l1);f1.add(t1);
        JLabel l2=new JLabel("Password: ");
        JPasswordField p1=new JPasswordField(10);
        f1.add(l2);f1.add(p1);
        JButton b1=new JButton("Submit");
        f1.add(b1);
        f1.setVisible(true);
    }
}
