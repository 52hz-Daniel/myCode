package AdvanceCS;
import java.io.*;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.Event;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

//************************************************************************
//  DisplayFile.java       Author: Lewis/Loftus
//
//  Demonstrates the use of a file chooser dialog box and a text area.
//************************************************************************

public class DisplayFile extends Application
{
    //--------------------------------------------------------------------
    //  Presents a file chooser dialog, reads the selected file and
    //  loads it into a text area.
    //--------------------------------------------------------------------
    TextArea content;
    FileChooser chooser;
    public void start(Stage primaryStage) throws IOException
    {
        chooser= new FileChooser();
        File selectedFile = chooser.showOpenDialog(primaryStage);

        content = new TextArea();
        content.setFont(new Font("Courier", 12));
        content.setEditable(true);
       // content.setOnKeyPressed(this::processKeyPressed);
        content.setOnInputMethodTextChanged(this::processKeyPressed);
  //      content.setOnKeyTyped(this::process);
        if (selectedFile == null)
            content.setText("No file chosen.");
        else
        {
            Scanner scan = new Scanner(selectedFile);

            String info = "";
            while (scan.hasNext())
                info += scan.nextLine() + "\n";

            content.setText(info);
        }
        Button button = new Button("save");
        button.setOnAction(this::processOnAction);
        VBox vBox = new VBox(content,button);
        vBox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vBox, 500, 500);

        primaryStage.setTitle("Display File");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void processKeyPressed(Event event){
        String info = "";
        info += event.getSource()+ "\n";
        info= content.getText();
        content.setText(info);
        content.setWrapText(true);
    }
    public void processOnAction (Event event){
    //    chooser.showSaveDialog(content);
        File file = chooser.showSaveDialog(null);

        if ( file != null ) {
            try {
                Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
                writer.write(content.getText());
                writer.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}