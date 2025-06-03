package com.praktikum.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.praktikum.Data.dataStore;

public class mainApp extends Application {
    @Override
    public void start (Stage primaryStage){
        dataStore.initialize();
        loginPane loginpane = new loginPane(primaryStage);
        Scene scene = new Scene(loginpane, 400,300);

        primaryStage.setTitle("Sistem barang hilang");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
