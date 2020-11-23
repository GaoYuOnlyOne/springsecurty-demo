package com.gy.demo.controller;

import com.gy.demo.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName UserController
 * @Description
 * @Author gaoyu
 * @Date 2020/11/19 16:24
 * @Version 1.0
 **/
@Controller
@Api(value = "")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String toLogin(){
        return "login";
    }


    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/success")
    public String success(){
        return "success";
    }

    @RequestMapping("/admin")
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Map<String, String> printAdmin() {
        Map<String,String> map = new HashMap<>();
        map.put("data","如果你看见这句话，说明你有ROLE_ADMIN角色");
        return map;
    }

}
