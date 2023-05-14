package AdvanceCS;



import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class VendingMachine extends VBox{

     TextField input;
     RadioButton coke, cokeZero, dietCoke;
     Label coinIn, coinOut;
     Text r1,r2,r3, title1,i1,i2,i3,temp,output;
     Image coke1, coke2, coke3;
     ImageView img1, img2, img3;
     String a;
    private int b,account, change,totalCost;
     ToggleGroup selected;
     boolean legal;
     VBox options;
     Button checkOut,checkIn;


    public VendingMachine(){

        title1= new Text( "Vending machine");
        title1.setFont(Font.font("Impact",50));

        coke1= new Image ("file:D:\\Grade 12\\Advance CS\\coke1.jpg");
        img1 = new ImageView(coke1);
        coke2= new Image ("file:D:\\Grade 12\\Advance CS\\coke.jfif");
        img2 = new ImageView(coke2);
        coke3= new Image ("file:D:\\Grade 12\\Advance CS\\coke3.jfif");
        img3 = new ImageView(coke3);
        img1.setFitHeight(100);
        img1.setPreserveRatio(true);
        img2.setFitHeight(100);
        img2.setPreserveRatio(true);
        img3.setFitHeight(100);
        img3.setPreserveRatio(true);

        HBox hb3 = new HBox();
        hb3.getChildren().addAll(img1,img2,img3);
        hb3.setAlignment(Pos.CENTER);
        hb3.setSpacing(30);

        input= new TextField();
        input.setPrefColumnCount(15);
        input.setFont(Font.font("arial",20));
        output= new Text();
        output.setFont(Font.font("Segoe UI Light",22));
        output.setText("0 dollar   0 quarter   0 dime   0 nickle");
        coinIn= new Label("please put in nickels, dimes, quarters, and dollar bills");
        coinIn.setFont(Font.font("Sitka Small",26));
        coinOut= new Label("Changes: ");
        coinOut.setFont(Font.font("Sitka Small",26));
        checkIn= new Button("Input");
        checkIn.setFont(Font.font("Sitka Small",26));

        HBox hb1 = new HBox();
        hb1.getChildren().addAll(coinIn,input,checkIn);
        hb1.setAlignment(Pos.CENTER);
        hb1.setSpacing(10);


        selected = new ToggleGroup();

        coke= new RadioButton("Coke");
        coke.setToggleGroup(selected);
     //   coke.setSelected(true);
        coke.setFont(Font.font("Segoe UI Light",20));
        coke.setOnAction(this::processRadioButtonAction);

        cokeZero= new RadioButton("Coke zero");
        cokeZero.setToggleGroup(selected);
        cokeZero.setFont(Font.font("Segoe UI Light",20));
        cokeZero.setOnAction(this::processRadioButtonAction);

        dietCoke= new RadioButton("Diet coke");
        dietCoke.setToggleGroup(selected);
        dietCoke.setFont(Font.font("Segoe UI Light",20));
        dietCoke.setOnAction(this::processRadioButtonAction);

        options = new VBox(coke, cokeZero, dietCoke);
        options.setAlignment(Pos.CENTER_LEFT);
        options.setSpacing(25);

        r1= new Text("Not enough money");
        r2= new Text("Please use nickels, dimes, quarters, and dollar bills");
        r3= new Text("Don't use more than 100$ to buy coke you idiot!");
        r1.setFont(Font.font("Segoe UI Light",20));
        r2.setFont(Font.font("Segoe UI Light",20));
        r3.setFont(Font.font("Segoe UI Light",20));

        VBox reminder= new VBox(r1,r2,r3);
        reminder.setSpacing(10);
        reminder.setAlignment(Pos.CENTER_LEFT);
        HBox three= new HBox(options,reminder);
        three.setSpacing(20);
        three.setAlignment(Pos.CENTER);
        options.setVisible(false);
        r2.setVisible(false);
        r1.setVisible(false);
        r3.setVisible(false);

        VBox info = new VBox();
        i1= new Text("You have "+change+" cent in the account");
        i2= new Text("The total cost is "+totalCost);
        i3= new Text("Please click the bottom to check out");
        i1.setFont(Font.font("Segoe UI Light",20));
        i2.setFont(Font.font("Segoe UI Light",20));
        i3.setFont(Font.font("Segoe UI Light",20));
        info.getChildren().addAll(i1,i2,i3);
        info.setSpacing(10);
        info.setAlignment(Pos.CENTER_LEFT);

        VBox list = new VBox();
        temp= new Text("You have not bought anything");
        temp.setFont(Font.font("Segoe UI Light",20));
        checkOut= new Button("check out!");
        checkOut.setFont(Font.font("Sitka Small",26));
        list.getChildren().addAll(temp,checkOut);
        list.setAlignment(Pos.CENTER_LEFT);
        list.setSpacing(40);

        HBox hb4= new HBox(info,list);
        hb4.setAlignment(Pos.CENTER);
        hb4.setSpacing(100);


        HBox hb2 = new HBox();
        hb2.getChildren().addAll(coinOut, output);
        hb2.setAlignment(Pos.CENTER);
        hb2.setSpacing(10);

        totalCost=0;
        change=0;


        checkIn.setOnAction((e)->{
            //account+=Integer.valueOf(input.getText());
      //      a= input.getText();
        //    if(a!=null && !a.equals("")){
          //      b = Integer.parseInt(a);
            //    }
            //account+=b;
            b=Integer.valueOf(input.getText());
            legal= b==5||b==10||b==25||b==100;
            if (legal){
                change+=b;


                if(change>=125&&change<10000){
                    //  three.getChildren().addAll(selected);
                     options.setVisible(true);
                    //  reminder.setVisible(false);
                    r2.setVisible(false);
                    r1.setVisible(false);
                    r3.setVisible(false);
                }
                else if(change>=0&&change<125) {
                    options.setVisible(false);
                    r2.setVisible(false);
                    r1.setVisible(true);
                    r3.setVisible(false);
                }
                else {
                    options.setVisible(false);
                    r2.setVisible(false);
                    r1.setVisible(false);
                    //  r3.setVisible(true);
                }

            }
            else {
                options.setVisible(false);
                r2.setVisible(true);
                r1.setVisible(false);
                r3.setVisible(false);
            }
        //    else if(!(legal)){

            input.setText("");
            i1.setText("You have "+change+" cent remaining");
            i2.setText("The total cost is "+totalCost);
            i3.setText("Please click the bottom to check out");
            coke.setSelected(false);
            cokeZero.setSelected(false);
            dietCoke.setSelected(false);
        });



        checkOut.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int dollar= change/100;
                int quarter=(change-dollar*100)/25;
                int dime=(change-dollar*100-quarter*25)/10;
                int nickle=(change-dollar*100-quarter*25-dime*10)/5;
                output.setText(""+dollar+" dollar   "+quarter+" quarter   "+dime+" dime   "+nickle+" nickle");
                totalCost=0;
                change=0;

                i1.setText("You have "+change+" cent remaining");
                i2.setText("The total cost is "+totalCost);
                i3.setText("Please click the bottom to check out");
                temp.setText("You have not bought anything");
                coke.setSelected(false);
                cokeZero.setSelected(false);
                dietCoke.setSelected(false);
            }
        });



        getChildren().addAll(title1,hb3,hb1, three,hb4,hb2);



    }
    public void processRadioButtonAction(ActionEvent event)
    {
        if(change>=125){
            change=change-125;
            totalCost+=125;
            i1.setText("You have "+change+" cent remaining");
            i2.setText("The total cost is "+totalCost);
            i3.setText("Please click the bottom to check out");

            if (coke.isSelected()) {

                temp.setText("Here is your coke");

            }

            else if (cokeZero.isSelected()) {
                temp.setText("Here is your coke zero");

            }

            else {
                temp.setText("Here is your diet coke");
            }
        }
        else {
            options.setVisible(false);
            r2.setVisible(false);
            r1.setVisible(true);
            r3.setVisible(false);
        }


    }
}
