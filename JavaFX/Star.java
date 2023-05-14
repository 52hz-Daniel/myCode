package AdvanceCS;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;


public class Star extends Polygon {

    public Polygon polygon;

   // public Group group= new Group();
    public Star(Color color, Double a, Double b, Double c, Double d){

//        polygon.getPoints().addAll(new Double[]{
//                0.0, 0.0,
//                5.0, 10.0,
//                15.0, 10.0,
//                5.0, 20.0,
//                10.0, 30.0,
//                0.0, 22.0,
//                -10.0, 30.0,
//                -5.0, 20.0,
//                -15.0,10.0,
//                -5.0,10.0,
//        });

        double[] points= {
                0.0, 0.0,
                5.0, 10.0,
                15.0, 10.0,
                5.0, 20.0,
                10.0, 30.0,
                0.0, 22.0,
                -10.0, 30.0,
                -5.0, 20.0,
                -15.0,10.0,
                -5.0,10.0,
        };
        polygon = new Polygon(points);

        polygon.setFill(color);
     //   polygon.setStroke(Color.RED);
        polygon.setScaleX(a);
        polygon.setScaleY(b);
        polygon.setTranslateX(c);
        polygon.setTranslateY(d);

      //  group.getChildren().addAll(polygon);
    }


}
