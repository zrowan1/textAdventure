package com.example.text;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


import java.io.IOException;

import static com.example.text.Player.*;

public class CharacterCreatorController
{

    Player playerOne;
    public static String tempName = "No Name";





    @FXML
    protected TextField enterPlayerName;
    @FXML
    protected Button uberNerdButton;
    @FXML
    protected Button linuxEliteButton;
    @FXML
    protected Button macRichKidButton;
    @FXML
    protected Button netwerkBeheerderButton;



    @FXML
    private void inputName(KeyEvent event)
    {
        tempName = enterPlayerName.getText();
        System.out.println(tempName);
    }
    @FXML
    private void clickUberNerdButton(MouseEvent event) throws IOException
    {
        Player.setPlayerOne(tempName);
        Player.chooseUberNerd();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("chapterone-view.fxml"));
        Stage stage = (Stage) uberNerdButton.getScene().getWindow();
        stage.setScene(new Scene(fxmlLoader.load(), 700, 550 ));
    }
    @FXML
    private void clickLinuxEliteButton(MouseEvent event) throws IOException
    {
        Player.setPlayerOne(tempName);
        Player.chooseLinuxElite();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("chapterone-view.fxml"));
        Stage stage = (Stage) linuxEliteButton.getScene().getWindow();
        stage.setScene(new Scene(fxmlLoader.load(), 700, 550));
    }
    @FXML
    private void clickMacRichKidButton(MouseEvent event) throws IOException
    {
        Player.setPlayerOne(tempName);
        Player.chooseMacRichKid();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("chapterone-view.fxml"));
        Stage stage = (Stage) macRichKidButton.getScene().getWindow();
        stage.setScene(new Scene(fxmlLoader.load(), 700, 550));
    }
    @FXML
    private void clickNetwerkBeheerderButton(MouseEvent event) throws IOException
    {
        Player.setPlayerOne(tempName);
        Player.chooseNetwerkBeheerder();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("chapterone-view.fxml"));
        Stage stage = (Stage) netwerkBeheerderButton.getScene().getWindow();
        stage.setScene(new Scene(fxmlLoader.load(), 700, 550));
    }


}
