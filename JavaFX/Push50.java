package AdvanceCS;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Push50 extends Application{
    private int mid= 50;
    private Text num = new Text("Number: "+mid);

    public void start(Stage primaryStage)
    {

       // num ;
        Button increment = new Button("increment");
        Button decrement = new Button("decrement");
        increment.setOnAction(this::processButtonPress1);
        decrement.setOnAction(this::processButtonPress2);

        FlowPane pane = new FlowPane(increment, num, decrement);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(40);
        pane.setStyle("-fx-background-color: cyan");

        Scene scene = new Scene(pane, 300, 100);

        primaryStage.setTitle("Push50");
        primaryStage.setScene(scene);
        primaryStage.show();
        }
    public void processButtonPress1(ActionEvent event)
    {
        mid++;
        num.setText("Number: "+mid);
    }
    public void processButtonPress2(ActionEvent event)
    {
        mid--;
        num.setText("Number: "+mid);
    }

    public static void main(String[] args)
    {
        launch(args);
    }
    }



