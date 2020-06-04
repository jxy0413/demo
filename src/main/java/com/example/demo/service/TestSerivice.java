package com.example.demo.service;

import com.example.demo.mapper.TestMapper;
import com.example.demo.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * @Auther jxy
 * @Date 2020-04-14
 */
@Service
public class TestSerivice {
//    @Autowired
//    private TestMapper testMapper;
//
//    public void test() {
////       //生成100个支行
////        for(int i=0;i<100;i++){
////            JxyZhihang jxyZhihang = new JxyZhihang();
////            jxyZhihang.setId(UUID.randomUUID().toString());
////            jxyZhihang.setName(getRandomString(10));
////            testMapper.insertzhihang(jxyZhihang);
////            JxyBank jxyBank = new JxyBank();
////            jxyBank.setId(UUID.randomUUID().toString());
////            jxyBank.setName("yunshanyinhang");
////            jxyBank.setZhihangId(jxyZhihang.getId());
////            testMapper.insertbank(jxyBank);
////        }
//    }
//
//
//
//    public static String getRandomString(int length){
//        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
//        Random random=new Random();
//        StringBuffer sb=new StringBuffer();
//        for(int i=0;i<length;i++){
//            int number=random.nextInt(62);
//            sb.append(str.charAt(number));
//        }
//        return sb.toString();
//    }
//
//    public static String getRandomId(int length){
//        String str="0123456789012345678901234567890123456789012345678901234567890123456789";
//        Random random=new Random();
//        StringBuffer sb=new StringBuffer();
//        for(int i=0;i<length;i++){
//            int number=random.nextInt(62);
//            sb.append(str.charAt(number));
//        }
//        return sb.toString();
//    }
//
//    public void testinsertUserandzhanghu() {
//        for(int i=0;i<1000;i++){
//            JxyUser jxyUser = new JxyUser();
//            jxyUser.setId(UUID.randomUUID().toString());
//            jxyUser.setName(getRandomString(5));
//            jxyUser.setCard(getRandomId(18));
//            jxyUser.setCity(getRandomString(5));
//            jxyUser.setStreet(getRandomString(5));
//            jxyUser.setZhanghuId(UUID.randomUUID().toString());
//            testMapper.insertUser(jxyUser);
//            Jxyzhanghu jxyzhanghu =new Jxyzhanghu();
//            jxyzhanghu.setId(jxyUser.getZhanghuId());
//            Random random = new Random();
//            int k = random.nextInt(100);
//            if(k%2==0){
//                jxyzhanghu.setLeixing("chuxu");
//            }else{
//                jxyzhanghu.setLeixing("zhipiao");
//            }
//            int i1 = random.nextInt(1000000);
//            jxyzhanghu.setMoney(i1);
//            testMapper.insertZhanghu(jxyzhanghu);
//        }
//    }
//
//    public void testInsertDepartment() {
//        for(int i=0;i<100;i++) {
//            JxyDepartment jxyDepartment = new JxyDepartment();
//            jxyDepartment.setId(UUID.randomUUID().toString());
//            jxyDepartment.setName(getRandomString(5));
//            List<JxyZhihang> list = testMapper.getListZhihang();
//            Random random = new Random();
//            jxyDepartment.setZhihang(list.get(random.nextInt(100)).getName());
//            jxyDepartment.setOwner(getRandomString(5));
//            testMapper.insertDepartment(jxyDepartment);
//        }
//    }
//
//
//    public void insertEmployee() {
//        for (int i = 0; i < 1000; i++) {
//            JxyEmployee jxyEmployee = new JxyEmployee();
//            jxyEmployee.setId(UUID.randomUUID().toString());
//            jxyEmployee.setName(getRandomString(5));
//            jxyEmployee.setTel(getRandomId(11));
//            jxyEmployee.setIdcard(getRandomId(18));
//            jxyEmployee.setAddress(getRandomString(8));
//            List<JxyDepartment> list = testMapper.getListDepartment();
//            Random random = new Random();
//            String name = list.get(random.nextInt(100)).getName();
//            jxyEmployee.setDepartment(name);
//            JxyDepartment jxyDepartment = testMapper.getDepartmentByName(name);
//            jxyEmployee.setDepartmentOwner(jxyDepartment.getOwner());
//            jxyEmployee.setCreateTime(new Date());
//            testMapper.insertEmployee(jxyEmployee);
//        }
//    }
//
//    public void insertLiushui() {
//        for(int k=0;k<1000000;k++) {
//            JxyLiushui jxyLiushui = new JxyLiushui();
//            List<JxyEmployee> lists = testMapper.getEmployeeList();
//            Random random = new Random();
//            jxyLiushui.setEmployeeId(lists.get(random.nextInt(1000)).getId());
//            List<Jxyzhanghu> listZhanghu = testMapper.getListZhanghu();
//            Jxyzhanghu jxyzhanghu = listZhanghu.get(random.nextInt(1000));
//            jxyLiushui.setZhanghuId(jxyzhanghu.getId());
//            int i = random.nextInt(100);
//            if (i % 2 == 0) {
//                System.out.println("jia");
//                int i1 = random.nextInt(10000);
//                jxyLiushui.setOperate(i1);
//                int money = jxyzhanghu.getMoney();
//                int newmoney = money + i1;
//                jxyzhanghu.setMoney(newmoney);
//                testMapper.updatezhanghu(jxyzhanghu);
//            }
//            else
//            {
//                int i2 = random.nextInt(10000);
//                jxyLiushui.setOperate(-i2);
//                int money = jxyzhanghu.getMoney();
//                int newmoney = money - i2;
//                jxyzhanghu.setMoney(newmoney);
//                testMapper.updatezhanghu(jxyzhanghu);
//            }
//            jxyLiushui.setOperateTime(new Date());
//            testMapper.insertLiushui(jxyLiushui);
//        }
//    }
//
//
//    public void insertLiushui1() {
//        for(int k=0;k<1000000;k++) {
//            JxyLiushui jxyLiushui = new JxyLiushui();
//            jxyLiushui.setEmployeeId(UUID.randomUUID().toString());
//            jxyLiushui.setZhanghuId(UUID.randomUUID().toString());
//            Random random = new Random();
//            int i = random.nextInt(10);
//            if (i % 2 == 0) {
//                int i1 = random.nextInt(10000);
//                jxyLiushui.setOperate(i1);
//            } else {
//                int i2 = random.nextInt(10000);
//                jxyLiushui.setOperate(-i2);
//            }
//            jxyLiushui.setOperateTime(new Date());
//            testMapper.insertLiushui(jxyLiushui);
//        }
//    }

}

