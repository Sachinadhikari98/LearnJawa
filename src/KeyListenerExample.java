import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerExample {
    static void main(String[] args){
        JFrame f1=new JFrame("Key Example");
        f1.setSize(300,300);
        f1.setLayout(new FlowLayout());
        JTextArea a1=new JTextArea(10,20);
        f1.add(a1);
        JLabel l1=new JLabel();
        a1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                l1.setText("Typed");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                l1.setText("Pressed");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                l1.setText("Released");
            }
        });
        f1.add(l1);
        f1.setVisible(true);
    }
}
