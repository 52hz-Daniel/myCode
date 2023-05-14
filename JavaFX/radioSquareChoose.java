package AdvanceCS;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;


public class radioSquareChoose extends HBox {
    private Rectangle a;
    private RadioButton red, green, blue, purple, black;

    public radioSquareChoose(){
        a= new Rectangle(  50, 50,50,50);
        a.setFill(Color.RED);

      StackPane square = new StackPane(a);
        square.setPrefSize(200, 100);

        ToggleGroup group = new ToggleGroup();

        red= new RadioButton("Red");
        red.setSelected(true);
        red.setToggleGroup(group);
        red.setOnAction(this::processRadioButtonAction);

        blue= new RadioButton("blue");
        blue.setToggleGroup(group);
        blue.setOnAction(this::processRadioButtonAction);
        green= new RadioButton("green");
        green.setToggleGroup(group);
        green.setOnAction(this::processRadioButtonAction);
        purple= new RadioButton("purple");
        purple.setToggleGroup(group);
        purple.setOnAction(this::processRadioButtonAction);
        black= new RadioButton("black");
        black.setToggleGroup(group);
        black.setOnAction(this::processRadioButtonAction);

        VBox options = new VBox(red, green,blue, purple,black);
        options.setAlignment(Pos.CENTER_LEFT);
        options.setSpacing(10);

        setSpacing(20);
        getChildren().addAll(options, square);
    }
    public void processRadioButtonAction(ActionEvent event)
    {
        if (red.isSelected())
            a.setFill(Color.RED);
        else if (green.isSelected())
            a.setFill(Color.GREEN);
        else if (blue.isSelected())
            a.setFill(Color.BLUE);
        else if (purple.isSelected())
            a.setFill(Color.PURPLE);
        else
            a.setFill(Color.BLACK);
    }
}
