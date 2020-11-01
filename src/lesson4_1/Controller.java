package lesson4_1;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    public TextField field;

    @FXML
    public MenuItem menu100;
    @FXML
    public MenuItem menu125;
    @FXML
    public MenuItem menu150;
    @FXML
    public MenuItem menu175;
    @FXML
    public MenuItem menu200;
    @FXML
    public MenuItem menu225;
    @FXML
    public MenuItem menu250;
    @FXML
    public MenuItem menu251;
    @FXML
    public Label labelResult;
    @FXML
    public Menu menuMonths;
    @FXML
    public Menu menuFactor;
    @FXML
    public MenuItem month1;
    @FXML
    public MenuItem month2;
    @FXML
    public MenuItem month3;
    @FXML
    public MenuItem month4;
    @FXML
    public MenuItem month5;
    @FXML
    public MenuItem month6;
    @FXML
    public MenuItem month7;
    @FXML
    public MenuItem month8;
    @FXML
    public MenuItem month9;
    @FXML
    public MenuItem month10;
    @FXML
    public MenuItem month11;
    @FXML
    public MenuItem month12;
    private int factor;
    private int numberMonths;
    public static final int YEAR = 12;
    private int result;
    @FXML
    public void menu100(ActionEvent actionEvent) {
        factor = 12;
        menuFactor.setText(menu100.getText());
    }
    @FXML
    public void menu125(ActionEvent actionEvent) {
        factor = 25;
        menuFactor.setText(menu125.getText());
    }
    @FXML
    public void menu150(ActionEvent actionEvent) {
        factor = 35;
        menuFactor.setText(menu150.getText());
    }
    @FXML
    public void menu175(ActionEvent actionEvent) {
        factor = 45;
        menuFactor.setText(menu175.getText());
    }
    @FXML
    public void menu200(ActionEvent actionEvent) {
        factor = 55;
        menuFactor.setText(menu200.getText());
    }
    @FXML
    public void menu225(ActionEvent actionEvent) {
        factor = 65;
        menuFactor.setText(menu225.getText());
    }
    @FXML
    public void menu250(ActionEvent actionEvent) {
        factor = 75;
        menuFactor.setText(menu250.getText());
    }
    @FXML
    public void menu251(ActionEvent actionEvent) {
        factor = 150;
        menuFactor.setText(menu251.getText());
    }
    @FXML
    public void menu1(ActionEvent actionEvent) {
        numberMonths =1;
        menuMonths.setText(month1.getText());
    }
    @FXML
    public void menu2(ActionEvent actionEvent) {
        numberMonths =2;
        menuMonths.setText(month2.getText());
    }
    @FXML
    public void menu3(ActionEvent actionEvent) {
        numberMonths =3;
        menuMonths.setText(month3.getText());
    }
    @FXML
    public void menu4(ActionEvent actionEvent) {
        numberMonths =4;
        menuMonths.setText(month4.getText());
    }
    @FXML
    public void menu5(ActionEvent actionEvent) {
        numberMonths =5;
        menuMonths.setText(month5.getText());
    }
    @FXML
    public void menu6(ActionEvent actionEvent) {
        numberMonths =6;
        menuMonths.setText(month6.getText());
    }
    @FXML
    public void menu7(ActionEvent actionEvent) {
        numberMonths =7;
        menuMonths.setText(month7.getText());
    }
    @FXML
    public void menu8(ActionEvent actionEvent) {
        numberMonths =8;
        menuMonths.setText(month8.getText());
    }

    @FXML
    public void menu9(ActionEvent actionEvent) {
        numberMonths =9;
        menuMonths.setText(month9.getText());
    }
    @FXML
    public void menu10(ActionEvent actionEvent) {
        numberMonths =10;
        menuMonths.setText(month10.getText());
    }
    @FXML
    public void menu11(ActionEvent actionEvent) {
        numberMonths =11;
        menuMonths.setText(month11.getText());
    }
    @FXML
    public void menu12(ActionEvent actionEvent) {
        numberMonths =12;
        menuMonths.setText(month12.getText());
    }
    @FXML
    public void clickBtn(ActionEvent actionEvent) {
        result = (Integer.parseInt(field.getText()) * factor * numberMonths) / YEAR;
        labelResult.setText("Сумма налога = " + result + " руб.");
    }
}
