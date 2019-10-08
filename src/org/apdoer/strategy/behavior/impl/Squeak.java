package org.apdoer.strategy.behavior.impl;

import org.apdoer.strategy.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak”");
    }
}