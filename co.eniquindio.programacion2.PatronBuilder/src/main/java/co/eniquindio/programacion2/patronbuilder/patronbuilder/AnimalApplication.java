package co.eniquindio.programacion2.patronbuilder.patronbuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AnimalApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AnimalApplication.class.getResource("Animal.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("App Animales");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}