package com.gy.demo.service.impl;

import com.gy.demo.mapper.RoleMapper;
import com.gy.demo.mapper.UserMapper;
import com.gy.demo.model.SysRole;
import com.gy.demo.model.SysUser;
import com.gy.demo.service.RoleService;
import com.gy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName UserService
 * @Description
 * @Author gaoyu
 * @Date 2020/11/19 16:27
 * @Version 1.0
 **/
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public SysRole selectById(Long roleId) {
        return roleMapper.selectById(roleId);
    }
}
