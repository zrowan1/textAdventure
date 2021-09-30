package com.example.text;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;


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
    public void clickUberNerdButton(MouseEvent event)
    {
        Player.setPlayerOne(tempName);
        System.out.println(playerOne.getPlayerName()); // alleen voor testing
        Player.chooseUberNerd();
        System.out.println(playerOne.pickedClass); // alleen voor testing
    }
    @FXML
    public void clickLinuxEliteButton(MouseEvent event)
    {
        Player.setPlayerOne(tempName);
        System.out.println(playerOne.getPlayerName()); // alleen voor testing
        Player.chooseLinuxElite();
        System.out.println(playerOne.pickedClass); // alleen voor testing
    }
    @FXML
    public void clickMacRichKidButton(MouseEvent event)
    {
        Player.setPlayerOne(tempName);
        System.out.println(playerOne.getPlayerName()); // alleen voor testing
        Player.chooseMacRichKid();
        System.out.println(playerOne.pickedClass); // alleen voor testing
    }
    @FXML
    public void clickNetwerkBeheerderButton(MouseEvent event)
    {
        Player.setPlayerOne(tempName);
        System.out.println(playerOne.getPlayerName()); // alleen voor testing
        Player.chooseNetwerkBeheerder();
        System.out.println(playerOne.pickedClass); // alleen voor testing
    }


}
