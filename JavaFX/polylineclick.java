package AdvanceCS;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

import java.util.ArrayList;

public class polylineclick extends Application {
    private ArrayList<Polyline> p= new ArrayList<>();
    private Scene s;
    private int i=0;
    private Group g;
    public void start(Stage stage) throws Exception {
        Button button=new Button("Erase");
        p.add(new Polyline());
        p.get(i).setStroke(Color.BLACK);
        g=new Group(button,p.get(i));
        s=new Scene(g,500,500);
        s.setOnMouseClicked(e->{
            if(e.getClickCount()==2){
                p.add(new Polyline());
                i++;
                p.get(i).setStroke(Color.BLACK);
                g.getChildren().add(p.get(i));
            }
            else
            {
                p.get(i).getPoints().add(e.getX());
                p.get(i).getPoints().add(e.getY());
            }
        });
        button.setOnAction(e->{
            p.clear();
            p.remove(g);

        });
        stage.setScene(s);
        stage.show();
    }
}