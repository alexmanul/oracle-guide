package lv.java.oracleguide.chapter16.swingapplets;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MySwingApplet extends JApplet {

    private JButton jbtnUp;
    private JButton jbtnDown;
    private JLabel jlab;


//   <object code = "MySwingApplet" width=200 height=80></object>

    // Инициализировать апплет
    public void init() {
        try {
            // Использование метода invokeAndWait() для создания GUI
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    makeGUI(); // инициализировать графический интерфейс
                }
            });
        } catch (Exception e) {
            System.out.println("Can't create because of " + e);
        }
    }

    //Установить и инициализировать графический интерфейс
    private void makeGUI() {
        // Задать менеджер компоновки FlowLayout для апплета
        setLayout(new FlowLayout());

        // Создать две кнопки
        jbtnUp = new JButton("Up");
        jbtnDown = new JButton("Down");

        // Добавить слушатель событий кнопки Up
        // Для обработки событий кнопки используется внутренний класс
        jbtnUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("You pressed Up.");
            }
        });

        // Добавить слушатель событий кнопки Down
        // Для обработки событий кнопки используется внутренний класс
        jbtnDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("You pressed Down.");
            }
        });

        // Добавить кнопки в панель содержимого
        add(jbtnUp);
        add(jbtnDown);

        // Создать текстовую метку
        jlab = new JLabel("Press a button");

        // Добавить метку в панель содержимого
        add(jlab);
    }
}
