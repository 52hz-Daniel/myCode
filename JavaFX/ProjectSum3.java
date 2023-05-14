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

public class ProjectSum3 extends Pane {
    Image q3d;
    ImageView q3dVIew;
    Boolean checkAnswer = false;
    ProgressBar progressBar;
    double finished;
    CheckBox c1, c2, c3, c4, c5, c6, c7, c8,c9;
    public ProjectSum3() {
        progressBar = new ProgressBar(0);
        q3d = new Image("file:D:\\Grade 12\\Advance CS\\3b.png");
        q3dVIew = new ImageView();
        q3dVIew.setFitWidth(500);
        q3dVIew.setFitHeight(400);
        Font font = Font.font("Verdana", FontWeight.NORMAL, FontPosture.ITALIC, 10);
        Label label = new Label("管理复杂度");
        label.setFont(new Font(30));
        Label label5 = new Label("评分标准");
        label5.setFont(new Font(20));
        Label label1 = new Label("书面回答描述了:");
        GridPane check1 = new GridPane();
        c1 = new CheckBox("一段能体现程序复杂性的list代码");
        c2 = new CheckBox("解释选定的list如何体现并实现程序代码中的复杂性。\n（为什么不使用这个列表就不能实现目标，或如何以不同的方式编写）");
        check1.addColumn(0, c1, c2);
        check1.setVgap(5);
        check1.setAlignment(Pos.CENTER);
        Label label2 = new Label("Click to view the example");
        label2.setTextFill(Color.BLUE);
        label2.setFont(font);
        label2.setOnMouseClicked(this::processClick);
        label2.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {checkAnswer = ! checkAnswer;
            label2.setTextFill(checkAnswer ? Color.RED : Color.BLUE);});
        Label label4 = new Label("判定规则");
        label4.setFont(new Font(20));
        Label label3 = new Label("评分时只看书面回答3b中的程序\n" +
                "第二部分没得分不影响本部分得分\n" +
                "在本部分需要满足以下要求，否则不得分:\n");
        c3=new CheckBox("所有包含list的代码在回答中分开解释");
        c4=new CheckBox("回答中指明代码中list（或其他数据结构）的名字");
        c5=new CheckBox("list的使用和程序目标高度相关");
        c6=new CheckBox("回答适用于对应的List");
        c7=new CheckBox("解释List是如何丰富程序时，内容要精准，可信，并和程序一致");
        c8=new CheckBox("未使用list的解决方案要精准，可信，并和程序一致");
        c9=new CheckBox("list的使用使程序开发和维护更简单");
        GridPane check2 = new GridPane();
        check2.addColumn(0, c3, c4, c5, c6, c7, c8, c9);
        check2.setVgap(5);
        check2.setAlignment(Pos.CENTER);
        CheckBox[] checkBox = new CheckBox[]{c1, c2, c3, c4, c5, c6, c7, c8,c9};
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
        getChildren().add(root);
    }
    public void processClick(MouseEvent event){
        q3dVIew.setImage(checkAnswer ? q3d : null);
    }
}
