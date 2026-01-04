import javax.swing.*;

public class MenuExample {
    static void main(String[] args){
        JFrame f1=new JFrame("Menus in Java");
        f1.setSize(400,400);
        JMenuBar b1=new JMenuBar();
        JMenu m1=new JMenu("File");
        JMenu m2=new JMenu("Edit");
        JMenu m3=new JMenu("View");
        JMenu m4=new JMenu("Run");
        JMenu m5=new JMenu("Tools");
        b1.add(m1);b1.add(m2);b1.add(m3);b1.add(m4);b1.add(m5);
        JMenu m6=new JMenu("New");
        JMenuItem i1=new JMenuItem("Open");
        JMenu m7=new JMenu("Recent Projects");
        JMenuItem i2=new JMenuItem("Save");
        JMenuItem i3=new JMenuItem("Exit");
        m1.add(m6);m1.add(i1);m1.add(m7);m1.add(i2);m1.add(i3);
        JMenuItem i4=new JMenuItem("Source file");
        JMenuItem i5=new JMenuItem("Project");
        m6.add(i4);m6.add(i5);
        JMenuItem i6=new JMenuItem("Swing");
        m7.add(i6);
        f1.setJMenuBar(b1);
        f1.setVisible(true);
    }
}
