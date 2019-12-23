package com.chz.abstractFactory;

/*
* 抽象工厂模式 拥有N个创建方法 表示可以同时创建多个对象
* 和 工厂模式不同的是 可以同时创建多个产品
* 如果写成普通工厂模式，需要创建6个工厂实现类（Female male 和Y，W，B）的组合
* 以及要创建6个产品实现类，分别一一对应，而抽象工厂在这个基础上进一步抽象，把性别抽象出来
* 只需要创建2个抽象工厂实现类（MaleHumanFactory FemaleHumanFactory 每一个抽象工厂实现类生产多个产品）
* */
public abstract class AbstractHumanFactory {
    abstract Human createYellowHuman();
    abstract Human createWhiteHuman();
    abstract Human createBlackHuman();
}
