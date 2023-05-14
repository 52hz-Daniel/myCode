package AdvanceCS;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
public class Project3b extends GridPane {
    private Font font1= Font.font("Verdana", FontWeight.BOLD, FontPosture.ITALIC, 40);
    private Font font2= Font.font("Microsoft YaHei UI", FontWeight.LIGHT, FontPosture.REGULAR, 18);
    private Font font3= Font.font("Arial", FontWeight.LIGHT, FontPosture.REGULAR, 18);
    private Font font4= Font.font("Impact", FontWeight.NORMAL, FontPosture.ITALIC, 20);
    private VBox root;
    private Button more;
    private ImageView example1;
    private CheckBox checkBox1,checkBox2;
    private Label label1,label2,label3;
    private int count=0;
    private GridPane gridpane;
    private ScrollPane sp = new ScrollPane();

    public Project3b(){
        gridpane = new GridPane();


        label1= new Label("3. Managing Complexity");
        label1.setFont(font1);
        checkBox1 = new CheckBox("includes a program code segment that shows a list being used to manage complexity in the program.");
        checkBox2 = new CheckBox("explains how the named, selected list manages complexity in the program code by explaining why \n the program code could not be written, or how it would be written differently, without using this list.");
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
        label3.setFont(font3);
        Image example= new Image("file:D:\\Grade 12\\Advance CS\\3b.png");
        example1=new ImageView(example);
        example1.setPreserveRatio(true);
        example1.setFitHeight(500);
        example1.setVisible(false);
        more= new Button();
        more.setText("Check out the example!");
        more.setFont(Font.font("Sitka Small",26));
        more.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                count++;
                if(count%2==0)
                    example1.setVisible(false);
                if(count%2==1)
                    example1.setVisible(true);
            }
        });

        root= new VBox(label1,checkBox1,checkBox2,label2,label3,more,example1);
        root.setPadding(new Insets(45, 50, 45, 50));
        root.setPrefWidth(1500);
        root.setSpacing(30);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: white");
        sp.setContent(root);
        sp.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        getChildren().addAll(sp);
    }
}
