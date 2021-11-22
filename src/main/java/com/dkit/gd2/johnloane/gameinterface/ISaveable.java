package com.dkit.gd2.johnloane.gameinterface;

import java.util.List;

public interface ISaveable
{
    List<String> write();
    void read(List<String> savedValues);
}
