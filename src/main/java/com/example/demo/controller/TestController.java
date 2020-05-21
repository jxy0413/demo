package com.example.demo.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.client.Hbaseclient;
import com.example.demo.client.HttpUtils;
import com.example.demo.model.User;
import com.example.demo.service.TestSerivice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther jxy
 * @Date 2020-04-12
 */
@RestController
public class TestController {
    @Autowired
    private TestSerivice serivice;
    @GetMapping("/test")
    public void test(){
        serivice.test();
    }

    @GetMapping("/testinsertUserandzhanghu")
    public void testinsertUserandzhanghu(){
        serivice.testinsertUserandzhanghu();
    }

    @GetMapping("/testinsertDepartment")
    public void testInsertDepartment(){
        serivice.testInsertDepartment();
    }

    @GetMapping("/testinsertEmployee")
    public void testinsertEmployee(){
        serivice.insertEmployee();
    }

    @GetMapping("/testLiushui")
    public void testinsertLiushui(){
        serivice.insertLiushui1();
    }
}
