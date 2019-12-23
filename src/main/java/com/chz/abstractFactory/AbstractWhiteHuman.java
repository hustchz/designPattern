package com.chz.abstractFactory;

import com.chz.factory.HumanColor;

public abstract class AbstractWhiteHuman implements Human{
    public HumanColor getColor() {
        return HumanColor.WHITE;
    }

    public void talk() {
        System.out.println("白人在讲话");
    }

    public abstract String getSex();
}
