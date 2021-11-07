package com.company;

import java.util.stream.Stream;

public class SDCard implements Storage {

    @Override
    public void insertIntoSDSlot() {
        System.out.println("Sd card is inserted! ");
    }
}
