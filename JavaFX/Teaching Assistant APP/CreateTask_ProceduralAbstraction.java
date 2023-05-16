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
        Label label = new Label("�������");
        label.setFont(new Font(30));
        Label label5 = new Label("���ֱ�׼");
        label5.setFont(new Font(20));
        Label label1 = new Label("����ش�������:");
        GridPane check1 = new GridPane();
        c1 = new CheckBox("���δ��룬һ�κ������壨��Ҫ���βΣ���һ�κ�������");
        c2 = new CheckBox("�����������ʲô");
        c3 = new CheckBox("�����幦���кι��ף���ϳ���Ŀ�Ļش�");
        check1.addColumn(0, c1, c2, c3);
        check1.setVgap(10);
        check1.setAlignment(Pos.CENTER);
        Label label2 = new Label("Click to view the example");
        label2.setTextFill(Color.BLUE);
        label2.setFont(font);
        label2.setOnMouseClicked(this::processClick);
        label2.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {checkAnswer = ! checkAnswer;
            label2.setTextFill(checkAnswer ? Color.RED : Color.BLUE);});
        Label label4 = new Label("�ж�����");
        label4.setFont(new Font(20));
        Label label3 = new Label("����ʱֻ������ش�3c\n" +
                "�Դ����Ҫ��\n");
        c4 = new CheckBox("������ѧ���Լ�д�ģ��ɶ��˺���");
        c5 = new CheckBox("����ش��ж���һ��������ֻ����һ������");
        Label label6 = new Label("��Ҫ�������£����򲻵÷�:\n");
        c6 = new CheckBox("����ش��а����˺���");
        c7 = new CheckBox("�������Լ�define�ĺ�����������implement�Ѵ��ڵĺ���");
        c8 = new CheckBox("��������������������Ĺ�������ϵ");
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