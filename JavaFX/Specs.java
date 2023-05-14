package AdvanceCS;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.util.Locale;


public class Specs extends Application {
    private TextField name=new TextField();
    private TextField age=new TextField();
    private TextField color=new TextField();
    private TextField hobby=new TextField();
    private Button prt=new Button("Print");
    private Scene scene;
    private GridPane p;

    public void start(Stage primaryStage) {
        p=new GridPane();
        p.setAlignment(Pos.CENTER);
        Label n=new Label("Name:");
        Label a=new Label("Age:");
        Label c=new Label("Color:");
        Label h=new Label("Hobby:");

        p.add(n,0,0);
        p.add(name,1,0);
        p.add(a,0,1);
        p.add(age,1,1);
        p.add(c,0,2);
        p.add(color,1,2);
        p.add(h,0,3);
        p.add(hobby,1,3);
        p.add(prt,1,4);

        prt.setOnAction(this::processReturn);
        scene = new Scene(p, 300, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void processReturn(ActionEvent event)
    {
        System.out.println(name.getText()+" is "+age.getText()+" years old, "+name.getText()+" likes the color "+color.getText()+" and has the hobby of "+hobby.getText());
        p.setStyle("-fx-background-color: "+color.getText().toLowerCase(Locale.ROOT));
    }
}