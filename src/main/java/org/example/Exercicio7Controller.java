package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio7Controller {
    @FXML
    private Button bt_Voltar;
    @FXML
    private TextField txtf_Dias;
    @FXML
    private TextField txtf_Diaria;
    @FXML
    private TextField txtf_Quilometragem;
    @FXML
    private TextField txtf_Cobrança;
    @FXML
    private TextField txtf_Adicional;
    @FXML
    private Button bt_CalcularAluguel;
    @FXML
    private TextArea txta_MostrarTexto7;

    int Dias; double Km; double Diaria; double Limite; double Adicional; double Custo;

    @FXML
    void calculaAluguel(ActionEvent event){
        txta_MostrarTexto7.clear();

        Dias = Integer.parseInt(txtf_Dias.getText());
        Km = Double.parseDouble(txtf_Quilometragem.getText());
        Diaria = Double.parseDouble(txtf_Diaria.getText());
        Limite = Double.parseDouble(txtf_Cobrança.getText());
        Adicional = Double.parseDouble(txtf_Adicional.getText());

        Custo = Dias * Diaria;

        if(Km > Limite) Custo = Custo + ((Km - Limite) * Adicional);

        txta_MostrarTexto7.appendText("Preço do aluguel: " + Custo);
    }



    @FXML
    void switchToInicial(ActionEvent event) throws IOException {
        App.setRoot("inicial");
    }
}
