package lv.java.oracleguide.chapter17;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXEventDemo extends Application {

    private Label response;

    public static void main(String[] args) {
        // Запустить приложение JavaFX, вызвав метод launch()
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Установить заголовок окна приложения
        primaryStage.setTitle("Use JavaFX buttons and Events");

        // Создать корневой узел с использованием FlowPane.
        // Значение вертикального и горизонтального зазоров составляет 10.
        FlowPane rootNode = new FlowPane(10, 10);

        // Центрировать элементы управления на сцене
        rootNode.setAlignment(Pos.CENTER);

        // Создать сцену
        Scene scene = new Scene(rootNode, 300, 200);

        // Установить сцену на платформе
        primaryStage.setScene(scene);

        // Создать метку
        response = new Label("Push a button");

        // Создать две кнопки
        Button buttonUp = new Button("Up");
        Button buttonDown = new Button("Down");

        // Обработать события действий для кнопки Up
        buttonUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("You pressed Up");
            }
        });

        // Обработать события действий для кнопки Down
        buttonDown.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("You pressed Down");
            }
        });


        // Добавить метку и кнопки в граф сцены
        rootNode.getChildren().addAll(buttonUp, buttonDown, response);

        // Отобразить платформу вместе со сценой
        primaryStage.show();
    }
}