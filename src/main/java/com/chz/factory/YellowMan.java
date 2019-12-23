package com.chz.factory;

public class YellowMan implements Human {
    public HumanColor getColor() {
        return HumanColor.YELLOW;
    }

    public void talk() {
        System.out.println("黄种人在说话");
    }
}
