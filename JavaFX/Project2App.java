package AdvanceCS;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Project2App extends Application {
    public void start (Stage primaryStage){
        ProjectSum2 test= new ProjectSum2();

        Scene scene = new Scene(test);

        primaryStage.setTitle("Question 5");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
