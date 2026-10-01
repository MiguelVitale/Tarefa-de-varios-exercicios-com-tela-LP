package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.io.IOException;

public class InicialController {
    @FXML
    private Button btn_Ex1Multi;
    @FXML
    private Button bt_Ex2Senha;
    @FXML
    private Button bt_Ex3Compras;
    @FXML
    private Button bt_Ex4Temperaturas;
    @FXML
    private Button bt_Ex5Camelos;
    @FXML
    private Button bt_Ex6Viajem;
    @FXML
    private Button bt_Ex7Aluguel;


    @FXML
    void switchToExercicio1(ActionEvent event) throws IOException{
        App.setRoot("exercicio1");
    }

    @FXML
    void switchToExercicio2(ActionEvent event) throws IOException{
        App.setRoot("exercicio2");
    }

    @FXML
    void switchToExercicio3 (ActionEvent event) throws IOException{
        App.setRoot("exercicio3");
    }

    @FXML
    void switchToExercicio4 (ActionEvent event) throws IOException{
        App.setRoot("exercicio4");
    }

    @FXML
    void switchToExercicio5 (ActionEvent event) throws IOException{
        App.setRoot("exercicio5");
    }

    @FXML
    void switchToExercicio6 (ActionEvent event) throws IOException{
        App.setRoot("exercicio6");
    }

    @FXML
    void switchToExercicio7 (ActionEvent event) throws IOException{
        App.setRoot("exercicio7");
    }

}
