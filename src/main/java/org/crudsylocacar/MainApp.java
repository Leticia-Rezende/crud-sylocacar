package org.crudsylocacar;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class MainApp extends Application {
    private String patMainApp = "C:\\Users\\Unifan\\crud-sylocacar\\src\\main\\java\\org\\crudsylocacar\\view\\MainView.fxml";
    @Override
    public void start(Stage stage) throws IOException { //Stage = janela
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent root = fxmlLoader.load(new FileInputStream(patMainApp));
        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}