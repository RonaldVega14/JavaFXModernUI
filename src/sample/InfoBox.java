package sample;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class InfoBox {

    public static void display(String title, Scene scene){
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(450);
        window.setMinHeight(650);


        Button close = new Button("Close the window");
        close.setOnAction(e -> window.close());

        window.setScene(scene);
        window.showAndWait();
    }
}
