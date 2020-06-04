package com.example.demo.service;



import org.springframework.jdbc.support.incrementer.HsqlMaxValueIncrementer;

import java.util.*;

/**
 * @Auther jxy
 * @Date 2020-05-27
 */
public class TestMap {
    public static String getMapToString(Map<String,Object> map){
        Set<String> keySet = map.keySet();
        //将set集合转换为数组
        String[] keyArray = keySet.toArray(new String[keySet.size()]);
        //给数组排序(升序)
        Arrays.sort(keyArray);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < keyArray.length; i++) {
            // 参数值为空，则不参与签名 这个方法trim()是去空格
            if (map.get(keyArray[i]).toString().trim().length() > 0) {
                sb.append(keyArray[i]).append("=").append(map.get(keyArray[i]).toString().trim());
            }
            if(i != keyArray.length-1){
                sb.append("&");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        HashMap map  = new HashMap();
        map.put("jia","shi");
        map.put("sun","wnag");
        String mapToString = getMapToString(map);
        System.out.println(mapToString);
    }
}
