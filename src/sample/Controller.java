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
    private void showInfo1(ActionEvent event){
        InfoBox.display("Informacion", "Definir el dominio consiste en definir el cuerpo sobre el cual se va a realizar el calculo");
    }

    @FXML
    private void showInfo2(ActionEvent event){
        InfoBox.display("Informacion", "El proceso de mallado consiste en separar el cuerpo en varias partes, creando asi un conjunto finito de elementos y nodos. Para este caso cada elemento de la malla representa un tetrahedro con 4 nodos.\n");
    }

    @FXML
    private void showInfo3(ActionEvent event){
        InfoBox.display("Informacion", "En una interpolacion existe una variable de interes que necesitamos interpolar (En este caso A y B). Esta variable(s) de interes depende de dos conjuntos de datos. \n1. Valores puntuales de la variable de interes, \n2. Una serie de funciones, tambien conocidas como funciones de interpolacion o funciones de forma que provoque que cada uno de los puntos interpolados siga respetando la geometria del cuerpo. ");
    }

    @FXML
    private void showInfo4(ActionEvent event){
        InfoBox.display("Informacion", "Condicion 1: Significa que la suma de todas las funciones de forma debe de ser igual a 1.\nCondicion 2: Al principio asumimos que tenemos los valores en los nodos, por lo que las funciones de forma evaluadas en ese punto deben de respetar ese valor inicial asumido.");
    }

    @FXML
    private void showTable(ActionEvent event){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("conectividades.fxml"));
            Scene scene = new Scene(root);
            InfoBox.displayTable("Tabla de Conectividades", scene);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
