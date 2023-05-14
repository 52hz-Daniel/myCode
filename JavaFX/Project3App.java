package AdvanceCS;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Project3App extends Application {
    public void start (Stage primaryStage){
        ProjectSum3 test= new ProjectSum3();

        Scene scene = new Scene(test, 500, 800);

        primaryStage.setTitle("Question 3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
