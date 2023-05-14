package AdvanceCS;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class imageSize extends HBox{
    private Font font1,font2, font3;
    private String bigName, midName, smallName;
    private RadioButton big, mid, small;
    private Image img;
    private ImageView a;
    private double w,h;
 //   private Circle redLight, yellowLight, greenLignt;

    public imageSize(){
        font1= new Font("Arial", 36);
        // font2= new Font()

        //img= new Image ("file:D:\\Grade 12\\Advance CS\\tracer.jpg",100,100,false,false);
        img= new Image ("file:D:\\Grade 12\\Advance CS\\tracer.jpg");
        a = new ImageView(img);

//        h=(a.getLayoutX())/50;
//        w=(a.getLayoutY())/50;
//        System.out.println(h);
//        System.out.println(w);
          a.setFitHeight(300);
      //   a.setFitWidth(w/50);
        a.setPreserveRatio(true);


        StackPane square = new StackPane(a);
        square.setPrefSize(400, 200);

        ToggleGroup selected = new ToggleGroup();

        //= new String("go");
       // textYellow= new String("caution");
        //textRed= new String("stop");

        big= new RadioButton("Big Image");
        big.setSelected(true);
        big.setToggleGroup(selected);
        big.setOnAction(this::processRadioButtonAction);

        mid= new RadioButton("Medium Image");
        mid.setToggleGroup(selected);
        mid.setOnAction(this::processRadioButtonAction);

        small= new RadioButton("Small Image");
        small.setToggleGroup(selected);
        small.setOnAction(this::processRadioButtonAction);

        big.setFont(font1);
        mid.setFont(font1);
        small.setFont(font1);

        VBox options = new VBox(big, mid,small);
        options.setAlignment(Pos.CENTER_LEFT);
        options.setSpacing(20);
        options.

        setSpacing(20);
        getChildren().addAll(options, square);

    }
    public void processRadioButtonAction(ActionEvent event)
    {
       // double h= a.getFitHeight();
       // double w= a.getFitWidth();
       // a.setFitWidth(w);
        //a.setFitHeight(h);
        if (big.isSelected()) {
           // img.setFitHeight(500);
            a.setFitHeight(600);
         //   a.setFitWidth(w*2);

          //  a.setFitHeight(100);
        }

        else if (mid.isSelected()) {
            //a.setFitWidth(400);
            a.setFitHeight(400);
        //    a.setFitWidth(w*1.2);
        }

        else {
            //a.setFitWidth(200);
            a.setFitHeight(150);
         //   a.setFitWidth(w*0.5);
        }

    }
}
