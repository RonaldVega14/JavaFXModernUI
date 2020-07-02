package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label label;

    @FXML
    private BorderPane mainPane;

    @FXML
    private void Home(ActionEvent event){
        System.out.println("Home clicked!");
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("sample");
        mainPane.setCenter(view);
    }

    @FXML
    private void StartProcess(ActionEvent event){

    }

    @FXML
    private void Assembly(ActionEvent event){

    }

    @FXML
    private void ExplainProcess(ActionEvent event){

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
