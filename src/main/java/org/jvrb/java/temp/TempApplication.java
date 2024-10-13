package org.jvrb.java.temp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class TempApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TempApplication.class.getResource("temp-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 616, 402);
        stage.setTitle("Jose V. Rius - Conversor de Temperatura");
        stage.getIcons().add(new Image("file:icon.png"));
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}