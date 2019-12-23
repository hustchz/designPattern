package com.chz.factory;

public class BlackMan implements Human {
    public HumanColor getColor() {
        return HumanColor.BLACK;
    }

    public void talk() {
        System.out.println("黑人在说话");
    }
}
