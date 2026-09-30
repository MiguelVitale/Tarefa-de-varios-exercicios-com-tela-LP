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

    double Viajem; double Preco; double Custo; double Desconto;

    @FXML
    void calculaViajem(ActionEvent event){
        txta_MostrarTexto6.clear();

        Viajem = Double.parseDouble(txtf_Viajem.getText());
        Preco = Double.parseDouble(txtf_Preco.getText());

        Custo = (Viajem / (double)12.0F ) * Preco;
        if(Viajem > (double)500.0F ) Desconto = Custo - (Preco * (double)0.05F);

        txta_MostrarTexto6.appendText("Custo total da viajem: " + Custo + "\n");
        if(Viajem > (double)500.0F ) txta_MostrarTexto6.appendText("Custo com desconto: " + Desconto + "\n");
    }

    @FXML
    void switchToInicial(ActionEvent event) throws IOException {
        App.setRoot("inicial");
    }
}
