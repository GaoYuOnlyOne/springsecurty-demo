package com.gy.demo.config.security;

import com.gy.demo.model.SysRole;
import com.gy.demo.model.SysUser;
import com.gy.demo.model.SysUserRole;
import com.gy.demo.service.RoleService;
import com.gy.demo.service.UserRoleService;
import com.gy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @ClassName MyUserDetailService
 * @Description
 * @Author gaoyu
 * @Date 2020/11/19 16:55
 * @Version 1.0
 **/
@Service
public class MyUserDetailService implements UserDetailsService {
    @Qualifier("userService2")
    @Autowired
    private UserService userService;

    @Autowired
    private UserRoleService userRoleService;

    @Autowired
    private RoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        // 获取授权的列表
        List<GrantedAuthority> authorities = new ArrayList<>();
        SysUser sysUser = userService.selectByName(userName);
        if (null == sysUser){
            throw new UsernameNotFoundException("用户不存在");
        }
        List<SysUserRole> userRoleList = userRoleService.selectListByUserId(sysUser.getId());
        for (SysUserRole sysUserRole : userRoleList) {
            SysRole sysRole = roleService.selectById(sysUserRole.getRoleId());
            // 添加简单的角色
            authorities.add(new SimpleGrantedAuthority(sysRole.getName()));
        }
        return new User(sysUser.getName(),sysUser.getPassword(),authorities);
    }
}
