package com.example.text;




public class Enemy
{
    Enemy tutorialEnemy = new Enemy(50, 5, 8, 10, 100, "De Vijand", Enemy.EnemyType.Leerling);

    protected enum EnemyType {Leraar, Leerling, Concierge};

    // instances
    private static int health;
    private static int attackPower;
    private static int defencePower;
    private static int speed;
    private static int stamina;
    private static String enemyName;
    private static EnemyType enemyType;

    // constructor

    public Enemy(int hp, int attack, int defence, int spd, int sta, String name, EnemyType type)
    {
        health = hp;
        attackPower = attack;
        defencePower = defence;
        speed = spd;
        stamina = sta;
        enemyName = name;
        enemyType = type;

    }

    // get methods

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
    public static String getEnemyName()
    {
        return enemyName;
    }



}
