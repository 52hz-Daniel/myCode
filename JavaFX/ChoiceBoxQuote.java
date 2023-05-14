package AdvanceCS;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class ChoiceBoxQuote extends Application {

    private Text quote;
    private String philosophyQuote, carpentryQuote, comedyQuote;
    private ChoiceBox<String> choice;
    private String[] names;



    public void start (Stage primaryStage){
        philosophyQuote = "I think, therefore I am.";
        carpentryQuote = "Measure twice. Cut once.";
        comedyQuote = "Take my wife, please.";

        names= new String[]{philosophyQuote, carpentryQuote, comedyQuote};

        choice = new ChoiceBox<String>();
        choice.getItems().addAll(names);
        choice.getSelectionModel().selectFirst();
        choice.setOnAction(this::processChoice);

        quote= new Text();
       // quote.setFontSmoothingType(Arial);

        VBox root = new VBox(choice,quote);
        root.setPadding(new Insets(15, 15, 15, 25));
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: skyblue");

        Scene scene = new Scene(root, 300, 150);

        primaryStage.setTitle("Java Juke Box");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

   public void processChoice (ActionEvent event){

        quote.setText(names[choice.getSelectionModel().getSelectedIndex()]);
    }
}
