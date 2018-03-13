package lv.java.oracleguide.chapter16.buttondemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class ButtonDemo implements ActionListener {

    private JLabel jLabel;

    private ButtonDemo() {

        // Создать новый контейнер JFrame
        JFrame jFrame = new JFrame("A Button Example");

        // Задать объект FlowLayout для менеджера компоновки
        jFrame.setLayout(new FlowLayout());

        // Задать исходные размеры фрейма
        jFrame.setSize(220, 90);

        // Завершить работу программы, когда пользователь закрывает приложение
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Создать две кнопки
        JButton jButtonUp = new JButton("Up");
        JButton jButtonDown = new JButton("Down");

        // Добавить слушатели действий
        jButtonUp.addActionListener(this);
        jButtonDown.addActionListener(this);

        // Добавить кнопки в панель содержимого
        jFrame.add(jButtonUp);
        jFrame.add(jButtonDown);

        // Создать текстовую метку
        JLabel jLabel = new JLabel("Press a button");

        // Добавить метку во фрейм
        jFrame.add(jLabel);

        // Отобразить фрейм
        jFrame.setVisible(true);
    }

    // Обработать события кнопки
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Up")) {
            jLabel.setText("You pressed Up.");
        } else {
            jLabel.setText("You pressed Down.");
        }
    }

    // Создать фрейм в потоке диспетчеризации событий
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonDemo();
            }
        });
    }
}