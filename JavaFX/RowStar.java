package AdvanceCS;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class RowStar extends Application {
    public void start(Stage primaryStage){
        HBox root = new HBox();
        for (int a = 0; a<17;a++){
            VBox r= new VBox();
            for (int i =0; i<5;i++){
                RowStarOne s= new RowStarOne();
                s.setTranslateX(50);
                s.setTranslateY(50+i*100);
                r.getChildren().addAll(s);
            }
            root.getChildren().addAll(r);
        }

        root.setSpacing(10);
        Scene scene = new Scene(root, 1500, 1000, Color.WHITE);

        primaryStage.setTitle("Row Star");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
