package AdvanceCS;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Skyline extends Application
{
    public void start(Stage primaryStage) {
        Circle moon = new Circle(420, 50, 30);
        moon.setFill(Color.GOLD);

        Group building1=building(10,170);
        Rectangle roof = new Rectangle(0,160,70,10);
        roof.setFill(Color.GRAY);

        Group building2=building(200,150);
        Circle roof2=new Circle(225,150,25);
        roof2.setFill(Color.GRAY);

        Group building3=building(350,190);
        Ellipse roof3=new Ellipse(375,190,35,10);
        roof3.setFill(Color.GRAY);

        Group building4=building(100,170);
        Rectangle roof4 = new Rectangle(90,160,70,10);
        roof4.setFill(Color.GRAY);

        Group building5=building(270,160);
        Circle roof5=new Circle(295,160,25);
        roof5.setFill(Color.GRAY);

        Group building6=building(430,190);
        Ellipse roof6=new Ellipse(455,190,35,10);
        roof6.setFill(Color.GRAY);

        Rectangle ground = new Rectangle(0, 220, 500, 100);
        ground.setFill(Color.DARKGRAY);

        Group root = new Group(ground, moon,roof,roof2,roof3,roof4,roof5,roof6,building1,building2,building3,building4,building5,building6);
        Scene scene = new Scene(root, 500, 300, Color.BLACK);


        primaryStage.setTitle("Skyline");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public Group building(int x,int y){
        Rectangle body = new Rectangle(x,y, 50, 100);
        body.setFill(Color.GRAY);
        Rectangle windows[] = new Rectangle[16];
        Group build=new Group(body);
        int w=0, z=1;
        for (int i=0;i<30;i+=15){
            for (int j=0;j<80;j+=10){
                windows[w*z]=new Rectangle(x+10+i,y+10+j,7,7);
                windows[w*z].setFill(Color.GOLD);
                build.getChildren().add(windows[w*z]);
                w++;
            }
            w=0;
            z++;
        }
        return build;
    }
}
