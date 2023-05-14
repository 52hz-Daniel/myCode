package AdvanceCS;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import javafx.scene.control.*;

import java.awt.color.ColorSpace;

public class Tank extends Application {

    private Button addOne, addTwo;
    private Group root;
    private TankOne one, two;
    public final static int JUMP = 15;
    private boolean RorL;
    private Rectangle bullet1, bullet2;
    private double toward;

    public void start(Stage primaryStage){

        addOne= new Button("Add one tank");

        addOne.setTranslateX(400);
        addOne.setTranslateY(300);
        addOne.setOnAction(this::processStart1ButtonAction);

        addTwo= new Button("Add two tank");

        addTwo.setTranslateX(600);
        addTwo.setTranslateY(300);
        addTwo.setOnAction(this::processStart2ButtonAction);

      //  root = new Group(addOne,addTwo);

        one= new TankOne();
        one.setTranslateX(100);
        one.setTranslateY(100);
        toward= one.getRotate();
       // one.setScaleX(2);
       // one.setScaleY(2);
        two= new TankOne();
        two.setTranslateY(700);
        two.setTranslateX(1000);
        //two.setScaleY(2);
        //two.setScaleX(2);
        root = new Group(one,two);
        Scene scene = new Scene(root, 1500, 800, Color.BLACK);
        scene.setOnKeyPressed(this::processKeyPress);
    //    scene.setOnKeyPressed(this::processKeyPress2);

        primaryStage.setTitle("Tank!");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public void processStart1ButtonAction(ActionEvent event){

        one= new TankOne();
        addOne.setTranslateX(10000);
        addTwo.setTranslateX(10000);
        one.setTranslateX(100);
        one.setTranslateY(100);
        root.getChildren().addAll(one);

    }
    public void processStart2ButtonAction(ActionEvent event){

        addTwo.setTranslateX(10000);
        addOne.setTranslateX(10000);

        one= new TankOne();
        one.setTranslateX(100);
        one.setTranslateY(100);
        two= new TankOne();
        two.setTranslateY(700);
        two.setTranslateX(1000);
        root.getChildren().addAll(one,two);

    }



    public void processKeyPress(KeyEvent event) {

        switch (event.getCode()) {
            case W:
                one.getTankAll().setRotate(toward);
                if (one.getTranslateY()>0 ) {
                    one.setTranslateY(one.getTranslateY()-JUMP);
                }
//                if (event.getCode()== KeyCode.SPACE&&event.getCode()==KeyCode.W){
//                 //   KeyEvent a=new KeyEvent(s);
//
//                  //  KeyCode a = new KeyCode()
//                    this::processKeyPress().KeyCode.SPACE;
//                }

                break;

            case S:
                one.getTankAll().setRotate(toward+180);
                if (one.getTranslateY() < (800 - 40)) {
                    one.setTranslateY(one.getTranslateY()+JUMP);
                }
                break;
            case D:
                one.getTankAll().setRotate((toward+90));
                if (one.getTranslateX() < (1500 - 40)) {
                    one.setTranslateX(one.getTranslateX()+JUMP);
                }
                break;
            case A:
                one.getTankAll().setRotate(toward+270);
                if (one.getTranslateX() >(0)) {
                    one.setTranslateX(one.getTranslateX()-JUMP);
                }
                break;
            case UP:
                two.getTankAll().setRotate(toward);
                if (two.getTranslateY()>0 ) {
                    two.setTranslateY(two.getTranslateY()-JUMP);
                }
                break;
            case DOWN:
                two.getTankAll().setRotate(toward+180);
                if (two.getTranslateY() < (800 - 40)) {
                    two.setTranslateY(two.getTranslateY()+JUMP);
                }
                break;
            case RIGHT:
                two.getTankAll().setRotate(toward+90);
                if (two.getTranslateX() < (1500 - 40)) {
                    two.setTranslateX(two.getTranslateX()+JUMP);
                }
                break;
            case LEFT:
                two.getTankAll().setRotate(toward+270);
                if (two.getTranslateX() > (0)) {
                    two.setTranslateX(two.getTranslateX() - JUMP);
                }
                break;
            case E:

                one.ChangeAngle(true);
                break;
            case Q:

                one.ChangeAngle(false);
                break;


            case PAGE_DOWN:

                two.ChangeAngle(true);
                break;
            case PAGE_UP:

                two.ChangeAngle(false);
                break;
            default:
                break;  // do nothing if it's not an arrow key
            case SPACE:
               one.Shoot1();
                break;

            case ENTER:
                two.Shoot2();
                break;

        }
    }

}
