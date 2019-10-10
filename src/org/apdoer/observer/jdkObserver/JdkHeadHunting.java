package org.apdoer.observer.jdkObserver;

import java.math.BigDecimal;
import java.util.Observable;

/**
 * @author apdoer
 * @version 1.0
 * @date 2019/10/10 14:16
 */
public class JdkHeadHunting extends Observable {

    private BigDecimal salary;
    private String workspace;
    private Long workTime;

    public JdkHeadHunting() {
        // 这里不同在初始化了,父类中有
    }

    public void jobInfoChanged(){
        setChanged();
        //拉的模式获取更新
        notifyObservers();
    }

    public void setJobInfo(BigDecimal salary,String workspace,Long workTime){
        this.salary = salary;
        this.workspace = workspace;
        this.workTime = workTime;
        jobInfoChanged();
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public String getWorkspace() {
        return workspace;
    }

    public Long getWorkTime() {
        return workTime;
    }
}
