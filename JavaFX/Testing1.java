package AdvanceCS;


import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;


public class Testing1 extends Application{
    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();

        /*@1
         * 	创建Scroll Bar
         * 		setMin() setMax()设置最大最小值
         *  	setValue()设置初始值
         * 		setOrientation()设置 水平/竖直
         */
        ScrollBar scrollBar = new ScrollBar();
        scrollBar.setMin(0);
        scrollBar.setMax(100);
        scrollBar.setValue(50);
        scrollBar.setOrientation(Orientation.VERTICAL);

        /*@2
         *
         *
         *
         *
         */


        final ScrollBar sc = new ScrollBar();
        final Image[] images = new Image[5];
        final ImageView[] pics = new ImageView[5];
        final VBox vb = new VBox();
        DropShadow shadow = new DropShadow();

        Group root = new Group();
        Scene scene = new Scene(root, 180, 180);
        scene.setFill(Color.BLACK);
        stage.setScene(scene);
        stage.setTitle("Scrollbar");
        root.getChildren().addAll(vb, sc);

        shadow.setColor(Color.GREY);
        shadow.setOffsetX(2);
        shadow.setOffsetY(2);

        vb.setLayoutX(5);
        vb.setSpacing(10);

        sc.setLayoutX(scene.getHeight()-sc.getHeight());
        sc.setMin(0);
        sc.setOrientation(Orientation.VERTICAL);
        sc.setPrefHeight(180);
        sc.setMax(360);

        for (int i = 0; i < 5; i++) {
            final Image image = images[i] =
                    new Image(getClass().getResourceAsStream(
                            "/res/pic" +(i+1)+ ".jpg")
                    );
            final ImageView pic = pics[i] =
                    new ImageView(images[i]);
            pic.setEffect(shadow);
            vb.getChildren().add(pics[i]);
        }

        sc.valueProperty().addListener((ObservableValue<? extends Number> ov,
                                        Number old_val, Number new_val) -> {
            vb.setLayoutY(-new_val.doubleValue());//上移距离等于滑动条移动的距离 负号代表图片上移
        });

        stage.show();



    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
