package AdvanceCS;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

import java.util.concurrent.Flow;

public class CustomForm extends GridPane {
    private Text titleBig, titleSmall, note;
    private CheckBox cb1, cb2,cb3,cb4,cb5;
    private static int fee;

    public CustomForm(){
        Font font1 = new Font("Courier", 30);

        titleBig= new Text("CUSTOMS FORM");
        titleBig.setFont(new Font("Helvetica", 36));
        note = new Text("Restricted Items");
        note.setFont(Font.font("Arial", 30));
        cb1= new CheckBox("Tiger");
        cb2= new CheckBox("Gold>5000$");
        cb3= new CheckBox("TCash>10000$");
        cb4= new CheckBox("Plants");
        cb5= new CheckBox("Gun");
        titleSmall= new Text ("The total fee is "+fee);
        titleSmall.setFont(Font.font("Arial", 36));

        cb1.setFont(font1);
      //  cb1.setShape(font1);
        cb2.setFont(font1);
        cb3.setFont(font1);
        cb4.setFont(font1);
        cb5.setFont(font1);


        cb1.setOnAction(this::processCheckBoxAction);
        cb2.setOnAction(this::processCheckBoxAction);
        cb3.setOnAction(this::processCheckBoxAction);
        cb4.setOnAction(this::processCheckBoxAction);
        cb5.setOnAction(this::processCheckBoxAction);

        add(titleBig,100,0);
        add(note,100,1);
        add(cb1,100,2);
        add(cb2,100,3);
        add(cb3,100,4);
        add(cb4,100,5);
        add(cb5,100,6);
        add(titleSmall,100,7);
        setVgap(20);

        cb1.setTranslateX(50);
        cb2.setTranslateX(50);
        cb3.setTranslateX(50);
        cb4.setTranslateX(50);
        cb5.setTranslateX(50);

       // HBox options = new HBox(boldCheckBox, italicCheckBox);
       // options.setAlignment(Pos.CENTER);
        //options.setSpacing(20);  // between the check boxes
     //   VBox options = new VBox(cb1,cb2,cb3,cb4,cb5);
       // options.setSpacing(70);  // between the text and the check boxes
        //options.setAlignment(Pos.CENTER);

       // Group gp= new Group(cb1,cb2,cb3,cb4,cb5);
        //add(gp)；


    //    HBox allAlign= new HBox(titleBig,options,titleSmall);


     //   FlowPane pane= new FlowPane(titleBig,options,titleSmall);
       // pane.setAlignment(Pos.CENTER);

       // pane.setHgap(10);
     //   getChildren().addAll(pane);
//        add(, 0 ,0);
//        add(restriction,0,1);
//        add(tiger,0,2);
//        add(gold,0,3);
//        add(cash,0,4);
//        add(plants,0,5);
//        add(gun,0,6);
//        add(phrase,0,7);
//        setVgap(20);

    }
    public void processCheckBoxAction(ActionEvent event){
        fee=0;
        if (cb1.isSelected())
            fee+=10000;

        if (cb2.isSelected())
            fee+=10000;
        if (cb3.isSelected())
            fee+=10000;
        if (cb4.isSelected())
            fee+=10000;
        if (cb5.isSelected())
            fee+=10000;
        titleSmall.setText("The total fee is "+fee);

    }


}
