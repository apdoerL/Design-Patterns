package org.apdoer.observer.observer;

/**
 * 主题
 * @author apdoer
 * @version 1.0
 * @date 2019/10/9 16:15
 */
public interface Subject {

    /**
     * 注册观察者
     * @param observer 观察者
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer 观察者
     */
    void removeObserver(Observer observer);

    /**
     * 当主题状态发生改变时,这个方法会被调用,通知所有观察者
     */
    void notifyObservers();
}
