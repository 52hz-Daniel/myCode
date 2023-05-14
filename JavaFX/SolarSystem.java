package AdvanceCS;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class SolarSystem extends Application {
    public void start(Stage primaryStage){
        Circle sun = new Circle(840,430,120);
        sun.setFill(Color.GOLD);

        Ellipse orbit1 = new Ellipse(850,500,250,160);
        orbit1.setStroke(Color.GRAY);
        orbit1.setRotate(150);
        orbit1.setFill(null);

        Ellipse orbit2 = new Ellipse(850,500,350,260);
        orbit2.setStroke(Color.GRAY);
        orbit2.setRotate(150);
        orbit2.setFill(null);

        Ellipse orbit3 = new Ellipse(850,500,150,60);
        orbit3.setStroke(Color.GRAY);
        orbit3.setRotate(150);
        orbit3.setFill(null);

        Ellipse orbit4 = new Ellipse(850,500,450,360);
        orbit4.setStroke(Color.GRAY);
        orbit4.setRotate(150);
        orbit4.setFill(null);

        Ellipse orbit5 = new Ellipse(850,500,550,460);
        orbit5.setStroke(Color.GRAY);
        orbit5.setRotate(150);
        orbit5.setFill(null);

        Ellipse orbit6 = new Ellipse(850,500,650,560);
        orbit6.setStroke(Color.GRAY);
        orbit6.setRotate(150);
        orbit6.setFill(null);

        Ellipse orbit7 = new Ellipse(850,500,750,660);
        orbit7.setStroke(Color.GRAY);
        orbit7.setRotate(150);
        orbit7.setFill(null);

        Ellipse orbit8 = new Ellipse(850,500,850,760);
        orbit8.setStroke(Color.GRAY);
        orbit8.setRotate(150);
        orbit8.setFill(null);

        Circle earth = new Circle(1175,400,50);
        earth.setFill(Color.rgb(99,184,255));

        Circle mars = new Circle(520,600,40);
        mars.setFill(Color.rgb(255,99,71));

        Circle jupiter = new Circle(450,400,50);
        jupiter.setFill(Color.rgb(255,218,185));

        Circle mercury = new Circle(740,570,40);
        mercury.setFill(Color.rgb(255,218,185));

        Circle venus = new Circle(450,400,50);
        venus.setFill(Color.rgb(255,218,185));

        Circle saturn = new Circle(450,400,50);
        saturn.setFill(Color.rgb(255,218,185));

        Circle uranus = new Circle(450,400,50);
        uranus.setFill(Color.rgb(255,218,185));

        Circle neptune = new Circle(450,400,50);
        neptune.setFill(Color.rgb(255,218,185));

      //  BorderPane root1= new BorderPane();

        Image sky= new Image ("file:D:\\mypicture\\74845ebd1c3b2a06d377c310aaea582e.jpg");
        ImageView a = new ImageView();
        a.setImage(sky);
        a.setFitHeight(1079);
        a.setFitWidth(1919);


        Group orbits = new Group(orbit1, orbit2, orbit3, orbit4, orbit5, orbit6, orbit7, orbit8);
        Group planets = new Group(mercury, venus, earth, mars, jupiter, saturn, uranus, neptune);
        Group root = new Group(a,orbits, sun, planets);
        Scene scene = new Scene(root,1919,1079, Color.BLACK);

        primaryStage.setTitle("SolarSystem");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
