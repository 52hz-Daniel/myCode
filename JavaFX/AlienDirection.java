package AdvanceCS;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.File;

//************************************************************************
//  AlienDirection.java       Author: Lewis/Loftus
//
//  Demonstrates the handling of keyboard events.
//************************************************************************

public class AlienDirection extends Application
{
    public final static int JUMP = 10;

    private ImageView imageView;
    private Image alien;

    //--------------------------------------------------------------------
    //  Displays an image that can be moved using the arrow keys.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
       alien = new Image(new File("D:\\Grade 12\\Advance CS\\alien.png").toURI().toString());

        imageView = new ImageView(alien);
        imageView.setX(20);
        imageView.setY(20);

        Group root = new Group(imageView);

        Scene scene = new Scene(root, 400, 200, Color.BLACK);
        scene.setOnKeyPressed(this::processKeyPress);

        primaryStage.setTitle("Alien Direction");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //--------------------------------------------------------------------
    //  Modifies the position of the image view when an arrow key is
    //  pressed.
    //--------------------------------------------------------------------
    public void processKeyPress(KeyEvent event)
    {

            switch (event.getCode()) {
                case W:
                    if (imageView.getY()>0){
                    imageView.setY(imageView.getY() - JUMP);}
                    break;
                case S:
                    if (imageView.getY()<(200-alien.getHeight())){
                    imageView.setY(imageView.getY() + JUMP);}
                    break;
                case D:
                    if (imageView.getX()<(400-alien.getWidth())){
                    imageView.setX(imageView.getX() + JUMP);}
                    break;
                case A:
                    if (imageView.getX()>0){
                    imageView.setX(imageView.getX() - JUMP);}
                    break;

                default:
                    break;  // do nothing if it's not an arrow key
            }

    }

    public static void main(String[] args)
    {
        launch(args);
    }
}