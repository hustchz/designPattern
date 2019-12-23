package com.chz.abstractFactory;

import com.chz.factory.HumanColor;

public interface Human {
    // 定义 人的基本属性
    HumanColor getColor();

    void talk();

    String getSex();
}
