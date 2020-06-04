package com.example.demo.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Auther jxy
 * @Date 2020-06-01
 */
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception{
         //定制请求的授权规则
         http.authorizeRequests().antMatchers("/").permitAll().
                 antMatchers("/level1/**").hasRole("VIP1").
                 antMatchers("/level2/**").hasRole("VIP2").
                 antMatchers("/level3/**").hasRole("VIP3");
         //开启自动配置的登录功能
         http.formLogin().usernameParameter("user").passwordParameter("pwd")
                 .loginPage("/userlogin");


         //开启自动配置的注销功能
         http.logout().logoutSuccessUrl("/");
         //用户注销 访问/logout  清空session   //注销成功访问首页
         //注销成功返回 /login?logout 页面

        //开启记住我的功能
        //登陆成功后 带上这个cookie 只要面登陆
        http.rememberMe().rememberMeParameter("remeber");

    }

    //定义认证规则
    @Override
    protected void configure(AuthenticationManagerBuilder auth)throws Exception{
//        auth.inMemoryAuthentication().
//                withUser("zhangsan").password("123456").roles("VIP1","VIP2").and().
//                withUser("lisi").password("123456").roles("VIP1","VIP3").and();

        auth.inMemoryAuthentication().passwordEncoder(new MyPasswordEncoder()).
                withUser("lisi").password("123456").roles("VIP1","VIP3").and().
                withUser("zhangsan").password("123456").roles("VIP1","VIP2");
    }
}
