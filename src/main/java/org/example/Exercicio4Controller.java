package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Exercicio4Controller {
    @FXML
    private TextField txtf_Mes1;
    @FXML
    private TextField txtf_Mes2;
    @FXML
    private TextField txtf_Mes3;
    @FXML
    private TextField txtf_Mes4;
    @FXML
    private TextField txtf_Mes5;
    @FXML
    private TextField txtf_Mes6;
    @FXML
    private TextField txtf_Mes7;
    @FXML
    private TextField txtf_Mes8;
    @FXML
    private TextField txtf_Mes9;
    @FXML
    private TextField txtf_Mes10;
    @FXML
    private TextField txtf_Mes11;
    @FXML
    private TextField txtf_Mes12;
    @FXML
    private TextArea txta_MostraTexto;
    @FXML
    private Button bt_Verificar;
    @FXML
    private Button bt_Voltar;

    private double Mes1; private double Mes2; private double Mes3; private double Mes4; private double Mes5;
    private double Mes6;
    private double Mes7; private double Mes8;
    private double Mes9; private double Mes10; private double Mes11; private double Mes12;
    private int Agradavel = 0; private int Frio = 0;

    @FXML
    void verificarTemperatura(ActionEvent event){
        txta_MostraTexto.clear();

        Mes1 = Double.parseDouble(txtf_Mes1.getText());
        Mes2 = Double.parseDouble(txtf_Mes2.getText());
        Mes3 = Double.parseDouble(txtf_Mes3.getText());
        Mes4 = Double.parseDouble(txtf_Mes4.getText());
        Mes5 = Double.parseDouble(txtf_Mes5.getText());
        Mes6 = Double.parseDouble(txtf_Mes6.getText());
        Mes7 = Double.parseDouble(txtf_Mes7.getText());
        Mes8 = Double.parseDouble(txtf_Mes8.getText());
        Mes9 = Double.parseDouble(txtf_Mes9.getText());
        Mes10 = Double.parseDouble(txtf_Mes10.getText());
        Mes11 = Double.parseDouble(txtf_Mes11.getText());
        Mes12 = Double.parseDouble(txtf_Mes12.getText());

        if (Mes1 < 18) Frio += 1;
        else Agradavel += 1;

        if (Mes2 < 18) Frio += 1;
        else Agradavel += 1;

        if (Mes3 < 18) Frio += 1;
        else Agradavel += 1;

        if (Mes4 < 18) Frio += 1;
        else Agradavel += 1;

        if (Mes5 < 18) Frio += 1;
        else Agradavel += 1;

        if (Mes6 < 18) Frio += 1;
        else Agradavel += 1;

        if (Mes7 < 18) Frio += 1;
        else Agradavel += 1;

        if (Mes8 < 18) Frio += 1;
        else Agradavel += 1;

        if (Mes9 < 18) Frio += 1;
        else Agradavel += 1;

        if (Mes10 < 18) Frio += 1;
        else Agradavel += 1;

        if (Mes11 < 18) Frio += 1;
        else Agradavel += 1;

        if (Mes12 < 18) Frio += 1;
        else Agradavel += 1;

        if (Frio >= Agradavel) txta_MostraTexto.appendText("A temperatura em SJC está fria");
        else txta_MostraTexto.appendText("A temperatura em SJC está agradável");

    }

    @FXML
    void switchToInicial(ActionEvent event) throws IOException {
        App.setRoot("inicial");
    }

}
