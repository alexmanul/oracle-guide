package lv.java.oracleguide.chapter15;

import java.applet.Applet;
import java.awt.*;

/*
<applet code="AppletSkel"width=300height=100>
</applet>
 */

public class AppletSkel extends Applet {

    // Этот метод вызывается первым
    public void init() {
        // инициализация
    }

    // Этот метод вызывается вторым после метода init().
    // Он вызывается также при каждом перезапуске аплета.
    public void start() {
        // запуск или возобновление выполнения
    }

    // Этот метод вызывается для приостановки апплета
    public void stop() {
        // приостановка выполнения
    }

    // Этот метод вызывается для уничтожения апплета
    public void destroy() {
        //выполнение завершающих действий
    }

    //   Этот метод вызывается для обновления данных в окне апплета
    public void paint(Graphics g) {
        // перерисовка содержимого окна
    }
}