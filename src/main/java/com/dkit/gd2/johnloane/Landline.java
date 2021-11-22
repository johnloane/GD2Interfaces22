package com.dkit.gd2.johnloane;

import java.util.ArrayList;

public class Landline implements ITelephone
{
    private int myNumber;
    private boolean isRinging;
    private boolean onCall = false;
    private boolean onHold = false;
    private ArrayList<Integer> contactList;
    private ArrayList<Integer> blockedNumbers;

    public Landline(int myNumber)
    {
        this.myNumber = myNumber;
        this.contactList = new ArrayList<>();
        this.blockedNumbers = new ArrayList<>();
    }

    @Override
    public boolean callPhone(int phoneNumber)
    {
        this.isRinging = true;
        System.out.println("Calling " + phoneNumber);
        return isRinging;
    }

    @Override
    public boolean addPhoneNumber(int number)
    {
        if(this.contactList.contains(number))
        {
            return false;
        }
        else
        {
            this.contactList.add(number);
        }
        return true;
    }

    @Override
    public void blockCall(int number)
    {
        if(isRinging)
        {
            this.blockedNumbers.add(number);
        }
    }

    @Override
    public void showContactList()
    {
        for(int contact : this.contactList)
        {
            System.out.println(contact);
        }
    }

    @Override
    public void answer()
    {
        System.out.println("Answering the phone");
        isRinging = false;
    }

    @Override
    public void hangUp()
    {
        if(this.isRinging)
        {
            System.out.println("Hanging up the phone");
            isRinging = false;
        }
    }

    @Override
    public boolean putOnHold()
    {
        if(this.onCall && this.onHold == false)
        {
            System.out.println("Putting on hold");
            this.onHold = true;
            return true;
        }
        else if(this.onHold == true)
        {
            return false;
        }
        return false;
    }

    @Override
    public boolean isRinging()
    {
        return this.isRinging;
    }

    @Override
    public void dial(int phoneNumber)
    {
        System.out.println("Dialling " + phoneNumber);
    }

    @Override
    public void powerOn()
    {
        System.out.println("No action taken - the landline is always on");
    }

    @Override
    public void blackList(int phoneNumber)
    {
        if(this.blockedNumbers.contains(phoneNumber))
        {
        }
        else
        {
            this.blockedNumbers.add(phoneNumber);
        }
    }
}
