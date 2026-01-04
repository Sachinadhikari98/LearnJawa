import javax.swing.*;

public class LoginFromV2 {
    static void main(String[] args){
        JFrame f1=new JFrame("Login");
        f1.setLayout(null);
        f1.setSize(300,300);
        JLabel l1=new JLabel("Username");
        l1.setBounds(10,10,150,15);
        f1.add(l1);
        JTextField t1=new JTextField();
        t1.setBounds(100,10,150,15);
        f1.add(t1);
        JLabel l2=new JLabel("Password");
        l2.setBounds(10,40,150,15);
        f1.add(l2);
        JPasswordField p1=new JPasswordField();
        p1.setBounds(100,40,150,15);
        f1.add(p1);
        JButton b1=new JButton("Login");
        b1.setBounds(120,70,80,20);
        f1.add(b1);
        f1.setVisible(true);
    }
}
