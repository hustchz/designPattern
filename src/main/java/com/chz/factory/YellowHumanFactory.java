package com.chz.factory;

public class YellowHumanFactory extends AbstractHumanFactory{
    Human createHuman() {
        return new YellowMan();
    }
}
