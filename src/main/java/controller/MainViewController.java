package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class MainViewController {
    public Text lbGreething;
    public TextField txtName;
    public Button btnOk;
    public Button btnCal;
    private Stage stage;
    private Parent parent;

    public void btnOkOnClicked(MouseEvent mouseEvent) {
        String text = txtName.getText();
        lbGreething.setText("Good Morning "+text+" !...");

    }


    public void btnCalOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("src/main/resources/view/MainView.fxml"));
        parent = fxmlLoader.load();
        Scene calScene = new Scene(parent);

        Stage calWindowStage = new Stage();
        calWindowStage.setScene(calScene);
        calWindowStage.show();
    }
}
