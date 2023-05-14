package AdvanceCS;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class radioSquare extends Application{

    public void start(Stage primaryStage)
    {
        radioSquareChoose pane = new radioSquareChoose();
        pane.setAlignment(Pos.CENTER);
        pane.setStyle("-fx-background-color: lightgreen");

        Scene scene = new Scene(pane, 500, 350);

        primaryStage.setTitle("radio square");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
