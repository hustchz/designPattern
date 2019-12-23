package com.chz.abstractFactory;

import com.chz.factory.HumanColor;

public abstract class AbstractYellowHuman implements Human{
    public HumanColor getColor() {
        return HumanColor.YELLOW;
    }

    public void talk() {
        System.out.println("黄种人在讲话");
    }

    public abstract String getSex();
}
