package com.gy.demo.service.impl;

import com.gy.demo.mapper.UserMapper;
import com.gy.demo.model.SysUser;
import com.gy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserService
 * @Description
 * @Author gaoyu
 * @Date 2020/11/19 16:27
 * @Version 1.0
 **/
@Service("userService2")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public SysUser selectByName(String userName) {
        SysUser sysUser = SysUser.builder().name(userName).build();
        return userMapper.selectOne(sysUser);
    }
}
