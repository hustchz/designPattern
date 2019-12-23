package com.chz.abstractFactory;

import com.chz.factory.HumanColor;

public abstract class AbstractBlackHuman implements Human{

    public HumanColor getColor() {
        return HumanColor.BLACK;
    }

    public void talk() {
        System.out.println("黑人在讲话");
    }

    public abstract String getSex();
}
