package AdvanceCS;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

import java.util.ArrayList;

public class DrawingApp extends Application {

    public double[] points;
    private ArrayList<Polyline> poly= new ArrayList<>();
    private int a=0;
    private Group root;
    public Button clear;
    private Color choosen;
    private ColorPicker colorpic;

    public void start(Stage primaryStage){
        Scene scene = new Scene(root, 1500, 900, Color.BLACK);
        scene.setOnMouseDragged(this::processMouseDragged);
        primaryStage.setTitle("Click Polyline");
        colorpic= new ColorPicker();
        colorpic.setOnAction(this::processColorChoice);
        clear = new Button("Clear all the polyline");

        clear.setOnAction((e)->{
            for (int i=0;i<=a;i++)
            poly.remove(a);

        });
        poly.add(new Polyline());
        poly.get(a).setStroke(Color.WHITE);
        root=new Group(clear,colorpic);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void processMouseDragged(MouseEvent event){

        poly.get(a).getPoints().add(event.getX());
        poly.get(a).getPoints().add(event.getY());
        a++;
    }
    public void processColorChoice(ActionEvent event)
    {
        choosen=colorpic.getValue();
    }
}
