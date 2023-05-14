package AdvanceCS;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class AlienShip extends Group {
    public AlienShip(){
    //    Rectangle body= new Rectangle(0,0,60,50);
     //   body.setWidth(60);
    //    body.setHeight(50);
    //    body.setFill(Color.RED);

        Circle body= new Circle(100,100,45);
        body.setFill(Color.RED);
        Group lir = new Group();
        Group jat = new Group();

        Polygon polygon1 = new Polygon();
        polygon1.getPoints().addAll(new Double[]{
                100.0, 100.0,
                40.0, 190.0,
                160.0, 190.0 });
        polygon1.setFill(Color.LAVENDER);


            Polygon polygon2 = new Polygon();
            polygon2.getPoints().addAll(new Double[]{
                    60.0, 170.0,
                    35.0, 210.0,
                    75.0, 210.0 });
            polygon2.setFill(Color.LIGHTCORAL);

        Polygon polygon3 = new Polygon();
        polygon3.getPoints().addAll(new Double[]{
                100.0, 170.0,
                80.0, 210.0,
                120.0, 210.0});
        polygon3.setFill(Color.LIGHTCORAL);

        Polygon polygon4 = new Polygon();
        polygon4.getPoints().addAll(new Double[]{
                145.0, 170.0,
                125.0, 210.0,
                165.0, 210.0 });
        polygon4.setFill(Color.LIGHTCORAL);

        jat.getChildren().addAll(polygon2,polygon3,polygon4,polygon1);


        for (int i = 0;i<10;i++){
            CubicCurve cubic = new CubicCurve();
            cubic.setStartX(0);
            cubic.setStartY(100);
            cubic.setControlX1(40);
            cubic.setControlY1(80);
            cubic.setControlX2(160);
            cubic.setControlY2(120);
            cubic.setEndX(200);
            cubic.setEndY(100);
            cubic.setFill(Color.LIGHTGRAY);
            cubic.setRotate(36*i);
            lir.getChildren().addAll(cubic);
        }

        getChildren().addAll(jat,body,lir);
    }
}
