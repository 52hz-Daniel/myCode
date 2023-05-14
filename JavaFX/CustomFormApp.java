package AdvanceCS;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;

//************************************************************************
//  StyleOptions.java       Author: Lewis/Loftus
//
//  Demonstrates the use of check boxes.
//************************************************************************

public class CustomFormApp extends Application
{
    //--------------------------------------------------------------------
    //  Creates and presents the program window.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        CustomForm pane= new CustomForm();
        pane.setAlignment(Pos.CENTER);
        pane.setStyle("-fx-background-color: cyan");

        Scene scene = new Scene(pane, 1000, 1000);

        primaryStage.setTitle("Custom Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}