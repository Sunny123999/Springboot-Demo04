package com.wei.demo01.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/8/29 18:19
 * @Description ：测试定时任务
 */
@Component
public class TsekTask {
    @Scheduled(cron = "0/5 * * * * *")
    public void testSchedule(){
        System.out.println(new Date());
        System.out.println("这个是每5秒执行一次!!");
    }
}
