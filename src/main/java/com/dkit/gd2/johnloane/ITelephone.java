package com.dkit.gd2.johnloane;

import java.util.ArrayList;

public interface ITelephone
{
    boolean callPhone(int phoneNumber);
    boolean addPhoneNumber(int number);
    void blockCall(int number);
    void showContactList();
    void answer();
    void hangUp();
    boolean putOnHold();
    boolean isRinging();
    void dial(int phoneNumber);
    void powerOn();
    void blackList(int phoneNumber);
}
