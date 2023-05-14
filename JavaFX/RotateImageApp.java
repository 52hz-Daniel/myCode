package AdvanceCS;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class RotateImageApp extends Application{
    public void start(Stage primaryStage){

        Image img = new Image("file:\\D:\\Grade 12\\Advance CS\\coke1.jpg");

        ImageView img1= new ImageView(img);
        img1.setFitHeight(100);
        img1.setFitWidth(100);

     //   RotateImage img1= new RotateImage();
        img1.setTranslateX(100);
        img1.setTranslateY(80);
        img1.setRotate(270);


        ImageView img2= new ImageView(img);
      //  RotateImage img2= new RotateImage();
        img2.setTranslateX(250);
        img2.setTranslateY(80);
        img2.setFitHeight(100);
        img2.setFitWidth(100);

      //  RotateImage img3= new RotateImage();
        ImageView img3= new ImageView(img);
        img3.setTranslateX(250);
        img3.setTranslateY(200);
        img3.setRotate(180);
        img3.setFitHeight(100);
        img3.setFitWidth(100);
       // RotateImage img4= new RotateImage();
        ImageView img4= new ImageView(img);
        img4.setTranslateX(100);
        img4.setTranslateY(200);
        img4.setFitHeight(100);
        img4.setFitWidth(100);
        Group root = new Group(img1,img2,img3,img4);

        Scene scene = new Scene(root, 500, 490, Color.WHITE);

        primaryStage.setTitle("Robots");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }

}
