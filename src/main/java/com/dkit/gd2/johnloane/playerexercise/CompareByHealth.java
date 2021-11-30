package com.dkit.gd2.johnloane.playerexercise;

import java.util.Comparator;

public class CompareByHealth implements Comparator<Player>
{
    @Override
    public int compare(Player player1, Player player2)
    {
        return player1.getHealth() - player2.getHealth();
    }
}
