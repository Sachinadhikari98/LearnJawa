import javax.swing.*;

public class InternalFrameExample {
 static void main(String[] args){
     JFrame f1=new JFrame("Internal Frames");
     f1.setSize(600,400);
     JDesktopPane p1=new JDesktopPane();
     JInternalFrame i1=new JInternalFrame("Internal Frame 1",true,true,true,true);
     i1.setSize(300,300);
     i1.setLocation(50,50);
     i1.setVisible(true);
     p1.add(i1);
     f1.add(p1);
     f1.setVisible(true);
 }
}