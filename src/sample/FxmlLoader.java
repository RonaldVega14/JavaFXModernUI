package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.net.URL;

public class FxmlLoader {
    private Pane view;


    public Pane getPage(String fileName){
        try{
            // First we check if the file exists
            URL fileUrl = Main.class.getResource("/sample/" + fileName + ".fxml");
            if (fileUrl == null){
                throw new java.io.FileNotFoundException("FXML File not found");
            }

            // Load method will return an object of type Pane
            view = new FXMLLoader().load(fileUrl);

        } catch(Exception e){
            System.out.println("No page " + fileName + " please check FxmlLoader.");
        }
        //W return the view
        return view;
    }
}
