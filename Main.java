package com.company;

public class Main {

    public static void main(String[] args) {
	    MacBook macBook = new MacBook();
        SDCard sdCard = new SDCard();
        Mac reader = new SDCardReader(sdCard);

        useadapter(macBook);

        useadapter(reader);

        sdCard.insertIntoSDSlot();
    }

    public static void useadapter(Mac mac) {
        mac.USBCPort();
    }
}
