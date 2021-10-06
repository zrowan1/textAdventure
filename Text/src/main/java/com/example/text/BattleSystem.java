package com.example.text;


public class BattleSystem
{


    // instances


    // constructor
    public BattleSystem()
    {

    }

    // methods

    public double determineDamagePlayer()
    {
        if (Player.getAttackPower() > Enemy.getDefencePower())
        {
            return Player.getAttackPower() * 1.25;
        }
        else if (Player.getAttackPower() == Enemy.getDefencePower())
        {
            return Player.getAttackPower();
        }
        else
        {
            return Player.getAttackPower() * 0.75;
        }

    }





}
