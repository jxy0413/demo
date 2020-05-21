package com.example.demo.model;

import lombok.Data;
import lombok.ToString;

/**
 * @Auther jxy
 * @Date 2020-04-14
 */
@Data
@ToString
public class JxyUser {
    private String id;
    private String name;
    private String card;
    private String city;
    private String street;
    private String zhanghuId;
}
