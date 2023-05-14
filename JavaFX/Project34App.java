package AdvanceCS;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Project34App extends Application {
    public void start (Stage primaryStage){
        Project34 a= new Project34();

        Scene scene = new Scene(a, 1500, 900);

        primaryStage.setTitle("Question 3 and 4");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
