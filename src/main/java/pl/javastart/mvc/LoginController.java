package pl.javastart.mvc;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField changeText;

    @FXML
    private Label changeLabel;

    @FXML
    private Button changeButton;


    public void initialize() {

        changeButton.setOnAction(Event ->
                changeLabel.setText(changeText.getText()));




    }
}