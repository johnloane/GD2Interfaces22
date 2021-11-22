package com.dkit.gd2.johnloane.theatre;

public class Seat implements Comparable<Seat>
{
    private final String seatNumber;
    private double price;
    private boolean reserved = false;

    public Seat(String seatNumber, double price)
    {
        this.seatNumber = seatNumber;
        this.price = price;
    }

    @Override
    public int compareTo(Seat otherSeat)
    {
        return this.seatNumber.compareToIgnoreCase(otherSeat.seatNumber);
    }

    public String getSeatNumber()
    {
        return seatNumber;
    }

    public double getPrice()
    {
        return price;
    }

    public boolean reserve()
    {
        if(!this.reserved)
        {
            this.reserved = true;
            System.out.println("Seat " + this.seatNumber + " reserved"
            );
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean cancel()
    {
        if(this.reserved)
        {
            this.reserved = false;
            System.out.println("Reservation of seat " + this.seatNumber + " cancelled");
            return true;
        }
        else
        {
            return false;
        }
    }
}
