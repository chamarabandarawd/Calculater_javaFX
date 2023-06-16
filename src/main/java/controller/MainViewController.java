package controller;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class MainViewController {
    public Text lbGreething;
    public TextField txtName;
    public Button btnOk;

    public void btnOkOnClicked(MouseEvent mouseEvent) {
        String text = txtName.getText();
        lbGreething.setText("Good Morning "+text+" !...");

    }
}
