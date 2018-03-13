package lv.java.oracleguide.chapter15;

import java.applet.Applet;
import java.awt.*;

/*
<applet code="StatusWindow"width=300height=50>
</applet>
 */

public class StatusWindow extends Applet {

    public void paint(Graphics g) {
        g.drawString("This is in the applet window.", 10, 20);
        showStatus("This is shown int the status window");
    }
}