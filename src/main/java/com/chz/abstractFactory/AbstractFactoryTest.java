package com.chz.abstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractHumanFactory factory = new FemaleFactory();
        System.out.println(factory.createWhiteHuman());
        System.out.println(factory.createYellowHuman());
        System.out.println(factory.createBlackHuman());
    }
}
