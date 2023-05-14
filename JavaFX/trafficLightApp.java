package AdvanceCS;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;

//************************************************************************
//  QuoteOptions.java       Author: Lewis/Loftus
//
//  Demonstrates the use of radio buttons.
//************************************************************************

public class trafficLightApp extends Application
{
    //--------------------------------------------------------------------
    //  Creates and presents the program window.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        trafficLight pane = new trafficLight();
        pane.setAlignment(Pos.CENTER);
        pane.setStyle("-fx-background-color: brightcyan");

        Scene scene = new Scene(pane, 1000, 1000);

        primaryStage.setTitle("Traffic Light");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
