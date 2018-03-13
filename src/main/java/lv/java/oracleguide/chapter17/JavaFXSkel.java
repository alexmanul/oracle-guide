package lv.java.oracleguide.chapter17;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXSkel extends Application {

    public static void main(String[] args) {
        System.out.println("Запуск приложения JavaFX");

        // Запустить приложение JavaFX, вызвав метод launch()
        launch(args);
    }

    // Переопределить метод init()
    public void init() {
        System.out.println("В теле метода init()");
    }

    @Override
    // Переопределить метод start()
    public void start(Stage primaryStage) throws Exception {

        System.out.println("В теле метода start()");

        // Установить заголовок окна приложения
        primaryStage.setTitle("Каркас приложения JavaFX");

        // Создать корневой узел
        FlowPane rootNode = new FlowPane();

        // Создать сцену
        Scene scene = new Scene(rootNode, 300, 200);

        // Установить сцену на платформе
        primaryStage.setScene(scene);

        // Отобразить платформу вместе со сценой
        primaryStage.show();

    }

    // Переопределить метод stop()
    public void stop() {
        System.out.println("В теле метода stop()");
    }
}