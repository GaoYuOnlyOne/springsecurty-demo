package com.gy.demo.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @ClassName SecurityConfig
 * @Description
 * @Author gaoyu
 * @Date 2020/11/19 17:17
 * @Version 1.0
 **/
@Configuration           //配置类
@EnableWebSecurity         // 开启security服务
@EnableGlobalMethodSecurity(prePostEnabled = true)     //全局方法启用
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css/**","/js/**");
    }

    @Autowired
    private MyUserDetailService myUserDetailService;


    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .anyRequest().authenticated()
//                .antMatchers("/public").permitAll()
                .and().formLogin().loginPage("/login").defaultSuccessUrl("/success").permitAll()//设置登录页
                .and().logout().permitAll();
        // 关闭跨域
        http.csrf().disable();
    }
}
