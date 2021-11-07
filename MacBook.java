package com.company;

public class MacBook implements Mac {

    @Override
    public void USBCPort() {
        System.out.println("I'am macbook, and i have only usb-c ports");
    }
}
