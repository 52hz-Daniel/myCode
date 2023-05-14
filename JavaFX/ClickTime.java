package AdvanceCS;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;

public class ClickTime extends Application {
    private Group root;
    private int time;
    private Text a;
    public void start(Stage primaryStage){
        a = new Text(150, 30, "The number of clicks: "+ time);
        a.setFill(Color.WHITE);
        Group root= new Group();
        root.getChildren().addAll(a);
        Scene scene = new Scene(root, 500, 300, Color.BLACK);

        scene.setOnMousePressed(this::processMousePress);
        primaryStage.setTitle("Click Time");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void processMousePress(MouseEvent event)
    {
       time++;
       a.setText("The number of clicks: "+ time);
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
