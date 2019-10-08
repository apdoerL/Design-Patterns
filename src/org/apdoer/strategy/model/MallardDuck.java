package org.apdoer.strategy.model;

import org.apdoer.strategy.behavior.impl.FlyWithWings;
import org.apdoer.strategy.behavior.impl.Quack;

public class MallardDuck extends Duck {
   public MallardDuck() {
      quackBehavior = new Quack();
      flyBehavior = new FlyWithWings();
   }
   @Override
   public void display() {
      System.out.println("I’m a real Mallard duck");
   }
}
