package com.example.calcolatrice;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 367, 541);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        //commento stupidooooooooo
    }

    public static void main(String[] args) {
        launch();
    }
}