package com.dkit.gd2.johnloane.gameinterface;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Player john = new Player("John", 10, 15);
        System.out.println(john.toString());
        saveObject(john);

        ISaveable endOfLevelBoss = new Monster("Werewolf", 20, 40);
        loadObject(endOfLevelBoss);
        System.out.println(endOfLevelBoss);
    }

    public static void saveObject(ISaveable objectToSave)
    {
        for (int i = 0; i < objectToSave.write().size(); i++)
        {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad)
    {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

    private static ArrayList<String> readValues()
    {
        ArrayList<String> values = new ArrayList<>();

        Scanner keyboard = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose \n" +
                "1 to enter a string \n" +
                "0 to quit");

        while(!quit)
        {
            System.out.print("Choose an option: ");
            int choice = keyboard.nextInt();
            keyboard.nextLine();

            switch(choice)
            {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = keyboard.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
}
