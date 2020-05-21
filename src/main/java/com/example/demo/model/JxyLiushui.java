package com.example.demo.model;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @Auther jxy
 * @Date 2020-04-14
 */
@Data
@ToString
public class JxyLiushui {
    private String id;
    private String employeeId;
    private String zhanghuId;
    private int operate;
    private Date operateTime;
}
