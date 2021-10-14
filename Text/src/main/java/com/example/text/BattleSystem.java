package com.example.text;


import java.util.Random;

public class BattleSystem
{
    enum StartingPlayer {thePlayer, theEnemy};

    private static Random randomizer = new Random();


    // instances
    static boolean isPlayerDead = false;
    static boolean isEnemyDead = false;



    // methods

    public static double determineDamagePlayer()
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
    public static double determineDamageEnemy()
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

    public static StartingPlayer determineFirstAttacker()
    {
        if (Player.getSpeed() >= Enemy.getSpeed())
        {
            return StartingPlayer.thePlayer;
        }
        else
        {
            return StartingPlayer.theEnemy;
        }
    }

    public static void playerAttack()
    {
        int newHealth = Enemy.getHealth() - (int)determineDamagePlayer();
        Enemy.setHealth(newHealth);
    }

    public static void enemyAttack()
    {
        int newHealth = Player.getHealth() - (int)determineDamageEnemy();
        Player.setHealth(newHealth);
    }

    public static void battleSkeleton()
    {
       determineFirstAttacker();
       switch (determineFirstAttacker())
       {
           case thePlayer:
               while (Player.getHealth() > 0 || Enemy.getHealth() > 0)
               {
                   determineDamagePlayer();
                   playerAttack();
                   determineDamageEnemy();
                   enemyAttack();
               }
               break;
           case theEnemy:
               while (Player.getHealth() > 0 || Enemy.getHealth() > 0)
               {
                   determineDamageEnemy();
                   enemyAttack();
                   determineDamagePlayer();
                   playerAttack();
               }
               break;
       }
       if (Player.getHealth() <= 0)
       {
           isPlayerDead = true;
       }
       else if (Enemy.getHealth() <= 0)
       {
           isEnemyDead = true;
       }
    }






}
