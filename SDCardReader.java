package com.company;

public class SDCardReader implements Mac {
    SDCard SDCard;

    public SDCardReader(SDCard SDCard) {
        this.SDCard = SDCard;
    }

    @Override
    public void USBCPort() {
        System.out.println("*Use an adapter with SD card support");
    }
}
