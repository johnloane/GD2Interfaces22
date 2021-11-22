package com.dkit.gd2.johnloane.theatre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Theatre olympia = new Theatre("Olympia", 20, 100);

        reserveSeat(olympia, "D12");
        reserveSeat(olympia, "D12");

        List<Seat> seats = new ArrayList<>(olympia.getSeats());
        printList(seats);
        //Collections.reverse(seats);
       // printList(seats);

        List<Seat> priceSeats = new ArrayList<>(olympia.getSeats());
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);




    }

    private static void printList(List<Seat> listOfSeats)
    {
        for(Seat seat : listOfSeats)
        {
            System.out.printf(" %s €%.2f", seat.getSeatNumber(), seat.getPrice());
        }
        System.out.println();
        System.out.println("==========================================");
    }

    private static void reserveSeat(Theatre theatre, String seatNumber)
    {
        if(theatre.reserveSeat(seatNumber))
        {
            System.out.println("Please pay for " + seatNumber);
        }
        else
        {
            System.out.println(seatNumber + " already reserved");
        }
    }


}
