package com.gy.demo.service;

import com.gy.demo.model.SysUser;
import com.gy.demo.model.SysUserRole;

import java.util.List;

/**
 * @ClassName UserService
 * @Description
 * @Author gaoyu
 * @Date 2020/11/19 16:26
 * @Version 1.0
 **/
public interface UserRoleService {
    List<SysUserRole> selectListByUserId(Long id);
}
