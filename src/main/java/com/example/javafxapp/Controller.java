package com.example.javafxapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField userMessage;
    @FXML
    private TextArea historyArea;
  ;
    @FXML
    private Label welcomeText;

    public void clickCheckButton(ActionEvent actionEvent) {
        historyArea.appendText(userMessage.getText() + "\n");


    }
}