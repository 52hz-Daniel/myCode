package AdvanceCS;

import com.sun.javafx.scene.shape.TriangleMeshHelper;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import org.w3c.dom.Node;

public class SpinnerShape extends Application {
    private Spinner<String> stringSpinner;
    private HBox shapes;
    @Override
    public void start(Stage stage) throws Exception {


        /*Circle a= new Circle(0,0,10);
        Rectangle b= new Rectangle(0,0,10,10);
        Rectangle c= new Rectangle(0,0,10,20);
        Ellipse d= new Ellipse(0,0,10,20);*/
        shapes= new HBox(new Circle(0,0,10));
        shapes.setAlignment(Pos.CENTER);
        shapes.setSpacing(25);

        SpinnerValueFactory.IntegerSpinnerValueFactory svf =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 4, 1);
        ObservableList<String> list = FXCollections.observableArrayList();
        list.addAll("Circle", "Square", "Rectangle", "Ellipse");
        stringSpinner = new Spinner<String>(list);
        stringSpinner.getStyleClass().add(
                Spinner.STYLE_CLASS_SPLIT_ARROWS_VERTICAL);
        stringSpinner.setOnMouseClicked(this::processClick);

                /*().bind(textString.concat(
                intSpinner.valueProperty()).concat(" and ").concat(
                stringSpinner.valueProperty()));*/

        VBox pane = new VBox(stringSpinner,shapes);
        pane.setStyle("-fx-background-color: skyblue");
        pane.setAlignment(Pos.CENTER);
        pane.setSpacing(25);

        Scene scene = new Scene(pane, 500, 750);

        stage.setTitle("Spinner Demo");
        stage.setScene(scene);
        stage.show();
    }
    public void processClick(MouseEvent event){
        if (stringSpinner.getValue()=="Circle")
            shapes.getChildren().set(0,new Circle(0,0,10));
        else if (stringSpinner.getValue()=="Square")
            shapes.getChildren().set(0,new Rectangle(0,0,10,10));
        else if (stringSpinner.getValue()=="Rectangle")
            shapes.getChildren().set(0,new Rectangle(0,0,10,20));
        else
            shapes.getChildren().set(0,new Ellipse(0,0,10,20));
    }


}
