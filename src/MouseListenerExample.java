import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerExample {
    static void main(String[] args){
        JFrame f1=new JFrame("Mouse");
        f1.setSize(300,300);
        f1.setLayout(new FlowLayout());
        JLabel l1=new JLabel();
        JButton b1=new JButton("Click Me");
        b1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                l1.setText("Clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                l1.setText("Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                l1.setText("Released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                l1.setText("Entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                l1.setText("Exit");
            }
        });
        f1.add(b1);f1.add(l1);
        f1.setVisible(true);
    }
}
