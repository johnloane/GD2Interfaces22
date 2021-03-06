package com.dkit.gd2.johnloane.playerexercise;

import java.util.Comparator;

public class CompareByIntelligence implements Comparator<Player>
{
    @Override
    public int compare(Player player1, Player player2)
    {
        return player1.getIntelligence() - player2.getIntelligence();
    }
}
