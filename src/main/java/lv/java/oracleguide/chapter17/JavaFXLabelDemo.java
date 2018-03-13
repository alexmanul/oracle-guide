package lv.java.oracleguide.chapter17;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXLabelDemo extends Application {

    public static void main(String[] args) {
        // Запустить приложение JavaFX, вызвав метод launch()
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Установить заголовок окна приложения
        primaryStage.setTitle("Use a JavaFX label");

        // Создать корневой узел с использованием FlowPane
        FlowPane rootNode = new FlowPane();

        // Создать сцену
        Scene scene = new Scene(rootNode, 300, 200);

        // Установить сцену на платформе
        primaryStage.setScene(scene);

        // Создать метку
        Label label = new Label("JavaFX is a powerful GUI");

        // Добавить метку в граф сцены
        rootNode.getChildren().add(label);

        // Отобразить платформу вместе со сценой
        primaryStage.show();
    }
}