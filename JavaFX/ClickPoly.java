package AdvanceCS;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

import java.util.ArrayList;


public class ClickPoly extends Application {

    public double[] points;
    public Group root;
    public Button clear;

    public Polyline poly;
    @Override
    public void start(Stage primaryStage) throws Exception {
        clear = new Button("Clear all the polyline");

        clear.setOnAction((e)->{

                });
        points= new double[4];

        points[0]=100;
        points[1]=100;
        points[2]=200;
        points[3]=200;
        poly = new Polyline(points);
        poly.setStroke(Color.RED);
        root = new Group(clear,poly);

        Scene scene = new Scene(root, 500, 300, Color.BLACK);
        scene.setOnMouseClicked(this::processMouseClick);
        primaryStage.setTitle("Click Polyline");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void processMouseClick (MouseEvent event){
        double[] temp= new double[points.length+2];
        for (int i = 0; i<points.length; i++){
            temp[i]=points[i];
        }
        points=temp;

        points[points.length-2]=event.getX();
        points[points.length-1]=event.getY();

       /* poly(points);
        poly.setStroke(Color.BLUE);
        poly.
*/
    }


}
