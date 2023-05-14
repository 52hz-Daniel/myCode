package AdvanceCS;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SliderFontSize extends Application {
    private Text seen;
    private Slider xSlider;
    private double size=0;
    private DoubleProperty size1;
    public void start(Stage primaryStage)
    {
        seen=new Text();
        seen.setText("Change Font");

        xSlider = new Slider(0, 200, 150);
        xSlider.setShowTickMarks(true);
        xSlider.setPadding(new Insets(0, 20, 20, 80));

       /* seen.fontProperty().bind(xSlider.valueProperty());
                (Font.font("Arial",(double)xSlider.getValue()));*/
      //  size1.bind(xSlider.valueProperty());
      //  size= DoubleProperty.doubleProperty();


       /* size=xSlider.getValue();
        xSlider.setOnAction((e)->{


    });*/
        BorderPane pane = new BorderPane();
        pane.setBottom(xSlider);
        pane.setCenter(seen);
        pane.setStyle("-fx-background-color: grey");

        Scene scene = new Scene(pane, 500, 300);

        primaryStage.setTitle("Ellipse Sliders");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args)
    {
        launch(args);
    }
}
