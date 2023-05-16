package CrtTask;

import javafx.geometry.Pos;
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

public class CreateTask_ProceduralAbstraction extends Pane {
    Image q3c;
    ImageView q3cView;
    Boolean checkAnswer = false;
    ProgressBar progressBar;
    double finished= 0;
    CheckBox c1, c2, c3, c4, c5, c6, c7, c8;
    public CreateTask_ProceduralAbstraction(){
        setUserData(finished);
        progressBar = new ProgressBar(0);
        q3c = new Image("q3c.png");
        q3cView = new ImageView();
        q3cView.setPreserveRatio(true);
        q3cView.setFitWidth(480);
        Font font = Font.font("Verdana", FontWeight.NORMAL, FontPosture.ITALIC, 10);
        Label label = new Label("程序设计");
        label.setFont(new Font(30));
        Label label5 = new Label("评分标准");
        label5.setFont(new Font(20));
        Label label1 = new Label("书面回答描述了:");
        GridPane check1 = new GridPane();
        c1 = new CheckBox("两段代码，一段函数定义（需要有形参），一段函数调用");
        c2 = new CheckBox("这个函数做了什么");
        c3 = new CheckBox("对整体功能有何贡献（结合程序目的回答）");
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
        label4.setFont(new Font(20));
        Label label3 = new Label("评分时只看书面回答3c\n" +
                "对代码的要求：\n");
        c4 = new CheckBox("必须是学生自己写的，可多人合作");
        c5 = new CheckBox("如果回答中多于一个函数，只看第一个评分");
        Label label6 = new Label("需要满足以下，否则不得分:\n");
        c6 = new CheckBox("书面回答中包含此函数");
        c7 = new CheckBox("必须是自己define的函数，不可以implement已存在的函数");
        c8 = new CheckBox("将函数功能与整个程序的功能相联系");
        GridPane check2 = new GridPane();
        check2.addColumn(0, c4, c5);
        check2.setVgap(10);
        check2.setAlignment(Pos.CENTER);
        GridPane check3 = new GridPane();
        check3.addColumn(0, c6, c7, c8);
        check3.setVgap(10);
        check3.setAlignment(Pos.CENTER);

        CheckBox[] checkBox = new CheckBox[]{c1, c2, c3, c4, c5, c6, c7, c8};
        for (CheckBox c :
                checkBox) {
            c.setOnMouseClicked(event -> {finished = 0;
                for (CheckBox ch :
                        checkBox) {
                    finished += ch.isSelected() ? 1 : 0;
                }
                progressBar.setProgress(finished / checkBox.length);
                setUserData(finished);
            });
        }

        VBox vBox = new VBox(label, label5, label1, check1, label4, label3, check2, label6, check3, label2, progressBar, q3cView);
        vBox.setAlignment(Pos.CENTER);
        progressBar.setTranslateX(180);
        ScrollPane scrollPane = new ScrollPane(vBox);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setPrefSize(500,600);
        getChildren().add(scrollPane);
    }

    public void processClick(MouseEvent event){
        q3cView.setImage(checkAnswer ? q3c : null);
    }
}