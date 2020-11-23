package com.gy.demo.service.impl;

import com.gy.demo.mapper.UserMapper;
import com.gy.demo.mapper.UserRoleMapper;
import com.gy.demo.model.SysUser;
import com.gy.demo.model.SysUserRole;
import com.gy.demo.service.UserRoleService;
import com.gy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserService
 * @Description
 * @Author gaoyu
 * @Date 2020/11/19 16:27
 * @Version 1.0
 **/
@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public List<SysUserRole> selectListByUserId(Long userId) {
        SysUserRole sysUserRole = SysUserRole.builder().userId(userId).build();
        return userRoleMapper.select(sysUserRole);
    }
}
