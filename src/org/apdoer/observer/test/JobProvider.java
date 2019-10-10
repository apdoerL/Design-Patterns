package org.apdoer.observer.test;

import org.apdoer.observer.model.HeadHunting;
import org.apdoer.observer.model.JobSearcher;
import org.apdoer.observer.model.JobSearcher1;
import org.apdoer.observer.model.JobSearcher2;
import org.apdoer.observer.observer.Observer;

import java.math.BigDecimal;

/**
 * 提供职位
 * @author apdoer
 * @version 1.0
 * @date 2019/10/9 17:08
 */
public class JobProvider {

    public static void main(String[] args) {
        HeadHunting hd = new HeadHunting();
        Observer searcher = new JobSearcher(hd);
        Observer searcher1 = new JobSearcher1(hd);
        Observer searcher2 = new JobSearcher2(hd);

        hd.setJobInfo(new BigDecimal(20000),"深圳",24*7*3600*1000L);
        hd.setJobInfo(new BigDecimal(11000),"杭州",10*5*3600*1000L);
        hd.setJobInfo(new BigDecimal(12000),"长沙",7*5*3600*1000L);
    }
}
