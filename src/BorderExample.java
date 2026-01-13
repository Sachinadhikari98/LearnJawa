import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class BorderExample {
    public static void main(String[] args){
        JFrame frame=new JFrame("String Border Example");
        frame.setSize(300,200);
        JPanel panel=new JPanel();
        Border border = BorderFactory.createLineBorder(Color.BLUE,2);
        panel.setBorder(border);
        panel.add(new JLabel("Hello Swing Border"));
        frame.add(panel);
        frame.setVisible(true);
    }
}
