import java.awt.*;
import java.applet.*;

public class AppletExample {
    public void paint(Graphics g){
        g.drawLine(10,20,100,110);
        g.drawString("Hello BCA",200,200);
        g.drawRect(10,50,100,150);
    }
}
