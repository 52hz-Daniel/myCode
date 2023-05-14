package AdvanceCS;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

public class AlienBattle extends Application {
        public void start(Stage primaryStage){
            Group root = new Group();
            Random gen = new Random();

            for (int count = 1; count <= 1000; count++)
            {
                int x = gen.nextInt(1400) + 1;
                int y = gen.nextInt(1000) + 1;
                int r= gen.nextInt(7)+1;

                Color fill = Color.rgb(gen.nextInt(256),gen.nextInt(256),gen.nextInt(256));
               // Color fill= Color.WHITE;
                Circle star = new Circle(x,y,r);
                //   star.setStroke(Color.WHITE);
                star.setFill(fill);



                root.getChildren().add(star);


            }
            AlienShip one= new AlienShip();
            AlienShip two= new AlienShip();
            AlienShip three= new AlienShip();
            AlienShip four= new AlienShip();
            one.setTranslateX(300);
            one.setTranslateY(200);
            two.setTranslateX(610);
            two.setTranslateY(430);
            three.setTranslateX(900);
            three.setTranslateY(100);
            four.setTranslateX(1100);
            four.setTranslateY(200);
            two.setScaleX(2);
            two.setScaleY(2);
            root.getChildren().addAll(one,three,two,four);
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
