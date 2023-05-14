package AdvanceCS;
import javafx.scene.Group;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RotateImage extends  Group{
    public RotateImage(){
        Image img = new Image("D:\\Grade 12\\Advance CS\\coke1.jpg");
        ImageView a= new ImageView(img);
        a.setFitHeight(100);
        a.setFitWidth(100);
        getChildren().addAll(a);
    }
}
