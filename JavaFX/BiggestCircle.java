package AdvanceCS;


import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;

public class BiggestCircle extends Application{
    public void start(Stage primaryStage){
        Group root = new Group();
        Random gen = new Random();
        Circle temp= new Circle(0,0,0);

        for (int count = 1; count <= 10; count++)
        {
            int x = gen.nextInt(1400) + 1;
            int y = gen.nextInt(1000) + 1;
            int r= gen.nextInt(300)+1;

      //      Color fill = Color.rgb(gen.nextInt(256),gen.nextInt(256),gen.nextInt(256));
            Circle star = new Circle(x,y,r);
            star.setFill(null);
            star.setStroke(Color.YELLOW);
            star.setStrokeWidth(2);
            if (temp.getRadius()<r){
                temp= star;
            }
            root.getChildren().add(star);
        }
        temp.setFill(Color.RED);
        temp.setOpacity(0.3);

        Scene scene = new Scene(root, 1400, 1000, Color.BLACK);

        primaryStage.setTitle("Biggest Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
