package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Exercicio6Controller {
    @FXML
    private Button bt_Voltar;
    @FXML
    private Button bt_CalcularViajem;
    @FXML
    private TextField txtf_Viajem;
    @FXML
    private TextField txtf_Preco;
    @FXML
    private TextArea txta_MostrarTexto6;

    double Viajem; double Preco; double Custo; double Desconto = 0;

    @FXML
    void calculaViajem(ActionEvent event){
        txta_MostrarTexto6.clear();

        Viajem = Double.parseDouble(txtf_Viajem.getText());
        Preco = Double.parseDouble(txtf_Preco.getText());

        Custo = (Viajem / 12.0 ) * Preco;
        if(Viajem > 500.0 ) Desconto = Custo - (Custo * 0.05);

        txta_MostrarTexto6.appendText("Custo total da viajem: " + Custo + "\n");
        if(Viajem > 500.0 ) txta_MostrarTexto6.appendText("Custo com desconto: " + Desconto + "\n");
    }

    @FXML
    void switchToInicial(ActionEvent event) throws IOException {
        App.setRoot("inicial");
    }
}
