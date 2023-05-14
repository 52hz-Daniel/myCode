package AdvanceCS;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;

import javafx.scene.shape.*;


public class LabelCircle extends GridPane {
    private TextField radi;
    private int rTemp;

    public LabelCircle(){
        Font font = new Font(18);

        radi= new TextField();
        radi.setFont(font);
        radi.setPrefWidth(50);
    //    radi.setAlignment(Pos.CENTER);
        radi.setOnAction(this::changeRadi);
        radi.setAlignment(Pos.CENTER);

        Circle cir = new Circle(10, 70, 30);
        cir.setFill(Color.CHARTREUSE);
        cir.setStrokeWidth(5);
        cir.setStroke( Color.RED);
        cir.setRadius(rTemp);

        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color: yellow");

        add(radi, 0, 0);
        add(cir, 1, 0);


    }
    public void changeRadi(ActionEvent event){
        int r = Integer.parseInt(radi.getText());
        rTemp = r;



    }
}
