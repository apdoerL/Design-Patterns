package org.apdoer.observer.observer;

import java.math.BigDecimal;

/**
 * 观察者
 * @author apdoer
 * @version 1.0
 * @date 2019/10/9 16:16
 */
public interface Observer {

    /**
     * 当观察的主题发生改变时,通知观察者
     * @param salary 薪水
     * @param workspace 工作地
     * @param workTime 工作时间
     */
    void update(BigDecimal salary,String workspace,Long workTime);
}
