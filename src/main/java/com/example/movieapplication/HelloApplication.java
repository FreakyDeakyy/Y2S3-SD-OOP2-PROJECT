package com.example.movieapplication;

import java.io.IOException;

import com.example.movieapplication.Model.TestingHelper;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MainPageView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(HelloApplication.class.getResource("application.css").toExternalForm());
        stage.setTitle("Main Page");
        stage.setScene(scene);
        stage.show();
        TestingHelper.testAll();
    }
}
