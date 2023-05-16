package CrtTask;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Mp extends Application {
        GridPane g1=new GridPane(),g3=new GridPane(),g=new GridPane(),gb1=new GridPane(),gb2=new GridPane();
        Pane p=new Pane();
        ScrollPane s1 =new LeftPane(), s2=new RightPane();
        Button b1=new Button("Code"),b2=new Button("Example");
        Button[]b=new Button[]{new Button("Main Page"), new Button("Page1"), new Button("Page2"), new Button("Page3"), new Button("Page4"), new Button("Page5"), new Button("Page6")};
        Pane[] ga=new Pane[]{new page1(),new CreateTask_Purpose(),new ProjectSum2(),new ProjectSum3(),new CreateTask_ProceduralAbstraction(),new ProjectSum5(),new CreateTask_Testing()};
        boolean b1s=false,b2s=false;
        Scene s=new Scene(g,1900,700);
        ProgressBar progressBar = new ProgressBar(0);
        Label l=new Label("0/0");
        double finish;
        public void start(Stage stage) {
            b[0].setDisable(true);
            s.setFill(Color.color(0.95686274509803921568627450980392,0.95686274509803921568627450980392,0.95686274509803921568627450980392));
            int i=1;
            p=ga[0];
            g.add(p,1,1);
            for (Button c:b) {
                g1.add(c,i,0);
            i++;
            c.setOnAction(e->{
                Button o= (Button) e.getSource();
                o.setDisable(true);
                int l=0;
                for (Button a:b) {
                    if (a.equals(o)){
                        g.getChildren().remove(p);
                        p=ga[l];
                        g.add(p,1,1);
                    }
                    else
                        a.setDisable(false);
                    l++;
                }
            });
        }
            b1.setOnAction(e->{
                if (b1s){
                b1.setText("Code");
                g.getChildren().remove(s1);
            }
            else {
                b1.setText("Hide");
                g.add(s1,0,1);
            }
            b1s=!b1s;
                g.setTranslateX(((b2s ? 1:0)-(b1s ? 1:0))*250);
            });
            b2.setOnAction(e->{
                if (b2s){
                b2.setText("Example");
                g.getChildren().remove(s2);
            }
            else {
                b2.setText("Hide");
                g.add(s2,2,1);
            }
            b2s=!b2s;
                g.setTranslateX(((b2s ? 1:0)-(b1s ? 1:0))*250);
            });
            g1.add(b1,0,0);
            g1.add(b2,10,0);
            g.add(g1,1,0);
            g.add(g3,1,2);
            g1.setAlignment(Pos.CENTER);
            g.setAlignment(Pos.TOP_CENTER);
            progressBar.setMinWidth(470);
            g.setOnMouseMoved(e->{
                finish=0;
                for (Pane a:ga) {
                    finish+=(double)a.getUserData();
                }
                progressBar.setProgress(finish/44);
                l.setText((int)finish+"/44");
            });
            g3.add(progressBar,0,0);
            g3.add(l,1,0);
            stage.setScene(s);
        stage.show();
    }
}