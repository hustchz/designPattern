package com.chz.factory;

public class WhiteHumanFactory extends AbstractHumanFactory{
    Human createHuman() {
        return new WhiteMan();
    }
}
