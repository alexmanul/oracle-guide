package lv.java.oracleguide.chapter15;

import java.applet.Applet;
import java.awt.*;

/*<applet code = "SimpleApplet" width = 200 height = 50>
</applet>
*/

// Апплет с минимальными возможностями
public class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Java makes applets easy.", 20, 20);
    }
}