package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;

import static java.lang.Integer.*;

public class Exercicio3Controller {
    @FXML
    private TextField txtf_Arroz;
    @FXML
    private TextField txtf_Feijao;
    @FXML
    private TextField txtf_Soja;
    @FXML
    private TextField txtf_Acucar;
    @FXML
    private TextField txtf_Cafe;
    @FXML
    private TextField txtf_Macarrao;
    @FXML
    private TextField txtf_Mandioca;
    @FXML
    private TextField txtf_Fuba;
    @FXML
    private TextField txtf_Extrato;
    @FXML
    private TextField txtf_Sal;
    @FXML
    private Button bt_Voltar;
    @FXML
    private Button bt_Comprar;
    @FXML
    private TextArea txta_MostraPreco;

    private float PreArroz; private float PreFeijao; private float PreOleoSoja;
    private float PreAcucar; private float PreCafe; private float PreMacarrao;
    private float PreFarinhaMandioca; private float PreFuba; private float PreTomate;
    private float PreSal;

    private double PreTotal; private double PreDesconto;

    @FXML
    void fazerCompra(ActionEvent event){
        txta_MostraPreco.clear();

        PreArroz = Float.parseFloat(txtf_Arroz.getText());
        PreFeijao = Float.parseFloat(txtf_Feijao.getText());
        PreOleoSoja = Float.parseFloat(txtf_Soja.getText());
        PreAcucar = Float.parseFloat(txtf_Acucar.getText());
        PreCafe = Float.parseFloat(txtf_Cafe.getText());
        PreMacarrao = Float.parseFloat(txtf_Macarrao.getText());
        PreFarinhaMandioca = Float.parseFloat(txtf_Mandioca.getText());
        PreFuba = Float.parseFloat(txtf_Fuba.getText());
        PreTomate = Float.parseFloat(txtf_Extrato.getText());
        PreSal = Float.parseFloat(txtf_Sal.getText());

        PreTotal = PreAcucar + PreArroz + PreCafe + PreFarinhaMandioca + PreFeijao + PreFuba + PreMacarrao + PreOleoSoja + PreSal + PreTomate;

        if (PreTotal > 100.0){
            PreDesconto = PreTotal - (PreTotal * 0.10);
        }else{
            PreDesconto = 0;
        }

        txta_MostraPreco.appendText("      ITEM          |  QNT  |  PREÇO\n");
        txta_MostraPreco.appendText("Arroz               | 1,5Kg |  " + PreArroz + "\n");
        txta_MostraPreco.appendText("Feijão carioca      |  2Kg  |  " + PreFeijao + "\n");
        txta_MostraPreco.appendText("Oleo de soja        | 900ml |  " + PreOleoSoja + "\n");
        txta_MostraPreco.appendText("Açúcar refinado     |  1Kg  |  " + PreArroz + "\n");
        txta_MostraPreco.appendText("Café torrado        |  250g |  " + PreCafe + "\n");
        txta_MostraPreco.appendText("Macarrão espaguete  |  500g |  " + PreMacarrao + "\n");
        txta_MostraPreco.appendText("Farinha de mandioca |  1kg  |  " + PreFarinhaMandioca + "\n");
        txta_MostraPreco.appendText("Fubá de milho       |  1kg  |  " + PreFuba + "\n");
        txta_MostraPreco.appendText("Extrate de tomate   |  300g |  " + PreTomate + "\n");
        txta_MostraPreco.appendText("Sal refinado        |  1Kg  |  " + PreSal + "\n");
        txta_MostraPreco.appendText("\n");
        txta_MostraPreco.appendText("Total: " + PreTotal + "\n");
        if (PreTotal > 100) txta_MostraPreco.appendText("Total com desconto: " + PreDesconto);
    }

    @FXML
    void switchToInicial(ActionEvent event) throws IOException {
        App.setRoot("inicial");
    }
}
