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
public class JxyEmployee {
    private String id;
    private String name;
    private String tel;
    private String idcard;
    private String address;
    private String department;
    private String departmentOwner;
    private Date createTime;
}
