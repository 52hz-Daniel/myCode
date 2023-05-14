package AdvanceCS;

import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;

public class DrawCircle extends GridPane {

    TextField radius;
    int r;

    public DrawCircle(){
        Font font = new Font(18);
        r = 100;

        radius = new TextField();
        radius.setFont(font);
        radius.setMaxWidth(100);
        radius.setAlignment(Pos.CENTER);
        setHalignment(radius, HPos.CENTER);
        radius.setOnAction(this::processReturn);

        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color: lightBlue");
        add(radius,0,0);
        add(circle(r),0,0);
        //System.out.println(getChildren());
    }

    public void processReturn(ActionEvent event){
        r = Integer.parseInt(radius.getText());
        getChildren().set(1, circle(r));
    }

    public Circle circle(int r){
        Circle circle = new Circle(0,0, r);
        setHalignment(circle, HPos.CENTER);
        circle.setStroke(Color.GRAY);
        circle.setStrokeWidth(10);
        circle.setFill(null);
        return circle;
    }

}
