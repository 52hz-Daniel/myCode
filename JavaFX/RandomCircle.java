package AdvanceCS;


import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;

public class RandomCircle extends Application{
    public void start(Stage primaryStage) {
        Group root = new Group();

        for (int i=20; i>0; i--) {
        Circle c= new Circle(750,430,10*i);
        c.setFill(Color.LIGHTCYAN);
        c.setStrokeWidth(3);
        c.setStroke(Color.RED);
        root.getChildren().add(c);
        }
        Scene scene = new Scene(root, 1500, 1000, Color.BLACK);

        primaryStage.setTitle("Boxes");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }

}
