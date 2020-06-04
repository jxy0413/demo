package com.example.demo.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @Auther jxy
 * @Date 2020-06-01
 */
@Service
public class ScheduledService {
    /**
     * second , minute, hour, day of month, month, day of week.
     * 0 * * * * MON-FRI
     */
    @Scheduled(cron ="0 * * * * MON-FRI")
    public void hello(){
        System.out.println("hello");
    }
}
