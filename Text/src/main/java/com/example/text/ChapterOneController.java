package com.example.text;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.controlsfx.control.action.Action;
import org.w3c.dom.events.MouseEvent;

import java.io.IOException;

public class ChapterOneController
{
    Player playerOne;

    public void showAllStats() {
        statsPane.setOpacity(1.0);
        attackStatText.setText("ATK = " + playerOne.getAttackPower());
        defenceStatText.setText("DEF = " + playerOne.getDefencePower());
        speedStatText.setText("SPD = " + playerOne.getSpeed());
        staminaStatText.setText("STA = " + playerOne.getStamina());
        healthStatText.setText("HP = " + playerOne.getHealth());

    }


    @FXML
    protected MenuItem viewStats;
    @FXML
    protected Pane statsPane;
    @FXML
    protected Text attackStatText;
    @FXML
    protected Text defenceStatText;
    @FXML
    protected Text speedStatText;
    @FXML
    protected Text staminaStatText;
    @FXML
    protected Text healthStatText;
    @FXML
    protected Button goBackButton;


    @FXML
    private void clickViewStatsItem(ActionEvent event)
    {
        showAllStats();
    }
    @FXML
    public void clickGoBackButton(ActionEvent event)
    {

        statsPane.setOpacity(0.0);
    }


}
