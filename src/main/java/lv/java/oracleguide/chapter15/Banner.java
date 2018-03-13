package lv.java.oracleguide.chapter15;

import java.applet.Applet;
import java.awt.*;

// Простой апплет баннера.
// В этом апплете создаётся поток, управляющий прокруткой текста сообщения,
// хранящегося в переменной msg, справа налево в окне апплета.
//
// String msg хранит текст баннера.
// Thread thread - ссылка на поток, в котором выполняется апплет.
// boolean stopFlag служит для остановки апплета.

/*
<applet code="Banner" width=300 height=50>
</applet>
*/
public class Banner extends Applet implements Runnable {
    String msg = " Java rules the Web";
    Thread thread;
    boolean stopFlag;


    // Инициализировать переменную thread значением null
    @Override
    public void init() {
        thread = null;
    }

    // Запустить поток, в котором выполняется апплет
    @Override
    public void start() {
        thread = new Thread(this);
        stopFlag = false;
        thread.start();
    }

    // Точка входа в поток, выполняющий анимацию баннера
    @Override
    public void run() {
        // перерисовать баннер
        for ( ; ; ) {
            try {
                repaint();
                Thread.sleep(250);
                if (stopFlag)
                    break;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Приостановить выполнение апплета
    @Override
    public void stop() {
        stopFlag = true;
        thread = null;
    }

    // Отобразить баннер
    @Override
    public void paint(Graphics g) {
        char ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg += ch;
        g.drawString(msg, 150, 150);
    }
}