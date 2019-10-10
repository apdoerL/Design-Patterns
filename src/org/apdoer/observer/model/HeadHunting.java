package org.apdoer.observer.model;

import org.apdoer.observer.observer.Observer;
import org.apdoer.observer.observer.Subject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author apdoer
 * @version 1.0
 * @date 2019/10/10 11:40
 */
public class HeadHunting implements Subject {

    private List observers;
    private BigDecimal salary;
    private String workspace;
    private Long workTime;

    public HeadHunting() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(salary,workspace,workTime);
        }
    }

    /**
     * 职位信息更新,通知观察者
     */
    public void jobInfoChanged(){
        notifyObservers();
    }

    public void setJobInfo(BigDecimal salary,String workspace,Long workTime){
        this.salary = salary;
        this.workspace = workspace;
        this.workTime = workTime;
        jobInfoChanged();
    }

    // other methods
}
