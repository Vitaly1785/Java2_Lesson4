package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextField field;
    @FXML
    public TextArea area;

    @FXML
    public void clickSend(ActionEvent actionEvent) {
        area.appendText(field.getText() + "\n");
        field.requestFocus();
        field.setText("");
    }
}
