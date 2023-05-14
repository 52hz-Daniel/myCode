package AdvanceCS;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;



public class RowStarOne extends Group{
    public RowStarOne(){
        Rectangle star1= new Rectangle(0,0,50,50);
        star1.setFill(Color.YELLOW);
        star1.setStroke(Color.YELLOW);
        star1.setStrokeWidth(1);

        Rectangle star2= new Rectangle(0,0,50,50);
        star2.setFill(Color.YELLOW);
        star2.setStroke(Color.YELLOW);
        star2.setStrokeWidth(1);
        star2.setRotate(45);

        getChildren().addAll(star1,star2);
    }
}
