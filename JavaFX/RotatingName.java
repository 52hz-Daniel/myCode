package AdvanceCS;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RotatingName extends Application {
    public void start(Stage primaryStage) throws InterruptedException {
        Text n=new Text(100,100,"Rubin Steven Daniel");
        int x=(int)(Math.random()*360);
        n.setRotate(x);
        Group root = new Group(n);
        Scene scene = new Scene(root, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
