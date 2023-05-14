package AdvanceCS;

import javafx.application.Application;
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
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Project34 extends GridPane {

    private Font font1= Font.font("Verdana", FontWeight.BOLD, FontPosture.ITALIC, 35);
    public Project34(){

        Label label1 = new Label("3. Managing Complexity");

        CheckBox checkBox1 = new CheckBox("includes a program code segment that shows a list being used to manage complexity in the program.");
        CheckBox checkBox2 = new CheckBox("explains how the named, selected list manages complexity in the program code by explaining why the program code could not be written, or how it would be written differently, without using this list.");

        Label label2 = new Label("4. Procedural Abstraction");

        CheckBox checkBox3 = new CheckBox("one showing a student-developed procedure with at least one parameter that has an effect on the functionality of the procedure.");
        CheckBox checkBox4= new CheckBox("one showing where the student-developed procedure is being called.");
        CheckBox checkBox5= new CheckBox("describes what the identified procedure does and how it contributes to the overall functionality of the program.");

        label1.setFont(font1);
     //   checkBox3;
        /*Text a= new Text("a");
        a.setFill(Color.LIGHTCORAL);*/

        VBox root3= new VBox(label1,checkBox1,checkBox2);
        root3.setPadding(new Insets(15, 15, 15, 25));
        root3.setSpacing(10);
        root3.setAlignment(Pos.BASELINE_LEFT);
        root3.setStyle("-fx-background-color: white");


        ScrollPane s1 = new ScrollPane();
        s1.setVmax(900);
        s1.setPrefSize(1500,900);
       /* s1.setValue(100);
        s1.setUnitIncrement(30);
        s1.setBlockIncrement(35);

        s1.setContent(root3);
        s1.setOrientation(Orientation.VERTICAL);*/

        root3.getChildren().add(s1);

        VBox.setVgrow(s1, Priority.ALWAYS);




        Button more= new Button();
        more.setText("Check out the example!");
        more.setFont(Font.font("Sitka Small",26));
        root3.getChildren().add(more);
        more.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                VBox example1= new VBox();
                example1.setAlignment(Pos.CENTER_LEFT);

                Label title1= new Label();
                title1.setText("3b (i)");
                title1.setFont(Font.font("Arial",FontWeight.BOLD,25));

                Image b1= new Image("file:D:\\Grade 12\\Advance CS\\coke1.jpg");
                ImageView b1View= new ImageView(b1);
                b1View.setFitHeight(100);
                b1View.setPreserveRatio(true);

                Label title2= new Label();
                title2.setText("ii.");
                title2.setFont(Font.font("Arial",FontWeight.BOLD,25));

                Image b2= new Image("file:D:\\Grade 12\\Advance CS\\coke1.jpg");
                ImageView b2View= new ImageView(b2);
                b2View.setFitHeight(100);
                b2View.setPreserveRatio(true);

                Label title3= new Label();
                title3.setText("iii.");
                Label answer3= new Label("weather_dict");
                Label answer4= new Label("This dictionary contains 7 keys, from ‘0’ to ‘6’, representing 7 days in a row. Each key is linked to a sub-dictionary storing weather information, which consist of title, weather, highest temperature, lowest temperature, and wind scale.");
                Label title4= new Label();
                title4.setText("iv.");
                Label answer5= new Label("The use of a dictionary simplifies the program through the mapping of unique keys and values. The dictionary is mutable, so we can change it and add data throughout the running of the program. By inserting values like temperature, weather, and other information and linking them to the descriptive keys, we can access particular values of interest. For example, when I wrote the visualization part of the code, I only need the temperature information, so I could simply take out all the temperatures in 7 days and use them. Without the dictionary, I would need to set a lot of independent variables to store the values, or use several lists, which would almost certainly add to the complexity of the program.");
                Label title5= new Label();
                title5.setText("v.");

                example1.getChildren().addAll(title1,b1View,title2,b2View,title3,answer3,title4,answer4,title5,answer5);
                root3.getChildren().addAll(example1);
            }
        });


        VBox root4= new VBox(label2,checkBox3,checkBox4,checkBox5);
        root4.setPadding(new Insets(15, 15, 15, 25));
        root4.setSpacing(10);
        root4.setAlignment(Pos.CENTER_LEFT);
        root4.setStyle("-fx-background-color: white");

        VBox root= new VBox(root3,root4);
        root.setPadding(new Insets(15, 15, 15, 25));
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: lightcoral");

        getChildren().addAll(root);


    }


}
