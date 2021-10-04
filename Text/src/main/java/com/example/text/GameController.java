package com.example.text;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class GameController
{


    @FXML
    protected Button newGameButton;
    @FXML
    protected Button exitGameButton;

    @FXML
    private void useExitGameButton(MouseEvent event)
    {
        Stage stage = (Stage) exitGameButton.getScene().getWindow();
        stage.close();
    }
    @FXML
    private void useNewGameButton(MouseEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("charactercreator-view.fxml"));
        Stage stage = (Stage) newGameButton.getScene().getWindow();
        stage.setScene(new Scene(fxmlLoader.load(), 700, 550 ));
    }

}