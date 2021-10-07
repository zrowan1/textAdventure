package com.example.text;


import java.util.Random;

public class BattleSystem
{

    Random randomizer = new Random();


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
            return Math.round(Player.getAttackPower() * randomizer.nextDouble(1, 1.5));
        }
        else if (Player.getAttackPower() == Enemy.getDefencePower())
        {
            return Math.round(Player.getAttackPower() * randomizer.nextDouble(1, 1.10));
        }
        else
        {
            return Math.round(Player.getAttackPower() * randomizer.nextDouble(0.70, 1.10));
        }
    }
    public double determineDamageEnemy()
    {
        if (Enemy.getAttackPower() > Player.getDefencePower())
        {
            return Math.round(Enemy.getAttackPower() * randomizer.nextDouble(1, 1.25));
        }
        else if (Enemy.getAttackPower() == Player.getDefencePower())
        {
            return Enemy.getAttackPower();
        }
        else
        {
            return Math.round(Enemy.getAttackPower() * randomizer.nextDouble(0.70, 1));
        }
    }





}
