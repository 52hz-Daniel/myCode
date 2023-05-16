package CrtTask;

import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;

public class LeftPane extends ScrollPane {
    public LeftPane() {
        setMaxSize(500,900);
        TextArea t=new TextArea();
        t.setPrefSize(500,600);
        setContent(t);
    }
}
