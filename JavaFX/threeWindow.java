package AdvanceCS;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class threeWindow extends Application {
    public void start(Stage primaryStage){
        Image image1 = new Image("file:D:\\Grade 12\\Advance CS\\wake.jpg");
        ImageView imageView1 = new ImageView(image1);

    //    imageView1.setViewport(new Rectangle2D(200, 80, 70, 60));
        Image image2 = new Image("file:D:\\Grade 12\\Advance CS\\brush.jpg");
        ImageView imageView2 = new ImageView(image2);
       // imageView2.setViewport(new Rectangle2D(400, 80, 70, 60));
        Image image3 = new Image("file:D:\\Grade 12\\Advance CS\\eat.jpg");
        ImageView imageView3 = new ImageView(image3);
        //imageView3.setViewport(new Rectangle2D(600, 80, 300, 200));
        FlowPane pane= new FlowPane(imageView1,imageView2,imageView3);
//        StackPane pane = new StackPane(imgView);
        pane.setStyle("-fx-background-color: yellow");
        Scene scene = new Scene(pane, 1200, 900);

        primaryStage.setTitle("threeWindow");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
