package AdvanceCS;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PickColor extends Application {

    private TextField message;
    private ColorPicker colorPicker;
    private Color temp;
    private Button change;
    private Text display;
    public void start(Stage primaryStage){
        change= new Button("Change the color");

        message= new TextField();
        message.setFont(Font.font("Helvetica", FontWeight.BOLD,
                FontPosture.REGULAR, 24));

        change.setOnAction(this::processButton);

        colorPicker = new ColorPicker(Color.BLACK);
        colorPicker.setOnAction(this::processColorChoice);

        display=new Text();

        temp=new Color(0,0,0,0);
        VBox root3= new VBox(message,colorPicker,change,display);
        root3.setPadding(new Insets(15, 15, 15, 25));
        root3.setSpacing(10);
        root3.setAlignment(Pos.BASELINE_LEFT);
        root3.setStyle("-fx-background-color: white");

        Scene scene = new Scene(root3, 1500, 900);

        primaryStage.setTitle("Choose color");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void processColorChoice(ActionEvent event)
    {
        temp=colorPicker.getValue();

        System.out.println(temp);
    }
    public void processButton(ActionEvent event)
    {

        display.setText(message.getText());
        display.setFill(temp);
       /* message.setStyle("-fx-text-fill:"+temp);
//        message.setText();
        message.setText();
        message.setText(message.getText());*/


    }
}

