package com.dkit.gd2.johnloane.playerexercise;

import java.util.ArrayList;

public class Player implements Comparable<Player>
{
    private String name;
    private String playerClass;
    private int level;
    private ArrayList<String> inventory;
    private String origin;
    private String race;
    private int strength;
    private int intelligence;
    private int health;

    public Player(String name, String playerClass, String origin, String race, int strength, int intelligence, int health)
    {
        this.name = name;
        this.playerClass = playerClass;
        this.level = 1;
        this.origin = origin;
        this.race = race;
        this.strength = strength;
        this.intelligence = intelligence;
        this.health = health;
        this.inventory = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public String getPlayerClass()
    {
        return playerClass;
    }

    public int getLevel()
    {
        return level;
    }

    public ArrayList<String> getInventory()
    {
        return inventory;
    }

    public String getOrigin()
    {
        return origin;
    }

    public String getRace()
    {
        return race;
    }

    public int getStrength()
    {
        return strength;
    }

    public int getIntelligence()
    {
        return intelligence;
    }

    public int getHealth()
    {
        return health;
    }

    @Override
    public String toString()
    {
        return "name='" + name + '\'' +
                ", playerClass='" + playerClass + '\'' +
                ", level=" + level +
                ", inventory=" + inventory +
                ", origin='" + origin + '\'' +
                ", race='" + race + '\'' +
                ", strength=" + strength +
                ", intelligence=" + intelligence +
                ", health=" + health;
    }

    @Override
    public int compareTo(Player otherPlayer)
    {
        return this.name.compareToIgnoreCase(otherPlayer.name);
    }

    public void setLevel(int level)
    {
        if(level > 0 && level < 11)
        {
            this.level = level;
        }
    }
}
