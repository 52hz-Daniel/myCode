package AdvanceCS;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DrawCircleApp extends Application {
    public void start(Stage primaryStage){

        Scene scene = new Scene(new DrawCircle(),1000,1000);

        primaryStage.setTitle("Draw Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
