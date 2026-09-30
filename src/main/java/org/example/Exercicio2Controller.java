package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import java.io.IOException;

public class Exercicio2Controller {
    @FXML
    private PasswordField psf_Tentativa;
    @FXML
    private Button bt_Tentar;
    @FXML
    private TextArea txta_ResultadoS;
    @FXML
    private Button bt_Voltar;

    private String Tentativa;
    private String Senha = "1234";

    @FXML
    void tentarSenha(ActionEvent event){
        txta_ResultadoS.clear();
        Tentativa = psf_Tentativa.getText();

        if(Senha.equals(Tentativa)){
            txta_ResultadoS.appendText("Acesso permitido");
        }else{
            txta_ResultadoS.appendText("Acesso negado");
        }
    }

    @FXML
    void switchToInicial(ActionEvent event) throws IOException {
        App.setRoot("inicial");
    }


}
