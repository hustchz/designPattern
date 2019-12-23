package com.chz.abstractFactory;

public class FemaleFactory extends AbstractHumanFactory {
    Human createYellowHuman() {
        return new FemaleYellowMan();
    }

    Human createWhiteHuman() {
        return new FemaleWhiteMan();
    }

    Human createBlackHuman() {
        return new FemaleBlackMan();
    }
}
