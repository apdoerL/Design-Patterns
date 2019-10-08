package org.apdoer.strategy.model;

import org.apdoer.strategy.behavior.impl.FlyNoWay;
import org.apdoer.strategy.behavior.impl.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I’m a model duck");
    }
}