package sample;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label label;

    @FXML private javafx.scene.control.Button closeButton;

    @FXML
    private BorderPane mainPane;

    @FXML
    private void Home(ActionEvent event){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("home");
        mainPane.setCenter(view);
    }

    @FXML
    private void StartProcess(ActionEvent event){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("paso0");
        mainPane.setCenter(view);
    }

    @FXML
    private void toStepOne(ActionEvent event){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("paso1");
        mainPane.setCenter(view);
    }

    @FXML
    private void toStepTwo(ActionEvent event){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("paso2");
        mainPane.setCenter(view);
    }

    @FXML
    private void toStepTwoOne(ActionEvent event){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("paso2-1");
        mainPane.setCenter(view);
    }

    @FXML
    private void toStepThree(ActionEvent event){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("paso3");
        mainPane.setCenter(view);
    }

    @FXML
    private void toStepFour(ActionEvent event){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("paso4");
        mainPane.setCenter(view);
    }

    @FXML
    private void toStepFive(ActionEvent event){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("paso5");
        mainPane.setCenter(view);
    }

    @FXML
    private void toStepSix(ActionEvent event){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("paso6");
        mainPane.setCenter(view);
    }

    @FXML
    private void Thanks(ActionEvent event){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("gracias");
        mainPane.setCenter(view);
    }

    @FXML
    private void Assembly(ActionEvent event){

    }

    @FXML
    private void ExplainProcess(ActionEvent event){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("infosw");
        mainPane.setCenter(view);
    }

    @FXML
    private void closeWindow(ActionEvent event){
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        // do what you have to do
        stage.close();
    }

    @FXML
    private void showInfo1(ActionEvent event){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("info1.fxml"));
            Scene scene = new Scene(root);
            InfoBox.displayScene("Definir el Dominio", scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void showInfo2(ActionEvent event){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("info2.fxml"));
            Scene scene = new Scene(root);
            InfoBox.displayScene("Definir el Dominio", scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void showInfo3(ActionEvent event){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("info3.fxml"));
            Scene scene = new Scene(root);
            InfoBox.displayScene("Definir el Dominio", scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void showInfo4(ActionEvent event){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("info4.fxml"));
            Scene scene = new Scene(root);
            InfoBox.displayScene("Definir el Dominio", scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void showTable(ActionEvent event){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("conectividades.fxml"));
            Scene scene = new Scene(root);
            InfoBox.displayScene("Tabla de Conectividades", scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
