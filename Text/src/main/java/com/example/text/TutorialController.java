package com.example.text;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.controlsfx.control.action.Action;
import org.w3c.dom.events.MouseEvent;

import java.io.IOException;

public class TutorialController
{
    Player playerOne;

    public void showAllStats() {
        statsPane.setDisable(false);
        statsPane.setOpacity(1.0);
        attackStatText.setText("ATK = " + Player.getAttackPower());
        defenceStatText.setText("DEF = " + Player.getDefencePower());
        speedStatText.setText("SPD = " + Player.getSpeed());
        staminaStatText.setText("STA = " + Player.getStamina());
        healthStatText.setText("HP = " + Player.getHealth());

    }

    private void setQuitGame()
    {
            Stage stage = (Stage) chapterOneScene.getScene().getWindow();
            stage.close();
    }
    private void setBackToMainMenu() throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Stage stage = (Stage) chapterOneScene.getScene().getWindow();
        stage.setScene(new Scene(fxmlLoader.load(), 700, 550));
    }
    private void setTutorial() throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("battle-view.fxml"));
        Stage stage = (Stage) jaButton.getScene().getWindow();
        stage.setScene(new Scene(fxmlLoader.load(), 700, 550));
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
    protected Button jaButton;



    @FXML
    private void clickViewStatsItem(ActionEvent event)
    {
        showAllStats();
    }
    @FXML
    public void clickGoBackButton(ActionEvent event)
    {

        statsPane.setOpacity(0.0);
        statsPane.setDisable(true);
    }
    @FXML
    public void clickQuitGameItem(ActionEvent event)
    {
        setQuitGame();
    }
    @FXML
    public void clickBackToMainMenuItem(ActionEvent event) throws IOException
    {
        setBackToMainMenu();
    }

    @FXML
    public void clickJaButton(javafx.scene.input.MouseEvent mouseEvent) throws IOException
    {
        setTutorial();
    }
}
