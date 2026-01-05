import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {
    static void main(String[] args){
        JFrame f1=new JFrame("Grids");
        f1.setSize(300,300);
        f1.setLayout(new GridLayout(3,3));
        JButton b1=new JButton("Button 1");
        JButton b2=new JButton("Button 2");
        JButton b3=new JButton("Button 3");
        JButton b4=new JButton("Button 4");
        JButton b5=new JButton("Button 5");
        JButton b6=new JButton("Button 6");
        JButton b7=new JButton("Button 7");
        JButton b8=new JButton("Button 8");
        JButton b9=new JButton("Button 9");
        f1.add(b1);f1.add(b2);f1.add(b3);f1.add(b4);f1.add(b5);f1.add(b6);f1.add(b7);f1.add(b8);f1.add(b9);
        f1.setVisible(true);
    }
}
