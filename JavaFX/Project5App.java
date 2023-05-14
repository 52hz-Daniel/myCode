package AdvanceCS;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Project5App extends Application {
    public void start (Stage primaryStage){
        ProjectSum5 test= new ProjectSum5();

        Scene scene = new Scene(test);

        primaryStage.setTitle("Question 5");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
