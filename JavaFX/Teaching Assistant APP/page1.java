package CrtTask;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class page1 extends GridPane {
    double finished=0;
    public page1(){
        setMinSize(500,600);
        Label l1=new Label("Create Task"),l2=new Label("Daniel, Steven, Rubin");
        l1.setFont(new Font(30));
        l2.setFont(new Font(25));
        add(l1,0,0);
        add(l2,0,1);
        l1.setAlignment(Pos.CENTER);
        l2.setAlignment(Pos.CENTER);
        setAlignment(Pos.CENTER);
        setUserData(finished);
    }

}
