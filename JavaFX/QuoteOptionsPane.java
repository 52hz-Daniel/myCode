package AdvanceCS;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

//************************************************************************
//  QuoteOptionsPane.java       Author: Lewis/Loftus
//
//  Demonstrates the use of radio buttons.
//************************************************************************

public class QuoteOptionsPane extends HBox
{
    private Text quote;
    private String philosophyQuote, carpentryQuote, comedyQuote;
    private RadioButton philosophyButton, carpentryButton, comedyButton;
    private Spinner<String> stringSpinner;


    //--------------------------------------------------------------------
    //  Sets up this pane with a Text object and radio buttons that
    //  determine which phrase is displayed.
    //--------------------------------------------------------------------
    public QuoteOptionsPane()
    {
        philosophyQuote = "I think, therefore I am.";
        carpentryQuote = "Measure twice. Cut once.";
        comedyQuote = "Take my wife, please.";

        quote = new Text(philosophyQuote);
        quote.setFont(new Font("Helvetica", 24));

        StackPane quotePane = new StackPane(quote);
        quotePane.setPrefSize(300, 100);

       // ToggleGroup group = new ToggleGroup();

        /*philosophyButton = new RadioButton("Philosophy");
        philosophyButton.setSelected(true);
        philosophyButton.setToggleGroup(group);
        philosophyButton.setOnAction(this::processRadioButtonAction);

        carpentryButton = new RadioButton("Carpentry");
        carpentryButton.setToggleGroup(group);
        carpentryButton.setOnAction(this::processRadioButtonAction);

        comedyButton = new RadioButton("Comedy");
        comedyButton.setToggleGroup(group);
        comedyButton.setOnAction(this::processRadioButtonAction);*/

        SpinnerValueFactory.IntegerSpinnerValueFactory svf =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 3, 1);
        ObservableList<String> list = FXCollections.observableArrayList();
        list.addAll(philosophyQuote,carpentryQuote,comedyQuote);
        stringSpinner = new Spinner<String>(list);
        stringSpinner.getStyleClass().add(
                Spinner.STYLE_CLASS_SPLIT_ARROWS_VERTICAL);
        stringSpinner.setOnMouseClicked(this::processClick);

        VBox options = new VBox(stringSpinner);

        options.setAlignment(Pos.CENTER);
        options.setSpacing(10);

        setSpacing(20);
        setAlignment(Pos.CENTER);
        getChildren().addAll(options, quotePane);
    }

    //--------------------------------------------------------------------
    //  Updates the content of the displayed text.
    //--------------------------------------------------------------------
    public void processRadioButtonAction(ActionEvent event)
    {
        if (philosophyButton.isSelected())
            quote.setText(philosophyQuote);
        else if (carpentryButton.isSelected())
            quote.setText(carpentryQuote);
        else
            quote.setText(comedyQuote);
    }
    public void processClick (MouseEvent event){
        quote.setText(stringSpinner.getValue());
    }
}