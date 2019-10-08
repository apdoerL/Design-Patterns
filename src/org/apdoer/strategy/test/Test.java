package org.apdoer.strategy.test;

import org.apdoer.strategy.behavior.impl.FlyRocketPowered;
import org.apdoer.strategy.model.Duck;
import org.apdoer.strategy.model.MallardDuck;
import org.apdoer.strategy.model.ModelDuck;

/**
 * @author apdoer
 * @version 1.0
 * @date 2019/10/8 16:01
 */
public class Test {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();

        mallard.performQuack();

        mallard.performFly();

//        Duck model = new ModelDuck();
//        model.performFly();
//        model.setFlyBehavior(new FlyRocketPowered());
//        model.performFly();
    }
}
