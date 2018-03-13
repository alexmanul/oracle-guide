package lv.java.oracleguide.chapter15;

import java.applet.Applet;
import java.awt.*;

// Параметры передаются в коде HTML

/*<applet code="Param" width=300 height=80>
<param name=author value="Herbert Schildt">
<param name=purpose value="Demonstrate Parameters">
<param name=version value=2>
</applet>
*/

public class Param extends Applet {
    String author;
    String purpose;
    int ver;

    @Override
    public void start() {
        String temp;

        author = getParameter("author");
        // Важно убедиться в существованиии параметра
        if (author == null) author = "not found";

        purpose = getParameter("purpose");
        // Важно убедиться в существованиии параметра
        if (purpose == null) author = "not found";

        temp = getParameter("version");
        try {
            if (temp != null)
                ver = Integer.parseInt(temp);
            else
                ver = 0;

            // Не менее важно убедиться в успешности преобразования параметра в число
        } catch (NumberFormatException e) {
            ver = -1;
        }
    }

    public void paint(Graphics g){
        g.drawString("Purpose: " + purpose, 10, 20);
        g.drawString("By: " + author, 10, 40);
        g.drawString("Version: " + ver, 10, 60);
    }
}