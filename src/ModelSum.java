import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ModelSum {
    public int sum(int x, int y){
        return x+y;
    }
}
class ViewSum extends JFrame{
    JTextField t1, t2;
    JButton b1;
    public ViewSum(){
        setSize(300,300);
        setLayout(new FlowLayout());
        add(new JLabel("Num1: "));
        t1=new JTextField(20);
        add(t1);
        add(new JLabel("Num2: "));
        t2=new JTextField(20);
        add(t2);
        b1=new JButton("Sum");
        add(b1);
        setVisible(true);

    }
    public void display(int res){
        JOptionPane.showMessageDialog(null,"sum= "+res);
    }
}
class ControllerSum {
    public static void main(String[] args) {
        ModelSum m1 = new ModelSum();
        ViewSum v1 = new ViewSum();
        v1.b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(v1.t1.getText());
                int num2 = Integer.parseInt(v1.t2.getText());
                int add = m1.sum(num1, num2);
                v1.display(add);
            }
        });
    }

}