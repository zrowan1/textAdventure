package com.example.text;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class BattleViewController
{
    static Enemy enemy;
    Player playerOne;

    public void showAllStats() {
        statsPane.setOpacity(1.0);
        attackStatText.setText("ATK = " + playerOne.getAttackPower());
        defenceStatText.setText("DEF = " + playerOne.getDefencePower());
        speedStatText.setText("SPD = " + playerOne.getSpeed());
        staminaStatText.setText("STA = " + playerOne.getStamina());
        healthStatText.setText("HP = " + playerOne.getHealth());

    }

    public void setQuitGame()
    {
        Stage stage = (Stage) chapterOneScene.getScene().getWindow();
        stage.close();
    }
    public void setBackToMainMenu() throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Stage stage = (Stage) chapterOneScene.getScene().getWindow();
        stage.setScene(new Scene(fxmlLoader.load(), 700, 550));
    }
    public static void setEnemyText()
    {
        enemyText.setText(Enemy.getEnemyName());
    }

    @FXML
    protected AnchorPane chapterOneScene;
    @FXML
    protected MenuItem viewStats;
    @FXML
    protected MenuItem backToMainMenuItem;
    @FXML
    protected MenuItem quitGameItem;
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
    protected static Text enemyText;
    @FXML
    protected Text enemyHpText;

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
    @FXML
    public void clickQuitGameItem(ActionEvent event)
    {
        setQuitGame();
    }
    @FXML
    private void clickBackToMainMenuItem(ActionEvent event) throws IOException
    {
        setBackToMainMenu();
    }




}
