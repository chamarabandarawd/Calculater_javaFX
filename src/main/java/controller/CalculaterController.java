package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class CalculaterController {

    @FXML
    private TextField txtFristNum;

    @FXML
    private Text txtResult;

    @FXML
    private TextField txtSecondNum;

    @FXML
    void btnDivOnAction(ActionEvent event) {

    }

    @FXML
    void btnMultiOnAction(ActionEvent event) {

    }

    @FXML
    void btnPlusOnAction(ActionEvent event) {
        double num1 = Double.parseDouble(txtFristNum.getText());
        double num2 = Double.parseDouble(txtSecondNum.getText());
        txtResult.setText((num1+num2)+"");
    }

    @FXML
    void btnSubOnAction(ActionEvent event) {

    }

}
