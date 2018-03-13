package lv.java.oracleguide.chapter16;

import javax.swing.*;

public class SwingDemo {

    private SwingDemo() {

        // Создать новый контейнер JFrame
        JFrame jFrame = new JFrame("A Simple Swing Application");

        // Задать исходные размеры фрейма
        jFrame.setSize(275, 150);

        // Завершить работу программы, когда пользователь закрывает приложение

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Создать текстовую метку
        JLabel jLabel = new JLabel("Swing defines the modern Java GUI");

        // Добавить метку в панель содержимого
        jFrame.add(jLabel);

        // Отобразить фрейм
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}
