package AdvanceCS;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.application.Application;

public class RandomStar extends Application {
    public void start(Stage primaryStage){
        Group root = new Group();
        Random gen = new Random();

        for (int count = 1; count <= 1000; count++)
        {
            int x = gen.nextInt(1400) + 1;
            int y = gen.nextInt(1000) + 1;
            int r= gen.nextInt(10)+1;

            Color fill = Color.rgb(gen.nextInt(256),gen.nextInt(256),gen.nextInt(256));
            Circle star = new Circle(x,y,r);
         //   star.setStroke(Color.WHITE);
            star.setFill(fill);

            root.getChildren().add(star);
        }
        Scene scene = new Scene(root, 1400, 1000, Color.BLACK);

        primaryStage.setTitle("Boxes");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
