package com.dkit.gd2.johnloane.gameinterface;

public class Main
{
    public static void main(String[] args)
    {
        Player john = new Player("John", 10, 15);
        System.out.println(john.toString());
        saveObject(john);
    }

    public static void saveObject(ISaveable objectToSave)
    {
        for (int i = 0; i < objectToSave.write().size(); i++)
        {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }
}
