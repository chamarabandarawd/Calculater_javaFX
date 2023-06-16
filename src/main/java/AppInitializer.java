import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primarystage) throws Exception {
        primarystage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/MainView.fxml"))));
        primarystage.setTitle("Main view");
        primarystage.show();
    }
}
