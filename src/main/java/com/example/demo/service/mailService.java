package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @Auther jxy
 * @Date 2020-06-01
 */
@Service
public class mailService {
    @Autowired
    private JavaMailSenderImpl mailSender;

    public void simpleMail(){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        //邮件设置
        mailMessage.setSubject("通知今晚开会");
        mailMessage.setText("今晚7：30开会");

        mailMessage.setTo("15011006250@163.com");
        mailMessage.setFrom("964078918@qq.com");

        mailSender.send(mailMessage);
    }

    public void mimeMail()throws Exception{
        //1、创建一个复杂的消息邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);

        //邮件设置
        helper.setSubject("今晚-通知开会");
        helper.setText("<b style='color:red'>今天 7：30开会</b>",true);

        helper.setTo("15011006250@163.com");
        helper.setFrom("964078918@qq.com");

        //上传文件
        helper.addAttachment("1.jpg",new File("/Users/jiaxiangyu/Desktop/学习公众号/springboot学习/1586046918518.jpg"));
        helper.addAttachment("1.jpg",new File("/Users/jiaxiangyu/Desktop/学习公众号/springboot学习/WechatIMG22.jpeg"));

        mailSender.send(mimeMessage);

    }
}
