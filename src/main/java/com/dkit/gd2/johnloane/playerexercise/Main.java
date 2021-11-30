package com.dkit.gd2.johnloane.playerexercise;

/* Player has name, class, level, inventory, origin, race, strength intelligence and health
   1. Create player class
   2. Instantiate 10 players with different attributes
   3. name -> Comparable
   4. CompareByLevel
   5. CompareByHealth
   6. CompareByStrength
   7. CompareByIntelligence
   8. In main app print the 10 players in all different orders
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Player> players = new ArrayList<Player>();
        createTenPlayers(players);
        List<Player> sortedByName = new ArrayList<>(players);
        Collections.sort(sortedByName);
        List<Player> sortedByLevel = new ArrayList<>(players);
        Collections.sort(sortedByLevel, new CompareByLevel());
        List<Player> sortedByHealth = new ArrayList<>(players);
        Collections.sort(sortedByHealth, new CompareByHealth());
        //printPlayers(sortedByHealth);
        List<Player> sortedByIntelligence = new ArrayList<>(players);
        Collections.sort(sortedByIntelligence, new CompareByIntelligence());
        printPlayers(sortedByIntelligence);
    }

    private static void printPlayers(List<Player> players)
    {
        for(Player player : players)
        {
            System.out.println(player.toString());
        }
    }

    private static void createTenPlayers(List players)
    {
        Player ben = new Player("Ben", "Paladin", "A lonely traveller", "Dwarf", 15, 5, 15);
        players.add(ben);
        Player andrew = new Player("Andrew", "Hunter", "Fell from a tree", "Elf", 12, 9, 13);
        players.add(andrew);
        Player niallNumberOne = new Player("NiallNumberOne", "Warlock", "Came back from the dead", "Human", 10, 2, 21);
        players.add(niallNumberOne);
        Player niallNumberTwo = new Player("NiallNumberTwo", "Elite", "A cave", "Alien", 100, 50, 10);
        niallNumberTwo.setLevel(10);
        players.add(niallNumberTwo);
        Player james = new Player("James", "Archer", "Spawn of Satan", "Centaur", 50, 17, 20);
        players.add(james);
        Player tanaka = new Player("Tanaka", "Assassin", "Survivor", "Human", 50, 40, 100);
        players.add(tanaka);
        Player prithvi = new Player("Prithvi", "Mage", "Fell from the sky", "Demi-god", 10, 49, 50);
        players.add(prithvi);
        Player stephen = new Player("Stephen", "Warrior", "Nord", "Human", 25, 15, 25);
        players.add(stephen);
        Player emmanuel = new Player("Emmanuel", "Druid", "Came from the elf village", "Elf", 20, 22, 35);
        players.add(emmanuel);
        Player emily = new Player("Emily", "Rogue", "Released from jail", "Half-elf", 20, 30, 50);
        players.add(emily);
    }
}
