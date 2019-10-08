package org.apdoer.strategy.model;

import org.apdoer.strategy.behavior.FlyBehavior;
import org.apdoer.strategy.behavior.QuackBehavior;

/**
 * @author apdoer
 * @version 1.0
 * @date 2019/10/8 15:52
 */
public abstract class Duck {
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    /**
     * 为行为接口类型声明两个 引用变量，所有鸭子子类 （在同一个  package）都 继承它们。
     */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck() {

    }
    public abstract void display();
    public void performFly() {
        //委托给行为类
        flyBehavior.fly();
    }
    public void performQuack() {
        //委托给行为类
        quackBehavior.quack();
    }
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
