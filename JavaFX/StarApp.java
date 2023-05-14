package AdvanceCS;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class StarApp extends Application {
    public void start(Stage primaryStage) {

        Star a= new Star(Color.RED,0.4,0.4,100.0, 200.0);
        Star b= new Star(Color.YELLOW,1.0,1.0,200.0,300.0);
        Star c= new Star(Color.GREEN, 1.6,1.6,300.0,200.0);
        Star d= new Star(Color.BLUE, 2.0,2.0,400.0,300.0);
        Star e= new Star(Color.BLACK,2.5,2.5,500.0,200.0);

        Group root = new Group(a,b,c,d,e);
        Scene scene = new Scene(root, 1000, 900);
      //  stage.setScene(scene);

        primaryStage.setTitle("Stars");
        primaryStage.setScene(scene);
        primaryStage.show();
//        a.setFill(
//        b.setFill(
//        c.setFill(
//        d.setFill(
//        e.setFill(
//
//        a.setScaleX();
//        b.setScaleX(;
//        c.setScaleX(1.6);
//        d.setScaleX(2);
//        e.setScaleX(2.5);
//
//        a.setScaleY(0.4);
//        b.setScaleY(1);
//        c.setScaleY(1.6);
//        d.setScaleY(2);
//        e.setScaleY(2.5);
//
//        a.setTranslateX(100);
//        b.setTranslateX(200);
//        c.setTranslateX(300);
//        d.setTranslateX(400);
//        e.setTranslateX(500);
    }
}
