package com.chz.factory;

public class FactoryContext {
    public static void main(String[] args) {
        AbstractHumanFactory humanFactory = new BlackHumanFactory();
        Human human = humanFactory.createHuman();
        System.out.println(human.getColor());
        humanFactory = new WhiteHumanFactory();
        human = humanFactory.createHuman();
        System.out.println(human.getColor());

    }
}
