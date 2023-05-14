package AdvanceCS;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VendingMachineApp extends Application
{
    //--------------------------------------------------------------------
    //  Creates and presents the program window.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        VendingMachine pane = new VendingMachine();
        pane.setAlignment(Pos.CENTER);
        pane.setSpacing(30);
        pane.setStyle("-fx-background-color: white");

        Scene scene = new Scene(pane, 1500, 1000);

        primaryStage.setTitle("Vending Machine");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
