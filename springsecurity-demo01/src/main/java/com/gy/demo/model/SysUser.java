package com.gy.demo.model;

import lombok.Data;

/**
 * @ClassName SysUser
 * @Description
 * @Author gaoyu
 * @Date 2020/11/19 16:36
 * @Version 1.0
 **/
@Data
public class SysUser {
    private Long id;
    private String name;
    private String password;
}
