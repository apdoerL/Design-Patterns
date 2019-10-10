package org.apdoer.observer.jdkObserver;

import org.apdoer.observer.observer.Information;

import java.math.BigDecimal;
import java.util.Observable;
import java.util.Observer;

/**
 * @author apdoer
 * @version 1.0
 * @date 2019/10/10 14:23
 */
public class JdkJobSearcher2 implements Observer, Information {
    private BigDecimal salary;
    private String wordspace;
    private Long workTime;

    private Observable headHunting;

    public JdkJobSearcher2(Observable headHunting) {
        this.headHunting = headHunting;
        headHunting.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof JdkHeadHunting) {
            JdkHeadHunting jdkHeadHunting = (JdkHeadHunting)o;
            this.salary = jdkHeadHunting.getSalary();
            this.wordspace = jdkHeadHunting.getWorkspace();
            this.workTime = jdkHeadHunting.getWorkTime();
            showInfo();
        }
    }


    @Override
    public void showInfo() {
        System.out.println("JdkJobSearcher2{" +
                "salary=" + salary +
                ", wordspace='" + wordspace + '\'' +
                ", workTime=" + workTime +
                ", headHunting=" + headHunting +
                '}');
    }
}
