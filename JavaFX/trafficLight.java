package AdvanceCS;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class trafficLight extends HBox{
    private Font font1,font2, font3;
    private String textRed, textYellow, textGreen;
    private RadioButton red, green, yellow;
    private Circle redLight, yellowLight, greenLignt;

    public trafficLight(){
    font1= new Font("Arial", 36);
       // font2= new Font()


        Rectangle bottom= new Rectangle(50,250,160,40);
        Rectangle mid= new Rectangle(112,110,36,140);
        Rectangle top = new Rectangle(95,-50,70,150);
        Circle up= new Circle(130,-50,35);
        Circle down = new Circle(130,100,35);

        redLight= new Circle(130,-50,30);
        yellowLight= new Circle(130,20,30);
        greenLignt= new Circle(130,90,30);

        redLight.setFill(Color.DARKGRAY);
        yellowLight.setFill(Color.DARKGRAY);
        greenLignt.setFill(Color.DARKGRAY);

        Group group= new Group(bottom,mid, up,down,top,redLight,yellowLight,greenLignt);

        StackPane square = new StackPane(group);
        square.setPrefSize(400, 200);

        ToggleGroup selected = new ToggleGroup();

        textGreen= new String("go");
        textYellow= new String("caution");
        textRed= new String("stop");

        red= new RadioButton(textRed);
        red.setSelected(true);
        red.setToggleGroup(selected);
        red.setOnAction(this::processRadioButtonAction);

        yellow= new RadioButton(textYellow);
        yellow.setToggleGroup(selected);
        yellow.setOnAction(this::processRadioButtonAction);

        green= new RadioButton(textGreen);
        green.setToggleGroup(selected);
        green.setOnAction(this::processRadioButtonAction);

        red.setFont(font1);
        green.setFont(font1);
        yellow.setFont(font1);

        VBox options = new VBox(red, yellow, green);
        options.setAlignment(Pos.CENTER_LEFT);
        options.setSpacing(20);

        setSpacing(20);
        getChildren().addAll(options, square);

    }
    public void processRadioButtonAction(ActionEvent event)
    {

        redLight.setFill(Color.DARKGRAY);
        yellowLight.setFill(Color.DARKGRAY);
        greenLignt.setFill(Color.DARKGRAY);
        if (red.isSelected()) {
            redLight.setFill(Color.RED);

        }

        else if (yellow.isSelected()) {
        yellowLight.setFill(Color.YELLOW);

    }

        else {
        greenLignt.setFill(Color.GREEN);

    }

    }
}
