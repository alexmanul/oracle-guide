package lv.java.oracleguide.chapter15;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseEvents extends Applet implements MouseListener, MouseMotionListener {
    private String msg = "";
    private int mouseX = 0, mouseY = 0; //координаты указателя мыши

    // Регистрация класса в качестве слушателя событий мыши
    @Override
    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    // Обработчик события щелчка мыши
    @Override
    public void mouseClicked(MouseEvent me) {
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse clicked";
        repaint();
    }

    // Обработчик события наведения указателя на область элемента
    @Override
    public void mouseEntered(MouseEvent me) {
        //
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse entered";
        repaint();
    }

    // Обработчик события выхода мыши за пределы апплета
    @Override
    public void mouseExited(MouseEvent m) {
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse exited";
        repaint();
    }

    // Обработчик события нажатия кнопки мыши
    @Override
    public void mousePressed(MouseEvent me) {
        // Сохранить координаты
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Down";
        repaint();
    }

    // Обработчик события наведения указателя на область элемента
    @Override
    public void mouseReleased(MouseEvent me) {
        // Сохранить координаты текущего положения курсора
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Up";
        repaint();
    }

    // Обработчик события перетаскивания указателя мыши
    @Override
    public void mouseDragged(MouseEvent me) {
        // Сохранить координаты
        showStatus("Dragging mouse at " + mouseX + ", " + mouseY);
        repaint();
    }

    // Обработчик события перемещения указателя мыши
    @Override
    public void mouseMoved(MouseEvent me) {
        // Отобразить статус
        showStatus("Moving mouse at " + me.getX() + ", " + me.getY());
        repaint();
    }

    // Отобразить сообщение в окне апплета в точке с текущими знаечениями X и Y
    @Override
    public void paint(Graphics g) {
        g.drawString(msg, mouseX, mouseY);
    }
}