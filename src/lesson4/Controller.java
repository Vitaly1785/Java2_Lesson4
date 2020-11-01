package lesson4;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Controller {
    @FXML
    public TextField field;
    @FXML
    public TextArea area;
    @FXML
    public Button send;
    @FXML
    public MenuBar menuBar;
    @FXML
    public GridPane pane;
    @FXML
    public Menu menu;




    @FXML
    public void clickSend(ActionEvent actionEvent) {
        area.appendText(field.getText() + "\n");
        field.requestFocus();
        field.setText("");
    }
    @FXML
    public void clickOrigin(ActionEvent actionEvent) {
        Platform.runLater(()->{
            send.setStyle("-fx-background-color: yellow");
            field.setStyle("-fx-background-color: lightgreen");
            area.setStyle("-fx-control-inner-background:greenyellow");
            menuBar.setStyle("-fx-background-color: white");
            menu.setStyle("-fx-background-color: aqua");
            pane.setStyle("-fx-background-image: url(\"https://krot.info/uploads/posts/2020-01/1579314203_23-47.jpg\")");
        });
    }
    @FXML
    public void clickDark(ActionEvent actionEvent) {
        send.setStyle("-fx-background-color: aqua");
        field.setStyle("-fx-background-color: aqua");
        area.setStyle("-fx-control-inner-background: aqua");
        menuBar.setStyle("-fx-background-color: black");
        menu.setStyle("-fx-background-color: black");
        pane.setStyle("-fx-background-image: url(\"https://krot.info/uploads/posts/2020-01/1579314189_38-77.jpg\")");
    }
}
