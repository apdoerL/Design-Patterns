package org.apdoer.observer.jdkObserver;


import java.math.BigDecimal;
import java.util.Observer;

/**
 * @author apdoer
 * @version 1.0
 * @date 2019/10/10 14:29
 */
public class JdkTest {
    public static void main(String[] args) {
        JdkHeadHunting hd = new JdkHeadHunting();
        Observer searcher = new JdkJobSearcher(hd);
        Observer searcher1 = new JdkJobSearcher1(hd);
        Observer searcher2 = new JdkJobSearcher2(hd);

        hd.setJobInfo(new BigDecimal(20000),"深圳",24*7*3600*1000L);
        hd.setJobInfo(new BigDecimal(11000),"武汉",10*5*3600*1000L);
        hd.setJobInfo(new BigDecimal(12000),"重庆",7*5*3600*1000L);
    }
}
