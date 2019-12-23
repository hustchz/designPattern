package com.chz.factory;

public class WhiteMan implements Human {
    public HumanColor getColor() {
        return HumanColor.WHITE;
    }

    public void talk() {
        System.out.println("白人在说话");
    }
}
