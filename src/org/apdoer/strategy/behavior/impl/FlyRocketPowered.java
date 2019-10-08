package org.apdoer.strategy.behavior.impl;

import org.apdoer.strategy.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I’m flying with a rocket!");
    }
}