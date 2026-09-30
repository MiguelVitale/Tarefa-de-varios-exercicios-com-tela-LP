package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class Exercicio5Controller {
    @FXML
    private Button bt_Dividir;
    @FXML
    private TextArea txta_MostrarTexto5;
    @FXML
    private Button bt_Voltar;

    int Camelos = 36; int Irmao1; int Irmao2; int Irmao3;

    @FXML
    void dividirCamelos(ActionEvent event){
        txta_MostrarTexto5.clear();

        Irmao1 = Camelos / 2;
        Irmao2 = Camelos / 3;
        Irmao3 = Camelos / 9;

        txta_MostrarTexto5.appendText("O irmão mais velho recebe: " + Irmao1 + " camelos\n");
        txta_MostrarTexto5.appendText("O irmão do meio recebe: " + Irmao2 + " camelos\n");
        txta_MostrarTexto5.appendText("O irmão mais jovem recebe: " + Irmao3 + " camelos\n");
    }

    @FXML
    void switchToInicial(ActionEvent event) throws IOException {
        App.setRoot("inicial");
    }
}
