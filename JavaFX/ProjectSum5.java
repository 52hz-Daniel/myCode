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
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class ProjectSum5 extends Pane {
    Image q3d;
    ImageView q3dVIew;
    Boolean checkAnswer = false;
    ProgressBar progressBar;
    double finished;
    CheckBox c1, c2, c3, c4, c5, c6, c7, c8,c9;
    private ScrollPane rootPane= new ScrollPane();
    private VBox vBox;
    public ProjectSum5() {
        progressBar = new ProgressBar(0);
        q3d = new Image("file:D:\\Grade 12\\Advance CS\\3c3.png");
        q3dVIew = new ImageView();
        q3dVIew = new ImageView();
        q3dVIew.setFitWidth(480);
        q3dVIew.setPreserveRatio(true);
      //  q3dVIew.setFitHeight(1000);
        Font font = Font.font("Verdana", FontWeight.NORMAL, FontPosture.ITALIC, 10);
        Label label = new Label("算法实现");
        label.setFont(new Font(30));
        Label label5 = new Label("评分标准");
        label5.setFont(new Font(20));
        Label label1 = new Label("书面回答描述了:");
        GridPane check1 = new GridPane();
        c1 = new CheckBox("包含两个代码段\n一个显示学生开发的程序，至少有一个参数对该程序的功能有影响\n" +
                "一个显示学生开发的程序正在被调用的地方");
        c2 = new CheckBox("描述了所确定的程序是做什么的，以及它对程序的整体功能有何贡献。");
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
        Label label3 = new Label("评分时只看书面回答3c中的程序\n" +
                "对程序代码段的要求:");
        c3=new CheckBox("该程序必须是学生开发的，但也可以是与伙伴合作开发的");
        c4=new CheckBox("如果包含多个程序，则使用第一个程序来决定是否获得该分数");
        c5=new CheckBox("由程序组成的代码段必须包括在书面回答部分");
        c6=new CheckBox("该程序不能是一个内置的或现有的程序或语言结构，如事件处理程序或主方法，\n学生实现该程序的主体，同时要定义名称、返回类型和参数");
        c7=new CheckBox("书面回答将该实现过程其与程序的整体功能联系起来");
        GridPane check2 = new GridPane();
        check2.addColumn(0, c3, c4, c5, c6, c7);
        check2.setVgap(5);
        check2.setAlignment(Pos.CENTER);
        CheckBox[] checkBox = new CheckBox[]{c1, c2, c3, c4, c5, c6, c7};
        for (CheckBox c :
                checkBox) {
            c.setOnMouseClicked(event -> {finished = 0;
                for (CheckBox ch :
                        checkBox) {
                    finished += ch.isSelected() ? 1 : 0;
                }
                progressBar.setProgress(finished / checkBox.length);});
        }
//
        vBox = new VBox(label, label5, label1, check1, label4, label3, check2, label2, q3dVIew,progressBar);
//        Group root = new Group(vBox, progressBar);
        vBox.setAlignment(Pos.CENTER);
//        WebView browser = new WebView();
//        WebEngine webEngine = browser.getEngine();
        progressBar.setTranslateX(170);
//        progressBar.setTranslateY(776);
      //  rootPane= new ScrollPane();
        rootPane.setContent(vBox);
        rootPane.setPrefSize(500,600);
        rootPane.setStyle("-fx-background-color: white");
        rootPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        getChildren().add(rootPane);
    }
    public void processClick(MouseEvent event){
        q3dVIew.setImage(checkAnswer ? q3d : null);
    }
}
