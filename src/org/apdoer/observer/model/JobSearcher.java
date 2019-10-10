package org.apdoer.observer.model;

import org.apdoer.observer.observer.Information;
import org.apdoer.observer.observer.Observer;
import org.apdoer.observer.observer.Subject;

import java.math.BigDecimal;

/**
 * 观察者,求职者
 * @author apdoer
 * @version 1.0
 * @date 2019/10/9 16:55
 */
public class JobSearcher implements Observer, Information {
    private BigDecimal salary;
    private String wordspace;
    private Long workTime;

    private Subject headHunting;


    /**
     *
     * @param headHunting
     */
    public JobSearcher(Subject headHunting ) {
        this.headHunting = headHunting;
        //注册观察者
        headHunting.registerObserver(this);
    }

    @Override
    public void showInfo() {
        System.out.println("JobSearcher{" +
                "salary=" + salary +
                ", wordspace='" + wordspace + '\'' +
                ", workTime=" + workTime +
                ", jobData=" + headHunting +
                '}');
    }

    @Override
    public void update(BigDecimal salary, String workspace, Long workTime) {
        this.salary = salary;
        this.wordspace = workspace;
        this.workTime = workTime;
        showInfo();
    }


}
