package AdvanceCS;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Project3New extends GridPane {

    Font font1= Font.font("Verdana", FontWeight.BOLD, FontPosture.ITALIC, 35);
    Font font2= Font.font("幼圆", FontWeight.NORMAL,FontPosture.REGULAR,17);
    Font font3= Font.font("Arial", FontWeight.LIGHT, FontPosture.REGULAR, 16);
    Font font4= Font.font("Impact", FontWeight.NORMAL, FontPosture.ITALIC, 20);
    VBox root,choices;
    Button more;
    ImageView example1;
    CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6,checkBox7,checkBox8,checkBox9,checkBox10;
    Label label1,label2,label3,label4;
    double count=0, finished=0;
    GridPane gridpane,gridroot;
    ScrollPane sp = new ScrollPane();
    ProgressBar progressBar;

    public Project3New(){

        label1 = new Label("3. Managing Complexity");

        checkBox1 = new CheckBox("包括一段能体现程序复杂性的list代码。");
        checkBox2 = new CheckBox("解释选定的list如何体现并实现程序代码中的复杂性。\n（为什么不使用这个列表就不能实现目标，或如何以不同的方式编写）");
        label1.setFont(font1);
        checkBox1.setFont(font2);
        checkBox2.setFont(font2);

        label2=new Label("Remember the following requirement");
        label2.setFont(font4);
        label3=new Label("1. The code segments containing the lists are separately included in the written response section." +
                "\n2. The written response names the selected list (or other collection type).\n" +
                "3. The use of the list is highly relevant in the program.\n" +
                "4. The explanation applies to the selected list.\n" +
                "5. The explanation of how the list manages complexity is credible, accurate, or consistent with the program.\n" +
                "6. The solution without the list is credible, accurate, or consistent with the program.\n" +
                "7. The use of the list makes the program easier to develop.\n" +
                "8. The use of the list makes the program easier to maintain.");

        checkBox3=new CheckBox("所有包含list的代码在回答中分开解释");
        checkBox4=new CheckBox("回答中指明代码中list（或其他数据结构）的名字");
        checkBox5=new CheckBox("list的使用和程序目标高度相关");
        checkBox6=new CheckBox("回答适用于对应的List");
        checkBox7=new CheckBox("解释List是如何丰富程序时，内容要精准，可信，并和程序一致");
        checkBox8=new CheckBox("未使用list的解决方案要精准，可信，并和程序一致");
        checkBox9=new CheckBox("list的使用使程序开发更简单");
        checkBox10=new CheckBox("list的使用使程序维护更简单");

        /*choices= new VBox();
        choices.getChildren().addAll(checkBox3,checkBox4,checkBox5,checkBox6,checkBox7,checkBox8,checkBox9,checkBox10);
        choices.setAlignment(Pos.CENTER);*/
        gridpane= new GridPane();
        gridpane.addColumn(0,checkBox3,checkBox4,checkBox5,checkBox6,checkBox7,checkBox8,checkBox9,checkBox10);
        gridpane.setAlignment(Pos.CENTER_LEFT);
        gridpane.setVgap(10);


        label3.setFont(font3);
        Image example= new Image("file:D:\\Grade 12\\Advance CS\\3b.png");
        example1=new ImageView(example);
        example1.setPreserveRatio(true);
        example1.setFitHeight(500);
        example1.setVisible(false);
        more= new Button();
        more.setText("Check out the example!");
        more.setFont(Font.font("Sitka Small",26));
        more.setAlignment(Pos.CENTER);
        more.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                count++;
                if(count%2==0)
                    example1.setImage(null);
                if(count%2==1)
                    example1.setImage(example);
            }
        });

        /*root= new VBox(label1,checkBox1,checkBox2,label2,label3,choices,more,example1);
        root.setPadding(new Insets(45, 50, 45, 50));

        root.setPrefWidth(1500);
        root.setSpacing(30);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: white");
        sp.setContent(root);
        sp.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
*/
        progressBar= new ProgressBar();
        CheckBox[] checkBox = new CheckBox[]{checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6,checkBox7,checkBox8,checkBox9,checkBox10};
        for (CheckBox c :
                checkBox) {
            c.setOnMouseClicked(event -> {finished = 0;
                for (CheckBox ch : checkBox) {
                    finished += ch.isSelected() ? 1 : 0;
                }
                progressBar.setProgress(finished / checkBox.length);});
        }
        progressBar.setTranslateX(180);
        progressBar.setTranslateY(340);

        gridroot=new GridPane();
        gridroot.addColumn(0,label1,checkBox1,checkBox2,label2,label3,gridpane,more,progressBar,example1);
        gridroot.setPrefWidth(800);
        gridroot.setPadding(new Insets(20));
        gridroot.setVgap(30);
        gridroot.setAlignment(Pos.CENTER_LEFT);
        gridroot.setStyle("-fx-background-color: white");

        /*sp.setContent(root);
        sp.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);*/

        sp.setContent(gridroot);
        sp.setPadding(new Insets(100));
        getChildren().addAll(sp);
    }


}
