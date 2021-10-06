package com.example.text;


import static com.example.text.CharacterCreatorController.tempName;


enum playerItem {blackMamba, spaghetti, mountainDew, schultenbrau, racePedalen, airPodsPro, fontysKaart,
frikandelBroodje, dextro, cppBoek, iphone13ProMax, applePencil, iPadMini}
// een enum gemaakt voor alle items die de speler in de game kan krijgen.

enum PlayerClass {Standard, UberNerd, LinuxElite, MacRichKid, NetwerkBeheerder}

public class Player
{

    Player playerOne;

    // instances  --> dit zijn alle values voor de eigenschappen van het personage van de speler zoals health en attack.
    private static int health = 100;
    private static int attackPower = 10;
    private static int defencePower = 10;
    private static int speed = 10;
    private static int stamina = 100;
    private static playerItem equippedWeapon;
    public static PlayerClass pickedClass; // alleen voor testing op public. anders op private
    private static String playerName;
    public PlayerClass tempClass = PlayerClass.Standard; // alleen voor testing op public. anders op private
    playerItem[] inventory = new playerItem[5];

    // constructor

    public Player(String name)
    {
        playerName = name;
    }

    // get-methods

    public static String getPlayerName()
    {
        return playerName;
    }
    public static int getHealth()
    {
        return health;
    }
    public static int getAttackPower()
    {
        return attackPower;
    }
    public static int getDefencePower()
    {
        return defencePower;
    }
    public static int getSpeed()
    {
        return speed;
    }
    public static int getStamina()
    {
        return stamina;
    }
    public static playerItem getEquippedWeapon()
    {
        return equippedWeapon;
    }
    public static PlayerClass getPickedClass()
    {
        return pickedClass;
    }

    public static void setPlayerOne(String name)
    {
        Player playerOne = new Player(tempName);
    }



    public static void chooseUberNerd()
    {
        health = 120;
        attackPower = 8;
        defencePower = 12;
        speed = 11;
        stamina = 80;
        pickedClass = PlayerClass.UberNerd;
    }
    public static void chooseLinuxElite()
    {
        health = 85;
        attackPower = 13;
        defencePower = 8;
        speed = 12;
        stamina = 90;
        pickedClass = PlayerClass.LinuxElite;
    }
    public static void chooseMacRichKid()
    {
        health = 105;
        attackPower = 8;
        defencePower = 14;
        speed = 10;
        stamina = 110;
        pickedClass = PlayerClass.MacRichKid;
    }
    public static void chooseNetwerkBeheerder()
    {
        health = 100;
        attackPower = 10;
        defencePower = 10;
        speed = 10;
        stamina = 100;
        pickedClass = PlayerClass.NetwerkBeheerder;
    }






}