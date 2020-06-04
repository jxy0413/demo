package com.example.demo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Auther jxy
 * @Date 2020-06-01
 */
@Service
public class AsyncService {
    //告诉Spring这是一个异步方法
    @Async
    public void hello(){
        try {
            Thread.sleep(3000);
            System.out.println("数据处理中");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
