import javax.swing.*;
import java.awt.*;

public class BoxLayoutExample {
    static void main(String[] args){
        Frame f1=new Frame();
        f1.setLayout(new BoxLayout(f1,BoxLayout.X_AXIS));
        f1.setSize(300,300);
        Button b1=new Button("bt1");
        Button b2=new Button("bt2");
        Button b3=new Button("bt3");
        Button b4=new Button("bt4");
        Button b5=new Button("bt5");
        f1.add(b1);f1.add(b2);f1.add(b3);f1.add(b4);f1.add(b5);
        f1.setVisible(true);
    }
}
