package com.example.text;


import java.util.Random;

public class BattleSystem
{
    enum StartingPlayer {thePlayer, theEnemy};
    enum WinChance {high, medium, low};

    private static Random randomizer = new Random();


    // instances
    static boolean isPlayerDead = false;
    static boolean isEnemyDead = false;



    // methods
    public static WinChance determineWinChance()  // voor deze methode moet ik een formule voor verzinnen om te winkans van de speler te bepalen.
    {
        return WinChance.medium;  // placeholder
    }


    public static double determineDamagePlayer()
    {
        if (Player.getAttackPower() > Enemy.getDefencePower())
        {
            return Math.round(Player.getAttackPower() * randomizer.nextDouble(1, 1.5));
        }
        else if (Player.getAttackPower() == Enemy.getDefencePower())
        {
            return Math.round(Player.getAttackPower() * randomizer.nextDouble(0.95, 1.10));
        }
        else
        {
            return Math.round(Player.getAttackPower() * randomizer.nextDouble(0.75, 1.05));
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
            return Math.round(Enemy.getAttackPower() * randomizer.nextDouble(0.95, 1.05));
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
      //  int newHealth = Enemy.getHealth() - (int)determineDamagePlayer();
        Enemy.setHealth(Enemy.getHealth() - (int)determineDamagePlayer());
    }

    public static void enemyAttack()
    {
      //  int newHealth = Player.getHealth() - (int)determineDamageEnemy();
        Player.setHealth(Player.getHealth() - (int)determineDamageEnemy());
    }

    public static void battleSkeleton()
    {
       isPlayerDead = false;
       isEnemyDead = false;
       determineFirstAttacker();
       switch (determineFirstAttacker())
       {
           case thePlayer:
               while (Player.getHealth() > 0 && Enemy.getHealth() > 0)
               {
                   System.out.println("JIJ BEGINT"); // voor testing
                   determineDamagePlayer();
                   System.out.println(determineDamagePlayer()); // voor testing
                   playerAttack();
                   System.out.println(Enemy.getHealth()); // voor testing
                   determineDamageEnemy();
                   System.out.println(determineDamageEnemy()); // voor testing
                   enemyAttack();
                   System.out.println(Player.getHealth()); // voor testing
               }
               break;

           case theEnemy:
               while (Player.getHealth() > 0 && Enemy.getHealth() > 0)
               {
                   System.out.println("JE VIJAND BEGINT"); // voor testing
                   determineDamageEnemy();
                   System.out.println(determineDamageEnemy()); // voor testing
                   enemyAttack();
                   System.out.println(Player.getHealth()); // voor testing
                   determineDamagePlayer();
                   System.out.println(determineDamagePlayer()); // voor testing
                   playerAttack();
                   System.out.println(Enemy.getHealth()); // voor testing
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
