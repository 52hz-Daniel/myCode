package AdvanceCS;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class MouseColor extends Application {

    private Group root;
    public void start (Stage primaryStage){
        root = new Group();


        Scene scene = new Scene(root, 500, 300, Color.BLACK);

     //   scene.setOnMouseMoved();
    }
    public void processMouseEnter(MouseEvent event){

    }
}
