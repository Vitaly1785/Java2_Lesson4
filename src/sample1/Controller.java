package sample1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {
    @FXML
    public Button send;

    @FXML
    public void closeMenuClose(ActionEvent actionEvent) {
        Platform.runLater(()->{
        Stage stage = (Stage) send.getScene().getWindow();
        stage.close();
        });
    }

    public void clickSend(ActionEvent actionEvent) {
    }
}
