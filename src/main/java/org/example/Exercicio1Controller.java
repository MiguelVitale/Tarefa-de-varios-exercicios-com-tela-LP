package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.io.IOException;

public class Exercicio1Controller {
    @FXML
    private Button bt_Voltar;
    @FXML
    private TextField txtf_PrimeiroMulti;
    @FXML
    private TextField txtf_SegundoMulti;
    @FXML
    private Button bt_CalcularMultiplo;
    @FXML
    private TextArea txta_ResultadoMultiplo;

    private int UserSegundoMulti;
    private int UserPrimeiroMulti;

    @FXML
    void calcularMultiplo(ActionEvent event) {
        txta_ResultadoMultiplo.clear();
        UserPrimeiroMulti = Integer.parseInt(txtf_PrimeiroMulti.getText());
        UserSegundoMulti = Integer.parseInt(txtf_SegundoMulti.getText());

        if (UserPrimeiroMulti % UserSegundoMulti == 0){
            txta_ResultadoMultiplo.appendText("o primeiro numero é multiplo do segundo.");
        }else{
            txta_ResultadoMultiplo.appendText("o primeiro numero não é multiplo do segundo.");
        }

    }

    @FXML
    void switchToInicial(ActionEvent event) throws IOException {
        App.setRoot("inicial");
    }
}
