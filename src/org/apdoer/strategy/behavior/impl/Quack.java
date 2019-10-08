package org.apdoer.strategy.behavior.impl;

import org.apdoer.strategy.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}

