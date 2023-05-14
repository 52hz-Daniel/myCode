package AdvanceCS;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
public class BrickWall extends Application {
    public void start(Stage primaryStage) {
        Group root = new Group();
        for (int i = 1; i <= 200; i += 2) {
            for (int a = 1; a <= 150; a++) {
                Rectangle r1 = new Rectangle(20 + 40 * (a - 1), 50 + 30 * (i - 1), 40, 30);
                r1.setFill(Color.LIGHTGRAY);
                r1.setStrokeWidth(1);
                r1.setStroke(Color.BLACK);
                root.getChildren().add(r1);
            }


        }
        for (int p = 2; p <= 200; p += 2) {
            for (int q = 1; q <= 150; q++) {
                Rectangle r1 = new Rectangle( 40 * (q-1), 50 + 30 * (p - 1), 40, 30);
                r1.setFill(Color.LIGHTGRAY);
                r1.setStrokeWidth(1);
                r1.setStroke(Color.BLACK);
                root.getChildren().add(r1);

            }

        }
        Scene scene = new Scene(root, 1500, 1000, Color.BLACK);

        primaryStage.setTitle("Brick Wall");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

