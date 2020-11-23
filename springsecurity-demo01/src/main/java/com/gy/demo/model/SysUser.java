package com.gy.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName SysUser
 * @Description
 * @Author gaoyu
 * @Date 2020/11/19 16:36
 * @Version 1.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sys_user")
public class SysUser {
    @Id
    private Long id;
    private String name;
    private String password;
}
