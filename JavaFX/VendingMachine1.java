package AdvanceCS;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class VendingMachine1 extends Application{
    RadioButton Coke, DietCoke, FDietCoke;
    Label indicator=new Label();
    Label m1=new Label("Dollar");
    Label m2=new Label("Quarter");
    Label m3=new Label("Dime");
    Label m4=new Label("Nickle");
    int change;
    TextField bill=new TextField("0");
    TextField quarter=new TextField("0");
    TextField dime=new TextField("0");
    TextField nickle=new TextField("0");
    private Scene scene;
    private GridPane p;
    Button insert=new Button("Insert coins");
    Button extract=new Button("Extract changes");

    public void start(Stage primaryStage){
        p=new GridPane();
        p.setAlignment(Pos.CENTER);
        ToggleGroup group = new ToggleGroup();
        indicator.setText("Unselected "+change+"$");
        change=0;

        insert.setOnAction((e)->{
            change+=Integer.valueOf(bill.getText())*100;
            change+=Integer.valueOf(quarter.getText())*25;
            change+=Integer.valueOf(dime.getText())*10;
            change+=Integer.valueOf(nickle.getText())*5;
            bill.setText("0");
            quarter.setText("0");
            dime.setText("0");
            nickle.setText("0");
            indicator.setText("Coin inserted "+change+"$");
        });

        extract.setOnAction((e)->{
            String s="Extracted ";
            if(change<100)
                s+=" ";
            else{
                s+= change/100+" dollar ";
                bill.setText(""+change/100);
                change=change%100;
            }

            if(change<25)
                s+=" ";
            else{
                s+= change/25+" quarter ";
                quarter.setText(""+change/25);
                change=change%25;
            }

            if(change<10)
                s+=" ";
            else{
                s+= change/10+" dime ";
                dime.setText(""+change/10);
                change=change%10;
            }

            if(change<5)
                s+=" ";
            else{
                s+= change/5+"nickle ";
                nickle.setText(""+change/5);
                change=change%5;
            }
            indicator.setText(s);

        });

        Coke = new RadioButton("Coke");
        Coke.setToggleGroup(group);
        Coke.setOnAction((e)->{if(change>125){change-=125; indicator.setText("Coke purchased "+change+"$");} else indicator.setText("Insufficient funds  "+change+"$");});

        DietCoke = new RadioButton("Diet Coke");
        DietCoke.setToggleGroup(group);
        DietCoke.setOnAction((e)->{if(change>125){change-=125; indicator.setText("Diet Coke purchased "+change+"$");} else indicator.setText("Insufficient funds  "+change+"$");});

        FDietCoke = new RadioButton("Coffine-free Diet Coke");
        FDietCoke.setToggleGroup(group);
        FDietCoke.setOnAction((e)->{if(change>125){change-=125; indicator.setText("Coffine-free Diet Coke purchased "+change+"$");} else indicator.setText("Insufficient funds  "+change+"$");});

        p.add(m1,0,0);
        p.add(m2,1,0);
        p.add(m3,2,0);
        p.add(m4,3,0);
        p.add(bill,0,1);
        p.add(quarter,1,1);
        p.add(dime,2,1);
        p.add(nickle,3,1);
        p.add(insert,0,2);
        p.add(extract,1,2);
        p.add(Coke,0,3);
        p.add(DietCoke,0,4);
        p.add(FDietCoke,0,5);
        p.add(indicator,0,6);

        scene = new Scene(p, 800, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
