package AdvanceCS;

import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ScrollPane;
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

public class ProjectSum2 extends Pane {
    Image q3d;
    ImageView q3dVIew;
    Boolean checkAnswer = false;
    ProgressBar progressBar;
    double finished;
    CheckBox c1, c2, c3, c4, c5, c6, c7, c8,c9;
    public ProjectSum2() {
        progressBar = new ProgressBar(0);
        q3d = new Image("file:D:\\Grade 12\\Advance CS\\3b.png");
        q3dVIew = new ImageView();
        q3dVIew.setFitWidth(500);
        q3dVIew.setFitHeight(400);
        Font font = Font.font("Verdana", FontWeight.NORMAL, FontPosture.ITALIC, 10);
        Label label = new Label("数据抽象");
        label.setFont(new Font(30));
        Label label5 = new Label("评分标准");
        label5.setFont(new Font(20));
        Label label1 = new Label("书面回答描述了:");
        GridPane check1 = new GridPane();
        c1 = new CheckBox("一段能体现程序是如何被储存在list中的代码段，\n并解释这个list是如何实现程序的目标");
        c2 = new CheckBox("标明回答中使用的list的变量名称");
        c3=new CheckBox("描述这个list中包含的数据在程序中代表什么");
        check1.addColumn(0, c1, c2,c3);
        check1.setVgap(8);
        check1.setAlignment(Pos.CENTER);
        Label label2 = new Label("Click to view the example");
        label2.setTextFill(Color.BLUE);
        label2.setFont(font);
        label2.setOnMouseClicked(this::processClick);
        label2.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {checkAnswer = ! checkAnswer;
            label2.setTextFill(checkAnswer ? Color.RED : Color.BLUE);});
        Label label4 = new Label("判定规则");
        label4.setFont(new Font(20));
        Label label3 = new Label("评分时只看书面回答3b中的程序");

        c4=new CheckBox("回答必须包括两个清晰可辨的程序代码段\n(可以是不连续的也可以是一个连续的代码段的两个部分）" );
        c5=new CheckBox("只能包含两个或两个以下的代码段");
        c6=new CheckBox("List在程序中是有价值的，不能为了使用而使用");
        GridPane check2 = new GridPane();
        check2.addColumn(0, c4, c5, c6);
        check2.setVgap(8);
        check2.setAlignment(Pos.CENTER);
        CheckBox[] checkBox = new CheckBox[]{c1, c2, c3, c4, c5, c6};
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
        progressBar.setTranslateX(380);
        progressBar.setTranslateY(776);
        vBox.setSpacing(10);
        getChildren().add(root);
    }
    public void processClick(MouseEvent event){
        q3dVIew.setImage(checkAnswer ? q3d : null);
    }
}
