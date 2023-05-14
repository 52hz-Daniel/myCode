package AdvanceCS;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.File;

public class CreateTask_Testing extends Pane {
    Image q3d;
    ImageView q3dVIew;
    Boolean checkAnswer = false;
    ProgressBar progressBar;
    double finished;
    CheckBox c1, c2, c3, c4, c5, c6, c7, c8;
    public CreateTask_Testing(){
        progressBar = new ProgressBar(0);
        q3d = new Image("file:D:\\Grade 12\\Advance CS\\3b1.png");
        q3dVIew = new ImageView();
        q3dVIew.setPreserveRatio(true);
        q3dVIew.setFitWidth(500);
        Font font = Font.font("Verdana", FontWeight.NORMAL, FontPosture.ITALIC, 10);
        Label label = new Label("测试");
        label.setFont(new Font(50));
        Label label5 = new Label("评分标准");
        label5.setFont(new Font(30));
        Label label1 = new Label("书面回答描述了:");
        GridPane check1 = new GridPane();
        c1 = new CheckBox("对3c中的函数的两次调用，\n每次调用必须传不同的实参使得3c中的程序的不同部分运行（如使用if else）");
        c2 = new CheckBox("每次调用时产生的条件判断");
        c3 = new CheckBox("每次调用的结果");
        check1.addColumn(0, c1, c2, c3);
        check1.setVgap(10);
        check1.setAlignment(Pos.CENTER);
        Label label2 = new Label("Click to view the example");
        label2.setTextFill(Color.BLUE);
        label2.setFont(font);
        label2.setOnMouseClicked(this::processClick);
        label2.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {checkAnswer = ! checkAnswer;
            label2.setTextFill(checkAnswer ? Color.RED : Color.BLUE);});
        Label label4 = new Label("判定规则");
        label4.setFont(new Font(30));
        Label label3 = new Label("评分时只看书面回答3d和3c中的程序\n" +
                "第四部分没得分不影响本部分得分\n" +
                "需要满足以下，否则不得分:\n");
        c4 = new CheckBox("3c中点明了是哪个函数且这个函数有形参");
        c5 = new CheckBox("3d的回答与3c中的程序匹配");
        c6 = new CheckBox("两次调用导致了函数的不同部分运行");
        c7 = new CheckBox("书面回答描述的条件判断与函数相符");
        c8 = new CheckBox("书面回答描述的结果与函数相符");
        GridPane check2 = new GridPane();
        check2.addColumn(0, c4, c5, c6, c7, c8);
        check2.setVgap(10);
        check2.setAlignment(Pos.CENTER);

        CheckBox[] checkBox = new CheckBox[]{c1, c2, c3, c4, c5, c6, c7, c8};
        for (CheckBox c :
                checkBox) {
            c.setOnMouseClicked(event -> {finished = 0;
                for (CheckBox ch :
                        checkBox) {
                    finished += ch.isSelected() ? 1 : 0;
                }
                progressBar.setProgress(finished / checkBox.length);});
        }

        VBox vBox = new VBox(label, label5, label1, check1, label4, label3, check2, label2, q3dVIew);
        Group root = new Group(vBox, progressBar);
        vBox.setAlignment(Pos.CENTER);
        progressBar.setTranslateX(280);
        progressBar.setTranslateY(600);
        getChildren().add(root);
//        Group root = new Group(vBox);
//        Scene scene = new Scene(root,500,800);
//        primaryStage.setScene(scene);
//        primaryStage.show();
    }

    public void processClick(MouseEvent event){
        q3dVIew.setImage(checkAnswer ? q3d : null);
    }
}