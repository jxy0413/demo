package com.example.demo.Test;

import java.util.Scanner;

/**
 * @Auther jxy
 * @Date 2020-04-14
 */
public class TestFangCheng {
    public static void main(String[] args) {
        double x1,x2,t,d;
        System.out.println("请如何a b c的值");
        Scanner s = new Scanner(System.in);
        float a = s.nextFloat();
        Scanner s1 = new Scanner(System.in);
        float b = s1.nextFloat();
        Scanner s2 = new Scanner(System.in);
        float c = s2.nextFloat();
        if(a==0){
            x1 = -c/b;
            System.out.println("root="+x1);
        }else{
            d=b*b-4*a*c;
            t=2*a;
            x1=b/t;
            if (d>=0){
                x2=Math.sqrt(d)/t;
            System.out.println("real root1:"+(x1+x2)+"real root2"+(x1-x2));
            }
            else{
                x2=Math.sqrt(-d)/t;
                System.out.println("complex root");
                System.out.println("root1="+(x1+x2));
                System.out.println("root2="+(x1-x2));
            }
        }
    }
}
