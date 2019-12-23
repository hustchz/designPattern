package com.chz.abstractFactory;

public class MaleFactory extends AbstractHumanFactory {
    Human createYellowHuman() {
        return new MaleYellowMan();
    }

    Human createWhiteHuman() {
        return new MaleWhiteMan();
    }

    Human createBlackHuman() {
        return new MaleBlackMan();
    }
}
