package com.chz.factory;

public class BlackHumanFactory extends AbstractHumanFactory{
    Human createHuman() {
        return new BlackMan();
    }
}
