package com.gy.demo.service;

import com.gy.demo.model.SysUser;

/**
 * @ClassName UserService
 * @Description
 * @Author gaoyu
 * @Date 2020/11/19 16:26
 * @Version 1.0
 **/
public interface UserService {
    SysUser selectByName(String userName);
}
