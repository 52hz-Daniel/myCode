package AdvanceCS;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;

public class ViewText extends Application {
    private Button left,right;
    private Label content;
    private int count=0;
    private double startY=0;
    private String[] show= {"1111111","22222222222","3333333333"};
    @Override
    public void start(Stage stage) throws Exception {
        content = new Label();
        content.setText(show[0]);
        content.setFont(new Font("Arial", 16));
        content.setMaxSize(200,300);
        content.setAlignment(Pos.CENTER);


        left=new Button("Back");
        right=new Button("Next");
        left.setPrefWidth(70);
        right.setPrefWidth(70);
        left.setTooltip(new Tooltip("Go to the previous page"));
        right.setTooltip(new Tooltip("Go to the next page"));
        left.setOnAction(this::processButtonPress);
        right.setOnAction(this::processButtonPress);

        HBox buttons = new HBox(left, right);
        buttons.setAlignment(Pos.CENTER);
        buttons.setSpacing(30);

        VBox root = new VBox(content, buttons);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: white");
        root.setSpacing(20);

        Scene scene = new Scene(root, 250, 300);

        stage.setTitle("Light Bulb");
        stage.setScene(scene);
        stage.show();
    }

    private void processButtonPress(javafx.event.ActionEvent actionEvent) {
        if (actionEvent.getSource() == left)
        {
            count--;
           /* content
            bulbView.setViewport(new Rectangle2D(0, 300, 200, 300)); */
        }
        else
        {
            count++;
          /*  bulbView.setViewport(new Rectangle2D(0, 0, 125, 200)); // off
            offButton.setDisable(true);
            onButton.setDisable(false);*/
        }
        if (count==0)
            left.setDisable(true);
        if (count==2)
            right.setDisable(true);
        if(count==1) {
            left.setDisable(false);
            right.setDisable(false);
        }
        content.setText(show[count]);
    }
}
