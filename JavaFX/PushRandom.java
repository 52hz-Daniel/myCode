package AdvanceCS;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PushRandom extends Application{



        private Text countText;

        public void start(Stage primaryStage)
        {

            countText = new Text("Number: ");

            Button push = new Button("Push Me!");
            push.setOnAction(this::processButtonPress);

            FlowPane pane = new FlowPane(push, countText);
            pane.setAlignment(Pos.CENTER);
            pane.setHgap(40);
            pane.setStyle("-fx-background-color: cyan");

            Scene scene = new Scene(pane, 300, 100);

            primaryStage.setTitle("Push Counter");
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        public void processButtonPress(ActionEvent event)
        {

            countText.setText("Number: " + (int)(Math.random()*100+1));
        }

        public static void main(String[] args)
        {
            launch(args);
        }

}
