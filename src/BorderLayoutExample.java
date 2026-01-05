import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    static void main(String[] args){
        JFrame f1=new JFrame("Grids");
        f1.setSize(300,300);
        f1.setLayout(new BorderLayout());
        JButton b1=new JButton("East");
        JButton b2=new JButton("West");
        JButton b3=new JButton("North");
        JButton b4=new JButton("South");
        JButton b5=new JButton("Center");
        f1.add(b1,BorderLayout.EAST);
        f1.add(b2,BorderLayout.WEST);
        f1.add(b3,BorderLayout.NORTH);
        f1.add(b4,BorderLayout.SOUTH);
        f1.add(b5,BorderLayout.CENTER);
        f1.setVisible(true);
    }
}
