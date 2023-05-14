package AdvanceCS;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class imageSizeApp extends Application{
    public void start(Stage primaryStage)
    {
        imageSize pane = new imageSize();
        pane.setAlignment(Pos.CENTER);
        pane.setStyle("-fx-background-color: bri");

        Scene scene = new Scene(pane, 1980, 1000);

        primaryStage.setTitle("Image Size Changing");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
