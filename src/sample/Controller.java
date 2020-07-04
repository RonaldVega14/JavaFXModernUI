package sample;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.io.IOException;
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
        Pane view = object.getPage("home");
        mainPane.setCenter(view);
    }

    @FXML
    private void StartProcess(ActionEvent event){
        System.out.println("Start clicked!");
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("paso0");
        mainPane.setCenter(view);
    }

    @FXML
    private void toStepOne(ActionEvent event){
        System.out.println("To Event One clicked!");
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("paso1");
        mainPane.setCenter(view);
    }

    @FXML
    private void toStepTwo(ActionEvent event){
        System.out.println("To Event Two clicked!");
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("paso2");
        mainPane.setCenter(view);
    }

    @FXML
    private void toStepTwoOne(ActionEvent event){
        System.out.println("To Event Two Two clicked!");
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("paso2-1");
        mainPane.setCenter(view);
    }

    @FXML
    private void toStepThree(ActionEvent event){
        System.out.println("To Event Three clicked!");
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("paso3");
        mainPane.setCenter(view);
    }

    @FXML
    private void toStepFour(ActionEvent event){
        System.out.println("To Event Four clicked!");
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("paso4");
        mainPane.setCenter(view);
    }

    @FXML
    private void toStepFive(ActionEvent event){
        System.out.println("To Event Five clicked!");
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("paso5");
        mainPane.setCenter(view);
    }

    @FXML
    private void toStepSix(ActionEvent event){
        System.out.println("To Event Six clicked!");
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("paso6");
        mainPane.setCenter(view);
    }

    @FXML
    private void Assembly(ActionEvent event){

    }

    @FXML
    private void ExplainProcess(ActionEvent event){

    }

    @FXML
    private void showInfo(ActionEvent event){

    }

    @FXML
    private void showTable(ActionEvent event){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("conectividades.fxml"));
            Scene scene = new Scene(root);
            InfoBox.display("Tabla de Conectividades", scene);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
