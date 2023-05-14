package AdvanceCS;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class TankOne extends Group {

    final int ANGLE= 5;
    private Group top,tankAll,bulletAll;
    private Line c,d;
    private Circle b;
    private Rectangle a,bullet1, bullet2,bulletTiny;
    private double xDeg,yDeg,xEnd,yEnd,xStart,yStart;

    TankOne(){
        a = new Rectangle(0,0);
        a.setHeight(30);
        a.setWidth(17);
        a.setFill(Color.GREEN);

        b= new Circle(9,15,7);
        b.setFill(Color.YELLOW);

        c= new Line();
        c.setStartX(9);
        c.setStartY(-5);
        c.setEndX(9);
        c.setEndY(15);
        c.setStrokeWidth(3);
        c.setFill(Color.RED);
        c.setStroke(Color.YELLOW);

        d= new Line();
        d.setStartY(34);
        d.setEndY(35);
        d.setStartX(9);
        d.setEndX(9);
        d.setFill(null);
        d.fillProperty().set(null);

        top= new Group(d,c,b);
        tankAll= new Group(a,top);
        getChildren().addAll(tankAll);

    }
    public void ChangeAngle(boolean RL){
        if (RL==true) {
            top.setRotate(top.getRotate() + ANGLE);

        }
        else if (RL==false) {
            top.setRotate(top.getRotate() - ANGLE);
        }
    }

    public void Shoot1 (){

        xDeg= Math.sin(Math.toRadians(top.getRotate()+tankAll.getRotate()));
        yDeg= Math.cos(Math.toRadians(top.getRotate()+tankAll.getRotate()));
        xEnd= 4000*xDeg+9;
        yEnd= -4000*yDeg+15;
        xStart= 20*xDeg+7;
        yStart= -20*yDeg+5;

        bullet1= new Rectangle(xStart,yStart,4,20);
        bullet1.setRotate(top.getRotate()+tankAll.getRotate());
        bullet1.setFill(Color.LIGHTGREEN);


        TranslateTransition tr = new TranslateTransition();
        tr.setByY(yEnd);
        tr.setByX(xEnd);
        tr.setDuration(Duration.millis(1000));
        tr.setNode(bullet1);
        tr.setAutoReverse(true);
        tr.play();
        getChildren().addAll(bullet1);
    }
    public void Shoot2 (){
        xDeg= Math.sin(Math.toRadians(top.getRotate()+tankAll.getRotate()));
        yDeg= Math.cos(Math.toRadians(top.getRotate()+tankAll.getRotate()));
        xEnd= 4000*xDeg+9;
        yEnd= -4000*yDeg+15;
        xStart= 20*xDeg+7;
        yStart= -20*yDeg+5;

        bullet1= new Rectangle(xStart,yStart,4,20);
        bullet1.setRotate(top.getRotate()+tankAll.getRotate());
        bullet1.setFill(Color.LIGHTBLUE);

        TranslateTransition tr = new TranslateTransition();
        tr.setByY(yEnd);
        tr.setByX(xEnd);
        tr.setDuration(Duration.millis(1000));
        tr.setNode(bullet1);
        tr.setAutoReverse(true);
        tr.play();
        getChildren().addAll(bullet1);
    }
    public Group getTankAll(){
        return tankAll;
    }
}
