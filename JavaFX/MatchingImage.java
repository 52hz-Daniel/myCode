package AdvanceCS;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

import java.io.File;


public class MatchingImage extends Application {
    private ImageView a, b, c, d;
    private AudioClip[] tunes;
   // private File present;
    private AudioClip present;
    private File[] audioFiles;
    private ImageView[] pictures;
    private ImageView display;
    private int countMusic=0,countImage=0;





    public void start(Stage primaryStage){
        Image img1 = new Image( "file:D:\\Grade 12\\Advance CS\\test1.png");
        Image img2 = new Image( "file:D:\\Grade 12\\Advance CS\\coke1.jpg");
        Image img3 = new Image( "file:D:\\Grade 12\\Advance CS\\coke.jfif");
        Image img4 = new Image( "file:D:\\Grade 12\\Advance CS\\coke3.jfif");

        a= new ImageView(img1);
        b= new ImageView(img2);
        c= new ImageView(img3);
        d= new ImageView(img4);

        ImageView[] localPic= {a,b,c,d};
        pictures=new ImageView[localPic.length];
        for (int i = 0; i < localPic.length; i++)
            pictures[i] = localPic[i];

        audioFiles = new File[]{new File("D:\\Grade 12\\Advance CS\\westernBeat.wav"),
                new File("D:\\Grade 12\\Advance CS\\classical.wav"), new File("D:\\Grade 12\\Advance CS\\jeopardy.mp3"),
                new File("D:\\Grade 12\\Advance CS\\eightiesJam.wav"), new File("D:\\Grade 12\\Advance CS\\newAgeRythm.wav")};

      //  pictures= new ImageView[]{a,b,c,d};
        display=pictures[countImage];


        tunes = new AudioClip[audioFiles.length];
        for (int i = 0; i < audioFiles.length; i++)
            tunes[i] = new AudioClip(audioFiles[i].toURI().toString());
        present= tunes[countMusic];
      //  present= audioFiles[countMusic];
        VBox root = new VBox(display);
        root.setPadding(new Insets(15, 15, 15, 25));
        root.setSpacing(10);
        root.setStyle("-fx-background-color: skyblue");

        Scene scene = new Scene(root, 1500, 900);

        scene.setOnMouseClicked(this::processMouseClick);
        primaryStage.setTitle("Pictures");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void processMouseClick(MouseEvent mouseEvent) {
        if (countImage<4&&countImage>=0){

            countImage++;
        }
        else {
            countImage=0;
        }
        if (countMusic<5&&countMusic>=0){
            countMusic++;
        }
        else {
            countMusic=0;
        }
        present.stop();
        display=pictures[countImage];
        present=tunes[countMusic];
        present.play();

    }
    public static void main(String[] args)
    {
        launch(args);
    }



}
