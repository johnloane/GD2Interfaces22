package com.dkit.gd2.johnloane;

import com.dkit.gd2.johnloane.gameinterface.Player;

import static com.dkit.gd2.johnloane.gameinterface.Main.saveObject;

/**
 * Interfaces!!!!!!!!!!!!!!!!!!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ITelephone johnsPhone;
        johnsPhone = new Landline(123456);
        johnsPhone.powerOn();
        johnsPhone.dial(34567);
        johnsPhone.callPhone(34567);

        ITelephone jamesPhone;
        jamesPhone = new MobilePhone(98765);
        jamesPhone.powerOn();
        jamesPhone.dial(34567);
        jamesPhone.callPhone(34567);

        Player stephen = new Player("Stephen", 20, 20);
        saveObject(stephen);

    }
}
